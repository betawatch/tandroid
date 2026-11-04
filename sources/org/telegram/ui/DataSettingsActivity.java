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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class DataSettingsActivity extends org.telegram.ui.ActionBar.d2 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public boolean X;
    public long Y;
    public n4 a;
    public xs b;
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
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f1  */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.String, org.telegram.ui.ActionBar.p1] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v6, types: [boolean[], java.lang.String, org.telegram.messenger.yc] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.lang.Object, org.telegram.ui.ActionBar.d2, org.telegram.ui.DataSettingsActivity] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, org.telegram.ui.ActionBar.AlertDialog$Builder] */
    /* JADX WARN: Type inference failed for: r7v21, types: [android.view.ViewGroup] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Z(final DataSettingsActivity dataSettingsActivity, Context context, View view, int i3, float f10) {
        org.telegram.messenger.y5 y5Var;
        org.telegram.messenger.y5 y5Var2;
        String str;
        String str2;
        String str3;
        boolean z10;
        int size;
        int i10;
        LinearLayout linearLayout;
        String a02;
        ?? r11;
        boolean z11;
        int i11;
        int i12 = ((DataSettingsActivity) dataSettingsActivity).saveToGalleryGroupsRow;
        int i13 = 2;
        int i14 = 1;
        if (i3 == i12 || i3 == ((DataSettingsActivity) dataSettingsActivity).saveToGalleryChannelsRow || i3 == ((DataSettingsActivity) dataSettingsActivity).saveToGalleryPeerRow) {
            int i15 = i3 == i12 ? 2 : i3 == ((DataSettingsActivity) dataSettingsActivity).saveToGalleryChannelsRow ? 4 : 1;
            if ((!org.telegram.messenger.bd.a0 || f10 > org.telegram.messenger.g0.L(76.0f)) && (org.telegram.messenger.bd.a0 || f10 < view.getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f))) {
                dataSettingsActivity.presentFragment(new SaveToGallerySettingsActivity(org.telegram.ui.Cells.f1.k(i15, TeXSymbolParser.TYPE_ATTR)));
                return;
            } else {
                org.telegram.messenger.b6.f(i15).b();
                org.telegram.messenger.g0.b4(dataSettingsActivity.b);
                return;
            }
        }
        final int i16 = 0;
        if (i3 == dataSettingsActivity.e || i3 == dataSettingsActivity.f || i3 == dataSettingsActivity.h) {
            int i17 = 2;
            if ((!org.telegram.messenger.bd.a0 || f10 > org.telegram.messenger.g0.L(76.0f)) && (org.telegram.messenger.bd.a0 || f10 < view.getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f))) {
                dataSettingsActivity.presentFragment(new DataAutoDownloadActivity(i3 == dataSettingsActivity.e ? 0 : i3 == dataSettingsActivity.h ? 1 : 2));
                return;
            }
            dataSettingsActivity.a.getClass();
            org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view;
            boolean z12 = h5Var.e.h;
            if (i3 == dataSettingsActivity.e) {
                y5Var = org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).N;
                y5Var2 = org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).L;
                str = "mobilePreset";
                str2 = "currentMobilePreset";
                i17 = 0;
            } else if (i3 == dataSettingsActivity.h) {
                y5Var = org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).O;
                y5Var2 = org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).M;
                str = "wifiPreset";
                str2 = "currentWifiPreset";
                i17 = 1;
            } else {
                y5Var = org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).P;
                y5Var2 = org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).K;
                str = "roamingPreset";
                str2 = "currentRoamingPreset";
            }
            if (z12 || !y5Var.g) {
                y5Var.g = !y5Var.g;
            } else {
                y5Var.c(y5Var2);
            }
            SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(dataSettingsActivity.currentAccount).e7.edit();
            edit.putString(str, y5Var.toString());
            edit.putInt(str2, 3);
            edit.commit();
            h5Var.setChecked(!z12);
            u4.d1 G = dataSettingsActivity.b.G(view);
            if (G != null) {
                dataSettingsActivity.a.t(G, i3);
            }
            org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).g();
            org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).w(i17);
            dataSettingsActivity.t0(false);
            return;
        }
        int i18 = 2131752589;
        Object obj = null;
        if (i3 == ((DataSettingsActivity) dataSettingsActivity).resetDownloadRow) {
            if (dataSettingsActivity.getParentActivity() == null || !view.isEnabled()) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dataSettingsActivity.getParentActivity());
            String M0 = org.telegram.messenger.bd.M0(2131746119, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
            s1Var.S = M0;
            s1Var.U = org.telegram.messenger.bd.M0(2131746120, null);
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131746128, null), new org.telegram.ui.ActionBar.p1(dataSettingsActivity) { // from class: org.telegram.ui.vs
                public final /* synthetic */ DataSettingsActivity b;

                {
                    this.b = dataSettingsActivity;
                }

                @Override // org.telegram.ui.ActionBar.p1
                public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i19) {
                    switch (i16) {
                        case 0:
                            DataSettingsActivity.a0(this.b);
                            break;
                        default:
                            TLRPC.TL_messages_clearAllDrafts tL_messages_clearAllDrafts = new TLRPC.TL_messages_clearAllDrafts();
                            DataSettingsActivity dataSettingsActivity2 = this.b;
                            dataSettingsActivity2.getConnectionsManager().sendRequest(tL_messages_clearAllDrafts, new l(dataSettingsActivity2, 6));
                            break;
                    }
                }
            });
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
            dataSettingsActivity.showDialog(s1Var);
            TextView textView = (TextView) s1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
                return;
            }
            return;
        }
        if (i3 == dataSettingsActivity.s) {
            dataSettingsActivity.presentFragment(new z6());
            return;
        }
        float f11 = 4.0f;
        if (i3 == ((DataSettingsActivity) dataSettingsActivity).useLessDataForCallsRow) {
            SharedPreferences e12 = org.telegram.messenger.hp.e1();
            int i19 = e12.getInt("VoipDataSaving", org.telegram.ui.Components.voip.n1.c());
            if (i19 != 0) {
                if (i19 != 1) {
                    if (i19 == 2) {
                        i13 = 3;
                    } else if (i19 == 3) {
                        i13 = 1;
                    }
                }
                Activity parentActivity = dataSettingsActivity.getParentActivity();
                String[] strArr = {org.telegram.messenger.bd.M0(2131743805, null), org.telegram.messenger.bd.M0(2131743803, null), org.telegram.messenger.bd.M0(2131743804, null), org.telegram.messenger.bd.M0(2131743806, null)};
                String M02 = org.telegram.messenger.bd.M0(2131743239, null);
                ws wsVar = new ws(dataSettingsActivity, e12, i3);
                Pattern pattern = org.telegram.ui.Components.t4.a;
                LinearLayout e10 = org.telegram.messenger.k5.e(parentActivity, 1);
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(parentActivity);
                i11 = 0;
                for (int i20 = 4; i11 < i20; i20 = 4) {
                    org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(parentActivity, null);
                    float f12 = f11;
                    i6Var.setPadding(org.telegram.messenger.g0.L(f11), 0, org.telegram.messenger.g0.L(f12), 0);
                    i6Var.setTag(Integer.valueOf(i11));
                    org.telegram.ui.Components.t4.a(i6Var, org.telegram.ui.ActionBar.k6.g7, org.telegram.ui.ActionBar.k6.E5, null);
                    i6Var.b(strArr[i11], i13 == i11);
                    e10.addView(i6Var);
                    i6Var.setOnClickListener(new org.telegram.messenger.video.g(28, alertDialog$Builder2, wsVar));
                    i11++;
                    f11 = f12;
                }
                org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.a;
                s1Var2.S = M02;
                alertDialog$Builder2.o(e10);
                alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131752589, null), null);
                dataSettingsActivity.setVisibleDialog(s1Var2);
                s1Var2.show();
                return;
            }
            i13 = 0;
            Activity parentActivity2 = dataSettingsActivity.getParentActivity();
            String[] strArr2 = {org.telegram.messenger.bd.M0(2131743805, null), org.telegram.messenger.bd.M0(2131743803, null), org.telegram.messenger.bd.M0(2131743804, null), org.telegram.messenger.bd.M0(2131743806, null)};
            String M022 = org.telegram.messenger.bd.M0(2131743239, null);
            ws wsVar2 = new ws(dataSettingsActivity, e12, i3);
            Pattern pattern2 = org.telegram.ui.Components.t4.a;
            LinearLayout e102 = org.telegram.messenger.k5.e(parentActivity2, 1);
            AlertDialog$Builder alertDialog$Builder22 = new AlertDialog$Builder(parentActivity2);
            i11 = 0;
            while (i11 < i20) {
            }
            org.telegram.ui.ActionBar.s1 s1Var22 = alertDialog$Builder22.a;
            s1Var22.S = M022;
            alertDialog$Builder22.o(e102);
            alertDialog$Builder22.k(org.telegram.messenger.bd.M0(2131752589, null), null);
            dataSettingsActivity.setVisibleDialog(s1Var22);
            s1Var22.show();
            return;
        }
        if (i3 == dataSettingsActivity.w) {
            dataSettingsActivity.presentFragment(new ht());
            return;
        }
        if (i3 != dataSettingsActivity.n) {
            if (i3 == ((DataSettingsActivity) dataSettingsActivity).proxyRow) {
                dataSettingsActivity.presentFragment(new ProxyListActivity());
                return;
            }
            if (i3 == dataSettingsActivity.E) {
                org.telegram.messenger.az.B0 = !org.telegram.messenger.az.B0;
                SharedPreferences.Editor edit2 = org.telegram.messenger.hp.e1().edit();
                edit2.putBoolean("streamMedia", org.telegram.messenger.az.B0);
                edit2.apply();
                ((org.telegram.ui.Cells.q8) view).setChecked(org.telegram.messenger.az.B0);
                return;
            }
            if (i3 == dataSettingsActivity.G) {
                org.telegram.messenger.az.C0 = !org.telegram.messenger.az.C0;
                SharedPreferences.Editor edit3 = org.telegram.messenger.hp.e1().edit();
                edit3.putBoolean("streamAllVideo", org.telegram.messenger.az.C0);
                edit3.apply();
                ((org.telegram.ui.Cells.q8) view).setChecked(org.telegram.messenger.az.C0);
                return;
            }
            if (i3 == dataSettingsActivity.H) {
                org.telegram.messenger.az.D0 = !org.telegram.messenger.az.D0;
                SharedPreferences.Editor edit4 = org.telegram.messenger.hp.e1().edit();
                edit4.putBoolean("streamMkv", org.telegram.messenger.az.D0);
                edit4.apply();
                ((org.telegram.ui.Cells.q8) view).setChecked(org.telegram.messenger.az.D0);
                return;
            }
            if (i3 == dataSettingsActivity.F) {
                org.telegram.messenger.az.E0 = !org.telegram.messenger.az.E0;
                SharedPreferences.Editor edit5 = org.telegram.messenger.hp.e1().edit();
                edit5.putBoolean("saveStreamMedia", org.telegram.messenger.az.E0);
                edit5.apply();
                ((org.telegram.ui.Cells.q8) view).setChecked(org.telegram.messenger.az.E0);
                return;
            }
            if (i3 == dataSettingsActivity.K) {
                int i21 = org.telegram.messenger.az.a;
                org.telegram.messenger.lc.i = !org.telegram.messenger.lc.e(2048) ? org.telegram.messenger.lc.d(true) | 2048 : org.telegram.messenger.lc.d(true) & (-2049);
                org.telegram.messenger.lc.k();
                if (view instanceof org.telegram.ui.Cells.q8) {
                    ((org.telegram.ui.Cells.q8) view).setChecked(org.telegram.messenger.lc.e(2048));
                    return;
                }
                return;
            }
            if (i3 == dataSettingsActivity.L) {
                int i22 = org.telegram.messenger.az.a;
                org.telegram.messenger.lc.i = !org.telegram.messenger.lc.e(1024) ? org.telegram.messenger.lc.d(true) | 1024 : org.telegram.messenger.lc.d(true) & (-1025);
                org.telegram.messenger.lc.k();
                if (view instanceof org.telegram.ui.Cells.q8) {
                    ((org.telegram.ui.Cells.q8) view).setChecked(org.telegram.messenger.lc.e(1024));
                    return;
                }
                return;
            }
            if (i3 == ((DataSettingsActivity) dataSettingsActivity).clearDraftsRow) {
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(dataSettingsActivity.getParentActivity());
                String M03 = org.telegram.messenger.bd.M0(2131754117, null);
                org.telegram.ui.ActionBar.s1 s1Var3 = alertDialog$Builder3.a;
                s1Var3.S = M03;
                s1Var3.U = org.telegram.messenger.bd.M0(2131754118, null);
                final int i23 = 1;
                alertDialog$Builder3.k(org.telegram.messenger.bd.M0(2131751599, null), new org.telegram.ui.ActionBar.p1(dataSettingsActivity) { // from class: org.telegram.ui.vs
                    public final /* synthetic */ DataSettingsActivity b;

                    {
                        this.b = dataSettingsActivity;
                    }

                    @Override // org.telegram.ui.ActionBar.p1
                    public final void g(org.telegram.ui.ActionBar.s1 s1Var23, int i192) {
                        switch (i23) {
                            case 0:
                                DataSettingsActivity.a0(this.b);
                                break;
                            default:
                                TLRPC.TL_messages_clearAllDrafts tL_messages_clearAllDrafts = new TLRPC.TL_messages_clearAllDrafts();
                                DataSettingsActivity dataSettingsActivity2 = this.b;
                                dataSettingsActivity2.getConnectionsManager().sendRequest(tL_messages_clearAllDrafts, new l(dataSettingsActivity2, 6));
                                break;
                        }
                    }
                });
                alertDialog$Builder3.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                dataSettingsActivity.showDialog(s1Var3);
                TextView textView2 = (TextView) s1Var3.d(-1);
                if (textView2 != null) {
                    org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.q7, null);
                    return;
                }
                return;
            }
            return;
        }
        ?? alertDialog$Builder4 = new AlertDialog$Builder(dataSettingsActivity.getParentActivity());
        String M04 = org.telegram.messenger.bd.M0(2131744830, null);
        org.telegram.ui.ActionBar.s1 s1Var4 = alertDialog$Builder4.a;
        s1Var4.S = M04;
        LinearLayout linearLayout2 = new LinearLayout(dataSettingsActivity.getParentActivity());
        linearLayout2.setOrientation(1);
        alertDialog$Builder4.o(linearLayout2);
        String absolutePath = ((File) dataSettingsActivity.c.get(0)).getAbsolutePath();
        if (!TextUtils.isEmpty(org.telegram.messenger.az.h0)) {
            int size2 = dataSettingsActivity.c.size();
            for (int i24 = 0; i24 < size2; i24++) {
                String absolutePath2 = ((File) dataSettingsActivity.c.get(i24)).getAbsolutePath();
                if (absolutePath2.startsWith(org.telegram.messenger.az.h0)) {
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
                i10 = 0;
                while (i10 < size) {
                    File file = (File) dataSettingsActivity.c.get(i10);
                    int i25 = i10;
                    String absolutePath3 = file.getAbsolutePath();
                    org.telegram.ui.Cells.r4 r4Var = new org.telegram.ui.Cells.r4(context);
                    int i26 = i14;
                    r4Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
                    r4Var.setTag(Integer.valueOf(i25));
                    boolean contains = absolutePath3.contains("/storage/emulated/");
                    if (!z10 || contains) {
                        ?? r112 = obj;
                        linearLayout = linearLayout2;
                        if (contains) {
                            Object[] objArr = new Object[i26];
                            objArr[0] = org.telegram.messenger.g0.i0(file.getFreeSpace(), false, false);
                            a02 = org.telegram.messenger.bd.a0(r112, r112, 2131744828, objArr);
                            r11 = r112;
                        } else {
                            Object[] objArr2 = new Object[i26];
                            objArr2[0] = org.telegram.messenger.g0.i0(file.getFreeSpace(), false, false);
                            a02 = org.telegram.messenger.bd.a0(r112, r112, 2131744829, objArr2);
                            r11 = r112;
                        }
                    } else {
                        linearLayout = linearLayout2;
                        Object[] objArr3 = new Object[i13];
                        objArr3[0] = org.telegram.messenger.g0.i0(file.getFreeSpace(), false, false);
                        objArr3[i26] = absolutePath3;
                        r11 = 0;
                        a02 = org.telegram.messenger.bd.a0(null, null, 2131744827, objArr3);
                    }
                    r4Var.b.setText(org.telegram.messenger.bd.M0(contains ? 2131749196 : 2131745850, r11));
                    r4Var.c.setText(a02);
                    RadioButton radioButton = r4Var.a;
                    radioButton.a(false, false);
                    r4Var.e = r11;
                    r4Var.d = false;
                    radioButton.a(absolutePath3.startsWith(str3), false);
                    r4Var.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(r11, org.telegram.ui.ActionBar.k6.I5, false), 2, -1));
                    ?? r72 = linearLayout;
                    r72.addView(r4Var);
                    r4Var.setOnClickListener(new ei.u3(dataSettingsActivity, absolutePath3, contains, alertDialog$Builder4, 1));
                    i10 = i25 + 1;
                    linearLayout2 = r72;
                    i13 = 2;
                    size = size;
                    obj = r11;
                    i14 = 1;
                    i18 = 2131752589;
                }
                ?? r113 = obj;
                alertDialog$Builder4.h(org.telegram.messenger.bd.M0(i18, r113), r113);
                dataSettingsActivity.showDialog(s1Var4);
            }
        }
        z11 = true;
        z10 = z11;
        size = dataSettingsActivity.c.size();
        i10 = 0;
        while (i10 < size) {
        }
        ?? r1132 = obj;
        alertDialog$Builder4.h(org.telegram.messenger.bd.M0(i18, r1132), r1132);
        dataSettingsActivity.showDialog(s1Var4);
    }

    public static void a0(DataSettingsActivity dataSettingsActivity) {
        org.telegram.messenger.y5 y5Var;
        org.telegram.messenger.y5 y5Var2;
        String str;
        SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(dataSettingsActivity.currentAccount).e7.edit();
        for (int i3 = 0; i3 < 3; i3++) {
            if (i3 == 0) {
                y5Var = org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).N;
                y5Var2 = org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).L;
                str = "mobilePreset";
            } else if (i3 == 1) {
                y5Var = org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).O;
                y5Var2 = org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).M;
                str = "wifiPreset";
            } else {
                y5Var = org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).P;
                y5Var2 = org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).K;
                str = "roamingPreset";
            }
            y5Var.c(y5Var2);
            y5Var.g = y5Var2.b();
            org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).Q = 3;
            edit.putInt("currentMobilePreset", 3);
            org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).R = 3;
            edit.putInt("currentWifiPreset", 3);
            org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).S = 3;
            edit.putInt("currentRoamingPreset", 3);
            edit.putString(str, y5Var.toString());
        }
        edit.commit();
        org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).g();
        for (int i10 = 0; i10 < 3; i10++) {
            org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).w(i10);
        }
        dataSettingsActivity.a.k(dataSettingsActivity.e, 4);
        dataSettingsActivity.t0(false);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131751678, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new o9(this, 25));
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).U0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.a = new n4(9, this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        xs xsVar = new xs(0, context, this);
        this.b = xsVar;
        xsVar.r1();
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setLayoutManager(new u4.b0(1, false));
        frameLayout.addView(this.b, b8.mf.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setSectionsDrawBackground(true);
        this.b.setOnItemClickListener(new org.telegram.ui.Components.i41(7, this, context));
        u4.k kVar = new u4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.xq.h);
        kVar.C = false;
        kVar.m = false;
        this.b.setItemAnimator(kVar);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 16, new Class[]{org.telegram.ui.Cells.v9.class, org.telegram.ui.Cells.q8.class, org.telegram.ui.Cells.n4.class, org.telegram.ui.Cells.h5.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
        int i3 = org.telegram.ui.ActionBar.k6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        int i10 = org.telegram.ui.ActionBar.k6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.messenger.z5.q(this.currentAccount).g();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.z5.q(this.currentAccount).s(true);
        t0(true);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        z6.i0 = true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        us usVar = new us(this, 1);
        org.telegram.messenger.g0.i3(usVar, 100L);
        z6.m0(new ci.u1(this, usVar, System.currentTimeMillis(), 1));
        if (this.b != null && this.a != null) {
            for (int i3 = 0; i3 < this.b.getChildCount(); i3++) {
                View childAt = this.b.getChildAt(i3);
                u4.d1 T = this.b.T(childAt);
                if (T != null) {
                    n4 n4Var = this.a;
                    this.b.getClass();
                    n4Var.t(T, RecyclerView.R(childAt));
                }
            }
        }
        t0(false);
    }

    public final void s0(int i3) {
        if (this.b == null || this.a == null) {
            return;
        }
        for (int i10 = 0; i10 < this.b.getChildCount(); i10++) {
            u4.d1 T = this.b.T(this.b.getChildAt(i10));
            if (T != null && T.b() == i3) {
                this.a.t(T, i3);
                return;
            }
        }
    }

    public final void t0(boolean z10) {
        int i3;
        this.s = 1;
        this.U = 3;
        this.w = 2;
        this.n = -1;
        ArrayList d12 = org.telegram.messenger.g0.d1();
        this.c = d12;
        if (d12.size() > 1) {
            int i10 = this.U;
            this.U = i10 + 1;
            this.n = i10;
        }
        int i11 = this.U;
        this.x = i11;
        this.d = i11 + 1;
        this.e = i11 + 2;
        this.h = i11 + 3;
        this.U = i11 + 5;
        this.f = i11 + 4;
        org.telegram.messenger.z5 downloadController = getDownloadController();
        org.telegram.messenger.y5 y5Var = downloadController.K;
        org.telegram.messenger.y5 y5Var2 = downloadController.M;
        org.telegram.messenger.y5 y5Var3 = downloadController.L;
        boolean z11 = y5Var.a(downloadController.o()) && downloadController.K.b() == downloadController.P.g && y5Var3.a(downloadController.n()) && y5Var3.b() == downloadController.N.g && y5Var2.a(downloadController.p()) && y5Var2.b() == downloadController.O.g;
        int i12 = this.resetDownloadRow;
        if (z11) {
            i3 = -1;
        } else {
            i3 = this.U;
            this.U = i3 + 1;
        }
        this.resetDownloadRow = i3;
        n4 n4Var = this.a;
        if (n4Var != null && !z10) {
            if (i12 < 0 && i3 >= 0) {
                n4Var.g(this.f);
                this.a.i(this.resetDownloadRow);
            } else if (i12 < 0 || i3 >= 0) {
                z10 = true;
            } else {
                n4Var.g(this.f);
                this.a.s(i12);
            }
        }
        int i13 = this.U;
        this.r = i13;
        this.S = i13 + 1;
        this.saveToGalleryPeerRow = i13 + 2;
        this.saveToGalleryGroupsRow = i13 + 3;
        this.saveToGalleryChannelsRow = i13 + 4;
        this.T = i13 + 5;
        this.y = i13 + 6;
        int i14 = i13 + 8;
        this.U = i14;
        this.E = i13 + 7;
        boolean z12 = org.telegram.messenger.r2.a;
        this.H = i14;
        this.G = i13 + 9;
        this.I = i13 + 10;
        this.F = -1;
        this.N = i13 + 11;
        this.useLessDataForCallsRow = i13 + 12;
        this.O = i13 + 13;
        this.P = i13 + 14;
        this.proxyRow = i13 + 15;
        this.Q = i13 + 16;
        this.clearDraftsRow = i13 + 17;
        this.U = i13 + 19;
        this.R = i13 + 18;
        n4 n4Var2 = this.a;
        if (n4Var2 == null || !z10) {
            return;
        }
        n4Var2.f();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
