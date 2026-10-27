package org.telegram.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public class ProxyListActivity extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList E;
    public final ArrayList F;
    public boolean G;
    public t11 a;
    public org.telegram.ui.Components.nm0 b;
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
        this.E = new ArrayList();
        this.F = new ArrayList();
    }

    public static void V(ProxyListActivity proxyListActivity, View view, int i10) {
        ArrayList arrayList = proxyListActivity.F;
        if (i10 == proxyListActivity.useProxyRow) {
            if (SharedConfig.currentProxy == null) {
                if (arrayList.isEmpty()) {
                    proxyListActivity.presentFragment(new d21());
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
            proxyListActivity.d0(true);
            MessagesController.getGlobalMainSettings();
            ((org.telegram.ui.Cells.a9) view).setChecked(proxyListActivity.d);
            SharedPreferences.Editor edit2 = MessagesController.getGlobalMainSettings().edit();
            edit2.putBoolean("proxy_enabled", proxyListActivity.d);
            edit2.commit();
            ConnectionsManager.setProxySettings(proxyListActivity.d, SharedConfig.currentProxy.settings);
            NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
            int i11 = NotificationCenter.proxySettingsChanged;
            globalInstance.removeObserver(proxyListActivity, i11);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
            NotificationCenter.getGlobalInstance().addWeakObserver(proxyListActivity, i11);
            for (int i12 = proxyListActivity.n; i12 < proxyListActivity.r; i12++) {
                org.telegram.ui.Components.wl0 wl0Var = (org.telegram.ui.Components.wl0) proxyListActivity.b.K(i12);
                if (wl0Var != null) {
                    ((u11) wl0Var.a).b();
                }
            }
            return;
        }
        if (i10 == proxyListActivity.v) {
            boolean z10 = !SharedConfig.proxyRotationEnabled;
            SharedConfig.proxyRotationEnabled = z10;
            ((org.telegram.ui.Cells.a9) view).setChecked(z10);
            SharedConfig.saveConfig();
            proxyListActivity.d0(true);
            return;
        }
        if (i10 < proxyListActivity.n || i10 >= proxyListActivity.r) {
            if (i10 == proxyListActivity.proxyAddRow) {
                proxyListActivity.presentFragment(new d21());
                return;
            }
            if (i10 == proxyListActivity.y) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(proxyListActivity.getParentActivity());
                alertDialog$Builder.a.T = LocaleController.getString(R.string.DeleteAllProxiesConfirm);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteProxyTitle);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new p11(proxyListActivity));
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                proxyListActivity.showDialog(e2Var);
                TextView textView = (TextView) e2Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, null);
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
        SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) arrayList.get(i10 - proxyListActivity.n);
        proxyListActivity.d = true;
        SharedPreferences.Editor edit3 = MessagesController.getGlobalMainSettings().edit();
        proxyInfo.settings.h(edit3);
        edit3.putBoolean("proxy_enabled", proxyListActivity.d);
        edit3.commit();
        SharedConfig.currentProxy = proxyInfo;
        for (int i13 = proxyListActivity.n; i13 < proxyListActivity.r; i13++) {
            org.telegram.ui.Components.wl0 wl0Var2 = (org.telegram.ui.Components.wl0) proxyListActivity.b.K(i13);
            if (wl0Var2 != null) {
                u11 u11Var = (u11) wl0Var2.a;
                u11Var.setChecked(u11Var.d == proxyInfo);
                u11Var.b();
            }
        }
        proxyListActivity.d0(false);
        org.telegram.ui.Components.wl0 wl0Var3 = (org.telegram.ui.Components.wl0) proxyListActivity.b.K(proxyListActivity.useProxyRow);
        if (wl0Var3 != null) {
            ((org.telegram.ui.Cells.a9) wl0Var3.a).setChecked(true);
        }
        ConnectionsManager.setProxySettings(proxyListActivity.d, SharedConfig.currentProxy.settings);
    }

    public static /* synthetic */ void W(ProxyListActivity proxyListActivity) {
        ArrayList arrayList = proxyListActivity.F;
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
        NotificationCenter.getGlobalInstance().addWeakObserver(proxyListActivity, i11);
        proxyListActivity.d0(true);
        t11 t11Var = proxyListActivity.a;
        if (t11Var != null) {
            t11Var.n(proxyListActivity.useProxyRow, 0);
            proxyListActivity.a.F();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.d6));
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.j2(false));
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.ProxySettings));
        org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
        if (j5Var != null && ((ActionBarLayout) j5Var).S0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new r11(this, 0));
        this.a = new t11(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(context, null);
        this.b = nm0Var;
        nm0Var.u1();
        ((s4.l) this.b.getItemAnimator()).C = false;
        ((s4.l) this.b.getItemAnimator()).o = org.telegram.ui.Components.ds.f;
        this.b.setSectionsDrawBackground(true);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setLayoutManager(new s4.c0(1, false));
        frameLayout.addView(this.b, org.telegram.ui.Components.kb1.i(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new o11(this, 0));
        this.b.setOnItemLongClickListener(new p11(this));
        org.telegram.ui.ActionBar.x5 h = this.simpleActionBar.h();
        h.b(1, R.drawable.msg_share, null, null, AndroidUtilities.dp(54.0f), null).setContentDescription(LocaleController.getString(R.string.StickersShare));
        h.b(0, R.drawable.msg_delete, null, null, AndroidUtilities.dp(54.0f), null).setContentDescription(LocaleController.getString(R.string.Delete));
        this.simpleActionBar.setActionBarMenuOnItemClick(new s11(this, context));
        return this.fragmentView;
    }

    public final void d0(boolean z10) {
        t11 t11Var;
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
        ArrayList arrayList = this.F;
        if (z10) {
            arrayList.clear();
            arrayList.addAll(SharedConfig.proxyList);
            if (this.G) {
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
                    this.G = true;
                }
            }
            Collections.sort(arrayList, new Comparator() { // from class: org.telegram.ui.q11
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
                ConnectionsManager.getInstance(this.currentAccount).checkProxy(proxyInfo2.settings, new jl0(proxyInfo2, 14));
            }
        }
        if (!z10 || (t11Var = this.a) == null) {
            return;
        }
        t11Var.l();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.wl0 wl0Var;
        SharedConfig.ProxyInfo proxyInfo;
        org.telegram.ui.Components.wl0 wl0Var2;
        boolean z10 = false;
        if (i10 == NotificationCenter.proxyChangedByRotation) {
            this.b.M(new h3(this, 7));
            d0(false);
            return;
        }
        if (i10 == NotificationCenter.proxySettingsChanged) {
            d0(true);
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
                if (indexOf >= 0 && (wl0Var2 = (org.telegram.ui.Components.wl0) this.b.K(indexOf + this.n)) != null) {
                    ((u11) wl0Var2.a).b();
                }
                if (this.c == 3) {
                    d0(true);
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
        if (indexOf2 >= 0 && (wl0Var = (org.telegram.ui.Components.wl0) this.b.K(indexOf2 + this.n)) != null) {
            ((u11) wl0Var.a).b();
        }
        if (!this.G) {
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
                this.G = true;
            }
        }
        if (z10) {
            return;
        }
        d0(true);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.Components.nm0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.b, 262156, new Class[]{u11.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.s6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.b, 262156, new Class[]{u11.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.b, 262156, new Class[]{u11.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.w6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.b, 262156, new Class[]{u11.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.b, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.b, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.N6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onBackPressed(boolean z10) {
        if (this.E.isEmpty()) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        this.a.F();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onDialogDismiss(Dialog dialog) {
        DownloadController.getInstance(this.currentAccount).checkAutodownloadSettings();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        SharedConfig.loadProxyList();
        this.c = ConnectionsManager.getInstance(this.currentAccount).getConnectionState();
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.proxyChangedByRotation);
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.proxySettingsChanged);
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.proxyCheckDone);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.didUpdateConnectionState);
        boolean z10 = false;
        if (MessagesController.getGlobalMainSettings().getBoolean("proxy_enabled", false) && !SharedConfig.proxyList.isEmpty()) {
            z10 = true;
        }
        this.d = z10;
        d0(true);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.proxyChangedByRotation);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.proxySettingsChanged);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.proxyCheckDone);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didUpdateConnectionState);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onResume() {
        super.onResume();
        t11 t11Var = this.a;
        if (t11Var != null) {
            t11Var.l();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
