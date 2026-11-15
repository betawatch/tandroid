package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Property;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.TreeSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public class ChatActivityEnterView extends FrameLayout implements org.telegram.messenger.is, rt0, yv0, pw0, te.b, org.telegram.ui.ActionBar.z5 {
    public static final /* synthetic */ int N6 = 0;
    public boolean A0;
    public long A1;
    public uc A2;
    public int A3;
    public final RectF A4;
    public float A5;
    public final u5 A6;
    public boolean B0;
    public boolean B1;
    public int B2;
    public org.telegram.messenger.gj B3;
    public final Rect B4;
    public float B5;
    public final u5 B6;
    public final HashMap C0;
    public boolean C1;
    public ck0 C2;
    public org.telegram.messenger.gj C3;
    public final Rect C4;
    public float C5;
    public rh.e C6;
    public boolean D0;
    public dh.c D1;
    public Editable D2;
    public org.telegram.ui.qm D3;
    public Drawable D4;
    public float D5;
    public lh.h D6;
    public float E;
    public boolean E0;
    public fh.g E1;
    public boolean E2;
    public org.telegram.messenger.gj E3;
    public final org.telegram.ui.ActionBar.e6 E4;
    public float E5;
    public final te.c E6;
    public float F;
    public xe F0;
    public fh.g F1;
    public boolean F2;
    public TLRPC.WebPage F3;
    public final boolean F4;
    public float F5;
    public final te.a F6;
    public float G;
    public final kg G0;
    public final Paint G1;
    public boolean G2;
    public boolean G3;
    public final ke G4;
    public float G5;
    public final te.a G6;
    public float H;
    public int H0;
    public float H1;
    public org.telegram.messenger.gj H2;
    public cg H3;
    public final td H4;
    public boolean H5;
    public final te.a H6;
    public float I;
    public uc I0;
    public ValueAnimator I1;
    public boolean I2;
    public vf I3;
    public final td I4;
    public final Paint I5;
    public float I6;
    public float J;
    public final jh.h J0;
    public final int[] J1;
    public TL_account.TL_businessChatLink J2;
    public TLRPC.TL_document J3;
    public final td J4;
    public boolean J5;
    public float J6;
    public boolean K;
    public final he K0;
    public final int[] K1;
    public xf K2;
    public String K3;
    public final td K4;
    public float K5;
    public boolean K6;
    public TLRPC.UserFull L;
    public int L0;
    public yh.a L1;
    public TLRPC.ChatFull L2;
    public org.telegram.messenger.gj L3;
    public final td L4;
    public float L5;
    public int L6;
    public hi.l3 M;
    public org.telegram.ui.bg0 M0;
    public boolean M1;
    public boolean M2;
    public org.telegram.messenger.g20 M3;
    public boolean M4;
    public float M5;
    public int M6;
    public hi.l3 N;
    public long N0;
    public float N1;
    public int N2;
    public boolean N3;
    public long N4;
    public float N5;
    public hi.l3 O;
    public te O0;
    public ValueAnimator O1;
    public boolean O2;
    public boolean O3;
    public float O4;
    public boolean O5;
    public boolean P;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout P0;
    public final uc P1;
    public boolean P2;
    public boolean P3;
    public float P4;
    public boolean P5;
    public boolean Q;
    public final ImageView Q0;
    public long Q1;
    public boolean Q2;
    public org.telegram.messenger.gj Q3;
    public float Q4;
    public boolean Q5;
    public int R;
    public final wd R0;
    public boolean R1;
    public boolean R2;
    public TL_keyboard.KeyboardButtonProto R3;
    public float R4;
    public boolean R5;
    public org.telegram.messenger.c S;
    public final ImageView S0;
    public SlideTextView S1;
    public boolean S2;
    public boolean S3;
    public float S4;
    public boolean S5;
    public boolean T;
    public zd T0;
    public ig T1;
    public boolean T2;
    public boolean T3;
    public float T4;
    public final Paint T5;
    public int U;
    public boolean U0;
    public final st0 U1;
    public org.telegram.messenger.gj U2;
    public boolean U3;
    public float U4;
    public float U5;
    public org.telegram.ui.ActionBar.i1 V;
    public sf V0;
    public ViewGroup V1;
    public TLRPC.TL_replyKeyboardMarkup V2;
    public boolean V3;
    public float V4;
    public final Rect V5;
    public nd W;
    public AnimatorSet W0;
    public int W1;
    public int W2;
    public int W3;
    public float W4;
    public boolean W5;
    public boolean X0;
    public final org.telegram.ui.z51 X1;
    public boolean X2;
    public boolean X3;
    public float X4;
    public final uc X5;
    public boolean Y0;
    public ViewPropertyAnimator Y1;
    public PowerManager.WakeLock Y2;
    public boolean Y3;
    public float Y4;
    public org.telegram.ui.ActionBar.z0 Y5;
    public lg Z0;
    public final zd Z1;
    public AnimatorSet Z2;
    public final ke Z3;
    public boolean Z4;
    public ArrayList Z5;
    public int a;
    public od a0;
    public final ee a1;
    public final org.telegram.ui.ActionBar.t2 a2;
    public AnimatorSet a3;
    public final ne a4;
    public boolean a5;
    public boolean a6;
    public boolean b;
    public boolean b0;
    public boolean b1;
    public final ImageView b2;
    public AnimatorSet b3;
    public final org.telegram.ui.Cells.g1 b4;
    public int b5;
    public View b6;
    public org.telegram.ui.ActionBar.z0 c;
    public NumberTextView c0;
    public final fe c1;
    public final ImageView c2;
    public AnimatorSet c3;
    public final af c4;
    public long c5;
    public boolean c6;
    public LinearLayout d;
    public int d0;
    public boolean d1;
    public float d2;
    public int d3;
    public final jf d4;
    public boolean d5;
    public boolean d6;
    public CharSequence e;
    public int e0;
    public bi.v1 e1;
    public ImageView e2;
    public int e3;
    public final Paint e4;
    public ValueAnimator e5;
    public boolean e6;
    public String f;
    public br f0;
    public ud f1;
    public zd f2;
    public int f3;
    public boolean f4;
    public final TextPaint f5;
    public long f6;
    public Runnable g0;
    public i61 g1;
    public final ud g2;
    public int g3;
    public boolean g4;
    public final Paint g5;
    public org.telegram.messenger.f6 g6;
    public float h;
    public boolean h0;
    public fh0 h1;
    public final ud h2;
    public boolean h3;
    public boolean h4;
    public final Paint h5;
    public boolean h6;
    public boolean i0;
    public oi0 i1;
    public final ud i2;
    public int i3;
    public boolean i4;
    public final Path i5;
    public uc i6;
    public String j0;
    public ai.n0 j1;
    public final ImageView j2;
    public final boolean j3;
    public AnimatorSet j4;
    public final Path j5;
    public final eq[] j6;
    public String k0;
    public ji.m k1;
    public org.telegram.messenger.xt k2;
    public long k3;
    public float k4;
    public final RectF k5;
    public int k6;
    public ki.o3 l0;
    public boolean l1;
    public boolean l2;
    public float l3;
    public int l4;
    public final int[] l5;
    public int l6;
    public ki.a0 m0;
    public boolean m1;
    public TL_iv.RichMessage m2;
    public float m3;
    public boolean m4;
    public final int[] m5;
    public boolean m6;
    public float n;
    public ve n0;
    public float n1;
    public he n2;
    public boolean n3;
    public AnimatedArrowDrawable n4;
    public fh.g n5;
    public long n6;
    public ki.z o0;
    public float o1;
    public View o2;
    public int o3;
    public boolean o4;
    public fh.g o5;
    public int o6;
    public boolean p0;
    public float p1;
    public pf p2;
    public boolean p3;
    public final ke p4;
    public final nb.a p5;
    public int p6;
    public gn0 q0;
    public boolean q1;
    public final ImageView q2;
    public boolean q3;
    public boolean q4;
    public boolean q5;
    public boolean q6;
    public float r;
    public oe r0;
    public float r1;
    public je r2;
    public boolean r3;
    public boolean r4;
    public od r5;
    public boolean r6;
    public float s;
    public nd s0;
    public float s1;
    public zd s2;
    public boolean s3;
    public final tf s4;
    public ch0 s5;
    public bi.u s6;
    public int t0;
    public float t1;
    public boolean t2;
    public int t3;
    public final h2.f t4;
    public ch0 t5;
    public m60 t6;
    public int u0;
    public int u1;
    public AnimatorSet u2;
    public boolean u3;
    public final Paint u4;
    public ValueAnimator u5;
    public int u6;
    public nd v0;
    public final SparseArray v1;
    public RecordCircle v2;
    public final int[] v3;
    public Drawable v4;
    public float v5;
    public int v6;
    public boolean w;
    public ValueAnimator w0;
    public boolean w1;
    public gg w2;
    public final Activity w3;
    public Drawable w4;
    public float w5;
    public a0.h w6;
    public Runnable x;
    public float x0;
    public boolean x1;
    public final ge x2;
    public final org.telegram.ui.an x3;
    public Drawable x4;
    public nu0 x5;
    public final Paint x6;
    public float y;
    public boolean y0;
    public long y1;
    public final Paint y2;
    public long y3;
    public Drawable y4;
    public Bitmap y5;
    public final LinearGradient y6;
    public boolean z0;
    public Interpolator z1;
    public int z2;
    public boolean z3;
    public Drawable z4;
    public float z5;
    public final Matrix z6;

    /* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
    public class RecordCircle extends View {
        public int E;
        public final float F;
        public float G;
        public float H;
        public float I;
        public boolean J;
        public float K;
        public float L;
        public float M;
        public boolean N;
        public boolean O;
        public boolean P;
        public float Q;
        public final Paint R;
        public final Path S;
        public final Paint T;
        public final RectF U;
        public final int[] V;
        public final int[] W;
        public float a;
        public final float[] a0;
        public float b;
        public final float[] b0;
        public float c;
        public final int[] c0;
        public long d;
        public float d0;
        public float e;
        public float f;
        public final o9 h;
        public final o9 n;
        public final float r;
        public final float s;
        public final RectF w;
        public boolean x;
        public final hg y;

        public RecordCircle(Context context) {
            super(context);
            o9 o9Var = new o9(11, 360928);
            this.h = o9Var;
            o9 o9Var2 = new o9(12, 360928);
            this.n = o9Var2;
            this.r = org.telegram.messenger.g0.N(41.0f);
            this.s = org.telegram.messenger.g0.L(30.0f);
            this.w = new RectF();
            this.I = 0.0f;
            this.J = true;
            this.R = new Paint(1);
            this.S = new Path();
            this.T = new Paint(1);
            this.U = new RectF();
            this.V = new int[2];
            this.W = new int[2];
            this.a0 = new float[5];
            this.b0 = new float[5];
            this.c0 = new int[2];
            hg hgVar = new hg(this, this);
            this.y = hgVar;
            r0.i0.j(this, hgVar);
            o9Var.a = org.telegram.messenger.g0.L(47.0f);
            o9Var.b = org.telegram.messenger.g0.L(55.0f);
            o9Var.b();
            o9Var2.a = org.telegram.messenger.g0.L(47.0f);
            o9Var2.b = org.telegram.messenger.g0.L(55.0f);
            o9Var2.b();
            float scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            this.F = scaledTouchSlop * scaledTouchSlop;
            h();
        }

        public static float d(float f10) {
            float i7 = Utilities.i(f10, 1.0f, 0.0f);
            return i7 < 0.5f ? com.google.android.gms.internal.vision.e2.D(i7, 4.0f, i7, i7) : 1.0f - (((float) Math.pow((i7 * (-2.0f)) + 2.0f, 3.0d)) / 2.0f);
        }

        public static float e(float f10) {
            float i7 = 1.0f - Utilities.i(f10, 1.0f, 0.0f);
            return org.telegram.ui.Cells.y0.x(i7, i7, i7, 1.0f);
        }

        public static float i(float f10, float f11) {
            if (f10 <= 0.0f) {
                return 0.0f;
            }
            return (float) (Math.sin(f10 * 3.141592653589793d * 2.0d * f11) * Math.exp((-f10) * 8.5d));
        }

        public final void a() {
            ChatActivityEnterView.this.Z4 = true;
        }

        public final void b() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (chatActivityEnterView.x4 != null) {
                return;
            }
            chatActivityEnterView.x4 = getResources().getDrawable(R.drawable.input_mic_pressed).mutate();
            Drawable drawable = chatActivityEnterView.x4;
            int i7 = org.telegram.ui.ActionBar.j6.Tf;
            org.telegram.ui.ActionBar.e6 e6Var = chatActivityEnterView.E4;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.q6.x(this, drawable, i7, e6Var, mode);
            chatActivityEnterView.y4 = getResources().getDrawable(R.drawable.input_video_pressed).mutate();
            org.telegram.ui.ActionBar.q6.x(this, chatActivityEnterView.y4, i7, chatActivityEnterView.E4, mode);
            chatActivityEnterView.z4 = getResources().getDrawable(R.drawable.send_plane_24).mutate();
            org.telegram.ui.ActionBar.q6.x(this, chatActivityEnterView.z4, i7, chatActivityEnterView.E4, mode);
            chatActivityEnterView.v4 = getResources().getDrawable(R.drawable.input_mic).mutate();
            Drawable drawable2 = chatActivityEnterView.v4;
            int i10 = org.telegram.ui.ActionBar.j6.Nl;
            org.telegram.ui.ActionBar.q6.x(this, drawable2, i10, chatActivityEnterView.E4, mode);
            chatActivityEnterView.w4 = getResources().getDrawable(R.drawable.input_video).mutate();
            org.telegram.ui.ActionBar.q6.x(this, chatActivityEnterView.w4, i10, chatActivityEnterView.E4, mode);
        }

        public final void c(Canvas canvas, Drawable drawable, Drawable drawable2, float f10, int i7) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            float f11 = drawable == chatActivityEnterView.z4 ? (this.d0 * 0.1f) + 1.0f : 1.0f;
            if (f11 != 1.0f) {
                canvas.save();
                canvas.scale(f11, f11, drawable.getBounds().exactCenterX(), drawable.getBounds().exactCenterY());
            }
            b();
            if (f10 == 0.0f || f10 == 1.0f || drawable2 == null) {
                boolean z10 = chatActivityEnterView.Z4;
                ee eeVar = chatActivityEnterView.a1;
                if (z10 && chatActivityEnterView.R4 == 1.0f) {
                    chatActivityEnterView.c1.setAlpha(1.0f);
                    if (eeVar != null) {
                        eeVar.setAlpha(1.0f);
                        eeVar.setScaleX(1.0f);
                        eeVar.setScaleY(1.0f);
                    }
                    setVisibility(8);
                } else if (z10 && chatActivityEnterView.R4 < 1.0f) {
                    drawable.setAlpha(org.telegram.messenger.ns.e4);
                    drawable.draw(canvas);
                } else if (!z10) {
                    drawable.setAlpha(i7);
                    drawable.draw(canvas);
                }
            } else {
                canvas.save();
                canvas.scale(f10, f10, drawable.getBounds().centerX(), drawable.getBounds().centerY());
                float f12 = i7;
                drawable.setAlpha((int) (f12 * f10));
                drawable.draw(canvas);
                canvas.restore();
                canvas.save();
                float f13 = 1.0f - f10;
                canvas.scale(f13, f13, drawable.getBounds().centerX(), drawable.getBounds().centerY());
                drawable2.setAlpha((int) (f12 * f13));
                drawable2.draw(canvas);
                canvas.restore();
            }
            if (f11 != 1.0f) {
                canvas.restore();
            }
        }

        @Override // android.view.View
        public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
            return super.dispatchHoverEvent(motionEvent) || this.y.f(motionEvent);
        }

        public final void f(boolean z10) {
            this.P = false;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (!z10) {
                chatActivityEnterView.a5 = false;
                chatActivityEnterView.T4 = -1.0f;
                chatActivityEnterView.S4 = -1.0f;
                chatActivityEnterView.R4 = 1.0f;
                chatActivityEnterView.Y4 = 1.0f;
                chatActivityEnterView.V4 = 0.0f;
                chatActivityEnterView.Q4 = 0.0f;
            }
            invalidate();
            chatActivityEnterView.X4 = 0.0f;
            chatActivityEnterView.K0();
            chatActivityEnterView.U4 = 0.0f;
            chatActivityEnterView.P4 = 0.0f;
            chatActivityEnterView.O4 = 0.0f;
            chatActivityEnterView.M4 = false;
            this.f = 0.0f;
            chatActivityEnterView.Z4 = false;
            gg ggVar = chatActivityEnterView.w2;
            if (ggVar != null) {
                ggVar.invalidate();
            }
        }

        public final void g() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.a5 = false;
            invalidate();
            gg ggVar = chatActivityEnterView.w2;
            if (ggVar != null) {
                ggVar.invalidate();
            }
        }

        public float getControlsScale() {
            return ChatActivityEnterView.this.Q4;
        }

        public float getScale() {
            return ChatActivityEnterView.this.P4;
        }

        public float getTransformToSeekbarProgressStep3() {
            return this.e;
        }

        public final void h() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            Paint paint = chatActivityEnterView.u4;
            int i7 = org.telegram.ui.ActionBar.j6.Uf;
            paint.setColor(chatActivityEnterView.u0(i7));
            this.h.d.setColor(i0.a.o(chatActivityEnterView.u0(i7), 38));
            this.n.d.setColor(i0.a.o(chatActivityEnterView.u0(i7), 76));
            this.E = chatActivityEnterView.u4.getAlpha();
        }

        @Override // android.view.View
        public final void invalidate() {
            super.invalidate();
            gg ggVar = ChatActivityEnterView.this.w2;
            if (ggVar != null) {
                ggVar.invalidate();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:119:0x0490  */
        /* JADX WARN: Removed duplicated region for block: B:124:0x04ab  */
        /* JADX WARN: Removed duplicated region for block: B:185:0x0a95  */
        /* JADX WARN: Removed duplicated region for block: B:205:0x0baf  */
        /* JADX WARN: Removed duplicated region for block: B:223:0x0b90  */
        /* JADX WARN: Removed duplicated region for block: B:265:0x0b9d  */
        /* JADX WARN: Removed duplicated region for block: B:272:0x0383  */
        /* JADX WARN: Removed duplicated region for block: B:273:0x0372  */
        /* JADX WARN: Removed duplicated region for block: B:274:0x0305  */
        /* JADX WARN: Removed duplicated region for block: B:279:0x02b9  */
        /* JADX WARN: Removed duplicated region for block: B:285:0x024d  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0233  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0261  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x02f5  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x031d  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0380  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0389  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x03ab  */
        @Override // android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onDraw(Canvas canvas) {
            float f10;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
            float f19;
            float f20;
            Paint paint;
            float f21;
            float f22;
            float f23;
            float f24;
            Drawable drawable;
            Drawable drawable2;
            boolean e10;
            int i7;
            float f25;
            float f26;
            Drawable drawable3;
            Drawable drawable4;
            float f27;
            int i10;
            float f28;
            int i11;
            float f29;
            Drawable drawable5;
            Drawable drawable6;
            Paint paint2;
            Rect rect;
            Paint paint3;
            float f30;
            int i12;
            int i13;
            float f31;
            Drawable drawable7;
            float f32;
            float f33;
            oi0 oi0Var;
            float f34;
            int[] iArr;
            float f35;
            int i14;
            float f36;
            float f37;
            float f38;
            float f39;
            float cos;
            float f40;
            Path path;
            float f41;
            RectF rectF;
            Canvas canvas2;
            float f42;
            float f43;
            oi0 oi0Var2;
            Canvas canvas3 = canvas;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            Rect rect2 = chatActivityEnterView.B4;
            Paint paint4 = chatActivityEnterView.u4;
            if (this.O) {
                return;
            }
            if (this.P) {
                Paint paint5 = chatActivityEnterView.I5;
                if (chatActivityEnterView.H5) {
                    if (chatActivityEnterView.y5 != null) {
                        float f44 = chatActivityEnterView.D5 / 1000.0f;
                        float i15 = Utilities.i((f44 - 0.04f) / 0.2f, 1.0f, 0.0f);
                        float T1 = org.telegram.messenger.g0.T1(chatActivityEnterView.B5, chatActivityEnterView.C5, i15);
                        if (i15 < 1.0f) {
                            canvas3.save();
                            canvas3.clipRect(T1, chatActivityEnterView.A5, chatActivityEnterView.z5 + chatActivityEnterView.y5.getWidth(), chatActivityEnterView.A5 + chatActivityEnterView.y5.getHeight());
                            paint5.setAlpha((int) ((1.0f - ChatActivityEnterView.u2(0.015f, 0.09f, f44)) * 255.0f));
                            canvas3.drawBitmap(chatActivityEnterView.y5, chatActivityEnterView.z5, chatActivityEnterView.A5, paint5);
                            canvas3.restore();
                        }
                    }
                    nu0 nu0Var = chatActivityEnterView.x5;
                    if (nu0Var != null && nu0Var.b(canvas3, 1.0f)) {
                        invalidate();
                    }
                }
                this.d = System.currentTimeMillis();
                return;
            }
            int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.M(26.0f);
            int L = (int) (org.telegram.messenger.g0.L(170.0f) + 0.0f);
            this.K = chatActivityEnterView.b5 + measuredWidth;
            float f45 = L;
            this.L = f45;
            float f46 = chatActivityEnterView.P4;
            float f47 = f46 <= 0.5f ? f46 / 0.5f : f46 <= 0.75f ? 1.0f - (((f46 - 0.5f) / 0.25f) * 0.1f) : (((f46 - 0.75f) / 0.25f) * 0.1f) + 0.9f;
            long currentTimeMillis = System.currentTimeMillis() - this.d;
            float f48 = this.b;
            float f49 = this.a;
            if (f48 != f49) {
                float f50 = this.c;
                f10 = 1.0f;
                float f51 = (currentTimeMillis * f50) + f49;
                this.a = f51;
                if (f50 > 0.0f) {
                    if (f51 > f48) {
                        this.a = f48;
                    }
                } else if (f51 < f48) {
                    this.a = f48;
                }
                invalidate();
            } else {
                f10 = 1.0f;
            }
            float interpolation = chatActivityEnterView.Z4 ? er.g.getInterpolation(f10 - chatActivityEnterView.R4) * 0.7f : (chatActivityEnterView.R4 * 0.3f) + 0.7f;
            float f52 = this.s * this.a;
            float f53 = this.r;
            float f54 = (f52 + f53) * f47 * interpolation;
            this.e = 0.0f;
            float f55 = chatActivityEnterView.X4;
            if (f55 != 0.0f) {
                f11 = 0.6f;
                if (chatActivityEnterView.i1 != null) {
                    float f56 = f55 > 0.38f ? f10 : f55 / 0.38f;
                    float v = f55 > 0.63f ? f10 : org.telegram.ui.Cells.y0.v(f55, 0.38f, 0.25f, 0.0f);
                    this.e = Math.max(0.0f, ((chatActivityEnterView.X4 - 0.38f) - 0.25f) / 0.37f);
                    er erVar = er.j;
                    f16 = erVar.getInterpolation(f56);
                    float interpolation2 = erVar.getInterpolation(v);
                    f12 = 0.0f;
                    this.e = erVar.getInterpolation(this.e);
                    float L2 = org.telegram.messenger.g0.L(8.0f);
                    f13 = f53;
                    f17 = com.google.android.gms.internal.vision.e2.z(f10, interpolation2, ((org.telegram.messenger.g0.L(16.0f) * f16) + f54) - L2, L2);
                    f15 = 0.0f;
                    f18 = 1.0f;
                    f14 = interpolation2;
                    if (this.e <= f12) {
                        f19 = f15;
                        f20 = f16;
                        paint4.setColor(i0.a.f(this.e, chatActivityEnterView.u0(org.telegram.ui.ActionBar.j6.Uf), chatActivityEnterView.u0(org.telegram.ui.ActionBar.j6.bg)));
                    } else {
                        f19 = f15;
                        f20 = f16;
                        paint4.setColor(chatActivityEnterView.u0(org.telegram.ui.ActionBar.j6.Uf));
                    }
                    b();
                    if (chatActivityEnterView.a5) {
                        paint = paint4;
                        f21 = f14;
                        f22 = f17;
                        f23 = f54;
                        f24 = 12.0f;
                        drawable = chatActivityEnterView.d1 ? chatActivityEnterView.y4 : chatActivityEnterView.x4;
                        rect2.set(measuredWidth - org.telegram.messenger.g0.L(12.0f), L - org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + measuredWidth, org.telegram.messenger.g0.L(12.0f) + L);
                        drawable2 = null;
                    } else {
                        float f57 = this.f;
                        f24 = 12.0f;
                        if (f57 != 1.0f) {
                            float f58 = (currentTimeMillis / 150.0f) + f57;
                            this.f = f58;
                            if (f58 > 1.0f) {
                                this.f = 1.0f;
                            }
                            drawable2 = chatActivityEnterView.d1 ? chatActivityEnterView.y4 : chatActivityEnterView.x4;
                        } else {
                            drawable2 = null;
                        }
                        drawable = chatActivityEnterView.z4;
                        f21 = f14;
                        f23 = f54;
                        paint = paint4;
                        f22 = f17;
                        rect2.set(org.telegram.ui.Cells.y0.A(2, measuredWidth, drawable), org.telegram.ui.Cells.y0.y(2, L, drawable), org.telegram.ui.Cells.y0.w(2, measuredWidth, drawable), org.telegram.ui.Cells.y0.h(2, L, drawable));
                        if (drawable2 != null) {
                            drawable2.setBounds(org.telegram.ui.Cells.y0.A(2, measuredWidth, drawable2), org.telegram.ui.Cells.y0.y(2, L, drawable2), org.telegram.ui.Cells.y0.w(2, measuredWidth, drawable2), org.telegram.ui.Cells.y0.h(2, L, drawable2));
                        }
                    }
                    Drawable drawable8 = drawable;
                    drawable8.setBounds(rect2);
                    if (this.x) {
                        float f59 = chatActivityEnterView.W4 - 0.01f;
                        chatActivityEnterView.W4 = f59;
                        if (f59 < 0.0f) {
                            this.x = true;
                            chatActivityEnterView.W4 = 0.0f;
                        }
                    } else {
                        float f60 = chatActivityEnterView.W4 + 0.01f;
                        chatActivityEnterView.W4 = f60;
                        if (f60 > 1.0f) {
                            this.x = false;
                            chatActivityEnterView.W4 = 1.0f;
                        }
                    }
                    e10 = org.telegram.messenger.qc.e(360928);
                    o9 o9Var = this.n;
                    o9 o9Var2 = this.h;
                    if (e10) {
                        i7 = 1;
                    } else {
                        o9Var2.a = org.telegram.messenger.g0.L(47.0f);
                        i7 = 1;
                        o9Var2.b = (org.telegram.messenger.g0.L(15.0f) * 0.6f) + org.telegram.messenger.g0.L(47.0f);
                        o9Var.a = org.telegram.messenger.g0.L(50.0f);
                        o9Var.b = (org.telegram.messenger.g0.L(f24) * 0.6f) + org.telegram.messenger.g0.L(50.0f);
                        o9Var.f(currentTimeMillis);
                        o9Var.e(o9Var.t, 1.01f);
                        o9Var2.f(currentTimeMillis);
                        o9Var2.e(o9Var2.t, 1.02f);
                    }
                    this.d = System.currentTimeMillis();
                    float f61 = chatActivityEnterView.R4;
                    float f62 = f61 <= 0.7f ? 1.0f : f61 / 0.7f;
                    if (chatActivityEnterView.x1) {
                        float f63 = chatActivityEnterView.U4;
                        if (f63 > 0.0f) {
                            f25 = 1.0f;
                            f26 = 1.0f - er.g.getInterpolation(Math.min(1.0f, f63));
                            if (org.telegram.messenger.qc.e(360928) || f21 == f25 || ((f19 >= 0.4f && (!chatActivityEnterView.x1 || f26 <= 0.01f)) || f62 <= 0.0f || chatActivityEnterView.Z4)) {
                                drawable3 = drawable8;
                                drawable4 = drawable2;
                                f27 = 0.01f;
                                i10 = 0;
                            } else {
                                if (this.J) {
                                    float f64 = this.I;
                                    if (f64 != 1.0f) {
                                        float f65 = f64 + 0.04f;
                                        this.I = f65;
                                        if (f65 > 1.0f) {
                                            this.I = 1.0f;
                                        }
                                    }
                                }
                                float f66 = this.Q;
                                boolean z10 = chatActivityEnterView.m1;
                                f27 = 0.01f;
                                i10 = 0;
                                float z11 = com.google.android.gms.internal.vision.e2.z(z10 ? 1.0f : 0.0f, f66, 0.18f, f66);
                                this.Q = z11;
                                if (Math.abs((z10 ? 1.0f : 0.0f) - z11) > 0.01f) {
                                    invalidate();
                                }
                                if (this.N || this.Q >= 0.99f) {
                                    drawable3 = drawable8;
                                    drawable4 = drawable2;
                                } else {
                                    float interpolation3 = (1.0f - this.Q) * er.g.getInterpolation(this.I);
                                    canvas3.save();
                                    float f67 = 1.0f - f20;
                                    drawable3 = drawable8;
                                    drawable4 = drawable2;
                                    float B = com.google.android.gms.internal.vision.e2.B(o9Var.t, 1.4f, 0.878f, com.google.android.gms.internal.vision.e2.D(chatActivityEnterView.P4 * f26, f67, f62, interpolation3));
                                    canvas3.scale(B, B, chatActivityEnterView.b5 + measuredWidth, f45);
                                    o9Var.a(chatActivityEnterView.b5 + measuredWidth, f45, canvas3, o9Var.d);
                                    canvas3.restore();
                                    float f68 = ((o9Var2.t * 1.4f) + 0.926f) * f26 * chatActivityEnterView.P4 * f67 * f62 * interpolation3;
                                    canvas3.save();
                                    canvas3.scale(f68, f68, chatActivityEnterView.b5 + measuredWidth, f45);
                                    o9Var2.a(chatActivityEnterView.b5 + measuredWidth, f45, canvas3, o9Var2.d);
                                    canvas3.restore();
                                }
                            }
                            float max = (chatActivityEnterView.Z4 || chatActivityEnterView.R4 >= 1.0f) ? f22 : Math.max(f22, org.telegram.messenger.g0.L(19.0f));
                            if (this.N) {
                                f28 = 19.0f;
                                i11 = measuredWidth;
                                f29 = f45;
                                drawable5 = drawable3;
                                drawable6 = drawable4;
                                paint2 = paint;
                            } else {
                                paint2 = paint;
                                paint2.setAlpha((int) (this.E * f18));
                                if (chatActivityEnterView.P4 == 1.0f) {
                                    float f69 = chatActivityEnterView.X4;
                                    int i16 = (f69 == 0.0f || !chatActivityEnterView.C1 || chatActivityEnterView.d1 || (oi0Var2 = chatActivityEnterView.i1) == null || oi0Var2.S) ? i10 : i7;
                                    RectF rectF2 = this.w;
                                    if (i16 != 0) {
                                        float f70 = chatActivityEnterView.b5 + measuredWidth;
                                        int[] iArr2 = chatActivityEnterView.K1;
                                        int[] iArr3 = chatActivityEnterView.J1;
                                        ee eeVar = chatActivityEnterView.a1;
                                        f28 = 19.0f;
                                        float f71 = chatActivityEnterView.X4;
                                        f32 = 3.0f;
                                        View view = (View) chatActivityEnterView.i1.getParent();
                                        float f72 = 0.0f;
                                        float f73 = 0.0f;
                                        while (true) {
                                            f34 = f71;
                                            if (view == null || view == getParent()) {
                                                break;
                                            }
                                            f72 = view.getY() + f72;
                                            f73 = view.getX() + f73;
                                            view = view.getParent() instanceof View ? (View) view.getParent() : null;
                                            f71 = f34;
                                        }
                                        float y10 = (chatActivityEnterView.i1.getY() + f72) - getY();
                                        float measuredHeight = chatActivityEnterView.i1.getMeasuredHeight() + y10;
                                        float x10 = ((chatActivityEnterView.i1.getX() + f73) - getX()) + chatActivityEnterView.J;
                                        i12 = i16;
                                        float x11 = (((chatActivityEnterView.i1.getX() + chatActivityEnterView.i1.getMeasuredWidth()) + f73) - getX()) - chatActivityEnterView.J;
                                        float min = Math.min(measuredHeight - y10, org.telegram.messenger.g0.L(32.0f));
                                        float f74 = (y10 + measuredHeight) / 2.0f;
                                        float N = org.telegram.messenger.g0.N(19.0f);
                                        i13 = measuredWidth;
                                        float[] fArr = this.a0;
                                        boolean t02 = chatActivityEnterView.t0(fArr);
                                        int[] iArr4 = this.V;
                                        if (t02) {
                                            getLocationInWindow(iArr4);
                                            float f75 = fArr[i10] - iArr4[i10];
                                            rect = rect2;
                                            f37 = fArr[i7] - iArr4[i7];
                                            iArr = iArr4;
                                            f36 = fArr[2];
                                            f35 = f75;
                                            i14 = i7;
                                        } else if (eeVar == null || eeVar.getWidth() <= 0) {
                                            iArr = iArr4;
                                            f35 = f70;
                                            i14 = i10;
                                            f36 = N;
                                            rect = rect2;
                                            f37 = f45;
                                        } else {
                                            getLocationInWindow(iArr4);
                                            iArr = iArr4;
                                            eeVar.getLocationInWindow(this.W);
                                            f35 = ((eeVar.getWidth() + (r12[i10] - iArr[i10])) - org.telegram.messenger.g0.N(3.0f)) - N;
                                            float height = ((eeVar.getHeight() + (r12[i7] - iArr[i7])) - org.telegram.messenger.g0.N(3.0f)) - N;
                                            rect = rect2;
                                            f37 = height;
                                            f36 = N;
                                            i14 = i10;
                                        }
                                        f30 = max;
                                        float d = d(f34 / 0.62f);
                                        paint3 = paint2;
                                        float f76 = f34 - 0.5f;
                                        float max2 = 0.56f * Math.max(0.0f, f76);
                                        float i17 = i(max2, 5.2f);
                                        float i18 = i(max2 - 0.02f, 4.4f);
                                        float B2 = com.google.android.gms.internal.vision.e2.B(i17, 0.07f, 1.0f, org.telegram.messenger.g0.T1(f23, f36, d));
                                        float T12 = org.telegram.messenger.g0.T1(f70, f35, d);
                                        float T13 = org.telegram.messenger.g0.T1(f45, f37, d);
                                        float e11 = e(f34 / 0.58f);
                                        float f77 = f34 / 0.5f;
                                        float C = com.google.android.gms.internal.vision.e2.C(i18, 0.09f, 1.0f, org.telegram.messenger.g0.T1(Math.min(min, 1.1f * B2) * 0.8f, min, e(f77)));
                                        float L3 = org.telegram.messenger.g0.L(16.0f);
                                        if (f34 < 0.5f) {
                                            f38 = i18;
                                            cos = org.telegram.messenger.g0.T1(T12 - (B2 * 0.35f), x11 - L3, e(f77));
                                            f39 = d;
                                        } else {
                                            f38 = i18;
                                            f39 = d;
                                            cos = x11 - (L3 * ((float) (Math.cos(((max2 * 3.141592653589793d) * 2.0d) * 2.6d) * Math.exp((-max2) * 13.0f))));
                                        }
                                        float T14 = org.telegram.messenger.g0.T1((T12 - (B2 * 0.35f)) - C, x10, d((f34 - 0.16f) / 0.6f)) - (org.telegram.messenger.g0.L(5.0f) * f38);
                                        float T15 = org.telegram.messenger.g0.T1(T13, f74, e11);
                                        float min2 = Math.min(T14, cos - C);
                                        float f78 = C / 2.0f;
                                        RectF rectF3 = this.U;
                                        rectF3.set(min2, T15 - f78, cos, T15 + f78);
                                        int f79 = i0.a.f(d((f34 - 0.6f) / 0.4f), chatActivityEnterView.u0(org.telegram.ui.ActionBar.j6.Uf), chatActivityEnterView.u0(org.telegram.ui.ActionBar.j6.Pe));
                                        Paint paint6 = this.T;
                                        paint6.setColor(f79);
                                        paint6.setAlpha((int) (this.E * 1.0f));
                                        Path path2 = this.S;
                                        path2.rewind();
                                        Path.Direction direction = Path.Direction.CW;
                                        path2.addCircle(T12, T13, B2, direction);
                                        float f80 = cos - f78;
                                        if (f34 < 0.5f) {
                                            f31 = f45;
                                            f40 = T12;
                                            float max3 = Math.max(org.telegram.messenger.g0.N(0.6f), 0.85f * f78 * ((float) Math.pow(1.0d - Math.pow(f77, 1.4d), 1.2d)));
                                            float f81 = f40 - f80;
                                            if (f81 <= 0.0f) {
                                                path = path2;
                                                f41 = T13;
                                            } else {
                                                double i19 = (Utilities.i(1.0f - (((f81 - f78) - B2) / (f78 + B2)), 1.0f, 0.15f) * 45.0f) + 25.0f;
                                                float radians = (float) Math.toRadians(i19);
                                                float radians2 = (float) Math.toRadians(i19);
                                                double d2 = radians;
                                                float cos2 = (((float) Math.cos(d2)) * f78) + f80;
                                                float sin = T15 - (((float) Math.sin(d2)) * f78);
                                                float sin2 = (((float) Math.sin(d2)) * f78) + T15;
                                                double d10 = radians2;
                                                float cos3 = f40 - (((float) Math.cos(d10)) * B2);
                                                float sin3 = T13 - (((float) Math.sin(d10)) * B2);
                                                float sin4 = (((float) Math.sin(d10)) * B2) + T13;
                                                float f82 = (cos2 + cos3) / 2.0f;
                                                float f83 = (T15 + T13) / 2.0f;
                                                path2.moveTo(cos2, sin);
                                                float f84 = f83 - max3;
                                                f41 = T13;
                                                path2.cubicTo(org.telegram.messenger.g0.T1(cos2, f82, 0.55f), org.telegram.messenger.g0.T1(sin, f84, 0.9f), org.telegram.messenger.g0.T1(f82, cos2, 0.3f), f84, f82, f84);
                                                path2.cubicTo(org.telegram.messenger.g0.T1(f82, cos3, 0.3f), f84, org.telegram.messenger.g0.T1(cos3, f82, 0.55f), org.telegram.messenger.g0.T1(sin3, f84, 0.9f), cos3, sin3);
                                                path = path2;
                                                path.lineTo(cos3, sin4);
                                                float f85 = f83 + max3;
                                                path2.cubicTo(org.telegram.messenger.g0.T1(cos3, f82, 0.55f), org.telegram.messenger.g0.T1(sin4, f85, 0.9f), org.telegram.messenger.g0.T1(f82, cos3, 0.3f), f85, f82, f85);
                                                path2.cubicTo(org.telegram.messenger.g0.T1(f82, cos2, 0.3f), f85, org.telegram.messenger.g0.T1(cos2, f82, 0.55f), org.telegram.messenger.g0.T1(sin2, f85, 0.9f), cos2, sin2);
                                                path.close();
                                            }
                                        } else {
                                            f40 = T12;
                                            path = path2;
                                            f41 = T13;
                                            f31 = f45;
                                        }
                                        int i20 = f34 >= 0.5f ? i7 : i10;
                                        if (i20 == 0) {
                                            path.addRoundRect(rectF3, f78, f78, direction);
                                            oi0 oi0Var3 = chatActivityEnterView.i1;
                                            oi0Var3.Q.set(rectF3);
                                            oi0Var3.R = -1.0f;
                                            oi0Var3.invalidate();
                                            rectF = rectF2;
                                        } else {
                                            getLocationInWindow(iArr3);
                                            chatActivityEnterView.i1.getLocationInWindow(iArr2);
                                            rectF = rectF2;
                                            rectF.set(rectF3);
                                            rectF.offset(iArr3[i10] - iArr2[i10], iArr3[i7] - iArr2[i7]);
                                            oi0 oi0Var4 = chatActivityEnterView.i1;
                                            float e12 = (e(f76 / 0.5f) * 0.65f) + 0.35f;
                                            oi0Var4.Q.set(rectF);
                                            oi0Var4.R = e12;
                                            oi0Var4.invalidate();
                                        }
                                        float d11 = 1.0f - d((f34 - 0.72f) / 0.28f);
                                        if (d11 < 1.0f) {
                                            int alpha = paint6.getAlpha();
                                            paint6.setAlpha((int) (alpha * d11));
                                            canvas2 = canvas;
                                            f42 = f40;
                                            f43 = f41;
                                            canvas2.drawCircle(f42, f43, B2, paint6);
                                            paint6.setAlpha(alpha);
                                            path.rewind();
                                            if (i20 == 0) {
                                                path.addRoundRect(rectF3, f78, f78, direction);
                                            }
                                        } else {
                                            canvas2 = canvas;
                                            f42 = f40;
                                            f43 = f41;
                                        }
                                        canvas2.drawPath(path, paint6);
                                        if (d11 > 0.0f) {
                                            canvas2.save();
                                            float centerX = f42 - drawable3.getBounds().centerX();
                                            float f86 = f43 - f31;
                                            if (i14 != 0) {
                                                float f87 = (fArr[3] - iArr[i10]) - drawable3.getBounds().left;
                                                float f88 = (fArr[4] - iArr[i7]) - drawable3.getBounds().top;
                                                float f89 = f39;
                                                centerX = org.telegram.messenger.g0.T1(centerX, f87, f89);
                                                f86 = org.telegram.messenger.g0.T1(f86, f88, f89);
                                            }
                                            canvas2.translate(centerX, f86);
                                            int i21 = (int) (d11 * 255.0f);
                                            canvas3 = canvas;
                                            Drawable drawable9 = drawable3;
                                            drawable6 = drawable4;
                                            c(canvas3, drawable9, drawable6, this.f, i21);
                                            drawable7 = drawable9;
                                            canvas3.restore();
                                        } else {
                                            canvas3 = canvas2;
                                            drawable7 = drawable3;
                                            drawable6 = drawable4;
                                        }
                                        if (f34 >= 1.0f) {
                                            oi0 oi0Var5 = chatActivityEnterView.i1;
                                            oi0Var5.Q.set(rectF);
                                            oi0Var5.R = 1.0f;
                                            oi0Var5.invalidate();
                                        }
                                    } else {
                                        rect = rect2;
                                        f28 = 19.0f;
                                        paint3 = paint2;
                                        f30 = max;
                                        i12 = i16;
                                        i13 = measuredWidth;
                                        f31 = f45;
                                        drawable7 = drawable3;
                                        drawable6 = drawable4;
                                        f32 = 3.0f;
                                        if (f69 == 0.0f) {
                                            f29 = f31;
                                            paint2 = paint3;
                                            f33 = 1.0f;
                                            max = f30;
                                            canvas3.drawCircle(i13 + chatActivityEnterView.b5, f29, max, paint2);
                                        } else if (chatActivityEnterView.d1 || this.e <= 0.0f || (oi0Var = chatActivityEnterView.i1) == null || (chatActivityEnterView.C1 && oi0Var.S)) {
                                            f33 = 1.0f;
                                            f29 = f31;
                                            paint2 = paint3;
                                            canvas3.drawCircle(i13 + chatActivityEnterView.b5, f29, (1.0f - this.e) * f30, paint2);
                                            max = f30;
                                        } else {
                                            float f90 = f31 + f30;
                                            float f91 = f31 - f30;
                                            float f92 = i13 + chatActivityEnterView.b5;
                                            float f93 = f92 + f30;
                                            float f94 = f92 - f30;
                                            int i22 = i10;
                                            int i23 = i22;
                                            for (View view2 = (View) oi0Var.getParent(); view2 != getParent(); view2 = (View) view2.getParent()) {
                                                i22 = (int) (view2.getY() + i22);
                                                i23 = (int) (view2.getX() + i23);
                                            }
                                            float f95 = i22;
                                            float y11 = (oi0Var.getY() + f95) - getY();
                                            float y12 = ((oi0Var.getY() + oi0Var.getMeasuredHeight()) + f95) - getY();
                                            float f96 = i23;
                                            float x12 = (((oi0Var.getX() + oi0Var.getMeasuredWidth()) + f96) - getX()) - chatActivityEnterView.J;
                                            float x13 = ((oi0Var.getX() + f96) - getX()) + chatActivityEnterView.J;
                                            if (!chatActivityEnterView.d1) {
                                                oi0Var.getMeasuredHeight();
                                            }
                                            rectF2.set(org.telegram.messenger.g0.T1(f94, x13, this.e), org.telegram.messenger.g0.T1(f91, y11, this.e), org.telegram.messenger.g0.T1(f93, x12, this.e), org.telegram.messenger.g0.T1(f90, y12, this.e));
                                            if (chatActivityEnterView.C1) {
                                                getLocationInWindow(chatActivityEnterView.J1);
                                                chatActivityEnterView.i1.getLocationInWindow(chatActivityEnterView.K1);
                                                int i24 = chatActivityEnterView.J1[i10];
                                                int[] iArr5 = chatActivityEnterView.K1;
                                                rectF2.offset(i24 - iArr5[i10], r2[i7] - iArr5[i7]);
                                                oi0 oi0Var6 = chatActivityEnterView.i1;
                                                float f97 = this.e;
                                                oi0Var6.Q.set(rectF2);
                                                oi0Var6.R = f97;
                                                oi0Var6.invalidate();
                                            } else {
                                                chatActivityEnterView.i1.a(canvas3, rectF2, this.e);
                                            }
                                        }
                                        if (i12 != 0) {
                                            canvas3.save();
                                            float f98 = f33 - f19;
                                            canvas3.translate(chatActivityEnterView.b5, 0.0f);
                                            float L4 = (max - org.telegram.messenger.g0.L(f28)) / Math.max(f33, f13 - org.telegram.messenger.g0.L(f28));
                                            this.d0 = L4 < 0.0f ? 0.0f : L4 > f33 ? f33 : L4;
                                            int A = (int) org.telegram.messenger.k5.A(f33, f21, f98, 255.0f);
                                            if (chatActivityEnterView.X4 != 0.0f && drawable7 == chatActivityEnterView.z4 && chatActivityEnterView.C1 && chatActivityEnterView.t0(this.b0)) {
                                                getLocationInWindow(this.c0);
                                                int intrinsicWidth = drawable7.getIntrinsicWidth();
                                                int intrinsicHeight = drawable7.getIntrinsicHeight();
                                                float[] fArr2 = this.b0;
                                                float f99 = fArr2[3];
                                                int[] iArr6 = this.c0;
                                                float f100 = (f99 - iArr6[i10]) - chatActivityEnterView.b5;
                                                float f101 = fArr2[4] - iArr6[i7];
                                                Rect rect3 = rect;
                                                float f102 = rect3.left;
                                                float f103 = rect3.top;
                                                float f104 = f20;
                                                int round = Math.round(org.telegram.messenger.g0.T1(f102, f100, f104));
                                                int round2 = Math.round(org.telegram.messenger.g0.T1(f103, f101, f104));
                                                drawable7.setBounds(round, round2, intrinsicWidth + round, intrinsicHeight + round2);
                                                this.d0 = 1.0f - f104;
                                                A = (int) (f98 * 255.0f);
                                            }
                                            int i25 = A;
                                            float f105 = this.Q;
                                            if (f105 <= f27 || chatActivityEnterView.X4 != 0.0f) {
                                                drawable5 = drawable7;
                                                i11 = i13;
                                                c(canvas3, drawable5, drawable6, this.f, i25);
                                            } else {
                                                float f106 = i25;
                                                int i26 = (int) ((1.0f - f105) * f106);
                                                drawable5 = drawable7;
                                                c(canvas3, drawable5, drawable6, this.f, i26);
                                                float T16 = org.telegram.messenger.g0.T1(0.6f, 1.0f, this.Q) * org.telegram.messenger.g0.N(6.5f);
                                                Paint paint7 = this.R;
                                                paint7.setColor(-1);
                                                paint7.setAlpha((int) (f106 * this.Q));
                                                RectF rectF4 = org.telegram.messenger.g0.P;
                                                i11 = i13;
                                                float f107 = i11;
                                                rectF4.set(f107 - T16, f29 - T16, f107 + T16, T16 + f29);
                                                canvas3.drawRoundRect(rectF4, org.telegram.messenger.g0.N(f32), org.telegram.messenger.g0.N(f32), paint7);
                                            }
                                            canvas3.restore();
                                        } else {
                                            drawable5 = drawable7;
                                            i11 = i13;
                                        }
                                    }
                                    f29 = f31;
                                    paint2 = paint3;
                                    max = f30;
                                    f33 = 1.0f;
                                    if (i12 != 0) {
                                    }
                                } else {
                                    f28 = 19.0f;
                                    i11 = measuredWidth;
                                    f29 = f45;
                                    drawable5 = drawable3;
                                    drawable6 = drawable4;
                                }
                            }
                            if (chatActivityEnterView.P4 != 1.0f) {
                                canvas3.drawCircle(i11 + chatActivityEnterView.b5, f29, max, paint2);
                                float f108 = chatActivityEnterView.Z4 ? 1.0f - chatActivityEnterView.R4 : 1.0f;
                                canvas3.save();
                                canvas3.translate(chatActivityEnterView.b5, 0.0f);
                                float L5 = (max - org.telegram.messenger.g0.L(f28)) / Math.max(1.0f, f13 - org.telegram.messenger.g0.L(f28));
                                this.d0 = L5 >= 0.0f ? L5 > 1.0f ? 1.0f : L5 : 0.0f;
                                c(canvas3, drawable5, drawable6, this.f, (int) (f108 * 255.0f));
                                canvas.restore();
                            }
                            this.M = max;
                        }
                    }
                    f25 = 1.0f;
                    f26 = 1.0f;
                    if (org.telegram.messenger.qc.e(360928)) {
                    }
                    drawable3 = drawable8;
                    drawable4 = drawable2;
                    f27 = 0.01f;
                    i10 = 0;
                    if (chatActivityEnterView.Z4) {
                    }
                    if (this.N) {
                    }
                    if (chatActivityEnterView.P4 != 1.0f) {
                    }
                    this.M = max;
                }
            } else {
                f11 = 0.6f;
            }
            f12 = 0.0f;
            f13 = f53;
            float f109 = chatActivityEnterView.U4;
            if (f109 != 0.0f && chatActivityEnterView.x1) {
                f14 = 0.0f;
                f17 = 0.0f;
                f16 = 0.0f;
                f18 = 0.0f;
                f15 = 1.0f;
            } else if (f109 != 0.0f) {
                float f110 = f109 > f11 ? 1.0f : f109 / f11;
                if (!chatActivityEnterView.h0) {
                    f109 = org.telegram.ui.Cells.y0.v(f109, f11, 0.4f, 0.0f);
                }
                er erVar2 = er.j;
                f16 = erVar2.getInterpolation(f110);
                float interpolation4 = erVar2.getInterpolation(f109);
                float L6 = ((org.telegram.messenger.g0.L(16.0f) * f16) + f54) * (1.0f - interpolation4);
                if (org.telegram.messenger.qc.e(360928)) {
                    float f111 = chatActivityEnterView.U4;
                    if (f111 > 0.6f) {
                        f12 = 0.0f;
                        f18 = Math.max(0.0f, 1.0f - ((f111 - 0.6f) / 0.4f));
                        f15 = interpolation4;
                        f17 = L6;
                        f14 = f12;
                    }
                }
                f15 = interpolation4;
                f12 = 0.0f;
                f18 = 1.0f;
                f17 = L6;
                f14 = f12;
            } else {
                f14 = 0.0f;
                f15 = 0.0f;
                f16 = 0.0f;
                f12 = 0.0f;
                f17 = f54;
                f18 = 1.0f;
            }
            if (this.e <= f12) {
            }
            b();
            if (chatActivityEnterView.a5) {
            }
            Drawable drawable82 = drawable;
            drawable82.setBounds(rect2);
            if (this.x) {
            }
            e10 = org.telegram.messenger.qc.e(360928);
            o9 o9Var3 = this.n;
            o9 o9Var22 = this.h;
            if (e10) {
            }
            this.d = System.currentTimeMillis();
            float f612 = chatActivityEnterView.R4;
            if (f612 <= 0.7f) {
            }
            if (chatActivityEnterView.x1) {
            }
            f25 = 1.0f;
            f26 = 1.0f;
            if (org.telegram.messenger.qc.e(360928)) {
            }
            drawable3 = drawable82;
            drawable4 = drawable2;
            f27 = 0.01f;
            i10 = 0;
            if (chatActivityEnterView.Z4) {
            }
            if (this.N) {
            }
            if (chatActivityEnterView.P4 != 1.0f) {
            }
            this.M = max;
        }

        @Override // android.view.View
        public final void onMeasure(int i7, int i10) {
            View.MeasureSpec.getSize(i7);
            super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(194.0f), TLObject.FLAG_30));
            float measuredWidth = getMeasuredWidth() * 0.35f;
            if (measuredWidth > org.telegram.messenger.g0.L(140.0f)) {
                measuredWidth = org.telegram.messenger.g0.L(140.0f);
            }
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.b5 = (int) ((1.0f - chatActivityEnterView.R4) * (-measuredWidth));
        }

        public void setAmplitude(double d) {
            this.n.d(true, (float) (Math.min(1800.0d, d) / 1800.0d));
            this.h.d(false, (float) (Math.min(1800.0d, d) / 1800.0d));
            float min = (float) (Math.min(1800.0d, d) / 1800.0d);
            this.b = min;
            this.c = (min - this.a) / 375.0f;
            invalidate();
        }

        public void setControlsScale(float f10) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.Q4 = f10;
            gg ggVar = chatActivityEnterView.w2;
            if (ggVar != null) {
                ggVar.invalidate();
            }
        }

        public void setScale(float f10) {
            ChatActivityEnterView.this.P4 = f10;
            invalidate();
        }

        public void setTransformToSeekbar(float f10) {
            ChatActivityEnterView.this.X4 = f10;
            invalidate();
        }
    }

    /* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
    public class SlideTextView extends View {
        public StaticLayout E;
        public StaticLayout F;
        public boolean G;
        public boolean H;
        public final Rect I;
        public org.telegram.ui.Cells.y J;
        public int K;
        public final boolean L;
        public final TextPaint a;
        public final TextPaint b;
        public final Paint c;
        public final String d;
        public final String e;
        public float f;
        public float h;
        public float n;
        public float r;
        public float s;
        public float w;
        public final int x;
        public final Path y;

        public SlideTextView(Context context) {
            super(context);
            Paint paint = new Paint(1);
            this.c = paint;
            this.w = 0.0f;
            this.y = new Path();
            this.I = new Rect();
            boolean z10 = org.telegram.messenger.g0.q.x <= org.telegram.messenger.g0.L(320.0f);
            this.L = z10;
            TextPaint textPaint = new TextPaint(1);
            this.a = textPaint;
            textPaint.setTextSize(org.telegram.messenger.g0.L(z10 ? 13.0f : 15.0f));
            TextPaint textPaint2 = new TextPaint(1);
            this.b = textPaint2;
            textPaint2.setTextSize(org.telegram.messenger.g0.L(15.0f));
            textPaint2.setTypeface(org.telegram.messenger.g0.o());
            int i7 = org.telegram.ui.ActionBar.j6.Nl;
            int i10 = ChatActivityEnterView.N6;
            paint.setColor(ChatActivityEnterView.this.u0(i7));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(org.telegram.messenger.g0.N(z10 ? 1.0f : 1.6f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            String M0 = org.telegram.messenger.hd.M0(2131745313, null);
            this.d = M0;
            String M02 = org.telegram.messenger.hd.M0(2131752589, "Cancel");
            this.e = M02;
            this.x = M0.toLowerCase().indexOf(M02.toLowerCase());
            b();
        }

        public final void a() {
            this.r = 1.0f;
        }

        public final void b() {
            int i7 = org.telegram.ui.ActionBar.j6.eg;
            int i10 = ChatActivityEnterView.N6;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            int u02 = chatActivityEnterView.u0(i7);
            TextPaint textPaint = this.a;
            textPaint.setColor(u02);
            int i11 = org.telegram.ui.ActionBar.j6.dg;
            int u03 = chatActivityEnterView.u0(i11);
            this.b.setColor(u03);
            textPaint.getAlpha();
            this.s = r4.getAlpha();
            org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.j6.j0(org.telegram.messenger.g0.L(60.0f), 0, i0.a.o(chatActivityEnterView.u0(i11), 26));
            this.J = j02;
            j02.setCallback(this);
        }

        @Override // android.view.View
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            this.J.setState(getDrawableState());
        }

        public float getSlideToCancelWidth() {
            return this.f;
        }

        @Override // android.view.View
        public final void jumpDrawablesToCurrentState() {
            super.jumpDrawablesToCurrentState();
            org.telegram.ui.Cells.y yVar = this.J;
            if (yVar != null) {
                yVar.jumpToCurrentState();
            }
        }

        @Override // android.view.View
        public final void onDraw(Canvas canvas) {
            StaticLayout staticLayout;
            float f10;
            float f11;
            float f12;
            float f13;
            gg ggVar;
            if (this.E == null || (staticLayout = this.F) == null) {
                return;
            }
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (chatActivityEnterView.v2 == null) {
                return;
            }
            int L = org.telegram.messenger.g0.L(16.0f) + staticLayout.getWidth();
            int u02 = (org.telegram.messenger.g0.B(chatActivityEnterView.u0(org.telegram.ui.ActionBar.j6.d6)) >= 0.5f || (ggVar = chatActivityEnterView.w2) == null) ? chatActivityEnterView.u0(org.telegram.ui.ActionBar.j6.eg) : ggVar.s.getColor();
            TextPaint textPaint = this.a;
            textPaint.setColor(u02);
            textPaint.setAlpha((int) ((1.0f - this.n) * Color.alpha(u02) * this.r));
            this.b.setAlpha((int) (this.s * this.n));
            int color = textPaint.getColor();
            Paint paint = this.c;
            paint.setColor(color);
            boolean z10 = this.L;
            if (z10) {
                this.w = org.telegram.messenger.g0.L(16.0f);
            } else {
                System.currentTimeMillis();
                System.currentTimeMillis();
                if (this.n == 0.0f && this.r > 0.8f) {
                    float currentTimeMillis = (System.currentTimeMillis() % 2000) / 2000.0f;
                    this.w = (-org.telegram.messenger.g0.L(6.0f)) * (currentTimeMillis < 0.5f ? (currentTimeMillis * 4.0f) - 1.0f : 3.0f - (currentTimeMillis * 4.0f));
                }
            }
            int i7 = this.x;
            boolean z11 = i7 >= 0;
            int L2 = org.telegram.messenger.g0.L(5.0f) + ((int) ((getMeasuredWidth() - this.f) / 2.0f));
            int measuredWidth = (int) ((getMeasuredWidth() - this.h) / 2.0f);
            float primaryHorizontal = z11 ? this.E.getPrimaryHorizontal(i7) : 0.0f;
            if (z11) {
                f10 = 4.0f;
                f11 = (L2 + primaryHorizontal) - measuredWidth;
            } else {
                f10 = 4.0f;
                f11 = 0.0f;
            }
            float f14 = L2;
            float f15 = this.w;
            float f16 = this.n;
            float L3 = (((((1.0f - f16) * f15) * this.r) + f14) - (f11 * f16)) + org.telegram.messenger.g0.L(16.0f);
            float L4 = z11 ? 0.0f : this.n * org.telegram.messenger.g0.L(12.0f);
            if (this.n != 1.0f) {
                f12 = 12.0f;
                int translationX = (int) ((chatActivityEnterView.v2.getTranslationX() * 0.3f) + ((1.0f - this.r) * ((-getMeasuredWidth()) / 4)));
                canvas.save();
                lg lgVar = chatActivityEnterView.Z0;
                f13 = 2.0f;
                canvas.clipRect((lgVar == null ? 0.0f : lgVar.getLeftProperty()) + org.telegram.messenger.g0.L(f10), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.save();
                int i10 = (int) L3;
                canvas.translate((i10 - org.telegram.messenger.g0.L(z10 ? 7.0f : 10.0f)) + translationX, L4);
                canvas.drawPath(this.y, paint);
                canvas.restore();
                canvas.save();
                canvas.translate(i10 + translationX, ((getMeasuredHeight() - this.E.getHeight()) / 2.0f) + L4);
                this.E.draw(canvas);
                canvas.restore();
                canvas.restore();
            } else {
                f12 = 12.0f;
                f13 = 2.0f;
            }
            float measuredHeight = (getMeasuredHeight() - this.F.getHeight()) / f13;
            if (!z11) {
                measuredHeight -= org.telegram.messenger.g0.L(f12) - L4;
            }
            float L5 = z11 ? (L3 + primaryHorizontal) - (org.telegram.messenger.g0.L(16.0f) * this.n) : measuredWidth;
            Rect rect = this.I;
            rect.set((int) L5, (int) measuredHeight, (int) (this.F.getWidth() + L5), (int) (this.F.getHeight() + measuredHeight));
            rect.inset(-org.telegram.messenger.g0.L(16.0f), -org.telegram.messenger.g0.L(16.0f));
            if (this.n > 0.0f) {
                this.J.setBounds((getMeasuredWidth() / 2) - L, (getMeasuredHeight() / 2) - L, (getMeasuredWidth() / 2) + L, (getMeasuredHeight() / 2) + L);
                this.J.draw(canvas);
                canvas.save();
                canvas.translate(L5, measuredHeight);
                this.F.draw(canvas);
                canvas.restore();
            } else {
                setPressed(false);
            }
            if (this.n == 1.0f || this.H) {
                return;
            }
            invalidate();
        }

        @Override // android.view.View
        public final void onMeasure(int i7, int i10) {
            super.onMeasure(i7, i10);
            int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
            if (this.K != measuredHeight) {
                this.K = measuredHeight;
                String str = this.d;
                TextPaint textPaint = this.a;
                this.f = textPaint.measureText(str);
                String str2 = this.e;
                TextPaint textPaint2 = this.b;
                this.h = textPaint2.measureText(str2);
                System.currentTimeMillis();
                int measuredHeight2 = getMeasuredHeight() >> 1;
                Path path = this.y;
                path.reset();
                if (this.L) {
                    float f10 = measuredHeight2;
                    path.setLastPoint(org.telegram.messenger.g0.N(2.5f), f10 - org.telegram.messenger.g0.N(3.12f));
                    path.lineTo(0.0f, f10);
                    path.lineTo(org.telegram.messenger.g0.N(2.5f), org.telegram.messenger.g0.N(3.12f) + f10);
                } else {
                    float f11 = measuredHeight2;
                    path.setLastPoint(org.telegram.messenger.g0.N(4.0f), f11 - org.telegram.messenger.g0.N(5.0f));
                    path.lineTo(0.0f, f11);
                    path.lineTo(org.telegram.messenger.g0.N(4.0f), org.telegram.messenger.g0.N(5.0f) + f11);
                }
                int i11 = (int) this.f;
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.E = new StaticLayout(this.d, textPaint, i11, alignment, 1.0f, 0.0f, false);
                this.F = new StaticLayout(this.e, textPaint2, (int) this.h, alignment, 1.0f, 0.0f, false);
            }
        }

        @Override // android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                setPressed(false);
            }
            if (this.n == 0.0f || !isEnabled()) {
                return false;
            }
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            Rect rect = this.I;
            if (action == 0) {
                boolean contains = rect.contains(x10, y10);
                this.G = contains;
                if (contains) {
                    this.J.setHotspot(x10, y10);
                    setPressed(true);
                }
                return this.G;
            }
            boolean z10 = this.G;
            if (!z10) {
                return z10;
            }
            if (motionEvent.getAction() == 2 && !rect.contains(x10, y10)) {
                setPressed(false);
                return false;
            }
            if (motionEvent.getAction() == 1 && rect.contains(x10, y10)) {
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                long j3 = 0;
                if (chatActivityEnterView.M2 && chatActivityEnterView.d1) {
                    CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.p4);
                    chatActivityEnterView.H3.o2(5, 0, chatActivityEnterView.P ? Integer.MAX_VALUE : 0, chatActivityEnterView.n6, 0L, true);
                    he heVar = chatActivityEnterView.K0;
                    chatActivityEnterView.n6 = 0L;
                    heVar.setEffect(0L);
                } else {
                    chatActivityEnterView.H3.a1(0);
                    MediaController.B().B0(0, 0, false, chatActivityEnterView.P);
                }
                chatActivityEnterView.J3 = null;
                chatActivityEnterView.L3 = null;
                chatActivityEnterView.M3 = null;
                chatActivityEnterView.Q1 = 0L;
                chatActivityEnterView.n3 = false;
                org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(chatActivityEnterView.R);
                long j10 = chatActivityEnterView.y3;
                org.telegram.ui.an anVar = chatActivityEnterView.x3;
                if (anVar != null && anVar.w4) {
                    j3 = anVar.b();
                }
                b02.B1(j10, j3, null);
                chatActivityEnterView.f2(2, true);
                chatActivityEnterView.N(true);
            }
            return true;
        }

        public void setCancelToProgress(float f10) {
            this.n = f10;
        }

        @Override // android.view.View
        public final boolean verifyDrawable(Drawable drawable) {
            return this.J == drawable || super.verifyDrawable(drawable);
        }
    }

    public ChatActivityEnterView(Activity activity, st0 st0Var, org.telegram.ui.an anVar, boolean z10, final org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity);
        int i7;
        String str;
        cg cgVar;
        this.h = 1.0f;
        this.n = 1.0f;
        this.r = 1.0f;
        this.s = 1.0f;
        this.F = 1.0f;
        this.G = 1.0f;
        this.J = 0.0f;
        final int i10 = 1;
        this.K = true;
        int i11 = org.telegram.messenger.m10.t0;
        this.R = i11;
        this.S = org.telegram.messenger.c.a(i11);
        this.U = 1;
        this.d0 = -1;
        this.L6 = 1;
        this.y0 = true;
        this.z0 = true;
        this.A0 = true;
        this.C0 = new HashMap();
        new yd(0);
        this.D0 = false;
        this.E0 = false;
        this.s1 = 1.0f;
        this.v1 = new SparseArray();
        this.G1 = new Paint(1);
        this.J1 = new int[2];
        this.K1 = new int[2];
        this.P1 = new uc(this, 12);
        this.d2 = 1.0f;
        this.N2 = -1;
        this.R2 = true;
        this.l3 = -1.0f;
        this.m3 = org.telegram.messenger.g0.L(80.0f);
        this.v3 = new int[2];
        this.G3 = true;
        this.W3 = -1;
        this.Y3 = true;
        this.Z3 = new ke(this, 0);
        this.a4 = new ne(this);
        this.b4 = new org.telegram.ui.Cells.g1(Integer.class, "translationY", i10);
        this.c4 = new af(Float.class, "scale");
        this.d4 = new jf(Float.class, "controlsScale");
        this.e4 = new Paint(1);
        this.p4 = new ke(this, i10);
        this.s4 = new tf(this);
        this.t4 = new h2.f((int[]) null);
        this.u4 = new Paint(1);
        this.A4 = new RectF();
        this.B4 = new Rect();
        this.C4 = new Rect();
        this.G4 = new ke(this, 2);
        this.H4 = new td(this, 0);
        this.I4 = new td(this, 1);
        this.J4 = new td(this, 2);
        this.K4 = new td(this, 3);
        this.L4 = new td(this, 4);
        this.f5 = new TextPaint(1);
        this.g5 = new Paint(1);
        this.h5 = new Paint(1);
        this.i5 = new Path();
        this.j5 = new Path();
        this.k5 = new RectF();
        this.l5 = new int[2];
        this.m5 = new int[2];
        this.p5 = new nb.a(18);
        this.I5 = new Paint(2);
        this.M5 = 1.0f;
        this.N5 = 1.0f;
        this.P5 = true;
        this.Q5 = true;
        this.T5 = new Paint();
        this.U5 = 1.0f;
        this.V5 = new Rect();
        this.X5 = new uc(this, 29);
        this.a6 = true;
        this.j6 = new eq[1];
        this.M6 = 1;
        this.u6 = -1;
        Paint paint = new Paint(1);
        this.x6 = paint;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.y6 = linearGradient;
        this.z6 = new Matrix();
        er erVar = er.h;
        final int i12 = 0;
        this.A6 = new u5(this, 0L, 280L, erVar);
        this.B6 = new u5(this, 0L, 280L, erVar);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setShader(linearGradient);
        er erVar2 = pi.k.V;
        this.E6 = new te.c(0, this, erVar2, 250L);
        this.F6 = new te.a(1, this, erVar2, 250L, false);
        this.G6 = new te.a(2, this, erVar, 320L, false);
        this.H6 = new te.a(3, this, erVar, 320L, false);
        this.E4 = e6Var;
        this.F4 = z10;
        this.Q2 = z10 && !org.telegram.messenger.g0.E && (anVar == null || !anVar.isInBubbleMode());
        Paint paint2 = new Paint(1);
        this.y2 = paint2;
        paint2.setColor(u0(org.telegram.ui.ActionBar.j6.Sf));
        setFocusable(true);
        setFocusableInTouchMode(true);
        setWillNotDraw(false);
        setClipChildren(false);
        org.telegram.messenger.ns.f(this.R).c(this, org.telegram.messenger.ns.l2);
        org.telegram.messenger.ns.f(this.R).c(this, org.telegram.messenger.ns.o2);
        org.telegram.messenger.ns.f(this.R).c(this, org.telegram.messenger.ns.p2);
        org.telegram.messenger.ns.f(this.R).c(this, org.telegram.messenger.ns.m2);
        org.telegram.messenger.ns.f(this.R).c(this, org.telegram.messenger.ns.n2);
        org.telegram.messenger.ns.f(this.R).c(this, org.telegram.messenger.ns.k2);
        org.telegram.messenger.ns.f(this.R).c(this, org.telegram.messenger.ns.t);
        org.telegram.messenger.ns.f(this.R).c(this, org.telegram.messenger.ns.s2);
        org.telegram.messenger.ns.f(this.R).c(this, org.telegram.messenger.ns.u2);
        org.telegram.messenger.ns.f(this.R).c(this, org.telegram.messenger.ns.e2);
        org.telegram.messenger.ns.f(this.R).c(this, org.telegram.messenger.ns.z0);
        org.telegram.messenger.ns.f(this.R).c(this, org.telegram.messenger.ns.L);
        org.telegram.messenger.ns.f(this.R).c(this, org.telegram.messenger.ns.n1);
        org.telegram.messenger.ns.f(this.R).c(this, org.telegram.messenger.ns.t2);
        org.telegram.messenger.ns.f(this.R).c(this, org.telegram.messenger.ns.R2);
        org.telegram.messenger.ns.f(this.R).c(this, org.telegram.messenger.ns.Y2);
        org.telegram.messenger.ns.f(this.R).c(this, org.telegram.messenger.ns.f5);
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.i4);
        this.w3 = activity;
        this.x3 = anVar;
        if (anVar != null) {
            this.o3 = anVar.getClassGuid();
        }
        this.U1 = st0Var;
        this.V1 = st0Var;
        st0Var.setDelegate(this);
        this.j3 = org.telegram.messenger.np.e1().getBoolean("send_by_enter", false);
        ud udVar = new ud(this, activity, i12);
        this.h2 = udVar;
        udVar.setClipChildren(false);
        udVar.setClipToPadding(false);
        udVar.setPadding(0, org.telegram.messenger.g0.L(1.0f), 0, 0);
        addView(udVar, c8.ja.d(-1, -2.0f, 83, 0.0f, 1.0f, 0.0f, 0.0f));
        ud udVar2 = new ud(this, activity, i10);
        this.g2 = udVar2;
        udVar2.setClipChildren(false);
        udVar.addView(udVar2, c8.ja.d(-1, -2.0f, 80, 0.0f, 0.0f, 44.0f, 0.0f));
        wd wdVar = new wd(this, activity);
        this.R0 = wdVar;
        wdVar.setContentDescription(org.telegram.messenger.hd.M0(2131754884, null));
        wdVar.setFocusable(true);
        int L = org.telegram.messenger.g0.L(7.5f);
        wdVar.setPadding(L, L, L, L);
        int i13 = org.telegram.ui.ActionBar.j6.Nl;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.q6.s(wdVar, i13, e6Var, mode);
        int i14 = org.telegram.ui.ActionBar.j6.i6;
        int u02 = u0(i14);
        float L2 = org.telegram.messenger.g0.L(19.0f);
        int L3 = org.telegram.messenger.g0.L(1.0f);
        int L4 = org.telegram.messenger.g0.L(3.0f);
        wdVar.setBackground(org.telegram.ui.ActionBar.j6.Y(L2, u02, L3, L4, L3, L4));
        wdVar.setOnClickListener(new xc(this, 20));
        udVar2.addView(wdVar, c8.ja.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        t1(false, false);
        ImageView imageView = new ImageView(activity);
        this.S0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.menu_delete_old);
        org.telegram.ui.ActionBar.q6.s(imageView, i13, e6Var, mode);
        int u03 = u0(i14);
        float L5 = org.telegram.messenger.g0.L(19.0f);
        int L6 = org.telegram.messenger.g0.L(1.0f);
        int L7 = org.telegram.messenger.g0.L(3.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.Y(L5, u03, L6, L7, L6, L7));
        imageView.setVisibility(8);
        imageView.setContentDescription(org.telegram.messenger.hd.M0(2131754038, null));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.zc
            public final /* synthetic */ ChatActivityEnterView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        int i15 = ChatActivityEnterView.N6;
                        org.telegram.messenger.np.e1().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView = this.b;
                        org.telegram.ui.an anVar2 = chatActivityEnterView.x3;
                        long a10 = anVar2 != null ? anVar2.a() : chatActivityEnterView.y3;
                        boolean z11 = chatActivityEnterView.l2;
                        org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                        if (!z11) {
                            if (chatActivityEnterView.F0 != null) {
                                d0 d0Var = new d0(chatActivityEnterView.getContext(), e6Var2);
                                d0Var.s1(chatActivityEnterView.F0.getText());
                                d0Var.f2 = new kd(chatActivityEnterView, 1);
                                boolean z12 = chatActivityEnterView.H2 != null;
                                ld ldVar = new ld(chatActivityEnterView, a10, e6Var2, 1);
                                d0Var.h2 = a10;
                                d0Var.i2 = z12;
                                d0Var.j2 = ldVar;
                                d0Var.show();
                                break;
                            }
                        } else if (chatActivityEnterView.m2 != null) {
                            d0 d0Var2 = new d0(chatActivityEnterView.getContext(), e6Var2);
                            d0Var2.r1(chatActivityEnterView.m2);
                            d0Var2.g2 = new kd(chatActivityEnterView, 0);
                            ld ldVar2 = new ld(chatActivityEnterView, a10, e6Var2, 0);
                            d0Var2.h2 = a10;
                            d0Var2.k2 = ldVar2;
                            d0Var2.show();
                            break;
                        }
                        break;
                    default:
                        int i16 = ChatActivityEnterView.N6;
                        ChatActivityEnterView chatActivityEnterView2 = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, chatActivityEnterView2.getContext(), e6Var);
                        String M0 = org.telegram.messenger.hd.M0(2131754036, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                        t1Var.S = M0;
                        t1Var.U = org.telegram.messenger.hd.M0(2131754037, null);
                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new hd(chatActivityEnterView2));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.p();
                        break;
                }
            }
        });
        udVar2.addView(imageView, c8.ja.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            int i15 = anVar != null ? anVar.g4 : -1;
            org.telegram.ui.z51 z51Var = new org.telegram.ui.z51(12, activity, this);
            this.X1 = z51Var;
            z51Var.setOrientation(0);
            z51Var.setEnabled(false);
            z51Var.setClipChildren(false);
            udVar2.addView(z51Var, c8.ja.d(-2, 44.0f, 85, 0.0f, 0.0f, 44.0f, 0.0f));
            if (i15 != 9) {
                ImageView imageView2 = new ImageView(activity);
                this.q2 = imageView2;
                br brVar = new br(activity, R.drawable.input_notify_on, i13);
                this.f0 = brVar;
                imageView2.setImageDrawable(brVar);
                this.f0.a(this.O2, false);
                if (this.O2) {
                    i7 = 2131754906;
                    str = "AccDescrChanSilentOn";
                } else {
                    i7 = 2131754907;
                    str = "AccDescrChanSilentOff";
                }
                imageView2.setContentDescription(org.telegram.messenger.hd.M0(i7, str));
                org.telegram.ui.ActionBar.q6.s(imageView2, i13, e6Var, PorterDuff.Mode.MULTIPLY);
                imageView2.setScaleType(scaleType);
                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(u0(i14), 1, -1);
                org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i14);
                imageView2.setBackground(h02);
                org.telegram.ui.ActionBar.q6.j(imageView2, h02, null, M, e6Var);
                imageView2.setVisibility((!this.P2 || ((cgVar = this.H3) != null && cgVar.E0())) ? 8 : 0);
                z51Var.addView(imageView2, c8.ja.o(44, 44));
                imageView2.setOnClickListener(new xd(this, anVar, activity));
            }
            zd zdVar = new zd(this, activity, i12);
            this.Z1 = zdVar;
            zdVar.setScaleType(scaleType);
            org.telegram.ui.ActionBar.q6.s(zdVar, i13, e6Var, PorterDuff.Mode.MULTIPLY);
            zdVar.setImageResource(R.drawable.msg_input_attach2);
            org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.j6.h0(u0(i14), 1, -1);
            org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i14);
            zdVar.setBackground(h03);
            org.telegram.ui.ActionBar.q6.j(zdVar, h03, null, M2, e6Var);
            udVar2.addView(zdVar, c8.ja.e(44, 44, 85));
            zdVar.setOnClickListener(new xc(this, i12));
            zdVar.setContentDescription(org.telegram.messenger.hd.M0(2131754921, null));
            b2(1);
        }
        ImageView imageView3 = new ImageView(activity);
        this.b2 = imageView3;
        org.telegram.ui.ActionBar.t2 t2Var = new org.telegram.ui.ActionBar.t2(activity);
        this.a2 = t2Var;
        imageView3.setImageDrawable(t2Var);
        imageView3.setScaleType(scaleType);
        PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.q6.s(imageView3, i13, e6Var, mode2);
        org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.j6.h0(u0(i14), 1, org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.m6 M3 = org.telegram.ui.ActionBar.q6.M(i14);
        imageView3.setBackground(h04);
        org.telegram.ui.ActionBar.q6.j(imageView3, h04, null, M3, e6Var);
        udVar.addView(imageView3, c8.ja.d(44, 44.0f, 51, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView3.setContentDescription(org.telegram.messenger.hd.M0(2131755006, null));
        c8.na.a(imageView3);
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.zc
            public final /* synthetic */ ChatActivityEnterView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        int i152 = ChatActivityEnterView.N6;
                        org.telegram.messenger.np.e1().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView = this.b;
                        org.telegram.ui.an anVar2 = chatActivityEnterView.x3;
                        long a10 = anVar2 != null ? anVar2.a() : chatActivityEnterView.y3;
                        boolean z11 = chatActivityEnterView.l2;
                        org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                        if (!z11) {
                            if (chatActivityEnterView.F0 != null) {
                                d0 d0Var = new d0(chatActivityEnterView.getContext(), e6Var2);
                                d0Var.s1(chatActivityEnterView.F0.getText());
                                d0Var.f2 = new kd(chatActivityEnterView, 1);
                                boolean z12 = chatActivityEnterView.H2 != null;
                                ld ldVar = new ld(chatActivityEnterView, a10, e6Var2, 1);
                                d0Var.h2 = a10;
                                d0Var.i2 = z12;
                                d0Var.j2 = ldVar;
                                d0Var.show();
                                break;
                            }
                        } else if (chatActivityEnterView.m2 != null) {
                            d0 d0Var2 = new d0(chatActivityEnterView.getContext(), e6Var2);
                            d0Var2.r1(chatActivityEnterView.m2);
                            d0Var2.g2 = new kd(chatActivityEnterView, 0);
                            ld ldVar2 = new ld(chatActivityEnterView, a10, e6Var2, 0);
                            d0Var2.h2 = a10;
                            d0Var2.k2 = ldVar2;
                            d0Var2.show();
                            break;
                        }
                        break;
                    default:
                        int i16 = ChatActivityEnterView.N6;
                        ChatActivityEnterView chatActivityEnterView2 = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, chatActivityEnterView2.getContext(), e6Var);
                        String M0 = org.telegram.messenger.hd.M0(2131754036, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                        t1Var.S = M0;
                        t1Var.U = org.telegram.messenger.hd.M0(2131754037, null);
                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new hd(chatActivityEnterView2));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.p();
                        break;
                }
            }
        });
        imageView3.setVisibility(8);
        imageView3.setAlpha(0.0f);
        imageView3.setScaleX(0.6f);
        imageView3.setScaleY(0.6f);
        ImageView imageView4 = new ImageView(activity);
        this.c2 = imageView4;
        imageView4.setImageResource(R.drawable.iv_fullscreen);
        imageView4.setScaleType(scaleType);
        org.telegram.ui.ActionBar.q6.s(imageView4, i13, e6Var, mode2);
        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.j6.h0(u0(i14), 1, org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.m6 M4 = org.telegram.ui.ActionBar.q6.M(i14);
        imageView4.setBackground(h05);
        org.telegram.ui.ActionBar.q6.j(imageView4, h05, null, M4, e6Var);
        udVar.addView(imageView4, c8.ja.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(org.telegram.messenger.hd.M0(2131754033, null));
        c8.na.a(imageView4);
        int i16 = 2;
        imageView4.setOnClickListener(new xc(this, i16));
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setScaleX(0.6f);
        imageView4.setScaleY(0.6f);
        if (this.J3 != null) {
            a0();
        }
        ImageView imageView5 = new ImageView(activity);
        this.j2 = imageView5;
        imageView5.setImageResource(R.drawable.send_outline);
        imageView5.setScaleType(scaleType);
        imageView5.setVisibility(8);
        org.telegram.ui.ActionBar.q6.s(imageView5, org.telegram.ui.ActionBar.j6.Yl, e6Var, mode);
        udVar.addView(imageView5, c8.ja.e(44, 44, 85));
        ud udVar3 = new ud(this, activity, i16);
        this.i2 = udVar3;
        udVar3.setClipChildren(false);
        udVar3.setClipToPadding(false);
        udVar.addView(udVar3, c8.ja.e(100, 44, 85));
        ee eeVar = new ee(this, activity, e6Var);
        this.a1 = eeVar;
        eeVar.setSoundEffectsEnabled(false);
        udVar3.addView(eeVar, c8.ja.e(44, 44, 85));
        eeVar.setFocusable(true);
        eeVar.setImportantForAccessibility(1);
        Drawable mutate = getResources().getDrawable(R.drawable.input_mic).mutate();
        this.v4 = mutate;
        org.telegram.ui.ActionBar.q6.x(this, mutate, i13, e6Var, mode2);
        Drawable mutate2 = getResources().getDrawable(R.drawable.input_video).mutate();
        this.w4 = mutate2;
        org.telegram.ui.ActionBar.q6.x(this, mutate2, i13, e6Var, mode2);
        fe feVar = new fe(this, activity);
        this.c1 = feVar;
        feVar.setImportantForAccessibility(2);
        int L8 = org.telegram.messenger.g0.L(10.0f);
        feVar.setPadding(L8, L8, L8, L8);
        eeVar.addView(feVar, c8.ja.c(44.0f, 44));
        ImageView imageView6 = new ImageView(activity);
        this.Q0 = imageView6;
        imageView6.setVisibility(4);
        imageView6.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ge geVar = new ge();
        this.x2 = geVar;
        imageView6.setImageDrawable(geVar);
        imageView6.setContentDescription(org.telegram.messenger.hd.M0(2131752589, "Cancel"));
        imageView6.setSoundEffectsEnabled(false);
        imageView6.setScaleX(0.1f);
        imageView6.setScaleY(0.1f);
        imageView6.setAlpha(0.0f);
        org.telegram.ui.Cells.y h06 = org.telegram.ui.ActionBar.j6.h0(u0(i14), 1, -1);
        org.telegram.ui.ActionBar.m6 M5 = org.telegram.ui.ActionBar.q6.M(i14);
        imageView6.setBackground(h06);
        org.telegram.ui.ActionBar.q6.j(imageView6, h06, null, M5, e6Var);
        udVar3.addView(imageView6, c8.ja.e(44, 44, 85));
        imageView6.setOnClickListener(new xc(this, 3));
        he heVar = new he(this, activity, c() ? R.drawable.input_schedule : R.drawable.send_plane_24, e6Var);
        this.K0 = heVar;
        heVar.setVisibility(4);
        heVar.setContentDescription(org.telegram.messenger.hd.M0(2131745640, null));
        heVar.setSoundEffectsEnabled(false);
        heVar.setScaleX(0.1f);
        heVar.setScaleY(0.1f);
        heVar.setAlpha(0.0f);
        udVar3.addView(heVar, c8.ja.e(100, 44, 85));
        heVar.setOnClickListener(new xc(this, 4));
        heVar.setOnLongClickListener(new jd(this, i12));
        if (org.telegram.messenger.g0.C1()) {
            udVar3.setOnLongClickListener(new jd(this, i12));
        }
        jh.h hVar = new jh.h(activity, e6Var);
        this.J0 = hVar;
        hVar.setVisibility(4);
        hVar.setOnClickListener(new xc(this, 11));
        udVar3.addView(hVar, c8.ja.e(44, 44, 85));
        kg kgVar = new kg(activity);
        org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) kgVar.c;
        this.G0 = kgVar;
        j5Var.setTextSize(16);
        kgVar.invalidate();
        kgVar.setVisibility(4);
        kgVar.setSoundEffectsEnabled(false);
        kgVar.setScaleX(0.1f);
        kgVar.setScaleY(0.1f);
        kgVar.setAlpha(0.0f);
        kgVar.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        j5Var.setGravity(21);
        kgVar.invalidate();
        j5Var.setTextColor(u0(i13));
        kgVar.invalidate();
        udVar3.addView(kgVar, c8.ja.e(74, 44, 85));
        kgVar.setOnClickListener(new xc(this, 13));
        kgVar.setOnLongClickListener(new jd(this, 1));
        SharedPreferences d12 = org.telegram.messenger.np.d1();
        this.f3 = d12.getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
        this.g3 = d12.getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
        B1(false, false);
        N(false);
        I();
        Z();
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x012e, code lost:
    
        if (r4 != null) goto L76;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [int] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [int] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean K(int i7, long j3, org.telegram.ui.ActionBar.e2 e2Var, CharSequence charSequence) {
        p5[] p5VarArr;
        int i10;
        int i11;
        TLRPC.ChatFull N0;
        TLRPC.TL_messages_stickerSet Y;
        ArrayList arrayList;
        int i12;
        ArrayList<TLRPC.Document> arrayList2;
        ArrayList<TLRPC.Document> arrayList3;
        Object obj;
        ArrayList<TLRPC.Document> arrayList4;
        boolean z10 = false;
        if (charSequence != null && e2Var != null && !org.telegram.messenger.m10.i(i7).q() && org.telegram.messenger.m10.i(i7).e() != j3 && (charSequence instanceof Spanned) && (p5VarArr = (p5[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), p5.class)) != null) {
            int i13 = 0;
            while (i13 < p5VarArr.length) {
                p5 p5Var = p5VarArr[i13];
                if (p5Var != null) {
                    TLRPC.Document document = p5Var.document;
                    if (document == null) {
                        i11 = i7;
                        document = g5.e(i11, p5Var.getDocumentId());
                    } else {
                        i11 = i7;
                    }
                    long documentId = p5VarArr[i13].getDocumentId();
                    if (document == null) {
                        ArrayList s02 = org.telegram.messenger.si.b0(i11).s0(5);
                        int size = s02.size();
                        ?? r12 = z10;
                        ?? r62 = s02;
                        while (r12 < size) {
                            Object obj2 = r62.get(r12);
                            int i14 = r12 + 1;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
                            if (tL_messages_stickerSet != null && (arrayList4 = tL_messages_stickerSet.documents) != null && !arrayList4.isEmpty()) {
                                ArrayList<TLRPC.Document> arrayList5 = tL_messages_stickerSet.documents;
                                int size2 = arrayList5.size();
                                ?? r15 = z10;
                                r62 = r62;
                                while (r15 < size2) {
                                    TLRPC.Document document2 = arrayList5.get(r15);
                                    int i15 = r15 + 1;
                                    TLRPC.Document document3 = document2;
                                    i10 = i13;
                                    obj = r62;
                                    if (document3.id == documentId) {
                                        document = document3;
                                        break;
                                    }
                                    r62 = obj;
                                    i13 = i10;
                                    r15 = i15;
                                }
                            }
                            i10 = i13;
                            obj = r62;
                            if (document != null) {
                                break;
                            }
                            r62 = obj;
                            i13 = i10;
                            z10 = false;
                            r12 = i14;
                        }
                    }
                    i10 = i13;
                    if (document == null) {
                        ArrayList arrayList6 = org.telegram.messenger.si.b0(i11).t0[1];
                        int size3 = arrayList6.size();
                        int i16 = 0;
                        while (i16 < size3) {
                            Object obj3 = arrayList6.get(i16);
                            i16++;
                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj3;
                            if (stickerSetCovered != null && (arrayList3 = stickerSetCovered.covers) != null && !arrayList3.isEmpty()) {
                                ArrayList<TLRPC.Document> arrayList7 = stickerSetCovered.covers;
                                int size4 = arrayList7.size();
                                int i17 = 0;
                                while (i17 < size4) {
                                    TLRPC.Document document4 = arrayList7.get(i17);
                                    i17++;
                                    TLRPC.Document document5 = document4;
                                    arrayList = arrayList6;
                                    i12 = size3;
                                    if (document5.id == documentId) {
                                        document = document5;
                                        break;
                                    }
                                    arrayList6 = arrayList;
                                    size3 = i12;
                                }
                            }
                            arrayList = arrayList6;
                            i12 = size3;
                            if (document != null) {
                                break;
                            }
                            if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                arrayList2 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                            } else {
                                if ((stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) && stickerSetCovered.set != null) {
                                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                                    tL_inputStickerSetID.id = stickerSetCovered.set.id;
                                    TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.si.b0(i11).m0(tL_inputStickerSetID, true);
                                    if (m0 != null) {
                                        arrayList2 = m0.documents;
                                    }
                                }
                                arrayList2 = null;
                            }
                            if (arrayList2 != null && !arrayList2.isEmpty()) {
                                int size5 = arrayList2.size();
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= size5) {
                                        break;
                                    }
                                    TLRPC.Document document6 = arrayList2.get(i18);
                                    i18++;
                                    TLRPC.Document document7 = document6;
                                    if (document7.id == documentId) {
                                        document = document7;
                                        break;
                                    }
                                }
                            }
                            if (document != null) {
                                break;
                            }
                            arrayList6 = arrayList;
                            size3 = i12;
                        }
                    }
                    if (document != null && (N0 = org.telegram.messenger.np.s1(i11).N0(-j3)) != null && N0.emojiset != null && (Y = org.telegram.messenger.si.b0(i11).Y(N0.emojiset)) != null) {
                        ArrayList<TLRPC.Document> arrayList8 = Y.documents;
                        int size6 = arrayList8.size();
                        int i19 = 0;
                        while (i19 < size6) {
                            TLRPC.Document document8 = arrayList8.get(i19);
                            i19++;
                            if (document8.id == documentId) {
                                return false;
                            }
                        }
                    }
                    if (document == null || !org.telegram.messenger.gj.m3(document)) {
                        cc.a0(e2Var).r(document, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131743864, "UnlockPremiumEmojiHint")), org.telegram.messenger.hd.M0(2131747033, "PremiumMore"), new bd(0, e2Var)).j();
                        return true;
                    }
                } else {
                    i10 = i13;
                }
                i13 = i10 + 1;
                z10 = false;
            }
        }
        return z10;
    }

    public static void f(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.cj cjVar, boolean z10, int i7, int i10, Object obj, Long l10, boolean z11) {
        if (chatActivityEnterView.H0 > 0 && !chatActivityEnterView.c()) {
            cg cgVar = chatActivityEnterView.H3;
            if (cgVar != null) {
                kg kgVar = chatActivityEnterView.G0;
                cgVar.s1(kgVar, ((org.telegram.ui.ActionBar.j5) kgVar.c).getText(), true);
                return;
            }
            return;
        }
        if (chatActivityEnterView.z2 != 0) {
            chatActivityEnterView.D1(0, true);
            chatActivityEnterView.V0.t(true);
            chatActivityEnterView.V0.A();
        }
        chatActivityEnterView.E1(false, true, false, true);
        cg cgVar2 = chatActivityEnterView.H3;
        TL_stories.StoryItem c12 = cgVar2 != null ? cgVar2.c1() : null;
        org.telegram.messenger.ez C = org.telegram.messenger.ez.C(chatActivityEnterView.R);
        long j3 = chatActivityEnterView.y3;
        org.telegram.messenger.gj gjVar = chatActivityEnterView.B3;
        org.telegram.messenger.gj threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.qm qmVar = chatActivityEnterView.D3;
        boolean z12 = obj instanceof TLRPC.TL_messages_stickerSet;
        org.telegram.ui.an anVar = chatActivityEnterView.x3;
        C.v0(document, str, j3, gjVar, threadMessage, c12, qmVar, cjVar, z10, i7, i10, z12, obj, anVar != null ? anVar.Y8() : null, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
        cg cgVar3 = chatActivityEnterView.H3;
        if (cgVar3 != null) {
            cgVar3.M(null, true, i7, 0, 0L);
        }
        if (z11) {
            chatActivityEnterView.setFieldText("");
        }
        org.telegram.messenger.si.b0(chatActivityEnterView.R).d(0, obj, document, (int) (System.currentTimeMillis() / 1000), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void g(ChatActivityEnterView chatActivityEnterView, TL_keyboard.KeyboardButton keyboardButton) {
        boolean z10;
        org.telegram.messenger.gj gjVar;
        org.telegram.messenger.gj gjVar2;
        boolean i02;
        org.telegram.messenger.gj gjVar3;
        cg cgVar;
        org.telegram.ui.an anVar;
        boolean z11 = chatActivityEnterView.B3 != null && (anVar = chatActivityEnterView.x3) != null && anVar.w4 && anVar.b() == ((long) chatActivityEnterView.B3.e1());
        if (chatActivityEnterView.B3 == null || z11) {
            int i7 = chatActivityEnterView.R;
            long j3 = chatActivityEnterView.y3;
            if (j3 > 0) {
                z10 = org.telegram.messenger.q10.u(org.telegram.messenger.np.s1(i7).a2(Long.valueOf(j3)));
            } else {
                org.telegram.messenger.np.s1(i7).M0(Long.valueOf(-j3));
                z10 = false;
            }
            if (!z10) {
                gjVar = org.telegram.messenger.m5.z(chatActivityEnterView.y3) ? chatActivityEnterView.U2 : null;
                gjVar2 = chatActivityEnterView.B3;
                if (gjVar2 != null || z11) {
                    gjVar2 = chatActivityEnterView.U2;
                }
                i02 = chatActivityEnterView.i0(keyboardButton, gjVar, gjVar2, null);
                if (chatActivityEnterView.B3 != null || z11) {
                    gjVar3 = chatActivityEnterView.U2;
                    if (gjVar3 != null && gjVar3.k.reply_markup.single_use) {
                        if (i02) {
                            chatActivityEnterView.L1(0, 0, true, true);
                        } else {
                            chatActivityEnterView.X0();
                        }
                        org.telegram.messenger.np.s1(chatActivityEnterView.R).f7.edit().putInt("answered_" + chatActivityEnterView.getTopicKeyString(), chatActivityEnterView.U2.e1()).commit();
                    }
                } else {
                    chatActivityEnterView.X0();
                    chatActivityEnterView.p1(chatActivityEnterView.E3, true, false);
                }
                cgVar = chatActivityEnterView.H3;
                if (cgVar == null) {
                    cgVar.M(null, true, 0, 0, 0L);
                    return;
                }
                return;
            }
        }
        gjVar = chatActivityEnterView.B3;
        gjVar2 = chatActivityEnterView.B3;
        if (gjVar2 != null) {
        }
        gjVar2 = chatActivityEnterView.U2;
        i02 = chatActivityEnterView.i0(keyboardButton, gjVar, gjVar2, null);
        if (chatActivityEnterView.B3 != null) {
        }
        gjVar3 = chatActivityEnterView.U2;
        if (gjVar3 != null) {
            if (i02) {
            }
            org.telegram.messenger.np.s1(chatActivityEnterView.R).f7.edit().putInt("answered_" + chatActivityEnterView.getTopicKeyString(), chatActivityEnterView.U2.e1()).commit();
        }
        cgVar = chatActivityEnterView.H3;
        if (cgVar == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.telegram.messenger.gj getThreadMessage() {
        org.telegram.ui.an anVar = this.x3;
        if (anVar != null) {
            return anVar.m4;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getThreadMessageId() {
        org.telegram.messenger.gj gjVar;
        org.telegram.ui.an anVar = this.x3;
        if (anVar == null || (gjVar = anVar.m4) == null) {
            return 0;
        }
        return gjVar.e1();
    }

    private String getTopicKeyString() {
        org.telegram.ui.an anVar = this.x3;
        if (anVar == null || !anVar.w4) {
            return "" + this.y3;
        }
        return this.y3 + "_" + anVar.b();
    }

    public static CharSequence q(Paint.FontMetricsInt fontMetricsInt, CharSequence charSequence, ArrayList arrayList) {
        boolean z10;
        boolean z11;
        Collections.sort(arrayList, org.telegram.messenger.si.e2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(d00.a(charSequence, false));
        Object[] spans = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), Object.class);
        if (spans != null && spans.length > 0) {
            for (Object obj : spans) {
                spannableStringBuilder.removeSpan(obj);
            }
        }
        boolean z12 = true;
        if (arrayList != null) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                try {
                    TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i7);
                    if (messageEntity.offset + messageEntity.length <= spannableStringBuilder.length()) {
                        if (messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            i41 i41Var = new i41("" + ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id, 3, null);
                            int i10 = messageEntity.offset;
                            spannableStringBuilder.setSpan(i41Var, i10, messageEntity.length + i10, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            i41 i41Var2 = new i41("" + ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id, 3, null);
                            int i11 = messageEntity.offset;
                            spannableStringBuilder.setSpan(i41Var2, i11, messageEntity.length + i11, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityCode) {
                            wy0 wy0Var = new wy0();
                            wy0Var.a |= 4;
                            xy0 xy0Var = new xy0(wy0Var, 0);
                            int i12 = messageEntity.offset;
                            org.telegram.messenger.si.f(xy0Var, i12, messageEntity.length + i12, spannableStringBuilder, true);
                        } else if (!(messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                            if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                wy0 wy0Var2 = new wy0();
                                wy0Var2.a |= 1;
                                xy0 xy0Var2 = new xy0(wy0Var2, 0);
                                int i13 = messageEntity.offset;
                                org.telegram.messenger.si.f(xy0Var2, i13, messageEntity.length + i13, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                wy0 wy0Var3 = new wy0();
                                wy0Var3.a |= 2;
                                xy0 xy0Var3 = new xy0(wy0Var3, 0);
                                int i14 = messageEntity.offset;
                                org.telegram.messenger.si.f(xy0Var3, i14, messageEntity.length + i14, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                wy0 wy0Var4 = new wy0();
                                wy0Var4.a |= 8;
                                xy0 xy0Var4 = new xy0(wy0Var4, 0);
                                int i15 = messageEntity.offset;
                                org.telegram.messenger.si.f(xy0Var4, i15, messageEntity.length + i15, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                wy0 wy0Var5 = new wy0();
                                wy0Var5.a |= 16;
                                xy0 xy0Var5 = new xy0(wy0Var5, 0);
                                int i16 = messageEntity.offset;
                                org.telegram.messenger.si.f(xy0Var5, i16, messageEntity.length + i16, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                h41 h41Var = new h41(messageEntity.url, null);
                                int i17 = messageEntity.offset;
                                spannableStringBuilder.setSpan(h41Var, i17, messageEntity.length + i17, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityFormattedDate) {
                                wy0 wy0Var6 = new wy0();
                                wy0Var6.a |= 128;
                                int i18 = messageEntity.offset;
                                wy0Var6.b = i18;
                                wy0Var6.c = i18 + messageEntity.length;
                                wy0Var6.d = messageEntity;
                                int i19 = messageEntity.offset;
                                d00 d00Var = new d00(spannableStringBuilder.subSequence(i19, messageEntity.length + i19).toString(), wy0Var6, (TLRPC.TL_messageEntityFormattedDate) messageEntity);
                                int i20 = messageEntity.offset;
                                spannableStringBuilder.setSpan(d00Var, i20, messageEntity.length + i20, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                wy0 wy0Var7 = new wy0();
                                wy0Var7.a |= 256;
                                xy0 xy0Var6 = new xy0(wy0Var7, 0);
                                int i21 = messageEntity.offset;
                                org.telegram.messenger.si.f(xy0Var6, i21, messageEntity.length + i21, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                p5 p5Var = tL_messageEntityCustomEmoji.document != null ? new p5(tL_messageEntityCustomEmoji.document, fontMetricsInt) : new p5(tL_messageEntityCustomEmoji.document_id, fontMetricsInt);
                                int i22 = messageEntity.offset;
                                spannableStringBuilder.setSpan(p5Var, i22, messageEntity.length + i22, 33);
                            }
                        }
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        }
        if (arrayList != null) {
            TreeSet treeSet = new TreeSet();
            HashMap hashMap = new HashMap();
            for (int i23 = 0; i23 < arrayList.size(); i23++) {
                TLRPC.MessageEntity messageEntity2 = (TLRPC.MessageEntity) arrayList.get(i23);
                if (messageEntity2.offset + messageEntity2.length <= spannableStringBuilder.length()) {
                    int i24 = messageEntity2.offset;
                    int i25 = messageEntity2.length + i24;
                    if (messageEntity2 instanceof TLRPC.TL_messageEntityBlockquote) {
                        treeSet.add(Integer.valueOf(i24));
                        treeSet.add(Integer.valueOf(i25));
                        hashMap.put(Integer.valueOf(i24), Integer.valueOf((messageEntity2.collapsed ? 16 : 1) | (hashMap.containsKey(Integer.valueOf(i24)) ? ((Integer) hashMap.get(Integer.valueOf(i24))).intValue() : 0)));
                        hashMap.put(Integer.valueOf(i25), Integer.valueOf((hashMap.containsKey(Integer.valueOf(i25)) ? ((Integer) hashMap.get(Integer.valueOf(i25))).intValue() : 0) | 2));
                    }
                }
            }
            Iterator it = treeSet.iterator();
            int i26 = 0;
            int i27 = 0;
            boolean z13 = false;
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int intValue = num.intValue();
                int intValue2 = ((Integer) hashMap.get(num)).intValue();
                if (i26 != intValue) {
                    int i28 = intValue - 1;
                    z11 = z12;
                    int i29 = (i28 < 0 || i28 >= spannableStringBuilder.length() || spannableStringBuilder.charAt(i28) != '\n') ? intValue : intValue - 1;
                    if (i27 > 0) {
                        xg0.c(spannableStringBuilder, i26, i29, z13);
                    }
                    i26 = intValue + 1;
                    if (i26 >= spannableStringBuilder.length() || spannableStringBuilder.charAt(intValue) != '\n') {
                        i26 = intValue;
                    }
                } else {
                    z11 = z12;
                }
                if ((intValue2 & 2) != 0) {
                    i27--;
                }
                if ((intValue2 & 1) != 0 || (intValue2 & 16) != 0) {
                    i27++;
                    z13 = (intValue2 & 16) != 0 ? z11 : false;
                }
                z12 = z11;
            }
            z10 = z12;
            if (i26 < spannableStringBuilder.length() && i27 > 0) {
                xg0.c(spannableStringBuilder, i26, spannableStringBuilder.length(), z13);
            }
        } else {
            z10 = true;
        }
        CharSequence m10 = org.telegram.messenger.j6.m(new SpannableStringBuilder(spannableStringBuilder), fontMetricsInt, false, null, 0);
        if (arrayList != null) {
            try {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    TLRPC.MessageEntity messageEntity3 = (TLRPC.MessageEntity) arrayList.get(size);
                    if ((messageEntity3 instanceof TLRPC.TL_messageEntityPre) && messageEntity3.offset + messageEntity3.length <= m10.length()) {
                        if (!(m10 instanceof Spannable)) {
                            m10 = new SpannableStringBuilder(m10);
                        }
                        ((SpannableStringBuilder) m10).insert(messageEntity3.offset + messageEntity3.length, (CharSequence) "```\n");
                        SpannableStringBuilder spannableStringBuilder2 = (SpannableStringBuilder) m10;
                        int i30 = messageEntity3.offset;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("```");
                        String str = messageEntity3.language;
                        if (str == null) {
                            str = "";
                        }
                        sb2.append(str);
                        sb2.append("\n");
                        spannableStringBuilder2.insert(i30, (CharSequence) sb2.toString());
                    }
                }
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, z10);
            }
        }
        return m10;
    }

    public static float r2(int i7) {
        int i10 = i7 * 668265261;
        int i11 = (i10 ^ (i10 >>> 15)) * (-2048144789);
        return ((i11 ^ (i11 >>> 13)) >>> 8) / 1.6777216E7f;
    }

    public static int s2(int i7) {
        return (Color.blue(i7) + ((Color.green(i7) * 6) + (Color.red(i7) * 3))) / 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHintGlass(hi.l3 l3Var) {
        org.telegram.ui.an anVar = this.x3;
        if (anVar != null) {
            l3Var.l(anVar.L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSlowModeButtonVisible(boolean z10) {
        int i7;
        int i10 = z10 ? 0 : 8;
        kg kgVar = this.G0;
        kgVar.setVisibility(i10);
        if (z10) {
            i7 = org.telegram.messenger.g0.L(kgVar.b ? 26.0f : 16.0f);
        } else {
            i7 = 0;
        }
        xe xeVar = this.F0;
        if (xeVar == null || xeVar.getPaddingRight() == i7) {
            return;
        }
        this.F0.setPadding(0, org.telegram.messenger.g0.L(9.0f), i7, org.telegram.messenger.g0.L(10.0f));
    }

    public static float u2(float f10, float f11, float f12) {
        float i7 = Utilities.i((f12 - f10) / (f11 - f10), 1.0f, 0.0f);
        return com.google.android.gms.internal.vision.e2.C(i7, 2.0f, 3.0f, i7 * i7);
    }

    public final xf A() {
        xe xeVar = this.F0;
        CharSequence[] charSequenceArr = {org.telegram.messenger.g0.n1(xeVar == null ? "" : xeVar.getTextToUse())};
        ArrayList W = org.telegram.messenger.si.b0(this.R).W(charSequenceArr, true, true);
        CharSequence charSequence = charSequenceArr[0];
        int size = W.size();
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) W.get(i7);
            if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                messageEntity.length = charSequence.length() - messageEntity.offset;
            }
        }
        xf xfVar = new xf();
        xfVar.a = charSequence.toString();
        xfVar.b = W;
        return xfVar;
    }

    public final void A0(boolean z10) {
        xe xeVar;
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2 = this.c3;
        if (animatorSet2 == null || !animatorSet2.isRunning()) {
            int i7 = 1;
            if (this.C1) {
                z1(true);
            }
            this.K3 = null;
            this.J3 = null;
            this.L3 = null;
            this.M3 = null;
            i61 i61Var = this.g1;
            if (i61Var != null) {
                i61Var.a(true);
            }
            fe feVar = this.c1;
            if (feVar != null) {
                feVar.setVisibility(0);
            }
            td tdVar = this.L4;
            td tdVar2 = this.H4;
            td tdVar3 = this.J4;
            Property property = View.SCALE_Y;
            Property property2 = View.SCALE_X;
            wd wdVar = this.R0;
            Property property3 = View.ALPHA;
            zd zdVar = this.Z1;
            if (z10) {
                if (zdVar != null) {
                    this.d2 = 0.0f;
                    zdVar.setAlpha(0.0f);
                    zdVar.setScaleX(0.0f);
                    zdVar.setScaleY(0.0f);
                }
                this.n = 0.0f;
                this.h = 0.0f;
                Z1();
                this.c3 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(wdVar, tdVar3, this.B0 ? 0.5f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(wdVar, tdVar2, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.h1, (Property<fh0, Float>) property3, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.h1, (Property<fh0, Float>) property2, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.h1, (Property<fh0, Float>) property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f1, (Property<ud, Float>) property3, 0.0f));
                if (zdVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator = this.Y1;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        this.Y1 = null;
                    }
                    this.d2 = 1.0f;
                    arrayList.add(ObjectAnimator.ofFloat(zdVar, (Property<zd, Float>) property3, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(zdVar, (Property<zd, Float>) property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(zdVar, (Property<zd, Float>) property, 1.0f));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.F0, (Property<xe, Float>) property3, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.F0, tdVar, 0.0f));
                gg ggVar = this.w2;
                if (ggVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(ggVar, (Property<gg, Float>) property3, 0.0f));
                    this.w2.f();
                }
                this.c3.playTogether(arrayList);
                ki.a0 a0Var = this.m0;
                if (a0Var != null) {
                    a0Var.setAlpha(0.0f);
                    this.m0.setScaleY(0.0f);
                    this.m0.setScaleX(0.0f);
                    this.c3.playTogether(ObjectAnimator.ofFloat(this.m0, (Property<ki.a0, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.m0, (Property<ki.a0, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.m0, (Property<ki.a0, Float>) property, 1.0f));
                }
                this.c3.setDuration(150L);
                this.c3.addListener(new ie(this, i7));
            } else {
                boolean z11 = this.q5;
                fh0 fh0Var = this.h1;
                if (fh0Var != null && !z11) {
                    fh0Var.d();
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                boolean z12 = this.d1;
                Property property4 = View.TRANSLATION_X;
                if (z12) {
                    arrayList2.add(ObjectAnimator.ofFloat(this.g1, (Property<i61, Float>) property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.g1, (Property<i61, Float>) property4, -org.telegram.messenger.g0.L(20.0f)));
                    arrayList2.add(ObjectAnimator.ofFloat(this.F0, tdVar, 0.0f));
                    gg ggVar2 = this.w2;
                    if (ggVar2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(ggVar2, (Property<gg, Float>) property3, 0.0f));
                        this.w2.f();
                    }
                    animatorSet3.playTogether(arrayList2);
                    if (this.s == 1.0f) {
                        animatorSet3.playTogether(ObjectAnimator.ofFloat(this.F0, (Property<xe, Float>) property3, 1.0f));
                    } else {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.F0, (Property<xe, Float>) property3, 1.0f);
                        ofFloat.setStartDelay(750L);
                        ofFloat.setDuration(200L);
                        animatorSet3.playTogether(ofFloat);
                    }
                } else {
                    xe xeVar2 = this.F0;
                    if (xeVar2 == null || this.s != 1.0f || z11) {
                        this.H = 0.0f;
                        d2();
                        if (z11 && (xeVar = this.F0) != null) {
                            xeVar.setAlpha(0.0f);
                        }
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.F0, (Property<xe, Float>) property3, 1.0f);
                        ofFloat2.setStartDelay(z11 ? 600L : 750L);
                        ofFloat2.setDuration(z11 ? 360L : 200L);
                        if (z11) {
                            ofFloat2.setInterpolator(er.g);
                        }
                        animatorSet3.playTogether(ofFloat2);
                    } else {
                        xeVar2.setAlpha(1.0f);
                        this.H = 0.0f;
                        d2();
                    }
                    if (!z11) {
                        arrayList2.add(ObjectAnimator.ofFloat(this.i1, (Property<oi0, Float>) property3, 0.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.i1, (Property<oi0, Float>) property4, -org.telegram.messenger.g0.L(20.0f)));
                    }
                    gg ggVar3 = this.w2;
                    if (ggVar3 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(ggVar3, (Property<gg, Float>) property3, 0.0f));
                        this.w2.f();
                    }
                    animatorSet3.playTogether(arrayList2);
                }
                animatorSet3.setDuration(200L);
                if (zdVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.Y1;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.Y1 = null;
                    }
                    this.d2 = 0.0f;
                    zdVar.setAlpha(0.0f);
                    zdVar.setScaleX(0.0f);
                    zdVar.setScaleY(0.0f);
                    animatorSet = new AnimatorSet();
                    this.d2 = 1.0f;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(zdVar, (Property<zd, Float>) property3, 1.0f), ObjectAnimator.ofFloat(zdVar, (Property<zd, Float>) property2, 1.0f), ObjectAnimator.ofFloat(zdVar, (Property<zd, Float>) property, 1.0f));
                    animatorSet.setDuration(150L);
                } else {
                    animatorSet = null;
                }
                this.n = 0.0f;
                this.h = z11 ? 0.6f : 0.0f;
                Z1();
                AnimatorSet animatorSet4 = new AnimatorSet();
                float f10 = z11 ? 0.6f : 0.0f;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.h1, (Property<fh0, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.h1, (Property<fh0, Float>) property2, f10), ObjectAnimator.ofFloat(this.h1, (Property<fh0, Float>) property, f10), ObjectAnimator.ofFloat(wdVar, tdVar3, this.B0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(wdVar, tdVar2, 1.0f));
                ki.a0 a0Var2 = this.m0;
                if (a0Var2 != null) {
                    a0Var2.setAlpha(0.0f);
                    this.m0.setScaleY(0.0f);
                    this.m0.setScaleX(0.0f);
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(this.m0, (Property<ki.a0, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.m0, (Property<ki.a0, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.m0, (Property<ki.a0, Float>) property, 1.0f));
                }
                animatorSet4.setDuration(z11 ? 220L : 150L);
                if (z11) {
                    animatorSet4.setInterpolator(er.g);
                }
                animatorSet4.setStartDelay(z11 ? 1040L : 600L);
                AnimatorSet animatorSet5 = new AnimatorSet();
                this.c3 = animatorSet5;
                if (animatorSet != null) {
                    animatorSet5.playTogether(animatorSet3, animatorSet, animatorSet4);
                } else {
                    animatorSet5.playTogether(animatorSet3, animatorSet4);
                }
                this.c3.addListener(new hf(this));
            }
            AnimatorSet animatorSet6 = this.c3;
            if (animatorSet6 != null) {
                animatorSet6.start();
            }
            gg ggVar4 = this.w2;
            if (ggVar4 != null) {
                ggVar4.invalidate();
            }
        }
    }

    public final void A1(CharSequence charSequence, boolean z10) {
        this.e = charSequence;
        this.f = null;
        a2(z10);
    }

    public final float B(boolean z10) {
        te.c cVar = this.E6;
        float f10 = z10 ? cVar.h ? cVar.g : cVar.f : cVar.f;
        te.a aVar = this.F6;
        return ((this.o2 != null ? r1.getMeasuredHeight() : 0) * (z10 ? aVar.f ? 1.0f : 0.0f : aVar.e)) + f10;
    }

    public final void B0() {
        f1();
        this.K3 = null;
        this.J3 = null;
        this.L3 = null;
        this.M3 = null;
        i61 i61Var = this.g1;
        if (i61Var != null) {
            i61Var.a(true);
        }
        oi0 oi0Var = this.i1;
        if (oi0Var != null) {
            oi0Var.setAlpha(1.0f);
            this.i1.setTranslationX(0.0f);
        }
        i61 i61Var2 = this.g1;
        if (i61Var2 != null) {
            i61Var2.setAlpha(1.0f);
            this.g1.setTranslationX(0.0f);
        }
        xe xeVar = this.F0;
        if (xeVar != null) {
            xeVar.setAlpha(1.0f);
            this.H = 0.0f;
            d2();
            this.F0.requestFocus();
        }
        ud udVar = this.f1;
        if (udVar != null) {
            udVar.setVisibility(8);
        }
        K0();
    }

    public final void B1(boolean z10, boolean z11) {
        fe feVar = this.c1;
        if (feVar == null) {
            return;
        }
        this.d1 = z10;
        if (z11) {
            SharedPreferences e12 = org.telegram.messenger.np.e1();
            boolean z12 = false;
            if (org.telegram.messenger.m5.z(this.y3)) {
                TLRPC.Chat M0 = org.telegram.messenger.np.s1(this.S.a).M0(Long.valueOf(-this.y3));
                if (org.telegram.messenger.t3.T(M0) && !M0.megagroup) {
                    z12 = true;
                }
            }
            e12.edit().putBoolean(z12 ? "currentModeVideoChannel" : "currentModeVideo", z10).apply();
        }
        feVar.j(this.d1 ? ng.b : ng.a, z11);
        feVar.setContentDescription(org.telegram.messenger.hd.M0(this.d1 ? 2131754736 : 2131754734, null));
        this.a1.setContentDescription(org.telegram.messenger.hd.M0(this.d1 ? 2131754736 : 2131754734, null));
        feVar.sendAccessibilityEvent(8);
    }

    public final void C() {
        bi.v1 v1Var = this.e1;
        if (v1Var != null) {
            v1Var.setVisibility(8);
        }
        RecordCircle recordCircle = this.v2;
        if (recordCircle != null) {
            recordCircle.setVisibility(8);
        }
        this.b3 = null;
        K0();
        if (this.X1 != null) {
            this.y = 0.0f;
            U1();
        }
        SlideTextView slideTextView = this.S1;
        if (slideTextView != null) {
            slideTextView.setCancelToProgress(0.0f);
        }
        this.H3.b();
        j2(true);
    }

    public void C0(boolean z10) {
        if (this.o2 == null || !this.N3) {
            return;
        }
        nd ndVar = this.W;
        if (ndVar != null) {
            org.telegram.messenger.g0.r(ndVar);
        }
        this.N3 = false;
        this.O3 = false;
        if (this.P3) {
            this.F6.a(false, z10);
        }
    }

    public final void C1(org.telegram.messenger.gj gjVar, org.telegram.ui.qm qmVar, org.telegram.messenger.gj gjVar2) {
        org.telegram.messenger.gj gjVar3;
        org.telegram.ui.an anVar = this.x3;
        boolean z10 = (anVar == null || !anVar.T9() || this.C3 == gjVar2) ? false : true;
        if (gjVar != null) {
            if (this.E3 == null && (gjVar3 = this.U2) != this.B3) {
                this.E3 = gjVar3;
            }
            this.B3 = gjVar;
            this.D3 = qmVar;
            this.C3 = gjVar2;
            if (anVar == null || !anVar.w4 || anVar.m4 != gjVar) {
                p1(gjVar, true, true);
            }
        } else if (this.B3 == this.U2) {
            this.B3 = null;
            this.C3 = null;
            this.D3 = null;
            p1(this.E3, true, false);
            this.E3 = null;
        } else {
            this.B3 = null;
            this.D3 = null;
            this.C3 = null;
        }
        J(true);
        cg cgVar = this.H3;
        TL_stories.StoryItem c12 = cgVar != null ? cgVar.c1() : null;
        MediaController B = MediaController.B();
        org.telegram.messenger.gj threadMessage = getThreadMessage();
        B.r1 = gjVar;
        B.s1 = threadMessage;
        B.t1 = c12;
        a2(z10);
    }

    public final void D() {
        if (this.M2 && this.d1) {
            CameraController.getInstance().cancelOnInitRunnable(this.p4);
            this.H3.o2(5, 0, this.P ? Integer.MAX_VALUE : 0, this.n6, 0L, true);
            this.n6 = 0L;
            this.K0.setEffect(0L);
        } else {
            this.H3.a1(0);
            MediaController.B().B0(0, 0, false, false);
        }
        this.n3 = false;
        f2(2, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        if ((r4.getLineRight(0) + r3) >= ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight())) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean D0() {
        xe xeVar = this.F0;
        if (xeVar != null) {
            if (TextUtils.isEmpty(xeVar.getCaption())) {
                xe xeVar2 = this.F0;
                int L = org.telegram.messenger.g0.L(44.0f);
                Layout layout = xeVar2.getLayout();
                if (layout != null) {
                    if (layout.getLineCount() > 0) {
                        if (layout.getLineCount() <= 1) {
                        }
                    }
                }
            }
        }
        return org.telegram.messenger.hd.a0;
    }

    public final void D1(int i7, boolean z10) {
        boolean z11 = i7 != 0;
        if (z11 != (this.z2 != 0)) {
            ValueAnimator valueAnimator = this.w0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.w0.cancel();
            }
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x0, z11 ? 1.0f : 0.0f);
                this.w0 = ofFloat;
                int i10 = 4;
                ofFloat.addUpdateListener(new gd(this, i10));
                this.w0.addListener(new le(this, z11, i10));
                this.w0.setDuration(220L);
                this.w0.setInterpolator(er.f);
                this.w0.start();
            } else {
                this.x0 = z11 ? 1.0f : 0.0f;
                sf sfVar = this.V0;
                if (sfVar != null) {
                    sfVar.Z();
                }
            }
        }
        this.z2 = i7;
    }

    public final boolean E0() {
        return this.H2 != null;
    }

    public final void E1(boolean z10, boolean z11, boolean z12, boolean z13) {
        final int i7 = 1;
        org.telegram.ui.ActionBar.i1 i1Var = this.V;
        if ((i1Var != null && i1Var.f) || this.T3 || this.V0 == null) {
            return;
        }
        if (z12 || this.h4 != z10) {
            this.h4 = z10;
            cg cgVar = this.H3;
            if (cgVar != null) {
                cgVar.q1();
            }
            Point point = org.telegram.messenger.g0.q;
            final int i10 = point.x > point.y ? this.g3 : this.f3;
            AnimatorSet animatorSet = this.j4;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.j4 = null;
            }
            boolean z14 = this.h4;
            h2.f fVar = this.t4;
            org.telegram.ui.Cells.g1 g1Var = this.b4;
            final int i11 = 0;
            st0 st0Var = this.U1;
            if (z14) {
                if (z13) {
                    org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.j1, 1);
                }
                int height = st0Var.getHeight();
                this.W1 = height;
                int L = ((((height - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.n) - org.telegram.messenger.g0.L(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getHeight();
                this.l4 = L;
                if (this.z2 == 2) {
                    this.l4 = Math.min(L, org.telegram.messenger.g0.L(175.0f) + i10);
                }
                if (this.C6 == null) {
                    this.V0.getLayoutParams().height = this.l4;
                }
                st0Var.requestLayout();
                if (this.Q5) {
                    st0Var.setForeground(new jc(this));
                }
                xe xeVar = this.F0;
                if (xeVar != null) {
                    int selectionStart = xeVar.getSelectionStart();
                    int selectionEnd = this.F0.getSelectionEnd();
                    xe xeVar2 = this.F0;
                    xeVar2.setText(xeVar2.getText());
                    this.F0.setSelection(selectionStart, selectionEnd);
                }
                if (z11) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    if (this.C6 != null) {
                        animatorSet2.playTogether(ValueAnimator.ofInt(-(this.l4 - i10)), ValueAnimator.ofInt(-(this.l4 - i10)), ObjectAnimator.ofFloat(this.n4, "animationProgress", 1.0f));
                    } else {
                        animatorSet2.playTogether(ObjectAnimator.ofInt(this, g1Var, -(this.l4 - i10)), ObjectAnimator.ofInt(this.V0, g1Var, -(this.l4 - i10)), ObjectAnimator.ofFloat(this.n4, "animationProgress", 1.0f));
                    }
                    animatorSet2.setDuration(300L);
                    animatorSet2.setInterpolator(er.f);
                    if (this.C6 == null) {
                        ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.ed
                            public final /* synthetic */ ChatActivityEnterView b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                int i12 = i11;
                                int i13 = i10;
                                ChatActivityEnterView chatActivityEnterView = this.b;
                                switch (i12) {
                                    case 0:
                                        int i14 = ChatActivityEnterView.N6;
                                        chatActivityEnterView.k4 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.l4 - i13)));
                                        chatActivityEnterView.U1.invalidate();
                                        break;
                                    default:
                                        int i15 = ChatActivityEnterView.N6;
                                        chatActivityEnterView.k4 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.l4 - i13));
                                        chatActivityEnterView.U1.invalidate();
                                        break;
                                }
                            }
                        });
                    }
                    animatorSet2.addListener(new ie(this, 12));
                    this.j4 = animatorSet2;
                    this.V0.setLayerType(2, null);
                    fVar.d();
                    this.k4 = 0.0f;
                    st0Var.invalidate();
                    animatorSet2.start();
                } else {
                    this.k4 = 1.0f;
                    if (this.C6 == null) {
                        setTranslationY(-(this.l4 - i10));
                        this.V0.setTranslationY(-(this.l4 - i10));
                    }
                    AnimatedArrowDrawable animatedArrowDrawable = this.n4;
                    if (animatedArrowDrawable != null) {
                        animatedArrowDrawable.setAnimationProgress(1.0f);
                    }
                }
                rh.e eVar = this.C6;
                if (eVar != null) {
                    ((rh.h) eVar).h(this.l4);
                }
            } else {
                if (z13) {
                    org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.k1, 1);
                }
                if (z11) {
                    this.i4 = true;
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    if (this.C6 != null) {
                        animatorSet3.playTogether(ValueAnimator.ofInt(0), ValueAnimator.ofInt(0), ObjectAnimator.ofFloat(this.n4, "animationProgress", 0.0f));
                    } else {
                        animatorSet3.playTogether(ObjectAnimator.ofInt(this, g1Var, 0), ObjectAnimator.ofInt(this.V0, g1Var, 0), ObjectAnimator.ofFloat(this.n4, "animationProgress", 0.0f));
                    }
                    animatorSet3.setDuration(300L);
                    animatorSet3.setInterpolator(er.f);
                    if (this.C6 == null) {
                        ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.ed
                            public final /* synthetic */ ChatActivityEnterView b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                int i12 = i7;
                                int i13 = i10;
                                ChatActivityEnterView chatActivityEnterView = this.b;
                                switch (i12) {
                                    case 0:
                                        int i14 = ChatActivityEnterView.N6;
                                        chatActivityEnterView.k4 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.l4 - i13)));
                                        chatActivityEnterView.U1.invalidate();
                                        break;
                                    default:
                                        int i15 = ChatActivityEnterView.N6;
                                        chatActivityEnterView.k4 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.l4 - i13));
                                        chatActivityEnterView.U1.invalidate();
                                        break;
                                }
                            }
                        });
                    }
                    animatorSet3.addListener(new sd(this, i10, i11));
                    this.k4 = 1.0f;
                    st0Var.invalidate();
                    this.j4 = animatorSet3;
                    this.V0.setLayerType(2, null);
                    fVar.d();
                    animatorSet3.start();
                } else {
                    this.k4 = 0.0f;
                    if (this.C6 == null) {
                        setTranslationY(0.0f);
                        this.V0.setTranslationY(0.0f);
                        this.V0.getLayoutParams().height = i10;
                    }
                    st0Var.requestLayout();
                    st0Var.setForeground(null);
                    st0Var.setWillNotDraw(false);
                    AnimatedArrowDrawable animatedArrowDrawable2 = this.n4;
                    if (animatedArrowDrawable2 != null) {
                        animatedArrowDrawable2.setAnimationProgress(0.0f);
                    }
                }
                rh.e eVar2 = this.C6;
                if (eVar2 != null) {
                    ((rh.h) eVar2).h(i10);
                }
            }
            zd zdVar = this.T0;
            if (zdVar != null) {
                if (this.h4) {
                    zdVar.setContentDescription(org.telegram.messenger.hd.M0(2131754893, "AccDescrCollapsePanel"));
                } else {
                    zdVar.setContentDescription(org.telegram.messenger.hd.M0(2131754883, "AccDescrExpandPanel"));
                }
            }
        }
    }

    public final void F() {
        zd zdVar;
        org.telegram.ui.an anVar;
        if (this.M != null || (zdVar = this.s2) == null || zdVar.getRight() == 0 || (anVar = this.x3) == null || !org.telegram.messenger.v1.d(anVar.r8)) {
            return;
        }
        if (org.telegram.messenger.np.s1(this.R).f7.getBoolean(Calendar.getInstance().get(1) + "bdayhint_" + anVar.a(), true)) {
            org.telegram.messenger.np.s1(this.R).f7.edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + anVar.a(), false).apply();
            hi.l3 l3Var = new hi.l3(getContext(), 3);
            this.M = l3Var;
            l3Var.s(13.0f);
            setHintGlass(this.M);
            this.M.r(true);
            m1();
            this.M.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
            this.M.p(1.0f, -((getWidth() - org.telegram.messenger.g0.L(12.0f)) - ((this.s2.getMeasuredWidth() / 2.0f) + (this.s2.getX() + (this.X1.getX() + this.g2.getX())))));
            addView(this.M, c8.ja.d(-1, 200.0f, 48, 0.0f, -192.0f, 0.0f, 0.0f));
            hi.l3 l3Var2 = this.M;
            l3Var2.r0 = new uc(this, 18);
            l3Var2.d = 8000L;
            l3Var2.w();
        }
    }

    public final boolean F0() {
        return this.d1;
    }

    public final void F1(boolean z10, boolean z11) {
        if (this.d5 == z10 && z11) {
            return;
        }
        ImageView imageView = this.e2;
        int i7 = 1;
        if (imageView == null) {
            if (!z10 && !this.K6) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = new ImageView(getContext());
                this.e2 = imageView2;
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                ImageView imageView3 = this.e2;
                int i10 = org.telegram.ui.ActionBar.j6.Nl;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                org.telegram.ui.ActionBar.e6 e6Var = this.E4;
                org.telegram.ui.ActionBar.q6.s(imageView3, i10, e6Var, mode);
                this.e2.setImageResource(R.drawable.input_suggest_paid_24);
                ImageView imageView4 = this.e2;
                int i11 = org.telegram.ui.ActionBar.j6.i6;
                org.telegram.ui.ActionBar.q6.Q(imageView4, org.telegram.ui.ActionBar.j6.h0(u0(i11), 1, -1), null, org.telegram.ui.ActionBar.q6.M(i11), e6Var);
                if (this.K6) {
                    this.e2.setTranslationX(org.telegram.messenger.g0.L(42.0f));
                    this.h2.addView(this.e2, c8.ja.d(44, 44.0f, 85, 0.0f, 0.0f, 50.0f, 0.0f));
                } else {
                    this.X1.addView(this.e2, 0, c8.ja.o(44, 44));
                }
                this.e2.setOnClickListener(new xc(this, i7));
                this.e2.setContentDescription(org.telegram.messenger.hd.M0(2131754921, null));
            }
        }
        boolean z12 = this.d5 != z10;
        this.d5 = z10;
        float f10 = z10 ? 1.0f : 0.6f;
        float f11 = z10 ? 1.0f : 0.0f;
        this.e2.setEnabled(z10);
        this.e2.setClickable(z10);
        ValueAnimator valueAnimator = this.e5;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.e5 = null;
        }
        if (z11) {
            if (this.K6) {
                this.e2.setVisibility(0);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.e2.getAlpha(), f11);
            this.e5 = ofFloat;
            ofFloat.addUpdateListener(new gd(this, 10));
            this.e5.addListener(new le(this, z10, r3));
            this.e5.setDuration(220L);
            this.e5.setInterpolator(er.h);
            this.e5.start();
        } else {
            this.e2.setScaleX(f10);
            this.e2.setScaleY(f10);
            this.e2.setAlpha(f11);
            if (this.K6) {
                this.e2.setVisibility(z10 ? 0 : 8);
            }
        }
        b2(this.k6);
        if (z12) {
            N(true);
        }
    }

    @Override // te.b
    public final void G(int i7, float f10, float f11, te.c cVar) {
        ud udVar;
        float f12 = 0.0f;
        if (i7 == 0) {
            yh.a aVar = this.L1;
            if (aVar != null) {
                aVar.setVisibleHeight(f10);
            }
            if (this.w2 != null) {
                if (this.C1 && this.J5 && (udVar = this.f1) != null && udVar.getVisibility() == 0) {
                    f12 = -Math.max(0.0f, f10 - org.telegram.messenger.g0.L(44.0f));
                }
                this.K5 = f12;
                this.w2.setTranslationY(f12 + this.L5);
            }
            P();
            Q();
        } else if (i7 == 1) {
            P();
            Q();
        } else {
            if (i7 == 2) {
                jh.h hVar = this.J0;
                hVar.setAlpha(f10);
                hVar.setScaleX(org.telegram.messenger.g0.T1(0.5f, 1.0f, f10));
                hVar.setScaleY(org.telegram.messenger.g0.T1(0.5f, 1.0f, f10));
                hVar.setVisibility(f10 <= 0.0f ? 4 : 0);
            } else if (i7 == 3) {
                float T1 = org.telegram.messenger.g0.T1(1.0f, 0.79f, f10);
                ud udVar2 = this.i2;
                udVar2.setScaleX(T1);
                udVar2.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.79f, f10));
                float T12 = org.telegram.messenger.g0.T1(0.79f, 1.0f, f10);
                ImageView imageView = this.j2;
                imageView.setScaleX(T12);
                imageView.setScaleY(org.telegram.messenger.g0.T1(0.79f, 1.0f, f10));
                imageView.setVisibility(f10 <= 0.0f ? 8 : 0);
                imageView.setAlpha(f10);
                he heVar = this.K0;
                if (heVar != null) {
                    heVar.setSameWidthFactor(f10);
                }
            }
        }
        invalidate();
    }

    public final boolean G0() {
        return this.X0 || this.Y0;
    }

    public final void G1(boolean z10, boolean z11) {
        yh.a aVar;
        boolean z12 = false;
        if (!this.C1 || (aVar = this.L1) == null) {
            this.M1 = false;
            return;
        }
        if (this.M1 == z10 && z11) {
            return;
        }
        this.M1 = z10;
        oi0 oi0Var = this.i1;
        if (oi0Var != null) {
            aVar.c(Math.round(Math.max(1.0f, (oi0Var.w - oi0Var.s) * oi0Var.r)));
        }
        if (z10) {
            org.telegram.messenger.g0.r(this.P1);
        } else if (this.L1.c.hasFocus()) {
            org.telegram.messenger.g0.v1(this.L1.c);
            this.L1.c.clearFocus();
        }
        this.L1.setCollapsing(!z10);
        this.L1.animate().cancel();
        this.L1.setAlpha(1.0f);
        this.L1.setVisibility(0);
        ValueAnimator valueAnimator = this.O1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.O1 = null;
        }
        float f10 = z10 ? 1.0f : 0.0f;
        if (z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.N1, f10);
            this.O1 = ofFloat;
            ofFloat.addUpdateListener(new gd(this, 7));
            this.O1.setDuration(360L);
            this.O1.setInterpolator(er.h);
            this.O1.start();
        } else {
            u(f10);
        }
        he heVar = this.K0;
        if (heVar != null) {
            if (this.C1 && this.M1) {
                z12 = true;
            }
            heVar.setIconDimmed(z12);
        }
        gg ggVar = this.w2;
        if (ggVar != null) {
            ggVar.invalidate();
        }
    }

    public final void H() {
        xe xeVar = this.F0;
        boolean z10 = ((xeVar != null && !TextUtils.isEmpty(xeVar.getText())) || this.h3 || this.S3 || G0()) ? false : true;
        if (z10) {
            U();
        }
        ki.a0 a0Var = this.m0;
        if (a0Var != null) {
            boolean z11 = a0Var.f;
            if (z11 != z10) {
                a0Var.f = z10;
                a0Var.requestLayout();
                a0Var.invalidate();
            }
            if (z11 != this.m0.f) {
                wd wdVar = this.R0;
                Float valueOf = Float.valueOf(wdVar.getX());
                HashMap hashMap = this.C0;
                hashMap.put(wdVar, valueOf);
                xe xeVar2 = this.F0;
                if (xeVar2 != null) {
                    hashMap.put(xeVar2, Float.valueOf(xeVar2.getX()));
                }
            }
        }
    }

    public final boolean H0(View view) {
        return view == this.p2 || view == this.V0;
    }

    public final void H1(boolean z10) {
        org.telegram.ui.an anVar;
        ai.n0 n0Var;
        int i7 = 0;
        int i10 = 1;
        boolean z11 = (z10 || this.l2) && (anVar = this.x3) != null && !anVar.z() && ((n0Var = this.j1) == null || n0Var.r == 0);
        if (this.c6 == z11) {
            return;
        }
        if (z11) {
            org.telegram.messenger.np.s1(this.R).R1().b();
        }
        this.c6 = z11;
        ImageView imageView = this.b2;
        imageView.setVisibility(0);
        imageView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).setInterpolator(er.h).setDuration(420L).withEndAction(new fd(this, z11, i7)).start();
        if (!z11) {
            hi.l3 l3Var = this.N;
            if (l3Var != null) {
                l3Var.f(true);
                this.N = null;
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.t2 t2Var = this.a2;
        Objects.requireNonNull(t2Var);
        imageView.postDelayed(new g0(t2Var, i10), 220L);
        hi.l3 l3Var2 = this.N;
        if (l3Var2 != null) {
            l3Var2.f(true);
            this.N = null;
        }
        if (org.telegram.messenger.np.e1().getInt("aihintshown", 0) < 3) {
            hi.l3 l3Var3 = new hi.l3(getContext(), 3);
            this.N = l3Var3;
            l3Var3.r(true);
            this.N.u(org.telegram.messenger.hd.M0(2131754992, null));
            setHintGlass(this.N);
            this.N.p(0.0f, (imageView.getWidth() / 2.0f) + org.telegram.messenger.g0.L(4.0f));
            addView(this.N, c8.ja.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
            hi.l3 l3Var4 = this.N;
            l3Var4.r0 = new org.telegram.ui.zg(27, this, l3Var3);
            l3Var4.d = 4000L;
            l3Var4.w();
            org.telegram.messenger.np.e1().edit().putInt("aihintshown", org.telegram.messenger.np.e1().getInt("aihintshown", 0) + 1).apply();
        }
    }

    public final void I() {
        org.telegram.ui.an anVar = this.x3;
        if (anVar == null) {
            return;
        }
        e2(anVar.e, anVar.r8);
    }

    public final boolean I0() {
        return this.n3 && ChatActivityEnterView.this.a5;
    }

    public final void I1() {
        org.telegram.ui.an anVar = this.x3;
        if (anVar == null || !org.telegram.messenger.t3.V(anVar.e)) {
            return;
        }
        cc.a0(anVar).f(org.telegram.messenger.np.s1(this.R).V4, new uc(this, 4)).j();
    }

    public final void J(boolean z10) {
        org.telegram.messenger.gj gjVar;
        boolean z11 = this.y3 < 0 && this.F4 && this.H2 == null && (bg.w.g(this.R).e(getEditText() != null ? getEditText().toString() : null, this.w6) > 0 || ((gjVar = this.B3) != null && org.telegram.messenger.gj.c3(gjVar.k)));
        te.a aVar = this.H6;
        boolean z12 = aVar.f != z11;
        aVar.a(z11, z10);
        he heVar = this.K0;
        if (heVar != null) {
            heVar.y = z11;
            heVar.invalidate();
        }
        if (z12) {
            N(z10);
        }
    }

    public final boolean J0() {
        if (this.n3) {
            return true;
        }
        AnimatorSet animatorSet = this.b3;
        return (animatorSet == null || !animatorSet.isRunning() || this.S2) ? false : true;
    }

    public boolean J1(Runnable runnable) {
        return false;
    }

    public final void K1() {
        L1(1, 0, true, true);
    }

    @Override // org.telegram.ui.Components.rt0
    public final void L(int i7, boolean z10) {
        org.telegram.messenger.gj gjVar;
        xe xeVar;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        boolean z11;
        int i10;
        int i11;
        rh.e eVar;
        if (this.z2 != 0) {
            this.t3 = i7;
            this.u3 = z10;
            this.h3 = i7 > 0;
            H();
            return;
        }
        if (i7 > org.telegram.messenger.g0.L(50.0f) && this.h3 && !org.telegram.messenger.g0.E) {
            if (z10) {
                this.g3 = i7;
                org.telegram.messenger.np.d1().edit().putInt("kbd_height_land3", this.g3).commit();
            } else {
                this.f3 = i7;
                org.telegram.messenger.np.d1().edit().putInt("kbd_height", this.f3).commit();
            }
        }
        if (this.h3 && this.X0 && this.V0 == null) {
            this.X0 = false;
        }
        boolean G0 = G0();
        st0 st0Var = this.U1;
        org.telegram.ui.an anVar = this.x3;
        if (G0) {
            int i12 = z10 ? this.g3 : this.f3;
            if (anVar != null && anVar.getParentLayout() != null) {
                i12 -= ((ActionBarLayout) anVar.getParentLayout()).w(false);
            }
            if (this.N2 == 1) {
                pf pfVar = this.p2;
                if (!pfVar.f) {
                    i12 = Math.min(pfVar.getKeyboardHeight(), i12);
                }
            }
            int i13 = this.N2;
            ViewGroup viewGroup = i13 == 0 ? this.V0 : i13 == 1 ? this.p2 : null;
            pf pfVar2 = this.p2;
            if (pfVar2 != null) {
                pfVar2.setPanelHeight(i12);
                rh.e eVar2 = this.C6;
                if (eVar2 != null && i12 > 0 && this.N2 == 1) {
                    ((rh.h) eVar2).h(i12);
                }
            }
            if (viewGroup != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
                if (!this.i4 && !this.h4 && (((i10 = layoutParams.width) != (i11 = org.telegram.messenger.g0.q.x) || layoutParams.height != i12) && ((eVar = this.C6) == null || i10 != -1 || layoutParams.height != -1))) {
                    if (eVar == null) {
                        layoutParams.width = i11;
                        layoutParams.height = i12;
                        viewGroup.setLayoutParams(layoutParams);
                    }
                    if (st0Var != null) {
                        int i14 = this.i3;
                        this.i3 = layoutParams.height;
                        st0Var.requestLayout();
                        V0();
                        if (this.Q2 && !this.h3 && i14 != this.i3 && c1()) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.W0 = animatorSet;
                            if (this.C6 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(this.i3 - i14, 0.0f));
                            } else {
                                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.TRANSLATION_Y, this.i3 - i14, 0.0f));
                            }
                            this.W0.setInterpolator(org.telegram.ui.ActionBar.i1.w);
                            this.W0.setDuration(250L);
                            this.W0.addListener(new ie(this, 10));
                            org.telegram.messenger.g0.i3(this.G4, 50L);
                            this.t4.d();
                            requestLayout();
                        }
                    }
                }
            }
        }
        if (this.t3 == i7 && this.u3 == z10) {
            V0();
            return;
        }
        this.t3 = i7;
        this.u3 = z10;
        boolean z12 = this.h3;
        this.h3 = i7 > 0;
        H();
        if (this.h3 && G0() && this.j4 == null) {
            L1(0, this.N2, true, true);
        } else if (!this.h3 && !G0() && (gjVar = this.U2) != null && this.B3 != gjVar && !v0() && !y() && !org.telegram.ui.ActionBar.e2.hasSheets(anVar) && (((xeVar = this.F0) == null || TextUtils.isEmpty(xeVar.getText())) && (tL_replyKeyboardMarkup = this.V2) != null && !tL_replyKeyboardMarkup.rows.isEmpty())) {
            org.telegram.ui.ActionBar.i1 i1Var = st0Var.I;
            if (i1Var.f) {
                i1Var.j();
            } else {
                i1Var.v = true;
            }
            L1(1, 1, false, true);
        }
        if (this.i3 != 0 && !(z11 = this.h3) && z11 != z12 && !G0()) {
            this.i3 = 0;
            st0Var.requestLayout();
        }
        if (this.h3 && this.S3) {
            this.S3 = false;
            if (this.X3) {
                this.X3 = false;
                this.p2.setButtons(this.V2);
            }
            org.telegram.messenger.g0.r(this.Z3);
        }
        V0();
    }

    public final boolean L0() {
        return c() || this.H6.f;
    }

    public final void L1(int i7, int i10, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        int i11;
        ViewGroup viewGroup;
        int i12;
        float f10;
        if (i7 == 2) {
            return;
        }
        h2.f fVar = this.t4;
        ke keVar = this.G4;
        Property property = View.TRANSLATION_Y;
        int i13 = 1;
        boolean z14 = false;
        if (i7 == 1) {
            if (i10 == 0) {
                if (this.w3 == null && this.V0 == null) {
                    return;
                } else {
                    X();
                }
            }
            if (i10 == 0) {
                w();
                if (this.X0) {
                    this.V0.getVisibility();
                }
                this.V0.setVisibility(0);
                this.X0 = true;
                pf pfVar = this.p2;
                if (pfVar == null || pfVar.getVisibility() == 8) {
                    i11 = 0;
                } else {
                    this.p2.setVisibility(8);
                    this.Y0 = false;
                    i11 = this.p2.getMeasuredHeight();
                }
                this.V0.setShowing(true);
                viewGroup = this.V0;
                this.W3 = 0;
            } else if (i10 == 1) {
                if (this.Y0) {
                    this.p2.getVisibility();
                }
                this.Y0 = true;
                sf sfVar = this.V0;
                if (sfVar == null || sfVar.getVisibility() == 8) {
                    i12 = 0;
                } else {
                    this.V1.removeView(this.V0);
                    this.V0.setVisibility(8);
                    this.V0.setShowing(false);
                    this.X0 = false;
                    i12 = this.V0.getMeasuredHeight();
                }
                this.p2.setVisibility(0);
                ViewGroup viewGroup2 = this.p2;
                this.W3 = 1;
                org.telegram.messenger.np.s1(this.R).f7.edit().remove("closed_botkeyboard_" + getTopicKeyString()).apply();
                i11 = i12;
                viewGroup = viewGroup2;
            } else {
                i11 = 0;
                viewGroup = null;
            }
            this.N2 = i10;
            if (this.f3 <= 0) {
                f10 = 200.0f;
                this.f3 = org.telegram.messenger.np.d1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
            } else {
                f10 = 200.0f;
            }
            if (this.g3 <= 0) {
                this.g3 = org.telegram.messenger.np.d1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(f10));
            }
            Point point = org.telegram.messenger.g0.q;
            int i14 = point.x > point.y ? this.g3 : this.f3;
            org.telegram.ui.an anVar = this.x3;
            if (anVar != null && anVar.getParentLayout() != null) {
                i14 -= ((ActionBarLayout) anVar.getParentLayout()).w(false);
            }
            if (i10 == 1) {
                i14 = Math.min(this.p2.getKeyboardHeight(), i14);
            }
            pf pfVar2 = this.p2;
            if (pfVar2 != null) {
                pfVar2.setPanelHeight(i14);
            }
            if (viewGroup != null && this.C6 == null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
                layoutParams.height = i14;
                viewGroup.setLayoutParams(layoutParams);
            }
            if (!org.telegram.messenger.g0.E) {
                org.telegram.messenger.g0.v1(this.F0);
            }
            st0 st0Var = this.U1;
            if (st0Var != null) {
                this.i3 = i14;
                st0Var.requestLayout();
                t1(true, true);
                V1(true);
                V0();
                if (this.Q2 && !this.h3 && i14 != i11 && z10) {
                    uc ucVar = new uc(this, 15);
                    if (this.w) {
                        this.x = ucVar;
                    } else {
                        AnimatorSet animatorSet = new AnimatorSet();
                        this.W0 = animatorSet;
                        if (this.C6 != null) {
                            animatorSet.playTogether(ValueAnimator.ofFloat(i14 - i11, 0.0f));
                        } else {
                            float f11 = i14 - i11;
                            viewGroup.setTranslationY(f11);
                            this.W0.playTogether(ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) property, f11, 0.0f));
                        }
                        this.W0.setInterpolator(org.telegram.ui.ActionBar.i1.w);
                        this.W0.setDuration(250L);
                        this.W0.addListener(new ah.l(22, this, ucVar));
                        org.telegram.messenger.g0.i3(keVar, 50L);
                        fVar.d();
                    }
                    requestLayout();
                }
            }
            rh.e eVar = this.C6;
            if (eVar != null) {
                ((rh.h) eVar).h(i14);
            }
        } else {
            if (this.R0 != null) {
                t1(false, true);
            }
            this.N2 = -1;
            sf sfVar2 = this.V0;
            if (sfVar2 != null) {
                if (i7 == 2 && !org.telegram.messenger.g0.D && !org.telegram.messenger.g0.E) {
                    this.o4 = false;
                    cg cgVar = this.H3;
                    if (cgVar != null) {
                        cgVar.y(0.0f);
                    }
                    this.V1.removeView(this.V0);
                    this.V0 = null;
                } else if (!this.Q2 || this.h3 || this.h4) {
                    cg cgVar2 = this.H3;
                    if (cgVar2 != null) {
                        cgVar2.y(0.0f);
                    }
                    z14 = false;
                    this.i3 = 0;
                    this.V1.removeView(this.V0);
                    this.V0.setVisibility(8);
                    this.V0.setShowing(false);
                } else {
                    this.X0 = true;
                    this.W3 = 0;
                    sfVar2.setShowing(false);
                    a2 a2Var = new a2(this, i7, 4);
                    if (this.w) {
                        z12 = false;
                        this.x = a2Var;
                    } else {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.W0 = animatorSet2;
                        if (this.C6 != null) {
                            z12 = false;
                            animatorSet2.playTogether(ValueAnimator.ofFloat(this.V0.getMeasuredHeight()), ValueAnimator.ofFloat(0.0f, 1.0f));
                        } else {
                            z12 = false;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.V0, (Property<sf, Float>) property, r5.getMeasuredHeight()));
                        }
                        this.W0.setInterpolator(org.telegram.ui.ActionBar.i1.w);
                        this.W0.setDuration(250L);
                        fVar.d();
                        this.W0.addListener(new ah.l(23, this, a2Var));
                    }
                    org.telegram.messenger.g0.i3(keVar, 50L);
                    requestLayout();
                    z14 = z12;
                }
                this.X0 = z14;
            }
            pf pfVar3 = this.p2;
            if (pfVar3 != null && pfVar3.getVisibility() == 0) {
                if (i7 != 2 || org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                    if (this.Q2 && !this.h3) {
                        if (this.Y0) {
                            this.W3 = 1;
                        }
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        this.W0 = animatorSet3;
                        if (this.C6 != null) {
                            animatorSet3.playTogether(ValueAnimator.ofFloat(this.p2.getMeasuredHeight()));
                        } else {
                            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.p2, (Property<pf, Float>) property, r5.getMeasuredHeight()));
                        }
                        this.W0.setInterpolator(org.telegram.ui.ActionBar.i1.w);
                        this.W0.setDuration(250L);
                        this.W0.addListener(new sd(this, i7, i13));
                        fVar.d();
                        org.telegram.messenger.g0.i3(keVar, 50L);
                        requestLayout();
                    } else if (!this.S3) {
                        this.p2.setVisibility(8);
                    }
                }
                this.Y0 = false;
            }
            if (i10 == 1 && this.U2 != null) {
                org.telegram.messenger.np.s1(this.R).f7.edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.U2.e1()).apply();
            }
            V1(true);
            rh.e eVar2 = this.C6;
            if (eVar2 != null) {
                ((rh.h) eVar2).i(z11);
            }
        }
        if (this.f4 || this.g4) {
            N(true);
        }
        if (!this.h4 || i7 == 1) {
            z13 = false;
        } else {
            z13 = false;
            E1(false, false, false, true);
        }
        a2(z13);
        H();
    }

    public final void M() {
        boolean z10;
        boolean z11;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        if (this.M2) {
            return;
        }
        if (this.X1 == null) {
            this.M2 = false;
            B1(false, false);
            return;
        }
        boolean z12 = true;
        this.M2 = true;
        this.y0 = true;
        this.z0 = true;
        if (org.telegram.messenger.m5.z(this.y3)) {
            TLRPC.Chat M0 = org.telegram.messenger.np.s1(this.S.a).M0(Long.valueOf(-this.y3));
            z10 = org.telegram.messenger.t3.T(M0) && !M0.megagroup;
            if (z10 && !M0.creator && ((tL_chatAdminRights = M0.admin_rights) == null || !tL_chatAdminRights.post_messages)) {
                this.M2 = false;
            }
            this.y0 = org.telegram.messenger.t3.s(M0);
            this.z0 = org.telegram.messenger.t3.v(M0);
        } else {
            z10 = false;
        }
        if (!org.telegram.messenger.gz.y0) {
            this.M2 = false;
        }
        if (this.M2) {
            if (org.telegram.messenger.gz.P0) {
                CameraController.getInstance().initCamera(null);
            }
            z11 = org.telegram.messenger.np.e1().getBoolean(z10 ? "currentModeVideoChannel" : "currentModeVideo", z10);
        } else {
            z11 = false;
        }
        if (!this.y0 && z11) {
            z11 = false;
        }
        if (this.z0 || z11) {
            z12 = z11;
        } else if (!this.M2) {
            z12 = false;
        }
        B1(z12, false);
    }

    public final boolean M0() {
        return this.h4;
    }

    public final void M1() {
        cg cgVar = this.H3;
        if ((cgVar == null || !cgVar.l()) && org.telegram.messenger.m5.z(this.y3)) {
            TLRPC.Chat M0 = org.telegram.messenger.np.s1(this.S.a).M0(Long.valueOf(-this.y3));
            cc a02 = cc.a0(this.x3);
            StringBuilder sb2 = new StringBuilder();
            if (org.telegram.messenger.t3.p(M0)) {
                sb2.append(org.telegram.messenger.hd.M0(2131745607, null));
            }
            if (org.telegram.messenger.t3.u(M0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.hd.M0(2131745604, null));
            }
            if (org.telegram.messenger.t3.t(M0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.hd.M0(2131745605, null));
            }
            if (org.telegram.messenger.t3.o(M0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.hd.M0(2131745608, null));
            }
            if (org.telegram.messenger.t3.l(M0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.hd.M0(2131745609, null));
            }
            if (org.telegram.messenger.t3.v(M0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.hd.M0(2131745603, null));
            }
            if (org.telegram.messenger.t3.s(M0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.hd.M0(2131745606, null));
            }
            if (org.telegram.messenger.t3.m(M0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.hd.M0(2131745610, null));
            }
            a02.G(R.raw.passcode_lock_close, 3, org.telegram.messenger.hd.a0("SendPlainTextRestrictionHint", null, 2131745592, sb2.toString())).j();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:295:0x0814, code lost:
    
        if (org.telegram.messenger.t3.s(r4) == false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0817, code lost:
    
        r16 = 0.5f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0822, code lost:
    
        if (r3.voice_messages_forbidden != false) goto L283;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0f04  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0853  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x087b  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x0d4e  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0d78  */
    /* JADX WARN: Type inference failed for: r3v178 */
    /* JADX WARN: Type inference failed for: r3v179, types: [android.animation.AnimatorSet, android.view.ViewPropertyAnimator] */
    /* JADX WARN: Type inference failed for: r3v194 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v63 */
    /* JADX WARN: Type inference failed for: r4v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N(boolean z10) {
        he heVar;
        String str;
        ee eeVar;
        ImageView imageView;
        int i7;
        boolean z11;
        AnimatorSet animatorSet;
        ?? r42;
        int i10;
        ImageView imageView2;
        boolean z12;
        zd zdVar;
        zd zdVar2;
        AnimatorSet animatorSet2;
        int i11;
        float f10;
        zd zdVar3;
        AnimatorSet animatorSet3;
        ImageView imageView3;
        int i12;
        boolean z13;
        ?? r32;
        ?? r43;
        int i13;
        if (this.H2 != null || this.n3) {
            return;
        }
        boolean z14 = this.R2 ? false : z10;
        l2();
        xe xeVar = this.F0;
        CharSequence n1 = xeVar == null ? "" : org.telegram.messenger.g0.n1(xeVar.getTextToUse());
        int i14 = this.H0;
        he heVar2 = this.K0;
        td tdVar = this.I4;
        ee eeVar2 = this.a1;
        Property property = View.SCALE_X;
        Property property2 = View.SCALE_Y;
        Property property3 = View.ALPHA;
        org.telegram.ui.z51 z51Var = this.X1;
        fe feVar = this.c1;
        kg kgVar = this.G0;
        zd zdVar4 = this.Z1;
        ImageView imageView4 = this.Q0;
        boolean z15 = z14;
        if (i14 <= 0 || i14 == Integer.MAX_VALUE || L0()) {
            int length = n1.length();
            te.a aVar = this.G6;
            if (length > 0 || this.p3 || this.l2 || this.J3 != null || this.M3 != null || ((this.H0 == Integer.MAX_VALUE && !L0()) || ((this.K6 && getStarsPrice() > 0) || aVar.f))) {
                xe xeVar2 = this.F0;
                String caption = xeVar2 == null ? null : xeVar2.getCaption();
                boolean z16 = caption != null && (getSendButtonInternal().getVisibility() == 0 || ((zdVar2 = this.T0) != null && zdVar2.getVisibility() == 0));
                boolean z17 = caption == null && (imageView4.getVisibility() == 0 || ((zdVar = this.T0) != null && zdVar.getVisibility() == 0));
                int u02 = (this.H0 != Integer.MAX_VALUE || L0()) ? u0(org.telegram.ui.ActionBar.j6.Pe) : u0(org.telegram.ui.ActionBar.j6.Nl);
                boolean D0 = D0();
                heVar = heVar2;
                if (u02 != this.L0) {
                    this.L0 = u02;
                    Drawable background = heVar.getBackground();
                    int i15 = u02;
                    int red = Color.red(i15);
                    eeVar = eeVar2;
                    int green = Color.green(i15);
                    str = caption;
                    int blue = Color.blue(i15);
                    imageView = imageView4;
                    org.telegram.ui.ActionBar.j6.H1(background, Color.argb(24, red, green, blue), true);
                } else {
                    str = caption;
                    eeVar = eeVar2;
                    imageView = imageView4;
                }
                if (eeVar.getVisibility() != 0 && kgVar.getVisibility() != 0 && !z16 && !z17 && !aVar.f) {
                    lh.h hVar = this.D6;
                    if (hVar != null) {
                        hVar.e(0, D0 && !o2(), true);
                        if (zdVar4 != null) {
                            ViewPropertyAnimator viewPropertyAnimator = this.Y1;
                            if (viewPropertyAnimator != null) {
                                viewPropertyAnimator.cancel();
                                this.Y1 = null;
                            }
                            ViewPropertyAnimator animate = zdVar4.animate();
                            float f11 = x(D0) ? 0.0f : 1.0f;
                            this.d2 = f11;
                            ViewPropertyAnimator duration = animate.alpha(f11).scaleX(x(D0) ? 0.5f : 1.0f).scaleY(x(D0) ? 0.5f : 1.0f).setInterpolator(er.h).setDuration(320L);
                            this.Y1 = duration;
                            duration.start();
                        }
                    }
                } else {
                    if (!z15) {
                        ImageView imageView5 = imageView;
                        String str2 = str;
                        feVar.setScaleX(0.1f);
                        feVar.setScaleY(0.1f);
                        feVar.setAlpha(0.0f);
                        eeVar.setVisibility(8);
                        if (kgVar.getVisibility() == 0) {
                            kgVar.setScaleX(0.1f);
                            kgVar.setScaleY(0.1f);
                            kgVar.setAlpha(0.0f);
                            setSlowModeButtonVisible(false);
                        }
                        if (str2 != null) {
                            getSendButtonInternal().setScaleX(0.1f);
                            getSendButtonInternal().setScaleY(0.1f);
                            getSendButtonInternal().setAlpha(0.0f);
                            getSendButtonInternal().setVisibility(8);
                            imageView5.setScaleX(1.0f);
                            imageView5.setScaleY(1.0f);
                            imageView5.setAlpha(1.0f);
                            imageView5.setVisibility(0);
                        } else {
                            imageView5.setScaleX(0.1f);
                            imageView5.setScaleY(0.1f);
                            imageView5.setAlpha(0.0f);
                            getSendButtonInternal().setVisibility(0);
                            getSendButtonInternal().setScaleX(1.0f);
                            getSendButtonInternal().setScaleY(1.0f);
                            getSendButtonInternal().setAlpha(1.0f);
                            imageView5.setVisibility(8);
                        }
                        zd zdVar5 = this.T0;
                        if (zdVar5 == null || zdVar5.getVisibility() != 0) {
                            i7 = 8;
                        } else {
                            this.T0.setScaleX(0.1f);
                            this.T0.setScaleY(0.1f);
                            this.T0.setAlpha(0.0f);
                            i7 = 8;
                            this.T0.setVisibility(8);
                        }
                        if (z51Var != null) {
                            z51Var.setVisibility(i7);
                            if (this.H3 != null && getVisibility() == 0) {
                                this.H3.s0();
                            }
                            b2(0);
                            lh.h hVar2 = this.D6;
                            if (hVar2 != null) {
                                hVar2.e(0, D0 && !o2(), true);
                                if (zdVar4 != null) {
                                    float f12 = x(D0) ? 0.0f : 1.0f;
                                    this.d2 = f12;
                                    zdVar4.setAlpha(f12);
                                    zdVar4.setScaleX(x(D0) ? 0.5f : 1.0f);
                                    zdVar4.setScaleY(x(D0) ? 0.5f : 1.0f);
                                }
                            } else if (zdVar4 != null) {
                                this.d2 = 0.0f;
                                zdVar4.setAlpha(0.0f);
                                zdVar4.setScaleX(0.5f);
                                zdVar4.setScaleY(0.5f);
                            }
                        }
                        z11 = true;
                        this.t2 = true;
                        if (this.r2 != null) {
                            cg cgVar = this.H3;
                            if (cgVar != null && cgVar.E0()) {
                                this.r2.setVisibility(8);
                                this.r2.setTag(null);
                            }
                            this.r2.setAlpha(0.0f);
                            this.r2.setScaleX(0.0f);
                            this.r2.setScaleY(1.0f);
                            this.r2.setTranslationX(0.0f);
                        }
                        z12 = z11;
                        if (!this.S5 || (imageView3 = this.e2) == null) {
                            return;
                        }
                        if (z15) {
                            imageView3.animate().translationX(z12 ? -i5.c.d(64.0f, heVar.l(), 0) : org.telegram.messenger.g0.L(42.0f)).setDuration(320L).setInterpolator(er.h).start();
                            return;
                        } else {
                            imageView3.setTranslationX(z12 ? -i5.c.d(64.0f, heVar.l(), 0) : org.telegram.messenger.g0.L(42.0f));
                            return;
                        }
                    }
                    int i16 = this.d3;
                    if (i16 == 1 && str == null) {
                        return;
                    }
                    if (i16 == 3 && str != null) {
                        return;
                    }
                    AnimatorSet animatorSet4 = this.Z2;
                    if (animatorSet4 != null) {
                        animatorSet4.cancel();
                        animatorSet = null;
                        this.Z2 = null;
                    } else {
                        animatorSet = null;
                    }
                    AnimatorSet animatorSet5 = this.a3;
                    if (animatorSet5 != null) {
                        animatorSet5.cancel();
                        this.a3 = animatorSet;
                    }
                    if (z51Var != null) {
                        this.a3 = new AnimatorSet();
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(ObjectAnimator.ofFloat(z51Var, tdVar, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(z51Var, (Property<org.telegram.ui.z51, Float>) property, 0.5f));
                        ViewPropertyAnimator viewPropertyAnimator2 = this.Y1;
                        if (viewPropertyAnimator2 != null) {
                            viewPropertyAnimator2.cancel();
                            this.Y1 = null;
                        }
                        lh.h hVar3 = this.D6;
                        if (hVar3 != null) {
                            hVar3.e(0, D0 && !o2(), true);
                            if (zdVar4 != null) {
                                float f13 = x(D0) ? 0.0f : 1.0f;
                                this.d2 = f13;
                                arrayList.add(ObjectAnimator.ofFloat(zdVar4, (Property<zd, Float>) property3, f13));
                                arrayList.add(ObjectAnimator.ofFloat(zdVar4, (Property<zd, Float>) property, x(D0) ? 0.5f : 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(zdVar4, (Property<zd, Float>) property2, x(D0) ? 0.5f : 1.0f));
                            }
                        } else if (zdVar4 != null) {
                            this.d2 = 0.0f;
                            arrayList.add(ObjectAnimator.ofFloat(zdVar4, (Property<zd, Float>) property3, 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(zdVar4, (Property<zd, Float>) property, 0.5f));
                            arrayList.add(ObjectAnimator.ofFloat(zdVar4, (Property<zd, Float>) property2, 0.5f));
                        }
                        cg cgVar2 = this.H3;
                        boolean z18 = cgVar2 != null && cgVar2.E0();
                        this.t2 = true;
                        je jeVar = this.r2;
                        if (jeVar != null) {
                            jeVar.setScaleY(1.0f);
                            if (z18) {
                                this.r2.setTag(null);
                                arrayList.add(ObjectAnimator.ofFloat(this.r2, (Property<je, Float>) property3, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(this.r2, (Property<je, Float>) property, 0.0f));
                                arrayList.add(n(0.0f));
                            } else {
                                this.r2.setAlpha(0.0f);
                                this.r2.setScaleX(0.0f);
                                this.r2.setTranslationX(0.0f);
                            }
                        }
                        this.a3.playTogether(arrayList);
                        this.a3.setDuration(100L);
                        this.a3.addListener(new le(this, z18, 2));
                        this.a3.start();
                        b2(0);
                        if (this.H3 != null && getVisibility() == 0) {
                            this.H3.s0();
                        }
                    }
                    this.Z2 = new AnimatorSet();
                    ArrayList arrayList2 = new ArrayList();
                    if (eeVar.getVisibility() == 0) {
                        i10 = 1;
                        r42 = 0;
                        arrayList2.add(ObjectAnimator.ofFloat(feVar, (Property<fe, Float>) property, 0.1f));
                        arrayList2.add(ObjectAnimator.ofFloat(feVar, (Property<fe, Float>) property2, 0.1f));
                        arrayList2.add(ObjectAnimator.ofFloat(feVar, (Property<fe, Float>) property3, 0.0f));
                    } else {
                        r42 = 0;
                        i10 = 1;
                    }
                    zd zdVar6 = this.T0;
                    if (zdVar6 != null && zdVar6.getVisibility() == 0) {
                        zd zdVar7 = this.T0;
                        float[] fArr = new float[i10];
                        fArr[r42] = 0.1f;
                        arrayList2.add(ObjectAnimator.ofFloat(zdVar7, (Property<zd, Float>) property, fArr));
                        zd zdVar8 = this.T0;
                        float[] fArr2 = new float[i10];
                        fArr2[r42] = 0.1f;
                        arrayList2.add(ObjectAnimator.ofFloat(zdVar8, (Property<zd, Float>) property2, fArr2));
                        zd zdVar9 = this.T0;
                        float[] fArr3 = new float[i10];
                        fArr3[r42] = 0.0f;
                        arrayList2.add(ObjectAnimator.ofFloat(zdVar9, (Property<zd, Float>) property3, fArr3));
                    }
                    if (kgVar.getVisibility() == 0) {
                        float[] fArr4 = new float[i10];
                        fArr4[r42] = 0.1f;
                        arrayList2.add(ObjectAnimator.ofFloat(kgVar, (Property<kg, Float>) property, fArr4));
                        float[] fArr5 = new float[i10];
                        fArr5[r42] = 0.1f;
                        arrayList2.add(ObjectAnimator.ofFloat(kgVar, (Property<kg, Float>) property2, fArr5));
                        float[] fArr6 = new float[i10];
                        fArr6[r42] = 0.0f;
                        arrayList2.add(ObjectAnimator.ofFloat(kgVar, (Property<kg, Float>) property3, fArr6));
                    }
                    if (z16) {
                        arrayList2.add(o(r42));
                    } else if (z17) {
                        float[] fArr7 = new float[i10];
                        fArr7[r42] = 0.1f;
                        ImageView imageView6 = imageView;
                        arrayList2.add(ObjectAnimator.ofFloat(imageView6, (Property<ImageView, Float>) property, fArr7));
                        float[] fArr8 = new float[i10];
                        fArr8[r42] = 0.1f;
                        arrayList2.add(ObjectAnimator.ofFloat(imageView6, (Property<ImageView, Float>) property2, fArr8));
                        float[] fArr9 = new float[i10];
                        fArr9[r42] = 0.0f;
                        arrayList2.add(ObjectAnimator.ofFloat(imageView6, (Property<ImageView, Float>) property3, fArr9));
                        imageView2 = imageView6;
                        if (str == null) {
                            this.d3 = 3;
                            float[] fArr10 = new float[i10];
                            fArr10[r42] = 1.0f;
                            arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, fArr10));
                            float[] fArr11 = new float[i10];
                            fArr11[r42] = 1.0f;
                            arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, fArr11));
                            float[] fArr12 = new float[i10];
                            fArr12[r42] = 1.0f;
                            arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, fArr12));
                            imageView2.setVisibility(r42);
                        } else {
                            this.d3 = i10;
                            arrayList2.add(o(i10));
                            getSendButtonInternal().setVisibility(r42);
                        }
                        this.Z2.playTogether(arrayList2);
                        this.Z2.setDuration(220L);
                        this.Z2.setInterpolator(er.h);
                        this.Z2.addListener(new ah.l(21, this, str));
                        this.Z2.start();
                    }
                    imageView2 = imageView;
                    if (str == null) {
                    }
                    this.Z2.playTogether(arrayList2);
                    this.Z2.setDuration(220L);
                    this.Z2.setInterpolator(er.h);
                    this.Z2.addListener(new ah.l(21, this, str));
                    this.Z2.start();
                }
                z11 = true;
                z12 = z11;
                if (this.S5) {
                    return;
                } else {
                    return;
                }
            }
            if (this.V0 == null || !this.X0 || (!(this.f4 || (this.g4 && this.z2 == 2)) || org.telegram.messenger.g0.E || this.K6)) {
                if (getSendButtonInternal().getVisibility() == 0 || imageView4.getVisibility() == 0 || (((zdVar3 = this.T0) != null && zdVar3.getVisibility() == 0) || kgVar.getVisibility() == 0)) {
                    if (!z15) {
                        kgVar.setScaleX(0.1f);
                        kgVar.setScaleY(0.1f);
                        kgVar.setAlpha(0.0f);
                        setSlowModeButtonVisible(false);
                        getSendButtonInternal().setScaleX(0.1f);
                        getSendButtonInternal().setScaleY(0.1f);
                        getSendButtonInternal().setAlpha(0.0f);
                        getSendButtonInternal().setVisibility(8);
                        imageView4.setScaleX(0.1f);
                        imageView4.setScaleY(0.1f);
                        imageView4.setAlpha(0.0f);
                        imageView4.setVisibility(8);
                        zd zdVar10 = this.T0;
                        if (zdVar10 != null) {
                            zdVar10.setScaleX(0.1f);
                            this.T0.setScaleY(0.1f);
                            this.T0.setAlpha(0.0f);
                            this.T0.setVisibility(8);
                        }
                        feVar.setScaleX(1.0f);
                        feVar.setScaleY(1.0f);
                        feVar.setAlpha(1.0f);
                        eeVar2.setVisibility(0);
                        if (z51Var != null) {
                            if (getVisibility() == 0) {
                                this.H3.w2();
                            }
                            this.F = 1.0f;
                            U1();
                            z51Var.setScaleX(1.0f);
                            z51Var.setVisibility(0);
                            b2(1);
                        }
                        if (zdVar4 != null) {
                            ViewPropertyAnimator viewPropertyAnimator3 = this.Y1;
                            if (viewPropertyAnimator3 != null) {
                                viewPropertyAnimator3.cancel();
                                this.Y1 = null;
                            }
                            this.d2 = 1.0f;
                            zdVar4.setAlpha(1.0f);
                            zdVar4.setScaleX(1.0f);
                            zdVar4.setScaleY(1.0f);
                        }
                        this.t2 = false;
                        cg cgVar3 = this.H3;
                        if (cgVar3 != null && cgVar3.E0()) {
                            e0();
                        }
                        if (this.r2 != null) {
                            cg cgVar4 = this.H3;
                            if (cgVar4 != null && cgVar4.E0()) {
                                this.r2.setVisibility(0);
                                this.r2.setTag(1);
                            }
                            this.r2.setAlpha(1.0f);
                            this.r2.setScaleX(1.0f);
                            this.r2.setScaleY(1.0f);
                            this.r2.setTranslationX(0.0f);
                        }
                    } else {
                        if (this.d3 == 2) {
                            return;
                        }
                        AnimatorSet animatorSet6 = this.Z2;
                        if (animatorSet6 != null) {
                            animatorSet6.cancel();
                            animatorSet2 = null;
                            this.Z2 = null;
                        } else {
                            animatorSet2 = null;
                        }
                        AnimatorSet animatorSet7 = this.a3;
                        if (animatorSet7 != null) {
                            animatorSet7.cancel();
                            this.a3 = animatorSet2;
                        }
                        if (z51Var != null) {
                            if (z51Var.getVisibility() != 0) {
                                z51Var.setVisibility(0);
                                this.F = 0.0f;
                                U1();
                                z51Var.setScaleX(0.0f);
                            }
                            this.a3 = new AnimatorSet();
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(ObjectAnimator.ofFloat(z51Var, tdVar, 1.0f));
                            arrayList3.add(ObjectAnimator.ofFloat(z51Var, (Property<org.telegram.ui.z51, Float>) property, 1.0f));
                            lh.h hVar4 = this.D6;
                            if (hVar4 != null) {
                                hVar4.e(0, false, true);
                            }
                            if (zdVar4 != null) {
                                ViewPropertyAnimator viewPropertyAnimator4 = this.Y1;
                                if (viewPropertyAnimator4 != null) {
                                    viewPropertyAnimator4.cancel();
                                    this.Y1 = null;
                                }
                                this.d2 = 1.0f;
                                arrayList3.add(ObjectAnimator.ofFloat(zdVar4, (Property<zd, Float>) property3, 1.0f));
                                arrayList3.add(ObjectAnimator.ofFloat(zdVar4, (Property<zd, Float>) property, 1.0f));
                                arrayList3.add(ObjectAnimator.ofFloat(zdVar4, (Property<zd, Float>) property2, 1.0f));
                            }
                            cg cgVar5 = this.H3;
                            boolean z19 = cgVar5 != null && cgVar5.E0();
                            this.t2 = false;
                            if (z19) {
                                e0();
                            }
                            je jeVar2 = this.r2;
                            if (jeVar2 != null) {
                                if (z19) {
                                    jeVar2.setVisibility(0);
                                    this.r2.setTag(1);
                                    this.r2.setPivotX(org.telegram.messenger.g0.L(44.0f));
                                    arrayList3.add(ObjectAnimator.ofFloat(this.r2, (Property<je, Float>) property3, 1.0f));
                                    arrayList3.add(ObjectAnimator.ofFloat(this.r2, (Property<je, Float>) property, 1.0f));
                                    arrayList3.add(n(0.0f));
                                    ImageView imageView7 = this.q2;
                                    if (imageView7 != null && imageView7.getVisibility() == 0) {
                                        imageView7.setVisibility(8);
                                    }
                                } else {
                                    jeVar2.setAlpha(1.0f);
                                    this.r2.setScaleX(1.0f);
                                    this.r2.setScaleY(1.0f);
                                    this.r2.setTranslationX(0.0f);
                                }
                            }
                            this.a3.playTogether(arrayList3);
                            this.a3.setDuration(100L);
                            this.a3.addListener(new ie(this, 6));
                            this.a3.start();
                            b2(1);
                            if (getVisibility() == 0) {
                                this.H3.w2();
                            }
                        }
                        eeVar2.setVisibility(0);
                        this.Z2 = new AnimatorSet();
                        this.d3 = 2;
                        ArrayList arrayList4 = new ArrayList();
                        org.telegram.ui.an anVar = this.x3;
                        TLRPC.Chat g10 = anVar == null ? null : anVar.g();
                        TLRPC.UserFull R8 = anVar == null ? this.L : anVar.R8();
                        if (g10 != null) {
                            if (!org.telegram.messenger.t3.v(g10)) {
                            }
                            f10 = 1.0f;
                        } else if (R8 == null) {
                            i11 = 1;
                            f10 = 1.0f;
                            float[] fArr13 = new float[i11];
                            fArr13[0] = 1.0f;
                            arrayList4.add(ObjectAnimator.ofFloat(feVar, (Property<fe, Float>) property, fArr13));
                            float[] fArr14 = new float[i11];
                            fArr14[0] = 1.0f;
                            arrayList4.add(ObjectAnimator.ofFloat(feVar, (Property<fe, Float>) property2, fArr14));
                            float[] fArr15 = new float[i11];
                            fArr15[0] = f10;
                            arrayList4.add(ObjectAnimator.ofFloat(feVar, (Property<fe, Float>) property3, fArr15));
                            if (imageView4.getVisibility() != 0) {
                                float[] fArr16 = new float[i11];
                                fArr16[0] = 0.1f;
                                arrayList4.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property, fArr16));
                                float[] fArr17 = new float[i11];
                                fArr17[0] = 0.1f;
                                arrayList4.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property2, fArr17));
                                float[] fArr18 = new float[i11];
                                fArr18[0] = 0.0f;
                                arrayList4.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property3, fArr18));
                            } else {
                                zd zdVar11 = this.T0;
                                if (zdVar11 != null && zdVar11.getVisibility() == 0) {
                                    zd zdVar12 = this.T0;
                                    float[] fArr19 = new float[i11];
                                    fArr19[0] = 0.1f;
                                    arrayList4.add(ObjectAnimator.ofFloat(zdVar12, (Property<zd, Float>) property, fArr19));
                                    zd zdVar13 = this.T0;
                                    float[] fArr20 = new float[i11];
                                    fArr20[0] = 0.1f;
                                    arrayList4.add(ObjectAnimator.ofFloat(zdVar13, (Property<zd, Float>) property2, fArr20));
                                    zd zdVar14 = this.T0;
                                    float[] fArr21 = new float[i11];
                                    fArr21[0] = 0.0f;
                                    arrayList4.add(ObjectAnimator.ofFloat(zdVar14, (Property<zd, Float>) property3, fArr21));
                                } else if (kgVar.getVisibility() == 0) {
                                    float[] fArr22 = new float[i11];
                                    fArr22[0] = 0.1f;
                                    arrayList4.add(ObjectAnimator.ofFloat(kgVar, (Property<kg, Float>) property, fArr22));
                                    float[] fArr23 = new float[i11];
                                    fArr23[0] = 0.1f;
                                    arrayList4.add(ObjectAnimator.ofFloat(kgVar, (Property<kg, Float>) property2, fArr23));
                                    float[] fArr24 = new float[i11];
                                    fArr24[0] = 0.0f;
                                    arrayList4.add(ObjectAnimator.ofFloat(kgVar, (Property<kg, Float>) property3, fArr24));
                                } else {
                                    View sendButtonInternal = getSendButtonInternal();
                                    float[] fArr25 = new float[i11];
                                    fArr25[0] = 0.1f;
                                    arrayList4.add(ObjectAnimator.ofFloat(sendButtonInternal, (Property<View, Float>) property, fArr25));
                                    View sendButtonInternal2 = getSendButtonInternal();
                                    float[] fArr26 = new float[i11];
                                    fArr26[0] = 0.1f;
                                    arrayList4.add(ObjectAnimator.ofFloat(sendButtonInternal2, (Property<View, Float>) property2, fArr26));
                                    View sendButtonInternal3 = getSendButtonInternal();
                                    float[] fArr27 = new float[i11];
                                    fArr27[0] = 0.0f;
                                    arrayList4.add(ObjectAnimator.ofFloat(sendButtonInternal3, (Property<View, Float>) property3, fArr27));
                                }
                            }
                            this.Z2.playTogether(arrayList4);
                            this.Z2.setDuration(150L);
                            this.Z2.addListener(new ie(this, 7));
                            this.Z2.start();
                        }
                        i11 = 1;
                        float[] fArr132 = new float[i11];
                        fArr132[0] = 1.0f;
                        arrayList4.add(ObjectAnimator.ofFloat(feVar, (Property<fe, Float>) property, fArr132));
                        float[] fArr142 = new float[i11];
                        fArr142[0] = 1.0f;
                        arrayList4.add(ObjectAnimator.ofFloat(feVar, (Property<fe, Float>) property2, fArr142));
                        float[] fArr152 = new float[i11];
                        fArr152[0] = f10;
                        arrayList4.add(ObjectAnimator.ofFloat(feVar, (Property<fe, Float>) property3, fArr152));
                        if (imageView4.getVisibility() != 0) {
                        }
                        this.Z2.playTogether(arrayList4);
                        this.Z2.setDuration(150L);
                        this.Z2.addListener(new ie(this, 7));
                        this.Z2.start();
                    }
                }
            } else if (!z15) {
                kgVar.setScaleX(0.1f);
                kgVar.setScaleY(0.1f);
                kgVar.setAlpha(0.0f);
                setSlowModeButtonVisible(false);
                getSendButtonInternal().setScaleX(0.1f);
                getSendButtonInternal().setScaleY(0.1f);
                getSendButtonInternal().setAlpha(0.0f);
                getSendButtonInternal().setVisibility(8);
                imageView4.setScaleX(0.1f);
                imageView4.setScaleY(0.1f);
                imageView4.setAlpha(0.0f);
                imageView4.setVisibility(8);
                feVar.setScaleX(0.1f);
                feVar.setScaleY(0.1f);
                feVar.setAlpha(0.0f);
                eeVar2.setVisibility(8);
                Y();
                this.T0.setScaleX(1.0f);
                this.T0.setScaleY(1.0f);
                this.T0.setAlpha(1.0f);
                this.T0.setVisibility(0);
                if (z51Var != null) {
                    if (getVisibility() == 0) {
                        this.H3.w2();
                    }
                    z51Var.setVisibility(0);
                    b2(1);
                }
                this.t2 = false;
                cg cgVar6 = this.H3;
                boolean z20 = cgVar6 != null && cgVar6.E0();
                if (z20) {
                    e0();
                }
                je jeVar3 = this.r2;
                if (jeVar3 != null) {
                    if (z20) {
                        jeVar3.setVisibility(0);
                        this.r2.setTag(1);
                    }
                    this.r2.setAlpha(1.0f);
                    this.r2.setScaleX(1.0f);
                    this.r2.setScaleY(1.0f);
                    this.r2.setTranslationX(0.0f);
                }
            } else {
                if (this.d3 == 4) {
                    return;
                }
                AnimatorSet animatorSet8 = this.Z2;
                if (animatorSet8 != null) {
                    animatorSet8.cancel();
                    animatorSet3 = null;
                    this.Z2 = null;
                } else {
                    animatorSet3 = null;
                }
                AnimatorSet animatorSet9 = this.a3;
                if (animatorSet9 != null) {
                    animatorSet9.cancel();
                    this.a3 = animatorSet3;
                }
                if (z51Var != null && this.e3 == 0) {
                    z51Var.setVisibility(0);
                    this.a3 = new AnimatorSet();
                    ArrayList arrayList5 = new ArrayList();
                    arrayList5.add(ObjectAnimator.ofFloat(z51Var, tdVar, 1.0f));
                    arrayList5.add(ObjectAnimator.ofFloat(z51Var, (Property<org.telegram.ui.z51, Float>) property, 1.0f));
                    lh.h hVar5 = this.D6;
                    if (hVar5 != null) {
                        hVar5.e(0, false, true);
                    }
                    if (zdVar4 != null) {
                        ViewPropertyAnimator viewPropertyAnimator5 = this.Y1;
                        if (viewPropertyAnimator5 != null) {
                            viewPropertyAnimator5.cancel();
                            this.Y1 = null;
                        }
                        this.d2 = 1.0f;
                        arrayList5.add(ObjectAnimator.ofFloat(zdVar4, (Property<zd, Float>) property3, 1.0f));
                        arrayList5.add(ObjectAnimator.ofFloat(zdVar4, (Property<zd, Float>) property, 1.0f));
                        arrayList5.add(ObjectAnimator.ofFloat(zdVar4, (Property<zd, Float>) property2, 1.0f));
                    }
                    cg cgVar7 = this.H3;
                    boolean z21 = cgVar7 != null && cgVar7.E0();
                    this.t2 = false;
                    if (z21) {
                        e0();
                    }
                    je jeVar4 = this.r2;
                    if (jeVar4 != null) {
                        jeVar4.setScaleY(1.0f);
                        if (z21) {
                            this.r2.setVisibility(0);
                            this.r2.setTag(1);
                            this.r2.setPivotX(org.telegram.messenger.g0.L(44.0f));
                            arrayList5.add(ObjectAnimator.ofFloat(this.r2, (Property<je, Float>) property3, 1.0f));
                            arrayList5.add(ObjectAnimator.ofFloat(this.r2, (Property<je, Float>) property, 1.0f));
                            arrayList5.add(n(0.0f));
                        } else {
                            this.r2.setAlpha(1.0f);
                            this.r2.setScaleX(1.0f);
                            this.r2.setTranslationX(0.0f);
                        }
                    }
                    this.a3.playTogether(arrayList5);
                    this.a3.setDuration(100L);
                    this.a3.addListener(new ie(this, 4));
                    this.a3.start();
                    b2(1);
                    if (getVisibility() == 0) {
                        this.H3.w2();
                    }
                }
                Y();
                this.T0.setVisibility(0);
                this.Z2 = new AnimatorSet();
                this.d3 = 4;
                ArrayList arrayList6 = new ArrayList();
                arrayList6.add(ObjectAnimator.ofFloat(this.T0, (Property<zd, Float>) property, 1.0f));
                arrayList6.add(ObjectAnimator.ofFloat(this.T0, (Property<zd, Float>) property2, 1.0f));
                arrayList6.add(ObjectAnimator.ofFloat(this.T0, (Property<zd, Float>) property3, 1.0f));
                if (imageView4.getVisibility() == 0) {
                    arrayList6.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property2, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property3, 0.0f));
                } else if (eeVar2.getVisibility() == 0) {
                    arrayList6.add(ObjectAnimator.ofFloat(feVar, (Property<fe, Float>) property, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(feVar, (Property<fe, Float>) property2, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(feVar, (Property<fe, Float>) property3, 0.0f));
                } else if (kgVar.getVisibility() == 0) {
                    arrayList6.add(ObjectAnimator.ofFloat(kgVar, (Property<kg, Float>) property, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(kgVar, (Property<kg, Float>) property2, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(kgVar, (Property<kg, Float>) property3, 0.0f));
                } else {
                    arrayList6.add(ObjectAnimator.ofFloat(getSendButtonInternal(), (Property<View, Float>) property, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(getSendButtonInternal(), (Property<View, Float>) property2, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(getSendButtonInternal(), (Property<View, Float>) property3, 0.0f));
                }
                this.Z2.playTogether(arrayList6);
                this.Z2.setDuration(250L);
                this.Z2.addListener(new ie(this, 5));
                this.Z2.start();
            }
        } else if (kgVar.getVisibility() != 0) {
            if (!z15) {
                kgVar.setScaleX(1.0f);
                kgVar.setScaleY(1.0f);
                kgVar.setAlpha(1.0f);
                setSlowModeButtonVisible(true);
                feVar.setScaleX(0.1f);
                feVar.setScaleY(0.1f);
                feVar.setAlpha(0.0f);
                eeVar2.setVisibility(8);
                getSendButtonInternal().setScaleX(0.1f);
                getSendButtonInternal().setScaleY(0.1f);
                getSendButtonInternal().setAlpha(0.0f);
                getSendButtonInternal().setVisibility(8);
                imageView4.setScaleX(0.1f);
                imageView4.setScaleY(0.1f);
                imageView4.setAlpha(0.0f);
                imageView4.setVisibility(8);
                zd zdVar15 = this.T0;
                if (zdVar15 == null || zdVar15.getVisibility() != 0) {
                    i12 = 8;
                } else {
                    this.T0.setScaleX(0.1f);
                    this.T0.setScaleY(0.1f);
                    this.T0.setAlpha(0.0f);
                    i12 = 8;
                    this.T0.setVisibility(8);
                }
                if (z51Var != null) {
                    z51Var.setVisibility(i12);
                    if (this.H3 != null && getVisibility() == 0) {
                        this.H3.s0();
                    }
                    z13 = false;
                    b2(0);
                    lh.h hVar6 = this.D6;
                    if (hVar6 != null) {
                        hVar6.e(0, false, false);
                    }
                    if (zdVar4 != null) {
                        this.d2 = 0.0f;
                        zdVar4.setAlpha(0.0f);
                        zdVar4.setScaleX(0.5f);
                        zdVar4.setScaleY(0.5f);
                    }
                } else {
                    z13 = false;
                }
                this.t2 = z13;
                cg cgVar8 = this.H3;
                boolean z22 = cgVar8 != null && cgVar8.E0();
                if (z22) {
                    e0();
                }
                je jeVar5 = this.r2;
                if (jeVar5 != null) {
                    if (z22) {
                        jeVar5.setVisibility(0);
                        this.r2.setTag(1);
                    }
                    this.r2.setTranslationX(0.0f);
                    this.r2.setAlpha(1.0f);
                    this.r2.setScaleX(1.0f);
                    this.r2.setScaleY(1.0f);
                }
            } else {
                if (this.d3 == 5) {
                    return;
                }
                AnimatorSet animatorSet10 = this.Z2;
                if (animatorSet10 != null) {
                    animatorSet10.cancel();
                    r32 = 0;
                    this.Z2 = null;
                } else {
                    r32 = 0;
                }
                AnimatorSet animatorSet11 = this.a3;
                if (animatorSet11 != null) {
                    animatorSet11.cancel();
                    this.a3 = r32;
                }
                ViewPropertyAnimator viewPropertyAnimator6 = this.Y1;
                if (viewPropertyAnimator6 != null) {
                    viewPropertyAnimator6.cancel();
                    this.Y1 = r32;
                }
                if (z51Var != null) {
                    this.a3 = new AnimatorSet();
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(ObjectAnimator.ofFloat(z51Var, tdVar, 0.0f));
                    arrayList7.add(ObjectAnimator.ofFloat(z51Var, (Property<org.telegram.ui.z51, Float>) property, 0.5f));
                    this.t2 = false;
                    cg cgVar9 = this.H3;
                    boolean z23 = cgVar9 != null && cgVar9.E0();
                    if (z23) {
                        e0();
                    }
                    lh.h hVar7 = this.D6;
                    if (hVar7 != null) {
                        hVar7.e(0, false, true);
                    }
                    if (zdVar4 != null) {
                        this.d2 = 0.0f;
                        arrayList7.add(ObjectAnimator.ofFloat(zdVar4, (Property<zd, Float>) property3, 0.0f));
                        arrayList7.add(ObjectAnimator.ofFloat(zdVar4, (Property<zd, Float>) property, 0.5f));
                        arrayList7.add(ObjectAnimator.ofFloat(zdVar4, (Property<zd, Float>) property2, 0.5f));
                    }
                    je jeVar6 = this.r2;
                    if (jeVar6 != null) {
                        jeVar6.setScaleY(1.0f);
                        if (z23) {
                            this.r2.setVisibility(0);
                            this.r2.setTag(1);
                            this.r2.setPivotX(org.telegram.messenger.g0.L(44.0f));
                            arrayList7.add(n(0.0f));
                            arrayList7.add(ObjectAnimator.ofFloat(this.r2, (Property<je, Float>) property3, 1.0f));
                            arrayList7.add(ObjectAnimator.ofFloat(this.r2, (Property<je, Float>) property, 1.0f));
                        } else {
                            this.r2.setTranslationX(0.0f);
                            this.r2.setAlpha(1.0f);
                            this.r2.setScaleX(1.0f);
                        }
                    }
                    this.a3.playTogether(arrayList7);
                    this.a3.setDuration(100L);
                    this.a3.addListener(new ie(this, 2));
                    this.a3.start();
                    b2(0);
                    if (this.H3 != null && getVisibility() == 0) {
                        this.H3.s0();
                    }
                }
                this.d3 = 5;
                this.Z2 = new AnimatorSet();
                ArrayList arrayList8 = new ArrayList();
                if (eeVar2.getVisibility() == 0) {
                    i13 = 1;
                    r43 = 0;
                    arrayList8.add(ObjectAnimator.ofFloat(feVar, (Property<fe, Float>) property, 0.1f));
                    arrayList8.add(ObjectAnimator.ofFloat(feVar, (Property<fe, Float>) property2, 0.1f));
                    arrayList8.add(ObjectAnimator.ofFloat(feVar, (Property<fe, Float>) property3, 0.0f));
                } else {
                    r43 = 0;
                    i13 = 1;
                }
                zd zdVar16 = this.T0;
                if (zdVar16 != null && zdVar16.getVisibility() == 0) {
                    zd zdVar17 = this.T0;
                    float[] fArr28 = new float[i13];
                    fArr28[r43] = 0.1f;
                    arrayList8.add(ObjectAnimator.ofFloat(zdVar17, (Property<zd, Float>) property, fArr28));
                    zd zdVar18 = this.T0;
                    float[] fArr29 = new float[i13];
                    fArr29[r43] = 0.1f;
                    arrayList8.add(ObjectAnimator.ofFloat(zdVar18, (Property<zd, Float>) property2, fArr29));
                    zd zdVar19 = this.T0;
                    float[] fArr30 = new float[i13];
                    fArr30[r43] = 0.0f;
                    arrayList8.add(ObjectAnimator.ofFloat(zdVar19, (Property<zd, Float>) property3, fArr30));
                }
                if (getSendButtonInternal().getVisibility() == 0) {
                    arrayList8.add(o(r43));
                }
                if (imageView4.getVisibility() == 0) {
                    float[] fArr31 = new float[1];
                    fArr31[r43] = 0.1f;
                    arrayList8.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property, fArr31));
                    float[] fArr32 = new float[1];
                    fArr32[r43] = 0.1f;
                    arrayList8.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property2, fArr32));
                    float[] fArr33 = new float[1];
                    fArr33[r43] = 0.0f;
                    arrayList8.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property3, fArr33));
                }
                float[] fArr34 = new float[1];
                fArr34[r43] = 1.0f;
                arrayList8.add(ObjectAnimator.ofFloat(kgVar, (Property<kg, Float>) property, fArr34));
                float[] fArr35 = new float[1];
                fArr35[r43] = 1.0f;
                arrayList8.add(ObjectAnimator.ofFloat(kgVar, (Property<kg, Float>) property2, fArr35));
                float[] fArr36 = new float[1];
                fArr36[r43] = 1.0f;
                arrayList8.add(ObjectAnimator.ofFloat(kgVar, (Property<kg, Float>) property3, fArr36));
                setSlowModeButtonVisible(true);
                this.Z2.playTogether(arrayList8);
                this.Z2.setDuration(220L);
                this.Z2.setInterpolator(er.h);
                this.Z2.addListener(new ie(this, 3));
                this.Z2.start();
            }
        }
        heVar = heVar2;
        z12 = false;
        if (this.S5) {
        }
    }

    public final boolean N0() {
        View view = this.o2;
        return view != null && view.getVisibility() == 0;
    }

    public final void N1(boolean z10) {
        boolean z11;
        org.telegram.ui.an anVar;
        ai.n0 n0Var = this.j1;
        int i7 = 1;
        boolean z12 = (n0Var == null || n0Var.r == 0) ? false : true;
        if (z12 || (!(this.l2 || z10) || (anVar = this.x3) == null || anVar.z() || this.H2 != null)) {
            z11 = false;
        } else {
            org.telegram.messenger.np.s1(this.R);
            boolean z13 = org.telegram.messenger.r2.a;
            z11 = true;
        }
        if (this.d6 == z11) {
            return;
        }
        this.d6 = z11;
        ImageView imageView = this.c2;
        imageView.setVisibility(0);
        imageView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : z12 ? 0.85f : 0.6f).scaleY(z11 ? 1.0f : z12 ? 0.85f : 0.6f).setInterpolator(er.h).setDuration((z12 || this.e6) ? 150L : 420L).withEndAction(new fd(this, z11, i7)).start();
    }

    public final void O() {
        if (this.V0 == null) {
            return;
        }
        Point point = org.telegram.messenger.g0.q;
        int i7 = point.x > point.y ? this.g3 : this.f3;
        int L = ((((this.W1 - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.n) - org.telegram.messenger.g0.L(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getHeight();
        int i10 = 2;
        if (this.z2 == 2) {
            L = Math.min(L, org.telegram.messenger.g0.L(175.0f) + i7);
        }
        int i11 = this.V0.getLayoutParams().height;
        if (i11 == L) {
            return;
        }
        AnimatorSet animatorSet = this.j4;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.j4 = null;
        }
        this.l4 = L;
        org.telegram.ui.Cells.g1 g1Var = this.b4;
        if (i11 > L) {
            uc ucVar = new uc(this, 10);
            this.V0.setLayerType(2, null);
            if (this.w) {
                this.x = ucVar;
            } else {
                AnimatorSet animatorSet2 = new AnimatorSet();
                if (this.C6 != null) {
                    animatorSet2.playTogether(ValueAnimator.ofInt(-(this.l4 - i7)), ValueAnimator.ofInt(-(this.l4 - i7)));
                } else {
                    animatorSet2.playTogether(ObjectAnimator.ofInt(this, g1Var, -(this.l4 - i7)), ObjectAnimator.ofInt(this.V0, g1Var, -(this.l4 - i7)));
                    ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new gd(this, i10));
                }
                animatorSet2.setDuration(300L);
                animatorSet2.setInterpolator(er.f);
                animatorSet2.addListener(new ah.l(24, this, ucVar));
                this.j4 = animatorSet2;
                animatorSet2.start();
            }
        } else {
            if (this.C6 == null) {
                this.V0.getLayoutParams().height = this.l4;
            }
            this.U1.requestLayout();
            xe xeVar = this.F0;
            if (xeVar != null) {
                int selectionStart = xeVar.getSelectionStart();
                int selectionEnd = this.F0.getSelectionEnd();
                xe xeVar2 = this.F0;
                xeVar2.setText(xeVar2.getText());
                this.F0.setSelection(selectionStart, selectionEnd);
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            if (this.C6 != null) {
                animatorSet3.playTogether(ValueAnimator.ofInt(-(this.l4 - i7)), ValueAnimator.ofInt(-(this.l4 - i7)));
            } else {
                animatorSet3.playTogether(ObjectAnimator.ofInt(this, g1Var, -(this.l4 - i7)), ObjectAnimator.ofInt(this.V0, g1Var, -(this.l4 - i7)));
                ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new gd(this, 3));
            }
            animatorSet3.setDuration(300L);
            animatorSet3.setInterpolator(er.f);
            animatorSet3.addListener(new ie(this, 11));
            this.j4 = animatorSet3;
            this.V0.setLayerType(2, null);
            animatorSet3.start();
        }
        rh.e eVar = this.C6;
        if (eVar != null) {
            ((rh.h) eVar).h(L);
        }
    }

    public final float O0(FrameLayout frameLayout) {
        float measuredHeight = getMeasuredHeight() - this.E6.f;
        float f10 = 0.0f;
        View view = frameLayout;
        while (view != null && view != this) {
            f10 += view.getTranslationY() + view.getTop();
            view = view.getParent() instanceof View ? (View) view.getParent() : null;
        }
        return view == null ? frameLayout.getHeight() - org.telegram.messenger.g0.L(44.0f) : measuredHeight - f10;
    }

    public final boolean O1() {
        ImageView imageView;
        if (this.O != null || (imageView = this.e2) == null || imageView.getVisibility() != 0 || org.telegram.messenger.np.e1().getInt("channelsuggesthint2", 0) >= 2) {
            return false;
        }
        hi.l3 l3Var = new hi.l3(getContext(), 3);
        this.O = l3Var;
        l3Var.s(13.0f);
        setHintGlass(this.O);
        this.O.r(true);
        this.O.u(org.telegram.messenger.hd.a0(null, null, 2131744422, qg.c.h(this.R, this.y3)));
        this.O.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        this.O.p(1.0f, -((getWidth() - org.telegram.messenger.g0.L(12.0f)) - ((this.e2.getMeasuredWidth() / 2.0f) + (this.e2.getX() + (this.X1.getX() + this.g2.getX())))));
        addView(this.O, c8.ja.d(-1, 200.0f, 48, 0.0f, -192.0f, 0.0f, 0.0f));
        hi.l3 l3Var2 = this.O;
        l3Var2.r0 = new uc(this, 16);
        l3Var2.d = 8000L;
        l3Var2.w();
        org.telegram.messenger.np.e1().edit().putInt("channelsuggesthint2", org.telegram.messenger.np.e1().getInt("channelsuggesthint2", 0) + 1).apply();
        return true;
    }

    public final void P() {
        this.J6 = B(true);
        float B = B(false);
        if (this.I6 != B) {
            this.I6 = B;
            P0(B);
        }
    }

    public final void P1() {
        Q1(true, false);
    }

    public final void Q() {
        float f10 = this.F6.e;
        if (this.o2 != null) {
            float measuredHeight = getMeasuredHeight() - this.E6.f;
            this.o2.setTranslationY(measuredHeight - (r4.getMeasuredHeight() * f10));
            this.o2.setVisibility(f10 > 0.0f ? 0 : 8);
        }
        boolean z10 = f10 > 0.0f;
        if (this.h6 == z10) {
            return;
        }
        ud udVar = this.h2;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) udVar.getLayoutParams();
        int i7 = z10 ? this.o2.getLayoutParams().height : 0;
        layoutParams.topMargin = i7;
        layoutParams.topMargin = org.telegram.messenger.g0.L(9.0f) + i7;
        udVar.setLayoutParams(layoutParams);
        this.h6 = z10;
        setMinimumHeight(org.telegram.messenger.g0.L(44.0f) + (z10 ? this.o2.getLayoutParams().height : 0));
        if (this.h4) {
            if (this.z2 == 0) {
                E1(false, true, false, true);
            } else {
                O();
            }
        }
    }

    public final void Q0() {
        ji.m mVar = this.k1;
        if (mVar != null) {
            mVar.g("destroy", true);
            ji.p pVar = mVar.h;
            if (pVar != null) {
                org.telegram.messenger.g0.E2(pVar);
                mVar.h = null;
            }
            ji.e eVar = mVar.K;
            if (eVar != null) {
                org.telegram.messenger.g0.E2(eVar);
                mVar.K = null;
            }
            this.k1 = null;
        }
        ai.n0 n0Var = this.j1;
        if (n0Var != null) {
            DictationAsr.N(n0Var.m0);
            n0Var.i();
            ai.h2 h2Var = n0Var.F;
            if (h2Var != null) {
                h2Var.a();
            }
            jh.f fVar = n0Var.a0;
            if (fVar != null) {
                fVar.f = null;
            }
            org.telegram.messenger.g0.E2(n0Var.s);
            org.telegram.messenger.g0.E2(n0Var.w);
            this.j1 = null;
        }
        oi0 oi0Var = this.i1;
        if (oi0Var != null) {
            oi0Var.T = true;
            u51 u51Var = oi0Var.n;
            if (u51Var != null) {
                u51Var.u0(false);
                oi0Var.n.m0();
                oi0Var.n = null;
            }
        }
        if (this.i1 != null && this.J3 != null) {
            org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(this.R);
            long j3 = this.y3;
            org.telegram.ui.an anVar = this.x3;
            long b10 = (anVar == null || !anVar.w4) ? 0L : anVar.b();
            oi0 oi0Var2 = this.i1;
            float audioLeft = oi0Var2 == null ? 0.0f : oi0Var2.getAudioLeft();
            oi0 oi0Var3 = this.i1;
            b02.b2(j3, b10, audioLeft, oi0Var3 == null ? 1.0f : oi0Var3.getAudioRight());
        }
        this.G2 = true;
        org.telegram.messenger.ns.f(this.R).n(this, org.telegram.messenger.ns.l2);
        org.telegram.messenger.ns.f(this.R).n(this, org.telegram.messenger.ns.o2);
        org.telegram.messenger.ns.f(this.R).n(this, org.telegram.messenger.ns.p2);
        org.telegram.messenger.ns.f(this.R).n(this, org.telegram.messenger.ns.m2);
        org.telegram.messenger.ns.f(this.R).n(this, org.telegram.messenger.ns.n2);
        org.telegram.messenger.ns.f(this.R).n(this, org.telegram.messenger.ns.k2);
        org.telegram.messenger.ns.f(this.R).n(this, org.telegram.messenger.ns.t);
        org.telegram.messenger.ns.f(this.R).n(this, org.telegram.messenger.ns.s2);
        org.telegram.messenger.ns.f(this.R).n(this, org.telegram.messenger.ns.u2);
        org.telegram.messenger.ns.f(this.R).n(this, org.telegram.messenger.ns.e2);
        org.telegram.messenger.ns.f(this.R).n(this, org.telegram.messenger.ns.z0);
        org.telegram.messenger.ns.f(this.R).n(this, org.telegram.messenger.ns.L);
        org.telegram.messenger.ns.f(this.R).n(this, org.telegram.messenger.ns.n1);
        org.telegram.messenger.ns.f(this.R).n(this, org.telegram.messenger.ns.t2);
        org.telegram.messenger.ns.f(this.R).n(this, org.telegram.messenger.ns.R2);
        org.telegram.messenger.ns.f(this.R).n(this, org.telegram.messenger.ns.Y2);
        org.telegram.messenger.ns.f(this.R).n(this, org.telegram.messenger.ns.f5);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.i4);
        sf sfVar = this.V0;
        if (sfVar != null) {
            sfVar.B();
        }
        uc ucVar = this.I0;
        if (ucVar != null) {
            org.telegram.messenger.g0.r(ucVar);
            this.I0 = null;
        }
        PowerManager.WakeLock wakeLock = this.Y2;
        if (wakeLock != null) {
            try {
                wakeLock.release();
                this.Y2 = null;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        if (this.e3 != 0 && !this.d1) {
            org.telegram.messenger.g0.h3(new dg(this.w3, 19));
        }
        st0 st0Var = this.U1;
        if (st0Var != null) {
            st0Var.setDelegate(null);
        }
        oe oeVar = this.r0;
        if (oeVar != null) {
            oeVar.e = false;
            oeVar.dismiss();
        }
    }

    public final void Q1(boolean z10, boolean z11) {
        if (this.o2 == null || this.N3 || getVisibility() != 0) {
            ud udVar = this.f1;
            if ((udVar == null || udVar.getVisibility() != 0) && !this.p3 && this.D3 == null && this.B3 == null) {
                W0();
                return;
            }
            return;
        }
        ud udVar2 = this.f1;
        boolean z12 = (udVar2 == null || udVar2.getVisibility() != 0) && !this.p3 && this.D3 == null && (this.V2 == null || this.H2 != null);
        if (!z11 && z10 && z12 && !this.h3 && !G0()) {
            W0();
            nd ndVar = this.W;
            if (ndVar != null) {
                org.telegram.messenger.g0.r(ndVar);
            }
            nd ndVar2 = new nd(this, 0);
            this.W = ndVar2;
            org.telegram.messenger.g0.i3(ndVar2, 200L);
            return;
        }
        this.O3 = true;
        this.N3 = true;
        if (this.P3) {
            this.F6.a(true, z10);
            if (z12) {
                xe xeVar = this.F0;
                if (xeVar != null) {
                    xeVar.requestFocus();
                }
                W0();
            }
        }
    }

    public final void R() {
        org.telegram.ui.an anVar = this.x3;
        if (anVar != null) {
            org.telegram.messenger.si.b0(this.R).Q1(anVar.a(), anVar.Q7(anVar.E5), "", null, null, null, null, 0L, false, true, null);
        }
        setRichDraftPreview(null);
    }

    public final void R1() {
        AnimatorSet animatorSet = new AnimatorSet();
        try {
            performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "lockAnimatedTranslation", this.S4);
        ofFloat.setStartDelay(100L);
        ofFloat.setDuration(350L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "snapAnimationProgress", 1.0f);
        ofFloat2.setInterpolator(er.h);
        ofFloat2.setDuration(250L);
        int i7 = org.telegram.messenger.gz.a;
        SharedPreferences.Editor edit = org.telegram.messenger.np.e1().edit();
        edit.putInt("lockRecordAudioVideoHint", 3);
        edit.apply();
        animatorSet.playTogether(ofFloat2, ofFloat, ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f).setDuration(200L), ObjectAnimator.ofFloat(this.S1, "cancelToProgress", 1.0f));
        animatorSet.start();
        q2();
    }

    public final void S() {
        org.telegram.messenger.g0.v1(this.F0);
    }

    public final void S0() {
        this.R2 = true;
        ji.m mVar = this.k1;
        if (mVar != null) {
            mVar.g("chat paused", true);
        }
        oe oeVar = this.r0;
        if (oeVar != null) {
            oeVar.e = false;
            oeVar.dismiss();
        }
        if (this.h3) {
            this.T2 = true;
        }
        uc ucVar = new uc(this, 11);
        this.i6 = ucVar;
        org.telegram.messenger.g0.i3(ucVar, 500L);
    }

    public final boolean S1() {
        org.telegram.ui.an anVar = this.x3;
        TLRPC.EncryptedChat encryptedChat = anVar != null ? anVar.h : null;
        return encryptedChat == null || org.telegram.messenger.g0.X0(encryptedChat.layer) >= 101;
    }

    public final void T() {
        if (this.f2 != null) {
            return;
        }
        zd zdVar = new zd(this, getContext(), 2);
        this.f2 = zdVar;
        ck0 ck0Var = new ck0(getContext());
        this.C2 = ck0Var;
        zdVar.setImageDrawable(ck0Var);
        ck0 ck0Var2 = this.C2;
        int i7 = org.telegram.ui.ActionBar.j6.Nl;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.e6 e6Var = this.E4;
        org.telegram.ui.ActionBar.q6.x(this, ck0Var2, i7, e6Var, mode);
        this.C2.a(R.drawable.input_bot2, false);
        this.f2.setScaleType(ImageView.ScaleType.CENTER);
        zd zdVar2 = this.f2;
        int i10 = org.telegram.ui.ActionBar.j6.i6;
        org.telegram.ui.ActionBar.q6.Q(zdVar2, org.telegram.ui.ActionBar.j6.h0(u0(i10), 1, -1), null, org.telegram.ui.ActionBar.q6.M(i10), e6Var);
        this.f2.setVisibility(8);
        org.telegram.messenger.g0.Y3(this.f2, false, 0.1f, true, false);
        this.X1.addView(this.f2, 0, c8.ja.o(44, 44));
        this.f2.setOnClickListener(new xc(this, 17));
    }

    public final void T0() {
        xe xeVar;
        this.R2 = false;
        if (c8.z0.c()) {
            long[] jArr = {150, 500, 1200};
            for (int i7 = 0; i7 < 3; i7++) {
                org.telegram.messenger.g0.i3(new uc(this, 17), jArr[i7]);
            }
        }
        uc ucVar = this.i6;
        if (ucVar != null) {
            org.telegram.messenger.g0.r(ucVar);
            this.i6 = null;
        }
        if (v0() && y()) {
            return;
        }
        getVisibility();
        if (!this.T2 || org.telegram.ui.ActionBar.e2.hasSheets(this.x3)) {
            return;
        }
        this.T2 = false;
        cg cgVar = this.H3;
        if (cgVar != null) {
            cgVar.o1();
        }
        if (this.z2 == 0 && (xeVar = this.F0) != null) {
            xeVar.requestFocus();
        }
        org.telegram.messenger.g0.J3(this.F0);
        if (org.telegram.messenger.g0.D || this.h3 || org.telegram.messenger.g0.E) {
            return;
        }
        this.S3 = true;
        ke keVar = this.Z3;
        org.telegram.messenger.g0.r(keVar);
        org.telegram.messenger.g0.i3(keVar, 100L);
    }

    public final void T1() {
        float f10;
        zd zdVar = this.Z1;
        if (zdVar == null) {
            return;
        }
        float f11 = this.E + this.y;
        he heVar = this.K0;
        if (heVar != null) {
            f10 = heVar.getAlpha() * (-i5.c.d(56.0f, heVar.l(), 0));
        } else {
            f10 = 0.0f;
        }
        zdVar.setTranslationX(f11 + f10);
    }

    public final void U() {
        if (this.m0 != null) {
            return;
        }
        ki.a0 a0Var = new ki.a0(getContext());
        this.m0 = a0Var;
        a0Var.setOnClickListener(new xc(this, 9));
        this.g2.addView(this.m0, c8.ja.d(-2, 32.0f, 83, 8.0f, 6.0f, 8.0f, 6.0f));
        org.telegram.messenger.g0.Y3(this.m0, false, 1.0f, true, false);
        ki.a0 a0Var2 = this.m0;
        if (!a0Var2.f) {
            a0Var2.f = true;
            a0Var2.h = 1.0f;
            a0Var2.requestLayout();
            a0Var2.invalidate();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:(1:241)(1:165)|166|(8:168|(1:196)(1:172)|(1:195)(1:178)|179|(4:181|(1:183)(1:189)|184|(1:188))|(1:191)|192|(1:194))|197|(3:199|(1:201)(1:203)|202)|204|(3:(1:207)|(2:211|(1:221))|222)|223|(4:225|(1:239)(1:229)|230|(5:232|233|234|235|236))|240|233|234|235|236) */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0347  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean U0(View view) {
        org.telegram.ui.an anVar;
        int measuredHeight;
        TLRPC.User j3;
        xe xeVar;
        org.telegram.messenger.kj kjVar;
        org.telegram.messenger.ij ijVar;
        ArrayList arrayList;
        w40 w40Var;
        boolean z10;
        org.telegram.messenger.kj kjVar2;
        int i7;
        boolean z11;
        boolean z12;
        boolean z13;
        xe xeVar2;
        int i10 = 0;
        if (c() || (((anVar = this.x3) != null && anVar.g4 == 5) || this.H6.f)) {
            return false;
        }
        boolean z14 = this.S5;
        he heVar = this.K0;
        int i11 = 16;
        org.telegram.ui.ActionBar.e6 e6Var = this.E4;
        int i12 = 2;
        int i13 = 1;
        if (z14 || !(((xeVar = this.F0) != null && !TextUtils.isEmpty(xeVar.getText())) || anVar == null || (kjVar = anVar.w5) == null || (ijVar = kjVar.b) == null || (arrayList = ijVar.e) == null || arrayList.isEmpty())) {
            boolean z15 = anVar != null && org.telegram.messenger.q10.B(anVar.j());
            if (this.P0 == null) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(this.w3, e6Var);
                this.P0 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
                this.P0.setOnTouchListener(new se(this));
                this.P0.setDispatchKeyEventListener(new hd(this));
                this.P0.setShownFromBottom(false);
                boolean z16 = anVar != null && anVar.S6();
                boolean z17 = !z15 && (this.H0 <= 0 || c());
                if (z16) {
                    boolean z18 = !z17;
                    org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, getContext(), this.E4, true, z18);
                    this.Y5 = z0Var;
                    if (z15) {
                        z0Var.j(org.telegram.messenger.hd.M0(2131745514, null), R.drawable.msg_calendar2, null);
                    } else {
                        z0Var.j(org.telegram.messenger.hd.M0(2131745859, null), R.drawable.msg_calendar2, null);
                    }
                    this.Y5.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                    this.Y5.setOnClickListener(new xc(this, 14));
                    this.P0.a(this.Y5, c8.ja.o(-1, 44));
                    int i14 = org.telegram.messenger.gz.a;
                    SharedPreferences.Editor edit = org.telegram.messenger.np.e1().edit();
                    edit.putInt("scheduledHintShows", 3);
                    edit.apply();
                    if (!z15 && this.y3 > 0) {
                        org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(0, getContext(), this.E4, true, z18);
                        this.c = z0Var2;
                        z0Var2.j(org.telegram.messenger.hd.M0(2131745586, null), R.drawable.msg_online, null);
                        this.c.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                        this.c.setOnClickListener(new xc(this, 15));
                        this.P0.a(this.c, c8.ja.o(-1, 44));
                    }
                }
                if (z17) {
                    org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(0, getContext(), this.E4, !z16, true);
                    z0Var3.j(org.telegram.messenger.hd.M0(2131745583, null), R.drawable.input_notify_off, null);
                    z0Var3.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                    z0Var3.setOnClickListener(new xc(this, i11));
                    this.P0.a(z0Var3, c8.ja.o(-1, 44));
                }
                te teVar = new te(this, this.P0);
                this.O0 = teVar;
                teVar.b = false;
                teVar.setAnimationStyle(R.style.PopupContextAnimation2);
                this.O0.setOutsideTouchable(true);
                this.O0.setClippingEnabled(true);
                this.O0.setInputMethodMode(2);
                this.O0.setSoftInputMode(0);
                this.O0.getContentView().setFocusableInTouchMode(true);
                int i15 = org.telegram.messenger.gz.a;
                SharedPreferences.Editor edit2 = org.telegram.messenger.np.e1().edit();
                edit2.putInt("scheduledOrNoSoundHintShows", 3);
                edit2.apply();
                cg cgVar = this.H3;
                if (cgVar != null) {
                    cgVar.r2();
                }
            }
            org.telegram.ui.ActionBar.z0 z0Var4 = this.Y5;
            if (z0Var4 != null) {
                z0Var4.setVisibility(this.P ? 8 : 0);
            }
            if (this.c != null) {
                j3 = anVar != null ? anVar.j() : null;
                if (j3 != null && !j3.bot) {
                    TLRPC.UserStatus userStatus = j3.status;
                    if (!(userStatus instanceof TLRPC.TL_userStatusEmpty) && !(userStatus instanceof TLRPC.TL_userStatusOnline) && !(userStatus instanceof TLRPC.TL_userStatusRecently) && !(userStatus instanceof TLRPC.TL_userStatusLastMonth) && !(userStatus instanceof TLRPC.TL_userStatusLastWeek)) {
                        this.c.setVisibility(0);
                    }
                }
                this.c.setVisibility(8);
            }
            this.P0.setupRadialSelectors(u0(org.telegram.ui.ActionBar.j6.I5));
            this.P0.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
            this.O0.setFocusable(true);
            int[] iArr = this.v3;
            view.getLocationInWindow(iArr);
            if (this.h3) {
                int measuredHeight2 = getMeasuredHeight();
                View view2 = this.o2;
                if (measuredHeight2 > org.telegram.messenger.g0.L((view2 == null || view2.getVisibility() != 0) ? 58.0f : 102.0f)) {
                    measuredHeight = view.getMeasuredHeight() + iArr[1];
                    this.O0.showAtLocation(view, 51, org.telegram.messenger.g0.L(8.0f) + ((view.getMeasuredWidth() + iArr[0]) - this.P0.getMeasuredWidth()), measuredHeight);
                    this.O0.b();
                    heVar.invalidate();
                    view.performHapticFeedback(3, 2);
                    return true;
                }
            }
            measuredHeight = (iArr[1] - this.P0.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f);
            this.O0.showAtLocation(view, 51, org.telegram.messenger.g0.L(8.0f) + ((view.getMeasuredWidth() + iArr[0]) - this.P0.getMeasuredWidth()), measuredHeight);
            this.O0.b();
            heVar.invalidate();
            view.performHapticFeedback(3, 2);
            return true;
        }
        org.telegram.ui.bg0 bg0Var = this.M0;
        if (bg0Var != null) {
            bg0Var.h(false);
        }
        org.telegram.messenger.g0.r(this.X5);
        ue ueVar = new ue(this, getContext(), e6Var, i10);
        this.M0 = ueVar;
        ueVar.setOnDismissListener(new wc(this, i13));
        boolean z19 = (this.L3 == null && ((xeVar2 = this.F0) == null || TextUtils.isEmpty(xeVar2.getText()))) ? false : true;
        ArrayList arrayList2 = new ArrayList();
        try {
            if (this.m2 != null) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.id = 0;
                tL_message.out = true;
                tL_message.peer_id = org.telegram.messenger.np.s1(this.R).z1(this.y3);
                tL_message.from_id = org.telegram.messenger.np.s1(this.R).z1(org.telegram.messenger.m10.i(this.R).e());
                tL_message.rich_message = this.m2;
                org.telegram.messenger.gj gjVar = new org.telegram.messenger.gj(this.R, tL_message, false, true);
                org.telegram.messenger.gj gjVar2 = this.B3;
                if (gjVar2 != null && !gjVar2.p) {
                    gjVar.C = gjVar2;
                }
                gjVar.W2 = Boolean.TRUE;
                gjVar.n0(null);
                gjVar.w1 = true;
                gjVar.B0 = true;
                arrayList2.add(gjVar);
            } else if (this.J3 != null) {
                TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                tL_message2.id = 0;
                tL_message2.out = true;
                tL_message2.peer_id = org.telegram.messenger.np.s1(this.R).z1(this.y3);
                tL_message2.from_id = org.telegram.messenger.np.s1(this.R).z1(org.telegram.messenger.m10.i(this.R).e());
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message2.media = tL_messageMediaDocument;
                tL_messageMediaDocument.voice = true;
                tL_messageMediaDocument.document = this.J3;
                tL_message2.send_state = 1;
                tL_message2.attachPath = this.K3;
                org.telegram.messenger.gj gjVar3 = new org.telegram.messenger.gj(this.R, tL_message2, false, true);
                org.telegram.messenger.gj gjVar4 = this.B3;
                if (gjVar4 != null && !gjVar4.p) {
                    gjVar3.C = gjVar4;
                }
                gjVar3.W2 = Boolean.TRUE;
                gjVar3.n0(null);
                gjVar3.w1 = true;
                gjVar3.B0 = true;
                arrayList2.add(gjVar3);
            } else if (z19) {
                TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
                tL_message3.id = 0;
                tL_message3.out = true;
                tL_message3.peer_id = org.telegram.messenger.np.s1(this.R).z1(this.y3);
                tL_message3.from_id = org.telegram.messenger.np.s1(this.R).z1(org.telegram.messenger.m10.i(this.R).e());
                xe xeVar3 = this.F0;
                CharSequence[] charSequenceArr = {new SpannableStringBuilder(xeVar3 == null ? "" : xeVar3.getTextToUse())};
                org.telegram.messenger.gj.d(charSequenceArr[0], true);
                tL_message3.entities.addAll(org.telegram.messenger.si.b0(this.R).W(charSequenceArr, true, true));
                tL_message3.message = charSequenceArr[0].toString();
                org.telegram.messenger.gj gjVar5 = this.B3;
                if (gjVar5 != null && !gjVar5.p) {
                    TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                    org.telegram.messenger.gj gjVar6 = this.C3;
                    if (gjVar6 != null) {
                        tL_messageReplyHeader.flags |= 2;
                        tL_messageReplyHeader.reply_to_top_id = gjVar6.e1();
                    }
                    tL_messageReplyHeader.flags |= 16;
                    tL_messageReplyHeader.reply_to_msg_id = this.B3.e1();
                    tL_message3.reply_to = tL_messageReplyHeader;
                }
                if (this.F3 != null) {
                    TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                    tL_messageMediaWebPage.webpage = this.F3;
                    if (anVar != null && (kjVar2 = anVar.w5) != null && kjVar2.o) {
                        boolean z20 = kjVar2.q;
                        tL_messageMediaWebPage.force_small_media = z20;
                        tL_messageMediaWebPage.force_large_media = !z20;
                        tL_message3.invert_media = kjVar2.r;
                    }
                    tL_message3.media = tL_messageMediaWebPage;
                }
                org.telegram.messenger.gj gjVar7 = new org.telegram.messenger.gj(this.R, tL_message3, false, false);
                org.telegram.messenger.gj gjVar8 = this.B3;
                if (gjVar8 != null && !gjVar8.p) {
                    gjVar7.C = gjVar8;
                }
                gjVar7.B0 = true;
                gjVar7.W2 = Boolean.TRUE;
                gjVar7.D = 0;
                gjVar7.n0(null);
                gjVar7.w1 = true;
                arrayList2.add(gjVar7);
            } else if (anVar != null && (w40Var = anVar.q3) != null && w40Var.getTextureView() != null) {
                org.telegram.ui.bg0 bg0Var2 = this.M0;
                TextureView textureView = anVar.q3.getTextureView();
                bg0Var2.getClass();
                if (textureView != null) {
                    bg0Var2.l0 = new RectF();
                    int[] iArr2 = new int[2];
                    textureView.getLocationOnScreen(iArr2);
                    bg0Var2.l0.set(iArr2[0], iArr2[1], textureView.getWidth() + r9, textureView.getHeight() + iArr2[1]);
                }
                z10 = true;
                this.M0.r(arrayList2);
                i7 = 4;
                if (z19 && this.J3 == null) {
                    org.telegram.ui.bg0 bg0Var3 = this.M0;
                    xe xeVar4 = this.F0;
                    d dVar = new d(this, i7);
                    kd kdVar = new kd(this, i12);
                    bg0Var3.S = xeVar4;
                    bg0Var3.U = dVar;
                    bg0Var3.V = kdVar;
                }
                this.M0.s(heVar, true, new fi.x1(i7, this, z19));
                if ((!z19 || z10) && this.y3 >= 0) {
                    this.M0.c(anVar);
                    this.M0.p(this.n6);
                }
                m60 F = m60.F(this, e6Var, heVar);
                z11 = anVar == null && org.telegram.messenger.q10.B(anVar.j());
                z12 = anVar == null && anVar.S6();
                if (!z11 || (this.H0 > 0 && !c())) {
                    i13 = 0;
                }
                if (z12) {
                    F.c(R.drawable.msg_calendar2, org.telegram.messenger.hd.M0(z11 ? 2131745514 : 2131745859, null), new uc(this, 24), false);
                    if (!z11 && this.y3 > 0) {
                        F.c(R.drawable.msg_online, org.telegram.messenger.hd.M0(2131745586, null), new uc(this, 25), false);
                        this.c = F.y();
                    }
                }
                if (anVar == null && this.H3 != null && org.telegram.messenger.t3.p0(anVar.e)) {
                    z13 = false;
                    F.c(R.drawable.input_suggest_paid_24, org.telegram.messenger.hd.M0(2131747069, null), new uc(this, 23), false);
                } else {
                    z13 = false;
                }
                if (i13 != 0) {
                    F.c(R.drawable.input_notify_off, org.telegram.messenger.hd.M0(2131745583, null), new fd(this, z19, i12), z13);
                }
                F.Y();
                if (this.c != null) {
                    j3 = anVar != null ? anVar.j() : null;
                    if (j3 != null && !j3.bot) {
                        TLRPC.UserStatus userStatus2 = j3.status;
                        if (!(userStatus2 instanceof TLRPC.TL_userStatusEmpty) && !(userStatus2 instanceof TLRPC.TL_userStatusOnline) && !(userStatus2 instanceof TLRPC.TL_userStatusRecently) && !(userStatus2 instanceof TLRPC.TL_userStatusLastMonth) && !(userStatus2 instanceof TLRPC.TL_userStatusLastWeek)) {
                            this.c.setVisibility(0);
                        }
                    }
                    this.c.setVisibility(8);
                }
                this.M0.q(F);
                this.M0.show();
                view.performHapticFeedback(3, 2);
                return false;
            }
            view.performHapticFeedback(3, 2);
            return false;
        } catch (Exception unused) {
            return false;
        }
        z10 = false;
        this.M0.r(arrayList2);
        i7 = 4;
        if (z19) {
            org.telegram.ui.bg0 bg0Var32 = this.M0;
            xe xeVar42 = this.F0;
            d dVar2 = new d(this, i7);
            kd kdVar2 = new kd(this, i12);
            bg0Var32.S = xeVar42;
            bg0Var32.U = dVar2;
            bg0Var32.V = kdVar2;
        }
        this.M0.s(heVar, true, new fi.x1(i7, this, z19));
        if (!z19) {
        }
        this.M0.c(anVar);
        this.M0.p(this.n6);
        m60 F2 = m60.F(this, e6Var, heVar);
        if (anVar == null) {
        }
        if (anVar == null) {
        }
        if (!z11) {
        }
        i13 = 0;
        if (z12) {
        }
        if (anVar == null) {
        }
        z13 = false;
        if (i13 != 0) {
        }
        F2.Y();
        if (this.c != null) {
        }
        this.M0.q(F2);
        this.M0.show();
    }

    public final void U1() {
        T1();
        org.telegram.ui.z51 z51Var = this.X1;
        if (z51Var != null) {
            z51Var.setTranslationX(this.E + this.y);
            z51Var.setAlpha(this.F * this.G);
            z51Var.setVisibility(z51Var.getAlpha() > 0.0f ? 0 : 8);
            zd zdVar = this.Z1;
            if (zdVar != null && this.S5) {
                zdVar.setAlpha(this.d2 * this.G);
            }
        }
        je jeVar = this.r2;
        if (jeVar != null) {
            jeVar.setTranslationX(jeVar.a);
        }
    }

    public final void V() {
        if (this.c0 != null) {
            return;
        }
        NumberTextView numberTextView = new NumberTextView(getContext());
        this.c0 = numberTextView;
        numberTextView.setVisibility(8);
        this.c0.setTextSize(15);
        this.c0.setTextColor(u0(org.telegram.ui.ActionBar.j6.y6));
        this.c0.setTypeface(org.telegram.messenger.g0.o());
        this.c0.setCenterAlign(true);
        addView(this.c0, Math.min(2, getChildCount()), c8.ja.d(44, 20.0f, 85, 3.0f, 0.0f, 0.0f, 44.0f));
    }

    public final void V0() {
        int height = this.U1.getHeight();
        if (!this.h3) {
            height -= this.i3;
        }
        cg cgVar = this.H3;
        if (cgVar != null) {
            cgVar.k2(height);
        }
        if (this.o2 != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.L(72.0f);
            te.a aVar = this.F6;
            if (height < currentActionBarHeight) {
                if (this.P3) {
                    this.P3 = false;
                    if (this.O3) {
                        aVar.a(false, false);
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.P3) {
                return;
            }
            this.P3 = true;
            if (this.O3) {
                aVar.a(true, false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b5, code lost:
    
        if (android.text.TextUtils.isEmpty(r15 == null ? "" : org.telegram.messenger.g0.n1(r15.getTextToUse())) != false) goto L124;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V1(boolean z10) {
        zd zdVar;
        if (this.F4) {
            org.telegram.ui.an anVar = this.x3;
            if (anVar != null && !anVar.e6) {
                z10 = false;
            }
            boolean v02 = v0();
            int i7 = 1;
            boolean z11 = this.L6 != 1 && this.y3 > 0;
            zd zdVar2 = this.f2;
            boolean z12 = zdVar2 != null && zdVar2.getVisibility() == 0;
            if (!v02 && !this.X2 && this.V2 == null) {
                zd zdVar3 = this.f2;
                if (zdVar3 != null) {
                    zdVar3.setVisibility(8);
                }
            } else if (this.V2 != null) {
                if (G0() && this.N2 == 1 && this.V2.is_persistent) {
                    zd zdVar4 = this.f2;
                    if (zdVar4 != null && zdVar4.getVisibility() != 8) {
                        this.f2.setVisibility(8);
                    }
                } else {
                    T();
                    if (this.f2.getVisibility() != 0) {
                        this.f2.setVisibility(0);
                    }
                    this.C2.a(R.drawable.input_bot2, true);
                    this.f2.setContentDescription(org.telegram.messenger.hd.M0(2131754918, "AccDescrBotKeyboard"));
                }
            } else if (z11) {
                zd zdVar5 = this.f2;
                if (zdVar5 != null) {
                    zdVar5.setVisibility(8);
                }
            } else {
                T();
                this.C2.a(R.drawable.input_bot1, true);
                this.f2.setContentDescription(org.telegram.messenger.hd.M0(2131754919, "AccDescrBotCommands"));
                this.f2.setVisibility(0);
            }
            if (z11) {
                U();
            }
            zd zdVar6 = this.f2;
            boolean z13 = (zdVar6 != null && zdVar6.getVisibility() == 0) != z12;
            ki.a0 a0Var = this.m0;
            int i10 = 2;
            if (a0Var != null) {
                boolean z14 = a0Var.x;
                a0Var.setWebView(this.L6 == 3);
                ki.a0 a0Var2 = this.m0;
                String M0 = this.L6 == 2 ? org.telegram.messenger.hd.M0(2131752891, null) : this.j0;
                if (M0 == null) {
                    a0Var2.getClass();
                    M0 = org.telegram.messenger.hd.M0(2131752891, null);
                }
                String str = a0Var2.n;
                boolean z15 = str == null || !str.equals(M0);
                a0Var2.n = M0;
                a0Var2.r = null;
                a0Var2.requestLayout();
                org.telegram.messenger.g0.Y3(this.m0, z11, 0.5f, true, z10);
                z13 = z13 || z15 || z14 != this.m0.x;
            }
            if (z13 && z10) {
                wd wdVar = this.R0;
                Float valueOf = Float.valueOf(wdVar.getX());
                HashMap hashMap = this.C0;
                hashMap.put(wdVar, valueOf);
                xe xeVar = this.F0;
                if (xeVar != null) {
                    hashMap.put(xeVar, Float.valueOf(xeVar.getX()));
                }
                zd zdVar7 = this.f2;
                boolean z16 = zdVar7 != null && zdVar7.getVisibility() == 0;
                if (z16 != z12 && (zdVar = this.f2) != null) {
                    zdVar.setVisibility(0);
                    if (z16) {
                        this.f2.setAlpha(0.0f);
                        this.f2.setScaleX(0.1f);
                        this.f2.setScaleY(0.1f);
                    } else if (!z16) {
                        this.f2.setAlpha(1.0f);
                        this.f2.setScaleX(1.0f);
                        this.f2.setScaleY(1.0f);
                    }
                    org.telegram.messenger.g0.X3(this.f2, z16, 0.1f, true, 1.0f, true, new gd(this, i7));
                }
            }
            zd zdVar8 = this.f2;
            if (zdVar8 != null && zdVar8.getVisibility() == 0) {
                xe xeVar2 = this.F0;
            }
            i10 = this.k6;
            b2(i10);
        }
    }

    public final void W(boolean z10) {
        if (this.n2 != null) {
            return;
        }
        he heVar = new he(this, getContext(), this.E4);
        this.n2 = heVar;
        heVar.setContentDescription(org.telegram.messenger.hd.M0(2131751274, null));
        if (z10) {
            c8.na.a(this.n2);
        }
        this.h2.addView(this.n2, c8.ja.e(44, 44, 85));
    }

    public void W0() {
        if ((v0() && y()) || org.telegram.ui.ActionBar.e2.hasSheets(this.x3)) {
            return;
        }
        cg cgVar = this.H3;
        if (cgVar != null) {
            cgVar.o1();
        }
        xe xeVar = this.F0;
        if (xeVar == null || org.telegram.messenger.g0.J3(xeVar)) {
            return;
        }
        this.F0.clearFocus();
        this.F0.requestFocus();
    }

    public final void W1() {
        int d;
        v4.b0 b0Var;
        int L0;
        View m10;
        ve veVar = this.n0;
        if (veVar == null) {
            return;
        }
        int childCount = veVar.c.getChildCount();
        int i7 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.n0.c.getChildAt(i10);
            if (i10 < 4) {
                i7 += childAt.getMeasuredHeight();
            }
        }
        st0 st0Var = this.U1;
        if (i7 > 0) {
            d = i5.c.d(childCount > 4 ? 12.0f : 0.0f, (st0Var.getMeasuredHeight() - i7) - org.telegram.messenger.g0.L(8.0f), 0);
        } else {
            d = this.o0.c.size() > 4 ? i5.c.d(162.8f, st0Var.getMeasuredHeight(), 0) : i5.c.d((Math.max(1, Math.min(4, this.o0.c.size())) * 36) + 8, st0Var.getMeasuredHeight(), 0);
        }
        if (this.n0.c.getPaddingTop() != d) {
            this.n0.c.setTopGlowOffset(d);
            if (this.u6 == -1 && this.n0.getVisibility() == 0 && this.n0.c.getLayoutManager() != null && (L0 = (b0Var = (v4.b0) this.n0.c.getLayoutManager()).L0()) >= 0 && (m10 = b0Var.m(L0)) != null) {
                this.u6 = L0;
                this.v6 = m10.getTop() - this.n0.c.getPaddingTop();
            }
            this.n0.c.setPadding(0, d, 0, org.telegram.messenger.g0.L(8.0f));
        }
    }

    public final void X() {
        sf sfVar = this.V0;
        if (sfVar != null && sfVar.d1 != org.telegram.messenger.m10.t0) {
            this.V1.removeView(sfVar);
            this.V0 = null;
        }
        if (this.V0 != null) {
            return;
        }
        sf sfVar2 = new sf(this, this.x3, this.q3, getContext(), this.L2, this.U1, this.Q5, this.E4, this.U0, this.C6 != null);
        this.V0 = sfVar2;
        sfVar2.w0 = true;
        if (!this.Q5) {
            sfVar2.updateColors();
        }
        this.V0.J(true, this.r3, this.s3, true);
        this.V0.setVisibility(8);
        this.V0.setShowing(false);
        if (this.C6 != null) {
            sf sfVar3 = this.V0;
            sfVar3.x0 = false;
            sfVar3.setShouldDrawBackground(false);
            this.V0.W0 = true;
        }
        this.V0.setDelegate(new wf(this));
        this.V0.setDragListener(new bg.v0(this));
        sf sfVar4 = this.V0;
        if (sfVar4 != null) {
            sfVar4.L(-this.y3, !this.A0, !this.b);
        }
        w();
        I();
    }

    public final void X0() {
        if (v0() && y()) {
            return;
        }
        org.telegram.ui.an anVar = this.x3;
        if (org.telegram.ui.ActionBar.e2.hasSheets(anVar)) {
            return;
        }
        L1((org.telegram.messenger.g0.D || org.telegram.messenger.g0.E || (anVar != null && anVar.isInBubbleMode()) || this.R2) ? 0 : 2, 0, true, true);
        cg cgVar = this.H3;
        if (cgVar != null) {
            cgVar.o1();
        }
        xe xeVar = this.F0;
        if (xeVar != null) {
            xeVar.requestFocus();
        }
        org.telegram.messenger.g0.J3(this.F0);
        if (this.R2) {
            this.T2 = true;
            return;
        }
        if (org.telegram.messenger.g0.D || this.h3 || org.telegram.messenger.g0.E) {
            return;
        }
        if (anVar == null || !anVar.isInBubbleMode()) {
            this.S3 = true;
            sf sfVar = this.V0;
            if (sfVar != null) {
                sfVar.onTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0));
            }
            ke keVar = this.Z3;
            org.telegram.messenger.g0.r(keVar);
            org.telegram.messenger.g0.i3(keVar, 100L);
        }
    }

    public final void X1(boolean z10) {
        if (this.L6 != 1 && this.y3 > 0) {
            U();
        }
        ki.a0 a0Var = this.m0;
        if (a0Var != null) {
            a0Var.setWebView(v0());
        }
        V1(z10);
    }

    public final void Y() {
        if (this.T0 != null) {
            return;
        }
        zd zdVar = new zd(this, getContext(), 3);
        this.T0 = zdVar;
        zdVar.setScaleType(ImageView.ScaleType.CENTER);
        zd zdVar2 = this.T0;
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(u0(org.telegram.ui.ActionBar.j6.Nl), false);
        this.n4 = animatedArrowDrawable;
        zdVar2.setImageDrawable(animatedArrowDrawable);
        this.T0.setVisibility(8);
        this.T0.setScaleX(0.1f);
        this.T0.setScaleY(0.1f);
        this.T0.setAlpha(0.0f);
        zd zdVar3 = this.T0;
        int i7 = org.telegram.ui.ActionBar.j6.i6;
        org.telegram.ui.ActionBar.q6.Q(zdVar3, org.telegram.ui.ActionBar.j6.h0(u0(i7), 1, -1), null, org.telegram.ui.ActionBar.q6.M(i7), this.E4);
        this.i2.addView(this.T0, c8.ja.e(44, 44, 85));
        this.T0.setOnClickListener(new xc(this, 7));
        this.T0.setContentDescription(org.telegram.messenger.hd.M0(2131754883, "AccDescrExpandPanel"));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y0() {
        org.telegram.ui.an anVar;
        Editable editable;
        oi.z1 z1Var;
        CharSequence[] charSequenceArr;
        ArrayList W;
        if (this.F0 == null || (anVar = this.x3) == null) {
            return;
        }
        org.telegram.messenger.np.s1(this.R);
        boolean z10 = org.telegram.messenger.r2.a;
        TL_iv.RichMessage richMessage = this.m2;
        if (richMessage != null) {
            z1Var = new oi.z1(richMessage);
        } else {
            Editable text = this.F0.getText();
            if (!TextUtils.isEmpty(text) && TextUtils.indexOf((CharSequence) text, '`') >= 0) {
                try {
                    charSequenceArr = new CharSequence[]{new SpannableStringBuilder(text)};
                    W = org.telegram.messenger.si.b0(this.R).W(charSequenceArr, true, true);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                if (W != null && !W.isEmpty()) {
                    editable = new SpannableStringBuilder(charSequenceArr[0]);
                    org.telegram.messenger.gj.b(editable, W, false, false, false, false, 0);
                    oi.z1 z1Var2 = new oi.z1(editable);
                    if (editable == text) {
                        int selectionStart = this.F0.getSelectionStart();
                        int selectionEnd = this.F0.getSelectionEnd();
                        if (selectionStart < 0) {
                            selectionStart = this.F0.length();
                        }
                        if (selectionEnd < 0) {
                            selectionEnd = selectionStart;
                        }
                        z1Var2.c = selectionStart;
                        z1Var2.d = selectionEnd;
                    }
                    z1Var2.M = new uc(this, 21);
                    z1Var = z1Var2;
                }
            }
            editable = text;
            oi.z1 z1Var22 = new oi.z1(editable);
            if (editable == text) {
            }
            z1Var22.M = new uc(this, 21);
            z1Var = z1Var22;
        }
        z1Var.setResourceProvider(this.E4);
        z1Var.K = anVar;
        z1Var.s = anVar.U;
        z1Var.w = anVar.a0;
        z1Var.L = new uc(this, 22);
        anVar.presentFragment(z1Var);
    }

    public final void Y1() {
        xe xeVar = this.F0;
        boolean z10 = false;
        H1((xeVar == null || xeVar.getLineCount() <= 2 || this.F0.getText() == null || TextUtils.isEmpty(this.F0.getText().toString().trim())) ? false : true);
        xe xeVar2 = this.F0;
        if (xeVar2 != null && xeVar2.getLineCount() > 2 && this.F0.getText() != null && !TextUtils.isEmpty(this.F0.getText().toString().trim())) {
            z10 = true;
        }
        N1(z10);
    }

    public final void Z() {
        if (this.F0 != null) {
            return;
        }
        Context context = getContext();
        org.telegram.ui.ActionBar.e6 e6Var = this.E4;
        xe xeVar = new xe(this, context, e6Var);
        this.F0 = xeVar;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 28) {
            xeVar.setFallbackLineSpacing(false);
        }
        if (i7 >= 35) {
            this.F0.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        this.F0.setDelegate(new hd(this));
        org.telegram.ui.an anVar = this.x3;
        if (anVar == null || anVar.getParentLayout() == null || !((ActionBarLayout) anVar.getParentLayout()).b) {
            this.F0.setWindowView(this.w3.getWindow().getDecorView());
        } else {
            this.F0.setWindowView(anVar.getParentLayout().getWindow().getDecorView());
        }
        TLRPC.EncryptedChat encryptedChat = anVar != null ? anVar.h : null;
        this.F0.setAllowTextEntitiesIntersection(S1());
        String string = Settings.Secure.getString(getContext().getContentResolver(), "default_input_method");
        int i10 = ((string == null || !string.startsWith("com.samsung")) && encryptedChat != null) ? 285212672 : TLObject.FLAG_28;
        this.F0.setIncludeFontPadding(false);
        this.F0.setImeOptions(i10);
        xe xeVar2 = this.F0;
        int inputType = xeVar2.getInputType() | 147456;
        this.a = inputType;
        xeVar2.setInputType(inputType);
        a2(false);
        this.F0.setSingleLine(false);
        this.F0.setMaxLines(6);
        this.F0.setTextSize(1, 18.0f);
        this.F0.setGravity(80);
        this.F0.setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(10.0f));
        this.F0.setBackgroundDrawable(null);
        org.telegram.ui.ActionBar.q6.U(this.F0, org.telegram.ui.ActionBar.j6.Le, e6Var);
        org.telegram.ui.ActionBar.q6.G(this.F0, org.telegram.ui.ActionBar.j6.Yc, e6Var);
        org.telegram.ui.ActionBar.q6.C(this.F0, org.telegram.ui.ActionBar.j6.lg, e6Var);
        xe xeVar3 = this.F0;
        int i11 = org.telegram.ui.ActionBar.j6.Me;
        org.telegram.ui.ActionBar.q6.A(xeVar3, i11, e6Var);
        org.telegram.ui.ActionBar.q6.D(this.F0, i11, e6Var);
        org.telegram.ui.ActionBar.q6.v(this.F0, org.telegram.ui.ActionBar.j6.Ne, e6Var);
        org.telegram.ui.ActionBar.q6.y(this.F0, org.telegram.ui.ActionBar.j6.mg, e6Var);
        xe xeVar4 = this.F0;
        boolean z10 = this.F4;
        FrameLayout.LayoutParams d = c8.ja.d(-1, -2.0f, 80, 52.0f, 0.0f, z10 ? 50.0f : 2.0f, 1.5f);
        ud udVar = this.g2;
        udVar.addView(xeVar4, 1, d);
        org.telegram.messenger.xt xtVar = new org.telegram.messenger.xt(this.R, getContext(), e6Var);
        this.k2 = xtVar;
        xtVar.setAllowActions(false);
        this.k2.setMaxHeight(org.telegram.messenger.g0.L(150.0f));
        this.k2.setMinHeight(org.telegram.messenger.g0.L(88.0f));
        this.k2.setVisibility(8);
        this.k2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(10.0f));
        this.k2.setOnClickListener(new xc(this, 12));
        udVar.addView(this.k2, 2, c8.ja.d(-1, -2.0f, 80, 44.0f, 0.0f, (z10 ? 50 : 2) - 8, 1.5f));
        this.F0.setOnKeyListener(new ye(this));
        this.F0.setOnEditorActionListener(new m.r2(this, 3));
        this.F0.addTextChangedListener(new ze(this));
        this.F0.addTextChangedListener(new org.telegram.ui.Cells.j3());
        this.F0.setEnabled(this.a6);
        ArrayList arrayList = this.Z5;
        if (arrayList != null) {
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                this.F0.addTextChangedListener((TextWatcher) obj);
            }
            this.Z5.clear();
        }
        a2(false);
        j2(anVar != null && anVar.getFragmentBeginToShow());
        if (anVar != null) {
            anVar.N6(false, false);
        }
        b2(this.k6);
    }

    public final void Z0(CharSequence charSequence, CharSequence charSequence2, String str) {
        org.telegram.ui.an anVar;
        if (this.F0 == null || (anVar = this.x3) == null) {
            return;
        }
        org.telegram.messenger.np.s1(this.R);
        boolean z10 = org.telegram.messenger.r2.a;
        oi.z1 z1Var = new oi.z1(str);
        z1Var.h = charSequence;
        z1Var.n = charSequence2;
        z1Var.setResourceProvider(this.E4);
        z1Var.K = anVar;
        z1Var.s = anVar.U;
        z1Var.w = anVar.a0;
        z1Var.M = new uc(this, 2);
        z1Var.L = new uc(this, 3);
        anVar.presentFragment(z1Var);
    }

    public final void Z1() {
        float f10 = (1.0f - this.t1) * this.r1;
        float T1 = f10 > 0.0f ? org.telegram.messenger.g0.T1(1.0f, 0.6f, f10) : 1.0f;
        float f11 = this.r * this.h * T1;
        wd wdVar = this.R0;
        wdVar.setScaleX(f11);
        wdVar.setScaleY(this.r * this.h * T1);
        wdVar.setAlpha((1.0f - f10) * this.s * this.n);
    }

    @Override // org.telegram.ui.Components.pw0
    public final boolean a() {
        ai.n0 n0Var = this.j1;
        return n0Var != null && n0Var.k();
    }

    public final void a0() {
        if (this.f1 != null) {
            return;
        }
        ud udVar = new ud(this, getContext(), 3);
        this.f1 = udVar;
        int i7 = 8;
        udVar.setVisibility(this.J3 == null ? 8 : 0);
        this.f1.setFocusable(true);
        this.f1.setFocusableInTouchMode(true);
        this.f1.setClickable(true);
        this.g2.addView(this.f1, c8.ja.e(-1, 44, 80));
        fh0 fh0Var = new fh0(getContext());
        this.h1 = fh0Var;
        fh0Var.setScaleType(ImageView.ScaleType.CENTER);
        this.h1.f(R.raw.chat_audio_record_delete_2, 28, 28, null);
        this.h1.getAnimatedDrawable().p0 = true;
        this.t5 = this.h1.getAnimatedDrawable();
        g2();
        this.h1.setContentDescription(org.telegram.messenger.hd.M0(2131751598, "Delete"));
        fh0 fh0Var2 = this.h1;
        int i10 = org.telegram.ui.ActionBar.j6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(u0(i10), 1, -1);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i10);
        org.telegram.ui.ActionBar.e6 e6Var = this.E4;
        org.telegram.ui.ActionBar.q6.Q(fh0Var2, h02, null, M, e6Var);
        this.f1.addView(this.h1, c8.ja.c(44.0f, 44));
        this.h1.setOnClickListener(new xc(this, i7));
        i61 i61Var = new i61(getContext());
        this.g1 = i61Var;
        i61Var.setVisibility(4);
        i61 i61Var2 = this.g1;
        i61Var2.T = !this.Q5;
        i61Var2.setRoundFrames(true);
        this.g1.setDelegate(new me(this));
        this.f1.addView(this.g1, c8.ja.d(-1, -1.0f, 19, 56.0f, 0.0f, 8.0f, 0.0f));
        Context context = getContext();
        g61 g61Var = new g61(context);
        TextPaint textPaint = new TextPaint(1);
        g61Var.d = textPaint;
        g61Var.e = -1L;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        g61Var.b = context.getDrawable(R.drawable.tooltip_arrow);
        g61Var.a = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(5.0f), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.hg, false));
        g61Var.b();
        g61Var.setTime(0);
        this.g1.setTimeHintView(g61Var);
        this.U1.addView(g61Var, c8.ja.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 52.0f));
        oi0 oi0Var = new oi0(getContext(), e6Var);
        this.i1 = oi0Var;
        this.f1.addView(oi0Var, c8.ja.d(-1, 32.0f, 19, 44.0f, 0.0f, 4.0f, 0.0f));
        b2(this.k6);
    }

    public final void a1() {
        uc ucVar = new uc(this, 0);
        if (org.telegram.messenger.b6.j(this.R, this.y3) || org.telegram.messenger.np.s1(this.R).X6.contains(Long.valueOf(this.y3))) {
            ucVar.run();
            return;
        }
        t4.n(this.x3, org.telegram.messenger.np.s1(this.R).a2(Long.valueOf(this.y3)), new org.telegram.ui.zg(25, this, ucVar), new uc(this, 1));
    }

    public final void a2(boolean z10) {
        boolean z11;
        String str;
        TLRPC.TL_forumTopic tL_forumTopic;
        String str2;
        org.telegram.messenger.gj gjVar;
        TLRPC.ReplyMarkup replyMarkup;
        TLRPC.ReplyMarkup replyMarkup2;
        xe xeVar = this.F0;
        if (xeVar == null) {
            return;
        }
        CharSequence charSequence = this.e;
        boolean z12 = false;
        if (charSequence != null) {
            xeVar.r(charSequence, z10);
            xe xeVar2 = this.F0;
            String str3 = this.f;
            ys ysVar = xeVar2.v0;
            if (ysVar != null) {
                if (!org.telegram.messenger.hd.a0 && z10) {
                    z12 = true;
                }
                ysVar.t(str3, z12, true);
                return;
            }
            return;
        }
        if (!this.A0 && !E0()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i5.c.k(2131747221, "PlainTextRestrictedHint", new StringBuilder(" d ")));
            spannableStringBuilder.setSpan(new eq(R.drawable.msg_mini_lock3, 0), 1, 2, 0);
            this.F0.r(spannableStringBuilder, z10);
            this.F0.setText((CharSequence) null);
            this.F0.setEnabled(false);
            this.F0.setInputType(1);
            return;
        }
        this.F0.setEnabled(true);
        int inputType = this.F0.getInputType();
        int i7 = this.a;
        if (inputType != i7) {
            this.F0.setInputType(i7);
        }
        l2();
        org.telegram.ui.an anVar = this.x3;
        boolean z13 = anVar != null && anVar.g4 == 8 && anVar.i4;
        long N1 = anVar != null ? anVar.getMessagesController().N1(anVar.a()) : 0L;
        if (N1 > 0) {
            N1 *= getMessagesCount();
        }
        int i10 = anVar != null ? anVar.g4 : -1;
        if (i10 == 9) {
            this.F0.setHintText(org.telegram.messenger.hd.M0(2131742895, null));
            return;
        }
        if (i10 == 5) {
            if ("hello".equalsIgnoreCase(anVar.f4)) {
                this.F0.setHintText(org.telegram.messenger.hd.M0(2131752767, null));
                return;
            } else if ("away".equalsIgnoreCase(anVar.f4)) {
                this.F0.setHintText(org.telegram.messenger.hd.M0(2131752836, null));
                return;
            } else {
                this.F0.setHintText(org.telegram.messenger.hd.M0(2131752672, null));
                return;
            }
        }
        eq[] eqVarArr = this.j6;
        if (z13) {
            this.F0.setHintText(N1 > 0 ? di.lb.T0(org.telegram.messenger.hd.a0(null, null, 2131744403, org.telegram.messenger.hd.E((int) N1, ','), eqVarArr)) : org.telegram.messenger.hd.a0(null, null, 2131744404, new Object[0]));
            eq eqVar = eqVarArr[0];
            if (eqVar != null) {
                eqVar.H = 0.9f;
                return;
            }
            return;
        }
        if (this.J2 != null) {
            this.F0.setHintText(org.telegram.messenger.hd.M0(2131752706, null));
            return;
        }
        org.telegram.messenger.gj gjVar2 = this.B3;
        if (gjVar2 != null && (replyMarkup2 = gjVar2.k.reply_markup) != null && !TextUtils.isEmpty(replyMarkup2.placeholder)) {
            this.F0.r(this.B3.k.reply_markup.placeholder, z10);
            return;
        }
        if (this.H2 != null) {
            this.F0.setHintText(this.I2 ? org.telegram.messenger.hd.M0(2131752561, null) : org.telegram.messenger.hd.M0(2131743928, null));
            return;
        }
        if (N1 > 0) {
            this.F0.setHintText(di.lb.Y0(false, org.telegram.messenger.hd.a0(null, null, 2131743926, org.telegram.messenger.hd.E((int) N1, ',')), eqVarArr));
            eq eqVar2 = eqVarArr[0];
            if (eqVar2 != null) {
                eqVar2.H = 0.9f;
                return;
            }
            return;
        }
        if (this.Y0 && (gjVar = this.U2) != null && (replyMarkup = gjVar.k.reply_markup) != null && !TextUtils.isEmpty(replyMarkup.placeholder)) {
            this.F0.r(this.U2.k.reply_markup.placeholder, z10);
            return;
        }
        if (anVar != null && anVar.T9()) {
            org.telegram.messenger.gj gjVar3 = this.C3;
            if (gjVar3 != null && (tL_forumTopic = gjVar3.j1) != null && (str2 = tL_forumTopic.title) != null) {
                this.F0.r(org.telegram.messenger.hd.a0(null, null, 2131743925, str2), z10);
                return;
            }
            TLRPC.TL_forumTopic f10 = org.telegram.messenger.np.s1(this.R).r7.f(anVar.e.id, 1L);
            if (f10 == null || (str = f10.title) == null) {
                this.F0.r(org.telegram.messenger.hd.M0(2131743928, null), z10);
                return;
            } else {
                this.F0.r(org.telegram.messenger.hd.a0(null, null, 2131743925, str), z10);
                return;
            }
        }
        if (org.telegram.messenger.m5.z(this.y3)) {
            TLRPC.Chat M0 = org.telegram.messenger.np.s1(this.S.a).M0(Long.valueOf(-this.y3));
            TLRPC.ChatFull N0 = org.telegram.messenger.np.s1(this.S.a).N0(-this.y3);
            z11 = org.telegram.messenger.t3.V(M0);
            z12 = !z11 && org.telegram.messenger.t3.M(M0, N0, false) == (-this.y3);
        } else {
            z11 = false;
        }
        if (z12) {
            this.F0.setHintText(org.telegram.messenger.hd.M0(2131745638, "SendAnonymously"));
            return;
        }
        TLRPC.User a22 = org.telegram.messenger.np.s1(this.S.a).a2(Long.valueOf(this.y3));
        if (a22 != null && a22.bot_forum_view && !a22.bot_forum_can_manage_topics && anVar != null && !anVar.w4) {
            this.F0.setHintText(org.telegram.messenger.hd.M0(2131745633, null));
            return;
        }
        if (anVar != null && anVar.fa() && !anVar.w4) {
            if (anVar.m4 == null || !anVar.v4) {
                this.F0.setHintText(org.telegram.messenger.hd.M0(2131746263, "Reply"));
                return;
            } else {
                this.F0.setHintText(org.telegram.messenger.hd.M0(2131752005, null));
                return;
            }
        }
        if (!z11) {
            this.F0.setHintText(org.telegram.messenger.hd.M0(2131743928, null));
        } else if (this.O2) {
            this.F0.r(org.telegram.messenger.hd.M0(2131752291, "ChannelSilentBroadcast"), z10);
        } else {
            this.F0.r(org.telegram.messenger.hd.M0(2131752447, "ChannelBroadcast"), z10);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Vf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Tf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Sf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Pe));
    }

    @Override // org.telegram.ui.Components.yv0
    public final boolean b() {
        org.telegram.ui.an anVar = this.x3;
        return anVar != null && anVar.S6();
    }

    public final ValueAnimator b0() {
        int[] iArr;
        float f10;
        int i7;
        int i10;
        float f11;
        int i11;
        int i12;
        float f12;
        float f13;
        int i13;
        int i14;
        float f14;
        int i15;
        float f15;
        float f16;
        float f17;
        int i16;
        int i17;
        if (this.T1 == null || this.v2 == null || this.w1 || !org.telegram.messenger.qc.e(360928) || !this.v2.isShown()) {
            return null;
        }
        RecordCircle recordCircle = this.v2;
        if (recordCircle.O || recordCircle.getWidth() <= 0) {
            return null;
        }
        if (this.T1.getVisibility() != 0) {
            this.T1.setVisibility(0);
        }
        this.T1.animate().cancel();
        this.T1.setScaleX(1.0f);
        this.T1.setScaleY(1.0f);
        this.T1.getLocationInWindow(new int[2]);
        this.v2.getLocationInWindow(new int[2]);
        float width = (this.T1.getWidth() / 2.0f) + (r5[0] - r6[0]);
        float measuredHeight = ((this.T1.getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(3.0f)) + (r5[1] - r6[1]);
        RecordCircle recordCircle2 = this.v2;
        float f18 = recordCircle2.K;
        float f19 = recordCircle2.L;
        float max = (Math.max(recordCircle2.M, org.telegram.messenger.g0.L(10.0f)) * 1.5f) + org.telegram.messenger.g0.L(6.0f);
        int ceil = (int) Math.ceil(max * 2.0f);
        try {
            Bitmap createBitmap = Bitmap.createBitmap(ceil, ceil, Bitmap.Config.ARGB_8888);
            float f20 = f18 - max;
            float f21 = f19 - max;
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(-f20, -f21);
            this.v2.draw(canvas);
            int[] iArr2 = new int[ceil * ceil];
            createBitmap.getPixels(iArr2, 0, ceil, 0, 0, ceil, ceil);
            int i18 = ceil;
            int max2 = Math.max(1, Math.round(org.telegram.messenger.g0.p * 0.75f));
            int i19 = 0;
            for (int i20 = 0; i20 < i18; i20 += max2) {
                for (int i21 = 0; i21 < i18; i21 += max2) {
                    if ((iArr2[(i20 * i18) + i21] >>> 24) > 24) {
                        i19++;
                    }
                }
            }
            if (i19 == 0) {
                createBitmap.recycle();
                return null;
            }
            int u02 = u0(org.telegram.ui.ActionBar.j6.Uf) | (-16777216);
            float[] fArr = {-0.24f, -0.17f, -0.11f, -0.06f, -0.02f, 0.03f, 0.08f, 0.13f};
            int[] iArr3 = new int[8];
            int i22 = 0;
            for (int i23 = 8; i22 < i23; i23 = 8) {
                float f22 = fArr[i22];
                if (f22 < 0.0f) {
                    f22 = -f22;
                    i17 = -16777216;
                } else {
                    i17 = -1;
                }
                iArr3[i22] = i0.a.f(f22, u02, i17);
                i22++;
            }
            int[] iArr4 = new int[i19];
            int i24 = 0;
            int i25 = 0;
            while (i24 < i18) {
                int i26 = 0;
                while (i26 < i18) {
                    int i27 = iArr2[(i24 * i18) + i26];
                    int[] iArr5 = iArr4;
                    int i28 = i24;
                    if ((i27 >>> 24) > 24) {
                        iArr5[i25] = s2(i27);
                        i25++;
                    }
                    i26 += max2;
                    iArr4 = iArr5;
                    i24 = i28;
                }
                i24 += max2;
            }
            int[] iArr6 = iArr4;
            Arrays.sort(iArr6);
            int[] iArr7 = new int[8];
            int i29 = 0;
            for (int i30 = 8; i29 < i30; i30 = i30) {
                int i31 = i29 + 1;
                iArr7[i29] = iArr6[Math.min(i19 - 1, (i31 * i19) / 8)];
                i29 = i31;
            }
            if (this.x5 == null) {
                this.x5 = new nu0(2400);
            }
            this.x5.a();
            this.x5.e(false);
            nu0 nu0Var = this.x5;
            nu0Var.t = iArr3;
            nu0Var.s = true;
            nu0Var.u = org.telegram.ui.ActionBar.j6.I.q() ? 0.12f : 0.0f;
            nu0 nu0Var2 = this.x5;
            nu0Var2.S = 0.0f;
            nu0Var2.R = 0.0f;
            float f23 = i19;
            float min = Math.min(1.0f, 1400.0f / f23);
            float f24 = org.telegram.messenger.g0.p;
            this.B5 = f20;
            this.C5 = i18 + f20;
            float[] fArr2 = new float[2400];
            int i32 = 0;
            int i33 = 0;
            int i34 = 0;
            while (true) {
                iArr = iArr7;
                if (i33 >= i18) {
                    break;
                }
                int i35 = 2400;
                float f25 = 0.3f;
                if (i32 >= 2400) {
                    break;
                }
                int i36 = i34;
                float f26 = min;
                int i37 = 0;
                while (i37 < i18 && i32 < i35) {
                    int i38 = iArr2[(i33 * i18) + i37];
                    int i39 = i32;
                    int i40 = i38 >>> 24;
                    if (i40 > 24) {
                        i36++;
                        int i41 = i36 * 7;
                        if (r2(i41 + 3) <= (((i40 * 0.7f) / 255.0f) + f25) * f26) {
                            float r22 = r2(i41 + 11);
                            float r23 = r2(i41 + 12);
                            float r24 = r2(i41 + 14);
                            float f27 = i37 + f20;
                            float f28 = r22 - 0.5f;
                            i14 = i37;
                            float f29 = max2;
                            float f30 = (f28 * f29) + f27;
                            f14 = f18;
                            float f31 = i33 + f21;
                            i15 = i33;
                            float f32 = r23 - 0.5f;
                            float f33 = (f32 * f29) + f31;
                            f15 = f19;
                            float f34 = this.B5;
                            f16 = f21;
                            f17 = f20;
                            float i42 = Utilities.i((f30 - f34) / (this.C5 - f34), 1.0f, 0.0f);
                            float f35 = (0.03f * r24) + (i42 * 0.2f) + 0.04f;
                            float x10 = com.google.android.gms.internal.vision.e2.x(f32, 3.0f, f24, width);
                            float x11 = com.google.android.gms.internal.vision.e2.x(f28, 2.0f, f24, measuredHeight);
                            float B = com.google.android.gms.internal.vision.e2.B(i42, 0.16f, 0.92f, (r2(i41 + 15) * 0.16f) + 0.5f);
                            float f36 = org.telegram.ui.Cells.y0.f(r22, 0.25f, f25, width - f30, f30);
                            float min2 = Math.min(f33, measuredHeight) - (((r24 * 22.0f) + 8.0f) * f24);
                            nu0 nu0Var3 = this.x5;
                            int s22 = s2(i38);
                            int i43 = 0;
                            while (true) {
                                if (i43 >= 7) {
                                    i16 = 7;
                                    break;
                                }
                                if (s22 <= iArr[i43]) {
                                    i16 = i43;
                                    break;
                                }
                                i43++;
                            }
                            nu0Var3.j(f30, f33, f36, min2, x10, x11, B, f35, i16);
                            i32 = i39 + 1;
                            fArr2[i39] = (B * 0.95f) + f35;
                            i37 = i14 + max2;
                            f19 = f15;
                            f18 = f14;
                            i33 = i15;
                            f21 = f16;
                            f20 = f17;
                            i35 = 2400;
                            f25 = 0.3f;
                        }
                    }
                    f16 = f21;
                    i15 = i33;
                    i14 = i37;
                    f14 = f18;
                    f15 = f19;
                    f17 = f20;
                    i32 = i39;
                    i37 = i14 + max2;
                    f19 = f15;
                    f18 = f14;
                    i33 = i15;
                    f21 = f16;
                    f20 = f17;
                    i35 = 2400;
                    f25 = 0.3f;
                }
                i33 += max2;
                min = f26;
                iArr7 = iArr;
                i34 = i36;
                i32 = i32;
                f19 = f19;
                f18 = f18;
                f21 = f21;
                f20 = f20;
            }
            float f37 = f21;
            float f38 = f18;
            float f39 = f19;
            float f40 = f20;
            float min3 = Math.min(1.0f, 650.0f / f23);
            int i44 = 0;
            int i45 = 0;
            while (i44 < i18) {
                if (i32 >= 2400) {
                    break;
                }
                int i46 = 0;
                for (int i47 = 2400; i46 < i18 && i32 < i47; i47 = 2400) {
                    int i48 = iArr2[(i44 * i18) + i46];
                    int i49 = i48 >>> 24;
                    if (i49 > 24) {
                        i45++;
                        int i50 = i45 * 13;
                        if (r2(i50 + 5) <= (((i49 * 0.7f) / 255.0f) + 0.3f) * min3) {
                            float r25 = r2(i50 + 6);
                            float r26 = r2(i50 + 7);
                            float r27 = r2(i50 + 8);
                            i7 = i18;
                            float f41 = r25 - 0.5f;
                            int i51 = i32;
                            float f42 = max2;
                            i10 = max2;
                            float f43 = (f41 * f42) + f40 + i46;
                            float f44 = r26 - 0.5f;
                            f11 = min3;
                            float f45 = (f42 * f44) + f37 + i44;
                            float f46 = f43 - f38;
                            float f47 = f45 - f39;
                            i11 = i44;
                            i12 = i46;
                            float sqrt = (float) Math.sqrt((f47 * f47) + (f46 * f46));
                            if (sqrt < org.telegram.messenger.g0.L(1.0f)) {
                                double d = r27 * 3.141592653589793d * 2.0d;
                                f13 = (float) Math.cos(d);
                                f12 = (float) Math.sin(d);
                            } else {
                                f12 = f47 / sqrt;
                                f13 = f46 / sqrt;
                            }
                            float r28 = ((r2(i50 + 9) * 13.0f) + 7.0f) * f24;
                            float f48 = r27 * 0.05f;
                            float x12 = com.google.android.gms.internal.vision.e2.x(f44, 3.0f, f24, width);
                            float x13 = com.google.android.gms.internal.vision.e2.x(f41, 2.0f, f24, measuredHeight);
                            float r29 = (r2(i50 + 10) * 0.2f) + 0.56f;
                            float f49 = org.telegram.ui.Cells.y0.f(r25, 0.25f, 0.3f, width - f43, f43);
                            float min4 = Math.min(f45, measuredHeight) - (((r26 * 22.0f) + 8.0f) * f24);
                            nu0 nu0Var4 = this.x5;
                            int s23 = s2(i48);
                            int i52 = 0;
                            while (true) {
                                if (i52 >= 7) {
                                    i13 = 7;
                                    break;
                                }
                                if (s23 <= iArr[i52]) {
                                    i13 = i52;
                                    break;
                                }
                                i52++;
                            }
                            nu0Var4.j(f43, f45, f49, min4, x12, x13, r29, f48, i13);
                            nu0 nu0Var5 = this.x5;
                            int i53 = nu0Var5.C;
                            int i54 = ((i53 + r3) - 1) % nu0Var5.b;
                            nu0Var5.w[i54] = f13 * r28;
                            nu0Var5.x[i54] = f12 * r28;
                            i32 = i51 + 1;
                            fArr2[i51] = (r29 * 0.95f) + f48;
                            i46 = i12 + i10;
                            i18 = i7;
                            max2 = i10;
                            min3 = f11;
                            i44 = i11;
                        }
                    }
                    i7 = i18;
                    i10 = max2;
                    f11 = min3;
                    i11 = i44;
                    i12 = i46;
                    i46 = i12 + i10;
                    i18 = i7;
                    max2 = i10;
                    min3 = f11;
                    i44 = i11;
                }
                int i55 = max2;
                i44 += i55;
                i18 = i18;
                i32 = i32;
                max2 = i55;
                min3 = min3;
            }
            if (i32 == 0) {
                createBitmap.recycle();
                return null;
            }
            Arrays.sort(fArr2, 0, i32);
            int i56 = i32 - 1;
            float f50 = i32;
            this.E5 = fArr2[Math.min(i56, (int) (0.72f * f50))] * 1000.0f;
            float f51 = fArr2[Math.min(i56, (int) (f50 * 0.95f))] * 1000.0f;
            this.F5 = f51;
            float f52 = this.E5;
            this.G5 = (Math.max(60.0f, f51 - f52) * 0.7f) + f52;
            this.y5 = createBitmap;
            this.z5 = f40;
            this.A5 = f37;
            this.D5 = 0.0f;
            this.H5 = true;
            RecordCircle recordCircle3 = this.v2;
            recordCircle3.P = true;
            recordCircle3.invalidate();
            ig igVar = this.T1;
            igVar.getClass();
            long uptimeMillis = SystemClock.uptimeMillis();
            if (igVar.c || igVar.e) {
                f10 = 1.0f;
            } else if (igVar.f) {
                f10 = igVar.a;
            } else {
                long j3 = igVar.G;
                if (j3 < 0) {
                    j3 = uptimeMillis;
                }
                f10 = ig.b(uptimeMillis - j3);
            }
            igVar.s = org.telegram.messenger.g0.T1(0.85f, 1.0f, f10) * org.telegram.messenger.g0.L(5.0f);
            igVar.n = true;
            igVar.r = uptimeMillis;
            igVar.y = 0.0f;
            igVar.x = 0.0f;
            igVar.w = 0.0f;
            igVar.c = false;
            igVar.d.stop();
            igVar.h().T(true, 0.0f);
            igVar.invalidate();
            this.n = 0.0f;
            this.h = 0.55f;
            Z1();
            float f53 = this.F5 + 260.0f + 16.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, f53);
            ofFloat.setDuration((long) f53);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.addUpdateListener(new md(this, this.T1, org.telegram.messenger.g0.L(3.0f) + org.telegram.messenger.g0.L(12.0f), this.v2));
            ofFloat.addListener(new le(this));
            return ofFloat;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final boolean b1() {
        return this.W0 != null;
    }

    public final void b2(int i7) {
        ImageView imageView;
        je jeVar;
        je jeVar2;
        zd zdVar;
        this.k6 = i7;
        if (this.F0 != null) {
            org.telegram.messenger.gj gjVar = this.H2;
            if (gjVar == null || gjVar.p5()) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.F0.getLayoutParams();
                int i10 = layoutParams.rightMargin;
                boolean z10 = this.S5;
                he heVar = this.K0;
                if (z10 && this.K6) {
                    layoutParams.rightMargin = Math.max(0, heVar.l() - org.telegram.messenger.g0.L(44.0f)) + org.telegram.messenger.g0.L(this.d5 ? 50.0f : 2.0f);
                } else if (i7 == 1 || i7 == 2) {
                    zd zdVar2 = this.f2;
                    if (zdVar2 == null || zdVar2.getVisibility() != 0 || (jeVar2 = this.r2) == null || jeVar2.getVisibility() != 0 || (zdVar = this.Z1) == null || zdVar.getVisibility() != 0) {
                        zd zdVar3 = this.f2;
                        if ((zdVar3 == null || zdVar3.getVisibility() != 0) && (((imageView = this.q2) == null || imageView.getVisibility() != 0) && ((jeVar = this.r2) == null || jeVar.getTag() == null))) {
                            layoutParams.rightMargin = org.telegram.messenger.g0.L(50.0f);
                        } else {
                            layoutParams.rightMargin = org.telegram.messenger.g0.L(98.0f);
                        }
                    } else {
                        layoutParams.rightMargin = org.telegram.messenger.g0.L(146.0f);
                    }
                    if (this.d5) {
                        layoutParams.rightMargin = org.telegram.messenger.g0.L(48.0f) + layoutParams.rightMargin;
                    }
                } else {
                    je jeVar3 = this.r2;
                    if (jeVar3 == null || jeVar3.getTag() == null) {
                        layoutParams.rightMargin = org.telegram.messenger.g0.L(2.0f);
                    } else {
                        layoutParams.rightMargin = org.telegram.messenger.g0.L(50.0f);
                    }
                }
                layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, heVar.l() - org.telegram.messenger.g0.L(44.0f)));
                he heVar2 = this.n2;
                if (heVar2 != null && heVar2.getVisibility() == 0) {
                    layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, this.n2.l() - org.telegram.messenger.g0.L(44.0f)));
                }
                if (i10 != layoutParams.rightMargin) {
                    this.F0.setLayoutParams(layoutParams);
                }
                ud udVar = this.f1;
                if (udVar != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) udVar.getLayoutParams();
                    layoutParams2.rightMargin = this.H2 == null ? i5.c.d(44.0f, heVar.l(), 0) : 0;
                    this.f1.setLayoutParams(layoutParams2);
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.yv0
    public final boolean c() {
        org.telegram.ui.an anVar = this.x3;
        return anVar != null && anVar.c();
    }

    public final void c0() {
        gg ggVar = this.w2;
        st0 st0Var = this.U1;
        if (ggVar == null) {
            gg ggVar2 = new gg(this, getContext());
            this.w2 = ggVar2;
            ggVar2.setVisibility(8);
            st0Var.addView(this.w2, c8.ja.e(-1, -2, 80));
        }
        if (this.v2 != null) {
            return;
        }
        RecordCircle recordCircle = new RecordCircle(getContext());
        this.v2 = recordCircle;
        recordCircle.setVisibility(8);
        st0Var.addView(this.v2, c8.ja.e(-1, -2, 80));
    }

    public boolean c1() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009d, code lost:
    
        if (org.telegram.messenger.np.s1(r16.R).f7.getBoolean("show_gift_for_" + r7.a(), true) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d1, code lost:
    
        if (org.telegram.messenger.np.s1(r16.R).f7.getBoolean(java.util.Calendar.getInstance().get(1) + "show_gift_for_" + r7.a(), true) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00db, code lost:
    
        if (r3.display_gifts_button == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ef, code lost:
    
        if (r1.disallow_unique_stargifts != false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c2(boolean z10) {
        boolean z11;
        hi.l3 l3Var;
        TLRPC.UserFull userFull = getParentFragment() == null ? null : getParentFragment().r8;
        TLRPC.UserFull b22 = org.telegram.messenger.np.s1(this.R).b2(org.telegram.messenger.m10.i(this.R).e());
        TLRPC.User j3 = getParentFragment() == null ? null : getParentFragment().j();
        boolean z12 = org.telegram.messenger.np.s1(this.R).i7;
        int i7 = 0;
        org.telegram.ui.an anVar = this.x3;
        int i10 = 1;
        if (!z12 && getParentFragment() != null && j3 != null) {
            boolean z13 = org.telegram.messenger.r2.a;
            if ((!org.telegram.messenger.q10.B(j3) || (b22 != null && b22.display_gifts_button)) && !org.telegram.messenger.q10.t(j3) && !org.telegram.messenger.np.F2(j3) && userFull != null) {
                if (!j3.premium && org.telegram.messenger.np.s1(this.R).w7 && org.telegram.messenger.np.s1(this.R).x7) {
                }
                if (org.telegram.messenger.v1.e(userFull.birthday)) {
                }
                if (!userFull.display_gifts_button) {
                    if (b22 != null) {
                    }
                }
                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = userFull.disallowed_stargifts;
                if (disallowedGiftsSettings != null) {
                    if (disallowedGiftsSettings.disallow_premium_gifts) {
                        if (disallowedGiftsSettings.disallow_limited_stargifts) {
                            if (disallowedGiftsSettings.disallow_unlimited_stargifts) {
                            }
                        }
                    }
                }
                if (anVar != null && anVar.g4 == 0) {
                    z11 = true;
                    if (!z11 && (l3Var = this.M) != null) {
                        l3Var.f(true);
                    }
                    if (z11 && this.s2 == null) {
                        return;
                    }
                    if (this.s2 == null && anVar != null) {
                        zd zdVar = new zd(this, getContext(), i10);
                        this.s2 = zdVar;
                        zdVar.setImageResource(R.drawable.msg_input_gift);
                        zd zdVar2 = this.s2;
                        int i11 = org.telegram.ui.ActionBar.j6.Nl;
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        org.telegram.ui.ActionBar.e6 e6Var = this.E4;
                        org.telegram.ui.ActionBar.q6.s(zdVar2, i11, e6Var, mode);
                        this.s2.setVisibility(8);
                        this.s2.setContentDescription(org.telegram.messenger.hd.M0(2131749680, null));
                        this.s2.setScaleType(ImageView.ScaleType.CENTER);
                        zd zdVar3 = this.s2;
                        int i12 = org.telegram.ui.ActionBar.j6.i6;
                        org.telegram.ui.ActionBar.q6.Q(zdVar3, org.telegram.ui.ActionBar.j6.h0(u0(i12), 1, -1), null, org.telegram.ui.ActionBar.q6.M(i12), e6Var);
                        this.X1.addView(this.s2, 0, c8.ja.e(44, 44, 21));
                        this.s2.setOnClickListener(new xc(this, 10));
                    }
                    org.telegram.messenger.g0.X3(this.s2, z11, 1.0f, true, 1.0f, z10, new gd(this, i7));
                    if (z11) {
                        return;
                    }
                    F();
                    return;
                }
            }
        }
        z11 = false;
        if (!z11) {
            l3Var.f(true);
        }
        if (z11) {
        }
        if (this.s2 == null) {
            zd zdVar4 = new zd(this, getContext(), i10);
            this.s2 = zdVar4;
            zdVar4.setImageResource(R.drawable.msg_input_gift);
            zd zdVar22 = this.s2;
            int i112 = org.telegram.ui.ActionBar.j6.Nl;
            PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.e6 e6Var2 = this.E4;
            org.telegram.ui.ActionBar.q6.s(zdVar22, i112, e6Var2, mode2);
            this.s2.setVisibility(8);
            this.s2.setContentDescription(org.telegram.messenger.hd.M0(2131749680, null));
            this.s2.setScaleType(ImageView.ScaleType.CENTER);
            zd zdVar32 = this.s2;
            int i122 = org.telegram.ui.ActionBar.j6.i6;
            org.telegram.ui.ActionBar.q6.Q(zdVar32, org.telegram.ui.ActionBar.j6.h0(u0(i122), 1, -1), null, org.telegram.ui.ActionBar.q6.M(i122), e6Var2);
            this.X1.addView(this.s2, 0, c8.ja.e(44, 44, 21));
            this.s2.setOnClickListener(new xc(this, 10));
        }
        org.telegram.messenger.g0.X3(this.s2, z11, 1.0f, true, 1.0f, z10, new gd(this, i7));
        if (z11) {
        }
    }

    @Override // org.telegram.ui.Components.yv0
    public final void d(TLRPC.Document document, String str, Object obj, org.telegram.messenger.cj cjVar, boolean z10, boolean z11, int i7, int i10) {
        if (this.K6) {
            return;
        }
        org.telegram.ui.qm qmVar = this.D3;
        org.telegram.ui.an anVar = this.x3;
        if (qmVar != null && anVar != null && qmVar.f) {
            anVar.yc();
            return;
        }
        if (!c() || i7 != 0) {
            t4.X(this.R, 1, this.y3, new qd(this, document, str, cjVar, z11, i7, i10, obj, z10));
            return;
        }
        t4.J(this.w3, anVar.a(), new pd(this, document, str, obj, cjVar, z10), this.E4);
    }

    public final void d0() {
        if (this.e1 != null || getContext() == null) {
            return;
        }
        bi.v1 v1Var = new bi.v1(getContext(), 15);
        this.e1 = v1Var;
        v1Var.setClipChildren(false);
        this.e1.setVisibility(8);
        this.g2.addView(this.e1, c8.ja.c(44.0f, -1));
        this.e1.setOnTouchListener(new gi.a(12));
        bi.v1 v1Var2 = this.e1;
        SlideTextView slideTextView = new SlideTextView(getContext());
        this.S1 = slideTextView;
        v1Var2.addView(slideTextView, c8.ja.d(-1, -1.0f, 0, 45.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(0);
        this.d.setPadding(org.telegram.messenger.g0.L(13.0f), 0, 0, 0);
        this.d.setFocusable(false);
        LinearLayout linearLayout2 = this.d;
        ig igVar = new ig(this, getContext());
        this.T1 = igVar;
        linearLayout2.addView(igVar, c8.ja.t(28, 28, 16, 0, 0, 0, 0));
        LinearLayout linearLayout3 = this.d;
        lg lgVar = new lg(this, getContext());
        this.Z0 = lgVar;
        linearLayout3.addView(lgVar, c8.ja.t(-1, -1, 16, 6, 0, 0, 0));
        this.e1.addView(this.d, c8.ja.e(-1, -1, 16));
    }

    public final void d1(int i7, int i10, CharSequence charSequence, boolean z10) {
        if (this.F0 == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.F0.getText());
            spannableStringBuilder.replace(i7, i10 + i7, charSequence);
            if (z10) {
                org.telegram.messenger.j6.m(spannableStringBuilder, this.F0.getPaint().getFontMetricsInt(), false, null, 0);
            }
            this.F0.setText(spannableStringBuilder);
            this.F0.setSelection(i7 + charSequence.length());
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void d2() {
        xe xeVar = this.F0;
        if (xeVar != null) {
            xeVar.setTranslationX(this.I + this.H);
        }
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        he heVar;
        TLRPC.ChatFull chatFull;
        TLRPC.Chat M0;
        double d;
        byte[] bArr;
        zd zdVar;
        if (i7 == org.telegram.messenger.ns.i4) {
            sf sfVar = this.V0;
            if (sfVar != null) {
                sfVar.Q.g1();
            }
            pf pfVar = this.p2;
            if (pfVar != null) {
                ArrayList arrayList = pfVar.n;
                while (r4 < arrayList.size()) {
                    ((ki.k0) arrayList.get(r4)).invalidate();
                    r4++;
                }
            }
            xe xeVar = this.F0;
            if (xeVar != null) {
                xeVar.postInvalidate();
                this.F0.q();
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ns.k2) {
            if (((Integer) objArr[0]).intValue() != this.o3) {
                return;
            }
            if (this.e3 != 0 && !this.U3 && !c()) {
                this.U3 = true;
                org.telegram.messenger.np.s1(this.S.a).D4(this.d1 ? 7 : 1, 0, this.y3, getThreadMessageId(), null);
            }
            RecordCircle recordCircle = this.v2;
            if (recordCircle != null) {
                recordCircle.setAmplitude(((Double) objArr[1]).doubleValue());
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ns.t) {
            xe xeVar2 = this.F0;
            if (xeVar2 == null || !xeVar2.isFocused()) {
                return;
            }
            org.telegram.messenger.g0.v1(this.F0);
            return;
        }
        int i11 = org.telegram.messenger.ns.m2;
        int i12 = org.telegram.messenger.ns.n2;
        int i13 = 5;
        if (i7 == i11 || i7 == i12) {
            if (((Integer) objArr[0]).intValue() == this.o3 && this.n3) {
                this.n3 = false;
                if (i7 != i12) {
                    f2(2, true);
                    return;
                }
                Integer num = (Integer) objArr[1];
                if (num.intValue() == 4) {
                    i13 = 4;
                } else if (this.d1 && num.intValue() == 5) {
                    i13 = 1;
                } else if (num.intValue() != 0) {
                    i13 = num.intValue() == 6 ? 2 : 3;
                }
                if (i13 != 3) {
                    f2(i13, true);
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ns.l2) {
            if (((Integer) objArr[0]).intValue() != this.o3) {
                return;
            }
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            this.d1 = !booleanValue;
            fe feVar = this.c1;
            if (feVar != null) {
                feVar.j(booleanValue ? ng.a : ng.b, true);
            }
            if (this.n3) {
                RecordCircle recordCircle2 = this.v2;
                if (recordCircle2 != null) {
                    recordCircle2.J = true;
                }
            } else {
                this.n3 = true;
                f2(0, true);
            }
            lg lgVar = this.Z0;
            if (lgVar != null) {
                lgVar.a(this.Q1);
            }
            ig igVar = this.T1;
            if (igVar != null) {
                igVar.e = false;
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ns.o2) {
            this.n3 = false;
            this.J3 = null;
            this.M3 = null;
            return;
        }
        if (i7 == org.telegram.messenger.ns.p2) {
            this.J3 = null;
            this.M3 = null;
            lg lgVar2 = this.Z0;
            if (lgVar2 != null) {
                lgVar2.a(this.Q1);
            }
            N(true);
            this.n3 = true;
            f2(0, true);
            return;
        }
        if (i7 != org.telegram.messenger.ns.s2) {
            if (i7 == org.telegram.messenger.ns.u2) {
                Activity activity = this.w3;
                if (activity != null) {
                    activity.setVolumeControlStream(((Boolean) objArr[0]).booleanValue() ? 0 : TLObject.FLAG_31);
                    return;
                }
                return;
            }
            if (i7 == org.telegram.messenger.ns.e2) {
                if (this.L3 == null || !MediaController.B().I(this.L3)) {
                    return;
                }
                org.telegram.messenger.gj gjVar = MediaController.B().v0;
                org.telegram.messenger.gj gjVar2 = this.L3;
                gjVar2.b0 = gjVar.b0;
                gjVar2.i0 = gjVar.i0;
                return;
            }
            if (i7 == org.telegram.messenger.ns.z0) {
                wd wdVar = this.R0;
                if (wdVar != null) {
                    wdVar.invalidate();
                    return;
                }
                return;
            }
            if (i7 == org.telegram.messenger.ns.L) {
                if (((Boolean) objArr[6]).booleanValue()) {
                    return;
                }
                long longValue = ((Long) objArr[3]).longValue();
                Integer num2 = (Integer) objArr[1];
                if (longValue != this.y3 || (chatFull = this.L2) == null || chatFull.slowmode_seconds == 0 || org.telegram.messenger.gj.f3(num2.intValue()) || (M0 = org.telegram.messenger.np.s1(this.S.a).M0(Long.valueOf(this.L2.id))) == null || org.telegram.messenger.t3.N(M0) || org.telegram.messenger.t3.h0(M0)) {
                    return;
                }
                TLRPC.ChatFull chatFull2 = this.L2;
                int currentTime = ConnectionsManager.getInstance(this.R).getCurrentTime();
                TLRPC.ChatFull chatFull3 = this.L2;
                chatFull2.slowmode_next_send_date = currentTime + chatFull3.slowmode_seconds;
                chatFull3.flags |= 262144;
                setSlowModeTimer(chatFull3.slowmode_next_send_date);
                return;
            }
            if (i7 == org.telegram.messenger.ns.n1) {
                if (this.L2 != null) {
                    m2();
                    return;
                }
                return;
            }
            if (i7 == org.telegram.messenger.ns.t2) {
                this.J3 = null;
                this.M3 = null;
                f2(4, true);
                return;
            }
            if (i7 != org.telegram.messenger.ns.R2) {
                if (i7 == org.telegram.messenger.ns.Y2) {
                    c2(true);
                    return;
                } else {
                    if (i7 == org.telegram.messenger.ns.f5 && this.l2 && (heVar = this.K0) != null) {
                        heVar.setLocked(!org.telegram.messenger.m10.i(this.R).q());
                        return;
                    }
                    return;
                }
            }
            long longValue2 = ((Long) objArr[0]).longValue();
            TL_bots.BotMenuButton botMenuButton = (TL_bots.BotMenuButton) objArr[1];
            if (longValue2 == this.y3) {
                if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                    TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                    this.j0 = tL_botMenuButton.text;
                    this.k0 = tL_botMenuButton.url;
                    this.L6 = 3;
                } else if (this.X2) {
                    this.L6 = 2;
                } else {
                    this.L6 = 1;
                }
                V1(false);
                return;
            }
            return;
        }
        if (((Integer) objArr[0]).intValue() != this.o3) {
            return;
        }
        this.Q1 = 0L;
        Object obj = objArr[1];
        if (obj instanceof org.telegram.messenger.g20) {
            org.telegram.messenger.g20 g20Var = (org.telegram.messenger.g20) obj;
            this.M3 = g20Var;
            String str = (String) objArr[2];
            this.K3 = str;
            ArrayList<Bitmap> arrayList2 = (ArrayList) objArr[3];
            this.Q1 = g20Var.r;
            i61 i61Var = this.g1;
            if (i61Var != null) {
                i61Var.setVideoPath(str);
                this.g1.setKeyframes(arrayList2);
                this.g1.setVisibility(0);
                this.g1.setMinProgressDiff(1000.0f / this.M3.r);
                K0();
            }
            f2(3, true);
            N(false);
            return;
        }
        this.J3 = (TLRPC.TL_document) obj;
        this.K3 = (String) objArr[2];
        boolean z10 = objArr.length >= 4 && ((Boolean) objArr[3]).booleanValue();
        float floatValue = objArr.length >= 5 ? ((Float) objArr[4]).floatValue() : 0.0f;
        float floatValue2 = objArr.length >= 6 ? ((Float) objArr[5]).floatValue() : 1.0f;
        if (this.J3 == null) {
            cg cgVar = this.H3;
            if (cgVar != null) {
                cgVar.M(null, true, 0, 0, 0L);
                return;
            }
            return;
        }
        a0();
        if (this.f1 == null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.out = true;
        tL_message.id = 0;
        tL_message.peer_id = new TLRPC.TL_peerUser();
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_message.from_id = tL_peerUser;
        TLRPC.Peer peer = tL_message.peer_id;
        long e10 = org.telegram.messenger.m10.i(this.R).e();
        tL_peerUser.user_id = e10;
        peer.user_id = e10;
        tL_message.date = (int) (System.currentTimeMillis() / 1000);
        tL_message.message = "";
        tL_message.attachPath = this.K3;
        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
        tL_message.media = tL_messageMediaDocument;
        tL_messageMediaDocument.flags |= 3;
        tL_messageMediaDocument.document = this.J3;
        tL_message.flags |= 768;
        this.L3 = new org.telegram.messenger.gj(org.telegram.messenger.m10.t0, tL_message, false, true);
        this.f1.setAlpha(1.0f);
        this.f1.setVisibility(0);
        this.h1.setVisibility(0);
        this.h1.setAlpha(0.0f);
        this.h1.setScaleY(0.0f);
        this.h1.setScaleX(0.0f);
        int i14 = 0;
        while (true) {
            if (i14 >= this.J3.attributes.size()) {
                d = 0.0d;
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = this.J3.attributes.get(i14);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                d = documentAttribute.duration;
                break;
            }
            i14++;
        }
        int i15 = 0;
        while (true) {
            if (i15 >= this.J3.attributes.size()) {
                bArr = null;
                break;
            }
            TLRPC.DocumentAttribute documentAttribute2 = this.J3.attributes.get(i15);
            if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                byte[] bArr2 = documentAttribute2.waveform;
                if (bArr2 == null || bArr2.length == 0) {
                    documentAttribute2.waveform = MediaController.getWaveform(this.K3);
                }
                bArr = documentAttribute2.waveform;
            } else {
                i15++;
            }
        }
        if (z10 && (zdVar = this.Z1) != null) {
            this.d2 = 0.0f;
            zdVar.setAlpha(0.0f);
            zdVar.setScaleX(0.0f);
            zdVar.setScaleY(0.0f);
        }
        this.Q1 = (long) (1000.0d * d);
        oi0 oi0Var = this.i1;
        String str2 = this.K3;
        if (!oi0Var.T) {
            oi0Var.r = (float) d;
            oi0Var.s = floatValue;
            oi0Var.w = floatValue2;
            oi0Var.x = false;
            oi0Var.h.t(org.telegram.messenger.g0.g0((int) Math.round(Math.max(1.0d, d)), false, false), false, true);
            oi0Var.f.a(false, false);
            if (oi0Var.n == null) {
                u51 u51Var = new u51();
                oi0Var.n = u51Var;
                u51Var.K = new org.telegram.messenger.ou(oi0Var, 10);
            }
            oi0Var.n.j0(Uri.fromFile(new File(str2)), "other");
            oi0Var.i(false);
            oi0Var.L = 0;
            oi0Var.M = bArr;
            Bitmap bitmap = oi0Var.T0;
            if (bitmap != null) {
                bitmap.recycle();
                oi0Var.T0 = null;
            }
            oi0Var.W0 = null;
            oi0Var.X0 = false;
            oi0Var.Q0 = -1;
            oi0Var.J0.a();
            oi0Var.I0.a();
            oi0Var.invalidate();
        }
        N(false);
        if (z10) {
            c0();
            d0();
            a0();
            this.e3 = 1;
            this.v2.f(false);
            this.d4.set(this.v2, Float.valueOf(1.0f));
            gg ggVar = this.w2;
            if (ggVar != null) {
                ggVar.setVisibility(0);
                this.w2.setAlpha(1.0f);
            }
        }
        f2(3, !z10);
        if (!z10 || !c8.z0.c() || this.G2 || this.J3 == null) {
            return;
        }
        p0().s();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        oi0 oi0Var;
        sf sfVar = this.V0;
        if (sfVar != null && sfVar.getVisibility() == 0 && this.V0.getStickersExpandOffset() != 0.0f) {
            canvas.save();
            canvas.clipRect(0, org.telegram.messenger.g0.L(2.0f), getMeasuredWidth(), getMeasuredHeight());
            canvas.translate(0.0f, -this.V0.getStickersExpandOffset());
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        super.dispatchDraw(canvas);
        if (!this.C1 || (oi0Var = this.i1) == null || oi0Var.getTrimProgress() <= 0.0f) {
            return;
        }
        int[] iArr = this.m5;
        getLocationInWindow(iArr);
        float f10 = iArr[0];
        float f11 = iArr[1];
        m0(this, canvas, f10, f11, f11, 100000.0f);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        View view2 = this.o2;
        ud udVar = this.h2;
        boolean z10 = view == view2 || view == udVar;
        if (z10) {
            float measuredHeight = getMeasuredHeight() - this.E6.f;
            canvas.save();
            if (view == udVar) {
                canvas.clipRect(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
            }
            if (view == this.o2) {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
            }
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (z10) {
            canvas.restore();
        }
        return drawChild;
    }

    @Override // org.telegram.ui.Components.pw0
    public final void e(TextWatcher textWatcher) {
        xe xeVar = this.F0;
        if (xeVar != null) {
            xeVar.addTextChangedListener(textWatcher);
            return;
        }
        if (this.Z5 == null) {
            this.Z5 = new ArrayList();
        }
        this.Z5.add(textWatcher);
    }

    public final void e0() {
        if (this.r2 != null || this.x3 == null) {
            return;
        }
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.input_calendar1).mutate();
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.input_calendar2).mutate();
        int i7 = org.telegram.ui.ActionBar.j6.Nl;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.e6 e6Var = this.E4;
        org.telegram.ui.ActionBar.q6.x(this, mutate, i7, e6Var, mode);
        org.telegram.ui.ActionBar.q6.x(this, mutate2, org.telegram.ui.ActionBar.j6.ag, e6Var, mode);
        fq fqVar = new fq(mutate, mutate2);
        je jeVar = new je(this, getContext());
        this.r2 = jeVar;
        jeVar.setImageDrawable(fqVar);
        this.r2.setVisibility(8);
        this.r2.setContentDescription(org.telegram.messenger.hd.M0(2131745848, null));
        this.r2.setScaleType(ImageView.ScaleType.CENTER);
        je jeVar2 = this.r2;
        int i10 = org.telegram.ui.ActionBar.j6.i6;
        org.telegram.ui.ActionBar.q6.Q(jeVar2, org.telegram.ui.ActionBar.j6.h0(u0(i10), 1, -1), null, org.telegram.ui.ActionBar.q6.M(i10), e6Var);
        this.g2.addView(this.r2, 2, c8.ja.e(44, 44, 85));
        this.r2.setOnClickListener(new xc(this, 5));
        this.r2.setTranslationX(0.0f);
    }

    public final void e1() {
        E1(false, true, false, true);
        L1(0, 0, false, true);
        if (getEditField() != null && !TextUtils.isEmpty(getEditField().getText())) {
            getEditField().setText("");
        }
        this.n3 = false;
        fe feVar = this.c1;
        if (feVar != null) {
            feVar.setVisibility(0);
        }
        this.S2 = true;
        K0();
        C();
        B0();
        gg ggVar = this.w2;
        if (ggVar != null) {
            ggVar.setVisibility(8);
        }
        RecordCircle recordCircle = this.v2;
        if (recordCircle != null) {
            recordCircle.g();
        }
    }

    public final void e2(TLRPC.Chat chat, TLRPC.UserFull userFull) {
        sf sfVar;
        this.B0 = false;
        boolean z10 = true;
        this.b = true;
        this.A0 = true;
        this.y0 = true;
        this.z0 = true;
        if (chat != null) {
            this.b1 = (org.telegram.messenger.t3.v(chat) || (org.telegram.messenger.t3.s(chat) && this.M2)) ? false : true;
            this.b = org.telegram.messenger.t3.t(chat);
            boolean q10 = org.telegram.messenger.t3.q(chat);
            this.A0 = q10;
            boolean z11 = (this.b || q10) ? false : true;
            this.B0 = z11;
            this.n = z11 ? 0.5f : 1.0f;
            Z1();
            if (!this.B0 && (sfVar = this.V0) != null) {
                sfVar.L(-this.y3, !this.A0, !this.b);
            }
            this.y0 = org.telegram.messenger.t3.s(chat);
            this.z0 = org.telegram.messenger.t3.v(chat);
        } else if (userFull != null) {
            this.b1 = userFull.voice_messages_forbidden;
            this.L = userFull;
        }
        float f10 = this.b1 ? 0.5f : 1.0f;
        ee eeVar = this.a1;
        eeVar.setAlpha(f10);
        eeVar.invalidate();
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.b1 ? u0(org.telegram.ui.ActionBar.j6.Nl) : -1, PorterDuff.Mode.SRC_IN);
        fe feVar = this.c1;
        feVar.setColorFilter(porterDuffColorFilter);
        feVar.invalidate();
        a2(false);
        boolean z12 = this.d1;
        if (!this.y0 && z12) {
            z12 = false;
        }
        if (this.z0 || z12) {
            z10 = z12;
        } else if (!this.M2) {
            z10 = false;
        }
        B1(z10, false);
    }

    public final void f0() {
        if (this.q0 != null || getContext() == null) {
            return;
        }
        gn0 gn0Var = new gn0(getContext());
        ImageReceiver imageReceiver = new ImageReceiver(gn0Var);
        gn0Var.a = imageReceiver;
        gn0Var.b = new t8((org.telegram.ui.ActionBar.e6) null);
        gn0Var.d = new Paint(1);
        Paint paint = new Paint(1);
        gn0Var.e = paint;
        imageReceiver.J0(org.telegram.messenger.g0.L(28.0f));
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        gn0Var.updateColors();
        gn0Var.setContentDescription(org.telegram.messenger.hd.a0("AccDescrSendAsPeer", null, 2131754775, ""));
        this.q0 = gn0Var;
        gn0Var.setOnClickListener(new xc(this, 18));
        this.q0.setVisibility(8);
        this.g2.addView(this.q0, c8.ja.d(36, 36.0f, 83, 4.66f, 4.0f, 4.66f, 4.0f));
    }

    public final void f1() {
        if (this.C1 || this.L1 != null) {
            org.telegram.messenger.g0.r(this.P1);
            ValueAnimator valueAnimator = this.O1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.O1 = null;
            }
            yh.a aVar = this.L1;
            if (aVar != null) {
                if (aVar.c.hasFocus()) {
                    org.telegram.messenger.g0.v1(this.L1.c);
                    this.L1.c.clearFocus();
                }
                this.L1.setCollapsing(true);
            }
            this.M1 = false;
            this.J5 = false;
            z1(false);
            u(0.0f);
            oi0 oi0Var = this.i1;
            if (oi0Var != null) {
                oi0Var.setVisibility(8);
            }
            fh0 fh0Var = this.h1;
            if (fh0Var != null) {
                fh0Var.setVisibility(0);
            }
            gg ggVar = this.w2;
            if (ggVar != null) {
                this.K5 = 0.0f;
                ggVar.setTranslationY(this.L5);
            }
            he heVar = this.K0;
            if (heVar != null) {
                heVar.setIconDimmed(false);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:164:0x1211  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v60 */
    /* JADX WARN: Type inference failed for: r11v61, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v63 */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f2(int i7, boolean z10) {
        boolean z11;
        char c10;
        lg lgVar;
        int i10;
        char c11;
        float f10;
        int i11;
        ?? r11;
        boolean z12;
        int i12;
        char c12;
        ValueAnimator valueAnimator;
        boolean z13;
        boolean z14;
        int i13;
        char c13;
        int i14;
        char c14;
        lg lgVar2;
        int i15;
        boolean z15;
        float f11;
        ?? r112;
        int i16;
        float f12;
        int i17;
        char c15;
        char c16;
        ViewGroup viewGroup;
        ViewGroup.LayoutParams layoutParams;
        int i18;
        char c17;
        char c18;
        float f13;
        hi.l lVar;
        ng ngVar = ng.a;
        ng ngVar2 = ng.b;
        Float valueOf = Float.valueOf(0.0f);
        this.A1 = SystemClock.uptimeMillis() + 1500;
        p2(i7);
        Runnable runnable = this.g0;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.g0 = null;
        }
        RecordCircle recordCircle = this.v2;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
        boolean z16 = this.n3;
        Property property = View.TRANSLATION_X;
        Property property2 = View.SCALE_X;
        Property property3 = View.SCALE_Y;
        Property property4 = View.ALPHA;
        if (z16) {
            if (this.e3 == 1) {
                this.l6 = i7;
                return;
            }
            boolean z17 = this.l6 == 3;
            if (!z17) {
                this.P = false;
                gg ggVar = this.w2;
                if (ggVar != null) {
                    lVar = ggVar.E;
                    lVar.d(1, false, false);
                }
                org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(this.R);
                long j3 = this.y3;
                org.telegram.ui.an anVar = this.x3;
                b02.e2(j3, (anVar == null || !anVar.w4) ? 0L : anVar.b(), this.P);
                this.Q1 = 0L;
            }
            a0();
            this.e3 = 1;
            sf sfVar = this.V0;
            if (sfVar != null) {
                sfVar.setEnabled(false);
            }
            try {
                if (this.Y2 == null) {
                    PowerManager.WakeLock newWakeLock = ((PowerManager) org.telegram.messenger.t0.b.getSystemService("power")).newWakeLock(536870918, "telegram:audio_record_lock");
                    this.Y2 = newWakeLock;
                    newWakeLock.acquire();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.f(e10);
            }
            org.telegram.messenger.g0.f2(this.w3);
            cg cgVar = this.H3;
            if (cgVar != null) {
                cgVar.a1(0);
            }
            AnimatorSet animatorSet = this.b3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.c3;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            d0();
            bi.v1 v1Var = this.e1;
            if (v1Var != null) {
                v1Var.setVisibility(0);
            }
            c0();
            RecordCircle recordCircle2 = this.v2;
            if (recordCircle2 != null) {
                recordCircle2.N = false;
                recordCircle2.setVisibility(0);
                this.v2.setAmplitude(0.0d);
            }
            gg ggVar2 = this.w2;
            if (ggVar2 != null) {
                ggVar2.setVisibility(0);
            }
            ig igVar = this.T1;
            if (igVar != null) {
                igVar.e();
                this.T1.d();
                this.T1.setScaleX(0.0f);
                this.T1.setScaleY(0.0f);
                this.T1.e = true;
            }
            this.b3 = new AnimatorSet();
            this.Z0.setTranslationX(org.telegram.messenger.g0.L(20.0f));
            this.Z0.setAlpha(0.0f);
            if (this.l6 != 3) {
                this.S1.setTranslationX(org.telegram.messenger.g0.L(20.0f));
                this.S1.setAlpha(0.0f);
                this.S1.setCancelToProgress(0.0f);
                this.S1.a();
                this.S1.setEnabled(true);
            } else {
                this.S1.setTranslationX(0.0f);
                this.S1.setAlpha(0.0f);
                this.S1.setCancelToProgress(1.0f);
                this.S1.setEnabled(true);
            }
            this.v2.f(this.l6 == 3);
            this.S2 = false;
            K0();
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.R0, this.H4, 0.0f), ObjectAnimator.ofFloat(this.R0, this.J4, 0.0f), ObjectAnimator.ofFloat(this.T1, (Property<ig, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.T1, (Property<ig, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.Z0, (Property<lg, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.Z0, (Property<lg, Float>) property4, 1.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.S1, (Property<SlideTextView, Float>) property, 0.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.S1, (Property<SlideTextView, Float>) property4, 1.0f));
            gg ggVar3 = this.w2;
            if (ggVar3 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(ggVar3, (Property<gg, Float>) property4, 1.0f));
            }
            if (this.c1 != null) {
                f13 = 0.0f;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.a1, (Property<ee, Float>) property4, 0.0f));
            } else {
                f13 = 0.0f;
            }
            ki.a0 a0Var = this.m0;
            if (a0Var != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(a0Var, (Property<ki.a0, Float>) property3, f13), ObjectAnimator.ofFloat(this.m0, (Property<ki.a0, Float>) property2, f13), ObjectAnimator.ofFloat(this.m0, (Property<ki.a0, Float>) property4, f13));
            }
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.playTogether(ObjectAnimator.ofFloat(this.F0, this.L4, org.telegram.messenger.g0.L(20.0f)), ObjectAnimator.ofFloat(this.F0, (Property<xe, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.f1, (Property<ud, Float>) property4, 1.0f));
            if (z17) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.i1, (Property<oi0, Float>) property4, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.h1, (Property<fh0, Float>) property4, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.h1, (Property<fh0, Float>) property2, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.h1, (Property<fh0, Float>) property3, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.g1, (Property<i61, Float>) property4, 0.0f));
            }
            if (this.r2 != null) {
                animatorSet4.playTogether(n(org.telegram.messenger.g0.L(30.0f)), ObjectAnimator.ofFloat(this.r2, (Property<je, Float>) property4, 0.0f));
            }
            org.telegram.ui.z51 z51Var = this.X1;
            if (z51Var != null) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(z51Var, this.K4, org.telegram.messenger.g0.L(30.0f)), ObjectAnimator.ofFloat(this.X1, this.I4, 0.0f));
                ViewPropertyAnimator viewPropertyAnimator = this.Y1;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    this.Y1 = null;
                }
                zd zdVar = this.Z1;
                this.d2 = 0.0f;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(zdVar, (Property<zd, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.Z1, (Property<zd, Float>) property2, 0.5f), ObjectAnimator.ofFloat(this.Z1, (Property<zd, Float>) property3, 0.5f));
            }
            lh.h hVar = this.D6;
            if (hVar != null) {
                hVar.e(0, false, true);
            }
            this.b3.playTogether(animatorSet3.setDuration(150L), animatorSet4.setDuration(150L), ObjectAnimator.ofFloat(this.v2, this.c4, 1.0f).setDuration(300L));
            if (!z17) {
                this.b3.playTogether(ObjectAnimator.ofFloat(this.v2, this.d4, 1.0f).setDuration(300L));
            }
            this.b3.addListener(new kf(this, z17));
            this.b3.setInterpolator(new DecelerateInterpolator());
            this.b3.start();
            this.Z0.a(this.Q1);
        } else {
            if (this.S2 && i7 == 3) {
                return;
            }
            PowerManager.WakeLock wakeLock = this.Y2;
            if (wakeLock != null) {
                try {
                    wakeLock.release();
                    this.Y2 = null;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.f(e11);
                }
            }
            org.telegram.messenger.g0.P3(this.w3);
            this.U3 = false;
            if (this.e3 == 0) {
                this.l6 = i7;
                return;
            }
            this.S.b().C4(this.y3, getThreadMessageId());
            this.e3 = 0;
            sf sfVar2 = this.V0;
            if (sfVar2 != null) {
                sfVar2.setEnabled(true);
            }
            AnimatorSet animatorSet5 = this.b3;
            if (animatorSet5 != null) {
                z11 = animatorSet5.isRunning();
                fe feVar = this.c1;
                if (feVar != null) {
                    feVar.setScaleX(1.0f);
                    this.c1.setScaleY(1.0f);
                }
                this.b3.removeAllListeners();
                this.b3.cancel();
            } else {
                z11 = false;
            }
            AnimatorSet animatorSet6 = this.c3;
            if (animatorSet6 != null) {
                animatorSet6.cancel();
            }
            xe xeVar = this.F0;
            if (xeVar != null) {
                xeVar.setVisibility(0);
            }
            this.b3 = new AnimatorSet();
            int i19 = 8;
            if (z11) {
                c10 = 7;
            } else if (i7 == 4) {
                c10 = 7;
            } else {
                if (i7 == 3) {
                    a0();
                    c0();
                    r(z10);
                    SlideTextView slideTextView = this.S1;
                    if (slideTextView != null) {
                        slideTextView.setEnabled(false);
                    }
                    if (F0()) {
                        oi0 oi0Var = this.i1;
                        if (oi0Var != null) {
                            oi0Var.setVisibility(8);
                        }
                        ud udVar = this.f1;
                        if (udVar != null) {
                            udVar.setAlpha(1.0f);
                            this.f1.setVisibility(0);
                        }
                        fh0 fh0Var = this.h1;
                        if (fh0Var != null) {
                            fh0Var.setProgress(0.0f);
                            this.h1.i();
                        }
                        f12 = 1.0f;
                        c15 = '\t';
                    } else {
                        i61 i61Var = this.g1;
                        if (i61Var != null) {
                            i61Var.setVisibility(8);
                            K0();
                        }
                        ud udVar2 = this.f1;
                        if (udVar2 != null) {
                            i17 = 0;
                            udVar2.setVisibility(0);
                            f12 = 1.0f;
                            c15 = '\t';
                            this.f1.setAlpha(1.0f);
                        } else {
                            f12 = 1.0f;
                            i17 = 0;
                            c15 = '\t';
                        }
                        oi0 oi0Var2 = this.i1;
                        if (oi0Var2 != null) {
                            oi0Var2.setVisibility(i17);
                            this.i1.setAlpha(0.0f);
                        }
                    }
                    this.a5 = true;
                    this.V4 = f12;
                    this.T4 = this.S4;
                    this.R4 = f12;
                    SlideTextView slideTextView2 = this.S1;
                    if (slideTextView2 != null) {
                        slideTextView2.setCancelToProgress(f12);
                    }
                    gg ggVar4 = this.w2;
                    if (ggVar4 != null) {
                        ggVar4.invalidate();
                    }
                    fh0 fh0Var2 = this.h1;
                    if (fh0Var2 != null) {
                        fh0Var2.setAlpha(0.0f);
                        this.h1.setScaleX(0.0f);
                        this.h1.setScaleY(0.0f);
                        this.h1.setProgress(0.0f);
                        this.h1.i();
                    }
                    if (F0() || this.R5) {
                        c16 = 7;
                        this.g1.setVisibility(0);
                        viewGroup = null;
                        layoutParams = null;
                    } else {
                        viewGroup = (ViewGroup) this.f1.getParent();
                        layoutParams = this.f1.getLayoutParams();
                        viewGroup.removeView(this.f1);
                        c16 = 7;
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(viewGroup.getMeasuredWidth() - (this.H2 == null ? i5.c.d(44.0f, this.K0.l(), 0) : 0), org.telegram.messenger.g0.L(44.0f));
                        layoutParams2.gravity = 80;
                        layoutParams2.leftMargin = org.telegram.messenger.g0.L(7.0f);
                        layoutParams2.rightMargin = org.telegram.messenger.g0.L(7.0f);
                        this.U1.addView(this.f1, layoutParams2);
                        this.g1.setVisibility(8);
                    }
                    K0();
                    AnimatorSet animatorSet7 = new AnimatorSet();
                    if (z10) {
                        this.i1.setAllowDraw(false);
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new gd(this, 6));
                        ofFloat.addListener(new lf(this));
                        ViewGroup viewGroup2 = viewGroup;
                        ofFloat.setDuration(F0() ? 490L : this.C1 ? 560L : 580L);
                        if (this.C1 && !F0()) {
                            ofFloat.setInterpolator(new LinearInterpolator());
                        }
                        AnimatorSet animatorSet8 = new AnimatorSet();
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.T1, (Property<ig, Float>) property3, 0.0f);
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.T1, (Property<ig, Float>) property2, 0.0f);
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.Z0, (Property<lg, Float>) property4, 0.0f);
                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.Z0, (Property<lg, Float>) property, -org.telegram.messenger.g0.L(20.0f));
                        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.S1, (Property<SlideTextView, Float>) property4, 0.0f);
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.h1, (Property<fh0, Float>) property4, 1.0f);
                        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.h1, (Property<fh0, Float>) property3, 1.0f);
                        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.h1, (Property<fh0, Float>) property2, 1.0f);
                        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this.R0, this.H4, 0.0f);
                        ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(this.R0, this.J4, 0.0f);
                        ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(this.F0, (Property<xe, Float>) property4, 0.0f);
                        Animator[] animatorArr = new Animator[11];
                        animatorArr[0] = ofFloat2;
                        animatorArr[1] = ofFloat3;
                        animatorArr[2] = ofFloat4;
                        animatorArr[3] = ofFloat5;
                        animatorArr[4] = ofFloat6;
                        animatorArr[5] = ofFloat7;
                        animatorArr[6] = ofFloat8;
                        animatorArr[c16] = ofFloat9;
                        animatorArr[8] = ofFloat10;
                        animatorArr[c15] = ofFloat11;
                        animatorArr[10] = ofFloat12;
                        animatorSet8.playTogether(animatorArr);
                        fh0 fh0Var3 = this.h1;
                        if (fh0Var3 != null) {
                            fh0Var3.setAlpha(0.0f);
                            this.h1.setScaleX(0.0f);
                            this.h1.setScaleY(0.0f);
                        }
                        if (this.c1 != null) {
                            i18 = 1;
                            animatorSet8.playTogether(ObjectAnimator.ofFloat(this.a1, (Property<ee, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.a1, (Property<ee, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.a1, (Property<ee, Float>) property3, 1.0f));
                            this.c1.j(F0() ? ngVar2 : ngVar, true);
                        } else {
                            i18 = 1;
                        }
                        ki.a0 a0Var2 = this.m0;
                        if (a0Var2 != null) {
                            float[] fArr = new float[i18];
                            fArr[0] = 0.0f;
                            ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(a0Var2, (Property<ki.a0, Float>) property4, fArr);
                            ki.a0 a0Var3 = this.m0;
                            float[] fArr2 = new float[i18];
                            fArr2[0] = 0.0f;
                            ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(a0Var3, (Property<ki.a0, Float>) property2, fArr2);
                            ki.a0 a0Var4 = this.m0;
                            float[] fArr3 = new float[i18];
                            fArr3[0] = 0.0f;
                            ObjectAnimator ofFloat15 = ObjectAnimator.ofFloat(a0Var4, (Property<ki.a0, Float>) property3, fArr3);
                            Animator[] animatorArr2 = new Animator[3];
                            animatorArr2[0] = ofFloat13;
                            animatorArr2[i18] = ofFloat14;
                            animatorArr2[2] = ofFloat15;
                            animatorSet8.playTogether(animatorArr2);
                        }
                        animatorSet8.addListener(new ie(this, i19));
                        boolean z18 = this.C1 && !F0();
                        animatorSet8.setDuration(z18 ? 120L : 150L);
                        animatorSet8.setStartDelay(z18 ? 0L : 150L);
                        if (F0()) {
                            this.g1.setAlpha(0.0f);
                            c17 = 1;
                            c18 = 0;
                            animatorSet7.playTogether(ObjectAnimator.ofFloat(this.g1, (Property<i61, Float>) property4, 1.0f));
                            animatorSet7.setDuration(150L);
                            animatorSet7.setStartDelay(430L);
                        } else {
                            c17 = 1;
                            c18 = 0;
                        }
                        AnimatorSet animatorSet9 = this.b3;
                        Animator[] animatorArr3 = new Animator[3];
                        animatorArr3[c18] = animatorSet8;
                        animatorArr3[c17] = ofFloat;
                        animatorArr3[2] = animatorSet7;
                        animatorSet9.playTogether(animatorArr3);
                        this.b3.addListener(new fi.c3(this, viewGroup2, layoutParams, 3));
                    } else {
                        d0();
                        this.c4.set(this.v2, Float.valueOf(1.0f));
                        this.v2.setTransformToSeekbar(1.0f);
                        if (!F0()) {
                            float f14 = this.X4;
                            if (f14 != 0.0f && this.i1 != null) {
                                float interpolation = er.j.getInterpolation(Math.max(0.0f, ((f14 - 0.38f) - 0.25f) / 0.37f));
                                oi0 oi0Var3 = this.i1;
                                if (this.C1) {
                                    interpolation = 1.0f;
                                }
                                oi0Var3.setAlpha(interpolation);
                                this.i1.invalidate();
                            }
                        }
                        this.T1.setScaleY(0.0f);
                        this.T1.setScaleX(0.0f);
                        this.Z0.setAlpha(0.0f);
                        this.Z0.setTranslationX(-org.telegram.messenger.g0.L(20.0f));
                        this.S1.setAlpha(0.0f);
                        this.h1.setAlpha(1.0f);
                        this.h1.setScaleY(1.0f);
                        this.h1.setScaleX(1.0f);
                        this.H4.set(this.R0, valueOf);
                        this.J4.set(this.R0, valueOf);
                        this.F0.setAlpha(0.0f);
                        fe feVar2 = this.c1;
                        if (feVar2 != null) {
                            if (F0()) {
                                ngVar = ngVar2;
                            }
                            feVar2.j(ngVar, z10);
                            this.a1.setAlpha(1.0f);
                            this.a1.setScaleX(1.0f);
                            this.a1.setScaleY(1.0f);
                        }
                        ki.a0 a0Var5 = this.m0;
                        if (a0Var5 != null) {
                            a0Var5.setAlpha(0.0f);
                            this.m0.setScaleX(0.0f);
                            this.m0.setScaleY(0.0f);
                        }
                        if (F0()) {
                            this.g1.setAlpha(1.0f);
                        }
                        if (viewGroup != null) {
                            this.U1.removeView(this.f1);
                            viewGroup.addView(this.f1, layoutParams);
                        }
                        this.f1.setAlpha(1.0f);
                        this.i1.setAlpha(1.0f);
                        this.h = 0.0f;
                        this.n = 0.0f;
                        Z1();
                        K0();
                    }
                } else {
                    int i20 = 9;
                    if (i7 == 2 || i7 == 5) {
                        fe feVar3 = this.c1;
                        if (feVar3 != null) {
                            feVar3.setVisibility(0);
                        }
                        this.S2 = true;
                        K0();
                        ValueAnimator b03 = b0();
                        AnimatorSet animatorSet10 = new AnimatorSet();
                        if (b03 == null) {
                            c12 = 0;
                            i12 = 1;
                            animatorSet10.playTogether(ObjectAnimator.ofFloat(this.R0, this.H4, 1.0f), ObjectAnimator.ofFloat(this.R0, this.J4, this.B0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.T1, (Property<ig, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.T1, (Property<ig, Float>) property2, 0.0f));
                        } else {
                            i12 = 1;
                            c12 = 0;
                        }
                        gg ggVar5 = this.w2;
                        int i21 = i12;
                        if (ggVar5 != null) {
                            float[] fArr4 = new float[i21];
                            fArr4[c12] = 0.0f;
                            ObjectAnimator ofFloat16 = ObjectAnimator.ofFloat(ggVar5, (Property<gg, Float>) property4, fArr4);
                            ofFloat16.setDuration(160L);
                            ofFloat16.setInterpolator(er.g);
                            AnimatorSet animatorSet11 = this.b3;
                            Animator[] animatorArr4 = new Animator[i21];
                            animatorArr4[c12] = ofFloat16;
                            animatorSet11.playTogether(animatorArr4);
                            this.w2.f();
                        }
                        ki.a0 a0Var6 = this.m0;
                        if (a0Var6 != null) {
                            float[] fArr5 = new float[i21];
                            fArr5[c12] = 1.0f;
                            ObjectAnimator ofFloat17 = ObjectAnimator.ofFloat(a0Var6, (Property<ki.a0, Float>) property3, fArr5);
                            ki.a0 a0Var7 = this.m0;
                            float[] fArr6 = new float[i21];
                            fArr6[c12] = 1.0f;
                            ObjectAnimator ofFloat18 = ObjectAnimator.ofFloat(a0Var7, (Property<ki.a0, Float>) property2, fArr6);
                            ki.a0 a0Var8 = this.m0;
                            float[] fArr7 = new float[i21];
                            fArr7[c12] = 1.0f;
                            ObjectAnimator ofFloat19 = ObjectAnimator.ofFloat(a0Var8, (Property<ki.a0, Float>) property4, fArr7);
                            Animator[] animatorArr5 = new Animator[3];
                            animatorArr5[c12] = ofFloat17;
                            animatorArr5[i21] = ofFloat18;
                            animatorArr5[2] = ofFloat19;
                            animatorSet10.playTogether(animatorArr5);
                        }
                        AnimatorSet animatorSet12 = new AnimatorSet();
                        if (b03 != null) {
                            SlideTextView slideTextView3 = this.S1;
                            float[] fArr8 = new float[i21];
                            fArr8[c12] = 0.0f;
                            ObjectAnimator ofFloat20 = ObjectAnimator.ofFloat(slideTextView3, (Property<SlideTextView, Float>) property4, fArr8);
                            Animator[] animatorArr6 = new Animator[i21];
                            animatorArr6[c12] = ofFloat20;
                            animatorSet12.playTogether(animatorArr6);
                            valueAnimator = b03;
                        } else {
                            lg lgVar3 = this.Z0;
                            float[] fArr9 = new float[i21];
                            fArr9[c12] = 0.0f;
                            ObjectAnimator ofFloat21 = ObjectAnimator.ofFloat(lgVar3, (Property<lg, Float>) property4, fArr9);
                            lg lgVar4 = this.Z0;
                            float[] fArr10 = new float[i21];
                            fArr10[c12] = -org.telegram.messenger.g0.L(20.0f);
                            ObjectAnimator ofFloat22 = ObjectAnimator.ofFloat(lgVar4, (Property<lg, Float>) property, fArr10);
                            SlideTextView slideTextView4 = this.S1;
                            float[] fArr11 = new float[i21];
                            fArr11[c12] = 0.0f;
                            ObjectAnimator ofFloat23 = ObjectAnimator.ofFloat(slideTextView4, (Property<SlideTextView, Float>) property4, fArr11);
                            SlideTextView slideTextView5 = this.S1;
                            valueAnimator = b03;
                            float[] fArr12 = new float[1];
                            fArr12[c12] = -org.telegram.messenger.g0.L(20.0f);
                            ObjectAnimator ofFloat24 = ObjectAnimator.ofFloat(slideTextView5, (Property<SlideTextView, Float>) property, fArr12);
                            Animator[] animatorArr7 = new Animator[4];
                            animatorArr7[c12] = ofFloat21;
                            animatorArr7[1] = ofFloat22;
                            animatorArr7[2] = ofFloat23;
                            animatorArr7[3] = ofFloat24;
                            animatorSet12.playTogether(animatorArr7);
                        }
                        if (i7 != 5) {
                            this.a1.setScaleX(0.0f);
                            this.a1.setScaleY(0.0f);
                            zd zdVar2 = this.Z1;
                            if (zdVar2 != null && zdVar2.getVisibility() == 0) {
                                this.Z1.setScaleX(0.5f);
                                this.Z1.setScaleY(0.5f);
                            }
                            zd zdVar3 = this.f2;
                            if (zdVar3 != null && zdVar3.getVisibility() == 0) {
                                this.f2.setScaleX(0.0f);
                                this.f2.setScaleY(0.0f);
                            }
                            animatorSet10.playTogether(ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f), ObjectAnimator.ofFloat(this.a1, (Property<ee, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.a1, (Property<ee, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.a1, (Property<ee, Float>) property4, 1.0f));
                            if (this.X1 != null) {
                                ViewPropertyAnimator viewPropertyAnimator2 = this.Y1;
                                if (viewPropertyAnimator2 != null) {
                                    viewPropertyAnimator2.cancel();
                                    this.Y1 = null;
                                }
                                i15 = 1;
                                animatorSet10.playTogether(ObjectAnimator.ofFloat(this.X1, this.I4, 1.0f), ObjectAnimator.ofFloat(this.X1, this.K4, 0.0f));
                                zd zdVar4 = this.Z1;
                                this.d2 = 1.0f;
                                z15 = false;
                                animatorSet10.playTogether(ObjectAnimator.ofFloat(zdVar4, (Property<zd, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.Z1, (Property<zd, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.Z1, (Property<zd, Float>) property3, 1.0f));
                            } else {
                                i15 = 1;
                                z15 = false;
                            }
                            lh.h hVar2 = this.D6;
                            boolean z19 = z15;
                            if (hVar2 != null) {
                                hVar2.e(z19 ? 1 : 0, z19, i15);
                            }
                            zd zdVar5 = this.f2;
                            if (zdVar5 != null) {
                                float[] fArr13 = new float[i15];
                                fArr13[z19 ? 1 : 0] = 1.0f;
                                ObjectAnimator ofFloat25 = ObjectAnimator.ofFloat(zdVar5, (Property<zd, Float>) property2, fArr13);
                                zd zdVar6 = this.f2;
                                float[] fArr14 = new float[i15];
                                fArr14[z19 ? 1 : 0] = 1.0f;
                                ObjectAnimator ofFloat26 = ObjectAnimator.ofFloat(zdVar6, (Property<zd, Float>) property3, fArr14);
                                Animator[] animatorArr8 = new Animator[2];
                                animatorArr8[z19 ? 1 : 0] = ofFloat25;
                                animatorArr8[i15] = ofFloat26;
                                animatorSet10.playTogether(animatorArr8);
                            }
                            if (this.c1 != null) {
                                ee eeVar = this.a1;
                                float[] fArr15 = new float[i15];
                                fArr15[z19 ? 1 : 0] = 1.0f;
                                ObjectAnimator ofFloat27 = ObjectAnimator.ofFloat(eeVar, (Property<ee, Float>) property4, fArr15);
                                Animator[] animatorArr9 = new Animator[i15];
                                animatorArr9[z19 ? 1 : 0] = ofFloat27;
                                animatorSet10.playTogether(animatorArr9);
                                ee eeVar2 = this.a1;
                                float[] fArr16 = new float[i15];
                                fArr16[z19 ? 1 : 0] = 1.0f;
                                ObjectAnimator ofFloat28 = ObjectAnimator.ofFloat(eeVar2, (Property<ee, Float>) property2, fArr16);
                                Animator[] animatorArr10 = new Animator[i15];
                                animatorArr10[z19 ? 1 : 0] = ofFloat28;
                                animatorSet10.playTogether(animatorArr10);
                                ee eeVar3 = this.a1;
                                float[] fArr17 = new float[i15];
                                fArr17[z19 ? 1 : 0] = 1.0f;
                                ObjectAnimator ofFloat29 = ObjectAnimator.ofFloat(eeVar3, (Property<ee, Float>) property3, fArr17);
                                Animator[] animatorArr11 = new Animator[i15];
                                animatorArr11[z19 ? 1 : 0] = ofFloat29;
                                animatorSet10.playTogether(animatorArr11);
                                this.c1.j(F0() ? ngVar2 : ngVar, i15);
                            }
                            je jeVar = this.r2;
                            if (jeVar != null) {
                                float[] fArr18 = new float[i15];
                                fArr18[0] = 1.0f;
                                ObjectAnimator ofFloat30 = ObjectAnimator.ofFloat(jeVar, (Property<je, Float>) property4, fArr18);
                                ValueAnimator n10 = n(0.0f);
                                Animator[] animatorArr12 = new Animator[2];
                                animatorArr12[0] = ofFloat30;
                                animatorArr12[i15] = n10;
                                animatorSet10.playTogether(animatorArr12);
                            }
                        } else {
                            AnimatorSet animatorSet13 = new AnimatorSet();
                            if (i7 != 5) {
                                animatorSet13.playTogether(ObjectAnimator.ofFloat(this.a1, (Property<ee, Float>) property4, 1.0f));
                            }
                            if (this.X1 != null) {
                                ViewPropertyAnimator viewPropertyAnimator3 = this.Y1;
                                if (viewPropertyAnimator3 != null) {
                                    viewPropertyAnimator3.cancel();
                                    this.Y1 = null;
                                }
                                z13 = false;
                                z14 = true;
                                animatorSet13.playTogether(ObjectAnimator.ofFloat(this.X1, this.K4, 0.0f), ObjectAnimator.ofFloat(this.X1, this.I4, 1.0f));
                                zd zdVar7 = this.Z1;
                                this.d2 = 1.0f;
                                animatorSet13.playTogether(ObjectAnimator.ofFloat(zdVar7, (Property<zd, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.Z1, (Property<zd, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.Z1, (Property<zd, Float>) property3, 1.0f));
                            } else {
                                z13 = false;
                                z14 = true;
                            }
                            lh.h hVar3 = this.D6;
                            boolean z20 = z13;
                            int i22 = z14;
                            if (hVar3 != null) {
                                hVar3.e(z20 ? 1 : 0, z20, i22);
                            }
                            je jeVar2 = this.r2;
                            if (jeVar2 != null) {
                                float[] fArr19 = new float[i22];
                                fArr19[z20 ? 1 : 0] = 1.0f;
                                ObjectAnimator ofFloat31 = ObjectAnimator.ofFloat(jeVar2, (Property<je, Float>) property4, fArr19);
                                ValueAnimator n11 = n(0.0f);
                                Animator[] animatorArr13 = new Animator[2];
                                animatorArr13[z20 ? 1 : 0] = ofFloat31;
                                animatorArr13[i22] = n11;
                                animatorSet13.playTogether(animatorArr13);
                            }
                            animatorSet13.setDuration(150L);
                            animatorSet13.setStartDelay(110L);
                            animatorSet13.addListener(new ie(this, i20));
                            AnimatorSet animatorSet14 = this.b3;
                            Animator[] animatorArr14 = new Animator[i22];
                            animatorArr14[0] = animatorSet13;
                            animatorSet14.playTogether(animatorArr14);
                        }
                        animatorSet10.setDuration(150L);
                        animatorSet10.setStartDelay(this.w1 ? 0L : 700L);
                        animatorSet12.setDuration(this.w1 ? 110L : valueAnimator != null ? 140L : 200L);
                        animatorSet12.setStartDelay((this.w1 || valueAnimator != null) ? 0L : 200L);
                        if (valueAnimator == null || (lgVar2 = this.Z0) == null) {
                            i13 = 1;
                            c13 = 0;
                        } else {
                            lgVar2.animate().cancel();
                            this.Z0.setPivotX(0.0f);
                            this.Z0.setPivotY(r3.getHeight() / 2.0f);
                            AnimatorSet animatorSet15 = new AnimatorSet();
                            i13 = 1;
                            c13 = 0;
                            ObjectAnimator ofFloat32 = ObjectAnimator.ofFloat(this.Z0, (Property<lg, Float>) property4, 0.0f);
                            lg lgVar5 = this.Z0;
                            animatorSet15.playTogether(ofFloat32, ObjectAnimator.ofFloat(lgVar5, (Property<lg, Float>) property, lgVar5.getTranslationX() - org.telegram.messenger.g0.L(6.0f)), ObjectAnimator.ofFloat(this.Z0, (Property<lg, Float>) property2, 0.94f), ObjectAnimator.ofFloat(this.Z0, (Property<lg, Float>) property3, 0.94f));
                            animatorSet15.setDuration(140L);
                            animatorSet15.setInterpolator(er.g);
                            this.b3.playTogether(animatorSet15);
                        }
                        this.H = 0.0f;
                        d2();
                        xe xeVar2 = this.F0;
                        float[] fArr20 = new float[i13];
                        fArr20[c13] = 1.0f;
                        ObjectAnimator ofFloat33 = ObjectAnimator.ofFloat(xeVar2, (Property<xe, Float>) property4, fArr20);
                        ofFloat33.setStartDelay(this.w1 ? 110L : this.s == 1.0f ? 300L : 700L);
                        ofFloat33.setDuration(200L);
                        if (valueAnimator != null) {
                            ofFloat33.setStartDelay((long) Math.max(300.0f, this.E5 - 120.0f));
                            ofFloat33.setDuration(320L);
                            ofFloat33.setInterpolator(er.g);
                            i14 = 1;
                            c14 = 0;
                            this.b3.playTogether(valueAnimator);
                            AnimatorSet t22 = t2();
                            if (t22 != null) {
                                this.b3.playTogether(t22);
                            }
                        } else {
                            i14 = 1;
                            c14 = 0;
                        }
                        AnimatorSet animatorSet16 = this.b3;
                        float[] fArr21 = new float[i14];
                        fArr21[c14] = this.S4;
                        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "lockAnimatedTranslation", fArr21).setDuration(200L);
                        Animator[] animatorArr15 = new Animator[4];
                        animatorArr15[c14] = animatorSet10;
                        animatorArr15[i14] = animatorSet12;
                        animatorArr15[2] = ofFloat33;
                        animatorArr15[3] = duration;
                        animatorSet16.playTogether(animatorArr15);
                        if (i7 == 5) {
                            this.v2.a();
                            float[] fArr22 = new float[i14];
                            fArr22[c14] = 1.0f;
                            ObjectAnimator duration2 = ObjectAnimator.ofFloat(this, "slideToCancelProgress", fArr22).setDuration(200L);
                            duration2.setInterpolator(er.j);
                            AnimatorSet animatorSet17 = this.b3;
                            Animator[] animatorArr16 = new Animator[i14];
                            animatorArr16[c14] = duration2;
                            animatorSet17.playTogether(animatorArr16);
                        } else {
                            float[] fArr23 = new float[i14];
                            fArr23[c14] = 1.0f;
                            ObjectAnimator ofFloat34 = ObjectAnimator.ofFloat(this, "exitTransition", fArr23);
                            ofFloat34.setDuration(this.w1 ? 280L : 360L);
                            ofFloat34.setStartDelay(this.w1 ? 0L : 490L);
                            this.b3.playTogether(ofFloat34);
                        }
                        ig igVar2 = this.T1;
                        if (igVar2 != null) {
                            if (this.w1) {
                                igVar2.setScaleX(0.0f);
                                this.T1.setScaleY(0.0f);
                            } else if (valueAnimator == null) {
                                igVar2.c();
                            }
                        }
                    } else {
                        fe feVar4 = this.c1;
                        if (feVar4 != null) {
                            feVar4.setVisibility(0);
                        }
                        AnimatorSet animatorSet18 = new AnimatorSet();
                        animatorSet18.playTogether(ObjectAnimator.ofFloat(this.R0, this.H4, 1.0f), ObjectAnimator.ofFloat(this.R0, this.J4, this.B0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.T1, (Property<ig, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.T1, (Property<ig, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.a1, (Property<ee, Float>) property4, 1.0f));
                        gg ggVar6 = this.w2;
                        if (ggVar6 != null) {
                            animatorSet18.playTogether(ObjectAnimator.ofFloat(ggVar6, (Property<gg, Float>) property4, 0.0f));
                            this.w2.f();
                        }
                        ki.a0 a0Var9 = this.m0;
                        if (a0Var9 != null) {
                            f11 = 1.0f;
                            animatorSet18.playTogether(ObjectAnimator.ofFloat(a0Var9, (Property<ki.a0, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.m0, (Property<ki.a0, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.m0, (Property<ki.a0, Float>) property4, 1.0f));
                        } else {
                            f11 = 1.0f;
                        }
                        fe feVar5 = this.c1;
                        if (feVar5 != null) {
                            feVar5.setScaleX(f11);
                            this.c1.setScaleY(f11);
                            animatorSet18.playTogether(ObjectAnimator.ofFloat(this.a1, (Property<ee, Float>) property4, f11));
                            this.c1.j(F0() ? ngVar2 : ngVar, true);
                        }
                        if (this.X1 != null) {
                            ViewPropertyAnimator viewPropertyAnimator4 = this.Y1;
                            if (viewPropertyAnimator4 != null) {
                                viewPropertyAnimator4.cancel();
                                this.Y1 = null;
                            }
                            this.y = 0.0f;
                            U1();
                            i16 = 1;
                            r112 = 0;
                            animatorSet18.playTogether(ObjectAnimator.ofFloat(this.X1, this.I4, 1.0f));
                            zd zdVar8 = this.Z1;
                            this.d2 = 1.0f;
                            animatorSet18.playTogether(ObjectAnimator.ofFloat(zdVar8, (Property<zd, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.Z1, (Property<zd, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.Z1, (Property<zd, Float>) property3, 1.0f));
                        } else {
                            r112 = 0;
                            i16 = 1;
                        }
                        lh.h hVar4 = this.D6;
                        if (hVar4 != 0) {
                            hVar4.e(r112, r112, i16);
                        }
                        je jeVar3 = this.r2;
                        if (jeVar3 != null) {
                            float[] fArr24 = new float[i16];
                            fArr24[r112] = 1.0f;
                            ObjectAnimator ofFloat35 = ObjectAnimator.ofFloat(jeVar3, (Property<je, Float>) property4, fArr24);
                            ValueAnimator n12 = n(0.0f);
                            Animator[] animatorArr17 = new Animator[2];
                            animatorArr17[r112] = ofFloat35;
                            animatorArr17[i16] = n12;
                            animatorSet18.playTogether(animatorArr17);
                        }
                        animatorSet18.setDuration(150L);
                        animatorSet18.setStartDelay(200L);
                        AnimatorSet animatorSet19 = new AnimatorSet();
                        lg lgVar6 = this.Z0;
                        float[] fArr25 = new float[i16];
                        fArr25[r112] = 0.0f;
                        ObjectAnimator ofFloat36 = ObjectAnimator.ofFloat(lgVar6, (Property<lg, Float>) property4, fArr25);
                        lg lgVar7 = this.Z0;
                        float[] fArr26 = new float[i16];
                        fArr26[r112] = org.telegram.messenger.g0.L(40.0f);
                        ObjectAnimator ofFloat37 = ObjectAnimator.ofFloat(lgVar7, (Property<lg, Float>) property, fArr26);
                        SlideTextView slideTextView6 = this.S1;
                        float[] fArr27 = new float[i16];
                        fArr27[r112] = 0.0f;
                        ObjectAnimator ofFloat38 = ObjectAnimator.ofFloat(slideTextView6, (Property<SlideTextView, Float>) property4, fArr27);
                        SlideTextView slideTextView7 = this.S1;
                        float[] fArr28 = new float[i16];
                        fArr28[r112] = org.telegram.messenger.g0.L(40.0f);
                        ObjectAnimator ofFloat39 = ObjectAnimator.ofFloat(slideTextView7, (Property<SlideTextView, Float>) property, fArr28);
                        Animator[] animatorArr18 = new Animator[4];
                        animatorArr18[r112] = ofFloat36;
                        animatorArr18[i16] = ofFloat37;
                        animatorArr18[2] = ofFloat38;
                        animatorArr18[3] = ofFloat39;
                        animatorSet19.playTogether(animatorArr18);
                        animatorSet19.setDuration(150L);
                        float[] fArr29 = new float[i16];
                        fArr29[r112] = 1.0f;
                        ObjectAnimator ofFloat40 = ObjectAnimator.ofFloat(this, "exitTransition", fArr29);
                        ofFloat40.setDuration(this.h0 ? 220L : 360L);
                        this.H = 0.0f;
                        d2();
                        ObjectAnimator ofFloat41 = ObjectAnimator.ofFloat(this.F0, (Property<xe, Float>) property4, 1.0f);
                        ofFloat41.setStartDelay(this.s == 1.0f ? 150L : 450L);
                        ofFloat41.setDuration(200L);
                        this.b3.playTogether(animatorSet18, animatorSet19, ofFloat41, ofFloat40);
                    }
                }
                this.b3.addListener(new mf(this, i7));
                this.b3.start();
                lgVar = this.Z0;
                if (lgVar != null) {
                    lgVar.b();
                }
            }
            float f15 = 0.5f;
            fe feVar6 = this.c1;
            if (feVar6 != null) {
                feVar6.setVisibility(0);
            }
            AnimatorSet animatorSet20 = this.b3;
            ObjectAnimator ofFloat42 = ObjectAnimator.ofFloat(this.R0, this.H4, 1.0f);
            wd wdVar = this.R0;
            td tdVar = this.J4;
            if (!this.B0) {
                f15 = 1.0f;
            }
            ObjectAnimator ofFloat43 = ObjectAnimator.ofFloat(wdVar, tdVar, f15);
            ObjectAnimator ofFloat44 = ObjectAnimator.ofFloat(this.T1, (Property<ig, Float>) property3, 0.0f);
            ObjectAnimator ofFloat45 = ObjectAnimator.ofFloat(this.T1, (Property<ig, Float>) property2, 0.0f);
            ObjectAnimator ofFloat46 = ObjectAnimator.ofFloat(this.v2, this.c4, 0.0f);
            ObjectAnimator ofFloat47 = ObjectAnimator.ofFloat(this.v2, this.d4, 0.0f);
            ObjectAnimator ofFloat48 = ObjectAnimator.ofFloat(this.a1, (Property<ee, Float>) property4, 1.0f);
            ObjectAnimator ofFloat49 = ObjectAnimator.ofFloat(this.Z0, (Property<lg, Float>) property4, 0.0f);
            ObjectAnimator ofFloat50 = ObjectAnimator.ofFloat(this.a1, (Property<ee, Float>) property4, 1.0f);
            ObjectAnimator ofFloat51 = ObjectAnimator.ofFloat(this.F0, (Property<xe, Float>) property4, 1.0f);
            ObjectAnimator ofFloat52 = ObjectAnimator.ofFloat(this.F0, this.L4, 0.0f);
            ObjectAnimator ofFloat53 = ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f);
            Animator[] animatorArr19 = new Animator[12];
            animatorArr19[0] = ofFloat42;
            animatorArr19[1] = ofFloat43;
            animatorArr19[2] = ofFloat44;
            animatorArr19[3] = ofFloat45;
            animatorArr19[4] = ofFloat46;
            animatorArr19[5] = ofFloat47;
            animatorArr19[6] = ofFloat48;
            animatorArr19[c10] = ofFloat49;
            animatorArr19[8] = ofFloat50;
            animatorArr19[9] = ofFloat51;
            animatorArr19[10] = ofFloat52;
            animatorArr19[11] = ofFloat53;
            animatorSet20.playTogether(animatorArr19);
            gg ggVar7 = this.w2;
            if (ggVar7 != null) {
                i10 = 1;
                c11 = 0;
                this.b3.playTogether(ObjectAnimator.ofFloat(ggVar7, (Property<gg, Float>) property4, 0.0f));
                this.w2.f();
            } else {
                i10 = 1;
                c11 = 0;
            }
            ki.a0 a0Var10 = this.m0;
            if (a0Var10 != null) {
                AnimatorSet animatorSet21 = this.b3;
                float[] fArr30 = new float[i10];
                f10 = 1.0f;
                fArr30[c11] = 1.0f;
                ObjectAnimator ofFloat54 = ObjectAnimator.ofFloat(a0Var10, (Property<ki.a0, Float>) property3, fArr30);
                ki.a0 a0Var11 = this.m0;
                float[] fArr31 = new float[i10];
                fArr31[c11] = 1.0f;
                ObjectAnimator ofFloat55 = ObjectAnimator.ofFloat(a0Var11, (Property<ki.a0, Float>) property2, fArr31);
                ki.a0 a0Var12 = this.m0;
                float[] fArr32 = new float[i10];
                fArr32[c11] = 1.0f;
                ObjectAnimator ofFloat56 = ObjectAnimator.ofFloat(a0Var12, (Property<ki.a0, Float>) property4, fArr32);
                Animator[] animatorArr20 = new Animator[3];
                animatorArr20[c11] = ofFloat54;
                animatorArr20[i10] = ofFloat55;
                animatorArr20[2] = ofFloat56;
                animatorSet21.playTogether(animatorArr20);
            } else {
                f10 = 1.0f;
            }
            fe feVar7 = this.c1;
            if (feVar7 != null) {
                feVar7.setScaleX(f10);
                this.c1.setScaleY(f10);
                i11 = 1;
                this.b3.playTogether(ObjectAnimator.ofFloat(this.a1, (Property<ee, Float>) property4, f10));
                this.c1.j(F0() ? ngVar2 : ngVar, true);
            } else {
                i11 = 1;
            }
            if (this.r2 != null) {
                AnimatorSet animatorSet22 = this.b3;
                ValueAnimator n13 = n(0.0f);
                je jeVar4 = this.r2;
                float[] fArr33 = new float[i11];
                fArr33[0] = 1.0f;
                ObjectAnimator ofFloat57 = ObjectAnimator.ofFloat(jeVar4, (Property<je, Float>) property4, fArr33);
                Animator[] animatorArr21 = new Animator[2];
                animatorArr21[0] = n13;
                animatorArr21[i11] = ofFloat57;
                animatorSet22.playTogether(animatorArr21);
            }
            if (this.X1 != null) {
                ViewPropertyAnimator viewPropertyAnimator5 = this.Y1;
                if (viewPropertyAnimator5 != null) {
                    viewPropertyAnimator5.cancel();
                    this.Y1 = null;
                }
                z12 = true;
                r11 = 0;
                this.b3.playTogether(ObjectAnimator.ofFloat(this.X1, this.K4, 0.0f), ObjectAnimator.ofFloat(this.X1, this.I4, 1.0f));
                AnimatorSet animatorSet23 = this.b3;
                zd zdVar9 = this.Z1;
                this.d2 = 1.0f;
                animatorSet23.playTogether(ObjectAnimator.ofFloat(zdVar9, (Property<zd, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.Z1, (Property<zd, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.Z1, (Property<zd, Float>) property3, 1.0f));
            } else {
                r11 = 0;
                z12 = true;
            }
            lh.h hVar5 = this.D6;
            if (hVar5 != 0) {
                hVar5.e(r11, r11, z12);
            }
            this.S2 = z12;
            K0();
            this.b3.setDuration(150L);
            this.b3.addListener(new mf(this, i7));
            this.b3.start();
            lgVar = this.Z0;
            if (lgVar != null) {
            }
        }
        this.H3.b();
        j2(true);
        this.l6 = i7;
    }

    public final boolean g0() {
        if (h0()) {
            return (c8.z0.a() && c8.z0.c()) ? false : true;
        }
        return false;
    }

    public final void g1() {
        oi0 oi0Var = this.i1;
        if (oi0Var != null) {
            oi0Var.setPlaying(false);
        }
        if (this.M3 != null) {
            CameraController.getInstance().cancelOnInitRunnable(this.p4);
            this.H3.o2(2, 0, this.P ? Integer.MAX_VALUE : 0, this.n6, 0L, true);
            this.n6 = 0L;
            this.K0.setEffect(0L);
        } else {
            org.telegram.messenger.gj gjVar = MediaController.B().v0;
            if (gjVar != null && gjVar == this.L3) {
                MediaController.B().q(true, true, false, false);
            }
        }
        if (this.K3 != null) {
            if (org.telegram.messenger.r2.a) {
                org.telegram.ui.Cells.y0.t(this.K3, new StringBuilder("delete file "));
            }
            new File(this.K3).delete();
        }
        MediaController.B().n(true);
        org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(this.R);
        long j3 = this.y3;
        org.telegram.ui.an anVar = this.x3;
        b02.B1(j3, (anVar == null || !anVar.w4) ? 0L : anVar.b(), null);
        MediaController.B().B0(0, 0, false, false);
        this.Q1 = 0L;
        A0(false);
        N(true);
    }

    public final void g2() {
        int u02 = u0(org.telegram.ui.ActionBar.j6.ag);
        int u03 = u0(org.telegram.ui.ActionBar.j6.Je);
        int u04 = u0(org.telegram.ui.ActionBar.j6.Vf);
        fh0 fh0Var = this.h1;
        if (fh0Var != null) {
            fh0Var.h(u02, "Cup Red");
            this.h1.h(u02, "Box Red");
            this.h1.h(u04, "Cup Grey");
            this.h1.h(u04, "Box Grey");
            this.h1.h(u04, "Box_Grey 2");
            this.h1.h(u04, "Line 1");
            this.h1.h(u04, "Line 2");
            this.h1.h(u04, "Line 3");
            this.h1.h(u03, "Line 1 Dup");
            this.h1.h(u03, "Line 2 Dup");
            this.h1.h(u03, "Line 3 Dup");
        }
    }

    public org.telegram.ui.ActionBar.i1 getAdjustPanLayoutHelper() {
        return this.V;
    }

    public int getAnimatedTop() {
        return this.B2;
    }

    public ImageView getAttachButton() {
        return this.Z1;
    }

    public View getAudioVideoButtonContainer() {
        return this.a1;
    }

    public int getBackgroundTop() {
        int top = getTop();
        View view = this.o2;
        return (view == null || view.getVisibility() != 0) ? top : top + this.o2.getLayoutParams().height;
    }

    public ki.o3 getBotWebViewButton() {
        if (this.l0 == null) {
            Context context = getContext();
            ki.o3 o3Var = new ki.o3(context);
            o3Var.a = new Path();
            o3Var.c = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Fi, false);
            o3Var.d = true;
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setSingleLine();
            textView.setAlpha(0.0f);
            textView.setGravity(17);
            textView.setTypeface(org.telegram.messenger.g0.o());
            o3Var.addView(textView, c8.ja.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context, null);
            radialProgressView.setSize(org.telegram.messenger.g0.L(18.0f));
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.0f);
            radialProgressView.setScaleY(0.0f);
            o3Var.addView(radialProgressView, c8.ja.d(28, 28.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            View view = new View(context);
            o3Var.h = view;
            int i7 = org.telegram.ui.ActionBar.j6.Hi;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.x0(null, i7, false), 2, -1);
            org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i7);
            view.setBackground(h02);
            org.telegram.ui.ActionBar.q6.j(view, h02, null, M, null);
            o3Var.addView(view, c8.ja.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            o3Var.setWillNotDraw(false);
            this.l0 = o3Var;
            o3Var.setVisibility(8);
            U();
            this.l0.setBotMenuButton(this.m0);
            this.g2.addView(this.l0, c8.ja.e(-1, -1, 80));
        }
        return this.l0;
    }

    public int getCursorPosition() {
        xe xeVar = this.F0;
        if (xeVar == null) {
            return 0;
        }
        return xeVar.getSelectionStart();
    }

    public CharSequence getDraftMessage() {
        if (this.H2 != null) {
            if (TextUtils.isEmpty(this.D2)) {
                return null;
            }
            return this.D2;
        }
        if (this.F0 == null || !w0()) {
            return null;
        }
        return this.F0.getText();
    }

    @Override // org.telegram.ui.Components.pw0
    public /* bridge */ /* synthetic */ float getEditFieldBottomOffset() {
        return 0.0f;
    }

    @Override // org.telegram.ui.Components.pw0
    public Editable getEditText() {
        xe xeVar = this.F0;
        if (xeVar == null) {
            return null;
        }
        return xeVar.getText();
    }

    public org.telegram.messenger.gj getEditingMessageObject() {
        return this.H2;
    }

    public long getEffectId() {
        return this.n6;
    }

    public View getEmojiButton() {
        return this.R0;
    }

    public int getEmojiPadding() {
        return this.i3;
    }

    public ly getEmojiView() {
        return this.V0;
    }

    public float getExitTransition() {
        return this.U4;
    }

    @Override // org.telegram.ui.Components.pw0
    public CharSequence getFieldText() {
        if (this.F0 == null || !w0()) {
            return null;
        }
        return this.F0.getText();
    }

    public int getHeightWithTopView() {
        int measuredHeight = getMeasuredHeight();
        View view = this.o2;
        return (view == null || view.getVisibility() != 0) ? measuredHeight : (int) (measuredHeight - ((1.0f - getTopViewEnterProgress()) * this.o2.getLayoutParams().height));
    }

    public long getLineAnimationDelay() {
        return 0L;
    }

    public float getLockAnimatedTranslation() {
        return this.T4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x007c, code lost:
    
        if (r6.M3 == null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int getMessagesCount() {
        org.telegram.messenger.kj kjVar;
        org.telegram.messenger.ij ijVar;
        org.telegram.ui.an anVar = this.x3;
        int size = (anVar == null || (kjVar = anVar.w5) == null || (ijVar = kjVar.b) == null) ? 0 : ijVar.g.size();
        xe xeVar = this.F0;
        if (xeVar == null || TextUtils.isEmpty(xeVar.getText())) {
            if (this.L3 == null) {
            }
            size++;
        } else {
            String obj = this.F0.getText().toString();
            org.telegram.messenger.p5 p5Var = org.telegram.messenger.ez.J;
            String trim = obj.trim();
            if (trim.length() != 0) {
                while (obj.startsWith("\n")) {
                    obj = obj.substring(1);
                }
                while (obj.endsWith("\n")) {
                    obj = com.google.android.gms.internal.vision.e2.k(obj, 1, 0);
                }
                trim = obj;
            }
            int u12 = org.telegram.messenger.np.s1(this.S.a).u1();
            if (trim.length() != 0) {
                size += (int) Math.ceil(trim.length() / u12);
            }
            size++;
        }
        return Math.max(1, size);
    }

    public RecordCircle getRecordCircle() {
        return this.v2;
    }

    public long getRecordTimerStartTime() {
        lg lgVar = this.Z0;
        if (lgVar == null || !lgVar.a) {
            return 0L;
        }
        return lgVar.d;
    }

    public org.telegram.messenger.gj getReplyingMessageObject() {
        return this.B3;
    }

    public int getRestingFieldHeight() {
        xe xeVar = this.F0;
        if (xeVar == null) {
            return org.telegram.messenger.g0.L(44.0f);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) xeVar.getLayoutParams();
        return Math.max(org.telegram.messenger.g0.L(44.0f), this.F0.getLineHeight() + this.F0.getPaddingBottom() + this.F0.getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin);
    }

    public int getSelectionLength() {
        xe xeVar = this.F0;
        if (xeVar == null) {
            return 0;
        }
        try {
            return xeVar.getSelectionEnd() - this.F0.getSelectionStart();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            return 0;
        }
    }

    public View getSendButton() {
        return getSendButtonInternal().getVisibility() == 0 ? getSendButtonInternal() : this.a1;
    }

    public View getSendButtonInternal() {
        return this.K0;
    }

    public org.telegram.messenger.lj getSendMessageSuggestionParams() {
        org.telegram.ui.an anVar = this.x3;
        if (anVar != null) {
            return anVar.x5;
        }
        return null;
    }

    public long getSendMonoForumPeerId() {
        org.telegram.ui.an anVar = this.x3;
        if (anVar != null) {
            return anVar.j9();
        }
        return 0L;
    }

    public gn0 getSenderSelectView() {
        return this.q0;
    }

    public st0 getSizeNotifierLayout() {
        return this.U1;
    }

    public float getSlideToCancelProgress() {
        return this.R4;
    }

    public CharSequence getSlowModeTimer() {
        if (this.H0 > 0) {
            return ((org.telegram.ui.ActionBar.j5) this.G0.c).getText();
        }
        return null;
    }

    public long getStarsPrice() {
        org.telegram.ui.an anVar = this.x3;
        return anVar != null ? anVar.getMessagesController().N1(anVar.a()) : org.telegram.messenger.np.s1(this.R).N1(this.y3);
    }

    public Drawable getStickersArrowDrawable() {
        return this.n4;
    }

    public int getStickersExpandedHeight() {
        return this.l4;
    }

    public ImageView getSuggestButton() {
        return this.e2;
    }

    public TLRPC.TL_textWithEntities getTextWithEntities() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {new SpannableStringBuilder(getEditText())};
        tL_textWithEntities.entities = org.telegram.messenger.si.b0(org.telegram.messenger.m10.t0).W(charSequenceArr, true, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        return tL_textWithEntities;
    }

    public float getTopViewEnterProgress() {
        return this.F6.e;
    }

    public float getTopViewHeight() {
        View view = this.o2;
        if (view == null || view.getVisibility() != 0) {
            return 0.0f;
        }
        return this.o2.getLayoutParams().height;
    }

    public float getTopViewTranslation() {
        View view = this.o2;
        if (view == null || view.getVisibility() == 8) {
            return 0.0f;
        }
        return this.o2.getTranslationY();
    }

    public j31 getTrendingStickersAlert() {
        return this.I3;
    }

    public int getVisibleEmojiPadding() {
        if (this.X0) {
            return this.i3;
        }
        return 0;
    }

    public float getVisualHeight() {
        float f10 = this.B2;
        View view = this.o2;
        if (view != null && view.getVisibility() == 0) {
            f10 += (1.0f - getTopViewEnterProgress()) * this.o2.getLayoutParams().height;
        }
        return getMeasuredHeight() - f10;
    }

    public final boolean h0() {
        if (!DictationAsr.B() || this.x3 == null || this.F0 == null) {
            return false;
        }
        return !(this.M2 && this.d1) && this.z0;
    }

    public final void h1(TL_iv.RichMessage richMessage) {
        org.telegram.ui.an anVar = this.x3;
        if (anVar != null) {
            org.telegram.messenger.si.b0(this.R).Q1(anVar.a(), anVar.Q7(anVar.E5), "", null, null, null, null, 0L, false, false, richMessage);
        }
        setRichDraftPreview(richMessage);
    }

    public final void h2() {
        org.telegram.messenger.xt xtVar = this.k2;
        if (xtVar == null) {
            return;
        }
        boolean z10 = this.l2;
        boolean z11 = this.m2 != null && this.H2 == null;
        this.l2 = z11;
        he heVar = this.K0;
        ImageView imageView = this.S0;
        wd wdVar = this.R0;
        if (z11) {
            xtVar.setResourcesProvider(this.E4);
            this.k2.set(this.m2);
            this.k2.setVisibility(0);
            xe xeVar = this.F0;
            if (xeVar != null) {
                xeVar.setVisibility(8);
            }
            wdVar.setVisibility(8);
            imageView.setVisibility(0);
            heVar.setLocked(!org.telegram.messenger.m10.i(this.R).q());
        } else {
            xtVar.setVisibility(8);
            xe xeVar2 = this.F0;
            if (xeVar2 != null) {
                xeVar2.setVisibility(0);
            }
            wdVar.setVisibility(0);
            imageView.setVisibility(8);
            heVar.setLocked(false);
        }
        Y1();
        if (z10 != this.l2) {
            N(true);
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final boolean i0(TL_keyboard.KeyboardButtonProto keyboardButtonProto, org.telegram.messenger.gj gjVar, org.telegram.messenger.gj gjVar2, org.telegram.ui.gi giVar) {
        org.telegram.ui.an anVar;
        int i7;
        int i10 = 0;
        if (keyboardButtonProto != null && gjVar2 != null && ((anVar = this.x3) == null || anVar.g4 != 5)) {
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = (TL_keyboard.TL_inlineButtonTypeUserProfile) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class);
            TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) cg.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class);
            TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class);
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (tL_inlineButtonTypeCopy != null) {
                org.telegram.messenger.g0.g(tL_inlineButtonTypeCopy.copy_text);
                cc.a0(anVar).i(org.telegram.messenger.hd.a0(null, null, 2131750884, tL_inlineButtonTypeCopy.copy_text)).k(true);
                return true;
            }
            if (keyboardButtonProto instanceof TL_keyboard.TL_keyboardButton) {
                TL_keyboard.TL_keyboardButton tL_keyboardButton = (TL_keyboard.TL_keyboardButton) keyboardButtonProto;
                if (tL_keyboardButton.type instanceof TL_keyboard.TL_buttonTypeDefault) {
                    org.telegram.messenger.cz b10 = org.telegram.messenger.cz.b(tL_keyboardButton.text, this.y3, gjVar, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                    b10.K = anVar != null ? anVar.Y8() : null;
                    b10.O = this.n6;
                    this.n6 = 0L;
                    this.K0.setEffect(0L);
                    org.telegram.messenger.ez.C(this.R).r0(b10);
                    return true;
                }
            }
            Activity activity = this.w3;
            if (tL_inlineButtonTypeUrl != null) {
                if (vf.c.z(tL_inlineButtonTypeUrl.url)) {
                    vf.c.r(activity, Uri.parse(tL_inlineButtonTypeUrl.url), true, true, giVar);
                    return true;
                }
                t4.o0(this.x3, tL_inlineButtonTypeUrl.url, false, true, true, false, giVar, null, this.E4);
                return true;
            }
            if (cg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPhone.class)) {
                anVar.Yb(2, gjVar2);
                return true;
            }
            if (!cg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class)) {
                if (cg.c.b(keyboardButtonProto)) {
                    TLRPC.Message message = gjVar2.k;
                    long j3 = message.via_bot_id;
                    if (j3 == 0) {
                        j3 = message.from_id.user_id;
                    }
                    long j10 = j3;
                    qf qfVar = new qf(this, gjVar2, j10, keyboardButtonProto, gjVar, org.telegram.messenger.np.s1(this.R).a2(Long.valueOf(j3)));
                    if (org.telegram.messenger.b6.j(this.R, j10) || org.telegram.messenger.np.s1(this.R).X6.contains(Long.valueOf(j10))) {
                        qfVar.run();
                        return true;
                    }
                    t4.n(anVar, org.telegram.messenger.np.s1(this.R).a2(Long.valueOf(this.y3)), new bi.m1(this, qfVar, j10, 21), null);
                    return true;
                }
                if (cg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    String M0 = org.telegram.messenger.hd.M0(2131745423, "ShareYouLocationTitle");
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                    t1Var.S = M0;
                    t1Var.U = org.telegram.messenger.hd.M0(2131745425, "ShareYouLocationInfo");
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, "OK"), new a3.h(this, gjVar2, keyboardButtonProto, 22));
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, "Cancel"), null);
                    anVar.showDialog(t1Var);
                    return true;
                }
                if (cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
                    org.telegram.messenger.ez.C(this.R).n0(true, gjVar2, keyboardButtonProto, null, null, anVar);
                    return true;
                }
                if (tL_inlineButtonTypeSwitchInline != null) {
                    if (!anVar.eb(tL_inlineButtonTypeSwitchInline)) {
                        if (!tL_inlineButtonTypeSwitchInline.same_peer) {
                            Bundle j11 = org.telegram.ui.Cells.y0.j(1, "onlySelect", "dialogsType", true);
                            if ((tL_inlineButtonTypeSwitchInline.flags & 2) != 0) {
                                j11.putBoolean("allowGroups", false);
                                j11.putBoolean("allowMegagroups", false);
                                j11.putBoolean("allowLegacyGroups", false);
                                j11.putBoolean("allowUsers", false);
                                j11.putBoolean("allowChannels", false);
                                j11.putBoolean("allowBots", false);
                                ArrayList<TLRPC.InlineQueryPeerType> arrayList = tL_inlineButtonTypeSwitchInline.peer_types;
                                int size = arrayList.size();
                                while (i10 < size) {
                                    TLRPC.InlineQueryPeerType inlineQueryPeerType = arrayList.get(i10);
                                    i10++;
                                    TLRPC.InlineQueryPeerType inlineQueryPeerType2 = inlineQueryPeerType;
                                    if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypePM) {
                                        j11.putBoolean("allowUsers", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBotPM) {
                                        j11.putBoolean("allowBots", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBroadcast) {
                                        j11.putBoolean("allowChannels", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeChat) {
                                        j11.putBoolean("allowLegacyGroups", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeMegagroup) {
                                        j11.putBoolean("allowMegagroups", true);
                                    }
                                }
                            }
                            org.telegram.ui.yw ywVar = new org.telegram.ui.yw(j11);
                            ywVar.E2 = new a3.h(this, gjVar2, tL_inlineButtonTypeSwitchInline, 23);
                            anVar.presentFragment(ywVar);
                            return true;
                        }
                        TLRPC.Message message2 = gjVar2.k;
                        long j12 = message2.from_id.user_id;
                        long j13 = message2.via_bot_id;
                        if (j13 != 0) {
                            j12 = j13;
                        }
                        TLRPC.User a22 = org.telegram.messenger.np.s1(this.S.a).a2(Long.valueOf(j12));
                        if (a22 != null) {
                            setFieldText("@" + org.telegram.messenger.q10.n(a22) + " " + tL_inlineButtonTypeSwitchInline.query);
                            return true;
                        }
                    }
                } else if (tL_inlineButtonTypeUserProfile != null) {
                    if (org.telegram.messenger.np.s1(this.R).a2(Long.valueOf(tL_inlineButtonTypeUserProfile.user_id)) != null) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", tL_inlineButtonTypeUserProfile.user_id);
                        anVar.presentFragment(new ProfileActivity(bundle, null));
                        return true;
                    }
                } else if (tL_buttonTypeRequestPeer != null) {
                    TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
                    if (requestPeerType == null || gjVar2.k == null) {
                        org.telegram.messenger.a8.d("button.peer_type is null");
                        return true;
                    }
                    if (!(requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot)) {
                        if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i7 = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                            TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                            Boolean bool = tL_requestPeerTypeUser.bot;
                            Boolean bool2 = tL_requestPeerTypeUser.premium;
                            vc vcVar = new vc(this, gjVar2, tL_buttonTypeRequestPeer);
                            org.telegram.ui.qg0 qg0Var = org.telegram.ui.qg0.q2;
                            org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                            if (Q == null || org.telegram.ui.qg0.q2 != null) {
                                return false;
                            }
                            org.telegram.ui.qg0 qg0Var2 = new org.telegram.ui.qg0(Q, i7, bool, bool2, vcVar);
                            qg0Var2.show();
                            org.telegram.ui.qg0.q2 = qg0Var2;
                            return false;
                        }
                        Bundle j14 = org.telegram.ui.Cells.y0.j(15, "onlySelect", "dialogsType", true);
                        TLRPC.Message message3 = gjVar2.k;
                        if (message3 != null) {
                            TLRPC.Peer peer = message3.from_id;
                            if (peer instanceof TLRPC.TL_peerUser) {
                                j14.putLong("requestPeerBotId", peer.user_id);
                            }
                        }
                        try {
                            SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                            tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                            j14.putByteArray("requestPeerType", serializedData.toByteArray());
                            serializedData.cleanup();
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        org.telegram.ui.yw ywVar2 = new org.telegram.ui.yw(j14);
                        ywVar2.E2 = new vc(this, gjVar2, tL_buttonTypeRequestPeer);
                        anVar.presentFragment(ywVar2);
                        return false;
                    }
                    TLRPC.User j15 = getParentFragment() != null ? getParentFragment().j() : org.telegram.messenger.np.s1(this.R).a2(Long.valueOf(this.y3));
                    if (j15 != null) {
                        sq.e(getContext(), this.R, j15, (TLRPC.TL_requestPeerTypeCreateBot) tL_buttonTypeRequestPeer.peer_type, false, new bi.o1(this, gjVar2, tL_buttonTypeRequestPeer, j15, 6), this.E4, null);
                        return false;
                    }
                }
                return true;
            }
            TL_keyboard.TL_buttonTypeRequestPoll tL_buttonTypeRequestPoll = (TL_keyboard.TL_buttonTypeRequestPoll) cg.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class);
            Boolean valueOf = (tL_buttonTypeRequestPoll.flags & 1) != 0 ? Boolean.valueOf(tL_buttonTypeRequestPoll.quiz) : null;
            anVar.Aa();
            fi.p2 p2Var = anVar.Y1;
            if (p2Var != null) {
                p2Var.Q2 = false;
                p2Var.v3.setVisibility(8);
                p2Var.H1(false, valueOf);
                return false;
            }
        }
        return false;
    }

    public final void i1(SpannableStringBuilder spannableStringBuilder, boolean z10, int i7, int i10) {
        if (this.F0 == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        org.telegram.messenger.j6.m(spannableStringBuilder2, this.F0.getPaint().getFontMetricsInt(), false, null, 0);
        p5[] p5VarArr = (p5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), p5.class);
        if (p5VarArr != null) {
            for (p5 p5Var : p5VarArr) {
                p5Var.applyFontMetrics(this.F0.getPaint().getFontMetricsInt(), g5.f());
            }
        }
        xg0.a(spannableStringBuilder2);
        R();
        setFieldText(spannableStringBuilder2);
        k1(z10, i7, i10, 0L, true);
    }

    public final void i2(boolean z10) {
        boolean z11;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z12 = org.telegram.messenger.m5.z(this.y3);
        ImageView imageView = this.q2;
        if (z12) {
            TLRPC.Chat M0 = org.telegram.messenger.np.s1(this.S.a).M0(Long.valueOf(-this.y3));
            this.O2 = org.telegram.messenger.np.s1(this.R).e7.getBoolean("silent_" + this.y3, false);
            z11 = org.telegram.messenger.t3.T(M0) && (M0.creator || ((tL_chatAdminRights = M0.admin_rights) != null && tL_chatAdminRights.post_messages)) && !M0.megagroup;
            this.P2 = z11;
            if (imageView != null) {
                if (this.f0 == null) {
                    this.f0 = new br(getContext(), R.drawable.input_notify_on, org.telegram.ui.ActionBar.j6.Nl);
                }
                this.f0.a(this.O2, false);
                imageView.setImageDrawable(this.f0);
            } else {
                z11 = false;
            }
            org.telegram.ui.z51 z51Var = this.X1;
            if (z51Var != null) {
                b2(z51Var.getVisibility() == 0 ? 1 : 0);
            }
        } else {
            z11 = false;
        }
        boolean z13 = (this.H3 == null || c() || !this.H3.E0()) ? false : true;
        boolean z14 = (!z13 || this.t2 || this.n3) ? false : true;
        if (z14) {
            e0();
        }
        je jeVar = this.r2;
        if (jeVar != null) {
            if ((jeVar.getTag() != null && z14) || (this.r2.getTag() == null && !z14)) {
                if (imageView != null) {
                    int i7 = (z13 || !z11 || this.r2.getVisibility() == 0) ? 8 : 0;
                    if (i7 != imageView.getVisibility()) {
                        imageView.setVisibility(i7);
                        return;
                    }
                    return;
                }
                return;
            }
            this.r2.setTag(z14 ? 1 : null);
        } else if (imageView != null) {
            int i10 = (z13 || !z11) ? 8 : 0;
            if (i10 != imageView.getVisibility()) {
                imageView.setVisibility(i10);
            }
        }
        AnimatorSet animatorSet = this.u2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.u2 = null;
        }
        if (z10 && !z11) {
            je jeVar2 = this.r2;
            if (jeVar2 != null) {
                if (z14) {
                    jeVar2.setVisibility(0);
                }
                this.r2.setPivotX(org.telegram.messenger.g0.L(24.0f));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.u2 = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.r2, (Property<je, Float>) View.ALPHA, z14 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.r2, (Property<je, Float>) View.SCALE_X, z14 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(this.r2, (Property<je, Float>) View.SCALE_Y, z14 ? 1.0f : 0.1f));
                this.u2.setDuration(180L);
                this.u2.addListener(new le(this, z14, 3));
                this.u2.start();
                return;
            }
            return;
        }
        je jeVar3 = this.r2;
        if (jeVar3 == null) {
            if (imageView != null) {
                imageView.setVisibility(z11 ? 0 : 8);
                return;
            }
            return;
        }
        jeVar3.setVisibility(z14 ? 0 : 8);
        this.r2.setAlpha(z14 ? 1.0f : 0.0f);
        this.r2.setScaleX(z14 ? 1.0f : 0.1f);
        this.r2.setScaleY(z14 ? 1.0f : 0.1f);
        if (imageView != null) {
            imageView.setVisibility((!z11 || this.r2.getVisibility() == 0) ? 8 : 0);
        }
        this.r2.setTranslationX(0.0f);
    }

    public final void j0() {
        org.telegram.messenger.kj kjVar;
        org.telegram.messenger.lj b10;
        TLRPC.Chat chat;
        int i7;
        org.telegram.messenger.lj b11;
        org.telegram.messenger.gj gjVar = this.H2;
        if (gjVar == null) {
            return;
        }
        boolean p52 = gjVar.p5();
        org.telegram.ui.an anVar = this.x3;
        if (p52 && !org.telegram.messenger.t3.z(this.R, 24, org.telegram.messenger.gj.B0(this.H2.k))) {
            if (anVar == null || (b11 = anVar.x5) == null) {
                b11 = org.telegram.messenger.lj.b(this.H2.k.suggested_post);
            }
            if (!di.u8.T(this.R, b11.a)) {
                if (anVar != null) {
                    anVar.Ac(b11);
                    return;
                }
                return;
            }
        }
        if (this.d0 - this.e0 < 0) {
            NumberTextView numberTextView = this.c0;
            if (numberTextView != null) {
                org.telegram.messenger.g0.F3(3.5f, numberTextView, null);
                try {
                    this.c0.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
            }
            if (org.telegram.messenger.np.s1(this.R).D3() || org.telegram.messenger.np.s1(this.R).V4 <= this.e0) {
                return;
            }
            I1();
            return;
        }
        if (this.z2 != 0) {
            D1(0, true);
            this.V0.t(false);
            if (this.h4) {
                E1(false, true, false, true);
                this.T3 = true;
                org.telegram.messenger.g0.i3(new nd(this, 5), 200L);
            }
        }
        xe xeVar = this.F0;
        CharSequence textToUse = xeVar == null ? "" : xeVar.getTextToUse();
        org.telegram.messenger.gj gjVar2 = this.H2;
        if (gjVar2 == null || gjVar2.D != 19) {
            textToUse = org.telegram.messenger.g0.n1(textToUse);
        }
        CharSequence[] charSequenceArr = {textToUse};
        if (TextUtils.isEmpty(charSequenceArr[0])) {
            TLRPC.MessageMedia messageMedia = this.H2.k.media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) || (messageMedia instanceof TLRPC.TL_messageMediaEmpty) || messageMedia == null) {
                org.telegram.messenger.g0.F3(-3.0f, this.F0, null);
                org.telegram.messenger.p2.E.a();
                return;
            }
        }
        ArrayList W = org.telegram.messenger.si.b0(this.R).W(charSequenceArr, S1(), true);
        if (!TextUtils.equals(charSequenceArr[0], this.H2.v) || ((W != null && !W.isEmpty()) || !this.H2.k.entities.isEmpty() || (this.H2.k.media instanceof TLRPC.TL_messageMediaWebPage))) {
            org.telegram.messenger.gj gjVar3 = this.H2;
            gjVar3.y1 = charSequenceArr[0];
            gjVar3.z1 = W;
            gjVar3.A1 = this.G3;
            if (anVar != null && (chat = anVar.e) != null && (((i7 = gjVar3.D) == 0 || i7 == 19) && !org.telegram.messenger.t3.m(chat))) {
                org.telegram.messenger.gj gjVar4 = this.H2;
                gjVar4.A1 = false;
                TLRPC.Message message = gjVar4.k;
                message.flags &= -513;
                message.media = null;
            } else if (anVar == null || (kjVar = anVar.w5) == null) {
                org.telegram.messenger.gj gjVar5 = this.H2;
                gjVar5.A1 = false;
                int i10 = gjVar5.D;
                if (i10 == 0 || i10 == 19) {
                    TLRPC.Message message2 = gjVar5.k;
                    message2.flags |= 512;
                    message2.media = new TLRPC.TL_messageMediaEmpty();
                }
            } else {
                if (anVar.X5 instanceof TLRPC.TL_webPagePending) {
                    org.telegram.messenger.gj gjVar6 = this.H2;
                    gjVar6.A1 = false;
                    int i11 = gjVar6.D;
                    if (i11 == 0 || i11 == 19) {
                        gjVar6.k.media = new TLRPC.TL_messageMediaEmpty();
                        this.H2.k.flags |= 512;
                    }
                } else if (kjVar.v != null) {
                    org.telegram.messenger.gj gjVar7 = this.H2;
                    gjVar7.A1 = false;
                    TLRPC.Message message3 = gjVar7.k;
                    message3.flags |= 512;
                    message3.media = new TLRPC.TL_messageMediaWebPage();
                    this.H2.k.media.webpage = anVar.w5.v;
                } else {
                    org.telegram.messenger.gj gjVar8 = this.H2;
                    gjVar8.A1 = false;
                    int i12 = gjVar8.D;
                    if (i12 == 0 || i12 == 19) {
                        TLRPC.Message message4 = gjVar8.k;
                        message4.flags |= 512;
                        message4.media = new TLRPC.TL_messageMediaEmpty();
                    }
                }
                TLRPC.Message message5 = this.H2.k;
                org.telegram.messenger.kj kjVar2 = anVar.w5;
                message5.invert_media = kjVar2.r;
                if (kjVar2.o) {
                    TLRPC.MessageMedia messageMedia2 = message5.media;
                    if (messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) {
                        boolean z10 = kjVar2.q;
                        messageMedia2.force_small_media = z10;
                        messageMedia2.force_large_media = true ^ z10;
                    }
                }
            }
            if (this.H2.p5()) {
                org.telegram.messenger.cz a10 = org.telegram.messenger.cz.a(org.telegram.messenger.gj.B0(this.H2.k), this.H2.y1.toString());
                if (anVar == null || (b10 = anVar.x5) == null) {
                    b10 = org.telegram.messenger.lj.b(this.H2.k.suggested_post);
                }
                a10.T = b10;
                a10.R = org.telegram.messenger.m5.o(this.H2.k.saved_peer_id);
                a10.G = this.H2.t2();
                org.telegram.messenger.gj gjVar9 = this.H2;
                a10.r = gjVar9;
                a10.D = gjVar9;
                if (gjVar9.F0() instanceof TLRPC.TL_document) {
                    a10.g = (TLRPC.TL_document) this.H2.F0();
                    a10.b = a10.a;
                    a10.a = null;
                } else {
                    TLRPC.MessageMedia messageMedia3 = this.H2.k.media;
                    if (messageMedia3 != null && !(messageMedia3 instanceof TLRPC.TL_messageMediaEmpty)) {
                        TLRPC.Photo photo = messageMedia3.photo;
                        if (photo instanceof TLRPC.TL_photo) {
                            a10.d = (TLRPC.TL_photo) photo;
                        } else {
                            a10.c = messageMedia3;
                        }
                        a10.b = a10.a;
                        a10.a = null;
                    }
                }
                org.telegram.messenger.ez.C(this.R).r0(a10);
            } else {
                org.telegram.messenger.ez C = org.telegram.messenger.ez.C(this.R);
                org.telegram.messenger.gj gjVar10 = this.H2;
                C.t(gjVar10, null, null, null, null, null, null, null, false, gjVar10.t2(), null);
            }
        }
        s1(null, null, false);
    }

    public boolean j1() {
        ai.n0 n0Var = this.j1;
        if (n0Var != null && n0Var.r == 4) {
            return false;
        }
        boolean z10 = this.l2;
        org.telegram.ui.ActionBar.e6 e6Var = this.E4;
        if (z10 && !org.telegram.messenger.m10.i(this.R).q()) {
            oi.z1.u0(getContext(), new uc(this, 26), new uc(this, 27), e6Var);
            return true;
        }
        if (!c()) {
            return k1(true, 0, 0, 0L, true);
        }
        t4.J(this.w3, this.x3.a(), new be(this, 3), e6Var);
        return true;
    }

    public void j2(boolean z10) {
        k2(false, z10);
    }

    public final void k0(Canvas canvas, boolean z10) {
        if (this.Q5) {
            int z11 = (int) com.google.android.gms.internal.vision.e2.z(1.0f, this.U5, org.telegram.ui.ActionBar.j6.i3.getIntrinsicHeight(), this.B2);
            View view = this.o2;
            if (view != null && view.getVisibility() == 0) {
                z11 = (int) (((1.0f - getTopViewEnterProgress()) * this.o2.getLayoutParams().height) + z11);
            }
            int intrinsicHeight = org.telegram.ui.ActionBar.j6.i3.getIntrinsicHeight() + z11;
            if (z10) {
                org.telegram.ui.ActionBar.j6.i3.setAlpha((int) (this.U5 * 255.0f));
                org.telegram.ui.ActionBar.j6.i3.setBounds(0, z11, getMeasuredWidth(), intrinsicHeight);
                org.telegram.ui.ActionBar.j6.i3.draw(canvas);
            }
            if (!this.P5) {
                float f10 = intrinsicHeight;
                float width = getWidth();
                float height = getHeight();
                org.telegram.ui.ActionBar.e6 e6Var = this.E4;
                Paint d = e6Var != null ? e6Var.d("paintChatComposeBackground") : null;
                if (d == null) {
                    d = org.telegram.ui.ActionBar.j6.V0("paintChatComposeBackground");
                }
                canvas.drawRect(0.0f, f10, width, height, d);
                return;
            }
            int u02 = u0(org.telegram.ui.ActionBar.j6.Je);
            Paint paint = this.T5;
            paint.setColor(u02);
            if (!org.telegram.messenger.gz.f() || this.U1 == null) {
                canvas.drawRect(0.0f, intrinsicHeight, getWidth(), getHeight(), paint);
            } else {
                this.V5.set(0, intrinsicHeight, getWidth(), getHeight());
                this.U1.H(canvas, getTop(), this.V5, paint, false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f8, code lost:
    
        if (r11.J1(new org.telegram.messenger.el(r37, r38, r39, r40, r41)) != false) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:243:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0678 A[LOOP:1: B:207:0x0420->B:265:0x0678, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0628 A[EDGE_INSN: B:266:0x0628->B:267:0x0628 BREAK  A[LOOP:1: B:207:0x0420->B:265:0x0678], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x056f  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [org.telegram.messenger.gj, org.telegram.tgnet.TLRPC$WebPage] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean k1(final boolean z10, final int i7, final int i10, long j3, boolean z11) {
        ChatActivityEnterView chatActivityEnterView;
        ChatActivityEnterView chatActivityEnterView2;
        boolean z12;
        int i11;
        int i12;
        int i13;
        int i14;
        org.telegram.messenger.cj cjVar;
        org.telegram.messenger.cj cjVar2;
        org.telegram.messenger.gj threadMessage;
        int i15;
        CharSequence charSequence;
        CharSequence charSequence2;
        String str;
        org.telegram.ui.an anVar;
        ?? r32;
        TLRPC.WebPage webPage;
        boolean z13;
        org.telegram.messenger.kj kjVar;
        org.telegram.messenger.kj kjVar2;
        ChatActivityEnterView chatActivityEnterView3;
        TLRPC.Chat chat;
        org.telegram.messenger.kj kjVar3;
        org.telegram.messenger.gj gjVar;
        cg cgVar;
        TLRPC.Chat chat2;
        TL_iv.RichMessage richMessage;
        ChatActivityEnterView chatActivityEnterView4;
        sf sfVar;
        ?? r02 = z11 && !this.H6.f;
        if (r02 == true) {
            boolean Y = t4.Y(this.R, this.y3, getMessagesCount(), new org.telegram.messenger.z10() { // from class: org.telegram.ui.Components.rd
                @Override // org.telegram.messenger.z10
                public final void a(Object obj) {
                    int i16 = ChatActivityEnterView.N6;
                    ChatActivityEnterView chatActivityEnterView5 = ChatActivityEnterView.this;
                    chatActivityEnterView5.getClass();
                    chatActivityEnterView5.k1(z10, i7, i10, ((Long) obj).longValue(), false);
                }
            }, j3);
            if (Y && this.a5) {
                if (this.d1) {
                    if (!this.H3.g1()) {
                        SlideTextView slideTextView = this.S1;
                        if (slideTextView != null) {
                            slideTextView.setEnabled(false);
                        }
                        this.H3.l1();
                        return Y;
                    }
                } else if (!MediaController.B().K()) {
                    if (this.a5) {
                        this.r4 = true;
                    }
                    MediaController.B().D0(this.P);
                    this.H3.a1(0);
                    SlideTextView slideTextView2 = this.S1;
                    if (slideTextView2 != null) {
                        slideTextView2.setEnabled(false);
                    }
                }
            }
            return Y;
        }
        if (this.H0 != Integer.MAX_VALUE || c()) {
            org.telegram.ui.an anVar2 = this.x3;
            if (anVar2 != null) {
                TLRPC.Chat chat3 = anVar2.e;
                if (anVar2.j() != null || ((org.telegram.messenger.t3.T(chat3) && chat3.megagroup) || !org.telegram.messenger.t3.T(chat3))) {
                    org.telegram.messenger.np.s1(this.R).e7.edit().putBoolean("silent_" + this.y3, !z10).commit();
                }
            }
            if (this.h4) {
                E1(false, true, false, true);
                if (this.z2 != 0 && (sfVar = this.V0) != null) {
                    sfVar.t(false);
                    this.V0.A();
                }
            }
            if (r02 == true) {
                chatActivityEnterView = this;
            } else {
                chatActivityEnterView = this;
            }
            chatActivityEnterView.W5 = true;
            org.telegram.messenger.g20 g20Var = chatActivityEnterView.M3;
            he heVar = chatActivityEnterView.K0;
            if (g20Var != null) {
                chatActivityEnterView.H3.o2(4, i7, chatActivityEnterView.P ? Integer.MAX_VALUE : 0, chatActivityEnterView.n6, j3, z10);
                chatActivityEnterView.n6 = 0L;
                heVar.setEffect(0L);
                chatActivityEnterView.A0(true);
                chatActivityEnterView.N(true);
                org.telegram.messenger.g0.i3(new uc(chatActivityEnterView, 6), 100L);
                chatActivityEnterView.Q1 = 0L;
            } else {
                TLRPC.TL_document tL_document = chatActivityEnterView.J3;
                if (tL_document != null && chatActivityEnterView.C1 && chatActivityEnterView.M1) {
                    yh.a aVar = chatActivityEnterView.L1;
                    if (aVar != null) {
                        aVar.getText().getClass();
                    }
                    if (heVar != null) {
                        org.telegram.messenger.g0.F3(3.0f, heVar, null);
                    }
                    chatActivityEnterView2 = chatActivityEnterView;
                } else {
                    if (tL_document != null) {
                        org.telegram.messenger.gj gjVar2 = MediaController.B().v0;
                        if (gjVar2 != null && gjVar2 == chatActivityEnterView.L3) {
                            MediaController.B().q(true, true, false, false);
                        }
                        MediaController.B().n(false);
                        org.telegram.messenger.si.b0(chatActivityEnterView.R).B1(chatActivityEnterView.y3, (anVar2 == null || !anVar2.w4) ? 0L : anVar2.b(), null);
                        oi0 oi0Var = chatActivityEnterView.i1;
                        if (oi0Var != null && (oi0Var.s > 0.0f || oi0Var.w < 1.0f)) {
                            oi0Var.setPlaying(false);
                            String s5 = a8.p0.s(new StringBuilder(), chatActivityEnterView.K3, ".ogg");
                            if (MediaController.cropOpusFile(chatActivityEnterView.K3, s5, chatActivityEnterView.i1.getAudioLeftMs(), chatActivityEnterView.i1.getAudioRightMs())) {
                                try {
                                    new File(chatActivityEnterView.K3).delete();
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                }
                                try {
                                    new File(s5).renameTo(new File(chatActivityEnterView.K3));
                                } catch (Exception e11) {
                                    org.telegram.messenger.a8.g(e11, true);
                                }
                                int i16 = 0;
                                while (true) {
                                    if (i16 >= chatActivityEnterView.J3.attributes.size()) {
                                        break;
                                    }
                                    TLRPC.DocumentAttribute documentAttribute = chatActivityEnterView.J3.attributes.get(i16);
                                    if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                        documentAttribute.waveform = MediaController.getWaveform(chatActivityEnterView.K3);
                                        documentAttribute.duration = chatActivityEnterView.i1.getNewDuration();
                                        break;
                                    }
                                    i16++;
                                }
                            }
                        }
                        org.telegram.messenger.cz f10 = org.telegram.messenger.cz.f(chatActivityEnterView.J3, null, chatActivityEnterView.K3, chatActivityEnterView.y3, chatActivityEnterView.B3, chatActivityEnterView.getThreadMessage(), null, null, null, null, z10, i7, 0, chatActivityEnterView.P ? Integer.MAX_VALUE : 0, null, null, false);
                        f10.K = anVar2 != null ? anVar2.Y8() : null;
                        f10.O = this.n6;
                        f10.Q = j3;
                        f10.R = getSendMonoForumPeerId();
                        f10.T = getSendMessageSuggestionParams();
                        this.n6 = 0L;
                        heVar.setEffect(0L);
                        if (!this.H3.v1()) {
                            org.telegram.messenger.cj cjVar3 = new org.telegram.messenger.cj();
                            cjVar3.h = System.currentTimeMillis() - this.N0 < 200;
                            f10.E = cjVar3;
                        }
                        t(f10);
                        org.telegram.messenger.ez.C(this.R).r0(f10);
                        cg cgVar2 = this.H3;
                        if (cgVar2 != null) {
                            chatActivityEnterView4 = this;
                            cgVar2.M(null, z10, i7, i10, j3);
                        } else {
                            chatActivityEnterView4 = this;
                        }
                        chatActivityEnterView4.A0(true);
                        chatActivityEnterView4.N(true);
                        org.telegram.messenger.g0.i3(new uc(chatActivityEnterView4, 7), 100L);
                        chatActivityEnterView4.Q1 = 0L;
                        return false;
                    }
                    ChatActivityEnterView chatActivityEnterView5 = chatActivityEnterView;
                    long j10 = 200;
                    String str2 = "";
                    if (!chatActivityEnterView5.l2 || (richMessage = chatActivityEnterView5.m2) == null) {
                        org.telegram.ui.an anVar3 = anVar2;
                        int i17 = 1;
                        chatActivityEnterView2 = chatActivityEnterView5;
                        he heVar2 = heVar;
                        xe xeVar = chatActivityEnterView2.F0;
                        CharSequence textToUse = xeVar == null ? "" : xeVar.getTextToUse();
                        if (anVar3 != null && (chat2 = anVar3.e) != null && chat2.slowmode_enabled && !org.telegram.messenger.t3.N(chat2)) {
                            int length = textToUse.length();
                            int u12 = org.telegram.messenger.np.s1(chatActivityEnterView2.S.a).u1();
                            org.telegram.ui.ActionBar.e6 e6Var = chatActivityEnterView2.E4;
                            if (length > u12) {
                                t4.r0(anVar3, org.telegram.messenger.hd.M0(2131745310, "Slowmode"), org.telegram.messenger.hd.M0(2131745301, "SlowmodeSendErrorTooLong"), e6Var);
                            } else if (chatActivityEnterView2.p3 && textToUse.length() > 0) {
                                t4.r0(anVar3, org.telegram.messenger.hd.M0(2131745310, "Slowmode"), org.telegram.messenger.hd.M0(2131745302, "SlowmodeSendError"), e6Var);
                            }
                        }
                        if (!K(chatActivityEnterView2.R, chatActivityEnterView2.y3, anVar3, textToUse)) {
                            org.telegram.ui.qm qmVar = chatActivityEnterView2.D3;
                            if (qmVar == null || anVar3 == null || !qmVar.f) {
                                int[] iArr = new int[1];
                                org.telegram.messenger.j6.j(textToUse, iArr);
                                ?? r28 = 0;
                                ?? r16 = iArr[0] > 0;
                                CharSequence n1 = r16 == false ? org.telegram.messenger.g0.n1(textToUse) : textToUse;
                                boolean S1 = chatActivityEnterView2.S1();
                                int u13 = org.telegram.messenger.np.s1(chatActivityEnterView2.S.a).u1();
                                if (n1.length() != 0) {
                                    if (chatActivityEnterView2.H3 != null && anVar3 != null) {
                                        if ((i7 != 0) == anVar3.c()) {
                                            chatActivityEnterView2.H3.G0();
                                        }
                                    }
                                    int i18 = 0;
                                    while (true) {
                                        int i19 = i18 + u13;
                                        if (n1.length() > i19) {
                                            int i20 = i19 - 1;
                                            i12 = -1;
                                            i13 = -1;
                                            i14 = -1;
                                            for (int i21 = r28; i20 > i18 && i21 < 300; i21++) {
                                                char charAt = n1.charAt(i20);
                                                char charAt2 = i20 > 0 ? n1.charAt(i20 - 1) : ' ';
                                                if (charAt == '\n' && charAt2 == '\n') {
                                                    i11 = i20;
                                                    break;
                                                }
                                                if (charAt == '\n') {
                                                    i14 = i20;
                                                } else if (i12 < 0 && Character.isWhitespace(charAt) && charAt2 == '.') {
                                                    i12 = i20;
                                                } else if (i13 < 0 && Character.isWhitespace(charAt)) {
                                                    i13 = i20;
                                                }
                                                i20--;
                                            }
                                            i11 = -1;
                                        } else {
                                            i11 = -1;
                                            i12 = -1;
                                            i13 = -1;
                                            i14 = -1;
                                        }
                                        int min = Math.min(i19, n1.length());
                                        if (i11 > 0) {
                                            min = i11;
                                        } else if (i14 > 0) {
                                            min = i14;
                                        } else if (i12 > 0) {
                                            min = i12;
                                        } else if (i13 > 0) {
                                            min = i13;
                                        }
                                        CharSequence subSequence = n1.subSequence(i18, min);
                                        if (r16 == false) {
                                            subSequence = org.telegram.messenger.g0.n1(subSequence);
                                        }
                                        CharSequence[] charSequenceArr = new CharSequence[i17];
                                        charSequenceArr[r28] = subSequence;
                                        ArrayList W = org.telegram.messenger.si.b0(chatActivityEnterView2.R).W(charSequenceArr, S1, i17);
                                        if (!chatActivityEnterView2.H3.v1()) {
                                            cjVar2 = new org.telegram.messenger.cj();
                                            cjVar2.h = System.currentTimeMillis() - chatActivityEnterView2.N0 < j10 ? i17 : r28;
                                            cjVar2.c = org.telegram.messenger.g0.L(22.0f);
                                            xe xeVar2 = chatActivityEnterView2.F0;
                                            if (xeVar2 != null) {
                                                xeVar2.getLocationInWindow(chatActivityEnterView2.v3);
                                                cjVar2.a = org.telegram.messenger.g0.L(11.0f) + r13[r28];
                                                cjVar2.b = org.telegram.messenger.g0.L(19.0f) + r13[i17];
                                            } else {
                                                cjVar2.a = org.telegram.messenger.g0.L(55.0f);
                                                cjVar2.b = org.telegram.messenger.g0.q.y - org.telegram.messenger.g0.L(19.0f);
                                            }
                                        } else if (chatActivityEnterView2.M0 != null) {
                                            cjVar2 = new org.telegram.messenger.cj();
                                            cjVar2.h = System.currentTimeMillis() - chatActivityEnterView2.N0 < j10 ? i17 : r28;
                                        } else {
                                            cjVar = null;
                                            boolean h = org.telegram.messenger.ez.h(n1);
                                            threadMessage = chatActivityEnterView2.getThreadMessage();
                                            if (threadMessage == null && (gjVar = chatActivityEnterView2.C3) != null) {
                                                threadMessage = gjVar;
                                            }
                                            String charSequence3 = charSequenceArr[r28].toString();
                                            i15 = min;
                                            boolean z14 = S1;
                                            long j11 = chatActivityEnterView2.y3;
                                            he heVar3 = heVar2;
                                            org.telegram.messenger.gj gjVar3 = chatActivityEnterView2.B3;
                                            TLRPC.WebPage webPage2 = chatActivityEnterView2.F3;
                                            charSequence = n1;
                                            boolean z15 = chatActivityEnterView2.G3;
                                            charSequence2 = textToUse;
                                            str = str2;
                                            anVar = anVar3;
                                            org.telegram.messenger.cz b10 = org.telegram.messenger.cz.b(charSequence3, j11, gjVar3, threadMessage, webPage2, z15, W, null, null, z10, i7, i10, cjVar, h);
                                            b10.K = anVar == null ? anVar.Y8() : null;
                                            b10.O = this.n6;
                                            b10.Q = j3;
                                            b10.R = getSendMonoForumPeerId();
                                            b10.T = getSendMessageSuggestionParams();
                                            this.n6 = 0L;
                                            heVar3.setEffect(0L);
                                            t(b10);
                                            b10.L = anVar == null && (kjVar3 = anVar.w5) != null && kjVar3.r;
                                            if (anVar != null || (chat = anVar.e) == null || org.telegram.messenger.t3.m(chat)) {
                                                r32 = 0;
                                                r32 = 0;
                                                r32 = 0;
                                                z12 = false;
                                                webPage = this.F3;
                                                if (webPage instanceof TLRPC.TL_webPagePending) {
                                                    z13 = true;
                                                    if (webPage != null) {
                                                        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                                                        b10.n = tL_messageMediaWebPage;
                                                        tL_messageMediaWebPage.webpage = this.F3;
                                                        tL_messageMediaWebPage.force_large_media = (anVar == null || (kjVar2 = anVar.w5) == null || kjVar2.q) ? false : true;
                                                        tL_messageMediaWebPage.force_small_media = (anVar == null || (kjVar = anVar.w5) == null || !kjVar.q) ? false : true;
                                                    }
                                                } else {
                                                    z13 = true;
                                                    b10.u = true;
                                                    b10.n = null;
                                                }
                                            } else {
                                                z12 = false;
                                                b10.u = false;
                                                r32 = 0;
                                                b10.n = null;
                                                z13 = true;
                                            }
                                            if (anVar != null) {
                                                anVar.G5 = r32;
                                                anVar.X5 = r32;
                                                org.telegram.messenger.kj kjVar4 = anVar.w5;
                                                if (kjVar4 != null) {
                                                    kjVar4.e(this.R, null, "", null, null, null);
                                                }
                                                this.F3 = r32;
                                                this.G3 = z13;
                                                anVar.B8();
                                            }
                                            org.telegram.messenger.ez.C(this.R).r0(b10);
                                            int i22 = i15 + 1;
                                            if (i15 != charSequence.length()) {
                                                break;
                                            }
                                            heVar2 = heVar3;
                                            i17 = z13;
                                            r28 = z12;
                                            anVar3 = anVar;
                                            n1 = charSequence;
                                            S1 = z14;
                                            str2 = str;
                                            j10 = 200;
                                            i18 = i22;
                                            chatActivityEnterView2 = this;
                                            textToUse = charSequence2;
                                        }
                                        cjVar = cjVar2;
                                        boolean h7 = org.telegram.messenger.ez.h(n1);
                                        threadMessage = chatActivityEnterView2.getThreadMessage();
                                        if (threadMessage == null) {
                                            threadMessage = gjVar;
                                        }
                                        String charSequence32 = charSequenceArr[r28].toString();
                                        i15 = min;
                                        boolean z142 = S1;
                                        long j112 = chatActivityEnterView2.y3;
                                        he heVar32 = heVar2;
                                        org.telegram.messenger.gj gjVar32 = chatActivityEnterView2.B3;
                                        TLRPC.WebPage webPage22 = chatActivityEnterView2.F3;
                                        charSequence = n1;
                                        boolean z152 = chatActivityEnterView2.G3;
                                        charSequence2 = textToUse;
                                        str = str2;
                                        anVar = anVar3;
                                        org.telegram.messenger.cz b102 = org.telegram.messenger.cz.b(charSequence32, j112, gjVar32, threadMessage, webPage22, z152, W, null, null, z10, i7, i10, cjVar, h7);
                                        b102.K = anVar == null ? anVar.Y8() : null;
                                        b102.O = this.n6;
                                        b102.Q = j3;
                                        b102.R = getSendMonoForumPeerId();
                                        b102.T = getSendMessageSuggestionParams();
                                        this.n6 = 0L;
                                        heVar32.setEffect(0L);
                                        t(b102);
                                        b102.L = anVar == null && (kjVar3 = anVar.w5) != null && kjVar3.r;
                                        if (anVar != null) {
                                        }
                                        r32 = 0;
                                        r32 = 0;
                                        r32 = 0;
                                        z12 = false;
                                        webPage = this.F3;
                                        if (webPage instanceof TLRPC.TL_webPagePending) {
                                        }
                                        if (anVar != null) {
                                        }
                                        org.telegram.messenger.ez.C(this.R).r0(b102);
                                        int i222 = i15 + 1;
                                        if (i15 != charSequence.length()) {
                                        }
                                    }
                                    if (this.H3.v1() || (!(i7 == 0 || c()) || c())) {
                                        chatActivityEnterView3 = this;
                                        xe xeVar3 = chatActivityEnterView3.F0;
                                        if (xeVar3 != null) {
                                            xeVar3.setText(str);
                                        }
                                        cg cgVar3 = chatActivityEnterView3.H3;
                                        if (cgVar3 != null) {
                                            cgVar3.M(charSequence2, z10, i7, i10, j3);
                                        }
                                    } else {
                                        this.h0 = z12;
                                        org.telegram.messenger.mr mrVar = new org.telegram.messenger.mr(this, charSequence2, z10, i7, i10, j3);
                                        chatActivityEnterView3 = this;
                                        chatActivityEnterView3.g0 = mrVar;
                                        org.telegram.messenger.g0.i3(mrVar, 200L);
                                    }
                                    chatActivityEnterView3.k3 = 0L;
                                    chatActivityEnterView3.l2();
                                    return z12;
                                }
                                z12 = false;
                            } else {
                                anVar3.yc();
                                z12 = false;
                            }
                            chatActivityEnterView3 = chatActivityEnterView2;
                            if (chatActivityEnterView3.p3 && (cgVar = chatActivityEnterView3.H3) != null) {
                                cgVar.M(null, z10, i7, i10, j3);
                            }
                            chatActivityEnterView3.l2();
                            return z12;
                        }
                    } else {
                        org.telegram.messenger.ez.R(chatActivityEnterView5.S, richMessage.blocks, richMessage.photos, richMessage.documents, null, chatActivityEnterView5.y3, chatActivityEnterView5.B3, chatActivityEnterView5.getThreadMessage(), chatActivityEnterView5.D3, z10, i7, i10, anVar2 != null ? anVar2.Y8() : null, chatActivityEnterView5.n6, chatActivityEnterView5.getSendMonoForumPeerId(), j3);
                        chatActivityEnterView2 = this;
                        chatActivityEnterView2.n6 = 0L;
                        heVar.setEffect(0L);
                        chatActivityEnterView2.F0.setText("");
                        chatActivityEnterView2.R();
                        cg cgVar4 = chatActivityEnterView2.H3;
                        if (cgVar4 != null) {
                            cgVar4.M(null, z10, i7, i10, j3);
                        }
                        chatActivityEnterView2.N(true);
                    }
                }
            }
            return false;
        }
        cg cgVar5 = this.H3;
        if (cgVar5 != null) {
            cgVar5.Q0();
            return false;
        }
        chatActivityEnterView2 = this;
        return false;
    }

    public final void k2(boolean z10, boolean z11) {
        TLRPC.Chat chat;
        TLRPC.Peer peer;
        float f10;
        float f11;
        gn0 gn0Var;
        gn0 gn0Var2;
        ud udVar;
        if (this.H3 == null) {
            return;
        }
        Z();
        if (this.K6) {
            peer = this.H3.s();
            chat = null;
        } else {
            TLRPC.Chat M0 = org.telegram.messenger.np.s1(this.R).M0(Long.valueOf(-this.y3));
            TLRPC.ChatFull N0 = org.telegram.messenger.np.s1(this.R).N0(-this.y3);
            TLRPC.Peer peer2 = N0 != null ? N0.default_send_as : null;
            chat = M0;
            peer = peer2;
        }
        if (peer == null && this.H3.O() != null && !this.H3.O().peers.isEmpty()) {
            peer = this.H3.O().peers.get(0).peer;
        }
        org.telegram.ui.an anVar = this.x3;
        boolean z12 = (z10 || peer == null || (this.H3.O() != null && this.H3.O().peers.size() <= 1) || E0() || J0() || (((udVar = this.f1) != null && udVar.getVisibility() == 0) || ((!this.K6 && ((org.telegram.messenger.t3.V(chat) && !org.telegram.messenger.t3.k(chat)) || org.telegram.messenger.t3.p0(chat))) || (anVar != null && anVar.g4 == 9)))) ? false : true;
        if (z12) {
            f0();
        }
        if (peer != null) {
            if (peer.channel_id != 0) {
                TLRPC.Chat M02 = org.telegram.messenger.np.s1(this.R).M0(Long.valueOf(peer.channel_id));
                if (M02 != null && (gn0Var2 = this.q0) != null) {
                    gn0Var2.setAvatar(M02);
                    this.q0.setContentDescription(org.telegram.messenger.hd.a0(null, null, 2131754776, M02.title));
                }
            } else {
                TLRPC.User a22 = org.telegram.messenger.np.s1(this.R).a2(Long.valueOf(peer.user_id));
                if (a22 != null && (gn0Var = this.q0) != null) {
                    gn0Var.setAvatar(a22);
                    this.q0.setContentDescription(org.telegram.messenger.hd.a0(null, null, 2131754776, org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name)));
                }
            }
        }
        gn0 gn0Var3 = this.q0;
        boolean z13 = gn0Var3 != null && gn0Var3.getVisibility() == 0;
        int L = org.telegram.messenger.g0.L(2.0f);
        float f12 = z12 ? 0.0f : 1.0f;
        float f13 = z12 ? 1.0f : 0.0f;
        gn0 gn0Var4 = this.q0;
        if (gn0Var4 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) gn0Var4.getLayoutParams();
            f11 = z12 ? ((-this.q0.getLayoutParams().width) - marginLayoutParams.leftMargin) - L : 0.0f;
            f10 = z12 ? 0.0f : ((-this.q0.getLayoutParams().width) - marginLayoutParams.leftMargin) - L;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        if (z13 == z12) {
            return;
        }
        gn0 gn0Var5 = this.q0;
        ValueAnimator valueAnimator = gn0Var5 == null ? null : (ValueAnimator) gn0Var5.getTag();
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.q0.setTag(null);
        }
        if ((this.K6 || (anVar != null && anVar.b9() == 0 && anVar.f6)) && z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            gn0 gn0Var6 = this.q0;
            if (gn0Var6 != null) {
                gn0Var6.setTranslationX(f11);
            }
            this.H = f11;
            d2();
            float f14 = f10;
            float f15 = f13;
            float f16 = f11;
            duration.addUpdateListener(new i5(this, f16, f14, f12, f15, 1));
            duration.addListener(new of(this, z12, f12, f16, f15, f14));
            duration.start();
            gn0 gn0Var7 = this.q0;
            if (gn0Var7 != null) {
                gn0Var7.setTag(duration);
                return;
            }
            return;
        }
        float f17 = f10;
        float f18 = f13;
        boolean z14 = z12;
        if (z14) {
            f0();
        }
        gn0 gn0Var8 = this.q0;
        if (gn0Var8 != null) {
            gn0Var8.setVisibility(z14 ? 0 : 8);
            this.q0.setTranslationX(f17);
        }
        float f19 = z14 ? f17 : 0.0f;
        this.R0.setTranslationX(f19);
        this.H = f19;
        d2();
        gn0 gn0Var9 = this.q0;
        if (gn0Var9 != null) {
            gn0Var9.setAlpha(f18);
            this.q0.setTag(null);
        }
    }

    public final void l(TLRPC.Document document) {
        org.telegram.messenger.si.b0(this.R).c(document, (int) (System.currentTimeMillis() / 1000), true);
        sf sfVar = this.V0;
        if (sfVar == null || document == null) {
            return;
        }
        boolean isEmpty = sfVar.j1.isEmpty();
        sfVar.X();
        if (isEmpty) {
            sfVar.Y(false);
        }
    }

    public final boolean l0(Canvas canvas, org.telegram.messenger.r10 r10Var) {
        float f10;
        float f11;
        float f12;
        float f13;
        float d = this.A6.d(this.F0.canScrollVertically(-1));
        float d2 = this.B6.d(this.F0.canScrollVertically(1));
        if (d <= 0.0f && d2 <= 0.0f) {
            return ((Boolean) r10Var.run()).booleanValue();
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, this.F0.getX() + this.F0.getMeasuredWidth() + org.telegram.messenger.g0.L(5.0f), this.F0.getY() + this.F0.getMeasuredHeight() + org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.ns.e4, 31);
        boolean booleanValue = ((Boolean) r10Var.run()).booleanValue();
        canvas.save();
        LinearGradient linearGradient = this.y6;
        Paint paint = this.x6;
        Matrix matrix = this.z6;
        if (d > 0.0f) {
            RectF rectF = org.telegram.messenger.g0.P;
            f12 = 255.0f;
            f13 = 16.0f;
            f10 = 0.0f;
            f11 = 5.0f;
            rectF.set(this.F0.getX() - org.telegram.messenger.g0.L(5.0f), (this.F0.getY() + this.B2) - 1.0f, this.F0.getX() + this.F0.getMeasuredWidth() + org.telegram.messenger.g0.L(5.0f), this.F0.getY() + this.B2 + org.telegram.messenger.g0.L(13.0f));
            matrix.reset();
            matrix.postScale(1.0f, rectF.height() / 16.0f);
            matrix.postTranslate(rectF.left, rectF.top);
            linearGradient.setLocalMatrix(matrix);
            paint.setAlpha((int) (d * 255.0f));
            canvas.drawRect(rectF, paint);
        } else {
            f10 = 0.0f;
            f11 = 5.0f;
            f12 = 255.0f;
            f13 = 16.0f;
        }
        if (d2 > f10) {
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(this.F0.getX() - org.telegram.messenger.g0.L(f11), (this.F0.getY() + this.F0.getMeasuredHeight()) - org.telegram.messenger.g0.L(15.0f), this.F0.getX() + this.F0.getMeasuredWidth() + org.telegram.messenger.g0.L(f11), this.F0.getY() + this.F0.getMeasuredHeight() + org.telegram.messenger.g0.L(2.0f) + 1.0f);
            matrix.reset();
            matrix.postScale(1.0f, rectF2.height() / f13);
            matrix.postRotate(180.0f);
            matrix.postTranslate(rectF2.left, rectF2.bottom);
            linearGradient.setLocalMatrix(matrix);
            paint.setAlpha((int) (d2 * f12));
            canvas.drawRect(rectF2, paint);
        }
        canvas.restore();
        canvas.restore();
        return booleanValue;
    }

    public final void l1(boolean z10, boolean z11, boolean z12) {
        if ((this.r3 != z10 || this.s3 != z11) && this.V0 != null) {
            if (this.X0 && !z12) {
                this.o4 = true;
                y0(false);
            } else if (z12) {
                X0();
            }
        }
        this.q3 = true;
        this.r3 = z10;
        this.s3 = z11;
        sf sfVar = this.V0;
        if (sfVar != null) {
            sfVar.J(true, z10, z11, true);
        }
        t1(false, !this.R2);
    }

    public final void l2() {
        int b10;
        long starsPrice = getStarsPrice();
        if (starsPrice > 0) {
            starsPrice *= getMessagesCount();
        }
        if (this.c5 != starsPrice) {
            View sendButtonInternal = getSendButtonInternal();
            this.c5 = starsPrice;
            View sendButtonInternal2 = getSendButtonInternal();
            if (sendButtonInternal != sendButtonInternal2) {
                sendButtonInternal2.setVisibility(sendButtonInternal.getVisibility());
                sendButtonInternal2.setAlpha(sendButtonInternal.getAlpha());
                sendButtonInternal2.setScaleX(sendButtonInternal.getScaleX());
                sendButtonInternal2.setScaleY(sendButtonInternal.getScaleY());
                sendButtonInternal.setVisibility(8);
            }
            this.K0.i(1, starsPrice, true);
            b2(this.k6);
        }
        if (this.K6) {
            V();
            if (v()) {
                int[] iArr = org.telegram.messenger.np.s1(this.R).Y6;
                b10 = (iArr == null || iArr.length <= 2) ? 400 : iArr[2];
            } else {
                b10 = fi.t.b(this.R, (int) starsPrice, 1);
            }
            if (this.d0 != b10) {
                this.d0 = b10;
                if (b10 > 0) {
                    int i7 = b10 - this.e0;
                    if (i7 <= (this.K6 ? 5 : 100)) {
                        if (i7 < -9999) {
                            i7 = -9999;
                        }
                        V();
                        NumberTextView numberTextView = this.c0;
                        numberTextView.a(i7, numberTextView.getVisibility() == 0);
                        if (this.c0.getVisibility() != 0) {
                            this.c0.setVisibility(0);
                            this.c0.setAlpha(0.0f);
                            this.c0.setScaleX(0.5f);
                            this.c0.setScaleY(0.5f);
                        }
                        this.c0.animate().setListener(null).cancel();
                        this.c0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                        this.c0.setTextColor(u0(i7 < 0 ? org.telegram.ui.ActionBar.j6.p7 : org.telegram.ui.ActionBar.j6.y6));
                        return;
                    }
                }
                NumberTextView numberTextView2 = this.c0;
                if (numberTextView2 != null) {
                    numberTextView2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new ie(this, 0));
                }
            }
        }
    }

    public final void m(TLRPC.Document document) {
        X();
        sf sfVar = this.V0;
        int i7 = sfVar.d1;
        org.telegram.messenger.si.b0(i7).d(0, null, document, (int) (System.currentTimeMillis() / 1000), false);
        boolean isEmpty = sfVar.k1.isEmpty();
        sfVar.k1 = org.telegram.messenger.si.b0(i7).i0(0, true);
        dy dyVar = sfVar.z0;
        if (dyVar != null) {
            dyVar.f();
        }
        if (isEmpty) {
            sfVar.Y(false);
        }
    }

    public final void m0(FrameLayout frameLayout, Canvas canvas, float f10, float f11, float f12, float f13) {
        fh.g gVar;
        float f14;
        oi0 oi0Var = this.i1;
        float trimProgress = (oi0Var == null || !this.C1) ? 0.0f : oi0Var.getTrimProgress();
        if (trimProgress <= 0.0f || this.i1.getVisibility() != 0) {
            return;
        }
        oi0 oi0Var2 = this.i1;
        if (oi0Var2.T0 == null && f13 > f12) {
            oi0Var2.getLocationInWindow(this.l5);
            float trimHandleX = this.i1.getTrimHandleX() + r10[0];
            float N = org.telegram.messenger.g0.N(6.0f);
            float N2 = org.telegram.messenger.g0.N(11.0f);
            float trimWindowTop = ((this.i1.getTrimWindowTop() + r10[1]) - org.telegram.messenger.g0.N(4.0f)) - N;
            String trimBubbleText = this.i1.getTrimBubbleText();
            float L = org.telegram.messenger.g0.L(13.0f);
            TextPaint textPaint = this.f5;
            textPaint.setTextSize(L);
            textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
            textPaint.setColor(-1);
            float measureText = textPaint.measureText(trimBubbleText);
            float N3 = org.telegram.messenger.g0.N(23.0f) + measureText;
            float N4 = org.telegram.messenger.g0.N(29.0f);
            float max = Math.max(org.telegram.messenger.g0.L(8.0f), Math.min((org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(8.0f)) - N3, trimHandleX - (N3 / 2.0f)));
            RectF rectF = this.k5;
            rectF.set(max, trimWindowTop - N4, max + N3, trimWindowTop);
            float i7 = Utilities.i(trimHandleX, rectF.right - org.telegram.messenger.g0.L(16.0f), rectF.left + org.telegram.messenger.g0.L(16.0f));
            Path path = this.i5;
            path.rewind();
            float f15 = N4 / 2.0f;
            path.addRoundRect(rectF, f15, f15, Path.Direction.CW);
            Path path2 = this.j5;
            path2.rewind();
            float f16 = i7 - N2;
            path2.moveTo(f16, trimWindowTop - org.telegram.messenger.g0.N(2.0f));
            path2.lineTo(f16, trimWindowTop);
            float f17 = trimWindowTop + N;
            path2.cubicTo(i7 - org.telegram.messenger.g0.N(6.5f), trimWindowTop, i7 - org.telegram.messenger.g0.N(3.2f), f17, i7, f17);
            float N5 = org.telegram.messenger.g0.N(3.2f) + i7;
            float N7 = org.telegram.messenger.g0.N(6.5f) + i7;
            float f18 = i7 + N2;
            path2.cubicTo(N5, f17, N7, trimWindowTop, f18, trimWindowTop);
            path2.lineTo(f18, trimWindowTop - org.telegram.messenger.g0.N(2.0f));
            path2.close();
            path.op(path2, Path.Op.UNION);
            canvas.save();
            canvas.translate(-f10, -f11);
            canvas.clipRect(-100000.0f, f12, 100000.0f, f13);
            float T1 = org.telegram.messenger.g0.T1(0.8f, 1.0f, trimProgress);
            canvas.scale(T1, T1, i7, f17);
            canvas.translate(0.0f, (1.0f - trimProgress) * org.telegram.messenger.g0.L(6.0f));
            dh.c cVar = this.D1;
            if (cVar == null) {
                gVar = null;
            } else {
                boolean z10 = frameLayout != this;
                fh.g gVar2 = z10 ? this.n5 : this.o5;
                if (gVar2 == null) {
                    gVar = cVar.c(frameLayout, this.p5, false);
                    gVar.r(0.0f);
                    gVar.W = 0.0f;
                    if (z10) {
                        this.n5 = gVar;
                    } else {
                        this.o5 = gVar;
                    }
                } else {
                    gVar = gVar2;
                }
            }
            if (gVar != null) {
                canvas.save();
                canvas.clipPath(path);
                canvas.translate(f10, f11);
                f14 = 255.0f;
                gVar.setBounds((int) Math.floor(rectF.left - f10), (int) Math.floor(rectF.top - f11), (int) Math.ceil(rectF.right - f10), (int) Math.ceil(f17 - f11));
                gVar.setAlpha((int) (trimProgress * 255.0f));
                gVar.draw(canvas);
                canvas.restore();
            } else {
                f14 = 255.0f;
            }
            int r12 = org.telegram.ui.ActionBar.j6.r1((gVar != null ? 0.5f : 0.6f) * trimProgress, -16777216);
            Paint paint = this.g5;
            paint.setColor(r12);
            canvas.drawPath(path, paint);
            Paint.Style style = Paint.Style.STROKE;
            Paint paint2 = this.h5;
            paint2.setStyle(style);
            paint2.setStrokeWidth(org.telegram.messenger.g0.N(0.66f));
            paint2.setColor(org.telegram.ui.ActionBar.j6.r1(0.16f * trimProgress, -1));
            canvas.drawPath(path, paint2);
            textPaint.setAlpha((int) (trimProgress * f14));
            canvas.drawText(trimBubbleText, rectF.centerX() - (measureText / 2.0f), rectF.centerY() - ((textPaint.ascent() + textPaint.descent()) / 2.0f), textPaint);
            canvas.restore();
        }
    }

    public final void m1() {
        hi.l3 l3Var = this.M;
        if (l3Var == null) {
            return;
        }
        l3Var.u(org.telegram.messenger.j6.o(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131743762, org.telegram.messenger.q10.j(this.x3.j(), true))), this.M.getTextPaint().getFontMetricsInt(), 20, new nd(this, 4)));
        hi.l3 l3Var2 = this.M;
        l3Var2.h = hi.l3.a(l3Var2.getText(), this.M.getTextPaint());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
    
        if (((java.lang.Integer) org.telegram.messenger.ez.C(r9.R).f.g(0, r9.y3)).intValue() > 0) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2() {
        int i7;
        int currentTime = ConnectionsManager.getInstance(this.R).getCurrentTime();
        org.telegram.messenger.g0.r(this.I0);
        this.I0 = null;
        TLRPC.ChatFull chatFull = this.L2;
        if (chatFull != null && chatFull.slowmode_seconds != 0 && chatFull.slowmode_next_send_date <= currentTime) {
            boolean z10 = ((Integer) org.telegram.messenger.ez.C(this.R).h.g(0, this.y3)).intValue() > 0;
            if (!z10) {
            }
            if (!org.telegram.messenger.t3.N(org.telegram.messenger.np.s1(this.S.a).M0(Long.valueOf(this.L2.id))) && !org.telegram.messenger.t3.i0(this.L2)) {
                i7 = this.L2.slowmode_seconds;
                this.H0 = z10 ? ConnectionsManager.DEFAULT_DATACENTER_ID : 2147483646;
                if (this.H0 != 0 || i7 <= 0) {
                    this.H0 = 0;
                } else {
                    String h02 = org.telegram.messenger.g0.h0(Math.max(1, i7), false);
                    kg kgVar = this.G0;
                    ((org.telegram.ui.ActionBar.j5) kgVar.c).l(h02, false);
                    kgVar.invalidate();
                    cg cgVar = this.H3;
                    if (cgVar != null) {
                        cgVar.s1(kgVar, ((org.telegram.ui.ActionBar.j5) kgVar.c).getText(), false);
                    }
                    uc ucVar = new uc(this, 14);
                    this.I0 = ucVar;
                    org.telegram.messenger.g0.i3(ucVar, 100L);
                }
                if (c()) {
                    N(true);
                    return;
                }
                return;
            }
            i7 = 0;
            if (this.H0 != 0) {
            }
            this.H0 = 0;
            if (c()) {
            }
        }
        int i10 = this.H0;
        if (i10 >= 2147483646) {
            if (this.L2 != null) {
                org.telegram.messenger.np.s1(this.S.a).V2(0, this.L2.id, true);
            }
            i7 = 0;
            if (this.H0 != 0) {
            }
            this.H0 = 0;
            if (c()) {
            }
        } else {
            i7 = i10 - currentTime;
            if (this.H0 != 0) {
            }
            this.H0 = 0;
            if (c()) {
            }
        }
    }

    public final ValueAnimator n(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r2.a, f10);
        ofFloat.addUpdateListener(new gd(this, 5));
        return ofFloat;
    }

    public final nf n0(org.telegram.messenger.gj gjVar, boolean z10) {
        nf nfVar = new nf(gjVar.K1, gjVar.k, true, true);
        if (z10) {
            xe xeVar = this.F0;
            CharSequence[] charSequenceArr = {xeVar == null ? "" : xeVar.getTextToUse()};
            ArrayList W = org.telegram.messenger.si.b0(this.R).W(charSequenceArr, true, true);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceArr[0].toString());
            org.telegram.messenger.gj.b(spannableStringBuilder, W, true, true, false, true, 0);
            nfVar.z = org.telegram.messenger.gj.B5(org.telegram.messenger.j6.m(spannableStringBuilder, org.telegram.ui.ActionBar.j6.o2.getFontMetricsInt(), false, null, 0), W, org.telegram.ui.ActionBar.j6.o2.getFontMetricsInt(), false);
        }
        return nfVar;
    }

    public final void n1(a0.h hVar, boolean z10) {
        this.w6 = hVar;
        if (hVar.m() == 1 && ((TL_bots.BotInfo) hVar.n(0)).user_id == this.y3) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) hVar.n(0);
            TL_bots.BotMenuButton botMenuButton = botInfo.menu_button;
            if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                this.j0 = tL_botMenuButton.text;
                this.k0 = tL_botMenuButton.url;
                this.L6 = 3;
            } else if (botInfo.commands.isEmpty()) {
                this.L6 = 1;
            } else {
                this.L6 = 2;
            }
        } else {
            this.L6 = 1;
        }
        ki.z zVar = this.o0;
        if (zVar != null) {
            zVar.E(hVar);
        }
        V1(z10);
        J(z10);
    }

    public final long n2(String str, Runnable runnable) {
        long j3;
        RecordCircle recordCircle;
        if (this.n3 || this.J3 == null) {
            j3 = 0;
        } else {
            g1();
            j3 = Math.max(0L, 420L);
        }
        if (this.n3 || ((recordCircle = this.v2) != null && ChatActivityEnterView.this.a5)) {
            this.Q1 = 0L;
            this.w1 = true;
            try {
                D();
            } finally {
                this.w1 = false;
            }
        }
        org.telegram.messenger.g0.i3(new ki.n(this, str, runnable, 28), j3);
        return j3;
    }

    public final ValueAnimator o(boolean z10) {
        final float alpha = getSendButtonInternal().getAlpha();
        final float f10 = z10 ? 1.0f : 0.0f;
        final float scaleX = getSendButtonInternal().getScaleX();
        final float f11 = z10 ? 1.0f : 0.1f;
        final float scaleY = getSendButtonInternal().getScaleY();
        final float f12 = z10 ? 1.0f : 0.1f;
        if (z10 && alpha < 0.25f && (getSendButtonInternal() instanceof jg) && SystemClock.uptimeMillis() > this.A1) {
            jg jgVar = (jg) getSendButtonInternal();
            jgVar.n0.e(true, 0.0f);
            jgVar.invalidate();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.id
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i7 = ChatActivityEnterView.N6;
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                chatActivityEnterView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.getSendButtonInternal().setAlpha(org.telegram.messenger.g0.T1(alpha, f10, floatValue));
                chatActivityEnterView.getSendButtonInternal().setScaleX(org.telegram.messenger.g0.T1(scaleX, f11, floatValue));
                chatActivityEnterView.getSendButtonInternal().setScaleY(org.telegram.messenger.g0.T1(scaleY, f12, floatValue));
            }
        });
        return ofFloat;
    }

    public final ai.n0 o0() {
        if (this.j1 == null) {
            this.j1 = new ai.n0(getContext(), new ae(this, 3));
        }
        return this.j1;
    }

    public final void o1(int i7, boolean z10, boolean z11) {
        this.W2 = i7;
        if (this.X2 == z10) {
            return;
        }
        this.X2 = z10;
        V1(z11);
    }

    public final boolean o2() {
        xe xeVar;
        if (this.l1 && ((xeVar = this.F0) == null || xeVar.length() == 0)) {
            this.l1 = false;
        }
        return this.l1;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        oe oeVar = this.r0;
        if (oeVar != null) {
            oeVar.e = false;
            oeVar.dismiss();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        k0(canvas, true);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View X;
        if (this.n3) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0 && (X = org.telegram.messenger.g0.X(this, motionEvent.getX(), motionEvent.getY())) != this.M && X != this.N) {
            x0();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        ve veVar;
        super.onLayout(z10, i7, i10, i11, i12);
        if (this.u6 == -1 || (veVar = this.n0) == null) {
            return;
        }
        v4.b0 b0Var = (v4.b0) veVar.c.getLayoutManager();
        if (b0Var != null) {
            b0Var.h1(this.u6, this.v6);
        }
        this.u6 = -1;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        ud udVar = this.h2;
        int measuredHeight = udVar.getMeasuredHeight();
        ki.a0 a0Var = this.m0;
        ImageView imageView = this.S0;
        wd wdVar = this.R0;
        int i11 = 0;
        if (a0Var == null || a0Var.getTag() == null) {
            gn0 gn0Var = this.q0;
            if (gn0Var == null || gn0Var.getVisibility() != 0) {
                ((ViewGroup.MarginLayoutParams) wdVar.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(3.0f);
                if (imageView != null) {
                    ((ViewGroup.MarginLayoutParams) imageView.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(3.0f);
                }
                xe xeVar = this.F0;
                if (xeVar != null) {
                    ((ViewGroup.MarginLayoutParams) xeVar.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(50.0f);
                }
                org.telegram.messenger.xt xtVar = this.k2;
                if (xtVar != null) {
                    ((ViewGroup.MarginLayoutParams) xtVar.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(50.0f);
                }
            } else {
                int i12 = this.q0.getLayoutParams().width;
                this.q0.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.q0.getLayoutParams().height, TLObject.FLAG_30));
                ((ViewGroup.MarginLayoutParams) wdVar.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(7.0f) + i12;
                if (imageView != null) {
                    ((ViewGroup.MarginLayoutParams) imageView.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(7.0f) + i12;
                }
                xe xeVar2 = this.F0;
                if (xeVar2 != null) {
                    ((ViewGroup.MarginLayoutParams) xeVar2.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(54.0f) + i12;
                }
                org.telegram.messenger.xt xtVar2 = this.k2;
                if (xtVar2 != null) {
                    ((ViewGroup.MarginLayoutParams) xtVar2.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(54.0f) + i12;
                }
            }
        } else {
            this.m0.measure(i7, i10);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) wdVar.getLayoutParams();
            int L = org.telegram.messenger.g0.L(10.0f);
            ki.a0 a0Var2 = this.m0;
            marginLayoutParams.leftMargin = L + (a0Var2 == null ? 0 : a0Var2.getMeasuredWidth());
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int L2 = org.telegram.messenger.g0.L(10.0f);
                ki.a0 a0Var3 = this.m0;
                marginLayoutParams2.leftMargin = L2 + (a0Var3 == null ? 0 : a0Var3.getMeasuredWidth());
            }
            xe xeVar3 = this.F0;
            if (xeVar3 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) xeVar3.getLayoutParams();
                int L3 = org.telegram.messenger.g0.L(57.0f);
                ki.a0 a0Var4 = this.m0;
                marginLayoutParams3.leftMargin = L3 + (a0Var4 == null ? 0 : a0Var4.getMeasuredWidth());
            }
            org.telegram.messenger.xt xtVar3 = this.k2;
            if (xtVar3 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) xtVar3.getLayoutParams();
                int L4 = org.telegram.messenger.g0.L(57.0f);
                ki.a0 a0Var5 = this.m0;
                marginLayoutParams4.leftMargin = L4 + (a0Var5 == null ? 0 : a0Var5.getMeasuredWidth());
            }
        }
        W1();
        super.onMeasure(i7, i10);
        ki.o3 o3Var = this.l0;
        if (o3Var != null) {
            ki.a0 a0Var6 = this.m0;
            if (a0Var6 != null) {
                o3Var.setMeasuredButtonWidth(a0Var6.getMeasuredWidth());
            }
            this.l0.getLayoutParams().height = getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f);
            measureChild(this.l0, i7, i10);
        }
        P();
        Q();
        if (measuredHeight <= 0 || udVar.getMeasuredHeight() == measuredHeight) {
            return;
        }
        while (i11 < 2) {
            ImageView imageView2 = i11 == 0 ? this.b2 : this.c2;
            imageView2.setTranslationY((imageView2.getTranslationY() + udVar.getMeasuredHeight()) - measuredHeight);
            imageView2.animate().translationY(0.0f).setInterpolator(er.h).setDuration(420L).start();
            i11++;
        }
        hi.l3 l3Var = this.N;
        if (l3Var != null) {
            l3Var.setTranslationY((l3Var.getTranslationY() + udVar.getMeasuredHeight()) - measuredHeight);
            org.telegram.messenger.i20.n(this.N.animate().translationY(0.0f), er.h, 420L);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        if (i7 != i11 && this.h4) {
            D1(0, false);
            this.V0.t(false);
            E1(false, false, false, true);
        }
        i61 i61Var = this.g1;
        if (i61Var != null) {
            ArrayList arrayList = i61Var.w;
            if (i61Var.O.isEmpty()) {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    Bitmap bitmap = (Bitmap) arrayList.get(i13);
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                }
            }
            arrayList.clear();
            f61 f61Var = i61Var.x;
            if (f61Var != null) {
                f61Var.cancel(true);
                i61Var.x = null;
            }
            i61Var.invalidate();
        }
    }

    public final void p() {
        float min;
        fh0 fh0Var = this.h1;
        if (fh0Var == null || fh0Var.getAnimatedDrawable() != this.s5) {
            return;
        }
        float f10 = this.w5;
        if (f10 < 0.72f) {
            float f11 = this.v5;
            min = ((f10 / 0.72f) * 22.0f * f11) + (8.0f * f11);
        } else {
            min = (Math.min(1.0f, (f10 - 0.72f) / 0.22999996f) * 14.0f) + 30.0f;
        }
        this.h1.setProgress(min / 52.0f);
        if (this.h1 == null) {
            return;
        }
        float f12 = this.w5;
        float i7 = f12 < 0.72f ? this.v5 : 1.0f - Utilities.i((f12 - 0.72f) / 0.22999996f, 1.0f, 0.0f);
        float f13 = (3.0f - (i7 * 2.0f)) * i7 * i7 * 12.0f;
        float L = org.telegram.messenger.g0.L(12.0f);
        this.h1.setPivotX(r5.getWidth() / 2.0f);
        this.h1.setPivotY((r5.getHeight() / 2.0f) + L);
        this.h1.setRotation(f13);
        if (this.i1 != null) {
            double radians = Math.toRadians(f13);
            float L2 = L + org.telegram.messenger.g0.L(3.0f);
            oi0 oi0Var = this.i1;
            float sin = ((float) Math.sin(radians)) * L2;
            float cos = (1.0f - ((float) Math.cos(radians))) * L2;
            nu0 nu0Var = oi0Var.J0;
            nu0Var.R = sin;
            nu0Var.S = cos;
            oi0Var.invalidate();
        }
    }

    public final ji.m p0() {
        if (this.k1 == null) {
            this.k1 = new ji.m(getContext(), new gf(this));
        }
        return this.k1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0099, code lost:
    
        if (r7.getInt("answered_" + getTopicKeyString(), 0) != r5.e1()) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bd, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00bb, code lost:
    
        if (r7.getInt("closed_botkeyboard_" + getTopicKeyString(), 0) == r5.e1()) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p1(org.telegram.messenger.gj gjVar, boolean z10, boolean z11) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        xe xeVar;
        org.telegram.messenger.gj gjVar2 = this.B3;
        if (gjVar2 != null && gjVar2 == this.U2 && gjVar2 != gjVar) {
            this.E3 = gjVar;
            return;
        }
        org.telegram.messenger.gj gjVar3 = this.U2;
        if (gjVar3 == null || gjVar3 != gjVar) {
            if (gjVar3 == null && gjVar == null) {
                return;
            }
            if (this.p2 == null) {
                pf pfVar = new pf(this, this.w3, this.E4);
                this.p2 = pfVar;
                pfVar.setVisibility(8);
                this.Y0 = false;
                this.p2.setDelegate(new hd(this));
                this.V1.addView(this.p2);
            }
            this.U2 = gjVar;
            if (gjVar != null) {
                TLRPC.ReplyMarkup replyMarkup = gjVar.k.reply_markup;
                if (replyMarkup instanceof TLRPC.TL_replyKeyboardMarkup) {
                    tL_replyKeyboardMarkup = (TLRPC.TL_replyKeyboardMarkup) replyMarkup;
                    this.V2 = tL_replyKeyboardMarkup;
                    pf pfVar2 = this.p2;
                    Point point = org.telegram.messenger.g0.q;
                    pfVar2.setPanelHeight(point.x <= point.y ? this.g3 : this.f3);
                    if (this.V2 == null) {
                        SharedPreferences sharedPreferences = org.telegram.messenger.np.s1(this.R).f7;
                        if (this.U2 != this.B3 && gjVar != null) {
                            if (this.V2.single_use) {
                            }
                            if (!this.V2.is_persistent) {
                            }
                        }
                        boolean z12 = true;
                        boolean z13 = z10 ? z12 : false;
                        this.p2.setButtons(this.V2);
                        if (z13 && (((xeVar = this.F0) == null || xeVar.length() == 0) && !G0())) {
                            L1(1, 1, true, true);
                        }
                    } else if (G0() && this.N2 == 1) {
                        if (z11) {
                            this.X3 = true;
                            X0();
                        } else {
                            L1(0, 1, true, true);
                        }
                    }
                    V1(true);
                }
            }
            tL_replyKeyboardMarkup = null;
            this.V2 = tL_replyKeyboardMarkup;
            pf pfVar22 = this.p2;
            Point point2 = org.telegram.messenger.g0.q;
            pfVar22.setPanelHeight(point2.x <= point2.y ? this.g3 : this.f3);
            if (this.V2 == null) {
            }
            V1(true);
        }
    }

    public final void p2(int i7) {
        int i10;
        if (this.k1 != null || c8.z0.b()) {
            ji.m mVar = this.k1;
            if (mVar != null && mVar.J && ((i10 = mVar.c) == 2 || i10 == 4)) {
                if (i7 != 1 && i7 != 2 && i7 != 4 && i7 != 5) {
                    org.telegram.messenger.g0.h3(new nd(this, 1));
                    return;
                }
                mVar.g("field: record state " + i7, true);
                return;
            }
            if (mVar == null || mVar.c != 3) {
                if (i7 == 0) {
                    org.telegram.messenger.g0.h3(new nd(this, 1));
                    return;
                } else {
                    if (mVar != null) {
                        mVar.g("record state " + i7, true);
                        return;
                    }
                    return;
                }
            }
            if (i7 == 1 || i7 == 2 || i7 == 4 || i7 == 5 || i7 == 0) {
                mVar.g("review: record state " + i7, true);
            }
        }
    }

    public final void q1(org.telegram.messenger.gj gjVar, String str, boolean z10, boolean z11) {
        xe xeVar;
        org.telegram.messenger.cz b10;
        String sb2;
        if (str == null || getVisibility() != 0 || (xeVar = this.F0) == null) {
            return;
        }
        r16 = null;
        TLRPC.User user = null;
        if (!z10) {
            if (this.H0 > 0 && !c()) {
                cg cgVar = this.H3;
                if (cgVar != null) {
                    kg kgVar = this.G0;
                    cgVar.s1(kgVar, ((org.telegram.ui.ActionBar.j5) kgVar.c).getText(), true);
                    return;
                }
                return;
            }
            TLRPC.User a22 = (gjVar == null || !org.telegram.messenger.m5.z(this.y3)) ? null : org.telegram.messenger.np.s1(this.S.a).a2(Long.valueOf(gjVar.k.from_id.user_id));
            if ((this.W2 != 1 || z11) && a22 != null && a22.bot && !str.contains("@")) {
                Locale locale = Locale.US;
                b10 = org.telegram.messenger.cz.b(a8.p0.E(str, "@", org.telegram.messenger.q10.n(a22)), this.y3, this.B3, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
            } else {
                b10 = org.telegram.messenger.cz.b(str, this.y3, this.B3, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
            }
            org.telegram.ui.an anVar = this.x3;
            b10.K = anVar != null ? anVar.Y8() : null;
            b10.O = this.n6;
            this.n6 = 0L;
            this.K0.setEffect(0L);
            t(b10);
            org.telegram.messenger.ez.C(this.R).r0(b10);
            return;
        }
        String obj = xeVar.getText().toString();
        if (gjVar != null && org.telegram.messenger.m5.z(this.y3)) {
            user = org.telegram.messenger.np.s1(this.S.a).a2(Long.valueOf(gjVar.k.from_id.user_id));
        }
        TLRPC.User user2 = user;
        if ((this.W2 != 1 || z11) && user2 != null && user2.bot && !str.contains("@")) {
            StringBuilder sb3 = new StringBuilder();
            Locale locale2 = Locale.US;
            sb3.append(str + "@" + org.telegram.messenger.q10.n(user2));
            sb3.append(" ");
            sb3.append(obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
            sb2 = sb3.toString();
        } else {
            StringBuilder m10 = r.b.m(str, " ");
            m10.append(obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
            sb2 = m10.toString();
        }
        this.z3 = true;
        this.F0.setText(sb2);
        xe xeVar2 = this.F0;
        xeVar2.setSelection(xeVar2.getText().length());
        this.z3 = false;
        cg cgVar2 = this.H3;
        if (cgVar2 != null) {
            cgVar2.j1(this.F0.getText(), true, false);
        }
        if (this.h3 || this.N2 != -1) {
            return;
        }
        W0();
    }

    public final void q2() {
        if ((this.k1 != null || c8.z0.a()) && !this.G2) {
            p0().s();
        }
    }

    public final void r(boolean z10) {
        ch0 ch0Var;
        int i7 = 1;
        boolean z11 = (this.d1 || this.i1 == null) ? false : true;
        this.J5 = z11;
        boolean z12 = this.C1;
        uc ucVar = this.P1;
        if (z12 == z11 && (!z11 || this.L1 != null)) {
            if (z11) {
                G1(false, false);
                z1(z10);
                org.telegram.messenger.g0.r(ucVar);
                org.telegram.messenger.g0.i3(ucVar, 700L);
                return;
            }
            return;
        }
        this.C1 = z11;
        this.i1.setNewStyle(z11);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.i1.getLayoutParams();
        layoutParams.height = org.telegram.messenger.g0.L(32.0f);
        layoutParams.gravity = z11 ? 83 : 19;
        layoutParams.bottomMargin = z11 ? org.telegram.messenger.g0.L(8.0f) : 0;
        layoutParams.leftMargin = org.telegram.messenger.g0.L(z11 ? 45.0f : 44.0f);
        layoutParams.rightMargin = org.telegram.messenger.g0.L(z11 ? 5.0f : 4.0f);
        this.i1.setLayoutParams(layoutParams);
        fh0 fh0Var = this.h1;
        if (fh0Var != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) fh0Var.getLayoutParams();
            layoutParams2.gravity = z11 ? 83 : 51;
            this.h1.setLayoutParams(layoutParams2);
            if (z11) {
                if (this.s5 == null) {
                    ch0 ch0Var2 = new ch0(R.raw.chat_audio_record_delete_outline, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), false, null);
                    this.s5 = ch0Var2;
                    ch0Var2.J(true);
                }
                ch0Var = this.s5;
            } else {
                ch0Var = this.t5;
            }
            if (ch0Var != null && this.h1.getAnimatedDrawable() != ch0Var) {
                this.h1.setAnimation(ch0Var);
                ch0Var.p0 = ch0Var != this.s5;
                g2();
                this.h1.setProgress(0.0f);
            }
        }
        this.f1.setClipChildren(!z11);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f1.getLayoutParams();
        layoutParams3.height = z11 ? -2 : org.telegram.messenger.g0.L(44.0f);
        this.f1.setLayoutParams(layoutParams3);
        this.f1.setMinimumHeight(z11 ? org.telegram.messenger.g0.L(44.0f) : 0);
        if (!z11) {
            z1(false);
            this.i1.setNewStyleDelegate(null);
            yh.a aVar = this.L1;
            if (aVar != null) {
                this.f1.removeView(aVar);
                this.L1 = null;
                return;
            }
            return;
        }
        this.i1.setNewStyleDelegate(new ae(this, i7));
        if (this.L1 == null) {
            yh.a aVar2 = new yh.a(getContext(), this.E4, new be(this, i7));
            this.L1 = aVar2;
            this.f1.addView(aVar2, c8.ja.d(-1, -2.0f, 80, 48.0f, 0.0f, 0.0f, 0.0f));
        }
        G1(false, false);
        z1(z10);
        org.telegram.messenger.g0.r(ucVar);
        org.telegram.messenger.g0.i3(ucVar, 700L);
    }

    public final jh.f r0() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof jh.f) {
                return (jh.f) parent;
            }
        }
        return null;
    }

    public final void r1(int i7, long j3) {
        this.y3 = j3;
        if (this.R != i7) {
            this.t4.e();
            org.telegram.messenger.ns f10 = org.telegram.messenger.ns.f(this.R);
            int i10 = org.telegram.messenger.ns.l2;
            f10.n(this, i10);
            org.telegram.messenger.ns f11 = org.telegram.messenger.ns.f(this.R);
            int i11 = org.telegram.messenger.ns.o2;
            f11.n(this, i11);
            org.telegram.messenger.ns f12 = org.telegram.messenger.ns.f(this.R);
            int i12 = org.telegram.messenger.ns.p2;
            f12.n(this, i12);
            org.telegram.messenger.ns f13 = org.telegram.messenger.ns.f(this.R);
            int i13 = org.telegram.messenger.ns.m2;
            f13.n(this, i13);
            org.telegram.messenger.ns f14 = org.telegram.messenger.ns.f(this.R);
            int i14 = org.telegram.messenger.ns.n2;
            f14.n(this, i14);
            org.telegram.messenger.ns f15 = org.telegram.messenger.ns.f(this.R);
            int i15 = org.telegram.messenger.ns.k2;
            f15.n(this, i15);
            org.telegram.messenger.ns f16 = org.telegram.messenger.ns.f(this.R);
            int i16 = org.telegram.messenger.ns.t;
            f16.n(this, i16);
            org.telegram.messenger.ns f17 = org.telegram.messenger.ns.f(this.R);
            int i17 = org.telegram.messenger.ns.s2;
            f17.n(this, i17);
            org.telegram.messenger.ns f18 = org.telegram.messenger.ns.f(this.R);
            int i18 = org.telegram.messenger.ns.u2;
            f18.n(this, i18);
            org.telegram.messenger.ns f19 = org.telegram.messenger.ns.f(this.R);
            int i19 = org.telegram.messenger.ns.e2;
            f19.n(this, i19);
            org.telegram.messenger.ns f20 = org.telegram.messenger.ns.f(this.R);
            int i20 = org.telegram.messenger.ns.z0;
            f20.n(this, i20);
            org.telegram.messenger.ns f21 = org.telegram.messenger.ns.f(this.R);
            int i21 = org.telegram.messenger.ns.L;
            f21.n(this, i21);
            org.telegram.messenger.ns f22 = org.telegram.messenger.ns.f(this.R);
            int i22 = org.telegram.messenger.ns.n1;
            f22.n(this, i22);
            org.telegram.messenger.ns f23 = org.telegram.messenger.ns.f(this.R);
            int i23 = org.telegram.messenger.ns.t2;
            f23.n(this, i23);
            org.telegram.messenger.ns f24 = org.telegram.messenger.ns.f(this.R);
            int i24 = org.telegram.messenger.ns.R2;
            f24.n(this, i24);
            org.telegram.messenger.ns f25 = org.telegram.messenger.ns.f(this.R);
            int i25 = org.telegram.messenger.ns.Y2;
            f25.n(this, i25);
            org.telegram.messenger.ns f26 = org.telegram.messenger.ns.f(this.R);
            int i26 = org.telegram.messenger.ns.f5;
            f26.n(this, i26);
            this.R = i7;
            this.S = org.telegram.messenger.c.a(i7);
            org.telegram.messenger.ns.f(this.R).c(this, i10);
            org.telegram.messenger.ns.f(this.R).c(this, i11);
            org.telegram.messenger.ns.f(this.R).c(this, i12);
            org.telegram.messenger.ns.f(this.R).c(this, i13);
            org.telegram.messenger.ns.f(this.R).c(this, i14);
            org.telegram.messenger.ns.f(this.R).c(this, i15);
            org.telegram.messenger.ns.f(this.R).c(this, i16);
            org.telegram.messenger.ns.f(this.R).c(this, i17);
            org.telegram.messenger.ns.f(this.R).c(this, i18);
            org.telegram.messenger.ns.f(this.R).c(this, i19);
            org.telegram.messenger.ns.f(this.R).c(this, i20);
            org.telegram.messenger.ns.f(this.R).c(this, i21);
            org.telegram.messenger.ns.f(this.R).c(this, i22);
            org.telegram.messenger.ns.f(this.R).c(this, i23);
            org.telegram.messenger.ns.f(this.R).c(this, i24);
            org.telegram.messenger.ns.f(this.R).c(this, i25);
            org.telegram.messenger.ns.f(this.R).c(this, i26);
        }
        this.A0 = true;
        if (org.telegram.messenger.m5.z(this.y3)) {
            this.A0 = org.telegram.messenger.t3.q(org.telegram.messenger.np.s1(this.S.a).M0(Long.valueOf(-this.y3)));
        }
        i2(false);
        c2(false);
        M();
        I();
        a2(false);
        if (this.F0 != null) {
            org.telegram.ui.an anVar = this.x3;
            j2(anVar != null && anVar.getFragmentBeginToShow());
        }
    }

    public final void s(float f10) {
        float i7 = Utilities.i((f10 - 0.1f) / 0.9f, 1.0f, 0.0f);
        this.n = u2(0.12f, 0.6f, f10) * (this.B0 ? 0.5f : 1.0f);
        float i10 = Utilities.i(i7, 1.0f, 0.0f) - 1.0f;
        this.h = org.telegram.messenger.g0.T1(0.55f, 1.0f, com.google.android.gms.internal.vision.e2.x(i10, 1.1f, i10, (2.1f * i10 * i10 * i10) + 1.0f));
        Z1();
        this.R0.setRotation((1.0f - er.h.getInterpolation(i7)) * (-20.0f));
    }

    public final long s0() {
        if (this.y1 <= 0) {
            return 250L;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j3 = this.y1;
        if (uptimeMillis < j3) {
            return Math.max(16L, j3 - SystemClock.uptimeMillis());
        }
        return 250L;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s1(org.telegram.messenger.gj gjVar, org.telegram.messenger.bj bjVar, boolean z10) {
        float f10;
        float f11;
        int i7;
        ud udVar;
        CharSequence charSequence;
        CharSequence charSequence2;
        int i10;
        xe xeVar;
        xe xeVar2;
        ud udVar2;
        boolean z11;
        je jeVar;
        if (this.J3 == null && this.M3 == null && this.H2 != gjVar) {
            Z();
            boolean z12 = this.H2 != null;
            this.H2 = gjVar;
            this.I2 = z10;
            ud udVar3 = this.i2;
            org.telegram.ui.z51 z51Var = this.X1;
            ImageView imageView = this.Q0;
            zd zdVar = this.Z1;
            ee eeVar = this.a1;
            if (gjVar != null) {
                this.m6 = bjVar != null ? bjVar.j : gjVar.k.invert_media;
                W(false);
                this.n2.setOnClickListener(new xc(this, 19));
                if (this.H2.p5()) {
                    long j3 = this.c5;
                    if (j3 > 0) {
                        this.n2.i(1, j3, true);
                        this.n2.setLayoutParams(c8.ja.e(44, 44, 85));
                        this.n2.requestLayout();
                        udVar = udVar3;
                        this.n2.setOnLongClickListener(new i(this, gjVar, bjVar, 1));
                        this.n2.setVisibility(0);
                        this.n2.setScaleX(0.1f);
                        this.n2.setScaleY(0.1f);
                        this.n2.setAlpha(0.0f);
                        this.n2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(er.f).start();
                        if (z10) {
                            this.d0 = org.telegram.messenger.np.s1(this.S.a).u1();
                            charSequence = this.H2.v;
                        } else {
                            this.d0 = org.telegram.messenger.np.s1(this.S.a).H0();
                            charSequence = this.H2.z;
                        }
                        if (charSequence == null) {
                            xe xeVar3 = this.F0;
                            TextPaint paint = xeVar3 != null ? xeVar3.getPaint() : null;
                            if (paint == null) {
                                paint = new TextPaint();
                                paint.setTextSize(org.telegram.messenger.g0.L(18.0f));
                            }
                            charSequence2 = q(paint.getFontMetricsInt(), charSequence, this.H2.k.entities);
                        } else {
                            charSequence2 = "";
                        }
                        if (this.D2 == null && !z12) {
                            xe xeVar4 = this.F0;
                            this.D2 = (xeVar4 != null || xeVar4.length() <= 0) ? null : this.F0.getText();
                            this.E2 = this.G3;
                        }
                        org.telegram.messenger.gj gjVar2 = this.H2;
                        TLRPC.MessageMedia messageMedia = gjVar2.k.media;
                        this.G3 = ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) || !messageMedia.manual) && ((i10 = gjVar2.D) == 0 || i10 == 19);
                        if (this.h3) {
                            od odVar = new od(0, this, charSequence2);
                            this.a0 = odVar;
                            org.telegram.messenger.g0.i3(odVar, 200L);
                        } else {
                            od odVar2 = this.a0;
                            if (odVar2 != null) {
                                org.telegram.messenger.g0.r(odVar2);
                                this.a0 = null;
                            }
                            setFieldText(charSequence2);
                        }
                        xeVar = this.F0;
                        if (xeVar != null) {
                            xeVar.requestFocus();
                        }
                        W0();
                        xeVar2 = this.F0;
                        if (xeVar2 != null) {
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) xeVar2.getLayoutParams();
                            layoutParams.rightMargin = org.telegram.messenger.g0.L(4.0f);
                            this.F0.setLayoutParams(layoutParams);
                        }
                        udVar2 = this.f1;
                        if (udVar2 == null) {
                            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) udVar2.getLayoutParams();
                            z11 = false;
                            layoutParams2.rightMargin = 0;
                            this.f1.setLayoutParams(layoutParams2);
                        } else {
                            z11 = false;
                        }
                        getSendButtonInternal().setVisibility(8);
                        setSlowModeButtonVisible(z11);
                        imageView.setVisibility(8);
                        eeVar.setVisibility(8);
                        z51Var.setVisibility(8);
                        if (zdVar != null) {
                            this.d2 = 0.0f;
                            zdVar.setAlpha(0.0f);
                            zdVar.setScaleX(0.5f);
                            zdVar.setScaleY(0.5f);
                        }
                        udVar.setVisibility(8);
                        jeVar = this.r2;
                        if (jeVar != null) {
                            jeVar.setVisibility(8);
                        }
                    }
                }
                udVar = udVar3;
                this.n2.i(1, 0L, true);
                this.n2.setLayoutParams(c8.ja.e(44, 44, 85));
                this.n2.requestLayout();
                this.n2.setOnLongClickListener(new i(this, gjVar, bjVar, 1));
                this.n2.setVisibility(0);
                this.n2.setScaleX(0.1f);
                this.n2.setScaleY(0.1f);
                this.n2.setAlpha(0.0f);
                this.n2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(er.f).start();
                if (z10) {
                }
                if (charSequence == null) {
                }
                if (this.D2 == null) {
                    xe xeVar42 = this.F0;
                    this.D2 = (xeVar42 != null || xeVar42.length() <= 0) ? null : this.F0.getText();
                    this.E2 = this.G3;
                }
                org.telegram.messenger.gj gjVar22 = this.H2;
                TLRPC.MessageMedia messageMedia2 = gjVar22.k.media;
                this.G3 = ((messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) || !messageMedia2.manual) && ((i10 = gjVar22.D) == 0 || i10 == 19);
                if (this.h3) {
                }
                xeVar = this.F0;
                if (xeVar != null) {
                }
                W0();
                xeVar2 = this.F0;
                if (xeVar2 != null) {
                }
                udVar2 = this.f1;
                if (udVar2 == null) {
                }
                getSendButtonInternal().setVisibility(8);
                setSlowModeButtonVisible(z11);
                imageView.setVisibility(8);
                eeVar.setVisibility(8);
                z51Var.setVisibility(8);
                if (zdVar != null) {
                }
                udVar.setVisibility(8);
                jeVar = this.r2;
                if (jeVar != null) {
                }
            } else {
                od odVar3 = this.a0;
                if (odVar3 != null) {
                    org.telegram.messenger.g0.r(odVar3);
                    this.a0 = null;
                }
                he heVar = this.n2;
                if (heVar != null) {
                    heVar.setVisibility(8);
                }
                this.d0 = -1;
                this.H3.v();
                udVar3.setVisibility(0);
                imageView.setScaleX(0.1f);
                imageView.setScaleY(0.1f);
                imageView.setAlpha(0.0f);
                imageView.setVisibility(8);
                int i11 = this.H0;
                kg kgVar = this.G0;
                if (i11 <= 0 || c()) {
                    getSendButtonInternal().setScaleX(0.1f);
                    getSendButtonInternal().setScaleY(0.1f);
                    getSendButtonInternal().setAlpha(0.0f);
                    getSendButtonInternal().setVisibility(8);
                    kgVar.setScaleX(0.1f);
                    kgVar.setScaleY(0.1f);
                    kgVar.setAlpha(0.0f);
                    setSlowModeButtonVisible(false);
                    f10 = 1.0f;
                    z51Var.setScaleX(1.0f);
                    this.F = 1.0f;
                    U1();
                    z51Var.setVisibility(0);
                    if (zdVar != null) {
                        this.d2 = 1.0f;
                        zdVar.setAlpha(1.0f);
                        zdVar.setScaleX(1.0f);
                        zdVar.setScaleY(1.0f);
                    }
                    eeVar.setScaleX(1.0f);
                    eeVar.setScaleY(1.0f);
                    eeVar.setAlpha(1.0f);
                    eeVar.setVisibility(0);
                } else {
                    if (this.H0 == Integer.MAX_VALUE) {
                        getSendButtonInternal().setScaleX(1.0f);
                        getSendButtonInternal().setScaleY(1.0f);
                        getSendButtonInternal().setAlpha(1.0f);
                        getSendButtonInternal().setVisibility(0);
                        kgVar.setScaleX(0.1f);
                        kgVar.setScaleY(0.1f);
                        f11 = 0.0f;
                        kgVar.setAlpha(0.0f);
                        setSlowModeButtonVisible(false);
                        i7 = 8;
                    } else {
                        f11 = 0.0f;
                        getSendButtonInternal().setScaleX(0.1f);
                        getSendButtonInternal().setScaleY(0.1f);
                        getSendButtonInternal().setAlpha(0.0f);
                        i7 = 8;
                        getSendButtonInternal().setVisibility(8);
                        kgVar.setScaleX(1.0f);
                        kgVar.setScaleY(1.0f);
                        kgVar.setAlpha(1.0f);
                        setSlowModeButtonVisible(true);
                    }
                    z51Var.setScaleX(0.01f);
                    this.F = f11;
                    U1();
                    z51Var.setVisibility(i7);
                    if (zdVar != null) {
                        this.d2 = f11;
                        zdVar.setAlpha(f11);
                        zdVar.setScaleX(0.5f);
                        zdVar.setScaleY(0.5f);
                    }
                    eeVar.setScaleX(0.1f);
                    eeVar.setScaleY(0.1f);
                    eeVar.setAlpha(f11);
                    eeVar.setVisibility(i7);
                    f10 = 1.0f;
                }
                e0();
                je jeVar2 = this.r2;
                if (jeVar2 != null && jeVar2.getTag() != null) {
                    this.r2.setScaleX(f10);
                    this.r2.setScaleY(f10);
                    this.r2.setAlpha(f10);
                    this.r2.setVisibility(0);
                }
                org.telegram.ui.an anVar = this.x3;
                if (anVar != null) {
                    anVar.G5 = null;
                    anVar.X5 = null;
                    org.telegram.messenger.kj kjVar = anVar.w5;
                    if (kjVar != null) {
                        kjVar.e(this.R, null, "", null, null, null);
                    }
                    this.F3 = null;
                    this.G3 = true;
                    anVar.B8();
                }
                Z();
                xe xeVar5 = this.F0;
                if (xeVar5 != null) {
                    xeVar5.setText(this.D2);
                    xe xeVar6 = this.F0;
                    xeVar6.setSelection(xeVar6.length());
                }
                this.D2 = null;
                this.G3 = this.E2;
                if (getVisibility() == 0) {
                    this.H3.w2();
                }
                b2(1);
            }
            a2(true);
            j2(true);
            Y1();
            h2();
        }
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.i1 i1Var) {
        this.V = i1Var;
    }

    public void setAnimatedTop(int i7) {
        this.B2 = i7;
    }

    public void setBotInfo(a0.h hVar) {
        n1(hVar, true);
    }

    public void setBotWebViewButtonOffsetX(float f10) {
        this.R0.setTranslationX(f10);
        if (this.F0 != null) {
            this.H = f10;
            d2();
        }
        this.Z1.setTranslationX(this.E + this.y + f10);
        this.c1.setTranslationX(f10);
        zd zdVar = this.f2;
        if (zdVar != null) {
            zdVar.setTranslationX(f10);
        }
    }

    public void setButtons(org.telegram.messenger.gj gjVar) {
        p1(gjVar, true, true);
    }

    public void setCaption(String str) {
        xe xeVar = this.F0;
        if (xeVar != null) {
            xeVar.setCaption(str);
            N(true);
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.L2 = chatFull;
        sf sfVar = this.V0;
        if (sfVar != null) {
            sfVar.setChatInfo(chatFull);
        }
        kg kgVar = this.G0;
        if (kgVar != null) {
            kgVar.b = chatFull != null && chatFull.boosts_unrestrict > 0;
            kgVar.invalidate();
        }
        if (org.telegram.messenger.t3.i0(chatFull)) {
            return;
        }
        setSlowModeTimer(chatFull.slowmode_next_send_date);
    }

    public void setComposeShadowAlpha(float f10) {
        this.U5 = f10;
        invalidate();
    }

    public void setCustomWindowView(View view) {
        this.b6 = view;
        this.F0.setWindowView(view);
    }

    public void setDelegate(cg cgVar) {
        this.H3 = cgVar;
    }

    public void setEditingBusinessLink(TL_account.TL_businessChatLink tL_businessChatLink) {
        String str;
        this.J2 = tL_businessChatLink;
        a2(false);
        if (this.J2 != null) {
            W(true);
            this.n2.setOnClickListener(new xc(this, 6));
            this.n2.setContentDescription(org.telegram.messenger.hd.M0(2131751354, null));
            this.n2.setVisibility(0);
            this.n2.setScaleX(0.1f);
            this.n2.setScaleY(0.1f);
            this.n2.setAlpha(0.0f);
            this.n2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(er.f).start();
            this.d0 = org.telegram.messenger.np.s1(this.S.a).u1();
            xe xeVar = this.F0;
            TextPaint paint = xeVar != null ? xeVar.getPaint() : null;
            if (paint == null) {
                paint = new TextPaint();
                paint.setTextSize(org.telegram.messenger.g0.L(18.0f));
            }
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            ArrayList<TLRPC.MessageEntity> arrayList = this.J2.entities;
            if (arrayList == null || (str = tL_businessChatLink.message) == null) {
                String str2 = tL_businessChatLink.message;
                if (str2 != null) {
                    setFieldText(str2);
                }
            } else {
                setFieldText(q(fontMetricsInt, str, arrayList));
            }
            this.K2 = A();
            l1(false, false, false);
            getSendButtonInternal().setVisibility(8);
            setSlowModeButtonVisible(false);
            this.Q0.setVisibility(8);
            this.a1.setVisibility(8);
            org.telegram.ui.z51 z51Var = this.X1;
            if (z51Var != null) {
                z51Var.setVisibility(8);
            }
            zd zdVar = this.Z1;
            if (zdVar != null) {
                this.d2 = 0.0f;
                zdVar.setAlpha(0.0f);
                zdVar.setScaleX(0.5f);
                zdVar.setScaleY(0.5f);
            }
            this.i2.setVisibility(8);
            je jeVar = this.r2;
            if (jeVar != null) {
                jeVar.setVisibility(8);
            }
        }
    }

    public void setEffectId(long j3) {
        this.n6 = j3;
        he heVar = this.K0;
        if (heVar != null) {
            heVar.setEffect(j3);
        }
    }

    public void setExitTransition(float f10) {
        this.U4 = f10;
        RecordCircle recordCircle = this.v2;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setFieldFocused(boolean z10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.w3.getSystemService("accessibility");
        if (this.F0 == null || accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        if (z10 && org.telegram.ui.ActionBar.e2.hasSheets(this.x3)) {
            z10 = false;
        }
        if (z10) {
            if (this.z2 != 0 || this.F0.isFocused()) {
                return;
            }
            uc ucVar = new uc(this, 9);
            this.A2 = ucVar;
            org.telegram.messenger.g0.i3(ucVar, 600L);
            return;
        }
        xe xeVar = this.F0;
        if (xeVar == null || !xeVar.isFocused()) {
            return;
        }
        if (!this.h3 || this.R2) {
            this.F0.clearFocus();
        }
    }

    @Override // org.telegram.ui.Components.pw0
    public void setFieldText(CharSequence charSequence) {
        v1(charSequence, false);
    }

    public void setInAppInsetsController(rh.e eVar) {
        this.C6 = eVar;
    }

    public void setLockAnimatedTranslation(float f10) {
        this.T4 = f10;
        RecordCircle recordCircle = this.v2;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setOnSendButtonLongClick(View.OnLongClickListener onLongClickListener) {
        if (onLongClickListener == null) {
            onLongClickListener = new jd(this, 0);
        }
        this.K0.setOnLongClickListener(onLongClickListener);
    }

    public void setOverrideHint(CharSequence charSequence) {
        A1(charSequence, false);
    }

    public void setOverrideKeyboardAnimation(boolean z10) {
        this.w = z10;
    }

    public void setRichDraftPreview(TL_iv.RichMessage richMessage) {
        if (this.k2 == null) {
            return;
        }
        org.telegram.messenger.np.s1(this.R);
        boolean z10 = org.telegram.messenger.r2.a;
        this.m2 = richMessage;
        h2();
    }

    public void setRoundVideoUiFrameClockActive(boolean z10) {
        if (this.R1 == z10) {
            return;
        }
        this.R1 = z10;
        lg lgVar = this.Z0;
        if (lgVar != null) {
            lgVar.setExternalFrameClock(z10);
        }
        ig igVar = this.T1;
        if (igVar != null) {
            igVar.f = z10;
            System.currentTimeMillis();
            igVar.h = -1L;
            igVar.invalidate();
        }
        SlideTextView slideTextView = this.S1;
        if (slideTextView != null) {
            slideTextView.H = z10;
            System.currentTimeMillis();
            slideTextView.invalidate();
        }
    }

    public void setSelection(int i7) {
        xe xeVar = this.F0;
        if (xeVar == null) {
            return;
        }
        xeVar.setSelection(i7, xeVar.length());
    }

    public void setSideButtonsForAttach(lh.h hVar) {
        org.telegram.ui.z51 z51Var;
        lh.h hVar2 = this.D6;
        if (hVar2 == hVar) {
            return;
        }
        if (hVar2 != null) {
            hVar2.e(0, false, true);
        }
        this.D6 = hVar;
        zd zdVar = this.Z1;
        if (zdVar == null || (z51Var = this.X1) == null || z51Var.getVisibility() == 0) {
            return;
        }
        boolean z10 = hVar != null && D0();
        boolean z11 = (hVar == null || z10) ? false : true;
        if (hVar != null) {
            hVar.e(0, z10 && !o2(), true);
        }
        ViewPropertyAnimator viewPropertyAnimator = this.Y1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator animate = zdVar.animate();
        float f10 = z11 ? 1.0f : 0.0f;
        this.d2 = f10;
        ViewPropertyAnimator duration = animate.alpha(f10).scaleX(z11 ? 1.0f : 0.5f).scaleY(z11 ? 1.0f : 0.5f).setInterpolator(er.h).setDuration(320L);
        this.Y1 = duration;
        duration.start();
    }

    public void setSlideToCancelProgress(float f10) {
        this.R4 = f10;
        float measuredWidth = getMeasuredWidth() * 0.35f;
        if (measuredWidth > org.telegram.messenger.g0.L(140.0f)) {
            measuredWidth = org.telegram.messenger.g0.L(140.0f);
        }
        this.b5 = (int) ((1.0f - this.R4) * (-measuredWidth));
        RecordCircle recordCircle = this.v2;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setSlowModeTimer(int i7) {
        this.H0 = i7;
        m2();
    }

    public void setSnapAnimationProgress(float f10) {
        this.V4 = f10;
        invalidate();
    }

    public void setTextTransitionIsRunning(boolean z10) {
        this.i0 = z10;
        this.i2.invalidate();
    }

    public void setViewParentForEmoji(ViewGroup viewGroup) {
        this.V1 = viewGroup;
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        boolean z10 = i7 == 0;
        this.a6 = z10;
        xe xeVar = this.F0;
        if (xeVar != null) {
            xeVar.setEnabled(z10);
        }
    }

    public void setVoiceDraft(org.telegram.messenger.ni niVar) {
        org.telegram.messenger.fw fwVar;
        TL_stories.StoryItem storyItem;
        File file;
        String str;
        if (niVar == null) {
            return;
        }
        boolean z10 = niVar.g;
        this.P = z10;
        gg ggVar = this.w2;
        if (ggVar != null) {
            ggVar.E.d(1, z10, true);
        }
        cg cgVar = this.H3;
        if (cgVar != null) {
            storyItem = cgVar.c1();
            fwVar = null;
        } else {
            fwVar = null;
            storyItem = null;
        }
        MediaController B = MediaController.B();
        int i7 = this.R;
        long j3 = this.y3;
        org.telegram.messenger.gj gjVar = this.B3;
        org.telegram.messenger.gj threadMessage = getThreadMessage();
        int i10 = this.o3;
        org.telegram.ui.an anVar = this.x3;
        if (anVar != null) {
            fwVar = anVar.Y8();
        }
        long sendMonoForumPeerId = getSendMonoForumPeerId();
        org.telegram.messenger.lj sendMessageSuggestionParams = getSendMessageSuggestionParams();
        org.telegram.messenger.p5 p5Var = B.N1;
        if (B.I1) {
            e0.g gVar = B.G1;
            if (gVar != null && gVar.e() && B.g1 != null && (file = B.k1) != null && (str = niVar.a) != null && str.equals(file.getAbsolutePath())) {
                B.h1 = i10;
                B.r1 = gjVar;
                B.s1 = threadMessage;
                B.t1 = storyItem;
                B.u1 = fwVar;
                B.p1 = sendMonoForumPeerId;
                B.q1 = sendMessageSuggestionParams;
                org.telegram.messenger.ns.f(B.i1).k(org.telegram.messenger.ns.o2, new Object[0]);
                org.telegram.messenger.ns.f(B.i1).k(org.telegram.messenger.ns.s2, Integer.valueOf(B.h1), B.g1, B.k1.getAbsolutePath(), Boolean.TRUE, Float.valueOf(niVar.h), Float.valueOf(niVar.i));
                return;
            }
            if (!B.X()) {
                return;
            }
        }
        B.y0 = false;
        B.Y(true);
        p5Var.a(B.M1);
        p5Var.c(new org.telegram.messenger.vd(B, i10, niVar, i7, j3, sendMonoForumPeerId, sendMessageSuggestionParams, threadMessage, gjVar, storyItem));
    }

    public final void t(org.telegram.messenger.cz czVar) {
        cg cgVar = this.H3;
        if (cgVar != null) {
            czVar.H = cgVar.c1();
            czVar.J = this.H3.p0();
        }
    }

    public final boolean t0(float[] fArr) {
        he heVar = this.K0;
        if (heVar != null && heVar.m0) {
            int[] iArr = new int[2];
            heVar.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - Math.round(heVar.getTranslationX());
            iArr[1] = iArr[1] - Math.round(heVar.getTranslationY());
            View rootView = heVar.getRootView();
            if (rootView == null || rootView.getWidth() <= 0 || ((iArr[0] + heVar.h0) - heVar.j0 <= rootView.getWidth() && iArr[0] + heVar.h0 + heVar.j0 >= 0.0f)) {
                fArr[0] = iArr[0] + heVar.h0;
                fArr[1] = iArr[1] + heVar.i0;
                fArr[2] = heVar.j0;
                fArr[3] = r5 + heVar.k0;
                fArr[4] = r0 + heVar.l0;
                return true;
            }
        }
        return false;
    }

    public final void t1(boolean z10, boolean z11) {
        ng ngVar;
        xe xeVar;
        ud udVar;
        wd wdVar = this.R0;
        if (wdVar == null) {
            return;
        }
        if (this.e3 == 1 || ((udVar = this.f1) != null && udVar.getVisibility() == 0)) {
            this.h = 0.0f;
            this.n = 0.0f;
            Z1();
            z11 = false;
        }
        ng ngVar2 = ng.f;
        ng ngVar3 = ng.e;
        if (!z10 || this.N2 != 0) {
            sf sfVar = this.V0;
            int i7 = sfVar == null ? org.telegram.messenger.np.d1().getInt("selected_page", 0) : sfVar.getCurrentPage();
            ngVar = (i7 == 0 || !((this.r3 || this.s3) && ((xeVar = this.F0) == null || TextUtils.isEmpty(xeVar.getText())))) ? ngVar3 : i7 == 1 ? ng.c : ngVar2;
        } else if (!this.A0) {
            return;
        } else {
            ngVar = ng.d;
        }
        if (!this.A0 && ngVar == ngVar3) {
            ngVar3 = ngVar2;
        } else if (this.b || ngVar == ngVar3) {
            ngVar3 = ngVar;
        }
        wdVar.j(ngVar3, z11);
        if (ngVar3 == ngVar2 && this.V0 == null) {
            org.telegram.messenger.si.b0(this.R).V0(0, true, true, false);
            ArrayList arrayList = org.telegram.messenger.np.s1(this.R).c4;
            int min = Math.min(10, arrayList.size());
            for (int i10 = 0; i10 < min; i10++) {
                org.telegram.messenger.j6.k((CharSequence) arrayList.get(i10));
            }
        }
    }

    public final AnimatorSet t2() {
        ee eeVar = this.a1;
        if (eeVar == null) {
            return null;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(eeVar, (Property<ee, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(eeVar, (Property<ee, Float>) View.SCALE_X, 0.6f, 1.0f), ObjectAnimator.ofFloat(eeVar, (Property<ee, Float>) View.SCALE_Y, 0.6f, 1.0f));
        animatorSet.setStartDelay(60L);
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(er.g);
        return animatorSet;
    }

    public final void u(float f10) {
        this.N1 = f10;
        oi0 oi0Var = this.i1;
        if (oi0Var != null) {
            oi0Var.setNewContentAlpha(1.0f);
            this.i1.setAlpha(Math.max(0.0f, 1.0f - (1.8f * f10)));
            float T1 = org.telegram.messenger.g0.T1(1.0f, 0.94f, f10);
            this.i1.setPivotX(org.telegram.messenger.g0.L(17.0f));
            this.i1.setPivotY(r4.getHeight() / 2.0f);
            this.i1.setScaleX(T1);
            this.i1.setScaleY(T1);
            this.i1.setTranslationX((-org.telegram.messenger.g0.L(20.0f)) * f10);
            this.i1.setVisibility(f10 >= 1.0f ? 4 : 0);
        }
        yh.a aVar = this.L1;
        if (aVar != null) {
            aVar.setModeProgress(f10);
            this.L1.setVisibility(f10 <= 0.0f ? 8 : 0);
        }
    }

    public final int u0(int i7) {
        org.telegram.ui.ActionBar.e6 e6Var = this.E4;
        return e6Var != null ? e6Var.h(i7) : org.telegram.ui.ActionBar.j6.x0(null, i7, false);
    }

    public final void u1() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.w3.getSystemService("accessibility");
        if (this.F0 == null || accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        try {
            this.F0.requestFocus();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        TextPaint textPaint;
        org.telegram.ui.ActionBar.e6 e6Var = this.E4;
        try {
            xe xeVar = this.F0;
            if (xeVar != null) {
                org.telegram.ui.ActionBar.q6.l(xeVar, 34, org.telegram.ui.ActionBar.j6.Me, e6Var);
                org.telegram.ui.ActionBar.q6.v(this.F0, org.telegram.ui.ActionBar.j6.Ne, e6Var);
                org.telegram.ui.ActionBar.q6.y(this.F0, org.telegram.ui.ActionBar.j6.mg, e6Var);
            }
            Paint paint = this.y2;
            if (paint != null) {
                paint.setColor(u0(org.telegram.ui.ActionBar.j6.Sf));
            }
            kg kgVar = this.G0;
            if (kgVar != null) {
                ((org.telegram.ui.ActionBar.j5) kgVar.c).setTextColor(u0(org.telegram.ui.ActionBar.j6.Nl));
                kgVar.invalidate();
            }
            AnimatedArrowDrawable animatedArrowDrawable = this.n4;
            if (animatedArrowDrawable != null) {
                animatedArrowDrawable.a.setColor(u0(org.telegram.ui.ActionBar.j6.Nl));
                animatedArrowDrawable.invalidateSelf();
            }
            he heVar = this.K0;
            if (heVar != null && this.L0 != 0 && heVar.getBackground() != null) {
                int u02 = u0((this.H0 != Integer.MAX_VALUE || L0()) ? org.telegram.ui.ActionBar.j6.Pe : org.telegram.ui.ActionBar.j6.Nl);
                if (u02 != this.L0) {
                    this.L0 = u02;
                    org.telegram.ui.ActionBar.j6.H1(heVar.getBackground(), Color.argb(24, Color.red(u02), Color.green(u02), Color.blue(u02)), true);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        ai.n0 n0Var = this.j1;
        if (n0Var != null) {
            n0Var.A();
        }
        g2();
        RecordCircle recordCircle = this.v2;
        if (recordCircle != null) {
            recordCircle.h();
        }
        ig igVar = this.T1;
        if (igVar != null) {
            igVar.g();
        }
        SlideTextView slideTextView = this.S1;
        if (slideTextView != null) {
            slideTextView.b();
        }
        lg lgVar = this.Z0;
        if (lgVar != null && (textPaint = lgVar.G) != null) {
            textPaint.setColor(lgVar.J.u0(org.telegram.ui.ActionBar.j6.G6));
        }
        i61 i61Var = this.g1;
        if (i61Var != null) {
            i61Var.e.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.a7, false));
            i61Var.M = 0;
            g61 g61Var = i61Var.Q;
            if (g61Var != null) {
                g61Var.b();
            }
        }
        NumberTextView numberTextView = this.c0;
        if (numberTextView != null && this.F0 != null) {
            if (this.e0 - this.d0 < 0) {
                numberTextView.setTextColor(u0(org.telegram.ui.ActionBar.j6.p7));
            } else {
                numberTextView.setTextColor(u0(org.telegram.ui.ActionBar.j6.y6));
            }
        }
        Color.alpha(u0(org.telegram.ui.ActionBar.j6.Tf));
        ve veVar = this.n0;
        if (veVar != null) {
            veVar.d.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.zj, false));
            fh.g gVar = veVar.r;
            if (gVar != null) {
                gVar.updateColors();
            }
            veVar.invalidate();
        }
        pf pfVar = this.p2;
        if (pfVar != null) {
            pfVar.d();
        }
        int u03 = this.b1 ? u0(org.telegram.ui.ActionBar.j6.Nl) : -1;
        fe feVar = this.c1;
        if (feVar != null && (!this.q6 || u03 != this.o6)) {
            this.q6 = true;
            this.o6 = u03;
            feVar.setColorFilter(new PorterDuffColorFilter(u03, PorterDuff.Mode.SRC_IN));
        }
        int u04 = u0(org.telegram.ui.ActionBar.j6.i6);
        if (this.r6 && u04 == this.p6) {
            return;
        }
        this.r6 = true;
        this.p6 = u04;
        wd wdVar = this.R0;
        if (wdVar != null) {
            wdVar.setBackground(org.telegram.ui.ActionBar.j6.h0(u04, 1, -1));
        }
        ImageView imageView = this.S0;
        if (imageView != null) {
            float L = org.telegram.messenger.g0.L(19.0f);
            int L2 = org.telegram.messenger.g0.L(1.0f);
            int L3 = org.telegram.messenger.g0.L(3.0f);
            imageView.setBackground(org.telegram.ui.ActionBar.j6.Y(L, u04, L2, L3, L2, L3));
        }
    }

    public boolean v() {
        return false;
    }

    public final boolean v0() {
        return this.L6 == 3;
    }

    public final void v1(CharSequence charSequence, boolean z10) {
        xe xeVar = this.F0;
        if (xeVar == null) {
            return;
        }
        this.z3 = true;
        xeVar.setText(charSequence);
        this.F0.g(true);
        xe xeVar2 = this.F0;
        xeVar2.setSelection(xeVar2.getText().length());
        this.z3 = false;
        cg cgVar = this.H3;
        if (cgVar != null) {
            cgVar.j1(this.F0.getText(), true, z10);
        }
    }

    public final void w() {
        if (this.V0.getParent() == null) {
            if (this.C6 == null) {
                this.V1.addView(this.V0);
            } else {
                this.V1.addView(this.V0, c8.ja.c(-1.0f, -1));
            }
        }
    }

    public final boolean w0() {
        xe xeVar = this.F0;
        return xeVar != null && xeVar.length() > 0;
    }

    public final void w1(boolean z10, boolean z11) {
        this.p3 = z10;
        N(z11);
    }

    public final boolean x(boolean z10) {
        return z10 || this.J3 != null || J0() || o2();
    }

    public final void x0() {
        hi.l3 l3Var = this.O;
        if (l3Var != null) {
            l3Var.f(true);
        }
        hi.l3 l3Var2 = this.M;
        if (l3Var2 != null) {
            l3Var2.f(true);
        }
    }

    public void x1(float f10, float f11, float f12, boolean z10) {
        int L;
        float f13 = 1.0f - f12;
        float f14 = f10 * f13;
        float f15 = f11 * f13;
        this.r = (f12 * 0.5f) + 0.5f;
        this.s = f12;
        Z1();
        float f16 = -f14;
        this.R0.setTranslationX(f16);
        if (this.F0 == null) {
            L = 0;
        } else {
            int L2 = org.telegram.messenger.g0.L(40.0f);
            gn0 gn0Var = this.q0;
            L = L2 + ((gn0Var == null || gn0Var.getVisibility() != 0) ? 0 : org.telegram.messenger.g0.L(18.0f));
        }
        this.I = f16 - (L * f13);
        fh0 fh0Var = this.h1;
        if (fh0Var != null) {
            fh0Var.setTranslationX(f16);
        }
        RecordCircle recordCircle = this.v2;
        if (recordCircle != null) {
            recordCircle.setTranslationX(f15);
        }
        gg ggVar = this.w2;
        if (ggVar != null) {
            ggVar.setTranslationX(f15);
        }
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            linearLayout.setTranslationX(f16);
        }
        ud udVar = this.i2;
        udVar.setTranslationX(f15);
        this.s1 = f12;
        udVar.setAlpha((1.0f - this.r1) * f12);
        ImageView imageView = this.e2;
        if (imageView != null) {
            imageView.setAlpha(imageView.getScaleX() > 0.7f ? f12 : 0.0f);
        }
        boolean z11 = true;
        if (z10 && f12 != 1.0f) {
            z11 = false;
        }
        this.K = z11;
        this.E = f15;
        this.G = f12;
        U1();
        d2();
        float f17 = f14 * f13;
        if (this.J != f17) {
            this.J = f17;
            oi0 oi0Var = this.i1;
            if (oi0Var != null) {
                oi0Var.setTranslationX(f17);
                this.i1.invalidate();
            }
        }
        if (this.F0 != null) {
            float T1 = org.telegram.messenger.g0.T1(0.88f, 1.0f, f12);
            this.F0.setPivotX(0.0f);
            this.F0.setPivotY(r9.getMeasuredHeight() / 2.0f);
            this.F0.setScaleX(T1);
            this.F0.setScaleY(T1);
            this.F0.setHintRightOffset(org.telegram.messenger.g0.W1(f12, org.telegram.messenger.g0.L(60.0f), 0));
        }
    }

    public final boolean y() {
        ki.a0 a0Var = this.m0;
        return a0Var != null && a0Var.w;
    }

    public final void y0(boolean z10) {
        z0(z10, false, true);
    }

    public final void y1(boolean z10) {
        if (this.K6 == z10) {
            return;
        }
        this.K6 = z10;
        this.Z1.setVisibility(z10 ? 8 : 0);
        if (z10) {
            org.telegram.messenger.g0.E2(this.q2);
        }
        if (z10) {
            this.c1.setVisibility(8);
        } else {
            e1();
        }
        if (!z10) {
            this.d0 = -1;
            NumberTextView numberTextView = this.c0;
            if (numberTextView != null) {
                numberTextView.setVisibility(8);
            }
        }
        b2(this.k6);
        N(false);
    }

    public final boolean z() {
        xf A = A();
        return (TextUtils.equals(A.a, this.K2.a) && org.telegram.messenger.si.K(this.K2.b, A.b)) ? false : true;
    }

    public final boolean z0(boolean z10, boolean z11, boolean z12) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        if (G0()) {
            if (this.N2 == 1 && (tL_replyKeyboardMarkup = this.V2) != null && z10 && this.U2 != null) {
                if (!tL_replyKeyboardMarkup.is_persistent) {
                    org.telegram.messenger.np.s1(this.R).f7.edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.U2.e1()).apply();
                }
            }
            if ((z10 && this.z2 != 0) || z11) {
                D1(0, true);
                sf sfVar = this.V0;
                if (sfVar != null) {
                    sfVar.t(true);
                }
                xe xeVar = this.F0;
                if (xeVar != null) {
                    xeVar.requestFocus();
                }
                E1(false, true, false, true);
                if (this.g4) {
                    N(true);
                    return true;
                }
            } else {
                if (this.z2 == 0) {
                    if (this.h4) {
                        E1(false, true, false, true);
                        return true;
                    }
                    L1(0, 0, true, z12 && !z10);
                    return true;
                }
                D1(0, false);
                this.V0.t(false);
                xe xeVar2 = this.F0;
                if (xeVar2 != null) {
                    xeVar2.requestFocus();
                }
            }
            return true;
        }
        return false;
    }

    public final void z1(boolean z10) {
        ValueAnimator valueAnimator = this.I1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.I1 = null;
        }
        if (z10) {
            float f10 = this.H1;
            if (f10 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                this.I1 = ofFloat;
                ofFloat.addUpdateListener(new gd(this, 9));
                this.I1.setDuration(200L);
                this.I1.setInterpolator(er.g);
                this.I1.start();
                return;
            }
        }
        this.H1 = 0.0f;
        jh.f r02 = r0();
        if (r02 != null) {
            r02.setInputBubbleExtraAlpha(1.0f);
        }
        ud udVar = this.f1;
        if (udVar != null) {
            udVar.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.pw0
    public ft getEditField() {
        return this.F0;
    }

    @Override // org.telegram.ui.Components.pw0
    public org.telegram.ui.an getParentFragment() {
        return this.x3;
    }

    public void P0(float f10) {
    }

    public void q0(Menu menu) {
    }

    public void K0() {
    }

    @Override // te.b
    public final /* synthetic */ void E(float f10, int i7) {
    }

    public void R0(int i7, int i10) {
    }
}
