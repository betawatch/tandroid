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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public class ProxyListActivity extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public NumberTextView E;
    public final ArrayList F;
    public final ArrayList G;
    public boolean H;
    public e21 a;
    public org.telegram.ui.Components.vl0 b;
    public int c;
    public boolean d;
    public int e;
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
        this.F = new ArrayList();
        this.G = new ArrayList();
    }

    public static void U(ProxyListActivity proxyListActivity, View view, int i10) {
        ArrayList arrayList = proxyListActivity.G;
        if (i10 == proxyListActivity.useProxyRow) {
            if (SharedConfig.currentProxy == null) {
                if (arrayList.isEmpty()) {
                    proxyListActivity.presentFragment(new o21());
                    return;
                }
                SharedConfig.currentProxy = (SharedConfig.ProxyInfo) arrayList.get(0);
                if (!proxyListActivity.d) {
                    SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                    SharedConfig.currentProxy.settings.h(edit);
                    edit.commit();
                }
            }
            proxyListActivity.d = !proxyListActivity.d;
            proxyListActivity.b0(true);
            MessagesController.getGlobalMainSettings();
            ((org.telegram.ui.Cells.x8) view).setChecked(proxyListActivity.d);
            SharedPreferences.Editor edit2 = MessagesController.getGlobalMainSettings().edit();
            edit2.putBoolean("proxy_enabled", proxyListActivity.d);
            edit2.commit();
            ConnectionsManager.setProxySettings(proxyListActivity.d, SharedConfig.currentProxy.settings);
            NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
            int i11 = NotificationCenter.proxySettingsChanged;
            globalInstance.removeObserver(proxyListActivity, i11);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
            NotificationCenter.getGlobalInstance().addObserver(proxyListActivity, i11);
            for (int i12 = proxyListActivity.n; i12 < proxyListActivity.r; i12++) {
                org.telegram.ui.Components.fl0 fl0Var = (org.telegram.ui.Components.fl0) proxyListActivity.b.L(i12);
                if (fl0Var != null) {
                    ((f21) fl0Var.a).b();
                }
            }
            return;
        }
        if (i10 == proxyListActivity.v) {
            boolean z10 = !SharedConfig.proxyRotationEnabled;
            SharedConfig.proxyRotationEnabled = z10;
            ((org.telegram.ui.Cells.x8) view).setChecked(z10);
            SharedConfig.saveConfig();
            proxyListActivity.b0(true);
            return;
        }
        if (i10 < proxyListActivity.n || i10 >= proxyListActivity.r) {
            if (i10 == proxyListActivity.proxyAddRow) {
                proxyListActivity.presentFragment(new o21());
                return;
            }
            if (i10 == proxyListActivity.y) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(proxyListActivity.getParentActivity());
                alertDialog$Builder.a.T = LocaleController.getString(R.string.DeleteAllProxiesConfirm);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteProxyTitle);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new b21(proxyListActivity));
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                proxyListActivity.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                    return;
                }
                return;
            }
            return;
        }
        if (!proxyListActivity.F.isEmpty()) {
            proxyListActivity.a.G(i10);
            return;
        }
        SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) arrayList.get(i10 - proxyListActivity.n);
        proxyListActivity.d = true;
        SharedPreferences.Editor edit3 = MessagesController.getGlobalMainSettings().edit();
        proxyInfo.settings.h(edit3);
        edit3.putBoolean("proxy_enabled", proxyListActivity.d);
        edit3.commit();
        SharedConfig.currentProxy = proxyInfo;
        for (int i13 = proxyListActivity.n; i13 < proxyListActivity.r; i13++) {
            org.telegram.ui.Components.fl0 fl0Var2 = (org.telegram.ui.Components.fl0) proxyListActivity.b.L(i13);
            if (fl0Var2 != null) {
                f21 f21Var = (f21) fl0Var2.a;
                f21Var.setChecked(f21Var.d == proxyInfo);
                f21Var.b();
            }
        }
        proxyListActivity.b0(false);
        org.telegram.ui.Components.fl0 fl0Var3 = (org.telegram.ui.Components.fl0) proxyListActivity.b.L(proxyListActivity.useProxyRow);
        if (fl0Var3 != null) {
            ((org.telegram.ui.Cells.x8) fl0Var3.a).setChecked(true);
        }
        ConnectionsManager.setProxySettings(proxyListActivity.d, SharedConfig.currentProxy.settings);
    }

    public static /* synthetic */ void V(ProxyListActivity proxyListActivity) {
        ArrayList arrayList = proxyListActivity.G;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            SharedConfig.deleteProxy((SharedConfig.ProxyInfo) obj);
        }
        proxyListActivity.d = false;
        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
        int i11 = NotificationCenter.proxySettingsChanged;
        globalInstance.removeObserver(proxyListActivity, i11);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
        NotificationCenter.getGlobalInstance().addObserver(proxyListActivity, i11);
        proxyListActivity.b0(true);
        e21 e21Var = proxyListActivity.a;
        if (e21Var != null) {
            e21Var.n(proxyListActivity.useProxyRow, 0);
            proxyListActivity.a.F();
        }
    }

    public final void b0(boolean z10) {
        e21 e21Var;
        final boolean z11;
        this.e = 1;
        this.useProxyRow = 0;
        if (!this.d || SharedConfig.currentProxy == null || SharedConfig.proxyList.size() <= 1) {
            this.v = -1;
            this.w = -1;
            this.x = -1;
        } else {
            int i10 = this.e;
            int i11 = i10 + 1;
            this.e = i11;
            this.v = i10;
            if (SharedConfig.proxyRotationEnabled) {
                this.w = i11;
                this.e = i10 + 3;
                this.x = i10 + 2;
            } else {
                this.w = -1;
                this.x = -1;
            }
        }
        if (this.x == -1) {
            int i12 = this.e;
            this.e = i12 + 1;
            this.f = i12;
        } else {
            this.f = -1;
        }
        int i13 = this.e;
        this.e = i13 + 1;
        this.h = i13;
        ArrayList arrayList = this.G;
        if (z10) {
            arrayList.clear();
            arrayList.addAll(SharedConfig.proxyList);
            if (this.H) {
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
                    this.H = true;
                }
            }
            Collections.sort(arrayList, new Comparator() { // from class: org.telegram.ui.c21
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    SharedConfig.ProxyInfo proxyInfo2 = (SharedConfig.ProxyInfo) obj2;
                    SharedConfig.ProxyInfo proxyInfo3 = (SharedConfig.ProxyInfo) obj3;
                    SharedConfig.ProxyInfo proxyInfo4 = SharedConfig.currentProxy;
                    long j3 = proxyInfo4 == proxyInfo2 ? -200000L : 0L;
                    if (!proxyInfo2.available) {
                        j3 += 100000;
                    }
                    long j10 = proxyInfo4 == proxyInfo3 ? -200000L : 0L;
                    if (!proxyInfo3.available) {
                        j10 += 100000;
                    }
                    boolean z12 = z11;
                    return Long.compare((!z12 || proxyInfo2 == proxyInfo4) ? j3 + proxyInfo2.ping : SharedConfig.proxyList.indexOf(proxyInfo2) * 10000, (!z12 || proxyInfo3 == SharedConfig.currentProxy) ? proxyInfo3.ping + j10 : SharedConfig.proxyList.indexOf(proxyInfo3) * 10000);
                }
            });
        }
        if (arrayList.isEmpty()) {
            this.n = -1;
            this.r = -1;
        } else {
            int i15 = this.e;
            this.n = i15;
            int size2 = arrayList.size() + i15;
            this.e = size2;
            this.r = size2;
        }
        int i16 = this.e;
        this.proxyAddRow = i16;
        this.e = i16 + 2;
        this.s = i16 + 1;
        if (arrayList.size() >= 10) {
            int i17 = this.e;
            this.e = i17 + 1;
            this.y = i17;
        } else {
            this.y = -1;
        }
        int size3 = arrayList.size();
        for (int i18 = 0; i18 < size3; i18++) {
            SharedConfig.ProxyInfo proxyInfo2 = (SharedConfig.ProxyInfo) arrayList.get(i18);
            if (!proxyInfo2.checking && SystemClock.elapsedRealtime() - proxyInfo2.availableCheckTime >= 120000) {
                proxyInfo2.checking = true;
                ConnectionsManager.getInstance(this.currentAccount).checkProxy(proxyInfo2.settings, new ol0(proxyInfo2, 14));
            }
        }
        if (!z10 || (e21Var = this.a) == null) {
            return;
        }
        e21Var.l();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        hg.k0.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.ProxySettings));
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setActionBarMenuOnItemClick(new v70(this, 23));
        this.a = new e21(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(context, null);
        this.b = vl0Var;
        vl0Var.q1();
        ((s4.j) this.b.getItemAnimator()).C = false;
        ((s4.j) this.b.getItemAnimator()).o = org.telegram.ui.Components.qr.f;
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setLayoutManager(new s4.c0(1, false));
        frameLayout2.addView(this.b, w7.y5.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new i(this, 29));
        this.b.setOnItemLongClickListener(new b21(this));
        org.telegram.ui.ActionBar.z j3 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j3.getContext());
        this.E = numberTextView;
        numberTextView.setTextSize(18);
        this.E.setTypeface(AndroidUtilities.bold());
        this.E.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.y8, false));
        j3.addView(this.E, w7.y5.m(1.0f, 0, -1, 72, 0, 0));
        this.E.setOnTouchListener(new bi.d(2));
        j3.g(1, R.drawable.msg_share, AndroidUtilities.dp(54.0f)).setContentDescription(LocaleController.getString(R.string.StickersShare));
        j3.g(0, R.drawable.msg_delete, AndroidUtilities.dp(54.0f)).setContentDescription(LocaleController.getString(R.string.Delete));
        this.actionBar.setActionBarMenuOnItemClick(new d21(this, context));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.fl0 fl0Var;
        SharedConfig.ProxyInfo proxyInfo;
        org.telegram.ui.Components.fl0 fl0Var2;
        boolean z10 = false;
        if (i10 == NotificationCenter.proxyChangedByRotation) {
            this.b.N(new g3(this, 7));
            b0(false);
            return;
        }
        if (i10 == NotificationCenter.proxySettingsChanged) {
            b0(true);
            return;
        }
        int i12 = NotificationCenter.didUpdateConnectionState;
        ArrayList arrayList = this.G;
        if (i10 == i12) {
            int connectionState = ConnectionsManager.getInstance(i11).getConnectionState();
            if (this.c != connectionState) {
                this.c = connectionState;
                if (this.b == null || (proxyInfo = SharedConfig.currentProxy) == null) {
                    return;
                }
                int indexOf = arrayList.indexOf(proxyInfo);
                if (indexOf >= 0 && (fl0Var2 = (org.telegram.ui.Components.fl0) this.b.L(indexOf + this.n)) != null) {
                    ((f21) fl0Var2.a).b();
                }
                if (this.c == 3) {
                    b0(true);
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
        if (indexOf2 >= 0 && (fl0Var = (org.telegram.ui.Components.fl0) this.b.L(indexOf2 + this.n)) != null) {
            ((f21) fl0Var.a).b();
        }
        if (!this.H) {
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
                this.H = true;
            }
        }
        if (z10) {
            return;
        }
        b0(true);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final org.telegram.ui.Components.vl0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 16, new Class[]{org.telegram.ui.Cells.fa.class, org.telegram.ui.Cells.x8.class, org.telegram.ui.Cells.n4.class, f21.class}, null, null, null, org.telegram.ui.ActionBar.j6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.fa.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.fa.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{f21.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 262156, new Class[]{f21.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.s6));
        int i11 = org.telegram.ui.ActionBar.j6.z6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 262156, new Class[]{f21.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 262156, new Class[]{f21.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.w6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 262156, new Class[]{f21.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 8, new Class[]{f21.class}, new String[]{"checkImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.n4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, org.telegram.ui.ActionBar.j6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        if (this.F.isEmpty()) {
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
        boolean z10 = false;
        if (MessagesController.getGlobalMainSettings().getBoolean("proxy_enabled", false) && !SharedConfig.proxyList.isEmpty()) {
            z10 = true;
        }
        this.d = z10;
        b0(true);
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
        e21 e21Var = this.a;
        if (e21Var != null) {
            e21Var.l();
        }
    }
}
