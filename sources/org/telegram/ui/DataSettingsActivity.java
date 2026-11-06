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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public class DataSettingsActivity extends org.telegram.ui.ActionBar.f2 {
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
    public l4 a;
    public zs b;
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
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.String, org.telegram.ui.ActionBar.r1] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v6, types: [boolean[], java.lang.String, org.telegram.messenger.ed] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.lang.Object, org.telegram.ui.ActionBar.f2, org.telegram.ui.DataSettingsActivity] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, org.telegram.ui.ActionBar.AlertDialog$Builder] */
    /* JADX WARN: Type inference failed for: r7v21, types: [android.view.ViewGroup] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Z(final DataSettingsActivity dataSettingsActivity, Context context, View view, int i7, float f10) {
        org.telegram.messenger.y5 y5Var;
        org.telegram.messenger.y5 y5Var2;
        String str;
        String str2;
        String str3;
        boolean z9;
        int size;
        int i10;
        LinearLayout linearLayout;
        String a02;
        ?? r11;
        boolean z10;
        int i11;
        int i12 = ((DataSettingsActivity) dataSettingsActivity).saveToGalleryGroupsRow;
        int i13 = 2;
        int i14 = 1;
        if (i7 == i12 || i7 == ((DataSettingsActivity) dataSettingsActivity).saveToGalleryChannelsRow || i7 == ((DataSettingsActivity) dataSettingsActivity).saveToGalleryPeerRow) {
            int i15 = i7 == i12 ? 2 : i7 == ((DataSettingsActivity) dataSettingsActivity).saveToGalleryChannelsRow ? 4 : 1;
            if ((!org.telegram.messenger.hd.a0 || f10 > org.telegram.messenger.g0.L(76.0f)) && (org.telegram.messenger.hd.a0 || f10 < view.getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f))) {
                dataSettingsActivity.presentFragment(new SaveToGallerySettingsActivity(rf.b.f(i15, TeXSymbolParser.TYPE_ATTR)));
                return;
            } else {
                org.telegram.messenger.b6.f(i15).b();
                org.telegram.messenger.g0.b4(dataSettingsActivity.b);
                return;
            }
        }
        final int i16 = 0;
        if (i7 == dataSettingsActivity.e || i7 == dataSettingsActivity.f || i7 == dataSettingsActivity.h) {
            int i17 = 2;
            if ((!org.telegram.messenger.hd.a0 || f10 > org.telegram.messenger.g0.L(76.0f)) && (org.telegram.messenger.hd.a0 || f10 < view.getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f))) {
                dataSettingsActivity.presentFragment(new DataAutoDownloadActivity(i7 == dataSettingsActivity.e ? 0 : i7 == dataSettingsActivity.h ? 1 : 2));
                return;
            }
            dataSettingsActivity.a.getClass();
            org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view;
            boolean z11 = h5Var.e.h;
            if (i7 == dataSettingsActivity.e) {
                y5Var = org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).M;
                y5Var2 = org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).K;
                str = "mobilePreset";
                str2 = "currentMobilePreset";
                i17 = 0;
            } else if (i7 == dataSettingsActivity.h) {
                y5Var = org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).N;
                y5Var2 = org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).L;
                str = "wifiPreset";
                str2 = "currentWifiPreset";
                i17 = 1;
            } else {
                y5Var = org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).O;
                y5Var2 = org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).J;
                str = "roamingPreset";
                str2 = "currentRoamingPreset";
            }
            if (z11 || !y5Var.g) {
                y5Var.g = !y5Var.g;
            } else {
                y5Var.c(y5Var2);
            }
            SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(dataSettingsActivity.currentAccount).e7.edit();
            edit.putString(str, y5Var.toString());
            edit.putInt(str2, 3);
            edit.commit();
            h5Var.setChecked(!z11);
            v4.d1 G = dataSettingsActivity.b.G(view);
            if (G != null) {
                dataSettingsActivity.a.t(G, i7);
            }
            org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).g();
            org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).w(i17);
            dataSettingsActivity.t0(false);
            return;
        }
        int i18 = 2131752589;
        Object obj = null;
        if (i7 == ((DataSettingsActivity) dataSettingsActivity).resetDownloadRow) {
            if (dataSettingsActivity.getParentActivity() == null || !view.isEnabled()) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dataSettingsActivity.getParentActivity());
            String M0 = org.telegram.messenger.hd.M0(2131746110, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.hd.M0(2131746111, null);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746119, null), new org.telegram.ui.ActionBar.r1(dataSettingsActivity) { // from class: org.telegram.ui.xs
                public final /* synthetic */ DataSettingsActivity b;

                {
                    this.b = dataSettingsActivity;
                }

                @Override // org.telegram.ui.ActionBar.r1
                public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i19) {
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
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            dataSettingsActivity.showDialog(u1Var);
            TextView textView = (TextView) u1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
                return;
            }
            return;
        }
        if (i7 == dataSettingsActivity.s) {
            dataSettingsActivity.presentFragment(new y6());
            return;
        }
        float f11 = 4.0f;
        if (i7 == ((DataSettingsActivity) dataSettingsActivity).useLessDataForCallsRow) {
            SharedPreferences e12 = org.telegram.messenger.qp.e1();
            int i19 = e12.getInt("VoipDataSaving", org.telegram.ui.Components.voip.y1.c());
            if (i19 != 0) {
                if (i19 != 1) {
                    if (i19 == 2) {
                        i13 = 3;
                    } else if (i19 == 3) {
                        i13 = 1;
                    }
                }
                Activity parentActivity = dataSettingsActivity.getParentActivity();
                String[] strArr = {org.telegram.messenger.hd.M0(2131743796, null), org.telegram.messenger.hd.M0(2131743794, null), org.telegram.messenger.hd.M0(2131743795, null), org.telegram.messenger.hd.M0(2131743797, null)};
                String M02 = org.telegram.messenger.hd.M0(2131743230, null);
                ys ysVar = new ys(dataSettingsActivity, e12, i7);
                Pattern pattern = org.telegram.ui.Components.v4.a;
                LinearLayout e10 = org.telegram.messenger.k5.e(parentActivity, 1);
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(parentActivity);
                i11 = 0;
                for (int i20 = 4; i11 < i20; i20 = 4) {
                    org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(parentActivity, null);
                    float f12 = f11;
                    j6Var.setPadding(org.telegram.messenger.g0.L(f11), 0, org.telegram.messenger.g0.L(f12), 0);
                    j6Var.setTag(Integer.valueOf(i11));
                    org.telegram.ui.Components.v4.a(j6Var, org.telegram.ui.ActionBar.k6.g7, org.telegram.ui.ActionBar.k6.E5, null);
                    j6Var.b(strArr[i11], i13 == i11);
                    e10.addView(j6Var);
                    j6Var.setOnClickListener(new org.telegram.ui.ActionBar.l1(22, alertDialog$Builder2, ysVar));
                    i11++;
                    f11 = f12;
                }
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                u1Var2.R = M02;
                alertDialog$Builder2.o(e10);
                alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131752589, null), null);
                dataSettingsActivity.setVisibleDialog(u1Var2);
                u1Var2.show();
                return;
            }
            i13 = 0;
            Activity parentActivity2 = dataSettingsActivity.getParentActivity();
            String[] strArr2 = {org.telegram.messenger.hd.M0(2131743796, null), org.telegram.messenger.hd.M0(2131743794, null), org.telegram.messenger.hd.M0(2131743795, null), org.telegram.messenger.hd.M0(2131743797, null)};
            String M022 = org.telegram.messenger.hd.M0(2131743230, null);
            ys ysVar2 = new ys(dataSettingsActivity, e12, i7);
            Pattern pattern2 = org.telegram.ui.Components.v4.a;
            LinearLayout e102 = org.telegram.messenger.k5.e(parentActivity2, 1);
            AlertDialog$Builder alertDialog$Builder22 = new AlertDialog$Builder(parentActivity2);
            i11 = 0;
            while (i11 < i20) {
            }
            org.telegram.ui.ActionBar.u1 u1Var22 = alertDialog$Builder22.a;
            u1Var22.R = M022;
            alertDialog$Builder22.o(e102);
            alertDialog$Builder22.k(org.telegram.messenger.hd.M0(2131752589, null), null);
            dataSettingsActivity.setVisibleDialog(u1Var22);
            u1Var22.show();
            return;
        }
        if (i7 == dataSettingsActivity.w) {
            dataSettingsActivity.presentFragment(new kt());
            return;
        }
        if (i7 != dataSettingsActivity.n) {
            if (i7 == ((DataSettingsActivity) dataSettingsActivity).proxyRow) {
                dataSettingsActivity.presentFragment(new ProxyListActivity());
                return;
            }
            if (i7 == dataSettingsActivity.D) {
                org.telegram.messenger.iz.B0 = !org.telegram.messenger.iz.B0;
                SharedPreferences.Editor edit2 = org.telegram.messenger.qp.e1().edit();
                edit2.putBoolean("streamMedia", org.telegram.messenger.iz.B0);
                edit2.apply();
                ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.iz.B0);
                return;
            }
            if (i7 == dataSettingsActivity.F) {
                org.telegram.messenger.iz.C0 = !org.telegram.messenger.iz.C0;
                SharedPreferences.Editor edit3 = org.telegram.messenger.qp.e1().edit();
                edit3.putBoolean("streamAllVideo", org.telegram.messenger.iz.C0);
                edit3.apply();
                ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.iz.C0);
                return;
            }
            if (i7 == dataSettingsActivity.G) {
                org.telegram.messenger.iz.D0 = !org.telegram.messenger.iz.D0;
                SharedPreferences.Editor edit4 = org.telegram.messenger.qp.e1().edit();
                edit4.putBoolean("streamMkv", org.telegram.messenger.iz.D0);
                edit4.apply();
                ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.iz.D0);
                return;
            }
            if (i7 == dataSettingsActivity.E) {
                org.telegram.messenger.iz.E0 = !org.telegram.messenger.iz.E0;
                SharedPreferences.Editor edit5 = org.telegram.messenger.qp.e1().edit();
                edit5.putBoolean("saveStreamMedia", org.telegram.messenger.iz.E0);
                edit5.apply();
                ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.iz.E0);
                return;
            }
            if (i7 == dataSettingsActivity.J) {
                int i21 = org.telegram.messenger.iz.a;
                org.telegram.messenger.rc.i = !org.telegram.messenger.rc.e(2048) ? org.telegram.messenger.rc.d(true) | 2048 : org.telegram.messenger.rc.d(true) & (-2049);
                org.telegram.messenger.rc.k();
                if (view instanceof org.telegram.ui.Cells.r8) {
                    ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.rc.e(2048));
                    return;
                }
                return;
            }
            if (i7 == dataSettingsActivity.K) {
                int i22 = org.telegram.messenger.iz.a;
                org.telegram.messenger.rc.i = !org.telegram.messenger.rc.e(1024) ? org.telegram.messenger.rc.d(true) | 1024 : org.telegram.messenger.rc.d(true) & (-1025);
                org.telegram.messenger.rc.k();
                if (view instanceof org.telegram.ui.Cells.r8) {
                    ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.rc.e(1024));
                    return;
                }
                return;
            }
            if (i7 == ((DataSettingsActivity) dataSettingsActivity).clearDraftsRow) {
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(dataSettingsActivity.getParentActivity());
                String M03 = org.telegram.messenger.hd.M0(2131754117, null);
                org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder3.a;
                u1Var3.R = M03;
                u1Var3.T = org.telegram.messenger.hd.M0(2131754118, null);
                final int i23 = 1;
                alertDialog$Builder3.k(org.telegram.messenger.hd.M0(2131751599, null), new org.telegram.ui.ActionBar.r1(dataSettingsActivity) { // from class: org.telegram.ui.xs
                    public final /* synthetic */ DataSettingsActivity b;

                    {
                        this.b = dataSettingsActivity;
                    }

                    @Override // org.telegram.ui.ActionBar.r1
                    public final void g(org.telegram.ui.ActionBar.u1 u1Var23, int i192) {
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
                alertDialog$Builder3.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                dataSettingsActivity.showDialog(u1Var3);
                TextView textView2 = (TextView) u1Var3.d(-1);
                if (textView2 != null) {
                    org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.q7, null);
                    return;
                }
                return;
            }
            return;
        }
        ?? alertDialog$Builder4 = new AlertDialog$Builder(dataSettingsActivity.getParentActivity());
        String M04 = org.telegram.messenger.hd.M0(2131744821, null);
        org.telegram.ui.ActionBar.u1 u1Var4 = alertDialog$Builder4.a;
        u1Var4.R = M04;
        LinearLayout linearLayout2 = new LinearLayout(dataSettingsActivity.getParentActivity());
        linearLayout2.setOrientation(1);
        alertDialog$Builder4.o(linearLayout2);
        String absolutePath = ((File) dataSettingsActivity.c.get(0)).getAbsolutePath();
        if (!TextUtils.isEmpty(org.telegram.messenger.iz.h0)) {
            int size2 = dataSettingsActivity.c.size();
            for (int i24 = 0; i24 < size2; i24++) {
                String absolutePath2 = ((File) dataSettingsActivity.c.get(i24)).getAbsolutePath();
                if (absolutePath2.startsWith(org.telegram.messenger.iz.h0)) {
                    str3 = absolutePath2;
                    break;
                }
            }
        }
        str3 = absolutePath;
        try {
        } catch (Exception unused) {
            z9 = true;
        }
        if (dataSettingsActivity.c.size() == 2) {
            if (((File) dataSettingsActivity.c.get(0)).getAbsolutePath().contains("/storage/emulated/") != ((File) dataSettingsActivity.c.get(1)).getAbsolutePath().contains("/storage/emulated/")) {
                z10 = false;
                z9 = z10;
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
                    if (!z9 || contains) {
                        ?? r112 = obj;
                        linearLayout = linearLayout2;
                        if (contains) {
                            Object[] objArr = new Object[i26];
                            objArr[0] = org.telegram.messenger.g0.i0(file.getFreeSpace(), false, false);
                            a02 = org.telegram.messenger.hd.a0(r112, r112, 2131744819, objArr);
                            r11 = r112;
                        } else {
                            Object[] objArr2 = new Object[i26];
                            objArr2[0] = org.telegram.messenger.g0.i0(file.getFreeSpace(), false, false);
                            a02 = org.telegram.messenger.hd.a0(r112, r112, 2131744820, objArr2);
                            r11 = r112;
                        }
                    } else {
                        linearLayout = linearLayout2;
                        Object[] objArr3 = new Object[i13];
                        objArr3[0] = org.telegram.messenger.g0.i0(file.getFreeSpace(), false, false);
                        objArr3[i26] = absolutePath3;
                        r11 = 0;
                        a02 = org.telegram.messenger.hd.a0(null, null, 2131744818, objArr3);
                    }
                    r4Var.b.setText(org.telegram.messenger.hd.M0(contains ? 2131749187 : 2131745841, r11));
                    r4Var.c.setText(a02);
                    RadioButton radioButton = r4Var.a;
                    radioButton.a(false, false);
                    r4Var.e = r11;
                    r4Var.d = false;
                    radioButton.a(absolutePath3.startsWith(str3), false);
                    r4Var.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(r11, org.telegram.ui.ActionBar.k6.I5, false), 2, -1));
                    ?? r72 = linearLayout;
                    r72.addView(r4Var);
                    r4Var.setOnClickListener(new di.r3(dataSettingsActivity, absolutePath3, contains, alertDialog$Builder4, 1));
                    i10 = i25 + 1;
                    linearLayout2 = r72;
                    i13 = 2;
                    size = size;
                    obj = r11;
                    i14 = 1;
                    i18 = 2131752589;
                }
                ?? r113 = obj;
                alertDialog$Builder4.h(org.telegram.messenger.hd.M0(i18, r113), r113);
                dataSettingsActivity.showDialog(u1Var4);
            }
        }
        z10 = true;
        z9 = z10;
        size = dataSettingsActivity.c.size();
        i10 = 0;
        while (i10 < size) {
        }
        ?? r1132 = obj;
        alertDialog$Builder4.h(org.telegram.messenger.hd.M0(i18, r1132), r1132);
        dataSettingsActivity.showDialog(u1Var4);
    }

    public static void a0(DataSettingsActivity dataSettingsActivity) {
        org.telegram.messenger.y5 y5Var;
        org.telegram.messenger.y5 y5Var2;
        String str;
        SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(dataSettingsActivity.currentAccount).e7.edit();
        for (int i7 = 0; i7 < 3; i7++) {
            if (i7 == 0) {
                y5Var = org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).M;
                y5Var2 = org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).K;
                str = "mobilePreset";
            } else if (i7 == 1) {
                y5Var = org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).N;
                y5Var2 = org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).L;
                str = "wifiPreset";
            } else {
                y5Var = org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).O;
                y5Var2 = org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).J;
                str = "roamingPreset";
            }
            y5Var.c(y5Var2);
            y5Var.g = y5Var2.b();
            org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).P = 3;
            edit.putInt("currentMobilePreset", 3);
            org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).Q = 3;
            edit.putInt("currentWifiPreset", 3);
            org.telegram.messenger.z5.q(dataSettingsActivity.currentAccount).R = 3;
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

    @Override // org.telegram.ui.ActionBar.f2
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

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131751678, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new w9(this, 24));
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).T0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.a = new l4(9, this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        zs zsVar = new zs(0, context, this);
        this.b = zsVar;
        zsVar.r1();
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setLayoutManager(new v4.b0(1, false));
        frameLayout.addView(this.b, c8.ha.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setSectionsDrawBackground(true);
        this.b.setOnItemClickListener(new org.telegram.ui.Components.f2(27, this, context));
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.xq.h);
        kVar.C = false;
        kVar.m = false;
        this.b.setItemAnimator(kVar);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 16, new Class[]{org.telegram.ui.Cells.w9.class, org.telegram.ui.Cells.r8.class, org.telegram.ui.Cells.n4.class, org.telegram.ui.Cells.h5.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
        int i7 = org.telegram.ui.ActionBar.k6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        int i10 = org.telegram.ui.ActionBar.k6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.messenger.z5.q(this.currentAccount).g();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.z5.q(this.currentAccount).s(true);
        t0(true);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        y6.h0 = true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        ws wsVar = new ws(this, 1);
        org.telegram.messenger.g0.i3(wsVar, 100L);
        y6.m0(new bi.b2(this, wsVar, System.currentTimeMillis(), 1));
        if (this.b != null && this.a != null) {
            for (int i7 = 0; i7 < this.b.getChildCount(); i7++) {
                View childAt = this.b.getChildAt(i7);
                v4.d1 T = this.b.T(childAt);
                if (T != null) {
                    l4 l4Var = this.a;
                    this.b.getClass();
                    l4Var.t(T, RecyclerView.R(childAt));
                }
            }
        }
        t0(false);
    }

    public final void s0(int i7) {
        if (this.b == null || this.a == null) {
            return;
        }
        for (int i10 = 0; i10 < this.b.getChildCount(); i10++) {
            v4.d1 T = this.b.T(this.b.getChildAt(i10));
            if (T != null && T.b() == i7) {
                this.a.t(T, i7);
                return;
            }
        }
    }

    public final void t0(boolean z9) {
        int i7;
        this.s = 1;
        this.T = 3;
        this.w = 2;
        this.n = -1;
        ArrayList d12 = org.telegram.messenger.g0.d1();
        this.c = d12;
        if (d12.size() > 1) {
            int i10 = this.T;
            this.T = i10 + 1;
            this.n = i10;
        }
        int i11 = this.T;
        this.x = i11;
        this.d = i11 + 1;
        this.e = i11 + 2;
        this.h = i11 + 3;
        this.T = i11 + 5;
        this.f = i11 + 4;
        org.telegram.messenger.z5 downloadController = getDownloadController();
        org.telegram.messenger.y5 y5Var = downloadController.J;
        org.telegram.messenger.y5 y5Var2 = downloadController.L;
        org.telegram.messenger.y5 y5Var3 = downloadController.K;
        boolean z10 = y5Var.a(downloadController.o()) && downloadController.J.b() == downloadController.O.g && y5Var3.a(downloadController.n()) && y5Var3.b() == downloadController.M.g && y5Var2.a(downloadController.p()) && y5Var2.b() == downloadController.N.g;
        int i12 = this.resetDownloadRow;
        if (z10) {
            i7 = -1;
        } else {
            i7 = this.T;
            this.T = i7 + 1;
        }
        this.resetDownloadRow = i7;
        l4 l4Var = this.a;
        if (l4Var != null && !z9) {
            if (i12 < 0 && i7 >= 0) {
                l4Var.g(this.f);
                this.a.i(this.resetDownloadRow);
            } else if (i12 < 0 || i7 >= 0) {
                z9 = true;
            } else {
                l4Var.g(this.f);
                this.a.s(i12);
            }
        }
        int i13 = this.T;
        this.r = i13;
        this.R = i13 + 1;
        this.saveToGalleryPeerRow = i13 + 2;
        this.saveToGalleryGroupsRow = i13 + 3;
        this.saveToGalleryChannelsRow = i13 + 4;
        this.S = i13 + 5;
        this.y = i13 + 6;
        int i14 = i13 + 8;
        this.T = i14;
        this.D = i13 + 7;
        boolean z11 = org.telegram.messenger.r2.a;
        this.G = i14;
        this.F = i13 + 9;
        this.H = i13 + 10;
        this.E = -1;
        this.M = i13 + 11;
        this.useLessDataForCallsRow = i13 + 12;
        this.N = i13 + 13;
        this.O = i13 + 14;
        this.proxyRow = i13 + 15;
        this.P = i13 + 16;
        this.clearDraftsRow = i13 + 17;
        this.T = i13 + 19;
        this.Q = i13 + 18;
        l4 l4Var2 = this.a;
        if (l4Var2 == null || !z9) {
            return;
        }
        l4Var2.f();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
