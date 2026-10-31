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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class m91 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.z5, org.telegram.messenger.us {
    public FrameLayout A0;
    public d91 A1;
    public org.telegram.ui.Components.q30 B0;
    public d91 B1;
    public AnimatorSet C0;
    public Object C1;
    public final int D;
    public ig.s D0;
    public Bitmap D1;
    public final int E;
    public l81 E0;
    public boolean E1;
    public final int F;
    public l81 F0;
    public boolean F1;
    public final int G;
    public ImageView G0;
    public boolean G1;
    public final int H;
    public ImageView H0;
    public String H1;
    public final boolean I;
    public AnimatorSet I0;
    public int I1;
    public final long J;
    public AnimatorSet J0;
    public l91 J1;
    public final long K;
    public org.telegram.ui.Components.x71[] K0;
    public long K1;
    public final long L;
    public org.telegram.ui.Components.x71[] L0;
    public boolean L1;
    public final long M;
    public final FrameLayout[] M0;
    public boolean M1;
    public final float N;
    public final TextView[] N0;
    public boolean N1;
    public final String O;
    public final TextView[] O0;
    public org.telegram.ui.Components.bi0 O1;
    public final int P;
    public final FrameLayout[] P0;
    public org.telegram.ui.ActionBar.t0 P1;
    public long Q;
    public w71 Q0;
    public ValueAnimator Q1;
    public z80 R;
    public k91 R0;
    public jg.b1 R1;
    public final org.telegram.ui.ActionBar.a6 S;
    public s4.a0 S0;
    public k81 S1;
    public final org.telegram.ui.ActionBar.a6 T;
    public org.telegram.ui.Cells.p4 T0;
    public final org.telegram.ui.Components.p10 T1;
    public final org.telegram.ui.ActionBar.a6 U;
    public org.telegram.ui.Cells.h0 U0;
    public boolean U1;
    public final org.telegram.ui.ActionBar.a6 V;
    public ArrayList V0;
    public boolean V1;
    public org.telegram.ui.Components.cq W;
    public final HashMap W0;
    public TL_stories.TL_premium_boostsStatus W1;
    public int X;
    public TLRPC.TL_wallPaper X0;
    public float X1;
    public int Y;
    public TLRPC.TL_wallPaper Y0;
    public float Y1;
    public final Runnable Z;
    public TLRPC.TL_wallPaper Z0;
    public float Z1;
    public final n81 a;
    public boolean a0;
    public int a1;
    public float a2;
    public final int b;
    public kg.f0 b0;
    public int b1;
    public boolean b2;
    public Scroller c;
    public FrameLayout c0;
    public int c1;
    public int c2;
    public final boolean d;
    public TextView d0;
    public int d1;
    public ValueAnimator d2;
    public org.telegram.ui.Components.tl e;
    public TextView e0;
    public int e1;
    public boolean e2;
    public org.telegram.ui.ActionBar.t0 f;
    public final org.telegram.ui.ActionBar.s6 f0;
    public int f1;
    public TextView f2;
    public final boolean g0;
    public int g1;
    public WeakReference g2;
    public TextView h;
    public final boolean h0;
    public int h1;
    public BitmapDrawable h2;
    public final boolean i0;
    public int i1;
    public ic i2;
    public ArrayList j0;
    public int j1;
    public float j2;
    public z4.g k0;
    public int k1;
    public ValueAnimator k2;
    public fg.i l0;
    public int l1;
    public UndoView m0;
    public float m1;
    public int n;
    public FrameLayout n0;
    public float n1;
    public org.telegram.ui.Components.tk0 o0;
    public float o1;
    public fg.j p0;
    public float p1;
    public org.telegram.ui.Components.f10 q0;
    public e91 q1;
    public Drawable r;
    public org.telegram.messenger.jj r0;
    public org.telegram.ui.Components.dq r1;
    public int s;
    public boolean s0;
    public AnimatorSet s1;
    public org.telegram.ui.ActionBar.l t0;
    public final PorterDuff.Mode t1;
    public org.telegram.ui.ActionBar.m0 u0;
    public int u1;
    public i81 v0;
    public org.telegram.ui.Components.a9 v1;
    public final org.telegram.ui.ActionBar.r6 w;
    public i91 w0;
    public org.telegram.ui.Components.z71 w1;
    public boolean x;
    public final c91[] x0;
    public Bitmap x1;
    public final int y;
    public c91 y0;
    public Bitmap y1;
    public FrameLayout z0;
    public float z1;

    public m91(Object obj, Bitmap bitmap, boolean z10) {
        super(null);
        this.a = new n81(this);
        this.d = true;
        this.n = 1;
        org.telegram.ui.ActionBar.a6 a6Var = new org.telegram.ui.ActionBar.a6(this, 0, false);
        this.S = a6Var;
        org.telegram.ui.ActionBar.a6 a6Var2 = new org.telegram.ui.ActionBar.a6(this, 0, true);
        this.T = a6Var2;
        org.telegram.ui.ActionBar.a6 a6Var3 = new org.telegram.ui.ActionBar.a6(this, 1, false);
        this.U = a6Var3;
        org.telegram.ui.ActionBar.a6 a6Var4 = new org.telegram.ui.ActionBar.a6(this, 1, true);
        this.V = a6Var4;
        this.Y = -1;
        this.Z = new a81(this, 0);
        this.x0 = new c91[2];
        this.M0 = new FrameLayout[2];
        this.N0 = new TextView[2];
        this.O0 = new TextView[2];
        this.P0 = new FrameLayout[2];
        this.W0 = new HashMap();
        this.m1 = 0.5f;
        this.o1 = 0.0f;
        this.t1 = PorterDuff.Mode.SRC_IN;
        this.z1 = 1.0f;
        this.H1 = "640_360";
        this.I1 = 1920;
        this.L1 = true;
        this.T1 = new org.telegram.ui.Components.p10(getParentActivity(), new p81(this));
        this.U1 = false;
        this.V1 = false;
        this.b = 2;
        this.C1 = obj;
        this.D1 = bitmap;
        this.E1 = z10;
        if (obj instanceof me1) {
            me1 me1Var = (me1) obj;
            this.F1 = me1Var.j;
            TLRPC.TL_wallPaper tL_wallPaper = me1Var.g;
            this.X0 = tL_wallPaper;
            if (tL_wallPaper != null) {
                float f7 = me1Var.h;
                this.m1 = f7;
                if (f7 < 0.0f && !org.telegram.ui.ActionBar.t6.I.q()) {
                    this.m1 *= -1.0f;
                }
            }
        }
        a6Var.v = true;
        a6Var3.v = true;
        a6Var2.v = true;
        a6Var4.v = true;
    }

    public static void Y(m91 m91Var, org.telegram.messenger.h3 h3Var) {
        if (m91Var.getParentActivity() == null) {
            return;
        }
        kg.q0 q0Var = new kg.q0(23, m91Var.currentAccount, m91Var.getParentActivity(), m91Var, m91Var.a);
        q0Var.A1(h3Var);
        q0Var.z1(m91Var.W1, true);
        q0Var.B1(m91Var.K1);
        if (!m91Var.Y0()) {
            q0Var.I2 = new a81(m91Var, 1);
        }
        m91Var.showDialog(q0Var);
    }

    public static void Z(m91 m91Var) {
        org.telegram.ui.ActionBar.s6 s6Var = org.telegram.ui.ActionBar.t6.M;
        if (s6Var == null) {
            return;
        }
        int i10 = s6Var.Z;
        org.telegram.ui.ActionBar.r6 k10 = i10 >= 0 ? (org.telegram.ui.ActionBar.r6) s6Var.a0.get(i10) : s6Var.k(false);
        if (m91Var.w != null) {
            m91Var.a1();
            org.telegram.ui.ActionBar.t6.z1(m91Var.f0, true, false, false, false, false);
            if (org.telegram.ui.ActionBar.t6.M != null) {
                org.telegram.ui.ActionBar.t6.O = false;
                org.telegram.ui.ActionBar.t6.P = false;
                org.telegram.ui.ActionBar.t6.M = null;
            }
            org.telegram.ui.ActionBar.t6.u(m91Var.f0, true, m91Var.g0);
            ((ActionBarLayout) m91Var.parentLayout).W(false, false);
        } else {
            ((ActionBarLayout) m91Var.parentLayout).W(false, false);
            File file = new File(m91Var.f0.b);
            org.telegram.ui.ActionBar.s6 s6Var2 = m91Var.f0;
            org.telegram.ui.ActionBar.t6.v(file, s6Var2.a, s6Var2.F, false);
            org.telegram.messenger.vp.r1(m91Var.f0.E).u4(m91Var.f0, null, false, false);
            SharedPreferences.Editor edit = org.telegram.messenger.w0.b.getSharedPreferences("themeconfig", 0).edit();
            edit.putString("lastDayTheme", m91Var.f0.m());
            edit.commit();
        }
        org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) m91Var.getParentLayout().getFragmentStack().get(Math.max(0, m91Var.getParentLayout().getFragmentStack().size() - 2));
        m91Var.finishFragment();
        if (m91Var.b == 0) {
            org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.p4, s6Var, k10, Boolean.valueOf(m91Var.i0));
        }
        org.telegram.ui.ActionBar.t6.M1(k2Var);
    }

    public static /* synthetic */ void a0(m91 m91Var, TLObject tLObject) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        HashMap hashMap = m91Var.W0;
        org.telegram.ui.ActionBar.r6 r6Var = m91Var.w;
        if (tLObject instanceof TL_account.TL_wallPapers) {
            TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
            m91Var.V0.clear();
            hashMap.clear();
            int size = tL_wallPapers.wallpapers.size();
            boolean z10 = false;
            for (int i10 = 0; i10 < size; i10++) {
                if (tL_wallPapers.wallpapers.get(i10) instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) tL_wallPapers.wallpapers.get(i10);
                    if (tL_wallPaper2.pattern) {
                        TLRPC.Document document = tL_wallPaper2.document;
                        if (document != null && !hashMap.containsKey(Long.valueOf(document.id))) {
                            m91Var.V0.add(tL_wallPaper2);
                            hashMap.put(Long.valueOf(tL_wallPaper2.document.id), tL_wallPaper2);
                        }
                        if (r6Var != null && (str = r6Var.o) != null && str.equals(tL_wallPaper2.slug)) {
                            m91Var.X0 = tL_wallPaper2;
                            m91Var.f1(false);
                            m91Var.n1();
                        } else if (r6Var == null) {
                            TLRPC.TL_wallPaper tL_wallPaper3 = m91Var.X0;
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
            if (!z10 && (tL_wallPaper = m91Var.X0) != null) {
                m91Var.V0.add(0, tL_wallPaper);
            }
            k91 k91Var = m91Var.R0;
            if (k91Var != null) {
                k91Var.f();
            }
            org.telegram.messenger.hs.a0(m91Var.currentAccount).p1(1, tL_wallPapers.wallpapers);
        }
        if (m91Var.X0 != null || r6Var == null || TextUtils.isEmpty(r6Var.o)) {
            return;
        }
        TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
        TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
        tL_inputWallPaperSlug.slug = r6Var.o;
        getwallpaper.wallpaper = tL_inputWallPaperSlug;
        ConnectionsManager.getInstance(m91Var.currentAccount).bindRequestToGuid(m91Var.getConnectionsManager().sendRequest(getwallpaper, new g81(m91Var, 0)), m91Var.classGuid);
    }

    @Override // org.telegram.messenger.z5
    public final void C(boolean z10) {
        n1();
    }

    @Override // org.telegram.messenger.z5
    public final void M(String str) {
        n1();
    }

    public final void P0() {
        AnimatorSet animatorSet = this.C0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.C0 = animatorSet2;
        int i10 = 1;
        if (this.F1) {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.y0, (Property<c91, Float>) View.SCALE_X, this.z1), ObjectAnimator.ofFloat(this.y0, (Property<c91, Float>) View.SCALE_Y, this.z1));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.y0, (Property<c91, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.y0, (Property<c91, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.y0, (Property<c91, Float>) View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.y0, (Property<c91, Float>) View.TRANSLATION_Y, 0.0f));
        }
        this.C0.setInterpolator(org.telegram.ui.Components.gr.g);
        this.C0.addListener(new r81(this, i10));
        this.C0.start();
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
    public final void Q0(boolean z10) {
        int i10;
        boolean z11;
        File A;
        boolean z12;
        boolean z13;
        File file;
        Bitmap n10;
        Object obj;
        float f7;
        boolean z14;
        TLRPC.TL_wallPaper tL_wallPaper;
        File file2;
        String str;
        int i11;
        int i12;
        int i13;
        TLRPC.TL_wallPaper tL_wallPaper2;
        File A2;
        String str2;
        int i14;
        int i15;
        int i16;
        Object obj2;
        long j10;
        boolean z15;
        TLRPC.TL_wallPaper tL_wallPaper3;
        boolean z16;
        boolean z17;
        float f10;
        TLRPC.UserFull a2;
        int i17 = 2;
        if (this.K1 < 0) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.W1;
            if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < V0()) {
                getMessagesController().G0().b(this.K1, this.W1, new d81(this, i17));
                return;
            } else if (this.W1 == null) {
                return;
            }
        }
        if (!getUserConfig().q() && z10) {
            showDialog(new kg.i1((org.telegram.ui.ActionBar.k2) this, 22, true));
            return;
        }
        org.telegram.ui.ActionBar.s6 s6Var = org.telegram.ui.ActionBar.t6.I;
        String j11 = s6Var.j(null, this.G1);
        int i18 = 0;
        String j12 = this.G1 ? s6Var.j(null, false) : j11;
        File file3 = new File(org.telegram.messenger.w0.h(), j11);
        Object obj3 = this.C1;
        if (obj3 instanceof TLRPC.TL_wallPaper) {
            if (this.y1 != null) {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    this.y1.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                    fileOutputStream.close();
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            } else {
                ImageReceiver imageReceiver = this.y0.getImageReceiver();
                if (imageReceiver.L() || imageReceiver.m0 != null) {
                    Bitmap n11 = imageReceiver.n();
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file3);
                        n11.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream2);
                        fileOutputStream2.close();
                    } catch (Exception e7) {
                        org.telegram.messenger.f8.g(e7, true);
                    }
                }
                z12 = false;
                if (!z12) {
                    TLRPC.TL_wallPaper tL_wallPaper4 = (TLRPC.TL_wallPaper) this.C1;
                    org.telegram.messenger.b8.G(this.currentAccount);
                    try {
                        z12 = org.telegram.messenger.i0.E(org.telegram.messenger.b8.K(tL_wallPaper4.document, null, true, true), file3);
                    } catch (Exception e10) {
                        org.telegram.messenger.f8.g(e10, true);
                        z12 = false;
                    }
                }
                z13 = false;
                i10 = 4;
            }
            z12 = true;
            if (!z12) {
            }
            z13 = false;
            i10 = 4;
        } else if (obj3 instanceof me1) {
            if (this.X0 != null) {
                try {
                    n10 = this.y0.getImageReceiver().n();
                    i10 = 4;
                } catch (Throwable th2) {
                    th = th2;
                    i10 = 4;
                }
                try {
                    Bitmap createBitmap = Bitmap.createBitmap(n10.getWidth(), n10.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    if (this.d1 == 0) {
                        if (this.c1 != 0) {
                            GradientDrawable gradientDrawable = new GradientDrawable(org.telegram.ui.Components.f9.d(this.i1), new int[]{this.a1, this.c1});
                            gradientDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                            gradientDrawable.draw(canvas);
                        } else {
                            canvas.drawColor(this.a1);
                        }
                    }
                    Paint paint = new Paint(2);
                    paint.setColorFilter(new PorterDuffColorFilter(this.k1, this.t1));
                    paint.setAlpha((int) (Math.abs(this.m1) * 255.0f));
                    canvas.drawBitmap(n10, 0.0f, 0.0f, paint);
                    FileOutputStream fileOutputStream3 = new FileOutputStream(file3);
                    if (this.d1 != 0) {
                        createBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream3);
                    } else {
                        createBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream3);
                    }
                    fileOutputStream3.close();
                } catch (Throwable th3) {
                    th = th3;
                    org.telegram.messenger.f8.g(th, true);
                    z12 = false;
                    z13 = false;
                    if (this.G1) {
                    }
                    obj = this.C1;
                    int i19 = 45;
                    if (obj instanceof TLRPC.TL_wallPaper) {
                    }
                    file2 = null;
                    org.telegram.ui.ActionBar.m6 m6Var = new org.telegram.ui.ActionBar.m6();
                    m6Var.a = j12;
                    m6Var.b = j11;
                    m6Var.c = str;
                    m6Var.i = this.G1;
                    m6Var.j = this.F1;
                    m6Var.d = i18;
                    m6Var.e = i11;
                    m6Var.f = i12;
                    m6Var.g = i13;
                    m6Var.h = i19;
                    if (this.N1) {
                    }
                    m6Var.k = this.m1;
                    obj2 = this.C1;
                    if (obj2 instanceof me1) {
                    }
                    j10 = this.K1;
                    m6Var.n = j10;
                    if (j10 != 0) {
                    }
                    m6Var.o = z10;
                    org.telegram.messenger.vp.r1(this.currentAccount).w4(file2, m6Var, str == null && this.K1 == 0, 0L);
                    if (!z14) {
                    }
                    tL_wallPaper3 = tL_wallPaper;
                    z16 = z15;
                    if (z16) {
                    }
                }
            } else {
                i10 = 4;
            }
            z13 = false;
            z12 = true;
        } else {
            i10 = 4;
            if (obj3 instanceof ne1) {
                ne1 ne1Var = (ne1) obj3;
                if (ne1Var.b == 0 && !"t".equals(ne1Var.a)) {
                    try {
                        if (!this.b2 || this.Y1 == this.Z1) {
                            File file4 = ne1Var.e;
                            file = file4 != null ? file4 : ne1Var.d;
                        } else {
                            Bitmap createBitmap2 = Bitmap.createBitmap((int) this.a2, this.D1.getHeight(), Bitmap.Config.ARGB_8888);
                            Canvas canvas2 = new Canvas(createBitmap2);
                            canvas2.translate(-((this.Y1 / this.X1) * (this.D1.getWidth() - createBitmap2.getWidth())), 0.0f);
                            canvas2.drawBitmap(this.D1, 0.0f, 0.0f, (Paint) null);
                            ne1Var.d = new File(org.telegram.messenger.b8.z(4), Utilities.b.nextInt() + ".jpg");
                            FileOutputStream fileOutputStream4 = new FileOutputStream(ne1Var.d);
                            createBitmap2.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream4);
                            fileOutputStream4.close();
                            createBitmap2.recycle();
                            file = ne1Var.d;
                        }
                        z13 = file.equals(file3);
                        if (!z13) {
                            try {
                                z12 = org.telegram.messenger.i0.E(file, file3);
                            } catch (Exception e11) {
                                e = e11;
                                org.telegram.messenger.f8.g(e, true);
                                z12 = false;
                                if (this.G1) {
                                }
                                obj = this.C1;
                                int i192 = 45;
                                if (obj instanceof TLRPC.TL_wallPaper) {
                                }
                                file2 = null;
                                org.telegram.ui.ActionBar.m6 m6Var2 = new org.telegram.ui.ActionBar.m6();
                                m6Var2.a = j12;
                                m6Var2.b = j11;
                                m6Var2.c = str;
                                m6Var2.i = this.G1;
                                m6Var2.j = this.F1;
                                m6Var2.d = i18;
                                m6Var2.e = i11;
                                m6Var2.f = i12;
                                m6Var2.g = i13;
                                m6Var2.h = i192;
                                if (this.N1) {
                                }
                                m6Var2.k = this.m1;
                                obj2 = this.C1;
                                if (obj2 instanceof me1) {
                                }
                                j10 = this.K1;
                                m6Var2.n = j10;
                                if (j10 != 0) {
                                }
                                m6Var2.o = z10;
                                org.telegram.messenger.vp.r1(this.currentAccount).w4(file2, m6Var2, str == null && this.K1 == 0, 0L);
                                if (!z14) {
                                }
                                tL_wallPaper3 = tL_wallPaper;
                                z16 = z15;
                                if (z16) {
                                }
                            }
                        }
                        z12 = true;
                    } catch (Exception e12) {
                        e = e12;
                        z13 = false;
                    }
                }
                z13 = false;
                z12 = true;
            } else {
                if (obj3 instanceof org.telegram.messenger.hf) {
                    org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) obj3;
                    TLRPC.Photo photo = hfVar.K;
                    if (photo != null) {
                        z11 = true;
                        TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(photo.sizes, this.I1, true, null, false);
                        org.telegram.messenger.b8.G(this.currentAccount);
                        A = org.telegram.messenger.b8.K(w9, null, true, true);
                    } else {
                        z11 = true;
                        A = org.telegram.messenger.hc.A(hfVar.C);
                    }
                    try {
                        z12 = org.telegram.messenger.i0.E(A, file3);
                    } catch (Exception e13) {
                        org.telegram.messenger.f8.g(e13, z11);
                        z12 = false;
                    }
                    z13 = false;
                }
                z12 = false;
                z13 = false;
            }
        }
        if (this.G1) {
            try {
                FileOutputStream fileOutputStream5 = new FileOutputStream(new File(org.telegram.messenger.w0.h(), j12));
                this.x1.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream5);
                fileOutputStream5.close();
                z12 = true;
            } catch (Throwable th4) {
                org.telegram.messenger.f8.g(th4, true);
                z12 = false;
            }
        }
        obj = this.C1;
        int i1922 = 45;
        if (obj instanceof TLRPC.TL_wallPaper) {
            TLRPC.TL_wallPaper tL_wallPaper5 = (TLRPC.TL_wallPaper) obj;
            z14 = z12;
            f7 = 0.0f;
            tL_wallPaper = tL_wallPaper5;
            str = tL_wallPaper5.slug;
            i11 = 0;
            i12 = 0;
            i13 = 0;
        } else if (obj instanceof me1) {
            if ("d".equals(((me1) obj).a)) {
                f7 = 0.0f;
                i15 = 0;
                i16 = 0;
                i14 = 0;
                str2 = "d";
            } else {
                TLRPC.TL_wallPaper tL_wallPaper6 = this.X0;
                str2 = tL_wallPaper6 != null ? tL_wallPaper6.slug : "c";
                i14 = this.a1;
                int i20 = this.c1;
                i15 = this.d1;
                f7 = 0.0f;
                i16 = this.e1;
                i1922 = this.i1;
                i18 = i20;
            }
            String str3 = str2;
            i12 = i15;
            str = str3;
            int i21 = i14;
            i13 = i16;
            i11 = i18;
            i18 = i21;
            z14 = z12;
            tL_wallPaper = null;
        } else {
            f7 = 0.0f;
            if (obj instanceof ne1) {
                ne1 ne1Var2 = (ne1) obj;
                str = ne1Var2.a;
                z14 = z12;
                file2 = ne1Var2.d;
                i11 = 0;
                i12 = 0;
                i13 = 0;
                i18 = 0;
                tL_wallPaper = null;
            } else {
                if (obj instanceof org.telegram.messenger.hf) {
                    org.telegram.messenger.hf hfVar2 = (org.telegram.messenger.hf) obj;
                    TLRPC.Photo photo2 = hfVar2.K;
                    if (photo2 != null) {
                        tL_wallPaper2 = null;
                        TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(photo2.sizes, this.I1, true, null, false);
                        org.telegram.messenger.b8.G(this.currentAccount);
                        A2 = org.telegram.messenger.b8.K(w10, null, true, true);
                    } else {
                        tL_wallPaper2 = null;
                        A2 = org.telegram.messenger.hc.A(hfVar2.C);
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
                i11 = 0;
                i12 = 0;
                i13 = 0;
                i18 = 0;
            }
            org.telegram.ui.ActionBar.m6 m6Var22 = new org.telegram.ui.ActionBar.m6();
            m6Var22.a = j12;
            m6Var22.b = j11;
            m6Var22.c = str;
            m6Var22.i = this.G1;
            m6Var22.j = this.F1;
            m6Var22.d = i18;
            m6Var22.e = i11;
            m6Var22.f = i12;
            m6Var22.g = i13;
            m6Var22.h = i1922;
            if (this.N1) {
                float f11 = this.o1;
                if (f11 >= f7) {
                    m6Var22.k = f11;
                    obj2 = this.C1;
                    if (obj2 instanceof me1) {
                        me1 me1Var = (me1) obj2;
                        String str4 = ("c".equals(str) || "t".equals(str) || "d".equals(str)) ? null : str;
                        float f12 = me1Var.h;
                        if (f12 < f7 && !org.telegram.ui.ActionBar.t6.I.q()) {
                            f12 *= -1.0f;
                        }
                        if (me1Var.l != null && me1Var.b == i18 && me1Var.c == i11 && me1Var.d == i12 && me1Var.e == i13 && TextUtils.equals(me1Var.a, str4) && me1Var.f == i1922 && (this.X0 == null || Math.abs(f12 - this.m1) < 0.001f)) {
                            TLRPC.WallPaper wallPaper = me1Var.l;
                            m6Var22.l = wallPaper.id;
                            m6Var22.m = wallPaper.access_hash;
                        }
                    }
                    j10 = this.K1;
                    m6Var22.n = j10;
                    if (j10 != 0 && (a2 = getMessagesController().a2(this.K1)) != null) {
                        m6Var22.t = a2.wallpaper;
                    }
                    m6Var22.o = z10;
                    org.telegram.messenger.vp.r1(this.currentAccount).w4(file2, m6Var22, str == null && this.K1 == 0, 0L);
                    if (!z14) {
                        z15 = true;
                    } else {
                        if (this.K1 != 0) {
                            if (file2 == null || getMessagesController().R2 != m6Var22) {
                                z17 = false;
                                org.telegram.messenger.g4.f(this.currentAccount).u(this.K1, null, m6Var22, this.r0, new ag.f3(13));
                                tL_wallPaper3 = tL_wallPaper;
                            } else {
                                tL_wallPaper3 = new TLRPC.TL_wallPaper();
                                TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
                                tL_wallPaper3.settings = tL_wallPaperSettings;
                                tL_wallPaperSettings.intensity = (int) (m6Var22.k * 100.0f);
                                tL_wallPaperSettings.blur = m6Var22.i;
                                tL_wallPaperSettings.motion = m6Var22.j;
                                tL_wallPaper3.uploadingImage = file2.getAbsolutePath();
                                Bitmap createBitmap3 = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                                Canvas canvas3 = new Canvas(createBitmap3);
                                float max = Math.max(50.0f / this.y0.getMeasuredWidth(), 50.0f / this.y0.getMeasuredHeight());
                                canvas3.scale(max, max);
                                if (this.y0.getMeasuredHeight() > this.y0.getMeasuredWidth()) {
                                    f10 = f7;
                                    canvas3.translate(f10, (-(this.y0.getMeasuredHeight() - this.y0.getMeasuredWidth())) / 2.0f);
                                } else {
                                    f10 = f7;
                                    canvas3.translate((-(this.y0.getMeasuredWidth() - this.y0.getMeasuredHeight())) / 2.0f, f10);
                                }
                                float f13 = this.o1;
                                this.o1 = f10;
                                this.y0.draw(canvas3);
                                this.o1 = f13;
                                Utilities.blurBitmap(createBitmap3, 3);
                                tL_wallPaper3.stripedThumb = createBitmap3;
                                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                                org.telegram.messenger.qz.C(this.currentAccount);
                                tL_messageService.random_id = org.telegram.messenger.qz.E();
                                tL_messageService.dialog_id = this.K1;
                                tL_messageService.unread = true;
                                tL_messageService.out = true;
                                int j13 = getUserConfig().j();
                                tL_messageService.id = j13;
                                tL_messageService.local_id = j13;
                                TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-this.K1));
                                if (org.telegram.messenger.w3.T(L0)) {
                                    TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                    tL_messageService.from_id = tL_peerChannel;
                                    tL_peerChannel.channel_id = L0.id;
                                    TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                                    tL_messageService.peer_id = tL_peerChannel2;
                                    tL_peerChannel2.channel_id = L0.id;
                                } else {
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_messageService.from_id = tL_peerUser;
                                    tL_peerUser.user_id = getUserConfig().e();
                                    TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                                    tL_messageService.peer_id = tL_peerUser2;
                                    tL_peerUser2.user_id = this.K1;
                                }
                                tL_messageService.flags |= 256;
                                tL_messageService.date = getConnectionsManager().getCurrentTime();
                                TLRPC.TL_messageActionSetChatWallPaper tL_messageActionSetChatWallPaper = new TLRPC.TL_messageActionSetChatWallPaper();
                                tL_messageService.action = tL_messageActionSetChatWallPaper;
                                tL_messageActionSetChatWallPaper.wallpaper = tL_wallPaper3;
                                tL_messageActionSetChatWallPaper.for_both = z10;
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(new org.telegram.messenger.jj(this.currentAccount, tL_messageService, false, false));
                                new ArrayList().add(tL_messageService);
                                org.telegram.messenger.vp.r1(this.currentAccount).i5(0, this.K1, arrayList);
                                if (this.K1 >= 0) {
                                    TLRPC.UserFull a22 = getMessagesController().a2(this.K1);
                                    if (a22 != null) {
                                        a22.wallpaper = tL_wallPaper3;
                                        org.telegram.messenger.zs.f(this.currentAccount).k(org.telegram.messenger.zs.E0, Long.valueOf(this.K1), a22);
                                    }
                                } else {
                                    TLRPC.ChatFull M0 = getMessagesController().M0(-this.K1);
                                    if (M0 != null) {
                                        M0.wallpaper = tL_wallPaper3;
                                        org.telegram.messenger.zs f14 = org.telegram.messenger.zs.f(this.currentAccount);
                                        z17 = false;
                                        Object[] objArr = new Object[i10];
                                        objArr[0] = M0;
                                        objArr[1] = 0;
                                        Boolean bool = Boolean.FALSE;
                                        objArr[2] = bool;
                                        objArr[3] = bool;
                                        f14.k(org.telegram.messenger.zs.T, objArr);
                                    }
                                }
                                z17 = false;
                            }
                            this.e2 = true;
                            l91 l91Var = this.J1;
                            if (l91Var != null) {
                                l91Var.a(tL_wallPaper3);
                            }
                            finishFragment();
                            z16 = z17;
                            if (z16) {
                                return;
                            }
                            l91 l91Var2 = this.J1;
                            if (l91Var2 != null) {
                                l91Var2.a(tL_wallPaper3);
                            }
                            finishFragment();
                            return;
                        }
                        org.telegram.ui.ActionBar.t6.c0 = getThemedColor(org.telegram.ui.ActionBar.t6.Zc);
                        org.telegram.ui.ActionBar.t6.I.v("t".equals(m6Var22.c) ? null : m6Var22);
                        z15 = true;
                        org.telegram.ui.ActionBar.t6.u1(true);
                        if (!z13) {
                            org.telegram.messenger.hc.D().Q(Utilities.a(file3.getAbsolutePath()) + "@100_100");
                        }
                    }
                    tL_wallPaper3 = tL_wallPaper;
                    z16 = z15;
                    if (z16) {
                    }
                }
            }
            m6Var22.k = this.m1;
            obj2 = this.C1;
            if (obj2 instanceof me1) {
            }
            j10 = this.K1;
            m6Var22.n = j10;
            if (j10 != 0) {
                m6Var22.t = a2.wallpaper;
            }
            m6Var22.o = z10;
            org.telegram.messenger.vp.r1(this.currentAccount).w4(file2, m6Var22, str == null && this.K1 == 0, 0L);
            if (!z14) {
            }
            tL_wallPaper3 = tL_wallPaper;
            z16 = z15;
            if (z16) {
            }
        }
        file2 = null;
        org.telegram.ui.ActionBar.m6 m6Var222 = new org.telegram.ui.ActionBar.m6();
        m6Var222.a = j12;
        m6Var222.b = j11;
        m6Var222.c = str;
        m6Var222.i = this.G1;
        m6Var222.j = this.F1;
        m6Var222.d = i18;
        m6Var222.e = i11;
        m6Var222.f = i12;
        m6Var222.g = i13;
        m6Var222.h = i1922;
        if (this.N1) {
        }
        m6Var222.k = this.m1;
        obj2 = this.C1;
        if (obj2 instanceof me1) {
        }
        j10 = this.K1;
        m6Var222.n = j10;
        if (j10 != 0) {
        }
        m6Var222.o = z10;
        org.telegram.messenger.vp.r1(this.currentAccount).w4(file2, m6Var222, str == null && this.K1 == 0, 0L);
        if (!z14) {
        }
        tL_wallPaper3 = tL_wallPaper;
        z16 = z15;
        if (z16) {
        }
    }

    public final void R0(boolean z10) {
        int i10 = this.b;
        if (i10 == 2) {
            if (z10) {
                return;
            }
            finishFragment();
            return;
        }
        org.telegram.ui.ActionBar.t6.p();
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.z4);
        org.telegram.ui.ActionBar.r6 r6Var = this.w;
        if (i10 == 1) {
            if (this.h0) {
                r6Var.c = this.y;
                r6Var.d = this.D;
                r6Var.e = this.E;
                r6Var.f = this.F;
                r6Var.g = this.G;
                r6Var.h = this.H;
                r6Var.i = this.I;
                r6Var.j = this.J;
                r6Var.k = this.K;
                r6Var.l = this.L;
                r6Var.m = this.M;
                r6Var.n = this.P;
                r6Var.o = this.O;
                r6Var.p = this.N;
            }
            org.telegram.ui.ActionBar.t6.z1(this.f0, false, true, false, false, false);
        } else {
            if (r6Var != null) {
                org.telegram.ui.ActionBar.t6.z1(this.f0, false, this.i0, false, false, false);
            }
            ((ActionBarLayout) this.parentLayout).W(false, false);
            if (this.i0) {
                org.telegram.ui.ActionBar.s6 s6Var = this.f0;
                if (s6Var.b != null && org.telegram.ui.ActionBar.t6.H.get(s6Var.m()) == null) {
                    new File(s6Var.b).delete();
                }
            }
        }
        if (z10) {
            return;
        }
        finishFragment();
    }

    public final BitmapDrawable S0(Drawable drawable) {
        WeakReference weakReference = this.g2;
        if (weakReference != null && weakReference.get() == drawable) {
            return this.h2;
        }
        WeakReference weakReference2 = this.g2;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.g2 = null;
        if (drawable == null || drawable.getIntrinsicWidth() == 0 || drawable.getIntrinsicHeight() == 0) {
            this.h2 = null;
            return null;
        }
        this.g2 = new WeakReference(drawable);
        int intrinsicWidth = (int) ((drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) * 24.0f);
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, 24, Bitmap.Config.ARGB_8888);
        drawable.setBounds(0, 0, intrinsicWidth, 24);
        ColorFilter colorFilter = drawable.getColorFilter();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(1.3f);
        org.telegram.messenger.i0.n2(colorMatrix, 0.94f);
        drawable.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        drawable.draw(new Canvas(createBitmap));
        drawable.setColorFilter(colorFilter);
        Utilities.blurBitmap(createBitmap, 3);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getParentActivity().getResources(), createBitmap);
        this.h2 = bitmapDrawable;
        bitmapDrawable.setFilterBitmap(true);
        return this.h2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
    
        if (r0.q == r6.F1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008a, code lost:
    
        if (r0.p == r6.m1) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean T0(boolean z10) {
        if (this.b == 1) {
            org.telegram.ui.ActionBar.r6 r6Var = this.w;
            if (r6Var.c == this.y && r6Var.d == this.D && r6Var.e == this.E && r6Var.f == this.F && r6Var.g == this.G && r6Var.h == this.H && r6Var.i == this.I && r6Var.j == this.J && r6Var.k == this.K && r6Var.l == this.L && r6Var.m == this.M && Math.abs(r6Var.p - this.N) <= 0.001f && r6Var.n == this.P) {
                String str = r6Var.o;
                TLRPC.TL_wallPaper tL_wallPaper = this.X0;
                if (str.equals(tL_wallPaper != null ? tL_wallPaper.slug : "")) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = this.X0;
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
            String L0 = org.telegram.messenger.cd.L0(2131745961, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.cd.L0(2131745962, null);
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131745963, null), new c81(this, 3));
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131747596, null), new c81(this, 4));
            showDialog(x1Var);
            return false;
        }
        return true;
    }

    public final void U0() {
        int themedColor;
        org.telegram.ui.Components.tl tlVar = this.e;
        int i10 = 0;
        if (tlVar != null) {
            tlVar.H(getThemedColor(org.telegram.ui.ActionBar.t6.G8));
            this.e.O(getThemedColor(org.telegram.ui.ActionBar.t6.E8), false);
        }
        if (this.r != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.d6)) != this.s) {
            this.s = themedColor;
            this.r.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        }
        ig.s sVar = this.D0;
        if (sVar != null) {
            sVar.invalidate();
        }
        if (this.q1 != null) {
            org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
            if (z4Var == null || z4Var.getBottomSheet() == null) {
                setNavigationBarColor(getThemedColor(org.telegram.ui.ActionBar.t6.h5));
            } else {
                this.parentLayout.getBottomSheet().P(getThemedColor(org.telegram.ui.ActionBar.t6.h5));
                if (this.b == 2 && this.K1 != 0) {
                    this.parentLayout.getBottomSheet().E0(-16777216);
                }
            }
        }
        if (this.K0 != null) {
            int i11 = 0;
            while (true) {
                org.telegram.ui.Components.x71[] x71VarArr = this.K0;
                if (i11 >= x71VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.x71 x71Var = x71VarArr[i11];
                if (x71Var != null) {
                    x71Var.invalidate();
                }
                i11++;
            }
        }
        if (this.L0 != null) {
            while (true) {
                org.telegram.ui.Components.x71[] x71VarArr2 = this.L0;
                if (i10 >= x71VarArr2.length) {
                    break;
                }
                org.telegram.ui.Components.x71 x71Var2 = x71VarArr2[i10];
                if (x71Var2 != null) {
                    x71Var2.invalidate();
                }
                i10++;
            }
        }
        TextView textView = this.f2;
        if (textView != null) {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, this.a);
        }
        org.telegram.ui.Components.cq cqVar = this.W;
        if (cqVar != null) {
            cqVar.invalidate();
        }
        org.telegram.ui.Components.f10 f10Var = this.q0;
        if (f10Var != null) {
            f10Var.updateColors();
        }
    }

    public final int V0() {
        return org.telegram.messenger.w3.U(this.currentAccount, -this.K1) ? getMessagesController().v5 : getMessagesController().A5;
    }

    public final ArrayList W0() {
        g6 g6Var = new g6(23, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.k0, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.t0, TLObject.FLAG_31, (Class[]) null, (Paint) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.t0, TLObject.FLAG_30, (Class[]) null, (Paint) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.E8));
        org.telegram.ui.Components.cq cqVar = this.W;
        int i10 = 2;
        if (cqVar != null) {
            org.telegram.ui.ActionBar.t0 t0Var = cqVar.I;
            EditTextBoldCursor[] editTextBoldCursorArr = cqVar.E;
            for (int i11 = 0; i11 < editTextBoldCursorArr.length; i11++) {
                arrayList.add(new org.telegram.ui.ActionBar.c7(editTextBoldCursorArr[i11], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.c7(editTextBoldCursorArr[i11], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.k6));
                arrayList.add(new org.telegram.ui.ActionBar.c7(editTextBoldCursorArr[i11], 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.l6));
            }
            arrayList.add(new org.telegram.ui.ActionBar.c7(cqVar.F, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.I5));
            if (t0Var != null) {
                org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(cqVar, i10);
                arrayList.add(new org.telegram.ui.ActionBar.c7(t0Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, o6Var, org.telegram.ui.ActionBar.t6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.c7(t0Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, o6Var, org.telegram.ui.ActionBar.t6.E8));
                arrayList.add(new org.telegram.ui.ActionBar.c7(t0Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, o6Var, org.telegram.ui.ActionBar.t6.F8));
                arrayList.add(new org.telegram.ui.ActionBar.c7(t0Var, 0, (Class[]) null, (Paint) null, (Drawable[]) null, o6Var, org.telegram.ui.ActionBar.t6.G8));
            }
        }
        FrameLayout[] frameLayoutArr = this.M0;
        if (frameLayoutArr != null) {
            for (int i12 = 0; i12 < frameLayoutArr.length; i12++) {
            }
            for (int i13 = 0; i13 < this.P0.length; i13++) {
            }
            for (int i14 = 0; i14 < this.O0.length; i14++) {
            }
            for (int i15 = 0; i15 < this.N0.length; i15++) {
            }
            org.telegram.ui.ActionBar.a6 a6Var = this.S;
            org.telegram.ui.ActionBar.a6 a6Var2 = this.U;
            arrayList.add(new org.telegram.ui.ActionBar.c7(this.v0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, new Drawable[]{a6Var, a6Var2}, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.rb));
            arrayList.add(new org.telegram.ui.ActionBar.c7(this.v0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, new Drawable[]{a6Var, a6Var2}, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.sb));
            arrayList.add(new org.telegram.ui.ActionBar.c7(this.v0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, new Drawable[]{a6Var, a6Var2}, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.tb));
            arrayList.add(new org.telegram.ui.ActionBar.c7(this.v0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Kd));
            arrayList.add(new org.telegram.ui.ActionBar.c7(this.v0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Qb));
        }
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            ((org.telegram.ui.ActionBar.c7) arrayList.get(i16)).n = this.a;
        }
        return arrayList;
    }

    public final boolean X0(int i10) {
        int E0;
        long j10;
        if (this.h0) {
            return false;
        }
        org.telegram.ui.ActionBar.r6 r6Var = this.w;
        if (i10 == 1 || i10 == 2) {
            long j11 = this.J;
            if (j11 == 0) {
                int E02 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.Be);
                int i11 = (int) r6Var.j;
                if (i11 == 0) {
                    i11 = E02;
                }
                if (i11 != E02) {
                    return true;
                }
            } else if (j11 != r6Var.j) {
                return true;
            }
            long j12 = this.K;
            long j13 = this.M;
            long j14 = this.L;
            if (j12 == 0 && j14 == 0 && j13 == 0) {
                for (int i12 = 0; i12 < 3; i12++) {
                    if (i12 == 0) {
                        E0 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.Ce);
                        j10 = r6Var.k;
                    } else if (i12 == 1) {
                        E0 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.De);
                        j10 = r6Var.l;
                    } else {
                        E0 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.Ee);
                        j10 = r6Var.m;
                    }
                    int i13 = (int) j10;
                    if (i13 == 0 && j10 != 0) {
                        i13 = 0;
                    } else if (i13 == 0) {
                        i13 = E0;
                    }
                    if (i13 != E0) {
                        return true;
                    }
                }
            } else if (j12 != r6Var.k || j14 != r6Var.l || j13 != r6Var.m) {
                return true;
            }
            if (r6Var.n != this.P) {
                return true;
            }
        }
        if (i10 == 1 || i10 == 3) {
            if (this.y != r6Var.d) {
                return true;
            }
            int i14 = this.E;
            if (i14 == 0) {
                int i15 = r6Var.e;
                if (i15 != 0 && i15 != r6Var.c) {
                    return true;
                }
            } else if (i14 != r6Var.e) {
                return true;
            }
            int i16 = this.F;
            if (i16 != 0) {
                if (i16 != r6Var.f) {
                    return true;
                }
            } else if (r6Var.f != 0) {
                return true;
            }
            int i17 = this.G;
            if (i17 != 0) {
                if (i17 != r6Var.g) {
                    return true;
                }
            } else if (r6Var.g != 0) {
                return true;
            }
            int i18 = this.H;
            if (i18 != 0) {
                if (i18 != r6Var.h) {
                    return true;
                }
            } else if (r6Var.h != 0) {
                return true;
            }
            if (this.I != r6Var.i) {
                return true;
            }
        }
        return false;
    }

    public boolean Y0() {
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        return (z4Var == null || z4Var.getBottomSheet() == null) ? false : true;
    }

    public final void Z0() {
        jg.b1 b1Var = this.R1;
        if (b1Var != null) {
            b1Var.invalidate();
        }
        FrameLayout frameLayout = this.z0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.z0.getChildAt(i10).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.A0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                this.A0.getChildAt(i11).invalidate();
            }
        }
        if (this.K0 != null) {
            int i12 = 0;
            while (true) {
                org.telegram.ui.Components.x71[] x71VarArr = this.K0;
                if (i12 >= x71VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.x71 x71Var = x71VarArr[i12];
                if (x71Var != null) {
                    x71Var.setDimAmount(this.N1 ? this.o1 * this.p1 : 0.0f);
                    this.K0[i12].invalidate();
                }
                i12++;
            }
        }
        if (this.o0 != null) {
            for (int i13 = 0; i13 < this.o0.getChildCount(); i13++) {
                View childAt = this.o0.getChildAt(i13);
                if (childAt instanceof org.telegram.ui.Cells.s0) {
                    h1((org.telegram.ui.Cells.s0) childAt);
                    childAt.invalidate();
                }
            }
        }
        if (this.v0 != null) {
            for (int i14 = 0; i14 < this.v0.getChildCount(); i14++) {
                View childAt2 = this.v0.getChildAt(i14);
                if (childAt2 instanceof org.telegram.ui.Cells.s0) {
                    h1((org.telegram.ui.Cells.s0) childAt2);
                    childAt2.invalidate();
                }
            }
        }
        d91 d91Var = this.A1;
        if (d91Var != null) {
            d91Var.invalidate();
        }
        d91 d91Var2 = this.B1;
        if (d91Var2 != null) {
            d91Var2.invalidate();
        }
        ig.s sVar = this.D0;
        if (sVar != null) {
            sVar.invalidate();
        }
    }

    public final void a1() {
        org.telegram.ui.ActionBar.r6 r6Var = this.w;
        if (r6Var == null || TextUtils.isEmpty(r6Var.o)) {
            return;
        }
        try {
            File e = r6Var.e();
            Drawable background = this.y0.getBackground();
            Bitmap n10 = this.y0.getImageReceiver().n();
            if (background instanceof org.telegram.ui.Components.jb0) {
                FileOutputStream fileOutputStream = new FileOutputStream(e);
                n10.compress(Bitmap.CompressFormat.PNG, 87, fileOutputStream);
                fileOutputStream.close();
                return;
            }
            Bitmap createBitmap = Bitmap.createBitmap(n10.getWidth(), n10.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            background.setBounds(0, 0, n10.getWidth(), n10.getHeight());
            background.draw(canvas);
            Paint paint = new Paint(2);
            paint.setColorFilter(new PorterDuffColorFilter(this.k1, this.t1));
            paint.setAlpha((int) (this.m1 * 255.0f));
            canvas.drawBitmap(n10, 0.0f, 0.0f, paint);
            FileOutputStream fileOutputStream2 = new FileOutputStream(e);
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream2);
            fileOutputStream2.close();
        } catch (Throwable th2) {
            org.telegram.messenger.f8.g(th2, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.i5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.bc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ce));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.gc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.be));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Od));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Md));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.yb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.xb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Tc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Sc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.qb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.pb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Jj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Hj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ge));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.He));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B8));
    }

    public final void b1() {
        c1(2, true);
    }

    public final void c1(int i10, boolean z10) {
        org.telegram.ui.ActionBar.r6 r6Var;
        int i11;
        if (getParentActivity() == null || this.n == i10 || this.s1 != null || (r6Var = this.w) == null) {
            return;
        }
        if (z10 && i10 == 2 && (org.telegram.ui.ActionBar.t6.c1() || r6Var.j == 4294967296L)) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String L0 = org.telegram.messenger.cd.L0(2131752550, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            x1Var.R = L0;
            if (!org.telegram.ui.ActionBar.t6.c1() || (org.telegram.ui.ActionBar.t6.c1() && org.telegram.ui.ActionBar.t6.I.i0.d != 0)) {
                x1Var.T = org.telegram.messenger.cd.L0(2131752549, null);
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131746135, null), new c81(this, 5));
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131751771, null), new c81(this, 6));
            } else {
                x1Var.T = org.telegram.messenger.cd.L0(2131752529, null);
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131752552, null), new c81(this, 7));
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
            }
            showDialog(x1Var);
            return;
        }
        int i12 = this.n;
        this.n = i10;
        if (i10 == 1) {
            i11 = i12;
            this.h.setText(org.telegram.messenger.cd.L0(2131752015, null));
            int i13 = r6Var.d != 0 ? 2 : 1;
            org.telegram.ui.Components.cq cqVar = this.W;
            X0(1);
            cqVar.f(1, 2, i13, false);
            this.W.e(r6Var.c, 0);
            int i14 = r6Var.d;
            if (i14 != 0) {
                this.W.e(i14, 1);
            }
            if (i11 == 2 || (i11 == 3 && r6Var.g != 0)) {
                this.w0.s(0);
            }
        } else if (i10 != 2) {
            if (i10 == 3) {
                this.h.setText(org.telegram.messenger.cd.L0(2131752014, null));
                int i15 = r6Var.f != 0 ? r6Var.h != 0 ? 4 : r6Var.g != 0 ? 3 : 2 : 1;
                org.telegram.ui.Components.cq cqVar2 = this.W;
                X0(3);
                cqVar2.f(2, 4, i15, true);
                this.W.e(r6Var.h, 3);
                this.W.e(r6Var.g, 2);
                this.W.e(r6Var.f, 1);
                org.telegram.ui.Components.cq cqVar3 = this.W;
                int i16 = r6Var.e;
                if (i16 == 0) {
                    i16 = r6Var.c;
                }
                cqVar3.e(i16, 0);
                this.L0[1].b(0, r6Var.e);
                this.L0[1].b(1, r6Var.f);
                this.L0[1].b(2, r6Var.g);
                this.L0[1].b(3, r6Var.h);
                if (r6Var.g != 0) {
                    if (i12 == 1) {
                        this.w0.i(0);
                    } else {
                        this.w0.g(0);
                    }
                } else if (i12 == 2) {
                    this.w0.s(0);
                }
                this.v0.w0(0, org.telegram.messenger.i0.L(60.0f), null);
                i1();
            }
            i11 = i12;
        } else {
            this.h.setText(org.telegram.messenger.cd.L0(2131752016, null));
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.Be);
            int i17 = org.telegram.ui.ActionBar.t6.Ce;
            int themedColor2 = org.telegram.ui.ActionBar.t6.f1(i17) ? getThemedColor(i17) : 0;
            int i18 = org.telegram.ui.ActionBar.t6.De;
            int themedColor3 = org.telegram.ui.ActionBar.t6.f1(i18) ? getThemedColor(i18) : 0;
            int i19 = org.telegram.ui.ActionBar.t6.Ee;
            int themedColor4 = org.telegram.ui.ActionBar.t6.f1(i19) ? getThemedColor(i19) : 0;
            long j10 = r6Var.k;
            int i20 = (int) j10;
            if (i20 == 0 && j10 != 0) {
                themedColor2 = 0;
            }
            long j11 = r6Var.l;
            int i21 = (int) j11;
            if (i21 == 0 && j11 != 0) {
                themedColor3 = 0;
            }
            long j12 = r6Var.m;
            int i22 = (int) j12;
            if (i22 == 0 && j12 != 0) {
                themedColor4 = 0;
            }
            int i23 = (int) r6Var.j;
            int i24 = (i20 == 0 && themedColor2 == 0) ? 1 : (i22 == 0 && themedColor4 == 0) ? (i21 == 0 && themedColor3 == 0) ? 2 : 3 : 4;
            org.telegram.ui.Components.cq cqVar4 = this.W;
            X0(2);
            cqVar4.f(2, 4, i24, false);
            org.telegram.ui.Components.cq cqVar5 = this.W;
            if (i22 == 0) {
                i22 = themedColor4;
            }
            cqVar5.e(i22, 3);
            org.telegram.ui.Components.cq cqVar6 = this.W;
            if (i21 == 0) {
                i21 = themedColor3;
            }
            cqVar6.e(i21, 2);
            org.telegram.ui.Components.cq cqVar7 = this.W;
            if (i20 == 0) {
                i20 = themedColor2;
            }
            cqVar7.e(i20, 1);
            org.telegram.ui.Components.cq cqVar8 = this.W;
            if (i23 != 0) {
                themedColor = i23;
            }
            cqVar8.e(themedColor, 0);
            i11 = i12;
            if (i11 == 1 || r6Var.g == 0) {
                this.w0.i(0);
            } else {
                this.w0.g(0);
            }
            this.v0.w0(0, org.telegram.messenger.i0.L(60.0f), null);
        }
        if (i10 != 1 && i10 != 3) {
            this.W.setMinBrightness(0.0f);
            this.W.setMaxBrightness(1.0f);
            return;
        }
        if (i11 == 2 && this.M0[1].getVisibility() == 0) {
            j1(0, true, true);
        }
        if (i10 != 1) {
            this.W.setMinBrightness(0.0f);
            this.W.setMaxBrightness(1.0f);
        } else if (this.f0.q()) {
            this.W.setMinBrightness(0.2f);
        } else {
            this.W.setMinBrightness(0.05f);
            this.W.setMaxBrightness(0.8f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        if (r7.pattern == false) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0fd2  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0e39  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x076c  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0858  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x08da  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0923  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0934  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x08f4  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x093f A[EDGE_INSN: B:247:0x093f->B:248:0x093f BREAK  A[LOOP:2: B:196:0x0854->B:223:0x0935], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0946  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0a67  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0dc9  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0dd3  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0a74  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0850  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x06f3  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01aa A[LOOP:0: B:44:0x01a6->B:46:0x01aa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d7 A[EDGE_INSN: B:47:0x01d7->B:48:0x01d7 BREAK  A[LOOP:0: B:44:0x01a6->B:46:0x01aa], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0e37  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0e72  */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v21 */
    @Override // org.telegram.ui.ActionBar.k2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        boolean z10;
        org.telegram.ui.ActionBar.z4 z4Var;
        final int i10;
        int i11;
        int i12;
        c91[] c91VarArr;
        boolean z11;
        org.telegram.ui.ActionBar.s6 s6Var;
        int i13;
        float f7;
        int i14;
        int i15;
        Object obj;
        int i16;
        int i17;
        int i18;
        final int i19;
        n81 n81Var;
        int i20;
        final int i21;
        FrameLayout.LayoutParams e;
        float f10;
        float f11;
        ?? r15;
        org.telegram.ui.Components.qz0 qz0Var;
        final int i22;
        org.telegram.ui.ActionBar.z4 z4Var2;
        this.S.p = (n81) getResourceProvider();
        this.T.p = (n81) getResourceProvider();
        this.U.p = (n81) getResourceProvider();
        this.V.p = (n81) getResourceProvider();
        int i23 = 1;
        this.hasOwnBackground = true;
        e91 e91Var = this.q1;
        int i24 = 0;
        boolean z12 = (e91Var == null || this.K1 == 0) ? false : true;
        this.M1 = z12;
        if (z12) {
            Object obj2 = this.C1;
            if (!(obj2 instanceof ne1)) {
                if (obj2 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj2;
                    if (tL_wallPaper.document != null) {
                    }
                }
            }
            z10 = true;
            this.N1 = z10;
            if (z10) {
                this.p1 = e91Var.a() ? 1.0f : 0.0f;
            }
            z4Var = this.parentLayout;
            if (z4Var != null && ((ActionBarLayout) z4Var).z()) {
                this.actionBar.setOccupyStatusBar(false);
            }
            this.n0 = new FrameLayout(context);
            i10 = 3;
            if (this.N1 && org.telegram.messenger.tz.S < 3) {
                org.telegram.messenger.i0.h3(new a81(this, i10), 2000L);
            }
            this.actionBar.p().a(0, R.drawable.outline_header_search).M().J(new y81()).setSearchFieldHint(org.telegram.messenger.cd.K0(2131745853));
            this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.a5());
            this.actionBar.setAddToContainer(false);
            this.actionBar.setTitle(org.telegram.messenger.cd.K0(2131744197));
            l0 l0Var = new l0(this, context, 27);
            this.n0 = l0Var;
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, l0Var, getResourceProvider());
            this.n0.addView(this.actionBar, w7.b6.c(-2.0f, -1));
            org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context);
            this.o0 = tk0Var;
            tk0Var.setVerticalScrollBarEnabled(true);
            this.o0.setItemAnimator(null);
            this.o0.setLayoutAnimation(null);
            this.o0.setLayoutManager(new s4.a0(1, false));
            final int i25 = 2;
            this.o0.setVerticalScrollbarPosition(!org.telegram.messenger.cd.X ? 1 : 2);
            org.telegram.ui.Components.tk0 tk0Var2 = this.o0;
            i11 = this.b;
            tk0Var2.setPadding(0, 0, 0, org.telegram.messenger.i0.L(i11 == 0 ? 12.0f : 0.0f));
            this.o0.setOnItemClickListener(new org.telegram.ui.Components.c7(i25));
            this.n0.addView(this.o0, w7.b6.e(-1, -1, 51));
            org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(context, this.resourceProvider);
            this.q0 = f10Var;
            f10Var.setImageResource(R.drawable.floating_pencil);
            this.n0.addView(this.q0, org.telegram.ui.Components.f10.b());
            fg.j jVar = new fg.j(context);
            this.p0 = jVar;
            this.o0.setAdapter(jVar);
            this.u0 = new org.telegram.ui.ActionBar.m0(this, context, i25);
            this.w0 = new i91(context, this);
            this.t0 = createActionBar(context);
            if (org.telegram.messenger.i0.Q1()) {
                this.t0.setOccupyStatusBar(false);
            }
            this.t0.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
            this.t0.setActionBarMenuOnItemClick(new b91(this));
            i12 = 0;
            while (true) {
                c91VarArr = this.x0;
                if (i12 < 2) {
                    break;
                }
                c91VarArr[i12] = new c91(this, (Activity) getContext());
                this.u0.addView(c91VarArr[i12], w7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
                i12++;
            }
            c91 c91Var = c91VarArr[0];
            this.y0 = c91Var;
            c91Var.setVisibility(0);
            c91VarArr[1].setVisibility(8);
            if (i11 == 2) {
                this.y0.getImageReceiver().d0(new c81(this, i24));
            }
            z11 = this.w0.e;
            s6Var = this.f0;
            final int i26 = 4;
            if (!z11) {
                this.t0.setTitle("Telegram Beta Chat");
                this.t0.setSubtitle(org.telegram.messenger.cd.G(505, "Members", new Object[0]));
            } else if (i11 == 2) {
                if (this.K1 != 0) {
                    this.t0.setTitle(org.telegram.messenger.cd.K0(2131742978));
                } else {
                    this.t0.setTitle(org.telegram.messenger.cd.K0(2131753741));
                }
                org.telegram.ui.ActionBar.y p5 = this.t0.p();
                Object obj3 = this.C1;
                if ((obj3 instanceof ne1) && ((ne1) obj3).e != null) {
                    p5.a(7, R.drawable.msg_header_draw);
                }
                if (this.K1 == 0) {
                    boolean z13 = org.telegram.messenger.v2.a;
                    Object obj4 = this.C1;
                    if (((obj4 instanceof me1) && !"d".equals(((me1) obj4).a)) || (this.C1 instanceof TLRPC.TL_wallPaper)) {
                        p5.a(5, R.drawable.msg_header_share);
                    }
                }
                if (this.K1 != 0 && this.M1) {
                    org.telegram.ui.Components.bi0 bi0Var = new org.telegram.ui.Components.bi0(R.raw.sun, org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(28.0f), true, null);
                    this.O1 = bi0Var;
                    this.P1 = p5.d(6, bi0Var);
                    this.O1.h = true;
                    e91 e91Var2 = this.q1;
                    if (e91Var2 == null || e91Var2.a()) {
                        this.O1.M(35);
                        this.O1.P(36);
                    } else {
                        this.O1.P(0);
                        this.O1.M(0);
                    }
                    this.O1.Z = true;
                    int v02 = org.telegram.ui.ActionBar.t6.v0(org.telegram.ui.ActionBar.t6.J9);
                    this.O1.Q(v02, "Sunny");
                    this.O1.Q(v02, "Path 6");
                    this.O1.Q(v02, "Path");
                    this.O1.Q(v02, "Path 5");
                    this.O1.o();
                }
            } else if (i11 == 1) {
                org.telegram.ui.ActionBar.y p9 = this.t0.p();
                this.f = p9.e(4, org.telegram.messenger.cd.K0(2131745963));
                org.telegram.ui.Components.tl tlVar = new org.telegram.ui.Components.tl(this, context, p9);
                this.e = tlVar;
                tlVar.setSubMenuOpenSide(1);
                this.e.f(2, org.telegram.messenger.cd.K0(2131752016));
                this.e.f(1, org.telegram.messenger.cd.K0(2131752015));
                this.e.f(3, org.telegram.messenger.cd.K0(2131752014));
                this.e.K();
                this.e.setForceSmoothKeyboard(true);
                this.t0.addView(this.e, w7.b6.d(-2, -1.0f, 51, org.telegram.messenger.i0.Q1() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f));
                this.e.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.b81
                    public final /* synthetic */ m91 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i25) {
                            case 0:
                                this.b.R0(false);
                                break;
                            case 1:
                                m91.Z(this.b);
                                break;
                            case 2:
                                this.b.e.U(null, null);
                                break;
                            case 3:
                                this.b.Q0(false);
                                break;
                            default:
                                this.b.Q0(true);
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
                int i27 = org.telegram.ui.ActionBar.t6.A8;
                org.telegram.ui.ActionBar.a7.V(textView2, i27, getResourceProvider());
                this.h.setTypeface(org.telegram.messenger.i0.o());
                this.h.setText(org.telegram.messenger.cd.K0(2131752015));
                Drawable mutate = context.getResources().getDrawable(R.drawable.ic_arrow_drop_down).mutate();
                org.telegram.ui.ActionBar.a7.y(this.h, mutate, i27, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                this.h.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, mutate, (Drawable) null);
                this.h.setCompoundDrawablePadding(org.telegram.messenger.i0.L(4.0f));
                this.h.setPadding(0, 0, org.telegram.messenger.i0.L(10.0f), 0);
                this.e.addView(this.h, w7.b6.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 1.0f));
            } else {
                TLRPC.TL_theme tL_theme = s6Var.F;
                String n10 = tL_theme != null ? tL_theme.title : s6Var.n();
                int lastIndexOf = n10.lastIndexOf(".attheme");
                if (lastIndexOf >= 0) {
                    n10 = n10.substring(0, lastIndexOf);
                }
                this.t0.setTitle(n10);
                TLRPC.TL_theme tL_theme2 = s6Var.F;
                if (tL_theme2 == null || (i13 = tL_theme2.installs_count) <= 0) {
                    this.t0.setSubtitle(org.telegram.messenger.cd.w((System.currentTimeMillis() / 1000) - 3600, null));
                } else {
                    this.t0.setSubtitle(org.telegram.messenger.cd.G(i13, "ThemeInstallCount", new Object[0]));
                }
            }
            this.v0 = new i81(context, this);
            j81 j81Var = new j81(this);
            j81Var.S();
            this.v0.setItemAnimator(j81Var);
            this.v0.setVerticalScrollBarEnabled(true);
            this.v0.setOverScrollMode(2);
            if (i11 != 2) {
                this.v0.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, (org.telegram.messenger.i0.L(72 + ((this.L1 || this.K1 <= 0) ? 0 : 58)) - 12) + (Y0() ? org.telegram.messenger.i0.n : 0));
            } else if (i11 == 1) {
                this.v0.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(16.0f));
            } else {
                this.v0.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f));
            }
            this.v0.setClipToPadding(false);
            this.v0.setLayoutManager(new s4.a0(1, true));
            this.v0.setVerticalScrollbarPosition(!org.telegram.messenger.cd.X ? 1 : 2);
            if (i11 != 1) {
                this.u0.addView(this.v0, w7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 273.0f));
                this.v0.setOnItemClickListener(new c81(this, i23));
                f7 = 16.0f;
                i14 = -1;
            } else {
                f7 = 16.0f;
                i14 = -1;
                this.u0.addView(this.v0, w7.b6.e(-1, -1, 51));
            }
            this.v0.setOnScrollListener(new w41(this, i25));
            this.u0.addView(this.t0, w7.b6.c(-2.0f, i14));
            org.telegram.ui.Components.z71 z71Var = new org.telegram.ui.Components.z71(context);
            this.w1 = z71Var;
            z71Var.b(new c81(this, i25));
            org.telegram.ui.ActionBar.r6 r6Var = this.w;
            if (i11 != 1 || i11 == 2) {
                if (i11 != 2) {
                    ig.s sVar = new ig.s(this, context, Y0());
                    this.D0 = sVar;
                    sVar.setWillNotDraw(false);
                    i15 = 2;
                    this.D0.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f) + (Y0() ? org.telegram.messenger.i0.n : 0));
                    this.u0.addView(this.D0, w7.b6.e(-1, 0, 81));
                    d91 d91Var = new d91(context, this);
                    this.A1 = d91Var;
                    w7.e6.b(d91Var, 0.033f, 1.2f);
                    l1(false);
                    this.A1.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.b81
                        public final /* synthetic */ m91 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i10) {
                                case 0:
                                    this.b.R0(false);
                                    break;
                                case 1:
                                    m91.Z(this.b);
                                    break;
                                case 2:
                                    this.b.e.U(null, null);
                                    break;
                                case 3:
                                    this.b.Q0(false);
                                    break;
                                default:
                                    this.b.Q0(true);
                                    break;
                            }
                        }
                    });
                    if (this.K1 <= 0 || this.L1 || this.r0 != null) {
                        this.D0.addView(this.A1, w7.b6.d(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                    } else {
                        d91 d91Var2 = new d91(context, this);
                        this.B1 = d91Var2;
                        w7.e6.b(d91Var2, 0.033f, 1.2f);
                        TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(this.K1));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
                        if (!getUserConfig().q()) {
                            spannableStringBuilder.append((CharSequence) "l ");
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.dq(R.drawable.msg_mini_lock3), 0, 1, 33);
                        }
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.cd.Z(2131754211, org.telegram.messenger.h20.p(Z1)));
                        this.B1.d(spannableStringBuilder);
                        try {
                            d91 d91Var3 = this.B1;
                            CharSequence b10 = d91Var3.b();
                            qz0Var = this.B1.a;
                            d91Var3.d(org.telegram.messenger.k6.l(b10, qz0Var.h(), false));
                        } catch (Exception unused) {
                        }
                        this.B1.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.b81
                            public final /* synthetic */ m91 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i26) {
                                    case 0:
                                        this.b.R0(false);
                                        break;
                                    case 1:
                                        m91.Z(this.b);
                                        break;
                                    case 2:
                                        this.b.e.U(null, null);
                                        break;
                                    case 3:
                                        this.b.Q0(false);
                                        break;
                                    default:
                                        this.b.Q0(true);
                                        break;
                                }
                            }
                        });
                        this.D0.addView(this.A1, w7.b6.d(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 58.0f));
                        this.D0.addView(this.B1, w7.b6.d(-1, 48.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                    }
                    if (this.N1) {
                        jg.b1 b1Var = new jg.b1(this, (Activity) getContext());
                        this.R1 = b1Var;
                        b1Var.setPadding(org.telegram.messenger.i0.L(f7), org.telegram.messenger.i0.L(f7), org.telegram.messenger.i0.L(f7), org.telegram.messenger.i0.L(f7));
                        this.u0.addView(this.R1, w7.b6.e(org.telegram.messenger.zs.z3, 76, 49));
                        k81 k81Var = new k81((Activity) getContext());
                        this.S1 = k81Var;
                        k81Var.d(this.o1);
                        this.S1.b();
                        this.S1.c(new d81(this, i24));
                        this.R1.addView(this.S1);
                        e91 e91Var3 = this.q1;
                        if (e91Var3 != null) {
                            this.S1.setVisibility(e91Var3.a() ? 0 : 8);
                            this.S1.setAlpha(this.q1.a() ? 1.0f : 0.0f);
                            this.S1.d(this.q1.a() ? this.o1 : 0.0f);
                        }
                    }
                } else {
                    i15 = 2;
                }
                Rect rect = new Rect();
                Drawable f12 = i0.a.f(context, R.drawable.sheet_shadow_round);
                this.r = f12;
                f12.getPadding(rect);
                Drawable drawable = this.r;
                int themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.d6);
                this.s = themedColor;
                drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                TextPaint textPaint = new TextPaint(1);
                textPaint.setTextSize(org.telegram.messenger.i0.L(14.0f));
                textPaint.setTypeface(org.telegram.messenger.i0.o());
                obj = this.C1;
                if (i11 != 1 || (obj instanceof me1)) {
                    if ((obj instanceof me1) || !"d".equals(((me1) obj).a)) {
                        i16 = 3;
                        String[] strArr = new String[i16];
                        int[] iArr = new int[i16];
                        this.K0 = new org.telegram.ui.Components.x71[i16];
                        if (i16 != 0) {
                            this.z0 = new FrameLayout(context);
                            if (i11 == 1 || (this.C1 instanceof me1)) {
                                strArr[0] = org.telegram.messenger.cd.K0(2131753745);
                                strArr[1] = org.telegram.messenger.cd.K0(2131753742);
                                strArr[i15] = org.telegram.messenger.cd.K0(2131753743);
                            } else {
                                strArr[0] = org.telegram.messenger.cd.K0(2131753750);
                                strArr[1] = org.telegram.messenger.cd.K0(2131753743);
                            }
                            i18 = 0;
                            int i28 = 0;
                            while (i28 < i16) {
                                int i29 = i23;
                                int i30 = i28;
                                int ceil = (int) Math.ceil(textPaint.measureText(strArr[i28]));
                                iArr[i30] = ceil;
                                i18 = Math.max(i18, ceil);
                                i28 = i30 + 1;
                                i23 = i29;
                            }
                            i17 = i23;
                            l81 l81Var = new l81(this, context, 0);
                            this.E0 = l81Var;
                            l81Var.setWillNotDraw(false);
                            this.E0.setVisibility(this.c1 != 0 ? 0 : 4);
                            this.E0.setScaleX(this.c1 != 0 ? 1.0f : 0.1f);
                            this.E0.setScaleY(this.c1 != 0 ? 1.0f : 0.1f);
                            this.E0.setAlpha(this.c1 != 0 ? 1.0f : 0.0f);
                            this.E0.setTag(this.c1 != 0 ? Integer.valueOf(i17) : null);
                            this.z0.addView(this.E0, w7.b6.e(48, 48, 17));
                            this.E0.setOnClickListener(new m81(this, 0));
                            ImageView imageView = new ImageView(context);
                            this.G0 = imageView;
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            this.G0.setImageResource(R.drawable.bg_rotate_large);
                            this.E0.addView(this.G0, w7.b6.e(-2, -2, 17));
                        } else {
                            i17 = 1;
                            i18 = 0;
                        }
                        i19 = 0;
                        while (true) {
                            n81Var = this.a;
                            if (i19 >= i16) {
                                break;
                            }
                            org.telegram.ui.ActionBar.s6 s6Var2 = s6Var;
                            this.K0[i19] = new org.telegram.ui.Components.x71(context, ((i11 == i17 || (this.C1 instanceof me1)) && i19 == 0) ? false : true, this.y0, n81Var);
                            this.K0[i19].setBackgroundColor(this.a1);
                            org.telegram.ui.Components.x71 x71Var = this.K0[i19];
                            String str = strArr[i19];
                            int i31 = iArr[i19];
                            x71Var.f = str;
                            x71Var.h = i31;
                            x71Var.n = i18;
                            int i32 = 1;
                            if (i11 != 1) {
                                if (this.C1 instanceof me1) {
                                    i32 = 1;
                                } else {
                                    x71Var.a(i19 == 0 ? this.G1 : this.F1, false);
                                    int L = org.telegram.messenger.i0.L(56.0f) + i18;
                                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(L, -2);
                                    layoutParams.gravity = 17;
                                    if (i16 != 3) {
                                        if (i19 == 0 || i19 == 2) {
                                            layoutParams.leftMargin = org.telegram.messenger.i0.L(10.0f) + (L / 2);
                                        } else {
                                            layoutParams.rightMargin = org.telegram.messenger.i0.L(10.0f) + (L / 2);
                                        }
                                    } else if (i19 == 1) {
                                        layoutParams.leftMargin = org.telegram.messenger.i0.L(10.0f) + (L / 2);
                                    } else {
                                        layoutParams.rightMargin = org.telegram.messenger.i0.L(10.0f) + (L / 2);
                                    }
                                    this.z0.addView(this.K0[i19], layoutParams);
                                    final org.telegram.ui.Components.x71 x71Var2 = this.K0[i19];
                                    final int i33 = 0;
                                    x71Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.e81
                                        public final /* synthetic */ m91 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i33) {
                                                case 0:
                                                    m91 m91Var = this.b;
                                                    int i34 = m91Var.b;
                                                    FrameLayout[] frameLayoutArr = m91Var.M0;
                                                    if (m91Var.z0.getAlpha() == 1.0f && m91Var.s1 == null) {
                                                        int i35 = i19;
                                                        org.telegram.ui.Components.x71 x71Var3 = x71Var2;
                                                        if ((i34 != 1 && !(m91Var.C1 instanceof me1)) || i35 != 2) {
                                                            if (i35 != 1 || (i34 != 1 && !(m91Var.C1 instanceof me1))) {
                                                                if (!(m91Var.C1 instanceof me1)) {
                                                                    if (i34 != 1) {
                                                                        x71Var3.a(!x71Var3.s, true);
                                                                        if (i35 != 0) {
                                                                            boolean z14 = x71Var3.s;
                                                                            m91Var.F1 = z14;
                                                                            m91Var.w1.c(z14);
                                                                            m91Var.P0();
                                                                            break;
                                                                        } else {
                                                                            boolean z15 = x71Var3.s;
                                                                            m91Var.G1 = z15;
                                                                            if (z15) {
                                                                                m91Var.y0.getImageReceiver().U0 = true;
                                                                            }
                                                                            m91Var.m1();
                                                                            break;
                                                                        }
                                                                    }
                                                                } else {
                                                                    m91Var.j1(i35, frameLayoutArr[i35].getVisibility() != 0, true);
                                                                    break;
                                                                }
                                                            } else {
                                                                if (m91Var.K0[1].s) {
                                                                    m91Var.Z0 = m91Var.X0;
                                                                    m91Var.y0.setImageDrawable(null);
                                                                    m91Var.X0 = null;
                                                                    m91Var.F1 = false;
                                                                    m91Var.n1();
                                                                    m91Var.P0();
                                                                    if (frameLayoutArr[1].getVisibility() == 0) {
                                                                        if (i34 == 1) {
                                                                            m91Var.j1(0, true, true);
                                                                        } else {
                                                                            m91Var.j1(i35, frameLayoutArr[i35].getVisibility() != 0, true);
                                                                        }
                                                                    }
                                                                } else {
                                                                    m91Var.d1(m91Var.Z0 != null ? -1 : 0);
                                                                    if (i34 == 1) {
                                                                        m91Var.j1(1, true, true);
                                                                    } else {
                                                                        m91Var.j1(i35, frameLayoutArr[i35].getVisibility() != 0, true);
                                                                    }
                                                                }
                                                                m91Var.K0[1].a(m91Var.X0 != null, true);
                                                                m91Var.r1();
                                                                m91Var.Q0.g1();
                                                                m91Var.p1();
                                                                break;
                                                            }
                                                        } else {
                                                            x71Var3.a(!x71Var3.s, true);
                                                            boolean z16 = x71Var3.s;
                                                            m91Var.F1 = z16;
                                                            m91Var.w1.c(z16);
                                                            m91Var.P0();
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    m91 m91Var2 = this.b;
                                                    if (m91Var2.A0.getAlpha() == 1.0f && i19 == 0) {
                                                        org.telegram.ui.Components.x71 x71Var4 = x71Var2;
                                                        x71Var4.a(!x71Var4.s, true);
                                                        m91Var2.w.i = x71Var4.s;
                                                        org.telegram.ui.ActionBar.t6.t1(true, true);
                                                        m91Var2.v0.g1();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    if (i19 != 2) {
                                        this.K0[i19].setAlpha(0.0f);
                                        this.K0[i19].setVisibility(4);
                                    }
                                    i19++;
                                    s6Var = s6Var2;
                                    i15 = 2;
                                    i17 = 1;
                                }
                            }
                            if (i19 == i32) {
                                x71Var.a((this.X0 == null && (r6Var == null || TextUtils.isEmpty(r6Var.o))) ? false : true, false);
                            } else if (i19 == i15) {
                                x71Var.a(this.F1, false);
                            }
                            int L2 = org.telegram.messenger.i0.L(56.0f) + i18;
                            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(L2, -2);
                            layoutParams2.gravity = 17;
                            if (i16 != 3) {
                            }
                            this.z0.addView(this.K0[i19], layoutParams2);
                            final org.telegram.ui.Components.x71 x71Var22 = this.K0[i19];
                            final int i332 = 0;
                            x71Var22.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.e81
                                public final /* synthetic */ m91 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i332) {
                                        case 0:
                                            m91 m91Var = this.b;
                                            int i34 = m91Var.b;
                                            FrameLayout[] frameLayoutArr = m91Var.M0;
                                            if (m91Var.z0.getAlpha() == 1.0f && m91Var.s1 == null) {
                                                int i35 = i19;
                                                org.telegram.ui.Components.x71 x71Var3 = x71Var22;
                                                if ((i34 != 1 && !(m91Var.C1 instanceof me1)) || i35 != 2) {
                                                    if (i35 != 1 || (i34 != 1 && !(m91Var.C1 instanceof me1))) {
                                                        if (!(m91Var.C1 instanceof me1)) {
                                                            if (i34 != 1) {
                                                                x71Var3.a(!x71Var3.s, true);
                                                                if (i35 != 0) {
                                                                    boolean z14 = x71Var3.s;
                                                                    m91Var.F1 = z14;
                                                                    m91Var.w1.c(z14);
                                                                    m91Var.P0();
                                                                    break;
                                                                } else {
                                                                    boolean z15 = x71Var3.s;
                                                                    m91Var.G1 = z15;
                                                                    if (z15) {
                                                                        m91Var.y0.getImageReceiver().U0 = true;
                                                                    }
                                                                    m91Var.m1();
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            m91Var.j1(i35, frameLayoutArr[i35].getVisibility() != 0, true);
                                                            break;
                                                        }
                                                    } else {
                                                        if (m91Var.K0[1].s) {
                                                            m91Var.Z0 = m91Var.X0;
                                                            m91Var.y0.setImageDrawable(null);
                                                            m91Var.X0 = null;
                                                            m91Var.F1 = false;
                                                            m91Var.n1();
                                                            m91Var.P0();
                                                            if (frameLayoutArr[1].getVisibility() == 0) {
                                                                if (i34 == 1) {
                                                                    m91Var.j1(0, true, true);
                                                                } else {
                                                                    m91Var.j1(i35, frameLayoutArr[i35].getVisibility() != 0, true);
                                                                }
                                                            }
                                                        } else {
                                                            m91Var.d1(m91Var.Z0 != null ? -1 : 0);
                                                            if (i34 == 1) {
                                                                m91Var.j1(1, true, true);
                                                            } else {
                                                                m91Var.j1(i35, frameLayoutArr[i35].getVisibility() != 0, true);
                                                            }
                                                        }
                                                        m91Var.K0[1].a(m91Var.X0 != null, true);
                                                        m91Var.r1();
                                                        m91Var.Q0.g1();
                                                        m91Var.p1();
                                                        break;
                                                    }
                                                } else {
                                                    x71Var3.a(!x71Var3.s, true);
                                                    boolean z16 = x71Var3.s;
                                                    m91Var.F1 = z16;
                                                    m91Var.w1.c(z16);
                                                    m91Var.P0();
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            m91 m91Var2 = this.b;
                                            if (m91Var2.A0.getAlpha() == 1.0f && i19 == 0) {
                                                org.telegram.ui.Components.x71 x71Var4 = x71Var22;
                                                x71Var4.a(!x71Var4.s, true);
                                                m91Var2.w.i = x71Var4.s;
                                                org.telegram.ui.ActionBar.t6.t1(true, true);
                                                m91Var2.v0.g1();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            if (i19 != 2) {
                            }
                            i19++;
                            s6Var = s6Var2;
                            i15 = 2;
                            i17 = 1;
                        }
                        org.telegram.ui.ActionBar.s6 s6Var3 = s6Var;
                        i20 = i17;
                        if (i11 == i20) {
                            int[] iArr2 = new int[2];
                            this.L0 = new org.telegram.ui.Components.x71[2];
                            this.A0 = new FrameLayout(context);
                            String[] strArr2 = {org.telegram.messenger.cd.K0(2131753752), org.telegram.messenger.cd.K0(2131753745)};
                            int i34 = 0;
                            int i35 = 0;
                            for (int i36 = 2; i34 < i36; i36 = 2) {
                                int ceil2 = (int) Math.ceil(textPaint.measureText(strArr2[i34]));
                                iArr2[i34] = ceil2;
                                i35 = Math.max(i35, ceil2);
                                i34++;
                            }
                            if (r6Var != null) {
                                l81 l81Var2 = new l81(this, context, 1);
                                this.F0 = l81Var2;
                                l81Var2.setWillNotDraw(false);
                                this.F0.setVisibility(r6Var.f != 0 ? 0 : 4);
                                this.F0.setScaleX(r6Var.f != 0 ? 1.0f : 0.1f);
                                this.F0.setScaleY(r6Var.f != 0 ? 1.0f : 0.1f);
                                this.F0.setAlpha(r6Var.f != 0 ? 1.0f : 0.0f);
                                this.A0.addView(this.F0, w7.b6.e(48, 48, 17));
                                this.F0.setOnClickListener(new m81(this, 1));
                                ImageView imageView2 = new ImageView(context);
                                this.H0 = imageView2;
                                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                                this.H0.setImageResource(R.drawable.bg_rotate_large);
                                this.F0.addView(this.H0, w7.b6.e(-2, -2, 17));
                                final int i37 = 0;
                                while (i37 < 2) {
                                    this.L0[i37] = new org.telegram.ui.Components.x71(context, i37 == 0, this.y0, n81Var);
                                    org.telegram.ui.Components.x71 x71Var3 = this.L0[i37];
                                    String str2 = strArr2[i37];
                                    int i38 = iArr2[i37];
                                    x71Var3.f = str2;
                                    x71Var3.h = i38;
                                    x71Var3.n = i35;
                                    if (i37 == 0) {
                                        x71Var3.a(r6Var.i, false);
                                    }
                                    int L3 = org.telegram.messenger.i0.L(56.0f) + i35;
                                    FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(L3, -2);
                                    layoutParams3.gravity = 17;
                                    if (i37 == 1) {
                                        layoutParams3.leftMargin = org.telegram.messenger.i0.L(10.0f) + (L3 / 2);
                                    } else {
                                        layoutParams3.rightMargin = org.telegram.messenger.i0.L(10.0f) + (L3 / 2);
                                    }
                                    this.A0.addView(this.L0[i37], layoutParams3);
                                    final org.telegram.ui.Components.x71 x71Var4 = this.L0[i37];
                                    final int i39 = 1;
                                    x71Var4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.e81
                                        public final /* synthetic */ m91 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i39) {
                                                case 0:
                                                    m91 m91Var = this.b;
                                                    int i342 = m91Var.b;
                                                    FrameLayout[] frameLayoutArr = m91Var.M0;
                                                    if (m91Var.z0.getAlpha() == 1.0f && m91Var.s1 == null) {
                                                        int i352 = i37;
                                                        org.telegram.ui.Components.x71 x71Var32 = x71Var4;
                                                        if ((i342 != 1 && !(m91Var.C1 instanceof me1)) || i352 != 2) {
                                                            if (i352 != 1 || (i342 != 1 && !(m91Var.C1 instanceof me1))) {
                                                                if (!(m91Var.C1 instanceof me1)) {
                                                                    if (i342 != 1) {
                                                                        x71Var32.a(!x71Var32.s, true);
                                                                        if (i352 != 0) {
                                                                            boolean z14 = x71Var32.s;
                                                                            m91Var.F1 = z14;
                                                                            m91Var.w1.c(z14);
                                                                            m91Var.P0();
                                                                            break;
                                                                        } else {
                                                                            boolean z15 = x71Var32.s;
                                                                            m91Var.G1 = z15;
                                                                            if (z15) {
                                                                                m91Var.y0.getImageReceiver().U0 = true;
                                                                            }
                                                                            m91Var.m1();
                                                                            break;
                                                                        }
                                                                    }
                                                                } else {
                                                                    m91Var.j1(i352, frameLayoutArr[i352].getVisibility() != 0, true);
                                                                    break;
                                                                }
                                                            } else {
                                                                if (m91Var.K0[1].s) {
                                                                    m91Var.Z0 = m91Var.X0;
                                                                    m91Var.y0.setImageDrawable(null);
                                                                    m91Var.X0 = null;
                                                                    m91Var.F1 = false;
                                                                    m91Var.n1();
                                                                    m91Var.P0();
                                                                    if (frameLayoutArr[1].getVisibility() == 0) {
                                                                        if (i342 == 1) {
                                                                            m91Var.j1(0, true, true);
                                                                        } else {
                                                                            m91Var.j1(i352, frameLayoutArr[i352].getVisibility() != 0, true);
                                                                        }
                                                                    }
                                                                } else {
                                                                    m91Var.d1(m91Var.Z0 != null ? -1 : 0);
                                                                    if (i342 == 1) {
                                                                        m91Var.j1(1, true, true);
                                                                    } else {
                                                                        m91Var.j1(i352, frameLayoutArr[i352].getVisibility() != 0, true);
                                                                    }
                                                                }
                                                                m91Var.K0[1].a(m91Var.X0 != null, true);
                                                                m91Var.r1();
                                                                m91Var.Q0.g1();
                                                                m91Var.p1();
                                                                break;
                                                            }
                                                        } else {
                                                            x71Var32.a(!x71Var32.s, true);
                                                            boolean z16 = x71Var32.s;
                                                            m91Var.F1 = z16;
                                                            m91Var.w1.c(z16);
                                                            m91Var.P0();
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    m91 m91Var2 = this.b;
                                                    if (m91Var2.A0.getAlpha() == 1.0f && i37 == 0) {
                                                        org.telegram.ui.Components.x71 x71Var42 = x71Var4;
                                                        x71Var42.a(!x71Var42.s, true);
                                                        m91Var2.w.i = x71Var42.s;
                                                        org.telegram.ui.ActionBar.t6.t1(true, true);
                                                        m91Var2.v0.g1();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    i37++;
                                }
                            }
                            i20 = 1;
                        }
                        if (i11 != i20 || (this.C1 instanceof me1)) {
                            this.G1 = false;
                            i21 = 0;
                            while (i21 < 2) {
                                o81 o81Var = new o81(this, context, i21, rect);
                                ViewGroup[] viewGroupArr = this.M0;
                                viewGroupArr[i21] = o81Var;
                                if (i21 == 1 || i11 == 2) {
                                    o81Var.setVisibility(4);
                                }
                                viewGroupArr[i21].setWillNotDraw(false);
                                int i40 = org.telegram.messenger.zs.w4;
                                int i41 = org.telegram.messenger.zs.n5;
                                if (i11 == 2) {
                                    if (i21 == 0) {
                                        i41 = 321;
                                    }
                                    e = w7.b6.e(-1, i41, 83);
                                } else {
                                    if (i21 == 0) {
                                        i41 = 273;
                                    }
                                    e = w7.b6.e(-1, i41, 83);
                                }
                                if (i21 == 0) {
                                    if (i11 == 2) {
                                        i40 = 321;
                                    }
                                    f10 = i40;
                                } else {
                                    f10 = 316.0f;
                                }
                                e.height = org.telegram.messenger.i0.L(f10);
                                if (Y0()) {
                                    e.height += org.telegram.messenger.i0.n;
                                }
                                if (i21 == 0) {
                                    Drawable drawable2 = this.r;
                                    Rect rect2 = org.telegram.messenger.i0.Q;
                                    drawable2.getPadding(rect2);
                                    e.height = org.telegram.messenger.i0.L(12.0f) + rect2.top + e.height;
                                }
                                viewGroupArr[i21].setPadding(0, i21 == 0 ? org.telegram.messenger.i0.L(12.0f) + rect.top : 0, 0, Y0() ? org.telegram.messenger.i0.n : 0);
                                this.u0.addView(viewGroupArr[i21], e);
                                if (i21 == 1 || i11 == 2) {
                                    fg.i iVar = new fg.i(this, context, 27);
                                    ViewGroup[] viewGroupArr2 = this.P0;
                                    viewGroupArr2[i21] = iVar;
                                    iVar.setWillNotDraw(false);
                                    viewGroupArr2[i21].setPadding(0, org.telegram.messenger.i0.L(3.0f), 0, 0);
                                    viewGroupArr2[i21].setClickable(true);
                                    f11 = 21.0f;
                                    viewGroupArr[i21].addView(viewGroupArr2[i21], w7.b6.e(-1, 51, 80));
                                    TextView textView3 = new TextView(context);
                                    TextView[] textViewArr = this.N0;
                                    textViewArr[i21] = textView3;
                                    textView3.setTextSize(1, 15.0f);
                                    textViewArr[i21].setTypeface(org.telegram.messenger.i0.o());
                                    TextView textView4 = textViewArr[i21];
                                    int i42 = org.telegram.ui.ActionBar.t6.pf;
                                    org.telegram.ui.ActionBar.a7.V(textView4, i42, getResourceProvider());
                                    textViewArr[i21].setText(org.telegram.messenger.cd.K0(2131752589));
                                    textViewArr[i21].setGravity(17);
                                    textViewArr[i21].setPadding(org.telegram.messenger.i0.L(21.0f), 0, org.telegram.messenger.i0.L(21.0f), 0);
                                    TextView textView5 = textViewArr[i21];
                                    int i43 = org.telegram.ui.ActionBar.t6.i6;
                                    org.telegram.ui.ActionBar.a7.R(textView5, org.telegram.ui.ActionBar.t6.g0(getThemedColor(i43), 0), null, org.telegram.ui.ActionBar.a7.N(i43), getResourceProvider());
                                    viewGroupArr2[i21].addView(textViewArr[i21], w7.b6.e(-2, -1, 51));
                                    final int i44 = 0;
                                    textViewArr[i21].setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.h81
                                        public final /* synthetic */ m91 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i44) {
                                                case 0:
                                                    m91 m91Var = this.b;
                                                    if (m91Var.s1 == null) {
                                                        int i45 = i21;
                                                        if (i45 == 0) {
                                                            m91Var.i1 = m91Var.j1;
                                                            m91Var.e1(m91Var.h1, 3, true);
                                                            m91Var.e1(m91Var.g1, 2, true);
                                                            m91Var.e1(m91Var.f1, 1, true);
                                                            m91Var.e1(m91Var.b1, 0, true);
                                                        } else {
                                                            TLRPC.TL_wallPaper tL_wallPaper2 = m91Var.Y0;
                                                            m91Var.X0 = tL_wallPaper2;
                                                            if (tL_wallPaper2 == null) {
                                                                m91Var.y0.setImageDrawable(null);
                                                            } else {
                                                                c91 c91Var2 = m91Var.y0;
                                                                org.telegram.messenger.ic b11 = org.telegram.messenger.ic.b(tL_wallPaper2.document);
                                                                String str3 = m91Var.H1;
                                                                TLRPC.TL_wallPaper tL_wallPaper3 = m91Var.X0;
                                                                c91Var2.g(1, tL_wallPaper3.document.size, tL_wallPaper3, str3, null, "jpg", b11, null);
                                                            }
                                                            m91Var.K0[1].a(m91Var.X0 != null, false);
                                                            float f13 = m91Var.n1;
                                                            m91Var.m1 = f13;
                                                            m91Var.U0.setProgress(f13);
                                                            m91Var.y0.getImageReceiver().setAlpha(m91Var.m1);
                                                            m91Var.n1();
                                                            m91Var.r1();
                                                        }
                                                        if (m91Var.b != 2) {
                                                            if (m91Var.X0 == null) {
                                                                if (m91Var.F1) {
                                                                    m91Var.F1 = false;
                                                                    m91Var.K0[0].a(false, true);
                                                                    m91Var.P0();
                                                                }
                                                                m91Var.p1();
                                                            }
                                                            m91Var.j1(0, true, true);
                                                            break;
                                                        } else {
                                                            m91Var.j1(i45, false, true);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    m91 m91Var2 = this.b;
                                                    if (m91Var2.s1 == null) {
                                                        if (m91Var2.b != 2) {
                                                            m91Var2.j1(0, true, true);
                                                            break;
                                                        } else {
                                                            m91Var2.j1(i21, false, true);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    TextView textView6 = new TextView(context);
                                    TextView[] textViewArr2 = this.O0;
                                    textViewArr2[i21] = textView6;
                                    textView6.setTextSize(1, 15.0f);
                                    textViewArr2[i21].setTypeface(org.telegram.messenger.i0.o());
                                    org.telegram.ui.ActionBar.a7.V(textViewArr2[i21], i42, getResourceProvider());
                                    textViewArr2[i21].setText(org.telegram.messenger.cd.K0(2131754216));
                                    textViewArr2[i21].setGravity(17);
                                    textViewArr2[i21].setPadding(org.telegram.messenger.i0.L(21.0f), 0, org.telegram.messenger.i0.L(21.0f), 0);
                                    org.telegram.ui.ActionBar.a7.R(textViewArr2[i21], org.telegram.ui.ActionBar.t6.g0(getThemedColor(i43), 0), null, org.telegram.ui.ActionBar.a7.N(i43), getResourceProvider());
                                    viewGroupArr2[i21].addView(textViewArr2[i21], w7.b6.e(-2, -1, 53));
                                    TextView textView7 = textViewArr2[i21];
                                    r15 = 1;
                                    final char c10 = 1 == true ? 1 : 0;
                                    textView7.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.h81
                                        public final /* synthetic */ m91 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (c10) {
                                                case 0:
                                                    m91 m91Var = this.b;
                                                    if (m91Var.s1 == null) {
                                                        int i45 = i21;
                                                        if (i45 == 0) {
                                                            m91Var.i1 = m91Var.j1;
                                                            m91Var.e1(m91Var.h1, 3, true);
                                                            m91Var.e1(m91Var.g1, 2, true);
                                                            m91Var.e1(m91Var.f1, 1, true);
                                                            m91Var.e1(m91Var.b1, 0, true);
                                                        } else {
                                                            TLRPC.TL_wallPaper tL_wallPaper2 = m91Var.Y0;
                                                            m91Var.X0 = tL_wallPaper2;
                                                            if (tL_wallPaper2 == null) {
                                                                m91Var.y0.setImageDrawable(null);
                                                            } else {
                                                                c91 c91Var2 = m91Var.y0;
                                                                org.telegram.messenger.ic b11 = org.telegram.messenger.ic.b(tL_wallPaper2.document);
                                                                String str3 = m91Var.H1;
                                                                TLRPC.TL_wallPaper tL_wallPaper3 = m91Var.X0;
                                                                c91Var2.g(1, tL_wallPaper3.document.size, tL_wallPaper3, str3, null, "jpg", b11, null);
                                                            }
                                                            m91Var.K0[1].a(m91Var.X0 != null, false);
                                                            float f13 = m91Var.n1;
                                                            m91Var.m1 = f13;
                                                            m91Var.U0.setProgress(f13);
                                                            m91Var.y0.getImageReceiver().setAlpha(m91Var.m1);
                                                            m91Var.n1();
                                                            m91Var.r1();
                                                        }
                                                        if (m91Var.b != 2) {
                                                            if (m91Var.X0 == null) {
                                                                if (m91Var.F1) {
                                                                    m91Var.F1 = false;
                                                                    m91Var.K0[0].a(false, true);
                                                                    m91Var.P0();
                                                                }
                                                                m91Var.p1();
                                                            }
                                                            m91Var.j1(0, true, true);
                                                            break;
                                                        } else {
                                                            m91Var.j1(i45, false, true);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    m91 m91Var2 = this.b;
                                                    if (m91Var2.s1 == null) {
                                                        if (m91Var2.b != 2) {
                                                            m91Var2.j1(0, true, true);
                                                            break;
                                                        } else {
                                                            m91Var2.j1(i21, false, true);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                } else {
                                    r15 = 1;
                                    f11 = 21.0f;
                                }
                                if (i21 == r15) {
                                    TextView textView8 = new TextView(context);
                                    this.f2 = textView8;
                                    textView8.setLines(r15);
                                    this.f2.setSingleLine(r15);
                                    this.f2.setText(org.telegram.messenger.cd.K0(2131753749));
                                    org.telegram.ui.ActionBar.a7.V(this.f2, org.telegram.ui.ActionBar.t6.G6, getResourceProvider());
                                    this.f2.setTextSize(r15, 20.0f);
                                    this.f2.setTypeface(org.telegram.messenger.i0.o());
                                    this.f2.setPadding(org.telegram.messenger.i0.L(f11), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(f11), org.telegram.messenger.i0.L(8.0f));
                                    this.f2.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                                    this.f2.setGravity(16);
                                    viewGroupArr[i21].addView(this.f2, w7.b6.d(-1, 48.0f, 51, 0.0f, 21.0f, 0.0f, 0.0f));
                                    w71 w71Var = new w71(context);
                                    this.Q0 = w71Var;
                                    s4.a0 a0Var = new s4.a0(0, false);
                                    this.S0 = a0Var;
                                    w71Var.setLayoutManager(a0Var);
                                    w71 w71Var2 = this.Q0;
                                    k91 k91Var = new k91(context, this);
                                    this.R0 = k91Var;
                                    w71Var2.setAdapter(k91Var);
                                    this.Q0.i(new dh.g(11));
                                    viewGroupArr[i21].addView(this.Q0, w7.b6.d(-1, 100.0f, 51, 0.0f, 76.0f, 0.0f, 0.0f));
                                    this.Q0.setOnItemClickListener(new kz0(this, 7));
                                    org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(context);
                                    this.T0 = p4Var;
                                    p4Var.setText(org.telegram.messenger.cd.K0(2131753744));
                                    viewGroupArr[i21].addView(this.T0, w7.b6.d(-1, -2.0f, 51, 0.0f, 175.0f, 0.0f, 0.0f));
                                    org.telegram.ui.Cells.h0 h0Var = new org.telegram.ui.Cells.h0(context, (n81) getResourceProvider());
                                    this.U0 = h0Var;
                                    h0Var.setProgress(this.m1);
                                    this.U0.setReportChanges(true);
                                    this.U0.setDelegate(new p81(this));
                                    viewGroupArr[i21].addView(this.U0, w7.b6.d(-1, 38.0f, 51, 5.0f, 211.0f, 5.0f, 0.0f));
                                } else {
                                    org.telegram.ui.Components.cq cqVar = new org.telegram.ui.Components.cq(context, this.h0, new q81(this));
                                    this.W = cqVar;
                                    cqVar.setResourcesProvider(getResourceProvider());
                                    if (i11 == 1) {
                                        viewGroupArr[i21].addView(this.W, w7.b6.e(-1, -1, 1));
                                        if (s6Var3.q()) {
                                            this.W.setMinBrightness(0.2f);
                                        } else {
                                            this.W.setMinBrightness(0.05f);
                                            this.W.setMaxBrightness(0.8f);
                                        }
                                        if (r6Var != null) {
                                            int i45 = r6Var.d != 0 ? 2 : 1;
                                            org.telegram.ui.Components.cq cqVar2 = this.W;
                                            X0(1);
                                            cqVar2.f(1, 2, i45, false);
                                            this.W.e(r6Var.c, 0);
                                            int i46 = r6Var.d;
                                            if (i46 != 0) {
                                                this.W.e(i46, 1);
                                            }
                                        }
                                    } else {
                                        viewGroupArr[i21].addView(this.W, w7.b6.d(-1, -1.0f, 1, 0.0f, 0.0f, 0.0f, 48.0f));
                                    }
                                }
                                i21++;
                            }
                        }
                        n1();
                        if (!this.y0.getImageReceiver().I()) {
                            this.u0.setBackgroundColor(-16777216);
                        }
                        if (i11 != 1 && !(this.C1 instanceof me1)) {
                            this.y0.getImageReceiver().c0(true);
                        }
                    }
                    i16 = 0;
                    String[] strArr3 = new String[i16];
                    int[] iArr3 = new int[i16];
                    this.K0 = new org.telegram.ui.Components.x71[i16];
                    if (i16 != 0) {
                    }
                    i19 = 0;
                    while (true) {
                        n81Var = this.a;
                        if (i19 >= i16) {
                        }
                        i19++;
                        s6Var = s6Var2;
                        i15 = 2;
                        i17 = 1;
                    }
                    org.telegram.ui.ActionBar.s6 s6Var32 = s6Var;
                    i20 = i17;
                    if (i11 == i20) {
                    }
                    if (i11 != i20) {
                    }
                    this.G1 = false;
                    i21 = 0;
                    while (i21 < 2) {
                    }
                    n1();
                    if (!this.y0.getImageReceiver().I()) {
                    }
                    if (i11 != 1) {
                        this.y0.getImageReceiver().c0(true);
                    }
                } else {
                    if (!(obj instanceof ne1) || !"t".equals(((ne1) obj).a)) {
                        i16 = i15;
                        String[] strArr32 = new String[i16];
                        int[] iArr32 = new int[i16];
                        this.K0 = new org.telegram.ui.Components.x71[i16];
                        if (i16 != 0) {
                        }
                        i19 = 0;
                        while (true) {
                            n81Var = this.a;
                            if (i19 >= i16) {
                            }
                            i19++;
                            s6Var = s6Var2;
                            i15 = 2;
                            i17 = 1;
                        }
                        org.telegram.ui.ActionBar.s6 s6Var322 = s6Var;
                        i20 = i17;
                        if (i11 == i20) {
                        }
                        if (i11 != i20) {
                        }
                        this.G1 = false;
                        i21 = 0;
                        while (i21 < 2) {
                        }
                        n1();
                        if (!this.y0.getImageReceiver().I()) {
                        }
                        if (i11 != 1) {
                        }
                    }
                    i16 = 0;
                    String[] strArr322 = new String[i16];
                    int[] iArr322 = new int[i16];
                    this.K0 = new org.telegram.ui.Components.x71[i16];
                    if (i16 != 0) {
                    }
                    i19 = 0;
                    while (true) {
                        n81Var = this.a;
                        if (i19 >= i16) {
                        }
                        i19++;
                        s6Var = s6Var2;
                        i15 = 2;
                        i17 = 1;
                    }
                    org.telegram.ui.ActionBar.s6 s6Var3222 = s6Var;
                    i20 = i17;
                    if (i11 == i20) {
                    }
                    if (i11 != i20) {
                    }
                    this.G1 = false;
                    i21 = 0;
                    while (i21 < 2) {
                    }
                    n1();
                    if (!this.y0.getImageReceiver().I()) {
                    }
                    if (i11 != 1) {
                    }
                }
            }
            this.v0.setAdapter(this.w0);
            fg.i iVar2 = new fg.i(this, context, 28);
            this.l0 = iVar2;
            iVar2.setWillNotDraw(false);
            fg.i iVar3 = this.l0;
            this.fragmentView = iVar3;
            ViewTreeObserver viewTreeObserver = iVar3.getViewTreeObserver();
            z80 z80Var = new z80(this, 1);
            this.R = z80Var;
            viewTreeObserver.addOnGlobalLayoutListener(z80Var);
            z4.g gVar = new z4.g(context);
            this.k0 = gVar;
            gVar.b(new k2(this, 2));
            this.k0.setAdapter(new kg.e1(this, 4));
            org.telegram.messenger.i0.B3(this.k0, getThemedColor(org.telegram.ui.ActionBar.t6.s8));
            this.l0.addView(this.k0, w7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i11 != 0 ? 48.0f : 0.0f));
            UndoView undoView = new UndoView(context, this);
            this.m0 = undoView;
            undoView.setAdditionalTranslationY(org.telegram.messenger.i0.L(51.0f));
            this.l0.addView(this.m0, w7.b6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            if (i11 != 0) {
                View view = new View(context);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.V5, view, getResourceProvider());
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, 1, 83);
                layoutParams4.bottomMargin = org.telegram.messenger.i0.L(48.0f);
                this.l0.addView(view, layoutParams4);
                FrameLayout frameLayout = new FrameLayout(context);
                this.c0 = frameLayout;
                boolean z14 = this.d;
                if (z14) {
                    int i47 = org.telegram.ui.ActionBar.t6.d6;
                    frameLayout.setBackgroundColor(z14 ? org.telegram.ui.ActionBar.t6.F0(i47) : getThemedColor(i47));
                } else {
                    org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, frameLayout, getResourceProvider());
                }
                this.l0.addView(this.c0, w7.b6.e(-1, 48, 83));
                kg.f0 f0Var = new kg.f0(context, this);
                this.b0 = f0Var;
                this.c0.addView(f0Var, w7.b6.e(22, 8, 17));
                TextView textView9 = new TextView(context);
                this.e0 = textView9;
                textView9.setTextSize(1, 14.0f);
                if (z14) {
                    TextView textView10 = this.e0;
                    int i48 = org.telegram.ui.ActionBar.t6.pf;
                    textView10.setTextColor(z14 ? org.telegram.ui.ActionBar.t6.F0(i48) : getThemedColor(i48));
                } else {
                    org.telegram.ui.ActionBar.a7.V(this.e0, org.telegram.ui.ActionBar.t6.pf, getResourceProvider());
                }
                this.e0.setGravity(17);
                this.e0.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.g0(251658240, 0));
                this.e0.setPadding(org.telegram.messenger.i0.L(29.0f), 0, org.telegram.messenger.i0.L(29.0f), 0);
                this.e0.setText(org.telegram.messenger.cd.K0(2131752589));
                this.e0.setTypeface(org.telegram.messenger.i0.o());
                this.c0.addView(this.e0, w7.b6.e(-2, -1, 51));
                final int i49 = 0;
                this.e0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.b81
                    public final /* synthetic */ m91 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i49) {
                            case 0:
                                this.b.R0(false);
                                break;
                            case 1:
                                m91.Z(this.b);
                                break;
                            case 2:
                                this.b.e.U(null, null);
                                break;
                            case 3:
                                this.b.Q0(false);
                                break;
                            default:
                                this.b.Q0(true);
                                break;
                        }
                    }
                });
                TextView textView11 = new TextView(context);
                this.d0 = textView11;
                textView11.setTextSize(1, 14.0f);
                if (z14) {
                    TextView textView12 = this.d0;
                    int i50 = org.telegram.ui.ActionBar.t6.pf;
                    textView12.setTextColor(z14 ? org.telegram.ui.ActionBar.t6.F0(i50) : getThemedColor(i50));
                } else {
                    org.telegram.ui.ActionBar.a7.V(this.d0, org.telegram.ui.ActionBar.t6.pf, getResourceProvider());
                }
                this.d0.setGravity(17);
                this.d0.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.g0(251658240, 0));
                this.d0.setPadding(org.telegram.messenger.i0.L(29.0f), 0, org.telegram.messenger.i0.L(29.0f), 0);
                this.d0.setText(org.telegram.messenger.cd.K0(2131754216));
                this.d0.setTypeface(org.telegram.messenger.i0.o());
                this.c0.addView(this.d0, w7.b6.e(-2, -1, 53));
                i22 = 1;
                this.d0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.b81
                    public final /* synthetic */ m91 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i22) {
                            case 0:
                                this.b.R0(false);
                                break;
                            case 1:
                                m91.Z(this.b);
                                break;
                            case 2:
                                this.b.e.U(null, null);
                                break;
                            case 3:
                                this.b.Q0(false);
                                break;
                            default:
                                this.b.Q0(true);
                                break;
                        }
                    }
                });
            } else {
                i22 = 1;
            }
            if (i11 == i22 && !org.telegram.ui.ActionBar.t6.c1() && r6Var != null && r6Var.j != 4294967296L) {
                b1();
            }
            this.j0 = W0();
            f1(true);
            q1(false);
            this.c = new Scroller(getContext());
            z4Var2 = this.parentLayout;
            if (z4Var2 != null && z4Var2.getBottomSheet() != null) {
                this.parentLayout.getBottomSheet().P(getThemedColor(org.telegram.ui.ActionBar.t6.h5));
                if (i11 == 2 && this.K1 != 0) {
                    this.parentLayout.getBottomSheet().E0(-16777216);
                }
            }
            return this.fragmentView;
        }
        z10 = false;
        this.N1 = z10;
        if (z10) {
        }
        z4Var = this.parentLayout;
        if (z4Var != null) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.n0 = new FrameLayout(context);
        i10 = 3;
        if (this.N1) {
            org.telegram.messenger.i0.h3(new a81(this, i10), 2000L);
        }
        this.actionBar.p().a(0, R.drawable.outline_header_search).M().J(new y81()).setSearchFieldHint(org.telegram.messenger.cd.K0(2131745853));
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.a5());
        this.actionBar.setAddToContainer(false);
        this.actionBar.setTitle(org.telegram.messenger.cd.K0(2131744197));
        l0 l0Var2 = new l0(this, context, 27);
        this.n0 = l0Var2;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, l0Var2, getResourceProvider());
        this.n0.addView(this.actionBar, w7.b6.c(-2.0f, -1));
        org.telegram.ui.Components.tk0 tk0Var3 = new org.telegram.ui.Components.tk0(context);
        this.o0 = tk0Var3;
        tk0Var3.setVerticalScrollBarEnabled(true);
        this.o0.setItemAnimator(null);
        this.o0.setLayoutAnimation(null);
        this.o0.setLayoutManager(new s4.a0(1, false));
        final int i252 = 2;
        this.o0.setVerticalScrollbarPosition(!org.telegram.messenger.cd.X ? 1 : 2);
        org.telegram.ui.Components.tk0 tk0Var22 = this.o0;
        i11 = this.b;
        tk0Var22.setPadding(0, 0, 0, org.telegram.messenger.i0.L(i11 == 0 ? 12.0f : 0.0f));
        this.o0.setOnItemClickListener(new org.telegram.ui.Components.c7(i252));
        this.n0.addView(this.o0, w7.b6.e(-1, -1, 51));
        org.telegram.ui.Components.f10 f10Var2 = new org.telegram.ui.Components.f10(context, this.resourceProvider);
        this.q0 = f10Var2;
        f10Var2.setImageResource(R.drawable.floating_pencil);
        this.n0.addView(this.q0, org.telegram.ui.Components.f10.b());
        fg.j jVar2 = new fg.j(context);
        this.p0 = jVar2;
        this.o0.setAdapter(jVar2);
        this.u0 = new org.telegram.ui.ActionBar.m0(this, context, i252);
        this.w0 = new i91(context, this);
        this.t0 = createActionBar(context);
        if (org.telegram.messenger.i0.Q1()) {
        }
        this.t0.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
        this.t0.setActionBarMenuOnItemClick(new b91(this));
        i12 = 0;
        while (true) {
            c91VarArr = this.x0;
            if (i12 < 2) {
            }
            c91VarArr[i12] = new c91(this, (Activity) getContext());
            this.u0.addView(c91VarArr[i12], w7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
            i12++;
        }
        c91 c91Var2 = c91VarArr[0];
        this.y0 = c91Var2;
        c91Var2.setVisibility(0);
        c91VarArr[1].setVisibility(8);
        if (i11 == 2) {
        }
        z11 = this.w0.e;
        s6Var = this.f0;
        final int i262 = 4;
        if (!z11) {
        }
        this.v0 = new i81(context, this);
        j81 j81Var2 = new j81(this);
        j81Var2.S();
        this.v0.setItemAnimator(j81Var2);
        this.v0.setVerticalScrollBarEnabled(true);
        this.v0.setOverScrollMode(2);
        if (i11 != 2) {
        }
        this.v0.setClipToPadding(false);
        this.v0.setLayoutManager(new s4.a0(1, true));
        this.v0.setVerticalScrollbarPosition(!org.telegram.messenger.cd.X ? 1 : 2);
        if (i11 != 1) {
        }
        this.v0.setOnScrollListener(new w41(this, i252));
        this.u0.addView(this.t0, w7.b6.c(-2.0f, i14));
        org.telegram.ui.Components.z71 z71Var2 = new org.telegram.ui.Components.z71(context);
        this.w1 = z71Var2;
        z71Var2.b(new c81(this, i252));
        org.telegram.ui.ActionBar.r6 r6Var2 = this.w;
        if (i11 != 1) {
        }
        if (i11 != 2) {
        }
        Rect rect3 = new Rect();
        Drawable f122 = i0.a.f(context, R.drawable.sheet_shadow_round);
        this.r = f122;
        f122.getPadding(rect3);
        Drawable drawable3 = this.r;
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.t6.d6);
        this.s = themedColor2;
        drawable3.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setTextSize(org.telegram.messenger.i0.L(14.0f));
        textPaint2.setTypeface(org.telegram.messenger.i0.o());
        obj = this.C1;
        if (i11 != 1) {
        }
        if (obj instanceof me1) {
        }
        i16 = 3;
        String[] strArr3222 = new String[i16];
        int[] iArr3222 = new int[i16];
        this.K0 = new org.telegram.ui.Components.x71[i16];
        if (i16 != 0) {
        }
        i19 = 0;
        while (true) {
            n81Var = this.a;
            if (i19 >= i16) {
            }
            i19++;
            s6Var = s6Var2;
            i15 = 2;
            i17 = 1;
        }
        org.telegram.ui.ActionBar.s6 s6Var32222 = s6Var;
        i20 = i17;
        if (i11 == i20) {
        }
        if (i11 != i20) {
        }
        this.G1 = false;
        i21 = 0;
        while (i21 < 2) {
        }
        n1();
        if (!this.y0.getImageReceiver().I()) {
        }
        if (i11 != 1) {
        }
        this.v0.setAdapter(this.w0);
        fg.i iVar22 = new fg.i(this, context, 28);
        this.l0 = iVar22;
        iVar22.setWillNotDraw(false);
        fg.i iVar32 = this.l0;
        this.fragmentView = iVar32;
        ViewTreeObserver viewTreeObserver2 = iVar32.getViewTreeObserver();
        z80 z80Var2 = new z80(this, 1);
        this.R = z80Var2;
        viewTreeObserver2.addOnGlobalLayoutListener(z80Var2);
        z4.g gVar2 = new z4.g(context);
        this.k0 = gVar2;
        gVar2.b(new k2(this, 2));
        this.k0.setAdapter(new kg.e1(this, 4));
        org.telegram.messenger.i0.B3(this.k0, getThemedColor(org.telegram.ui.ActionBar.t6.s8));
        this.l0.addView(this.k0, w7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i11 != 0 ? 48.0f : 0.0f));
        UndoView undoView2 = new UndoView(context, this);
        this.m0 = undoView2;
        undoView2.setAdditionalTranslationY(org.telegram.messenger.i0.L(51.0f));
        this.l0.addView(this.m0, w7.b6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        if (i11 != 0) {
        }
        if (i11 == i22) {
            b1();
        }
        this.j0 = W0();
        f1(true);
        q1(false);
        this.c = new Scroller(getContext());
        z4Var2 = this.parentLayout;
        if (z4Var2 != null) {
            this.parentLayout.getBottomSheet().P(getThemedColor(org.telegram.ui.ActionBar.t6.h5));
            if (i11 == 2) {
                this.parentLayout.getBottomSheet().E0(-16777216);
            }
        }
        return this.fragmentView;
    }

    public final void d1(int i10) {
        TLRPC.TL_wallPaper tL_wallPaper = (i10 < 0 || i10 >= this.V0.size()) ? this.Z0 : (TLRPC.TL_wallPaper) this.V0.get(i10);
        if (tL_wallPaper == null) {
            return;
        }
        ValueAnimator valueAnimator = this.d2;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.d2.cancel();
        }
        c91[] c91VarArr = this.x0;
        c91 c91Var = c91VarArr[0];
        c91 c91Var2 = c91VarArr[1];
        c91VarArr[0] = c91Var2;
        c91VarArr[1] = c91Var;
        this.u0.removeView(c91Var2);
        this.u0.addView(c91VarArr[0], this.u0.indexOfChild(c91VarArr[1]) + 1);
        c91 c91Var3 = c91VarArr[0];
        this.y0 = c91Var3;
        c91Var3.setBackground(c91VarArr[1].getBackground());
        o1();
        c91VarArr[1].setVisibility(0);
        c91VarArr[1].setAlpha(1.0f);
        this.y0.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d2 = ofFloat;
        ofFloat.addUpdateListener(new cj(2, this));
        this.d2.addListener(new r81(this, 0));
        this.d2.setInterpolator(org.telegram.ui.Components.gr.f);
        this.d2.setDuration(300L);
        this.d2.start();
        this.y0.getImageReceiver().s1 = org.telegram.messenger.zs.X4;
        this.y0.getImageReceiver().r0(org.telegram.messenger.ic.b(tL_wallPaper.document), this.H1, null, null, null, tL_wallPaper.document.size, "jpg", tL_wallPaper, 1);
        this.y0.d();
        this.X0 = tL_wallPaper;
        this.F1 = this.K0[2].s;
        n1();
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.TL_wallPaper tL_wallPaper;
        String str;
        if (i10 == org.telegram.messenger.zs.p3) {
            if (this.K1 == ((Long) objArr[2]).longValue()) {
                this.W1 = (TL_stories.TL_premium_boostsStatus) objArr[0];
                l1(true);
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.i4) {
            org.telegram.ui.Components.tk0 tk0Var = this.o0;
            if (tk0Var == null) {
                return;
            }
            int childCount = tk0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.o0.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.v2) {
                    ((org.telegram.ui.Cells.v2) childAt).i0(0, true);
                }
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.j4) {
            i81 i81Var = this.v0;
            if (i81Var != null) {
                i81Var.g1();
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.z4) {
            if (this.u0 != null) {
                f1(true);
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.f4) {
            Object obj = this.C1;
            if (obj instanceof ne1) {
                ne1 ne1Var = (ne1) obj;
                if (ne1Var.a == null) {
                    ne1Var.a = (String) objArr[0];
                    return;
                }
                return;
            }
            return;
        }
        long j10 = 0;
        if (i10 != org.telegram.messenger.zs.e4) {
            if (i10 != org.telegram.messenger.zs.u5 || this.K1 == 0) {
                return;
            }
            finishFragment();
            return;
        }
        ArrayList arrayList = (ArrayList) objArr[0];
        this.V0.clear();
        HashMap hashMap = this.W0;
        hashMap.clear();
        int size = arrayList.size();
        boolean z10 = false;
        for (int i13 = 0; i13 < size; i13++) {
            TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) arrayList.get(i13);
            if ((wallPaper instanceof TLRPC.TL_wallPaper) && wallPaper.pattern) {
                TLRPC.Document document = wallPaper.document;
                if (document != null && !hashMap.containsKey(Long.valueOf(document.id))) {
                    this.V0.add(wallPaper);
                    hashMap.put(Long.valueOf(wallPaper.document.id), wallPaper);
                }
                org.telegram.ui.ActionBar.r6 r6Var = this.w;
                if (r6Var != null && (str = r6Var.o) != null && str.equals(wallPaper.slug)) {
                    this.X0 = (TLRPC.TL_wallPaper) wallPaper;
                    f1(false);
                    n1();
                } else if (r6Var == null) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = this.X0;
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
        if (!z10 && (tL_wallPaper = this.X0) != null) {
            this.V0.add(0, tL_wallPaper);
        }
        k91 k91Var = this.R0;
        if (k91Var != null) {
            k91Var.f();
        }
        int size2 = arrayList.size();
        for (int i14 = 0; i14 < size2; i14++) {
            TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) arrayList.get(i14);
            if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                j10 = org.telegram.messenger.ui.p(j10, wallPaper2.id);
            }
        }
        TL_account.getWallPapers getwallpapers = new TL_account.getWallPapers();
        getwallpapers.hash = j10;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(getwallpapers, new g81(this, 1)), this.classGuid);
    }

    public final void e1(int i10, int i11, boolean z10) {
        org.telegram.ui.Components.jb0 jb0Var;
        if (i11 == 0) {
            this.a1 = i10;
        } else if (i11 == 1) {
            this.c1 = i10;
        } else if (i11 == 2) {
            this.d1 = i10;
        } else if (i11 == 3) {
            this.e1 = i10;
        }
        q1(z10);
        if (this.K0 != null) {
            int i12 = 0;
            while (true) {
                org.telegram.ui.Components.x71[] x71VarArr = this.K0;
                if (i12 >= x71VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.x71 x71Var = x71VarArr[i12];
                if (x71Var != null) {
                    x71Var.b(i11, i10);
                }
                i12++;
            }
        }
        if (this.d1 != 0) {
            if (this.U0 != null && org.telegram.ui.ActionBar.t6.I.q()) {
                this.U0.setTwoSided(true);
            }
            Drawable background = this.y0.getBackground();
            if (background instanceof org.telegram.ui.Components.jb0) {
                jb0Var = (org.telegram.ui.Components.jb0) background;
            } else {
                jb0Var = new org.telegram.ui.Components.jb0();
                jb0Var.q(this.y0);
                if (this.E1) {
                    jb0Var.m(false);
                }
            }
            jb0Var.n(this.a1, this.c1, this.d1, this.e1);
            this.y0.setBackground(jb0Var);
            this.k1 = jb0Var.f();
            this.l1 = 754974720;
        } else if (this.c1 != 0) {
            this.y0.setBackground(new GradientDrawable(org.telegram.ui.Components.f9.d(this.i1), new int[]{this.a1, this.c1}));
            int V0 = org.telegram.messenger.i0.V0(org.telegram.messenger.i0.w0(this.a1, this.c1), false);
            this.l1 = V0;
            this.k1 = V0;
        } else {
            this.y0.setBackgroundColor(this.a1);
            int V02 = org.telegram.messenger.i0.V0(this.a1, false);
            this.l1 = V02;
            this.k1 = V02;
        }
        int i13 = org.telegram.ui.ActionBar.t6.Zc;
        boolean f12 = org.telegram.ui.ActionBar.t6.f1(i13);
        n81 n81Var = this.a;
        if (!f12 || (this.y0.getBackground() instanceof org.telegram.ui.Components.jb0)) {
            n81Var.k(this.y0.getBackground(), this.y0.getBackground(), Float.valueOf(this.m1));
        } else if (org.telegram.ui.ActionBar.t6.t0() instanceof org.telegram.ui.Components.jb0) {
            getThemedColor(i13);
            n81Var.k(this.y0.getBackground(), this.y0.getBackground(), Float.valueOf(this.m1));
        }
        ImageView imageView = this.G0;
        if (imageView != null) {
            org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.Wc, n81Var, PorterDuff.Mode.MULTIPLY);
        }
        ImageView imageView2 = this.H0;
        if (imageView2 != null) {
            org.telegram.ui.ActionBar.a7.t(imageView2, org.telegram.ui.ActionBar.t6.Wc, n81Var, PorterDuff.Mode.MULTIPLY);
        }
        c91 c91Var = this.y0;
        if (c91Var != null) {
            c91Var.getImageReceiver().o1 = new PorterDuffColorFilter(this.k1, this.t1);
            this.y0.getImageReceiver().setAlpha(Math.abs(this.m1));
            this.y0.invalidate();
            if (org.telegram.ui.ActionBar.t6.I.q() && (this.y0.getBackground() instanceof org.telegram.ui.Components.jb0)) {
                org.telegram.ui.Cells.h0 h0Var = this.U0;
                if (h0Var != null) {
                    h0Var.setTwoSided(true);
                }
                if (this.m1 < 0.0f) {
                    this.y0.getImageReceiver().m0(((org.telegram.ui.Components.jb0) this.y0.getBackground()).k);
                }
            } else {
                this.y0.getImageReceiver().m0(null);
                org.telegram.ui.Cells.h0 h0Var2 = this.U0;
                if (h0Var2 != null) {
                    h0Var2.setTwoSided(false);
                }
            }
            org.telegram.ui.Cells.h0 h0Var3 = this.U0;
            if (h0Var3 != null) {
                h0Var3.setProgress(this.m1);
            }
        }
        i81 i81Var = this.v0;
        if (i81Var != null) {
            i81Var.g1();
        }
        FrameLayout frameLayout = this.z0;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                this.z0.getChildAt(i14).invalidate();
            }
        }
        FrameLayout frameLayout2 = this.A0;
        if (frameLayout2 != null) {
            int childCount2 = frameLayout2.getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                this.A0.getChildAt(i15).invalidate();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f1(boolean z10) {
        ColorDrawable colorDrawable;
        org.telegram.ui.Components.jb0 jb0Var;
        org.telegram.ui.ActionBar.r6 r6Var = this.w;
        int i10 = 0;
        int i11 = this.b;
        if (i11 == 0 && r6Var == null) {
            this.y0.setBackground(org.telegram.ui.ActionBar.t6.s0());
        } else {
            if (i11 == 2) {
                Object obj = this.C1;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
                    TLRPC.PhotoSize w9 = z10 ? org.telegram.messenger.b8.w(tL_wallPaper.document.thumbs, 100, false, null, false) : null;
                    BitmapDrawable bitmapDrawable = w9 instanceof TLRPC.TL_photoStrippedSize ? new BitmapDrawable(org.telegram.messenger.hc.F("b", w9.bytes)) : null;
                    c91 c91Var = this.y0;
                    c91Var.a.r0(org.telegram.messenger.ic.b(tL_wallPaper.document), this.H1, org.telegram.messenger.ic.c(w9, tL_wallPaper.document), "100_100_b", bitmapDrawable, tL_wallPaper.document.size, "jpg", tL_wallPaper, 1);
                    c91Var.d();
                } else if (obj instanceof me1) {
                    me1 me1Var = (me1) obj;
                    int i12 = me1Var.f;
                    int i13 = me1Var.e;
                    int i14 = me1Var.d;
                    int i15 = me1Var.c;
                    int i16 = me1Var.b;
                    this.i1 = i12;
                    e1(i16, 0, false);
                    if (i15 != 0) {
                        e1(i15, 1, false);
                    }
                    e1(i14, 2, false);
                    e1(i13, 3, false);
                    TLRPC.TL_wallPaper tL_wallPaper2 = this.X0;
                    if (tL_wallPaper2 != null) {
                        c91 c91Var2 = this.y0;
                        org.telegram.messenger.ic b10 = org.telegram.messenger.ic.b(tL_wallPaper2.document);
                        String str = this.H1;
                        TLRPC.TL_wallPaper tL_wallPaper3 = this.X0;
                        c91Var2.g(1, tL_wallPaper3.document.size, tL_wallPaper3, str, null, "jpg", b10, null);
                    } else if ("d".equals(me1Var.a)) {
                        Point point = org.telegram.messenger.i0.q;
                        this.y0.setImageBitmap(org.telegram.messenger.d00.d(R.raw.default_pattern, Math.min(point.x, point.y), Math.max(point.x, point.y), Build.VERSION.SDK_INT >= 29 ? 1459617792 : org.telegram.ui.Components.jb0.g(i16, i15, i14, i13)));
                    }
                } else if (obj instanceof ne1) {
                    Bitmap bitmap = this.D1;
                    if (bitmap != null) {
                        this.y0.setImageBitmap(bitmap);
                    } else {
                        ne1 ne1Var = (ne1) obj;
                        File file = ne1Var.e;
                        if (file != null) {
                            this.y0.h(file.getAbsolutePath(), this.H1, null);
                        } else {
                            File file2 = ne1Var.d;
                            if (file2 != null) {
                                this.y0.h(file2.getAbsolutePath(), this.H1, null);
                            } else if ("t".equals(ne1Var.a)) {
                                c91 c91Var3 = this.y0;
                                c91Var3.setImageDrawable(org.telegram.ui.ActionBar.t6.Z0(c91Var3, false));
                            } else {
                                int i17 = ne1Var.b;
                                if (i17 != 0) {
                                    this.y0.setImageResource(i17);
                                }
                            }
                        }
                    }
                } else if (obj instanceof org.telegram.messenger.hf) {
                    org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) obj;
                    TLRPC.Photo photo = hfVar.K;
                    if (photo != null) {
                        TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(photo.sizes, 100, false, null, false);
                        TLRPC.PhotoSize w11 = org.telegram.messenger.b8.w(hfVar.K.sizes, this.I1, true, null, false);
                        TLRPC.PhotoSize photoSize = w11 != w10 ? w11 : null;
                        this.y0.g(1, photoSize != null ? photoSize.size : 0, hfVar, this.H1, "100_100_b", "jpg", org.telegram.messenger.ic.i(photoSize, hfVar.K), org.telegram.messenger.ic.i(w10, hfVar.K));
                    } else {
                        c91 c91Var4 = this.y0;
                        String str2 = hfVar.C;
                        String str3 = this.H1;
                        String str4 = hfVar.D;
                        c91Var4.getClass();
                        c91Var4.o(org.telegram.messenger.ic.g(str2), str3, org.telegram.messenger.ic.g(str4), "100_100_b", null, null, 0, null);
                    }
                }
            } else if (r6Var == null) {
                this.y0.setBackground(org.telegram.ui.ActionBar.t6.s0());
            } else {
                org.telegram.ui.Components.a9 a9Var = this.v1;
                if (a9Var != null) {
                    a9Var.dispose();
                    this.v1 = null;
                }
                int E0 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.Be);
                int i18 = (int) r6Var.j;
                if (i18 != 0) {
                    E0 = i18;
                }
                int E02 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.Ce);
                long j10 = r6Var.k;
                int i19 = (int) j10;
                if (i19 == 0 && j10 != 0) {
                    E02 = 0;
                } else if (i19 != 0) {
                    E02 = i19;
                }
                int E03 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.De);
                long j11 = r6Var.l;
                int i20 = (int) j11;
                if (i20 == 0 && j11 != 0) {
                    E03 = 0;
                } else if (i20 != 0) {
                    E03 = i20;
                }
                int E04 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.Ee);
                long j12 = r6Var.m;
                int i21 = (int) j12;
                if (i21 == 0 && j12 != 0) {
                    E04 = 0;
                } else if (i21 != 0) {
                    E04 = i21;
                }
                if (TextUtils.isEmpty(r6Var.o) || org.telegram.ui.ActionBar.t6.c1()) {
                    Drawable t02 = org.telegram.ui.ActionBar.t6.t0();
                    if (t02 != null) {
                        if (t02 instanceof org.telegram.ui.Components.jb0) {
                            ((org.telegram.ui.Components.jb0) t02).q(this.y0);
                        }
                        this.y0.setBackground(t02);
                    }
                } else {
                    if (E03 != 0) {
                        Drawable background = this.y0.getBackground();
                        if (background instanceof org.telegram.ui.Components.jb0) {
                            jb0Var = (org.telegram.ui.Components.jb0) background;
                        } else {
                            org.telegram.ui.Components.jb0 jb0Var2 = new org.telegram.ui.Components.jb0();
                            jb0Var2.q(this.y0);
                            jb0Var = jb0Var2;
                            if (this.E1) {
                                jb0Var2.m(false);
                                jb0Var = jb0Var2;
                            }
                        }
                        jb0Var.n(E0, E02, E03, E04);
                        colorDrawable = jb0Var;
                    } else if (E02 != 0) {
                        org.telegram.ui.Components.f9 f9Var = new org.telegram.ui.Components.f9(org.telegram.ui.Components.f9.d(r6Var.n), new int[]{E0, E02});
                        this.v1 = f9Var.f(k2.m0.j0(0.5f, 3), new v81(this, i10), 100L);
                        colorDrawable = f9Var;
                    } else {
                        colorDrawable = new ColorDrawable(E0);
                    }
                    this.y0.setBackground(colorDrawable);
                    TLRPC.TL_wallPaper tL_wallPaper4 = this.X0;
                    if (tL_wallPaper4 != null) {
                        c91 c91Var5 = this.y0;
                        org.telegram.messenger.ic b11 = org.telegram.messenger.ic.b(tL_wallPaper4.document);
                        String str5 = this.H1;
                        TLRPC.TL_wallPaper tL_wallPaper5 = this.X0;
                        c91Var5.g(1, tL_wallPaper5.document.size, tL_wallPaper5, str5, null, "jpg", b11, null);
                    }
                }
                if (E02 == 0) {
                    int V0 = org.telegram.messenger.i0.V0(E0, false);
                    this.l1 = V0;
                    this.k1 = V0;
                } else if (E03 != 0) {
                    this.k1 = org.telegram.ui.Components.jb0.g(E0, E02, E03, E04);
                    this.l1 = 754974720;
                } else {
                    int V02 = org.telegram.messenger.i0.V0(org.telegram.messenger.i0.w0(E0, E02), false);
                    this.l1 = V02;
                    this.k1 = V02;
                }
                c91 c91Var6 = this.y0;
                if (c91Var6 != null) {
                    c91Var6.getImageReceiver().o1 = new PorterDuffColorFilter(this.k1, this.t1);
                    this.y0.getImageReceiver().setAlpha(Math.abs(this.m1));
                    this.y0.invalidate();
                    if (org.telegram.ui.ActionBar.t6.I.q() && (this.y0.getBackground() instanceof org.telegram.ui.Components.jb0)) {
                        org.telegram.ui.Cells.h0 h0Var = this.U0;
                        if (h0Var != null) {
                            h0Var.setTwoSided(true);
                        }
                        if (this.m1 < 0.0f) {
                            this.y0.getImageReceiver().m0(((org.telegram.ui.Components.jb0) this.y0.getBackground()).k);
                        }
                    } else {
                        this.y0.getImageReceiver().m0(null);
                        org.telegram.ui.Cells.h0 h0Var2 = this.U0;
                        if (h0Var2 != null) {
                            h0Var2.setTwoSided(false);
                        }
                    }
                    org.telegram.ui.Cells.h0 h0Var3 = this.U0;
                    if (h0Var3 != null) {
                        h0Var3.setProgress(this.m1);
                    }
                }
                if (this.K0 != null) {
                    int i22 = 0;
                    while (true) {
                        org.telegram.ui.Components.x71[] x71VarArr = this.K0;
                        if (i22 >= x71VarArr.length) {
                            break;
                        }
                        x71VarArr[i22].b(0, E0);
                        this.K0[i22].b(1, E02);
                        this.K0[i22].b(2, E03);
                        this.K0[i22].b(3, E04);
                        i22++;
                    }
                }
                ImageView imageView = this.G0;
                n81 n81Var = this.a;
                if (imageView != null) {
                    org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.Wc, n81Var, PorterDuff.Mode.MULTIPLY);
                }
                ImageView imageView2 = this.H0;
                if (imageView2 != null) {
                    org.telegram.ui.ActionBar.a7.t(imageView2, org.telegram.ui.ActionBar.t6.Wc, n81Var, PorterDuff.Mode.MULTIPLY);
                }
                Z0();
            }
        }
        this.E1 = false;
    }

    public final void g1(long j10) {
        this.K1 = j10;
        this.L1 = j10 == 0 || j10 == getUserConfig().e();
    }

    @Override // org.telegram.messenger.z5
    public final int getObserverTag() {
        return this.u1;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.ActionBar.p6 getResourceProvider() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        return this.M1 ? W0() : super.getThemeDescriptions();
    }

    public final void h1(org.telegram.ui.Cells.s0 s0Var) {
        float f7;
        if (this.y0 == null) {
            return;
        }
        Bitmap bitmap = this.a.i;
        if (bitmap != null) {
            float width = bitmap.getWidth();
            f7 = ((this.y0.getMeasuredWidth() - (Math.max(this.y0.getMeasuredWidth() / width, this.y0.getMeasuredHeight() / r0.i.getHeight()) * width)) / 2.0f) + this.Y1 + 0.0f;
        } else {
            f7 = this.Y1 + 0.0f;
        }
        float y3 = s0Var.getY() - ((-this.y0.J) + 0.0f);
        int measuredHeight = this.y0.getMeasuredHeight();
        float f10 = this.N1 ? this.o1 * this.p1 : 0.0f;
        s0Var.w0 = true;
        s0Var.v0 = measuredHeight;
        s0Var.t0 = y3;
        s0Var.u0 = f7;
        s0Var.b2 = f10;
        s0Var.c2.setColor(i0.b.o(-16777216, (int) (f10 * 255.0f)));
        s0Var.invalidate();
    }

    public final void i1() {
        if (this.u0 == null || this.L0 == null || this.w.g == 0) {
            return;
        }
        SharedPreferences d12 = org.telegram.messenger.vp.d1();
        if (d12.getBoolean("bganimationhint", false)) {
            return;
        }
        if (this.B0 == null) {
            org.telegram.ui.Components.q30 q30Var = new org.telegram.ui.Components.q30(getParentActivity(), 8);
            this.B0 = q30Var;
            q30Var.setShowingDuration(5000L);
            this.B0.setAlpha(0.0f);
            this.B0.setVisibility(4);
            this.B0.setText(org.telegram.messenger.cd.L0(2131753751, null));
            this.B0.setExtraTranslationY(org.telegram.messenger.i0.L(6.0f));
            this.l0.addView(this.B0, w7.b6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
        org.telegram.messenger.i0.h3(new t11(7, this, d12), 500L);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.b != 2) {
            return false;
        }
        if (!this.b2 || motionEvent == null) {
            return true;
        }
        return motionEvent.getY() <= ((float) (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.m));
    }

    public final void j1(int i10, boolean z10, boolean z11) {
        int indexOf;
        boolean z12 = z10 && i10 == 1 && this.X0 != null;
        int i11 = this.b;
        if (z10) {
            if (i10 != 0) {
                this.Y0 = this.X0;
                this.n1 = this.m1;
                this.R0.f();
                ArrayList arrayList = this.V0;
                if (arrayList != null) {
                    TLRPC.TL_wallPaper tL_wallPaper = this.X0;
                    if (tL_wallPaper == null) {
                        indexOf = 0;
                    } else {
                        indexOf = arrayList.indexOf(tL_wallPaper) + (i11 == 2 ? 1 : 0);
                    }
                    this.S0.h1(indexOf, (this.Q0.getMeasuredWidth() - org.telegram.messenger.i0.L(124.0f)) / 2);
                }
            } else if (i11 == 2) {
                this.b1 = this.a1;
                int i12 = this.c1;
                this.f1 = i12;
                int i13 = this.d1;
                this.g1 = i13;
                int i14 = this.e1;
                this.h1 = i14;
                this.j1 = this.P;
                this.W.f(0, 4, i14 != 0 ? 4 : i13 != 0 ? 3 : i12 != 0 ? 2 : 1, false);
                this.W.e(this.e1, 3);
                this.W.e(this.d1, 2);
                this.W.e(this.c1, 1);
                this.W.e(this.a1, 0);
            }
        }
        if (i11 == 1 || i11 == 2) {
            this.K0[z12 ? (char) 2 : (char) 0].setVisibility(0);
        }
        if (i10 == 1) {
            org.telegram.ui.Cells.h0 h0Var = this.U0;
            if (!h0Var.M) {
                float f7 = this.m1;
                if (f7 < 0.0f) {
                    float f10 = -f7;
                    this.m1 = f10;
                    h0Var.setProgress(f10);
                }
            }
        }
        FrameLayout[] frameLayoutArr = this.M0;
        if (!z11) {
            char c10 = i10 == 0 ? (char) 1 : (char) 0;
            if (z10) {
                frameLayoutArr[i10].setVisibility(0);
                if (i11 == 1) {
                    this.v0.setTranslationY(i10 == 1 ? -org.telegram.messenger.i0.L(21.0f) : 0.0f);
                    this.K0[2].setAlpha(z12 ? 1.0f : 0.0f);
                    this.K0[0].setAlpha(z12 ? 0.0f : 1.0f);
                    if (i10 == 1) {
                        frameLayoutArr[i10].setAlpha(1.0f);
                    } else {
                        frameLayoutArr[i10].setAlpha(1.0f);
                        frameLayoutArr[c10].setAlpha(0.0f);
                    }
                    org.telegram.messenger.i0.v1(this.W.E[1]);
                } else if (i11 == 2) {
                    this.v0.setTranslationY(org.telegram.messenger.i0.L((this.B1 == null ? 0 : 58) + 72) + (-org.telegram.messenger.i0.L(i10 == 0 ? 343.0f : 316.0f)) + (Y0() ? org.telegram.messenger.i0.n : 0));
                    this.K0[2].setAlpha(z12 ? 1.0f : 0.0f);
                    this.K0[0].setAlpha(z12 ? 0.0f : 1.0f);
                    if (frameLayoutArr[c10].getVisibility() == 0) {
                        frameLayoutArr[c10].setAlpha(0.0f);
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
                        frameLayoutArr[c10].setAlpha(0.0f);
                    }
                    org.telegram.messenger.i0.v1(this.W.E[1]);
                }
            } else {
                this.v0.setTranslationY(0.0f);
                frameLayoutArr[i10].setTranslationY(r9.getMeasuredHeight());
                this.K0[0].setAlpha(1.0f);
                this.K0[2].setAlpha(1.0f);
                this.y0.setAlpha(1.0f);
            }
            if (z10 && frameLayoutArr[c10].getVisibility() == 0) {
                frameLayoutArr[c10].setAlpha(1.0f);
                frameLayoutArr[c10].setVisibility(4);
            } else if (!z10) {
                frameLayoutArr[i10].setVisibility(4);
            }
            if (i11 == 1 || i11 == 2) {
                this.K0[z12 ? (char) 0 : (char) 2].setVisibility(4);
                return;
            } else {
                if (i10 == 1) {
                    frameLayoutArr[c10].setAlpha(0.0f);
                    return;
                }
                return;
            }
        }
        this.s1 = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        int i15 = i10 == 0 ? 1 : 0;
        if (z10) {
            frameLayoutArr[i10].setVisibility(0);
            if (i11 == 1) {
                arrayList2.add(ObjectAnimator.ofFloat(this.v0, (Property<i81, Float>) View.TRANSLATION_Y, i10 == 1 ? -org.telegram.messenger.i0.L(21.0f) : 0.0f));
                org.telegram.ui.Components.x71 x71Var = this.K0[2];
                Property property = View.ALPHA;
                arrayList2.add(ObjectAnimator.ofFloat(x71Var, (Property<org.telegram.ui.Components.x71, Float>) property, z12 ? 1.0f : 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.K0[0], (Property<org.telegram.ui.Components.x71, Float>) property, z12 ? 0.0f : 1.0f));
                if (i10 == 1) {
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], (Property<FrameLayout, Float>) property, 0.0f, 1.0f));
                } else {
                    frameLayoutArr[i10].setAlpha(1.0f);
                    arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i15], (Property<FrameLayout, Float>) property, 0.0f));
                }
                org.telegram.messenger.i0.v1(this.W.E[1]);
            } else if (i11 == 2) {
                i81 i81Var = this.v0;
                Property property2 = View.TRANSLATION_Y;
                arrayList2.add(ObjectAnimator.ofFloat(i81Var, (Property<i81, Float>) property2, org.telegram.messenger.i0.L((this.B1 == null ? 0 : 58) + 72) + (-frameLayoutArr[i10].getMeasuredHeight()) + (Y0() ? org.telegram.messenger.i0.n : 0)));
                org.telegram.ui.Components.x71 x71Var2 = this.K0[2];
                Property property3 = View.ALPHA;
                arrayList2.add(ObjectAnimator.ofFloat(x71Var2, (Property<org.telegram.ui.Components.x71, Float>) property3, z12 ? 1.0f : 0.0f));
                arrayList2.add(ObjectAnimator.ofFloat(this.K0[0], (Property<org.telegram.ui.Components.x71, Float>) property3, z12 ? 0.0f : 1.0f));
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
                org.telegram.messenger.i0.v1(this.W.E[1]);
            }
        } else {
            i81 i81Var2 = this.v0;
            Property property4 = View.TRANSLATION_Y;
            arrayList2.add(ObjectAnimator.ofFloat(i81Var2, (Property<i81, Float>) property4, 0.0f));
            arrayList2.add(ObjectAnimator.ofFloat(frameLayoutArr[i10], (Property<FrameLayout, Float>) property4, r6.getMeasuredHeight()));
            org.telegram.ui.Components.x71 x71Var3 = this.K0[0];
            Property property5 = View.ALPHA;
            arrayList2.add(ObjectAnimator.ofFloat(x71Var3, (Property<org.telegram.ui.Components.x71, Float>) property5, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(this.K0[2], (Property<org.telegram.ui.Components.x71, Float>) property5, 0.0f));
            arrayList2.add(ObjectAnimator.ofFloat(this.y0, (Property<c91, Float>) property5, 1.0f));
        }
        this.s1.playTogether(arrayList2);
        this.s1.addListener(new u81(this, z10, i15, i10, z12));
        this.s1.setInterpolator(org.telegram.ui.Components.gr.g);
        this.s1.setDuration(200L);
        this.s1.start();
    }

    public final void k1() {
        if (this.i2 != null) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) (Y0() ? this.parentLayout.getBottomSheet().getWindow() : getParentActivity().getWindow()).getDecorView();
        Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        this.P1.setAlpha(0.0f);
        frameLayout.draw(canvas);
        this.P1.setAlpha(1.0f);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        paint2.setFilterBitmap(true);
        int[] iArr = new int[2];
        this.P1.getLocationInWindow(iArr);
        float f7 = iArr[0];
        float f10 = iArr[1];
        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.i0.n;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        ic icVar = new ic(this, getParentActivity(), canvas, (this.P1.getMeasuredWidth() / 2.0f) + f7, (this.P1.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 2);
        this.i2 = icVar;
        icVar.setOnTouchListener(new org.telegram.ui.ActionBar.n2(1));
        this.j2 = 0.0f;
        int i10 = 2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.k2 = ofFloat;
        ofFloat.addUpdateListener(new jc(this, i10));
        this.k2.addListener(new r81(this, 4));
        this.k2.setDuration(400L);
        this.k2.setInterpolator(org.telegram.ui.Components.vs.e);
        this.k2.start();
        frameLayout.addView(this.i2, new ViewGroup.LayoutParams(-1, -1));
        org.telegram.messenger.i0.g3(new a81(this, i10));
    }

    public final void l1(boolean z10) {
        long j10 = this.K1;
        if (j10 > 0) {
            this.A1.d(org.telegram.messenger.cd.L0(2131754212, null));
            return;
        }
        if (j10 >= 0) {
            this.A1.d(org.telegram.messenger.cd.L0(2131754214, null));
            return;
        }
        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-this.K1));
        int i10 = 1;
        if (L0 == null) {
            this.A1.d(org.telegram.messenger.cd.a0(null, null, 2131754213, org.telegram.messenger.cd.L0(2131754904, null).toLowerCase()));
            return;
        }
        this.A1.d(org.telegram.messenger.cd.a0(null, null, 2131754213, L0.title));
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.W1;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < V0()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
            if (this.r1 == null) {
                org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(R.drawable.mini_switch_lock, 0);
                this.r1 = dqVar;
                dqVar.n = 1;
            }
            spannableStringBuilder.setSpan(this.r1, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) org.telegram.messenger.cd.G(V0(), "ReactionLevelRequiredBtn", new Object[0]));
            this.A1.c(spannableStringBuilder, z10);
            return;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.W1;
        if (tL_premium_boostsStatus2 != null) {
            this.A1.c(null, z10);
            return;
        }
        if (this.K1 >= 0 || this.U1 || this.V1 || tL_premium_boostsStatus2 != null) {
            return;
        }
        this.U1 = true;
        getMessagesController().G0().a(this.K1, new d81(this, i10));
    }

    public final void m1() {
        if (this.G1 && this.x1 == null) {
            Bitmap bitmap = this.D1;
            if (bitmap != null) {
                this.y1 = bitmap;
                this.x1 = Utilities.e(bitmap);
            } else {
                ImageReceiver imageReceiver = this.y0.getImageReceiver();
                if (imageReceiver.L() || imageReceiver.m0 != null) {
                    this.y1 = imageReceiver.n();
                    this.x1 = Utilities.e(imageReceiver.n());
                }
            }
        }
        if (!this.G1) {
            f1(false);
            return;
        }
        Bitmap bitmap2 = this.x1;
        if (bitmap2 != null) {
            this.y0.setImageBitmap(bitmap2);
        }
    }

    public final void n1() {
        File A;
        String name;
        int i10;
        long j10;
        File file;
        String str;
        FrameLayout frameLayout;
        Object obj = this.X0;
        if (obj == null) {
            obj = this.C1;
        }
        boolean z10 = obj instanceof TLRPC.TL_wallPaper;
        if (z10 || (obj instanceof org.telegram.messenger.hf)) {
            if (z10) {
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
                str = org.telegram.messenger.b8.r(null, tL_wallPaper.document);
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                org.telegram.messenger.b8.G(this.currentAccount);
                file = org.telegram.messenger.b8.K(tL_wallPaper.document, null, true, true);
                j10 = tL_wallPaper.document.size;
            } else {
                org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) obj;
                TLRPC.Photo photo = hfVar.K;
                if (photo != null) {
                    TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(photo.sizes, this.I1, true, null, false);
                    org.telegram.messenger.b8.G(this.currentAccount);
                    A = org.telegram.messenger.b8.K(w9, null, true, true);
                    name = org.telegram.messenger.b8.r(null, w9);
                    i10 = w9.size;
                } else {
                    A = org.telegram.messenger.hc.A(hfVar.C);
                    name = A.getName();
                    i10 = hfVar.G;
                }
                j10 = i10;
                String str2 = name;
                file = A;
                str = str2;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
            }
            boolean exists = file.exists();
            int i11 = this.b;
            if (exists) {
                org.telegram.messenger.b6.q(this.currentAccount).v(this);
                this.y0.invalidate();
                if (i11 == 2) {
                    if (j10 == 0 || this.K1 != 0) {
                        this.t0.setSubtitle(null);
                    } else {
                        this.t0.setSubtitle(org.telegram.messenger.i0.i0(j10, false, false));
                    }
                }
            } else {
                org.telegram.messenger.b6.q(this.currentAccount).a(str, null, this);
                if (i11 == 2 && this.K1 == 0) {
                    this.t0.setSubtitle(org.telegram.messenger.cd.L0(2131748788, null));
                }
                this.y0.invalidate();
            }
            if (this.X0 == null && (frameLayout = this.z0) != null) {
                frameLayout.setAlpha(exists ? 1.0f : 0.5f);
            }
            if (i11 == 0) {
                this.d0.setEnabled(exists);
                this.d0.setAlpha(exists ? 1.0f : 0.5f);
                return;
            }
            if (i11 != 2) {
                this.f.setEnabled(exists);
                this.f.setAlpha(exists ? 1.0f : 0.5f);
                return;
            }
            this.D0.setEnabled(exists);
            d91 d91Var = this.A1;
            if (d91Var != null) {
                d91Var.setAlpha(exists ? 1.0f : 0.5f);
            }
            d91 d91Var2 = this.B1;
            if (d91Var2 != null) {
                d91Var2.setAlpha(exists ? 1.0f : 0.5f);
            }
        }
    }

    public final void o1() {
        this.y0.getImageReceiver().setAlpha(Math.abs(this.m1));
        this.y0.invalidate();
        this.Q0.g1();
        if (this.m1 >= 0.0f) {
            this.y0.getImageReceiver().m0(null);
        } else {
            if (Build.VERSION.SDK_INT >= 29) {
                this.y0.getImageReceiver().Z(null);
            }
            if (this.y0.getBackground() instanceof org.telegram.ui.Components.jb0) {
                this.y0.getImageReceiver().m0(((org.telegram.ui.Components.jb0) this.y0.getBackground()).k);
            }
        }
        this.a.k(this.y0.getBackground(), this.y0.getBackground(), Float.valueOf(this.m1));
        Z0();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onBackPressed(boolean z10) {
        if (!T0(z10)) {
            return false;
        }
        R0(true);
        return super.onBackPressed(z10);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onBottomSheetCreated() {
        super.onBottomSheetCreated();
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        if (z4Var == null || z4Var.getBottomSheet() == null) {
            return;
        }
        this.parentLayout.getBottomSheet().P(getThemedColor(org.telegram.ui.ActionBar.t6.h5));
        if (this.b != 2 || this.K1 == 0) {
            return;
        }
        this.parentLayout.getBottomSheet().E0(-16777216);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.p3);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.i4);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.j4);
        getNotificationCenter().c(this, org.telegram.messenger.zs.u5);
        int i10 = this.b;
        if (i10 == 1 || i10 == 0) {
            org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.z4);
        }
        if (i10 == 2 || i10 == 1) {
            org.telegram.ui.ActionBar.t6.N = true;
        }
        if (i10 == 0 && this.w == null) {
            this.F1 = org.telegram.ui.ActionBar.t6.i0;
        } else {
            Point point = org.telegram.messenger.i0.q;
            int min = Math.min(point.x, point.y);
            int max = Math.max(point.x, point.y);
            StringBuilder sb2 = new StringBuilder();
            sb2.append((int) (min / org.telegram.messenger.i0.p));
            sb2.append("_");
            this.H1 = a1.g.p(sb2, (int) (max / org.telegram.messenger.i0.p), "_f");
            this.I1 = Math.max(point.x, point.y);
            org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.f4);
            org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.e4);
            this.u1 = org.telegram.messenger.b6.q(this.currentAccount).k();
            if (this.V0 == null) {
                this.V0 = new ArrayList();
                org.telegram.messenger.hs.a0(this.currentAccount).p0();
            }
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.p3);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.i4);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.j4);
        getNotificationCenter().n(this, org.telegram.messenger.zs.u5);
        fg.i iVar = this.l0;
        if (iVar != null && this.R != null) {
            iVar.getViewTreeObserver().removeOnGlobalLayoutListener(this.R);
        }
        int i10 = this.b;
        if ((i10 == 2 || i10 == 1) && this.q1 == null) {
            org.telegram.messenger.i0.g3(new org.telegram.ui.Components.voip.m0(16));
        }
        int i11 = org.telegram.messenger.zs.z4;
        if (i10 == 2) {
            Bitmap bitmap = this.x1;
            if (bitmap != null) {
                bitmap.recycle();
                this.x1 = null;
            }
            this.a.k(null, null, null);
            org.telegram.messenger.zs.e().k(i11, new Object[0]);
        } else if (i10 == 1 || i10 == 0) {
            org.telegram.messenger.zs.e().n(this, i11);
        }
        if (i10 != 0 || this.w != null) {
            org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.f4);
            org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.e4);
        }
        super.onFragmentDestroy();
        S0(null);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onPause() {
        super.onPause();
        if (this.F1) {
            this.w1.c(false);
        }
        org.telegram.ui.ActionBar.t6.b = false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        fg.j jVar = this.p0;
        if (jVar != null) {
            jVar.f();
        }
        i91 i91Var = this.w0;
        if (i91Var != null) {
            i91Var.f();
        }
        if (this.F1) {
            this.w1.c(true);
        }
        org.telegram.ui.ActionBar.t6.b = true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            U0();
            try {
                z4.g gVar = this.k0;
                if (gVar != null) {
                    org.telegram.messenger.i0.B3(gVar, getThemedColor(org.telegram.ui.ActionBar.t6.s8));
                }
                org.telegram.ui.Cells.h0 h0Var = this.U0;
                if (h0Var != null) {
                    h0Var.setOuterColor(getThemedColor(org.telegram.ui.ActionBar.t6.Jj));
                    this.U0.invalidate();
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        if (z10 || this.b != 2) {
            return;
        }
        this.a.k(null, null, null);
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.z4, new Object[0]);
    }

    public final void p1() {
        int i10 = this.b;
        if (i10 == 1 || i10 == 2) {
            if (this.X0 == null && (this.C1 instanceof me1)) {
                this.K0[2].a(false, true);
            }
            this.K0[this.X0 != null ? (char) 2 : (char) 0].setVisibility(0);
            AnimatorSet animatorSet = new AnimatorSet();
            org.telegram.ui.Components.x71 x71Var = this.K0[2];
            Property property = View.ALPHA;
            animatorSet.playTogether(ObjectAnimator.ofFloat(x71Var, (Property<org.telegram.ui.Components.x71, Float>) property, this.X0 != null ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.K0[0], (Property<org.telegram.ui.Components.x71, Float>) property, this.X0 != null ? 0.0f : 1.0f));
            animatorSet.addListener(new s81(this));
            animatorSet.setInterpolator(org.telegram.ui.Components.gr.g);
            animatorSet.setDuration(200L);
            animatorSet.start();
            return;
        }
        boolean isEnabled = this.K0[0].isEnabled();
        TLRPC.TL_wallPaper tL_wallPaper = this.X0;
        if (isEnabled == (tL_wallPaper != null)) {
            return;
        }
        if (tL_wallPaper == null) {
            this.K0[0].a(false, true);
        }
        this.K0[0].setEnabled(this.X0 != null);
        if (this.X0 != null) {
            this.K0[0].setVisibility(0);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.K0[1].getLayoutParams();
        AnimatorSet animatorSet2 = new AnimatorSet();
        int L = (org.telegram.messenger.i0.L(9.0f) + layoutParams.width) / 2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.K0[0], (Property<org.telegram.ui.Components.x71, Float>) View.ALPHA, this.X0 == null ? 0.0f : 1.0f));
        org.telegram.ui.Components.x71 x71Var2 = this.K0[0];
        Property property2 = View.TRANSLATION_X;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(x71Var2, (Property<org.telegram.ui.Components.x71, Float>) property2, this.X0 != null ? 0.0f : L));
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.K0[1], (Property<org.telegram.ui.Components.x71, Float>) property2, this.X0 == null ? -L : 0.0f));
        animatorSet2.setInterpolator(org.telegram.ui.Components.gr.g);
        animatorSet2.setDuration(200L);
        animatorSet2.addListener(new t81(this));
        animatorSet2.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x008d, code lost:
    
        if (r3 != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (r23.c1 != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q1(boolean z10) {
        int i10;
        int i11;
        char c10;
        float f7;
        int i12;
        l81 l81Var;
        boolean z11;
        int i13;
        BlendMode blendMode;
        int i14 = Build.VERSION.SDK_INT;
        int i15 = this.b;
        org.telegram.ui.ActionBar.r6 r6Var = this.w;
        if (i14 >= 29) {
            if (i15 == 0) {
                i13 = r6Var != null ? (int) r6Var.l : getThemedColor(org.telegram.ui.ActionBar.t6.De);
            } else if (i15 == 1) {
                i13 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.De);
                long j10 = r6Var.l;
                int i16 = (int) j10;
                if (i16 != 0 || j10 == 0) {
                    if (i16 != 0) {
                        i13 = i16;
                    }
                }
                i13 = 0;
            } else {
                if (this.C1 instanceof me1) {
                    i13 = this.d1;
                }
                i13 = 0;
            }
            if (i13 == 0 || this.m1 < 0.0f) {
                this.y0.getImageReceiver().Z(null);
            } else {
                ImageReceiver imageReceiver = this.y0.getImageReceiver();
                blendMode = BlendMode.SOFT_LIGHT;
                imageReceiver.Z(blendMode);
            }
        }
        int i17 = 2;
        if (this.E0 != null) {
            if (i15 != 2) {
                if (i15 == 1) {
                    int E0 = org.telegram.ui.ActionBar.t6.E0(org.telegram.ui.ActionBar.t6.Ce);
                    long j11 = r6Var.k;
                    int i18 = (int) j11;
                    if (i18 == 0 && j11 != 0) {
                        E0 = 0;
                    } else if (i18 != 0) {
                        E0 = i18;
                    }
                }
                z11 = false;
            }
            boolean z12 = this.E0.getTag() != null;
            this.E0.setTag(z11 ? 1 : null);
            if (z12 != z11) {
                if (z11) {
                    this.E0.setVisibility(0);
                }
                AnimatorSet animatorSet = this.I0;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                if (z10) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.I0 = animatorSet2;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.E0, (Property<l81, Float>) View.ALPHA, z11 ? 1.0f : 0.0f);
                    c10 = 4;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.E0, (Property<l81, Float>) View.SCALE_X, z11 ? 1.0f : 0.0f);
                    f7 = 1.0f;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.E0, (Property<l81, Float>) View.SCALE_Y, z11 ? 1.0f : 0.0f);
                    org.telegram.ui.Components.x71 x71Var = this.K0[0];
                    Property property = View.TRANSLATION_X;
                    i11 = 3;
                    i12 = 5;
                    i10 = 0;
                    animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(x71Var, (Property<org.telegram.ui.Components.x71, Float>) property, z11 ? org.telegram.messenger.i0.L(34.0f) : 0.0f), ObjectAnimator.ofFloat(this.K0[1], (Property<org.telegram.ui.Components.x71, Float>) property, z11 ? -org.telegram.messenger.i0.L(34.0f) : 0.0f), ObjectAnimator.ofFloat(this.K0[2], (Property<org.telegram.ui.Components.x71, Float>) property, z11 ? org.telegram.messenger.i0.L(34.0f) : 0.0f));
                    this.I0.setDuration(180L);
                    this.I0.addListener(new r81(this, i17));
                    this.I0.setInterpolator(org.telegram.ui.Components.gr.g);
                    this.I0.start();
                } else {
                    i10 = 0;
                    i11 = 3;
                    c10 = 4;
                    f7 = 1.0f;
                    i12 = 5;
                    this.E0.setAlpha(z11 ? 1.0f : 0.0f);
                    this.E0.setScaleX(z11 ? 1.0f : 0.0f);
                    this.E0.setScaleY(z11 ? 1.0f : 0.0f);
                    this.K0[0].setTranslationX(z11 ? org.telegram.messenger.i0.L(34.0f) : 0.0f);
                    this.K0[1].setTranslationX(z11 ? -org.telegram.messenger.i0.L(34.0f) : 0.0f);
                    this.K0[2].setTranslationX(z11 ? org.telegram.messenger.i0.L(34.0f) : 0.0f);
                }
                l81Var = this.F0;
                if (l81Var == null) {
                    int i19 = l81Var.getTag() != null ? 1 : i10;
                    this.F0.setTag(1);
                    if (i19 != 1) {
                        this.F0.setVisibility(i10);
                        AnimatorSet animatorSet3 = this.J0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        if (!z10) {
                            float f10 = f7;
                            this.F0.setAlpha(f10);
                            this.F0.setScaleX(f10);
                            this.F0.setScaleY(f10);
                            this.L0[0].setTranslationX(-org.telegram.messenger.i0.L(34.0f));
                            this.L0[1].setTranslationX(org.telegram.messenger.i0.L(34.0f));
                            return;
                        }
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        this.J0 = animatorSet4;
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.F0, (Property<l81, Float>) View.ALPHA, f7);
                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.F0, (Property<l81, Float>) View.SCALE_X, f7);
                        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.F0, (Property<l81, Float>) View.SCALE_Y, f7);
                        org.telegram.ui.Components.x71 x71Var2 = this.L0[0];
                        Property property2 = View.TRANSLATION_X;
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(x71Var2, (Property<org.telegram.ui.Components.x71, Float>) property2, -org.telegram.messenger.i0.L(34.0f));
                        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.L0[1], (Property<org.telegram.ui.Components.x71, Float>) property2, org.telegram.messenger.i0.L(34.0f));
                        Animator[] animatorArr = new Animator[i12];
                        animatorArr[0] = ofFloat4;
                        animatorArr[1] = ofFloat5;
                        animatorArr[2] = ofFloat6;
                        animatorArr[i11] = ofFloat7;
                        animatorArr[c10] = ofFloat8;
                        animatorSet4.playTogether(animatorArr);
                        this.J0.setDuration(180L);
                        this.J0.addListener(new r81(this, i11));
                        this.J0.setInterpolator(org.telegram.ui.Components.gr.g);
                        this.J0.start();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        i10 = 0;
        i11 = 3;
        c10 = 4;
        f7 = 1.0f;
        i12 = 5;
        l81Var = this.F0;
        if (l81Var == null) {
        }
    }

    public final void r1() {
        int childCount = this.Q0.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.Q0.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.n5) {
                ((org.telegram.ui.Cells.n5) childAt).w(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void setResourceProvider(org.telegram.ui.ActionBar.p6 p6Var) {
        this.a.a = p6Var;
    }

    public m91(org.telegram.ui.ActionBar.s6 s6Var, boolean z10, int i10, boolean z11, boolean z12) {
        super(null);
        this.a = new n81(this);
        this.d = true;
        this.n = 1;
        org.telegram.ui.ActionBar.a6 a6Var = new org.telegram.ui.ActionBar.a6(this, 0, false);
        this.S = a6Var;
        org.telegram.ui.ActionBar.a6 a6Var2 = new org.telegram.ui.ActionBar.a6(this, 0, true);
        this.T = a6Var2;
        org.telegram.ui.ActionBar.a6 a6Var3 = new org.telegram.ui.ActionBar.a6(this, 1, false);
        this.U = a6Var3;
        org.telegram.ui.ActionBar.a6 a6Var4 = new org.telegram.ui.ActionBar.a6(this, 1, true);
        this.V = a6Var4;
        this.Y = -1;
        this.Z = new a81(this, 0);
        this.x0 = new c91[2];
        this.M0 = new FrameLayout[2];
        this.N0 = new TextView[2];
        this.O0 = new TextView[2];
        this.P0 = new FrameLayout[2];
        this.W0 = new HashMap();
        this.m1 = 0.5f;
        this.o1 = 0.0f;
        this.t1 = PorterDuff.Mode.SRC_IN;
        this.z1 = 1.0f;
        this.H1 = "640_360";
        this.I1 = 1920;
        this.L1 = true;
        this.T1 = new org.telegram.ui.Components.p10(getParentActivity(), new p81(this));
        this.U1 = false;
        this.V1 = false;
        this.b = i10;
        this.g0 = z12;
        this.f0 = s6Var;
        this.i0 = z10;
        this.h0 = z11;
        if (i10 == 1) {
            org.telegram.ui.ActionBar.r6 k10 = s6Var.k(!z11);
            this.w = k10;
            if (k10 != null) {
                this.d = false;
                this.y = k10.c;
                this.D = k10.d;
                this.E = k10.e;
                this.F = k10.f;
                this.G = k10.g;
                this.H = k10.h;
                this.I = k10.i;
                this.J = k10.j;
                this.K = k10.k;
                this.L = k10.l;
                this.M = k10.m;
                this.N = k10.p;
                this.O = k10.o;
                this.P = k10.n;
            }
        } else {
            if (i10 == 0) {
                this.d = false;
            }
            org.telegram.ui.ActionBar.r6 k11 = s6Var.k(false);
            this.w = k11;
            if (k11 != null) {
                this.X0 = k11.s;
            }
        }
        org.telegram.ui.ActionBar.r6 r6Var = this.w;
        if (r6Var != null) {
            this.F1 = r6Var.q;
            if (!TextUtils.isEmpty(r6Var.o)) {
                this.m1 = this.w.p;
            }
            org.telegram.ui.ActionBar.t6.M = org.telegram.ui.ActionBar.t6.D0();
            org.telegram.ui.ActionBar.t6.O = true;
            org.telegram.ui.ActionBar.t6.P = true;
            org.telegram.ui.ActionBar.t6.u(s6Var, false, false);
        }
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.u4, new Object[0]);
        a6Var.v = true;
        a6Var3.v = true;
        a6Var2.v = true;
        a6Var4.v = true;
    }

    @Override // org.telegram.messenger.z5
    public final void i(long j10, long j11) {
    }

    @Override // org.telegram.messenger.z5
    public final void n(long j10, long j11) {
    }

    public m91(org.telegram.ui.ActionBar.s6 s6Var) {
        this(s6Var, false, 0, false, false);
    }
}
