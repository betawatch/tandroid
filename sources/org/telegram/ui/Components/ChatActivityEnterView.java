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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class ChatActivityEnterView extends FrameLayout implements gk7, bja, r0b, bbb, x74, tjb {
    public static final /* synthetic */ int r7 = 0;
    public boolean A0;
    public float A1;
    public gw1 A2;
    public boolean A3;
    public final on A4;
    public oy8 A5;
    public float A6;
    public boolean B0;
    public int B1;
    public boolean B2;
    public int B3;
    public final Paint B4;
    public ValueAnimator B5;
    public ValueAnimator B6;
    public final HashMap C0;
    public final SparseArray C1;
    public AnimatorSet C2;
    public boolean C3;
    public Drawable C4;
    public float C5;
    public ValueAnimator C6;
    public boolean D0;
    public boolean D1;
    public RecordCircle D2;
    public final int[] D3;
    public Drawable D4;
    public float D5;
    public boolean D6;
    public float E;
    public boolean E0;
    public boolean E1;
    public l E2;
    public final Activity E3;
    public Drawable E4;
    public kra E5;
    public oy8 E6;
    public float F;
    public ex1 F0;
    public boolean F1;
    public final nw1 F2;
    public final mu1 F3;
    public Drawable F4;
    public Bitmap F5;
    public final float[] F6;
    public float G;
    public final ly1 G0;
    public long G1;
    public final Paint G2;
    public long G3;
    public Drawable G4;
    public float G5;
    public final float[] G6;
    public float H;
    public int H0;
    public s33 H1;
    public byte H2;
    public boolean H3;
    public final RectF H4;
    public float H5;
    public final int[] H6;
    public float I;
    public av1 I0;
    public long I1;
    public av1 I2;
    public byte I3;
    public final Rect I4;
    public float I5;
    public boolean I6;
    public float J;
    public final u0a J0;
    public boolean J1;
    public int J2;
    public k27 J3;
    public final Rect J4;
    public float J5;
    public av1 J6;
    public boolean K;
    public final ow1 K0;
    public boolean K1;
    public l79 K2;
    public k27 K3;
    public Drawable K4;
    public float K5;
    public final cm2[] K6;
    public TLRPC.UserFull L;
    public int L0;
    public kl0 L1;
    public Editable L2;
    public bu1 L3;
    public final wjb L4;
    public float L5;
    public byte L6;
    public je5 M;
    public j47 M0;
    public il0 M1;
    public boolean M2;
    public k27 M3;
    public final boolean M4;
    public float M5;
    public byte M6;
    public je5 N;
    public long N0;
    public il0 N1;
    public boolean N2;
    public TLRPC.WebPage N3;
    public final qw1 N4;
    public float N5;
    public boolean N6;
    public je5 O;
    public zw1 O0;
    public final Paint O1;
    public boolean O2;
    public boolean O3;
    public final bw1 O4;
    public boolean O5;
    public long O6;
    public boolean P;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout P0;
    public float P1;
    public k27 P2;
    public hy1 P3;
    public final bw1 P4;
    public final Paint P5;
    public int P6;
    public boolean Q;
    public final ImageView Q0;
    public ValueAnimator Q1;
    public boolean Q2;
    public zx1 Q3;
    public final bw1 Q4;
    public boolean Q5;
    public int Q6;
    public int R;
    public final ew1 R0;
    public final int[] R1;
    public TL_account.TL_businessChatLink R2;
    public TLRPC.TL_document R3;
    public final bw1 R4;
    public float R5;
    public boolean R6;
    public j5 S;
    public final ImageView S0;
    public final int[] S1;
    public cy1 S2;
    public String S3;
    public final bw1 S4;
    public float S5;
    public boolean S6;
    public boolean T;
    public gw1 T0;
    public ojc T1;
    public TLRPC.ChatFull T2;
    public k27 T3;
    public boolean T4;
    public float T5;
    public py T6;
    public int U;
    public boolean U0;
    public boolean U1;
    public boolean U2;
    public oac U3;
    public long U4;
    public float U5;
    public cs5 U6;
    public gb V;
    public wx1 V0;
    public float V1;
    public int V2;
    public boolean V3;
    public float V4;
    public boolean V5;
    public int V6;
    public uv1 W;
    public AnimatorSet W0;
    public ValueAnimator W1;
    public boolean W2;
    public boolean W3;
    public float W4;
    public boolean W5;
    public int W6;
    public boolean X0;
    public final jc X1;
    public boolean X2;
    public boolean X3;
    public float X4;
    public boolean X5;
    public vf6 X6;
    public boolean Y0;
    public long Y1;
    public boolean Y2;
    public k27 Y3;
    public float Y4;
    public boolean Y5;
    public final Paint Y6;
    public my1 Z0;
    public boolean Z1;
    public boolean Z2;
    public TL_keyboard.KeyboardButtonProto Z3;
    public float Z4;
    public boolean Z5;
    public final LinearGradient Z6;
    public int a;
    public aj1 a0;
    public final a a1;
    public SlideTextView a2;
    public boolean a3;
    public boolean a4;
    public float a5;
    public final Paint a6;
    public final Matrix a7;
    public boolean b;
    public boolean b0;
    public boolean b1;
    public jy1 b2;
    public boolean b3;
    public boolean b4;
    public float b5;
    public float b6;
    public final lm b7;
    public a8 c;
    public NumberTextView c0;
    public final mw1 c1;
    public final cja c2;
    public k27 c3;
    public boolean c4;
    public float c5;
    public final Rect c6;
    public final lm c7;
    public LinearLayout d;
    public int d0;
    public boolean d1;
    public ViewGroup d2;
    public TLRPC.TL_replyKeyboardMarkup d3;
    public boolean d4;
    public float d5;
    public boolean d6;
    public byc d7;
    public CharSequence e;
    public int e0;
    public a6 e1;
    public int e2;
    public int e3;
    public int e4;
    public float e5;
    public final uv1 e6;
    public dz1 e7;
    public String f;
    public k33 f0;
    public cw1 f1;
    public final pkb f2;
    public boolean f3;
    public boolean f4;
    public float f5;
    public a8 f6;
    public final y74 f7;
    public Runnable g0;
    public scc g1;
    public ViewPropertyAnimator g2;
    public PowerManager.WakeLock g3;
    public boolean g4;
    public boolean g5;
    public ArrayList g6;
    public final fm0 g7;
    public float h;
    public boolean h0;
    public ry8 h1;
    public final gw1 h2;
    public AnimatorSet h3;
    public final qw1 h4;
    public boolean h5;
    public boolean h6;
    public final fm0 h7;
    public boolean i0;
    public i29 i1;
    public final gc i2;
    public AnimatorSet i3;
    public final ef0 i4;
    public int i5;
    public View i6;
    public final fm0 i7;
    public String j0;
    public jm3 j1;
    public final ImageView j2;
    public AnimatorSet j3;
    public final ax1 j4;
    public long j5;
    public boolean j6;
    public float j7;
    public String k0;
    public boolean k1;
    public final ImageView k2;
    public AnimatorSet k3;
    public final b k4;
    public boolean k5;
    public boolean k6;
    public float k7;
    public qu1 l0;
    public boolean l1;
    public float l2;
    public byte l3;
    public final f l4;
    public ValueAnimator l5;
    public boolean l6;
    public float l7;
    public ep0 m0;
    public boolean m1;
    public ImageView m2;
    public boolean m3;
    public final Paint m4;
    public final TextPaint m5;
    public cc m6;
    public final int[] m7;
    public float n;
    public cx1 n0;
    public boolean n1;
    public gw1 n2;
    public int n3;
    public boolean n4;
    public final Paint n5;
    public bn3 n6;
    public final int[] n7;
    public dp0 o0;
    public boolean o1;
    public final cw1 o2;
    public int o3;
    public boolean o4;
    public final Paint o5;
    public int o6;
    public boolean o7;
    public boolean p0;
    public Drawable p1;
    public final cw1 p2;
    public boolean p3;
    public boolean p4;
    public final Path p5;
    public boolean p6;
    public int p7;
    public k4a q0;
    public final av1 q1;
    public final cw1 q2;
    public int q3;
    public boolean q4;
    public final Path q5;
    public boolean q6;
    public int q7;
    public float r;
    public uw1 r0;
    public gjc r1;
    public final ImageView r2;
    public final boolean r3;
    public AnimatorSet r4;
    public final RectF r5;
    public qw1 r6;
    public float s;
    public av1 s0;
    public boolean s1;
    public ig9 s2;
    public long s3;
    public float s4;
    public final int[] s5;
    public long s6;
    public int t0;
    public boolean t1;
    public boolean t2;
    public float t3;
    public int t4;
    public final int[] t5;
    public long t6;
    public int u0;
    public float u1;
    public TL_iv.RichMessage u2;
    public float u3;
    public boolean u4;
    public il0 u5;
    public om3 u6;
    public av1 v0;
    public float v1;
    public ow1 v2;
    public boolean v3;
    public AnimatedArrowDrawable v4;
    public il0 v5;
    public final RectF v6;
    public boolean w;
    public ValueAnimator w0;
    public float w1;
    public View w2;
    public int w3;
    public boolean w4;
    public final pd5 w5;
    public boolean w6;
    public Runnable x;
    public float x0;
    public boolean x1;
    public tx1 x2;
    public boolean x3;
    public boolean x4;
    public boolean x5;
    public long x6;
    public float y;
    public boolean y0;
    public float y1;
    public final ImageView y2;
    public boolean y3;
    public boolean y4;
    public kx1 y5;
    public ru3 y6;
    public boolean z0;
    public float z1;
    public pw1 z2;
    public boolean z3;
    public final i z4;
    public oy8 z5;
    public boolean z6;

    /* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
        public final fk0 h;
        public final fk0 n;
        public final float r;
        public final float s;
        public final RectF w;
        public boolean x;
        public final m y;

        public RecordCircle(Context context) {
            super(context);
            fk0 fk0Var = new fk0(11, 360928);
            this.h = fk0Var;
            fk0 fk0Var2 = new fk0(12, 360928);
            this.n = fk0Var2;
            this.r = gl.N(41.0f);
            this.s = gl.L(30.0f);
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
            m mVar = new m(this, this);
            this.y = mVar;
            jdc.k(this, mVar);
            fk0Var.a = gl.L(47.0f);
            fk0Var.b = gl.L(55.0f);
            fk0Var.b();
            fk0Var2.a = gl.L(47.0f);
            fk0Var2.b = gl.L(55.0f);
            fk0Var2.b();
            float scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            this.F = scaledTouchSlop * scaledTouchSlop;
            h();
        }

        public static float d(float f) {
            float i = Utilities.i(f, 1.0f, 0.0f);
            return i < 0.5f ? yjb.C(i, 4.0f, i, i) : 1.0f - (((float) Math.pow((i * (-2.0f)) + 2.0f, 3.0d)) / 2.0f);
        }

        public static float e(float f) {
            float i = 1.0f - Utilities.i(f, 1.0f, 0.0f);
            return oo1.v(i, i, i, 1.0f);
        }

        public static float i(float f, float f2) {
            if (f <= 0.0f) {
                return 0.0f;
            }
            return (float) (Math.sin(f * 3.141592653589793d * 2.0d * f2) * Math.exp((-f) * 8.5d));
        }

        public final void a() {
            ChatActivityEnterView.this.g5 = true;
        }

        public final void b() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            wjb wjbVar = chatActivityEnterView.L4;
            if (chatActivityEnterView.E4 != null) {
                return;
            }
            Drawable mutate = getResources().getDrawable(R.drawable.input_mic_pressed).mutate();
            chatActivityEnterView.E4 = mutate;
            int i = bkb.Sf;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            zkb.x(this, mutate, i, wjbVar, mode);
            Drawable mutate2 = getResources().getDrawable(R.drawable.input_video_pressed).mutate();
            chatActivityEnterView.F4 = mutate2;
            zkb.x(this, mutate2, i, wjbVar, mode);
            Drawable mutate3 = getResources().getDrawable(R.drawable.send_plane_24).mutate();
            chatActivityEnterView.G4 = mutate3;
            zkb.x(this, mutate3, i, wjbVar, mode);
            Drawable mutate4 = getResources().getDrawable(R.drawable.input_mic).mutate();
            chatActivityEnterView.C4 = mutate4;
            int i2 = bkb.Ml;
            zkb.x(this, mutate4, i2, wjbVar, mode);
            Drawable mutate5 = getResources().getDrawable(R.drawable.input_video).mutate();
            chatActivityEnterView.D4 = mutate5;
            zkb.x(this, mutate5, i2, wjbVar, mode);
        }

        public final void c(Canvas canvas, Drawable drawable, Drawable drawable2, float f, int i) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            float f2 = drawable == chatActivityEnterView.G4 ? (this.d0 * 0.1f) + 1.0f : 1.0f;
            if (f2 != 1.0f) {
                canvas.save();
                canvas.scale(f2, f2, drawable.getBounds().exactCenterX(), drawable.getBounds().exactCenterY());
            }
            b();
            if (f == 0.0f || f == 1.0f || drawable2 == null) {
                boolean z = chatActivityEnterView.g5;
                a aVar = chatActivityEnterView.a1;
                if (z) {
                    float f3 = chatActivityEnterView.Y4;
                    if (f3 == 1.0f) {
                        chatActivityEnterView.c1.setAlpha(1.0f);
                        if (aVar != null) {
                            aVar.setAlpha(1.0f);
                            aVar.setScaleX(1.0f);
                            aVar.setScaleY(1.0f);
                        }
                        setVisibility(8);
                    } else if (f3 < 1.0f) {
                        drawable.setAlpha(kk7.d4);
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

        public final void f(boolean z) {
            this.P = false;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (!z) {
                chatActivityEnterView.h5 = false;
                chatActivityEnterView.a5 = -1.0f;
                chatActivityEnterView.Z4 = -1.0f;
                chatActivityEnterView.Y4 = 1.0f;
                chatActivityEnterView.f5 = 1.0f;
                chatActivityEnterView.c5 = 0.0f;
                chatActivityEnterView.X4 = 0.0f;
            }
            invalidate();
            chatActivityEnterView.e5 = 0.0f;
            chatActivityEnterView.U0();
            chatActivityEnterView.b5 = 0.0f;
            chatActivityEnterView.W4 = 0.0f;
            chatActivityEnterView.V4 = 0.0f;
            chatActivityEnterView.T4 = false;
            this.f = 0.0f;
            chatActivityEnterView.g5 = false;
            l lVar = chatActivityEnterView.E2;
            if (lVar != null) {
                lVar.invalidate();
            }
        }

        public final void g() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.h5 = false;
            invalidate();
            l lVar = chatActivityEnterView.E2;
            if (lVar != null) {
                lVar.invalidate();
            }
        }

        public float getControlsScale() {
            return ChatActivityEnterView.this.X4;
        }

        public float getScale() {
            return ChatActivityEnterView.this.W4;
        }

        public float getTransformToSeekbarProgressStep3() {
            return this.e;
        }

        public final void h() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            Paint paint = chatActivityEnterView.B4;
            int i = bkb.Tf;
            paint.setColor(chatActivityEnterView.F0(i));
            this.h.d.setColor(bm2.o(chatActivityEnterView.F0(i), 38));
            this.n.d.setColor(bm2.o(chatActivityEnterView.F0(i), 76));
            this.E = paint.getAlpha();
        }

        @Override // android.view.View
        public final void invalidate() {
            super.invalidate();
            l lVar = ChatActivityEnterView.this.E2;
            if (lVar != null) {
                lVar.invalidate();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:133:0x04b9  */
        /* JADX WARN: Removed duplicated region for block: B:139:0x04d5  */
        /* JADX WARN: Removed duplicated region for block: B:200:0x0ad1  */
        /* JADX WARN: Removed duplicated region for block: B:220:0x0be1  */
        /* JADX WARN: Removed duplicated region for block: B:238:0x0bc6  */
        /* JADX WARN: Removed duplicated region for block: B:280:0x0bd1  */
        /* JADX WARN: Removed duplicated region for block: B:286:0x03d2  */
        /* JADX WARN: Removed duplicated region for block: B:288:0x03a6  */
        /* JADX WARN: Removed duplicated region for block: B:289:0x0395  */
        /* JADX WARN: Removed duplicated region for block: B:290:0x0331  */
        /* JADX WARN: Removed duplicated region for block: B:295:0x02e5  */
        /* JADX WARN: Removed duplicated region for block: B:301:0x0279  */
        /* JADX WARN: Removed duplicated region for block: B:303:0x0255  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x022c  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0261  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x028b  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0323  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0347  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x03a3  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x03ac  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x03cd  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x03db  */
        @Override // android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onDraw(Canvas canvas) {
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            boolean g0;
            float f9;
            int i;
            float[] fArr;
            float f10;
            Paint paint;
            float f11;
            float f12;
            float f13;
            Drawable drawable;
            Drawable drawable2;
            boolean z;
            boolean e;
            int i2;
            float f14;
            float f15;
            Drawable drawable3;
            Drawable drawable4;
            float f16;
            int i3;
            int i4;
            float f17;
            Drawable drawable5;
            Drawable drawable6;
            Paint paint2;
            Rect rect;
            float f18;
            Paint paint3;
            int i5;
            int i6;
            float f19;
            Drawable drawable7;
            char c;
            char c2;
            float f20;
            float f21;
            i29 i29Var;
            int[] iArr;
            float f22;
            int i7;
            float f23;
            float f24;
            float f25;
            float cos;
            float f26;
            float f27;
            float f28;
            Paint paint4;
            Path path;
            float f29;
            RectF rectF;
            Canvas canvas2;
            float f30;
            float f31;
            Paint paint5;
            RectF rectF2;
            i29 i29Var2;
            Drawable drawable8;
            Canvas canvas3 = canvas;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            Rect rect2 = chatActivityEnterView.I4;
            Paint paint6 = chatActivityEnterView.B4;
            if (this.O) {
                return;
            }
            if (this.P) {
                int i8 = ChatActivityEnterView.r7;
                Paint paint7 = chatActivityEnterView.P5;
                if (chatActivityEnterView.O5) {
                    if (chatActivityEnterView.F5 != null) {
                        float f32 = chatActivityEnterView.K5 / 1000.0f;
                        float i9 = Utilities.i((f32 - 0.04f) / 0.2f, 1.0f, 0.0f);
                        float R1 = gl.R1(chatActivityEnterView.I5, chatActivityEnterView.J5, i9);
                        if (i9 < 1.0f) {
                            canvas3.save();
                            canvas3.clipRect(R1, chatActivityEnterView.H5, chatActivityEnterView.G5 + chatActivityEnterView.F5.getWidth(), chatActivityEnterView.H5 + chatActivityEnterView.F5.getHeight());
                            paint7.setAlpha((int) ((1.0f - ChatActivityEnterView.G2(0.015f, 0.09f, f32)) * 255.0f));
                            canvas3.drawBitmap(chatActivityEnterView.F5, chatActivityEnterView.G5, chatActivityEnterView.H5, paint7);
                            canvas3.restore();
                        }
                    }
                    kra kraVar = chatActivityEnterView.E5;
                    if (kraVar != null && kraVar.b(canvas3, 1.0f)) {
                        invalidate();
                    }
                }
                this.d = System.currentTimeMillis();
                return;
            }
            int measuredWidth = getMeasuredWidth() - gl.M(26.0f);
            int L = (int) (gl.L(170.0f) + 0.0f);
            this.K = chatActivityEnterView.i5 + measuredWidth;
            float f33 = L;
            this.L = f33;
            float f34 = chatActivityEnterView.W4;
            float f35 = f34 <= 0.5f ? f34 / 0.5f : f34 <= 0.75f ? 1.0f - (((f34 - 0.5f) / 0.25f) * 0.1f) : (((f34 - 0.75f) / 0.25f) * 0.1f) + 0.9f;
            long currentTimeMillis = System.currentTimeMillis() - this.d;
            float f36 = this.b;
            float f37 = this.a;
            if (f36 != f37) {
                float f38 = this.c;
                f = 1.0f;
                float f39 = (currentTimeMillis * f38) + f37;
                this.a = f39;
                if (f38 > 0.0f) {
                    if (f39 > f36) {
                        this.a = f36;
                    }
                } else if (f39 < f36) {
                    this.a = f36;
                }
                invalidate();
            } else {
                f = 1.0f;
            }
            float interpolation = chatActivityEnterView.g5 ? s33.g.getInterpolation(f - chatActivityEnterView.Y4) * 0.7f : (chatActivityEnterView.Y4 * 0.3f) + 0.7f;
            float f40 = this.s * this.a;
            float f41 = this.r;
            float f42 = (f40 + f41) * f35 * interpolation;
            this.e = 0.0f;
            float f43 = chatActivityEnterView.e5;
            if (f43 != 0.0f) {
                f2 = 0.6f;
                if (chatActivityEnterView.i1 != null) {
                    float f44 = f43 > 0.38f ? f : f43 / 0.38f;
                    float f45 = f43 > 0.63f ? f : oo1.f(f43, 0.38f, 0.25f, 0.0f);
                    this.e = Math.max(0.0f, ((chatActivityEnterView.e5 - 0.38f) - 0.25f) / 0.37f);
                    s33 s33Var = s33.j;
                    f8 = s33Var.getInterpolation(f44);
                    float interpolation2 = s33Var.getInterpolation(f45);
                    this.e = s33Var.getInterpolation(this.e);
                    float L2 = gl.L(8.0f);
                    f3 = f41;
                    float A = tb4.A(f, interpolation2, ((gl.L(16.0f) * f8) + f42) - L2, L2);
                    f5 = interpolation2;
                    f4 = A;
                    f6 = 0.0f;
                    f7 = 1.0f;
                    g0 = chatActivityEnterView.g0();
                    float f46 = f6;
                    float[] fArr2 = this.b0;
                    float f47 = f7;
                    if (g0) {
                        f9 = f8;
                        i = 2;
                    } else {
                        i = 2;
                        if (chatActivityEnterView.A6 <= 0.0f || chatActivityEnterView.b5 != 0.0f) {
                            f9 = f8;
                        } else {
                            float L3 = gl.L(19.0f);
                            if (chatActivityEnterView.E0(fArr2)) {
                                L3 = fArr2[2];
                            }
                            f9 = f8;
                            f4 = gl.R1(f4, L3, chatActivityEnterView.A6);
                        }
                    }
                    if (this.e <= 0.0f) {
                        fArr = fArr2;
                        paint6.setColor(bm2.f(this.e, chatActivityEnterView.F0(bkb.Tf), chatActivityEnterView.F0(bkb.ag)));
                    } else {
                        fArr = fArr2;
                        paint6.setColor(chatActivityEnterView.F0(bkb.Tf));
                    }
                    b();
                    if (chatActivityEnterView.h5) {
                        f10 = f4;
                        paint = paint6;
                        f11 = f5;
                        f12 = f42;
                        f13 = 12.0f;
                        drawable = chatActivityEnterView.d1 ? chatActivityEnterView.F4 : chatActivityEnterView.E4;
                        rect2.set(measuredWidth - gl.L(12.0f), L - gl.L(12.0f), gl.L(12.0f) + measuredWidth, gl.L(12.0f) + L);
                        drawable2 = null;
                    } else {
                        float f48 = this.f;
                        f13 = 12.0f;
                        if (f48 != 1.0f) {
                            float f49 = (currentTimeMillis / 150.0f) + f48;
                            this.f = f49;
                            if (f49 > 1.0f) {
                                this.f = 1.0f;
                            }
                            drawable8 = chatActivityEnterView.d1 ? chatActivityEnterView.F4 : chatActivityEnterView.E4;
                        } else {
                            drawable8 = null;
                        }
                        drawable = chatActivityEnterView.G4;
                        f11 = f5;
                        int i10 = i;
                        f12 = f42;
                        paint = paint6;
                        f10 = f4;
                        rect2.set(oo1.A(i10, measuredWidth, drawable), oo1.y(i10, L, drawable), oo1.w(i10, measuredWidth, drawable), oo1.i(i10, L, drawable));
                        if (drawable8 != null) {
                            drawable8.setBounds(oo1.A(i10, measuredWidth, drawable8), oo1.y(i10, L, drawable8), oo1.w(i10, measuredWidth, drawable8), oo1.i(i10, L, drawable8));
                        }
                        drawable2 = drawable8;
                    }
                    Drawable drawable9 = drawable;
                    drawable9.setBounds(rect2);
                    z = this.x;
                    float f50 = chatActivityEnterView.d5;
                    if (z) {
                        float f51 = f50 - 0.01f;
                        chatActivityEnterView.d5 = f51;
                        if (f51 < 0.0f) {
                            this.x = true;
                            chatActivityEnterView.d5 = 0.0f;
                        }
                    } else {
                        float f52 = f50 + 0.01f;
                        chatActivityEnterView.d5 = f52;
                        if (f52 > 1.0f) {
                            this.x = false;
                            chatActivityEnterView.d5 = 1.0f;
                        }
                    }
                    e = e66.e(360928);
                    fk0 fk0Var = this.n;
                    fk0 fk0Var2 = this.h;
                    if (e) {
                        i2 = 1;
                    } else {
                        fk0Var2.a = gl.L(47.0f);
                        i2 = 1;
                        fk0Var2.b = (gl.L(15.0f) * 0.6f) + gl.L(47.0f);
                        fk0Var.a = gl.L(50.0f);
                        fk0Var.b = (gl.L(f13) * 0.6f) + gl.L(50.0f);
                        fk0Var.f(currentTimeMillis);
                        fk0Var.e(fk0Var.t, 1.01f);
                        fk0Var2.f(currentTimeMillis);
                        fk0Var2.e(fk0Var2.t, 1.02f);
                    }
                    this.d = System.currentTimeMillis();
                    float f53 = chatActivityEnterView.Y4;
                    float f54 = f53 <= 0.7f ? 1.0f : f53 / 0.7f;
                    if (chatActivityEnterView.E1) {
                        float f55 = chatActivityEnterView.b5;
                        if (f55 > 0.0f) {
                            f14 = 1.0f;
                            f15 = 1.0f - s33.g.getInterpolation(Math.min(1.0f, f55));
                            float f56 = (chatActivityEnterView.g0() ? f14 - chatActivityEnterView.A6 : f14) * f15;
                            if (e66.e(360928) || f11 == f14 || ((f46 >= 0.4f && (!chatActivityEnterView.E1 || f56 <= 0.01f)) || f54 <= 0.0f || chatActivityEnterView.g5)) {
                                drawable3 = drawable9;
                                drawable4 = drawable2;
                                f16 = 0.01f;
                                i3 = 0;
                            } else {
                                if (this.J) {
                                    float f57 = this.I;
                                    if (f57 != 1.0f) {
                                        float f58 = f57 + 0.04f;
                                        this.I = f58;
                                        if (f58 > 1.0f) {
                                            this.I = 1.0f;
                                        }
                                    }
                                }
                                float f59 = this.Q;
                                boolean z2 = chatActivityEnterView.t1;
                                f16 = 0.01f;
                                i3 = 0;
                                float A2 = tb4.A(z2 ? 1.0f : 0.0f, f59, 0.18f, f59);
                                this.Q = A2;
                                if (Math.abs((z2 ? 1.0f : 0.0f) - A2) > 0.01f) {
                                    invalidate();
                                }
                                if (this.N || this.Q >= 0.99f) {
                                    drawable3 = drawable9;
                                    drawable4 = drawable2;
                                } else {
                                    float interpolation3 = (1.0f - this.Q) * s33.g.getInterpolation(this.I);
                                    canvas3.save();
                                    float f60 = 1.0f - f9;
                                    drawable3 = drawable9;
                                    drawable4 = drawable2;
                                    float z3 = yjb.z(fk0Var.t, 1.4f, 0.878f, yjb.C(chatActivityEnterView.W4 * f56, f60, f54, interpolation3));
                                    canvas3.scale(z3, z3, chatActivityEnterView.i5 + measuredWidth, f33);
                                    fk0Var.a(chatActivityEnterView.i5 + measuredWidth, f33, canvas3, fk0Var.d);
                                    canvas3.restore();
                                    float f61 = ((fk0Var2.t * 1.4f) + 0.926f) * f56 * chatActivityEnterView.W4 * f60 * f54 * interpolation3;
                                    canvas3.save();
                                    canvas3.scale(f61, f61, chatActivityEnterView.i5 + measuredWidth, f33);
                                    fk0Var2.a(chatActivityEnterView.i5 + measuredWidth, f33, canvas3, fk0Var2.d);
                                    canvas3.restore();
                                }
                            }
                            float max = (chatActivityEnterView.g5 || chatActivityEnterView.Y4 >= 1.0f) ? f10 : Math.max(f10, gl.L(19.0f));
                            if (this.N) {
                                i4 = measuredWidth;
                                f17 = f33;
                                drawable5 = drawable3;
                                drawable6 = drawable4;
                                paint2 = paint;
                            } else {
                                paint2 = paint;
                                paint2.setAlpha((int) (this.E * f47));
                                if (chatActivityEnterView.W4 == 1.0f) {
                                    float f62 = chatActivityEnterView.e5;
                                    int i11 = (f62 == 0.0f || !chatActivityEnterView.K1 || chatActivityEnterView.d1 || (i29Var2 = chatActivityEnterView.i1) == null || i29Var2.S) ? i3 : i2;
                                    RectF rectF3 = this.w;
                                    if (i11 != 0) {
                                        float f63 = chatActivityEnterView.i5 + measuredWidth;
                                        int[] iArr2 = chatActivityEnterView.S1;
                                        int[] iArr3 = chatActivityEnterView.R1;
                                        c = 4;
                                        a aVar = chatActivityEnterView.a1;
                                        c2 = 3;
                                        float f64 = chatActivityEnterView.e5;
                                        f20 = 3.0f;
                                        View view = (View) chatActivityEnterView.i1.getParent();
                                        float f65 = 0.0f;
                                        float f66 = 0.0f;
                                        while (true) {
                                            i5 = i11;
                                            if (view == null || view == getParent()) {
                                                break;
                                            }
                                            f65 = view.getY() + f65;
                                            f66 = view.getX() + f66;
                                            view = view.getParent() instanceof View ? (View) view.getParent() : null;
                                            i11 = i5;
                                        }
                                        float y = (chatActivityEnterView.i1.getY() + f65) - getY();
                                        float measuredHeight = chatActivityEnterView.i1.getMeasuredHeight() + y;
                                        float x = ((chatActivityEnterView.i1.getX() + f66) - getX()) + chatActivityEnterView.J;
                                        float x2 = (((chatActivityEnterView.i1.getX() + chatActivityEnterView.i1.getMeasuredWidth()) + f66) - getX()) - chatActivityEnterView.J;
                                        float min = Math.min(measuredHeight - y, gl.L(32.0f));
                                        float f67 = (y + measuredHeight) / 2.0f;
                                        float N = gl.N(19.0f);
                                        i6 = measuredWidth;
                                        float[] fArr3 = this.a0;
                                        boolean E0 = chatActivityEnterView.E0(fArr3);
                                        int[] iArr4 = this.V;
                                        if (E0) {
                                            getLocationInWindow(iArr4);
                                            float f68 = fArr3[i3] - iArr4[i3];
                                            rect = rect2;
                                            f24 = fArr3[i2] - iArr4[i2];
                                            iArr = iArr4;
                                            f23 = fArr3[2];
                                            f22 = f68;
                                            i7 = i2;
                                        } else if (aVar == null || aVar.getWidth() <= 0) {
                                            iArr = iArr4;
                                            f22 = f63;
                                            i7 = i3;
                                            f23 = N;
                                            rect = rect2;
                                            f24 = f33;
                                        } else {
                                            getLocationInWindow(iArr4);
                                            iArr = iArr4;
                                            aVar.getLocationInWindow(this.W);
                                            f22 = ((aVar.getWidth() + (r12[i3] - iArr[i3])) - gl.N(3.0f)) - N;
                                            float height = ((aVar.getHeight() + (r12[i2] - iArr[i2])) - gl.N(3.0f)) - N;
                                            rect = rect2;
                                            f24 = height;
                                            f23 = N;
                                            i7 = i3;
                                        }
                                        f18 = max;
                                        float d = d(f64 / 0.62f);
                                        paint3 = paint2;
                                        float f69 = f64 - 0.5f;
                                        float max2 = 0.56f * Math.max(0.0f, f69);
                                        float i12 = i(max2, 5.2f);
                                        float i13 = i(max2 - 0.02f, 4.4f);
                                        float z4 = yjb.z(i12, 0.07f, 1.0f, gl.R1(f12, f23, d));
                                        float R12 = gl.R1(f63, f22, d);
                                        float R13 = gl.R1(f33, f24, d);
                                        float e2 = e(f64 / 0.58f);
                                        float f70 = f64 / 0.5f;
                                        float B = yjb.B(i13, 0.09f, 1.0f, gl.R1(Math.min(min, 1.1f * z4) * 0.8f, min, e(f70)));
                                        float L4 = gl.L(16.0f);
                                        if (f64 < 0.5f) {
                                            f25 = i13;
                                            cos = gl.R1(R12 - (z4 * 0.35f), x2 - L4, e(f70));
                                            f19 = f33;
                                        } else {
                                            f25 = i13;
                                            f19 = f33;
                                            cos = x2 - (L4 * ((float) (Math.cos(((max2 * 3.141592653589793d) * 2.0d) * 2.6d) * Math.exp((-max2) * 13.0f))));
                                        }
                                        float R14 = gl.R1((R12 - (z4 * 0.35f)) - B, x, d((f64 - 0.16f) / 0.6f)) - (gl.L(5.0f) * f25);
                                        float R15 = gl.R1(R13, f67, e2);
                                        float min2 = Math.min(R14, cos - B);
                                        float f71 = B / 2.0f;
                                        RectF rectF4 = this.U;
                                        rectF4.set(min2, R15 - f71, cos, R15 + f71);
                                        int f72 = bm2.f(d((f64 - 0.6f) / 0.4f), chatActivityEnterView.F0(bkb.Tf), chatActivityEnterView.F0(bkb.Oe));
                                        Paint paint8 = this.T;
                                        paint8.setColor(f72);
                                        paint8.setAlpha((int) (this.E * 1.0f));
                                        Path path2 = this.S;
                                        path2.rewind();
                                        Path.Direction direction = Path.Direction.CW;
                                        path2.addCircle(R12, R13, z4, direction);
                                        float f73 = cos - f71;
                                        if (f64 < 0.5f) {
                                            f28 = d;
                                            float max3 = Math.max(gl.N(0.6f), 0.85f * f71 * ((float) Math.pow(1.0d - Math.pow(f70, 1.4d), 1.2d)));
                                            float f74 = R12 - f73;
                                            if (f74 <= 0.0f) {
                                                f29 = z4;
                                                f27 = R13;
                                                paint4 = paint8;
                                                f26 = R12;
                                                path = path2;
                                            } else {
                                                double i14 = (Utilities.i(1.0f - (((f74 - f71) - z4) / (f71 + z4)), 1.0f, 0.15f) * 45.0f) + 25.0f;
                                                float radians = (float) Math.toRadians(i14);
                                                float radians2 = (float) Math.toRadians(i14);
                                                double d2 = radians;
                                                float cos2 = (((float) Math.cos(d2)) * f71) + f73;
                                                float sin = R15 - (((float) Math.sin(d2)) * f71);
                                                float sin2 = (((float) Math.sin(d2)) * f71) + R15;
                                                double d3 = radians2;
                                                float cos3 = R12 - (((float) Math.cos(d3)) * z4);
                                                f29 = z4;
                                                f27 = R13;
                                                float sin3 = f27 - (((float) Math.sin(d3)) * f29);
                                                f26 = R12;
                                                float sin4 = (((float) Math.sin(d3)) * f29) + f27;
                                                float f75 = (cos2 + cos3) / 2.0f;
                                                float f76 = (R15 + f27) / 2.0f;
                                                path2.moveTo(cos2, sin);
                                                float f77 = f76 - max3;
                                                paint4 = paint8;
                                                path2.cubicTo(gl.R1(cos2, f75, 0.55f), gl.R1(sin, f77, 0.9f), gl.R1(f75, cos2, 0.3f), f77, f75, f77);
                                                path2.cubicTo(gl.R1(f75, cos3, 0.3f), f77, gl.R1(cos3, f75, 0.55f), gl.R1(sin3, f77, 0.9f), cos3, sin3);
                                                path = path2;
                                                path.lineTo(cos3, sin4);
                                                float R16 = gl.R1(cos3, f75, 0.55f);
                                                float f78 = f76 + max3;
                                                path2.cubicTo(R16, gl.R1(sin4, f78, 0.9f), gl.R1(f75, cos3, 0.3f), f78, f75, f78);
                                                path2.cubicTo(gl.R1(f75, cos2, 0.3f), f78, gl.R1(cos2, f75, 0.55f), gl.R1(sin2, f78, 0.9f), cos2, sin2);
                                                path.close();
                                            }
                                        } else {
                                            f26 = R12;
                                            f27 = R13;
                                            f28 = d;
                                            paint4 = paint8;
                                            path = path2;
                                            f29 = z4;
                                        }
                                        int i15 = f64 >= 0.5f ? i2 : i3;
                                        if (i15 == 0) {
                                            path.addRoundRect(rectF4, f71, f71, direction);
                                            i29 i29Var3 = chatActivityEnterView.i1;
                                            i29Var3.Q.set(rectF4);
                                            i29Var3.R = -1.0f;
                                            i29Var3.invalidate();
                                            rectF = rectF3;
                                        } else {
                                            getLocationInWindow(iArr3);
                                            chatActivityEnterView.i1.getLocationInWindow(iArr2);
                                            rectF = rectF3;
                                            rectF.set(rectF4);
                                            rectF.offset(iArr3[i3] - iArr2[i3], iArr3[i2] - iArr2[i2]);
                                            i29 i29Var4 = chatActivityEnterView.i1;
                                            float e3 = (e(f69 / 0.5f) * 0.65f) + 0.35f;
                                            i29Var4.Q.set(rectF);
                                            i29Var4.R = e3;
                                            i29Var4.invalidate();
                                        }
                                        float d4 = 1.0f - d((f64 - 0.72f) / 0.28f);
                                        if (d4 < 1.0f) {
                                            int alpha = paint4.getAlpha();
                                            paint5 = paint4;
                                            paint5.setAlpha((int) (alpha * d4));
                                            canvas2 = canvas;
                                            f30 = f27;
                                            f31 = f26;
                                            canvas2.drawCircle(f31, f30, f29, paint5);
                                            paint5.setAlpha(alpha);
                                            path.rewind();
                                            if (i15 == 0) {
                                                path.addRoundRect(rectF4, f71, f71, direction);
                                            }
                                        } else {
                                            canvas2 = canvas;
                                            f30 = f27;
                                            f31 = f26;
                                            paint5 = paint4;
                                        }
                                        canvas2.drawPath(path, paint5);
                                        if (d4 > 0.0f) {
                                            canvas2.save();
                                            float centerX = f31 - drawable3.getBounds().centerX();
                                            float f79 = f30 - f19;
                                            if (i7 != 0) {
                                                float f80 = (fArr3[3] - iArr[i3]) - drawable3.getBounds().left;
                                                float f81 = (fArr3[4] - iArr[i2]) - drawable3.getBounds().top;
                                                float f82 = f28;
                                                centerX = gl.R1(centerX, f80, f82);
                                                f79 = gl.R1(f79, f81, f82);
                                            }
                                            canvas2.translate(centerX, f79);
                                            canvas3 = canvas;
                                            rectF2 = rectF;
                                            Drawable drawable10 = drawable3;
                                            drawable6 = drawable4;
                                            c(canvas3, drawable10, drawable6, this.f, (int) (d4 * 255.0f));
                                            drawable7 = drawable10;
                                            canvas3.restore();
                                        } else {
                                            rectF2 = rectF;
                                            canvas3 = canvas2;
                                            drawable7 = drawable3;
                                            drawable6 = drawable4;
                                        }
                                        if (f64 >= 1.0f) {
                                            i29 i29Var5 = chatActivityEnterView.i1;
                                            i29Var5.Q.set(rectF2);
                                            i29Var5.R = 1.0f;
                                            i29Var5.invalidate();
                                        }
                                    } else {
                                        rect = rect2;
                                        f18 = max;
                                        paint3 = paint2;
                                        i5 = i11;
                                        i6 = measuredWidth;
                                        f19 = f33;
                                        drawable7 = drawable3;
                                        c = 4;
                                        c2 = 3;
                                        f20 = 3.0f;
                                        drawable6 = drawable4;
                                        if (f62 == 0.0f) {
                                            paint2 = paint3;
                                            f17 = f19;
                                            f21 = 1.0f;
                                            max = f18;
                                            canvas3.drawCircle(i6 + chatActivityEnterView.i5, f17, max, paint2);
                                        } else if (chatActivityEnterView.d1 || this.e <= 0.0f || (i29Var = chatActivityEnterView.i1) == null || (chatActivityEnterView.K1 && i29Var.S)) {
                                            f21 = 1.0f;
                                            paint2 = paint3;
                                            f17 = f19;
                                            canvas3.drawCircle(i6 + chatActivityEnterView.i5, f17, (1.0f - this.e) * f18, paint2);
                                            max = f18;
                                        } else {
                                            float f83 = f19 + f18;
                                            float f84 = f19 - f18;
                                            float f85 = i6 + chatActivityEnterView.i5;
                                            float f86 = f85 + f18;
                                            float f87 = f85 - f18;
                                            int i16 = i3;
                                            int i17 = i16;
                                            for (View view2 = (View) i29Var.getParent(); view2 != getParent(); view2 = (View) view2.getParent()) {
                                                i16 = (int) (view2.getY() + i16);
                                                i17 = (int) (view2.getX() + i17);
                                            }
                                            float f88 = i16;
                                            float y2 = (i29Var.getY() + f88) - getY();
                                            float y3 = ((i29Var.getY() + i29Var.getMeasuredHeight()) + f88) - getY();
                                            float f89 = i17;
                                            float x3 = (((i29Var.getX() + i29Var.getMeasuredWidth()) + f89) - getX()) - chatActivityEnterView.J;
                                            float x4 = ((i29Var.getX() + f89) - getX()) + chatActivityEnterView.J;
                                            if (!chatActivityEnterView.d1) {
                                                i29Var.getMeasuredHeight();
                                            }
                                            rectF3.set(gl.R1(f87, x4, this.e), gl.R1(f84, y2, this.e), gl.R1(f86, x3, this.e), gl.R1(f83, y3, this.e));
                                            if (chatActivityEnterView.K1) {
                                                getLocationInWindow(chatActivityEnterView.R1);
                                                chatActivityEnterView.i1.getLocationInWindow(chatActivityEnterView.S1);
                                                int i18 = chatActivityEnterView.R1[i3];
                                                int[] iArr5 = chatActivityEnterView.S1;
                                                rectF3.offset(i18 - iArr5[i3], r2[i2] - iArr5[i2]);
                                                i29 i29Var6 = chatActivityEnterView.i1;
                                                float f90 = this.e;
                                                i29Var6.Q.set(rectF3);
                                                i29Var6.R = f90;
                                                i29Var6.invalidate();
                                            } else {
                                                chatActivityEnterView.i1.a(canvas3, rectF3, this.e);
                                            }
                                        }
                                        if (i5 != 0) {
                                            canvas3.save();
                                            float f91 = f21 - f46;
                                            canvas3.translate(chatActivityEnterView.i5, 0.0f);
                                            float L5 = (max - gl.L(19.0f)) / Math.max(f21, f3 - gl.L(19.0f));
                                            this.d0 = L5 < 0.0f ? 0.0f : L5 > f21 ? f21 : L5;
                                            int z5 = (int) tb4.z(f21, f11, f91, 255.0f);
                                            if (chatActivityEnterView.e5 != 0.0f && drawable7 == chatActivityEnterView.G4 && chatActivityEnterView.K1) {
                                                float[] fArr4 = fArr;
                                                if (chatActivityEnterView.E0(fArr4)) {
                                                    getLocationInWindow(this.c0);
                                                    int intrinsicWidth = drawable7.getIntrinsicWidth();
                                                    int intrinsicHeight = drawable7.getIntrinsicHeight();
                                                    float f92 = (fArr4[c2] - r4[i3]) - chatActivityEnterView.i5;
                                                    float f93 = fArr4[c] - r4[i2];
                                                    Rect rect3 = rect;
                                                    float f94 = rect3.left;
                                                    float f95 = rect3.top;
                                                    float f96 = f9;
                                                    int round = Math.round(gl.R1(f94, f92, f96));
                                                    int round2 = Math.round(gl.R1(f95, f93, f96));
                                                    drawable7.setBounds(round, round2, intrinsicWidth + round, intrinsicHeight + round2);
                                                    this.d0 = 1.0f - f96;
                                                    z5 = (int) (f91 * 255.0f);
                                                }
                                            }
                                            int i19 = z5;
                                            float f97 = this.Q;
                                            if (f97 <= f16 || chatActivityEnterView.e5 != 0.0f) {
                                                drawable5 = drawable7;
                                                i4 = i6;
                                                c(canvas3, drawable5, drawable6, this.f, i19);
                                            } else {
                                                float f98 = i19;
                                                int i20 = (int) ((1.0f - f97) * f98);
                                                drawable5 = drawable7;
                                                c(canvas3, drawable5, drawable6, this.f, i20);
                                                float R17 = gl.R1(0.6f, 1.0f, this.Q) * gl.N(6.5f);
                                                Paint paint9 = this.R;
                                                paint9.setColor(-1);
                                                paint9.setAlpha((int) (f98 * this.Q));
                                                RectF rectF5 = gl.P;
                                                i4 = i6;
                                                float f99 = i4;
                                                rectF5.set(f99 - R17, f17 - R17, f99 + R17, R17 + f17);
                                                canvas3.drawRoundRect(rectF5, gl.N(f20), gl.N(f20), paint9);
                                            }
                                            canvas3.restore();
                                        } else {
                                            drawable5 = drawable7;
                                            i4 = i6;
                                        }
                                    }
                                    paint2 = paint3;
                                    max = f18;
                                    f17 = f19;
                                    f21 = 1.0f;
                                    if (i5 != 0) {
                                    }
                                } else {
                                    i4 = measuredWidth;
                                    f17 = f33;
                                    drawable5 = drawable3;
                                    drawable6 = drawable4;
                                }
                            }
                            if (chatActivityEnterView.W4 != 1.0f) {
                                canvas3.drawCircle(i4 + chatActivityEnterView.i5, f17, max, paint2);
                                float f100 = chatActivityEnterView.g5 ? 1.0f - chatActivityEnterView.Y4 : 1.0f;
                                canvas3.save();
                                canvas3.translate(chatActivityEnterView.i5, 0.0f);
                                float L6 = (max - gl.L(19.0f)) / Math.max(1.0f, f3 - gl.L(19.0f));
                                this.d0 = L6 >= 0.0f ? L6 > 1.0f ? 1.0f : L6 : 0.0f;
                                c(canvas3, drawable5, drawable6, this.f, (int) (f100 * 255.0f));
                                canvas.restore();
                            }
                            this.M = max;
                        }
                    }
                    f14 = 1.0f;
                    f15 = 1.0f;
                    float f562 = (chatActivityEnterView.g0() ? f14 - chatActivityEnterView.A6 : f14) * f15;
                    if (e66.e(360928)) {
                    }
                    drawable3 = drawable9;
                    drawable4 = drawable2;
                    f16 = 0.01f;
                    i3 = 0;
                    float max4 = (chatActivityEnterView.g5 || chatActivityEnterView.Y4 >= 1.0f) ? f10 : Math.max(f10, gl.L(19.0f));
                    if (this.N) {
                    }
                    if (chatActivityEnterView.W4 != 1.0f) {
                    }
                    this.M = max4;
                }
            } else {
                f2 = 0.6f;
            }
            f3 = f41;
            float f101 = chatActivityEnterView.b5;
            if (f101 == 0.0f) {
                f4 = f42;
                f5 = 0.0f;
                f6 = 0.0f;
                f7 = 1.0f;
                f8 = 0.0f;
            } else if (chatActivityEnterView.E1) {
                f4 = 0.0f;
                f5 = 0.0f;
                f7 = 0.0f;
                f8 = 0.0f;
                f6 = 1.0f;
            } else {
                float f102 = f101 > f2 ? 1.0f : f101 / f2;
                if (!chatActivityEnterView.h0) {
                    f101 = oo1.f(f101, f2, 0.4f, 0.0f);
                }
                s33 s33Var2 = s33.j;
                f8 = s33Var2.getInterpolation(f102);
                float interpolation4 = s33Var2.getInterpolation(f101);
                float L7 = ((gl.L(16.0f) * f8) + f42) * (1.0f - interpolation4);
                if (e66.e(360928)) {
                    float f103 = chatActivityEnterView.b5;
                    if (f103 > 0.6f) {
                        f7 = Math.max(0.0f, 1.0f - ((f103 - 0.6f) / 0.4f));
                        f6 = interpolation4;
                        f4 = L7;
                        f5 = 0.0f;
                    }
                }
                f6 = interpolation4;
                f4 = L7;
                f5 = 0.0f;
                f7 = 1.0f;
            }
            g0 = chatActivityEnterView.g0();
            float f462 = f6;
            float[] fArr22 = this.b0;
            float f472 = f7;
            if (g0) {
            }
            if (this.e <= 0.0f) {
            }
            b();
            if (chatActivityEnterView.h5) {
            }
            Drawable drawable92 = drawable;
            drawable92.setBounds(rect2);
            z = this.x;
            float f502 = chatActivityEnterView.d5;
            if (z) {
            }
            e = e66.e(360928);
            fk0 fk0Var3 = this.n;
            fk0 fk0Var22 = this.h;
            if (e) {
            }
            this.d = System.currentTimeMillis();
            float f532 = chatActivityEnterView.Y4;
            if (f532 <= 0.7f) {
            }
            if (chatActivityEnterView.E1) {
            }
            f14 = 1.0f;
            f15 = 1.0f;
            float f5622 = (chatActivityEnterView.g0() ? f14 - chatActivityEnterView.A6 : f14) * f15;
            if (e66.e(360928)) {
            }
            drawable3 = drawable92;
            drawable4 = drawable2;
            f16 = 0.01f;
            i3 = 0;
            float max42 = (chatActivityEnterView.g5 || chatActivityEnterView.Y4 >= 1.0f) ? f10 : Math.max(f10, gl.L(19.0f));
            if (this.N) {
            }
            if (chatActivityEnterView.W4 != 1.0f) {
            }
            this.M = max42;
        }

        @Override // android.view.View
        public final void onMeasure(int i, int i2) {
            View.MeasureSpec.getSize(i);
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(194.0f), TLObject.FLAG_30));
            float measuredWidth = getMeasuredWidth() * 0.35f;
            if (measuredWidth > gl.L(140.0f)) {
                measuredWidth = gl.L(140.0f);
            }
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.i5 = (int) ((1.0f - chatActivityEnterView.Y4) * (-measuredWidth));
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
            chatActivityEnterView.X4 = f;
            l lVar = chatActivityEnterView.E2;
            if (lVar != null) {
                lVar.invalidate();
            }
        }

        public void setScale(float f) {
            ChatActivityEnterView.this.W4 = f;
            invalidate();
        }

        public void setTransformToSeekbar(float f) {
            ChatActivityEnterView.this.e5 = f;
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
    public class SlideTextView extends View {
        public StaticLayout E;
        public StaticLayout F;
        public boolean G;
        public boolean H;
        public final Rect I;
        public ff0 J;
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
            boolean z = gl.q.x <= gl.L(320.0f);
            this.L = z;
            TextPaint textPaint = new TextPaint(1);
            this.a = textPaint;
            textPaint.setTextSize(gl.L(z ? 13.0f : 15.0f));
            TextPaint textPaint2 = new TextPaint(1);
            this.b = textPaint2;
            de9.p(textPaint2, gl.L(15.0f));
            int i = bkb.Ml;
            int i2 = ChatActivityEnterView.r7;
            paint.setColor(ChatActivityEnterView.this.F0(i));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(gl.N(z ? 1.0f : 1.6f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            String M0 = k96.M0(2131745121, null);
            this.d = M0;
            String M02 = k96.M0(2131752577, "Cancel");
            this.e = M02;
            this.x = M0.toLowerCase().indexOf(M02.toLowerCase());
            b();
        }

        public final void a() {
            this.r = 1.0f;
        }

        public final void b() {
            int i = bkb.dg;
            int i2 = ChatActivityEnterView.r7;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            int F0 = chatActivityEnterView.F0(i);
            TextPaint textPaint = this.a;
            textPaint.setColor(F0);
            int i3 = bkb.cg;
            int F02 = chatActivityEnterView.F0(i3);
            this.b.setColor(F02);
            textPaint.getAlpha();
            this.s = r4.getAlpha();
            ff0 h0 = bkb.h0(gl.L(60.0f), 0, bm2.o(chatActivityEnterView.F0(i3), 26));
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
            ff0 ff0Var = this.J;
            if (ff0Var != null) {
                ff0Var.jumpToCurrentState();
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
            float L;
            l lVar;
            if (this.E == null || (staticLayout = this.F) == null) {
                return;
            }
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (chatActivityEnterView.D2 != null) {
                int L2 = gl.L(16.0f) + staticLayout.getWidth();
                int F0 = (gl.B(chatActivityEnterView.F0(bkb.c6)) >= 0.5f || (lVar = chatActivityEnterView.E2) == null) ? chatActivityEnterView.F0(bkb.dg) : lVar.s.getColor();
                TextPaint textPaint = this.a;
                textPaint.setColor(F0);
                textPaint.setAlpha((int) ((1.0f - this.n) * Color.alpha(F0) * this.r));
                this.b.setAlpha((int) (this.s * this.n));
                int color = textPaint.getColor();
                Paint paint = this.c;
                paint.setColor(color);
                boolean z = this.L;
                if (z) {
                    this.w = gl.L(16.0f);
                } else {
                    System.currentTimeMillis();
                    System.currentTimeMillis();
                    if (this.n == 0.0f && this.r > 0.8f) {
                        float currentTimeMillis = (System.currentTimeMillis() % 2000) / 2000.0f;
                        this.w = (-gl.L(6.0f)) * (currentTimeMillis < 0.5f ? (currentTimeMillis * 4.0f) - 1.0f : 3.0f - (currentTimeMillis * 4.0f));
                    }
                }
                int i = this.x;
                boolean z2 = i >= 0;
                int L3 = gl.L(5.0f) + ((int) ((getMeasuredWidth() - this.f) / 2.0f));
                int measuredWidth = (int) ((getMeasuredWidth() - this.h) / 2.0f);
                if (z2) {
                    f2 = this.E.getPrimaryHorizontal(i);
                    f = 4.0f;
                    f3 = (L3 + f2) - measuredWidth;
                } else {
                    f = 4.0f;
                    f2 = 0.0f;
                    f3 = 0.0f;
                }
                float f6 = L3;
                float f7 = this.w;
                float f8 = this.n;
                float L4 = (((((1.0f - f8) * f7) * this.r) + f6) - (f3 * f8)) + gl.L(16.0f);
                float L5 = z2 ? 0.0f : this.n * gl.L(12.0f);
                if (this.n != 1.0f) {
                    f4 = 12.0f;
                    int translationX = (int) ((chatActivityEnterView.D2.getTranslationX() * 0.3f) + ((1.0f - this.r) * ((-getMeasuredWidth()) / 4)));
                    canvas.save();
                    my1 my1Var = chatActivityEnterView.Z0;
                    f5 = 2.0f;
                    canvas.clipRect((my1Var == null ? 0.0f : my1Var.getLeftProperty()) + gl.L(f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    canvas.save();
                    int i2 = (int) L4;
                    canvas.translate((i2 - gl.L(z ? 7.0f : 10.0f)) + translationX, L5);
                    canvas.drawPath(this.y, paint);
                    canvas.restore();
                    canvas.save();
                    canvas.translate(i2 + translationX, ((getMeasuredHeight() - this.E.getHeight()) / 2.0f) + L5);
                    this.E.draw(canvas);
                    canvas.restore();
                    canvas.restore();
                } else {
                    f4 = 12.0f;
                    f5 = 2.0f;
                }
                float measuredHeight = (getMeasuredHeight() - this.F.getHeight()) / f5;
                if (z2) {
                    L = (L4 + f2) - (gl.L(16.0f) * this.n);
                } else {
                    measuredHeight -= gl.L(f4) - L5;
                    L = measuredWidth;
                }
                Rect rect = this.I;
                rect.set((int) L, (int) measuredHeight, (int) (this.F.getWidth() + L), (int) (this.F.getHeight() + measuredHeight));
                rect.inset(-gl.L(16.0f), -gl.L(16.0f));
                if (this.n > 0.0f) {
                    this.J.setBounds((getMeasuredWidth() / 2) - L2, (getMeasuredHeight() / 2) - L2, (getMeasuredWidth() / 2) + L2, (getMeasuredHeight() / 2) + L2);
                    this.J.draw(canvas);
                    canvas.save();
                    canvas.translate(L, measuredHeight);
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
                    path.setLastPoint(gl.N(2.5f), f - gl.N(3.12f));
                    path.lineTo(0.0f, f);
                    path.lineTo(gl.N(2.5f), gl.N(3.12f) + f);
                } else {
                    float f2 = measuredHeight2;
                    path.setLastPoint(gl.N(4.0f), f2 - gl.N(5.0f));
                    path.lineTo(0.0f, f2);
                    path.lineTo(gl.N(4.0f), gl.N(5.0f) + f2);
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
                if (chatActivityEnterView.U2 && chatActivityEnterView.d1) {
                    chatActivityEnterView.P3.k1(5, 0, chatActivityEnterView.P ? Integer.MAX_VALUE : 0, chatActivityEnterView.O6, 0L, true);
                    ow1 ow1Var = chatActivityEnterView.K0;
                    chatActivityEnterView.O6 = 0L;
                    ow1Var.setEffect(0L);
                } else {
                    chatActivityEnterView.P3.n0(0);
                    MediaController.w().A0(0, 0, false, chatActivityEnterView.P);
                }
                chatActivityEnterView.R3 = null;
                chatActivityEnterView.T3 = null;
                chatActivityEnterView.U3 = null;
                chatActivityEnterView.Y1 = 0L;
                chatActivityEnterView.v3 = false;
                hq6 d0 = hq6.d0(chatActivityEnterView.R);
                long j2 = chatActivityEnterView.G3;
                mu1 mu1Var = chatActivityEnterView.F3;
                if (mu1Var != null && mu1Var.x4) {
                    j = mu1Var.d();
                }
                d0.D1(j2, j, null);
                chatActivityEnterView.r2(2, true);
                chatActivityEnterView.N(true);
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

    public ChatActivityEnterView(Activity activity, cja cjaVar, mu1 mu1Var, boolean z, final wjb wjbVar) {
        super(activity);
        String str;
        int i;
        hy1 hy1Var;
        this.h = 1.0f;
        this.n = 1.0f;
        this.r = 1.0f;
        this.s = 1.0f;
        this.F = 1.0f;
        this.G = 1.0f;
        this.J = 0.0f;
        final byte b = 1;
        this.K = true;
        int i2 = y6c.t0;
        this.R = i2;
        this.S = j5.a(i2);
        this.U = 1;
        this.d0 = -1;
        this.p7 = 1;
        this.y0 = true;
        this.z0 = true;
        this.A0 = true;
        this.C0 = new HashMap();
        this.D0 = false;
        this.E0 = false;
        this.q1 = new av1(this, (byte) 18);
        this.z1 = 1.0f;
        this.C1 = new SparseArray();
        this.O1 = new Paint(1);
        this.R1 = new int[2];
        this.S1 = new int[2];
        this.X1 = new jc(this, (byte) 19);
        this.l2 = 1.0f;
        this.V2 = -1;
        this.Z2 = true;
        this.t3 = -1.0f;
        this.u3 = gl.L(80.0f);
        this.D3 = new int[2];
        this.O3 = true;
        this.e4 = -1;
        this.g4 = true;
        this.h4 = new qw1(this, (byte) 0);
        this.i4 = new ef0(this);
        this.j4 = new ax1(Integer.class, "translationY", (byte) 0);
        this.k4 = new b(Float.class, "scale");
        this.l4 = new f(Float.class, "controlsScale");
        this.m4 = new Paint(1);
        this.z4 = new i(this);
        this.A4 = new on(null);
        this.B4 = new Paint(1);
        this.H4 = new RectF();
        this.I4 = new Rect();
        this.J4 = new Rect();
        this.N4 = new qw1(this, (byte) 2);
        this.O4 = new bw1(this, (byte) 4);
        this.P4 = new bw1(this, (byte) 0);
        this.Q4 = new bw1(this, (byte) 1);
        this.R4 = new bw1(this, (byte) 2);
        this.S4 = new bw1(this, (byte) 3);
        this.m5 = new TextPaint(1);
        this.n5 = new Paint(1);
        this.o5 = new Paint(1);
        this.p5 = new Path();
        this.q5 = new Path();
        this.r5 = new RectF();
        this.s5 = new int[2];
        this.t5 = new int[2];
        this.w5 = new pd5((byte) 15);
        this.P5 = new Paint(2);
        this.T5 = 1.0f;
        this.U5 = 1.0f;
        this.W5 = true;
        this.X5 = true;
        this.a6 = new Paint();
        this.b6 = 1.0f;
        this.c6 = new Rect();
        this.e6 = new uv1(this, (byte) 11);
        this.h6 = true;
        this.o6 = -1;
        this.v6 = new RectF();
        this.F6 = new float[2];
        this.G6 = new float[2];
        this.H6 = new int[2];
        this.K6 = new cm2[1];
        this.q7 = 1;
        this.V6 = -1;
        Paint paint = new Paint(1);
        this.Y6 = paint;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.Z6 = linearGradient;
        this.a7 = new Matrix();
        s33 s33Var = s33.h;
        this.b7 = new lm(this, 0L, 280L, s33Var);
        this.c7 = new lm(this, 0L, 280L, s33Var);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setShader(linearGradient);
        s33 s33Var2 = la2.V;
        this.f7 = new y74(0, this, s33Var2, 250L);
        this.g7 = new fm0(1, this, s33Var2, 250L, false);
        this.h7 = new fm0(2, this, s33Var, 320L, false);
        this.i7 = new fm0(3, this, s33Var, 320L, false);
        this.m7 = new int[2];
        this.n7 = new int[2];
        this.L4 = wjbVar;
        this.M4 = z;
        this.Y2 = z && !gl.E && (mu1Var == null || !mu1Var.isInBubbleMode());
        Paint paint2 = new Paint(1);
        this.G2 = paint2;
        paint2.setColor(F0(bkb.Rf));
        setFocusable(true);
        setFocusableInTouchMode(true);
        setWillNotDraw(false);
        setClipChildren(false);
        kk7.f(this.R).b(this, kk7.k2);
        kk7.f(this.R).b(this, kk7.n2);
        kk7.f(this.R).b(this, kk7.o2);
        kk7.f(this.R).b(this, kk7.l2);
        kk7.f(this.R).b(this, kk7.W5);
        kk7.f(this.R).b(this, kk7.m2);
        kk7.f(this.R).b(this, kk7.j2);
        kk7.f(this.R).b(this, kk7.s);
        kk7.f(this.R).b(this, kk7.r2);
        kk7.f(this.R).b(this, kk7.t2);
        kk7.f(this.R).b(this, kk7.d2);
        kk7.f(this.R).b(this, kk7.y0);
        kk7.f(this.R).b(this, kk7.K);
        kk7.f(this.R).b(this, kk7.m1);
        kk7.f(this.R).b(this, kk7.s2);
        kk7.f(this.R).b(this, kk7.S2);
        kk7.f(this.R).b(this, kk7.Z2);
        kk7.f(this.R).b(this, kk7.h5);
        kk7.f(this.R).b(this, kk7.R3);
        kk7.e().b(this, kk7.k4);
        this.E3 = activity;
        this.F3 = mu1Var;
        if (mu1Var != null) {
            this.w3 = mu1Var.getClassGuid();
        }
        this.c2 = cjaVar;
        this.d2 = cjaVar;
        cjaVar.setDelegate(this);
        this.r3 = na7.c1().getBoolean("send_by_enter", false);
        cw1 cw1Var = new cw1(this, activity, (byte) 0);
        this.p2 = cw1Var;
        cw1Var.setClipChildren(false);
        cw1Var.setClipToPadding(false);
        cw1Var.setPadding(0, gl.L(1.0f), 0, 0);
        addView(cw1Var, nme.d(-1, -2.0f, 83, 0.0f, 1.0f, 0.0f, 0.0f));
        cw1 cw1Var2 = new cw1(this, activity, b);
        this.o2 = cw1Var2;
        cw1Var2.setClipChildren(false);
        cw1Var.addView(cw1Var2, nme.d(-1, -2.0f, 80, 0.0f, 0.0f, 44.0f, 0.0f));
        ew1 ew1Var = new ew1(this, activity);
        this.R0 = ew1Var;
        ew1Var.setContentDescription(k96.M0(2131754884, null));
        ew1Var.setFocusable(true);
        int L = gl.L(7.5f);
        ew1Var.setPadding(L, L, L, L);
        int i3 = bkb.Ml;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        zkb.s(ew1Var, i3, wjbVar, mode);
        int i4 = bkb.h6;
        int F0 = F0(i4);
        float L2 = gl.L(19.0f);
        int L3 = gl.L(1.0f);
        int L4 = gl.L(3.0f);
        ew1Var.setBackground(bkb.W(L2, F0, L3, L4, L3, L4));
        ew1Var.setOnClickListener(new fv1(this, (byte) 21));
        cw1Var2.addView(ew1Var, nme.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        E1(false, false);
        ImageView imageView = new ImageView(activity);
        this.S0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.menu_delete_old);
        zkb.s(imageView, i3, wjbVar, mode);
        int F02 = F0(i4);
        float L5 = gl.L(19.0f);
        int L6 = gl.L(1.0f);
        int L7 = gl.L(3.0f);
        imageView.setBackground(bkb.W(L5, F02, L6, L7, L6, L7));
        imageView.setVisibility(8);
        imageView.setContentDescription(k96.M0(2131754035, null));
        final byte b2 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: bv1
            public final /* synthetic */ ChatActivityEnterView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (b2) {
                    case 0:
                        int i5 = ChatActivityEnterView.r7;
                        ChatActivityEnterView chatActivityEnterView = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, chatActivityEnterView.getContext());
                        String M0 = k96.M0(2131754033, null);
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.S = M0;
                        hdVar.U = k96.M0(2131754034, null);
                        alertDialog$Builder.g(k96.M0(2131752577, null), null);
                        alertDialog$Builder.j(k96.M0(2131751586, null), new qv1(chatActivityEnterView));
                        alertDialog$Builder.c(-1);
                        alertDialog$Builder.o();
                        break;
                    default:
                        int i6 = ChatActivityEnterView.r7;
                        na7.c1().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.b;
                        mu1 mu1Var2 = chatActivityEnterView2.F3;
                        long a = mu1Var2 != null ? mu1Var2.a() : chatActivityEnterView2.G3;
                        boolean z2 = chatActivityEnterView2.t2;
                        wjb wjbVar2 = wjbVar;
                        if (!z2) {
                            if (chatActivityEnterView2.F0 != null) {
                                a1 a1Var = new a1(chatActivityEnterView2.getContext(), wjbVar2);
                                a1Var.o1(chatActivityEnterView2.F0.getText());
                                a1Var.R2 = new uv1(chatActivityEnterView2, (byte) 7);
                                a1Var.e2 = new vv1(chatActivityEnterView2, (byte) 2);
                                a1Var.m1(a, chatActivityEnterView2.P2 != null, new wv1(chatActivityEnterView2, a, wjbVar2, (byte) 1));
                                a1Var.show();
                                break;
                            }
                        } else if (chatActivityEnterView2.u2 != null) {
                            a1 a1Var2 = new a1(chatActivityEnterView2.getContext(), wjbVar2);
                            a1Var2.n1(chatActivityEnterView2.u2);
                            a1Var2.f2 = new vv1(chatActivityEnterView2, (byte) 1);
                            wv1 wv1Var = new wv1(chatActivityEnterView2, a, wjbVar2, (byte) 0);
                            a1Var2.g2 = a;
                            a1Var2.j2 = wv1Var;
                            a1Var2.show();
                            break;
                        }
                        break;
                }
            }
        });
        cw1Var2.addView(imageView, nme.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        if (z) {
            int i5 = mu1Var != null ? mu1Var.g4 : -1;
            pkb pkbVar = new pkb((byte) 3, activity, this);
            this.f2 = pkbVar;
            pkbVar.setOrientation(0);
            pkbVar.setEnabled(false);
            pkbVar.setClipChildren(false);
            cw1Var2.addView(pkbVar, nme.d(-2, 44.0f, 85, 0.0f, 0.0f, 44.0f, 0.0f));
            if (i5 != 9) {
                ImageView imageView2 = new ImageView(activity);
                this.y2 = imageView2;
                k33 k33Var = new k33(activity, R.drawable.input_notify_on, i3);
                this.f0 = k33Var;
                imageView2.setImageDrawable(k33Var);
                this.f0.a(this.W2, false);
                if (this.W2) {
                    str = "AccDescrChanSilentOn";
                    i = 2131754906;
                } else {
                    str = "AccDescrChanSilentOff";
                    i = 2131754907;
                }
                imageView2.setContentDescription(k96.M0(i, str));
                zkb.s(imageView2, i3, wjbVar, PorterDuff.Mode.MULTIPLY);
                imageView2.setScaleType(scaleType);
                ff0 f0 = bkb.f0(F0(i4), 1, -1);
                vkb M = zkb.M(i4);
                imageView2.setBackground(f0);
                zkb.j(imageView2, f0, null, M, wjbVar);
                imageView2.setVisibility((!this.X2 || ((hy1Var = this.P3) != null && hy1Var.M())) ? 8 : 0);
                pkbVar.addView(imageView2, nme.o(44, 44));
                imageView2.setOnClickListener(new fw1(this, mu1Var, activity));
            }
            gw1 gw1Var = new gw1(this, activity, (byte) 0);
            this.h2 = gw1Var;
            gw1Var.setScaleType(scaleType);
            zkb.s(gw1Var, i3, wjbVar, PorterDuff.Mode.MULTIPLY);
            gw1Var.setImageResource(R.drawable.msg_input_attach2);
            ff0 f02 = bkb.f0(F0(i4), 1, -1);
            vkb M2 = zkb.M(i4);
            gw1Var.setBackground(f02);
            zkb.j(gw1Var, f02, null, M2, wjbVar);
            cw1Var2.addView(gw1Var, nme.e(44, 44, 85));
            gw1Var.setOnClickListener(new fv1(this, b));
            gw1Var.setContentDescription(k96.M0(2131754921, null));
            n2(1);
        }
        ImageView imageView3 = new ImageView(activity);
        this.j2 = imageView3;
        gc gcVar = new gc(activity);
        this.i2 = gcVar;
        imageView3.setImageDrawable(gcVar);
        imageView3.setScaleType(scaleType);
        PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
        zkb.s(imageView3, i3, wjbVar, mode2);
        ff0 f03 = bkb.f0(F0(i4), 1, gl.L(16.0f));
        vkb M3 = zkb.M(i4);
        imageView3.setBackground(f03);
        zkb.j(imageView3, f03, null, M3, wjbVar);
        cw1Var.addView(imageView3, nme.d(44, 44.0f, 51, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView3.setContentDescription(k96.M0(2131755006, null));
        ote.a(imageView3);
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: bv1
            public final /* synthetic */ ChatActivityEnterView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (b) {
                    case 0:
                        int i52 = ChatActivityEnterView.r7;
                        ChatActivityEnterView chatActivityEnterView = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, chatActivityEnterView.getContext());
                        String M0 = k96.M0(2131754033, null);
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.S = M0;
                        hdVar.U = k96.M0(2131754034, null);
                        alertDialog$Builder.g(k96.M0(2131752577, null), null);
                        alertDialog$Builder.j(k96.M0(2131751586, null), new qv1(chatActivityEnterView));
                        alertDialog$Builder.c(-1);
                        alertDialog$Builder.o();
                        break;
                    default:
                        int i6 = ChatActivityEnterView.r7;
                        na7.c1().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.b;
                        mu1 mu1Var2 = chatActivityEnterView2.F3;
                        long a = mu1Var2 != null ? mu1Var2.a() : chatActivityEnterView2.G3;
                        boolean z2 = chatActivityEnterView2.t2;
                        wjb wjbVar2 = wjbVar;
                        if (!z2) {
                            if (chatActivityEnterView2.F0 != null) {
                                a1 a1Var = new a1(chatActivityEnterView2.getContext(), wjbVar2);
                                a1Var.o1(chatActivityEnterView2.F0.getText());
                                a1Var.R2 = new uv1(chatActivityEnterView2, (byte) 7);
                                a1Var.e2 = new vv1(chatActivityEnterView2, (byte) 2);
                                a1Var.m1(a, chatActivityEnterView2.P2 != null, new wv1(chatActivityEnterView2, a, wjbVar2, (byte) 1));
                                a1Var.show();
                                break;
                            }
                        } else if (chatActivityEnterView2.u2 != null) {
                            a1 a1Var2 = new a1(chatActivityEnterView2.getContext(), wjbVar2);
                            a1Var2.n1(chatActivityEnterView2.u2);
                            a1Var2.f2 = new vv1(chatActivityEnterView2, (byte) 1);
                            wv1 wv1Var = new wv1(chatActivityEnterView2, a, wjbVar2, (byte) 0);
                            a1Var2.g2 = a;
                            a1Var2.j2 = wv1Var;
                            a1Var2.show();
                            break;
                        }
                        break;
                }
            }
        });
        imageView3.setVisibility(8);
        imageView3.setAlpha(0.0f);
        imageView3.setScaleX(0.6f);
        imageView3.setScaleY(0.6f);
        ImageView imageView4 = new ImageView(activity);
        this.k2 = imageView4;
        imageView4.setImageResource(R.drawable.iv_fullscreen);
        imageView4.setScaleType(scaleType);
        zkb.s(imageView4, i3, wjbVar, mode2);
        ff0 f04 = bkb.f0(F0(i4), 1, gl.L(16.0f));
        vkb M4 = zkb.M(i4);
        imageView4.setBackground(f04);
        zkb.j(imageView4, f04, null, M4, wjbVar);
        cw1Var.addView(imageView4, nme.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(k96.M0(2131754030, null));
        ote.a(imageView4);
        imageView4.setOnClickListener(new fv1(this, (byte) 3));
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setScaleX(0.6f);
        imageView4.setScaleY(0.6f);
        if (this.R3 != null) {
            a0();
        }
        ImageView imageView5 = new ImageView(activity);
        this.r2 = imageView5;
        imageView5.setImageResource(R.drawable.send_outline);
        imageView5.setScaleType(scaleType);
        imageView5.setVisibility(8);
        zkb.s(imageView5, bkb.Xl, wjbVar, mode);
        cw1Var.addView(imageView5, nme.e(44, 44, 85));
        cw1 cw1Var3 = new cw1(this, activity, (byte) 2);
        this.q2 = cw1Var3;
        cw1Var3.setClipChildren(false);
        cw1Var3.setClipToPadding(false);
        cw1Var.addView(cw1Var3, nme.e(100, 44, 85));
        a aVar = new a(this, activity, wjbVar);
        this.a1 = aVar;
        aVar.setSoundEffectsEnabled(false);
        cw1Var3.addView(aVar, nme.e(44, 44, 85));
        aVar.setFocusable(true);
        aVar.setImportantForAccessibility(1);
        Drawable mutate = getResources().getDrawable(R.drawable.input_mic).mutate();
        this.C4 = mutate;
        zkb.x(this, mutate, i3, wjbVar, mode2);
        Drawable mutate2 = getResources().getDrawable(R.drawable.input_video).mutate();
        this.D4 = mutate2;
        zkb.x(this, mutate2, i3, wjbVar, mode2);
        mw1 mw1Var = new mw1(this, activity);
        this.c1 = mw1Var;
        mw1Var.setImportantForAccessibility(2);
        int L8 = gl.L(10.0f);
        mw1Var.setPadding(L8, L8, L8, L8);
        aVar.addView(mw1Var, nme.c(44.0f, 44));
        ImageView imageView6 = new ImageView(activity);
        this.Q0 = imageView6;
        imageView6.setVisibility(4);
        imageView6.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        nw1 nw1Var = new nw1();
        this.F2 = nw1Var;
        imageView6.setImageDrawable(nw1Var);
        imageView6.setContentDescription(k96.M0(2131752577, "Cancel"));
        imageView6.setSoundEffectsEnabled(false);
        imageView6.setScaleX(0.1f);
        imageView6.setScaleY(0.1f);
        imageView6.setAlpha(0.0f);
        ff0 f05 = bkb.f0(F0(i4), 1, -1);
        vkb M5 = zkb.M(i4);
        imageView6.setBackground(f05);
        zkb.j(imageView6, f05, null, M5, wjbVar);
        cw1Var3.addView(imageView6, nme.e(44, 44, 85));
        imageView6.setOnClickListener(new fv1(this, (byte) 4));
        ow1 ow1Var = new ow1(this, activity, c() ? R.drawable.input_schedule : R.drawable.send_plane_24, wjbVar);
        this.K0 = ow1Var;
        ow1Var.setVisibility(4);
        ow1Var.setContentDescription(k96.M0(2131745448, null));
        byte b3 = 0;
        ow1Var.setSoundEffectsEnabled(false);
        ow1Var.setScaleX(0.1f);
        ow1Var.setScaleY(0.1f);
        ow1Var.setAlpha(0.0f);
        cw1Var3.addView(ow1Var, nme.e(100, 44, 85));
        ow1Var.setOnClickListener(new fv1(this, (byte) 5));
        ow1Var.setOnLongClickListener(new rv1(this, b3));
        if (gl.A1()) {
            cw1Var3.setOnLongClickListener(new rv1(this, b3));
        }
        u0a u0aVar = new u0a(activity, wjbVar);
        this.J0 = u0aVar;
        u0aVar.setVisibility(4);
        u0aVar.setOnClickListener(new fv1(this, (byte) 12));
        cw1Var3.addView(u0aVar, nme.e(44, 44, 85));
        ly1 ly1Var = new ly1(activity);
        jia jiaVar = (jia) ly1Var.c;
        this.G0 = ly1Var;
        jiaVar.setTextSize(16);
        ly1Var.invalidate();
        ly1Var.setVisibility(4);
        ly1Var.setSoundEffectsEnabled(false);
        ly1Var.setScaleX(0.1f);
        ly1Var.setScaleY(0.1f);
        ly1Var.setAlpha(0.0f);
        ly1Var.setPadding(gl.L(14.0f), 0, gl.L(14.0f), 0);
        jiaVar.setGravity(21);
        ly1Var.invalidate();
        jiaVar.setTextColor(F0(i3));
        ly1Var.invalidate();
        cw1Var3.addView(ly1Var, nme.e(74, 44, 85));
        ly1Var.setOnClickListener(new fv1(this, (byte) 15));
        ly1Var.setOnLongClickListener(new rv1(this, b));
        SharedPreferences b1 = na7.b1();
        this.n3 = b1.getInt("kbd_height", gl.L(200.0f));
        this.o3 = b1.getInt("kbd_height_land3", gl.L(200.0f));
        M1(false, false);
        N(false);
        I();
        Z();
    }

    public static float D2(int i) {
        int i2 = i * 668265261;
        int i3 = (i2 ^ (i2 >>> 15)) * (-2048144789);
        return ((i3 ^ (i3 >>> 13)) >>> 8) / 1.6777216E7f;
    }

    public static int E2(int i) {
        return (Color.blue(i) + ((Color.green(i) * 6) + (Color.red(i) * 3))) / 10;
    }

    public static float G2(float f, float f2, float f3) {
        float i = Utilities.i((f3 - f) / (f2 - f), 1.0f, 0.0f);
        return yjb.B(i, 2.0f, 3.0f, i * i);
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
    public static boolean K(int i, long j, org.telegram.ui.ActionBar.d dVar, CharSequence charSequence) {
        gm[] gmVarArr;
        int i2;
        int i3;
        TLRPC.ChatFull L0;
        TLRPC.TL_messages_stickerSet a0;
        ArrayList arrayList;
        int i4;
        ArrayList<TLRPC.Document> arrayList2;
        ArrayList<TLRPC.Document> arrayList3;
        Object obj;
        ArrayList<TLRPC.Document> arrayList4;
        boolean z = false;
        if (charSequence != null && dVar != null && !y6c.h(i).p() && y6c.h(i).e() != j && (charSequence instanceof Spanned) && (gmVarArr = (gm[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), gm.class)) != null) {
            int i5 = 0;
            while (i5 < gmVarArr.length) {
                gm gmVar = gmVarArr[i5];
                if (gmVar != null) {
                    TLRPC.Document document = gmVar.document;
                    if (document == null) {
                        i3 = i;
                        document = vl.e(i3, gmVar.getDocumentId());
                    } else {
                        i3 = i;
                    }
                    long documentId = gmVarArr[i5].getDocumentId();
                    if (document == null) {
                        ArrayList t0 = hq6.d0(i3).t0(5);
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
                        ArrayList arrayList6 = hq6.d0(i3).t0[1];
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
                                        TLRPC.TL_messages_stickerSet n0 = hq6.d0(i3).n0(tL_inputStickerSetID, true);
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
                    if (document != null && (L0 = na7.q1(i3).L0(-j)) != null && L0.emojiset != null && (a0 = hq6.d0(i3).a0(L0.emojiset)) != null) {
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
                    if (document == null || !k27.m3(document)) {
                        u21.b0(dVar).r(document, gl.S2(k96.M0(2131743625, "UnlockPremiumEmojiHint")), k96.M0(2131746842, "PremiumMore"), new kv1(dVar, (byte) 0)).j();
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

    /* JADX INFO: Access modifiers changed from: private */
    public k27 getThreadMessage() {
        mu1 mu1Var = this.F3;
        if (mu1Var != null) {
            return mu1Var.m4;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getThreadMessageId() {
        k27 k27Var;
        mu1 mu1Var = this.F3;
        if (mu1Var == null || (k27Var = mu1Var.m4) == null) {
            return 0;
        }
        return k27Var.e1();
    }

    private String getTopicKeyString() {
        mu1 mu1Var = this.F3;
        if (mu1Var == null || !mu1Var.x4) {
            return String.valueOf(this.G3);
        }
        return this.G3 + "_" + mu1Var.d();
    }

    public static CharSequence r(Paint.FontMetricsInt fontMetricsInt, CharSequence charSequence, ArrayList arrayList) {
        boolean z;
        boolean z2;
        Collections.sort(arrayList, hq6.g2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(im4.a(charSequence, false));
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
                            j4c j4cVar = new j4c("" + ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id, 3, null);
                            int i2 = messageEntity.offset;
                            spannableStringBuilder.setSpan(j4cVar, i2, messageEntity.length + i2, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            j4c j4cVar2 = new j4c("" + ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id, 3, null);
                            int i3 = messageEntity.offset;
                            spannableStringBuilder.setSpan(j4cVar2, i3, messageEntity.length + i3, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityCode) {
                            vib vibVar = new vib();
                            vibVar.a |= 4;
                            wib wibVar = new wib(vibVar, 0);
                            int i4 = messageEntity.offset;
                            hq6.f(wibVar, i4, messageEntity.length + i4, spannableStringBuilder, true);
                        } else if (!(messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                            if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                vib vibVar2 = new vib();
                                vibVar2.a |= 1;
                                wib wibVar2 = new wib(vibVar2, 0);
                                int i5 = messageEntity.offset;
                                hq6.f(wibVar2, i5, messageEntity.length + i5, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                vib vibVar3 = new vib();
                                vibVar3.a |= 2;
                                wib wibVar3 = new wib(vibVar3, 0);
                                int i6 = messageEntity.offset;
                                hq6.f(wibVar3, i6, messageEntity.length + i6, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                vib vibVar4 = new vib();
                                vibVar4.a |= 8;
                                wib wibVar4 = new wib(vibVar4, 0);
                                int i7 = messageEntity.offset;
                                hq6.f(wibVar4, i7, messageEntity.length + i7, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                vib vibVar5 = new vib();
                                vibVar5.a |= 16;
                                wib wibVar5 = new wib(vibVar5, 0);
                                int i8 = messageEntity.offset;
                                hq6.f(wibVar5, i8, messageEntity.length + i8, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                i4c i4cVar = new i4c(messageEntity.url, null);
                                int i9 = messageEntity.offset;
                                spannableStringBuilder.setSpan(i4cVar, i9, messageEntity.length + i9, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityFormattedDate) {
                                vib vibVar6 = new vib();
                                vibVar6.a |= 128;
                                int i10 = messageEntity.offset;
                                vibVar6.b = i10;
                                vibVar6.c = i10 + messageEntity.length;
                                vibVar6.d = messageEntity;
                                int i11 = messageEntity.offset;
                                im4 im4Var = new im4(spannableStringBuilder.subSequence(i11, messageEntity.length + i11).toString(), vibVar6, (TLRPC.TL_messageEntityFormattedDate) messageEntity);
                                int i12 = messageEntity.offset;
                                spannableStringBuilder.setSpan(im4Var, i12, messageEntity.length + i12, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                vib vibVar7 = new vib();
                                vibVar7.a |= 256;
                                wib wibVar6 = new wib(vibVar7, 0);
                                int i13 = messageEntity.offset;
                                hq6.f(wibVar6, i13, messageEntity.length + i13, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                gm gmVar = tL_messageEntityCustomEmoji.document != null ? new gm(tL_messageEntityCustomEmoji.document, fontMetricsInt) : new gm(tL_messageEntityCustomEmoji.document_id, fontMetricsInt);
                                int i14 = messageEntity.offset;
                                spannableStringBuilder.setSpan(gmVar, i14, messageEntity.length + i14, 33);
                            }
                        }
                    }
                } catch (Exception e) {
                    fa4.g(e, true);
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
                        ey8.c(spannableStringBuilder, i18, i21, z4);
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
                ey8.c(spannableStringBuilder, i18, spannableStringBuilder.length(), z4);
            }
        } else {
            z = true;
        }
        CharSequence m = vu3.m(new SpannableStringBuilder(spannableStringBuilder), fontMetricsInt, false, null, 0);
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
                fa4.g(e2, z);
            }
        }
        return m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHintGlass(je5 je5Var) {
        mu1 mu1Var = this.F3;
        if (mu1Var != null) {
            je5Var.k(mu1Var.L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSlowModeButtonVisible(boolean z) {
        int i;
        int i2 = z ? 0 : 8;
        ly1 ly1Var = this.G0;
        ly1Var.setVisibility(i2);
        if (z) {
            i = gl.L(ly1Var.b ? 26.0f : 16.0f);
        } else {
            i = 0;
        }
        ex1 ex1Var = this.F0;
        if (ex1Var == null || ex1Var.getPaddingRight() == i) {
            return;
        }
        this.F0.setPadding(0, gl.L(9.0f), i, gl.L(10.0f));
    }

    public final boolean A() {
        cy1 B = B();
        return (TextUtils.equals(B.a, this.S2.a) && hq6.M(this.S2.b, B.b)) ? false : true;
    }

    public final gjc A0() {
        gjc gjcVar = this.r1;
        if (gjcVar != null) {
            return gjcVar;
        }
        gjc gjcVar2 = new gjc(getContext(), new c(this));
        this.r1 = gjcVar2;
        return gjcVar2;
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
    public final void A1(k27 k27Var, boolean z, boolean z2) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        ex1 ex1Var;
        k27 k27Var2 = this.J3;
        if (k27Var2 != null && k27Var2 == this.c3 && k27Var2 != k27Var) {
            this.M3 = k27Var;
            return;
        }
        k27 k27Var3 = this.c3;
        if (k27Var3 != null) {
            if (k27Var3 == k27Var) {
                return;
            }
        } else if (k27Var == null) {
            return;
        }
        if (this.x2 == null) {
            tx1 tx1Var = new tx1(this, this.E3, this.L4);
            this.x2 = tx1Var;
            tx1Var.setVisibility(8);
            this.Y0 = false;
            this.x2.setDelegate(new qv1(this));
            this.d2.addView(this.x2);
        }
        this.c3 = k27Var;
        if (k27Var != null) {
            TLRPC.ReplyMarkup replyMarkup = k27Var.k.reply_markup;
            if (replyMarkup instanceof TLRPC.TL_replyKeyboardMarkup) {
                tL_replyKeyboardMarkup = (TLRPC.TL_replyKeyboardMarkup) replyMarkup;
                this.d3 = tL_replyKeyboardMarkup;
                tx1 tx1Var2 = this.x2;
                Point point = gl.q;
                tx1Var2.setPanelHeight(point.x <= point.y ? this.o3 : this.n3);
                if (this.d3 == null) {
                    SharedPreferences sharedPreferences = na7.q1(this.R).X3;
                    if (this.c3 != this.J3 && k27Var != null) {
                        if (this.d3.single_use) {
                        }
                        if (!this.d3.is_persistent) {
                        }
                    }
                    boolean z3 = true;
                    boolean z4 = z ? z3 : false;
                    this.x2.setButtons(this.d3);
                    if (z4 && (((ex1Var = this.F0) == null || ex1Var.length() == 0) && !Q0())) {
                        W1(1, 1, true, true);
                    }
                } else if (Q0() && this.V2 == 1) {
                    if (z2) {
                        this.f4 = true;
                        i1();
                    } else {
                        W1(0, 1, true, true);
                    }
                }
                h2(true);
            }
        }
        tL_replyKeyboardMarkup = null;
        this.d3 = tL_replyKeyboardMarkup;
        tx1 tx1Var22 = this.x2;
        Point point2 = gl.q;
        tx1Var22.setPanelHeight(point2.x <= point2.y ? this.o3 : this.n3);
        if (this.d3 == null) {
        }
        h2(true);
    }

    public final boolean A2() {
        ex1 ex1Var;
        if (this.s1 && ((ex1Var = this.F0) == null || ex1Var.length() == 0)) {
            this.s1 = false;
        }
        return this.s1;
    }

    public final cy1 B() {
        ex1 ex1Var = this.F0;
        CharSequence[] charSequenceArr = {gl.m1(ex1Var == null ? "" : ex1Var.getTextToUse())};
        ArrayList Y = hq6.d0(this.R).Y(charSequenceArr, true, true);
        CharSequence charSequence = charSequenceArr[0];
        int size = Y.size();
        for (int i = 0; i < size; i++) {
            TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) Y.get(i);
            if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                messageEntity.length = charSequence.length() - messageEntity.offset;
            }
        }
        cy1 cy1Var = new cy1();
        cy1Var.a = charSequence.toString();
        cy1Var.b = Y;
        return cy1Var;
    }

    public final void B1(k27 k27Var, String str, boolean z, boolean z2) {
        ex1 ex1Var;
        x3a b;
        String str2;
        if (str == null || getVisibility() != 0 || (ex1Var = this.F0) == null) {
            return;
        }
        r16 = null;
        TLRPC.User user = null;
        if (!z) {
            if (this.H0 > 0 && !c()) {
                hy1 hy1Var = this.P3;
                if (hy1Var != null) {
                    ly1 ly1Var = this.G0;
                    hy1Var.O0(ly1Var, ((jia) ly1Var.c).getText(), true);
                    return;
                }
                return;
            }
            TLRPC.User V1 = (k27Var == null || !cf3.y(this.G3)) ? null : na7.q1(this.S.a).V1(Long.valueOf(k27Var.k.from_id.user_id));
            if ((this.e3 != 1 || z2) && V1 != null && V1.bot && !str.contains("@")) {
                Locale locale = Locale.US;
                b = x3a.b(tb4.y(str, "@", l7c.p(V1)), this.G3, this.J3, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
            } else {
                b = x3a.b(str, this.G3, this.J3, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
            }
            mu1 mu1Var = this.F3;
            b.K = mu1Var != null ? mu1Var.Q6() : null;
            b.O = this.O6;
            this.O6 = 0L;
            this.K0.setEffect(0L);
            u(b);
            z3a.B(this.R).q0(b);
            return;
        }
        String obj = ex1Var.getText().toString();
        if (k27Var != null && cf3.y(this.G3)) {
            user = na7.q1(this.S.a).V1(Long.valueOf(k27Var.k.from_id.user_id));
        }
        TLRPC.User user2 = user;
        if ((this.e3 != 1 || z2) && user2 != null && user2.bot && !str.contains("@")) {
            Locale locale2 = Locale.US;
            str2 = tb4.y(str, "@", l7c.p(user2)) + " " + obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", "");
        } else {
            StringBuilder k = b00.k(str, " ");
            k.append(obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
            str2 = k.toString();
        }
        this.H3 = true;
        this.F0.setText(str2);
        ex1 ex1Var2 = this.F0;
        ex1Var2.setSelection(ex1Var2.getText().length());
        this.H3 = false;
        hy1 hy1Var2 = this.P3;
        if (hy1Var2 != null) {
            hy1Var2.C0(this.F0.getText(), true, false);
        }
        if (this.p3 || this.V2 != -1) {
            return;
        }
        h1();
    }

    public final void B2(int i) {
        byte b;
        if (this.l1) {
            return;
        }
        if (this.r1 != null || na7.c1().getBoolean("asr_live_text", true)) {
            gjc gjcVar = this.r1;
            byte b2 = 10;
            if (gjcVar != null && gjcVar.J && ((b = gjcVar.c) == 2 || b == 4)) {
                if (i != 1 && i != 2 && i != 4 && i != 5) {
                    gl.c3(new uv1(this, b2));
                    return;
                }
                gjcVar.j("field: record state " + i, true);
                return;
            }
            if (gjcVar == null || gjcVar.c != 3) {
                if (i == 0) {
                    gl.c3(new uv1(this, b2));
                    return;
                } else {
                    if (gjcVar != null) {
                        gjcVar.j("record state " + i, true);
                        return;
                    }
                    return;
                }
            }
            if (i == 1 || i == 2 || i == 4 || i == 5 || i == 0) {
                gjcVar.j("review: record state " + i, true);
            }
        }
    }

    public final float C(boolean z) {
        float f;
        float f2;
        fm0 fm0Var = this.g7;
        y74 y74Var = this.f7;
        if (z) {
            f = y74Var.h ? y74Var.g : y74Var.f;
            f2 = fm0Var.f ? 1.0f : 0.0f;
        } else {
            f = y74Var.f;
            f2 = fm0Var.e;
        }
        return ((this.w2 != null ? r2.getMeasuredHeight() : 0) * f2) + f;
    }

    public final j92 C0() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof j92) {
                return (j92) parent;
            }
        }
        return null;
    }

    public final void C1(int i, long j) {
        this.G3 = j;
        gl.c3(new av1(this, (byte) 23));
        if (this.R != i) {
            this.A4.e();
            kk7 f = kk7.f(this.R);
            int i2 = kk7.k2;
            f.n(this, i2);
            kk7 f2 = kk7.f(this.R);
            int i3 = kk7.n2;
            f2.n(this, i3);
            kk7 f3 = kk7.f(this.R);
            int i4 = kk7.o2;
            f3.n(this, i4);
            kk7 f4 = kk7.f(this.R);
            int i5 = kk7.l2;
            f4.n(this, i5);
            kk7 f5 = kk7.f(this.R);
            int i6 = kk7.W5;
            f5.n(this, i6);
            kk7 f6 = kk7.f(this.R);
            int i7 = kk7.m2;
            f6.n(this, i7);
            kk7 f7 = kk7.f(this.R);
            int i8 = kk7.j2;
            f7.n(this, i8);
            kk7 f8 = kk7.f(this.R);
            int i9 = kk7.s;
            f8.n(this, i9);
            kk7 f9 = kk7.f(this.R);
            int i10 = kk7.r2;
            f9.n(this, i10);
            kk7 f10 = kk7.f(this.R);
            int i11 = kk7.t2;
            f10.n(this, i11);
            kk7 f11 = kk7.f(this.R);
            int i12 = kk7.d2;
            f11.n(this, i12);
            kk7 f12 = kk7.f(this.R);
            int i13 = kk7.y0;
            f12.n(this, i13);
            kk7 f13 = kk7.f(this.R);
            int i14 = kk7.K;
            f13.n(this, i14);
            kk7 f14 = kk7.f(this.R);
            int i15 = kk7.m1;
            f14.n(this, i15);
            kk7 f15 = kk7.f(this.R);
            int i16 = kk7.s2;
            f15.n(this, i16);
            kk7 f16 = kk7.f(this.R);
            int i17 = kk7.S2;
            f16.n(this, i17);
            kk7 f17 = kk7.f(this.R);
            int i18 = kk7.Z2;
            f17.n(this, i18);
            kk7 f18 = kk7.f(this.R);
            int i19 = kk7.h5;
            f18.n(this, i19);
            kk7 f19 = kk7.f(this.R);
            int i20 = kk7.R3;
            f19.n(this, i20);
            this.R = i;
            this.S = j5.a(i);
            kk7.f(this.R).b(this, i2);
            kk7.f(this.R).b(this, i3);
            kk7.f(this.R).b(this, i4);
            kk7.f(this.R).b(this, i5);
            kk7.f(this.R).b(this, i6);
            kk7.f(this.R).b(this, i7);
            kk7.f(this.R).b(this, i8);
            kk7.f(this.R).b(this, i9);
            kk7.f(this.R).b(this, i10);
            kk7.f(this.R).b(this, i11);
            kk7.f(this.R).b(this, i12);
            kk7.f(this.R).b(this, i13);
            kk7.f(this.R).b(this, i14);
            kk7.f(this.R).b(this, i15);
            kk7.f(this.R).b(this, i16);
            kk7.f(this.R).b(this, i17);
            kk7.f(this.R).b(this, i18);
            kk7.f(this.R).b(this, i19);
            kk7.f(this.R).b(this, i20);
        }
        this.A0 = true;
        if (cf3.y(this.G3)) {
            this.A0 = hc2.q(na7.q1(this.S.a).K0(Long.valueOf(-this.G3)));
        }
        u2(false);
        o2(false);
        M();
        I();
        m2(false);
        if (this.F0 != null) {
            mu1 mu1Var = this.F3;
            v2(mu1Var != null && mu1Var.getFragmentBeginToShow());
        }
    }

    public final void C2() {
        if ((this.r1 == null && !wxe.a()) || this.O2 || this.l1) {
            return;
        }
        A0().t();
    }

    public final void D() {
        a6 a6Var = this.e1;
        if (a6Var != null) {
            a6Var.setVisibility(8);
        }
        RecordCircle recordCircle = this.D2;
        if (recordCircle != null) {
            recordCircle.setVisibility(8);
        }
        this.j3 = null;
        U0();
        if (this.f2 != null) {
            this.y = 0.0f;
            g2();
        }
        SlideTextView slideTextView = this.a2;
        if (slideTextView != null) {
            slideTextView.setCancelToProgress(0.0f);
        }
        this.P3.a();
        v2(true);
    }

    public final long D0() {
        if (this.G1 <= 0) {
            return 250L;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = this.G1;
        if (uptimeMillis < j) {
            return Math.max(16L, j - SystemClock.uptimeMillis());
        }
        return 250L;
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
    public final void D1(k27 k27Var, f27 f27Var, boolean z) {
        float f;
        float f2;
        int i;
        cw1 cw1Var;
        CharSequence charSequence;
        CharSequence charSequence2;
        int i2;
        ex1 ex1Var;
        ex1 ex1Var2;
        cw1 cw1Var2;
        boolean z2;
        pw1 pw1Var;
        if (this.R3 == null && this.U3 == null && this.P2 != k27Var) {
            Z();
            byte b = 1;
            boolean z3 = this.P2 != null;
            this.P2 = k27Var;
            this.Q2 = z;
            cw1 cw1Var3 = this.q2;
            pkb pkbVar = this.f2;
            ImageView imageView = this.Q0;
            gw1 gw1Var = this.h2;
            a aVar = this.a1;
            if (k27Var != null) {
                this.N6 = f27Var != null ? f27Var.j : k27Var.k.invert_media;
                W(false);
                this.v2.setOnClickListener(new fv1(this, (byte) 20));
                if (this.P2.o5()) {
                    long j = this.j5;
                    if (j > 0) {
                        this.v2.i(1, j, true);
                        this.v2.setLayoutParams(nme.e(44, 44, 85));
                        this.v2.requestLayout();
                        cw1Var = cw1Var3;
                        this.v2.setOnLongClickListener(new s(this, k27Var, f27Var, b));
                        this.v2.setVisibility(0);
                        this.v2.setScaleX(0.1f);
                        this.v2.setScaleY(0.1f);
                        this.v2.setAlpha(0.0f);
                        this.v2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(s33.f).start();
                        j5 j5Var = this.S;
                        if (z) {
                            this.d0 = na7.q1(j5Var.a).r1();
                            charSequence = this.P2.v;
                        } else {
                            this.d0 = na7.q1(j5Var.a).F0();
                            charSequence = this.P2.z;
                        }
                        if (charSequence == null) {
                            ex1 ex1Var3 = this.F0;
                            TextPaint paint = ex1Var3 != null ? ex1Var3.getPaint() : null;
                            if (paint == null) {
                                paint = new TextPaint();
                                paint.setTextSize(gl.L(18.0f));
                            }
                            charSequence2 = r(paint.getFontMetricsInt(), charSequence, this.P2.k.entities);
                        } else {
                            charSequence2 = "";
                        }
                        if (this.L2 == null && !z3) {
                            ex1 ex1Var4 = this.F0;
                            this.L2 = (ex1Var4 != null || ex1Var4.length() <= 0) ? null : this.F0.getText();
                            this.M2 = this.O3;
                        }
                        k27 k27Var2 = this.P2;
                        TLRPC.MessageMedia messageMedia = k27Var2.k.media;
                        this.O3 = ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) || !messageMedia.manual) && ((i2 = k27Var2.D) == 0 || i2 == 19);
                        if (this.p3) {
                            aj1 aj1Var = new aj1(this, charSequence2, (byte) 29);
                            this.a0 = aj1Var;
                            gl.d3(aj1Var, 200L);
                        } else {
                            aj1 aj1Var2 = this.a0;
                            if (aj1Var2 != null) {
                                gl.r(aj1Var2);
                                this.a0 = null;
                            }
                            setFieldText(charSequence2);
                        }
                        ex1Var = this.F0;
                        if (ex1Var != null) {
                            ex1Var.requestFocus();
                        }
                        h1();
                        ex1Var2 = this.F0;
                        if (ex1Var2 != null) {
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ex1Var2.getLayoutParams();
                            layoutParams.rightMargin = gl.L(4.0f);
                            this.F0.setLayoutParams(layoutParams);
                        }
                        cw1Var2 = this.f1;
                        if (cw1Var2 == null) {
                            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) cw1Var2.getLayoutParams();
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
                        pkbVar.setVisibility(8);
                        if (gw1Var != null) {
                            this.l2 = 0.0f;
                            gw1Var.setAlpha(0.0f);
                            gw1Var.setScaleX(0.5f);
                            gw1Var.setScaleY(0.5f);
                        }
                        cw1Var.setVisibility(8);
                        pw1Var = this.z2;
                        if (pw1Var != null) {
                            pw1Var.setVisibility(8);
                        }
                    }
                }
                cw1Var = cw1Var3;
                this.v2.i(1, 0L, true);
                this.v2.setLayoutParams(nme.e(44, 44, 85));
                this.v2.requestLayout();
                this.v2.setOnLongClickListener(new s(this, k27Var, f27Var, b));
                this.v2.setVisibility(0);
                this.v2.setScaleX(0.1f);
                this.v2.setScaleY(0.1f);
                this.v2.setAlpha(0.0f);
                this.v2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(s33.f).start();
                j5 j5Var2 = this.S;
                if (z) {
                }
                if (charSequence == null) {
                }
                if (this.L2 == null) {
                    ex1 ex1Var42 = this.F0;
                    this.L2 = (ex1Var42 != null || ex1Var42.length() <= 0) ? null : this.F0.getText();
                    this.M2 = this.O3;
                }
                k27 k27Var22 = this.P2;
                TLRPC.MessageMedia messageMedia2 = k27Var22.k.media;
                this.O3 = ((messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) || !messageMedia2.manual) && ((i2 = k27Var22.D) == 0 || i2 == 19);
                if (this.p3) {
                }
                ex1Var = this.F0;
                if (ex1Var != null) {
                }
                h1();
                ex1Var2 = this.F0;
                if (ex1Var2 != null) {
                }
                cw1Var2 = this.f1;
                if (cw1Var2 == null) {
                }
                getSendButtonInternal().setVisibility(8);
                setSlowModeButtonVisible(z2);
                imageView.setVisibility(8);
                aVar.setVisibility(8);
                pkbVar.setVisibility(8);
                if (gw1Var != null) {
                }
                cw1Var.setVisibility(8);
                pw1Var = this.z2;
                if (pw1Var != null) {
                }
            } else {
                aj1 aj1Var3 = this.a0;
                if (aj1Var3 != null) {
                    gl.r(aj1Var3);
                    this.a0 = null;
                }
                ow1 ow1Var = this.v2;
                if (ow1Var != null) {
                    ow1Var.setVisibility(8);
                }
                this.d0 = -1;
                this.P3.j();
                cw1Var3.setVisibility(0);
                imageView.setScaleX(0.1f);
                imageView.setScaleY(0.1f);
                imageView.setAlpha(0.0f);
                imageView.setVisibility(8);
                int i3 = this.H0;
                ly1 ly1Var = this.G0;
                if (i3 <= 0 || c()) {
                    getSendButtonInternal().setScaleX(0.1f);
                    getSendButtonInternal().setScaleY(0.1f);
                    getSendButtonInternal().setAlpha(0.0f);
                    getSendButtonInternal().setVisibility(8);
                    ly1Var.setScaleX(0.1f);
                    ly1Var.setScaleY(0.1f);
                    ly1Var.setAlpha(0.0f);
                    setSlowModeButtonVisible(false);
                    f = 1.0f;
                    pkbVar.setScaleX(1.0f);
                    this.F = 1.0f;
                    g2();
                    pkbVar.setVisibility(0);
                    if (gw1Var != null) {
                        this.l2 = 1.0f;
                        gw1Var.setAlpha(1.0f);
                        gw1Var.setScaleX(1.0f);
                        gw1Var.setScaleY(1.0f);
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
                        ly1Var.setScaleX(0.1f);
                        ly1Var.setScaleY(0.1f);
                        f2 = 0.0f;
                        ly1Var.setAlpha(0.0f);
                        setSlowModeButtonVisible(false);
                        i = 8;
                    } else {
                        f2 = 0.0f;
                        getSendButtonInternal().setScaleX(0.1f);
                        getSendButtonInternal().setScaleY(0.1f);
                        getSendButtonInternal().setAlpha(0.0f);
                        i = 8;
                        getSendButtonInternal().setVisibility(8);
                        ly1Var.setScaleX(1.0f);
                        ly1Var.setScaleY(1.0f);
                        ly1Var.setAlpha(1.0f);
                        setSlowModeButtonVisible(true);
                    }
                    pkbVar.setScaleX(0.01f);
                    this.F = f2;
                    g2();
                    pkbVar.setVisibility(i);
                    if (gw1Var != null) {
                        this.l2 = f2;
                        gw1Var.setAlpha(f2);
                        gw1Var.setScaleX(0.5f);
                        gw1Var.setScaleY(0.5f);
                    }
                    aVar.setScaleX(0.1f);
                    aVar.setScaleY(0.1f);
                    aVar.setAlpha(f2);
                    aVar.setVisibility(i);
                    f = 1.0f;
                }
                e0();
                pw1 pw1Var2 = this.z2;
                if (pw1Var2 != null && pw1Var2.getTag() != null) {
                    this.z2.setScaleX(f);
                    this.z2.setScaleY(f);
                    this.z2.setAlpha(f);
                    this.z2.setVisibility(0);
                }
                mu1 mu1Var = this.F3;
                if (mu1Var != null) {
                    mu1Var.H5 = null;
                    mu1Var.Y5 = null;
                    o27 o27Var = mu1Var.x5;
                    if (o27Var != null) {
                        o27Var.e(this.R, null, "", null, null, null);
                    }
                    this.N3 = null;
                    this.O3 = true;
                    mu1Var.w6();
                }
                Z();
                ex1 ex1Var5 = this.F0;
                if (ex1Var5 != null) {
                    ex1Var5.setText(this.L2);
                    ex1 ex1Var6 = this.F0;
                    ex1Var6.setSelection(ex1Var6.length());
                }
                this.L2 = null;
                this.O3 = this.M2;
                if (getVisibility() == 0) {
                    this.P3.p1();
                }
                n2(1);
            }
            m2(true);
            v2(true);
            k2();
            t2();
        }
    }

    public final void E() {
        if (this.U2 && this.d1) {
            this.P3.k1(5, 0, this.P ? Integer.MAX_VALUE : 0, this.O6, 0L, true);
            this.O6 = 0L;
            this.K0.setEffect(0L);
        } else {
            this.P3.n0(0);
            MediaController.w().A0(0, 0, false, false);
        }
        this.v3 = false;
        r2(2, true);
    }

    public final boolean E0(float[] fArr) {
        ow1 ow1Var = this.K0;
        if (ow1Var != null && ow1Var.o0) {
            int[] iArr = new int[2];
            ow1Var.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - Math.round(ow1Var.getTranslationX());
            iArr[1] = iArr[1] - Math.round(ow1Var.getTranslationY());
            View rootView = ow1Var.getRootView();
            if (rootView == null || rootView.getWidth() <= 0 || ((iArr[0] + ow1Var.j0) - ow1Var.l0 <= rootView.getWidth() && iArr[0] + ow1Var.j0 + ow1Var.l0 >= 0.0f)) {
                fArr[0] = iArr[0] + ow1Var.j0;
                fArr[1] = iArr[1] + ow1Var.k0;
                fArr[2] = ow1Var.l0;
                fArr[3] = r4 + ow1Var.m0;
                fArr[4] = r0 + ow1Var.n0;
                return true;
            }
        }
        return false;
    }

    public final void E1(boolean z, boolean z2) {
        oy1 oy1Var;
        ex1 ex1Var;
        cw1 cw1Var;
        ew1 ew1Var = this.R0;
        if (ew1Var != null) {
            if (this.m3 || ((cw1Var = this.f1) != null && cw1Var.getVisibility() == 0)) {
                this.h = 0.0f;
                this.n = 0.0f;
                l2();
                z2 = false;
            }
            oy1 oy1Var2 = oy1.f;
            oy1 oy1Var3 = oy1.e;
            if (!z || this.V2 != 0) {
                wx1 wx1Var = this.V0;
                int i = wx1Var == null ? na7.b1().getInt("selected_page", 0) : wx1Var.getCurrentPage();
                oy1Var = (i == 0 || !((this.z3 || this.A3) && ((ex1Var = this.F0) == null || TextUtils.isEmpty(ex1Var.getText())))) ? oy1Var3 : i == 1 ? oy1.c : oy1Var2;
            } else if (!this.A0) {
                return;
            } else {
                oy1Var = oy1.d;
            }
            if (!this.A0 && oy1Var == oy1Var3) {
                oy1Var3 = oy1Var2;
            } else if (this.b || oy1Var == oy1Var3) {
                oy1Var3 = oy1Var;
            }
            ew1Var.j(oy1Var3, z2);
            if (oy1Var3 == oy1Var2 && this.V0 == null) {
                hq6.d0(this.R).X0(true, true, false, 0);
                ArrayList arrayList = na7.q1(this.R).x3;
                int min = Math.min(10, arrayList.size());
                for (int i2 = 0; i2 < min; i2++) {
                    vu3.k((CharSequence) arrayList.get(i2));
                }
            }
        }
    }

    public final int F0(int i) {
        wjb wjbVar = this.L4;
        return wjbVar != null ? wjbVar.h(i) : bkb.w0(null, i, false);
    }

    public final void F1() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.E3.getSystemService("accessibility");
        if (this.F0 == null || accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        try {
            this.F0.requestFocus();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final AnimatorSet F2() {
        a aVar = this.a1;
        if (aVar == null) {
            return null;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(aVar, (Property<a, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(aVar, (Property<a, Float>) View.SCALE_X, 0.6f, 1.0f), ObjectAnimator.ofFloat(aVar, (Property<a, Float>) View.SCALE_Y, 0.6f, 1.0f));
        animatorSet.setStartDelay(60L);
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(s33.g);
        return animatorSet;
    }

    public final void G() {
        gw1 gw1Var;
        mu1 mu1Var;
        if (this.M != null || (gw1Var = this.A2) == null || gw1Var.getRight() == 0 || (mu1Var = this.F3) == null || !oj0.d(mu1Var.s8)) {
            return;
        }
        if (na7.q1(this.R).X3.getBoolean(Calendar.getInstance().get(1) + "bdayhint_" + mu1Var.a(), true)) {
            na7.q1(this.R).X3.edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + mu1Var.a(), false).apply();
            je5 je5Var = new je5(getContext(), 3);
            this.M = je5Var;
            je5Var.q(13.0f);
            setHintGlass(this.M);
            this.M.p(true);
            x1();
            this.M.setPadding(gl.L(12.0f), 0, gl.L(12.0f), 0);
            this.M.o(1.0f, -((getWidth() - gl.L(12.0f)) - ((this.A2.getMeasuredWidth() / 2.0f) + (this.A2.getX() + (this.f2.getX() + this.o2.getX())))));
            addView(this.M, nme.d(-1, 200.0f, 48, 0.0f, -192.0f, 0.0f, 0.0f));
            je5 je5Var2 = this.M;
            je5Var2.r0 = new av1(this, (byte) 26);
            je5Var2.d = 8000L;
            je5Var2.v();
        }
    }

    public final boolean G0() {
        return this.p7 == 3;
    }

    public final void G1(CharSequence charSequence, boolean z) {
        ex1 ex1Var = this.F0;
        if (ex1Var != null) {
            this.H3 = true;
            ex1Var.setText(charSequence);
            this.F0.g(true);
            ex1 ex1Var2 = this.F0;
            ex1Var2.setSelection(ex1Var2.getText().length());
            this.H3 = false;
            hy1 hy1Var = this.P3;
            if (hy1Var != null) {
                hy1Var.C0(this.F0.getText(), true, z);
            }
        }
    }

    public final void H() {
        ex1 ex1Var = this.F0;
        boolean z = ((ex1Var != null && !TextUtils.isEmpty(ex1Var.getText())) || this.p3 || this.a4 || Q0()) ? false : true;
        if (z) {
            U();
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
                ew1 ew1Var = this.R0;
                Float valueOf = Float.valueOf(ew1Var.getX());
                HashMap hashMap = this.C0;
                hashMap.put(ew1Var, valueOf);
                ex1 ex1Var2 = this.F0;
                if (ex1Var2 != null) {
                    hashMap.put(ex1Var2, Float.valueOf(ex1Var2.getX()));
                }
            }
        }
    }

    public final boolean H0() {
        ex1 ex1Var = this.F0;
        return ex1Var != null && ex1Var.length() > 0;
    }

    public final void H1(boolean z, boolean z2) {
        this.x3 = z;
        N(z2);
    }

    public final void I() {
        mu1 mu1Var = this.F3;
        if (mu1Var == null) {
            return;
        }
        q2(mu1Var.e, mu1Var.s8);
    }

    public final void I0() {
        je5 je5Var = this.O;
        if (je5Var != null) {
            je5Var.f(true);
        }
        je5 je5Var2 = this.M;
        if (je5Var2 != null) {
            je5Var2.f(true);
        }
    }

    public void I1(float f, float f2, float f3, boolean z) {
        int L;
        float f4 = 1.0f - f3;
        float f5 = f * f4;
        float f6 = f2 * f4;
        this.r = (f3 * 0.5f) + 0.5f;
        this.s = f3;
        l2();
        float f7 = -f5;
        this.R0.setTranslationX(f7);
        if (this.F0 == null) {
            L = 0;
        } else {
            int L2 = gl.L(40.0f);
            k4a k4aVar = this.q0;
            L = L2 + ((k4aVar == null || k4aVar.getVisibility() != 0) ? 0 : gl.L(18.0f));
        }
        this.I = f7 - (L * f4);
        ry8 ry8Var = this.h1;
        if (ry8Var != null) {
            ry8Var.setTranslationX(f7);
        }
        RecordCircle recordCircle = this.D2;
        if (recordCircle != null) {
            recordCircle.setTranslationX(f6);
        }
        l lVar = this.E2;
        if (lVar != null) {
            lVar.setTranslationX(f6);
        }
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            linearLayout.setTranslationX(f7);
        }
        cw1 cw1Var = this.q2;
        cw1Var.setTranslationX(f6);
        this.z1 = f3;
        cw1Var.setAlpha((1.0f - this.y1) * f3);
        ImageView imageView = this.m2;
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
        g2();
        p2();
        float f8 = f5 * f4;
        if (this.J != f8) {
            this.J = f8;
            i29 i29Var = this.i1;
            if (i29Var != null) {
                i29Var.setTranslationX(f8);
                this.i1.invalidate();
            }
        }
        if (this.F0 != null) {
            float R1 = gl.R1(0.88f, 1.0f, f3);
            this.F0.setPivotX(0.0f);
            this.F0.setPivotY(r9.getMeasuredHeight() / 2.0f);
            this.F0.setScaleX(R1);
            this.F0.setScaleY(R1);
            this.F0.setHintRightOffset(gl.U1(f3, gl.L(60.0f), 0));
        }
    }

    public final void J(boolean z) {
        k27 k27Var;
        boolean z2 = this.G3 < 0 && this.M4 && this.P2 == null && (t34.g(this.R).e(getEditText() != null ? getEditText().toString() : null, this.X6) > 0 || ((k27Var = this.J3) != null && k27.c3(k27Var.k)));
        fm0 fm0Var = this.i7;
        boolean z3 = fm0Var.f != z2;
        fm0Var.a(z2, z);
        ow1 ow1Var = this.K0;
        if (ow1Var != null) {
            ow1Var.y = z2;
            ow1Var.invalidate();
        }
        if (z3) {
            N(z);
        }
    }

    public final void J0(boolean z) {
        K0(z, false, true);
    }

    public final void J1(boolean z) {
        int i;
        if (this.o7 == z) {
            return;
        }
        this.o7 = z;
        this.h2.setVisibility(z ? 8 : 0);
        if (z) {
            gl.B2(this.y2);
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
            p1();
            this.d0 = -1;
            NumberTextView numberTextView = this.c0;
            if (numberTextView != null) {
                numberTextView.setVisibility(8);
            }
        }
        n2(this.L6);
        N(false);
    }

    public final boolean K0(boolean z, boolean z2, boolean z3) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        if (Q0()) {
            if (this.V2 == 1 && (tL_replyKeyboardMarkup = this.d3) != null && z && this.c3 != null) {
                if (!tL_replyKeyboardMarkup.is_persistent) {
                    na7.q1(this.R).X3.edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.c3.e1()).apply();
                }
            }
            if ((z && this.H2 != 0) || z2) {
                O1(0, true);
                wx1 wx1Var = this.V0;
                if (wx1Var != null) {
                    wx1Var.s(true);
                }
                ex1 ex1Var = this.F0;
                if (ex1Var != null) {
                    ex1Var.requestFocus();
                }
                P1(false, true, false, true);
                if (this.o4) {
                    N(true);
                    return true;
                }
            } else {
                if (this.H2 == 0) {
                    if (this.p4) {
                        P1(false, true, false, true);
                        return true;
                    }
                    W1(0, 0, true, z3 && !z);
                    return true;
                }
                O1(0, false);
                this.V0.s(false);
                ex1 ex1Var2 = this.F0;
                if (ex1Var2 != null) {
                    ex1Var2.requestFocus();
                }
            }
            return true;
        }
        return false;
    }

    public final void K1(boolean z) {
        ValueAnimator valueAnimator = this.Q1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Q1 = null;
        }
        if (z) {
            float f = this.P1;
            if (f != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
                this.Q1 = ofFloat;
                ofFloat.addUpdateListener(new pv1(this, (byte) 10));
                this.Q1.setDuration(200L);
                this.Q1.setInterpolator(s33.g);
                this.Q1.start();
                return;
            }
        }
        this.P1 = 0.0f;
        j92 C0 = C0();
        if (C0 != null) {
            C0.setInputBubbleExtraAlpha(1.0f);
        }
        cw1 cw1Var = this.f1;
        if (cw1Var != null) {
            cw1Var.invalidate();
        }
    }

    @Override // bja
    public final void L(int i, boolean z) {
        k27 k27Var;
        ex1 ex1Var;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        boolean z2;
        int i2;
        int i3;
        byc bycVar;
        if (this.H2 != 0) {
            this.B3 = i;
            this.C3 = z;
            this.p3 = i > 0;
            H();
            return;
        }
        if (i > gl.L(50.0f) && this.p3 && !gl.E) {
            if (z) {
                this.o3 = i;
                na7.b1().edit().putInt("kbd_height_land3", this.o3).commit();
            } else {
                this.n3 = i;
                na7.b1().edit().putInt("kbd_height", this.n3).commit();
            }
        }
        if (this.p3 && this.X0 && this.V0 == null) {
            this.X0 = false;
        }
        boolean Q0 = Q0();
        cja cjaVar = this.c2;
        mu1 mu1Var = this.F3;
        if (Q0) {
            int i4 = z ? this.o3 : this.n3;
            if (mu1Var != null && mu1Var.getParentLayout() != null) {
                i4 -= ((ActionBarLayout) mu1Var.getParentLayout()).u(false);
            }
            if (this.V2 == 1) {
                tx1 tx1Var = this.x2;
                if (!tx1Var.f) {
                    i4 = Math.min(tx1Var.getKeyboardHeight(), i4);
                }
            }
            int i5 = this.V2;
            View view = i5 == 0 ? this.V0 : i5 == 1 ? this.x2 : null;
            tx1 tx1Var2 = this.x2;
            if (tx1Var2 != null) {
                tx1Var2.setPanelHeight(i4);
                byc bycVar2 = this.d7;
                if (bycVar2 != null && i4 > 0 && this.V2 == 1) {
                    ((fyc) bycVar2).h(i4);
                }
            }
            if (view != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                if (!this.q4 && !this.p4 && (((i2 = layoutParams.width) != (i3 = gl.q.x) || layoutParams.height != i4) && ((bycVar = this.d7) == null || i2 != -1 || layoutParams.height != -1))) {
                    if (bycVar == null) {
                        layoutParams.width = i3;
                        layoutParams.height = i4;
                        view.setLayoutParams(layoutParams);
                    }
                    if (cjaVar != null) {
                        int i6 = this.q3;
                        this.q3 = layoutParams.height;
                        cjaVar.requestLayout();
                        g1();
                        if (this.Y2 && !this.p3 && i6 != this.q3 && n1()) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.W0 = animatorSet;
                            if (this.d7 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(this.q3 - i6, 0.0f));
                            } else {
                                animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, this.q3 - i6, 0.0f));
                            }
                            this.W0.setInterpolator(gb.w);
                            this.W0.setDuration(250L);
                            this.W0.addListener(new aw1(this, (byte) 12));
                            gl.d3(this.N4, 50L);
                            this.A4.d();
                            requestLayout();
                        }
                    }
                }
            }
        }
        if (this.B3 == i && this.C3 == z) {
            g1();
            return;
        }
        this.B3 = i;
        this.C3 = z;
        boolean z3 = this.p3;
        this.p3 = i > 0;
        H();
        if (this.p3 && Q0() && this.r4 == null) {
            W1(0, this.V2, true, true);
        } else if (!this.p3 && !Q0() && (k27Var = this.c3) != null && this.J3 != k27Var && !G0() && !z() && !org.telegram.ui.ActionBar.d.hasSheets(mu1Var) && (((ex1Var = this.F0) == null || TextUtils.isEmpty(ex1Var.getText())) && (tL_replyKeyboardMarkup = this.d3) != null && !tL_replyKeyboardMarkup.rows.isEmpty())) {
            gb gbVar = cjaVar.I;
            if (gbVar.f) {
                gbVar.j();
            } else {
                gbVar.v = true;
            }
            W1(1, 1, false, true);
        }
        if (this.q3 != 0 && !(z2 = this.p3) && z2 != z3 && !Q0()) {
            this.q3 = 0;
            cjaVar.requestLayout();
        }
        if (this.p3 && this.a4) {
            this.a4 = false;
            if (this.f4) {
                this.f4 = false;
                this.x2.setButtons(this.d3);
            }
            gl.r(this.h4);
        }
        g1();
    }

    public final void L0(boolean z) {
        ex1 ex1Var;
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2 = this.k3;
        if (animatorSet2 == null || !animatorSet2.isRunning()) {
            if (this.K1) {
                K1(true);
            }
            this.S3 = null;
            this.R3 = null;
            this.T3 = null;
            this.U3 = null;
            scc sccVar = this.g1;
            if (sccVar != null) {
                sccVar.a(true);
            }
            mw1 mw1Var = this.c1;
            if (mw1Var != null) {
                mw1Var.setVisibility(0);
            }
            byte b = 3;
            bw1 bw1Var = this.S4;
            bw1 bw1Var2 = this.O4;
            bw1 bw1Var3 = this.Q4;
            Property property = View.SCALE_Y;
            Property property2 = View.SCALE_X;
            ew1 ew1Var = this.R0;
            Property property3 = View.ALPHA;
            gw1 gw1Var = this.h2;
            if (z) {
                if (gw1Var != null) {
                    this.l2 = 0.0f;
                    gw1Var.setAlpha(0.0f);
                    gw1Var.setScaleX(0.0f);
                    gw1Var.setScaleY(0.0f);
                }
                this.n = 0.0f;
                this.h = 0.0f;
                l2();
                this.k3 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(ew1Var, bw1Var3, this.B0 ? 0.5f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(ew1Var, bw1Var2, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.h1, (Property<ry8, Float>) property3, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.h1, (Property<ry8, Float>) property2, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.h1, (Property<ry8, Float>) property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f1, (Property<cw1, Float>) property3, 0.0f));
                if (gw1Var != null) {
                    ViewPropertyAnimator viewPropertyAnimator = this.g2;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        this.g2 = null;
                    }
                    this.l2 = 1.0f;
                    arrayList.add(ObjectAnimator.ofFloat(gw1Var, (Property<gw1, Float>) property3, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(gw1Var, (Property<gw1, Float>) property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(gw1Var, (Property<gw1, Float>) property, 1.0f));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.F0, (Property<ex1, Float>) property3, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.F0, bw1Var, 0.0f));
                l lVar = this.E2;
                if (lVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(lVar, (Property<l, Float>) property3, 0.0f));
                    this.E2.e();
                }
                this.k3.playTogether(arrayList);
                ep0 ep0Var = this.m0;
                if (ep0Var != null) {
                    ep0Var.setAlpha(0.0f);
                    this.m0.setScaleY(0.0f);
                    this.m0.setScaleX(0.0f);
                    this.k3.playTogether(ObjectAnimator.ofFloat(this.m0, (Property<ep0, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.m0, (Property<ep0, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.m0, (Property<ep0, Float>) property, 1.0f));
                }
                this.k3.setDuration(150L);
                this.k3.addListener(new aw1(this, b));
            } else {
                boolean z2 = this.x5;
                ry8 ry8Var = this.h1;
                if (ry8Var != null && !z2) {
                    ry8Var.d();
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                boolean z3 = this.d1;
                long j = 600;
                Property property4 = View.TRANSLATION_X;
                if (z3) {
                    arrayList2.add(ObjectAnimator.ofFloat(this.g1, (Property<scc, Float>) property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.g1, (Property<scc, Float>) property4, -gl.L(20.0f)));
                    arrayList2.add(ObjectAnimator.ofFloat(this.F0, bw1Var, 0.0f));
                    l lVar2 = this.E2;
                    if (lVar2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(lVar2, (Property<l, Float>) property3, 0.0f));
                        this.E2.e();
                    }
                    animatorSet3.playTogether(arrayList2);
                    float f = this.s;
                    ex1 ex1Var2 = this.F0;
                    if (f == 1.0f) {
                        animatorSet3.playTogether(ObjectAnimator.ofFloat(ex1Var2, (Property<ex1, Float>) property3, 1.0f));
                    } else {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ex1Var2, (Property<ex1, Float>) property3, 1.0f);
                        ofFloat.setStartDelay(750L);
                        ofFloat.setDuration(200L);
                        animatorSet3.playTogether(ofFloat);
                    }
                } else {
                    ex1 ex1Var3 = this.F0;
                    if (ex1Var3 == null || this.s != 1.0f || z2) {
                        this.H = 0.0f;
                        p2();
                        if (z2 && (ex1Var = this.F0) != null) {
                            ex1Var.setAlpha(0.0f);
                        }
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.F0, (Property<ex1, Float>) property3, 1.0f);
                        ofFloat2.setStartDelay(z2 ? 600L : 750L);
                        ofFloat2.setDuration(z2 ? 360L : 200L);
                        if (z2) {
                            ofFloat2.setInterpolator(s33.g);
                        }
                        animatorSet3.playTogether(ofFloat2);
                    } else {
                        ex1Var3.setAlpha(1.0f);
                        this.H = 0.0f;
                        p2();
                    }
                    if (!z2) {
                        arrayList2.add(ObjectAnimator.ofFloat(this.i1, (Property<i29, Float>) property3, 0.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.i1, (Property<i29, Float>) property4, -gl.L(20.0f)));
                    }
                    l lVar3 = this.E2;
                    if (lVar3 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(lVar3, (Property<l, Float>) property3, 0.0f));
                        this.E2.e();
                    }
                    animatorSet3.playTogether(arrayList2);
                }
                animatorSet3.setDuration(200L);
                if (gw1Var != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.g2;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.g2 = null;
                    }
                    this.l2 = 0.0f;
                    gw1Var.setAlpha(0.0f);
                    gw1Var.setScaleX(0.0f);
                    gw1Var.setScaleY(0.0f);
                    animatorSet = new AnimatorSet();
                    this.l2 = 1.0f;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(gw1Var, (Property<gw1, Float>) property3, 1.0f), ObjectAnimator.ofFloat(gw1Var, (Property<gw1, Float>) property2, 1.0f), ObjectAnimator.ofFloat(gw1Var, (Property<gw1, Float>) property, 1.0f));
                    animatorSet.setDuration(150L);
                } else {
                    animatorSet = null;
                }
                this.n = 0.0f;
                this.h = z2 ? 0.6f : 0.0f;
                l2();
                AnimatorSet animatorSet4 = new AnimatorSet();
                float f2 = z2 ? 0.6f : 0.0f;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.h1, (Property<ry8, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.h1, (Property<ry8, Float>) property2, f2), ObjectAnimator.ofFloat(this.h1, (Property<ry8, Float>) property, f2), ObjectAnimator.ofFloat(ew1Var, bw1Var3, this.B0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(ew1Var, bw1Var2, 1.0f));
                ep0 ep0Var2 = this.m0;
                if (ep0Var2 != null) {
                    ep0Var2.setAlpha(0.0f);
                    this.m0.setScaleY(0.0f);
                    this.m0.setScaleX(0.0f);
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(this.m0, (Property<ep0, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.m0, (Property<ep0, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.m0, (Property<ep0, Float>) property, 1.0f));
                }
                animatorSet4.setDuration(z2 ? 220L : 150L);
                if (z2) {
                    animatorSet4.setInterpolator(s33.g);
                    j = 1040;
                }
                animatorSet4.setStartDelay(j);
                AnimatorSet animatorSet5 = new AnimatorSet();
                this.k3 = animatorSet5;
                if (animatorSet != null) {
                    animatorSet5.playTogether(animatorSet3, animatorSet, animatorSet4);
                } else {
                    animatorSet5.playTogether(animatorSet3, animatorSet4);
                }
                this.k3.addListener(new e(this));
            }
            AnimatorSet animatorSet6 = this.k3;
            if (animatorSet6 != null) {
                animatorSet6.start();
            }
            l lVar4 = this.E2;
            if (lVar4 != null) {
                lVar4.invalidate();
            }
        }
    }

    public final void L1(CharSequence charSequence, boolean z) {
        this.e = charSequence;
        this.f = null;
        m2(z);
    }

    public final void M() {
        boolean z;
        boolean z2;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        if (this.U2) {
            return;
        }
        if (this.f2 == null) {
            this.U2 = false;
            M1(false, false);
            return;
        }
        boolean z3 = true;
        this.U2 = true;
        this.y0 = true;
        this.z0 = true;
        if (cf3.y(this.G3)) {
            TLRPC.Chat K0 = na7.q1(this.S.a).K0(Long.valueOf(-this.G3));
            z = hc2.T(K0) && !K0.megagroup;
            if (z && !K0.creator && ((tL_chatAdminRights = K0.admin_rights) == null || !tL_chatAdminRights.post_messages)) {
                this.U2 = false;
            }
            this.y0 = hc2.s(K0);
            this.z0 = hc2.v(K0);
        } else {
            z = false;
        }
        if (!gba.v0) {
            this.U2 = false;
        }
        if (this.U2) {
            if (gba.L0) {
                CameraController.getInstance().initCamera(null);
            }
            z2 = na7.c1().getBoolean(z ? "currentModeVideoChannel" : "currentModeVideo", z);
        } else {
            z2 = false;
        }
        if (!this.y0 && z2) {
            z2 = false;
        }
        if (this.z0 || z2) {
            z3 = z2;
        } else if (!this.U2) {
            z3 = false;
        }
        M1(z3, false);
    }

    public final void M0() {
        q1();
        this.S3 = null;
        this.R3 = null;
        this.T3 = null;
        this.U3 = null;
        scc sccVar = this.g1;
        if (sccVar != null) {
            sccVar.a(true);
        }
        i29 i29Var = this.i1;
        if (i29Var != null) {
            i29Var.setAlpha(1.0f);
            this.i1.setTranslationX(0.0f);
        }
        scc sccVar2 = this.g1;
        if (sccVar2 != null) {
            sccVar2.setAlpha(1.0f);
            this.g1.setTranslationX(0.0f);
        }
        ex1 ex1Var = this.F0;
        if (ex1Var != null) {
            ex1Var.setAlpha(1.0f);
            this.H = 0.0f;
            p2();
            this.F0.requestFocus();
        }
        cw1 cw1Var = this.f1;
        if (cw1Var != null) {
            cw1Var.setVisibility(8);
        }
        U0();
    }

    public final void M1(boolean z, boolean z2) {
        String M0;
        mw1 mw1Var = this.c1;
        if (mw1Var == null) {
            return;
        }
        this.d1 = z;
        if (z2) {
            SharedPreferences c1 = na7.c1();
            boolean z3 = false;
            if (cf3.y(this.G3)) {
                TLRPC.Chat K0 = na7.q1(this.S.a).K0(Long.valueOf(-this.G3));
                if (hc2.T(K0) && !K0.megagroup) {
                    z3 = true;
                }
            }
            c1.edit().putBoolean(z3 ? "currentModeVideoChannel" : "currentModeVideo", z).apply();
        }
        mw1Var.j(this.d1 ? oy1.b : oy1.a, z2);
        mw1Var.setContentDescription(k96.M0(this.d1 ? 2131754735 : 2131754733, null));
        if (g0()) {
            M0 = k96.M0(2131754874, null);
        } else {
            M0 = k96.M0(this.d1 ? 2131754735 : 2131754733, null);
        }
        this.a1.setContentDescription(M0);
        i0();
        jy1 jy1Var = this.b2;
        if (jy1Var != null) {
            jy1Var.d(g0());
        }
        mw1Var.sendAccessibilityEvent(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:299:0x080b, code lost:
    
        if (r28.l1 == false) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0818, code lost:
    
        r9 = 0.5f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0816, code lost:
    
        if (r28.l1 == false) goto L287;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0ef8  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x084d  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0875  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0d43  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x0d6c  */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r3v139 */
    /* JADX WARN: Type inference failed for: r3v140, types: [android.animation.AnimatorSet, android.view.ViewPropertyAnimator] */
    /* JADX WARN: Type inference failed for: r3v175 */
    /* JADX WARN: Type inference failed for: r5v95 */
    /* JADX WARN: Type inference failed for: r5v96, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v97 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N(boolean z) {
        ow1 ow1Var;
        String str;
        ImageView imageView;
        a aVar;
        int i;
        boolean z2;
        AnimatorSet animatorSet;
        ?? r13;
        ImageView imageView2;
        boolean z3;
        gw1 gw1Var;
        gw1 gw1Var2;
        AnimatorSet animatorSet2;
        int i2;
        float f;
        gw1 gw1Var3;
        AnimatorSet animatorSet3;
        ImageView imageView3;
        int i3;
        boolean z4;
        ?? r3;
        byte b;
        ?? r5;
        int i4;
        if (this.P2 != null || this.v3) {
            return;
        }
        boolean z5 = this.Z2 ? false : z;
        x2();
        ex1 ex1Var = this.F0;
        CharSequence m1 = ex1Var == null ? "" : gl.m1(ex1Var.getTextToUse());
        int i5 = this.H0;
        ow1 ow1Var2 = this.K0;
        bw1 bw1Var = this.P4;
        a aVar2 = this.a1;
        Property property = View.SCALE_X;
        Property property2 = View.SCALE_Y;
        Property property3 = View.ALPHA;
        pkb pkbVar = this.f2;
        mw1 mw1Var = this.c1;
        ly1 ly1Var = this.G0;
        gw1 gw1Var4 = this.h2;
        ImageView imageView4 = this.Q0;
        boolean z6 = z5;
        if (i5 <= 0 || i5 == Integer.MAX_VALUE || V0()) {
            int length = m1.length();
            fm0 fm0Var = this.h7;
            if (length > 0 || this.x3 || this.t2 || this.R3 != null || this.U3 != null || ((this.H0 == Integer.MAX_VALUE && !V0()) || ((this.o7 && getStarsPrice() > 0) || fm0Var.f))) {
                ex1 ex1Var2 = this.F0;
                String caption = ex1Var2 == null ? null : ex1Var2.getCaption();
                boolean z7 = caption != null && (getSendButtonInternal().getVisibility() == 0 || ((gw1Var2 = this.T0) != null && gw1Var2.getVisibility() == 0));
                boolean z8 = caption == null && (imageView4.getVisibility() == 0 || ((gw1Var = this.T0) != null && gw1Var.getVisibility() == 0));
                int F0 = (this.H0 != Integer.MAX_VALUE || V0()) ? F0(bkb.Oe) : F0(bkb.Ml);
                boolean O0 = O0();
                ow1Var = ow1Var2;
                if (F0 != this.L0) {
                    this.L0 = F0;
                    Drawable background = ow1Var.getBackground();
                    int i6 = F0;
                    int red = Color.red(i6);
                    aVar = aVar2;
                    int green = Color.green(i6);
                    str = caption;
                    int blue = Color.blue(i6);
                    imageView = imageView4;
                    bkb.F1(background, Color.argb(24, red, green, blue), true);
                } else {
                    str = caption;
                    imageView = imageView4;
                    aVar = aVar2;
                }
                if (aVar.getVisibility() != 0 && ly1Var.getVisibility() != 0 && !z7 && !z8 && !fm0Var.f) {
                    dz1 dz1Var = this.e7;
                    if (dz1Var != null) {
                        dz1Var.e(0, O0 && !A2(), true);
                        if (gw1Var4 != null) {
                            ViewPropertyAnimator viewPropertyAnimator = this.g2;
                            if (viewPropertyAnimator != null) {
                                viewPropertyAnimator.cancel();
                                this.g2 = null;
                            }
                            ViewPropertyAnimator animate = gw1Var4.animate();
                            float f2 = y(O0) ? 0.0f : 1.0f;
                            this.l2 = f2;
                            ViewPropertyAnimator duration = animate.alpha(f2).scaleX(y(O0) ? 0.5f : 1.0f).scaleY(y(O0) ? 0.5f : 1.0f).setInterpolator(s33.h).setDuration(320L);
                            this.g2 = duration;
                            duration.start();
                        }
                    }
                } else {
                    if (!z6) {
                        ImageView imageView5 = imageView;
                        String str2 = str;
                        mw1Var.setScaleX(0.1f);
                        mw1Var.setScaleY(0.1f);
                        mw1Var.setAlpha(0.0f);
                        aVar.setVisibility(8);
                        if (ly1Var.getVisibility() == 0) {
                            ly1Var.setScaleX(0.1f);
                            ly1Var.setScaleY(0.1f);
                            ly1Var.setAlpha(0.0f);
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
                        gw1 gw1Var5 = this.T0;
                        if (gw1Var5 == null || gw1Var5.getVisibility() != 0) {
                            i = 8;
                        } else {
                            this.T0.setScaleX(0.1f);
                            this.T0.setScaleY(0.1f);
                            this.T0.setAlpha(0.0f);
                            i = 8;
                            this.T0.setVisibility(8);
                        }
                        if (pkbVar != null) {
                            pkbVar.setVisibility(i);
                            if (this.P3 != null && getVisibility() == 0) {
                                this.P3.H();
                            }
                            n2(0);
                            dz1 dz1Var2 = this.e7;
                            if (dz1Var2 != null) {
                                dz1Var2.e(0, O0 && !A2(), true);
                                if (gw1Var4 != null) {
                                    float f3 = y(O0) ? 0.0f : 1.0f;
                                    this.l2 = f3;
                                    gw1Var4.setAlpha(f3);
                                    gw1Var4.setScaleX(y(O0) ? 0.5f : 1.0f);
                                    gw1Var4.setScaleY(y(O0) ? 0.5f : 1.0f);
                                }
                            } else if (gw1Var4 != null) {
                                this.l2 = 0.0f;
                                gw1Var4.setAlpha(0.0f);
                                gw1Var4.setScaleX(0.5f);
                                gw1Var4.setScaleY(0.5f);
                            }
                        }
                        z2 = true;
                        this.B2 = true;
                        if (this.z2 != null) {
                            hy1 hy1Var = this.P3;
                            if (hy1Var != null && hy1Var.M()) {
                                this.z2.setVisibility(8);
                                this.z2.setTag(null);
                            }
                            this.z2.setAlpha(0.0f);
                            this.z2.setScaleX(0.0f);
                            this.z2.setScaleY(1.0f);
                            this.z2.setTranslationX(0.0f);
                        }
                        z3 = z2;
                        if (!this.Z5 || (imageView3 = this.m2) == null) {
                            return;
                        }
                        if (z6) {
                            imageView3.animate().translationX(z3 ? -b00.c(64.0f, ow1Var.l(), 0) : gl.L(42.0f)).setDuration(320L).setInterpolator(s33.h).start();
                            return;
                        } else {
                            imageView3.setTranslationX(z3 ? -b00.c(64.0f, ow1Var.l(), 0) : gl.L(42.0f));
                            return;
                        }
                    }
                    byte b2 = this.l3;
                    if (b2 == 1 && str == null) {
                        return;
                    }
                    if (b2 == 3 && str != null) {
                        return;
                    }
                    AnimatorSet animatorSet4 = this.h3;
                    if (animatorSet4 != null) {
                        animatorSet4.cancel();
                        animatorSet = null;
                        this.h3 = null;
                    } else {
                        animatorSet = null;
                    }
                    AnimatorSet animatorSet5 = this.i3;
                    if (animatorSet5 != null) {
                        animatorSet5.cancel();
                        this.i3 = animatorSet;
                    }
                    if (pkbVar != null) {
                        this.i3 = new AnimatorSet();
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(ObjectAnimator.ofFloat(pkbVar, bw1Var, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(pkbVar, (Property<pkb, Float>) property, 0.5f));
                        ViewPropertyAnimator viewPropertyAnimator2 = this.g2;
                        if (viewPropertyAnimator2 != null) {
                            viewPropertyAnimator2.cancel();
                            this.g2 = null;
                        }
                        dz1 dz1Var3 = this.e7;
                        if (dz1Var3 != null) {
                            dz1Var3.e(0, O0 && !A2(), true);
                            if (gw1Var4 != null) {
                                float f4 = y(O0) ? 0.0f : 1.0f;
                                this.l2 = f4;
                                arrayList.add(ObjectAnimator.ofFloat(gw1Var4, (Property<gw1, Float>) property3, f4));
                                arrayList.add(ObjectAnimator.ofFloat(gw1Var4, (Property<gw1, Float>) property, y(O0) ? 0.5f : 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(gw1Var4, (Property<gw1, Float>) property2, y(O0) ? 0.5f : 1.0f));
                            }
                        } else if (gw1Var4 != null) {
                            this.l2 = 0.0f;
                            arrayList.add(ObjectAnimator.ofFloat(gw1Var4, (Property<gw1, Float>) property3, 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(gw1Var4, (Property<gw1, Float>) property, 0.5f));
                            arrayList.add(ObjectAnimator.ofFloat(gw1Var4, (Property<gw1, Float>) property2, 0.5f));
                        }
                        hy1 hy1Var2 = this.P3;
                        boolean z9 = hy1Var2 != null && hy1Var2.M();
                        this.B2 = true;
                        pw1 pw1Var = this.z2;
                        if (pw1Var != null) {
                            pw1Var.setScaleY(1.0f);
                            pw1 pw1Var2 = this.z2;
                            if (z9) {
                                pw1Var2.setTag(null);
                                arrayList.add(ObjectAnimator.ofFloat(this.z2, (Property<pw1, Float>) property3, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(this.z2, (Property<pw1, Float>) property, 0.0f));
                                arrayList.add(n(0.0f));
                            } else {
                                pw1Var2.setAlpha(0.0f);
                                this.z2.setScaleX(0.0f);
                                this.z2.setTranslationX(0.0f);
                            }
                        }
                        this.i3.playTogether(arrayList);
                        this.i3.setDuration(100L);
                        this.i3.addListener(new rw1(this, z9, (byte) 2));
                        this.i3.start();
                        n2(0);
                        if (this.P3 != null && getVisibility() == 0) {
                            this.P3.H();
                        }
                    }
                    this.h3 = new AnimatorSet();
                    ArrayList arrayList2 = new ArrayList();
                    if (aVar.getVisibility() == 0) {
                        r13 = 0;
                        arrayList2.add(ObjectAnimator.ofFloat(mw1Var, (Property<mw1, Float>) property, 0.1f));
                        arrayList2.add(ObjectAnimator.ofFloat(mw1Var, (Property<mw1, Float>) property2, 0.1f));
                        arrayList2.add(ObjectAnimator.ofFloat(mw1Var, (Property<mw1, Float>) property3, 0.0f));
                    } else {
                        r13 = 0;
                    }
                    gw1 gw1Var6 = this.T0;
                    if (gw1Var6 != null && gw1Var6.getVisibility() == 0) {
                        gw1 gw1Var7 = this.T0;
                        float[] fArr = new float[1];
                        fArr[r13] = 0.1f;
                        arrayList2.add(ObjectAnimator.ofFloat(gw1Var7, (Property<gw1, Float>) property, fArr));
                        gw1 gw1Var8 = this.T0;
                        float[] fArr2 = new float[1];
                        fArr2[r13] = 0.1f;
                        arrayList2.add(ObjectAnimator.ofFloat(gw1Var8, (Property<gw1, Float>) property2, fArr2));
                        gw1 gw1Var9 = this.T0;
                        float[] fArr3 = new float[1];
                        fArr3[r13] = 0.0f;
                        arrayList2.add(ObjectAnimator.ofFloat(gw1Var9, (Property<gw1, Float>) property3, fArr3));
                    }
                    if (ly1Var.getVisibility() == 0) {
                        float[] fArr4 = new float[1];
                        fArr4[r13] = 0.1f;
                        arrayList2.add(ObjectAnimator.ofFloat(ly1Var, (Property<ly1, Float>) property, fArr4));
                        float[] fArr5 = new float[1];
                        fArr5[r13] = 0.1f;
                        arrayList2.add(ObjectAnimator.ofFloat(ly1Var, (Property<ly1, Float>) property2, fArr5));
                        float[] fArr6 = new float[1];
                        fArr6[r13] = 0.0f;
                        arrayList2.add(ObjectAnimator.ofFloat(ly1Var, (Property<ly1, Float>) property3, fArr6));
                    }
                    if (z7) {
                        arrayList2.add(o(r13));
                    } else if (z8) {
                        float[] fArr7 = new float[1];
                        fArr7[r13] = 0.1f;
                        ImageView imageView6 = imageView;
                        arrayList2.add(ObjectAnimator.ofFloat(imageView6, (Property<ImageView, Float>) property, fArr7));
                        float[] fArr8 = new float[1];
                        fArr8[r13] = 0.1f;
                        arrayList2.add(ObjectAnimator.ofFloat(imageView6, (Property<ImageView, Float>) property2, fArr8));
                        float[] fArr9 = new float[1];
                        fArr9[r13] = 0.0f;
                        arrayList2.add(ObjectAnimator.ofFloat(imageView6, (Property<ImageView, Float>) property3, fArr9));
                        imageView2 = imageView6;
                        if (str == null) {
                            this.l3 = (byte) 3;
                            float[] fArr10 = new float[1];
                            fArr10[r13] = 1.0f;
                            arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, fArr10));
                            float[] fArr11 = new float[1];
                            fArr11[r13] = 1.0f;
                            arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, fArr11));
                            float[] fArr12 = new float[1];
                            fArr12[r13] = 1.0f;
                            arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, fArr12));
                            imageView2.setVisibility(r13);
                        } else {
                            this.l3 = (byte) 1;
                            arrayList2.add(o(true));
                            getSendButtonInternal().setVisibility(r13);
                        }
                        this.h3.playTogether(arrayList2);
                        this.h3.setDuration(220L);
                        this.h3.setInterpolator(s33.h);
                        this.h3.addListener(new u5(this, str, (byte) 9));
                        this.h3.start();
                    }
                    imageView2 = imageView;
                    if (str == null) {
                    }
                    this.h3.playTogether(arrayList2);
                    this.h3.setDuration(220L);
                    this.h3.setInterpolator(s33.h);
                    this.h3.addListener(new u5(this, str, (byte) 9));
                    this.h3.start();
                }
                z2 = true;
                z3 = z2;
                if (this.Z5) {
                    return;
                } else {
                    return;
                }
            }
            if (this.V0 == null || !this.X0 || (!(this.n4 || (this.o4 && this.H2 == 2)) || gl.E || this.o7)) {
                if (getSendButtonInternal().getVisibility() == 0 || imageView4.getVisibility() == 0 || (((gw1Var3 = this.T0) != null && gw1Var3.getVisibility() == 0) || ly1Var.getVisibility() == 0)) {
                    if (!z6) {
                        ly1Var.setScaleX(0.1f);
                        ly1Var.setScaleY(0.1f);
                        ly1Var.setAlpha(0.0f);
                        setSlowModeButtonVisible(false);
                        getSendButtonInternal().setScaleX(0.1f);
                        getSendButtonInternal().setScaleY(0.1f);
                        getSendButtonInternal().setAlpha(0.0f);
                        getSendButtonInternal().setVisibility(8);
                        imageView4.setScaleX(0.1f);
                        imageView4.setScaleY(0.1f);
                        imageView4.setAlpha(0.0f);
                        imageView4.setVisibility(8);
                        gw1 gw1Var10 = this.T0;
                        if (gw1Var10 != null) {
                            gw1Var10.setScaleX(0.1f);
                            this.T0.setScaleY(0.1f);
                            this.T0.setAlpha(0.0f);
                            this.T0.setVisibility(8);
                        }
                        mw1Var.setScaleX(1.0f);
                        mw1Var.setScaleY(1.0f);
                        mw1Var.setAlpha(1.0f);
                        aVar2.setVisibility(0);
                        if (pkbVar != null) {
                            if (getVisibility() == 0) {
                                this.P3.p1();
                            }
                            this.F = 1.0f;
                            g2();
                            pkbVar.setScaleX(1.0f);
                            pkbVar.setVisibility(0);
                            n2(1);
                        }
                        if (gw1Var4 != null) {
                            ViewPropertyAnimator viewPropertyAnimator3 = this.g2;
                            if (viewPropertyAnimator3 != null) {
                                viewPropertyAnimator3.cancel();
                                this.g2 = null;
                            }
                            this.l2 = 1.0f;
                            gw1Var4.setAlpha(1.0f);
                            gw1Var4.setScaleX(1.0f);
                            gw1Var4.setScaleY(1.0f);
                        }
                        this.B2 = false;
                        hy1 hy1Var3 = this.P3;
                        if (hy1Var3 != null && hy1Var3.M()) {
                            e0();
                        }
                        if (this.z2 != null) {
                            hy1 hy1Var4 = this.P3;
                            if (hy1Var4 != null && hy1Var4.M()) {
                                this.z2.setVisibility(0);
                                this.z2.setTag(1);
                            }
                            this.z2.setAlpha(1.0f);
                            this.z2.setScaleX(1.0f);
                            this.z2.setScaleY(1.0f);
                            this.z2.setTranslationX(0.0f);
                        }
                    } else {
                        if (this.l3 == 2) {
                            return;
                        }
                        AnimatorSet animatorSet6 = this.h3;
                        if (animatorSet6 != null) {
                            animatorSet6.cancel();
                            animatorSet2 = null;
                            this.h3 = null;
                        } else {
                            animatorSet2 = null;
                        }
                        AnimatorSet animatorSet7 = this.i3;
                        if (animatorSet7 != null) {
                            animatorSet7.cancel();
                            this.i3 = animatorSet2;
                        }
                        if (pkbVar != null) {
                            if (pkbVar.getVisibility() != 0) {
                                pkbVar.setVisibility(0);
                                this.F = 0.0f;
                                g2();
                                pkbVar.setScaleX(0.0f);
                            }
                            this.i3 = new AnimatorSet();
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(ObjectAnimator.ofFloat(pkbVar, bw1Var, 1.0f));
                            arrayList3.add(ObjectAnimator.ofFloat(pkbVar, (Property<pkb, Float>) property, 1.0f));
                            dz1 dz1Var4 = this.e7;
                            if (dz1Var4 != null) {
                                dz1Var4.e(0, false, true);
                            }
                            if (gw1Var4 != null) {
                                ViewPropertyAnimator viewPropertyAnimator4 = this.g2;
                                if (viewPropertyAnimator4 != null) {
                                    viewPropertyAnimator4.cancel();
                                    this.g2 = null;
                                }
                                this.l2 = 1.0f;
                                arrayList3.add(ObjectAnimator.ofFloat(gw1Var4, (Property<gw1, Float>) property3, 1.0f));
                                arrayList3.add(ObjectAnimator.ofFloat(gw1Var4, (Property<gw1, Float>) property, 1.0f));
                                arrayList3.add(ObjectAnimator.ofFloat(gw1Var4, (Property<gw1, Float>) property2, 1.0f));
                            }
                            hy1 hy1Var5 = this.P3;
                            boolean z10 = hy1Var5 != null && hy1Var5.M();
                            this.B2 = false;
                            if (z10) {
                                e0();
                            }
                            pw1 pw1Var3 = this.z2;
                            if (pw1Var3 != null) {
                                if (z10) {
                                    pw1Var3.setVisibility(0);
                                    this.z2.setTag(1);
                                    this.z2.setPivotX(gl.L(44.0f));
                                    arrayList3.add(ObjectAnimator.ofFloat(this.z2, (Property<pw1, Float>) property3, 1.0f));
                                    arrayList3.add(ObjectAnimator.ofFloat(this.z2, (Property<pw1, Float>) property, 1.0f));
                                    arrayList3.add(n(0.0f));
                                    ImageView imageView7 = this.y2;
                                    if (imageView7 != null && imageView7.getVisibility() == 0) {
                                        imageView7.setVisibility(8);
                                    }
                                } else {
                                    pw1Var3.setAlpha(1.0f);
                                    this.z2.setScaleX(1.0f);
                                    this.z2.setScaleY(1.0f);
                                    this.z2.setTranslationX(0.0f);
                                }
                            }
                            this.i3.playTogether(arrayList3);
                            this.i3.setDuration(100L);
                            this.i3.addListener(new aw1(this, (byte) 8));
                            this.i3.start();
                            n2(1);
                            if (getVisibility() == 0) {
                                this.P3.p1();
                            }
                        }
                        aVar2.setVisibility(0);
                        this.h3 = new AnimatorSet();
                        this.l3 = (byte) 2;
                        ArrayList arrayList4 = new ArrayList();
                        mu1 mu1Var = this.F3;
                        TLRPC.Chat f5 = mu1Var == null ? null : mu1Var.f();
                        TLRPC.UserFull userFull = mu1Var == null ? this.L : mu1Var.s8;
                        if (f5 != null) {
                            if (!hc2.v(f5)) {
                                if (!hc2.s(f5)) {
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
                            arrayList4.add(ObjectAnimator.ofFloat(mw1Var, (Property<mw1, Float>) property, fArr13));
                            float[] fArr14 = new float[i2];
                            fArr14[0] = 1.0f;
                            arrayList4.add(ObjectAnimator.ofFloat(mw1Var, (Property<mw1, Float>) property2, fArr14));
                            float[] fArr15 = new float[i2];
                            fArr15[0] = f;
                            arrayList4.add(ObjectAnimator.ofFloat(mw1Var, (Property<mw1, Float>) property3, fArr15));
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
                                gw1 gw1Var11 = this.T0;
                                if (gw1Var11 != null && gw1Var11.getVisibility() == 0) {
                                    gw1 gw1Var12 = this.T0;
                                    float[] fArr19 = new float[i2];
                                    fArr19[0] = 0.1f;
                                    arrayList4.add(ObjectAnimator.ofFloat(gw1Var12, (Property<gw1, Float>) property, fArr19));
                                    gw1 gw1Var13 = this.T0;
                                    float[] fArr20 = new float[i2];
                                    fArr20[0] = 0.1f;
                                    arrayList4.add(ObjectAnimator.ofFloat(gw1Var13, (Property<gw1, Float>) property2, fArr20));
                                    gw1 gw1Var14 = this.T0;
                                    float[] fArr21 = new float[i2];
                                    fArr21[0] = 0.0f;
                                    arrayList4.add(ObjectAnimator.ofFloat(gw1Var14, (Property<gw1, Float>) property3, fArr21));
                                } else if (ly1Var.getVisibility() == 0) {
                                    float[] fArr22 = new float[i2];
                                    fArr22[0] = 0.1f;
                                    arrayList4.add(ObjectAnimator.ofFloat(ly1Var, (Property<ly1, Float>) property, fArr22));
                                    float[] fArr23 = new float[i2];
                                    fArr23[0] = 0.1f;
                                    arrayList4.add(ObjectAnimator.ofFloat(ly1Var, (Property<ly1, Float>) property2, fArr23));
                                    float[] fArr24 = new float[i2];
                                    fArr24[0] = 0.0f;
                                    arrayList4.add(ObjectAnimator.ofFloat(ly1Var, (Property<ly1, Float>) property3, fArr24));
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
                            this.h3.playTogether(arrayList4);
                            this.h3.setDuration(150L);
                            this.h3.addListener(new aw1(this, (byte) 9));
                            this.h3.start();
                        }
                        i2 = 1;
                        float[] fArr132 = new float[i2];
                        fArr132[0] = 1.0f;
                        arrayList4.add(ObjectAnimator.ofFloat(mw1Var, (Property<mw1, Float>) property, fArr132));
                        float[] fArr142 = new float[i2];
                        fArr142[0] = 1.0f;
                        arrayList4.add(ObjectAnimator.ofFloat(mw1Var, (Property<mw1, Float>) property2, fArr142));
                        float[] fArr152 = new float[i2];
                        fArr152[0] = f;
                        arrayList4.add(ObjectAnimator.ofFloat(mw1Var, (Property<mw1, Float>) property3, fArr152));
                        if (imageView4.getVisibility() != 0) {
                        }
                        this.h3.playTogether(arrayList4);
                        this.h3.setDuration(150L);
                        this.h3.addListener(new aw1(this, (byte) 9));
                        this.h3.start();
                    }
                }
            } else if (!z6) {
                ly1Var.setScaleX(0.1f);
                ly1Var.setScaleY(0.1f);
                ly1Var.setAlpha(0.0f);
                setSlowModeButtonVisible(false);
                getSendButtonInternal().setScaleX(0.1f);
                getSendButtonInternal().setScaleY(0.1f);
                getSendButtonInternal().setAlpha(0.0f);
                getSendButtonInternal().setVisibility(8);
                imageView4.setScaleX(0.1f);
                imageView4.setScaleY(0.1f);
                imageView4.setAlpha(0.0f);
                imageView4.setVisibility(8);
                mw1Var.setScaleX(0.1f);
                mw1Var.setScaleY(0.1f);
                mw1Var.setAlpha(0.0f);
                aVar2.setVisibility(8);
                Y();
                this.T0.setScaleX(1.0f);
                this.T0.setScaleY(1.0f);
                this.T0.setAlpha(1.0f);
                this.T0.setVisibility(0);
                if (pkbVar != null) {
                    if (getVisibility() == 0) {
                        this.P3.p1();
                    }
                    pkbVar.setVisibility(0);
                    n2(1);
                }
                this.B2 = false;
                hy1 hy1Var6 = this.P3;
                boolean z11 = hy1Var6 != null && hy1Var6.M();
                if (z11) {
                    e0();
                }
                pw1 pw1Var4 = this.z2;
                if (pw1Var4 != null) {
                    if (z11) {
                        pw1Var4.setVisibility(0);
                        this.z2.setTag(1);
                    }
                    this.z2.setAlpha(1.0f);
                    this.z2.setScaleX(1.0f);
                    this.z2.setScaleY(1.0f);
                    this.z2.setTranslationX(0.0f);
                }
            } else {
                if (this.l3 == 4) {
                    return;
                }
                AnimatorSet animatorSet8 = this.h3;
                if (animatorSet8 != null) {
                    animatorSet8.cancel();
                    animatorSet3 = null;
                    this.h3 = null;
                } else {
                    animatorSet3 = null;
                }
                AnimatorSet animatorSet9 = this.i3;
                if (animatorSet9 != null) {
                    animatorSet9.cancel();
                    this.i3 = animatorSet3;
                }
                if (pkbVar != null && !this.m3) {
                    pkbVar.setVisibility(0);
                    this.i3 = new AnimatorSet();
                    ArrayList arrayList5 = new ArrayList();
                    arrayList5.add(ObjectAnimator.ofFloat(pkbVar, bw1Var, 1.0f));
                    arrayList5.add(ObjectAnimator.ofFloat(pkbVar, (Property<pkb, Float>) property, 1.0f));
                    dz1 dz1Var5 = this.e7;
                    if (dz1Var5 != null) {
                        dz1Var5.e(0, false, true);
                    }
                    if (gw1Var4 != null) {
                        ViewPropertyAnimator viewPropertyAnimator5 = this.g2;
                        if (viewPropertyAnimator5 != null) {
                            viewPropertyAnimator5.cancel();
                            this.g2 = null;
                        }
                        this.l2 = 1.0f;
                        arrayList5.add(ObjectAnimator.ofFloat(gw1Var4, (Property<gw1, Float>) property3, 1.0f));
                        arrayList5.add(ObjectAnimator.ofFloat(gw1Var4, (Property<gw1, Float>) property, 1.0f));
                        arrayList5.add(ObjectAnimator.ofFloat(gw1Var4, (Property<gw1, Float>) property2, 1.0f));
                    }
                    hy1 hy1Var7 = this.P3;
                    boolean z12 = hy1Var7 != null && hy1Var7.M();
                    this.B2 = false;
                    if (z12) {
                        e0();
                    }
                    pw1 pw1Var5 = this.z2;
                    if (pw1Var5 != null) {
                        pw1Var5.setScaleY(1.0f);
                        pw1 pw1Var6 = this.z2;
                        if (z12) {
                            pw1Var6.setVisibility(0);
                            this.z2.setTag(1);
                            this.z2.setPivotX(gl.L(44.0f));
                            arrayList5.add(ObjectAnimator.ofFloat(this.z2, (Property<pw1, Float>) property3, 1.0f));
                            arrayList5.add(ObjectAnimator.ofFloat(this.z2, (Property<pw1, Float>) property, 1.0f));
                            arrayList5.add(n(0.0f));
                        } else {
                            pw1Var6.setAlpha(1.0f);
                            this.z2.setScaleX(1.0f);
                            this.z2.setTranslationX(0.0f);
                        }
                    }
                    this.i3.playTogether(arrayList5);
                    this.i3.setDuration(100L);
                    this.i3.addListener(new aw1(this, (byte) 6));
                    this.i3.start();
                    n2(1);
                    if (getVisibility() == 0) {
                        this.P3.p1();
                    }
                }
                Y();
                this.T0.setVisibility(0);
                this.h3 = new AnimatorSet();
                this.l3 = (byte) 4;
                ArrayList arrayList6 = new ArrayList();
                arrayList6.add(ObjectAnimator.ofFloat(this.T0, (Property<gw1, Float>) property, 1.0f));
                arrayList6.add(ObjectAnimator.ofFloat(this.T0, (Property<gw1, Float>) property2, 1.0f));
                arrayList6.add(ObjectAnimator.ofFloat(this.T0, (Property<gw1, Float>) property3, 1.0f));
                if (imageView4.getVisibility() == 0) {
                    arrayList6.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property2, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property3, 0.0f));
                } else if (aVar2.getVisibility() == 0) {
                    arrayList6.add(ObjectAnimator.ofFloat(mw1Var, (Property<mw1, Float>) property, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(mw1Var, (Property<mw1, Float>) property2, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(mw1Var, (Property<mw1, Float>) property3, 0.0f));
                } else if (ly1Var.getVisibility() == 0) {
                    arrayList6.add(ObjectAnimator.ofFloat(ly1Var, (Property<ly1, Float>) property, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(ly1Var, (Property<ly1, Float>) property2, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(ly1Var, (Property<ly1, Float>) property3, 0.0f));
                } else {
                    arrayList6.add(ObjectAnimator.ofFloat(getSendButtonInternal(), (Property<View, Float>) property, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(getSendButtonInternal(), (Property<View, Float>) property2, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(getSendButtonInternal(), (Property<View, Float>) property3, 0.0f));
                }
                this.h3.playTogether(arrayList6);
                this.h3.setDuration(250L);
                this.h3.addListener(new aw1(this, (byte) 7));
                this.h3.start();
            }
        } else if (ly1Var.getVisibility() != 0) {
            if (!z6) {
                ly1Var.setScaleX(1.0f);
                ly1Var.setScaleY(1.0f);
                ly1Var.setAlpha(1.0f);
                setSlowModeButtonVisible(true);
                mw1Var.setScaleX(0.1f);
                mw1Var.setScaleY(0.1f);
                mw1Var.setAlpha(0.0f);
                aVar2.setVisibility(8);
                getSendButtonInternal().setScaleX(0.1f);
                getSendButtonInternal().setScaleY(0.1f);
                getSendButtonInternal().setAlpha(0.0f);
                getSendButtonInternal().setVisibility(8);
                imageView4.setScaleX(0.1f);
                imageView4.setScaleY(0.1f);
                imageView4.setAlpha(0.0f);
                imageView4.setVisibility(8);
                gw1 gw1Var15 = this.T0;
                if (gw1Var15 == null || gw1Var15.getVisibility() != 0) {
                    i3 = 8;
                } else {
                    this.T0.setScaleX(0.1f);
                    this.T0.setScaleY(0.1f);
                    this.T0.setAlpha(0.0f);
                    i3 = 8;
                    this.T0.setVisibility(8);
                }
                if (pkbVar != null) {
                    pkbVar.setVisibility(i3);
                    if (this.P3 != null && getVisibility() == 0) {
                        this.P3.H();
                    }
                    z4 = false;
                    n2(0);
                    dz1 dz1Var6 = this.e7;
                    if (dz1Var6 != null) {
                        dz1Var6.e(0, false, false);
                    }
                    if (gw1Var4 != null) {
                        this.l2 = 0.0f;
                        gw1Var4.setAlpha(0.0f);
                        gw1Var4.setScaleX(0.5f);
                        gw1Var4.setScaleY(0.5f);
                    }
                } else {
                    z4 = false;
                }
                this.B2 = z4;
                hy1 hy1Var8 = this.P3;
                boolean z13 = hy1Var8 != null && hy1Var8.M();
                if (z13) {
                    e0();
                }
                pw1 pw1Var7 = this.z2;
                if (pw1Var7 != null) {
                    if (z13) {
                        pw1Var7.setVisibility(0);
                        this.z2.setTag(1);
                    }
                    this.z2.setTranslationX(0.0f);
                    this.z2.setAlpha(1.0f);
                    this.z2.setScaleX(1.0f);
                    this.z2.setScaleY(1.0f);
                }
            } else {
                if (this.l3 == 5) {
                    return;
                }
                AnimatorSet animatorSet10 = this.h3;
                if (animatorSet10 != null) {
                    animatorSet10.cancel();
                    r3 = 0;
                    this.h3 = null;
                } else {
                    r3 = 0;
                }
                AnimatorSet animatorSet11 = this.i3;
                if (animatorSet11 != null) {
                    animatorSet11.cancel();
                    this.i3 = r3;
                }
                ViewPropertyAnimator viewPropertyAnimator6 = this.g2;
                if (viewPropertyAnimator6 != null) {
                    viewPropertyAnimator6.cancel();
                    this.g2 = r3;
                }
                if (pkbVar != null) {
                    this.i3 = new AnimatorSet();
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(ObjectAnimator.ofFloat(pkbVar, bw1Var, 0.0f));
                    arrayList7.add(ObjectAnimator.ofFloat(pkbVar, (Property<pkb, Float>) property, 0.5f));
                    this.B2 = false;
                    hy1 hy1Var9 = this.P3;
                    boolean z14 = hy1Var9 != null && hy1Var9.M();
                    if (z14) {
                        e0();
                    }
                    dz1 dz1Var7 = this.e7;
                    if (dz1Var7 != null) {
                        dz1Var7.e(0, false, true);
                    }
                    if (gw1Var4 != null) {
                        this.l2 = 0.0f;
                        arrayList7.add(ObjectAnimator.ofFloat(gw1Var4, (Property<gw1, Float>) property3, 0.0f));
                        arrayList7.add(ObjectAnimator.ofFloat(gw1Var4, (Property<gw1, Float>) property, 0.5f));
                        arrayList7.add(ObjectAnimator.ofFloat(gw1Var4, (Property<gw1, Float>) property2, 0.5f));
                    }
                    pw1 pw1Var8 = this.z2;
                    if (pw1Var8 != null) {
                        pw1Var8.setScaleY(1.0f);
                        pw1 pw1Var9 = this.z2;
                        if (z14) {
                            pw1Var9.setVisibility(0);
                            this.z2.setTag(1);
                            this.z2.setPivotX(gl.L(44.0f));
                            arrayList7.add(n(0.0f));
                            arrayList7.add(ObjectAnimator.ofFloat(this.z2, (Property<pw1, Float>) property3, 1.0f));
                            arrayList7.add(ObjectAnimator.ofFloat(this.z2, (Property<pw1, Float>) property, 1.0f));
                        } else {
                            pw1Var9.setTranslationX(0.0f);
                            this.z2.setAlpha(1.0f);
                            this.z2.setScaleX(1.0f);
                        }
                    }
                    this.i3.playTogether(arrayList7);
                    this.i3.setDuration(100L);
                    this.i3.addListener(new aw1(this, (byte) 4));
                    this.i3.start();
                    n2(0);
                    if (this.P3 != null && getVisibility() == 0) {
                        this.P3.H();
                    }
                    b = 5;
                } else {
                    b = 5;
                }
                this.l3 = b;
                this.h3 = new AnimatorSet();
                ArrayList arrayList8 = new ArrayList();
                if (aVar2.getVisibility() == 0) {
                    i4 = 1;
                    r5 = 0;
                    arrayList8.add(ObjectAnimator.ofFloat(mw1Var, (Property<mw1, Float>) property, 0.1f));
                    arrayList8.add(ObjectAnimator.ofFloat(mw1Var, (Property<mw1, Float>) property2, 0.1f));
                    arrayList8.add(ObjectAnimator.ofFloat(mw1Var, (Property<mw1, Float>) property3, 0.0f));
                } else {
                    r5 = 0;
                    i4 = 1;
                }
                gw1 gw1Var16 = this.T0;
                if (gw1Var16 != null && gw1Var16.getVisibility() == 0) {
                    gw1 gw1Var17 = this.T0;
                    float[] fArr28 = new float[i4];
                    fArr28[r5] = 0.1f;
                    arrayList8.add(ObjectAnimator.ofFloat(gw1Var17, (Property<gw1, Float>) property, fArr28));
                    gw1 gw1Var18 = this.T0;
                    float[] fArr29 = new float[i4];
                    fArr29[r5] = 0.1f;
                    arrayList8.add(ObjectAnimator.ofFloat(gw1Var18, (Property<gw1, Float>) property2, fArr29));
                    gw1 gw1Var19 = this.T0;
                    float[] fArr30 = new float[i4];
                    fArr30[r5] = 0.0f;
                    arrayList8.add(ObjectAnimator.ofFloat(gw1Var19, (Property<gw1, Float>) property3, fArr30));
                }
                if (getSendButtonInternal().getVisibility() == 0) {
                    arrayList8.add(o(r5));
                }
                if (imageView4.getVisibility() == 0) {
                    float[] fArr31 = new float[1];
                    fArr31[r5] = 0.1f;
                    arrayList8.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property, fArr31));
                    float[] fArr32 = new float[1];
                    fArr32[r5] = 0.1f;
                    arrayList8.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property2, fArr32));
                    float[] fArr33 = new float[1];
                    fArr33[r5] = 0.0f;
                    arrayList8.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property3, fArr33));
                }
                float[] fArr34 = new float[1];
                fArr34[r5] = 1.0f;
                arrayList8.add(ObjectAnimator.ofFloat(ly1Var, (Property<ly1, Float>) property, fArr34));
                float[] fArr35 = new float[1];
                fArr35[r5] = 1.0f;
                arrayList8.add(ObjectAnimator.ofFloat(ly1Var, (Property<ly1, Float>) property2, fArr35));
                float[] fArr36 = new float[1];
                fArr36[r5] = 1.0f;
                arrayList8.add(ObjectAnimator.ofFloat(ly1Var, (Property<ly1, Float>) property3, fArr36));
                setSlowModeButtonVisible(true);
                this.h3.playTogether(arrayList8);
                this.h3.setDuration(220L);
                this.h3.setInterpolator(s33.h);
                this.h3.addListener(new aw1(this, (byte) 5));
                this.h3.start();
            }
        }
        ow1Var = ow1Var2;
        z3 = false;
        if (this.Z5) {
        }
    }

    public void N0(boolean z) {
        if (this.w2 == null || !this.V3) {
            return;
        }
        uv1 uv1Var = this.W;
        if (uv1Var != null) {
            gl.r(uv1Var);
        }
        this.V3 = false;
        this.W3 = false;
        if (this.X3) {
            this.g7.a(false, z);
        }
    }

    public final void N1(k27 k27Var, bu1 bu1Var, k27 k27Var2) {
        k27 k27Var3;
        mu1 mu1Var = this.F3;
        boolean z = (mu1Var == null || !mu1Var.N7() || this.K3 == k27Var2) ? false : true;
        if (k27Var != null) {
            if (this.M3 == null && (k27Var3 = this.c3) != this.J3) {
                this.M3 = k27Var3;
            }
            this.J3 = k27Var;
            this.L3 = bu1Var;
            this.K3 = k27Var2;
            if (mu1Var == null || !mu1Var.x4 || mu1Var.m4 != k27Var) {
                A1(k27Var, true, true);
            }
        } else if (this.J3 == this.c3) {
            this.J3 = null;
            this.K3 = null;
            this.L3 = null;
            A1(this.M3, true, false);
            this.M3 = null;
        } else {
            this.J3 = null;
            this.L3 = null;
            this.K3 = null;
        }
        J(true);
        hy1 hy1Var = this.P3;
        TL_stories.StoryItem t0 = hy1Var != null ? hy1Var.t0() : null;
        MediaController w = MediaController.w();
        k27 threadMessage = getThreadMessage();
        w.r1 = k27Var;
        w.s1 = threadMessage;
        w.t1 = t0;
        m2(z);
    }

    public final void O() {
        if (this.V0 != null) {
            Point point = gl.q;
            int i = point.x > point.y ? this.o3 : this.n3;
            int L = ((((this.e2 - gl.m) - gl.n) - gl.L(6.0f)) - org.telegram.ui.ActionBar.a.getCurrentActionBarHeight()) - getHeight();
            byte b = 2;
            if (this.H2 == 2) {
                L = Math.min(L, gl.L(175.0f) + i);
            }
            int i2 = this.V0.getLayoutParams().height;
            if (i2 != L) {
                AnimatorSet animatorSet = this.r4;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.r4 = null;
                }
                this.t4 = L;
                byte b2 = 0;
                ax1 ax1Var = this.j4;
                if (i2 > L) {
                    av1 av1Var = new av1(this, (byte) 17);
                    this.V0.setLayerType(2, null);
                    if (this.w) {
                        this.x = av1Var;
                    } else {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        byc bycVar = this.d7;
                        int i3 = this.t4 - i;
                        if (bycVar != null) {
                            animatorSet2.playTogether(ValueAnimator.ofInt(-i3), ValueAnimator.ofInt(-(this.t4 - i)));
                        } else {
                            animatorSet2.playTogether(ObjectAnimator.ofInt(this, ax1Var, -i3), ObjectAnimator.ofInt(this.V0, ax1Var, -(this.t4 - i)));
                            ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new pv1(this, b));
                        }
                        animatorSet2.setDuration(300L);
                        animatorSet2.setInterpolator(s33.f);
                        animatorSet2.addListener(new u5(this, av1Var, (byte) 13));
                        this.r4 = animatorSet2;
                        animatorSet2.start();
                    }
                } else {
                    if (this.d7 == null) {
                        this.V0.getLayoutParams().height = this.t4;
                    }
                    this.c2.requestLayout();
                    ex1 ex1Var = this.F0;
                    if (ex1Var != null) {
                        int selectionStart = ex1Var.getSelectionStart();
                        int selectionEnd = this.F0.getSelectionEnd();
                        ex1 ex1Var2 = this.F0;
                        ex1Var2.setText(ex1Var2.getText());
                        this.F0.setSelection(selectionStart, selectionEnd);
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    byc bycVar2 = this.d7;
                    int i4 = this.t4 - i;
                    if (bycVar2 != null) {
                        animatorSet3.playTogether(ValueAnimator.ofInt(-i4), ValueAnimator.ofInt(-(this.t4 - i)));
                    } else {
                        animatorSet3.playTogether(ObjectAnimator.ofInt(this, ax1Var, -i4), ObjectAnimator.ofInt(this.V0, ax1Var, -(this.t4 - i)));
                        ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new pv1(this, (byte) 3));
                    }
                    animatorSet3.setDuration(300L);
                    animatorSet3.setInterpolator(s33.f);
                    animatorSet3.addListener(new aw1(this, b2));
                    this.r4 = animatorSet3;
                    this.V0.setLayerType(2, null);
                    animatorSet3.start();
                }
                byc bycVar3 = this.d7;
                if (bycVar3 != null) {
                    ((fyc) bycVar3).h(L);
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
    public final boolean O0() {
        ex1 ex1Var = this.F0;
        if (ex1Var != null) {
            if (TextUtils.isEmpty(ex1Var.getCaption())) {
                ex1 ex1Var2 = this.F0;
                int L = gl.L(44.0f);
                Layout layout = ex1Var2.getLayout();
                if (layout != null) {
                    if (layout.getLineCount() > 0) {
                        if (layout.getLineCount() <= 1) {
                        }
                    }
                }
            }
        }
        return k96.a0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O1(int i, boolean z) {
        boolean z2 = i != 0;
        if (z2 != (this.H2 != 0)) {
            ValueAnimator valueAnimator = this.w0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.w0.cancel();
            }
            if (z) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x0, z2 ? 1.0f : 0.0f);
                this.w0 = ofFloat;
                byte b = 4;
                ofFloat.addUpdateListener(new pv1(this, b));
                this.w0.addListener(new rw1(this, z2, b));
                this.w0.setDuration(220L);
                this.w0.setInterpolator(s33.f);
                this.w0.start();
            } else {
                this.x0 = z2 ? 1.0f : 0.0f;
                wx1 wx1Var = this.V0;
                if (wx1Var != null) {
                    wx1Var.Z();
                }
            }
        }
        this.H2 = i;
    }

    public final void P() {
        this.k7 = C(true);
        p0();
        float C = C(false);
        if (this.j7 != C) {
            this.j7 = C;
            a1(C);
        }
    }

    public final boolean P0() {
        return this.P2 != null;
    }

    public final void P1(boolean z, boolean z2, boolean z3, boolean z4) {
        final byte b = 1;
        gb gbVar = this.V;
        if ((gbVar != null && gbVar.f) || this.b4 || this.V0 == null) {
            return;
        }
        if (z3 || this.p4 != z) {
            this.p4 = z;
            hy1 hy1Var = this.P3;
            if (hy1Var != null) {
                hy1Var.L0();
            }
            Point point = gl.q;
            final int i = point.x > point.y ? this.o3 : this.n3;
            AnimatorSet animatorSet = this.r4;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.r4 = null;
            }
            boolean z5 = this.p4;
            byte b2 = 3;
            on onVar = this.A4;
            ax1 ax1Var = this.j4;
            final byte b3 = 0;
            cja cjaVar = this.c2;
            if (z5) {
                if (z4) {
                    kk7.e().k(kk7.i1, 1);
                }
                int height = cjaVar.getHeight();
                this.e2 = height;
                int L = ((((height - gl.m) - gl.n) - gl.L(6.0f)) - org.telegram.ui.ActionBar.a.getCurrentActionBarHeight()) - getHeight();
                this.t4 = L;
                if (this.H2 == 2) {
                    this.t4 = Math.min(L, gl.L(175.0f) + i);
                }
                if (this.d7 == null) {
                    this.V0.getLayoutParams().height = this.t4;
                }
                cjaVar.requestLayout();
                if (this.X5) {
                    cjaVar.setForeground(new qa1(this));
                }
                ex1 ex1Var = this.F0;
                if (ex1Var != null) {
                    int selectionStart = ex1Var.getSelectionStart();
                    int selectionEnd = this.F0.getSelectionEnd();
                    ex1 ex1Var2 = this.F0;
                    ex1Var2.setText(ex1Var2.getText());
                    this.F0.setSelection(selectionStart, selectionEnd);
                }
                if (z2) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    byc bycVar = this.d7;
                    int i2 = this.t4 - i;
                    if (bycVar != null) {
                        animatorSet2.playTogether(ValueAnimator.ofInt(-i2), ValueAnimator.ofInt(-(this.t4 - i)), ObjectAnimator.ofFloat(this.v4, "animationProgress", 1.0f));
                    } else {
                        animatorSet2.playTogether(ObjectAnimator.ofInt(this, ax1Var, -i2), ObjectAnimator.ofInt(this.V0, ax1Var, -(this.t4 - i)), ObjectAnimator.ofFloat(this.v4, "animationProgress", 1.0f));
                    }
                    animatorSet2.setDuration(300L);
                    animatorSet2.setInterpolator(s33.f);
                    if (this.d7 == null) {
                        ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: nv1
                            public final /* synthetic */ ChatActivityEnterView b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                byte b4 = b3;
                                int i3 = i;
                                ChatActivityEnterView chatActivityEnterView = this.b;
                                switch (b4) {
                                    case 0:
                                        int i4 = ChatActivityEnterView.r7;
                                        chatActivityEnterView.s4 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.t4 - i3)));
                                        chatActivityEnterView.c2.invalidate();
                                        break;
                                    default:
                                        int i5 = ChatActivityEnterView.r7;
                                        chatActivityEnterView.s4 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.t4 - i3));
                                        chatActivityEnterView.c2.invalidate();
                                        break;
                                }
                            }
                        });
                    }
                    animatorSet2.addListener(new aw1(this, b));
                    this.r4 = animatorSet2;
                    this.V0.setLayerType(2, null);
                    onVar.d();
                    this.s4 = 0.0f;
                    cjaVar.invalidate();
                    animatorSet2.start();
                } else {
                    this.s4 = 1.0f;
                    if (this.d7 == null) {
                        setTranslationY(-(this.t4 - i));
                        this.V0.setTranslationY(-(this.t4 - i));
                    }
                    AnimatedArrowDrawable animatedArrowDrawable = this.v4;
                    if (animatedArrowDrawable != null) {
                        animatedArrowDrawable.setAnimationProgress(1.0f);
                    }
                }
                byc bycVar2 = this.d7;
                if (bycVar2 != null) {
                    ((fyc) bycVar2).h(this.t4);
                }
            } else {
                if (z4) {
                    kk7.e().k(kk7.j1, 1);
                }
                if (z2) {
                    this.q4 = true;
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    if (this.d7 != null) {
                        animatorSet3.playTogether(ValueAnimator.ofInt(0), ValueAnimator.ofInt(0), ObjectAnimator.ofFloat(this.v4, "animationProgress", 0.0f));
                    } else {
                        animatorSet3.playTogether(ObjectAnimator.ofInt(this, ax1Var, 0), ObjectAnimator.ofInt(this.V0, ax1Var, 0), ObjectAnimator.ofFloat(this.v4, "animationProgress", 0.0f));
                    }
                    animatorSet3.setDuration(300L);
                    animatorSet3.setInterpolator(s33.f);
                    if (this.d7 == null) {
                        ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: nv1
                            public final /* synthetic */ ChatActivityEnterView b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                byte b4 = b;
                                int i3 = i;
                                ChatActivityEnterView chatActivityEnterView = this.b;
                                switch (b4) {
                                    case 0:
                                        int i4 = ChatActivityEnterView.r7;
                                        chatActivityEnterView.s4 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.t4 - i3)));
                                        chatActivityEnterView.c2.invalidate();
                                        break;
                                    default:
                                        int i5 = ChatActivityEnterView.r7;
                                        chatActivityEnterView.s4 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.t4 - i3));
                                        chatActivityEnterView.c2.invalidate();
                                        break;
                                }
                            }
                        });
                    }
                    animatorSet3.addListener(new cn(this, i, b2));
                    this.s4 = 1.0f;
                    cjaVar.invalidate();
                    this.r4 = animatorSet3;
                    this.V0.setLayerType(2, null);
                    onVar.d();
                    animatorSet3.start();
                } else {
                    this.s4 = 0.0f;
                    if (this.d7 == null) {
                        setTranslationY(0.0f);
                        this.V0.setTranslationY(0.0f);
                        this.V0.getLayoutParams().height = i;
                    }
                    cjaVar.requestLayout();
                    cjaVar.setForeground(null);
                    cjaVar.setWillNotDraw(false);
                    AnimatedArrowDrawable animatedArrowDrawable2 = this.v4;
                    if (animatedArrowDrawable2 != null) {
                        animatedArrowDrawable2.setAnimationProgress(0.0f);
                    }
                }
                byc bycVar3 = this.d7;
                if (bycVar3 != null) {
                    ((fyc) bycVar3).h(i);
                }
            }
            gw1 gw1Var = this.T0;
            if (gw1Var != null) {
                if (this.p4) {
                    gw1Var.setContentDescription(k96.M0(2131754893, "AccDescrCollapsePanel"));
                } else {
                    gw1Var.setContentDescription(k96.M0(2131754883, "AccDescrExpandPanel"));
                }
            }
        }
    }

    public final void Q() {
        float f = this.g7.e;
        if (this.w2 != null) {
            float measuredHeight = getMeasuredHeight() - this.f7.f;
            this.w2.setTranslationY(measuredHeight - (r4.getMeasuredHeight() * f));
            this.w2.setVisibility(f > 0.0f ? 0 : 8);
        }
        boolean z = f > 0.0f;
        if (this.I6 != z) {
            cw1 cw1Var = this.p2;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) cw1Var.getLayoutParams();
            int i = z ? this.w2.getLayoutParams().height : 0;
            layoutParams.topMargin = i;
            layoutParams.topMargin = gl.L(9.0f) + i;
            cw1Var.setLayoutParams(layoutParams);
            this.I6 = z;
            setMinimumHeight(gl.L(44.0f) + (z ? this.w2.getLayoutParams().height : 0));
            if (this.p4) {
                if (this.H2 == 0) {
                    P1(false, true, false, true);
                } else {
                    O();
                }
            }
        }
    }

    public final boolean Q0() {
        return this.X0 || this.Y0;
    }

    public final void Q1(boolean z, boolean z2) {
        float f;
        float f2;
        if (this.k5 == z && z2) {
            return;
        }
        ImageView imageView = this.m2;
        if (imageView == null) {
            if (!z && !this.o7) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = new ImageView(getContext());
                this.m2 = imageView2;
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                ImageView imageView3 = this.m2;
                int i = bkb.Ml;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                wjb wjbVar = this.L4;
                zkb.s(imageView3, i, wjbVar, mode);
                this.m2.setImageResource(R.drawable.input_suggest_paid_24);
                ImageView imageView4 = this.m2;
                int i2 = bkb.h6;
                zkb.R(imageView4, bkb.f0(F0(i2), 1, -1), null, zkb.M(i2), wjbVar);
                if (this.o7) {
                    this.m2.setTranslationX(gl.L(42.0f));
                    this.p2.addView(this.m2, nme.d(44, 44.0f, 85, 0.0f, 0.0f, 50.0f, 0.0f));
                } else {
                    this.f2.addView(this.m2, 0, nme.o(44, 44));
                }
                this.m2.setOnClickListener(new fv1(this, r3));
                this.m2.setContentDescription(k96.M0(2131754921, null));
            }
        }
        boolean z3 = this.k5 != z;
        this.k5 = z;
        if (z) {
            f2 = 1.0f;
            f = 1.0f;
        } else {
            f = 0.6f;
            f2 = 0.0f;
        }
        this.m2.setEnabled(z);
        this.m2.setClickable(z);
        ValueAnimator valueAnimator = this.l5;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.l5 = null;
        }
        if (z2) {
            if (this.o7) {
                this.m2.setVisibility(0);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.m2.getAlpha(), f2);
            this.l5 = ofFloat;
            ofFloat.addUpdateListener(new pv1(this, (byte) 11));
            this.l5.addListener(new rw1(this, z, r3));
            this.l5.setDuration(220L);
            this.l5.setInterpolator(s33.h);
            this.l5.start();
        } else {
            this.m2.setScaleX(f);
            this.m2.setScaleY(f);
            this.m2.setAlpha(f2);
            if (this.o7) {
                this.m2.setVisibility(z ? (byte) 0 : (byte) 8);
            }
        }
        n2(this.L6);
        if (z3) {
            N(true);
        }
    }

    public final void R() {
        mu1 mu1Var = this.F3;
        if (mu1Var != null) {
            hq6.d0(this.R).T1(mu1Var.a(), mu1Var.H5(mu1Var.F5), "", null, null, null, null, 0L, false, true, null);
        }
        setRichDraftPreview(null);
    }

    public final boolean R0(View view) {
        return view == this.x2 || view == this.V0;
    }

    public final void R1(boolean z, boolean z2) {
        ojc ojcVar;
        boolean z3 = false;
        if (!this.K1 || (ojcVar = this.T1) == null) {
            this.U1 = false;
            return;
        }
        if (this.U1 == z && z2) {
            return;
        }
        this.U1 = z;
        i29 i29Var = this.i1;
        if (i29Var != null) {
            ojcVar.c(Math.round(Math.max(1.0f, (i29Var.w - i29Var.s) * i29Var.r)));
        }
        if (z) {
            gl.r(this.X1);
        } else if (this.T1.c.hasFocus()) {
            gl.t1(this.T1.c);
            this.T1.c.clearFocus();
        }
        this.T1.setCollapsing(!z);
        this.T1.animate().cancel();
        this.T1.setAlpha(1.0f);
        this.T1.setVisibility(0);
        ValueAnimator valueAnimator = this.W1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.W1 = null;
        }
        float f = z ? 1.0f : 0.0f;
        if (z2) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V1, f);
            this.W1 = ofFloat;
            ofFloat.addUpdateListener(new pv1(this, (byte) 7));
            this.W1.setDuration(360L);
            this.W1.setInterpolator(s33.h);
            this.W1.start();
        } else {
            v(f);
        }
        ow1 ow1Var = this.K0;
        if (ow1Var != null) {
            if (this.K1 && this.U1) {
                z3 = true;
            }
            ow1Var.setIconDimmed(z3);
        }
        l lVar = this.E2;
        if (lVar != null) {
            lVar.invalidate();
        }
    }

    public final void S() {
        gl.t1(this.F0);
    }

    public final boolean S0() {
        return this.v3 && ChatActivityEnterView.this.h5;
    }

    public final void S1(boolean z) {
        mu1 mu1Var;
        jm3 jm3Var;
        byte b = 0;
        boolean z2 = (z || this.t2) && (mu1Var = this.F3) != null && !mu1Var.y() && ((jm3Var = this.j1) == null || !jm3Var.o());
        if (this.j6 != z2) {
            if (z2) {
                na7.q1(this.R).O1().b();
            }
            this.j6 = z2;
            ImageView imageView = this.j2;
            imageView.setVisibility(0);
            imageView.animate().alpha(z2 ? 1.0f : 0.0f).scaleX(z2 ? 1.0f : 0.6f).scaleY(z2 ? 1.0f : 0.6f).setInterpolator(s33.h).setDuration(420L).withEndAction(new ov1(this, z2, b)).start();
            if (!z2) {
                je5 je5Var = this.N;
                if (je5Var != null) {
                    je5Var.f(true);
                    this.N = null;
                    return;
                }
                return;
            }
            gc gcVar = this.i2;
            Objects.requireNonNull(gcVar);
            imageView.postDelayed(new fc(gcVar, (byte) 1), 220L);
            je5 je5Var2 = this.N;
            if (je5Var2 != null) {
                je5Var2.f(true);
                this.N = null;
            }
            if (na7.c1().getInt("aihintshown", 0) < 3) {
                je5 je5Var3 = new je5(getContext(), 3);
                this.N = je5Var3;
                je5Var3.p(true);
                this.N.t(k96.M0(2131754992, null));
                setHintGlass(this.N);
                this.N.o(0.0f, (imageView.getWidth() / 2.0f) + gl.L(4.0f));
                addView(this.N, nme.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
                je5 je5Var4 = this.N;
                je5Var4.r0 = new aj1(this, je5Var3, (byte) 26);
                je5Var4.d = 4000L;
                je5Var4.v();
                na7.c1().edit().putInt("aihintshown", na7.c1().getInt("aihintshown", 0) + 1).apply();
            }
        }
    }

    public final void T() {
        if (this.n2 != null) {
            return;
        }
        gw1 gw1Var = new gw1(this, getContext(), (byte) 2);
        this.n2 = gw1Var;
        l79 l79Var = new l79(getContext());
        this.K2 = l79Var;
        gw1Var.setImageDrawable(l79Var);
        l79 l79Var2 = this.K2;
        int i = bkb.Ml;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        wjb wjbVar = this.L4;
        zkb.x(this, l79Var2, i, wjbVar, mode);
        this.K2.a(R.drawable.input_bot2, false);
        this.n2.setScaleType(ImageView.ScaleType.CENTER);
        gw1 gw1Var2 = this.n2;
        int i2 = bkb.h6;
        zkb.R(gw1Var2, bkb.f0(F0(i2), 1, -1), null, zkb.M(i2), wjbVar);
        this.n2.setVisibility(8);
        gl.T3(this.n2, false, 0.1f, true, false);
        this.f2.addView(this.n2, 0, nme.o(44, 44));
        this.n2.setOnClickListener(new fv1(this, (byte) 19));
    }

    public final boolean T0() {
        if (this.v3) {
            return true;
        }
        AnimatorSet animatorSet = this.j3;
        return (animatorSet == null || !animatorSet.isRunning() || this.a3) ? false : true;
    }

    public final void T1() {
        mu1 mu1Var = this.F3;
        if (mu1Var == null || !hc2.V(mu1Var.e)) {
            return;
        }
        u21.b0(mu1Var).f(na7.q1(this.R).k4.h1.f(), new av1(this, (byte) 8)).j();
    }

    public final void U() {
        if (this.m0 == null) {
            ep0 ep0Var = new ep0(getContext());
            this.m0 = ep0Var;
            ep0Var.setOnClickListener(new fv1(this, (byte) 11));
            this.o2.addView(this.m0, nme.d(-2, 32.0f, 83, 8.0f, 6.0f, 8.0f, 6.0f));
            gl.T3(this.m0, false, 1.0f, true, false);
            ep0 ep0Var2 = this.m0;
            if (!ep0Var2.f) {
                ep0Var2.f = true;
                ep0Var2.h = 1.0f;
                ep0Var2.requestLayout();
                ep0Var2.invalidate();
            }
        }
    }

    public boolean U1(Runnable runnable) {
        return false;
    }

    public final void V() {
        if (this.c0 != null) {
            return;
        }
        NumberTextView numberTextView = new NumberTextView(getContext());
        this.c0 = numberTextView;
        numberTextView.setVisibility(8);
        this.c0.setTextSize(15);
        this.c0.setTextColor(F0(bkb.x6));
        this.c0.setTypeface(gl.o());
        this.c0.setCenterAlign(true);
        addView(this.c0, Math.min(2, getChildCount()), nme.d(44, 20.0f, 85, 3.0f, 0.0f, 0.0f, 44.0f));
    }

    public final boolean V0() {
        return c() || this.i7.f;
    }

    public final void V1() {
        W1(1, 0, true, true);
    }

    public final void W(boolean z) {
        if (this.v2 != null) {
            return;
        }
        ow1 ow1Var = new ow1(this, getContext(), this.L4);
        this.v2 = ow1Var;
        ow1Var.setContentDescription(k96.M0(2131751262, null));
        if (z) {
            ote.a(this.v2);
        }
        this.p2.addView(this.v2, nme.e(44, 44, 85));
    }

    public final boolean W0() {
        View view = this.w2;
        return view != null && view.getVisibility() == 0;
    }

    public final void W1(int i, int i2, boolean z, boolean z2) {
        byte b;
        boolean z3;
        boolean z4;
        int i3;
        ViewGroup viewGroup;
        int i4;
        float f;
        if (i != 2) {
            on onVar = this.A4;
            qw1 qw1Var = this.N4;
            Property property = View.TRANSLATION_Y;
            boolean z5 = false;
            boolean z6 = false;
            if (i == 1) {
                if (i2 == 0) {
                    if (this.E3 == null && this.V0 == null) {
                        return;
                    } else {
                        X();
                    }
                }
                if (i2 == 0) {
                    x();
                    if (this.X0) {
                        this.V0.getVisibility();
                    }
                    this.V0.setVisibility(0);
                    this.X0 = true;
                    tx1 tx1Var = this.x2;
                    if (tx1Var == null || tx1Var.getVisibility() == 8) {
                        i3 = 0;
                    } else {
                        this.x2.setVisibility(8);
                        this.Y0 = false;
                        i3 = this.x2.getMeasuredHeight();
                    }
                    this.V0.setShowing(true);
                    wx1 wx1Var = this.V0;
                    this.e4 = 0;
                    viewGroup = wx1Var;
                } else if (i2 == 1) {
                    if (this.Y0) {
                        this.x2.getVisibility();
                    }
                    this.Y0 = true;
                    wx1 wx1Var2 = this.V0;
                    if (wx1Var2 == null || wx1Var2.getVisibility() == 8) {
                        i4 = 0;
                    } else {
                        this.d2.removeView(this.V0);
                        this.V0.setVisibility(8);
                        this.V0.setShowing(false);
                        this.X0 = false;
                        i4 = this.V0.getMeasuredHeight();
                    }
                    this.x2.setVisibility(0);
                    tx1 tx1Var2 = this.x2;
                    this.e4 = 1;
                    na7.q1(this.R).X3.edit().remove("closed_botkeyboard_" + getTopicKeyString()).apply();
                    i3 = i4;
                    viewGroup = tx1Var2;
                } else {
                    i3 = 0;
                    viewGroup = null;
                }
                this.V2 = i2;
                if (this.n3 <= 0) {
                    f = 200.0f;
                    this.n3 = na7.b1().getInt("kbd_height", gl.L(200.0f));
                } else {
                    f = 200.0f;
                }
                int i5 = this.o3;
                if (i5 <= 0) {
                    i5 = na7.b1().getInt("kbd_height_land3", gl.L(f));
                    this.o3 = i5;
                }
                Point point = gl.q;
                if (point.x <= point.y) {
                    i5 = this.n3;
                }
                mu1 mu1Var = this.F3;
                if (mu1Var != null && mu1Var.getParentLayout() != null) {
                    i5 -= ((ActionBarLayout) mu1Var.getParentLayout()).u(false);
                }
                if (i2 == 1) {
                    i5 = Math.min(this.x2.getKeyboardHeight(), i5);
                }
                tx1 tx1Var3 = this.x2;
                if (tx1Var3 != null) {
                    tx1Var3.setPanelHeight(i5);
                }
                if (viewGroup != null && this.d7 == null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
                    layoutParams.height = i5;
                    viewGroup.setLayoutParams(layoutParams);
                }
                if (!gl.E) {
                    gl.t1(this.F0);
                }
                cja cjaVar = this.c2;
                if (cjaVar != null) {
                    this.q3 = i5;
                    cjaVar.requestLayout();
                    E1(true, true);
                    h2(true);
                    g1();
                    if (this.Y2 && !this.p3 && i5 != i3 && z) {
                        av1 av1Var = new av1(this, (byte) 22);
                        if (this.w) {
                            this.x = av1Var;
                        } else {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.W0 = animatorSet;
                            float f2 = i5 - i3;
                            if (this.d7 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(f2, 0.0f));
                            } else {
                                viewGroup.setTranslationY(f2);
                                this.W0.playTogether(ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) property, f2, 0.0f));
                            }
                            this.W0.setInterpolator(gb.w);
                            this.W0.setDuration(250L);
                            this.W0.addListener(new u5(this, av1Var, (byte) 11));
                            gl.d3(qw1Var, 50L);
                            onVar.d();
                        }
                        requestLayout();
                    }
                }
                byc bycVar = this.d7;
                if (bycVar != null) {
                    ((fyc) bycVar).h(i5);
                }
            } else {
                if (this.R0 != null) {
                    E1(false, true);
                }
                this.V2 = -1;
                wx1 wx1Var3 = this.V0;
                if (wx1Var3 != null) {
                    if (i == 2 && !gl.D && !gl.E) {
                        this.w4 = false;
                        hy1 hy1Var = this.P3;
                        if (hy1Var != null) {
                            hy1Var.k(0.0f);
                        }
                        this.d2.removeView(this.V0);
                        this.V0 = null;
                    } else if (!this.Y2 || this.p3 || this.p4) {
                        hy1 hy1Var2 = this.P3;
                        if (hy1Var2 != null) {
                            hy1Var2.k(0.0f);
                        }
                        z5 = false;
                        this.q3 = 0;
                        this.d2.removeView(this.V0);
                        this.V0.setVisibility(8);
                        this.V0.setShowing(false);
                    } else {
                        this.X0 = true;
                        this.e4 = 0;
                        wx1Var3.setShowing(false);
                        sv1 sv1Var = new sv1(this, i, z6 ? 1 : 0);
                        if (this.w) {
                            z3 = false;
                            this.x = sv1Var;
                        } else {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.W0 = animatorSet2;
                            byc bycVar2 = this.d7;
                            wx1 wx1Var4 = this.V0;
                            if (bycVar2 != null) {
                                z3 = false;
                                animatorSet2.playTogether(ValueAnimator.ofFloat(wx1Var4.getMeasuredHeight()), ValueAnimator.ofFloat(0.0f, 1.0f));
                            } else {
                                z3 = false;
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(wx1Var4, (Property<wx1, Float>) property, wx1Var4.getMeasuredHeight()));
                            }
                            this.W0.setInterpolator(gb.w);
                            this.W0.setDuration(250L);
                            onVar.d();
                            this.W0.addListener(new u5(this, sv1Var, (byte) 12));
                        }
                        gl.d3(qw1Var, 50L);
                        requestLayout();
                        z5 = z3;
                    }
                    this.X0 = z5;
                }
                tx1 tx1Var4 = this.x2;
                if (tx1Var4 != null && tx1Var4.getVisibility() == 0) {
                    if (i != 2 || gl.D || gl.E) {
                        if (this.Y2 && !this.p3) {
                            if (this.Y0) {
                                this.e4 = 1;
                            }
                            AnimatorSet animatorSet3 = new AnimatorSet();
                            this.W0 = animatorSet3;
                            byc bycVar3 = this.d7;
                            tx1 tx1Var5 = this.x2;
                            if (bycVar3 != null) {
                                b = 0;
                                animatorSet3.playTogether(ValueAnimator.ofFloat(tx1Var5.getMeasuredHeight()));
                            } else {
                                b = 0;
                                animatorSet3.playTogether(ObjectAnimator.ofFloat(tx1Var5, (Property<tx1, Float>) property, tx1Var5.getMeasuredHeight()));
                            }
                            this.W0.setInterpolator(gb.w);
                            this.W0.setDuration(250L);
                            this.W0.addListener(new by1(this, i, b));
                            onVar.d();
                            gl.d3(qw1Var, 50L);
                            requestLayout();
                        } else if (!this.a4) {
                            this.x2.setVisibility(8);
                        }
                    }
                    this.Y0 = false;
                }
                if (i2 == 1 && this.c3 != null) {
                    na7.q1(this.R).X3.edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.c3.e1()).apply();
                }
                h2(true);
                byc bycVar4 = this.d7;
                if (bycVar4 != null) {
                    ((fyc) bycVar4).i(z2);
                }
            }
            if (this.n4 || this.o4) {
                N(true);
            }
            if (!this.p4 || i == 1) {
                z4 = false;
            } else {
                z4 = false;
                P1(false, false, false, true);
            }
            m2(z4);
            H();
        }
    }

    public final void X() {
        wx1 wx1Var = this.V0;
        if (wx1Var != null && wx1Var.d1 != y6c.t0) {
            this.d2.removeView(wx1Var);
            wx1Var = null;
            this.V0 = null;
        }
        if (wx1Var != null) {
            return;
        }
        wx1 wx1Var2 = new wx1(this, this.F3, this.y3, getContext(), this.T2, this.c2, this.X5, this.L4, this.U0, this.d7 != null);
        this.V0 = wx1Var2;
        wx1Var2.w0 = true;
        if (!this.X5) {
            wx1Var2.updateColors();
        }
        this.V0.I(true, this.z3, this.A3, true);
        this.V0.setVisibility(8);
        this.V0.setShowing(false);
        if (this.d7 != null) {
            wx1 wx1Var3 = this.V0;
            wx1Var3.x0 = false;
            wx1Var3.setShouldDrawBackground(false);
            this.V0.W0 = true;
        }
        this.V0.setDelegate(new ay1(this));
        this.V0.setDragListener(new c9c(this));
        wx1 wx1Var4 = this.V0;
        if (wx1Var4 != null) {
            wx1Var4.K(-this.G3, !this.A0, !this.b);
        }
        x();
        I();
    }

    public final void X0(TLRPC.Document document, String str, g27 g27Var, boolean z, int i, int i2, Object obj, Long l, boolean z2) {
        if (this.H0 > 0 && !c()) {
            hy1 hy1Var = this.P3;
            if (hy1Var != null) {
                ly1 ly1Var = this.G0;
                hy1Var.O0(ly1Var, ((jia) ly1Var.c).getText(), true);
                return;
            }
            return;
        }
        if (this.H2 != 0) {
            O1(0, true);
            this.V0.s(true);
            this.V0.z();
        }
        P1(false, true, false, true);
        hy1 hy1Var2 = this.P3;
        TL_stories.StoryItem t0 = hy1Var2 != null ? hy1Var2.t0() : null;
        z3a B = z3a.B(this.R);
        long j = this.G3;
        k27 k27Var = this.J3;
        k27 threadMessage = getThreadMessage();
        bu1 bu1Var = this.L3;
        boolean z3 = obj instanceof TLRPC.TL_messages_stickerSet;
        mu1 mu1Var = this.F3;
        B.t0(document, str, j, k27Var, threadMessage, t0, bu1Var, g27Var, z, i, i2, z3, obj, mu1Var != null ? mu1Var.Q6() : null, l.longValue(), getSendMonoForumPeerId(), getSendMessageSuggestionParams());
        hy1 hy1Var3 = this.P3;
        if (hy1Var3 != null) {
            hy1Var3.u(null, true, i, 0, 0L);
        }
        if (z2) {
            setFieldText("");
        }
        hq6.d0(this.R).d(0, obj, document, (int) (System.currentTimeMillis() / 1000), false);
    }

    public final void X1() {
        hy1 hy1Var = this.P3;
        if ((hy1Var == null || !hy1Var.g()) && cf3.y(this.G3)) {
            TLRPC.Chat K0 = na7.q1(this.S.a).K0(Long.valueOf(-this.G3));
            u21 b0 = u21.b0(this.F3);
            StringBuilder sb = new StringBuilder();
            if (hc2.p(K0)) {
                sb.append(k96.M0(2131745415, null));
            }
            if (hc2.u(K0)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(k96.M0(2131745412, null));
            }
            if (hc2.t(K0)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(k96.M0(2131745413, null));
            }
            if (hc2.o(K0)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(k96.M0(2131745416, null));
            }
            if (hc2.l(K0)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(k96.M0(2131745417, null));
            }
            if (hc2.v(K0)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(k96.M0(2131745411, null));
            }
            if (hc2.s(K0)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(k96.M0(2131745414, null));
            }
            if (hc2.m(K0)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(k96.M0(2131745418, null));
            }
            b0.G(R.raw.passcode_lock_close, 3, k96.a0("SendPlainTextRestrictionHint", null, 2131745400, sb.toString())).j();
        }
    }

    public final void Y() {
        if (this.T0 != null) {
            return;
        }
        gw1 gw1Var = new gw1(this, getContext(), (byte) 3);
        this.T0 = gw1Var;
        gw1Var.setScaleType(ImageView.ScaleType.CENTER);
        gw1 gw1Var2 = this.T0;
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(F0(bkb.Ml), false);
        this.v4 = animatedArrowDrawable;
        gw1Var2.setImageDrawable(animatedArrowDrawable);
        this.T0.setVisibility(8);
        this.T0.setScaleX(0.1f);
        this.T0.setScaleY(0.1f);
        this.T0.setAlpha(0.0f);
        gw1 gw1Var3 = this.T0;
        int i = bkb.h6;
        zkb.R(gw1Var3, bkb.f0(F0(i), 1, -1), null, zkb.M(i), this.L4);
        this.q2.addView(this.T0, nme.e(44, 44, 85));
        this.T0.setOnClickListener(new fv1(this, (byte) 8));
        this.T0.setContentDescription(k96.M0(2131754883, "AccDescrExpandPanel"));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y0(TL_keyboard.KeyboardButton keyboardButton) {
        boolean z;
        k27 k27Var;
        k27 k27Var2;
        boolean s0;
        k27 k27Var3;
        hy1 hy1Var;
        mu1 mu1Var;
        boolean z2 = this.J3 != null && (mu1Var = this.F3) != null && mu1Var.x4 && mu1Var.d() == ((long) this.J3.e1());
        if (this.J3 == null || z2) {
            int i = this.R;
            long j = this.G3;
            if (j > 0) {
                z = l7c.w(na7.q1(i).V1(Long.valueOf(j)));
            } else {
                na7.q1(i).K0(Long.valueOf(-j));
                z = false;
            }
            if (!z) {
                k27Var = cf3.y(this.G3) ? this.c3 : null;
                k27Var2 = this.J3;
                if (k27Var2 != null || z2) {
                    k27Var2 = this.c3;
                }
                s0 = s0(keyboardButton, k27Var, k27Var2, null);
                if (this.J3 != null || z2) {
                    k27Var3 = this.c3;
                    if (k27Var3 != null && k27Var3.k.reply_markup.single_use) {
                        if (s0) {
                            W1(0, 0, true, true);
                        } else {
                            i1();
                        }
                        na7.q1(this.R).X3.edit().putInt("answered_" + getTopicKeyString(), this.c3.e1()).commit();
                    }
                } else {
                    i1();
                    A1(this.M3, true, false);
                }
                hy1Var = this.P3;
                if (hy1Var == null) {
                    hy1Var.u(null, true, 0, 0, 0L);
                    return;
                }
                return;
            }
        }
        k27Var = this.J3;
        k27Var2 = this.J3;
        if (k27Var2 != null) {
        }
        k27Var2 = this.c3;
        s0 = s0(keyboardButton, k27Var, k27Var2, null);
        if (this.J3 != null) {
        }
        k27Var3 = this.c3;
        if (k27Var3 != null) {
            if (s0) {
            }
            na7.q1(this.R).X3.edit().putInt("answered_" + getTopicKeyString(), this.c3.e1()).commit();
        }
        hy1Var = this.P3;
        if (hy1Var == null) {
        }
    }

    public final void Y1(boolean z) {
        boolean z2;
        mu1 mu1Var;
        jm3 jm3Var = this.j1;
        byte b = 1;
        boolean z3 = jm3Var != null && jm3Var.o();
        if (z3 || (!(this.t2 || z) || (mu1Var = this.F3) == null || mu1Var.y() || this.P2 != null)) {
            z2 = false;
        } else {
            na7.q1(this.R);
            boolean z4 = w01.a;
            z2 = true;
        }
        if (this.k6 == z2) {
            return;
        }
        this.k6 = z2;
        ImageView imageView = this.k2;
        imageView.setVisibility(0);
        imageView.animate().alpha(z2 ? 1.0f : 0.0f).scaleX(z2 ? 1.0f : z3 ? 0.85f : 0.6f).scaleY(z2 ? 1.0f : z3 ? 0.85f : 0.6f).setInterpolator(s33.h).setDuration((z3 || this.l6) ? 150L : 420L).withEndAction(new ov1(this, z2, b)).start();
    }

    public final void Z() {
        if (this.F0 != null) {
            return;
        }
        Context context = getContext();
        wjb wjbVar = this.L4;
        ex1 ex1Var = new ex1(this, context, wjbVar);
        this.F0 = ex1Var;
        int i = Build.VERSION.SDK_INT;
        byte b = 0;
        if (i >= 28) {
            ex1Var.setFallbackLineSpacing(false);
        }
        if (i >= 35) {
            this.F0.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        this.F0.setDelegate(new qv1(this));
        mu1 mu1Var = this.F3;
        if (mu1Var == null || mu1Var.getParentLayout() == null || !((ActionBarLayout) mu1Var.getParentLayout()).b) {
            this.F0.setWindowView(this.E3.getWindow().getDecorView());
        } else {
            this.F0.setWindowView(mu1Var.getParentLayout().getWindow().getDecorView());
        }
        TLRPC.EncryptedChat encryptedChat = mu1Var != null ? mu1Var.h : null;
        this.F0.setAllowTextEntitiesIntersection(d2());
        String string = Settings.Secure.getString(getContext().getContentResolver(), "default_input_method");
        int i2 = ((string == null || !string.startsWith("com.samsung")) && encryptedChat != null) ? 285212672 : TLObject.FLAG_28;
        this.F0.setIncludeFontPadding(false);
        this.F0.setImeOptions(i2);
        ex1 ex1Var2 = this.F0;
        int inputType = ex1Var2.getInputType() | 147456;
        this.a = inputType;
        ex1Var2.setInputType(inputType);
        m2(false);
        this.F0.setSingleLine(false);
        this.F0.setMaxLines(6);
        this.F0.setTextSize(1, 18.0f);
        this.F0.setGravity(80);
        this.F0.setPadding(0, gl.L(9.0f), 0, gl.L(10.0f));
        this.F0.setBackgroundDrawable(null);
        zkb.X(this.F0, bkb.Ke, wjbVar);
        zkb.G(this.F0, bkb.Xc, wjbVar);
        zkb.C(this.F0, bkb.kg, wjbVar);
        ex1 ex1Var3 = this.F0;
        int i3 = bkb.Le;
        zkb.A(ex1Var3, i3, wjbVar);
        zkb.D(this.F0, i3, wjbVar);
        zkb.v(this.F0, bkb.Me, wjbVar);
        zkb.y(this.F0, bkb.lg, wjbVar);
        ex1 ex1Var4 = this.F0;
        boolean z = this.M4;
        FrameLayout.LayoutParams d = nme.d(-1, -2.0f, 80, 52.0f, 0.0f, z ? 50.0f : 2.0f, 1.5f);
        cw1 cw1Var = this.o2;
        cw1Var.addView(ex1Var4, 1, d);
        ig9 ig9Var = new ig9(this.R, wjbVar, getContext());
        this.s2 = ig9Var;
        ig9Var.setAllowActions(false);
        this.s2.setMaxHeight(gl.L(150.0f));
        this.s2.setMinHeight(gl.L(88.0f));
        this.s2.setVisibility(8);
        this.s2.setPadding(gl.L(8.0f), gl.L(9.0f), gl.L(8.0f), gl.L(10.0f));
        this.s2.setOnClickListener(new fv1(this, (byte) 14));
        cw1Var.addView(this.s2, 2, nme.d(-1, -2.0f, 80, 44.0f, 0.0f, (z ? 50 : 2) - 8, 1.5f));
        this.F0.setOnKeyListener(new fx1(this));
        this.F0.setOnEditorActionListener(new gx1(this, b));
        this.F0.addTextChangedListener(new hx1(this));
        this.F0.addTextChangedListener(new fi());
        this.F0.setEnabled(this.h6);
        ArrayList arrayList = this.g6;
        if (arrayList != null) {
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                this.F0.addTextChangedListener((TextWatcher) obj);
            }
            this.g6.clear();
        }
        m2(false);
        v2(mu1Var != null && mu1Var.getFragmentBeginToShow());
        if (mu1Var != null) {
            mu1Var.C4(false, false);
        }
        n2(this.L6);
    }

    public final float Z0(FrameLayout frameLayout) {
        float measuredHeight = getMeasuredHeight() - this.f7.f;
        float f = 0.0f;
        View view = frameLayout;
        while (view != null) {
            if (view == this) {
                return measuredHeight - f;
            }
            f += view.getTranslationY() + view.getTop();
            view = view.getParent() instanceof View ? (View) view.getParent() : null;
        }
        return frameLayout.getHeight() - gl.L(44.0f);
    }

    public final boolean Z1() {
        ImageView imageView;
        if (this.O != null || (imageView = this.m2) == null || imageView.getVisibility() != 0 || na7.c1().getInt("channelsuggesthint2", 0) >= 2) {
            return false;
        }
        je5 je5Var = new je5(getContext(), 3);
        this.O = je5Var;
        je5Var.q(13.0f);
        setHintGlass(this.O);
        this.O.p(true);
        this.O.t(k96.a0(null, null, 2131744181, mm4.i(this.R, this.G3)));
        this.O.setPadding(gl.L(12.0f), 0, gl.L(12.0f), 0);
        this.O.o(1.0f, -((getWidth() - gl.L(12.0f)) - ((this.m2.getMeasuredWidth() / 2.0f) + (this.m2.getX() + (this.f2.getX() + this.o2.getX())))));
        addView(this.O, nme.d(-1, 200.0f, 48, 0.0f, -192.0f, 0.0f, 0.0f));
        je5 je5Var2 = this.O;
        je5Var2.r0 = new av1(this, (byte) 24);
        je5Var2.d = 8000L;
        je5Var2.v();
        na7.c1().edit().putInt("channelsuggesthint2", na7.c1().getInt("channelsuggesthint2", 0) + 1).apply();
        return true;
    }

    @Override // bbb
    public final boolean a() {
        jm3 jm3Var = this.j1;
        return jm3Var != null && jm3Var.q();
    }

    public final void a0() {
        if (this.f1 != null) {
            return;
        }
        cw1 cw1Var = new cw1(this, getContext(), (byte) 3);
        this.f1 = cw1Var;
        cw1Var.setVisibility(this.R3 == null ? 8 : 0);
        this.f1.setFocusable(true);
        this.f1.setFocusableInTouchMode(true);
        this.f1.setClickable(true);
        this.o2.addView(this.f1, nme.e(-1, 44, 80));
        ry8 ry8Var = new ry8(getContext());
        this.h1 = ry8Var;
        ry8Var.setScaleType(ImageView.ScaleType.CENTER);
        this.h1.f(R.raw.chat_audio_record_delete_2, 28, 28, null);
        this.h1.getAnimatedDrawable().p0 = true;
        this.A5 = this.h1.getAnimatedDrawable();
        s2();
        this.h1.setContentDescription(k96.M0(2131751586, "Delete"));
        ry8 ry8Var2 = this.h1;
        int i = bkb.h6;
        ff0 f0 = bkb.f0(F0(i), 1, -1);
        vkb M = zkb.M(i);
        wjb wjbVar = this.L4;
        zkb.R(ry8Var2, f0, null, M, wjbVar);
        this.f1.addView(this.h1, nme.c(44.0f, 44));
        this.h1.setOnClickListener(new fv1(this, (byte) 10));
        scc sccVar = new scc(getContext());
        this.g1 = sccVar;
        sccVar.setVisibility(4);
        scc sccVar2 = this.g1;
        sccVar2.T = !this.X5;
        sccVar2.setRoundFrames(true);
        this.g1.setDelegate(new sw1(this));
        this.f1.addView(this.g1, nme.d(-1, -1.0f, 19, 56.0f, 0.0f, 8.0f, 0.0f));
        Context context = getContext();
        qcc qccVar = new qcc(context);
        TextPaint textPaint = new TextPaint(1);
        qccVar.d = textPaint;
        qccVar.e = -1L;
        textPaint.setTextSize(gl.L(14.0f));
        qccVar.b = context.getDrawable(R.drawable.tooltip_arrow);
        qccVar.a = bkb.b0(gl.L(5.0f), bkb.w0(null, bkb.gg, false));
        qccVar.b();
        qccVar.setTime(0);
        this.g1.setTimeHintView(qccVar);
        this.c2.addView(qccVar, nme.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 52.0f));
        i29 i29Var = new i29(getContext(), wjbVar);
        this.i1 = i29Var;
        this.f1.addView(i29Var, nme.d(-1, 32.0f, 19, 44.0f, 0.0f, 4.0f, 0.0f));
        n2(this.L6);
    }

    public final void a2() {
        b2(true, false);
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.Ie));
        hashSet.add(Integer.valueOf(bkb.Uf));
        hashSet.add(Integer.valueOf(bkb.o7));
        hashSet.add(Integer.valueOf(bkb.x6));
        hashSet.add(Integer.valueOf(bkb.Sf));
        hashSet.add(Integer.valueOf(bkb.Rf));
        hashSet.add(Integer.valueOf(bkb.Oe));
    }

    @Override // r0b
    public final boolean b() {
        mu1 mu1Var = this.F3;
        return mu1Var != null && mu1Var.H4();
    }

    public final ValueAnimator b0() {
        int[] iArr;
        float f;
        int i;
        int i2;
        float f2;
        int i3;
        int i4;
        float f3;
        float f4;
        int i5;
        float f5;
        int i6;
        int i7;
        float f6;
        float f7;
        float f8;
        int i8;
        int i9;
        if (this.b2 == null || this.D2 == null || this.D1 || !e66.e(360928) || !this.D2.isShown()) {
            return null;
        }
        RecordCircle recordCircle = this.D2;
        if (recordCircle.O || recordCircle.getWidth() <= 0) {
            return null;
        }
        if (this.b2.getVisibility() != 0) {
            this.b2.setVisibility(0);
        }
        this.b2.animate().cancel();
        this.b2.setScaleX(1.0f);
        this.b2.setScaleY(1.0f);
        this.b2.getLocationInWindow(new int[2]);
        this.D2.getLocationInWindow(new int[2]);
        float width = (this.b2.getWidth() / 2.0f) + (r5[0] - r6[0]);
        float measuredHeight = ((this.b2.getMeasuredHeight() / 2.0f) - gl.L(3.0f)) + (r5[1] - r6[1]);
        RecordCircle recordCircle2 = this.D2;
        float f9 = recordCircle2.K;
        float f10 = recordCircle2.L;
        float max = (Math.max(recordCircle2.M, gl.L(10.0f)) * 1.5f) + gl.L(6.0f);
        int ceil = (int) Math.ceil(max * 2.0f);
        try {
            Bitmap createBitmap = Bitmap.createBitmap(ceil, ceil, Bitmap.Config.ARGB_8888);
            float f11 = f9 - max;
            float f12 = f10 - max;
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(-f11, -f12);
            this.D2.draw(canvas);
            int[] iArr2 = new int[ceil * ceil];
            createBitmap.getPixels(iArr2, 0, ceil, 0, 0, ceil, ceil);
            int i10 = ceil;
            int max2 = Math.max(1, Math.round(gl.p * 0.75f));
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12 += max2) {
                for (int i13 = 0; i13 < i10; i13 += max2) {
                    if ((iArr2[(i12 * i10) + i13] >>> 24) > 24) {
                        i11++;
                    }
                }
            }
            if (i11 == 0) {
                createBitmap.recycle();
                return null;
            }
            int F0 = F0(bkb.Tf) | (-16777216);
            float[] fArr = {-0.24f, -0.17f, -0.11f, -0.06f, -0.02f, 0.03f, 0.08f, 0.13f};
            int[] iArr3 = new int[8];
            int i14 = 0;
            for (int i15 = 8; i14 < i15; i15 = 8) {
                float f13 = fArr[i14];
                if (f13 < 0.0f) {
                    f13 = -f13;
                    i9 = -16777216;
                } else {
                    i9 = -1;
                }
                iArr3[i14] = bm2.f(f13, F0, i9);
                i14++;
            }
            int[] iArr4 = new int[i11];
            int i16 = 0;
            int i17 = 0;
            while (i16 < i10) {
                int i18 = 0;
                while (i18 < i10) {
                    int i19 = iArr2[(i16 * i10) + i18];
                    int[] iArr5 = iArr4;
                    int i20 = i16;
                    if ((i19 >>> 24) > 24) {
                        iArr5[i17] = E2(i19);
                        i17++;
                    }
                    i18 += max2;
                    iArr4 = iArr5;
                    i16 = i20;
                }
                i16 += max2;
            }
            int[] iArr6 = iArr4;
            Arrays.sort(iArr6);
            int[] iArr7 = new int[8];
            int i21 = 0;
            for (int i22 = 8; i21 < i22; i22 = i22) {
                int i23 = i21 + 1;
                iArr7[i21] = iArr6[Math.min(i11 - 1, (i23 * i11) / 8)];
                i21 = i23;
            }
            kra kraVar = this.E5;
            if (kraVar == null) {
                kraVar = new kra(2400);
                this.E5 = kraVar;
            }
            kraVar.a();
            this.E5.e(false);
            kra kraVar2 = this.E5;
            kraVar2.t = iArr3;
            kraVar2.s = true;
            kraVar2.u = bkb.I.o() ? 0.12f : 0.0f;
            kra kraVar3 = this.E5;
            kraVar3.S = 0.0f;
            kraVar3.R = 0.0f;
            float f14 = i11;
            float min = Math.min(1.0f, 1400.0f / f14);
            float f15 = gl.p;
            this.I5 = f11;
            this.J5 = i10 + f11;
            float[] fArr2 = new float[2400];
            int i24 = 0;
            int i25 = 0;
            int i26 = 0;
            while (true) {
                iArr = iArr7;
                if (i25 >= i10) {
                    break;
                }
                int i27 = 2400;
                float f16 = 0.3f;
                if (i24 >= 2400) {
                    break;
                }
                int i28 = i26;
                float f17 = min;
                int i29 = 0;
                while (i29 < i10 && i24 < i27) {
                    int i30 = iArr2[(i25 * i10) + i29];
                    int i31 = i24;
                    int i32 = i30 >>> 24;
                    if (i32 > 24) {
                        i28++;
                        int i33 = i28 * 7;
                        if (D2(i33 + 3) <= (((i32 * 0.7f) / 255.0f) + f16) * f17) {
                            float D2 = D2(i33 + 11);
                            float D22 = D2(i33 + 12);
                            float D23 = D2(i33 + 14);
                            float f18 = i29 + f11;
                            float f19 = D2 - 0.5f;
                            i7 = i29;
                            float f20 = max2;
                            float f21 = (f19 * f20) + f18;
                            f6 = f9;
                            float f22 = i25 + f12;
                            i6 = i25;
                            float f23 = D22 - 0.5f;
                            float f24 = (f23 * f20) + f22;
                            f7 = f10;
                            float f25 = this.I5;
                            f5 = f12;
                            f8 = f11;
                            float i34 = Utilities.i((f21 - f25) / (this.J5 - f25), 1.0f, 0.0f);
                            float f26 = (0.03f * D23) + (i34 * 0.2f) + 0.04f;
                            float w = b00.w(f23, 3.0f, f15, width);
                            float w2 = b00.w(f19, 2.0f, f15, measuredHeight);
                            float z = yjb.z(i34, 0.16f, 0.92f, (D2(i33 + 15) * 0.16f) + 0.5f);
                            float g = oo1.g(D2, 0.25f, f16, width - f21, f21);
                            float min2 = Math.min(f24, measuredHeight) - (((D23 * 22.0f) + 8.0f) * f15);
                            kra kraVar4 = this.E5;
                            int E2 = E2(i30);
                            int i35 = 0;
                            while (true) {
                                if (i35 >= 7) {
                                    i8 = 7;
                                    break;
                                }
                                if (E2 <= iArr[i35]) {
                                    i8 = i35;
                                    break;
                                }
                                i35++;
                            }
                            kraVar4.j(f21, f24, g, min2, w, w2, z, f26, i8);
                            i24 = i31 + 1;
                            fArr2[i31] = (z * 0.95f) + f26;
                            i29 = i7 + max2;
                            f10 = f7;
                            f9 = f6;
                            i25 = i6;
                            f12 = f5;
                            f11 = f8;
                            i27 = 2400;
                            f16 = 0.3f;
                        }
                    }
                    f5 = f12;
                    i6 = i25;
                    i7 = i29;
                    f6 = f9;
                    f7 = f10;
                    f8 = f11;
                    i24 = i31;
                    i29 = i7 + max2;
                    f10 = f7;
                    f9 = f6;
                    i25 = i6;
                    f12 = f5;
                    f11 = f8;
                    i27 = 2400;
                    f16 = 0.3f;
                }
                i25 += max2;
                min = f17;
                iArr7 = iArr;
                i26 = i28;
                i24 = i24;
                f10 = f10;
                f9 = f9;
                f12 = f12;
                f11 = f11;
            }
            float f27 = f12;
            float f28 = f9;
            float f29 = f10;
            float f30 = f11;
            float min3 = Math.min(1.0f, 650.0f / f14);
            int i36 = 0;
            int i37 = 0;
            while (i36 < i10) {
                if (i24 >= 2400) {
                    break;
                }
                int i38 = 0;
                for (int i39 = 2400; i38 < i10 && i24 < i39; i39 = 2400) {
                    int i40 = iArr2[(i36 * i10) + i38];
                    int i41 = i40 >>> 24;
                    if (i41 > 24) {
                        i37++;
                        int i42 = i37 * 13;
                        if (D2(i42 + 5) <= (((i41 * 0.7f) / 255.0f) + 0.3f) * min3) {
                            float D24 = D2(i42 + 6);
                            float D25 = D2(i42 + 7);
                            float D26 = D2(i42 + 8);
                            i = i10;
                            float f31 = D24 - 0.5f;
                            int i43 = i24;
                            float f32 = max2;
                            i2 = max2;
                            float f33 = (f31 * f32) + f30 + i38;
                            float f34 = D25 - 0.5f;
                            f2 = min3;
                            float f35 = (f32 * f34) + f27 + i36;
                            float f36 = f33 - f28;
                            float f37 = f35 - f29;
                            i3 = i36;
                            i4 = i38;
                            float sqrt = (float) Math.sqrt((f37 * f37) + (f36 * f36));
                            if (sqrt < gl.L(1.0f)) {
                                double d = D26 * 3.141592653589793d * 2.0d;
                                f4 = (float) Math.cos(d);
                                f3 = (float) Math.sin(d);
                            } else {
                                f3 = f37 / sqrt;
                                f4 = f36 / sqrt;
                            }
                            float D27 = ((D2(i42 + 9) * 13.0f) + 7.0f) * f15;
                            float f38 = D26 * 0.05f;
                            float w3 = b00.w(f34, 3.0f, f15, width);
                            float w4 = b00.w(f31, 2.0f, f15, measuredHeight);
                            float D28 = (D2(i42 + 10) * 0.2f) + 0.56f;
                            float g2 = oo1.g(D24, 0.25f, 0.3f, width - f33, f33);
                            float min4 = Math.min(f35, measuredHeight) - (((D25 * 22.0f) + 8.0f) * f15);
                            kra kraVar5 = this.E5;
                            int E22 = E2(i40);
                            int i44 = 0;
                            while (true) {
                                if (i44 >= 7) {
                                    i5 = 7;
                                    break;
                                }
                                if (E22 <= iArr[i44]) {
                                    i5 = i44;
                                    break;
                                }
                                i44++;
                            }
                            kraVar5.j(f33, f35, g2, min4, w3, w4, D28, f38, i5);
                            kra kraVar6 = this.E5;
                            int i45 = kraVar6.C;
                            int i46 = ((i45 + r3) - 1) % kraVar6.b;
                            kraVar6.w[i46] = f4 * D27;
                            kraVar6.x[i46] = f3 * D27;
                            i24 = i43 + 1;
                            fArr2[i43] = (D28 * 0.95f) + f38;
                            i38 = i4 + i2;
                            i10 = i;
                            max2 = i2;
                            min3 = f2;
                            i36 = i3;
                        }
                    }
                    i = i10;
                    i2 = max2;
                    f2 = min3;
                    i3 = i36;
                    i4 = i38;
                    i38 = i4 + i2;
                    i10 = i;
                    max2 = i2;
                    min3 = f2;
                    i36 = i3;
                }
                int i47 = max2;
                i36 += i47;
                i10 = i10;
                i24 = i24;
                max2 = i47;
                min3 = min3;
            }
            if (i24 == 0) {
                createBitmap.recycle();
                return null;
            }
            Arrays.sort(fArr2, 0, i24);
            int i48 = i24 - 1;
            float f39 = i24;
            this.L5 = fArr2[Math.min(i48, (int) (0.72f * f39))] * 1000.0f;
            float f40 = fArr2[Math.min(i48, (int) (f39 * 0.95f))] * 1000.0f;
            this.M5 = f40;
            float f41 = this.L5;
            this.N5 = (Math.max(60.0f, f40 - f41) * 0.7f) + f41;
            this.F5 = createBitmap;
            this.G5 = f30;
            this.H5 = f27;
            this.K5 = 0.0f;
            this.O5 = true;
            RecordCircle recordCircle3 = this.D2;
            recordCircle3.P = true;
            recordCircle3.invalidate();
            jy1 jy1Var = this.b2;
            jy1Var.getClass();
            long uptimeMillis = SystemClock.uptimeMillis();
            if (jy1Var.c || jy1Var.e) {
                f = 1.0f;
            } else if (jy1Var.f) {
                f = jy1Var.a;
            } else {
                long j = jy1Var.H;
                if (j < 0) {
                    j = uptimeMillis;
                }
                f = jy1.a(uptimeMillis - j);
            }
            jy1Var.s = gl.R1(0.85f, 1.0f, f) * gl.L(5.0f);
            jy1Var.n = true;
            if (jy1Var.G) {
                uptimeMillis -= 240;
            }
            jy1Var.r = uptimeMillis;
            jy1Var.y = 0.0f;
            jy1Var.x = 0.0f;
            jy1Var.w = 0.0f;
            jy1Var.c = false;
            jy1Var.d.stop();
            jy1Var.g().O(true, 0.0f);
            jy1Var.invalidate();
            this.n = 0.0f;
            this.h = 0.55f;
            l2();
            float f42 = this.M5 + 260.0f + 16.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, f42);
            ofFloat.setDuration((long) f42);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.addUpdateListener(new xv1(this, this.b2, gl.L(3.0f) + gl.L(12.0f), this.D2));
            ofFloat.addListener(new rw1(this));
            return ofFloat;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void b1() {
        l(false);
        gjc gjcVar = this.r1;
        byte b = 1;
        if (gjcVar != null) {
            gjcVar.j("destroy", true);
            jjc jjcVar = gjcVar.h;
            if (jjcVar != null) {
                gl.B2(jjcVar);
                gjcVar.h = null;
            }
            yic yicVar = gjcVar.K;
            if (yicVar != null) {
                gl.B2(yicVar);
                gjcVar.K = null;
            }
            this.r1 = null;
        }
        if (this.m1) {
            this.m1 = false;
            DictationAsr.T(this.q1);
        }
        jm3 jm3Var = this.j1;
        if (jm3Var != null) {
            DictationAsr.T(jm3Var.m0);
            jm3Var.m();
            qn3 qn3Var = jm3Var.F;
            if (qn3Var != null) {
                qn3Var.a();
            }
            j92 j92Var = jm3Var.a0;
            if (j92Var != null) {
                j92Var.f = null;
            }
            gl.B2(jm3Var.s);
            gl.B2(jm3Var.w);
            this.j1 = null;
        }
        i29 i29Var = this.i1;
        if (i29Var != null) {
            i29Var.T = true;
            lbc lbcVar = i29Var.n;
            if (lbcVar != null) {
                lbcVar.t0(false);
                i29Var.n.l0();
                i29Var.n = null;
            }
        }
        if (this.i1 != null && this.R3 != null) {
            hq6 d0 = hq6.d0(this.R);
            long j = this.G3;
            mu1 mu1Var = this.F3;
            long d = (mu1Var == null || !mu1Var.x4) ? 0L : mu1Var.d();
            i29 i29Var2 = this.i1;
            float audioLeft = i29Var2 == null ? 0.0f : i29Var2.getAudioLeft();
            i29 i29Var3 = this.i1;
            d0.d2(j, d, audioLeft, i29Var3 == null ? 1.0f : i29Var3.getAudioRight());
        }
        this.O2 = true;
        kk7.f(this.R).n(this, kk7.k2);
        kk7.f(this.R).n(this, kk7.n2);
        kk7.f(this.R).n(this, kk7.o2);
        kk7.f(this.R).n(this, kk7.l2);
        kk7.f(this.R).n(this, kk7.W5);
        kk7.f(this.R).n(this, kk7.m2);
        kk7.f(this.R).n(this, kk7.j2);
        kk7.f(this.R).n(this, kk7.s);
        kk7.f(this.R).n(this, kk7.r2);
        kk7.f(this.R).n(this, kk7.t2);
        kk7.f(this.R).n(this, kk7.d2);
        kk7.f(this.R).n(this, kk7.y0);
        kk7.f(this.R).n(this, kk7.K);
        kk7.f(this.R).n(this, kk7.m1);
        kk7.f(this.R).n(this, kk7.s2);
        kk7.f(this.R).n(this, kk7.S2);
        kk7.f(this.R).n(this, kk7.Z2);
        kk7.f(this.R).n(this, kk7.h5);
        kk7.f(this.R).n(this, kk7.R3);
        kk7.e().n(this, kk7.k4);
        wx1 wx1Var = this.V0;
        if (wx1Var != null) {
            wx1Var.A();
        }
        av1 av1Var = this.I0;
        if (av1Var != null) {
            gl.r(av1Var);
            this.I0 = null;
        }
        PowerManager.WakeLock wakeLock = this.g3;
        if (wakeLock != null) {
            try {
                wakeLock.release();
                this.g3 = null;
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
        if (this.m3 && !this.d1) {
            gl.c3(new m9(this.E3, b));
        }
        cja cjaVar = this.c2;
        if (cjaVar != null) {
            cjaVar.setDelegate(null);
        }
        uw1 uw1Var = this.r0;
        if (uw1Var != null) {
            uw1Var.e = false;
            uw1Var.dismiss();
        }
    }

    public final void b2(boolean z, boolean z2) {
        if (this.w2 == null || this.V3 || getVisibility() != 0) {
            cw1 cw1Var = this.f1;
            if ((cw1Var == null || cw1Var.getVisibility() != 0) && !this.x3 && this.L3 == null && this.J3 == null) {
                h1();
                return;
            }
            return;
        }
        cw1 cw1Var2 = this.f1;
        boolean z3 = (cw1Var2 == null || cw1Var2.getVisibility() != 0) && !this.x3 && this.L3 == null && (this.d3 == null || this.P2 != null);
        if (!z2 && z && z3 && !this.p3 && !Q0()) {
            h1();
            uv1 uv1Var = this.W;
            if (uv1Var != null) {
                gl.r(uv1Var);
            }
            uv1 uv1Var2 = new uv1(this, (byte) 9);
            this.W = uv1Var2;
            gl.d3(uv1Var2, 200L);
            return;
        }
        this.W3 = true;
        this.V3 = true;
        if (this.X3) {
            this.g7.a(true, z);
            if (z3) {
                ex1 ex1Var = this.F0;
                if (ex1Var != null) {
                    ex1Var.requestFocus();
                }
                h1();
            }
        }
    }

    @Override // r0b
    public final boolean c() {
        mu1 mu1Var = this.F3;
        return mu1Var != null && mu1Var.P7();
    }

    public final void c0() {
        l lVar = this.E2;
        cja cjaVar = this.c2;
        if (lVar == null) {
            l lVar2 = new l(this, getContext());
            this.E2 = lVar2;
            lVar2.setVisibility(8);
            cjaVar.addView(this.E2, nme.e(-1, -2, 80));
        }
        if (this.D2 != null) {
            return;
        }
        RecordCircle recordCircle = new RecordCircle(getContext());
        this.D2 = recordCircle;
        recordCircle.setVisibility(8);
        cjaVar.addView(this.D2, nme.e(-1, -2, 80));
    }

    public final void c2() {
        AnimatorSet animatorSet = new AnimatorSet();
        try {
            performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "lockAnimatedTranslation", this.Z4);
        ofFloat.setStartDelay(100L);
        ofFloat.setDuration(350L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "snapAnimationProgress", 1.0f);
        ofFloat2.setInterpolator(s33.h);
        ofFloat2.setDuration(250L);
        boolean z = gba.a;
        SharedPreferences.Editor edit = na7.c1().edit();
        edit.putInt("lockRecordAudioVideoHint", 3);
        edit.apply();
        animatorSet.playTogether(ofFloat2, ofFloat, ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f).setDuration(200L), ObjectAnimator.ofFloat(this.a2, "cancelToProgress", 1.0f));
        animatorSet.start();
        C2();
    }

    @Override // bbb
    public final void d(TextWatcher textWatcher) {
        ex1 ex1Var = this.F0;
        if (ex1Var != null) {
            ex1Var.addTextChangedListener(textWatcher);
            return;
        }
        ArrayList arrayList = this.g6;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.g6 = arrayList;
        }
        arrayList.add(textWatcher);
    }

    public final void d0() {
        if (this.e1 != null || getContext() == null) {
            return;
        }
        a6 a6Var = new a6(getContext(), (byte) 5);
        this.e1 = a6Var;
        a6Var.setClipChildren(false);
        this.e1.setVisibility(8);
        this.o2.addView(this.e1, nme.c(44.0f, -1));
        this.e1.setOnTouchListener(new p8((byte) 28));
        a6 a6Var2 = this.e1;
        SlideTextView slideTextView = new SlideTextView(getContext());
        this.a2 = slideTextView;
        a6Var2.addView(slideTextView, nme.d(-1, -1.0f, 0, 45.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(0);
        this.d.setPadding(gl.L(13.0f), 0, 0, 0);
        this.d.setFocusable(false);
        LinearLayout linearLayout2 = this.d;
        jy1 jy1Var = new jy1(this, getContext());
        this.b2 = jy1Var;
        linearLayout2.addView(jy1Var, nme.t(28, 28, 16, 0, 0, 0, 0));
        this.b2.d(g0());
        this.b2.setOnClickListener(new fv1(this, (byte) 9));
        LinearLayout linearLayout3 = this.d;
        my1 my1Var = new my1(this, getContext());
        this.Z0 = my1Var;
        linearLayout3.addView(my1Var, nme.t(-1, -1, 16, 6, 0, 0, 0));
        this.e1.addView(this.d, nme.e(-1, -1, 16));
    }

    public final void d1() {
        this.Z2 = true;
        gjc gjcVar = this.r1;
        if (gjcVar != null) {
            gjcVar.j("chat paused", true);
        }
        if (g0() && this.v3) {
            k0();
        }
        uw1 uw1Var = this.r0;
        if (uw1Var != null) {
            uw1Var.e = false;
            uw1Var.dismiss();
        }
        if (this.p3) {
            this.b3 = true;
        }
        av1 av1Var = new av1(this, (byte) 19);
        this.J6 = av1Var;
        gl.d3(av1Var, 500L);
    }

    public final boolean d2() {
        mu1 mu1Var = this.F3;
        TLRPC.EncryptedChat encryptedChat = mu1Var != null ? mu1Var.h : null;
        return encryptedChat == null || gl.W0(encryptedChat.layer) >= 101;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        ow1 ow1Var;
        TLRPC.ChatFull chatFull;
        TLRPC.Chat K0;
        double d;
        byte[] bArr;
        gw1 gw1Var;
        if (i == kk7.W5) {
            if (i2 != this.R || objArr.length <= 0) {
                return;
            }
            long longValue = ((Long) objArr[0]).longValue();
            mu1 mu1Var = this.F3;
            if (longValue == (mu1Var != null ? mu1Var.a() : this.G3)) {
                e2();
                return;
            }
            return;
        }
        if (i == kk7.k4) {
            wx1 wx1Var = this.V0;
            if (wx1Var != null) {
                wx1Var.Q.h1();
            }
            tx1 tx1Var = this.x2;
            if (tx1Var != null) {
                ArrayList arrayList = tx1Var.n;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    ((mq0) arrayList.get(i3)).invalidate();
                }
            }
            ex1 ex1Var = this.F0;
            if (ex1Var != null) {
                ex1Var.postInvalidate();
                this.F0.q();
                return;
            }
            return;
        }
        if (i == kk7.j2) {
            if (((Integer) objArr[0]).intValue() == this.w3) {
                if (this.m3 && !this.c4 && !c()) {
                    this.c4 = true;
                    na7.q1(this.S.a).H4(this.d1 ? 7 : 1, 0, this.G3, getThreadMessageId(), null);
                }
                RecordCircle recordCircle = this.D2;
                if (recordCircle != null) {
                    recordCircle.setAmplitude(((Double) objArr[1]).doubleValue());
                    return;
                }
                return;
            }
            return;
        }
        if (i == kk7.s) {
            ex1 ex1Var2 = this.F0;
            if (ex1Var2 == null || !ex1Var2.isFocused()) {
                return;
            }
            gl.t1(this.F0);
            return;
        }
        int i4 = kk7.l2;
        int i5 = kk7.m2;
        int i6 = 5;
        if (i == i4 || i == i5) {
            if (((Integer) objArr[0]).intValue() == this.w3 && this.v3) {
                this.v3 = false;
                if (i != i5) {
                    r2(2, true);
                    return;
                }
                Integer num = (Integer) objArr[1];
                if (num.intValue() == 4) {
                    i6 = 4;
                } else if (this.d1 && num.intValue() == 5) {
                    i6 = 1;
                } else if (num.intValue() != 0) {
                    i6 = num.intValue() == 6 ? 2 : 3;
                }
                if (i6 != 3) {
                    r2(i6, true);
                    return;
                }
                return;
            }
            return;
        }
        if (i == kk7.k2) {
            if (((Integer) objArr[0]).intValue() == this.w3) {
                boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                this.d1 = !booleanValue;
                mw1 mw1Var = this.c1;
                if (mw1Var != null) {
                    mw1Var.j(booleanValue ? oy1.a : oy1.b, true);
                }
                if (this.v3) {
                    RecordCircle recordCircle2 = this.D2;
                    if (recordCircle2 != null) {
                        recordCircle2.J = true;
                    }
                } else {
                    this.v3 = true;
                    r2(0, true);
                }
                my1 my1Var = this.Z0;
                if (my1Var != null) {
                    my1Var.a(this.Y1);
                }
                jy1 jy1Var = this.b2;
                if (jy1Var != null) {
                    jy1Var.e = false;
                    return;
                }
                return;
            }
            return;
        }
        if (i == kk7.n2) {
            this.v3 = false;
            this.R3 = null;
            this.U3 = null;
            return;
        }
        if (i == kk7.o2) {
            this.R3 = null;
            this.U3 = null;
            my1 my1Var2 = this.Z0;
            if (my1Var2 != null) {
                my1Var2.a(this.Y1);
            }
            N(true);
            this.v3 = true;
            r2(0, true);
            return;
        }
        if (i != kk7.r2) {
            if (i == kk7.t2) {
                Activity activity = this.E3;
                if (activity != null) {
                    activity.setVolumeControlStream(((Boolean) objArr[0]).booleanValue() ? (byte) 0 : ConnectionsManager.USE_IPV4_ONLY);
                    return;
                }
                return;
            }
            if (i == kk7.d2) {
                if (this.T3 == null || !MediaController.w().D(this.T3)) {
                    return;
                }
                k27 k27Var = MediaController.w().v0;
                k27 k27Var2 = this.T3;
                k27Var2.b0 = k27Var.b0;
                k27Var2.i0 = k27Var.i0;
                return;
            }
            if (i == kk7.y0) {
                ew1 ew1Var = this.R0;
                if (ew1Var != null) {
                    ew1Var.invalidate();
                    return;
                }
                return;
            }
            if (i == kk7.K) {
                if (((Boolean) objArr[6]).booleanValue()) {
                    return;
                }
                long longValue2 = ((Long) objArr[3]).longValue();
                Integer num2 = (Integer) objArr[1];
                if (longValue2 != this.G3 || (chatFull = this.T2) == null || chatFull.slowmode_seconds == 0 || k27.f3(num2.intValue()) || (K0 = na7.q1(this.S.a).K0(Long.valueOf(this.T2.id))) == null || hc2.N(K0) || hc2.h0(K0)) {
                    return;
                }
                TLRPC.ChatFull chatFull2 = this.T2;
                int currentTime = ConnectionsManager.getInstance(this.R).getCurrentTime();
                TLRPC.ChatFull chatFull3 = this.T2;
                chatFull2.slowmode_next_send_date = currentTime + chatFull3.slowmode_seconds;
                chatFull3.flags |= 262144;
                setSlowModeTimer(chatFull3.slowmode_next_send_date);
                return;
            }
            if (i == kk7.m1) {
                if (this.T2 != null) {
                    y2();
                    return;
                }
                return;
            }
            if (i == kk7.s2) {
                this.R3 = null;
                this.U3 = null;
                r2(4, true);
                return;
            }
            if (i != kk7.S2) {
                if (i == kk7.Z2) {
                    o2(true);
                    return;
                }
                if (i != kk7.h5) {
                    if (i == kk7.R3) {
                        l0();
                        return;
                    }
                    return;
                } else {
                    if (this.t2 && (ow1Var = this.K0) != null) {
                        ow1Var.setLocked(!y6c.h(this.R).p());
                    }
                    l0();
                    return;
                }
            }
            long longValue3 = ((Long) objArr[0]).longValue();
            TL_bots.BotMenuButton botMenuButton = (TL_bots.BotMenuButton) objArr[1];
            if (longValue3 == this.G3) {
                if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                    TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                    this.j0 = tL_botMenuButton.text;
                    this.k0 = tL_botMenuButton.url;
                    this.p7 = 3;
                } else if (this.f3) {
                    this.p7 = 2;
                } else {
                    this.p7 = 1;
                }
                h2(false);
                return;
            }
            return;
        }
        if (((Integer) objArr[0]).intValue() == this.w3) {
            this.Y1 = 0L;
            Object obj = objArr[1];
            if (obj instanceof oac) {
                oac oacVar = (oac) obj;
                this.U3 = oacVar;
                String str = (String) objArr[2];
                this.S3 = str;
                ArrayList<Bitmap> arrayList2 = (ArrayList) objArr[3];
                this.Y1 = oacVar.r;
                scc sccVar = this.g1;
                if (sccVar != null) {
                    sccVar.setVideoPath(str);
                    this.g1.setKeyframes(arrayList2);
                    this.g1.setVisibility(0);
                    this.g1.setMinProgressDiff(1000.0f / this.U3.r);
                    U0();
                }
                r2(3, true);
                N(false);
                return;
            }
            this.R3 = (TLRPC.TL_document) obj;
            this.S3 = (String) objArr[2];
            boolean z = objArr.length >= 4 && ((Boolean) objArr[3]).booleanValue();
            float floatValue = objArr.length >= 5 ? ((Float) objArr[4]).floatValue() : 0.0f;
            float floatValue2 = objArr.length >= 6 ? ((Float) objArr[5]).floatValue() : 1.0f;
            if (this.R3 == null) {
                hy1 hy1Var = this.P3;
                if (hy1Var != null) {
                    hy1Var.u(null, true, 0, 0, 0L);
                    return;
                }
                return;
            }
            a0();
            if (this.f1 != null) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = true;
                tL_message.id = 0;
                tL_message.peer_id = new TLRPC.TL_peerUser();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                TLRPC.Peer peer = tL_message.peer_id;
                long e = y6c.h(this.R).e();
                tL_peerUser.user_id = e;
                peer.user_id = e;
                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                tL_message.message = "";
                tL_message.attachPath = this.S3;
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message.media = tL_messageMediaDocument;
                tL_messageMediaDocument.flags |= 3;
                tL_messageMediaDocument.document = this.R3;
                tL_message.flags |= 768;
                this.T3 = new k27(y6c.t0, tL_message, false, true);
                this.f1.setAlpha(1.0f);
                this.f1.setVisibility(0);
                this.h1.setVisibility(0);
                this.h1.setAlpha(0.0f);
                this.h1.setScaleY(0.0f);
                this.h1.setScaleX(0.0f);
                int i7 = 0;
                while (true) {
                    if (i7 >= this.R3.attributes.size()) {
                        d = 0.0d;
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = this.R3.attributes.get(i7);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                        d = documentAttribute.duration;
                        break;
                    }
                    i7++;
                }
                int i8 = 0;
                while (true) {
                    if (i8 >= this.R3.attributes.size()) {
                        bArr = null;
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute2 = this.R3.attributes.get(i8);
                    if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                        bArr = documentAttribute2.waveform;
                        if (bArr == null || bArr.length == 0) {
                            bArr = MediaController.getWaveform(this.S3);
                            documentAttribute2.waveform = bArr;
                        }
                    } else {
                        i8++;
                    }
                }
                if (z && (gw1Var = this.h2) != null) {
                    this.l2 = 0.0f;
                    gw1Var.setAlpha(0.0f);
                    gw1Var.setScaleX(0.0f);
                    gw1Var.setScaleY(0.0f);
                }
                this.Y1 = (long) (1000.0d * d);
                i29 i29Var = this.i1;
                String str2 = this.S3;
                if (!i29Var.T) {
                    i29Var.r = (float) d;
                    i29Var.s = floatValue;
                    i29Var.w = floatValue2;
                    i29Var.x = false;
                    i29Var.h.t(gl.g0((int) Math.round(Math.max(1.0d, d)), false, false), false, true);
                    i29Var.f.a(false, false);
                    lbc lbcVar = i29Var.n;
                    if (lbcVar == null) {
                        lbcVar = new lbc();
                        i29Var.n = lbcVar;
                        lbcVar.K = new g29(i29Var, r4);
                    }
                    lbcVar.i0(Uri.fromFile(new File(str2)), "other");
                    i29Var.i(false);
                    i29Var.L = 0;
                    i29Var.M = bArr;
                    Bitmap bitmap = i29Var.T0;
                    if (bitmap != null) {
                        bitmap.recycle();
                        i29Var.T0 = null;
                    }
                    i29Var.W0 = null;
                    i29Var.X0 = false;
                    i29Var.Q0 = -1;
                    i29Var.J0.a();
                    i29Var.I0.a();
                    i29Var.invalidate();
                }
                N(false);
                if (z) {
                    c0();
                    d0();
                    a0();
                    this.m3 = true;
                    this.D2.f(false);
                    RecordCircle recordCircle3 = this.D2;
                    this.l4.getClass();
                    recordCircle3.setControlsScale(1.0f);
                    l lVar = this.E2;
                    if (lVar != null) {
                        lVar.setVisibility(0);
                        this.E2.setAlpha(1.0f);
                    }
                }
                r2(3, !z);
                if (!z || !na7.c1().getBoolean("design_voice_live_field", true) || this.O2 || this.R3 == null) {
                    return;
                }
                A0().t();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        i29 i29Var;
        wx1 wx1Var = this.V0;
        if (wx1Var != null && wx1Var.getVisibility() == 0 && this.V0.getStickersExpandOffset() != 0.0f) {
            canvas.save();
            canvas.clipRect(0, gl.L(2.0f), getMeasuredWidth(), getMeasuredHeight());
            canvas.translate(0.0f, -this.V0.getStickersExpandOffset());
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        super.dispatchDraw(canvas);
        if (!this.K1 || (i29Var = this.i1) == null || i29Var.getTrimProgress() <= 0.0f) {
            return;
        }
        int[] iArr = this.t5;
        getLocationInWindow(iArr);
        float f = iArr[0];
        float f2 = iArr[1];
        w0(this, canvas, f, f2, f2, 100000.0f);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        View view2 = this.w2;
        cw1 cw1Var = this.p2;
        boolean z = view == view2 || view == cw1Var;
        if (z) {
            float measuredHeight = getMeasuredHeight() - this.f7.f;
            canvas.save();
            if (view == cw1Var) {
                canvas.clipRect(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
            }
            if (view == this.w2) {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
            }
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        if (z) {
            canvas.restore();
        }
        return drawChild;
    }

    @Override // r0b
    public final void e(TLRPC.Document document, String str, Object obj, g27 g27Var, boolean z, boolean z2, int i, int i2) {
        if (this.o7) {
            return;
        }
        bu1 bu1Var = this.L3;
        mu1 mu1Var = this.F3;
        if (bu1Var != null && mu1Var != null && bu1Var.f) {
            mu1Var.ic();
            return;
        }
        if (!c() || i != 0) {
            ij.X(this.R, this.G3, 1, new zv1(this, document, str, g27Var, z2, i, i2, obj, z));
            return;
        }
        ij.J(this.E3, mu1Var.a(), new yv1(this, document, str, obj, g27Var, z), this.L4);
    }

    public final void e0() {
        if (this.z2 != null || this.F3 == null) {
            return;
        }
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.input_calendar1).mutate();
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.input_calendar2).mutate();
        int i = bkb.Ml;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        wjb wjbVar = this.L4;
        zkb.x(this, mutate, i, wjbVar, mode);
        zkb.x(this, mutate2, bkb.Zf, wjbVar, mode);
        fm2 fm2Var = new fm2(mutate, mutate2);
        pw1 pw1Var = new pw1(this, getContext());
        this.z2 = pw1Var;
        pw1Var.setImageDrawable(fm2Var);
        this.z2.setVisibility(8);
        this.z2.setContentDescription(k96.M0(2131745656, null));
        this.z2.setScaleType(ImageView.ScaleType.CENTER);
        pw1 pw1Var2 = this.z2;
        int i2 = bkb.h6;
        zkb.R(pw1Var2, bkb.f0(F0(i2), 1, -1), null, zkb.M(i2), wjbVar);
        this.o2.addView(this.z2, 2, nme.e(44, 44, 85));
        this.z2.setOnClickListener(new fv1(this, (byte) 6));
        this.z2.setTranslationX(0.0f);
    }

    public final void e1() {
        ex1 ex1Var;
        this.Z2 = false;
        if (na7.c1().getBoolean("design_voice_live_field", true)) {
            long[] jArr = {150, 500, 1200};
            for (int i = 0; i < 3; i++) {
                gl.d3(new av1(this, (byte) 25), jArr[i]);
            }
        }
        av1 av1Var = this.J6;
        if (av1Var != null) {
            gl.r(av1Var);
            this.J6 = null;
        }
        if (G0() && z()) {
            return;
        }
        getVisibility();
        if (!this.b3 || org.telegram.ui.ActionBar.d.hasSheets(this.F3)) {
            return;
        }
        this.b3 = false;
        hy1 hy1Var = this.P3;
        if (hy1Var != null) {
            hy1Var.K0();
        }
        if (this.H2 == 0 && (ex1Var = this.F0) != null) {
            ex1Var.requestFocus();
        }
        gl.E3(this.F0);
        if (gl.D || this.p3 || gl.E) {
            return;
        }
        this.a4 = true;
        qw1 qw1Var = this.h4;
        gl.r(qw1Var);
        gl.d3(qw1Var, 100L);
    }

    public final void e2() {
        ow1 ow1Var = this.K0;
        if (ow1Var != null) {
            int i = this.R;
            mu1 mu1Var = this.F3;
            boolean z = ec.b(i, mu1Var != null ? mu1Var.a() : this.G3) != null;
            cc ccVar = this.m6;
            if (ccVar == null) {
                if (!z) {
                    return;
                }
                ccVar = new cc(ow1Var);
                this.m6 = ccVar;
                ow1Var.h0 = ccVar;
                ow1Var.i0 = this;
            }
            if (ccVar.b != z) {
                ccVar.b = z;
                ccVar.a.invalidate();
            }
            if (z) {
                y0();
            }
        }
    }

    public final void f0() {
        if (this.q0 != null || getContext() == null) {
            return;
        }
        k4a k4aVar = new k4a(getContext());
        ImageReceiver imageReceiver = new ImageReceiver(k4aVar);
        k4aVar.a = imageReceiver;
        k4aVar.b = new pb0((wjb) null);
        k4aVar.d = new Paint(1);
        Paint paint = new Paint(1);
        k4aVar.e = paint;
        imageReceiver.q0(gl.L(28.0f));
        paint.setStrokeWidth(gl.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        k4aVar.updateColors();
        k4aVar.setContentDescription(k96.a0("AccDescrSendAsPeer", null, 2131754774, ""));
        this.q0 = k4aVar;
        k4aVar.setOnClickListener(new fv1(this, (byte) 2));
        this.q0.setVisibility(8);
        this.o2.addView(this.q0, nme.d(36, 36.0f, 83, 4.66f, 4.0f, 4.66f, 4.0f));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:162|(1:243)(1:166)|167|(8:169|(1:198)(1:173)|(1:197)(1:179)|180|(4:182|(1:184)(1:195)|185|(1:189))(1:196)|(1:191)|192|(1:194))|199|(3:201|(1:203)(1:205)|204)|206|(3:(1:209)|(2:213|(1:223))|224)|225|(4:227|(1:241)(1:231)|232|(5:234|235|236|237|238))|242|235|236|237|238) */
    /* JADX WARN: Can't wrap try/catch for region: R(30:15|(1:17)|18|(1:152)(1:24)|25|(3:27|(1:31)|32)(2:106|(3:108|(1:112)|113)(1:(9:115|(1:117)(1:142)|118|(3:122|(1:124)|125)|126|(3:128|(1:134)|135)|136|(1:140)|141)(1:(20:148|(1:150)|151|34|(1:38)|39|(1:105)|42|(1:102)(1:46)|(1:101)(1:50)|(1:100)|(3:(1:58)(1:64)|59|(1:63))|(1:99)(1:70)|(1:72)|73|(3:(1:76)|(2:80|(1:90))|91)|92|93|94|95))))|33|34|(2:36|38)|39|(0)|103|105|42|(1:44)|102|(1:48)|101|(2:52|54)|100|(0)|(1:66)|99|(0)|73|(0)|92|93|94|95) */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x033e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f1(View view) {
        mu1 mu1Var;
        int measuredHeight;
        TLRPC.User h;
        float f;
        ex1 ex1Var;
        o27 o27Var;
        m27 m27Var;
        ArrayList arrayList;
        ow1 ow1Var;
        q qVar;
        boolean z;
        o27 o27Var2;
        boolean z2;
        boolean z3;
        byte b;
        ex1 ex1Var2;
        byte b2 = 0;
        if (c() || (((mu1Var = this.F3) != null && mu1Var.g4 == 5) || this.i7.f)) {
            return false;
        }
        boolean z4 = this.Z5;
        byte b3 = 3;
        ow1 ow1Var2 = this.K0;
        byte b4 = 16;
        wjb wjbVar = this.L4;
        byte b5 = 1;
        if (z4 || !(((ex1Var = this.F0) != null && !TextUtils.isEmpty(ex1Var.getText())) || mu1Var == null || (o27Var = mu1Var.x5) == null || (m27Var = o27Var.b) == null || (arrayList = m27Var.e) == null || arrayList.isEmpty())) {
            boolean z5 = mu1Var != null && l7c.D(mu1Var.h());
            if (this.P0 == null) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(this.E3, wjbVar);
                this.P0 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
                this.P0.setOnTouchListener(new yw1(this));
                this.P0.setDispatchKeyEventListener(new qv1(this));
                this.P0.setShownFromBottom(false);
                boolean z6 = mu1Var != null && mu1Var.H4();
                boolean z7 = !z5 && (this.H0 <= 0 || c());
                if (z6) {
                    boolean z8 = !z7;
                    a8 a8Var = new a8(0, this.L4, getContext(), true, z8);
                    this.f6 = a8Var;
                    if (z5) {
                        f = 196.0f;
                        a8Var.j(k96.M0(2131745322, null), R.drawable.msg_calendar2, null);
                    } else {
                        f = 196.0f;
                        a8Var.j(k96.M0(2131745667, null), R.drawable.msg_calendar2, null);
                    }
                    this.f6.setMinimumWidth(gl.L(f));
                    this.f6.setOnClickListener(new fv1(this, b4));
                    this.P0.a(this.f6, nme.o(-1, 44));
                    boolean z9 = gba.a;
                    SharedPreferences.Editor edit = na7.c1().edit();
                    edit.putInt("scheduledHintShows", 3);
                    edit.apply();
                    if (!z5 && this.G3 > 0) {
                        a8 a8Var2 = new a8(0, this.L4, getContext(), true, z8);
                        this.c = a8Var2;
                        a8Var2.j(k96.M0(2131745394, null), R.drawable.msg_online, null);
                        this.c.setMinimumWidth(gl.L(f));
                        this.c.setOnClickListener(new fv1(this, (byte) 17));
                        this.P0.a(this.c, nme.o(-1, 44));
                    }
                } else {
                    f = 196.0f;
                }
                if (z7) {
                    a8 a8Var3 = new a8(0, this.L4, getContext(), !z6, true);
                    a8Var3.j(k96.M0(2131745391, null), R.drawable.input_notify_off, null);
                    a8Var3.setMinimumWidth(gl.L(f));
                    a8Var3.setOnClickListener(new fv1(this, (byte) 18));
                    this.P0.a(a8Var3, nme.o(-1, 44));
                }
                zw1 zw1Var = new zw1(this, this.P0);
                this.O0 = zw1Var;
                zw1Var.b = false;
                zw1Var.setAnimationStyle(R.style.PopupContextAnimation2);
                this.O0.setOutsideTouchable(true);
                this.O0.setClippingEnabled(true);
                this.O0.setInputMethodMode(2);
                this.O0.setSoftInputMode(0);
                this.O0.getContentView().setFocusableInTouchMode(true);
                boolean z10 = gba.a;
                SharedPreferences.Editor edit2 = na7.c1().edit();
                edit2.putInt("scheduledOrNoSoundHintShows", 3);
                edit2.apply();
                hy1 hy1Var = this.P3;
                if (hy1Var != null) {
                    hy1Var.o1();
                }
            }
            a8 a8Var4 = this.f6;
            if (a8Var4 != null) {
                a8Var4.setVisibility(this.P ? 8 : 0);
            }
            if (this.c != null) {
                h = mu1Var != null ? mu1Var.h() : null;
                if (h != null && !h.bot) {
                    TLRPC.UserStatus userStatus = h.status;
                    if (!(userStatus instanceof TLRPC.TL_userStatusEmpty) && !(userStatus instanceof TLRPC.TL_userStatusOnline) && !(userStatus instanceof TLRPC.TL_userStatusRecently) && !(userStatus instanceof TLRPC.TL_userStatusLastMonth) && !(userStatus instanceof TLRPC.TL_userStatusLastWeek)) {
                        this.c.setVisibility(0);
                    }
                }
                this.c.setVisibility(8);
            }
            this.P0.setupRadialSelectors(F0(bkb.H5));
            this.P0.measure(View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), TLObject.FLAG_31));
            this.O0.setFocusable(true);
            int[] iArr = this.D3;
            view.getLocationInWindow(iArr);
            if (this.p3) {
                int measuredHeight2 = getMeasuredHeight();
                View view2 = this.w2;
                if (measuredHeight2 > gl.L((view2 == null || view2.getVisibility() != 0) ? 58.0f : 102.0f)) {
                    measuredHeight = view.getMeasuredHeight() + iArr[1];
                    this.O0.showAtLocation(view, 51, gl.L(8.0f) + ((view.getMeasuredWidth() + iArr[0]) - this.P0.getMeasuredWidth()), measuredHeight);
                    this.O0.b();
                    ow1Var2.invalidate();
                    view.performHapticFeedback(3, 2);
                    return true;
                }
            }
            measuredHeight = (iArr[1] - this.P0.getMeasuredHeight()) - gl.L(2.0f);
            this.O0.showAtLocation(view, 51, gl.L(8.0f) + ((view.getMeasuredWidth() + iArr[0]) - this.P0.getMeasuredWidth()), measuredHeight);
            this.O0.b();
            ow1Var2.invalidate();
            view.performHapticFeedback(3, 2);
            return true;
        }
        j47 j47Var = this.M0;
        if (j47Var != null) {
            j47Var.f(false);
        }
        gl.r(this.e6);
        bx1 bx1Var = new bx1(this, getContext(), wjbVar, b2);
        this.M0 = bx1Var;
        bx1Var.setOnDismissListener(new dv1(this, b5));
        boolean z11 = (this.T3 == null && ((ex1Var2 = this.F0) == null || TextUtils.isEmpty(ex1Var2.getText()))) ? false : true;
        ArrayList arrayList2 = new ArrayList();
        if (this.u2 != null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.id = 0;
            tL_message.out = true;
            ow1Var = ow1Var2;
            tL_message.peer_id = na7.q1(this.R).w1(this.G3);
            tL_message.from_id = na7.q1(this.R).w1(y6c.h(this.R).e());
            tL_message.rich_message = this.u2;
            k27 k27Var = new k27(this.R, tL_message, false, true);
            k27 k27Var2 = this.J3;
            if (k27Var2 != null && !k27Var2.p) {
                k27Var.C = k27Var2;
            }
            k27Var.W2 = Boolean.TRUE;
            k27Var.n0(null);
            k27Var.w1 = true;
            k27Var.B0 = true;
            arrayList2.add(k27Var);
        } else {
            ow1Var = ow1Var2;
            if (this.R3 != null) {
                TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                tL_message2.id = 0;
                tL_message2.out = true;
                tL_message2.peer_id = na7.q1(this.R).w1(this.G3);
                tL_message2.from_id = na7.q1(this.R).w1(y6c.h(this.R).e());
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message2.media = tL_messageMediaDocument;
                tL_messageMediaDocument.voice = true;
                tL_messageMediaDocument.document = this.R3;
                tL_message2.send_state = 1;
                tL_message2.attachPath = this.S3;
                k27 k27Var3 = new k27(this.R, tL_message2, false, true);
                k27 k27Var4 = this.J3;
                if (k27Var4 != null && !k27Var4.p) {
                    k27Var3.C = k27Var4;
                }
                k27Var3.W2 = Boolean.TRUE;
                k27Var3.n0(null);
                k27Var3.w1 = true;
                k27Var3.B0 = true;
                arrayList2.add(k27Var3);
            } else if (z11) {
                TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
                tL_message3.id = 0;
                tL_message3.out = true;
                tL_message3.peer_id = na7.q1(this.R).w1(this.G3);
                tL_message3.from_id = na7.q1(this.R).w1(y6c.h(this.R).e());
                ex1 ex1Var3 = this.F0;
                CharSequence[] charSequenceArr = {new SpannableStringBuilder(ex1Var3 == null ? "" : ex1Var3.getTextToUse())};
                k27.d(charSequenceArr[0], true);
                tL_message3.entities.addAll(hq6.d0(this.R).Y(charSequenceArr, true, true));
                tL_message3.message = charSequenceArr[0].toString();
                k27 k27Var5 = this.J3;
                if (k27Var5 != null && !k27Var5.p) {
                    TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                    k27 k27Var6 = this.K3;
                    if (k27Var6 != null) {
                        tL_messageReplyHeader.flags |= 2;
                        tL_messageReplyHeader.reply_to_top_id = k27Var6.e1();
                    }
                    tL_messageReplyHeader.flags |= 16;
                    tL_messageReplyHeader.reply_to_msg_id = this.J3.e1();
                    tL_message3.reply_to = tL_messageReplyHeader;
                }
                if (this.N3 != null) {
                    TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                    tL_messageMediaWebPage.webpage = this.N3;
                    if (mu1Var != null && (o27Var2 = mu1Var.x5) != null && o27Var2.o) {
                        boolean z12 = o27Var2.q;
                        tL_messageMediaWebPage.force_small_media = z12;
                        tL_messageMediaWebPage.force_large_media = !z12;
                        tL_message3.invert_media = o27Var2.r;
                    }
                    tL_message3.media = tL_messageMediaWebPage;
                }
                k27 k27Var7 = new k27(this.R, tL_message3, false, false);
                k27 k27Var8 = this.J3;
                if (k27Var8 != null && !k27Var8.p) {
                    k27Var7.C = k27Var8;
                }
                k27Var7.B0 = true;
                k27Var7.W2 = Boolean.TRUE;
                k27Var7.D = 0;
                k27Var7.n0(null);
                k27Var7.w1 = true;
                arrayList2.add(k27Var7);
            } else if (mu1Var != null && (qVar = mu1Var.q3) != null && qVar.getTextureView() != null) {
                j47 j47Var2 = this.M0;
                TextureView textureView = mu1Var.q3.getTextureView();
                j47Var2.getClass();
                if (textureView != null) {
                    j47Var2.l0 = new RectF();
                    int[] iArr2 = new int[2];
                    textureView.getLocationOnScreen(iArr2);
                    j47Var2.l0.set(iArr2[0], iArr2[1], textureView.getWidth() + r15, textureView.getHeight() + iArr2[1]);
                }
                z = true;
                this.M0.r(arrayList2);
                if (z11 && this.R3 == null) {
                    j47 j47Var3 = this.M0;
                    ex1 ex1Var4 = this.F0;
                    f fVar = new f(this, (byte) 26);
                    vv1 vv1Var = new vv1(this, b2);
                    j47Var3.S = ex1Var4;
                    j47Var3.U = fVar;
                    j47Var3.V = vv1Var;
                }
                ow1 ow1Var3 = ow1Var;
                this.M0.s(ow1Var3, true, new v6(b5, this, z11));
                if ((!z11 || z) && this.G3 >= 0) {
                    this.M0.a(mu1Var);
                    this.M0.p(this.O6);
                }
                cs5 G = cs5.G(this, wjbVar, ow1Var3);
                z2 = mu1Var == null && l7c.D(mu1Var.h());
                z3 = mu1Var == null && mu1Var.H4();
                if (!z2 || (this.H0 > 0 && !c())) {
                    b5 = 0;
                }
                if (z3) {
                    G.b(R.drawable.msg_calendar2, k96.M0(z2 ? 2131745322 : 2131745667, null), new uv1(this, b3), false);
                    if (!z2 && this.G3 > 0) {
                        G.b(R.drawable.msg_online, k96.M0(2131745394, null), new uv1(this, (byte) 4), false);
                        this.c = G.z();
                    }
                }
                if (mu1Var == null && this.P3 != null && hc2.p0(mu1Var.e)) {
                    b = 2;
                    G.b(R.drawable.input_suggest_paid_24, k96.M0(2131746878, null), new uv1(this, b), false);
                } else {
                    b = 2;
                }
                if (b5 != 0) {
                    G.b(R.drawable.input_notify_off, k96.M0(2131745391, null), new ov1(this, z11, b), false);
                }
                G.Z();
                if (this.c != null) {
                    h = mu1Var != null ? mu1Var.h() : null;
                    if (h != null && !h.bot) {
                        TLRPC.UserStatus userStatus2 = h.status;
                        if (!(userStatus2 instanceof TLRPC.TL_userStatusEmpty) && !(userStatus2 instanceof TLRPC.TL_userStatusOnline) && !(userStatus2 instanceof TLRPC.TL_userStatusRecently) && !(userStatus2 instanceof TLRPC.TL_userStatusLastMonth) && !(userStatus2 instanceof TLRPC.TL_userStatusLastWeek)) {
                            this.c.setVisibility(0);
                        }
                    }
                    this.c.setVisibility(8);
                }
                this.M0.q(G);
                this.M0.show();
                view.performHapticFeedback(3, 2);
                return false;
            }
        }
        z = false;
        this.M0.r(arrayList2);
        if (z11) {
            j47 j47Var32 = this.M0;
            ex1 ex1Var42 = this.F0;
            f fVar2 = new f(this, (byte) 26);
            vv1 vv1Var2 = new vv1(this, b2);
            j47Var32.S = ex1Var42;
            j47Var32.U = fVar2;
            j47Var32.V = vv1Var2;
        }
        ow1 ow1Var32 = ow1Var;
        this.M0.s(ow1Var32, true, new v6(b5, this, z11));
        if (!z11) {
        }
        this.M0.a(mu1Var);
        this.M0.p(this.O6);
        cs5 G2 = cs5.G(this, wjbVar, ow1Var32);
        if (mu1Var == null) {
        }
        if (mu1Var == null) {
        }
        if (!z2) {
        }
        b5 = 0;
        if (z3) {
        }
        if (mu1Var == null) {
        }
        b = 2;
        if (b5 != 0) {
        }
        G2.Z();
        if (this.c != null) {
        }
        this.M0.q(G2);
        this.M0.show();
        view.performHapticFeedback(3, 2);
        return false;
    }

    public final void f2() {
        float f;
        gw1 gw1Var = this.h2;
        if (gw1Var == null) {
            return;
        }
        float f2 = this.E + this.y;
        ow1 ow1Var = this.K0;
        if (ow1Var != null) {
            f = ow1Var.getAlpha() * (-b00.c(56.0f, ow1Var.l(), 0));
        } else {
            f = 0.0f;
        }
        gw1Var.setTranslationX(f2 + f);
    }

    public final boolean g0() {
        if (this.l1) {
            return (this.U2 && this.d1) ? false : true;
        }
        return false;
    }

    public final void g1() {
        int height = this.c2.getHeight();
        if (!this.p3) {
            height -= this.q3;
        }
        hy1 hy1Var = this.P3;
        if (hy1Var != null) {
            hy1Var.f1(height);
        }
        if (this.w2 != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + gl.L(72.0f);
            boolean z = this.X3;
            fm0 fm0Var = this.g7;
            if (height < currentActionBarHeight) {
                if (z) {
                    this.X3 = false;
                    if (this.W3) {
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
            this.X3 = true;
            if (this.W3) {
                fm0Var.a(true, false);
            }
        }
    }

    public final void g2() {
        f2();
        pkb pkbVar = this.f2;
        if (pkbVar != null) {
            pkbVar.setTranslationX(this.E + this.y);
            pkbVar.setAlpha(this.F * this.G);
            pkbVar.setVisibility(pkbVar.getAlpha() > 0.0f ? 0 : 8);
            gw1 gw1Var = this.h2;
            if (gw1Var != null && this.Z5) {
                gw1Var.setAlpha(this.l2 * this.G);
            }
        }
        pw1 pw1Var = this.z2;
        if (pw1Var != null) {
            pw1Var.setTranslationX(pw1Var.a);
        }
    }

    public gb getAdjustPanLayoutHelper() {
        return this.V;
    }

    public int getAnimatedTop() {
        return this.J2;
    }

    public ImageView getAttachButton() {
        return this.h2;
    }

    public View getAudioVideoButtonContainer() {
        return this.a1;
    }

    public int getBackgroundTop() {
        int top = getTop();
        View view = this.w2;
        return (view == null || view.getVisibility() != 0) ? top : top + this.w2.getLayoutParams().height;
    }

    public qu1 getBotWebViewButton() {
        if (this.l0 == null) {
            Context context = getContext();
            qu1 qu1Var = new qu1(context);
            qu1Var.a = new Path();
            qu1Var.c = bkb.w0(null, bkb.Ei, false);
            qu1Var.d = true;
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setSingleLine();
            textView.setAlpha(0.0f);
            textView.setGravity(17);
            textView.setTypeface(gl.o());
            qu1Var.addView(textView, nme.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context, null);
            radialProgressView.setSize(gl.L(18.0f));
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.0f);
            radialProgressView.setScaleY(0.0f);
            qu1Var.addView(radialProgressView, nme.d(28, 28.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            View view = new View(context);
            qu1Var.h = view;
            int i = bkb.Gi;
            ff0 f0 = bkb.f0(bkb.w0(null, i, false), 2, -1);
            vkb M = zkb.M(i);
            view.setBackground(f0);
            zkb.j(view, f0, null, M, null);
            qu1Var.addView(view, nme.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            qu1Var.setWillNotDraw(false);
            this.l0 = qu1Var;
            qu1Var.setVisibility(8);
            U();
            this.l0.setBotMenuButton(this.m0);
            this.o2.addView(this.l0, nme.e(-1, -1, 80));
        }
        return this.l0;
    }

    public int getCursorPosition() {
        ex1 ex1Var = this.F0;
        if (ex1Var == null) {
            return 0;
        }
        return ex1Var.getSelectionStart();
    }

    public CharSequence getDraftMessage() {
        if (this.P2 != null) {
            if (TextUtils.isEmpty(this.L2)) {
                return null;
            }
            return this.L2;
        }
        if (this.F0 == null || !H0()) {
            return null;
        }
        return this.F0.getText();
    }

    @Override // bbb
    public float getEditFieldBottomOffset() {
        if (this.F0 == null) {
            return 0.0f;
        }
        return ((FrameLayout.LayoutParams) r1.getLayoutParams()).bottomMargin - gl.L(1.5f);
    }

    @Override // bbb
    public Editable getEditText() {
        ex1 ex1Var = this.F0;
        if (ex1Var == null) {
            return null;
        }
        return ex1Var.getText();
    }

    public k27 getEditingMessageObject() {
        return this.P2;
    }

    public long getEffectId() {
        return this.O6;
    }

    public View getEmojiButton() {
        return this.R0;
    }

    public int getEmojiPadding() {
        return this.q3;
    }

    public t14 getEmojiView() {
        return this.V0;
    }

    public float getExitTransition() {
        return this.b5;
    }

    @Override // bbb
    public CharSequence getFieldText() {
        if (this.F0 == null || !H0()) {
            return null;
        }
        return this.F0.getText();
    }

    public int getHeightWithTopView() {
        int measuredHeight = getMeasuredHeight();
        View view = this.w2;
        return (view == null || view.getVisibility() != 0) ? measuredHeight : (int) (measuredHeight - ((1.0f - getTopViewEnterProgress()) * this.w2.getLayoutParams().height));
    }

    public long getLineAnimationDelay() {
        return 0L;
    }

    public float getLockAnimatedTranslation() {
        return this.a5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x007a, code lost:
    
        if (r6.U3 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int getMessagesCount() {
        o27 o27Var;
        m27 m27Var;
        mu1 mu1Var = this.F3;
        int size = (mu1Var == null || (o27Var = mu1Var.x5) == null || (m27Var = o27Var.b) == null) ? 0 : m27Var.g.size();
        ex1 ex1Var = this.F0;
        if (ex1Var == null || TextUtils.isEmpty(ex1Var.getText())) {
            if (this.T3 == null) {
            }
            size++;
        } else {
            String obj = this.F0.getText().toString();
            co3 co3Var = z3a.J;
            String trim = obj.trim();
            if (trim.length() != 0) {
                while (obj.startsWith("\n")) {
                    obj = obj.substring(1);
                }
                while (obj.endsWith("\n")) {
                    obj = ir2.n(1, 0, obj);
                }
                trim = obj;
            }
            int r1 = na7.q1(this.S.a).r1();
            if (trim.length() != 0) {
                size += (int) Math.ceil(trim.length() / r1);
            }
            size++;
        }
        return Math.max(1, size);
    }

    public RecordCircle getRecordCircle() {
        return this.D2;
    }

    public long getRecordTimerStartTime() {
        my1 my1Var = this.Z0;
        if (my1Var == null || !my1Var.a) {
            return 0L;
        }
        return my1Var.d;
    }

    public k27 getReplyingMessageObject() {
        return this.J3;
    }

    public int getRestingFieldHeight() {
        ex1 ex1Var = this.F0;
        if (ex1Var == null) {
            return gl.L(44.0f);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ex1Var.getLayoutParams();
        return Math.max(gl.L(44.0f), this.F0.getLineHeight() + this.F0.getPaddingBottom() + this.F0.getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin);
    }

    public int getSelectionLength() {
        ex1 ex1Var = this.F0;
        if (ex1Var == null) {
            return 0;
        }
        try {
            return ex1Var.getSelectionEnd() - this.F0.getSelectionStart();
        } catch (Exception e) {
            fa4.g(e, true);
            return 0;
        }
    }

    public View getSendButton() {
        return getSendButtonInternal().getVisibility() == 0 ? getSendButtonInternal() : this.a1;
    }

    public View getSendButtonInternal() {
        return this.K0;
    }

    public u47 getSendMessageSuggestionParams() {
        mu1 mu1Var = this.F3;
        if (mu1Var != null) {
            return mu1Var.y5;
        }
        return null;
    }

    public long getSendMonoForumPeerId() {
        mu1 mu1Var = this.F3;
        if (mu1Var != null) {
            return mu1Var.c7();
        }
        return 0L;
    }

    public k4a getSenderSelectView() {
        return this.q0;
    }

    public cja getSizeNotifierLayout() {
        return this.c2;
    }

    public float getSlideToCancelProgress() {
        return this.Y4;
    }

    public CharSequence getSlowModeTimer() {
        if (this.H0 > 0) {
            return ((jia) this.G0.c).getText();
        }
        return null;
    }

    public long getStarsPrice() {
        mu1 mu1Var = this.F3;
        return mu1Var != null ? mu1Var.getMessagesController().K1(mu1Var.a()) : na7.q1(this.R).K1(this.G3);
    }

    public Drawable getStickersArrowDrawable() {
        return this.v4;
    }

    public int getStickersExpandedHeight() {
        return this.t4;
    }

    public ImageView getSuggestButton() {
        return this.m2;
    }

    public TLRPC.TL_textWithEntities getTextWithEntities() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {new SpannableStringBuilder(getEditText())};
        tL_textWithEntities.entities = hq6.d0(y6c.t0).Y(charSequenceArr, true, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        return tL_textWithEntities;
    }

    public float getTopViewEnterProgress() {
        return this.g7.e;
    }

    public float getTopViewHeight() {
        View view = this.w2;
        if (view == null || view.getVisibility() != 0) {
            return 0.0f;
        }
        return this.w2.getLayoutParams().height;
    }

    public float getTopViewTranslation() {
        View view = this.w2;
        if (view == null || view.getVisibility() == 8) {
            return 0.0f;
        }
        return this.w2.getTranslationY();
    }

    public p1c getTrendingStickersAlert() {
        return this.Q3;
    }

    public int getVisibleEmojiPadding() {
        if (this.X0) {
            return this.q3;
        }
        return 0;
    }

    public float getVisualHeight() {
        float f = this.J2;
        View view = this.w2;
        if (view != null && view.getVisibility() == 0) {
            f += (1.0f - getTopViewEnterProgress()) * this.w2.getLayoutParams().height;
        }
        return getMeasuredHeight() - f;
    }

    public final boolean h0(View view, float[] fArr) {
        if (view == null || view.getWidth() <= 0 || !(view.getParent() instanceof View)) {
            return false;
        }
        ((View) view.getParent()).getLocationInWindow(this.H6);
        fArr[0] = (view.getWidth() / 2.0f) + view.getX() + r4[0];
        fArr[1] = (view.getHeight() / 2.0f) + view.getY() + r4[1];
        return true;
    }

    public void h1() {
        if ((G0() && z()) || org.telegram.ui.ActionBar.d.hasSheets(this.F3)) {
            return;
        }
        hy1 hy1Var = this.P3;
        if (hy1Var != null) {
            hy1Var.K0();
        }
        ex1 ex1Var = this.F0;
        if (ex1Var == null || gl.E3(ex1Var)) {
            return;
        }
        this.F0.clearFocus();
        this.F0.requestFocus();
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b2, code lost:
    
        if (android.text.TextUtils.isEmpty(r15 == null ? "" : gl.m1(r15.getTextToUse())) == false) goto L119;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h2(boolean z) {
        gw1 gw1Var;
        if (this.M4) {
            mu1 mu1Var = this.F3;
            if (mu1Var != null && !mu1Var.f6) {
                z = false;
            }
            boolean G0 = G0();
            byte b = 1;
            boolean z2 = this.p7 != 1 && this.G3 > 0;
            gw1 gw1Var2 = this.n2;
            boolean z3 = gw1Var2 != null && gw1Var2.getVisibility() == 0;
            if (!G0 && !this.f3 && this.d3 == null) {
                gw1 gw1Var3 = this.n2;
                if (gw1Var3 != null) {
                    gw1Var3.setVisibility(8);
                }
            } else if (this.d3 != null) {
                if (Q0() && this.V2 == 1 && this.d3.is_persistent) {
                    gw1 gw1Var4 = this.n2;
                    if (gw1Var4 != null && gw1Var4.getVisibility() != 8) {
                        this.n2.setVisibility(8);
                    }
                } else {
                    T();
                    if (this.n2.getVisibility() != 0) {
                        this.n2.setVisibility(0);
                    }
                    this.K2.a(R.drawable.input_bot2, true);
                    this.n2.setContentDescription(k96.M0(2131754918, "AccDescrBotKeyboard"));
                }
            } else if (z2) {
                gw1 gw1Var5 = this.n2;
                if (gw1Var5 != null) {
                    gw1Var5.setVisibility(8);
                }
            } else {
                T();
                this.K2.a(R.drawable.input_bot1, true);
                this.n2.setContentDescription(k96.M0(2131754919, "AccDescrBotCommands"));
                this.n2.setVisibility(0);
            }
            if (z2) {
                U();
            }
            gw1 gw1Var6 = this.n2;
            boolean z4 = (gw1Var6 != null && gw1Var6.getVisibility() == 0) != z3;
            ep0 ep0Var = this.m0;
            byte b2 = 2;
            if (ep0Var != null) {
                boolean z5 = ep0Var.x;
                ep0Var.setWebView(this.p7 == 3);
                ep0 ep0Var2 = this.m0;
                String M0 = this.p7 == 2 ? k96.M0(2131752879, null) : this.j0;
                if (M0 == null) {
                    ep0Var2.getClass();
                    M0 = k96.M0(2131752879, null);
                }
                String str = ep0Var2.n;
                boolean z6 = str == null || !str.equals(M0);
                ep0Var2.n = M0;
                ep0Var2.r = null;
                ep0Var2.requestLayout();
                gl.T3(this.m0, z2, 0.5f, true, z);
                z4 = z4 || z6 || z5 != this.m0.x;
            }
            if (z4 && z) {
                ew1 ew1Var = this.R0;
                Float valueOf = Float.valueOf(ew1Var.getX());
                HashMap hashMap = this.C0;
                hashMap.put(ew1Var, valueOf);
                ex1 ex1Var = this.F0;
                if (ex1Var != null) {
                    hashMap.put(ex1Var, Float.valueOf(ex1Var.getX()));
                }
                gw1 gw1Var7 = this.n2;
                boolean z7 = gw1Var7 != null && gw1Var7.getVisibility() == 0;
                if (z7 != z3 && (gw1Var = this.n2) != null) {
                    gw1Var.setVisibility(0);
                    if (z7) {
                        this.n2.setAlpha(0.0f);
                        this.n2.setScaleX(0.1f);
                        this.n2.setScaleY(0.1f);
                    } else if (!z7) {
                        this.n2.setAlpha(1.0f);
                        this.n2.setScaleX(1.0f);
                        this.n2.setScaleY(1.0f);
                    }
                    gl.S3(this.n2, z7, 0.1f, true, 1.0f, true, new pv1(this, b));
                }
            }
            gw1 gw1Var8 = this.n2;
            if (gw1Var8 != null && gw1Var8.getVisibility() == 0) {
                ex1 ex1Var2 = this.F0;
            }
            b2 = this.L6;
            n2(b2);
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i0() {
        a6 a6Var = this.e1;
        if (a6Var == null || !(a6Var.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.e1.getLayoutParams();
        int i = g0() ? 80 : 0;
        if (layoutParams.gravity != i) {
            layoutParams.gravity = i;
            this.e1.setLayoutParams(layoutParams);
        }
    }

    public final void i1() {
        if (G0() && z()) {
            return;
        }
        mu1 mu1Var = this.F3;
        if (org.telegram.ui.ActionBar.d.hasSheets(mu1Var)) {
            return;
        }
        W1((gl.D || gl.E || (mu1Var != null && mu1Var.isInBubbleMode()) || this.Z2) ? 0 : 2, 0, true, true);
        hy1 hy1Var = this.P3;
        if (hy1Var != null) {
            hy1Var.K0();
        }
        ex1 ex1Var = this.F0;
        if (ex1Var != null) {
            ex1Var.requestFocus();
        }
        gl.E3(this.F0);
        if (this.Z2) {
            this.b3 = true;
            return;
        }
        if (gl.D || this.p3 || gl.E) {
            return;
        }
        if (mu1Var == null || !mu1Var.isInBubbleMode()) {
            this.a4 = true;
            wx1 wx1Var = this.V0;
            if (wx1Var != null) {
                wx1Var.onTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0));
            }
            qw1 qw1Var = this.h4;
            gl.r(qw1Var);
            gl.d3(qw1Var, 100L);
        }
    }

    public final void i2() {
        int c;
        t26 t26Var;
        int K0;
        View m;
        cx1 cx1Var = this.n0;
        if (cx1Var != null) {
            int childCount = cx1Var.c.getChildCount();
            int i = 0;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.n0.c.getChildAt(i2);
                if (i2 < 4) {
                    i += childAt.getMeasuredHeight();
                }
            }
            cja cjaVar = this.c2;
            if (i > 0) {
                c = b00.c(childCount > 4 ? 12.0f : 0.0f, (cjaVar.getMeasuredHeight() - i) - gl.L(8.0f), 0);
            } else {
                c = this.o0.c.size() > 4 ? b00.c(162.8f, cjaVar.getMeasuredHeight(), 0) : b00.c((Math.max(1, Math.min(4, this.o0.c.size())) * 36) + 8, cjaVar.getMeasuredHeight(), 0);
            }
            if (this.n0.c.getPaddingTop() != c) {
                this.n0.c.setTopGlowOffset(c);
                if (this.V6 == -1 && this.n0.getVisibility() == 0 && this.n0.c.getLayoutManager() != null && (K0 = (t26Var = (t26) this.n0.c.getLayoutManager()).K0()) >= 0 && (m = t26Var.m(K0)) != null) {
                    this.V6 = K0;
                    this.W6 = m.getTop() - this.n0.c.getPaddingTop();
                }
                this.n0.c.setPadding(0, c, 0, gl.L(8.0f));
            }
        }
    }

    public final void j(TLRPC.Document document) {
        hq6.d0(this.R).c(document, (int) (System.currentTimeMillis() / 1000), true);
        wx1 wx1Var = this.V0;
        if (wx1Var == null || document == null) {
            return;
        }
        boolean isEmpty = wx1Var.j1.isEmpty();
        wx1Var.X();
        if (isEmpty) {
            wx1Var.Y(false);
        }
    }

    public final void j0() {
        RecordCircle recordCircle;
        if (this.v3 || ((recordCircle = this.D2) != null && ChatActivityEnterView.this.h5)) {
            this.v3 = false;
            this.Y1 = 0L;
            this.D1 = true;
            try {
                r2(2, true);
                this.D1 = false;
                gl.d3(new uv1(this, (byte) 8), 120L);
            } catch (Throwable th) {
                this.D1 = false;
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j1() {
        mu1 mu1Var;
        Editable editable;
        hd9 hd9Var;
        CharSequence[] charSequenceArr;
        ArrayList Y;
        if (this.F0 == null || (mu1Var = this.F3) == null) {
            return;
        }
        na7.q1(this.R);
        boolean z = w01.a;
        TL_iv.RichMessage richMessage = this.u2;
        byte b = 1;
        if (richMessage != null) {
            hd9Var = new hd9(richMessage);
        } else {
            Editable text = this.F0.getText();
            byte b2 = 0;
            if (!TextUtils.isEmpty(text) && TextUtils.indexOf((CharSequence) text, '`') >= 0) {
                try {
                    charSequenceArr = new CharSequence[]{new SpannableStringBuilder(text)};
                    Y = hq6.d0(this.R).Y(charSequenceArr, true, true);
                } catch (Exception e) {
                    fa4.g(e, true);
                }
                if (Y != null && !Y.isEmpty()) {
                    editable = new SpannableStringBuilder(charSequenceArr[0]);
                    k27.b(editable, Y, false, false, false, false, 0);
                    hd9 hd9Var2 = new hd9(editable);
                    if (editable == text) {
                        int selectionStart = this.F0.getSelectionStart();
                        int selectionEnd = this.F0.getSelectionEnd();
                        if (selectionStart < 0) {
                            selectionStart = this.F0.length();
                        }
                        if (selectionEnd < 0) {
                            selectionEnd = selectionStart;
                        }
                        hd9Var2.c = selectionStart;
                        hd9Var2.d = selectionEnd;
                    }
                    hd9Var2.M = new uv1(this, b2);
                    hd9Var = hd9Var2;
                }
            }
            editable = text;
            hd9 hd9Var22 = new hd9(editable);
            if (editable == text) {
            }
            hd9Var22.M = new uv1(this, b2);
            hd9Var = hd9Var22;
        }
        hd9Var.setResourceProvider(this.L4);
        hd9Var.K = mu1Var;
        hd9Var.s = mu1Var.U;
        hd9Var.w = mu1Var.a0;
        hd9Var.L = new uv1(this, b);
        mu1Var.presentFragment(hd9Var);
    }

    public final void j2(boolean z) {
        if (this.p7 != 1 && this.G3 > 0) {
            U();
        }
        ep0 ep0Var = this.m0;
        if (ep0Var != null) {
            ep0Var.setWebView(G0());
        }
        h2(z);
    }

    public final void k(TLRPC.Document document) {
        X();
        wx1 wx1Var = this.V0;
        int i = wx1Var.d1;
        hq6.d0(i).d(0, null, document, (int) (System.currentTimeMillis() / 1000), false);
        boolean isEmpty = wx1Var.k1.isEmpty();
        wx1Var.k1 = hq6.d0(i).j0(0, true);
        l14 l14Var = wx1Var.z0;
        if (l14Var != null) {
            l14Var.f();
        }
        if (isEmpty) {
            wx1Var.Y(false);
        }
    }

    public final void k0() {
        m0(false, false);
        jm3 jm3Var = this.j1;
        if (jm3Var != null && jm3Var.o0 && jm3Var.r == 1) {
            jm3Var.u();
        }
        ex1 ex1Var = this.F0;
        if (ex1Var != null && ex1Var.length() > 0) {
            bw1 bw1Var = this.O4;
            bw1Var.getClass();
            ChatActivityEnterView chatActivityEnterView = bw1Var.b;
            chatActivityEnterView.h = 1.0f;
            chatActivityEnterView.l2();
            float f = this.B0 ? 0.5f : 1.0f;
            bw1 bw1Var2 = this.Q4;
            bw1Var2.getClass();
            ChatActivityEnterView chatActivityEnterView2 = bw1Var2.b;
            chatActivityEnterView2.n = f;
            chatActivityEnterView2.l2();
        }
        j0();
        ew1 ew1Var = this.R0;
        if (ew1Var != null) {
            ew1Var.invalidate();
        }
    }

    public final void k1(CharSequence charSequence, CharSequence charSequence2, String str) {
        mu1 mu1Var;
        if (this.F0 == null || (mu1Var = this.F3) == null) {
            return;
        }
        na7.q1(this.R);
        boolean z = w01.a;
        hd9 hd9Var = new hd9(str);
        hd9Var.h = charSequence;
        hd9Var.n = charSequence2;
        hd9Var.setResourceProvider(this.L4);
        hd9Var.K = mu1Var;
        hd9Var.s = mu1Var.U;
        hd9Var.w = mu1Var.a0;
        hd9Var.M = new av1(this, (byte) 3);
        hd9Var.L = new av1(this, (byte) 4);
        mu1Var.presentFragment(hd9Var);
    }

    public final void k2() {
        ex1 ex1Var = this.F0;
        boolean z = false;
        S1((ex1Var == null || ex1Var.getLineCount() <= 2 || this.F0.getText() == null || TextUtils.isEmpty(this.F0.getText().toString().trim())) ? false : true);
        ex1 ex1Var2 = this.F0;
        if (ex1Var2 != null && ex1Var2.getLineCount() > 2 && this.F0.getText() != null && !TextUtils.isEmpty(this.F0.getText().toString().trim())) {
            z = true;
        }
        Y1(z);
    }

    public final void l(boolean z) {
        mu1 mu1Var;
        if (this.o6 >= 0) {
            ConnectionsManager.getInstance(this.R).cancelRequest(this.o6, true);
            this.o6 = -1;
        }
        qw1 qw1Var = this.r6;
        if (qw1Var != null) {
            gl.r(qw1Var);
            this.r6 = null;
        }
        this.p6 = false;
        cc ccVar = this.m6;
        if (ccVar != null) {
            ccVar.c(false);
        }
        m();
        if (!z || (mu1Var = this.F3) == null) {
            return;
        }
        u21.b0(mu1Var).Q(R.raw.error, 36, "Couldn't rewrite the message. It wasn't sent.").j();
    }

    public final void l0() {
        if (!this.k1 || this.O2 || this.v3) {
            return;
        }
        jm3 jm3Var = this.j1;
        if (jm3Var == null || !jm3Var.o()) {
            if ((this.A0 && !this.o7 && yde.a(getContext())) != this.l1) {
                this.q1.run();
            }
        }
    }

    public final void l1() {
        av1 av1Var = new av1(this, (byte) 1);
        if (bue.b(this.R, this.G3) || na7.q1(this.R).S3.contains(Long.valueOf(this.G3))) {
            av1Var.run();
            return;
        }
        ij.n(this.F3, na7.q1(this.R).V1(Long.valueOf(this.G3)), new aj1(this, av1Var, (byte) 24), new av1(this, (byte) 2));
    }

    public final void l2() {
        float f = (1.0f - this.A1) * this.y1;
        float R1 = f > 0.0f ? gl.R1(1.0f, 0.6f, f) : 1.0f;
        float f2 = this.r * this.h * R1;
        ew1 ew1Var = this.R0;
        ew1Var.setScaleX(f2);
        ew1Var.setScaleY(this.r * this.h * R1);
        ew1Var.setAlpha((1.0f - f) * this.s * this.n);
    }

    public final void m() {
        cc ccVar = this.m6;
        if (ccVar != null && ccVar.d) {
            ccVar.d = false;
            ccVar.a.invalidate();
        }
        if (this.w6) {
            this.w6 = false;
            this.F1 = false;
            ex1 ex1Var = this.F0;
            if (ex1Var != null) {
                ex1Var.invalidate();
            }
        }
    }

    public final void m0(boolean z, boolean z2) {
        ValueAnimator valueAnimator = this.B6;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.B6 = null;
        }
        this.z6 = z;
        RecordCircle recordCircle = this.D2;
        if (recordCircle != null && this.v3 && z) {
            recordCircle.setAmplitude(0.0d);
        }
        if (z2) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.A6, z ? 1.0f : 0.0f);
            this.B6 = ofFloat;
            ofFloat.addUpdateListener(new pv1(this, (byte) 8));
            this.B6.setDuration(220L);
            this.B6.setInterpolator(s33.g);
            this.B6.start();
            return;
        }
        this.A6 = z ? 1.0f : 0.0f;
        l lVar = this.E2;
        if (lVar != null) {
            lVar.invalidate();
        }
        RecordCircle recordCircle2 = this.D2;
        if (recordCircle2 != null) {
            recordCircle2.invalidate();
        }
    }

    public final boolean m1() {
        return this.W0 != null;
    }

    public final void m2(boolean z) {
        boolean z2;
        boolean z3;
        String str;
        TLRPC.TL_forumTopic tL_forumTopic;
        String str2;
        k27 k27Var;
        TLRPC.ReplyMarkup replyMarkup;
        TLRPC.ReplyMarkup replyMarkup2;
        ex1 ex1Var = this.F0;
        if (ex1Var != null) {
            CharSequence charSequence = this.e;
            boolean z4 = false;
            if (charSequence != null) {
                ex1Var.r(charSequence, z);
                ex1 ex1Var2 = this.F0;
                String str3 = this.f;
                xs3 xs3Var = ex1Var2.v0;
                if (xs3Var != null) {
                    if (!k96.a0 && z) {
                        z4 = true;
                    }
                    xs3Var.t(str3, z4, true);
                    return;
                }
                return;
            }
            if (!this.A0 && !P0()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" d ".concat(k96.M0(2131747028, "PlainTextRestrictedHint")));
                spannableStringBuilder.setSpan(new cm2(R.drawable.msg_mini_lock3, 0), 1, 2, 0);
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
            x2();
            mu1 mu1Var = this.F3;
            boolean z5 = mu1Var != null && mu1Var.g4 == 8 && mu1Var.i4;
            long K1 = mu1Var != null ? mu1Var.getMessagesController().K1(mu1Var.a()) : 0L;
            if (K1 > 0) {
                K1 *= getMessagesCount();
            }
            int i2 = mu1Var != null ? mu1Var.g4 : -1;
            if (i2 == 9) {
                this.F0.setHintText(k96.M0(2131742632, null));
                return;
            }
            if (i2 == 5) {
                if ("hello".equalsIgnoreCase(mu1Var.f4)) {
                    this.F0.setHintText(k96.M0(2131752755, null));
                    return;
                }
                boolean equalsIgnoreCase = "away".equalsIgnoreCase(mu1Var.f4);
                ex1 ex1Var3 = this.F0;
                if (equalsIgnoreCase) {
                    ex1Var3.setHintText(k96.M0(2131752824, null));
                    return;
                } else {
                    ex1Var3.setHintText(k96.M0(2131752660, null));
                    return;
                }
            }
            cm2[] cm2VarArr = this.K6;
            if (z5) {
                this.F0.setHintText(K1 > 0 ? jva.S0(k96.a0(null, null, 2131744162, k96.E((int) K1, ','), cm2VarArr)) : k96.a0(null, null, 2131744163, new Object[0]));
                cm2 cm2Var = cm2VarArr[0];
                if (cm2Var != null) {
                    cm2Var.H = 0.9f;
                    return;
                }
                return;
            }
            if (this.R2 != null) {
                this.F0.setHintText(k96.M0(2131752694, null));
                return;
            }
            k27 k27Var2 = this.J3;
            if (k27Var2 != null && (replyMarkup2 = k27Var2.k.reply_markup) != null && !TextUtils.isEmpty(replyMarkup2.placeholder)) {
                this.F0.r(this.J3.k.reply_markup.placeholder, z);
                return;
            }
            if (this.P2 != null) {
                this.F0.setHintText(this.Q2 ? k96.M0(2131752549, null) : k96.M0(2131743689, null));
                return;
            }
            if (K1 > 0) {
                this.F0.setHintText(jva.Y0(false, k96.a0(null, null, 2131743687, k96.E((int) K1, ',')), cm2VarArr));
                cm2 cm2Var2 = cm2VarArr[0];
                if (cm2Var2 != null) {
                    cm2Var2.H = 0.9f;
                    return;
                }
                return;
            }
            if (this.Y0 && (k27Var = this.c3) != null && (replyMarkup = k27Var.k.reply_markup) != null && !TextUtils.isEmpty(replyMarkup.placeholder)) {
                this.F0.r(this.c3.k.reply_markup.placeholder, z);
                return;
            }
            if (mu1Var != null && mu1Var.N7()) {
                k27 k27Var3 = this.K3;
                if (k27Var3 != null && (tL_forumTopic = k27Var3.j1) != null && (str2 = tL_forumTopic.title) != null) {
                    this.F0.r(k96.a0(null, null, 2131743686, str2), z);
                    return;
                }
                TLRPC.TL_forumTopic f = na7.q1(this.R).g4.f(mu1Var.e.id, 1L);
                if (f == null || (str = f.title) == null) {
                    this.F0.r(k96.M0(2131743689, null), z);
                    return;
                } else {
                    this.F0.r(k96.a0(null, null, 2131743686, str), z);
                    return;
                }
            }
            if (cf3.y(this.G3)) {
                TLRPC.Chat K0 = na7.q1(this.S.a).K0(Long.valueOf(-this.G3));
                TLRPC.ChatFull L0 = na7.q1(this.S.a).L0(-this.G3);
                z3 = hc2.V(K0);
                z2 = !z3 && hc2.M(K0, L0, false) == (-this.G3);
            } else {
                z2 = false;
                z3 = false;
            }
            if (z2) {
                this.F0.setHintText(k96.M0(2131745446, "SendAnonymously"));
                return;
            }
            TLRPC.User V1 = na7.q1(this.S.a).V1(Long.valueOf(this.G3));
            if (V1 != null && V1.bot_forum_view && !V1.bot_forum_can_manage_topics && mu1Var != null && !mu1Var.x4) {
                this.F0.setHintText(k96.M0(2131745441, null));
                return;
            }
            if (mu1Var != null && mu1Var.a8() && !mu1Var.x4) {
                boolean z6 = mu1Var.m4 != null && mu1Var.v4;
                ex1 ex1Var4 = this.F0;
                if (z6) {
                    ex1Var4.setHintText(k96.M0(2131751993, null));
                    return;
                } else {
                    ex1Var4.setHintText(k96.M0(2131746070, "Reply"));
                    return;
                }
            }
            if (!z3) {
                this.F0.setHintText(k96.M0(2131743689, null));
                return;
            }
            boolean z7 = this.W2;
            ex1 ex1Var5 = this.F0;
            if (z7) {
                ex1Var5.r(k96.M0(2131752279, "ChannelSilentBroadcast"), z);
            } else {
                ex1Var5.r(k96.M0(2131752435, "ChannelBroadcast"), z);
            }
        }
    }

    public final ValueAnimator n(float f) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.z2.a, f);
        ofFloat.addUpdateListener(new pv1(this, (byte) 5));
        return ofFloat;
    }

    public final boolean n0() {
        jm3 jm3Var;
        ex1 ex1Var;
        if (this.D6) {
            return true;
        }
        if (!this.l1 || (jm3Var = this.j1) == null || !jm3Var.p() || this.v3) {
            return false;
        }
        return (!this.j1.q() || this.j1.r == 2) && (ex1Var = this.F0) != null && ex1Var.length() > 0;
    }

    public boolean n1() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n2(int i) {
        ImageView imageView;
        pw1 pw1Var;
        int L;
        pw1 pw1Var2;
        gw1 gw1Var;
        int L2;
        a aVar;
        this.L6 = i;
        if (this.F0 != null) {
            k27 k27Var = this.P2;
            if (k27Var == null || k27Var.o5()) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.F0.getLayoutParams();
                int i2 = layoutParams.rightMargin;
                boolean z = this.Z5;
                ow1 ow1Var = this.K0;
                if (z && this.o7) {
                    layoutParams.rightMargin = Math.max(0, ow1Var.l() - gl.L(44.0f)) + gl.L(this.k5 ? 50.0f : 2.0f);
                } else if ((i == 1 || i == 2) && !o0()) {
                    gw1 gw1Var2 = this.n2;
                    if (gw1Var2 == null || gw1Var2.getVisibility() != 0 || (pw1Var2 = this.z2) == null || pw1Var2.getVisibility() != 0 || (gw1Var = this.h2) == null || gw1Var.getVisibility() != 0) {
                        gw1 gw1Var3 = this.n2;
                        if ((gw1Var3 == null || gw1Var3.getVisibility() != 0) && (((imageView = this.y2) == null || imageView.getVisibility() != 0) && ((pw1Var = this.z2) == null || pw1Var.getTag() == null))) {
                            L = gl.L(50.0f);
                            layoutParams.rightMargin = L;
                        } else {
                            L = gl.L(98.0f);
                            layoutParams.rightMargin = L;
                        }
                    } else {
                        L = gl.L(146.0f);
                        layoutParams.rightMargin = L;
                    }
                    if (this.k5) {
                        layoutParams.rightMargin = gl.L(48.0f) + L;
                    }
                } else {
                    pw1 pw1Var3 = this.z2;
                    if (pw1Var3 == null || pw1Var3.getTag() == null) {
                        layoutParams.rightMargin = gl.L(2.0f);
                    } else {
                        layoutParams.rightMargin = gl.L(50.0f);
                    }
                }
                if (o0() || (g0() && this.v3)) {
                    ex1 ex1Var = this.F0;
                    View view = ex1Var == null ? null : (View) ex1Var.getParent();
                    if (view == null || view.getWidth() == 0 || (aVar = this.a1) == null || aVar.getWidth() == 0) {
                        L2 = gl.L(28.0f);
                    } else {
                        view.getLocationInWindow(new int[2]);
                        aVar.getLocationInWindow(new int[2]);
                        L2 = Math.max(gl.L(2.0f), Math.round((view.getWidth() + r6[0]) - ((((aVar.getWidth() / 2.0f) + (r3[0] - aVar.getTranslationX())) - gl.N(41.0f)) - gl.L(8.0f))));
                    }
                    layoutParams.rightMargin = L2;
                }
                layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, ow1Var.l() - gl.L(44.0f)));
                ow1 ow1Var2 = this.v2;
                if (ow1Var2 != null && ow1Var2.getVisibility() == 0) {
                    layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, this.v2.l() - gl.L(44.0f)));
                }
                if (i2 != layoutParams.rightMargin) {
                    this.F0.setLayoutParams(layoutParams);
                }
                cw1 cw1Var = this.f1;
                if (cw1Var != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) cw1Var.getLayoutParams();
                    layoutParams2.rightMargin = this.P2 == null ? b00.c(44.0f, ow1Var.l(), 0) : 0;
                    this.f1.setLayoutParams(layoutParams2);
                }
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
        if (z && alpha < 0.25f && (getSendButtonInternal() instanceof ky1) && SystemClock.uptimeMillis() > this.I1) {
            ky1 ky1Var = (ky1) getSendButtonInternal();
            ky1Var.p0.e(true, 0.0f);
            ky1Var.invalidate();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tv1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i = ChatActivityEnterView.r7;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                chatActivityEnterView.getSendButtonInternal().setAlpha(gl.R1(alpha, f, floatValue));
                chatActivityEnterView.getSendButtonInternal().setScaleX(gl.R1(scaleX, f2, floatValue));
                chatActivityEnterView.getSendButtonInternal().setScaleY(gl.R1(scaleY, f3, floatValue));
            }
        });
        return ofFloat;
    }

    public final boolean o0() {
        jm3 jm3Var;
        return this.l1 && (jm3Var = this.j1) != null && jm3Var.p();
    }

    public final void o1(int i, int i2, CharSequence charSequence, boolean z) {
        if (this.F0 == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.F0.getText());
            spannableStringBuilder.replace(i, i2 + i, charSequence);
            if (z) {
                vu3.m(spannableStringBuilder, this.F0.getPaint().getFontMetricsInt(), false, null, 0);
            }
            this.F0.setText(spannableStringBuilder);
            this.F0.setSelection(i + charSequence.length());
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a5, code lost:
    
        if (na7.q1(r14.R).X3.getBoolean("show_gift_for_" + r14.F3.a(), true) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00db, code lost:
    
        if (na7.q1(r14.R).X3.getBoolean(java.util.Calendar.getInstance().get(1) + "show_gift_for_" + r14.F3.a(), true) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e5, code lost:
    
        if (r2.display_gifts_button == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f9, code lost:
    
        if (r0.disallow_unique_stargifts != false) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o2(boolean z) {
        boolean z2;
        wjb wjbVar;
        je5 je5Var;
        TLRPC.UserFull userFull = getParentFragment() == null ? null : getParentFragment().s8;
        TLRPC.UserFull W1 = na7.q1(this.R).W1(y6c.h(this.R).e());
        TLRPC.User h = getParentFragment() == null ? null : getParentFragment().h();
        byte b = 0;
        byte b2 = 1;
        if (!na7.q1(this.R).G3() && getParentFragment() != null && h != null) {
            boolean z3 = w01.a;
            if ((!l7c.D(h) || (W1 != null && W1.display_gifts_button)) && !l7c.v(h) && !na7.E2(h) && userFull != null) {
                if (!h.premium && na7.q1(this.R).k4.C0.f && na7.q1(this.R).k4.B0.f) {
                }
                if (oj0.e(userFull.birthday)) {
                }
                if (!userFull.display_gifts_button) {
                    if (W1 != null) {
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
                mu1 mu1Var = this.F3;
                if (mu1Var != null && mu1Var.g4 == 0) {
                    z2 = true;
                    if (!z2 && (je5Var = this.M) != null) {
                        je5Var.f(true);
                    }
                    if (z2 && this.A2 == null) {
                        return;
                    }
                    wjbVar = this.L4;
                    if (this.A2 == null && this.F3 != null) {
                        gw1 gw1Var = new gw1(this, getContext(), b2);
                        this.A2 = gw1Var;
                        gw1Var.setImageResource(R.drawable.msg_input_gift);
                        zkb.s(this.A2, bkb.Ml, wjbVar, PorterDuff.Mode.MULTIPLY);
                        this.A2.setVisibility(8);
                        this.A2.setContentDescription(k96.M0(2131749508, null));
                        this.A2.setScaleType(ImageView.ScaleType.CENTER);
                        gw1 gw1Var2 = this.A2;
                        int i = bkb.h6;
                        zkb.R(gw1Var2, bkb.f0(F0(i), 1, -1), null, zkb.M(i), wjbVar);
                        this.f2.addView(this.A2, 0, nme.e(44, 44, 21));
                        this.A2.setOnClickListener(new fv1(this, (byte) 13));
                    }
                    gl.S3(this.A2, z2, 1.0f, true, 1.0f, z, new pv1(this, b));
                    if (z2) {
                        return;
                    }
                    G();
                    return;
                }
            }
        }
        z2 = false;
        if (!z2) {
            je5Var.f(true);
        }
        if (z2) {
        }
        wjbVar = this.L4;
        if (this.A2 == null) {
            gw1 gw1Var3 = new gw1(this, getContext(), b2);
            this.A2 = gw1Var3;
            gw1Var3.setImageResource(R.drawable.msg_input_gift);
            zkb.s(this.A2, bkb.Ml, wjbVar, PorterDuff.Mode.MULTIPLY);
            this.A2.setVisibility(8);
            this.A2.setContentDescription(k96.M0(2131749508, null));
            this.A2.setScaleType(ImageView.ScaleType.CENTER);
            gw1 gw1Var22 = this.A2;
            int i2 = bkb.h6;
            zkb.R(gw1Var22, bkb.f0(F0(i2), 1, -1), null, zkb.M(i2), wjbVar);
            this.f2.addView(this.A2, 0, nme.e(44, 44, 21));
            this.A2.setOnClickListener(new fv1(this, (byte) 13));
        }
        gl.S3(this.A2, z2, 1.0f, true, 1.0f, z, new pv1(this, b));
        if (z2) {
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        uw1 uw1Var = this.r0;
        if (uw1Var != null) {
            uw1Var.e = false;
            uw1Var.dismiss();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        u0(canvas, true);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View X;
        if (this.v3) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0 && (X = gl.X(this, motionEvent.getX(), motionEvent.getY())) != this.M && X != this.N) {
            I0();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        cx1 cx1Var;
        super.onLayout(z, i, i2, i3, i4);
        if (this.V6 == -1 || (cx1Var = this.n0) == null) {
            return;
        }
        t26 t26Var = (t26) cx1Var.c.getLayoutManager();
        if (t26Var != null) {
            t26Var.g1(this.V6, this.W6);
        }
        this.V6 = -1;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        cw1 cw1Var = this.p2;
        int measuredHeight = cw1Var.getMeasuredHeight();
        ep0 ep0Var = this.m0;
        ImageView imageView = this.S0;
        ew1 ew1Var = this.R0;
        int i3 = 0;
        if (ep0Var == null || ep0Var.getTag() == null) {
            k4a k4aVar = this.q0;
            if (k4aVar == null || k4aVar.getVisibility() != 0) {
                ((ViewGroup.MarginLayoutParams) ew1Var.getLayoutParams()).leftMargin = gl.L(3.0f);
                if (imageView != null) {
                    ((ViewGroup.MarginLayoutParams) imageView.getLayoutParams()).leftMargin = gl.L(3.0f);
                }
                ex1 ex1Var = this.F0;
                if (ex1Var != null) {
                    ((ViewGroup.MarginLayoutParams) ex1Var.getLayoutParams()).leftMargin = gl.L(50.0f);
                }
                ig9 ig9Var = this.s2;
                if (ig9Var != null) {
                    ((ViewGroup.MarginLayoutParams) ig9Var.getLayoutParams()).leftMargin = gl.L(50.0f);
                }
            } else {
                int i4 = this.q0.getLayoutParams().width;
                this.q0.measure(View.MeasureSpec.makeMeasureSpec(i4, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.q0.getLayoutParams().height, TLObject.FLAG_30));
                ((ViewGroup.MarginLayoutParams) ew1Var.getLayoutParams()).leftMargin = gl.L(7.0f) + i4;
                if (imageView != null) {
                    ((ViewGroup.MarginLayoutParams) imageView.getLayoutParams()).leftMargin = gl.L(7.0f) + i4;
                }
                ex1 ex1Var2 = this.F0;
                if (ex1Var2 != null) {
                    ((ViewGroup.MarginLayoutParams) ex1Var2.getLayoutParams()).leftMargin = gl.L(54.0f) + i4;
                }
                ig9 ig9Var2 = this.s2;
                if (ig9Var2 != null) {
                    ((ViewGroup.MarginLayoutParams) ig9Var2.getLayoutParams()).leftMargin = gl.L(54.0f) + i4;
                }
            }
        } else {
            this.m0.measure(i, i2);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ew1Var.getLayoutParams();
            int L = gl.L(10.0f);
            ep0 ep0Var2 = this.m0;
            marginLayoutParams.leftMargin = L + (ep0Var2 == null ? 0 : ep0Var2.getMeasuredWidth());
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int L2 = gl.L(10.0f);
                ep0 ep0Var3 = this.m0;
                marginLayoutParams2.leftMargin = L2 + (ep0Var3 == null ? 0 : ep0Var3.getMeasuredWidth());
            }
            ex1 ex1Var3 = this.F0;
            if (ex1Var3 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) ex1Var3.getLayoutParams();
                int L3 = gl.L(57.0f);
                ep0 ep0Var4 = this.m0;
                marginLayoutParams3.leftMargin = L3 + (ep0Var4 == null ? 0 : ep0Var4.getMeasuredWidth());
            }
            ig9 ig9Var3 = this.s2;
            if (ig9Var3 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) ig9Var3.getLayoutParams();
                int L4 = gl.L(57.0f);
                ep0 ep0Var5 = this.m0;
                marginLayoutParams4.leftMargin = L4 + (ep0Var5 == null ? 0 : ep0Var5.getMeasuredWidth());
            }
        }
        i2();
        super.onMeasure(i, i2);
        qu1 qu1Var = this.l0;
        if (qu1Var != null) {
            ep0 ep0Var6 = this.m0;
            if (ep0Var6 != null) {
                qu1Var.setMeasuredButtonWidth(ep0Var6.getMeasuredWidth());
            }
            this.l0.getLayoutParams().height = getMeasuredHeight() - gl.L(2.0f);
            measureChild(this.l0, i, i2);
        }
        P();
        Q();
        if (measuredHeight <= 0 || cw1Var.getMeasuredHeight() == measuredHeight) {
            return;
        }
        while (i3 < 2) {
            ImageView imageView2 = i3 == 0 ? this.j2 : this.k2;
            imageView2.setTranslationY((imageView2.getTranslationY() + cw1Var.getMeasuredHeight()) - measuredHeight);
            imageView2.animate().translationY(0.0f).setInterpolator(s33.h).setDuration(420L).start();
            i3++;
        }
        je5 je5Var = this.N;
        if (je5Var != null) {
            je5Var.setTranslationY((je5Var.getTranslationY() + cw1Var.getMeasuredHeight()) - measuredHeight);
            ug8.t(this.N.animate().translationY(0.0f), s33.h, 420L);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 && this.p4) {
            O1(0, false);
            this.V0.s(false);
            P1(false, false, false, true);
        }
        scc sccVar = this.g1;
        if (sccVar != null) {
            ArrayList arrayList = sccVar.w;
            if (sccVar.O.isEmpty()) {
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    Bitmap bitmap = (Bitmap) arrayList.get(i5);
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                }
            }
            arrayList.clear();
            pcc pccVar = sccVar.x;
            if (pccVar != null) {
                pccVar.cancel(true);
                sccVar.x = null;
            }
            sccVar.invalidate();
        }
    }

    @Override // x74
    public final void p(int i, float f, float f2, y74 y74Var) {
        cw1 cw1Var;
        float f3 = 0.0f;
        if (i == 0) {
            ojc ojcVar = this.T1;
            if (ojcVar != null) {
                ojcVar.setVisibleHeight(f);
            }
            if (this.E2 != null) {
                if (this.K1 && this.Q5 && (cw1Var = this.f1) != null && cw1Var.getVisibility() == 0) {
                    f3 = -Math.max(0.0f, f - gl.L(44.0f));
                }
                this.R5 = f3;
                this.E2.setTranslationY(f3 + this.S5 + this.l7);
            }
            P();
            Q();
        } else if (i == 1) {
            P();
            Q();
        } else {
            if (i == 2) {
                u0a u0aVar = this.J0;
                u0aVar.setAlpha(f);
                u0aVar.setScaleX(gl.R1(0.5f, 1.0f, f));
                u0aVar.setScaleY(gl.R1(0.5f, 1.0f, f));
                u0aVar.setVisibility(f <= 0.0f ? 4 : 0);
            } else if (i == 3) {
                float R1 = gl.R1(1.0f, 0.79f, f);
                cw1 cw1Var2 = this.q2;
                cw1Var2.setScaleX(R1);
                cw1Var2.setScaleY(gl.R1(1.0f, 0.79f, f));
                float R12 = gl.R1(0.79f, 1.0f, f);
                ImageView imageView = this.r2;
                imageView.setScaleX(R12);
                imageView.setScaleY(gl.R1(0.79f, 1.0f, f));
                imageView.setVisibility(f <= 0.0f ? 8 : 0);
                imageView.setAlpha(f);
                ow1 ow1Var = this.K0;
                if (ow1Var != null) {
                    ow1Var.setSameWidthFactor(f);
                }
            }
        }
        invalidate();
    }

    public final void p0() {
        float f;
        j92 C0;
        if (this.E2 != null) {
            if (g0() && this.v3) {
                RectF rectF = this.H4;
                if (!rectF.isEmpty() && this.E2.getHeight() > 0 && (C0 = C0()) != null) {
                    this.E2.getLocationInWindow(this.m7);
                    C0.getLocationInWindow(this.n7);
                    f = Math.min(0.0f, (((C0.getInputBubbleTop() + r3[1]) - gl.L(8.0f)) - gl.L(18.0f)) - (rectF.centerY() + (((r4[1] - this.E2.getTranslationY()) + this.R5) + this.S5)));
                    if (Math.abs(f - this.l7) < 0.5f || (f == 0.0f && this.l7 != 0.0f)) {
                        this.l7 = f;
                        this.E2.setTranslationY(this.R5 + this.S5 + f);
                    }
                    return;
                }
            }
            f = 0.0f;
            if (Math.abs(f - this.l7) < 0.5f) {
            }
            this.l7 = f;
            this.E2.setTranslationY(this.R5 + this.S5 + f);
        }
    }

    public final void p1() {
        P1(false, true, false, true);
        W1(0, 0, false, true);
        if (getEditField() != null && !TextUtils.isEmpty(getEditField().getText())) {
            getEditField().setText("");
        }
        this.v3 = false;
        mw1 mw1Var = this.c1;
        if (mw1Var != null) {
            mw1Var.setVisibility(0);
        }
        this.a3 = true;
        U0();
        D();
        M0();
        l lVar = this.E2;
        if (lVar != null) {
            lVar.setVisibility(8);
        }
        RecordCircle recordCircle = this.D2;
        if (recordCircle != null) {
            recordCircle.g();
        }
    }

    public final void p2() {
        ex1 ex1Var = this.F0;
        if (ex1Var != null) {
            ex1Var.setTranslationX(this.I + this.H);
        }
    }

    public final void q() {
        float min;
        ry8 ry8Var = this.h1;
        if (ry8Var == null || ry8Var.getAnimatedDrawable() != this.z5) {
            return;
        }
        float f = this.D5;
        if (f < 0.72f) {
            float f2 = this.C5;
            min = ((f / 0.72f) * 22.0f * f2) + (8.0f * f2);
        } else {
            min = (Math.min(1.0f, (f - 0.72f) / 0.22999996f) * 14.0f) + 30.0f;
        }
        this.h1.setProgress(min / 52.0f);
        if (this.h1 != null) {
            float f3 = this.D5;
            float i = f3 < 0.72f ? this.C5 : 1.0f - Utilities.i((f3 - 0.72f) / 0.22999996f, 1.0f, 0.0f);
            float f4 = (3.0f - (i * 2.0f)) * i * i * 12.0f;
            float L = gl.L(12.0f);
            this.h1.setPivotX(r5.getWidth() / 2.0f);
            this.h1.setPivotY((r5.getHeight() / 2.0f) + L);
            this.h1.setRotation(f4);
            if (this.i1 != null) {
                double radians = Math.toRadians(f4);
                float L2 = L + gl.L(3.0f);
                i29 i29Var = this.i1;
                float sin = ((float) Math.sin(radians)) * L2;
                float cos = (1.0f - ((float) Math.cos(radians))) * L2;
                kra kraVar = i29Var.J0;
                kraVar.R = sin;
                kraVar.S = cos;
                i29Var.invalidate();
            }
        }
    }

    public final boolean q0() {
        if (!r0() || this.l1) {
            return false;
        }
        return (wxe.a() && na7.c1().getBoolean("design_voice_live_field", true)) ? false : true;
    }

    public final void q1() {
        if (this.K1 || this.T1 != null) {
            gl.r(this.X1);
            ValueAnimator valueAnimator = this.W1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.W1 = null;
            }
            ojc ojcVar = this.T1;
            if (ojcVar != null) {
                if (ojcVar.c.hasFocus()) {
                    gl.t1(this.T1.c);
                    this.T1.c.clearFocus();
                }
                this.T1.setCollapsing(true);
            }
            this.U1 = false;
            this.Q5 = false;
            K1(false);
            v(0.0f);
            i29 i29Var = this.i1;
            if (i29Var != null) {
                i29Var.setVisibility(8);
            }
            ry8 ry8Var = this.h1;
            if (ry8Var != null) {
                ry8Var.setVisibility(0);
            }
            l lVar = this.E2;
            if (lVar != null) {
                this.R5 = 0.0f;
                lVar.setTranslationY(this.S5 + this.l7);
            }
            ow1 ow1Var = this.K0;
            if (ow1Var != null) {
                ow1Var.setIconDimmed(false);
            }
        }
    }

    public final void q2(TLRPC.Chat chat, TLRPC.UserFull userFull) {
        wx1 wx1Var;
        this.B0 = false;
        boolean z = true;
        this.b = true;
        this.A0 = true;
        this.y0 = true;
        this.z0 = true;
        if (chat != null) {
            this.b1 = (hc2.v(chat) || (hc2.s(chat) && this.U2)) ? false : true;
            this.b = hc2.t(chat);
            boolean q = hc2.q(chat);
            this.A0 = q;
            boolean z2 = (this.b || q) ? false : true;
            this.B0 = z2;
            this.n = z2 ? 0.5f : 1.0f;
            l2();
            if (!this.B0 && (wx1Var = this.V0) != null) {
                wx1Var.K(-this.G3, !this.A0, !this.b);
            }
            this.y0 = hc2.s(chat);
            this.z0 = hc2.v(chat);
        } else if (userFull != null) {
            this.b1 = userFull.voice_messages_forbidden;
            this.L = userFull;
        }
        if (chat != null || userFull != null) {
            this.n1 = this.b1;
            this.k1 = chat != null ? !hc2.v(chat) : userFull.voice_messages_forbidden;
            this.o1 = chat != null && hc2.s(chat) && this.U2;
        }
        boolean z3 = this.k1 && this.A0 && !this.o7 && yde.a(getContext());
        this.l1 = z3;
        this.b1 = this.n1 && !z3;
        i0();
        if (this.k1 && !this.m1) {
            this.m1 = true;
            DictationAsr.i(this.q1);
            if (!zm3.h()) {
                zm3.j();
            }
        }
        float f = this.b1 ? 0.5f : 1.0f;
        a aVar = this.a1;
        aVar.setAlpha(f);
        aVar.invalidate();
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.b1 ? F0(bkb.Ml) : -1, PorterDuff.Mode.SRC_IN);
        mw1 mw1Var = this.c1;
        mw1Var.setColorFilter(porterDuffColorFilter);
        mw1Var.invalidate();
        m2(false);
        boolean z4 = this.d1;
        if (!this.y0 && z4) {
            z4 = false;
        }
        if (this.l1 && this.o1) {
            z4 = na7.c1().getBoolean("currentModeVideo", false);
        }
        if (this.z0 || z4 || this.l1) {
            z = z4;
        } else if (!this.U2) {
            z = false;
        }
        if (this.l1 && !this.o1) {
            z = false;
        }
        M1(z, false);
        jy1 jy1Var = this.b2;
        if (jy1Var != null) {
            jy1Var.d(g0());
        }
        mw1Var.invalidate();
    }

    public final boolean r0() {
        if (!DictationAsr.E() || this.F3 == null || this.F0 == null) {
            return false;
        }
        return !(this.U2 && this.d1) && this.z0;
    }

    public final void r1() {
        i29 i29Var = this.i1;
        if (i29Var != null) {
            i29Var.setPlaying(false);
        }
        if (this.U3 != null) {
            this.P3.k1(2, 0, this.P ? Integer.MAX_VALUE : 0, this.O6, 0L, true);
            this.O6 = 0L;
            this.K0.setEffect(0L);
        } else {
            k27 k27Var = MediaController.w().v0;
            if (k27Var != null && k27Var == this.T3) {
                MediaController.w().l(true, true, false, false);
            }
        }
        if (this.S3 != null) {
            if (w01.a) {
                de9.s(this.S3, new StringBuilder("delete file "));
            }
            new File(this.S3).delete();
        }
        MediaController.w().i(true);
        hq6 d0 = hq6.d0(this.R);
        long j = this.G3;
        mu1 mu1Var = this.F3;
        d0.D1(j, (mu1Var == null || !mu1Var.x4) ? 0L : mu1Var.d(), null);
        MediaController.w().A0(0, 0, false, false);
        this.Y1 = 0L;
        L0(false);
        N(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:187:0x1232  */
    /* JADX WARN: Type inference failed for: r0v24, types: [dz1] */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r26v10 */
    /* JADX WARN: Type inference failed for: r26v11 */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r26v6 */
    /* JADX WARN: Type inference failed for: r26v7 */
    /* JADX WARN: Type inference failed for: r26v9 */
    /* JADX WARN: Type inference failed for: r3v47, types: [dz1] */
    /* JADX WARN: Type inference failed for: r40v0, types: [byte, int] */
    /* JADX WARN: Type inference failed for: r6v74 */
    /* JADX WARN: Type inference failed for: r6v87 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void r2(int i, boolean z) {
        boolean z2;
        char c;
        my1 my1Var;
        int i2;
        char c2;
        float f;
        int i3;
        boolean z3;
        ?? r72;
        ValueAnimator valueAnimator;
        int i4;
        char c3;
        ?? r26;
        boolean z4;
        long j;
        long j2;
        int i5;
        char c4;
        int i6;
        char c5;
        my1 my1Var2;
        ?? r262;
        boolean z5;
        char c6;
        float f2;
        int i7;
        ?? r12;
        float f3;
        int i8;
        char c7;
        char c8;
        byte b;
        ViewGroup viewGroup;
        ViewGroup.LayoutParams layoutParams;
        int i9;
        char c9;
        char c10;
        float f4;
        oy1 oy1Var = oy1.a;
        oy1 oy1Var2 = oy1.b;
        Float valueOf = Float.valueOf(0.0f);
        this.I1 = SystemClock.uptimeMillis() + 1500;
        B2(i);
        Runnable runnable = this.g0;
        if (runnable != null) {
            gl.r(runnable);
            this.g0 = null;
        }
        RecordCircle recordCircle = this.D2;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
        boolean z6 = this.v3;
        Property property = View.TRANSLATION_X;
        Property property2 = View.ALPHA;
        Property property3 = View.SCALE_X;
        Property property4 = View.SCALE_Y;
        if (z6) {
            if (this.m3) {
                this.M6 = i;
                return;
            }
            boolean z7 = this.M6 == 3;
            if (!z7) {
                this.P = false;
                l lVar = this.E2;
                if (lVar != null) {
                    lVar.E.d(1, false, false);
                }
                hq6 d0 = hq6.d0(this.R);
                long j3 = this.G3;
                mu1 mu1Var = this.F3;
                d0.g2(j3, (mu1Var == null || !mu1Var.x4) ? 0L : mu1Var.d(), this.P);
                this.Y1 = 0L;
            }
            a0();
            this.m3 = true;
            wx1 wx1Var = this.V0;
            if (wx1Var != null) {
                wx1Var.setEnabled(false);
            }
            try {
                if (this.g3 == null) {
                    PowerManager.WakeLock newWakeLock = ((PowerManager) org.telegram.messenger.a.b.getSystemService("power")).newWakeLock(536870918, "telegram:audio_record_lock");
                    this.g3 = newWakeLock;
                    newWakeLock.acquire();
                }
            } catch (Exception e) {
                fa4.f(e);
            }
            gl.d2(this.E3);
            hy1 hy1Var = this.P3;
            if (hy1Var != null) {
                hy1Var.n0(0);
            }
            AnimatorSet animatorSet = this.j3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.k3;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            d0();
            a6 a6Var = this.e1;
            if (a6Var != null) {
                a6Var.setVisibility(0);
            }
            c0();
            RecordCircle recordCircle2 = this.D2;
            if (recordCircle2 != null) {
                recordCircle2.N = false;
                recordCircle2.setVisibility(0);
                this.D2.setAmplitude(0.0d);
            }
            l lVar2 = this.E2;
            if (lVar2 != null) {
                lVar2.setVisibility(0);
            }
            jy1 jy1Var = this.b2;
            if (jy1Var != null) {
                jy1Var.c();
                this.b2.g();
                this.b2.setScaleX(0.0f);
                this.b2.setScaleY(0.0f);
                this.b2.e = true;
            }
            this.j3 = new AnimatorSet();
            this.Z0.setVisibility(g0() ? 4 : 0);
            SlideTextView slideTextView = this.a2;
            if (slideTextView != null) {
                slideTextView.setVisibility(g0() ? 4 : 0);
            }
            jy1 jy1Var2 = this.b2;
            if (jy1Var2 != null) {
                jy1Var2.d(g0());
            }
            this.Z0.setTranslationX(gl.L(20.0f));
            this.Z0.setAlpha(0.0f);
            byte b2 = this.M6;
            SlideTextView slideTextView2 = this.a2;
            if (b2 != 3) {
                slideTextView2.setTranslationX(gl.L(20.0f));
                this.a2.setAlpha(0.0f);
                this.a2.setCancelToProgress(0.0f);
                this.a2.a();
                this.a2.setEnabled(true);
            } else {
                slideTextView2.setTranslationX(0.0f);
                this.a2.setAlpha(0.0f);
                this.a2.setCancelToProgress(1.0f);
                this.a2.setEnabled(true);
            }
            this.D2.f(this.M6 == 3);
            this.a3 = false;
            U0();
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.R0, this.O4, 0.0f), ObjectAnimator.ofFloat(this.R0, this.Q4, 0.0f), ObjectAnimator.ofFloat(this.b2, (Property<jy1, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.b2, (Property<jy1, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.Z0, (Property<my1, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.Z0, (Property<my1, Float>) property2, 1.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.a2, (Property<SlideTextView, Float>) property, 0.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.a2, (Property<SlideTextView, Float>) property2, 1.0f));
            l lVar3 = this.E2;
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
            animatorSet4.playTogether(ObjectAnimator.ofFloat(this.F0, (Property<ex1, Float>) property2, g0() ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.f1, (Property<cw1, Float>) property2, 1.0f));
            if (!g0()) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.F0, this.S4, gl.L(20.0f)));
            }
            if (z7) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.i1, (Property<i29, Float>) property2, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.h1, (Property<ry8, Float>) property2, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.h1, (Property<ry8, Float>) property3, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.h1, (Property<ry8, Float>) property4, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.g1, (Property<scc, Float>) property2, 0.0f));
            }
            if (this.z2 != null) {
                animatorSet4.playTogether(n(gl.L(30.0f)), ObjectAnimator.ofFloat(this.z2, (Property<pw1, Float>) property2, 0.0f));
            }
            pkb pkbVar = this.f2;
            if (pkbVar != null) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(pkbVar, this.R4, gl.L(30.0f)), ObjectAnimator.ofFloat(this.f2, this.P4, 0.0f));
                ViewPropertyAnimator viewPropertyAnimator = this.g2;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    this.g2 = null;
                }
                gw1 gw1Var = this.h2;
                this.l2 = 0.0f;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(gw1Var, (Property<gw1, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.h2, (Property<gw1, Float>) property3, 0.5f), ObjectAnimator.ofFloat(this.h2, (Property<gw1, Float>) property4, 0.5f));
            }
            dz1 dz1Var = this.e7;
            if (dz1Var != null) {
                dz1Var.e(0, false, true);
            }
            this.j3.playTogether(animatorSet3.setDuration(150L), animatorSet4.setDuration(150L), ObjectAnimator.ofFloat(this.D2, this.k4, 1.0f).setDuration(300L));
            if (!z7) {
                this.j3.playTogether(ObjectAnimator.ofFloat(this.D2, this.l4, 1.0f).setDuration(300L));
            }
            this.j3.addListener(new g(this, z7));
            this.j3.setInterpolator(new DecelerateInterpolator());
            this.j3.start();
            this.Z0.a(this.Y1);
        } else {
            if (this.a3 && i == 3) {
                return;
            }
            PowerManager.WakeLock wakeLock = this.g3;
            if (wakeLock != null) {
                try {
                    wakeLock.release();
                    this.g3 = null;
                } catch (Exception e2) {
                    fa4.f(e2);
                }
            }
            gl.K3(this.E3);
            this.c4 = false;
            if (!this.m3) {
                this.M6 = i;
                return;
            }
            oy1 oy1Var3 = oy1Var;
            this.S.b().G4(this.G3, getThreadMessageId());
            this.m3 = false;
            wx1 wx1Var2 = this.V0;
            if (wx1Var2 != null) {
                wx1Var2.setEnabled(true);
            }
            AnimatorSet animatorSet5 = this.j3;
            if (animatorSet5 != null) {
                z2 = animatorSet5.isRunning();
                mw1 mw1Var = this.c1;
                if (mw1Var != null) {
                    mw1Var.setScaleX(1.0f);
                    this.c1.setScaleY(1.0f);
                }
                this.j3.removeAllListeners();
                this.j3.cancel();
            } else {
                z2 = false;
            }
            AnimatorSet animatorSet6 = this.k3;
            if (animatorSet6 != null) {
                animatorSet6.cancel();
            }
            ex1 ex1Var = this.F0;
            if (ex1Var != null) {
                ex1Var.setVisibility(0);
            }
            this.j3 = new AnimatorSet();
            if (z2) {
                c = '\t';
            } else if (i == 4) {
                c = '\t';
            } else {
                if (i == 3) {
                    a0();
                    c0();
                    s(z);
                    SlideTextView slideTextView3 = this.a2;
                    if (slideTextView3 != null) {
                        slideTextView3.setEnabled(false);
                    }
                    if (this.d1) {
                        i29 i29Var = this.i1;
                        if (i29Var != null) {
                            i29Var.setVisibility(8);
                        }
                        cw1 cw1Var = this.f1;
                        if (cw1Var != null) {
                            cw1Var.setAlpha(1.0f);
                            this.f1.setVisibility(0);
                        }
                        ry8 ry8Var = this.h1;
                        if (ry8Var != null) {
                            ry8Var.setProgress(0.0f);
                            this.h1.i();
                        }
                        f3 = 1.0f;
                        c7 = 7;
                    } else {
                        scc sccVar = this.g1;
                        if (sccVar != null) {
                            sccVar.setVisibility(8);
                            U0();
                        }
                        cw1 cw1Var2 = this.f1;
                        if (cw1Var2 != null) {
                            i8 = 0;
                            cw1Var2.setVisibility(0);
                            f3 = 1.0f;
                            c7 = 7;
                            this.f1.setAlpha(1.0f);
                        } else {
                            f3 = 1.0f;
                            i8 = 0;
                            c7 = 7;
                        }
                        i29 i29Var2 = this.i1;
                        if (i29Var2 != null) {
                            i29Var2.setVisibility(i8);
                            this.i1.setAlpha(0.0f);
                        }
                    }
                    this.h5 = true;
                    this.c5 = f3;
                    this.a5 = this.Z4;
                    this.Y4 = f3;
                    SlideTextView slideTextView4 = this.a2;
                    if (slideTextView4 != null) {
                        slideTextView4.setCancelToProgress(f3);
                    }
                    l lVar4 = this.E2;
                    if (lVar4 != null) {
                        lVar4.invalidate();
                    }
                    ry8 ry8Var2 = this.h1;
                    if (ry8Var2 != null) {
                        ry8Var2.setAlpha(0.0f);
                        this.h1.setScaleX(0.0f);
                        this.h1.setScaleY(0.0f);
                        this.h1.setProgress(0.0f);
                        this.h1.i();
                    }
                    if (this.d1 || this.Y5) {
                        c8 = '\t';
                        b = 10;
                        this.g1.setVisibility(0);
                        viewGroup = null;
                        layoutParams = null;
                    } else {
                        viewGroup = (ViewGroup) this.f1.getParent();
                        layoutParams = this.f1.getLayoutParams();
                        viewGroup.removeView(this.f1);
                        c8 = '\t';
                        b = 10;
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(viewGroup.getMeasuredWidth() - (this.P2 == null ? b00.c(44.0f, this.K0.l(), 0) : 0), gl.L(44.0f));
                        layoutParams2.gravity = 80;
                        layoutParams2.leftMargin = gl.L(7.0f);
                        layoutParams2.rightMargin = gl.L(7.0f);
                        this.c2.addView(this.f1, layoutParams2);
                        this.g1.setVisibility(8);
                    }
                    U0();
                    AnimatorSet animatorSet7 = new AnimatorSet();
                    if (z) {
                        this.i1.setAllowDraw(false);
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new pv1(this, (byte) 6));
                        ofFloat.addListener(new h(this));
                        oy1 oy1Var4 = oy1Var3;
                        ofFloat.setDuration(this.d1 ? 490L : this.K1 ? 560L : 580L);
                        if (this.K1 && !this.d1) {
                            ofFloat.setInterpolator(new LinearInterpolator());
                        }
                        AnimatorSet animatorSet8 = new AnimatorSet();
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.b2, (Property<jy1, Float>) property4, 0.0f);
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.b2, (Property<jy1, Float>) property3, 0.0f);
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.Z0, (Property<my1, Float>) property2, 0.0f);
                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.Z0, (Property<my1, Float>) property, -gl.L(20.0f));
                        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.a2, (Property<SlideTextView, Float>) property2, 0.0f);
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.h1, (Property<ry8, Float>) property2, 1.0f);
                        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.h1, (Property<ry8, Float>) property4, 1.0f);
                        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.h1, (Property<ry8, Float>) property3, 1.0f);
                        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this.R0, this.O4, 0.0f);
                        ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(this.R0, this.Q4, 0.0f);
                        ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(this.F0, (Property<ex1, Float>) property2, 0.0f);
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
                        animatorArr[c8] = ofFloat11;
                        animatorArr[b] = ofFloat12;
                        animatorSet8.playTogether(animatorArr);
                        ry8 ry8Var3 = this.h1;
                        if (ry8Var3 != null) {
                            ry8Var3.setAlpha(0.0f);
                            this.h1.setScaleX(0.0f);
                            this.h1.setScaleY(0.0f);
                        }
                        if (this.c1 != null) {
                            i9 = 1;
                            animatorSet8.playTogether(ObjectAnimator.ofFloat(this.a1, (Property<a, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.a1, (Property<a, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.a1, (Property<a, Float>) property4, 1.0f));
                            mw1 mw1Var2 = this.c1;
                            if (this.d1) {
                                oy1Var4 = oy1Var2;
                            }
                            mw1Var2.j(oy1Var4, true);
                        } else {
                            i9 = 1;
                        }
                        ep0 ep0Var2 = this.m0;
                        if (ep0Var2 != null) {
                            float[] fArr = new float[i9];
                            fArr[0] = 0.0f;
                            ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(ep0Var2, (Property<ep0, Float>) property2, fArr);
                            ep0 ep0Var3 = this.m0;
                            float[] fArr2 = new float[i9];
                            fArr2[0] = 0.0f;
                            ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(ep0Var3, (Property<ep0, Float>) property3, fArr2);
                            ep0 ep0Var4 = this.m0;
                            float[] fArr3 = new float[i9];
                            fArr3[0] = 0.0f;
                            ObjectAnimator ofFloat15 = ObjectAnimator.ofFloat(ep0Var4, (Property<ep0, Float>) property4, fArr3);
                            Animator[] animatorArr2 = new Animator[3];
                            animatorArr2[0] = ofFloat13;
                            animatorArr2[i9] = ofFloat14;
                            animatorArr2[2] = ofFloat15;
                            animatorSet8.playTogether(animatorArr2);
                        }
                        animatorSet8.addListener(new aw1(this, b));
                        boolean z8 = this.K1 && !this.d1;
                        animatorSet8.setDuration(z8 ? 120L : 150L);
                        animatorSet8.setStartDelay(z8 ? 0L : 150L);
                        if (this.d1) {
                            this.g1.setAlpha(0.0f);
                            c9 = 1;
                            c10 = 0;
                            animatorSet7.playTogether(ObjectAnimator.ofFloat(this.g1, (Property<scc, Float>) property2, 1.0f));
                            animatorSet7.setDuration(150L);
                            animatorSet7.setStartDelay(430L);
                        } else {
                            c9 = 1;
                            c10 = 0;
                        }
                        AnimatorSet animatorSet9 = this.j3;
                        Animator[] animatorArr3 = new Animator[3];
                        animatorArr3[c10] = animatorSet8;
                        animatorArr3[c9] = ofFloat;
                        animatorArr3[2] = animatorSet7;
                        animatorSet9.playTogether(animatorArr3);
                        this.j3.addListener(new i8(this, viewGroup, layoutParams, (byte) 2));
                    } else {
                        d0();
                        this.k4.set(this.D2, Float.valueOf(1.0f));
                        this.D2.setTransformToSeekbar(1.0f);
                        if (!this.d1) {
                            float f5 = this.e5;
                            if (f5 != 0.0f && this.i1 != null) {
                                float interpolation = s33.j.getInterpolation(Math.max(0.0f, ((f5 - 0.38f) - 0.25f) / 0.37f));
                                i29 i29Var3 = this.i1;
                                if (this.K1) {
                                    interpolation = 1.0f;
                                }
                                i29Var3.setAlpha(interpolation);
                                this.i1.invalidate();
                            }
                        }
                        this.b2.setScaleY(0.0f);
                        this.b2.setScaleX(0.0f);
                        this.Z0.setAlpha(0.0f);
                        this.Z0.setTranslationX(-gl.L(20.0f));
                        this.a2.setAlpha(0.0f);
                        this.h1.setAlpha(1.0f);
                        this.h1.setScaleY(1.0f);
                        this.h1.setScaleX(1.0f);
                        this.O4.set(this.R0, valueOf);
                        this.Q4.set(this.R0, valueOf);
                        this.F0.setAlpha(0.0f);
                        mw1 mw1Var3 = this.c1;
                        if (mw1Var3 != null) {
                            if (this.d1) {
                                oy1Var3 = oy1Var2;
                            }
                            mw1Var3.j(oy1Var3, z);
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
                            this.c2.removeView(this.f1);
                            viewGroup.addView(this.f1, layoutParams);
                        }
                        this.f1.setAlpha(1.0f);
                        this.i1.setAlpha(1.0f);
                        this.h = 0.0f;
                        this.n = 0.0f;
                        l2();
                        U0();
                    }
                } else {
                    oy1 oy1Var5 = oy1Var3;
                    if (i == 2 || i == 5) {
                        mw1 mw1Var4 = this.c1;
                        if (mw1Var4 != null) {
                            mw1Var4.setVisibility(0);
                        }
                        this.a3 = true;
                        U0();
                        ValueAnimator b0 = b0();
                        AnimatorSet animatorSet10 = new AnimatorSet();
                        if (b0 == null) {
                            c3 = 0;
                            valueAnimator = b0;
                            i4 = 1;
                            animatorSet10.playTogether(ObjectAnimator.ofFloat(this.R0, this.O4, 1.0f), ObjectAnimator.ofFloat(this.R0, this.Q4, this.B0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.b2, (Property<jy1, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.b2, (Property<jy1, Float>) property3, 0.0f));
                        } else {
                            valueAnimator = b0;
                            i4 = 1;
                            c3 = 0;
                        }
                        l lVar5 = this.E2;
                        int i10 = i4;
                        if (lVar5 != null) {
                            float[] fArr4 = new float[i10];
                            fArr4[c3] = 0.0f;
                            ObjectAnimator ofFloat16 = ObjectAnimator.ofFloat(lVar5, (Property<l, Float>) property2, fArr4);
                            ofFloat16.setDuration(160L);
                            ofFloat16.setInterpolator(s33.g);
                            AnimatorSet animatorSet11 = this.j3;
                            Animator[] animatorArr4 = new Animator[i10];
                            animatorArr4[c3] = ofFloat16;
                            animatorSet11.playTogether(animatorArr4);
                            this.E2.e();
                        }
                        ep0 ep0Var6 = this.m0;
                        if (ep0Var6 != null) {
                            float[] fArr5 = new float[i10];
                            fArr5[c3] = 1.0f;
                            ObjectAnimator ofFloat17 = ObjectAnimator.ofFloat(ep0Var6, (Property<ep0, Float>) property4, fArr5);
                            ep0 ep0Var7 = this.m0;
                            float[] fArr6 = new float[i10];
                            fArr6[c3] = 1.0f;
                            ObjectAnimator ofFloat18 = ObjectAnimator.ofFloat(ep0Var7, (Property<ep0, Float>) property3, fArr6);
                            ep0 ep0Var8 = this.m0;
                            float[] fArr7 = new float[i10];
                            fArr7[c3] = 1.0f;
                            ObjectAnimator ofFloat19 = ObjectAnimator.ofFloat(ep0Var8, (Property<ep0, Float>) property2, fArr7);
                            Animator[] animatorArr5 = new Animator[3];
                            animatorArr5[c3] = ofFloat17;
                            animatorArr5[i10] = ofFloat18;
                            animatorArr5[2] = ofFloat19;
                            animatorSet10.playTogether(animatorArr5);
                        }
                        AnimatorSet animatorSet12 = new AnimatorSet();
                        if (valueAnimator != null) {
                            SlideTextView slideTextView5 = this.a2;
                            float[] fArr8 = new float[i10];
                            fArr8[c3] = 0.0f;
                            ObjectAnimator ofFloat20 = ObjectAnimator.ofFloat(slideTextView5, (Property<SlideTextView, Float>) property2, fArr8);
                            Animator[] animatorArr6 = new Animator[i10];
                            animatorArr6[c3] = ofFloat20;
                            animatorSet12.playTogether(animatorArr6);
                        } else {
                            my1 my1Var3 = this.Z0;
                            float[] fArr9 = new float[i10];
                            fArr9[c3] = 0.0f;
                            ObjectAnimator ofFloat21 = ObjectAnimator.ofFloat(my1Var3, (Property<my1, Float>) property2, fArr9);
                            my1 my1Var4 = this.Z0;
                            float[] fArr10 = new float[i10];
                            fArr10[c3] = -gl.L(20.0f);
                            ObjectAnimator ofFloat22 = ObjectAnimator.ofFloat(my1Var4, (Property<my1, Float>) property, fArr10);
                            SlideTextView slideTextView6 = this.a2;
                            float[] fArr11 = new float[i10];
                            fArr11[c3] = 0.0f;
                            ObjectAnimator ofFloat23 = ObjectAnimator.ofFloat(slideTextView6, (Property<SlideTextView, Float>) property2, fArr11);
                            SlideTextView slideTextView7 = this.a2;
                            float[] fArr12 = new float[1];
                            fArr12[c3] = -gl.L(20.0f);
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
                            gw1 gw1Var2 = this.h2;
                            if (gw1Var2 != null && gw1Var2.getVisibility() == 0) {
                                this.h2.setScaleX(0.5f);
                                this.h2.setScaleY(0.5f);
                            }
                            gw1 gw1Var3 = this.n2;
                            if (gw1Var3 != null && gw1Var3.getVisibility() == 0) {
                                this.n2.setScaleX(0.0f);
                                this.n2.setScaleY(0.0f);
                            }
                            animatorSet10.playTogether(ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f), ObjectAnimator.ofFloat(this.a1, (Property<a, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.a1, (Property<a, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.a1, (Property<a, Float>) property2, 1.0f));
                            if (this.f2 != null) {
                                ViewPropertyAnimator viewPropertyAnimator2 = this.g2;
                                if (viewPropertyAnimator2 != null) {
                                    viewPropertyAnimator2.cancel();
                                    this.g2 = null;
                                }
                                z5 = false;
                                animatorSet10.playTogether(ObjectAnimator.ofFloat(this.f2, this.P4, 1.0f), ObjectAnimator.ofFloat(this.f2, this.R4, 0.0f));
                                gw1 gw1Var4 = this.h2;
                                this.l2 = 1.0f;
                                r262 = true;
                                animatorSet10.playTogether(ObjectAnimator.ofFloat(gw1Var4, (Property<gw1, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.h2, (Property<gw1, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.h2, (Property<gw1, Float>) property4, 1.0f));
                            } else {
                                r262 = true;
                                z5 = false;
                            }
                            dz1 dz1Var2 = this.e7;
                            int i11 = r262;
                            boolean z9 = z5;
                            if (dz1Var2 != null) {
                                dz1Var2.e(z9 ? 1 : 0, z9, i11);
                            }
                            gw1 gw1Var5 = this.n2;
                            if (gw1Var5 != null) {
                                float[] fArr13 = new float[i11];
                                fArr13[z9 ? 1 : 0] = 1.0f;
                                ObjectAnimator ofFloat25 = ObjectAnimator.ofFloat(gw1Var5, (Property<gw1, Float>) property3, fArr13);
                                gw1 gw1Var6 = this.n2;
                                float[] fArr14 = new float[i11];
                                fArr14[z9 ? 1 : 0] = 1.0f;
                                ObjectAnimator ofFloat26 = ObjectAnimator.ofFloat(gw1Var6, (Property<gw1, Float>) property4, fArr14);
                                char c11 = z9 ? 1 : 0;
                                Animator[] animatorArr8 = new Animator[2];
                                animatorArr8[c11] = ofFloat25;
                                animatorArr8[i11] = ofFloat26;
                                animatorSet10.playTogether(animatorArr8);
                                c6 = c11;
                            } else {
                                c6 = z9 ? 1 : 0;
                            }
                            if (this.c1 != null) {
                                a aVar = this.a1;
                                float[] fArr15 = new float[i11];
                                fArr15[c6] = 1.0f;
                                ObjectAnimator ofFloat27 = ObjectAnimator.ofFloat(aVar, (Property<a, Float>) property2, fArr15);
                                Animator[] animatorArr9 = new Animator[i11];
                                animatorArr9[c6] = ofFloat27;
                                animatorSet10.playTogether(animatorArr9);
                                a aVar2 = this.a1;
                                float[] fArr16 = new float[i11];
                                fArr16[c6] = 1.0f;
                                ObjectAnimator ofFloat28 = ObjectAnimator.ofFloat(aVar2, (Property<a, Float>) property3, fArr16);
                                Animator[] animatorArr10 = new Animator[i11];
                                animatorArr10[c6] = ofFloat28;
                                animatorSet10.playTogether(animatorArr10);
                                a aVar3 = this.a1;
                                float[] fArr17 = new float[i11];
                                fArr17[c6] = 1.0f;
                                ObjectAnimator ofFloat29 = ObjectAnimator.ofFloat(aVar3, (Property<a, Float>) property4, fArr17);
                                Animator[] animatorArr11 = new Animator[i11];
                                animatorArr11[c6] = ofFloat29;
                                animatorSet10.playTogether(animatorArr11);
                                mw1 mw1Var5 = this.c1;
                                if (this.d1) {
                                    oy1Var5 = oy1Var2;
                                }
                                mw1Var5.j(oy1Var5, i11);
                            }
                            pw1 pw1Var = this.z2;
                            if (pw1Var != null) {
                                float[] fArr18 = new float[i11];
                                fArr18[0] = 1.0f;
                                ObjectAnimator ofFloat30 = ObjectAnimator.ofFloat(pw1Var, (Property<pw1, Float>) property2, fArr18);
                                ValueAnimator n = n(0.0f);
                                Animator[] animatorArr12 = new Animator[2];
                                animatorArr12[0] = ofFloat30;
                                animatorArr12[i11] = n;
                                animatorSet10.playTogether(animatorArr12);
                            }
                            j2 = 150;
                            j = 110;
                        } else {
                            AnimatorSet animatorSet13 = new AnimatorSet();
                            if (i != 5) {
                                animatorSet13.playTogether(ObjectAnimator.ofFloat(this.a1, (Property<a, Float>) property2, 1.0f));
                            }
                            if (this.f2 != null) {
                                ViewPropertyAnimator viewPropertyAnimator3 = this.g2;
                                if (viewPropertyAnimator3 != null) {
                                    viewPropertyAnimator3.cancel();
                                    this.g2 = null;
                                }
                                z4 = false;
                                r26 = true;
                                animatorSet13.playTogether(ObjectAnimator.ofFloat(this.f2, this.R4, 0.0f), ObjectAnimator.ofFloat(this.f2, this.P4, 1.0f));
                                gw1 gw1Var7 = this.h2;
                                this.l2 = 1.0f;
                                animatorSet13.playTogether(ObjectAnimator.ofFloat(gw1Var7, (Property<gw1, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.h2, (Property<gw1, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.h2, (Property<gw1, Float>) property4, 1.0f));
                            } else {
                                r26 = true;
                                z4 = false;
                            }
                            dz1 dz1Var3 = this.e7;
                            int i12 = r26;
                            boolean z10 = z4;
                            if (dz1Var3 != null) {
                                dz1Var3.e(z10 ? 1 : 0, z10, i12);
                            }
                            pw1 pw1Var2 = this.z2;
                            if (pw1Var2 != null) {
                                float[] fArr19 = new float[i12];
                                fArr19[z10 ? 1 : 0] = 1.0f;
                                ObjectAnimator ofFloat31 = ObjectAnimator.ofFloat(pw1Var2, (Property<pw1, Float>) property2, fArr19);
                                ValueAnimator n2 = n(0.0f);
                                Animator[] animatorArr13 = new Animator[2];
                                animatorArr13[z10 ? 1 : 0] = ofFloat31;
                                animatorArr13[i12] = n2;
                                animatorSet13.playTogether(animatorArr13);
                            }
                            animatorSet13.setDuration(150L);
                            j = 110;
                            animatorSet13.setStartDelay(110L);
                            animatorSet13.addListener(new aw1(this, (byte) 11));
                            AnimatorSet animatorSet14 = this.j3;
                            Animator[] animatorArr14 = new Animator[i12];
                            animatorArr14[0] = animatorSet13;
                            animatorSet14.playTogether(animatorArr14);
                            j2 = 150;
                        }
                        animatorSet10.setDuration(j2);
                        animatorSet10.setStartDelay(this.D1 ? 0L : 700L);
                        if (!this.D1) {
                            j = valueAnimator != null ? 140L : 200L;
                        }
                        animatorSet12.setDuration(j);
                        animatorSet12.setStartDelay((this.D1 || valueAnimator != null) ? 0L : 200L);
                        if (valueAnimator == null || (my1Var2 = this.Z0) == null) {
                            i5 = 1;
                            c4 = 0;
                        } else {
                            my1Var2.animate().cancel();
                            this.Z0.setPivotX(0.0f);
                            this.Z0.setPivotY(r5.getHeight() / 2.0f);
                            AnimatorSet animatorSet15 = new AnimatorSet();
                            i5 = 1;
                            c4 = 0;
                            ObjectAnimator ofFloat32 = ObjectAnimator.ofFloat(this.Z0, (Property<my1, Float>) property2, 0.0f);
                            my1 my1Var5 = this.Z0;
                            animatorSet15.playTogether(ofFloat32, ObjectAnimator.ofFloat(my1Var5, (Property<my1, Float>) property, my1Var5.getTranslationX() - gl.L(6.0f)), ObjectAnimator.ofFloat(this.Z0, (Property<my1, Float>) property3, 0.94f), ObjectAnimator.ofFloat(this.Z0, (Property<my1, Float>) property4, 0.94f));
                            animatorSet15.setDuration(140L);
                            animatorSet15.setInterpolator(s33.g);
                            this.j3.playTogether(animatorSet15);
                        }
                        this.H = 0.0f;
                        p2();
                        ex1 ex1Var2 = this.F0;
                        float[] fArr20 = new float[i5];
                        fArr20[c4] = 1.0f;
                        ObjectAnimator ofFloat33 = ObjectAnimator.ofFloat(ex1Var2, (Property<ex1, Float>) property2, fArr20);
                        ofFloat33.setStartDelay(this.D1 ? 110L : this.s == 1.0f ? 300L : 700L);
                        ofFloat33.setDuration(200L);
                        if (valueAnimator != null) {
                            ofFloat33.setStartDelay((long) Math.max(300.0f, this.L5 - 120.0f));
                            ofFloat33.setDuration(320L);
                            ofFloat33.setInterpolator(s33.g);
                            i6 = 1;
                            c5 = 0;
                            this.j3.playTogether(valueAnimator);
                            AnimatorSet F2 = F2();
                            if (F2 != null) {
                                this.j3.playTogether(F2);
                            }
                        } else {
                            i6 = 1;
                            c5 = 0;
                        }
                        AnimatorSet animatorSet16 = this.j3;
                        float[] fArr21 = new float[i6];
                        fArr21[c5] = this.Z4;
                        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "lockAnimatedTranslation", fArr21).setDuration(200L);
                        Animator[] animatorArr15 = new Animator[4];
                        animatorArr15[c5] = animatorSet10;
                        animatorArr15[i6] = animatorSet12;
                        animatorArr15[2] = ofFloat33;
                        animatorArr15[3] = duration;
                        animatorSet16.playTogether(animatorArr15);
                        if (i == 5) {
                            this.D2.a();
                            float[] fArr22 = new float[i6];
                            fArr22[c5] = 1.0f;
                            ObjectAnimator duration2 = ObjectAnimator.ofFloat(this, "slideToCancelProgress", fArr22).setDuration(200L);
                            duration2.setInterpolator(s33.j);
                            AnimatorSet animatorSet17 = this.j3;
                            Animator[] animatorArr16 = new Animator[i6];
                            animatorArr16[c5] = duration2;
                            animatorSet17.playTogether(animatorArr16);
                        } else {
                            float[] fArr23 = new float[i6];
                            fArr23[c5] = 1.0f;
                            ObjectAnimator ofFloat34 = ObjectAnimator.ofFloat(this, "exitTransition", fArr23);
                            ofFloat34.setDuration(this.D1 ? 280L : 360L);
                            ofFloat34.setStartDelay(this.D1 ? 0L : 490L);
                            this.j3.playTogether(ofFloat34);
                        }
                        jy1 jy1Var3 = this.b2;
                        if (jy1Var3 != null) {
                            if (this.D1) {
                                jy1Var3.setScaleX(0.0f);
                                this.b2.setScaleY(0.0f);
                            } else if (valueAnimator == null) {
                                jy1Var3.b();
                            }
                        }
                    } else {
                        mw1 mw1Var6 = this.c1;
                        if (mw1Var6 != null) {
                            mw1Var6.setVisibility(0);
                        }
                        AnimatorSet animatorSet18 = new AnimatorSet();
                        animatorSet18.playTogether(ObjectAnimator.ofFloat(this.R0, this.O4, 1.0f), ObjectAnimator.ofFloat(this.R0, this.Q4, this.B0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.b2, (Property<jy1, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.b2, (Property<jy1, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.a1, (Property<a, Float>) property2, 1.0f));
                        l lVar6 = this.E2;
                        if (lVar6 != null) {
                            animatorSet18.playTogether(ObjectAnimator.ofFloat(lVar6, (Property<l, Float>) property2, 0.0f));
                            this.E2.e();
                        }
                        ep0 ep0Var9 = this.m0;
                        if (ep0Var9 != null) {
                            f2 = 1.0f;
                            animatorSet18.playTogether(ObjectAnimator.ofFloat(ep0Var9, (Property<ep0, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.m0, (Property<ep0, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.m0, (Property<ep0, Float>) property2, 1.0f));
                        } else {
                            f2 = 1.0f;
                        }
                        mw1 mw1Var7 = this.c1;
                        if (mw1Var7 != null) {
                            mw1Var7.setScaleX(f2);
                            this.c1.setScaleY(f2);
                            animatorSet18.playTogether(ObjectAnimator.ofFloat(this.a1, (Property<a, Float>) property2, f2));
                            mw1 mw1Var8 = this.c1;
                            if (this.d1) {
                                oy1Var5 = oy1Var2;
                            }
                            mw1Var8.j(oy1Var5, true);
                        }
                        if (this.f2 != null) {
                            ViewPropertyAnimator viewPropertyAnimator4 = this.g2;
                            if (viewPropertyAnimator4 != null) {
                                viewPropertyAnimator4.cancel();
                                this.g2 = null;
                            }
                            this.y = 0.0f;
                            g2();
                            i7 = 1;
                            r12 = 0;
                            animatorSet18.playTogether(ObjectAnimator.ofFloat(this.f2, this.P4, 1.0f));
                            gw1 gw1Var8 = this.h2;
                            this.l2 = 1.0f;
                            animatorSet18.playTogether(ObjectAnimator.ofFloat(gw1Var8, (Property<gw1, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.h2, (Property<gw1, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.h2, (Property<gw1, Float>) property4, 1.0f));
                        } else {
                            i7 = 1;
                            r12 = 0;
                        }
                        ?? r3 = this.e7;
                        if (r3 != 0) {
                            r3.e(r12, r12, i7);
                        }
                        pw1 pw1Var3 = this.z2;
                        if (pw1Var3 != null) {
                            float[] fArr24 = new float[i7];
                            fArr24[r12] = 1.0f;
                            ObjectAnimator ofFloat35 = ObjectAnimator.ofFloat(pw1Var3, (Property<pw1, Float>) property2, fArr24);
                            ValueAnimator n3 = n(0.0f);
                            Animator[] animatorArr17 = new Animator[2];
                            animatorArr17[r12] = ofFloat35;
                            animatorArr17[i7] = n3;
                            animatorSet18.playTogether(animatorArr17);
                        }
                        animatorSet18.setDuration(150L);
                        animatorSet18.setStartDelay(200L);
                        AnimatorSet animatorSet19 = new AnimatorSet();
                        my1 my1Var6 = this.Z0;
                        float[] fArr25 = new float[i7];
                        fArr25[r12] = 0.0f;
                        ObjectAnimator ofFloat36 = ObjectAnimator.ofFloat(my1Var6, (Property<my1, Float>) property2, fArr25);
                        my1 my1Var7 = this.Z0;
                        float[] fArr26 = new float[i7];
                        fArr26[r12] = gl.L(40.0f);
                        ObjectAnimator ofFloat37 = ObjectAnimator.ofFloat(my1Var7, (Property<my1, Float>) property, fArr26);
                        SlideTextView slideTextView8 = this.a2;
                        float[] fArr27 = new float[i7];
                        fArr27[r12] = 0.0f;
                        ObjectAnimator ofFloat38 = ObjectAnimator.ofFloat(slideTextView8, (Property<SlideTextView, Float>) property2, fArr27);
                        SlideTextView slideTextView9 = this.a2;
                        float[] fArr28 = new float[i7];
                        fArr28[r12] = gl.L(40.0f);
                        ObjectAnimator ofFloat39 = ObjectAnimator.ofFloat(slideTextView9, (Property<SlideTextView, Float>) property, fArr28);
                        Animator[] animatorArr18 = new Animator[4];
                        animatorArr18[r12] = ofFloat36;
                        animatorArr18[i7] = ofFloat37;
                        animatorArr18[2] = ofFloat38;
                        animatorArr18[3] = ofFloat39;
                        animatorSet19.playTogether(animatorArr18);
                        animatorSet19.setDuration(150L);
                        float[] fArr29 = new float[i7];
                        fArr29[r12] = 1.0f;
                        ObjectAnimator ofFloat40 = ObjectAnimator.ofFloat(this, "exitTransition", fArr29);
                        ofFloat40.setDuration(this.h0 ? 220L : 360L);
                        this.H = 0.0f;
                        p2();
                        ObjectAnimator ofFloat41 = ObjectAnimator.ofFloat(this.F0, (Property<ex1, Float>) property2, 1.0f);
                        ofFloat41.setStartDelay(this.s == 1.0f ? 150L : 450L);
                        ofFloat41.setDuration(200L);
                        this.j3.playTogether(animatorSet18, animatorSet19, ofFloat41, ofFloat40);
                    }
                }
                this.j3.addListener(new j(this, i));
                this.j3.start();
                my1Var = this.Z0;
                if (my1Var != null) {
                    my1Var.b();
                }
            }
            float f6 = 0.5f;
            mw1 mw1Var9 = this.c1;
            if (mw1Var9 != null) {
                mw1Var9.setVisibility(0);
            }
            AnimatorSet animatorSet20 = this.j3;
            ObjectAnimator ofFloat42 = ObjectAnimator.ofFloat(this.R0, this.O4, 1.0f);
            ew1 ew1Var = this.R0;
            bw1 bw1Var = this.Q4;
            if (!this.B0) {
                f6 = 1.0f;
            }
            ObjectAnimator ofFloat43 = ObjectAnimator.ofFloat(ew1Var, bw1Var, f6);
            ObjectAnimator ofFloat44 = ObjectAnimator.ofFloat(this.b2, (Property<jy1, Float>) property4, 0.0f);
            ObjectAnimator ofFloat45 = ObjectAnimator.ofFloat(this.b2, (Property<jy1, Float>) property3, 0.0f);
            ObjectAnimator ofFloat46 = ObjectAnimator.ofFloat(this.D2, this.k4, 0.0f);
            ObjectAnimator ofFloat47 = ObjectAnimator.ofFloat(this.D2, this.l4, 0.0f);
            ObjectAnimator ofFloat48 = ObjectAnimator.ofFloat(this.a1, (Property<a, Float>) property2, 1.0f);
            ObjectAnimator ofFloat49 = ObjectAnimator.ofFloat(this.Z0, (Property<my1, Float>) property2, 0.0f);
            ObjectAnimator ofFloat50 = ObjectAnimator.ofFloat(this.a1, (Property<a, Float>) property2, 1.0f);
            ObjectAnimator ofFloat51 = ObjectAnimator.ofFloat(this.F0, (Property<ex1, Float>) property2, 1.0f);
            ObjectAnimator ofFloat52 = ObjectAnimator.ofFloat(this.F0, this.S4, 0.0f);
            ObjectAnimator ofFloat53 = ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f);
            Animator[] animatorArr19 = new Animator[12];
            animatorArr19[0] = ofFloat42;
            animatorArr19[1] = ofFloat43;
            animatorArr19[2] = ofFloat44;
            animatorArr19[3] = ofFloat45;
            animatorArr19[4] = ofFloat46;
            animatorArr19[5] = ofFloat47;
            animatorArr19[6] = ofFloat48;
            animatorArr19[7] = ofFloat49;
            animatorArr19[8] = ofFloat50;
            animatorArr19[c] = ofFloat51;
            animatorArr19[10] = ofFloat52;
            animatorArr19[11] = ofFloat53;
            animatorSet20.playTogether(animatorArr19);
            l lVar7 = this.E2;
            if (lVar7 != null) {
                i2 = 1;
                c2 = 0;
                this.j3.playTogether(ObjectAnimator.ofFloat(lVar7, (Property<l, Float>) property2, 0.0f));
                this.E2.e();
            } else {
                i2 = 1;
                c2 = 0;
            }
            ep0 ep0Var10 = this.m0;
            if (ep0Var10 != null) {
                AnimatorSet animatorSet21 = this.j3;
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
            mw1 mw1Var10 = this.c1;
            if (mw1Var10 != null) {
                mw1Var10.setScaleX(f);
                this.c1.setScaleY(f);
                i3 = 1;
                this.j3.playTogether(ObjectAnimator.ofFloat(this.a1, (Property<a, Float>) property2, f));
                this.c1.j(this.d1 ? oy1Var2 : oy1Var3, true);
            } else {
                i3 = 1;
            }
            if (this.z2 != null) {
                AnimatorSet animatorSet22 = this.j3;
                ValueAnimator n4 = n(0.0f);
                pw1 pw1Var4 = this.z2;
                float[] fArr33 = new float[i3];
                fArr33[0] = 1.0f;
                ObjectAnimator ofFloat57 = ObjectAnimator.ofFloat(pw1Var4, (Property<pw1, Float>) property2, fArr33);
                Animator[] animatorArr21 = new Animator[2];
                animatorArr21[0] = n4;
                animatorArr21[i3] = ofFloat57;
                animatorSet22.playTogether(animatorArr21);
            }
            if (this.f2 != null) {
                ViewPropertyAnimator viewPropertyAnimator5 = this.g2;
                if (viewPropertyAnimator5 != null) {
                    viewPropertyAnimator5.cancel();
                    this.g2 = null;
                }
                z3 = true;
                r72 = 0;
                this.j3.playTogether(ObjectAnimator.ofFloat(this.f2, this.R4, 0.0f), ObjectAnimator.ofFloat(this.f2, this.P4, 1.0f));
                AnimatorSet animatorSet23 = this.j3;
                gw1 gw1Var9 = this.h2;
                this.l2 = 1.0f;
                animatorSet23.playTogether(ObjectAnimator.ofFloat(gw1Var9, (Property<gw1, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.h2, (Property<gw1, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.h2, (Property<gw1, Float>) property4, 1.0f));
            } else {
                z3 = true;
                r72 = 0;
            }
            ?? r0 = this.e7;
            if (r0 != 0) {
                r0.e(r72, r72, z3);
            }
            this.a3 = z3;
            U0();
            this.j3.setDuration(150L);
            this.j3.addListener(new j(this, i));
            this.j3.start();
            my1Var = this.Z0;
            if (my1Var != null) {
            }
        }
        this.P3.a();
        v2(true);
        this.M6 = i;
        p0();
        if (this.l1) {
            n2(this.L6);
        }
    }

    public final void s(boolean z) {
        oy8 oy8Var;
        byte b = 1;
        boolean z2 = (this.d1 || this.i1 == null) ? false : true;
        this.Q5 = z2;
        boolean z3 = this.K1;
        jc jcVar = this.X1;
        if (z3 == z2) {
            if (!z2) {
                return;
            }
            if (this.T1 != null) {
                R1(false, false);
                K1(z);
                gl.r(jcVar);
                gl.d3(jcVar, 700L);
                return;
            }
        }
        this.K1 = z2;
        this.i1.setNewStyle(z2);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.i1.getLayoutParams();
        layoutParams.height = gl.L(32.0f);
        layoutParams.gravity = z2 ? 83 : 19;
        layoutParams.bottomMargin = z2 ? gl.L(6.0f) : 0;
        layoutParams.leftMargin = gl.L(z2 ? 45.0f : 44.0f);
        layoutParams.rightMargin = gl.L(z2 ? 5.0f : 4.0f);
        this.i1.setLayoutParams(layoutParams);
        ry8 ry8Var = this.h1;
        if (ry8Var != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ry8Var.getLayoutParams();
            layoutParams2.gravity = z2 ? 83 : 51;
            this.h1.setLayoutParams(layoutParams2);
            if (z2) {
                if (this.z5 == null) {
                    oy8 oy8Var2 = new oy8(R.raw.chat_audio_record_delete_outline, gl.L(28.0f), gl.L(28.0f), false, null);
                    this.z5 = oy8Var2;
                    oy8Var2.E(true);
                }
                oy8Var = this.z5;
            } else {
                oy8Var = this.A5;
            }
            if (oy8Var != null && this.h1.getAnimatedDrawable() != oy8Var) {
                this.h1.setAnimation(oy8Var);
                oy8Var.p0 = oy8Var != this.z5;
                s2();
                this.h1.setProgress(0.0f);
            }
        }
        this.f1.setClipChildren(!z2);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f1.getLayoutParams();
        layoutParams3.height = z2 ? -2 : gl.L(44.0f);
        this.f1.setLayoutParams(layoutParams3);
        this.f1.setMinimumHeight(z2 ? gl.L(44.0f) : 0);
        if (!z2) {
            K1(false);
            this.i1.setNewStyleDelegate(null);
            ojc ojcVar = this.T1;
            if (ojcVar != null) {
                this.f1.removeView(ojcVar);
                this.T1 = null;
                return;
            }
            return;
        }
        this.i1.setNewStyleDelegate(new tw1(this));
        if (this.T1 == null) {
            ojc ojcVar2 = new ojc(getContext(), this.L4, new iw1(this, b));
            this.T1 = ojcVar2;
            this.f1.addView(ojcVar2, nme.d(-1, -2.0f, 80, 48.0f, 0.0f, 0.0f, 0.0f));
        }
        R1(false, false);
        K1(z);
        gl.r(jcVar);
        gl.d3(jcVar, 700L);
    }

    public final boolean s0(TL_keyboard.KeyboardButtonProto keyboardButtonProto, k27 k27Var, k27 k27Var2, op1 op1Var) {
        mu1 mu1Var;
        int i;
        int i2 = 0;
        if (keyboardButtonProto != null && k27Var2 != null && ((mu1Var = this.F3) == null || mu1Var.g4 != 5)) {
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) jdb.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = (TL_keyboard.TL_inlineButtonTypeUserProfile) jdb.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class);
            TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) jdb.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class);
            TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) jdb.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class);
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) jdb.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (tL_inlineButtonTypeCopy != null) {
                gl.g(tL_inlineButtonTypeCopy.copy_text);
                u21.b0(mu1Var).i(k96.a0(null, null, 2131750872, tL_inlineButtonTypeCopy.copy_text)).k(true);
                return true;
            }
            if (keyboardButtonProto instanceof TL_keyboard.TL_keyboardButton) {
                TL_keyboard.TL_keyboardButton tL_keyboardButton = (TL_keyboard.TL_keyboardButton) keyboardButtonProto;
                if (tL_keyboardButton.type instanceof TL_keyboard.TL_buttonTypeDefault) {
                    x3a b = x3a.b(tL_keyboardButton.text, this.G3, k27Var, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                    b.K = mu1Var != null ? mu1Var.Q6() : null;
                    b.O = this.O6;
                    this.O6 = 0L;
                    this.K0.setEffect(0L);
                    z3a.B(this.R).q0(b);
                    return true;
                }
            }
            Activity activity = this.E3;
            if (tL_inlineButtonTypeUrl != null) {
                if (d01.z(tL_inlineButtonTypeUrl.url)) {
                    d01.r(activity, Uri.parse(tL_inlineButtonTypeUrl.url), true, true, op1Var);
                    return true;
                }
                ij.o0(this.F3, tL_inlineButtonTypeUrl.url, false, true, true, false, op1Var, null, this.L4);
                return true;
            }
            if (jdb.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPhone.class)) {
                mu1Var.Hb(2, k27Var2);
                return true;
            }
            if (!jdb.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class)) {
                if (jdb.b(keyboardButtonProto)) {
                    TLRPC.Message message = k27Var2.k;
                    long j = message.via_bot_id;
                    if (j == 0) {
                        j = message.from_id.user_id;
                    }
                    long j2 = j;
                    ux1 ux1Var = new ux1(this, k27Var2, j2, keyboardButtonProto, k27Var, na7.q1(this.R).V1(Long.valueOf(j)));
                    if (bue.b(this.R, j2) || na7.q1(this.R).S3.contains(Long.valueOf(j2))) {
                        ux1Var.run();
                        return true;
                    }
                    ij.n(mu1Var, na7.q1(this.R).V1(Long.valueOf(this.G3)), new de2((Object) this, (Object) ux1Var, j2, (byte) 16), null);
                    return true;
                }
                if (jdb.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    String M0 = k96.M0(2131745231, "ShareYouLocationTitle");
                    hd hdVar = alertDialog$Builder.a;
                    hdVar.S = M0;
                    hdVar.U = k96.M0(2131745233, "ShareYouLocationInfo");
                    alertDialog$Builder.j(k96.M0(2131747638, "OK"), new ie((Object) this, (Object) k27Var2, (Object) keyboardButtonProto, (byte) 17));
                    alertDialog$Builder.g(k96.M0(2131752577, "Cancel"), null);
                    mu1Var.showDialog(hdVar);
                    return true;
                }
                if (jdb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || jdb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || jdb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || jdb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
                    z3a.B(this.R).m0(true, k27Var2, keyboardButtonProto, null, null, mu1Var);
                    return true;
                }
                if (tL_inlineButtonTypeSwitchInline != null) {
                    if (!mu1Var.Ka(tL_inlineButtonTypeSwitchInline)) {
                        if (!tL_inlineButtonTypeSwitchInline.same_peer) {
                            Bundle j3 = tb4.j(1, "onlySelect", "dialogsType", true);
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
                            cj3 cj3Var = new cj3(j3);
                            cj3Var.E2 = new ie((Object) this, (Object) k27Var2, (Object) tL_inlineButtonTypeSwitchInline, (byte) 18);
                            mu1Var.presentFragment(cj3Var);
                            return true;
                        }
                        TLRPC.Message message2 = k27Var2.k;
                        long j4 = message2.from_id.user_id;
                        long j5 = message2.via_bot_id;
                        if (j5 != 0) {
                            j4 = j5;
                        }
                        TLRPC.User V1 = na7.q1(this.S.a).V1(Long.valueOf(j4));
                        if (V1 != null) {
                            setFieldText("@" + l7c.p(V1) + " " + tL_inlineButtonTypeSwitchInline.query);
                            return true;
                        }
                    }
                } else if (tL_inlineButtonTypeUserProfile != null) {
                    if (na7.q1(this.R).V1(Long.valueOf(tL_inlineButtonTypeUserProfile.user_id)) != null) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", tL_inlineButtonTypeUserProfile.user_id);
                        mu1Var.presentFragment(new ProfileActivity(bundle, null));
                        return true;
                    }
                } else if (tL_buttonTypeRequestPeer != null) {
                    TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
                    if (requestPeerType == null || k27Var2.k == null) {
                        fa4.d("button.peer_type is null");
                    } else {
                        if (!(requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot)) {
                            if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                                TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                                Boolean bool = tL_requestPeerTypeUser.bot;
                                Boolean bool2 = tL_requestPeerTypeUser.premium;
                                cv1 cv1Var = new cv1(this, k27Var2, tL_buttonTypeRequestPeer);
                                gg7 gg7Var = gg7.p2;
                                org.telegram.ui.ActionBar.d Q = LaunchActivity.Q();
                                if (Q == null || gg7.p2 != null) {
                                    return false;
                                }
                                gg7 gg7Var2 = new gg7(Q, i, bool, bool2, cv1Var);
                                gg7Var2.show();
                                gg7.p2 = gg7Var2;
                                return false;
                            }
                            Bundle j6 = tb4.j(15, "onlySelect", "dialogsType", true);
                            TLRPC.Message message3 = k27Var2.k;
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
                                fa4.g(e, true);
                            }
                            cj3 cj3Var2 = new cj3(j6);
                            cj3Var2.E2 = new cv1(this, k27Var2, tL_buttonTypeRequestPeer);
                            mu1Var.presentFragment(cj3Var2);
                            return false;
                        }
                        TLRPC.User h = getParentFragment() != null ? getParentFragment().h() : na7.q1(this.R).V1(Long.valueOf(this.G3));
                        if (h != null) {
                            a03.e(getContext(), this.R, h, (TLRPC.TL_requestPeerTypeCreateBot) tL_buttonTypeRequestPeer.peer_type, false, new au0(this, k27Var2, tL_buttonTypeRequestPeer, h), this.L4, null);
                            return false;
                        }
                    }
                }
                return true;
            }
            TL_keyboard.TL_buttonTypeRequestPoll tL_buttonTypeRequestPoll = (TL_keyboard.TL_buttonTypeRequestPoll) jdb.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class);
            Boolean valueOf = (tL_buttonTypeRequestPoll.flags & 1) != 0 ? Boolean.valueOf(tL_buttonTypeRequestPoll.quiz) : null;
            mu1Var.ca();
            x31 x31Var = mu1Var.Y1;
            if (x31Var != null) {
                x31Var.P2 = false;
                x31Var.u3.setVisibility(8);
                x31Var.C1(false, valueOf);
                return false;
            }
        }
        return false;
    }

    public final void s1(TL_iv.RichMessage richMessage) {
        mu1 mu1Var = this.F3;
        if (mu1Var != null) {
            hq6.d0(this.R).T1(mu1Var.a(), mu1Var.H5(mu1Var.F5), "", null, null, null, null, 0L, false, false, richMessage);
        }
        setRichDraftPreview(richMessage);
    }

    public final void s2() {
        int F0 = F0(bkb.Zf);
        int F02 = F0(bkb.Ie);
        int F03 = F0(bkb.Uf);
        ry8 ry8Var = this.h1;
        if (ry8Var != null) {
            ry8Var.h(F0, "Cup Red");
            this.h1.h(F0, "Box Red");
            this.h1.h(F03, "Cup Grey");
            this.h1.h(F03, "Box Grey");
            this.h1.h(F03, "Box_Grey 2");
            this.h1.h(F03, "Line 1");
            this.h1.h(F03, "Line 2");
            this.h1.h(F03, "Line 3");
            this.h1.h(F02, "Line 1 Dup");
            this.h1.h(F02, "Line 2 Dup");
            this.h1.h(F02, "Line 3 Dup");
        }
    }

    public void setAdjustPanLayoutHelper(gb gbVar) {
        this.V = gbVar;
    }

    public void setAnimatedTop(int i) {
        this.J2 = i;
    }

    public void setBotInfo(vf6 vf6Var) {
        y1(vf6Var, true);
    }

    public void setBotWebViewButtonOffsetX(float f) {
        this.R0.setTranslationX(f);
        if (this.F0 != null) {
            this.H = f;
            p2();
        }
        this.h2.setTranslationX(this.E + this.y + f);
        this.c1.setTranslationX(f);
        gw1 gw1Var = this.n2;
        if (gw1Var != null) {
            gw1Var.setTranslationX(f);
        }
    }

    public void setButtons(k27 k27Var) {
        A1(k27Var, true, true);
    }

    public void setCaption(String str) {
        ex1 ex1Var = this.F0;
        if (ex1Var != null) {
            ex1Var.setCaption(str);
            N(true);
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.T2 = chatFull;
        wx1 wx1Var = this.V0;
        if (wx1Var != null) {
            wx1Var.setChatInfo(chatFull);
        }
        ly1 ly1Var = this.G0;
        if (ly1Var != null) {
            ly1Var.b = chatFull != null && chatFull.boosts_unrestrict > 0;
            ly1Var.invalidate();
        }
        if (hc2.i0(chatFull)) {
            return;
        }
        setSlowModeTimer(chatFull.slowmode_next_send_date);
    }

    public void setComposeShadowAlpha(float f) {
        this.b6 = f;
        invalidate();
    }

    public void setCustomWindowView(View view) {
        this.i6 = view;
        this.F0.setWindowView(view);
    }

    public void setDelegate(hy1 hy1Var) {
        this.P3 = hy1Var;
    }

    public void setEditingBusinessLink(TL_account.TL_businessChatLink tL_businessChatLink) {
        String str;
        this.R2 = tL_businessChatLink;
        m2(false);
        if (this.R2 != null) {
            W(true);
            this.v2.setOnClickListener(new fv1(this, (byte) 7));
            this.v2.setContentDescription(k96.M0(2131751342, null));
            this.v2.setVisibility(0);
            this.v2.setScaleX(0.1f);
            this.v2.setScaleY(0.1f);
            this.v2.setAlpha(0.0f);
            this.v2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(s33.f).start();
            this.d0 = na7.q1(this.S.a).r1();
            ex1 ex1Var = this.F0;
            TextPaint paint = ex1Var != null ? ex1Var.getPaint() : null;
            if (paint == null) {
                paint = new TextPaint();
                paint.setTextSize(gl.L(18.0f));
            }
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            ArrayList<TLRPC.MessageEntity> arrayList = this.R2.entities;
            if (arrayList == null || (str = tL_businessChatLink.message) == null) {
                String str2 = tL_businessChatLink.message;
                if (str2 != null) {
                    setFieldText(str2);
                }
            } else {
                setFieldText(r(fontMetricsInt, str, arrayList));
            }
            this.S2 = B();
            w1(false, false, false);
            getSendButtonInternal().setVisibility(8);
            setSlowModeButtonVisible(false);
            this.Q0.setVisibility(8);
            this.a1.setVisibility(8);
            pkb pkbVar = this.f2;
            if (pkbVar != null) {
                pkbVar.setVisibility(8);
            }
            gw1 gw1Var = this.h2;
            if (gw1Var != null) {
                this.l2 = 0.0f;
                gw1Var.setAlpha(0.0f);
                gw1Var.setScaleX(0.5f);
                gw1Var.setScaleY(0.5f);
            }
            this.q2.setVisibility(8);
            pw1 pw1Var = this.z2;
            if (pw1Var != null) {
                pw1Var.setVisibility(8);
            }
        }
    }

    public void setEffectId(long j) {
        this.O6 = j;
        ow1 ow1Var = this.K0;
        if (ow1Var != null) {
            ow1Var.setEffect(j);
        }
    }

    public void setExitTransition(float f) {
        this.b5 = f;
        RecordCircle recordCircle = this.D2;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setFieldFocused(boolean z) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.E3.getSystemService("accessibility");
        if (this.F0 == null || accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        if (z && org.telegram.ui.ActionBar.d.hasSheets(this.F3)) {
            z = false;
        }
        if (z) {
            if (this.H2 != 0 || this.F0.isFocused()) {
                return;
            }
            av1 av1Var = new av1(this, (byte) 16);
            this.I2 = av1Var;
            gl.d3(av1Var, 600L);
            return;
        }
        ex1 ex1Var = this.F0;
        if (ex1Var == null || !ex1Var.isFocused()) {
            return;
        }
        if (!this.p3 || this.Z2) {
            this.F0.clearFocus();
        }
    }

    @Override // bbb
    public void setFieldText(CharSequence charSequence) {
        G1(charSequence, false);
    }

    public void setInAppInsetsController(byc bycVar) {
        this.d7 = bycVar;
    }

    public void setLockAnimatedTranslation(float f) {
        this.a5 = f;
        RecordCircle recordCircle = this.D2;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setOnSendButtonLongClick(View.OnLongClickListener onLongClickListener) {
        if (onLongClickListener == null) {
            onLongClickListener = new rv1(this, (byte) 0);
        }
        this.K0.setOnLongClickListener(onLongClickListener);
    }

    public void setOverrideHint(CharSequence charSequence) {
        L1(charSequence, false);
    }

    public void setOverrideKeyboardAnimation(boolean z) {
        this.w = z;
    }

    public void setRichDraftPreview(TL_iv.RichMessage richMessage) {
        if (this.s2 == null) {
            return;
        }
        na7.q1(this.R);
        boolean z = w01.a;
        this.u2 = richMessage;
        t2();
    }

    public void setRoundVideoUiFrameClockActive(boolean z) {
        if (this.Z1 != z) {
            this.Z1 = z;
            my1 my1Var = this.Z0;
            if (my1Var != null) {
                my1Var.setExternalFrameClock(z);
            }
            jy1 jy1Var = this.b2;
            if (jy1Var != null) {
                jy1Var.f = z;
                System.currentTimeMillis();
                jy1Var.h = -1L;
                jy1Var.invalidate();
            }
            SlideTextView slideTextView = this.a2;
            if (slideTextView != null) {
                slideTextView.H = z;
                System.currentTimeMillis();
                slideTextView.invalidate();
            }
        }
    }

    public void setSelection(int i) {
        ex1 ex1Var = this.F0;
        if (ex1Var == null) {
            return;
        }
        ex1Var.setSelection(i, ex1Var.length());
    }

    public void setSideButtonsForAttach(dz1 dz1Var) {
        pkb pkbVar;
        dz1 dz1Var2 = this.e7;
        if (dz1Var2 != dz1Var) {
            if (dz1Var2 != null) {
                dz1Var2.e(0, false, true);
            }
            this.e7 = dz1Var;
            gw1 gw1Var = this.h2;
            if (gw1Var == null || (pkbVar = this.f2) == null || pkbVar.getVisibility() == 0) {
                return;
            }
            boolean z = dz1Var != null && O0();
            boolean z2 = (dz1Var == null || z) ? false : true;
            if (dz1Var != null) {
                dz1Var.e(0, z && !A2(), true);
            }
            ViewPropertyAnimator viewPropertyAnimator = this.g2;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
            }
            ViewPropertyAnimator animate = gw1Var.animate();
            float f = z2 ? 1.0f : 0.0f;
            this.l2 = f;
            ViewPropertyAnimator duration = animate.alpha(f).scaleX(z2 ? 1.0f : 0.5f).scaleY(z2 ? 1.0f : 0.5f).setInterpolator(s33.h).setDuration(320L);
            this.g2 = duration;
            duration.start();
        }
    }

    public void setSlideToCancelProgress(float f) {
        this.Y4 = f;
        float measuredWidth = getMeasuredWidth() * 0.35f;
        if (measuredWidth > gl.L(140.0f)) {
            measuredWidth = gl.L(140.0f);
        }
        this.i5 = (int) ((1.0f - this.Y4) * (-measuredWidth));
        RecordCircle recordCircle = this.D2;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setSlowModeTimer(int i) {
        this.H0 = i;
        y2();
    }

    public void setSnapAnimationProgress(float f) {
        this.c5 = f;
        invalidate();
    }

    public void setTextTransitionIsRunning(boolean z) {
        this.i0 = z;
        this.q2.invalidate();
    }

    public void setViewParentForEmoji(ViewGroup viewGroup) {
        this.d2 = viewGroup;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        this.h6 = z;
        ex1 ex1Var = this.F0;
        if (ex1Var != null) {
            ex1Var.setEnabled(z);
        }
    }

    public void setVoiceDraft(cq6 cq6Var) {
        File file;
        String str;
        if (cq6Var != null) {
            boolean z = cq6Var.g;
            this.P = z;
            l lVar = this.E2;
            if (lVar != null) {
                lVar.E.d(1, z, true);
            }
            hy1 hy1Var = this.P3;
            TL_stories.StoryItem t0 = hy1Var != null ? hy1Var.t0() : null;
            MediaController w = MediaController.w();
            int i = this.R;
            long j = this.G3;
            k27 k27Var = this.J3;
            k27 threadMessage = getThreadMessage();
            j1a j1aVar = null;
            int i2 = this.w3;
            mu1 mu1Var = this.F3;
            if (mu1Var != null) {
                j1aVar = mu1Var.Q6();
            }
            long sendMonoForumPeerId = getSendMonoForumPeerId();
            u47 sendMessageSuggestionParams = getSendMessageSuggestionParams();
            co3 co3Var = w.N1;
            if (w.I1) {
                u20 u20Var = w.G1;
                if (u20Var != null && u20Var.e() && w.g1 != null && (file = w.k1) != null && (str = cq6Var.a) != null && str.equals(file.getAbsolutePath())) {
                    w.h1 = i2;
                    w.r1 = k27Var;
                    w.s1 = threadMessage;
                    w.t1 = t0;
                    w.u1 = j1aVar;
                    w.p1 = sendMonoForumPeerId;
                    w.q1 = sendMessageSuggestionParams;
                    kk7.f(w.i1).k(kk7.n2, new Object[0]);
                    kk7.f(w.i1).k(kk7.r2, Integer.valueOf(w.h1), w.g1, w.k1.getAbsolutePath(), Boolean.TRUE, Float.valueOf(cq6Var.h), Float.valueOf(cq6Var.i));
                    return;
                }
                if (!w.W()) {
                    return;
                }
            }
            w.y0 = false;
            w.X(true);
            co3Var.a(w.M1);
            co3Var.c(new xk6(w, i2, cq6Var, i, j, sendMonoForumPeerId, sendMessageSuggestionParams, threadMessage, k27Var, t0));
        }
    }

    public final void t(float f) {
        float i = Utilities.i((f - 0.1f) / 0.9f, 1.0f, 0.0f);
        this.n = G2(0.12f, 0.6f, f) * (this.B0 ? 0.5f : 1.0f);
        float i2 = Utilities.i(i, 1.0f, 0.0f) - 1.0f;
        this.h = gl.R1(0.55f, 1.0f, b00.w(i2, 1.1f, i2, (2.1f * i2 * i2 * i2) + 1.0f));
        l2();
        this.R0.setRotation((1.0f - s33.h.getInterpolation(i)) * (-20.0f));
    }

    public final void t0() {
        o27 o27Var;
        u47 b;
        TLRPC.Chat chat;
        int i;
        u47 b2;
        k27 k27Var = this.P2;
        if (k27Var != null) {
            boolean o5 = k27Var.o5();
            mu1 mu1Var = this.F3;
            if (o5 && !hc2.z(this.R, 24, k27.B0(this.P2.k))) {
                if (mu1Var == null || (b2 = mu1Var.y5) == null) {
                    b2 = u47.b(this.P2.k.suggested_post);
                }
                if (!gta.Q(this.R, b2.a)) {
                    if (mu1Var != null) {
                        mu1Var.kc(b2);
                        return;
                    }
                    return;
                }
            }
            if (this.d0 - this.e0 < 0) {
                NumberTextView numberTextView = this.c0;
                if (numberTextView != null) {
                    gl.A3(3.5f, numberTextView, null);
                    try {
                        this.c0.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                if (na7.q1(this.R).F3() || na7.q1(this.R).k4.h1.f() <= this.e0) {
                    return;
                }
                T1();
                return;
            }
            if (this.H2 != 0) {
                O1(0, true);
                this.V0.s(false);
                if (this.p4) {
                    P1(false, true, false, true);
                    this.b4 = true;
                    gl.d3(new uv1(this, (byte) 15), 200L);
                }
            }
            ex1 ex1Var = this.F0;
            CharSequence textToUse = ex1Var == null ? "" : ex1Var.getTextToUse();
            k27 k27Var2 = this.P2;
            if (k27Var2 == null || k27Var2.D != 19) {
                textToUse = gl.m1(textToUse);
            }
            CharSequence[] charSequenceArr = {textToUse};
            if (TextUtils.isEmpty(charSequenceArr[0])) {
                TLRPC.MessageMedia messageMedia = this.P2.k.media;
                if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) || (messageMedia instanceof TLRPC.TL_messageMediaEmpty) || messageMedia == null) {
                    gl.A3(-3.0f, this.F0, null);
                    pw0.E.a();
                    return;
                }
            }
            ArrayList Y = hq6.d0(this.R).Y(charSequenceArr, d2(), true);
            if (!TextUtils.equals(charSequenceArr[0], this.P2.v) || ((Y != null && !Y.isEmpty()) || !this.P2.k.entities.isEmpty() || (this.P2.k.media instanceof TLRPC.TL_messageMediaWebPage))) {
                k27 k27Var3 = this.P2;
                k27Var3.y1 = charSequenceArr[0];
                k27Var3.z1 = Y;
                k27Var3.A1 = this.O3;
                if (mu1Var != null && (chat = mu1Var.e) != null && (((i = k27Var3.D) == 0 || i == 19) && !hc2.m(chat))) {
                    k27 k27Var4 = this.P2;
                    k27Var4.A1 = false;
                    TLRPC.Message message = k27Var4.k;
                    message.flags &= -513;
                    message.media = null;
                } else if (mu1Var == null || (o27Var = mu1Var.x5) == null) {
                    k27 k27Var5 = this.P2;
                    k27Var5.A1 = false;
                    int i2 = k27Var5.D;
                    if (i2 == 0 || i2 == 19) {
                        TLRPC.Message message2 = k27Var5.k;
                        message2.flags |= 512;
                        message2.media = new TLRPC.TL_messageMediaEmpty();
                    }
                } else {
                    if (mu1Var.Y5 instanceof TLRPC.TL_webPagePending) {
                        k27 k27Var6 = this.P2;
                        k27Var6.A1 = false;
                        int i3 = k27Var6.D;
                        if (i3 == 0 || i3 == 19) {
                            k27Var6.k.media = new TLRPC.TL_messageMediaEmpty();
                            this.P2.k.flags |= 512;
                        }
                    } else {
                        TLRPC.WebPage webPage = o27Var.v;
                        k27 k27Var7 = this.P2;
                        if (webPage != null) {
                            k27Var7.A1 = false;
                            TLRPC.Message message3 = k27Var7.k;
                            message3.flags |= 512;
                            message3.media = new TLRPC.TL_messageMediaWebPage();
                            this.P2.k.media.webpage = mu1Var.x5.v;
                        } else {
                            k27Var7.A1 = false;
                            int i4 = k27Var7.D;
                            if (i4 == 0 || i4 == 19) {
                                TLRPC.Message message4 = k27Var7.k;
                                message4.flags |= 512;
                                message4.media = new TLRPC.TL_messageMediaEmpty();
                            }
                        }
                    }
                    TLRPC.Message message5 = this.P2.k;
                    o27 o27Var2 = mu1Var.x5;
                    message5.invert_media = o27Var2.r;
                    if (o27Var2.o) {
                        TLRPC.MessageMedia messageMedia2 = message5.media;
                        if (messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) {
                            boolean z = o27Var2.q;
                            messageMedia2.force_small_media = z;
                            messageMedia2.force_large_media = !z;
                        }
                    }
                }
                if (this.P2.o5()) {
                    x3a a = x3a.a(k27.B0(this.P2.k), this.P2.y1.toString());
                    if (mu1Var == null || (b = mu1Var.y5) == null) {
                        b = u47.b(this.P2.k.suggested_post);
                    }
                    a.T = b;
                    a.R = cf3.n(this.P2.k.saved_peer_id);
                    a.G = this.P2.t2();
                    k27 k27Var8 = this.P2;
                    a.r = k27Var8;
                    a.D = k27Var8;
                    boolean z2 = k27Var8.F0() instanceof TLRPC.TL_document;
                    k27 k27Var9 = this.P2;
                    if (z2) {
                        a.g = (TLRPC.TL_document) k27Var9.F0();
                        a.b = a.a;
                        a.a = null;
                    } else {
                        TLRPC.MessageMedia messageMedia3 = k27Var9.k.media;
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
                    z3a.B(this.R).q0(a);
                } else {
                    z3a B = z3a.B(this.R);
                    k27 k27Var10 = this.P2;
                    B.s(k27Var10, null, null, null, null, null, null, null, false, k27Var10.t2(), null);
                }
            }
            D1(null, null, false);
        }
    }

    public final void t1(SpannableStringBuilder spannableStringBuilder, boolean z, int i, int i2) {
        if (this.F0 == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        vu3.m(spannableStringBuilder2, this.F0.getPaint().getFontMetricsInt(), false, null, 0);
        gm[] gmVarArr = (gm[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), gm.class);
        if (gmVarArr != null) {
            for (gm gmVar : gmVarArr) {
                gmVar.applyFontMetrics(this.F0.getPaint().getFontMetricsInt(), vl.f());
            }
        }
        ey8.a(spannableStringBuilder2);
        R();
        setFieldText(spannableStringBuilder2);
        v1(z, i, i2, 0L, true);
    }

    public final void t2() {
        ig9 ig9Var = this.s2;
        if (ig9Var != null) {
            boolean z = this.t2;
            boolean z2 = this.u2 != null && this.P2 == null;
            this.t2 = z2;
            ow1 ow1Var = this.K0;
            ImageView imageView = this.S0;
            ew1 ew1Var = this.R0;
            if (z2) {
                ig9Var.setResourcesProvider(this.L4);
                this.s2.set(this.u2);
                this.s2.setVisibility(0);
                ex1 ex1Var = this.F0;
                if (ex1Var != null) {
                    ex1Var.setVisibility(8);
                }
                ew1Var.setVisibility(8);
                imageView.setVisibility(0);
                ow1Var.setLocked(!y6c.h(this.R).p());
            } else {
                ig9Var.setVisibility(8);
                ex1 ex1Var2 = this.F0;
                if (ex1Var2 != null) {
                    ex1Var2.setVisibility(0);
                }
                ew1Var.setVisibility(0);
                imageView.setVisibility(8);
                ow1Var.setLocked(false);
            }
            k2();
            if (z != this.t2) {
                N(true);
            }
        }
    }

    public final void u(x3a x3aVar) {
        hy1 hy1Var = this.P3;
        if (hy1Var != null) {
            x3aVar.H = hy1Var.t0();
            x3aVar.J = this.P3.D();
        }
    }

    public final void u0(Canvas canvas, boolean z) {
        if (this.X5) {
            int A = (int) tb4.A(1.0f, this.b6, bkb.h3.getIntrinsicHeight(), this.J2);
            View view = this.w2;
            if (view != null && view.getVisibility() == 0) {
                A = (int) (((1.0f - getTopViewEnterProgress()) * this.w2.getLayoutParams().height) + A);
            }
            int intrinsicHeight = bkb.h3.getIntrinsicHeight() + A;
            if (z) {
                bkb.h3.setAlpha((int) (this.b6 * 255.0f));
                bkb.h3.setBounds(0, A, getMeasuredWidth(), intrinsicHeight);
                bkb.h3.draw(canvas);
            }
            if (!this.W5) {
                float f = intrinsicHeight;
                float width = getWidth();
                float height = getHeight();
                wjb wjbVar = this.L4;
                Paint d = wjbVar != null ? wjbVar.d("paintChatComposeBackground") : null;
                if (d == null) {
                    d = bkb.T0("paintChatComposeBackground");
                }
                canvas.drawRect(0.0f, f, width, height, d);
                return;
            }
            int F0 = F0(bkb.Ie);
            Paint paint = this.a6;
            paint.setColor(F0);
            if (!gba.f() || this.c2 == null) {
                canvas.drawRect(0.0f, intrinsicHeight, getWidth(), getHeight(), paint);
            } else {
                this.c6.set(0, intrinsicHeight, getWidth(), getHeight());
                this.c2.H(canvas, getTop(), this.c6, paint, false);
            }
        }
    }

    public boolean u1() {
        jm3 jm3Var = this.j1;
        byte b = 0;
        if (jm3Var != null && jm3Var.r == 4) {
            return false;
        }
        boolean z = this.q6;
        mu1 mu1Var = this.F3;
        if (!z) {
            if (this.p6) {
                return true;
            }
            if (this.F0 != null && this.P2 == null && !this.t2 && !c() && (mu1Var == null || !mu1Var.y())) {
                dc b2 = ec.b(this.R, mu1Var != null ? mu1Var.a() : this.G3);
                if (b2 != null) {
                    Editable text = this.F0.getText();
                    String obj = text == null ? "" : text.toString();
                    if (!TextUtils.isEmpty(obj.trim()) && !obj.trim().startsWith("/")) {
                        e2();
                        this.p6 = true;
                        cc ccVar = this.m6;
                        if (ccVar != null) {
                            if (!ccVar.d) {
                                ccVar.d = true;
                                ccVar.a.invalidate();
                            }
                            this.m6.c(true);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
                        int i = this.R;
                        byte b3 = 8;
                        ae2 ae2Var = new ae2(this, obj, b3);
                        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                        CharSequence[] charSequenceArr = {spannableStringBuilder};
                        tL_textWithEntities.entities = hq6.d0(i).Y(charSequenceArr, true, true);
                        CharSequence charSequence = charSequenceArr[0];
                        tL_textWithEntities.text = charSequence != null ? charSequence.toString() : "";
                        TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = new TLRPC.TL_messages_composeMessageWithAI();
                        tL_messages_composeMessageWithAI.text = tL_textWithEntities;
                        tL_messages_composeMessageWithAI.proofread = b2.a;
                        tL_messages_composeMessageWithAI.emojify = b2.b;
                        tL_messages_composeMessageWithAI.translate_to_lang = b2.c;
                        TL_aicompose.InputAiComposeTone inputAiComposeTone = b2.d;
                        if (!(inputAiComposeTone instanceof TL_aicompose.inputAiComposeToneSingleUse)) {
                            inputAiComposeTone = ec.d(inputAiComposeTone);
                        }
                        tL_messages_composeMessageWithAI.tone = inputAiComposeTone;
                        this.o6 = ConnectionsManager.getInstance(i).sendRequestTyped(tL_messages_composeMessageWithAI, new hc(b), new f(ae2Var, b3));
                        return true;
                    }
                }
            }
        }
        boolean z2 = this.t2;
        wjb wjbVar = this.L4;
        if (z2 && !y6c.h(this.R).p()) {
            hd9.q0(wjbVar, getContext(), new uv1(this, (byte) 5), new uv1(this, (byte) 6));
            return true;
        }
        if (!c()) {
            return v1(true, 0, 0, 0L, true);
        }
        ij.J(this.E3, mu1Var.a(), new iw1(this, (byte) 3), wjbVar);
        return true;
    }

    public final void u2(boolean z) {
        boolean z2;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean y = cf3.y(this.G3);
        ImageView imageView = this.y2;
        if (y) {
            TLRPC.Chat K0 = na7.q1(this.S.a).K0(Long.valueOf(-this.G3));
            this.W2 = na7.q1(this.R).W3.getBoolean("silent_" + this.G3, false);
            z2 = hc2.T(K0) && (K0.creator || ((tL_chatAdminRights = K0.admin_rights) != null && tL_chatAdminRights.post_messages)) && !K0.megagroup;
            this.X2 = z2;
            if (imageView != null) {
                k33 k33Var = this.f0;
                if (k33Var == null) {
                    k33Var = new k33(getContext(), R.drawable.input_notify_on, bkb.Ml);
                    this.f0 = k33Var;
                }
                k33Var.a(this.W2, false);
                imageView.setImageDrawable(this.f0);
            } else {
                z2 = false;
            }
            pkb pkbVar = this.f2;
            if (pkbVar != null) {
                n2(pkbVar.getVisibility() == 0 ? 1 : 0);
            }
        } else {
            z2 = false;
        }
        boolean z3 = (this.P3 == null || c() || !this.P3.M()) ? false : true;
        boolean z4 = (!z3 || this.B2 || this.v3) ? false : true;
        if (z4) {
            e0();
        }
        pw1 pw1Var = this.z2;
        if (pw1Var != null) {
            if ((pw1Var.getTag() != null && z4) || (this.z2.getTag() == null && !z4)) {
                if (imageView != null) {
                    int i = (z3 || !z2 || this.z2.getVisibility() == 0) ? 8 : 0;
                    if (i != imageView.getVisibility()) {
                        imageView.setVisibility(i);
                        return;
                    }
                    return;
                }
                return;
            }
            this.z2.setTag(z4 ? 1 : null);
        } else if (imageView != null) {
            int i2 = (z3 || !z2) ? 8 : 0;
            if (i2 != imageView.getVisibility()) {
                imageView.setVisibility(i2);
            }
        }
        AnimatorSet animatorSet = this.C2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.C2 = null;
        }
        if (z && !z2) {
            pw1 pw1Var2 = this.z2;
            if (pw1Var2 != null) {
                if (z4) {
                    pw1Var2.setVisibility(0);
                }
                this.z2.setPivotX(gl.L(24.0f));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.C2 = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.z2, (Property<pw1, Float>) View.ALPHA, z4 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.z2, (Property<pw1, Float>) View.SCALE_X, z4 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(this.z2, (Property<pw1, Float>) View.SCALE_Y, z4 ? 1.0f : 0.1f));
                this.C2.setDuration(180L);
                this.C2.addListener(new rw1(this, z4, (byte) 3));
                this.C2.start();
                return;
            }
            return;
        }
        pw1 pw1Var3 = this.z2;
        if (pw1Var3 == null) {
            if (imageView != null) {
                imageView.setVisibility(z2 ? 0 : 8);
                return;
            }
            return;
        }
        pw1Var3.setVisibility(z4 ? 0 : 8);
        this.z2.setAlpha(z4 ? 1.0f : 0.0f);
        this.z2.setScaleX(z4 ? 1.0f : 0.1f);
        this.z2.setScaleY(z4 ? 1.0f : 0.1f);
        if (imageView != null) {
            imageView.setVisibility((!z2 || this.z2.getVisibility() == 0) ? 8 : 0);
        }
        this.z2.setTranslationX(0.0f);
    }

    @Override // tjb
    public final void updateColors() {
        TextPaint textPaint;
        wjb wjbVar = this.L4;
        try {
            ex1 ex1Var = this.F0;
            if (ex1Var != null) {
                zkb.l(ex1Var, 34, bkb.Le, wjbVar);
                zkb.v(this.F0, bkb.Me, wjbVar);
                zkb.y(this.F0, bkb.lg, wjbVar);
            }
            Paint paint = this.G2;
            if (paint != null) {
                paint.setColor(F0(bkb.Rf));
            }
            ly1 ly1Var = this.G0;
            if (ly1Var != null) {
                ((jia) ly1Var.c).setTextColor(F0(bkb.Ml));
                ly1Var.invalidate();
            }
            AnimatedArrowDrawable animatedArrowDrawable = this.v4;
            if (animatedArrowDrawable != null) {
                animatedArrowDrawable.a.setColor(F0(bkb.Ml));
                animatedArrowDrawable.invalidateSelf();
            }
            ow1 ow1Var = this.K0;
            if (ow1Var != null && this.L0 != 0 && ow1Var.getBackground() != null) {
                int F0 = F0((this.H0 != Integer.MAX_VALUE || V0()) ? bkb.Oe : bkb.Ml);
                if (F0 != this.L0) {
                    this.L0 = F0;
                    bkb.F1(ow1Var.getBackground(), Color.argb(24, Color.red(F0), Color.green(F0), Color.blue(F0)), true);
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
        jm3 jm3Var = this.j1;
        if (jm3Var != null) {
            jm3Var.L();
        }
        s2();
        RecordCircle recordCircle = this.D2;
        if (recordCircle != null) {
            recordCircle.h();
        }
        jy1 jy1Var = this.b2;
        if (jy1Var != null) {
            jy1Var.f();
        }
        SlideTextView slideTextView = this.a2;
        if (slideTextView != null) {
            slideTextView.b();
        }
        my1 my1Var = this.Z0;
        if (my1Var != null && (textPaint = my1Var.G) != null) {
            textPaint.setColor(my1Var.J.F0(bkb.F6));
        }
        scc sccVar = this.g1;
        if (sccVar != null) {
            sccVar.e.setColor(bkb.w0(null, bkb.Z6, false));
            sccVar.M = 0;
            qcc qccVar = sccVar.Q;
            if (qccVar != null) {
                qccVar.b();
            }
        }
        NumberTextView numberTextView = this.c0;
        if (numberTextView != null && this.F0 != null) {
            if (this.e0 - this.d0 < 0) {
                numberTextView.setTextColor(F0(bkb.o7));
            } else {
                numberTextView.setTextColor(F0(bkb.x6));
            }
        }
        F0(bkb.Sf);
        cx1 cx1Var = this.n0;
        if (cx1Var != null) {
            cx1Var.d.setColor(bkb.w0(null, bkb.yj, false));
            il0 il0Var = cx1Var.r;
            if (il0Var != null) {
                il0Var.updateColors();
            }
            cx1Var.invalidate();
        }
        tx1 tx1Var = this.x2;
        if (tx1Var != null) {
            tx1Var.d();
        }
        int F02 = this.b1 ? F0(bkb.Ml) : -1;
        mw1 mw1Var = this.c1;
        if (mw1Var != null && (!this.R6 || F02 != this.P6)) {
            this.R6 = true;
            this.P6 = F02;
            mw1Var.setColorFilter(new PorterDuffColorFilter(F02, PorterDuff.Mode.SRC_IN));
        }
        int F03 = F0(bkb.h6);
        if (this.S6 && F03 == this.Q6) {
            return;
        }
        this.S6 = true;
        this.Q6 = F03;
        ew1 ew1Var = this.R0;
        if (ew1Var != null) {
            ew1Var.setBackground(bkb.f0(F03, 1, -1));
        }
        ImageView imageView = this.S0;
        if (imageView != null) {
            float L = gl.L(19.0f);
            int L2 = gl.L(1.0f);
            int L3 = gl.L(3.0f);
            imageView.setBackground(bkb.W(L, F03, L2, L3, L2, L3));
        }
    }

    public final void v(float f) {
        this.V1 = f;
        i29 i29Var = this.i1;
        if (i29Var != null) {
            i29Var.setNewContentAlpha(1.0f);
            this.i1.setAlpha(Math.max(0.0f, 1.0f - (1.8f * f)));
            float R1 = gl.R1(1.0f, 0.94f, f);
            this.i1.setPivotX(gl.L(17.0f));
            this.i1.setPivotY(r4.getHeight() / 2.0f);
            this.i1.setScaleX(R1);
            this.i1.setScaleY(R1);
            this.i1.setTranslationX((-gl.L(20.0f)) * f);
            this.i1.setVisibility(f >= 1.0f ? 4 : 0);
        }
        ojc ojcVar = this.T1;
        if (ojcVar != null) {
            ojcVar.setModeProgress(f);
            this.T1.setVisibility(f <= 0.0f ? 8 : 0);
        }
    }

    public final boolean v0(Canvas canvas, h8c h8cVar) {
        float f;
        float f2;
        float f3;
        float f4;
        float d = this.b7.d(this.F0.canScrollVertically(-1));
        float d2 = this.c7.d(this.F0.canScrollVertically(1));
        if (d <= 0.0f && d2 <= 0.0f) {
            return ((Boolean) h8cVar.run()).booleanValue();
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, this.F0.getX() + this.F0.getMeasuredWidth() + gl.L(5.0f), this.F0.getY() + this.F0.getMeasuredHeight() + gl.L(2.0f), kk7.d4, 31);
        boolean booleanValue = ((Boolean) h8cVar.run()).booleanValue();
        canvas.save();
        LinearGradient linearGradient = this.Z6;
        Paint paint = this.Y6;
        Matrix matrix = this.a7;
        if (d > 0.0f) {
            RectF rectF = gl.P;
            f3 = 255.0f;
            f4 = 16.0f;
            f = 0.0f;
            f2 = 5.0f;
            rectF.set(this.F0.getX() - gl.L(5.0f), (this.F0.getY() + this.J2) - 1.0f, this.F0.getX() + this.F0.getMeasuredWidth() + gl.L(5.0f), this.F0.getY() + this.J2 + gl.L(13.0f));
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
            RectF rectF2 = gl.P;
            rectF2.set(this.F0.getX() - gl.L(f2), (this.F0.getY() + this.F0.getMeasuredHeight()) - gl.L(15.0f), this.F0.getX() + this.F0.getMeasuredWidth() + gl.L(f2), this.F0.getY() + this.F0.getMeasuredHeight() + gl.L(2.0f) + 1.0f);
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

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v37 org.telegram.ui.Components.ChatActivityEnterView, still in use, count: 2, list:
          (r11v37 org.telegram.ui.Components.ChatActivityEnterView) from 0x00ee: INVOKE 
          (r11v37 org.telegram.ui.Components.ChatActivityEnterView)
          (wrap:iv1:0x00ea: CONSTRUCTOR 
          (r37v0 'this' org.telegram.ui.Components.ChatActivityEnterView A[IMMUTABLE_TYPE, THIS])
          (r38v0 boolean)
          (r39v0 int)
          (r40v0 int)
          (r41v0 long)
         A[MD:(org.telegram.ui.Components.ChatActivityEnterView, boolean, int, int, long):void (m), WRAPPED] (LINE:235) call: iv1.<init>(org.telegram.ui.Components.ChatActivityEnterView, boolean, int, int, long):void type: CONSTRUCTOR)
         VIRTUAL call: org.telegram.ui.Components.ChatActivityEnterView.U1(java.lang.Runnable):boolean A[MD:(java.lang.Runnable):boolean (m), WRAPPED] (LINE:239)
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
    /* JADX WARN: Type inference failed for: r3v9, types: [k27, org.telegram.tgnet.TLRPC$WebPage] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean v1(final boolean r38, final int r39, final int r40, long r41, boolean r43) {
        /*
            Method dump skipped, instructions count: 1666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.v1(boolean, int, int, long, boolean):boolean");
    }

    public void v2(boolean z) {
        w2(false, z);
    }

    public boolean w() {
        return false;
    }

    public final void w0(FrameLayout frameLayout, Canvas canvas, float f, float f2, float f3, float f4) {
        il0 il0Var;
        float f5;
        i29 i29Var = this.i1;
        float trimProgress = (i29Var == null || !this.K1) ? 0.0f : i29Var.getTrimProgress();
        if (trimProgress <= 0.0f || this.i1.getVisibility() != 0) {
            return;
        }
        i29 i29Var2 = this.i1;
        if (i29Var2.T0 == null && f4 > f3) {
            i29Var2.getLocationInWindow(this.s5);
            float trimHandleX = this.i1.getTrimHandleX() + r10[0];
            float N = gl.N(6.0f);
            float N2 = gl.N(11.0f);
            float trimWindowTop = ((this.i1.getTrimWindowTop() + r10[1]) - gl.N(4.0f)) - N;
            String trimBubbleText = this.i1.getTrimBubbleText();
            float L = gl.L(13.0f);
            TextPaint textPaint = this.m5;
            textPaint.setTextSize(L);
            textPaint.setTypeface(gl.n1("fonts/rmedium.ttf"));
            textPaint.setColor(-1);
            float measureText = textPaint.measureText(trimBubbleText);
            float N3 = gl.N(23.0f) + measureText;
            float N4 = gl.N(29.0f);
            float max = Math.max(gl.L(8.0f), Math.min((gl.q.x - gl.L(8.0f)) - N3, trimHandleX - (N3 / 2.0f)));
            RectF rectF = this.r5;
            rectF.set(max, trimWindowTop - N4, max + N3, trimWindowTop);
            float i = Utilities.i(trimHandleX, rectF.right - gl.L(16.0f), rectF.left + gl.L(16.0f));
            Path path = this.p5;
            path.rewind();
            float f6 = N4 / 2.0f;
            path.addRoundRect(rectF, f6, f6, Path.Direction.CW);
            Path path2 = this.q5;
            path2.rewind();
            float f7 = i - N2;
            path2.moveTo(f7, trimWindowTop - gl.N(2.0f));
            path2.lineTo(f7, trimWindowTop);
            float f8 = trimWindowTop + N;
            path2.cubicTo(i - gl.N(6.5f), trimWindowTop, i - gl.N(3.2f), f8, i, f8);
            float N5 = gl.N(3.2f) + i;
            float N6 = gl.N(6.5f) + i;
            float f9 = i + N2;
            path2.cubicTo(N5, f8, N6, trimWindowTop, f9, trimWindowTop);
            path2.lineTo(f9, trimWindowTop - gl.N(2.0f));
            path2.close();
            path.op(path2, Path.Op.UNION);
            canvas.save();
            canvas.translate(-f, -f2);
            canvas.clipRect(-100000.0f, f3, 100000.0f, f4);
            float R1 = gl.R1(0.8f, 1.0f, trimProgress);
            canvas.scale(R1, R1, i, f8);
            canvas.translate(0.0f, (1.0f - trimProgress) * gl.L(6.0f));
            kl0 kl0Var = this.L1;
            if (kl0Var == null) {
                il0Var = null;
            } else {
                boolean z = frameLayout != this;
                il0 il0Var2 = z ? this.u5 : this.v5;
                if (il0Var2 == null) {
                    il0Var = kl0Var.c(frameLayout, this.w5, false);
                    il0Var.r(0.0f);
                    il0Var.X = 0.0f;
                    if (z) {
                        this.u5 = il0Var;
                    } else {
                        this.v5 = il0Var;
                    }
                } else {
                    il0Var = il0Var2;
                }
            }
            if (il0Var != null) {
                canvas.save();
                canvas.clipPath(path);
                canvas.translate(f, f2);
                f5 = 255.0f;
                il0Var.setBounds((int) Math.floor(rectF.left - f), (int) Math.floor(rectF.top - f2), (int) Math.ceil(rectF.right - f), (int) Math.ceil(f8 - f2));
                il0Var.setAlpha((int) (trimProgress * 255.0f));
                il0Var.draw(canvas);
                canvas.restore();
            } else {
                f5 = 255.0f;
            }
            int p1 = bkb.p1((il0Var != null ? 0.5f : 0.6f) * trimProgress, -16777216);
            Paint paint = this.n5;
            paint.setColor(p1);
            canvas.drawPath(path, paint);
            Paint.Style style = Paint.Style.STROKE;
            Paint paint2 = this.o5;
            paint2.setStyle(style);
            paint2.setStrokeWidth(gl.N(0.66f));
            paint2.setColor(bkb.p1(0.16f * trimProgress, -1));
            canvas.drawPath(path, paint2);
            textPaint.setAlpha((int) (trimProgress * f5));
            canvas.drawText(trimBubbleText, rectF.centerX() - (measureText / 2.0f), rectF.centerY() - ((textPaint.ascent() + textPaint.descent()) / 2.0f), textPaint);
            canvas.restore();
        }
    }

    public final void w1(boolean z, boolean z2, boolean z3) {
        if ((this.z3 != z || this.A3 != z2) && this.V0 != null) {
            if (this.X0 && !z3) {
                this.w4 = true;
                J0(false);
            } else if (z3) {
                i1();
            }
        }
        this.y3 = true;
        this.z3 = z;
        this.A3 = z2;
        wx1 wx1Var = this.V0;
        if (wx1Var != null) {
            wx1Var.I(true, z, z2, true);
        }
        E1(false, !this.Z2);
    }

    public final void w2(boolean z, boolean z2) {
        TLRPC.Chat chat;
        TLRPC.Peer peer;
        float f;
        float f2;
        float f3;
        ex1 ex1Var;
        k4a k4aVar;
        k4a k4aVar2;
        cw1 cw1Var;
        if (this.P3 != null) {
            Z();
            if (this.o7) {
                peer = this.P3.i();
                chat = null;
            } else {
                TLRPC.Chat K0 = na7.q1(this.R).K0(Long.valueOf(-this.G3));
                TLRPC.ChatFull L0 = na7.q1(this.R).L0(-this.G3);
                TLRPC.Peer peer2 = L0 != null ? L0.default_send_as : null;
                chat = K0;
                peer = peer2;
            }
            if (peer == null && this.P3.v() != null && !this.P3.v().peers.isEmpty()) {
                peer = this.P3.v().peers.get(0).peer;
            }
            mu1 mu1Var = this.F3;
            boolean z3 = (z || peer == null || (this.P3.v() != null && this.P3.v().peers.size() <= 1) || P0() || T0() || (((cw1Var = this.f1) != null && cw1Var.getVisibility() == 0) || ((!this.o7 && ((hc2.V(chat) && !hc2.k(chat)) || hc2.p0(chat))) || (mu1Var != null && mu1Var.g4 == 9)))) ? false : true;
            if (z3) {
                f0();
            }
            if (peer != null) {
                long j = peer.channel_id;
                int i = this.R;
                if (j != 0) {
                    TLRPC.Chat K02 = na7.q1(i).K0(Long.valueOf(peer.channel_id));
                    if (K02 != null && (k4aVar2 = this.q0) != null) {
                        k4aVar2.setAvatar(K02);
                        this.q0.setContentDescription(k96.a0(null, null, 2131754775, K02.title));
                    }
                } else {
                    TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(peer.user_id));
                    if (V1 != null && (k4aVar = this.q0) != null) {
                        k4aVar.setAvatar(V1);
                        this.q0.setContentDescription(k96.a0(null, null, 2131754775, qu2.m(0, V1.first_name, V1.last_name)));
                    }
                }
            }
            k4a k4aVar3 = this.q0;
            boolean z4 = k4aVar3 != null && k4aVar3.getVisibility() == 0;
            int L = gl.L(2.0f);
            float f4 = 1.0f;
            if (z3) {
                f = 0.0f;
            } else {
                f = 1.0f;
                f4 = 0.0f;
            }
            k4a k4aVar4 = this.q0;
            if (k4aVar4 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) k4aVar4.getLayoutParams();
                k4a k4aVar5 = this.q0;
                if (z3) {
                    f3 = ((-k4aVar5.getLayoutParams().width) - marginLayoutParams.leftMargin) - L;
                    f2 = 0.0f;
                } else {
                    f2 = ((-k4aVar5.getLayoutParams().width) - marginLayoutParams.leftMargin) - L;
                    f3 = 0.0f;
                }
            } else {
                f2 = 0.0f;
                f3 = 0.0f;
            }
            if (z4 != z3) {
                k4a k4aVar6 = this.q0;
                ValueAnimator valueAnimator = k4aVar6 == null ? null : (ValueAnimator) k4aVar6.getTag();
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.q0.setTag(null);
                }
                ew1 ew1Var = this.R0;
                if (!z3 && this.q0 != null && g0() && this.v3 && (ex1Var = this.F0) != null && z2) {
                    float translationX = this.F0.getTranslationX() + ex1Var.getLeft();
                    float translationX2 = ew1Var.getTranslationX() + ew1Var.getLeft();
                    this.q0.setVisibility(8);
                    this.q0.setTranslationX(0.0f);
                    this.q0.setAlpha(0.0f);
                    ex1 ex1Var2 = this.F0;
                    ex1Var2.getViewTreeObserver().addOnPreDrawListener(new rx1(this, ex1Var2, translationX, translationX2));
                    return;
                }
                if ((this.o7 || (mu1Var != null && mu1Var.T6() == 0 && mu1Var.g6)) && z2) {
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    k4a k4aVar7 = this.q0;
                    if (k4aVar7 != null) {
                        k4aVar7.setTranslationX(f3);
                    }
                    this.H = f3;
                    p2();
                    float f5 = f2;
                    float f6 = f4;
                    float f7 = f3;
                    duration.addUpdateListener(new zl(this, f7, f5, f, f6, (byte) 2));
                    duration.addListener(new sx1(this, z3, f, f7, f6, f5));
                    duration.start();
                    k4a k4aVar8 = this.q0;
                    if (k4aVar8 != null) {
                        k4aVar8.setTag(duration);
                        return;
                    }
                    return;
                }
                float f8 = f4;
                boolean z5 = z3;
                float f9 = f2;
                if (z5) {
                    f0();
                }
                k4a k4aVar9 = this.q0;
                if (k4aVar9 != null) {
                    k4aVar9.setVisibility(z5 ? 0 : 8);
                    this.q0.setTranslationX(f9);
                }
                float f10 = z5 ? f9 : 0.0f;
                ew1Var.setTranslationX(f10);
                this.H = f10;
                p2();
                k4a k4aVar10 = this.q0;
                if (k4aVar10 != null) {
                    k4aVar10.setAlpha(f8);
                    this.q0.setTag(null);
                }
            }
        }
    }

    public final void x() {
        if (this.V0.getParent() == null) {
            byc bycVar = this.d7;
            ViewGroup viewGroup = this.d2;
            wx1 wx1Var = this.V0;
            if (bycVar == null) {
                viewGroup.addView(wx1Var);
            } else {
                viewGroup.addView(wx1Var, nme.c(-1.0f, -1));
            }
        }
    }

    public final px1 x0(k27 k27Var, boolean z) {
        px1 px1Var = new px1(k27Var.K1, k27Var.k, true, true);
        if (z) {
            ex1 ex1Var = this.F0;
            CharSequence[] charSequenceArr = {ex1Var == null ? "" : ex1Var.getTextToUse()};
            ArrayList Y = hq6.d0(this.R).Y(charSequenceArr, true, true);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceArr[0].toString());
            k27.b(spannableStringBuilder, Y, true, true, false, true, 0);
            px1Var.z = k27.A5(vu3.m(spannableStringBuilder, bkb.n2.getFontMetricsInt(), false, null, 0), Y, bkb.n2.getFontMetricsInt(), false);
        }
        return px1Var;
    }

    public final void x1() {
        je5 je5Var = this.M;
        if (je5Var == null) {
            return;
        }
        je5Var.t(vu3.o(gl.S2(k96.a0(null, null, 2131743523, l7c.k(this.F3.h(), true))), this.M.getTextPaint().getFontMetricsInt(), 20, new uv1(this, (byte) 14)));
        je5 je5Var2 = this.M;
        je5Var2.h = je5.a(je5Var2.getText(), this.M.getTextPaint());
    }

    public final void x2() {
        int b;
        long starsPrice = getStarsPrice();
        if (starsPrice > 0) {
            starsPrice *= getMessagesCount();
        }
        if (this.j5 != starsPrice) {
            View sendButtonInternal = getSendButtonInternal();
            this.j5 = starsPrice;
            View sendButtonInternal2 = getSendButtonInternal();
            if (sendButtonInternal != sendButtonInternal2) {
                sendButtonInternal2.setVisibility(sendButtonInternal.getVisibility());
                sendButtonInternal2.setAlpha(sendButtonInternal.getAlpha());
                sendButtonInternal2.setScaleX(sendButtonInternal.getScaleX());
                sendButtonInternal2.setScaleY(sendButtonInternal.getScaleY());
                sendButtonInternal.setVisibility(8);
            }
            this.K0.i(1, starsPrice, true);
            n2(this.L6);
        }
        if (this.o7) {
            V();
            boolean w = w();
            int i = this.R;
            byte b2 = 2;
            if (w) {
                int[] iArr = na7.q1(i).T3;
                b = (iArr == null || iArr.length <= 2) ? 400 : iArr[2];
            } else {
                b = de5.b(i, (int) starsPrice, 1);
            }
            if (this.d0 != b) {
                this.d0 = b;
                if (b > 0) {
                    int i2 = b - this.e0;
                    if (i2 <= (this.o7 ? 5 : 100)) {
                        if (i2 < -9999) {
                            i2 = -9999;
                        }
                        V();
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
                        this.c0.setTextColor(F0(i2 < 0 ? bkb.o7 : bkb.x6));
                        return;
                    }
                }
                NumberTextView numberTextView2 = this.c0;
                if (numberTextView2 != null) {
                    numberTextView2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new aw1(this, b2));
                }
            }
        }
    }

    public final boolean y(boolean z) {
        return z || this.R3 != null || T0() || A2();
    }

    public final void y0() {
        if (this.n6 != null || this.F0 == null) {
            return;
        }
        bn3 bn3Var = new bn3(this.F0);
        this.n6 = bn3Var;
        bn3Var.C = true;
        bn3Var.D = true;
        bn3Var.F = 0.0f;
        bn3Var.E = gl.L(5.0f);
        j92 C0 = C0();
        if (C0 != null) {
            if (this.u6 == null) {
                this.u6 = new om3();
            }
            if (C0.h == null) {
                C0.h = new q31((Object) this, (Object) C0, (byte) 19);
            }
        }
        int max = Math.max(this.F0.getWidth(), gl.q.x);
        bn3 bn3Var2 = this.n6;
        int L = gl.L(160.0f);
        bn3Var2.getClass();
        kra kraVar = bn3Var2.c;
        if (max <= 0 || L <= 0) {
            return;
        }
        int L2 = (gl.L(4.0f) + max) * L;
        int[] iArr = bn3Var2.G;
        if (iArr == null || iArr.length < L2) {
            try {
                bn3Var2.G = new int[L2];
            } catch (Throwable unused) {
            }
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(gl.L(24.0f), gl.L(12.0f), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawColor(-16777216);
            int i = bn3Var2.w;
            int i2 = bn3Var2.x;
            bn3Var2.w = 0;
            bn3Var2.x = createBitmap.getHeight();
            int f = bn3Var2.f(64, createBitmap, true);
            for (int i3 = 0; i3 < f; i3++) {
                float[] fArr = bn3Var2.i;
                int i4 = i3 * 3;
                kraVar.g(fArr[i4], fArr[i4 + 1], 1.0f, -1.0f, 0.05f, 0.0f);
            }
            kraVar.b(canvas, 1.0f);
            kraVar.a();
            bn3Var2.k = 0;
            bn3Var2.w = i;
            bn3Var2.x = i2;
            createBitmap.recycle();
        } catch (Throwable unused2) {
        }
    }

    public final void y1(vf6 vf6Var, boolean z) {
        this.X6 = vf6Var;
        if (vf6Var.m() == 1 && ((TL_bots.BotInfo) vf6Var.n(0)).user_id == this.G3) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) vf6Var.n(0);
            TL_bots.BotMenuButton botMenuButton = botInfo.menu_button;
            if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                this.j0 = tL_botMenuButton.text;
                this.k0 = tL_botMenuButton.url;
                this.p7 = 3;
            } else if (botInfo.commands.isEmpty()) {
                this.p7 = 1;
            } else {
                this.p7 = 2;
            }
        } else {
            this.p7 = 1;
        }
        dp0 dp0Var = this.o0;
        if (dp0Var != null) {
            dp0Var.E(vf6Var);
        }
        h2(z);
        J(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
    
        if (((java.lang.Integer) z3a.B(r9.R).f.g(0, r9.G3)).intValue() > 0) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y2() {
        int i;
        int currentTime = ConnectionsManager.getInstance(this.R).getCurrentTime();
        gl.r(this.I0);
        this.I0 = null;
        TLRPC.ChatFull chatFull = this.T2;
        if (chatFull != null && chatFull.slowmode_seconds != 0 && chatFull.slowmode_next_send_date <= currentTime) {
            boolean z = ((Integer) z3a.B(this.R).h.g(0, this.G3)).intValue() > 0;
            if (!z) {
            }
            if (!hc2.N(na7.q1(this.S.a).K0(Long.valueOf(this.T2.id))) && !hc2.i0(this.T2)) {
                i = this.T2.slowmode_seconds;
                this.H0 = z ? ConnectionsManager.DEFAULT_DATACENTER_ID : 2147483646;
                if (this.H0 != 0 || i <= 0) {
                    this.H0 = 0;
                } else {
                    String h0 = gl.h0(Math.max(1, i), false);
                    ly1 ly1Var = this.G0;
                    ((jia) ly1Var.c).l(h0, false);
                    ly1Var.invalidate();
                    hy1 hy1Var = this.P3;
                    if (hy1Var != null) {
                        hy1Var.O0(ly1Var, ((jia) ly1Var.c).getText(), false);
                    }
                    av1 av1Var = new av1(this, (byte) 21);
                    this.I0 = av1Var;
                    gl.d3(av1Var, 100L);
                }
                if (c()) {
                    N(true);
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
            if (this.T2 != null) {
                na7.q1(this.S.a).Y2(0, this.T2.id, true);
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

    public final boolean z() {
        ep0 ep0Var = this.m0;
        return ep0Var != null && ep0Var.w;
    }

    public final jm3 z0() {
        jm3 jm3Var = this.j1;
        if (jm3Var != null) {
            return jm3Var;
        }
        jm3 jm3Var2 = new jm3(getContext(), new d(this));
        this.j1 = jm3Var2;
        return jm3Var2;
    }

    public final void z1(int i, boolean z, boolean z2) {
        this.e3 = i;
        if (this.f3 == z) {
            return;
        }
        this.f3 = z;
        h2(z2);
    }

    public final long z2(String str, Runnable runnable) {
        long j;
        RecordCircle recordCircle;
        if (this.v3 || this.R3 == null) {
            j = 0;
        } else {
            r1();
            j = 420;
        }
        if (this.v3 || ((recordCircle = this.D2) != null && ChatActivityEnterView.this.h5)) {
            this.Y1 = 0L;
            this.D1 = true;
            try {
                E();
            } finally {
                this.D1 = false;
            }
        }
        gl.d3(new jn1(this, str, runnable, (byte) 7), j);
        return j;
    }

    @Override // bbb
    public gt3 getEditField() {
        return this.F0;
    }

    @Override // bbb
    public mu1 getParentFragment() {
        return this.F3;
    }

    public void U0() {
    }

    public void B0(Menu menu) {
    }

    public void a1(float f) {
    }

    @Override // x74
    public final void F(float f, int i) {
    }

    public void c1(int i, int i2) {
    }
}
