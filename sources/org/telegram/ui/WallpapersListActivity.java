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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class WallpapersListActivity extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public static final int[][] g0 = {new int[]{-2368069, -9722489, -2762611, -7817084}, new int[]{-7487253, -4599318, -3755537, -1320977}, new int[]{-6832405, -5117462, -3755537, -1067044}, new int[]{-7676942, -7827988, -1859606, -9986835}, new int[]{-5190165, -6311702, -4461867, -5053475}, new int[]{-2430264, -6114049, -1258497, -4594945}, new int[]{-2298990, -7347754, -9985038, -8006011}, new int[]{-1399954, -990074, -876865, -1523602}, new int[]{-15438, -1916673, -6222, -471346}, new int[]{-2891798}, new int[]{-5913125}, new int[]{-9463352}, new int[]{-2956375}, new int[]{-5974898}, new int[]{-8537234}, new int[]{-1647186}, new int[]{-2769263}, new int[]{-3431303}, new int[]{-1326919}, new int[]{-2054243}, new int[]{-3573648}, new int[]{-1328696}, new int[]{-2056777}, new int[]{-2984557}, new int[]{-2440467}, new int[]{-2906649}, new int[]{-4880430}, new int[]{-4013331}, new int[]{-5921305}, new int[]{-8421424}, new int[]{-4005139}, new int[]{-5908761}, new int[]{-8406320}, new int[]{-2702663}, new int[]{-6518654}, new int[]{-16777216}};
    public static final int[][] h0 = {new int[]{-14797481, -15394250, -14924974, -14006975}, new int[]{-14867905, -14870478, -14997181, -15460815}, new int[]{-14666695, -15720408, -14861254, -15260107}, new int[]{-14932175, -15066075, -14208965, -15000799}, new int[]{-12968902, -14411460, -13029826, -15067598}, new int[]{-13885157, -12307670, -14542561, -12899018}, new int[]{-14797481, -15196106, -14924974, -15325638}, new int[]{-15658442, -15449521, -16047308, -12897955}, new int[]{-13809610, -15258855, -13221071, -15715791}, new int[]{-14865092}, new int[]{-15656154}, new int[]{-16051170}, new int[]{-14731745}, new int[]{-15524075}, new int[]{-15853808}, new int[]{-13685209}, new int[]{-14014945}, new int[]{-15132649}, new int[]{-12374480}, new int[]{-13755362}, new int[]{-14740716}, new int[]{-12374468}, new int[]{-13755352}, new int[]{-14740709}, new int[]{-12833213}, new int[]{-14083026}, new int[]{-14872031}, new int[]{-13554109}, new int[]{-14803922}, new int[]{-15461855}, new int[]{-13680833}, new int[]{-14602960}, new int[]{-15458784}, new int[]{-14211804}, new int[]{-15132906}, new int[]{-16777216}};
    public static final int[] i0 = {-16746753, -65536, -30208, -13824, -16718798, -14702165, -9240406, -409915, -9224159, -16777216, -10725281, -1};
    public static final String[] j0 = {"Blue", "Red", "Orange", "Yellow", "Green", "Teal", "Purple", "Pink", "Brown", "Black", "Gray", "White"};
    public static final int[] k0 = {2131753676, 2131746358, 2131747784, 2131742871, 2131749512, 2131744278, 2131746591, 2131747250, 2131752879, 2131753697, 2131749513, 2131742909};
    public me1 D;
    public ne1 E;
    public org.telegram.ui.Components.tk0 F;
    public oe1 G;
    public pe1 H;
    public dh.f I;
    public org.telegram.ui.ActionBar.p5 J;
    public org.telegram.ui.Components.xy K;
    public org.telegram.ui.ActionBar.x1 L;
    public bh.d M;
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
    public me1 x;
    public ne1 y;

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

    public static void D0(ArrayList arrayList, boolean z10) {
        for (int[] iArr : z10 ? h0 : g0) {
            if (iArr.length == 1) {
                arrayList.add(new me1(iArr[0], 0, "c", 45));
            } else {
                arrayList.add(new me1("c", iArr[0], iArr[1], iArr[2], iArr[3]));
            }
        }
    }

    public static void Y(WallpapersListActivity wallpapersListActivity, int i10) {
        if (wallpapersListActivity.getParentActivity() == null || wallpapersListActivity.F.getAdapter() == wallpapersListActivity.H) {
            return;
        }
        if (i10 == wallpapersListActivity.uploadImageRow) {
            wallpapersListActivity.M.G();
            return;
        }
        if (i10 == wallpapersListActivity.b) {
            WallpapersListActivity wallpapersListActivity2 = new WallpapersListActivity(1);
            wallpapersListActivity2.c0 = wallpapersListActivity.c0;
            wallpapersListActivity.presentFragment(wallpapersListActivity2);
        } else if (i10 == wallpapersListActivity.e) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wallpapersListActivity.getParentActivity());
            String L0 = org.telegram.messenger.cd.L0(2131746123, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.cd.L0(2131746124, null);
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131746135, null), new he1(wallpapersListActivity));
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
            wallpapersListActivity.showDialog(x1Var);
            TextView textView = (TextView) x1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
            }
        }
    }

    public static void Z(WallpapersListActivity wallpapersListActivity) {
        if (wallpapersListActivity.simpleActionBar.s()) {
            wallpapersListActivity.e0.clear();
            wallpapersListActivity.simpleActionBar.r();
            wallpapersListActivity.H0();
        }
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, wallpapersListActivity.getParentActivity(), null);
        wallpapersListActivity.L = x1Var;
        x1Var.i0 = false;
        x1Var.show();
        ConnectionsManager.getInstance(wallpapersListActivity.currentAccount).sendRequest(new TL_account.resetWallPapers(), new k(wallpapersListActivity, 25));
    }

    public static void v0(WallpapersListActivity wallpapersListActivity, org.telegram.ui.Components.pi piVar, Object obj, int i10) {
        Object obj2 = obj;
        LongSparseArray longSparseArray = wallpapersListActivity.e0;
        boolean z10 = true;
        if (wallpapersListActivity.simpleActionBar.s()) {
            Object obj3 = obj2 instanceof me1 ? ((me1) obj2).l : obj2;
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
                    wallpapersListActivity.simpleActionBar.y(longSparseArray.size(), true);
                }
                wallpapersListActivity.f0 = false;
                piVar.c(i10, longSparseArray.indexOfKey(wallPaper.id) >= 0, true);
                return;
            }
            return;
        }
        boolean z11 = obj2 instanceof TLRPC.TL_wallPaper;
        Bitmap bitmap = null;
        String str = z11 ? ((TLRPC.TL_wallPaper) obj2).slug : obj2 instanceof me1 ? ((me1) obj2).a : obj2 instanceof ne1 ? ((ne1) obj2).a : null;
        if (z11) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj2;
            if (tL_wallPaper.pattern) {
                String str2 = tL_wallPaper.slug;
                TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper.settings;
                me1 me1Var = new me1(str2, wallPaperSettings.background_color, wallPaperSettings.second_background_color, wallPaperSettings.third_background_color, wallPaperSettings.fourth_background_color, org.telegram.messenger.i0.s1(wallPaperSettings.rotation, false), r1.intensity / 100.0f, tL_wallPaper.settings.motion, null);
                me1Var.g = tL_wallPaper;
                me1Var.l = tL_wallPaper;
                obj2 = me1Var;
            }
        }
        org.telegram.ui.Components.to toVar = new org.telegram.ui.Components.to(obj2, bitmap, z10, 4);
        if (wallpapersListActivity.r == 1) {
            toVar.J1 = new he1(wallpapersListActivity);
        }
        if (wallpapersListActivity.O.equals(str)) {
            boolean z12 = wallpapersListActivity.W;
            boolean z13 = wallpapersListActivity.V;
            float f7 = wallpapersListActivity.U;
            toVar.G1 = z12;
            toVar.F1 = z13;
            toVar.o1 = f7;
        }
        toVar.V0 = wallpapersListActivity.c0;
        if (toVar.b == 1 || (toVar.C1 instanceof me1)) {
            ((me1) toVar.C1).getClass();
        }
        toVar.g1(0L);
        org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2();
        i2Var.a = true;
        toVar.a.a = wallpapersListActivity.resourceProvider;
        i2Var.c = new org.telegram.ui.Components.voip.m0(22);
        i2Var.e = true;
        wallpapersListActivity.showAsSheet(toVar, i2Var);
    }

    public static boolean w0(WallpapersListActivity wallpapersListActivity, org.telegram.ui.Components.pi piVar, Object obj, int i10) {
        int i11 = wallpapersListActivity.r;
        if (i11 != 2 && i11 != 3) {
            Object obj2 = obj instanceof me1 ? ((me1) obj).l : obj;
            if (!wallpapersListActivity.simpleActionBar.s() && wallpapersListActivity.getParentActivity() != null && (obj2 instanceof TLRPC.WallPaper)) {
                org.telegram.messenger.i0.v1(wallpapersListActivity.getParentActivity().getCurrentFocus());
                wallpapersListActivity.e0.put(((TLRPC.WallPaper) obj2).id, obj);
                wallpapersListActivity.simpleActionBar.y(1, false);
                wallpapersListActivity.f0 = false;
                wallpapersListActivity.simpleActionBar.C();
                piVar.c(i10, true, true);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10, types: [org.telegram.tgnet.TLRPC$TL_wallPaper, org.telegram.tgnet.TLRPC$WallPaper] */
    /* JADX WARN: Type inference failed for: r5v11, types: [org.telegram.ui.me1] */
    public final void E0() {
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
            org.telegram.messenger.vp.d1();
            me1 me1Var = this.x;
            ArrayList arrayList = this.a0;
            if (me1Var != null) {
                arrayList.remove(me1Var);
                this.x = null;
            }
            ne1 ne1Var = this.y;
            if (ne1Var != null) {
                arrayList.remove(ne1Var);
                this.y = null;
            }
            me1 me1Var2 = this.D;
            if (me1Var2 == null) {
                me1 me1Var3 = new me1("d", -2368069, -9722489, -2762611, -7817084);
                this.D = me1Var3;
                me1Var3.h = 0.34f;
            } else {
                arrayList.remove(me1Var2);
            }
            ne1 ne1Var2 = this.E;
            if (ne1Var2 != null) {
                arrayList.remove(ne1Var2);
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
                if (obj3 instanceof me1) {
                    tL_wallPaper = (me1) obj3;
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
                        if (tL_wallPaper.settings != null && TextUtils.equals(this.O, tL_wallPaper.slug) && this.P == org.telegram.ui.ActionBar.t6.a1(tL_wallPaper.settings.background_color) && this.Q == org.telegram.ui.ActionBar.t6.a1(tL_wallPaper.settings.second_background_color) && this.R == org.telegram.ui.ActionBar.t6.a1(tL_wallPaper.settings.third_background_color) && this.S == org.telegram.ui.ActionBar.t6.a1(tL_wallPaper.settings.fourth_background_color) && ((this.Q == 0 || this.T == org.telegram.messenger.i0.s1(tL_wallPaper.settings.rotation, false)) && Math.abs(org.telegram.ui.ActionBar.t6.U0(tL_wallPaper.settings.intensity / 100.0f) - this.U) <= 0.001f)) {
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
                org.telegram.ui.ActionBar.m6 m6Var = org.telegram.ui.ActionBar.t6.I.i0;
                TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper4.settings;
                if (wallPaperSettings != null && this.P == org.telegram.ui.ActionBar.t6.a1(wallPaperSettings.background_color) && this.Q == org.telegram.ui.ActionBar.t6.a1(tL_wallPaper4.settings.second_background_color) && this.R == org.telegram.ui.ActionBar.t6.a1(tL_wallPaper4.settings.third_background_color) && this.S == org.telegram.ui.ActionBar.t6.a1(tL_wallPaper4.settings.fourth_background_color) && (this.Q == 0 || this.R != 0 || this.T == org.telegram.messenger.i0.s1(tL_wallPaper4.settings.rotation, false) || Math.abs(org.telegram.ui.ActionBar.t6.U0(tL_wallPaper4.settings.intensity / 100.0f) - this.U) <= 0.001f)) {
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
                j10 = (!(tL_wallPaper instanceof me1) || (wallPaper = tL_wallPaper.l) == null) ? 0L : wallPaper.id;
                obj = tL_wallPaper;
                tL_wallPaper2 = null;
            }
            final boolean q6 = org.telegram.ui.ActionBar.t6.D0().q();
            try {
                Collections.sort(arrayList, new Comparator() { // from class: org.telegram.ui.ge1
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        ArrayList arrayList2 = WallpapersListActivity.this.X;
                        if (obj4 instanceof me1) {
                            obj4 = ((me1) obj4).l;
                        }
                        if (obj5 instanceof me1) {
                            obj5 = ((me1) obj5).l;
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
                        boolean z10 = q6;
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
                org.telegram.messenger.f8.g(e, true);
            }
            if (org.telegram.ui.ActionBar.t6.g1() && TextUtils.isEmpty(org.telegram.ui.ActionBar.t6.h0)) {
                if (this.E == null) {
                    ne1 ne1Var3 = new ne1();
                    ne1Var3.a = "t";
                    ne1Var3.b = -2;
                    ne1Var3.c = -2;
                    this.E = ne1Var3;
                }
                arrayList.add(0, this.E);
            } else {
                this.E = null;
            }
            org.telegram.ui.ActionBar.s6 s6Var = org.telegram.ui.ActionBar.t6.I;
            if (TextUtils.isEmpty(this.O) || (!"d".equals(this.O) && obj == null)) {
                if ("c".equals(this.O) || (i11 = this.P) == 0) {
                    int i17 = this.P;
                    if (i17 != 0) {
                        int i18 = this.Q;
                        if (i18 == 0 || (i10 = this.R) == 0) {
                            this.x = new me1(i17, i18, this.O, this.T);
                        } else {
                            me1 me1Var4 = new me1(this.O, i17, i18, i10, this.S);
                            this.x = me1Var4;
                            me1Var4.f = this.T;
                        }
                        arrayList.add(0, this.x);
                    } else if (s6Var.i0 != null && !hashMap.containsKey(this.O)) {
                        ne1 ne1Var4 = new ne1(new File(org.telegram.messenger.w0.h(), s6Var.i0.a), new File(org.telegram.messenger.w0.h(), s6Var.i0.b), this.O);
                        this.y = ne1Var4;
                        arrayList.add(this.E != null ? 1 : 0, ne1Var4);
                    }
                } else if (s6Var.i0 != null) {
                    me1 me1Var5 = new me1(this.O, i11, this.Q, this.R, this.S, this.T, this.U, this.V, new File(org.telegram.messenger.w0.h(), s6Var.i0.a));
                    this.x = me1Var5;
                    me1Var5.g = tL_wallPaper2;
                    arrayList.add(0, me1Var5);
                }
            } else if (obj == null && this.P != 0 && "c".equals(this.O)) {
                int i19 = this.Q;
                if (i19 == 0 || (i12 = this.R) == 0 || (i13 = this.S) == 0) {
                    this.x = new me1(this.P, i19, this.O, this.T);
                } else {
                    me1 me1Var6 = new me1(this.O, this.P, i19, i12, i13);
                    this.x = me1Var6;
                    me1Var6.f = this.T;
                }
                arrayList.add(0, this.x);
            }
            if ("d".equals(this.O) || arrayList.isEmpty()) {
                arrayList.add(0, this.D);
            } else {
                arrayList.add(1, this.D);
            }
            G0();
        }
    }

    public final void F0(boolean z10) {
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
                        j11 = org.telegram.messenger.ui.p(j11, j12);
                    }
                }
            }
            j10 = j11;
        }
        TL_account.getWallPapers getwallpapers = new TL_account.getWallPapers();
        getwallpapers.hash = j10;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new org.telegram.messenger.voip.u0(11, this, z10)), this.classGuid);
    }

    public final void G0() {
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
        oe1 oe1Var = this.G;
        if (oe1Var != null) {
            this.f0 = true;
            oe1Var.f();
        }
    }

    public final void H0() {
        int childCount = this.F.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.F.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.ua) {
                org.telegram.ui.Cells.ua uaVar = (org.telegram.ui.Cells.ua) childAt;
                for (int i11 = 0; i11 < 5; i11++) {
                    uaVar.c(i11, false, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d6));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        int i10 = 1;
        this.s = new Paint(1);
        Paint paint = new Paint(1);
        this.w = paint;
        paint.setStrokeWidth(org.telegram.messenger.i0.L(1.0f));
        this.w.setStyle(Paint.Style.STROKE);
        this.w.setColor(855638016);
        this.M = new bh.d(getParentActivity(), this, new ie1(this));
        this.hasOwnBackground = true;
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i11 = this.r;
        if (i11 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131752244, null));
        } else if (i11 == 2) {
            this.simpleActionBar.setTitle("Channel Wallpaper");
        } else if (i11 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131745679, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new ke1(this));
        boolean z10 = false;
        if (i11 == 0) {
            org.telegram.ui.ActionBar.p5 b10 = this.simpleActionBar.o().b(0, R.drawable.outline_header_search);
            b10.N();
            b10.B0 = new ag.l3(this, 23);
            this.J = b10;
            b10.setSearchFieldHint(org.telegram.messenger.cd.L0(2131745833, null));
            org.telegram.ui.ActionBar.o5 l4 = this.simpleActionBar.l();
            l4.d(3, R.drawable.msg_forward, org.telegram.messenger.cd.L0(2131750588, null), org.telegram.messenger.i0.L(54.0f));
            l4.d(4, R.drawable.msg_delete, org.telegram.messenger.cd.L0(2131751599, null), org.telegram.messenger.i0.L(54.0f));
            this.e0.clear();
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        this.F = tk0Var;
        tk0Var.r1();
        org.telegram.ui.Components.tk0 tk0Var2 = this.F;
        int i12 = org.telegram.ui.ActionBar.t6.a7;
        org.telegram.ui.ActionBar.a7.i(i12, tk0Var2, getResourceProvider());
        this.F.setHorizontalScrollBarEnabled(false);
        this.F.setVerticalScrollBarEnabled(false);
        this.F.setItemAnimator(null);
        this.F.setLayoutAnimation(null);
        org.telegram.ui.Components.tk0 tk0Var3 = this.F;
        dh.f fVar = new dh.f(i10, z10, 18);
        this.I = fVar;
        tk0Var3.setLayoutManager(fVar);
        frameLayout.addView(this.F, w7.b6.e(-1, -1, 51));
        org.telegram.ui.Components.tk0 tk0Var4 = this.F;
        oe1 oe1Var = new oe1(this, context);
        this.G = oe1Var;
        tk0Var4.setAdapter(oe1Var);
        this.H = new pe1(this, context);
        org.telegram.ui.ActionBar.a7.I(this.F, org.telegram.ui.ActionBar.t6.e8, null);
        this.F.setOnItemClickListener(new kz0(this, 12));
        this.F.setOnScrollListener(new w41(this, 6));
        org.telegram.ui.Components.xy xyVar = new org.telegram.ui.Components.xy(context, null);
        this.K = xyVar;
        xyVar.setVisibility(8);
        this.K.setShowAtCenter(true);
        org.telegram.ui.ActionBar.a7.i(i12, this.K, null);
        this.K.setText(org.telegram.messenger.cd.L0(2131748183, null));
        this.F.setEmptyView(this.K);
        frameLayout.addView(this.K, w7.b6.c(-1.0f, -1));
        G0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        ArrayList arrayList;
        me1 me1Var;
        HashMap hashMap;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i13;
        boolean z10;
        TLRPC.WallPaperSettings wallPaperSettings2;
        TLRPC.WallPaperSettings wallPaperSettings3;
        int i14 = 1;
        if (i10 != org.telegram.messenger.zs.e4) {
            if (i10 != org.telegram.messenger.zs.z4) {
                if (i10 == org.telegram.messenger.zs.f4) {
                    getMessagesStorage().p0();
                    return;
                }
                return;
            }
            org.telegram.ui.Components.tk0 tk0Var = this.F;
            if (tk0Var != null) {
                tk0Var.g1();
            }
            org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
            if (i5Var != null) {
                i5Var.j(true);
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
                        if (i12 != i14 && ((!(z10 = wallPaper.pattern) || ((wallPaperSettings3 = wallPaper.settings) != null && wallPaperSettings3.background_color != 0)) && ((i12 != 2 || z10) && (org.telegram.ui.ActionBar.t6.I.q() || (wallPaperSettings2 = wallPaper.settings) == null || wallPaperSettings2.intensity >= 0)))) {
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
                        me1Var = new me1(i17, i18, null, wallPaperSettings4.rotation);
                    } else {
                        arrayList = arrayList2;
                        me1Var = new me1(null, i17, i18, i13, wallPaperSettings4.fourth_background_color);
                        hashMap = hashMap2;
                    }
                    me1Var.a = wallPaper.slug;
                    me1Var.h = wallPaperSettings4.intensity / 100.0f;
                    me1Var.f = org.telegram.messenger.i0.s1(wallPaperSettings4.rotation, false);
                    me1Var.l = wallPaper;
                    if (wallPaper.id < 0) {
                        String a2 = me1Var.a();
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
                            arrayList3.add(me1Var);
                            hashMap4.put(a2, me1Var);
                        }
                    }
                    if (org.telegram.ui.ActionBar.t6.I.q() || (wallPaperSettings = wallPaper.settings) == null || wallPaperSettings.intensity >= 0) {
                        arrayList4.add(me1Var);
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
                org.telegram.messenger.hs messagesStorage = getMessagesStorage();
                messagesStorage.a.c(new org.telegram.messenger.cq(messagesStorage, ((TLRPC.WallPaper) arrayList6.get(i19)).id, 1));
            }
        }
        this.O = org.telegram.ui.ActionBar.t6.K0();
        E0();
        F0(false);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.F;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.K, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.K, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.K, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.d6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.M.y(i10, i11, intent);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.tk0 tk0Var = this.F;
        if (tk0Var != null) {
            tk0Var.getViewTreeObserver().addOnPreDrawListener(new e7(this, 6));
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        int i10 = org.telegram.messenger.zs.e4;
        int i11 = this.r;
        if (i11 == 0 || i11 == 2) {
            org.telegram.messenger.zs.e().c(this, i10);
            org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.z4);
            org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.f4);
            getMessagesStorage().p0();
        } else {
            D0(this.a0, org.telegram.ui.ActionBar.t6.I.q());
            if (i11 == 1 && this.c0.isEmpty()) {
                org.telegram.messenger.zs.e().c(this, i10);
                getMessagesStorage().p0();
            }
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        int i10 = org.telegram.messenger.zs.e4;
        int i11 = this.r;
        if (i11 == 0 || i11 == 2) {
            pe1 pe1Var = this.H;
            if (pe1Var.s != 0) {
                ConnectionsManager.getInstance(pe1Var.E.currentAccount).cancelRequest(pe1Var.s, true);
                pe1Var.s = 0;
            }
            org.telegram.messenger.zs.e().n(this, i10);
            org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.z4);
            org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.f4);
        } else if (i11 == 1) {
            org.telegram.messenger.zs.e().n(this, i10);
        }
        this.M.getClass();
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.vp.d1();
        org.telegram.ui.ActionBar.m6 m6Var = org.telegram.ui.ActionBar.t6.I.i0;
        if (m6Var != null) {
            String str = m6Var.c;
            this.O = str;
            if (str == null) {
                this.O = "";
            }
            this.P = m6Var.d;
            this.Q = m6Var.e;
            this.R = m6Var.f;
            this.S = m6Var.g;
            this.T = m6Var.h;
            this.U = m6Var.k;
            this.V = m6Var.j;
            this.W = m6Var.i;
        } else {
            this.O = org.telegram.ui.ActionBar.t6.g1() ? "t" : "d";
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 45;
            this.U = 1.0f;
            this.V = false;
            this.W = false;
        }
        E0();
        org.telegram.ui.Components.tk0 tk0Var = this.F;
        if (tk0Var != null) {
            tk0Var.getViewTreeObserver().addOnPreDrawListener(new e7(this, 6));
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void restoreSelfArgs(Bundle bundle) {
        this.M.a = bundle.getString("path");
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void saveSelfArgs(Bundle bundle) {
        String str = (String) this.M.a;
        if (str != null) {
            bundle.putString("path", str);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
