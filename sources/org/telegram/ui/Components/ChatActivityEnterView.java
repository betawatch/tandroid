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
import android.graphics.BlendMode;
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
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
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
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class ChatActivityEnterView extends FrameLayout implements fn7, vma, p4b, xeb, s84, snb {
    public static long W7;
    public static final /* synthetic */ int X7 = 0;
    public boolean A0;
    public float A1;
    public boolean A2;
    public int A3;
    public final Paint A4;
    public dy1 A5;
    public int A6;
    public zh6 A7;
    public boolean B0;
    public int B1;
    public AnimatorSet B2;
    public boolean B3;
    public Drawable B4;
    public AnimatorSet B5;
    public boolean B6;
    public long B7;
    public final HashMap C0;
    public final SparseArray C1;
    public RecordCircle C2;
    public final int[] C3;
    public Drawable C4;
    public boolean C5;
    public boolean C6;
    public float C7;
    public boolean D0;
    public boolean D1;
    public l D2;
    public final Activity D3;
    public Drawable D4;
    public b29 D5;
    public dx1 D6;
    public final Paint D7;
    public float E;
    public boolean E0;
    public boolean E1;
    public final ax1 E2;
    public final zu1 E3;
    public Drawable E4;
    public b29 E5;
    public long E6;
    public final LinearGradient E7;
    public float F;
    public tx1 F0;
    public long F1;
    public final Paint F2;
    public long F3;
    public Drawable F4;
    public ValueAnimator F5;
    public long F6;
    public final Matrix F7;
    public float G;
    public final cz1 G0;
    public k43 G1;
    public byte G2;
    public boolean G3;
    public final RectF G4;
    public float G5;
    public kg5 G6;
    public final mm G7;
    public float H;
    public int H0;
    public long H1;
    public mv1 H2;
    public byte H3;
    public final Rect H4;
    public float H5;
    public boolean H6;
    public final mm H7;
    public float I;
    public mv1 I0;
    public boolean I1;
    public int I2;
    public r47 I3;
    public final Rect I4;
    public long I5;
    public final int[] I6;
    public r2d I7;
    public float J;
    public final n4a J0;
    public boolean J1;
    public ya9 J2;
    public r47 J3;
    public Drawable J4;
    public int J5;
    public final int[] J6;
    public vz1 J7;
    public boolean K;
    public final bx1 K0;
    public ll0 K1;
    public Editable K2;
    public ou1 K3;
    public final vnb K4;
    public float K5;
    public final RectF K6;
    public final t84 K7;
    public TLRPC.UserFull L;
    public int L0;
    public jl0 L1;
    public boolean L2;
    public r47 L3;
    public final boolean L4;
    public mva L5;
    public gn3 L6;
    public final fm0 L7;
    public kg5 M;
    public q67 M0;
    public jl0 M1;
    public boolean M2;
    public TLRPC.WebPage M3;
    public final dx1 M4;
    public float M5;
    public final RectF M6;
    public final fm0 M7;
    public kg5 N;
    public long N0;
    public final Paint N1;
    public boolean N2;
    public boolean N3;
    public final qw1 N4;
    public long N5;
    public znc N6;
    public final fm0 N7;
    public kg5 O;
    public nx1 O0;
    public float O1;
    public r47 O2;
    public xy1 O3;
    public final qw1 O4;
    public Bitmap O5;
    public final RectF O6;
    public float O7;
    public boolean P;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout P0;
    public ValueAnimator P1;
    public boolean P2;
    public py1 P3;
    public final qw1 P4;
    public float P5;
    public String P6;
    public float P7;
    public boolean Q;
    public final ImageView Q0;
    public final int[] Q1;
    public TL_account.TL_businessChatLink Q2;
    public TLRPC.TL_document Q3;
    public final qw1 Q4;
    public float Q5;
    public long Q6;
    public float Q7;
    public int R;
    public final tw1 R0;
    public final int[] R1;
    public sy1 R2;
    public String R3;
    public final qw1 R4;
    public float R5;
    public lv3 R6;
    public final int[] R7;
    public k5 S;
    public final ImageView S0;
    public boc S1;
    public TLRPC.ChatFull S2;
    public r47 S3;
    public boolean S4;
    public float S5;
    public boolean S6;
    public final int[] S7;
    public boolean T;
    public vw1 T0;
    public boolean T1;
    public boolean T2;
    public oec T3;
    public long T4;
    public float T5;
    public boolean T6;
    public boolean T7;
    public int U;
    public boolean U0;
    public float U1;
    public int U2;
    public boolean U3;
    public float U4;
    public float U5;
    public float U6;
    public int U7;
    public hb V;
    public my1 V0;
    public ValueAnimator V1;
    public boolean V2;
    public boolean V3;
    public float V4;
    public float V5;
    public ValueAnimator V6;
    public int V7;
    public fw1 W;
    public AnimatorSet W0;
    public final kc W1;
    public boolean W2;
    public boolean W3;
    public float W4;
    public float W5;
    public byte W6;
    public boolean X0;
    public long X1;
    public boolean X2;
    public r47 X3;
    public float X4;
    public boolean X5;
    public boolean X6;
    public boolean Y0;
    public boolean Y1;
    public boolean Y2;
    public TL_keyboard.KeyboardButtonProto Y3;
    public float Y4;
    public final Paint Y5;
    public int Y6;
    public ez1 Z0;
    public SlideTextView Z1;
    public boolean Z2;
    public boolean Z3;
    public float Z4;
    public boolean Z5;
    public final mv1 Z6;
    public int a;
    public jj1 a0;
    public final a a1;
    public zy1 a2;
    public boolean a3;
    public boolean a4;
    public float a5;
    public final mv1 a6;
    public final dx1 a7;
    public boolean b;
    public boolean b0;
    public boolean b1;
    public final wma b2;
    public r47 b3;
    public boolean b4;
    public float b5;
    public float b6;
    public ValueAnimator b7;
    public b8 c;
    public NumberTextView c0;
    public final zw1 c1;
    public ViewGroup c2;
    public TLRPC.TL_replyKeyboardMarkup c3;
    public boolean c4;
    public float c5;
    public float c6;
    public boolean c7;
    public LinearLayout d;
    public int d0;
    public boolean d1;
    public int d2;
    public int d3;
    public int d4;
    public float d5;
    public float d6;
    public b29 d7;
    public CharSequence e;
    public int e0;
    public b6 e1;
    public final oob e2;
    public boolean e3;
    public boolean e4;
    public float e5;
    public float e6;
    public final float[] e7;
    public String f;
    public c43 f0;
    public rw1 f1;
    public ViewPropertyAnimator f2;
    public PowerManager.WakeLock f3;
    public boolean f4;
    public float f5;
    public float f6;
    public final float[] f7;
    public Runnable g0;
    public qgc g1;
    public final vw1 g2;
    public AnimatorSet g3;
    public final dx1 g4;
    public boolean g5;
    public boolean g6;
    public final int[] g7;
    public float h;
    public boolean h0;
    public e29 h1;
    public final hc h2;
    public AnimatorSet h3;
    public final gf0 h4;
    public long h5;
    public boolean h6;
    public boolean h7;
    public boolean i0;
    public x59 i1;
    public final ImageView i2;
    public AnimatorSet i3;
    public final px1 i4;
    public boolean i5;
    public boolean i6;
    public fw1 i7;
    public String j0;
    public bn3 j1;
    public final ImageView j2;
    public AnimatorSet j3;
    public final b j4;
    public boolean j5;
    public boolean j6;
    public final wm2[] j7;
    public String k0;
    public boolean k1;
    public float k2;
    public byte k3;
    public final e k4;
    public int k5;
    public boolean k6;
    public long k7;
    public dv1 l0;
    public boolean l1;
    public ImageView l2;
    public boolean l3;
    public final Paint l4;
    public long l5;
    public final Paint l6;
    public byte l7;
    public ep0 m0;
    public boolean m1;
    public vw1 m2;
    public int m3;
    public boolean m4;
    public boolean m5;
    public float m6;
    public byte m7;
    public float n;
    public qx1 n0;
    public boolean n1;
    public final rw1 n2;
    public int n3;
    public boolean n4;
    public ValueAnimator n5;
    public final Rect n6;
    public boolean n7;
    public dp0 o0;
    public boolean o1;
    public final rw1 o2;
    public boolean o3;
    public boolean o4;
    public final TextPaint o5;
    public boolean o6;
    public long o7;
    public boolean p0;
    public Drawable p1;
    public final rw1 p2;
    public int p3;
    public boolean p4;
    public final Paint p5;
    public final mv1 p6;
    public Paint p7;
    public c8a q0;
    public final mv1 q1;
    public final ImageView q2;
    public final boolean q3;
    public AnimatorSet q4;
    public final Paint q5;
    public b8 q6;
    public Paint q7;
    public float r;
    public ix1 r0;
    public snc r1;
    public zj9 r2;
    public long r3;
    public float r4;
    public final Path r5;
    public ArrayList r6;
    public boolean r7;
    public float s;
    public mv1 s0;
    public boolean s1;
    public boolean s2;
    public float s3;
    public int s4;
    public final Path s5;
    public boolean s6;
    public int s7;
    public int t0;
    public boolean t1;
    public TL_iv.RichMessage t2;
    public float t3;
    public boolean t4;
    public final RectF t5;
    public View t6;
    public int t7;
    public int u0;
    public float u1;
    public bx1 u2;
    public boolean u3;
    public AnimatedArrowDrawable u4;
    public final int[] u5;
    public boolean u6;
    public boolean u7;
    public mv1 v0;
    public float v1;
    public View v2;
    public int v3;
    public boolean v4;
    public final int[] v5;
    public boolean v6;
    public boolean v7;
    public boolean w;
    public ValueAnimator w0;
    public float w1;
    public jy1 w2;
    public boolean w3;
    public boolean w4;
    public jl0 w5;
    public boolean w6;
    public qy w7;
    public Runnable x;
    public float x0;
    public boolean x1;
    public final ImageView x2;
    public boolean x3;
    public boolean x4;
    public jl0 x5;
    public zv4 x6;
    public fu5 x7;
    public float y;
    public boolean y0;
    public float y1;
    public cx1 y2;
    public boolean y3;
    public final g y4;
    public final qf5 y5;
    public dc y6;
    public int y7;
    public boolean z0;
    public float z1;
    public vw1 z2;
    public boolean z3;
    public final pn z4;
    public boolean z5;
    public sn3 z6;
    public int z7;

    /* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
        public float e0;
        public float f;
        public long f0;
        public long g0;
        public final gk0 h;
        public float h0;
        public float i0;
        public final gk0 n;
        public final float r;
        public final float s;
        public final RectF w;
        public boolean x;
        public final m y;

        public RecordCircle(Context context) {
            super(context);
            gk0 gk0Var = new gk0(11, 360928);
            this.h = gk0Var;
            gk0 gk0Var2 = new gk0(12, 360928);
            this.n = gk0Var2;
            this.r = hl.N(41.0f);
            this.s = hl.L(30.0f);
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
            this.h0 = 1.0f;
            this.i0 = -1.0f;
            m mVar = new m(this, this);
            this.y = mVar;
            ihc.l(this, mVar);
            gk0Var.a = hl.L(47.0f);
            gk0Var.b = hl.L(55.0f);
            gk0Var.b();
            gk0Var2.a = hl.L(47.0f);
            gk0Var2.b = hl.L(55.0f);
            gk0Var2.b();
            float scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            this.F = scaledTouchSlop * scaledTouchSlop;
            i();
        }

        public static float c(float f) {
            if (f < 0.0f) {
                return 0.0f;
            }
            if (f > 1.0f) {
                return 1.0f;
            }
            return f;
        }

        public static float e(float f) {
            float i = Utilities.i(f, 1.0f, 0.0f);
            return i < 0.5f ? xnb.C(i, 4.0f, i, i) : 1.0f - (((float) Math.pow((i * (-2.0f)) + 2.0f, 3.0d)) / 2.0f);
        }

        public static float f(float f) {
            float i = 1.0f - Utilities.i(f, 1.0f, 0.0f);
            return bp1.v(i, i, i, 1.0f);
        }

        public static float j(float f, float f2) {
            if (f <= 0.0f) {
                return 0.0f;
            }
            return (float) (Math.sin(f * 3.141592653589793d * 2.0d * f2) * Math.exp((-f) * 8.5d));
        }

        public final void a() {
            ChatActivityEnterView.this.i5 = true;
            this.i0 = -1.0f;
        }

        public final void b() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            vnb vnbVar = chatActivityEnterView.K4;
            if (chatActivityEnterView.D4 != null) {
                return;
            }
            Drawable mutate = getResources().getDrawable(R.drawable.input_mic_pressed).mutate();
            chatActivityEnterView.D4 = mutate;
            int i = aob.Tf;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            yob.x(this, mutate, i, vnbVar, mode);
            Drawable mutate2 = getResources().getDrawable(R.drawable.input_video_pressed).mutate();
            chatActivityEnterView.E4 = mutate2;
            yob.x(this, mutate2, i, vnbVar, mode);
            Drawable mutate3 = getResources().getDrawable(R.drawable.send_plane_24).mutate();
            chatActivityEnterView.F4 = mutate3;
            yob.x(this, mutate3, i, vnbVar, mode);
            Drawable mutate4 = getResources().getDrawable(R.drawable.input_mic).mutate();
            chatActivityEnterView.B4 = mutate4;
            int i2 = aob.Nl;
            yob.x(this, mutate4, i2, vnbVar, mode);
            Drawable mutate5 = getResources().getDrawable(R.drawable.input_video).mutate();
            chatActivityEnterView.C4 = mutate5;
            yob.x(this, mutate5, i2, vnbVar, mode);
        }

        public final void d(Canvas canvas, Drawable drawable, Drawable drawable2, float f, int i) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            float f2 = drawable == chatActivityEnterView.F4 ? (this.d0 * 0.1f) + 1.0f : 1.0f;
            if (f2 != 1.0f) {
                canvas.save();
                canvas.scale(f2, f2, drawable.getBounds().exactCenterX(), drawable.getBounds().exactCenterY());
            }
            b();
            if (f == 0.0f || f == 1.0f || drawable2 == null) {
                boolean z = chatActivityEnterView.i5;
                a aVar = chatActivityEnterView.a1;
                if (z) {
                    float f3 = chatActivityEnterView.X4;
                    if (f3 == 1.0f) {
                        chatActivityEnterView.c1.setAlpha(1.0f);
                        if (aVar != null) {
                            aVar.setAlpha(1.0f);
                            aVar.setScaleX(1.0f);
                            aVar.setScaleY(1.0f);
                        }
                        setVisibility(8);
                    } else if (f3 < 1.0f) {
                        drawable.setAlpha(jn7.d4);
                        drawable.draw(canvas);
                    }
                } else {
                    drawable.setAlpha(i);
                    drawable.draw(canvas);
                }
            } else {
                canvas.save();
                canvas.scale(f, f, drawable.getBounds().centerX(), drawable.getBounds().centerY());
                float f4 = i;
                drawable.setAlpha((int) (f4 * f));
                drawable.draw(canvas);
                canvas.restore();
                canvas.save();
                float f5 = 1.0f - f;
                canvas.scale(f5, f5, drawable.getBounds().centerX(), drawable.getBounds().centerY());
                drawable2.setAlpha((int) (f4 * f5));
                drawable2.draw(canvas);
                canvas.restore();
            }
            if (f2 != 1.0f) {
                canvas.restore();
            }
        }

        @Override // android.view.View
        public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
            return super.dispatchHoverEvent(motionEvent) || this.y.f(motionEvent);
        }

        public final void g(boolean z) {
            this.P = false;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (!z) {
                chatActivityEnterView.j5 = false;
                chatActivityEnterView.Z4 = -1.0f;
                chatActivityEnterView.Y4 = -1.0f;
                chatActivityEnterView.X4 = 1.0f;
                chatActivityEnterView.e5 = 1.0f;
                chatActivityEnterView.f5 = 1.0f;
                chatActivityEnterView.g5 = true;
                chatActivityEnterView.h5 = 0L;
                chatActivityEnterView.b5 = 0.0f;
                chatActivityEnterView.W4 = 0.0f;
            }
            invalidate();
            chatActivityEnterView.d5 = 0.0f;
            chatActivityEnterView.Y0();
            chatActivityEnterView.a5 = 0.0f;
            chatActivityEnterView.V4 = 0.0f;
            chatActivityEnterView.U4 = 0.0f;
            chatActivityEnterView.S4 = false;
            this.f = 0.0f;
            chatActivityEnterView.i5 = false;
            l lVar = chatActivityEnterView.D2;
            if (lVar != null) {
                lVar.invalidate();
            }
        }

        public float getControlsScale() {
            return ChatActivityEnterView.this.W4;
        }

        public float getScale() {
            return ChatActivityEnterView.this.V4;
        }

        public float getTransformToSeekbarProgressStep3() {
            return this.e;
        }

        public final void h() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.j5 = false;
            invalidate();
            l lVar = chatActivityEnterView.D2;
            if (lVar != null) {
                lVar.invalidate();
            }
        }

        public final void i() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            Paint paint = chatActivityEnterView.A4;
            int i = aob.Uf;
            paint.setColor(chatActivityEnterView.J0(i));
            this.h.d.setColor(vm2.o(chatActivityEnterView.J0(i), 38));
            this.n.d.setColor(vm2.o(chatActivityEnterView.J0(i), 76));
            this.E = paint.getAlpha();
        }

        @Override // android.view.View
        public final void invalidate() {
            super.invalidate();
            l lVar = ChatActivityEnterView.this.D2;
            if (lVar != null) {
                lVar.invalidate();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:103:0x043f  */
        /* JADX WARN: Removed duplicated region for block: B:106:0x0457  */
        /* JADX WARN: Removed duplicated region for block: B:111:0x0467  */
        /* JADX WARN: Removed duplicated region for block: B:118:0x04a0  */
        /* JADX WARN: Removed duplicated region for block: B:137:0x04e5 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:157:0x05b0  */
        /* JADX WARN: Removed duplicated region for block: B:171:0x05d3  */
        /* JADX WARN: Removed duplicated region for block: B:178:0x05eb  */
        /* JADX WARN: Removed duplicated region for block: B:181:0x05fa  */
        /* JADX WARN: Removed duplicated region for block: B:184:0x0607  */
        /* JADX WARN: Removed duplicated region for block: B:190:0x05fd  */
        /* JADX WARN: Removed duplicated region for block: B:191:0x05ee  */
        /* JADX WARN: Removed duplicated region for block: B:194:0x067e  */
        /* JADX WARN: Removed duplicated region for block: B:200:0x069a  */
        /* JADX WARN: Removed duplicated region for block: B:241:0x0a68  */
        /* JADX WARN: Removed duplicated region for block: B:243:0x0a6f  */
        /* JADX WARN: Removed duplicated region for block: B:246:0x0ad4  */
        /* JADX WARN: Removed duplicated region for block: B:251:0x0afe  */
        /* JADX WARN: Removed duplicated region for block: B:255:0x0b09  */
        /* JADX WARN: Removed duplicated region for block: B:261:0x0b77  */
        /* JADX WARN: Removed duplicated region for block: B:264:0x0cad  */
        /* JADX WARN: Removed duplicated region for block: B:281:0x0dab  */
        /* JADX WARN: Removed duplicated region for block: B:289:0x0d95  */
        /* JADX WARN: Removed duplicated region for block: B:292:0x0b69  */
        /* JADX WARN: Removed duplicated region for block: B:293:0x0b03  */
        /* JADX WARN: Removed duplicated region for block: B:294:0x0af1  */
        /* JADX WARN: Removed duplicated region for block: B:295:0x0a85  */
        /* JADX WARN: Removed duplicated region for block: B:296:0x0a6b  */
        /* JADX WARN: Removed duplicated region for block: B:335:0x0d9e  */
        /* JADX WARN: Removed duplicated region for block: B:353:0x059f A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:357:0x048f  */
        /* JADX WARN: Removed duplicated region for block: B:358:0x0444  */
        /* JADX WARN: Removed duplicated region for block: B:360:0x0418  */
        /* JADX WARN: Removed duplicated region for block: B:361:0x0407  */
        /* JADX WARN: Removed duplicated region for block: B:362:0x03a1  */
        /* JADX WARN: Removed duplicated region for block: B:367:0x0351  */
        /* JADX WARN: Removed duplicated region for block: B:373:0x02e1  */
        /* JADX WARN: Removed duplicated region for block: B:375:0x02be  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0297  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x02c9  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x02f5  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x0393  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x03bb  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x0415  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x041e  */
        @Override // android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onDraw(Canvas canvas) {
            float f;
            int i;
            int[] iArr;
            float f2;
            int[] iArr2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            float L;
            float f9;
            float f10;
            float f11;
            float f12;
            float f13;
            Paint paint;
            float f14;
            float f15;
            int i2;
            float f16;
            float[] fArr;
            Drawable drawable;
            Drawable drawable2;
            boolean z;
            boolean e;
            char c;
            float f17;
            float f18;
            float f19;
            float f20;
            float f21;
            float f22;
            float f23;
            char c2;
            z92 G0;
            float f24;
            int i3;
            Drawable drawable3;
            float f25;
            Paint paint2;
            Drawable drawable4;
            int i4;
            Rect rect;
            float f26;
            Paint paint3;
            char c3;
            float f27;
            float f28;
            float f29;
            char c4;
            char c5;
            float f30;
            x59 x59Var;
            Drawable drawable5;
            int[] iArr3;
            float f31;
            char c6;
            float f32;
            float f33;
            float f34;
            int[] iArr4;
            float cos;
            float f35;
            int[] iArr5;
            ChatActivityEnterView chatActivityEnterView;
            char c7;
            RectF rectF;
            float e2;
            Canvas canvas2;
            float f36;
            float f37;
            RectF rectF2;
            float f38;
            float f39;
            x59 x59Var2;
            boolean z2;
            float A;
            float f40;
            l lVar;
            Drawable drawable6;
            float f41;
            float f42;
            float f43;
            Canvas canvas3 = canvas;
            ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
            int[] iArr6 = chatActivityEnterView2.R1;
            int[] iArr7 = chatActivityEnterView2.Q1;
            Rect rect2 = chatActivityEnterView2.H4;
            Paint paint4 = chatActivityEnterView2.A4;
            if (this.O) {
                return;
            }
            if (this.P) {
                int i5 = ChatActivityEnterView.X7;
                Paint paint5 = chatActivityEnterView2.Y5;
                if (chatActivityEnterView2.X5) {
                    if (chatActivityEnterView2.O5 != null) {
                        float currentAnimationTimeMillis = (chatActivityEnterView2.M5 != 0.0f ? AnimationUtils.currentAnimationTimeMillis() - chatActivityEnterView2.N5 : chatActivityEnterView2.T5) / 1000.0f;
                        float i6 = Utilities.i((currentAnimationTimeMillis - 0.04f) / (chatActivityEnterView2.M5 != 0.0f ? 0.12f : 0.2f), 1.0f, 0.0f);
                        float R1 = hl.R1(chatActivityEnterView2.R5, chatActivityEnterView2.S5, i6);
                        if (i6 < 1.0f) {
                            canvas3.save();
                            canvas3.translate(Math.min(currentAnimationTimeMillis, 0.09f) * chatActivityEnterView2.M5, 0.0f);
                            canvas3.clipRect(R1, chatActivityEnterView2.Q5, chatActivityEnterView2.P5 + chatActivityEnterView2.O5.getWidth(), chatActivityEnterView2.Q5 + chatActivityEnterView2.O5.getHeight());
                            paint5.setAlpha((int) ((1.0f - ChatActivityEnterView.V2(0.015f, 0.09f, currentAnimationTimeMillis)) * 255.0f));
                            canvas3.drawBitmap(chatActivityEnterView2.O5, chatActivityEnterView2.P5, chatActivityEnterView2.Q5, paint5);
                            canvas3.restore();
                        }
                    }
                    mva mvaVar = chatActivityEnterView2.L5;
                    if (mvaVar != null && mvaVar.b(canvas3, 1.0f)) {
                        invalidate();
                    }
                }
                this.d = System.currentTimeMillis();
                return;
            }
            int measuredWidth = getMeasuredWidth() - hl.M(26.0f);
            int L2 = (int) (hl.L(170.0f) + 0.0f);
            this.K = chatActivityEnterView2.k5 + measuredWidth;
            float f44 = L2;
            this.L = f44;
            float f45 = chatActivityEnterView2.V4;
            float f46 = f45 <= 0.5f ? f45 / 0.5f : f45 <= 0.75f ? 1.0f - (((f45 - 0.5f) / 0.25f) * 0.1f) : (((f45 - 0.75f) / 0.25f) * 0.1f) + 0.9f;
            long currentTimeMillis = System.currentTimeMillis() - this.d;
            float f47 = this.b;
            float f48 = this.a;
            if (f47 != f48) {
                float f49 = this.c;
                f = 0.0f;
                float f50 = (currentTimeMillis * f49) + f48;
                this.a = f50;
                if (f49 > 0.0f) {
                    if (f50 > f47) {
                        this.a = f47;
                    }
                } else if (f50 < f47) {
                    this.a = f47;
                }
                invalidate();
            } else {
                f = 0.0f;
            }
            float interpolation = chatActivityEnterView2.i5 ? k43.g.getInterpolation(1.0f - chatActivityEnterView2.X4) * 0.7f : (chatActivityEnterView2.X4 * 0.3f) + 0.7f;
            float f51 = this.s * this.a;
            float f52 = this.r;
            float f53 = (f51 + f52) * f46 * interpolation;
            float f54 = f;
            this.e = f54;
            float f55 = chatActivityEnterView2.d5;
            float[] fArr2 = this.b0;
            if (f55 != f54) {
                i = 2;
                if (chatActivityEnterView2.i1 != null) {
                    float f56 = f55 > 0.38f ? 1.0f : f55 / 0.38f;
                    iArr = iArr6;
                    if (f55 > 0.63f) {
                        f2 = f52;
                        f43 = 1.0f;
                        f41 = 0.0f;
                        f42 = 0.25f;
                    } else {
                        f2 = f52;
                        f41 = 0.0f;
                        f42 = 0.25f;
                        f43 = bp1.f(f55, 0.38f, 0.25f, 0.0f);
                    }
                    this.e = Math.max(f41, ((chatActivityEnterView2.d5 - 0.38f) - f42) / 0.37f);
                    k43 k43Var = k43.j;
                    float interpolation2 = k43Var.getInterpolation(f56);
                    float interpolation3 = k43Var.getInterpolation(f43);
                    this.e = k43Var.getInterpolation(this.e);
                    float L3 = hl.L(8.0f);
                    float A2 = qd4.A(1.0f, interpolation3, ((hl.L(16.0f) * interpolation2) + f53) - L3, L3);
                    f3 = interpolation3;
                    f5 = interpolation2;
                    f6 = 0.0f;
                    f7 = 0.0f;
                    iArr2 = iArr7;
                    f4 = A2;
                    f9 = 1.0f;
                    if (chatActivityEnterView2.j0()) {
                        f10 = f9;
                        if (chatActivityEnterView2.U6 > f7 && chatActivityEnterView2.a5 == f7) {
                            float L4 = hl.L(19.0f);
                            if (chatActivityEnterView2.I0(fArr2)) {
                                L4 = fArr2[i];
                            }
                            f11 = f5;
                            f4 = hl.R1(f4, L4, chatActivityEnterView2.U6);
                            if (this.e <= 0.0f) {
                                f12 = f6;
                                paint4.setColor(vm2.f(this.e, chatActivityEnterView2.J0(aob.Uf), chatActivityEnterView2.J0(aob.bg)));
                            } else {
                                f12 = f6;
                                paint4.setColor(chatActivityEnterView2.J0(aob.Uf));
                            }
                            b();
                            if (chatActivityEnterView2.j5) {
                                f13 = f4;
                                paint = paint4;
                                f14 = f53;
                                f15 = f3;
                                i2 = measuredWidth;
                                f16 = 150.0f;
                                fArr = fArr2;
                                drawable = chatActivityEnterView2.d1 ? chatActivityEnterView2.E4 : chatActivityEnterView2.D4;
                                rect2.set(i2 - hl.L(12.0f), L2 - hl.L(12.0f), hl.L(12.0f) + i2, hl.L(12.0f) + L2);
                                drawable2 = null;
                            } else {
                                float f57 = this.f;
                                f16 = 150.0f;
                                if (f57 != 1.0f) {
                                    float f58 = (currentTimeMillis / 150.0f) + f57;
                                    this.f = f58;
                                    if (f58 > 1.0f) {
                                        this.f = 1.0f;
                                    }
                                    drawable6 = chatActivityEnterView2.d1 ? chatActivityEnterView2.E4 : chatActivityEnterView2.D4;
                                } else {
                                    drawable6 = null;
                                }
                                drawable = chatActivityEnterView2.F4;
                                f15 = f3;
                                i2 = measuredWidth;
                                fArr = fArr2;
                                int i7 = i;
                                f14 = f53;
                                paint = paint4;
                                f13 = f4;
                                rect2.set(bp1.A(i7, i2, drawable), bp1.y(i7, L2, drawable), bp1.w(i7, i2, drawable), bp1.i(i7, L2, drawable));
                                if (drawable6 != null) {
                                    drawable6.setBounds(bp1.A(i7, i2, drawable6), bp1.y(i7, L2, drawable6), bp1.w(i7, i2, drawable6), bp1.i(i7, L2, drawable6));
                                }
                                drawable2 = drawable6;
                            }
                            Drawable drawable7 = drawable;
                            drawable7.setBounds(rect2);
                            z = this.x;
                            float f59 = chatActivityEnterView2.c5;
                            if (z) {
                                float f60 = f59 - 0.01f;
                                chatActivityEnterView2.c5 = f60;
                                if (f60 < 0.0f) {
                                    this.x = true;
                                    chatActivityEnterView2.c5 = 0.0f;
                                }
                            } else {
                                float f61 = f59 + 0.01f;
                                chatActivityEnterView2.c5 = f61;
                                if (f61 > 1.0f) {
                                    this.x = false;
                                    chatActivityEnterView2.c5 = 1.0f;
                                }
                            }
                            e = i86.e(360928);
                            gk0 gk0Var = this.n;
                            gk0 gk0Var2 = this.h;
                            if (e) {
                                c = 1;
                            } else {
                                gk0Var2.a = hl.L(47.0f);
                                c = 1;
                                gk0Var2.b = (hl.L(15.0f) * 0.6f) + hl.L(47.0f);
                                gk0Var.a = hl.L(50.0f);
                                gk0Var.b = (hl.L(12.0f) * 0.6f) + hl.L(50.0f);
                                gk0Var.f(currentTimeMillis);
                                gk0Var.e(gk0Var.t, 1.01f);
                                gk0Var2.f(currentTimeMillis);
                                gk0Var2.e(gk0Var2.t, 1.02f);
                            }
                            this.d = System.currentTimeMillis();
                            float f62 = chatActivityEnterView2.X4;
                            float f63 = f62 <= 0.7f ? 1.0f : f62 / 0.7f;
                            if (chatActivityEnterView2.E1) {
                                float f64 = chatActivityEnterView2.a5;
                                if (f64 > 0.0f) {
                                    f17 = 1.0f;
                                    f18 = 1.0f - k43.g.getInterpolation(Math.min(1.0f, f64));
                                    f19 = (chatActivityEnterView2.j0() ? f17 - chatActivityEnterView2.U6 : f17) * f18;
                                    f20 = f17 - f11;
                                    f21 = f19 * f20 * f63;
                                    f22 = chatActivityEnterView2.d5;
                                    if (f22 != 0.0f && chatActivityEnterView2.i1 == null) {
                                        f21 *= f17 - Math.min(f17, f22);
                                    }
                                    if (chatActivityEnterView2.i5) {
                                        float f65 = this.i0;
                                        if (f65 < 0.0f) {
                                            f65 = Math.min(chatActivityEnterView2.X4, 0.999f);
                                            this.i0 = f65;
                                        }
                                        f21 *= c((1.0f - chatActivityEnterView2.X4) / (1.0f - Math.max(0.0f, f65)));
                                    } else {
                                        this.i0 = -1.0f;
                                    }
                                    Drawable drawable8 = drawable7;
                                    Drawable drawable9 = drawable2;
                                    long uptimeMillis = SystemClock.uptimeMillis();
                                    f23 = f63;
                                    c2 = (Build.VERSION.SDK_INT >= 33 || (lVar = chatActivityEnterView2.D2) == null || !lVar.C0 || !aob.I.o() || hl.B(chatActivityEnterView2.J0(aob.d6)) >= 0.5f || (!chatActivityEnterView2.u3 && chatActivityEnterView2.a5 == 0.0f && chatActivityEnterView2.d5 == 0.0f && !chatActivityEnterView2.i5)) ? (char) 0 : c;
                                    int i8 = ChatActivityEnterView.X7;
                                    G0 = chatActivityEnterView2.G0();
                                    if (c2 != 0 || G0 == null) {
                                        f24 = f19;
                                        i3 = i2;
                                        if (this.e0 > 0.0f && G0 != null) {
                                            G0.invalidate();
                                        }
                                        this.e0 = 0.0f;
                                        this.g0 = 0L;
                                    } else {
                                        if (this.g0 == 0 || uptimeMillis - this.f0 > 300) {
                                            this.g0 = uptimeMillis;
                                            this.h0 = 1.0f;
                                            znc zncVar = chatActivityEnterView2.N6;
                                            if (zncVar == null) {
                                                zncVar = new znc();
                                                chatActivityEnterView2.N6 = zncVar;
                                            }
                                            if (G0.h == null) {
                                                f24 = f19;
                                                G0.h = new h01((Object) chatActivityEnterView2, (Object) G0, (byte) 20);
                                            } else {
                                                f24 = f19;
                                            }
                                            zncVar.e = uptimeMillis;
                                            zncVar.c = 0.0f;
                                            zncVar.d = uptimeMillis;
                                            for (int i9 = 0; i9 < 160; i9++) {
                                                zncVar.o[i9] = false;
                                            }
                                            i3 = i2;
                                            zncVar.u = 0L;
                                            f40 = 0.0f;
                                            zncVar.p = 0.0f;
                                        } else {
                                            f24 = f19;
                                            i3 = i2;
                                            f40 = 0.0f;
                                        }
                                        float min = Math.min(50.0f, Math.max(f40, uptimeMillis - this.f0));
                                        bn3 bn3Var = chatActivityEnterView2.j1;
                                        if (bn3Var != null && bn3Var.q() && !chatActivityEnterView2.E1) {
                                            this.h0 = bp1.x(min, f16, this.h0, f40);
                                        }
                                        float c8 = c(f21) * k43.g.getInterpolation(c((uptimeMillis - this.g0) / 200.0f)) * this.h0;
                                        if (c8 > 0.0f || this.e0 > 0.0f) {
                                            G0.invalidate();
                                        }
                                        this.e0 = c8;
                                        this.f0 = uptimeMillis;
                                    }
                                    if (i86.e(360928) && f15 != 1.0f && ((f12 < 0.4f || (chatActivityEnterView2.E1 && f24 > 0.01f)) && f23 > 0.0f && !chatActivityEnterView2.i5)) {
                                        if (this.J) {
                                            float f66 = this.I;
                                            if (f66 != 1.0f) {
                                                float f67 = f66 + 0.04f;
                                                this.I = f67;
                                                if (f67 > 1.0f) {
                                                    this.I = 1.0f;
                                                }
                                            }
                                        }
                                        float f68 = this.Q;
                                        z2 = chatActivityEnterView2.t1;
                                        A = qd4.A(!z2 ? 1.0f : 0.0f, f68, 0.18f, f68);
                                        this.Q = A;
                                        if (Math.abs((!z2 ? 1.0f : 0.0f) - A) > 0.01f) {
                                            invalidate();
                                        }
                                        if (!this.N && this.Q < 0.99f) {
                                            float interpolation4 = (1.0f - this.Q) * k43.g.getInterpolation(this.I);
                                            canvas3.save();
                                            float z3 = xnb.z(gk0Var.t, 1.4f, 0.878f, f24 * chatActivityEnterView2.V4 * f20 * f23 * interpolation4);
                                            canvas3.scale(z3, z3, i3 + chatActivityEnterView2.k5, f44);
                                            gk0Var.a(i3 + chatActivityEnterView2.k5, f44, canvas3, gk0Var.d);
                                            canvas3.restore();
                                            float f69 = ((gk0Var2.t * 1.4f) + 0.926f) * f24 * chatActivityEnterView2.V4 * f20 * f23 * interpolation4;
                                            canvas3.save();
                                            canvas3.scale(f69, f69, i3 + chatActivityEnterView2.k5, f44);
                                            gk0Var2.a(i3 + chatActivityEnterView2.k5, f44, canvas3, gk0Var2.d);
                                            canvas3.restore();
                                        }
                                    }
                                    float max = (chatActivityEnterView2.i5 || chatActivityEnterView2.X4 >= 1.0f) ? f13 : Math.max(f13, hl.L(19.0f));
                                    if (this.N) {
                                        drawable3 = drawable8;
                                        f25 = f44;
                                        paint2 = paint;
                                    } else {
                                        paint2 = paint;
                                        paint2.setAlpha((int) (this.E * f10));
                                        if (chatActivityEnterView2.V4 == 1.0f) {
                                            float f70 = chatActivityEnterView2.d5;
                                            char c9 = (f70 == 0.0f || !chatActivityEnterView2.J1 || chatActivityEnterView2.d1 || (x59Var2 = chatActivityEnterView2.i1) == null || x59Var2.S) ? (char) 0 : c;
                                            RectF rectF3 = this.w;
                                            if (c9 == 0) {
                                                rect = rect2;
                                                f26 = max;
                                                paint3 = paint2;
                                                c3 = c9;
                                                f27 = f20;
                                                f28 = f44;
                                                f29 = f11;
                                                c4 = 4;
                                                c5 = 3;
                                                drawable4 = drawable9;
                                                if (f70 == 0.0f) {
                                                    f25 = f28;
                                                    paint2 = paint3;
                                                    f30 = 1.0f;
                                                    max = f26;
                                                    canvas3.drawCircle(i3 + chatActivityEnterView2.k5, f25, max, paint2);
                                                } else if (chatActivityEnterView2.d1 || this.e <= 0.0f || (x59Var = chatActivityEnterView2.i1) == null || (chatActivityEnterView2.J1 && x59Var.S)) {
                                                    f30 = 1.0f;
                                                    f25 = f28;
                                                    paint2 = paint3;
                                                    canvas3.drawCircle(i3 + chatActivityEnterView2.k5, f25, (1.0f - this.e) * f26, paint2);
                                                    max = f26;
                                                } else {
                                                    float f71 = f28 + f26;
                                                    float f72 = f28 - f26;
                                                    float f73 = i3 + chatActivityEnterView2.k5;
                                                    float f74 = f73 + f26;
                                                    float f75 = f73 - f26;
                                                    int i10 = 0;
                                                    int i11 = 0;
                                                    for (View view = (View) x59Var.getParent(); view != getParent(); view = (View) view.getParent()) {
                                                        i10 = (int) (view.getY() + i10);
                                                        i11 = (int) (view.getX() + i11);
                                                    }
                                                    float f76 = i10;
                                                    float y = (x59Var.getY() + f76) - getY();
                                                    float y2 = ((x59Var.getY() + x59Var.getMeasuredHeight()) + f76) - getY();
                                                    float f77 = i11;
                                                    float x = (((x59Var.getX() + x59Var.getMeasuredWidth()) + f77) - getX()) - chatActivityEnterView2.J;
                                                    float x2 = ((x59Var.getX() + f77) - getX()) + chatActivityEnterView2.J;
                                                    if (!chatActivityEnterView2.d1) {
                                                        x59Var.getMeasuredHeight();
                                                    }
                                                    rectF3.set(hl.R1(f75, x2, this.e), hl.R1(f72, y, this.e), hl.R1(f74, x, this.e), hl.R1(f71, y2, this.e));
                                                    if (chatActivityEnterView2.J1) {
                                                        getLocationInWindow(iArr2);
                                                        chatActivityEnterView2.i1.getLocationInWindow(iArr);
                                                        rectF3.offset(r2[0] - r5[0], r2[c] - r5[c]);
                                                        x59 x59Var3 = chatActivityEnterView2.i1;
                                                        float f78 = this.e;
                                                        x59Var3.Q.set(rectF3);
                                                        x59Var3.R = f78;
                                                        x59Var3.invalidate();
                                                    } else {
                                                        chatActivityEnterView2.i1.a(canvas3, rectF3, this.e);
                                                    }
                                                }
                                                if (c3 == 0) {
                                                    drawable3 = drawable8;
                                                    i4 = i3;
                                                    if (chatActivityEnterView2.V4 != 1.0f) {
                                                    }
                                                    this.M = max;
                                                }
                                                canvas3.save();
                                                float f79 = f30 - f12;
                                                canvas3.translate(chatActivityEnterView2.k5, 0.0f);
                                                this.d0 = c((max - hl.L(19.0f)) / Math.max(f30, f2 - hl.L(19.0f)));
                                                int z4 = (int) qd4.z(f30, f15, f79, 255.0f);
                                                if (chatActivityEnterView2.d5 != 0.0f && drawable8 == chatActivityEnterView2.F4 && chatActivityEnterView2.J1) {
                                                    float[] fArr3 = fArr;
                                                    if (chatActivityEnterView2.I0(fArr3)) {
                                                        getLocationInWindow(this.c0);
                                                        int intrinsicWidth = drawable8.getIntrinsicWidth();
                                                        int intrinsicHeight = drawable8.getIntrinsicHeight();
                                                        float f80 = (fArr3[c5] - r2[0]) - chatActivityEnterView2.k5;
                                                        float f81 = fArr3[c4] - r2[c];
                                                        Rect rect3 = rect;
                                                        float f82 = rect3.left;
                                                        float f83 = rect3.top;
                                                        int round = Math.round(hl.R1(f82, f80, f29));
                                                        int round2 = Math.round(hl.R1(f83, f81, f29));
                                                        drawable8.setBounds(round, round2, intrinsicWidth + round, intrinsicHeight + round2);
                                                        this.d0 = f27;
                                                        z4 = (int) (f79 * 255.0f);
                                                    }
                                                }
                                                int i12 = z4;
                                                float f84 = this.Q;
                                                if (f84 <= 0.01f || chatActivityEnterView2.d5 != 0.0f) {
                                                    drawable3 = drawable8;
                                                    i4 = i3;
                                                    d(canvas3, drawable3, drawable4, this.f, i12);
                                                } else {
                                                    float f85 = i12;
                                                    int i13 = (int) ((1.0f - f84) * f85);
                                                    drawable3 = drawable8;
                                                    d(canvas3, drawable3, drawable4, this.f, i13);
                                                    float R12 = hl.R1(0.6f, 1.0f, this.Q) * hl.N(6.5f);
                                                    Paint paint6 = this.R;
                                                    paint6.setColor(-1);
                                                    paint6.setAlpha((int) (f85 * this.Q));
                                                    RectF rectF4 = hl.P;
                                                    i4 = i3;
                                                    float f86 = i4;
                                                    rectF4.set(f86 - R12, f25 - R12, f86 + R12, R12 + f25);
                                                    canvas3.drawRoundRect(rectF4, hl.N(3.0f), hl.N(3.0f), paint6);
                                                }
                                                canvas3.restore();
                                                if (chatActivityEnterView2.V4 != 1.0f) {
                                                    canvas3.drawCircle(i4 + chatActivityEnterView2.k5, f25, max, paint2);
                                                    float f87 = chatActivityEnterView2.i5 ? 1.0f - chatActivityEnterView2.X4 : 1.0f;
                                                    canvas3.save();
                                                    canvas3.translate(chatActivityEnterView2.k5, 0.0f);
                                                    this.d0 = c((max - hl.L(19.0f)) / Math.max(1.0f, f2 - hl.L(19.0f)));
                                                    d(canvas3, drawable3, drawable4, this.f, (int) (f87 * 255.0f));
                                                    canvas.restore();
                                                }
                                                this.M = max;
                                            }
                                            float f88 = i3 + chatActivityEnterView2.k5;
                                            int[] iArr8 = chatActivityEnterView2.R1;
                                            int[] iArr9 = chatActivityEnterView2.Q1;
                                            c4 = 4;
                                            a aVar = chatActivityEnterView2.a1;
                                            c5 = 3;
                                            float f89 = chatActivityEnterView2.d5;
                                            c3 = c9;
                                            View view2 = (View) chatActivityEnterView2.i1.getParent();
                                            float f90 = 0.0f;
                                            float f91 = 0.0f;
                                            while (true) {
                                                drawable5 = drawable8;
                                                if (view2 == null || view2 == getParent()) {
                                                    break;
                                                }
                                                f90 = view2.getY() + f90;
                                                f91 = view2.getX() + f91;
                                                view2 = view2.getParent() instanceof View ? (View) view2.getParent() : null;
                                                drawable8 = drawable5;
                                            }
                                            float y3 = (chatActivityEnterView2.i1.getY() + f90) - getY();
                                            float measuredHeight = chatActivityEnterView2.i1.getMeasuredHeight() + y3;
                                            float x3 = ((chatActivityEnterView2.i1.getX() + f91) - getX()) + chatActivityEnterView2.J;
                                            float x4 = (((chatActivityEnterView2.i1.getX() + chatActivityEnterView2.i1.getMeasuredWidth()) + f91) - getX()) - chatActivityEnterView2.J;
                                            float min2 = Math.min(measuredHeight - y3, hl.L(32.0f));
                                            float f92 = (y3 + measuredHeight) / 2.0f;
                                            float N = hl.N(19.0f);
                                            f27 = f20;
                                            float[] fArr4 = this.a0;
                                            boolean I0 = chatActivityEnterView2.I0(fArr4);
                                            int[] iArr10 = this.V;
                                            if (I0) {
                                                getLocationInWindow(iArr10);
                                                float f93 = fArr4[0] - iArr10[0];
                                                rect = rect2;
                                                f33 = fArr4[c] - iArr10[c];
                                                iArr3 = iArr10;
                                                f32 = fArr4[2];
                                                f31 = f93;
                                                c6 = c;
                                            } else if (aVar == null || aVar.getWidth() <= 0) {
                                                iArr3 = iArr10;
                                                f31 = f88;
                                                c6 = 0;
                                                f32 = N;
                                                rect = rect2;
                                                f33 = f44;
                                            } else {
                                                getLocationInWindow(iArr10);
                                                iArr3 = iArr10;
                                                aVar.getLocationInWindow(this.W);
                                                float width = ((aVar.getWidth() + (r12[0] - iArr3[0])) - hl.N(3.0f)) - N;
                                                float height = ((aVar.getHeight() + (r12[c] - iArr3[c])) - hl.N(3.0f)) - N;
                                                rect = rect2;
                                                f33 = height;
                                                f31 = width;
                                                f32 = N;
                                                c6 = 0;
                                            }
                                            f26 = max;
                                            float e3 = e(f89 / 0.62f);
                                            paint3 = paint2;
                                            float f94 = f89 - 0.5f;
                                            float max2 = 0.56f * Math.max(0.0f, f94);
                                            float j = j(max2, 5.2f);
                                            float j2 = j(max2 - 0.02f, 4.4f);
                                            float e4 = ((0.07f * j * (1.0f - e(f94 / 0.32f))) + 1.0f) * hl.R1(f14, f32, e3);
                                            float R13 = hl.R1(f88, f31, e3);
                                            float R14 = hl.R1(f44, f33, e3);
                                            float f95 = f(f89 / 0.58f);
                                            f28 = f44;
                                            float f96 = f89 / 0.5f;
                                            float B = xnb.B(j2, 0.09f, 1.0f, hl.R1(Math.min(min2, 1.1f * e4) * 0.8f, min2, f(f96)));
                                            float L5 = hl.L(16.0f);
                                            if (f89 < 0.5f) {
                                                f34 = j2;
                                                cos = hl.R1(R13 - (e4 * 0.35f), x4 - L5, f(f96));
                                                iArr4 = iArr8;
                                            } else {
                                                f34 = j2;
                                                iArr4 = iArr8;
                                                cos = x4 - (L5 * ((float) (Math.cos(((max2 * 3.141592653589793d) * 2.0d) * 2.6d) * Math.exp((-max2) * 13.0f))));
                                            }
                                            float R15 = hl.R1((R13 - (e4 * 0.35f)) - B, x3, e((f89 - 0.16f) / 0.6f)) - (hl.L(5.0f) * f34);
                                            float R16 = hl.R1(R14, f92, f95);
                                            float min3 = Math.min(R15, cos - B);
                                            float f97 = B / 2.0f;
                                            RectF rectF5 = this.U;
                                            rectF5.set(min3, R16 - f97, cos, R16 + f97);
                                            int f98 = vm2.f(e((f89 - 0.6f) / 0.4f), chatActivityEnterView2.J0(aob.Uf), chatActivityEnterView2.J0(aob.Pe));
                                            Paint paint7 = this.T;
                                            paint7.setColor(f98);
                                            paint7.setAlpha((int) (this.E * 1.0f));
                                            Path path = this.S;
                                            path.rewind();
                                            Path.Direction direction = Path.Direction.CW;
                                            path.addCircle(R13, R14, e4, direction);
                                            float f99 = cos - f97;
                                            if (f89 < 0.5f) {
                                                f35 = R13;
                                                float max3 = Math.max(hl.N(0.6f), 0.85f * f97 * ((float) Math.pow(1.0d - Math.pow(f96, 1.4d), 1.2d)));
                                                float f100 = f35 - f99;
                                                if (f100 > 0.0f) {
                                                    double i14 = (Utilities.i(1.0f - (((f100 - f97) - e4) / (f97 + e4)), 1.0f, 0.15f) * 45.0f) + 25.0f;
                                                    float radians = (float) Math.toRadians(i14);
                                                    float radians2 = (float) Math.toRadians(i14);
                                                    double d = radians;
                                                    float cos2 = (((float) Math.cos(d)) * f97) + f99;
                                                    float sin = R16 - (((float) Math.sin(d)) * f97);
                                                    float sin2 = (((float) Math.sin(d)) * f97) + R16;
                                                    double d2 = radians2;
                                                    float cos3 = f35 - (((float) Math.cos(d2)) * e4);
                                                    float sin3 = R14 - (((float) Math.sin(d2)) * e4);
                                                    chatActivityEnterView = chatActivityEnterView2;
                                                    float sin4 = (((float) Math.sin(d2)) * e4) + R14;
                                                    float f101 = (cos2 + cos3) / 2.0f;
                                                    float f102 = (R16 + R14) / 2.0f;
                                                    path.moveTo(cos2, sin);
                                                    float f103 = f102 - max3;
                                                    iArr5 = iArr9;
                                                    path.cubicTo(hl.R1(cos2, f101, 0.55f), hl.R1(sin, f103, 0.9f), hl.R1(f101, cos2, 0.3f), f103, f101, f103);
                                                    path.cubicTo(hl.R1(f101, cos3, 0.3f), f103, hl.R1(cos3, f101, 0.55f), hl.R1(sin3, f103, 0.9f), cos3, sin3);
                                                    path = path;
                                                    path.lineTo(cos3, sin4);
                                                    float f104 = f102 + max3;
                                                    path.cubicTo(hl.R1(cos3, f101, 0.55f), hl.R1(sin4, f104, 0.9f), hl.R1(f101, cos3, 0.3f), f104, f101, f104);
                                                    path.cubicTo(hl.R1(f101, cos2, 0.3f), f104, hl.R1(cos2, f101, 0.55f), hl.R1(sin2, f104, 0.9f), cos2, sin2);
                                                    path.close();
                                                    c7 = f89 < 0.5f ? c : (char) 0;
                                                    if (c7 != 0) {
                                                        path.addRoundRect(rectF5, f97, f97, direction);
                                                        chatActivityEnterView2 = chatActivityEnterView;
                                                        x59 x59Var4 = chatActivityEnterView2.i1;
                                                        x59Var4.Q.set(rectF5);
                                                        x59Var4.R = -1.0f;
                                                        x59Var4.invalidate();
                                                        rectF = rectF3;
                                                    } else {
                                                        chatActivityEnterView2 = chatActivityEnterView;
                                                        getLocationInWindow(iArr5);
                                                        chatActivityEnterView2.i1.getLocationInWindow(iArr4);
                                                        rectF = rectF3;
                                                        rectF.set(rectF5);
                                                        rectF.offset(r15[0] - r4[0], r15[c] - r4[c]);
                                                        x59 x59Var5 = chatActivityEnterView2.i1;
                                                        float f105 = (f(f94 / 0.5f) * 0.65f) + 0.35f;
                                                        x59Var5.Q.set(rectF);
                                                        x59Var5.R = f105;
                                                        x59Var5.invalidate();
                                                    }
                                                    e2 = 1.0f - e((f89 - 0.72f) / 0.28f);
                                                    if (e2 >= 1.0f) {
                                                        int alpha = paint7.getAlpha();
                                                        paint7.setAlpha((int) (alpha * e2));
                                                        canvas2 = canvas;
                                                        f36 = f35;
                                                        canvas2.drawCircle(f36, R14, e4, paint7);
                                                        paint7.setAlpha(alpha);
                                                        path.rewind();
                                                        if (c7 == 0) {
                                                            path.addRoundRect(rectF5, f97, f97, direction);
                                                        }
                                                    } else {
                                                        canvas2 = canvas;
                                                        f36 = f35;
                                                    }
                                                    canvas2.drawPath(path, paint7);
                                                    f37 = f89 >= 1.0f ? 1.0f : 0.0f;
                                                    if (f37 <= 0.0f) {
                                                        canvas2.save();
                                                        float centerX = f36 - drawable5.getBounds().centerX();
                                                        float f106 = R14 - f28;
                                                        if (c6 != 0) {
                                                            float f107 = (fArr4[3] - iArr3[0]) - drawable5.getBounds().left;
                                                            float f108 = (fArr4[4] - iArr3[c]) - drawable5.getBounds().top;
                                                            f39 = e3;
                                                            centerX = hl.R1(centerX, f107, f39);
                                                            f106 = hl.R1(f106, f108, f39);
                                                        } else {
                                                            f39 = e3;
                                                        }
                                                        canvas2.translate(centerX, f106);
                                                        f38 = 1.0f;
                                                        this.d0 = Math.min(this.d0, 1.0f - f39);
                                                        int i15 = (int) (f37 * 255.0f);
                                                        canvas3 = canvas;
                                                        rectF2 = rectF;
                                                        f29 = f11;
                                                        drawable4 = drawable9;
                                                        d(canvas3, drawable5, drawable4, this.f, i15);
                                                        drawable8 = drawable5;
                                                        canvas3.restore();
                                                    } else {
                                                        rectF2 = rectF;
                                                        canvas3 = canvas2;
                                                        f29 = f11;
                                                        drawable8 = drawable5;
                                                        drawable4 = drawable9;
                                                        f38 = 1.0f;
                                                    }
                                                    if (f89 >= f38) {
                                                        x59 x59Var6 = chatActivityEnterView2.i1;
                                                        x59Var6.Q.set(rectF2);
                                                        x59Var6.R = f38;
                                                        x59Var6.invalidate();
                                                    }
                                                }
                                            } else {
                                                f35 = R13;
                                            }
                                            iArr5 = iArr9;
                                            chatActivityEnterView = chatActivityEnterView2;
                                            if (f89 < 0.5f) {
                                            }
                                            if (c7 != 0) {
                                            }
                                            e2 = 1.0f - e((f89 - 0.72f) / 0.28f);
                                            if (e2 >= 1.0f) {
                                            }
                                            canvas2.drawPath(path, paint7);
                                            if (f89 >= 1.0f) {
                                            }
                                            if (f37 <= 0.0f) {
                                            }
                                            if (f89 >= f38) {
                                            }
                                            f25 = f28;
                                            paint2 = paint3;
                                            max = f26;
                                            f30 = 1.0f;
                                            if (c3 == 0) {
                                            }
                                        } else {
                                            drawable3 = drawable8;
                                            f25 = f44;
                                        }
                                    }
                                    drawable4 = drawable9;
                                    i4 = i3;
                                    if (chatActivityEnterView2.V4 != 1.0f) {
                                    }
                                    this.M = max;
                                }
                            }
                            f17 = 1.0f;
                            f18 = 1.0f;
                            f19 = (chatActivityEnterView2.j0() ? f17 - chatActivityEnterView2.U6 : f17) * f18;
                            f20 = f17 - f11;
                            f21 = f19 * f20 * f63;
                            f22 = chatActivityEnterView2.d5;
                            if (f22 != 0.0f) {
                                f21 *= f17 - Math.min(f17, f22);
                            }
                            if (chatActivityEnterView2.i5) {
                            }
                            Drawable drawable82 = drawable7;
                            Drawable drawable92 = drawable2;
                            long uptimeMillis2 = SystemClock.uptimeMillis();
                            f23 = f63;
                            if (Build.VERSION.SDK_INT >= 33) {
                            }
                            int i82 = ChatActivityEnterView.X7;
                            G0 = chatActivityEnterView2.G0();
                            if (c2 != 0) {
                            }
                            f24 = f19;
                            i3 = i2;
                            if (this.e0 > 0.0f) {
                                G0.invalidate();
                            }
                            this.e0 = 0.0f;
                            this.g0 = 0L;
                            if (i86.e(360928)) {
                                if (this.J) {
                                }
                                float f682 = this.Q;
                                z2 = chatActivityEnterView2.t1;
                                A = qd4.A(!z2 ? 1.0f : 0.0f, f682, 0.18f, f682);
                                this.Q = A;
                                if (Math.abs((!z2 ? 1.0f : 0.0f) - A) > 0.01f) {
                                }
                                if (!this.N) {
                                    float interpolation42 = (1.0f - this.Q) * k43.g.getInterpolation(this.I);
                                    canvas3.save();
                                    float z32 = xnb.z(gk0Var.t, 1.4f, 0.878f, f24 * chatActivityEnterView2.V4 * f20 * f23 * interpolation42);
                                    canvas3.scale(z32, z32, i3 + chatActivityEnterView2.k5, f44);
                                    gk0Var.a(i3 + chatActivityEnterView2.k5, f44, canvas3, gk0Var.d);
                                    canvas3.restore();
                                    float f692 = ((gk0Var2.t * 1.4f) + 0.926f) * f24 * chatActivityEnterView2.V4 * f20 * f23 * interpolation42;
                                    canvas3.save();
                                    canvas3.scale(f692, f692, i3 + chatActivityEnterView2.k5, f44);
                                    gk0Var2.a(i3 + chatActivityEnterView2.k5, f44, canvas3, gk0Var2.d);
                                    canvas3.restore();
                                }
                            }
                            float max4 = (chatActivityEnterView2.i5 || chatActivityEnterView2.X4 >= 1.0f) ? f13 : Math.max(f13, hl.L(19.0f));
                            if (this.N) {
                            }
                            drawable4 = drawable92;
                            i4 = i3;
                            if (chatActivityEnterView2.V4 != 1.0f) {
                            }
                            this.M = max4;
                        }
                    } else {
                        f10 = f9;
                    }
                    f11 = f5;
                    if (this.e <= 0.0f) {
                    }
                    b();
                    if (chatActivityEnterView2.j5) {
                    }
                    Drawable drawable72 = drawable;
                    drawable72.setBounds(rect2);
                    z = this.x;
                    float f592 = chatActivityEnterView2.c5;
                    if (z) {
                    }
                    e = i86.e(360928);
                    gk0 gk0Var3 = this.n;
                    gk0 gk0Var22 = this.h;
                    if (e) {
                    }
                    this.d = System.currentTimeMillis();
                    float f622 = chatActivityEnterView2.X4;
                    if (f622 <= 0.7f) {
                    }
                    if (chatActivityEnterView2.E1) {
                    }
                    f17 = 1.0f;
                    f18 = 1.0f;
                    f19 = (chatActivityEnterView2.j0() ? f17 - chatActivityEnterView2.U6 : f17) * f18;
                    f20 = f17 - f11;
                    f21 = f19 * f20 * f63;
                    f22 = chatActivityEnterView2.d5;
                    if (f22 != 0.0f) {
                    }
                    if (chatActivityEnterView2.i5) {
                    }
                    Drawable drawable822 = drawable72;
                    Drawable drawable922 = drawable2;
                    long uptimeMillis22 = SystemClock.uptimeMillis();
                    f23 = f63;
                    if (Build.VERSION.SDK_INT >= 33) {
                    }
                    int i822 = ChatActivityEnterView.X7;
                    G0 = chatActivityEnterView2.G0();
                    if (c2 != 0) {
                    }
                    f24 = f19;
                    i3 = i2;
                    if (this.e0 > 0.0f) {
                    }
                    this.e0 = 0.0f;
                    this.g0 = 0L;
                    if (i86.e(360928)) {
                    }
                    float max42 = (chatActivityEnterView2.i5 || chatActivityEnterView2.X4 >= 1.0f) ? f13 : Math.max(f13, hl.L(19.0f));
                    if (this.N) {
                    }
                    drawable4 = drawable922;
                    i4 = i3;
                    if (chatActivityEnterView2.V4 != 1.0f) {
                    }
                    this.M = max42;
                }
            } else {
                i = 2;
            }
            iArr = iArr6;
            f2 = f52;
            float f109 = chatActivityEnterView2.a5;
            if (f109 != 0.0f) {
                if (chatActivityEnterView2.E1) {
                    iArr2 = iArr7;
                    f9 = 0.0f;
                    f4 = 0.0f;
                    f5 = 0.0f;
                    f6 = 1.0f;
                    f3 = 0.0f;
                    f7 = 0.0f;
                } else {
                    float f110 = f109 > 0.6f ? 1.0f : f109 / 0.6f;
                    iArr2 = iArr7;
                    if (chatActivityEnterView2.h0) {
                        f8 = 0.0f;
                    } else {
                        f8 = 0.0f;
                        f109 = bp1.f(f109, 0.6f, 0.4f, 0.0f);
                    }
                    k43 k43Var2 = k43.j;
                    f5 = k43Var2.getInterpolation(f110);
                    float interpolation5 = k43Var2.getInterpolation(f109);
                    if (!chatActivityEnterView2.j0()) {
                        L = (hl.L(16.0f) * f5) + f53;
                    } else if (chatActivityEnterView2.U6 > f8) {
                        float L6 = hl.L(19.0f);
                        if (chatActivityEnterView2.I0(fArr2)) {
                            L6 = fArr2[i];
                        }
                        L = hl.R1(f53, L6, chatActivityEnterView2.U6);
                    } else {
                        L = f53;
                    }
                    f4 = L * (1.0f - interpolation5);
                    if (i86.e(360928)) {
                        float f111 = chatActivityEnterView2.a5;
                        if (f111 > 0.6f) {
                            f3 = 0.0f;
                            float max5 = Math.max(0.0f, 1.0f - ((f111 - 0.6f) / 0.4f));
                            f6 = interpolation5;
                            f9 = max5;
                            f7 = 0.0f;
                        }
                    }
                    f3 = 0.0f;
                    f6 = interpolation5;
                    f7 = 0.0f;
                }
                if (chatActivityEnterView2.j0()) {
                }
                f11 = f5;
                if (this.e <= 0.0f) {
                }
                b();
                if (chatActivityEnterView2.j5) {
                }
                Drawable drawable722 = drawable;
                drawable722.setBounds(rect2);
                z = this.x;
                float f5922 = chatActivityEnterView2.c5;
                if (z) {
                }
                e = i86.e(360928);
                gk0 gk0Var32 = this.n;
                gk0 gk0Var222 = this.h;
                if (e) {
                }
                this.d = System.currentTimeMillis();
                float f6222 = chatActivityEnterView2.X4;
                if (f6222 <= 0.7f) {
                }
                if (chatActivityEnterView2.E1) {
                }
                f17 = 1.0f;
                f18 = 1.0f;
                f19 = (chatActivityEnterView2.j0() ? f17 - chatActivityEnterView2.U6 : f17) * f18;
                f20 = f17 - f11;
                f21 = f19 * f20 * f63;
                f22 = chatActivityEnterView2.d5;
                if (f22 != 0.0f) {
                }
                if (chatActivityEnterView2.i5) {
                }
                Drawable drawable8222 = drawable722;
                Drawable drawable9222 = drawable2;
                long uptimeMillis222 = SystemClock.uptimeMillis();
                f23 = f63;
                if (Build.VERSION.SDK_INT >= 33) {
                }
                int i8222 = ChatActivityEnterView.X7;
                G0 = chatActivityEnterView2.G0();
                if (c2 != 0) {
                }
                f24 = f19;
                i3 = i2;
                if (this.e0 > 0.0f) {
                }
                this.e0 = 0.0f;
                this.g0 = 0L;
                if (i86.e(360928)) {
                }
                float max422 = (chatActivityEnterView2.i5 || chatActivityEnterView2.X4 >= 1.0f) ? f13 : Math.max(f13, hl.L(19.0f));
                if (this.N) {
                }
                drawable4 = drawable9222;
                i4 = i3;
                if (chatActivityEnterView2.V4 != 1.0f) {
                }
                this.M = max422;
            }
            iArr2 = iArr7;
            f3 = 0.0f;
            f4 = f53;
            f5 = 0.0f;
            f6 = 0.0f;
            f7 = 0.0f;
            f9 = 1.0f;
            if (chatActivityEnterView2.j0()) {
            }
            f11 = f5;
            if (this.e <= 0.0f) {
            }
            b();
            if (chatActivityEnterView2.j5) {
            }
            Drawable drawable7222 = drawable;
            drawable7222.setBounds(rect2);
            z = this.x;
            float f59222 = chatActivityEnterView2.c5;
            if (z) {
            }
            e = i86.e(360928);
            gk0 gk0Var322 = this.n;
            gk0 gk0Var2222 = this.h;
            if (e) {
            }
            this.d = System.currentTimeMillis();
            float f62222 = chatActivityEnterView2.X4;
            if (f62222 <= 0.7f) {
            }
            if (chatActivityEnterView2.E1) {
            }
            f17 = 1.0f;
            f18 = 1.0f;
            f19 = (chatActivityEnterView2.j0() ? f17 - chatActivityEnterView2.U6 : f17) * f18;
            f20 = f17 - f11;
            f21 = f19 * f20 * f63;
            f22 = chatActivityEnterView2.d5;
            if (f22 != 0.0f) {
            }
            if (chatActivityEnterView2.i5) {
            }
            Drawable drawable82222 = drawable7222;
            Drawable drawable92222 = drawable2;
            long uptimeMillis2222 = SystemClock.uptimeMillis();
            f23 = f63;
            if (Build.VERSION.SDK_INT >= 33) {
            }
            int i82222 = ChatActivityEnterView.X7;
            G0 = chatActivityEnterView2.G0();
            if (c2 != 0) {
            }
            f24 = f19;
            i3 = i2;
            if (this.e0 > 0.0f) {
            }
            this.e0 = 0.0f;
            this.g0 = 0L;
            if (i86.e(360928)) {
            }
            float max4222 = (chatActivityEnterView2.i5 || chatActivityEnterView2.X4 >= 1.0f) ? f13 : Math.max(f13, hl.L(19.0f));
            if (this.N) {
            }
            drawable4 = drawable92222;
            i4 = i3;
            if (chatActivityEnterView2.V4 != 1.0f) {
            }
            this.M = max4222;
        }

        @Override // android.view.View
        public final void onMeasure(int i, int i2) {
            View.MeasureSpec.getSize(i);
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(194.0f), TLObject.FLAG_30));
            float measuredWidth = getMeasuredWidth() * 0.35f;
            if (measuredWidth > hl.L(140.0f)) {
                measuredWidth = hl.L(140.0f);
            }
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.k5 = (int) ((1.0f - chatActivityEnterView.X4) * (-measuredWidth));
        }

        public void setAmplitude(double d) {
            this.n.d(true, (float) (Math.min(1800.0d, d) / 1800.0d));
            this.h.d(false, (float) (Math.min(1800.0d, d) / 1800.0d));
            float min = (float) (Math.min(1800.0d, d) / 1800.0d);
            this.b = min;
            this.c = (min - this.a) / 375.0f;
            invalidate();
        }

        public void setControlsScale(float f) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.W4 = f;
            l lVar = chatActivityEnterView.D2;
            if (lVar != null) {
                lVar.invalidate();
            }
        }

        public void setScale(float f) {
            ChatActivityEnterView.this.V4 = f;
            invalidate();
        }

        public void setTransformToSeekbar(float f) {
            ChatActivityEnterView.this.d5 = f;
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
    public class SlideTextView extends View {
        public StaticLayout E;
        public StaticLayout F;
        public boolean G;
        public boolean H;
        public final Rect I;
        public hf0 J;
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
            boolean z = hl.q.x <= hl.L(320.0f);
            this.L = z;
            TextPaint textPaint = new TextPaint(1);
            this.a = textPaint;
            textPaint.setTextSize(hl.L(z ? 13.0f : 15.0f));
            TextPaint textPaint2 = new TextPaint(1);
            this.b = textPaint2;
            uh9.p(textPaint2, hl.L(15.0f));
            int i = aob.Nl;
            int i2 = ChatActivityEnterView.X7;
            paint.setColor(ChatActivityEnterView.this.J0(i));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(hl.N(z ? 1.0f : 1.6f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            String M0 = ob6.M0(2131745041, null);
            this.d = M0;
            String M02 = ob6.M0(2131752570, "Cancel");
            this.e = M02;
            this.x = M0.toLowerCase().indexOf(M02.toLowerCase());
            b();
        }

        public final void a() {
            this.r = 1.0f;
        }

        public final void b() {
            int i = aob.eg;
            int i2 = ChatActivityEnterView.X7;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            int J0 = chatActivityEnterView.J0(i);
            TextPaint textPaint = this.a;
            textPaint.setColor(J0);
            int i3 = aob.dg;
            int J02 = chatActivityEnterView.J0(i3);
            this.b.setColor(J02);
            textPaint.getAlpha();
            this.s = r4.getAlpha();
            hf0 h0 = aob.h0(hl.L(60.0f), 0, vm2.o(chatActivityEnterView.J0(i3), 26));
            this.J = h0;
            h0.setCallback(this);
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
            hf0 hf0Var = this.J;
            if (hf0Var != null) {
                hf0Var.jumpToCurrentState();
            }
        }

        @Override // android.view.View
        public final void onDraw(Canvas canvas) {
            StaticLayout staticLayout;
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            Canvas canvas2;
            int i;
            float f6;
            float L;
            int i2;
            float f7;
            int i3;
            l lVar;
            if (this.E == null || (staticLayout = this.F) == null) {
                return;
            }
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (chatActivityEnterView.C2 != null) {
                int L2 = hl.L(16.0f) + staticLayout.getWidth();
                int J0 = (hl.B(chatActivityEnterView.J0(aob.d6)) >= 0.5f || (lVar = chatActivityEnterView.D2) == null) ? chatActivityEnterView.J0(aob.eg) : lVar.s.getColor();
                TextPaint textPaint = this.a;
                textPaint.setColor(J0);
                textPaint.setAlpha((int) ((1.0f - this.n) * Color.alpha(J0) * this.r));
                this.b.setAlpha((int) (this.s * this.n));
                int color = textPaint.getColor();
                Paint paint = this.c;
                paint.setColor(color);
                boolean z = this.L;
                if (z) {
                    this.w = hl.L(16.0f);
                } else {
                    System.currentTimeMillis();
                    System.currentTimeMillis();
                    if (this.n == 0.0f && this.r > 0.8f) {
                        float currentTimeMillis = (System.currentTimeMillis() % 2000) / 2000.0f;
                        this.w = (-hl.L(6.0f)) * (currentTimeMillis < 0.5f ? (currentTimeMillis * 4.0f) - 1.0f : 3.0f - (currentTimeMillis * 4.0f));
                    }
                }
                int i4 = this.x;
                boolean z2 = i4 >= 0;
                int L3 = hl.L(5.0f) + ((int) ((getMeasuredWidth() - this.f) / 2.0f));
                int measuredWidth = (int) ((getMeasuredWidth() - this.h) / 2.0f);
                if (z2) {
                    float primaryHorizontal = this.E.getPrimaryHorizontal(i4);
                    f = (L3 + primaryHorizontal) - measuredWidth;
                    f2 = primaryHorizontal;
                } else {
                    f = 0.0f;
                    f2 = 0.0f;
                }
                float f8 = L3;
                float f9 = this.w;
                float f10 = this.n;
                float L4 = (((((1.0f - f10) * f9) * this.r) + f8) - (f * f10)) + hl.L(16.0f);
                float L5 = z2 ? 0.0f : this.n * hl.L(12.0f);
                if (this.n != 1.0f) {
                    int translationX = (int) ((chatActivityEnterView.C2.getTranslationX() * 0.3f) + ((1.0f - this.r) * ((-getMeasuredWidth()) / 4)));
                    Paint paint2 = chatActivityEnterView.r7 ? chatActivityEnterView.p7 : null;
                    if (paint2 != null) {
                        f4 = 16.0f;
                        i = measuredWidth;
                        f5 = 1.0f;
                        f6 = L4;
                        i2 = translationX;
                        f7 = 4.0f;
                        f3 = L5;
                        canvas2 = canvas;
                        i3 = canvas2.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint2);
                    } else {
                        i2 = translationX;
                        f4 = 16.0f;
                        f5 = 1.0f;
                        f7 = 4.0f;
                        f3 = L5;
                        i = measuredWidth;
                        f6 = L4;
                        canvas2 = canvas;
                        i3 = -1;
                    }
                    canvas2.save();
                    ez1 ez1Var = chatActivityEnterView.Z0;
                    canvas2.clipRect((ez1Var == null ? 0.0f : ez1Var.getLeftProperty()) + hl.L(f7), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    canvas2.save();
                    int i5 = (int) f6;
                    canvas2.translate((i5 - hl.L(z ? 7.0f : 10.0f)) + i2, f3);
                    canvas2.drawPath(this.y, paint);
                    canvas2.restore();
                    canvas2.save();
                    canvas2.translate(i5 + i2, ((getMeasuredHeight() - this.E.getHeight()) / 2.0f) + f3);
                    this.E.draw(canvas2);
                    canvas2.restore();
                    canvas2.restore();
                    if (i3 >= 0) {
                        canvas2.restoreToCount(i3);
                    }
                } else {
                    f3 = L5;
                    f4 = 16.0f;
                    f5 = 1.0f;
                    canvas2 = canvas;
                    i = measuredWidth;
                    f6 = L4;
                }
                float measuredHeight = (getMeasuredHeight() - this.F.getHeight()) / 2.0f;
                if (z2) {
                    L = (f6 + f2) - (hl.L(f4) * this.n);
                } else {
                    measuredHeight -= hl.L(12.0f) - f3;
                    L = i;
                }
                Rect rect = this.I;
                rect.set((int) L, (int) measuredHeight, (int) (this.F.getWidth() + L), (int) (this.F.getHeight() + measuredHeight));
                rect.inset(-hl.L(f4), -hl.L(f4));
                if (this.n > 0.0f) {
                    this.J.setBounds((getMeasuredWidth() / 2) - L2, (getMeasuredHeight() / 2) - L2, (getMeasuredWidth() / 2) + L2, (getMeasuredHeight() / 2) + L2);
                    this.J.draw(canvas2);
                    canvas2.save();
                    canvas2.translate(L, measuredHeight);
                    this.F.draw(canvas2);
                    canvas2.restore();
                } else {
                    setPressed(false);
                }
                if (this.n == f5 || this.H) {
                    return;
                }
                invalidate();
            }
        }

        @Override // android.view.View
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
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
                    float f = measuredHeight2;
                    path.setLastPoint(hl.N(2.5f), f - hl.N(3.12f));
                    path.lineTo(0.0f, f);
                    path.lineTo(hl.N(2.5f), hl.N(3.12f) + f);
                } else {
                    float f2 = measuredHeight2;
                    path.setLastPoint(hl.N(4.0f), f2 - hl.N(5.0f));
                    path.lineTo(0.0f, f2);
                    path.lineTo(hl.N(4.0f), hl.N(5.0f) + f2);
                }
                int i3 = (int) this.f;
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.E = new StaticLayout(this.d, textPaint, i3, alignment, 1.0f, 0.0f, false);
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
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            Rect rect = this.I;
            if (action == 0) {
                boolean contains = rect.contains(x, y);
                this.G = contains;
                if (contains) {
                    this.J.setHotspot(x, y);
                    setPressed(true);
                }
                return this.G;
            }
            boolean z = this.G;
            if (!z) {
                return z;
            }
            if (motionEvent.getAction() == 2 && !rect.contains(x, y)) {
                setPressed(false);
                return false;
            }
            if (motionEvent.getAction() == 1 && rect.contains(x, y)) {
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                long j = 0;
                if (chatActivityEnterView.T2 && chatActivityEnterView.d1) {
                    chatActivityEnterView.O3.H1(5, 0, chatActivityEnterView.P ? Integer.MAX_VALUE : 0, chatActivityEnterView.o7, 0L, true);
                    bx1 bx1Var = chatActivityEnterView.K0;
                    chatActivityEnterView.o7 = 0L;
                    bx1Var.setEffect(0L);
                } else {
                    chatActivityEnterView.O3.z0(0);
                    MediaController.z().F0(0, 0, false, chatActivityEnterView.P);
                }
                chatActivityEnterView.Q3 = null;
                chatActivityEnterView.S3 = null;
                chatActivityEnterView.T3 = null;
                chatActivityEnterView.X1 = 0L;
                chatActivityEnterView.u3 = false;
                ls6 d0 = ls6.d0(chatActivityEnterView.R);
                long j2 = chatActivityEnterView.F3;
                zu1 zu1Var = chatActivityEnterView.E3;
                if (zu1Var != null && zu1Var.x4) {
                    j = zu1Var.c();
                }
                d0.D1(j2, j, null);
                chatActivityEnterView.D2(2, true);
                chatActivityEnterView.P(true);
            }
            return true;
        }

        public void setCancelToProgress(float f) {
            this.n = f;
        }

        @Override // android.view.View
        public final boolean verifyDrawable(Drawable drawable) {
            return this.J == drawable || super.verifyDrawable(drawable);
        }
    }

    public ChatActivityEnterView(Activity activity, wma wmaVar, zu1 zu1Var, boolean z, vnb vnbVar) {
        super(activity);
        byte b;
        String str;
        int i;
        xy1 xy1Var;
        this.h = 1.0f;
        this.n = 1.0f;
        this.r = 1.0f;
        this.s = 1.0f;
        this.F = 1.0f;
        this.G = 1.0f;
        this.J = 0.0f;
        byte b2 = 1;
        this.K = true;
        int i2 = yac.t0;
        this.R = i2;
        this.S = k5.a(i2);
        this.U = 1;
        this.d0 = -1;
        this.U7 = 1;
        this.y0 = true;
        this.z0 = true;
        this.A0 = true;
        this.C0 = new HashMap();
        this.D0 = false;
        this.E0 = false;
        this.q1 = new mv1(this, (byte) 28);
        this.z1 = 1.0f;
        this.C1 = new SparseArray();
        this.N1 = new Paint(1);
        this.Q1 = new int[2];
        this.R1 = new int[2];
        this.W1 = new kc(this, (byte) 19);
        this.k2 = 1.0f;
        this.U2 = -1;
        this.Y2 = true;
        this.s3 = -1.0f;
        this.t3 = hl.L(80.0f);
        this.C3 = new int[2];
        this.N3 = true;
        this.d4 = -1;
        this.f4 = true;
        this.g4 = new dx1(this, (byte) 0);
        this.h4 = new gf0(this);
        this.i4 = new px1(Integer.class, "translationY", (byte) 0);
        this.j4 = new b(Float.class, "scale");
        this.k4 = new e(Float.class, "controlsScale");
        this.l4 = new Paint(1);
        this.y4 = new g(this);
        this.z4 = new pn(null);
        this.A4 = new Paint(1);
        this.G4 = new RectF();
        this.H4 = new Rect();
        this.I4 = new Rect();
        this.M4 = new dx1(this, (byte) 3);
        this.N4 = new qw1(this, (byte) 4);
        this.O4 = new qw1(this, (byte) 0);
        this.P4 = new qw1(this, (byte) 1);
        this.Q4 = new qw1(this, (byte) 2);
        this.R4 = new qw1(this, (byte) 3);
        this.f5 = 1.0f;
        this.g5 = true;
        this.o5 = new TextPaint(1);
        this.p5 = new Paint(1);
        this.q5 = new Paint(1);
        this.r5 = new Path();
        this.s5 = new Path();
        this.t5 = new RectF();
        this.u5 = new int[2];
        this.v5 = new int[2];
        this.y5 = new qf5((byte) 15);
        this.Y5 = new Paint(2);
        this.a6 = new mv1(this, (byte) 5);
        this.d6 = 1.0f;
        this.e6 = 1.0f;
        this.f6 = 1.0f;
        this.h6 = true;
        this.i6 = true;
        this.l6 = new Paint();
        this.m6 = 1.0f;
        this.n6 = new Rect();
        this.p6 = new mv1(this, (byte) 7);
        this.s6 = true;
        this.A6 = -1;
        this.I6 = new int[2];
        this.J6 = new int[2];
        this.K6 = new RectF();
        this.M6 = new RectF();
        this.O6 = new RectF();
        this.Z6 = new mv1(this, (byte) 11);
        this.a7 = new dx1(this, (byte) 2);
        this.e7 = new float[2];
        this.f7 = new float[2];
        this.g7 = new int[2];
        this.j7 = new wm2[1];
        this.V7 = 1;
        this.y7 = -1;
        Paint paint = new Paint(1);
        this.D7 = paint;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.E7 = linearGradient;
        this.F7 = new Matrix();
        k43 k43Var = k43.h;
        this.G7 = new mm(this, 0L, 280L, k43Var);
        this.H7 = new mm(this, 0L, 280L, k43Var);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setShader(linearGradient);
        k43 k43Var2 = bb2.V;
        this.K7 = new t84(0, this, k43Var2, 250L);
        this.L7 = new fm0(1, this, k43Var2, 250L, false);
        this.M7 = new fm0(2, this, k43Var, 320L, false);
        this.N7 = new fm0(3, this, k43Var, 320L, false);
        this.R7 = new int[2];
        this.S7 = new int[2];
        this.K4 = vnbVar;
        this.L4 = z;
        this.X2 = z && !hl.E && (zu1Var == null || !zu1Var.isInBubbleMode());
        Paint paint2 = new Paint(1);
        this.F2 = paint2;
        paint2.setColor(J0(aob.Sf));
        setFocusable(true);
        setFocusableInTouchMode(true);
        setWillNotDraw(false);
        setClipChildren(false);
        jn7.f(this.R).b(this, jn7.l2);
        jn7.f(this.R).b(this, jn7.o2);
        jn7.f(this.R).b(this, jn7.p2);
        jn7.f(this.R).b(this, jn7.m2);
        jn7.f(this.R).b(this, jn7.X5);
        jn7.f(this.R).b(this, jn7.n2);
        jn7.f(this.R).b(this, jn7.k2);
        jn7.f(this.R).b(this, jn7.s);
        jn7.f(this.R).b(this, jn7.s2);
        jn7.f(this.R).b(this, jn7.u2);
        jn7.f(this.R).b(this, jn7.e2);
        jn7.f(this.R).b(this, jn7.z0);
        jn7.f(this.R).b(this, jn7.K);
        jn7.f(this.R).b(this, jn7.n1);
        jn7.f(this.R).b(this, jn7.t2);
        jn7.f(this.R).b(this, jn7.T2);
        jn7.f(this.R).b(this, jn7.a3);
        jn7.f(this.R).b(this, jn7.i5);
        jn7.f(this.R).b(this, jn7.S3);
        jn7.e().b(this, jn7.l4);
        this.D3 = activity;
        this.E3 = zu1Var;
        if (zu1Var != null) {
            this.v3 = zu1Var.getClassGuid();
        }
        this.b2 = wmaVar;
        this.c2 = wmaVar;
        wmaVar.setDelegate(this);
        this.q3 = uc7.e1().getBoolean("send_by_enter", false);
        rw1 rw1Var = new rw1(this, activity, (byte) 0);
        this.o2 = rw1Var;
        rw1Var.setClipChildren(false);
        rw1Var.setClipToPadding(false);
        rw1Var.setPadding(0, hl.L(1.0f), 0, 0);
        addView(rw1Var, tre.d(-1, -2.0f, 83, 0.0f, 1.0f, 0.0f, 0.0f));
        rw1 rw1Var2 = new rw1(this, activity, b2);
        this.n2 = rw1Var2;
        rw1Var2.setClipChildren(false);
        rw1Var.addView(rw1Var2, tre.d(-1, -2.0f, 80, 0.0f, 0.0f, 44.0f, 0.0f));
        tw1 tw1Var = new tw1(this, activity);
        this.R0 = tw1Var;
        tw1Var.setContentDescription(ob6.M0(2131754880, null));
        tw1Var.setFocusable(true);
        int L = hl.L(7.5f);
        tw1Var.setPadding(L, L, L, L);
        int i3 = aob.Nl;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        yob.s(tw1Var, i3, vnbVar, mode);
        int i4 = aob.i6;
        int J0 = J0(i4);
        float L2 = hl.L(19.0f);
        int L3 = hl.L(1.0f);
        int L4 = hl.L(3.0f);
        tw1Var.setBackground(aob.W(L2, J0, L3, L4, L3, L4));
        byte b3 = 3;
        tw1Var.setOnClickListener(new pv1(this, b3));
        rw1Var2.addView(tw1Var, tre.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        O1(false, false);
        ImageView imageView = new ImageView(activity);
        this.S0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.menu_delete_old);
        yob.s(imageView, i3, vnbVar, mode);
        int J02 = J0(i4);
        float L5 = hl.L(19.0f);
        int L6 = hl.L(1.0f);
        int L7 = hl.L(3.0f);
        imageView.setBackground(aob.W(L5, J02, L6, L7, L6, L7));
        imageView.setVisibility(8);
        imageView.setContentDescription(ob6.M0(2131754031, null));
        imageView.setOnClickListener(new sb1((Object) this, (Object) vnbVar, (byte) 10));
        rw1Var2.addView(imageView, tre.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        if (z) {
            int i5 = zu1Var != null ? zu1Var.g4 : -1;
            oob oobVar = new oob(b3, activity, this);
            this.e2 = oobVar;
            oobVar.setOrientation(0);
            oobVar.setEnabled(false);
            oobVar.setClipChildren(false);
            rw1Var2.addView(oobVar, tre.d(-2, 44.0f, 85, 0.0f, 0.0f, 44.0f, 0.0f));
            if (i5 != 9) {
                ImageView imageView2 = new ImageView(activity);
                this.x2 = imageView2;
                c43 c43Var = new c43(activity, R.drawable.input_notify_on, i3);
                this.f0 = c43Var;
                imageView2.setImageDrawable(c43Var);
                this.f0.a(this.V2, false);
                if (this.V2) {
                    str = "AccDescrChanSilentOn";
                    i = 2131754902;
                } else {
                    str = "AccDescrChanSilentOff";
                    i = 2131754903;
                }
                imageView2.setContentDescription(ob6.M0(i, str));
                yob.s(imageView2, i3, vnbVar, PorterDuff.Mode.MULTIPLY);
                imageView2.setScaleType(scaleType);
                hf0 f0 = aob.f0(J0(i4), 1, -1);
                uob M = yob.M(i4);
                imageView2.setBackground(f0);
                yob.j(imageView2, f0, null, M, vnbVar);
                imageView2.setVisibility((!this.W2 || ((xy1Var = this.O3) != null && xy1Var.e0())) ? 8 : 0);
                oobVar.addView(imageView2, tre.o(44, 44));
                imageView2.setOnClickListener(new uw1(this, zu1Var, activity));
            }
            vw1 vw1Var = new vw1(this, activity, (byte) 0);
            this.g2 = vw1Var;
            vw1Var.setScaleType(scaleType);
            yob.s(vw1Var, i3, vnbVar, PorterDuff.Mode.MULTIPLY);
            vw1Var.setImageResource(R.drawable.msg_input_attach2);
            hf0 f02 = aob.f0(J0(i4), 1, -1);
            uob M2 = yob.M(i4);
            vw1Var.setBackground(f02);
            yob.j(vw1Var, f02, null, M2, vnbVar);
            rw1Var2.addView(vw1Var, tre.e(44, 44, 85));
            b = 4;
            vw1Var.setOnClickListener(new pv1(this, b));
            vw1Var.setContentDescription(ob6.M0(2131754917, null));
            z2(1);
        } else {
            b = 4;
        }
        ImageView imageView3 = new ImageView(activity);
        this.i2 = imageView3;
        hc hcVar = new hc(activity);
        this.h2 = hcVar;
        imageView3.setImageDrawable(hcVar);
        imageView3.setScaleType(scaleType);
        PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
        yob.s(imageView3, i3, vnbVar, mode2);
        hf0 f03 = aob.f0(J0(i4), 1, hl.L(16.0f));
        uob M3 = yob.M(i4);
        imageView3.setBackground(f03);
        yob.j(imageView3, f03, null, M3, vnbVar);
        rw1Var.addView(imageView3, tre.d(44, 44.0f, 51, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView3.setContentDescription(ob6.M0(2131755003, null));
        iye.a(imageView3);
        imageView3.setOnClickListener(new pv1(this, (byte) 5));
        imageView3.setVisibility(8);
        imageView3.setAlpha(0.0f);
        imageView3.setScaleX(0.6f);
        imageView3.setScaleY(0.6f);
        ImageView imageView4 = new ImageView(activity);
        this.j2 = imageView4;
        imageView4.setImageResource(R.drawable.iv_fullscreen);
        imageView4.setScaleType(scaleType);
        yob.s(imageView4, i3, vnbVar, mode2);
        hf0 f04 = aob.f0(J0(i4), 1, hl.L(16.0f));
        uob M4 = yob.M(i4);
        imageView4.setBackground(f04);
        yob.j(imageView4, f04, null, M4, vnbVar);
        rw1Var.addView(imageView4, tre.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(ob6.M0(2131754026, null));
        iye.a(imageView4);
        imageView4.setOnClickListener(new pv1(this, (byte) 6));
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setScaleX(0.6f);
        imageView4.setScaleY(0.6f);
        if (this.Q3 != null) {
            c0();
        }
        ImageView imageView5 = new ImageView(activity);
        this.q2 = imageView5;
        imageView5.setImageResource(R.drawable.send_outline);
        imageView5.setScaleType(scaleType);
        imageView5.setVisibility(8);
        yob.s(imageView5, aob.Yl, vnbVar, mode);
        rw1Var.addView(imageView5, tre.e(44, 44, 85));
        rw1 rw1Var3 = new rw1(this, activity, (byte) 2);
        this.p2 = rw1Var3;
        rw1Var3.setClipChildren(false);
        rw1Var3.setClipToPadding(false);
        rw1Var.addView(rw1Var3, tre.e(100, 44, 85));
        a aVar = new a(this, activity, vnbVar);
        this.a1 = aVar;
        aVar.setSoundEffectsEnabled(false);
        rw1Var3.addView(aVar, tre.e(44, 44, 85));
        aVar.setFocusable(true);
        aVar.setImportantForAccessibility(1);
        Drawable mutate = getResources().getDrawable(R.drawable.input_mic).mutate();
        this.B4 = mutate;
        yob.x(this, mutate, i3, vnbVar, mode2);
        Drawable mutate2 = getResources().getDrawable(R.drawable.input_video).mutate();
        this.C4 = mutate2;
        yob.x(this, mutate2, i3, vnbVar, mode2);
        zw1 zw1Var = new zw1(this, activity);
        this.c1 = zw1Var;
        zw1Var.setImportantForAccessibility(2);
        int L8 = hl.L(10.0f);
        zw1Var.setPadding(L8, L8, L8, L8);
        aVar.addView(zw1Var, tre.c(44.0f, 44));
        ImageView imageView6 = new ImageView(activity);
        this.Q0 = imageView6;
        imageView6.setVisibility(b);
        imageView6.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ax1 ax1Var = new ax1();
        this.E2 = ax1Var;
        imageView6.setImageDrawable(ax1Var);
        imageView6.setContentDescription(ob6.M0(2131752570, "Cancel"));
        imageView6.setSoundEffectsEnabled(false);
        imageView6.setScaleX(0.1f);
        imageView6.setScaleY(0.1f);
        imageView6.setAlpha(0.0f);
        hf0 f05 = aob.f0(J0(i4), 1, -1);
        uob M5 = yob.M(i4);
        imageView6.setBackground(f05);
        yob.j(imageView6, f05, null, M5, vnbVar);
        rw1Var3.addView(imageView6, tre.e(44, 44, 85));
        imageView6.setOnClickListener(new pv1(this, (byte) 11));
        bx1 bx1Var = new bx1(this, activity, c() ? R.drawable.input_schedule : R.drawable.send_plane_24, vnbVar);
        this.K0 = bx1Var;
        bx1Var.setVisibility(b);
        bx1Var.setContentDescription(ob6.M0(2131745368, null));
        byte b4 = 0;
        bx1Var.setSoundEffectsEnabled(false);
        bx1Var.setScaleX(0.1f);
        bx1Var.setScaleY(0.1f);
        bx1Var.setAlpha(0.0f);
        rw1Var3.addView(bx1Var, tre.e(100, 44, 85));
        bx1Var.setOnClickListener(new pv1(this, (byte) 12));
        bx1Var.setOnLongClickListener(new iw1(this, b4));
        if (hl.A1()) {
            rw1Var3.setOnLongClickListener(new iw1(this, b4));
        }
        n4a n4aVar = new n4a(activity, vnbVar);
        this.J0 = n4aVar;
        n4aVar.setVisibility(b);
        n4aVar.setOnClickListener(new pv1(this, (byte) 17));
        rw1Var3.addView(n4aVar, tre.e(44, 44, 85));
        cz1 cz1Var = new cz1(activity);
        ema emaVar = (ema) cz1Var.c;
        this.G0 = cz1Var;
        emaVar.setTextSize(16);
        cz1Var.invalidate();
        cz1Var.setVisibility(b);
        cz1Var.setSoundEffectsEnabled(false);
        cz1Var.setScaleX(0.1f);
        cz1Var.setScaleY(0.1f);
        cz1Var.setAlpha(0.0f);
        cz1Var.setPadding(hl.L(14.0f), 0, hl.L(14.0f), 0);
        emaVar.setGravity(21);
        cz1Var.invalidate();
        emaVar.setTextColor(J0(i3));
        cz1Var.invalidate();
        rw1Var3.addView(cz1Var, tre.e(74, 44, 85));
        cz1Var.setOnClickListener(new pv1(this, (byte) 20));
        cz1Var.setOnLongClickListener(new iw1(this, b2));
        SharedPreferences d1 = uc7.d1();
        this.m3 = d1.getInt("kbd_height", hl.L(200.0f));
        this.n3 = d1.getInt("kbd_height_land3", hl.L(200.0f));
        X1(false, false);
        P(false);
        J();
        b0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0126, code lost:
    
        if (r4 != null) goto L72;
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
    public static boolean N(int i, long j, org.telegram.ui.ActionBar.e eVar, CharSequence charSequence) {
        hm[] hmVarArr;
        int i2;
        int i3;
        TLRPC.ChatFull N0;
        TLRPC.TL_messages_stickerSet a0;
        ArrayList arrayList;
        int i4;
        ArrayList<TLRPC.Document> arrayList2;
        ArrayList<TLRPC.Document> arrayList3;
        Object obj;
        ArrayList<TLRPC.Document> arrayList4;
        boolean z = false;
        if (charSequence != null && eVar != null && !yac.h(i).p() && yac.h(i).e() != j && (charSequence instanceof Spanned) && (hmVarArr = (hm[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), hm.class)) != null) {
            int i5 = 0;
            while (i5 < hmVarArr.length) {
                hm hmVar = hmVarArr[i5];
                if (hmVar != null) {
                    TLRPC.Document document = hmVar.document;
                    if (document == null) {
                        i3 = i;
                        document = wl.e(i3, hmVar.getDocumentId());
                    } else {
                        i3 = i;
                    }
                    long documentId = hmVarArr[i5].getDocumentId();
                    if (document == null) {
                        ArrayList t0 = ls6.d0(i3).t0(5);
                        int size = t0.size();
                        ?? r12 = z;
                        ?? r6 = t0;
                        while (r12 < size) {
                            Object obj2 = r6.get(r12);
                            int i6 = r12 + 1;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
                            if (tL_messages_stickerSet != null && (arrayList4 = tL_messages_stickerSet.documents) != null && !arrayList4.isEmpty()) {
                                ArrayList<TLRPC.Document> arrayList5 = tL_messages_stickerSet.documents;
                                int size2 = arrayList5.size();
                                ?? r15 = z;
                                r6 = r6;
                                while (r15 < size2) {
                                    TLRPC.Document document2 = arrayList5.get(r15);
                                    int i7 = r15 + 1;
                                    TLRPC.Document document3 = document2;
                                    i2 = i5;
                                    obj = r6;
                                    if (document3.id == documentId) {
                                        document = document3;
                                        break;
                                    }
                                    r6 = obj;
                                    i5 = i2;
                                    r15 = i7;
                                }
                            }
                            i2 = i5;
                            obj = r6;
                            if (document != null) {
                                break;
                            }
                            r6 = obj;
                            i5 = i2;
                            z = false;
                            r12 = i6;
                        }
                    }
                    i2 = i5;
                    if (document == null) {
                        ArrayList arrayList6 = ls6.d0(i3).t0[1];
                        int size3 = arrayList6.size();
                        int i8 = 0;
                        while (i8 < size3) {
                            Object obj3 = arrayList6.get(i8);
                            i8++;
                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj3;
                            if (stickerSetCovered != null && (arrayList3 = stickerSetCovered.covers) != null && !arrayList3.isEmpty()) {
                                ArrayList<TLRPC.Document> arrayList7 = stickerSetCovered.covers;
                                int size4 = arrayList7.size();
                                int i9 = 0;
                                while (i9 < size4) {
                                    TLRPC.Document document4 = arrayList7.get(i9);
                                    i9++;
                                    TLRPC.Document document5 = document4;
                                    arrayList = arrayList6;
                                    i4 = size3;
                                    if (document5.id == documentId) {
                                        document = document5;
                                        break;
                                    }
                                    arrayList6 = arrayList;
                                    size3 = i4;
                                }
                            }
                            arrayList = arrayList6;
                            i4 = size3;
                            if (document == null) {
                                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                    arrayList2 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                } else {
                                    if ((stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) && stickerSetCovered.set != null) {
                                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                                        tL_inputStickerSetID.id = stickerSetCovered.set.id;
                                        TLRPC.TL_messages_stickerSet n0 = ls6.d0(i3).n0(tL_inputStickerSetID, true);
                                        if (n0 != null) {
                                            arrayList2 = n0.documents;
                                        }
                                    }
                                    arrayList2 = null;
                                }
                                if (arrayList2 != null && !arrayList2.isEmpty()) {
                                    int size5 = arrayList2.size();
                                    int i10 = 0;
                                    while (true) {
                                        if (i10 >= size5) {
                                            break;
                                        }
                                        TLRPC.Document document6 = arrayList2.get(i10);
                                        i10++;
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
                                size3 = i4;
                            } else {
                                break;
                            }
                        }
                    }
                    if (document != null && (N0 = uc7.s1(i3).N0(-j)) != null && N0.emojiset != null && (a0 = ls6.d0(i3).a0(N0.emojiset)) != null) {
                        ArrayList<TLRPC.Document> arrayList8 = a0.documents;
                        int size6 = arrayList8.size();
                        int i11 = 0;
                        while (i11 < size6) {
                            TLRPC.Document document8 = arrayList8.get(i11);
                            i11++;
                            if (document8.id == documentId) {
                                return false;
                            }
                        }
                    }
                    if (document == null || !r47.m3(document)) {
                        d31.b0(eVar).r(document, hl.S2(ob6.M0(2131743519, "UnlockPremiumEmojiHint")), ob6.M0(2131746762, "PremiumMore"), new yv1(eVar, (byte) 0)).j();
                        return true;
                    }
                } else {
                    i2 = i5;
                }
                i5 = i2 + 1;
                z = false;
            }
        }
        return z;
    }

    public static int R2(int[] iArr, int i) {
        for (int i2 = 0; i2 < 7; i2++) {
            if (i <= iArr[i2]) {
                return i2;
            }
        }
        return 7;
    }

    public static float S2(int i) {
        int i2 = i * 668265261;
        int i3 = (i2 ^ (i2 >>> 15)) * (-2048144789);
        return ((i3 ^ (i3 >>> 13)) >>> 8) / 1.6777216E7f;
    }

    public static void T1(View view, boolean z, Paint paint) {
        if (view != null) {
            if (z) {
                view.setLayerType(2, paint);
            } else if (view.getLayerType() != 0) {
                view.setLayerType(0, null);
            }
        }
    }

    public static int T2(int i) {
        return (Color.blue(i) + ((Color.green(i) * 6) + (Color.red(i) * 3))) / 10;
    }

    public static float V2(float f, float f2, float f3) {
        float i = Utilities.i((f3 - f) / (f2 - f), 1.0f, 0.0f);
        return xnb.B(i, 2.0f, 3.0f, i * i);
    }

    public static float W2(float f, float f2, float f3, float f4, float f5, float f6) {
        return xnb.z(f6, 0.2f, 0.9f, Utilities.i((((float) Math.hypot(f3 - f, f4 - f2)) / Math.max(1.0f, Math.abs(f5))) * 1.1f, 0.6f, 0.26f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public r47 getThreadMessage() {
        zu1 zu1Var = this.E3;
        if (zu1Var != null) {
            return zu1Var.m4;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getThreadMessageId() {
        r47 r47Var;
        zu1 zu1Var = this.E3;
        if (zu1Var == null || (r47Var = zu1Var.m4) == null) {
            return 0;
        }
        return r47Var.e1();
    }

    private String getTopicKeyString() {
        zu1 zu1Var = this.E3;
        if (zu1Var == null || !zu1Var.x4) {
            return String.valueOf(this.F3);
        }
        return this.F3 + "_" + zu1Var.c();
    }

    public static CharSequence q(Paint.FontMetricsInt fontMetricsInt, CharSequence charSequence, ArrayList arrayList) {
        boolean z;
        boolean z2;
        Collections.sort(arrayList, ls6.g2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(no4.a(charSequence, false));
        Object[] spans = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), Object.class);
        if (spans != null && spans.length > 0) {
            for (Object obj : spans) {
                spannableStringBuilder.removeSpan(obj);
            }
        }
        boolean z3 = true;
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                try {
                    TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i);
                    if (messageEntity.offset + messageEntity.length <= spannableStringBuilder.length()) {
                        if (messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            i8c i8cVar = new i8c("" + ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id, 3, null);
                            int i2 = messageEntity.offset;
                            spannableStringBuilder.setSpan(i8cVar, i2, messageEntity.length + i2, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            i8c i8cVar2 = new i8c("" + ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id, 3, null);
                            int i3 = messageEntity.offset;
                            spannableStringBuilder.setSpan(i8cVar2, i3, messageEntity.length + i3, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityCode) {
                            rmb rmbVar = new rmb();
                            rmbVar.a |= 4;
                            smb smbVar = new smb(rmbVar, 0);
                            int i4 = messageEntity.offset;
                            ls6.f(smbVar, i4, messageEntity.length + i4, spannableStringBuilder, true);
                        } else if (!(messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                            if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                rmb rmbVar2 = new rmb();
                                rmbVar2.a |= 1;
                                smb smbVar2 = new smb(rmbVar2, 0);
                                int i5 = messageEntity.offset;
                                ls6.f(smbVar2, i5, messageEntity.length + i5, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                rmb rmbVar3 = new rmb();
                                rmbVar3.a |= 2;
                                smb smbVar3 = new smb(rmbVar3, 0);
                                int i6 = messageEntity.offset;
                                ls6.f(smbVar3, i6, messageEntity.length + i6, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                rmb rmbVar4 = new rmb();
                                rmbVar4.a |= 8;
                                smb smbVar4 = new smb(rmbVar4, 0);
                                int i7 = messageEntity.offset;
                                ls6.f(smbVar4, i7, messageEntity.length + i7, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                rmb rmbVar5 = new rmb();
                                rmbVar5.a |= 16;
                                smb smbVar5 = new smb(rmbVar5, 0);
                                int i8 = messageEntity.offset;
                                ls6.f(smbVar5, i8, messageEntity.length + i8, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                h8c h8cVar = new h8c(messageEntity.url, null);
                                int i9 = messageEntity.offset;
                                spannableStringBuilder.setSpan(h8cVar, i9, messageEntity.length + i9, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityFormattedDate) {
                                rmb rmbVar6 = new rmb();
                                rmbVar6.a |= 128;
                                int i10 = messageEntity.offset;
                                rmbVar6.b = i10;
                                rmbVar6.c = i10 + messageEntity.length;
                                rmbVar6.d = messageEntity;
                                int i11 = messageEntity.offset;
                                no4 no4Var = new no4(spannableStringBuilder.subSequence(i11, messageEntity.length + i11).toString(), rmbVar6, (TLRPC.TL_messageEntityFormattedDate) messageEntity);
                                int i12 = messageEntity.offset;
                                spannableStringBuilder.setSpan(no4Var, i12, messageEntity.length + i12, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                rmb rmbVar7 = new rmb();
                                rmbVar7.a |= 256;
                                smb smbVar6 = new smb(rmbVar7, 0);
                                int i13 = messageEntity.offset;
                                ls6.f(smbVar6, i13, messageEntity.length + i13, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                hm hmVar = tL_messageEntityCustomEmoji.document != null ? new hm(tL_messageEntityCustomEmoji.document, fontMetricsInt) : new hm(tL_messageEntityCustomEmoji.document_id, fontMetricsInt);
                                int i14 = messageEntity.offset;
                                spannableStringBuilder.setSpan(hmVar, i14, messageEntity.length + i14, 33);
                            }
                        }
                    }
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
        }
        if (arrayList != null) {
            TreeSet treeSet = new TreeSet();
            HashMap hashMap = new HashMap();
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                TLRPC.MessageEntity messageEntity2 = (TLRPC.MessageEntity) arrayList.get(i15);
                if (messageEntity2.offset + messageEntity2.length <= spannableStringBuilder.length()) {
                    int i16 = messageEntity2.offset;
                    int i17 = messageEntity2.length + i16;
                    if (messageEntity2 instanceof TLRPC.TL_messageEntityBlockquote) {
                        treeSet.add(Integer.valueOf(i16));
                        treeSet.add(Integer.valueOf(i17));
                        hashMap.put(Integer.valueOf(i16), Integer.valueOf((hashMap.containsKey(Integer.valueOf(i16)) ? ((Integer) hashMap.get(Integer.valueOf(i16))).intValue() : 0) | (messageEntity2.collapsed ? 16 : 1)));
                        hashMap.put(Integer.valueOf(i17), Integer.valueOf((hashMap.containsKey(Integer.valueOf(i17)) ? ((Integer) hashMap.get(Integer.valueOf(i17))).intValue() : 0) | 2));
                    }
                }
            }
            Iterator it = treeSet.iterator();
            int i18 = 0;
            int i19 = 0;
            boolean z4 = false;
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int intValue = num.intValue();
                int intValue2 = ((Integer) hashMap.get(num)).intValue();
                if (i18 != intValue) {
                    int i20 = intValue - 1;
                    z2 = z3;
                    int i21 = (i20 < 0 || i20 >= spannableStringBuilder.length() || spannableStringBuilder.charAt(i20) != '\n') ? intValue : intValue - 1;
                    if (i19 > 0) {
                        r19.c(spannableStringBuilder, i18, i21, z4);
                    }
                    i18 = intValue + 1;
                    if (i18 >= spannableStringBuilder.length() || spannableStringBuilder.charAt(intValue) != '\n') {
                        i18 = intValue;
                    }
                } else {
                    z2 = z3;
                }
                if ((intValue2 & 2) != 0) {
                    i19--;
                }
                if ((intValue2 & 1) != 0 || (intValue2 & 16) != 0) {
                    i19++;
                    z4 = (intValue2 & 16) != 0 ? z2 : false;
                }
                z3 = z2;
            }
            z = z3;
            if (i18 < spannableStringBuilder.length() && i19 > 0) {
                r19.c(spannableStringBuilder, i18, spannableStringBuilder.length(), z4);
            }
        } else {
            z = true;
        }
        CharSequence m = pv3.m(new SpannableStringBuilder(spannableStringBuilder), fontMetricsInt, false, null, 0);
        if (arrayList != null) {
            try {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    TLRPC.MessageEntity messageEntity3 = (TLRPC.MessageEntity) arrayList.get(size);
                    if ((messageEntity3 instanceof TLRPC.TL_messageEntityPre) && messageEntity3.offset + messageEntity3.length <= m.length()) {
                        if (!(m instanceof Spannable)) {
                            m = new SpannableStringBuilder(m);
                        }
                        ((SpannableStringBuilder) m).insert(messageEntity3.offset + messageEntity3.length, (CharSequence) "```\n");
                        SpannableStringBuilder spannableStringBuilder2 = (SpannableStringBuilder) m;
                        int i22 = messageEntity3.offset;
                        StringBuilder sb = new StringBuilder();
                        sb.append("```");
                        String str = messageEntity3.language;
                        if (str == null) {
                            str = "";
                        }
                        sb.append(str);
                        sb.append("\n");
                        spannableStringBuilder2.insert(i22, (CharSequence) sb.toString());
                    }
                }
            } catch (Exception e2) {
                cc4.g(e2, z);
            }
        }
        return m;
    }

    private void setHintGlass(kg5 kg5Var) {
        zu1 zu1Var = this.E3;
        if (zu1Var != null) {
            kg5Var.k(zu1Var.L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSlowModeButtonVisible(boolean z) {
        int i;
        int i2 = z ? 0 : 8;
        cz1 cz1Var = this.G0;
        cz1Var.setVisibility(i2);
        if (z) {
            i = hl.L(cz1Var.b ? 26.0f : 16.0f);
        } else {
            i = 0;
        }
        tx1 tx1Var = this.F0;
        if (tx1Var == null || tx1Var.getPaddingRight() == i) {
            return;
        }
        this.F0.setPadding(0, hl.L(9.0f), i, hl.L(10.0f));
    }

    public final boolean A() {
        ep0 ep0Var = this.m0;
        return ep0Var != null && ep0Var.w;
    }

    public final void A0(boolean z) {
        vw1 vw1Var = this.g2;
        if (vw1Var != null) {
            vw1Var.invalidate();
        }
        oob oobVar = this.e2;
        if (oobVar == null || this.N2 || this.u3 || O2() || this.Q3 != null) {
            return;
        }
        tx1 tx1Var = this.F0;
        if (tx1Var == null || tx1Var.length() <= 0) {
            this.B7 = 0L;
            if (z) {
                this.F = 0.0f;
                s2();
            }
            x1();
            this.y = 0.0f;
            this.C7 = hl.L(8.0f);
            s2();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(hl.L(8.0f), 0.0f);
            ofFloat.addUpdateListener(new qv1(this, (byte) 12));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(oobVar, this.O4, 1.0f), ofFloat, z());
            if (vw1Var != null) {
                ViewPropertyAnimator viewPropertyAnimator = this.f2;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    this.f2 = null;
                }
                if (z || vw1Var.getAlpha() < 0.05f) {
                    this.k2 = 0.0f;
                    vw1Var.setAlpha(0.0f);
                    vw1Var.setScaleX(0.88f);
                    vw1Var.setScaleY(0.88f);
                }
                this.k2 = 1.0f;
                animatorSet.playTogether(ObjectAnimator.ofFloat(vw1Var, (Property<vw1, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(vw1Var, (Property<vw1, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(vw1Var, (Property<vw1, Float>) View.SCALE_Y, 1.0f));
            }
            animatorSet.setDuration(220L);
            animatorSet.setInterpolator(k43.h);
            animatorSet.start();
        }
    }

    public final void A1() {
        if (this.J1 || this.S1 != null) {
            hl.r(this.W1);
            ValueAnimator valueAnimator = this.V1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.V1 = null;
            }
            boc bocVar = this.S1;
            if (bocVar != null) {
                if (bocVar.c.hasFocus()) {
                    hl.t1(this.S1.c);
                    this.S1.c.clearFocus();
                }
                this.S1.setCollapsing(true);
            }
            this.T1 = false;
            this.Z5 = false;
            V1(false);
            v(0.0f);
            x59 x59Var = this.i1;
            if (x59Var != null) {
                x59Var.setVisibility(8);
            }
            e29 e29Var = this.h1;
            if (e29Var != null) {
                e29Var.setVisibility(0);
            }
            l lVar = this.D2;
            if (lVar != null) {
                this.b6 = 0.0f;
                lVar.setTranslationY(this.c6 + this.Q7);
            }
            bx1 bx1Var = this.K0;
            if (bx1Var != null) {
                hl.r(this.a6);
                bx1Var.setIconDimmed(false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a5, code lost:
    
        if (uc7.s1(r14.R).X3.getBoolean("show_gift_for_" + r14.E3.a(), true) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00db, code lost:
    
        if (uc7.s1(r14.R).X3.getBoolean(java.util.Calendar.getInstance().get(1) + "show_gift_for_" + r14.E3.a(), true) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e5, code lost:
    
        if (r2.display_gifts_button == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f9, code lost:
    
        if (r0.disallow_unique_stargifts != false) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A2(boolean z) {
        boolean z2;
        vnb vnbVar;
        kg5 kg5Var;
        TLRPC.UserFull userFull = getParentFragment() == null ? null : getParentFragment().s8;
        TLRPC.UserFull Y1 = uc7.s1(this.R).Y1(yac.h(this.R).e());
        TLRPC.User h = getParentFragment() == null ? null : getParentFragment().h();
        byte b = 1;
        if (!uc7.s1(this.R).N3() && getParentFragment() != null && h != null) {
            boolean z3 = f11.a;
            if ((!lbc.D(h) || (Y1 != null && Y1.display_gifts_button)) && !lbc.v(h) && !uc7.K2(h) && userFull != null) {
                if (!h.premium && uc7.s1(this.R).k4.K0.f && uc7.s1(this.R).k4.J0.f) {
                }
                if (pj0.e(userFull.birthday)) {
                }
                if (!userFull.display_gifts_button) {
                    if (Y1 != null) {
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
                zu1 zu1Var = this.E3;
                if (zu1Var != null && zu1Var.g4 == 0) {
                    z2 = true;
                    if (!z2 && (kg5Var = this.M) != null) {
                        kg5Var.f(true);
                    }
                    if (z2 && this.z2 == null) {
                        return;
                    }
                    vnbVar = this.K4;
                    if (this.z2 == null && this.E3 != null) {
                        vw1 vw1Var = new vw1(this, getContext(), b);
                        this.z2 = vw1Var;
                        vw1Var.setImageResource(R.drawable.msg_input_gift);
                        yob.s(this.z2, aob.Nl, vnbVar, PorterDuff.Mode.MULTIPLY);
                        this.z2.setVisibility(8);
                        this.z2.setContentDescription(ob6.M0(2131749469, null));
                        this.z2.setScaleType(ImageView.ScaleType.CENTER);
                        vw1 vw1Var2 = this.z2;
                        int i = aob.i6;
                        yob.R(vw1Var2, aob.f0(J0(i), 1, -1), null, yob.M(i), vnbVar);
                        this.e2.addView(this.z2, 0, tre.e(44, 44, 21));
                        this.z2.setOnClickListener(new pv1(this, (byte) 21));
                    }
                    hl.S3(this.z2, z2, 1.0f, true, 1.0f, z, new qv1(this, (byte) 7));
                    if (z2) {
                        return;
                    }
                    H();
                    return;
                }
            }
        }
        z2 = false;
        if (!z2) {
            kg5Var.f(true);
        }
        if (z2) {
        }
        vnbVar = this.K4;
        if (this.z2 == null) {
            vw1 vw1Var3 = new vw1(this, getContext(), b);
            this.z2 = vw1Var3;
            vw1Var3.setImageResource(R.drawable.msg_input_gift);
            yob.s(this.z2, aob.Nl, vnbVar, PorterDuff.Mode.MULTIPLY);
            this.z2.setVisibility(8);
            this.z2.setContentDescription(ob6.M0(2131749469, null));
            this.z2.setScaleType(ImageView.ScaleType.CENTER);
            vw1 vw1Var22 = this.z2;
            int i2 = aob.i6;
            yob.R(vw1Var22, aob.f0(J0(i2), 1, -1), null, yob.M(i2), vnbVar);
            this.e2.addView(this.z2, 0, tre.e(44, 44, 21));
            this.z2.setOnClickListener(new pv1(this, (byte) 21));
        }
        hl.S3(this.z2, z2, 1.0f, true, 1.0f, z, new qv1(this, (byte) 7));
        if (z2) {
        }
    }

    public final boolean B() {
        sy1 C = C();
        return (TextUtils.equals(C.a, this.R2.a) && ls6.M(this.R2.b, C.b)) ? false : true;
    }

    public final fy1 B0(r47 r47Var, boolean z) {
        fy1 fy1Var = new fy1(r47Var.K1, r47Var.k, true, true);
        if (z) {
            tx1 tx1Var = this.F0;
            CharSequence[] charSequenceArr = {tx1Var == null ? "" : tx1Var.getTextToUse()};
            ArrayList Y = ls6.d0(this.R).Y(charSequenceArr, true, true);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceArr[0].toString());
            r47.b(spannableStringBuilder, Y, true, true, false, true, 0);
            fy1Var.z = r47.A5(pv3.m(spannableStringBuilder, aob.o2.getFontMetricsInt(), false, null, 0), Y, aob.o2.getFontMetricsInt(), false);
        }
        return fy1Var;
    }

    public final void B1() {
        x59 x59Var = this.i1;
        if (x59Var != null) {
            x59Var.setPlaying(false);
        }
        if (this.T3 != null) {
            this.O3.H1(2, 0, this.P ? Integer.MAX_VALUE : 0, this.o7, 0L, true);
            this.o7 = 0L;
            this.K0.setEffect(0L);
        } else {
            r47 r47Var = MediaController.z().v0;
            if (r47Var != null && r47Var == this.S3) {
                MediaController.z().m(true, true, false, false);
            }
        }
        if (this.R3 != null) {
            if (f11.a) {
                uh9.s(this.R3, new StringBuilder("delete file "));
            }
            new File(this.R3).delete();
        }
        MediaController.z().j(true);
        ls6 d0 = ls6.d0(this.R);
        long j = this.F3;
        zu1 zu1Var = this.E3;
        d0.D1(j, (zu1Var == null || !zu1Var.x4) ? 0L : zu1Var.c(), null);
        MediaController.z().F0(0, 0, false, false);
        this.X1 = 0L;
        P0(false);
        P(true);
    }

    public final void B2() {
        tx1 tx1Var = this.F0;
        if (tx1Var != null) {
            tx1Var.setTranslationX(this.I + this.H);
        }
    }

    public final sy1 C() {
        tx1 tx1Var = this.F0;
        CharSequence[] charSequenceArr = {hl.m1(tx1Var == null ? "" : tx1Var.getTextToUse())};
        ArrayList Y = ls6.d0(this.R).Y(charSequenceArr, true, true);
        CharSequence charSequence = charSequenceArr[0];
        int size = Y.size();
        for (int i = 0; i < size; i++) {
            TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) Y.get(i);
            if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                messageEntity.length = charSequence.length() - messageEntity.offset;
            }
        }
        sy1 sy1Var = new sy1();
        sy1Var.a = charSequence.toString();
        sy1Var.b = Y;
        return sy1Var;
    }

    public final void C0() {
        if (this.z6 != null || this.F0 == null) {
            return;
        }
        sn3 sn3Var = new sn3(this.F0);
        this.z6 = sn3Var;
        sn3Var.C = true;
        sn3Var.D = true;
        sn3Var.F = 0.0f;
        sn3Var.E = hl.L(5.0f);
        z92 G0 = G0();
        if (G0 != null) {
            if (this.L6 == null) {
                this.L6 = new gn3();
            }
            if (G0.n == null) {
                G0.n = new h01((Object) this, (Object) G0, (byte) 20);
            }
        }
        int max = Math.max(this.F0.getWidth(), hl.q.x);
        sn3 sn3Var2 = this.z6;
        int L = hl.L(160.0f);
        sn3Var2.getClass();
        mva mvaVar = sn3Var2.c;
        if (max <= 0 || L <= 0) {
            return;
        }
        int L2 = (hl.L(4.0f) + max) * L;
        int[] iArr = sn3Var2.G;
        if (iArr == null || iArr.length < L2) {
            try {
                sn3Var2.G = new int[L2];
            } catch (Throwable unused) {
            }
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(hl.L(24.0f), hl.L(12.0f), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawColor(-16777216);
            int i = sn3Var2.w;
            int i2 = sn3Var2.x;
            sn3Var2.w = 0;
            sn3Var2.x = createBitmap.getHeight();
            int f = sn3Var2.f(64, createBitmap, true);
            for (int i3 = 0; i3 < f; i3++) {
                float[] fArr = sn3Var2.i;
                int i4 = i3 * 3;
                mvaVar.h(fArr[i4], fArr[i4 + 1], 1.0f, -1.0f, 0.05f, 0.0f);
            }
            mvaVar.b(canvas, 1.0f);
            mvaVar.a();
            sn3Var2.k = 0;
            sn3Var2.w = i;
            sn3Var2.x = i2;
            createBitmap.recycle();
        } catch (Throwable unused2) {
        }
    }

    public final void C1(TL_iv.RichMessage richMessage) {
        zu1 zu1Var = this.E3;
        if (zu1Var != null) {
            ls6.d0(this.R).T1(zu1Var.a(), zu1Var.N5(zu1Var.F5), "", null, null, null, null, 0L, false, false, richMessage);
        }
        setRichDraftPreview(richMessage);
    }

    public final void C2(TLRPC.Chat chat, TLRPC.UserFull userFull) {
        my1 my1Var;
        this.B0 = false;
        boolean z = true;
        this.b = true;
        this.A0 = true;
        this.y0 = true;
        this.z0 = true;
        if (chat != null) {
            this.b1 = (xc2.v(chat) || (xc2.s(chat) && this.T2)) ? false : true;
            this.b = xc2.t(chat);
            boolean q = xc2.q(chat);
            this.A0 = q;
            boolean z2 = (this.b || q) ? false : true;
            this.B0 = z2;
            this.n = z2 ? 0.5f : 1.0f;
            x2();
            if (!this.B0 && (my1Var = this.V0) != null) {
                my1Var.J(-this.F3, !this.A0, !this.b);
            }
            this.y0 = xc2.s(chat);
            this.z0 = xc2.v(chat);
        } else if (userFull != null) {
            this.b1 = userFull.voice_messages_forbidden;
            this.L = userFull;
        }
        if (chat != null || userFull != null) {
            this.n1 = this.b1;
            this.k1 = chat != null ? !xc2.v(chat) : userFull.voice_messages_forbidden;
            this.o1 = chat != null && xc2.s(chat) && this.T2;
        }
        boolean z3 = this.k1 && this.A0 && !this.T7 && pie.a(getContext());
        this.l1 = z3;
        this.b1 = this.n1 && !z3;
        l0();
        if (this.k1 && !this.m1) {
            this.m1 = true;
            DictationAsr.i(this.q1);
            if (!qn3.h()) {
                qn3.j();
            }
        }
        float f = this.b1 ? 0.5f : 1.0f;
        a aVar = this.a1;
        aVar.setAlpha(f);
        aVar.invalidate();
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.b1 ? J0(aob.Nl) : -1, PorterDuff.Mode.SRC_IN);
        zw1 zw1Var = this.c1;
        zw1Var.setColorFilter(porterDuffColorFilter);
        zw1Var.invalidate();
        y2(false);
        boolean z4 = this.d1;
        if (!this.y0 && z4) {
            z4 = false;
        }
        if (this.l1 && this.o1) {
            z4 = uc7.e1().getBoolean("currentModeVideo", false);
        }
        if (this.z0 || z4 || this.l1) {
            z = z4;
        } else if (!this.T2) {
            z = false;
        }
        if (this.l1 && !this.o1) {
            z = false;
        }
        X1(z, false);
        zy1 zy1Var = this.a2;
        if (zy1Var != null) {
            zy1Var.d(j0());
        }
        zw1Var.invalidate();
    }

    public final float D(boolean z) {
        float f;
        float f2;
        fm0 fm0Var = this.L7;
        t84 t84Var = this.K7;
        if (z) {
            f = t84Var.h ? t84Var.g : t84Var.f;
            f2 = fm0Var.f ? 1.0f : 0.0f;
        } else {
            f = t84Var.f;
            f2 = fm0Var.e;
        }
        return ((this.v2 != null ? r2.getMeasuredHeight() : 0) * f2) + f;
    }

    public final bn3 D0() {
        bn3 bn3Var = this.j1;
        if (bn3Var != null) {
            return bn3Var;
        }
        bn3 bn3Var2 = new bn3(getContext(), new d(this));
        this.j1 = bn3Var2;
        return bn3Var2;
    }

    public final void D1(SpannableStringBuilder spannableStringBuilder, boolean z, int i, int i2) {
        if (this.F0 == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        pv3.m(spannableStringBuilder2, this.F0.getPaint().getFontMetricsInt(), false, null, 0);
        hm[] hmVarArr = (hm[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), hm.class);
        if (hmVarArr != null) {
            for (hm hmVar : hmVarArr) {
                hmVar.applyFontMetrics(this.F0.getPaint().getFontMetricsInt(), wl.f());
            }
        }
        r19.a(spannableStringBuilder2);
        T();
        setFieldText(spannableStringBuilder2);
        F1(z, i, i2, 0L, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:190:0x12c5  */
    /* JADX WARN: Type inference failed for: r0v24, types: [vz1] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r38v2 */
    /* JADX WARN: Type inference failed for: r38v3 */
    /* JADX WARN: Type inference failed for: r38v4 */
    /* JADX WARN: Type inference failed for: r38v6 */
    /* JADX WARN: Type inference failed for: r38v7 */
    /* JADX WARN: Type inference failed for: r38v8 */
    /* JADX WARN: Type inference failed for: r41v0, types: [byte, int] */
    /* JADX WARN: Type inference failed for: r4v100, types: [vz1] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r9v58 */
    /* JADX WARN: Type inference failed for: r9v59, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v61 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void D2(int i, boolean z) {
        boolean z2;
        char c;
        ez1 ez1Var;
        int i2;
        char c2;
        float f;
        int i3;
        ?? r7;
        boolean z3;
        ValueAnimator valueAnimator;
        char c3;
        int i4;
        boolean z4;
        ?? r38;
        int i5;
        char c4;
        int i6;
        char c5;
        ez1 ez1Var2;
        boolean z5;
        ?? r382;
        char c6;
        float f2;
        ?? r9;
        int i7;
        float f3;
        char c7;
        ViewGroup viewGroup;
        ViewGroup.LayoutParams layoutParams;
        int i8;
        char c8;
        char c9;
        float f4;
        gz1 gz1Var = gz1.a;
        gz1 gz1Var2 = gz1.b;
        Float valueOf = Float.valueOf(0.0f);
        this.H1 = SystemClock.uptimeMillis() + 1500;
        P2(i);
        Runnable runnable = this.g0;
        if (runnable != null) {
            hl.r(runnable);
            this.g0 = null;
        }
        RecordCircle recordCircle = this.C2;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
        boolean z6 = this.u3;
        Property property = View.TRANSLATION_X;
        Property property2 = View.ALPHA;
        Property property3 = View.SCALE_X;
        Property property4 = View.SCALE_Y;
        if (z6) {
            if (this.l3) {
                this.m7 = i;
                return;
            }
            boolean z7 = this.m7 == 3;
            if (!z7) {
                this.P = false;
                l lVar = this.D2;
                if (lVar != null) {
                    lVar.E.f(1, false, false);
                }
                ls6 d0 = ls6.d0(this.R);
                long j = this.F3;
                zu1 zu1Var = this.E3;
                d0.g2(j, (zu1Var == null || !zu1Var.x4) ? 0L : zu1Var.c(), this.P);
                this.X1 = 0L;
            }
            c0();
            this.l3 = true;
            my1 my1Var = this.V0;
            if (my1Var != null) {
                my1Var.setEnabled(false);
            }
            try {
                if (this.f3 == null) {
                    PowerManager.WakeLock newWakeLock = ((PowerManager) org.telegram.messenger.a.b.getSystemService("power")).newWakeLock(536870918, "telegram:audio_record_lock");
                    this.f3 = newWakeLock;
                    newWakeLock.acquire();
                }
            } catch (Exception e) {
                cc4.f(e);
            }
            hl.d2(this.D3);
            xy1 xy1Var = this.O3;
            if (xy1Var != null) {
                xy1Var.z0(0);
            }
            AnimatorSet animatorSet = this.i3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.j3;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            f0();
            b6 b6Var = this.e1;
            if (b6Var != null) {
                b6Var.setVisibility(0);
            }
            e0();
            RecordCircle recordCircle2 = this.C2;
            if (recordCircle2 != null) {
                recordCircle2.N = false;
                recordCircle2.setVisibility(0);
                this.C2.setAmplitude(0.0d);
            }
            l lVar2 = this.D2;
            if (lVar2 != null) {
                lVar2.setVisibility(0);
            }
            zy1 zy1Var = this.a2;
            if (zy1Var != null) {
                zy1Var.c();
                this.a2.g();
                this.a2.setScaleX(0.0f);
                this.a2.setScaleY(0.0f);
                this.a2.e = true;
            }
            this.i3 = new AnimatorSet();
            this.Z0.setVisibility(j0() ? 4 : 0);
            SlideTextView slideTextView = this.Z1;
            if (slideTextView != null) {
                slideTextView.setVisibility(j0() ? 4 : 0);
            }
            zy1 zy1Var2 = this.a2;
            if (zy1Var2 != null) {
                zy1Var2.d(j0());
            }
            this.Z0.setTranslationX(hl.L(20.0f));
            this.Z0.setAlpha(0.0f);
            byte b = this.m7;
            SlideTextView slideTextView2 = this.Z1;
            if (b != 3) {
                slideTextView2.setTranslationX(hl.L(20.0f));
                this.Z1.setAlpha(0.0f);
                this.Z1.setCancelToProgress(0.0f);
                this.Z1.a();
                this.Z1.setEnabled(true);
            } else {
                slideTextView2.setTranslationX(0.0f);
                this.Z1.setAlpha(0.0f);
                this.Z1.setCancelToProgress(1.0f);
                this.Z1.setEnabled(true);
            }
            this.C2.g(this.m7 == 3);
            this.Z2 = false;
            Y0();
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.R0, this.N4, 0.0f), ObjectAnimator.ofFloat(this.R0, this.P4, 0.0f), ObjectAnimator.ofFloat(this.a2, (Property<zy1, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.a2, (Property<zy1, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.Z0, (Property<ez1, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.Z0, (Property<ez1, Float>) property2, 1.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.Z1, (Property<SlideTextView, Float>) property, 0.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.Z1, (Property<SlideTextView, Float>) property2, 1.0f));
            l lVar3 = this.D2;
            if (lVar3 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(lVar3, (Property<l, Float>) property2, 1.0f));
            }
            if (this.c1 != null) {
                f4 = 0.0f;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.a1, (Property<a, Float>) property2, 0.0f));
            } else {
                f4 = 0.0f;
            }
            ep0 ep0Var = this.m0;
            if (ep0Var != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(ep0Var, (Property<ep0, Float>) property4, f4), ObjectAnimator.ofFloat(this.m0, (Property<ep0, Float>) property3, f4), ObjectAnimator.ofFloat(this.m0, (Property<ep0, Float>) property2, f4));
            }
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.playTogether(ObjectAnimator.ofFloat(this.F0, (Property<tx1, Float>) property2, j0() ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.f1, (Property<rw1, Float>) property2, 1.0f));
            if (!j0()) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.F0, this.R4, hl.L(20.0f)));
            }
            if (z7) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.i1, (Property<x59, Float>) property2, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.h1, (Property<e29, Float>) property2, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.h1, (Property<e29, Float>) property3, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.h1, (Property<e29, Float>) property4, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.g1, (Property<qgc, Float>) property2, 0.0f));
            }
            if (this.y2 != null) {
                animatorSet4.playTogether(n(hl.L(30.0f)), ObjectAnimator.ofFloat(this.y2, (Property<cx1, Float>) property2, 0.0f));
            }
            oob oobVar = this.e2;
            if (oobVar != null) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(oobVar, this.Q4, hl.L(30.0f)), ObjectAnimator.ofFloat(this.e2, this.O4, 0.0f));
                ViewPropertyAnimator viewPropertyAnimator = this.f2;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    this.f2 = null;
                }
                vw1 vw1Var = this.g2;
                this.k2 = 0.0f;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(vw1Var, (Property<vw1, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.g2, (Property<vw1, Float>) property3, 0.5f), ObjectAnimator.ofFloat(this.g2, (Property<vw1, Float>) property4, 0.5f));
            }
            vz1 vz1Var = this.J7;
            if (vz1Var != null) {
                vz1Var.e(0, false, true);
            }
            this.i3.playTogether(animatorSet3.setDuration(150L), animatorSet4.setDuration(150L), ObjectAnimator.ofFloat(this.C2, this.j4, 1.0f).setDuration(300L));
            if (!z7) {
                this.i3.playTogether(ObjectAnimator.ofFloat(this.C2, this.k4, 1.0f).setDuration(300L));
            }
            this.i3.addListener(new h(this, z7));
            this.i3.setInterpolator(new DecelerateInterpolator());
            this.i3.start();
            this.Z0.a(this.X1);
        } else {
            if (this.Z2 && i == 3) {
                return;
            }
            PowerManager.WakeLock wakeLock = this.f3;
            if (wakeLock != null) {
                try {
                    wakeLock.release();
                    this.f3 = null;
                } catch (Exception e2) {
                    cc4.f(e2);
                }
            }
            hl.K3(this.D3);
            this.b4 = false;
            if (!this.l3) {
                this.m7 = i;
                return;
            }
            gz1 gz1Var3 = gz1Var;
            this.S.b().O4(this.F3, getThreadMessageId());
            this.l3 = false;
            my1 my1Var2 = this.V0;
            if (my1Var2 != null) {
                my1Var2.setEnabled(true);
            }
            AnimatorSet animatorSet5 = this.i3;
            if (animatorSet5 != null) {
                z2 = animatorSet5.isRunning();
                zw1 zw1Var = this.c1;
                if (zw1Var != null) {
                    zw1Var.setScaleX(1.0f);
                    this.c1.setScaleY(1.0f);
                }
                this.i3.removeAllListeners();
                this.i3.cancel();
            } else {
                z2 = false;
            }
            AnimatorSet animatorSet6 = this.j3;
            if (animatorSet6 != null) {
                animatorSet6.cancel();
            }
            tx1 tx1Var = this.F0;
            if (tx1Var != null) {
                tx1Var.setVisibility(0);
            }
            this.i3 = new AnimatorSet();
            byte b2 = 9;
            if (z2) {
                c = 7;
            } else if (i == 4) {
                c = 7;
            } else {
                if (i == 3) {
                    c0();
                    e0();
                    r(z);
                    SlideTextView slideTextView3 = this.Z1;
                    if (slideTextView3 != null) {
                        slideTextView3.setEnabled(false);
                    }
                    if (this.d1) {
                        x59 x59Var = this.i1;
                        if (x59Var != null) {
                            x59Var.setVisibility(8);
                        }
                        rw1 rw1Var = this.f1;
                        if (rw1Var != null) {
                            rw1Var.setAlpha(1.0f);
                            this.f1.setVisibility(0);
                        }
                        e29 e29Var = this.h1;
                        if (e29Var != null) {
                            e29Var.setProgress(0.0f);
                            this.h1.i();
                        }
                        f3 = 1.0f;
                    } else {
                        qgc qgcVar = this.g1;
                        if (qgcVar != null) {
                            qgcVar.setVisibility(8);
                            Y0();
                        }
                        rw1 rw1Var2 = this.f1;
                        if (rw1Var2 != null) {
                            rw1Var2.setVisibility(0);
                            f3 = 1.0f;
                            this.f1.setAlpha(1.0f);
                        } else {
                            f3 = 1.0f;
                        }
                        x59 x59Var2 = this.i1;
                        if (x59Var2 != null) {
                            x59Var2.setVisibility(0);
                            this.i1.setAlpha(0.0f);
                        }
                    }
                    this.j5 = true;
                    this.b5 = f3;
                    this.Z4 = this.Y4;
                    this.X4 = f3;
                    SlideTextView slideTextView4 = this.Z1;
                    if (slideTextView4 != null) {
                        slideTextView4.setCancelToProgress(f3);
                    }
                    l lVar4 = this.D2;
                    if (lVar4 != null) {
                        lVar4.invalidate();
                    }
                    e29 e29Var2 = this.h1;
                    if (e29Var2 != null) {
                        e29Var2.setAlpha(0.0f);
                        this.h1.setScaleX(0.0f);
                        this.h1.setScaleY(0.0f);
                        this.h1.setProgress(0.0f);
                        this.h1.i();
                    }
                    if (this.d1 || this.j6) {
                        c7 = 7;
                        this.g1.setVisibility(0);
                        viewGroup = null;
                        layoutParams = null;
                    } else {
                        viewGroup = (ViewGroup) this.f1.getParent();
                        layoutParams = this.f1.getLayoutParams();
                        viewGroup.removeView(this.f1);
                        c7 = 7;
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(viewGroup.getMeasuredWidth() - (this.O2 == null ? c00.d(44.0f, this.K0.l(), 0) : 0), hl.L(44.0f));
                        layoutParams2.gravity = 80;
                        layoutParams2.leftMargin = hl.L(7.0f);
                        layoutParams2.rightMargin = hl.L(7.0f);
                        this.b2.addView(this.f1, layoutParams2);
                        this.g1.setVisibility(8);
                    }
                    Y0();
                    AnimatorSet animatorSet7 = new AnimatorSet();
                    if (z) {
                        this.i1.setAllowDraw(false);
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new qv1(this, b2));
                        ofFloat.addListener(new i(this));
                        ofFloat.setDuration(this.d1 ? 490L : this.J1 ? 560L : 580L);
                        if (this.J1 && !this.d1) {
                            ofFloat.setInterpolator(new LinearInterpolator());
                        }
                        AnimatorSet animatorSet8 = new AnimatorSet();
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.a2, (Property<zy1, Float>) property4, 0.0f);
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.a2, (Property<zy1, Float>) property3, 0.0f);
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.Z0, (Property<ez1, Float>) property2, 0.0f);
                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.Z0, (Property<ez1, Float>) property, -hl.L(20.0f));
                        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.Z1, (Property<SlideTextView, Float>) property2, 0.0f);
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.h1, (Property<e29, Float>) property2, 1.0f);
                        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.h1, (Property<e29, Float>) property4, 1.0f);
                        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.h1, (Property<e29, Float>) property3, 1.0f);
                        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this.R0, this.N4, 0.0f);
                        ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(this.R0, this.P4, 0.0f);
                        ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(this.F0, (Property<tx1, Float>) property2, 0.0f);
                        Animator[] animatorArr = new Animator[11];
                        animatorArr[0] = ofFloat2;
                        animatorArr[1] = ofFloat3;
                        animatorArr[2] = ofFloat4;
                        animatorArr[3] = ofFloat5;
                        animatorArr[4] = ofFloat6;
                        animatorArr[5] = ofFloat7;
                        animatorArr[6] = ofFloat8;
                        animatorArr[c7] = ofFloat9;
                        animatorArr[8] = ofFloat10;
                        animatorArr[9] = ofFloat11;
                        animatorArr[10] = ofFloat12;
                        animatorSet8.playTogether(animatorArr);
                        e29 e29Var3 = this.h1;
                        if (e29Var3 != null) {
                            e29Var3.setAlpha(0.0f);
                            this.h1.setScaleX(0.0f);
                            this.h1.setScaleY(0.0f);
                        }
                        if (this.c1 != null) {
                            i8 = 1;
                            animatorSet8.playTogether(ObjectAnimator.ofFloat(this.a1, (Property<a, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.a1, (Property<a, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.a1, (Property<a, Float>) property4, 1.0f));
                            zw1 zw1Var2 = this.c1;
                            if (this.d1) {
                                gz1Var3 = gz1Var2;
                            }
                            zw1Var2.j(gz1Var3, true);
                        } else {
                            i8 = 1;
                        }
                        ep0 ep0Var2 = this.m0;
                        if (ep0Var2 != null) {
                            float[] fArr = new float[i8];
                            fArr[0] = 0.0f;
                            ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(ep0Var2, (Property<ep0, Float>) property2, fArr);
                            ep0 ep0Var3 = this.m0;
                            float[] fArr2 = new float[i8];
                            fArr2[0] = 0.0f;
                            ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(ep0Var3, (Property<ep0, Float>) property3, fArr2);
                            ep0 ep0Var4 = this.m0;
                            float[] fArr3 = new float[i8];
                            fArr3[0] = 0.0f;
                            ObjectAnimator ofFloat15 = ObjectAnimator.ofFloat(ep0Var4, (Property<ep0, Float>) property4, fArr3);
                            Animator[] animatorArr2 = new Animator[3];
                            animatorArr2[0] = ofFloat13;
                            animatorArr2[i8] = ofFloat14;
                            animatorArr2[2] = ofFloat15;
                            animatorSet8.playTogether(animatorArr2);
                        }
                        animatorSet8.addListener(new pw1(this, (byte) 11));
                        boolean z8 = this.J1 && !this.d1;
                        animatorSet8.setDuration(z8 ? 120L : 150L);
                        animatorSet8.setStartDelay(z8 ? 0L : 150L);
                        if (this.d1) {
                            this.g1.setAlpha(0.0f);
                            c8 = 1;
                            c9 = 0;
                            animatorSet7.playTogether(ObjectAnimator.ofFloat(this.g1, (Property<qgc, Float>) property2, 1.0f));
                            animatorSet7.setDuration(150L);
                            animatorSet7.setStartDelay(430L);
                        } else {
                            c8 = 1;
                            c9 = 0;
                        }
                        AnimatorSet animatorSet9 = this.i3;
                        Animator[] animatorArr3 = new Animator[3];
                        animatorArr3[c9] = animatorSet8;
                        animatorArr3[c8] = ofFloat;
                        animatorArr3[2] = animatorSet7;
                        animatorSet9.playTogether(animatorArr3);
                        this.i3.addListener(new j8(this, viewGroup, layoutParams, (byte) 3));
                    } else {
                        f0();
                        this.j4.set(this.C2, Float.valueOf(1.0f));
                        this.C2.setTransformToSeekbar(1.0f);
                        if (!this.d1) {
                            float f5 = this.d5;
                            if (f5 != 0.0f && this.i1 != null) {
                                float interpolation = k43.j.getInterpolation(Math.max(0.0f, ((f5 - 0.38f) - 0.25f) / 0.37f));
                                x59 x59Var3 = this.i1;
                                if (this.J1) {
                                    interpolation = 1.0f;
                                }
                                x59Var3.setAlpha(interpolation);
                                this.i1.invalidate();
                            }
                        }
                        this.a2.setScaleY(0.0f);
                        this.a2.setScaleX(0.0f);
                        this.Z0.setAlpha(0.0f);
                        this.Z0.setTranslationX(-hl.L(20.0f));
                        this.Z1.setAlpha(0.0f);
                        this.h1.setAlpha(1.0f);
                        this.h1.setScaleY(1.0f);
                        this.h1.setScaleX(1.0f);
                        this.N4.set(this.R0, valueOf);
                        this.P4.set(this.R0, valueOf);
                        this.F0.setAlpha(0.0f);
                        zw1 zw1Var3 = this.c1;
                        if (zw1Var3 != null) {
                            if (this.d1) {
                                gz1Var3 = gz1Var2;
                            }
                            zw1Var3.j(gz1Var3, z);
                            this.a1.setAlpha(1.0f);
                            this.a1.setScaleX(1.0f);
                            this.a1.setScaleY(1.0f);
                        }
                        ep0 ep0Var5 = this.m0;
                        if (ep0Var5 != null) {
                            ep0Var5.setAlpha(0.0f);
                            this.m0.setScaleX(0.0f);
                            this.m0.setScaleY(0.0f);
                        }
                        if (this.d1) {
                            this.g1.setAlpha(1.0f);
                        }
                        if (viewGroup != null) {
                            this.b2.removeView(this.f1);
                            viewGroup.addView(this.f1, layoutParams);
                        }
                        this.f1.setAlpha(1.0f);
                        this.i1.setAlpha(1.0f);
                        this.h = 0.0f;
                        this.n = 0.0f;
                        x2();
                        Y0();
                    }
                } else if (i == 2 || i == 5) {
                    zw1 zw1Var4 = this.c1;
                    if (zw1Var4 != null) {
                        zw1Var4.setVisibility(0);
                    }
                    this.Z2 = true;
                    Y0();
                    ValueAnimator d02 = d0();
                    if (d02 != null) {
                        hl.d3(new fw1(this, (byte) 20), 80L);
                    }
                    AnimatorSet animatorSet10 = new AnimatorSet();
                    if (d02 == null) {
                        c3 = 0;
                        valueAnimator = d02;
                        i4 = 1;
                        animatorSet10.playTogether(ObjectAnimator.ofFloat(this.R0, this.N4, 1.0f), ObjectAnimator.ofFloat(this.R0, this.P4, this.B0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.a2, (Property<zy1, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.a2, (Property<zy1, Float>) property3, 0.0f));
                    } else {
                        valueAnimator = d02;
                        c3 = 0;
                        i4 = 1;
                    }
                    l lVar5 = this.D2;
                    int i9 = i4;
                    if (lVar5 != null) {
                        float[] fArr4 = new float[i9];
                        fArr4[c3] = 0.0f;
                        ObjectAnimator ofFloat16 = ObjectAnimator.ofFloat(lVar5, (Property<l, Float>) property2, fArr4);
                        ofFloat16.setDuration(160L);
                        ofFloat16.setInterpolator(k43.g);
                        AnimatorSet animatorSet11 = this.i3;
                        Animator[] animatorArr4 = new Animator[i9];
                        animatorArr4[c3] = ofFloat16;
                        animatorSet11.playTogether(animatorArr4);
                        this.D2.f();
                    }
                    ep0 ep0Var6 = this.m0;
                    if (ep0Var6 != null) {
                        float[] fArr5 = new float[i9];
                        fArr5[c3] = 1.0f;
                        ObjectAnimator ofFloat17 = ObjectAnimator.ofFloat(ep0Var6, (Property<ep0, Float>) property4, fArr5);
                        ep0 ep0Var7 = this.m0;
                        float[] fArr6 = new float[i9];
                        fArr6[c3] = 1.0f;
                        ObjectAnimator ofFloat18 = ObjectAnimator.ofFloat(ep0Var7, (Property<ep0, Float>) property3, fArr6);
                        ep0 ep0Var8 = this.m0;
                        float[] fArr7 = new float[i9];
                        fArr7[c3] = 1.0f;
                        ObjectAnimator ofFloat19 = ObjectAnimator.ofFloat(ep0Var8, (Property<ep0, Float>) property2, fArr7);
                        Animator[] animatorArr5 = new Animator[3];
                        animatorArr5[c3] = ofFloat17;
                        animatorArr5[i9] = ofFloat18;
                        animatorArr5[2] = ofFloat19;
                        animatorSet10.playTogether(animatorArr5);
                    }
                    AnimatorSet animatorSet12 = new AnimatorSet();
                    if (valueAnimator != null) {
                        SlideTextView slideTextView5 = this.Z1;
                        float[] fArr8 = new float[i9];
                        fArr8[c3] = 0.0f;
                        ObjectAnimator ofFloat20 = ObjectAnimator.ofFloat(slideTextView5, (Property<SlideTextView, Float>) property2, fArr8);
                        Animator[] animatorArr6 = new Animator[i9];
                        animatorArr6[c3] = ofFloat20;
                        animatorSet12.playTogether(animatorArr6);
                    } else {
                        ez1 ez1Var3 = this.Z0;
                        float[] fArr9 = new float[i9];
                        fArr9[c3] = 0.0f;
                        ObjectAnimator ofFloat21 = ObjectAnimator.ofFloat(ez1Var3, (Property<ez1, Float>) property2, fArr9);
                        ez1 ez1Var4 = this.Z0;
                        float[] fArr10 = new float[i9];
                        fArr10[c3] = -hl.L(20.0f);
                        ObjectAnimator ofFloat22 = ObjectAnimator.ofFloat(ez1Var4, (Property<ez1, Float>) property, fArr10);
                        SlideTextView slideTextView6 = this.Z1;
                        float[] fArr11 = new float[i9];
                        fArr11[c3] = 0.0f;
                        ObjectAnimator ofFloat23 = ObjectAnimator.ofFloat(slideTextView6, (Property<SlideTextView, Float>) property2, fArr11);
                        SlideTextView slideTextView7 = this.Z1;
                        float[] fArr12 = new float[1];
                        fArr12[c3] = -hl.L(20.0f);
                        ObjectAnimator ofFloat24 = ObjectAnimator.ofFloat(slideTextView7, (Property<SlideTextView, Float>) property, fArr12);
                        Animator[] animatorArr7 = new Animator[4];
                        animatorArr7[c3] = ofFloat21;
                        animatorArr7[1] = ofFloat22;
                        animatorArr7[2] = ofFloat23;
                        animatorArr7[3] = ofFloat24;
                        animatorSet12.playTogether(animatorArr7);
                    }
                    if (i != 5) {
                        this.a1.setScaleX(0.0f);
                        this.a1.setScaleY(0.0f);
                        vw1 vw1Var2 = this.g2;
                        if (vw1Var2 != null && vw1Var2.getVisibility() == 0) {
                            this.g2.setScaleX(0.5f);
                            this.g2.setScaleY(0.5f);
                        }
                        vw1 vw1Var3 = this.m2;
                        if (vw1Var3 != null && vw1Var3.getVisibility() == 0) {
                            this.m2.setScaleX(0.0f);
                            this.m2.setScaleY(0.0f);
                        }
                        animatorSet10.playTogether(ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f), ObjectAnimator.ofFloat(this.a1, (Property<a, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.a1, (Property<a, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.a1, (Property<a, Float>) property2, 1.0f));
                        if (this.e2 != null) {
                            ViewPropertyAnimator viewPropertyAnimator2 = this.f2;
                            if (viewPropertyAnimator2 != null) {
                                viewPropertyAnimator2.cancel();
                                this.f2 = null;
                            }
                            x1();
                            z5 = false;
                            animatorSet10.playTogether(ObjectAnimator.ofFloat(this.e2, this.O4, (O2() || this.X6) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(this.e2, this.Q4, 0.0f));
                            animatorSet10.playTogether(z());
                            vw1 vw1Var4 = this.g2;
                            this.k2 = 1.0f;
                            r382 = true;
                            animatorSet10.playTogether(ObjectAnimator.ofFloat(vw1Var4, (Property<vw1, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.g2, (Property<vw1, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.g2, (Property<vw1, Float>) property4, 1.0f));
                        } else {
                            z5 = false;
                            r382 = true;
                        }
                        vz1 vz1Var2 = this.J7;
                        boolean z9 = z5;
                        int i10 = r382;
                        if (vz1Var2 != null) {
                            vz1Var2.e(z9 ? 1 : 0, z9, i10);
                        }
                        vw1 vw1Var5 = this.m2;
                        if (vw1Var5 != null) {
                            float[] fArr13 = new float[i10];
                            fArr13[z9 ? 1 : 0] = 1.0f;
                            ObjectAnimator ofFloat25 = ObjectAnimator.ofFloat(vw1Var5, (Property<vw1, Float>) property3, fArr13);
                            vw1 vw1Var6 = this.m2;
                            float[] fArr14 = new float[i10];
                            fArr14[z9 ? 1 : 0] = 1.0f;
                            ObjectAnimator ofFloat26 = ObjectAnimator.ofFloat(vw1Var6, (Property<vw1, Float>) property4, fArr14);
                            char c10 = z9 ? 1 : 0;
                            Animator[] animatorArr8 = new Animator[2];
                            animatorArr8[c10] = ofFloat25;
                            animatorArr8[i10] = ofFloat26;
                            animatorSet10.playTogether(animatorArr8);
                            c6 = c10;
                        } else {
                            c6 = z9 ? 1 : 0;
                        }
                        if (this.c1 != null) {
                            a aVar = this.a1;
                            float[] fArr15 = new float[i10];
                            fArr15[c6] = 1.0f;
                            ObjectAnimator ofFloat27 = ObjectAnimator.ofFloat(aVar, (Property<a, Float>) property2, fArr15);
                            Animator[] animatorArr9 = new Animator[i10];
                            animatorArr9[c6] = ofFloat27;
                            animatorSet10.playTogether(animatorArr9);
                            a aVar2 = this.a1;
                            float[] fArr16 = new float[i10];
                            fArr16[c6] = 1.0f;
                            ObjectAnimator ofFloat28 = ObjectAnimator.ofFloat(aVar2, (Property<a, Float>) property3, fArr16);
                            Animator[] animatorArr10 = new Animator[i10];
                            animatorArr10[c6] = ofFloat28;
                            animatorSet10.playTogether(animatorArr10);
                            a aVar3 = this.a1;
                            float[] fArr17 = new float[i10];
                            fArr17[c6] = 1.0f;
                            ObjectAnimator ofFloat29 = ObjectAnimator.ofFloat(aVar3, (Property<a, Float>) property4, fArr17);
                            Animator[] animatorArr11 = new Animator[i10];
                            animatorArr11[c6] = ofFloat29;
                            animatorSet10.playTogether(animatorArr11);
                            zw1 zw1Var5 = this.c1;
                            if (this.d1) {
                                gz1Var3 = gz1Var2;
                            }
                            zw1Var5.j(gz1Var3, i10);
                        }
                        cx1 cx1Var = this.y2;
                        if (cx1Var != null) {
                            float[] fArr18 = new float[i10];
                            fArr18[0] = this.X6 ? 0.0f : 1.0f;
                            ObjectAnimator ofFloat30 = ObjectAnimator.ofFloat(cx1Var, (Property<cx1, Float>) property2, fArr18);
                            ValueAnimator n = n(0.0f);
                            Animator[] animatorArr12 = new Animator[2];
                            animatorArr12[0] = ofFloat30;
                            animatorArr12[i10] = n;
                            animatorSet10.playTogether(animatorArr12);
                        }
                    } else {
                        AnimatorSet animatorSet13 = new AnimatorSet();
                        if (i != 5) {
                            animatorSet13.playTogether(ObjectAnimator.ofFloat(this.a1, (Property<a, Float>) property2, 1.0f));
                        }
                        if (this.e2 != null) {
                            ViewPropertyAnimator viewPropertyAnimator3 = this.f2;
                            if (viewPropertyAnimator3 != null) {
                                viewPropertyAnimator3.cancel();
                                this.f2 = null;
                            }
                            x1();
                            r38 = true;
                            animatorSet13.playTogether(ObjectAnimator.ofFloat(this.e2, this.Q4, 0.0f), ObjectAnimator.ofFloat(this.e2, this.O4, (O2() || this.X6) ? 0.0f : 1.0f));
                            animatorSet13.playTogether(z());
                            vw1 vw1Var7 = this.g2;
                            this.k2 = 1.0f;
                            z4 = false;
                            animatorSet13.playTogether(ObjectAnimator.ofFloat(vw1Var7, (Property<vw1, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.g2, (Property<vw1, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.g2, (Property<vw1, Float>) property4, 1.0f));
                        } else {
                            z4 = false;
                            r38 = true;
                        }
                        vz1 vz1Var3 = this.J7;
                        boolean z10 = z4;
                        int i11 = r38;
                        if (vz1Var3 != null) {
                            vz1Var3.e(z10 ? 1 : 0, z10, i11);
                        }
                        cx1 cx1Var2 = this.y2;
                        if (cx1Var2 != null) {
                            float[] fArr19 = new float[i11];
                            fArr19[z10 ? 1 : 0] = this.X6 ? 0.0f : 1.0f;
                            ObjectAnimator ofFloat31 = ObjectAnimator.ofFloat(cx1Var2, (Property<cx1, Float>) property2, fArr19);
                            ValueAnimator n2 = n(0.0f);
                            Animator[] animatorArr13 = new Animator[2];
                            animatorArr13[z10 ? 1 : 0] = ofFloat31;
                            animatorArr13[i11] = n2;
                            animatorSet13.playTogether(animatorArr13);
                        }
                        animatorSet13.setDuration(150L);
                        animatorSet13.setStartDelay(110L);
                        animatorSet13.addListener(new pw1(this, (byte) 12));
                        AnimatorSet animatorSet14 = this.i3;
                        Animator[] animatorArr14 = new Animator[i11];
                        animatorArr14[0] = animatorSet13;
                        animatorSet14.playTogether(animatorArr14);
                    }
                    animatorSet10.setDuration(150L);
                    animatorSet10.setStartDelay(this.D1 ? 0L : 700L);
                    animatorSet12.setDuration(this.D1 ? 110L : valueAnimator != null ? 140L : 200L);
                    animatorSet12.setStartDelay((this.D1 || valueAnimator != null) ? 0L : 200L);
                    if (valueAnimator == null || (ez1Var2 = this.Z0) == null) {
                        i5 = 1;
                        c4 = 0;
                    } else {
                        ez1Var2.animate().cancel();
                        this.Z0.setPivotX(0.0f);
                        this.Z0.setPivotY(r4.getHeight() / 2.0f);
                        AnimatorSet animatorSet15 = new AnimatorSet();
                        i5 = 1;
                        c4 = 0;
                        ObjectAnimator ofFloat32 = ObjectAnimator.ofFloat(this.Z0, (Property<ez1, Float>) property2, 0.0f);
                        ez1 ez1Var5 = this.Z0;
                        animatorSet15.playTogether(ofFloat32, ObjectAnimator.ofFloat(ez1Var5, (Property<ez1, Float>) property, ez1Var5.getTranslationX() - hl.L(6.0f)), ObjectAnimator.ofFloat(this.Z0, (Property<ez1, Float>) property3, 0.94f), ObjectAnimator.ofFloat(this.Z0, (Property<ez1, Float>) property4, 0.94f));
                        animatorSet15.setDuration(140L);
                        animatorSet15.setInterpolator(k43.g);
                        this.i3.playTogether(animatorSet15);
                    }
                    this.H = 0.0f;
                    B2();
                    tx1 tx1Var2 = this.F0;
                    float[] fArr20 = new float[i5];
                    fArr20[c4] = 1.0f;
                    ObjectAnimator ofFloat33 = ObjectAnimator.ofFloat(tx1Var2, (Property<tx1, Float>) property2, fArr20);
                    ofFloat33.setStartDelay(this.D1 ? 110L : this.s == 1.0f ? 300L : 700L);
                    ofFloat33.setDuration(200L);
                    if (valueAnimator != null) {
                        ofFloat33.setStartDelay((long) Math.max(300.0f, this.U5 - 120.0f));
                        ofFloat33.setDuration(320L);
                        ofFloat33.setInterpolator(k43.g);
                        i6 = 1;
                        c5 = 0;
                        this.i3.playTogether(valueAnimator);
                        AnimatorSet U2 = U2();
                        if (U2 != null) {
                            this.i3.playTogether(U2);
                        }
                    } else {
                        i6 = 1;
                        c5 = 0;
                    }
                    AnimatorSet animatorSet16 = this.i3;
                    float[] fArr21 = new float[i6];
                    fArr21[c5] = this.Y4;
                    ObjectAnimator duration = ObjectAnimator.ofFloat(this, "lockAnimatedTranslation", fArr21).setDuration(200L);
                    Animator[] animatorArr15 = new Animator[4];
                    animatorArr15[c5] = animatorSet10;
                    animatorArr15[i6] = animatorSet12;
                    animatorArr15[2] = ofFloat33;
                    animatorArr15[3] = duration;
                    animatorSet16.playTogether(animatorArr15);
                    if (i == 5) {
                        this.C2.a();
                        float[] fArr22 = new float[i6];
                        fArr22[c5] = 1.0f;
                        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this, "slideToCancelProgress", fArr22).setDuration(200L);
                        duration2.setInterpolator(k43.j);
                        AnimatorSet animatorSet17 = this.i3;
                        Animator[] animatorArr16 = new Animator[i6];
                        animatorArr16[c5] = duration2;
                        animatorSet17.playTogether(animatorArr16);
                    } else {
                        float[] fArr23 = new float[i6];
                        fArr23[c5] = 1.0f;
                        ObjectAnimator ofFloat34 = ObjectAnimator.ofFloat(this, "exitTransition", fArr23);
                        ofFloat34.setDuration(this.D1 ? 280L : 360L);
                        ofFloat34.setStartDelay(this.D1 ? 0L : 490L);
                        this.i3.playTogether(ofFloat34);
                    }
                    zy1 zy1Var3 = this.a2;
                    if (zy1Var3 != null) {
                        if (this.D1) {
                            zy1Var3.setScaleX(0.0f);
                            this.a2.setScaleY(0.0f);
                        } else if (valueAnimator == null) {
                            zy1Var3.b();
                        }
                    }
                } else {
                    zw1 zw1Var6 = this.c1;
                    if (zw1Var6 != null) {
                        zw1Var6.setVisibility(0);
                    }
                    AnimatorSet animatorSet18 = new AnimatorSet();
                    animatorSet18.playTogether(ObjectAnimator.ofFloat(this.R0, this.N4, 1.0f), ObjectAnimator.ofFloat(this.R0, this.P4, this.B0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.a2, (Property<zy1, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.a2, (Property<zy1, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.a1, (Property<a, Float>) property2, 1.0f));
                    l lVar6 = this.D2;
                    if (lVar6 != null) {
                        animatorSet18.playTogether(ObjectAnimator.ofFloat(lVar6, (Property<l, Float>) property2, 0.0f));
                        this.D2.f();
                    }
                    ep0 ep0Var9 = this.m0;
                    if (ep0Var9 != null) {
                        f2 = 1.0f;
                        animatorSet18.playTogether(ObjectAnimator.ofFloat(ep0Var9, (Property<ep0, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.m0, (Property<ep0, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.m0, (Property<ep0, Float>) property2, 1.0f));
                    } else {
                        f2 = 1.0f;
                    }
                    zw1 zw1Var7 = this.c1;
                    if (zw1Var7 != null) {
                        zw1Var7.setScaleX(f2);
                        this.c1.setScaleY(f2);
                        animatorSet18.playTogether(ObjectAnimator.ofFloat(this.a1, (Property<a, Float>) property2, f2));
                        zw1 zw1Var8 = this.c1;
                        if (this.d1) {
                            gz1Var3 = gz1Var2;
                        }
                        zw1Var8.j(gz1Var3, true);
                    }
                    if (this.e2 != null) {
                        ViewPropertyAnimator viewPropertyAnimator4 = this.f2;
                        if (viewPropertyAnimator4 != null) {
                            viewPropertyAnimator4.cancel();
                            this.f2 = null;
                        }
                        x1();
                        i7 = 1;
                        r9 = 0;
                        animatorSet18.playTogether(ObjectAnimator.ofFloat(this.e2, this.O4, (O2() || this.X6) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(this.e2, this.Q4, 0.0f));
                        animatorSet18.playTogether(z());
                        vw1 vw1Var8 = this.g2;
                        this.k2 = 1.0f;
                        animatorSet18.playTogether(ObjectAnimator.ofFloat(vw1Var8, (Property<vw1, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.g2, (Property<vw1, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.g2, (Property<vw1, Float>) property4, 1.0f));
                    } else {
                        r9 = 0;
                        i7 = 1;
                    }
                    ?? r4 = this.J7;
                    if (r4 != 0) {
                        r4.e(r9, r9, i7);
                    }
                    cx1 cx1Var3 = this.y2;
                    if (cx1Var3 != null) {
                        float[] fArr24 = new float[i7];
                        fArr24[r9] = this.X6 ? 0.0f : 1.0f;
                        ObjectAnimator ofFloat35 = ObjectAnimator.ofFloat(cx1Var3, (Property<cx1, Float>) property2, fArr24);
                        ValueAnimator n3 = n(0.0f);
                        Animator[] animatorArr17 = new Animator[2];
                        animatorArr17[r9] = ofFloat35;
                        animatorArr17[i7] = n3;
                        animatorSet18.playTogether(animatorArr17);
                    }
                    animatorSet18.setDuration(150L);
                    animatorSet18.setStartDelay(200L);
                    AnimatorSet animatorSet19 = new AnimatorSet();
                    ez1 ez1Var6 = this.Z0;
                    float[] fArr25 = new float[i7];
                    fArr25[r9] = 0.0f;
                    ObjectAnimator ofFloat36 = ObjectAnimator.ofFloat(ez1Var6, (Property<ez1, Float>) property2, fArr25);
                    ez1 ez1Var7 = this.Z0;
                    float[] fArr26 = new float[i7];
                    fArr26[r9] = hl.L(40.0f);
                    ObjectAnimator ofFloat37 = ObjectAnimator.ofFloat(ez1Var7, (Property<ez1, Float>) property, fArr26);
                    SlideTextView slideTextView8 = this.Z1;
                    float[] fArr27 = new float[i7];
                    fArr27[r9] = 0.0f;
                    ObjectAnimator ofFloat38 = ObjectAnimator.ofFloat(slideTextView8, (Property<SlideTextView, Float>) property2, fArr27);
                    SlideTextView slideTextView9 = this.Z1;
                    float[] fArr28 = new float[i7];
                    fArr28[r9] = hl.L(40.0f);
                    ObjectAnimator ofFloat39 = ObjectAnimator.ofFloat(slideTextView9, (Property<SlideTextView, Float>) property, fArr28);
                    Animator[] animatorArr18 = new Animator[4];
                    animatorArr18[r9] = ofFloat36;
                    animatorArr18[i7] = ofFloat37;
                    animatorArr18[2] = ofFloat38;
                    animatorArr18[3] = ofFloat39;
                    animatorSet19.playTogether(animatorArr18);
                    animatorSet19.setDuration(150L);
                    float[] fArr29 = new float[i7];
                    fArr29[r9] = 1.0f;
                    ObjectAnimator ofFloat40 = ObjectAnimator.ofFloat(this, "exitTransition", fArr29);
                    ofFloat40.setDuration(this.h0 ? 220L : 360L);
                    this.H = 0.0f;
                    B2();
                    ObjectAnimator ofFloat41 = ObjectAnimator.ofFloat(this.F0, (Property<tx1, Float>) property2, 1.0f);
                    ofFloat41.setStartDelay(this.s == 1.0f ? 150L : 450L);
                    ofFloat41.setDuration(200L);
                    this.i3.playTogether(animatorSet18, animatorSet19, ofFloat41, ofFloat40);
                }
                this.i3.addListener(new j(this, i));
                this.i3.start();
                ez1Var = this.Z0;
                if (ez1Var != null) {
                    ez1Var.b();
                }
            }
            float f6 = 0.5f;
            zw1 zw1Var9 = this.c1;
            if (zw1Var9 != null) {
                zw1Var9.setVisibility(0);
            }
            AnimatorSet animatorSet20 = this.i3;
            ObjectAnimator ofFloat42 = ObjectAnimator.ofFloat(this.R0, this.N4, 1.0f);
            tw1 tw1Var = this.R0;
            qw1 qw1Var = this.P4;
            if (!this.B0) {
                f6 = 1.0f;
            }
            ObjectAnimator ofFloat43 = ObjectAnimator.ofFloat(tw1Var, qw1Var, f6);
            ObjectAnimator ofFloat44 = ObjectAnimator.ofFloat(this.a2, (Property<zy1, Float>) property4, 0.0f);
            ObjectAnimator ofFloat45 = ObjectAnimator.ofFloat(this.a2, (Property<zy1, Float>) property3, 0.0f);
            ObjectAnimator ofFloat46 = ObjectAnimator.ofFloat(this.C2, this.j4, 0.0f);
            ObjectAnimator ofFloat47 = ObjectAnimator.ofFloat(this.C2, this.k4, 0.0f);
            ObjectAnimator ofFloat48 = ObjectAnimator.ofFloat(this.a1, (Property<a, Float>) property2, 1.0f);
            ObjectAnimator ofFloat49 = ObjectAnimator.ofFloat(this.Z0, (Property<ez1, Float>) property2, 0.0f);
            ObjectAnimator ofFloat50 = ObjectAnimator.ofFloat(this.a1, (Property<a, Float>) property2, 1.0f);
            ObjectAnimator ofFloat51 = ObjectAnimator.ofFloat(this.F0, (Property<tx1, Float>) property2, 1.0f);
            ObjectAnimator ofFloat52 = ObjectAnimator.ofFloat(this.F0, this.R4, 0.0f);
            ObjectAnimator ofFloat53 = ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f);
            Animator[] animatorArr19 = new Animator[12];
            animatorArr19[0] = ofFloat42;
            animatorArr19[1] = ofFloat43;
            animatorArr19[2] = ofFloat44;
            animatorArr19[3] = ofFloat45;
            animatorArr19[4] = ofFloat46;
            animatorArr19[5] = ofFloat47;
            animatorArr19[6] = ofFloat48;
            animatorArr19[c] = ofFloat49;
            animatorArr19[8] = ofFloat50;
            animatorArr19[9] = ofFloat51;
            animatorArr19[10] = ofFloat52;
            animatorArr19[11] = ofFloat53;
            animatorSet20.playTogether(animatorArr19);
            l lVar7 = this.D2;
            if (lVar7 != null) {
                i2 = 1;
                c2 = 0;
                this.i3.playTogether(ObjectAnimator.ofFloat(lVar7, (Property<l, Float>) property2, 0.0f));
                this.D2.f();
            } else {
                i2 = 1;
                c2 = 0;
            }
            ep0 ep0Var10 = this.m0;
            if (ep0Var10 != null) {
                AnimatorSet animatorSet21 = this.i3;
                float[] fArr30 = new float[i2];
                f = 1.0f;
                fArr30[c2] = 1.0f;
                ObjectAnimator ofFloat54 = ObjectAnimator.ofFloat(ep0Var10, (Property<ep0, Float>) property4, fArr30);
                ep0 ep0Var11 = this.m0;
                float[] fArr31 = new float[i2];
                fArr31[c2] = 1.0f;
                ObjectAnimator ofFloat55 = ObjectAnimator.ofFloat(ep0Var11, (Property<ep0, Float>) property3, fArr31);
                ep0 ep0Var12 = this.m0;
                float[] fArr32 = new float[i2];
                fArr32[c2] = 1.0f;
                ObjectAnimator ofFloat56 = ObjectAnimator.ofFloat(ep0Var12, (Property<ep0, Float>) property2, fArr32);
                Animator[] animatorArr20 = new Animator[3];
                animatorArr20[c2] = ofFloat54;
                animatorArr20[i2] = ofFloat55;
                animatorArr20[2] = ofFloat56;
                animatorSet21.playTogether(animatorArr20);
            } else {
                f = 1.0f;
            }
            zw1 zw1Var10 = this.c1;
            if (zw1Var10 != null) {
                zw1Var10.setScaleX(f);
                this.c1.setScaleY(f);
                i3 = 1;
                this.i3.playTogether(ObjectAnimator.ofFloat(this.a1, (Property<a, Float>) property2, f));
                this.c1.j(this.d1 ? gz1Var2 : gz1Var3, true);
            } else {
                i3 = 1;
            }
            if (this.y2 != null) {
                AnimatorSet animatorSet22 = this.i3;
                ValueAnimator n4 = n(0.0f);
                cx1 cx1Var4 = this.y2;
                float[] fArr33 = new float[i3];
                fArr33[0] = 1.0f;
                ObjectAnimator ofFloat57 = ObjectAnimator.ofFloat(cx1Var4, (Property<cx1, Float>) property2, fArr33);
                Animator[] animatorArr21 = new Animator[2];
                animatorArr21[0] = n4;
                animatorArr21[i3] = ofFloat57;
                animatorSet22.playTogether(animatorArr21);
            }
            if (this.e2 != null) {
                ViewPropertyAnimator viewPropertyAnimator5 = this.f2;
                if (viewPropertyAnimator5 != null) {
                    viewPropertyAnimator5.cancel();
                    this.f2 = null;
                }
                x1();
                z3 = true;
                r7 = 0;
                this.i3.playTogether(ObjectAnimator.ofFloat(this.e2, this.Q4, 0.0f), ObjectAnimator.ofFloat(this.e2, this.O4, O2() ? 0.0f : 1.0f));
                this.i3.playTogether(z());
                AnimatorSet animatorSet23 = this.i3;
                vw1 vw1Var9 = this.g2;
                this.k2 = 1.0f;
                animatorSet23.playTogether(ObjectAnimator.ofFloat(vw1Var9, (Property<vw1, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.g2, (Property<vw1, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.g2, (Property<vw1, Float>) property4, 1.0f));
            } else {
                r7 = 0;
                z3 = true;
            }
            ?? r0 = this.J7;
            if (r0 != 0) {
                r0.e(r7, r7, z3);
            }
            this.Z2 = z3;
            Y0();
            this.i3.setDuration(150L);
            this.i3.addListener(new j(this, i));
            this.i3.start();
            ez1Var = this.Z0;
            if (ez1Var != null) {
            }
        }
        this.O3.a();
        H2();
        this.m7 = i;
        s0();
        if (this.l1) {
            z2(this.l7);
        }
    }

    public final boolean E() {
        tx1 tx1Var;
        Editable text;
        zu1 zu1Var = this.E3;
        if (zu1Var == null || zu1Var.y() || this.k6) {
            return false;
        }
        bn3 bn3Var = this.j1;
        if (bn3Var == null || !bn3Var.q()) {
            return this.s2 ? this.t2 != null : (this.Q3 != null || (tx1Var = this.F0) == null || (text = tx1Var.getText()) == null || TextUtils.isEmpty(text.toString().trim())) ? false : true;
        }
        return false;
    }

    public final snc E0() {
        snc sncVar = this.r1;
        if (sncVar != null) {
            return sncVar;
        }
        snc sncVar2 = new snc(getContext(), new c(this));
        this.r1 = sncVar2;
        return sncVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x006e, code lost:
    
        if (r7 == false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean E1() {
        ec b;
        bn3 bn3Var = this.j1;
        byte b2 = 0;
        if (bn3Var != null && bn3Var.r == 4) {
            return false;
        }
        boolean z = this.C6;
        zu1 zu1Var = this.E3;
        if (!z) {
            if (this.B6) {
                return true;
            }
            if (this.F0 != null && this.O2 == null && !this.s2 && !c() && ((zu1Var == null || !zu1Var.y()) && (b = fc.b(this.R, l())) != null)) {
                Editable text = this.F0.getText();
                String obj = text == null ? "" : text.toString();
                if (!TextUtils.isEmpty(obj.trim()) && !obj.trim().startsWith("/")) {
                    String str = this.P6;
                    if (str != null) {
                        boolean equals = str.equals(obj);
                        this.P6 = null;
                    }
                    q2();
                    this.B6 = true;
                    dc dcVar = this.y6;
                    if (dcVar != null) {
                        if (!dcVar.d) {
                            dcVar.d = true;
                            dcVar.c();
                        }
                        this.y6.d(true);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
                    int i = this.R;
                    byte b3 = 8;
                    qe2 qe2Var = new qe2(this, obj, b3);
                    TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                    CharSequence[] charSequenceArr = {spannableStringBuilder};
                    tL_textWithEntities.entities = ls6.d0(i).Y(charSequenceArr, true, true);
                    CharSequence charSequence = charSequenceArr[0];
                    tL_textWithEntities.text = charSequence != null ? charSequence.toString() : "";
                    TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = new TLRPC.TL_messages_composeMessageWithAI();
                    tL_messages_composeMessageWithAI.text = tL_textWithEntities;
                    tL_messages_composeMessageWithAI.proofread = b.a;
                    tL_messages_composeMessageWithAI.emojify = b.b;
                    tL_messages_composeMessageWithAI.translate_to_lang = b.c;
                    TL_aicompose.InputAiComposeTone inputAiComposeTone = b.d;
                    if (!(inputAiComposeTone instanceof TL_aicompose.inputAiComposeToneSingleUse)) {
                        inputAiComposeTone = fc.d(inputAiComposeTone);
                    }
                    tL_messages_composeMessageWithAI.tone = inputAiComposeTone;
                    this.A6 = ConnectionsManager.getInstance(i).sendRequestTyped(tL_messages_composeMessageWithAI, new ic(b2), new c(qe2Var, b3));
                    return true;
                }
            }
        }
        boolean z2 = this.s2;
        vnb vnbVar = this.K4;
        if (z2 && !yac.h(this.R).p()) {
            yg9.q0(vnbVar, getContext(), new fw1(this, (byte) 15), new fw1(this, (byte) 16));
            return true;
        }
        if (!c()) {
            return F1(true, 0, 0, 0L, true);
        }
        jj.J(this.D3, zu1Var.a(), new ex1(this, (byte) 3), vnbVar);
        return true;
    }

    public final void E2() {
        int J0 = J0(aob.ag);
        int J02 = J0(aob.Je);
        int J03 = J0(aob.Vf);
        e29 e29Var = this.h1;
        if (e29Var != null) {
            e29Var.h(J0, "Cup Red");
            this.h1.h(J0, "Box Red");
            this.h1.h(J03, "Cup Grey");
            this.h1.h(J03, "Box Grey");
            this.h1.h(J03, "Box_Grey 2");
            this.h1.h(J03, "Line 1");
            this.h1.h(J03, "Line 2");
            this.h1.h(J03, "Line 3");
            this.h1.h(J02, "Line 1 Dup");
            this.h1.h(J02, "Line 2 Dup");
            this.h1.h(J02, "Line 3 Dup");
        }
    }

    public final void F() {
        b6 b6Var = this.e1;
        if (b6Var != null) {
            b6Var.setVisibility(8);
        }
        RecordCircle recordCircle = this.C2;
        if (recordCircle != null) {
            recordCircle.setVisibility(8);
        }
        this.i3 = null;
        Y0();
        if (this.e2 != null) {
            this.y = 0.0f;
            s2();
        }
        SlideTextView slideTextView = this.Z1;
        if (slideTextView != null) {
            slideTextView.setCancelToProgress(0.0f);
        }
        this.O3.a();
        I2(true);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v37 org.telegram.ui.Components.ChatActivityEnterView, still in use, count: 2, list:
          (r11v37 org.telegram.ui.Components.ChatActivityEnterView) from 0x00ee: INVOKE 
          (r11v37 org.telegram.ui.Components.ChatActivityEnterView)
          (wrap:tv1:0x00ea: CONSTRUCTOR 
          (r37v0 'this' org.telegram.ui.Components.ChatActivityEnterView A[IMMUTABLE_TYPE, THIS])
          (r38v0 boolean)
          (r39v0 int)
          (r40v0 int)
          (r41v0 long)
         A[MD:(org.telegram.ui.Components.ChatActivityEnterView, boolean, int, int, long):void (m), WRAPPED] (LINE:235) call: tv1.<init>(org.telegram.ui.Components.ChatActivityEnterView, boolean, int, int, long):void type: CONSTRUCTOR)
         VIRTUAL call: org.telegram.ui.Components.ChatActivityEnterView.g2(java.lang.Runnable):boolean A[MD:(java.lang.Runnable):boolean (m), WRAPPED] (LINE:239)
          (r11v37 org.telegram.ui.Components.ChatActivityEnterView) from 0x00f7: PHI (r11v1 org.telegram.ui.Components.ChatActivityEnterView) = (r11v0 org.telegram.ui.Components.ChatActivityEnterView), (r11v37 org.telegram.ui.Components.ChatActivityEnterView) binds: [B:343:0x00f6, B:60:0x00f2] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0653 A[LOOP:1: B:202:0x0404->B:263:0x0653, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0606 A[EDGE_INSN: B:264:0x0606->B:265:0x0606 BREAK  A[LOOP:1: B:202:0x0404->B:263:0x0653], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x054d  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [org.telegram.tgnet.TLRPC$WebPage, r47] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean F1(final boolean r38, final int r39, final int r40, long r41, boolean r43) {
        /*
            Method dump skipped, instructions count: 1666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.F1(boolean, int, int, long, boolean):boolean");
    }

    public final void F2() {
        zj9 zj9Var = this.r2;
        if (zj9Var != null) {
            boolean z = this.s2;
            boolean z2 = this.t2 != null && this.O2 == null;
            this.s2 = z2;
            bx1 bx1Var = this.K0;
            ImageView imageView = this.S0;
            tw1 tw1Var = this.R0;
            if (z2) {
                zj9Var.setResourcesProvider(this.K4);
                this.r2.set(this.t2);
                this.r2.setVisibility(0);
                tx1 tx1Var = this.F0;
                if (tx1Var != null) {
                    tx1Var.setVisibility(8);
                }
                tw1Var.setVisibility(8);
                imageView.setVisibility(0);
                bx1Var.setLocked(!yac.h(this.R).p());
            } else {
                zj9Var.setVisibility(8);
                tx1 tx1Var2 = this.F0;
                if (tx1Var2 != null) {
                    tx1Var2.setVisibility(0);
                }
                tw1Var.setVisibility(0);
                imageView.setVisibility(8);
                bx1Var.setLocked(false);
            }
            w2();
            if (z != this.s2) {
                P(true);
            }
        }
    }

    public final void G() {
        if (this.T2 && this.d1) {
            this.O3.H1(5, 0, this.P ? Integer.MAX_VALUE : 0, this.o7, 0L, true);
            this.o7 = 0L;
            this.K0.setEffect(0L);
        } else {
            this.O3.z0(0);
            MediaController.z().F0(0, 0, false, false);
        }
        this.u3 = false;
        D2(2, true);
    }

    public final z92 G0() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof z92) {
                return (z92) parent;
            }
        }
        return null;
    }

    public final void G1(boolean z, boolean z2, boolean z3) {
        if ((this.y3 != z || this.z3 != z2) && this.V0 != null) {
            if (this.X0 && !z3) {
                this.v4 = true;
                N0(false);
            } else if (z3) {
                p1();
            }
        }
        this.x3 = true;
        this.y3 = z;
        this.z3 = z2;
        my1 my1Var = this.V0;
        if (my1Var != null) {
            my1Var.H(true, z, z2, true);
        }
        O1(false, !this.Y2);
    }

    public final void G2(boolean z) {
        boolean z2;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean y = wf3.y(this.F3);
        ImageView imageView = this.x2;
        if (y) {
            TLRPC.Chat M0 = uc7.s1(this.S.a).M0(Long.valueOf(-this.F3));
            this.V2 = uc7.s1(this.R).W3.getBoolean("silent_" + this.F3, false);
            z2 = xc2.T(M0) && (M0.creator || ((tL_chatAdminRights = M0.admin_rights) != null && tL_chatAdminRights.post_messages)) && !M0.megagroup;
            this.W2 = z2;
            if (imageView != null) {
                c43 c43Var = this.f0;
                if (c43Var == null) {
                    c43Var = new c43(getContext(), R.drawable.input_notify_on, aob.Nl);
                    this.f0 = c43Var;
                }
                c43Var.a(this.V2, false);
                imageView.setImageDrawable(this.f0);
            } else {
                z2 = false;
            }
            oob oobVar = this.e2;
            if (oobVar != null) {
                z2(oobVar.getVisibility() == 0 ? 1 : 0);
            }
        } else {
            z2 = false;
        }
        boolean z3 = (this.O3 == null || c() || !this.O3.e0()) ? false : true;
        boolean z4 = (!z3 || this.A2 || this.u3) ? false : true;
        if (z4) {
            g0();
        }
        cx1 cx1Var = this.y2;
        if (cx1Var != null) {
            if ((cx1Var.getTag() != null && z4) || (this.y2.getTag() == null && !z4)) {
                if (imageView != null) {
                    int i = (z3 || !z2 || this.y2.getVisibility() == 0) ? 8 : 0;
                    if (i != imageView.getVisibility()) {
                        imageView.setVisibility(i);
                        return;
                    }
                    return;
                }
                return;
            }
            this.y2.setTag(z4 ? 1 : null);
        } else if (imageView != null) {
            int i2 = (z3 || !z2) ? 8 : 0;
            if (i2 != imageView.getVisibility()) {
                imageView.setVisibility(i2);
            }
        }
        AnimatorSet animatorSet = this.B2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.B2 = null;
        }
        if (z && !z2) {
            cx1 cx1Var2 = this.y2;
            if (cx1Var2 != null) {
                if (z4) {
                    cx1Var2.setVisibility(0);
                }
                this.y2.setPivotX(hl.L(24.0f));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.B2 = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.y2, (Property<cx1, Float>) View.ALPHA, z4 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.y2, (Property<cx1, Float>) View.SCALE_X, z4 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(this.y2, (Property<cx1, Float>) View.SCALE_Y, z4 ? 1.0f : 0.1f));
                this.B2.setDuration(180L);
                this.B2.addListener(new ow1(this, z4, (byte) 4));
                this.B2.start();
                return;
            }
            return;
        }
        cx1 cx1Var3 = this.y2;
        if (cx1Var3 == null) {
            if (imageView != null) {
                imageView.setVisibility(z2 ? 0 : 8);
                return;
            }
            return;
        }
        cx1Var3.setVisibility(z4 ? 0 : 8);
        this.y2.setAlpha(z4 ? 1.0f : 0.0f);
        this.y2.setScaleX(z4 ? 1.0f : 0.1f);
        this.y2.setScaleY(z4 ? 1.0f : 0.1f);
        if (imageView != null) {
            imageView.setVisibility((!z2 || this.y2.getVisibility() == 0) ? 8 : 0);
        }
        this.y2.setTranslationX(0.0f);
    }

    public final void H() {
        vw1 vw1Var;
        zu1 zu1Var;
        if (this.M != null || (vw1Var = this.z2) == null || vw1Var.getRight() == 0 || (zu1Var = this.E3) == null || !pj0.d(zu1Var.s8)) {
            return;
        }
        if (uc7.s1(this.R).X3.getBoolean(Calendar.getInstance().get(1) + "bdayhint_" + zu1Var.a(), true)) {
            uc7.s1(this.R).X3.edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + zu1Var.a(), false).apply();
            kg5 kg5Var = new kg5(getContext(), 3);
            this.M = kg5Var;
            kg5Var.q(13.0f);
            setHintGlass(this.M);
            this.M.p(true);
            H1();
            this.M.setPadding(hl.L(12.0f), 0, hl.L(12.0f), 0);
            this.M.o(1.0f, -((getWidth() - hl.L(12.0f)) - ((this.z2.getMeasuredWidth() / 2.0f) + (this.z2.getX() + (this.e2.getX() + this.n2.getX())))));
            addView(this.M, tre.d(-1, 200.0f, 48, 0.0f, -192.0f, 0.0f, 0.0f));
            kg5 kg5Var2 = this.M;
            kg5Var2.r0 = new fw1(this, (byte) 24);
            kg5Var2.d = 8000L;
            kg5Var2.v();
        }
    }

    public final long H0() {
        if (this.F1 <= 0) {
            return 250L;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = this.F1;
        if (uptimeMillis < j) {
            return Math.max(16L, j - SystemClock.uptimeMillis());
        }
        return 250L;
    }

    public final void H1() {
        kg5 kg5Var = this.M;
        if (kg5Var == null) {
            return;
        }
        kg5Var.t(pv3.o(hl.S2(ob6.a0(null, null, 2131743417, lbc.k(this.E3.h(), true))), this.M.getTextPaint().getFontMetricsInt(), 20, new mv1(this, (byte) 10)));
        kg5 kg5Var2 = this.M;
        kg5Var2.h = kg5.a(kg5Var2.getText(), this.M.getTextPaint());
    }

    public final void H2() {
        I2(true);
    }

    public final void I() {
        tx1 tx1Var = this.F0;
        boolean z = ((tx1Var != null && !TextUtils.isEmpty(tx1Var.getText())) || this.o3 || this.Z3 || U0()) ? false : true;
        if (z) {
            W();
        }
        ep0 ep0Var = this.m0;
        if (ep0Var != null) {
            boolean z2 = ep0Var.f;
            if (z2 != z) {
                ep0Var.f = z;
                ep0Var.requestLayout();
                ep0Var.invalidate();
            }
            if (z2 != this.m0.f) {
                tw1 tw1Var = this.R0;
                Float valueOf = Float.valueOf(tw1Var.getX());
                HashMap hashMap = this.C0;
                hashMap.put(tw1Var, valueOf);
                tx1 tx1Var2 = this.F0;
                if (tx1Var2 != null) {
                    hashMap.put(tx1Var2, Float.valueOf(tx1Var2.getX()));
                }
            }
        }
    }

    public final boolean I0(float[] fArr) {
        bx1 bx1Var = this.K0;
        if (bx1Var != null && bx1Var.p0) {
            int[] iArr = new int[2];
            bx1Var.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - Math.round(bx1Var.getTranslationX());
            iArr[1] = iArr[1] - Math.round(bx1Var.getTranslationY());
            View rootView = bx1Var.getRootView();
            if (rootView == null || rootView.getWidth() <= 0 || ((iArr[0] + bx1Var.k0) - bx1Var.m0 <= rootView.getWidth() && iArr[0] + bx1Var.k0 + bx1Var.m0 >= 0.0f)) {
                fArr[0] = iArr[0] + bx1Var.k0;
                fArr[1] = iArr[1] + bx1Var.l0;
                fArr[2] = bx1Var.m0;
                fArr[3] = r4 + bx1Var.n0;
                fArr[4] = r0 + bx1Var.o0;
                return true;
            }
        }
        return false;
    }

    public final void I1(zh6 zh6Var, boolean z) {
        this.A7 = zh6Var;
        if (zh6Var.m() == 1 && ((TL_bots.BotInfo) zh6Var.n(0)).user_id == this.F3) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) zh6Var.n(0);
            TL_bots.BotMenuButton botMenuButton = botInfo.menu_button;
            if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                this.j0 = tL_botMenuButton.text;
                this.k0 = tL_botMenuButton.url;
                this.U7 = 3;
            } else if (botInfo.commands.isEmpty()) {
                this.U7 = 1;
            } else {
                this.U7 = 2;
            }
        } else {
            this.U7 = 1;
        }
        dp0 dp0Var = this.o0;
        if (dp0Var != null) {
            dp0Var.E(zh6Var);
        }
        t2(z);
        M(z);
    }

    public void I2(boolean z) {
        J2(false, z);
    }

    public final void J() {
        zu1 zu1Var = this.E3;
        if (zu1Var == null) {
            return;
        }
        C2(zu1Var.e, zu1Var.s8);
    }

    public final int J0(int i) {
        if (i == aob.Uf) {
            i = aob.Pe;
        }
        vnb vnbVar = this.K4;
        return vnbVar != null ? vnbVar.h(i) : aob.w0(null, i, false);
    }

    public final void J1(int i, boolean z, boolean z2) {
        this.d3 = i;
        if (this.e3 == z) {
            return;
        }
        this.e3 = z;
        t2(z2);
    }

    public final void J2(boolean z, boolean z2) {
        TLRPC.Chat chat;
        TLRPC.Peer peer;
        float f;
        float f2;
        float f3;
        tx1 tx1Var;
        c8a c8aVar;
        c8a c8aVar2;
        rw1 rw1Var;
        if (this.O3 != null) {
            b0();
            if (this.T7) {
                peer = this.O3.k();
                chat = null;
            } else {
                TLRPC.Chat M0 = uc7.s1(this.R).M0(Long.valueOf(-this.F3));
                TLRPC.ChatFull N0 = uc7.s1(this.R).N0(-this.F3);
                TLRPC.Peer peer2 = N0 != null ? N0.default_send_as : null;
                chat = M0;
                peer = peer2;
            }
            if (peer == null && this.O3.y() != null && !this.O3.y().peers.isEmpty()) {
                peer = this.O3.y().peers.get(0).peer;
            }
            zu1 zu1Var = this.E3;
            boolean z3 = (z || peer == null || (this.O3.y() != null && this.O3.y().peers.size() <= 1) || T0() || X0() || (((rw1Var = this.f1) != null && rw1Var.getVisibility() == 0) || ((!this.T7 && ((xc2.V(chat) && !xc2.k(chat)) || xc2.p0(chat))) || (zu1Var != null && zu1Var.g4 == 9)))) ? false : true;
            if (z3) {
                h0();
            }
            if (peer != null) {
                long j = peer.channel_id;
                int i = this.R;
                if (j != 0) {
                    TLRPC.Chat M02 = uc7.s1(i).M0(Long.valueOf(peer.channel_id));
                    if (M02 != null && (c8aVar2 = this.q0) != null) {
                        c8aVar2.setAvatar(M02);
                        this.q0.setContentDescription(ob6.a0(null, null, 2131754771, M02.title));
                    }
                } else {
                    TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(peer.user_id));
                    if (X1 != null && (c8aVar = this.q0) != null) {
                        c8aVar.setAvatar(X1);
                        this.q0.setContentDescription(ob6.a0(null, null, 2131754771, lv2.m(0, X1.first_name, X1.last_name)));
                    }
                }
            }
            c8a c8aVar3 = this.q0;
            boolean z4 = c8aVar3 != null && c8aVar3.getVisibility() == 0;
            int L = hl.L(2.0f);
            float f4 = 1.0f;
            if (z3) {
                f = 0.0f;
            } else {
                f = 1.0f;
                f4 = 0.0f;
            }
            c8a c8aVar4 = this.q0;
            if (c8aVar4 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c8aVar4.getLayoutParams();
                c8a c8aVar5 = this.q0;
                if (z3) {
                    f3 = ((-c8aVar5.getLayoutParams().width) - marginLayoutParams.leftMargin) - L;
                    f2 = 0.0f;
                } else {
                    f2 = ((-c8aVar5.getLayoutParams().width) - marginLayoutParams.leftMargin) - L;
                    f3 = 0.0f;
                }
            } else {
                f2 = 0.0f;
                f3 = 0.0f;
            }
            if (z4 != z3) {
                c8a c8aVar6 = this.q0;
                ValueAnimator valueAnimator = c8aVar6 == null ? null : (ValueAnimator) c8aVar6.getTag();
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.q0.setTag(null);
                }
                tw1 tw1Var = this.R0;
                if (!z3 && this.q0 != null && j0() && this.u3 && (tx1Var = this.F0) != null && z2) {
                    float translationX = this.F0.getTranslationX() + tx1Var.getLeft();
                    float translationX2 = tw1Var.getTranslationX() + tw1Var.getLeft();
                    this.q0.setVisibility(8);
                    this.q0.setTranslationX(0.0f);
                    this.q0.setAlpha(0.0f);
                    tx1 tx1Var2 = this.F0;
                    tx1Var2.getViewTreeObserver().addOnPreDrawListener(new hy1(this, tx1Var2, translationX, translationX2));
                    return;
                }
                if ((this.T7 || (zu1Var != null && zu1Var.b7() == 0 && zu1Var.g6)) && z2) {
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    c8a c8aVar7 = this.q0;
                    if (c8aVar7 != null) {
                        c8aVar7.setTranslationX(f3);
                    }
                    this.H = f3;
                    B2();
                    float f5 = f2;
                    float f6 = f4;
                    float f7 = f3;
                    duration.addUpdateListener(new am(this, f7, f5, f, f6, (byte) 2));
                    duration.addListener(new iy1(this, z3, f, f7, f6, f5));
                    duration.start();
                    c8a c8aVar8 = this.q0;
                    if (c8aVar8 != null) {
                        c8aVar8.setTag(duration);
                        return;
                    }
                    return;
                }
                float f8 = f4;
                boolean z5 = z3;
                float f9 = f2;
                if (z5) {
                    h0();
                }
                c8a c8aVar9 = this.q0;
                if (c8aVar9 != null) {
                    c8aVar9.setVisibility(z5 ? 0 : 8);
                    this.q0.setTranslationX(f9);
                }
                float f10 = z5 ? f9 : 0.0f;
                tw1Var.setTranslationX(f10);
                this.H = f10;
                B2();
                c8a c8aVar10 = this.q0;
                if (c8aVar10 != null) {
                    c8aVar10.setAlpha(f8);
                    this.q0.setTag(null);
                }
            }
        }
    }

    public final void K() {
        vnb vnbVar;
        BlendMode blendMode;
        int i = Build.VERSION.SDK_INT;
        vw1 vw1Var = this.g2;
        tw1 tw1Var = this.R0;
        boolean z = false;
        if (i < 29 || ((vnbVar = this.K4) == null ? !aob.I.o() : !vnbVar.a())) {
            if (this.r7) {
                this.r7 = false;
                T1(tw1Var, false, null);
                T1(vw1Var, false, null);
                T1(this.F0, false, null);
                return;
            }
            return;
        }
        if (this.p7 == null) {
            this.p7 = new Paint();
        }
        Paint paint = this.q7;
        if (paint == null) {
            paint = new Paint();
            this.q7 = paint;
        }
        Paint[] paintArr = {this.p7, paint};
        for (int i2 = 0; i2 < 2; i2++) {
            Paint paint2 = paintArr[i2];
            blendMode = BlendMode.PLUS;
            paint2.setBlendMode(blendMode);
            paint2.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        this.p7.setAlpha(jn7.I2);
        this.p7.setColorFilter(new PorterDuffColorFilter(vm2.f(0.2f, -1, J0(aob.Pe) | (-16777216)), PorterDuff.Mode.SRC_IN));
        this.q7.setAlpha(jn7.T1);
        this.r7 = true;
        T1(tw1Var, true, this.p7);
        T1(vw1Var, true, this.p7);
        tx1 tx1Var = this.F0;
        if (tx1Var != null && tx1Var.length() == 0) {
            z = true;
        }
        T1(tx1Var, z, this.q7);
    }

    public final boolean K0() {
        return this.U7 == 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0098, code lost:
    
        if (r7.getInt("answered_" + getTopicKeyString(), 0) != r5.e1()) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bc, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ba, code lost:
    
        if (r7.getInt("closed_botkeyboard_" + getTopicKeyString(), 0) == r5.e1()) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K1(r47 r47Var, boolean z, boolean z2) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        tx1 tx1Var;
        r47 r47Var2 = this.I3;
        if (r47Var2 != null && r47Var2 == this.b3 && r47Var2 != r47Var) {
            this.L3 = r47Var;
            return;
        }
        r47 r47Var3 = this.b3;
        if (r47Var3 != null) {
            if (r47Var3 == r47Var) {
                return;
            }
        } else if (r47Var == null) {
            return;
        }
        if (this.w2 == null) {
            jy1 jy1Var = new jy1(this, this.D3, this.K4);
            this.w2 = jy1Var;
            jy1Var.setVisibility(8);
            this.Y0 = false;
            this.w2.setDelegate(new ew1(this));
            this.c2.addView(this.w2);
        }
        this.b3 = r47Var;
        if (r47Var != null) {
            TLRPC.ReplyMarkup replyMarkup = r47Var.k.reply_markup;
            if (replyMarkup instanceof TLRPC.TL_replyKeyboardMarkup) {
                tL_replyKeyboardMarkup = (TLRPC.TL_replyKeyboardMarkup) replyMarkup;
                this.c3 = tL_replyKeyboardMarkup;
                jy1 jy1Var2 = this.w2;
                Point point = hl.q;
                jy1Var2.setPanelHeight(point.x <= point.y ? this.n3 : this.m3);
                if (this.c3 == null) {
                    SharedPreferences sharedPreferences = uc7.s1(this.R).X3;
                    if (this.b3 != this.I3 && r47Var != null) {
                        if (this.c3.single_use) {
                        }
                        if (!this.c3.is_persistent) {
                        }
                    }
                    boolean z3 = true;
                    boolean z4 = z ? z3 : false;
                    this.w2.setButtons(this.c3);
                    if (z4 && (((tx1Var = this.F0) == null || tx1Var.length() == 0) && !U0())) {
                        i2(1, 1, true, true);
                    }
                } else if (U0() && this.U2 == 1) {
                    if (z2) {
                        this.e4 = true;
                        p1();
                    } else {
                        i2(0, 1, true, true);
                    }
                }
                t2(true);
            }
        }
        tL_replyKeyboardMarkup = null;
        this.c3 = tL_replyKeyboardMarkup;
        jy1 jy1Var22 = this.w2;
        Point point2 = hl.q;
        jy1Var22.setPanelHeight(point2.x <= point2.y ? this.n3 : this.m3);
        if (this.c3 == null) {
        }
        t2(true);
    }

    public final void K2() {
        int b;
        long starsPrice = getStarsPrice();
        if (starsPrice > 0) {
            starsPrice *= getMessagesCount();
        }
        if (this.l5 != starsPrice) {
            View sendButtonInternal = getSendButtonInternal();
            this.l5 = starsPrice;
            View sendButtonInternal2 = getSendButtonInternal();
            if (sendButtonInternal != sendButtonInternal2) {
                sendButtonInternal2.setVisibility(sendButtonInternal.getVisibility());
                sendButtonInternal2.setAlpha(sendButtonInternal.getAlpha());
                sendButtonInternal2.setScaleX(sendButtonInternal.getScaleX());
                sendButtonInternal2.setScaleY(sendButtonInternal.getScaleY());
                sendButtonInternal.setVisibility(8);
            }
            this.K0.i(1, starsPrice, true);
            z2(this.l7);
        }
        if (this.T7) {
            X();
            boolean w = w();
            int i = this.R;
            if (w) {
                int[] iArr = uc7.s1(i).T3;
                b = (iArr == null || iArr.length <= 2) ? 400 : iArr[2];
            } else {
                b = eg5.b(i, (int) starsPrice, 1);
            }
            if (this.d0 != b) {
                this.d0 = b;
                if (b > 0) {
                    int i2 = b - this.e0;
                    if (i2 <= (this.T7 ? 5 : 100)) {
                        if (i2 < -9999) {
                            i2 = -9999;
                        }
                        X();
                        NumberTextView numberTextView = this.c0;
                        numberTextView.a(i2, numberTextView.getVisibility() == 0);
                        if (this.c0.getVisibility() != 0) {
                            this.c0.setVisibility(0);
                            this.c0.setAlpha(0.0f);
                            this.c0.setScaleX(0.5f);
                            this.c0.setScaleY(0.5f);
                        }
                        this.c0.animate().setListener(null).cancel();
                        this.c0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                        this.c0.setTextColor(J0(i2 < 0 ? aob.p7 : aob.y6));
                        return;
                    }
                }
                NumberTextView numberTextView2 = this.c0;
                if (numberTextView2 != null) {
                    numberTextView2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new pw1(this, (byte) 3));
                }
            }
        }
    }

    @Override // vma
    public final void L(int i, boolean z) {
        r47 r47Var;
        tx1 tx1Var;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        boolean z2;
        int i2;
        int i3;
        r2d r2dVar;
        boolean z3 = false;
        if (this.G2 != 0) {
            this.A3 = i;
            this.B3 = z;
            this.o3 = i > 0;
            I();
            return;
        }
        if (i > hl.L(50.0f) && this.o3 && !hl.E) {
            if (z) {
                this.n3 = i;
                uc7.d1().edit().putInt("kbd_height_land3", this.n3).commit();
            } else {
                this.m3 = i;
                uc7.d1().edit().putInt("kbd_height", this.m3).commit();
            }
        }
        if (this.o3 && this.X0 && this.V0 == null) {
            this.X0 = false;
        }
        boolean U0 = U0();
        wma wmaVar = this.b2;
        zu1 zu1Var = this.E3;
        if (U0) {
            int i4 = z ? this.n3 : this.m3;
            if (zu1Var != null && zu1Var.getParentLayout() != null) {
                i4 -= ((ActionBarLayout) zu1Var.getParentLayout()).u(false);
            }
            if (this.U2 == 1) {
                jy1 jy1Var = this.w2;
                if (!jy1Var.f) {
                    i4 = Math.min(jy1Var.getKeyboardHeight(), i4);
                }
            }
            int i5 = this.U2;
            View view = i5 == 0 ? this.V0 : i5 == 1 ? this.w2 : null;
            jy1 jy1Var2 = this.w2;
            if (jy1Var2 != null) {
                jy1Var2.setPanelHeight(i4);
                r2d r2dVar2 = this.I7;
                if (r2dVar2 != null && i4 > 0 && this.U2 == 1) {
                    ((v2d) r2dVar2).h(i4);
                }
            }
            if (view != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                if (!this.p4 && !this.o4 && (((i2 = layoutParams.width) != (i3 = hl.q.x) || layoutParams.height != i4) && ((r2dVar = this.I7) == null || i2 != -1 || layoutParams.height != -1))) {
                    if (r2dVar == null) {
                        layoutParams.width = i3;
                        layoutParams.height = i4;
                        view.setLayoutParams(layoutParams);
                    }
                    if (wmaVar != null) {
                        int i6 = this.p3;
                        this.p3 = layoutParams.height;
                        wmaVar.requestLayout();
                        l1();
                        if (this.X2 && !this.o3 && i6 != this.p3 && u1()) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.W0 = animatorSet;
                            if (this.I7 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(this.p3 - i6, 0.0f));
                            } else {
                                animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, this.p3 - i6, 0.0f));
                            }
                            this.W0.setInterpolator(hb.w);
                            this.W0.setDuration(250L);
                            this.W0.addListener(new pw1(this, z3 ? 1 : 0));
                            hl.d3(this.M4, 50L);
                            this.z4.d();
                            requestLayout();
                        }
                    }
                }
            }
        }
        if (this.A3 == i && this.B3 == z) {
            l1();
            return;
        }
        this.A3 = i;
        this.B3 = z;
        boolean z4 = this.o3;
        this.o3 = i > 0;
        I();
        if (this.o3 && U0() && this.q4 == null) {
            i2(0, this.U2, true, true);
        } else if (!this.o3 && !U0() && (r47Var = this.b3) != null && this.I3 != r47Var && !K0() && !A() && !org.telegram.ui.ActionBar.e.hasSheets(zu1Var) && (((tx1Var = this.F0) == null || TextUtils.isEmpty(tx1Var.getText())) && (tL_replyKeyboardMarkup = this.c3) != null && !tL_replyKeyboardMarkup.rows.isEmpty())) {
            hb hbVar = wmaVar.I;
            if (hbVar.f) {
                hbVar.j();
            } else {
                hbVar.v = true;
            }
            i2(1, 1, false, true);
        }
        if (this.p3 != 0 && !(z2 = this.o3) && z2 != z4 && !U0()) {
            this.p3 = 0;
            wmaVar.requestLayout();
        }
        if (this.o3 && this.Z3) {
            this.Z3 = false;
            if (this.e4) {
                this.e4 = false;
                this.w2.setButtons(this.c3);
            }
            hl.r(this.g4);
        }
        l1();
    }

    public final boolean L0() {
        tx1 tx1Var = this.F0;
        return tx1Var != null && tx1Var.length() > 0;
    }

    public final void L1(r47 r47Var, String str, boolean z, boolean z2) {
        tx1 tx1Var;
        p7a b;
        String str2;
        if (str == null || getVisibility() != 0 || (tx1Var = this.F0) == null) {
            return;
        }
        r16 = null;
        TLRPC.User user = null;
        if (!z) {
            if (this.H0 > 0 && !c()) {
                xy1 xy1Var = this.O3;
                if (xy1Var != null) {
                    cz1 cz1Var = this.G0;
                    xy1Var.b1(cz1Var, ((ema) cz1Var.c).getText(), true);
                    return;
                }
                return;
            }
            TLRPC.User X1 = (r47Var == null || !wf3.y(this.F3)) ? null : uc7.s1(this.S.a).X1(Long.valueOf(r47Var.k.from_id.user_id));
            if ((this.d3 != 1 || z2) && X1 != null && X1.bot && !str.contains("@")) {
                Locale locale = Locale.US;
                b = p7a.b(qd4.y(str, "@", lbc.p(X1)), this.F3, this.I3, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
            } else {
                b = p7a.b(str, this.F3, this.I3, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
            }
            zu1 zu1Var = this.E3;
            b.K = zu1Var != null ? zu1Var.X6() : null;
            b.O = this.o7;
            this.o7 = 0L;
            this.K0.setEffect(0L);
            u(b);
            r7a.B(this.R).q0(b);
            return;
        }
        String obj = tx1Var.getText().toString();
        if (r47Var != null && wf3.y(this.F3)) {
            user = uc7.s1(this.S.a).X1(Long.valueOf(r47Var.k.from_id.user_id));
        }
        TLRPC.User user2 = user;
        if ((this.d3 != 1 || z2) && user2 != null && user2.bot && !str.contains("@")) {
            Locale locale2 = Locale.US;
            str2 = qd4.y(str, "@", lbc.p(user2)) + " " + obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", "");
        } else {
            StringBuilder l = c00.l(str, " ");
            l.append(obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
            str2 = l.toString();
        }
        this.G3 = true;
        this.F0.setText(str2);
        tx1 tx1Var2 = this.F0;
        tx1Var2.setSelection(tx1Var2.getText().length());
        this.G3 = false;
        xy1 xy1Var2 = this.O3;
        if (xy1Var2 != null) {
            xy1Var2.R0(this.F0.getText(), true, false);
        }
        if (this.o3 || this.U2 != -1) {
            return;
        }
        o1();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
    
        if (((java.lang.Integer) r7a.B(r9.R).f.g(r9.F3, 0)).intValue() > 0) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L2() {
        int i;
        int currentTime = ConnectionsManager.getInstance(this.R).getCurrentTime();
        hl.r(this.I0);
        this.I0 = null;
        TLRPC.ChatFull chatFull = this.S2;
        if (chatFull != null && chatFull.slowmode_seconds != 0 && chatFull.slowmode_next_send_date <= currentTime) {
            boolean z = ((Integer) r7a.B(this.R).h.g(this.F3, 0)).intValue() > 0;
            if (!z) {
            }
            if (!xc2.N(uc7.s1(this.S.a).M0(Long.valueOf(this.S2.id))) && !xc2.i0(this.S2)) {
                i = this.S2.slowmode_seconds;
                this.H0 = z ? ConnectionsManager.DEFAULT_DATACENTER_ID : 2147483646;
                if (this.H0 != 0 || i <= 0) {
                    this.H0 = 0;
                } else {
                    String h0 = hl.h0(Math.max(1, i), false);
                    cz1 cz1Var = this.G0;
                    ((ema) cz1Var.c).l(h0, false);
                    cz1Var.invalidate();
                    xy1 xy1Var = this.O3;
                    if (xy1Var != null) {
                        xy1Var.b1(cz1Var, ((ema) cz1Var.c).getText(), false);
                    }
                    mv1 mv1Var = new mv1(this, (byte) 29);
                    this.I0 = mv1Var;
                    hl.d3(mv1Var, 100L);
                }
                if (c()) {
                    P(true);
                    return;
                }
                return;
            }
            i = 0;
            if (this.H0 != 0) {
            }
            this.H0 = 0;
            if (c()) {
            }
        }
        int i2 = this.H0;
        if (i2 >= 2147483646) {
            if (this.S2 != null) {
                uc7.s1(this.S.a).e3(0, this.S2.id, true);
            }
            i = 0;
            if (this.H0 != 0) {
            }
            this.H0 = 0;
            if (c()) {
            }
        } else {
            i = i2 - currentTime;
            if (this.H0 != 0) {
            }
            this.H0 = 0;
            if (c()) {
            }
        }
    }

    public final void M(boolean z) {
        r47 r47Var;
        boolean z2 = this.F3 < 0 && this.L4 && this.O2 == null && (o44.g(this.R).e(getEditText() != null ? getEditText().toString() : null, this.A7) > 0 || ((r47Var = this.I3) != null && r47.c3(r47Var.k)));
        fm0 fm0Var = this.N7;
        boolean z3 = fm0Var.f != z2;
        fm0Var.a(z2, z);
        bx1 bx1Var = this.K0;
        if (bx1Var != null) {
            bx1Var.y = z2;
            bx1Var.invalidate();
        }
        if (z3) {
            P(z);
        }
    }

    public final void M0() {
        kg5 kg5Var = this.O;
        if (kg5Var != null) {
            kg5Var.f(true);
        }
        kg5 kg5Var2 = this.M;
        if (kg5Var2 != null) {
            kg5Var2.f(true);
        }
    }

    public final void M1(int i, long j) {
        boolean z;
        this.F3 = j;
        hl.c3(new fw1(this, (byte) 1));
        if (this.R != i) {
            this.z4.e();
            jn7 f = jn7.f(this.R);
            int i2 = jn7.l2;
            f.n(this, i2);
            jn7 f2 = jn7.f(this.R);
            int i3 = jn7.o2;
            f2.n(this, i3);
            jn7 f3 = jn7.f(this.R);
            int i4 = jn7.p2;
            f3.n(this, i4);
            jn7 f4 = jn7.f(this.R);
            int i5 = jn7.m2;
            f4.n(this, i5);
            jn7 f5 = jn7.f(this.R);
            int i6 = jn7.X5;
            f5.n(this, i6);
            jn7 f6 = jn7.f(this.R);
            int i7 = jn7.n2;
            f6.n(this, i7);
            jn7 f7 = jn7.f(this.R);
            int i8 = jn7.k2;
            f7.n(this, i8);
            jn7 f8 = jn7.f(this.R);
            int i9 = jn7.s;
            f8.n(this, i9);
            jn7 f9 = jn7.f(this.R);
            int i10 = jn7.s2;
            f9.n(this, i10);
            jn7 f10 = jn7.f(this.R);
            int i11 = jn7.u2;
            f10.n(this, i11);
            jn7 f11 = jn7.f(this.R);
            int i12 = jn7.e2;
            f11.n(this, i12);
            jn7 f12 = jn7.f(this.R);
            int i13 = jn7.z0;
            f12.n(this, i13);
            jn7 f13 = jn7.f(this.R);
            int i14 = jn7.K;
            f13.n(this, i14);
            jn7 f14 = jn7.f(this.R);
            int i15 = jn7.n1;
            f14.n(this, i15);
            jn7 f15 = jn7.f(this.R);
            int i16 = jn7.t2;
            f15.n(this, i16);
            jn7 f16 = jn7.f(this.R);
            int i17 = jn7.T2;
            f16.n(this, i17);
            jn7 f17 = jn7.f(this.R);
            int i18 = jn7.a3;
            f17.n(this, i18);
            jn7 f18 = jn7.f(this.R);
            int i19 = jn7.i5;
            f18.n(this, i19);
            jn7 f19 = jn7.f(this.R);
            int i20 = jn7.S3;
            f19.n(this, i20);
            this.R = i;
            this.S = k5.a(i);
            jn7.f(this.R).b(this, i2);
            jn7.f(this.R).b(this, i3);
            jn7.f(this.R).b(this, i4);
            jn7.f(this.R).b(this, i5);
            jn7.f(this.R).b(this, i6);
            jn7.f(this.R).b(this, i7);
            jn7.f(this.R).b(this, i8);
            jn7.f(this.R).b(this, i9);
            jn7.f(this.R).b(this, i10);
            jn7.f(this.R).b(this, i11);
            jn7.f(this.R).b(this, i12);
            jn7.f(this.R).b(this, i13);
            jn7.f(this.R).b(this, i14);
            jn7.f(this.R).b(this, i15);
            jn7.f(this.R).b(this, i16);
            jn7.f(this.R).b(this, i17);
            jn7.f(this.R).b(this, i18);
            jn7.f(this.R).b(this, i19);
            jn7.f(this.R).b(this, i20);
            z = true;
        } else {
            z = true;
        }
        this.A0 = z;
        if (wf3.y(this.F3)) {
            this.A0 = xc2.q(uc7.s1(this.S.a).M0(Long.valueOf(-this.F3)));
        }
        G2(false);
        A2(false);
        O();
        J();
        y2(false);
        if (this.F0 != null) {
            zu1 zu1Var = this.E3;
            I2((zu1Var == null || !zu1Var.getFragmentBeginToShow()) ? false : z);
        }
    }

    public final void M2() {
        bx1 bx1Var = this.K0;
        if (bx1Var == null) {
            return;
        }
        boolean z = this.J1 && this.T1 && !this.u3 && !v1();
        mv1 mv1Var = this.a6;
        hl.r(mv1Var);
        if (z) {
            hl.d3(mv1Var, 250L);
        } else {
            bx1Var.setIconDimmed(false);
        }
    }

    public final void N0(boolean z) {
        O0(z, false, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N1(r47 r47Var, m47 m47Var, boolean z) {
        float f;
        float f2;
        int i;
        rw1 rw1Var;
        CharSequence charSequence;
        CharSequence charSequence2;
        int i2;
        tx1 tx1Var;
        tx1 tx1Var2;
        rw1 rw1Var2;
        boolean z2;
        cx1 cx1Var;
        if (this.Q3 == null && this.T3 == null && this.O2 != r47Var) {
            b0();
            byte b = 1;
            boolean z3 = this.O2 != null;
            this.O2 = r47Var;
            this.P2 = z;
            rw1 rw1Var3 = this.p2;
            oob oobVar = this.e2;
            ImageView imageView = this.Q0;
            vw1 vw1Var = this.g2;
            a aVar = this.a1;
            if (r47Var != null) {
                this.n7 = m47Var != null ? m47Var.j : r47Var.k.invert_media;
                Y(false);
                this.u2.setOnClickListener(new pv1(this, (byte) 22));
                if (this.O2.o5()) {
                    long j = this.l5;
                    if (j > 0) {
                        this.u2.i(1, j, true);
                        this.u2.setLayoutParams(tre.e(44, 44, 85));
                        this.u2.requestLayout();
                        rw1Var = rw1Var3;
                        this.u2.setOnLongClickListener(new s(this, r47Var, m47Var, b));
                        this.u2.setVisibility(0);
                        this.u2.setScaleX(0.1f);
                        this.u2.setScaleY(0.1f);
                        this.u2.setAlpha(0.0f);
                        this.u2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(k43.f).start();
                        k5 k5Var = this.S;
                        if (z) {
                            this.d0 = uc7.s1(k5Var.a).t1();
                            charSequence = this.O2.v;
                        } else {
                            this.d0 = uc7.s1(k5Var.a).H0();
                            charSequence = this.O2.z;
                        }
                        if (charSequence == null) {
                            tx1 tx1Var3 = this.F0;
                            TextPaint paint = tx1Var3 != null ? tx1Var3.getPaint() : null;
                            if (paint == null) {
                                paint = new TextPaint();
                                paint.setTextSize(hl.L(18.0f));
                            }
                            charSequence2 = q(paint.getFontMetricsInt(), charSequence, this.O2.k.entities);
                        } else {
                            charSequence2 = "";
                        }
                        if (this.K2 == null && !z3) {
                            tx1 tx1Var4 = this.F0;
                            this.K2 = (tx1Var4 != null || tx1Var4.length() <= 0) ? null : this.F0.getText();
                            this.L2 = this.N3;
                        }
                        r47 r47Var2 = this.O2;
                        TLRPC.MessageMedia messageMedia = r47Var2.k.media;
                        this.N3 = ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) || !messageMedia.manual) && ((i2 = r47Var2.D) == 0 || i2 == 19);
                        if (this.o3) {
                            jj1 jj1Var = new jj1(this, charSequence2, (byte) 28);
                            this.a0 = jj1Var;
                            hl.d3(jj1Var, 200L);
                        } else {
                            jj1 jj1Var2 = this.a0;
                            if (jj1Var2 != null) {
                                hl.r(jj1Var2);
                                this.a0 = null;
                            }
                            setFieldText(charSequence2);
                        }
                        tx1Var = this.F0;
                        if (tx1Var != null) {
                            tx1Var.requestFocus();
                        }
                        o1();
                        tx1Var2 = this.F0;
                        if (tx1Var2 != null) {
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) tx1Var2.getLayoutParams();
                            layoutParams.rightMargin = hl.L(4.0f);
                            this.F0.setLayoutParams(layoutParams);
                        }
                        rw1Var2 = this.f1;
                        if (rw1Var2 == null) {
                            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) rw1Var2.getLayoutParams();
                            z2 = false;
                            layoutParams2.rightMargin = 0;
                            this.f1.setLayoutParams(layoutParams2);
                        } else {
                            z2 = false;
                        }
                        getSendButtonInternal().setVisibility(8);
                        setSlowModeButtonVisible(z2);
                        imageView.setVisibility(8);
                        aVar.setVisibility(8);
                        oobVar.setVisibility(8);
                        if (vw1Var != null) {
                            this.k2 = 0.0f;
                            vw1Var.setAlpha(0.0f);
                            vw1Var.setScaleX(0.5f);
                            vw1Var.setScaleY(0.5f);
                        }
                        rw1Var.setVisibility(8);
                        cx1Var = this.y2;
                        if (cx1Var != null) {
                            cx1Var.setVisibility(8);
                        }
                    }
                }
                rw1Var = rw1Var3;
                this.u2.i(1, 0L, true);
                this.u2.setLayoutParams(tre.e(44, 44, 85));
                this.u2.requestLayout();
                this.u2.setOnLongClickListener(new s(this, r47Var, m47Var, b));
                this.u2.setVisibility(0);
                this.u2.setScaleX(0.1f);
                this.u2.setScaleY(0.1f);
                this.u2.setAlpha(0.0f);
                this.u2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(k43.f).start();
                k5 k5Var2 = this.S;
                if (z) {
                }
                if (charSequence == null) {
                }
                if (this.K2 == null) {
                    tx1 tx1Var42 = this.F0;
                    this.K2 = (tx1Var42 != null || tx1Var42.length() <= 0) ? null : this.F0.getText();
                    this.L2 = this.N3;
                }
                r47 r47Var22 = this.O2;
                TLRPC.MessageMedia messageMedia2 = r47Var22.k.media;
                this.N3 = ((messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) || !messageMedia2.manual) && ((i2 = r47Var22.D) == 0 || i2 == 19);
                if (this.o3) {
                }
                tx1Var = this.F0;
                if (tx1Var != null) {
                }
                o1();
                tx1Var2 = this.F0;
                if (tx1Var2 != null) {
                }
                rw1Var2 = this.f1;
                if (rw1Var2 == null) {
                }
                getSendButtonInternal().setVisibility(8);
                setSlowModeButtonVisible(z2);
                imageView.setVisibility(8);
                aVar.setVisibility(8);
                oobVar.setVisibility(8);
                if (vw1Var != null) {
                }
                rw1Var.setVisibility(8);
                cx1Var = this.y2;
                if (cx1Var != null) {
                }
            } else {
                jj1 jj1Var3 = this.a0;
                if (jj1Var3 != null) {
                    hl.r(jj1Var3);
                    this.a0 = null;
                }
                bx1 bx1Var = this.u2;
                if (bx1Var != null) {
                    bx1Var.setVisibility(8);
                }
                this.d0 = -1;
                this.O3.n();
                rw1Var3.setVisibility(0);
                imageView.setScaleX(0.1f);
                imageView.setScaleY(0.1f);
                imageView.setAlpha(0.0f);
                imageView.setVisibility(8);
                int i3 = this.H0;
                cz1 cz1Var = this.G0;
                if (i3 <= 0 || c()) {
                    getSendButtonInternal().setScaleX(0.1f);
                    getSendButtonInternal().setScaleY(0.1f);
                    getSendButtonInternal().setAlpha(0.0f);
                    getSendButtonInternal().setVisibility(8);
                    cz1Var.setScaleX(0.1f);
                    cz1Var.setScaleY(0.1f);
                    cz1Var.setAlpha(0.0f);
                    setSlowModeButtonVisible(false);
                    f = 1.0f;
                    oobVar.setScaleX(1.0f);
                    this.F = 1.0f;
                    s2();
                    oobVar.setVisibility(0);
                    if (vw1Var != null) {
                        this.k2 = 1.0f;
                        vw1Var.setAlpha(1.0f);
                        vw1Var.setScaleX(1.0f);
                        vw1Var.setScaleY(1.0f);
                    }
                    aVar.setScaleX(1.0f);
                    aVar.setScaleY(1.0f);
                    aVar.setAlpha(1.0f);
                    aVar.setVisibility(0);
                } else {
                    if (this.H0 == Integer.MAX_VALUE) {
                        getSendButtonInternal().setScaleX(1.0f);
                        getSendButtonInternal().setScaleY(1.0f);
                        getSendButtonInternal().setAlpha(1.0f);
                        getSendButtonInternal().setVisibility(0);
                        cz1Var.setScaleX(0.1f);
                        cz1Var.setScaleY(0.1f);
                        f2 = 0.0f;
                        cz1Var.setAlpha(0.0f);
                        setSlowModeButtonVisible(false);
                        i = 8;
                    } else {
                        f2 = 0.0f;
                        getSendButtonInternal().setScaleX(0.1f);
                        getSendButtonInternal().setScaleY(0.1f);
                        getSendButtonInternal().setAlpha(0.0f);
                        i = 8;
                        getSendButtonInternal().setVisibility(8);
                        cz1Var.setScaleX(1.0f);
                        cz1Var.setScaleY(1.0f);
                        cz1Var.setAlpha(1.0f);
                        setSlowModeButtonVisible(true);
                    }
                    oobVar.setScaleX(0.01f);
                    this.F = f2;
                    s2();
                    oobVar.setVisibility(i);
                    if (vw1Var != null) {
                        this.k2 = f2;
                        vw1Var.setAlpha(f2);
                        vw1Var.setScaleX(0.5f);
                        vw1Var.setScaleY(0.5f);
                    }
                    aVar.setScaleX(0.1f);
                    aVar.setScaleY(0.1f);
                    aVar.setAlpha(f2);
                    aVar.setVisibility(i);
                    f = 1.0f;
                }
                g0();
                cx1 cx1Var2 = this.y2;
                if (cx1Var2 != null && cx1Var2.getTag() != null) {
                    this.y2.setScaleX(f);
                    this.y2.setScaleY(f);
                    this.y2.setAlpha(f);
                    this.y2.setVisibility(0);
                }
                zu1 zu1Var = this.E3;
                if (zu1Var != null) {
                    zu1Var.H5 = null;
                    zu1Var.Y5 = null;
                    v47 v47Var = zu1Var.x5;
                    if (v47Var != null) {
                        v47Var.e(this.R, null, "", null, null, null);
                    }
                    this.M3 = null;
                    this.N3 = true;
                    zu1Var.D6();
                }
                b0();
                tx1 tx1Var5 = this.F0;
                if (tx1Var5 != null) {
                    tx1Var5.setText(this.K2);
                    tx1 tx1Var6 = this.F0;
                    tx1Var6.setSelection(tx1Var6.length());
                }
                this.K2 = null;
                this.N3 = this.L2;
                if (getVisibility() == 0) {
                    this.O3.P1();
                }
                z2(1);
            }
            y2(true);
            I2(true);
            w2();
            F2();
        }
    }

    public final long N2(String str, Runnable runnable) {
        long j;
        RecordCircle recordCircle;
        if (!TextUtils.isEmpty(str)) {
            this.S6 = true;
        }
        if (this.u3 || this.Q3 == null) {
            j = 0;
        } else {
            B1();
            j = 420;
        }
        if (this.u3 || ((recordCircle = this.C2) != null && ChatActivityEnterView.this.j5)) {
            this.X1 = 0L;
            this.D1 = true;
            try {
                G();
            } finally {
                this.D1 = false;
            }
        }
        hl.d3(new on1(this, str, runnable, (byte) 9), j);
        return j;
    }

    public final void O() {
        boolean z;
        boolean z2;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        if (this.T2) {
            return;
        }
        if (this.e2 == null) {
            this.T2 = false;
            X1(false, false);
            return;
        }
        boolean z3 = true;
        this.T2 = true;
        this.y0 = true;
        this.z0 = true;
        if (wf3.y(this.F3)) {
            TLRPC.Chat M0 = uc7.s1(this.S.a).M0(Long.valueOf(-this.F3));
            z = xc2.T(M0) && !M0.megagroup;
            if (z && !M0.creator && ((tL_chatAdminRights = M0.admin_rights) == null || !tL_chatAdminRights.post_messages)) {
                this.T2 = false;
            }
            this.y0 = xc2.s(M0);
            this.z0 = xc2.v(M0);
        } else {
            z = false;
        }
        if (!xea.v0) {
            this.T2 = false;
        }
        if (this.T2) {
            if (xea.L0) {
                CameraController.getInstance().initCamera(null);
            }
            z2 = uc7.e1().getBoolean(z ? "currentModeVideoChannel" : "currentModeVideo", z);
        } else {
            z2 = false;
        }
        if (!this.y0 && z2) {
            z2 = false;
        }
        if (this.z0 || z2) {
            z3 = z2;
        } else if (!this.T2) {
            z3 = false;
        }
        X1(z3, false);
    }

    public final boolean O0(boolean z, boolean z2, boolean z3) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        if (U0()) {
            if (this.U2 == 1 && (tL_replyKeyboardMarkup = this.c3) != null && z && this.b3 != null) {
                if (!tL_replyKeyboardMarkup.is_persistent) {
                    uc7.s1(this.R).X3.edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.b3.e1()).apply();
                }
            }
            if ((z && this.G2 != 0) || z2) {
                Z1(0, true);
                my1 my1Var = this.V0;
                if (my1Var != null) {
                    my1Var.r(true);
                }
                tx1 tx1Var = this.F0;
                if (tx1Var != null) {
                    tx1Var.requestFocus();
                }
                a2(false, true, false, true);
                if (this.n4) {
                    P(true);
                    return true;
                }
            } else {
                if (this.G2 == 0) {
                    if (this.o4) {
                        a2(false, true, false, true);
                        return true;
                    }
                    i2(0, 0, true, z3 && !z);
                    return true;
                }
                Z1(0, false);
                this.V0.r(false);
                tx1 tx1Var2 = this.F0;
                if (tx1Var2 != null) {
                    tx1Var2.requestFocus();
                }
            }
            return true;
        }
        return false;
    }

    public final void O1(boolean z, boolean z2) {
        gz1 gz1Var;
        tx1 tx1Var;
        rw1 rw1Var;
        tw1 tw1Var = this.R0;
        if (tw1Var != null) {
            if (this.l3 || ((rw1Var = this.f1) != null && rw1Var.getVisibility() == 0)) {
                this.h = 0.0f;
                this.n = 0.0f;
                x2();
                z2 = false;
            }
            gz1 gz1Var2 = gz1.f;
            gz1 gz1Var3 = gz1.e;
            if (!z || this.U2 != 0) {
                my1 my1Var = this.V0;
                int i = my1Var == null ? uc7.d1().getInt("selected_page", 0) : my1Var.getCurrentPage();
                gz1Var = (i == 0 || !((this.y3 || this.z3) && ((tx1Var = this.F0) == null || TextUtils.isEmpty(tx1Var.getText())))) ? gz1Var3 : i == 1 ? gz1.c : gz1Var2;
            } else if (!this.A0) {
                return;
            } else {
                gz1Var = gz1.d;
            }
            if (!this.A0 && gz1Var == gz1Var3) {
                gz1Var3 = gz1Var2;
            } else if (this.b || gz1Var == gz1Var3) {
                gz1Var3 = gz1Var;
            }
            tw1Var.j(gz1Var3, z2);
            if (gz1Var3 == gz1Var2 && this.V0 == null) {
                ls6.d0(this.R).X0(true, true, false, 0);
                ArrayList arrayList = uc7.s1(this.R).x3;
                int min = Math.min(10, arrayList.size());
                for (int i2 = 0; i2 < min; i2++) {
                    pv3.k((CharSequence) arrayList.get(i2));
                }
            }
        }
    }

    public final boolean O2() {
        tx1 tx1Var;
        if (this.S6) {
            return true;
        }
        if (this.s1 && ((tx1Var = this.F0) == null || tx1Var.length() == 0)) {
            this.s1 = false;
        }
        return this.s1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:300:0x080e, code lost:
    
        if (r27.l1 == false) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x081b, code lost:
    
        r10 = 0.5f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x0819, code lost:
    
        if (r27.l1 == false) goto L288;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0efa  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0850  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0878  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0d45  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x0d6e  */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r3v161 */
    /* JADX WARN: Type inference failed for: r3v162, types: [android.animation.AnimatorSet, android.view.ViewPropertyAnimator] */
    /* JADX WARN: Type inference failed for: r3v197 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P(boolean z) {
        bx1 bx1Var;
        String str;
        a aVar;
        ImageView imageView;
        int i;
        boolean z2;
        AnimatorSet animatorSet;
        ?? r15;
        ImageView imageView2;
        boolean z3;
        vw1 vw1Var;
        vw1 vw1Var2;
        AnimatorSet animatorSet2;
        int i2;
        float f;
        vw1 vw1Var3;
        AnimatorSet animatorSet3;
        ImageView imageView3;
        int i3;
        boolean z4;
        ?? r3;
        ?? r152;
        if (this.O2 != null || this.u3 || v1()) {
            return;
        }
        boolean z5 = this.Y2 ? false : z;
        K2();
        tx1 tx1Var = this.F0;
        CharSequence m1 = tx1Var == null ? "" : hl.m1(tx1Var.getTextToUse());
        int i4 = this.H0;
        bx1 bx1Var2 = this.K0;
        qw1 qw1Var = this.O4;
        a aVar2 = this.a1;
        Property property = View.SCALE_X;
        Property property2 = View.SCALE_Y;
        Property property3 = View.ALPHA;
        oob oobVar = this.e2;
        zw1 zw1Var = this.c1;
        cz1 cz1Var = this.G0;
        vw1 vw1Var4 = this.g2;
        ImageView imageView4 = this.Q0;
        boolean z6 = z5;
        if (i4 <= 0 || i4 == Integer.MAX_VALUE || Z0()) {
            int length = m1.length();
            fm0 fm0Var = this.M7;
            if (length > 0 || this.w3 || this.s2 || this.Q3 != null || this.T3 != null || ((this.H0 == Integer.MAX_VALUE && !Z0()) || ((this.T7 && getStarsPrice() > 0) || fm0Var.f))) {
                tx1 tx1Var2 = this.F0;
                String caption = tx1Var2 == null ? null : tx1Var2.getCaption();
                boolean z7 = caption != null && (getSendButtonInternal().getVisibility() == 0 || ((vw1Var2 = this.T0) != null && vw1Var2.getVisibility() == 0));
                boolean z8 = caption == null && (imageView4.getVisibility() == 0 || ((vw1Var = this.T0) != null && vw1Var.getVisibility() == 0));
                int J0 = (this.H0 != Integer.MAX_VALUE || Z0()) ? J0(aob.Pe) : J0(aob.Nl);
                boolean S0 = S0();
                bx1Var = bx1Var2;
                if (J0 != this.L0) {
                    this.L0 = J0;
                    Drawable background = bx1Var.getBackground();
                    int i5 = J0;
                    int red = Color.red(i5);
                    aVar = aVar2;
                    int green = Color.green(i5);
                    str = caption;
                    int blue = Color.blue(i5);
                    imageView = imageView4;
                    aob.F1(background, Color.argb(24, red, green, blue), true);
                } else {
                    str = caption;
                    aVar = aVar2;
                    imageView = imageView4;
                }
                if (aVar.getVisibility() != 0 && cz1Var.getVisibility() != 0 && !z7 && !z8 && !fm0Var.f) {
                    vz1 vz1Var = this.J7;
                    if (vz1Var != null) {
                        vz1Var.e(0, S0 && !O2(), true);
                        if (vw1Var4 != null) {
                            ViewPropertyAnimator viewPropertyAnimator = this.f2;
                            if (viewPropertyAnimator != null) {
                                viewPropertyAnimator.cancel();
                                this.f2 = null;
                            }
                            ViewPropertyAnimator animate = vw1Var4.animate();
                            float f2 = y(S0) ? 0.0f : 1.0f;
                            this.k2 = f2;
                            ViewPropertyAnimator duration = animate.alpha(f2).scaleX(y(S0) ? 0.5f : 1.0f).scaleY(y(S0) ? 0.5f : 1.0f).setInterpolator(k43.h).setDuration(320L);
                            this.f2 = duration;
                            duration.start();
                        }
                    }
                } else {
                    if (!z6) {
                        ImageView imageView5 = imageView;
                        String str2 = str;
                        zw1Var.setScaleX(0.1f);
                        zw1Var.setScaleY(0.1f);
                        zw1Var.setAlpha(0.0f);
                        aVar.setVisibility(8);
                        if (cz1Var.getVisibility() == 0) {
                            cz1Var.setScaleX(0.1f);
                            cz1Var.setScaleY(0.1f);
                            cz1Var.setAlpha(0.0f);
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
                        vw1 vw1Var5 = this.T0;
                        if (vw1Var5 == null || vw1Var5.getVisibility() != 0) {
                            i = 8;
                        } else {
                            this.T0.setScaleX(0.1f);
                            this.T0.setScaleY(0.1f);
                            this.T0.setAlpha(0.0f);
                            i = 8;
                            this.T0.setVisibility(8);
                        }
                        if (oobVar != null) {
                            oobVar.setVisibility(i);
                            if (this.O3 != null && getVisibility() == 0) {
                                this.O3.V();
                            }
                            z2(0);
                            vz1 vz1Var2 = this.J7;
                            if (vz1Var2 != null) {
                                vz1Var2.e(0, S0 && !O2(), true);
                                if (vw1Var4 != null) {
                                    float f3 = y(S0) ? 0.0f : 1.0f;
                                    this.k2 = f3;
                                    vw1Var4.setAlpha(f3);
                                    vw1Var4.setScaleX(y(S0) ? 0.5f : 1.0f);
                                    vw1Var4.setScaleY(y(S0) ? 0.5f : 1.0f);
                                }
                            } else if (vw1Var4 != null) {
                                this.k2 = 0.0f;
                                vw1Var4.setAlpha(0.0f);
                                vw1Var4.setScaleX(0.5f);
                                vw1Var4.setScaleY(0.5f);
                            }
                        }
                        z2 = true;
                        this.A2 = true;
                        if (this.y2 != null) {
                            xy1 xy1Var = this.O3;
                            if (xy1Var != null && xy1Var.e0()) {
                                this.y2.setVisibility(8);
                                this.y2.setTag(null);
                            }
                            this.y2.setAlpha(0.0f);
                            this.y2.setScaleX(0.0f);
                            this.y2.setScaleY(1.0f);
                            this.y2.setTranslationX(0.0f);
                        }
                        z3 = z2;
                        if (!this.k6 || (imageView3 = this.l2) == null) {
                            return;
                        }
                        if (z6) {
                            imageView3.animate().translationX(z3 ? -c00.d(64.0f, bx1Var.l(), 0) : hl.L(42.0f)).setDuration(320L).setInterpolator(k43.h).start();
                            return;
                        } else {
                            imageView3.setTranslationX(z3 ? -c00.d(64.0f, bx1Var.l(), 0) : hl.L(42.0f));
                            return;
                        }
                    }
                    byte b = this.k3;
                    if (b == 1 && str == null) {
                        return;
                    }
                    byte b2 = 3;
                    if (b == 3 && str != null) {
                        return;
                    }
                    AnimatorSet animatorSet4 = this.g3;
                    if (animatorSet4 != null) {
                        animatorSet4.cancel();
                        animatorSet = null;
                        this.g3 = null;
                    } else {
                        animatorSet = null;
                    }
                    AnimatorSet animatorSet5 = this.h3;
                    if (animatorSet5 != null) {
                        animatorSet5.cancel();
                        this.h3 = animatorSet;
                    }
                    if (oobVar != null) {
                        this.h3 = new AnimatorSet();
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(ObjectAnimator.ofFloat(oobVar, qw1Var, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(oobVar, (Property<oob, Float>) property, 0.5f));
                        ViewPropertyAnimator viewPropertyAnimator2 = this.f2;
                        if (viewPropertyAnimator2 != null) {
                            viewPropertyAnimator2.cancel();
                            this.f2 = null;
                        }
                        vz1 vz1Var3 = this.J7;
                        if (vz1Var3 != null) {
                            vz1Var3.e(0, S0 && !O2(), true);
                            if (vw1Var4 != null) {
                                float f4 = y(S0) ? 0.0f : 1.0f;
                                this.k2 = f4;
                                arrayList.add(ObjectAnimator.ofFloat(vw1Var4, (Property<vw1, Float>) property3, f4));
                                arrayList.add(ObjectAnimator.ofFloat(vw1Var4, (Property<vw1, Float>) property, y(S0) ? 0.5f : 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(vw1Var4, (Property<vw1, Float>) property2, y(S0) ? 0.5f : 1.0f));
                            }
                        } else if (vw1Var4 != null) {
                            this.k2 = 0.0f;
                            arrayList.add(ObjectAnimator.ofFloat(vw1Var4, (Property<vw1, Float>) property3, 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(vw1Var4, (Property<vw1, Float>) property, 0.5f));
                            arrayList.add(ObjectAnimator.ofFloat(vw1Var4, (Property<vw1, Float>) property2, 0.5f));
                        }
                        xy1 xy1Var2 = this.O3;
                        boolean z9 = xy1Var2 != null && xy1Var2.e0();
                        this.A2 = true;
                        cx1 cx1Var = this.y2;
                        if (cx1Var != null) {
                            cx1Var.setScaleY(1.0f);
                            cx1 cx1Var2 = this.y2;
                            if (z9) {
                                cx1Var2.setTag(null);
                                arrayList.add(ObjectAnimator.ofFloat(this.y2, (Property<cx1, Float>) property3, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(this.y2, (Property<cx1, Float>) property, 0.0f));
                                arrayList.add(n(0.0f));
                            } else {
                                cx1Var2.setAlpha(0.0f);
                                this.y2.setScaleX(0.0f);
                                this.y2.setTranslationX(0.0f);
                            }
                        }
                        this.h3.playTogether(arrayList);
                        this.h3.setDuration(100L);
                        this.h3.addListener(new ow1(this, z9, b2));
                        this.h3.start();
                        z2(0);
                        if (this.O3 != null && getVisibility() == 0) {
                            this.O3.V();
                        }
                    }
                    this.g3 = new AnimatorSet();
                    ArrayList arrayList2 = new ArrayList();
                    if (aVar.getVisibility() == 0) {
                        r15 = 0;
                        arrayList2.add(ObjectAnimator.ofFloat(zw1Var, (Property<zw1, Float>) property, 0.1f));
                        arrayList2.add(ObjectAnimator.ofFloat(zw1Var, (Property<zw1, Float>) property2, 0.1f));
                        arrayList2.add(ObjectAnimator.ofFloat(zw1Var, (Property<zw1, Float>) property3, 0.0f));
                    } else {
                        r15 = 0;
                    }
                    vw1 vw1Var6 = this.T0;
                    if (vw1Var6 != null && vw1Var6.getVisibility() == 0) {
                        vw1 vw1Var7 = this.T0;
                        float[] fArr = new float[1];
                        fArr[r15] = 0.1f;
                        arrayList2.add(ObjectAnimator.ofFloat(vw1Var7, (Property<vw1, Float>) property, fArr));
                        vw1 vw1Var8 = this.T0;
                        float[] fArr2 = new float[1];
                        fArr2[r15] = 0.1f;
                        arrayList2.add(ObjectAnimator.ofFloat(vw1Var8, (Property<vw1, Float>) property2, fArr2));
                        vw1 vw1Var9 = this.T0;
                        float[] fArr3 = new float[1];
                        fArr3[r15] = 0.0f;
                        arrayList2.add(ObjectAnimator.ofFloat(vw1Var9, (Property<vw1, Float>) property3, fArr3));
                    }
                    if (cz1Var.getVisibility() == 0) {
                        float[] fArr4 = new float[1];
                        fArr4[r15] = 0.1f;
                        arrayList2.add(ObjectAnimator.ofFloat(cz1Var, (Property<cz1, Float>) property, fArr4));
                        float[] fArr5 = new float[1];
                        fArr5[r15] = 0.1f;
                        arrayList2.add(ObjectAnimator.ofFloat(cz1Var, (Property<cz1, Float>) property2, fArr5));
                        float[] fArr6 = new float[1];
                        fArr6[r15] = 0.0f;
                        arrayList2.add(ObjectAnimator.ofFloat(cz1Var, (Property<cz1, Float>) property3, fArr6));
                    }
                    if (z7) {
                        arrayList2.add(o(r15));
                    } else if (z8) {
                        float[] fArr7 = new float[1];
                        fArr7[r15] = 0.1f;
                        ImageView imageView6 = imageView;
                        arrayList2.add(ObjectAnimator.ofFloat(imageView6, (Property<ImageView, Float>) property, fArr7));
                        float[] fArr8 = new float[1];
                        fArr8[r15] = 0.1f;
                        arrayList2.add(ObjectAnimator.ofFloat(imageView6, (Property<ImageView, Float>) property2, fArr8));
                        float[] fArr9 = new float[1];
                        fArr9[r15] = 0.0f;
                        arrayList2.add(ObjectAnimator.ofFloat(imageView6, (Property<ImageView, Float>) property3, fArr9));
                        imageView2 = imageView6;
                        if (str == null) {
                            this.k3 = (byte) 3;
                            float[] fArr10 = new float[1];
                            fArr10[r15] = 1.0f;
                            arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, fArr10));
                            float[] fArr11 = new float[1];
                            fArr11[r15] = 1.0f;
                            arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, fArr11));
                            float[] fArr12 = new float[1];
                            fArr12[r15] = 1.0f;
                            arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, fArr12));
                            imageView2.setVisibility(r15);
                        } else {
                            this.k3 = (byte) 1;
                            arrayList2.add(o(true));
                            getSendButtonInternal().setVisibility(r15);
                        }
                        this.g3.playTogether(arrayList2);
                        this.g3.setDuration(220L);
                        this.g3.setInterpolator(k43.h);
                        this.g3.addListener(new v5(this, str, (byte) 10));
                        this.g3.start();
                    }
                    imageView2 = imageView;
                    if (str == null) {
                    }
                    this.g3.playTogether(arrayList2);
                    this.g3.setDuration(220L);
                    this.g3.setInterpolator(k43.h);
                    this.g3.addListener(new v5(this, str, (byte) 10));
                    this.g3.start();
                }
                z2 = true;
                z3 = z2;
                if (this.k6) {
                    return;
                } else {
                    return;
                }
            }
            if (this.V0 == null || !this.X0 || (!(this.m4 || (this.n4 && this.G2 == 2)) || hl.E || this.T7)) {
                if (getSendButtonInternal().getVisibility() == 0 || imageView4.getVisibility() == 0 || (((vw1Var3 = this.T0) != null && vw1Var3.getVisibility() == 0) || cz1Var.getVisibility() == 0)) {
                    if (!z6) {
                        cz1Var.setScaleX(0.1f);
                        cz1Var.setScaleY(0.1f);
                        cz1Var.setAlpha(0.0f);
                        setSlowModeButtonVisible(false);
                        getSendButtonInternal().setScaleX(0.1f);
                        getSendButtonInternal().setScaleY(0.1f);
                        getSendButtonInternal().setAlpha(0.0f);
                        getSendButtonInternal().setVisibility(8);
                        imageView4.setScaleX(0.1f);
                        imageView4.setScaleY(0.1f);
                        imageView4.setAlpha(0.0f);
                        imageView4.setVisibility(8);
                        vw1 vw1Var10 = this.T0;
                        if (vw1Var10 != null) {
                            vw1Var10.setScaleX(0.1f);
                            this.T0.setScaleY(0.1f);
                            this.T0.setAlpha(0.0f);
                            this.T0.setVisibility(8);
                        }
                        zw1Var.setScaleX(1.0f);
                        zw1Var.setScaleY(1.0f);
                        zw1Var.setAlpha(1.0f);
                        aVar2.setVisibility(0);
                        if (oobVar != null) {
                            if (getVisibility() == 0) {
                                this.O3.P1();
                            }
                            this.F = 1.0f;
                            s2();
                            oobVar.setScaleX(1.0f);
                            oobVar.setVisibility(0);
                            z2(1);
                        }
                        if (vw1Var4 != null) {
                            ViewPropertyAnimator viewPropertyAnimator3 = this.f2;
                            if (viewPropertyAnimator3 != null) {
                                viewPropertyAnimator3.cancel();
                                this.f2 = null;
                            }
                            this.k2 = 1.0f;
                            vw1Var4.setAlpha(1.0f);
                            vw1Var4.setScaleX(1.0f);
                            vw1Var4.setScaleY(1.0f);
                        }
                        this.A2 = false;
                        xy1 xy1Var3 = this.O3;
                        if (xy1Var3 != null && xy1Var3.e0()) {
                            g0();
                        }
                        if (this.y2 != null) {
                            xy1 xy1Var4 = this.O3;
                            if (xy1Var4 != null && xy1Var4.e0()) {
                                this.y2.setVisibility(0);
                                this.y2.setTag(1);
                            }
                            this.y2.setAlpha(1.0f);
                            this.y2.setScaleX(1.0f);
                            this.y2.setScaleY(1.0f);
                            this.y2.setTranslationX(0.0f);
                        }
                    } else {
                        if (this.k3 == 2) {
                            return;
                        }
                        AnimatorSet animatorSet6 = this.g3;
                        if (animatorSet6 != null) {
                            animatorSet6.cancel();
                            animatorSet2 = null;
                            this.g3 = null;
                        } else {
                            animatorSet2 = null;
                        }
                        AnimatorSet animatorSet7 = this.h3;
                        if (animatorSet7 != null) {
                            animatorSet7.cancel();
                            this.h3 = animatorSet2;
                        }
                        if (oobVar != null) {
                            if (oobVar.getVisibility() != 0) {
                                oobVar.setVisibility(0);
                                this.F = 0.0f;
                                s2();
                                oobVar.setScaleX(0.0f);
                            }
                            this.h3 = new AnimatorSet();
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(ObjectAnimator.ofFloat(oobVar, qw1Var, 1.0f));
                            arrayList3.add(ObjectAnimator.ofFloat(oobVar, (Property<oob, Float>) property, 1.0f));
                            vz1 vz1Var4 = this.J7;
                            if (vz1Var4 != null) {
                                vz1Var4.e(0, false, true);
                            }
                            if (vw1Var4 != null) {
                                ViewPropertyAnimator viewPropertyAnimator4 = this.f2;
                                if (viewPropertyAnimator4 != null) {
                                    viewPropertyAnimator4.cancel();
                                    this.f2 = null;
                                }
                                this.k2 = 1.0f;
                                arrayList3.add(ObjectAnimator.ofFloat(vw1Var4, (Property<vw1, Float>) property3, 1.0f));
                                arrayList3.add(ObjectAnimator.ofFloat(vw1Var4, (Property<vw1, Float>) property, 1.0f));
                                arrayList3.add(ObjectAnimator.ofFloat(vw1Var4, (Property<vw1, Float>) property2, 1.0f));
                            }
                            xy1 xy1Var5 = this.O3;
                            boolean z10 = xy1Var5 != null && xy1Var5.e0();
                            this.A2 = false;
                            if (z10) {
                                g0();
                            }
                            cx1 cx1Var3 = this.y2;
                            if (cx1Var3 != null) {
                                if (z10) {
                                    cx1Var3.setVisibility(0);
                                    this.y2.setTag(1);
                                    this.y2.setPivotX(hl.L(44.0f));
                                    arrayList3.add(ObjectAnimator.ofFloat(this.y2, (Property<cx1, Float>) property3, 1.0f));
                                    arrayList3.add(ObjectAnimator.ofFloat(this.y2, (Property<cx1, Float>) property, 1.0f));
                                    arrayList3.add(n(0.0f));
                                    ImageView imageView7 = this.x2;
                                    if (imageView7 != null && imageView7.getVisibility() == 0) {
                                        imageView7.setVisibility(8);
                                    }
                                } else {
                                    cx1Var3.setAlpha(1.0f);
                                    this.y2.setScaleX(1.0f);
                                    this.y2.setScaleY(1.0f);
                                    this.y2.setTranslationX(0.0f);
                                }
                            }
                            this.h3.playTogether(arrayList3);
                            this.h3.setDuration(100L);
                            this.h3.addListener(new pw1(this, (byte) 9));
                            this.h3.start();
                            z2(1);
                            if (getVisibility() == 0) {
                                this.O3.P1();
                            }
                        }
                        aVar2.setVisibility(0);
                        this.g3 = new AnimatorSet();
                        this.k3 = (byte) 2;
                        ArrayList arrayList4 = new ArrayList();
                        zu1 zu1Var = this.E3;
                        TLRPC.Chat e = zu1Var == null ? null : zu1Var.e();
                        TLRPC.UserFull userFull = zu1Var == null ? this.L : zu1Var.s8;
                        if (e != null) {
                            if (!xc2.v(e)) {
                                if (!xc2.s(e)) {
                                }
                            }
                            f = 1.0f;
                        } else if (userFull != null) {
                            if (userFull.voice_messages_forbidden) {
                            }
                            f = 1.0f;
                        } else {
                            i2 = 1;
                            f = 1.0f;
                            float[] fArr13 = new float[i2];
                            fArr13[0] = 1.0f;
                            arrayList4.add(ObjectAnimator.ofFloat(zw1Var, (Property<zw1, Float>) property, fArr13));
                            float[] fArr14 = new float[i2];
                            fArr14[0] = 1.0f;
                            arrayList4.add(ObjectAnimator.ofFloat(zw1Var, (Property<zw1, Float>) property2, fArr14));
                            float[] fArr15 = new float[i2];
                            fArr15[0] = f;
                            arrayList4.add(ObjectAnimator.ofFloat(zw1Var, (Property<zw1, Float>) property3, fArr15));
                            if (imageView4.getVisibility() != 0) {
                                float[] fArr16 = new float[i2];
                                fArr16[0] = 0.1f;
                                arrayList4.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property, fArr16));
                                float[] fArr17 = new float[i2];
                                fArr17[0] = 0.1f;
                                arrayList4.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property2, fArr17));
                                float[] fArr18 = new float[i2];
                                fArr18[0] = 0.0f;
                                arrayList4.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property3, fArr18));
                            } else {
                                vw1 vw1Var11 = this.T0;
                                if (vw1Var11 != null && vw1Var11.getVisibility() == 0) {
                                    vw1 vw1Var12 = this.T0;
                                    float[] fArr19 = new float[i2];
                                    fArr19[0] = 0.1f;
                                    arrayList4.add(ObjectAnimator.ofFloat(vw1Var12, (Property<vw1, Float>) property, fArr19));
                                    vw1 vw1Var13 = this.T0;
                                    float[] fArr20 = new float[i2];
                                    fArr20[0] = 0.1f;
                                    arrayList4.add(ObjectAnimator.ofFloat(vw1Var13, (Property<vw1, Float>) property2, fArr20));
                                    vw1 vw1Var14 = this.T0;
                                    float[] fArr21 = new float[i2];
                                    fArr21[0] = 0.0f;
                                    arrayList4.add(ObjectAnimator.ofFloat(vw1Var14, (Property<vw1, Float>) property3, fArr21));
                                } else if (cz1Var.getVisibility() == 0) {
                                    float[] fArr22 = new float[i2];
                                    fArr22[0] = 0.1f;
                                    arrayList4.add(ObjectAnimator.ofFloat(cz1Var, (Property<cz1, Float>) property, fArr22));
                                    float[] fArr23 = new float[i2];
                                    fArr23[0] = 0.1f;
                                    arrayList4.add(ObjectAnimator.ofFloat(cz1Var, (Property<cz1, Float>) property2, fArr23));
                                    float[] fArr24 = new float[i2];
                                    fArr24[0] = 0.0f;
                                    arrayList4.add(ObjectAnimator.ofFloat(cz1Var, (Property<cz1, Float>) property3, fArr24));
                                } else {
                                    View sendButtonInternal = getSendButtonInternal();
                                    float[] fArr25 = new float[i2];
                                    fArr25[0] = 0.1f;
                                    arrayList4.add(ObjectAnimator.ofFloat(sendButtonInternal, (Property<View, Float>) property, fArr25));
                                    View sendButtonInternal2 = getSendButtonInternal();
                                    float[] fArr26 = new float[i2];
                                    fArr26[0] = 0.1f;
                                    arrayList4.add(ObjectAnimator.ofFloat(sendButtonInternal2, (Property<View, Float>) property2, fArr26));
                                    View sendButtonInternal3 = getSendButtonInternal();
                                    float[] fArr27 = new float[i2];
                                    fArr27[0] = 0.0f;
                                    arrayList4.add(ObjectAnimator.ofFloat(sendButtonInternal3, (Property<View, Float>) property3, fArr27));
                                }
                            }
                            this.g3.playTogether(arrayList4);
                            this.g3.setDuration(150L);
                            this.g3.addListener(new pw1(this, (byte) 10));
                            this.g3.start();
                        }
                        i2 = 1;
                        float[] fArr132 = new float[i2];
                        fArr132[0] = 1.0f;
                        arrayList4.add(ObjectAnimator.ofFloat(zw1Var, (Property<zw1, Float>) property, fArr132));
                        float[] fArr142 = new float[i2];
                        fArr142[0] = 1.0f;
                        arrayList4.add(ObjectAnimator.ofFloat(zw1Var, (Property<zw1, Float>) property2, fArr142));
                        float[] fArr152 = new float[i2];
                        fArr152[0] = f;
                        arrayList4.add(ObjectAnimator.ofFloat(zw1Var, (Property<zw1, Float>) property3, fArr152));
                        if (imageView4.getVisibility() != 0) {
                        }
                        this.g3.playTogether(arrayList4);
                        this.g3.setDuration(150L);
                        this.g3.addListener(new pw1(this, (byte) 10));
                        this.g3.start();
                    }
                }
            } else if (!z6) {
                cz1Var.setScaleX(0.1f);
                cz1Var.setScaleY(0.1f);
                cz1Var.setAlpha(0.0f);
                setSlowModeButtonVisible(false);
                getSendButtonInternal().setScaleX(0.1f);
                getSendButtonInternal().setScaleY(0.1f);
                getSendButtonInternal().setAlpha(0.0f);
                getSendButtonInternal().setVisibility(8);
                imageView4.setScaleX(0.1f);
                imageView4.setScaleY(0.1f);
                imageView4.setAlpha(0.0f);
                imageView4.setVisibility(8);
                zw1Var.setScaleX(0.1f);
                zw1Var.setScaleY(0.1f);
                zw1Var.setAlpha(0.0f);
                aVar2.setVisibility(8);
                a0();
                this.T0.setScaleX(1.0f);
                this.T0.setScaleY(1.0f);
                this.T0.setAlpha(1.0f);
                this.T0.setVisibility(0);
                if (oobVar != null) {
                    if (getVisibility() == 0) {
                        this.O3.P1();
                    }
                    oobVar.setVisibility(0);
                    z2(1);
                }
                this.A2 = false;
                xy1 xy1Var6 = this.O3;
                boolean z11 = xy1Var6 != null && xy1Var6.e0();
                if (z11) {
                    g0();
                }
                cx1 cx1Var4 = this.y2;
                if (cx1Var4 != null) {
                    if (z11) {
                        cx1Var4.setVisibility(0);
                        this.y2.setTag(1);
                    }
                    this.y2.setAlpha(1.0f);
                    this.y2.setScaleX(1.0f);
                    this.y2.setScaleY(1.0f);
                    this.y2.setTranslationX(0.0f);
                }
            } else {
                if (this.k3 == 4) {
                    return;
                }
                AnimatorSet animatorSet8 = this.g3;
                if (animatorSet8 != null) {
                    animatorSet8.cancel();
                    animatorSet3 = null;
                    this.g3 = null;
                } else {
                    animatorSet3 = null;
                }
                AnimatorSet animatorSet9 = this.h3;
                if (animatorSet9 != null) {
                    animatorSet9.cancel();
                    this.h3 = animatorSet3;
                }
                if (oobVar != null && !this.l3) {
                    oobVar.setVisibility(0);
                    this.h3 = new AnimatorSet();
                    ArrayList arrayList5 = new ArrayList();
                    arrayList5.add(ObjectAnimator.ofFloat(oobVar, qw1Var, 1.0f));
                    arrayList5.add(ObjectAnimator.ofFloat(oobVar, (Property<oob, Float>) property, 1.0f));
                    vz1 vz1Var5 = this.J7;
                    if (vz1Var5 != null) {
                        vz1Var5.e(0, false, true);
                    }
                    if (vw1Var4 != null) {
                        ViewPropertyAnimator viewPropertyAnimator5 = this.f2;
                        if (viewPropertyAnimator5 != null) {
                            viewPropertyAnimator5.cancel();
                            this.f2 = null;
                        }
                        this.k2 = 1.0f;
                        arrayList5.add(ObjectAnimator.ofFloat(vw1Var4, (Property<vw1, Float>) property3, 1.0f));
                        arrayList5.add(ObjectAnimator.ofFloat(vw1Var4, (Property<vw1, Float>) property, 1.0f));
                        arrayList5.add(ObjectAnimator.ofFloat(vw1Var4, (Property<vw1, Float>) property2, 1.0f));
                    }
                    xy1 xy1Var7 = this.O3;
                    boolean z12 = xy1Var7 != null && xy1Var7.e0();
                    this.A2 = false;
                    if (z12) {
                        g0();
                    }
                    cx1 cx1Var5 = this.y2;
                    if (cx1Var5 != null) {
                        cx1Var5.setScaleY(1.0f);
                        cx1 cx1Var6 = this.y2;
                        if (z12) {
                            cx1Var6.setVisibility(0);
                            this.y2.setTag(1);
                            this.y2.setPivotX(hl.L(44.0f));
                            arrayList5.add(ObjectAnimator.ofFloat(this.y2, (Property<cx1, Float>) property3, 1.0f));
                            arrayList5.add(ObjectAnimator.ofFloat(this.y2, (Property<cx1, Float>) property, 1.0f));
                            arrayList5.add(n(0.0f));
                        } else {
                            cx1Var6.setAlpha(1.0f);
                            this.y2.setScaleX(1.0f);
                            this.y2.setTranslationX(0.0f);
                        }
                    }
                    this.h3.playTogether(arrayList5);
                    this.h3.setDuration(100L);
                    this.h3.addListener(new pw1(this, (byte) 7));
                    this.h3.start();
                    z2(1);
                    if (getVisibility() == 0) {
                        this.O3.P1();
                    }
                }
                a0();
                this.T0.setVisibility(0);
                this.g3 = new AnimatorSet();
                this.k3 = (byte) 4;
                ArrayList arrayList6 = new ArrayList();
                arrayList6.add(ObjectAnimator.ofFloat(this.T0, (Property<vw1, Float>) property, 1.0f));
                arrayList6.add(ObjectAnimator.ofFloat(this.T0, (Property<vw1, Float>) property2, 1.0f));
                arrayList6.add(ObjectAnimator.ofFloat(this.T0, (Property<vw1, Float>) property3, 1.0f));
                if (imageView4.getVisibility() == 0) {
                    arrayList6.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property2, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property3, 0.0f));
                } else if (aVar2.getVisibility() == 0) {
                    arrayList6.add(ObjectAnimator.ofFloat(zw1Var, (Property<zw1, Float>) property, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(zw1Var, (Property<zw1, Float>) property2, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(zw1Var, (Property<zw1, Float>) property3, 0.0f));
                } else if (cz1Var.getVisibility() == 0) {
                    arrayList6.add(ObjectAnimator.ofFloat(cz1Var, (Property<cz1, Float>) property, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(cz1Var, (Property<cz1, Float>) property2, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(cz1Var, (Property<cz1, Float>) property3, 0.0f));
                } else {
                    arrayList6.add(ObjectAnimator.ofFloat(getSendButtonInternal(), (Property<View, Float>) property, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(getSendButtonInternal(), (Property<View, Float>) property2, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(getSendButtonInternal(), (Property<View, Float>) property3, 0.0f));
                }
                this.g3.playTogether(arrayList6);
                this.g3.setDuration(250L);
                this.g3.addListener(new pw1(this, (byte) 8));
                this.g3.start();
            }
        } else if (cz1Var.getVisibility() != 0) {
            if (z6) {
                byte b3 = 5;
                if (this.k3 == 5) {
                    return;
                }
                AnimatorSet animatorSet10 = this.g3;
                if (animatorSet10 != null) {
                    animatorSet10.cancel();
                    r3 = 0;
                    this.g3 = null;
                } else {
                    r3 = 0;
                }
                AnimatorSet animatorSet11 = this.h3;
                if (animatorSet11 != null) {
                    animatorSet11.cancel();
                    this.h3 = r3;
                }
                ViewPropertyAnimator viewPropertyAnimator6 = this.f2;
                if (viewPropertyAnimator6 != null) {
                    viewPropertyAnimator6.cancel();
                    this.f2 = r3;
                }
                if (oobVar != null) {
                    this.h3 = new AnimatorSet();
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(ObjectAnimator.ofFloat(oobVar, qw1Var, 0.0f));
                    arrayList7.add(ObjectAnimator.ofFloat(oobVar, (Property<oob, Float>) property, 0.5f));
                    this.A2 = false;
                    xy1 xy1Var8 = this.O3;
                    boolean z13 = xy1Var8 != null && xy1Var8.e0();
                    if (z13) {
                        g0();
                    }
                    vz1 vz1Var6 = this.J7;
                    if (vz1Var6 != null) {
                        vz1Var6.e(0, false, true);
                    }
                    if (vw1Var4 != null) {
                        this.k2 = 0.0f;
                        arrayList7.add(ObjectAnimator.ofFloat(vw1Var4, (Property<vw1, Float>) property3, 0.0f));
                        arrayList7.add(ObjectAnimator.ofFloat(vw1Var4, (Property<vw1, Float>) property, 0.5f));
                        arrayList7.add(ObjectAnimator.ofFloat(vw1Var4, (Property<vw1, Float>) property2, 0.5f));
                    }
                    cx1 cx1Var7 = this.y2;
                    if (cx1Var7 != null) {
                        cx1Var7.setScaleY(1.0f);
                        cx1 cx1Var8 = this.y2;
                        if (z13) {
                            cx1Var8.setVisibility(0);
                            this.y2.setTag(1);
                            this.y2.setPivotX(hl.L(44.0f));
                            arrayList7.add(n(0.0f));
                            arrayList7.add(ObjectAnimator.ofFloat(this.y2, (Property<cx1, Float>) property3, 1.0f));
                            arrayList7.add(ObjectAnimator.ofFloat(this.y2, (Property<cx1, Float>) property, 1.0f));
                        } else {
                            cx1Var8.setTranslationX(0.0f);
                            this.y2.setAlpha(1.0f);
                            this.y2.setScaleX(1.0f);
                        }
                    }
                    this.h3.playTogether(arrayList7);
                    this.h3.setDuration(100L);
                    this.h3.addListener(new pw1(this, (byte) 5));
                    this.h3.start();
                    z2(0);
                    if (this.O3 != null && getVisibility() == 0) {
                        this.O3.V();
                    }
                    b3 = 5;
                }
                this.k3 = b3;
                this.g3 = new AnimatorSet();
                ArrayList arrayList8 = new ArrayList();
                if (aVar2.getVisibility() == 0) {
                    r152 = 0;
                    arrayList8.add(ObjectAnimator.ofFloat(zw1Var, (Property<zw1, Float>) property, 0.1f));
                    arrayList8.add(ObjectAnimator.ofFloat(zw1Var, (Property<zw1, Float>) property2, 0.1f));
                    arrayList8.add(ObjectAnimator.ofFloat(zw1Var, (Property<zw1, Float>) property3, 0.0f));
                } else {
                    r152 = 0;
                }
                vw1 vw1Var15 = this.T0;
                if (vw1Var15 != null && vw1Var15.getVisibility() == 0) {
                    vw1 vw1Var16 = this.T0;
                    float[] fArr28 = new float[1];
                    fArr28[r152] = 0.1f;
                    arrayList8.add(ObjectAnimator.ofFloat(vw1Var16, (Property<vw1, Float>) property, fArr28));
                    vw1 vw1Var17 = this.T0;
                    float[] fArr29 = new float[1];
                    fArr29[r152] = 0.1f;
                    arrayList8.add(ObjectAnimator.ofFloat(vw1Var17, (Property<vw1, Float>) property2, fArr29));
                    vw1 vw1Var18 = this.T0;
                    float[] fArr30 = new float[1];
                    fArr30[r152] = 0.0f;
                    arrayList8.add(ObjectAnimator.ofFloat(vw1Var18, (Property<vw1, Float>) property3, fArr30));
                }
                if (getSendButtonInternal().getVisibility() == 0) {
                    arrayList8.add(o(r152));
                }
                if (imageView4.getVisibility() == 0) {
                    float[] fArr31 = new float[1];
                    fArr31[r152] = 0.1f;
                    arrayList8.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property, fArr31));
                    float[] fArr32 = new float[1];
                    fArr32[r152] = 0.1f;
                    arrayList8.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property2, fArr32));
                    float[] fArr33 = new float[1];
                    fArr33[r152] = 0.0f;
                    arrayList8.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property3, fArr33));
                }
                float[] fArr34 = new float[1];
                fArr34[r152] = 1.0f;
                arrayList8.add(ObjectAnimator.ofFloat(cz1Var, (Property<cz1, Float>) property, fArr34));
                float[] fArr35 = new float[1];
                fArr35[r152] = 1.0f;
                arrayList8.add(ObjectAnimator.ofFloat(cz1Var, (Property<cz1, Float>) property2, fArr35));
                float[] fArr36 = new float[1];
                fArr36[r152] = 1.0f;
                arrayList8.add(ObjectAnimator.ofFloat(cz1Var, (Property<cz1, Float>) property3, fArr36));
                setSlowModeButtonVisible(true);
                this.g3.playTogether(arrayList8);
                this.g3.setDuration(220L);
                this.g3.setInterpolator(k43.h);
                this.g3.addListener(new pw1(this, (byte) 6));
                this.g3.start();
            } else {
                cz1Var.setScaleX(1.0f);
                cz1Var.setScaleY(1.0f);
                cz1Var.setAlpha(1.0f);
                setSlowModeButtonVisible(true);
                zw1Var.setScaleX(0.1f);
                zw1Var.setScaleY(0.1f);
                zw1Var.setAlpha(0.0f);
                aVar2.setVisibility(8);
                getSendButtonInternal().setScaleX(0.1f);
                getSendButtonInternal().setScaleY(0.1f);
                getSendButtonInternal().setAlpha(0.0f);
                getSendButtonInternal().setVisibility(8);
                imageView4.setScaleX(0.1f);
                imageView4.setScaleY(0.1f);
                imageView4.setAlpha(0.0f);
                imageView4.setVisibility(8);
                vw1 vw1Var19 = this.T0;
                if (vw1Var19 == null || vw1Var19.getVisibility() != 0) {
                    i3 = 8;
                } else {
                    this.T0.setScaleX(0.1f);
                    this.T0.setScaleY(0.1f);
                    this.T0.setAlpha(0.0f);
                    i3 = 8;
                    this.T0.setVisibility(8);
                }
                if (oobVar != null) {
                    oobVar.setVisibility(i3);
                    if (this.O3 != null && getVisibility() == 0) {
                        this.O3.V();
                    }
                    z4 = false;
                    z2(0);
                    vz1 vz1Var7 = this.J7;
                    if (vz1Var7 != null) {
                        vz1Var7.e(0, false, false);
                    }
                    if (vw1Var4 != null) {
                        this.k2 = 0.0f;
                        vw1Var4.setAlpha(0.0f);
                        vw1Var4.setScaleX(0.5f);
                        vw1Var4.setScaleY(0.5f);
                    }
                } else {
                    z4 = false;
                }
                this.A2 = z4;
                xy1 xy1Var9 = this.O3;
                boolean z14 = xy1Var9 != null && xy1Var9.e0();
                if (z14) {
                    g0();
                }
                cx1 cx1Var9 = this.y2;
                if (cx1Var9 != null) {
                    if (z14) {
                        cx1Var9.setVisibility(0);
                        this.y2.setTag(1);
                    }
                    this.y2.setTranslationX(0.0f);
                    this.y2.setAlpha(1.0f);
                    this.y2.setScaleX(1.0f);
                    this.y2.setScaleY(1.0f);
                }
            }
        }
        bx1Var = bx1Var2;
        z3 = false;
        if (this.k6) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0412  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P0(boolean z) {
        ArrayList arrayList;
        int i;
        tx1 tx1Var;
        ArrayList arrayList2;
        long j;
        AnimatorSet animatorSet;
        long j2;
        AnimatorSet animatorSet2;
        ep0 ep0Var;
        char c;
        AnimatorSet animatorSet3 = this.j3;
        if (animatorSet3 == null || !animatorSet3.isRunning()) {
            if (this.J1) {
                V1(true);
            }
            this.R3 = null;
            this.Q3 = null;
            this.S3 = null;
            this.T3 = null;
            qgc qgcVar = this.g1;
            if (qgcVar != null) {
                qgcVar.a(true);
            }
            zw1 zw1Var = this.c1;
            if (zw1Var != null) {
                zw1Var.setVisibility(0);
            }
            qw1 qw1Var = this.R4;
            qw1 qw1Var2 = this.N4;
            qw1 qw1Var3 = this.P4;
            Property property = View.SCALE_Y;
            Property property2 = View.SCALE_X;
            tw1 tw1Var = this.R0;
            Property property3 = View.ALPHA;
            vw1 vw1Var = this.g2;
            if (z) {
                if (vw1Var != null) {
                    this.k2 = 0.0f;
                    vw1Var.setAlpha(0.0f);
                    vw1Var.setScaleX(0.0f);
                    vw1Var.setScaleY(0.0f);
                }
                this.n = 0.0f;
                this.h = 0.0f;
                x2();
                this.j3 = new AnimatorSet();
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(ObjectAnimator.ofFloat(tw1Var, qw1Var3, this.B0 ? 0.5f : 1.0f));
                arrayList3.add(ObjectAnimator.ofFloat(tw1Var, qw1Var2, 1.0f));
                arrayList3.add(ObjectAnimator.ofFloat(this.h1, (Property<e29, Float>) property3, 0.0f));
                arrayList3.add(ObjectAnimator.ofFloat(this.h1, (Property<e29, Float>) property2, 0.0f));
                arrayList3.add(ObjectAnimator.ofFloat(this.h1, (Property<e29, Float>) property, 0.0f));
                arrayList3.add(ObjectAnimator.ofFloat(this.f1, (Property<rw1, Float>) property3, 0.0f));
                if (vw1Var != null) {
                    ViewPropertyAnimator viewPropertyAnimator = this.f2;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        this.f2 = null;
                    }
                    this.k2 = 1.0f;
                    arrayList3.add(ObjectAnimator.ofFloat(vw1Var, (Property<vw1, Float>) property3, 1.0f));
                    arrayList3.add(ObjectAnimator.ofFloat(vw1Var, (Property<vw1, Float>) property2, 1.0f));
                    arrayList3.add(ObjectAnimator.ofFloat(vw1Var, (Property<vw1, Float>) property, 1.0f));
                }
                arrayList3.add(ObjectAnimator.ofFloat(this.F0, (Property<tx1, Float>) property3, 1.0f));
                arrayList3.add(ObjectAnimator.ofFloat(this.F0, qw1Var, 0.0f));
                l lVar = this.D2;
                if (lVar != null) {
                    arrayList3.add(ObjectAnimator.ofFloat(lVar, (Property<l, Float>) property3, 0.0f));
                    this.D2.f();
                }
                this.j3.playTogether(arrayList3);
                ep0 ep0Var2 = this.m0;
                if (ep0Var2 != null) {
                    ep0Var2.setAlpha(0.0f);
                    this.m0.setScaleY(0.0f);
                    this.m0.setScaleX(0.0f);
                    this.j3.playTogether(ObjectAnimator.ofFloat(this.m0, (Property<ep0, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.m0, (Property<ep0, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.m0, (Property<ep0, Float>) property, 1.0f));
                }
                this.j3.setDuration(150L);
                this.j3.addListener(new pw1(this, (byte) 4));
            } else {
                boolean z2 = this.z5;
                e29 e29Var = this.h1;
                if (e29Var != null && !z2) {
                    e29Var.d();
                }
                AnimatorSet animatorSet4 = new AnimatorSet();
                ArrayList arrayList4 = new ArrayList();
                boolean z3 = this.d1;
                long j3 = 600;
                Property property4 = View.TRANSLATION_X;
                if (z3) {
                    arrayList4.add(ObjectAnimator.ofFloat(this.g1, (Property<qgc, Float>) property3, 0.0f));
                    arrayList4.add(ObjectAnimator.ofFloat(this.g1, (Property<qgc, Float>) property4, -hl.L(20.0f)));
                    arrayList4.add(ObjectAnimator.ofFloat(this.F0, qw1Var, 0.0f));
                    l lVar2 = this.D2;
                    if (lVar2 != null) {
                        arrayList4.add(ObjectAnimator.ofFloat(lVar2, (Property<l, Float>) property3, 0.0f));
                        this.D2.f();
                    }
                    animatorSet4.playTogether(arrayList4);
                    float f = this.s;
                    tx1 tx1Var2 = this.F0;
                    if (f == 1.0f) {
                        animatorSet4.playTogether(ObjectAnimator.ofFloat(tx1Var2, (Property<tx1, Float>) property3, 1.0f));
                    } else {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(tx1Var2, (Property<tx1, Float>) property3, 1.0f);
                        ofFloat.setStartDelay(750L);
                        ofFloat.setDuration(200L);
                        animatorSet4.playTogether(ofFloat);
                    }
                } else {
                    tx1 tx1Var3 = this.F0;
                    if (tx1Var3 == null || this.s != 1.0f || z2) {
                        this.H = 0.0f;
                        B2();
                        if (z2 && (tx1Var = this.F0) != null) {
                            tx1Var.setAlpha(0.0f);
                        }
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.F0, (Property<tx1, Float>) property3, 1.0f);
                        arrayList = arrayList4;
                        ofFloat2.setStartDelay(z2 ? 600L : 750L);
                        ofFloat2.setDuration(z2 ? 360L : 200L);
                        if (z2) {
                            ofFloat2.setInterpolator(k43.g);
                        }
                        i = 1;
                        animatorSet4.playTogether(ofFloat2);
                    } else {
                        tx1Var3.setAlpha(1.0f);
                        this.H = 0.0f;
                        B2();
                        arrayList = arrayList4;
                        i = 1;
                    }
                    if (z2) {
                        arrayList2 = arrayList;
                    } else {
                        x59 x59Var = this.i1;
                        float[] fArr = new float[i];
                        fArr[0] = 0.0f;
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(x59Var, (Property<x59, Float>) property3, fArr);
                        arrayList2 = arrayList;
                        arrayList2.add(ofFloat3);
                        x59 x59Var2 = this.i1;
                        float[] fArr2 = new float[i];
                        fArr2[0] = -hl.L(20.0f);
                        arrayList2.add(ObjectAnimator.ofFloat(x59Var2, (Property<x59, Float>) property4, fArr2));
                    }
                    l lVar3 = this.D2;
                    if (lVar3 != null) {
                        float[] fArr3 = new float[i];
                        fArr3[0] = 0.0f;
                        arrayList2.add(ObjectAnimator.ofFloat(lVar3, (Property<l, Float>) property3, fArr3));
                        this.D2.f();
                    }
                    animatorSet4.playTogether(arrayList2);
                }
                animatorSet4.setDuration(200L);
                if (z2) {
                    this.F = 0.0f;
                    this.B7 = Math.max(this.B7, SystemClock.uptimeMillis() + 270);
                    if (vw1Var != null) {
                        ViewPropertyAnimator viewPropertyAnimator2 = this.f2;
                        if (viewPropertyAnimator2 != null) {
                            viewPropertyAnimator2.cancel();
                            this.f2 = null;
                        }
                        this.k2 = 0.0f;
                        vw1Var.setAlpha(0.0f);
                    }
                    s2();
                    j = 260;
                    hl.d3(new mv1(this, (byte) 8), 260L);
                } else {
                    j = 260;
                    if (vw1Var != null) {
                        ViewPropertyAnimator viewPropertyAnimator3 = this.f2;
                        if (viewPropertyAnimator3 != null) {
                            viewPropertyAnimator3.cancel();
                            this.f2 = null;
                        }
                        this.k2 = 0.0f;
                        vw1Var.setAlpha(0.0f);
                        vw1Var.setScaleX(0.0f);
                        vw1Var.setScaleY(0.0f);
                        animatorSet = new AnimatorSet();
                        this.k2 = 1.0f;
                        j2 = 260;
                        animatorSet.playTogether(ObjectAnimator.ofFloat(vw1Var, (Property<vw1, Float>) property3, 1.0f), ObjectAnimator.ofFloat(vw1Var, (Property<vw1, Float>) property2, 1.0f), ObjectAnimator.ofFloat(vw1Var, (Property<vw1, Float>) property, 1.0f));
                        animatorSet.setDuration(150L);
                        this.n = 0.0f;
                        this.h = !z2 ? 0.6f : 0.0f;
                        x2();
                        AnimatorSet animatorSet5 = new AnimatorSet();
                        float f2 = z2 ? 0.6f : 0.0f;
                        animatorSet2 = animatorSet;
                        animatorSet5.playTogether(ObjectAnimator.ofFloat(this.h1, (Property<e29, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.h1, (Property<e29, Float>) property2, f2), ObjectAnimator.ofFloat(this.h1, (Property<e29, Float>) property, f2), ObjectAnimator.ofFloat(tw1Var, qw1Var3, !this.B0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(tw1Var, qw1Var2, 1.0f));
                        ep0Var = this.m0;
                        if (ep0Var != null) {
                            ep0Var.setAlpha(0.0f);
                            this.m0.setScaleY(0.0f);
                            this.m0.setScaleX(0.0f);
                            animatorSet5.playTogether(ObjectAnimator.ofFloat(this.m0, (Property<ep0, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.m0, (Property<ep0, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.m0, (Property<ep0, Float>) property, 1.0f));
                        }
                        animatorSet5.setDuration(!z2 ? j2 : 150L);
                        if (z2) {
                            animatorSet5.setInterpolator(k43.g);
                            j3 = 0;
                        }
                        animatorSet5.setStartDelay(j3);
                        AnimatorSet animatorSet6 = new AnimatorSet();
                        this.j3 = animatorSet6;
                        if (z2) {
                            c = 0;
                        } else {
                            this.B5 = animatorSet5;
                            c = 0;
                            this.C5 = false;
                        }
                        if (animatorSet2 == null) {
                            if (z2) {
                                Animator[] animatorArr = new Animator[2];
                                animatorArr[c] = animatorSet4;
                                animatorArr[1] = animatorSet2;
                                animatorSet6.playTogether(animatorArr);
                            } else {
                                Animator[] animatorArr2 = new Animator[3];
                                animatorArr2[c] = animatorSet4;
                                animatorArr2[1] = animatorSet2;
                                animatorArr2[2] = animatorSet5;
                                animatorSet6.playTogether(animatorArr2);
                            }
                        } else if (z2) {
                            Animator[] animatorArr3 = new Animator[1];
                            animatorArr3[c] = animatorSet4;
                            animatorSet6.playTogether(animatorArr3);
                        } else {
                            Animator[] animatorArr4 = new Animator[2];
                            animatorArr4[c] = animatorSet4;
                            animatorArr4[1] = animatorSet5;
                            animatorSet6.playTogether(animatorArr4);
                        }
                        this.j3.addListener(new f(this));
                    }
                }
                j2 = j;
                animatorSet = null;
                this.n = 0.0f;
                this.h = !z2 ? 0.6f : 0.0f;
                x2();
                AnimatorSet animatorSet52 = new AnimatorSet();
                if (z2) {
                }
                animatorSet2 = animatorSet;
                animatorSet52.playTogether(ObjectAnimator.ofFloat(this.h1, (Property<e29, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.h1, (Property<e29, Float>) property2, f2), ObjectAnimator.ofFloat(this.h1, (Property<e29, Float>) property, f2), ObjectAnimator.ofFloat(tw1Var, qw1Var3, !this.B0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(tw1Var, qw1Var2, 1.0f));
                ep0Var = this.m0;
                if (ep0Var != null) {
                }
                animatorSet52.setDuration(!z2 ? j2 : 150L);
                if (z2) {
                }
                animatorSet52.setStartDelay(j3);
                AnimatorSet animatorSet62 = new AnimatorSet();
                this.j3 = animatorSet62;
                if (z2) {
                }
                if (animatorSet2 == null) {
                }
                this.j3.addListener(new f(this));
            }
            AnimatorSet animatorSet7 = this.j3;
            if (animatorSet7 != null) {
                animatorSet7.start();
            }
            l lVar4 = this.D2;
            if (lVar4 != null) {
                lVar4.invalidate();
            }
        }
    }

    public final void P1() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.D3.getSystemService("accessibility");
        if (this.F0 == null || accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        try {
            this.F0.requestFocus();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void P2(int i) {
        byte b;
        if (this.l1) {
            return;
        }
        if (this.r1 != null || uc7.e1().getBoolean("asr_live_text", true)) {
            snc sncVar = this.r1;
            byte b2 = 9;
            if (sncVar != null && sncVar.K && ((b = sncVar.c) == 2 || b == 4)) {
                if (i != 1 && i != 2 && i != 4 && i != 5) {
                    hl.c3(new mv1(this, b2));
                    return;
                }
                sncVar.k("field: record state " + i, true);
                return;
            }
            if (sncVar == null || sncVar.c != 3) {
                if (i == 0) {
                    hl.c3(new mv1(this, b2));
                    return;
                } else {
                    if (sncVar != null) {
                        sncVar.k("record state " + i, true);
                        return;
                    }
                    return;
                }
            }
            if (i == 1 || i == 2 || i == 4 || i == 5 || i == 0) {
                sncVar.k("review: record state " + i, true);
            }
        }
    }

    public final void Q() {
        if (this.V0 != null) {
            Point point = hl.q;
            int i = point.x > point.y ? this.n3 : this.m3;
            int L = ((((this.d2 - hl.m) - hl.n) - hl.L(6.0f)) - org.telegram.ui.ActionBar.a.getCurrentActionBarHeight()) - getHeight();
            if (this.G2 == 2) {
                L = Math.min(L, hl.L(175.0f) + i);
            }
            int i2 = this.V0.getLayoutParams().height;
            if (i2 != L) {
                AnimatorSet animatorSet = this.q4;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.q4 = null;
                }
                this.s4 = L;
                byte b = 1;
                px1 px1Var = this.i4;
                if (i2 > L) {
                    mv1 mv1Var = new mv1(this, (byte) 27);
                    this.V0.setLayerType(2, null);
                    if (this.w) {
                        this.x = mv1Var;
                    } else {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        r2d r2dVar = this.I7;
                        int i3 = this.s4 - i;
                        if (r2dVar != null) {
                            animatorSet2.playTogether(ValueAnimator.ofInt(-i3), ValueAnimator.ofInt(-(this.s4 - i)));
                        } else {
                            animatorSet2.playTogether(ObjectAnimator.ofInt(this, px1Var, -i3), ObjectAnimator.ofInt(this.V0, px1Var, -(this.s4 - i)));
                            ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new qv1(this, (byte) 3));
                        }
                        animatorSet2.setDuration(300L);
                        animatorSet2.setInterpolator(k43.f);
                        animatorSet2.addListener(new v5(this, mv1Var, (byte) 9));
                        this.q4 = animatorSet2;
                        animatorSet2.start();
                    }
                } else {
                    if (this.I7 == null) {
                        this.V0.getLayoutParams().height = this.s4;
                    }
                    this.b2.requestLayout();
                    tx1 tx1Var = this.F0;
                    if (tx1Var != null) {
                        int selectionStart = tx1Var.getSelectionStart();
                        int selectionEnd = this.F0.getSelectionEnd();
                        tx1 tx1Var2 = this.F0;
                        tx1Var2.setText(tx1Var2.getText());
                        this.F0.setSelection(selectionStart, selectionEnd);
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    r2d r2dVar2 = this.I7;
                    int i4 = this.s4 - i;
                    if (r2dVar2 != null) {
                        animatorSet3.playTogether(ValueAnimator.ofInt(-i4), ValueAnimator.ofInt(-(this.s4 - i)));
                    } else {
                        animatorSet3.playTogether(ObjectAnimator.ofInt(this, px1Var, -i4), ObjectAnimator.ofInt(this.V0, px1Var, -(this.s4 - i)));
                        ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new qv1(this, (byte) 4));
                    }
                    animatorSet3.setDuration(300L);
                    animatorSet3.setInterpolator(k43.f);
                    animatorSet3.addListener(new pw1(this, b));
                    this.q4 = animatorSet3;
                    this.V0.setLayerType(2, null);
                    animatorSet3.start();
                }
                r2d r2dVar3 = this.I7;
                if (r2dVar3 != null) {
                    ((v2d) r2dVar3).h(L);
                }
            }
        }
    }

    public final void Q0() {
        A1();
        this.R3 = null;
        this.Q3 = null;
        this.S3 = null;
        this.T3 = null;
        qgc qgcVar = this.g1;
        if (qgcVar != null) {
            qgcVar.a(true);
        }
        x59 x59Var = this.i1;
        if (x59Var != null) {
            x59Var.setAlpha(1.0f);
            this.i1.setTranslationX(0.0f);
        }
        qgc qgcVar2 = this.g1;
        if (qgcVar2 != null) {
            qgcVar2.setAlpha(1.0f);
            this.g1.setTranslationX(0.0f);
        }
        tx1 tx1Var = this.F0;
        if (tx1Var != null) {
            tx1Var.setAlpha(1.0f);
            this.H = 0.0f;
            B2();
            this.F0.requestFocus();
        }
        rw1 rw1Var = this.f1;
        if (rw1Var != null) {
            rw1Var.setVisibility(8);
        }
        Y0();
    }

    public final void Q1(CharSequence charSequence, boolean z) {
        tx1 tx1Var = this.F0;
        if (tx1Var != null) {
            this.G3 = true;
            tx1Var.setText(charSequence);
            this.F0.g(true);
            tx1 tx1Var2 = this.F0;
            tx1Var2.setSelection(tx1Var2.getText().length());
            this.G3 = false;
            xy1 xy1Var = this.O3;
            if (xy1Var != null) {
                xy1Var.R0(this.F0.getText(), true, z);
            }
        }
    }

    public final void Q2() {
        if ((this.r1 == null && !o2f.a()) || this.N2 || this.l1) {
            return;
        }
        E0().u();
    }

    public final void R() {
        this.P7 = D(true);
        s0();
        float D = D(false);
        if (this.O7 != D) {
            this.O7 = D;
            f1(D);
        }
    }

    public void R0(boolean z) {
        if (this.v2 == null || !this.U3) {
            return;
        }
        fw1 fw1Var = this.W;
        if (fw1Var != null) {
            hl.r(fw1Var);
        }
        this.U3 = false;
        this.V3 = false;
        if (this.W3) {
            this.L7.a(false, z);
        }
    }

    public final void R1(boolean z, boolean z2) {
        this.w3 = z;
        P(z2);
    }

    public final void S() {
        float f = this.L7.e;
        if (this.v2 != null) {
            float measuredHeight = getMeasuredHeight() - this.K7.f;
            this.v2.setTranslationY(measuredHeight - (r4.getMeasuredHeight() * f));
            this.v2.setVisibility(f > 0.0f ? 0 : 8);
        }
        boolean z = f > 0.0f;
        if (this.h7 != z) {
            rw1 rw1Var = this.o2;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) rw1Var.getLayoutParams();
            int i = z ? this.v2.getLayoutParams().height : 0;
            layoutParams.topMargin = i;
            layoutParams.topMargin = hl.L(9.0f) + i;
            rw1Var.setLayoutParams(layoutParams);
            this.h7 = z;
            setMinimumHeight(hl.L(44.0f) + (z ? this.v2.getLayoutParams().height : 0));
            if (this.o4) {
                if (this.G2 == 0) {
                    a2(false, true, false, true);
                } else {
                    Q();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        if ((r3.getLineRight(0) + r0) >= ((r5.getWidth() - r5.getPaddingLeft()) - r5.getPaddingRight())) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean S0() {
        tx1 tx1Var = this.F0;
        if (tx1Var != null) {
            if (TextUtils.isEmpty(tx1Var.getCaption())) {
                tx1 tx1Var2 = this.F0;
                int L = hl.L(44.0f);
                Layout layout = tx1Var2.getLayout();
                if (layout != null) {
                    if (layout.getLineCount() > 0) {
                        if (layout.getLineCount() <= 1) {
                        }
                    }
                }
            }
        }
        return ob6.a0;
    }

    public void S1(float f, float f2, float f3, boolean z) {
        int L;
        float f4 = 1.0f - f3;
        float f5 = f * f4;
        float f6 = f2 * f4;
        this.r = (f3 * 0.5f) + 0.5f;
        this.s = f3;
        x2();
        float f7 = -f5;
        this.R0.setTranslationX(f7);
        if (this.F0 == null) {
            L = 0;
        } else {
            int L2 = hl.L(40.0f);
            c8a c8aVar = this.q0;
            L = L2 + ((c8aVar == null || c8aVar.getVisibility() != 0) ? 0 : hl.L(18.0f));
        }
        this.I = f7 - (L * f4);
        e29 e29Var = this.h1;
        if (e29Var != null) {
            e29Var.setTranslationX(f7);
        }
        RecordCircle recordCircle = this.C2;
        if (recordCircle != null) {
            recordCircle.setTranslationX(f6);
        }
        l lVar = this.D2;
        if (lVar != null) {
            lVar.setTranslationX(f6);
        }
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            linearLayout.setTranslationX(f7);
        }
        rw1 rw1Var = this.p2;
        rw1Var.setTranslationX(f6);
        this.z1 = f3;
        rw1Var.setAlpha((1.0f - this.y1) * f3);
        ImageView imageView = this.l2;
        if (imageView != null) {
            imageView.setAlpha(imageView.getScaleX() > 0.7f ? f3 : 0.0f);
        }
        boolean z2 = true;
        if (z && f3 != 1.0f) {
            z2 = false;
        }
        this.K = z2;
        this.E = f6;
        this.G = f3;
        s2();
        B2();
        float f8 = f5 * f4;
        if (this.J != f8) {
            this.J = f8;
            x59 x59Var = this.i1;
            if (x59Var != null) {
                x59Var.setTranslationX(f8);
                this.i1.invalidate();
            }
        }
        if (this.F0 != null) {
            float R1 = hl.R1(0.88f, 1.0f, f3);
            this.F0.setPivotX(0.0f);
            this.F0.setPivotY(r9.getMeasuredHeight() / 2.0f);
            this.F0.setScaleX(R1);
            this.F0.setScaleY(R1);
            this.F0.setHintRightOffset(hl.U1(f3, hl.L(60.0f), 0));
        }
    }

    public final void T() {
        zu1 zu1Var = this.E3;
        if (zu1Var != null) {
            ls6.d0(this.R).T1(zu1Var.a(), zu1Var.N5(zu1Var.F5), "", null, null, null, null, 0L, false, true, null);
        }
        setRichDraftPreview(null);
    }

    public final boolean T0() {
        return this.O2 != null;
    }

    public final void U() {
        hl.t1(this.F0);
    }

    public final boolean U0() {
        return this.X0 || this.Y0;
    }

    public final void U1(boolean z) {
        int i;
        if (this.T7 == z) {
            return;
        }
        this.T7 = z;
        this.g2.setVisibility(z ? 8 : 0);
        if (z) {
            hl.B2(this.x2);
            i = 4;
        } else {
            i = 1;
        }
        a aVar = this.a1;
        aVar.setImportantForAccessibility(i);
        aVar.invalidate();
        if (z) {
            this.c1.setVisibility(8);
        } else {
            z1();
            this.d0 = -1;
            NumberTextView numberTextView = this.c0;
            if (numberTextView != null) {
                numberTextView.setVisibility(8);
            }
        }
        z2(this.l7);
        P(false);
    }

    public final AnimatorSet U2() {
        a aVar = this.a1;
        if (aVar == null) {
            return null;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(aVar, (Property<a, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(aVar, (Property<a, Float>) View.SCALE_X, 0.6f, 1.0f), ObjectAnimator.ofFloat(aVar, (Property<a, Float>) View.SCALE_Y, 0.6f, 1.0f));
        animatorSet.setStartDelay(60L);
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(k43.g);
        return animatorSet;
    }

    public final void V() {
        if (this.m2 != null) {
            return;
        }
        vw1 vw1Var = new vw1(this, getContext(), (byte) 2);
        this.m2 = vw1Var;
        ya9 ya9Var = new ya9(getContext());
        this.J2 = ya9Var;
        vw1Var.setImageDrawable(ya9Var);
        ya9 ya9Var2 = this.J2;
        int i = aob.Nl;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        vnb vnbVar = this.K4;
        yob.x(this, ya9Var2, i, vnbVar, mode);
        this.J2.a(R.drawable.input_bot2, false);
        this.m2.setScaleType(ImageView.ScaleType.CENTER);
        vw1 vw1Var2 = this.m2;
        int i2 = aob.i6;
        yob.R(vw1Var2, aob.f0(J0(i2), 1, -1), null, yob.M(i2), vnbVar);
        this.m2.setVisibility(8);
        hl.T3(this.m2, false, 0.1f, true, false);
        this.e2.addView(this.m2, 0, tre.o(44, 44));
        this.m2.setOnClickListener(new pv1(this, (byte) 19));
    }

    public final boolean V0(View view) {
        return view == this.w2 || view == this.V0;
    }

    public final void V1(boolean z) {
        ValueAnimator valueAnimator = this.P1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.P1 = null;
        }
        if (z) {
            float f = this.O1;
            if (f != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
                this.P1 = ofFloat;
                ofFloat.addUpdateListener(new qv1(this, (byte) 1));
                this.P1.setDuration(200L);
                this.P1.setInterpolator(k43.g);
                this.P1.start();
                return;
            }
        }
        this.O1 = 0.0f;
        z92 G0 = G0();
        if (G0 != null) {
            G0.setInputBubbleExtraAlpha(1.0f);
        }
        rw1 rw1Var = this.f1;
        if (rw1Var != null) {
            rw1Var.invalidate();
        }
    }

    public final void W() {
        if (this.m0 == null) {
            ep0 ep0Var = new ep0(getContext());
            this.m0 = ep0Var;
            ep0Var.setOnClickListener(new pv1(this, (byte) 10));
            this.n2.addView(this.m0, tre.d(-2, 32.0f, 83, 8.0f, 6.0f, 8.0f, 6.0f));
            hl.T3(this.m0, false, 1.0f, true, false);
            ep0 ep0Var2 = this.m0;
            if (!ep0Var2.f) {
                ep0Var2.f = true;
                ep0Var2.h = 1.0f;
                ep0Var2.requestLayout();
                ep0Var2.invalidate();
            }
        }
    }

    public final boolean W0() {
        return this.u3 && ChatActivityEnterView.this.j5;
    }

    public final void W1(CharSequence charSequence, boolean z) {
        this.e = charSequence;
        this.f = null;
        y2(z);
    }

    public final void X() {
        if (this.c0 != null) {
            return;
        }
        NumberTextView numberTextView = new NumberTextView(getContext());
        this.c0 = numberTextView;
        numberTextView.setVisibility(8);
        this.c0.setTextSize(15);
        this.c0.setTextColor(J0(aob.y6));
        this.c0.setTypeface(hl.o());
        this.c0.setCenterAlign(true);
        addView(this.c0, Math.min(2, getChildCount()), tre.d(44, 20.0f, 85, 3.0f, 0.0f, 0.0f, 44.0f));
    }

    public final boolean X0() {
        if (this.u3) {
            return true;
        }
        AnimatorSet animatorSet = this.i3;
        return (animatorSet == null || !animatorSet.isRunning() || this.Z2) ? false : true;
    }

    public final void X1(boolean z, boolean z2) {
        String M0;
        zw1 zw1Var = this.c1;
        if (zw1Var == null) {
            return;
        }
        this.d1 = z;
        if (z2) {
            SharedPreferences e1 = uc7.e1();
            boolean z3 = false;
            if (wf3.y(this.F3)) {
                TLRPC.Chat M02 = uc7.s1(this.S.a).M0(Long.valueOf(-this.F3));
                if (xc2.T(M02) && !M02.megagroup) {
                    z3 = true;
                }
            }
            e1.edit().putBoolean(z3 ? "currentModeVideoChannel" : "currentModeVideo", z).apply();
        }
        zw1Var.j(this.d1 ? gz1.b : gz1.a, z2);
        zw1Var.setContentDescription(ob6.M0(this.d1 ? 2131754731 : 2131754729, null));
        if (j0()) {
            M0 = ob6.M0(2131754870, null);
        } else {
            M0 = ob6.M0(this.d1 ? 2131754731 : 2131754729, null);
        }
        this.a1.setContentDescription(M0);
        l0();
        zy1 zy1Var = this.a2;
        if (zy1Var != null) {
            zy1Var.d(j0());
        }
        zw1Var.sendAccessibilityEvent(8);
    }

    public final void Y(boolean z) {
        if (this.u2 != null) {
            return;
        }
        bx1 bx1Var = new bx1(this, getContext(), this.K4);
        this.u2 = bx1Var;
        bx1Var.setContentDescription(ob6.M0(2131751239, null));
        if (z) {
            iye.a(this.u2);
        }
        this.o2.addView(this.u2, tre.e(44, 44, 85));
    }

    public final void Y1(r47 r47Var, ou1 ou1Var, r47 r47Var2) {
        r47 r47Var3;
        zu1 zu1Var = this.E3;
        boolean z = (zu1Var == null || !zu1Var.V7() || this.J3 == r47Var2) ? false : true;
        if (r47Var != null) {
            if (this.L3 == null && (r47Var3 = this.b3) != this.I3) {
                this.L3 = r47Var3;
            }
            this.I3 = r47Var;
            this.K3 = ou1Var;
            this.J3 = r47Var2;
            if (zu1Var == null || !zu1Var.x4 || zu1Var.m4 != r47Var) {
                K1(r47Var, true, true);
            }
        } else if (this.I3 == this.b3) {
            this.I3 = null;
            this.J3 = null;
            this.K3 = null;
            K1(this.L3, true, false);
            this.L3 = null;
        } else {
            this.I3 = null;
            this.K3 = null;
            this.J3 = null;
        }
        M(true);
        xy1 xy1Var = this.O3;
        TL_stories.StoryItem F0 = xy1Var != null ? xy1Var.F0() : null;
        MediaController z2 = MediaController.z();
        r47 threadMessage = getThreadMessage();
        z2.r1 = r47Var;
        z2.s1 = threadMessage;
        z2.t1 = F0;
        y2(z);
    }

    public final void Z() {
        my1 my1Var = this.V0;
        if (my1Var != null && my1Var.d1 != yac.t0) {
            this.c2.removeView(my1Var);
            my1Var = null;
            this.V0 = null;
        }
        if (my1Var != null) {
            return;
        }
        my1 my1Var2 = new my1(this, this.E3, this.x3, getContext(), this.S2, this.b2, this.i6, this.K4, this.U0, this.I7 != null);
        this.V0 = my1Var2;
        my1Var2.w0 = true;
        if (!this.i6) {
            my1Var2.updateColors();
        }
        this.V0.H(true, this.y3, this.z3, true);
        this.V0.setVisibility(8);
        this.V0.setShowing(false);
        if (this.I7 != null) {
            my1 my1Var3 = this.V0;
            my1Var3.x0 = false;
            my1Var3.setShouldDrawBackground(false);
            this.V0.W0 = true;
        }
        this.V0.setDelegate(new qy1(this));
        this.V0.setDragListener(new cdc(this));
        my1 my1Var4 = this.V0;
        if (my1Var4 != null) {
            my1Var4.J(-this.F3, !this.A0, !this.b);
        }
        x();
        J();
    }

    public final boolean Z0() {
        return c() || this.N7.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Z1(int i, boolean z) {
        byte b = 0;
        boolean z2 = i != 0;
        if (z2 != (this.G2 != 0)) {
            ValueAnimator valueAnimator = this.w0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.w0.cancel();
            }
            if (z) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x0, z2 ? 1.0f : 0.0f);
                this.w0 = ofFloat;
                ofFloat.addUpdateListener(new qv1(this, (byte) 5));
                this.w0.addListener(new ow1(this, z2, b));
                this.w0.setDuration(220L);
                this.w0.setInterpolator(k43.f);
                this.w0.start();
            } else {
                this.x0 = z2 ? 1.0f : 0.0f;
                my1 my1Var = this.V0;
                if (my1Var != null) {
                    my1Var.Y();
                }
            }
        }
        this.G2 = i;
    }

    @Override // xeb
    public final boolean a() {
        bn3 bn3Var = this.j1;
        return bn3Var != null && bn3Var.s();
    }

    public final void a0() {
        if (this.T0 != null) {
            return;
        }
        vw1 vw1Var = new vw1(this, getContext(), (byte) 3);
        this.T0 = vw1Var;
        vw1Var.setScaleType(ImageView.ScaleType.CENTER);
        vw1 vw1Var2 = this.T0;
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(J0(aob.Nl), false);
        this.u4 = animatedArrowDrawable;
        vw1Var2.setImageDrawable(animatedArrowDrawable);
        this.T0.setVisibility(8);
        this.T0.setScaleX(0.1f);
        this.T0.setScaleY(0.1f);
        this.T0.setAlpha(0.0f);
        vw1 vw1Var3 = this.T0;
        int i = aob.i6;
        yob.R(vw1Var3, aob.f0(J0(i), 1, -1), null, yob.M(i), this.K4);
        this.p2.addView(this.T0, tre.e(44, 44, 85));
        this.T0.setOnClickListener(new pv1(this, (byte) 9));
        this.T0.setContentDescription(ob6.M0(2131754879, "AccDescrExpandPanel"));
    }

    public final boolean a1() {
        View view = this.v2;
        return view != null && view.getVisibility() == 0;
    }

    public final void a2(boolean z, boolean z2, boolean z3, boolean z4) {
        final byte b = 1;
        hb hbVar = this.V;
        if ((hbVar != null && hbVar.f) || this.a4 || this.V0 == null) {
            return;
        }
        if (z3 || this.o4 != z) {
            this.o4 = z;
            xy1 xy1Var = this.O3;
            if (xy1Var != null) {
                xy1Var.Z0();
            }
            Point point = hl.q;
            final int i = point.x > point.y ? this.n3 : this.m3;
            AnimatorSet animatorSet = this.q4;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.q4 = null;
            }
            boolean z5 = this.o4;
            byte b2 = 3;
            pn pnVar = this.z4;
            byte b3 = 2;
            px1 px1Var = this.i4;
            final byte b4 = 0;
            wma wmaVar = this.b2;
            if (z5) {
                if (z4) {
                    jn7.e().k(jn7.j1, 1);
                }
                int height = wmaVar.getHeight();
                this.d2 = height;
                int L = ((((height - hl.m) - hl.n) - hl.L(6.0f)) - org.telegram.ui.ActionBar.a.getCurrentActionBarHeight()) - getHeight();
                this.s4 = L;
                if (this.G2 == 2) {
                    this.s4 = Math.min(L, hl.L(175.0f) + i);
                }
                if (this.I7 == null) {
                    this.V0.getLayoutParams().height = this.s4;
                }
                wmaVar.requestLayout();
                if (this.i6) {
                    wmaVar.setForeground(new ya1(this));
                }
                tx1 tx1Var = this.F0;
                if (tx1Var != null) {
                    int selectionStart = tx1Var.getSelectionStart();
                    int selectionEnd = this.F0.getSelectionEnd();
                    tx1 tx1Var2 = this.F0;
                    tx1Var2.setText(tx1Var2.getText());
                    this.F0.setSelection(selectionStart, selectionEnd);
                }
                if (z2) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    r2d r2dVar = this.I7;
                    int i2 = this.s4 - i;
                    if (r2dVar != null) {
                        animatorSet2.playTogether(ValueAnimator.ofInt(-i2), ValueAnimator.ofInt(-(this.s4 - i)), ObjectAnimator.ofFloat(this.u4, "animationProgress", 1.0f));
                    } else {
                        animatorSet2.playTogether(ObjectAnimator.ofInt(this, px1Var, -i2), ObjectAnimator.ofInt(this.V0, px1Var, -(this.s4 - i)), ObjectAnimator.ofFloat(this.u4, "animationProgress", 1.0f));
                    }
                    animatorSet2.setDuration(300L);
                    animatorSet2.setInterpolator(k43.f);
                    if (this.I7 == null) {
                        ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: dw1
                            public final /* synthetic */ ChatActivityEnterView b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                byte b5 = b4;
                                int i3 = i;
                                ChatActivityEnterView chatActivityEnterView = this.b;
                                switch (b5) {
                                    case 0:
                                        int i4 = ChatActivityEnterView.X7;
                                        chatActivityEnterView.r4 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.s4 - i3)));
                                        chatActivityEnterView.b2.invalidate();
                                        break;
                                    default:
                                        int i5 = ChatActivityEnterView.X7;
                                        chatActivityEnterView.r4 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.s4 - i3));
                                        chatActivityEnterView.b2.invalidate();
                                        break;
                                }
                            }
                        });
                    }
                    animatorSet2.addListener(new pw1(this, b3));
                    this.q4 = animatorSet2;
                    this.V0.setLayerType(2, null);
                    pnVar.d();
                    this.r4 = 0.0f;
                    wmaVar.invalidate();
                    animatorSet2.start();
                } else {
                    this.r4 = 1.0f;
                    if (this.I7 == null) {
                        setTranslationY(-(this.s4 - i));
                        this.V0.setTranslationY(-(this.s4 - i));
                    }
                    AnimatedArrowDrawable animatedArrowDrawable = this.u4;
                    if (animatedArrowDrawable != null) {
                        animatedArrowDrawable.setAnimationProgress(1.0f);
                    }
                }
                r2d r2dVar2 = this.I7;
                if (r2dVar2 != null) {
                    ((v2d) r2dVar2).h(this.s4);
                }
            } else {
                if (z4) {
                    jn7.e().k(jn7.k1, 1);
                }
                if (z2) {
                    this.p4 = true;
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    if (this.I7 != null) {
                        animatorSet3.playTogether(ValueAnimator.ofInt(0), ValueAnimator.ofInt(0), ObjectAnimator.ofFloat(this.u4, "animationProgress", 0.0f));
                    } else {
                        animatorSet3.playTogether(ObjectAnimator.ofInt(this, px1Var, 0), ObjectAnimator.ofInt(this.V0, px1Var, 0), ObjectAnimator.ofFloat(this.u4, "animationProgress", 0.0f));
                    }
                    animatorSet3.setDuration(300L);
                    animatorSet3.setInterpolator(k43.f);
                    if (this.I7 == null) {
                        ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: dw1
                            public final /* synthetic */ ChatActivityEnterView b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                byte b5 = b;
                                int i3 = i;
                                ChatActivityEnterView chatActivityEnterView = this.b;
                                switch (b5) {
                                    case 0:
                                        int i4 = ChatActivityEnterView.X7;
                                        chatActivityEnterView.r4 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.s4 - i3)));
                                        chatActivityEnterView.b2.invalidate();
                                        break;
                                    default:
                                        int i5 = ChatActivityEnterView.X7;
                                        chatActivityEnterView.r4 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.s4 - i3));
                                        chatActivityEnterView.b2.invalidate();
                                        break;
                                }
                            }
                        });
                    }
                    animatorSet3.addListener(new dn(this, i, b2));
                    this.r4 = 1.0f;
                    wmaVar.invalidate();
                    this.q4 = animatorSet3;
                    this.V0.setLayerType(2, null);
                    pnVar.d();
                    animatorSet3.start();
                } else {
                    this.r4 = 0.0f;
                    if (this.I7 == null) {
                        setTranslationY(0.0f);
                        this.V0.setTranslationY(0.0f);
                        this.V0.getLayoutParams().height = i;
                    }
                    wmaVar.requestLayout();
                    wmaVar.setForeground(null);
                    wmaVar.setWillNotDraw(false);
                    AnimatedArrowDrawable animatedArrowDrawable2 = this.u4;
                    if (animatedArrowDrawable2 != null) {
                        animatedArrowDrawable2.setAnimationProgress(0.0f);
                    }
                }
                r2d r2dVar3 = this.I7;
                if (r2dVar3 != null) {
                    ((v2d) r2dVar3).h(i);
                }
            }
            vw1 vw1Var = this.T0;
            if (vw1Var != null) {
                if (this.o4) {
                    vw1Var.setContentDescription(ob6.M0(2131754889, "AccDescrCollapsePanel"));
                } else {
                    vw1Var.setContentDescription(ob6.M0(2131754879, "AccDescrExpandPanel"));
                }
            }
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.Je));
        hashSet.add(Integer.valueOf(aob.Vf));
        hashSet.add(Integer.valueOf(aob.p7));
        hashSet.add(Integer.valueOf(aob.y6));
        hashSet.add(Integer.valueOf(aob.Tf));
        hashSet.add(Integer.valueOf(aob.Sf));
        hashSet.add(Integer.valueOf(aob.Pe));
    }

    @Override // p4b
    public final boolean b() {
        zu1 zu1Var = this.E3;
        return zu1Var != null && zu1Var.M4();
    }

    public final void b0() {
        if (this.F0 != null) {
            return;
        }
        Context context = getContext();
        vnb vnbVar = this.K4;
        tx1 tx1Var = new tx1(this, context, vnbVar);
        this.F0 = tx1Var;
        int i = Build.VERSION.SDK_INT;
        byte b = 0;
        if (i >= 28) {
            tx1Var.setFallbackLineSpacing(false);
        }
        if (i >= 35) {
            this.F0.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        this.F0.setDelegate(new ew1(this));
        zu1 zu1Var = this.E3;
        if (zu1Var == null || zu1Var.getParentLayout() == null || !((ActionBarLayout) zu1Var.getParentLayout()).b) {
            this.F0.setWindowView(this.D3.getWindow().getDecorView());
        } else {
            this.F0.setWindowView(zu1Var.getParentLayout().getWindow().getDecorView());
        }
        TLRPC.EncryptedChat encryptedChat = zu1Var != null ? zu1Var.h : null;
        this.F0.setAllowTextEntitiesIntersection(p2());
        String string = Settings.Secure.getString(getContext().getContentResolver(), "default_input_method");
        int i2 = ((string == null || !string.startsWith("com.samsung")) && encryptedChat != null) ? 285212672 : TLObject.FLAG_28;
        this.F0.setIncludeFontPadding(false);
        this.F0.setImeOptions(i2);
        tx1 tx1Var2 = this.F0;
        int inputType = tx1Var2.getInputType() | 147456;
        this.a = inputType;
        tx1Var2.setInputType(inputType);
        y2(false);
        this.F0.setSingleLine(false);
        this.F0.setMaxLines(6);
        this.F0.setTextSize(1, 18.0f);
        this.F0.setGravity(80);
        this.F0.setPadding(0, hl.L(9.0f), 0, hl.L(10.0f));
        this.F0.setBackgroundDrawable(null);
        yob.X(this.F0, aob.Le, vnbVar);
        yob.G(this.F0, aob.Yc, vnbVar);
        yob.C(this.F0, aob.lg, vnbVar);
        tx1 tx1Var3 = this.F0;
        int i3 = aob.Me;
        yob.A(tx1Var3, i3, vnbVar);
        yob.D(this.F0, i3, vnbVar);
        yob.v(this.F0, aob.Ne, vnbVar);
        yob.y(this.F0, aob.mg, vnbVar);
        tx1 tx1Var4 = this.F0;
        boolean z = this.L4;
        FrameLayout.LayoutParams d = tre.d(-1, -2.0f, 80, 52.0f, 0.0f, z ? 50.0f : 2.0f, 1.5f);
        rw1 rw1Var = this.n2;
        rw1Var.addView(tx1Var4, 1, d);
        zj9 zj9Var = new zj9(this.R, vnbVar, getContext());
        this.r2 = zj9Var;
        zj9Var.setAllowActions(false);
        this.r2.setMaxHeight(hl.L(150.0f));
        this.r2.setMinHeight(hl.L(88.0f));
        this.r2.setVisibility(8);
        this.r2.setPadding(hl.L(8.0f), hl.L(9.0f), hl.L(8.0f), hl.L(10.0f));
        this.r2.setOnClickListener(new pv1(this, (byte) 13));
        rw1Var.addView(this.r2, 2, tre.d(-1, -2.0f, 80, 44.0f, 0.0f, (z ? 50 : 2) - 8, 1.5f));
        this.F0.setOnKeyListener(new ux1(this));
        this.F0.setOnEditorActionListener(new vx1(this, b));
        this.F0.addTextChangedListener(new wx1(this));
        this.F0.addTextChangedListener(new xx1(this));
        this.F0.addTextChangedListener(new gi());
        this.F0.setEnabled(this.s6);
        ArrayList arrayList = this.r6;
        if (arrayList != null) {
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                this.F0.addTextChangedListener((TextWatcher) obj);
            }
            this.r6.clear();
        }
        y2(false);
        I2(zu1Var != null && zu1Var.getFragmentBeginToShow());
        if (zu1Var != null) {
            zu1Var.H4(false, false);
        }
        z2(this.l7);
    }

    public final void b1(TLRPC.Document document, String str, n47 n47Var, boolean z, int i, int i2, Object obj, Long l, boolean z2) {
        if (this.H0 > 0 && !c()) {
            xy1 xy1Var = this.O3;
            if (xy1Var != null) {
                cz1 cz1Var = this.G0;
                xy1Var.b1(cz1Var, ((ema) cz1Var.c).getText(), true);
                return;
            }
            return;
        }
        if (this.G2 != 0) {
            Z1(0, true);
            this.V0.r(true);
            this.V0.z();
        }
        a2(false, true, false, true);
        xy1 xy1Var2 = this.O3;
        TL_stories.StoryItem F0 = xy1Var2 != null ? xy1Var2.F0() : null;
        r7a B = r7a.B(this.R);
        long j = this.F3;
        r47 r47Var = this.I3;
        r47 threadMessage = getThreadMessage();
        ou1 ou1Var = this.K3;
        boolean z3 = obj instanceof TLRPC.TL_messages_stickerSet;
        zu1 zu1Var = this.E3;
        B.t0(document, str, j, r47Var, threadMessage, F0, ou1Var, n47Var, z, i, i2, z3, obj, zu1Var != null ? zu1Var.X6() : null, l.longValue(), getSendMonoForumPeerId(), getSendMessageSuggestionParams());
        xy1 xy1Var3 = this.O3;
        if (xy1Var3 != null) {
            xy1Var3.x(null, true, i, 0, 0L);
        }
        if (z2) {
            setFieldText("");
        }
        ls6.d0(this.R).d(0, obj, document, (int) (System.currentTimeMillis() / 1000), false);
    }

    public final void b2(boolean z, boolean z2) {
        float f;
        float f2;
        if (this.m5 == z && z2) {
            return;
        }
        ImageView imageView = this.l2;
        byte b = 1;
        if (imageView == null) {
            if (!z && !this.T7) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = new ImageView(getContext());
                this.l2 = imageView2;
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                ImageView imageView3 = this.l2;
                int i = aob.Nl;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                vnb vnbVar = this.K4;
                yob.s(imageView3, i, vnbVar, mode);
                this.l2.setImageResource(R.drawable.input_suggest_paid_24);
                ImageView imageView4 = this.l2;
                int i2 = aob.i6;
                yob.R(imageView4, aob.f0(J0(i2), 1, -1), null, yob.M(i2), vnbVar);
                if (this.T7) {
                    this.l2.setTranslationX(hl.L(42.0f));
                    this.o2.addView(this.l2, tre.d(44, 44.0f, 85, 0.0f, 0.0f, 50.0f, 0.0f));
                } else {
                    this.e2.addView(this.l2, 0, tre.o(44, 44));
                }
                this.l2.setOnClickListener(new pv1(this, b));
                this.l2.setContentDescription(ob6.M0(2131754917, null));
            }
        }
        boolean z3 = this.m5 != z;
        this.m5 = z;
        if (z) {
            f2 = 1.0f;
            f = 1.0f;
        } else {
            f = 0.6f;
            f2 = 0.0f;
        }
        this.l2.setEnabled(z);
        this.l2.setClickable(z);
        ValueAnimator valueAnimator = this.n5;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.n5 = null;
        }
        if (z2) {
            if (this.T7) {
                this.l2.setVisibility(0);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.l2.getAlpha(), f2);
            this.n5 = ofFloat;
            ofFloat.addUpdateListener(new qv1(this, (byte) 10));
            this.n5.addListener(new ow1(this, z, b));
            this.n5.setDuration(220L);
            this.n5.setInterpolator(k43.h);
            this.n5.start();
        } else {
            this.l2.setScaleX(f);
            this.l2.setScaleY(f);
            this.l2.setAlpha(f2);
            if (this.T7) {
                this.l2.setVisibility(z ? 0 : 8);
            }
        }
        z2(this.l7);
        if (z3) {
            P(true);
        }
    }

    @Override // p4b
    public final boolean c() {
        zu1 zu1Var = this.E3;
        return zu1Var != null && zu1Var.X7();
    }

    public final void c0() {
        if (this.f1 != null) {
            return;
        }
        rw1 rw1Var = new rw1(this, getContext(), (byte) 3);
        this.f1 = rw1Var;
        byte b = 0;
        rw1Var.setVisibility(this.Q3 == null ? 8 : 0);
        this.f1.setFocusable(true);
        this.f1.setFocusableInTouchMode(true);
        this.f1.setClickable(true);
        this.n2.addView(this.f1, tre.e(-1, 44, 80));
        e29 e29Var = new e29(getContext());
        this.h1 = e29Var;
        e29Var.setScaleType(ImageView.ScaleType.CENTER);
        this.h1.f(R.raw.chat_audio_record_delete_2, 28, 28, null);
        this.h1.getAnimatedDrawable().p0 = true;
        this.E5 = this.h1.getAnimatedDrawable();
        E2();
        this.h1.setContentDescription(ob6.M0(2131751563, "Delete"));
        e29 e29Var2 = this.h1;
        int i = aob.i6;
        hf0 f0 = aob.f0(J0(i), 1, -1);
        uob M = yob.M(i);
        vnb vnbVar = this.K4;
        yob.R(e29Var2, f0, null, M, vnbVar);
        this.f1.addView(this.h1, tre.c(44.0f, 44));
        this.h1.setOnClickListener(new pv1(this, (byte) 18));
        qgc qgcVar = new qgc(getContext());
        this.g1 = qgcVar;
        qgcVar.setVisibility(4);
        qgc qgcVar2 = this.g1;
        qgcVar2.T = !this.i6;
        qgcVar2.setRoundFrames(true);
        this.g1.setDelegate(new ex1(this, b));
        this.f1.addView(this.g1, tre.d(-1, -1.0f, 19, 56.0f, 0.0f, 8.0f, 0.0f));
        Context context = getContext();
        ogc ogcVar = new ogc(context);
        TextPaint textPaint = new TextPaint(1);
        ogcVar.d = textPaint;
        ogcVar.e = -1L;
        textPaint.setTextSize(hl.L(14.0f));
        ogcVar.b = context.getDrawable(R.drawable.tooltip_arrow);
        ogcVar.a = aob.b0(hl.L(5.0f), aob.w0(null, aob.hg, false));
        ogcVar.b();
        ogcVar.setTime(0);
        this.g1.setTimeHintView(ogcVar);
        this.b2.addView(ogcVar, tre.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 52.0f));
        x59 x59Var = new x59(getContext(), vnbVar);
        this.i1 = x59Var;
        this.f1.addView(x59Var, tre.d(-1, 32.0f, 19, 44.0f, 0.0f, 4.0f, 0.0f));
        z2(this.l7);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c1(TL_keyboard.KeyboardButton keyboardButton) {
        boolean z;
        r47 r47Var;
        r47 r47Var2;
        boolean u0;
        r47 r47Var3;
        xy1 xy1Var;
        zu1 zu1Var;
        boolean z2 = this.I3 != null && (zu1Var = this.E3) != null && zu1Var.x4 && zu1Var.c() == ((long) this.I3.e1());
        if (this.I3 == null || z2) {
            int i = this.R;
            long j = this.F3;
            if (j > 0) {
                z = lbc.w(uc7.s1(i).X1(Long.valueOf(j)));
            } else {
                uc7.s1(i).M0(Long.valueOf(-j));
                z = false;
            }
            if (!z) {
                r47Var = wf3.y(this.F3) ? this.b3 : null;
                r47Var2 = this.I3;
                if (r47Var2 != null || z2) {
                    r47Var2 = this.b3;
                }
                u0 = u0(keyboardButton, r47Var, r47Var2, null);
                if (this.I3 != null || z2) {
                    r47Var3 = this.b3;
                    if (r47Var3 != null && r47Var3.k.reply_markup.single_use) {
                        if (u0) {
                            i2(0, 0, true, true);
                        } else {
                            p1();
                        }
                        uc7.s1(this.R).X3.edit().putInt("answered_" + getTopicKeyString(), this.b3.e1()).commit();
                    }
                } else {
                    p1();
                    K1(this.L3, true, false);
                }
                xy1Var = this.O3;
                if (xy1Var == null) {
                    xy1Var.x(null, true, 0, 0, 0L);
                    return;
                }
                return;
            }
        }
        r47Var = this.I3;
        r47Var2 = this.I3;
        if (r47Var2 != null) {
        }
        r47Var2 = this.b3;
        u0 = u0(keyboardButton, r47Var, r47Var2, null);
        if (this.I3 != null) {
        }
        r47Var3 = this.b3;
        if (r47Var3 != null) {
            if (u0) {
            }
            uc7.s1(this.R).X3.edit().putInt("answered_" + getTopicKeyString(), this.b3.e1()).commit();
        }
        xy1Var = this.O3;
        if (xy1Var == null) {
        }
    }

    public final void c2(boolean z, boolean z2) {
        boc bocVar;
        if (!this.J1 || (bocVar = this.S1) == null) {
            this.T1 = false;
            return;
        }
        if (this.T1 == z && z2) {
            return;
        }
        this.T1 = z;
        x59 x59Var = this.i1;
        if (x59Var != null) {
            bocVar.c(Math.round(Math.max(1.0f, (x59Var.w - x59Var.s) * x59Var.r)));
        }
        if (z) {
            hl.r(this.W1);
        } else if (this.S1.c.hasFocus()) {
            hl.t1(this.S1.c);
            this.S1.c.clearFocus();
        }
        this.S1.setCollapsing(!z);
        this.S1.animate().cancel();
        this.S1.setAlpha(1.0f);
        this.S1.setVisibility(0);
        ValueAnimator valueAnimator = this.V1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.V1 = null;
        }
        float f = z ? 1.0f : 0.0f;
        if (z2) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U1, f);
            this.V1 = ofFloat;
            ofFloat.addUpdateListener(new qv1(this, (byte) 11));
            this.V1.setDuration(360L);
            this.V1.setInterpolator(k43.h);
            this.V1.start();
        } else {
            v(f);
        }
        M2();
        l lVar = this.D2;
        if (lVar != null) {
            lVar.invalidate();
        }
    }

    @Override // xeb
    public final void d(TextWatcher textWatcher) {
        tx1 tx1Var = this.F0;
        if (tx1Var != null) {
            tx1Var.addTextChangedListener(textWatcher);
            return;
        }
        ArrayList arrayList = this.r6;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.r6 = arrayList;
        }
        arrayList.add(textWatcher);
    }

    public final ValueAnimator d0() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        int i;
        int i2;
        int i3;
        int i4;
        float f6;
        float f7;
        float f8;
        float f9;
        float S2;
        int i5;
        int i6;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float z;
        int i7;
        if (this.a2 == null || this.C2 == null || this.D1 || !i86.e(360928) || !this.C2.isShown()) {
            return null;
        }
        RecordCircle recordCircle = this.C2;
        if (recordCircle.O || recordCircle.getWidth() <= 0) {
            return null;
        }
        if (this.a2.getVisibility() != 0) {
            this.a2.setVisibility(0);
        }
        this.a2.animate().cancel();
        this.a2.setScaleX(1.0f);
        this.a2.setScaleY(1.0f);
        this.a2.getLocationInWindow(new int[2]);
        this.C2.getLocationInWindow(new int[2]);
        float width = (this.a2.getWidth() / 2.0f) + (r5[0] - r6[0]);
        float measuredHeight = ((this.a2.getMeasuredHeight() / 2.0f) - hl.L(3.0f)) + (r5[1] - r6[1]);
        RecordCircle recordCircle2 = this.C2;
        float f15 = recordCircle2.K;
        float f16 = recordCircle2.L;
        float max = (Math.max(recordCircle2.M, hl.L(10.0f)) * 1.5f) + hl.L(6.0f);
        int ceil = (int) Math.ceil(max * 2.0f);
        try {
            Bitmap createBitmap = Bitmap.createBitmap(ceil, ceil, Bitmap.Config.ARGB_8888);
            float f17 = f15 - max;
            float f18 = f16 - max;
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(-f17, -f18);
            this.C2.draw(canvas);
            int[] iArr = new int[ceil * ceil];
            createBitmap.getPixels(iArr, 0, ceil, 0, 0, ceil, ceil);
            int i8 = ceil;
            int max2 = Math.max(1, Math.round(hl.p * 0.75f));
            int i9 = 0;
            for (int i10 = 0; i10 < i8; i10 += max2) {
                for (int i11 = 0; i11 < i8; i11 += max2) {
                    if ((iArr[(i10 * i8) + i11] >>> 24) > 24) {
                        i9++;
                    }
                }
            }
            if (i9 == 0) {
                createBitmap.recycle();
                return null;
            }
            int J0 = J0(aob.Uf) | (-16777216);
            float[] fArr = {-0.24f, -0.17f, -0.11f, -0.06f, -0.02f, 0.03f, 0.08f, 0.13f};
            int[] iArr2 = new int[8];
            int i12 = 0;
            for (int i13 = 8; i12 < i13; i13 = 8) {
                float f19 = fArr[i12];
                if (f19 < 0.0f) {
                    f19 = -f19;
                    i7 = -16777216;
                } else {
                    i7 = -1;
                }
                iArr2[i12] = vm2.f(f19, J0, i7);
                i12++;
            }
            int[] iArr3 = new int[i9];
            int i14 = 0;
            int i15 = 0;
            while (i14 < i8) {
                int i16 = 0;
                while (i16 < i8) {
                    int i17 = iArr[(i14 * i8) + i16];
                    int[] iArr4 = iArr3;
                    int i18 = i14;
                    if ((i17 >>> 24) > 24) {
                        iArr4[i15] = T2(i17);
                        i15++;
                    }
                    i16 += max2;
                    iArr3 = iArr4;
                    i14 = i18;
                }
                i14 += max2;
            }
            int[] iArr5 = iArr3;
            Arrays.sort(iArr5);
            int[] iArr6 = new int[8];
            int i19 = 0;
            for (int i20 = 8; i19 < i20; i20 = i20) {
                int i21 = i19 + 1;
                iArr6[i19] = iArr5[Math.min(i9 - 1, (i21 * i9) / 8)];
                i19 = i21;
            }
            mva mvaVar = this.L5;
            if (mvaVar == null) {
                mvaVar = new mva(2400);
                this.L5 = mvaVar;
            }
            mvaVar.a();
            this.L5.e(false);
            mva mvaVar2 = this.L5;
            mvaVar2.u = iArr2;
            mvaVar2.t = true;
            mvaVar2.v = aob.I.o() ? 0.12f : 0.0f;
            float f20 = width;
            this.L5.U = 0L;
            float f21 = -hl.L(2400.0f);
            if (SystemClock.uptimeMillis() - this.I5 < 80) {
                f = this.K5;
                f2 = 0.0f;
            } else {
                f = 0.0f;
                f2 = 0.0f;
            }
            float max3 = Math.max(f21, Math.min(f2, f));
            boolean z2 = max3 < ((float) (-hl.L(150.0f)));
            this.M5 = z2 ? max3 : 0.0f;
            this.N5 = AnimationUtils.currentAnimationTimeMillis();
            float f22 = z2 ? 0.12f : 0.2f;
            mva mvaVar3 = this.L5;
            mvaVar3.T = 0.0f;
            mvaVar3.S = 0.0f;
            float f23 = i9;
            float min = Math.min(1.0f, 1400.0f / f23);
            float f24 = hl.p;
            this.R5 = f17;
            boolean z3 = z2;
            this.S5 = i8 + f17;
            float[] fArr2 = new float[2400];
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            while (true) {
                f3 = f20;
                if (i22 >= i8) {
                    break;
                }
                int i25 = 2400;
                float f25 = 0.3f;
                if (i23 >= 2400) {
                    break;
                }
                float f26 = f15;
                int i26 = 0;
                while (i26 < i8 && i23 < i25) {
                    int i27 = iArr[(i22 * i8) + i26];
                    int i28 = i23;
                    int i29 = i27 >>> 24;
                    if (i29 <= 24) {
                        i6 = i22;
                        f13 = f18;
                    } else {
                        int i30 = i24 + 1;
                        int i31 = i30 * 7;
                        if (S2(i31 + 3) > (((i29 * 0.7f) / 255.0f) + f25) * min) {
                            i6 = i22;
                            f13 = f18;
                            i24 = i30;
                        } else {
                            float S22 = S2(i31 + 11);
                            float S23 = S2(i31 + 12);
                            float S24 = S2(i31 + 14);
                            float f27 = i26 + f17;
                            float f28 = S22 - 0.5f;
                            i5 = i26;
                            float f29 = max2;
                            float f30 = (f28 * f29) + f27;
                            float f31 = i22 + f18;
                            i6 = i22;
                            float f32 = S23 - 0.5f;
                            float f33 = (f32 * f29) + f31;
                            float f34 = this.R5;
                            f10 = f16;
                            f11 = f22;
                            float i32 = Utilities.i((f30 - f34) / (this.S5 - f34), 1.0f, 0.0f);
                            float f35 = (0.03f * S24) + (i32 * f11) + 0.04f;
                            float min2 = (Math.min(f35, 0.09f) * this.M5) + f30;
                            f12 = f3;
                            float x = c00.x(f32, 3.0f, f24, f12);
                            float x2 = c00.x(f28, 2.0f, f24, measuredHeight);
                            if (z3) {
                                z = W2(min2, f33, x, x2, max3, S2(i31 + 15));
                                f13 = f18;
                                f14 = f17;
                                this.L5.k(min2, f33, bp1.g(S22, 0.2f, 0.38f, min2 - x, x), Math.min(f33, measuredHeight) - (((S24 * 10.0f) + 6.0f) * f24), x, x2, z, f35, R2(iArr6, T2(i27)));
                                mva mvaVar4 = this.L5;
                                float abs = (Math.abs(x - min2) * 1.35f) / z;
                                mvaVar4.f(Math.max(-abs, Math.min(abs, max3)));
                            } else {
                                f13 = f18;
                                f14 = f17;
                                z = xnb.z(i32, 0.16f, 0.92f, (S2(i31 + 15) * 0.16f) + 0.5f);
                                this.L5.k(min2, f33, bp1.g(S22, 0.25f, f25, f12 - min2, min2), Math.min(f33, measuredHeight) - (((S24 * 22.0f) + 8.0f) * f24), x, x2, z, f35, R2(iArr6, T2(i27)));
                            }
                            i23 = i28 + 1;
                            fArr2[i28] = (z * 0.95f) + f35;
                            i24 = i30;
                            i26 = i5 + max2;
                            f3 = f12;
                            i22 = i6;
                            f16 = f10;
                            f22 = f11;
                            f18 = f13;
                            f17 = f14;
                            i25 = 2400;
                            f25 = 0.3f;
                        }
                    }
                    i5 = i26;
                    f10 = f16;
                    f11 = f22;
                    f14 = f17;
                    f12 = f3;
                    i23 = i28;
                    i26 = i5 + max2;
                    f3 = f12;
                    i22 = i6;
                    f16 = f10;
                    f22 = f11;
                    f18 = f13;
                    f17 = f14;
                    i25 = 2400;
                    f25 = 0.3f;
                }
                i22 += max2;
                f20 = f3;
                f15 = f26;
                i23 = i23;
                f16 = f16;
                f22 = f22;
                f18 = f18;
                f17 = f17;
            }
            float f36 = f18;
            float f37 = f15;
            float f38 = f16;
            float f39 = f17;
            float min3 = Math.min(1.0f, 650.0f / f23);
            int i33 = 0;
            int i34 = 0;
            while (i33 < i8) {
                int i35 = 2400;
                if (i23 >= 2400) {
                    break;
                }
                int i36 = 0;
                while (i36 < i8 && i23 < i35) {
                    int i37 = iArr[(i33 * i8) + i36];
                    int i38 = i37 >>> 24;
                    int i39 = i8;
                    if (i38 > 24) {
                        i34++;
                        int i40 = i34 * 13;
                        if (S2(i40 + 5) <= (((i38 * 0.7f) / 255.0f) + 0.3f) * min3) {
                            float S25 = S2(i40 + 6);
                            float S26 = S2(i40 + 7);
                            float S27 = S2(i40 + 8);
                            f5 = min3;
                            float f40 = S25 - 0.5f;
                            int i41 = i23;
                            float f41 = max2;
                            float f42 = (f40 * f41) + f39 + i36;
                            float f43 = f36 + i33;
                            i = i33;
                            float f44 = S26 - 0.5f;
                            float f45 = (f41 * f44) + f43;
                            float f46 = f42 - f37;
                            float f47 = f45 - f38;
                            i3 = max2;
                            float sqrt = (float) Math.sqrt((f47 * f47) + (f46 * f46));
                            if (sqrt < hl.L(1.0f)) {
                                double d = S27 * 3.141592653589793d * 2.0d;
                                float cos = (float) Math.cos(d);
                                f7 = (float) Math.sin(d);
                                f8 = cos;
                            } else {
                                f7 = f47 / sqrt;
                                f8 = f46 / sqrt;
                            }
                            float S28 = ((S2(i40 + 9) * 13.0f) + 7.0f) * f24 * (z3 ? 0.6f : 1.0f);
                            float f48 = S27 * 0.05f;
                            float f49 = f8;
                            float f50 = f7;
                            float min4 = (Math.min(f48, 0.09f) * this.M5) + f42;
                            float x3 = c00.x(f44, 3.0f, f24, f3);
                            float x4 = c00.x(f40, 2.0f, f24, measuredHeight);
                            if (z3) {
                                f6 = max3;
                                S2 = W2(min4, f45, x3, x4, max3, S2(i40 + 10)) * 1.08f;
                                f9 = f48;
                                i4 = i34;
                                this.L5.k(min4, f45, bp1.g(S25, 0.2f, 0.38f, min4 - x3, x3), Math.min(f45, measuredHeight) - (((S26 * 10.0f) + 6.0f) * f24), x3, x4, S2, f9, R2(iArr6, T2(i37)));
                                mva mvaVar5 = this.L5;
                                float abs2 = (Math.abs(x3 - min4) * 1.35f) / S2;
                                mvaVar5.f(Math.max(-abs2, Math.min(abs2, f6)));
                            } else {
                                f9 = f48;
                                i4 = i34;
                                f6 = max3;
                                S2 = (S2(i40 + 10) * 0.2f) + 0.56f;
                                this.L5.k(min4, f45, bp1.g(S25, 0.25f, 0.3f, f3 - min4, min4), Math.min(f45, measuredHeight) - (((S26 * 22.0f) + 8.0f) * f24), x3, x4, S2, f9, R2(iArr6, T2(i37)));
                            }
                            mva mvaVar6 = this.L5;
                            int i42 = mvaVar6.D;
                            int i43 = ((i42 + r15) - 1) % mvaVar6.c;
                            mvaVar6.x[i43] = f49 * S28;
                            mvaVar6.y[i43] = f50 * S28;
                            i2 = i41 + 1;
                            fArr2[i41] = (S2 * 0.95f) + f9;
                            i36 += i3;
                            max3 = f6;
                            i8 = i39;
                            i34 = i4;
                            i33 = i;
                            max2 = i3;
                            i35 = 2400;
                            i23 = i2;
                            min3 = f5;
                        }
                    }
                    f5 = min3;
                    i = i33;
                    i2 = i23;
                    i3 = max2;
                    i4 = i34;
                    f6 = max3;
                    i36 += i3;
                    max3 = f6;
                    i8 = i39;
                    i34 = i4;
                    i33 = i;
                    max2 = i3;
                    i35 = 2400;
                    i23 = i2;
                    min3 = f5;
                }
                int i44 = max2;
                i33 += i44;
                max3 = max3;
                i8 = i8;
                min3 = min3;
                i23 = i23;
                max2 = i44;
            }
            if (i23 == 0) {
                createBitmap.recycle();
                return null;
            }
            Arrays.sort(fArr2, 0, i23);
            int i45 = i23 - 1;
            float f51 = i23;
            this.U5 = fArr2[Math.min(i45, (int) (0.72f * f51))] * 1000.0f;
            float f52 = fArr2[Math.min(i45, (int) (f51 * 0.95f))] * 1000.0f;
            this.V5 = f52;
            float f53 = this.U5;
            this.W5 = (Math.max(60.0f, f52 - f53) * 0.7f) + f53;
            this.O5 = createBitmap;
            this.P5 = f39;
            this.Q5 = f36;
            this.T5 = 0.0f;
            if (z3) {
                this.L5.U = this.N5;
            }
            this.X5 = true;
            RecordCircle recordCircle3 = this.C2;
            recordCircle3.P = true;
            recordCircle3.invalidate();
            zy1 zy1Var = this.a2;
            zy1Var.getClass();
            long uptimeMillis = SystemClock.uptimeMillis();
            if (zy1Var.c || zy1Var.e) {
                f4 = 1.0f;
            } else if (zy1Var.f) {
                f4 = zy1Var.a;
            } else {
                long j = zy1Var.H;
                if (j < 0) {
                    j = uptimeMillis;
                }
                f4 = zy1.a(uptimeMillis - j);
            }
            zy1Var.s = hl.R1(0.85f, 1.0f, f4) * hl.L(5.0f);
            zy1Var.n = true;
            if (zy1Var.G) {
                uptimeMillis -= 240;
            }
            zy1Var.r = uptimeMillis;
            zy1Var.y = 0.0f;
            zy1Var.x = 0.0f;
            zy1Var.w = 0.0f;
            zy1Var.c = false;
            zy1Var.d.stop();
            zy1Var.g().O(true, 0.0f);
            zy1Var.invalidate();
            this.n = 0.0f;
            this.h = 0.55f;
            x2();
            float f54 = this.V5 + 260.0f + 16.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, f54);
            ofFloat.setDuration((long) f54);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.addUpdateListener(new rv1(this, this.a2, hl.L(3.0f) + hl.L(12.0f), this.C2));
            ofFloat.addListener(new ow1(this));
            return ofFloat;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final hc d1() {
        hc hcVar = new hc(getContext());
        Drawable drawable = (Drawable) hcVar.b;
        hcVar.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        hl.d3(new gc(hcVar, (byte) 2), 160L);
        return hcVar;
    }

    public final void d2(boolean z) {
        zu1 zu1Var;
        bn3 bn3Var;
        byte b = 1;
        boolean z2 = (z || this.s2) && (zu1Var = this.E3) != null && !zu1Var.y() && ((bn3Var = this.j1) == null || !bn3Var.q());
        if (this.u6 != z2) {
            if (z2) {
                uc7.s1(this.R).Q1().b();
            }
            this.u6 = z2;
            ImageView imageView = this.i2;
            imageView.setVisibility(0);
            imageView.animate().alpha(z2 ? 1.0f : 0.0f).scaleX(z2 ? 1.0f : 0.6f).scaleY(z2 ? 1.0f : 0.6f).setInterpolator(k43.h).setDuration(420L).withEndAction(new vv1(this, z2, b)).start();
            if (!z2) {
                kg5 kg5Var = this.N;
                if (kg5Var != null) {
                    kg5Var.f(true);
                    this.N = null;
                    return;
                }
                return;
            }
            hc hcVar = this.h2;
            Objects.requireNonNull(hcVar);
            imageView.postDelayed(new gc(hcVar, (byte) 1), 220L);
            kg5 kg5Var2 = this.N;
            if (kg5Var2 != null) {
                kg5Var2.f(true);
                this.N = null;
            }
            if (uc7.e1().getInt("aihintshown", 0) < 3) {
                kg5 kg5Var3 = new kg5(getContext(), 3);
                this.N = kg5Var3;
                kg5Var3.p(true);
                this.N.t(ob6.M0(2131754989, null));
                setHintGlass(this.N);
                this.N.o(0.0f, (imageView.getWidth() / 2.0f) + hl.L(4.0f));
                addView(this.N, tre.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
                kg5 kg5Var4 = this.N;
                kg5Var4.r0 = new xv1(this, kg5Var3, b);
                kg5Var4.d = 4000L;
                kg5Var4.v();
                uc7.e1().edit().putInt("aihintshown", uc7.e1().getInt("aihintshown", 0) + 1).apply();
            }
        }
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        bx1 bx1Var;
        TLRPC.ChatFull chatFull;
        TLRPC.Chat M0;
        double d;
        byte[] bArr;
        vw1 vw1Var;
        if (i == jn7.X5) {
            if (i2 == this.R && objArr.length > 0 && ((Long) objArr[0]).longValue() == l()) {
                q2();
                return;
            }
            return;
        }
        if (i == jn7.l4) {
            my1 my1Var = this.V0;
            if (my1Var != null) {
                my1Var.Q.i1();
            }
            jy1 jy1Var = this.w2;
            if (jy1Var != null) {
                ArrayList arrayList = jy1Var.n;
                while (r4 < arrayList.size()) {
                    ((mq0) arrayList.get(r4)).invalidate();
                    r4++;
                }
            }
            tx1 tx1Var = this.F0;
            if (tx1Var != null) {
                tx1Var.postInvalidate();
                this.F0.q();
                return;
            }
            return;
        }
        if (i == jn7.k2) {
            if (((Integer) objArr[0]).intValue() == this.v3) {
                if (this.l3 && !this.b4 && !c()) {
                    this.b4 = true;
                    uc7.s1(this.S.a).P4(this.d1 ? 7 : 1, 0, this.F3, getThreadMessageId(), null);
                }
                RecordCircle recordCircle = this.C2;
                if (recordCircle != null) {
                    recordCircle.setAmplitude(((Double) objArr[1]).doubleValue());
                    return;
                }
                return;
            }
            return;
        }
        if (i == jn7.s) {
            tx1 tx1Var2 = this.F0;
            if (tx1Var2 == null || !tx1Var2.isFocused()) {
                return;
            }
            hl.t1(this.F0);
            return;
        }
        int i3 = jn7.m2;
        int i4 = jn7.n2;
        byte b = 6;
        int i5 = 5;
        byte b2 = 3;
        if (i == i3 || i == i4) {
            if (((Integer) objArr[0]).intValue() == this.v3) {
                this.k7 = 0L;
                if (this.u3) {
                    this.u3 = false;
                    if (i != i4) {
                        D2(2, true);
                        return;
                    }
                    Integer num = (Integer) objArr[1];
                    if (num.intValue() == 4) {
                        i5 = 4;
                    } else if (this.d1 && num.intValue() == 5) {
                        i5 = 1;
                    } else if (num.intValue() != 0) {
                        i5 = num.intValue() == 6 ? 2 : 3;
                    }
                    if (i5 != 3) {
                        D2(i5, true);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i == jn7.l2) {
            if (((Integer) objArr[0]).intValue() == this.v3) {
                boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                this.d1 = !booleanValue;
                zw1 zw1Var = this.c1;
                if (zw1Var != null) {
                    zw1Var.j(booleanValue ? gz1.a : gz1.b, true);
                }
                if (this.u3) {
                    RecordCircle recordCircle2 = this.C2;
                    if (recordCircle2 != null) {
                        recordCircle2.J = true;
                    }
                } else {
                    this.u3 = true;
                    D2(0, true);
                }
                ez1 ez1Var = this.Z0;
                if (ez1Var != null) {
                    ez1Var.a(this.X1);
                }
                zy1 zy1Var = this.a2;
                if (zy1Var != null) {
                    zy1Var.e = false;
                    return;
                }
                return;
            }
            return;
        }
        if (i == jn7.o2) {
            this.u3 = false;
            this.Q3 = null;
            this.T3 = null;
            long j = this.d1 ? 1500L : 800L;
            this.k7 = SystemClock.uptimeMillis() + j;
            hl.d3(new fw1(this, b), j + 16);
            return;
        }
        if (i == jn7.p2) {
            this.k7 = 0L;
            this.Q3 = null;
            this.T3 = null;
            ez1 ez1Var2 = this.Z0;
            if (ez1Var2 != null) {
                ez1Var2.a(this.X1);
            }
            P(true);
            this.u3 = true;
            D2(0, true);
            return;
        }
        if (i != jn7.s2) {
            if (i == jn7.u2) {
                Activity activity = this.D3;
                if (activity != null) {
                    activity.setVolumeControlStream(((Boolean) objArr[0]).booleanValue() ? 0 : TLObject.FLAG_31);
                    return;
                }
                return;
            }
            if (i == jn7.e2) {
                if (this.S3 == null || !MediaController.z().H(this.S3)) {
                    return;
                }
                r47 r47Var = MediaController.z().v0;
                r47 r47Var2 = this.S3;
                r47Var2.b0 = r47Var.b0;
                r47Var2.i0 = r47Var.i0;
                return;
            }
            if (i == jn7.z0) {
                tw1 tw1Var = this.R0;
                if (tw1Var != null) {
                    tw1Var.invalidate();
                    return;
                }
                return;
            }
            if (i == jn7.K) {
                if (((Boolean) objArr[6]).booleanValue()) {
                    return;
                }
                long longValue = ((Long) objArr[3]).longValue();
                Integer num2 = (Integer) objArr[1];
                if (longValue != this.F3 || (chatFull = this.S2) == null || chatFull.slowmode_seconds == 0 || r47.f3(num2.intValue()) || (M0 = uc7.s1(this.S.a).M0(Long.valueOf(this.S2.id))) == null || xc2.N(M0) || xc2.h0(M0)) {
                    return;
                }
                TLRPC.ChatFull chatFull2 = this.S2;
                int currentTime = ConnectionsManager.getInstance(this.R).getCurrentTime();
                TLRPC.ChatFull chatFull3 = this.S2;
                chatFull2.slowmode_next_send_date = currentTime + chatFull3.slowmode_seconds;
                chatFull3.flags |= 262144;
                setSlowModeTimer(chatFull3.slowmode_next_send_date);
                return;
            }
            if (i == jn7.n1) {
                if (this.S2 != null) {
                    L2();
                    return;
                }
                return;
            }
            if (i == jn7.t2) {
                this.Q3 = null;
                this.T3 = null;
                D2(4, true);
                return;
            }
            if (i != jn7.T2) {
                if (i == jn7.a3) {
                    A2(true);
                    return;
                }
                if (i != jn7.i5) {
                    if (i == jn7.S3) {
                        o0();
                        return;
                    }
                    return;
                } else {
                    if (this.s2 && (bx1Var = this.K0) != null) {
                        bx1Var.setLocked(!yac.h(this.R).p());
                    }
                    o0();
                    return;
                }
            }
            long longValue2 = ((Long) objArr[0]).longValue();
            TL_bots.BotMenuButton botMenuButton = (TL_bots.BotMenuButton) objArr[1];
            if (longValue2 == this.F3) {
                if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                    TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                    this.j0 = tL_botMenuButton.text;
                    this.k0 = tL_botMenuButton.url;
                    this.U7 = 3;
                } else if (this.e3) {
                    this.U7 = 2;
                } else {
                    this.U7 = 1;
                }
                t2(false);
                return;
            }
            return;
        }
        if (((Integer) objArr[0]).intValue() == this.v3) {
            this.k7 = 0L;
            this.X1 = 0L;
            Object obj = objArr[1];
            if (obj instanceof oec) {
                oec oecVar = (oec) obj;
                this.T3 = oecVar;
                String str = (String) objArr[2];
                this.R3 = str;
                ArrayList<Bitmap> arrayList2 = (ArrayList) objArr[3];
                this.X1 = oecVar.r;
                qgc qgcVar = this.g1;
                if (qgcVar != null) {
                    qgcVar.setVideoPath(str);
                    this.g1.setKeyframes(arrayList2);
                    this.g1.setVisibility(0);
                    this.g1.setMinProgressDiff(1000.0f / this.T3.r);
                    Y0();
                }
                D2(3, true);
                P(false);
                return;
            }
            this.Q3 = (TLRPC.TL_document) obj;
            this.R3 = (String) objArr[2];
            boolean z = objArr.length >= 4 && ((Boolean) objArr[3]).booleanValue();
            float floatValue = objArr.length >= 5 ? ((Float) objArr[4]).floatValue() : 0.0f;
            float floatValue2 = objArr.length >= 6 ? ((Float) objArr[5]).floatValue() : 1.0f;
            if (this.Q3 == null) {
                xy1 xy1Var = this.O3;
                if (xy1Var != null) {
                    xy1Var.x(null, true, 0, 0, 0L);
                    return;
                }
                return;
            }
            c0();
            if (this.f1 != null) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = true;
                tL_message.id = 0;
                tL_message.peer_id = new TLRPC.TL_peerUser();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                TLRPC.Peer peer = tL_message.peer_id;
                long e = yac.h(this.R).e();
                tL_peerUser.user_id = e;
                peer.user_id = e;
                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                tL_message.message = "";
                tL_message.attachPath = this.R3;
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message.media = tL_messageMediaDocument;
                tL_messageMediaDocument.flags |= 3;
                tL_messageMediaDocument.document = this.Q3;
                tL_message.flags |= 768;
                this.S3 = new r47(yac.t0, tL_message, false, true);
                this.f1.setAlpha(1.0f);
                this.f1.setVisibility(0);
                this.h1.setVisibility(0);
                this.h1.setAlpha(0.0f);
                this.h1.setScaleY(0.0f);
                this.h1.setScaleX(0.0f);
                int i6 = 0;
                while (true) {
                    if (i6 >= this.Q3.attributes.size()) {
                        d = 0.0d;
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = this.Q3.attributes.get(i6);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                        d = documentAttribute.duration;
                        break;
                    }
                    i6++;
                }
                int i7 = 0;
                while (true) {
                    if (i7 >= this.Q3.attributes.size()) {
                        bArr = null;
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute2 = this.Q3.attributes.get(i7);
                    if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                        bArr = documentAttribute2.waveform;
                        if (bArr == null || bArr.length == 0) {
                            bArr = MediaController.getWaveform(this.R3);
                            documentAttribute2.waveform = bArr;
                        }
                    } else {
                        i7++;
                    }
                }
                if (z && (vw1Var = this.g2) != null) {
                    this.k2 = 0.0f;
                    vw1Var.setAlpha(0.0f);
                    vw1Var.setScaleX(0.0f);
                    vw1Var.setScaleY(0.0f);
                }
                this.X1 = (long) (1000.0d * d);
                x59 x59Var = this.i1;
                String str2 = this.R3;
                if (!x59Var.T) {
                    x59Var.r = (float) d;
                    x59Var.s = floatValue;
                    x59Var.w = floatValue2;
                    x59Var.x = false;
                    x59Var.h.t(hl.g0((int) Math.round(Math.max(1.0d, d)), false, false), false, true);
                    x59Var.f.a(false, false);
                    kfc kfcVar = x59Var.n;
                    if (kfcVar == null) {
                        kfcVar = new kfc();
                        x59Var.n = kfcVar;
                        kfcVar.K = new pq8(x59Var, b2);
                    }
                    kfcVar.i0(Uri.fromFile(new File(str2)), "other");
                    x59Var.i(false);
                    x59Var.L = 0;
                    x59Var.M = bArr;
                    Bitmap bitmap = x59Var.R0;
                    if (bitmap != null) {
                        bitmap.recycle();
                        x59Var.R0 = null;
                    }
                    x59Var.U0 = null;
                    x59Var.V0 = false;
                    x59Var.O0 = -1;
                    x59Var.H0.a();
                    x59Var.G0.a();
                    x59Var.invalidate();
                }
                P(false);
                if (z) {
                    e0();
                    f0();
                    c0();
                    this.l3 = true;
                    this.C2.g(false);
                    RecordCircle recordCircle3 = this.C2;
                    this.k4.getClass();
                    recordCircle3.setControlsScale(1.0f);
                    l lVar = this.D2;
                    if (lVar != null) {
                        lVar.setVisibility(0);
                        this.D2.setAlpha(1.0f);
                    }
                }
                D2(3, !z);
                if (!z || !uc7.e1().getBoolean("design_voice_live_field", true) || this.N2 || this.Q3 == null) {
                    return;
                }
                E0().u();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        x59 x59Var;
        my1 my1Var = this.V0;
        if (my1Var != null && my1Var.getVisibility() == 0 && this.V0.getStickersExpandOffset() != 0.0f) {
            canvas.save();
            canvas.clipRect(0, hl.L(2.0f), getMeasuredWidth(), getMeasuredHeight());
            canvas.translate(0.0f, -this.V0.getStickersExpandOffset());
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        super.dispatchDraw(canvas);
        if (!this.J1 || (x59Var = this.i1) == null || x59Var.getTrimProgress() <= 0.0f) {
            return;
        }
        int[] iArr = this.v5;
        getLocationInWindow(iArr);
        float f = iArr[0];
        float f2 = iArr[1];
        z0(this, canvas, f, f2, f2, 100000.0f);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        View view2 = this.v2;
        rw1 rw1Var = this.o2;
        boolean z = view == view2 || view == rw1Var;
        if (z) {
            float measuredHeight = getMeasuredHeight() - this.K7.f;
            canvas.save();
            if (view == rw1Var) {
                canvas.clipRect(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
            }
            if (view == this.v2) {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
            }
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        if (z) {
            canvas.restore();
        }
        return drawChild;
    }

    @Override // p4b
    public final void e(TLRPC.Document document, String str, Object obj, n47 n47Var, boolean z, boolean z2, int i, int i2) {
        if (this.T7) {
            return;
        }
        ou1 ou1Var = this.K3;
        zu1 zu1Var = this.E3;
        if (ou1Var != null && zu1Var != null && ou1Var.f) {
            zu1Var.uc();
            return;
        }
        if (!c() || i != 0) {
            jj.X(this.R, this.F3, 1, new nw1(this, document, str, n47Var, z2, i, i2, obj, z));
            return;
        }
        jj.J(this.D3, zu1Var.a(), new mw1(this, document, str, obj, n47Var, z), this.K4);
    }

    public final void e0() {
        l lVar = this.D2;
        wma wmaVar = this.b2;
        if (lVar == null) {
            l lVar2 = new l(this, getContext());
            this.D2 = lVar2;
            lVar2.setVisibility(8);
            wmaVar.addView(this.D2, tre.e(-1, -2, 80));
        }
        if (this.C2 != null) {
            return;
        }
        RecordCircle recordCircle = new RecordCircle(getContext());
        this.C2 = recordCircle;
        recordCircle.setVisibility(8);
        wmaVar.addView(this.C2, tre.e(-1, -2, 80));
    }

    public final float e1(FrameLayout frameLayout) {
        float measuredHeight = getMeasuredHeight() - this.K7.f;
        float f = 0.0f;
        View view = frameLayout;
        while (view != null) {
            if (view == this) {
                return measuredHeight - f;
            }
            f += view.getTranslationY() + view.getTop();
            view = view.getParent() instanceof View ? (View) view.getParent() : null;
        }
        return frameLayout.getHeight() - hl.L(44.0f);
    }

    public final void e2(boolean z) {
        if (this.N2 || this.K0 == null || getWidth() == 0) {
            return;
        }
        tx1 tx1Var = this.F0;
        Editable text = tx1Var != null ? tx1Var.getText() : null;
        if (text == null || TextUtils.isEmpty(text.toString().trim()) || this.Q3 != null || X0()) {
            return;
        }
        StringBuilder sb = new StringBuilder(z ? "airewritehint_on_" : "airewritehint_off_");
        long j = W7;
        byte b = 0;
        if (j == 0) {
            try {
                j = org.telegram.messenger.a.b.getPackageManager().getPackageInfo(org.telegram.messenger.a.b.getPackageName(), 0).lastUpdateTime;
                W7 = j;
            } catch (Exception unused) {
                j = 1;
                W7 = 1L;
            }
        }
        sb.append(j);
        String sb2 = sb.toString();
        SharedPreferences e1 = uc7.e1();
        if (e1.getInt(sb2, 0) < 2) {
            kg5 kg5Var = this.G6;
            if (kg5Var != null && kg5Var.W && this.H6 == z) {
                return;
            }
            byte b2 = 1;
            e1.edit().putInt(sb2, e1.getInt(sb2, 0) + 1).apply();
            this.H6 = z;
            kg5 kg5Var2 = this.G6;
            if (kg5Var2 != null) {
                kg5Var2.f(true);
                this.G6 = null;
            }
            kg5 kg5Var3 = new kg5(getContext(), 3);
            this.G6 = kg5Var3;
            kg5Var3.q(13.0f);
            setHintGlass(kg5Var3);
            kg5Var3.p(true);
            kg5Var3.t(hl.S2(ob6.M0(z ? 2131755005 : 2131755006, null)));
            addView(kg5Var3, tre.d(-1, 200.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            w1(kg5Var3);
            getViewTreeObserver().addOnPreDrawListener(new z(this, kg5Var3, b2));
            kg5Var3.r0 = new xv1(this, kg5Var3, b);
            kg5Var3.d = 3500L;
            kg5Var3.v();
        }
    }

    public final void f0() {
        if (this.e1 != null || getContext() == null) {
            return;
        }
        b6 b6Var = new b6(getContext(), (byte) 5);
        this.e1 = b6Var;
        b6Var.setClipChildren(false);
        this.e1.setVisibility(8);
        this.n2.addView(this.e1, tre.c(44.0f, -1));
        this.e1.setOnTouchListener(new q8((byte) 28));
        b6 b6Var2 = this.e1;
        SlideTextView slideTextView = new SlideTextView(getContext());
        this.Z1 = slideTextView;
        b6Var2.addView(slideTextView, tre.d(-1, -1.0f, 0, 45.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(0);
        this.d.setPadding(hl.L(13.0f), 0, 0, 0);
        this.d.setFocusable(false);
        LinearLayout linearLayout2 = this.d;
        zy1 zy1Var = new zy1(this, getContext());
        this.a2 = zy1Var;
        linearLayout2.addView(zy1Var, tre.t(28, 28, 16, 0, 0, 0, 0));
        this.a2.d(j0());
        this.a2.setOnClickListener(new pv1(this, (byte) 0));
        LinearLayout linearLayout3 = this.d;
        ez1 ez1Var = new ez1(this, getContext());
        this.Z0 = ez1Var;
        linearLayout3.addView(ez1Var, tre.t(-1, -1, 16, 6, 0, 0, 0));
        this.e1.addView(this.d, tre.e(-1, -1, 16));
    }

    public final void f2() {
        zu1 zu1Var = this.E3;
        if (zu1Var == null || !xc2.V(zu1Var.e)) {
            return;
        }
        d31.b0(zu1Var).f(uc7.s1(this.R).k4.p1.f(), new mv1(this, (byte) 14)).j();
    }

    public final void g0() {
        if (this.y2 != null || this.E3 == null) {
            return;
        }
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.input_calendar1).mutate();
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.input_calendar2).mutate();
        int i = aob.Nl;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        vnb vnbVar = this.K4;
        yob.x(this, mutate, i, vnbVar, mode);
        yob.x(this, mutate2, aob.ag, vnbVar, mode);
        zm2 zm2Var = new zm2(mutate, mutate2);
        cx1 cx1Var = new cx1(this, getContext());
        this.y2 = cx1Var;
        cx1Var.setImageDrawable(zm2Var);
        this.y2.setVisibility(8);
        this.y2.setContentDescription(ob6.M0(2131745576, null));
        this.y2.setScaleType(ImageView.ScaleType.CENTER);
        cx1 cx1Var2 = this.y2;
        int i2 = aob.i6;
        yob.R(cx1Var2, aob.f0(J0(i2), 1, -1), null, yob.M(i2), vnbVar);
        this.n2.addView(this.y2, 2, tre.e(44, 44, 85));
        this.y2.setOnClickListener(new pv1(this, (byte) 7));
        this.y2.setTranslationX(0.0f);
    }

    public final void g1() {
        k(false);
        snc sncVar = this.r1;
        byte b = 1;
        if (sncVar != null) {
            sncVar.k("destroy", true);
            vnc vncVar = sncVar.h;
            if (vncVar != null) {
                hl.B2(vncVar);
                sncVar.h = null;
            }
            knc kncVar = sncVar.L;
            if (kncVar != null) {
                hl.B2(kncVar);
                sncVar.L = null;
            }
            this.r1 = null;
        }
        if (this.m1) {
            this.m1 = false;
            DictationAsr.V(this.q1);
        }
        bn3 bn3Var = this.j1;
        if (bn3Var != null) {
            DictationAsr.V(bn3Var.n0);
            bn3Var.o();
            ho3 ho3Var = bn3Var.F;
            if (ho3Var != null) {
                ho3Var.a();
            }
            z92 z92Var = bn3Var.b0;
            if (z92Var != null) {
                z92Var.f = null;
            }
            hl.B2(bn3Var.s);
            hl.B2(bn3Var.w);
            this.j1 = null;
        }
        x59 x59Var = this.i1;
        if (x59Var != null) {
            x59Var.T = true;
            kfc kfcVar = x59Var.n;
            if (kfcVar != null) {
                kfcVar.t0(false);
                x59Var.n.l0();
                x59Var.n = null;
            }
        }
        if (this.i1 != null && this.Q3 != null) {
            ls6 d0 = ls6.d0(this.R);
            long j = this.F3;
            zu1 zu1Var = this.E3;
            long c = (zu1Var == null || !zu1Var.x4) ? 0L : zu1Var.c();
            x59 x59Var2 = this.i1;
            float audioLeft = x59Var2 == null ? 0.0f : x59Var2.getAudioLeft();
            x59 x59Var3 = this.i1;
            d0.d2(j, c, audioLeft, x59Var3 == null ? 1.0f : x59Var3.getAudioRight());
        }
        this.N2 = true;
        jn7.f(this.R).n(this, jn7.l2);
        jn7.f(this.R).n(this, jn7.o2);
        jn7.f(this.R).n(this, jn7.p2);
        jn7.f(this.R).n(this, jn7.m2);
        jn7.f(this.R).n(this, jn7.X5);
        jn7.f(this.R).n(this, jn7.n2);
        jn7.f(this.R).n(this, jn7.k2);
        jn7.f(this.R).n(this, jn7.s);
        jn7.f(this.R).n(this, jn7.s2);
        jn7.f(this.R).n(this, jn7.u2);
        jn7.f(this.R).n(this, jn7.e2);
        jn7.f(this.R).n(this, jn7.z0);
        jn7.f(this.R).n(this, jn7.K);
        jn7.f(this.R).n(this, jn7.n1);
        jn7.f(this.R).n(this, jn7.t2);
        jn7.f(this.R).n(this, jn7.T2);
        jn7.f(this.R).n(this, jn7.a3);
        jn7.f(this.R).n(this, jn7.i5);
        jn7.f(this.R).n(this, jn7.S3);
        jn7.e().n(this, jn7.l4);
        my1 my1Var = this.V0;
        if (my1Var != null) {
            my1Var.A();
        }
        mv1 mv1Var = this.I0;
        if (mv1Var != null) {
            hl.r(mv1Var);
            this.I0 = null;
        }
        PowerManager.WakeLock wakeLock = this.f3;
        if (wakeLock != null) {
            try {
                wakeLock.release();
                this.f3 = null;
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        if (this.l3 && !this.d1) {
            hl.c3(new n9(this.D3, b));
        }
        wma wmaVar = this.b2;
        if (wmaVar != null) {
            wmaVar.setDelegate(null);
        }
        ix1 ix1Var = this.r0;
        if (ix1Var != null) {
            ix1Var.e = false;
            ix1Var.dismiss();
        }
    }

    public boolean g2(Runnable runnable) {
        return false;
    }

    public hb getAdjustPanLayoutHelper() {
        return this.V;
    }

    public int getAnimatedTop() {
        return this.I2;
    }

    public ImageView getAttachButton() {
        return this.g2;
    }

    public View getAudioVideoButtonContainer() {
        return this.a1;
    }

    public int getBackgroundTop() {
        int top = getTop();
        View view = this.v2;
        return (view == null || view.getVisibility() != 0) ? top : top + this.v2.getLayoutParams().height;
    }

    public dv1 getBotWebViewButton() {
        if (this.l0 == null) {
            Context context = getContext();
            dv1 dv1Var = new dv1(context);
            dv1Var.a = new Path();
            dv1Var.c = aob.w0(null, aob.Fi, false);
            dv1Var.d = true;
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setSingleLine();
            textView.setAlpha(0.0f);
            textView.setGravity(17);
            textView.setTypeface(hl.o());
            dv1Var.addView(textView, tre.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context, null);
            radialProgressView.setSize(hl.L(18.0f));
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.0f);
            radialProgressView.setScaleY(0.0f);
            dv1Var.addView(radialProgressView, tre.d(28, 28.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            View view = new View(context);
            dv1Var.h = view;
            int i = aob.Hi;
            hf0 f0 = aob.f0(aob.w0(null, i, false), 2, -1);
            uob M = yob.M(i);
            view.setBackground(f0);
            yob.j(view, f0, null, M, null);
            dv1Var.addView(view, tre.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            dv1Var.setWillNotDraw(false);
            this.l0 = dv1Var;
            dv1Var.setVisibility(8);
            W();
            this.l0.setBotMenuButton(this.m0);
            this.n2.addView(this.l0, tre.e(-1, -1, 80));
        }
        return this.l0;
    }

    public int getCursorPosition() {
        tx1 tx1Var = this.F0;
        if (tx1Var == null) {
            return 0;
        }
        return tx1Var.getSelectionStart();
    }

    public CharSequence getDraftMessage() {
        if (this.O2 != null) {
            if (TextUtils.isEmpty(this.K2)) {
                return null;
            }
            return this.K2;
        }
        if (this.F0 == null || !L0()) {
            return null;
        }
        return this.F0.getText();
    }

    @Override // xeb
    public float getEditFieldBottomOffset() {
        if (this.F0 == null) {
            return 0.0f;
        }
        return ((FrameLayout.LayoutParams) r1.getLayoutParams()).bottomMargin - hl.L(1.5f);
    }

    @Override // xeb
    public Editable getEditText() {
        tx1 tx1Var = this.F0;
        if (tx1Var == null) {
            return null;
        }
        return tx1Var.getText();
    }

    public r47 getEditingMessageObject() {
        return this.O2;
    }

    public long getEffectId() {
        return this.o7;
    }

    public View getEmojiButton() {
        return this.R0;
    }

    public int getEmojiPadding() {
        return this.p3;
    }

    public o24 getEmojiView() {
        return this.V0;
    }

    public float getExitTransition() {
        return this.a5;
    }

    @Override // xeb
    public CharSequence getFieldText() {
        if (this.F0 == null || !L0()) {
            return null;
        }
        return this.F0.getText();
    }

    public int getHeightWithTopView() {
        int measuredHeight = getMeasuredHeight();
        View view = this.v2;
        return (view == null || view.getVisibility() != 0) ? measuredHeight : (int) (measuredHeight - ((1.0f - getTopViewEnterProgress()) * this.v2.getLayoutParams().height));
    }

    public long getLineAnimationDelay() {
        return 0L;
    }

    public float getLockAnimatedTranslation() {
        return this.Z4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x007a, code lost:
    
        if (r6.T3 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int getMessagesCount() {
        v47 v47Var;
        t47 t47Var;
        zu1 zu1Var = this.E3;
        int size = (zu1Var == null || (v47Var = zu1Var.x5) == null || (t47Var = v47Var.b) == null) ? 0 : t47Var.g.size();
        tx1 tx1Var = this.F0;
        if (tx1Var == null || TextUtils.isEmpty(tx1Var.getText())) {
            if (this.S3 == null) {
            }
            size++;
        } else {
            String obj = this.F0.getText().toString();
            to3 to3Var = r7a.J;
            String trim = obj.trim();
            if (trim.length() != 0) {
                while (obj.startsWith("\n")) {
                    obj = obj.substring(1);
                }
                while (obj.endsWith("\n")) {
                    obj = bs2.n(1, 0, obj);
                }
                trim = obj;
            }
            int t1 = uc7.s1(this.S.a).t1();
            if (trim.length() != 0) {
                size += (int) Math.ceil(trim.length() / t1);
            }
            size++;
        }
        return Math.max(1, size);
    }

    public RecordCircle getRecordCircle() {
        return this.C2;
    }

    public long getRecordTimerStartTime() {
        ez1 ez1Var = this.Z0;
        if (ez1Var == null || !ez1Var.a) {
            return 0L;
        }
        return ez1Var.d;
    }

    public r47 getReplyingMessageObject() {
        return this.I3;
    }

    public int getRestingFieldHeight() {
        tx1 tx1Var = this.F0;
        if (tx1Var == null) {
            return hl.L(44.0f);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) tx1Var.getLayoutParams();
        return Math.max(hl.L(44.0f), this.F0.getLineHeight() + this.F0.getPaddingBottom() + this.F0.getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin);
    }

    public int getSelectionLength() {
        tx1 tx1Var = this.F0;
        if (tx1Var == null) {
            return 0;
        }
        try {
            return tx1Var.getSelectionEnd() - this.F0.getSelectionStart();
        } catch (Exception e) {
            cc4.g(e, true);
            return 0;
        }
    }

    public View getSendButton() {
        return getSendButtonInternal().getVisibility() == 0 ? getSendButtonInternal() : this.a1;
    }

    public View getSendButtonInternal() {
        return this.K0;
    }

    public b77 getSendMessageSuggestionParams() {
        zu1 zu1Var = this.E3;
        if (zu1Var != null) {
            return zu1Var.y5;
        }
        return null;
    }

    public long getSendMonoForumPeerId() {
        zu1 zu1Var = this.E3;
        if (zu1Var != null) {
            return zu1Var.k7();
        }
        return 0L;
    }

    public c8a getSenderSelectView() {
        return this.q0;
    }

    public wma getSizeNotifierLayout() {
        return this.b2;
    }

    public float getSlideToCancelProgress() {
        return this.X4;
    }

    public CharSequence getSlowModeTimer() {
        if (this.H0 > 0) {
            return ((ema) this.G0.c).getText();
        }
        return null;
    }

    public long getStarsPrice() {
        zu1 zu1Var = this.E3;
        return zu1Var != null ? zu1Var.getMessagesController().M1(zu1Var.a()) : uc7.s1(this.R).M1(this.F3);
    }

    public Drawable getStickersArrowDrawable() {
        return this.u4;
    }

    public int getStickersExpandedHeight() {
        return this.s4;
    }

    public ImageView getSuggestButton() {
        return this.l2;
    }

    public TLRPC.TL_textWithEntities getTextWithEntities() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {new SpannableStringBuilder(getEditText())};
        tL_textWithEntities.entities = ls6.d0(yac.t0).Y(charSequenceArr, true, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        return tL_textWithEntities;
    }

    public float getTopViewEnterProgress() {
        return this.L7.e;
    }

    public float getTopViewHeight() {
        View view = this.v2;
        if (view == null || view.getVisibility() != 0) {
            return 0.0f;
        }
        return this.v2.getLayoutParams().height;
    }

    public float getTopViewTranslation() {
        View view = this.v2;
        if (view == null || view.getVisibility() == 8) {
            return 0.0f;
        }
        return this.v2.getTranslationY();
    }

    public o5c getTrendingStickersAlert() {
        return this.P3;
    }

    public int getVisibleEmojiPadding() {
        if (this.X0) {
            return this.p3;
        }
        return 0;
    }

    public float getVisualHeight() {
        float f = this.I2;
        View view = this.v2;
        if (view != null && view.getVisibility() == 0) {
            f += (1.0f - getTopViewEnterProgress()) * this.v2.getLayoutParams().height;
        }
        return getMeasuredHeight() - f;
    }

    public final void h0() {
        if (this.q0 != null || getContext() == null) {
            return;
        }
        c8a c8aVar = new c8a(getContext());
        ImageReceiver imageReceiver = new ImageReceiver(c8aVar);
        c8aVar.a = imageReceiver;
        c8aVar.b = new rb0((vnb) null);
        c8aVar.d = new Paint(1);
        Paint paint = new Paint(1);
        c8aVar.e = paint;
        imageReceiver.q0(hl.L(28.0f));
        paint.setStrokeWidth(hl.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        c8aVar.updateColors();
        c8aVar.setContentDescription(ob6.a0("AccDescrSendAsPeer", null, 2131754770, ""));
        this.q0 = c8aVar;
        c8aVar.setOnClickListener(new pv1(this, (byte) 2));
        this.q0.setVisibility(8);
        this.n2.addView(this.q0, tre.d(36, 36.0f, 83, 4.66f, 4.0f, 4.66f, 4.0f));
    }

    public final void h2() {
        i2(1, 0, true, true);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i(TLRPC.Document document) {
        ls6.d0(this.R).c(document, (int) (System.currentTimeMillis() / 1000), true);
        my1 my1Var = this.V0;
        if (my1Var == null || document == null) {
            return;
        }
        boolean isEmpty = my1Var.j1.isEmpty();
        my1Var.W();
        if (isEmpty) {
            my1Var.X(false);
        }
    }

    public final void i0() {
        ValueAnimator valueAnimator = this.V6;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.V6 = null;
        }
        if (!this.u3) {
            p0(false, false);
            return;
        }
        if (this.T6) {
            this.U6 = 1.0f;
            this.H1 = SystemClock.uptimeMillis() + 1500;
        }
        this.T6 = false;
    }

    public final void i1() {
        this.Y2 = true;
        snc sncVar = this.r1;
        if (sncVar != null) {
            sncVar.k("chat paused", true);
        }
        if (j0() && this.u3) {
            n0();
        }
        ix1 ix1Var = this.r0;
        if (ix1Var != null) {
            ix1Var.e = false;
            ix1Var.dismiss();
        }
        if (this.o3) {
            this.a3 = true;
        }
        fw1 fw1Var = new fw1(this, (byte) 9);
        this.i7 = fw1Var;
        hl.d3(fw1Var, 500L);
    }

    public final void i2(int i, int i2, boolean z, boolean z2) {
        byte b;
        boolean z3;
        boolean z4;
        int i3;
        ViewGroup viewGroup;
        int i4;
        float f;
        if (i != 2) {
            pn pnVar = this.z4;
            dx1 dx1Var = this.M4;
            Property property = View.TRANSLATION_Y;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            if (i == 1) {
                if (i2 == 0) {
                    if (this.D3 == null && this.V0 == null) {
                        return;
                    } else {
                        Z();
                    }
                }
                if (i2 == 0) {
                    x();
                    if (this.X0) {
                        this.V0.getVisibility();
                    }
                    this.V0.setVisibility(0);
                    this.X0 = true;
                    jy1 jy1Var = this.w2;
                    if (jy1Var == null || jy1Var.getVisibility() == 8) {
                        i3 = 0;
                    } else {
                        this.w2.setVisibility(8);
                        this.Y0 = false;
                        i3 = this.w2.getMeasuredHeight();
                    }
                    this.V0.setShowing(true);
                    my1 my1Var = this.V0;
                    this.d4 = 0;
                    viewGroup = my1Var;
                } else if (i2 == 1) {
                    if (this.Y0) {
                        this.w2.getVisibility();
                    }
                    this.Y0 = true;
                    my1 my1Var2 = this.V0;
                    if (my1Var2 == null || my1Var2.getVisibility() == 8) {
                        i4 = 0;
                    } else {
                        this.c2.removeView(this.V0);
                        this.V0.setVisibility(8);
                        this.V0.setShowing(false);
                        this.X0 = false;
                        i4 = this.V0.getMeasuredHeight();
                    }
                    this.w2.setVisibility(0);
                    jy1 jy1Var2 = this.w2;
                    this.d4 = 1;
                    uc7.s1(this.R).X3.edit().remove("closed_botkeyboard_" + getTopicKeyString()).apply();
                    i3 = i4;
                    viewGroup = jy1Var2;
                } else {
                    i3 = 0;
                    viewGroup = null;
                }
                this.U2 = i2;
                if (this.m3 <= 0) {
                    f = 200.0f;
                    this.m3 = uc7.d1().getInt("kbd_height", hl.L(200.0f));
                } else {
                    f = 200.0f;
                }
                int i5 = this.n3;
                if (i5 <= 0) {
                    i5 = uc7.d1().getInt("kbd_height_land3", hl.L(f));
                    this.n3 = i5;
                }
                Point point = hl.q;
                if (point.x <= point.y) {
                    i5 = this.m3;
                }
                zu1 zu1Var = this.E3;
                if (zu1Var != null && zu1Var.getParentLayout() != null) {
                    i5 -= ((ActionBarLayout) zu1Var.getParentLayout()).u(false);
                }
                if (i2 == 1) {
                    i5 = Math.min(this.w2.getKeyboardHeight(), i5);
                }
                jy1 jy1Var3 = this.w2;
                if (jy1Var3 != null) {
                    jy1Var3.setPanelHeight(i5);
                }
                if (viewGroup != null && this.I7 == null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
                    layoutParams.height = i5;
                    viewGroup.setLayoutParams(layoutParams);
                }
                if (!hl.E) {
                    hl.t1(this.F0);
                }
                wma wmaVar = this.b2;
                if (wmaVar != null) {
                    this.p3 = i5;
                    wmaVar.requestLayout();
                    O1(true, true);
                    t2(true);
                    l1();
                    if (this.X2 && !this.o3 && i5 != i3 && z) {
                        fw1 fw1Var = new fw1(this, z7 ? 1 : 0);
                        if (this.w) {
                            this.x = fw1Var;
                        } else {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.W0 = animatorSet;
                            float f2 = i5 - i3;
                            if (this.I7 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(f2, 0.0f));
                            } else {
                                viewGroup.setTranslationY(f2);
                                this.W0.playTogether(ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) property, f2, 0.0f));
                            }
                            this.W0.setInterpolator(hb.w);
                            this.W0.setDuration(250L);
                            this.W0.addListener(new v5(this, fw1Var, (byte) 12));
                            hl.d3(dx1Var, 50L);
                            pnVar.d();
                        }
                        requestLayout();
                    }
                }
                r2d r2dVar = this.I7;
                if (r2dVar != null) {
                    ((v2d) r2dVar).h(i5);
                }
            } else {
                if (this.R0 != null) {
                    O1(false, true);
                }
                this.U2 = -1;
                my1 my1Var3 = this.V0;
                if (my1Var3 != null) {
                    if (i == 2 && !hl.D && !hl.E) {
                        this.v4 = false;
                        xy1 xy1Var = this.O3;
                        if (xy1Var != null) {
                            xy1Var.o(0.0f);
                        }
                        this.c2.removeView(this.V0);
                        this.V0 = null;
                    } else if (!this.X2 || this.o3 || this.o4) {
                        xy1 xy1Var2 = this.O3;
                        if (xy1Var2 != null) {
                            xy1Var2.o(0.0f);
                        }
                        z5 = false;
                        this.p3 = 0;
                        this.c2.removeView(this.V0);
                        this.V0.setVisibility(8);
                        this.V0.setShowing(false);
                    } else {
                        this.X0 = true;
                        this.d4 = 0;
                        my1Var3.setShowing(false);
                        gw1 gw1Var = new gw1(this, i, z6 ? 1 : 0);
                        if (this.w) {
                            z3 = false;
                            this.x = gw1Var;
                        } else {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.W0 = animatorSet2;
                            r2d r2dVar2 = this.I7;
                            my1 my1Var4 = this.V0;
                            if (r2dVar2 != null) {
                                z3 = false;
                                animatorSet2.playTogether(ValueAnimator.ofFloat(my1Var4.getMeasuredHeight()), ValueAnimator.ofFloat(0.0f, 1.0f));
                            } else {
                                z3 = false;
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(my1Var4, (Property<my1, Float>) property, my1Var4.getMeasuredHeight()));
                            }
                            this.W0.setInterpolator(hb.w);
                            this.W0.setDuration(250L);
                            pnVar.d();
                            this.W0.addListener(new v5(this, gw1Var, (byte) 13));
                        }
                        hl.d3(dx1Var, 50L);
                        requestLayout();
                        z5 = z3;
                    }
                    this.X0 = z5;
                }
                jy1 jy1Var4 = this.w2;
                if (jy1Var4 != null && jy1Var4.getVisibility() == 0) {
                    if (i != 2 || hl.D || hl.E) {
                        if (this.X2 && !this.o3) {
                            if (this.Y0) {
                                this.d4 = 1;
                            }
                            AnimatorSet animatorSet3 = new AnimatorSet();
                            this.W0 = animatorSet3;
                            r2d r2dVar3 = this.I7;
                            jy1 jy1Var5 = this.w2;
                            if (r2dVar3 != null) {
                                b = 0;
                                animatorSet3.playTogether(ValueAnimator.ofFloat(jy1Var5.getMeasuredHeight()));
                            } else {
                                b = 0;
                                animatorSet3.playTogether(ObjectAnimator.ofFloat(jy1Var5, (Property<jy1, Float>) property, jy1Var5.getMeasuredHeight()));
                            }
                            this.W0.setInterpolator(hb.w);
                            this.W0.setDuration(250L);
                            this.W0.addListener(new ry1(this, i, b));
                            pnVar.d();
                            hl.d3(dx1Var, 50L);
                            requestLayout();
                        } else if (!this.Z3) {
                            this.w2.setVisibility(8);
                        }
                    }
                    this.Y0 = false;
                }
                if (i2 == 1 && this.b3 != null) {
                    uc7.s1(this.R).X3.edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.b3.e1()).apply();
                }
                t2(true);
                r2d r2dVar4 = this.I7;
                if (r2dVar4 != null) {
                    ((v2d) r2dVar4).i(z2);
                }
            }
            if (this.m4 || this.n4) {
                P(true);
            }
            if (!this.o4 || i == 1) {
                z4 = false;
            } else {
                z4 = false;
                a2(false, false, false, true);
            }
            y2(z4);
            I();
        }
    }

    public final void j(TLRPC.Document document) {
        Z();
        my1 my1Var = this.V0;
        int i = my1Var.d1;
        ls6.d0(i).d(0, null, document, (int) (System.currentTimeMillis() / 1000), false);
        boolean isEmpty = my1Var.k1.isEmpty();
        my1Var.k1 = ls6.d0(i).j0(0, true);
        g24 g24Var = my1Var.z0;
        if (g24Var != null) {
            g24Var.f();
        }
        if (isEmpty) {
            my1Var.X(false);
        }
    }

    public final boolean j0() {
        if (this.l1) {
            return (this.T2 && this.d1) ? false : true;
        }
        return false;
    }

    public final void j1() {
        tx1 tx1Var;
        this.Y2 = false;
        if (uc7.e1().getBoolean("design_voice_live_field", true)) {
            byte b = 3;
            long[] jArr = {150, 500, 1200};
            for (int i = 0; i < 3; i++) {
                hl.d3(new fw1(this, b), jArr[i]);
            }
        }
        fw1 fw1Var = this.i7;
        if (fw1Var != null) {
            hl.r(fw1Var);
            this.i7 = null;
        }
        if (K0() && A()) {
            return;
        }
        getVisibility();
        if (!this.a3 || org.telegram.ui.ActionBar.e.hasSheets(this.E3)) {
            return;
        }
        this.a3 = false;
        xy1 xy1Var = this.O3;
        if (xy1Var != null) {
            xy1Var.X0();
        }
        if (this.G2 == 0 && (tx1Var = this.F0) != null) {
            tx1Var.requestFocus();
        }
        hl.E3(this.F0);
        if (hl.D || this.o3 || hl.E) {
            return;
        }
        this.Z3 = true;
        dx1 dx1Var = this.g4;
        hl.r(dx1Var);
        hl.d3(dx1Var, 100L);
    }

    public final void j2() {
        xy1 xy1Var = this.O3;
        if ((xy1Var == null || !xy1Var.g()) && wf3.y(this.F3)) {
            TLRPC.Chat M0 = uc7.s1(this.S.a).M0(Long.valueOf(-this.F3));
            d31 b0 = d31.b0(this.E3);
            StringBuilder sb = new StringBuilder();
            if (xc2.p(M0)) {
                sb.append(ob6.M0(2131745335, null));
            }
            if (xc2.u(M0)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(ob6.M0(2131745332, null));
            }
            if (xc2.t(M0)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(ob6.M0(2131745333, null));
            }
            if (xc2.o(M0)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(ob6.M0(2131745336, null));
            }
            if (xc2.l(M0)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(ob6.M0(2131745337, null));
            }
            if (xc2.v(M0)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(ob6.M0(2131745331, null));
            }
            if (xc2.s(M0)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(ob6.M0(2131745334, null));
            }
            if (xc2.m(M0)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(ob6.M0(2131745338, null));
            }
            b0.G(R.raw.passcode_lock_close, 3, ob6.a0("SendPlainTextRestrictionHint", null, 2131745320, sb.toString())).j();
        }
    }

    public final void k(boolean z) {
        zu1 zu1Var;
        if (this.A6 >= 0) {
            ConnectionsManager.getInstance(this.R).cancelRequest(this.A6, true);
            this.A6 = -1;
        }
        dx1 dx1Var = this.D6;
        if (dx1Var != null) {
            hl.r(dx1Var);
            this.D6 = null;
        }
        this.B6 = false;
        dc dcVar = this.y6;
        if (dcVar != null) {
            dcVar.d(false);
        }
        m();
        if (!z || (zu1Var = this.E3) == null) {
            return;
        }
        d31.b0(zu1Var).Q(R.raw.error, 36, "Couldn't rewrite the message. It wasn't sent.").j();
    }

    public final boolean k0(View view, float[] fArr) {
        if (view == null || view.getWidth() <= 0 || !(view.getParent() instanceof View)) {
            return false;
        }
        ((View) view.getParent()).getLocationInWindow(this.g7);
        fArr[0] = (view.getWidth() / 2.0f) + view.getX() + r4[0];
        fArr[1] = (view.getHeight() / 2.0f) + view.getY() + r4[1];
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:(1:281)(1:202)|203|(8:205|(1:279)(1:209)|(1:278)(1:215)|216|(4:218|(1:220)(1:226)|221|(1:225))|(1:228)(1:277)|229|(1:231))(1:280)|232|(3:234|(1:236)(1:238)|237)|239|(3:(1:242)(1:258)|(2:246|(1:256))|257)|259|(4:261|(1:275)(1:265)|266|(5:268|269|270|271|272))|276|269|270|271|272) */
    /* JADX WARN: Can't wrap try/catch for region: R(35:15|(1:17)|18|(1:189)(1:24)|25|(3:27|(1:31)|32)(2:143|(3:145|(1:149)|150)(1:(9:152|(1:154)(1:179)|155|(3:159|(1:161)|162)|163|(3:165|(1:171)|172)|173|(1:177)|178)(1:(23:185|(1:187)|188|34|(1:38)|39|(3:48|(1:50)|51)|(1:142)|54|(2:136|(1:138)(1:139))(1:64)|(1:135)(1:68)|(1:134)(1:72)|(1:133)|(1:86)|(4:(1:89)(1:96)|90|91|(1:95))|(1:132)(1:102)|(1:104)|105|(3:(1:108)(1:124)|(2:112|(1:122))|123)|125|126|127|128))))|33|34|(2:36|38)|39|(6:41|44|46|48|(0)|51)|(0)|140|142|54|(1:56)|136|(0)(0)|(1:66)|135|(1:70)|134|(2:74|76)|133|(1:86)|(0)|(1:98)|132|(0)|105|(0)|125|126|127|128) */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0381  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k1(View view) {
        TLRPC.User user;
        int measuredHeight;
        tx1 tx1Var;
        v47 v47Var;
        t47 t47Var;
        ArrayList arrayList;
        q qVar;
        boolean z;
        v47 v47Var2;
        bz1 s;
        fu5 fu5Var;
        boolean z2;
        boolean z3;
        boolean z4;
        String str;
        ArrayList arrayList2;
        tx1 tx1Var2;
        byte b = 0;
        if (!c()) {
            byte b2 = 5;
            zu1 zu1Var = this.E3;
            if ((zu1Var == null || zu1Var.g4 != 5) && !this.N7.f) {
                boolean z5 = this.k6;
                byte b3 = 16;
                bx1 bx1Var = this.K0;
                vnb vnbVar = this.K4;
                byte b4 = 1;
                if (z5 || !(((tx1Var = this.F0) != null && !TextUtils.isEmpty(tx1Var.getText())) || zu1Var == null || (v47Var = zu1Var.x5) == null || (t47Var = v47Var.b) == null || (arrayList = t47Var.e) == null || arrayList.isEmpty())) {
                    boolean z6 = zu1Var != null && lbc.D(zu1Var.h());
                    if (this.P0 == null) {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(this.D3, vnbVar);
                        this.P0 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
                        this.P0.setOnTouchListener(new mx1(this));
                        this.P0.setDispatchKeyEventListener(new ew1(this));
                        this.P0.setShownFromBottom(false);
                        boolean z7 = zu1Var != null && zu1Var.M4();
                        boolean z8 = !z6 && (this.H0 <= 0 || c());
                        if (z7) {
                            boolean z9 = !z8;
                            b8 b8Var = new b8(0, this.K4, getContext(), true, z9);
                            this.q6 = b8Var;
                            if (z6) {
                                b8Var.j(ob6.M0(2131745242, null), R.drawable.msg_calendar2, null);
                            } else {
                                b8Var.j(ob6.M0(2131745587, null), R.drawable.msg_calendar2, null);
                            }
                            this.q6.setMinimumWidth(hl.L(196.0f));
                            this.q6.setOnClickListener(new pv1(this, (byte) 14));
                            this.P0.a(this.q6, tre.o(-1, 44));
                            boolean z10 = xea.a;
                            SharedPreferences.Editor edit = uc7.e1().edit();
                            edit.putInt("scheduledHintShows", 3);
                            edit.apply();
                            if (!z6 && this.F3 > 0) {
                                b8 b8Var2 = new b8(0, this.K4, getContext(), true, z9);
                                this.c = b8Var2;
                                b8Var2.j(ob6.M0(2131745314, null), R.drawable.msg_online, null);
                                this.c.setMinimumWidth(hl.L(196.0f));
                                this.c.setOnClickListener(new pv1(this, (byte) 15));
                                this.P0.a(this.c, tre.o(-1, 44));
                            }
                        }
                        if (z8) {
                            b8 b8Var3 = new b8(0, this.K4, getContext(), !z7, true);
                            user = null;
                            b8Var3.j(ob6.M0(2131745311, null), R.drawable.input_notify_off, null);
                            b8Var3.setMinimumWidth(hl.L(196.0f));
                            b8Var3.setOnClickListener(new pv1(this, b3));
                            this.P0.a(b8Var3, tre.o(-1, 44));
                        } else {
                            user = null;
                        }
                        nx1 nx1Var = new nx1(this, this.P0);
                        this.O0 = nx1Var;
                        nx1Var.b = false;
                        nx1Var.setAnimationStyle(R.style.PopupContextAnimation2);
                        this.O0.setOutsideTouchable(true);
                        this.O0.setClippingEnabled(true);
                        this.O0.setInputMethodMode(2);
                        this.O0.setSoftInputMode(0);
                        this.O0.getContentView().setFocusableInTouchMode(true);
                        boolean z11 = xea.a;
                        SharedPreferences.Editor edit2 = uc7.e1().edit();
                        edit2.putInt("scheduledOrNoSoundHintShows", 3);
                        edit2.apply();
                        xy1 xy1Var = this.O3;
                        if (xy1Var != null) {
                            xy1Var.O1();
                        }
                    } else {
                        user = null;
                    }
                    b8 b8Var4 = this.q6;
                    if (b8Var4 != null) {
                        b8Var4.setVisibility(this.P ? 8 : 0);
                    }
                    if (this.c != null) {
                        TLRPC.User h = zu1Var == null ? user : zu1Var.h();
                        if (h != null && !h.bot) {
                            TLRPC.UserStatus userStatus = h.status;
                            if (!(userStatus instanceof TLRPC.TL_userStatusEmpty) && !(userStatus instanceof TLRPC.TL_userStatusOnline) && !(userStatus instanceof TLRPC.TL_userStatusRecently) && !(userStatus instanceof TLRPC.TL_userStatusLastMonth) && !(userStatus instanceof TLRPC.TL_userStatusLastWeek)) {
                                this.c.setVisibility(0);
                            }
                        }
                        this.c.setVisibility(8);
                    }
                    this.P0.setupRadialSelectors(J0(aob.I5));
                    this.P0.measure(View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), TLObject.FLAG_31));
                    this.O0.setFocusable(true);
                    int[] iArr = this.C3;
                    view.getLocationInWindow(iArr);
                    if (this.o3) {
                        int measuredHeight2 = getMeasuredHeight();
                        View view2 = this.v2;
                        if (measuredHeight2 > hl.L((view2 == null || view2.getVisibility() != 0) ? 58.0f : 102.0f)) {
                            measuredHeight = view.getMeasuredHeight() + iArr[1];
                            this.O0.showAtLocation(view, 51, hl.L(8.0f) + ((view.getMeasuredWidth() + iArr[0]) - this.P0.getMeasuredWidth()), measuredHeight);
                            this.O0.b();
                            bx1Var.invalidate();
                            view.performHapticFeedback(3, 2);
                            return true;
                        }
                    }
                    measuredHeight = (iArr[1] - this.P0.getMeasuredHeight()) - hl.L(2.0f);
                    this.O0.showAtLocation(view, 51, hl.L(8.0f) + ((view.getMeasuredWidth() + iArr[0]) - this.P0.getMeasuredWidth()), measuredHeight);
                    this.O0.b();
                    bx1Var.invalidate();
                    view.performHapticFeedback(3, 2);
                    return true;
                }
                q67 q67Var = this.M0;
                if (q67Var != null) {
                    q67Var.f(false);
                }
                hl.r(this.p6);
                ox1 ox1Var = new ox1(this, getContext(), vnbVar, b);
                this.M0 = ox1Var;
                ox1Var.setOnDismissListener(new aw1(this, b4));
                boolean z12 = (this.S3 == null && ((tx1Var2 = this.F0) == null || TextUtils.isEmpty(tx1Var2.getText()))) ? false : true;
                ArrayList arrayList3 = new ArrayList();
                if (this.t2 != null) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.id = 0;
                    tL_message.out = true;
                    tL_message.peer_id = uc7.s1(this.R).y1(this.F3);
                    tL_message.from_id = uc7.s1(this.R).y1(yac.h(this.R).e());
                    tL_message.rich_message = this.t2;
                    r47 r47Var = new r47(this.R, tL_message, false, true);
                    r47 r47Var2 = this.I3;
                    if (r47Var2 != null && !r47Var2.p) {
                        r47Var.C = r47Var2;
                    }
                    r47Var.W2 = Boolean.TRUE;
                    r47Var.n0(null);
                    r47Var.w1 = true;
                    r47Var.B0 = true;
                    arrayList3.add(r47Var);
                } else if (this.Q3 != null) {
                    TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                    tL_message2.id = 0;
                    tL_message2.out = true;
                    tL_message2.peer_id = uc7.s1(this.R).y1(this.F3);
                    tL_message2.from_id = uc7.s1(this.R).y1(yac.h(this.R).e());
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                    tL_message2.media = tL_messageMediaDocument;
                    tL_messageMediaDocument.voice = true;
                    tL_messageMediaDocument.document = this.Q3;
                    tL_message2.send_state = 1;
                    tL_message2.attachPath = this.R3;
                    r47 r47Var3 = new r47(this.R, tL_message2, false, true);
                    r47 r47Var4 = this.I3;
                    if (r47Var4 != null && !r47Var4.p) {
                        r47Var3.C = r47Var4;
                    }
                    r47Var3.W2 = Boolean.TRUE;
                    r47Var3.n0(null);
                    r47Var3.w1 = true;
                    r47Var3.B0 = true;
                    arrayList3.add(r47Var3);
                } else if (z12) {
                    TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
                    tL_message3.id = 0;
                    tL_message3.out = true;
                    tL_message3.peer_id = uc7.s1(this.R).y1(this.F3);
                    tL_message3.from_id = uc7.s1(this.R).y1(yac.h(this.R).e());
                    tx1 tx1Var3 = this.F0;
                    CharSequence[] charSequenceArr = {new SpannableStringBuilder(tx1Var3 == null ? "" : tx1Var3.getTextToUse())};
                    r47.d(charSequenceArr[0], true);
                    tL_message3.entities.addAll(ls6.d0(this.R).Y(charSequenceArr, true, true));
                    tL_message3.message = charSequenceArr[0].toString();
                    r47 r47Var5 = this.I3;
                    if (r47Var5 != null && !r47Var5.p) {
                        TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                        r47 r47Var6 = this.J3;
                        if (r47Var6 != null) {
                            tL_messageReplyHeader.flags |= 2;
                            tL_messageReplyHeader.reply_to_top_id = r47Var6.e1();
                        }
                        tL_messageReplyHeader.flags |= 16;
                        tL_messageReplyHeader.reply_to_msg_id = this.I3.e1();
                        tL_message3.reply_to = tL_messageReplyHeader;
                    }
                    if (this.M3 != null) {
                        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                        tL_messageMediaWebPage.webpage = this.M3;
                        if (zu1Var != null && (v47Var2 = zu1Var.x5) != null && v47Var2.o) {
                            boolean z13 = v47Var2.q;
                            tL_messageMediaWebPage.force_small_media = z13;
                            tL_messageMediaWebPage.force_large_media = !z13;
                            tL_message3.invert_media = v47Var2.r;
                        }
                        tL_message3.media = tL_messageMediaWebPage;
                    }
                    r47 r47Var7 = new r47(this.R, tL_message3, false, false);
                    r47 r47Var8 = this.I3;
                    if (r47Var8 != null && !r47Var8.p) {
                        r47Var7.C = r47Var8;
                    }
                    r47Var7.B0 = true;
                    r47Var7.W2 = Boolean.TRUE;
                    r47Var7.D = 0;
                    r47Var7.n0(null);
                    r47Var7.w1 = true;
                    arrayList3.add(r47Var7);
                } else if (zu1Var != null && (qVar = zu1Var.q3) != null && qVar.getTextureView() != null) {
                    q67 q67Var2 = this.M0;
                    TextureView textureView = zu1Var.q3.getTextureView();
                    q67Var2.getClass();
                    if (textureView != null) {
                        q67Var2.l0 = new RectF();
                        int[] iArr2 = new int[2];
                        textureView.getLocationOnScreen(iArr2);
                        q67Var2.l0.set(iArr2[0], iArr2[1], textureView.getWidth() + r10, textureView.getHeight() + iArr2[1]);
                    }
                    z = true;
                    this.M0.r(arrayList3);
                    if (z12 && this.Q3 == null) {
                        q67 q67Var3 = this.M0;
                        tx1 tx1Var4 = this.F0;
                        c cVar = new c(this, (byte) 26);
                        jw1 jw1Var = new jw1(this, b);
                        q67Var3.S = tx1Var4;
                        q67Var3.U = cVar;
                        q67Var3.V = jw1Var;
                    }
                    s = this.M0.s(bx1Var, true, new w6(b4, this, z12));
                    if (s != null && this.y6 != null && z12 && this.Q3 == null && fc.b(this.R, l()) != null) {
                        dc dcVar = this.y6;
                        s.h0 = dcVar;
                        arrayList2 = dcVar.Q;
                        if (!arrayList2.contains(s)) {
                            arrayList2.add(s);
                        }
                        s.invalidate();
                        this.M0.setOnDismissListener(new cf(this, this.y6, s, b2));
                    }
                    if ((!z12 || z) && this.F3 >= 0) {
                        this.M0.a(zu1Var);
                        this.M0.p(this.o7);
                    }
                    fu5 G = fu5.G(this, vnbVar, bx1Var);
                    if (zu1Var == null && !zu1Var.y() && !this.k6 && l() != 0 && fc.b(this.R, l()) != null) {
                        G.a(0, d1(), ob6.M0(2131755004, null), null, aob.F8, aob.E8, new fw1(this, (byte) 14));
                        z2 = true;
                        fu5Var = G;
                    } else if (E()) {
                        fu5Var = G;
                        z2 = false;
                    } else {
                        G.a(0, d1(), ob6.M0(2131754948, null), null, aob.F8, aob.E8, new fw1(this, (byte) 10));
                        fu5Var = G;
                        z2 = true;
                    }
                    z3 = zu1Var == null && lbc.D(zu1Var.h());
                    z4 = zu1Var == null && zu1Var.M4();
                    if (!z3 || (this.H0 > 0 && !c())) {
                        b4 = 0;
                    }
                    if (z2 && (z4 || b4 != 0 || (zu1Var != null && this.O3 != null && xc2.p0(zu1Var.e)))) {
                        fu5Var.j();
                    }
                    if (z4) {
                        fu5Var.b(R.drawable.msg_calendar2, ob6.M0(z3 ? 2131745242 : 2131745587, null), new fw1(this, (byte) 11), false);
                        if (!z3 && this.F3 > 0) {
                            fu5Var.b(R.drawable.msg_online, ob6.M0(2131745314, null), new fw1(this, (byte) 12), false);
                            this.c = fu5Var.z();
                        }
                    }
                    if (zu1Var == null && this.O3 != null && xc2.p0(zu1Var.e)) {
                        str = null;
                        fu5Var.b(R.drawable.input_suggest_paid_24, ob6.M0(2131746798, null), new fw1(this, (byte) 13), false);
                    } else {
                        str = null;
                    }
                    if (b4 != 0) {
                        fu5Var.b(R.drawable.input_notify_off, ob6.M0(2131745311, str), new vv1(this, z12, (byte) 3), false);
                    }
                    fu5Var.Z();
                    if (this.c != null) {
                        TLRPC.User h2 = zu1Var == null ? null : zu1Var.h();
                        if (h2 != null && !h2.bot) {
                            TLRPC.UserStatus userStatus2 = h2.status;
                            if (!(userStatus2 instanceof TLRPC.TL_userStatusEmpty) && !(userStatus2 instanceof TLRPC.TL_userStatusOnline) && !(userStatus2 instanceof TLRPC.TL_userStatusRecently) && !(userStatus2 instanceof TLRPC.TL_userStatusLastMonth) && !(userStatus2 instanceof TLRPC.TL_userStatusLastWeek)) {
                                this.c.setVisibility(0);
                            }
                        }
                        this.c.setVisibility(8);
                    }
                    this.M0.q(fu5Var);
                    this.M0.show();
                    view.performHapticFeedback(3, 2);
                    return false;
                }
                z = false;
                this.M0.r(arrayList3);
                if (z12) {
                    q67 q67Var32 = this.M0;
                    tx1 tx1Var42 = this.F0;
                    c cVar2 = new c(this, (byte) 26);
                    jw1 jw1Var2 = new jw1(this, b);
                    q67Var32.S = tx1Var42;
                    q67Var32.U = cVar2;
                    q67Var32.V = jw1Var2;
                }
                s = this.M0.s(bx1Var, true, new w6(b4, this, z12));
                if (s != null) {
                    dc dcVar2 = this.y6;
                    s.h0 = dcVar2;
                    arrayList2 = dcVar2.Q;
                    if (!arrayList2.contains(s)) {
                    }
                    s.invalidate();
                    this.M0.setOnDismissListener(new cf(this, this.y6, s, b2));
                }
                if (!z12) {
                }
                this.M0.a(zu1Var);
                this.M0.p(this.o7);
                fu5 G2 = fu5.G(this, vnbVar, bx1Var);
                if (zu1Var == null) {
                }
                if (E()) {
                }
                if (zu1Var == null) {
                }
                if (zu1Var == null) {
                }
                if (!z3) {
                }
                b4 = 0;
                if (z2) {
                    fu5Var.j();
                }
                if (z4) {
                }
                if (zu1Var == null) {
                }
                str = null;
                if (b4 != 0) {
                }
                fu5Var.Z();
                if (this.c != null) {
                }
                this.M0.q(fu5Var);
                this.M0.show();
                view.performHapticFeedback(3, 2);
                return false;
            }
        }
        return false;
    }

    public final void k2(boolean z) {
        zu1 zu1Var;
        bn3 bn3Var = this.j1;
        boolean z2 = true;
        boolean z3 = bn3Var != null && bn3Var.q();
        if (z3 || (!(this.s2 || z) || (zu1Var = this.E3) == null || zu1Var.y() || this.O2 != null)) {
            z2 = false;
        } else {
            uc7.s1(this.R);
            boolean z4 = f11.a;
        }
        if (this.v6 == z2) {
            return;
        }
        this.v6 = z2;
        ImageView imageView = this.j2;
        imageView.setVisibility(0);
        imageView.animate().alpha(z2 ? 1.0f : 0.0f).scaleX(z2 ? 1.0f : z3 ? 0.85f : 0.6f).scaleY(z2 ? 1.0f : z3 ? 0.85f : 0.6f).setInterpolator(k43.h).setDuration((z3 || this.w6) ? 150L : 420L).withEndAction(new vv1(this, z2, (byte) 2)).start();
    }

    public final long l() {
        zu1 zu1Var = this.E3;
        return zu1Var != null ? zu1Var.a() : this.F3;
    }

    public final void l0() {
        b6 b6Var = this.e1;
        if (b6Var == null || !(b6Var.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.e1.getLayoutParams();
        int i = j0() ? 80 : 0;
        if (layoutParams.gravity != i) {
            layoutParams.gravity = i;
            this.e1.setLayoutParams(layoutParams);
        }
    }

    public final void l1() {
        int height = this.b2.getHeight();
        if (!this.o3) {
            height -= this.p3;
        }
        xy1 xy1Var = this.O3;
        if (xy1Var != null) {
            xy1Var.C1(height);
        }
        if (this.v2 != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + hl.L(72.0f);
            boolean z = this.W3;
            fm0 fm0Var = this.L7;
            if (height < currentActionBarHeight) {
                if (z) {
                    this.W3 = false;
                    if (this.V3) {
                        fm0Var.a(false, false);
                        return;
                    }
                    return;
                }
                return;
            }
            if (z) {
                return;
            }
            this.W3 = true;
            if (this.V3) {
                fm0Var.a(true, false);
            }
        }
    }

    public final boolean l2() {
        ImageView imageView;
        if (this.O == null && (imageView = this.l2) != null && imageView.getVisibility() == 0) {
            byte b = 2;
            if (uc7.e1().getInt("channelsuggesthint2", 0) < 2) {
                kg5 kg5Var = new kg5(getContext(), 3);
                this.O = kg5Var;
                kg5Var.q(13.0f);
                setHintGlass(this.O);
                this.O.p(true);
                this.O.t(ob6.a0(null, null, 2131744075, ro4.i(this.R, this.F3)));
                this.O.setPadding(hl.L(12.0f), 0, hl.L(12.0f), 0);
                this.O.o(1.0f, -((getWidth() - hl.L(12.0f)) - ((this.l2.getMeasuredWidth() / 2.0f) + (this.l2.getX() + (this.e2.getX() + this.n2.getX())))));
                addView(this.O, tre.d(-1, 200.0f, 48, 0.0f, -192.0f, 0.0f, 0.0f));
                kg5 kg5Var2 = this.O;
                kg5Var2.r0 = new fw1(this, b);
                kg5Var2.d = 8000L;
                kg5Var2.v();
                uc7.e1().edit().putInt("channelsuggesthint2", uc7.e1().getInt("channelsuggesthint2", 0) + 1).apply();
                return true;
            }
        }
        return false;
    }

    public final void m() {
        dc dcVar = this.y6;
        if (dcVar == null || !dcVar.d) {
            return;
        }
        dcVar.d = false;
        dcVar.c();
    }

    public final void m0() {
        RecordCircle recordCircle;
        if (this.u3 || ((recordCircle = this.C2) != null && ChatActivityEnterView.this.j5)) {
            this.u3 = false;
            this.X1 = 0L;
            this.D1 = true;
            try {
                D2(2, true);
                this.D1 = false;
                hl.d3(new fw1(this, (byte) 17), 120L);
            } catch (Throwable th) {
                this.D1 = false;
                throw th;
            }
        }
    }

    public final void m1() {
        uc7.e1().edit().putInt("aihintshown", 3).apply();
        uc7.s1(this.R).Q1().b();
        zu1 zu1Var = this.E3;
        long a = zu1Var != null ? zu1Var.a() : this.F3;
        if (!this.s2) {
            tx1 tx1Var = this.F0;
            if (tx1Var == null) {
                return;
            }
            n1(tx1Var.getText(), new jw1(this, (byte) 2));
            return;
        }
        if (this.t2 != null) {
            b1 b1Var = new b1(getContext(), this.K4);
            b1Var.p1(this.t2);
            b1Var.f2 = new jw1(this, (byte) 1);
            kw1 kw1Var = new kw1(this, a, (byte) 0);
            b1Var.g2 = a;
            b1Var.j2 = kw1Var;
            b1Var.show();
        }
    }

    public final void m2() {
        n2(true, false);
    }

    public final ValueAnimator n(float f) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y2.a, f);
        ofFloat.addUpdateListener(new qv1(this, (byte) 6));
        return ofFloat;
    }

    public final void n0() {
        tx1 tx1Var;
        i0();
        bn3 bn3Var = this.j1;
        if (bn3Var != null && bn3Var.p0 && bn3Var.r == 1) {
            bn3Var.w();
        }
        tx1 tx1Var2 = this.F0;
        if (tx1Var2 != null && tx1Var2.length() > 0) {
            qw1 qw1Var = this.N4;
            qw1Var.getClass();
            ChatActivityEnterView chatActivityEnterView = qw1Var.b;
            chatActivityEnterView.h = 1.0f;
            chatActivityEnterView.x2();
            float f = this.B0 ? 0.5f : 1.0f;
            qw1 qw1Var2 = this.P4;
            qw1Var2.getClass();
            ChatActivityEnterView chatActivityEnterView2 = qw1Var2.b;
            chatActivityEnterView2.n = f;
            chatActivityEnterView2.x2();
        }
        this.X6 = this.u3 && (tx1Var = this.F0) != null && tx1Var.length() > 0;
        try {
            m0();
            this.X6 = false;
            tw1 tw1Var = this.R0;
            if (tw1Var != null) {
                tw1Var.invalidate();
            }
        } catch (Throwable th) {
            this.X6 = false;
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n1(CharSequence charSequence, pcc pccVar) {
        if (this.F0 == null) {
            return;
        }
        zu1 zu1Var = this.E3;
        long a = zu1Var != null ? zu1Var.a() : this.F3;
        Object[] objArr = 0;
        byte b = 1;
        boolean z = fc.b(this.R, l()) != null;
        b1 b1Var = new b1(getContext(), this.K4);
        b1Var.I0 = new lw1(this, z, objArr == true ? 1 : 0);
        b1Var.q1(charSequence);
        b1Var.T2 = new fw1(this, (byte) 23);
        b1Var.e2 = new y0(this, pccVar, (byte) 29);
        b1Var.o1(a, this.O2 != null, new kw1(this, a, b));
        b1Var.show();
    }

    public final void n2(boolean z, boolean z2) {
        if (this.v2 == null || this.U3 || getVisibility() != 0) {
            rw1 rw1Var = this.f1;
            if ((rw1Var == null || rw1Var.getVisibility() != 0) && !this.w3 && this.K3 == null && this.I3 == null) {
                o1();
                return;
            }
            return;
        }
        rw1 rw1Var2 = this.f1;
        boolean z3 = (rw1Var2 == null || rw1Var2.getVisibility() != 0) && !this.w3 && this.K3 == null && (this.c3 == null || this.O2 != null);
        if (!z2 && z && z3 && !this.o3 && !U0()) {
            o1();
            fw1 fw1Var = this.W;
            if (fw1Var != null) {
                hl.r(fw1Var);
            }
            fw1 fw1Var2 = new fw1(this, (byte) 18);
            this.W = fw1Var2;
            hl.d3(fw1Var2, 200L);
            return;
        }
        this.V3 = true;
        this.U3 = true;
        if (this.W3) {
            this.L7.a(true, z);
            if (z3) {
                tx1 tx1Var = this.F0;
                if (tx1Var != null) {
                    tx1Var.requestFocus();
                }
                o1();
            }
        }
    }

    public final ValueAnimator o(boolean z) {
        final float alpha = getSendButtonInternal().getAlpha();
        final float f = z ? 1.0f : 0.0f;
        final float scaleX = getSendButtonInternal().getScaleX();
        final float f2 = z ? 1.0f : 0.1f;
        final float scaleY = getSendButtonInternal().getScaleY();
        final float f3 = z ? 1.0f : 0.1f;
        if (z && alpha < 0.25f && (getSendButtonInternal() instanceof bz1) && SystemClock.uptimeMillis() > this.H1) {
            bz1 bz1Var = (bz1) getSendButtonInternal();
            bz1Var.q0.e(true, 0.0f);
            bz1Var.invalidate();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: hw1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i = ChatActivityEnterView.X7;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                chatActivityEnterView.getSendButtonInternal().setAlpha(hl.R1(alpha, f, floatValue));
                chatActivityEnterView.getSendButtonInternal().setScaleX(hl.R1(scaleX, f2, floatValue));
                chatActivityEnterView.getSendButtonInternal().setScaleY(hl.R1(scaleY, f3, floatValue));
            }
        });
        return ofFloat;
    }

    public final void o0() {
        if (!this.k1 || this.N2 || this.u3) {
            return;
        }
        bn3 bn3Var = this.j1;
        if (bn3Var == null || !bn3Var.q()) {
            if ((this.A0 && !this.T7 && pie.a(getContext())) != this.l1) {
                this.q1.run();
            }
        }
    }

    public void o1() {
        if ((K0() && A()) || org.telegram.ui.ActionBar.e.hasSheets(this.E3)) {
            return;
        }
        xy1 xy1Var = this.O3;
        if (xy1Var != null) {
            xy1Var.X0();
        }
        tx1 tx1Var = this.F0;
        if (tx1Var == null || hl.E3(tx1Var)) {
            return;
        }
        this.F0.clearFocus();
        this.F0.requestFocus();
    }

    public final void o2() {
        AnimatorSet animatorSet = new AnimatorSet();
        try {
            performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "lockAnimatedTranslation", this.Y4);
        ofFloat.setStartDelay(100L);
        ofFloat.setDuration(350L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "snapAnimationProgress", 1.0f);
        ofFloat2.setInterpolator(k43.h);
        ofFloat2.setDuration(250L);
        boolean z = xea.a;
        SharedPreferences.Editor edit = uc7.e1().edit();
        edit.putInt("lockRecordAudioVideoHint", 3);
        edit.apply();
        animatorSet.playTogether(ofFloat2, ofFloat, ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f).setDuration(200L), ObjectAnimator.ofFloat(this.Z1, "cancelToProgress", 1.0f));
        animatorSet.start();
        Q2();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        K();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ix1 ix1Var = this.r0;
        if (ix1Var != null) {
            ix1Var.e = false;
            ix1Var.dismiss();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        x0(canvas, true);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View X;
        if (this.u3) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0 && (X = hl.X(this, motionEvent.getX(), motionEvent.getY())) != this.M && X != this.N) {
            M0();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        qx1 qx1Var;
        super.onLayout(z, i, i2, i3, i4);
        if (this.y7 == -1 || (qx1Var = this.n0) == null) {
            return;
        }
        x46 x46Var = (x46) qx1Var.c.getLayoutManager();
        if (x46Var != null) {
            x46Var.g1(this.y7, this.z7);
        }
        this.y7 = -1;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        rw1 rw1Var = this.o2;
        int measuredHeight = rw1Var.getMeasuredHeight();
        ep0 ep0Var = this.m0;
        ImageView imageView = this.S0;
        tw1 tw1Var = this.R0;
        int i3 = 0;
        if (ep0Var == null || ep0Var.getTag() == null) {
            c8a c8aVar = this.q0;
            if (c8aVar == null || c8aVar.getVisibility() != 0) {
                ((ViewGroup.MarginLayoutParams) tw1Var.getLayoutParams()).leftMargin = hl.L(3.0f);
                if (imageView != null) {
                    ((ViewGroup.MarginLayoutParams) imageView.getLayoutParams()).leftMargin = hl.L(3.0f);
                }
                tx1 tx1Var = this.F0;
                if (tx1Var != null) {
                    ((ViewGroup.MarginLayoutParams) tx1Var.getLayoutParams()).leftMargin = hl.L(50.0f);
                }
                zj9 zj9Var = this.r2;
                if (zj9Var != null) {
                    ((ViewGroup.MarginLayoutParams) zj9Var.getLayoutParams()).leftMargin = hl.L(50.0f);
                }
            } else {
                int i4 = this.q0.getLayoutParams().width;
                this.q0.measure(View.MeasureSpec.makeMeasureSpec(i4, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.q0.getLayoutParams().height, TLObject.FLAG_30));
                ((ViewGroup.MarginLayoutParams) tw1Var.getLayoutParams()).leftMargin = hl.L(7.0f) + i4;
                if (imageView != null) {
                    ((ViewGroup.MarginLayoutParams) imageView.getLayoutParams()).leftMargin = hl.L(7.0f) + i4;
                }
                tx1 tx1Var2 = this.F0;
                if (tx1Var2 != null) {
                    ((ViewGroup.MarginLayoutParams) tx1Var2.getLayoutParams()).leftMargin = hl.L(54.0f) + i4;
                }
                zj9 zj9Var2 = this.r2;
                if (zj9Var2 != null) {
                    ((ViewGroup.MarginLayoutParams) zj9Var2.getLayoutParams()).leftMargin = hl.L(54.0f) + i4;
                }
            }
        } else {
            this.m0.measure(i, i2);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tw1Var.getLayoutParams();
            int L = hl.L(10.0f);
            ep0 ep0Var2 = this.m0;
            marginLayoutParams.leftMargin = L + (ep0Var2 == null ? 0 : ep0Var2.getMeasuredWidth());
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int L2 = hl.L(10.0f);
                ep0 ep0Var3 = this.m0;
                marginLayoutParams2.leftMargin = L2 + (ep0Var3 == null ? 0 : ep0Var3.getMeasuredWidth());
            }
            tx1 tx1Var3 = this.F0;
            if (tx1Var3 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) tx1Var3.getLayoutParams();
                int L3 = hl.L(57.0f);
                ep0 ep0Var4 = this.m0;
                marginLayoutParams3.leftMargin = L3 + (ep0Var4 == null ? 0 : ep0Var4.getMeasuredWidth());
            }
            zj9 zj9Var3 = this.r2;
            if (zj9Var3 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) zj9Var3.getLayoutParams();
                int L4 = hl.L(57.0f);
                ep0 ep0Var5 = this.m0;
                marginLayoutParams4.leftMargin = L4 + (ep0Var5 == null ? 0 : ep0Var5.getMeasuredWidth());
            }
        }
        u2();
        super.onMeasure(i, i2);
        dv1 dv1Var = this.l0;
        if (dv1Var != null) {
            ep0 ep0Var6 = this.m0;
            if (ep0Var6 != null) {
                dv1Var.setMeasuredButtonWidth(ep0Var6.getMeasuredWidth());
            }
            this.l0.getLayoutParams().height = getMeasuredHeight() - hl.L(2.0f);
            measureChild(this.l0, i, i2);
        }
        R();
        S();
        if (measuredHeight <= 0 || rw1Var.getMeasuredHeight() == measuredHeight) {
            return;
        }
        while (i3 < 2) {
            ImageView imageView2 = i3 == 0 ? this.i2 : this.j2;
            imageView2.setTranslationY((imageView2.getTranslationY() + rw1Var.getMeasuredHeight()) - measuredHeight);
            imageView2.animate().translationY(0.0f).setInterpolator(k43.h).setDuration(420L).start();
            i3++;
        }
        kg5 kg5Var = this.N;
        if (kg5Var != null) {
            kg5Var.setTranslationY((kg5Var.getTranslationY() + rw1Var.getMeasuredHeight()) - measuredHeight);
            ik8.t(this.N.animate().translationY(0.0f), k43.h, 420L);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 && this.o4) {
            Z1(0, false);
            this.V0.r(false);
            a2(false, false, false, true);
        }
        qgc qgcVar = this.g1;
        if (qgcVar != null) {
            ArrayList arrayList = qgcVar.w;
            if (qgcVar.O.isEmpty()) {
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    Bitmap bitmap = (Bitmap) arrayList.get(i5);
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                }
            }
            arrayList.clear();
            ngc ngcVar = qgcVar.x;
            if (ngcVar != null) {
                ngcVar.cancel(true);
                qgcVar.x = null;
            }
            qgcVar.invalidate();
        }
    }

    public final void p() {
        float min;
        e29 e29Var = this.h1;
        if (e29Var == null || e29Var.getAnimatedDrawable() != this.D5) {
            return;
        }
        float f = this.H5;
        if (f < 0.72f) {
            float f2 = this.G5;
            min = ((f / 0.72f) * 22.0f * f2) + (8.0f * f2);
        } else {
            min = (Math.min(1.0f, (f - 0.72f) / 0.22999996f) * 14.0f) + 30.0f;
        }
        this.h1.setProgress(min / 52.0f);
        if (this.h1 != null) {
            float f3 = this.H5;
            float i = f3 < 0.72f ? this.G5 : 1.0f - Utilities.i((f3 - 0.72f) / 0.22999996f, 1.0f, 0.0f);
            float f4 = (3.0f - (i * 2.0f)) * i * i * 12.0f;
            float L = hl.L(12.0f);
            this.h1.setPivotX(r5.getWidth() / 2.0f);
            this.h1.setPivotY((r5.getHeight() / 2.0f) + L);
            this.h1.setRotation(f4);
            if (this.i1 != null) {
                double radians = Math.toRadians(f4);
                float L2 = L + hl.L(3.0f);
                x59 x59Var = this.i1;
                float sin = ((float) Math.sin(radians)) * L2;
                float cos = (1.0f - ((float) Math.cos(radians))) * L2;
                mva mvaVar = x59Var.H0;
                mvaVar.S = sin;
                mvaVar.T = cos;
                x59Var.invalidate();
            }
        }
    }

    public final void p0(boolean z, boolean z2) {
        ValueAnimator valueAnimator = this.V6;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.V6 = null;
        }
        this.T6 = z;
        RecordCircle recordCircle = this.C2;
        if (recordCircle != null && this.u3 && z) {
            recordCircle.setAmplitude(0.0d);
        }
        if (z2) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U6, z ? 1.0f : 0.0f);
            this.V6 = ofFloat;
            ofFloat.addUpdateListener(new qv1(this, (byte) 8));
            this.V6.setDuration(220L);
            this.V6.setInterpolator(k43.g);
            this.V6.start();
            return;
        }
        this.U6 = z ? 1.0f : 0.0f;
        l lVar = this.D2;
        if (lVar != null) {
            lVar.invalidate();
        }
        RecordCircle recordCircle2 = this.C2;
        if (recordCircle2 != null) {
            recordCircle2.invalidate();
        }
    }

    public final void p1() {
        if (K0() && A()) {
            return;
        }
        zu1 zu1Var = this.E3;
        if (org.telegram.ui.ActionBar.e.hasSheets(zu1Var)) {
            return;
        }
        i2((hl.D || hl.E || (zu1Var != null && zu1Var.isInBubbleMode()) || this.Y2) ? 0 : 2, 0, true, true);
        xy1 xy1Var = this.O3;
        if (xy1Var != null) {
            xy1Var.X0();
        }
        tx1 tx1Var = this.F0;
        if (tx1Var != null) {
            tx1Var.requestFocus();
        }
        hl.E3(this.F0);
        if (this.Y2) {
            this.a3 = true;
            return;
        }
        if (hl.D || this.o3 || hl.E) {
            return;
        }
        if (zu1Var == null || !zu1Var.isInBubbleMode()) {
            this.Z3 = true;
            my1 my1Var = this.V0;
            if (my1Var != null) {
                my1Var.onTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0));
            }
            dx1 dx1Var = this.g4;
            hl.r(dx1Var);
            hl.d3(dx1Var, 100L);
        }
    }

    public final boolean p2() {
        zu1 zu1Var = this.E3;
        TLRPC.EncryptedChat encryptedChat = zu1Var != null ? zu1Var.h : null;
        return encryptedChat == null || hl.W0(encryptedChat.layer) >= 101;
    }

    public final boolean q0() {
        bn3 bn3Var;
        tx1 tx1Var;
        if (this.c7) {
            return true;
        }
        if (!this.l1 || (bn3Var = this.j1) == null || !bn3Var.r() || this.u3) {
            return false;
        }
        return (!this.j1.s() || this.j1.r == 2) && (tx1Var = this.F0) != null && tx1Var.length() > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q1() {
        zu1 zu1Var;
        Editable editable;
        yg9 yg9Var;
        CharSequence[] charSequenceArr;
        ArrayList Y;
        if (this.F0 == null || (zu1Var = this.E3) == null) {
            return;
        }
        uc7.s1(this.R);
        boolean z = f11.a;
        TL_iv.RichMessage richMessage = this.t2;
        if (richMessage != null) {
            yg9Var = new yg9(richMessage);
        } else {
            Editable text = this.F0.getText();
            if (!TextUtils.isEmpty(text) && TextUtils.indexOf((CharSequence) text, '`') >= 0) {
                try {
                    charSequenceArr = new CharSequence[]{new SpannableStringBuilder(text)};
                    Y = ls6.d0(this.R).Y(charSequenceArr, true, true);
                } catch (Exception e) {
                    cc4.g(e, true);
                }
                if (Y != null && !Y.isEmpty()) {
                    editable = new SpannableStringBuilder(charSequenceArr[0]);
                    r47.b(editable, Y, false, false, false, false, 0);
                    yg9 yg9Var2 = new yg9(editable);
                    if (editable == text) {
                        int selectionStart = this.F0.getSelectionStart();
                        int selectionEnd = this.F0.getSelectionEnd();
                        if (selectionStart < 0) {
                            selectionStart = this.F0.length();
                        }
                        if (selectionEnd < 0) {
                            selectionEnd = selectionStart;
                        }
                        yg9Var2.c = selectionStart;
                        yg9Var2.d = selectionEnd;
                    }
                    yg9Var2.M = new fw1(this, (byte) 7);
                    yg9Var = yg9Var2;
                }
            }
            editable = text;
            yg9 yg9Var22 = new yg9(editable);
            if (editable == text) {
            }
            yg9Var22.M = new fw1(this, (byte) 7);
            yg9Var = yg9Var22;
        }
        yg9Var.setResourceProvider(this.K4);
        yg9Var.K = zu1Var;
        yg9Var.s = zu1Var.U;
        yg9Var.w = zu1Var.a0;
        yg9Var.L = new fw1(this, (byte) 8);
        zu1Var.presentFragment(yg9Var);
    }

    public final void q2() {
        bx1 bx1Var = this.K0;
        if (bx1Var != null) {
            boolean z = fc.b(this.R, l()) != null;
            dc dcVar = this.y6;
            if (dcVar == null) {
                if (!z) {
                    return;
                }
                dcVar = new dc(bx1Var);
                this.y6 = dcVar;
                bx1Var.h0 = dcVar;
                bx1Var.j0 = this;
            }
            if (dcVar.b != z) {
                dcVar.b = z;
                dcVar.c();
            }
            if (z) {
                C0();
            }
        }
    }

    public final void r(boolean z) {
        b29 b29Var;
        boolean z2 = (this.d1 || this.i1 == null) ? false : true;
        this.Z5 = z2;
        boolean z3 = this.J1;
        kc kcVar = this.W1;
        if (z3 == z2) {
            if (!z2) {
                return;
            }
            if (this.S1 != null) {
                c2(false, false);
                V1(z);
                hl.r(kcVar);
                hl.d3(kcVar, 700L);
                return;
            }
        }
        this.J1 = z2;
        this.i1.setNewStyle(z2);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.i1.getLayoutParams();
        layoutParams.height = hl.L(32.0f);
        layoutParams.gravity = z2 ? 83 : 19;
        layoutParams.bottomMargin = z2 ? hl.L(6.0f) : 0;
        layoutParams.leftMargin = hl.L(z2 ? 45.0f : 44.0f);
        layoutParams.rightMargin = hl.L(z2 ? 5.0f : 4.0f);
        this.i1.setLayoutParams(layoutParams);
        qgc qgcVar = this.g1;
        if (qgcVar != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) qgcVar.getLayoutParams();
            layoutParams2.leftMargin = hl.L(z2 ? 45.0f : 56.0f);
            layoutParams2.rightMargin = hl.L(z2 ? 5.0f : 8.0f);
            this.g1.setLayoutParams(layoutParams2);
        }
        e29 e29Var = this.h1;
        if (e29Var != null) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) e29Var.getLayoutParams();
            layoutParams3.gravity = z2 ? 83 : 51;
            this.h1.setLayoutParams(layoutParams3);
            if (z2) {
                if (this.D5 == null) {
                    b29 b29Var2 = new b29(R.raw.chat_audio_record_delete_outline, hl.L(28.0f), hl.L(28.0f), false, null);
                    this.D5 = b29Var2;
                    b29Var2.E(true);
                }
                b29Var = this.D5;
            } else {
                b29Var = this.E5;
            }
            if (b29Var != null && this.h1.getAnimatedDrawable() != b29Var) {
                this.h1.setAnimation(b29Var);
                b29Var.p0 = b29Var != this.D5;
                E2();
                this.h1.setProgress(0.0f);
            }
        }
        this.f1.setClipChildren(!z2);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.f1.getLayoutParams();
        layoutParams4.height = z2 ? -2 : hl.L(44.0f);
        this.f1.setLayoutParams(layoutParams4);
        this.f1.setMinimumHeight(z2 ? hl.L(44.0f) : 0);
        if (!z2) {
            V1(false);
            this.i1.setNewStyleDelegate(null);
            boc bocVar = this.S1;
            if (bocVar != null) {
                this.f1.removeView(bocVar);
                this.S1 = null;
                return;
            }
            return;
        }
        this.i1.setNewStyleDelegate(new fx1(this));
        if (this.S1 == null) {
            boc bocVar2 = new boc(getContext(), this.K4, new gx1(this));
            this.S1 = bocVar2;
            this.f1.addView(bocVar2, tre.d(-1, -2.0f, 80, 48.0f, 0.0f, 0.0f, 0.0f));
        }
        c2(false, false);
        V1(z);
        hl.r(kcVar);
        hl.d3(kcVar, 700L);
    }

    public final boolean r0() {
        bn3 bn3Var;
        return this.l1 && (bn3Var = this.j1) != null && bn3Var.r();
    }

    public final void r1(CharSequence charSequence, CharSequence charSequence2, String str) {
        zu1 zu1Var;
        if (this.F0 == null || (zu1Var = this.E3) == null) {
            return;
        }
        uc7.s1(this.R);
        boolean z = f11.a;
        yg9 yg9Var = new yg9(str);
        yg9Var.h = charSequence;
        yg9Var.n = charSequence2;
        yg9Var.setResourceProvider(this.K4);
        yg9Var.K = zu1Var;
        yg9Var.s = zu1Var.U;
        yg9Var.w = zu1Var.a0;
        yg9Var.M = new mv1(this, (byte) 18);
        yg9Var.L = new mv1(this, (byte) 19);
        zu1Var.presentFragment(yg9Var);
    }

    public final void r2() {
        float f;
        vw1 vw1Var = this.g2;
        if (vw1Var == null) {
            return;
        }
        float f2 = this.E + this.y + this.C7;
        bx1 bx1Var = this.K0;
        if (bx1Var != null) {
            f = bx1Var.getAlpha() * (-c00.d(56.0f, bx1Var.l(), 0));
        } else {
            f = 0.0f;
        }
        vw1Var.setTranslationX(f2 + f);
    }

    public final void s(float f) {
        float i = Utilities.i((f - 0.1f) / 0.9f, 1.0f, 0.0f);
        this.n = V2(0.12f, 0.6f, f) * (this.B0 ? 0.5f : 1.0f);
        float i2 = Utilities.i(i, 1.0f, 0.0f) - 1.0f;
        this.h = hl.R1(0.55f, 1.0f, c00.x(i2, 1.1f, i2, (2.1f * i2 * i2 * i2) + 1.0f));
        x2();
        this.R0.setRotation((1.0f - k43.h.getInterpolation(i)) * (-20.0f));
    }

    public final void s0() {
        float f;
        z92 G0;
        if (this.D2 != null) {
            if (j0() && this.u3) {
                RectF rectF = this.G4;
                if (!rectF.isEmpty() && this.D2.getHeight() > 0 && (G0 = G0()) != null) {
                    this.D2.getLocationInWindow(this.R7);
                    G0.getLocationInWindow(this.S7);
                    f = Math.min(0.0f, (((G0.getInputBubbleTop() + r3[1]) - hl.L(8.0f)) - hl.L(18.0f)) - (rectF.centerY() + (((r4[1] - this.D2.getTranslationY()) + this.b6) + this.c6)));
                    if (Math.abs(f - this.Q7) < 0.5f || (f == 0.0f && this.Q7 != 0.0f)) {
                        this.Q7 = f;
                        this.D2.setTranslationY(this.b6 + this.c6 + f);
                    }
                    return;
                }
            }
            f = 0.0f;
            if (Math.abs(f - this.Q7) < 0.5f) {
            }
            this.Q7 = f;
            this.D2.setTranslationY(this.b6 + this.c6 + f);
        }
    }

    public final void s1() {
        mv1 mv1Var = new mv1(this, (byte) 3);
        if (vye.b(this.R, this.F3) || uc7.s1(this.R).S3.contains(Long.valueOf(this.F3))) {
            mv1Var.run();
            return;
        }
        jj.n(this.E3, uc7.s1(this.R).X1(Long.valueOf(this.F3)), new jj1(this, mv1Var, (byte) 24), new mv1(this, (byte) 4));
    }

    public final void s2() {
        r2();
        oob oobVar = this.e2;
        if (oobVar != null) {
            oobVar.setTranslationX(this.E + this.y + this.C7);
            oobVar.setAlpha(SystemClock.uptimeMillis() < this.B7 ? 0.0f : this.F * this.G);
            oobVar.setVisibility(oobVar.getAlpha() > 0.0f ? 0 : 8);
            vw1 vw1Var = this.g2;
            if (vw1Var != null && this.k6) {
                vw1Var.setAlpha(this.k2 * this.G);
            }
        }
        cx1 cx1Var = this.y2;
        if (cx1Var != null) {
            cx1Var.setTranslationX(cx1Var.a);
        }
    }

    public void setAdjustPanLayoutHelper(hb hbVar) {
        this.V = hbVar;
    }

    public void setAnimatedTop(int i) {
        this.I2 = i;
    }

    public void setBotInfo(zh6 zh6Var) {
        I1(zh6Var, true);
    }

    public void setBotWebViewButtonOffsetX(float f) {
        this.R0.setTranslationX(f);
        if (this.F0 != null) {
            this.H = f;
            B2();
        }
        this.g2.setTranslationX(this.E + this.y + f);
        this.c1.setTranslationX(f);
        vw1 vw1Var = this.m2;
        if (vw1Var != null) {
            vw1Var.setTranslationX(f);
        }
    }

    public void setButtons(r47 r47Var) {
        K1(r47Var, true, true);
    }

    public void setCaption(String str) {
        tx1 tx1Var = this.F0;
        if (tx1Var != null) {
            tx1Var.setCaption(str);
            P(true);
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.S2 = chatFull;
        my1 my1Var = this.V0;
        if (my1Var != null) {
            my1Var.setChatInfo(chatFull);
        }
        cz1 cz1Var = this.G0;
        if (cz1Var != null) {
            cz1Var.b = chatFull != null && chatFull.boosts_unrestrict > 0;
            cz1Var.invalidate();
        }
        if (xc2.i0(chatFull)) {
            return;
        }
        setSlowModeTimer(chatFull.slowmode_next_send_date);
    }

    public void setComposeShadowAlpha(float f) {
        this.m6 = f;
        invalidate();
    }

    public void setCustomWindowView(View view) {
        this.t6 = view;
        this.F0.setWindowView(view);
    }

    public void setDelegate(xy1 xy1Var) {
        this.O3 = xy1Var;
    }

    public void setEditingBusinessLink(TL_account.TL_businessChatLink tL_businessChatLink) {
        String str;
        this.Q2 = tL_businessChatLink;
        y2(false);
        if (this.Q2 != null) {
            Y(true);
            this.u2.setOnClickListener(new pv1(this, (byte) 8));
            this.u2.setContentDescription(ob6.M0(2131751319, null));
            this.u2.setVisibility(0);
            this.u2.setScaleX(0.1f);
            this.u2.setScaleY(0.1f);
            this.u2.setAlpha(0.0f);
            this.u2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(k43.f).start();
            this.d0 = uc7.s1(this.S.a).t1();
            tx1 tx1Var = this.F0;
            TextPaint paint = tx1Var != null ? tx1Var.getPaint() : null;
            if (paint == null) {
                paint = new TextPaint();
                paint.setTextSize(hl.L(18.0f));
            }
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            ArrayList<TLRPC.MessageEntity> arrayList = this.Q2.entities;
            if (arrayList == null || (str = tL_businessChatLink.message) == null) {
                String str2 = tL_businessChatLink.message;
                if (str2 != null) {
                    setFieldText(str2);
                }
            } else {
                setFieldText(q(fontMetricsInt, str, arrayList));
            }
            this.R2 = C();
            G1(false, false, false);
            getSendButtonInternal().setVisibility(8);
            setSlowModeButtonVisible(false);
            this.Q0.setVisibility(8);
            this.a1.setVisibility(8);
            oob oobVar = this.e2;
            if (oobVar != null) {
                oobVar.setVisibility(8);
            }
            vw1 vw1Var = this.g2;
            if (vw1Var != null) {
                this.k2 = 0.0f;
                vw1Var.setAlpha(0.0f);
                vw1Var.setScaleX(0.5f);
                vw1Var.setScaleY(0.5f);
            }
            this.p2.setVisibility(8);
            cx1 cx1Var = this.y2;
            if (cx1Var != null) {
                cx1Var.setVisibility(8);
            }
        }
    }

    public void setEffectId(long j) {
        this.o7 = j;
        bx1 bx1Var = this.K0;
        if (bx1Var != null) {
            bx1Var.setEffect(j);
        }
    }

    public void setExitTransition(float f) {
        this.a5 = f;
        RecordCircle recordCircle = this.C2;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setFieldFocused(boolean z) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.D3.getSystemService("accessibility");
        if (this.F0 == null || accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        if (z && org.telegram.ui.ActionBar.e.hasSheets(this.E3)) {
            z = false;
        }
        if (z) {
            if (this.G2 != 0 || this.F0.isFocused()) {
                return;
            }
            mv1 mv1Var = new mv1(this, (byte) 26);
            this.H2 = mv1Var;
            hl.d3(mv1Var, 600L);
            return;
        }
        tx1 tx1Var = this.F0;
        if (tx1Var == null || !tx1Var.isFocused()) {
            return;
        }
        if (!this.o3 || this.Y2) {
            this.F0.clearFocus();
        }
    }

    @Override // xeb
    public void setFieldText(CharSequence charSequence) {
        Q1(charSequence, false);
    }

    public void setInAppInsetsController(r2d r2dVar) {
        this.I7 = r2dVar;
    }

    public void setLockAnimatedTranslation(float f) {
        this.Z4 = f;
        RecordCircle recordCircle = this.C2;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setOnSendButtonLongClick(View.OnLongClickListener onLongClickListener) {
        if (onLongClickListener == null) {
            onLongClickListener = new iw1(this, (byte) 0);
        }
        this.K0.setOnLongClickListener(onLongClickListener);
    }

    public void setOverrideHint(CharSequence charSequence) {
        W1(charSequence, false);
    }

    public void setOverrideKeyboardAnimation(boolean z) {
        this.w = z;
    }

    public void setRichDraftPreview(TL_iv.RichMessage richMessage) {
        if (this.r2 == null) {
            return;
        }
        uc7.s1(this.R);
        boolean z = f11.a;
        this.t2 = richMessage;
        F2();
    }

    public void setRoundVideoUiFrameClockActive(boolean z) {
        if (this.Y1 != z) {
            this.Y1 = z;
            ez1 ez1Var = this.Z0;
            if (ez1Var != null) {
                ez1Var.setExternalFrameClock(z);
            }
            zy1 zy1Var = this.a2;
            if (zy1Var != null) {
                zy1Var.f = z;
                System.currentTimeMillis();
                zy1Var.h = -1L;
                zy1Var.invalidate();
            }
            SlideTextView slideTextView = this.Z1;
            if (slideTextView != null) {
                slideTextView.H = z;
                System.currentTimeMillis();
                slideTextView.invalidate();
            }
        }
    }

    public void setSelection(int i) {
        tx1 tx1Var = this.F0;
        if (tx1Var == null) {
            return;
        }
        tx1Var.setSelection(i, tx1Var.length());
    }

    public void setSideButtonsForAttach(vz1 vz1Var) {
        oob oobVar;
        vz1 vz1Var2 = this.J7;
        if (vz1Var2 != vz1Var) {
            if (vz1Var2 != null) {
                vz1Var2.e(0, false, true);
            }
            this.J7 = vz1Var;
            vw1 vw1Var = this.g2;
            if (vw1Var == null || (oobVar = this.e2) == null || oobVar.getVisibility() == 0) {
                return;
            }
            boolean z = vz1Var != null && S0();
            boolean z2 = (vz1Var == null || z) ? false : true;
            if (vz1Var != null) {
                vz1Var.e(0, z && !O2(), true);
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f2;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
            }
            ViewPropertyAnimator animate = vw1Var.animate();
            float f = z2 ? 1.0f : 0.0f;
            this.k2 = f;
            ViewPropertyAnimator duration = animate.alpha(f).scaleX(z2 ? 1.0f : 0.5f).scaleY(z2 ? 1.0f : 0.5f).setInterpolator(k43.h).setDuration(320L);
            this.f2 = duration;
            duration.start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setSlideToCancelProgress(float f) {
        RecordCircle recordCircle;
        this.X4 = f;
        float measuredWidth = getMeasuredWidth() * 0.35f;
        if (measuredWidth > hl.L(140.0f)) {
            measuredWidth = hl.L(140.0f);
        }
        this.k5 = (int) ((1.0f - this.X4) * (-measuredWidth));
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = this.I5;
        long j2 = uptimeMillis - j;
        if (j != 0 && j2 <= 120) {
            if (j2 > 0) {
                float f2 = this.K5;
                this.K5 = qd4.A(1.0f, (float) Math.exp((-j2) / 20.0f), (((this.k5 - this.J5) * 1000.0f) / j2) - f2, f2);
            }
            recordCircle = this.C2;
            if (recordCircle == null) {
                recordCircle.invalidate();
                return;
            }
            return;
        }
        this.K5 = 0.0f;
        this.I5 = uptimeMillis;
        this.J5 = this.k5;
        recordCircle = this.C2;
        if (recordCircle == null) {
        }
    }

    public void setSlowModeTimer(int i) {
        this.H0 = i;
        L2();
    }

    public void setSnapAnimationProgress(float f) {
        this.b5 = f;
        invalidate();
    }

    public void setTextTransitionIsRunning(boolean z) {
        this.i0 = z;
        this.p2.invalidate();
    }

    public void setViewParentForEmoji(ViewGroup viewGroup) {
        this.c2 = viewGroup;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        this.s6 = z;
        tx1 tx1Var = this.F0;
        if (tx1Var != null) {
            tx1Var.setEnabled(z);
        }
    }

    public void setVoiceDraft(gs6 gs6Var) {
        File file;
        String str;
        if (gs6Var != null) {
            boolean z = gs6Var.g;
            this.P = z;
            l lVar = this.D2;
            if (lVar != null) {
                lVar.E.f(1, z, true);
            }
            xy1 xy1Var = this.O3;
            TL_stories.StoryItem F0 = xy1Var != null ? xy1Var.F0() : null;
            MediaController z2 = MediaController.z();
            int i = this.R;
            long j = this.F3;
            r47 r47Var = this.I3;
            r47 threadMessage = getThreadMessage();
            c5a c5aVar = null;
            int i2 = this.v3;
            zu1 zu1Var = this.E3;
            if (zu1Var != null) {
                c5aVar = zu1Var.X6();
            }
            long sendMonoForumPeerId = getSendMonoForumPeerId();
            b77 sendMessageSuggestionParams = getSendMessageSuggestionParams();
            to3 to3Var = z2.N1;
            if (z2.I1) {
                v20 v20Var = z2.G1;
                if (v20Var != null && v20Var.b() && z2.g1 != null && (file = z2.k1) != null && (str = gs6Var.a) != null && str.equals(file.getAbsolutePath())) {
                    z2.h1 = i2;
                    z2.r1 = r47Var;
                    z2.s1 = threadMessage;
                    z2.t1 = F0;
                    z2.u1 = c5aVar;
                    z2.p1 = sendMonoForumPeerId;
                    z2.q1 = sendMessageSuggestionParams;
                    jn7.f(z2.i1).k(jn7.o2, new Object[0]);
                    jn7.f(z2.i1).k(jn7.s2, Integer.valueOf(z2.h1), z2.g1, z2.k1.getAbsolutePath(), Boolean.TRUE, Float.valueOf(gs6Var.h), Float.valueOf(gs6Var.i));
                    return;
                }
                if (!z2.a0()) {
                    return;
                }
            }
            z2.y0 = false;
            z2.b0(true);
            to3Var.a(z2.M1);
            to3Var.c(new en6(z2, i2, gs6Var, i, j, sendMonoForumPeerId, sendMessageSuggestionParams, threadMessage, r47Var, F0));
        }
    }

    @Override // s84
    public final void t(int i, float f, float f2, t84 t84Var) {
        rw1 rw1Var;
        float f3 = 0.0f;
        if (i == 0) {
            boc bocVar = this.S1;
            if (bocVar != null) {
                bocVar.setVisibleHeight(f);
            }
            if (this.D2 != null) {
                if (this.J1 && this.Z5 && (rw1Var = this.f1) != null && rw1Var.getVisibility() == 0) {
                    f3 = -Math.max(0.0f, f - hl.L(44.0f));
                }
                this.b6 = f3;
                this.D2.setTranslationY(f3 + this.c6 + this.Q7);
            }
            R();
            S();
        } else if (i == 1) {
            R();
            S();
        } else {
            if (i == 2) {
                n4a n4aVar = this.J0;
                n4aVar.setAlpha(f);
                n4aVar.setScaleX(hl.R1(0.5f, 1.0f, f));
                n4aVar.setScaleY(hl.R1(0.5f, 1.0f, f));
                n4aVar.setVisibility(f <= 0.0f ? 4 : 0);
            } else if (i == 3) {
                float R1 = hl.R1(1.0f, 0.79f, f);
                rw1 rw1Var2 = this.p2;
                rw1Var2.setScaleX(R1);
                rw1Var2.setScaleY(hl.R1(1.0f, 0.79f, f));
                float R12 = hl.R1(0.79f, 1.0f, f);
                ImageView imageView = this.q2;
                imageView.setScaleX(R12);
                imageView.setScaleY(hl.R1(0.79f, 1.0f, f));
                imageView.setVisibility(f <= 0.0f ? 8 : 0);
                imageView.setAlpha(f);
                bx1 bx1Var = this.K0;
                if (bx1Var != null) {
                    bx1Var.setSameWidthFactor(f);
                }
            }
        }
        invalidate();
    }

    public final boolean t0() {
        if (!DictationAsr.G() || this.E3 == null || this.F0 == null) {
            return false;
        }
        if ((this.T2 && this.d1) || !this.z0 || this.l1) {
            return false;
        }
        return (o2f.a() && uc7.e1().getBoolean("design_voice_live_field", true)) ? false : true;
    }

    public final boolean t1() {
        return this.W0 != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b2, code lost:
    
        if (android.text.TextUtils.isEmpty(r15 == null ? "" : hl.m1(r15.getTextToUse())) == false) goto L119;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t2(boolean z) {
        vw1 vw1Var;
        if (this.L4) {
            zu1 zu1Var = this.E3;
            if (zu1Var != null && !zu1Var.f6) {
                z = false;
            }
            boolean K0 = K0();
            boolean z2 = this.U7 != 1 && this.F3 > 0;
            vw1 vw1Var2 = this.m2;
            boolean z3 = vw1Var2 != null && vw1Var2.getVisibility() == 0;
            if (!K0 && !this.e3 && this.c3 == null) {
                vw1 vw1Var3 = this.m2;
                if (vw1Var3 != null) {
                    vw1Var3.setVisibility(8);
                }
            } else if (this.c3 != null) {
                if (U0() && this.U2 == 1 && this.c3.is_persistent) {
                    vw1 vw1Var4 = this.m2;
                    if (vw1Var4 != null && vw1Var4.getVisibility() != 8) {
                        this.m2.setVisibility(8);
                    }
                } else {
                    V();
                    if (this.m2.getVisibility() != 0) {
                        this.m2.setVisibility(0);
                    }
                    this.J2.a(R.drawable.input_bot2, true);
                    this.m2.setContentDescription(ob6.M0(2131754914, "AccDescrBotKeyboard"));
                }
            } else if (z2) {
                vw1 vw1Var5 = this.m2;
                if (vw1Var5 != null) {
                    vw1Var5.setVisibility(8);
                }
            } else {
                V();
                this.J2.a(R.drawable.input_bot1, true);
                this.m2.setContentDescription(ob6.M0(2131754915, "AccDescrBotCommands"));
                this.m2.setVisibility(0);
            }
            if (z2) {
                W();
            }
            vw1 vw1Var6 = this.m2;
            boolean z4 = (vw1Var6 != null && vw1Var6.getVisibility() == 0) != z3;
            ep0 ep0Var = this.m0;
            byte b = 2;
            if (ep0Var != null) {
                boolean z5 = ep0Var.x;
                ep0Var.setWebView(this.U7 == 3);
                ep0 ep0Var2 = this.m0;
                String M0 = this.U7 == 2 ? ob6.M0(2131752872, null) : this.j0;
                if (M0 == null) {
                    ep0Var2.getClass();
                    M0 = ob6.M0(2131752872, null);
                }
                String str = ep0Var2.n;
                boolean z6 = str == null || !str.equals(M0);
                ep0Var2.n = M0;
                ep0Var2.r = null;
                ep0Var2.requestLayout();
                hl.T3(this.m0, z2, 0.5f, true, z);
                z4 = z4 || z6 || z5 != this.m0.x;
            }
            if (z4 && z) {
                tw1 tw1Var = this.R0;
                Float valueOf = Float.valueOf(tw1Var.getX());
                HashMap hashMap = this.C0;
                hashMap.put(tw1Var, valueOf);
                tx1 tx1Var = this.F0;
                if (tx1Var != null) {
                    hashMap.put(tx1Var, Float.valueOf(tx1Var.getX()));
                }
                vw1 vw1Var7 = this.m2;
                boolean z7 = vw1Var7 != null && vw1Var7.getVisibility() == 0;
                if (z7 != z3 && (vw1Var = this.m2) != null) {
                    vw1Var.setVisibility(0);
                    if (z7) {
                        this.m2.setAlpha(0.0f);
                        this.m2.setScaleX(0.1f);
                        this.m2.setScaleY(0.1f);
                    } else if (!z7) {
                        this.m2.setAlpha(1.0f);
                        this.m2.setScaleX(1.0f);
                        this.m2.setScaleY(1.0f);
                    }
                    hl.S3(this.m2, z7, 0.1f, true, 1.0f, true, new qv1(this, b));
                }
            }
            vw1 vw1Var8 = this.m2;
            if (vw1Var8 != null && vw1Var8.getVisibility() == 0) {
                tx1 tx1Var2 = this.F0;
            }
            b = this.l7;
            z2(b);
        }
    }

    public final void u(p7a p7aVar) {
        xy1 xy1Var = this.O3;
        if (xy1Var != null) {
            p7aVar.H = xy1Var.F0();
            p7aVar.J = this.O3.R();
        }
    }

    public final boolean u0(TL_keyboard.KeyboardButtonProto keyboardButtonProto, r47 r47Var, r47 r47Var2, cq1 cq1Var) {
        zu1 zu1Var;
        int i;
        int i2 = 0;
        if (keyboardButtonProto != null && r47Var2 != null && ((zu1Var = this.E3) == null || zu1Var.g4 != 5)) {
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) ehb.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = (TL_keyboard.TL_inlineButtonTypeUserProfile) ehb.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class);
            TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) ehb.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class);
            TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) ehb.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class);
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) ehb.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (tL_inlineButtonTypeCopy != null) {
                hl.g(tL_inlineButtonTypeCopy.copy_text);
                d31.b0(zu1Var).i(ob6.a0(null, null, 2131750849, tL_inlineButtonTypeCopy.copy_text)).k(true);
                return true;
            }
            if (keyboardButtonProto instanceof TL_keyboard.TL_keyboardButton) {
                TL_keyboard.TL_keyboardButton tL_keyboardButton = (TL_keyboard.TL_keyboardButton) keyboardButtonProto;
                if (tL_keyboardButton.type instanceof TL_keyboard.TL_buttonTypeDefault) {
                    p7a b = p7a.b(tL_keyboardButton.text, this.F3, r47Var, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                    b.K = zu1Var != null ? zu1Var.X6() : null;
                    b.O = this.o7;
                    this.o7 = 0L;
                    this.K0.setEffect(0L);
                    r7a.B(this.R).q0(b);
                    return true;
                }
            }
            Activity activity = this.D3;
            if (tL_inlineButtonTypeUrl != null) {
                if (m01.A(tL_inlineButtonTypeUrl.url)) {
                    m01.s(activity, Uri.parse(tL_inlineButtonTypeUrl.url), true, true, cq1Var);
                    return true;
                }
                jj.o0(this.E3, tL_inlineButtonTypeUrl.url, false, true, true, false, cq1Var, null, this.K4);
                return true;
            }
            if (ehb.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPhone.class)) {
                zu1Var.Sb(2, r47Var2);
                return true;
            }
            if (!ehb.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class)) {
                if (ehb.b(keyboardButtonProto)) {
                    TLRPC.Message message = r47Var2.k;
                    long j = message.via_bot_id;
                    if (j == 0) {
                        j = message.from_id.user_id;
                    }
                    long j2 = j;
                    ky1 ky1Var = new ky1(this, r47Var2, j2, keyboardButtonProto, r47Var, uc7.s1(this.R).X1(Long.valueOf(j)));
                    if (vye.b(this.R, j2) || uc7.s1(this.R).S3.contains(Long.valueOf(j2))) {
                        ky1Var.run();
                        return true;
                    }
                    jj.n(zu1Var, uc7.s1(this.R).X1(Long.valueOf(this.F3)), new ue2((Object) this, (Object) ky1Var, j2, (byte) 16), null);
                    return true;
                }
                if (ehb.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    String M0 = ob6.M0(2131745151, "ShareYouLocationTitle");
                    id idVar = alertDialog$Builder.a;
                    idVar.S = M0;
                    idVar.U = ob6.M0(2131745153, "ShareYouLocationInfo");
                    alertDialog$Builder.j(ob6.M0(2131747558, "OK"), new ie((Object) this, (Object) r47Var2, (Object) keyboardButtonProto, (byte) 17));
                    alertDialog$Builder.g(ob6.M0(2131752570, "Cancel"), null);
                    zu1Var.showDialog(idVar);
                    return true;
                }
                if (ehb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || ehb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || ehb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || ehb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
                    r7a.B(this.R).m0(true, r47Var2, keyboardButtonProto, null, null, zu1Var);
                    return true;
                }
                if (tL_inlineButtonTypeSwitchInline != null) {
                    if (!zu1Var.Va(tL_inlineButtonTypeSwitchInline)) {
                        if (!tL_inlineButtonTypeSwitchInline.same_peer) {
                            Bundle j3 = qd4.j(1, "onlySelect", "dialogsType", true);
                            if ((tL_inlineButtonTypeSwitchInline.flags & 2) != 0) {
                                j3.putBoolean("allowGroups", false);
                                j3.putBoolean("allowMegagroups", false);
                                j3.putBoolean("allowLegacyGroups", false);
                                j3.putBoolean("allowUsers", false);
                                j3.putBoolean("allowChannels", false);
                                j3.putBoolean("allowBots", false);
                                ArrayList<TLRPC.InlineQueryPeerType> arrayList = tL_inlineButtonTypeSwitchInline.peer_types;
                                int size = arrayList.size();
                                while (i2 < size) {
                                    TLRPC.InlineQueryPeerType inlineQueryPeerType = arrayList.get(i2);
                                    i2++;
                                    TLRPC.InlineQueryPeerType inlineQueryPeerType2 = inlineQueryPeerType;
                                    if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypePM) {
                                        j3.putBoolean("allowUsers", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBotPM) {
                                        j3.putBoolean("allowBots", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBroadcast) {
                                        j3.putBoolean("allowChannels", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeChat) {
                                        j3.putBoolean("allowLegacyGroups", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeMegagroup) {
                                        j3.putBoolean("allowMegagroups", true);
                                    }
                                }
                            }
                            uj3 uj3Var = new uj3(j3);
                            uj3Var.E2 = new ie((Object) this, (Object) r47Var2, (Object) tL_inlineButtonTypeSwitchInline, (byte) 18);
                            zu1Var.presentFragment(uj3Var);
                            return true;
                        }
                        TLRPC.Message message2 = r47Var2.k;
                        long j4 = message2.from_id.user_id;
                        long j5 = message2.via_bot_id;
                        if (j5 != 0) {
                            j4 = j5;
                        }
                        TLRPC.User X1 = uc7.s1(this.S.a).X1(Long.valueOf(j4));
                        if (X1 != null) {
                            setFieldText("@" + lbc.p(X1) + " " + tL_inlineButtonTypeSwitchInline.query);
                            return true;
                        }
                    }
                } else if (tL_inlineButtonTypeUserProfile != null) {
                    if (uc7.s1(this.R).X1(Long.valueOf(tL_inlineButtonTypeUserProfile.user_id)) != null) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", tL_inlineButtonTypeUserProfile.user_id);
                        zu1Var.presentFragment(new ProfileActivity(bundle, null));
                        return true;
                    }
                } else if (tL_buttonTypeRequestPeer != null) {
                    TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
                    if (requestPeerType == null || r47Var2.k == null) {
                        cc4.d("button.peer_type is null");
                    } else {
                        if (!(requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot)) {
                            if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                                TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                                Boolean bool = tL_requestPeerTypeUser.bot;
                                Boolean bool2 = tL_requestPeerTypeUser.premium;
                                ov1 ov1Var = new ov1(this, r47Var2, tL_buttonTypeRequestPeer);
                                pi7 pi7Var = pi7.p2;
                                org.telegram.ui.ActionBar.e Q = LaunchActivity.Q();
                                if (Q == null || pi7.p2 != null) {
                                    return false;
                                }
                                pi7 pi7Var2 = new pi7(Q, i, bool, bool2, ov1Var);
                                pi7Var2.show();
                                pi7.p2 = pi7Var2;
                                return false;
                            }
                            Bundle j6 = qd4.j(15, "onlySelect", "dialogsType", true);
                            TLRPC.Message message3 = r47Var2.k;
                            if (message3 != null) {
                                TLRPC.Peer peer = message3.from_id;
                                if (peer instanceof TLRPC.TL_peerUser) {
                                    j6.putLong("requestPeerBotId", peer.user_id);
                                }
                            }
                            try {
                                SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                                tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                                j6.putByteArray("requestPeerType", serializedData.toByteArray());
                                serializedData.cleanup();
                            } catch (Exception e) {
                                cc4.g(e, true);
                            }
                            uj3 uj3Var2 = new uj3(j6);
                            uj3Var2.E2 = new ov1(this, r47Var2, tL_buttonTypeRequestPeer);
                            zu1Var.presentFragment(uj3Var2);
                            return false;
                        }
                        TLRPC.User h = getParentFragment() != null ? getParentFragment().h() : uc7.s1(this.R).X1(Long.valueOf(this.F3));
                        if (h != null) {
                            t03.e(getContext(), this.R, h, (TLRPC.TL_requestPeerTypeCreateBot) tL_buttonTypeRequestPeer.peer_type, false, new ku0(this, r47Var2, tL_buttonTypeRequestPeer, h), this.K4, null);
                            return false;
                        }
                    }
                }
                return true;
            }
            TL_keyboard.TL_buttonTypeRequestPoll tL_buttonTypeRequestPoll = (TL_keyboard.TL_buttonTypeRequestPoll) ehb.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class);
            Boolean valueOf = (tL_buttonTypeRequestPoll.flags & 1) != 0 ? Boolean.valueOf(tL_buttonTypeRequestPoll.quiz) : null;
            zu1Var.na();
            f41 f41Var = zu1Var.Y1;
            if (f41Var != null) {
                f41Var.P2 = false;
                f41Var.u3.setVisibility(8);
                f41Var.D1(false, valueOf);
                return false;
            }
        }
        return false;
    }

    public boolean u1() {
        return true;
    }

    public final void u2() {
        int d;
        x46 x46Var;
        int K0;
        View m;
        qx1 qx1Var = this.n0;
        if (qx1Var != null) {
            int childCount = qx1Var.c.getChildCount();
            int i = 0;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.n0.c.getChildAt(i2);
                if (i2 < 4) {
                    i += childAt.getMeasuredHeight();
                }
            }
            wma wmaVar = this.b2;
            if (i > 0) {
                d = c00.d(childCount > 4 ? 12.0f : 0.0f, (wmaVar.getMeasuredHeight() - i) - hl.L(8.0f), 0);
            } else {
                d = this.o0.c.size() > 4 ? c00.d(162.8f, wmaVar.getMeasuredHeight(), 0) : c00.d((Math.max(1, Math.min(4, this.o0.c.size())) * 36) + 8, wmaVar.getMeasuredHeight(), 0);
            }
            if (this.n0.c.getPaddingTop() != d) {
                this.n0.c.setTopGlowOffset(d);
                if (this.y7 == -1 && this.n0.getVisibility() == 0 && this.n0.c.getLayoutManager() != null && (K0 = (x46Var = (x46) this.n0.c.getLayoutManager()).K0()) >= 0 && (m = x46Var.m(K0)) != null) {
                    this.y7 = K0;
                    this.z7 = m.getTop() - this.n0.c.getPaddingTop();
                }
                this.n0.c.setPadding(0, d, 0, hl.L(8.0f));
            }
        }
    }

    @Override // snb
    public final void updateColors() {
        TextPaint textPaint;
        vnb vnbVar = this.K4;
        try {
            tx1 tx1Var = this.F0;
            if (tx1Var != null) {
                yob.l(tx1Var, 34, aob.Me, vnbVar);
                yob.v(this.F0, aob.Ne, vnbVar);
                yob.y(this.F0, aob.mg, vnbVar);
            }
            Paint paint = this.F2;
            if (paint != null) {
                paint.setColor(J0(aob.Sf));
            }
            cz1 cz1Var = this.G0;
            if (cz1Var != null) {
                ((ema) cz1Var.c).setTextColor(J0(aob.Nl));
                cz1Var.invalidate();
            }
            AnimatedArrowDrawable animatedArrowDrawable = this.u4;
            if (animatedArrowDrawable != null) {
                animatedArrowDrawable.a.setColor(J0(aob.Nl));
                animatedArrowDrawable.invalidateSelf();
            }
            bx1 bx1Var = this.K0;
            if (bx1Var != null && this.L0 != 0 && bx1Var.getBackground() != null) {
                int J0 = J0((this.H0 != Integer.MAX_VALUE || Z0()) ? aob.Pe : aob.Nl);
                if (J0 != this.L0) {
                    this.L0 = J0;
                    aob.F1(bx1Var.getBackground(), Color.argb(24, Color.red(J0), Color.green(J0), Color.blue(J0)), true);
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        K();
        bn3 bn3Var = this.j1;
        if (bn3Var != null) {
            bn3Var.P();
        }
        E2();
        RecordCircle recordCircle = this.C2;
        if (recordCircle != null) {
            recordCircle.i();
        }
        zy1 zy1Var = this.a2;
        if (zy1Var != null) {
            zy1Var.f();
        }
        SlideTextView slideTextView = this.Z1;
        if (slideTextView != null) {
            slideTextView.b();
        }
        ez1 ez1Var = this.Z0;
        if (ez1Var != null && (textPaint = ez1Var.G) != null) {
            textPaint.setColor(ez1Var.J.J0(aob.G6));
        }
        qgc qgcVar = this.g1;
        if (qgcVar != null) {
            qgcVar.e.setColor(aob.w0(null, aob.a7, false));
            qgcVar.M = 0;
            ogc ogcVar = qgcVar.Q;
            if (ogcVar != null) {
                ogcVar.b();
            }
        }
        NumberTextView numberTextView = this.c0;
        if (numberTextView != null && this.F0 != null) {
            if (this.e0 - this.d0 < 0) {
                numberTextView.setTextColor(J0(aob.p7));
            } else {
                numberTextView.setTextColor(J0(aob.y6));
            }
        }
        J0(aob.Tf);
        qx1 qx1Var = this.n0;
        if (qx1Var != null) {
            qx1Var.d.setColor(aob.w0(null, aob.zj, false));
            jl0 jl0Var = qx1Var.r;
            if (jl0Var != null) {
                jl0Var.updateColors();
            }
            qx1Var.invalidate();
        }
        jy1 jy1Var = this.w2;
        if (jy1Var != null) {
            jy1Var.d();
        }
        int J02 = this.b1 ? J0(aob.Nl) : -1;
        zw1 zw1Var = this.c1;
        if (zw1Var != null && (!this.u7 || J02 != this.s7)) {
            this.u7 = true;
            this.s7 = J02;
            zw1Var.setColorFilter(new PorterDuffColorFilter(J02, PorterDuff.Mode.SRC_IN));
        }
        int J03 = J0(aob.i6);
        if (this.v7 && J03 == this.t7) {
            return;
        }
        this.v7 = true;
        this.t7 = J03;
        tw1 tw1Var = this.R0;
        if (tw1Var != null) {
            tw1Var.setBackground(aob.f0(J03, 1, -1));
        }
        ImageView imageView = this.S0;
        if (imageView != null) {
            float L = hl.L(19.0f);
            int L2 = hl.L(1.0f);
            int L3 = hl.L(3.0f);
            imageView.setBackground(aob.W(L, J03, L2, L3, L2, L3));
        }
    }

    public final void v(float f) {
        this.U1 = f;
        x59 x59Var = this.i1;
        if (x59Var != null) {
            x59Var.setNewContentAlpha(1.0f);
            this.i1.setAlpha(Math.max(0.0f, 1.0f - (1.8f * f)));
            float R1 = hl.R1(1.0f, 0.94f, f);
            this.i1.setPivotX(hl.L(17.0f));
            this.i1.setPivotY(r4.getHeight() / 2.0f);
            this.i1.setScaleX(R1);
            this.i1.setScaleY(R1);
            this.i1.setTranslationX((-hl.L(20.0f)) * f);
            this.i1.setVisibility(f >= 1.0f ? 4 : 0);
        }
        boc bocVar = this.S1;
        if (bocVar != null) {
            bocVar.setModeProgress(f);
            this.S1.setVisibility(f <= 0.0f ? 8 : 0);
        }
    }

    public final boolean v1() {
        if (this.k7 == 0) {
            return false;
        }
        if (SystemClock.uptimeMillis() < this.k7) {
            return true;
        }
        this.k7 = 0L;
        return false;
    }

    public final void v2(boolean z) {
        if (this.U7 != 1 && this.F3 > 0) {
            W();
        }
        ep0 ep0Var = this.m0;
        if (ep0Var != null) {
            ep0Var.setWebView(K0());
        }
        t2(z);
    }

    public boolean w() {
        return false;
    }

    public final void w0() {
        v47 v47Var;
        b77 b;
        TLRPC.Chat chat;
        int i;
        b77 b2;
        r47 r47Var = this.O2;
        if (r47Var != null) {
            boolean o5 = r47Var.o5();
            zu1 zu1Var = this.E3;
            if (o5 && !xc2.z(this.R, 24, r47.B0(this.O2.k))) {
                if (zu1Var == null || (b2 = zu1Var.y5) == null) {
                    b2 = b77.b(this.O2.k.suggested_post);
                }
                if (!jxa.R(this.R, b2.a)) {
                    if (zu1Var != null) {
                        zu1Var.wc(b2);
                        return;
                    }
                    return;
                }
            }
            if (this.d0 - this.e0 < 0) {
                NumberTextView numberTextView = this.c0;
                if (numberTextView != null) {
                    hl.A3(3.5f, numberTextView, null);
                    try {
                        this.c0.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                if (uc7.s1(this.R).M3() || uc7.s1(this.R).k4.p1.f() <= this.e0) {
                    return;
                }
                f2();
                return;
            }
            byte b3 = 0;
            if (this.G2 != 0) {
                Z1(0, true);
                this.V0.r(false);
                if (this.o4) {
                    a2(false, true, false, true);
                    this.a4 = true;
                    hl.d3(new mv1(this, b3), 200L);
                }
            }
            tx1 tx1Var = this.F0;
            CharSequence textToUse = tx1Var == null ? "" : tx1Var.getTextToUse();
            r47 r47Var2 = this.O2;
            if (r47Var2 == null || r47Var2.D != 19) {
                textToUse = hl.m1(textToUse);
            }
            CharSequence[] charSequenceArr = {textToUse};
            if (TextUtils.isEmpty(charSequenceArr[0])) {
                TLRPC.MessageMedia messageMedia = this.O2.k.media;
                if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) || (messageMedia instanceof TLRPC.TL_messageMediaEmpty) || messageMedia == null) {
                    hl.A3(-3.0f, this.F0, null);
                    yw0.E.a();
                    return;
                }
            }
            ArrayList Y = ls6.d0(this.R).Y(charSequenceArr, p2(), true);
            if (!TextUtils.equals(charSequenceArr[0], this.O2.v) || ((Y != null && !Y.isEmpty()) || !this.O2.k.entities.isEmpty() || (this.O2.k.media instanceof TLRPC.TL_messageMediaWebPage))) {
                r47 r47Var3 = this.O2;
                r47Var3.y1 = charSequenceArr[0];
                r47Var3.z1 = Y;
                r47Var3.A1 = this.N3;
                if (zu1Var != null && (chat = zu1Var.e) != null && (((i = r47Var3.D) == 0 || i == 19) && !xc2.m(chat))) {
                    r47 r47Var4 = this.O2;
                    r47Var4.A1 = false;
                    TLRPC.Message message = r47Var4.k;
                    message.flags &= -513;
                    message.media = null;
                } else if (zu1Var == null || (v47Var = zu1Var.x5) == null) {
                    r47 r47Var5 = this.O2;
                    r47Var5.A1 = false;
                    int i2 = r47Var5.D;
                    if (i2 == 0 || i2 == 19) {
                        TLRPC.Message message2 = r47Var5.k;
                        message2.flags |= 512;
                        message2.media = new TLRPC.TL_messageMediaEmpty();
                    }
                } else {
                    if (zu1Var.Y5 instanceof TLRPC.TL_webPagePending) {
                        r47 r47Var6 = this.O2;
                        r47Var6.A1 = false;
                        int i3 = r47Var6.D;
                        if (i3 == 0 || i3 == 19) {
                            r47Var6.k.media = new TLRPC.TL_messageMediaEmpty();
                            this.O2.k.flags |= 512;
                        }
                    } else {
                        TLRPC.WebPage webPage = v47Var.v;
                        r47 r47Var7 = this.O2;
                        if (webPage != null) {
                            r47Var7.A1 = false;
                            TLRPC.Message message3 = r47Var7.k;
                            message3.flags |= 512;
                            message3.media = new TLRPC.TL_messageMediaWebPage();
                            this.O2.k.media.webpage = zu1Var.x5.v;
                        } else {
                            r47Var7.A1 = false;
                            int i4 = r47Var7.D;
                            if (i4 == 0 || i4 == 19) {
                                TLRPC.Message message4 = r47Var7.k;
                                message4.flags |= 512;
                                message4.media = new TLRPC.TL_messageMediaEmpty();
                            }
                        }
                    }
                    TLRPC.Message message5 = this.O2.k;
                    v47 v47Var2 = zu1Var.x5;
                    message5.invert_media = v47Var2.r;
                    if (v47Var2.o) {
                        TLRPC.MessageMedia messageMedia2 = message5.media;
                        if (messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) {
                            boolean z = v47Var2.q;
                            messageMedia2.force_small_media = z;
                            messageMedia2.force_large_media = !z;
                        }
                    }
                }
                if (this.O2.o5()) {
                    p7a a = p7a.a(r47.B0(this.O2.k), this.O2.y1.toString());
                    if (zu1Var == null || (b = zu1Var.y5) == null) {
                        b = b77.b(this.O2.k.suggested_post);
                    }
                    a.T = b;
                    a.R = wf3.n(this.O2.k.saved_peer_id);
                    a.G = this.O2.t2();
                    r47 r47Var8 = this.O2;
                    a.r = r47Var8;
                    a.D = r47Var8;
                    boolean z2 = r47Var8.F0() instanceof TLRPC.TL_document;
                    r47 r47Var9 = this.O2;
                    if (z2) {
                        a.g = (TLRPC.TL_document) r47Var9.F0();
                        a.b = a.a;
                        a.a = null;
                    } else {
                        TLRPC.MessageMedia messageMedia3 = r47Var9.k.media;
                        if (messageMedia3 != null && !(messageMedia3 instanceof TLRPC.TL_messageMediaEmpty)) {
                            TLRPC.Photo photo = messageMedia3.photo;
                            if (photo instanceof TLRPC.TL_photo) {
                                a.d = (TLRPC.TL_photo) photo;
                            } else {
                                a.c = messageMedia3;
                            }
                            a.b = a.a;
                            a.a = null;
                        }
                    }
                    r7a.B(this.R).q0(a);
                } else {
                    r7a B = r7a.B(this.R);
                    r47 r47Var10 = this.O2;
                    B.s(r47Var10, null, null, null, null, null, null, null, false, r47Var10.t2(), null);
                }
            }
            N1(null, null, false);
        }
    }

    public final void w1(kg5 kg5Var) {
        float f;
        bx1 bx1Var = this.K0;
        if (bx1Var == null || getWidth() == 0) {
            return;
        }
        tx1 tx1Var = this.F0;
        Editable text = tx1Var != null ? tx1Var.getText() : null;
        if (text == null || TextUtils.isEmpty(text.toString().trim())) {
            if (kg5Var.W) {
                kg5Var.f(true);
                return;
            }
            return;
        }
        getLocationInWindow(this.I6);
        boolean z = bx1Var.getParent() instanceof View;
        int[] iArr = this.J6;
        if (z) {
            ((View) bx1Var.getParent()).getLocationInWindow(iArr);
            iArr[0] = bx1Var.getLeft() + iArr[0];
            iArr[1] = bx1Var.getTop() + iArr[1];
        } else {
            bx1Var.getLocationInWindow(iArr);
        }
        float width = bx1Var.getWidth() / 2.0f;
        RectF rectF = this.K6;
        bx1Var.e(rectF);
        if (rectF.width() > 0.0f) {
            float f2 = rectF.top;
            float centerX = rectF.centerX();
            f = f2;
            width = centerX;
        } else {
            f = 0.0f;
        }
        RectF rectF2 = bx1Var.y0;
        if (rectF2 != null && rectF2.width() > 0.0f && Math.abs(rectF2.width() - rectF2.height()) < 1.0f) {
            width = rectF2.centerX();
        }
        float f3 = (iArr[0] - r1[0]) + width;
        float L = ((iArr[1] - r1[1]) + f) - hl.L(5.0f);
        int max = Math.max(0, Math.min(hl.L(8.0f), (int) Math.floor((getWidth() - f3) - hl.L(28.0f))));
        if (kg5Var.getPaddingRight() != max) {
            kg5Var.setPadding(hl.L(8.0f), 0, max, 0);
        }
        kg5Var.o(1.0f, -((getWidth() - max) - f3));
        float L2 = L - hl.L(200.0f);
        if (Math.abs(kg5Var.getTranslationY() - L2) > 0.5f) {
            kg5Var.setTranslationY(L2);
        }
    }

    public final void w2() {
        tx1 tx1Var = this.F0;
        boolean z = false;
        d2((tx1Var == null || tx1Var.getLineCount() <= 2 || this.F0.getText() == null || TextUtils.isEmpty(this.F0.getText().toString().trim())) ? false : true);
        tx1 tx1Var2 = this.F0;
        if (tx1Var2 != null && tx1Var2.getLineCount() > 2 && this.F0.getText() != null && !TextUtils.isEmpty(this.F0.getText().toString().trim())) {
            z = true;
        }
        k2(z);
    }

    public final void x() {
        if (this.V0.getParent() == null) {
            r2d r2dVar = this.I7;
            ViewGroup viewGroup = this.c2;
            my1 my1Var = this.V0;
            if (r2dVar == null) {
                viewGroup.addView(my1Var);
            } else {
                viewGroup.addView(my1Var, tre.c(-1.0f, -1));
            }
        }
    }

    public final void x0(Canvas canvas, boolean z) {
        if (this.i6) {
            int A = (int) qd4.A(1.0f, this.m6, aob.i3.getIntrinsicHeight(), this.I2);
            View view = this.v2;
            if (view != null && view.getVisibility() == 0) {
                A = (int) (((1.0f - getTopViewEnterProgress()) * this.v2.getLayoutParams().height) + A);
            }
            int intrinsicHeight = aob.i3.getIntrinsicHeight() + A;
            if (z) {
                aob.i3.setAlpha((int) (this.m6 * 255.0f));
                aob.i3.setBounds(0, A, getMeasuredWidth(), intrinsicHeight);
                aob.i3.draw(canvas);
            }
            if (!this.h6) {
                float f = intrinsicHeight;
                float width = getWidth();
                float height = getHeight();
                vnb vnbVar = this.K4;
                Paint d = vnbVar != null ? vnbVar.d("paintChatComposeBackground") : null;
                if (d == null) {
                    d = aob.T0("paintChatComposeBackground");
                }
                canvas.drawRect(0.0f, f, width, height, d);
                return;
            }
            int J0 = J0(aob.Je);
            Paint paint = this.l6;
            paint.setColor(J0);
            if (!xea.f() || this.b2 == null) {
                canvas.drawRect(0.0f, intrinsicHeight, getWidth(), getHeight(), paint);
            } else {
                this.n6.set(0, intrinsicHeight, getWidth(), getHeight());
                this.b2.H(canvas, getTop(), this.n6, paint, false);
            }
        }
    }

    public final void x1() {
        oob oobVar = this.e2;
        if (oobVar != null) {
            boolean z = this.F < 0.05f || oobVar.getVisibility() != 0 || oobVar.getAlpha() < 0.05f;
            if (z && this.F >= 0.05f) {
                this.F = 0.0f;
                s2();
            }
            if (z && this.y > hl.L(8.0f)) {
                this.y = hl.L(8.0f);
                s2();
            }
            if (z) {
                oobVar.setPivotX(oobVar.getWidth());
                oobVar.setPivotY(oobVar.getHeight() / 2.0f);
                oobVar.setScaleX(0.88f);
                oobVar.setScaleY(0.88f);
            }
        }
    }

    public final void x2() {
        float f = (1.0f - this.A1) * this.y1;
        float R1 = f > 0.0f ? hl.R1(1.0f, 0.6f, f) : 1.0f;
        float f2 = this.r * this.h * R1;
        tw1 tw1Var = this.R0;
        tw1Var.setScaleX(f2);
        tw1Var.setScaleY(this.r * this.h * R1);
        tw1Var.setAlpha((1.0f - f) * this.s * this.n);
    }

    public final boolean y(boolean z) {
        return SystemClock.uptimeMillis() < this.B7 || z || this.Q3 != null || X0() || O2();
    }

    public final boolean y0(Canvas canvas, hcc hccVar) {
        float f;
        float f2;
        float f3;
        float f4;
        float d = this.G7.d(this.F0.canScrollVertically(-1));
        float d2 = this.H7.d(this.F0.canScrollVertically(1));
        if (d <= 0.0f && d2 <= 0.0f) {
            return ((Boolean) hccVar.run()).booleanValue();
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, this.F0.getX() + this.F0.getMeasuredWidth() + hl.L(5.0f), this.F0.getY() + this.F0.getMeasuredHeight() + hl.L(2.0f), jn7.d4, 31);
        boolean booleanValue = ((Boolean) hccVar.run()).booleanValue();
        canvas.save();
        LinearGradient linearGradient = this.E7;
        Paint paint = this.D7;
        Matrix matrix = this.F7;
        if (d > 0.0f) {
            RectF rectF = hl.P;
            f3 = 255.0f;
            f4 = 16.0f;
            f = 0.0f;
            f2 = 5.0f;
            rectF.set(this.F0.getX() - hl.L(5.0f), (this.F0.getY() + this.I2) - 1.0f, this.F0.getX() + this.F0.getMeasuredWidth() + hl.L(5.0f), this.F0.getY() + this.I2 + hl.L(13.0f));
            matrix.reset();
            matrix.postScale(1.0f, rectF.height() / 16.0f);
            matrix.postTranslate(rectF.left, rectF.top);
            linearGradient.setLocalMatrix(matrix);
            paint.setAlpha((int) (d * 255.0f));
            canvas.drawRect(rectF, paint);
        } else {
            f = 0.0f;
            f2 = 5.0f;
            f3 = 255.0f;
            f4 = 16.0f;
        }
        if (d2 > f) {
            RectF rectF2 = hl.P;
            rectF2.set(this.F0.getX() - hl.L(f2), (this.F0.getY() + this.F0.getMeasuredHeight()) - hl.L(15.0f), this.F0.getX() + this.F0.getMeasuredWidth() + hl.L(f2), this.F0.getY() + this.F0.getMeasuredHeight() + hl.L(2.0f) + 1.0f);
            matrix.reset();
            matrix.postScale(1.0f, rectF2.height() / f4);
            matrix.postRotate(180.0f);
            matrix.postTranslate(rectF2.left, rectF2.bottom);
            linearGradient.setLocalMatrix(matrix);
            paint.setAlpha((int) (d2 * f3));
            canvas.drawRect(rectF2, paint);
        }
        canvas.restore();
        canvas.restore();
        return booleanValue;
    }

    public final void y1(int i, int i2, CharSequence charSequence, boolean z) {
        if (this.F0 == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.F0.getText());
            spannableStringBuilder.replace(i, i2 + i, charSequence);
            if (z) {
                pv3.m(spannableStringBuilder, this.F0.getPaint().getFontMetricsInt(), false, null, 0);
            }
            this.F0.setText(spannableStringBuilder);
            this.F0.setSelection(i + charSequence.length());
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void y2(boolean z) {
        boolean z2;
        boolean z3;
        String str;
        TLRPC.TL_forumTopic tL_forumTopic;
        String str2;
        r47 r47Var;
        TLRPC.ReplyMarkup replyMarkup;
        TLRPC.ReplyMarkup replyMarkup2;
        tx1 tx1Var = this.F0;
        if (tx1Var != null) {
            CharSequence charSequence = this.e;
            boolean z4 = false;
            if (charSequence != null) {
                tx1Var.r(charSequence, z);
                tx1 tx1Var2 = this.F0;
                String str3 = this.f;
                pt3 pt3Var = tx1Var2.v0;
                if (pt3Var != null) {
                    if (!ob6.a0 && z) {
                        z4 = true;
                    }
                    pt3Var.t(str3, z4, true);
                    return;
                }
                return;
            }
            if (!this.A0 && !T0()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" d ".concat(ob6.M0(2131746948, "PlainTextRestrictedHint")));
                spannableStringBuilder.setSpan(new wm2(R.drawable.msg_mini_lock3, 0), 1, 2, 0);
                this.F0.r(spannableStringBuilder, z);
                this.F0.setText((CharSequence) null);
                this.F0.setEnabled(false);
                this.F0.setInputType(1);
                return;
            }
            this.F0.setEnabled(true);
            int inputType = this.F0.getInputType();
            int i = this.a;
            if (inputType != i) {
                this.F0.setInputType(i);
            }
            K2();
            zu1 zu1Var = this.E3;
            boolean z5 = zu1Var != null && zu1Var.g4 == 8 && zu1Var.i4;
            long M1 = zu1Var != null ? zu1Var.getMessagesController().M1(zu1Var.a()) : 0L;
            if (M1 > 0) {
                M1 *= getMessagesCount();
            }
            int i2 = zu1Var != null ? zu1Var.g4 : -1;
            if (i2 == 9) {
                this.F0.setHintText(ob6.M0(2131742526, null));
                return;
            }
            if (i2 == 5) {
                if ("hello".equalsIgnoreCase(zu1Var.f4)) {
                    this.F0.setHintText(ob6.M0(2131752748, null));
                    return;
                }
                boolean equalsIgnoreCase = "away".equalsIgnoreCase(zu1Var.f4);
                tx1 tx1Var3 = this.F0;
                if (equalsIgnoreCase) {
                    tx1Var3.setHintText(ob6.M0(2131752817, null));
                    return;
                } else {
                    tx1Var3.setHintText(ob6.M0(2131752653, null));
                    return;
                }
            }
            wm2[] wm2VarArr = this.j7;
            if (z5) {
                this.F0.setHintText(M1 > 0 ? nza.T0(ob6.a0(null, null, 2131744056, ob6.E((int) M1, ','), wm2VarArr)) : ob6.a0(null, null, 2131744057, new Object[0]));
                wm2 wm2Var = wm2VarArr[0];
                if (wm2Var != null) {
                    wm2Var.H = 0.9f;
                    return;
                }
                return;
            }
            if (this.Q2 != null) {
                this.F0.setHintText(ob6.M0(2131752687, null));
                return;
            }
            r47 r47Var2 = this.I3;
            if (r47Var2 != null && (replyMarkup2 = r47Var2.k.reply_markup) != null && !TextUtils.isEmpty(replyMarkup2.placeholder)) {
                this.F0.r(this.I3.k.reply_markup.placeholder, z);
                return;
            }
            if (this.O2 != null) {
                this.F0.setHintText(this.P2 ? ob6.M0(2131752542, null) : ob6.M0(2131743583, null));
                return;
            }
            if (M1 > 0) {
                this.F0.setHintText(nza.Z0(false, ob6.a0(null, null, 2131743581, ob6.E((int) M1, ',')), wm2VarArr));
                wm2 wm2Var2 = wm2VarArr[0];
                if (wm2Var2 != null) {
                    wm2Var2.H = 0.9f;
                    return;
                }
                return;
            }
            if (this.Y0 && (r47Var = this.b3) != null && (replyMarkup = r47Var.k.reply_markup) != null && !TextUtils.isEmpty(replyMarkup.placeholder)) {
                this.F0.r(this.b3.k.reply_markup.placeholder, z);
                return;
            }
            if (zu1Var != null && zu1Var.V7()) {
                r47 r47Var3 = this.J3;
                if (r47Var3 != null && (tL_forumTopic = r47Var3.j1) != null && (str2 = tL_forumTopic.title) != null) {
                    this.F0.r(ob6.a0(null, null, 2131743580, str2), z);
                    return;
                }
                TLRPC.TL_forumTopic f = uc7.s1(this.R).g4.f(zu1Var.e.id, 1L);
                if (f == null || (str = f.title) == null) {
                    this.F0.r(ob6.M0(2131743583, null), z);
                    return;
                } else {
                    this.F0.r(ob6.a0(null, null, 2131743580, str), z);
                    return;
                }
            }
            if (wf3.y(this.F3)) {
                TLRPC.Chat M0 = uc7.s1(this.S.a).M0(Long.valueOf(-this.F3));
                TLRPC.ChatFull N0 = uc7.s1(this.S.a).N0(-this.F3);
                z3 = xc2.V(M0);
                z2 = !z3 && xc2.M(M0, N0, false) == (-this.F3);
            } else {
                z2 = false;
                z3 = false;
            }
            if (z2) {
                this.F0.setHintText(ob6.M0(2131745366, "SendAnonymously"));
                return;
            }
            TLRPC.User X1 = uc7.s1(this.S.a).X1(Long.valueOf(this.F3));
            if (X1 != null && X1.bot_forum_view && !X1.bot_forum_can_manage_topics && zu1Var != null && !zu1Var.x4) {
                this.F0.setHintText(ob6.M0(2131745361, null));
                return;
            }
            if (zu1Var != null && zu1Var.k8() && !zu1Var.x4) {
                boolean z6 = zu1Var.m4 != null && zu1Var.v4;
                tx1 tx1Var4 = this.F0;
                if (z6) {
                    tx1Var4.setHintText(ob6.M0(2131751970, null));
                    return;
                } else {
                    tx1Var4.setHintText(ob6.M0(2131745990, "Reply"));
                    return;
                }
            }
            if (!z3) {
                this.F0.setHintText(ob6.M0(2131743583, null));
                return;
            }
            boolean z7 = this.V2;
            tx1 tx1Var5 = this.F0;
            if (z7) {
                tx1Var5.r(ob6.M0(2131752257, "ChannelSilentBroadcast"), z);
            } else {
                tx1Var5.r(ob6.M0(2131752421, "ChannelBroadcast"), z);
            }
        }
    }

    public final AnimatorSet z() {
        AnimatorSet animatorSet = new AnimatorSet();
        oob oobVar = this.e2;
        animatorSet.playTogether(ObjectAnimator.ofFloat(oobVar, (Property<oob, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(oobVar, (Property<oob, Float>) View.SCALE_Y, 1.0f));
        return animatorSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0226  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z0(FrameLayout frameLayout, Canvas canvas, float f, float f2, float f3, float f4) {
        jl0 jl0Var;
        float f5;
        x59 x59Var = this.i1;
        float trimProgress = (x59Var == null || !this.J1) ? 0.0f : x59Var.getTrimProgress();
        if (trimProgress <= 0.0f || this.i1.getVisibility() != 0) {
            return;
        }
        x59 x59Var2 = this.i1;
        if (x59Var2.R0 == null && f4 > f3) {
            x59Var2.getLocationInWindow(this.u5);
            float trimHandleX = this.i1.getTrimHandleX() + r10[0];
            float N = hl.N(6.0f);
            float N2 = hl.N(11.0f);
            float trimWindowTop = ((this.i1.getTrimWindowTop() + r10[1]) - hl.N(4.0f)) - N;
            snc sncVar = this.r1;
            jl0 jl0Var2 = null;
            knc kncVar = sncVar != null ? sncVar.L : null;
            float fieldBottomInWindow = kncVar != null ? kncVar.getFieldBottomInWindow() : Float.NaN;
            if (!Float.isNaN(fieldBottomInWindow) && trimWindowTop < hl.N(2.0f) + fieldBottomInWindow && trimWindowTop > fieldBottomInWindow - hl.N(40.0f)) {
                trimWindowTop = Math.min(hl.N(2.0f) + fieldBottomInWindow, (trimWindowTop + N) - hl.N(2.0f));
            }
            String trimBubbleText = this.i1.getTrimBubbleText();
            float L = hl.L(13.0f);
            TextPaint textPaint = this.o5;
            textPaint.setTextSize(L);
            textPaint.setTypeface(hl.n1("fonts/rmedium.ttf"));
            textPaint.setColor(-1);
            float measureText = textPaint.measureText(trimBubbleText);
            float N3 = hl.N(23.0f) + measureText;
            float N4 = hl.N(29.0f);
            float max = Math.max(hl.L(8.0f), Math.min((hl.q.x - hl.L(8.0f)) - N3, trimHandleX - (N3 / 2.0f)));
            RectF rectF = this.t5;
            rectF.set(max, trimWindowTop - N4, max + N3, trimWindowTop);
            float i = Utilities.i(trimHandleX, rectF.right - hl.L(16.0f), rectF.left + hl.L(16.0f));
            Path path = this.r5;
            path.rewind();
            float f6 = N4 / 2.0f;
            path.addRoundRect(rectF, f6, f6, Path.Direction.CW);
            Path path2 = this.s5;
            path2.rewind();
            float f7 = i - N2;
            path2.moveTo(f7, trimWindowTop - hl.N(2.0f));
            path2.lineTo(f7, trimWindowTop);
            float f8 = trimWindowTop + N;
            float f9 = trimWindowTop;
            path2.cubicTo(i - hl.N(6.5f), f9, i - hl.N(3.2f), f8, i, f8);
            float N5 = hl.N(3.2f) + i;
            float N6 = hl.N(6.5f) + i;
            float f10 = i + N2;
            path2.cubicTo(N5, f8, N6, f9, f10, f9);
            path2.lineTo(f10, f9 - hl.N(2.0f));
            path2.close();
            path.op(path2, Path.Op.UNION);
            canvas.save();
            canvas.translate(-f, -f2);
            canvas.clipRect(-100000.0f, f3, 100000.0f, f4);
            float R1 = hl.R1(0.8f, 1.0f, trimProgress);
            canvas.scale(R1, R1, i, f8);
            canvas.translate(0.0f, (1.0f - trimProgress) * hl.L(6.0f));
            ll0 ll0Var = this.K1;
            if (ll0Var != null) {
                boolean z = frameLayout != this;
                jl0Var2 = z ? this.w5 : this.x5;
                if (jl0Var2 == null) {
                    jl0Var = ll0Var.c(frameLayout, this.y5, false);
                    jl0Var.r(0.0f);
                    jl0Var.X = 0.0f;
                    if (z) {
                        this.w5 = jl0Var;
                    } else {
                        this.x5 = jl0Var;
                    }
                    if (jl0Var == null) {
                        canvas.save();
                        canvas.clipPath(path);
                        canvas.translate(f, f2);
                        f5 = 255.0f;
                        jl0Var.setBounds((int) Math.floor(rectF.left - f), (int) Math.floor(rectF.top - f2), (int) Math.ceil(rectF.right - f), (int) Math.ceil(f8 - f2));
                        jl0Var.setAlpha((int) (trimProgress * 255.0f));
                        jl0Var.draw(canvas);
                        canvas.restore();
                    } else {
                        f5 = 255.0f;
                    }
                    int p1 = aob.p1((jl0Var == null ? 0.5f : 0.6f) * trimProgress, -16777216);
                    Paint paint = this.p5;
                    paint.setColor(p1);
                    canvas.drawPath(path, paint);
                    Paint.Style style = Paint.Style.STROKE;
                    Paint paint2 = this.q5;
                    paint2.setStyle(style);
                    paint2.setStrokeWidth(hl.N(0.66f));
                    paint2.setColor(aob.p1(0.16f * trimProgress, -1));
                    canvas.drawPath(path, paint2);
                    textPaint.setAlpha((int) (trimProgress * f5));
                    canvas.drawText(trimBubbleText, rectF.centerX() - (measureText / 2.0f), rectF.centerY() - ((textPaint.ascent() + textPaint.descent()) / 2.0f), textPaint);
                    canvas.restore();
                }
            }
            jl0Var = jl0Var2;
            if (jl0Var == null) {
            }
            int p12 = aob.p1((jl0Var == null ? 0.5f : 0.6f) * trimProgress, -16777216);
            Paint paint3 = this.p5;
            paint3.setColor(p12);
            canvas.drawPath(path, paint3);
            Paint.Style style2 = Paint.Style.STROKE;
            Paint paint22 = this.q5;
            paint22.setStyle(style2);
            paint22.setStrokeWidth(hl.N(0.66f));
            paint22.setColor(aob.p1(0.16f * trimProgress, -1));
            canvas.drawPath(path, paint22);
            textPaint.setAlpha((int) (trimProgress * f5));
            canvas.drawText(trimBubbleText, rectF.centerX() - (measureText / 2.0f), rectF.centerY() - ((textPaint.ascent() + textPaint.descent()) / 2.0f), textPaint);
            canvas.restore();
        }
    }

    public final void z1() {
        a2(false, true, false, true);
        i2(0, 0, false, true);
        if (getEditField() != null && !TextUtils.isEmpty(getEditField().getText())) {
            getEditField().setText("");
        }
        this.u3 = false;
        zw1 zw1Var = this.c1;
        if (zw1Var != null) {
            zw1Var.setVisibility(0);
        }
        this.Z2 = true;
        Y0();
        F();
        Q0();
        l lVar = this.D2;
        if (lVar != null) {
            lVar.setVisibility(8);
        }
        RecordCircle recordCircle = this.C2;
        if (recordCircle != null) {
            recordCircle.h();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z2(int i) {
        ImageView imageView;
        cx1 cx1Var;
        int L;
        cx1 cx1Var2;
        vw1 vw1Var;
        int L2;
        a aVar;
        this.l7 = i;
        if (this.F0 != null) {
            r47 r47Var = this.O2;
            if (r47Var == null || r47Var.o5()) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.F0.getLayoutParams();
                int i2 = layoutParams.rightMargin;
                boolean z = this.k6;
                bx1 bx1Var = this.K0;
                if (z && this.T7) {
                    layoutParams.rightMargin = Math.max(0, bx1Var.l() - hl.L(44.0f)) + hl.L(this.m5 ? 50.0f : 2.0f);
                } else if ((i == 1 || i == 2) && !r0()) {
                    vw1 vw1Var2 = this.m2;
                    if (vw1Var2 == null || vw1Var2.getVisibility() != 0 || (cx1Var2 = this.y2) == null || cx1Var2.getVisibility() != 0 || (vw1Var = this.g2) == null || vw1Var.getVisibility() != 0) {
                        vw1 vw1Var3 = this.m2;
                        if ((vw1Var3 == null || vw1Var3.getVisibility() != 0) && (((imageView = this.x2) == null || imageView.getVisibility() != 0) && ((cx1Var = this.y2) == null || cx1Var.getTag() == null))) {
                            L = hl.L(50.0f);
                            layoutParams.rightMargin = L;
                        } else {
                            L = hl.L(98.0f);
                            layoutParams.rightMargin = L;
                        }
                    } else {
                        L = hl.L(146.0f);
                        layoutParams.rightMargin = L;
                    }
                    if (this.m5) {
                        layoutParams.rightMargin = hl.L(48.0f) + L;
                    }
                } else {
                    cx1 cx1Var3 = this.y2;
                    if (cx1Var3 == null || cx1Var3.getTag() == null) {
                        layoutParams.rightMargin = hl.L(2.0f);
                    } else {
                        layoutParams.rightMargin = hl.L(50.0f);
                    }
                }
                if (r0() || (j0() && this.u3)) {
                    tx1 tx1Var = this.F0;
                    View view = tx1Var == null ? null : (View) tx1Var.getParent();
                    if (view == null || view.getWidth() == 0 || (aVar = this.a1) == null || aVar.getWidth() == 0) {
                        L2 = hl.L(28.0f);
                    } else {
                        view.getLocationInWindow(new int[2]);
                        aVar.getLocationInWindow(new int[2]);
                        L2 = Math.max(hl.L(2.0f), Math.round((view.getWidth() + r6[0]) - ((((aVar.getWidth() / 2.0f) + (r3[0] - aVar.getTranslationX())) - hl.N(41.0f)) - hl.L(8.0f))));
                    }
                    layoutParams.rightMargin = L2;
                }
                layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, bx1Var.l() - hl.L(44.0f)));
                bx1 bx1Var2 = this.u2;
                if (bx1Var2 != null && bx1Var2.getVisibility() == 0) {
                    layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, this.u2.l() - hl.L(44.0f)));
                }
                if (i2 != layoutParams.rightMargin) {
                    this.F0.setLayoutParams(layoutParams);
                }
                rw1 rw1Var = this.f1;
                if (rw1Var != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) rw1Var.getLayoutParams();
                    layoutParams2.rightMargin = this.O2 == null ? c00.d(44.0f, bx1Var.l(), 0) : 0;
                    this.f1.setLayoutParams(layoutParams2);
                }
            }
        }
    }

    @Override // xeb
    public xt3 getEditField() {
        return this.F0;
    }

    @Override // xeb
    public zu1 getParentFragment() {
        return this.E3;
    }

    public void Y0() {
    }

    public void F0(Menu menu) {
    }

    public void f1(float f) {
    }

    public void h1(int i, int i2) {
    }

    @Override // s84
    public final void v0(float f, int i) {
    }
}
