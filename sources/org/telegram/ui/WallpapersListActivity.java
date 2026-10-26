package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public class WallpapersListActivity extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public static final int[][] g0 = {new int[]{-2368069, -9722489, -2762611, -7817084}, new int[]{-7487253, -4599318, -3755537, -1320977}, new int[]{-6832405, -5117462, -3755537, -1067044}, new int[]{-7676942, -7827988, -1859606, -9986835}, new int[]{-5190165, -6311702, -4461867, -5053475}, new int[]{-2430264, -6114049, -1258497, -4594945}, new int[]{-2298990, -7347754, -9985038, -8006011}, new int[]{-1399954, -990074, -876865, -1523602}, new int[]{-15438, -1916673, -6222, -471346}, new int[]{-2891798}, new int[]{-5913125}, new int[]{-9463352}, new int[]{-2956375}, new int[]{-5974898}, new int[]{-8537234}, new int[]{-1647186}, new int[]{-2769263}, new int[]{-3431303}, new int[]{-1326919}, new int[]{-2054243}, new int[]{-3573648}, new int[]{-1328696}, new int[]{-2056777}, new int[]{-2984557}, new int[]{-2440467}, new int[]{-2906649}, new int[]{-4880430}, new int[]{-4013331}, new int[]{-5921305}, new int[]{-8421424}, new int[]{-4005139}, new int[]{-5908761}, new int[]{-8406320}, new int[]{-2702663}, new int[]{-6518654}, new int[]{-16777216}};
    public static final int[][] h0 = {new int[]{-14797481, -15394250, -14924974, -14006975}, new int[]{-14867905, -14870478, -14997181, -15460815}, new int[]{-14666695, -15720408, -14861254, -15260107}, new int[]{-14932175, -15066075, -14208965, -15000799}, new int[]{-12968902, -14411460, -13029826, -15067598}, new int[]{-13885157, -12307670, -14542561, -12899018}, new int[]{-14797481, -15196106, -14924974, -15325638}, new int[]{-15658442, -15449521, -16047308, -12897955}, new int[]{-13809610, -15258855, -13221071, -15715791}, new int[]{-14865092}, new int[]{-15656154}, new int[]{-16051170}, new int[]{-14731745}, new int[]{-15524075}, new int[]{-15853808}, new int[]{-13685209}, new int[]{-14014945}, new int[]{-15132649}, new int[]{-12374480}, new int[]{-13755362}, new int[]{-14740716}, new int[]{-12374468}, new int[]{-13755352}, new int[]{-14740709}, new int[]{-12833213}, new int[]{-14083026}, new int[]{-14872031}, new int[]{-13554109}, new int[]{-14803922}, new int[]{-15461855}, new int[]{-13680833}, new int[]{-14602960}, new int[]{-15458784}, new int[]{-14211804}, new int[]{-15132906}, new int[]{-16777216}};
    public static final int[] i0 = {-16746753, -65536, -30208, -13824, -16718798, -14702165, -9240406, -409915, -9224159, -16777216, -10725281, -1};
    public static final String[] j0 = {"Blue", "Red", "Orange", "Yellow", "Green", "Teal", "Purple", "Pink", "Brown", "Black", "Gray", "White"};
    public static final int[] k0 = {R.string.Blue, R.string.Red, R.string.Orange, R.string.Yellow, R.string.Green, R.string.Teal, R.string.Purple, R.string.Pink, R.string.Brown, R.string.Black, R.string.Gray, R.string.White};
    public ci1 E;
    public org.telegram.ui.Components.mm0 F;
    public di1 G;
    public ei1 H;
    public ig.a0 I;
    public org.telegram.ui.ActionBar.y5 J;
    public org.telegram.ui.Components.uz K;
    public org.telegram.ui.ActionBar.e2 L;
    public org.telegram.ui.Components.ba1 M;
    public int N;
    public String O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public float U;
    public boolean V;
    public boolean W;
    public final ArrayList X;
    public final HashMap Y;
    public final HashMap Z;
    public int a;
    public final ArrayList a0;
    public int b;
    public final ArrayList b0;
    public int c;
    public ArrayList c0;
    public int d;
    public final HashMap d0;
    public int e;
    public final LongSparseArray e0;
    public int f;
    public boolean f0;
    public int h;
    public int n;
    public final int r;
    public Paint s;
    private int uploadImageRow;
    public Paint v;
    public bi1 w;
    public ci1 x;
    public bi1 y;

    public WallpapersListActivity(int i10) {
        super(null);
        this.N = 3;
        this.O = "";
        this.X = new ArrayList();
        this.Y = new HashMap();
        this.Z = new HashMap();
        this.a0 = new ArrayList();
        this.b0 = new ArrayList();
        this.c0 = new ArrayList();
        this.d0 = new HashMap();
        this.e0 = new LongSparseArray();
        this.r = i10;
    }

    public static void A0(ArrayList arrayList, boolean z10) {
        for (int[] iArr : z10 ? h0 : g0) {
            if (iArr.length == 1) {
                arrayList.add(new bi1(iArr[0], 0, "c", 45));
            } else {
                arrayList.add(new bi1("c", iArr[0], iArr[1], iArr[2], iArr[3]));
            }
        }
    }

    public static void V(WallpapersListActivity wallpapersListActivity, int i10) {
        if (wallpapersListActivity.getParentActivity() == null || wallpapersListActivity.F.getAdapter() == wallpapersListActivity.H) {
            return;
        }
        if (i10 == wallpapersListActivity.uploadImageRow) {
            wallpapersListActivity.M.b();
            return;
        }
        if (i10 == wallpapersListActivity.b) {
            WallpapersListActivity wallpapersListActivity2 = new WallpapersListActivity(1);
            wallpapersListActivity2.c0 = wallpapersListActivity.c0;
            wallpapersListActivity.presentFragment(wallpapersListActivity2);
        } else if (i10 == wallpapersListActivity.e) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wallpapersListActivity.getParentActivity());
            alertDialog$Builder.a.R = LocaleController.getString(R.string.ResetChatBackgroundsAlertTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.ResetChatBackgroundsAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new uh1(wallpapersListActivity));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
            wallpapersListActivity.showDialog(e2Var);
            TextView textView = (TextView) e2Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, null);
            }
        }
    }

    public static void W(WallpapersListActivity wallpapersListActivity) {
        if (wallpapersListActivity.simpleActionBar.o()) {
            wallpapersListActivity.e0.clear();
            wallpapersListActivity.simpleActionBar.n();
            wallpapersListActivity.E0();
        }
        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(wallpapersListActivity.getParentActivity(), 3, null);
        wallpapersListActivity.L = e2Var;
        e2Var.i0 = false;
        e2Var.show();
        ConnectionsManager.getInstance(wallpapersListActivity.currentAccount).sendRequest(new TL_account.resetWallPapers(), new l(wallpapersListActivity, 25));
    }

    public static void s0(WallpapersListActivity wallpapersListActivity, org.telegram.ui.Components.hj hjVar, Object obj, int i10) {
        Object obj2 = obj;
        LongSparseArray longSparseArray = wallpapersListActivity.e0;
        boolean z10 = true;
        if (wallpapersListActivity.simpleActionBar.o()) {
            Object obj3 = obj2 instanceof bi1 ? ((bi1) obj2).l : obj2;
            if (obj3 instanceof TLRPC.WallPaper) {
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj3;
                if (longSparseArray.indexOfKey(wallPaper.id) >= 0) {
                    longSparseArray.remove(wallPaper.id);
                } else {
                    longSparseArray.put(wallPaper.id, obj2);
                }
                if (longSparseArray.size() == 0) {
                    wallpapersListActivity.simpleActionBar.n();
                } else {
                    wallpapersListActivity.simpleActionBar.t(longSparseArray.size(), true);
                }
                wallpapersListActivity.f0 = false;
                hjVar.c(i10, longSparseArray.indexOfKey(wallPaper.id) >= 0, true);
                return;
            }
            return;
        }
        boolean z11 = obj2 instanceof TLRPC.TL_wallPaper;
        Bitmap bitmap = null;
        String str = z11 ? ((TLRPC.TL_wallPaper) obj2).slug : obj2 instanceof bi1 ? ((bi1) obj2).a : obj2 instanceof ci1 ? ((ci1) obj2).a : null;
        if (z11) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj2;
            if (tL_wallPaper.pattern) {
                String str2 = tL_wallPaper.slug;
                TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper.settings;
                bi1 bi1Var = new bi1(str2, wallPaperSettings.background_color, wallPaperSettings.second_background_color, wallPaperSettings.third_background_color, wallPaperSettings.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings.rotation, false), r1.intensity / 100.0f, tL_wallPaper.settings.motion, null);
                bi1Var.g = tL_wallPaper;
                bi1Var.l = tL_wallPaper;
                obj2 = bi1Var;
            }
        }
        org.telegram.ui.Components.np npVar = new org.telegram.ui.Components.np(obj2, bitmap, z10, 4);
        if (wallpapersListActivity.r == 1) {
            npVar.J1 = new uh1(wallpapersListActivity);
        }
        if (wallpapersListActivity.O.equals(str)) {
            boolean z12 = wallpapersListActivity.W;
            boolean z13 = wallpapersListActivity.V;
            float f7 = wallpapersListActivity.U;
            npVar.G1 = z12;
            npVar.F1 = z13;
            npVar.o1 = f7;
        }
        npVar.V0 = wallpapersListActivity.c0;
        if (npVar.b == 1 || (npVar.C1 instanceof bi1)) {
            ((bi1) npVar.C1).getClass();
        }
        npVar.d1(0L);
        org.telegram.ui.ActionBar.p2 p2Var = new org.telegram.ui.ActionBar.p2();
        p2Var.a = true;
        npVar.a.a = wallpapersListActivity.resourceProvider;
        p2Var.c = new u90(14);
        p2Var.e = true;
        wallpapersListActivity.showAsSheet(npVar, p2Var);
    }

    public static boolean t0(WallpapersListActivity wallpapersListActivity, org.telegram.ui.Components.hj hjVar, Object obj, int i10) {
        int i11 = wallpapersListActivity.r;
        if (i11 != 2 && i11 != 3) {
            Object obj2 = obj instanceof bi1 ? ((bi1) obj).l : obj;
            if (!wallpapersListActivity.simpleActionBar.o() && wallpapersListActivity.getParentActivity() != null && (obj2 instanceof TLRPC.WallPaper)) {
                AndroidUtilities.hideKeyboard(wallpapersListActivity.getParentActivity().getCurrentFocus());
                wallpapersListActivity.e0.put(((TLRPC.WallPaper) obj2).id, obj);
                wallpapersListActivity.simpleActionBar.t(1, false);
                wallpapersListActivity.f0 = false;
                wallpapersListActivity.simpleActionBar.x();
                hjVar.c(i10, true, true);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10, types: [org.telegram.tgnet.TLRPC$TL_wallPaper, org.telegram.tgnet.TLRPC$WallPaper] */
    /* JADX WARN: Type inference failed for: r5v11, types: [org.telegram.ui.bi1] */
    public final void B0() {
        HashMap hashMap;
        TLRPC.TL_wallPaper tL_wallPaper;
        final String str;
        final long j10;
        Object obj;
        TLRPC.TL_wallPaper tL_wallPaper2;
        TLRPC.WallPaper wallPaper;
        int i10;
        int i11;
        int i12;
        int i13;
        String str2;
        TLRPC.TL_wallPaper tL_wallPaper3;
        Object obj2;
        int i14 = this.r;
        if (i14 == 0 || i14 == 2) {
            MessagesController.getGlobalMainSettings();
            bi1 bi1Var = this.w;
            ArrayList arrayList = this.a0;
            if (bi1Var != null) {
                arrayList.remove(bi1Var);
                this.w = null;
            }
            ci1 ci1Var = this.x;
            if (ci1Var != null) {
                arrayList.remove(ci1Var);
                this.x = null;
            }
            bi1 bi1Var2 = this.y;
            if (bi1Var2 == null) {
                bi1 bi1Var3 = new bi1("d", -2368069, -9722489, -2762611, -7817084);
                this.y = bi1Var3;
                bi1Var3.h = 0.34f;
            } else {
                arrayList.remove(bi1Var2);
            }
            ci1 ci1Var2 = this.E;
            if (ci1Var2 != null) {
                arrayList.remove(ci1Var2);
            }
            int size = arrayList.size();
            int i15 = 0;
            while (true) {
                hashMap = this.Y;
                if (i15 >= size) {
                    tL_wallPaper = 0;
                    break;
                }
                Object obj3 = arrayList.get(i15);
                if (obj3 instanceof bi1) {
                    tL_wallPaper = (bi1) obj3;
                    String str3 = tL_wallPaper.a;
                    if (str3 != null) {
                        tL_wallPaper.g = (TLRPC.TL_wallPaper) hashMap.get(str3);
                    }
                    if (!"c".equals(tL_wallPaper.a)) {
                        String str4 = tL_wallPaper.a;
                        if (str4 != null && !TextUtils.equals(this.O, str4)) {
                            i15++;
                        }
                    }
                    if (this.P == tL_wallPaper.b) {
                        int i16 = this.Q;
                        if (i16 != tL_wallPaper.c) {
                            continue;
                        } else if (this.R != tL_wallPaper.d) {
                            continue;
                        } else if (this.S != tL_wallPaper.e) {
                            continue;
                        } else if (i16 == 0 || this.T == tL_wallPaper.f) {
                            break;
                        }
                    } else {
                        continue;
                    }
                    i15++;
                } else {
                    if (obj3 instanceof TLRPC.TL_wallPaper) {
                        tL_wallPaper = (TLRPC.TL_wallPaper) obj3;
                        if (tL_wallPaper.settings != null && TextUtils.equals(this.O, tL_wallPaper.slug) && this.P == org.telegram.ui.ActionBar.y6.Z0(tL_wallPaper.settings.background_color) && this.Q == org.telegram.ui.ActionBar.y6.Z0(tL_wallPaper.settings.second_background_color) && this.R == org.telegram.ui.ActionBar.y6.Z0(tL_wallPaper.settings.third_background_color) && this.S == org.telegram.ui.ActionBar.y6.Z0(tL_wallPaper.settings.fourth_background_color) && ((this.Q == 0 || this.T == AndroidUtilities.getWallpaperRotation(tL_wallPaper.settings.rotation, false)) && Math.abs(org.telegram.ui.ActionBar.y6.T0(tL_wallPaper.settings.intensity / 100.0f) - this.U) <= 0.001f)) {
                            break;
                        }
                    } else {
                        continue;
                    }
                    i15++;
                }
            }
            if (tL_wallPaper instanceof TLRPC.WallPaper) {
                TLRPC.TL_wallPaper tL_wallPaper4 = tL_wallPaper;
                org.telegram.ui.ActionBar.r6 r6Var = org.telegram.ui.ActionBar.y6.I.i0;
                TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper4.settings;
                if (wallPaperSettings != null && this.P == org.telegram.ui.ActionBar.y6.Z0(wallPaperSettings.background_color) && this.Q == org.telegram.ui.ActionBar.y6.Z0(tL_wallPaper4.settings.second_background_color) && this.R == org.telegram.ui.ActionBar.y6.Z0(tL_wallPaper4.settings.third_background_color) && this.S == org.telegram.ui.ActionBar.y6.Z0(tL_wallPaper4.settings.fourth_background_color) && (this.Q == 0 || this.R != 0 || this.T == AndroidUtilities.getWallpaperRotation(tL_wallPaper4.settings.rotation, false) || Math.abs(org.telegram.ui.ActionBar.y6.T0(tL_wallPaper4.settings.intensity / 100.0f) - this.U) <= 0.001f)) {
                    str2 = this.O;
                    tL_wallPaper3 = null;
                    obj2 = tL_wallPaper;
                } else {
                    str2 = "";
                    tL_wallPaper3 = tL_wallPaper4;
                    obj2 = null;
                }
                str = str2;
                tL_wallPaper2 = tL_wallPaper3;
                obj = obj2;
                j10 = tL_wallPaper4.id;
            } else {
                str = this.O;
                j10 = (!(tL_wallPaper instanceof bi1) || (wallPaper = tL_wallPaper.l) == null) ? 0L : wallPaper.id;
                obj = tL_wallPaper;
                tL_wallPaper2 = null;
            }
            final boolean q5 = org.telegram.ui.ActionBar.y6.C0().q();
            try {
                Collections.sort(arrayList, new Comparator() { // from class: org.telegram.ui.th1
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        ArrayList arrayList2 = WallpapersListActivity.this.X;
                        if (obj4 instanceof bi1) {
                            obj4 = ((bi1) obj4).l;
                        }
                        if (obj5 instanceof bi1) {
                            obj5 = ((bi1) obj5).l;
                        }
                        if (!(obj4 instanceof TLRPC.WallPaper) || !(obj5 instanceof TLRPC.WallPaper)) {
                            return 0;
                        }
                        TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) obj4;
                        TLRPC.WallPaper wallPaper3 = (TLRPC.WallPaper) obj5;
                        long j11 = j10;
                        if (j11 == 0) {
                            String str5 = wallPaper2.slug;
                            String str6 = str;
                            if (str6.equals(str5)) {
                                return -1;
                            }
                            if (str6.equals(wallPaper3.slug)) {
                                return 1;
                            }
                        } else {
                            if (wallPaper2.id == j11) {
                                return -1;
                            }
                            if (wallPaper3.id == j11) {
                                return 1;
                            }
                        }
                        boolean z10 = q5;
                        if (!z10) {
                            if ("qeZWES8rGVIEAAAARfWlK1lnfiI".equals(wallPaper2.slug)) {
                                return -1;
                            }
                            if ("qeZWES8rGVIEAAAARfWlK1lnfiI".equals(wallPaper3.slug)) {
                                return 1;
                            }
                        }
                        int indexOf = arrayList2.indexOf(wallPaper2);
                        int indexOf2 = arrayList2.indexOf(wallPaper3);
                        boolean z11 = wallPaper2.dark;
                        if (!(z11 && wallPaper3.dark) && (z11 || wallPaper3.dark)) {
                            return (!z11 || wallPaper3.dark) ? z10 ? 1 : -1 : z10 ? -1 : 1;
                        }
                        if (indexOf > indexOf2) {
                            return 1;
                        }
                        return indexOf < indexOf2 ? -1 : 0;
                    }
                });
            } catch (Exception e) {
                FileLog.e(e);
            }
            if (org.telegram.ui.ActionBar.y6.f1() && TextUtils.isEmpty(org.telegram.ui.ActionBar.y6.h0)) {
                if (this.E == null) {
                    ci1 ci1Var3 = new ci1();
                    ci1Var3.a = "t";
                    ci1Var3.b = -2;
                    ci1Var3.c = -2;
                    this.E = ci1Var3;
                }
                arrayList.add(0, this.E);
            } else {
                this.E = null;
            }
            org.telegram.ui.ActionBar.x6 x6Var = org.telegram.ui.ActionBar.y6.I;
            if (TextUtils.isEmpty(this.O) || (!"d".equals(this.O) && obj == null)) {
                if ("c".equals(this.O) || (i11 = this.P) == 0) {
                    int i17 = this.P;
                    if (i17 != 0) {
                        int i18 = this.Q;
                        if (i18 == 0 || (i10 = this.R) == 0) {
                            this.w = new bi1(i17, i18, this.O, this.T);
                        } else {
                            bi1 bi1Var4 = new bi1(this.O, i17, i18, i10, this.S);
                            this.w = bi1Var4;
                            bi1Var4.f = this.T;
                        }
                        arrayList.add(0, this.w);
                    } else if (x6Var.i0 != null && !hashMap.containsKey(this.O)) {
                        ci1 ci1Var4 = new ci1(new File(ApplicationLoader.getFilesDirFixed(), x6Var.i0.a), new File(ApplicationLoader.getFilesDirFixed(), x6Var.i0.b), this.O);
                        this.x = ci1Var4;
                        arrayList.add(this.E != null ? 1 : 0, ci1Var4);
                    }
                } else if (x6Var.i0 != null) {
                    bi1 bi1Var5 = new bi1(this.O, i11, this.Q, this.R, this.S, this.T, this.U, this.V, new File(ApplicationLoader.getFilesDirFixed(), x6Var.i0.a));
                    this.w = bi1Var5;
                    bi1Var5.g = tL_wallPaper2;
                    arrayList.add(0, bi1Var5);
                }
            } else if (obj == null && this.P != 0 && "c".equals(this.O)) {
                int i19 = this.Q;
                if (i19 == 0 || (i12 = this.R) == 0 || (i13 = this.S) == 0) {
                    this.w = new bi1(this.P, i19, this.O, this.T);
                } else {
                    bi1 bi1Var6 = new bi1(this.O, this.P, i19, i12, i13);
                    this.w = bi1Var6;
                    bi1Var6.f = this.T;
                }
                arrayList.add(0, this.w);
            }
            if ("d".equals(this.O) || arrayList.isEmpty()) {
                arrayList.add(0, this.y);
            } else {
                arrayList.add(1, this.y);
            }
            D0();
        }
    }

    public final void C0(boolean z10) {
        long j10 = 0;
        if (!z10) {
            ArrayList arrayList = this.X;
            int size = arrayList.size();
            long j11 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = arrayList.get(i10);
                if (obj instanceof TLRPC.WallPaper) {
                    long j12 = ((TLRPC.WallPaper) obj).id;
                    if (j12 >= 0) {
                        j11 = MediaDataController.calcHash(j11, j12);
                    }
                }
            }
            j10 = j11;
        }
        TL_account.getWallPapers getwallpapers = new TL_account.getWallPapers();
        getwallpapers.hash = j10;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new fi.m3(13, this, z10)), this.classGuid);
    }

    public final void D0() {
        this.a = 0;
        int i10 = this.r;
        if (i10 == 0) {
            this.uploadImageRow = 0;
            this.a = 2;
            this.b = 1;
            this.h = -1;
            this.n = -1;
        } else if (i10 == 2) {
            this.uploadImageRow = -1;
            this.b = -1;
            this.h = 0;
            this.a = 2;
            this.n = 1;
        } else {
            this.uploadImageRow = -1;
            this.b = -1;
            this.h = -1;
            this.n = -1;
        }
        if (this.a0.isEmpty()) {
            this.c = -1;
        } else {
            int ceil = (int) Math.ceil(r0.size() / this.N);
            this.d = ceil;
            int i11 = this.a;
            this.c = i11;
            this.a = i11 + ceil;
        }
        if (i10 == 0) {
            int i12 = this.a;
            this.e = i12;
            this.a = i12 + 2;
            this.f = i12 + 1;
        } else {
            this.e = -1;
            this.f = -1;
        }
        di1 di1Var = this.G;
        if (di1Var != null) {
            this.f0 = true;
            di1Var.l();
        }
    }

    public final void E0() {
        int childCount = this.F.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.F.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.fb) {
                org.telegram.ui.Cells.fb fbVar = (org.telegram.ui.Cells.fb) childAt;
                for (int i11 = 0; i11 < 5; i11++) {
                    fbVar.c(i11, false, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.d6));
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        int i10 = 1;
        this.s = new Paint(1);
        Paint paint = new Paint(1);
        this.v = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.v.setStyle(Paint.Style.STROKE);
        this.v.setColor(855638016);
        this.M = new org.telegram.ui.Components.ba1(getParentActivity(), this, new wh1(this));
        this.hasOwnBackground = true;
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i11 = this.r;
        if (i11 == 0) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.ChatBackground));
        } else if (i11 == 2) {
            this.simpleActionBar.setTitle("Channel Wallpaper");
        } else if (i11 == 1) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.SelectColorTitle));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new yh1(this));
        boolean z10 = false;
        if (i11 == 0) {
            org.telegram.ui.ActionBar.y5 a2 = this.simpleActionBar.j().a(0, R.drawable.outline_header_search);
            a2.N();
            a2.z0 = new zh1(this);
            this.J = a2;
            a2.setSearchFieldHint(LocaleController.getString(R.string.SearchBackgrounds));
            org.telegram.ui.ActionBar.x5 h = this.simpleActionBar.h();
            h.c(3, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f));
            h.c(4, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
            this.e0.clear();
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.F = mm0Var;
        mm0Var.u1();
        org.telegram.ui.Components.mm0 mm0Var2 = this.F;
        int i12 = org.telegram.ui.ActionBar.y6.a7;
        org.telegram.ui.ActionBar.f7.i(i12, mm0Var2, getResourceProvider());
        this.F.setHorizontalScrollBarEnabled(false);
        this.F.setVerticalScrollBarEnabled(false);
        this.F.setItemAnimator(null);
        this.F.setLayoutAnimation(null);
        org.telegram.ui.Components.mm0 mm0Var3 = this.F;
        ig.a0 a0Var = new ig.a0(i10, z10, 19);
        this.I = a0Var;
        mm0Var3.setLayoutManager(a0Var);
        frameLayout.addView(this.F, org.telegram.ui.Components.gb1.i(-1, -1, 51));
        org.telegram.ui.Components.mm0 mm0Var4 = this.F;
        di1 di1Var = new di1(this, context);
        this.G = di1Var;
        mm0Var4.setAdapter(di1Var);
        this.H = new ei1(this, context);
        org.telegram.ui.ActionBar.f7.I(this.F, org.telegram.ui.ActionBar.y6.e8, null);
        this.F.setOnItemClickListener(new m11(this, 13));
        this.F.setOnScrollListener(new x81(this, 5));
        org.telegram.ui.Components.uz uzVar = new org.telegram.ui.Components.uz(context, null);
        this.K = uzVar;
        uzVar.setVisibility(8);
        this.K.setShowAtCenter(true);
        org.telegram.ui.ActionBar.f7.i(i12, this.K, null);
        this.K.setText(LocaleController.getString(R.string.NoResult));
        this.F.setEmptyView(this.K);
        frameLayout.addView(this.K, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        D0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        ArrayList arrayList;
        bi1 bi1Var;
        HashMap hashMap;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i13;
        boolean z10;
        TLRPC.WallPaperSettings wallPaperSettings2;
        TLRPC.WallPaperSettings wallPaperSettings3;
        int i14 = 1;
        if (i10 != NotificationCenter.wallpapersDidLoad) {
            if (i10 != NotificationCenter.didSetNewWallpapper) {
                if (i10 == NotificationCenter.wallpapersNeedReload) {
                    getMessagesStorage().getWallpapers();
                    return;
                }
                return;
            }
            org.telegram.ui.Components.mm0 mm0Var = this.F;
            if (mm0Var != null) {
                mm0Var.g1();
            }
            org.telegram.ui.ActionBar.r5 r5Var = this.simpleActionBar;
            if (r5Var != null) {
                r5Var.f(true);
                return;
            }
            return;
        }
        ArrayList arrayList2 = (ArrayList) objArr[0];
        this.c0.clear();
        HashMap hashMap2 = this.d0;
        hashMap2.clear();
        HashMap hashMap3 = this.Y;
        ArrayList arrayList3 = this.b0;
        int i15 = this.r;
        HashMap hashMap4 = this.Z;
        ArrayList arrayList4 = this.a0;
        if (i15 != 1 && i15 != 2) {
            arrayList4.clear();
            arrayList3.clear();
            hashMap4.clear();
            ArrayList arrayList5 = this.X;
            arrayList5.clear();
            hashMap3.clear();
            arrayList5.addAll(arrayList2);
        }
        int size = arrayList2.size();
        int i16 = 0;
        ArrayList arrayList6 = null;
        while (i16 < size) {
            TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) arrayList2.get(i16);
            if ("fqv01SQemVIBAAAApND8LDRUhRU".equals(wallPaper.slug)) {
                arrayList = arrayList2;
                hashMap = hashMap2;
                i12 = i15;
            } else {
                if (wallPaper instanceof TLRPC.TL_wallPaper) {
                    TLRPC.Document document = wallPaper.document;
                    if (!(document instanceof TLRPC.TL_documentEmpty)) {
                        if (!wallPaper.pattern || document == null) {
                            i12 = i15;
                        } else {
                            i12 = i15;
                            if (!hashMap2.containsKey(Long.valueOf(document.id))) {
                                this.c0.add(wallPaper);
                                hashMap2.put(Long.valueOf(wallPaper.document.id), wallPaper);
                            }
                        }
                        hashMap3.put(wallPaper.slug, wallPaper);
                        if (i12 != i14 && ((!(z10 = wallPaper.pattern) || ((wallPaperSettings3 = wallPaper.settings) != null && wallPaperSettings3.background_color != 0)) && ((i12 != 2 || z10) && (org.telegram.ui.ActionBar.y6.I.q() || (wallPaperSettings2 = wallPaper.settings) == null || wallPaperSettings2.intensity >= 0)))) {
                            arrayList4.add(wallPaper);
                        }
                        arrayList = arrayList2;
                        hashMap = hashMap2;
                    }
                }
                i12 = i15;
                TLRPC.WallPaperSettings wallPaperSettings4 = wallPaper.settings;
                int i17 = wallPaperSettings4.background_color;
                if (i17 != 0) {
                    int i18 = wallPaperSettings4.second_background_color;
                    if (i18 == 0 || (i13 = wallPaperSettings4.third_background_color) == 0) {
                        arrayList = arrayList2;
                        hashMap = hashMap2;
                        bi1Var = new bi1(i17, i18, null, wallPaperSettings4.rotation);
                    } else {
                        arrayList = arrayList2;
                        bi1Var = new bi1(null, i17, i18, i13, wallPaperSettings4.fourth_background_color);
                        hashMap = hashMap2;
                    }
                    bi1Var.a = wallPaper.slug;
                    bi1Var.h = wallPaperSettings4.intensity / 100.0f;
                    bi1Var.f = AndroidUtilities.getWallpaperRotation(wallPaperSettings4.rotation, false);
                    bi1Var.l = wallPaper;
                    if (wallPaper.id < 0) {
                        String a2 = bi1Var.a();
                        if (hashMap4.containsKey(a2)) {
                            if (arrayList6 == null) {
                                arrayList6 = new ArrayList();
                            }
                            arrayList6.add(wallPaper);
                            i16++;
                            i15 = i12;
                            hashMap2 = hashMap;
                            arrayList2 = arrayList;
                            i14 = 1;
                        } else {
                            arrayList3.add(bi1Var);
                            hashMap4.put(a2, bi1Var);
                        }
                    }
                    if (org.telegram.ui.ActionBar.y6.I.q() || (wallPaperSettings = wallPaper.settings) == null || wallPaperSettings.intensity >= 0) {
                        arrayList4.add(bi1Var);
                    }
                    i16++;
                    i15 = i12;
                    hashMap2 = hashMap;
                    arrayList2 = arrayList;
                    i14 = 1;
                }
                arrayList = arrayList2;
                hashMap = hashMap2;
            }
            i16++;
            i15 = i12;
            hashMap2 = hashMap;
            arrayList2 = arrayList;
            i14 = 1;
        }
        if (arrayList6 != null) {
            int size2 = arrayList6.size();
            for (int i19 = 0; i19 < size2; i19++) {
                getMessagesStorage().deleteWallpaper(((TLRPC.WallPaper) arrayList6.get(i19)).id);
            }
        }
        this.O = org.telegram.ui.ActionBar.y6.J0();
        B0();
        C0(false);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.F;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.K, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.K, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.K, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.d6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.M.a(i10, i11, intent);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.mm0 mm0Var = this.F;
        if (mm0Var != null) {
            mm0Var.getViewTreeObserver().addOnPreDrawListener(new i7(this, 8));
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        int i10 = this.r;
        if (i10 == 0 || i10 == 2) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersDidLoad);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewWallpapper);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersNeedReload);
            getMessagesStorage().getWallpapers();
        } else {
            A0(this.a0, org.telegram.ui.ActionBar.y6.I.q());
            if (i10 == 1 && this.c0.isEmpty()) {
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersDidLoad);
                getMessagesStorage().getWallpapers();
            }
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        int i10 = this.r;
        if (i10 == 0 || i10 == 2) {
            ei1 ei1Var = this.H;
            if (ei1Var.s != 0) {
                ConnectionsManager.getInstance(ei1Var.E.currentAccount).cancelRequest(ei1Var.s, true);
                ei1Var.s = 0;
            }
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersDidLoad);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersNeedReload);
        } else if (i10 == 1) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersDidLoad);
        }
        this.M.getClass();
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onResume() {
        super.onResume();
        MessagesController.getGlobalMainSettings();
        org.telegram.ui.ActionBar.r6 r6Var = org.telegram.ui.ActionBar.y6.I.i0;
        if (r6Var != null) {
            String str = r6Var.c;
            this.O = str;
            if (str == null) {
                this.O = "";
            }
            this.P = r6Var.d;
            this.Q = r6Var.e;
            this.R = r6Var.f;
            this.S = r6Var.g;
            this.T = r6Var.h;
            this.U = r6Var.k;
            this.V = r6Var.j;
            this.W = r6Var.i;
        } else {
            this.O = org.telegram.ui.ActionBar.y6.f1() ? "t" : "d";
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 45;
            this.U = 1.0f;
            this.V = false;
            this.W = false;
        }
        B0();
        org.telegram.ui.Components.mm0 mm0Var = this.F;
        if (mm0Var != null) {
            mm0Var.getViewTreeObserver().addOnPreDrawListener(new i7(this, 8));
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void restoreSelfArgs(Bundle bundle) {
        this.M.a = bundle.getString("path");
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void saveSelfArgs(Bundle bundle) {
        String str = this.M.a;
        if (str != null) {
            bundle.putString("path", str);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
