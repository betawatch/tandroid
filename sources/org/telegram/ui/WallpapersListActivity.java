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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public class WallpapersListActivity extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public static final int[][] h0 = {new int[]{-2368069, -9722489, -2762611, -7817084}, new int[]{-7487253, -4599318, -3755537, -1320977}, new int[]{-6832405, -5117462, -3755537, -1067044}, new int[]{-7676942, -7827988, -1859606, -9986835}, new int[]{-5190165, -6311702, -4461867, -5053475}, new int[]{-2430264, -6114049, -1258497, -4594945}, new int[]{-2298990, -7347754, -9985038, -8006011}, new int[]{-1399954, -990074, -876865, -1523602}, new int[]{-15438, -1916673, -6222, -471346}, new int[]{-2891798}, new int[]{-5913125}, new int[]{-9463352}, new int[]{-2956375}, new int[]{-5974898}, new int[]{-8537234}, new int[]{-1647186}, new int[]{-2769263}, new int[]{-3431303}, new int[]{-1326919}, new int[]{-2054243}, new int[]{-3573648}, new int[]{-1328696}, new int[]{-2056777}, new int[]{-2984557}, new int[]{-2440467}, new int[]{-2906649}, new int[]{-4880430}, new int[]{-4013331}, new int[]{-5921305}, new int[]{-8421424}, new int[]{-4005139}, new int[]{-5908761}, new int[]{-8406320}, new int[]{-2702663}, new int[]{-6518654}, new int[]{-16777216}};
    public static final int[][] i0 = {new int[]{-14797481, -15394250, -14924974, -14006975}, new int[]{-14867905, -14870478, -14997181, -15460815}, new int[]{-14666695, -15720408, -14861254, -15260107}, new int[]{-14932175, -15066075, -14208965, -15000799}, new int[]{-12968902, -14411460, -13029826, -15067598}, new int[]{-13885157, -12307670, -14542561, -12899018}, new int[]{-14797481, -15196106, -14924974, -15325638}, new int[]{-15658442, -15449521, -16047308, -12897955}, new int[]{-13809610, -15258855, -13221071, -15715791}, new int[]{-14865092}, new int[]{-15656154}, new int[]{-16051170}, new int[]{-14731745}, new int[]{-15524075}, new int[]{-15853808}, new int[]{-13685209}, new int[]{-14014945}, new int[]{-15132649}, new int[]{-12374480}, new int[]{-13755362}, new int[]{-14740716}, new int[]{-12374468}, new int[]{-13755352}, new int[]{-14740709}, new int[]{-12833213}, new int[]{-14083026}, new int[]{-14872031}, new int[]{-13554109}, new int[]{-14803922}, new int[]{-15461855}, new int[]{-13680833}, new int[]{-14602960}, new int[]{-15458784}, new int[]{-14211804}, new int[]{-15132906}, new int[]{-16777216}};
    public static final int[] j0 = {-16746753, -65536, -30208, -13824, -16718798, -14702165, -9240406, -409915, -9224159, -16777216, -10725281, -1};
    public static final String[] k0 = {"Blue", "Red", "Orange", "Yellow", "Green", "Teal", "Purple", "Pink", "Brown", "Black", "Gray", "White"};
    public static final int[] l0 = {R.string.Blue, R.string.Red, R.string.Orange, R.string.Yellow, R.string.Green, R.string.Teal, R.string.Purple, R.string.Pink, R.string.Brown, R.string.Black, R.string.Gray, R.string.White};
    public ni1 B;
    public mi1 C;
    public ni1 D;
    public org.telegram.ui.Components.sl0 E;
    public oi1 F;
    public pi1 G;
    public k H;
    public org.telegram.ui.ActionBar.w0 I;
    public NumberTextView J;
    public org.telegram.ui.Components.mz K;
    public final ArrayList L;
    public org.telegram.ui.ActionBar.d2 M;
    public org.telegram.ui.Components.s81 N;
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
    public int r;
    public int s;
    private int uploadImageRow;
    public final int v;
    public Paint w;
    public Paint x;
    public mi1 y;

    public WallpapersListActivity(int i10) {
        super(null);
        this.L = new ArrayList();
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
        this.v = i10;
    }

    public static void U(WallpapersListActivity wallpapersListActivity) {
        if (wallpapersListActivity.actionBar.s()) {
            wallpapersListActivity.f0.clear();
            wallpapersListActivity.actionBar.r();
            wallpapersListActivity.D0();
        }
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(wallpapersListActivity.getParentActivity(), 3, null);
        wallpapersListActivity.M = d2Var;
        d2Var.d0 = false;
        d2Var.show();
        ConnectionsManager.getInstance(wallpapersListActivity.currentAccount).sendRequest(new TL_account.resetWallPapers(), new o(wallpapersListActivity, 24));
    }

    public static void V(WallpapersListActivity wallpapersListActivity, int i10) {
        if (wallpapersListActivity.getParentActivity() == null || wallpapersListActivity.E.getAdapter() == wallpapersListActivity.G) {
            return;
        }
        if (i10 == wallpapersListActivity.uploadImageRow) {
            wallpapersListActivity.N.b();
            return;
        }
        if (i10 == wallpapersListActivity.b) {
            WallpapersListActivity wallpapersListActivity2 = new WallpapersListActivity(1);
            wallpapersListActivity2.d0 = wallpapersListActivity.d0;
            wallpapersListActivity.presentFragment(wallpapersListActivity2);
        } else if (i10 == wallpapersListActivity.h) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wallpapersListActivity.getParentActivity());
            alertDialog$Builder.a.O = LocaleController.getString(R.string.ResetChatBackgroundsAlertTitle);
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.ResetChatBackgroundsAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new fi1(wallpapersListActivity));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            wallpapersListActivity.showDialog(d2Var);
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
            }
        }
    }

    public static void r0(WallpapersListActivity wallpapersListActivity, org.telegram.ui.Components.yi yiVar, Object obj, int i10) {
        Object obj2 = obj;
        LongSparseArray longSparseArray = wallpapersListActivity.f0;
        boolean z4 = true;
        if (wallpapersListActivity.actionBar.s()) {
            Object obj3 = obj2 instanceof mi1 ? ((mi1) obj2).l : obj2;
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
                    wallpapersListActivity.J.a(longSparseArray.size(), true);
                }
                wallpapersListActivity.g0 = false;
                yiVar.c(i10, longSparseArray.indexOfKey(wallPaper.id) >= 0, true);
                return;
            }
            return;
        }
        boolean z10 = obj2 instanceof TLRPC.TL_wallPaper;
        Bitmap bitmap = null;
        String str = z10 ? ((TLRPC.TL_wallPaper) obj2).slug : obj2 instanceof mi1 ? ((mi1) obj2).a : obj2 instanceof ni1 ? ((ni1) obj2).a : null;
        if (z10) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj2;
            if (tL_wallPaper.pattern) {
                String str2 = tL_wallPaper.slug;
                TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper.settings;
                mi1 mi1Var = new mi1(str2, wallPaperSettings.background_color, wallPaperSettings.second_background_color, wallPaperSettings.third_background_color, wallPaperSettings.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings.rotation, false), r1.intensity / 100.0f, tL_wallPaper.settings.motion, null);
                mi1Var.g = tL_wallPaper;
                mi1Var.l = tL_wallPaper;
                obj2 = mi1Var;
            }
        }
        org.telegram.ui.Components.xo xoVar = new org.telegram.ui.Components.xo(obj2, bitmap, z4, 4);
        if (wallpapersListActivity.v == 1) {
            xoVar.F1 = new fi1(wallpapersListActivity);
        }
        if (wallpapersListActivity.P.equals(str)) {
            boolean z11 = wallpapersListActivity.X;
            boolean z12 = wallpapersListActivity.W;
            float f10 = wallpapersListActivity.V;
            xoVar.C1 = z11;
            xoVar.B1 = z12;
            xoVar.k1 = f10;
        }
        xoVar.R0 = wallpapersListActivity.d0;
        if (xoVar.b == 1 || (xoVar.y1 instanceof mi1)) {
            ((mi1) xoVar.y1).getClass();
        }
        xoVar.c1(0L);
        org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
        n2Var.a = true;
        xoVar.a.a = wallpapersListActivity.resourceProvider;
        n2Var.c = new c21(6);
        n2Var.e = true;
        wallpapersListActivity.showAsSheet(xoVar, n2Var);
    }

    public static boolean s0(WallpapersListActivity wallpapersListActivity, org.telegram.ui.Components.yi yiVar, Object obj, int i10) {
        ArrayList arrayList = wallpapersListActivity.L;
        int i11 = wallpapersListActivity.v;
        if (i11 != 2 && i11 != 3) {
            Object obj2 = obj instanceof mi1 ? ((mi1) obj).l : obj;
            if (!wallpapersListActivity.actionBar.s() && wallpapersListActivity.getParentActivity() != null && (obj2 instanceof TLRPC.WallPaper)) {
                AndroidUtilities.hideKeyboard(wallpapersListActivity.getParentActivity().getCurrentFocus());
                wallpapersListActivity.f0.put(((TLRPC.WallPaper) obj2).id, obj);
                wallpapersListActivity.J.a(1, false);
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
                wallpapersListActivity.g0 = false;
                wallpapersListActivity.actionBar.O(null, null);
                yiVar.c(i10, true, true);
                return true;
            }
        }
        return false;
    }

    public static void z0(ArrayList arrayList, boolean z4) {
        for (int[] iArr : z4 ? i0 : h0) {
            if (iArr.length == 1) {
                arrayList.add(new mi1(iArr[0], 0, "c", 45));
            } else {
                arrayList.add(new mi1("c", iArr[0], iArr[1], iArr[2], iArr[3]));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10, types: [org.telegram.tgnet.TLRPC$TL_wallPaper, org.telegram.tgnet.TLRPC$WallPaper] */
    /* JADX WARN: Type inference failed for: r5v11, types: [org.telegram.ui.mi1] */
    public final void A0() {
        int i10;
        HashMap hashMap;
        TLRPC.TL_wallPaper tL_wallPaper;
        final String str;
        final long j10;
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
            mi1 mi1Var = this.y;
            ArrayList arrayList = this.b0;
            if (mi1Var != null) {
                arrayList.remove(mi1Var);
                this.y = null;
            }
            ni1 ni1Var = this.B;
            if (ni1Var != null) {
                arrayList.remove(ni1Var);
                this.B = null;
            }
            mi1 mi1Var2 = this.C;
            if (mi1Var2 == null) {
                mi1 mi1Var3 = new mi1("d", -2368069, -9722489, -2762611, -7817084);
                this.C = mi1Var3;
                mi1Var3.h = 0.34f;
            } else {
                arrayList.remove(mi1Var2);
            }
            ni1 ni1Var2 = this.D;
            if (ni1Var2 != null) {
                arrayList.remove(ni1Var2);
            }
            int size = arrayList.size();
            while (true) {
                hashMap = this.Z;
                if (i10 >= size) {
                    tL_wallPaper = 0;
                    break;
                }
                Object obj3 = arrayList.get(i10);
                if (obj3 instanceof mi1) {
                    tL_wallPaper = (mi1) obj3;
                    String str3 = tL_wallPaper.a;
                    if (str3 != null) {
                        tL_wallPaper.g = (TLRPC.TL_wallPaper) hashMap.get(str3);
                    }
                    if (!"c".equals(tL_wallPaper.a)) {
                        String str4 = tL_wallPaper.a;
                        i10 = (str4 == null || TextUtils.equals(this.P, str4)) ? 0 : i10 + 1;
                    }
                    if (this.Q == tL_wallPaper.b) {
                        int i16 = this.R;
                        if (i16 != tL_wallPaper.c) {
                            continue;
                        } else if (this.S != tL_wallPaper.d) {
                            continue;
                        } else if (this.T != tL_wallPaper.e) {
                            continue;
                        } else if (i16 == 0 || this.U == tL_wallPaper.f) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    if (obj3 instanceof TLRPC.TL_wallPaper) {
                        tL_wallPaper = (TLRPC.TL_wallPaper) obj3;
                        if (tL_wallPaper.settings != null && TextUtils.equals(this.P, tL_wallPaper.slug) && this.Q == org.telegram.ui.ActionBar.j6.X0(tL_wallPaper.settings.background_color) && this.R == org.telegram.ui.ActionBar.j6.X0(tL_wallPaper.settings.second_background_color) && this.S == org.telegram.ui.ActionBar.j6.X0(tL_wallPaper.settings.third_background_color) && this.T == org.telegram.ui.ActionBar.j6.X0(tL_wallPaper.settings.fourth_background_color) && ((this.R == 0 || this.U == AndroidUtilities.getWallpaperRotation(tL_wallPaper.settings.rotation, false)) && Math.abs(org.telegram.ui.ActionBar.j6.R0(tL_wallPaper.settings.intensity / 100.0f) - this.V) <= 0.001f)) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
            if (tL_wallPaper instanceof TLRPC.WallPaper) {
                TLRPC.TL_wallPaper tL_wallPaper4 = tL_wallPaper;
                org.telegram.ui.ActionBar.c6 c6Var = org.telegram.ui.ActionBar.j6.I.f0;
                TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper4.settings;
                if (wallPaperSettings != null && this.Q == org.telegram.ui.ActionBar.j6.X0(wallPaperSettings.background_color) && this.R == org.telegram.ui.ActionBar.j6.X0(tL_wallPaper4.settings.second_background_color) && this.S == org.telegram.ui.ActionBar.j6.X0(tL_wallPaper4.settings.third_background_color) && this.T == org.telegram.ui.ActionBar.j6.X0(tL_wallPaper4.settings.fourth_background_color) && (this.R == 0 || this.S != 0 || this.U == AndroidUtilities.getWallpaperRotation(tL_wallPaper4.settings.rotation, false) || Math.abs(org.telegram.ui.ActionBar.j6.R0(tL_wallPaper4.settings.intensity / 100.0f) - this.V) <= 0.001f)) {
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
                j10 = (!(tL_wallPaper instanceof mi1) || (wallPaper = tL_wallPaper.l) == null) ? 0L : wallPaper.id;
                obj = tL_wallPaper;
                tL_wallPaper2 = null;
            }
            final boolean q10 = org.telegram.ui.ActionBar.j6.A0().q();
            try {
                Collections.sort(arrayList, new Comparator() { // from class: org.telegram.ui.ei1
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        ArrayList arrayList2 = WallpapersListActivity.this.Y;
                        if (obj4 instanceof mi1) {
                            obj4 = ((mi1) obj4).l;
                        }
                        if (obj5 instanceof mi1) {
                            obj5 = ((mi1) obj5).l;
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
                        boolean z4 = q10;
                        if (!z4) {
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
                            return (!z10 || wallPaper3.dark) ? z4 ? 1 : -1 : z4 ? -1 : 1;
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
            if (org.telegram.ui.ActionBar.j6.d1() && TextUtils.isEmpty(org.telegram.ui.ActionBar.j6.h0)) {
                if (this.D == null) {
                    ni1 ni1Var3 = new ni1();
                    ni1Var3.a = "t";
                    ni1Var3.b = -2;
                    ni1Var3.c = -2;
                    this.D = ni1Var3;
                }
                arrayList.add(0, this.D);
            } else {
                this.D = null;
            }
            org.telegram.ui.ActionBar.i6 i6Var = org.telegram.ui.ActionBar.j6.I;
            if (TextUtils.isEmpty(this.P) || (!"d".equals(this.P) && obj == null)) {
                if ("c".equals(this.P) || (i12 = this.Q) == 0) {
                    int i17 = this.Q;
                    if (i17 != 0) {
                        int i18 = this.R;
                        if (i18 == 0 || (i11 = this.S) == 0) {
                            this.y = new mi1(i17, i18, this.P, this.U);
                        } else {
                            mi1 mi1Var4 = new mi1(this.P, i17, i18, i11, this.T);
                            this.y = mi1Var4;
                            mi1Var4.f = this.U;
                        }
                        arrayList.add(0, this.y);
                    } else if (i6Var.f0 != null && !hashMap.containsKey(this.P)) {
                        ni1 ni1Var4 = new ni1(new File(ApplicationLoader.getFilesDirFixed(), i6Var.f0.a), new File(ApplicationLoader.getFilesDirFixed(), i6Var.f0.b), this.P);
                        this.B = ni1Var4;
                        arrayList.add(this.D != null ? 1 : 0, ni1Var4);
                    }
                } else if (i6Var.f0 != null) {
                    mi1 mi1Var5 = new mi1(this.P, i12, this.R, this.S, this.T, this.U, this.V, this.W, new File(ApplicationLoader.getFilesDirFixed(), i6Var.f0.a));
                    this.y = mi1Var5;
                    mi1Var5.g = tL_wallPaper2;
                    arrayList.add(0, mi1Var5);
                }
            } else if (obj == null && this.Q != 0 && "c".equals(this.P)) {
                int i19 = this.R;
                if (i19 == 0 || (i13 = this.S) == 0 || (i14 = this.T) == 0) {
                    this.y = new mi1(this.Q, i19, this.P, this.U);
                } else {
                    mi1 mi1Var6 = new mi1(this.P, this.Q, i19, i13, i14);
                    this.y = mi1Var6;
                    mi1Var6.f = this.U;
                }
                arrayList.add(0, this.y);
            }
            if ("d".equals(this.P) || arrayList.isEmpty()) {
                arrayList.add(0, this.C);
            } else {
                arrayList.add(1, this.C);
            }
            C0();
        }
    }

    public final void B0(boolean z4) {
        long j10 = 0;
        if (!z4) {
            ArrayList arrayList = this.Y;
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
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new org.telegram.messenger.zd(12, this, z4)), this.classGuid);
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
        if (this.b0.isEmpty()) {
            this.d = -1;
        } else {
            int ceil = (int) Math.ceil(r0.size() / this.O);
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
        oi1 oi1Var = this.F;
        if (oi1Var != null) {
            this.g0 = true;
            oi1Var.l();
        }
    }

    public final void D0() {
        int childCount = this.E.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.E.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.za) {
                org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) childAt;
                for (int i11 = 0; i11 < 5; i11++) {
                    zaVar.c(i11, false, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        int i10 = 1;
        this.w = new Paint(1);
        Paint paint = new Paint(1);
        this.x = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.x.setStyle(Paint.Style.STROKE);
        this.x.setColor(855638016);
        this.N = new org.telegram.ui.Components.s81(getParentActivity(), this, new gi1(this));
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
        this.actionBar.setActionBarMenuOnItemClick(new ji1(this));
        boolean z4 = false;
        if (i11 == 0) {
            org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
            a2.F();
            a2.E = new ki1(this);
            this.I = a2;
            a2.setSearchFieldHint(LocaleController.getString(R.string.SearchBackgrounds));
            org.telegram.ui.ActionBar.z j10 = this.actionBar.j(null);
            j10.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.s8, false));
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i12 = org.telegram.ui.ActionBar.j6.v8;
            kVar.C(org.telegram.ui.ActionBar.j6.w0(null, i12, false), true);
            this.actionBar.B(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.t8, false), true);
            NumberTextView numberTextView = new NumberTextView(j10.getContext());
            this.J = numberTextView;
            numberTextView.setTextSize(18);
            this.J.setTypeface(AndroidUtilities.bold());
            this.J.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
            this.J.setOnTouchListener(new ke1(1));
            j10.addView(this.J, k7.b6.m(1.0f, 0, -1, 65, 0, 0));
            org.telegram.ui.ActionBar.w0 h = j10.h(3, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f));
            ArrayList arrayList = this.L;
            arrayList.add(h);
            arrayList.add(j10.h(4, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f)));
            this.f0.clear();
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(context, null);
        this.E = sl0Var;
        sl0Var.p1();
        this.actionBar.setAdaptiveBackground(this.E);
        org.telegram.ui.Components.sl0 sl0Var2 = this.E;
        int i13 = org.telegram.ui.ActionBar.j6.a7;
        sl0Var2.setBackgroundColor(getThemedColor(i13));
        this.E.setClipToPadding(false);
        this.E.setHorizontalScrollBarEnabled(false);
        this.E.setVerticalScrollBarEnabled(false);
        this.E.setItemAnimator(null);
        this.E.setLayoutAnimation(null);
        org.telegram.ui.Components.sl0 sl0Var3 = this.E;
        k kVar2 = new k(i10, z4, 17);
        this.H = kVar2;
        sl0Var3.setLayoutManager(kVar2);
        frameLayout.addView(this.E, k7.b6.e(-1, -1, 51));
        org.telegram.ui.Components.sl0 sl0Var4 = this.E;
        oi1 oi1Var = new oi1(this, context);
        this.F = oi1Var;
        sl0Var4.setAdapter(oi1Var);
        this.G = new pi1(this, context);
        this.E.setGlowColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.e8, false));
        this.E.setOnItemClickListener(new p21(this, 11));
        this.E.setOnScrollListener(new yb1(this, 4));
        org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(context, null);
        this.K = mzVar;
        mzVar.setVisibility(8);
        this.K.setShowAtCenter(true);
        this.K.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        this.K.setText(LocaleController.getString(R.string.NoResult));
        this.E.setEmptyView(this.K);
        frameLayout.addView(this.K, k7.b6.c(-1.0f, -1));
        C0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        ArrayList arrayList;
        mi1 mi1Var;
        HashMap hashMap;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i13;
        boolean z4;
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
            org.telegram.ui.Components.sl0 sl0Var = this.E;
            if (sl0Var != null) {
                sl0Var.f1();
            }
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.h(true);
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
        int i15 = this.v;
        HashMap hashMap4 = this.a0;
        ArrayList arrayList4 = this.b0;
        if (i15 != 1 && i15 != 2) {
            arrayList4.clear();
            arrayList3.clear();
            hashMap4.clear();
            ArrayList arrayList5 = this.Y;
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
                                this.d0.add(wallPaper);
                                hashMap2.put(Long.valueOf(wallPaper.document.id), wallPaper);
                            }
                        }
                        hashMap3.put(wallPaper.slug, wallPaper);
                        if (i12 != i14 && ((!(z4 = wallPaper.pattern) || ((wallPaperSettings3 = wallPaper.settings) != null && wallPaperSettings3.background_color != 0)) && ((i12 != 2 || z4) && (org.telegram.ui.ActionBar.j6.I.q() || (wallPaperSettings2 = wallPaper.settings) == null || wallPaperSettings2.intensity >= 0)))) {
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
                        mi1Var = new mi1(i17, i18, null, wallPaperSettings4.rotation);
                    } else {
                        arrayList = arrayList2;
                        mi1Var = new mi1(null, i17, i18, i13, wallPaperSettings4.fourth_background_color);
                        hashMap = hashMap2;
                    }
                    mi1Var.a = wallPaper.slug;
                    mi1Var.h = wallPaperSettings4.intensity / 100.0f;
                    mi1Var.f = AndroidUtilities.getWallpaperRotation(wallPaperSettings4.rotation, false);
                    mi1Var.l = wallPaper;
                    if (wallPaper.id < 0) {
                        String a2 = mi1Var.a();
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
                            arrayList3.add(mi1Var);
                            hashMap4.put(a2, mi1Var);
                        }
                    }
                    if (org.telegram.ui.ActionBar.j6.I.q() || (wallPaperSettings = wallPaper.settings) == null || wallPaperSettings.intensity >= 0) {
                        arrayList4.add(mi1Var);
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
        this.P = org.telegram.ui.ActionBar.j6.H0();
        A0();
        B0(false);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.j6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 0, null, null, null, null, i10));
        View view2 = this.fragmentView;
        int i11 = org.telegram.ui.ActionBar.j6.a7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view2, 0, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 48, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 48, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.m6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 0, new Class[]{org.telegram.ui.Cells.u3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 16, new Class[]{org.telegram.ui.Cells.u3.class}, null, null, null, org.telegram.ui.ActionBar.j6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.K, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.K, 2048, null, null, null, null, org.telegram.ui.ActionBar.j6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.K, 1, null, null, null, null, i10));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.N.a(i10, i11, intent);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.sl0 sl0Var = this.E;
        if (sl0Var != null) {
            sl0Var.getViewTreeObserver().addOnPreDrawListener(new ai(this, 6));
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        int i10 = this.v;
        if (i10 == 0 || i10 == 2) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersDidLoad);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewWallpapper);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersNeedReload);
            getMessagesStorage().getWallpapers();
        } else {
            z0(this.b0, org.telegram.ui.ActionBar.j6.I.q());
            if (i10 == 1 && this.d0.isEmpty()) {
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersDidLoad);
                getMessagesStorage().getWallpapers();
            }
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        int i10 = this.v;
        if (i10 == 0 || i10 == 2) {
            pi1 pi1Var = this.G;
            if (pi1Var.s != 0) {
                ConnectionsManager.getInstance(pi1Var.B.currentAccount).cancelRequest(pi1Var.s, true);
                pi1Var.s = 0;
            }
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersDidLoad);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersNeedReload);
        } else if (i10 == 1) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersDidLoad);
        }
        this.N.getClass();
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        MessagesController.getGlobalMainSettings();
        org.telegram.ui.ActionBar.c6 c6Var = org.telegram.ui.ActionBar.j6.I.f0;
        if (c6Var != null) {
            String str = c6Var.c;
            this.P = str;
            if (str == null) {
                this.P = "";
            }
            this.Q = c6Var.d;
            this.R = c6Var.e;
            this.S = c6Var.f;
            this.T = c6Var.g;
            this.U = c6Var.h;
            this.V = c6Var.k;
            this.W = c6Var.j;
            this.X = c6Var.i;
        } else {
            this.P = org.telegram.ui.ActionBar.j6.d1() ? "t" : "d";
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 45;
            this.V = 1.0f;
            this.W = false;
            this.X = false;
        }
        A0();
        org.telegram.ui.Components.sl0 sl0Var = this.E;
        if (sl0Var != null) {
            sl0Var.getViewTreeObserver().addOnPreDrawListener(new ai(this, 6));
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void restoreSelfArgs(Bundle bundle) {
        this.N.a = bundle.getString("path");
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void saveSelfArgs(Bundle bundle) {
        String str = this.N.a;
        if (str != null) {
            bundle.putString("path", str);
        }
    }
}
