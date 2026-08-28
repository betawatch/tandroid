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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class oc1 extends org.telegram.ui.ActionBar.o2 implements DownloadController.FileDownloadProgressListener, NotificationCenter.NotificationCenterDelegate {
    public final int A;
    public mb1 A0;
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
    public nc1 E1;
    public final long F;
    public org.telegram.ui.Components.o71[] F0;
    public long F1;
    public final long G;
    public org.telegram.ui.Components.o71[] G0;
    public boolean G1;
    public final long H;
    public final FrameLayout[] H0;
    public boolean H1;
    public final float I;
    public final TextView[] I0;
    public boolean I1;
    public final String J;
    public final TextView[] J0;
    public org.telegram.ui.Components.mi0 J1;
    public final int K;
    public final FrameLayout[] K0;
    public org.telegram.ui.ActionBar.w0 K1;
    public long L;
    public va1 L0;
    public ValueAnimator L1;
    public l90 M;
    public mc1 M0;
    public bh.g M1;
    public final org.telegram.ui.ActionBar.n5 N;
    public f2.m0 N0;
    public lb1 N1;
    public final org.telegram.ui.ActionBar.n5 O;
    public org.telegram.ui.Cells.m4 O0;
    public final org.telegram.ui.Components.u10 O1;
    public final org.telegram.ui.ActionBar.n5 P;
    public org.telegram.ui.Cells.j0 P0;
    public boolean P1;
    public final org.telegram.ui.ActionBar.n5 Q;
    public ArrayList Q0;
    public boolean Q1;
    public org.telegram.ui.Components.cq R;
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
    public kh.h6 W;
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
    public final ob1 a;
    public final org.telegram.ui.ActionBar.e6 a0;
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
    public gc d2;
    public org.telegram.ui.Components.pl e;
    public ArrayList e0;
    public int e1;
    public float e2;
    public org.telegram.ui.ActionBar.w0 f;
    public m2.g f0;
    public int f1;
    public ValueAnimator f2;
    public fh.v g0;
    public int g1;
    public TextView h;
    public UndoView h0;
    public float h1;
    public FrameLayout i0;
    public float i1;
    public org.telegram.ui.Components.wk0 j0;
    public float j1;
    public gc1 k0;
    public float k1;
    public org.telegram.ui.Components.j10 l0;
    public fc1 l1;
    public MessageObject m0;
    public org.telegram.ui.Components.eq m1;
    public int n;
    public boolean n0;
    public AnimatorSet n1;
    public org.telegram.ui.ActionBar.k o0;
    public final PorterDuff.Mode o1;
    public org.telegram.ui.ActionBar.r0 p0;
    public int p1;
    public ib1 q0;
    public org.telegram.ui.Components.i9 q1;
    public Drawable r;
    public kc1 r0;
    public org.telegram.ui.Components.q71 r1;
    public final org.telegram.ui.ActionBar.d6 s;
    public final dc1[] s0;
    public Bitmap s1;
    public dc1 t0;
    public Bitmap t1;
    public FrameLayout u0;
    public float u1;
    public boolean v;
    public FrameLayout v0;
    public ec1 v1;
    public final int w;
    public org.telegram.ui.Components.s30 w0;
    public ec1 w1;
    public final int x;
    public AnimatorSet x0;
    public Object x1;
    public final int y;
    public t4 y0;
    public Bitmap y1;
    public mb1 z0;
    public boolean z1;

    public oc1(Object obj, Bitmap bitmap, boolean z10) {
        super(null);
        this.a = new ob1(this);
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
        this.U = new ab1(this, 0);
        this.s0 = new dc1[2];
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
        this.O1 = new org.telegram.ui.Components.u10(getParentActivity(), new qb1(this));
        this.P1 = false;
        this.Q1 = false;
        this.b = 2;
        this.x1 = obj;
        this.y1 = bitmap;
        this.z1 = z10;
        if (obj instanceof xh1) {
            xh1 xh1Var = (xh1) obj;
            this.A1 = xh1Var.j;
            TLRPC.TL_wallPaper tL_wallPaper = xh1Var.g;
            this.S0 = tL_wallPaper;
            if (tL_wallPaper != null) {
                float f10 = xh1Var.h;
                this.h1 = f10;
                if (f10 < 0.0f && !org.telegram.ui.ActionBar.f6.I.q()) {
                    this.h1 *= -1.0f;
                }
            }
        }
        n5Var.v = true;
        n5Var3.v = true;
        n5Var2.v = true;
        n5Var4.v = true;
    }

    public static void T(oc1 oc1Var) {
        org.telegram.ui.ActionBar.e6 e6Var = org.telegram.ui.ActionBar.f6.M;
        if (e6Var == null) {
            return;
        }
        int i9 = e6Var.V;
        org.telegram.ui.ActionBar.d6 k10 = i9 >= 0 ? (org.telegram.ui.ActionBar.d6) e6Var.W.get(i9) : e6Var.k(false);
        if (oc1Var.s != null) {
            oc1Var.W0();
            org.telegram.ui.ActionBar.f6.t1(oc1Var.a0, true, false, false, false, false);
            if (org.telegram.ui.ActionBar.f6.M != null) {
                org.telegram.ui.ActionBar.f6.O = false;
                org.telegram.ui.ActionBar.f6.P = false;
                org.telegram.ui.ActionBar.f6.M = null;
            }
            org.telegram.ui.ActionBar.f6.t(oc1Var.a0, true, oc1Var.b0);
            ((ActionBarLayout) oc1Var.parentLayout).U(false, false);
        } else {
            ((ActionBarLayout) oc1Var.parentLayout).U(false, false);
            File file = new File(oc1Var.a0.b);
            org.telegram.ui.ActionBar.e6 e6Var2 = oc1Var.a0;
            org.telegram.ui.ActionBar.f6.u(file, e6Var2.a, e6Var2.B, false);
            MessagesController.getInstance(oc1Var.a0.A).saveTheme(oc1Var.a0, null, false, false);
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            edit.putString("lastDayTheme", oc1Var.a0.m());
            edit.commit();
        }
        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) oc1Var.getParentLayout().getFragmentStack().get(Math.max(0, oc1Var.getParentLayout().getFragmentStack().size() - 2));
        oc1Var.finishFragment();
        if (oc1Var.b == 0) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didApplyNewTheme, e6Var, k10, Boolean.valueOf(oc1Var.d0));
        }
        org.telegram.ui.ActionBar.f6.F1(o2Var);
    }

    public static /* synthetic */ void U(oc1 oc1Var, TLObject tLObject) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        HashMap hashMap = oc1Var.R0;
        org.telegram.ui.ActionBar.d6 d6Var = oc1Var.s;
        if (tLObject instanceof TL_account.TL_wallPapers) {
            TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
            oc1Var.Q0.clear();
            hashMap.clear();
            int size = tL_wallPapers.wallpapers.size();
            boolean z10 = false;
            for (int i9 = 0; i9 < size; i9++) {
                if (tL_wallPapers.wallpapers.get(i9) instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) tL_wallPapers.wallpapers.get(i9);
                    if (tL_wallPaper2.pattern) {
                        TLRPC.Document document = tL_wallPaper2.document;
                        if (document != null && !hashMap.containsKey(Long.valueOf(document.id))) {
                            oc1Var.Q0.add(tL_wallPaper2);
                            hashMap.put(Long.valueOf(tL_wallPaper2.document.id), tL_wallPaper2);
                        }
                        if (d6Var != null && (str = d6Var.o) != null && str.equals(tL_wallPaper2.slug)) {
                            oc1Var.S0 = tL_wallPaper2;
                            oc1Var.b1(false);
                            oc1Var.j1();
                        } else if (d6Var == null) {
                            TLRPC.TL_wallPaper tL_wallPaper3 = oc1Var.S0;
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
            if (!z10 && (tL_wallPaper = oc1Var.S0) != null) {
                oc1Var.Q0.add(0, tL_wallPaper);
            }
            mc1 mc1Var = oc1Var.M0;
            if (mc1Var != null) {
                mc1Var.l();
            }
            MessagesStorage.getInstance(oc1Var.currentAccount).putWallpapers(tL_wallPapers.wallpapers, 1);
        }
        if (oc1Var.S0 != null || d6Var == null || TextUtils.isEmpty(d6Var.o)) {
            return;
        }
        TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
        TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
        tL_inputWallPaperSlug.slug = d6Var.o;
        getwallpaper.wallpaper = tL_inputWallPaperSlug;
        ConnectionsManager.getInstance(oc1Var.currentAccount).bindRequestToGuid(oc1Var.getConnectionsManager().sendRequest(getwallpaper, new gb1(oc1Var, 0)), oc1Var.classGuid);
    }

    public static /* synthetic */ void V(oc1 oc1Var) {
        org.telegram.ui.Components.pl plVar = oc1Var.e;
        int i9 = 0;
        if (plVar != null) {
            plVar.B(oc1Var.getThemedColor(org.telegram.ui.ActionBar.f6.G8));
            oc1Var.e.G(oc1Var.getThemedColor(org.telegram.ui.ActionBar.f6.E8), false);
        }
        Drawable drawable = oc1Var.r;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(oc1Var.getThemedColor(org.telegram.ui.ActionBar.f6.d6), PorterDuff.Mode.MULTIPLY));
        }
        t4 t4Var = oc1Var.y0;
        if (t4Var != null) {
            t4Var.invalidate();
        }
        if (oc1Var.l1 != null) {
            org.telegram.ui.ActionBar.b5 b5Var = oc1Var.parentLayout;
            if (b5Var == null || b5Var.getBottomSheet() == null) {
                oc1Var.setNavigationBarColor(oc1Var.getThemedColor(org.telegram.ui.ActionBar.f6.h5));
            } else {
                oc1Var.parentLayout.getBottomSheet().fixNavigationBar(oc1Var.getThemedColor(org.telegram.ui.ActionBar.f6.h5));
                if (oc1Var.b == 2 && oc1Var.F1 != 0) {
                    oc1Var.parentLayout.getBottomSheet().setOverlayNavBarColor(-16777216);
                }
            }
        }
        if (oc1Var.F0 != null) {
            int i10 = 0;
            while (true) {
                org.telegram.ui.Components.o71[] o71VarArr = oc1Var.F0;
                if (i10 >= o71VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.o71 o71Var = o71VarArr[i10];
                if (o71Var != null) {
                    o71Var.invalidate();
                }
                i10++;
            }
        }
        if (oc1Var.G0 != null) {
            while (true) {
                org.telegram.ui.Components.o71[] o71VarArr2 = oc1Var.G0;
                if (i9 >= o71VarArr2.length) {
                    break;
                }
                org.telegram.ui.Components.o71 o71Var2 = o71VarArr2[i9];
                if (o71Var2 != null) {
                    o71Var2.invalidate();
                }
                i9++;
            }
        }
        TextView textView = oc1Var.a2;
        if (textView != null) {
            textView.setTextColor(oc1Var.getThemedColor(org.telegram.ui.ActionBar.f6.G6));
        }
        org.telegram.ui.Components.cq cqVar = oc1Var.R;
        if (cqVar != null) {
            cqVar.invalidate();
        }
        org.telegram.ui.Components.j10 j10Var = oc1Var.l0;
        if (j10Var != null) {
            j10Var.g();
        }
    }

    public static void W(oc1 oc1Var, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (oc1Var.getParentActivity() == null) {
            return;
        }
        zf.j0 j0Var = new zf.j0(23, oc1Var.currentAccount, oc1Var.getParentActivity(), oc1Var, oc1Var.a);
        j0Var.G1(canApplyBoost);
        j0Var.F1(oc1Var.R1, true);
        j0Var.H1(oc1Var.F1);
        if (!oc1Var.U0()) {
            j0Var.M0 = new ab1(oc1Var, 1);
        }
        oc1Var.showDialog(j0Var);
    }

    public final void M0() {
        AnimatorSet animatorSet = this.x0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.x0 = animatorSet2;
        int i9 = 1;
        if (this.A1) {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.t0, (Property<dc1, Float>) View.SCALE_X, this.u1), ObjectAnimator.ofFloat(this.t0, (Property<dc1, Float>) View.SCALE_Y, this.u1));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.t0, (Property<dc1, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.t0, (Property<dc1, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.t0, (Property<dc1, Float>) View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.t0, (Property<dc1, Float>) View.TRANSLATION_Y, 0.0f));
        }
        this.x0.setInterpolator(org.telegram.ui.Components.gr.g);
        this.x0.addListener(new sb1(this, i9));
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
        int i9;
        TLRPC.TL_wallPaper tL_wallPaper;
        int i10;
        int i11;
        int i12;
        int i13;
        File pathToAttach;
        File file2;
        int i14;
        int i15;
        Object obj4;
        long j10;
        TLRPC.TL_wallPaper tL_wallPaper2;
        boolean z15;
        float f10;
        TLRPC.UserFull userFull;
        int i16 = 1;
        if (this.F1 < 0) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.R1;
            if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < R0()) {
                getMessagesController().getBoostsController().userCanBoostChannel(this.F1, this.R1, new fb1(this, i16));
                return;
            } else if (this.R1 == null) {
                return;
            }
        }
        if (!getUserConfig().isPremium() && z10) {
            showDialog(new zf.x0((org.telegram.ui.ActionBar.o2) this, 22, true));
            return;
        }
        org.telegram.ui.ActionBar.e6 e6Var = org.telegram.ui.ActionBar.f6.I;
        String j11 = e6Var.j(null, this.B1);
        int i17 = 0;
        String j12 = this.B1 ? e6Var.j(null, false) : j11;
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
                        int i18 = 45;
                        if (obj3 instanceof TLRPC.TL_wallPaper) {
                        }
                        i10 = 45;
                        i11 = 0;
                        i12 = 0;
                        i13 = 0;
                        org.telegram.ui.ActionBar.y5 y5Var = new org.telegram.ui.ActionBar.y5();
                        y5Var.a = j12;
                        y5Var.b = j11;
                        y5Var.c = str;
                        y5Var.i = this.B1;
                        y5Var.j = this.A1;
                        y5Var.d = i11;
                        y5Var.e = i13;
                        y5Var.f = i12;
                        y5Var.g = i9;
                        y5Var.h = i10;
                        if (this.I1) {
                        }
                        y5Var.k = this.h1;
                        obj4 = this.x1;
                        if (obj4 instanceof xh1) {
                        }
                        j10 = this.F1;
                        y5Var.n = j10;
                        if (j10 != 0) {
                        }
                        y5Var.o = z10;
                        MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, y5Var, str == null && this.F1 == 0, 0L);
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
            boolean z16 = obj5 instanceof xh1;
            if (z16) {
                if (this.S0 != null) {
                    try {
                        Bitmap bitmap2 = this.t0.getImageReceiver().getBitmap();
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap2.getWidth(), bitmap2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        if (this.Y0 == 0) {
                            if (this.X0 != 0) {
                                GradientDrawable gradientDrawable = new GradientDrawable(org.telegram.ui.Components.n9.d(this.d1), new int[]{this.V0, this.X0});
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
                    } catch (Throwable th) {
                        FileLog.e(th);
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
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                            z11 = false;
                        }
                    }
                    obj3 = this.x1;
                    int i182 = 45;
                    if (obj3 instanceof TLRPC.TL_wallPaper) {
                        if (obj3 instanceof xh1) {
                            if ("d".equals(((xh1) obj3).a)) {
                                str = "d";
                                i14 = 0;
                                i15 = 0;
                                i13 = 0;
                            } else {
                                TLRPC.TL_wallPaper tL_wallPaper3 = this.S0;
                                String str2 = tL_wallPaper3 != null ? tL_wallPaper3.slug : "c";
                                int i19 = this.V0;
                                i13 = this.X0;
                                i14 = this.Y0;
                                i15 = this.Z0;
                                i182 = this.d1;
                                i17 = i19;
                                str = str2;
                            }
                            int i20 = i182;
                            z13 = z11;
                            i9 = i15;
                            i12 = i14;
                            i11 = i17;
                            i10 = i20;
                            z14 = z12;
                            tL_wallPaper = null;
                        } else {
                            if (obj3 instanceof yh1) {
                                yh1 yh1Var = (yh1) obj3;
                                str = yh1Var.a;
                                pathToAttach = yh1Var.d;
                            } else if (obj3 instanceof MediaController.SearchImage) {
                                MediaController.SearchImage searchImage = (MediaController.SearchImage) obj3;
                                TLRPC.Photo photo = searchImage.photo;
                                pathToAttach = photo != null ? FileLoader.getInstance(this.currentAccount).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, this.D1, true), true) : ImageLoader.getHttpFilePath(searchImage.imageUrl, "jpg");
                                str = "";
                            } else {
                                z13 = z11;
                                z14 = z12;
                                str = "d";
                                i9 = 0;
                                tL_wallPaper = null;
                                i10 = 45;
                                i11 = 0;
                                i12 = 0;
                                i13 = 0;
                            }
                            z13 = z11;
                            z14 = z12;
                            file2 = pathToAttach;
                            i9 = 0;
                            tL_wallPaper = null;
                        }
                        file2 = null;
                        org.telegram.ui.ActionBar.y5 y5Var2 = new org.telegram.ui.ActionBar.y5();
                        y5Var2.a = j12;
                        y5Var2.b = j11;
                        y5Var2.c = str;
                        y5Var2.i = this.B1;
                        y5Var2.j = this.A1;
                        y5Var2.d = i11;
                        y5Var2.e = i13;
                        y5Var2.f = i12;
                        y5Var2.g = i9;
                        y5Var2.h = i10;
                        if (this.I1) {
                            float f11 = this.j1;
                            if (f11 >= 0.0f) {
                                y5Var2.k = f11;
                                obj4 = this.x1;
                                if (obj4 instanceof xh1) {
                                    xh1 xh1Var = (xh1) obj4;
                                    String str3 = ("c".equals(str) || "t".equals(str) || "d".equals(str)) ? null : str;
                                    float f12 = xh1Var.h;
                                    if (f12 < 0.0f && !org.telegram.ui.ActionBar.f6.I.q()) {
                                        f12 *= -1.0f;
                                    }
                                    if (xh1Var.l != null && xh1Var.b == i11 && xh1Var.c == i13 && xh1Var.d == i12 && xh1Var.e == i9 && TextUtils.equals(xh1Var.a, str3) && xh1Var.f == i10 && (this.S0 == null || Math.abs(f12 - this.h1) < 0.001f)) {
                                        TLRPC.WallPaper wallPaper = xh1Var.l;
                                        y5Var2.l = wallPaper.id;
                                        y5Var2.m = wallPaper.access_hash;
                                    }
                                }
                                j10 = this.F1;
                                y5Var2.n = j10;
                                if (j10 != 0 && (userFull = getMessagesController().getUserFull(this.F1)) != null) {
                                    y5Var2.t = userFull.wallpaper;
                                }
                                y5Var2.o = z10;
                                MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, y5Var2, str == null && this.F1 == 0, 0L);
                                if (z13) {
                                    if (this.F1 != 0) {
                                        if (file2 == null || getMessagesController().uploadingWallpaperInfo != y5Var2) {
                                            ChatThemeController.getInstance(this.currentAccount).setWallpaperToPeer(this.F1, null, y5Var2, this.m0, new bg.d2(23));
                                        } else {
                                            tL_wallPaper = new TLRPC.TL_wallPaper();
                                            TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
                                            tL_wallPaper.settings = tL_wallPaperSettings;
                                            tL_wallPaperSettings.intensity = (int) (y5Var2.k * 100.0f);
                                            tL_wallPaperSettings.blur = y5Var2.i;
                                            tL_wallPaperSettings.motion = y5Var2.j;
                                            tL_wallPaper.uploadingImage = file2.getAbsolutePath();
                                            Bitmap createBitmap2 = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                                            Canvas canvas2 = new Canvas(createBitmap2);
                                            float max = Math.max(50.0f / this.t0.getMeasuredWidth(), 50.0f / this.t0.getMeasuredHeight());
                                            canvas2.scale(max, max);
                                            if (this.t0.getMeasuredHeight() > this.t0.getMeasuredWidth()) {
                                                f10 = 0.0f;
                                                canvas2.translate(0.0f, (-(this.t0.getMeasuredHeight() - this.t0.getMeasuredWidth())) / 2.0f);
                                            } else {
                                                f10 = 0.0f;
                                                canvas2.translate((-(this.t0.getMeasuredWidth() - this.t0.getMeasuredHeight())) / 2.0f, 0.0f);
                                            }
                                            float f13 = this.j1;
                                            this.j1 = f10;
                                            this.t0.draw(canvas2);
                                            this.j1 = f13;
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
                                                    int i21 = NotificationCenter.chatInfoDidLoad;
                                                    Boolean bool = Boolean.FALSE;
                                                    notificationCenter.lambda$postNotificationNameOnUIThread$1(i21, chatFull, 0, bool, bool);
                                                }
                                            }
                                        }
                                        this.Z1 = true;
                                        nc1 nc1Var = this.E1;
                                        if (nc1Var != null) {
                                            nc1Var.a(tL_wallPaper);
                                        }
                                        finishFragment();
                                        tL_wallPaper2 = tL_wallPaper;
                                        z15 = false;
                                        if (z15) {
                                            nc1 nc1Var2 = this.E1;
                                            if (nc1Var2 != null) {
                                                nc1Var2.a(tL_wallPaper2);
                                            }
                                            finishFragment();
                                            return;
                                        }
                                        return;
                                    }
                                    org.telegram.ui.ActionBar.f6.c0 = getThemedColor(org.telegram.ui.ActionBar.f6.lc);
                                    org.telegram.ui.ActionBar.f6.I.v("t".equals(y5Var2.c) ? null : y5Var2);
                                    org.telegram.ui.ActionBar.f6.o1(true);
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
                        y5Var2.k = this.h1;
                        obj4 = this.x1;
                        if (obj4 instanceof xh1) {
                        }
                        j10 = this.F1;
                        y5Var2.n = j10;
                        if (j10 != 0) {
                            y5Var2.t = userFull.wallpaper;
                        }
                        y5Var2.o = z10;
                        MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, y5Var2, str == null && this.F1 == 0, 0L);
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
                        i9 = 0;
                    }
                    i10 = 45;
                    i11 = 0;
                    i12 = 0;
                    i13 = 0;
                    org.telegram.ui.ActionBar.y5 y5Var22 = new org.telegram.ui.ActionBar.y5();
                    y5Var22.a = j12;
                    y5Var22.b = j11;
                    y5Var22.c = str;
                    y5Var22.i = this.B1;
                    y5Var22.j = this.A1;
                    y5Var22.d = i11;
                    y5Var22.e = i13;
                    y5Var22.f = i12;
                    y5Var22.g = i9;
                    y5Var22.h = i10;
                    if (this.I1) {
                    }
                    y5Var22.k = this.h1;
                    obj4 = this.x1;
                    if (obj4 instanceof xh1) {
                    }
                    j10 = this.F1;
                    y5Var22.n = j10;
                    if (j10 != 0) {
                    }
                    y5Var22.o = z10;
                    MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, y5Var22, str == null && this.F1 == 0, 0L);
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
            } else if (obj5 instanceof yh1) {
                yh1 yh1Var2 = (yh1) obj5;
                if (yh1Var2.b != 0 || "t".equals(yh1Var2.a)) {
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
                            File file4 = yh1Var2.e;
                            file = file4 != null ? file4 : yh1Var2.d;
                        } else {
                            Bitmap createBitmap3 = Bitmap.createBitmap((int) this.V1, this.y1.getHeight(), Bitmap.Config.ARGB_8888);
                            Canvas canvas3 = new Canvas(createBitmap3);
                            canvas3.translate(-((this.T1 / this.S1) * (this.y1.getWidth() - createBitmap3.getWidth())), 0.0f);
                            z16 = false;
                            canvas3.drawBitmap(this.y1, 0.0f, 0.0f, (Paint) null);
                            yh1Var2.d = new File(FileLoader.getDirectory(4), Utilities.random.nextInt() + ".jpg");
                            FileOutputStream fileOutputStream5 = new FileOutputStream(yh1Var2.d);
                            createBitmap3.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream5);
                            fileOutputStream5.close();
                            createBitmap3.recycle();
                            file = yh1Var2.d;
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
                                int i1822 = 45;
                                if (obj3 instanceof TLRPC.TL_wallPaper) {
                                }
                                i10 = 45;
                                i11 = 0;
                                i12 = 0;
                                i13 = 0;
                                org.telegram.ui.ActionBar.y5 y5Var222 = new org.telegram.ui.ActionBar.y5();
                                y5Var222.a = j12;
                                y5Var222.b = j11;
                                y5Var222.c = str;
                                y5Var222.i = this.B1;
                                y5Var222.j = this.A1;
                                y5Var222.d = i11;
                                y5Var222.e = i13;
                                y5Var222.f = i12;
                                y5Var222.g = i9;
                                y5Var222.h = i10;
                                if (this.I1) {
                                }
                                y5Var222.k = this.h1;
                                obj4 = this.x1;
                                if (obj4 instanceof xh1) {
                                }
                                j10 = this.F1;
                                y5Var222.n = j10;
                                if (j10 != 0) {
                                }
                                y5Var222.o = z10;
                                MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, y5Var222, str == null && this.F1 == 0, 0L);
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
                        int i18222 = 45;
                        if (obj3 instanceof TLRPC.TL_wallPaper) {
                        }
                        i10 = 45;
                        i11 = 0;
                        i12 = 0;
                        i13 = 0;
                        org.telegram.ui.ActionBar.y5 y5Var2222 = new org.telegram.ui.ActionBar.y5();
                        y5Var2222.a = j12;
                        y5Var2222.b = j11;
                        y5Var2222.c = str;
                        y5Var2222.i = this.B1;
                        y5Var2222.j = this.A1;
                        y5Var2222.d = i11;
                        y5Var2222.e = i13;
                        y5Var2222.f = i12;
                        y5Var2222.g = i9;
                        y5Var2222.h = i10;
                        if (this.I1) {
                        }
                        y5Var2222.k = this.h1;
                        obj4 = this.x1;
                        if (obj4 instanceof xh1) {
                        }
                        j10 = this.F1;
                        y5Var2222.n = j10;
                        if (j10 != 0) {
                        }
                        y5Var2222.o = z10;
                        MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, y5Var2222, str == null && this.F1 == 0, 0L);
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
                    int i182222 = 45;
                    if (obj3 instanceof TLRPC.TL_wallPaper) {
                    }
                    i10 = 45;
                    i11 = 0;
                    i12 = 0;
                    i13 = 0;
                    org.telegram.ui.ActionBar.y5 y5Var22222 = new org.telegram.ui.ActionBar.y5();
                    y5Var22222.a = j12;
                    y5Var22222.b = j11;
                    y5Var22222.c = str;
                    y5Var22222.i = this.B1;
                    y5Var22222.j = this.A1;
                    y5Var22222.d = i11;
                    y5Var22222.e = i13;
                    y5Var22222.f = i12;
                    y5Var22222.g = i9;
                    y5Var22222.h = i10;
                    if (this.I1) {
                    }
                    y5Var22222.k = this.h1;
                    obj4 = this.x1;
                    if (obj4 instanceof xh1) {
                    }
                    j10 = this.F1;
                    y5Var22222.n = j10;
                    if (j10 != 0) {
                    }
                    y5Var22222.o = z10;
                    MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, y5Var22222, str == null && this.F1 == 0, 0L);
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
        int i1822222 = 45;
        if (obj3 instanceof TLRPC.TL_wallPaper) {
        }
        i10 = 45;
        i11 = 0;
        i12 = 0;
        i13 = 0;
        org.telegram.ui.ActionBar.y5 y5Var222222 = new org.telegram.ui.ActionBar.y5();
        y5Var222222.a = j12;
        y5Var222222.b = j11;
        y5Var222222.c = str;
        y5Var222222.i = this.B1;
        y5Var222222.j = this.A1;
        y5Var222222.d = i11;
        y5Var222222.e = i13;
        y5Var222222.f = i12;
        y5Var222222.g = i9;
        y5Var222222.h = i10;
        if (this.I1) {
        }
        y5Var222222.k = this.h1;
        obj4 = this.x1;
        if (obj4 instanceof xh1) {
        }
        j10 = this.F1;
        y5Var222222.n = j10;
        if (j10 != 0) {
        }
        y5Var222222.o = z10;
        MessagesController.getInstance(this.currentAccount).saveWallpaperToServer(file2, y5Var222222, str == null && this.F1 == 0, 0L);
        if (z13) {
        }
        tL_wallPaper2 = tL_wallPaper;
        z15 = true;
        if (z15) {
        }
    }

    public final void O0(boolean z10) {
        int i9 = this.b;
        if (i9 == 2) {
            if (z10) {
                return;
            }
            finishFragment();
            return;
        }
        org.telegram.ui.ActionBar.f6.o();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        org.telegram.ui.ActionBar.d6 d6Var = this.s;
        if (i9 == 1) {
            if (this.c0) {
                d6Var.c = this.w;
                d6Var.d = this.x;
                d6Var.e = this.y;
                d6Var.f = this.A;
                d6Var.g = this.B;
                d6Var.h = this.C;
                d6Var.i = this.D;
                d6Var.j = this.E;
                d6Var.k = this.F;
                d6Var.l = this.G;
                d6Var.m = this.H;
                d6Var.n = this.K;
                d6Var.o = this.J;
                d6Var.p = this.I;
            }
            org.telegram.ui.ActionBar.f6.t1(this.a0, false, true, false, false, false);
        } else {
            if (d6Var != null) {
                org.telegram.ui.ActionBar.f6.t1(this.a0, false, this.d0, false, false, false);
            }
            ((ActionBarLayout) this.parentLayout).U(false, false);
            if (this.d0) {
                org.telegram.ui.ActionBar.e6 e6Var = this.a0;
                if (e6Var.b != null && org.telegram.ui.ActionBar.f6.H.get(e6Var.m()) == null) {
                    new File(e6Var.b).delete();
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
            org.telegram.ui.ActionBar.d6 d6Var = this.s;
            if (d6Var.c == this.w && d6Var.d == this.x && d6Var.e == this.y && d6Var.f == this.A && d6Var.g == this.B && d6Var.h == this.C && d6Var.i == this.D && d6Var.j == this.E && d6Var.k == this.F && d6Var.l == this.G && d6Var.m == this.H && Math.abs(d6Var.p - this.I) <= 0.001f && d6Var.n == this.K) {
                String str = d6Var.o;
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
            alertDialog$Builder.k(LocaleController.getString(R.string.Save), new cb1(this, 3));
            alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new cb1(this, 4));
            showDialog(alertDialog$Builder.a);
            return false;
        }
        return true;
    }

    public final int R0() {
        return ChatObject.isChannelAndNotMegaGroup(-this.F1, this.currentAccount) ? getMessagesController().channelCustomWallpaperLevelMin : getMessagesController().groupCustomWallpaperLevelMin;
    }

    public final ArrayList S0() {
        sx0 sx0Var = new sx0(7, this);
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.i0;
        int i9 = org.telegram.ui.ActionBar.f6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(frameLayout, 1, null, null, null, sx0Var, i9));
        m2.g gVar = this.f0;
        int i10 = org.telegram.ui.ActionBar.f6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.h6(gVar, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.f6.t8;
        arrayList.add(new org.telegram.ui.ActionBar.h6(kVar, 256, null, null, null, null, i11));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.f6.A8;
        arrayList.add(new org.telegram.ui.ActionBar.h6(kVar2, 128, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, TLObject.FLAG_27, null, null, null, null, org.telegram.ui.ActionBar.f6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.f6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.o0, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.o0, 128, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.o0, 1024, null, null, null, null, org.telegram.ui.ActionBar.f6.B8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.o0, 256, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.o0, TLObject.FLAG_31, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.o0, TLObject.FLAG_30, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.j0, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.q0, 32768, null, null, null, null, i10));
        if (!this.d) {
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.X, 1, null, null, null, null, i9));
            TextView textView = this.Z;
            int i13 = org.telegram.ui.ActionBar.f6.Ae;
            arrayList.add(new org.telegram.ui.ActionBar.h6(textView, 4, null, null, null, null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.Y, 4, null, null, null, null, i13));
        }
        org.telegram.ui.Components.cq cqVar = this.R;
        if (cqVar != null) {
            org.telegram.ui.ActionBar.w0 w0Var = cqVar.E;
            EditTextBoldCursor[] editTextBoldCursorArr = cqVar.A;
            for (int i14 = 0; i14 < editTextBoldCursorArr.length; i14++) {
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i14];
                int i15 = org.telegram.ui.ActionBar.f6.G6;
                arrayList.add(new org.telegram.ui.ActionBar.h6(editTextBoldCursor, 4, null, null, null, null, i15));
                arrayList.add(new org.telegram.ui.ActionBar.h6(editTextBoldCursorArr[i14], 16777216, null, null, null, null, i15));
                arrayList.add(new org.telegram.ui.ActionBar.h6(editTextBoldCursorArr[i14], TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.f6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.h6(editTextBoldCursorArr[i14], 8390656, null, null, null, null, org.telegram.ui.ActionBar.f6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.h6(editTextBoldCursorArr[i14], 32, null, null, null, null, org.telegram.ui.ActionBar.f6.k6));
                arrayList.add(new org.telegram.ui.ActionBar.h6(editTextBoldCursorArr[i14], 65568, null, null, null, null, org.telegram.ui.ActionBar.f6.l6));
            }
            org.telegram.ui.ActionBar.l0 l0Var = cqVar.B;
            int i16 = org.telegram.ui.ActionBar.f6.G6;
            arrayList.add(new org.telegram.ui.ActionBar.h6(l0Var, 8, null, null, null, null, i16));
            org.telegram.ui.ActionBar.l0 l0Var2 = cqVar.B;
            int i17 = org.telegram.ui.ActionBar.f6.I5;
            arrayList.add(new org.telegram.ui.ActionBar.h6(l0Var2, 32, null, null, null, null, i17));
            if (w0Var != null) {
                org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(cqVar, 3);
                arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var, 0, null, null, null, s6Var, i16));
                arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var, 0, null, null, null, s6Var, i17));
                arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.E8));
                arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.F8));
                arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.G8));
            }
        }
        FrameLayout[] frameLayoutArr = this.H0;
        if (frameLayoutArr != null) {
            for (int i18 = 0; i18 < frameLayoutArr.length; i18++) {
                arrayList.add(new org.telegram.ui.ActionBar.h6(frameLayoutArr[i18], 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.i3}, null, org.telegram.ui.ActionBar.f6.Td));
                arrayList.add(new org.telegram.ui.ActionBar.h6(frameLayoutArr[i18], 0, null, org.telegram.ui.ActionBar.f6.j2, null, null, org.telegram.ui.ActionBar.f6.Sd));
            }
            int i19 = 0;
            while (true) {
                FrameLayout[] frameLayoutArr2 = this.K0;
                if (i19 >= frameLayoutArr2.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.h6(frameLayoutArr2[i19], 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.i3}, null, org.telegram.ui.ActionBar.f6.Td));
                arrayList.add(new org.telegram.ui.ActionBar.h6(frameLayoutArr2[i19], 0, null, org.telegram.ui.ActionBar.f6.j2, null, null, org.telegram.ui.ActionBar.f6.Sd));
                i19++;
            }
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.y0, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.i3}, null, org.telegram.ui.ActionBar.f6.Td));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.y0, 0, null, org.telegram.ui.ActionBar.f6.j2, null, null, org.telegram.ui.ActionBar.f6.Sd));
            int i20 = 0;
            while (true) {
                TextView[] textViewArr = this.J0;
                if (i20 >= textViewArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.h6(textViewArr[i20], 4, null, null, null, null, org.telegram.ui.ActionBar.f6.Ae));
                i20++;
            }
            int i21 = 0;
            while (true) {
                TextView[] textViewArr2 = this.I0;
                if (i21 >= textViewArr2.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.h6(textViewArr2[i21], 4, null, null, null, null, org.telegram.ui.ActionBar.f6.Ae));
                i21++;
            }
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.P0, 0, new Class[]{org.telegram.ui.Components.pn0.class}, new String[]{"innerPaint1"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Ti));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.P0, 0, new Class[]{org.telegram.ui.Components.pn0.class}, new String[]{"outerPaint1"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Vi));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.O0, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.L6));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.m3, org.telegram.ui.ActionBar.f6.q3}, null, org.telegram.ui.ActionBar.f6.ra));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.n3, org.telegram.ui.ActionBar.f6.r3}, null, org.telegram.ui.ActionBar.f6.dc));
            Drawable[] drawableArr = org.telegram.ui.ActionBar.f6.m3.y;
            int i22 = org.telegram.ui.ActionBar.f6.ta;
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, drawableArr, null, i22));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.f6.q3.y, null, i22));
            org.telegram.ui.ActionBar.n5 n5Var = this.N;
            org.telegram.ui.ActionBar.n5 n5Var2 = this.P;
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{n5Var, n5Var2}, null, org.telegram.ui.ActionBar.f6.Aa));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{n5Var, n5Var2}, null, org.telegram.ui.ActionBar.f6.Da));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{n5Var, n5Var2}, null, org.telegram.ui.ActionBar.f6.Ea));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{n5Var, n5Var2}, null, org.telegram.ui.ActionBar.f6.Fa));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.p3, org.telegram.ui.ActionBar.f6.t3}, null, org.telegram.ui.ActionBar.f6.Ba));
            Drawable[] drawableArr2 = org.telegram.ui.ActionBar.f6.o3.y;
            int i23 = org.telegram.ui.ActionBar.f6.Ca;
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, drawableArr2, null, i23));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.f6.s3.y, null, i23));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.ec));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.fc));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.y3}, null, org.telegram.ui.ActionBar.f6.Ja));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.z3}, null, org.telegram.ui.ActionBar.f6.Ka));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.A3, org.telegram.ui.ActionBar.f6.C3}, null, org.telegram.ui.ActionBar.f6.La));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.B3, org.telegram.ui.ActionBar.f6.D3}, null, org.telegram.ui.ActionBar.f6.Ma));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.F3, org.telegram.ui.ActionBar.f6.G3}, null, org.telegram.ui.ActionBar.f6.sc));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Uc));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.ab));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Wc));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.cb));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Yc));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.db));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.ad));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.fb));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.nd));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.sb));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.od));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.q0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.nb));
        }
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, -1, sx0Var, org.telegram.ui.ActionBar.f6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, -1, sx0Var, org.telegram.ui.ActionBar.f6.h5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, -1, sx0Var, org.telegram.ui.ActionBar.f6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, -1, sx0Var, org.telegram.ui.ActionBar.f6.i5));
        for (int i24 = 0; i24 < arrayList.size(); i24++) {
            ((org.telegram.ui.ActionBar.h6) arrayList.get(i24)).o = this.a;
        }
        return arrayList;
    }

    public final boolean T0(int i9) {
        int B0;
        long j10;
        if (this.c0) {
            return false;
        }
        org.telegram.ui.ActionBar.d6 d6Var = this.s;
        if (i9 == 1 || i9 == 2) {
            long j11 = this.E;
            if (j11 == 0) {
                int B02 = org.telegram.ui.ActionBar.f6.B0(org.telegram.ui.ActionBar.f6.Nd);
                int i10 = (int) d6Var.j;
                if (i10 == 0) {
                    i10 = B02;
                }
                if (i10 != B02) {
                    return true;
                }
            } else if (j11 != d6Var.j) {
                return true;
            }
            long j12 = this.H;
            long j13 = this.G;
            long j14 = this.F;
            if (j14 == 0 && j13 == 0 && j12 == 0) {
                for (int i11 = 0; i11 < 3; i11++) {
                    if (i11 == 0) {
                        B0 = org.telegram.ui.ActionBar.f6.B0(org.telegram.ui.ActionBar.f6.Od);
                        j10 = d6Var.k;
                    } else if (i11 == 1) {
                        B0 = org.telegram.ui.ActionBar.f6.B0(org.telegram.ui.ActionBar.f6.Pd);
                        j10 = d6Var.l;
                    } else {
                        B0 = org.telegram.ui.ActionBar.f6.B0(org.telegram.ui.ActionBar.f6.Qd);
                        j10 = d6Var.m;
                    }
                    int i12 = (int) j10;
                    if (i12 == 0 && j10 != 0) {
                        i12 = 0;
                    } else if (i12 == 0) {
                        i12 = B0;
                    }
                    if (i12 != B0) {
                        return true;
                    }
                }
            } else if (j14 != d6Var.k || j13 != d6Var.l || j12 != d6Var.m) {
                return true;
            }
            if (d6Var.n != this.K) {
                return true;
            }
        }
        if (i9 == 1 || i9 == 3) {
            if (this.w != d6Var.d) {
                return true;
            }
            int i13 = this.y;
            if (i13 == 0) {
                int i14 = d6Var.e;
                if (i14 != 0 && i14 != d6Var.c) {
                    return true;
                }
            } else if (i13 != d6Var.e) {
                return true;
            }
            int i15 = this.A;
            if (i15 != 0) {
                if (i15 != d6Var.f) {
                    return true;
                }
            } else if (d6Var.f != 0) {
                return true;
            }
            int i16 = this.B;
            if (i16 != 0) {
                if (i16 != d6Var.g) {
                    return true;
                }
            } else if (d6Var.g != 0) {
                return true;
            }
            int i17 = this.C;
            if (i17 != 0) {
                if (i17 != d6Var.h) {
                    return true;
                }
            } else if (d6Var.h != 0) {
                return true;
            }
            if (this.D != d6Var.i) {
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
        bh.g gVar = this.M1;
        if (gVar != null) {
            gVar.invalidate();
        }
        FrameLayout frameLayout = this.u0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                this.u0.getChildAt(i9).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.v0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i10 = 0; i10 < childCount2; i10++) {
                this.v0.getChildAt(i10).invalidate();
            }
        }
        if (this.F0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.o71[] o71VarArr = this.F0;
                if (i11 >= o71VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.o71 o71Var = o71VarArr[i11];
                if (o71Var != null) {
                    o71Var.setDimAmount(this.I1 ? this.j1 * this.k1 : 0.0f);
                    this.F0[i11].invalidate();
                }
                i11++;
            }
        }
        if (this.j0 != null) {
            for (int i12 = 0; i12 < this.j0.getChildCount(); i12++) {
                View childAt = this.j0.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.w0) {
                    d1((org.telegram.ui.Cells.w0) childAt);
                    childAt.invalidate();
                }
            }
        }
        if (this.q0 != null) {
            for (int i13 = 0; i13 < this.q0.getChildCount(); i13++) {
                View childAt2 = this.q0.getChildAt(i13);
                if (childAt2 instanceof org.telegram.ui.Cells.w0) {
                    d1((org.telegram.ui.Cells.w0) childAt2);
                    childAt2.invalidate();
                }
            }
        }
        ec1 ec1Var = this.v1;
        if (ec1Var != null) {
            ec1Var.invalidate();
        }
        ec1 ec1Var2 = this.w1;
        if (ec1Var2 != null) {
            ec1Var2.invalidate();
        }
        t4 t4Var = this.y0;
        if (t4Var != null) {
            t4Var.invalidate();
        }
    }

    public final void W0() {
        org.telegram.ui.ActionBar.d6 d6Var = this.s;
        if (d6Var == null || TextUtils.isEmpty(d6Var.o)) {
            return;
        }
        try {
            File d = d6Var.d();
            Drawable background = this.t0.getBackground();
            Bitmap bitmap = this.t0.getImageReceiver().getBitmap();
            if (background instanceof org.telegram.ui.Components.jb0) {
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
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public final void X0() {
        Y0(2, true);
    }

    public final void Y0(int i9, boolean z10) {
        org.telegram.ui.ActionBar.d6 d6Var;
        int i10;
        int i11;
        if (getParentActivity() == null || this.n == i9 || this.n1 != null || (d6Var = this.s) == null) {
            return;
        }
        if (z10 && i9 == 2 && (org.telegram.ui.ActionBar.f6.Z0() || d6Var.j == 4294967296L)) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.N = LocaleController.getString(R.string.ChangeChatBackground);
            if (!org.telegram.ui.ActionBar.f6.Z0() || (org.telegram.ui.ActionBar.f6.Z0() && org.telegram.ui.ActionBar.f6.I.e0.d != 0)) {
                alertDialog$Builder.a.P = LocaleController.getString(R.string.ChangeColorToColor);
                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new cb1(this, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Continue), new cb1(this, 6));
            } else {
                alertDialog$Builder.a.P = LocaleController.getString(R.string.ChangeWallpaperToColor);
                alertDialog$Builder.k(LocaleController.getString(R.string.Change), new cb1(this, 7));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            }
            showDialog(alertDialog$Builder.a);
            return;
        }
        int i12 = this.n;
        this.n = i9;
        if (i9 == 1) {
            this.h.setText(LocaleController.getString(R.string.ColorPickerMainColor));
            int i13 = d6Var.d != 0 ? 2 : 1;
            org.telegram.ui.Components.cq cqVar = this.R;
            T0(1);
            cqVar.f(1, 2, i13, false);
            this.R.e(d6Var.c, 0);
            int i14 = d6Var.d;
            if (i14 != 0) {
                this.R.e(i14, 1);
            }
            if (i12 == 2 || (i12 == 3 && d6Var.g != 0)) {
                this.r0.u(0);
            }
        } else if (i9 == 2) {
            this.h.setText(LocaleController.getString(R.string.ColorPickerBackground));
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.f6.Nd);
            int i15 = org.telegram.ui.ActionBar.f6.Od;
            int themedColor2 = org.telegram.ui.ActionBar.f6.c1(i15) ? getThemedColor(i15) : 0;
            int i16 = org.telegram.ui.ActionBar.f6.Pd;
            int themedColor3 = org.telegram.ui.ActionBar.f6.c1(i16) ? getThemedColor(i16) : 0;
            int i17 = org.telegram.ui.ActionBar.f6.Qd;
            int themedColor4 = org.telegram.ui.ActionBar.f6.c1(i17) ? getThemedColor(i17) : 0;
            long j10 = d6Var.k;
            int i18 = (int) j10;
            if (i18 == 0 && j10 != 0) {
                themedColor2 = 0;
            }
            long j11 = d6Var.l;
            int i19 = (int) j11;
            if (i19 == 0 && j11 != 0) {
                themedColor3 = 0;
            }
            long j12 = d6Var.m;
            int i20 = (int) j12;
            if (i20 == 0 && j12 != 0) {
                themedColor4 = 0;
            }
            int i21 = (int) d6Var.j;
            if (i18 == 0 && themedColor2 == 0) {
                i10 = i19;
                i11 = 1;
            } else if (i20 != 0 || themedColor4 != 0) {
                i10 = i19;
                i11 = 4;
            } else if (i19 == 0 && themedColor3 == 0) {
                i10 = i19;
                i11 = 2;
            } else {
                i10 = i19;
                i11 = 3;
            }
            org.telegram.ui.Components.cq cqVar2 = this.R;
            T0(2);
            cqVar2.f(2, 4, i11, false);
            org.telegram.ui.Components.cq cqVar3 = this.R;
            if (i20 == 0) {
                i20 = themedColor4;
            }
            cqVar3.e(i20, 3);
            org.telegram.ui.Components.cq cqVar4 = this.R;
            if (i10 != 0) {
                themedColor3 = i10;
            }
            cqVar4.e(themedColor3, 2);
            org.telegram.ui.Components.cq cqVar5 = this.R;
            if (i18 == 0) {
                i18 = themedColor2;
            }
            cqVar5.e(i18, 1);
            org.telegram.ui.Components.cq cqVar6 = this.R;
            if (i21 != 0) {
                themedColor = i21;
            }
            cqVar6.e(themedColor, 0);
            if (i12 == 1 || d6Var.g == 0) {
                this.r0.o(0);
            } else {
                this.r0.m(0);
            }
            this.q0.v0(0, AndroidUtilities.dp(60.0f), null);
        } else if (i9 == 3) {
            this.h.setText(LocaleController.getString(R.string.ColorPickerMyMessages));
            int i22 = d6Var.f != 0 ? d6Var.h != 0 ? 4 : d6Var.g != 0 ? 3 : 2 : 1;
            org.telegram.ui.Components.cq cqVar7 = this.R;
            T0(3);
            cqVar7.f(2, 4, i22, true);
            this.R.e(d6Var.h, 3);
            this.R.e(d6Var.g, 2);
            this.R.e(d6Var.f, 1);
            org.telegram.ui.Components.cq cqVar8 = this.R;
            int i23 = d6Var.e;
            if (i23 == 0) {
                i23 = d6Var.c;
            }
            cqVar8.e(i23, 0);
            this.G0[1].b(0, d6Var.e);
            this.G0[1].b(1, d6Var.f);
            this.G0[1].b(2, d6Var.g);
            this.G0[1].b(3, d6Var.h);
            if (d6Var.g != 0) {
                if (i12 == 1) {
                    this.r0.o(0);
                } else {
                    this.r0.m(0);
                }
            } else if (i12 == 2) {
                this.r0.u(0);
            }
            this.q0.v0(0, AndroidUtilities.dp(60.0f), null);
            e1();
        }
        if (i9 != 1 && i9 != 3) {
            this.R.setMinBrightness(0.0f);
            this.R.setMaxBrightness(1.0f);
            return;
        }
        if (i12 == 2 && this.H0[1].getVisibility() == 0) {
            f1(0, true, true);
        }
        if (i9 != 1) {
            this.R.setMinBrightness(0.0f);
            this.R.setMaxBrightness(1.0f);
        } else if (this.a0.q()) {
            this.R.setMinBrightness(0.2f);
        } else {
            this.R.setMinBrightness(0.05f);
            this.R.setMaxBrightness(0.8f);
        }
    }

    public final void Z0(int i9) {
        TLRPC.TL_wallPaper tL_wallPaper = (i9 < 0 || i9 >= this.Q0.size()) ? this.U0 : (TLRPC.TL_wallPaper) this.Q0.get(i9);
        if (tL_wallPaper == null) {
            return;
        }
        ValueAnimator valueAnimator = this.Y1;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.Y1.cancel();
        }
        dc1[] dc1VarArr = this.s0;
        dc1 dc1Var = dc1VarArr[0];
        dc1 dc1Var2 = dc1VarArr[1];
        dc1VarArr[0] = dc1Var2;
        dc1VarArr[1] = dc1Var;
        this.p0.removeView(dc1Var2);
        this.p0.addView(dc1VarArr[0], this.p0.indexOfChild(dc1VarArr[1]) + 1);
        dc1 dc1Var3 = dc1VarArr[0];
        this.t0 = dc1Var3;
        dc1Var3.setBackground(dc1VarArr[1].getBackground());
        k1();
        dc1VarArr[1].setVisibility(0);
        dc1VarArr[1].setAlpha(1.0f);
        this.t0.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.Y1 = ofFloat;
        ofFloat.addUpdateListener(new qi(2, this));
        this.Y1.addListener(new sb1(this, 0));
        this.Y1.setInterpolator(org.telegram.ui.Components.gr.f);
        this.Y1.setDuration(300L);
        this.Y1.start();
        this.t0.getImageReceiver().setCrossfadeDuration(300);
        this.t0.getImageReceiver().setImage(ImageLocation.getForDocument(tL_wallPaper.document), this.C1, null, null, null, tL_wallPaper.document.size, "jpg", tL_wallPaper, 1);
        this.t0.d();
        this.S0 = tL_wallPaper;
        this.A1 = this.F0[2].s;
        j1();
    }

    public final void a1(int i9, int i10, boolean z10) {
        org.telegram.ui.Components.jb0 jb0Var;
        if (i10 == 0) {
            this.V0 = i9;
        } else if (i10 == 1) {
            this.X0 = i9;
        } else if (i10 == 2) {
            this.Y0 = i9;
        } else if (i10 == 3) {
            this.Z0 = i9;
        }
        m1(z10);
        if (this.F0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.o71[] o71VarArr = this.F0;
                if (i11 >= o71VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.o71 o71Var = o71VarArr[i11];
                if (o71Var != null) {
                    o71Var.b(i10, i9);
                }
                i11++;
            }
        }
        if (this.Y0 != 0) {
            if (this.P0 != null && org.telegram.ui.ActionBar.f6.I.q()) {
                this.P0.setTwoSided(true);
            }
            Drawable background = this.t0.getBackground();
            if (background instanceof org.telegram.ui.Components.jb0) {
                jb0Var = (org.telegram.ui.Components.jb0) background;
            } else {
                jb0Var = new org.telegram.ui.Components.jb0();
                jb0Var.r(this.t0);
                if (this.z1) {
                    jb0Var.m(false);
                }
            }
            jb0Var.n(this.V0, this.X0, this.Y0, this.Z0);
            this.t0.setBackground(jb0Var);
            this.f1 = jb0Var.f();
            this.g1 = 754974720;
        } else if (this.X0 != 0) {
            this.t0.setBackground(new GradientDrawable(org.telegram.ui.Components.n9.d(this.d1), new int[]{this.V0, this.X0}));
            int patternColor = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(this.V0, this.X0));
            this.g1 = patternColor;
            this.f1 = patternColor;
        } else {
            this.t0.setBackgroundColor(this.V0);
            int patternColor2 = AndroidUtilities.getPatternColor(this.V0);
            this.g1 = patternColor2;
            this.f1 = patternColor2;
        }
        int i12 = org.telegram.ui.ActionBar.f6.lc;
        boolean c12 = org.telegram.ui.ActionBar.f6.c1(i12);
        ob1 ob1Var = this.a;
        if (!c12 || (this.t0.getBackground() instanceof org.telegram.ui.Components.jb0)) {
            ob1Var.b(this.t0.getBackground(), this.t0.getBackground(), Float.valueOf(this.h1));
        } else if (org.telegram.ui.ActionBar.f6.s0() instanceof org.telegram.ui.Components.jb0) {
            getThemedColor(i12);
            ob1Var.b(this.t0.getBackground(), this.t0.getBackground(), Float.valueOf(this.h1));
        }
        ImageView imageView = this.B0;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.f6.ic), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.C0;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.f6.ic), PorterDuff.Mode.MULTIPLY));
        }
        dc1 dc1Var = this.t0;
        if (dc1Var != null) {
            dc1Var.getImageReceiver().setColorFilter(new PorterDuffColorFilter(this.f1, this.o1));
            this.t0.getImageReceiver().setAlpha(Math.abs(this.h1));
            this.t0.invalidate();
            if (org.telegram.ui.ActionBar.f6.I.q() && (this.t0.getBackground() instanceof org.telegram.ui.Components.jb0)) {
                org.telegram.ui.Cells.j0 j0Var = this.P0;
                if (j0Var != null) {
                    j0Var.setTwoSided(true);
                }
                if (this.h1 < 0.0f) {
                    this.t0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.jb0) this.t0.getBackground()).k);
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
        ib1 ib1Var = this.q0;
        if (ib1Var != null) {
            ib1Var.f1();
        }
        FrameLayout frameLayout = this.u0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                this.u0.getChildAt(i13).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.v0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                this.v0.getChildAt(i14).invalidate();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b1(boolean z10) {
        ColorDrawable colorDrawable;
        org.telegram.ui.Components.jb0 jb0Var;
        org.telegram.ui.ActionBar.d6 d6Var = this.s;
        int i9 = this.b;
        if (i9 == 0 && d6Var == null) {
            this.t0.setBackground(org.telegram.ui.ActionBar.f6.r0());
        } else {
            if (i9 == 2) {
                Object obj = this.x1;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
                    TLRPC.PhotoSize closestPhotoSizeWithSize = z10 ? FileLoader.getClosestPhotoSizeWithSize(tL_wallPaper.document.thumbs, 100) : null;
                    BitmapDrawable bitmapDrawable = closestPhotoSizeWithSize instanceof TLRPC.TL_photoStrippedSize ? new BitmapDrawable(ImageLoader.getStrippedPhotoBitmap(closestPhotoSizeWithSize.bytes, "b")) : null;
                    dc1 dc1Var = this.t0;
                    dc1Var.a.setImage(ImageLocation.getForDocument(tL_wallPaper.document), this.C1, ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), "100_100_b", bitmapDrawable, tL_wallPaper.document.size, "jpg", tL_wallPaper, 1);
                    dc1Var.d();
                } else if (obj instanceof xh1) {
                    xh1 xh1Var = (xh1) obj;
                    int i10 = xh1Var.f;
                    int i11 = xh1Var.e;
                    int i12 = xh1Var.d;
                    int i13 = xh1Var.c;
                    int i14 = xh1Var.b;
                    this.d1 = i10;
                    a1(i14, 0, false);
                    if (i13 != 0) {
                        a1(i13, 1, false);
                    }
                    a1(i12, 2, false);
                    a1(i11, 3, false);
                    TLRPC.TL_wallPaper tL_wallPaper2 = this.S0;
                    if (tL_wallPaper2 != null) {
                        dc1 dc1Var2 = this.t0;
                        ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                        String str = this.C1;
                        TLRPC.TL_wallPaper tL_wallPaper3 = this.S0;
                        dc1Var2.k(forDocument, str, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                    } else if ("d".equals(xh1Var.a)) {
                        Point point = AndroidUtilities.displaySize;
                        int min = Math.min(point.x, point.y);
                        Point point2 = AndroidUtilities.displaySize;
                        this.t0.setImageBitmap(SvgHelper.getBitmap(R.raw.default_pattern, min, Math.max(point2.x, point2.y), Build.VERSION.SDK_INT >= 29 ? 1459617792 : org.telegram.ui.Components.jb0.g(i14, i13, i12, i11)));
                    }
                } else if (obj instanceof yh1) {
                    Bitmap bitmap = this.y1;
                    if (bitmap != null) {
                        this.t0.setImageBitmap(bitmap);
                    } else {
                        yh1 yh1Var = (yh1) obj;
                        File file = yh1Var.e;
                        if (file != null) {
                            this.t0.f(file.getAbsolutePath(), this.C1, null);
                        } else {
                            File file2 = yh1Var.d;
                            if (file2 != null) {
                                this.t0.f(file2.getAbsolutePath(), this.C1, null);
                            } else if ("t".equals(yh1Var.a)) {
                                dc1 dc1Var3 = this.t0;
                                dc1Var3.setImageDrawable(org.telegram.ui.ActionBar.f6.W0(dc1Var3, false));
                            } else {
                                int i15 = yh1Var.b;
                                if (i15 != 0) {
                                    this.t0.setImageResource(i15);
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
                        dc1 dc1Var4 = this.t0;
                        String str2 = searchImage.imageUrl;
                        String str3 = this.C1;
                        String str4 = searchImage.thumbUrl;
                        dc1Var4.getClass();
                        dc1Var4.m(ImageLocation.getForPath(str2), str3, ImageLocation.getForPath(str4), "100_100_b", null, null, 0, null);
                    }
                }
            } else if (d6Var == null) {
                this.t0.setBackground(org.telegram.ui.ActionBar.f6.r0());
            } else {
                org.telegram.ui.Components.i9 i9Var = this.q1;
                if (i9Var != null) {
                    i9Var.dispose();
                    this.q1 = null;
                }
                int B0 = org.telegram.ui.ActionBar.f6.B0(org.telegram.ui.ActionBar.f6.Nd);
                int i16 = (int) d6Var.j;
                if (i16 != 0) {
                    B0 = i16;
                }
                int B02 = org.telegram.ui.ActionBar.f6.B0(org.telegram.ui.ActionBar.f6.Od);
                long j10 = d6Var.k;
                int i17 = (int) j10;
                if (i17 == 0 && j10 != 0) {
                    B02 = 0;
                } else if (i17 != 0) {
                    B02 = i17;
                }
                int B03 = org.telegram.ui.ActionBar.f6.B0(org.telegram.ui.ActionBar.f6.Pd);
                long j11 = d6Var.l;
                int i18 = (int) j11;
                if (i18 == 0 && j11 != 0) {
                    B03 = 0;
                } else if (i18 != 0) {
                    B03 = i18;
                }
                int B04 = org.telegram.ui.ActionBar.f6.B0(org.telegram.ui.ActionBar.f6.Qd);
                long j12 = d6Var.m;
                int i19 = (int) j12;
                if (i19 == 0 && j12 != 0) {
                    B04 = 0;
                } else if (i19 != 0) {
                    B04 = i19;
                }
                if (TextUtils.isEmpty(d6Var.o) || org.telegram.ui.ActionBar.f6.Z0()) {
                    Drawable s02 = org.telegram.ui.ActionBar.f6.s0();
                    if (s02 != null) {
                        if (s02 instanceof org.telegram.ui.Components.jb0) {
                            ((org.telegram.ui.Components.jb0) s02).r(this.t0);
                        }
                        this.t0.setBackground(s02);
                    }
                } else {
                    if (B03 != 0) {
                        Drawable background = this.t0.getBackground();
                        if (background instanceof org.telegram.ui.Components.jb0) {
                            jb0Var = (org.telegram.ui.Components.jb0) background;
                        } else {
                            org.telegram.ui.Components.jb0 jb0Var2 = new org.telegram.ui.Components.jb0();
                            jb0Var2.r(this.t0);
                            jb0Var = jb0Var2;
                            if (this.z1) {
                                jb0Var2.m(false);
                                jb0Var = jb0Var2;
                            }
                        }
                        jb0Var.n(B0, B02, B03, B04);
                        colorDrawable = jb0Var;
                    } else if (B02 != 0) {
                        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(org.telegram.ui.Components.n9.d(d6Var.n), new int[]{B0, B02});
                        this.q1 = n9Var.f(m5.c0.m(0.5f, 3), new wb1(this, 0), 100L);
                        colorDrawable = n9Var;
                    } else {
                        colorDrawable = new ColorDrawable(B0);
                    }
                    this.t0.setBackground(colorDrawable);
                    TLRPC.TL_wallPaper tL_wallPaper4 = this.S0;
                    if (tL_wallPaper4 != null) {
                        dc1 dc1Var5 = this.t0;
                        ImageLocation forDocument2 = ImageLocation.getForDocument(tL_wallPaper4.document);
                        String str5 = this.C1;
                        TLRPC.TL_wallPaper tL_wallPaper5 = this.S0;
                        dc1Var5.k(forDocument2, str5, null, null, tL_wallPaper5.document.size, "jpg", tL_wallPaper5, 1);
                    }
                }
                if (B02 == 0) {
                    int patternColor = AndroidUtilities.getPatternColor(B0);
                    this.g1 = patternColor;
                    this.f1 = patternColor;
                } else if (B03 != 0) {
                    this.f1 = org.telegram.ui.Components.jb0.g(B0, B02, B03, B04);
                    this.g1 = 754974720;
                } else {
                    int patternColor2 = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(B0, B02));
                    this.g1 = patternColor2;
                    this.f1 = patternColor2;
                }
                dc1 dc1Var6 = this.t0;
                if (dc1Var6 != null) {
                    dc1Var6.getImageReceiver().setColorFilter(new PorterDuffColorFilter(this.f1, this.o1));
                    this.t0.getImageReceiver().setAlpha(Math.abs(this.h1));
                    this.t0.invalidate();
                    if (org.telegram.ui.ActionBar.f6.I.q() && (this.t0.getBackground() instanceof org.telegram.ui.Components.jb0)) {
                        org.telegram.ui.Cells.j0 j0Var = this.P0;
                        if (j0Var != null) {
                            j0Var.setTwoSided(true);
                        }
                        if (this.h1 < 0.0f) {
                            this.t0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.jb0) this.t0.getBackground()).k);
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
                    int i20 = 0;
                    while (true) {
                        org.telegram.ui.Components.o71[] o71VarArr = this.F0;
                        if (i20 >= o71VarArr.length) {
                            break;
                        }
                        o71VarArr[i20].b(0, B0);
                        this.F0[i20].b(1, B02);
                        this.F0[i20].b(2, B03);
                        this.F0[i20].b(3, B04);
                        i20++;
                    }
                }
                ImageView imageView = this.B0;
                if (imageView != null) {
                    imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.f6.ic), PorterDuff.Mode.MULTIPLY));
                }
                ImageView imageView2 = this.C0;
                if (imageView2 != null) {
                    imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.f6.ic), PorterDuff.Mode.MULTIPLY));
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
    /* JADX WARN: Code restructure failed: missing block: B:406:0x0273, code lost:
    
        if ("d".equals(((org.telegram.ui.xh1) r12).a) == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0279, code lost:
    
        if ((r46.x1 instanceof org.telegram.tgnet.TLRPC.TL_wallPaper) != false) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0ffc  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0fc6  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0e4f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x074b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x077e  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x086f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x08f4  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x093f  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0950  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0910  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x095c A[EDGE_INSN: B:239:0x095c->B:240:0x095c BREAK  A[LOOP:2: B:187:0x086b->B:213:0x0951], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0962  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0a85  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0ddf  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0de9  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0a92  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0865  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0768  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0708  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a1 A[LOOP:0: B:45:0x019d->B:47:0x01a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01cc A[EDGE_INSN: B:48:0x01cc->B:49:0x01cc BREAK  A[LOOP:0: B:45:0x019d->B:47:0x01a1], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x054f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0e4c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0e8c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0fc9  */
    /* JADX WARN: Type inference failed for: r7v81 */
    /* JADX WARN: Type inference failed for: r7v82, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v91 */
    @Override // org.telegram.ui.ActionBar.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        boolean z10;
        org.telegram.ui.ActionBar.b5 b5Var;
        int i9;
        int i10;
        int i11;
        dc1[] dc1VarArr;
        boolean z11;
        int i12;
        int i13;
        float f10;
        int i14;
        org.telegram.ui.ActionBar.d6 d6Var;
        Object obj;
        int i15;
        org.telegram.ui.ActionBar.d6 d6Var2;
        int i16;
        final int i17;
        ob1 ob1Var;
        org.telegram.ui.ActionBar.d6 d6Var3;
        final int i18;
        float f11;
        ViewGroup[] viewGroupArr;
        ?? r72;
        org.telegram.ui.ActionBar.d6 d6Var4;
        boolean z12;
        org.telegram.ui.Components.nz0 nz0Var;
        final int i19;
        org.telegram.ui.ActionBar.b5 b5Var2;
        this.N.p = (ob1) getResourceProvider();
        this.O.p = (ob1) getResourceProvider();
        this.P.p = (ob1) getResourceProvider();
        this.Q.p = (ob1) getResourceProvider();
        int i20 = 1;
        this.hasOwnBackground = true;
        fc1 fc1Var = this.l1;
        int i21 = 0;
        boolean z13 = (fc1Var == null || this.F1 == 0) ? false : true;
        this.H1 = z13;
        if (z13) {
            Object obj2 = this.x1;
            if (!(obj2 instanceof yh1)) {
                if (obj2 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj2;
                    if (tL_wallPaper.document != null) {
                    }
                }
            }
            z10 = true;
            this.I1 = z10;
            if (z10) {
                this.k1 = fc1Var.a() ? 1.0f : 0.0f;
            }
            b5Var = this.parentLayout;
            if (b5Var != null && ((ActionBarLayout) b5Var).z()) {
                this.actionBar.setOccupyStatusBar(false);
            }
            this.i0 = new FrameLayout(context);
            i9 = 3;
            if (this.I1 && SharedConfig.dayNightWallpaperSwitchHint < 3) {
                AndroidUtilities.runOnUIThread(new ab1(this, i9), 2000L);
            }
            org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
            a2.F();
            a2.D = new zb1();
            a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
            this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c5());
            this.actionBar.setAddToContainer(false);
            this.actionBar.setTitle(LocaleController.getString(R.string.ThemePreview));
            m0 m0Var = new m0(this, context, 24);
            this.i0 = m0Var;
            m0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.d6));
            this.i0.addView(this.actionBar, g7.e6.c(-2.0f, -1));
            org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context);
            this.j0 = wk0Var;
            wk0Var.setVerticalScrollBarEnabled(true);
            this.j0.setItemAnimator(null);
            this.j0.setLayoutAnimation(null);
            this.j0.setLayoutManager(new f2.m0(1, false));
            this.j0.setVerticalScrollbarPosition(!LocaleController.isRTL ? 1 : 2);
            org.telegram.ui.Components.wk0 wk0Var2 = this.j0;
            i10 = this.b;
            wk0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(i10 == 0 ? 12.0f : 0.0f));
            final int i22 = 4;
            this.j0.setOnItemClickListener(new fh.a(i22));
            this.i0.addView(this.j0, g7.e6.e(-1, -1, 51));
            org.telegram.ui.Components.j10 j10Var = new org.telegram.ui.Components.j10(context, this.resourceProvider);
            this.l0 = j10Var;
            j10Var.setImageResource(R.drawable.floating_pencil);
            this.i0.addView(this.l0, org.telegram.ui.Components.j10.b());
            gc1 gc1Var = new gc1(context);
            this.k0 = gc1Var;
            this.j0.setAdapter(gc1Var);
            this.p0 = new org.telegram.ui.ActionBar.r0(this, context, i9);
            this.r0 = new kc1(context, this);
            this.o0 = createActionBar(context);
            if (AndroidUtilities.isTablet()) {
                this.o0.setOccupyStatusBar(false);
            }
            org.telegram.ui.Cells.j2.v(false, this.o0);
            this.o0.setActionBarMenuOnItemClick(new cc1(this));
            i11 = 0;
            while (true) {
                dc1VarArr = this.s0;
                if (i11 < 2) {
                    break;
                }
                dc1VarArr[i11] = new dc1(this, (Activity) getContext());
                this.p0.addView(dc1VarArr[i11], g7.e6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
                i11++;
            }
            dc1 dc1Var = dc1VarArr[0];
            this.t0 = dc1Var;
            dc1Var.setVisibility(0);
            dc1VarArr[1].setVisibility(8);
            if (i10 == 2) {
                this.t0.getImageReceiver().setDelegate(new cb1(this, i21));
            }
            z11 = this.r0.e;
            org.telegram.ui.ActionBar.e6 e6Var = this.a0;
            if (!z11) {
                this.o0.setTitle("Telegram Beta Chat");
                this.o0.setSubtitle(LocaleController.formatPluralString("Members", 505, new Object[0]));
                i12 = i10;
            } else if (i10 == 2) {
                if (this.F1 != 0) {
                    this.o0.setTitle(LocaleController.getString(R.string.WallpaperPreview));
                } else {
                    this.o0.setTitle(LocaleController.getString(R.string.BackgroundPreview));
                }
                org.telegram.ui.ActionBar.z n10 = this.o0.n();
                Object obj3 = this.x1;
                if ((obj3 instanceof yh1) && ((yh1) obj3).e != null) {
                    n10.a(7, R.drawable.msg_header_draw);
                }
                i12 = i10;
                if (this.F1 == 0) {
                    if (!BuildVars.DEBUG_PRIVATE_VERSION || org.telegram.ui.ActionBar.f6.m0().k(false) == null) {
                        Object obj4 = this.x1;
                        if (obj4 instanceof xh1) {
                        }
                    }
                    n10.a(5, R.drawable.msg_header_share);
                }
                if (this.F1 != 0 && this.H1) {
                    org.telegram.ui.Components.mi0 mi0Var = new org.telegram.ui.Components.mi0(R.raw.sun, "" + R.raw.sun, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
                    this.J1 = mi0Var;
                    this.K1 = n10.d(6, mi0Var);
                    this.J1.h = true;
                    fc1 fc1Var2 = this.l1;
                    if (fc1Var2 == null || fc1Var2.a()) {
                        this.J1.K(35);
                        this.J1.N(36);
                    } else {
                        this.J1.N(0);
                        this.J1.K(0);
                    }
                    this.J1.W = true;
                    int u02 = org.telegram.ui.ActionBar.f6.u0(org.telegram.ui.ActionBar.f6.J9);
                    this.J1.O(u02, "Sunny");
                    this.J1.O(u02, "Path 6");
                    this.J1.O(u02, "Path");
                    this.J1.O(u02, "Path 5");
                    this.J1.m();
                }
            } else {
                i12 = i10;
                if (i12 == 1) {
                    org.telegram.ui.ActionBar.z n11 = this.o0.n();
                    this.f = n11.e(4, LocaleController.getString(R.string.Save));
                    org.telegram.ui.Components.pl plVar = new org.telegram.ui.Components.pl(this, context, n11);
                    this.e = plVar;
                    plVar.setSubMenuOpenSide(1);
                    this.e.g(2, LocaleController.getString(R.string.ColorPickerBackground));
                    this.e.g(1, LocaleController.getString(R.string.ColorPickerMainColor));
                    this.e.g(3, LocaleController.getString(R.string.ColorPickerMyMessages));
                    this.e.D();
                    this.e.setForceSmoothKeyboard(true);
                    this.o0.addView(this.e, g7.e6.d(-2, -1.0f, 51, AndroidUtilities.isTablet() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f));
                    final int i23 = 2;
                    this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.bb1
                        public final /* synthetic */ oc1 b;

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
                                    oc1.T(this.b);
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
                    int i24 = org.telegram.ui.ActionBar.f6.A8;
                    textView2.setTextColor(getThemedColor(i24));
                    this.h.setTypeface(AndroidUtilities.bold());
                    this.h.setText(LocaleController.getString(R.string.ColorPickerMainColor));
                    Drawable mutate = context.getResources().getDrawable(R.drawable.ic_arrow_drop_down).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i24), PorterDuff.Mode.MULTIPLY));
                    this.h.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, mutate, (Drawable) null);
                    this.h.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                    this.h.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
                    this.e.addView(this.h, g7.e6.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 1.0f));
                } else {
                    TLRPC.TL_theme tL_theme = e6Var.B;
                    String n12 = tL_theme != null ? tL_theme.title : e6Var.n();
                    int lastIndexOf = n12.lastIndexOf(".attheme");
                    if (lastIndexOf >= 0) {
                        n12 = n12.substring(0, lastIndexOf);
                    }
                    this.o0.setTitle(n12);
                    TLRPC.TL_theme tL_theme2 = e6Var.B;
                    if (tL_theme2 == null || (i13 = tL_theme2.installs_count) <= 0) {
                        this.o0.setSubtitle(LocaleController.formatDateOnline((System.currentTimeMillis() / 1000) - 3600, null));
                        this.q0 = new ib1(context, this);
                        jb1 jb1Var = new jb1(this);
                        jb1Var.S();
                        this.q0.setItemAnimator(jb1Var);
                        this.q0.setVerticalScrollBarEnabled(true);
                        this.q0.setOverScrollMode(2);
                        if (i12 == 2) {
                            f10 = 16.0f;
                            this.q0.setPadding(0, AndroidUtilities.dp(4.0f), 0, (AndroidUtilities.dp(72 + ((this.G1 || this.F1 <= 0) ? 0 : 58)) - 12) + (U0() ? AndroidUtilities.navigationBarHeight : 0));
                        } else {
                            f10 = 16.0f;
                            if (i12 == 1) {
                                this.q0.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(16.0f));
                            } else {
                                this.q0.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                            }
                        }
                        this.q0.setClipToPadding(false);
                        this.q0.setLayoutManager(new f2.m0(1, true));
                        this.q0.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
                        if (i12 == 1) {
                            this.p0.addView(this.q0, g7.e6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 273.0f));
                            this.q0.setOnItemClickListener(new cb1(this, i20));
                            i14 = -1;
                        } else {
                            i14 = -1;
                            this.p0.addView(this.q0, g7.e6.e(-1, -1, 51));
                        }
                        this.q0.setOnScrollListener(new kb1(this, i21));
                        this.p0.addView(this.o0, g7.e6.c(-2.0f, i14));
                        org.telegram.ui.Components.q71 q71Var = new org.telegram.ui.Components.q71(context);
                        this.r1 = q71Var;
                        q71Var.b(new cb1(this, 2));
                        org.telegram.ui.ActionBar.d6 d6Var5 = this.s;
                        if (i12 != 1 || i12 == 2) {
                            if (i12 == 2) {
                                t4 t4Var = new t4(this, context, U0());
                                this.y0 = t4Var;
                                t4Var.setWillNotDraw(false);
                                this.y0.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + (U0() ? AndroidUtilities.navigationBarHeight : 0));
                                this.p0.addView(this.y0, g7.e6.e(-1, 0, 81));
                                ec1 ec1Var = new ec1(context, this);
                                this.v1 = ec1Var;
                                g7.g6.b(ec1Var, 0.033f, 1.2f);
                                h1(false);
                                final int i25 = 3;
                                this.v1.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.bb1
                                    public final /* synthetic */ oc1 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        switch (i25) {
                                            case 0:
                                                this.b.O0(false);
                                                break;
                                            case 1:
                                                oc1.T(this.b);
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
                                d6Var = d6Var5;
                                if (this.F1 <= 0 || this.G1 || this.m0 != null) {
                                    this.y0.addView(this.v1, g7.e6.d(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                                } else {
                                    ec1 ec1Var2 = new ec1(context, this);
                                    this.w1 = ec1Var2;
                                    g7.g6.b(ec1Var2, 0.033f, 1.2f);
                                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.F1));
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
                                    if (!getUserConfig().isPremium()) {
                                        spannableStringBuilder.append((CharSequence) "l ");
                                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.eq(R.drawable.msg_mini_lock3), 0, 1, 33);
                                    }
                                    spannableStringBuilder.append((CharSequence) LocaleController.formatString(R.string.ApplyWallpaperForMeAndPeer, UserObject.getUserName(user)));
                                    this.w1.d(spannableStringBuilder);
                                    try {
                                        ec1 ec1Var3 = this.w1;
                                        CharSequence b10 = ec1Var3.b();
                                        nz0Var = this.w1.a;
                                        ec1Var3.d(Emoji.replaceEmoji(b10, nz0Var.i(), false));
                                    } catch (Exception unused) {
                                    }
                                    this.w1.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.bb1
                                        public final /* synthetic */ oc1 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i22) {
                                                case 0:
                                                    this.b.O0(false);
                                                    break;
                                                case 1:
                                                    oc1.T(this.b);
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
                                    this.y0.addView(this.v1, g7.e6.d(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 58.0f));
                                    this.y0.addView(this.w1, g7.e6.d(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                                }
                                if (this.I1) {
                                    bh.g gVar = new bh.g(this, (Activity) getContext());
                                    this.M1 = gVar;
                                    gVar.setPadding(AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
                                    this.p0.addView(this.M1, g7.e6.e(222, 76, 49));
                                    lb1 lb1Var = new lb1((Activity) getContext());
                                    this.N1 = lb1Var;
                                    lb1Var.d(this.j1);
                                    this.N1.b();
                                    this.N1.c(new w3(this, 21));
                                    this.M1.addView(this.N1);
                                    fc1 fc1Var3 = this.l1;
                                    if (fc1Var3 != null) {
                                        this.N1.setVisibility(fc1Var3.a() ? 0 : 8);
                                        this.N1.setAlpha(this.l1.a() ? 1.0f : 0.0f);
                                        this.N1.d(this.l1.a() ? this.j1 : 0.0f);
                                    }
                                }
                            } else {
                                d6Var = d6Var5;
                            }
                            Rect rect = new Rect();
                            Drawable mutate2 = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
                            this.r = mutate2;
                            mutate2.getPadding(rect);
                            this.r.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.f6.d6), PorterDuff.Mode.MULTIPLY));
                            TextPaint textPaint = new TextPaint(1);
                            textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                            textPaint.setTypeface(AndroidUtilities.bold());
                            obj = this.x1;
                            if (i12 != 1 || (obj instanceof xh1)) {
                                if ((obj instanceof xh1) || !"d".equals(((xh1) obj).a)) {
                                    i15 = 3;
                                    String[] strArr = new String[i15];
                                    int[] iArr = new int[i15];
                                    this.F0 = new org.telegram.ui.Components.o71[i15];
                                    if (i15 == 0) {
                                        this.u0 = new FrameLayout(context);
                                        if (i12 == 1 || (this.x1 instanceof xh1)) {
                                            strArr[0] = LocaleController.getString(R.string.BackgroundColors);
                                            strArr[1] = LocaleController.getString(R.string.BackgroundPattern);
                                            strArr[2] = LocaleController.getString(R.string.BackgroundMotion);
                                        } else {
                                            strArr[0] = LocaleController.getString(R.string.BackgroundBlurred);
                                            strArr[1] = LocaleController.getString(R.string.BackgroundMotion);
                                        }
                                        int i26 = 0;
                                        i16 = 0;
                                        while (i26 < i15) {
                                            int ceil = (int) Math.ceil(textPaint.measureText(strArr[i26]));
                                            iArr[i26] = ceil;
                                            i16 = Math.max(i16, ceil);
                                            i26++;
                                            d6Var = d6Var;
                                        }
                                        d6Var2 = d6Var;
                                        mb1 mb1Var = new mb1(this, context, 0);
                                        this.z0 = mb1Var;
                                        mb1Var.setWillNotDraw(false);
                                        this.z0.setVisibility(this.X0 != 0 ? 0 : 4);
                                        this.z0.setScaleX(this.X0 != 0 ? 1.0f : 0.1f);
                                        this.z0.setScaleY(this.X0 != 0 ? 1.0f : 0.1f);
                                        this.z0.setAlpha(this.X0 != 0 ? 1.0f : 0.0f);
                                        this.z0.setTag(this.X0 != 0 ? 1 : null);
                                        this.u0.addView(this.z0, g7.e6.e(48, 48, 17));
                                        this.z0.setOnClickListener(new nb1(this, i21));
                                        ImageView imageView = new ImageView(context);
                                        this.B0 = imageView;
                                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                                        this.B0.setImageResource(R.drawable.bg_rotate_large);
                                        this.z0.addView(this.B0, g7.e6.e(-2, -2, 17));
                                    } else {
                                        d6Var2 = d6Var;
                                        i16 = 0;
                                    }
                                    i17 = 0;
                                    while (true) {
                                        ob1Var = this.a;
                                        if (i17 < i15) {
                                            break;
                                        }
                                        this.F0[i17] = new org.telegram.ui.Components.o71(context, ((i12 == 1 || (this.x1 instanceof xh1)) && i17 == 0) ? false : true, this.t0, ob1Var);
                                        this.F0[i17].setBackgroundColor(this.V0);
                                        org.telegram.ui.Components.o71 o71Var = this.F0[i17];
                                        String str = strArr[i17];
                                        int i27 = iArr[i17];
                                        o71Var.f = str;
                                        o71Var.h = i27;
                                        o71Var.n = i16;
                                        int i28 = 1;
                                        if (i12 != 1) {
                                            if (this.x1 instanceof xh1) {
                                                i28 = 1;
                                            } else {
                                                o71Var.a(i17 == 0 ? this.B1 : this.A1, false);
                                                d6Var4 = d6Var2;
                                                int dp = AndroidUtilities.dp(56.0f) + i16;
                                                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dp, -2);
                                                layoutParams.gravity = 17;
                                                if (i15 != 3) {
                                                    if (i17 == 0 || i17 == 2) {
                                                        layoutParams.leftMargin = AndroidUtilities.dp(10.0f) + (dp / 2);
                                                    } else {
                                                        layoutParams.rightMargin = AndroidUtilities.dp(10.0f) + (dp / 2);
                                                    }
                                                } else if (i17 == 1) {
                                                    layoutParams.leftMargin = AndroidUtilities.dp(10.0f) + (dp / 2);
                                                } else {
                                                    layoutParams.rightMargin = AndroidUtilities.dp(10.0f) + (dp / 2);
                                                }
                                                this.u0.addView(this.F0[i17], layoutParams);
                                                final org.telegram.ui.Components.o71 o71Var2 = this.F0[i17];
                                                final int i29 = 0;
                                                o71Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.db1
                                                    public final /* synthetic */ oc1 b;

                                                    {
                                                        this.b = this;
                                                    }

                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        switch (i29) {
                                                            case 0:
                                                                oc1 oc1Var = this.b;
                                                                int i30 = oc1Var.b;
                                                                FrameLayout[] frameLayoutArr = oc1Var.H0;
                                                                if (oc1Var.u0.getAlpha() == 1.0f && oc1Var.n1 == null) {
                                                                    int i31 = i17;
                                                                    org.telegram.ui.Components.o71 o71Var3 = o71Var2;
                                                                    if ((i30 != 1 && !(oc1Var.x1 instanceof xh1)) || i31 != 2) {
                                                                        if (i31 != 1 || (i30 != 1 && !(oc1Var.x1 instanceof xh1))) {
                                                                            if (!(oc1Var.x1 instanceof xh1)) {
                                                                                if (i30 != 1) {
                                                                                    o71Var3.a(!o71Var3.s, true);
                                                                                    if (i31 != 0) {
                                                                                        boolean z14 = o71Var3.s;
                                                                                        oc1Var.A1 = z14;
                                                                                        oc1Var.r1.c(z14);
                                                                                        oc1Var.M0();
                                                                                        break;
                                                                                    } else {
                                                                                        boolean z15 = o71Var3.s;
                                                                                        oc1Var.B1 = z15;
                                                                                        if (z15) {
                                                                                            oc1Var.t0.getImageReceiver().setForceCrossfade(true);
                                                                                        }
                                                                                        oc1Var.i1();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                oc1Var.f1(i31, frameLayoutArr[i31].getVisibility() != 0, true);
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            if (oc1Var.F0[1].s) {
                                                                                oc1Var.U0 = oc1Var.S0;
                                                                                oc1Var.t0.setImageDrawable(null);
                                                                                oc1Var.S0 = null;
                                                                                oc1Var.A1 = false;
                                                                                oc1Var.j1();
                                                                                oc1Var.M0();
                                                                                if (frameLayoutArr[1].getVisibility() == 0) {
                                                                                    if (i30 == 1) {
                                                                                        oc1Var.f1(0, true, true);
                                                                                    } else {
                                                                                        oc1Var.f1(i31, frameLayoutArr[i31].getVisibility() != 0, true);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                oc1Var.Z0(oc1Var.U0 != null ? -1 : 0);
                                                                                if (i30 == 1) {
                                                                                    oc1Var.f1(1, true, true);
                                                                                } else {
                                                                                    oc1Var.f1(i31, frameLayoutArr[i31].getVisibility() != 0, true);
                                                                                }
                                                                            }
                                                                            oc1Var.F0[1].a(oc1Var.S0 != null, true);
                                                                            oc1Var.n1();
                                                                            oc1Var.L0.f1();
                                                                            oc1Var.l1();
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        o71Var3.a(!o71Var3.s, true);
                                                                        boolean z16 = o71Var3.s;
                                                                        oc1Var.A1 = z16;
                                                                        oc1Var.r1.c(z16);
                                                                        oc1Var.M0();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                            default:
                                                                oc1 oc1Var2 = this.b;
                                                                if (oc1Var2.v0.getAlpha() == 1.0f && i17 == 0) {
                                                                    org.telegram.ui.Components.o71 o71Var4 = o71Var2;
                                                                    o71Var4.a(!o71Var4.s, true);
                                                                    oc1Var2.s.i = o71Var4.s;
                                                                    org.telegram.ui.ActionBar.f6.n1(true, true);
                                                                    oc1Var2.q0.f1();
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                });
                                                if (i17 != 2) {
                                                    this.F0[i17].setAlpha(0.0f);
                                                    this.F0[i17].setVisibility(4);
                                                }
                                                i17++;
                                                d6Var2 = d6Var4;
                                            }
                                        }
                                        if (i17 == i28) {
                                            if (this.S0 == null) {
                                                d6Var4 = d6Var2;
                                                if (d6Var2 == null || TextUtils.isEmpty(d6Var4.o)) {
                                                    z12 = false;
                                                    o71Var.a(z12, false);
                                                }
                                            } else {
                                                d6Var4 = d6Var2;
                                            }
                                            z12 = true;
                                            o71Var.a(z12, false);
                                        } else {
                                            d6Var4 = d6Var2;
                                            if (i17 == 2) {
                                                o71Var.a(this.A1, false);
                                            }
                                        }
                                        int dp2 = AndroidUtilities.dp(56.0f) + i16;
                                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(dp2, -2);
                                        layoutParams2.gravity = 17;
                                        if (i15 != 3) {
                                        }
                                        this.u0.addView(this.F0[i17], layoutParams2);
                                        final org.telegram.ui.Components.o71 o71Var22 = this.F0[i17];
                                        final int i292 = 0;
                                        o71Var22.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.db1
                                            public final /* synthetic */ oc1 b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                switch (i292) {
                                                    case 0:
                                                        oc1 oc1Var = this.b;
                                                        int i30 = oc1Var.b;
                                                        FrameLayout[] frameLayoutArr = oc1Var.H0;
                                                        if (oc1Var.u0.getAlpha() == 1.0f && oc1Var.n1 == null) {
                                                            int i31 = i17;
                                                            org.telegram.ui.Components.o71 o71Var3 = o71Var22;
                                                            if ((i30 != 1 && !(oc1Var.x1 instanceof xh1)) || i31 != 2) {
                                                                if (i31 != 1 || (i30 != 1 && !(oc1Var.x1 instanceof xh1))) {
                                                                    if (!(oc1Var.x1 instanceof xh1)) {
                                                                        if (i30 != 1) {
                                                                            o71Var3.a(!o71Var3.s, true);
                                                                            if (i31 != 0) {
                                                                                boolean z14 = o71Var3.s;
                                                                                oc1Var.A1 = z14;
                                                                                oc1Var.r1.c(z14);
                                                                                oc1Var.M0();
                                                                                break;
                                                                            } else {
                                                                                boolean z15 = o71Var3.s;
                                                                                oc1Var.B1 = z15;
                                                                                if (z15) {
                                                                                    oc1Var.t0.getImageReceiver().setForceCrossfade(true);
                                                                                }
                                                                                oc1Var.i1();
                                                                                break;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        oc1Var.f1(i31, frameLayoutArr[i31].getVisibility() != 0, true);
                                                                        break;
                                                                    }
                                                                } else {
                                                                    if (oc1Var.F0[1].s) {
                                                                        oc1Var.U0 = oc1Var.S0;
                                                                        oc1Var.t0.setImageDrawable(null);
                                                                        oc1Var.S0 = null;
                                                                        oc1Var.A1 = false;
                                                                        oc1Var.j1();
                                                                        oc1Var.M0();
                                                                        if (frameLayoutArr[1].getVisibility() == 0) {
                                                                            if (i30 == 1) {
                                                                                oc1Var.f1(0, true, true);
                                                                            } else {
                                                                                oc1Var.f1(i31, frameLayoutArr[i31].getVisibility() != 0, true);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        oc1Var.Z0(oc1Var.U0 != null ? -1 : 0);
                                                                        if (i30 == 1) {
                                                                            oc1Var.f1(1, true, true);
                                                                        } else {
                                                                            oc1Var.f1(i31, frameLayoutArr[i31].getVisibility() != 0, true);
                                                                        }
                                                                    }
                                                                    oc1Var.F0[1].a(oc1Var.S0 != null, true);
                                                                    oc1Var.n1();
                                                                    oc1Var.L0.f1();
                                                                    oc1Var.l1();
                                                                    break;
                                                                }
                                                            } else {
                                                                o71Var3.a(!o71Var3.s, true);
                                                                boolean z16 = o71Var3.s;
                                                                oc1Var.A1 = z16;
                                                                oc1Var.r1.c(z16);
                                                                oc1Var.M0();
                                                                break;
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        oc1 oc1Var2 = this.b;
                                                        if (oc1Var2.v0.getAlpha() == 1.0f && i17 == 0) {
                                                            org.telegram.ui.Components.o71 o71Var4 = o71Var22;
                                                            o71Var4.a(!o71Var4.s, true);
                                                            oc1Var2.s.i = o71Var4.s;
                                                            org.telegram.ui.ActionBar.f6.n1(true, true);
                                                            oc1Var2.q0.f1();
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        if (i17 != 2) {
                                        }
                                        i17++;
                                        d6Var2 = d6Var4;
                                    }
                                    d6Var3 = d6Var2;
                                    if (i12 == 1) {
                                        int[] iArr2 = new int[2];
                                        this.G0 = new org.telegram.ui.Components.o71[2];
                                        this.v0 = new FrameLayout(context);
                                        String[] strArr2 = {LocaleController.getString(R.string.BackgroundAnimate), LocaleController.getString(R.string.BackgroundColors)};
                                        int i30 = 0;
                                        int i31 = 0;
                                        for (int i32 = 2; i30 < i32; i32 = 2) {
                                            int ceil2 = (int) Math.ceil(textPaint.measureText(strArr2[i30]));
                                            iArr2[i30] = ceil2;
                                            i31 = Math.max(i31, ceil2);
                                            i30++;
                                        }
                                        if (d6Var3 != null) {
                                            mb1 mb1Var2 = new mb1(this, context, 1);
                                            this.A0 = mb1Var2;
                                            mb1Var2.setWillNotDraw(false);
                                            this.A0.setVisibility(d6Var3.f != 0 ? 0 : 4);
                                            this.A0.setScaleX(d6Var3.f != 0 ? 1.0f : 0.1f);
                                            this.A0.setScaleY(d6Var3.f != 0 ? 1.0f : 0.1f);
                                            this.A0.setAlpha(d6Var3.f != 0 ? 1.0f : 0.0f);
                                            this.v0.addView(this.A0, g7.e6.e(48, 48, 17));
                                            this.A0.setOnClickListener(new nb1(this, 1));
                                            ImageView imageView2 = new ImageView(context);
                                            this.C0 = imageView2;
                                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                                            this.C0.setImageResource(R.drawable.bg_rotate_large);
                                            this.A0.addView(this.C0, g7.e6.e(-2, -2, 17));
                                            final int i33 = 0;
                                            while (i33 < 2) {
                                                this.G0[i33] = new org.telegram.ui.Components.o71(context, i33 == 0, this.t0, ob1Var);
                                                org.telegram.ui.Components.o71 o71Var3 = this.G0[i33];
                                                String str2 = strArr2[i33];
                                                int i34 = iArr2[i33];
                                                o71Var3.f = str2;
                                                o71Var3.h = i34;
                                                o71Var3.n = i31;
                                                if (i33 == 0) {
                                                    o71Var3.a(d6Var3.i, false);
                                                }
                                                int dp3 = AndroidUtilities.dp(56.0f) + i31;
                                                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(dp3, -2);
                                                layoutParams3.gravity = 17;
                                                if (i33 == 1) {
                                                    layoutParams3.leftMargin = AndroidUtilities.dp(10.0f) + (dp3 / 2);
                                                } else {
                                                    layoutParams3.rightMargin = AndroidUtilities.dp(10.0f) + (dp3 / 2);
                                                }
                                                this.v0.addView(this.G0[i33], layoutParams3);
                                                final org.telegram.ui.Components.o71 o71Var4 = this.G0[i33];
                                                final int i35 = 1;
                                                o71Var4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.db1
                                                    public final /* synthetic */ oc1 b;

                                                    {
                                                        this.b = this;
                                                    }

                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        switch (i35) {
                                                            case 0:
                                                                oc1 oc1Var = this.b;
                                                                int i302 = oc1Var.b;
                                                                FrameLayout[] frameLayoutArr = oc1Var.H0;
                                                                if (oc1Var.u0.getAlpha() == 1.0f && oc1Var.n1 == null) {
                                                                    int i312 = i33;
                                                                    org.telegram.ui.Components.o71 o71Var32 = o71Var4;
                                                                    if ((i302 != 1 && !(oc1Var.x1 instanceof xh1)) || i312 != 2) {
                                                                        if (i312 != 1 || (i302 != 1 && !(oc1Var.x1 instanceof xh1))) {
                                                                            if (!(oc1Var.x1 instanceof xh1)) {
                                                                                if (i302 != 1) {
                                                                                    o71Var32.a(!o71Var32.s, true);
                                                                                    if (i312 != 0) {
                                                                                        boolean z14 = o71Var32.s;
                                                                                        oc1Var.A1 = z14;
                                                                                        oc1Var.r1.c(z14);
                                                                                        oc1Var.M0();
                                                                                        break;
                                                                                    } else {
                                                                                        boolean z15 = o71Var32.s;
                                                                                        oc1Var.B1 = z15;
                                                                                        if (z15) {
                                                                                            oc1Var.t0.getImageReceiver().setForceCrossfade(true);
                                                                                        }
                                                                                        oc1Var.i1();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                oc1Var.f1(i312, frameLayoutArr[i312].getVisibility() != 0, true);
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            if (oc1Var.F0[1].s) {
                                                                                oc1Var.U0 = oc1Var.S0;
                                                                                oc1Var.t0.setImageDrawable(null);
                                                                                oc1Var.S0 = null;
                                                                                oc1Var.A1 = false;
                                                                                oc1Var.j1();
                                                                                oc1Var.M0();
                                                                                if (frameLayoutArr[1].getVisibility() == 0) {
                                                                                    if (i302 == 1) {
                                                                                        oc1Var.f1(0, true, true);
                                                                                    } else {
                                                                                        oc1Var.f1(i312, frameLayoutArr[i312].getVisibility() != 0, true);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                oc1Var.Z0(oc1Var.U0 != null ? -1 : 0);
                                                                                if (i302 == 1) {
                                                                                    oc1Var.f1(1, true, true);
                                                                                } else {
                                                                                    oc1Var.f1(i312, frameLayoutArr[i312].getVisibility() != 0, true);
                                                                                }
                                                                            }
                                                                            oc1Var.F0[1].a(oc1Var.S0 != null, true);
                                                                            oc1Var.n1();
                                                                            oc1Var.L0.f1();
                                                                            oc1Var.l1();
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        o71Var32.a(!o71Var32.s, true);
                                                                        boolean z16 = o71Var32.s;
                                                                        oc1Var.A1 = z16;
                                                                        oc1Var.r1.c(z16);
                                                                        oc1Var.M0();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                            default:
                                                                oc1 oc1Var2 = this.b;
                                                                if (oc1Var2.v0.getAlpha() == 1.0f && i33 == 0) {
                                                                    org.telegram.ui.Components.o71 o71Var42 = o71Var4;
                                                                    o71Var42.a(!o71Var42.s, true);
                                                                    oc1Var2.s.i = o71Var42.s;
                                                                    org.telegram.ui.ActionBar.f6.n1(true, true);
                                                                    oc1Var2.q0.f1();
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                });
                                                i33++;
                                            }
                                        }
                                    }
                                    if (i12 != 1 || (this.x1 instanceof xh1)) {
                                        this.B1 = false;
                                        i18 = 0;
                                        while (i18 < 2) {
                                            pb1 pb1Var = new pb1(this, context, i18, rect);
                                            ViewGroup[] viewGroupArr2 = this.H0;
                                            viewGroupArr2[i18] = pb1Var;
                                            if (i18 == 1 || i12 == 2) {
                                                pb1Var.setVisibility(4);
                                            }
                                            viewGroupArr2[i18].setWillNotDraw(false);
                                            FrameLayout.LayoutParams e10 = i12 == 2 ? g7.e6.e(-1, i18 == 0 ? 321 : 316, 83) : g7.e6.e(-1, i18 == 0 ? 273 : 316, 83);
                                            e10.height = AndroidUtilities.dp(i18 == 0 ? i12 == 2 ? 321 : 273 : 316.0f);
                                            if (U0()) {
                                                e10.height += AndroidUtilities.navigationBarHeight;
                                            }
                                            if (i18 == 0) {
                                                Drawable drawable = this.r;
                                                Rect rect2 = AndroidUtilities.rectTmp2;
                                                drawable.getPadding(rect2);
                                                e10.height = AndroidUtilities.dp(12.0f) + rect2.top + e10.height;
                                            }
                                            viewGroupArr2[i18].setPadding(0, i18 == 0 ? AndroidUtilities.dp(12.0f) + rect.top : 0, 0, U0() ? AndroidUtilities.navigationBarHeight : 0);
                                            this.p0.addView(viewGroupArr2[i18], e10);
                                            if (i18 == 1 || i12 == 2) {
                                                fh.v vVar = new fh.v(this, context, 27);
                                                ViewGroup[] viewGroupArr3 = this.K0;
                                                viewGroupArr3[i18] = vVar;
                                                vVar.setWillNotDraw(false);
                                                viewGroupArr3[i18].setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
                                                viewGroupArr3[i18].setClickable(true);
                                                f11 = 21.0f;
                                                viewGroupArr2[i18].addView(viewGroupArr3[i18], g7.e6.e(-1, 51, 80));
                                                TextView textView3 = new TextView(context);
                                                TextView[] textViewArr = this.I0;
                                                textViewArr[i18] = textView3;
                                                textView3.setTextSize(1, 15.0f);
                                                textViewArr[i18].setTypeface(AndroidUtilities.bold());
                                                TextView textView4 = textViewArr[i18];
                                                int i36 = org.telegram.ui.ActionBar.f6.Ae;
                                                textView4.setTextColor(getThemedColor(i36));
                                                textViewArr[i18].setText(LocaleController.getString(R.string.Cancel));
                                                textViewArr[i18].setGravity(17);
                                                textViewArr[i18].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                                                TextView textView5 = textViewArr[i18];
                                                int i37 = org.telegram.ui.ActionBar.f6.i6;
                                                textView5.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.e0(getThemedColor(i37), 0));
                                                viewGroupArr = viewGroupArr2;
                                                viewGroupArr3[i18].addView(textViewArr[i18], g7.e6.e(-2, -1, 51));
                                                final int i38 = 0;
                                                textViewArr[i18].setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.hb1
                                                    public final /* synthetic */ oc1 b;

                                                    {
                                                        this.b = this;
                                                    }

                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        switch (i38) {
                                                            case 0:
                                                                oc1 oc1Var = this.b;
                                                                if (oc1Var.n1 == null) {
                                                                    int i39 = i18;
                                                                    if (i39 == 0) {
                                                                        oc1Var.d1 = oc1Var.e1;
                                                                        oc1Var.a1(oc1Var.c1, 3, true);
                                                                        oc1Var.a1(oc1Var.b1, 2, true);
                                                                        oc1Var.a1(oc1Var.a1, 1, true);
                                                                        oc1Var.a1(oc1Var.W0, 0, true);
                                                                    } else {
                                                                        TLRPC.TL_wallPaper tL_wallPaper2 = oc1Var.T0;
                                                                        oc1Var.S0 = tL_wallPaper2;
                                                                        if (tL_wallPaper2 == null) {
                                                                            oc1Var.t0.setImageDrawable(null);
                                                                        } else {
                                                                            dc1 dc1Var2 = oc1Var.t0;
                                                                            ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                                                                            String str3 = oc1Var.C1;
                                                                            TLRPC.TL_wallPaper tL_wallPaper3 = oc1Var.S0;
                                                                            dc1Var2.k(forDocument, str3, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                                                                        }
                                                                        oc1Var.F0[1].a(oc1Var.S0 != null, false);
                                                                        float f12 = oc1Var.i1;
                                                                        oc1Var.h1 = f12;
                                                                        oc1Var.P0.setProgress(f12);
                                                                        oc1Var.t0.getImageReceiver().setAlpha(oc1Var.h1);
                                                                        oc1Var.j1();
                                                                        oc1Var.n1();
                                                                    }
                                                                    if (oc1Var.b != 2) {
                                                                        if (oc1Var.S0 == null) {
                                                                            if (oc1Var.A1) {
                                                                                oc1Var.A1 = false;
                                                                                oc1Var.F0[0].a(false, true);
                                                                                oc1Var.M0();
                                                                            }
                                                                            oc1Var.l1();
                                                                        }
                                                                        oc1Var.f1(0, true, true);
                                                                        break;
                                                                    } else {
                                                                        oc1Var.f1(i39, false, true);
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                            default:
                                                                oc1 oc1Var2 = this.b;
                                                                if (oc1Var2.n1 == null) {
                                                                    if (oc1Var2.b != 2) {
                                                                        oc1Var2.f1(0, true, true);
                                                                        break;
                                                                    } else {
                                                                        oc1Var2.f1(i18, false, true);
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    }
                                                });
                                                TextView textView6 = new TextView(context);
                                                TextView[] textViewArr2 = this.J0;
                                                textViewArr2[i18] = textView6;
                                                textView6.setTextSize(1, 15.0f);
                                                textViewArr2[i18].setTypeface(AndroidUtilities.bold());
                                                textViewArr2[i18].setTextColor(getThemedColor(i36));
                                                textViewArr2[i18].setText(LocaleController.getString(R.string.ApplyTheme));
                                                textViewArr2[i18].setGravity(17);
                                                textViewArr2[i18].setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                                                textViewArr2[i18].setBackgroundDrawable(org.telegram.ui.ActionBar.f6.e0(getThemedColor(i37), 0));
                                                viewGroupArr3[i18].addView(textViewArr2[i18], g7.e6.e(-2, -1, 53));
                                                TextView textView7 = textViewArr2[i18];
                                                r72 = 1;
                                                final char c10 = 1 == true ? 1 : 0;
                                                textView7.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.hb1
                                                    public final /* synthetic */ oc1 b;

                                                    {
                                                        this.b = this;
                                                    }

                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        switch (c10) {
                                                            case 0:
                                                                oc1 oc1Var = this.b;
                                                                if (oc1Var.n1 == null) {
                                                                    int i39 = i18;
                                                                    if (i39 == 0) {
                                                                        oc1Var.d1 = oc1Var.e1;
                                                                        oc1Var.a1(oc1Var.c1, 3, true);
                                                                        oc1Var.a1(oc1Var.b1, 2, true);
                                                                        oc1Var.a1(oc1Var.a1, 1, true);
                                                                        oc1Var.a1(oc1Var.W0, 0, true);
                                                                    } else {
                                                                        TLRPC.TL_wallPaper tL_wallPaper2 = oc1Var.T0;
                                                                        oc1Var.S0 = tL_wallPaper2;
                                                                        if (tL_wallPaper2 == null) {
                                                                            oc1Var.t0.setImageDrawable(null);
                                                                        } else {
                                                                            dc1 dc1Var2 = oc1Var.t0;
                                                                            ImageLocation forDocument = ImageLocation.getForDocument(tL_wallPaper2.document);
                                                                            String str3 = oc1Var.C1;
                                                                            TLRPC.TL_wallPaper tL_wallPaper3 = oc1Var.S0;
                                                                            dc1Var2.k(forDocument, str3, null, null, tL_wallPaper3.document.size, "jpg", tL_wallPaper3, 1);
                                                                        }
                                                                        oc1Var.F0[1].a(oc1Var.S0 != null, false);
                                                                        float f12 = oc1Var.i1;
                                                                        oc1Var.h1 = f12;
                                                                        oc1Var.P0.setProgress(f12);
                                                                        oc1Var.t0.getImageReceiver().setAlpha(oc1Var.h1);
                                                                        oc1Var.j1();
                                                                        oc1Var.n1();
                                                                    }
                                                                    if (oc1Var.b != 2) {
                                                                        if (oc1Var.S0 == null) {
                                                                            if (oc1Var.A1) {
                                                                                oc1Var.A1 = false;
                                                                                oc1Var.F0[0].a(false, true);
                                                                                oc1Var.M0();
                                                                            }
                                                                            oc1Var.l1();
                                                                        }
                                                                        oc1Var.f1(0, true, true);
                                                                        break;
                                                                    } else {
                                                                        oc1Var.f1(i39, false, true);
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                            default:
                                                                oc1 oc1Var2 = this.b;
                                                                if (oc1Var2.n1 == null) {
                                                                    if (oc1Var2.b != 2) {
                                                                        oc1Var2.f1(0, true, true);
                                                                        break;
                                                                    } else {
                                                                        oc1Var2.f1(i18, false, true);
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    }
                                                });
                                            } else {
                                                viewGroupArr = viewGroupArr2;
                                                r72 = 1;
                                                f11 = 21.0f;
                                            }
                                            if (i18 == r72) {
                                                TextView textView8 = new TextView(context);
                                                this.a2 = textView8;
                                                textView8.setLines(r72);
                                                this.a2.setSingleLine(r72);
                                                this.a2.setText(LocaleController.getString(R.string.BackgroundChoosePattern));
                                                this.a2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.G6));
                                                this.a2.setTextSize(r72, 20.0f);
                                                this.a2.setTypeface(AndroidUtilities.bold());
                                                this.a2.setPadding(AndroidUtilities.dp(f11), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(f11), AndroidUtilities.dp(8.0f));
                                                this.a2.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                                                this.a2.setGravity(16);
                                                viewGroupArr[i18].addView(this.a2, g7.e6.d(-1, 48.0f, 51, 0.0f, 21.0f, 0.0f, 0.0f));
                                                va1 va1Var = new va1(context);
                                                this.L0 = va1Var;
                                                f2.m0 m0Var2 = new f2.m0(0, false);
                                                this.N0 = m0Var2;
                                                va1Var.setLayoutManager(m0Var2);
                                                va1 va1Var2 = this.L0;
                                                mc1 mc1Var = new mc1(context, this);
                                                this.M0 = mc1Var;
                                                va1Var2.setAdapter(mc1Var);
                                                this.L0.i(new ih.l(8));
                                                viewGroupArr[i18].addView(this.L0, g7.e6.d(-1, 100.0f, 51, 0.0f, 76.0f, 0.0f, 0.0f));
                                                this.L0.setOnItemClickListener(new c21(this, 6));
                                                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context);
                                                this.O0 = m4Var;
                                                m4Var.setText(LocaleController.getString(R.string.BackgroundIntensity));
                                                viewGroupArr[i18].addView(this.O0, g7.e6.d(-1, -2.0f, 51, 0.0f, 175.0f, 0.0f, 0.0f));
                                                org.telegram.ui.Cells.j0 j0Var = new org.telegram.ui.Cells.j0(context, (ob1) getResourceProvider());
                                                this.P0 = j0Var;
                                                j0Var.setProgress(this.h1);
                                                this.P0.setReportChanges(true);
                                                this.P0.setDelegate(new qb1(this));
                                                viewGroupArr[i18].addView(this.P0, g7.e6.d(-1, 38.0f, 51, 5.0f, 211.0f, 5.0f, 0.0f));
                                            } else {
                                                org.telegram.ui.Components.cq cqVar = new org.telegram.ui.Components.cq(context, this.c0, new rb1(this));
                                                this.R = cqVar;
                                                cqVar.setResourcesProvider(getResourceProvider());
                                                if (i12 == 1) {
                                                    viewGroupArr[i18].addView(this.R, g7.e6.e(-1, -1, 1));
                                                    if (e6Var.q()) {
                                                        this.R.setMinBrightness(0.2f);
                                                    } else {
                                                        this.R.setMinBrightness(0.05f);
                                                        this.R.setMaxBrightness(0.8f);
                                                    }
                                                    if (d6Var3 != null) {
                                                        int i39 = d6Var3.d != 0 ? 2 : 1;
                                                        org.telegram.ui.Components.cq cqVar2 = this.R;
                                                        T0(1);
                                                        cqVar2.f(1, 2, i39, false);
                                                        this.R.e(d6Var3.c, 0);
                                                        int i40 = d6Var3.d;
                                                        if (i40 != 0) {
                                                            this.R.e(i40, 1);
                                                        }
                                                    }
                                                } else {
                                                    viewGroupArr[i18].addView(this.R, g7.e6.d(-1, -1.0f, 1, 0.0f, 0.0f, 0.0f, 48.0f));
                                                }
                                            }
                                            i18++;
                                        }
                                    }
                                    j1();
                                    if (!this.t0.getImageReceiver().hasBitmapImage()) {
                                        this.p0.setBackgroundColor(-16777216);
                                    }
                                    if (i12 != 1 && !(this.x1 instanceof xh1)) {
                                        this.t0.getImageReceiver().setCrossfadeWithOldImage(true);
                                    }
                                }
                                i15 = 0;
                                String[] strArr3 = new String[i15];
                                int[] iArr3 = new int[i15];
                                this.F0 = new org.telegram.ui.Components.o71[i15];
                                if (i15 == 0) {
                                }
                                i17 = 0;
                                while (true) {
                                    ob1Var = this.a;
                                    if (i17 < i15) {
                                    }
                                    i17++;
                                    d6Var2 = d6Var4;
                                }
                                d6Var3 = d6Var2;
                                if (i12 == 1) {
                                }
                                if (i12 != 1) {
                                }
                                this.B1 = false;
                                i18 = 0;
                                while (i18 < 2) {
                                }
                                j1();
                                if (!this.t0.getImageReceiver().hasBitmapImage()) {
                                }
                                if (i12 != 1) {
                                    this.t0.getImageReceiver().setCrossfadeWithOldImage(true);
                                }
                            } else {
                                if (!(obj instanceof yh1) || !"t".equals(((yh1) obj).a)) {
                                    i15 = 2;
                                    String[] strArr32 = new String[i15];
                                    int[] iArr32 = new int[i15];
                                    this.F0 = new org.telegram.ui.Components.o71[i15];
                                    if (i15 == 0) {
                                    }
                                    i17 = 0;
                                    while (true) {
                                        ob1Var = this.a;
                                        if (i17 < i15) {
                                        }
                                        i17++;
                                        d6Var2 = d6Var4;
                                    }
                                    d6Var3 = d6Var2;
                                    if (i12 == 1) {
                                    }
                                    if (i12 != 1) {
                                    }
                                    this.B1 = false;
                                    i18 = 0;
                                    while (i18 < 2) {
                                    }
                                    j1();
                                    if (!this.t0.getImageReceiver().hasBitmapImage()) {
                                    }
                                    if (i12 != 1) {
                                    }
                                }
                                i15 = 0;
                                String[] strArr322 = new String[i15];
                                int[] iArr322 = new int[i15];
                                this.F0 = new org.telegram.ui.Components.o71[i15];
                                if (i15 == 0) {
                                }
                                i17 = 0;
                                while (true) {
                                    ob1Var = this.a;
                                    if (i17 < i15) {
                                    }
                                    i17++;
                                    d6Var2 = d6Var4;
                                }
                                d6Var3 = d6Var2;
                                if (i12 == 1) {
                                }
                                if (i12 != 1) {
                                }
                                this.B1 = false;
                                i18 = 0;
                                while (i18 < 2) {
                                }
                                j1();
                                if (!this.t0.getImageReceiver().hasBitmapImage()) {
                                }
                                if (i12 != 1) {
                                }
                            }
                        } else {
                            d6Var3 = d6Var5;
                        }
                        this.q0.setAdapter(this.r0);
                        fh.v vVar2 = new fh.v(this, context, 28);
                        this.g0 = vVar2;
                        vVar2.setWillNotDraw(false);
                        fh.v vVar3 = this.g0;
                        this.fragmentView = vVar3;
                        ViewTreeObserver viewTreeObserver = vVar3.getViewTreeObserver();
                        int i41 = 1;
                        l90 l90Var = new l90(this, i41);
                        this.M = l90Var;
                        viewTreeObserver.addOnGlobalLayoutListener(l90Var);
                        m2.g gVar2 = new m2.g(context);
                        this.f0 = gVar2;
                        gVar2.b(new p2(this, 2));
                        this.f0.setAdapter(new h70(this, i41));
                        AndroidUtilities.setViewPagerEdgeEffectColor(this.f0, getThemedColor(org.telegram.ui.ActionBar.f6.s8));
                        this.g0.addView(this.f0, g7.e6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i12 == 0 ? 48.0f : 0.0f));
                        UndoView undoView = new UndoView(context, this);
                        this.h0 = undoView;
                        undoView.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
                        this.g0.addView(this.h0, g7.e6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
                        if (i12 == 0) {
                            View view = new View(context);
                            view.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.V5));
                            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, 1, 83);
                            layoutParams4.bottomMargin = AndroidUtilities.dp(48.0f);
                            this.g0.addView(view, layoutParams4);
                            FrameLayout frameLayout = new FrameLayout(context);
                            this.X = frameLayout;
                            int i42 = org.telegram.ui.ActionBar.f6.d6;
                            boolean z14 = this.d;
                            frameLayout.setBackgroundColor(z14 ? org.telegram.ui.ActionBar.f6.C0(i42) : getThemedColor(i42));
                            this.g0.addView(this.X, g7.e6.e(-1, 48, 83));
                            kh.h6 h6Var = new kh.h6(context, this);
                            this.W = h6Var;
                            this.X.addView(h6Var, g7.e6.e(22, 8, 17));
                            TextView textView9 = new TextView(context);
                            this.Z = textView9;
                            textView9.setTextSize(1, 14.0f);
                            TextView textView10 = this.Z;
                            int i43 = org.telegram.ui.ActionBar.f6.Ae;
                            textView10.setTextColor(z14 ? org.telegram.ui.ActionBar.f6.C0(i43) : getThemedColor(i43));
                            this.Z.setGravity(17);
                            this.Z.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.e0(251658240, 0));
                            this.Z.setPadding(AndroidUtilities.dp(29.0f), 0, AndroidUtilities.dp(29.0f), 0);
                            this.Z.setText(LocaleController.getString(R.string.Cancel));
                            this.Z.setTypeface(AndroidUtilities.bold());
                            this.X.addView(this.Z, g7.e6.e(-2, -1, 51));
                            final int i44 = 0;
                            this.Z.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.bb1
                                public final /* synthetic */ oc1 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    switch (i44) {
                                        case 0:
                                            this.b.O0(false);
                                            break;
                                        case 1:
                                            oc1.T(this.b);
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
                            this.Y.setTextColor(z14 ? org.telegram.ui.ActionBar.f6.C0(i43) : getThemedColor(i43));
                            this.Y.setGravity(17);
                            this.Y.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.e0(251658240, 0));
                            this.Y.setPadding(AndroidUtilities.dp(29.0f), 0, AndroidUtilities.dp(29.0f), 0);
                            this.Y.setText(LocaleController.getString(R.string.ApplyTheme));
                            this.Y.setTypeface(AndroidUtilities.bold());
                            this.X.addView(this.Y, g7.e6.e(-2, -1, 53));
                            i19 = 1;
                            this.Y.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.bb1
                                public final /* synthetic */ oc1 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    switch (i19) {
                                        case 0:
                                            this.b.O0(false);
                                            break;
                                        case 1:
                                            oc1.T(this.b);
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
                            i19 = 1;
                        }
                        if (i12 == i19 && !org.telegram.ui.ActionBar.f6.Z0() && d6Var3 != null && d6Var3.j != 4294967296L) {
                            X0();
                        }
                        this.e0 = S0();
                        b1(true);
                        m1(false);
                        this.c = new Scroller(getContext());
                        b5Var2 = this.parentLayout;
                        if (b5Var2 != null && b5Var2.getBottomSheet() != null) {
                            this.parentLayout.getBottomSheet().fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.f6.h5));
                            if (i12 == 2 && this.F1 != 0) {
                                this.parentLayout.getBottomSheet().setOverlayNavBarColor(-16777216);
                            }
                        }
                        return this.fragmentView;
                    }
                    this.o0.setSubtitle(LocaleController.formatPluralString("ThemeInstallCount", i13, new Object[0]));
                }
            }
            this.q0 = new ib1(context, this);
            jb1 jb1Var2 = new jb1(this);
            jb1Var2.S();
            this.q0.setItemAnimator(jb1Var2);
            this.q0.setVerticalScrollBarEnabled(true);
            this.q0.setOverScrollMode(2);
            if (i12 == 2) {
            }
            this.q0.setClipToPadding(false);
            this.q0.setLayoutManager(new f2.m0(1, true));
            this.q0.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
            if (i12 == 1) {
            }
            this.q0.setOnScrollListener(new kb1(this, i21));
            this.p0.addView(this.o0, g7.e6.c(-2.0f, i14));
            org.telegram.ui.Components.q71 q71Var2 = new org.telegram.ui.Components.q71(context);
            this.r1 = q71Var2;
            q71Var2.b(new cb1(this, 2));
            org.telegram.ui.ActionBar.d6 d6Var52 = this.s;
            if (i12 != 1) {
            }
            if (i12 == 2) {
            }
            Rect rect3 = new Rect();
            Drawable mutate22 = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
            this.r = mutate22;
            mutate22.getPadding(rect3);
            this.r.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.f6.d6), PorterDuff.Mode.MULTIPLY));
            TextPaint textPaint2 = new TextPaint(1);
            textPaint2.setTextSize(AndroidUtilities.dp(14.0f));
            textPaint2.setTypeface(AndroidUtilities.bold());
            obj = this.x1;
            if (i12 != 1) {
            }
            if (obj instanceof xh1) {
            }
            i15 = 3;
            String[] strArr3222 = new String[i15];
            int[] iArr3222 = new int[i15];
            this.F0 = new org.telegram.ui.Components.o71[i15];
            if (i15 == 0) {
            }
            i17 = 0;
            while (true) {
                ob1Var = this.a;
                if (i17 < i15) {
                }
                i17++;
                d6Var2 = d6Var4;
            }
            d6Var3 = d6Var2;
            if (i12 == 1) {
            }
            if (i12 != 1) {
            }
            this.B1 = false;
            i18 = 0;
            while (i18 < 2) {
            }
            j1();
            if (!this.t0.getImageReceiver().hasBitmapImage()) {
            }
            if (i12 != 1) {
            }
            this.q0.setAdapter(this.r0);
            fh.v vVar22 = new fh.v(this, context, 28);
            this.g0 = vVar22;
            vVar22.setWillNotDraw(false);
            fh.v vVar32 = this.g0;
            this.fragmentView = vVar32;
            ViewTreeObserver viewTreeObserver2 = vVar32.getViewTreeObserver();
            int i412 = 1;
            l90 l90Var2 = new l90(this, i412);
            this.M = l90Var2;
            viewTreeObserver2.addOnGlobalLayoutListener(l90Var2);
            m2.g gVar22 = new m2.g(context);
            this.f0 = gVar22;
            gVar22.b(new p2(this, 2));
            this.f0.setAdapter(new h70(this, i412));
            AndroidUtilities.setViewPagerEdgeEffectColor(this.f0, getThemedColor(org.telegram.ui.ActionBar.f6.s8));
            this.g0.addView(this.f0, g7.e6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i12 == 0 ? 48.0f : 0.0f));
            UndoView undoView2 = new UndoView(context, this);
            this.h0 = undoView2;
            undoView2.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
            this.g0.addView(this.h0, g7.e6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            if (i12 == 0) {
            }
            if (i12 == i19) {
                X0();
            }
            this.e0 = S0();
            b1(true);
            m1(false);
            this.c = new Scroller(getContext());
            b5Var2 = this.parentLayout;
            if (b5Var2 != null) {
                this.parentLayout.getBottomSheet().fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.f6.h5));
                if (i12 == 2) {
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
        i9 = 3;
        if (this.I1) {
            AndroidUtilities.runOnUIThread(new ab1(this, i9), 2000L);
        }
        org.telegram.ui.ActionBar.w0 a22 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a22.F();
        a22.D = new zb1();
        a22.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c5());
        this.actionBar.setAddToContainer(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.ThemePreview));
        m0 m0Var3 = new m0(this, context, 24);
        this.i0 = m0Var3;
        m0Var3.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.d6));
        this.i0.addView(this.actionBar, g7.e6.c(-2.0f, -1));
        org.telegram.ui.Components.wk0 wk0Var3 = new org.telegram.ui.Components.wk0(context);
        this.j0 = wk0Var3;
        wk0Var3.setVerticalScrollBarEnabled(true);
        this.j0.setItemAnimator(null);
        this.j0.setLayoutAnimation(null);
        this.j0.setLayoutManager(new f2.m0(1, false));
        this.j0.setVerticalScrollbarPosition(!LocaleController.isRTL ? 1 : 2);
        org.telegram.ui.Components.wk0 wk0Var22 = this.j0;
        i10 = this.b;
        wk0Var22.setPadding(0, 0, 0, AndroidUtilities.dp(i10 == 0 ? 12.0f : 0.0f));
        final int i222 = 4;
        this.j0.setOnItemClickListener(new fh.a(i222));
        this.i0.addView(this.j0, g7.e6.e(-1, -1, 51));
        org.telegram.ui.Components.j10 j10Var2 = new org.telegram.ui.Components.j10(context, this.resourceProvider);
        this.l0 = j10Var2;
        j10Var2.setImageResource(R.drawable.floating_pencil);
        this.i0.addView(this.l0, org.telegram.ui.Components.j10.b());
        gc1 gc1Var2 = new gc1(context);
        this.k0 = gc1Var2;
        this.j0.setAdapter(gc1Var2);
        this.p0 = new org.telegram.ui.ActionBar.r0(this, context, i9);
        this.r0 = new kc1(context, this);
        this.o0 = createActionBar(context);
        if (AndroidUtilities.isTablet()) {
        }
        org.telegram.ui.Cells.j2.v(false, this.o0);
        this.o0.setActionBarMenuOnItemClick(new cc1(this));
        i11 = 0;
        while (true) {
            dc1VarArr = this.s0;
            if (i11 < 2) {
            }
            dc1VarArr[i11] = new dc1(this, (Activity) getContext());
            this.p0.addView(dc1VarArr[i11], g7.e6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
            i11++;
        }
        dc1 dc1Var2 = dc1VarArr[0];
        this.t0 = dc1Var2;
        dc1Var2.setVisibility(0);
        dc1VarArr[1].setVisibility(8);
        if (i10 == 2) {
        }
        z11 = this.r0.e;
        org.telegram.ui.ActionBar.e6 e6Var2 = this.a0;
        if (!z11) {
        }
        this.q0 = new ib1(context, this);
        jb1 jb1Var22 = new jb1(this);
        jb1Var22.S();
        this.q0.setItemAnimator(jb1Var22);
        this.q0.setVerticalScrollBarEnabled(true);
        this.q0.setOverScrollMode(2);
        if (i12 == 2) {
        }
        this.q0.setClipToPadding(false);
        this.q0.setLayoutManager(new f2.m0(1, true));
        this.q0.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        if (i12 == 1) {
        }
        this.q0.setOnScrollListener(new kb1(this, i21));
        this.p0.addView(this.o0, g7.e6.c(-2.0f, i14));
        org.telegram.ui.Components.q71 q71Var22 = new org.telegram.ui.Components.q71(context);
        this.r1 = q71Var22;
        q71Var22.b(new cb1(this, 2));
        org.telegram.ui.ActionBar.d6 d6Var522 = this.s;
        if (i12 != 1) {
        }
        if (i12 == 2) {
        }
        Rect rect32 = new Rect();
        Drawable mutate222 = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.r = mutate222;
        mutate222.getPadding(rect32);
        this.r.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.f6.d6), PorterDuff.Mode.MULTIPLY));
        TextPaint textPaint22 = new TextPaint(1);
        textPaint22.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint22.setTypeface(AndroidUtilities.bold());
        obj = this.x1;
        if (i12 != 1) {
        }
        if (obj instanceof xh1) {
        }
        i15 = 3;
        String[] strArr32222 = new String[i15];
        int[] iArr32222 = new int[i15];
        this.F0 = new org.telegram.ui.Components.o71[i15];
        if (i15 == 0) {
        }
        i17 = 0;
        while (true) {
            ob1Var = this.a;
            if (i17 < i15) {
            }
            i17++;
            d6Var2 = d6Var4;
        }
        d6Var3 = d6Var2;
        if (i12 == 1) {
        }
        if (i12 != 1) {
        }
        this.B1 = false;
        i18 = 0;
        while (i18 < 2) {
        }
        j1();
        if (!this.t0.getImageReceiver().hasBitmapImage()) {
        }
        if (i12 != 1) {
        }
        this.q0.setAdapter(this.r0);
        fh.v vVar222 = new fh.v(this, context, 28);
        this.g0 = vVar222;
        vVar222.setWillNotDraw(false);
        fh.v vVar322 = this.g0;
        this.fragmentView = vVar322;
        ViewTreeObserver viewTreeObserver22 = vVar322.getViewTreeObserver();
        int i4122 = 1;
        l90 l90Var22 = new l90(this, i4122);
        this.M = l90Var22;
        viewTreeObserver22.addOnGlobalLayoutListener(l90Var22);
        m2.g gVar222 = new m2.g(context);
        this.f0 = gVar222;
        gVar222.b(new p2(this, 2));
        this.f0.setAdapter(new h70(this, i4122));
        AndroidUtilities.setViewPagerEdgeEffectColor(this.f0, getThemedColor(org.telegram.ui.ActionBar.f6.s8));
        this.g0.addView(this.f0, g7.e6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i12 == 0 ? 48.0f : 0.0f));
        UndoView undoView22 = new UndoView(context, this);
        this.h0 = undoView22;
        undoView22.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
        this.g0.addView(this.h0, g7.e6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        if (i12 == 0) {
        }
        if (i12 == i19) {
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

    public final void d1(org.telegram.ui.Cells.w0 w0Var) {
        float f10;
        if (this.t0 == null) {
            return;
        }
        Bitmap bitmap = this.a.r;
        if (bitmap != null) {
            float width = bitmap.getWidth();
            f10 = ((this.t0.getMeasuredWidth() - (Math.max(this.t0.getMeasuredWidth() / width, this.t0.getMeasuredHeight() / r0.r.getHeight()) * width)) / 2.0f) + this.T1 + 0.0f;
        } else {
            f10 = this.T1 + 0.0f;
        }
        float y10 = w0Var.getY() - ((-this.t0.F) + 0.0f);
        int measuredHeight = this.t0.getMeasuredHeight();
        float f11 = this.I1 ? this.j1 * this.k1 : 0.0f;
        w0Var.s0 = true;
        w0Var.r0 = measuredHeight;
        w0Var.p0 = y10;
        w0Var.q0 = f10;
        w0Var.O1 = f11;
        w0Var.P1.setColor(i0.a.k(-16777216, (int) (f11 * 255.0f)));
        w0Var.invalidate();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        if (i9 == NotificationCenter.chatWasBoostedByUser) {
            if (this.F1 == ((Long) objArr[2]).longValue()) {
                this.R1 = (TL_stories.TL_premium_boostsStatus) objArr[0];
                h1(true);
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.emojiLoaded) {
            org.telegram.ui.Components.wk0 wk0Var = this.j0;
            if (wk0Var == null) {
                return;
            }
            int childCount = wk0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.j0.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.r2) {
                    ((org.telegram.ui.Cells.r2) childAt).a0(0, true);
                }
            }
            return;
        }
        if (i9 == NotificationCenter.invalidateMotionBackground) {
            ib1 ib1Var = this.q0;
            if (ib1Var != null) {
                ib1Var.f1();
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.didSetNewWallpapper) {
            if (this.p0 != null) {
                b1(true);
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.wallpapersNeedReload) {
            Object obj = this.x1;
            if (obj instanceof yh1) {
                yh1 yh1Var = (yh1) obj;
                if (yh1Var.a == null) {
                    yh1Var.a = (String) objArr[0];
                    return;
                }
                return;
            }
            return;
        }
        long j10 = 0;
        if (i9 != NotificationCenter.wallpapersDidLoad) {
            if (i9 != NotificationCenter.wallpaperSettedToUser || this.F1 == 0) {
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
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) arrayList.get(i12);
            if ((wallPaper instanceof TLRPC.TL_wallPaper) && wallPaper.pattern) {
                TLRPC.Document document = wallPaper.document;
                if (document != null && !hashMap.containsKey(Long.valueOf(document.id))) {
                    this.Q0.add(wallPaper);
                    hashMap.put(Long.valueOf(wallPaper.document.id), wallPaper);
                }
                org.telegram.ui.ActionBar.d6 d6Var = this.s;
                if (d6Var != null && (str = d6Var.o) != null && str.equals(wallPaper.slug)) {
                    this.S0 = (TLRPC.TL_wallPaper) wallPaper;
                    b1(false);
                    j1();
                } else if (d6Var == null) {
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
        mc1 mc1Var = this.M0;
        if (mc1Var != null) {
            mc1Var.l();
        }
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) arrayList.get(i13);
            if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                j10 = MediaDataController.calcHash(j10, wallPaper2.id);
            }
        }
        TL_account.getWallPapers getwallpapers = new TL_account.getWallPapers();
        getwallpapers.hash = j10;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new gb1(this, 1)), this.classGuid);
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
            org.telegram.ui.Components.s30 s30Var = new org.telegram.ui.Components.s30(getParentActivity(), 8);
            this.w0 = s30Var;
            s30Var.setShowingDuration(5000L);
            this.w0.setAlpha(0.0f);
            this.w0.setVisibility(4);
            this.w0.setText(LocaleController.getString(R.string.BackgroundAnimateInfo));
            this.w0.setExtraTranslationY(AndroidUtilities.dp(6.0f));
            this.g0.addView(this.w0, g7.e6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
        AndroidUtilities.runOnUIThread(new n21(13, this, globalMainSettings), 500L);
    }

    public final void f1(int i9, boolean z10, boolean z11) {
        int indexOf;
        boolean z12 = z10 && i9 == 1 && this.S0 != null;
        int i10 = this.b;
        if (z10) {
            if (i9 != 0) {
                this.T0 = this.S0;
                this.i1 = this.h1;
                this.M0.l();
                ArrayList arrayList = this.Q0;
                if (arrayList != null) {
                    TLRPC.TL_wallPaper tL_wallPaper = this.S0;
                    if (tL_wallPaper == null) {
                        indexOf = 0;
                    } else {
                        indexOf = arrayList.indexOf(tL_wallPaper) + (i10 == 2 ? 1 : 0);
                    }
                    this.N0.h1(indexOf, (this.L0.getMeasuredWidth() - AndroidUtilities.dp(124.0f)) / 2);
                }
            } else if (i10 == 2) {
                this.W0 = this.V0;
                int i11 = this.X0;
                this.a1 = i11;
                int i12 = this.Y0;
                this.b1 = i12;
                int i13 = this.Z0;
                this.c1 = i13;
                this.e1 = this.K;
                this.R.f(0, 4, i13 != 0 ? 4 : i12 != 0 ? 3 : i11 != 0 ? 2 : 1, false);
                this.R.e(this.Z0, 3);
                this.R.e(this.Y0, 2);
                this.R.e(this.X0, 1);
                this.R.e(this.V0, 0);
            }
        }
        if (i10 == 1 || i10 == 2) {
            this.F0[z12 ? (char) 2 : (char) 0].setVisibility(0);
        }
        if (i9 == 1) {
            org.telegram.ui.Cells.j0 j0Var = this.P0;
            if (!j0Var.H) {
                float f10 = this.h1;
                if (f10 < 0.0f) {
                    float f11 = -f10;
                    this.h1 = f11;
                    j0Var.setProgress(f11);
                }
            }
        }
        FrameLayout[] frameLayoutArr = this.H0;
        if (!z11) {
            char c10 = i9 == 0 ? (char) 1 : (char) 0;
            if (z10) {
                frameLayoutArr[i9].setVisibility(0);
                if (i10 == 1) {
                    this.q0.setTranslationY(i9 == 1 ? -AndroidUtilities.dp(21.0f) : 0.0f);
                    this.F0[2].setAlpha(z12 ? 1.0f : 0.0f);
                    this.F0[0].setAlpha(z12 ? 0.0f : 1.0f);
                    if (i9 == 1) {
                        frameLayoutArr[i9].setAlpha(1.0f);
                    } else {
                        frameLayoutArr[i9].setAlpha(1.0f);
                        frameLayoutArr[c10].setAlpha(0.0f);
                    }
                    AndroidUtilities.hideKeyboard(this.R.A[1]);
                } else if (i10 == 2) {
                    this.q0.setTranslationY(AndroidUtilities.dp((this.w1 == null ? 0 : 58) + 72) + (-AndroidUtilities.dp(i9 == 0 ? 343.0f : 316.0f)) + (U0() ? AndroidUtilities.navigationBarHeight : 0));
                    this.F0[2].setAlpha(z12 ? 1.0f : 0.0f);
                    this.F0[0].setAlpha(z12 ? 0.0f : 1.0f);
                    if (frameLayoutArr[c10].getVisibility() == 0) {
                        frameLayoutArr[c10].setAlpha(0.0f);
                        frameLayoutArr[i9].setAlpha(1.0f);
                        frameLayoutArr[i9].setTranslationY(0.0f);
                    } else {
                        frameLayoutArr[i9].setTranslationY(0.0f);
                    }
                } else {
                    if (i9 == 1) {
                        frameLayoutArr[i9].setAlpha(1.0f);
                    } else {
                        frameLayoutArr[i9].setAlpha(1.0f);
                        frameLayoutArr[c10].setAlpha(0.0f);
                    }
                    AndroidUtilities.hideKeyboard(this.R.A[1]);
                }
            } else {
                this.q0.setTranslationY(0.0f);
                frameLayoutArr[i9].setTranslationY(r9.getMeasuredHeight());
                this.F0[0].setAlpha(1.0f);
                this.F0[2].setAlpha(1.0f);
                this.t0.setAlpha(1.0f);
            }
            if (z10 && frameLayoutArr[c10].getVisibility() == 0) {
                frameLayoutArr[c10].setAlpha(1.0f);
                frameLayoutArr[c10].setVisibility(4);
            } else if (!z10) {
                frameLayoutArr[i9].setVisibility(4);
            }
            if (i10 == 1 || i10 == 2) {
                this.F0[z12 ? (char) 0 : (char) 2].setVisibility(4);
                return;
            } else {
                if (i9 == 1) {
                    frameLayoutArr[c10].setAlpha(0.0f);
                    return;
                }
                return;
            }
        }
        this.n1 = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        int i14 = i9 == 0 ? 1 : 0;
        if (z10) {
            frameLayoutArr[i9].setVisibility(0);
            if (i10 == 1) {
                arrayList2.add(ObjectAnimator.ofFloat(this.q0, (Property<ib1, Float>) View.TRANSLATION_Y, i9 == 1 ? -AndroidUtilities.dp(21.0f) : 0.0f));
                org.telegram.ui.Components.o71 o71Var = this.F0[2];
                Property property = View.ALPHA;
                arrayList2.add(ObjectAnimator.ofFloat(o71Var, (Property<org.telegram.ui.Components.o71, Float>) property, z12 ? 1.0f : 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.F0[0], (Property<org.telegram.ui.Components.o71, Float>) property, z12 ? 0.0f : 1.0f));
                if (i9 == 1) {
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i9], (Property<FrameLayout, Float>) property, 0.0f, 1.0f));
                } else {
                    frameLayoutArr[i9].setAlpha(1.0f);
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i14], (Property<FrameLayout, Float>) property, 0.0f));
                }
                AndroidUtilities.hideKeyboard(this.R.A[1]);
            } else if (i10 == 2) {
                ib1 ib1Var = this.q0;
                Property property2 = View.TRANSLATION_Y;
                arrayList2.add(ObjectAnimator.ofFloat(ib1Var, (Property<ib1, Float>) property2, AndroidUtilities.dp((this.w1 == null ? 0 : 58) + 72) + (-frameLayoutArr[i9].getMeasuredHeight()) + (U0() ? AndroidUtilities.navigationBarHeight : 0)));
                org.telegram.ui.Components.o71 o71Var2 = this.F0[2];
                Property property3 = View.ALPHA;
                arrayList2.add(ObjectAnimator.ofFloat(o71Var2, (Property<org.telegram.ui.Components.o71, Float>) property3, z12 ? 1.0f : 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.F0[0], (Property<org.telegram.ui.Components.o71, Float>) property3, z12 ? 0.0f : 1.0f));
                if (frameLayoutArr[i14].getVisibility() == 0) {
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i14], (Property<FrameLayout, Float>) property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i9], (Property<FrameLayout, Float>) property3, 0.0f, 1.0f));
                    frameLayoutArr[i9].setTranslationY(0.0f);
                } else {
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i9], (Property<FrameLayout, Float>) property2, r6.getMeasuredHeight(), 0.0f));
                }
            } else {
                if (i9 == 1) {
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i9], (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
                } else {
                    frameLayoutArr[i9].setAlpha(1.0f);
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i14], (Property<FrameLayout, Float>) View.ALPHA, 0.0f));
                }
                AndroidUtilities.hideKeyboard(this.R.A[1]);
            }
        } else {
            ib1 ib1Var2 = this.q0;
            Property property4 = View.TRANSLATION_Y;
            arrayList2.add(ObjectAnimator.ofFloat(ib1Var2, (Property<ib1, Float>) property4, 0.0f));
            arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i9], (Property<FrameLayout, Float>) property4, r6.getMeasuredHeight()));
            org.telegram.ui.Components.o71 o71Var3 = this.F0[0];
            Property property5 = View.ALPHA;
            arrayList2.add(ObjectAnimator.ofFloat(o71Var3, (Property<org.telegram.ui.Components.o71, Float>) property5, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(this.F0[2], (Property<org.telegram.ui.Components.o71, Float>) property5, 0.0f));
            arrayList2.add(ObjectAnimator.ofFloat(this.t0, (Property<dc1, Float>) property5, 1.0f));
        }
        this.n1.playTogether(arrayList2);
        this.n1.addListener(new vb1(this, z10, i14, i9, z12));
        this.n1.setInterpolator(org.telegram.ui.Components.gr.g);
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
        int i9 = 2;
        int[] iArr = new int[2];
        this.K1.getLocationInWindow(iArr);
        float f10 = iArr[0];
        float f11 = iArr[1];
        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        gc gcVar = new gc(this, getParentActivity(), canvas, (this.K1.getMeasuredWidth() / 2.0f) + f10, (this.K1.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 2);
        this.d2 = gcVar;
        gcVar.setOnTouchListener(new jh.d(i9));
        this.e2 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f2 = ofFloat;
        ofFloat.addUpdateListener(new kh.fb(this, 3));
        this.f2.addListener(new sb1(this, 4));
        this.f2.setDuration(400L);
        this.f2.setInterpolator(org.telegram.ui.Components.xs.e);
        this.f2.start();
        frameLayout.addView(this.d2, new ViewGroup.LayoutParams(-1, -1));
        AndroidUtilities.runOnUIThread(new ab1(this, i9));
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final int getObserverTag() {
        return this.p1;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final org.telegram.ui.ActionBar.b6 getResourceProvider() {
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
        int i9 = 0;
        if (chat == null) {
            this.v1.d(LocaleController.formatString(R.string.ApplyWallpaperForChannel, LocaleController.getString(R.string.AccDescrChannel).toLowerCase()));
            return;
        }
        this.v1.d(LocaleController.formatString(R.string.ApplyWallpaperForChannel, chat.title));
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.R1;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < R0()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
            if (this.m1 == null) {
                org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(R.drawable.mini_switch_lock, 0);
                this.m1 = eqVar;
                eqVar.setTopOffset(1);
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
        getMessagesController().getBoostsController().getBoostsStats(this.F1, new fb1(this, i9));
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
        return motionEvent.getY() <= ((float) (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight));
    }

    public final void j1() {
        File httpFilePath;
        String name;
        int i9;
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
                    i9 = closestPhotoSizeWithSize.size;
                } else {
                    httpFilePath = ImageLoader.getHttpFilePath(searchImage.imageUrl, "jpg");
                    name = httpFilePath.getName();
                    i9 = searchImage.size;
                }
                j10 = i9;
                String str2 = name;
                file = httpFilePath;
                str = str2;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
            }
            boolean exists = file.exists();
            int i10 = this.b;
            if (exists) {
                DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
                this.t0.invalidate();
                if (i10 == 2) {
                    if (j10 == 0 || this.F1 != 0) {
                        this.o0.setSubtitle(null);
                    } else {
                        this.o0.setSubtitle(AndroidUtilities.formatFileSize(j10));
                    }
                }
            } else {
                DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(str, null, this);
                if (i10 == 2 && this.F1 == 0) {
                    this.o0.setSubtitle(LocaleController.getString(R.string.LoadingFullImage));
                }
                this.t0.invalidate();
            }
            if (this.S0 == null && (frameLayout = this.u0) != null) {
                frameLayout.setAlpha(exists ? 1.0f : 0.5f);
            }
            if (i10 == 0) {
                this.Y.setEnabled(exists);
                this.Y.setAlpha(exists ? 1.0f : 0.5f);
                return;
            }
            if (i10 != 2) {
                this.f.setEnabled(exists);
                this.f.setAlpha(exists ? 1.0f : 0.5f);
                return;
            }
            this.y0.setEnabled(exists);
            ec1 ec1Var = this.v1;
            if (ec1Var != null) {
                ec1Var.setAlpha(exists ? 1.0f : 0.5f);
            }
            ec1 ec1Var2 = this.w1;
            if (ec1Var2 != null) {
                ec1Var2.setAlpha(exists ? 1.0f : 0.5f);
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
            if (this.t0.getBackground() instanceof org.telegram.ui.Components.jb0) {
                this.t0.getImageReceiver().setGradientBitmap(((org.telegram.ui.Components.jb0) this.t0.getBackground()).k);
            }
        }
        this.a.b(this.t0.getBackground(), this.t0.getBackground(), Float.valueOf(this.h1));
        V0();
    }

    public final void l1() {
        int i9 = this.b;
        if (i9 == 1 || i9 == 2) {
            if (this.S0 == null && (this.x1 instanceof xh1)) {
                this.F0[2].a(false, true);
            }
            this.F0[this.S0 != null ? (char) 2 : (char) 0].setVisibility(0);
            AnimatorSet animatorSet = new AnimatorSet();
            org.telegram.ui.Components.o71 o71Var = this.F0[2];
            Property property = View.ALPHA;
            animatorSet.playTogether(ObjectAnimator.ofFloat(o71Var, (Property<org.telegram.ui.Components.o71, Float>) property, this.S0 != null ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.F0[0], (Property<org.telegram.ui.Components.o71, Float>) property, this.S0 != null ? 0.0f : 1.0f));
            animatorSet.addListener(new tb1(this));
            animatorSet.setInterpolator(org.telegram.ui.Components.gr.g);
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
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.F0[0], (Property<org.telegram.ui.Components.o71, Float>) View.ALPHA, this.S0 == null ? 0.0f : 1.0f));
        org.telegram.ui.Components.o71 o71Var2 = this.F0[0];
        Property property2 = View.TRANSLATION_X;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(o71Var2, (Property<org.telegram.ui.Components.o71, Float>) property2, this.S0 != null ? 0.0f : dp));
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.F0[1], (Property<org.telegram.ui.Components.o71, Float>) property2, this.S0 == null ? -dp : 0.0f));
        animatorSet2.setInterpolator(org.telegram.ui.Components.gr.g);
        animatorSet2.setDuration(200L);
        animatorSet2.addListener(new ub1(this));
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
        char c10;
        char c11;
        float f10;
        mb1 mb1Var;
        boolean z11;
        int i9;
        BlendMode blendMode;
        int i10 = Build.VERSION.SDK_INT;
        int i11 = this.b;
        org.telegram.ui.ActionBar.d6 d6Var = this.s;
        if (i10 >= 29) {
            if (i11 == 0) {
                i9 = d6Var != null ? (int) d6Var.l : getThemedColor(org.telegram.ui.ActionBar.f6.Pd);
            } else if (i11 == 1) {
                int B0 = org.telegram.ui.ActionBar.f6.B0(org.telegram.ui.ActionBar.f6.Pd);
                long j10 = d6Var.l;
                int i12 = (int) j10;
                if (i12 != 0 || j10 == 0) {
                    if (i12 != 0) {
                        B0 = i12;
                    }
                    i9 = B0;
                }
                i9 = 0;
            } else {
                if (this.x1 instanceof xh1) {
                    i9 = this.Y0;
                }
                i9 = 0;
            }
            if (i9 == 0 || this.h1 < 0.0f) {
                this.t0.getImageReceiver().setBlendMode(null);
            } else {
                ImageReceiver imageReceiver = this.t0.getImageReceiver();
                blendMode = BlendMode.SOFT_LIGHT;
                imageReceiver.setBlendMode(blendMode);
            }
        }
        int i13 = 2;
        if (this.z0 != null) {
            if (i11 != 2) {
                if (i11 == 1) {
                    int B02 = org.telegram.ui.ActionBar.f6.B0(org.telegram.ui.ActionBar.f6.Od);
                    long j11 = d6Var.k;
                    int i14 = (int) j11;
                    if (i14 == 0 && j11 != 0) {
                        B02 = 0;
                    } else if (i14 != 0) {
                        B02 = i14;
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
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.z0, (Property<mb1, Float>) View.ALPHA, z11 ? 1.0f : 0.0f);
                    c11 = 4;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.z0, (Property<mb1, Float>) View.SCALE_X, z11 ? 1.0f : 0.0f);
                    f10 = 1.0f;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.z0, (Property<mb1, Float>) View.SCALE_Y, z11 ? 1.0f : 0.0f);
                    org.telegram.ui.Components.o71 o71Var = this.F0[0];
                    Property property = View.TRANSLATION_X;
                    c10 = 3;
                    animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(o71Var, (Property<org.telegram.ui.Components.o71, Float>) property, z11 ? AndroidUtilities.dp(34.0f) : 0.0f), ObjectAnimator.ofFloat(this.F0[1], (Property<org.telegram.ui.Components.o71, Float>) property, z11 ? -AndroidUtilities.dp(34.0f) : 0.0f), ObjectAnimator.ofFloat(this.F0[2], (Property<org.telegram.ui.Components.o71, Float>) property, z11 ? AndroidUtilities.dp(34.0f) : 0.0f));
                    this.D0.setDuration(180L);
                    this.D0.addListener(new sb1(this, i13));
                    this.D0.setInterpolator(org.telegram.ui.Components.gr.g);
                    this.D0.start();
                } else {
                    c10 = 3;
                    c11 = 4;
                    f10 = 1.0f;
                    this.z0.setAlpha(z11 ? 1.0f : 0.0f);
                    this.z0.setScaleX(z11 ? 1.0f : 0.0f);
                    this.z0.setScaleY(z11 ? 1.0f : 0.0f);
                    this.F0[0].setTranslationX(z11 ? AndroidUtilities.dp(34.0f) : 0.0f);
                    this.F0[1].setTranslationX(z11 ? -AndroidUtilities.dp(34.0f) : 0.0f);
                    this.F0[2].setTranslationX(z11 ? AndroidUtilities.dp(34.0f) : 0.0f);
                }
                mb1Var = this.A0;
                if (mb1Var == null) {
                    boolean z13 = mb1Var.getTag() != null;
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
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.A0, (Property<mb1, Float>) View.ALPHA, f10);
                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.A0, (Property<mb1, Float>) View.SCALE_X, f10);
                        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.A0, (Property<mb1, Float>) View.SCALE_Y, f10);
                        org.telegram.ui.Components.o71 o71Var2 = this.G0[0];
                        Property property2 = View.TRANSLATION_X;
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(o71Var2, (Property<org.telegram.ui.Components.o71, Float>) property2, -AndroidUtilities.dp(34.0f));
                        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.G0[1], (Property<org.telegram.ui.Components.o71, Float>) property2, AndroidUtilities.dp(34.0f));
                        Animator[] animatorArr = new Animator[5];
                        animatorArr[0] = ofFloat4;
                        animatorArr[1] = ofFloat5;
                        animatorArr[2] = ofFloat6;
                        animatorArr[c10] = ofFloat7;
                        animatorArr[c11] = ofFloat8;
                        animatorSet4.playTogether(animatorArr);
                        this.E0.setDuration(180L);
                        this.E0.addListener(new sb1(this, 3));
                        this.E0.setInterpolator(org.telegram.ui.Components.gr.g);
                        this.E0.start();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        c10 = 3;
        c11 = 4;
        f10 = 1.0f;
        mb1Var = this.A0;
        if (mb1Var == null) {
        }
    }

    public final void n1() {
        int childCount = this.L0.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = this.L0.getChildAt(i9);
            if (childAt instanceof org.telegram.ui.Cells.k5) {
                ((org.telegram.ui.Cells.k5) childAt).u(true);
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
        this.parentLayout.getBottomSheet().fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.f6.h5));
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
        int i9 = this.b;
        if (i9 == 1 || i9 == 0) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewWallpapper);
        }
        if (i9 == 2 || i9 == 1) {
            org.telegram.ui.ActionBar.f6.N = true;
        }
        if (i9 == 0 && this.s == null) {
            this.A1 = org.telegram.ui.ActionBar.f6.i0;
        } else {
            Point point = AndroidUtilities.displaySize;
            int min = Math.min(point.x, point.y);
            Point point2 = AndroidUtilities.displaySize;
            int max = Math.max(point2.x, point2.y);
            StringBuilder sb2 = new StringBuilder();
            sb2.append((int) (min / AndroidUtilities.density));
            sb2.append("_");
            this.C1 = aa.d.l((int) (max / AndroidUtilities.density), "_f", sb2);
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
        fh.v vVar = this.g0;
        if (vVar != null && this.M != null) {
            vVar.getViewTreeObserver().removeOnGlobalLayoutListener(this.M);
        }
        int i9 = this.b;
        if ((i9 == 2 || i9 == 1) && this.l1 == null) {
            AndroidUtilities.runOnUIThread(new lj0(6));
        }
        if (i9 == 2) {
            Bitmap bitmap = this.s1;
            if (bitmap != null) {
                bitmap.recycle();
                this.s1 = null;
            }
            this.a.b(null, null, null);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
        } else if (i9 == 1 || i9 == 0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        }
        if (i9 != 0 || this.s != null) {
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
        org.telegram.ui.ActionBar.f6.b = false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        gc1 gc1Var = this.k0;
        if (gc1Var != null) {
            gc1Var.l();
        }
        kc1 kc1Var = this.r0;
        if (kc1Var != null) {
            kc1Var.l();
        }
        if (this.A1) {
            this.r1.c(true);
        }
        org.telegram.ui.ActionBar.f6.b = true;
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
    public final void setResourceProvider(org.telegram.ui.ActionBar.b6 b6Var) {
        this.a.a = b6Var;
    }

    public oc1(org.telegram.ui.ActionBar.e6 e6Var, boolean z10, int i9, boolean z11, boolean z12) {
        super(null);
        this.a = new ob1(this);
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
        this.U = new ab1(this, 0);
        this.s0 = new dc1[2];
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
        this.O1 = new org.telegram.ui.Components.u10(getParentActivity(), new qb1(this));
        this.P1 = false;
        this.Q1 = false;
        this.b = i9;
        this.b0 = z12;
        this.a0 = e6Var;
        this.d0 = z10;
        this.c0 = z11;
        if (i9 == 1) {
            org.telegram.ui.ActionBar.d6 k10 = e6Var.k(!z11);
            this.s = k10;
            if (k10 != null) {
                this.d = false;
                this.w = k10.c;
                this.x = k10.d;
                this.y = k10.e;
                this.A = k10.f;
                this.B = k10.g;
                this.C = k10.h;
                this.D = k10.i;
                this.E = k10.j;
                this.F = k10.k;
                this.G = k10.l;
                this.H = k10.m;
                this.I = k10.p;
                this.J = k10.o;
                this.K = k10.n;
            }
        } else {
            if (i9 == 0) {
                this.d = false;
            }
            org.telegram.ui.ActionBar.d6 k11 = e6Var.k(false);
            this.s = k11;
            if (k11 != null) {
                this.S0 = k11.s;
            }
        }
        org.telegram.ui.ActionBar.d6 d6Var = this.s;
        if (d6Var != null) {
            this.A1 = d6Var.q;
            if (!TextUtils.isEmpty(d6Var.o)) {
                this.h1 = this.s.p;
            }
            org.telegram.ui.ActionBar.f6.M = org.telegram.ui.ActionBar.f6.A0();
            org.telegram.ui.ActionBar.f6.O = true;
            org.telegram.ui.ActionBar.f6.P = true;
            org.telegram.ui.ActionBar.f6.t(e6Var, false, false);
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

    public oc1(org.telegram.ui.ActionBar.e6 e6Var) {
        this(e6Var, false, 0, false, false);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
