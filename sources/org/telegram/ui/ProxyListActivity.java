package org.telegram.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class ProxyListActivity extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public int A;
    public int B;
    public NumberTextView C;
    public final ArrayList D;
    public final ArrayList E;
    public boolean F;
    public c11 a;
    public org.telegram.ui.Components.zk0 b;
    public int c;
    private int callsRow;
    public boolean d;
    public boolean e;
    public int f;
    public int h;
    public int n;
    private int proxyAddRow;
    public int r;
    public int s;
    private int useProxyRow;
    public int v;
    public int w;
    public int x;
    public int y;

    public ProxyListActivity() {
        super(null);
        this.D = new ArrayList();
        this.E = new ArrayList();
    }

    public static void U(ProxyListActivity proxyListActivity, View view, int i10) {
        ArrayList arrayList = proxyListActivity.E;
        if (i10 == proxyListActivity.useProxyRow) {
            if (SharedConfig.currentProxy == null) {
                if (arrayList.isEmpty()) {
                    proxyListActivity.presentFragment(new j11());
                    return;
                }
                SharedConfig.currentProxy = (SharedConfig.ProxyInfo) arrayList.get(0);
                if (!proxyListActivity.d) {
                    MessagesController.getGlobalMainSettings();
                    SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                    edit.putString("proxy_ip", SharedConfig.currentProxy.address);
                    edit.putString("proxy_pass", SharedConfig.currentProxy.password);
                    edit.putString("proxy_user", SharedConfig.currentProxy.username);
                    edit.putInt("proxy_port", SharedConfig.currentProxy.port);
                    edit.putString("proxy_secret", SharedConfig.currentProxy.secret);
                    edit.commit();
                }
            }
            proxyListActivity.d = !proxyListActivity.d;
            proxyListActivity.c0(true);
            MessagesController.getGlobalMainSettings();
            ((org.telegram.ui.Cells.p8) view).setChecked(proxyListActivity.d);
            if (!proxyListActivity.d) {
                org.telegram.ui.Components.lk0 lk0Var = (org.telegram.ui.Components.lk0) proxyListActivity.b.K(proxyListActivity.callsRow);
                if (lk0Var != null) {
                    ((org.telegram.ui.Cells.p8) lk0Var.a).setChecked(false);
                }
                proxyListActivity.e = false;
            }
            SharedPreferences.Editor edit2 = MessagesController.getGlobalMainSettings().edit();
            edit2.putBoolean("proxy_enabled", proxyListActivity.d);
            edit2.commit();
            boolean z10 = proxyListActivity.d;
            SharedConfig.ProxyInfo proxyInfo = SharedConfig.currentProxy;
            ConnectionsManager.setProxySettings(z10, proxyInfo.address, proxyInfo.port, proxyInfo.username, proxyInfo.password, proxyInfo.secret);
            NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
            int i11 = NotificationCenter.proxySettingsChanged;
            globalInstance.removeObserver(proxyListActivity, i11);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
            NotificationCenter.getGlobalInstance().addObserver(proxyListActivity, i11);
            for (int i12 = proxyListActivity.r; i12 < proxyListActivity.s; i12++) {
                org.telegram.ui.Components.lk0 lk0Var2 = (org.telegram.ui.Components.lk0) proxyListActivity.b.K(i12);
                if (lk0Var2 != null) {
                    ((d11) lk0Var2.a).b();
                }
            }
            return;
        }
        if (i10 == proxyListActivity.w) {
            boolean z11 = !SharedConfig.proxyRotationEnabled;
            SharedConfig.proxyRotationEnabled = z11;
            ((org.telegram.ui.Cells.p8) view).setChecked(z11);
            SharedConfig.saveConfig();
            proxyListActivity.c0(true);
            return;
        }
        if (i10 == proxyListActivity.callsRow) {
            boolean z12 = !proxyListActivity.e;
            proxyListActivity.e = z12;
            ((org.telegram.ui.Cells.p8) view).setChecked(z12);
            SharedPreferences.Editor edit3 = MessagesController.getGlobalMainSettings().edit();
            edit3.putBoolean("proxy_enabled_calls", proxyListActivity.e);
            edit3.commit();
            return;
        }
        if (i10 < proxyListActivity.r || i10 >= proxyListActivity.s) {
            if (i10 == proxyListActivity.proxyAddRow) {
                proxyListActivity.presentFragment(new j11());
                return;
            }
            if (i10 == proxyListActivity.B) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(proxyListActivity.getParentActivity());
                alertDialog$Builder.a.P = LocaleController.getString(R.string.DeleteAllProxiesConfirm);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.a.N = LocaleController.getString(R.string.DeleteProxyTitle);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new z01(proxyListActivity));
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                proxyListActivity.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
                    return;
                }
                return;
            }
            return;
        }
        if (!proxyListActivity.D.isEmpty()) {
            proxyListActivity.a.G(i10);
            return;
        }
        SharedConfig.ProxyInfo proxyInfo2 = (SharedConfig.ProxyInfo) arrayList.get(i10 - proxyListActivity.r);
        proxyListActivity.d = true;
        SharedPreferences.Editor edit4 = MessagesController.getGlobalMainSettings().edit();
        edit4.putString("proxy_ip", proxyInfo2.address);
        edit4.putString("proxy_pass", proxyInfo2.password);
        edit4.putString("proxy_user", proxyInfo2.username);
        edit4.putInt("proxy_port", proxyInfo2.port);
        edit4.putString("proxy_secret", proxyInfo2.secret);
        edit4.putBoolean("proxy_enabled", proxyListActivity.d);
        if (!proxyInfo2.secret.isEmpty()) {
            proxyListActivity.e = false;
            edit4.putBoolean("proxy_enabled_calls", false);
        }
        edit4.commit();
        SharedConfig.currentProxy = proxyInfo2;
        for (int i13 = proxyListActivity.r; i13 < proxyListActivity.s; i13++) {
            org.telegram.ui.Components.lk0 lk0Var3 = (org.telegram.ui.Components.lk0) proxyListActivity.b.K(i13);
            if (lk0Var3 != null) {
                d11 d11Var = (d11) lk0Var3.a;
                d11Var.setChecked(d11Var.d == proxyInfo2);
                d11Var.b();
            }
        }
        proxyListActivity.c0(false);
        org.telegram.ui.Components.lk0 lk0Var4 = (org.telegram.ui.Components.lk0) proxyListActivity.b.K(proxyListActivity.useProxyRow);
        if (lk0Var4 != null) {
            ((org.telegram.ui.Cells.p8) lk0Var4.a).setChecked(true);
        }
        boolean z13 = proxyListActivity.d;
        SharedConfig.ProxyInfo proxyInfo3 = SharedConfig.currentProxy;
        ConnectionsManager.setProxySettings(z13, proxyInfo3.address, proxyInfo3.port, proxyInfo3.username, proxyInfo3.password, proxyInfo3.secret);
    }

    public static /* synthetic */ void V(ProxyListActivity proxyListActivity) {
        ArrayList arrayList = proxyListActivity.E;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            SharedConfig.deleteProxy((SharedConfig.ProxyInfo) obj);
        }
        proxyListActivity.e = false;
        proxyListActivity.d = false;
        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
        int i11 = NotificationCenter.proxySettingsChanged;
        globalInstance.removeObserver(proxyListActivity, i11);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
        NotificationCenter.getGlobalInstance().addObserver(proxyListActivity, i11);
        proxyListActivity.c0(true);
        c11 c11Var = proxyListActivity.a;
        if (c11Var != null) {
            c11Var.n(proxyListActivity.useProxyRow, 0);
            proxyListActivity.a.n(proxyListActivity.callsRow, 0);
            proxyListActivity.a.F();
        }
    }

    public final void c0(boolean z10) {
        c11 c11Var;
        final boolean z11;
        this.f = 1;
        this.useProxyRow = 0;
        if (!this.d || SharedConfig.currentProxy == null || SharedConfig.proxyList.size() <= 1) {
            this.w = -1;
            this.x = -1;
            this.y = -1;
        } else {
            int i10 = this.f;
            int i11 = i10 + 1;
            this.f = i11;
            this.w = i10;
            if (SharedConfig.proxyRotationEnabled) {
                this.x = i11;
                this.f = i10 + 3;
                this.y = i10 + 2;
            } else {
                this.x = -1;
                this.y = -1;
            }
        }
        if (this.y == -1) {
            int i12 = this.f;
            this.f = i12 + 1;
            this.h = i12;
        } else {
            this.h = -1;
        }
        int i13 = this.f;
        this.f = i13 + 1;
        this.n = i13;
        ArrayList arrayList = this.E;
        if (z10) {
            arrayList.clear();
            arrayList.addAll(SharedConfig.proxyList);
            if (this.F) {
                z11 = false;
            } else {
                int size = arrayList.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList.get(i14);
                    i14++;
                    SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) obj;
                    if (proxyInfo.checking || proxyInfo.availableCheckTime == 0) {
                        z11 = true;
                        break;
                    }
                }
                z11 = false;
                if (!z11) {
                    this.F = true;
                }
            }
            Collections.sort(arrayList, new Comparator() { // from class: org.telegram.ui.a11
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    SharedConfig.ProxyInfo proxyInfo2 = (SharedConfig.ProxyInfo) obj2;
                    SharedConfig.ProxyInfo proxyInfo3 = (SharedConfig.ProxyInfo) obj3;
                    SharedConfig.ProxyInfo proxyInfo4 = SharedConfig.currentProxy;
                    long j10 = proxyInfo4 == proxyInfo2 ? -200000L : 0L;
                    if (!proxyInfo2.available) {
                        j10 += 100000;
                    }
                    long j11 = proxyInfo4 == proxyInfo3 ? -200000L : 0L;
                    if (!proxyInfo3.available) {
                        j11 += 100000;
                    }
                    boolean z12 = z11;
                    return Long.compare((!z12 || proxyInfo2 == proxyInfo4) ? j10 + proxyInfo2.ping : SharedConfig.proxyList.indexOf(proxyInfo2) * 10000, (!z12 || proxyInfo3 == SharedConfig.currentProxy) ? proxyInfo3.ping + j11 : SharedConfig.proxyList.indexOf(proxyInfo3) * 10000);
                }
            });
        }
        if (arrayList.isEmpty()) {
            this.r = -1;
            this.s = -1;
        } else {
            int i15 = this.f;
            this.r = i15;
            int size2 = arrayList.size() + i15;
            this.f = size2;
            this.s = size2;
        }
        int i16 = this.f;
        this.proxyAddRow = i16;
        this.f = i16 + 2;
        this.v = i16 + 1;
        SharedConfig.ProxyInfo proxyInfo2 = SharedConfig.currentProxy;
        if (proxyInfo2 == null || proxyInfo2.secret.isEmpty()) {
            boolean z12 = this.callsRow == -1;
            int i17 = this.f;
            this.callsRow = i17;
            this.f = i17 + 2;
            this.A = i17 + 1;
            if (!z10 && z12) {
                this.a.m(this.v);
                this.a.s(this.v + 1, 2);
            }
        } else {
            boolean z13 = this.callsRow != -1;
            this.callsRow = -1;
            this.A = -1;
            if (!z10 && z13) {
                this.a.m(this.v);
                this.a.t(this.v + 1, 2);
            }
        }
        if (arrayList.size() >= 10) {
            int i18 = this.f;
            this.f = i18 + 1;
            this.B = i18;
        } else {
            this.B = -1;
        }
        int size3 = arrayList.size();
        for (int i19 = 0; i19 < size3; i19++) {
            SharedConfig.ProxyInfo proxyInfo3 = (SharedConfig.ProxyInfo) arrayList.get(i19);
            if (!proxyInfo3.checking && SystemClock.elapsedRealtime() - proxyInfo3.availableCheckTime >= 120000) {
                proxyInfo3.checking = true;
                proxyInfo3.proxyCheckPingId = ConnectionsManager.getInstance(this.currentAccount).checkProxy(proxyInfo3.address, proxyInfo3.port, proxyInfo3.username, proxyInfo3.password, proxyInfo3.secret, new dl0(proxyInfo3, 13));
            }
        }
        if (!z10 || (c11Var = this.a) == null) {
            return;
        }
        c11Var.l();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        org.telegram.ui.Cells.pa.x(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.ProxySettings));
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).I0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setActionBarMenuOnItemClick(new pb0(this, 19));
        this.a = new c11(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.a7, false));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(context, null);
        this.b = zk0Var;
        zk0Var.p1();
        this.actionBar.setAdaptiveBackground(this.b);
        ((f2.l) this.b.getItemAnimator()).C = false;
        ((f2.l) this.b.getItemAnimator()).o = org.telegram.ui.Components.er.f;
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setLayoutManager(new f2.k0(1, false));
        frameLayout2.addView(this.b, h7.z5.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new i(this, 28));
        this.b.setOnItemLongClickListener(new z01(this));
        org.telegram.ui.ActionBar.z j10 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.C = numberTextView;
        numberTextView.setTextSize(18);
        this.C.setTypeface(AndroidUtilities.bold());
        this.C.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.y8, false));
        j10.addView(this.C, h7.z5.m(1.0f, 0, -1, 72, 0, 0));
        this.C.setOnTouchListener(new kh.e(2));
        j10.g(1, R.drawable.msg_share, AndroidUtilities.dp(54.0f)).setContentDescription(LocaleController.getString(R.string.StickersShare));
        j10.g(0, R.drawable.msg_delete, AndroidUtilities.dp(54.0f)).setContentDescription(LocaleController.getString(R.string.Delete));
        this.actionBar.setActionBarMenuOnItemClick(new b11(this, context));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.lk0 lk0Var;
        SharedConfig.ProxyInfo proxyInfo;
        org.telegram.ui.Components.lk0 lk0Var2;
        boolean z10 = false;
        if (i10 == NotificationCenter.proxyChangedByRotation) {
            this.b.M(new l3(this, 7));
            c0(false);
            return;
        }
        if (i10 == NotificationCenter.proxySettingsChanged) {
            c0(true);
            return;
        }
        int i12 = NotificationCenter.didUpdateConnectionState;
        ArrayList arrayList = this.E;
        if (i10 == i12) {
            int connectionState = ConnectionsManager.getInstance(i11).getConnectionState();
            if (this.c != connectionState) {
                this.c = connectionState;
                if (this.b == null || (proxyInfo = SharedConfig.currentProxy) == null) {
                    return;
                }
                int indexOf = arrayList.indexOf(proxyInfo);
                if (indexOf >= 0 && (lk0Var2 = (org.telegram.ui.Components.lk0) this.b.K(indexOf + this.r)) != null) {
                    ((d11) lk0Var2.a).b();
                }
                if (this.c == 3) {
                    c0(true);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.proxyCheckDone || this.b == null) {
            return;
        }
        int indexOf2 = arrayList.indexOf((SharedConfig.ProxyInfo) objArr[0]);
        if (indexOf2 >= 0 && (lk0Var = (org.telegram.ui.Components.lk0) this.b.K(indexOf2 + this.r)) != null) {
            ((d11) lk0Var.a).b();
        }
        if (!this.F) {
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                SharedConfig.ProxyInfo proxyInfo2 = (SharedConfig.ProxyInfo) obj;
                if (proxyInfo2.checking || proxyInfo2.availableCheckTime == 0) {
                    z10 = true;
                    break;
                }
            }
            if (!z10) {
                this.F = true;
            }
        }
        if (z10) {
            return;
        }
        c0(true);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 16, new Class[]{org.telegram.ui.Cells.x9.class, org.telegram.ui.Cells.p8.class, org.telegram.ui.Cells.j4.class, d11.class}, null, null, null, org.telegram.ui.ActionBar.g6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.k0, null, null, org.telegram.ui.ActionBar.g6.d7));
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{d11.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 262156, new Class[]{d11.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.s6));
        int i11 = org.telegram.ui.ActionBar.g6.z6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 262156, new Class[]{d11.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 262156, new Class[]{d11.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.w6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 262156, new Class[]{d11.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 8, new Class[]{d11.class}, new String[]{"checkImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 32, new Class[]{org.telegram.ui.Cells.x8.class}, null, null, null, org.telegram.ui.ActionBar.g6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        if (this.D.isEmpty()) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        this.a.F();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onDialogDismiss(Dialog dialog) {
        DownloadController.getInstance(this.currentAccount).checkAutodownloadSettings();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        SharedConfig.loadProxyList();
        this.c = ConnectionsManager.getInstance(this.currentAccount).getConnectionState();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.proxyChangedByRotation);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.proxySettingsChanged);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.proxyCheckDone);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didUpdateConnectionState);
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        this.d = globalMainSettings.getBoolean("proxy_enabled", false) && !SharedConfig.proxyList.isEmpty();
        this.e = globalMainSettings.getBoolean("proxy_enabled_calls", false);
        c0(true);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.proxyChangedByRotation);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.proxySettingsChanged);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.proxyCheckDone);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didUpdateConnectionState);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        c11 c11Var = this.a;
        if (c11Var != null) {
            c11Var.l();
        }
    }
}
