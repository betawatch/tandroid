package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
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
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public class WallpapersListActivity extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public static final int[][] k0 = {new int[]{-2368069, -9722489, -2762611, -7817084}, new int[]{-7487253, -4599318, -3755537, -1320977}, new int[]{-6832405, -5117462, -3755537, -1067044}, new int[]{-7676942, -7827988, -1859606, -9986835}, new int[]{-5190165, -6311702, -4461867, -5053475}, new int[]{-2430264, -6114049, -1258497, -4594945}, new int[]{-2298990, -7347754, -9985038, -8006011}, new int[]{-1399954, -990074, -876865, -1523602}, new int[]{-15438, -1916673, -6222, -471346}, new int[]{-2891798}, new int[]{-5913125}, new int[]{-9463352}, new int[]{-2956375}, new int[]{-5974898}, new int[]{-8537234}, new int[]{-1647186}, new int[]{-2769263}, new int[]{-3431303}, new int[]{-1326919}, new int[]{-2054243}, new int[]{-3573648}, new int[]{-1328696}, new int[]{-2056777}, new int[]{-2984557}, new int[]{-2440467}, new int[]{-2906649}, new int[]{-4880430}, new int[]{-4013331}, new int[]{-5921305}, new int[]{-8421424}, new int[]{-4005139}, new int[]{-5908761}, new int[]{-8406320}, new int[]{-2702663}, new int[]{-6518654}, new int[]{-16777216}};
    public static final int[][] l0 = {new int[]{-14797481, -15394250, -14924974, -14006975}, new int[]{-14867905, -14870478, -14997181, -15460815}, new int[]{-14666695, -15720408, -14861254, -15260107}, new int[]{-14932175, -15066075, -14208965, -15000799}, new int[]{-12968902, -14411460, -13029826, -15067598}, new int[]{-13885157, -12307670, -14542561, -12899018}, new int[]{-14797481, -15196106, -14924974, -15325638}, new int[]{-15658442, -15449521, -16047308, -12897955}, new int[]{-13809610, -15258855, -13221071, -15715791}, new int[]{-14865092}, new int[]{-15656154}, new int[]{-16051170}, new int[]{-14731745}, new int[]{-15524075}, new int[]{-15853808}, new int[]{-13685209}, new int[]{-14014945}, new int[]{-15132649}, new int[]{-12374480}, new int[]{-13755362}, new int[]{-14740716}, new int[]{-12374468}, new int[]{-13755352}, new int[]{-14740709}, new int[]{-12833213}, new int[]{-14083026}, new int[]{-14872031}, new int[]{-13554109}, new int[]{-14803922}, new int[]{-15461855}, new int[]{-13680833}, new int[]{-14602960}, new int[]{-15458784}, new int[]{-14211804}, new int[]{-15132906}, new int[]{-16777216}};
    public static final int[] m0 = {-16746753, -65536, -30208, -13824, -16718798, -14702165, -9240406, -409915, -9224159, -16777216, -10725281, -1};
    public static final String[] n0 = {"Blue", "Red", "Orange", "Yellow", "Green", "Teal", "Purple", "Pink", "Brown", "Black", "Gray", "White"};
    public static final int[] o0 = {R.string.Blue, R.string.Red, R.string.Orange, R.string.Yellow, R.string.Green, R.string.Teal, R.string.Purple, R.string.Pink, R.string.Brown, R.string.Black, R.string.Gray, R.string.White};
    public hj1 E;
    public gj1 F;
    public hj1 G;
    public org.telegram.ui.Components.ll0 H;
    public ij1 I;
    public jj1 J;
    public hg.b0 K;
    public org.telegram.ui.ActionBar.v0 L;
    public NumberTextView M;
    public org.telegram.ui.Components.mz N;
    public final ArrayList O;
    public org.telegram.ui.ActionBar.b2 P;
    public org.telegram.ui.Components.p81 Q;
    public int R;
    public String S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public float Y;
    public boolean Z;
    public int a;
    public boolean a0;
    public int b;
    public final ArrayList b0;
    public int c;
    public final HashMap c0;
    public int d;
    public final HashMap d0;
    public int e;
    public final ArrayList e0;
    public int f;
    public final ArrayList f0;
    public ArrayList g0;
    public int h;
    public final HashMap h0;
    public final LongSparseArray i0;
    public boolean j0;
    public int n;
    public int r;
    public int s;
    private int uploadImageRow;
    public final int v;
    public Paint w;
    public Paint x;
    public gj1 y;

    public WallpapersListActivity(int i10) {
        super(null);
        this.O = new ArrayList();
        this.R = 3;
        this.S = "";
        this.b0 = new ArrayList();
        this.c0 = new HashMap();
        this.d0 = new HashMap();
        this.e0 = new ArrayList();
        this.f0 = new ArrayList();
        this.g0 = new ArrayList();
        this.h0 = new HashMap();
        this.i0 = new LongSparseArray();
        this.v = i10;
    }

    public static void U(WallpapersListActivity wallpapersListActivity) {
        if (wallpapersListActivity.actionBar.s()) {
            wallpapersListActivity.i0.clear();
            wallpapersListActivity.actionBar.r();
            wallpapersListActivity.D0();
        }
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(wallpapersListActivity.getParentActivity(), 3, null);
        wallpapersListActivity.P = b2Var;
        b2Var.g0 = false;
        b2Var.show();
        ConnectionsManager.getInstance(wallpapersListActivity.currentAccount).sendRequest(new TL_account.resetWallPapers(), new m(wallpapersListActivity, 24));
    }

    public static void V(WallpapersListActivity wallpapersListActivity, int i10) {
        if (wallpapersListActivity.getParentActivity() == null || wallpapersListActivity.H.getAdapter() == wallpapersListActivity.J) {
            return;
        }
        if (i10 == wallpapersListActivity.uploadImageRow) {
            wallpapersListActivity.Q.b();
            return;
        }
        if (i10 == wallpapersListActivity.b) {
            WallpapersListActivity wallpapersListActivity2 = new WallpapersListActivity(1);
            wallpapersListActivity2.g0 = wallpapersListActivity.g0;
            wallpapersListActivity.presentFragment(wallpapersListActivity2);
        } else if (i10 == wallpapersListActivity.h) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wallpapersListActivity.getParentActivity());
            alertDialog$Builder.a.R = LocaleController.getString(R.string.ResetChatBackgroundsAlertTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.ResetChatBackgroundsAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new zi1(wallpapersListActivity));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            wallpapersListActivity.showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
            }
        }
    }

    public static void r0(WallpapersListActivity wallpapersListActivity, org.telegram.ui.Components.ij ijVar, Object obj, int i10) {
        Object obj2 = obj;
        LongSparseArray longSparseArray = wallpapersListActivity.i0;
        boolean z10 = true;
        if (wallpapersListActivity.actionBar.s()) {
            Object obj3 = obj2 instanceof gj1 ? ((gj1) obj2).l : obj2;
            if (obj3 instanceof TLRPC.WallPaper) {
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj3;
                if (longSparseArray.indexOfKey(wallPaper.id) >= 0) {
                    longSparseArray.remove(wallPaper.id);
                } else {
                    longSparseArray.put(wallPaper.id, obj2);
                }
                if (longSparseArray.size() == 0) {
                    wallpapersListActivity.actionBar.r();
                } else {
                    wallpapersListActivity.M.a(longSparseArray.size(), true);
                }
                wallpapersListActivity.j0 = false;
                ijVar.c(i10, longSparseArray.indexOfKey(wallPaper.id) >= 0, true);
                return;
            }
            return;
        }
        boolean z11 = obj2 instanceof TLRPC.TL_wallPaper;
        Bitmap bitmap = null;
        String str = z11 ? ((TLRPC.TL_wallPaper) obj2).slug : obj2 instanceof gj1 ? ((gj1) obj2).a : obj2 instanceof hj1 ? ((hj1) obj2).a : null;
        if (z11) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj2;
            if (tL_wallPaper.pattern) {
                String str2 = tL_wallPaper.slug;
                TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper.settings;
                gj1 gj1Var = new gj1(str2, wallPaperSettings.background_color, wallPaperSettings.second_background_color, wallPaperSettings.third_background_color, wallPaperSettings.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings.rotation, false), r1.intensity / 100.0f, tL_wallPaper.settings.motion, null);
                gj1Var.g = tL_wallPaper;
                gj1Var.l = tL_wallPaper;
                obj2 = gj1Var;
            }
        }
        org.telegram.ui.Components.zo zoVar = new org.telegram.ui.Components.zo(obj2, bitmap, z10, 4);
        if (wallpapersListActivity.v == 1) {
            zoVar.I1 = new zi1(wallpapersListActivity);
        }
        if (wallpapersListActivity.S.equals(str)) {
            boolean z12 = wallpapersListActivity.a0;
            boolean z13 = wallpapersListActivity.Z;
            float f7 = wallpapersListActivity.Y;
            zoVar.F1 = z12;
            zoVar.E1 = z13;
            zoVar.n1 = f7;
        }
        zoVar.U0 = wallpapersListActivity.g0;
        if (zoVar.b == 1 || (zoVar.B1 instanceof gj1)) {
            ((gj1) zoVar.B1).getClass();
        }
        zoVar.c1(0L);
        org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
        l2Var.a = true;
        zoVar.a.a = wallpapersListActivity.resourceProvider;
        l2Var.c = new q31(4);
        l2Var.e = true;
        wallpapersListActivity.showAsSheet(zoVar, l2Var);
    }

    public static boolean s0(WallpapersListActivity wallpapersListActivity, org.telegram.ui.Components.ij ijVar, Object obj, int i10) {
        ArrayList arrayList = wallpapersListActivity.O;
        int i11 = wallpapersListActivity.v;
        if (i11 != 2 && i11 != 3) {
            Object obj2 = obj instanceof gj1 ? ((gj1) obj).l : obj;
            if (!wallpapersListActivity.actionBar.s() && wallpapersListActivity.getParentActivity() != null && (obj2 instanceof TLRPC.WallPaper)) {
                AndroidUtilities.hideKeyboard(wallpapersListActivity.getParentActivity().getCurrentFocus());
                wallpapersListActivity.i0.put(((TLRPC.WallPaper) obj2).id, obj);
                wallpapersListActivity.M.a(1, false);
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    View view = (View) arrayList.get(i12);
                    AndroidUtilities.clearDrawableAnimation(view);
                    arrayList2.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.1f, 1.0f));
                }
                animatorSet.playTogether(arrayList2);
                animatorSet.setDuration(250L);
                animatorSet.start();
                wallpapersListActivity.j0 = false;
                wallpapersListActivity.actionBar.O(null, null);
                ijVar.c(i10, true, true);
                return true;
            }
        }
        return false;
    }

    public static void z0(ArrayList arrayList, boolean z10) {
        for (int[] iArr : z10 ? l0 : k0) {
            if (iArr.length == 1) {
                arrayList.add(new gj1(iArr[0], 0, "c", 45));
            } else {
                arrayList.add(new gj1("c", iArr[0], iArr[1], iArr[2], iArr[3]));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10, types: [org.telegram.tgnet.TLRPC$TL_wallPaper, org.telegram.tgnet.TLRPC$WallPaper] */
    /* JADX WARN: Type inference failed for: r5v11, types: [org.telegram.ui.gj1] */
    public final void A0() {
        int i10;
        HashMap hashMap;
        TLRPC.TL_wallPaper tL_wallPaper;
        final String str;
        final long j3;
        Object obj;
        TLRPC.TL_wallPaper tL_wallPaper2;
        TLRPC.WallPaper wallPaper;
        int i11;
        int i12;
        int i13;
        int i14;
        String str2;
        TLRPC.TL_wallPaper tL_wallPaper3;
        Object obj2;
        int i15 = this.v;
        if (i15 == 0 || i15 == 2) {
            MessagesController.getGlobalMainSettings();
            gj1 gj1Var = this.y;
            ArrayList arrayList = this.e0;
            if (gj1Var != null) {
                arrayList.remove(gj1Var);
                this.y = null;
            }
            hj1 hj1Var = this.E;
            if (hj1Var != null) {
                arrayList.remove(hj1Var);
                this.E = null;
            }
            gj1 gj1Var2 = this.F;
            if (gj1Var2 == null) {
                gj1 gj1Var3 = new gj1("d", -2368069, -9722489, -2762611, -7817084);
                this.F = gj1Var3;
                gj1Var3.h = 0.34f;
            } else {
                arrayList.remove(gj1Var2);
            }
            hj1 hj1Var2 = this.G;
            if (hj1Var2 != null) {
                arrayList.remove(hj1Var2);
            }
            int size = arrayList.size();
            while (true) {
                hashMap = this.c0;
                if (i10 >= size) {
                    tL_wallPaper = 0;
                    break;
                }
                Object obj3 = arrayList.get(i10);
                if (obj3 instanceof gj1) {
                    tL_wallPaper = (gj1) obj3;
                    String str3 = tL_wallPaper.a;
                    if (str3 != null) {
                        tL_wallPaper.g = (TLRPC.TL_wallPaper) hashMap.get(str3);
                    }
                    if (!"c".equals(tL_wallPaper.a)) {
                        String str4 = tL_wallPaper.a;
                        i10 = (str4 == null || TextUtils.equals(this.S, str4)) ? 0 : i10 + 1;
                    }
                    if (this.T == tL_wallPaper.b) {
                        int i16 = this.U;
                        if (i16 != tL_wallPaper.c) {
                            continue;
                        } else if (this.V != tL_wallPaper.d) {
                            continue;
                        } else if (this.W != tL_wallPaper.e) {
                            continue;
                        } else if (i16 == 0 || this.X == tL_wallPaper.f) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    if (obj3 instanceof TLRPC.TL_wallPaper) {
                        tL_wallPaper = (TLRPC.TL_wallPaper) obj3;
                        if (tL_wallPaper.settings != null && TextUtils.equals(this.S, tL_wallPaper.slug) && this.T == org.telegram.ui.ActionBar.j6.X0(tL_wallPaper.settings.background_color) && this.U == org.telegram.ui.ActionBar.j6.X0(tL_wallPaper.settings.second_background_color) && this.V == org.telegram.ui.ActionBar.j6.X0(tL_wallPaper.settings.third_background_color) && this.W == org.telegram.ui.ActionBar.j6.X0(tL_wallPaper.settings.fourth_background_color) && ((this.U == 0 || this.X == AndroidUtilities.getWallpaperRotation(tL_wallPaper.settings.rotation, false)) && Math.abs(org.telegram.ui.ActionBar.j6.R0(tL_wallPaper.settings.intensity / 100.0f) - this.Y) <= 0.001f)) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
            if (tL_wallPaper instanceof TLRPC.WallPaper) {
                TLRPC.TL_wallPaper tL_wallPaper4 = tL_wallPaper;
                org.telegram.ui.ActionBar.b6 b6Var = org.telegram.ui.ActionBar.j6.I.i0;
                TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper4.settings;
                if (wallPaperSettings != null && this.T == org.telegram.ui.ActionBar.j6.X0(wallPaperSettings.background_color) && this.U == org.telegram.ui.ActionBar.j6.X0(tL_wallPaper4.settings.second_background_color) && this.V == org.telegram.ui.ActionBar.j6.X0(tL_wallPaper4.settings.third_background_color) && this.W == org.telegram.ui.ActionBar.j6.X0(tL_wallPaper4.settings.fourth_background_color) && (this.U == 0 || this.V != 0 || this.X == AndroidUtilities.getWallpaperRotation(tL_wallPaper4.settings.rotation, false) || Math.abs(org.telegram.ui.ActionBar.j6.R0(tL_wallPaper4.settings.intensity / 100.0f) - this.Y) <= 0.001f)) {
                    str2 = this.S;
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
                str = this.S;
                j3 = (!(tL_wallPaper instanceof gj1) || (wallPaper = tL_wallPaper.l) == null) ? 0L : wallPaper.id;
                obj = tL_wallPaper;
                tL_wallPaper2 = null;
            }
            final boolean q6 = org.telegram.ui.ActionBar.j6.A0().q();
            try {
                Collections.sort(arrayList, new Comparator() { // from class: org.telegram.ui.yi1
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        ArrayList arrayList2 = WallpapersListActivity.this.b0;
                        if (obj4 instanceof gj1) {
                            obj4 = ((gj1) obj4).l;
                        }
                        if (obj5 instanceof gj1) {
                            obj5 = ((gj1) obj5).l;
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
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            if (org.telegram.ui.ActionBar.j6.d1() && TextUtils.isEmpty(org.telegram.ui.ActionBar.j6.h0)) {
                if (this.G == null) {
                    hj1 hj1Var3 = new hj1();
                    hj1Var3.a = "t";
                    hj1Var3.b = -2;
                    hj1Var3.c = -2;
                    this.G = hj1Var3;
                }
                arrayList.add(0, this.G);
            } else {
                this.G = null;
            }
            org.telegram.ui.ActionBar.i6 i6Var = org.telegram.ui.ActionBar.j6.I;
            if (TextUtils.isEmpty(this.S) || (!"d".equals(this.S) && obj == null)) {
                if ("c".equals(this.S) || (i12 = this.T) == 0) {
                    int i17 = this.T;
                    if (i17 != 0) {
                        int i18 = this.U;
                        if (i18 == 0 || (i11 = this.V) == 0) {
                            this.y = new gj1(i17, i18, this.S, this.X);
                        } else {
                            gj1 gj1Var4 = new gj1(this.S, i17, i18, i11, this.W);
                            this.y = gj1Var4;
                            gj1Var4.f = this.X;
                        }
                        arrayList.add(0, this.y);
                    } else if (i6Var.i0 != null && !hashMap.containsKey(this.S)) {
                        hj1 hj1Var4 = new hj1(new File(ApplicationLoader.getFilesDirFixed(), i6Var.i0.a), new File(ApplicationLoader.getFilesDirFixed(), i6Var.i0.b), this.S);
                        this.E = hj1Var4;
                        arrayList.add(this.G != null ? 1 : 0, hj1Var4);
                    }
                } else if (i6Var.i0 != null) {
                    gj1 gj1Var5 = new gj1(this.S, i12, this.U, this.V, this.W, this.X, this.Y, this.Z, new File(ApplicationLoader.getFilesDirFixed(), i6Var.i0.a));
                    this.y = gj1Var5;
                    gj1Var5.g = tL_wallPaper2;
                    arrayList.add(0, gj1Var5);
                }
            } else if (obj == null && this.T != 0 && "c".equals(this.S)) {
                int i19 = this.U;
                if (i19 == 0 || (i13 = this.V) == 0 || (i14 = this.W) == 0) {
                    this.y = new gj1(this.T, i19, this.S, this.X);
                } else {
                    gj1 gj1Var6 = new gj1(this.S, this.T, i19, i13, i14);
                    this.y = gj1Var6;
                    gj1Var6.f = this.X;
                }
                arrayList.add(0, this.y);
            }
            if ("d".equals(this.S) || arrayList.isEmpty()) {
                arrayList.add(0, this.F);
            } else {
                arrayList.add(1, this.F);
            }
            C0();
        }
    }

    public final void B0(boolean z10) {
        long j3 = 0;
        if (!z10) {
            ArrayList arrayList = this.b0;
            int size = arrayList.size();
            long j10 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = arrayList.get(i10);
                if (obj instanceof TLRPC.WallPaper) {
                    long j11 = ((TLRPC.WallPaper) obj).id;
                    if (j11 >= 0) {
                        j10 = MediaDataController.calcHash(j10, j11);
                    }
                }
            }
            j3 = j10;
        }
        TL_account.getWallPapers getwallpapers = new TL_account.getWallPapers();
        getwallpapers.hash = j3;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new di.u3(13, this, z10)), this.classGuid);
    }

    public final void C0() {
        this.a = 0;
        int i10 = this.v;
        if (i10 == 0) {
            this.uploadImageRow = 0;
            this.b = 1;
            this.a = 3;
            this.c = 2;
            this.r = -1;
            this.s = -1;
        } else if (i10 == 2) {
            this.uploadImageRow = -1;
            this.b = -1;
            this.c = -1;
            this.r = 0;
            this.a = 2;
            this.s = 1;
        } else {
            this.uploadImageRow = -1;
            this.b = -1;
            this.c = -1;
            this.r = -1;
            this.s = -1;
        }
        if (this.e0.isEmpty()) {
            this.d = -1;
        } else {
            int ceil = (int) Math.ceil(r0.size() / this.R);
            this.e = ceil;
            int i11 = this.a;
            this.d = i11;
            this.a = i11 + ceil;
        }
        if (i10 == 0) {
            int i12 = this.a;
            this.f = i12;
            this.h = i12 + 1;
            this.a = i12 + 3;
            this.n = i12 + 2;
        } else {
            this.f = -1;
            this.h = -1;
            this.n = -1;
        }
        ij1 ij1Var = this.I;
        if (ij1Var != null) {
            this.j0 = true;
            ij1Var.l();
        }
    }

    public final void D0() {
        int childCount = this.H.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.H.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.eb) {
                org.telegram.ui.Cells.eb ebVar = (org.telegram.ui.Cells.eb) childAt;
                for (int i11 = 0; i11 < 5; i11++) {
                    ebVar.c(i11, false, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        int i10 = 1;
        this.w = new Paint(1);
        Paint paint = new Paint(1);
        this.x = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.x.setStyle(Paint.Style.STROKE);
        this.x.setColor(855638016);
        this.Q = new org.telegram.ui.Components.p81(getParentActivity(), this, new aj1(this));
        this.hasOwnBackground = true;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i11 = this.v;
        if (i11 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChatBackground));
        } else if (i11 == 2) {
            this.actionBar.setTitle("Channel Wallpaper");
        } else if (i11 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.SelectColorTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new dj1(this));
        boolean z10 = false;
        if (i11 == 0) {
            org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
            a2.F();
            a2.H = new ej1(this);
            this.L = a2;
            a2.setSearchFieldHint(LocaleController.getString(R.string.SearchBackgrounds));
            org.telegram.ui.ActionBar.z j3 = this.actionBar.j(null);
            j3.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.s8, false));
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i12 = org.telegram.ui.ActionBar.j6.v8;
            kVar.C(org.telegram.ui.ActionBar.j6.w0(null, i12, false), true);
            this.actionBar.B(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.t8, false), true);
            NumberTextView numberTextView = new NumberTextView(j3.getContext());
            this.M = numberTextView;
            numberTextView.setTextSize(18);
            this.M.setTypeface(AndroidUtilities.bold());
            this.M.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
            this.M.setOnTouchListener(new ff1(1));
            j3.addView(this.M, w7.x5.m(1.0f, 0, -1, 65, 0, 0));
            org.telegram.ui.ActionBar.v0 h = j3.h(3, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f));
            ArrayList arrayList = this.O;
            arrayList.add(h);
            arrayList.add(j3.h(4, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f)));
            this.i0.clear();
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(context, null);
        this.H = ll0Var;
        ll0Var.o1();
        this.actionBar.setAdaptiveBackground(this.H);
        org.telegram.ui.Components.ll0 ll0Var2 = this.H;
        int i13 = org.telegram.ui.ActionBar.j6.a7;
        ll0Var2.setBackgroundColor(getThemedColor(i13));
        this.H.setClipToPadding(false);
        this.H.setHorizontalScrollBarEnabled(false);
        this.H.setVerticalScrollBarEnabled(false);
        this.H.setItemAnimator(null);
        this.H.setLayoutAnimation(null);
        org.telegram.ui.Components.ll0 ll0Var3 = this.H;
        hg.b0 b0Var = new hg.b0(i10, z10, 19);
        this.K = b0Var;
        ll0Var3.setLayoutManager(b0Var);
        frameLayout.addView(this.H, w7.x5.e(-1, -1, 51));
        org.telegram.ui.Components.ll0 ll0Var4 = this.H;
        ij1 ij1Var = new ij1(this, context);
        this.I = ij1Var;
        ll0Var4.setAdapter(ij1Var);
        this.J = new jj1(this, context);
        this.H.setGlowColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.e8, false));
        this.H.setOnItemClickListener(new b31(this, 12));
        this.H.setOnScrollListener(new oe1(this, 3));
        org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(context, null);
        this.N = mzVar;
        mzVar.setVisibility(8);
        this.N.setShowAtCenter(true);
        this.N.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        this.N.setText(LocaleController.getString(R.string.NoResult));
        this.H.setEmptyView(this.N);
        frameLayout.addView(this.N, w7.x5.c(-1.0f, -1));
        C0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        ArrayList arrayList;
        gj1 gj1Var;
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
            org.telegram.ui.Components.ll0 ll0Var = this.H;
            if (ll0Var != null) {
                ll0Var.e1();
            }
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.h(true);
                return;
            }
            return;
        }
        ArrayList arrayList2 = (ArrayList) objArr[0];
        this.g0.clear();
        HashMap hashMap2 = this.h0;
        hashMap2.clear();
        HashMap hashMap3 = this.c0;
        ArrayList arrayList3 = this.f0;
        int i15 = this.v;
        HashMap hashMap4 = this.d0;
        ArrayList arrayList4 = this.e0;
        if (i15 != 1 && i15 != 2) {
            arrayList4.clear();
            arrayList3.clear();
            hashMap4.clear();
            ArrayList arrayList5 = this.b0;
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
                                this.g0.add(wallPaper);
                                hashMap2.put(Long.valueOf(wallPaper.document.id), wallPaper);
                            }
                        }
                        hashMap3.put(wallPaper.slug, wallPaper);
                        if (i12 != i14 && ((!(z10 = wallPaper.pattern) || ((wallPaperSettings3 = wallPaper.settings) != null && wallPaperSettings3.background_color != 0)) && ((i12 != 2 || z10) && (org.telegram.ui.ActionBar.j6.I.q() || (wallPaperSettings2 = wallPaper.settings) == null || wallPaperSettings2.intensity >= 0)))) {
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
                        gj1Var = new gj1(i17, i18, null, wallPaperSettings4.rotation);
                    } else {
                        arrayList = arrayList2;
                        gj1Var = new gj1(null, i17, i18, i13, wallPaperSettings4.fourth_background_color);
                        hashMap = hashMap2;
                    }
                    gj1Var.a = wallPaper.slug;
                    gj1Var.h = wallPaperSettings4.intensity / 100.0f;
                    gj1Var.f = AndroidUtilities.getWallpaperRotation(wallPaperSettings4.rotation, false);
                    gj1Var.l = wallPaper;
                    if (wallPaper.id < 0) {
                        String a2 = gj1Var.a();
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
                            arrayList3.add(gj1Var);
                            hashMap4.put(a2, gj1Var);
                        }
                    }
                    if (org.telegram.ui.ActionBar.j6.I.q() || (wallPaperSettings = wallPaper.settings) == null || wallPaperSettings.intensity >= 0) {
                        arrayList4.add(gj1Var);
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
        this.S = org.telegram.ui.ActionBar.j6.H0();
        A0();
        B0(false);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.j6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 0, null, null, null, null, i10));
        View view2 = this.fragmentView;
        int i11 = org.telegram.ui.ActionBar.j6.a7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view2, 0, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.H, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.H, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.H, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.H, 48, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.H, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.H, 48, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.H, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.H, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.H, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.m6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.H, 0, new Class[]{org.telegram.ui.Cells.u3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.H, 16, new Class[]{org.telegram.ui.Cells.u3.class}, null, null, null, org.telegram.ui.ActionBar.j6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.N, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.N, 2048, null, null, null, null, org.telegram.ui.ActionBar.j6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.N, 1, null, null, null, null, i10));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.Q.a(i10, i11, intent);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.ll0 ll0Var = this.H;
        if (ll0Var != null) {
            ll0Var.getViewTreeObserver().addOnPreDrawListener(new ei(this, 6));
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        int i10 = this.v;
        if (i10 == 0 || i10 == 2) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersDidLoad);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewWallpapper);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersNeedReload);
            getMessagesStorage().getWallpapers();
        } else {
            z0(this.e0, org.telegram.ui.ActionBar.j6.I.q());
            if (i10 == 1 && this.g0.isEmpty()) {
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersDidLoad);
                getMessagesStorage().getWallpapers();
            }
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        int i10 = this.v;
        if (i10 == 0 || i10 == 2) {
            jj1 jj1Var = this.J;
            if (jj1Var.s != 0) {
                ConnectionsManager.getInstance(jj1Var.E.currentAccount).cancelRequest(jj1Var.s, true);
                jj1Var.s = 0;
            }
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersDidLoad);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersNeedReload);
        } else if (i10 == 1) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersDidLoad);
        }
        this.Q.getClass();
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        MessagesController.getGlobalMainSettings();
        org.telegram.ui.ActionBar.b6 b6Var = org.telegram.ui.ActionBar.j6.I.i0;
        if (b6Var != null) {
            String str = b6Var.c;
            this.S = str;
            if (str == null) {
                this.S = "";
            }
            this.T = b6Var.d;
            this.U = b6Var.e;
            this.V = b6Var.f;
            this.W = b6Var.g;
            this.X = b6Var.h;
            this.Y = b6Var.k;
            this.Z = b6Var.j;
            this.a0 = b6Var.i;
        } else {
            this.S = org.telegram.ui.ActionBar.j6.d1() ? "t" : "d";
            this.T = 0;
            this.U = 0;
            this.V = 0;
            this.W = 0;
            this.X = 45;
            this.Y = 1.0f;
            this.Z = false;
            this.a0 = false;
        }
        A0();
        org.telegram.ui.Components.ll0 ll0Var = this.H;
        if (ll0Var != null) {
            ll0Var.getViewTreeObserver().addOnPreDrawListener(new ei(this, 6));
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void restoreSelfArgs(Bundle bundle) {
        this.Q.a = bundle.getString("path");
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void saveSelfArgs(Bundle bundle) {
        String str = this.Q.a;
        if (str != null) {
            bundle.putString("path", str);
        }
    }
}
