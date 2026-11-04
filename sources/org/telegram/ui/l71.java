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
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class l71 extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.x5, org.telegram.messenger.cs {
    public FrameLayout A0;
    public float A1;
    public FrameLayout B0;
    public c71 B1;
    public org.telegram.ui.Components.u20 C0;
    public c71 C1;
    public AnimatorSet D0;
    public Object D1;
    public final int E;
    public v4 E0;
    public Bitmap E1;
    public final int F;
    public j61 F0;
    public boolean F1;
    public final int G;
    public j61 G0;
    public boolean G1;
    public final int H;
    public ImageView H0;
    public boolean H1;
    public final int I;
    public ImageView I0;
    public String I1;
    public final boolean J;
    public AnimatorSet J0;
    public int J1;
    public final long K;
    public AnimatorSet K0;
    public k71 K1;
    public final long L;
    public org.telegram.ui.Components.o61[] L0;
    public long L1;
    public final long M;
    public org.telegram.ui.Components.o61[] M0;
    public boolean M1;
    public final long N;
    public final FrameLayout[] N0;
    public boolean N1;
    public final float O;
    public final TextView[] O0;
    public boolean O1;
    public final String P;
    public final TextView[] P0;
    public org.telegram.ui.Components.ch0 P1;
    public final int Q;
    public final FrameLayout[] Q0;
    public org.telegram.ui.ActionBar.q0 Q1;
    public long R;
    public u51 R0;
    public ValueAnimator R1;
    public s70 S;
    public j71 S0;
    public ci.t4 S1;
    public final org.telegram.ui.ActionBar.p5 T;
    public u4.b0 T0;
    public i61 T1;
    public final org.telegram.ui.ActionBar.p5 U;
    public org.telegram.ui.Cells.n4 U0;
    public final org.telegram.ui.Components.v00 U1;
    public final org.telegram.ui.ActionBar.p5 V;
    public org.telegram.ui.Cells.h0 V0;
    public boolean V1;
    public final org.telegram.ui.ActionBar.p5 W;
    public ArrayList W0;
    public boolean W1;
    public org.telegram.ui.Components.vp X;
    public final HashMap X0;
    public TL_stories.TL_premium_boostsStatus X1;
    public int Y;
    public TLRPC.TL_wallPaper Y0;
    public float Y1;
    public int Z;
    public TLRPC.TL_wallPaper Z0;
    public float Z1;
    public final l61 a;
    public final Runnable a0;
    public TLRPC.TL_wallPaper a1;
    public float a2;
    public final int b;
    public boolean b0;
    public int b1;
    public float b2;
    public Scroller c;
    public gi.n5 c0;
    public int c1;
    public boolean c2;
    public final boolean d;
    public FrameLayout d0;
    public int d1;
    public int d2;
    public gi.u2 e;
    public TextView e0;
    public int e1;
    public ValueAnimator e2;
    public org.telegram.ui.ActionBar.q0 f;
    public TextView f0;
    public int f1;
    public boolean f2;
    public final org.telegram.ui.ActionBar.j6 g0;
    public int g1;
    public TextView g2;
    public TextView h;
    public final boolean h0;
    public int h1;
    public WeakReference h2;
    public final boolean i0;
    public int i1;
    public BitmapDrawable i2;
    public final boolean j0;
    public int j1;
    public ac j2;
    public ArrayList k0;
    public int k1;
    public float k2;
    public b5.l l0;
    public int l1;
    public ValueAnimator l2;
    public n61 m0;
    public int m1;
    public int n;
    public UndoView n0;
    public float n1;
    public FrameLayout o0;
    public float o1;
    public org.telegram.ui.Components.tj0 p0;
    public float p1;
    public n4 q0;
    public float q1;
    public Drawable r;
    public org.telegram.ui.Components.l00 r0;
    public d71 r1;
    public int s;
    public org.telegram.messenger.zi s0;
    public org.telegram.ui.Components.wp s1;
    public boolean t0;
    public AnimatorSet t1;
    public org.telegram.ui.ActionBar.k u0;
    public final PorterDuff.Mode u1;
    public org.telegram.ui.ActionBar.k0 v0;
    public int v1;
    public final org.telegram.ui.ActionBar.g6 w;
    public g61 w0;
    public org.telegram.ui.Components.d9 w1;
    public boolean x;
    public h71 x0;
    public org.telegram.ui.Components.q61 x1;
    public final int y;
    public final b71[] y0;
    public Bitmap y1;
    public b71 z0;
    public Bitmap z1;

    public l71(Object obj, Bitmap bitmap, boolean z10) {
        super(null);
        this.a = new l61(this);
        this.d = true;
        this.n = 1;
        org.telegram.ui.ActionBar.p5 p5Var = new org.telegram.ui.ActionBar.p5(this, 0, false);
        this.T = p5Var;
        org.telegram.ui.ActionBar.p5 p5Var2 = new org.telegram.ui.ActionBar.p5(this, 0, true);
        this.U = p5Var2;
        org.telegram.ui.ActionBar.p5 p5Var3 = new org.telegram.ui.ActionBar.p5(this, 1, false);
        this.V = p5Var3;
        org.telegram.ui.ActionBar.p5 p5Var4 = new org.telegram.ui.ActionBar.p5(this, 1, true);
        this.W = p5Var4;
        this.Z = -1;
        this.a0 = new y51(this, 0);
        this.y0 = new b71[2];
        this.N0 = new FrameLayout[2];
        this.O0 = new TextView[2];
        this.P0 = new TextView[2];
        this.Q0 = new FrameLayout[2];
        this.X0 = new HashMap();
        this.n1 = 0.5f;
        this.p1 = 0.0f;
        this.u1 = PorterDuff.Mode.SRC_IN;
        this.A1 = 1.0f;
        this.I1 = "640_360";
        this.J1 = 1920;
        this.M1 = true;
        this.U1 = new org.telegram.ui.Components.v00(getParentActivity(), new o61(this));
        this.V1 = false;
        this.W1 = false;
        this.b = 2;
        this.D1 = obj;
        this.E1 = bitmap;
        this.F1 = z10;
        if (obj instanceof kc1) {
            kc1 kc1Var = (kc1) obj;
            this.G1 = kc1Var.j;
            TLRPC.TL_wallPaper tL_wallPaper = kc1Var.g;
            this.Y0 = tL_wallPaper;
            if (tL_wallPaper != null) {
                float f10 = kc1Var.h;
                this.n1 = f10;
                if (f10 < 0.0f && !org.telegram.ui.ActionBar.k6.I.q()) {
                    this.n1 *= -1.0f;
                }
            }
        }
        p5Var.v = true;
        p5Var3.v = true;
        p5Var2.v = true;
        p5Var4.v = true;
    }

    public static void Z(l71 l71Var, org.telegram.messenger.e3 e3Var) {
        if (l71Var.getParentActivity() == null) {
            return;
        }
        vg.i0 i0Var = new vg.i0(23, l71Var.currentAccount, l71Var.getParentActivity(), l71Var, l71Var.a);
        i0Var.A1(e3Var);
        i0Var.z1(l71Var.X1, true);
        i0Var.B1(l71Var.L1);
        if (!l71Var.Z0()) {
            i0Var.J2 = new y51(l71Var, 1);
        }
        l71Var.showDialog(i0Var);
    }

    public static void a0(l71 l71Var) {
        org.telegram.ui.ActionBar.j6 j6Var = org.telegram.ui.ActionBar.k6.M;
        if (j6Var == null) {
            return;
        }
        int i3 = j6Var.a0;
        org.telegram.ui.ActionBar.g6 k10 = i3 >= 0 ? (org.telegram.ui.ActionBar.g6) j6Var.b0.get(i3) : j6Var.k(false);
        if (l71Var.w != null) {
            l71Var.b1();
            org.telegram.ui.ActionBar.k6.z1(l71Var.g0, true, false, false, false, false);
            if (org.telegram.ui.ActionBar.k6.M != null) {
                org.telegram.ui.ActionBar.k6.O = false;
                org.telegram.ui.ActionBar.k6.P = false;
                org.telegram.ui.ActionBar.k6.M = null;
            }
            org.telegram.ui.ActionBar.k6.u(l71Var.g0, true, l71Var.h0);
            ((ActionBarLayout) l71Var.parentLayout).X(false, false);
        } else {
            ((ActionBarLayout) l71Var.parentLayout).X(false, false);
            File file = new File(l71Var.g0.b);
            org.telegram.ui.ActionBar.j6 j6Var2 = l71Var.g0;
            org.telegram.ui.ActionBar.k6.v(file, j6Var2.a, j6Var2.G, false);
            org.telegram.messenger.hp.s1(l71Var.g0.F).x4(l71Var.g0, null, false, false);
            SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0).edit();
            edit.putString("lastDayTheme", l71Var.g0.m());
            edit.commit();
        }
        org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) l71Var.getParentLayout().getFragmentStack().get(Math.max(0, l71Var.getParentLayout().getFragmentStack().size() - 2));
        l71Var.finishFragment();
        if (l71Var.b == 0) {
            org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.p4, j6Var, k10, Boolean.valueOf(l71Var.j0));
        }
        org.telegram.ui.ActionBar.k6.M1(d2Var);
    }

    public static /* synthetic */ void b0(l71 l71Var, TLObject tLObject) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        HashMap hashMap = l71Var.X0;
        org.telegram.ui.ActionBar.g6 g6Var = l71Var.w;
        if (tLObject instanceof TL_account.TL_wallPapers) {
            TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
            l71Var.W0.clear();
            hashMap.clear();
            int size = tL_wallPapers.wallpapers.size();
            boolean z10 = false;
            for (int i3 = 0; i3 < size; i3++) {
                if (tL_wallPapers.wallpapers.get(i3) instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) tL_wallPapers.wallpapers.get(i3);
                    if (tL_wallPaper2.pattern) {
                        TLRPC.Document document = tL_wallPaper2.document;
                        if (document != null && !hashMap.containsKey(Long.valueOf(document.id))) {
                            l71Var.W0.add(tL_wallPaper2);
                            hashMap.put(Long.valueOf(tL_wallPaper2.document.id), tL_wallPaper2);
                        }
                        if (g6Var != null && (str = g6Var.o) != null && str.equals(tL_wallPaper2.slug)) {
                            l71Var.Y0 = tL_wallPaper2;
                            l71Var.g1(false);
                            l71Var.o1();
                        } else if (g6Var == null) {
                            TLRPC.TL_wallPaper tL_wallPaper3 = l71Var.Y0;
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
            if (!z10 && (tL_wallPaper = l71Var.Y0) != null) {
                l71Var.W0.add(0, tL_wallPaper);
            }
            j71 j71Var = l71Var.S0;
            if (j71Var != null) {
                j71Var.f();
            }
            org.telegram.messenger.qr.a0(l71Var.currentAccount).p1(1, tL_wallPapers.wallpapers);
        }
        if (l71Var.Y0 != null || g6Var == null || TextUtils.isEmpty(g6Var.o)) {
            return;
        }
        TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
        TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
        tL_inputWallPaperSlug.slug = g6Var.o;
        getwallpaper.wallpaper = tL_inputWallPaperSlug;
        ConnectionsManager.getInstance(l71Var.currentAccount).bindRequestToGuid(l71Var.getConnectionsManager().sendRequest(getwallpaper, new e61(l71Var, 0)), l71Var.classGuid);
    }

    @Override // org.telegram.messenger.x5
    public final void C(boolean z10) {
        o1();
    }

    @Override // org.telegram.messenger.x5
    public final void M(String str) {
        o1();
    }

    public final void Q0() {
        AnimatorSet animatorSet = this.D0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.D0 = animatorSet2;
        int i3 = 1;
        if (this.G1) {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.z0, (Property<b71, Float>) View.SCALE_X, this.A1), ObjectAnimator.ofFloat(this.z0, (Property<b71, Float>) View.SCALE_Y, this.A1));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.z0, (Property<b71, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.z0, (Property<b71, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.z0, (Property<b71, Float>) View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.z0, (Property<b71, Float>) View.TRANSLATION_Y, 0.0f));
        }
        this.D0.setInterpolator(org.telegram.ui.Components.xq.g);
        this.D0.addListener(new q61(this, i3));
        this.D0.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x025f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R0(boolean z10) {
        int i3;
        boolean z11;
        File A;
        boolean z12;
        boolean z13;
        File file;
        Bitmap n4;
        Object obj;
        float f10;
        boolean z14;
        TLRPC.TL_wallPaper tL_wallPaper;
        File file2;
        String str;
        int i10;
        int i11;
        int i12;
        TLRPC.TL_wallPaper tL_wallPaper2;
        File A2;
        String str2;
        int i13;
        int i14;
        int i15;
        Object obj2;
        long j10;
        boolean z15;
        TLRPC.TL_wallPaper tL_wallPaper3;
        boolean z16;
        boolean z17;
        float f11;
        TLRPC.UserFull b22;
        int i16 = 2;
        if (this.L1 < 0) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X1;
            if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < W0()) {
                getMessagesController().G0().b(this.L1, this.X1, new b61(this, i16));
                return;
            } else if (this.X1 == null) {
                return;
            }
        }
        if (!getUserConfig().q() && z10) {
            showDialog(new vg.v0((org.telegram.ui.ActionBar.d2) this, 22, true));
            return;
        }
        org.telegram.ui.ActionBar.j6 j6Var = org.telegram.ui.ActionBar.k6.I;
        String j11 = j6Var.j(null, this.H1);
        int i17 = 0;
        String j12 = this.H1 ? j6Var.j(null, false) : j11;
        File file3 = new File(org.telegram.messenger.t0.h(), j11);
        Object obj3 = this.D1;
        if (obj3 instanceof TLRPC.TL_wallPaper) {
            if (this.z1 != null) {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    this.z1.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                    fileOutputStream.close();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            } else {
                ImageReceiver imageReceiver = this.z0.getImageReceiver();
                if (imageReceiver.L() || imageReceiver.n0 != null) {
                    Bitmap n10 = imageReceiver.n();
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file3);
                        n10.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream2);
                        fileOutputStream2.close();
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                    }
                }
                z12 = false;
                if (!z12) {
                    TLRPC.TL_wallPaper tL_wallPaper4 = (TLRPC.TL_wallPaper) this.D1;
                    org.telegram.messenger.w7.G(this.currentAccount);
                    try {
                        z12 = org.telegram.messenger.g0.E(org.telegram.messenger.w7.K(tL_wallPaper4.document, null, true, true), file3);
                    } catch (Exception e12) {
                        org.telegram.messenger.a8.g(e12, true);
                        z12 = false;
                    }
                }
                z13 = false;
                i3 = 4;
            }
            z12 = true;
            if (!z12) {
            }
            z13 = false;
            i3 = 4;
        } else if (obj3 instanceof kc1) {
            if (this.Y0 != null) {
                try {
                    n4 = this.z0.getImageReceiver().n();
                    i3 = 4;
                } catch (Throwable th2) {
                    th = th2;
                    i3 = 4;
                }
                try {
                    Bitmap createBitmap = Bitmap.createBitmap(n4.getWidth(), n4.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    if (this.e1 == 0) {
                        if (this.d1 != 0) {
                            GradientDrawable gradientDrawable = new GradientDrawable(org.telegram.ui.Components.j9.d(this.j1), new int[]{this.b1, this.d1});
                            gradientDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                            gradientDrawable.draw(canvas);
                        } else {
                            canvas.drawColor(this.b1);
                        }
                    }
                    Paint paint = new Paint(2);
                    paint.setColorFilter(new PorterDuffColorFilter(this.l1, this.u1));
                    paint.setAlpha((int) (Math.abs(this.n1) * 255.0f));
                    canvas.drawBitmap(n4, 0.0f, 0.0f, paint);
                    FileOutputStream fileOutputStream3 = new FileOutputStream(file3);
                    if (this.e1 != 0) {
                        createBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream3);
                    } else {
                        createBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream3);
                    }
                    fileOutputStream3.close();
                } catch (Throwable th3) {
                    th = th3;
                    org.telegram.messenger.a8.g(th, true);
                    z12 = false;
                    z13 = false;
                    if (this.H1) {
                    }
                    obj = this.D1;
                    int i18 = 45;
                    if (obj instanceof TLRPC.TL_wallPaper) {
                    }
                    file2 = null;
                    org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6();
                    b6Var.a = j12;
                    b6Var.b = j11;
                    b6Var.c = str;
                    b6Var.i = this.H1;
                    b6Var.j = this.G1;
                    b6Var.d = i17;
                    b6Var.e = i10;
                    b6Var.f = i11;
                    b6Var.g = i12;
                    b6Var.h = i18;
                    if (this.O1) {
                    }
                    b6Var.k = this.n1;
                    obj2 = this.D1;
                    if (obj2 instanceof kc1) {
                    }
                    j10 = this.L1;
                    b6Var.n = j10;
                    if (j10 != 0) {
                    }
                    b6Var.o = z10;
                    org.telegram.messenger.hp.s1(this.currentAccount).z4(file2, b6Var, str == null && this.L1 == 0, 0L);
                    if (!z14) {
                    }
                    tL_wallPaper3 = tL_wallPaper;
                    z16 = z15;
                    if (z16) {
                    }
                }
            } else {
                i3 = 4;
            }
            z13 = false;
            z12 = true;
        } else {
            i3 = 4;
            if (obj3 instanceof lc1) {
                lc1 lc1Var = (lc1) obj3;
                if (lc1Var.b == 0 && !"t".equals(lc1Var.a)) {
                    try {
                        if (!this.c2 || this.Z1 == this.a2) {
                            File file4 = lc1Var.e;
                            file = file4 != null ? file4 : lc1Var.d;
                        } else {
                            Bitmap createBitmap2 = Bitmap.createBitmap((int) this.b2, this.E1.getHeight(), Bitmap.Config.ARGB_8888);
                            Canvas canvas2 = new Canvas(createBitmap2);
                            canvas2.translate(-((this.Z1 / this.Y1) * (this.E1.getWidth() - createBitmap2.getWidth())), 0.0f);
                            canvas2.drawBitmap(this.E1, 0.0f, 0.0f, (Paint) null);
                            lc1Var.d = new File(org.telegram.messenger.w7.z(4), Utilities.b.nextInt() + ".jpg");
                            FileOutputStream fileOutputStream4 = new FileOutputStream(lc1Var.d);
                            createBitmap2.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream4);
                            fileOutputStream4.close();
                            createBitmap2.recycle();
                            file = lc1Var.d;
                        }
                        z13 = file.equals(file3);
                        if (!z13) {
                            try {
                                z12 = org.telegram.messenger.g0.E(file, file3);
                            } catch (Exception e13) {
                                e = e13;
                                org.telegram.messenger.a8.g(e, true);
                                z12 = false;
                                if (this.H1) {
                                }
                                obj = this.D1;
                                int i182 = 45;
                                if (obj instanceof TLRPC.TL_wallPaper) {
                                }
                                file2 = null;
                                org.telegram.ui.ActionBar.b6 b6Var2 = new org.telegram.ui.ActionBar.b6();
                                b6Var2.a = j12;
                                b6Var2.b = j11;
                                b6Var2.c = str;
                                b6Var2.i = this.H1;
                                b6Var2.j = this.G1;
                                b6Var2.d = i17;
                                b6Var2.e = i10;
                                b6Var2.f = i11;
                                b6Var2.g = i12;
                                b6Var2.h = i182;
                                if (this.O1) {
                                }
                                b6Var2.k = this.n1;
                                obj2 = this.D1;
                                if (obj2 instanceof kc1) {
                                }
                                j10 = this.L1;
                                b6Var2.n = j10;
                                if (j10 != 0) {
                                }
                                b6Var2.o = z10;
                                org.telegram.messenger.hp.s1(this.currentAccount).z4(file2, b6Var2, str == null && this.L1 == 0, 0L);
                                if (!z14) {
                                }
                                tL_wallPaper3 = tL_wallPaper;
                                z16 = z15;
                                if (z16) {
                                }
                            }
                        }
                        z12 = true;
                    } catch (Exception e14) {
                        e = e14;
                        z13 = false;
                    }
                }
                z13 = false;
                z12 = true;
            } else {
                if (obj3 instanceof org.telegram.messenger.bf) {
                    org.telegram.messenger.bf bfVar = (org.telegram.messenger.bf) obj3;
                    TLRPC.Photo photo = bfVar.K;
                    if (photo != null) {
                        z11 = true;
                        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, this.J1, true, null, false);
                        org.telegram.messenger.w7.G(this.currentAccount);
                        A = org.telegram.messenger.w7.K(w10, null, true, true);
                    } else {
                        z11 = true;
                        A = org.telegram.messenger.zb.A(bfVar.C);
                    }
                    try {
                        z12 = org.telegram.messenger.g0.E(A, file3);
                    } catch (Exception e15) {
                        org.telegram.messenger.a8.g(e15, z11);
                        z12 = false;
                    }
                    z13 = false;
                }
                z12 = false;
                z13 = false;
            }
        }
        if (this.H1) {
            try {
                FileOutputStream fileOutputStream5 = new FileOutputStream(new File(org.telegram.messenger.t0.h(), j12));
                this.y1.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream5);
                fileOutputStream5.close();
                z12 = true;
            } catch (Throwable th4) {
                org.telegram.messenger.a8.g(th4, true);
                z12 = false;
            }
        }
        obj = this.D1;
        int i1822 = 45;
        if (obj instanceof TLRPC.TL_wallPaper) {
            TLRPC.TL_wallPaper tL_wallPaper5 = (TLRPC.TL_wallPaper) obj;
            z14 = z12;
            f10 = 0.0f;
            tL_wallPaper = tL_wallPaper5;
            str = tL_wallPaper5.slug;
            i10 = 0;
            i11 = 0;
            i12 = 0;
        } else if (obj instanceof kc1) {
            if ("d".equals(((kc1) obj).a)) {
                f10 = 0.0f;
                i14 = 0;
                i15 = 0;
                i13 = 0;
                str2 = "d";
            } else {
                TLRPC.TL_wallPaper tL_wallPaper6 = this.Y0;
                str2 = tL_wallPaper6 != null ? tL_wallPaper6.slug : "c";
                i13 = this.b1;
                int i19 = this.d1;
                i14 = this.e1;
                f10 = 0.0f;
                i15 = this.f1;
                i1822 = this.j1;
                i17 = i19;
            }
            String str3 = str2;
            i11 = i14;
            str = str3;
            int i20 = i13;
            i12 = i15;
            i10 = i17;
            i17 = i20;
            z14 = z12;
            tL_wallPaper = null;
        } else {
            f10 = 0.0f;
            if (obj instanceof lc1) {
                lc1 lc1Var2 = (lc1) obj;
                str = lc1Var2.a;
                z14 = z12;
                file2 = lc1Var2.d;
                i10 = 0;
                i11 = 0;
                i12 = 0;
                i17 = 0;
                tL_wallPaper = null;
            } else {
                if (obj instanceof org.telegram.messenger.bf) {
                    org.telegram.messenger.bf bfVar2 = (org.telegram.messenger.bf) obj;
                    TLRPC.Photo photo2 = bfVar2.K;
                    if (photo2 != null) {
                        tL_wallPaper2 = null;
                        TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(photo2.sizes, this.J1, true, null, false);
                        org.telegram.messenger.w7.G(this.currentAccount);
                        A2 = org.telegram.messenger.w7.K(w11, null, true, true);
                    } else {
                        tL_wallPaper2 = null;
                        A2 = org.telegram.messenger.zb.A(bfVar2.C);
                    }
                    z14 = z12;
                    file2 = A2;
                    str = "";
                    tL_wallPaper = tL_wallPaper2;
                } else {
                    z14 = z12;
                    tL_wallPaper = null;
                    file2 = null;
                    str = "d";
                }
                i10 = 0;
                i11 = 0;
                i12 = 0;
                i17 = 0;
            }
            org.telegram.ui.ActionBar.b6 b6Var22 = new org.telegram.ui.ActionBar.b6();
            b6Var22.a = j12;
            b6Var22.b = j11;
            b6Var22.c = str;
            b6Var22.i = this.H1;
            b6Var22.j = this.G1;
            b6Var22.d = i17;
            b6Var22.e = i10;
            b6Var22.f = i11;
            b6Var22.g = i12;
            b6Var22.h = i1822;
            if (this.O1) {
                float f12 = this.p1;
                if (f12 >= f10) {
                    b6Var22.k = f12;
                    obj2 = this.D1;
                    if (obj2 instanceof kc1) {
                        kc1 kc1Var = (kc1) obj2;
                        String str4 = ("c".equals(str) || "t".equals(str) || "d".equals(str)) ? null : str;
                        float f13 = kc1Var.h;
                        if (f13 < f10 && !org.telegram.ui.ActionBar.k6.I.q()) {
                            f13 *= -1.0f;
                        }
                        if (kc1Var.l != null && kc1Var.b == i17 && kc1Var.c == i10 && kc1Var.d == i11 && kc1Var.e == i12 && TextUtils.equals(kc1Var.a, str4) && kc1Var.f == i1822 && (this.Y0 == null || Math.abs(f13 - this.n1) < 0.001f)) {
                            TLRPC.WallPaper wallPaper = kc1Var.l;
                            b6Var22.l = wallPaper.id;
                            b6Var22.m = wallPaper.access_hash;
                        }
                    }
                    j10 = this.L1;
                    b6Var22.n = j10;
                    if (j10 != 0 && (b22 = getMessagesController().b2(this.L1)) != null) {
                        b6Var22.t = b22.wallpaper;
                    }
                    b6Var22.o = z10;
                    org.telegram.messenger.hp.s1(this.currentAccount).z4(file2, b6Var22, str == null && this.L1 == 0, 0L);
                    if (!z14) {
                        z15 = true;
                    } else {
                        if (this.L1 != 0) {
                            if (file2 == null || getMessagesController().S2 != b6Var22) {
                                z17 = false;
                                org.telegram.messenger.d4.f(this.currentAccount).u(this.L1, null, b6Var22, this.s0, new ai.y1(26));
                                tL_wallPaper3 = tL_wallPaper;
                            } else {
                                tL_wallPaper3 = new TLRPC.TL_wallPaper();
                                TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
                                tL_wallPaper3.settings = tL_wallPaperSettings;
                                tL_wallPaperSettings.intensity = (int) (b6Var22.k * 100.0f);
                                tL_wallPaperSettings.blur = b6Var22.i;
                                tL_wallPaperSettings.motion = b6Var22.j;
                                tL_wallPaper3.uploadingImage = file2.getAbsolutePath();
                                Bitmap createBitmap3 = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                                Canvas canvas3 = new Canvas(createBitmap3);
                                float max = Math.max(50.0f / this.z0.getMeasuredWidth(), 50.0f / this.z0.getMeasuredHeight());
                                canvas3.scale(max, max);
                                if (this.z0.getMeasuredHeight() > this.z0.getMeasuredWidth()) {
                                    f11 = f10;
                                    canvas3.translate(f11, (-(this.z0.getMeasuredHeight() - this.z0.getMeasuredWidth())) / 2.0f);
                                } else {
                                    f11 = f10;
                                    canvas3.translate((-(this.z0.getMeasuredWidth() - this.z0.getMeasuredHeight())) / 2.0f, f11);
                                }
                                float f14 = this.p1;
                                this.p1 = f11;
                                this.z0.draw(canvas3);
                                this.p1 = f14;
                                Utilities.blurBitmap(createBitmap3, 3);
                                tL_wallPaper3.stripedThumb = createBitmap3;
                                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                                org.telegram.messenger.yy.C(this.currentAccount);
                                tL_messageService.random_id = org.telegram.messenger.yy.E();
                                tL_messageService.dialog_id = this.L1;
                                tL_messageService.unread = true;
                                tL_messageService.out = true;
                                int j13 = getUserConfig().j();
                                tL_messageService.id = j13;
                                tL_messageService.local_id = j13;
                                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-this.L1));
                                if (org.telegram.messenger.t3.T(M0)) {
                                    TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                    tL_messageService.from_id = tL_peerChannel;
                                    tL_peerChannel.channel_id = M0.id;
                                    TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                                    tL_messageService.peer_id = tL_peerChannel2;
                                    tL_peerChannel2.channel_id = M0.id;
                                } else {
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_messageService.from_id = tL_peerUser;
                                    tL_peerUser.user_id = getUserConfig().e();
                                    TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                                    tL_messageService.peer_id = tL_peerUser2;
                                    tL_peerUser2.user_id = this.L1;
                                }
                                tL_messageService.flags |= 256;
                                tL_messageService.date = getConnectionsManager().getCurrentTime();
                                TLRPC.TL_messageActionSetChatWallPaper tL_messageActionSetChatWallPaper = new TLRPC.TL_messageActionSetChatWallPaper();
                                tL_messageService.action = tL_messageActionSetChatWallPaper;
                                tL_messageActionSetChatWallPaper.wallpaper = tL_wallPaper3;
                                tL_messageActionSetChatWallPaper.for_both = z10;
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(new org.telegram.messenger.zi(this.currentAccount, tL_messageService, false, false));
                                new ArrayList().add(tL_messageService);
                                org.telegram.messenger.hp.s1(this.currentAccount).l5(0, this.L1, arrayList);
                                if (this.L1 >= 0) {
                                    TLRPC.UserFull b23 = getMessagesController().b2(this.L1);
                                    if (b23 != null) {
                                        b23.wallpaper = tL_wallPaper3;
                                        org.telegram.messenger.hs.f(this.currentAccount).k(org.telegram.messenger.hs.E0, Long.valueOf(this.L1), b23);
                                    }
                                } else {
                                    TLRPC.ChatFull N0 = getMessagesController().N0(-this.L1);
                                    if (N0 != null) {
                                        N0.wallpaper = tL_wallPaper3;
                                        org.telegram.messenger.hs f15 = org.telegram.messenger.hs.f(this.currentAccount);
                                        z17 = false;
                                        Object[] objArr = new Object[i3];
                                        objArr[0] = N0;
                                        objArr[1] = 0;
                                        Boolean bool = Boolean.FALSE;
                                        objArr[2] = bool;
                                        objArr[3] = bool;
                                        f15.k(org.telegram.messenger.hs.T, objArr);
                                    }
                                }
                                z17 = false;
                            }
                            this.f2 = true;
                            k71 k71Var = this.K1;
                            if (k71Var != null) {
                                k71Var.a(tL_wallPaper3);
                            }
                            finishFragment();
                            z16 = z17;
                            if (z16) {
                                return;
                            }
                            k71 k71Var2 = this.K1;
                            if (k71Var2 != null) {
                                k71Var2.a(tL_wallPaper3);
                            }
                            finishFragment();
                            return;
                        }
                        org.telegram.ui.ActionBar.k6.c0 = getThemedColor(org.telegram.ui.ActionBar.k6.Zc);
                        org.telegram.ui.ActionBar.k6.I.v("t".equals(b6Var22.c) ? null : b6Var22);
                        z15 = true;
                        org.telegram.ui.ActionBar.k6.u1(true);
                        if (!z13) {
                            org.telegram.messenger.zb.D().Q(Utilities.a(file3.getAbsolutePath()) + "@100_100");
                        }
                    }
                    tL_wallPaper3 = tL_wallPaper;
                    z16 = z15;
                    if (z16) {
                    }
                }
            }
            b6Var22.k = this.n1;
            obj2 = this.D1;
            if (obj2 instanceof kc1) {
            }
            j10 = this.L1;
            b6Var22.n = j10;
            if (j10 != 0) {
                b6Var22.t = b22.wallpaper;
            }
            b6Var22.o = z10;
            org.telegram.messenger.hp.s1(this.currentAccount).z4(file2, b6Var22, str == null && this.L1 == 0, 0L);
            if (!z14) {
            }
            tL_wallPaper3 = tL_wallPaper;
            z16 = z15;
            if (z16) {
            }
        }
        file2 = null;
        org.telegram.ui.ActionBar.b6 b6Var222 = new org.telegram.ui.ActionBar.b6();
        b6Var222.a = j12;
        b6Var222.b = j11;
        b6Var222.c = str;
        b6Var222.i = this.H1;
        b6Var222.j = this.G1;
        b6Var222.d = i17;
        b6Var222.e = i10;
        b6Var222.f = i11;
        b6Var222.g = i12;
        b6Var222.h = i1822;
        if (this.O1) {
        }
        b6Var222.k = this.n1;
        obj2 = this.D1;
        if (obj2 instanceof kc1) {
        }
        j10 = this.L1;
        b6Var222.n = j10;
        if (j10 != 0) {
        }
        b6Var222.o = z10;
        org.telegram.messenger.hp.s1(this.currentAccount).z4(file2, b6Var222, str == null && this.L1 == 0, 0L);
        if (!z14) {
        }
        tL_wallPaper3 = tL_wallPaper;
        z16 = z15;
        if (z16) {
        }
    }

    public final void S0(boolean z10) {
        int i3 = this.b;
        if (i3 == 2) {
            if (z10) {
                return;
            }
            finishFragment();
            return;
        }
        org.telegram.ui.ActionBar.k6.p();
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.z4);
        org.telegram.ui.ActionBar.g6 g6Var = this.w;
        if (i3 == 1) {
            if (this.i0) {
                g6Var.c = this.y;
                g6Var.d = this.E;
                g6Var.e = this.F;
                g6Var.f = this.G;
                g6Var.g = this.H;
                g6Var.h = this.I;
                g6Var.i = this.J;
                g6Var.j = this.K;
                g6Var.k = this.L;
                g6Var.l = this.M;
                g6Var.m = this.N;
                g6Var.n = this.Q;
                g6Var.o = this.P;
                g6Var.p = this.O;
            }
            org.telegram.ui.ActionBar.k6.z1(this.g0, false, true, false, false, false);
        } else {
            if (g6Var != null) {
                org.telegram.ui.ActionBar.k6.z1(this.g0, false, this.j0, false, false, false);
            }
            ((ActionBarLayout) this.parentLayout).X(false, false);
            if (this.j0) {
                org.telegram.ui.ActionBar.j6 j6Var = this.g0;
                if (j6Var.b != null && org.telegram.ui.ActionBar.k6.H.get(j6Var.m()) == null) {
                    new File(j6Var.b).delete();
                }
            }
        }
        if (z10) {
            return;
        }
        finishFragment();
    }

    public final BitmapDrawable T0(Drawable drawable) {
        WeakReference weakReference = this.h2;
        if (weakReference != null && weakReference.get() == drawable) {
            return this.i2;
        }
        WeakReference weakReference2 = this.h2;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.h2 = null;
        if (drawable == null || drawable.getIntrinsicWidth() == 0 || drawable.getIntrinsicHeight() == 0) {
            this.i2 = null;
            return null;
        }
        this.h2 = new WeakReference(drawable);
        int intrinsicWidth = (int) ((drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) * 24.0f);
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, 24, Bitmap.Config.ARGB_8888);
        drawable.setBounds(0, 0, intrinsicWidth, 24);
        ColorFilter colorFilter = drawable.getColorFilter();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(1.3f);
        org.telegram.messenger.g0.n2(colorMatrix, 0.94f);
        drawable.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        drawable.draw(new Canvas(createBitmap));
        drawable.setColorFilter(colorFilter);
        Utilities.blurBitmap(createBitmap, 3);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getParentActivity().getResources(), createBitmap);
        this.i2 = bitmapDrawable;
        bitmapDrawable.setFilterBitmap(true);
        return this.i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
    
        if (r0.q == r6.G1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008a, code lost:
    
        if (r0.p == r6.n1) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean U0(boolean z10) {
        if (this.b == 1) {
            org.telegram.ui.ActionBar.g6 g6Var = this.w;
            if (g6Var.c == this.y && g6Var.d == this.E && g6Var.e == this.F && g6Var.f == this.G && g6Var.g == this.H && g6Var.h == this.I && g6Var.i == this.J && g6Var.j == this.K && g6Var.k == this.L && g6Var.l == this.M && g6Var.m == this.N && Math.abs(g6Var.p - this.O) <= 0.001f && g6Var.n == this.Q) {
                String str = g6Var.o;
                TLRPC.TL_wallPaper tL_wallPaper = this.Y0;
                if (str.equals(tL_wallPaper != null ? tL_wallPaper.slug : "")) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = this.Y0;
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
            String M0 = org.telegram.messenger.bd.M0(2131745954, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
            s1Var.S = M0;
            s1Var.U = org.telegram.messenger.bd.M0(2131745955, null);
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131745956, null), new a61(this, 3));
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131747588, null), new a61(this, 4));
            showDialog(s1Var);
            return false;
        }
        return true;
    }

    public final void V0() {
        int themedColor;
        gi.u2 u2Var = this.e;
        int i3 = 0;
        if (u2Var != null) {
            u2Var.H(getThemedColor(org.telegram.ui.ActionBar.k6.G8));
            this.e.O(getThemedColor(org.telegram.ui.ActionBar.k6.E8), false);
        }
        if (this.r != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.d6)) != this.s) {
            this.s = themedColor;
            this.r.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        }
        v4 v4Var = this.E0;
        if (v4Var != null) {
            v4Var.invalidate();
        }
        if (this.r1 != null) {
            org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
            if (q4Var == null || q4Var.getBottomSheet() == null) {
                setNavigationBarColor(getThemedColor(org.telegram.ui.ActionBar.k6.h5));
            } else {
                this.parentLayout.getBottomSheet().O(getThemedColor(org.telegram.ui.ActionBar.k6.h5));
                if (this.b == 2 && this.L1 != 0) {
                    this.parentLayout.getBottomSheet().E0(-16777216);
                }
            }
        }
        if (this.L0 != null) {
            int i10 = 0;
            while (true) {
                org.telegram.ui.Components.o61[] o61VarArr = this.L0;
                if (i10 >= o61VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.o61 o61Var = o61VarArr[i10];
                if (o61Var != null) {
                    o61Var.invalidate();
                }
                i10++;
            }
        }
        if (this.M0 != null) {
            while (true) {
                org.telegram.ui.Components.o61[] o61VarArr2 = this.M0;
                if (i3 >= o61VarArr2.length) {
                    break;
                }
                org.telegram.ui.Components.o61 o61Var2 = o61VarArr2[i3];
                if (o61Var2 != null) {
                    o61Var2.invalidate();
                }
                i3++;
            }
        }
        TextView textView = this.g2;
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, this.a);
        }
        org.telegram.ui.Components.vp vpVar = this.X;
        if (vpVar != null) {
            vpVar.invalidate();
        }
        org.telegram.ui.Components.l00 l00Var = this.r0;
        if (l00Var != null) {
            l00Var.updateColors();
        }
    }

    public final int W0() {
        return org.telegram.messenger.t3.U(this.currentAccount, -this.L1) ? getMessagesController().u5 : getMessagesController().z5;
    }

    public final ArrayList X0() {
        h6 h6Var = new h6(23, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.l0, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.u0, TLObject.FLAG_31, (Class[]) null, (Paint) null, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.u0, TLObject.FLAG_30, (Class[]) null, (Paint) null, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.E8));
        org.telegram.ui.Components.vp vpVar = this.X;
        int i3 = 2;
        if (vpVar != null) {
            org.telegram.ui.ActionBar.q0 q0Var = vpVar.J;
            EditTextBoldCursor[] editTextBoldCursorArr = vpVar.F;
            for (int i10 = 0; i10 < editTextBoldCursorArr.length; i10++) {
                arrayList.add(new org.telegram.ui.ActionBar.t6(editTextBoldCursorArr[i10], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(editTextBoldCursorArr[i10], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.k6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(editTextBoldCursorArr[i10], 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.l6));
            }
            arrayList.add(new org.telegram.ui.ActionBar.t6(vpVar.G, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.I5));
            if (q0Var != null) {
                org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(vpVar, i3);
                arrayList.add(new org.telegram.ui.ActionBar.t6(q0Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, org.telegram.ui.ActionBar.k6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(q0Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, org.telegram.ui.ActionBar.k6.E8));
                arrayList.add(new org.telegram.ui.ActionBar.t6(q0Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, org.telegram.ui.ActionBar.k6.F8));
                arrayList.add(new org.telegram.ui.ActionBar.t6(q0Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, org.telegram.ui.ActionBar.k6.G8));
            }
        }
        FrameLayout[] frameLayoutArr = this.N0;
        if (frameLayoutArr != null) {
            for (int i11 = 0; i11 < frameLayoutArr.length; i11++) {
            }
            for (int i12 = 0; i12 < this.Q0.length; i12++) {
            }
            for (int i13 = 0; i13 < this.P0.length; i13++) {
            }
            for (int i14 = 0; i14 < this.O0.length; i14++) {
            }
            org.telegram.ui.ActionBar.p5 p5Var = this.T;
            org.telegram.ui.ActionBar.p5 p5Var2 = this.V;
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.w0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, new Drawable[]{p5Var, p5Var2}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.rb));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.w0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, new Drawable[]{p5Var, p5Var2}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.sb));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.w0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, new Drawable[]{p5Var, p5Var2}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.tb));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.w0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Kd));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.w0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Qb));
        }
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            ((org.telegram.ui.ActionBar.t6) arrayList.get(i15)).n = this.a;
        }
        return arrayList;
    }

    public final boolean Y0(int i3) {
        int E0;
        long j10;
        if (this.i0) {
            return false;
        }
        org.telegram.ui.ActionBar.g6 g6Var = this.w;
        if (i3 == 1 || i3 == 2) {
            long j11 = this.K;
            if (j11 == 0) {
                int E02 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.Be);
                int i10 = (int) g6Var.j;
                if (i10 == 0) {
                    i10 = E02;
                }
                if (i10 != E02) {
                    return true;
                }
            } else if (j11 != g6Var.j) {
                return true;
            }
            long j12 = this.L;
            long j13 = this.N;
            long j14 = this.M;
            if (j12 == 0 && j14 == 0 && j13 == 0) {
                for (int i11 = 0; i11 < 3; i11++) {
                    if (i11 == 0) {
                        E0 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.Ce);
                        j10 = g6Var.k;
                    } else if (i11 == 1) {
                        E0 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.De);
                        j10 = g6Var.l;
                    } else {
                        E0 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.Ee);
                        j10 = g6Var.m;
                    }
                    int i12 = (int) j10;
                    if (i12 == 0 && j10 != 0) {
                        i12 = 0;
                    } else if (i12 == 0) {
                        i12 = E0;
                    }
                    if (i12 != E0) {
                        return true;
                    }
                }
            } else if (j12 != g6Var.k || j14 != g6Var.l || j13 != g6Var.m) {
                return true;
            }
            if (g6Var.n != this.Q) {
                return true;
            }
        }
        if (i3 == 1 || i3 == 3) {
            if (this.y != g6Var.d) {
                return true;
            }
            int i13 = this.F;
            if (i13 == 0) {
                int i14 = g6Var.e;
                if (i14 != 0 && i14 != g6Var.c) {
                    return true;
                }
            } else if (i13 != g6Var.e) {
                return true;
            }
            int i15 = this.G;
            if (i15 != 0) {
                if (i15 != g6Var.f) {
                    return true;
                }
            } else if (g6Var.f != 0) {
                return true;
            }
            int i16 = this.H;
            if (i16 != 0) {
                if (i16 != g6Var.g) {
                    return true;
                }
            } else if (g6Var.g != 0) {
                return true;
            }
            int i17 = this.I;
            if (i17 != 0) {
                if (i17 != g6Var.h) {
                    return true;
                }
            } else if (g6Var.h != 0) {
                return true;
            }
            if (this.J != g6Var.i) {
                return true;
            }
        }
        return false;
    }

    public boolean Z0() {
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        return (q4Var == null || q4Var.getBottomSheet() == null) ? false : true;
    }

    public final void a1() {
        ci.t4 t4Var = this.S1;
        if (t4Var != null) {
            t4Var.invalidate();
        }
        FrameLayout frameLayout = this.A0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                this.A0.getChildAt(i3).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.B0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i10 = 0; i10 < childCount2; i10++) {
                this.B0.getChildAt(i10).invalidate();
            }
        }
        if (this.L0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.o61[] o61VarArr = this.L0;
                if (i11 >= o61VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.o61 o61Var = o61VarArr[i11];
                if (o61Var != null) {
                    o61Var.setDimAmount(this.O1 ? this.p1 * this.q1 : 0.0f);
                    this.L0[i11].invalidate();
                }
                i11++;
            }
        }
        if (this.p0 != null) {
            for (int i12 = 0; i12 < this.p0.getChildCount(); i12++) {
                View childAt = this.p0.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.t0) {
                    i1((org.telegram.ui.Cells.t0) childAt);
                    childAt.invalidate();
                }
            }
        }
        if (this.w0 != null) {
            for (int i13 = 0; i13 < this.w0.getChildCount(); i13++) {
                View childAt2 = this.w0.getChildAt(i13);
                if (childAt2 instanceof org.telegram.ui.Cells.t0) {
                    i1((org.telegram.ui.Cells.t0) childAt2);
                    childAt2.invalidate();
                }
            }
        }
        c71 c71Var = this.B1;
        if (c71Var != null) {
            c71Var.invalidate();
        }
        c71 c71Var2 = this.C1;
        if (c71Var2 != null) {
            c71Var2.invalidate();
        }
        v4 v4Var = this.E0;
        if (v4Var != null) {
            v4Var.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.bc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ce));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.gc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.be));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Od));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Md));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.yb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.xb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Tc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Sc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.qb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.pb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Jj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Hj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ge));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.He));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B8));
    }

    public final void b1() {
        org.telegram.ui.ActionBar.g6 g6Var = this.w;
        if (g6Var == null || TextUtils.isEmpty(g6Var.o)) {
            return;
        }
        try {
            File e10 = g6Var.e();
            Drawable background = this.z0.getBackground();
            Bitmap n4 = this.z0.getImageReceiver().n();
            if (background instanceof org.telegram.ui.Components.la0) {
                FileOutputStream fileOutputStream = new FileOutputStream(e10);
                n4.compress(Bitmap.CompressFormat.PNG, 87, fileOutputStream);
                fileOutputStream.close();
                return;
            }
            Bitmap createBitmap = Bitmap.createBitmap(n4.getWidth(), n4.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            background.setBounds(0, 0, n4.getWidth(), n4.getHeight());
            background.draw(canvas);
            Paint paint = new Paint(2);
            paint.setColorFilter(new PorterDuffColorFilter(this.l1, this.u1));
            paint.setAlpha((int) (this.n1 * 255.0f));
            canvas.drawBitmap(n4, 0.0f, 0.0f, paint);
            FileOutputStream fileOutputStream2 = new FileOutputStream(e10);
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream2);
            fileOutputStream2.close();
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
    }

    public final void c1() {
        d1(2, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        if (r7.pattern == false) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0fe1  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0e48  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0770  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x085f  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x08e3  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x092c  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x093d  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x08fd  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x094b A[EDGE_INSN: B:249:0x094b->B:250:0x094b BREAK  A[LOOP:2: B:198:0x085b->B:225:0x093e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0954  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0a77  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0ddb  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0de5  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0a84  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0a74  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0855  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ad A[LOOP:0: B:45:0x01a9->B:47:0x01ad, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01d8 A[EDGE_INSN: B:48:0x01d8->B:49:0x01d8 BREAK  A[LOOP:0: B:45:0x01a9->B:47:0x01ad], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0e46  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0e81  */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v26 */
    @Override // org.telegram.ui.ActionBar.d2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        boolean z10;
        org.telegram.ui.ActionBar.q4 q4Var;
        final int i3;
        int i10;
        int i11;
        b71[] b71VarArr;
        boolean z11;
        org.telegram.ui.ActionBar.j6 j6Var;
        int i12;
        float f10;
        int i13;
        int i14;
        Object obj;
        int i15;
        int i16;
        int i17;
        int i18;
        final int i19;
        l61 l61Var;
        int i20;
        int i21;
        final int i22;
        FrameLayout.LayoutParams e10;
        float f11;
        float f12;
        ViewGroup[] viewGroupArr;
        ?? r13;
        int i23;
        org.telegram.ui.Components.ly0 ly0Var;
        final int i24;
        org.telegram.ui.ActionBar.q4 q4Var2;
        this.T.p = (l61) getResourceProvider();
        this.U.p = (l61) getResourceProvider();
        this.V.p = (l61) getResourceProvider();
        this.W.p = (l61) getResourceProvider();
        int i25 = 1;
        this.hasOwnBackground = true;
        d71 d71Var = this.r1;
        int i26 = 0;
        boolean z12 = (d71Var == null || this.L1 == 0) ? false : true;
        this.N1 = z12;
        if (z12) {
            Object obj2 = this.D1;
            if (!(obj2 instanceof lc1)) {
                if (obj2 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj2;
                    if (tL_wallPaper.document != null) {
                    }
                }
            }
            z10 = true;
            this.O1 = z10;
            if (z10) {
                this.q1 = d71Var.a() ? 1.0f : 0.0f;
            }
            q4Var = this.parentLayout;
            if (q4Var != null && ((ActionBarLayout) q4Var).A()) {
                this.actionBar.setOccupyStatusBar(false);
            }
            this.o0 = new FrameLayout(context);
            i3 = 3;
            if (this.O1 && org.telegram.messenger.az.S < 3) {
                org.telegram.messenger.g0.i3(new y51(this, i3), 2000L);
            }
            this.actionBar.q().a(0, R.drawable.outline_header_search).M().J(new x61()).setSearchFieldHint(org.telegram.messenger.bd.L0(2131745846));
            this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.r4());
            this.actionBar.setAddToContainer(false);
            this.actionBar.setTitle(org.telegram.messenger.bd.L0(2131744182));
            l0 l0Var = new l0(26, context, this);
            this.o0 = l0Var;
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, l0Var, getResourceProvider());
            this.o0.addView(this.actionBar, b8.mf.c(-2.0f, -1));
            org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context);
            this.p0 = tj0Var;
            tj0Var.setVerticalScrollBarEnabled(true);
            this.p0.setItemAnimator(null);
            this.p0.setLayoutAnimation(null);
            this.p0.setLayoutManager(new u4.b0(1, false));
            final int i27 = 2;
            this.p0.setVerticalScrollbarPosition(!org.telegram.messenger.bd.a0 ? 1 : 2);
            org.telegram.ui.Components.tj0 tj0Var2 = this.p0;
            i10 = this.b;
            tj0Var2.setPadding(0, 0, 0, org.telegram.messenger.g0.L(i10 == 0 ? 12.0f : 0.0f));
            final int i28 = 4;
            this.p0.setOnItemClickListener(new ai.a(i28));
            this.o0.addView(this.p0, b8.mf.e(-1, -1, 51));
            org.telegram.ui.Components.l00 l00Var = new org.telegram.ui.Components.l00(context, this.resourceProvider);
            this.r0 = l00Var;
            l00Var.setImageResource(R.drawable.floating_pencil);
            this.o0.addView(this.r0, org.telegram.ui.Components.l00.b());
            n4 n4Var = new n4(context);
            this.q0 = n4Var;
            this.p0.setAdapter(n4Var);
            this.v0 = new org.telegram.ui.ActionBar.k0(i27, context, this);
            this.x0 = new h71(context, this);
            this.u0 = createActionBar(context);
            if (org.telegram.messenger.g0.Q1()) {
                this.u0.setOccupyStatusBar(false);
            }
            this.u0.setBackButtonDrawable(new org.telegram.ui.ActionBar.w1(false));
            this.u0.setActionBarMenuOnItemClick(new a71(this));
            i11 = 0;
            while (true) {
                b71VarArr = this.y0;
                if (i11 < 2) {
                    break;
                }
                b71VarArr[i11] = new b71(this, (Activity) getContext());
                this.v0.addView(b71VarArr[i11], b8.mf.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
                i11++;
            }
            b71 b71Var = b71VarArr[0];
            this.z0 = b71Var;
            b71Var.setVisibility(0);
            b71VarArr[1].setVisibility(8);
            if (i10 == 2) {
                this.z0.getImageReceiver().d0(new a61(this, i26));
            }
            z11 = this.x0.e;
            j6Var = this.g0;
            if (!z11) {
                this.u0.setTitle("Telegram Beta Chat");
                this.u0.setSubtitle(org.telegram.messenger.bd.G(505, "Members", new Object[0]));
            } else if (i10 == 2) {
                if (this.L1 != 0) {
                    this.u0.setTitle(org.telegram.messenger.bd.L0(2131742962));
                } else {
                    this.u0.setTitle(org.telegram.messenger.bd.L0(2131753741));
                }
                org.telegram.ui.ActionBar.x q10 = this.u0.q();
                Object obj3 = this.D1;
                if ((obj3 instanceof lc1) && ((lc1) obj3).e != null) {
                    q10.a(7, R.drawable.msg_header_draw);
                }
                if (this.L1 == 0) {
                    boolean z13 = org.telegram.messenger.r2.a;
                    Object obj4 = this.D1;
                    if (((obj4 instanceof kc1) && !"d".equals(((kc1) obj4).a)) || (this.D1 instanceof TLRPC.TL_wallPaper)) {
                        q10.a(5, R.drawable.msg_header_share);
                    }
                }
                if (this.L1 != 0 && this.N1) {
                    org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(R.raw.sun, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
                    this.P1 = ch0Var;
                    this.Q1 = q10.d(6, ch0Var);
                    this.P1.h = true;
                    d71 d71Var2 = this.r1;
                    if (d71Var2 == null || d71Var2.a()) {
                        this.P1.M(35);
                        this.P1.P(36);
                    } else {
                        this.P1.P(0);
                        this.P1.M(0);
                    }
                    this.P1.a0 = true;
                    int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.J9);
                    this.P1.Q(v02, "Sunny");
                    this.P1.Q(v02, "Path 6");
                    this.P1.Q(v02, "Path");
                    this.P1.Q(v02, "Path 5");
                    this.P1.o();
                }
            } else if (i10 == 1) {
                org.telegram.ui.ActionBar.x q11 = this.u0.q();
                this.f = q11.e(4, org.telegram.messenger.bd.L0(2131745956));
                gi.u2 u2Var = new gi.u2(this, context, q11);
                this.e = u2Var;
                u2Var.setSubMenuOpenSide(1);
                this.e.f(2, org.telegram.messenger.bd.L0(2131752016));
                this.e.f(1, org.telegram.messenger.bd.L0(2131752015));
                this.e.f(3, org.telegram.messenger.bd.L0(2131752014));
                this.e.K();
                this.e.setForceSmoothKeyboard(true);
                this.u0.addView(this.e, b8.mf.d(-2, -1.0f, 51, org.telegram.messenger.g0.Q1() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f));
                this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.z51
                    public final /* synthetic */ l71 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i27) {
                            case 0:
                                this.b.S0(false);
                                break;
                            case 1:
                                l71.a0(this.b);
                                break;
                            case 2:
                                this.b.e.U(null, null);
                                break;
                            case 3:
                                this.b.R0(false);
                                break;
                            default:
                                this.b.R0(true);
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
                int i29 = org.telegram.ui.ActionBar.k6.A8;
                org.telegram.ui.ActionBar.r6.V(textView2, i29, getResourceProvider());
                this.h.setTypeface(org.telegram.messenger.g0.o());
                this.h.setText(org.telegram.messenger.bd.L0(2131752015));
                Drawable mutate = context.getResources().getDrawable(R.drawable.ic_arrow_drop_down).mutate();
                org.telegram.ui.ActionBar.r6.y(this.h, mutate, i29, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                this.h.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, mutate, (Drawable) null);
                this.h.setCompoundDrawablePadding(org.telegram.messenger.g0.L(4.0f));
                this.h.setPadding(0, 0, org.telegram.messenger.g0.L(10.0f), 0);
                this.e.addView(this.h, b8.mf.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 1.0f));
            } else {
                TLRPC.TL_theme tL_theme = j6Var.G;
                String n4 = tL_theme != null ? tL_theme.title : j6Var.n();
                int lastIndexOf = n4.lastIndexOf(".attheme");
                if (lastIndexOf >= 0) {
                    n4 = n4.substring(0, lastIndexOf);
                }
                this.u0.setTitle(n4);
                TLRPC.TL_theme tL_theme2 = j6Var.G;
                if (tL_theme2 == null || (i12 = tL_theme2.installs_count) <= 0) {
                    this.u0.setSubtitle(org.telegram.messenger.bd.w((System.currentTimeMillis() / 1000) - 3600, null));
                } else {
                    this.u0.setSubtitle(org.telegram.messenger.bd.G(i12, "ThemeInstallCount", new Object[0]));
                }
            }
            this.w0 = new g61(context, this);
            h61 h61Var = new h61(this);
            h61Var.S();
            this.w0.setItemAnimator(h61Var);
            this.w0.setVerticalScrollBarEnabled(true);
            this.w0.setOverScrollMode(2);
            if (i10 != 2) {
                this.w0.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, (org.telegram.messenger.g0.L(72 + ((this.M1 || this.L1 <= 0) ? 0 : 58)) - 12) + (Z0() ? org.telegram.messenger.g0.n : 0));
            } else if (i10 == 1) {
                this.w0.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(16.0f));
            } else {
                this.w0.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
            }
            this.w0.setClipToPadding(false);
            this.w0.setLayoutManager(new u4.b0(1, true));
            this.w0.setVerticalScrollbarPosition(!org.telegram.messenger.bd.a0 ? 1 : 2);
            if (i10 != 1) {
                this.v0.addView(this.w0, b8.mf.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 273.0f));
                this.w0.setOnItemClickListener(new a61(this, i25));
                f10 = 16.0f;
                i13 = -1;
            } else {
                f10 = 16.0f;
                i13 = -1;
                this.v0.addView(this.w0, b8.mf.e(-1, -1, 51));
            }
            this.w0.setOnScrollListener(new r11(this, i3));
            this.v0.addView(this.u0, b8.mf.c(-2.0f, i13));
            org.telegram.ui.Components.q61 q61Var = new org.telegram.ui.Components.q61(context);
            this.x1 = q61Var;
            q61Var.b(new a61(this, i27));
            org.telegram.ui.ActionBar.g6 g6Var = this.w;
            if (i10 != 1 || i10 == 2) {
                if (i10 != 2) {
                    v4 v4Var = new v4(this, context, Z0());
                    this.E0 = v4Var;
                    v4Var.setWillNotDraw(false);
                    i14 = 2;
                    this.E0.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + (Z0() ? org.telegram.messenger.g0.n : 0));
                    this.v0.addView(this.E0, b8.mf.e(-1, 0, 81));
                    c71 c71Var = new c71(context, this);
                    this.B1 = c71Var;
                    b8.pf.b(c71Var, 0.033f, 1.2f);
                    m1(false);
                    this.B1.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.z51
                        public final /* synthetic */ l71 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i3) {
                                case 0:
                                    this.b.S0(false);
                                    break;
                                case 1:
                                    l71.a0(this.b);
                                    break;
                                case 2:
                                    this.b.e.U(null, null);
                                    break;
                                case 3:
                                    this.b.R0(false);
                                    break;
                                default:
                                    this.b.R0(true);
                                    break;
                            }
                        }
                    });
                    if (this.L1 <= 0 || this.M1 || this.s0 != null) {
                        this.E0.addView(this.B1, b8.mf.d(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                    } else {
                        c71 c71Var2 = new c71(context, this);
                        this.C1 = c71Var2;
                        b8.pf.b(c71Var2, 0.033f, 1.2f);
                        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.L1));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
                        if (!getUserConfig().q()) {
                            spannableStringBuilder.append((CharSequence) "l ");
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.wp(R.drawable.msg_mini_lock3), 0, 1, 33);
                        }
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.Z(2131754211, org.telegram.messenger.l10.p(a22)));
                        this.C1.d(spannableStringBuilder);
                        try {
                            c71 c71Var3 = this.C1;
                            CharSequence b10 = c71Var3.b();
                            ly0Var = this.C1.a;
                            c71Var3.d(org.telegram.messenger.i6.l(b10, ly0Var.h(), false));
                        } catch (Exception unused) {
                        }
                        this.C1.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.z51
                            public final /* synthetic */ l71 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i28) {
                                    case 0:
                                        this.b.S0(false);
                                        break;
                                    case 1:
                                        l71.a0(this.b);
                                        break;
                                    case 2:
                                        this.b.e.U(null, null);
                                        break;
                                    case 3:
                                        this.b.R0(false);
                                        break;
                                    default:
                                        this.b.R0(true);
                                        break;
                                }
                            }
                        });
                        this.E0.addView(this.B1, b8.mf.d(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 58.0f));
                        this.E0.addView(this.C1, b8.mf.d(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                    }
                    if (this.O1) {
                        ci.t4 t4Var = new ci.t4(this, (Activity) getContext());
                        this.S1 = t4Var;
                        t4Var.setPadding(org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10));
                        this.v0.addView(this.S1, b8.mf.e(org.telegram.messenger.hs.z3, 76, 49));
                        i61 i61Var = new i61((Activity) getContext());
                        this.T1 = i61Var;
                        i61Var.d(this.p1);
                        this.T1.b();
                        this.T1.c(new b61(this, i26));
                        this.S1.addView(this.T1);
                        d71 d71Var3 = this.r1;
                        if (d71Var3 != null) {
                            this.T1.setVisibility(d71Var3.a() ? 0 : 8);
                            this.T1.setAlpha(this.r1.a() ? 1.0f : 0.0f);
                            this.T1.d(this.r1.a() ? this.p1 : 0.0f);
                        }
                    }
                } else {
                    i14 = 2;
                }
                Rect rect = new Rect();
                Drawable g7 = k2.p1.g(context, R.drawable.sheet_shadow_round);
                this.r = g7;
                g7.getPadding(rect);
                Drawable drawable = this.r;
                int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.d6);
                this.s = themedColor;
                drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                TextPaint textPaint = new TextPaint(1);
                textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
                textPaint.setTypeface(org.telegram.messenger.g0.o());
                obj = this.D1;
                if (i10 != 1 || (obj instanceof kc1)) {
                    if ((obj instanceof kc1) || !"d".equals(((kc1) obj).a)) {
                        i15 = 3;
                        String[] strArr = new String[i15];
                        int[] iArr = new int[i15];
                        this.L0 = new org.telegram.ui.Components.o61[i15];
                        if (i15 != 0) {
                            this.A0 = new FrameLayout(context);
                            if (i10 == 1 || (this.D1 instanceof kc1)) {
                                strArr[0] = org.telegram.messenger.bd.L0(2131753745);
                                strArr[1] = org.telegram.messenger.bd.L0(2131753742);
                                strArr[i14] = org.telegram.messenger.bd.L0(2131753743);
                            } else {
                                strArr[0] = org.telegram.messenger.bd.L0(2131753750);
                                strArr[1] = org.telegram.messenger.bd.L0(2131753743);
                            }
                            i18 = 0;
                            int i30 = 0;
                            while (i30 < i15) {
                                int i31 = i25;
                                int ceil = (int) Math.ceil(textPaint.measureText(strArr[i30]));
                                iArr[i30] = ceil;
                                i18 = Math.max(i18, ceil);
                                i30++;
                                i25 = i31;
                                i10 = i10;
                            }
                            i16 = i25;
                            i17 = i10;
                            j61 j61Var = new j61(this, context, 0);
                            this.F0 = j61Var;
                            j61Var.setWillNotDraw(false);
                            this.F0.setVisibility(this.d1 != 0 ? 0 : 4);
                            this.F0.setScaleX(this.d1 != 0 ? 1.0f : 0.1f);
                            this.F0.setScaleY(this.d1 != 0 ? 1.0f : 0.1f);
                            this.F0.setAlpha(this.d1 != 0 ? 1.0f : 0.0f);
                            this.F0.setTag(this.d1 != 0 ? Integer.valueOf(i16) : null);
                            this.A0.addView(this.F0, b8.mf.e(48, 48, 17));
                            this.F0.setOnClickListener(new k61(this, i26));
                            ImageView imageView = new ImageView(context);
                            this.H0 = imageView;
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            this.H0.setImageResource(R.drawable.bg_rotate_large);
                            this.F0.addView(this.H0, b8.mf.e(-2, -2, 17));
                        } else {
                            i16 = 1;
                            i17 = i10;
                            i18 = 0;
                        }
                        i19 = 0;
                        while (true) {
                            l61Var = this.a;
                            if (i19 >= i15) {
                                break;
                            }
                            int i32 = i17;
                            org.telegram.ui.ActionBar.j6 j6Var2 = j6Var;
                            this.L0[i19] = new org.telegram.ui.Components.o61(context, ((i32 == i16 || (this.D1 instanceof kc1)) && i19 == 0) ? false : true, this.z0, l61Var);
                            this.L0[i19].setBackgroundColor(this.b1);
                            org.telegram.ui.Components.o61 o61Var = this.L0[i19];
                            String str = strArr[i19];
                            int i33 = iArr[i19];
                            o61Var.f = str;
                            o61Var.h = i33;
                            o61Var.n = i18;
                            int i34 = 1;
                            if (i32 != 1) {
                                if (this.D1 instanceof kc1) {
                                    i34 = 1;
                                } else {
                                    o61Var.a(i19 == 0 ? this.H1 : this.G1, false);
                                    int L = org.telegram.messenger.g0.L(56.0f) + i18;
                                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(L, -2);
                                    layoutParams.gravity = 17;
                                    if (i15 != 3) {
                                        if (i19 == 0 || i19 == 2) {
                                            layoutParams.leftMargin = org.telegram.messenger.g0.L(10.0f) + (L / 2);
                                        } else {
                                            layoutParams.rightMargin = org.telegram.messenger.g0.L(10.0f) + (L / 2);
                                        }
                                    } else if (i19 == 1) {
                                        layoutParams.leftMargin = org.telegram.messenger.g0.L(10.0f) + (L / 2);
                                    } else {
                                        layoutParams.rightMargin = org.telegram.messenger.g0.L(10.0f) + (L / 2);
                                    }
                                    this.A0.addView(this.L0[i19], layoutParams);
                                    final org.telegram.ui.Components.o61 o61Var2 = this.L0[i19];
                                    final int i35 = 0;
                                    o61Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.c61
                                        public final /* synthetic */ l71 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i35) {
                                                case 0:
                                                    l71 l71Var = this.b;
                                                    int i36 = l71Var.b;
                                                    FrameLayout[] frameLayoutArr = l71Var.N0;
                                                    if (l71Var.A0.getAlpha() == 1.0f && l71Var.t1 == null) {
                                                        int i37 = i19;
                                                        org.telegram.ui.Components.o61 o61Var3 = o61Var2;
                                                        if ((i36 != 1 && !(l71Var.D1 instanceof kc1)) || i37 != 2) {
                                                            if (i37 != 1 || (i36 != 1 && !(l71Var.D1 instanceof kc1))) {
                                                                if (!(l71Var.D1 instanceof kc1)) {
                                                                    if (i36 != 1) {
                                                                        o61Var3.a(!o61Var3.s, true);
                                                                        if (i37 != 0) {
                                                                            boolean z14 = o61Var3.s;
                                                                            l71Var.G1 = z14;
                                                                            l71Var.x1.c(z14);
                                                                            l71Var.Q0();
                                                                            break;
                                                                        } else {
                                                                            boolean z15 = o61Var3.s;
                                                                            l71Var.H1 = z15;
                                                                            if (z15) {
                                                                                l71Var.z0.getImageReceiver().V0 = true;
                                                                            }
                                                                            l71Var.n1();
                                                                            break;
                                                                        }
                                                                    }
                                                                } else {
                                                                    l71Var.k1(i37, frameLayoutArr[i37].getVisibility() != 0, true);
                                                                    break;
                                                                }
                                                            } else {
                                                                if (l71Var.L0[1].s) {
                                                                    l71Var.a1 = l71Var.Y0;
                                                                    l71Var.z0.setImageDrawable(null);
                                                                    l71Var.Y0 = null;
                                                                    l71Var.G1 = false;
                                                                    l71Var.o1();
                                                                    l71Var.Q0();
                                                                    if (frameLayoutArr[1].getVisibility() == 0) {
                                                                        if (i36 == 1) {
                                                                            l71Var.k1(0, true, true);
                                                                        } else {
                                                                            l71Var.k1(i37, frameLayoutArr[i37].getVisibility() != 0, true);
                                                                        }
                                                                    }
                                                                } else {
                                                                    l71Var.e1(l71Var.a1 != null ? -1 : 0);
                                                                    if (i36 == 1) {
                                                                        l71Var.k1(1, true, true);
                                                                    } else {
                                                                        l71Var.k1(i37, frameLayoutArr[i37].getVisibility() != 0, true);
                                                                    }
                                                                }
                                                                l71Var.L0[1].a(l71Var.Y0 != null, true);
                                                                l71Var.s1();
                                                                l71Var.R0.g1();
                                                                l71Var.q1();
                                                                break;
                                                            }
                                                        } else {
                                                            o61Var3.a(!o61Var3.s, true);
                                                            boolean z16 = o61Var3.s;
                                                            l71Var.G1 = z16;
                                                            l71Var.x1.c(z16);
                                                            l71Var.Q0();
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    l71 l71Var2 = this.b;
                                                    if (l71Var2.B0.getAlpha() == 1.0f && i19 == 0) {
                                                        org.telegram.ui.Components.o61 o61Var4 = o61Var2;
                                                        o61Var4.a(!o61Var4.s, true);
                                                        l71Var2.w.i = o61Var4.s;
                                                        org.telegram.ui.ActionBar.k6.t1(true, true);
                                                        l71Var2.w0.g1();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    if (i19 != 2) {
                                        this.L0[i19].setAlpha(0.0f);
                                        this.L0[i19].setVisibility(4);
                                    }
                                    i19++;
                                    i17 = i32;
                                    j6Var = j6Var2;
                                    i14 = 2;
                                    i16 = 1;
                                }
                            }
                            if (i19 == i34) {
                                o61Var.a((this.Y0 == null && (g6Var == null || TextUtils.isEmpty(g6Var.o))) ? false : true, false);
                            } else if (i19 == i14) {
                                o61Var.a(this.G1, false);
                            }
                            int L2 = org.telegram.messenger.g0.L(56.0f) + i18;
                            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(L2, -2);
                            layoutParams2.gravity = 17;
                            if (i15 != 3) {
                            }
                            this.A0.addView(this.L0[i19], layoutParams2);
                            final org.telegram.ui.Components.o61 o61Var22 = this.L0[i19];
                            final int i352 = 0;
                            o61Var22.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.c61
                                public final /* synthetic */ l71 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i352) {
                                        case 0:
                                            l71 l71Var = this.b;
                                            int i36 = l71Var.b;
                                            FrameLayout[] frameLayoutArr = l71Var.N0;
                                            if (l71Var.A0.getAlpha() == 1.0f && l71Var.t1 == null) {
                                                int i37 = i19;
                                                org.telegram.ui.Components.o61 o61Var3 = o61Var22;
                                                if ((i36 != 1 && !(l71Var.D1 instanceof kc1)) || i37 != 2) {
                                                    if (i37 != 1 || (i36 != 1 && !(l71Var.D1 instanceof kc1))) {
                                                        if (!(l71Var.D1 instanceof kc1)) {
                                                            if (i36 != 1) {
                                                                o61Var3.a(!o61Var3.s, true);
                                                                if (i37 != 0) {
                                                                    boolean z14 = o61Var3.s;
                                                                    l71Var.G1 = z14;
                                                                    l71Var.x1.c(z14);
                                                                    l71Var.Q0();
                                                                    break;
                                                                } else {
                                                                    boolean z15 = o61Var3.s;
                                                                    l71Var.H1 = z15;
                                                                    if (z15) {
                                                                        l71Var.z0.getImageReceiver().V0 = true;
                                                                    }
                                                                    l71Var.n1();
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            l71Var.k1(i37, frameLayoutArr[i37].getVisibility() != 0, true);
                                                            break;
                                                        }
                                                    } else {
                                                        if (l71Var.L0[1].s) {
                                                            l71Var.a1 = l71Var.Y0;
                                                            l71Var.z0.setImageDrawable(null);
                                                            l71Var.Y0 = null;
                                                            l71Var.G1 = false;
                                                            l71Var.o1();
                                                            l71Var.Q0();
                                                            if (frameLayoutArr[1].getVisibility() == 0) {
                                                                if (i36 == 1) {
                                                                    l71Var.k1(0, true, true);
                                                                } else {
                                                                    l71Var.k1(i37, frameLayoutArr[i37].getVisibility() != 0, true);
                                                                }
                                                            }
                                                        } else {
                                                            l71Var.e1(l71Var.a1 != null ? -1 : 0);
                                                            if (i36 == 1) {
                                                                l71Var.k1(1, true, true);
                                                            } else {
                                                                l71Var.k1(i37, frameLayoutArr[i37].getVisibility() != 0, true);
                                                            }
                                                        }
                                                        l71Var.L0[1].a(l71Var.Y0 != null, true);
                                                        l71Var.s1();
                                                        l71Var.R0.g1();
                                                        l71Var.q1();
                                                        break;
                                                    }
                                                } else {
                                                    o61Var3.a(!o61Var3.s, true);
                                                    boolean z16 = o61Var3.s;
                                                    l71Var.G1 = z16;
                                                    l71Var.x1.c(z16);
                                                    l71Var.Q0();
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            l71 l71Var2 = this.b;
                                            if (l71Var2.B0.getAlpha() == 1.0f && i19 == 0) {
                                                org.telegram.ui.Components.o61 o61Var4 = o61Var22;
                                                o61Var4.a(!o61Var4.s, true);
                                                l71Var2.w.i = o61Var4.s;
                                                org.telegram.ui.ActionBar.k6.t1(true, true);
                                                l71Var2.w0.g1();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            if (i19 != 2) {
                            }
                            i19++;
                            i17 = i32;
                            j6Var = j6Var2;
                            i14 = 2;
                            i16 = 1;
                        }
                        org.telegram.ui.ActionBar.j6 j6Var3 = j6Var;
                        i20 = i16;
                        i10 = i17;
                        if (i10 == i20) {
                            int[] iArr2 = new int[2];
                            this.M0 = new org.telegram.ui.Components.o61[2];
                            this.B0 = new FrameLayout(context);
                            String[] strArr2 = {org.telegram.messenger.bd.L0(2131753752), org.telegram.messenger.bd.L0(2131753745)};
                            int i36 = 0;
                            int i37 = 0;
                            for (int i38 = 2; i36 < i38; i38 = 2) {
                                int ceil2 = (int) Math.ceil(textPaint.measureText(strArr2[i36]));
                                iArr2[i36] = ceil2;
                                i37 = Math.max(i37, ceil2);
                                i36++;
                            }
                            if (g6Var != null) {
                                j61 j61Var2 = new j61(this, context, 1);
                                this.G0 = j61Var2;
                                j61Var2.setWillNotDraw(false);
                                this.G0.setVisibility(g6Var.f != 0 ? 0 : 4);
                                this.G0.setScaleX(g6Var.f != 0 ? 1.0f : 0.1f);
                                this.G0.setScaleY(g6Var.f != 0 ? 1.0f : 0.1f);
                                this.G0.setAlpha(g6Var.f != 0 ? 1.0f : 0.0f);
                                this.B0.addView(this.G0, b8.mf.e(48, 48, 17));
                                this.G0.setOnClickListener(new k61(this, 1));
                                ImageView imageView2 = new ImageView(context);
                                this.I0 = imageView2;
                                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                                this.I0.setImageResource(R.drawable.bg_rotate_large);
                                this.G0.addView(this.I0, b8.mf.e(-2, -2, 17));
                                final int i39 = 0;
                                while (i39 < 2) {
                                    this.M0[i39] = new org.telegram.ui.Components.o61(context, i39 == 0, this.z0, l61Var);
                                    org.telegram.ui.Components.o61 o61Var3 = this.M0[i39];
                                    String str2 = strArr2[i39];
                                    int i40 = iArr2[i39];
                                    o61Var3.f = str2;
                                    o61Var3.h = i40;
                                    o61Var3.n = i37;
                                    if (i39 == 0) {
                                        o61Var3.a(g6Var.i, false);
                                    }
                                    int L3 = org.telegram.messenger.g0.L(56.0f) + i37;
                                    FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(L3, -2);
                                    layoutParams3.gravity = 17;
                                    if (i39 == 1) {
                                        layoutParams3.leftMargin = org.telegram.messenger.g0.L(10.0f) + (L3 / 2);
                                    } else {
                                        layoutParams3.rightMargin = org.telegram.messenger.g0.L(10.0f) + (L3 / 2);
                                    }
                                    this.B0.addView(this.M0[i39], layoutParams3);
                                    final org.telegram.ui.Components.o61 o61Var4 = this.M0[i39];
                                    final int i41 = 1;
                                    o61Var4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.c61
                                        public final /* synthetic */ l71 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i41) {
                                                case 0:
                                                    l71 l71Var = this.b;
                                                    int i362 = l71Var.b;
                                                    FrameLayout[] frameLayoutArr = l71Var.N0;
                                                    if (l71Var.A0.getAlpha() == 1.0f && l71Var.t1 == null) {
                                                        int i372 = i39;
                                                        org.telegram.ui.Components.o61 o61Var32 = o61Var4;
                                                        if ((i362 != 1 && !(l71Var.D1 instanceof kc1)) || i372 != 2) {
                                                            if (i372 != 1 || (i362 != 1 && !(l71Var.D1 instanceof kc1))) {
                                                                if (!(l71Var.D1 instanceof kc1)) {
                                                                    if (i362 != 1) {
                                                                        o61Var32.a(!o61Var32.s, true);
                                                                        if (i372 != 0) {
                                                                            boolean z14 = o61Var32.s;
                                                                            l71Var.G1 = z14;
                                                                            l71Var.x1.c(z14);
                                                                            l71Var.Q0();
                                                                            break;
                                                                        } else {
                                                                            boolean z15 = o61Var32.s;
                                                                            l71Var.H1 = z15;
                                                                            if (z15) {
                                                                                l71Var.z0.getImageReceiver().V0 = true;
                                                                            }
                                                                            l71Var.n1();
                                                                            break;
                                                                        }
                                                                    }
                                                                } else {
                                                                    l71Var.k1(i372, frameLayoutArr[i372].getVisibility() != 0, true);
                                                                    break;
                                                                }
                                                            } else {
                                                                if (l71Var.L0[1].s) {
                                                                    l71Var.a1 = l71Var.Y0;
                                                                    l71Var.z0.setImageDrawable(null);
                                                                    l71Var.Y0 = null;
                                                                    l71Var.G1 = false;
                                                                    l71Var.o1();
                                                                    l71Var.Q0();
                                                                    if (frameLayoutArr[1].getVisibility() == 0) {
                                                                        if (i362 == 1) {
                                                                            l71Var.k1(0, true, true);
                                                                        } else {
                                                                            l71Var.k1(i372, frameLayoutArr[i372].getVisibility() != 0, true);
                                                                        }
                                                                    }
                                                                } else {
                                                                    l71Var.e1(l71Var.a1 != null ? -1 : 0);
                                                                    if (i362 == 1) {
                                                                        l71Var.k1(1, true, true);
                                                                    } else {
                                                                        l71Var.k1(i372, frameLayoutArr[i372].getVisibility() != 0, true);
                                                                    }
                                                                }
                                                                l71Var.L0[1].a(l71Var.Y0 != null, true);
                                                                l71Var.s1();
                                                                l71Var.R0.g1();
                                                                l71Var.q1();
                                                                break;
                                                            }
                                                        } else {
                                                            o61Var32.a(!o61Var32.s, true);
                                                            boolean z16 = o61Var32.s;
                                                            l71Var.G1 = z16;
                                                            l71Var.x1.c(z16);
                                                            l71Var.Q0();
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    l71 l71Var2 = this.b;
                                                    if (l71Var2.B0.getAlpha() == 1.0f && i39 == 0) {
                                                        org.telegram.ui.Components.o61 o61Var42 = o61Var4;
                                                        o61Var42.a(!o61Var42.s, true);
                                                        l71Var2.w.i = o61Var42.s;
                                                        org.telegram.ui.ActionBar.k6.t1(true, true);
                                                        l71Var2.w0.g1();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    i39++;
                                }
                            }
                            i21 = 1;
                        } else {
                            i21 = i20;
                        }
                        if (i10 != i21 || (this.D1 instanceof kc1)) {
                            this.H1 = false;
                            i22 = 0;
                            while (i22 < 2) {
                                m61 m61Var = new m61(this, context, i22, rect);
                                ViewGroup[] viewGroupArr2 = this.N0;
                                viewGroupArr2[i22] = m61Var;
                                if (i22 == 1 || i10 == 2) {
                                    m61Var.setVisibility(4);
                                }
                                viewGroupArr2[i22].setWillNotDraw(false);
                                int i42 = org.telegram.messenger.hs.w4;
                                int i43 = org.telegram.messenger.hs.n5;
                                if (i10 == 2) {
                                    if (i22 == 0) {
                                        i43 = 321;
                                    }
                                    e10 = b8.mf.e(-1, i43, 83);
                                } else {
                                    if (i22 == 0) {
                                        i43 = 273;
                                    }
                                    e10 = b8.mf.e(-1, i43, 83);
                                }
                                if (i22 == 0) {
                                    if (i10 == 2) {
                                        i42 = 321;
                                    }
                                    f11 = i42;
                                } else {
                                    f11 = 316.0f;
                                }
                                e10.height = org.telegram.messenger.g0.L(f11);
                                if (Z0()) {
                                    e10.height += org.telegram.messenger.g0.n;
                                }
                                if (i22 == 0) {
                                    Drawable drawable2 = this.r;
                                    Rect rect2 = org.telegram.messenger.g0.Q;
                                    drawable2.getPadding(rect2);
                                    e10.height = org.telegram.messenger.g0.L(12.0f) + rect2.top + e10.height;
                                }
                                viewGroupArr2[i22].setPadding(0, i22 == 0 ? org.telegram.messenger.g0.L(12.0f) + rect.top : 0, 0, Z0() ? org.telegram.messenger.g0.n : 0);
                                this.v0.addView(viewGroupArr2[i22], e10);
                                if (i22 == 1 || i10 == 2) {
                                    n61 n61Var = new n61(this, context, 0);
                                    ViewGroup[] viewGroupArr3 = this.Q0;
                                    viewGroupArr3[i22] = n61Var;
                                    n61Var.setWillNotDraw(false);
                                    viewGroupArr3[i22].setPadding(0, org.telegram.messenger.g0.L(3.0f), 0, 0);
                                    viewGroupArr3[i22].setClickable(true);
                                    f12 = 21.0f;
                                    viewGroupArr2[i22].addView(viewGroupArr3[i22], b8.mf.e(-1, 51, 80));
                                    TextView textView3 = new TextView(context);
                                    TextView[] textViewArr = this.O0;
                                    textViewArr[i22] = textView3;
                                    textView3.setTextSize(1, 15.0f);
                                    textViewArr[i22].setTypeface(org.telegram.messenger.g0.o());
                                    TextView textView4 = textViewArr[i22];
                                    int i44 = org.telegram.ui.ActionBar.k6.pf;
                                    org.telegram.ui.ActionBar.r6.V(textView4, i44, getResourceProvider());
                                    textViewArr[i22].setText(org.telegram.messenger.bd.L0(2131752589));
                                    textViewArr[i22].setGravity(17);
                                    textViewArr[i22].setPadding(org.telegram.messenger.g0.L(21.0f), 0, org.telegram.messenger.g0.L(21.0f), 0);
                                    TextView textView5 = textViewArr[i22];
                                    int i45 = org.telegram.ui.ActionBar.k6.i6;
                                    org.telegram.ui.ActionBar.r6.R(textView5, org.telegram.ui.ActionBar.k6.g0(getThemedColor(i45), 0), null, org.telegram.ui.ActionBar.r6.N(i45), getResourceProvider());
                                    viewGroupArr = viewGroupArr2;
                                    viewGroupArr3[i22].addView(textViewArr[i22], b8.mf.e(-2, -1, 51));
                                    final int i46 = 0;
                                    textViewArr[i22].setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.f61
                                        public final /* synthetic */ l71 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i46) {
                                                case 0:
                                                    l71 l71Var = this.b;
                                                    if (l71Var.t1 == null) {
                                                        int i47 = i22;
                                                        if (i47 == 0) {
                                                            l71Var.j1 = l71Var.k1;
                                                            l71Var.f1(l71Var.i1, 3, true);
                                                            l71Var.f1(l71Var.h1, 2, true);
                                                            l71Var.f1(l71Var.g1, 1, true);
                                                            l71Var.f1(l71Var.c1, 0, true);
                                                        } else {
                                                            TLRPC.TL_wallPaper tL_wallPaper2 = l71Var.Z0;
                                                            l71Var.Y0 = tL_wallPaper2;
                                                            if (tL_wallPaper2 == null) {
                                                                l71Var.z0.setImageDrawable(null);
                                                            } else {
                                                                b71 b71Var2 = l71Var.z0;
                                                                org.telegram.messenger.ac b11 = org.telegram.messenger.ac.b(tL_wallPaper2.document);
                                                                String str3 = l71Var.I1;
                                                                TLRPC.TL_wallPaper tL_wallPaper3 = l71Var.Y0;
                                                                b71Var2.g(1, tL_wallPaper3.document.size, tL_wallPaper3, str3, null, "jpg", b11, null);
                                                            }
                                                            l71Var.L0[1].a(l71Var.Y0 != null, false);
                                                            float f13 = l71Var.o1;
                                                            l71Var.n1 = f13;
                                                            l71Var.V0.setProgress(f13);
                                                            l71Var.z0.getImageReceiver().setAlpha(l71Var.n1);
                                                            l71Var.o1();
                                                            l71Var.s1();
                                                        }
                                                        if (l71Var.b != 2) {
                                                            if (l71Var.Y0 == null) {
                                                                if (l71Var.G1) {
                                                                    l71Var.G1 = false;
                                                                    l71Var.L0[0].a(false, true);
                                                                    l71Var.Q0();
                                                                }
                                                                l71Var.q1();
                                                            }
                                                            l71Var.k1(0, true, true);
                                                            break;
                                                        } else {
                                                            l71Var.k1(i47, false, true);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    l71 l71Var2 = this.b;
                                                    if (l71Var2.t1 == null) {
                                                        if (l71Var2.b != 2) {
                                                            l71Var2.k1(0, true, true);
                                                            break;
                                                        } else {
                                                            l71Var2.k1(i22, false, true);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    TextView textView6 = new TextView(context);
                                    TextView[] textViewArr2 = this.P0;
                                    textViewArr2[i22] = textView6;
                                    textView6.setTextSize(1, 15.0f);
                                    textViewArr2[i22].setTypeface(org.telegram.messenger.g0.o());
                                    org.telegram.ui.ActionBar.r6.V(textViewArr2[i22], i44, getResourceProvider());
                                    textViewArr2[i22].setText(org.telegram.messenger.bd.L0(2131754216));
                                    textViewArr2[i22].setGravity(17);
                                    textViewArr2[i22].setPadding(org.telegram.messenger.g0.L(21.0f), 0, org.telegram.messenger.g0.L(21.0f), 0);
                                    org.telegram.ui.ActionBar.r6.R(textViewArr2[i22], org.telegram.ui.ActionBar.k6.g0(getThemedColor(i45), 0), null, org.telegram.ui.ActionBar.r6.N(i45), getResourceProvider());
                                    viewGroupArr3[i22].addView(textViewArr2[i22], b8.mf.e(-2, -1, 53));
                                    TextView textView7 = textViewArr2[i22];
                                    r13 = 1;
                                    final char c2 = 1 == true ? 1 : 0;
                                    textView7.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.f61
                                        public final /* synthetic */ l71 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (c2) {
                                                case 0:
                                                    l71 l71Var = this.b;
                                                    if (l71Var.t1 == null) {
                                                        int i47 = i22;
                                                        if (i47 == 0) {
                                                            l71Var.j1 = l71Var.k1;
                                                            l71Var.f1(l71Var.i1, 3, true);
                                                            l71Var.f1(l71Var.h1, 2, true);
                                                            l71Var.f1(l71Var.g1, 1, true);
                                                            l71Var.f1(l71Var.c1, 0, true);
                                                        } else {
                                                            TLRPC.TL_wallPaper tL_wallPaper2 = l71Var.Z0;
                                                            l71Var.Y0 = tL_wallPaper2;
                                                            if (tL_wallPaper2 == null) {
                                                                l71Var.z0.setImageDrawable(null);
                                                            } else {
                                                                b71 b71Var2 = l71Var.z0;
                                                                org.telegram.messenger.ac b11 = org.telegram.messenger.ac.b(tL_wallPaper2.document);
                                                                String str3 = l71Var.I1;
                                                                TLRPC.TL_wallPaper tL_wallPaper3 = l71Var.Y0;
                                                                b71Var2.g(1, tL_wallPaper3.document.size, tL_wallPaper3, str3, null, "jpg", b11, null);
                                                            }
                                                            l71Var.L0[1].a(l71Var.Y0 != null, false);
                                                            float f13 = l71Var.o1;
                                                            l71Var.n1 = f13;
                                                            l71Var.V0.setProgress(f13);
                                                            l71Var.z0.getImageReceiver().setAlpha(l71Var.n1);
                                                            l71Var.o1();
                                                            l71Var.s1();
                                                        }
                                                        if (l71Var.b != 2) {
                                                            if (l71Var.Y0 == null) {
                                                                if (l71Var.G1) {
                                                                    l71Var.G1 = false;
                                                                    l71Var.L0[0].a(false, true);
                                                                    l71Var.Q0();
                                                                }
                                                                l71Var.q1();
                                                            }
                                                            l71Var.k1(0, true, true);
                                                            break;
                                                        } else {
                                                            l71Var.k1(i47, false, true);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    l71 l71Var2 = this.b;
                                                    if (l71Var2.t1 == null) {
                                                        if (l71Var2.b != 2) {
                                                            l71Var2.k1(0, true, true);
                                                            break;
                                                        } else {
                                                            l71Var2.k1(i22, false, true);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                } else {
                                    viewGroupArr = viewGroupArr2;
                                    r13 = 1;
                                    f12 = 21.0f;
                                }
                                if (i22 == r13) {
                                    TextView textView8 = new TextView(context);
                                    this.g2 = textView8;
                                    textView8.setLines(r13);
                                    this.g2.setSingleLine(r13);
                                    this.g2.setText(org.telegram.messenger.bd.L0(2131753749));
                                    org.telegram.ui.ActionBar.r6.V(this.g2, org.telegram.ui.ActionBar.k6.G6, getResourceProvider());
                                    this.g2.setTextSize(r13, 20.0f);
                                    this.g2.setTypeface(org.telegram.messenger.g0.o());
                                    this.g2.setPadding(org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(8.0f));
                                    this.g2.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                                    this.g2.setGravity(16);
                                    viewGroupArr[i22].addView(this.g2, b8.mf.d(-1, 48.0f, 51, 0.0f, 21.0f, 0.0f, 0.0f));
                                    u51 u51Var = new u51(context);
                                    this.R0 = u51Var;
                                    u4.b0 b0Var = new u4.b0(0, false);
                                    this.T0 = b0Var;
                                    u51Var.setLayoutManager(b0Var);
                                    u51 u51Var2 = this.R0;
                                    j71 j71Var = new j71(context, this);
                                    this.S0 = j71Var;
                                    u51Var2.setAdapter(j71Var);
                                    this.R0.i(new ei.l(14));
                                    viewGroupArr[i22].addView(this.R0, b8.mf.d(-1, 100.0f, 51, 0.0f, 76.0f, 0.0f, 0.0f));
                                    this.R0.setOnItemClickListener(new nx0(this, 7));
                                    org.telegram.ui.Cells.n4 n4Var2 = new org.telegram.ui.Cells.n4(context);
                                    this.U0 = n4Var2;
                                    n4Var2.setText(org.telegram.messenger.bd.L0(2131753744));
                                    viewGroupArr[i22].addView(this.U0, b8.mf.d(-1, -2.0f, 51, 0.0f, 175.0f, 0.0f, 0.0f));
                                    org.telegram.ui.Cells.h0 h0Var = new org.telegram.ui.Cells.h0(context, (l61) getResourceProvider());
                                    this.V0 = h0Var;
                                    h0Var.setProgress(this.n1);
                                    this.V0.setReportChanges(true);
                                    this.V0.setDelegate(new o61(this));
                                    viewGroupArr[i22].addView(this.V0, b8.mf.d(-1, 38.0f, 51, 5.0f, 211.0f, 5.0f, 0.0f));
                                } else {
                                    org.telegram.ui.Components.vp vpVar = new org.telegram.ui.Components.vp(context, this.i0, new p61(this));
                                    this.X = vpVar;
                                    vpVar.setResourcesProvider(getResourceProvider());
                                    if (i10 == 1) {
                                        viewGroupArr[i22].addView(this.X, b8.mf.e(-1, -1, 1));
                                        if (j6Var3.q()) {
                                            this.X.setMinBrightness(0.2f);
                                        } else {
                                            this.X.setMinBrightness(0.05f);
                                            this.X.setMaxBrightness(0.8f);
                                        }
                                        if (g6Var != null) {
                                            int i47 = g6Var.d != 0 ? 2 : 1;
                                            org.telegram.ui.Components.vp vpVar2 = this.X;
                                            Y0(1);
                                            vpVar2.f(1, 2, i47, false);
                                            this.X.e(g6Var.c, 0);
                                            int i48 = g6Var.d;
                                            if (i48 != 0) {
                                                this.X.e(i48, 1);
                                            }
                                        }
                                    } else {
                                        viewGroupArr[i22].addView(this.X, b8.mf.d(-1, -1.0f, 1, 0.0f, 0.0f, 0.0f, 48.0f));
                                    }
                                }
                                i22++;
                            }
                        }
                        o1();
                        if (!this.z0.getImageReceiver().I()) {
                            this.v0.setBackgroundColor(-16777216);
                        }
                        i23 = 1;
                        if (i10 != 1 && !(this.D1 instanceof kc1)) {
                            this.z0.getImageReceiver().c0(true);
                        }
                    }
                    i15 = 0;
                    String[] strArr3 = new String[i15];
                    int[] iArr3 = new int[i15];
                    this.L0 = new org.telegram.ui.Components.o61[i15];
                    if (i15 != 0) {
                    }
                    i19 = 0;
                    while (true) {
                        l61Var = this.a;
                        if (i19 >= i15) {
                        }
                        i19++;
                        i17 = i32;
                        j6Var = j6Var2;
                        i14 = 2;
                        i16 = 1;
                    }
                    org.telegram.ui.ActionBar.j6 j6Var32 = j6Var;
                    i20 = i16;
                    i10 = i17;
                    if (i10 == i20) {
                    }
                    if (i10 != i21) {
                    }
                    this.H1 = false;
                    i22 = 0;
                    while (i22 < 2) {
                    }
                    o1();
                    if (!this.z0.getImageReceiver().I()) {
                    }
                    i23 = 1;
                    if (i10 != 1) {
                        this.z0.getImageReceiver().c0(true);
                    }
                } else {
                    if (!(obj instanceof lc1) || !"t".equals(((lc1) obj).a)) {
                        i15 = i14;
                        String[] strArr32 = new String[i15];
                        int[] iArr32 = new int[i15];
                        this.L0 = new org.telegram.ui.Components.o61[i15];
                        if (i15 != 0) {
                        }
                        i19 = 0;
                        while (true) {
                            l61Var = this.a;
                            if (i19 >= i15) {
                            }
                            i19++;
                            i17 = i32;
                            j6Var = j6Var2;
                            i14 = 2;
                            i16 = 1;
                        }
                        org.telegram.ui.ActionBar.j6 j6Var322 = j6Var;
                        i20 = i16;
                        i10 = i17;
                        if (i10 == i20) {
                        }
                        if (i10 != i21) {
                        }
                        this.H1 = false;
                        i22 = 0;
                        while (i22 < 2) {
                        }
                        o1();
                        if (!this.z0.getImageReceiver().I()) {
                        }
                        i23 = 1;
                        if (i10 != 1) {
                        }
                    }
                    i15 = 0;
                    String[] strArr322 = new String[i15];
                    int[] iArr322 = new int[i15];
                    this.L0 = new org.telegram.ui.Components.o61[i15];
                    if (i15 != 0) {
                    }
                    i19 = 0;
                    while (true) {
                        l61Var = this.a;
                        if (i19 >= i15) {
                        }
                        i19++;
                        i17 = i32;
                        j6Var = j6Var2;
                        i14 = 2;
                        i16 = 1;
                    }
                    org.telegram.ui.ActionBar.j6 j6Var3222 = j6Var;
                    i20 = i16;
                    i10 = i17;
                    if (i10 == i20) {
                    }
                    if (i10 != i21) {
                    }
                    this.H1 = false;
                    i22 = 0;
                    while (i22 < 2) {
                    }
                    o1();
                    if (!this.z0.getImageReceiver().I()) {
                    }
                    i23 = 1;
                    if (i10 != 1) {
                    }
                }
            } else {
                i23 = 1;
            }
            this.w0.setAdapter(this.x0);
            n61 n61Var2 = new n61(this, context, i23);
            this.m0 = n61Var2;
            n61Var2.setWillNotDraw(false);
            n61 n61Var3 = this.m0;
            this.fragmentView = n61Var3;
            ViewTreeObserver viewTreeObserver = n61Var3.getViewTreeObserver();
            s70 s70Var = new s70(this, i23);
            this.S = s70Var;
            viewTreeObserver.addOnGlobalLayoutListener(s70Var);
            b5.l lVar = new b5.l(context);
            this.l0 = lVar;
            lVar.b(new l2(this, 2));
            this.l0.setAdapter(new org.telegram.ui.Components.w10(this, 3));
            org.telegram.messenger.g0.C3(this.l0, getThemedColor(org.telegram.ui.ActionBar.k6.s8));
            this.m0.addView(this.l0, b8.mf.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i10 != 0 ? 48.0f : 0.0f));
            UndoView undoView = new UndoView(context, this);
            this.n0 = undoView;
            undoView.setAdditionalTranslationY(org.telegram.messenger.g0.L(51.0f));
            this.m0.addView(this.n0, b8.mf.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            if (i10 != 0) {
                View view = new View(context);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.V5, view, getResourceProvider());
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, 1, 83);
                layoutParams4.bottomMargin = org.telegram.messenger.g0.L(48.0f);
                this.m0.addView(view, layoutParams4);
                FrameLayout frameLayout = new FrameLayout(context);
                this.d0 = frameLayout;
                boolean z14 = this.d;
                if (z14) {
                    int i49 = org.telegram.ui.ActionBar.k6.d6;
                    frameLayout.setBackgroundColor(z14 ? org.telegram.ui.ActionBar.k6.F0(i49) : getThemedColor(i49));
                } else {
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, frameLayout, getResourceProvider());
                }
                this.m0.addView(this.d0, b8.mf.e(-1, 48, 83));
                gi.n5 n5Var = new gi.n5(context, this);
                this.c0 = n5Var;
                this.d0.addView(n5Var, b8.mf.e(22, 8, 17));
                TextView textView9 = new TextView(context);
                this.f0 = textView9;
                textView9.setTextSize(1, 14.0f);
                if (z14) {
                    TextView textView10 = this.f0;
                    int i50 = org.telegram.ui.ActionBar.k6.pf;
                    textView10.setTextColor(z14 ? org.telegram.ui.ActionBar.k6.F0(i50) : getThemedColor(i50));
                } else {
                    org.telegram.ui.ActionBar.r6.V(this.f0, org.telegram.ui.ActionBar.k6.pf, getResourceProvider());
                }
                this.f0.setGravity(17);
                this.f0.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.g0(251658240, 0));
                this.f0.setPadding(org.telegram.messenger.g0.L(29.0f), 0, org.telegram.messenger.g0.L(29.0f), 0);
                this.f0.setText(org.telegram.messenger.bd.L0(2131752589));
                this.f0.setTypeface(org.telegram.messenger.g0.o());
                this.d0.addView(this.f0, b8.mf.e(-2, -1, 51));
                final int i51 = 0;
                this.f0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.z51
                    public final /* synthetic */ l71 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i51) {
                            case 0:
                                this.b.S0(false);
                                break;
                            case 1:
                                l71.a0(this.b);
                                break;
                            case 2:
                                this.b.e.U(null, null);
                                break;
                            case 3:
                                this.b.R0(false);
                                break;
                            default:
                                this.b.R0(true);
                                break;
                        }
                    }
                });
                TextView textView11 = new TextView(context);
                this.e0 = textView11;
                textView11.setTextSize(1, 14.0f);
                if (z14) {
                    TextView textView12 = this.e0;
                    int i52 = org.telegram.ui.ActionBar.k6.pf;
                    textView12.setTextColor(z14 ? org.telegram.ui.ActionBar.k6.F0(i52) : getThemedColor(i52));
                } else {
                    org.telegram.ui.ActionBar.r6.V(this.e0, org.telegram.ui.ActionBar.k6.pf, getResourceProvider());
                }
                this.e0.setGravity(17);
                this.e0.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.g0(251658240, 0));
                this.e0.setPadding(org.telegram.messenger.g0.L(29.0f), 0, org.telegram.messenger.g0.L(29.0f), 0);
                this.e0.setText(org.telegram.messenger.bd.L0(2131754216));
                this.e0.setTypeface(org.telegram.messenger.g0.o());
                this.d0.addView(this.e0, b8.mf.e(-2, -1, 53));
                i24 = 1;
                this.e0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.z51
                    public final /* synthetic */ l71 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i24) {
                            case 0:
                                this.b.S0(false);
                                break;
                            case 1:
                                l71.a0(this.b);
                                break;
                            case 2:
                                this.b.e.U(null, null);
                                break;
                            case 3:
                                this.b.R0(false);
                                break;
                            default:
                                this.b.R0(true);
                                break;
                        }
                    }
                });
            } else {
                i24 = 1;
            }
            if (i10 == i24 && !org.telegram.ui.ActionBar.k6.c1() && g6Var != null && g6Var.j != 4294967296L) {
                c1();
            }
            this.k0 = X0();
            g1(true);
            r1(false);
            this.c = new Scroller(getContext());
            q4Var2 = this.parentLayout;
            if (q4Var2 != null && q4Var2.getBottomSheet() != null) {
                this.parentLayout.getBottomSheet().O(getThemedColor(org.telegram.ui.ActionBar.k6.h5));
                if (i10 == 2 && this.L1 != 0) {
                    this.parentLayout.getBottomSheet().E0(-16777216);
                }
            }
            return this.fragmentView;
        }
        z10 = false;
        this.O1 = z10;
        if (z10) {
        }
        q4Var = this.parentLayout;
        if (q4Var != null) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.o0 = new FrameLayout(context);
        i3 = 3;
        if (this.O1) {
            org.telegram.messenger.g0.i3(new y51(this, i3), 2000L);
        }
        this.actionBar.q().a(0, R.drawable.outline_header_search).M().J(new x61()).setSearchFieldHint(org.telegram.messenger.bd.L0(2131745846));
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.r4());
        this.actionBar.setAddToContainer(false);
        this.actionBar.setTitle(org.telegram.messenger.bd.L0(2131744182));
        l0 l0Var2 = new l0(26, context, this);
        this.o0 = l0Var2;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, l0Var2, getResourceProvider());
        this.o0.addView(this.actionBar, b8.mf.c(-2.0f, -1));
        org.telegram.ui.Components.tj0 tj0Var3 = new org.telegram.ui.Components.tj0(context);
        this.p0 = tj0Var3;
        tj0Var3.setVerticalScrollBarEnabled(true);
        this.p0.setItemAnimator(null);
        this.p0.setLayoutAnimation(null);
        this.p0.setLayoutManager(new u4.b0(1, false));
        final int i272 = 2;
        this.p0.setVerticalScrollbarPosition(!org.telegram.messenger.bd.a0 ? 1 : 2);
        org.telegram.ui.Components.tj0 tj0Var22 = this.p0;
        i10 = this.b;
        tj0Var22.setPadding(0, 0, 0, org.telegram.messenger.g0.L(i10 == 0 ? 12.0f : 0.0f));
        final int i282 = 4;
        this.p0.setOnItemClickListener(new ai.a(i282));
        this.o0.addView(this.p0, b8.mf.e(-1, -1, 51));
        org.telegram.ui.Components.l00 l00Var2 = new org.telegram.ui.Components.l00(context, this.resourceProvider);
        this.r0 = l00Var2;
        l00Var2.setImageResource(R.drawable.floating_pencil);
        this.o0.addView(this.r0, org.telegram.ui.Components.l00.b());
        n4 n4Var3 = new n4(context);
        this.q0 = n4Var3;
        this.p0.setAdapter(n4Var3);
        this.v0 = new org.telegram.ui.ActionBar.k0(i272, context, this);
        this.x0 = new h71(context, this);
        this.u0 = createActionBar(context);
        if (org.telegram.messenger.g0.Q1()) {
        }
        this.u0.setBackButtonDrawable(new org.telegram.ui.ActionBar.w1(false));
        this.u0.setActionBarMenuOnItemClick(new a71(this));
        i11 = 0;
        while (true) {
            b71VarArr = this.y0;
            if (i11 < 2) {
            }
            b71VarArr[i11] = new b71(this, (Activity) getContext());
            this.v0.addView(b71VarArr[i11], b8.mf.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
            i11++;
        }
        b71 b71Var2 = b71VarArr[0];
        this.z0 = b71Var2;
        b71Var2.setVisibility(0);
        b71VarArr[1].setVisibility(8);
        if (i10 == 2) {
        }
        z11 = this.x0.e;
        j6Var = this.g0;
        if (!z11) {
        }
        this.w0 = new g61(context, this);
        h61 h61Var2 = new h61(this);
        h61Var2.S();
        this.w0.setItemAnimator(h61Var2);
        this.w0.setVerticalScrollBarEnabled(true);
        this.w0.setOverScrollMode(2);
        if (i10 != 2) {
        }
        this.w0.setClipToPadding(false);
        this.w0.setLayoutManager(new u4.b0(1, true));
        this.w0.setVerticalScrollbarPosition(!org.telegram.messenger.bd.a0 ? 1 : 2);
        if (i10 != 1) {
        }
        this.w0.setOnScrollListener(new r11(this, i3));
        this.v0.addView(this.u0, b8.mf.c(-2.0f, i13));
        org.telegram.ui.Components.q61 q61Var2 = new org.telegram.ui.Components.q61(context);
        this.x1 = q61Var2;
        q61Var2.b(new a61(this, i272));
        org.telegram.ui.ActionBar.g6 g6Var2 = this.w;
        if (i10 != 1) {
        }
        if (i10 != 2) {
        }
        Rect rect3 = new Rect();
        Drawable g72 = k2.p1.g(context, R.drawable.sheet_shadow_round);
        this.r = g72;
        g72.getPadding(rect3);
        Drawable drawable3 = this.r;
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.k6.d6);
        this.s = themedColor2;
        drawable3.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        obj = this.D1;
        if (i10 != 1) {
        }
        if (obj instanceof kc1) {
        }
        i15 = 3;
        String[] strArr3222 = new String[i15];
        int[] iArr3222 = new int[i15];
        this.L0 = new org.telegram.ui.Components.o61[i15];
        if (i15 != 0) {
        }
        i19 = 0;
        while (true) {
            l61Var = this.a;
            if (i19 >= i15) {
            }
            i19++;
            i17 = i32;
            j6Var = j6Var2;
            i14 = 2;
            i16 = 1;
        }
        org.telegram.ui.ActionBar.j6 j6Var32222 = j6Var;
        i20 = i16;
        i10 = i17;
        if (i10 == i20) {
        }
        if (i10 != i21) {
        }
        this.H1 = false;
        i22 = 0;
        while (i22 < 2) {
        }
        o1();
        if (!this.z0.getImageReceiver().I()) {
        }
        i23 = 1;
        if (i10 != 1) {
        }
        this.w0.setAdapter(this.x0);
        n61 n61Var22 = new n61(this, context, i23);
        this.m0 = n61Var22;
        n61Var22.setWillNotDraw(false);
        n61 n61Var32 = this.m0;
        this.fragmentView = n61Var32;
        ViewTreeObserver viewTreeObserver2 = n61Var32.getViewTreeObserver();
        s70 s70Var2 = new s70(this, i23);
        this.S = s70Var2;
        viewTreeObserver2.addOnGlobalLayoutListener(s70Var2);
        b5.l lVar2 = new b5.l(context);
        this.l0 = lVar2;
        lVar2.b(new l2(this, 2));
        this.l0.setAdapter(new org.telegram.ui.Components.w10(this, 3));
        org.telegram.messenger.g0.C3(this.l0, getThemedColor(org.telegram.ui.ActionBar.k6.s8));
        this.m0.addView(this.l0, b8.mf.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i10 != 0 ? 48.0f : 0.0f));
        UndoView undoView2 = new UndoView(context, this);
        this.n0 = undoView2;
        undoView2.setAdditionalTranslationY(org.telegram.messenger.g0.L(51.0f));
        this.m0.addView(this.n0, b8.mf.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        if (i10 != 0) {
        }
        if (i10 == i24) {
            c1();
        }
        this.k0 = X0();
        g1(true);
        r1(false);
        this.c = new Scroller(getContext());
        q4Var2 = this.parentLayout;
        if (q4Var2 != null) {
            this.parentLayout.getBottomSheet().O(getThemedColor(org.telegram.ui.ActionBar.k6.h5));
            if (i10 == 2) {
                this.parentLayout.getBottomSheet().E0(-16777216);
            }
        }
        return this.fragmentView;
    }

    public final void d1(int i3, boolean z10) {
        org.telegram.ui.ActionBar.g6 g6Var;
        int i10;
        if (getParentActivity() == null || this.n == i3 || this.t1 != null || (g6Var = this.w) == null) {
            return;
        }
        if (z10 && i3 == 2 && (org.telegram.ui.ActionBar.k6.c1() || g6Var.j == 4294967296L)) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = org.telegram.messenger.bd.M0(2131752550, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
            s1Var.S = M0;
            if (!org.telegram.ui.ActionBar.k6.c1() || (org.telegram.ui.ActionBar.k6.c1() && org.telegram.ui.ActionBar.k6.I.j0.d != 0)) {
                s1Var.U = org.telegram.messenger.bd.M0(2131752549, null);
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131746128, null), new a61(this, 5));
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131751771, null), new a61(this, 6));
            } else {
                s1Var.U = org.telegram.messenger.bd.M0(2131752529, null);
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752552, null), new a61(this, 7));
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
            }
            showDialog(s1Var);
            return;
        }
        int i11 = this.n;
        this.n = i3;
        if (i3 == 1) {
            i10 = i11;
            this.h.setText(org.telegram.messenger.bd.M0(2131752015, null));
            int i12 = g6Var.d != 0 ? 2 : 1;
            org.telegram.ui.Components.vp vpVar = this.X;
            Y0(1);
            vpVar.f(1, 2, i12, false);
            this.X.e(g6Var.c, 0);
            int i13 = g6Var.d;
            if (i13 != 0) {
                this.X.e(i13, 1);
            }
            if (i10 == 2 || (i10 == 3 && g6Var.g != 0)) {
                this.x0.s(0);
            }
        } else if (i3 != 2) {
            if (i3 == 3) {
                this.h.setText(org.telegram.messenger.bd.M0(2131752014, null));
                int i14 = g6Var.f != 0 ? g6Var.h != 0 ? 4 : g6Var.g != 0 ? 3 : 2 : 1;
                org.telegram.ui.Components.vp vpVar2 = this.X;
                Y0(3);
                vpVar2.f(2, 4, i14, true);
                this.X.e(g6Var.h, 3);
                this.X.e(g6Var.g, 2);
                this.X.e(g6Var.f, 1);
                org.telegram.ui.Components.vp vpVar3 = this.X;
                int i15 = g6Var.e;
                if (i15 == 0) {
                    i15 = g6Var.c;
                }
                vpVar3.e(i15, 0);
                this.M0[1].b(0, g6Var.e);
                this.M0[1].b(1, g6Var.f);
                this.M0[1].b(2, g6Var.g);
                this.M0[1].b(3, g6Var.h);
                if (g6Var.g != 0) {
                    if (i11 == 1) {
                        this.x0.i(0);
                    } else {
                        this.x0.g(0);
                    }
                } else if (i11 == 2) {
                    this.x0.s(0);
                }
                this.w0.w0(0, org.telegram.messenger.g0.L(60.0f), null);
                j1();
            }
            i10 = i11;
        } else {
            this.h.setText(org.telegram.messenger.bd.M0(2131752016, null));
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.Be);
            int i16 = org.telegram.ui.ActionBar.k6.Ce;
            int themedColor2 = org.telegram.ui.ActionBar.k6.f1(i16) ? getThemedColor(i16) : 0;
            int i17 = org.telegram.ui.ActionBar.k6.De;
            int themedColor3 = org.telegram.ui.ActionBar.k6.f1(i17) ? getThemedColor(i17) : 0;
            int i18 = org.telegram.ui.ActionBar.k6.Ee;
            int themedColor4 = org.telegram.ui.ActionBar.k6.f1(i18) ? getThemedColor(i18) : 0;
            long j10 = g6Var.k;
            int i19 = (int) j10;
            if (i19 == 0 && j10 != 0) {
                themedColor2 = 0;
            }
            long j11 = g6Var.l;
            int i20 = (int) j11;
            if (i20 == 0 && j11 != 0) {
                themedColor3 = 0;
            }
            long j12 = g6Var.m;
            int i21 = (int) j12;
            if (i21 == 0 && j12 != 0) {
                themedColor4 = 0;
            }
            int i22 = (int) g6Var.j;
            int i23 = (i19 == 0 && themedColor2 == 0) ? 1 : (i21 == 0 && themedColor4 == 0) ? (i20 == 0 && themedColor3 == 0) ? 2 : 3 : 4;
            org.telegram.ui.Components.vp vpVar4 = this.X;
            Y0(2);
            vpVar4.f(2, 4, i23, false);
            org.telegram.ui.Components.vp vpVar5 = this.X;
            if (i21 == 0) {
                i21 = themedColor4;
            }
            vpVar5.e(i21, 3);
            org.telegram.ui.Components.vp vpVar6 = this.X;
            if (i20 == 0) {
                i20 = themedColor3;
            }
            vpVar6.e(i20, 2);
            org.telegram.ui.Components.vp vpVar7 = this.X;
            if (i19 == 0) {
                i19 = themedColor2;
            }
            vpVar7.e(i19, 1);
            org.telegram.ui.Components.vp vpVar8 = this.X;
            if (i22 != 0) {
                themedColor = i22;
            }
            vpVar8.e(themedColor, 0);
            i10 = i11;
            if (i10 == 1 || g6Var.g == 0) {
                this.x0.i(0);
            } else {
                this.x0.g(0);
            }
            this.w0.w0(0, org.telegram.messenger.g0.L(60.0f), null);
        }
        if (i3 != 1 && i3 != 3) {
            this.X.setMinBrightness(0.0f);
            this.X.setMaxBrightness(1.0f);
            return;
        }
        if (i10 == 2 && this.N0[1].getVisibility() == 0) {
            k1(0, true, true);
        }
        if (i3 != 1) {
            this.X.setMinBrightness(0.0f);
            this.X.setMaxBrightness(1.0f);
        } else if (this.g0.q()) {
            this.X.setMinBrightness(0.2f);
        } else {
            this.X.setMinBrightness(0.05f);
            this.X.setMaxBrightness(0.8f);
        }
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        if (i3 == org.telegram.messenger.hs.p3) {
            if (this.L1 == ((Long) objArr[2]).longValue()) {
                this.X1 = (TL_stories.TL_premium_boostsStatus) objArr[0];
                m1(true);
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.i4) {
            org.telegram.ui.Components.tj0 tj0Var = this.p0;
            if (tj0Var == null) {
                return;
            }
            int childCount = tj0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.p0.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.t2) {
                    ((org.telegram.ui.Cells.t2) childAt).i0(0, true);
                }
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.j4) {
            g61 g61Var = this.w0;
            if (g61Var != null) {
                g61Var.g1();
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.z4) {
            if (this.v0 != null) {
                g1(true);
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.f4) {
            Object obj = this.D1;
            if (obj instanceof lc1) {
                lc1 lc1Var = (lc1) obj;
                if (lc1Var.a == null) {
                    lc1Var.a = (String) objArr[0];
                    return;
                }
                return;
            }
            return;
        }
        long j10 = 0;
        if (i3 != org.telegram.messenger.hs.e4) {
            if (i3 != org.telegram.messenger.hs.u5 || this.L1 == 0) {
                return;
            }
            finishFragment();
            return;
        }
        ArrayList arrayList = (ArrayList) objArr[0];
        this.W0.clear();
        HashMap hashMap = this.X0;
        hashMap.clear();
        int size = arrayList.size();
        boolean z10 = false;
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) arrayList.get(i12);
            if ((wallPaper instanceof TLRPC.TL_wallPaper) && wallPaper.pattern) {
                TLRPC.Document document = wallPaper.document;
                if (document != null && !hashMap.containsKey(Long.valueOf(document.id))) {
                    this.W0.add(wallPaper);
                    hashMap.put(Long.valueOf(wallPaper.document.id), wallPaper);
                }
                org.telegram.ui.ActionBar.g6 g6Var = this.w;
                if (g6Var != null && (str = g6Var.o) != null && str.equals(wallPaper.slug)) {
                    this.Y0 = (TLRPC.TL_wallPaper) wallPaper;
                    g1(false);
                    o1();
                } else if (g6Var == null) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = this.Y0;
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
        if (!z10 && (tL_wallPaper = this.Y0) != null) {
            this.W0.add(0, tL_wallPaper);
        }
        j71 j71Var = this.S0;
        if (j71Var != null) {
            j71Var.f();
        }
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) arrayList.get(i13);
            if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                j10 = org.telegram.messenger.li.p(j10, wallPaper2.id);
            }
        }
        TL_account.getWallPapers getwallpapers = new TL_account.getWallPapers();
        getwallpapers.hash = j10;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new e61(this, 1)), this.classGuid);
    }

    public final void e1(int i3) {
        TLRPC.TL_wallPaper tL_wallPaper = (i3 < 0 || i3 >= this.W0.size()) ? this.a1 : (TLRPC.TL_wallPaper) this.W0.get(i3);
        if (tL_wallPaper == null) {
            return;
        }
        ValueAnimator valueAnimator = this.e2;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.e2.cancel();
        }
        b71[] b71VarArr = this.y0;
        b71 b71Var = b71VarArr[0];
        b71 b71Var2 = b71VarArr[1];
        b71VarArr[0] = b71Var2;
        b71VarArr[1] = b71Var;
        this.v0.removeView(b71Var2);
        this.v0.addView(b71VarArr[0], this.v0.indexOfChild(b71VarArr[1]) + 1);
        b71 b71Var3 = b71VarArr[0];
        this.z0 = b71Var3;
        b71Var3.setBackground(b71VarArr[1].getBackground());
        p1();
        b71VarArr[1].setVisibility(0);
        b71VarArr[1].setAlpha(1.0f);
        this.z0.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.e2 = ofFloat;
        ofFloat.addUpdateListener(new ei(2, this));
        this.e2.addListener(new q61(this, 0));
        this.e2.setInterpolator(org.telegram.ui.Components.xq.f);
        this.e2.setDuration(300L);
        this.e2.start();
        this.z0.getImageReceiver().t1 = org.telegram.messenger.hs.X4;
        this.z0.getImageReceiver().r0(org.telegram.messenger.ac.b(tL_wallPaper.document), this.I1, null, null, null, tL_wallPaper.document.size, "jpg", tL_wallPaper, 1);
        this.z0.d();
        this.Y0 = tL_wallPaper;
        this.G1 = this.L0[2].s;
        o1();
    }

    public final void f1(int i3, int i10, boolean z10) {
        org.telegram.ui.Components.la0 la0Var;
        if (i10 == 0) {
            this.b1 = i3;
        } else if (i10 == 1) {
            this.d1 = i3;
        } else if (i10 == 2) {
            this.e1 = i3;
        } else if (i10 == 3) {
            this.f1 = i3;
        }
        r1(z10);
        if (this.L0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.o61[] o61VarArr = this.L0;
                if (i11 >= o61VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.o61 o61Var = o61VarArr[i11];
                if (o61Var != null) {
                    o61Var.b(i10, i3);
                }
                i11++;
            }
        }
        if (this.e1 != 0) {
            if (this.V0 != null && org.telegram.ui.ActionBar.k6.I.q()) {
                this.V0.setTwoSided(true);
            }
            Drawable background = this.z0.getBackground();
            if (background instanceof org.telegram.ui.Components.la0) {
                la0Var = (org.telegram.ui.Components.la0) background;
            } else {
                la0Var = new org.telegram.ui.Components.la0();
                la0Var.q(this.z0);
                if (this.F1) {
                    la0Var.m(false);
                }
            }
            la0Var.n(this.b1, this.d1, this.e1, this.f1);
            this.z0.setBackground(la0Var);
            this.l1 = la0Var.f();
            this.m1 = 754974720;
        } else if (this.d1 != 0) {
            this.z0.setBackground(new GradientDrawable(org.telegram.ui.Components.j9.d(this.j1), new int[]{this.b1, this.d1}));
            int V0 = org.telegram.messenger.g0.V0(org.telegram.messenger.g0.w0(this.b1, this.d1), false);
            this.m1 = V0;
            this.l1 = V0;
        } else {
            this.z0.setBackgroundColor(this.b1);
            int V02 = org.telegram.messenger.g0.V0(this.b1, false);
            this.m1 = V02;
            this.l1 = V02;
        }
        int i12 = org.telegram.ui.ActionBar.k6.Zc;
        boolean f12 = org.telegram.ui.ActionBar.k6.f1(i12);
        l61 l61Var = this.a;
        if (!f12 || (this.z0.getBackground() instanceof org.telegram.ui.Components.la0)) {
            l61Var.k(this.z0.getBackground(), this.z0.getBackground(), Float.valueOf(this.n1));
        } else if (org.telegram.ui.ActionBar.k6.t0() instanceof org.telegram.ui.Components.la0) {
            getThemedColor(i12);
            l61Var.k(this.z0.getBackground(), this.z0.getBackground(), Float.valueOf(this.n1));
        }
        ImageView imageView = this.H0;
        if (imageView != null) {
            org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.Wc, l61Var, PorterDuff.Mode.MULTIPLY);
        }
        ImageView imageView2 = this.I0;
        if (imageView2 != null) {
            org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.Wc, l61Var, PorterDuff.Mode.MULTIPLY);
        }
        b71 b71Var = this.z0;
        if (b71Var != null) {
            b71Var.getImageReceiver().p1 = new PorterDuffColorFilter(this.l1, this.u1);
            this.z0.getImageReceiver().setAlpha(Math.abs(this.n1));
            this.z0.invalidate();
            if (org.telegram.ui.ActionBar.k6.I.q() && (this.z0.getBackground() instanceof org.telegram.ui.Components.la0)) {
                org.telegram.ui.Cells.h0 h0Var = this.V0;
                if (h0Var != null) {
                    h0Var.setTwoSided(true);
                }
                if (this.n1 < 0.0f) {
                    this.z0.getImageReceiver().m0(((org.telegram.ui.Components.la0) this.z0.getBackground()).k);
                }
            } else {
                this.z0.getImageReceiver().m0(null);
                org.telegram.ui.Cells.h0 h0Var2 = this.V0;
                if (h0Var2 != null) {
                    h0Var2.setTwoSided(false);
                }
            }
            org.telegram.ui.Cells.h0 h0Var3 = this.V0;
            if (h0Var3 != null) {
                h0Var3.setProgress(this.n1);
            }
        }
        g61 g61Var = this.w0;
        if (g61Var != null) {
            g61Var.g1();
        }
        FrameLayout frameLayout = this.A0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                this.A0.getChildAt(i13).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.B0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                this.B0.getChildAt(i14).invalidate();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g1(boolean z10) {
        ColorDrawable colorDrawable;
        org.telegram.ui.Components.la0 la0Var;
        org.telegram.ui.ActionBar.g6 g6Var = this.w;
        int i3 = 0;
        int i10 = this.b;
        if (i10 == 0 && g6Var == null) {
            this.z0.setBackground(org.telegram.ui.ActionBar.k6.s0());
        } else {
            if (i10 == 2) {
                Object obj = this.D1;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
                    TLRPC.PhotoSize w10 = z10 ? org.telegram.messenger.w7.w(tL_wallPaper.document.thumbs, 100, false, null, false) : null;
                    BitmapDrawable bitmapDrawable = w10 instanceof TLRPC.TL_photoStrippedSize ? new BitmapDrawable(org.telegram.messenger.zb.F("b", w10.bytes)) : null;
                    b71 b71Var = this.z0;
                    b71Var.a.r0(org.telegram.messenger.ac.b(tL_wallPaper.document), this.I1, org.telegram.messenger.ac.c(w10, tL_wallPaper.document), "100_100_b", bitmapDrawable, tL_wallPaper.document.size, "jpg", tL_wallPaper, 1);
                    b71Var.d();
                } else if (obj instanceof kc1) {
                    kc1 kc1Var = (kc1) obj;
                    int i11 = kc1Var.f;
                    int i12 = kc1Var.e;
                    int i13 = kc1Var.d;
                    int i14 = kc1Var.c;
                    int i15 = kc1Var.b;
                    this.j1 = i11;
                    f1(i15, 0, false);
                    if (i14 != 0) {
                        f1(i14, 1, false);
                    }
                    f1(i13, 2, false);
                    f1(i12, 3, false);
                    TLRPC.TL_wallPaper tL_wallPaper2 = this.Y0;
                    if (tL_wallPaper2 != null) {
                        b71 b71Var2 = this.z0;
                        org.telegram.messenger.ac b10 = org.telegram.messenger.ac.b(tL_wallPaper2.document);
                        String str = this.I1;
                        TLRPC.TL_wallPaper tL_wallPaper3 = this.Y0;
                        b71Var2.g(1, tL_wallPaper3.document.size, tL_wallPaper3, str, null, "jpg", b10, null);
                    } else if ("d".equals(kc1Var.a)) {
                        Point point = org.telegram.messenger.g0.q;
                        this.z0.setImageBitmap(org.telegram.messenger.kz.d(R.raw.default_pattern, Math.min(point.x, point.y), Math.max(point.x, point.y), Build.VERSION.SDK_INT >= 29 ? 1459617792 : org.telegram.ui.Components.la0.g(i15, i14, i13, i12)));
                    }
                } else if (obj instanceof lc1) {
                    Bitmap bitmap = this.E1;
                    if (bitmap != null) {
                        this.z0.setImageBitmap(bitmap);
                    } else {
                        lc1 lc1Var = (lc1) obj;
                        File file = lc1Var.e;
                        if (file != null) {
                            this.z0.h(file.getAbsolutePath(), this.I1, null);
                        } else {
                            File file2 = lc1Var.d;
                            if (file2 != null) {
                                this.z0.h(file2.getAbsolutePath(), this.I1, null);
                            } else if ("t".equals(lc1Var.a)) {
                                b71 b71Var3 = this.z0;
                                b71Var3.setImageDrawable(org.telegram.ui.ActionBar.k6.Z0(b71Var3, false));
                            } else {
                                int i16 = lc1Var.b;
                                if (i16 != 0) {
                                    this.z0.setImageResource(i16);
                                }
                            }
                        }
                    }
                } else if (obj instanceof org.telegram.messenger.bf) {
                    org.telegram.messenger.bf bfVar = (org.telegram.messenger.bf) obj;
                    TLRPC.Photo photo = bfVar.K;
                    if (photo != null) {
                        TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(photo.sizes, 100, false, null, false);
                        TLRPC.PhotoSize w12 = org.telegram.messenger.w7.w(bfVar.K.sizes, this.J1, true, null, false);
                        TLRPC.PhotoSize photoSize = w12 != w11 ? w12 : null;
                        this.z0.g(1, photoSize != null ? photoSize.size : 0, bfVar, this.I1, "100_100_b", "jpg", org.telegram.messenger.ac.i(photoSize, bfVar.K), org.telegram.messenger.ac.i(w11, bfVar.K));
                    } else {
                        b71 b71Var4 = this.z0;
                        String str2 = bfVar.C;
                        String str3 = this.I1;
                        String str4 = bfVar.D;
                        b71Var4.getClass();
                        b71Var4.n(org.telegram.messenger.ac.g(str2), str3, org.telegram.messenger.ac.g(str4), "100_100_b", null, null, 0, null);
                    }
                }
            } else if (g6Var == null) {
                this.z0.setBackground(org.telegram.ui.ActionBar.k6.s0());
            } else {
                org.telegram.ui.Components.d9 d9Var = this.w1;
                if (d9Var != null) {
                    d9Var.dispose();
                    this.w1 = null;
                }
                int E0 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.Be);
                int i17 = (int) g6Var.j;
                if (i17 != 0) {
                    E0 = i17;
                }
                int E02 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.Ce);
                long j10 = g6Var.k;
                int i18 = (int) j10;
                if (i18 == 0 && j10 != 0) {
                    E02 = 0;
                } else if (i18 != 0) {
                    E02 = i18;
                }
                int E03 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.De);
                long j11 = g6Var.l;
                int i19 = (int) j11;
                if (i19 == 0 && j11 != 0) {
                    E03 = 0;
                } else if (i19 != 0) {
                    E03 = i19;
                }
                int E04 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.Ee);
                long j12 = g6Var.m;
                int i20 = (int) j12;
                if (i20 == 0 && j12 != 0) {
                    E04 = 0;
                } else if (i20 != 0) {
                    E04 = i20;
                }
                if (TextUtils.isEmpty(g6Var.o) || org.telegram.ui.ActionBar.k6.c1()) {
                    Drawable t02 = org.telegram.ui.ActionBar.k6.t0();
                    if (t02 != null) {
                        if (t02 instanceof org.telegram.ui.Components.la0) {
                            ((org.telegram.ui.Components.la0) t02).q(this.z0);
                        }
                        this.z0.setBackground(t02);
                    }
                } else {
                    if (E03 != 0) {
                        Drawable background = this.z0.getBackground();
                        if (background instanceof org.telegram.ui.Components.la0) {
                            la0Var = (org.telegram.ui.Components.la0) background;
                        } else {
                            org.telegram.ui.Components.la0 la0Var2 = new org.telegram.ui.Components.la0();
                            la0Var2.q(this.z0);
                            la0Var = la0Var2;
                            if (this.F1) {
                                la0Var2.m(false);
                                la0Var = la0Var2;
                            }
                        }
                        la0Var.n(E0, E02, E03, E04);
                        colorDrawable = la0Var;
                    } else if (E02 != 0) {
                        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9(org.telegram.ui.Components.j9.d(g6Var.n), new int[]{E0, E02});
                        this.w1 = j9Var.f(org.telegram.ui.Components.i9.w(0.5f, 3), new u61(this, i3), 100L);
                        colorDrawable = j9Var;
                    } else {
                        colorDrawable = new ColorDrawable(E0);
                    }
                    this.z0.setBackground(colorDrawable);
                    TLRPC.TL_wallPaper tL_wallPaper4 = this.Y0;
                    if (tL_wallPaper4 != null) {
                        b71 b71Var5 = this.z0;
                        org.telegram.messenger.ac b11 = org.telegram.messenger.ac.b(tL_wallPaper4.document);
                        String str5 = this.I1;
                        TLRPC.TL_wallPaper tL_wallPaper5 = this.Y0;
                        b71Var5.g(1, tL_wallPaper5.document.size, tL_wallPaper5, str5, null, "jpg", b11, null);
                    }
                }
                if (E02 == 0) {
                    int V0 = org.telegram.messenger.g0.V0(E0, false);
                    this.m1 = V0;
                    this.l1 = V0;
                } else if (E03 != 0) {
                    this.l1 = org.telegram.ui.Components.la0.g(E0, E02, E03, E04);
                    this.m1 = 754974720;
                } else {
                    int V02 = org.telegram.messenger.g0.V0(org.telegram.messenger.g0.w0(E0, E02), false);
                    this.m1 = V02;
                    this.l1 = V02;
                }
                b71 b71Var6 = this.z0;
                if (b71Var6 != null) {
                    b71Var6.getImageReceiver().p1 = new PorterDuffColorFilter(this.l1, this.u1);
                    this.z0.getImageReceiver().setAlpha(Math.abs(this.n1));
                    this.z0.invalidate();
                    if (org.telegram.ui.ActionBar.k6.I.q() && (this.z0.getBackground() instanceof org.telegram.ui.Components.la0)) {
                        org.telegram.ui.Cells.h0 h0Var = this.V0;
                        if (h0Var != null) {
                            h0Var.setTwoSided(true);
                        }
                        if (this.n1 < 0.0f) {
                            this.z0.getImageReceiver().m0(((org.telegram.ui.Components.la0) this.z0.getBackground()).k);
                        }
                    } else {
                        this.z0.getImageReceiver().m0(null);
                        org.telegram.ui.Cells.h0 h0Var2 = this.V0;
                        if (h0Var2 != null) {
                            h0Var2.setTwoSided(false);
                        }
                    }
                    org.telegram.ui.Cells.h0 h0Var3 = this.V0;
                    if (h0Var3 != null) {
                        h0Var3.setProgress(this.n1);
                    }
                }
                if (this.L0 != null) {
                    int i21 = 0;
                    while (true) {
                        org.telegram.ui.Components.o61[] o61VarArr = this.L0;
                        if (i21 >= o61VarArr.length) {
                            break;
                        }
                        o61VarArr[i21].b(0, E0);
                        this.L0[i21].b(1, E02);
                        this.L0[i21].b(2, E03);
                        this.L0[i21].b(3, E04);
                        i21++;
                    }
                }
                ImageView imageView = this.H0;
                l61 l61Var = this.a;
                if (imageView != null) {
                    org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.Wc, l61Var, PorterDuff.Mode.MULTIPLY);
                }
                ImageView imageView2 = this.I0;
                if (imageView2 != null) {
                    org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.Wc, l61Var, PorterDuff.Mode.MULTIPLY);
                }
                a1();
            }
        }
        this.F1 = false;
    }

    @Override // org.telegram.messenger.x5
    public final int getObserverTag() {
        return this.v1;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.ActionBar.e6 getResourceProvider() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        return this.N1 ? X0() : super.getThemeDescriptions();
    }

    public final void h1(long j10) {
        this.L1 = j10;
        this.M1 = j10 == 0 || j10 == getUserConfig().e();
    }

    public final void i1(org.telegram.ui.Cells.t0 t0Var) {
        float f10;
        if (this.z0 == null) {
            return;
        }
        Bitmap bitmap = this.a.i;
        if (bitmap != null) {
            float width = bitmap.getWidth();
            f10 = ((this.z0.getMeasuredWidth() - (Math.max(this.z0.getMeasuredWidth() / width, this.z0.getMeasuredHeight() / r0.i.getHeight()) * width)) / 2.0f) + this.Z1 + 0.0f;
        } else {
            f10 = this.Z1 + 0.0f;
        }
        float y9 = t0Var.getY() - ((-this.z0.K) + 0.0f);
        int measuredHeight = this.z0.getMeasuredHeight();
        float f11 = this.O1 ? this.p1 * this.q1 : 0.0f;
        t0Var.x0 = true;
        t0Var.w0 = measuredHeight;
        t0Var.u0 = y9;
        t0Var.v0 = f10;
        t0Var.c2 = f11;
        t0Var.d2.setColor(i0.a.o(-16777216, (int) (f11 * 255.0f)));
        t0Var.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.b != 2) {
            return false;
        }
        if (!this.c2 || motionEvent == null) {
            return true;
        }
        return motionEvent.getY() <= ((float) (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m));
    }

    public final void j1() {
        if (this.v0 == null || this.M0 == null || this.w.g == 0) {
            return;
        }
        SharedPreferences e12 = org.telegram.messenger.hp.e1();
        if (e12.getBoolean("bganimationhint", false)) {
            return;
        }
        if (this.C0 == null) {
            org.telegram.ui.Components.u20 u20Var = new org.telegram.ui.Components.u20(getParentActivity(), 8);
            this.C0 = u20Var;
            u20Var.setShowingDuration(5000L);
            this.C0.setAlpha(0.0f);
            this.C0.setVisibility(4);
            this.C0.setText(org.telegram.messenger.bd.M0(2131753751, null));
            this.C0.setExtraTranslationY(org.telegram.messenger.g0.L(6.0f));
            this.m0.addView(this.C0, b8.mf.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
        org.telegram.messenger.g0.i3(new qv0(19, this, e12), 500L);
    }

    public final void k1(int i3, boolean z10, boolean z11) {
        int indexOf;
        boolean z12 = z10 && i3 == 1 && this.Y0 != null;
        int i10 = this.b;
        if (z10) {
            if (i3 != 0) {
                this.Z0 = this.Y0;
                this.o1 = this.n1;
                this.S0.f();
                ArrayList arrayList = this.W0;
                if (arrayList != null) {
                    TLRPC.TL_wallPaper tL_wallPaper = this.Y0;
                    if (tL_wallPaper == null) {
                        indexOf = 0;
                    } else {
                        indexOf = arrayList.indexOf(tL_wallPaper) + (i10 == 2 ? 1 : 0);
                    }
                    this.T0.h1(indexOf, (this.R0.getMeasuredWidth() - org.telegram.messenger.g0.L(124.0f)) / 2);
                }
            } else if (i10 == 2) {
                this.c1 = this.b1;
                int i11 = this.d1;
                this.g1 = i11;
                int i12 = this.e1;
                this.h1 = i12;
                int i13 = this.f1;
                this.i1 = i13;
                this.k1 = this.Q;
                this.X.f(0, 4, i13 != 0 ? 4 : i12 != 0 ? 3 : i11 != 0 ? 2 : 1, false);
                this.X.e(this.f1, 3);
                this.X.e(this.e1, 2);
                this.X.e(this.d1, 1);
                this.X.e(this.b1, 0);
            }
        }
        if (i10 == 1 || i10 == 2) {
            this.L0[z12 ? (char) 2 : (char) 0].setVisibility(0);
        }
        if (i3 == 1) {
            org.telegram.ui.Cells.h0 h0Var = this.V0;
            if (!h0Var.N) {
                float f10 = this.n1;
                if (f10 < 0.0f) {
                    float f11 = -f10;
                    this.n1 = f11;
                    h0Var.setProgress(f11);
                }
            }
        }
        FrameLayout[] frameLayoutArr = this.N0;
        if (!z11) {
            char c2 = i3 == 0 ? (char) 1 : (char) 0;
            if (z10) {
                frameLayoutArr[i3].setVisibility(0);
                if (i10 == 1) {
                    this.w0.setTranslationY(i3 == 1 ? -org.telegram.messenger.g0.L(21.0f) : 0.0f);
                    this.L0[2].setAlpha(z12 ? 1.0f : 0.0f);
                    this.L0[0].setAlpha(z12 ? 0.0f : 1.0f);
                    if (i3 == 1) {
                        frameLayoutArr[i3].setAlpha(1.0f);
                    } else {
                        frameLayoutArr[i3].setAlpha(1.0f);
                        frameLayoutArr[c2].setAlpha(0.0f);
                    }
                    org.telegram.messenger.g0.v1(this.X.F[1]);
                } else if (i10 == 2) {
                    this.w0.setTranslationY(org.telegram.messenger.g0.L((this.C1 == null ? 0 : 58) + 72) + (-org.telegram.messenger.g0.L(i3 == 0 ? 343.0f : 316.0f)) + (Z0() ? org.telegram.messenger.g0.n : 0));
                    this.L0[2].setAlpha(z12 ? 1.0f : 0.0f);
                    this.L0[0].setAlpha(z12 ? 0.0f : 1.0f);
                    if (frameLayoutArr[c2].getVisibility() == 0) {
                        frameLayoutArr[c2].setAlpha(0.0f);
                        frameLayoutArr[i3].setAlpha(1.0f);
                        frameLayoutArr[i3].setTranslationY(0.0f);
                    } else {
                        frameLayoutArr[i3].setTranslationY(0.0f);
                    }
                } else {
                    if (i3 == 1) {
                        frameLayoutArr[i3].setAlpha(1.0f);
                    } else {
                        frameLayoutArr[i3].setAlpha(1.0f);
                        frameLayoutArr[c2].setAlpha(0.0f);
                    }
                    org.telegram.messenger.g0.v1(this.X.F[1]);
                }
            } else {
                this.w0.setTranslationY(0.0f);
                frameLayoutArr[i3].setTranslationY(r9.getMeasuredHeight());
                this.L0[0].setAlpha(1.0f);
                this.L0[2].setAlpha(1.0f);
                this.z0.setAlpha(1.0f);
            }
            if (z10 && frameLayoutArr[c2].getVisibility() == 0) {
                frameLayoutArr[c2].setAlpha(1.0f);
                frameLayoutArr[c2].setVisibility(4);
            } else if (!z10) {
                frameLayoutArr[i3].setVisibility(4);
            }
            if (i10 == 1 || i10 == 2) {
                this.L0[z12 ? (char) 0 : (char) 2].setVisibility(4);
                return;
            } else {
                if (i3 == 1) {
                    frameLayoutArr[c2].setAlpha(0.0f);
                    return;
                }
                return;
            }
        }
        this.t1 = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        int i14 = i3 == 0 ? 1 : 0;
        if (z10) {
            frameLayoutArr[i3].setVisibility(0);
            if (i10 == 1) {
                arrayList2.add(ObjectAnimator.ofFloat(this.w0, (Property<g61, Float>) View.TRANSLATION_Y, i3 == 1 ? -org.telegram.messenger.g0.L(21.0f) : 0.0f));
                org.telegram.ui.Components.o61 o61Var = this.L0[2];
                Property property = View.ALPHA;
                arrayList2.add(ObjectAnimator.ofFloat(o61Var, (Property<org.telegram.ui.Components.o61, Float>) property, z12 ? 1.0f : 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.L0[0], (Property<org.telegram.ui.Components.o61, Float>) property, z12 ? 0.0f : 1.0f));
                if (i3 == 1) {
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i3], (Property<FrameLayout, Float>) property, 0.0f, 1.0f));
                } else {
                    frameLayoutArr[i3].setAlpha(1.0f);
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i14], (Property<FrameLayout, Float>) property, 0.0f));
                }
                org.telegram.messenger.g0.v1(this.X.F[1]);
            } else if (i10 == 2) {
                g61 g61Var = this.w0;
                Property property2 = View.TRANSLATION_Y;
                arrayList2.add(ObjectAnimator.ofFloat(g61Var, (Property<g61, Float>) property2, org.telegram.messenger.g0.L((this.C1 == null ? 0 : 58) + 72) + (-frameLayoutArr[i3].getMeasuredHeight()) + (Z0() ? org.telegram.messenger.g0.n : 0)));
                org.telegram.ui.Components.o61 o61Var2 = this.L0[2];
                Property property3 = View.ALPHA;
                arrayList2.add(ObjectAnimator.ofFloat(o61Var2, (Property<org.telegram.ui.Components.o61, Float>) property3, z12 ? 1.0f : 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.L0[0], (Property<org.telegram.ui.Components.o61, Float>) property3, z12 ? 0.0f : 1.0f));
                if (frameLayoutArr[i14].getVisibility() == 0) {
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i14], (Property<FrameLayout, Float>) property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i3], (Property<FrameLayout, Float>) property3, 0.0f, 1.0f));
                    frameLayoutArr[i3].setTranslationY(0.0f);
                } else {
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i3], (Property<FrameLayout, Float>) property2, r6.getMeasuredHeight(), 0.0f));
                }
            } else {
                if (i3 == 1) {
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i3], (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
                } else {
                    frameLayoutArr[i3].setAlpha(1.0f);
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i14], (Property<FrameLayout, Float>) View.ALPHA, 0.0f));
                }
                org.telegram.messenger.g0.v1(this.X.F[1]);
            }
        } else {
            g61 g61Var2 = this.w0;
            Property property4 = View.TRANSLATION_Y;
            arrayList2.add(ObjectAnimator.ofFloat(g61Var2, (Property<g61, Float>) property4, 0.0f));
            arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i3], (Property<FrameLayout, Float>) property4, r6.getMeasuredHeight()));
            org.telegram.ui.Components.o61 o61Var3 = this.L0[0];
            Property property5 = View.ALPHA;
            arrayList2.add(ObjectAnimator.ofFloat(o61Var3, (Property<org.telegram.ui.Components.o61, Float>) property5, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(this.L0[2], (Property<org.telegram.ui.Components.o61, Float>) property5, 0.0f));
            arrayList2.add(ObjectAnimator.ofFloat(this.z0, (Property<b71, Float>) property5, 1.0f));
        }
        this.t1.playTogether(arrayList2);
        this.t1.addListener(new t61(this, z10, i14, i3, z12));
        this.t1.setInterpolator(org.telegram.ui.Components.xq.g);
        this.t1.setDuration(200L);
        this.t1.start();
    }

    public final void l1() {
        if (this.j2 != null) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) (Z0() ? this.parentLayout.getBottomSheet().getWindow() : getParentActivity().getWindow()).getDecorView();
        Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        this.Q1.setAlpha(0.0f);
        frameLayout.draw(canvas);
        this.Q1.setAlpha(1.0f);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        paint2.setFilterBitmap(true);
        int i3 = 2;
        int[] iArr = new int[2];
        this.Q1.getLocationInWindow(iArr);
        float f10 = iArr[0];
        float f11 = iArr[1];
        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.n;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        ac acVar = new ac(this, getParentActivity(), canvas, (this.Q1.getMeasuredWidth() / 2.0f) + f10, (this.Q1.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 2);
        this.j2 = acVar;
        acVar.setOnTouchListener(new fi.a(i3));
        this.k2 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.l2 = ofFloat;
        ofFloat.addUpdateListener(new gi.ea(this, 3));
        this.l2.addListener(new q61(this, 4));
        this.l2.setDuration(400L);
        this.l2.setInterpolator(org.telegram.ui.Components.ks.e);
        this.l2.start();
        frameLayout.addView(this.j2, new ViewGroup.LayoutParams(-1, -1));
        org.telegram.messenger.g0.h3(new y51(this, i3));
    }

    public final void m1(boolean z10) {
        long j10 = this.L1;
        if (j10 > 0) {
            this.B1.d(org.telegram.messenger.bd.M0(2131754212, null));
            return;
        }
        if (j10 >= 0) {
            this.B1.d(org.telegram.messenger.bd.M0(2131754214, null));
            return;
        }
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-this.L1));
        int i3 = 1;
        if (M0 == null) {
            this.B1.d(org.telegram.messenger.bd.a0(null, null, 2131754213, org.telegram.messenger.bd.M0(2131754904, null).toLowerCase()));
            return;
        }
        this.B1.d(org.telegram.messenger.bd.a0(null, null, 2131754213, M0.title));
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X1;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < W0()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
            if (this.s1 == null) {
                org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(R.drawable.mini_switch_lock, 0);
                this.s1 = wpVar;
                wpVar.n = 1;
            }
            spannableStringBuilder.setSpan(this.s1, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) org.telegram.messenger.bd.G(W0(), "ReactionLevelRequiredBtn", new Object[0]));
            this.B1.c(spannableStringBuilder, z10);
            return;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.X1;
        if (tL_premium_boostsStatus2 != null) {
            this.B1.c(null, z10);
            return;
        }
        if (this.L1 >= 0 || this.V1 || this.W1 || tL_premium_boostsStatus2 != null) {
            return;
        }
        this.V1 = true;
        getMessagesController().G0().a(this.L1, new b61(this, i3));
    }

    public final void n1() {
        if (this.H1 && this.y1 == null) {
            Bitmap bitmap = this.E1;
            if (bitmap != null) {
                this.z1 = bitmap;
                this.y1 = Utilities.e(bitmap);
            } else {
                ImageReceiver imageReceiver = this.z0.getImageReceiver();
                if (imageReceiver.L() || imageReceiver.n0 != null) {
                    this.z1 = imageReceiver.n();
                    this.y1 = Utilities.e(imageReceiver.n());
                }
            }
        }
        if (!this.H1) {
            g1(false);
            return;
        }
        Bitmap bitmap2 = this.y1;
        if (bitmap2 != null) {
            this.z0.setImageBitmap(bitmap2);
        }
    }

    public final void o1() {
        File A;
        String name;
        int i3;
        long j10;
        File file;
        String str;
        FrameLayout frameLayout;
        Object obj = this.Y0;
        if (obj == null) {
            obj = this.D1;
        }
        boolean z10 = obj instanceof TLRPC.TL_wallPaper;
        if (z10 || (obj instanceof org.telegram.messenger.bf)) {
            if (z10) {
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
                str = org.telegram.messenger.w7.r(null, tL_wallPaper.document);
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                org.telegram.messenger.w7.G(this.currentAccount);
                file = org.telegram.messenger.w7.K(tL_wallPaper.document, null, true, true);
                j10 = tL_wallPaper.document.size;
            } else {
                org.telegram.messenger.bf bfVar = (org.telegram.messenger.bf) obj;
                TLRPC.Photo photo = bfVar.K;
                if (photo != null) {
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, this.J1, true, null, false);
                    org.telegram.messenger.w7.G(this.currentAccount);
                    A = org.telegram.messenger.w7.K(w10, null, true, true);
                    name = org.telegram.messenger.w7.r(null, w10);
                    i3 = w10.size;
                } else {
                    A = org.telegram.messenger.zb.A(bfVar.C);
                    name = A.getName();
                    i3 = bfVar.G;
                }
                j10 = i3;
                String str2 = name;
                file = A;
                str = str2;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
            }
            boolean exists = file.exists();
            int i10 = this.b;
            if (exists) {
                org.telegram.messenger.z5.q(this.currentAccount).v(this);
                this.z0.invalidate();
                if (i10 == 2) {
                    if (j10 == 0 || this.L1 != 0) {
                        this.u0.setSubtitle(null);
                    } else {
                        this.u0.setSubtitle(org.telegram.messenger.g0.i0(j10, false, false));
                    }
                }
            } else {
                org.telegram.messenger.z5.q(this.currentAccount).a(str, null, this);
                if (i10 == 2 && this.L1 == 0) {
                    this.u0.setSubtitle(org.telegram.messenger.bd.M0(2131748786, null));
                }
                this.z0.invalidate();
            }
            if (this.Y0 == null && (frameLayout = this.A0) != null) {
                frameLayout.setAlpha(exists ? 1.0f : 0.5f);
            }
            if (i10 == 0) {
                this.e0.setEnabled(exists);
                this.e0.setAlpha(exists ? 1.0f : 0.5f);
                return;
            }
            if (i10 != 2) {
                this.f.setEnabled(exists);
                this.f.setAlpha(exists ? 1.0f : 0.5f);
                return;
            }
            this.E0.setEnabled(exists);
            c71 c71Var = this.B1;
            if (c71Var != null) {
                c71Var.setAlpha(exists ? 1.0f : 0.5f);
            }
            c71 c71Var2 = this.C1;
            if (c71Var2 != null) {
                c71Var2.setAlpha(exists ? 1.0f : 0.5f);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onBackPressed(boolean z10) {
        if (!U0(z10)) {
            return false;
        }
        S0(true);
        return super.onBackPressed(z10);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onBottomSheetCreated() {
        super.onBottomSheetCreated();
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var == null || q4Var.getBottomSheet() == null) {
            return;
        }
        this.parentLayout.getBottomSheet().O(getThemedColor(org.telegram.ui.ActionBar.k6.h5));
        if (this.b != 2 || this.L1 == 0) {
            return;
        }
        this.parentLayout.getBottomSheet().E0(-16777216);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.p3);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.i4);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.j4);
        getNotificationCenter().c(this, org.telegram.messenger.hs.u5);
        int i3 = this.b;
        if (i3 == 1 || i3 == 0) {
            org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.z4);
        }
        if (i3 == 2 || i3 == 1) {
            org.telegram.ui.ActionBar.k6.N = true;
        }
        if (i3 == 0 && this.w == null) {
            this.G1 = org.telegram.ui.ActionBar.k6.i0;
        } else {
            Point point = org.telegram.messenger.g0.q;
            int min = Math.min(point.x, point.y);
            int max = Math.max(point.x, point.y);
            StringBuilder sb2 = new StringBuilder();
            sb2.append((int) (min / org.telegram.messenger.g0.p));
            sb2.append("_");
            this.I1 = a1.g.o((int) (max / org.telegram.messenger.g0.p), "_f", sb2);
            this.J1 = Math.max(point.x, point.y);
            org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f4);
            org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.e4);
            this.v1 = org.telegram.messenger.z5.q(this.currentAccount).k();
            if (this.W0 == null) {
                this.W0 = new ArrayList();
                org.telegram.messenger.qr.a0(this.currentAccount).p0();
            }
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.p3);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.i4);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.j4);
        getNotificationCenter().n(this, org.telegram.messenger.hs.u5);
        n61 n61Var = this.m0;
        if (n61Var != null && this.S != null) {
            n61Var.getViewTreeObserver().removeOnGlobalLayoutListener(this.S);
        }
        int i3 = this.b;
        if ((i3 == 2 || i3 == 1) && this.r1 == null) {
            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.go(29));
        }
        int i10 = org.telegram.messenger.hs.z4;
        if (i3 == 2) {
            Bitmap bitmap = this.y1;
            if (bitmap != null) {
                bitmap.recycle();
                this.y1 = null;
            }
            this.a.k(null, null, null);
            org.telegram.messenger.hs.e().k(i10, new Object[0]);
        } else if (i3 == 1 || i3 == 0) {
            org.telegram.messenger.hs.e().n(this, i10);
        }
        if (i3 != 0 || this.w != null) {
            org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f4);
            org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.e4);
        }
        super.onFragmentDestroy();
        T0(null);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onPause() {
        super.onPause();
        if (this.G1) {
            this.x1.c(false);
        }
        org.telegram.ui.ActionBar.k6.b = false;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        n4 n4Var = this.q0;
        if (n4Var != null) {
            n4Var.f();
        }
        h71 h71Var = this.x0;
        if (h71Var != null) {
            h71Var.f();
        }
        if (this.G1) {
            this.x1.c(true);
        }
        org.telegram.ui.ActionBar.k6.b = true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            V0();
            try {
                b5.l lVar = this.l0;
                if (lVar != null) {
                    org.telegram.messenger.g0.C3(lVar, getThemedColor(org.telegram.ui.ActionBar.k6.s8));
                }
                org.telegram.ui.Cells.h0 h0Var = this.V0;
                if (h0Var != null) {
                    h0Var.setOuterColor(getThemedColor(org.telegram.ui.ActionBar.k6.Jj));
                    this.V0.invalidate();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        if (z10 || this.b != 2) {
            return;
        }
        this.a.k(null, null, null);
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.z4, new Object[0]);
    }

    public final void p1() {
        this.z0.getImageReceiver().setAlpha(Math.abs(this.n1));
        this.z0.invalidate();
        this.R0.g1();
        if (this.n1 >= 0.0f) {
            this.z0.getImageReceiver().m0(null);
        } else {
            if (Build.VERSION.SDK_INT >= 29) {
                this.z0.getImageReceiver().Z(null);
            }
            if (this.z0.getBackground() instanceof org.telegram.ui.Components.la0) {
                this.z0.getImageReceiver().m0(((org.telegram.ui.Components.la0) this.z0.getBackground()).k);
            }
        }
        this.a.k(this.z0.getBackground(), this.z0.getBackground(), Float.valueOf(this.n1));
        a1();
    }

    public final void q1() {
        int i3 = this.b;
        if (i3 == 1 || i3 == 2) {
            if (this.Y0 == null && (this.D1 instanceof kc1)) {
                this.L0[2].a(false, true);
            }
            this.L0[this.Y0 != null ? (char) 2 : (char) 0].setVisibility(0);
            AnimatorSet animatorSet = new AnimatorSet();
            org.telegram.ui.Components.o61 o61Var = this.L0[2];
            Property property = View.ALPHA;
            animatorSet.playTogether(ObjectAnimator.ofFloat(o61Var, (Property<org.telegram.ui.Components.o61, Float>) property, this.Y0 != null ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.L0[0], (Property<org.telegram.ui.Components.o61, Float>) property, this.Y0 != null ? 0.0f : 1.0f));
            animatorSet.addListener(new r61(this));
            animatorSet.setInterpolator(org.telegram.ui.Components.xq.g);
            animatorSet.setDuration(200L);
            animatorSet.start();
            return;
        }
        boolean isEnabled = this.L0[0].isEnabled();
        TLRPC.TL_wallPaper tL_wallPaper = this.Y0;
        if (isEnabled == (tL_wallPaper != null)) {
            return;
        }
        if (tL_wallPaper == null) {
            this.L0[0].a(false, true);
        }
        this.L0[0].setEnabled(this.Y0 != null);
        if (this.Y0 != null) {
            this.L0[0].setVisibility(0);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.L0[1].getLayoutParams();
        AnimatorSet animatorSet2 = new AnimatorSet();
        int L = (org.telegram.messenger.g0.L(9.0f) + layoutParams.width) / 2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.L0[0], (Property<org.telegram.ui.Components.o61, Float>) View.ALPHA, this.Y0 == null ? 0.0f : 1.0f));
        org.telegram.ui.Components.o61 o61Var2 = this.L0[0];
        Property property2 = View.TRANSLATION_X;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(o61Var2, (Property<org.telegram.ui.Components.o61, Float>) property2, this.Y0 != null ? 0.0f : L));
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.L0[1], (Property<org.telegram.ui.Components.o61, Float>) property2, this.Y0 == null ? -L : 0.0f));
        animatorSet2.setInterpolator(org.telegram.ui.Components.xq.g);
        animatorSet2.setDuration(200L);
        animatorSet2.addListener(new s61(this));
        animatorSet2.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x008d, code lost:
    
        if (r3 != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (r23.d1 != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r1(boolean z10) {
        int i3;
        int i10;
        char c2;
        float f10;
        int i11;
        j61 j61Var;
        boolean z11;
        int i12;
        BlendMode blendMode;
        int i13 = Build.VERSION.SDK_INT;
        int i14 = this.b;
        org.telegram.ui.ActionBar.g6 g6Var = this.w;
        if (i13 >= 29) {
            if (i14 == 0) {
                i12 = g6Var != null ? (int) g6Var.l : getThemedColor(org.telegram.ui.ActionBar.k6.De);
            } else if (i14 == 1) {
                i12 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.De);
                long j10 = g6Var.l;
                int i15 = (int) j10;
                if (i15 != 0 || j10 == 0) {
                    if (i15 != 0) {
                        i12 = i15;
                    }
                }
                i12 = 0;
            } else {
                if (this.D1 instanceof kc1) {
                    i12 = this.e1;
                }
                i12 = 0;
            }
            if (i12 == 0 || this.n1 < 0.0f) {
                this.z0.getImageReceiver().Z(null);
            } else {
                ImageReceiver imageReceiver = this.z0.getImageReceiver();
                blendMode = BlendMode.SOFT_LIGHT;
                imageReceiver.Z(blendMode);
            }
        }
        int i16 = 2;
        if (this.F0 != null) {
            if (i14 != 2) {
                if (i14 == 1) {
                    int E0 = org.telegram.ui.ActionBar.k6.E0(org.telegram.ui.ActionBar.k6.Ce);
                    long j11 = g6Var.k;
                    int i17 = (int) j11;
                    if (i17 == 0 && j11 != 0) {
                        E0 = 0;
                    } else if (i17 != 0) {
                        E0 = i17;
                    }
                }
                z11 = false;
            }
            boolean z12 = this.F0.getTag() != null;
            this.F0.setTag(z11 ? 1 : null);
            if (z12 != z11) {
                if (z11) {
                    this.F0.setVisibility(0);
                }
                AnimatorSet animatorSet = this.J0;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                if (z10) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.J0 = animatorSet2;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.F0, (Property<j61, Float>) View.ALPHA, z11 ? 1.0f : 0.0f);
                    c2 = 4;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.F0, (Property<j61, Float>) View.SCALE_X, z11 ? 1.0f : 0.0f);
                    f10 = 1.0f;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.F0, (Property<j61, Float>) View.SCALE_Y, z11 ? 1.0f : 0.0f);
                    org.telegram.ui.Components.o61 o61Var = this.L0[0];
                    Property property = View.TRANSLATION_X;
                    i10 = 3;
                    i11 = 5;
                    i3 = 0;
                    animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(o61Var, (Property<org.telegram.ui.Components.o61, Float>) property, z11 ? org.telegram.messenger.g0.L(34.0f) : 0.0f), ObjectAnimator.ofFloat(this.L0[1], (Property<org.telegram.ui.Components.o61, Float>) property, z11 ? -org.telegram.messenger.g0.L(34.0f) : 0.0f), ObjectAnimator.ofFloat(this.L0[2], (Property<org.telegram.ui.Components.o61, Float>) property, z11 ? org.telegram.messenger.g0.L(34.0f) : 0.0f));
                    this.J0.setDuration(180L);
                    this.J0.addListener(new q61(this, i16));
                    this.J0.setInterpolator(org.telegram.ui.Components.xq.g);
                    this.J0.start();
                } else {
                    i3 = 0;
                    i10 = 3;
                    c2 = 4;
                    f10 = 1.0f;
                    i11 = 5;
                    this.F0.setAlpha(z11 ? 1.0f : 0.0f);
                    this.F0.setScaleX(z11 ? 1.0f : 0.0f);
                    this.F0.setScaleY(z11 ? 1.0f : 0.0f);
                    this.L0[0].setTranslationX(z11 ? org.telegram.messenger.g0.L(34.0f) : 0.0f);
                    this.L0[1].setTranslationX(z11 ? -org.telegram.messenger.g0.L(34.0f) : 0.0f);
                    this.L0[2].setTranslationX(z11 ? org.telegram.messenger.g0.L(34.0f) : 0.0f);
                }
                j61Var = this.G0;
                if (j61Var == null) {
                    int i18 = j61Var.getTag() != null ? 1 : i3;
                    this.G0.setTag(1);
                    if (i18 != 1) {
                        this.G0.setVisibility(i3);
                        AnimatorSet animatorSet3 = this.K0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        if (!z10) {
                            float f11 = f10;
                            this.G0.setAlpha(f11);
                            this.G0.setScaleX(f11);
                            this.G0.setScaleY(f11);
                            this.M0[0].setTranslationX(-org.telegram.messenger.g0.L(34.0f));
                            this.M0[1].setTranslationX(org.telegram.messenger.g0.L(34.0f));
                            return;
                        }
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        this.K0 = animatorSet4;
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.G0, (Property<j61, Float>) View.ALPHA, f10);
                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.G0, (Property<j61, Float>) View.SCALE_X, f10);
                        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.G0, (Property<j61, Float>) View.SCALE_Y, f10);
                        org.telegram.ui.Components.o61 o61Var2 = this.M0[0];
                        Property property2 = View.TRANSLATION_X;
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(o61Var2, (Property<org.telegram.ui.Components.o61, Float>) property2, -org.telegram.messenger.g0.L(34.0f));
                        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.M0[1], (Property<org.telegram.ui.Components.o61, Float>) property2, org.telegram.messenger.g0.L(34.0f));
                        Animator[] animatorArr = new Animator[i11];
                        animatorArr[0] = ofFloat4;
                        animatorArr[1] = ofFloat5;
                        animatorArr[2] = ofFloat6;
                        animatorArr[i10] = ofFloat7;
                        animatorArr[c2] = ofFloat8;
                        animatorSet4.playTogether(animatorArr);
                        this.K0.setDuration(180L);
                        this.K0.addListener(new q61(this, i10));
                        this.K0.setInterpolator(org.telegram.ui.Components.xq.g);
                        this.K0.start();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        i3 = 0;
        i10 = 3;
        c2 = 4;
        f10 = 1.0f;
        i11 = 5;
        j61Var = this.G0;
        if (j61Var == null) {
        }
    }

    public final void s1() {
        int childCount = this.R0.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.R0.getChildAt(i3);
            if (childAt instanceof org.telegram.ui.Cells.i5) {
                ((org.telegram.ui.Cells.i5) childAt).w(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void setResourceProvider(org.telegram.ui.ActionBar.e6 e6Var) {
        this.a.a = e6Var;
    }

    public l71(org.telegram.ui.ActionBar.j6 j6Var, boolean z10, int i3, boolean z11, boolean z12) {
        super(null);
        this.a = new l61(this);
        this.d = true;
        this.n = 1;
        org.telegram.ui.ActionBar.p5 p5Var = new org.telegram.ui.ActionBar.p5(this, 0, false);
        this.T = p5Var;
        org.telegram.ui.ActionBar.p5 p5Var2 = new org.telegram.ui.ActionBar.p5(this, 0, true);
        this.U = p5Var2;
        org.telegram.ui.ActionBar.p5 p5Var3 = new org.telegram.ui.ActionBar.p5(this, 1, false);
        this.V = p5Var3;
        org.telegram.ui.ActionBar.p5 p5Var4 = new org.telegram.ui.ActionBar.p5(this, 1, true);
        this.W = p5Var4;
        this.Z = -1;
        this.a0 = new y51(this, 0);
        this.y0 = new b71[2];
        this.N0 = new FrameLayout[2];
        this.O0 = new TextView[2];
        this.P0 = new TextView[2];
        this.Q0 = new FrameLayout[2];
        this.X0 = new HashMap();
        this.n1 = 0.5f;
        this.p1 = 0.0f;
        this.u1 = PorterDuff.Mode.SRC_IN;
        this.A1 = 1.0f;
        this.I1 = "640_360";
        this.J1 = 1920;
        this.M1 = true;
        this.U1 = new org.telegram.ui.Components.v00(getParentActivity(), new o61(this));
        this.V1 = false;
        this.W1 = false;
        this.b = i3;
        this.h0 = z12;
        this.g0 = j6Var;
        this.j0 = z10;
        this.i0 = z11;
        if (i3 == 1) {
            org.telegram.ui.ActionBar.g6 k10 = j6Var.k(!z11);
            this.w = k10;
            if (k10 != null) {
                this.d = false;
                this.y = k10.c;
                this.E = k10.d;
                this.F = k10.e;
                this.G = k10.f;
                this.H = k10.g;
                this.I = k10.h;
                this.J = k10.i;
                this.K = k10.j;
                this.L = k10.k;
                this.M = k10.l;
                this.N = k10.m;
                this.O = k10.p;
                this.P = k10.o;
                this.Q = k10.n;
            }
        } else {
            if (i3 == 0) {
                this.d = false;
            }
            org.telegram.ui.ActionBar.g6 k11 = j6Var.k(false);
            this.w = k11;
            if (k11 != null) {
                this.Y0 = k11.s;
            }
        }
        org.telegram.ui.ActionBar.g6 g6Var = this.w;
        if (g6Var != null) {
            this.G1 = g6Var.q;
            if (!TextUtils.isEmpty(g6Var.o)) {
                this.n1 = this.w.p;
            }
            org.telegram.ui.ActionBar.k6.M = org.telegram.ui.ActionBar.k6.D0();
            org.telegram.ui.ActionBar.k6.O = true;
            org.telegram.ui.ActionBar.k6.P = true;
            org.telegram.ui.ActionBar.k6.u(j6Var, false, false);
        }
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.u4, new Object[0]);
        p5Var.v = true;
        p5Var3.v = true;
        p5Var2.v = true;
        p5Var4.v = true;
    }

    @Override // org.telegram.messenger.x5
    public final void i(long j10, long j11) {
    }

    @Override // org.telegram.messenger.x5
    public final void o(long j10, long j11) {
    }

    public l71(org.telegram.ui.ActionBar.j6 j6Var) {
        this(j6Var, false, 0, false, false);
    }
}
