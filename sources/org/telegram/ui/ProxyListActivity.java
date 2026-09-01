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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public class ProxyListActivity extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public int B;
    public int C;
    public NumberTextView D;
    public final ArrayList E;
    public final ArrayList F;
    public boolean G;
    public q11 a;
    public org.telegram.ui.Components.tl0 b;
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
        this.E = new ArrayList();
        this.F = new ArrayList();
    }

    public static void U(ProxyListActivity proxyListActivity, View view, int i10) {
        ArrayList arrayList = proxyListActivity.F;
        if (i10 == proxyListActivity.useProxyRow) {
            if (SharedConfig.currentProxy == null) {
                if (arrayList.isEmpty()) {
                    proxyListActivity.presentFragment(new z11());
                    return;
                }
                SharedConfig.currentProxy = (SharedConfig.ProxyInfo) arrayList.get(0);
                if (!proxyListActivity.d) {
                    SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                    SharedConfig.currentProxy.settings.f(edit);
                    edit.commit();
                }
            }
            proxyListActivity.d = !proxyListActivity.d;
            proxyListActivity.c0(true);
            MessagesController.getGlobalMainSettings();
            ((org.telegram.ui.Cells.s8) view).setChecked(proxyListActivity.d);
            if (!proxyListActivity.d) {
                org.telegram.ui.Components.fl0 fl0Var = (org.telegram.ui.Components.fl0) proxyListActivity.b.K(proxyListActivity.callsRow);
                if (fl0Var != null) {
                    ((org.telegram.ui.Cells.s8) fl0Var.a).setChecked(false);
                }
                proxyListActivity.e = false;
            }
            SharedPreferences.Editor edit2 = MessagesController.getGlobalMainSettings().edit();
            edit2.putBoolean("proxy_enabled", proxyListActivity.d);
            edit2.commit();
            ConnectionsManager.setProxySettings(proxyListActivity.d, SharedConfig.currentProxy.settings);
            NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
            int i11 = NotificationCenter.proxySettingsChanged;
            globalInstance.removeObserver(proxyListActivity, i11);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
            NotificationCenter.getGlobalInstance().addObserver(proxyListActivity, i11);
            for (int i12 = proxyListActivity.r; i12 < proxyListActivity.s; i12++) {
                org.telegram.ui.Components.fl0 fl0Var2 = (org.telegram.ui.Components.fl0) proxyListActivity.b.K(i12);
                if (fl0Var2 != null) {
                    ((r11) fl0Var2.a).b();
                }
            }
            return;
        }
        if (i10 == proxyListActivity.w) {
            boolean z4 = !SharedConfig.proxyRotationEnabled;
            SharedConfig.proxyRotationEnabled = z4;
            ((org.telegram.ui.Cells.s8) view).setChecked(z4);
            SharedConfig.saveConfig();
            proxyListActivity.c0(true);
            return;
        }
        if (i10 == proxyListActivity.callsRow) {
            boolean z10 = !proxyListActivity.e;
            proxyListActivity.e = z10;
            ((org.telegram.ui.Cells.s8) view).setChecked(z10);
            SharedPreferences.Editor edit3 = MessagesController.getGlobalMainSettings().edit();
            edit3.putBoolean("proxy_enabled_calls", proxyListActivity.e);
            edit3.commit();
            return;
        }
        if (i10 < proxyListActivity.r || i10 >= proxyListActivity.s) {
            if (i10 == proxyListActivity.proxyAddRow) {
                proxyListActivity.presentFragment(new z11());
                return;
            }
            if (i10 == proxyListActivity.C) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(proxyListActivity.getParentActivity());
                alertDialog$Builder.a.Q = LocaleController.getString(R.string.DeleteAllProxiesConfirm);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.a.O = LocaleController.getString(R.string.DeleteProxyTitle);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new n11(proxyListActivity));
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                proxyListActivity.showDialog(d2Var);
                TextView textView = (TextView) d2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.q7, false));
                    return;
                }
                return;
            }
            return;
        }
        if (!proxyListActivity.E.isEmpty()) {
            proxyListActivity.a.G(i10);
            return;
        }
        SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) arrayList.get(i10 - proxyListActivity.r);
        proxyListActivity.d = true;
        SharedPreferences.Editor edit4 = MessagesController.getGlobalMainSettings().edit();
        proxyInfo.settings.f(edit4);
        edit4.putBoolean("proxy_enabled", proxyListActivity.d);
        if (!proxyInfo.settings.f.isEmpty()) {
            proxyListActivity.e = false;
            edit4.putBoolean("proxy_enabled_calls", false);
        }
        edit4.commit();
        SharedConfig.currentProxy = proxyInfo;
        for (int i13 = proxyListActivity.r; i13 < proxyListActivity.s; i13++) {
            org.telegram.ui.Components.fl0 fl0Var3 = (org.telegram.ui.Components.fl0) proxyListActivity.b.K(i13);
            if (fl0Var3 != null) {
                r11 r11Var = (r11) fl0Var3.a;
                r11Var.setChecked(r11Var.d == proxyInfo);
                r11Var.b();
            }
        }
        proxyListActivity.c0(false);
        org.telegram.ui.Components.fl0 fl0Var4 = (org.telegram.ui.Components.fl0) proxyListActivity.b.K(proxyListActivity.useProxyRow);
        if (fl0Var4 != null) {
            ((org.telegram.ui.Cells.s8) fl0Var4.a).setChecked(true);
        }
        ConnectionsManager.setProxySettings(proxyListActivity.d, SharedConfig.currentProxy.settings);
    }

    public static /* synthetic */ void V(ProxyListActivity proxyListActivity) {
        ArrayList arrayList = proxyListActivity.F;
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
        q11 q11Var = proxyListActivity.a;
        if (q11Var != null) {
            q11Var.n(proxyListActivity.useProxyRow, 0);
            proxyListActivity.a.n(proxyListActivity.callsRow, 0);
            proxyListActivity.a.F();
        }
    }

    public final void c0(boolean z4) {
        q11 q11Var;
        final boolean z10;
        SharedConfig.ProxyInfo proxyInfo;
        this.f = 1;
        this.useProxyRow = 0;
        if (!this.d || (proxyInfo = SharedConfig.currentProxy) == null || proxyInfo.settings.a == 3 || SharedConfig.proxyList.size() <= 1) {
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
        ArrayList arrayList = this.F;
        if (z4) {
            arrayList.clear();
            arrayList.addAll(SharedConfig.proxyList);
            if (this.G) {
                z10 = false;
            } else {
                int size = arrayList.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList.get(i14);
                    i14++;
                    SharedConfig.ProxyInfo proxyInfo2 = (SharedConfig.ProxyInfo) obj;
                    if (proxyInfo2.checking || proxyInfo2.availableCheckTime == 0) {
                        z10 = true;
                        break;
                    }
                }
                z10 = false;
                if (!z10) {
                    this.G = true;
                }
            }
            Collections.sort(arrayList, new Comparator() { // from class: org.telegram.ui.o11
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    SharedConfig.ProxyInfo proxyInfo3 = (SharedConfig.ProxyInfo) obj2;
                    SharedConfig.ProxyInfo proxyInfo4 = (SharedConfig.ProxyInfo) obj3;
                    SharedConfig.ProxyInfo proxyInfo5 = SharedConfig.currentProxy;
                    long j10 = proxyInfo5 == proxyInfo3 ? -200000L : 0L;
                    if (!proxyInfo3.available) {
                        j10 += 100000;
                    }
                    long j11 = proxyInfo5 == proxyInfo4 ? -200000L : 0L;
                    if (!proxyInfo4.available) {
                        j11 += 100000;
                    }
                    boolean z11 = z10;
                    return Long.compare((!z11 || proxyInfo3 == proxyInfo5) ? j10 + proxyInfo3.ping : SharedConfig.proxyList.indexOf(proxyInfo3) * 10000, (!z11 || proxyInfo4 == SharedConfig.currentProxy) ? proxyInfo4.ping + j11 : SharedConfig.proxyList.indexOf(proxyInfo4) * 10000);
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
        SharedConfig.ProxyInfo proxyInfo3 = SharedConfig.currentProxy;
        if (proxyInfo3 == null || proxyInfo3.settings.f.isEmpty()) {
            boolean z11 = this.callsRow == -1;
            int i17 = this.f;
            this.callsRow = i17;
            this.f = i17 + 2;
            this.B = i17 + 1;
            if (!z4 && z11) {
                this.a.m(this.v);
                this.a.s(this.v + 1, 2);
            }
        } else {
            boolean z12 = this.callsRow != -1;
            this.callsRow = -1;
            this.B = -1;
            if (!z4 && z12) {
                this.a.m(this.v);
                this.a.t(this.v + 1, 2);
            }
        }
        if (arrayList.size() >= 10) {
            int i18 = this.f;
            this.f = i18 + 1;
            this.C = i18;
        } else {
            this.C = -1;
        }
        int size3 = arrayList.size();
        for (int i19 = 0; i19 < size3; i19++) {
            SharedConfig.ProxyInfo proxyInfo4 = (SharedConfig.ProxyInfo) arrayList.get(i19);
            if (!proxyInfo4.checking && SystemClock.elapsedRealtime() - proxyInfo4.availableCheckTime >= 120000) {
                proxyInfo4.checking = true;
                ConnectionsManager.getInstance(this.currentAccount).checkProxy(proxyInfo4.settings, new kl0(proxyInfo4, 13));
            }
        }
        if (!z4 || (q11Var = this.a) == null) {
            return;
        }
        q11Var.l();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        yh.z(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.ProxySettings));
        org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
        if (f5Var != null && ((ActionBarLayout) f5Var).J0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setActionBarMenuOnItemClick(new ll0(this, 10));
        this.a = new q11(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.a7, false));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.tl0 tl0Var = new org.telegram.ui.Components.tl0(context, null);
        this.b = tl0Var;
        tl0Var.p1();
        this.actionBar.setAdaptiveBackground(this.b);
        ((f2.l) this.b.getItemAnimator()).C = false;
        ((f2.l) this.b.getItemAnimator()).o = org.telegram.ui.Components.pr.f;
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setLayoutManager(new f2.j0(1, false));
        frameLayout2.addView(this.b, k7.c6.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new j(this, 28));
        this.b.setOnItemLongClickListener(new n11(this));
        org.telegram.ui.ActionBar.z j10 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.D = numberTextView;
        numberTextView.setTextSize(18);
        this.D.setTypeface(AndroidUtilities.bold());
        this.D.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.y8, false));
        j10.addView(this.D, k7.c6.m(1.0f, 0, -1, 72, 0, 0));
        this.D.setOnTouchListener(new org.telegram.ui.ActionBar.s2(1));
        j10.g(1, R.drawable.msg_share, AndroidUtilities.dp(54.0f)).setContentDescription(LocaleController.getString(R.string.StickersShare));
        j10.g(0, R.drawable.msg_delete, AndroidUtilities.dp(54.0f)).setContentDescription(LocaleController.getString(R.string.Delete));
        this.actionBar.setActionBarMenuOnItemClick(new p11(this, context));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.fl0 fl0Var;
        SharedConfig.ProxyInfo proxyInfo;
        org.telegram.ui.Components.fl0 fl0Var2;
        boolean z4 = false;
        if (i10 == NotificationCenter.proxyChangedByRotation) {
            this.b.M(new j3(this, 7));
            c0(false);
            return;
        }
        if (i10 == NotificationCenter.proxySettingsChanged) {
            c0(true);
            return;
        }
        int i12 = NotificationCenter.didUpdateConnectionState;
        ArrayList arrayList = this.F;
        if (i10 == i12) {
            int connectionState = ConnectionsManager.getInstance(i11).getConnectionState();
            if (this.c != connectionState) {
                this.c = connectionState;
                if (this.b == null || (proxyInfo = SharedConfig.currentProxy) == null) {
                    return;
                }
                int indexOf = arrayList.indexOf(proxyInfo);
                if (indexOf >= 0 && (fl0Var2 = (org.telegram.ui.Components.fl0) this.b.K(indexOf + this.r)) != null) {
                    ((r11) fl0Var2.a).b();
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
        if (indexOf2 >= 0 && (fl0Var = (org.telegram.ui.Components.fl0) this.b.K(indexOf2 + this.r)) != null) {
            ((r11) fl0Var.a).b();
        }
        if (!this.G) {
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                SharedConfig.ProxyInfo proxyInfo2 = (SharedConfig.ProxyInfo) obj;
                if (proxyInfo2.checking || proxyInfo2.availableCheckTime == 0) {
                    z4 = true;
                    break;
                }
            }
            if (!z4) {
                this.G = true;
            }
        }
        if (z4) {
            return;
        }
        c0(true);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 16, new Class[]{org.telegram.ui.Cells.aa.class, org.telegram.ui.Cells.s8.class, org.telegram.ui.Cells.m4.class, r11.class}, null, null, null, org.telegram.ui.ActionBar.k6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 32768, null, null, null, null, org.telegram.ui.ActionBar.k6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.k0, null, null, org.telegram.ui.ActionBar.k6.d7));
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{r11.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 262156, new Class[]{r11.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.s6));
        int i11 = org.telegram.ui.ActionBar.k6.z6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 262156, new Class[]{r11.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 262156, new Class[]{r11.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.w6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 262156, new Class[]{r11.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 8, new Class[]{r11.class}, new String[]{"checkImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, org.telegram.ui.ActionBar.k6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.B6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z4) {
        if (this.E.isEmpty()) {
            return super.onBackPressed(z4);
        }
        if (!z4) {
            return false;
        }
        this.a.F();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onDialogDismiss(Dialog dialog) {
        DownloadController.getInstance(this.currentAccount).checkAutodownloadSettings();
    }

    @Override // org.telegram.ui.ActionBar.p2
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

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.proxyChangedByRotation);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.proxySettingsChanged);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.proxyCheckDone);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didUpdateConnectionState);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        q11 q11Var = this.a;
        if (q11Var != null) {
            q11Var.l();
        }
    }
}
