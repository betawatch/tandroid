package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Scroller;
import android.widget.TextView;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class qc1 extends org.telegram.ui.ActionBar.o2 implements DownloadController.FileDownloadProgressListener, NotificationCenter.NotificationCenterDelegate {
    public final int A;
    public nb1 A0;
    public boolean A1;
    public final int B;
    public ImageView B0;
    public boolean B1;
    public final int C;
    public ImageView C0;
    public String C1;
    public final boolean D;
    public AnimatorSet D0;
    public int D1;
    public final long E;
    public AnimatorSet E0;
    public pc1 E1;
    public final long F;
    public org.telegram.ui.Components.a81[] F0;
    public long F1;
    public final long G;
    public org.telegram.ui.Components.a81[] G0;
    public boolean G1;
    public final long H;
    public final FrameLayout[] H0;
    public boolean H1;
    public final float I;
    public final TextView[] I0;
    public boolean I1;
    public final String J;
    public final TextView[] J0;
    public org.telegram.ui.Components.xi0 J1;
    public final int K;
    public final FrameLayout[] K0;
    public org.telegram.ui.ActionBar.w0 K1;
    public long L;
    public wa1 L0;
    public ValueAnimator L1;
    public p90 M;
    public oc1 M0;
    public bg.u1 M1;
    public final org.telegram.ui.ActionBar.n5 N;
    public f2.j0 N0;
    public mb1 N1;
    public final org.telegram.ui.ActionBar.n5 O;
    public org.telegram.ui.Cells.k4 O0;
    public final org.telegram.ui.Components.f20 O1;
    public final org.telegram.ui.ActionBar.n5 P;
    public org.telegram.ui.Cells.j0 P0;
    public boolean P1;
    public final org.telegram.ui.ActionBar.n5 Q;
    public ArrayList Q0;
    public boolean Q1;
    public org.telegram.ui.Components.gq R;
    public final HashMap R0;
    public TL_stories.TL_premium_boostsStatus R1;
    public int S;
    public TLRPC.TL_wallPaper S0;
    public float S1;
    public int T;
    public TLRPC.TL_wallPaper T0;
    public float T1;
    public final Runnable U;
    public TLRPC.TL_wallPaper U0;
    public float U1;
    public boolean V;
    public int V0;
    public float V1;
    public cg.i0 W;
    public int W0;
    public boolean W1;
    public FrameLayout X;
    public int X0;
    public int X1;
    public TextView Y;
    public int Y0;
    public ValueAnimator Y1;
    public TextView Z;
    public int Z0;
    public boolean Z1;
    public final pb1 a;
    public final org.telegram.ui.ActionBar.f6 a0;
    public int a1;
    public TextView a2;
    public final int b;
    public final boolean b0;
    public int b1;
    public WeakReference b2;
    public Scroller c;
    public final boolean c0;
    public int c1;
    public BitmapDrawable c2;
    public final boolean d;
    public final boolean d0;
    public int d1;
    public fc d2;
    public org.telegram.ui.Components.tl e;
    public ArrayList e0;
    public int e1;
    public float e2;
    public org.telegram.ui.ActionBar.w0 f;
    public m2.g f0;
    public int f1;
    public ValueAnimator f2;
    public bg.d1 g0;
    public int g1;
    public TextView h;
    public UndoView h0;
    public float h1;
    public FrameLayout i0;
    public float i1;
    public org.telegram.ui.Components.jl0 j0;
    public float j1;
    public ic1 k0;
    public float k1;
    public org.telegram.ui.Components.u10 l0;
    public hc1 l1;
    public MessageObject m0;
    public org.telegram.ui.Components.iq m1;
    public int n;
    public boolean n0;
    public AnimatorSet n1;
    public org.telegram.ui.ActionBar.l o0;
    public final PorterDuff.Mode o1;
    public org.telegram.ui.ActionBar.r0 p0;
    public int p1;
    public jb1 q0;
    public org.telegram.ui.Components.n9 q1;
    public Drawable r;
    public mc1 r0;
    public org.telegram.ui.Components.c81 r1;
    public final org.telegram.ui.ActionBar.e6 s;
    public final fc1[] s0;
    public Bitmap s1;
    public fc1 t0;
    public Bitmap t1;
    public FrameLayout u0;
    public float u1;
    public boolean v;
    public FrameLayout v0;
    public gc1 v1;
    public final int w;
    public org.telegram.ui.Components.g40 w0;
    public gc1 w1;
    public final int x;
    public AnimatorSet x0;
    public Object x1;
    public final int y;
    public u4 y0;
    public Bitmap y1;
    public nb1 z0;
    public boolean z1;

    public qc1(Object obj, Bitmap bitmap, boolean z10) {
        super(null);
        this.a = new pb1(this);
        this.d = true;
        this.n = 1;
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(this, 0, false);
        this.N = n5Var;
        org.telegram.ui.ActionBar.n5 n5Var2 = new org.telegram.ui.ActionBar.n5(this, 0, true);
        this.O = n5Var2;
        org.telegram.ui.ActionBar.n5 n5Var3 = new org.telegram.ui.ActionBar.n5(this, 1, false);
        this.P = n5Var3;
        org.telegram.ui.ActionBar.n5 n5Var4 = new org.telegram.ui.ActionBar.n5(this, 1, true);
        this.Q = n5Var4;
        this.T = -1;
        this.U = new bb1(this, 0);
        this.s0 = new fc1[2];
        this.H0 = new FrameLayout[2];
        this.I0 = new TextView[2];
        this.J0 = new TextView[2];
        this.K0 = new FrameLayout[2];
        this.R0 = new HashMap();
        this.h1 = 0.5f;
        this.j1 = 0.0f;
        this.o1 = PorterDuff.Mode.SRC_IN;
        this.u1 = 1.0f;
        this.C1 = "640_360";
        this.D1 = 1920;
        this.G1 = true;
        this.O1 = new org.telegram.ui.Components.f20(getParentActivity(), new rb1(this));
        this.P1 = false;
        this.Q1 = false;
        this.b = 2;
        this.x1 = obj;
        this.y1 = bitmap;
        this.z1 = z10;
        if (obj instanceof zh1) {
            zh1 zh1Var = (zh1) obj;
            this.A1 = zh1Var.j;
            TLRPC.TL_wallPaper tL_wallPaper = zh1Var.g;
            this.S0 = tL_wallPaper;
            if (tL_wallPaper != null) {
                float f9 = zh1Var.h;
                this.h1 = f9;
                if (f9 < 0.0f && !org.telegram.ui.ActionBar.g6.I.q()) {
                    this.h1 *= -1.0f;
                }
            }
        }
        n5Var.v = true;
        n5Var3.v = true;
        n5Var2.v = true;
        n5Var4.v = true;
    }

    public static void U(qc1 qc1Var) {
        org.telegram.ui.ActionBar.f6 f6Var = org.telegram.ui.ActionBar.g6.M;
        if (f6Var == null) {
            return;
        }
        int i10 = f6Var.V;
        org.telegram.ui.ActionBar.e6 k9 = i10 >= 0 ? (org.telegram.ui.ActionBar.e6) f6Var.W.get(i10) : f6Var.k(false);
        if (qc1Var.s != null) {
            qc1Var.W0();
            org.telegram.ui.ActionBar.g6.t1(qc1Var.a0, true, false, false, false, false);
            if (org.telegram.ui.ActionBar.g6.M != null) {
                org.telegram.ui.ActionBar.g6.O = false;
                org.telegram.ui.ActionBar.g6.P = false;
                org.telegram.ui.ActionBar.g6.M = null;
            }
            org.telegram.ui.ActionBar.g6.t(qc1Var.a0, true, qc1Var.b0);
            ((ActionBarLayout) qc1Var.parentLayout).U(false, false);
        } else {
            ((ActionBarLayout) qc1Var.parentLayout).U(false, false);
            File file = new File(qc1Var.a0.b);
            org.telegram.ui.ActionBar.f6 f6Var2 = qc1Var.a0;
            org.telegram.ui.ActionBar.g6.u(file, f6Var2.a, f6Var2.B, false);
            MessagesController.getInstance(qc1Var.a0.A).saveTheme(qc1Var.a0, null, false, false);
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            edit.putString("lastDayTheme", qc1Var.a0.m());
            edit.commit();
        }
        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) qc1Var.getParentLayout().getFragmentStack().get(Math.max(0, qc1Var.getParentLayout().getFragmentStack().size() - 2));
        qc1Var.finishFragment();
        if (qc1Var.b == 0) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didApplyNewTheme, f6Var, k9, Boolean.valueOf(qc1Var.d0));
        }
        org.telegram.ui.ActionBar.g6.F1(o2Var);
    }

    public static /* synthetic */ void V(qc1 qc1Var, TLObject tLObject) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        HashMap hashMap = qc1Var.R0;
        org.telegram.ui.ActionBar.e6 e6Var = qc1Var.s;
        if (tLObject instanceof TL_account.TL_wallPapers) {
            TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
            qc1Var.Q0.clear();
            hashMap.clear();
            int size = tL_wallPapers.wallpapers.size();
            boolean z10 = false;
            for (int i10 = 0; i10 < size; i10++) {
                if (tL_wallPapers.wallpapers.get(i10) instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) tL_wallPapers.wallpapers.get(i10);
                    if (tL_wallPaper2.pattern) {
                        TLRPC.Document document = tL_wallPaper2.document;
                        if (document != null && !hashMap.containsKey(Long.valueOf(document.id))) {
                            qc1Var.Q0.add(tL_wallPaper2);
                            hashMap.put(Long.valueOf(tL_wallPaper2.document.id), tL_wallPaper2);
                        }
                        if (e6Var != null && (str = e6Var.o) != null && str.equals(tL_wallPaper2.slug)) {
                            qc1Var.S0 = tL_wallPaper2;
                            qc1Var.b1(false);
                            qc1Var.j1();
                        } else if (e6Var == null) {
                            TLRPC.TL_wallPaper tL_wallPaper3 = qc1Var.S0;
                            if (tL_wallPaper3 != null) {
                                String str2 = tL_wallPaper3.slug;
                                if (str2 != null) {
                                    if (!str2.equals(tL_wallPaper2.slug)) {
                                    }
                                }
                            }
                        }
                        z10 = true;
                    }
                }
            }
            if (!z10 && (tL_wallPaper = qc1Var.S0) != null) {
                qc1Var.Q0.add(0, tL_wallPaper);
            }
            oc1 oc1Var = qc1Var.M0;
            if (oc1Var != null) {
                oc1Var.l();
            }
            MessagesStorage.getInstance(qc1Var.currentAccount).putWallpapers(tL_wallPapers.wallpapers, 1);
        }
        if (qc1Var.S0 != null || e6Var == null || TextUtils.isEmpty(e6Var.o)) {
            return;
        }
        TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
        TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
        tL_inputWallPaperSlug.slug = e6Var.o;
        getwallpaper.wallpaper = tL_inputWallPaperSlug;
        ConnectionsManager.getInstance(qc1Var.currentAccount).bindRequestToGuid(qc1Var.getConnectionsManager().sendRequest(getwallpaper, new hb1(qc1Var, 0)), qc1Var.classGuid);
    }

    public static /* synthetic */ void W(qc1 qc1Var) {
        org.telegram.ui.Components.tl tlVar = qc1Var.e;
        int i10 = 0;
        if (tlVar != null) {
            tlVar.B(qc1Var.getThemedColor(org.telegram.ui.ActionBar.g6.G8));
            qc1Var.e.G(qc1Var.getThemedColor(org.telegram.ui.ActionBar.g6.E8), false);
        }
        Drawable drawable = qc1Var.r;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(qc1Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6), PorterDuff.Mode.MULTIPLY));
        }
        u4 u4Var = qc1Var.y0;
        if (u4Var != null) {
            u4Var.invalidate();
        }
        if (qc1Var.l1 != null) {
            org.telegram.ui.ActionBar.b5 b5Var = qc1Var.parentLayout;
            if (b5Var == null || b5Var.getBottomSheet() == null) {
                qc1Var.setNavigationBarColor(qc1Var.getThemedColor(org.telegram.ui.ActionBar.g6.h5));
            } else {
                qc1Var.parentLayout.getBottomSheet().fixNavigationBar(qc1Var.getThemedColor(org.telegram.ui.ActionBar.g6.h5));
                if (qc1Var.b == 2 && qc1Var.F1 != 0) {
                    qc1Var.parentLayout.getBottomSheet().setOverlayNavBarColor(-16777216);
                }
            }
        }
        if (qc1Var.F0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.a81[] a81VarArr = qc1Var.F0;
                if (i11 >= a81VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.a81 a81Var = a81VarArr[i11];
                if (a81Var != null) {
                    a81Var.invalidate();
                }
                i11++;
            }
        }
        if (qc1Var.G0 != null) {
            while (true) {
                org.telegram.ui.Components.a81[] a81VarArr2 = qc1Var.G0;
                if (i10 >= a81VarArr2.length) {
                    break;
                }
                org.telegram.ui.Components.a81 a81Var2 = a81VarArr2[i10];
                if (a81Var2 != null) {
                    a81Var2.invalidate();
                }
                i10++;
            }
        }
        TextView textView = qc1Var.a2;
        if (textView != null) {
            textView.setTextColor(qc1Var.getThemedColor(org.telegram.ui.ActionBar.g6.G6));
        }
        org.telegram.ui.Components.gq gqVar = qc1Var.R;
        if (gqVar != null) {
            gqVar.invalidate();
        }
        org.telegram.ui.Components.u10 u10Var = qc1Var.l0;
        if (u10Var != null) {
            u10Var.g();
        }
    }

    public static void X(qc1 qc1Var, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (qc1Var.getParentActivity() == null) {
            return;
        }
        cg.v0 v0Var = new cg.v0(23, qc1Var.currentAccount, qc1Var.getParentActivity(), qc1Var, qc1Var.a);
        v0Var.G1(canApplyBoost);
        v0Var.F1(qc1Var.R1, true);
        v0Var.H1(qc1Var.F1);
        if (!qc1Var.U0()) {
            v0Var.M0 = new bb1(qc1Var, 1);
        }
        qc1Var.showDialog(v0Var);
    }

    public final void M0() {
        AnimatorSet animatorSet = this.x0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.x0 = animatorSet2;
        int i10 = 1;
        if (this.A1) {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.t0, (Property<fc1, Float>) View.SCALE_X, this.u1), ObjectAnimator.ofFloat(this.t0, (Property<fc1, Float>) View.SCALE_Y, this.u1));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.t0, (Property<fc1, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.t0, (Property<fc1, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.t0, (Property<fc1, Float>) View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.t0, (Property<fc1, Float>) View.TRANSLATION_Y, 0.0f));
        }
        this.x0.setInterpolator(org.telegram.ui.Components.jr.g);
        this.x0.addListener(new tb1(this, i10));
        this.x0.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x026c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03fe  */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v41 */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r11v43 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N0(boolean z10) {
        Object obj;
        boolean z11;
        Object obj2;
        boolean z12;
        File file;
        ?? r11;
        Object obj3;
        boolean z13;
        boolean z14;
        String str;
        int i10;
        TLRPC.TL_wallPaper tL_wallPaper;
        int i11;
        int i12;
        int i13;
        int i14;
        File pathToAttach;
        File file2;
        int i15;
        int i16;
        Object obj4;
        long j10;
        TLRPC.TL_wallPaper tL_wallPaper2;
        boolean z15;
        float f9;
        TLRPC.UserFull userFull;
        int i17 = 1;
        if (this.F1 < 0) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.R1;
            if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < R0()) {
                getMessagesController().getBoostsController().userCanBoostChannel(this.F1, this.R1, new gb1(this, i17));
                return;
            } else if (this.R1 == null) {
                return;
            }
        }
        if (!getUserConfig().isPremium() && z10) {
            showDialog(new cg.p1((org.telegram.ui.ActionBar.o2) this, 22, true));
            return;
        }
        org.telegram.ui.ActionBar.f6 f6Var = org.telegram.ui.ActionBar.g6.I;
        String j11 = f6Var.j(null, this.B1);
        int i18 = 0;
        String j12 = this.B1 ? f6Var.j(null, false) : j11;
        File file3 = new File(ApplicationLoader.getFilesDirFixed(), j11);
        Object obj5 = this.x1;
        if (obj5 instanceof TLRPC.TL_wallPaper) {
            if (this.t1 != null) {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    try {
                        this.t1.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                        fileOutputStream.close();
                    } catch (Exception e10) {
                        e = e10;
                        FileLog.e(e);
                        z11 = false;
                        if (!z11) {
                        }
                        obj = null;
                        z12 = false;
                        r11 = obj;
                        if (this.B1) {
                        }
                        obj3 = this.x1;
                        int i19 = 45;
                        if (obj3 instanceof TLRPC.TL_wallPaper) {
                        }
                        i11 = 45;
                        i12 = 0;
                        i13 = 0;
                        i14 = 0;
                        org.telegram.ui.ActionBar.z5 z5Var = new org.telegram.ui.ActionBar.z5();
                        z5Var.a = j12;
                        z5Var.b = j11;
                        z5Var.c = str;
                        z5Var.i = this.B1;
                        z5Var.j = this.A1;
                        z5Var.d = i12;
                        z5Var.e = i14;
                        z5Var.f = i13;
                        z5Var.g = i10;
                        z5Var.h = i11;
                        if (this.I1) {
                        }
                        z5Var.k = this.h1;
                        obj4 = this.x1;
                        if (obj4 instanceof zh1) {
                        }
                        j10 = this.F1;
                        z5Var.n = j10;
                        if (j10 != 0) {
                        }
                        z5Var.o = z10;
                        MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, z5Var, str == null && this.F1 == 0, 0L);
                        if (z13) {
                        }
                        tL_wallPaper2 = tL_wallPaper;
                        z15 = true;
                        if (z15) {
                        }
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            } else {
                ImageReceiver imageReceiver = this.t0.getImageReceiver();
                if (imageReceiver.hasNotThumb() || imageReceiver.hasStaticThumb()) {
                    Bitmap bitmap = imageReceiver.getBitmap();
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file3);
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream2);
                        fileOutputStream2.close();
                    } catch (Exception e12) {
                        FileLog.e(e12);
                    }
                }
                z11 = false;
                if (!z11) {
                    try {
                        z11 = AndroidUtilities.copyFile(FileLoader.getInstance(this.currentAccount).getPathToAttach(((TLRPC.TL_wallPaper) this.x1).document, true), file3);
                    } catch (Exception e13) {
                        FileLog.e(e13);
                        z11 = false;
                    }
                }
                obj = null;
            }
            z11 = true;
            if (!z11) {
            }
            obj = null;
        } else {
            boolean z16 = obj5 instanceof zh1;
            if (z16) {
                if (this.S0 != null) {
                    try {
                        Bitmap bitmap2 = this.t0.getImageReceiver().getBitmap();
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap2.getWidth(), bitmap2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        if (this.Y0 == 0) {
                            if (this.X0 != 0) {
                                GradientDrawable gradientDrawable = new GradientDrawable(org.telegram.ui.Components.s9.d(this.d1), new int[]{this.V0, this.X0});
                                gradientDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                                gradientDrawable.draw(canvas);
                            } else {
                                canvas.drawColor(this.V0);
                            }
                        }
                        Paint paint = new Paint(2);
                        paint.setColorFilter(new PorterDuffColorFilter(this.f1, this.o1));
                        paint.setAlpha((int) (Math.abs(this.h1) * 255.0f));
                        canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint);
                        FileOutputStream fileOutputStream3 = new FileOutputStream(file3);
                        if (this.Y0 != 0) {
                            createBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream3);
                        } else {
                            createBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream3);
                        }
                        fileOutputStream3.close();
                        z11 = true;
                    } catch (Throwable th2) {
                        FileLog.e(th2);
                        z11 = false;
                    }
                    z12 = false;
                    r11 = 0;
                    if (this.B1) {
                        try {
                            FileOutputStream fileOutputStream4 = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), j12));
                            this.s1.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream4);
                            fileOutputStream4.close();
                            z11 = true;
                        } catch (Throwable th3) {
                            FileLog.e(th3);
                            z11 = false;
                        }
                    }
                    obj3 = this.x1;
                    int i192 = 45;
                    if (obj3 instanceof TLRPC.TL_wallPaper) {
                        if (obj3 instanceof zh1) {
                            if ("d".equals(((zh1) obj3).a)) {
                                str = "d";
                                i15 = 0;
                                i16 = 0;
                                i14 = 0;
                            } else {
                                TLRPC.TL_wallPaper tL_wallPaper3 = this.S0;
                                String str2 = tL_wallPaper3 != null ? tL_wallPaper3.slug : "c";
                                int i20 = this.V0;
                                i14 = this.X0;
                                i15 = this.Y0;
                                i16 = this.Z0;
                                i192 = this.d1;
                                i18 = i20;
                                str = str2;
                            }
                            int i21 = i192;
                            z13 = z11;
                            i10 = i16;
                            i13 = i15;
                            i12 = i18;
                            i11 = i21;
                            z14 = z12;
                            tL_wallPaper = null;
                        } else {
                            if (obj3 instanceof ai1) {
                                ai1 ai1Var = (ai1) obj3;
                                str = ai1Var.a;
                                pathToAttach = ai1Var.d;
                            } else if (obj3 instanceof MediaController.SearchImage) {
                                MediaController.SearchImage searchImage = (MediaController.SearchImage) obj3;
                                TLRPC.Photo photo = searchImage.photo;
                                pathToAttach = photo != null ? FileLoader.getInstance(this.currentAccount).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, this.D1, true), true) : ImageLoader.getHttpFilePath(searchImage.imageUrl, "jpg");
                                str = "";
                            } else {
                                z13 = z11;
                                z14 = z12;
                                str = "d";
                                i10 = 0;
                                tL_wallPaper = null;
                                i11 = 45;
                                i12 = 0;
                                i13 = 0;
                                i14 = 0;
                            }
                            z13 = z11;
                            z14 = z12;
                            file2 = pathToAttach;
                            i10 = 0;
                            tL_wallPaper = null;
                        }
                        file2 = null;
                        org.telegram.ui.ActionBar.z5 z5Var2 = new org.telegram.ui.ActionBar.z5();
                        z5Var2.a = j12;
                        z5Var2.b = j11;
                        z5Var2.c = str;
                        z5Var2.i = this.B1;
                        z5Var2.j = this.A1;
                        z5Var2.d = i12;
                        z5Var2.e = i14;
                        z5Var2.f = i13;
                        z5Var2.g = i10;
                        z5Var2.h = i11;
                        if (this.I1) {
                            float f10 = this.j1;
                            if (f10 >= 0.0f) {
                                z5Var2.k = f10;
                                obj4 = this.x1;
                                if (obj4 instanceof zh1) {
                                    zh1 zh1Var = (zh1) obj4;
                                    String str3 = ("c".equals(str) || "t".equals(str) || "d".equals(str)) ? null : str;
                                    float f11 = zh1Var.h;
                                    if (f11 < 0.0f && !org.telegram.ui.ActionBar.g6.I.q()) {
                                        f11 *= -1.0f;
                                    }
                                    if (zh1Var.l != null && zh1Var.b == i12 && zh1Var.c == i14 && zh1Var.d == i13 && zh1Var.e == i10 && TextUtils.equals(zh1Var.a, str3) && zh1Var.f == i11 && (this.S0 == null || Math.abs(f11 - this.h1) < 0.001f)) {
                                        TLRPC.WallPaper wallPaper = zh1Var.l;
                                        z5Var2.l = wallPaper.id;
                                        z5Var2.m = wallPaper.access_hash;
                                    }
                                }
                                j10 = this.F1;
                                z5Var2.n = j10;
                                if (j10 != 0 && (userFull = getMessagesController().getUserFull(this.F1)) != null) {
                                    z5Var2.t = userFull.wallpaper;
                                }
                                z5Var2.o = z10;
                                MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, z5Var2, str == null && this.F1 == 0, 0L);
                                if (z13) {
                                    if (this.F1 != 0) {
                                        if (file2 == null || getMessagesController().uploadingWallpaperInfo != z5Var2) {
                                            ChatThemeController.getInstance(this.currentAccount).setWallpaperToPeer(this.F1, null, z5Var2, this.m0, new ag.o0(25));
                                        } else {
                                            tL_wallPaper = new TLRPC.TL_wallPaper();
                                            TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
                                            tL_wallPaper.settings = tL_wallPaperSettings;
                                            tL_wallPaperSettings.intensity = (int) (z5Var2.k * 100.0f);
                                            tL_wallPaperSettings.blur = z5Var2.i;
                                            tL_wallPaperSettings.motion = z5Var2.j;
                                            tL_wallPaper.uploadingImage = file2.getAbsolutePath();
                                            Bitmap createBitmap2 = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                                            Canvas canvas2 = new Canvas(createBitmap2);
                                            float max = Math.max(50.0f / this.t0.getMeasuredWidth(), 50.0f / this.t0.getMeasuredHeight());
                                            canvas2.scale(max, max);
                                            if (this.t0.getMeasuredHeight() > this.t0.getMeasuredWidth()) {
                                                f9 = 0.0f;
                                                canvas2.translate(0.0f, (-(this.t0.getMeasuredHeight() - this.t0.getMeasuredWidth())) / 2.0f);
                                            } else {
                                                f9 = 0.0f;
                                                canvas2.translate((-(this.t0.getMeasuredWidth() - this.t0.getMeasuredHeight())) / 2.0f, 0.0f);
                                            }
                                            float f12 = this.j1;
                                            this.j1 = f9;
                                            this.t0.draw(canvas2);
                                            this.j1 = f12;
                                            Utilities.blurBitmap(createBitmap2, 3);
                                            tL_wallPaper.stripedThumb = createBitmap2;
                                            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                                            tL_messageService.random_id = SendMessagesHelper.getInstance(this.currentAccount).getNextRandomId();
                                            tL_messageService.dialog_id = this.F1;
                                            tL_messageService.unread = true;
                                            tL_messageService.out = true;
                                            int newMessageId = getUserConfig().getNewMessageId();
                                            tL_messageService.id = newMessageId;
                                            tL_messageService.local_id = newMessageId;
                                            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.F1));
                                            if (ChatObject.isChannel(chat)) {
                                                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                                tL_messageService.from_id = tL_peerChannel;
                                                tL_peerChannel.channel_id = chat.id;
                                                TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                                                tL_messageService.peer_id = tL_peerChannel2;
                                                tL_peerChannel2.channel_id = chat.id;
                                            } else {
                                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                                tL_messageService.from_id = tL_peerUser;
                                                tL_peerUser.user_id = getUserConfig().getClientUserId();
                                                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                                                tL_messageService.peer_id = tL_peerUser2;
                                                tL_peerUser2.user_id = this.F1;
                                            }
                                            tL_messageService.flags |= 256;
                                            tL_messageService.date = getConnectionsManager().getCurrentTime();
                                            TLRPC.TL_messageActionSetChatWallPaper tL_messageActionSetChatWallPaper = new TLRPC.TL_messageActionSetChatWallPaper();
                                            tL_messageService.action = tL_messageActionSetChatWallPaper;
                                            tL_messageActionSetChatWallPaper.wallpaper = tL_wallPaper;
                                            tL_messageActionSetChatWallPaper.for_both = z10;
                                            ArrayList<MessageObject> arrayList = new ArrayList<>();
                                            arrayList.add(new MessageObject(this.currentAccount, tL_messageService, false, false));
                                            new ArrayList().add(tL_messageService);
                                            MessagesController.getInstance(this.currentAccount).updateInterfaceWithMessages(this.F1, arrayList, 0);
                                            if (this.F1 >= 0) {
                                                TLRPC.UserFull userFull2 = getMessagesController().getUserFull(this.F1);
                                                if (userFull2 != null) {
                                                    userFull2.wallpaper = tL_wallPaper;
                                                    NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(this.F1), userFull2);
                                                }
                                            } else {
                                                TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-this.F1);
                                                if (chatFull != null) {
                                                    chatFull.wallpaper = tL_wallPaper;
                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                                                    int i22 = NotificationCenter.chatInfoDidLoad;
                                                    Boolean bool = Boolean.FALSE;
                                                    notificationCenter.lambda$postNotificationNameOnUIThread$1(i22, chatFull, 0, bool, bool);
                                                }
                                            }
                                        }
                                        this.Z1 = true;
                                        pc1 pc1Var = this.E1;
                                        if (pc1Var != null) {
                                            pc1Var.a(tL_wallPaper);
                                        }
                                        finishFragment();
                                        tL_wallPaper2 = tL_wallPaper;
                                        z15 = false;
                                        if (z15) {
                                            pc1 pc1Var2 = this.E1;
                                            if (pc1Var2 != null) {
                                                pc1Var2.a(tL_wallPaper2);
                                            }
                                            finishFragment();
                                            return;
                                        }
                                        return;
                                    }
                                    org.telegram.ui.ActionBar.g6.c0 = getThemedColor(org.telegram.ui.ActionBar.g6.lc);
                                    org.telegram.ui.ActionBar.g6.I.v("t".equals(z5Var2.c) ? null : z5Var2);
                                    org.telegram.ui.ActionBar.g6.o1(true);
                                    if (!z14) {
                                        ImageLoader.getInstance().removeImage(ImageLoader.getHttpFileName(file3.getAbsolutePath()) + "@100_100");
                                    }
                                }
                                tL_wallPaper2 = tL_wallPaper;
                                z15 = true;
                                if (z15) {
                                }
                            }
                        }
                        z5Var2.k = this.h1;
                        obj4 = this.x1;
                        if (obj4 instanceof zh1) {
                        }
                        j10 = this.F1;
                        z5Var2.n = j10;
                        if (j10 != 0) {
                            z5Var2.t = userFull.wallpaper;
                        }
                        z5Var2.o = z10;
                        MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, z5Var2, str == null && this.F1 == 0, 0L);
                        if (z13) {
                        }
                        tL_wallPaper2 = tL_wallPaper;
                        z15 = true;
                        if (z15) {
                        }
                    } else {
                        tL_wallPaper = (TLRPC.TL_wallPaper) obj3;
                        str = tL_wallPaper.slug;
                        z13 = z11;
                        z14 = z12;
                        file2 = r11;
                        i10 = 0;
                    }
                    i11 = 45;
                    i12 = 0;
                    i13 = 0;
                    i14 = 0;
                    org.telegram.ui.ActionBar.z5 z5Var22 = new org.telegram.ui.ActionBar.z5();
                    z5Var22.a = j12;
                    z5Var22.b = j11;
                    z5Var22.c = str;
                    z5Var22.i = this.B1;
                    z5Var22.j = this.A1;
                    z5Var22.d = i12;
                    z5Var22.e = i14;
                    z5Var22.f = i13;
                    z5Var22.g = i10;
                    z5Var22.h = i11;
                    if (this.I1) {
                    }
                    z5Var22.k = this.h1;
                    obj4 = this.x1;
                    if (obj4 instanceof zh1) {
                    }
                    j10 = this.F1;
                    z5Var22.n = j10;
                    if (j10 != 0) {
                    }
                    z5Var22.o = z10;
                    MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, z5Var22, str == null && this.F1 == 0, 0L);
                    if (z13) {
                    }
                    tL_wallPaper2 = tL_wallPaper;
                    z15 = true;
                    if (z15) {
                    }
                } else {
                    obj2 = null;
                    z11 = true;
                    obj = obj2;
                }
            } else if (obj5 instanceof ai1) {
                ai1 ai1Var2 = (ai1) obj5;
                if (ai1Var2.b != 0 || "t".equals(ai1Var2.a)) {
                    obj2 = null;
                    z11 = true;
                    obj = obj2;
                } else {
                    try {
                    } catch (Exception e14) {
                        e = e14;
                        z16 = false;
                    }
                    try {
                        if (!this.W1 || this.T1 == this.U1) {
                            z16 = false;
                            z16 = false;
                            File file4 = ai1Var2.e;
                            file = file4 != null ? file4 : ai1Var2.d;
                        } else {
                            Bitmap createBitmap3 = Bitmap.createBitmap((int) this.V1, this.y1.getHeight(), Bitmap.Config.ARGB_8888);
                            Canvas canvas3 = new Canvas(createBitmap3);
                            canvas3.translate(-((this.T1 / this.S1) * (this.y1.getWidth() - createBitmap3.getWidth())), 0.0f);
                            z16 = false;
                            canvas3.drawBitmap(this.y1, 0.0f, 0.0f, (Paint) null);
                            ai1Var2.d = new File(FileLoader.getDirectory(4), Utilities.random.nextInt() + ".jpg");
                            FileOutputStream fileOutputStream5 = new FileOutputStream(ai1Var2.d);
                            createBitmap3.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream5);
                            fileOutputStream5.close();
                            createBitmap3.recycle();
                            file = ai1Var2.d;
                        }
                        z12 = file.equals(file3);
                        if (z12) {
                            z11 = true;
                            r11 = z16;
                        } else {
                            try {
                                z11 = AndroidUtilities.copyFile(file, file3);
                                r11 = z16;
                            } catch (Exception e15) {
                                e = e15;
                                FileLog.e(e);
                                z11 = false;
                                r11 = z16;
                                if (this.B1) {
                                }
                                obj3 = this.x1;
                                int i1922 = 45;
                                if (obj3 instanceof TLRPC.TL_wallPaper) {
                                }
                                i11 = 45;
                                i12 = 0;
                                i13 = 0;
                                i14 = 0;
                                org.telegram.ui.ActionBar.z5 z5Var222 = new org.telegram.ui.ActionBar.z5();
                                z5Var222.a = j12;
                                z5Var222.b = j11;
                                z5Var222.c = str;
                                z5Var222.i = this.B1;
                                z5Var222.j = this.A1;
                                z5Var222.d = i12;
                                z5Var222.e = i14;
                                z5Var222.f = i13;
                                z5Var222.g = i10;
                                z5Var222.h = i11;
                                if (this.I1) {
                                }
                                z5Var222.k = this.h1;
                                obj4 = this.x1;
                                if (obj4 instanceof zh1) {
                                }
                                j10 = this.F1;
                                z5Var222.n = j10;
                                if (j10 != 0) {
                                }
                                z5Var222.o = z10;
                                MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, z5Var222, str == null && this.F1 == 0, 0L);
                                if (z13) {
                                }
                                tL_wallPaper2 = tL_wallPaper;
                                z15 = true;
                                if (z15) {
                                }
                            }
                        }
                    } catch (Exception e16) {
                        e = e16;
                        z12 = false;
                        FileLog.e(e);
                        z11 = false;
                        r11 = z16;
                        if (this.B1) {
                        }
                        obj3 = this.x1;
                        int i19222 = 45;
                        if (obj3 instanceof TLRPC.TL_wallPaper) {
                        }
                        i11 = 45;
                        i12 = 0;
                        i13 = 0;
                        i14 = 0;
                        org.telegram.ui.ActionBar.z5 z5Var2222 = new org.telegram.ui.ActionBar.z5();
                        z5Var2222.a = j12;
                        z5Var2222.b = j11;
                        z5Var2222.c = str;
                        z5Var2222.i = this.B1;
                        z5Var2222.j = this.A1;
                        z5Var2222.d = i12;
                        z5Var2222.e = i14;
                        z5Var2222.f = i13;
                        z5Var2222.g = i10;
                        z5Var2222.h = i11;
                        if (this.I1) {
                        }
                        z5Var2222.k = this.h1;
                        obj4 = this.x1;
                        if (obj4 instanceof zh1) {
                        }
                        j10 = this.F1;
                        z5Var2222.n = j10;
                        if (j10 != 0) {
                        }
                        z5Var2222.o = z10;
                        MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, z5Var2222, str == null && this.F1 == 0, 0L);
                        if (z13) {
                        }
                        tL_wallPaper2 = tL_wallPaper;
                        z15 = true;
                        if (z15) {
                        }
                    }
                    if (this.B1) {
                    }
                    obj3 = this.x1;
                    int i192222 = 45;
                    if (obj3 instanceof TLRPC.TL_wallPaper) {
                    }
                    i11 = 45;
                    i12 = 0;
                    i13 = 0;
                    i14 = 0;
                    org.telegram.ui.ActionBar.z5 z5Var22222 = new org.telegram.ui.ActionBar.z5();
                    z5Var22222.a = j12;
                    z5Var22222.b = j11;
                    z5Var22222.c = str;
                    z5Var22222.i = this.B1;
                    z5Var22222.j = this.A1;
                    z5Var22222.d = i12;
                    z5Var22222.e = i14;
                    z5Var22222.f = i13;
                    z5Var22222.g = i10;
                    z5Var22222.h = i11;
                    if (this.I1) {
                    }
                    z5Var22222.k = this.h1;
                    obj4 = this.x1;
                    if (obj4 instanceof zh1) {
                    }
                    j10 = this.F1;
                    z5Var22222.n = j10;
                    if (j10 != 0) {
                    }
                    z5Var22222.o = z10;
                    MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, z5Var22222, str == null && this.F1 == 0, 0L);
                    if (z13) {
                    }
                    tL_wallPaper2 = tL_wallPaper;
                    z15 = true;
                    if (z15) {
                    }
                }
            } else {
                obj = null;
                obj = null;
                if (obj5 instanceof MediaController.SearchImage) {
                    MediaController.SearchImage searchImage2 = (MediaController.SearchImage) obj5;
                    TLRPC.Photo photo2 = searchImage2.photo;
                    try {
                        z11 = AndroidUtilities.copyFile(photo2 != null ? FileLoader.getInstance(this.currentAccount).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, this.D1, true), true) : ImageLoader.getHttpFilePath(searchImage2.imageUrl, "jpg"), file3);
                    } catch (Exception e17) {
                        FileLog.e(e17);
                    }
                }
                z11 = false;
            }
        }
        z12 = false;
        r11 = obj;
        if (this.B1) {
        }
        obj3 = this.x1;
        int i1922222 = 45;
        if (obj3 instanceof TLRPC.TL_wallPaper) {
        }
        i11 = 45;
        i12 = 0;
        i13 = 0;
        i14 = 0;
        org.telegram.ui.ActionBar.z5 z5Var222222 = new org.telegram.ui.ActionBar.z5();
        z5Var222222.a = j12;
        z5Var222222.b = j11;
        z5Var222222.c = str;
        z5Var222222.i = this.B1;
        z5Var222222.j = this.A1;
        z5Var222222.d = i12;
        z5Var222222.e = i14;
        z5Var222222.f = i13;
        z5Var222222.g = i10;
        z5Var222222.h = i11;
        if (this.I1) {
        }
        z5Var222222.k = this.h1;
        obj4 = this.x1;
        if (obj4 instanceof zh1) {
        }
        j10 = this.F1;
        z5Var222222.n = j10;
        if (j10 != 0) {
        }
        z5Var222222.o = z10;
        MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, z5Var222222, str == null && this.F1 == 0, 0L);
        if (z13) {
        }
        tL_wallPaper2 = tL_wallPaper;
        z15 = true;
        if (z15) {
        }
    }

    public final void O0(boolean z10) {
        int i10 = this.b;
        if (i10 == 2) {
            if (z10) {
                return;
            }
            finishFragment();
            return;
        }
        org.telegram.ui.ActionBar.g6.o();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        org.telegram.ui.ActionBar.e6 e6Var = this.s;
        if (i10 == 1) {
            if (this.c0) {
                e6Var.c = this.w;
                e6Var.d = this.x;
                e6Var.e = this.y;
                e6Var.f = this.A;
                e6Var.g = this.B;
                e6Var.h = this.C;
                e6Var.i = this.D;
                e6Var.j = this.E;
                e6Var.k = this.F;
                e6Var.l = this.G;
                e6Var.m = this.H;
                e6Var.n = this.K;
                e6Var.o = this.J;
                e6Var.p = this.I;
            }
            org.telegram.ui.ActionBar.g6.t1(this.a0, false, true, false, false, false);
        } else {
            if (e6Var != null) {
                org.telegram.ui.ActionBar.g6.t1(this.a0, false, this.d0, false, false, false);
            }
            ((ActionBarLayout) this.parentLayout).U(false, false);
            if (this.d0) {
                org.telegram.ui.ActionBar.f6 f6Var = this.a0;
                if (f6Var.b != null && org.telegram.ui.ActionBar.g6.H.get(f6Var.m()) == null) {
                    new File(f6Var.b).delete();
                }
            }
        }
        if (z10) {
            return;
        }
        finishFragment();
    }

    public final BitmapDrawable P0(Drawable drawable) {
        WeakReference weakReference = this.b2;
        if (weakReference != null && weakReference.get() == drawable) {
            return this.c2;
        }
        WeakReference weakReference2 = this.b2;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.b2 = null;
        if (drawable == null || drawable.getIntrinsicWidth() == 0 || drawable.getIntrinsicHeight() == 0) {
            this.c2 = null;
            return null;
        }
        this.b2 = new WeakReference(drawable);
        int intrinsicWidth = (int) ((drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) * 24.0f);
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, 24, Bitmap.Config.ARGB_8888);
        drawable.setBounds(0, 0, intrinsicWidth, 24);
        ColorFilter colorFilter = drawable.getColorFilter();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(1.3f);
        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.94f);
        drawable.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        drawable.draw(new Canvas(createBitmap));
        drawable.setColorFilter(colorFilter);
        Utilities.blurBitmap(createBitmap, 3);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getParentActivity().getResources(), createBitmap);
        this.c2 = bitmapDrawable;
        bitmapDrawable.setFilterBitmap(true);
        return this.c2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
    
        if (r0.q == r7.A1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008a, code lost:
    
        if (r0.p == r7.h1) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Q0(boolean z10) {
        if (this.b == 1) {
            org.telegram.ui.ActionBar.e6 e6Var = this.s;
            if (e6Var.c == this.w && e6Var.d == this.x && e6Var.e == this.y && e6Var.f == this.A && e6Var.g == this.B && e6Var.h == this.C && e6Var.i == this.D && e6Var.j == this.E && e6Var.k == this.F && e6Var.l == this.G && e6Var.m == this.H && Math.abs(e6Var.p - this.I) <= 0.001f && e6Var.n == this.K) {
                String str = e6Var.o;
                TLRPC.TL_wallPaper tL_wallPaper = this.S0;
                if (str.equals(tL_wallPaper != null ? tL_wallPaper.slug : "")) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = this.S0;
                    if (tL_wallPaper2 != null) {
                    }
                    if (tL_wallPaper2 != null) {
                    }
                }
            }
            if (!z10) {
                return false;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.N = LocaleController.getString(R.string.SaveChangesAlertTitle);
            alertDialog$Builder.a.P = LocaleController.getString(R.string.SaveChangesAlertText);
            alertDialog$Builder.k(LocaleController.getString(R.string.Save), new db1(this, 3));
            alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new db1(this, 4));
            showDialog(alertDialog$Builder.a);
            return false;
        }
        return true;
    }

    public final int R0() {
        return ChatObject.isChannelAndNotMegaGroup(-this.F1, this.currentAccount) ? getMessagesController().channelCustomWallpaperLevelMin : getMessagesController().groupCustomWallpaperLevelMin;
    }

    public final ArrayList S0() {
        rx0 rx0Var = new rx0(7, this);
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.i0;
        int i10 = org.telegram.ui.ActionBar.g6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(frameLayout, 1, null, null, null, rx0Var, i10));
        m2.g gVar = this.f0;
        int i11 = org.telegram.ui.ActionBar.g6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(gVar, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, i11));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.g6.t8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(lVar, 256, null, null, null, null, i12));
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i13 = org.telegram.ui.ActionBar.g6.A8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(lVar2, 128, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, TLObject.FLAG_27, null, null, null, null, org.telegram.ui.ActionBar.g6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.g6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.o0, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.o0, 128, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.o0, 1024, null, null, null, null, org.telegram.ui.ActionBar.g6.B8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.o0, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.o0, TLObject.FLAG_31, null, null, null, rx0Var, org.telegram.ui.ActionBar.g6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.o0, TLObject.FLAG_30, null, null, null, rx0Var, org.telegram.ui.ActionBar.g6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.j0, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.q0, 32768, null, null, null, null, i11));
        if (!this.d) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.X, 1, null, null, null, null, i10));
            TextView textView = this.Z;
            int i14 = org.telegram.ui.ActionBar.g6.Ae;
            arrayList.add(new org.telegram.ui.ActionBar.i6(textView, 4, null, null, null, null, i14));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.Y, 4, null, null, null, null, i14));
        }
        org.telegram.ui.Components.gq gqVar = this.R;
        if (gqVar != null) {
            org.telegram.ui.ActionBar.w0 w0Var = gqVar.E;
            EditTextBoldCursor[] editTextBoldCursorArr = gqVar.A;
            for (int i15 = 0; i15 < editTextBoldCursorArr.length; i15++) {
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i15];
                int i16 = org.telegram.ui.ActionBar.g6.G6;
                arrayList.add(new org.telegram.ui.ActionBar.i6(editTextBoldCursor, 4, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.i6(editTextBoldCursorArr[i15], 16777216, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.i6(editTextBoldCursorArr[i15], TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.g6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(editTextBoldCursorArr[i15], 8390656, null, null, null, null, org.telegram.ui.ActionBar.g6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(editTextBoldCursorArr[i15], 32, null, null, null, null, org.telegram.ui.ActionBar.g6.k6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(editTextBoldCursorArr[i15], 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.l6));
            }
            org.telegram.ui.ActionBar.m0 m0Var = gqVar.B;
            int i17 = org.telegram.ui.ActionBar.g6.G6;
            arrayList.add(new org.telegram.ui.ActionBar.i6(m0Var, 8, null, null, null, null, i17));
            org.telegram.ui.ActionBar.m0 m0Var2 = gqVar.B;
            int i18 = org.telegram.ui.ActionBar.g6.I5;
            arrayList.add(new org.telegram.ui.ActionBar.i6(m0Var2, 32, null, null, null, null, i18));
            if (w0Var != null) {
                org.telegram.ui.Components.x6 x6Var = new org.telegram.ui.Components.x6(gqVar, 3);
                arrayList.add(new org.telegram.ui.ActionBar.i6(w0Var, 0, null, null, null, x6Var, i17));
                arrayList.add(new org.telegram.ui.ActionBar.i6(w0Var, 0, null, null, null, x6Var, i18));
                arrayList.add(new org.telegram.ui.ActionBar.i6(w0Var, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.g6.E8));
                arrayList.add(new org.telegram.ui.ActionBar.i6(w0Var, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.g6.F8));
                arrayList.add(new org.telegram.ui.ActionBar.i6(w0Var, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.g6.G8));
            }
        }
        FrameLayout[] frameLayoutArr = this.H0;
        if (frameLayoutArr != null) {
            for (int i19 = 0; i19 < frameLayoutArr.length; i19++) {
                arrayList.add(new org.telegram.ui.ActionBar.i6(frameLayoutArr[i19], 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.i3}, null, org.telegram.ui.ActionBar.g6.Td));
                arrayList.add(new org.telegram.ui.ActionBar.i6(frameLayoutArr[i19], 0, null, org.telegram.ui.ActionBar.g6.j2, null, null, org.telegram.ui.ActionBar.g6.Sd));
            }
            int i20 = 0;
            while (true) {
                FrameLayout[] frameLayoutArr2 = this.K0;
                if (i20 >= frameLayoutArr2.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.i6(frameLayoutArr2[i20], 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.i3}, null, org.telegram.ui.ActionBar.g6.Td));
                arrayList.add(new org.telegram.ui.ActionBar.i6(frameLayoutArr2[i20], 0, null, org.telegram.ui.ActionBar.g6.j2, null, null, org.telegram.ui.ActionBar.g6.Sd));
                i20++;
            }
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.y0, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.i3}, null, org.telegram.ui.ActionBar.g6.Td));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.y0, 0, null, org.telegram.ui.ActionBar.g6.j2, null, null, org.telegram.ui.ActionBar.g6.Sd));
            int i21 = 0;
            while (true) {
                TextView[] textViewArr = this.J0;
                if (i21 >= textViewArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.i6(textViewArr[i21], 4, null, null, null, null, org.telegram.ui.ActionBar.g6.Ae));
                i21++;
            }
            int i22 = 0;
            while (true) {
                TextView[] textViewArr2 = this.I0;
                if (i22 >= textViewArr2.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.i6(textViewArr2[i22], 4, null, null, null, null, org.telegram.ui.ActionBar.g6.Ae));
                i22++;
            }
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.P0, 0, new Class[]{org.telegram.ui.Components.ao0.class}, new String[]{"innerPaint1"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Ti));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.P0, 0, new Class[]{org.telegram.ui.Components.ao0.class}, new String[]{"outerPaint1"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Vi));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.O0, 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.m3, org.telegram.ui.ActionBar.g6.q3}, null, org.telegram.ui.ActionBar.g6.ra));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.n3, org.telegram.ui.ActionBar.g6.r3}, null, org.telegram.ui.ActionBar.g6.dc));
            Drawable[] drawableArr = org.telegram.ui.ActionBar.g6.m3.y;
            int i23 = org.telegram.ui.ActionBar.g6.ta;
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, drawableArr, null, i23));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, org.telegram.ui.ActionBar.g6.q3.y, null, i23));
            org.telegram.ui.ActionBar.n5 n5Var = this.N;
            org.telegram.ui.ActionBar.n5 n5Var2 = this.P;
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{n5Var, n5Var2}, null, org.telegram.ui.ActionBar.g6.Aa));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{n5Var, n5Var2}, null, org.telegram.ui.ActionBar.g6.Da));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{n5Var, n5Var2}, null, org.telegram.ui.ActionBar.g6.Ea));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{n5Var, n5Var2}, null, org.telegram.ui.ActionBar.g6.Fa));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.p3, org.telegram.ui.ActionBar.g6.t3}, null, org.telegram.ui.ActionBar.g6.Ba));
            Drawable[] drawableArr2 = org.telegram.ui.ActionBar.g6.o3.y;
            int i24 = org.telegram.ui.ActionBar.g6.Ca;
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, drawableArr2, null, i24));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, org.telegram.ui.ActionBar.g6.s3.y, null, i24));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.ec));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.fc));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.y3}, null, org.telegram.ui.ActionBar.g6.Ja));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.z3}, null, org.telegram.ui.ActionBar.g6.Ka));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.A3, org.telegram.ui.ActionBar.g6.C3}, null, org.telegram.ui.ActionBar.g6.La));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.B3, org.telegram.ui.ActionBar.g6.D3}, null, org.telegram.ui.ActionBar.g6.Ma));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.F3, org.telegram.ui.ActionBar.g6.G3}, null, org.telegram.ui.ActionBar.g6.sc));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Uc));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.ab));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Wc));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.cb));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Yc));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.db));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.ad));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.fb));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.nd));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.sb));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.od));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.q0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.nb));
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, rx0Var, org.telegram.ui.ActionBar.g6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, rx0Var, org.telegram.ui.ActionBar.g6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, rx0Var, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, rx0Var, org.telegram.ui.ActionBar.g6.i5));
        for (int i25 = 0; i25 < arrayList.size(); i25++) {
            ((org.telegram.ui.ActionBar.i6) arrayList.get(i25)).o = this.a;
        }
        return arrayList;
    }

    public final boolean T0(int i10) {
        int B0;
        long j10;
        if (this.c0) {
            return false;
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.s;
        if (i10 == 1 || i10 == 2) {
            long j11 = this.E;
            if (j11 == 0) {
                int B02 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Nd);
                int i11 = (int) e6Var.j;
                if (i11 == 0) {
                    i11 = B02;
                }
                if (i11 != B02) {
                    return true;
                }
            } else if (j11 != e6Var.j) {
                return true;
            }
            long j12 = this.H;
            long j13 = this.G;
            long j14 = this.F;
            if (j14 == 0 && j13 == 0 && j12 == 0) {
                for (int i12 = 0; i12 < 3; i12++) {
                    if (i12 == 0) {
                        B0 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Od);
                        j10 = e6Var.k;
                    } else if (i12 == 1) {
                        B0 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Pd);
                        j10 = e6Var.l;
                    } else {
                        B0 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Qd);
                        j10 = e6Var.m;
                    }
                    int i13 = (int) j10;
                    if (i13 == 0 && j10 != 0) {
                        i13 = 0;
                    } else if (i13 == 0) {
                        i13 = B0;
                    }
                    if (i13 != B0) {
                        return true;
                    }
                }
            } else if (j14 != e6Var.k || j13 != e6Var.l || j12 != e6Var.m) {
                return true;
            }
            if (e6Var.n != this.K) {
                return true;
            }
        }
        if (i10 == 1 || i10 == 3) {
            if (this.w != e6Var.d) {
                return true;
            }
            int i14 = this.y;
            if (i14 == 0) {
                int i15 = e6Var.e;
                if (i15 != 0 && i15 != e6Var.c) {
                    return true;
                }
            } else if (i14 != e6Var.e) {
                return true;
            }
            int i16 = this.A;
            if (i16 != 0) {
                if (i16 != e6Var.f) {
                    return true;
                }
            } else if (e6Var.f != 0) {
                return true;
            }
            int i17 = this.B;
            if (i17 != 0) {
                if (i17 != e6Var.g) {
                    return true;
                }
            } else if (e6Var.g != 0) {
                return true;
            }
            int i18 = this.C;
            if (i18 != 0) {
                if (i18 != e6Var.h) {
                    return true;
                }
            } else if (e6Var.h != 0) {
                return true;
            }
            if (this.D != e6Var.i) {
                return true;
            }
        }
        return false;
    }

    public boolean U0() {
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        return (b5Var == null || b5Var.getBottomSheet() == null) ? false : true;
    }

    public final void V0() {
        bg.u1 u1Var = this.M1;
        if (u1Var != null) {
            u1Var.invalidate();
        }
        FrameLayout frameLayout = this.u0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.u0.getChildAt(i10).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.v0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                this.v0.getChildAt(i11).invalidate();
            }
        }
        if (this.F0 != null) {
            int i12 = 0;
            while (true) {
                org.telegram.ui.Components.a81[] a81VarArr = this.F0;
                if (i12 >= a81VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.a81 a81Var = a81VarArr[i12];
                if (a81Var != null) {
                    a81Var.setDimAmount(this.I1 ? this.j1 * this.k1 : 0.0f);
                    this.F0[i12].invalidate();
                }
                i12++;
            }
        }
        if (this.j0 != null) {
            for (int i13 = 0; i13 < this.j0.getChildCount(); i13++) {
                View childAt = this.j0.getChildAt(i13);
                if (childAt instanceof org.telegram.ui.Cells.v0) {
                    d1((org.telegram.ui.Cells.v0) childAt);
                    childAt.invalidate();
                }
            }
        }
        if (this.q0 != null) {
            for (int i14 = 0; i14 < this.q0.getChildCount(); i14++) {
                View childAt2 = this.q0.getChildAt(i14);
                if (childAt2 instanceof org.telegram.ui.Cells.v0) {
                    d1((org.telegram.ui.Cells.v0) childAt2);
                    childAt2.invalidate();
                }
            }
        }
        gc1 gc1Var = this.v1;
        if (gc1Var != null) {
            gc1Var.invalidate();
        }
        gc1 gc1Var2 = this.w1;
        if (gc1Var2 != null) {
            gc1Var2.invalidate();
        }
        u4 u4Var = this.y0;
        if (u4Var != null) {
            u4Var.invalidate();
        }
    }

    public final void W0() {
        org.telegram.ui.ActionBar.e6 e6Var = this.s;
        if (e6Var == null || TextUtils.isEmpty(e6Var.o)) {
            return;
        }
        try {
            File d = e6Var.d();
            Drawable background = this.t0.getBackground();
            Bitmap bitmap = this.t0.getImageReceiver().getBitmap();
            if (background instanceof org.telegram.ui.Components.yb0) {
                FileOutputStream fileOutputStream = new FileOutputStream(d);
                bitmap.compress(Bitmap.CompressFormat.PNG, 87, fileOutputStream);
                fileOutputStream.close();
                return;
            }
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            background.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
            background.draw(canvas);
            Paint paint = new Paint(2);
            paint.setColorFilter(new PorterDuffColorFilter(this.f1, this.o1));
            paint.setAlpha((int) (this.h1 * 255.0f));
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            FileOutputStream fileOutputStream2 = new FileOutputStream(d);
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream2);
            fileOutputStream2.close();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    public final void X0() {
        Y0(2, true);
    }

    public final void Y0(int i10, boolean z10) {
        org.telegram.ui.ActionBar.e6 e6Var;
        int i11;
        int i12;
        if (getParentActivity() == null || this.n == i10 || this.n1 != null || (e6Var = this.s) == null) {
            return;
        }
        if (z10 && i10 == 2 && (org.telegram.ui.ActionBar.g6.Z0() || e6Var.j == 4294967296L)) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.N = LocaleController.getString(R.string.ChangeChatBackground);
            if (!org.telegram.ui.ActionBar.g6.Z0() || (org.telegram.ui.ActionBar.g6.Z0() && org.telegram.ui.ActionBar.g6.I.e0.d != 0)) {
                alertDialog$Builder.a.P = LocaleController.getString(R.string.ChangeColorToColor);
                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new db1(this, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Continue), new db1(this, 6));
            } else {
                alertDialog$Builder.a.P = LocaleController.getString(R.string.ChangeWallpaperToColor);
                alertDialog$Builder.k(LocaleController.getString(R.string.Change), new db1(this, 7));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            }
            showDialog(alertDialog$Builder.a);
            return;
        }
        int i13 = this.n;
        this.n = i10;
        if (i10 == 1) {
            this.h.setText(LocaleController.getString(R.string.ColorPickerMainColor));
            int i14 = e6Var.d != 0 ? 2 : 1;
            org.telegram.ui.Components.gq gqVar = this.R;
            T0(1);
            gqVar.f(1, 2, i14, false);
            this.R.e(e6Var.c, 0);
            int i15 = e6Var.d;
            if (i15 != 0) {
                this.R.e(i15, 1);
            }
            if (i13 == 2 || (i13 == 3 && e6Var.g != 0)) {
                this.r0.u(0);
            }
        } else if (i10 == 2) {
            this.h.setText(LocaleController.getString(R.string.ColorPickerBackground));
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.Nd);
            int i16 = org.telegram.ui.ActionBar.g6.Od;
            int themedColor2 = org.telegram.ui.ActionBar.g6.c1(i16) ? getThemedColor(i16) : 0;
            int i17 = org.telegram.ui.ActionBar.g6.Pd;
            int themedColor3 = org.telegram.ui.ActionBar.g6.c1(i17) ? getThemedColor(i17) : 0;
            int i18 = org.telegram.ui.ActionBar.g6.Qd;
            int themedColor4 = org.telegram.ui.ActionBar.g6.c1(i18) ? getThemedColor(i18) : 0;
            long j10 = e6Var.k;
            int i19 = (int) j10;
            if (i19 == 0 && j10 != 0) {
                themedColor2 = 0;
            }
            long j11 = e6Var.l;
            int i20 = (int) j11;
            if (i20 == 0 && j11 != 0) {
                themedColor3 = 0;
            }
            long j12 = e6Var.m;
            int i21 = (int) j12;
            if (i21 == 0 && j12 != 0) {
                themedColor4 = 0;
            }
            int i22 = (int) e6Var.j;
            if (i19 == 0 && themedColor2 == 0) {
                i11 = i20;
                i12 = 1;
            } else if (i21 != 0 || themedColor4 != 0) {
                i11 = i20;
                i12 = 4;
            } else if (i20 == 0 && themedColor3 == 0) {
                i11 = i20;
                i12 = 2;
            } else {
                i11 = i20;
                i12 = 3;
            }
            org.telegram.ui.Components.gq gqVar2 = this.R;
            T0(2);
            gqVar2.f(2, 4, i12, false);
            org.telegram.ui.Components.gq gqVar3 = this.R;
            if (i21 == 0) {
                i21 = themedColor4;
            }
            gqVar3.e(i21, 3);
            org.telegram.ui.Components.gq gqVar4 = this.R;
            if (i11 != 0) {
                themedColor3 = i11;
            }
            gqVar4.e(themedColor3, 2);
            org.telegram.ui.Components.gq gqVar5 = this.R;
            if (i19 == 0) {
                i19 = themedColor2;
            }
            gqVar5.e(i19, 1);
            org.telegram.ui.Components.gq gqVar6 = this.R;
            if (i22 != 0) {
                themedColor = i22;
            }
            gqVar6.e(themedColor, 0);
            if (i13 == 1 || e6Var.g == 0) {
                this.r0.o(0);
            } else {
                this.r0.m(0);
            }
            this.q0.v0(0, AndroidUtilities.dp(60.0f), null);
        } else if (i10 == 3) {
            this.h.setText(LocaleController.getString(R.string.ColorPickerMyMessages));
            int i23 = e6Var.f != 0 ? e6Var.h != 0 ? 4 : e6Var.g != 0 ? 3 : 2 : 1;
            org.telegram.ui.Components.gq gqVar7 = this.R;
            T0(3);
            gqVar7.f(2, 4, i23, true);
            this.R.e(e6Var.h, 3);
            this.R.e(e6Var.g, 2);
            this.R.e(e6Var.f, 1);
            org.telegram.ui.Components.gq gqVar8 = this.R;
            int i24 = e6Var.e;
            if (i24 == 0) {
                i24 = e6Var.c;
            }
            gqVar8.e(i24, 0);
            this.G0[1].b(0, e6Var.e);
            this.G0[1].b(1, e6Var.f);
            this.G0[1].b(2, e6Var.g);
            this.G0[1].b(3, e6Var.h);
            if (e6Var.g != 0) {
                if (i13 == 1) {
                    this.r0.o(0);
                } else {
                    this.r0.m(0);
                }
            } else if (i13 == 2) {
                this.r0.u(0);
            }
            this.q0.v0(0, AndroidUtilities.dp(60.0f), null);
            e1();
        }
        if (i10 != 1 && i10 != 3) {
            this.R.setMinBrightness(0.0f);
            this.R.setMaxBrightness(1.0f);
            return;
        }
        if (i13 == 2 && this.H0[1].getVisibility() == 0) {
            f1(0, true, true);
        }
        if (i10 != 1) {
            this.R.setMinBrightness(0.0f);
            this.R.setMaxBrightness(1.0f);
        } else if (this.a0.q()) {
            this.R.setMinBrightness(0.2f);
        } else {
            this.R.setMinBrightness(0.05f);
            this.R.setMaxBrightness(0.8f);
        }
    }

    public final void Z0(int i10) {
        TLRPC.TL_wallPaper tL_wallPaper = (i10 < 0 || i10 >= this.Q0.size()) ? this.U0 : (TLRPC.TL_wallPaper) this.Q0.get(i10);
        if (tL_wallPaper == null) {
            return;
        }
        ValueAnimator valueAnimator = this.Y1;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.Y1.cancel();
        }
        fc1[] fc1VarArr = this.s0;
        fc1 fc1Var = fc1VarArr[0];
        fc1 fc1Var2 = fc1VarArr[1];
        fc1VarArr[0] = fc1Var2;
        fc1VarArr[1] = fc1Var;
        this.p0.removeView(fc1Var2);
        this.p0.addView(fc1VarArr[0], this.p0.indexOfChild(fc1VarArr[1]) + 1);
        fc1 fc1Var3 = fc1VarArr[0];
        this.t0 = fc1Var3;
        fc1Var3.setBackground(fc1VarArr[1].getBackground());
        k1();
        fc1VarArr[1].setVisibility(0);
        fc1VarArr[1].setAlpha(1.0f);
        this.t0.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.Y1 = ofFloat;
        ofFloat.addUpdateListener(new ti(2, this));
        this.Y1.addListener(new tb1(this, 0));
        this.Y1.setInterpolator(org.telegram.ui.Components.jr.f);
        this.Y1.setDuration(300L);
        this.Y1.start();
        this.t0.getImageReceiver().setCrossfadeDuration(300);
        this.t0.getImageReceiver().setImage(ImageLocation.getForDocument(tL_wallPaper.document), this.C1, null, null, null, tL_wallPaper.document.size, "jpg", tL_wallPaper, 1);
        this.t0.d();
        this.S0 = tL_wallPaper;
        this.A1 = this.F0[2].s;
        j1();
    }

    public final void a1(int i10, int i11, boolean z10) {
        org.telegram.ui.Components.yb0 yb0Var;
        if (i11 == 0) {
            this.V0 = i10;
        } else if (i11 == 1) {
            this.X0 = i10;
        } else if (i11 == 2) {
            this.Y0 = i10;
        } else if (i11 == 3) {
            this.Z0 = i10;
        }
        m1(z10);
        if (this.F0 != null) {
            int i12 = 0;
            while (true) {
                org.telegram.ui.Components.a81[] a81VarArr = this.F0;
                if (i12 >= a81VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.a81 a81Var = a81VarArr[i12];
                if (a81Var != null) {
                    a81Var.b(i11, i10);
                }
                i12++;
            }
        }
        if (this.Y0 != 0) {
            if (this.P0 != null && org.telegram.ui.ActionBar.g6.I.q()) {
                this.P0.setTwoSided(true);
            }
            Drawable background = this.t0.getBackground();
            if (background instanceof org.telegram.ui.Components.yb0) {
                yb0Var = (org.telegram.ui.Components.yb0) background;
            } else {
                yb0Var = new org.telegram.ui.Components.yb0();
                yb0Var.r(this.t0);
                if (this.z1) {
                    yb0Var.m(false);
                }
            }
            yb0Var.n(this.V0, this.X0, this.Y0, this.Z0);
            this.t0.setBackground(yb0Var);
            this.f1 = yb0Var.f();
            this.g1 = 754974720;
        } else if (this.X0 != 0) {
            this.t0.setBackground(new GradientDrawable(org.telegram.ui.Components.s9.d(this.d1), new int[]{this.V0, this.X0}));
            int patternColor = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(this.V0, this.X0));
            this.g1 = patternColor;
            this.f1 = patternColor;
        } else {
            this.t0.setBackgroundColor(this.V0);
            int patternColor2 = AndroidUtilities.getPatternColor(this.V0);
            this.g1 = patternColor2;
            this.f1 = patternColor2;
        }
        int i13 = org.telegram.ui.ActionBar.g6.lc;
        boolean c12 = org.telegram.ui.ActionBar.g6.c1(i13);
        pb1 pb1Var = this.a;
        if (!c12 || (this.t0.getBackground() instanceof org.telegram.ui.Components.yb0)) {
            pb1Var.b(this.t0.getBackground(), this.t0.getBackground(), Float.valueOf(this.h1));
        } else if (org.telegram.ui.ActionBar.g6.s0() instanceof org.telegram.ui.Components.yb0) {
            getThemedColor(i13);
            pb1Var.b(this.t0.getBackground(), this.t0.getBackground(), Float.valueOf(this.h1));
        }
        ImageView imageView = this.B0;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.ic), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.C0;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.ic), PorterDuff.Mode.MULTIPLY));
        }
        fc1 fc1Var = this.t0;
        if (fc1Var != null) {
            fc1Var.getImageReceiver().setColorFilter(new PorterDuffColorFilter(this.f1, this.o1));
            this.t0.getImageReceiver().setAlpha(Math.abs(this.h1));
            this.t0.invalidate();
            if (org.telegram.ui.ActionBar.g6.I.q() && (this.t0.getBackground() instanceof org.telegram.ui.Components.yb0)) {
                org.telegram.ui.Cells.j0 j0Var = this.P0;
                if (j0Var != null) {
                    j0Var.setTwoSided(true);
                }
                if (this.h1 < 0.0f) {
                    this.t0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.yb0) this.t0.getBackground()).k);
                }
            } else {
                this.t0.getImageReceiver().setGradientBitmap(null);
                org.telegram.ui.Cells.j0 j0Var2 = this.P0;
                if (j0Var2 != null) {
                    j0Var2.setTwoSided(false);
                }
            }
            org.telegram.ui.Cells.j0 j0Var3 = this.P0;
            if (j0Var3 != null) {
                j0Var3.setProgress(this.h1);
            }
        }
        jb1 jb1Var = this.q0;
        if (jb1Var != null) {
            jb1Var.f1();
        }
        FrameLayout frameLayout = this.u0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                this.u0.getChildAt(i14).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.v0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                this.v0.getChildAt(i15).invalidate();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b1(boolean z10) {
        ColorDrawable colorDrawable;
        org.telegram.ui.Components.yb0 yb0Var;
        org.telegram.ui.ActionBar.e6 e6Var = this.s;
        int i10 = this.b;
        if (i10 == 0 && e6Var == null) {
            this.t0.setBackground(org.telegram.ui.ActionBar.g6.r0());
        } else {
            if (i10 == 2) {
                Object obj = this.x1;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
                    TLRPC.PhotoSize closestPhotoSizeWithSize = z10 ? FileLoader.getClosestPhotoSizeWithSize(tL_wallPaper.document.thumbs, 100) : null;
                    BitmapDrawable bitmapDrawable = closestPhotoSizeWithSize instanceof TLRPC.TL_photoStrippedSize ? new BitmapDrawable(ImageLoader.getStrippedPhotoBitmap(closestPhotoSizeWithSize.bytes, "b")) : null;
                    fc1 fc1Var = this.t0;
                    fc1Var.a.setImage(ImageLocation.getForDocument(tL_wallPaper.document), this.C1, ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), "100_100_b", bitmapDrawable, tL_wallPaper.document.size, "jpg", tL_wallPaper, 1);
                    fc1Var.d();
                } else if (obj instanceof zh1) {
                    zh1 zh1Var = (zh1) obj;
                    int i11 = zh1Var.f;
                    int i12 = zh1Var.e;
                    int i13 = zh1Var.d;
                    int i14 = zh1Var.c;
                    int i15 = zh1Var.b;
                    this.d1 = i11;
                    a1(i15, 0, false);
                    if (i14 != 0) {
                        a1(i14, 1, false);
                    }
                    a1(i13, 2, false);
                    a1(i12, 3, false);
                    TLRPC.TL_wallPaper tL_wallPaper2 = this.S0;
                    if (tL_wallPaper2 != null) {
                        fc1 fc1Var2 = this.t0;
                        ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                        String str = this.C1;
                        TLRPC.TL_wallPaper tL_wallPaper3 = this.S0;
                        fc1Var2.k(forDocument, str, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                    } else if ("d".equals(zh1Var.a)) {
                        Point point = AndroidUtilities.displaySize;
                        int min = Math.min(point.x, point.y);
                        Point point2 = AndroidUtilities.displaySize;
                        this.t0.setImageBitmap(SvgHelper.getBitmap(R.raw.default_pattern, min, Math.max(point2.x, point2.y), Build.VERSION.SDK_INT >= 29 ? 1459617792 : org.telegram.ui.Components.yb0.g(i15, i14, i13, i12)));
                    }
                } else if (obj instanceof ai1) {
                    Bitmap bitmap = this.y1;
                    if (bitmap != null) {
                        this.t0.setImageBitmap(bitmap);
                    } else {
                        ai1 ai1Var = (ai1) obj;
                        File file = ai1Var.e;
                        if (file != null) {
                            this.t0.f(file.getAbsolutePath(), this.C1, null);
                        } else {
                            File file2 = ai1Var.d;
                            if (file2 != null) {
                                this.t0.f(file2.getAbsolutePath(), this.C1, null);
                            } else if ("t".equals(ai1Var.a)) {
                                fc1 fc1Var3 = this.t0;
                                fc1Var3.setImageDrawable(org.telegram.ui.ActionBar.g6.W0(fc1Var3, false));
                            } else {
                                int i16 = ai1Var.b;
                                if (i16 != 0) {
                                    this.t0.setImageResource(i16);
                                }
                            }
                        }
                    }
                } else if (obj instanceof MediaController.SearchImage) {
                    MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                    TLRPC.Photo photo = searchImage.photo;
                    if (photo != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 100);
                        TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(searchImage.photo.sizes, this.D1, true);
                        TLRPC.PhotoSize photoSize = closestPhotoSizeWithSize3 != closestPhotoSizeWithSize2 ? closestPhotoSizeWithSize3 : null;
                        this.t0.k(ImageLocation.getForPhoto(photoSize, searchImage.photo), this.C1, ImageLocation.getForPhoto(closestPhotoSizeWithSize2, searchImage.photo), "100_100_b", photoSize != null ? photoSize.size : 0, "jpg", searchImage, 1);
                    } else {
                        fc1 fc1Var4 = this.t0;
                        String str2 = searchImage.imageUrl;
                        String str3 = this.C1;
                        String str4 = searchImage.thumbUrl;
                        fc1Var4.getClass();
                        fc1Var4.m(ImageLocation.getForPath(str2), str3, ImageLocation.getForPath(str4), "100_100_b", null, null, 0, null);
                    }
                }
            } else if (e6Var == null) {
                this.t0.setBackground(org.telegram.ui.ActionBar.g6.r0());
            } else {
                org.telegram.ui.Components.n9 n9Var = this.q1;
                if (n9Var != null) {
                    n9Var.dispose();
                    this.q1 = null;
                }
                int B0 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Nd);
                int i17 = (int) e6Var.j;
                if (i17 != 0) {
                    B0 = i17;
                }
                int B02 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Od);
                long j10 = e6Var.k;
                int i18 = (int) j10;
                if (i18 == 0 && j10 != 0) {
                    B02 = 0;
                } else if (i18 != 0) {
                    B02 = i18;
                }
                int B03 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Pd);
                long j11 = e6Var.l;
                int i19 = (int) j11;
                if (i19 == 0 && j11 != 0) {
                    B03 = 0;
                } else if (i19 != 0) {
                    B03 = i19;
                }
                int B04 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Qd);
                long j12 = e6Var.m;
                int i20 = (int) j12;
                if (i20 == 0 && j12 != 0) {
                    B04 = 0;
                } else if (i20 != 0) {
                    B04 = i20;
                }
                if (TextUtils.isEmpty(e6Var.o) || org.telegram.ui.ActionBar.g6.Z0()) {
                    Drawable s02 = org.telegram.ui.ActionBar.g6.s0();
                    if (s02 != null) {
                        if (s02 instanceof org.telegram.ui.Components.yb0) {
                            ((org.telegram.ui.Components.yb0) s02).r(this.t0);
                        }
                        this.t0.setBackground(s02);
                    }
                } else {
                    if (B03 != 0) {
                        Drawable background = this.t0.getBackground();
                        if (background instanceof org.telegram.ui.Components.yb0) {
                            yb0Var = (org.telegram.ui.Components.yb0) background;
                        } else {
                            org.telegram.ui.Components.yb0 yb0Var2 = new org.telegram.ui.Components.yb0();
                            yb0Var2.r(this.t0);
                            yb0Var = yb0Var2;
                            if (this.z1) {
                                yb0Var2.m(false);
                                yb0Var = yb0Var2;
                            }
                        }
                        yb0Var.n(B0, B02, B03, B04);
                        colorDrawable = yb0Var;
                    } else if (B02 != 0) {
                        org.telegram.ui.Components.s9 s9Var = new org.telegram.ui.Components.s9(org.telegram.ui.Components.s9.d(e6Var.n), new int[]{B0, B02});
                        this.q1 = s9Var.f(o1.a.F(0.5f, 3), new xb1(this, 0), 100L);
                        colorDrawable = s9Var;
                    } else {
                        colorDrawable = new ColorDrawable(B0);
                    }
                    this.t0.setBackground(colorDrawable);
                    TLRPC.TL_wallPaper tL_wallPaper4 = this.S0;
                    if (tL_wallPaper4 != null) {
                        fc1 fc1Var5 = this.t0;
                        ImageLocation forDocument2 = ImageLocation.getForDocument(tL_wallPaper4.document);
                        String str5 = this.C1;
                        TLRPC.TL_wallPaper tL_wallPaper5 = this.S0;
                        fc1Var5.k(forDocument2, str5, null, null, tL_wallPaper5.document.size, "jpg", tL_wallPaper5, 1);
                    }
                }
                if (B02 == 0) {
                    int patternColor = AndroidUtilities.getPatternColor(B0);
                    this.g1 = patternColor;
                    this.f1 = patternColor;
                } else if (B03 != 0) {
                    this.f1 = org.telegram.ui.Components.yb0.g(B0, B02, B03, B04);
                    this.g1 = 754974720;
                } else {
                    int patternColor2 = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(B0, B02));
                    this.g1 = patternColor2;
                    this.f1 = patternColor2;
                }
                fc1 fc1Var6 = this.t0;
                if (fc1Var6 != null) {
                    fc1Var6.getImageReceiver().setColorFilter(new PorterDuffColorFilter(this.f1, this.o1));
                    this.t0.getImageReceiver().setAlpha(Math.abs(this.h1));
                    this.t0.invalidate();
                    if (org.telegram.ui.ActionBar.g6.I.q() && (this.t0.getBackground() instanceof org.telegram.ui.Components.yb0)) {
                        org.telegram.ui.Cells.j0 j0Var = this.P0;
                        if (j0Var != null) {
                            j0Var.setTwoSided(true);
                        }
                        if (this.h1 < 0.0f) {
                            this.t0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.yb0) this.t0.getBackground()).k);
                        }
                    } else {
                        this.t0.getImageReceiver().setGradientBitmap(null);
                        org.telegram.ui.Cells.j0 j0Var2 = this.P0;
                        if (j0Var2 != null) {
                            j0Var2.setTwoSided(false);
                        }
                    }
                    org.telegram.ui.Cells.j0 j0Var3 = this.P0;
                    if (j0Var3 != null) {
                        j0Var3.setProgress(this.h1);
                    }
                }
                if (this.F0 != null) {
                    int i21 = 0;
                    while (true) {
                        org.telegram.ui.Components.a81[] a81VarArr = this.F0;
                        if (i21 >= a81VarArr.length) {
                            break;
                        }
                        a81VarArr[i21].b(0, B0);
                        this.F0[i21].b(1, B02);
                        this.F0[i21].b(2, B03);
                        this.F0[i21].b(3, B04);
                        i21++;
                    }
                }
                ImageView imageView = this.B0;
                if (imageView != null) {
                    imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.ic), PorterDuff.Mode.MULTIPLY));
                }
                ImageView imageView2 = this.C0;
                if (imageView2 != null) {
                    imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.ic), PorterDuff.Mode.MULTIPLY));
                }
                V0();
            }
        }
        this.z1 = false;
    }

    public final void c1(long j10) {
        this.F1 = j10;
        this.G1 = j10 == 0 || j10 == getUserConfig().getClientUserId();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        if (r7.pattern == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x0273, code lost:
    
        if ("d".equals(((org.telegram.ui.zh1) r12).a) == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x0279, code lost:
    
        if ((r46.x1 instanceof org.telegram.tgnet.TLRPC.TL_wallPaper) != false) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0fe5  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0faf  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0e3d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0744  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0868  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x08e5  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x092e  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x093f  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x08ff  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0949 A[EDGE_INSN: B:240:0x0949->B:241:0x0949 BREAK  A[LOOP:2: B:190:0x0864->B:216:0x0940], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x094d  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0a70  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0dcd  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0dd7  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0a7d  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x085e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0761  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a1 A[LOOP:0: B:45:0x019d->B:47:0x01a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01cc A[EDGE_INSN: B:48:0x01cc->B:49:0x01cc BREAK  A[LOOP:0: B:45:0x019d->B:47:0x01a1], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x054f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0e3a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0e75  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0fb2  */
    /* JADX WARN: Type inference failed for: r12v69 */
    /* JADX WARN: Type inference failed for: r12v70, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v74 */
    @Override // org.telegram.ui.ActionBar.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        boolean z10;
        org.telegram.ui.ActionBar.b5 b5Var;
        int i10;
        int i11;
        int i12;
        fc1[] fc1VarArr;
        boolean z11;
        int i13;
        int i14;
        float f9;
        int i15;
        Object obj;
        int i16;
        Rect rect;
        int i17;
        final int i18;
        pb1 pb1Var;
        final int i19;
        float f10;
        ?? r12;
        org.telegram.ui.Components.zz0 zz0Var;
        final int i20;
        org.telegram.ui.ActionBar.b5 b5Var2;
        this.N.p = (pb1) getResourceProvider();
        this.O.p = (pb1) getResourceProvider();
        this.P.p = (pb1) getResourceProvider();
        this.Q.p = (pb1) getResourceProvider();
        int i21 = 1;
        this.hasOwnBackground = true;
        hc1 hc1Var = this.l1;
        int i22 = 0;
        boolean z12 = (hc1Var == null || this.F1 == 0) ? false : true;
        this.H1 = z12;
        if (z12) {
            Object obj2 = this.x1;
            if (!(obj2 instanceof ai1)) {
                if (obj2 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj2;
                    if (tL_wallPaper.document != null) {
                    }
                }
            }
            z10 = true;
            this.I1 = z10;
            if (z10) {
                this.k1 = hc1Var.a() ? 1.0f : 0.0f;
            }
            b5Var = this.parentLayout;
            if (b5Var != null && ((ActionBarLayout) b5Var).z()) {
                this.actionBar.setOccupyStatusBar(false);
            }
            this.i0 = new FrameLayout(context);
            i10 = 3;
            if (this.I1 && SharedConfig.dayNightWallpaperSwitchHint < 3) {
                AndroidUtilities.runOnUIThread(new bb1(this, i10), 2000L);
            }
            org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
            a2.F();
            a2.D = new ac1();
            a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
            this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c5());
            this.actionBar.setAddToContainer(false);
            this.actionBar.setTitle(LocaleController.getString(R.string.ThemePreview));
            n0 n0Var = new n0(this, context, 24);
            this.i0 = n0Var;
            n0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.d6));
            this.i0.addView(this.actionBar, i7.f6.c(-2.0f, -1));
            org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0(context);
            this.j0 = jl0Var;
            jl0Var.setVerticalScrollBarEnabled(true);
            this.j0.setItemAnimator(null);
            this.j0.setLayoutAnimation(null);
            this.j0.setLayoutManager(new f2.j0(1, false));
            this.j0.setVerticalScrollbarPosition(!LocaleController.isRTL ? 1 : 2);
            org.telegram.ui.Components.jl0 jl0Var2 = this.j0;
            i11 = this.b;
            jl0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(i11 == 0 ? 12.0f : 0.0f));
            final int i23 = 4;
            this.j0.setOnItemClickListener(new ih.a(i23));
            this.i0.addView(this.j0, i7.f6.e(-1, -1, 51));
            org.telegram.ui.Components.u10 u10Var = new org.telegram.ui.Components.u10(context, this.resourceProvider);
            this.l0 = u10Var;
            u10Var.setImageResource(R.drawable.floating_pencil);
            this.i0.addView(this.l0, org.telegram.ui.Components.u10.b());
            ic1 ic1Var = new ic1(context);
            this.k0 = ic1Var;
            this.j0.setAdapter(ic1Var);
            this.p0 = new org.telegram.ui.ActionBar.r0(this, context, i10);
            this.r0 = new mc1(context, this);
            this.o0 = createActionBar(context);
            if (AndroidUtilities.isTablet()) {
                this.o0.setOccupyStatusBar(false);
            }
            th.y(false, this.o0);
            this.o0.setActionBarMenuOnItemClick(new ec1(this));
            i12 = 0;
            while (true) {
                fc1VarArr = this.s0;
                if (i12 < 2) {
                    break;
                }
                fc1VarArr[i12] = new fc1(this, (Activity) getContext());
                this.p0.addView(fc1VarArr[i12], i7.f6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
                i12++;
            }
            fc1 fc1Var = fc1VarArr[0];
            this.t0 = fc1Var;
            fc1Var.setVisibility(0);
            fc1VarArr[1].setVisibility(8);
            if (i11 == 2) {
                this.t0.getImageReceiver().setDelegate(new db1(this, i22));
            }
            z11 = this.r0.e;
            org.telegram.ui.ActionBar.f6 f6Var = this.a0;
            if (!z11) {
                this.o0.setTitle("Telegram Beta Chat");
                this.o0.setSubtitle(LocaleController.formatPluralString("Members", 505, new Object[0]));
                i13 = i11;
            } else if (i11 == 2) {
                i13 = i11;
                if (this.F1 != 0) {
                    this.o0.setTitle(LocaleController.getString(R.string.WallpaperPreview));
                } else {
                    this.o0.setTitle(LocaleController.getString(R.string.BackgroundPreview));
                }
                org.telegram.ui.ActionBar.a0 n10 = this.o0.n();
                Object obj3 = this.x1;
                if ((obj3 instanceof ai1) && ((ai1) obj3).e != null) {
                    n10.a(7, R.drawable.msg_header_draw);
                }
                if (this.F1 == 0) {
                    if (!BuildVars.DEBUG_PRIVATE_VERSION || org.telegram.ui.ActionBar.g6.m0().k(false) == null) {
                        Object obj4 = this.x1;
                        if (obj4 instanceof zh1) {
                        }
                    }
                    n10.a(5, R.drawable.msg_header_share);
                }
                if (this.F1 != 0 && this.H1) {
                    org.telegram.ui.Components.xi0 xi0Var = new org.telegram.ui.Components.xi0(R.raw.sun, "" + R.raw.sun, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
                    this.J1 = xi0Var;
                    this.K1 = n10.d(6, xi0Var);
                    this.J1.h = true;
                    hc1 hc1Var2 = this.l1;
                    if (hc1Var2 == null || hc1Var2.a()) {
                        this.J1.K(35);
                        this.J1.N(36);
                    } else {
                        this.J1.N(0);
                        this.J1.K(0);
                    }
                    this.J1.W = true;
                    int u02 = org.telegram.ui.ActionBar.g6.u0(org.telegram.ui.ActionBar.g6.J9);
                    this.J1.O(u02, "Sunny");
                    this.J1.O(u02, "Path 6");
                    this.J1.O(u02, "Path");
                    this.J1.O(u02, "Path 5");
                    this.J1.m();
                }
            } else {
                i13 = i11;
                if (i13 == 1) {
                    org.telegram.ui.ActionBar.a0 n11 = this.o0.n();
                    this.f = n11.e(4, LocaleController.getString(R.string.Save));
                    org.telegram.ui.Components.tl tlVar = new org.telegram.ui.Components.tl(this, context, n11);
                    this.e = tlVar;
                    tlVar.setSubMenuOpenSide(1);
                    this.e.g(2, LocaleController.getString(R.string.ColorPickerBackground));
                    this.e.g(1, LocaleController.getString(R.string.ColorPickerMainColor));
                    this.e.g(3, LocaleController.getString(R.string.ColorPickerMyMessages));
                    this.e.D();
                    this.e.setForceSmoothKeyboard(true);
                    this.o0.addView(this.e, i7.f6.d(-2, -1.0f, 51, AndroidUtilities.isTablet() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f));
                    final int i24 = 2;
                    this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.cb1
                        public final /* synthetic */ qc1 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i24) {
                                case 0:
                                    this.b.O0(false);
                                    break;
                                case 1:
                                    qc1.U(this.b);
                                    break;
                                case 2:
                                    this.b.e.M(null, null);
                                    break;
                                case 3:
                                    this.b.N0(false);
                                    break;
                                default:
                                    this.b.N0(true);
                                    break;
                            }
                        }
                    });
                    TextView textView = new TextView(context);
                    this.h = textView;
                    textView.setImportantForAccessibility(2);
                    this.h.setGravity(3);
                    this.h.setSingleLine(true);
                    this.h.setLines(1);
                    this.h.setMaxLines(1);
                    this.h.setEllipsize(TextUtils.TruncateAt.END);
                    TextView textView2 = this.h;
                    int i25 = org.telegram.ui.ActionBar.g6.A8;
                    textView2.setTextColor(getThemedColor(i25));
                    this.h.setTypeface(AndroidUtilities.bold());
                    this.h.setText(LocaleController.getString(R.string.ColorPickerMainColor));
                    Drawable mutate = context.getResources().getDrawable(R.drawable.ic_arrow_drop_down).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i25), PorterDuff.Mode.MULTIPLY));
                    this.h.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, mutate, (Drawable) null);
                    this.h.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                    this.h.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
                    this.e.addView(this.h, i7.f6.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 1.0f));
                } else {
                    TLRPC.TL_theme tL_theme = f6Var.B;
                    String n12 = tL_theme != null ? tL_theme.title : f6Var.n();
                    int lastIndexOf = n12.lastIndexOf(".attheme");
                    if (lastIndexOf >= 0) {
                        n12 = n12.substring(0, lastIndexOf);
                    }
                    this.o0.setTitle(n12);
                    TLRPC.TL_theme tL_theme2 = f6Var.B;
                    if (tL_theme2 == null || (i14 = tL_theme2.installs_count) <= 0) {
                        this.o0.setSubtitle(LocaleController.formatDateOnline((System.currentTimeMillis() / 1000) - 3600, null));
                        this.q0 = new jb1(context, this);
                        kb1 kb1Var = new kb1(this);
                        kb1Var.S();
                        this.q0.setItemAnimator(kb1Var);
                        this.q0.setVerticalScrollBarEnabled(true);
                        this.q0.setOverScrollMode(2);
                        if (i13 == 2) {
                            f9 = 16.0f;
                            this.q0.setPadding(0, AndroidUtilities.dp(4.0f), 0, (AndroidUtilities.dp(72 + ((this.G1 || this.F1 <= 0) ? 0 : 58)) - 12) + (U0() ? AndroidUtilities.navigationBarHeight : 0));
                        } else {
                            f9 = 16.0f;
                            if (i13 == 1) {
                                this.q0.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(16.0f));
                            } else {
                                this.q0.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                            }
                        }
                        this.q0.setClipToPadding(false);
                        this.q0.setLayoutManager(new f2.j0(1, true));
                        this.q0.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
                        if (i13 == 1) {
                            this.p0.addView(this.q0, i7.f6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 273.0f));
                            this.q0.setOnItemClickListener(new db1(this, i21));
                            i15 = -1;
                        } else {
                            i15 = -1;
                            this.p0.addView(this.q0, i7.f6.e(-1, -1, 51));
                        }
                        this.q0.setOnScrollListener(new lb1(this, i22));
                        this.p0.addView(this.o0, i7.f6.c(-2.0f, i15));
                        org.telegram.ui.Components.c81 c81Var = new org.telegram.ui.Components.c81(context);
                        this.r1 = c81Var;
                        c81Var.b(new db1(this, 2));
                        org.telegram.ui.ActionBar.e6 e6Var = this.s;
                        if (i13 != 1 || i13 == 2) {
                            if (i13 == 2) {
                                u4 u4Var = new u4(this, context, U0());
                                this.y0 = u4Var;
                                u4Var.setWillNotDraw(false);
                                this.y0.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + (U0() ? AndroidUtilities.navigationBarHeight : 0));
                                this.p0.addView(this.y0, i7.f6.e(-1, 0, 81));
                                gc1 gc1Var = new gc1(context, this);
                                this.v1 = gc1Var;
                                i7.h6.b(gc1Var, 0.033f, 1.2f);
                                h1(false);
                                final int i26 = 3;
                                this.v1.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.cb1
                                    public final /* synthetic */ qc1 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        switch (i26) {
                                            case 0:
                                                this.b.O0(false);
                                                break;
                                            case 1:
                                                qc1.U(this.b);
                                                break;
                                            case 2:
                                                this.b.e.M(null, null);
                                                break;
                                            case 3:
                                                this.b.N0(false);
                                                break;
                                            default:
                                                this.b.N0(true);
                                                break;
                                        }
                                    }
                                });
                                if (this.F1 <= 0 || this.G1 || this.m0 != null) {
                                    this.y0.addView(this.v1, i7.f6.d(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                                } else {
                                    gc1 gc1Var2 = new gc1(context, this);
                                    this.w1 = gc1Var2;
                                    i7.h6.b(gc1Var2, 0.033f, 1.2f);
                                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.F1));
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
                                    if (!getUserConfig().isPremium()) {
                                        spannableStringBuilder.append((CharSequence) "l ");
                                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.iq(R.drawable.msg_mini_lock3), 0, 1, 33);
                                    }
                                    spannableStringBuilder.append((CharSequence) LocaleController.formatString(R.string.ApplyWallpaperForMeAndPeer, UserObject.getUserName(user)));
                                    this.w1.d(spannableStringBuilder);
                                    try {
                                        gc1 gc1Var3 = this.w1;
                                        CharSequence b10 = gc1Var3.b();
                                        zz0Var = this.w1.a;
                                        gc1Var3.d(Emoji.replaceEmoji(b10, zz0Var.i(), false));
                                    } catch (Exception unused) {
                                    }
                                    this.w1.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.cb1
                                        public final /* synthetic */ qc1 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i23) {
                                                case 0:
                                                    this.b.O0(false);
                                                    break;
                                                case 1:
                                                    qc1.U(this.b);
                                                    break;
                                                case 2:
                                                    this.b.e.M(null, null);
                                                    break;
                                                case 3:
                                                    this.b.N0(false);
                                                    break;
                                                default:
                                                    this.b.N0(true);
                                                    break;
                                            }
                                        }
                                    });
                                    this.y0.addView(this.v1, i7.f6.d(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 58.0f));
                                    this.y0.addView(this.w1, i7.f6.d(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                                }
                                if (this.I1) {
                                    bg.u1 u1Var = new bg.u1(this, (Activity) getContext());
                                    this.M1 = u1Var;
                                    u1Var.setPadding(AndroidUtilities.dp(f9), AndroidUtilities.dp(f9), AndroidUtilities.dp(f9), AndroidUtilities.dp(f9));
                                    this.p0.addView(this.M1, i7.f6.e(222, 76, 49));
                                    mb1 mb1Var = new mb1((Activity) getContext());
                                    this.N1 = mb1Var;
                                    mb1Var.d(this.j1);
                                    this.N1.b();
                                    this.N1.c(new x3(this, 21));
                                    this.M1.addView(this.N1);
                                    hc1 hc1Var3 = this.l1;
                                    if (hc1Var3 != null) {
                                        this.N1.setVisibility(hc1Var3.a() ? 0 : 8);
                                        this.N1.setAlpha(this.l1.a() ? 1.0f : 0.0f);
                                        this.N1.d(this.l1.a() ? this.j1 : 0.0f);
                                    }
                                }
                            }
                            Rect rect2 = new Rect();
                            Drawable mutate2 = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                            this.r = mutate2;
                            mutate2.getPadding(rect2);
                            this.r.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.d6), PorterDuff.Mode.MULTIPLY));
                            TextPaint textPaint = new TextPaint(1);
                            textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                            textPaint.setTypeface(AndroidUtilities.bold());
                            obj = this.x1;
                            if (i13 != 1 || (obj instanceof zh1)) {
                                if ((obj instanceof zh1) || !"d".equals(((zh1) obj).a)) {
                                    i16 = 3;
                                    String[] strArr = new String[i16];
                                    int[] iArr = new int[i16];
                                    this.F0 = new org.telegram.ui.Components.a81[i16];
                                    if (i16 == 0) {
                                        this.u0 = new FrameLayout(context);
                                        if (i13 == 1 || (this.x1 instanceof zh1)) {
                                            strArr[0] = LocaleController.getString(R.string.BackgroundColors);
                                            strArr[1] = LocaleController.getString(R.string.BackgroundPattern);
                                            strArr[2] = LocaleController.getString(R.string.BackgroundMotion);
                                        } else {
                                            strArr[0] = LocaleController.getString(R.string.BackgroundBlurred);
                                            strArr[1] = LocaleController.getString(R.string.BackgroundMotion);
                                        }
                                        i17 = 0;
                                        int i27 = 0;
                                        while (i27 < i16) {
                                            int ceil = (int) Math.ceil(textPaint.measureText(strArr[i27]));
                                            iArr[i27] = ceil;
                                            i17 = Math.max(i17, ceil);
                                            i27++;
                                            rect2 = rect2;
                                        }
                                        rect = rect2;
                                        nb1 nb1Var = new nb1(this, context, 0);
                                        this.z0 = nb1Var;
                                        nb1Var.setWillNotDraw(false);
                                        this.z0.setVisibility(this.X0 != 0 ? 0 : 4);
                                        this.z0.setScaleX(this.X0 != 0 ? 1.0f : 0.1f);
                                        this.z0.setScaleY(this.X0 != 0 ? 1.0f : 0.1f);
                                        this.z0.setAlpha(this.X0 != 0 ? 1.0f : 0.0f);
                                        this.z0.setTag(this.X0 != 0 ? 1 : null);
                                        this.u0.addView(this.z0, i7.f6.e(48, 48, 17));
                                        this.z0.setOnClickListener(new ob1(this, i22));
                                        ImageView imageView = new ImageView(context);
                                        this.B0 = imageView;
                                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                                        this.B0.setImageResource(R.drawable.bg_rotate_large);
                                        this.z0.addView(this.B0, i7.f6.e(-2, -2, 17));
                                    } else {
                                        rect = rect2;
                                        i17 = 0;
                                    }
                                    i18 = 0;
                                    while (true) {
                                        pb1Var = this.a;
                                        if (i18 < i16) {
                                            break;
                                        }
                                        this.F0[i18] = new org.telegram.ui.Components.a81(context, ((i13 == 1 || (this.x1 instanceof zh1)) && i18 == 0) ? false : true, this.t0, pb1Var);
                                        this.F0[i18].setBackgroundColor(this.V0);
                                        org.telegram.ui.Components.a81 a81Var = this.F0[i18];
                                        String str = strArr[i18];
                                        int i28 = iArr[i18];
                                        a81Var.f = str;
                                        a81Var.h = i28;
                                        a81Var.n = i17;
                                        int i29 = 1;
                                        if (i13 != 1) {
                                            if (this.x1 instanceof zh1) {
                                                i29 = 1;
                                            } else {
                                                a81Var.a(i18 == 0 ? this.B1 : this.A1, false);
                                                int dp = AndroidUtilities.dp(56.0f) + i17;
                                                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dp, -2);
                                                layoutParams.gravity = 17;
                                                if (i16 != 3) {
                                                    if (i18 == 0 || i18 == 2) {
                                                        layoutParams.leftMargin = AndroidUtilities.dp(10.0f) + (dp / 2);
                                                    } else {
                                                        layoutParams.rightMargin = AndroidUtilities.dp(10.0f) + (dp / 2);
                                                    }
                                                } else if (i18 == 1) {
                                                    layoutParams.leftMargin = AndroidUtilities.dp(10.0f) + (dp / 2);
                                                } else {
                                                    layoutParams.rightMargin = AndroidUtilities.dp(10.0f) + (dp / 2);
                                                }
                                                this.u0.addView(this.F0[i18], layoutParams);
                                                final org.telegram.ui.Components.a81 a81Var2 = this.F0[i18];
                                                final int i30 = 0;
                                                a81Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.eb1
                                                    public final /* synthetic */ qc1 b;

                                                    {
                                                        this.b = this;
                                                    }

                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        switch (i30) {
                                                            case 0:
                                                                qc1 qc1Var = this.b;
                                                                int i31 = qc1Var.b;
                                                                FrameLayout[] frameLayoutArr = qc1Var.H0;
                                                                if (qc1Var.u0.getAlpha() == 1.0f && qc1Var.n1 == null) {
                                                                    int i32 = i18;
                                                                    org.telegram.ui.Components.a81 a81Var3 = a81Var2;
                                                                    if ((i31 != 1 && !(qc1Var.x1 instanceof zh1)) || i32 != 2) {
                                                                        if (i32 != 1 || (i31 != 1 && !(qc1Var.x1 instanceof zh1))) {
                                                                            if (!(qc1Var.x1 instanceof zh1)) {
                                                                                if (i31 != 1) {
                                                                                    a81Var3.a(!a81Var3.s, true);
                                                                                    if (i32 != 0) {
                                                                                        boolean z13 = a81Var3.s;
                                                                                        qc1Var.A1 = z13;
                                                                                        qc1Var.r1.c(z13);
                                                                                        qc1Var.M0();
                                                                                        break;
                                                                                    } else {
                                                                                        boolean z14 = a81Var3.s;
                                                                                        qc1Var.B1 = z14;
                                                                                        if (z14) {
                                                                                            qc1Var.t0.getImageReceiver().setForceCrossfade(true);
                                                                                        }
                                                                                        qc1Var.i1();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                qc1Var.f1(i32, frameLayoutArr[i32].getVisibility() != 0, true);
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            if (qc1Var.F0[1].s) {
                                                                                qc1Var.U0 = qc1Var.S0;
                                                                                qc1Var.t0.setImageDrawable(null);
                                                                                qc1Var.S0 = null;
                                                                                qc1Var.A1 = false;
                                                                                qc1Var.j1();
                                                                                qc1Var.M0();
                                                                                if (frameLayoutArr[1].getVisibility() == 0) {
                                                                                    if (i31 == 1) {
                                                                                        qc1Var.f1(0, true, true);
                                                                                    } else {
                                                                                        qc1Var.f1(i32, frameLayoutArr[i32].getVisibility() != 0, true);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                qc1Var.Z0(qc1Var.U0 != null ? -1 : 0);
                                                                                if (i31 == 1) {
                                                                                    qc1Var.f1(1, true, true);
                                                                                } else {
                                                                                    qc1Var.f1(i32, frameLayoutArr[i32].getVisibility() != 0, true);
                                                                                }
                                                                            }
                                                                            qc1Var.F0[1].a(qc1Var.S0 != null, true);
                                                                            qc1Var.n1();
                                                                            qc1Var.L0.f1();
                                                                            qc1Var.l1();
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        a81Var3.a(!a81Var3.s, true);
                                                                        boolean z15 = a81Var3.s;
                                                                        qc1Var.A1 = z15;
                                                                        qc1Var.r1.c(z15);
                                                                        qc1Var.M0();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                            default:
                                                                qc1 qc1Var2 = this.b;
                                                                if (qc1Var2.v0.getAlpha() == 1.0f && i18 == 0) {
                                                                    org.telegram.ui.Components.a81 a81Var4 = a81Var2;
                                                                    a81Var4.a(!a81Var4.s, true);
                                                                    qc1Var2.s.i = a81Var4.s;
                                                                    org.telegram.ui.ActionBar.g6.n1(true, true);
                                                                    qc1Var2.q0.f1();
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                });
                                                if (i18 != 2) {
                                                    this.F0[i18].setAlpha(0.0f);
                                                    this.F0[i18].setVisibility(4);
                                                }
                                                i18++;
                                            }
                                        }
                                        if (i18 == i29) {
                                            a81Var.a((this.S0 == null && (e6Var == null || TextUtils.isEmpty(e6Var.o))) ? false : true, false);
                                        } else if (i18 == 2) {
                                            a81Var.a(this.A1, false);
                                        }
                                        int dp2 = AndroidUtilities.dp(56.0f) + i17;
                                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(dp2, -2);
                                        layoutParams2.gravity = 17;
                                        if (i16 != 3) {
                                        }
                                        this.u0.addView(this.F0[i18], layoutParams2);
                                        final org.telegram.ui.Components.a81 a81Var22 = this.F0[i18];
                                        final int i302 = 0;
                                        a81Var22.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.eb1
                                            public final /* synthetic */ qc1 b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                switch (i302) {
                                                    case 0:
                                                        qc1 qc1Var = this.b;
                                                        int i31 = qc1Var.b;
                                                        FrameLayout[] frameLayoutArr = qc1Var.H0;
                                                        if (qc1Var.u0.getAlpha() == 1.0f && qc1Var.n1 == null) {
                                                            int i32 = i18;
                                                            org.telegram.ui.Components.a81 a81Var3 = a81Var22;
                                                            if ((i31 != 1 && !(qc1Var.x1 instanceof zh1)) || i32 != 2) {
                                                                if (i32 != 1 || (i31 != 1 && !(qc1Var.x1 instanceof zh1))) {
                                                                    if (!(qc1Var.x1 instanceof zh1)) {
                                                                        if (i31 != 1) {
                                                                            a81Var3.a(!a81Var3.s, true);
                                                                            if (i32 != 0) {
                                                                                boolean z13 = a81Var3.s;
                                                                                qc1Var.A1 = z13;
                                                                                qc1Var.r1.c(z13);
                                                                                qc1Var.M0();
                                                                                break;
                                                                            } else {
                                                                                boolean z14 = a81Var3.s;
                                                                                qc1Var.B1 = z14;
                                                                                if (z14) {
                                                                                    qc1Var.t0.getImageReceiver().setForceCrossfade(true);
                                                                                }
                                                                                qc1Var.i1();
                                                                                break;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        qc1Var.f1(i32, frameLayoutArr[i32].getVisibility() != 0, true);
                                                                        break;
                                                                    }
                                                                } else {
                                                                    if (qc1Var.F0[1].s) {
                                                                        qc1Var.U0 = qc1Var.S0;
                                                                        qc1Var.t0.setImageDrawable(null);
                                                                        qc1Var.S0 = null;
                                                                        qc1Var.A1 = false;
                                                                        qc1Var.j1();
                                                                        qc1Var.M0();
                                                                        if (frameLayoutArr[1].getVisibility() == 0) {
                                                                            if (i31 == 1) {
                                                                                qc1Var.f1(0, true, true);
                                                                            } else {
                                                                                qc1Var.f1(i32, frameLayoutArr[i32].getVisibility() != 0, true);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        qc1Var.Z0(qc1Var.U0 != null ? -1 : 0);
                                                                        if (i31 == 1) {
                                                                            qc1Var.f1(1, true, true);
                                                                        } else {
                                                                            qc1Var.f1(i32, frameLayoutArr[i32].getVisibility() != 0, true);
                                                                        }
                                                                    }
                                                                    qc1Var.F0[1].a(qc1Var.S0 != null, true);
                                                                    qc1Var.n1();
                                                                    qc1Var.L0.f1();
                                                                    qc1Var.l1();
                                                                    break;
                                                                }
                                                            } else {
                                                                a81Var3.a(!a81Var3.s, true);
                                                                boolean z15 = a81Var3.s;
                                                                qc1Var.A1 = z15;
                                                                qc1Var.r1.c(z15);
                                                                qc1Var.M0();
                                                                break;
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        qc1 qc1Var2 = this.b;
                                                        if (qc1Var2.v0.getAlpha() == 1.0f && i18 == 0) {
                                                            org.telegram.ui.Components.a81 a81Var4 = a81Var22;
                                                            a81Var4.a(!a81Var4.s, true);
                                                            qc1Var2.s.i = a81Var4.s;
                                                            org.telegram.ui.ActionBar.g6.n1(true, true);
                                                            qc1Var2.q0.f1();
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        if (i18 != 2) {
                                        }
                                        i18++;
                                    }
                                    if (i13 == 1) {
                                        int[] iArr2 = new int[2];
                                        this.G0 = new org.telegram.ui.Components.a81[2];
                                        this.v0 = new FrameLayout(context);
                                        String[] strArr2 = {LocaleController.getString(R.string.BackgroundAnimate), LocaleController.getString(R.string.BackgroundColors)};
                                        int i31 = 0;
                                        int i32 = 0;
                                        for (int i33 = 2; i31 < i33; i33 = 2) {
                                            int ceil2 = (int) Math.ceil(textPaint.measureText(strArr2[i31]));
                                            iArr2[i31] = ceil2;
                                            i32 = Math.max(i32, ceil2);
                                            i31++;
                                        }
                                        if (e6Var != null) {
                                            nb1 nb1Var2 = new nb1(this, context, 1);
                                            this.A0 = nb1Var2;
                                            nb1Var2.setWillNotDraw(false);
                                            this.A0.setVisibility(e6Var.f != 0 ? 0 : 4);
                                            this.A0.setScaleX(e6Var.f != 0 ? 1.0f : 0.1f);
                                            this.A0.setScaleY(e6Var.f != 0 ? 1.0f : 0.1f);
                                            this.A0.setAlpha(e6Var.f != 0 ? 1.0f : 0.0f);
                                            this.v0.addView(this.A0, i7.f6.e(48, 48, 17));
                                            this.A0.setOnClickListener(new ob1(this, 1));
                                            ImageView imageView2 = new ImageView(context);
                                            this.C0 = imageView2;
                                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                                            this.C0.setImageResource(R.drawable.bg_rotate_large);
                                            this.A0.addView(this.C0, i7.f6.e(-2, -2, 17));
                                            final int i34 = 0;
                                            while (i34 < 2) {
                                                this.G0[i34] = new org.telegram.ui.Components.a81(context, i34 == 0, this.t0, pb1Var);
                                                org.telegram.ui.Components.a81 a81Var3 = this.G0[i34];
                                                String str2 = strArr2[i34];
                                                int i35 = iArr2[i34];
                                                a81Var3.f = str2;
                                                a81Var3.h = i35;
                                                a81Var3.n = i32;
                                                if (i34 == 0) {
                                                    a81Var3.a(e6Var.i, false);
                                                }
                                                int dp3 = AndroidUtilities.dp(56.0f) + i32;
                                                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(dp3, -2);
                                                layoutParams3.gravity = 17;
                                                if (i34 == 1) {
                                                    layoutParams3.leftMargin = AndroidUtilities.dp(10.0f) + (dp3 / 2);
                                                } else {
                                                    layoutParams3.rightMargin = AndroidUtilities.dp(10.0f) + (dp3 / 2);
                                                }
                                                this.v0.addView(this.G0[i34], layoutParams3);
                                                final org.telegram.ui.Components.a81 a81Var4 = this.G0[i34];
                                                final int i36 = 1;
                                                a81Var4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.eb1
                                                    public final /* synthetic */ qc1 b;

                                                    {
                                                        this.b = this;
                                                    }

                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        switch (i36) {
                                                            case 0:
                                                                qc1 qc1Var = this.b;
                                                                int i312 = qc1Var.b;
                                                                FrameLayout[] frameLayoutArr = qc1Var.H0;
                                                                if (qc1Var.u0.getAlpha() == 1.0f && qc1Var.n1 == null) {
                                                                    int i322 = i34;
                                                                    org.telegram.ui.Components.a81 a81Var32 = a81Var4;
                                                                    if ((i312 != 1 && !(qc1Var.x1 instanceof zh1)) || i322 != 2) {
                                                                        if (i322 != 1 || (i312 != 1 && !(qc1Var.x1 instanceof zh1))) {
                                                                            if (!(qc1Var.x1 instanceof zh1)) {
                                                                                if (i312 != 1) {
                                                                                    a81Var32.a(!a81Var32.s, true);
                                                                                    if (i322 != 0) {
                                                                                        boolean z13 = a81Var32.s;
                                                                                        qc1Var.A1 = z13;
                                                                                        qc1Var.r1.c(z13);
                                                                                        qc1Var.M0();
                                                                                        break;
                                                                                    } else {
                                                                                        boolean z14 = a81Var32.s;
                                                                                        qc1Var.B1 = z14;
                                                                                        if (z14) {
                                                                                            qc1Var.t0.getImageReceiver().setForceCrossfade(true);
                                                                                        }
                                                                                        qc1Var.i1();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                qc1Var.f1(i322, frameLayoutArr[i322].getVisibility() != 0, true);
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            if (qc1Var.F0[1].s) {
                                                                                qc1Var.U0 = qc1Var.S0;
                                                                                qc1Var.t0.setImageDrawable(null);
                                                                                qc1Var.S0 = null;
                                                                                qc1Var.A1 = false;
                                                                                qc1Var.j1();
                                                                                qc1Var.M0();
                                                                                if (frameLayoutArr[1].getVisibility() == 0) {
                                                                                    if (i312 == 1) {
                                                                                        qc1Var.f1(0, true, true);
                                                                                    } else {
                                                                                        qc1Var.f1(i322, frameLayoutArr[i322].getVisibility() != 0, true);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                qc1Var.Z0(qc1Var.U0 != null ? -1 : 0);
                                                                                if (i312 == 1) {
                                                                                    qc1Var.f1(1, true, true);
                                                                                } else {
                                                                                    qc1Var.f1(i322, frameLayoutArr[i322].getVisibility() != 0, true);
                                                                                }
                                                                            }
                                                                            qc1Var.F0[1].a(qc1Var.S0 != null, true);
                                                                            qc1Var.n1();
                                                                            qc1Var.L0.f1();
                                                                            qc1Var.l1();
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        a81Var32.a(!a81Var32.s, true);
                                                                        boolean z15 = a81Var32.s;
                                                                        qc1Var.A1 = z15;
                                                                        qc1Var.r1.c(z15);
                                                                        qc1Var.M0();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                            default:
                                                                qc1 qc1Var2 = this.b;
                                                                if (qc1Var2.v0.getAlpha() == 1.0f && i34 == 0) {
                                                                    org.telegram.ui.Components.a81 a81Var42 = a81Var4;
                                                                    a81Var42.a(!a81Var42.s, true);
                                                                    qc1Var2.s.i = a81Var42.s;
                                                                    org.telegram.ui.ActionBar.g6.n1(true, true);
                                                                    qc1Var2.q0.f1();
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                });
                                                i34++;
                                            }
                                        }
                                    }
                                    if (i13 != 1 || (this.x1 instanceof zh1)) {
                                        this.B1 = false;
                                        i19 = 0;
                                        while (i19 < 2) {
                                            Rect rect3 = rect;
                                            qb1 qb1Var = new qb1(this, context, i19, rect3);
                                            ViewGroup[] viewGroupArr = this.H0;
                                            viewGroupArr[i19] = qb1Var;
                                            if (i19 == 1 || i13 == 2) {
                                                qb1Var.setVisibility(4);
                                            }
                                            viewGroupArr[i19].setWillNotDraw(false);
                                            FrameLayout.LayoutParams e10 = i13 == 2 ? i7.f6.e(-1, i19 == 0 ? 321 : 316, 83) : i7.f6.e(-1, i19 == 0 ? 273 : 316, 83);
                                            e10.height = AndroidUtilities.dp(i19 == 0 ? i13 == 2 ? 321 : 273 : 316.0f);
                                            if (U0()) {
                                                e10.height += AndroidUtilities.navigationBarHeight;
                                            }
                                            if (i19 == 0) {
                                                Drawable drawable = this.r;
                                                Rect rect4 = AndroidUtilities.rectTmp2;
                                                drawable.getPadding(rect4);
                                                e10.height = AndroidUtilities.dp(12.0f) + rect4.top + e10.height;
                                            }
                                            viewGroupArr[i19].setPadding(0, i19 == 0 ? AndroidUtilities.dp(12.0f) + rect3.top : 0, 0, U0() ? AndroidUtilities.navigationBarHeight : 0);
                                            this.p0.addView(viewGroupArr[i19], e10);
                                            if (i19 == 1 || i13 == 2) {
                                                bg.d1 d1Var = new bg.d1(this, context, 28);
                                                ViewGroup[] viewGroupArr2 = this.K0;
                                                viewGroupArr2[i19] = d1Var;
                                                d1Var.setWillNotDraw(false);
                                                viewGroupArr2[i19].setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
                                                viewGroupArr2[i19].setClickable(true);
                                                f10 = 21.0f;
                                                viewGroupArr[i19].addView(viewGroupArr2[i19], i7.f6.e(-1, 51, 80));
                                                TextView textView3 = new TextView(context);
                                                TextView[] textViewArr = this.I0;
                                                textViewArr[i19] = textView3;
                                                textView3.setTextSize(1, 15.0f);
                                                textViewArr[i19].setTypeface(AndroidUtilities.bold());
                                                TextView textView4 = textViewArr[i19];
                                                int i37 = org.telegram.ui.ActionBar.g6.Ae;
                                                textView4.setTextColor(getThemedColor(i37));
                                                textViewArr[i19].setText(LocaleController.getString(R.string.Cancel));
                                                textViewArr[i19].setGravity(17);
                                                textViewArr[i19].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                                                TextView textView5 = textViewArr[i19];
                                                int i38 = org.telegram.ui.ActionBar.g6.i6;
                                                textView5.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.e0(getThemedColor(i38), 0));
                                                rect = rect3;
                                                viewGroupArr2[i19].addView(textViewArr[i19], i7.f6.e(-2, -1, 51));
                                                final int i39 = 0;
                                                textViewArr[i19].setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ib1
                                                    public final /* synthetic */ qc1 b;

                                                    {
                                                        this.b = this;
                                                    }

                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        switch (i39) {
                                                            case 0:
                                                                qc1 qc1Var = this.b;
                                                                if (qc1Var.n1 == null) {
                                                                    int i40 = i19;
                                                                    if (i40 == 0) {
                                                                        qc1Var.d1 = qc1Var.e1;
                                                                        qc1Var.a1(qc1Var.c1, 3, true);
                                                                        qc1Var.a1(qc1Var.b1, 2, true);
                                                                        qc1Var.a1(qc1Var.a1, 1, true);
                                                                        qc1Var.a1(qc1Var.W0, 0, true);
                                                                    } else {
                                                                        TLRPC.TL_wallPaper tL_wallPaper2 = qc1Var.T0;
                                                                        qc1Var.S0 = tL_wallPaper2;
                                                                        if (tL_wallPaper2 == null) {
                                                                            qc1Var.t0.setImageDrawable(null);
                                                                        } else {
                                                                            fc1 fc1Var2 = qc1Var.t0;
                                                                            ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                                                                            String str3 = qc1Var.C1;
                                                                            TLRPC.TL_wallPaper tL_wallPaper3 = qc1Var.S0;
                                                                            fc1Var2.k(forDocument, str3, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                                                                        }
                                                                        qc1Var.F0[1].a(qc1Var.S0 != null, false);
                                                                        float f11 = qc1Var.i1;
                                                                        qc1Var.h1 = f11;
                                                                        qc1Var.P0.setProgress(f11);
                                                                        qc1Var.t0.getImageReceiver().setAlpha(qc1Var.h1);
                                                                        qc1Var.j1();
                                                                        qc1Var.n1();
                                                                    }
                                                                    if (qc1Var.b != 2) {
                                                                        if (qc1Var.S0 == null) {
                                                                            if (qc1Var.A1) {
                                                                                qc1Var.A1 = false;
                                                                                qc1Var.F0[0].a(false, true);
                                                                                qc1Var.M0();
                                                                            }
                                                                            qc1Var.l1();
                                                                        }
                                                                        qc1Var.f1(0, true, true);
                                                                        break;
                                                                    } else {
                                                                        qc1Var.f1(i40, false, true);
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                            default:
                                                                qc1 qc1Var2 = this.b;
                                                                if (qc1Var2.n1 == null) {
                                                                    if (qc1Var2.b != 2) {
                                                                        qc1Var2.f1(0, true, true);
                                                                        break;
                                                                    } else {
                                                                        qc1Var2.f1(i19, false, true);
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    }
                                                });
                                                TextView textView6 = new TextView(context);
                                                TextView[] textViewArr2 = this.J0;
                                                textViewArr2[i19] = textView6;
                                                textView6.setTextSize(1, 15.0f);
                                                textViewArr2[i19].setTypeface(AndroidUtilities.bold());
                                                textViewArr2[i19].setTextColor(getThemedColor(i37));
                                                textViewArr2[i19].setText(LocaleController.getString(R.string.ApplyTheme));
                                                textViewArr2[i19].setGravity(17);
                                                textViewArr2[i19].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                                                textViewArr2[i19].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.e0(getThemedColor(i38), 0));
                                                viewGroupArr2[i19].addView(textViewArr2[i19], i7.f6.e(-2, -1, 53));
                                                TextView textView7 = textViewArr2[i19];
                                                r12 = 1;
                                                final char c3 = 1 == true ? 1 : 0;
                                                textView7.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ib1
                                                    public final /* synthetic */ qc1 b;

                                                    {
                                                        this.b = this;
                                                    }

                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        switch (c3) {
                                                            case 0:
                                                                qc1 qc1Var = this.b;
                                                                if (qc1Var.n1 == null) {
                                                                    int i40 = i19;
                                                                    if (i40 == 0) {
                                                                        qc1Var.d1 = qc1Var.e1;
                                                                        qc1Var.a1(qc1Var.c1, 3, true);
                                                                        qc1Var.a1(qc1Var.b1, 2, true);
                                                                        qc1Var.a1(qc1Var.a1, 1, true);
                                                                        qc1Var.a1(qc1Var.W0, 0, true);
                                                                    } else {
                                                                        TLRPC.TL_wallPaper tL_wallPaper2 = qc1Var.T0;
                                                                        qc1Var.S0 = tL_wallPaper2;
                                                                        if (tL_wallPaper2 == null) {
                                                                            qc1Var.t0.setImageDrawable(null);
                                                                        } else {
                                                                            fc1 fc1Var2 = qc1Var.t0;
                                                                            ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                                                                            String str3 = qc1Var.C1;
                                                                            TLRPC.TL_wallPaper tL_wallPaper3 = qc1Var.S0;
                                                                            fc1Var2.k(forDocument, str3, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                                                                        }
                                                                        qc1Var.F0[1].a(qc1Var.S0 != null, false);
                                                                        float f11 = qc1Var.i1;
                                                                        qc1Var.h1 = f11;
                                                                        qc1Var.P0.setProgress(f11);
                                                                        qc1Var.t0.getImageReceiver().setAlpha(qc1Var.h1);
                                                                        qc1Var.j1();
                                                                        qc1Var.n1();
                                                                    }
                                                                    if (qc1Var.b != 2) {
                                                                        if (qc1Var.S0 == null) {
                                                                            if (qc1Var.A1) {
                                                                                qc1Var.A1 = false;
                                                                                qc1Var.F0[0].a(false, true);
                                                                                qc1Var.M0();
                                                                            }
                                                                            qc1Var.l1();
                                                                        }
                                                                        qc1Var.f1(0, true, true);
                                                                        break;
                                                                    } else {
                                                                        qc1Var.f1(i40, false, true);
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                            default:
                                                                qc1 qc1Var2 = this.b;
                                                                if (qc1Var2.n1 == null) {
                                                                    if (qc1Var2.b != 2) {
                                                                        qc1Var2.f1(0, true, true);
                                                                        break;
                                                                    } else {
                                                                        qc1Var2.f1(i19, false, true);
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    }
                                                });
                                            } else {
                                                rect = rect3;
                                                r12 = 1;
                                                f10 = 21.0f;
                                            }
                                            if (i19 == r12) {
                                                TextView textView8 = new TextView(context);
                                                this.a2 = textView8;
                                                textView8.setLines(r12);
                                                this.a2.setSingleLine(r12);
                                                this.a2.setText(LocaleController.getString(R.string.BackgroundChoosePattern));
                                                this.a2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.G6));
                                                this.a2.setTextSize(r12, 20.0f);
                                                this.a2.setTypeface(AndroidUtilities.bold());
                                                this.a2.setPadding(AndroidUtilities.dp(f10), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(f10), AndroidUtilities.dp(8.0f));
                                                this.a2.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                                                this.a2.setGravity(16);
                                                viewGroupArr[i19].addView(this.a2, i7.f6.d(-1, 48.0f, 51, 0.0f, 21.0f, 0.0f, 0.0f));
                                                wa1 wa1Var = new wa1(context);
                                                this.L0 = wa1Var;
                                                f2.j0 j0Var = new f2.j0(0, false);
                                                this.N0 = j0Var;
                                                wa1Var.setLayoutManager(j0Var);
                                                wa1 wa1Var2 = this.L0;
                                                oc1 oc1Var = new oc1(context, this);
                                                this.M0 = oc1Var;
                                                wa1Var2.setAdapter(oc1Var);
                                                this.L0.i(new lh.j(7));
                                                viewGroupArr[i19].addView(this.L0, i7.f6.d(-1, 100.0f, 51, 0.0f, 76.0f, 0.0f, 0.0f));
                                                this.L0.setOnItemClickListener(new d21(this, 6));
                                                org.telegram.ui.Cells.k4 k4Var = new org.telegram.ui.Cells.k4(context);
                                                this.O0 = k4Var;
                                                k4Var.setText(LocaleController.getString(R.string.BackgroundIntensity));
                                                viewGroupArr[i19].addView(this.O0, i7.f6.d(-1, -2.0f, 51, 0.0f, 175.0f, 0.0f, 0.0f));
                                                org.telegram.ui.Cells.j0 j0Var2 = new org.telegram.ui.Cells.j0(context, (pb1) getResourceProvider());
                                                this.P0 = j0Var2;
                                                j0Var2.setProgress(this.h1);
                                                this.P0.setReportChanges(true);
                                                this.P0.setDelegate(new rb1(this));
                                                viewGroupArr[i19].addView(this.P0, i7.f6.d(-1, 38.0f, 51, 5.0f, 211.0f, 5.0f, 0.0f));
                                            } else {
                                                org.telegram.ui.Components.gq gqVar = new org.telegram.ui.Components.gq(context, this.c0, new sb1(this));
                                                this.R = gqVar;
                                                gqVar.setResourcesProvider(getResourceProvider());
                                                if (i13 == 1) {
                                                    viewGroupArr[i19].addView(this.R, i7.f6.e(-1, -1, 1));
                                                    if (f6Var.q()) {
                                                        this.R.setMinBrightness(0.2f);
                                                    } else {
                                                        this.R.setMinBrightness(0.05f);
                                                        this.R.setMaxBrightness(0.8f);
                                                    }
                                                    if (e6Var != null) {
                                                        int i40 = e6Var.d != 0 ? 2 : 1;
                                                        org.telegram.ui.Components.gq gqVar2 = this.R;
                                                        T0(1);
                                                        gqVar2.f(1, 2, i40, false);
                                                        this.R.e(e6Var.c, 0);
                                                        int i41 = e6Var.d;
                                                        if (i41 != 0) {
                                                            this.R.e(i41, 1);
                                                        }
                                                    }
                                                } else {
                                                    viewGroupArr[i19].addView(this.R, i7.f6.d(-1, -1.0f, 1, 0.0f, 0.0f, 0.0f, 48.0f));
                                                }
                                            }
                                            i19++;
                                        }
                                    }
                                    j1();
                                    if (!this.t0.getImageReceiver().hasBitmapImage()) {
                                        this.p0.setBackgroundColor(-16777216);
                                    }
                                    if (i13 != 1 && !(this.x1 instanceof zh1)) {
                                        this.t0.getImageReceiver().setCrossfadeWithOldImage(true);
                                    }
                                }
                                i16 = 0;
                                String[] strArr3 = new String[i16];
                                int[] iArr3 = new int[i16];
                                this.F0 = new org.telegram.ui.Components.a81[i16];
                                if (i16 == 0) {
                                }
                                i18 = 0;
                                while (true) {
                                    pb1Var = this.a;
                                    if (i18 < i16) {
                                    }
                                    i18++;
                                }
                                if (i13 == 1) {
                                }
                                if (i13 != 1) {
                                }
                                this.B1 = false;
                                i19 = 0;
                                while (i19 < 2) {
                                }
                                j1();
                                if (!this.t0.getImageReceiver().hasBitmapImage()) {
                                }
                                if (i13 != 1) {
                                    this.t0.getImageReceiver().setCrossfadeWithOldImage(true);
                                }
                            } else {
                                if (!(obj instanceof ai1) || !"t".equals(((ai1) obj).a)) {
                                    i16 = 2;
                                    String[] strArr32 = new String[i16];
                                    int[] iArr32 = new int[i16];
                                    this.F0 = new org.telegram.ui.Components.a81[i16];
                                    if (i16 == 0) {
                                    }
                                    i18 = 0;
                                    while (true) {
                                        pb1Var = this.a;
                                        if (i18 < i16) {
                                        }
                                        i18++;
                                    }
                                    if (i13 == 1) {
                                    }
                                    if (i13 != 1) {
                                    }
                                    this.B1 = false;
                                    i19 = 0;
                                    while (i19 < 2) {
                                    }
                                    j1();
                                    if (!this.t0.getImageReceiver().hasBitmapImage()) {
                                    }
                                    if (i13 != 1) {
                                    }
                                }
                                i16 = 0;
                                String[] strArr322 = new String[i16];
                                int[] iArr322 = new int[i16];
                                this.F0 = new org.telegram.ui.Components.a81[i16];
                                if (i16 == 0) {
                                }
                                i18 = 0;
                                while (true) {
                                    pb1Var = this.a;
                                    if (i18 < i16) {
                                    }
                                    i18++;
                                }
                                if (i13 == 1) {
                                }
                                if (i13 != 1) {
                                }
                                this.B1 = false;
                                i19 = 0;
                                while (i19 < 2) {
                                }
                                j1();
                                if (!this.t0.getImageReceiver().hasBitmapImage()) {
                                }
                                if (i13 != 1) {
                                }
                            }
                        }
                        this.q0.setAdapter(this.r0);
                        bg.d1 d1Var2 = new bg.d1(this, context, 29);
                        this.g0 = d1Var2;
                        d1Var2.setWillNotDraw(false);
                        bg.d1 d1Var3 = this.g0;
                        this.fragmentView = d1Var3;
                        ViewTreeObserver viewTreeObserver = d1Var3.getViewTreeObserver();
                        p90 p90Var = new p90(this, 1);
                        this.M = p90Var;
                        viewTreeObserver.addOnGlobalLayoutListener(p90Var);
                        m2.g gVar = new m2.g(context);
                        this.f0 = gVar;
                        int i42 = 2;
                        gVar.b(new q2(this, i42));
                        this.f0.setAdapter(new cg.k1(this, i42));
                        AndroidUtilities.setViewPagerEdgeEffectColor(this.f0, getThemedColor(org.telegram.ui.ActionBar.g6.s8));
                        this.g0.addView(this.f0, i7.f6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i13 == 0 ? 48.0f : 0.0f));
                        UndoView undoView = new UndoView(context, this);
                        this.h0 = undoView;
                        undoView.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
                        this.g0.addView(this.h0, i7.f6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
                        if (i13 == 0) {
                            View view = new View(context);
                            view.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.V5));
                            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, 1, 83);
                            layoutParams4.bottomMargin = AndroidUtilities.dp(48.0f);
                            this.g0.addView(view, layoutParams4);
                            FrameLayout frameLayout = new FrameLayout(context);
                            this.X = frameLayout;
                            int i43 = org.telegram.ui.ActionBar.g6.d6;
                            boolean z13 = this.d;
                            frameLayout.setBackgroundColor(z13 ? org.telegram.ui.ActionBar.g6.C0(i43) : getThemedColor(i43));
                            this.g0.addView(this.X, i7.f6.e(-1, 48, 83));
                            cg.i0 i0Var = new cg.i0(context, this);
                            this.W = i0Var;
                            this.X.addView(i0Var, i7.f6.e(22, 8, 17));
                            TextView textView9 = new TextView(context);
                            this.Z = textView9;
                            textView9.setTextSize(1, 14.0f);
                            TextView textView10 = this.Z;
                            int i44 = org.telegram.ui.ActionBar.g6.Ae;
                            textView10.setTextColor(z13 ? org.telegram.ui.ActionBar.g6.C0(i44) : getThemedColor(i44));
                            this.Z.setGravity(17);
                            this.Z.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.e0(251658240, 0));
                            this.Z.setPadding(AndroidUtilities.dp(29.0f), 0, AndroidUtilities.dp(29.0f), 0);
                            this.Z.setText(LocaleController.getString(R.string.Cancel));
                            this.Z.setTypeface(AndroidUtilities.bold());
                            this.X.addView(this.Z, i7.f6.e(-2, -1, 51));
                            final int i45 = 0;
                            this.Z.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.cb1
                                public final /* synthetic */ qc1 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    switch (i45) {
                                        case 0:
                                            this.b.O0(false);
                                            break;
                                        case 1:
                                            qc1.U(this.b);
                                            break;
                                        case 2:
                                            this.b.e.M(null, null);
                                            break;
                                        case 3:
                                            this.b.N0(false);
                                            break;
                                        default:
                                            this.b.N0(true);
                                            break;
                                    }
                                }
                            });
                            TextView textView11 = new TextView(context);
                            this.Y = textView11;
                            textView11.setTextSize(1, 14.0f);
                            this.Y.setTextColor(z13 ? org.telegram.ui.ActionBar.g6.C0(i44) : getThemedColor(i44));
                            this.Y.setGravity(17);
                            this.Y.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.e0(251658240, 0));
                            this.Y.setPadding(AndroidUtilities.dp(29.0f), 0, AndroidUtilities.dp(29.0f), 0);
                            this.Y.setText(LocaleController.getString(R.string.ApplyTheme));
                            this.Y.setTypeface(AndroidUtilities.bold());
                            this.X.addView(this.Y, i7.f6.e(-2, -1, 53));
                            i20 = 1;
                            this.Y.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.cb1
                                public final /* synthetic */ qc1 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    switch (i20) {
                                        case 0:
                                            this.b.O0(false);
                                            break;
                                        case 1:
                                            qc1.U(this.b);
                                            break;
                                        case 2:
                                            this.b.e.M(null, null);
                                            break;
                                        case 3:
                                            this.b.N0(false);
                                            break;
                                        default:
                                            this.b.N0(true);
                                            break;
                                    }
                                }
                            });
                        } else {
                            i20 = 1;
                        }
                        if (i13 == i20 && !org.telegram.ui.ActionBar.g6.Z0() && e6Var != null && e6Var.j != 4294967296L) {
                            X0();
                        }
                        this.e0 = S0();
                        b1(true);
                        m1(false);
                        this.c = new Scroller(getContext());
                        b5Var2 = this.parentLayout;
                        if (b5Var2 != null && b5Var2.getBottomSheet() != null) {
                            this.parentLayout.getBottomSheet().fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.g6.h5));
                            if (i13 == 2 && this.F1 != 0) {
                                this.parentLayout.getBottomSheet().setOverlayNavBarColor(-16777216);
                            }
                        }
                        return this.fragmentView;
                    }
                    this.o0.setSubtitle(LocaleController.formatPluralString("ThemeInstallCount", i14, new Object[0]));
                }
            }
            this.q0 = new jb1(context, this);
            kb1 kb1Var2 = new kb1(this);
            kb1Var2.S();
            this.q0.setItemAnimator(kb1Var2);
            this.q0.setVerticalScrollBarEnabled(true);
            this.q0.setOverScrollMode(2);
            if (i13 == 2) {
            }
            this.q0.setClipToPadding(false);
            this.q0.setLayoutManager(new f2.j0(1, true));
            this.q0.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
            if (i13 == 1) {
            }
            this.q0.setOnScrollListener(new lb1(this, i22));
            this.p0.addView(this.o0, i7.f6.c(-2.0f, i15));
            org.telegram.ui.Components.c81 c81Var2 = new org.telegram.ui.Components.c81(context);
            this.r1 = c81Var2;
            c81Var2.b(new db1(this, 2));
            org.telegram.ui.ActionBar.e6 e6Var2 = this.s;
            if (i13 != 1) {
            }
            if (i13 == 2) {
            }
            Rect rect22 = new Rect();
            Drawable mutate22 = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
            this.r = mutate22;
            mutate22.getPadding(rect22);
            this.r.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.d6), PorterDuff.Mode.MULTIPLY));
            TextPaint textPaint2 = new TextPaint(1);
            textPaint2.setTextSize(AndroidUtilities.dp(14.0f));
            textPaint2.setTypeface(AndroidUtilities.bold());
            obj = this.x1;
            if (i13 != 1) {
            }
            if (obj instanceof zh1) {
            }
            i16 = 3;
            String[] strArr3222 = new String[i16];
            int[] iArr3222 = new int[i16];
            this.F0 = new org.telegram.ui.Components.a81[i16];
            if (i16 == 0) {
            }
            i18 = 0;
            while (true) {
                pb1Var = this.a;
                if (i18 < i16) {
                }
                i18++;
            }
            if (i13 == 1) {
            }
            if (i13 != 1) {
            }
            this.B1 = false;
            i19 = 0;
            while (i19 < 2) {
            }
            j1();
            if (!this.t0.getImageReceiver().hasBitmapImage()) {
            }
            if (i13 != 1) {
            }
            this.q0.setAdapter(this.r0);
            bg.d1 d1Var22 = new bg.d1(this, context, 29);
            this.g0 = d1Var22;
            d1Var22.setWillNotDraw(false);
            bg.d1 d1Var32 = this.g0;
            this.fragmentView = d1Var32;
            ViewTreeObserver viewTreeObserver2 = d1Var32.getViewTreeObserver();
            p90 p90Var2 = new p90(this, 1);
            this.M = p90Var2;
            viewTreeObserver2.addOnGlobalLayoutListener(p90Var2);
            m2.g gVar2 = new m2.g(context);
            this.f0 = gVar2;
            int i422 = 2;
            gVar2.b(new q2(this, i422));
            this.f0.setAdapter(new cg.k1(this, i422));
            AndroidUtilities.setViewPagerEdgeEffectColor(this.f0, getThemedColor(org.telegram.ui.ActionBar.g6.s8));
            this.g0.addView(this.f0, i7.f6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i13 == 0 ? 48.0f : 0.0f));
            UndoView undoView2 = new UndoView(context, this);
            this.h0 = undoView2;
            undoView2.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
            this.g0.addView(this.h0, i7.f6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            if (i13 == 0) {
            }
            if (i13 == i20) {
                X0();
            }
            this.e0 = S0();
            b1(true);
            m1(false);
            this.c = new Scroller(getContext());
            b5Var2 = this.parentLayout;
            if (b5Var2 != null) {
                this.parentLayout.getBottomSheet().fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.g6.h5));
                if (i13 == 2) {
                    this.parentLayout.getBottomSheet().setOverlayNavBarColor(-16777216);
                }
            }
            return this.fragmentView;
        }
        z10 = false;
        this.I1 = z10;
        if (z10) {
        }
        b5Var = this.parentLayout;
        if (b5Var != null) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.i0 = new FrameLayout(context);
        i10 = 3;
        if (this.I1) {
            AndroidUtilities.runOnUIThread(new bb1(this, i10), 2000L);
        }
        org.telegram.ui.ActionBar.w0 a22 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a22.F();
        a22.D = new ac1();
        a22.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c5());
        this.actionBar.setAddToContainer(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.ThemePreview));
        n0 n0Var2 = new n0(this, context, 24);
        this.i0 = n0Var2;
        n0Var2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.d6));
        this.i0.addView(this.actionBar, i7.f6.c(-2.0f, -1));
        org.telegram.ui.Components.jl0 jl0Var3 = new org.telegram.ui.Components.jl0(context);
        this.j0 = jl0Var3;
        jl0Var3.setVerticalScrollBarEnabled(true);
        this.j0.setItemAnimator(null);
        this.j0.setLayoutAnimation(null);
        this.j0.setLayoutManager(new f2.j0(1, false));
        this.j0.setVerticalScrollbarPosition(!LocaleController.isRTL ? 1 : 2);
        org.telegram.ui.Components.jl0 jl0Var22 = this.j0;
        i11 = this.b;
        jl0Var22.setPadding(0, 0, 0, AndroidUtilities.dp(i11 == 0 ? 12.0f : 0.0f));
        final int i232 = 4;
        this.j0.setOnItemClickListener(new ih.a(i232));
        this.i0.addView(this.j0, i7.f6.e(-1, -1, 51));
        org.telegram.ui.Components.u10 u10Var2 = new org.telegram.ui.Components.u10(context, this.resourceProvider);
        this.l0 = u10Var2;
        u10Var2.setImageResource(R.drawable.floating_pencil);
        this.i0.addView(this.l0, org.telegram.ui.Components.u10.b());
        ic1 ic1Var2 = new ic1(context);
        this.k0 = ic1Var2;
        this.j0.setAdapter(ic1Var2);
        this.p0 = new org.telegram.ui.ActionBar.r0(this, context, i10);
        this.r0 = new mc1(context, this);
        this.o0 = createActionBar(context);
        if (AndroidUtilities.isTablet()) {
        }
        th.y(false, this.o0);
        this.o0.setActionBarMenuOnItemClick(new ec1(this));
        i12 = 0;
        while (true) {
            fc1VarArr = this.s0;
            if (i12 < 2) {
            }
            fc1VarArr[i12] = new fc1(this, (Activity) getContext());
            this.p0.addView(fc1VarArr[i12], i7.f6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
            i12++;
        }
        fc1 fc1Var2 = fc1VarArr[0];
        this.t0 = fc1Var2;
        fc1Var2.setVisibility(0);
        fc1VarArr[1].setVisibility(8);
        if (i11 == 2) {
        }
        z11 = this.r0.e;
        org.telegram.ui.ActionBar.f6 f6Var2 = this.a0;
        if (!z11) {
        }
        this.q0 = new jb1(context, this);
        kb1 kb1Var22 = new kb1(this);
        kb1Var22.S();
        this.q0.setItemAnimator(kb1Var22);
        this.q0.setVerticalScrollBarEnabled(true);
        this.q0.setOverScrollMode(2);
        if (i13 == 2) {
        }
        this.q0.setClipToPadding(false);
        this.q0.setLayoutManager(new f2.j0(1, true));
        this.q0.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        if (i13 == 1) {
        }
        this.q0.setOnScrollListener(new lb1(this, i22));
        this.p0.addView(this.o0, i7.f6.c(-2.0f, i15));
        org.telegram.ui.Components.c81 c81Var22 = new org.telegram.ui.Components.c81(context);
        this.r1 = c81Var22;
        c81Var22.b(new db1(this, 2));
        org.telegram.ui.ActionBar.e6 e6Var22 = this.s;
        if (i13 != 1) {
        }
        if (i13 == 2) {
        }
        Rect rect222 = new Rect();
        Drawable mutate222 = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.r = mutate222;
        mutate222.getPadding(rect222);
        this.r.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.d6), PorterDuff.Mode.MULTIPLY));
        TextPaint textPaint22 = new TextPaint(1);
        textPaint22.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint22.setTypeface(AndroidUtilities.bold());
        obj = this.x1;
        if (i13 != 1) {
        }
        if (obj instanceof zh1) {
        }
        i16 = 3;
        String[] strArr32222 = new String[i16];
        int[] iArr32222 = new int[i16];
        this.F0 = new org.telegram.ui.Components.a81[i16];
        if (i16 == 0) {
        }
        i18 = 0;
        while (true) {
            pb1Var = this.a;
            if (i18 < i16) {
            }
            i18++;
        }
        if (i13 == 1) {
        }
        if (i13 != 1) {
        }
        this.B1 = false;
        i19 = 0;
        while (i19 < 2) {
        }
        j1();
        if (!this.t0.getImageReceiver().hasBitmapImage()) {
        }
        if (i13 != 1) {
        }
        this.q0.setAdapter(this.r0);
        bg.d1 d1Var222 = new bg.d1(this, context, 29);
        this.g0 = d1Var222;
        d1Var222.setWillNotDraw(false);
        bg.d1 d1Var322 = this.g0;
        this.fragmentView = d1Var322;
        ViewTreeObserver viewTreeObserver22 = d1Var322.getViewTreeObserver();
        p90 p90Var22 = new p90(this, 1);
        this.M = p90Var22;
        viewTreeObserver22.addOnGlobalLayoutListener(p90Var22);
        m2.g gVar22 = new m2.g(context);
        this.f0 = gVar22;
        int i4222 = 2;
        gVar22.b(new q2(this, i4222));
        this.f0.setAdapter(new cg.k1(this, i4222));
        AndroidUtilities.setViewPagerEdgeEffectColor(this.f0, getThemedColor(org.telegram.ui.ActionBar.g6.s8));
        this.g0.addView(this.f0, i7.f6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i13 == 0 ? 48.0f : 0.0f));
        UndoView undoView22 = new UndoView(context, this);
        this.h0 = undoView22;
        undoView22.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
        this.g0.addView(this.h0, i7.f6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        if (i13 == 0) {
        }
        if (i13 == i20) {
        }
        this.e0 = S0();
        b1(true);
        m1(false);
        this.c = new Scroller(getContext());
        b5Var2 = this.parentLayout;
        if (b5Var2 != null) {
        }
        return this.fragmentView;
    }

    public final void d1(org.telegram.ui.Cells.v0 v0Var) {
        float f9;
        if (this.t0 == null) {
            return;
        }
        Bitmap bitmap = this.a.r;
        if (bitmap != null) {
            float width = bitmap.getWidth();
            f9 = ((this.t0.getMeasuredWidth() - (Math.max(this.t0.getMeasuredWidth() / width, this.t0.getMeasuredHeight() / r0.r.getHeight()) * width)) / 2.0f) + this.T1 + 0.0f;
        } else {
            f9 = this.T1 + 0.0f;
        }
        float y8 = v0Var.getY() - ((-this.t0.F) + 0.0f);
        int measuredHeight = this.t0.getMeasuredHeight();
        float f10 = this.I1 ? this.j1 * this.k1 : 0.0f;
        v0Var.s0 = true;
        v0Var.r0 = measuredHeight;
        v0Var.p0 = y8;
        v0Var.q0 = f9;
        v0Var.O1 = f10;
        v0Var.P1.setColor(i0.a.k(-16777216, (int) (f10 * 255.0f)));
        v0Var.invalidate();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        if (i10 == NotificationCenter.chatWasBoostedByUser) {
            if (this.F1 == ((Long) objArr[2]).longValue()) {
                this.R1 = (TL_stories.TL_premium_boostsStatus) objArr[0];
                h1(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.emojiLoaded) {
            org.telegram.ui.Components.jl0 jl0Var = this.j0;
            if (jl0Var == null) {
                return;
            }
            int childCount = jl0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.j0.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.p2) {
                    ((org.telegram.ui.Cells.p2) childAt).b0(0, true);
                }
            }
            return;
        }
        if (i10 == NotificationCenter.invalidateMotionBackground) {
            jb1 jb1Var = this.q0;
            if (jb1Var != null) {
                jb1Var.f1();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.didSetNewWallpapper) {
            if (this.p0 != null) {
                b1(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.wallpapersNeedReload) {
            Object obj = this.x1;
            if (obj instanceof ai1) {
                ai1 ai1Var = (ai1) obj;
                if (ai1Var.a == null) {
                    ai1Var.a = (String) objArr[0];
                    return;
                }
                return;
            }
            return;
        }
        long j10 = 0;
        if (i10 != NotificationCenter.wallpapersDidLoad) {
            if (i10 != NotificationCenter.wallpaperSettedToUser || this.F1 == 0) {
                return;
            }
            finishFragment();
            return;
        }
        ArrayList arrayList = (ArrayList) objArr[0];
        this.Q0.clear();
        HashMap hashMap = this.R0;
        hashMap.clear();
        int size = arrayList.size();
        boolean z10 = false;
        for (int i13 = 0; i13 < size; i13++) {
            TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) arrayList.get(i13);
            if ((wallPaper instanceof TLRPC.TL_wallPaper) && wallPaper.pattern) {
                TLRPC.Document document = wallPaper.document;
                if (document != null && !hashMap.containsKey(Long.valueOf(document.id))) {
                    this.Q0.add(wallPaper);
                    hashMap.put(Long.valueOf(wallPaper.document.id), wallPaper);
                }
                org.telegram.ui.ActionBar.e6 e6Var = this.s;
                if (e6Var != null && (str = e6Var.o) != null && str.equals(wallPaper.slug)) {
                    this.S0 = (TLRPC.TL_wallPaper) wallPaper;
                    b1(false);
                    j1();
                } else if (e6Var == null) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = this.S0;
                    if (tL_wallPaper2 != null) {
                        String str2 = tL_wallPaper2.slug;
                        if (str2 != null) {
                            if (!str2.equals(wallPaper.slug)) {
                            }
                        }
                    }
                }
                z10 = true;
            }
        }
        if (!z10 && (tL_wallPaper = this.S0) != null) {
            this.Q0.add(0, tL_wallPaper);
        }
        oc1 oc1Var = this.M0;
        if (oc1Var != null) {
            oc1Var.l();
        }
        int size2 = arrayList.size();
        for (int i14 = 0; i14 < size2; i14++) {
            TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) arrayList.get(i14);
            if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                j10 = MediaDataController.calcHash(j10, wallPaper2.id);
            }
        }
        TL_account.getWallPapers getwallpapers = new TL_account.getWallPapers();
        getwallpapers.hash = j10;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new hb1(this, 1)), this.classGuid);
    }

    public final void e1() {
        if (this.p0 == null || this.G0 == null || this.s.g == 0) {
            return;
        }
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("bganimationhint", false)) {
            return;
        }
        if (this.w0 == null) {
            org.telegram.ui.Components.g40 g40Var = new org.telegram.ui.Components.g40(getParentActivity(), 8);
            this.w0 = g40Var;
            g40Var.setShowingDuration(5000L);
            this.w0.setAlpha(0.0f);
            this.w0.setVisibility(4);
            this.w0.setText(LocaleController.getString(R.string.BackgroundAnimateInfo));
            this.w0.setExtraTranslationY(AndroidUtilities.dp(6.0f));
            this.g0.addView(this.w0, i7.f6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
        AndroidUtilities.runOnUIThread(new t31(10, this, globalMainSettings), 500L);
    }

    public final void f1(int i10, boolean z10, boolean z11) {
        int indexOf;
        boolean z12 = z10 && i10 == 1 && this.S0 != null;
        int i11 = this.b;
        if (z10) {
            if (i10 != 0) {
                this.T0 = this.S0;
                this.i1 = this.h1;
                this.M0.l();
                ArrayList arrayList = this.Q0;
                if (arrayList != null) {
                    TLRPC.TL_wallPaper tL_wallPaper = this.S0;
                    if (tL_wallPaper == null) {
                        indexOf = 0;
                    } else {
                        indexOf = arrayList.indexOf(tL_wallPaper) + (i11 == 2 ? 1 : 0);
                    }
                    this.N0.h1(indexOf, (this.L0.getMeasuredWidth() - AndroidUtilities.dp(124.0f)) / 2);
                }
            } else if (i11 == 2) {
                this.W0 = this.V0;
                int i12 = this.X0;
                this.a1 = i12;
                int i13 = this.Y0;
                this.b1 = i13;
                int i14 = this.Z0;
                this.c1 = i14;
                this.e1 = this.K;
                this.R.f(0, 4, i14 != 0 ? 4 : i13 != 0 ? 3 : i12 != 0 ? 2 : 1, false);
                this.R.e(this.Z0, 3);
                this.R.e(this.Y0, 2);
                this.R.e(this.X0, 1);
                this.R.e(this.V0, 0);
            }
        }
        if (i11 == 1 || i11 == 2) {
            this.F0[z12 ? (char) 2 : (char) 0].setVisibility(0);
        }
        if (i10 == 1) {
            org.telegram.ui.Cells.j0 j0Var = this.P0;
            if (!j0Var.H) {
                float f9 = this.h1;
                if (f9 < 0.0f) {
                    float f10 = -f9;
                    this.h1 = f10;
                    j0Var.setProgress(f10);
                }
            }
        }
        FrameLayout[] frameLayoutArr = this.H0;
        if (!z11) {
            char c3 = i10 == 0 ? (char) 1 : (char) 0;
            if (z10) {
                frameLayoutArr[i10].setVisibility(0);
                if (i11 == 1) {
                    this.q0.setTranslationY(i10 == 1 ? -AndroidUtilities.dp(21.0f) : 0.0f);
                    this.F0[2].setAlpha(z12 ? 1.0f : 0.0f);
                    this.F0[0].setAlpha(z12 ? 0.0f : 1.0f);
                    if (i10 == 1) {
                        frameLayoutArr[i10].setAlpha(1.0f);
                    } else {
                        frameLayoutArr[i10].setAlpha(1.0f);
                        frameLayoutArr[c3].setAlpha(0.0f);
                    }
                    AndroidUtilities.hideKeyboard(this.R.A[1]);
                } else if (i11 == 2) {
                    this.q0.setTranslationY(AndroidUtilities.dp((this.w1 == null ? 0 : 58) + 72) + (-AndroidUtilities.dp(i10 == 0 ? 343.0f : 316.0f)) + (U0() ? AndroidUtilities.navigationBarHeight : 0));
                    this.F0[2].setAlpha(z12 ? 1.0f : 0.0f);
                    this.F0[0].setAlpha(z12 ? 0.0f : 1.0f);
                    if (frameLayoutArr[c3].getVisibility() == 0) {
                        frameLayoutArr[c3].setAlpha(0.0f);
                        frameLayoutArr[i10].setAlpha(1.0f);
                        frameLayoutArr[i10].setTranslationY(0.0f);
                    } else {
                        frameLayoutArr[i10].setTranslationY(0.0f);
                    }
                } else {
                    if (i10 == 1) {
                        frameLayoutArr[i10].setAlpha(1.0f);
                    } else {
                        frameLayoutArr[i10].setAlpha(1.0f);
                        frameLayoutArr[c3].setAlpha(0.0f);
                    }
                    AndroidUtilities.hideKeyboard(this.R.A[1]);
                }
            } else {
                this.q0.setTranslationY(0.0f);
                frameLayoutArr[i10].setTranslationY(r9.getMeasuredHeight());
                this.F0[0].setAlpha(1.0f);
                this.F0[2].setAlpha(1.0f);
                this.t0.setAlpha(1.0f);
            }
            if (z10 && frameLayoutArr[c3].getVisibility() == 0) {
                frameLayoutArr[c3].setAlpha(1.0f);
                frameLayoutArr[c3].setVisibility(4);
            } else if (!z10) {
                frameLayoutArr[i10].setVisibility(4);
            }
            if (i11 == 1 || i11 == 2) {
                this.F0[z12 ? (char) 0 : (char) 2].setVisibility(4);
                return;
            } else {
                if (i10 == 1) {
                    frameLayoutArr[c3].setAlpha(0.0f);
                    return;
                }
                return;
            }
        }
        this.n1 = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        int i15 = i10 == 0 ? 1 : 0;
        if (z10) {
            frameLayoutArr[i10].setVisibility(0);
            if (i11 == 1) {
                arrayList2.add(ObjectAnimator.ofFloat(this.q0, (Property<jb1, Float>) View.TRANSLATION_Y, i10 == 1 ? -AndroidUtilities.dp(21.0f) : 0.0f));
                org.telegram.ui.Components.a81 a81Var = this.F0[2];
                Property property = View.ALPHA;
                arrayList2.add(ObjectAnimator.ofFloat(a81Var, (Property<org.telegram.ui.Components.a81, Float>) property, z12 ? 1.0f : 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.F0[0], (Property<org.telegram.ui.Components.a81, Float>) property, z12 ? 0.0f : 1.0f));
                if (i10 == 1) {
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], (Property<FrameLayout, Float>) property, 0.0f, 1.0f));
                } else {
                    frameLayoutArr[i10].setAlpha(1.0f);
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i15], (Property<FrameLayout, Float>) property, 0.0f));
                }
                AndroidUtilities.hideKeyboard(this.R.A[1]);
            } else if (i11 == 2) {
                jb1 jb1Var = this.q0;
                Property property2 = View.TRANSLATION_Y;
                arrayList2.add(ObjectAnimator.ofFloat(jb1Var, (Property<jb1, Float>) property2, AndroidUtilities.dp((this.w1 == null ? 0 : 58) + 72) + (-frameLayoutArr[i10].getMeasuredHeight()) + (U0() ? AndroidUtilities.navigationBarHeight : 0)));
                org.telegram.ui.Components.a81 a81Var2 = this.F0[2];
                Property property3 = View.ALPHA;
                arrayList2.add(ObjectAnimator.ofFloat(a81Var2, (Property<org.telegram.ui.Components.a81, Float>) property3, z12 ? 1.0f : 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.F0[0], (Property<org.telegram.ui.Components.a81, Float>) property3, z12 ? 0.0f : 1.0f));
                if (frameLayoutArr[i15].getVisibility() == 0) {
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i15], (Property<FrameLayout, Float>) property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], (Property<FrameLayout, Float>) property3, 0.0f, 1.0f));
                    frameLayoutArr[i10].setTranslationY(0.0f);
                } else {
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], (Property<FrameLayout, Float>) property2, r6.getMeasuredHeight(), 0.0f));
                }
            } else {
                if (i10 == 1) {
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
                } else {
                    frameLayoutArr[i10].setAlpha(1.0f);
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i15], (Property<FrameLayout, Float>) View.ALPHA, 0.0f));
                }
                AndroidUtilities.hideKeyboard(this.R.A[1]);
            }
        } else {
            jb1 jb1Var2 = this.q0;
            Property property4 = View.TRANSLATION_Y;
            arrayList2.add(ObjectAnimator.ofFloat(jb1Var2, (Property<jb1, Float>) property4, 0.0f));
            arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], (Property<FrameLayout, Float>) property4, r6.getMeasuredHeight()));
            org.telegram.ui.Components.a81 a81Var3 = this.F0[0];
            Property property5 = View.ALPHA;
            arrayList2.add(ObjectAnimator.ofFloat(a81Var3, (Property<org.telegram.ui.Components.a81, Float>) property5, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(this.F0[2], (Property<org.telegram.ui.Components.a81, Float>) property5, 0.0f));
            arrayList2.add(ObjectAnimator.ofFloat(this.t0, (Property<fc1, Float>) property5, 1.0f));
        }
        this.n1.playTogether(arrayList2);
        this.n1.addListener(new wb1(this, z10, i15, i10, z12));
        this.n1.setInterpolator(org.telegram.ui.Components.jr.g);
        this.n1.setDuration(200L);
        this.n1.start();
    }

    public final void g1() {
        if (this.d2 != null) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) (U0() ? this.parentLayout.getBottomSheet().getWindow() : getParentActivity().getWindow()).getDecorView();
        Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        this.K1.setAlpha(0.0f);
        frameLayout.draw(canvas);
        this.K1.setAlpha(1.0f);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        paint2.setFilterBitmap(true);
        int i10 = 2;
        int[] iArr = new int[2];
        this.K1.getLocationInWindow(iArr);
        float f9 = iArr[0];
        float f10 = iArr[1];
        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        fc fcVar = new fc(this, getParentActivity(), canvas, (this.K1.getMeasuredWidth() / 2.0f) + f9, (this.K1.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f9, f10, 2);
        this.d2 = fcVar;
        fcVar.setOnTouchListener(new mh.d(i10));
        this.e2 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f2 = ofFloat;
        ofFloat.addUpdateListener(new nh.qa(this, 3));
        this.f2.addListener(new tb1(this, 4));
        this.f2.setDuration(400L);
        this.f2.setInterpolator(org.telegram.ui.Components.ct.e);
        this.f2.start();
        frameLayout.addView(this.d2, new ViewGroup.LayoutParams(-1, -1));
        AndroidUtilities.runOnUIThread(new bb1(this, i10));
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final int getObserverTag() {
        return this.p1;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final org.telegram.ui.ActionBar.c6 getResourceProvider() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        return this.H1 ? S0() : super.getThemeDescriptions();
    }

    public final void h1(boolean z10) {
        long j10 = this.F1;
        if (j10 > 0) {
            this.v1.d(LocaleController.getString(R.string.ApplyWallpaperForMe));
            return;
        }
        if (j10 >= 0) {
            this.v1.d(LocaleController.getString(R.string.ApplyWallpaper));
            return;
        }
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.F1));
        int i10 = 0;
        if (chat == null) {
            this.v1.d(LocaleController.formatString(R.string.ApplyWallpaperForChannel, LocaleController.getString(R.string.AccDescrChannel).toLowerCase()));
            return;
        }
        this.v1.d(LocaleController.formatString(R.string.ApplyWallpaperForChannel, chat.title));
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.R1;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < R0()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
            if (this.m1 == null) {
                org.telegram.ui.Components.iq iqVar = new org.telegram.ui.Components.iq(R.drawable.mini_switch_lock, 0);
                this.m1 = iqVar;
                iqVar.setTopOffset(1);
            }
            spannableStringBuilder.setSpan(this.m1, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.formatPluralString("ReactionLevelRequiredBtn", R0(), new Object[0]));
            this.v1.c(spannableStringBuilder, z10);
            return;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.R1;
        if (tL_premium_boostsStatus2 != null) {
            this.v1.c(null, z10);
            return;
        }
        if (this.F1 >= 0 || this.P1 || this.Q1 || tL_premium_boostsStatus2 != null) {
            return;
        }
        this.P1 = true;
        getMessagesController().getBoostsController().getBoostsStats(this.F1, new gb1(this, i10));
    }

    public final void i1() {
        if (this.B1 && this.s1 == null) {
            Bitmap bitmap = this.y1;
            if (bitmap != null) {
                this.t1 = bitmap;
                this.s1 = Utilities.blurWallpaper(bitmap);
            } else {
                ImageReceiver imageReceiver = this.t0.getImageReceiver();
                if (imageReceiver.hasNotThumb() || imageReceiver.hasStaticThumb()) {
                    this.t1 = imageReceiver.getBitmap();
                    this.s1 = Utilities.blurWallpaper(imageReceiver.getBitmap());
                }
            }
        }
        if (!this.B1) {
            b1(false);
            return;
        }
        Bitmap bitmap2 = this.s1;
        if (bitmap2 != null) {
            this.t0.setImageBitmap(bitmap2);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.b != 2) {
            return false;
        }
        if (!this.W1 || motionEvent == null) {
            return true;
        }
        return motionEvent.getY() <= ((float) (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight));
    }

    public final void j1() {
        File httpFilePath;
        String name;
        int i10;
        long j10;
        File file;
        String str;
        FrameLayout frameLayout;
        Object obj = this.S0;
        if (obj == null) {
            obj = this.x1;
        }
        boolean z10 = obj instanceof TLRPC.TL_wallPaper;
        if (z10 || (obj instanceof MediaController.SearchImage)) {
            if (z10) {
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
                str = FileLoader.getAttachFileName(tL_wallPaper.document);
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                file = FileLoader.getInstance(this.currentAccount).getPathToAttach(tL_wallPaper.document, true);
                j10 = tL_wallPaper.document.size;
            } else {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                TLRPC.Photo photo = searchImage.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, this.D1, true);
                    httpFilePath = FileLoader.getInstance(this.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true);
                    name = FileLoader.getAttachFileName(closestPhotoSizeWithSize);
                    i10 = closestPhotoSizeWithSize.size;
                } else {
                    httpFilePath = ImageLoader.getHttpFilePath(searchImage.imageUrl, "jpg");
                    name = httpFilePath.getName();
                    i10 = searchImage.size;
                }
                j10 = i10;
                String str2 = name;
                file = httpFilePath;
                str = str2;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
            }
            boolean exists = file.exists();
            int i11 = this.b;
            if (exists) {
                DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
                this.t0.invalidate();
                if (i11 == 2) {
                    if (j10 == 0 || this.F1 != 0) {
                        this.o0.setSubtitle(null);
                    } else {
                        this.o0.setSubtitle(AndroidUtilities.formatFileSize(j10));
                    }
                }
            } else {
                DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(str, null, this);
                if (i11 == 2 && this.F1 == 0) {
                    this.o0.setSubtitle(LocaleController.getString(R.string.LoadingFullImage));
                }
                this.t0.invalidate();
            }
            if (this.S0 == null && (frameLayout = this.u0) != null) {
                frameLayout.setAlpha(exists ? 1.0f : 0.5f);
            }
            if (i11 == 0) {
                this.Y.setEnabled(exists);
                this.Y.setAlpha(exists ? 1.0f : 0.5f);
                return;
            }
            if (i11 != 2) {
                this.f.setEnabled(exists);
                this.f.setAlpha(exists ? 1.0f : 0.5f);
                return;
            }
            this.y0.setEnabled(exists);
            gc1 gc1Var = this.v1;
            if (gc1Var != null) {
                gc1Var.setAlpha(exists ? 1.0f : 0.5f);
            }
            gc1 gc1Var2 = this.w1;
            if (gc1Var2 != null) {
                gc1Var2.setAlpha(exists ? 1.0f : 0.5f);
            }
        }
    }

    public final void k1() {
        this.t0.getImageReceiver().setAlpha(Math.abs(this.h1));
        this.t0.invalidate();
        this.L0.f1();
        if (this.h1 >= 0.0f) {
            this.t0.getImageReceiver().setGradientBitmap(null);
        } else {
            if (Build.VERSION.SDK_INT >= 29) {
                this.t0.getImageReceiver().setBlendMode(null);
            }
            if (this.t0.getBackground() instanceof org.telegram.ui.Components.yb0) {
                this.t0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.yb0) this.t0.getBackground()).k);
            }
        }
        this.a.b(this.t0.getBackground(), this.t0.getBackground(), Float.valueOf(this.h1));
        V0();
    }

    public final void l1() {
        int i10 = this.b;
        if (i10 == 1 || i10 == 2) {
            if (this.S0 == null && (this.x1 instanceof zh1)) {
                this.F0[2].a(false, true);
            }
            this.F0[this.S0 != null ? (char) 2 : (char) 0].setVisibility(0);
            AnimatorSet animatorSet = new AnimatorSet();
            org.telegram.ui.Components.a81 a81Var = this.F0[2];
            Property property = View.ALPHA;
            animatorSet.playTogether(ObjectAnimator.ofFloat(a81Var, (Property<org.telegram.ui.Components.a81, Float>) property, this.S0 != null ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.F0[0], (Property<org.telegram.ui.Components.a81, Float>) property, this.S0 != null ? 0.0f : 1.0f));
            animatorSet.addListener(new ub1(this));
            animatorSet.setInterpolator(org.telegram.ui.Components.jr.g);
            animatorSet.setDuration(200L);
            animatorSet.start();
            return;
        }
        boolean isEnabled = this.F0[0].isEnabled();
        TLRPC.TL_wallPaper tL_wallPaper = this.S0;
        if (isEnabled == (tL_wallPaper != null)) {
            return;
        }
        if (tL_wallPaper == null) {
            this.F0[0].a(false, true);
        }
        this.F0[0].setEnabled(this.S0 != null);
        if (this.S0 != null) {
            this.F0[0].setVisibility(0);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.F0[1].getLayoutParams();
        AnimatorSet animatorSet2 = new AnimatorSet();
        int dp = (AndroidUtilities.dp(9.0f) + layoutParams.width) / 2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.F0[0], (Property<org.telegram.ui.Components.a81, Float>) View.ALPHA, this.S0 == null ? 0.0f : 1.0f));
        org.telegram.ui.Components.a81 a81Var2 = this.F0[0];
        Property property2 = View.TRANSLATION_X;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(a81Var2, (Property<org.telegram.ui.Components.a81, Float>) property2, this.S0 != null ? 0.0f : dp));
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.F0[1], (Property<org.telegram.ui.Components.a81, Float>) property2, this.S0 == null ? -dp : 0.0f));
        animatorSet2.setInterpolator(org.telegram.ui.Components.jr.g);
        animatorSet2.setDuration(200L);
        animatorSet2.addListener(new vb1(this));
        animatorSet2.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x008e, code lost:
    
        if (r3 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:
    
        if (r23.X0 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1(boolean z10) {
        char c3;
        char c6;
        float f9;
        nb1 nb1Var;
        boolean z11;
        int i10;
        BlendMode blendMode;
        int i11 = Build.VERSION.SDK_INT;
        int i12 = this.b;
        org.telegram.ui.ActionBar.e6 e6Var = this.s;
        if (i11 >= 29) {
            if (i12 == 0) {
                i10 = e6Var != null ? (int) e6Var.l : getThemedColor(org.telegram.ui.ActionBar.g6.Pd);
            } else if (i12 == 1) {
                int B0 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Pd);
                long j10 = e6Var.l;
                int i13 = (int) j10;
                if (i13 != 0 || j10 == 0) {
                    if (i13 != 0) {
                        B0 = i13;
                    }
                    i10 = B0;
                }
                i10 = 0;
            } else {
                if (this.x1 instanceof zh1) {
                    i10 = this.Y0;
                }
                i10 = 0;
            }
            if (i10 == 0 || this.h1 < 0.0f) {
                this.t0.getImageReceiver().setBlendMode(null);
            } else {
                ImageReceiver imageReceiver = this.t0.getImageReceiver();
                blendMode = BlendMode.SOFT_LIGHT;
                imageReceiver.setBlendMode(blendMode);
            }
        }
        int i14 = 2;
        if (this.z0 != null) {
            if (i12 != 2) {
                if (i12 == 1) {
                    int B02 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Od);
                    long j11 = e6Var.k;
                    int i15 = (int) j11;
                    if (i15 == 0 && j11 != 0) {
                        B02 = 0;
                    } else if (i15 != 0) {
                        B02 = i15;
                    }
                }
                z11 = false;
            }
            boolean z12 = this.z0.getTag() != null;
            this.z0.setTag(z11 ? 1 : null);
            if (z12 != z11) {
                if (z11) {
                    this.z0.setVisibility(0);
                }
                AnimatorSet animatorSet = this.D0;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                if (z10) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.D0 = animatorSet2;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.z0, (Property<nb1, Float>) View.ALPHA, z11 ? 1.0f : 0.0f);
                    c6 = 4;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.z0, (Property<nb1, Float>) View.SCALE_X, z11 ? 1.0f : 0.0f);
                    f9 = 1.0f;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.z0, (Property<nb1, Float>) View.SCALE_Y, z11 ? 1.0f : 0.0f);
                    org.telegram.ui.Components.a81 a81Var = this.F0[0];
                    Property property = View.TRANSLATION_X;
                    c3 = 3;
                    animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(a81Var, (Property<org.telegram.ui.Components.a81, Float>) property, z11 ? AndroidUtilities.dp(34.0f) : 0.0f), ObjectAnimator.ofFloat(this.F0[1], (Property<org.telegram.ui.Components.a81, Float>) property, z11 ? -AndroidUtilities.dp(34.0f) : 0.0f), ObjectAnimator.ofFloat(this.F0[2], (Property<org.telegram.ui.Components.a81, Float>) property, z11 ? AndroidUtilities.dp(34.0f) : 0.0f));
                    this.D0.setDuration(180L);
                    this.D0.addListener(new tb1(this, i14));
                    this.D0.setInterpolator(org.telegram.ui.Components.jr.g);
                    this.D0.start();
                } else {
                    c3 = 3;
                    c6 = 4;
                    f9 = 1.0f;
                    this.z0.setAlpha(z11 ? 1.0f : 0.0f);
                    this.z0.setScaleX(z11 ? 1.0f : 0.0f);
                    this.z0.setScaleY(z11 ? 1.0f : 0.0f);
                    this.F0[0].setTranslationX(z11 ? AndroidUtilities.dp(34.0f) : 0.0f);
                    this.F0[1].setTranslationX(z11 ? -AndroidUtilities.dp(34.0f) : 0.0f);
                    this.F0[2].setTranslationX(z11 ? AndroidUtilities.dp(34.0f) : 0.0f);
                }
                nb1Var = this.A0;
                if (nb1Var == null) {
                    boolean z13 = nb1Var.getTag() != null;
                    this.A0.setTag(1);
                    if (!z13) {
                        this.A0.setVisibility(0);
                        AnimatorSet animatorSet3 = this.E0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        if (!z10) {
                            this.A0.setAlpha(1.0f);
                            this.A0.setScaleX(1.0f);
                            this.A0.setScaleY(1.0f);
                            this.G0[0].setTranslationX(-AndroidUtilities.dp(34.0f));
                            this.G0[1].setTranslationX(AndroidUtilities.dp(34.0f));
                            return;
                        }
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        this.E0 = animatorSet4;
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.A0, (Property<nb1, Float>) View.ALPHA, f9);
                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.A0, (Property<nb1, Float>) View.SCALE_X, f9);
                        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.A0, (Property<nb1, Float>) View.SCALE_Y, f9);
                        org.telegram.ui.Components.a81 a81Var2 = this.G0[0];
                        Property property2 = View.TRANSLATION_X;
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(a81Var2, (Property<org.telegram.ui.Components.a81, Float>) property2, -AndroidUtilities.dp(34.0f));
                        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.G0[1], (Property<org.telegram.ui.Components.a81, Float>) property2, AndroidUtilities.dp(34.0f));
                        Animator[] animatorArr = new Animator[5];
                        animatorArr[0] = ofFloat4;
                        animatorArr[1] = ofFloat5;
                        animatorArr[2] = ofFloat6;
                        animatorArr[c3] = ofFloat7;
                        animatorArr[c6] = ofFloat8;
                        animatorSet4.playTogether(animatorArr);
                        this.E0.setDuration(180L);
                        this.E0.addListener(new tb1(this, 3));
                        this.E0.setInterpolator(org.telegram.ui.Components.jr.g);
                        this.E0.start();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        c3 = 3;
        c6 = 4;
        f9 = 1.0f;
        nb1Var = this.A0;
        if (nb1Var == null) {
        }
    }

    public final void n1() {
        int childCount = this.L0.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.L0.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.i5) {
                ((org.telegram.ui.Cells.i5) childAt).u(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        if (!Q0(z10)) {
            return false;
        }
        O0(true);
        return super.onBackPressed(z10);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onBottomSheetCreated() {
        super.onBottomSheetCreated();
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var == null || b5Var.getBottomSheet() == null) {
            return;
        }
        this.parentLayout.getBottomSheet().fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.g6.h5));
        if (this.b != 2 || this.F1 == 0) {
            return;
        }
        this.parentLayout.getBottomSheet().setOverlayNavBarColor(-16777216);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onFailedDownload(String str, boolean z10) {
        j1();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatWasBoostedByUser);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.invalidateMotionBackground);
        getNotificationCenter().addObserver(this, NotificationCenter.wallpaperSettedToUser);
        int i10 = this.b;
        if (i10 == 1 || i10 == 0) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewWallpapper);
        }
        if (i10 == 2 || i10 == 1) {
            org.telegram.ui.ActionBar.g6.N = true;
        }
        if (i10 == 0 && this.s == null) {
            this.A1 = org.telegram.ui.ActionBar.g6.i0;
        } else {
            Point point = AndroidUtilities.displaySize;
            int min = Math.min(point.x, point.y);
            Point point2 = AndroidUtilities.displaySize;
            int max = Math.max(point2.x, point2.y);
            StringBuilder sb2 = new StringBuilder();
            sb2.append((int) (min / AndroidUtilities.density));
            sb2.append("_");
            this.C1 = a4.w.l((int) (max / AndroidUtilities.density), "_f", sb2);
            Point point3 = AndroidUtilities.displaySize;
            this.D1 = Math.max(point3.x, point3.y);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersNeedReload);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.wallpapersDidLoad);
            this.p1 = DownloadController.getInstance(this.currentAccount).generateObserverTag();
            if (this.Q0 == null) {
                this.Q0 = new ArrayList();
                MessagesStorage.getInstance(this.currentAccount).getWallpapers();
            }
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatWasBoostedByUser);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.invalidateMotionBackground);
        getNotificationCenter().removeObserver(this, NotificationCenter.wallpaperSettedToUser);
        bg.d1 d1Var = this.g0;
        if (d1Var != null && this.M != null) {
            d1Var.getViewTreeObserver().removeOnGlobalLayoutListener(this.M);
        }
        int i10 = this.b;
        if ((i10 == 2 || i10 == 1) && this.l1 == null) {
            AndroidUtilities.runOnUIThread(new ef0(8));
        }
        if (i10 == 2) {
            Bitmap bitmap = this.s1;
            if (bitmap != null) {
                bitmap.recycle();
                this.s1 = null;
            }
            this.a.b(null, null, null);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
        } else if (i10 == 1 || i10 == 0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        }
        if (i10 != 0 || this.s != null) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersNeedReload);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.wallpapersDidLoad);
        }
        super.onFragmentDestroy();
        P0(null);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        super.onPause();
        if (this.A1) {
            this.r1.c(false);
        }
        org.telegram.ui.ActionBar.g6.b = false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        ic1 ic1Var = this.k0;
        if (ic1Var != null) {
            ic1Var.l();
        }
        mc1 mc1Var = this.r0;
        if (mc1Var != null) {
            mc1Var.l();
        }
        if (this.A1) {
            this.r1.c(true);
        }
        org.telegram.ui.ActionBar.g6.b = true;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onSuccessDownload(String str) {
        j1();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        if (z10 || this.b != 2) {
            return;
        }
        this.a.b(null, null, null);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void setResourceProvider(org.telegram.ui.ActionBar.c6 c6Var) {
        this.a.a = c6Var;
    }

    public qc1(org.telegram.ui.ActionBar.f6 f6Var, boolean z10, int i10, boolean z11, boolean z12) {
        super(null);
        this.a = new pb1(this);
        this.d = true;
        this.n = 1;
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(this, 0, false);
        this.N = n5Var;
        org.telegram.ui.ActionBar.n5 n5Var2 = new org.telegram.ui.ActionBar.n5(this, 0, true);
        this.O = n5Var2;
        org.telegram.ui.ActionBar.n5 n5Var3 = new org.telegram.ui.ActionBar.n5(this, 1, false);
        this.P = n5Var3;
        org.telegram.ui.ActionBar.n5 n5Var4 = new org.telegram.ui.ActionBar.n5(this, 1, true);
        this.Q = n5Var4;
        this.T = -1;
        this.U = new bb1(this, 0);
        this.s0 = new fc1[2];
        this.H0 = new FrameLayout[2];
        this.I0 = new TextView[2];
        this.J0 = new TextView[2];
        this.K0 = new FrameLayout[2];
        this.R0 = new HashMap();
        this.h1 = 0.5f;
        this.j1 = 0.0f;
        this.o1 = PorterDuff.Mode.SRC_IN;
        this.u1 = 1.0f;
        this.C1 = "640_360";
        this.D1 = 1920;
        this.G1 = true;
        this.O1 = new org.telegram.ui.Components.f20(getParentActivity(), new rb1(this));
        this.P1 = false;
        this.Q1 = false;
        this.b = i10;
        this.b0 = z12;
        this.a0 = f6Var;
        this.d0 = z10;
        this.c0 = z11;
        if (i10 == 1) {
            org.telegram.ui.ActionBar.e6 k9 = f6Var.k(!z11);
            this.s = k9;
            if (k9 != null) {
                this.d = false;
                this.w = k9.c;
                this.x = k9.d;
                this.y = k9.e;
                this.A = k9.f;
                this.B = k9.g;
                this.C = k9.h;
                this.D = k9.i;
                this.E = k9.j;
                this.F = k9.k;
                this.G = k9.l;
                this.H = k9.m;
                this.I = k9.p;
                this.J = k9.o;
                this.K = k9.n;
            }
        } else {
            if (i10 == 0) {
                this.d = false;
            }
            org.telegram.ui.ActionBar.e6 k10 = f6Var.k(false);
            this.s = k10;
            if (k10 != null) {
                this.S0 = k10.s;
            }
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.s;
        if (e6Var != null) {
            this.A1 = e6Var.q;
            if (!TextUtils.isEmpty(e6Var.o)) {
                this.h1 = this.s.p;
            }
            org.telegram.ui.ActionBar.g6.M = org.telegram.ui.ActionBar.g6.A0();
            org.telegram.ui.ActionBar.g6.O = true;
            org.telegram.ui.ActionBar.g6.P = true;
            org.telegram.ui.ActionBar.g6.t(f6Var, false, false);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.goingToPreviewTheme, new Object[0]);
        n5Var.v = true;
        n5Var3.v = true;
        n5Var2.v = true;
        n5Var4.v = true;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j10, long j11) {
    }

    public qc1(org.telegram.ui.ActionBar.f6 f6Var) {
        this(f6Var, false, 0, false, false);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
