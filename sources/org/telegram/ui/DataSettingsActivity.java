package org.telegram.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class DataSettingsActivity extends org.telegram.ui.ActionBar.k2 {
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public boolean U;
    public boolean V;
    public boolean W;
    public long X;
    public fg.j a;
    public ag.b1 b;
    public ArrayList c;
    private int clearDraftsRow;
    public int d;
    public int e;
    public int f;
    public int h;
    public int n;
    private int proxyRow;
    public int r;
    private int resetDownloadRow;
    public int s;
    private int saveToGalleryChannelsRow;
    private int saveToGalleryGroupsRow;
    private int saveToGalleryPeerRow;
    private int useLessDataForCallsRow;
    public int w;
    public int x;
    public int y;

    public DataSettingsActivity() {
        super(null);
        this.resetDownloadRow = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f1  */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.String, org.telegram.ui.ActionBar.u1] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v6, types: [boolean[], java.lang.String, org.telegram.messenger.zc] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.lang.Object, org.telegram.ui.ActionBar.k2, org.telegram.ui.DataSettingsActivity] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, org.telegram.ui.ActionBar.AlertDialog$Builder] */
    /* JADX WARN: Type inference failed for: r7v21, types: [android.view.ViewGroup] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Y(final DataSettingsActivity dataSettingsActivity, Context context, View view, int i10, float f7) {
        org.telegram.messenger.a6 a6Var;
        org.telegram.messenger.a6 a6Var2;
        String str;
        String str2;
        String str3;
        boolean z10;
        int size;
        int i11;
        LinearLayout linearLayout;
        String a02;
        ?? r11;
        boolean z11;
        int i12;
        int i13 = ((DataSettingsActivity) dataSettingsActivity).saveToGalleryGroupsRow;
        int i14 = 2;
        int i15 = 1;
        if (i10 == i13 || i10 == ((DataSettingsActivity) dataSettingsActivity).saveToGalleryChannelsRow || i10 == ((DataSettingsActivity) dataSettingsActivity).saveToGalleryPeerRow) {
            int i16 = i10 == i13 ? 2 : i10 == ((DataSettingsActivity) dataSettingsActivity).saveToGalleryChannelsRow ? 4 : 1;
            if ((!org.telegram.messenger.cd.X || f7 > org.telegram.messenger.i0.L(76.0f)) && (org.telegram.messenger.cd.X || f7 < view.getMeasuredWidth() - org.telegram.messenger.i0.L(76.0f))) {
                dataSettingsActivity.presentFragment(new SaveToGallerySettingsActivity(org.telegram.ui.Cells.f1.i(i16, TeXSymbolParser.TYPE_ATTR)));
                return;
            } else {
                org.telegram.messenger.js.f(i16).b();
                org.telegram.messenger.i0.a4(dataSettingsActivity.b);
                return;
            }
        }
        final int i17 = 0;
        if (i10 == dataSettingsActivity.e || i10 == dataSettingsActivity.f || i10 == dataSettingsActivity.h) {
            int i18 = 2;
            if ((!org.telegram.messenger.cd.X || f7 > org.telegram.messenger.i0.L(76.0f)) && (org.telegram.messenger.cd.X || f7 < view.getMeasuredWidth() - org.telegram.messenger.i0.L(76.0f))) {
                dataSettingsActivity.presentFragment(new DataAutoDownloadActivity(i10 == dataSettingsActivity.e ? 0 : i10 == dataSettingsActivity.h ? 1 : 2));
                return;
            }
            dataSettingsActivity.a.getClass();
            org.telegram.ui.Cells.l5 l5Var = (org.telegram.ui.Cells.l5) view;
            boolean z12 = l5Var.e.h;
            if (i10 == dataSettingsActivity.e) {
                a6Var = org.telegram.messenger.b6.q(dataSettingsActivity.currentAccount).M;
                a6Var2 = org.telegram.messenger.b6.q(dataSettingsActivity.currentAccount).K;
                str = "mobilePreset";
                str2 = "currentMobilePreset";
                i18 = 0;
            } else if (i10 == dataSettingsActivity.h) {
                a6Var = org.telegram.messenger.b6.q(dataSettingsActivity.currentAccount).N;
                a6Var2 = org.telegram.messenger.b6.q(dataSettingsActivity.currentAccount).L;
                str = "wifiPreset";
                str2 = "currentWifiPreset";
                i18 = 1;
            } else {
                a6Var = org.telegram.messenger.b6.q(dataSettingsActivity.currentAccount).O;
                a6Var2 = org.telegram.messenger.b6.q(dataSettingsActivity.currentAccount).J;
                str = "roamingPreset";
                str2 = "currentRoamingPreset";
            }
            if (z12 || !a6Var.g) {
                a6Var.g = !a6Var.g;
            } else {
                a6Var.c(a6Var2);
            }
            SharedPreferences.Editor edit = org.telegram.messenger.vp.r1(dataSettingsActivity.currentAccount).f7.edit();
            edit.putString(str, a6Var.toString());
            edit.putInt(str2, 3);
            edit.commit();
            l5Var.setChecked(!z12);
            s4.c1 G = dataSettingsActivity.b.G(view);
            if (G != null) {
                dataSettingsActivity.a.t(G, i10);
            }
            org.telegram.messenger.b6.q(dataSettingsActivity.currentAccount).g();
            org.telegram.messenger.b6.q(dataSettingsActivity.currentAccount).w(i18);
            dataSettingsActivity.s0(false);
            return;
        }
        int i19 = 2131752589;
        Object obj = null;
        if (i10 == ((DataSettingsActivity) dataSettingsActivity).resetDownloadRow) {
            if (dataSettingsActivity.getParentActivity() == null || !view.isEnabled()) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dataSettingsActivity.getParentActivity());
            String L0 = org.telegram.messenger.cd.L0(2131746126, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.cd.L0(2131746127, null);
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131746135, null), new org.telegram.ui.ActionBar.u1(dataSettingsActivity) { // from class: org.telegram.ui.bu
                public final /* synthetic */ DataSettingsActivity b;

                {
                    this.b = dataSettingsActivity;
                }

                @Override // org.telegram.ui.ActionBar.u1
                public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i20) {
                    switch (i17) {
                        case 0:
                            DataSettingsActivity.Z(this.b);
                            break;
                        default:
                            TLRPC.TL_messages_clearAllDrafts tL_messages_clearAllDrafts = new TLRPC.TL_messages_clearAllDrafts();
                            DataSettingsActivity dataSettingsActivity2 = this.b;
                            dataSettingsActivity2.getConnectionsManager().sendRequest(tL_messages_clearAllDrafts, new k(dataSettingsActivity2, 6));
                            break;
                    }
                }
            });
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
            dataSettingsActivity.showDialog(x1Var);
            TextView textView = (TextView) x1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
                return;
            }
            return;
        }
        if (i10 == dataSettingsActivity.s) {
            dataSettingsActivity.presentFragment(new y6());
            return;
        }
        float f10 = 4.0f;
        if (i10 == ((DataSettingsActivity) dataSettingsActivity).useLessDataForCallsRow) {
            SharedPreferences d12 = org.telegram.messenger.vp.d1();
            int i20 = d12.getInt("VoipDataSaving", org.telegram.ui.Components.voip.m1.c());
            if (i20 != 0) {
                if (i20 != 1) {
                    if (i20 == 2) {
                        i14 = 3;
                    } else if (i20 == 3) {
                        i14 = 1;
                    }
                }
                Activity parentActivity = dataSettingsActivity.getParentActivity();
                String[] strArr = {org.telegram.messenger.cd.L0(2131743821, null), org.telegram.messenger.cd.L0(2131743819, null), org.telegram.messenger.cd.L0(2131743820, null), org.telegram.messenger.cd.L0(2131743822, null)};
                String L02 = org.telegram.messenger.cd.L0(2131743255, null);
                cu cuVar = new cu(dataSettingsActivity, d12, i10);
                Pattern pattern = org.telegram.ui.Components.s4.a;
                LinearLayout e = org.telegram.messenger.m5.e(parentActivity, 1);
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(parentActivity);
                i12 = 0;
                for (int i21 = 4; i12 < i21; i21 = 4) {
                    org.telegram.ui.Cells.n6 n6Var = new org.telegram.ui.Cells.n6(parentActivity, null);
                    float f11 = f10;
                    n6Var.setPadding(org.telegram.messenger.i0.L(f10), 0, org.telegram.messenger.i0.L(f11), 0);
                    n6Var.setTag(Integer.valueOf(i12));
                    org.telegram.ui.Components.s4.a(n6Var, org.telegram.ui.ActionBar.t6.g7, org.telegram.ui.ActionBar.t6.E5, null);
                    n6Var.b(strArr[i12], i14 == i12);
                    e.addView(n6Var);
                    n6Var.setOnClickListener(new ud(14, alertDialog$Builder2, cuVar));
                    i12++;
                    f10 = f11;
                }
                org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
                x1Var2.R = L02;
                alertDialog$Builder2.o(e);
                alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131752589, null), null);
                dataSettingsActivity.setVisibleDialog(x1Var2);
                x1Var2.show();
                return;
            }
            i14 = 0;
            Activity parentActivity2 = dataSettingsActivity.getParentActivity();
            String[] strArr2 = {org.telegram.messenger.cd.L0(2131743821, null), org.telegram.messenger.cd.L0(2131743819, null), org.telegram.messenger.cd.L0(2131743820, null), org.telegram.messenger.cd.L0(2131743822, null)};
            String L022 = org.telegram.messenger.cd.L0(2131743255, null);
            cu cuVar2 = new cu(dataSettingsActivity, d12, i10);
            Pattern pattern2 = org.telegram.ui.Components.s4.a;
            LinearLayout e7 = org.telegram.messenger.m5.e(parentActivity2, 1);
            AlertDialog$Builder alertDialog$Builder22 = new AlertDialog$Builder(parentActivity2);
            i12 = 0;
            while (i12 < i21) {
            }
            org.telegram.ui.ActionBar.x1 x1Var22 = alertDialog$Builder22.a;
            x1Var22.R = L022;
            alertDialog$Builder22.o(e7);
            alertDialog$Builder22.k(org.telegram.messenger.cd.L0(2131752589, null), null);
            dataSettingsActivity.setVisibleDialog(x1Var22);
            x1Var22.show();
            return;
        }
        if (i10 == dataSettingsActivity.w) {
            dataSettingsActivity.presentFragment(new mu());
            return;
        }
        if (i10 != dataSettingsActivity.n) {
            if (i10 == ((DataSettingsActivity) dataSettingsActivity).proxyRow) {
                dataSettingsActivity.presentFragment(new ProxyListActivity());
                return;
            }
            if (i10 == dataSettingsActivity.D) {
                org.telegram.messenger.tz.B0 = !org.telegram.messenger.tz.B0;
                SharedPreferences.Editor edit2 = org.telegram.messenger.vp.d1().edit();
                edit2.putBoolean("streamMedia", org.telegram.messenger.tz.B0);
                edit2.apply();
                ((org.telegram.ui.Cells.t8) view).setChecked(org.telegram.messenger.tz.B0);
                return;
            }
            if (i10 == dataSettingsActivity.F) {
                org.telegram.messenger.tz.C0 = !org.telegram.messenger.tz.C0;
                SharedPreferences.Editor edit3 = org.telegram.messenger.vp.d1().edit();
                edit3.putBoolean("streamAllVideo", org.telegram.messenger.tz.C0);
                edit3.apply();
                ((org.telegram.ui.Cells.t8) view).setChecked(org.telegram.messenger.tz.C0);
                return;
            }
            if (i10 == dataSettingsActivity.G) {
                org.telegram.messenger.tz.D0 = !org.telegram.messenger.tz.D0;
                SharedPreferences.Editor edit4 = org.telegram.messenger.vp.d1().edit();
                edit4.putBoolean("streamMkv", org.telegram.messenger.tz.D0);
                edit4.apply();
                ((org.telegram.ui.Cells.t8) view).setChecked(org.telegram.messenger.tz.D0);
                return;
            }
            if (i10 == dataSettingsActivity.E) {
                org.telegram.messenger.tz.E0 = !org.telegram.messenger.tz.E0;
                SharedPreferences.Editor edit5 = org.telegram.messenger.vp.d1().edit();
                edit5.putBoolean("saveStreamMedia", org.telegram.messenger.tz.E0);
                edit5.apply();
                ((org.telegram.ui.Cells.t8) view).setChecked(org.telegram.messenger.tz.E0);
                return;
            }
            if (i10 == dataSettingsActivity.J) {
                int i22 = org.telegram.messenger.tz.a;
                org.telegram.messenger.sc.i = !org.telegram.messenger.sc.e(2048) ? org.telegram.messenger.sc.d(true) | 2048 : org.telegram.messenger.sc.d(true) & (-2049);
                org.telegram.messenger.sc.k();
                if (view instanceof org.telegram.ui.Cells.t8) {
                    ((org.telegram.ui.Cells.t8) view).setChecked(org.telegram.messenger.sc.e(2048));
                    return;
                }
                return;
            }
            if (i10 == dataSettingsActivity.K) {
                int i23 = org.telegram.messenger.tz.a;
                org.telegram.messenger.sc.i = !org.telegram.messenger.sc.e(1024) ? org.telegram.messenger.sc.d(true) | 1024 : org.telegram.messenger.sc.d(true) & (-1025);
                org.telegram.messenger.sc.k();
                if (view instanceof org.telegram.ui.Cells.t8) {
                    ((org.telegram.ui.Cells.t8) view).setChecked(org.telegram.messenger.sc.e(1024));
                    return;
                }
                return;
            }
            if (i10 == ((DataSettingsActivity) dataSettingsActivity).clearDraftsRow) {
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(dataSettingsActivity.getParentActivity());
                String L03 = org.telegram.messenger.cd.L0(2131754117, null);
                org.telegram.ui.ActionBar.x1 x1Var3 = alertDialog$Builder3.a;
                x1Var3.R = L03;
                x1Var3.T = org.telegram.messenger.cd.L0(2131754118, null);
                final int i24 = 1;
                alertDialog$Builder3.k(org.telegram.messenger.cd.L0(2131751599, null), new org.telegram.ui.ActionBar.u1(dataSettingsActivity) { // from class: org.telegram.ui.bu
                    public final /* synthetic */ DataSettingsActivity b;

                    {
                        this.b = dataSettingsActivity;
                    }

                    @Override // org.telegram.ui.ActionBar.u1
                    public final void h(org.telegram.ui.ActionBar.x1 x1Var23, int i202) {
                        switch (i24) {
                            case 0:
                                DataSettingsActivity.Z(this.b);
                                break;
                            default:
                                TLRPC.TL_messages_clearAllDrafts tL_messages_clearAllDrafts = new TLRPC.TL_messages_clearAllDrafts();
                                DataSettingsActivity dataSettingsActivity2 = this.b;
                                dataSettingsActivity2.getConnectionsManager().sendRequest(tL_messages_clearAllDrafts, new k(dataSettingsActivity2, 6));
                                break;
                        }
                    }
                });
                alertDialog$Builder3.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                dataSettingsActivity.showDialog(x1Var3);
                TextView textView2 = (TextView) x1Var3.d(-1);
                if (textView2 != null) {
                    org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.q7, null);
                    return;
                }
                return;
            }
            return;
        }
        ?? alertDialog$Builder4 = new AlertDialog$Builder(dataSettingsActivity.getParentActivity());
        String L04 = org.telegram.messenger.cd.L0(2131744838, null);
        org.telegram.ui.ActionBar.x1 x1Var4 = alertDialog$Builder4.a;
        x1Var4.R = L04;
        LinearLayout linearLayout2 = new LinearLayout(dataSettingsActivity.getParentActivity());
        linearLayout2.setOrientation(1);
        alertDialog$Builder4.o(linearLayout2);
        String absolutePath = ((File) dataSettingsActivity.c.get(0)).getAbsolutePath();
        if (!TextUtils.isEmpty(org.telegram.messenger.tz.h0)) {
            int size2 = dataSettingsActivity.c.size();
            for (int i25 = 0; i25 < size2; i25++) {
                String absolutePath2 = ((File) dataSettingsActivity.c.get(i25)).getAbsolutePath();
                if (absolutePath2.startsWith(org.telegram.messenger.tz.h0)) {
                    str3 = absolutePath2;
                    break;
                }
            }
        }
        str3 = absolutePath;
        try {
        } catch (Exception unused) {
            z10 = true;
        }
        if (dataSettingsActivity.c.size() == 2) {
            if (((File) dataSettingsActivity.c.get(0)).getAbsolutePath().contains("/storage/emulated/") != ((File) dataSettingsActivity.c.get(1)).getAbsolutePath().contains("/storage/emulated/")) {
                z11 = false;
                z10 = z11;
                size = dataSettingsActivity.c.size();
                i11 = 0;
                while (i11 < size) {
                    File file = (File) dataSettingsActivity.c.get(i11);
                    int i26 = i11;
                    String absolutePath3 = file.getAbsolutePath();
                    org.telegram.ui.Cells.t4 t4Var = new org.telegram.ui.Cells.t4(context);
                    int i27 = i15;
                    t4Var.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
                    t4Var.setTag(Integer.valueOf(i26));
                    boolean contains = absolutePath3.contains("/storage/emulated/");
                    if (!z10 || contains) {
                        ?? r112 = obj;
                        linearLayout = linearLayout2;
                        if (contains) {
                            Object[] objArr = new Object[i27];
                            objArr[0] = org.telegram.messenger.i0.i0(file.getFreeSpace(), false, false);
                            a02 = org.telegram.messenger.cd.a0(r112, r112, 2131744836, objArr);
                            r11 = r112;
                        } else {
                            Object[] objArr2 = new Object[i27];
                            objArr2[0] = org.telegram.messenger.i0.i0(file.getFreeSpace(), false, false);
                            a02 = org.telegram.messenger.cd.a0(r112, r112, 2131744837, objArr2);
                            r11 = r112;
                        }
                    } else {
                        linearLayout = linearLayout2;
                        Object[] objArr3 = new Object[i14];
                        objArr3[0] = org.telegram.messenger.i0.i0(file.getFreeSpace(), false, false);
                        objArr3[i27] = absolutePath3;
                        r11 = 0;
                        a02 = org.telegram.messenger.cd.a0(null, null, 2131744835, objArr3);
                    }
                    t4Var.b.setText(org.telegram.messenger.cd.L0(contains ? 2131749198 : 2131745857, r11));
                    t4Var.c.setText(a02);
                    RadioButton radioButton = t4Var.a;
                    radioButton.a(false, false);
                    t4Var.e = r11;
                    t4Var.d = false;
                    radioButton.a(absolutePath3.startsWith(str3), false);
                    t4Var.setBackground(org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(r11, org.telegram.ui.ActionBar.t6.I5, false), 2, -1));
                    ?? r72 = linearLayout;
                    r72.addView(t4Var);
                    t4Var.setOnClickListener(new kg.z0(dataSettingsActivity, absolutePath3, contains, alertDialog$Builder4, 1));
                    i11 = i26 + 1;
                    linearLayout2 = r72;
                    i14 = 2;
                    size = size;
                    obj = r11;
                    i15 = 1;
                    i19 = 2131752589;
                }
                ?? r113 = obj;
                alertDialog$Builder4.h(org.telegram.messenger.cd.L0(i19, r113), r113);
                dataSettingsActivity.showDialog(x1Var4);
            }
        }
        z11 = true;
        z10 = z11;
        size = dataSettingsActivity.c.size();
        i11 = 0;
        while (i11 < size) {
        }
        ?? r1132 = obj;
        alertDialog$Builder4.h(org.telegram.messenger.cd.L0(i19, r1132), r1132);
        dataSettingsActivity.showDialog(x1Var4);
    }

    public static void Z(DataSettingsActivity dataSettingsActivity) {
        org.telegram.messenger.a6 a6Var;
        org.telegram.messenger.a6 a6Var2;
        String str;
        SharedPreferences.Editor edit = org.telegram.messenger.vp.r1(dataSettingsActivity.currentAccount).f7.edit();
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                a6Var = org.telegram.messenger.b6.q(dataSettingsActivity.currentAccount).M;
                a6Var2 = org.telegram.messenger.b6.q(dataSettingsActivity.currentAccount).K;
                str = "mobilePreset";
            } else if (i10 == 1) {
                a6Var = org.telegram.messenger.b6.q(dataSettingsActivity.currentAccount).N;
                a6Var2 = org.telegram.messenger.b6.q(dataSettingsActivity.currentAccount).L;
                str = "wifiPreset";
            } else {
                a6Var = org.telegram.messenger.b6.q(dataSettingsActivity.currentAccount).O;
                a6Var2 = org.telegram.messenger.b6.q(dataSettingsActivity.currentAccount).J;
                str = "roamingPreset";
            }
            a6Var.c(a6Var2);
            a6Var.g = a6Var2.b();
            org.telegram.messenger.b6.q(dataSettingsActivity.currentAccount).P = 3;
            edit.putInt("currentMobilePreset", 3);
            org.telegram.messenger.b6.q(dataSettingsActivity.currentAccount).Q = 3;
            edit.putInt("currentWifiPreset", 3);
            org.telegram.messenger.b6.q(dataSettingsActivity.currentAccount).R = 3;
            edit.putInt("currentRoamingPreset", 3);
            edit.putString(str, a6Var.toString());
        }
        edit.commit();
        org.telegram.messenger.b6.q(dataSettingsActivity.currentAccount).g();
        for (int i11 = 0; i11 < 3; i11++) {
            org.telegram.messenger.b6.q(dataSettingsActivity.currentAccount).w(i11);
        }
        dataSettingsActivity.a.k(dataSettingsActivity.e, 4);
        dataSettingsActivity.s0(false);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s8));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131751678, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ar(this, 15));
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        if (z4Var != null && ((ActionBarLayout) z4Var).T0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.a = new fg.j(10, this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        ag.b1 b1Var = new ag.b1(this, context, 25);
        this.b = b1Var;
        b1Var.r1();
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setLayoutManager(new s4.a0(1, false));
        frameLayout.addView(this.b, w7.b6.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setSectionsDrawBackground(true);
        this.b.setOnItemClickListener(new org.telegram.ui.Components.f2(28, this, context));
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.gr.h);
        jVar.C = false;
        jVar.m = false;
        this.b.setItemAnimator(jVar);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 16, new Class[]{org.telegram.ui.Cells.x9.class, org.telegram.ui.Cells.t8.class, org.telegram.ui.Cells.p4.class, org.telegram.ui.Cells.l5.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.d6));
        int i10 = org.telegram.ui.ActionBar.t6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{org.telegram.ui.Cells.l5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        int i11 = org.telegram.ui.ActionBar.t6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{org.telegram.ui.Cells.l5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.messenger.b6.q(this.currentAccount).g();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.b6.q(this.currentAccount).s(true);
        s0(true);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        y6.h0 = true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        zt ztVar = new zt(this, 1);
        org.telegram.messenger.i0.h3(ztVar, 100L);
        y6.l0(new au(this, ztVar, System.currentTimeMillis(), 0));
        if (this.b != null && this.a != null) {
            for (int i10 = 0; i10 < this.b.getChildCount(); i10++) {
                View childAt = this.b.getChildAt(i10);
                s4.c1 T = this.b.T(childAt);
                if (T != null) {
                    fg.j jVar = this.a;
                    this.b.getClass();
                    jVar.t(T, RecyclerView.R(childAt));
                }
            }
        }
        s0(false);
    }

    public final void r0(int i10) {
        if (this.b == null || this.a == null) {
            return;
        }
        for (int i11 = 0; i11 < this.b.getChildCount(); i11++) {
            s4.c1 T = this.b.T(this.b.getChildAt(i11));
            if (T != null && T.b() == i10) {
                this.a.t(T, i10);
                return;
            }
        }
    }

    public final void s0(boolean z10) {
        int i10;
        this.s = 1;
        this.T = 3;
        this.w = 2;
        this.n = -1;
        ArrayList d12 = org.telegram.messenger.i0.d1();
        this.c = d12;
        if (d12.size() > 1) {
            int i11 = this.T;
            this.T = i11 + 1;
            this.n = i11;
        }
        int i12 = this.T;
        this.x = i12;
        this.d = i12 + 1;
        this.e = i12 + 2;
        this.h = i12 + 3;
        this.T = i12 + 5;
        this.f = i12 + 4;
        org.telegram.messenger.b6 downloadController = getDownloadController();
        org.telegram.messenger.a6 a6Var = downloadController.J;
        org.telegram.messenger.a6 a6Var2 = downloadController.L;
        org.telegram.messenger.a6 a6Var3 = downloadController.K;
        boolean z11 = a6Var.a(downloadController.o()) && downloadController.J.b() == downloadController.O.g && a6Var3.a(downloadController.n()) && a6Var3.b() == downloadController.M.g && a6Var2.a(downloadController.p()) && a6Var2.b() == downloadController.N.g;
        int i13 = this.resetDownloadRow;
        if (z11) {
            i10 = -1;
        } else {
            i10 = this.T;
            this.T = i10 + 1;
        }
        this.resetDownloadRow = i10;
        fg.j jVar = this.a;
        if (jVar != null && !z10) {
            if (i13 < 0 && i10 >= 0) {
                jVar.g(this.f);
                this.a.i(this.resetDownloadRow);
            } else if (i13 < 0 || i10 >= 0) {
                z10 = true;
            } else {
                jVar.g(this.f);
                this.a.s(i13);
            }
        }
        int i14 = this.T;
        this.r = i14;
        this.R = i14 + 1;
        this.saveToGalleryPeerRow = i14 + 2;
        this.saveToGalleryGroupsRow = i14 + 3;
        this.saveToGalleryChannelsRow = i14 + 4;
        this.S = i14 + 5;
        this.y = i14 + 6;
        int i15 = i14 + 8;
        this.T = i15;
        this.D = i14 + 7;
        boolean z12 = org.telegram.messenger.v2.a;
        this.G = i15;
        this.F = i14 + 9;
        this.H = i14 + 10;
        this.E = -1;
        this.M = i14 + 11;
        this.useLessDataForCallsRow = i14 + 12;
        this.N = i14 + 13;
        this.O = i14 + 14;
        this.proxyRow = i14 + 15;
        this.P = i14 + 16;
        this.clearDraftsRow = i14 + 17;
        this.T = i14 + 19;
        this.Q = i14 + 18;
        fg.j jVar2 = this.a;
        if (jVar2 == null || !z10) {
            return;
        }
        jVar2.f();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
