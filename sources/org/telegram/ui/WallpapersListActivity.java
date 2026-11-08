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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public class WallpapersListActivity extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public static final int[][] g0 = {new int[]{-2368069, -9722489, -2762611, -7817084}, new int[]{-7487253, -4599318, -3755537, -1320977}, new int[]{-6832405, -5117462, -3755537, -1067044}, new int[]{-7676942, -7827988, -1859606, -9986835}, new int[]{-5190165, -6311702, -4461867, -5053475}, new int[]{-2430264, -6114049, -1258497, -4594945}, new int[]{-2298990, -7347754, -9985038, -8006011}, new int[]{-1399954, -990074, -876865, -1523602}, new int[]{-15438, -1916673, -6222, -471346}, new int[]{-2891798}, new int[]{-5913125}, new int[]{-9463352}, new int[]{-2956375}, new int[]{-5974898}, new int[]{-8537234}, new int[]{-1647186}, new int[]{-2769263}, new int[]{-3431303}, new int[]{-1326919}, new int[]{-2054243}, new int[]{-3573648}, new int[]{-1328696}, new int[]{-2056777}, new int[]{-2984557}, new int[]{-2440467}, new int[]{-2906649}, new int[]{-4880430}, new int[]{-4013331}, new int[]{-5921305}, new int[]{-8421424}, new int[]{-4005139}, new int[]{-5908761}, new int[]{-8406320}, new int[]{-2702663}, new int[]{-6518654}, new int[]{-16777216}};
    public static final int[][] h0 = {new int[]{-14797481, -15394250, -14924974, -14006975}, new int[]{-14867905, -14870478, -14997181, -15460815}, new int[]{-14666695, -15720408, -14861254, -15260107}, new int[]{-14932175, -15066075, -14208965, -15000799}, new int[]{-12968902, -14411460, -13029826, -15067598}, new int[]{-13885157, -12307670, -14542561, -12899018}, new int[]{-14797481, -15196106, -14924974, -15325638}, new int[]{-15658442, -15449521, -16047308, -12897955}, new int[]{-13809610, -15258855, -13221071, -15715791}, new int[]{-14865092}, new int[]{-15656154}, new int[]{-16051170}, new int[]{-14731745}, new int[]{-15524075}, new int[]{-15853808}, new int[]{-13685209}, new int[]{-14014945}, new int[]{-15132649}, new int[]{-12374480}, new int[]{-13755362}, new int[]{-14740716}, new int[]{-12374468}, new int[]{-13755352}, new int[]{-14740709}, new int[]{-12833213}, new int[]{-14083026}, new int[]{-14872031}, new int[]{-13554109}, new int[]{-14803922}, new int[]{-15461855}, new int[]{-13680833}, new int[]{-14602960}, new int[]{-15458784}, new int[]{-14211804}, new int[]{-15132906}, new int[]{-16777216}};
    public static final int[] i0 = {-16746753, -65536, -30208, -13824, -16718798, -14702165, -9240406, -409915, -9224159, -16777216, -10725281, -1};
    public static final String[] j0 = {"Blue", "Red", "Orange", "Yellow", "Green", "Teal", "Purple", "Pink", "Brown", "Black", "Gray", "White"};
    public static final int[] k0 = {2131753676, 2131746344, 2131747769, 2131742849, 2131749504, 2131744256, 2131746577, 2131747235, 2131752879, 2131753697, 2131749505, 2131742886};
    public pc1 D;
    public qc1 E;
    public org.telegram.ui.Components.pj0 F;
    public rc1 G;
    public sc1 H;
    public jg.b0 I;
    public org.telegram.ui.ActionBar.f5 J;
    public org.telegram.ui.Components.jy K;
    public org.telegram.ui.ActionBar.u1 L;
    public a8.r7 M;
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
    public Paint w;
    public pc1 x;
    public qc1 y;

    public WallpapersListActivity(int i7) {
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
        this.r = i7;
    }

    public static void E0(ArrayList arrayList, boolean z9) {
        for (int[] iArr : z9 ? h0 : g0) {
            if (iArr.length == 1) {
                arrayList.add(new pc1(iArr[0], 0, 45, "c"));
            } else {
                arrayList.add(new pc1("c", iArr[0], iArr[1], iArr[2], iArr[3]));
            }
        }
    }

    public static void Z(WallpapersListActivity wallpapersListActivity, int i7) {
        if (wallpapersListActivity.getParentActivity() == null || wallpapersListActivity.F.getAdapter() == wallpapersListActivity.H) {
            return;
        }
        if (i7 == wallpapersListActivity.uploadImageRow) {
            wallpapersListActivity.M.A();
            return;
        }
        if (i7 == wallpapersListActivity.b) {
            WallpapersListActivity wallpapersListActivity2 = new WallpapersListActivity(1);
            wallpapersListActivity2.c0 = wallpapersListActivity.c0;
            wallpapersListActivity.presentFragment(wallpapersListActivity2);
        } else if (i7 == wallpapersListActivity.e) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wallpapersListActivity.getParentActivity());
            String M0 = org.telegram.messenger.id.M0(2131746109, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.id.M0(2131746110, null);
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746121, null), new kc1(wallpapersListActivity));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
            wallpapersListActivity.showDialog(u1Var);
            TextView textView = (TextView) u1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
            }
        }
    }

    public static void a0(WallpapersListActivity wallpapersListActivity) {
        if (wallpapersListActivity.simpleActionBar.s()) {
            wallpapersListActivity.e0.clear();
            wallpapersListActivity.simpleActionBar.r();
            wallpapersListActivity.I0();
        }
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, wallpapersListActivity.getParentActivity(), null);
        wallpapersListActivity.L = u1Var;
        u1Var.i0 = false;
        u1Var.show();
        ConnectionsManager.getInstance(wallpapersListActivity.currentAccount).sendRequest(new TL_account.resetWallPapers(), new l(wallpapersListActivity, 24));
    }

    public static void w0(WallpapersListActivity wallpapersListActivity, org.telegram.ui.Components.pi piVar, Object obj, int i7) {
        Object obj2 = obj;
        LongSparseArray longSparseArray = wallpapersListActivity.e0;
        boolean z9 = true;
        if (wallpapersListActivity.simpleActionBar.s()) {
            Object obj3 = obj2 instanceof pc1 ? ((pc1) obj2).l : obj2;
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
                wallpapersListActivity.f0 = false;
                piVar.c(i7, longSparseArray.indexOfKey(wallPaper.id) >= 0, true);
                return;
            }
            return;
        }
        boolean z10 = obj2 instanceof TLRPC.TL_wallPaper;
        Bitmap bitmap = null;
        String str = z10 ? ((TLRPC.TL_wallPaper) obj2).slug : obj2 instanceof pc1 ? ((pc1) obj2).a : obj2 instanceof qc1 ? ((qc1) obj2).a : null;
        if (z10) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj2;
            if (tL_wallPaper.pattern) {
                String str2 = tL_wallPaper.slug;
                TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper.settings;
                pc1 pc1Var = new pc1(str2, wallPaperSettings.background_color, wallPaperSettings.second_background_color, wallPaperSettings.third_background_color, wallPaperSettings.fourth_background_color, org.telegram.messenger.g0.s1(wallPaperSettings.rotation, false), r1.intensity / 100.0f, tL_wallPaper.settings.motion, null);
                pc1Var.g = tL_wallPaper;
                pc1Var.l = tL_wallPaper;
                obj2 = pc1Var;
            }
        }
        org.telegram.ui.Components.lo loVar = new org.telegram.ui.Components.lo(obj2, bitmap, z9, 4);
        if (wallpapersListActivity.r == 1) {
            loVar.J1 = new kc1(wallpapersListActivity);
        }
        if (wallpapersListActivity.O.equals(str)) {
            boolean z11 = wallpapersListActivity.W;
            boolean z12 = wallpapersListActivity.V;
            float f10 = wallpapersListActivity.U;
            loVar.G1 = z11;
            loVar.F1 = z12;
            loVar.o1 = f10;
        }
        loVar.V0 = wallpapersListActivity.c0;
        if (loVar.b == 1 || (loVar.C1 instanceof pc1)) {
            ((pc1) loVar.C1).getClass();
        }
        loVar.h1(0L);
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2();
        d2Var.a = true;
        loVar.a.a = wallpapersListActivity.resourceProvider;
        d2Var.c = new o61(6);
        d2Var.e = true;
        wallpapersListActivity.showAsSheet(loVar, d2Var);
    }

    public static boolean x0(WallpapersListActivity wallpapersListActivity, org.telegram.ui.Components.pi piVar, Object obj, int i7) {
        int i10 = wallpapersListActivity.r;
        if (i10 != 2 && i10 != 3) {
            Object obj2 = obj instanceof pc1 ? ((pc1) obj).l : obj;
            if (!wallpapersListActivity.simpleActionBar.s() && wallpapersListActivity.getParentActivity() != null && (obj2 instanceof TLRPC.WallPaper)) {
                org.telegram.messenger.g0.v1(wallpapersListActivity.getParentActivity().getCurrentFocus());
                wallpapersListActivity.e0.put(((TLRPC.WallPaper) obj2).id, obj);
                wallpapersListActivity.simpleActionBar.x(1, false);
                wallpapersListActivity.f0 = false;
                wallpapersListActivity.simpleActionBar.B();
                piVar.c(i7, true, true);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10, types: [org.telegram.tgnet.TLRPC$TL_wallPaper, org.telegram.tgnet.TLRPC$WallPaper] */
    /* JADX WARN: Type inference failed for: r5v11, types: [org.telegram.ui.pc1] */
    public final void F0() {
        HashMap hashMap;
        TLRPC.TL_wallPaper tL_wallPaper;
        final String str;
        final long j3;
        Object obj;
        TLRPC.TL_wallPaper tL_wallPaper2;
        TLRPC.WallPaper wallPaper;
        int i7;
        int i10;
        int i11;
        int i12;
        String str2;
        TLRPC.TL_wallPaper tL_wallPaper3;
        Object obj2;
        int i13 = this.r;
        if (i13 == 0 || i13 == 2) {
            org.telegram.messenger.qp.e1();
            pc1 pc1Var = this.x;
            ArrayList arrayList = this.a0;
            if (pc1Var != null) {
                arrayList.remove(pc1Var);
                this.x = null;
            }
            qc1 qc1Var = this.y;
            if (qc1Var != null) {
                arrayList.remove(qc1Var);
                this.y = null;
            }
            pc1 pc1Var2 = this.D;
            if (pc1Var2 == null) {
                pc1 pc1Var3 = new pc1("d", -2368069, -9722489, -2762611, -7817084);
                this.D = pc1Var3;
                pc1Var3.h = 0.34f;
            } else {
                arrayList.remove(pc1Var2);
            }
            qc1 qc1Var2 = this.E;
            if (qc1Var2 != null) {
                arrayList.remove(qc1Var2);
            }
            int size = arrayList.size();
            int i14 = 0;
            while (true) {
                hashMap = this.Y;
                if (i14 >= size) {
                    tL_wallPaper = 0;
                    break;
                }
                Object obj3 = arrayList.get(i14);
                if (obj3 instanceof pc1) {
                    tL_wallPaper = (pc1) obj3;
                    String str3 = tL_wallPaper.a;
                    if (str3 != null) {
                        tL_wallPaper.g = (TLRPC.TL_wallPaper) hashMap.get(str3);
                    }
                    if (!"c".equals(tL_wallPaper.a)) {
                        String str4 = tL_wallPaper.a;
                        if (str4 != null && !TextUtils.equals(this.O, str4)) {
                            i14++;
                        }
                    }
                    if (this.P == tL_wallPaper.b) {
                        int i15 = this.Q;
                        if (i15 != tL_wallPaper.c) {
                            continue;
                        } else if (this.R != tL_wallPaper.d) {
                            continue;
                        } else if (this.S != tL_wallPaper.e) {
                            continue;
                        } else if (i15 == 0 || this.T == tL_wallPaper.f) {
                            break;
                        }
                    } else {
                        continue;
                    }
                    i14++;
                } else {
                    if (obj3 instanceof TLRPC.TL_wallPaper) {
                        tL_wallPaper = (TLRPC.TL_wallPaper) obj3;
                        if (tL_wallPaper.settings != null && TextUtils.equals(this.O, tL_wallPaper.slug) && this.P == org.telegram.ui.ActionBar.k6.a1(tL_wallPaper.settings.background_color) && this.Q == org.telegram.ui.ActionBar.k6.a1(tL_wallPaper.settings.second_background_color) && this.R == org.telegram.ui.ActionBar.k6.a1(tL_wallPaper.settings.third_background_color) && this.S == org.telegram.ui.ActionBar.k6.a1(tL_wallPaper.settings.fourth_background_color) && ((this.Q == 0 || this.T == org.telegram.messenger.g0.s1(tL_wallPaper.settings.rotation, false)) && Math.abs(org.telegram.ui.ActionBar.k6.U0(tL_wallPaper.settings.intensity / 100.0f) - this.U) <= 0.001f)) {
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
                org.telegram.ui.ActionBar.c6 c6Var = org.telegram.ui.ActionBar.k6.I.i0;
                TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper4.settings;
                if (wallPaperSettings != null && this.P == org.telegram.ui.ActionBar.k6.a1(wallPaperSettings.background_color) && this.Q == org.telegram.ui.ActionBar.k6.a1(tL_wallPaper4.settings.second_background_color) && this.R == org.telegram.ui.ActionBar.k6.a1(tL_wallPaper4.settings.third_background_color) && this.S == org.telegram.ui.ActionBar.k6.a1(tL_wallPaper4.settings.fourth_background_color) && (this.Q == 0 || this.R != 0 || this.T == org.telegram.messenger.g0.s1(tL_wallPaper4.settings.rotation, false) || Math.abs(org.telegram.ui.ActionBar.k6.U0(tL_wallPaper4.settings.intensity / 100.0f) - this.U) <= 0.001f)) {
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
                j3 = tL_wallPaper4.id;
            } else {
                str = this.O;
                j3 = (!(tL_wallPaper instanceof pc1) || (wallPaper = tL_wallPaper.l) == null) ? 0L : wallPaper.id;
                obj = tL_wallPaper;
                tL_wallPaper2 = null;
            }
            final boolean q10 = org.telegram.ui.ActionBar.k6.D0().q();
            try {
                Collections.sort(arrayList, new Comparator() { // from class: org.telegram.ui.jc1
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        ArrayList arrayList2 = WallpapersListActivity.this.X;
                        if (obj4 instanceof pc1) {
                            obj4 = ((pc1) obj4).l;
                        }
                        if (obj5 instanceof pc1) {
                            obj5 = ((pc1) obj5).l;
                        }
                        if (!(obj4 instanceof TLRPC.WallPaper) || !(obj5 instanceof TLRPC.WallPaper)) {
                            return 0;
                        }
                        TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) obj4;
                        TLRPC.WallPaper wallPaper3 = (TLRPC.WallPaper) obj5;
                        long j10 = j3;
                        if (j10 == 0) {
                            String str5 = wallPaper2.slug;
                            String str6 = str;
                            if (str6.equals(str5)) {
                                return -1;
                            }
                            if (str6.equals(wallPaper3.slug)) {
                                return 1;
                            }
                        } else {
                            if (wallPaper2.id == j10) {
                                return -1;
                            }
                            if (wallPaper3.id == j10) {
                                return 1;
                            }
                        }
                        boolean z9 = q10;
                        if (!z9) {
                            if ("qeZWES8rGVIEAAAARfWlK1lnfiI".equals(wallPaper2.slug)) {
                                return -1;
                            }
                            if ("qeZWES8rGVIEAAAARfWlK1lnfiI".equals(wallPaper3.slug)) {
                                return 1;
                            }
                        }
                        int indexOf = arrayList2.indexOf(wallPaper2);
                        int indexOf2 = arrayList2.indexOf(wallPaper3);
                        boolean z10 = wallPaper2.dark;
                        if (!(z10 && wallPaper3.dark) && (z10 || wallPaper3.dark)) {
                            return (!z10 || wallPaper3.dark) ? z9 ? 1 : -1 : z9 ? -1 : 1;
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
                if (this.E == null) {
                    qc1 qc1Var3 = new qc1();
                    qc1Var3.a = "t";
                    qc1Var3.b = -2;
                    qc1Var3.c = -2;
                    this.E = qc1Var3;
                }
                arrayList.add(0, this.E);
            } else {
                this.E = null;
            }
            org.telegram.ui.ActionBar.j6 j6Var = org.telegram.ui.ActionBar.k6.I;
            if (TextUtils.isEmpty(this.O) || (!"d".equals(this.O) && obj == null)) {
                if ("c".equals(this.O) || (i10 = this.P) == 0) {
                    int i16 = this.P;
                    if (i16 != 0) {
                        int i17 = this.Q;
                        if (i17 == 0 || (i7 = this.R) == 0) {
                            this.x = new pc1(i16, i17, this.T, this.O);
                        } else {
                            pc1 pc1Var4 = new pc1(this.O, i16, i17, i7, this.S);
                            this.x = pc1Var4;
                            pc1Var4.f = this.T;
                        }
                        arrayList.add(0, this.x);
                    } else if (j6Var.i0 != null && !hashMap.containsKey(this.O)) {
                        qc1 qc1Var4 = new qc1(new File(org.telegram.messenger.t0.h(), j6Var.i0.a), new File(org.telegram.messenger.t0.h(), j6Var.i0.b), this.O);
                        this.y = qc1Var4;
                        arrayList.add(this.E != null ? 1 : 0, qc1Var4);
                    }
                } else if (j6Var.i0 != null) {
                    pc1 pc1Var5 = new pc1(this.O, i10, this.Q, this.R, this.S, this.T, this.U, this.V, new File(org.telegram.messenger.t0.h(), j6Var.i0.a));
                    this.x = pc1Var5;
                    pc1Var5.g = tL_wallPaper2;
                    arrayList.add(0, pc1Var5);
                }
            } else if (obj == null && this.P != 0 && "c".equals(this.O)) {
                int i18 = this.Q;
                if (i18 == 0 || (i11 = this.R) == 0 || (i12 = this.S) == 0) {
                    this.x = new pc1(this.P, i18, this.T, this.O);
                } else {
                    pc1 pc1Var6 = new pc1(this.O, this.P, i18, i11, i12);
                    this.x = pc1Var6;
                    pc1Var6.f = this.T;
                }
                arrayList.add(0, this.x);
            }
            if ("d".equals(this.O) || arrayList.isEmpty()) {
                arrayList.add(0, this.D);
            } else {
                arrayList.add(1, this.D);
            }
            H0();
        }
    }

    public final void G0(boolean z9) {
        long j3 = 0;
        if (!z9) {
            ArrayList arrayList = this.X;
            int size = arrayList.size();
            long j10 = 0;
            for (int i7 = 0; i7 < size; i7++) {
                Object obj = arrayList.get(i7);
                if (obj instanceof TLRPC.WallPaper) {
                    long j11 = ((TLRPC.WallPaper) obj).id;
                    if (j11 >= 0) {
                        j10 = org.telegram.messenger.ui.p(j10, j11);
                    }
                }
            }
            j3 = j10;
        }
        TL_account.getWallPapers getwallpapers = new TL_account.getWallPapers();
        getwallpapers.hash = j3;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new fi.d3(12, this, z9)), this.classGuid);
    }

    public final void H0() {
        this.a = 0;
        int i7 = this.r;
        if (i7 == 0) {
            this.uploadImageRow = 0;
            this.a = 2;
            this.b = 1;
            this.h = -1;
            this.n = -1;
        } else if (i7 == 2) {
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
            int i10 = this.a;
            this.c = i10;
            this.a = i10 + ceil;
        }
        if (i7 == 0) {
            int i11 = this.a;
            this.e = i11;
            this.a = i11 + 2;
            this.f = i11 + 1;
        } else {
            this.e = -1;
            this.f = -1;
        }
        rc1 rc1Var = this.G;
        if (rc1Var != null) {
            this.f0 = true;
            rc1Var.f();
        }
    }

    public final void I0() {
        int childCount = this.F.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = this.F.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.ua) {
                org.telegram.ui.Cells.ua uaVar = (org.telegram.ui.Cells.ua) childAt;
                for (int i10 = 0; i10 < 5; i10++) {
                    uaVar.c(i10, false, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
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

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        int i7 = 1;
        this.s = new Paint(1);
        Paint paint = new Paint(1);
        this.w = paint;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        this.w.setStyle(Paint.Style.STROKE);
        this.w.setColor(855638016);
        this.M = new a8.r7(getParentActivity(), this, new lc1(this));
        this.hasOwnBackground = true;
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = this.r;
        if (i10 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131752244, null));
        } else if (i10 == 2) {
            this.simpleActionBar.setTitle("Channel Wallpaper");
        } else if (i10 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131745665, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new nc1(this));
        boolean z9 = false;
        if (i10 == 0) {
            org.telegram.ui.ActionBar.f5 b10 = this.simpleActionBar.o().b(0, R.drawable.outline_header_search);
            b10.N();
            b10.B0 = new kg.v1(this, 23);
            this.J = b10;
            b10.setSearchFieldHint(org.telegram.messenger.id.M0(2131745819, null));
            org.telegram.ui.ActionBar.e5 l10 = this.simpleActionBar.l();
            l10.d(3, R.drawable.msg_forward, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.id.M0(2131750588, null));
            l10.d(4, R.drawable.msg_delete, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.id.M0(2131751599, null));
            this.e0.clear();
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.F = pj0Var;
        pj0Var.r1();
        org.telegram.ui.Components.pj0 pj0Var2 = this.F;
        int i11 = org.telegram.ui.ActionBar.k6.a7;
        org.telegram.ui.ActionBar.r6.i(i11, pj0Var2, getResourceProvider());
        this.F.setHorizontalScrollBarEnabled(false);
        this.F.setVerticalScrollBarEnabled(false);
        this.F.setItemAnimator(null);
        this.F.setLayoutAnimation(null);
        org.telegram.ui.Components.pj0 pj0Var3 = this.F;
        jg.b0 b0Var = new jg.b0(i7, z9, 19);
        this.I = b0Var;
        pj0Var3.setLayoutManager(b0Var);
        frameLayout.addView(this.F, c8.ha.e(-1, -1, 51));
        org.telegram.ui.Components.pj0 pj0Var4 = this.F;
        rc1 rc1Var = new rc1(this, context);
        this.G = rc1Var;
        pj0Var4.setAdapter(rc1Var);
        this.H = new sc1(this, context);
        org.telegram.ui.ActionBar.r6.I(this.F, org.telegram.ui.ActionBar.k6.e8, null);
        this.F.setOnItemClickListener(new vx0(this, 12));
        this.F.setOnScrollListener(new b21(this, 7));
        org.telegram.ui.Components.jy jyVar = new org.telegram.ui.Components.jy(context, null);
        this.K = jyVar;
        jyVar.setVisibility(8);
        this.K.setShowAtCenter(true);
        org.telegram.ui.ActionBar.r6.i(i11, this.K, null);
        this.K.setText(org.telegram.messenger.id.M0(2131748168, null));
        this.F.setEmptyView(this.K);
        frameLayout.addView(this.K, c8.ha.c(-1.0f, -1));
        H0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11;
        ArrayList arrayList;
        pc1 pc1Var;
        HashMap hashMap;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i12;
        boolean z9;
        TLRPC.WallPaperSettings wallPaperSettings2;
        TLRPC.WallPaperSettings wallPaperSettings3;
        int i13 = 1;
        if (i7 != org.telegram.messenger.qs.e4) {
            if (i7 != org.telegram.messenger.qs.z4) {
                if (i7 == org.telegram.messenger.qs.f4) {
                    getMessagesStorage().p0();
                    return;
                }
                return;
            }
            org.telegram.ui.Components.pj0 pj0Var = this.F;
            if (pj0Var != null) {
                pj0Var.g1();
            }
            org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
            if (y4Var != null) {
                y4Var.j(true);
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
        int i14 = this.r;
        HashMap hashMap4 = this.Z;
        ArrayList arrayList4 = this.a0;
        if (i14 != 1 && i14 != 2) {
            arrayList4.clear();
            arrayList3.clear();
            hashMap4.clear();
            ArrayList arrayList5 = this.X;
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
                                this.c0.add(wallPaper);
                                hashMap2.put(Long.valueOf(wallPaper.document.id), wallPaper);
                            }
                        }
                        hashMap3.put(wallPaper.slug, wallPaper);
                        if (i11 != i13 && ((!(z9 = wallPaper.pattern) || ((wallPaperSettings3 = wallPaper.settings) != null && wallPaperSettings3.background_color != 0)) && ((i11 != 2 || z9) && (org.telegram.ui.ActionBar.k6.I.q() || (wallPaperSettings2 = wallPaper.settings) == null || wallPaperSettings2.intensity >= 0)))) {
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
                        pc1Var = new pc1(i16, i17, wallPaperSettings4.rotation, null);
                    } else {
                        arrayList = arrayList2;
                        pc1Var = new pc1(null, i16, i17, i12, wallPaperSettings4.fourth_background_color);
                        hashMap = hashMap2;
                    }
                    pc1Var.a = wallPaper.slug;
                    pc1Var.h = wallPaperSettings4.intensity / 100.0f;
                    pc1Var.f = org.telegram.messenger.g0.s1(wallPaperSettings4.rotation, false);
                    pc1Var.l = wallPaper;
                    if (wallPaper.id < 0) {
                        String a10 = pc1Var.a();
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
                            arrayList3.add(pc1Var);
                            hashMap4.put(a10, pc1Var);
                        }
                    }
                    if (org.telegram.ui.ActionBar.k6.I.q() || (wallPaperSettings = wallPaper.settings) == null || wallPaperSettings.intensity >= 0) {
                        arrayList4.add(pc1Var);
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
                org.telegram.messenger.yr messagesStorage = getMessagesStorage();
                messagesStorage.a.c(new org.telegram.messenger.xp(messagesStorage, ((TLRPC.WallPaper) arrayList6.get(i18)).id, 1));
            }
        }
        this.O = org.telegram.ui.ActionBar.k6.K0();
        F0();
        G0(false);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.F;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.K, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.K, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.K, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        this.M.t(i7, i10, intent);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.pj0 pj0Var = this.F;
        if (pj0Var != null) {
            pj0Var.getViewTreeObserver().addOnPreDrawListener(new e7(this, 6));
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        int i7 = org.telegram.messenger.qs.e4;
        int i10 = this.r;
        if (i10 == 0 || i10 == 2) {
            org.telegram.messenger.qs.e().c(this, i7);
            org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.z4);
            org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f4);
            getMessagesStorage().p0();
        } else {
            E0(this.a0, org.telegram.ui.ActionBar.k6.I.q());
            if (i10 == 1 && this.c0.isEmpty()) {
                org.telegram.messenger.qs.e().c(this, i7);
                getMessagesStorage().p0();
            }
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        int i7 = org.telegram.messenger.qs.e4;
        int i10 = this.r;
        if (i10 == 0 || i10 == 2) {
            sc1 sc1Var = this.H;
            if (sc1Var.s != 0) {
                ConnectionsManager.getInstance(sc1Var.E.currentAccount).cancelRequest(sc1Var.s, true);
                sc1Var.s = 0;
            }
            org.telegram.messenger.qs.e().n(this, i7);
            org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.z4);
            org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f4);
        } else if (i10 == 1) {
            org.telegram.messenger.qs.e().n(this, i7);
        }
        this.M.getClass();
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.qp.e1();
        org.telegram.ui.ActionBar.c6 c6Var = org.telegram.ui.ActionBar.k6.I.i0;
        if (c6Var != null) {
            String str = c6Var.c;
            this.O = str;
            if (str == null) {
                this.O = "";
            }
            this.P = c6Var.d;
            this.Q = c6Var.e;
            this.R = c6Var.f;
            this.S = c6Var.g;
            this.T = c6Var.h;
            this.U = c6Var.k;
            this.V = c6Var.j;
            this.W = c6Var.i;
        } else {
            this.O = org.telegram.ui.ActionBar.k6.g1() ? "t" : "d";
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 45;
            this.U = 1.0f;
            this.V = false;
            this.W = false;
        }
        F0();
        org.telegram.ui.Components.pj0 pj0Var = this.F;
        if (pj0Var != null) {
            pj0Var.getViewTreeObserver().addOnPreDrawListener(new e7(this, 6));
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void restoreSelfArgs(Bundle bundle) {
        this.M.b = bundle.getString("path");
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void saveSelfArgs(Bundle bundle) {
        String str = (String) this.M.b;
        if (str != null) {
            bundle.putString("path", str);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
