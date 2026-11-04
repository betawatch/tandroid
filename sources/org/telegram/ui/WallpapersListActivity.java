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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class WallpapersListActivity extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public static final int[][] h0 = {new int[]{-2368069, -9722489, -2762611, -7817084}, new int[]{-7487253, -4599318, -3755537, -1320977}, new int[]{-6832405, -5117462, -3755537, -1067044}, new int[]{-7676942, -7827988, -1859606, -9986835}, new int[]{-5190165, -6311702, -4461867, -5053475}, new int[]{-2430264, -6114049, -1258497, -4594945}, new int[]{-2298990, -7347754, -9985038, -8006011}, new int[]{-1399954, -990074, -876865, -1523602}, new int[]{-15438, -1916673, -6222, -471346}, new int[]{-2891798}, new int[]{-5913125}, new int[]{-9463352}, new int[]{-2956375}, new int[]{-5974898}, new int[]{-8537234}, new int[]{-1647186}, new int[]{-2769263}, new int[]{-3431303}, new int[]{-1326919}, new int[]{-2054243}, new int[]{-3573648}, new int[]{-1328696}, new int[]{-2056777}, new int[]{-2984557}, new int[]{-2440467}, new int[]{-2906649}, new int[]{-4880430}, new int[]{-4013331}, new int[]{-5921305}, new int[]{-8421424}, new int[]{-4005139}, new int[]{-5908761}, new int[]{-8406320}, new int[]{-2702663}, new int[]{-6518654}, new int[]{-16777216}};
    public static final int[][] i0 = {new int[]{-14797481, -15394250, -14924974, -14006975}, new int[]{-14867905, -14870478, -14997181, -15460815}, new int[]{-14666695, -15720408, -14861254, -15260107}, new int[]{-14932175, -15066075, -14208965, -15000799}, new int[]{-12968902, -14411460, -13029826, -15067598}, new int[]{-13885157, -12307670, -14542561, -12899018}, new int[]{-14797481, -15196106, -14924974, -15325638}, new int[]{-15658442, -15449521, -16047308, -12897955}, new int[]{-13809610, -15258855, -13221071, -15715791}, new int[]{-14865092}, new int[]{-15656154}, new int[]{-16051170}, new int[]{-14731745}, new int[]{-15524075}, new int[]{-15853808}, new int[]{-13685209}, new int[]{-14014945}, new int[]{-15132649}, new int[]{-12374480}, new int[]{-13755362}, new int[]{-14740716}, new int[]{-12374468}, new int[]{-13755352}, new int[]{-14740709}, new int[]{-12833213}, new int[]{-14083026}, new int[]{-14872031}, new int[]{-13554109}, new int[]{-14803922}, new int[]{-15461855}, new int[]{-13680833}, new int[]{-14602960}, new int[]{-15458784}, new int[]{-14211804}, new int[]{-15132906}, new int[]{-16777216}};
    public static final int[] j0 = {-16746753, -65536, -30208, -13824, -16718798, -14702165, -9240406, -409915, -9224159, -16777216, -10725281, -1};
    public static final String[] k0 = {"Blue", "Red", "Orange", "Yellow", "Green", "Teal", "Purple", "Pink", "Brown", "Black", "Gray", "White"};
    public static final int[] l0 = {2131753676, 2131746351, 2131747776, 2131742856, 2131749511, 2131744263, 2131746584, 2131747242, 2131752879, 2131753697, 2131749512, 2131742893};
    public kc1 E;
    public lc1 F;
    public org.telegram.ui.Components.tj0 G;
    public mc1 H;
    public nc1 I;
    public kg.y J;
    public org.telegram.ui.ActionBar.f5 K;
    public org.telegram.ui.Components.gy L;
    public org.telegram.ui.ActionBar.s1 M;
    public b8.ke N;
    public int O;
    public String P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public float V;
    public boolean W;
    public boolean X;
    public final ArrayList Y;
    public final HashMap Z;
    public int a;
    public final HashMap a0;
    public int b;
    public final ArrayList b0;
    public int c;
    public final ArrayList c0;
    public int d;
    public ArrayList d0;
    public int e;
    public final HashMap e0;
    public int f;
    public final LongSparseArray f0;
    public boolean g0;
    public int h;
    public int n;
    public final int r;
    public Paint s;
    private int uploadImageRow;
    public Paint w;
    public kc1 x;
    public lc1 y;

    public WallpapersListActivity(int i3) {
        super(null);
        this.O = 3;
        this.P = "";
        this.Y = new ArrayList();
        this.Z = new HashMap();
        this.a0 = new HashMap();
        this.b0 = new ArrayList();
        this.c0 = new ArrayList();
        this.d0 = new ArrayList();
        this.e0 = new HashMap();
        this.f0 = new LongSparseArray();
        this.r = i3;
    }

    public static void E0(ArrayList arrayList, boolean z10) {
        for (int[] iArr : z10 ? i0 : h0) {
            if (iArr.length == 1) {
                arrayList.add(new kc1(iArr[0], 0, 45, "c"));
            } else {
                arrayList.add(new kc1("c", iArr[0], iArr[1], iArr[2], iArr[3]));
            }
        }
    }

    public static void Z(WallpapersListActivity wallpapersListActivity, int i3) {
        if (wallpapersListActivity.getParentActivity() == null || wallpapersListActivity.G.getAdapter() == wallpapersListActivity.I) {
            return;
        }
        if (i3 == wallpapersListActivity.uploadImageRow) {
            wallpapersListActivity.N.B();
            return;
        }
        if (i3 == wallpapersListActivity.b) {
            WallpapersListActivity wallpapersListActivity2 = new WallpapersListActivity(1);
            wallpapersListActivity2.d0 = wallpapersListActivity.d0;
            wallpapersListActivity.presentFragment(wallpapersListActivity2);
        } else if (i3 == wallpapersListActivity.e) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wallpapersListActivity.getParentActivity());
            String M0 = org.telegram.messenger.bd.M0(2131746116, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
            s1Var.S = M0;
            s1Var.U = org.telegram.messenger.bd.M0(2131746117, null);
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131746128, null), new ec1(wallpapersListActivity));
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
            wallpapersListActivity.showDialog(s1Var);
            TextView textView = (TextView) s1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
            }
        }
    }

    public static void a0(WallpapersListActivity wallpapersListActivity) {
        if (wallpapersListActivity.simpleActionBar.s()) {
            wallpapersListActivity.f0.clear();
            wallpapersListActivity.simpleActionBar.r();
            wallpapersListActivity.I0();
        }
        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, wallpapersListActivity.getParentActivity(), null);
        wallpapersListActivity.M = s1Var;
        s1Var.j0 = false;
        s1Var.show();
        ConnectionsManager.getInstance(wallpapersListActivity.currentAccount).sendRequest(new TL_account.resetWallPapers(), new l(wallpapersListActivity, 25));
    }

    public static void w0(WallpapersListActivity wallpapersListActivity, org.telegram.ui.Components.pi piVar, Object obj, int i3) {
        Object obj2 = obj;
        LongSparseArray longSparseArray = wallpapersListActivity.f0;
        boolean z10 = true;
        if (wallpapersListActivity.simpleActionBar.s()) {
            Object obj3 = obj2 instanceof kc1 ? ((kc1) obj2).l : obj2;
            if (obj3 instanceof TLRPC.WallPaper) {
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj3;
                if (longSparseArray.indexOfKey(wallPaper.id) >= 0) {
                    longSparseArray.remove(wallPaper.id);
                } else {
                    longSparseArray.put(wallPaper.id, obj2);
                }
                if (longSparseArray.size() == 0) {
                    wallpapersListActivity.simpleActionBar.r();
                } else {
                    wallpapersListActivity.simpleActionBar.x(longSparseArray.size(), true);
                }
                wallpapersListActivity.g0 = false;
                piVar.c(i3, longSparseArray.indexOfKey(wallPaper.id) >= 0, true);
                return;
            }
            return;
        }
        boolean z11 = obj2 instanceof TLRPC.TL_wallPaper;
        Bitmap bitmap = null;
        String str = z11 ? ((TLRPC.TL_wallPaper) obj2).slug : obj2 instanceof kc1 ? ((kc1) obj2).a : obj2 instanceof lc1 ? ((lc1) obj2).a : null;
        if (z11) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj2;
            if (tL_wallPaper.pattern) {
                String str2 = tL_wallPaper.slug;
                TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper.settings;
                kc1 kc1Var = new kc1(str2, wallPaperSettings.background_color, wallPaperSettings.second_background_color, wallPaperSettings.third_background_color, wallPaperSettings.fourth_background_color, org.telegram.messenger.g0.s1(wallPaperSettings.rotation, false), r1.intensity / 100.0f, tL_wallPaper.settings.motion, null);
                kc1Var.g = tL_wallPaper;
                kc1Var.l = tL_wallPaper;
                obj2 = kc1Var;
            }
        }
        org.telegram.ui.Components.lo loVar = new org.telegram.ui.Components.lo(obj2, bitmap, z10, 4);
        if (wallpapersListActivity.r == 1) {
            loVar.K1 = new ec1(wallpapersListActivity);
        }
        if (wallpapersListActivity.P.equals(str)) {
            boolean z12 = wallpapersListActivity.X;
            boolean z13 = wallpapersListActivity.W;
            float f10 = wallpapersListActivity.V;
            loVar.H1 = z12;
            loVar.G1 = z13;
            loVar.p1 = f10;
        }
        loVar.W0 = wallpapersListActivity.d0;
        if (loVar.b == 1 || (loVar.D1 instanceof kc1)) {
            ((kc1) loVar.D1).getClass();
        }
        loVar.h1(0L);
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2();
        b2Var.a = true;
        loVar.a.a = wallpapersListActivity.resourceProvider;
        b2Var.c = new hb1(5);
        b2Var.e = true;
        wallpapersListActivity.showAsSheet(loVar, b2Var);
    }

    public static boolean x0(WallpapersListActivity wallpapersListActivity, org.telegram.ui.Components.pi piVar, Object obj, int i3) {
        int i10 = wallpapersListActivity.r;
        if (i10 != 2 && i10 != 3) {
            Object obj2 = obj instanceof kc1 ? ((kc1) obj).l : obj;
            if (!wallpapersListActivity.simpleActionBar.s() && wallpapersListActivity.getParentActivity() != null && (obj2 instanceof TLRPC.WallPaper)) {
                org.telegram.messenger.g0.v1(wallpapersListActivity.getParentActivity().getCurrentFocus());
                wallpapersListActivity.f0.put(((TLRPC.WallPaper) obj2).id, obj);
                wallpapersListActivity.simpleActionBar.x(1, false);
                wallpapersListActivity.g0 = false;
                wallpapersListActivity.simpleActionBar.B();
                piVar.c(i3, true, true);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10, types: [org.telegram.tgnet.TLRPC$TL_wallPaper, org.telegram.tgnet.TLRPC$WallPaper] */
    /* JADX WARN: Type inference failed for: r5v11, types: [org.telegram.ui.kc1] */
    public final void F0() {
        HashMap hashMap;
        TLRPC.TL_wallPaper tL_wallPaper;
        final String str;
        final long j10;
        Object obj;
        TLRPC.TL_wallPaper tL_wallPaper2;
        TLRPC.WallPaper wallPaper;
        int i3;
        int i10;
        int i11;
        int i12;
        String str2;
        TLRPC.TL_wallPaper tL_wallPaper3;
        Object obj2;
        int i13 = this.r;
        if (i13 == 0 || i13 == 2) {
            org.telegram.messenger.hp.e1();
            kc1 kc1Var = this.x;
            ArrayList arrayList = this.b0;
            if (kc1Var != null) {
                arrayList.remove(kc1Var);
                this.x = null;
            }
            lc1 lc1Var = this.y;
            if (lc1Var != null) {
                arrayList.remove(lc1Var);
                this.y = null;
            }
            kc1 kc1Var2 = this.E;
            if (kc1Var2 == null) {
                kc1 kc1Var3 = new kc1("d", -2368069, -9722489, -2762611, -7817084);
                this.E = kc1Var3;
                kc1Var3.h = 0.34f;
            } else {
                arrayList.remove(kc1Var2);
            }
            lc1 lc1Var2 = this.F;
            if (lc1Var2 != null) {
                arrayList.remove(lc1Var2);
            }
            int size = arrayList.size();
            int i14 = 0;
            while (true) {
                hashMap = this.Z;
                if (i14 >= size) {
                    tL_wallPaper = 0;
                    break;
                }
                Object obj3 = arrayList.get(i14);
                if (obj3 instanceof kc1) {
                    tL_wallPaper = (kc1) obj3;
                    String str3 = tL_wallPaper.a;
                    if (str3 != null) {
                        tL_wallPaper.g = (TLRPC.TL_wallPaper) hashMap.get(str3);
                    }
                    if (!"c".equals(tL_wallPaper.a)) {
                        String str4 = tL_wallPaper.a;
                        if (str4 != null && !TextUtils.equals(this.P, str4)) {
                            i14++;
                        }
                    }
                    if (this.Q == tL_wallPaper.b) {
                        int i15 = this.R;
                        if (i15 != tL_wallPaper.c) {
                            continue;
                        } else if (this.S != tL_wallPaper.d) {
                            continue;
                        } else if (this.T != tL_wallPaper.e) {
                            continue;
                        } else if (i15 == 0 || this.U == tL_wallPaper.f) {
                            break;
                        }
                    } else {
                        continue;
                    }
                    i14++;
                } else {
                    if (obj3 instanceof TLRPC.TL_wallPaper) {
                        tL_wallPaper = (TLRPC.TL_wallPaper) obj3;
                        if (tL_wallPaper.settings != null && TextUtils.equals(this.P, tL_wallPaper.slug) && this.Q == org.telegram.ui.ActionBar.k6.a1(tL_wallPaper.settings.background_color) && this.R == org.telegram.ui.ActionBar.k6.a1(tL_wallPaper.settings.second_background_color) && this.S == org.telegram.ui.ActionBar.k6.a1(tL_wallPaper.settings.third_background_color) && this.T == org.telegram.ui.ActionBar.k6.a1(tL_wallPaper.settings.fourth_background_color) && ((this.R == 0 || this.U == org.telegram.messenger.g0.s1(tL_wallPaper.settings.rotation, false)) && Math.abs(org.telegram.ui.ActionBar.k6.U0(tL_wallPaper.settings.intensity / 100.0f) - this.V) <= 0.001f)) {
                            break;
                        }
                    } else {
                        continue;
                    }
                    i14++;
                }
            }
            if (tL_wallPaper instanceof TLRPC.WallPaper) {
                TLRPC.TL_wallPaper tL_wallPaper4 = tL_wallPaper;
                org.telegram.ui.ActionBar.b6 b6Var = org.telegram.ui.ActionBar.k6.I.j0;
                TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper4.settings;
                if (wallPaperSettings != null && this.Q == org.telegram.ui.ActionBar.k6.a1(wallPaperSettings.background_color) && this.R == org.telegram.ui.ActionBar.k6.a1(tL_wallPaper4.settings.second_background_color) && this.S == org.telegram.ui.ActionBar.k6.a1(tL_wallPaper4.settings.third_background_color) && this.T == org.telegram.ui.ActionBar.k6.a1(tL_wallPaper4.settings.fourth_background_color) && (this.R == 0 || this.S != 0 || this.U == org.telegram.messenger.g0.s1(tL_wallPaper4.settings.rotation, false) || Math.abs(org.telegram.ui.ActionBar.k6.U0(tL_wallPaper4.settings.intensity / 100.0f) - this.V) <= 0.001f)) {
                    str2 = this.P;
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
                str = this.P;
                j10 = (!(tL_wallPaper instanceof kc1) || (wallPaper = tL_wallPaper.l) == null) ? 0L : wallPaper.id;
                obj = tL_wallPaper;
                tL_wallPaper2 = null;
            }
            final boolean q10 = org.telegram.ui.ActionBar.k6.D0().q();
            try {
                Collections.sort(arrayList, new Comparator() { // from class: org.telegram.ui.dc1
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        ArrayList arrayList2 = WallpapersListActivity.this.Y;
                        if (obj4 instanceof kc1) {
                            obj4 = ((kc1) obj4).l;
                        }
                        if (obj5 instanceof kc1) {
                            obj5 = ((kc1) obj5).l;
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
                        boolean z10 = q10;
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
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            if (org.telegram.ui.ActionBar.k6.g1() && TextUtils.isEmpty(org.telegram.ui.ActionBar.k6.h0)) {
                if (this.F == null) {
                    lc1 lc1Var3 = new lc1();
                    lc1Var3.a = "t";
                    lc1Var3.b = -2;
                    lc1Var3.c = -2;
                    this.F = lc1Var3;
                }
                arrayList.add(0, this.F);
            } else {
                this.F = null;
            }
            org.telegram.ui.ActionBar.j6 j6Var = org.telegram.ui.ActionBar.k6.I;
            if (TextUtils.isEmpty(this.P) || (!"d".equals(this.P) && obj == null)) {
                if ("c".equals(this.P) || (i10 = this.Q) == 0) {
                    int i16 = this.Q;
                    if (i16 != 0) {
                        int i17 = this.R;
                        if (i17 == 0 || (i3 = this.S) == 0) {
                            this.x = new kc1(i16, i17, this.U, this.P);
                        } else {
                            kc1 kc1Var4 = new kc1(this.P, i16, i17, i3, this.T);
                            this.x = kc1Var4;
                            kc1Var4.f = this.U;
                        }
                        arrayList.add(0, this.x);
                    } else if (j6Var.j0 != null && !hashMap.containsKey(this.P)) {
                        lc1 lc1Var4 = new lc1(new File(org.telegram.messenger.t0.h(), j6Var.j0.a), new File(org.telegram.messenger.t0.h(), j6Var.j0.b), this.P);
                        this.y = lc1Var4;
                        arrayList.add(this.F != null ? 1 : 0, lc1Var4);
                    }
                } else if (j6Var.j0 != null) {
                    kc1 kc1Var5 = new kc1(this.P, i10, this.R, this.S, this.T, this.U, this.V, this.W, new File(org.telegram.messenger.t0.h(), j6Var.j0.a));
                    this.x = kc1Var5;
                    kc1Var5.g = tL_wallPaper2;
                    arrayList.add(0, kc1Var5);
                }
            } else if (obj == null && this.Q != 0 && "c".equals(this.P)) {
                int i18 = this.R;
                if (i18 == 0 || (i11 = this.S) == 0 || (i12 = this.T) == 0) {
                    this.x = new kc1(this.Q, i18, this.U, this.P);
                } else {
                    kc1 kc1Var6 = new kc1(this.P, this.Q, i18, i11, i12);
                    this.x = kc1Var6;
                    kc1Var6.f = this.U;
                }
                arrayList.add(0, this.x);
            }
            if ("d".equals(this.P) || arrayList.isEmpty()) {
                arrayList.add(0, this.E);
            } else {
                arrayList.add(1, this.E);
            }
            H0();
        }
    }

    public final void G0(boolean z10) {
        long j10 = 0;
        if (!z10) {
            ArrayList arrayList = this.Y;
            int size = arrayList.size();
            long j11 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = arrayList.get(i3);
                if (obj instanceof TLRPC.WallPaper) {
                    long j12 = ((TLRPC.WallPaper) obj).id;
                    if (j12 >= 0) {
                        j11 = org.telegram.messenger.li.p(j11, j12);
                    }
                }
            }
            j10 = j11;
        }
        TL_account.getWallPapers getwallpapers = new TL_account.getWallPapers();
        getwallpapers.hash = j10;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new gi.b3(12, this, z10)), this.classGuid);
    }

    public final void H0() {
        this.a = 0;
        int i3 = this.r;
        if (i3 == 0) {
            this.uploadImageRow = 0;
            this.a = 2;
            this.b = 1;
            this.h = -1;
            this.n = -1;
        } else if (i3 == 2) {
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
        if (this.b0.isEmpty()) {
            this.c = -1;
        } else {
            int ceil = (int) Math.ceil(r0.size() / this.O);
            this.d = ceil;
            int i10 = this.a;
            this.c = i10;
            this.a = i10 + ceil;
        }
        if (i3 == 0) {
            int i11 = this.a;
            this.e = i11;
            this.a = i11 + 2;
            this.f = i11 + 1;
        } else {
            this.e = -1;
            this.f = -1;
        }
        mc1 mc1Var = this.H;
        if (mc1Var != null) {
            this.g0 = true;
            mc1Var.f();
        }
    }

    public final void I0() {
        int childCount = this.G.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.G.getChildAt(i3);
            if (childAt instanceof org.telegram.ui.Cells.ta) {
                org.telegram.ui.Cells.ta taVar = (org.telegram.ui.Cells.ta) childAt;
                for (int i10 = 0; i10 < 5; i10++) {
                    taVar.c(i10, false, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d6));
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        int i3 = 1;
        this.s = new Paint(1);
        Paint paint = new Paint(1);
        this.w = paint;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        this.w.setStyle(Paint.Style.STROKE);
        this.w.setColor(855638016);
        this.N = new b8.ke(getParentActivity(), this, new fc1(this));
        this.hasOwnBackground = true;
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = this.r;
        if (i10 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131752244, null));
        } else if (i10 == 2) {
            this.simpleActionBar.setTitle("Channel Wallpaper");
        } else if (i10 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131745672, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new ic1(this));
        boolean z10 = false;
        if (i10 == 0) {
            org.telegram.ui.ActionBar.f5 b10 = this.simpleActionBar.o().b(0, R.drawable.outline_header_search);
            b10.N();
            b10.C0 = new lg.w1(this, 23);
            this.K = b10;
            b10.setSearchFieldHint(org.telegram.messenger.bd.M0(2131745826, null));
            org.telegram.ui.ActionBar.e5 l10 = this.simpleActionBar.l();
            l10.d(3, R.drawable.msg_forward, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.bd.M0(2131750588, null));
            l10.d(4, R.drawable.msg_delete, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.bd.M0(2131751599, null));
            this.f0.clear();
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.G = tj0Var;
        tj0Var.r1();
        org.telegram.ui.Components.tj0 tj0Var2 = this.G;
        int i11 = org.telegram.ui.ActionBar.k6.a7;
        org.telegram.ui.ActionBar.r6.i(i11, tj0Var2, getResourceProvider());
        this.G.setHorizontalScrollBarEnabled(false);
        this.G.setVerticalScrollBarEnabled(false);
        this.G.setItemAnimator(null);
        this.G.setLayoutAnimation(null);
        org.telegram.ui.Components.tj0 tj0Var3 = this.G;
        kg.y yVar = new kg.y(i3, z10, 19);
        this.J = yVar;
        tj0Var3.setLayoutManager(yVar);
        frameLayout.addView(this.G, b8.mf.e(-1, -1, 51));
        org.telegram.ui.Components.tj0 tj0Var4 = this.G;
        mc1 mc1Var = new mc1(this, context);
        this.H = mc1Var;
        tj0Var4.setAdapter(mc1Var);
        this.I = new nc1(this, context);
        org.telegram.ui.ActionBar.r6.I(this.G, org.telegram.ui.ActionBar.k6.e8, null);
        this.G.setOnItemClickListener(new nx0(this, 12));
        this.G.setOnScrollListener(new r11(this, 7));
        org.telegram.ui.Components.gy gyVar = new org.telegram.ui.Components.gy(context, null);
        this.L = gyVar;
        gyVar.setVisibility(8);
        this.L.setShowAtCenter(true);
        org.telegram.ui.ActionBar.r6.i(i11, this.L, null);
        this.L.setText(org.telegram.messenger.bd.M0(2131748175, null));
        this.G.setEmptyView(this.L);
        frameLayout.addView(this.L, b8.mf.c(-1.0f, -1));
        H0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11;
        ArrayList arrayList;
        kc1 kc1Var;
        HashMap hashMap;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i12;
        boolean z10;
        TLRPC.WallPaperSettings wallPaperSettings2;
        TLRPC.WallPaperSettings wallPaperSettings3;
        int i13 = 1;
        if (i3 != org.telegram.messenger.hs.e4) {
            if (i3 != org.telegram.messenger.hs.z4) {
                if (i3 == org.telegram.messenger.hs.f4) {
                    getMessagesStorage().p0();
                    return;
                }
                return;
            }
            org.telegram.ui.Components.tj0 tj0Var = this.G;
            if (tj0Var != null) {
                tj0Var.g1();
            }
            org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
            if (y4Var != null) {
                y4Var.j(true);
                return;
            }
            return;
        }
        ArrayList arrayList2 = (ArrayList) objArr[0];
        this.d0.clear();
        HashMap hashMap2 = this.e0;
        hashMap2.clear();
        HashMap hashMap3 = this.Z;
        ArrayList arrayList3 = this.c0;
        int i14 = this.r;
        HashMap hashMap4 = this.a0;
        ArrayList arrayList4 = this.b0;
        if (i14 != 1 && i14 != 2) {
            arrayList4.clear();
            arrayList3.clear();
            hashMap4.clear();
            ArrayList arrayList5 = this.Y;
            arrayList5.clear();
            hashMap3.clear();
            arrayList5.addAll(arrayList2);
        }
        int size = arrayList2.size();
        int i15 = 0;
        ArrayList arrayList6 = null;
        while (i15 < size) {
            TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) arrayList2.get(i15);
            if ("fqv01SQemVIBAAAApND8LDRUhRU".equals(wallPaper.slug)) {
                arrayList = arrayList2;
                hashMap = hashMap2;
                i11 = i14;
            } else {
                if (wallPaper instanceof TLRPC.TL_wallPaper) {
                    TLRPC.Document document = wallPaper.document;
                    if (!(document instanceof TLRPC.TL_documentEmpty)) {
                        if (!wallPaper.pattern || document == null) {
                            i11 = i14;
                        } else {
                            i11 = i14;
                            if (!hashMap2.containsKey(Long.valueOf(document.id))) {
                                this.d0.add(wallPaper);
                                hashMap2.put(Long.valueOf(wallPaper.document.id), wallPaper);
                            }
                        }
                        hashMap3.put(wallPaper.slug, wallPaper);
                        if (i11 != i13 && ((!(z10 = wallPaper.pattern) || ((wallPaperSettings3 = wallPaper.settings) != null && wallPaperSettings3.background_color != 0)) && ((i11 != 2 || z10) && (org.telegram.ui.ActionBar.k6.I.q() || (wallPaperSettings2 = wallPaper.settings) == null || wallPaperSettings2.intensity >= 0)))) {
                            arrayList4.add(wallPaper);
                        }
                        arrayList = arrayList2;
                        hashMap = hashMap2;
                    }
                }
                i11 = i14;
                TLRPC.WallPaperSettings wallPaperSettings4 = wallPaper.settings;
                int i16 = wallPaperSettings4.background_color;
                if (i16 != 0) {
                    int i17 = wallPaperSettings4.second_background_color;
                    if (i17 == 0 || (i12 = wallPaperSettings4.third_background_color) == 0) {
                        arrayList = arrayList2;
                        hashMap = hashMap2;
                        kc1Var = new kc1(i16, i17, wallPaperSettings4.rotation, null);
                    } else {
                        arrayList = arrayList2;
                        kc1Var = new kc1(null, i16, i17, i12, wallPaperSettings4.fourth_background_color);
                        hashMap = hashMap2;
                    }
                    kc1Var.a = wallPaper.slug;
                    kc1Var.h = wallPaperSettings4.intensity / 100.0f;
                    kc1Var.f = org.telegram.messenger.g0.s1(wallPaperSettings4.rotation, false);
                    kc1Var.l = wallPaper;
                    if (wallPaper.id < 0) {
                        String a10 = kc1Var.a();
                        if (hashMap4.containsKey(a10)) {
                            if (arrayList6 == null) {
                                arrayList6 = new ArrayList();
                            }
                            arrayList6.add(wallPaper);
                            i15++;
                            i14 = i11;
                            hashMap2 = hashMap;
                            arrayList2 = arrayList;
                            i13 = 1;
                        } else {
                            arrayList3.add(kc1Var);
                            hashMap4.put(a10, kc1Var);
                        }
                    }
                    if (org.telegram.ui.ActionBar.k6.I.q() || (wallPaperSettings = wallPaper.settings) == null || wallPaperSettings.intensity >= 0) {
                        arrayList4.add(kc1Var);
                    }
                    i15++;
                    i14 = i11;
                    hashMap2 = hashMap;
                    arrayList2 = arrayList;
                    i13 = 1;
                }
                arrayList = arrayList2;
                hashMap = hashMap2;
            }
            i15++;
            i14 = i11;
            hashMap2 = hashMap;
            arrayList2 = arrayList;
            i13 = 1;
        }
        if (arrayList6 != null) {
            int size2 = arrayList6.size();
            for (int i18 = 0; i18 < size2; i18++) {
                org.telegram.messenger.qr messagesStorage = getMessagesStorage();
                messagesStorage.a.c(new org.telegram.messenger.op(messagesStorage, ((TLRPC.WallPaper) arrayList6.get(i18)).id, 1));
            }
        }
        this.P = org.telegram.ui.ActionBar.k6.K0();
        F0();
        G0(false);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.G;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.L, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.L, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.L, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onActivityResultFragment(int i3, int i10, Intent intent) {
        this.N.u(i3, i10, intent);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.tj0 tj0Var = this.G;
        if (tj0Var != null) {
            tj0Var.getViewTreeObserver().addOnPreDrawListener(new f7(this, 6));
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        int i3 = org.telegram.messenger.hs.e4;
        int i10 = this.r;
        if (i10 == 0 || i10 == 2) {
            org.telegram.messenger.hs.e().c(this, i3);
            org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.z4);
            org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f4);
            getMessagesStorage().p0();
        } else {
            E0(this.b0, org.telegram.ui.ActionBar.k6.I.q());
            if (i10 == 1 && this.d0.isEmpty()) {
                org.telegram.messenger.hs.e().c(this, i3);
                getMessagesStorage().p0();
            }
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        int i3 = org.telegram.messenger.hs.e4;
        int i10 = this.r;
        if (i10 == 0 || i10 == 2) {
            nc1 nc1Var = this.I;
            if (nc1Var.s != 0) {
                ConnectionsManager.getInstance(nc1Var.F.currentAccount).cancelRequest(nc1Var.s, true);
                nc1Var.s = 0;
            }
            org.telegram.messenger.hs.e().n(this, i3);
            org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.z4);
            org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f4);
        } else if (i10 == 1) {
            org.telegram.messenger.hs.e().n(this, i3);
        }
        this.N.getClass();
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.hp.e1();
        org.telegram.ui.ActionBar.b6 b6Var = org.telegram.ui.ActionBar.k6.I.j0;
        if (b6Var != null) {
            String str = b6Var.c;
            this.P = str;
            if (str == null) {
                this.P = "";
            }
            this.Q = b6Var.d;
            this.R = b6Var.e;
            this.S = b6Var.f;
            this.T = b6Var.g;
            this.U = b6Var.h;
            this.V = b6Var.k;
            this.W = b6Var.j;
            this.X = b6Var.i;
        } else {
            this.P = org.telegram.ui.ActionBar.k6.g1() ? "t" : "d";
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 45;
            this.V = 1.0f;
            this.W = false;
            this.X = false;
        }
        F0();
        org.telegram.ui.Components.tj0 tj0Var = this.G;
        if (tj0Var != null) {
            tj0Var.getViewTreeObserver().addOnPreDrawListener(new f7(this, 6));
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void restoreSelfArgs(Bundle bundle) {
        this.N.b = bundle.getString("path");
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void saveSelfArgs(Bundle bundle) {
        String str = (String) this.N.b;
        if (str != null) {
            bundle.putString("path", str);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
