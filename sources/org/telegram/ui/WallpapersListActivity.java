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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class WallpapersListActivity extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public static final int[][] g0 = {new int[]{-2368069, -9722489, -2762611, -7817084}, new int[]{-7487253, -4599318, -3755537, -1320977}, new int[]{-6832405, -5117462, -3755537, -1067044}, new int[]{-7676942, -7827988, -1859606, -9986835}, new int[]{-5190165, -6311702, -4461867, -5053475}, new int[]{-2430264, -6114049, -1258497, -4594945}, new int[]{-2298990, -7347754, -9985038, -8006011}, new int[]{-1399954, -990074, -876865, -1523602}, new int[]{-15438, -1916673, -6222, -471346}, new int[]{-2891798}, new int[]{-5913125}, new int[]{-9463352}, new int[]{-2956375}, new int[]{-5974898}, new int[]{-8537234}, new int[]{-1647186}, new int[]{-2769263}, new int[]{-3431303}, new int[]{-1326919}, new int[]{-2054243}, new int[]{-3573648}, new int[]{-1328696}, new int[]{-2056777}, new int[]{-2984557}, new int[]{-2440467}, new int[]{-2906649}, new int[]{-4880430}, new int[]{-4013331}, new int[]{-5921305}, new int[]{-8421424}, new int[]{-4005139}, new int[]{-5908761}, new int[]{-8406320}, new int[]{-2702663}, new int[]{-6518654}, new int[]{-16777216}};
    public static final int[][] h0 = {new int[]{-14797481, -15394250, -14924974, -14006975}, new int[]{-14867905, -14870478, -14997181, -15460815}, new int[]{-14666695, -15720408, -14861254, -15260107}, new int[]{-14932175, -15066075, -14208965, -15000799}, new int[]{-12968902, -14411460, -13029826, -15067598}, new int[]{-13885157, -12307670, -14542561, -12899018}, new int[]{-14797481, -15196106, -14924974, -15325638}, new int[]{-15658442, -15449521, -16047308, -12897955}, new int[]{-13809610, -15258855, -13221071, -15715791}, new int[]{-14865092}, new int[]{-15656154}, new int[]{-16051170}, new int[]{-14731745}, new int[]{-15524075}, new int[]{-15853808}, new int[]{-13685209}, new int[]{-14014945}, new int[]{-15132649}, new int[]{-12374480}, new int[]{-13755362}, new int[]{-14740716}, new int[]{-12374468}, new int[]{-13755352}, new int[]{-14740709}, new int[]{-12833213}, new int[]{-14083026}, new int[]{-14872031}, new int[]{-13554109}, new int[]{-14803922}, new int[]{-15461855}, new int[]{-13680833}, new int[]{-14602960}, new int[]{-15458784}, new int[]{-14211804}, new int[]{-15132906}, new int[]{-16777216}};
    public static final int[] i0 = {-16746753, -65536, -30208, -13824, -16718798, -14702165, -9240406, -409915, -9224159, -16777216, -10725281, -1};
    public static final String[] j0 = {"Blue", "Red", "Orange", "Yellow", "Green", "Teal", "Purple", "Pink", "Brown", "Black", "Gray", "White"};
    public static final int[] k0 = {R.string.Blue, R.string.Red, R.string.Orange, R.string.Yellow, R.string.Green, R.string.Teal, R.string.Purple, R.string.Pink, R.string.Brown, R.string.Black, R.string.Gray, R.string.White};
    public yh1 A;
    public xh1 B;
    public yh1 C;
    public org.telegram.ui.Components.wk0 D;
    public zh1 E;
    public bi1 F;
    public of.y G;
    public org.telegram.ui.ActionBar.w0 H;
    public NumberTextView I;
    public org.telegram.ui.Components.yy J;
    public final ArrayList K;
    public org.telegram.ui.ActionBar.c2 L;
    public org.telegram.ui.Components.u71 M;
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
    public int r;
    public int s;
    private int uploadImageRow;
    public final int v;
    public Paint w;
    public Paint x;
    public xh1 y;

    public WallpapersListActivity(int i9) {
        super(null);
        this.K = new ArrayList();
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
        this.v = i9;
    }

    public static void T(WallpapersListActivity wallpapersListActivity) {
        if (wallpapersListActivity.actionBar.s()) {
            wallpapersListActivity.e0.clear();
            wallpapersListActivity.actionBar.r();
            wallpapersListActivity.C0();
        }
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(wallpapersListActivity.getParentActivity(), 3, null);
        wallpapersListActivity.L = c2Var;
        c2Var.c0 = false;
        c2Var.show();
        ConnectionsManager.getInstance(wallpapersListActivity.currentAccount).sendRequest(new TL_account.resetWallPapers(), new m(wallpapersListActivity, 24));
    }

    public static void U(WallpapersListActivity wallpapersListActivity, int i9) {
        if (wallpapersListActivity.getParentActivity() == null || wallpapersListActivity.D.getAdapter() == wallpapersListActivity.F) {
            return;
        }
        if (i9 == wallpapersListActivity.uploadImageRow) {
            wallpapersListActivity.M.b();
            return;
        }
        if (i9 == wallpapersListActivity.b) {
            WallpapersListActivity wallpapersListActivity2 = new WallpapersListActivity(1);
            wallpapersListActivity2.c0 = wallpapersListActivity.c0;
            wallpapersListActivity.presentFragment(wallpapersListActivity2);
        } else if (i9 == wallpapersListActivity.h) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wallpapersListActivity.getParentActivity());
            alertDialog$Builder.a.N = LocaleController.getString(R.string.ResetChatBackgroundsAlertTitle);
            alertDialog$Builder.a.P = LocaleController.getString(R.string.ResetChatBackgroundsAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new rh1(wallpapersListActivity));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            wallpapersListActivity.showDialog(c2Var);
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
            }
        }
    }

    public static void q0(WallpapersListActivity wallpapersListActivity, org.telegram.ui.Components.xi xiVar, Object obj, int i9) {
        Object obj2 = obj;
        LongSparseArray longSparseArray = wallpapersListActivity.e0;
        boolean z10 = true;
        if (wallpapersListActivity.actionBar.s()) {
            Object obj3 = obj2 instanceof xh1 ? ((xh1) obj2).l : obj2;
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
                    wallpapersListActivity.I.a(longSparseArray.size(), true);
                }
                wallpapersListActivity.f0 = false;
                xiVar.c(i9, longSparseArray.indexOfKey(wallPaper.id) >= 0, true);
                return;
            }
            return;
        }
        boolean z11 = obj2 instanceof TLRPC.TL_wallPaper;
        Bitmap bitmap = null;
        String str = z11 ? ((TLRPC.TL_wallPaper) obj2).slug : obj2 instanceof xh1 ? ((xh1) obj2).a : obj2 instanceof yh1 ? ((yh1) obj2).a : null;
        if (z11) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj2;
            if (tL_wallPaper.pattern) {
                String str2 = tL_wallPaper.slug;
                TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper.settings;
                xh1 xh1Var = new xh1(str2, wallPaperSettings.background_color, wallPaperSettings.second_background_color, wallPaperSettings.third_background_color, wallPaperSettings.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings.rotation, false), r1.intensity / 100.0f, tL_wallPaper.settings.motion, null);
                xh1Var.g = tL_wallPaper;
                xh1Var.l = tL_wallPaper;
                obj2 = xh1Var;
            }
        }
        org.telegram.ui.Components.qo qoVar = new org.telegram.ui.Components.qo(obj2, bitmap, z10, 4);
        if (wallpapersListActivity.v == 1) {
            qoVar.E1 = new rh1(wallpapersListActivity);
        }
        if (wallpapersListActivity.O.equals(str)) {
            boolean z12 = wallpapersListActivity.W;
            boolean z13 = wallpapersListActivity.V;
            float f10 = wallpapersListActivity.U;
            qoVar.B1 = z12;
            qoVar.A1 = z13;
            qoVar.j1 = f10;
        }
        qoVar.Q0 = wallpapersListActivity.c0;
        if (qoVar.b == 1 || (qoVar.x1 instanceof xh1)) {
            ((xh1) qoVar.x1).getClass();
        }
        qoVar.c1(0L);
        org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
        m2Var.a = true;
        qoVar.a.a = wallpapersListActivity.resourceProvider;
        m2Var.c = new lj0(8);
        m2Var.e = true;
        wallpapersListActivity.showAsSheet(qoVar, m2Var);
    }

    public static boolean r0(WallpapersListActivity wallpapersListActivity, org.telegram.ui.Components.xi xiVar, Object obj, int i9) {
        ArrayList arrayList = wallpapersListActivity.K;
        int i10 = wallpapersListActivity.v;
        if (i10 != 2 && i10 != 3) {
            Object obj2 = obj instanceof xh1 ? ((xh1) obj).l : obj;
            if (!wallpapersListActivity.actionBar.s() && wallpapersListActivity.getParentActivity() != null && (obj2 instanceof TLRPC.WallPaper)) {
                AndroidUtilities.hideKeyboard(wallpapersListActivity.getParentActivity().getCurrentFocus());
                wallpapersListActivity.e0.put(((TLRPC.WallPaper) obj2).id, obj);
                wallpapersListActivity.I.a(1, false);
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    View view = (View) arrayList.get(i11);
                    AndroidUtilities.clearDrawableAnimation(view);
                    arrayList2.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.1f, 1.0f));
                }
                animatorSet.playTogether(arrayList2);
                animatorSet.setDuration(250L);
                animatorSet.start();
                wallpapersListActivity.f0 = false;
                wallpapersListActivity.actionBar.N(null, null);
                xiVar.c(i9, true, true);
                return true;
            }
        }
        return false;
    }

    public static void y0(ArrayList arrayList, boolean z10) {
        for (int[] iArr : z10 ? h0 : g0) {
            if (iArr.length == 1) {
                arrayList.add(new xh1(iArr[0], 0, "c", 45));
            } else {
                arrayList.add(new xh1("c", iArr[0], iArr[1], iArr[2], iArr[3]));
            }
        }
    }

    public final void A0(boolean z10) {
        long j10 = 0;
        if (!z10) {
            ArrayList arrayList = this.X;
            int size = arrayList.size();
            long j11 = 0;
            for (int i9 = 0; i9 < size; i9++) {
                Object obj = arrayList.get(i9);
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
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new kh.o3(13, this, z10)), this.classGuid);
    }

    public final void B0() {
        this.a = 0;
        int i9 = this.v;
        if (i9 == 0) {
            this.uploadImageRow = 0;
            this.b = 1;
            this.a = 3;
            this.c = 2;
            this.r = -1;
            this.s = -1;
        } else if (i9 == 2) {
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
        if (this.a0.isEmpty()) {
            this.d = -1;
        } else {
            int ceil = (int) Math.ceil(r0.size() / this.N);
            this.e = ceil;
            int i10 = this.a;
            this.d = i10;
            this.a = i10 + ceil;
        }
        if (i9 == 0) {
            int i11 = this.a;
            this.f = i11;
            this.h = i11 + 1;
            this.a = i11 + 3;
            this.n = i11 + 2;
        } else {
            this.f = -1;
            this.h = -1;
            this.n = -1;
        }
        zh1 zh1Var = this.E;
        if (zh1Var != null) {
            this.f0 = true;
            zh1Var.l();
        }
    }

    public final void C0() {
        int childCount = this.D.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = this.D.getChildAt(i9);
            if (childAt instanceof org.telegram.ui.Cells.za) {
                org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) childAt;
                for (int i10 = 0; i10 < 5; i10++) {
                    zaVar.c(i10, false, true);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        int i9 = 1;
        this.w = new Paint(1);
        Paint paint = new Paint(1);
        this.x = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.x.setStyle(Paint.Style.STROKE);
        this.x.setColor(855638016);
        this.M = new org.telegram.ui.Components.u71(getParentActivity(), this, new sh1(this));
        this.hasOwnBackground = true;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = this.v;
        if (i10 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChatBackground));
        } else if (i10 == 2) {
            this.actionBar.setTitle("Channel Wallpaper");
        } else if (i10 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.SelectColorTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new uh1(this));
        boolean z10 = false;
        if (i10 == 0) {
            org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
            a2.F();
            a2.D = new vh1(this);
            this.H = a2;
            a2.setSearchFieldHint(LocaleController.getString(R.string.SearchBackgrounds));
            org.telegram.ui.ActionBar.z j10 = this.actionBar.j(null);
            j10.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.s8, false));
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i11 = org.telegram.ui.ActionBar.f6.v8;
            kVar.C(org.telegram.ui.ActionBar.f6.w0(null, i11, false), true);
            this.actionBar.A(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.t8, false), true);
            NumberTextView numberTextView = new NumberTextView(j10.getContext());
            this.I = numberTextView;
            numberTextView.setTextSize(18);
            this.I.setTypeface(AndroidUtilities.bold());
            this.I.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
            this.I.setOnTouchListener(new wd1(1));
            j10.addView(this.I, g7.e6.m(1.0f, 0, -1, 65, 0, 0));
            org.telegram.ui.ActionBar.w0 h = j10.h(3, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f));
            ArrayList arrayList = this.K;
            arrayList.add(h);
            arrayList.add(j10.h(4, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f)));
            this.e0.clear();
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.D = wk0Var;
        wk0Var.p1();
        this.actionBar.setAdaptiveBackground(this.D);
        org.telegram.ui.Components.wk0 wk0Var2 = this.D;
        int i12 = org.telegram.ui.ActionBar.f6.a7;
        wk0Var2.setBackgroundColor(getThemedColor(i12));
        this.D.setClipToPadding(false);
        this.D.setHorizontalScrollBarEnabled(false);
        this.D.setVerticalScrollBarEnabled(false);
        this.D.setItemAnimator(null);
        this.D.setLayoutAnimation(null);
        org.telegram.ui.Components.wk0 wk0Var3 = this.D;
        of.y yVar = new of.y(i9, z10, 18);
        this.G = yVar;
        wk0Var3.setLayoutManager(yVar);
        frameLayout.addView(this.D, g7.e6.e(-1, -1, 51));
        org.telegram.ui.Components.wk0 wk0Var4 = this.D;
        zh1 zh1Var = new zh1(this, context);
        this.E = zh1Var;
        wk0Var4.setAdapter(zh1Var);
        this.F = new bi1(this, context);
        this.D.setGlowColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.e8, false));
        this.D.setOnItemClickListener(new c21(this, 11));
        this.D.setOnScrollListener(new kb1(this, 4));
        org.telegram.ui.Components.yy yyVar = new org.telegram.ui.Components.yy(context, null);
        this.J = yyVar;
        yyVar.setVisibility(8);
        this.J.setShowAtCenter(true);
        this.J.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        this.J.setText(LocaleController.getString(R.string.NoResult));
        this.D.setEmptyView(this.J);
        frameLayout.addView(this.J, g7.e6.c(-1.0f, -1));
        B0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        int i11;
        ArrayList arrayList;
        xh1 xh1Var;
        HashMap hashMap;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i12;
        boolean z10;
        TLRPC.WallPaperSettings wallPaperSettings2;
        TLRPC.WallPaperSettings wallPaperSettings3;
        int i13 = 1;
        if (i9 != NotificationCenter.wallpapersDidLoad) {
            if (i9 != NotificationCenter.didSetNewWallpapper) {
                if (i9 == NotificationCenter.wallpapersNeedReload) {
                    getMessagesStorage().getWallpapers();
                    return;
                }
                return;
            }
            org.telegram.ui.Components.wk0 wk0Var = this.D;
            if (wk0Var != null) {
                wk0Var.f1();
            }
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.h(true);
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
        int i14 = this.v;
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
                        if (i11 != i13 && ((!(z10 = wallPaper.pattern) || ((wallPaperSettings3 = wallPaper.settings) != null && wallPaperSettings3.background_color != 0)) && ((i11 != 2 || z10) && (org.telegram.ui.ActionBar.f6.I.q() || (wallPaperSettings2 = wallPaper.settings) == null || wallPaperSettings2.intensity >= 0)))) {
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
                        xh1Var = new xh1(i16, i17, null, wallPaperSettings4.rotation);
                    } else {
                        arrayList = arrayList2;
                        xh1Var = new xh1(null, i16, i17, i12, wallPaperSettings4.fourth_background_color);
                        hashMap = hashMap2;
                    }
                    xh1Var.a = wallPaper.slug;
                    xh1Var.h = wallPaperSettings4.intensity / 100.0f;
                    xh1Var.f = AndroidUtilities.getWallpaperRotation(wallPaperSettings4.rotation, false);
                    xh1Var.l = wallPaper;
                    if (wallPaper.id < 0) {
                        String a2 = xh1Var.a();
                        if (hashMap4.containsKey(a2)) {
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
                            arrayList3.add(xh1Var);
                            hashMap4.put(a2, xh1Var);
                        }
                    }
                    if (org.telegram.ui.ActionBar.f6.I.q() || (wallPaperSettings = wallPaper.settings) == null || wallPaperSettings.intensity >= 0) {
                        arrayList4.add(xh1Var);
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
                getMessagesStorage().deleteWallpaper(((TLRPC.WallPaper) arrayList6.get(i18)).id);
            }
        }
        this.O = org.telegram.ui.ActionBar.f6.H0();
        z0();
        A0(false);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i9 = org.telegram.ui.ActionBar.f6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(view, 0, null, null, null, null, i9));
        View view2 = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.f6.a7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(view2, 0, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.D, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.D, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.D, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.D, 48, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.D, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.D, 48, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.D, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.D, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.D, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.m6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.D, 0, new Class[]{org.telegram.ui.Cells.v3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.D, 16, new Class[]{org.telegram.ui.Cells.v3.class}, null, null, null, org.telegram.ui.ActionBar.f6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.J, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.J, 2048, null, null, null, null, org.telegram.ui.ActionBar.f6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.J, 1, null, null, null, null, i9));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onActivityResultFragment(int i9, int i10, Intent intent) {
        this.M.a(i9, i10, intent);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.wk0 wk0Var = this.D;
        if (wk0Var != null) {
            wk0Var.getViewTreeObserver().addOnPreDrawListener(new sh(this, 6));
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        int i9 = this.v;
        if (i9 == 0 || i9 == 2) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersDidLoad);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewWallpapper);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersNeedReload);
            getMessagesStorage().getWallpapers();
        } else {
            y0(this.a0, org.telegram.ui.ActionBar.f6.I.q());
            if (i9 == 1 && this.c0.isEmpty()) {
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersDidLoad);
                getMessagesStorage().getWallpapers();
            }
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        int i9 = this.v;
        if (i9 == 0 || i9 == 2) {
            bi1 bi1Var = this.F;
            if (bi1Var.s != 0) {
                ConnectionsManager.getInstance(bi1Var.A.currentAccount).cancelRequest(bi1Var.s, true);
                bi1Var.s = 0;
            }
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersDidLoad);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersNeedReload);
        } else if (i9 == 1) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersDidLoad);
        }
        this.M.getClass();
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        MessagesController.getGlobalMainSettings();
        org.telegram.ui.ActionBar.y5 y5Var = org.telegram.ui.ActionBar.f6.I.e0;
        if (y5Var != null) {
            String str = y5Var.c;
            this.O = str;
            if (str == null) {
                this.O = "";
            }
            this.P = y5Var.d;
            this.Q = y5Var.e;
            this.R = y5Var.f;
            this.S = y5Var.g;
            this.T = y5Var.h;
            this.U = y5Var.k;
            this.V = y5Var.j;
            this.W = y5Var.i;
        } else {
            this.O = org.telegram.ui.ActionBar.f6.d1() ? "t" : "d";
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 45;
            this.U = 1.0f;
            this.V = false;
            this.W = false;
        }
        z0();
        org.telegram.ui.Components.wk0 wk0Var = this.D;
        if (wk0Var != null) {
            wk0Var.getViewTreeObserver().addOnPreDrawListener(new sh(this, 6));
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void restoreSelfArgs(Bundle bundle) {
        this.M.a = bundle.getString("path");
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void saveSelfArgs(Bundle bundle) {
        String str = this.M.a;
        if (str != null) {
            bundle.putString("path", str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10, types: [org.telegram.tgnet.TLRPC$TL_wallPaper, org.telegram.tgnet.TLRPC$WallPaper] */
    /* JADX WARN: Type inference failed for: r5v11, types: [org.telegram.ui.xh1] */
    public final void z0() {
        int i9;
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
        int i14 = this.v;
        if (i14 == 0 || i14 == 2) {
            MessagesController.getGlobalMainSettings();
            xh1 xh1Var = this.y;
            ArrayList arrayList = this.a0;
            if (xh1Var != null) {
                arrayList.remove(xh1Var);
                this.y = null;
            }
            yh1 yh1Var = this.A;
            if (yh1Var != null) {
                arrayList.remove(yh1Var);
                this.A = null;
            }
            xh1 xh1Var2 = this.B;
            if (xh1Var2 == null) {
                xh1 xh1Var3 = new xh1("d", -2368069, -9722489, -2762611, -7817084);
                this.B = xh1Var3;
                xh1Var3.h = 0.34f;
            } else {
                arrayList.remove(xh1Var2);
            }
            yh1 yh1Var2 = this.C;
            if (yh1Var2 != null) {
                arrayList.remove(yh1Var2);
            }
            int size = arrayList.size();
            while (true) {
                hashMap = this.Y;
                if (i9 >= size) {
                    tL_wallPaper = 0;
                    break;
                }
                Object obj3 = arrayList.get(i9);
                if (obj3 instanceof xh1) {
                    tL_wallPaper = (xh1) obj3;
                    String str3 = tL_wallPaper.a;
                    if (str3 != null) {
                        tL_wallPaper.g = (TLRPC.TL_wallPaper) hashMap.get(str3);
                    }
                    if (!"c".equals(tL_wallPaper.a)) {
                        String str4 = tL_wallPaper.a;
                        i9 = (str4 == null || TextUtils.equals(this.O, str4)) ? 0 : i9 + 1;
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
                } else {
                    if (obj3 instanceof TLRPC.TL_wallPaper) {
                        tL_wallPaper = (TLRPC.TL_wallPaper) obj3;
                        if (tL_wallPaper.settings != null && TextUtils.equals(this.O, tL_wallPaper.slug) && this.P == org.telegram.ui.ActionBar.f6.X0(tL_wallPaper.settings.background_color) && this.Q == org.telegram.ui.ActionBar.f6.X0(tL_wallPaper.settings.second_background_color) && this.R == org.telegram.ui.ActionBar.f6.X0(tL_wallPaper.settings.third_background_color) && this.S == org.telegram.ui.ActionBar.f6.X0(tL_wallPaper.settings.fourth_background_color) && ((this.Q == 0 || this.T == AndroidUtilities.getWallpaperRotation(tL_wallPaper.settings.rotation, false)) && Math.abs(org.telegram.ui.ActionBar.f6.R0(tL_wallPaper.settings.intensity / 100.0f) - this.U) <= 0.001f)) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
            if (tL_wallPaper instanceof TLRPC.WallPaper) {
                TLRPC.TL_wallPaper tL_wallPaper4 = tL_wallPaper;
                org.telegram.ui.ActionBar.y5 y5Var = org.telegram.ui.ActionBar.f6.I.e0;
                TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper4.settings;
                if (wallPaperSettings != null && this.P == org.telegram.ui.ActionBar.f6.X0(wallPaperSettings.background_color) && this.Q == org.telegram.ui.ActionBar.f6.X0(tL_wallPaper4.settings.second_background_color) && this.R == org.telegram.ui.ActionBar.f6.X0(tL_wallPaper4.settings.third_background_color) && this.S == org.telegram.ui.ActionBar.f6.X0(tL_wallPaper4.settings.fourth_background_color) && (this.Q == 0 || this.R != 0 || this.T == AndroidUtilities.getWallpaperRotation(tL_wallPaper4.settings.rotation, false) || Math.abs(org.telegram.ui.ActionBar.f6.R0(tL_wallPaper4.settings.intensity / 100.0f) - this.U) <= 0.001f)) {
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
                j10 = (!(tL_wallPaper instanceof xh1) || (wallPaper = tL_wallPaper.l) == null) ? 0L : wallPaper.id;
                obj = tL_wallPaper;
                tL_wallPaper2 = null;
            }
            final boolean q10 = org.telegram.ui.ActionBar.f6.A0().q();
            try {
                Collections.sort(arrayList, new Comparator() { // from class: org.telegram.ui.qh1
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        ArrayList arrayList2 = WallpapersListActivity.this.X;
                        if (obj4 instanceof xh1) {
                            obj4 = ((xh1) obj4).l;
                        }
                        if (obj5 instanceof xh1) {
                            obj5 = ((xh1) obj5).l;
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
                FileLog.e(e10);
            }
            if (org.telegram.ui.ActionBar.f6.d1() && TextUtils.isEmpty(org.telegram.ui.ActionBar.f6.h0)) {
                if (this.C == null) {
                    yh1 yh1Var3 = new yh1();
                    yh1Var3.a = "t";
                    yh1Var3.b = -2;
                    yh1Var3.c = -2;
                    this.C = yh1Var3;
                }
                arrayList.add(0, this.C);
            } else {
                this.C = null;
            }
            org.telegram.ui.ActionBar.e6 e6Var = org.telegram.ui.ActionBar.f6.I;
            if (TextUtils.isEmpty(this.O) || (!"d".equals(this.O) && obj == null)) {
                if ("c".equals(this.O) || (i11 = this.P) == 0) {
                    int i16 = this.P;
                    if (i16 != 0) {
                        int i17 = this.Q;
                        if (i17 == 0 || (i10 = this.R) == 0) {
                            this.y = new xh1(i16, i17, this.O, this.T);
                        } else {
                            xh1 xh1Var4 = new xh1(this.O, i16, i17, i10, this.S);
                            this.y = xh1Var4;
                            xh1Var4.f = this.T;
                        }
                        arrayList.add(0, this.y);
                    } else if (e6Var.e0 != null && !hashMap.containsKey(this.O)) {
                        yh1 yh1Var4 = new yh1(new File(ApplicationLoader.getFilesDirFixed(), e6Var.e0.a), new File(ApplicationLoader.getFilesDirFixed(), e6Var.e0.b), this.O);
                        this.A = yh1Var4;
                        arrayList.add(this.C != null ? 1 : 0, yh1Var4);
                    }
                } else if (e6Var.e0 != null) {
                    xh1 xh1Var5 = new xh1(this.O, i11, this.Q, this.R, this.S, this.T, this.U, this.V, new File(ApplicationLoader.getFilesDirFixed(), e6Var.e0.a));
                    this.y = xh1Var5;
                    xh1Var5.g = tL_wallPaper2;
                    arrayList.add(0, xh1Var5);
                }
            } else if (obj == null && this.P != 0 && "c".equals(this.O)) {
                int i18 = this.Q;
                if (i18 == 0 || (i12 = this.R) == 0 || (i13 = this.S) == 0) {
                    this.y = new xh1(this.P, i18, this.O, this.T);
                } else {
                    xh1 xh1Var6 = new xh1(this.O, this.P, i18, i12, i13);
                    this.y = xh1Var6;
                    xh1Var6.f = this.T;
                }
                arrayList.add(0, this.y);
            }
            if ("d".equals(this.O) || arrayList.isEmpty()) {
                arrayList.add(0, this.B);
            } else {
                arrayList.add(1, this.B);
            }
            B0();
        }
    }
}
