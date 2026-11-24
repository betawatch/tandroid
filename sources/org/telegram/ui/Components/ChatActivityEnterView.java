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
import org.telegram.tgnet.tl.TL_agent;
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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class ChatActivityEnterView extends FrameLayout implements jm7, dla, u2b, ddb, g94, vlb {
    public static final /* synthetic */ int z7 = 0;
    public boolean A0;
    public float A1;
    public tx1 A2;
    public boolean A3;
    public final po A4;
    public p09 A5;
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
    public lta E5;
    public p09 E6;
    public float F;
    public sy1 F0;
    public boolean F1;
    public final ay1 F2;
    public final yv1 F3;
    public Drawable F4;
    public Bitmap F5;
    public final float[] F6;
    public float G;
    public final yz1 G0;
    public long G1;
    public final Paint G2;
    public long G3;
    public Drawable G4;
    public float G5;
    public final float[] G6;
    public float H;
    public int H0;
    public d53 H1;
    public byte H2;
    public boolean H3;
    public final RectF H4;
    public float H5;
    public final int[] H6;
    public float I;
    public mw1 I0;
    public long I1;
    public mw1 I2;
    public byte I3;
    public final Rect I4;
    public float I5;
    public boolean I6;
    public float J;
    public final w2a J0;
    public boolean J1;
    public int J2;
    public k47 J3;
    public final Rect J4;
    public float J5;
    public mw1 J6;
    public boolean K;
    public final by1 K0;
    public boolean K1;
    public n99 K2;
    public k47 K3;
    public Drawable K4;
    public float K5;
    public tc K6;
    public TLRPC.UserFull L;
    public int L0;
    public km0 L1;
    public Editable L2;
    public nv1 L3;
    public final ylb L4;
    public float L5;
    public boolean L6;
    public hg5 M;
    public j67 M0;
    public im0 M1;
    public boolean M2;
    public k47 M3;
    public final boolean M4;
    public float M5;
    public final mw1 M6;
    public hg5 N;
    public long N0;
    public im0 N1;
    public boolean N2;
    public TLRPC.WebPage N3;
    public final dy1 N4;
    public float N5;
    public final ln N6;
    public hg5 O;
    public my1 O0;
    public final Paint O1;
    public boolean O2;
    public boolean O3;
    public final ox1 O4;
    public boolean O5;
    public final ln O6;
    public boolean P;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout P0;
    public float P1;
    public k47 P2;
    public uz1 P3;
    public final ox1 P4;
    public final Paint P5;
    public final cc P6;
    public boolean Q;
    public final ImageView Q0;
    public ValueAnimator Q1;
    public boolean Q2;
    public mz1 Q3;
    public final ox1 Q4;
    public boolean Q5;
    public boolean Q6;
    public int R;
    public final rx1 R0;
    public final int[] R1;
    public TL_account.TL_businessChatLink R2;
    public TLRPC.TL_document R3;
    public final ox1 R4;
    public float R5;
    public boolean R6;
    public j5 S;
    public final ImageView S0;
    public final int[] S1;
    public pz1 S2;
    public String S3;
    public final ox1 S4;
    public float S5;
    public final pn2[] S6;
    public boolean T;
    public tx1 T0;
    public olc T1;
    public TLRPC.ChatFull T2;
    public k47 T3;
    public boolean T4;
    public float T5;
    public byte T6;
    public int U;
    public boolean U0;
    public boolean U1;
    public boolean U2;
    public rcc U3;
    public long U4;
    public float U5;
    public byte U6;
    public gb V;
    public jz1 V0;
    public float V1;
    public int V2;
    public boolean V3;
    public float V4;
    public boolean V5;
    public boolean V6;
    public gx1 W;
    public AnimatorSet W0;
    public ValueAnimator W1;
    public boolean W2;
    public boolean W3;
    public float W4;
    public boolean W5;
    public long W6;
    public boolean X0;
    public final jd X1;
    public boolean X2;
    public boolean X3;
    public float X4;
    public boolean X5;
    public int X6;
    public boolean Y0;
    public long Y1;
    public boolean Y2;
    public k47 Y3;
    public float Y4;
    public boolean Y5;
    public int Y6;
    public zz1 Z0;
    public boolean Z1;
    public boolean Z2;
    public TL_keyboard.KeyboardButtonProto Z3;
    public float Z4;
    public boolean Z5;
    public boolean Z6;
    public int a;
    public lx1 a0;
    public final a a1;
    public SlideTextView a2;
    public boolean a3;
    public boolean a4;
    public float a5;
    public final Paint a6;
    public boolean a7;
    public boolean b;
    public boolean b0;
    public boolean b1;
    public wz1 b2;
    public boolean b3;
    public boolean b4;
    public float b5;
    public float b6;
    public pz b7;
    public a8 c;
    public NumberTextView c0;
    public final zx1 c1;
    public final ela c2;
    public k47 c3;
    public boolean c4;
    public float c5;
    public final Rect c6;
    public bu5 c7;
    public LinearLayout d;
    public int d0;
    public boolean d1;
    public ViewGroup d2;
    public TLRPC.TL_replyKeyboardMarkup d3;
    public boolean d4;
    public float d5;
    public boolean d6;
    public int d7;
    public CharSequence e;
    public int e0;
    public a6 e1;
    public int e2;
    public int e3;
    public int e4;
    public float e5;
    public final mw1 e6;
    public int e7;
    public String f;
    public v43 f0;
    public px1 f1;
    public final qmb f2;
    public boolean f3;
    public boolean f4;
    public float f5;
    public a8 f6;
    public vh6 f7;
    public Runnable g0;
    public tec g1;
    public ViewPropertyAnimator g2;
    public PowerManager.WakeLock g3;
    public boolean g4;
    public boolean g5;
    public ArrayList g6;
    public final Paint g7;
    public float h;
    public boolean h0;
    public s09 h1;
    public final tx1 h2;
    public AnimatorSet h3;
    public final dy1 h4;
    public boolean h5;
    public boolean h6;
    public final LinearGradient h7;
    public boolean i0;
    public l49 i1;
    public final hd i2;
    public AnimatorSet i3;
    public final eg0 i4;
    public int i5;
    public View i6;
    public final Matrix i7;
    public String j0;
    public un3 j1;
    public final ImageView j2;
    public AnimatorSet j3;
    public final ny1 j4;
    public long j5;
    public boolean j6;
    public final ln j7;
    public String k0;
    public boolean k1;
    public final ImageView k2;
    public AnimatorSet k3;
    public final b k4;
    public boolean k5;
    public boolean k6;
    public final ln k7;
    public cw1 l0;
    public boolean l1;
    public float l2;
    public byte l3;
    public final f l4;
    public ValueAnimator l5;
    public boolean l6;
    public c0d l7;
    public eq0 m0;
    public boolean m1;
    public ImageView m2;
    public boolean m3;
    public final Paint m4;
    public final TextPaint m5;
    public dd m6;
    public q02 m7;
    public float n;
    public py1 n0;
    public boolean n1;
    public tx1 n2;
    public int n3;
    public boolean n4;
    public final Paint n5;
    public lo3 n6;
    public final h94 n7;
    public dq0 o0;
    public boolean o1;
    public final px1 o2;
    public int o3;
    public boolean o4;
    public final Paint o5;
    public int o6;
    public final fn0 o7;
    public boolean p0;
    public Drawable p1;
    public final px1 p2;
    public boolean p3;
    public boolean p4;
    public final Path p5;
    public boolean p6;
    public final fn0 p7;
    public m6a q0;
    public final mw1 q1;
    public final px1 q2;
    public int q3;
    public boolean q4;
    public final Path q5;
    public boolean q6;
    public final fn0 q7;
    public float r;
    public hy1 r0;
    public glc r1;
    public final ImageView r2;
    public final boolean r3;
    public AnimatorSet r4;
    public final RectF r5;
    public dy1 r6;
    public float r7;
    public float s;
    public mw1 s0;
    public boolean s1;
    public mi9 s2;
    public long s3;
    public float s4;
    public final int[] s5;
    public long s6;
    public float s7;
    public int t0;
    public boolean t1;
    public boolean t2;
    public float t3;
    public int t4;
    public final int[] t5;
    public long t6;
    public float t7;
    public int u0;
    public float u1;
    public TL_iv.RichMessage u2;
    public float u3;
    public boolean u4;
    public im0 u5;
    public zn3 u6;
    public final int[] u7;
    public mw1 v0;
    public float v1;
    public by1 v2;
    public boolean v3;
    public AnimatedArrowDrawable v4;
    public im0 v5;
    public final RectF v6;
    public final int[] v7;
    public boolean w;
    public ValueAnimator w0;
    public float w1;
    public View w2;
    public int w3;
    public boolean w4;
    public final nf5 w5;
    public boolean w6;
    public boolean w7;
    public Runnable x;
    public float x0;
    public boolean x1;
    public gz1 x2;
    public boolean x3;
    public boolean x4;
    public boolean x5;
    public long x6;
    public int x7;
    public float y;
    public boolean y0;
    public float y1;
    public final ImageView y2;
    public boolean y3;
    public boolean y4;
    public lx1 y5;
    public cw3 y6;
    public int y7;
    public boolean z0;
    public float z1;
    public cy1 z2;
    public boolean z3;
    public final i z4;
    public p09 z5;
    public boolean z6;

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
        public final fl0 h;
        public final fl0 n;
        public final float r;
        public final float s;
        public final RectF w;
        public boolean x;
        public final m y;

        public RecordCircle(Context context) {
            super(context);
            fl0 fl0Var = new fl0(11, 360928);
            this.h = fl0Var;
            fl0 fl0Var2 = new fl0(12, 360928);
            this.n = fl0Var2;
            this.r = gm.N(41.0f);
            this.s = gm.L(30.0f);
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
            kfc.k(this, mVar);
            fl0Var.a = gm.L(47.0f);
            fl0Var.b = gm.L(55.0f);
            fl0Var.b();
            fl0Var2.a = gm.L(47.0f);
            fl0Var2.b = gm.L(55.0f);
            fl0Var2.b();
            float scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            this.F = scaledTouchSlop * scaledTouchSlop;
            h();
        }

        public static float d(float f) {
            float i = Utilities.i(f, 1.0f, 0.0f);
            return i < 0.5f ? mlb.C(i, 4.0f, i, i) : 1.0f - (((float) Math.pow((i * (-2.0f)) + 2.0f, 3.0d)) / 2.0f);
        }

        public static float e(float f) {
            float i = 1.0f - Utilities.i(f, 1.0f, 0.0f);
            return aq1.v(i, i, i, 1.0f);
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
            ylb ylbVar = chatActivityEnterView.L4;
            if (chatActivityEnterView.E4 != null) {
                return;
            }
            Drawable mutate = getResources().getDrawable(R.drawable.input_mic_pressed).mutate();
            chatActivityEnterView.E4 = mutate;
            int i = cmb.Sf;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            anb.x(this, mutate, i, ylbVar, mode);
            Drawable mutate2 = getResources().getDrawable(R.drawable.input_video_pressed).mutate();
            chatActivityEnterView.F4 = mutate2;
            anb.x(this, mutate2, i, ylbVar, mode);
            Drawable mutate3 = getResources().getDrawable(R.drawable.send_plane_24).mutate();
            chatActivityEnterView.G4 = mutate3;
            anb.x(this, mutate3, i, ylbVar, mode);
            Drawable mutate4 = getResources().getDrawable(R.drawable.input_mic).mutate();
            chatActivityEnterView.C4 = mutate4;
            int i2 = cmb.Ml;
            anb.x(this, mutate4, i2, ylbVar, mode);
            Drawable mutate5 = getResources().getDrawable(R.drawable.input_video).mutate();
            chatActivityEnterView.D4 = mutate5;
            anb.x(this, mutate5, i2, ylbVar, mode);
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
                        drawable.setAlpha(nm7.d4);
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
            chatActivityEnterView.V0();
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
            int i = cmb.Tf;
            paint.setColor(chatActivityEnterView.F0(i));
            this.h.d.setColor(on2.p(chatActivityEnterView.F0(i), 38));
            this.n.d.setColor(on2.p(chatActivityEnterView.F0(i), 76));
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
            l49 l49Var;
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
            l49 l49Var2;
            Drawable drawable8;
            Canvas canvas3 = canvas;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            Rect rect2 = chatActivityEnterView.I4;
            Paint paint6 = chatActivityEnterView.B4;
            if (this.O) {
                return;
            }
            if (this.P) {
                int i8 = ChatActivityEnterView.z7;
                Paint paint7 = chatActivityEnterView.P5;
                if (chatActivityEnterView.O5) {
                    if (chatActivityEnterView.F5 != null) {
                        float f32 = chatActivityEnterView.K5 / 1000.0f;
                        float i9 = Utilities.i((f32 - 0.04f) / 0.2f, 1.0f, 0.0f);
                        float R1 = gm.R1(chatActivityEnterView.I5, chatActivityEnterView.J5, i9);
                        if (i9 < 1.0f) {
                            canvas3.save();
                            canvas3.clipRect(R1, chatActivityEnterView.H5, chatActivityEnterView.G5 + chatActivityEnterView.F5.getWidth(), chatActivityEnterView.H5 + chatActivityEnterView.F5.getHeight());
                            paint7.setAlpha((int) ((1.0f - ChatActivityEnterView.L2(0.015f, 0.09f, f32)) * 255.0f));
                            canvas3.drawBitmap(chatActivityEnterView.F5, chatActivityEnterView.G5, chatActivityEnterView.H5, paint7);
                            canvas3.restore();
                        }
                    }
                    lta ltaVar = chatActivityEnterView.E5;
                    if (ltaVar != null && ltaVar.b(canvas3, 1.0f)) {
                        invalidate();
                    }
                }
                this.d = System.currentTimeMillis();
                return;
            }
            int measuredWidth = getMeasuredWidth() - gm.M(26.0f);
            int L = (int) (gm.L(170.0f) + 0.0f);
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
            float interpolation = chatActivityEnterView.g5 ? d53.g.getInterpolation(f - chatActivityEnterView.Y4) * 0.7f : (chatActivityEnterView.Y4 * 0.3f) + 0.7f;
            float f40 = this.s * this.a;
            float f41 = this.r;
            float f42 = (f40 + f41) * f35 * interpolation;
            this.e = 0.0f;
            float f43 = chatActivityEnterView.e5;
            if (f43 != 0.0f) {
                f2 = 0.6f;
                if (chatActivityEnterView.i1 != null) {
                    float f44 = f43 > 0.38f ? f : f43 / 0.38f;
                    float f45 = f43 > 0.63f ? f : aq1.f(f43, 0.38f, 0.25f, 0.0f);
                    this.e = Math.max(0.0f, ((chatActivityEnterView.e5 - 0.38f) - 0.25f) / 0.37f);
                    d53 d53Var = d53.j;
                    f8 = d53Var.getInterpolation(f44);
                    float interpolation2 = d53Var.getInterpolation(f45);
                    this.e = d53Var.getInterpolation(this.e);
                    float L2 = gm.L(8.0f);
                    f3 = f41;
                    float A = td4.A(f, interpolation2, ((gm.L(16.0f) * f8) + f42) - L2, L2);
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
                            float L3 = gm.L(19.0f);
                            if (chatActivityEnterView.E0(fArr2)) {
                                L3 = fArr2[2];
                            }
                            f9 = f8;
                            f4 = gm.R1(f4, L3, chatActivityEnterView.A6);
                        }
                    }
                    if (this.e <= 0.0f) {
                        fArr = fArr2;
                        paint6.setColor(on2.f(this.e, chatActivityEnterView.F0(cmb.Tf), chatActivityEnterView.F0(cmb.ag)));
                    } else {
                        fArr = fArr2;
                        paint6.setColor(chatActivityEnterView.F0(cmb.Tf));
                    }
                    b();
                    if (chatActivityEnterView.h5) {
                        f10 = f4;
                        paint = paint6;
                        f11 = f5;
                        f12 = f42;
                        f13 = 12.0f;
                        drawable = chatActivityEnterView.d1 ? chatActivityEnterView.F4 : chatActivityEnterView.E4;
                        rect2.set(measuredWidth - gm.L(12.0f), L - gm.L(12.0f), gm.L(12.0f) + measuredWidth, gm.L(12.0f) + L);
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
                        rect2.set(aq1.A(i10, measuredWidth, drawable), aq1.y(i10, L, drawable), aq1.w(i10, measuredWidth, drawable), aq1.i(i10, L, drawable));
                        if (drawable8 != null) {
                            drawable8.setBounds(aq1.A(i10, measuredWidth, drawable8), aq1.y(i10, L, drawable8), aq1.w(i10, measuredWidth, drawable8), aq1.i(i10, L, drawable8));
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
                    e = e86.e(360928);
                    fl0 fl0Var = this.n;
                    fl0 fl0Var2 = this.h;
                    if (e) {
                        i2 = 1;
                    } else {
                        fl0Var2.a = gm.L(47.0f);
                        i2 = 1;
                        fl0Var2.b = (gm.L(15.0f) * 0.6f) + gm.L(47.0f);
                        fl0Var.a = gm.L(50.0f);
                        fl0Var.b = (gm.L(f13) * 0.6f) + gm.L(50.0f);
                        fl0Var.f(currentTimeMillis);
                        fl0Var.e(fl0Var.t, 1.01f);
                        fl0Var2.f(currentTimeMillis);
                        fl0Var2.e(fl0Var2.t, 1.02f);
                    }
                    this.d = System.currentTimeMillis();
                    float f53 = chatActivityEnterView.Y4;
                    float f54 = f53 <= 0.7f ? 1.0f : f53 / 0.7f;
                    if (chatActivityEnterView.E1) {
                        float f55 = chatActivityEnterView.b5;
                        if (f55 > 0.0f) {
                            f14 = 1.0f;
                            f15 = 1.0f - d53.g.getInterpolation(Math.min(1.0f, f55));
                            float f56 = (chatActivityEnterView.g0() ? f14 - chatActivityEnterView.A6 : f14) * f15;
                            if (e86.e(360928) || f11 == f14 || ((f46 >= 0.4f && (!chatActivityEnterView.E1 || f56 <= 0.01f)) || f54 <= 0.0f || chatActivityEnterView.g5)) {
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
                                float A2 = td4.A(z2 ? 1.0f : 0.0f, f59, 0.18f, f59);
                                this.Q = A2;
                                if (Math.abs((z2 ? 1.0f : 0.0f) - A2) > 0.01f) {
                                    invalidate();
                                }
                                if (this.N || this.Q >= 0.99f) {
                                    drawable3 = drawable9;
                                    drawable4 = drawable2;
                                } else {
                                    float interpolation3 = (1.0f - this.Q) * d53.g.getInterpolation(this.I);
                                    canvas3.save();
                                    float f60 = 1.0f - f9;
                                    drawable3 = drawable9;
                                    drawable4 = drawable2;
                                    float A3 = mlb.A(fl0Var.t, 1.4f, 0.878f, mlb.C(chatActivityEnterView.W4 * f56, f60, f54, interpolation3));
                                    canvas3.scale(A3, A3, chatActivityEnterView.i5 + measuredWidth, f33);
                                    fl0Var.a(chatActivityEnterView.i5 + measuredWidth, f33, canvas3, fl0Var.d);
                                    canvas3.restore();
                                    float f61 = ((fl0Var2.t * 1.4f) + 0.926f) * f56 * chatActivityEnterView.W4 * f60 * f54 * interpolation3;
                                    canvas3.save();
                                    canvas3.scale(f61, f61, chatActivityEnterView.i5 + measuredWidth, f33);
                                    fl0Var2.a(chatActivityEnterView.i5 + measuredWidth, f33, canvas3, fl0Var2.d);
                                    canvas3.restore();
                                }
                            }
                            float max = (chatActivityEnterView.g5 || chatActivityEnterView.Y4 >= 1.0f) ? f10 : Math.max(f10, gm.L(19.0f));
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
                                    int i11 = (f62 == 0.0f || !chatActivityEnterView.K1 || chatActivityEnterView.d1 || (l49Var2 = chatActivityEnterView.i1) == null || l49Var2.S) ? i3 : i2;
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
                                        float min = Math.min(measuredHeight - y, gm.L(32.0f));
                                        float f67 = (y + measuredHeight) / 2.0f;
                                        float N = gm.N(19.0f);
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
                                            f22 = ((aVar.getWidth() + (r12[i3] - iArr[i3])) - gm.N(3.0f)) - N;
                                            float height = ((aVar.getHeight() + (r12[i2] - iArr[i2])) - gm.N(3.0f)) - N;
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
                                        float A4 = mlb.A(i12, 0.07f, 1.0f, gm.R1(f12, f23, d));
                                        float R12 = gm.R1(f63, f22, d);
                                        float R13 = gm.R1(f33, f24, d);
                                        float e2 = e(f64 / 0.58f);
                                        float f70 = f64 / 0.5f;
                                        float B = mlb.B(i13, 0.09f, 1.0f, gm.R1(Math.min(min, 1.1f * A4) * 0.8f, min, e(f70)));
                                        float L4 = gm.L(16.0f);
                                        if (f64 < 0.5f) {
                                            f25 = i13;
                                            cos = gm.R1(R12 - (A4 * 0.35f), x2 - L4, e(f70));
                                            f19 = f33;
                                        } else {
                                            f25 = i13;
                                            f19 = f33;
                                            cos = x2 - (L4 * ((float) (Math.cos(((max2 * 3.141592653589793d) * 2.0d) * 2.6d) * Math.exp((-max2) * 13.0f))));
                                        }
                                        float R14 = gm.R1((R12 - (A4 * 0.35f)) - B, x, d((f64 - 0.16f) / 0.6f)) - (gm.L(5.0f) * f25);
                                        float R15 = gm.R1(R13, f67, e2);
                                        float min2 = Math.min(R14, cos - B);
                                        float f71 = B / 2.0f;
                                        RectF rectF4 = this.U;
                                        rectF4.set(min2, R15 - f71, cos, R15 + f71);
                                        int f72 = on2.f(d((f64 - 0.6f) / 0.4f), chatActivityEnterView.F0(cmb.Tf), chatActivityEnterView.F0(cmb.Oe));
                                        Paint paint8 = this.T;
                                        paint8.setColor(f72);
                                        paint8.setAlpha((int) (this.E * 1.0f));
                                        Path path2 = this.S;
                                        path2.rewind();
                                        Path.Direction direction = Path.Direction.CW;
                                        path2.addCircle(R12, R13, A4, direction);
                                        float f73 = cos - f71;
                                        if (f64 < 0.5f) {
                                            f28 = d;
                                            float max3 = Math.max(gm.N(0.6f), 0.85f * f71 * ((float) Math.pow(1.0d - Math.pow(f70, 1.4d), 1.2d)));
                                            float f74 = R12 - f73;
                                            if (f74 <= 0.0f) {
                                                f29 = A4;
                                                f27 = R13;
                                                paint4 = paint8;
                                                f26 = R12;
                                                path = path2;
                                            } else {
                                                double i14 = (Utilities.i(1.0f - (((f74 - f71) - A4) / (f71 + A4)), 1.0f, 0.15f) * 45.0f) + 25.0f;
                                                float radians = (float) Math.toRadians(i14);
                                                float radians2 = (float) Math.toRadians(i14);
                                                double d2 = radians;
                                                float cos2 = (((float) Math.cos(d2)) * f71) + f73;
                                                float sin = R15 - (((float) Math.sin(d2)) * f71);
                                                float sin2 = (((float) Math.sin(d2)) * f71) + R15;
                                                double d3 = radians2;
                                                float cos3 = R12 - (((float) Math.cos(d3)) * A4);
                                                f29 = A4;
                                                f27 = R13;
                                                float sin3 = f27 - (((float) Math.sin(d3)) * f29);
                                                f26 = R12;
                                                float sin4 = (((float) Math.sin(d3)) * f29) + f27;
                                                float f75 = (cos2 + cos3) / 2.0f;
                                                float f76 = (R15 + f27) / 2.0f;
                                                path2.moveTo(cos2, sin);
                                                float f77 = f76 - max3;
                                                paint4 = paint8;
                                                path2.cubicTo(gm.R1(cos2, f75, 0.55f), gm.R1(sin, f77, 0.9f), gm.R1(f75, cos2, 0.3f), f77, f75, f77);
                                                path2.cubicTo(gm.R1(f75, cos3, 0.3f), f77, gm.R1(cos3, f75, 0.55f), gm.R1(sin3, f77, 0.9f), cos3, sin3);
                                                path = path2;
                                                path.lineTo(cos3, sin4);
                                                float R16 = gm.R1(cos3, f75, 0.55f);
                                                float f78 = f76 + max3;
                                                path2.cubicTo(R16, gm.R1(sin4, f78, 0.9f), gm.R1(f75, cos3, 0.3f), f78, f75, f78);
                                                path2.cubicTo(gm.R1(f75, cos2, 0.3f), f78, gm.R1(cos2, f75, 0.55f), gm.R1(sin2, f78, 0.9f), cos2, sin2);
                                                path.close();
                                            }
                                        } else {
                                            f26 = R12;
                                            f27 = R13;
                                            f28 = d;
                                            paint4 = paint8;
                                            path = path2;
                                            f29 = A4;
                                        }
                                        int i15 = f64 >= 0.5f ? i2 : i3;
                                        if (i15 == 0) {
                                            path.addRoundRect(rectF4, f71, f71, direction);
                                            l49 l49Var3 = chatActivityEnterView.i1;
                                            l49Var3.Q.set(rectF4);
                                            l49Var3.R = -1.0f;
                                            l49Var3.invalidate();
                                            rectF = rectF3;
                                        } else {
                                            getLocationInWindow(iArr3);
                                            chatActivityEnterView.i1.getLocationInWindow(iArr2);
                                            rectF = rectF3;
                                            rectF.set(rectF4);
                                            rectF.offset(iArr3[i3] - iArr2[i3], iArr3[i2] - iArr2[i2]);
                                            l49 l49Var4 = chatActivityEnterView.i1;
                                            float e3 = (e(f69 / 0.5f) * 0.65f) + 0.35f;
                                            l49Var4.Q.set(rectF);
                                            l49Var4.R = e3;
                                            l49Var4.invalidate();
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
                                                centerX = gm.R1(centerX, f80, f82);
                                                f79 = gm.R1(f79, f81, f82);
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
                                            l49 l49Var5 = chatActivityEnterView.i1;
                                            l49Var5.Q.set(rectF2);
                                            l49Var5.R = 1.0f;
                                            l49Var5.invalidate();
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
                                        } else if (chatActivityEnterView.d1 || this.e <= 0.0f || (l49Var = chatActivityEnterView.i1) == null || (chatActivityEnterView.K1 && l49Var.S)) {
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
                                            for (View view2 = (View) l49Var.getParent(); view2 != getParent(); view2 = (View) view2.getParent()) {
                                                i16 = (int) (view2.getY() + i16);
                                                i17 = (int) (view2.getX() + i17);
                                            }
                                            float f88 = i16;
                                            float y2 = (l49Var.getY() + f88) - getY();
                                            float y3 = ((l49Var.getY() + l49Var.getMeasuredHeight()) + f88) - getY();
                                            float f89 = i17;
                                            float x3 = (((l49Var.getX() + l49Var.getMeasuredWidth()) + f89) - getX()) - chatActivityEnterView.J;
                                            float x4 = ((l49Var.getX() + f89) - getX()) + chatActivityEnterView.J;
                                            if (!chatActivityEnterView.d1) {
                                                l49Var.getMeasuredHeight();
                                            }
                                            rectF3.set(gm.R1(f87, x4, this.e), gm.R1(f84, y2, this.e), gm.R1(f86, x3, this.e), gm.R1(f83, y3, this.e));
                                            if (chatActivityEnterView.K1) {
                                                getLocationInWindow(chatActivityEnterView.R1);
                                                chatActivityEnterView.i1.getLocationInWindow(chatActivityEnterView.S1);
                                                int i18 = chatActivityEnterView.R1[i3];
                                                int[] iArr5 = chatActivityEnterView.S1;
                                                rectF3.offset(i18 - iArr5[i3], r2[i2] - iArr5[i2]);
                                                l49 l49Var6 = chatActivityEnterView.i1;
                                                float f90 = this.e;
                                                l49Var6.Q.set(rectF3);
                                                l49Var6.R = f90;
                                                l49Var6.invalidate();
                                            } else {
                                                chatActivityEnterView.i1.a(canvas3, rectF3, this.e);
                                            }
                                        }
                                        if (i5 != 0) {
                                            canvas3.save();
                                            float f91 = f21 - f46;
                                            canvas3.translate(chatActivityEnterView.i5, 0.0f);
                                            float L5 = (max - gm.L(19.0f)) / Math.max(f21, f3 - gm.L(19.0f));
                                            this.d0 = L5 < 0.0f ? 0.0f : L5 > f21 ? f21 : L5;
                                            int z3 = (int) td4.z(f21, f11, f91, 255.0f);
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
                                                    int round = Math.round(gm.R1(f94, f92, f96));
                                                    int round2 = Math.round(gm.R1(f95, f93, f96));
                                                    drawable7.setBounds(round, round2, intrinsicWidth + round, intrinsicHeight + round2);
                                                    this.d0 = 1.0f - f96;
                                                    z3 = (int) (f91 * 255.0f);
                                                }
                                            }
                                            int i19 = z3;
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
                                                float R17 = gm.R1(0.6f, 1.0f, this.Q) * gm.N(6.5f);
                                                Paint paint9 = this.R;
                                                paint9.setColor(-1);
                                                paint9.setAlpha((int) (f98 * this.Q));
                                                RectF rectF5 = gm.P;
                                                i4 = i6;
                                                float f99 = i4;
                                                rectF5.set(f99 - R17, f17 - R17, f99 + R17, R17 + f17);
                                                canvas3.drawRoundRect(rectF5, gm.N(f20), gm.N(f20), paint9);
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
                                float L6 = (max - gm.L(19.0f)) / Math.max(1.0f, f3 - gm.L(19.0f));
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
                    if (e86.e(360928)) {
                    }
                    drawable3 = drawable9;
                    drawable4 = drawable2;
                    f16 = 0.01f;
                    i3 = 0;
                    float max4 = (chatActivityEnterView.g5 || chatActivityEnterView.Y4 >= 1.0f) ? f10 : Math.max(f10, gm.L(19.0f));
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
                    f101 = aq1.f(f101, f2, 0.4f, 0.0f);
                }
                d53 d53Var2 = d53.j;
                f8 = d53Var2.getInterpolation(f102);
                float interpolation4 = d53Var2.getInterpolation(f101);
                float L7 = ((gm.L(16.0f) * f8) + f42) * (1.0f - interpolation4);
                if (e86.e(360928)) {
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
            e = e86.e(360928);
            fl0 fl0Var3 = this.n;
            fl0 fl0Var22 = this.h;
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
            if (e86.e(360928)) {
            }
            drawable3 = drawable92;
            drawable4 = drawable2;
            f16 = 0.01f;
            i3 = 0;
            float max42 = (chatActivityEnterView.g5 || chatActivityEnterView.Y4 >= 1.0f) ? f10 : Math.max(f10, gm.L(19.0f));
            if (this.N) {
            }
            if (chatActivityEnterView.W4 != 1.0f) {
            }
            this.M = max42;
        }

        @Override // android.view.View
        public final void onMeasure(int i, int i2) {
            View.MeasureSpec.getSize(i);
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(194.0f), TLObject.FLAG_30));
            float measuredWidth = getMeasuredWidth() * 0.35f;
            if (measuredWidth > gm.L(140.0f)) {
                measuredWidth = gm.L(140.0f);
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
    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public class SlideTextView extends View {
        public StaticLayout E;
        public StaticLayout F;
        public boolean G;
        public boolean H;
        public final Rect I;
        public fg0 J;
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
            boolean z = gm.q.x <= gm.L(320.0f);
            this.L = z;
            TextPaint textPaint = new TextPaint(1);
            this.a = textPaint;
            textPaint.setTextSize(gm.L(z ? 13.0f : 15.0f));
            TextPaint textPaint2 = new TextPaint(1);
            this.b = textPaint2;
            hg9.o(textPaint2, gm.L(15.0f));
            int i = cmb.Ml;
            int i2 = ChatActivityEnterView.z7;
            paint.setColor(ChatActivityEnterView.this.F0(i));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(gm.N(z ? 1.0f : 1.6f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            String M0 = jb6.M0(2131745047, null);
            this.d = M0;
            String M02 = jb6.M0(2131752542, "Cancel");
            this.e = M02;
            this.x = M0.toLowerCase().indexOf(M02.toLowerCase());
            b();
        }

        public final void a() {
            this.r = 1.0f;
        }

        public final void b() {
            int i = cmb.dg;
            int i2 = ChatActivityEnterView.z7;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            int F0 = chatActivityEnterView.F0(i);
            TextPaint textPaint = this.a;
            textPaint.setColor(F0);
            int i3 = cmb.cg;
            int F02 = chatActivityEnterView.F0(i3);
            this.b.setColor(F02);
            textPaint.getAlpha();
            this.s = r4.getAlpha();
            fg0 h0 = cmb.h0(gm.L(60.0f), 0, on2.p(chatActivityEnterView.F0(i3), 26));
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
            fg0 fg0Var = this.J;
            if (fg0Var != null) {
                fg0Var.jumpToCurrentState();
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
                int L2 = gm.L(16.0f) + staticLayout.getWidth();
                int F0 = (gm.B(chatActivityEnterView.F0(cmb.c6)) >= 0.5f || (lVar = chatActivityEnterView.E2) == null) ? chatActivityEnterView.F0(cmb.dg) : lVar.s.getColor();
                TextPaint textPaint = this.a;
                textPaint.setColor(F0);
                textPaint.setAlpha((int) ((1.0f - this.n) * Color.alpha(F0) * this.r));
                this.b.setAlpha((int) (this.s * this.n));
                int color = textPaint.getColor();
                Paint paint = this.c;
                paint.setColor(color);
                boolean z = this.L;
                if (z) {
                    this.w = gm.L(16.0f);
                } else {
                    System.currentTimeMillis();
                    System.currentTimeMillis();
                    if (this.n == 0.0f && this.r > 0.8f) {
                        float currentTimeMillis = (System.currentTimeMillis() % 2000) / 2000.0f;
                        this.w = (-gm.L(6.0f)) * (currentTimeMillis < 0.5f ? (currentTimeMillis * 4.0f) - 1.0f : 3.0f - (currentTimeMillis * 4.0f));
                    }
                }
                int i = this.x;
                boolean z2 = i >= 0;
                int L3 = gm.L(5.0f) + ((int) ((getMeasuredWidth() - this.f) / 2.0f));
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
                float L4 = (((((1.0f - f8) * f7) * this.r) + f6) - (f3 * f8)) + gm.L(16.0f);
                float L5 = z2 ? 0.0f : this.n * gm.L(12.0f);
                if (this.n != 1.0f) {
                    f4 = 12.0f;
                    int translationX = (int) ((chatActivityEnterView.D2.getTranslationX() * 0.3f) + ((1.0f - this.r) * ((-getMeasuredWidth()) / 4)));
                    canvas.save();
                    zz1 zz1Var = chatActivityEnterView.Z0;
                    f5 = 2.0f;
                    canvas.clipRect((zz1Var == null ? 0.0f : zz1Var.getLeftProperty()) + gm.L(f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    canvas.save();
                    int i2 = (int) L4;
                    canvas.translate((i2 - gm.L(z ? 7.0f : 10.0f)) + translationX, L5);
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
                    L = (L4 + f2) - (gm.L(16.0f) * this.n);
                } else {
                    measuredHeight -= gm.L(f4) - L5;
                    L = measuredWidth;
                }
                Rect rect = this.I;
                rect.set((int) L, (int) measuredHeight, (int) (this.F.getWidth() + L), (int) (this.F.getHeight() + measuredHeight));
                rect.inset(-gm.L(16.0f), -gm.L(16.0f));
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
                    path.setLastPoint(gm.N(2.5f), f - gm.N(3.12f));
                    path.lineTo(0.0f, f);
                    path.lineTo(gm.N(2.5f), gm.N(3.12f) + f);
                } else {
                    float f2 = measuredHeight2;
                    path.setLastPoint(gm.N(4.0f), f2 - gm.N(5.0f));
                    path.lineTo(0.0f, f2);
                    path.lineTo(gm.N(4.0f), gm.N(5.0f) + f2);
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
                    chatActivityEnterView.P3.F1(5, 0, chatActivityEnterView.P ? Integer.MAX_VALUE : 0, chatActivityEnterView.W6, 0L, true);
                    by1 by1Var = chatActivityEnterView.K0;
                    chatActivityEnterView.W6 = 0L;
                    by1Var.setEffect(0L);
                } else {
                    chatActivityEnterView.P3.z0(0);
                    MediaController.w().A0(0, 0, false, chatActivityEnterView.P);
                }
                chatActivityEnterView.R3 = null;
                chatActivityEnterView.T3 = null;
                chatActivityEnterView.U3 = null;
                chatActivityEnterView.Y1 = 0L;
                chatActivityEnterView.v3 = false;
                hs6 d0 = hs6.d0(chatActivityEnterView.R);
                long j2 = chatActivityEnterView.G3;
                yv1 yv1Var = chatActivityEnterView.F3;
                if (yv1Var != null && yv1Var.x4) {
                    j = yv1Var.d();
                }
                d0.D1(j2, j, null);
                chatActivityEnterView.w2(2, true);
                chatActivityEnterView.M(true);
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

    public ChatActivityEnterView(Activity activity, ela elaVar, yv1 yv1Var, boolean z, final ylb ylbVar) {
        super(activity);
        String str;
        int i;
        uz1 uz1Var;
        this.h = 1.0f;
        this.n = 1.0f;
        this.r = 1.0f;
        this.s = 1.0f;
        this.F = 1.0f;
        this.G = 1.0f;
        this.J = 0.0f;
        final byte b = 1;
        this.K = true;
        int i2 = z8c.t0;
        this.R = i2;
        this.S = j5.a(i2);
        this.U = 1;
        this.d0 = -1;
        this.x7 = 1;
        this.y0 = true;
        this.z0 = true;
        this.A0 = true;
        this.C0 = new HashMap();
        this.D0 = false;
        this.E0 = false;
        this.q1 = new mw1(this, (byte) 21);
        this.z1 = 1.0f;
        this.C1 = new SparseArray();
        this.O1 = new Paint(1);
        byte b2 = 2;
        this.R1 = new int[2];
        this.S1 = new int[2];
        this.X1 = new jd(this, (byte) 19);
        this.l2 = 1.0f;
        this.V2 = -1;
        this.Z2 = true;
        this.t3 = -1.0f;
        this.u3 = gm.L(80.0f);
        this.D3 = new int[2];
        this.O3 = true;
        this.e4 = -1;
        this.g4 = true;
        this.h4 = new dy1(this, (byte) 0);
        this.i4 = new eg0(this);
        this.j4 = new ny1(Integer.class, "translationY", (byte) 0);
        this.k4 = new b(Float.class, "scale");
        this.l4 = new f(Float.class, "controlsScale");
        this.m4 = new Paint(1);
        this.z4 = new i(this);
        this.A4 = new po(null);
        this.B4 = new Paint(1);
        this.H4 = new RectF();
        this.I4 = new Rect();
        this.J4 = new Rect();
        this.N4 = new dy1(this, b2);
        this.O4 = new ox1(this, (byte) 4);
        this.P4 = new ox1(this, (byte) 0);
        this.Q4 = new ox1(this, (byte) 1);
        this.R4 = new ox1(this, (byte) 2);
        this.S4 = new ox1(this, (byte) 3);
        this.m5 = new TextPaint(1);
        this.n5 = new Paint(1);
        this.o5 = new Paint(1);
        this.p5 = new Path();
        this.q5 = new Path();
        this.r5 = new RectF();
        this.s5 = new int[2];
        this.t5 = new int[2];
        this.w5 = new nf5((byte) 15);
        this.P5 = new Paint(2);
        this.T5 = 1.0f;
        this.U5 = 1.0f;
        this.W5 = true;
        this.X5 = true;
        this.a6 = new Paint();
        this.b6 = 1.0f;
        this.c6 = new Rect();
        this.e6 = new mw1(this, (byte) 4);
        this.h6 = true;
        this.o6 = -1;
        this.v6 = new RectF();
        this.F6 = new float[2];
        this.G6 = new float[2];
        this.H6 = new int[2];
        this.M6 = new mw1(this, (byte) 5);
        d53 d53Var = d53.h;
        this.N6 = new ln(this, 0L, 280L, d53Var);
        this.O6 = new ln(this, 0L, 280L, d53Var);
        this.P6 = new cc(this, b2);
        this.S6 = new pn2[1];
        this.y7 = 1;
        this.d7 = -1;
        Paint paint = new Paint(1);
        this.g7 = paint;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.h7 = linearGradient;
        this.i7 = new Matrix();
        this.j7 = new ln(this, 0L, 280L, d53Var);
        this.k7 = new ln(this, 0L, 280L, d53Var);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setShader(linearGradient);
        d53 d53Var2 = wb2.V;
        this.n7 = new h94(0, this, d53Var2, 250L);
        this.o7 = new fn0(1, this, d53Var2, 250L, false);
        this.p7 = new fn0(2, this, d53Var, 320L, false);
        this.q7 = new fn0(3, this, d53Var, 320L, false);
        this.u7 = new int[2];
        this.v7 = new int[2];
        this.L4 = ylbVar;
        this.M4 = z;
        this.Y2 = z && !gm.E && (yv1Var == null || !yv1Var.isInBubbleMode());
        Paint paint2 = new Paint(1);
        this.G2 = paint2;
        paint2.setColor(F0(cmb.Rf));
        setFocusable(true);
        setFocusableInTouchMode(true);
        setWillNotDraw(false);
        setClipChildren(false);
        nm7.f(this.R).b(this, nm7.l2);
        nm7.f(this.R).b(this, nm7.o2);
        nm7.f(this.R).b(this, nm7.p2);
        nm7.f(this.R).b(this, nm7.m2);
        nm7.f(this.R).b(this, nm7.Y5);
        nm7.f(this.R).b(this, nm7.c4);
        nm7.f(this.R).b(this, nm7.n2);
        nm7.f(this.R).b(this, nm7.k2);
        nm7.f(this.R).b(this, nm7.s);
        nm7.f(this.R).b(this, nm7.s2);
        nm7.f(this.R).b(this, nm7.u2);
        nm7.f(this.R).b(this, nm7.e2);
        nm7.f(this.R).b(this, nm7.z0);
        nm7.f(this.R).b(this, nm7.K);
        nm7.f(this.R).b(this, nm7.n1);
        nm7.f(this.R).b(this, nm7.t2);
        nm7.f(this.R).b(this, nm7.T2);
        nm7.f(this.R).b(this, nm7.a3);
        nm7.f(this.R).b(this, nm7.j5);
        nm7.f(this.R).b(this, nm7.S3);
        nm7.e().b(this, nm7.m4);
        this.E3 = activity;
        this.F3 = yv1Var;
        if (yv1Var != null) {
            this.w3 = yv1Var.getClassGuid();
        }
        this.c2 = elaVar;
        this.d2 = elaVar;
        elaVar.setDelegate(this);
        this.r3 = oc7.d1().getBoolean("send_by_enter", false);
        px1 px1Var = new px1(this, activity, (byte) 0);
        this.p2 = px1Var;
        px1Var.setClipChildren(false);
        px1Var.setClipToPadding(false);
        px1Var.setPadding(0, gm.L(1.0f), 0, 0);
        addView(px1Var, qoe.d(-1, -2.0f, 83, 0.0f, 1.0f, 0.0f, 0.0f));
        px1 px1Var2 = new px1(this, activity, b);
        this.o2 = px1Var2;
        px1Var2.setClipChildren(false);
        px1Var.addView(px1Var2, qoe.d(-1, -2.0f, 80, 0.0f, 0.0f, 44.0f, 0.0f));
        rx1 rx1Var = new rx1(this, activity);
        this.R0 = rx1Var;
        rx1Var.setContentDescription(jb6.M0(2131754884, null));
        rx1Var.setFocusable(true);
        int L = gm.L(7.5f);
        rx1Var.setPadding(L, L, L, L);
        int i3 = cmb.Ml;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        anb.s(rx1Var, i3, ylbVar, mode);
        int i4 = cmb.h6;
        int F0 = F0(i4);
        float L2 = gm.L(19.0f);
        int L3 = gm.L(1.0f);
        int L4 = gm.L(3.0f);
        rx1Var.setBackground(cmb.W(L2, F0, L3, L4, L3, L4));
        rx1Var.setOnClickListener(new rw1(this, b2));
        px1Var2.addView(rx1Var, qoe.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        H1(false, false);
        ImageView imageView = new ImageView(activity);
        this.S0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.menu_delete_old);
        anb.s(imageView, i3, ylbVar, mode);
        int F02 = F0(i4);
        float L5 = gm.L(19.0f);
        int L6 = gm.L(1.0f);
        int L7 = gm.L(3.0f);
        imageView.setBackground(cmb.W(L5, F02, L6, L7, L6, L7));
        imageView.setVisibility(8);
        imageView.setContentDescription(jb6.M0(2131754003, null));
        final byte b3 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: zw1
            public final /* synthetic */ ChatActivityEnterView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (b3) {
                    case 0:
                        int i5 = ChatActivityEnterView.z7;
                        ChatActivityEnterView chatActivityEnterView = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, chatActivityEnterView.getContext());
                        String M0 = jb6.M0(2131754001, null);
                        he heVar = alertDialog$Builder.a;
                        heVar.S = M0;
                        heVar.U = jb6.M0(2131754002, null);
                        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                        alertDialog$Builder.j(jb6.M0(2131751535, null), new dx1(chatActivityEnterView));
                        alertDialog$Builder.c(-1);
                        alertDialog$Builder.o();
                        break;
                    default:
                        int i6 = ChatActivityEnterView.z7;
                        oc7.d1().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.b;
                        yv1 yv1Var2 = chatActivityEnterView2.F3;
                        long a = yv1Var2 != null ? yv1Var2.a() : chatActivityEnterView2.G3;
                        boolean z2 = chatActivityEnterView2.t2;
                        ylb ylbVar2 = ylbVar;
                        if (!z2) {
                            if (chatActivityEnterView2.F0 != null) {
                                a1 a1Var = new a1(chatActivityEnterView2.getContext(), ylbVar2);
                                a1Var.o1(chatActivityEnterView2.F0.getText());
                                a1Var.R2 = new gx1(chatActivityEnterView2, (byte) 10);
                                a1Var.e2 = new ix1(chatActivityEnterView2, (byte) 2);
                                a1Var.m1(a, chatActivityEnterView2.P2 != null, new jx1(chatActivityEnterView2, a, ylbVar2, (byte) 1));
                                a1Var.show();
                                break;
                            }
                        } else if (chatActivityEnterView2.u2 != null) {
                            a1 a1Var2 = new a1(chatActivityEnterView2.getContext(), ylbVar2);
                            a1Var2.n1(chatActivityEnterView2.u2);
                            a1Var2.f2 = new ix1(chatActivityEnterView2, (byte) 1);
                            jx1 jx1Var = new jx1(chatActivityEnterView2, a, ylbVar2, (byte) 0);
                            a1Var2.g2 = a;
                            a1Var2.j2 = jx1Var;
                            a1Var2.show();
                            break;
                        }
                        break;
                }
            }
        });
        px1Var2.addView(imageView, qoe.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        if (z) {
            int i5 = yv1Var != null ? yv1Var.g4 : -1;
            qmb qmbVar = new qmb((byte) 3, activity, this);
            this.f2 = qmbVar;
            qmbVar.setOrientation(0);
            qmbVar.setEnabled(false);
            qmbVar.setClipChildren(false);
            px1Var2.addView(qmbVar, qoe.d(-2, 44.0f, 85, 0.0f, 0.0f, 44.0f, 0.0f));
            if (i5 != 9) {
                ImageView imageView2 = new ImageView(activity);
                this.y2 = imageView2;
                v43 v43Var = new v43(activity, R.drawable.input_notify_on, i3);
                this.f0 = v43Var;
                imageView2.setImageDrawable(v43Var);
                this.f0.a(this.W2, false);
                if (this.W2) {
                    str = "AccDescrChanSilentOn";
                    i = 2131754906;
                } else {
                    str = "AccDescrChanSilentOff";
                    i = 2131754907;
                }
                imageView2.setContentDescription(jb6.M0(i, str));
                anb.s(imageView2, i3, ylbVar, PorterDuff.Mode.MULTIPLY);
                imageView2.setScaleType(scaleType);
                fg0 f0 = cmb.f0(F0(i4), 1, -1);
                wmb M = anb.M(i4);
                imageView2.setBackground(f0);
                anb.j(imageView2, f0, null, M, ylbVar);
                imageView2.setVisibility((!this.X2 || ((uz1Var = this.P3) != null && uz1Var.b0())) ? 8 : 0);
                qmbVar.addView(imageView2, qoe.o(44, 44));
                imageView2.setOnClickListener(new sx1(this, yv1Var, activity));
            }
            tx1 tx1Var = new tx1(this, activity, (byte) 0);
            this.h2 = tx1Var;
            tx1Var.setScaleType(scaleType);
            anb.s(tx1Var, i3, ylbVar, PorterDuff.Mode.MULTIPLY);
            tx1Var.setImageResource(R.drawable.msg_input_attach2);
            fg0 f02 = cmb.f0(F0(i4), 1, -1);
            wmb M2 = anb.M(i4);
            tx1Var.setBackground(f02);
            anb.j(tx1Var, f02, null, M2, ylbVar);
            px1Var2.addView(tx1Var, qoe.e(44, 44, 85));
            tx1Var.setOnClickListener(new rw1(this, (byte) 3));
            tx1Var.setContentDescription(jb6.M0(2131754921, null));
            s2(1);
        }
        ImageView imageView3 = new ImageView(activity);
        this.j2 = imageView3;
        hd hdVar = new hd(activity);
        this.i2 = hdVar;
        imageView3.setImageDrawable(hdVar);
        imageView3.setScaleType(scaleType);
        PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
        anb.s(imageView3, i3, ylbVar, mode2);
        fg0 f03 = cmb.f0(F0(i4), 1, gm.L(16.0f));
        wmb M3 = anb.M(i4);
        imageView3.setBackground(f03);
        anb.j(imageView3, f03, null, M3, ylbVar);
        px1Var.addView(imageView3, qoe.d(44, 44.0f, 51, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView3.setContentDescription(jb6.M0(2131755006, null));
        rve.a(imageView3);
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: zw1
            public final /* synthetic */ ChatActivityEnterView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (b) {
                    case 0:
                        int i52 = ChatActivityEnterView.z7;
                        ChatActivityEnterView chatActivityEnterView = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, chatActivityEnterView.getContext());
                        String M0 = jb6.M0(2131754001, null);
                        he heVar = alertDialog$Builder.a;
                        heVar.S = M0;
                        heVar.U = jb6.M0(2131754002, null);
                        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                        alertDialog$Builder.j(jb6.M0(2131751535, null), new dx1(chatActivityEnterView));
                        alertDialog$Builder.c(-1);
                        alertDialog$Builder.o();
                        break;
                    default:
                        int i6 = ChatActivityEnterView.z7;
                        oc7.d1().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.b;
                        yv1 yv1Var2 = chatActivityEnterView2.F3;
                        long a = yv1Var2 != null ? yv1Var2.a() : chatActivityEnterView2.G3;
                        boolean z2 = chatActivityEnterView2.t2;
                        ylb ylbVar2 = ylbVar;
                        if (!z2) {
                            if (chatActivityEnterView2.F0 != null) {
                                a1 a1Var = new a1(chatActivityEnterView2.getContext(), ylbVar2);
                                a1Var.o1(chatActivityEnterView2.F0.getText());
                                a1Var.R2 = new gx1(chatActivityEnterView2, (byte) 10);
                                a1Var.e2 = new ix1(chatActivityEnterView2, (byte) 2);
                                a1Var.m1(a, chatActivityEnterView2.P2 != null, new jx1(chatActivityEnterView2, a, ylbVar2, (byte) 1));
                                a1Var.show();
                                break;
                            }
                        } else if (chatActivityEnterView2.u2 != null) {
                            a1 a1Var2 = new a1(chatActivityEnterView2.getContext(), ylbVar2);
                            a1Var2.n1(chatActivityEnterView2.u2);
                            a1Var2.f2 = new ix1(chatActivityEnterView2, (byte) 1);
                            jx1 jx1Var = new jx1(chatActivityEnterView2, a, ylbVar2, (byte) 0);
                            a1Var2.g2 = a;
                            a1Var2.j2 = jx1Var;
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
        anb.s(imageView4, i3, ylbVar, mode2);
        fg0 f04 = cmb.f0(F0(i4), 1, gm.L(16.0f));
        wmb M4 = anb.M(i4);
        imageView4.setBackground(f04);
        anb.j(imageView4, f04, null, M4, ylbVar);
        px1Var.addView(imageView4, qoe.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(jb6.M0(2131753998, null));
        rve.a(imageView4);
        imageView4.setOnClickListener(new rw1(this, (byte) 4));
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
        anb.s(imageView5, cmb.Xl, ylbVar, mode);
        px1Var.addView(imageView5, qoe.e(44, 44, 85));
        px1 px1Var3 = new px1(this, activity, (byte) 2);
        this.q2 = px1Var3;
        px1Var3.setClipChildren(false);
        px1Var3.setClipToPadding(false);
        px1Var.addView(px1Var3, qoe.e(100, 44, 85));
        a aVar = new a(this, activity, ylbVar);
        this.a1 = aVar;
        aVar.setSoundEffectsEnabled(false);
        px1Var3.addView(aVar, qoe.e(44, 44, 85));
        aVar.setFocusable(true);
        aVar.setImportantForAccessibility(1);
        Drawable mutate = getResources().getDrawable(R.drawable.input_mic).mutate();
        this.C4 = mutate;
        anb.x(this, mutate, i3, ylbVar, mode2);
        Drawable mutate2 = getResources().getDrawable(R.drawable.input_video).mutate();
        this.D4 = mutate2;
        anb.x(this, mutate2, i3, ylbVar, mode2);
        zx1 zx1Var = new zx1(this, activity);
        this.c1 = zx1Var;
        zx1Var.setImportantForAccessibility(2);
        int L8 = gm.L(10.0f);
        zx1Var.setPadding(L8, L8, L8, L8);
        aVar.addView(zx1Var, qoe.c(44.0f, 44));
        ImageView imageView6 = new ImageView(activity);
        this.Q0 = imageView6;
        imageView6.setVisibility(4);
        imageView6.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ay1 ay1Var = new ay1();
        this.F2 = ay1Var;
        imageView6.setImageDrawable(ay1Var);
        imageView6.setContentDescription(jb6.M0(2131752542, "Cancel"));
        imageView6.setSoundEffectsEnabled(false);
        imageView6.setScaleX(0.1f);
        imageView6.setScaleY(0.1f);
        imageView6.setAlpha(0.0f);
        fg0 f05 = cmb.f0(F0(i4), 1, -1);
        wmb M5 = anb.M(i4);
        imageView6.setBackground(f05);
        anb.j(imageView6, f05, null, M5, ylbVar);
        px1Var3.addView(imageView6, qoe.e(44, 44, 85));
        imageView6.setOnClickListener(new rw1(this, (byte) 9));
        by1 by1Var = new by1(this, activity, c() ? R.drawable.input_schedule : R.drawable.send_plane_24, ylbVar);
        this.K0 = by1Var;
        by1Var.setVisibility(4);
        by1Var.setContentDescription(jb6.M0(2131745374, null));
        byte b4 = 0;
        by1Var.setSoundEffectsEnabled(false);
        by1Var.setScaleX(0.1f);
        by1Var.setScaleY(0.1f);
        by1Var.setAlpha(0.0f);
        px1Var3.addView(by1Var, qoe.e(100, 44, 85));
        by1Var.setOnClickListener(new rw1(this, (byte) 12));
        by1Var.setOnLongClickListener(new hx1(this, b4));
        if (gm.A1()) {
            px1Var3.setOnLongClickListener(new hx1(this, b4));
        }
        w2a w2aVar = new w2a(activity, ylbVar);
        this.J0 = w2aVar;
        w2aVar.setVisibility(4);
        w2aVar.setOnClickListener(new rw1(this, (byte) 18));
        px1Var3.addView(w2aVar, qoe.e(44, 44, 85));
        yz1 yz1Var = new yz1(activity);
        lka lkaVar = (lka) yz1Var.c;
        this.G0 = yz1Var;
        lkaVar.setTextSize(16);
        yz1Var.invalidate();
        yz1Var.setVisibility(4);
        yz1Var.setSoundEffectsEnabled(false);
        yz1Var.setScaleX(0.1f);
        yz1Var.setScaleY(0.1f);
        yz1Var.setAlpha(0.0f);
        yz1Var.setPadding(gm.L(14.0f), 0, gm.L(14.0f), 0);
        lkaVar.setGravity(21);
        yz1Var.invalidate();
        lkaVar.setTextColor(F0(i3));
        yz1Var.invalidate();
        px1Var3.addView(yz1Var, qoe.e(74, 44, 85));
        yz1Var.setOnClickListener(new rw1(this, (byte) 19));
        yz1Var.setOnLongClickListener(new hx1(this, b));
        SharedPreferences c1 = oc7.c1();
        this.n3 = c1.getInt("kbd_height", gm.L(200.0f));
        this.o3 = c1.getInt("kbd_height_land3", gm.L(200.0f));
        P1(false, false);
        M(false);
        H();
        Z();
    }

    public static float I2(int i) {
        int i2 = i * 668265261;
        int i3 = (i2 ^ (i2 >>> 15)) * (-2048144789);
        return ((i3 ^ (i3 >>> 13)) >>> 8) / 1.6777216E7f;
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
    public static boolean J(int i, long j, org.telegram.ui.ActionBar.d dVar, CharSequence charSequence) {
        gn[] gnVarArr;
        int i2;
        int i3;
        TLRPC.ChatFull M0;
        TLRPC.TL_messages_stickerSet a0;
        ArrayList arrayList;
        int i4;
        ArrayList<TLRPC.Document> arrayList2;
        ArrayList<TLRPC.Document> arrayList3;
        Object obj;
        ArrayList<TLRPC.Document> arrayList4;
        boolean z = false;
        if (charSequence != null && dVar != null && !z8c.h(i).p() && z8c.h(i).e() != j && (charSequence instanceof Spanned) && (gnVarArr = (gn[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), gn.class)) != null) {
            int i5 = 0;
            while (i5 < gnVarArr.length) {
                gn gnVar = gnVarArr[i5];
                if (gnVar != null) {
                    TLRPC.Document document = gnVar.document;
                    if (document == null) {
                        i3 = i;
                        document = vm.e(i3, gnVar.getDocumentId());
                    } else {
                        i3 = i;
                    }
                    long documentId = gnVarArr[i5].getDocumentId();
                    if (document == null) {
                        ArrayList t0 = hs6.d0(i3).t0(5);
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
                        ArrayList arrayList6 = hs6.d0(i3).t0[1];
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
                                        TLRPC.TL_messages_stickerSet n0 = hs6.d0(i3).n0(tL_inputStickerSetID, true);
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
                    if (document != null && (M0 = oc7.r1(i3).M0(-j)) != null && M0.emojiset != null && (a0 = hs6.d0(i3).a0(M0.emojiset)) != null) {
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
                    if (document == null || !k47.m3(document)) {
                        c41.b0(dVar).r(document, gm.S2(jb6.M0(2131743551, "UnlockPremiumEmojiHint")), jb6.M0(2131746768, "PremiumMore"), new ww1(dVar, (byte) 0)).j();
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

    public static int J2(int i) {
        return (Color.blue(i) + ((Color.green(i) * 6) + (Color.red(i) * 3))) / 10;
    }

    public static float L2(float f, float f2, float f3) {
        float i = Utilities.i((f3 - f) / (f2 - f), 1.0f, 0.0f);
        return mlb.B(i, 2.0f, 3.0f, i * i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public k47 getThreadMessage() {
        yv1 yv1Var = this.F3;
        if (yv1Var != null) {
            return yv1Var.m4;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getThreadMessageId() {
        k47 k47Var;
        yv1 yv1Var = this.F3;
        if (yv1Var == null || (k47Var = yv1Var.m4) == null) {
            return 0;
        }
        return k47Var.e1();
    }

    private String getTopicKeyString() {
        yv1 yv1Var = this.F3;
        if (yv1Var == null || !yv1Var.x4) {
            return String.valueOf(this.G3);
        }
        return this.G3 + "_" + yv1Var.d();
    }

    public static CharSequence q(Paint.FontMetricsInt fontMetricsInt, CharSequence charSequence, ArrayList arrayList) {
        boolean z;
        boolean z2;
        Collections.sort(arrayList, hs6.g2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jo4.a(charSequence, false));
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
                            j6c j6cVar = new j6c("" + ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id, 3, null);
                            int i2 = messageEntity.offset;
                            spannableStringBuilder.setSpan(j6cVar, i2, messageEntity.length + i2, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            j6c j6cVar2 = new j6c("" + ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id, 3, null);
                            int i3 = messageEntity.offset;
                            spannableStringBuilder.setSpan(j6cVar2, i3, messageEntity.length + i3, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityCode) {
                            wkb wkbVar = new wkb();
                            wkbVar.a |= 4;
                            xkb xkbVar = new xkb(wkbVar, 0);
                            int i4 = messageEntity.offset;
                            hs6.f(xkbVar, i4, messageEntity.length + i4, spannableStringBuilder, true);
                        } else if (!(messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                            if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                wkb wkbVar2 = new wkb();
                                wkbVar2.a |= 1;
                                xkb xkbVar2 = new xkb(wkbVar2, 0);
                                int i5 = messageEntity.offset;
                                hs6.f(xkbVar2, i5, messageEntity.length + i5, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                wkb wkbVar3 = new wkb();
                                wkbVar3.a |= 2;
                                xkb xkbVar3 = new xkb(wkbVar3, 0);
                                int i6 = messageEntity.offset;
                                hs6.f(xkbVar3, i6, messageEntity.length + i6, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                wkb wkbVar4 = new wkb();
                                wkbVar4.a |= 8;
                                xkb xkbVar4 = new xkb(wkbVar4, 0);
                                int i7 = messageEntity.offset;
                                hs6.f(xkbVar4, i7, messageEntity.length + i7, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                wkb wkbVar5 = new wkb();
                                wkbVar5.a |= 16;
                                xkb xkbVar5 = new xkb(wkbVar5, 0);
                                int i8 = messageEntity.offset;
                                hs6.f(xkbVar5, i8, messageEntity.length + i8, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                i6c i6cVar = new i6c(messageEntity.url, null);
                                int i9 = messageEntity.offset;
                                spannableStringBuilder.setSpan(i6cVar, i9, messageEntity.length + i9, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityFormattedDate) {
                                wkb wkbVar6 = new wkb();
                                wkbVar6.a |= 128;
                                int i10 = messageEntity.offset;
                                wkbVar6.b = i10;
                                wkbVar6.c = i10 + messageEntity.length;
                                wkbVar6.d = messageEntity;
                                int i11 = messageEntity.offset;
                                jo4 jo4Var = new jo4(spannableStringBuilder.subSequence(i11, messageEntity.length + i11).toString(), wkbVar6, (TLRPC.TL_messageEntityFormattedDate) messageEntity);
                                int i12 = messageEntity.offset;
                                spannableStringBuilder.setSpan(jo4Var, i12, messageEntity.length + i12, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                wkb wkbVar7 = new wkb();
                                wkbVar7.a |= 256;
                                xkb xkbVar6 = new xkb(wkbVar7, 0);
                                int i13 = messageEntity.offset;
                                hs6.f(xkbVar6, i13, messageEntity.length + i13, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                gn gnVar = tL_messageEntityCustomEmoji.document != null ? new gn(tL_messageEntityCustomEmoji.document, fontMetricsInt) : new gn(tL_messageEntityCustomEmoji.document_id, fontMetricsInt);
                                int i14 = messageEntity.offset;
                                spannableStringBuilder.setSpan(gnVar, i14, messageEntity.length + i14, 33);
                            }
                        }
                    }
                } catch (Exception e) {
                    fc4.g(e, true);
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
                        f09.c(spannableStringBuilder, i18, i21, z4);
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
                f09.c(spannableStringBuilder, i18, spannableStringBuilder.length(), z4);
            }
        } else {
            z = true;
        }
        CharSequence m = gw3.m(new SpannableStringBuilder(spannableStringBuilder), fontMetricsInt, false, null, 0);
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
                fc4.g(e2, z);
            }
        }
        return m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHintGlass(hg5 hg5Var) {
        yv1 yv1Var = this.F3;
        if (yv1Var != null) {
            hg5Var.k(yv1Var.L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSlowModeButtonVisible(boolean z) {
        int i;
        int i2 = z ? 0 : 8;
        yz1 yz1Var = this.G0;
        yz1Var.setVisibility(i2);
        if (z) {
            i = gm.L(yz1Var.b ? 26.0f : 16.0f);
        } else {
            i = 0;
        }
        sy1 sy1Var = this.F0;
        if (sy1Var == null || sy1Var.getPaddingRight() == i) {
            return;
        }
        this.F0.setPadding(0, gm.L(9.0f), i, gm.L(10.0f));
    }

    public final pz1 A() {
        sy1 sy1Var = this.F0;
        CharSequence[] charSequenceArr = {gm.m1(sy1Var == null ? "" : sy1Var.getTextToUse())};
        ArrayList Y = hs6.d0(this.R).Y(charSequenceArr, true, true);
        CharSequence charSequence = charSequenceArr[0];
        int size = Y.size();
        for (int i = 0; i < size; i++) {
            TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) Y.get(i);
            if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                messageEntity.length = charSequence.length() - messageEntity.offset;
            }
        }
        pz1 pz1Var = new pz1();
        pz1Var.a = charSequence.toString();
        pz1Var.b = Y;
        return pz1Var;
    }

    public final glc A0() {
        glc glcVar = this.r1;
        if (glcVar != null) {
            return glcVar;
        }
        glc glcVar2 = new glc(getContext(), new c(this));
        this.r1 = glcVar2;
        return glcVar2;
    }

    public final void A1() {
        hg5 hg5Var = this.M;
        if (hg5Var == null) {
            return;
        }
        hg5Var.t(gw3.o(gm.S2(jb6.a0(null, null, 2131743449, m9c.k(this.F3.h(), true))), this.M.getTextPaint().getFontMetricsInt(), 20, new gx1(this, (byte) 16)));
        hg5 hg5Var2 = this.M;
        hg5Var2.h = hg5.a(hg5Var2.getText(), this.M.getTextPaint());
    }

    public void A2(boolean z) {
        B2(false, z);
    }

    public final float B(boolean z) {
        float f;
        float f2;
        fn0 fn0Var = this.o7;
        h94 h94Var = this.n7;
        if (z) {
            f = h94Var.h ? h94Var.g : h94Var.f;
            f2 = fn0Var.f ? 1.0f : 0.0f;
        } else {
            f = h94Var.f;
            f2 = fn0Var.e;
        }
        return ((this.w2 != null ? r2.getMeasuredHeight() : 0) * f2) + f;
    }

    public final void B1(vh6 vh6Var, boolean z) {
        this.f7 = vh6Var;
        if (vh6Var.m() == 1 && ((TL_bots.BotInfo) vh6Var.n(0)).user_id == this.G3) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) vh6Var.n(0);
            TL_bots.BotMenuButton botMenuButton = botInfo.menu_button;
            if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                this.j0 = tL_botMenuButton.text;
                this.k0 = tL_botMenuButton.url;
                this.x7 = 3;
            } else if (botInfo.commands.isEmpty()) {
                this.x7 = 1;
            } else {
                this.x7 = 2;
            }
        } else {
            this.x7 = 1;
        }
        dq0 dq0Var = this.o0;
        if (dq0Var != null) {
            dq0Var.E(vh6Var);
        }
        m2(z);
        I(z);
    }

    public final void B2(boolean z, boolean z2) {
        TLRPC.Chat chat;
        TLRPC.Peer peer;
        float f;
        float f2;
        float f3;
        sy1 sy1Var;
        m6a m6aVar;
        m6a m6aVar2;
        px1 px1Var;
        if (this.P3 != null) {
            Z();
            if (this.w7) {
                peer = this.P3.l();
                chat = null;
            } else {
                TLRPC.Chat L0 = oc7.r1(this.R).L0(Long.valueOf(-this.G3));
                TLRPC.ChatFull M0 = oc7.r1(this.R).M0(-this.G3);
                TLRPC.Peer peer2 = M0 != null ? M0.default_send_as : null;
                chat = L0;
                peer = peer2;
            }
            if (peer == null && this.P3.x() != null && !this.P3.x().peers.isEmpty()) {
                peer = this.P3.x().peers.get(0).peer;
            }
            yv1 yv1Var = this.F3;
            boolean z3 = (z || peer == null || (this.P3.x() != null && this.P3.x().peers.size() <= 1) || Q0() || U0() || (((px1Var = this.f1) != null && px1Var.getVisibility() == 0) || ((!this.w7 && ((sd2.V(chat) && !sd2.k(chat)) || sd2.p0(chat))) || (yv1Var != null && yv1Var.g4 == 9)))) ? false : true;
            if (z3) {
                f0();
            }
            if (peer != null) {
                long j = peer.channel_id;
                int i = this.R;
                if (j != 0) {
                    TLRPC.Chat L02 = oc7.r1(i).L0(Long.valueOf(peer.channel_id));
                    if (L02 != null && (m6aVar2 = this.q0) != null) {
                        m6aVar2.setAvatar(L02);
                        this.q0.setContentDescription(jb6.a0(null, null, 2131754775, L02.title));
                    }
                } else {
                    TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(peer.user_id));
                    if (W1 != null && (m6aVar = this.q0) != null) {
                        m6aVar.setAvatar(W1);
                        this.q0.setContentDescription(jb6.a0(null, null, 2131754775, bw2.m(0, W1.first_name, W1.last_name)));
                    }
                }
            }
            m6a m6aVar3 = this.q0;
            boolean z4 = m6aVar3 != null && m6aVar3.getVisibility() == 0;
            int L = gm.L(2.0f);
            float f4 = 1.0f;
            if (z3) {
                f = 0.0f;
            } else {
                f = 1.0f;
                f4 = 0.0f;
            }
            m6a m6aVar4 = this.q0;
            if (m6aVar4 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) m6aVar4.getLayoutParams();
                m6a m6aVar5 = this.q0;
                if (z3) {
                    f3 = ((-m6aVar5.getLayoutParams().width) - marginLayoutParams.leftMargin) - L;
                    f2 = 0.0f;
                } else {
                    f2 = ((-m6aVar5.getLayoutParams().width) - marginLayoutParams.leftMargin) - L;
                    f3 = 0.0f;
                }
            } else {
                f2 = 0.0f;
                f3 = 0.0f;
            }
            if (z4 != z3) {
                m6a m6aVar6 = this.q0;
                ValueAnimator valueAnimator = m6aVar6 == null ? null : (ValueAnimator) m6aVar6.getTag();
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.q0.setTag(null);
                }
                rx1 rx1Var = this.R0;
                if (!z3 && this.q0 != null && g0() && this.v3 && (sy1Var = this.F0) != null && z2) {
                    float translationX = this.F0.getTranslationX() + sy1Var.getLeft();
                    float translationX2 = rx1Var.getTranslationX() + rx1Var.getLeft();
                    this.q0.setVisibility(8);
                    this.q0.setTranslationX(0.0f);
                    this.q0.setAlpha(0.0f);
                    sy1 sy1Var2 = this.F0;
                    sy1Var2.getViewTreeObserver().addOnPreDrawListener(new ez1(this, sy1Var2, translationX, translationX2));
                    return;
                }
                if ((this.w7 || (yv1Var != null && yv1Var.b7() == 0 && yv1Var.g6)) && z2) {
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    m6a m6aVar7 = this.q0;
                    if (m6aVar7 != null) {
                        m6aVar7.setTranslationX(f3);
                    }
                    this.H = f3;
                    u2();
                    float f5 = f2;
                    float f6 = f4;
                    float f7 = f3;
                    duration.addUpdateListener(new zm(this, f7, f5, f, f6, (byte) 2));
                    duration.addListener(new fz1(this, z3, f, f7, f6, f5));
                    duration.start();
                    m6a m6aVar8 = this.q0;
                    if (m6aVar8 != null) {
                        m6aVar8.setTag(duration);
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
                m6a m6aVar9 = this.q0;
                if (m6aVar9 != null) {
                    m6aVar9.setVisibility(z5 ? 0 : 8);
                    this.q0.setTranslationX(f9);
                }
                float f10 = z5 ? f9 : 0.0f;
                rx1Var.setTranslationX(f10);
                this.H = f10;
                u2();
                m6a m6aVar10 = this.q0;
                if (m6aVar10 != null) {
                    m6aVar10.setAlpha(f8);
                    this.q0.setTag(null);
                }
            }
        }
    }

    public final void C() {
        a6 a6Var = this.e1;
        if (a6Var != null) {
            a6Var.setVisibility(8);
        }
        RecordCircle recordCircle = this.D2;
        if (recordCircle != null) {
            recordCircle.setVisibility(8);
        }
        this.j3 = null;
        V0();
        if (this.f2 != null) {
            this.y = 0.0f;
            l2();
        }
        SlideTextView slideTextView = this.a2;
        if (slideTextView != null) {
            slideTextView.setCancelToProgress(0.0f);
        }
        this.P3.a();
        A2(true);
    }

    public final va2 C0() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof va2) {
                return (va2) parent;
            }
        }
        return null;
    }

    public final void C1(int i, boolean z, boolean z2) {
        this.e3 = i;
        if (this.f3 == z) {
            return;
        }
        this.f3 = z;
        m2(z2);
    }

    public final void C2() {
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
            s2(this.T6);
        }
        if (this.w7) {
            U();
            boolean v = v();
            int i = this.R;
            byte b2 = 2;
            if (v) {
                int[] iArr = oc7.r1(i).T3;
                b = (iArr == null || iArr.length <= 2) ? 400 : iArr[2];
            } else {
                b = bg5.b(i, (int) starsPrice, 1);
            }
            if (this.d0 != b) {
                this.d0 = b;
                if (b > 0) {
                    int i2 = b - this.e0;
                    if (i2 <= (this.w7 ? 5 : 100)) {
                        if (i2 < -9999) {
                            i2 = -9999;
                        }
                        U();
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
                        this.c0.setTextColor(F0(i2 < 0 ? cmb.o7 : cmb.x6));
                        return;
                    }
                }
                NumberTextView numberTextView2 = this.c0;
                if (numberTextView2 != null) {
                    numberTextView2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new nx1(this, b2));
                }
            }
        }
    }

    @Override // g94
    public final void D(int i, float f, float f2, h94 h94Var) {
        px1 px1Var;
        float f3 = 0.0f;
        if (i == 0) {
            olc olcVar = this.T1;
            if (olcVar != null) {
                olcVar.setVisibleHeight(f);
            }
            if (this.E2 != null) {
                if (this.K1 && this.Q5 && (px1Var = this.f1) != null && px1Var.getVisibility() == 0) {
                    f3 = -Math.max(0.0f, f - gm.L(44.0f));
                }
                this.R5 = f3;
                this.E2.setTranslationY(f3 + this.S5 + this.t7);
            }
            O();
            P();
        } else if (i == 1) {
            O();
            P();
        } else {
            if (i == 2) {
                w2a w2aVar = this.J0;
                w2aVar.setAlpha(f);
                w2aVar.setScaleX(gm.R1(0.5f, 1.0f, f));
                w2aVar.setScaleY(gm.R1(0.5f, 1.0f, f));
                w2aVar.setVisibility(f <= 0.0f ? 4 : 0);
            } else if (i == 3) {
                float R1 = gm.R1(1.0f, 0.79f, f);
                px1 px1Var2 = this.q2;
                px1Var2.setScaleX(R1);
                px1Var2.setScaleY(gm.R1(1.0f, 0.79f, f));
                float R12 = gm.R1(0.79f, 1.0f, f);
                ImageView imageView = this.r2;
                imageView.setScaleX(R12);
                imageView.setScaleY(gm.R1(0.79f, 1.0f, f));
                imageView.setVisibility(f <= 0.0f ? 8 : 0);
                imageView.setAlpha(f);
                by1 by1Var = this.K0;
                if (by1Var != null) {
                    by1Var.setSameWidthFactor(f);
                }
            }
        }
        invalidate();
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
    public final void D1(k47 k47Var, boolean z, boolean z2) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        sy1 sy1Var;
        k47 k47Var2 = this.J3;
        if (k47Var2 != null && k47Var2 == this.c3 && k47Var2 != k47Var) {
            this.M3 = k47Var;
            return;
        }
        k47 k47Var3 = this.c3;
        if (k47Var3 != null) {
            if (k47Var3 == k47Var) {
                return;
            }
        } else if (k47Var == null) {
            return;
        }
        if (this.x2 == null) {
            gz1 gz1Var = new gz1(this, this.E3, this.L4);
            this.x2 = gz1Var;
            gz1Var.setVisibility(8);
            this.Y0 = false;
            this.x2.setDelegate(new dx1(this));
            this.d2.addView(this.x2);
        }
        this.c3 = k47Var;
        if (k47Var != null) {
            TLRPC.ReplyMarkup replyMarkup = k47Var.k.reply_markup;
            if (replyMarkup instanceof TLRPC.TL_replyKeyboardMarkup) {
                tL_replyKeyboardMarkup = (TLRPC.TL_replyKeyboardMarkup) replyMarkup;
                this.d3 = tL_replyKeyboardMarkup;
                gz1 gz1Var2 = this.x2;
                Point point = gm.q;
                gz1Var2.setPanelHeight(point.x <= point.y ? this.o3 : this.n3);
                if (this.d3 == null) {
                    SharedPreferences sharedPreferences = oc7.r1(this.R).X3;
                    if (this.c3 != this.J3 && k47Var != null) {
                        if (this.d3.single_use) {
                        }
                        if (!this.d3.is_persistent) {
                        }
                    }
                    boolean z3 = true;
                    boolean z4 = z ? z3 : false;
                    this.x2.setButtons(this.d3);
                    if (z4 && (((sy1Var = this.F0) == null || sy1Var.length() == 0) && !R0())) {
                        Z1(1, 1, true, true);
                    }
                } else if (R0() && this.V2 == 1) {
                    if (z2) {
                        this.f4 = true;
                        k1();
                    } else {
                        Z1(0, 1, true, true);
                    }
                }
                m2(true);
            }
        }
        tL_replyKeyboardMarkup = null;
        this.d3 = tL_replyKeyboardMarkup;
        gz1 gz1Var22 = this.x2;
        Point point2 = gm.q;
        gz1Var22.setPanelHeight(point2.x <= point2.y ? this.o3 : this.n3);
        if (this.d3 == null) {
        }
        m2(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
    
        if (((java.lang.Integer) a6a.B(r9.R).f.g(0, r9.G3)).intValue() > 0) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D2() {
        int i;
        int currentTime = ConnectionsManager.getInstance(this.R).getCurrentTime();
        gm.r(this.I0);
        this.I0 = null;
        TLRPC.ChatFull chatFull = this.T2;
        if (chatFull != null && chatFull.slowmode_seconds != 0 && chatFull.slowmode_next_send_date <= currentTime) {
            boolean z = ((Integer) a6a.B(this.R).h.g(0, this.G3)).intValue() > 0;
            if (!z) {
            }
            if (!sd2.N(oc7.r1(this.S.a).L0(Long.valueOf(this.T2.id))) && !sd2.i0(this.T2)) {
                i = this.T2.slowmode_seconds;
                this.H0 = z ? ConnectionsManager.DEFAULT_DATACENTER_ID : 2147483646;
                if (this.H0 != 0 || i <= 0) {
                    this.H0 = 0;
                } else {
                    String h0 = gm.h0(Math.max(1, i), false);
                    yz1 yz1Var = this.G0;
                    ((lka) yz1Var.c).l(h0, false);
                    yz1Var.invalidate();
                    uz1 uz1Var = this.P3;
                    if (uz1Var != null) {
                        uz1Var.a1(yz1Var, ((lka) yz1Var.c).getText(), false);
                    }
                    mw1 mw1Var = new mw1(this, (byte) 24);
                    this.I0 = mw1Var;
                    gm.d3(mw1Var, 100L);
                }
                if (c()) {
                    M(true);
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
                oc7.r1(this.S.a).a3(0, this.T2.id, true);
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

    public final void E() {
        if (this.U2 && this.d1) {
            this.P3.F1(5, 0, this.P ? Integer.MAX_VALUE : 0, this.W6, 0L, true);
            this.W6 = 0L;
            this.K0.setEffect(0L);
        } else {
            this.P3.z0(0);
            MediaController.w().A0(0, 0, false, false);
        }
        this.v3 = false;
        w2(2, true);
    }

    public final boolean E0(float[] fArr) {
        by1 by1Var = this.K0;
        if (by1Var != null && by1Var.o0) {
            int[] iArr = new int[2];
            by1Var.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - Math.round(by1Var.getTranslationX());
            iArr[1] = iArr[1] - Math.round(by1Var.getTranslationY());
            View rootView = by1Var.getRootView();
            if (rootView == null || rootView.getWidth() <= 0 || ((iArr[0] + by1Var.j0) - by1Var.l0 <= rootView.getWidth() && iArr[0] + by1Var.j0 + by1Var.l0 >= 0.0f)) {
                fArr[0] = iArr[0] + by1Var.j0;
                fArr[1] = iArr[1] + by1Var.k0;
                fArr[2] = by1Var.l0;
                fArr[3] = r4 + by1Var.m0;
                fArr[4] = r0 + by1Var.n0;
                return true;
            }
        }
        return false;
    }

    public final void E1(k47 k47Var, String str, boolean z, boolean z2) {
        sy1 sy1Var;
        y5a b;
        String str2;
        if (str == null || getVisibility() != 0 || (sy1Var = this.F0) == null) {
            return;
        }
        r16 = null;
        TLRPC.User user = null;
        if (!z) {
            if (this.H0 > 0 && !c()) {
                uz1 uz1Var = this.P3;
                if (uz1Var != null) {
                    yz1 yz1Var = this.G0;
                    uz1Var.a1(yz1Var, ((lka) yz1Var.c).getText(), true);
                    return;
                }
                return;
            }
            TLRPC.User W1 = (k47Var == null || !pg3.y(this.G3)) ? null : oc7.r1(this.S.a).W1(Long.valueOf(k47Var.k.from_id.user_id));
            if ((this.e3 != 1 || z2) && W1 != null && W1.bot && !str.contains("@")) {
                Locale locale = Locale.US;
                b = y5a.b(kt6.o(str, "@", m9c.p(W1)), this.G3, this.J3, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
            } else {
                b = y5a.b(str, this.G3, this.J3, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
            }
            yv1 yv1Var = this.F3;
            b.K = yv1Var != null ? yv1Var.X6() : null;
            b.O = this.W6;
            this.W6 = 0L;
            this.K0.setEffect(0L);
            t(b);
            a6a.B(this.R).q0(b);
            return;
        }
        String obj = sy1Var.getText().toString();
        if (k47Var != null && pg3.y(this.G3)) {
            user = oc7.r1(this.S.a).W1(Long.valueOf(k47Var.k.from_id.user_id));
        }
        TLRPC.User user2 = user;
        if ((this.e3 != 1 || z2) && user2 != null && user2.bot && !str.contains("@")) {
            Locale locale2 = Locale.US;
            str2 = kt6.o(str, "@", m9c.p(user2)) + " " + obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", "");
        } else {
            StringBuilder k = b10.k(str, " ");
            k.append(obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
            str2 = k.toString();
        }
        this.H3 = true;
        this.F0.setText(str2);
        sy1 sy1Var2 = this.F0;
        sy1Var2.setSelection(sy1Var2.getText().length());
        this.H3 = false;
        uz1 uz1Var2 = this.P3;
        if (uz1Var2 != null) {
            uz1Var2.H0(this.F0.getText(), true, false);
        }
        if (this.p3 || this.V2 != -1) {
            return;
        }
        j1();
    }

    public final long E2(String str, Runnable runnable) {
        long j;
        RecordCircle recordCircle;
        if (this.v3 || this.R3 == null) {
            j = 0;
        } else {
            t1();
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
        gm.d3(new co1((byte) 9, (Object) this, (Object) runnable, str), j);
        return j;
    }

    public final void F() {
        tx1 tx1Var;
        yv1 yv1Var;
        if (this.M != null || (tx1Var = this.A2) == null || tx1Var.getRight() == 0 || (yv1Var = this.F3) == null || !ok0.d(yv1Var.s8)) {
            return;
        }
        if (oc7.r1(this.R).X3.getBoolean(Calendar.getInstance().get(1) + "bdayhint_" + yv1Var.a(), true)) {
            oc7.r1(this.R).X3.edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + yv1Var.a(), false).apply();
            hg5 hg5Var = new hg5(getContext(), 3);
            this.M = hg5Var;
            hg5Var.q(13.0f);
            setHintGlass(this.M);
            this.M.p(true);
            A1();
            this.M.setPadding(gm.L(12.0f), 0, gm.L(12.0f), 0);
            this.M.o(1.0f, -((getWidth() - gm.L(12.0f)) - ((this.A2.getMeasuredWidth() / 2.0f) + (this.A2.getX() + (this.f2.getX() + this.o2.getX())))));
            addView(this.M, qoe.d(-1, 200.0f, 48, 0.0f, -192.0f, 0.0f, 0.0f));
            hg5 hg5Var2 = this.M;
            hg5Var2.r0 = new mw1(this, (byte) 29);
            hg5Var2.d = 8000L;
            hg5Var2.v();
        }
    }

    public final int F0(int i) {
        ylb ylbVar = this.L4;
        return ylbVar != null ? ylbVar.h(i) : cmb.w0(null, i, false);
    }

    public final void F1(int i, long j) {
        this.G3 = j;
        gm.c3(new mw1(this, (byte) 26));
        if (this.R != i) {
            this.A4.e();
            nm7 f = nm7.f(this.R);
            int i2 = nm7.l2;
            f.n(this, i2);
            nm7 f2 = nm7.f(this.R);
            int i3 = nm7.o2;
            f2.n(this, i3);
            nm7 f3 = nm7.f(this.R);
            int i4 = nm7.p2;
            f3.n(this, i4);
            nm7 f4 = nm7.f(this.R);
            int i5 = nm7.m2;
            f4.n(this, i5);
            nm7 f5 = nm7.f(this.R);
            int i6 = nm7.Y5;
            f5.n(this, i6);
            nm7 f6 = nm7.f(this.R);
            int i7 = nm7.c4;
            f6.n(this, i7);
            nm7 f7 = nm7.f(this.R);
            int i8 = nm7.n2;
            f7.n(this, i8);
            nm7 f8 = nm7.f(this.R);
            int i9 = nm7.k2;
            f8.n(this, i9);
            nm7 f9 = nm7.f(this.R);
            int i10 = nm7.s;
            f9.n(this, i10);
            nm7 f10 = nm7.f(this.R);
            int i11 = nm7.s2;
            f10.n(this, i11);
            nm7 f11 = nm7.f(this.R);
            int i12 = nm7.u2;
            f11.n(this, i12);
            nm7 f12 = nm7.f(this.R);
            int i13 = nm7.e2;
            f12.n(this, i13);
            nm7 f13 = nm7.f(this.R);
            int i14 = nm7.z0;
            f13.n(this, i14);
            nm7 f14 = nm7.f(this.R);
            int i15 = nm7.K;
            f14.n(this, i15);
            nm7 f15 = nm7.f(this.R);
            int i16 = nm7.n1;
            f15.n(this, i16);
            nm7 f16 = nm7.f(this.R);
            int i17 = nm7.t2;
            f16.n(this, i17);
            nm7 f17 = nm7.f(this.R);
            int i18 = nm7.T2;
            f17.n(this, i18);
            nm7 f18 = nm7.f(this.R);
            int i19 = nm7.a3;
            f18.n(this, i19);
            nm7 f19 = nm7.f(this.R);
            int i20 = nm7.j5;
            f19.n(this, i20);
            nm7 f20 = nm7.f(this.R);
            int i21 = nm7.S3;
            f20.n(this, i21);
            this.R = i;
            this.S = j5.a(i);
            nm7.f(this.R).b(this, i2);
            nm7.f(this.R).b(this, i3);
            nm7.f(this.R).b(this, i4);
            nm7.f(this.R).b(this, i5);
            nm7.f(this.R).b(this, i6);
            nm7.f(this.R).b(this, i7);
            nm7.f(this.R).b(this, i8);
            nm7.f(this.R).b(this, i9);
            nm7.f(this.R).b(this, i10);
            nm7.f(this.R).b(this, i11);
            nm7.f(this.R).b(this, i12);
            nm7.f(this.R).b(this, i13);
            nm7.f(this.R).b(this, i14);
            nm7.f(this.R).b(this, i15);
            nm7.f(this.R).b(this, i16);
            nm7.f(this.R).b(this, i17);
            nm7.f(this.R).b(this, i18);
            nm7.f(this.R).b(this, i19);
            nm7.f(this.R).b(this, i20);
            nm7.f(this.R).b(this, i21);
        }
        this.A0 = true;
        if (pg3.y(this.G3)) {
            this.A0 = sd2.q(oc7.r1(this.S.a).L0(Long.valueOf(-this.G3)));
        }
        z2(false);
        t2(false);
        i2();
        K();
        H();
        r2(false);
        if (this.F0 != null) {
            yv1 yv1Var = this.F3;
            A2(yv1Var != null && yv1Var.getFragmentBeginToShow());
        }
    }

    public final boolean F2() {
        sy1 sy1Var;
        if (this.s1 && ((sy1Var = this.F0) == null || sy1Var.length() == 0)) {
            this.s1 = false;
        }
        return this.s1;
    }

    public final void G() {
        sy1 sy1Var = this.F0;
        boolean z = ((sy1Var != null && !TextUtils.isEmpty(sy1Var.getText())) || this.p3 || this.a4 || R0()) ? false : true;
        if (z) {
            T();
        }
        eq0 eq0Var = this.m0;
        if (eq0Var != null) {
            boolean z2 = eq0Var.f;
            if (z2 != z) {
                eq0Var.f = z;
                eq0Var.requestLayout();
                eq0Var.invalidate();
            }
            if (z2 != this.m0.f) {
                rx1 rx1Var = this.R0;
                Float valueOf = Float.valueOf(rx1Var.getX());
                HashMap hashMap = this.C0;
                hashMap.put(rx1Var, valueOf);
                sy1 sy1Var2 = this.F0;
                if (sy1Var2 != null) {
                    hashMap.put(sy1Var2, Float.valueOf(sy1Var2.getX()));
                }
            }
        }
    }

    public final boolean G0() {
        return this.x7 == 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G1(k47 k47Var, f47 f47Var, boolean z) {
        float f;
        float f2;
        int i;
        px1 px1Var;
        CharSequence charSequence;
        CharSequence charSequence2;
        int i2;
        sy1 sy1Var;
        sy1 sy1Var2;
        px1 px1Var2;
        boolean z2;
        cy1 cy1Var;
        if (this.R3 == null && this.U3 == null && this.P2 != k47Var) {
            Z();
            byte b = 1;
            boolean z3 = this.P2 != null;
            this.P2 = k47Var;
            this.Q2 = z;
            px1 px1Var3 = this.q2;
            qmb qmbVar = this.f2;
            ImageView imageView = this.Q0;
            tx1 tx1Var = this.h2;
            a aVar = this.a1;
            if (k47Var != null) {
                this.V6 = f47Var != null ? f47Var.j : k47Var.k.invert_media;
                W(false);
                this.v2.setOnClickListener(new rw1(this, (byte) 21));
                if (this.P2.o5()) {
                    long j = this.j5;
                    if (j > 0) {
                        this.v2.i(1, j, true);
                        this.v2.setLayoutParams(qoe.e(44, 44, 85));
                        this.v2.requestLayout();
                        px1Var = px1Var3;
                        this.v2.setOnLongClickListener(new s(this, k47Var, f47Var, b));
                        this.v2.setVisibility(0);
                        this.v2.setScaleX(0.1f);
                        this.v2.setScaleY(0.1f);
                        this.v2.setAlpha(0.0f);
                        this.v2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(d53.f).start();
                        j5 j5Var = this.S;
                        if (z) {
                            this.d0 = oc7.r1(j5Var.a).s1();
                            charSequence = this.P2.v;
                        } else {
                            this.d0 = oc7.r1(j5Var.a).G0();
                            charSequence = this.P2.z;
                        }
                        if (charSequence == null) {
                            sy1 sy1Var3 = this.F0;
                            TextPaint paint = sy1Var3 != null ? sy1Var3.getPaint() : null;
                            if (paint == null) {
                                paint = new TextPaint();
                                paint.setTextSize(gm.L(18.0f));
                            }
                            charSequence2 = q(paint.getFontMetricsInt(), charSequence, this.P2.k.entities);
                        } else {
                            charSequence2 = "";
                        }
                        if (this.L2 == null && !z3) {
                            sy1 sy1Var4 = this.F0;
                            this.L2 = (sy1Var4 != null || sy1Var4.length() <= 0) ? null : this.F0.getText();
                            this.M2 = this.O3;
                        }
                        k47 k47Var2 = this.P2;
                        TLRPC.MessageMedia messageMedia = k47Var2.k.media;
                        this.O3 = ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) || !messageMedia.manual) && ((i2 = k47Var2.D) == 0 || i2 == 19);
                        if (this.p3) {
                            lx1 lx1Var = new lx1(this, charSequence2, (byte) 0);
                            this.a0 = lx1Var;
                            gm.d3(lx1Var, 200L);
                        } else {
                            lx1 lx1Var2 = this.a0;
                            if (lx1Var2 != null) {
                                gm.r(lx1Var2);
                                this.a0 = null;
                            }
                            setFieldText(charSequence2);
                        }
                        sy1Var = this.F0;
                        if (sy1Var != null) {
                            sy1Var.requestFocus();
                        }
                        j1();
                        sy1Var2 = this.F0;
                        if (sy1Var2 != null) {
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) sy1Var2.getLayoutParams();
                            layoutParams.rightMargin = gm.L(4.0f);
                            this.F0.setLayoutParams(layoutParams);
                        }
                        px1Var2 = this.f1;
                        if (px1Var2 == null) {
                            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) px1Var2.getLayoutParams();
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
                        qmbVar.setVisibility(8);
                        if (tx1Var != null) {
                            this.l2 = 0.0f;
                            tx1Var.setAlpha(0.0f);
                            tx1Var.setScaleX(0.5f);
                            tx1Var.setScaleY(0.5f);
                        }
                        px1Var.setVisibility(8);
                        cy1Var = this.z2;
                        if (cy1Var != null) {
                            cy1Var.setVisibility(8);
                        }
                    }
                }
                px1Var = px1Var3;
                this.v2.i(1, 0L, true);
                this.v2.setLayoutParams(qoe.e(44, 44, 85));
                this.v2.requestLayout();
                this.v2.setOnLongClickListener(new s(this, k47Var, f47Var, b));
                this.v2.setVisibility(0);
                this.v2.setScaleX(0.1f);
                this.v2.setScaleY(0.1f);
                this.v2.setAlpha(0.0f);
                this.v2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(d53.f).start();
                j5 j5Var2 = this.S;
                if (z) {
                }
                if (charSequence == null) {
                }
                if (this.L2 == null) {
                    sy1 sy1Var42 = this.F0;
                    this.L2 = (sy1Var42 != null || sy1Var42.length() <= 0) ? null : this.F0.getText();
                    this.M2 = this.O3;
                }
                k47 k47Var22 = this.P2;
                TLRPC.MessageMedia messageMedia2 = k47Var22.k.media;
                this.O3 = ((messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) || !messageMedia2.manual) && ((i2 = k47Var22.D) == 0 || i2 == 19);
                if (this.p3) {
                }
                sy1Var = this.F0;
                if (sy1Var != null) {
                }
                j1();
                sy1Var2 = this.F0;
                if (sy1Var2 != null) {
                }
                px1Var2 = this.f1;
                if (px1Var2 == null) {
                }
                getSendButtonInternal().setVisibility(8);
                setSlowModeButtonVisible(z2);
                imageView.setVisibility(8);
                aVar.setVisibility(8);
                qmbVar.setVisibility(8);
                if (tx1Var != null) {
                }
                px1Var.setVisibility(8);
                cy1Var = this.z2;
                if (cy1Var != null) {
                }
            } else {
                lx1 lx1Var3 = this.a0;
                if (lx1Var3 != null) {
                    gm.r(lx1Var3);
                    this.a0 = null;
                }
                by1 by1Var = this.v2;
                if (by1Var != null) {
                    by1Var.setVisibility(8);
                }
                this.d0 = -1;
                this.P3.n();
                px1Var3.setVisibility(0);
                imageView.setScaleX(0.1f);
                imageView.setScaleY(0.1f);
                imageView.setAlpha(0.0f);
                imageView.setVisibility(8);
                int i3 = this.H0;
                yz1 yz1Var = this.G0;
                if (i3 <= 0 || c()) {
                    getSendButtonInternal().setScaleX(0.1f);
                    getSendButtonInternal().setScaleY(0.1f);
                    getSendButtonInternal().setAlpha(0.0f);
                    getSendButtonInternal().setVisibility(8);
                    yz1Var.setScaleX(0.1f);
                    yz1Var.setScaleY(0.1f);
                    yz1Var.setAlpha(0.0f);
                    setSlowModeButtonVisible(false);
                    f = 1.0f;
                    qmbVar.setScaleX(1.0f);
                    this.F = 1.0f;
                    l2();
                    qmbVar.setVisibility(0);
                    if (tx1Var != null) {
                        this.l2 = 1.0f;
                        tx1Var.setAlpha(1.0f);
                        tx1Var.setScaleX(1.0f);
                        tx1Var.setScaleY(1.0f);
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
                        yz1Var.setScaleX(0.1f);
                        yz1Var.setScaleY(0.1f);
                        f2 = 0.0f;
                        yz1Var.setAlpha(0.0f);
                        setSlowModeButtonVisible(false);
                        i = 8;
                    } else {
                        f2 = 0.0f;
                        getSendButtonInternal().setScaleX(0.1f);
                        getSendButtonInternal().setScaleY(0.1f);
                        getSendButtonInternal().setAlpha(0.0f);
                        i = 8;
                        getSendButtonInternal().setVisibility(8);
                        yz1Var.setScaleX(1.0f);
                        yz1Var.setScaleY(1.0f);
                        yz1Var.setAlpha(1.0f);
                        setSlowModeButtonVisible(true);
                    }
                    qmbVar.setScaleX(0.01f);
                    this.F = f2;
                    l2();
                    qmbVar.setVisibility(i);
                    if (tx1Var != null) {
                        this.l2 = f2;
                        tx1Var.setAlpha(f2);
                        tx1Var.setScaleX(0.5f);
                        tx1Var.setScaleY(0.5f);
                    }
                    aVar.setScaleX(0.1f);
                    aVar.setScaleY(0.1f);
                    aVar.setAlpha(f2);
                    aVar.setVisibility(i);
                    f = 1.0f;
                }
                e0();
                cy1 cy1Var2 = this.z2;
                if (cy1Var2 != null && cy1Var2.getTag() != null) {
                    this.z2.setScaleX(f);
                    this.z2.setScaleY(f);
                    this.z2.setAlpha(f);
                    this.z2.setVisibility(0);
                }
                yv1 yv1Var = this.F3;
                if (yv1Var != null) {
                    yv1Var.H5 = null;
                    yv1Var.Y5 = null;
                    o47 o47Var = yv1Var.x5;
                    if (o47Var != null) {
                        o47Var.e(this.R, null, "", null, null, null);
                    }
                    this.N3 = null;
                    this.O3 = true;
                    yv1Var.D6();
                }
                Z();
                sy1 sy1Var5 = this.F0;
                if (sy1Var5 != null) {
                    sy1Var5.setText(this.L2);
                    sy1 sy1Var6 = this.F0;
                    sy1Var6.setSelection(sy1Var6.length());
                }
                this.L2 = null;
                this.O3 = this.M2;
                if (getVisibility() == 0) {
                    this.P3.H1();
                }
                s2(1);
            }
            r2(true);
            A2(true);
            p2();
            y2();
        }
    }

    public final void G2(int i) {
        byte b;
        if (this.l1) {
            return;
        }
        if (this.r1 != null || oc7.d1().getBoolean("asr_live_text", true)) {
            glc glcVar = this.r1;
            byte b2 = 13;
            if (glcVar != null && glcVar.J && ((b = glcVar.c) == 2 || b == 4)) {
                if (i != 1 && i != 2 && i != 4 && i != 5) {
                    gm.c3(new gx1(this, b2));
                    return;
                }
                glcVar.j("field: record state " + i, true);
                return;
            }
            if (glcVar == null || glcVar.c != 3) {
                if (i == 0) {
                    gm.c3(new gx1(this, b2));
                    return;
                } else {
                    if (glcVar != null) {
                        glcVar.j("record state " + i, true);
                        return;
                    }
                    return;
                }
            }
            if (i == 1 || i == 2 || i == 4 || i == 5 || i == 0) {
                glcVar.j("review: record state " + i, true);
            }
        }
    }

    public final void H() {
        yv1 yv1Var = this.F3;
        if (yv1Var == null) {
            return;
        }
        v2(yv1Var.e, yv1Var.s8);
    }

    public final boolean H0() {
        sy1 sy1Var = this.F0;
        return sy1Var != null && sy1Var.length() > 0;
    }

    public final void H1(boolean z, boolean z2) {
        b02 b02Var;
        sy1 sy1Var;
        px1 px1Var;
        rx1 rx1Var = this.R0;
        if (rx1Var != null) {
            if (this.m3 || ((px1Var = this.f1) != null && px1Var.getVisibility() == 0)) {
                this.h = 0.0f;
                this.n = 0.0f;
                q2();
                z2 = false;
            }
            b02 b02Var2 = b02.f;
            b02 b02Var3 = b02.e;
            if (!z || this.V2 != 0) {
                jz1 jz1Var = this.V0;
                int i = jz1Var == null ? oc7.c1().getInt("selected_page", 0) : jz1Var.getCurrentPage();
                b02Var = (i == 0 || !((this.z3 || this.A3) && ((sy1Var = this.F0) == null || TextUtils.isEmpty(sy1Var.getText())))) ? b02Var3 : i == 1 ? b02.c : b02Var2;
            } else if (!this.A0) {
                return;
            } else {
                b02Var = b02.d;
            }
            if (!this.A0 && b02Var == b02Var3) {
                b02Var3 = b02Var2;
            } else if (this.b || b02Var == b02Var3) {
                b02Var3 = b02Var;
            }
            rx1Var.j(b02Var3, z2);
            if (b02Var3 == b02Var2 && this.V0 == null) {
                hs6.d0(this.R).X0(true, true, false, 0);
                ArrayList arrayList = oc7.r1(this.R).x3;
                int min = Math.min(10, arrayList.size());
                for (int i2 = 0; i2 < min; i2++) {
                    gw3.k((CharSequence) arrayList.get(i2));
                }
            }
        }
    }

    public final void H2() {
        if ((this.r1 == null && !yze.a()) || this.O2 || this.l1) {
            return;
        }
        A0().t();
    }

    public final void I(boolean z) {
        k47 k47Var;
        boolean z2 = this.G3 < 0 && this.M4 && this.P2 == null && (d54.g(this.R).e(getEditText() != null ? getEditText().toString() : null, this.f7) > 0 || ((k47Var = this.J3) != null && k47.c3(k47Var.k)));
        fn0 fn0Var = this.q7;
        boolean z3 = fn0Var.f != z2;
        fn0Var.a(z2, z);
        by1 by1Var = this.K0;
        if (by1Var != null) {
            by1Var.y = z2;
            by1Var.invalidate();
        }
        if (z3) {
            M(z);
        }
    }

    public final void I0() {
        hg5 hg5Var = this.O;
        if (hg5Var != null) {
            hg5Var.f(true);
        }
        hg5 hg5Var2 = this.M;
        if (hg5Var2 != null) {
            hg5Var2.f(true);
        }
    }

    public final void I1() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.E3.getSystemService("accessibility");
        if (this.F0 == null || accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        try {
            this.F0.requestFocus();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void J0(boolean z) {
        K0(z, false, true);
    }

    public final void J1(CharSequence charSequence, boolean z) {
        sy1 sy1Var = this.F0;
        if (sy1Var != null) {
            this.H3 = true;
            sy1Var.setText(charSequence);
            this.F0.g(true);
            sy1 sy1Var2 = this.F0;
            sy1Var2.setSelection(sy1Var2.getText().length());
            this.H3 = false;
            uz1 uz1Var = this.P3;
            if (uz1Var != null) {
                uz1Var.H0(this.F0.getText(), true, z);
            }
        }
    }

    public final void K() {
        boolean z;
        boolean z2;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        if (this.U2) {
            return;
        }
        if (this.f2 == null) {
            this.U2 = false;
            P1(false, false);
            return;
        }
        boolean z3 = true;
        this.U2 = true;
        this.y0 = true;
        this.z0 = true;
        if (pg3.y(this.G3)) {
            TLRPC.Chat L0 = oc7.r1(this.S.a).L0(Long.valueOf(-this.G3));
            z = sd2.T(L0) && !L0.megagroup;
            if (z && !L0.creator && ((tL_chatAdminRights = L0.admin_rights) == null || !tL_chatAdminRights.post_messages)) {
                this.U2 = false;
            }
            this.y0 = sd2.s(L0);
            this.z0 = sd2.v(L0);
        } else {
            z = false;
        }
        if (!gda.v0) {
            this.U2 = false;
        }
        if (this.U2) {
            if (gda.L0) {
                CameraController.getInstance().initCamera(null);
            }
            z2 = oc7.d1().getBoolean(z ? "currentModeVideoChannel" : "currentModeVideo", z);
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
        P1(z3, false);
    }

    public final boolean K0(boolean z, boolean z2, boolean z3) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        if (R0()) {
            if (this.V2 == 1 && (tL_replyKeyboardMarkup = this.d3) != null && z && this.c3 != null) {
                if (!tL_replyKeyboardMarkup.is_persistent) {
                    oc7.r1(this.R).X3.edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.c3.e1()).apply();
                }
            }
            if ((z && this.H2 != 0) || z2) {
                R1(0, true);
                jz1 jz1Var = this.V0;
                if (jz1Var != null) {
                    jz1Var.r(true);
                }
                sy1 sy1Var = this.F0;
                if (sy1Var != null) {
                    sy1Var.requestFocus();
                }
                S1(false, true, false, true);
                if (this.o4) {
                    M(true);
                    return true;
                }
            } else {
                if (this.H2 == 0) {
                    if (this.p4) {
                        S1(false, true, false, true);
                        return true;
                    }
                    Z1(0, 0, true, z3 && !z);
                    return true;
                }
                R1(0, false);
                this.V0.r(false);
                sy1 sy1Var2 = this.F0;
                if (sy1Var2 != null) {
                    sy1Var2.requestFocus();
                }
            }
            return true;
        }
        return false;
    }

    public final void K1(boolean z, boolean z2) {
        this.x3 = z;
        M(z2);
    }

    public final AnimatorSet K2() {
        a aVar = this.a1;
        if (aVar == null) {
            return null;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(aVar, (Property<a, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(aVar, (Property<a, Float>) View.SCALE_X, 0.6f, 1.0f), ObjectAnimator.ofFloat(aVar, (Property<a, Float>) View.SCALE_Y, 0.6f, 1.0f));
        animatorSet.setStartDelay(60L);
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(d53.g);
        return animatorSet;
    }

    @Override // dla
    public final void L(int i, boolean z) {
        k47 k47Var;
        sy1 sy1Var;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        boolean z2;
        int i2;
        int i3;
        c0d c0dVar;
        if (this.H2 != 0) {
            this.B3 = i;
            this.C3 = z;
            this.p3 = i > 0;
            G();
            return;
        }
        if (i > gm.L(50.0f) && this.p3 && !gm.E) {
            if (z) {
                this.o3 = i;
                oc7.c1().edit().putInt("kbd_height_land3", this.o3).commit();
            } else {
                this.n3 = i;
                oc7.c1().edit().putInt("kbd_height", this.n3).commit();
            }
        }
        if (this.p3 && this.X0 && this.V0 == null) {
            this.X0 = false;
        }
        boolean R0 = R0();
        ela elaVar = this.c2;
        yv1 yv1Var = this.F3;
        if (R0) {
            int i4 = z ? this.o3 : this.n3;
            if (yv1Var != null && yv1Var.getParentLayout() != null) {
                i4 -= ((ActionBarLayout) yv1Var.getParentLayout()).u(false);
            }
            if (this.V2 == 1) {
                gz1 gz1Var = this.x2;
                if (!gz1Var.f) {
                    i4 = Math.min(gz1Var.getKeyboardHeight(), i4);
                }
            }
            int i5 = this.V2;
            View view = i5 == 0 ? this.V0 : i5 == 1 ? this.x2 : null;
            gz1 gz1Var2 = this.x2;
            if (gz1Var2 != null) {
                gz1Var2.setPanelHeight(i4);
                c0d c0dVar2 = this.l7;
                if (c0dVar2 != null && i4 > 0 && this.V2 == 1) {
                    ((g0d) c0dVar2).h(i4);
                }
            }
            if (view != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                if (!this.q4 && !this.p4 && (((i2 = layoutParams.width) != (i3 = gm.q.x) || layoutParams.height != i4) && ((c0dVar = this.l7) == null || i2 != -1 || layoutParams.height != -1))) {
                    if (c0dVar == null) {
                        layoutParams.width = i3;
                        layoutParams.height = i4;
                        view.setLayoutParams(layoutParams);
                    }
                    if (elaVar != null) {
                        int i6 = this.q3;
                        this.q3 = layoutParams.height;
                        elaVar.requestLayout();
                        i1();
                        if (this.Y2 && !this.p3 && i6 != this.q3 && p1()) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.W0 = animatorSet;
                            if (this.l7 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(this.q3 - i6, 0.0f));
                            } else {
                                animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, this.q3 - i6, 0.0f));
                            }
                            this.W0.setInterpolator(gb.w);
                            this.W0.setDuration(250L);
                            this.W0.addListener(new nx1(this, (byte) 12));
                            gm.d3(this.N4, 50L);
                            this.A4.d();
                            requestLayout();
                        }
                    }
                }
            }
        }
        if (this.B3 == i && this.C3 == z) {
            i1();
            return;
        }
        this.B3 = i;
        this.C3 = z;
        boolean z3 = this.p3;
        this.p3 = i > 0;
        G();
        if (this.p3 && R0() && this.r4 == null) {
            Z1(0, this.V2, true, true);
        } else if (!this.p3 && !R0() && (k47Var = this.c3) != null && this.J3 != k47Var && !G0() && !y() && !org.telegram.ui.ActionBar.d.hasSheets(yv1Var) && (((sy1Var = this.F0) == null || TextUtils.isEmpty(sy1Var.getText())) && (tL_replyKeyboardMarkup = this.d3) != null && !tL_replyKeyboardMarkup.rows.isEmpty())) {
            gb gbVar = elaVar.I;
            if (gbVar.f) {
                gbVar.j();
            } else {
                gbVar.v = true;
            }
            Z1(1, 1, false, true);
        }
        if (this.q3 != 0 && !(z2 = this.p3) && z2 != z3 && !R0()) {
            this.q3 = 0;
            elaVar.requestLayout();
        }
        if (this.p3 && this.a4) {
            this.a4 = false;
            if (this.f4) {
                this.f4 = false;
                this.x2.setButtons(this.d3);
            }
            gm.r(this.h4);
        }
        i1();
    }

    public final void L0(boolean z) {
        sy1 sy1Var;
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2 = this.k3;
        if (animatorSet2 == null || !animatorSet2.isRunning()) {
            this.R6 = true;
            if (this.K1) {
                N1(true);
            }
            this.S3 = null;
            this.R3 = null;
            this.T3 = null;
            this.U3 = null;
            tec tecVar = this.g1;
            if (tecVar != null) {
                tecVar.a(true);
            }
            zx1 zx1Var = this.c1;
            if (zx1Var != null) {
                zx1Var.setVisibility(0);
            }
            byte b = 3;
            ox1 ox1Var = this.S4;
            ox1 ox1Var2 = this.O4;
            ox1 ox1Var3 = this.Q4;
            Property property = View.SCALE_Y;
            Property property2 = View.SCALE_X;
            rx1 rx1Var = this.R0;
            Property property3 = View.ALPHA;
            tx1 tx1Var = this.h2;
            if (z) {
                if (tx1Var != null) {
                    this.l2 = 0.0f;
                    tx1Var.setAlpha(0.0f);
                    tx1Var.setScaleX(0.0f);
                    tx1Var.setScaleY(0.0f);
                }
                this.n = 0.0f;
                this.h = 0.0f;
                q2();
                this.k3 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(rx1Var, ox1Var3, this.B0 ? 0.5f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(rx1Var, ox1Var2, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.h1, (Property<s09, Float>) property3, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.h1, (Property<s09, Float>) property2, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.h1, (Property<s09, Float>) property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f1, (Property<px1, Float>) property3, 0.0f));
                if (tx1Var != null) {
                    ViewPropertyAnimator viewPropertyAnimator = this.g2;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        this.g2 = null;
                    }
                    this.l2 = 1.0f;
                    arrayList.add(ObjectAnimator.ofFloat(tx1Var, (Property<tx1, Float>) property3, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(tx1Var, (Property<tx1, Float>) property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(tx1Var, (Property<tx1, Float>) property, 1.0f));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.F0, (Property<sy1, Float>) property3, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.F0, ox1Var, 0.0f));
                l lVar = this.E2;
                if (lVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(lVar, (Property<l, Float>) property3, 0.0f));
                    this.E2.e();
                }
                this.k3.playTogether(arrayList);
                eq0 eq0Var = this.m0;
                if (eq0Var != null) {
                    eq0Var.setAlpha(0.0f);
                    this.m0.setScaleY(0.0f);
                    this.m0.setScaleX(0.0f);
                    this.k3.playTogether(ObjectAnimator.ofFloat(this.m0, (Property<eq0, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.m0, (Property<eq0, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.m0, (Property<eq0, Float>) property, 1.0f));
                }
                this.k3.setDuration(150L);
                this.k3.addListener(new nx1(this, b));
            } else {
                boolean z2 = this.x5;
                s09 s09Var = this.h1;
                if (s09Var != null && !z2) {
                    s09Var.d();
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                boolean z3 = this.d1;
                long j = 600;
                Property property4 = View.TRANSLATION_X;
                if (z3) {
                    arrayList2.add(ObjectAnimator.ofFloat(this.g1, (Property<tec, Float>) property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.g1, (Property<tec, Float>) property4, -gm.L(20.0f)));
                    arrayList2.add(ObjectAnimator.ofFloat(this.F0, ox1Var, 0.0f));
                    l lVar2 = this.E2;
                    if (lVar2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(lVar2, (Property<l, Float>) property3, 0.0f));
                        this.E2.e();
                    }
                    animatorSet3.playTogether(arrayList2);
                    float f = this.s;
                    sy1 sy1Var2 = this.F0;
                    if (f == 1.0f) {
                        animatorSet3.playTogether(ObjectAnimator.ofFloat(sy1Var2, (Property<sy1, Float>) property3, 1.0f));
                    } else {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(sy1Var2, (Property<sy1, Float>) property3, 1.0f);
                        ofFloat.setStartDelay(750L);
                        ofFloat.setDuration(200L);
                        animatorSet3.playTogether(ofFloat);
                    }
                } else {
                    sy1 sy1Var3 = this.F0;
                    if (sy1Var3 == null || this.s != 1.0f || z2) {
                        this.H = 0.0f;
                        u2();
                        if (z2 && (sy1Var = this.F0) != null) {
                            sy1Var.setAlpha(0.0f);
                        }
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.F0, (Property<sy1, Float>) property3, 1.0f);
                        ofFloat2.setStartDelay(z2 ? 600L : 750L);
                        ofFloat2.setDuration(z2 ? 360L : 200L);
                        if (z2) {
                            ofFloat2.setInterpolator(d53.g);
                        }
                        animatorSet3.playTogether(ofFloat2);
                    } else {
                        sy1Var3.setAlpha(1.0f);
                        this.H = 0.0f;
                        u2();
                    }
                    if (!z2) {
                        arrayList2.add(ObjectAnimator.ofFloat(this.i1, (Property<l49, Float>) property3, 0.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.i1, (Property<l49, Float>) property4, -gm.L(20.0f)));
                    }
                    l lVar3 = this.E2;
                    if (lVar3 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(lVar3, (Property<l, Float>) property3, 0.0f));
                        this.E2.e();
                    }
                    animatorSet3.playTogether(arrayList2);
                }
                animatorSet3.setDuration(200L);
                if (tx1Var != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.g2;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.g2 = null;
                    }
                    this.l2 = 0.0f;
                    tx1Var.setAlpha(0.0f);
                    tx1Var.setScaleX(0.0f);
                    tx1Var.setScaleY(0.0f);
                    animatorSet = new AnimatorSet();
                    this.l2 = 1.0f;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(tx1Var, (Property<tx1, Float>) property3, 1.0f), ObjectAnimator.ofFloat(tx1Var, (Property<tx1, Float>) property2, 1.0f), ObjectAnimator.ofFloat(tx1Var, (Property<tx1, Float>) property, 1.0f));
                    animatorSet.setDuration(150L);
                } else {
                    animatorSet = null;
                }
                this.n = 0.0f;
                this.h = z2 ? 0.6f : 0.0f;
                q2();
                AnimatorSet animatorSet4 = new AnimatorSet();
                float f2 = z2 ? 0.6f : 0.0f;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.h1, (Property<s09, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.h1, (Property<s09, Float>) property2, f2), ObjectAnimator.ofFloat(this.h1, (Property<s09, Float>) property, f2), ObjectAnimator.ofFloat(rx1Var, ox1Var3, this.B0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(rx1Var, ox1Var2, 1.0f));
                eq0 eq0Var2 = this.m0;
                if (eq0Var2 != null) {
                    eq0Var2.setAlpha(0.0f);
                    this.m0.setScaleY(0.0f);
                    this.m0.setScaleX(0.0f);
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(this.m0, (Property<eq0, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.m0, (Property<eq0, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.m0, (Property<eq0, Float>) property, 1.0f));
                }
                animatorSet4.setDuration(z2 ? 220L : 150L);
                if (z2) {
                    animatorSet4.setInterpolator(d53.g);
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

    public void L1(float f, float f2, float f3, boolean z) {
        int L;
        float f4 = 1.0f - f3;
        float f5 = f * f4;
        float f6 = f2 * f4;
        this.r = (f3 * 0.5f) + 0.5f;
        this.s = f3;
        q2();
        float f7 = -f5;
        this.R0.setTranslationX(f7);
        if (this.F0 == null) {
            L = 0;
        } else {
            int L2 = gm.L(40.0f);
            m6a m6aVar = this.q0;
            L = L2 + ((m6aVar == null || m6aVar.getVisibility() != 0) ? 0 : gm.L(18.0f));
        }
        this.I = f7 - (L * f4);
        s09 s09Var = this.h1;
        if (s09Var != null) {
            s09Var.setTranslationX(f7);
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
        px1 px1Var = this.q2;
        px1Var.setTranslationX(f6);
        this.z1 = f3;
        px1Var.setAlpha((1.0f - this.y1) * f3);
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
        l2();
        u2();
        float f8 = f5 * f4;
        if (this.J != f8) {
            this.J = f8;
            l49 l49Var = this.i1;
            if (l49Var != null) {
                l49Var.setTranslationX(f8);
                this.i1.invalidate();
            }
        }
        if (this.F0 != null) {
            float R1 = gm.R1(0.88f, 1.0f, f3);
            this.F0.setPivotX(0.0f);
            this.F0.setPivotY(r9.getMeasuredHeight() / 2.0f);
            this.F0.setScaleX(R1);
            this.F0.setScaleY(R1);
            this.F0.setHintRightOffset(gm.U1(f3, gm.L(60.0f), 0));
        }
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
    public final void M(boolean z) {
        by1 by1Var;
        String str;
        ImageView imageView;
        a aVar;
        int i;
        boolean z2;
        AnimatorSet animatorSet;
        ?? r13;
        ImageView imageView2;
        boolean z3;
        tx1 tx1Var;
        tx1 tx1Var2;
        AnimatorSet animatorSet2;
        int i2;
        float f;
        tx1 tx1Var3;
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
        C2();
        sy1 sy1Var = this.F0;
        CharSequence m1 = sy1Var == null ? "" : gm.m1(sy1Var.getTextToUse());
        int i5 = this.H0;
        by1 by1Var2 = this.K0;
        ox1 ox1Var = this.P4;
        a aVar2 = this.a1;
        Property property = View.SCALE_X;
        Property property2 = View.SCALE_Y;
        Property property3 = View.ALPHA;
        qmb qmbVar = this.f2;
        zx1 zx1Var = this.c1;
        yz1 yz1Var = this.G0;
        tx1 tx1Var4 = this.h2;
        ImageView imageView4 = this.Q0;
        boolean z6 = z5;
        if (i5 <= 0 || i5 == Integer.MAX_VALUE || X0()) {
            int length = m1.length();
            fn0 fn0Var = this.p7;
            if (length > 0 || this.x3 || this.t2 || this.R3 != null || this.U3 != null || ((this.H0 == Integer.MAX_VALUE && !X0()) || ((this.w7 && getStarsPrice() > 0) || fn0Var.f))) {
                sy1 sy1Var2 = this.F0;
                String caption = sy1Var2 == null ? null : sy1Var2.getCaption();
                boolean z8 = caption != null && (getSendButtonInternal().getVisibility() == 0 || ((tx1Var2 = this.T0) != null && tx1Var2.getVisibility() == 0));
                boolean z9 = caption == null && (imageView4.getVisibility() == 0 || ((tx1Var = this.T0) != null && tx1Var.getVisibility() == 0));
                int F0 = (this.H0 != Integer.MAX_VALUE || X0()) ? F0(cmb.Oe) : F0(cmb.Ml);
                boolean P0 = P0();
                by1Var = by1Var2;
                if (F0 != this.L0) {
                    this.L0 = F0;
                    Drawable background = by1Var.getBackground();
                    int i6 = F0;
                    int red = Color.red(i6);
                    aVar = aVar2;
                    int green = Color.green(i6);
                    str = caption;
                    int blue = Color.blue(i6);
                    imageView = imageView4;
                    cmb.F1(background, Color.argb(24, red, green, blue), true);
                } else {
                    str = caption;
                    imageView = imageView4;
                    aVar = aVar2;
                }
                if (aVar.getVisibility() != 0 && yz1Var.getVisibility() != 0 && !z8 && !z9 && !fn0Var.f) {
                    q02 q02Var = this.m7;
                    if (q02Var != null) {
                        q02Var.e(0, P0 && !F2(), true);
                        if (tx1Var4 != null) {
                            ViewPropertyAnimator viewPropertyAnimator = this.g2;
                            if (viewPropertyAnimator != null) {
                                viewPropertyAnimator.cancel();
                                this.g2 = null;
                            }
                            ViewPropertyAnimator animate = tx1Var4.animate();
                            float f2 = x(P0) ? 0.0f : 1.0f;
                            this.l2 = f2;
                            ViewPropertyAnimator duration = animate.alpha(f2).scaleX(x(P0) ? 0.5f : 1.0f).scaleY(x(P0) ? 0.5f : 1.0f).setInterpolator(d53.h).setDuration(320L);
                            this.g2 = duration;
                            duration.start();
                        }
                    }
                } else {
                    if (!z6) {
                        ImageView imageView5 = imageView;
                        String str2 = str;
                        zx1Var.setScaleX(0.1f);
                        zx1Var.setScaleY(0.1f);
                        zx1Var.setAlpha(0.0f);
                        aVar.setVisibility(8);
                        if (yz1Var.getVisibility() == 0) {
                            yz1Var.setScaleX(0.1f);
                            yz1Var.setScaleY(0.1f);
                            yz1Var.setAlpha(0.0f);
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
                        tx1 tx1Var5 = this.T0;
                        if (tx1Var5 == null || tx1Var5.getVisibility() != 0) {
                            i = 8;
                        } else {
                            this.T0.setScaleX(0.1f);
                            this.T0.setScaleY(0.1f);
                            this.T0.setAlpha(0.0f);
                            i = 8;
                            this.T0.setVisibility(8);
                        }
                        if (qmbVar != null) {
                            qmbVar.setVisibility(i);
                            if (this.P3 != null && getVisibility() == 0) {
                                this.P3.L();
                            }
                            s2(0);
                            q02 q02Var2 = this.m7;
                            if (q02Var2 != null) {
                                q02Var2.e(0, P0 && !F2(), true);
                                if (tx1Var4 != null) {
                                    float f3 = x(P0) ? 0.0f : 1.0f;
                                    this.l2 = f3;
                                    tx1Var4.setAlpha(f3);
                                    tx1Var4.setScaleX(x(P0) ? 0.5f : 1.0f);
                                    tx1Var4.setScaleY(x(P0) ? 0.5f : 1.0f);
                                }
                            } else if (tx1Var4 != null) {
                                this.l2 = 0.0f;
                                tx1Var4.setAlpha(0.0f);
                                tx1Var4.setScaleX(0.5f);
                                tx1Var4.setScaleY(0.5f);
                            }
                        }
                        z2 = true;
                        this.B2 = true;
                        if (this.z2 != null) {
                            uz1 uz1Var = this.P3;
                            if (uz1Var != null && uz1Var.b0()) {
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
                            imageView3.animate().translationX(z3 ? -b10.c(64.0f, by1Var.l(), 0) : gm.L(42.0f)).setDuration(320L).setInterpolator(d53.h).start();
                            return;
                        } else {
                            imageView3.setTranslationX(z3 ? -b10.c(64.0f, by1Var.l(), 0) : gm.L(42.0f));
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
                    if (qmbVar != null) {
                        this.i3 = new AnimatorSet();
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(ObjectAnimator.ofFloat(qmbVar, ox1Var, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(qmbVar, (Property<qmb, Float>) property, 0.5f));
                        ViewPropertyAnimator viewPropertyAnimator2 = this.g2;
                        if (viewPropertyAnimator2 != null) {
                            viewPropertyAnimator2.cancel();
                            this.g2 = null;
                        }
                        q02 q02Var3 = this.m7;
                        if (q02Var3 != null) {
                            q02Var3.e(0, P0 && !F2(), true);
                            if (tx1Var4 != null) {
                                float f4 = x(P0) ? 0.0f : 1.0f;
                                this.l2 = f4;
                                arrayList.add(ObjectAnimator.ofFloat(tx1Var4, (Property<tx1, Float>) property3, f4));
                                arrayList.add(ObjectAnimator.ofFloat(tx1Var4, (Property<tx1, Float>) property, x(P0) ? 0.5f : 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(tx1Var4, (Property<tx1, Float>) property2, x(P0) ? 0.5f : 1.0f));
                            }
                        } else if (tx1Var4 != null) {
                            this.l2 = 0.0f;
                            arrayList.add(ObjectAnimator.ofFloat(tx1Var4, (Property<tx1, Float>) property3, 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(tx1Var4, (Property<tx1, Float>) property, 0.5f));
                            arrayList.add(ObjectAnimator.ofFloat(tx1Var4, (Property<tx1, Float>) property2, 0.5f));
                        }
                        uz1 uz1Var2 = this.P3;
                        boolean z10 = uz1Var2 != null && uz1Var2.b0();
                        this.B2 = true;
                        cy1 cy1Var = this.z2;
                        if (cy1Var != null) {
                            cy1Var.setScaleY(1.0f);
                            cy1 cy1Var2 = this.z2;
                            if (z10) {
                                cy1Var2.setTag(null);
                                arrayList.add(ObjectAnimator.ofFloat(this.z2, (Property<cy1, Float>) property3, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(this.z2, (Property<cy1, Float>) property, 0.0f));
                                arrayList.add(n(0.0f));
                            } else {
                                cy1Var2.setAlpha(0.0f);
                                this.z2.setScaleX(0.0f);
                                this.z2.setTranslationX(0.0f);
                            }
                        }
                        this.i3.playTogether(arrayList);
                        this.i3.setDuration(100L);
                        this.i3.addListener(new ey1(this, z10, (byte) 2));
                        this.i3.start();
                        s2(0);
                        if (this.P3 != null && getVisibility() == 0) {
                            this.P3.L();
                        }
                    }
                    this.h3 = new AnimatorSet();
                    ArrayList arrayList2 = new ArrayList();
                    if (aVar.getVisibility() == 0) {
                        r13 = 0;
                        arrayList2.add(ObjectAnimator.ofFloat(zx1Var, (Property<zx1, Float>) property, 0.1f));
                        arrayList2.add(ObjectAnimator.ofFloat(zx1Var, (Property<zx1, Float>) property2, 0.1f));
                        arrayList2.add(ObjectAnimator.ofFloat(zx1Var, (Property<zx1, Float>) property3, 0.0f));
                    } else {
                        r13 = 0;
                    }
                    tx1 tx1Var6 = this.T0;
                    if (tx1Var6 != null && tx1Var6.getVisibility() == 0) {
                        tx1 tx1Var7 = this.T0;
                        float[] fArr = new float[1];
                        fArr[r13] = 0.1f;
                        arrayList2.add(ObjectAnimator.ofFloat(tx1Var7, (Property<tx1, Float>) property, fArr));
                        tx1 tx1Var8 = this.T0;
                        float[] fArr2 = new float[1];
                        fArr2[r13] = 0.1f;
                        arrayList2.add(ObjectAnimator.ofFloat(tx1Var8, (Property<tx1, Float>) property2, fArr2));
                        tx1 tx1Var9 = this.T0;
                        float[] fArr3 = new float[1];
                        fArr3[r13] = 0.0f;
                        arrayList2.add(ObjectAnimator.ofFloat(tx1Var9, (Property<tx1, Float>) property3, fArr3));
                    }
                    if (yz1Var.getVisibility() == 0) {
                        float[] fArr4 = new float[1];
                        fArr4[r13] = 0.1f;
                        arrayList2.add(ObjectAnimator.ofFloat(yz1Var, (Property<yz1, Float>) property, fArr4));
                        float[] fArr5 = new float[1];
                        fArr5[r13] = 0.1f;
                        arrayList2.add(ObjectAnimator.ofFloat(yz1Var, (Property<yz1, Float>) property2, fArr5));
                        float[] fArr6 = new float[1];
                        fArr6[r13] = 0.0f;
                        arrayList2.add(ObjectAnimator.ofFloat(yz1Var, (Property<yz1, Float>) property3, fArr6));
                    }
                    if (z8) {
                        arrayList2.add(o(r13));
                    } else if (z9) {
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
                        this.h3.setInterpolator(d53.h);
                        this.h3.addListener(new u5(this, str, (byte) 9));
                        this.h3.start();
                    }
                    imageView2 = imageView;
                    if (str == null) {
                    }
                    this.h3.playTogether(arrayList2);
                    this.h3.setDuration(220L);
                    this.h3.setInterpolator(d53.h);
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
            if (this.V0 == null || !this.X0 || (!(this.n4 || (this.o4 && this.H2 == 2)) || gm.E || this.w7)) {
                if (getSendButtonInternal().getVisibility() == 0 || imageView4.getVisibility() == 0 || (((tx1Var3 = this.T0) != null && tx1Var3.getVisibility() == 0) || yz1Var.getVisibility() == 0)) {
                    if (!z6) {
                        yz1Var.setScaleX(0.1f);
                        yz1Var.setScaleY(0.1f);
                        yz1Var.setAlpha(0.0f);
                        setSlowModeButtonVisible(false);
                        getSendButtonInternal().setScaleX(0.1f);
                        getSendButtonInternal().setScaleY(0.1f);
                        getSendButtonInternal().setAlpha(0.0f);
                        getSendButtonInternal().setVisibility(8);
                        imageView4.setScaleX(0.1f);
                        imageView4.setScaleY(0.1f);
                        imageView4.setAlpha(0.0f);
                        imageView4.setVisibility(8);
                        tx1 tx1Var10 = this.T0;
                        if (tx1Var10 != null) {
                            tx1Var10.setScaleX(0.1f);
                            this.T0.setScaleY(0.1f);
                            this.T0.setAlpha(0.0f);
                            this.T0.setVisibility(8);
                        }
                        zx1Var.setScaleX(1.0f);
                        zx1Var.setScaleY(1.0f);
                        zx1Var.setAlpha(1.0f);
                        aVar2.setVisibility(0);
                        if (qmbVar != null) {
                            if (getVisibility() == 0) {
                                this.P3.H1();
                            }
                            this.F = 1.0f;
                            l2();
                            qmbVar.setScaleX(1.0f);
                            qmbVar.setVisibility(0);
                            s2(1);
                        }
                        if (tx1Var4 != null) {
                            ViewPropertyAnimator viewPropertyAnimator3 = this.g2;
                            if (viewPropertyAnimator3 != null) {
                                viewPropertyAnimator3.cancel();
                                this.g2 = null;
                            }
                            this.l2 = 1.0f;
                            tx1Var4.setAlpha(1.0f);
                            tx1Var4.setScaleX(1.0f);
                            tx1Var4.setScaleY(1.0f);
                        }
                        this.B2 = false;
                        uz1 uz1Var3 = this.P3;
                        if (uz1Var3 != null && uz1Var3.b0()) {
                            e0();
                        }
                        if (this.z2 != null) {
                            uz1 uz1Var4 = this.P3;
                            if (uz1Var4 != null && uz1Var4.b0()) {
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
                        if (qmbVar != null) {
                            if (qmbVar.getVisibility() != 0) {
                                qmbVar.setVisibility(0);
                                this.F = 0.0f;
                                l2();
                                qmbVar.setScaleX(0.0f);
                            }
                            this.i3 = new AnimatorSet();
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(ObjectAnimator.ofFloat(qmbVar, ox1Var, 1.0f));
                            arrayList3.add(ObjectAnimator.ofFloat(qmbVar, (Property<qmb, Float>) property, 1.0f));
                            q02 q02Var4 = this.m7;
                            if (q02Var4 != null) {
                                q02Var4.e(0, false, true);
                            }
                            if (tx1Var4 != null) {
                                ViewPropertyAnimator viewPropertyAnimator4 = this.g2;
                                if (viewPropertyAnimator4 != null) {
                                    viewPropertyAnimator4.cancel();
                                    this.g2 = null;
                                }
                                this.l2 = 1.0f;
                                arrayList3.add(ObjectAnimator.ofFloat(tx1Var4, (Property<tx1, Float>) property3, 1.0f));
                                arrayList3.add(ObjectAnimator.ofFloat(tx1Var4, (Property<tx1, Float>) property, 1.0f));
                                arrayList3.add(ObjectAnimator.ofFloat(tx1Var4, (Property<tx1, Float>) property2, 1.0f));
                            }
                            uz1 uz1Var5 = this.P3;
                            boolean z11 = uz1Var5 != null && uz1Var5.b0();
                            this.B2 = false;
                            if (z11) {
                                e0();
                            }
                            cy1 cy1Var3 = this.z2;
                            if (cy1Var3 != null) {
                                if (z11) {
                                    cy1Var3.setVisibility(0);
                                    this.z2.setTag(1);
                                    this.z2.setPivotX(gm.L(44.0f));
                                    arrayList3.add(ObjectAnimator.ofFloat(this.z2, (Property<cy1, Float>) property3, 1.0f));
                                    arrayList3.add(ObjectAnimator.ofFloat(this.z2, (Property<cy1, Float>) property, 1.0f));
                                    arrayList3.add(n(0.0f));
                                    ImageView imageView7 = this.y2;
                                    if (imageView7 != null && imageView7.getVisibility() == 0) {
                                        imageView7.setVisibility(8);
                                    }
                                } else {
                                    cy1Var3.setAlpha(1.0f);
                                    this.z2.setScaleX(1.0f);
                                    this.z2.setScaleY(1.0f);
                                    this.z2.setTranslationX(0.0f);
                                }
                            }
                            this.i3.playTogether(arrayList3);
                            this.i3.setDuration(100L);
                            this.i3.addListener(new nx1(this, (byte) 8));
                            this.i3.start();
                            s2(1);
                            if (getVisibility() == 0) {
                                this.P3.H1();
                            }
                        }
                        aVar2.setVisibility(0);
                        this.h3 = new AnimatorSet();
                        this.l3 = (byte) 2;
                        ArrayList arrayList4 = new ArrayList();
                        yv1 yv1Var = this.F3;
                        TLRPC.Chat f5 = yv1Var == null ? null : yv1Var.f();
                        TLRPC.UserFull userFull = yv1Var == null ? this.L : yv1Var.s8;
                        if (f5 != null) {
                            if (!sd2.v(f5)) {
                                if (!sd2.s(f5)) {
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
                            arrayList4.add(ObjectAnimator.ofFloat(zx1Var, (Property<zx1, Float>) property, fArr13));
                            float[] fArr14 = new float[i2];
                            fArr14[0] = 1.0f;
                            arrayList4.add(ObjectAnimator.ofFloat(zx1Var, (Property<zx1, Float>) property2, fArr14));
                            float[] fArr15 = new float[i2];
                            fArr15[0] = f;
                            arrayList4.add(ObjectAnimator.ofFloat(zx1Var, (Property<zx1, Float>) property3, fArr15));
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
                                tx1 tx1Var11 = this.T0;
                                if (tx1Var11 != null && tx1Var11.getVisibility() == 0) {
                                    tx1 tx1Var12 = this.T0;
                                    float[] fArr19 = new float[i2];
                                    fArr19[0] = 0.1f;
                                    arrayList4.add(ObjectAnimator.ofFloat(tx1Var12, (Property<tx1, Float>) property, fArr19));
                                    tx1 tx1Var13 = this.T0;
                                    float[] fArr20 = new float[i2];
                                    fArr20[0] = 0.1f;
                                    arrayList4.add(ObjectAnimator.ofFloat(tx1Var13, (Property<tx1, Float>) property2, fArr20));
                                    tx1 tx1Var14 = this.T0;
                                    float[] fArr21 = new float[i2];
                                    fArr21[0] = 0.0f;
                                    arrayList4.add(ObjectAnimator.ofFloat(tx1Var14, (Property<tx1, Float>) property3, fArr21));
                                } else if (yz1Var.getVisibility() == 0) {
                                    float[] fArr22 = new float[i2];
                                    fArr22[0] = 0.1f;
                                    arrayList4.add(ObjectAnimator.ofFloat(yz1Var, (Property<yz1, Float>) property, fArr22));
                                    float[] fArr23 = new float[i2];
                                    fArr23[0] = 0.1f;
                                    arrayList4.add(ObjectAnimator.ofFloat(yz1Var, (Property<yz1, Float>) property2, fArr23));
                                    float[] fArr24 = new float[i2];
                                    fArr24[0] = 0.0f;
                                    arrayList4.add(ObjectAnimator.ofFloat(yz1Var, (Property<yz1, Float>) property3, fArr24));
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
                            this.h3.addListener(new nx1(this, (byte) 9));
                            this.h3.start();
                        }
                        i2 = 1;
                        float[] fArr132 = new float[i2];
                        fArr132[0] = 1.0f;
                        arrayList4.add(ObjectAnimator.ofFloat(zx1Var, (Property<zx1, Float>) property, fArr132));
                        float[] fArr142 = new float[i2];
                        fArr142[0] = 1.0f;
                        arrayList4.add(ObjectAnimator.ofFloat(zx1Var, (Property<zx1, Float>) property2, fArr142));
                        float[] fArr152 = new float[i2];
                        fArr152[0] = f;
                        arrayList4.add(ObjectAnimator.ofFloat(zx1Var, (Property<zx1, Float>) property3, fArr152));
                        if (imageView4.getVisibility() != 0) {
                        }
                        this.h3.playTogether(arrayList4);
                        this.h3.setDuration(150L);
                        this.h3.addListener(new nx1(this, (byte) 9));
                        this.h3.start();
                    }
                }
            } else if (!z6) {
                yz1Var.setScaleX(0.1f);
                yz1Var.setScaleY(0.1f);
                yz1Var.setAlpha(0.0f);
                setSlowModeButtonVisible(false);
                getSendButtonInternal().setScaleX(0.1f);
                getSendButtonInternal().setScaleY(0.1f);
                getSendButtonInternal().setAlpha(0.0f);
                getSendButtonInternal().setVisibility(8);
                imageView4.setScaleX(0.1f);
                imageView4.setScaleY(0.1f);
                imageView4.setAlpha(0.0f);
                imageView4.setVisibility(8);
                zx1Var.setScaleX(0.1f);
                zx1Var.setScaleY(0.1f);
                zx1Var.setAlpha(0.0f);
                aVar2.setVisibility(8);
                Y();
                this.T0.setScaleX(1.0f);
                this.T0.setScaleY(1.0f);
                this.T0.setAlpha(1.0f);
                this.T0.setVisibility(0);
                if (qmbVar != null) {
                    if (getVisibility() == 0) {
                        this.P3.H1();
                    }
                    qmbVar.setVisibility(0);
                    s2(1);
                }
                this.B2 = false;
                uz1 uz1Var6 = this.P3;
                boolean z12 = uz1Var6 != null && uz1Var6.b0();
                if (z12) {
                    e0();
                }
                cy1 cy1Var4 = this.z2;
                if (cy1Var4 != null) {
                    if (z12) {
                        cy1Var4.setVisibility(0);
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
                if (qmbVar != null && !this.m3) {
                    qmbVar.setVisibility(0);
                    this.i3 = new AnimatorSet();
                    ArrayList arrayList5 = new ArrayList();
                    arrayList5.add(ObjectAnimator.ofFloat(qmbVar, ox1Var, 1.0f));
                    arrayList5.add(ObjectAnimator.ofFloat(qmbVar, (Property<qmb, Float>) property, 1.0f));
                    q02 q02Var5 = this.m7;
                    if (q02Var5 != null) {
                        q02Var5.e(0, false, true);
                    }
                    if (tx1Var4 != null) {
                        ViewPropertyAnimator viewPropertyAnimator5 = this.g2;
                        if (viewPropertyAnimator5 != null) {
                            viewPropertyAnimator5.cancel();
                            this.g2 = null;
                        }
                        this.l2 = 1.0f;
                        arrayList5.add(ObjectAnimator.ofFloat(tx1Var4, (Property<tx1, Float>) property3, 1.0f));
                        arrayList5.add(ObjectAnimator.ofFloat(tx1Var4, (Property<tx1, Float>) property, 1.0f));
                        arrayList5.add(ObjectAnimator.ofFloat(tx1Var4, (Property<tx1, Float>) property2, 1.0f));
                    }
                    uz1 uz1Var7 = this.P3;
                    boolean z13 = uz1Var7 != null && uz1Var7.b0();
                    this.B2 = false;
                    if (z13) {
                        e0();
                    }
                    cy1 cy1Var5 = this.z2;
                    if (cy1Var5 != null) {
                        cy1Var5.setScaleY(1.0f);
                        cy1 cy1Var6 = this.z2;
                        if (z13) {
                            cy1Var6.setVisibility(0);
                            this.z2.setTag(1);
                            this.z2.setPivotX(gm.L(44.0f));
                            arrayList5.add(ObjectAnimator.ofFloat(this.z2, (Property<cy1, Float>) property3, 1.0f));
                            arrayList5.add(ObjectAnimator.ofFloat(this.z2, (Property<cy1, Float>) property, 1.0f));
                            arrayList5.add(n(0.0f));
                        } else {
                            cy1Var6.setAlpha(1.0f);
                            this.z2.setScaleX(1.0f);
                            this.z2.setTranslationX(0.0f);
                        }
                    }
                    this.i3.playTogether(arrayList5);
                    this.i3.setDuration(100L);
                    this.i3.addListener(new nx1(this, (byte) 6));
                    this.i3.start();
                    s2(1);
                    if (getVisibility() == 0) {
                        this.P3.H1();
                    }
                }
                Y();
                this.T0.setVisibility(0);
                this.h3 = new AnimatorSet();
                this.l3 = (byte) 4;
                ArrayList arrayList6 = new ArrayList();
                arrayList6.add(ObjectAnimator.ofFloat(this.T0, (Property<tx1, Float>) property, 1.0f));
                arrayList6.add(ObjectAnimator.ofFloat(this.T0, (Property<tx1, Float>) property2, 1.0f));
                arrayList6.add(ObjectAnimator.ofFloat(this.T0, (Property<tx1, Float>) property3, 1.0f));
                if (imageView4.getVisibility() == 0) {
                    arrayList6.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property2, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property3, 0.0f));
                } else if (aVar2.getVisibility() == 0) {
                    arrayList6.add(ObjectAnimator.ofFloat(zx1Var, (Property<zx1, Float>) property, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(zx1Var, (Property<zx1, Float>) property2, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(zx1Var, (Property<zx1, Float>) property3, 0.0f));
                } else if (yz1Var.getVisibility() == 0) {
                    arrayList6.add(ObjectAnimator.ofFloat(yz1Var, (Property<yz1, Float>) property, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(yz1Var, (Property<yz1, Float>) property2, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(yz1Var, (Property<yz1, Float>) property3, 0.0f));
                } else {
                    arrayList6.add(ObjectAnimator.ofFloat(getSendButtonInternal(), (Property<View, Float>) property, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(getSendButtonInternal(), (Property<View, Float>) property2, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(getSendButtonInternal(), (Property<View, Float>) property3, 0.0f));
                }
                this.h3.playTogether(arrayList6);
                this.h3.setDuration(250L);
                this.h3.addListener(new nx1(this, (byte) 7));
                this.h3.start();
            }
        } else if (yz1Var.getVisibility() != 0) {
            if (!z6) {
                yz1Var.setScaleX(1.0f);
                yz1Var.setScaleY(1.0f);
                yz1Var.setAlpha(1.0f);
                setSlowModeButtonVisible(true);
                zx1Var.setScaleX(0.1f);
                zx1Var.setScaleY(0.1f);
                zx1Var.setAlpha(0.0f);
                aVar2.setVisibility(8);
                getSendButtonInternal().setScaleX(0.1f);
                getSendButtonInternal().setScaleY(0.1f);
                getSendButtonInternal().setAlpha(0.0f);
                getSendButtonInternal().setVisibility(8);
                imageView4.setScaleX(0.1f);
                imageView4.setScaleY(0.1f);
                imageView4.setAlpha(0.0f);
                imageView4.setVisibility(8);
                tx1 tx1Var15 = this.T0;
                if (tx1Var15 == null || tx1Var15.getVisibility() != 0) {
                    i3 = 8;
                } else {
                    this.T0.setScaleX(0.1f);
                    this.T0.setScaleY(0.1f);
                    this.T0.setAlpha(0.0f);
                    i3 = 8;
                    this.T0.setVisibility(8);
                }
                if (qmbVar != null) {
                    qmbVar.setVisibility(i3);
                    if (this.P3 != null && getVisibility() == 0) {
                        this.P3.L();
                    }
                    z4 = false;
                    s2(0);
                    q02 q02Var6 = this.m7;
                    if (q02Var6 != null) {
                        q02Var6.e(0, false, false);
                    }
                    if (tx1Var4 != null) {
                        this.l2 = 0.0f;
                        tx1Var4.setAlpha(0.0f);
                        tx1Var4.setScaleX(0.5f);
                        tx1Var4.setScaleY(0.5f);
                    }
                } else {
                    z4 = false;
                }
                this.B2 = z4;
                uz1 uz1Var8 = this.P3;
                boolean z14 = uz1Var8 != null && uz1Var8.b0();
                if (z14) {
                    e0();
                }
                cy1 cy1Var7 = this.z2;
                if (cy1Var7 != null) {
                    if (z14) {
                        cy1Var7.setVisibility(0);
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
                if (qmbVar != null) {
                    this.i3 = new AnimatorSet();
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(ObjectAnimator.ofFloat(qmbVar, ox1Var, 0.0f));
                    arrayList7.add(ObjectAnimator.ofFloat(qmbVar, (Property<qmb, Float>) property, 0.5f));
                    this.B2 = false;
                    uz1 uz1Var9 = this.P3;
                    boolean z15 = uz1Var9 != null && uz1Var9.b0();
                    if (z15) {
                        e0();
                    }
                    q02 q02Var7 = this.m7;
                    if (q02Var7 != null) {
                        q02Var7.e(0, false, true);
                    }
                    if (tx1Var4 != null) {
                        this.l2 = 0.0f;
                        arrayList7.add(ObjectAnimator.ofFloat(tx1Var4, (Property<tx1, Float>) property3, 0.0f));
                        arrayList7.add(ObjectAnimator.ofFloat(tx1Var4, (Property<tx1, Float>) property, 0.5f));
                        arrayList7.add(ObjectAnimator.ofFloat(tx1Var4, (Property<tx1, Float>) property2, 0.5f));
                    }
                    cy1 cy1Var8 = this.z2;
                    if (cy1Var8 != null) {
                        cy1Var8.setScaleY(1.0f);
                        cy1 cy1Var9 = this.z2;
                        if (z15) {
                            cy1Var9.setVisibility(0);
                            this.z2.setTag(1);
                            this.z2.setPivotX(gm.L(44.0f));
                            arrayList7.add(n(0.0f));
                            arrayList7.add(ObjectAnimator.ofFloat(this.z2, (Property<cy1, Float>) property3, 1.0f));
                            arrayList7.add(ObjectAnimator.ofFloat(this.z2, (Property<cy1, Float>) property, 1.0f));
                        } else {
                            cy1Var9.setTranslationX(0.0f);
                            this.z2.setAlpha(1.0f);
                            this.z2.setScaleX(1.0f);
                        }
                    }
                    this.i3.playTogether(arrayList7);
                    this.i3.setDuration(100L);
                    this.i3.addListener(new nx1(this, (byte) 4));
                    this.i3.start();
                    s2(0);
                    if (this.P3 != null && getVisibility() == 0) {
                        this.P3.L();
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
                    arrayList8.add(ObjectAnimator.ofFloat(zx1Var, (Property<zx1, Float>) property, 0.1f));
                    arrayList8.add(ObjectAnimator.ofFloat(zx1Var, (Property<zx1, Float>) property2, 0.1f));
                    arrayList8.add(ObjectAnimator.ofFloat(zx1Var, (Property<zx1, Float>) property3, 0.0f));
                } else {
                    r5 = 0;
                    i4 = 1;
                }
                tx1 tx1Var16 = this.T0;
                if (tx1Var16 != null && tx1Var16.getVisibility() == 0) {
                    tx1 tx1Var17 = this.T0;
                    float[] fArr28 = new float[i4];
                    fArr28[r5] = 0.1f;
                    arrayList8.add(ObjectAnimator.ofFloat(tx1Var17, (Property<tx1, Float>) property, fArr28));
                    tx1 tx1Var18 = this.T0;
                    float[] fArr29 = new float[i4];
                    fArr29[r5] = 0.1f;
                    arrayList8.add(ObjectAnimator.ofFloat(tx1Var18, (Property<tx1, Float>) property2, fArr29));
                    tx1 tx1Var19 = this.T0;
                    float[] fArr30 = new float[i4];
                    fArr30[r5] = 0.0f;
                    arrayList8.add(ObjectAnimator.ofFloat(tx1Var19, (Property<tx1, Float>) property3, fArr30));
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
                arrayList8.add(ObjectAnimator.ofFloat(yz1Var, (Property<yz1, Float>) property, fArr34));
                float[] fArr35 = new float[1];
                fArr35[r5] = 1.0f;
                arrayList8.add(ObjectAnimator.ofFloat(yz1Var, (Property<yz1, Float>) property2, fArr35));
                float[] fArr36 = new float[1];
                fArr36[r5] = 1.0f;
                arrayList8.add(ObjectAnimator.ofFloat(yz1Var, (Property<yz1, Float>) property3, fArr36));
                setSlowModeButtonVisible(true);
                this.h3.playTogether(arrayList8);
                this.h3.setDuration(220L);
                this.h3.setInterpolator(d53.h);
                this.h3.addListener(new nx1(this, (byte) 5));
                this.h3.start();
            }
        }
        by1Var = by1Var2;
        z3 = false;
        if (this.Z5) {
        }
    }

    public final void M0() {
        s1();
        this.S3 = null;
        this.R3 = null;
        this.T3 = null;
        this.U3 = null;
        tec tecVar = this.g1;
        if (tecVar != null) {
            tecVar.a(true);
        }
        l49 l49Var = this.i1;
        if (l49Var != null) {
            l49Var.setAlpha(1.0f);
            this.i1.setTranslationX(0.0f);
        }
        tec tecVar2 = this.g1;
        if (tecVar2 != null) {
            tecVar2.setAlpha(1.0f);
            this.g1.setTranslationX(0.0f);
        }
        sy1 sy1Var = this.F0;
        if (sy1Var != null) {
            sy1Var.setAlpha(1.0f);
            this.H = 0.0f;
            u2();
            this.F0.requestFocus();
        }
        px1 px1Var = this.f1;
        if (px1Var != null) {
            px1Var.setVisibility(8);
        }
        V0();
    }

    public final void M1(boolean z) {
        int i;
        if (this.w7 == z) {
            return;
        }
        this.w7 = z;
        this.h2.setVisibility(z ? 8 : 0);
        if (z) {
            gm.B2(this.y2);
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
            r1();
            this.d0 = -1;
            NumberTextView numberTextView = this.c0;
            if (numberTextView != null) {
                numberTextView.setVisibility(8);
            }
        }
        s2(this.T6);
        M(false);
    }

    public final void N() {
        if (this.V0 != null) {
            Point point = gm.q;
            int i = point.x > point.y ? this.o3 : this.n3;
            int L = ((((this.e2 - gm.m) - gm.n) - gm.L(6.0f)) - org.telegram.ui.ActionBar.a.getCurrentActionBarHeight()) - getHeight();
            byte b = 2;
            if (this.H2 == 2) {
                L = Math.min(L, gm.L(175.0f) + i);
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
                ny1 ny1Var = this.j4;
                if (i2 > L) {
                    mw1 mw1Var = new mw1(this, (byte) 20);
                    this.V0.setLayerType(2, null);
                    if (this.w) {
                        this.x = mw1Var;
                    } else {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        c0d c0dVar = this.l7;
                        int i3 = this.t4 - i;
                        if (c0dVar != null) {
                            animatorSet2.playTogether(ValueAnimator.ofInt(-i3), ValueAnimator.ofInt(-(this.t4 - i)));
                        } else {
                            animatorSet2.playTogether(ObjectAnimator.ofInt(this, ny1Var, -i3), ObjectAnimator.ofInt(this.V0, ny1Var, -(this.t4 - i)));
                            ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new bx1(this, b));
                        }
                        animatorSet2.setDuration(300L);
                        animatorSet2.setInterpolator(d53.f);
                        animatorSet2.addListener(new u5(this, mw1Var, (byte) 13));
                        this.r4 = animatorSet2;
                        animatorSet2.start();
                    }
                } else {
                    if (this.l7 == null) {
                        this.V0.getLayoutParams().height = this.t4;
                    }
                    this.c2.requestLayout();
                    sy1 sy1Var = this.F0;
                    if (sy1Var != null) {
                        int selectionStart = sy1Var.getSelectionStart();
                        int selectionEnd = this.F0.getSelectionEnd();
                        sy1 sy1Var2 = this.F0;
                        sy1Var2.setText(sy1Var2.getText());
                        this.F0.setSelection(selectionStart, selectionEnd);
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    c0d c0dVar2 = this.l7;
                    int i4 = this.t4 - i;
                    if (c0dVar2 != null) {
                        animatorSet3.playTogether(ValueAnimator.ofInt(-i4), ValueAnimator.ofInt(-(this.t4 - i)));
                    } else {
                        animatorSet3.playTogether(ObjectAnimator.ofInt(this, ny1Var, -i4), ObjectAnimator.ofInt(this.V0, ny1Var, -(this.t4 - i)));
                        ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new bx1(this, (byte) 3));
                    }
                    animatorSet3.setDuration(300L);
                    animatorSet3.setInterpolator(d53.f);
                    animatorSet3.addListener(new nx1(this, b2));
                    this.r4 = animatorSet3;
                    this.V0.setLayerType(2, null);
                    animatorSet3.start();
                }
                c0d c0dVar3 = this.l7;
                if (c0dVar3 != null) {
                    ((g0d) c0dVar3).h(L);
                }
            }
        }
    }

    public void N0(boolean z) {
        if (this.w2 == null || !this.V3) {
            return;
        }
        gx1 gx1Var = this.W;
        if (gx1Var != null) {
            gm.r(gx1Var);
        }
        this.V3 = false;
        this.W3 = false;
        if (this.X3) {
            this.o7.a(false, z);
        }
    }

    public final void N1(boolean z) {
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
                ofFloat.addUpdateListener(new bx1(this, (byte) 10));
                this.Q1.setDuration(200L);
                this.Q1.setInterpolator(d53.g);
                this.Q1.start();
                return;
            }
        }
        this.P1 = 0.0f;
        va2 C0 = C0();
        if (C0 != null) {
            C0.setInputBubbleExtraAlpha(1.0f);
        }
        px1 px1Var = this.f1;
        if (px1Var != null) {
            px1Var.invalidate();
        }
    }

    public final void O() {
        this.s7 = B(true);
        p0();
        float B = B(false);
        if (this.r7 != B) {
            this.r7 = B;
            c1(B);
        }
    }

    public final boolean O0() {
        tc tcVar = this.K6;
        return tcVar != null && tcVar.getVisibility() == 0;
    }

    public final void O1(CharSequence charSequence, boolean z) {
        this.e = charSequence;
        this.f = null;
        r2(z);
    }

    public final void P() {
        float f = this.o7.e;
        if (this.w2 != null) {
            float measuredHeight = getMeasuredHeight() - this.n7.f;
            this.w2.setTranslationY(measuredHeight - (r4.getMeasuredHeight() * f));
            this.w2.setVisibility(f > 0.0f ? 0 : 8);
        }
        boolean z = f > 0.0f;
        if (this.I6 != z) {
            px1 px1Var = this.p2;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) px1Var.getLayoutParams();
            int i = z ? this.w2.getLayoutParams().height : 0;
            layoutParams.topMargin = i;
            layoutParams.topMargin = gm.L(9.0f) + i;
            px1Var.setLayoutParams(layoutParams);
            this.I6 = z;
            setMinimumHeight(gm.L(44.0f) + (z ? this.w2.getLayoutParams().height : 0));
            if (this.p4) {
                if (this.H2 == 0) {
                    S1(false, true, false, true);
                } else {
                    N();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if ((r3.getLineRight(0) + r0) >= ((r5.getWidth() - r5.getPaddingLeft()) - r5.getPaddingRight())) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean P0() {
        if (!O0()) {
            sy1 sy1Var = this.F0;
            if (sy1Var != null) {
                if (TextUtils.isEmpty(sy1Var.getCaption())) {
                    sy1 sy1Var2 = this.F0;
                    int L = gm.L(44.0f);
                    Layout layout = sy1Var2.getLayout();
                    if (layout != null) {
                        if (layout.getLineCount() > 0) {
                            if (layout.getLineCount() <= 1) {
                            }
                        }
                    }
                }
                return true;
            }
            if (jb6.a0) {
                return true;
            }
        }
        return false;
    }

    public final void P1(boolean z, boolean z2) {
        String M0;
        zx1 zx1Var = this.c1;
        if (zx1Var == null) {
            return;
        }
        this.d1 = z;
        if (z2) {
            SharedPreferences d1 = oc7.d1();
            boolean z3 = false;
            if (pg3.y(this.G3)) {
                TLRPC.Chat L0 = oc7.r1(this.S.a).L0(Long.valueOf(-this.G3));
                if (sd2.T(L0) && !L0.megagroup) {
                    z3 = true;
                }
            }
            d1.edit().putBoolean(z3 ? "currentModeVideoChannel" : "currentModeVideo", z).apply();
        }
        zx1Var.j(this.d1 ? b02.b : b02.a, z2);
        zx1Var.setContentDescription(jb6.M0(this.d1 ? 2131754735 : 2131754733, null));
        if (g0()) {
            M0 = jb6.M0(2131754874, null);
        } else {
            M0 = jb6.M0(this.d1 ? 2131754735 : 2131754733, null);
        }
        this.a1.setContentDescription(M0);
        i0();
        wz1 wz1Var = this.b2;
        if (wz1Var != null) {
            wz1Var.d(g0());
        }
        zx1Var.sendAccessibilityEvent(8);
    }

    public final void Q() {
        yv1 yv1Var = this.F3;
        if (yv1Var != null) {
            hs6.d0(this.R).T1(yv1Var.a(), yv1Var.O5(yv1Var.F5), "", null, null, null, null, 0L, false, true, null);
        }
        setRichDraftPreview(null);
    }

    public final boolean Q0() {
        return this.P2 != null;
    }

    public final void Q1(k47 k47Var, nv1 nv1Var, k47 k47Var2) {
        k47 k47Var3;
        yv1 yv1Var = this.F3;
        boolean z = (yv1Var == null || !yv1Var.V7() || this.K3 == k47Var2) ? false : true;
        if (k47Var != null) {
            if (this.M3 == null && (k47Var3 = this.c3) != this.J3) {
                this.M3 = k47Var3;
            }
            this.J3 = k47Var;
            this.L3 = nv1Var;
            this.K3 = k47Var2;
            if (yv1Var == null || !yv1Var.x4 || yv1Var.m4 != k47Var) {
                D1(k47Var, true, true);
            }
        } else if (this.J3 == this.c3) {
            this.J3 = null;
            this.K3 = null;
            this.L3 = null;
            D1(this.M3, true, false);
            this.M3 = null;
        } else {
            this.J3 = null;
            this.L3 = null;
            this.K3 = null;
        }
        I(true);
        uz1 uz1Var = this.P3;
        TL_stories.StoryItem C0 = uz1Var != null ? uz1Var.C0() : null;
        MediaController w = MediaController.w();
        k47 threadMessage = getThreadMessage();
        w.r1 = k47Var;
        w.s1 = threadMessage;
        w.t1 = C0;
        r2(z);
    }

    public final void R() {
        gm.t1(this.F0);
    }

    public final boolean R0() {
        return this.X0 || this.Y0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void R1(int i, boolean z) {
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
                ofFloat.addUpdateListener(new bx1(this, b));
                this.w0.addListener(new ey1(this, z2, b));
                this.w0.setDuration(220L);
                this.w0.setInterpolator(d53.f);
                this.w0.start();
            } else {
                this.x0 = z2 ? 1.0f : 0.0f;
                jz1 jz1Var = this.V0;
                if (jz1Var != null) {
                    jz1Var.Z();
                }
            }
        }
        this.H2 = i;
    }

    public final void S() {
        if (this.n2 != null) {
            return;
        }
        tx1 tx1Var = new tx1(this, getContext(), (byte) 2);
        this.n2 = tx1Var;
        n99 n99Var = new n99(getContext());
        this.K2 = n99Var;
        tx1Var.setImageDrawable(n99Var);
        n99 n99Var2 = this.K2;
        int i = cmb.Ml;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        ylb ylbVar = this.L4;
        anb.x(this, n99Var2, i, ylbVar, mode);
        this.K2.a(R.drawable.input_bot2, false);
        this.n2.setScaleType(ImageView.ScaleType.CENTER);
        tx1 tx1Var2 = this.n2;
        int i2 = cmb.h6;
        anb.R(tx1Var2, cmb.f0(F0(i2), 1, -1), null, anb.M(i2), ylbVar);
        this.n2.setVisibility(8);
        gm.T3(this.n2, false, 0.1f, true, false);
        this.f2.addView(this.n2, 0, qoe.o(44, 44));
        this.n2.setOnClickListener(new rw1(this, (byte) 20));
    }

    public final boolean S0(View view) {
        return view == this.x2 || view == this.V0;
    }

    public final void S1(boolean z, boolean z2, boolean z3, boolean z4) {
        final byte b = 1;
        gb gbVar = this.V;
        if ((gbVar != null && gbVar.f) || this.b4 || this.V0 == null) {
            return;
        }
        if (z3 || this.p4 != z) {
            this.p4 = z;
            uz1 uz1Var = this.P3;
            if (uz1Var != null) {
                uz1Var.Y0();
            }
            Point point = gm.q;
            final int i = point.x > point.y ? this.o3 : this.n3;
            AnimatorSet animatorSet = this.r4;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.r4 = null;
            }
            boolean z5 = this.p4;
            byte b2 = 3;
            po poVar = this.A4;
            ny1 ny1Var = this.j4;
            final byte b3 = 0;
            ela elaVar = this.c2;
            if (z5) {
                if (z4) {
                    nm7.e().k(nm7.j1, 1);
                }
                int height = elaVar.getHeight();
                this.e2 = height;
                int L = ((((height - gm.m) - gm.n) - gm.L(6.0f)) - org.telegram.ui.ActionBar.a.getCurrentActionBarHeight()) - getHeight();
                this.t4 = L;
                if (this.H2 == 2) {
                    this.t4 = Math.min(L, gm.L(175.0f) + i);
                }
                if (this.l7 == null) {
                    this.V0.getLayoutParams().height = this.t4;
                }
                elaVar.requestLayout();
                if (this.X5) {
                    elaVar.setForeground(new yb1(this));
                }
                sy1 sy1Var = this.F0;
                if (sy1Var != null) {
                    int selectionStart = sy1Var.getSelectionStart();
                    int selectionEnd = this.F0.getSelectionEnd();
                    sy1 sy1Var2 = this.F0;
                    sy1Var2.setText(sy1Var2.getText());
                    this.F0.setSelection(selectionStart, selectionEnd);
                }
                if (z2) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    c0d c0dVar = this.l7;
                    int i2 = this.t4 - i;
                    if (c0dVar != null) {
                        animatorSet2.playTogether(ValueAnimator.ofInt(-i2), ValueAnimator.ofInt(-(this.t4 - i)), ObjectAnimator.ofFloat(this.v4, "animationProgress", 1.0f));
                    } else {
                        animatorSet2.playTogether(ObjectAnimator.ofInt(this, ny1Var, -i2), ObjectAnimator.ofInt(this.V0, ny1Var, -(this.t4 - i)), ObjectAnimator.ofFloat(this.v4, "animationProgress", 1.0f));
                    }
                    animatorSet2.setDuration(300L);
                    animatorSet2.setInterpolator(d53.f);
                    if (this.l7 == null) {
                        ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ax1
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
                                        int i4 = ChatActivityEnterView.z7;
                                        chatActivityEnterView.s4 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.t4 - i3)));
                                        chatActivityEnterView.c2.invalidate();
                                        break;
                                    default:
                                        int i5 = ChatActivityEnterView.z7;
                                        chatActivityEnterView.s4 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.t4 - i3));
                                        chatActivityEnterView.c2.invalidate();
                                        break;
                                }
                            }
                        });
                    }
                    animatorSet2.addListener(new nx1(this, b));
                    this.r4 = animatorSet2;
                    this.V0.setLayerType(2, null);
                    poVar.d();
                    this.s4 = 0.0f;
                    elaVar.invalidate();
                    animatorSet2.start();
                } else {
                    this.s4 = 1.0f;
                    if (this.l7 == null) {
                        setTranslationY(-(this.t4 - i));
                        this.V0.setTranslationY(-(this.t4 - i));
                    }
                    AnimatedArrowDrawable animatedArrowDrawable = this.v4;
                    if (animatedArrowDrawable != null) {
                        animatedArrowDrawable.setAnimationProgress(1.0f);
                    }
                }
                c0d c0dVar2 = this.l7;
                if (c0dVar2 != null) {
                    ((g0d) c0dVar2).h(this.t4);
                }
            } else {
                if (z4) {
                    nm7.e().k(nm7.k1, 1);
                }
                if (z2) {
                    this.q4 = true;
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    if (this.l7 != null) {
                        animatorSet3.playTogether(ValueAnimator.ofInt(0), ValueAnimator.ofInt(0), ObjectAnimator.ofFloat(this.v4, "animationProgress", 0.0f));
                    } else {
                        animatorSet3.playTogether(ObjectAnimator.ofInt(this, ny1Var, 0), ObjectAnimator.ofInt(this.V0, ny1Var, 0), ObjectAnimator.ofFloat(this.v4, "animationProgress", 0.0f));
                    }
                    animatorSet3.setDuration(300L);
                    animatorSet3.setInterpolator(d53.f);
                    if (this.l7 == null) {
                        ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ax1
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
                                        int i4 = ChatActivityEnterView.z7;
                                        chatActivityEnterView.s4 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.t4 - i3)));
                                        chatActivityEnterView.c2.invalidate();
                                        break;
                                    default:
                                        int i5 = ChatActivityEnterView.z7;
                                        chatActivityEnterView.s4 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.t4 - i3));
                                        chatActivityEnterView.c2.invalidate();
                                        break;
                                }
                            }
                        });
                    }
                    animatorSet3.addListener(new co(this, i, b2));
                    this.s4 = 1.0f;
                    elaVar.invalidate();
                    this.r4 = animatorSet3;
                    this.V0.setLayerType(2, null);
                    poVar.d();
                    animatorSet3.start();
                } else {
                    this.s4 = 0.0f;
                    if (this.l7 == null) {
                        setTranslationY(0.0f);
                        this.V0.setTranslationY(0.0f);
                        this.V0.getLayoutParams().height = i;
                    }
                    elaVar.requestLayout();
                    elaVar.setForeground(null);
                    elaVar.setWillNotDraw(false);
                    AnimatedArrowDrawable animatedArrowDrawable2 = this.v4;
                    if (animatedArrowDrawable2 != null) {
                        animatedArrowDrawable2.setAnimationProgress(0.0f);
                    }
                }
                c0d c0dVar3 = this.l7;
                if (c0dVar3 != null) {
                    ((g0d) c0dVar3).h(i);
                }
            }
            tx1 tx1Var = this.T0;
            if (tx1Var != null) {
                if (this.p4) {
                    tx1Var.setContentDescription(jb6.M0(2131754893, "AccDescrCollapsePanel"));
                } else {
                    tx1Var.setContentDescription(jb6.M0(2131754883, "AccDescrExpandPanel"));
                }
            }
        }
    }

    public final void T() {
        if (this.m0 == null) {
            eq0 eq0Var = new eq0(getContext());
            this.m0 = eq0Var;
            eq0Var.setOnClickListener(new rw1(this, (byte) 11));
            this.o2.addView(this.m0, qoe.d(-2, 32.0f, 83, 8.0f, 6.0f, 8.0f, 6.0f));
            gm.T3(this.m0, false, 1.0f, true, false);
            eq0 eq0Var2 = this.m0;
            if (!eq0Var2.f) {
                eq0Var2.f = true;
                eq0Var2.h = 1.0f;
                eq0Var2.requestLayout();
                eq0Var2.invalidate();
            }
        }
    }

    public final boolean T0() {
        return this.v3 && ChatActivityEnterView.this.h5;
    }

    public final void T1(boolean z, boolean z2) {
        float f;
        float f2;
        if (this.k5 == z && z2) {
            return;
        }
        ImageView imageView = this.m2;
        if (imageView == null) {
            if (!z && !this.w7) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = new ImageView(getContext());
                this.m2 = imageView2;
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                ImageView imageView3 = this.m2;
                int i = cmb.Ml;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                ylb ylbVar = this.L4;
                anb.s(imageView3, i, ylbVar, mode);
                this.m2.setImageResource(R.drawable.input_suggest_paid_24);
                ImageView imageView4 = this.m2;
                int i2 = cmb.h6;
                anb.R(imageView4, cmb.f0(F0(i2), 1, -1), null, anb.M(i2), ylbVar);
                if (this.w7) {
                    this.m2.setTranslationX(gm.L(42.0f));
                    this.p2.addView(this.m2, qoe.d(44, 44.0f, 85, 0.0f, 0.0f, 50.0f, 0.0f));
                } else {
                    this.f2.addView(this.m2, 0, qoe.o(44, 44));
                }
                this.m2.setOnClickListener(new rw1(this, r3));
                this.m2.setContentDescription(jb6.M0(2131754921, null));
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
            if (this.w7) {
                this.m2.setVisibility(0);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.m2.getAlpha(), f2);
            this.l5 = ofFloat;
            ofFloat.addUpdateListener(new bx1(this, (byte) 11));
            this.l5.addListener(new ey1(this, z, r3));
            this.l5.setDuration(220L);
            this.l5.setInterpolator(d53.h);
            this.l5.start();
        } else {
            this.m2.setScaleX(f);
            this.m2.setScaleY(f);
            this.m2.setAlpha(f2);
            if (this.w7) {
                this.m2.setVisibility(z ? (byte) 0 : (byte) 8);
            }
        }
        s2(this.T6);
        if (z3) {
            M(true);
        }
    }

    public final void U() {
        if (this.c0 != null) {
            return;
        }
        NumberTextView numberTextView = new NumberTextView(getContext());
        this.c0 = numberTextView;
        numberTextView.setVisibility(8);
        this.c0.setTextSize(15);
        this.c0.setTextColor(F0(cmb.x6));
        this.c0.setTypeface(gm.o());
        this.c0.setCenterAlign(true);
        addView(this.c0, Math.min(2, getChildCount()), qoe.d(44, 20.0f, 85, 3.0f, 0.0f, 0.0f, 44.0f));
    }

    public final boolean U0() {
        if (this.v3) {
            return true;
        }
        AnimatorSet animatorSet = this.j3;
        return (animatorSet == null || !animatorSet.isRunning() || this.a3) ? false : true;
    }

    public final void U1(boolean z, boolean z2) {
        olc olcVar;
        boolean z3 = false;
        if (!this.K1 || (olcVar = this.T1) == null) {
            this.U1 = false;
            return;
        }
        if (this.U1 == z && z2) {
            return;
        }
        this.U1 = z;
        l49 l49Var = this.i1;
        if (l49Var != null) {
            olcVar.c(Math.round(Math.max(1.0f, (l49Var.w - l49Var.s) * l49Var.r)));
        }
        if (z) {
            gm.r(this.X1);
        } else if (this.T1.c.hasFocus()) {
            gm.t1(this.T1.c);
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
            ofFloat.addUpdateListener(new bx1(this, (byte) 7));
            this.W1.setDuration(360L);
            this.W1.setInterpolator(d53.h);
            this.W1.start();
        } else {
            u(f);
        }
        by1 by1Var = this.K0;
        if (by1Var != null) {
            if (this.K1 && this.U1) {
                z3 = true;
            }
            by1Var.setIconDimmed(z3);
        }
        l lVar = this.E2;
        if (lVar != null) {
            lVar.invalidate();
        }
    }

    public final void V1(boolean z) {
        yv1 yv1Var;
        un3 un3Var;
        byte b = 0;
        boolean z2 = (z || this.t2) && (yv1Var = this.F3) != null && !yv1Var.x() && ((un3Var = this.j1) == null || !un3Var.o()) && !O0();
        if (this.j6 != z2) {
            if (z2) {
                oc7.r1(this.R).P1().b();
            }
            this.j6 = z2;
            ImageView imageView = this.j2;
            imageView.setVisibility(0);
            imageView.animate().alpha(z2 ? 1.0f : 0.0f).scaleX(z2 ? 1.0f : 0.6f).scaleY(z2 ? 1.0f : 0.6f).setInterpolator(d53.h).setDuration(420L).withEndAction(new cx1(this, z2, b)).start();
            if (!z2) {
                hg5 hg5Var = this.N;
                if (hg5Var != null) {
                    hg5Var.f(true);
                    this.N = null;
                    return;
                }
                return;
            }
            hd hdVar = this.i2;
            Objects.requireNonNull(hdVar);
            imageView.postDelayed(new gd(hdVar, (byte) 1), 220L);
            hg5 hg5Var2 = this.N;
            if (hg5Var2 != null) {
                hg5Var2.f(true);
                this.N = null;
            }
            if (oc7.d1().getInt("aihintshown", 0) < 3) {
                hg5 hg5Var3 = new hg5(getContext(), 3);
                this.N = hg5Var3;
                hg5Var3.p(true);
                this.N.t(jb6.M0(2131754992, null));
                setHintGlass(this.N);
                this.N.o(0.0f, (imageView.getWidth() / 2.0f) + gm.L(4.0f));
                addView(this.N, qoe.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
                hg5 hg5Var4 = this.N;
                hg5Var4.r0 = new uj1(this, hg5Var3, (byte) 27);
                hg5Var4.d = 4000L;
                hg5Var4.v();
                oc7.d1().edit().putInt("aihintshown", oc7.d1().getInt("aihintshown", 0) + 1).apply();
            }
        }
    }

    public final void W(boolean z) {
        if (this.v2 != null) {
            return;
        }
        by1 by1Var = new by1(this, getContext(), this.L4);
        this.v2 = by1Var;
        by1Var.setContentDescription(jb6.M0(2131751211, null));
        if (z) {
            rve.a(this.v2);
        }
        this.p2.addView(this.v2, qoe.e(44, 44, 85));
    }

    public final boolean W0(View view) {
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        if (view != this.h2) {
            return view.getAlpha() > 0.01f && view.getScaleX() > 0.01f;
        }
        return true;
    }

    public final void W1() {
        yv1 yv1Var = this.F3;
        if (yv1Var == null || !sd2.V(yv1Var.e)) {
            return;
        }
        c41.b0(yv1Var).f(oc7.r1(this.R).l4.h1.f(), new mw1(this, (byte) 11)).j();
    }

    public final void X() {
        jz1 jz1Var = this.V0;
        if (jz1Var != null && jz1Var.d1 != z8c.t0) {
            this.d2.removeView(jz1Var);
            jz1Var = null;
            this.V0 = null;
        }
        if (jz1Var != null) {
            return;
        }
        jz1 jz1Var2 = new jz1(this, this.F3, this.y3, getContext(), this.T2, this.c2, this.X5, this.L4, this.U0, this.l7 != null);
        this.V0 = jz1Var2;
        jz1Var2.w0 = true;
        if (!this.X5) {
            jz1Var2.updateColors();
        }
        this.V0.H(true, this.z3, this.A3, true);
        this.V0.setVisibility(8);
        this.V0.setShowing(false);
        if (this.l7 != null) {
            jz1 jz1Var3 = this.V0;
            jz1Var3.x0 = false;
            jz1Var3.setShouldDrawBackground(false);
            this.V0.W0 = true;
        }
        this.V0.setDelegate(new nz1(this));
        this.V0.setDragListener(new dbc(this));
        jz1 jz1Var4 = this.V0;
        if (jz1Var4 != null) {
            jz1Var4.J(-this.G3, !this.A0, !this.b);
        }
        w();
        H();
    }

    public final boolean X0() {
        return c() || this.q7.f;
    }

    public boolean X1(Runnable runnable) {
        return false;
    }

    public final void Y() {
        if (this.T0 != null) {
            return;
        }
        tx1 tx1Var = new tx1(this, getContext(), (byte) 3);
        this.T0 = tx1Var;
        tx1Var.setScaleType(ImageView.ScaleType.CENTER);
        tx1 tx1Var2 = this.T0;
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(F0(cmb.Ml), false);
        this.v4 = animatedArrowDrawable;
        tx1Var2.setImageDrawable(animatedArrowDrawable);
        this.T0.setVisibility(8);
        this.T0.setScaleX(0.1f);
        this.T0.setScaleY(0.1f);
        this.T0.setAlpha(0.0f);
        tx1 tx1Var3 = this.T0;
        int i = cmb.h6;
        anb.R(tx1Var3, cmb.f0(F0(i), 1, -1), null, anb.M(i), this.L4);
        this.q2.addView(this.T0, qoe.e(44, 44, 85));
        this.T0.setOnClickListener(new rw1(this, (byte) 7));
        this.T0.setContentDescription(jb6.M0(2131754883, "AccDescrExpandPanel"));
    }

    public final boolean Y0() {
        View view = this.w2;
        return view != null && view.getVisibility() == 0;
    }

    public final void Y1() {
        Z1(1, 0, true, true);
    }

    public final void Z() {
        if (this.F0 != null) {
            return;
        }
        Context context = getContext();
        ylb ylbVar = this.L4;
        sy1 sy1Var = new sy1(this, context, ylbVar);
        this.F0 = sy1Var;
        int i = Build.VERSION.SDK_INT;
        byte b = 0;
        if (i >= 28) {
            sy1Var.setFallbackLineSpacing(false);
        }
        if (i >= 35) {
            this.F0.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        this.F0.setDelegate(new dx1(this));
        yv1 yv1Var = this.F3;
        if (yv1Var == null || yv1Var.getParentLayout() == null || !((ActionBarLayout) yv1Var.getParentLayout()).b) {
            this.F0.setWindowView(this.E3.getWindow().getDecorView());
        } else {
            this.F0.setWindowView(yv1Var.getParentLayout().getWindow().getDecorView());
        }
        TLRPC.EncryptedChat encryptedChat = yv1Var != null ? yv1Var.h : null;
        this.F0.setAllowTextEntitiesIntersection(g2());
        String string = Settings.Secure.getString(getContext().getContentResolver(), "default_input_method");
        int i2 = ((string == null || !string.startsWith("com.samsung")) && encryptedChat != null) ? 285212672 : TLObject.FLAG_28;
        this.F0.setIncludeFontPadding(false);
        this.F0.setImeOptions(i2);
        sy1 sy1Var2 = this.F0;
        int inputType = sy1Var2.getInputType() | 147456;
        this.a = inputType;
        sy1Var2.setInputType(inputType);
        r2(false);
        this.F0.setSingleLine(false);
        this.F0.setMaxLines(6);
        this.F0.setTextSize(1, 18.0f);
        this.F0.setGravity(80);
        this.F0.setPadding(0, gm.L(9.0f), 0, gm.L(10.0f));
        this.F0.setBackgroundDrawable(null);
        anb.X(this.F0, cmb.Ke, ylbVar);
        anb.G(this.F0, cmb.Xc, ylbVar);
        anb.C(this.F0, cmb.kg, ylbVar);
        sy1 sy1Var3 = this.F0;
        int i3 = cmb.Le;
        anb.A(sy1Var3, i3, ylbVar);
        anb.D(this.F0, i3, ylbVar);
        anb.v(this.F0, cmb.Me, ylbVar);
        anb.y(this.F0, cmb.lg, ylbVar);
        sy1 sy1Var4 = this.F0;
        boolean z = this.M4;
        FrameLayout.LayoutParams d = qoe.d(-1, -2.0f, 80, 52.0f, 0.0f, z ? 50.0f : 2.0f, 1.5f);
        px1 px1Var = this.o2;
        px1Var.addView(sy1Var4, 1, d);
        mi9 mi9Var = new mi9(this.R, ylbVar, getContext());
        this.s2 = mi9Var;
        mi9Var.setAllowActions(false);
        this.s2.setMaxHeight(gm.L(150.0f));
        this.s2.setMinHeight(gm.L(88.0f));
        this.s2.setVisibility(8);
        this.s2.setPadding(gm.L(8.0f), gm.L(9.0f), gm.L(8.0f), gm.L(10.0f));
        this.s2.setOnClickListener(new rw1(this, (byte) 14));
        px1Var.addView(this.s2, 2, qoe.d(-1, -2.0f, 80, 44.0f, 0.0f, (z ? 50 : 2) - 8, 1.5f));
        i2();
        this.F0.setOnKeyListener(new ty1(this));
        this.F0.setOnEditorActionListener(new uy1(this, b));
        this.F0.addTextChangedListener(new vy1(this));
        this.F0.addTextChangedListener(new fj());
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
        r2(false);
        A2(yv1Var != null && yv1Var.getFragmentBeginToShow());
        if (yv1Var != null) {
            yv1Var.H4(false, false);
        }
        s2(this.T6);
    }

    public final void Z0(TLRPC.Document document, String str, g47 g47Var, boolean z, int i, int i2, Object obj, Long l, boolean z2) {
        if (this.H0 > 0 && !c()) {
            uz1 uz1Var = this.P3;
            if (uz1Var != null) {
                yz1 yz1Var = this.G0;
                uz1Var.a1(yz1Var, ((lka) yz1Var.c).getText(), true);
                return;
            }
            return;
        }
        if (this.H2 != 0) {
            R1(0, true);
            this.V0.r(true);
            this.V0.y();
        }
        S1(false, true, false, true);
        uz1 uz1Var2 = this.P3;
        TL_stories.StoryItem C0 = uz1Var2 != null ? uz1Var2.C0() : null;
        a6a B = a6a.B(this.R);
        long j = this.G3;
        k47 k47Var = this.J3;
        k47 threadMessage = getThreadMessage();
        nv1 nv1Var = this.L3;
        boolean z3 = obj instanceof TLRPC.TL_messages_stickerSet;
        yv1 yv1Var = this.F3;
        B.t0(document, str, j, k47Var, threadMessage, C0, nv1Var, g47Var, z, i, i2, z3, obj, yv1Var != null ? yv1Var.X6() : null, l.longValue(), getSendMonoForumPeerId(), getSendMessageSuggestionParams());
        uz1 uz1Var3 = this.P3;
        if (uz1Var3 != null) {
            uz1Var3.w(null, true, i, 0, 0L);
        }
        if (z2) {
            setFieldText("");
        }
        hs6.d0(this.R).d(0, obj, document, (int) (System.currentTimeMillis() / 1000), false);
    }

    public final void Z1(int i, int i2, boolean z, boolean z2) {
        byte b;
        boolean z3;
        boolean z4;
        int i3;
        ViewGroup viewGroup;
        int i4;
        float f;
        if (i != 2) {
            po poVar = this.A4;
            dy1 dy1Var = this.N4;
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
                    w();
                    if (this.X0) {
                        this.V0.getVisibility();
                    }
                    this.V0.setVisibility(0);
                    this.X0 = true;
                    gz1 gz1Var = this.x2;
                    if (gz1Var == null || gz1Var.getVisibility() == 8) {
                        i3 = 0;
                    } else {
                        this.x2.setVisibility(8);
                        this.Y0 = false;
                        i3 = this.x2.getMeasuredHeight();
                    }
                    this.V0.setShowing(true);
                    jz1 jz1Var = this.V0;
                    this.e4 = 0;
                    viewGroup = jz1Var;
                } else if (i2 == 1) {
                    if (this.Y0) {
                        this.x2.getVisibility();
                    }
                    this.Y0 = true;
                    jz1 jz1Var2 = this.V0;
                    if (jz1Var2 == null || jz1Var2.getVisibility() == 8) {
                        i4 = 0;
                    } else {
                        this.d2.removeView(this.V0);
                        this.V0.setVisibility(8);
                        this.V0.setShowing(false);
                        this.X0 = false;
                        i4 = this.V0.getMeasuredHeight();
                    }
                    this.x2.setVisibility(0);
                    gz1 gz1Var2 = this.x2;
                    this.e4 = 1;
                    oc7.r1(this.R).X3.edit().remove("closed_botkeyboard_" + getTopicKeyString()).apply();
                    i3 = i4;
                    viewGroup = gz1Var2;
                } else {
                    i3 = 0;
                    viewGroup = null;
                }
                this.V2 = i2;
                if (this.n3 <= 0) {
                    f = 200.0f;
                    this.n3 = oc7.c1().getInt("kbd_height", gm.L(200.0f));
                } else {
                    f = 200.0f;
                }
                int i5 = this.o3;
                if (i5 <= 0) {
                    i5 = oc7.c1().getInt("kbd_height_land3", gm.L(f));
                    this.o3 = i5;
                }
                Point point = gm.q;
                if (point.x <= point.y) {
                    i5 = this.n3;
                }
                yv1 yv1Var = this.F3;
                if (yv1Var != null && yv1Var.getParentLayout() != null) {
                    i5 -= ((ActionBarLayout) yv1Var.getParentLayout()).u(false);
                }
                if (i2 == 1) {
                    i5 = Math.min(this.x2.getKeyboardHeight(), i5);
                }
                gz1 gz1Var3 = this.x2;
                if (gz1Var3 != null) {
                    gz1Var3.setPanelHeight(i5);
                }
                if (viewGroup != null && this.l7 == null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
                    layoutParams.height = i5;
                    viewGroup.setLayoutParams(layoutParams);
                }
                if (!gm.E) {
                    gm.t1(this.F0);
                }
                ela elaVar = this.c2;
                if (elaVar != null) {
                    this.q3 = i5;
                    elaVar.requestLayout();
                    H1(true, true);
                    m2(true);
                    i1();
                    if (this.Y2 && !this.p3 && i5 != i3 && z) {
                        mw1 mw1Var = new mw1(this, (byte) 25);
                        if (this.w) {
                            this.x = mw1Var;
                        } else {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.W0 = animatorSet;
                            float f2 = i5 - i3;
                            if (this.l7 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(f2, 0.0f));
                            } else {
                                viewGroup.setTranslationY(f2);
                                this.W0.playTogether(ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) property, f2, 0.0f));
                            }
                            this.W0.setInterpolator(gb.w);
                            this.W0.setDuration(250L);
                            this.W0.addListener(new u5(this, mw1Var, (byte) 11));
                            gm.d3(dy1Var, 50L);
                            poVar.d();
                        }
                        requestLayout();
                    }
                }
                c0d c0dVar = this.l7;
                if (c0dVar != null) {
                    ((g0d) c0dVar).h(i5);
                }
            } else {
                if (this.R0 != null) {
                    H1(false, true);
                }
                this.V2 = -1;
                jz1 jz1Var3 = this.V0;
                if (jz1Var3 != null) {
                    if (i == 2 && !gm.D && !gm.E) {
                        this.w4 = false;
                        uz1 uz1Var = this.P3;
                        if (uz1Var != null) {
                            uz1Var.o(0.0f);
                        }
                        this.d2.removeView(this.V0);
                        this.V0 = null;
                    } else if (!this.Y2 || this.p3 || this.p4) {
                        uz1 uz1Var2 = this.P3;
                        if (uz1Var2 != null) {
                            uz1Var2.o(0.0f);
                        }
                        z5 = false;
                        this.q3 = 0;
                        this.d2.removeView(this.V0);
                        this.V0.setVisibility(8);
                        this.V0.setShowing(false);
                    } else {
                        this.X0 = true;
                        this.e4 = 0;
                        jz1Var3.setShowing(false);
                        ex1 ex1Var = new ex1(this, i, z6 ? 1 : 0);
                        if (this.w) {
                            z3 = false;
                            this.x = ex1Var;
                        } else {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.W0 = animatorSet2;
                            c0d c0dVar2 = this.l7;
                            jz1 jz1Var4 = this.V0;
                            if (c0dVar2 != null) {
                                z3 = false;
                                animatorSet2.playTogether(ValueAnimator.ofFloat(jz1Var4.getMeasuredHeight()), ValueAnimator.ofFloat(0.0f, 1.0f));
                            } else {
                                z3 = false;
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(jz1Var4, (Property<jz1, Float>) property, jz1Var4.getMeasuredHeight()));
                            }
                            this.W0.setInterpolator(gb.w);
                            this.W0.setDuration(250L);
                            poVar.d();
                            this.W0.addListener(new u5(this, ex1Var, (byte) 12));
                        }
                        gm.d3(dy1Var, 50L);
                        requestLayout();
                        z5 = z3;
                    }
                    this.X0 = z5;
                }
                gz1 gz1Var4 = this.x2;
                if (gz1Var4 != null && gz1Var4.getVisibility() == 0) {
                    if (i != 2 || gm.D || gm.E) {
                        if (this.Y2 && !this.p3) {
                            if (this.Y0) {
                                this.e4 = 1;
                            }
                            AnimatorSet animatorSet3 = new AnimatorSet();
                            this.W0 = animatorSet3;
                            c0d c0dVar3 = this.l7;
                            gz1 gz1Var5 = this.x2;
                            if (c0dVar3 != null) {
                                b = 0;
                                animatorSet3.playTogether(ValueAnimator.ofFloat(gz1Var5.getMeasuredHeight()));
                            } else {
                                b = 0;
                                animatorSet3.playTogether(ObjectAnimator.ofFloat(gz1Var5, (Property<gz1, Float>) property, gz1Var5.getMeasuredHeight()));
                            }
                            this.W0.setInterpolator(gb.w);
                            this.W0.setDuration(250L);
                            this.W0.addListener(new oz1(this, i, b));
                            poVar.d();
                            gm.d3(dy1Var, 50L);
                            requestLayout();
                        } else if (!this.a4) {
                            this.x2.setVisibility(8);
                        }
                    }
                    this.Y0 = false;
                }
                if (i2 == 1 && this.c3 != null) {
                    oc7.r1(this.R).X3.edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.c3.e1()).apply();
                }
                m2(true);
                c0d c0dVar4 = this.l7;
                if (c0dVar4 != null) {
                    ((g0d) c0dVar4).i(z2);
                }
            }
            if (this.n4 || this.o4) {
                M(true);
            }
            if (!this.p4 || i == 1) {
                z4 = false;
            } else {
                z4 = false;
                S1(false, false, false, true);
            }
            r2(z4);
            G();
        }
    }

    @Override // ddb
    public final boolean a() {
        un3 un3Var = this.j1;
        return un3Var != null && un3Var.q();
    }

    public final void a0() {
        if (this.f1 != null) {
            return;
        }
        px1 px1Var = new px1(this, getContext(), (byte) 3);
        this.f1 = px1Var;
        px1Var.setVisibility(this.R3 == null ? 8 : 0);
        this.f1.setFocusable(true);
        this.f1.setFocusableInTouchMode(true);
        this.f1.setClickable(true);
        this.o2.addView(this.f1, qoe.e(-1, 44, 80));
        s09 s09Var = new s09(getContext());
        this.h1 = s09Var;
        s09Var.setScaleType(ImageView.ScaleType.CENTER);
        this.h1.f(R.raw.chat_audio_record_delete_2, 28, 28, null);
        this.h1.getAnimatedDrawable().p0 = true;
        this.A5 = this.h1.getAnimatedDrawable();
        x2();
        this.h1.setContentDescription(jb6.M0(2131751535, "Delete"));
        s09 s09Var2 = this.h1;
        int i = cmb.h6;
        fg0 f0 = cmb.f0(F0(i), 1, -1);
        wmb M = anb.M(i);
        ylb ylbVar = this.L4;
        anb.R(s09Var2, f0, null, M, ylbVar);
        this.f1.addView(this.h1, qoe.c(44.0f, 44));
        this.h1.setOnClickListener(new rw1(this, (byte) 10));
        tec tecVar = new tec(getContext());
        this.g1 = tecVar;
        tecVar.setVisibility(4);
        tec tecVar2 = this.g1;
        tecVar2.T = !this.X5;
        tecVar2.setRoundFrames(true);
        this.g1.setDelegate(new fy1(this));
        this.f1.addView(this.g1, qoe.d(-1, -1.0f, 19, 56.0f, 0.0f, 8.0f, 0.0f));
        Context context = getContext();
        rec recVar = new rec(context);
        TextPaint textPaint = new TextPaint(1);
        recVar.d = textPaint;
        recVar.e = -1L;
        textPaint.setTextSize(gm.L(14.0f));
        recVar.b = context.getDrawable(R.drawable.tooltip_arrow);
        recVar.a = cmb.b0(gm.L(5.0f), cmb.w0(null, cmb.gg, false));
        recVar.b();
        recVar.setTime(0);
        this.g1.setTimeHintView(recVar);
        this.c2.addView(recVar, qoe.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 52.0f));
        l49 l49Var = new l49(getContext(), ylbVar);
        this.i1 = l49Var;
        this.f1.addView(l49Var, qoe.d(-1, 32.0f, 19, 44.0f, 0.0f, 4.0f, 0.0f));
        s2(this.T6);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a1(TL_keyboard.KeyboardButton keyboardButton) {
        boolean z;
        k47 k47Var;
        k47 k47Var2;
        boolean s0;
        k47 k47Var3;
        uz1 uz1Var;
        yv1 yv1Var;
        boolean z2 = this.J3 != null && (yv1Var = this.F3) != null && yv1Var.x4 && yv1Var.d() == ((long) this.J3.e1());
        if (this.J3 == null || z2) {
            int i = this.R;
            long j = this.G3;
            if (j > 0) {
                z = m9c.w(oc7.r1(i).W1(Long.valueOf(j)));
            } else {
                oc7.r1(i).L0(Long.valueOf(-j));
                z = false;
            }
            if (!z) {
                k47Var = pg3.y(this.G3) ? this.c3 : null;
                k47Var2 = this.J3;
                if (k47Var2 != null || z2) {
                    k47Var2 = this.c3;
                }
                s0 = s0(keyboardButton, k47Var, k47Var2, null);
                if (this.J3 != null || z2) {
                    k47Var3 = this.c3;
                    if (k47Var3 != null && k47Var3.k.reply_markup.single_use) {
                        if (s0) {
                            Z1(0, 0, true, true);
                        } else {
                            k1();
                        }
                        oc7.r1(this.R).X3.edit().putInt("answered_" + getTopicKeyString(), this.c3.e1()).commit();
                    }
                } else {
                    k1();
                    D1(this.M3, true, false);
                }
                uz1Var = this.P3;
                if (uz1Var == null) {
                    uz1Var.w(null, true, 0, 0, 0L);
                    return;
                }
                return;
            }
        }
        k47Var = this.J3;
        k47Var2 = this.J3;
        if (k47Var2 != null) {
        }
        k47Var2 = this.c3;
        s0 = s0(keyboardButton, k47Var, k47Var2, null);
        if (this.J3 != null) {
        }
        k47Var3 = this.c3;
        if (k47Var3 != null) {
            if (s0) {
            }
            oc7.r1(this.R).X3.edit().putInt("answered_" + getTopicKeyString(), this.c3.e1()).commit();
        }
        uz1Var = this.P3;
        if (uz1Var == null) {
        }
    }

    public final void a2() {
        uz1 uz1Var = this.P3;
        if ((uz1Var == null || !uz1Var.h()) && pg3.y(this.G3)) {
            TLRPC.Chat L0 = oc7.r1(this.S.a).L0(Long.valueOf(-this.G3));
            c41 b0 = c41.b0(this.F3);
            StringBuilder sb = new StringBuilder();
            if (sd2.p(L0)) {
                sb.append(jb6.M0(2131745341, null));
            }
            if (sd2.u(L0)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(jb6.M0(2131745338, null));
            }
            if (sd2.t(L0)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(jb6.M0(2131745339, null));
            }
            if (sd2.o(L0)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(jb6.M0(2131745342, null));
            }
            if (sd2.l(L0)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(jb6.M0(2131745343, null));
            }
            if (sd2.v(L0)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(jb6.M0(2131745337, null));
            }
            if (sd2.s(L0)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(jb6.M0(2131745340, null));
            }
            if (sd2.m(L0)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(jb6.M0(2131745344, null));
            }
            b0.G(R.raw.passcode_lock_close, 3, jb6.a0("SendPlainTextRestrictionHint", null, 2131745326, sb.toString())).j();
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.Ie));
        hashSet.add(Integer.valueOf(cmb.Uf));
        hashSet.add(Integer.valueOf(cmb.o7));
        hashSet.add(Integer.valueOf(cmb.x6));
        hashSet.add(Integer.valueOf(cmb.Sf));
        hashSet.add(Integer.valueOf(cmb.Rf));
        hashSet.add(Integer.valueOf(cmb.Oe));
    }

    @Override // u2b
    public final boolean b() {
        yv1 yv1Var = this.F3;
        return yv1Var != null && yv1Var.M4();
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
        if (this.b2 == null || this.D2 == null || this.D1 || !e86.e(360928) || !this.D2.isShown()) {
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
        float measuredHeight = ((this.b2.getMeasuredHeight() / 2.0f) - gm.L(3.0f)) + (r5[1] - r6[1]);
        RecordCircle recordCircle2 = this.D2;
        float f9 = recordCircle2.K;
        float f10 = recordCircle2.L;
        float max = (Math.max(recordCircle2.M, gm.L(10.0f)) * 1.5f) + gm.L(6.0f);
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
            int max2 = Math.max(1, Math.round(gm.p * 0.75f));
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
            int F0 = F0(cmb.Tf) | (-16777216);
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
                iArr3[i14] = on2.f(f13, F0, i9);
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
                        iArr5[i17] = J2(i19);
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
            lta ltaVar = this.E5;
            if (ltaVar == null) {
                ltaVar = new lta(2400);
                this.E5 = ltaVar;
            }
            ltaVar.a();
            this.E5.e(false);
            lta ltaVar2 = this.E5;
            ltaVar2.t = iArr3;
            ltaVar2.s = true;
            ltaVar2.u = cmb.I.o() ? 0.12f : 0.0f;
            lta ltaVar3 = this.E5;
            ltaVar3.S = 0.0f;
            ltaVar3.R = 0.0f;
            float f14 = i11;
            float min = Math.min(1.0f, 1400.0f / f14);
            float f15 = gm.p;
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
                        if (I2(i33 + 3) <= (((i32 * 0.7f) / 255.0f) + f16) * f17) {
                            float I2 = I2(i33 + 11);
                            float I22 = I2(i33 + 12);
                            float I23 = I2(i33 + 14);
                            float f18 = i29 + f11;
                            float f19 = I2 - 0.5f;
                            i7 = i29;
                            float f20 = max2;
                            float f21 = (f19 * f20) + f18;
                            f6 = f9;
                            float f22 = i25 + f12;
                            i6 = i25;
                            float f23 = I22 - 0.5f;
                            float f24 = (f23 * f20) + f22;
                            f7 = f10;
                            float f25 = this.I5;
                            f5 = f12;
                            f8 = f11;
                            float i34 = Utilities.i((f21 - f25) / (this.J5 - f25), 1.0f, 0.0f);
                            float f26 = (0.03f * I23) + (i34 * 0.2f) + 0.04f;
                            float w = b10.w(f23, 3.0f, f15, width);
                            float w2 = b10.w(f19, 2.0f, f15, measuredHeight);
                            float A = mlb.A(i34, 0.16f, 0.92f, (I2(i33 + 15) * 0.16f) + 0.5f);
                            float g = aq1.g(I2, 0.25f, f16, width - f21, f21);
                            float min2 = Math.min(f24, measuredHeight) - (((I23 * 22.0f) + 8.0f) * f15);
                            lta ltaVar4 = this.E5;
                            int J2 = J2(i30);
                            int i35 = 0;
                            while (true) {
                                if (i35 >= 7) {
                                    i8 = 7;
                                    break;
                                }
                                if (J2 <= iArr[i35]) {
                                    i8 = i35;
                                    break;
                                }
                                i35++;
                            }
                            ltaVar4.j(f21, f24, g, min2, w, w2, A, f26, i8);
                            i24 = i31 + 1;
                            fArr2[i31] = (A * 0.95f) + f26;
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
                        if (I2(i42 + 5) <= (((i41 * 0.7f) / 255.0f) + 0.3f) * min3) {
                            float I24 = I2(i42 + 6);
                            float I25 = I2(i42 + 7);
                            float I26 = I2(i42 + 8);
                            i = i10;
                            float f31 = I24 - 0.5f;
                            int i43 = i24;
                            float f32 = max2;
                            i2 = max2;
                            float f33 = (f31 * f32) + f30 + i38;
                            float f34 = I25 - 0.5f;
                            f2 = min3;
                            float f35 = (f32 * f34) + f27 + i36;
                            float f36 = f33 - f28;
                            float f37 = f35 - f29;
                            i3 = i36;
                            i4 = i38;
                            float sqrt = (float) Math.sqrt((f37 * f37) + (f36 * f36));
                            if (sqrt < gm.L(1.0f)) {
                                double d = I26 * 3.141592653589793d * 2.0d;
                                f4 = (float) Math.cos(d);
                                f3 = (float) Math.sin(d);
                            } else {
                                f3 = f37 / sqrt;
                                f4 = f36 / sqrt;
                            }
                            float I27 = ((I2(i42 + 9) * 13.0f) + 7.0f) * f15;
                            float f38 = I26 * 0.05f;
                            float w3 = b10.w(f34, 3.0f, f15, width);
                            float w4 = b10.w(f31, 2.0f, f15, measuredHeight);
                            float I28 = (I2(i42 + 10) * 0.2f) + 0.56f;
                            float g2 = aq1.g(I24, 0.25f, 0.3f, width - f33, f33);
                            float min4 = Math.min(f35, measuredHeight) - (((I25 * 22.0f) + 8.0f) * f15);
                            lta ltaVar5 = this.E5;
                            int J22 = J2(i40);
                            int i44 = 0;
                            while (true) {
                                if (i44 >= 7) {
                                    i5 = 7;
                                    break;
                                }
                                if (J22 <= iArr[i44]) {
                                    i5 = i44;
                                    break;
                                }
                                i44++;
                            }
                            ltaVar5.j(f33, f35, g2, min4, w3, w4, I28, f38, i5);
                            lta ltaVar6 = this.E5;
                            int i45 = ltaVar6.C;
                            int i46 = ((i45 + r3) - 1) % ltaVar6.b;
                            ltaVar6.w[i46] = f4 * I27;
                            ltaVar6.x[i46] = f3 * I27;
                            i24 = i43 + 1;
                            fArr2[i43] = (I28 * 0.95f) + f38;
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
            wz1 wz1Var = this.b2;
            wz1Var.getClass();
            long uptimeMillis = SystemClock.uptimeMillis();
            if (wz1Var.c || wz1Var.e) {
                f = 1.0f;
            } else if (wz1Var.f) {
                f = wz1Var.a;
            } else {
                long j = wz1Var.H;
                if (j < 0) {
                    j = uptimeMillis;
                }
                f = wz1.a(uptimeMillis - j);
            }
            wz1Var.s = gm.R1(0.85f, 1.0f, f) * gm.L(5.0f);
            wz1Var.n = true;
            if (wz1Var.G) {
                uptimeMillis -= 240;
            }
            wz1Var.r = uptimeMillis;
            wz1Var.y = 0.0f;
            wz1Var.x = 0.0f;
            wz1Var.w = 0.0f;
            wz1Var.c = false;
            wz1Var.d.stop();
            wz1Var.g().O(true, 0.0f);
            wz1Var.invalidate();
            this.n = 0.0f;
            this.h = 0.55f;
            q2();
            float f42 = this.M5 + 260.0f + 16.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, f42);
            ofFloat.setDuration((long) f42);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.addUpdateListener(new kx1(this, this.b2, gm.L(3.0f) + gm.L(12.0f), this.D2));
            ofFloat.addListener(new ey1(this));
            return ofFloat;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final float b1(FrameLayout frameLayout) {
        float measuredHeight = getMeasuredHeight() - this.n7.f;
        float f = 0.0f;
        View view = frameLayout;
        while (view != null) {
            if (view == this) {
                return measuredHeight - f;
            }
            f += view.getTranslationY() + view.getTop();
            view = view.getParent() instanceof View ? (View) view.getParent() : null;
        }
        return frameLayout.getHeight() - gm.L(44.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0039 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b2(boolean z) {
        boolean z2;
        yv1 yv1Var;
        un3 un3Var = this.j1;
        byte b = 1;
        boolean z3 = un3Var != null && un3Var.o();
        if (!z3 && ((this.t2 || z) && (yv1Var = this.F3) != null && !yv1Var.x() && this.P2 == null)) {
            oc7.r1(this.R);
            boolean z4 = e21.a;
            if (!O0()) {
                z2 = true;
                if (this.k6 != z2) {
                    return;
                }
                this.k6 = z2;
                ImageView imageView = this.k2;
                imageView.setVisibility(0);
                imageView.animate().alpha(z2 ? 1.0f : 0.0f).scaleX(z2 ? 1.0f : z3 ? 0.85f : 0.6f).scaleY(z2 ? 1.0f : z3 ? 0.85f : 0.6f).setInterpolator(d53.h).setDuration((z3 || this.l6) ? 150L : 420L).withEndAction(new cx1(this, z2, b)).start();
                return;
            }
        }
        z2 = false;
        if (this.k6 != z2) {
        }
    }

    @Override // u2b
    public final boolean c() {
        yv1 yv1Var = this.F3;
        return yv1Var != null && yv1Var.X7();
    }

    public final void c0() {
        l lVar = this.E2;
        ela elaVar = this.c2;
        if (lVar == null) {
            l lVar2 = new l(this, getContext());
            this.E2 = lVar2;
            lVar2.setVisibility(8);
            elaVar.addView(this.E2, qoe.e(-1, -2, 80));
        }
        if (this.D2 != null) {
            return;
        }
        RecordCircle recordCircle = new RecordCircle(getContext());
        this.D2 = recordCircle;
        recordCircle.setVisibility(8);
        elaVar.addView(this.D2, qoe.e(-1, -2, 80));
    }

    public final boolean c2() {
        ImageView imageView;
        if (this.O != null || (imageView = this.m2) == null || imageView.getVisibility() != 0 || oc7.d1().getInt("channelsuggesthint2", 0) >= 2) {
            return false;
        }
        hg5 hg5Var = new hg5(getContext(), 3);
        this.O = hg5Var;
        hg5Var.q(13.0f);
        setHintGlass(this.O);
        this.O.p(true);
        this.O.t(jb6.a0(null, null, 2131744107, no4.i(this.R, this.G3)));
        this.O.setPadding(gm.L(12.0f), 0, gm.L(12.0f), 0);
        this.O.o(1.0f, -((getWidth() - gm.L(12.0f)) - ((this.m2.getMeasuredWidth() / 2.0f) + (this.m2.getX() + (this.f2.getX() + this.o2.getX())))));
        addView(this.O, qoe.d(-1, 200.0f, 48, 0.0f, -192.0f, 0.0f, 0.0f));
        hg5 hg5Var2 = this.O;
        hg5Var2.r0 = new mw1(this, (byte) 27);
        hg5Var2.d = 8000L;
        hg5Var2.v();
        oc7.d1().edit().putInt("channelsuggesthint2", oc7.d1().getInt("channelsuggesthint2", 0) + 1).apply();
        return true;
    }

    @Override // ddb
    public final void d(TextWatcher textWatcher) {
        sy1 sy1Var = this.F0;
        if (sy1Var != null) {
            sy1Var.addTextChangedListener(textWatcher);
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
        this.o2.addView(this.e1, qoe.c(44.0f, -1));
        this.e1.setOnTouchListener(new p8((byte) 28));
        a6 a6Var2 = this.e1;
        SlideTextView slideTextView = new SlideTextView(getContext());
        this.a2 = slideTextView;
        a6Var2.addView(slideTextView, qoe.d(-1, -1.0f, 0, 45.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(0);
        this.d.setPadding(gm.L(13.0f), 0, 0, 0);
        this.d.setFocusable(false);
        LinearLayout linearLayout2 = this.d;
        wz1 wz1Var = new wz1(this, getContext());
        this.b2 = wz1Var;
        linearLayout2.addView(wz1Var, qoe.t(28, 28, 16, 0, 0, 0, 0));
        this.b2.d(g0());
        this.b2.setOnClickListener(new rw1(this, (byte) 8));
        LinearLayout linearLayout3 = this.d;
        zz1 zz1Var = new zz1(this, getContext());
        this.Z0 = zz1Var;
        linearLayout3.addView(zz1Var, qoe.t(-1, -1, 16, 6, 0, 0, 0));
        this.e1.addView(this.d, qoe.e(-1, -1, 16));
    }

    public final void d1() {
        l(false);
        glc glcVar = this.r1;
        byte b = 1;
        if (glcVar != null) {
            glcVar.j("destroy", true);
            jlc jlcVar = glcVar.h;
            if (jlcVar != null) {
                gm.B2(jlcVar);
                glcVar.h = null;
            }
            ykc ykcVar = glcVar.K;
            if (ykcVar != null) {
                gm.B2(ykcVar);
                glcVar.K = null;
            }
            this.r1 = null;
        }
        if (this.m1) {
            this.m1 = false;
            DictationAsr.T(this.q1);
        }
        un3 un3Var = this.j1;
        if (un3Var != null) {
            DictationAsr.T(un3Var.m0);
            un3Var.m();
            ap3 ap3Var = un3Var.F;
            if (ap3Var != null) {
                ap3Var.a();
            }
            va2 va2Var = un3Var.a0;
            if (va2Var != null) {
                va2Var.f = null;
            }
            gm.B2(un3Var.s);
            gm.B2(un3Var.w);
            this.j1 = null;
        }
        l49 l49Var = this.i1;
        if (l49Var != null) {
            l49Var.T = true;
            ndc ndcVar = l49Var.n;
            if (ndcVar != null) {
                ndcVar.t0(false);
                l49Var.n.l0();
                l49Var.n = null;
            }
        }
        if (this.i1 != null && this.R3 != null) {
            hs6 d0 = hs6.d0(this.R);
            long j = this.G3;
            yv1 yv1Var = this.F3;
            long d = (yv1Var == null || !yv1Var.x4) ? 0L : yv1Var.d();
            l49 l49Var2 = this.i1;
            float audioLeft = l49Var2 == null ? 0.0f : l49Var2.getAudioLeft();
            l49 l49Var3 = this.i1;
            d0.d2(j, d, audioLeft, l49Var3 == null ? 1.0f : l49Var3.getAudioRight());
        }
        this.O2 = true;
        nm7.f(this.R).n(this, nm7.l2);
        nm7.f(this.R).n(this, nm7.o2);
        nm7.f(this.R).n(this, nm7.p2);
        nm7.f(this.R).n(this, nm7.m2);
        nm7.f(this.R).n(this, nm7.Y5);
        nm7.f(this.R).n(this, nm7.c4);
        nm7.f(this.R).n(this, nm7.n2);
        nm7.f(this.R).n(this, nm7.k2);
        nm7.f(this.R).n(this, nm7.s);
        nm7.f(this.R).n(this, nm7.s2);
        nm7.f(this.R).n(this, nm7.u2);
        nm7.f(this.R).n(this, nm7.e2);
        nm7.f(this.R).n(this, nm7.z0);
        nm7.f(this.R).n(this, nm7.K);
        nm7.f(this.R).n(this, nm7.n1);
        nm7.f(this.R).n(this, nm7.t2);
        nm7.f(this.R).n(this, nm7.T2);
        nm7.f(this.R).n(this, nm7.a3);
        nm7.f(this.R).n(this, nm7.j5);
        nm7.f(this.R).n(this, nm7.S3);
        nm7.e().n(this, nm7.m4);
        jz1 jz1Var = this.V0;
        if (jz1Var != null) {
            jz1Var.z();
        }
        mw1 mw1Var = this.I0;
        if (mw1Var != null) {
            gm.r(mw1Var);
            this.I0 = null;
        }
        PowerManager.WakeLock wakeLock = this.g3;
        if (wakeLock != null) {
            try {
                wakeLock.release();
                this.g3 = null;
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
        if (this.m3 && !this.d1) {
            gm.c3(new m9(this.E3, b));
        }
        ela elaVar = this.c2;
        if (elaVar != null) {
            elaVar.setDelegate(null);
        }
        hy1 hy1Var = this.r0;
        if (hy1Var != null) {
            hy1Var.e = false;
            hy1Var.dismiss();
        }
    }

    public final void d2() {
        e2(true, false);
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        by1 by1Var;
        TLRPC.ChatFull chatFull;
        TLRPC.Chat L0;
        double d;
        byte[] bArr;
        tx1 tx1Var;
        if (i == nm7.c4) {
            if (i2 == this.R) {
                i2();
                return;
            }
            return;
        }
        if (i == nm7.Y5) {
            if (i2 != this.R || objArr.length <= 0) {
                return;
            }
            long longValue = ((Long) objArr[0]).longValue();
            yv1 yv1Var = this.F3;
            if (longValue == (yv1Var != null ? yv1Var.a() : this.G3)) {
                j2();
                return;
            }
            return;
        }
        if (i == nm7.m4) {
            jz1 jz1Var = this.V0;
            if (jz1Var != null) {
                jz1Var.Q.h1();
            }
            gz1 gz1Var = this.x2;
            if (gz1Var != null) {
                ArrayList arrayList = gz1Var.n;
                while (r5 < arrayList.size()) {
                    ((mr0) arrayList.get(r5)).invalidate();
                    r5++;
                }
            }
            sy1 sy1Var = this.F0;
            if (sy1Var != null) {
                sy1Var.postInvalidate();
                this.F0.q();
                return;
            }
            return;
        }
        if (i == nm7.k2) {
            if (((Integer) objArr[0]).intValue() == this.w3) {
                if (this.m3 && !this.c4 && !c()) {
                    this.c4 = true;
                    oc7.r1(this.S.a).J4(this.d1 ? 7 : 1, 0, this.G3, getThreadMessageId(), null);
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
        if (i == nm7.s) {
            sy1 sy1Var2 = this.F0;
            if (sy1Var2 == null || !sy1Var2.isFocused()) {
                return;
            }
            gm.t1(this.F0);
            return;
        }
        int i3 = nm7.m2;
        int i4 = nm7.n2;
        int i5 = 5;
        byte b = 2;
        if (i == i3 || i == i4) {
            if (((Integer) objArr[0]).intValue() == this.w3 && this.v3) {
                this.v3 = false;
                if (i != i4) {
                    w2(2, true);
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
                    w2(i5, true);
                    return;
                }
                return;
            }
            return;
        }
        if (i == nm7.l2) {
            if (((Integer) objArr[0]).intValue() == this.w3) {
                boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                this.d1 = !booleanValue;
                zx1 zx1Var = this.c1;
                if (zx1Var != null) {
                    zx1Var.j(booleanValue ? b02.a : b02.b, true);
                }
                if (this.v3) {
                    RecordCircle recordCircle2 = this.D2;
                    if (recordCircle2 != null) {
                        recordCircle2.J = true;
                    }
                } else {
                    this.v3 = true;
                    w2(0, true);
                }
                zz1 zz1Var = this.Z0;
                if (zz1Var != null) {
                    zz1Var.a(this.Y1);
                }
                wz1 wz1Var = this.b2;
                if (wz1Var != null) {
                    wz1Var.e = false;
                    return;
                }
                return;
            }
            return;
        }
        if (i == nm7.o2) {
            this.v3 = false;
            this.R3 = null;
            this.U3 = null;
            return;
        }
        if (i == nm7.p2) {
            this.R3 = null;
            this.U3 = null;
            zz1 zz1Var2 = this.Z0;
            if (zz1Var2 != null) {
                zz1Var2.a(this.Y1);
            }
            M(true);
            this.v3 = true;
            w2(0, true);
            return;
        }
        if (i != nm7.s2) {
            if (i == nm7.u2) {
                Activity activity = this.E3;
                if (activity != null) {
                    activity.setVolumeControlStream(((Boolean) objArr[0]).booleanValue() ? 0 : TLObject.FLAG_31);
                    return;
                }
                return;
            }
            if (i == nm7.e2) {
                if (this.T3 == null || !MediaController.w().D(this.T3)) {
                    return;
                }
                k47 k47Var = MediaController.w().v0;
                k47 k47Var2 = this.T3;
                k47Var2.b0 = k47Var.b0;
                k47Var2.i0 = k47Var.i0;
                return;
            }
            if (i == nm7.z0) {
                rx1 rx1Var = this.R0;
                if (rx1Var != null) {
                    rx1Var.invalidate();
                    return;
                }
                return;
            }
            if (i == nm7.K) {
                if (((Boolean) objArr[6]).booleanValue()) {
                    return;
                }
                long longValue2 = ((Long) objArr[3]).longValue();
                Integer num2 = (Integer) objArr[1];
                if (longValue2 != this.G3 || (chatFull = this.T2) == null || chatFull.slowmode_seconds == 0 || k47.f3(num2.intValue()) || (L0 = oc7.r1(this.S.a).L0(Long.valueOf(this.T2.id))) == null || sd2.N(L0) || sd2.h0(L0)) {
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
            if (i == nm7.n1) {
                if (this.T2 != null) {
                    D2();
                    return;
                }
                return;
            }
            if (i == nm7.t2) {
                this.R3 = null;
                this.U3 = null;
                w2(4, true);
                return;
            }
            if (i != nm7.T2) {
                if (i == nm7.a3) {
                    t2(true);
                    return;
                }
                if (i != nm7.j5) {
                    if (i == nm7.S3) {
                        l0();
                        return;
                    }
                    return;
                } else {
                    if (this.t2 && (by1Var = this.K0) != null) {
                        by1Var.setLocked(!z8c.h(this.R).p());
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
                    this.x7 = 3;
                } else if (this.f3) {
                    this.x7 = 2;
                } else {
                    this.x7 = 1;
                }
                m2(false);
                return;
            }
            return;
        }
        if (((Integer) objArr[0]).intValue() == this.w3) {
            this.Y1 = 0L;
            Object obj = objArr[1];
            if (obj instanceof rcc) {
                rcc rccVar = (rcc) obj;
                this.U3 = rccVar;
                String str = (String) objArr[2];
                this.S3 = str;
                ArrayList<Bitmap> arrayList2 = (ArrayList) objArr[3];
                this.Y1 = rccVar.r;
                tec tecVar = this.g1;
                if (tecVar != null) {
                    tecVar.setVideoPath(str);
                    this.g1.setKeyframes(arrayList2);
                    this.g1.setVisibility(0);
                    this.g1.setMinProgressDiff(1000.0f / this.U3.r);
                    V0();
                }
                w2(3, true);
                M(false);
                return;
            }
            this.R3 = (TLRPC.TL_document) obj;
            this.S3 = (String) objArr[2];
            boolean z = objArr.length >= 4 && ((Boolean) objArr[3]).booleanValue();
            float floatValue = objArr.length >= 5 ? ((Float) objArr[4]).floatValue() : 0.0f;
            float floatValue2 = objArr.length >= 6 ? ((Float) objArr[5]).floatValue() : 1.0f;
            if (this.R3 == null) {
                uz1 uz1Var = this.P3;
                if (uz1Var != null) {
                    uz1Var.w(null, true, 0, 0, 0L);
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
                long e = z8c.h(this.R).e();
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
                this.T3 = new k47(z8c.t0, tL_message, false, true);
                this.f1.setAlpha(1.0f);
                this.f1.setVisibility(0);
                this.h1.setVisibility(0);
                this.h1.setAlpha(0.0f);
                this.h1.setScaleY(0.0f);
                this.h1.setScaleX(0.0f);
                int i6 = 0;
                while (true) {
                    if (i6 >= this.R3.attributes.size()) {
                        d = 0.0d;
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = this.R3.attributes.get(i6);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                        d = documentAttribute.duration;
                        break;
                    }
                    i6++;
                }
                int i7 = 0;
                while (true) {
                    if (i7 >= this.R3.attributes.size()) {
                        bArr = null;
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute2 = this.R3.attributes.get(i7);
                    if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                        bArr = documentAttribute2.waveform;
                        if (bArr == null || bArr.length == 0) {
                            bArr = MediaController.getWaveform(this.S3);
                            documentAttribute2.waveform = bArr;
                        }
                    } else {
                        i7++;
                    }
                }
                if (z && (tx1Var = this.h2) != null) {
                    this.l2 = 0.0f;
                    tx1Var.setAlpha(0.0f);
                    tx1Var.setScaleX(0.0f);
                    tx1Var.setScaleY(0.0f);
                }
                this.Y1 = (long) (1000.0d * d);
                l49 l49Var = this.i1;
                String str2 = this.S3;
                if (!l49Var.T) {
                    l49Var.r = (float) d;
                    l49Var.s = floatValue;
                    l49Var.w = floatValue2;
                    l49Var.x = false;
                    l49Var.h.t(gm.g0((int) Math.round(Math.max(1.0d, d)), false, false), false, true);
                    l49Var.f.a(false, false);
                    ndc ndcVar = l49Var.n;
                    if (ndcVar == null) {
                        ndcVar = new ndc();
                        l49Var.n = ndcVar;
                        ndcVar.K = new et8(l49Var, b);
                    }
                    ndcVar.i0(Uri.fromFile(new File(str2)), "other");
                    l49Var.i(false);
                    l49Var.L = 0;
                    l49Var.M = bArr;
                    Bitmap bitmap = l49Var.T0;
                    if (bitmap != null) {
                        bitmap.recycle();
                        l49Var.T0 = null;
                    }
                    l49Var.W0 = null;
                    l49Var.X0 = false;
                    l49Var.Q0 = -1;
                    l49Var.J0.a();
                    l49Var.I0.a();
                    l49Var.invalidate();
                }
                M(false);
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
                w2(3, !z);
                if (!z || !oc7.d1().getBoolean("design_voice_live_field", true) || this.O2 || this.R3 == null) {
                    return;
                }
                A0().t();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        l49 l49Var;
        jz1 jz1Var = this.V0;
        if (jz1Var != null && jz1Var.getVisibility() == 0 && this.V0.getStickersExpandOffset() != 0.0f) {
            canvas.save();
            canvas.clipRect(0, gm.L(2.0f), getMeasuredWidth(), getMeasuredHeight());
            canvas.translate(0.0f, -this.V0.getStickersExpandOffset());
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        super.dispatchDraw(canvas);
        if (!this.K1 || (l49Var = this.i1) == null || l49Var.getTrimProgress() <= 0.0f) {
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
        px1 px1Var = this.p2;
        boolean z = view == view2 || view == px1Var;
        if (z) {
            float measuredHeight = getMeasuredHeight() - this.n7.f;
            canvas.save();
            if (view == px1Var) {
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

    @Override // u2b
    public final void e(TLRPC.Document document, String str, Object obj, g47 g47Var, boolean z, boolean z2, int i, int i2) {
        if (this.w7) {
            return;
        }
        nv1 nv1Var = this.L3;
        yv1 yv1Var = this.F3;
        if (nv1Var != null && yv1Var != null && nv1Var.f) {
            yv1Var.uc();
            return;
        }
        if (!c() || i != 0) {
            ik.X(this.R, this.G3, 1, new lw1(this, document, str, g47Var, z2, i, i2, obj, z));
            return;
        }
        ik.J(this.E3, yv1Var.a(), new mx1(this, document, str, obj, g47Var, z), this.L4);
    }

    public final void e0() {
        if (this.z2 != null || this.F3 == null) {
            return;
        }
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.input_calendar1).mutate();
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.input_calendar2).mutate();
        int i = cmb.Ml;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        ylb ylbVar = this.L4;
        anb.x(this, mutate, i, ylbVar, mode);
        anb.x(this, mutate2, cmb.Zf, ylbVar, mode);
        sn2 sn2Var = new sn2(mutate, mutate2);
        cy1 cy1Var = new cy1(this, getContext());
        this.z2 = cy1Var;
        cy1Var.setImageDrawable(sn2Var);
        this.z2.setVisibility(8);
        this.z2.setContentDescription(jb6.M0(2131745582, null));
        this.z2.setScaleType(ImageView.ScaleType.CENTER);
        cy1 cy1Var2 = this.z2;
        int i2 = cmb.h6;
        anb.R(cy1Var2, cmb.f0(F0(i2), 1, -1), null, anb.M(i2), ylbVar);
        this.o2.addView(this.z2, 2, qoe.e(44, 44, 85));
        this.z2.setOnClickListener(new rw1(this, (byte) 5));
        this.z2.setTranslationX(0.0f);
    }

    public final void e2(boolean z, boolean z2) {
        if (this.w2 == null || this.V3 || getVisibility() != 0) {
            px1 px1Var = this.f1;
            if ((px1Var == null || px1Var.getVisibility() != 0) && !this.x3 && this.L3 == null && this.J3 == null) {
                j1();
                return;
            }
            return;
        }
        px1 px1Var2 = this.f1;
        boolean z3 = (px1Var2 == null || px1Var2.getVisibility() != 0) && !this.x3 && this.L3 == null && (this.d3 == null || this.P2 != null);
        if (!z2 && z && z3 && !this.p3 && !R0()) {
            j1();
            gx1 gx1Var = this.W;
            if (gx1Var != null) {
                gm.r(gx1Var);
            }
            gx1 gx1Var2 = new gx1(this, (byte) 12);
            this.W = gx1Var2;
            gm.d3(gx1Var2, 200L);
            return;
        }
        this.W3 = true;
        this.V3 = true;
        if (this.X3) {
            this.o7.a(true, z);
            if (z3) {
                sy1 sy1Var = this.F0;
                if (sy1Var != null) {
                    sy1Var.requestFocus();
                }
                j1();
            }
        }
    }

    public final void f0() {
        if (this.q0 != null || getContext() == null) {
            return;
        }
        m6a m6aVar = new m6a(getContext());
        ImageReceiver imageReceiver = new ImageReceiver(m6aVar);
        m6aVar.a = imageReceiver;
        m6aVar.b = new pc0((ylb) null);
        m6aVar.d = new Paint(1);
        Paint paint = new Paint(1);
        m6aVar.e = paint;
        imageReceiver.q0(gm.L(28.0f));
        paint.setStrokeWidth(gm.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        m6aVar.updateColors();
        m6aVar.setContentDescription(jb6.a0("AccDescrSendAsPeer", null, 2131754774, ""));
        this.q0 = m6aVar;
        m6aVar.setOnClickListener(new rw1(this, (byte) 1));
        this.q0.setVisibility(8);
        this.o2.addView(this.q0, qoe.d(36, 36.0f, 83, 4.66f, 4.0f, 4.66f, 4.0f));
    }

    public final void f1() {
        this.Z2 = true;
        glc glcVar = this.r1;
        if (glcVar != null) {
            glcVar.j("chat paused", true);
        }
        if (g0() && this.v3) {
            k0();
        }
        hy1 hy1Var = this.r0;
        if (hy1Var != null) {
            hy1Var.e = false;
            hy1Var.dismiss();
        }
        if (this.p3) {
            this.b3 = true;
        }
        mw1 mw1Var = new mw1(this, (byte) 22);
        this.J6 = mw1Var;
        gm.d3(mw1Var, 500L);
    }

    public final void f2() {
        AnimatorSet animatorSet = new AnimatorSet();
        try {
            performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "lockAnimatedTranslation", this.Z4);
        ofFloat.setStartDelay(100L);
        ofFloat.setDuration(350L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "snapAnimationProgress", 1.0f);
        ofFloat2.setInterpolator(d53.h);
        ofFloat2.setDuration(250L);
        boolean z = gda.a;
        SharedPreferences.Editor edit = oc7.d1().edit();
        edit.putInt("lockRecordAudioVideoHint", 3);
        edit.apply();
        animatorSet.playTogether(ofFloat2, ofFloat, ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f).setDuration(200L), ObjectAnimator.ofFloat(this.a2, "cancelToProgress", 1.0f));
        animatorSet.start();
        H2();
    }

    public final boolean g0() {
        if (this.l1) {
            return (this.U2 && this.d1) ? false : true;
        }
        return false;
    }

    public final void g1() {
        sy1 sy1Var;
        this.Z2 = false;
        if (oc7.d1().getBoolean("design_voice_live_field", true)) {
            long[] jArr = {150, 500, 1200};
            for (int i = 0; i < 3; i++) {
                gm.d3(new mw1(this, (byte) 28), jArr[i]);
            }
        }
        mw1 mw1Var = this.J6;
        if (mw1Var != null) {
            gm.r(mw1Var);
            this.J6 = null;
        }
        if (G0() && y()) {
            return;
        }
        getVisibility();
        if (!this.b3 || org.telegram.ui.ActionBar.d.hasSheets(this.F3)) {
            return;
        }
        this.b3 = false;
        uz1 uz1Var = this.P3;
        if (uz1Var != null) {
            uz1Var.W0();
        }
        if (this.H2 == 0 && (sy1Var = this.F0) != null) {
            sy1Var.requestFocus();
        }
        gm.E3(this.F0);
        if (gm.D || this.p3 || gm.E) {
            return;
        }
        this.a4 = true;
        dy1 dy1Var = this.h4;
        gm.r(dy1Var);
        gm.d3(dy1Var, 100L);
    }

    public final boolean g2() {
        yv1 yv1Var = this.F3;
        TLRPC.EncryptedChat encryptedChat = yv1Var != null ? yv1Var.h : null;
        return encryptedChat == null || gm.W0(encryptedChat.layer) >= 101;
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

    public cw1 getBotWebViewButton() {
        if (this.l0 == null) {
            Context context = getContext();
            cw1 cw1Var = new cw1(context);
            cw1Var.a = new Path();
            cw1Var.c = cmb.w0(null, cmb.Ei, false);
            cw1Var.d = true;
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setSingleLine();
            textView.setAlpha(0.0f);
            textView.setGravity(17);
            textView.setTypeface(gm.o());
            cw1Var.addView(textView, qoe.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context, null);
            radialProgressView.setSize(gm.L(18.0f));
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.0f);
            radialProgressView.setScaleY(0.0f);
            cw1Var.addView(radialProgressView, qoe.d(28, 28.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            View view = new View(context);
            cw1Var.h = view;
            int i = cmb.Gi;
            fg0 f0 = cmb.f0(cmb.w0(null, i, false), 2, -1);
            wmb M = anb.M(i);
            view.setBackground(f0);
            anb.j(view, f0, null, M, null);
            cw1Var.addView(view, qoe.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            cw1Var.setWillNotDraw(false);
            this.l0 = cw1Var;
            cw1Var.setVisibility(8);
            T();
            this.l0.setBotMenuButton(this.m0);
            this.o2.addView(this.l0, qoe.e(-1, -1, 80));
        }
        return this.l0;
    }

    public int getCursorPosition() {
        sy1 sy1Var = this.F0;
        if (sy1Var == null) {
            return 0;
        }
        return sy1Var.getSelectionStart();
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

    @Override // ddb
    public float getEditFieldBottomOffset() {
        if (this.F0 == null) {
            return 0.0f;
        }
        return ((FrameLayout.LayoutParams) r1.getLayoutParams()).bottomMargin - gm.L(1.5f);
    }

    @Override // ddb
    public Editable getEditText() {
        sy1 sy1Var = this.F0;
        if (sy1Var == null) {
            return null;
        }
        return sy1Var.getText();
    }

    public k47 getEditingMessageObject() {
        return this.P2;
    }

    public long getEffectId() {
        return this.W6;
    }

    public View getEmojiButton() {
        return this.R0;
    }

    public int getEmojiPadding() {
        return this.q3;
    }

    public e34 getEmojiView() {
        return this.V0;
    }

    public float getExitTransition() {
        return this.b5;
    }

    @Override // ddb
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
        o47 o47Var;
        m47 m47Var;
        yv1 yv1Var = this.F3;
        int size = (yv1Var == null || (o47Var = yv1Var.x5) == null || (m47Var = o47Var.b) == null) ? 0 : m47Var.g.size();
        sy1 sy1Var = this.F0;
        if (sy1Var == null || TextUtils.isEmpty(sy1Var.getText())) {
            if (this.T3 == null) {
            }
            size++;
        } else {
            String obj = this.F0.getText().toString();
            mp3 mp3Var = a6a.J;
            String trim = obj.trim();
            if (trim.length() != 0) {
                while (obj.startsWith("\n")) {
                    obj = obj.substring(1);
                }
                while (obj.endsWith("\n")) {
                    obj = ts2.m(1, 0, obj);
                }
                trim = obj;
            }
            int s1 = oc7.r1(this.S.a).s1();
            if (trim.length() != 0) {
                size += (int) Math.ceil(trim.length() / s1);
            }
            size++;
        }
        return Math.max(1, size);
    }

    public RecordCircle getRecordCircle() {
        return this.D2;
    }

    public long getRecordTimerStartTime() {
        zz1 zz1Var = this.Z0;
        if (zz1Var == null || !zz1Var.a) {
            return 0L;
        }
        return zz1Var.d;
    }

    public k47 getReplyingMessageObject() {
        return this.J3;
    }

    public int getRestingFieldHeight() {
        sy1 sy1Var = this.F0;
        if (sy1Var == null) {
            return gm.L(44.0f);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) sy1Var.getLayoutParams();
        return Math.max(gm.L(44.0f), this.F0.getLineHeight() + this.F0.getPaddingBottom() + this.F0.getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin);
    }

    public int getSelectionLength() {
        sy1 sy1Var = this.F0;
        if (sy1Var == null) {
            return 0;
        }
        try {
            return sy1Var.getSelectionEnd() - this.F0.getSelectionStart();
        } catch (Exception e) {
            fc4.g(e, true);
            return 0;
        }
    }

    public View getSendButton() {
        return getSendButtonInternal().getVisibility() == 0 ? getSendButtonInternal() : this.a1;
    }

    public View getSendButtonInternal() {
        return this.K0;
    }

    public v67 getSendMessageSuggestionParams() {
        yv1 yv1Var = this.F3;
        if (yv1Var != null) {
            return yv1Var.y5;
        }
        return null;
    }

    public long getSendMonoForumPeerId() {
        yv1 yv1Var = this.F3;
        if (yv1Var != null) {
            return yv1Var.k7();
        }
        return 0L;
    }

    public m6a getSenderSelectView() {
        return this.q0;
    }

    public ela getSizeNotifierLayout() {
        return this.c2;
    }

    public float getSlideToCancelProgress() {
        return this.Y4;
    }

    public CharSequence getSlowModeTimer() {
        if (this.H0 > 0) {
            return ((lka) this.G0.c).getText();
        }
        return null;
    }

    public long getStarsPrice() {
        yv1 yv1Var = this.F3;
        return yv1Var != null ? yv1Var.getMessagesController().L1(yv1Var.a()) : oc7.r1(this.R).L1(this.G3);
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
        tL_textWithEntities.entities = hs6.d0(z8c.t0).Y(charSequenceArr, true, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        return tL_textWithEntities;
    }

    public float getTopViewEnterProgress() {
        return this.o7.e;
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

    public p3c getTrendingStickersAlert() {
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

    /* JADX WARN: Can't wrap try/catch for region: R(14:(1:240)(1:164)|165|(8:167|(1:195)(1:171)|(1:194)(1:177)|178|(4:180|(1:182)(1:188)|183|(1:187))|(1:190)|191|(1:193))|196|(3:198|(1:200)(1:202)|201)|203|(3:(1:206)|(2:210|(1:220))|221)|222|(4:224|(1:238)(1:228)|229|(5:231|232|233|234|235))|239|232|233|234|235) */
    /* JADX WARN: Can't wrap try/catch for region: R(29:15|(1:17)|18|(1:151)(1:24)|25|(3:27|(1:31)|32)(2:105|(3:107|(1:111)|112)(1:(9:114|(1:116)(1:141)|117|(3:121|(1:123)|124)|125|(3:127|(1:133)|134)|135|(1:139)|140)(1:(20:147|(1:149)|150|34|(1:38)|39|(1:104)|42|(1:101)(1:46)|(1:100)(1:50)|(1:99)|(3:(1:58)(1:64)|59|(1:63))|(1:70)|(1:72)|73|(3:(1:76)|(2:80|(1:90))|91)|92|93|94|95))))|33|34|(2:36|38)|39|(0)|102|104|42|(1:44)|101|(1:48)|100|(2:52|54)|99|(0)|(3:66|68|70)|(0)|73|(0)|92|93|94|95) */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0337  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h1(View view) {
        yv1 yv1Var;
        int measuredHeight;
        TLRPC.User h;
        sy1 sy1Var;
        o47 o47Var;
        m47 m47Var;
        ArrayList arrayList;
        q qVar;
        boolean z;
        o47 o47Var2;
        bu5 G;
        boolean z2;
        boolean z3;
        sy1 sy1Var2;
        byte b = 0;
        if (c() || (((yv1Var = this.F3) != null && yv1Var.g4 == 5) || this.q7.f)) {
            return false;
        }
        boolean z4 = this.Z5;
        byte b2 = 16;
        by1 by1Var = this.K0;
        ylb ylbVar = this.L4;
        byte b3 = 1;
        if (z4 || !(((sy1Var = this.F0) != null && !TextUtils.isEmpty(sy1Var.getText())) || yv1Var == null || (o47Var = yv1Var.x5) == null || (m47Var = o47Var.b) == null || (arrayList = m47Var.e) == null || arrayList.isEmpty())) {
            boolean z5 = yv1Var != null && m9c.D(yv1Var.h());
            if (this.P0 == null) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(this.E3, ylbVar);
                this.P0 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
                this.P0.setOnTouchListener(new ly1(this));
                this.P0.setDispatchKeyEventListener(new dx1(this));
                this.P0.setShownFromBottom(false);
                boolean z6 = yv1Var != null && yv1Var.M4();
                boolean z8 = !z5 && (this.H0 <= 0 || c());
                if (z6) {
                    boolean z9 = !z8;
                    a8 a8Var = new a8(0, this.L4, getContext(), true, z9);
                    this.f6 = a8Var;
                    if (z5) {
                        a8Var.j(jb6.M0(2131745248, null), R.drawable.msg_calendar2, null);
                    } else {
                        a8Var.j(jb6.M0(2131745593, null), R.drawable.msg_calendar2, null);
                    }
                    this.f6.setMinimumWidth(gm.L(196.0f));
                    this.f6.setOnClickListener(new rw1(this, (byte) 15));
                    this.P0.a(this.f6, qoe.o(-1, 44));
                    boolean z10 = gda.a;
                    SharedPreferences.Editor edit = oc7.d1().edit();
                    edit.putInt("scheduledHintShows", 3);
                    edit.apply();
                    if (!z5 && this.G3 > 0) {
                        a8 a8Var2 = new a8(0, this.L4, getContext(), true, z9);
                        this.c = a8Var2;
                        a8Var2.j(jb6.M0(2131745320, null), R.drawable.msg_online, null);
                        this.c.setMinimumWidth(gm.L(196.0f));
                        this.c.setOnClickListener(new rw1(this, b2));
                        this.P0.a(this.c, qoe.o(-1, 44));
                    }
                }
                if (z8) {
                    a8 a8Var3 = new a8(0, this.L4, getContext(), !z6, true);
                    a8Var3.j(jb6.M0(2131745317, null), R.drawable.input_notify_off, null);
                    a8Var3.setMinimumWidth(gm.L(196.0f));
                    a8Var3.setOnClickListener(new rw1(this, (byte) 17));
                    this.P0.a(a8Var3, qoe.o(-1, 44));
                }
                my1 my1Var = new my1(this, this.P0);
                this.O0 = my1Var;
                my1Var.b = false;
                my1Var.setAnimationStyle(R.style.PopupContextAnimation2);
                this.O0.setOutsideTouchable(true);
                this.O0.setClippingEnabled(true);
                this.O0.setInputMethodMode(2);
                this.O0.setSoftInputMode(0);
                this.O0.getContentView().setFocusableInTouchMode(true);
                boolean z11 = gda.a;
                SharedPreferences.Editor edit2 = oc7.d1().edit();
                edit2.putInt("scheduledOrNoSoundHintShows", 3);
                edit2.apply();
                uz1 uz1Var = this.P3;
                if (uz1Var != null) {
                    uz1Var.G1();
                }
            }
            a8 a8Var4 = this.f6;
            if (a8Var4 != null) {
                a8Var4.setVisibility(this.P ? 8 : 0);
            }
            if (this.c != null) {
                h = yv1Var != null ? yv1Var.h() : null;
                if (h != null && !h.bot) {
                    TLRPC.UserStatus userStatus = h.status;
                    if (!(userStatus instanceof TLRPC.TL_userStatusEmpty) && !(userStatus instanceof TLRPC.TL_userStatusOnline) && !(userStatus instanceof TLRPC.TL_userStatusRecently) && !(userStatus instanceof TLRPC.TL_userStatusLastMonth) && !(userStatus instanceof TLRPC.TL_userStatusLastWeek)) {
                        this.c.setVisibility(0);
                    }
                }
                this.c.setVisibility(8);
            }
            this.P0.setupRadialSelectors(F0(cmb.H5));
            this.P0.measure(View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), TLObject.FLAG_31));
            this.O0.setFocusable(true);
            int[] iArr = this.D3;
            view.getLocationInWindow(iArr);
            if (this.p3) {
                int measuredHeight2 = getMeasuredHeight();
                View view2 = this.w2;
                if (measuredHeight2 > gm.L((view2 == null || view2.getVisibility() != 0) ? 58.0f : 102.0f)) {
                    measuredHeight = view.getMeasuredHeight() + iArr[1];
                    this.O0.showAtLocation(view, 51, gm.L(8.0f) + ((view.getMeasuredWidth() + iArr[0]) - this.P0.getMeasuredWidth()), measuredHeight);
                    this.O0.b();
                    by1Var.invalidate();
                    view.performHapticFeedback(3, 2);
                    return true;
                }
            }
            measuredHeight = (iArr[1] - this.P0.getMeasuredHeight()) - gm.L(2.0f);
            this.O0.showAtLocation(view, 51, gm.L(8.0f) + ((view.getMeasuredWidth() + iArr[0]) - this.P0.getMeasuredWidth()), measuredHeight);
            this.O0.b();
            by1Var.invalidate();
            view.performHapticFeedback(3, 2);
            return true;
        }
        j67 j67Var = this.M0;
        if (j67Var != null) {
            j67Var.f(false);
        }
        gm.r(this.e6);
        oy1 oy1Var = new oy1(this, getContext(), ylbVar, b);
        this.M0 = oy1Var;
        oy1Var.setOnDismissListener(new pw1(this, b3));
        boolean z12 = (this.T3 == null && ((sy1Var2 = this.F0) == null || TextUtils.isEmpty(sy1Var2.getText()))) ? false : true;
        ArrayList arrayList2 = new ArrayList();
        if (this.u2 != null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.id = 0;
            tL_message.out = true;
            tL_message.peer_id = oc7.r1(this.R).x1(this.G3);
            tL_message.from_id = oc7.r1(this.R).x1(z8c.h(this.R).e());
            tL_message.rich_message = this.u2;
            k47 k47Var = new k47(this.R, tL_message, false, true);
            k47 k47Var2 = this.J3;
            if (k47Var2 != null && !k47Var2.p) {
                k47Var.C = k47Var2;
            }
            k47Var.W2 = Boolean.TRUE;
            k47Var.n0(null);
            k47Var.w1 = true;
            k47Var.B0 = true;
            arrayList2.add(k47Var);
        } else if (this.R3 != null) {
            TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
            tL_message2.id = 0;
            tL_message2.out = true;
            tL_message2.peer_id = oc7.r1(this.R).x1(this.G3);
            tL_message2.from_id = oc7.r1(this.R).x1(z8c.h(this.R).e());
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message2.media = tL_messageMediaDocument;
            tL_messageMediaDocument.voice = true;
            tL_messageMediaDocument.document = this.R3;
            tL_message2.send_state = 1;
            tL_message2.attachPath = this.S3;
            k47 k47Var3 = new k47(this.R, tL_message2, false, true);
            k47 k47Var4 = this.J3;
            if (k47Var4 != null && !k47Var4.p) {
                k47Var3.C = k47Var4;
            }
            k47Var3.W2 = Boolean.TRUE;
            k47Var3.n0(null);
            k47Var3.w1 = true;
            k47Var3.B0 = true;
            arrayList2.add(k47Var3);
        } else if (z12) {
            TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
            tL_message3.id = 0;
            tL_message3.out = true;
            tL_message3.peer_id = oc7.r1(this.R).x1(this.G3);
            tL_message3.from_id = oc7.r1(this.R).x1(z8c.h(this.R).e());
            sy1 sy1Var3 = this.F0;
            CharSequence[] charSequenceArr = {new SpannableStringBuilder(sy1Var3 == null ? "" : sy1Var3.getTextToUse())};
            k47.d(charSequenceArr[0], true);
            tL_message3.entities.addAll(hs6.d0(this.R).Y(charSequenceArr, true, true));
            tL_message3.message = charSequenceArr[0].toString();
            k47 k47Var5 = this.J3;
            if (k47Var5 != null && !k47Var5.p) {
                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                k47 k47Var6 = this.K3;
                if (k47Var6 != null) {
                    tL_messageReplyHeader.flags |= 2;
                    tL_messageReplyHeader.reply_to_top_id = k47Var6.e1();
                }
                tL_messageReplyHeader.flags |= 16;
                tL_messageReplyHeader.reply_to_msg_id = this.J3.e1();
                tL_message3.reply_to = tL_messageReplyHeader;
            }
            if (this.N3 != null) {
                TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                tL_messageMediaWebPage.webpage = this.N3;
                if (yv1Var != null && (o47Var2 = yv1Var.x5) != null && o47Var2.o) {
                    boolean z13 = o47Var2.q;
                    tL_messageMediaWebPage.force_small_media = z13;
                    tL_messageMediaWebPage.force_large_media = !z13;
                    tL_message3.invert_media = o47Var2.r;
                }
                tL_message3.media = tL_messageMediaWebPage;
            }
            k47 k47Var7 = new k47(this.R, tL_message3, false, false);
            k47 k47Var8 = this.J3;
            if (k47Var8 != null && !k47Var8.p) {
                k47Var7.C = k47Var8;
            }
            k47Var7.B0 = true;
            k47Var7.W2 = Boolean.TRUE;
            k47Var7.D = 0;
            k47Var7.n0(null);
            k47Var7.w1 = true;
            arrayList2.add(k47Var7);
        } else if (yv1Var != null && (qVar = yv1Var.q3) != null && qVar.getTextureView() != null) {
            j67 j67Var2 = this.M0;
            TextureView textureView = yv1Var.q3.getTextureView();
            j67Var2.getClass();
            if (textureView != null) {
                j67Var2.l0 = new RectF();
                int[] iArr2 = new int[2];
                textureView.getLocationOnScreen(iArr2);
                j67Var2.l0.set(iArr2[0], iArr2[1], textureView.getWidth() + r10, textureView.getHeight() + iArr2[1]);
            }
            z = true;
            this.M0.r(arrayList2);
            if (z12 && this.R3 == null) {
                j67 j67Var3 = this.M0;
                sy1 sy1Var4 = this.F0;
                f fVar = new f(this, (byte) 26);
                ix1 ix1Var = new ix1(this, b);
                j67Var3.S = sy1Var4;
                j67Var3.U = fVar;
                j67Var3.V = ix1Var;
            }
            this.M0.s(by1Var, true, new v6(b3, this, z12));
            if ((!z12 || z) && this.G3 >= 0) {
                this.M0.a(yv1Var);
                this.M0.p(this.W6);
            }
            G = bu5.G(this, ylbVar, by1Var);
            z2 = yv1Var == null && m9c.D(yv1Var.h());
            z3 = yv1Var == null && yv1Var.M4();
            if (!z2 || (this.H0 > 0 && !c())) {
                b3 = 0;
            }
            if (z3) {
                G.b(R.drawable.msg_calendar2, jb6.M0(z2 ? 2131745248 : 2131745593, null), new gx1(this, (byte) 6), false);
                if (!z2 && this.G3 > 0) {
                    G.b(R.drawable.msg_online, jb6.M0(2131745320, null), new gx1(this, (byte) 7), false);
                    this.c = G.z();
                }
            }
            if (yv1Var != null && this.P3 != null && sd2.p0(yv1Var.e)) {
                G.b(R.drawable.input_suggest_paid_24, jb6.M0(2131746804, null), new gx1(this, (byte) 5), false);
            }
            if (b3 != 0) {
                G.b(R.drawable.input_notify_off, jb6.M0(2131745317, null), new cx1(this, z12, (byte) 2), false);
            }
            G.Z();
            if (this.c != null) {
                h = yv1Var != null ? yv1Var.h() : null;
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
        z = false;
        this.M0.r(arrayList2);
        if (z12) {
            j67 j67Var32 = this.M0;
            sy1 sy1Var42 = this.F0;
            f fVar2 = new f(this, (byte) 26);
            ix1 ix1Var2 = new ix1(this, b);
            j67Var32.S = sy1Var42;
            j67Var32.U = fVar2;
            j67Var32.V = ix1Var2;
        }
        this.M0.s(by1Var, true, new v6(b3, this, z12));
        if (!z12) {
        }
        this.M0.a(yv1Var);
        this.M0.p(this.W6);
        G = bu5.G(this, ylbVar, by1Var);
        if (yv1Var == null) {
        }
        if (yv1Var == null) {
        }
        if (!z2) {
        }
        b3 = 0;
        if (z3) {
        }
        if (yv1Var != null) {
            G.b(R.drawable.input_suggest_paid_24, jb6.M0(2131746804, null), new gx1(this, (byte) 5), false);
        }
        if (b3 != 0) {
        }
        G.Z();
        if (this.c != null) {
        }
        this.M0.q(G);
        this.M0.show();
        view.performHapticFeedback(3, 2);
        return false;
    }

    public final void h2() {
        if (this.F0 != null) {
            int L = gm.L(1.5f + ((!O0() || this.Q6) ? 0 : 38));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.F0.getLayoutParams();
            if (layoutParams.bottomMargin != L) {
                layoutParams.bottomMargin = L;
                this.F0.setLayoutParams(layoutParams);
            }
            mi9 mi9Var = this.s2;
            if (mi9Var != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) mi9Var.getLayoutParams();
                if (layoutParams2.bottomMargin != L) {
                    layoutParams2.bottomMargin = L;
                    this.s2.setLayoutParams(layoutParams2);
                }
            }
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
        int height = this.c2.getHeight();
        if (!this.p3) {
            height -= this.q3;
        }
        uz1 uz1Var = this.P3;
        if (uz1Var != null) {
            uz1Var.v1(height);
        }
        if (this.w2 != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + gm.L(72.0f);
            boolean z = this.X3;
            fn0 fn0Var = this.o7;
            if (height < currentActionBarHeight) {
                if (z) {
                    this.X3 = false;
                    if (this.W3) {
                        fn0Var.a(false, false);
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
                fn0Var.a(true, false);
            }
        }
    }

    public final void i2() {
        px1 px1Var;
        TL_agent.settings settingsVar;
        if (this.F0 == null || (px1Var = this.o2) == null) {
            return;
        }
        mc c = mc.c(this.R);
        long j = this.G3;
        if (j > 0 && c.f(j) && !c.e) {
            c.h();
        }
        int i = this.R;
        long j2 = this.G3;
        int i2 = tc.h;
        mc c2 = mc.c(i);
        boolean z = j2 > 0 && c2.f(j2) && (settingsVar = c2.d) != null && !TextUtils.isEmpty(settingsVar.active_provider);
        if (z && this.K6 == null) {
            tc tcVar = new tc(getContext(), this.R, this.F3, this.L4);
            this.K6 = tcVar;
            tcVar.setVisibility(8);
            px1Var.addView(this.K6, qoe.d(-1, 44.0f, 83, 52.0f, 0.0f, 0.0f, 0.0f));
        }
        tc tcVar2 = this.K6;
        if (tcVar2 != null) {
            if ((tcVar2.getVisibility() == 0) != z) {
                this.K6.setVisibility(z ? 0 : 8);
                cc ccVar = this.P6;
                if (z) {
                    V1(false);
                    b2(false);
                    getViewTreeObserver().addOnPreDrawListener(ccVar);
                } else {
                    getViewTreeObserver().removeOnPreDrawListener(ccVar);
                }
                s2(this.T6);
                requestLayout();
            }
        }
        h2();
    }

    public final void j(TLRPC.Document document) {
        hs6.d0(this.R).c(document, (int) (System.currentTimeMillis() / 1000), true);
        jz1 jz1Var = this.V0;
        if (jz1Var == null || document == null) {
            return;
        }
        boolean isEmpty = jz1Var.j1.isEmpty();
        jz1Var.X();
        if (isEmpty) {
            jz1Var.Y(false);
        }
    }

    public final void j0() {
        RecordCircle recordCircle;
        if (this.v3 || ((recordCircle = this.D2) != null && ChatActivityEnterView.this.h5)) {
            this.v3 = false;
            this.Y1 = 0L;
            this.D1 = true;
            try {
                w2(2, true);
                this.D1 = false;
                gm.d3(new gx1(this, (byte) 11), 120L);
            } catch (Throwable th) {
                this.D1 = false;
                throw th;
            }
        }
    }

    public void j1() {
        if ((G0() && y()) || org.telegram.ui.ActionBar.d.hasSheets(this.F3)) {
            return;
        }
        uz1 uz1Var = this.P3;
        if (uz1Var != null) {
            uz1Var.W0();
        }
        sy1 sy1Var = this.F0;
        if (sy1Var == null || gm.E3(sy1Var)) {
            return;
        }
        this.F0.clearFocus();
        this.F0.requestFocus();
    }

    public final void j2() {
        by1 by1Var = this.K0;
        if (by1Var != null) {
            int i = this.R;
            yv1 yv1Var = this.F3;
            boolean z = fd.b(i, yv1Var != null ? yv1Var.a() : this.G3) != null;
            dd ddVar = this.m6;
            if (ddVar == null) {
                if (!z) {
                    return;
                }
                ddVar = new dd(by1Var);
                this.m6 = ddVar;
                by1Var.h0 = ddVar;
                by1Var.i0 = this;
            }
            if (ddVar.b != z) {
                ddVar.b = z;
                ddVar.a.invalidate();
            }
            if (z) {
                y0();
            }
        }
    }

    public final void k(TLRPC.Document document) {
        X();
        jz1 jz1Var = this.V0;
        int i = jz1Var.d1;
        hs6.d0(i).d(0, null, document, (int) (System.currentTimeMillis() / 1000), false);
        boolean isEmpty = jz1Var.k1.isEmpty();
        jz1Var.k1 = hs6.d0(i).j0(0, true);
        w24 w24Var = jz1Var.z0;
        if (w24Var != null) {
            w24Var.f();
        }
        if (isEmpty) {
            jz1Var.Y(false);
        }
    }

    public final void k0() {
        m0(false, false);
        un3 un3Var = this.j1;
        if (un3Var != null && un3Var.o0 && un3Var.r == 1) {
            un3Var.u();
        }
        sy1 sy1Var = this.F0;
        if (sy1Var != null && sy1Var.length() > 0) {
            ox1 ox1Var = this.O4;
            ox1Var.getClass();
            ChatActivityEnterView chatActivityEnterView = ox1Var.b;
            chatActivityEnterView.h = 1.0f;
            chatActivityEnterView.q2();
            float f = this.B0 ? 0.5f : 1.0f;
            ox1 ox1Var2 = this.Q4;
            ox1Var2.getClass();
            ChatActivityEnterView chatActivityEnterView2 = ox1Var2.b;
            chatActivityEnterView2.n = f;
            chatActivityEnterView2.q2();
        }
        j0();
        rx1 rx1Var = this.R0;
        if (rx1Var != null) {
            rx1Var.invalidate();
        }
    }

    public final void k1() {
        if (G0() && y()) {
            return;
        }
        yv1 yv1Var = this.F3;
        if (org.telegram.ui.ActionBar.d.hasSheets(yv1Var)) {
            return;
        }
        Z1((gm.D || gm.E || (yv1Var != null && yv1Var.isInBubbleMode()) || this.Z2) ? 0 : 2, 0, true, true);
        uz1 uz1Var = this.P3;
        if (uz1Var != null) {
            uz1Var.W0();
        }
        sy1 sy1Var = this.F0;
        if (sy1Var != null) {
            sy1Var.requestFocus();
        }
        gm.E3(this.F0);
        if (this.Z2) {
            this.b3 = true;
            return;
        }
        if (gm.D || this.p3 || gm.E) {
            return;
        }
        if (yv1Var == null || !yv1Var.isInBubbleMode()) {
            this.a4 = true;
            jz1 jz1Var = this.V0;
            if (jz1Var != null) {
                jz1Var.onTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0));
            }
            dy1 dy1Var = this.h4;
            gm.r(dy1Var);
            gm.d3(dy1Var, 100L);
        }
    }

    public final void k2() {
        float f;
        tx1 tx1Var = this.h2;
        if (tx1Var == null) {
            return;
        }
        float f2 = this.E + this.y;
        by1 by1Var = this.K0;
        if (by1Var != null) {
            f = by1Var.getAlpha() * (-b10.c(56.0f, by1Var.l(), 0));
        } else {
            f = 0.0f;
        }
        tx1Var.setTranslationX(f2 + f);
    }

    public final void l(boolean z) {
        yv1 yv1Var;
        if (this.o6 >= 0) {
            ConnectionsManager.getInstance(this.R).cancelRequest(this.o6, true);
            this.o6 = -1;
        }
        dy1 dy1Var = this.r6;
        if (dy1Var != null) {
            gm.r(dy1Var);
            this.r6 = null;
        }
        this.p6 = false;
        dd ddVar = this.m6;
        if (ddVar != null) {
            ddVar.c(false);
        }
        m();
        if (!z || (yv1Var = this.F3) == null) {
            return;
        }
        c41.b0(yv1Var).Q(R.raw.error, 36, "Couldn't rewrite the message. It wasn't sent.").j();
    }

    public final void l0() {
        if (!this.k1 || this.O2 || this.v3) {
            return;
        }
        un3 un3Var = this.j1;
        if (un3Var == null || !un3Var.o()) {
            if ((this.A0 && !this.w7 && zfe.a(getContext())) != this.l1) {
                this.q1.run();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l1() {
        yv1 yv1Var;
        Editable editable;
        jf9 jf9Var;
        CharSequence[] charSequenceArr;
        ArrayList Y;
        if (this.F0 == null || (yv1Var = this.F3) == null) {
            return;
        }
        oc7.r1(this.R);
        boolean z = e21.a;
        TL_iv.RichMessage richMessage = this.u2;
        if (richMessage != null) {
            jf9Var = new jf9(richMessage);
        } else {
            Editable text = this.F0.getText();
            if (!TextUtils.isEmpty(text) && TextUtils.indexOf((CharSequence) text, '`') >= 0) {
                try {
                    charSequenceArr = new CharSequence[]{new SpannableStringBuilder(text)};
                    Y = hs6.d0(this.R).Y(charSequenceArr, true, true);
                } catch (Exception e) {
                    fc4.g(e, true);
                }
                if (Y != null && !Y.isEmpty()) {
                    editable = new SpannableStringBuilder(charSequenceArr[0]);
                    k47.b(editable, Y, false, false, false, false, 0);
                    jf9 jf9Var2 = new jf9(editable);
                    if (editable == text) {
                        int selectionStart = this.F0.getSelectionStart();
                        int selectionEnd = this.F0.getSelectionEnd();
                        if (selectionStart < 0) {
                            selectionStart = this.F0.length();
                        }
                        if (selectionEnd < 0) {
                            selectionEnd = selectionStart;
                        }
                        jf9Var2.c = selectionStart;
                        jf9Var2.d = selectionEnd;
                    }
                    jf9Var2.M = new gx1(this, (byte) 3);
                    jf9Var = jf9Var2;
                }
            }
            editable = text;
            jf9 jf9Var22 = new jf9(editable);
            if (editable == text) {
            }
            jf9Var22.M = new gx1(this, (byte) 3);
            jf9Var = jf9Var22;
        }
        jf9Var.setResourceProvider(this.L4);
        jf9Var.K = yv1Var;
        jf9Var.s = yv1Var.U;
        jf9Var.w = yv1Var.a0;
        jf9Var.L = new gx1(this, (byte) 4);
        yv1Var.presentFragment(jf9Var);
    }

    public final void l2() {
        k2();
        qmb qmbVar = this.f2;
        if (qmbVar != null) {
            qmbVar.setTranslationX(this.E + this.y);
            qmbVar.setAlpha(this.F * this.G);
            qmbVar.setVisibility(qmbVar.getAlpha() > 0.0f ? 0 : 8);
            tx1 tx1Var = this.h2;
            if (tx1Var != null && this.Z5) {
                tx1Var.setAlpha(this.l2 * this.G);
            }
        }
        cy1 cy1Var = this.z2;
        if (cy1Var != null) {
            cy1Var.setTranslationX(cy1Var.a);
        }
    }

    public final void m() {
        dd ddVar = this.m6;
        if (ddVar != null && ddVar.d) {
            ddVar.d = false;
            ddVar.a.invalidate();
        }
        if (this.w6) {
            this.w6 = false;
            this.F1 = false;
            sy1 sy1Var = this.F0;
            if (sy1Var != null) {
                sy1Var.invalidate();
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
            ofFloat.addUpdateListener(new bx1(this, (byte) 8));
            this.B6.setDuration(220L);
            this.B6.setInterpolator(d53.g);
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

    public final void m1(CharSequence charSequence, CharSequence charSequence2, String str) {
        yv1 yv1Var;
        if (this.F0 == null || (yv1Var = this.F3) == null) {
            return;
        }
        oc7.r1(this.R);
        boolean z = e21.a;
        jf9 jf9Var = new jf9(str);
        jf9Var.h = charSequence;
        jf9Var.n = charSequence2;
        jf9Var.setResourceProvider(this.L4);
        jf9Var.K = yv1Var;
        jf9Var.s = yv1Var.U;
        jf9Var.w = yv1Var.a0;
        jf9Var.M = new mw1(this, (byte) 6);
        jf9Var.L = new mw1(this, (byte) 7);
        yv1Var.presentFragment(jf9Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b2, code lost:
    
        if (android.text.TextUtils.isEmpty(r15 == null ? "" : gm.m1(r15.getTextToUse())) == false) goto L119;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2(boolean z) {
        tx1 tx1Var;
        if (this.M4) {
            yv1 yv1Var = this.F3;
            if (yv1Var != null && !yv1Var.f6) {
                z = false;
            }
            boolean G0 = G0();
            byte b = 1;
            boolean z2 = this.x7 != 1 && this.G3 > 0;
            tx1 tx1Var2 = this.n2;
            boolean z3 = tx1Var2 != null && tx1Var2.getVisibility() == 0;
            if (!G0 && !this.f3 && this.d3 == null) {
                tx1 tx1Var3 = this.n2;
                if (tx1Var3 != null) {
                    tx1Var3.setVisibility(8);
                }
            } else if (this.d3 != null) {
                if (R0() && this.V2 == 1 && this.d3.is_persistent) {
                    tx1 tx1Var4 = this.n2;
                    if (tx1Var4 != null && tx1Var4.getVisibility() != 8) {
                        this.n2.setVisibility(8);
                    }
                } else {
                    S();
                    if (this.n2.getVisibility() != 0) {
                        this.n2.setVisibility(0);
                    }
                    this.K2.a(R.drawable.input_bot2, true);
                    this.n2.setContentDescription(jb6.M0(2131754918, "AccDescrBotKeyboard"));
                }
            } else if (z2) {
                tx1 tx1Var5 = this.n2;
                if (tx1Var5 != null) {
                    tx1Var5.setVisibility(8);
                }
            } else {
                S();
                this.K2.a(R.drawable.input_bot1, true);
                this.n2.setContentDescription(jb6.M0(2131754919, "AccDescrBotCommands"));
                this.n2.setVisibility(0);
            }
            if (z2) {
                T();
            }
            tx1 tx1Var6 = this.n2;
            boolean z4 = (tx1Var6 != null && tx1Var6.getVisibility() == 0) != z3;
            eq0 eq0Var = this.m0;
            byte b2 = 2;
            if (eq0Var != null) {
                boolean z5 = eq0Var.x;
                eq0Var.setWebView(this.x7 == 3);
                eq0 eq0Var2 = this.m0;
                String M0 = this.x7 == 2 ? jb6.M0(2131752844, null) : this.j0;
                if (M0 == null) {
                    eq0Var2.getClass();
                    M0 = jb6.M0(2131752844, null);
                }
                String str = eq0Var2.n;
                boolean z6 = str == null || !str.equals(M0);
                eq0Var2.n = M0;
                eq0Var2.r = null;
                eq0Var2.requestLayout();
                gm.T3(this.m0, z2, 0.5f, true, z);
                z4 = z4 || z6 || z5 != this.m0.x;
            }
            if (z4 && z) {
                rx1 rx1Var = this.R0;
                Float valueOf = Float.valueOf(rx1Var.getX());
                HashMap hashMap = this.C0;
                hashMap.put(rx1Var, valueOf);
                sy1 sy1Var = this.F0;
                if (sy1Var != null) {
                    hashMap.put(sy1Var, Float.valueOf(sy1Var.getX()));
                }
                tx1 tx1Var7 = this.n2;
                boolean z8 = tx1Var7 != null && tx1Var7.getVisibility() == 0;
                if (z8 != z3 && (tx1Var = this.n2) != null) {
                    tx1Var.setVisibility(0);
                    if (z8) {
                        this.n2.setAlpha(0.0f);
                        this.n2.setScaleX(0.1f);
                        this.n2.setScaleY(0.1f);
                    } else if (!z8) {
                        this.n2.setAlpha(1.0f);
                        this.n2.setScaleX(1.0f);
                        this.n2.setScaleY(1.0f);
                    }
                    gm.S3(this.n2, z8, 0.1f, true, 1.0f, true, new bx1(this, b));
                }
            }
            tx1 tx1Var8 = this.n2;
            if (tx1Var8 != null && tx1Var8.getVisibility() == 0) {
                sy1 sy1Var2 = this.F0;
            }
            b2 = this.T6;
            s2(b2);
        }
    }

    public final ValueAnimator n(float f) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.z2.a, f);
        ofFloat.addUpdateListener(new bx1(this, (byte) 5));
        return ofFloat;
    }

    public final boolean n0() {
        un3 un3Var;
        sy1 sy1Var;
        if (this.D6) {
            return true;
        }
        if (!this.l1 || (un3Var = this.j1) == null || !un3Var.p() || this.v3) {
            return false;
        }
        return (!this.j1.q() || this.j1.r == 2) && (sy1Var = this.F0) != null && sy1Var.length() > 0;
    }

    public final void n1() {
        mw1 mw1Var = new mw1(this, (byte) 2);
        if (ewe.b(this.R, this.G3) || oc7.r1(this.R).S3.contains(Long.valueOf(this.G3))) {
            mw1Var.run();
            return;
        }
        ik.n(this.F3, oc7.r1(this.R).W1(Long.valueOf(this.G3)), new uj1(this, mw1Var, (byte) 25), new mw1(this, (byte) 3));
    }

    public final void n2() {
        int c;
        u46 u46Var;
        int K0;
        View m;
        py1 py1Var = this.n0;
        if (py1Var != null) {
            int childCount = py1Var.c.getChildCount();
            int i = 0;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.n0.c.getChildAt(i2);
                if (i2 < 4) {
                    i += childAt.getMeasuredHeight();
                }
            }
            ela elaVar = this.c2;
            if (i > 0) {
                c = b10.c(childCount > 4 ? 12.0f : 0.0f, (elaVar.getMeasuredHeight() - i) - gm.L(8.0f), 0);
            } else {
                c = this.o0.c.size() > 4 ? b10.c(162.8f, elaVar.getMeasuredHeight(), 0) : b10.c((Math.max(1, Math.min(4, this.o0.c.size())) * 36) + 8, elaVar.getMeasuredHeight(), 0);
            }
            if (this.n0.c.getPaddingTop() != c) {
                this.n0.c.setTopGlowOffset(c);
                if (this.d7 == -1 && this.n0.getVisibility() == 0 && this.n0.c.getLayoutManager() != null && (K0 = (u46Var = (u46) this.n0.c.getLayoutManager()).K0()) >= 0 && (m = u46Var.m(K0)) != null) {
                    this.d7 = K0;
                    this.e7 = m.getTop() - this.n0.c.getPaddingTop();
                }
                this.n0.c.setPadding(0, c, 0, gm.L(8.0f));
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
        if (z && alpha < 0.25f && (getSendButtonInternal() instanceof xz1) && SystemClock.uptimeMillis() > this.I1) {
            xz1 xz1Var = (xz1) getSendButtonInternal();
            xz1Var.p0.e(true, 0.0f);
            xz1Var.invalidate();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: fx1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i = ChatActivityEnterView.z7;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                chatActivityEnterView.getSendButtonInternal().setAlpha(gm.R1(alpha, f, floatValue));
                chatActivityEnterView.getSendButtonInternal().setScaleX(gm.R1(scaleX, f2, floatValue));
                chatActivityEnterView.getSendButtonInternal().setScaleY(gm.R1(scaleY, f3, floatValue));
            }
        });
        return ofFloat;
    }

    public final boolean o0() {
        un3 un3Var;
        return this.l1 && (un3Var = this.j1) != null && un3Var.p();
    }

    public final boolean o1() {
        return this.W0 != null;
    }

    public final void o2(boolean z) {
        if (this.x7 != 1 && this.G3 > 0) {
            T();
        }
        eq0 eq0Var = this.m0;
        if (eq0Var != null) {
            eq0Var.setWebView(G0());
        }
        m2(z);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        hy1 hy1Var = this.r0;
        if (hy1Var != null) {
            hy1Var.e = false;
            hy1Var.dismiss();
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
        if (motionEvent.getAction() == 0 && (X = gm.X(this, motionEvent.getX(), motionEvent.getY())) != this.M && X != this.N) {
            I0();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        py1 py1Var;
        super.onLayout(z, i, i2, i3, i4);
        if (this.d7 == -1 || (py1Var = this.n0) == null) {
            return;
        }
        u46 u46Var = (u46) py1Var.c.getLayoutManager();
        if (u46Var != null) {
            u46Var.g1(this.d7, this.e7);
        }
        this.d7 = -1;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        px1 px1Var = this.p2;
        int measuredHeight = px1Var.getMeasuredHeight();
        eq0 eq0Var = this.m0;
        ImageView imageView = this.S0;
        rx1 rx1Var = this.R0;
        int i3 = 0;
        if (eq0Var == null || eq0Var.getTag() == null) {
            m6a m6aVar = this.q0;
            if (m6aVar == null || m6aVar.getVisibility() != 0) {
                ((ViewGroup.MarginLayoutParams) rx1Var.getLayoutParams()).leftMargin = gm.L(3.0f);
                if (imageView != null) {
                    ((ViewGroup.MarginLayoutParams) imageView.getLayoutParams()).leftMargin = gm.L(3.0f);
                }
                sy1 sy1Var = this.F0;
                if (sy1Var != null) {
                    ((ViewGroup.MarginLayoutParams) sy1Var.getLayoutParams()).leftMargin = gm.L(50.0f);
                }
                mi9 mi9Var = this.s2;
                if (mi9Var != null) {
                    ((ViewGroup.MarginLayoutParams) mi9Var.getLayoutParams()).leftMargin = gm.L(50.0f);
                }
            } else {
                int i4 = this.q0.getLayoutParams().width;
                this.q0.measure(View.MeasureSpec.makeMeasureSpec(i4, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.q0.getLayoutParams().height, TLObject.FLAG_30));
                ((ViewGroup.MarginLayoutParams) rx1Var.getLayoutParams()).leftMargin = gm.L(7.0f) + i4;
                if (imageView != null) {
                    ((ViewGroup.MarginLayoutParams) imageView.getLayoutParams()).leftMargin = gm.L(7.0f) + i4;
                }
                sy1 sy1Var2 = this.F0;
                if (sy1Var2 != null) {
                    ((ViewGroup.MarginLayoutParams) sy1Var2.getLayoutParams()).leftMargin = gm.L(54.0f) + i4;
                }
                mi9 mi9Var2 = this.s2;
                if (mi9Var2 != null) {
                    ((ViewGroup.MarginLayoutParams) mi9Var2.getLayoutParams()).leftMargin = gm.L(54.0f) + i4;
                }
            }
        } else {
            this.m0.measure(i, i2);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) rx1Var.getLayoutParams();
            int L = gm.L(10.0f);
            eq0 eq0Var2 = this.m0;
            marginLayoutParams.leftMargin = L + (eq0Var2 == null ? 0 : eq0Var2.getMeasuredWidth());
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int L2 = gm.L(10.0f);
                eq0 eq0Var3 = this.m0;
                marginLayoutParams2.leftMargin = L2 + (eq0Var3 == null ? 0 : eq0Var3.getMeasuredWidth());
            }
            sy1 sy1Var3 = this.F0;
            if (sy1Var3 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) sy1Var3.getLayoutParams();
                int L3 = gm.L(57.0f);
                eq0 eq0Var4 = this.m0;
                marginLayoutParams3.leftMargin = L3 + (eq0Var4 == null ? 0 : eq0Var4.getMeasuredWidth());
            }
            mi9 mi9Var3 = this.s2;
            if (mi9Var3 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) mi9Var3.getLayoutParams();
                int L4 = gm.L(57.0f);
                eq0 eq0Var5 = this.m0;
                marginLayoutParams4.leftMargin = L4 + (eq0Var5 == null ? 0 : eq0Var5.getMeasuredWidth());
            }
        }
        if (O0() && !this.Q6) {
            ((ViewGroup.MarginLayoutParams) this.K6.getLayoutParams()).leftMargin = gm.L(48.0f) + ((ViewGroup.MarginLayoutParams) rx1Var.getLayoutParams()).leftMargin;
            sy1 sy1Var4 = this.F0;
            if (sy1Var4 != null) {
                ((ViewGroup.MarginLayoutParams) sy1Var4.getLayoutParams()).leftMargin = gm.L(14.0f);
            }
            mi9 mi9Var4 = this.s2;
            if (mi9Var4 != null) {
                ((ViewGroup.MarginLayoutParams) mi9Var4.getLayoutParams()).leftMargin = gm.L(6.0f);
            }
        }
        n2();
        super.onMeasure(i, i2);
        cw1 cw1Var = this.l0;
        if (cw1Var != null) {
            eq0 eq0Var6 = this.m0;
            if (eq0Var6 != null) {
                cw1Var.setMeasuredButtonWidth(eq0Var6.getMeasuredWidth());
            }
            this.l0.getLayoutParams().height = getMeasuredHeight() - gm.L(2.0f);
            measureChild(this.l0, i, i2);
        }
        O();
        P();
        if (measuredHeight <= 0 || px1Var.getMeasuredHeight() == measuredHeight) {
            return;
        }
        while (i3 < 2) {
            ImageView imageView2 = i3 == 0 ? this.j2 : this.k2;
            imageView2.setTranslationY((imageView2.getTranslationY() + px1Var.getMeasuredHeight()) - measuredHeight);
            imageView2.animate().translationY(0.0f).setInterpolator(d53.h).setDuration(420L).start();
            i3++;
        }
        hg5 hg5Var = this.N;
        if (hg5Var != null) {
            hg5Var.setTranslationY((hg5Var.getTranslationY() + px1Var.getMeasuredHeight()) - measuredHeight);
            wi8.t(this.N.animate().translationY(0.0f), d53.h, 420L);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 && this.p4) {
            R1(0, false);
            this.V0.r(false);
            S1(false, false, false, true);
        }
        tec tecVar = this.g1;
        if (tecVar != null) {
            ArrayList arrayList = tecVar.w;
            if (tecVar.O.isEmpty()) {
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    Bitmap bitmap = (Bitmap) arrayList.get(i5);
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                }
            }
            arrayList.clear();
            qec qecVar = tecVar.x;
            if (qecVar != null) {
                qecVar.cancel(true);
                tecVar.x = null;
            }
            tecVar.invalidate();
        }
    }

    public final void p() {
        float min;
        s09 s09Var = this.h1;
        if (s09Var == null || s09Var.getAnimatedDrawable() != this.z5) {
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
            float L = gm.L(12.0f);
            this.h1.setPivotX(r5.getWidth() / 2.0f);
            this.h1.setPivotY((r5.getHeight() / 2.0f) + L);
            this.h1.setRotation(f4);
            if (this.i1 != null) {
                double radians = Math.toRadians(f4);
                float L2 = L + gm.L(3.0f);
                l49 l49Var = this.i1;
                float sin = ((float) Math.sin(radians)) * L2;
                float cos = (1.0f - ((float) Math.cos(radians))) * L2;
                lta ltaVar = l49Var.J0;
                ltaVar.R = sin;
                ltaVar.S = cos;
                l49Var.invalidate();
            }
        }
    }

    public final void p0() {
        float f;
        va2 C0;
        if (this.E2 != null) {
            if (g0() && this.v3) {
                RectF rectF = this.H4;
                if (!rectF.isEmpty() && this.E2.getHeight() > 0 && (C0 = C0()) != null) {
                    this.E2.getLocationInWindow(this.u7);
                    C0.getLocationInWindow(this.v7);
                    f = Math.min(0.0f, (((C0.getInputBubbleTop() + r3[1]) - gm.L(8.0f)) - gm.L(18.0f)) - (rectF.centerY() + (((r4[1] - this.E2.getTranslationY()) + this.R5) + this.S5)));
                    if (Math.abs(f - this.t7) < 0.5f || (f == 0.0f && this.t7 != 0.0f)) {
                        this.t7 = f;
                        this.E2.setTranslationY(this.R5 + this.S5 + f);
                    }
                    return;
                }
            }
            f = 0.0f;
            if (Math.abs(f - this.t7) < 0.5f) {
            }
            this.t7 = f;
            this.E2.setTranslationY(this.R5 + this.S5 + f);
        }
    }

    public boolean p1() {
        return true;
    }

    public final void p2() {
        sy1 sy1Var = this.F0;
        boolean z = false;
        V1((sy1Var == null || sy1Var.getLineCount() <= 2 || this.F0.getText() == null || TextUtils.isEmpty(this.F0.getText().toString().trim())) ? false : true);
        sy1 sy1Var2 = this.F0;
        if (sy1Var2 != null && sy1Var2.getLineCount() > 2 && this.F0.getText() != null && !TextUtils.isEmpty(this.F0.getText().toString().trim())) {
            z = true;
        }
        b2(z);
    }

    public final boolean q0() {
        if (!r0() || this.l1) {
            return false;
        }
        return (yze.a() && oc7.d1().getBoolean("design_voice_live_field", true)) ? false : true;
    }

    public final void q1(int i, int i2, CharSequence charSequence, boolean z) {
        if (this.F0 == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.F0.getText());
            spannableStringBuilder.replace(i, i2 + i, charSequence);
            if (z) {
                gw3.m(spannableStringBuilder, this.F0.getPaint().getFontMetricsInt(), false, null, 0);
            }
            this.F0.setText(spannableStringBuilder);
            this.F0.setSelection(i + charSequence.length());
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void q2() {
        float f = (1.0f - this.A1) * this.y1;
        float R1 = f > 0.0f ? gm.R1(1.0f, 0.6f, f) : 1.0f;
        float f2 = this.r * this.h * R1;
        rx1 rx1Var = this.R0;
        rx1Var.setScaleX(f2);
        rx1Var.setScaleY(this.r * this.h * R1);
        rx1Var.setAlpha((1.0f - f) * this.s * this.n);
    }

    public final void r(boolean z) {
        p09 p09Var;
        byte b = 1;
        boolean z2 = (this.d1 || this.i1 == null) ? false : true;
        this.Q5 = z2;
        boolean z3 = this.K1;
        jd jdVar = this.X1;
        if (z3 == z2) {
            if (!z2) {
                return;
            }
            if (this.T1 != null) {
                U1(false, false);
                N1(z);
                gm.r(jdVar);
                gm.d3(jdVar, 700L);
                return;
            }
        }
        this.K1 = z2;
        this.i1.setNewStyle(z2);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.i1.getLayoutParams();
        layoutParams.height = gm.L(32.0f);
        layoutParams.gravity = z2 ? 83 : 19;
        layoutParams.bottomMargin = z2 ? gm.L(6.0f) : 0;
        layoutParams.leftMargin = gm.L(z2 ? 45.0f : 44.0f);
        layoutParams.rightMargin = gm.L(z2 ? 5.0f : 4.0f);
        this.i1.setLayoutParams(layoutParams);
        s09 s09Var = this.h1;
        if (s09Var != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) s09Var.getLayoutParams();
            layoutParams2.gravity = z2 ? 83 : 51;
            this.h1.setLayoutParams(layoutParams2);
            if (z2) {
                if (this.z5 == null) {
                    p09 p09Var2 = new p09(R.raw.chat_audio_record_delete_outline, gm.L(28.0f), gm.L(28.0f), false, null);
                    this.z5 = p09Var2;
                    p09Var2.E(true);
                }
                p09Var = this.z5;
            } else {
                p09Var = this.A5;
            }
            if (p09Var != null && this.h1.getAnimatedDrawable() != p09Var) {
                this.h1.setAnimation(p09Var);
                p09Var.p0 = p09Var != this.z5;
                x2();
                this.h1.setProgress(0.0f);
            }
        }
        this.f1.setClipChildren(!z2);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f1.getLayoutParams();
        layoutParams3.height = z2 ? -2 : gm.L(44.0f);
        this.f1.setLayoutParams(layoutParams3);
        this.f1.setMinimumHeight(z2 ? gm.L(44.0f) : 0);
        if (!z2) {
            N1(false);
            this.i1.setNewStyleDelegate(null);
            olc olcVar = this.T1;
            if (olcVar != null) {
                this.f1.removeView(olcVar);
                this.T1 = null;
                return;
            }
            return;
        }
        this.i1.setNewStyleDelegate(new gy1(this));
        if (this.T1 == null) {
            olc olcVar2 = new olc(getContext(), this.L4, new vx1(this, b));
            this.T1 = olcVar2;
            this.f1.addView(olcVar2, qoe.d(-1, -2.0f, 80, 48.0f, 0.0f, 0.0f, 0.0f));
        }
        U1(false, false);
        N1(z);
        gm.r(jdVar);
        gm.d3(jdVar, 700L);
    }

    public final boolean r0() {
        if (!DictationAsr.E() || this.F3 == null || this.F0 == null) {
            return false;
        }
        return !(this.U2 && this.d1) && this.z0;
    }

    public final void r1() {
        S1(false, true, false, true);
        Z1(0, 0, false, true);
        if (getEditField() != null && !TextUtils.isEmpty(getEditField().getText())) {
            getEditField().setText("");
        }
        this.v3 = false;
        zx1 zx1Var = this.c1;
        if (zx1Var != null) {
            zx1Var.setVisibility(0);
        }
        this.a3 = true;
        V0();
        C();
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

    public final void r2(boolean z) {
        boolean z2;
        boolean z3;
        String str;
        TLRPC.TL_forumTopic tL_forumTopic;
        String str2;
        k47 k47Var;
        TLRPC.ReplyMarkup replyMarkup;
        TLRPC.ReplyMarkup replyMarkup2;
        sy1 sy1Var = this.F0;
        if (sy1Var != null) {
            CharSequence charSequence = this.e;
            boolean z4 = false;
            if (charSequence != null) {
                sy1Var.r(charSequence, z);
                sy1 sy1Var2 = this.F0;
                String str3 = this.f;
                hu3 hu3Var = sy1Var2.v0;
                if (hu3Var != null) {
                    if (!jb6.a0 && z) {
                        z4 = true;
                    }
                    hu3Var.t(str3, z4, true);
                    return;
                }
                return;
            }
            if (!this.A0 && !Q0()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" d ".concat(jb6.M0(2131746954, "PlainTextRestrictedHint")));
                spannableStringBuilder.setSpan(new pn2(R.drawable.msg_mini_lock3, 0), 1, 2, 0);
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
            C2();
            yv1 yv1Var = this.F3;
            boolean z5 = yv1Var != null && yv1Var.g4 == 8 && yv1Var.i4;
            long L1 = yv1Var != null ? yv1Var.getMessagesController().L1(yv1Var.a()) : 0L;
            if (L1 > 0) {
                L1 *= getMessagesCount();
            }
            int i2 = yv1Var != null ? yv1Var.g4 : -1;
            if (i2 == 9) {
                this.F0.setHintText(jb6.M0(2131742558, null));
                return;
            }
            if (i2 == 5) {
                if ("hello".equalsIgnoreCase(yv1Var.f4)) {
                    this.F0.setHintText(jb6.M0(2131752720, null));
                    return;
                }
                boolean equalsIgnoreCase = "away".equalsIgnoreCase(yv1Var.f4);
                sy1 sy1Var3 = this.F0;
                if (equalsIgnoreCase) {
                    sy1Var3.setHintText(jb6.M0(2131752789, null));
                    return;
                } else {
                    sy1Var3.setHintText(jb6.M0(2131752625, null));
                    return;
                }
            }
            pn2[] pn2VarArr = this.S6;
            if (z5) {
                this.F0.setHintText(L1 > 0 ? nxa.T0(jb6.a0(null, null, 2131744088, jb6.E((int) L1, ','), pn2VarArr)) : jb6.a0(null, null, 2131744089, new Object[0]));
                pn2 pn2Var = pn2VarArr[0];
                if (pn2Var != null) {
                    pn2Var.H = 0.9f;
                    return;
                }
                return;
            }
            if (this.R2 != null) {
                this.F0.setHintText(jb6.M0(2131752659, null));
                return;
            }
            k47 k47Var2 = this.J3;
            if (k47Var2 != null && (replyMarkup2 = k47Var2.k.reply_markup) != null && !TextUtils.isEmpty(replyMarkup2.placeholder)) {
                this.F0.r(this.J3.k.reply_markup.placeholder, z);
                return;
            }
            if (this.P2 != null) {
                this.F0.setHintText(this.Q2 ? jb6.M0(2131752514, null) : jb6.M0(2131743615, null));
                return;
            }
            if (L1 > 0) {
                this.F0.setHintText(nxa.Z0(false, jb6.a0(null, null, 2131743613, jb6.E((int) L1, ',')), pn2VarArr));
                pn2 pn2Var2 = pn2VarArr[0];
                if (pn2Var2 != null) {
                    pn2Var2.H = 0.9f;
                    return;
                }
                return;
            }
            if (this.Y0 && (k47Var = this.c3) != null && (replyMarkup = k47Var.k.reply_markup) != null && !TextUtils.isEmpty(replyMarkup.placeholder)) {
                this.F0.r(this.c3.k.reply_markup.placeholder, z);
                return;
            }
            if (yv1Var != null && yv1Var.V7()) {
                k47 k47Var3 = this.K3;
                if (k47Var3 != null && (tL_forumTopic = k47Var3.j1) != null && (str2 = tL_forumTopic.title) != null) {
                    this.F0.r(jb6.a0(null, null, 2131743612, str2), z);
                    return;
                }
                TLRPC.TL_forumTopic f = oc7.r1(this.R).g4.f(yv1Var.e.id, 1L);
                if (f == null || (str = f.title) == null) {
                    this.F0.r(jb6.M0(2131743615, null), z);
                    return;
                } else {
                    this.F0.r(jb6.a0(null, null, 2131743612, str), z);
                    return;
                }
            }
            if (pg3.y(this.G3)) {
                TLRPC.Chat L0 = oc7.r1(this.S.a).L0(Long.valueOf(-this.G3));
                TLRPC.ChatFull M0 = oc7.r1(this.S.a).M0(-this.G3);
                z3 = sd2.V(L0);
                z2 = !z3 && sd2.M(L0, M0, false) == (-this.G3);
            } else {
                z2 = false;
                z3 = false;
            }
            if (z2) {
                this.F0.setHintText(jb6.M0(2131745372, "SendAnonymously"));
                return;
            }
            TLRPC.User W1 = oc7.r1(this.S.a).W1(Long.valueOf(this.G3));
            if (W1 != null && W1.bot_forum_view && !W1.bot_forum_can_manage_topics && yv1Var != null && !yv1Var.x4) {
                this.F0.setHintText(jb6.M0(2131745367, null));
                return;
            }
            if (yv1Var != null && yv1Var.j8() && !yv1Var.x4) {
                boolean z6 = yv1Var.m4 != null && yv1Var.v4;
                sy1 sy1Var4 = this.F0;
                if (z6) {
                    sy1Var4.setHintText(jb6.M0(2131751942, null));
                    return;
                } else {
                    sy1Var4.setHintText(jb6.M0(2131745996, "Reply"));
                    return;
                }
            }
            if (!z3) {
                this.F0.setHintText(jb6.M0(2131743615, null));
                return;
            }
            boolean z8 = this.W2;
            sy1 sy1Var5 = this.F0;
            if (z8) {
                sy1Var5.r(jb6.M0(2131752229, "ChannelSilentBroadcast"), z);
            } else {
                sy1Var5.r(jb6.M0(2131752393, "ChannelBroadcast"), z);
            }
        }
    }

    public final void s(float f) {
        float i = Utilities.i((f - 0.1f) / 0.9f, 1.0f, 0.0f);
        this.n = L2(0.12f, 0.6f, f) * (this.B0 ? 0.5f : 1.0f);
        float i2 = Utilities.i(i, 1.0f, 0.0f) - 1.0f;
        this.h = gm.R1(0.55f, 1.0f, b10.w(i2, 1.1f, i2, (2.1f * i2 * i2 * i2) + 1.0f));
        q2();
        this.R0.setRotation((1.0f - d53.h.getInterpolation(i)) * (-20.0f));
    }

    public final boolean s0(TL_keyboard.KeyboardButtonProto keyboardButtonProto, k47 k47Var, k47 k47Var2, br1 br1Var) {
        yv1 yv1Var;
        int i;
        int i2 = 0;
        if (keyboardButtonProto != null && k47Var2 != null && ((yv1Var = this.F3) == null || yv1Var.g4 != 5)) {
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) kfb.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = (TL_keyboard.TL_inlineButtonTypeUserProfile) kfb.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class);
            TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) kfb.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class);
            TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) kfb.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class);
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) kfb.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (tL_inlineButtonTypeCopy != null) {
                gm.g(tL_inlineButtonTypeCopy.copy_text);
                c41.b0(yv1Var).i(jb6.a0(null, null, 2131750821, tL_inlineButtonTypeCopy.copy_text)).k(true);
                return true;
            }
            if (keyboardButtonProto instanceof TL_keyboard.TL_keyboardButton) {
                TL_keyboard.TL_keyboardButton tL_keyboardButton = (TL_keyboard.TL_keyboardButton) keyboardButtonProto;
                if (tL_keyboardButton.type instanceof TL_keyboard.TL_buttonTypeDefault) {
                    y5a b = y5a.b(tL_keyboardButton.text, this.G3, k47Var, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                    b.K = yv1Var != null ? yv1Var.X6() : null;
                    b.O = this.W6;
                    this.W6 = 0L;
                    this.K0.setEffect(0L);
                    a6a.B(this.R).q0(b);
                    return true;
                }
            }
            Activity activity = this.E3;
            if (tL_inlineButtonTypeUrl != null) {
                if (l11.A(tL_inlineButtonTypeUrl.url)) {
                    l11.s(activity, Uri.parse(tL_inlineButtonTypeUrl.url), true, true, br1Var);
                    return true;
                }
                ik.o0(this.F3, tL_inlineButtonTypeUrl.url, false, true, true, false, br1Var, null, this.L4);
                return true;
            }
            if (kfb.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPhone.class)) {
                yv1Var.Rb(2, k47Var2);
                return true;
            }
            if (!kfb.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class)) {
                if (kfb.b(keyboardButtonProto)) {
                    TLRPC.Message message = k47Var2.k;
                    long j = message.via_bot_id;
                    if (j == 0) {
                        j = message.from_id.user_id;
                    }
                    long j2 = j;
                    hz1 hz1Var = new hz1(this, k47Var2, j2, keyboardButtonProto, k47Var, oc7.r1(this.R).W1(Long.valueOf(j)));
                    if (ewe.b(this.R, j2) || oc7.r1(this.R).S3.contains(Long.valueOf(j2))) {
                        hz1Var.run();
                        return true;
                    }
                    ik.n(yv1Var, oc7.r1(this.R).W1(Long.valueOf(this.G3)), new of2((Object) this, (Object) hz1Var, j2, (byte) 16), null);
                    return true;
                }
                if (kfb.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    String M0 = jb6.M0(2131745157, "ShareYouLocationTitle");
                    he heVar = alertDialog$Builder.a;
                    heVar.S = M0;
                    heVar.U = jb6.M0(2131745159, "ShareYouLocationInfo");
                    alertDialog$Builder.j(jb6.M0(2131747564, "OK"), new jf((Object) this, (Object) k47Var2, (Object) keyboardButtonProto, (byte) 17));
                    alertDialog$Builder.g(jb6.M0(2131752542, "Cancel"), null);
                    yv1Var.showDialog(heVar);
                    return true;
                }
                if (kfb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || kfb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || kfb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || kfb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
                    a6a.B(this.R).m0(true, k47Var2, keyboardButtonProto, null, null, yv1Var);
                    return true;
                }
                if (tL_inlineButtonTypeSwitchInline != null) {
                    if (!yv1Var.Ua(tL_inlineButtonTypeSwitchInline)) {
                        if (!tL_inlineButtonTypeSwitchInline.same_peer) {
                            Bundle j3 = td4.j(1, "onlySelect", "dialogsType", true);
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
                            nk3 nk3Var = new nk3(j3);
                            nk3Var.E2 = new jf((Object) this, (Object) k47Var2, (Object) tL_inlineButtonTypeSwitchInline, (byte) 18);
                            yv1Var.presentFragment(nk3Var);
                            return true;
                        }
                        TLRPC.Message message2 = k47Var2.k;
                        long j4 = message2.from_id.user_id;
                        long j5 = message2.via_bot_id;
                        if (j5 != 0) {
                            j4 = j5;
                        }
                        TLRPC.User W1 = oc7.r1(this.S.a).W1(Long.valueOf(j4));
                        if (W1 != null) {
                            setFieldText("@" + m9c.p(W1) + " " + tL_inlineButtonTypeSwitchInline.query);
                            return true;
                        }
                    }
                } else if (tL_inlineButtonTypeUserProfile != null) {
                    if (oc7.r1(this.R).W1(Long.valueOf(tL_inlineButtonTypeUserProfile.user_id)) != null) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", tL_inlineButtonTypeUserProfile.user_id);
                        yv1Var.presentFragment(new ProfileActivity(bundle, null));
                        return true;
                    }
                } else if (tL_buttonTypeRequestPeer != null) {
                    TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
                    if (requestPeerType == null || k47Var2.k == null) {
                        fc4.d("button.peer_type is null");
                    } else {
                        if (!(requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot)) {
                            if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                                TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                                Boolean bool = tL_requestPeerTypeUser.bot;
                                Boolean bool2 = tL_requestPeerTypeUser.premium;
                                ow1 ow1Var = new ow1(this, k47Var2, tL_buttonTypeRequestPeer);
                                ji7 ji7Var = ji7.p2;
                                org.telegram.ui.ActionBar.d Q = LaunchActivity.Q();
                                if (Q == null || ji7.p2 != null) {
                                    return false;
                                }
                                ji7 ji7Var2 = new ji7(Q, i, bool, bool2, ow1Var);
                                ji7Var2.show();
                                ji7.p2 = ji7Var2;
                                return false;
                            }
                            Bundle j6 = td4.j(15, "onlySelect", "dialogsType", true);
                            TLRPC.Message message3 = k47Var2.k;
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
                                fc4.g(e, true);
                            }
                            nk3 nk3Var2 = new nk3(j6);
                            nk3Var2.E2 = new ow1(this, k47Var2, tL_buttonTypeRequestPeer);
                            yv1Var.presentFragment(nk3Var2);
                            return false;
                        }
                        TLRPC.User h = getParentFragment() != null ? getParentFragment().h() : oc7.r1(this.R).W1(Long.valueOf(this.G3));
                        if (h != null) {
                            l13.e(getContext(), this.R, h, (TLRPC.TL_requestPeerTypeCreateBot) tL_buttonTypeRequestPeer.peer_type, false, new jv0(this, k47Var2, tL_buttonTypeRequestPeer, h), this.L4, null);
                            return false;
                        }
                    }
                }
                return true;
            }
            TL_keyboard.TL_buttonTypeRequestPoll tL_buttonTypeRequestPoll = (TL_keyboard.TL_buttonTypeRequestPoll) kfb.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class);
            Boolean valueOf = (tL_buttonTypeRequestPoll.flags & 1) != 0 ? Boolean.valueOf(tL_buttonTypeRequestPoll.quiz) : null;
            yv1Var.ma();
            e51 e51Var = yv1Var.Y1;
            if (e51Var != null) {
                e51Var.P2 = false;
                e51Var.u3.setVisibility(8);
                e51Var.C1(false, valueOf);
                return false;
            }
        }
        return false;
    }

    public final void s1() {
        if (this.K1 || this.T1 != null) {
            gm.r(this.X1);
            ValueAnimator valueAnimator = this.W1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.W1 = null;
            }
            olc olcVar = this.T1;
            if (olcVar != null) {
                if (olcVar.c.hasFocus()) {
                    gm.t1(this.T1.c);
                    this.T1.c.clearFocus();
                }
                this.T1.setCollapsing(true);
            }
            this.U1 = false;
            this.Q5 = false;
            N1(false);
            u(0.0f);
            l49 l49Var = this.i1;
            if (l49Var != null) {
                l49Var.setVisibility(8);
            }
            s09 s09Var = this.h1;
            if (s09Var != null) {
                s09Var.setVisibility(0);
            }
            l lVar = this.E2;
            if (lVar != null) {
                this.R5 = 0.0f;
                lVar.setTranslationY(this.S5 + this.t7);
            }
            by1 by1Var = this.K0;
            if (by1Var != null) {
                by1Var.setIconDimmed(false);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s2(int i) {
        ImageView imageView;
        cy1 cy1Var;
        int L;
        cy1 cy1Var2;
        tx1 tx1Var;
        int L2;
        a aVar;
        this.T6 = i;
        if (this.F0 != null) {
            k47 k47Var = this.P2;
            if (k47Var == null || k47Var.o5()) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.F0.getLayoutParams();
                int i2 = layoutParams.rightMargin;
                boolean z = this.Z5;
                by1 by1Var = this.K0;
                if (z && this.w7) {
                    layoutParams.rightMargin = Math.max(0, by1Var.l() - gm.L(44.0f)) + gm.L(this.k5 ? 50.0f : 2.0f);
                } else if ((i == 1 || i == 2) && !o0()) {
                    tx1 tx1Var2 = this.n2;
                    if (tx1Var2 == null || tx1Var2.getVisibility() != 0 || (cy1Var2 = this.z2) == null || cy1Var2.getVisibility() != 0 || (tx1Var = this.h2) == null || tx1Var.getVisibility() != 0) {
                        tx1 tx1Var3 = this.n2;
                        if ((tx1Var3 == null || tx1Var3.getVisibility() != 0) && (((imageView = this.y2) == null || imageView.getVisibility() != 0) && ((cy1Var = this.z2) == null || cy1Var.getTag() == null))) {
                            L = gm.L(50.0f);
                            layoutParams.rightMargin = L;
                        } else {
                            L = gm.L(98.0f);
                            layoutParams.rightMargin = L;
                        }
                    } else {
                        L = gm.L(146.0f);
                        layoutParams.rightMargin = L;
                    }
                    if (this.k5) {
                        layoutParams.rightMargin = gm.L(48.0f) + L;
                    }
                } else {
                    cy1 cy1Var3 = this.z2;
                    if (cy1Var3 == null || cy1Var3.getTag() == null) {
                        layoutParams.rightMargin = gm.L(2.0f);
                    } else {
                        layoutParams.rightMargin = gm.L(50.0f);
                    }
                }
                if (o0() || (g0() && this.v3)) {
                    sy1 sy1Var = this.F0;
                    View view = sy1Var == null ? null : (View) sy1Var.getParent();
                    if (view == null || view.getWidth() == 0 || (aVar = this.a1) == null || aVar.getWidth() == 0) {
                        L2 = gm.L(28.0f);
                    } else {
                        view.getLocationInWindow(new int[2]);
                        aVar.getLocationInWindow(new int[2]);
                        L2 = Math.max(gm.L(2.0f), Math.round((view.getWidth() + r6[0]) - ((((aVar.getWidth() / 2.0f) + (r3[0] - aVar.getTranslationX())) - gm.N(41.0f)) - gm.L(8.0f))));
                    }
                    layoutParams.rightMargin = L2;
                }
                if (O0()) {
                    layoutParams.rightMargin = gm.L(14.0f) - gm.L(44.0f);
                } else {
                    layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, by1Var.l() - gm.L(44.0f)));
                    by1 by1Var2 = this.v2;
                    if (by1Var2 != null && by1Var2.getVisibility() == 0) {
                        layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, this.v2.l() - gm.L(44.0f)));
                    }
                }
                if (i2 != layoutParams.rightMargin) {
                    this.F0.setLayoutParams(layoutParams);
                }
                px1 px1Var = this.f1;
                if (px1Var != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) px1Var.getLayoutParams();
                    layoutParams2.rightMargin = this.P2 == null ? b10.c(44.0f, by1Var.l(), 0) : 0;
                    this.f1.setLayoutParams(layoutParams2);
                }
            }
        }
    }

    public void setAdjustPanLayoutHelper(gb gbVar) {
        this.V = gbVar;
    }

    public void setAnimatedTop(int i) {
        this.J2 = i;
    }

    public void setBotInfo(vh6 vh6Var) {
        B1(vh6Var, true);
    }

    public void setBotWebViewButtonOffsetX(float f) {
        this.R0.setTranslationX(f);
        if (this.F0 != null) {
            this.H = f;
            u2();
        }
        this.h2.setTranslationX(this.E + this.y + f);
        this.c1.setTranslationX(f);
        tx1 tx1Var = this.n2;
        if (tx1Var != null) {
            tx1Var.setTranslationX(f);
        }
    }

    public void setButtons(k47 k47Var) {
        D1(k47Var, true, true);
    }

    public void setCaption(String str) {
        sy1 sy1Var = this.F0;
        if (sy1Var != null) {
            sy1Var.setCaption(str);
            M(true);
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.T2 = chatFull;
        jz1 jz1Var = this.V0;
        if (jz1Var != null) {
            jz1Var.setChatInfo(chatFull);
        }
        yz1 yz1Var = this.G0;
        if (yz1Var != null) {
            yz1Var.b = chatFull != null && chatFull.boosts_unrestrict > 0;
            yz1Var.invalidate();
        }
        if (sd2.i0(chatFull)) {
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

    public void setDelegate(uz1 uz1Var) {
        this.P3 = uz1Var;
    }

    public void setEditingBusinessLink(TL_account.TL_businessChatLink tL_businessChatLink) {
        String str;
        this.R2 = tL_businessChatLink;
        r2(false);
        if (this.R2 != null) {
            W(true);
            this.v2.setOnClickListener(new rw1(this, (byte) 6));
            this.v2.setContentDescription(jb6.M0(2131751291, null));
            this.v2.setVisibility(0);
            this.v2.setScaleX(0.1f);
            this.v2.setScaleY(0.1f);
            this.v2.setAlpha(0.0f);
            this.v2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(d53.f).start();
            this.d0 = oc7.r1(this.S.a).s1();
            sy1 sy1Var = this.F0;
            TextPaint paint = sy1Var != null ? sy1Var.getPaint() : null;
            if (paint == null) {
                paint = new TextPaint();
                paint.setTextSize(gm.L(18.0f));
            }
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            ArrayList<TLRPC.MessageEntity> arrayList = this.R2.entities;
            if (arrayList == null || (str = tL_businessChatLink.message) == null) {
                String str2 = tL_businessChatLink.message;
                if (str2 != null) {
                    setFieldText(str2);
                }
            } else {
                setFieldText(q(fontMetricsInt, str, arrayList));
            }
            this.S2 = A();
            z1(false, false, false);
            getSendButtonInternal().setVisibility(8);
            setSlowModeButtonVisible(false);
            this.Q0.setVisibility(8);
            this.a1.setVisibility(8);
            qmb qmbVar = this.f2;
            if (qmbVar != null) {
                qmbVar.setVisibility(8);
            }
            tx1 tx1Var = this.h2;
            if (tx1Var != null) {
                this.l2 = 0.0f;
                tx1Var.setAlpha(0.0f);
                tx1Var.setScaleX(0.5f);
                tx1Var.setScaleY(0.5f);
            }
            this.q2.setVisibility(8);
            cy1 cy1Var = this.z2;
            if (cy1Var != null) {
                cy1Var.setVisibility(8);
            }
        }
    }

    public void setEffectId(long j) {
        this.W6 = j;
        by1 by1Var = this.K0;
        if (by1Var != null) {
            by1Var.setEffect(j);
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
            mw1 mw1Var = new mw1(this, (byte) 19);
            this.I2 = mw1Var;
            gm.d3(mw1Var, 600L);
            return;
        }
        sy1 sy1Var = this.F0;
        if (sy1Var == null || !sy1Var.isFocused()) {
            return;
        }
        if (!this.p3 || this.Z2) {
            this.F0.clearFocus();
        }
    }

    @Override // ddb
    public void setFieldText(CharSequence charSequence) {
        J1(charSequence, false);
    }

    public void setInAppInsetsController(c0d c0dVar) {
        this.l7 = c0dVar;
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
            onLongClickListener = new hx1(this, (byte) 0);
        }
        this.K0.setOnLongClickListener(onLongClickListener);
    }

    public void setOverrideHint(CharSequence charSequence) {
        O1(charSequence, false);
    }

    public void setOverrideKeyboardAnimation(boolean z) {
        this.w = z;
    }

    public void setRichDraftPreview(TL_iv.RichMessage richMessage) {
        if (this.s2 == null) {
            return;
        }
        oc7.r1(this.R);
        boolean z = e21.a;
        this.u2 = richMessage;
        y2();
    }

    public void setRoundVideoUiFrameClockActive(boolean z) {
        if (this.Z1 != z) {
            this.Z1 = z;
            zz1 zz1Var = this.Z0;
            if (zz1Var != null) {
                zz1Var.setExternalFrameClock(z);
            }
            wz1 wz1Var = this.b2;
            if (wz1Var != null) {
                wz1Var.f = z;
                System.currentTimeMillis();
                wz1Var.h = -1L;
                wz1Var.invalidate();
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
        sy1 sy1Var = this.F0;
        if (sy1Var == null) {
            return;
        }
        sy1Var.setSelection(i, sy1Var.length());
    }

    public void setSideButtonsForAttach(q02 q02Var) {
        qmb qmbVar;
        q02 q02Var2 = this.m7;
        if (q02Var2 != q02Var) {
            if (q02Var2 != null) {
                q02Var2.e(0, false, true);
            }
            this.m7 = q02Var;
            tx1 tx1Var = this.h2;
            if (tx1Var == null || (qmbVar = this.f2) == null || qmbVar.getVisibility() == 0) {
                return;
            }
            boolean z = q02Var != null && P0();
            boolean z2 = (q02Var == null || z) ? false : true;
            if (q02Var != null) {
                q02Var.e(0, z && !F2(), true);
            }
            ViewPropertyAnimator viewPropertyAnimator = this.g2;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
            }
            ViewPropertyAnimator animate = tx1Var.animate();
            float f = z2 ? 1.0f : 0.0f;
            this.l2 = f;
            ViewPropertyAnimator duration = animate.alpha(f).scaleX(z2 ? 1.0f : 0.5f).scaleY(z2 ? 1.0f : 0.5f).setInterpolator(d53.h).setDuration(320L);
            this.g2 = duration;
            duration.start();
        }
    }

    public void setSlideToCancelProgress(float f) {
        this.Y4 = f;
        float measuredWidth = getMeasuredWidth() * 0.35f;
        if (measuredWidth > gm.L(140.0f)) {
            measuredWidth = gm.L(140.0f);
        }
        this.i5 = (int) ((1.0f - this.Y4) * (-measuredWidth));
        RecordCircle recordCircle = this.D2;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setSlowModeTimer(int i) {
        this.H0 = i;
        D2();
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
        sy1 sy1Var = this.F0;
        if (sy1Var != null) {
            sy1Var.setEnabled(z);
        }
    }

    public void setVoiceDraft(cs6 cs6Var) {
        File file;
        String str;
        if (cs6Var != null) {
            boolean z = cs6Var.g;
            this.P = z;
            l lVar = this.E2;
            if (lVar != null) {
                lVar.E.d(1, z, true);
            }
            uz1 uz1Var = this.P3;
            TL_stories.StoryItem C0 = uz1Var != null ? uz1Var.C0() : null;
            MediaController w = MediaController.w();
            int i = this.R;
            long j = this.G3;
            k47 k47Var = this.J3;
            k47 threadMessage = getThreadMessage();
            l3a l3aVar = null;
            int i2 = this.w3;
            yv1 yv1Var = this.F3;
            if (yv1Var != null) {
                l3aVar = yv1Var.X6();
            }
            long sendMonoForumPeerId = getSendMonoForumPeerId();
            v67 sendMessageSuggestionParams = getSendMessageSuggestionParams();
            mp3 mp3Var = w.N1;
            if (w.I1) {
                u30 u30Var = w.G1;
                if (u30Var != null && u30Var.e() && w.g1 != null && (file = w.k1) != null && (str = cs6Var.a) != null && str.equals(file.getAbsolutePath())) {
                    w.h1 = i2;
                    w.r1 = k47Var;
                    w.s1 = threadMessage;
                    w.t1 = C0;
                    w.u1 = l3aVar;
                    w.p1 = sendMonoForumPeerId;
                    w.q1 = sendMessageSuggestionParams;
                    nm7.f(w.i1).k(nm7.o2, new Object[0]);
                    nm7.f(w.i1).k(nm7.s2, Integer.valueOf(w.h1), w.g1, w.k1.getAbsolutePath(), Boolean.TRUE, Float.valueOf(cs6Var.h), Float.valueOf(cs6Var.i));
                    return;
                }
                if (!w.W()) {
                    return;
                }
            }
            w.y0 = false;
            w.X(true);
            mp3Var.a(w.M1);
            mp3Var.c(new an6(w, i2, cs6Var, i, j, sendMonoForumPeerId, sendMessageSuggestionParams, threadMessage, k47Var, C0));
        }
    }

    public final void t(y5a y5aVar) {
        uz1 uz1Var = this.P3;
        if (uz1Var != null) {
            y5aVar.H = uz1Var.C0();
            y5aVar.J = this.P3.J();
        }
    }

    public final void t0() {
        o47 o47Var;
        v67 b;
        TLRPC.Chat chat;
        int i;
        v67 b2;
        k47 k47Var = this.P2;
        if (k47Var != null) {
            boolean o5 = k47Var.o5();
            yv1 yv1Var = this.F3;
            if (o5 && !sd2.z(this.R, 24, k47.B0(this.P2.k))) {
                if (yv1Var == null || (b2 = yv1Var.y5) == null) {
                    b2 = v67.b(this.P2.k.suggested_post);
                }
                if (!jva.Q(this.R, b2.a)) {
                    if (yv1Var != null) {
                        yv1Var.wc(b2);
                        return;
                    }
                    return;
                }
            }
            if (this.d0 - this.e0 < 0) {
                NumberTextView numberTextView = this.c0;
                if (numberTextView != null) {
                    gm.A3(3.5f, numberTextView, null);
                    try {
                        this.c0.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                if (oc7.r1(this.R).H3() || oc7.r1(this.R).l4.h1.f() <= this.e0) {
                    return;
                }
                W1();
                return;
            }
            byte b3 = 0;
            if (this.H2 != 0) {
                R1(0, true);
                this.V0.r(false);
                if (this.p4) {
                    S1(false, true, false, true);
                    this.b4 = true;
                    gm.d3(new mw1(this, b3), 200L);
                }
            }
            sy1 sy1Var = this.F0;
            CharSequence textToUse = sy1Var == null ? "" : sy1Var.getTextToUse();
            k47 k47Var2 = this.P2;
            if (k47Var2 == null || k47Var2.D != 19) {
                textToUse = gm.m1(textToUse);
            }
            CharSequence[] charSequenceArr = {textToUse};
            if (TextUtils.isEmpty(charSequenceArr[0])) {
                TLRPC.MessageMedia messageMedia = this.P2.k.media;
                if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) || (messageMedia instanceof TLRPC.TL_messageMediaEmpty) || messageMedia == null) {
                    gm.A3(-3.0f, this.F0, null);
                    xx0.E.a();
                    return;
                }
            }
            ArrayList Y = hs6.d0(this.R).Y(charSequenceArr, g2(), true);
            if (!TextUtils.equals(charSequenceArr[0], this.P2.v) || ((Y != null && !Y.isEmpty()) || !this.P2.k.entities.isEmpty() || (this.P2.k.media instanceof TLRPC.TL_messageMediaWebPage))) {
                k47 k47Var3 = this.P2;
                k47Var3.y1 = charSequenceArr[0];
                k47Var3.z1 = Y;
                k47Var3.A1 = this.O3;
                if (yv1Var != null && (chat = yv1Var.e) != null && (((i = k47Var3.D) == 0 || i == 19) && !sd2.m(chat))) {
                    k47 k47Var4 = this.P2;
                    k47Var4.A1 = false;
                    TLRPC.Message message = k47Var4.k;
                    message.flags &= -513;
                    message.media = null;
                } else if (yv1Var == null || (o47Var = yv1Var.x5) == null) {
                    k47 k47Var5 = this.P2;
                    k47Var5.A1 = false;
                    int i2 = k47Var5.D;
                    if (i2 == 0 || i2 == 19) {
                        TLRPC.Message message2 = k47Var5.k;
                        message2.flags |= 512;
                        message2.media = new TLRPC.TL_messageMediaEmpty();
                    }
                } else {
                    if (yv1Var.Y5 instanceof TLRPC.TL_webPagePending) {
                        k47 k47Var6 = this.P2;
                        k47Var6.A1 = false;
                        int i3 = k47Var6.D;
                        if (i3 == 0 || i3 == 19) {
                            k47Var6.k.media = new TLRPC.TL_messageMediaEmpty();
                            this.P2.k.flags |= 512;
                        }
                    } else {
                        TLRPC.WebPage webPage = o47Var.v;
                        k47 k47Var7 = this.P2;
                        if (webPage != null) {
                            k47Var7.A1 = false;
                            TLRPC.Message message3 = k47Var7.k;
                            message3.flags |= 512;
                            message3.media = new TLRPC.TL_messageMediaWebPage();
                            this.P2.k.media.webpage = yv1Var.x5.v;
                        } else {
                            k47Var7.A1 = false;
                            int i4 = k47Var7.D;
                            if (i4 == 0 || i4 == 19) {
                                TLRPC.Message message4 = k47Var7.k;
                                message4.flags |= 512;
                                message4.media = new TLRPC.TL_messageMediaEmpty();
                            }
                        }
                    }
                    TLRPC.Message message5 = this.P2.k;
                    o47 o47Var2 = yv1Var.x5;
                    message5.invert_media = o47Var2.r;
                    if (o47Var2.o) {
                        TLRPC.MessageMedia messageMedia2 = message5.media;
                        if (messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) {
                            boolean z = o47Var2.q;
                            messageMedia2.force_small_media = z;
                            messageMedia2.force_large_media = !z;
                        }
                    }
                }
                if (this.P2.o5()) {
                    y5a a = y5a.a(k47.B0(this.P2.k), this.P2.y1.toString());
                    if (yv1Var == null || (b = yv1Var.y5) == null) {
                        b = v67.b(this.P2.k.suggested_post);
                    }
                    a.T = b;
                    a.R = pg3.n(this.P2.k.saved_peer_id);
                    a.G = this.P2.t2();
                    k47 k47Var8 = this.P2;
                    a.r = k47Var8;
                    a.D = k47Var8;
                    boolean z2 = k47Var8.F0() instanceof TLRPC.TL_document;
                    k47 k47Var9 = this.P2;
                    if (z2) {
                        a.g = (TLRPC.TL_document) k47Var9.F0();
                        a.b = a.a;
                        a.a = null;
                    } else {
                        TLRPC.MessageMedia messageMedia3 = k47Var9.k.media;
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
                    a6a.B(this.R).q0(a);
                } else {
                    a6a B = a6a.B(this.R);
                    k47 k47Var10 = this.P2;
                    B.s(k47Var10, null, null, null, null, null, null, null, false, k47Var10.t2(), null);
                }
            }
            G1(null, null, false);
        }
    }

    public final void t1() {
        l49 l49Var = this.i1;
        if (l49Var != null) {
            l49Var.setPlaying(false);
        }
        if (this.U3 != null) {
            this.P3.F1(2, 0, this.P ? Integer.MAX_VALUE : 0, this.W6, 0L, true);
            this.W6 = 0L;
            this.K0.setEffect(0L);
        } else {
            k47 k47Var = MediaController.w().v0;
            if (k47Var != null && k47Var == this.T3) {
                MediaController.w().l(true, true, false, false);
            }
        }
        if (this.S3 != null) {
            if (e21.a) {
                hg9.r(this.S3, new StringBuilder("delete file "));
            }
            new File(this.S3).delete();
        }
        MediaController.w().i(true);
        hs6 d0 = hs6.d0(this.R);
        long j = this.G3;
        yv1 yv1Var = this.F3;
        d0.D1(j, (yv1Var == null || !yv1Var.x4) ? 0L : yv1Var.d(), null);
        MediaController.w().A0(0, 0, false, false);
        this.Y1 = 0L;
        L0(false);
        M(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a5, code lost:
    
        if (oc7.r1(r14.R).X3.getBoolean("show_gift_for_" + r14.F3.a(), true) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00db, code lost:
    
        if (oc7.r1(r14.R).X3.getBoolean(java.util.Calendar.getInstance().get(1) + "show_gift_for_" + r14.F3.a(), true) == false) goto L37;
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
    public final void t2(boolean z) {
        boolean z2;
        ylb ylbVar;
        hg5 hg5Var;
        TLRPC.UserFull userFull = getParentFragment() == null ? null : getParentFragment().s8;
        TLRPC.UserFull X1 = oc7.r1(this.R).X1(z8c.h(this.R).e());
        TLRPC.User h = getParentFragment() == null ? null : getParentFragment().h();
        byte b = 0;
        byte b2 = 1;
        if (!oc7.r1(this.R).I3() && getParentFragment() != null && h != null) {
            boolean z3 = e21.a;
            if ((!m9c.D(h) || (X1 != null && X1.display_gifts_button)) && !m9c.v(h) && !oc7.G2(h) && userFull != null) {
                if (!h.premium && oc7.r1(this.R).l4.C0.f && oc7.r1(this.R).l4.B0.f) {
                }
                if (ok0.e(userFull.birthday)) {
                }
                if (!userFull.display_gifts_button) {
                    if (X1 != null) {
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
                yv1 yv1Var = this.F3;
                if (yv1Var != null && yv1Var.g4 == 0) {
                    z2 = true;
                    if (!z2 && (hg5Var = this.M) != null) {
                        hg5Var.f(true);
                    }
                    if (z2 && this.A2 == null) {
                        return;
                    }
                    ylbVar = this.L4;
                    if (this.A2 == null && this.F3 != null) {
                        tx1 tx1Var = new tx1(this, getContext(), b2);
                        this.A2 = tx1Var;
                        tx1Var.setImageResource(R.drawable.msg_input_gift);
                        anb.s(this.A2, cmb.Ml, ylbVar, PorterDuff.Mode.MULTIPLY);
                        this.A2.setVisibility(8);
                        this.A2.setContentDescription(jb6.M0(2131749457, null));
                        this.A2.setScaleType(ImageView.ScaleType.CENTER);
                        tx1 tx1Var2 = this.A2;
                        int i = cmb.h6;
                        anb.R(tx1Var2, cmb.f0(F0(i), 1, -1), null, anb.M(i), ylbVar);
                        this.f2.addView(this.A2, 0, qoe.e(44, 44, 21));
                        this.A2.setOnClickListener(new rw1(this, (byte) 13));
                    }
                    gm.S3(this.A2, z2, 1.0f, true, 1.0f, z, new bx1(this, b));
                    if (z2) {
                        return;
                    }
                    F();
                    return;
                }
            }
        }
        z2 = false;
        if (!z2) {
            hg5Var.f(true);
        }
        if (z2) {
        }
        ylbVar = this.L4;
        if (this.A2 == null) {
            tx1 tx1Var3 = new tx1(this, getContext(), b2);
            this.A2 = tx1Var3;
            tx1Var3.setImageResource(R.drawable.msg_input_gift);
            anb.s(this.A2, cmb.Ml, ylbVar, PorterDuff.Mode.MULTIPLY);
            this.A2.setVisibility(8);
            this.A2.setContentDescription(jb6.M0(2131749457, null));
            this.A2.setScaleType(ImageView.ScaleType.CENTER);
            tx1 tx1Var22 = this.A2;
            int i2 = cmb.h6;
            anb.R(tx1Var22, cmb.f0(F0(i2), 1, -1), null, anb.M(i2), ylbVar);
            this.f2.addView(this.A2, 0, qoe.e(44, 44, 21));
            this.A2.setOnClickListener(new rw1(this, (byte) 13));
        }
        gm.S3(this.A2, z2, 1.0f, true, 1.0f, z, new bx1(this, b));
        if (z2) {
        }
    }

    public final void u(float f) {
        this.V1 = f;
        l49 l49Var = this.i1;
        if (l49Var != null) {
            l49Var.setNewContentAlpha(1.0f);
            this.i1.setAlpha(Math.max(0.0f, 1.0f - (1.8f * f)));
            float R1 = gm.R1(1.0f, 0.94f, f);
            this.i1.setPivotX(gm.L(17.0f));
            this.i1.setPivotY(r4.getHeight() / 2.0f);
            this.i1.setScaleX(R1);
            this.i1.setScaleY(R1);
            this.i1.setTranslationX((-gm.L(20.0f)) * f);
            this.i1.setVisibility(f >= 1.0f ? 4 : 0);
        }
        olc olcVar = this.T1;
        if (olcVar != null) {
            olcVar.setModeProgress(f);
            this.T1.setVisibility(f <= 0.0f ? 8 : 0);
        }
    }

    public final void u0(Canvas canvas, boolean z) {
        if (this.X5) {
            int A = (int) td4.A(1.0f, this.b6, cmb.h3.getIntrinsicHeight(), this.J2);
            View view = this.w2;
            if (view != null && view.getVisibility() == 0) {
                A = (int) (((1.0f - getTopViewEnterProgress()) * this.w2.getLayoutParams().height) + A);
            }
            int intrinsicHeight = cmb.h3.getIntrinsicHeight() + A;
            if (z) {
                cmb.h3.setAlpha((int) (this.b6 * 255.0f));
                cmb.h3.setBounds(0, A, getMeasuredWidth(), intrinsicHeight);
                cmb.h3.draw(canvas);
            }
            if (!this.W5) {
                float f = intrinsicHeight;
                float width = getWidth();
                float height = getHeight();
                ylb ylbVar = this.L4;
                Paint d = ylbVar != null ? ylbVar.d("paintChatComposeBackground") : null;
                if (d == null) {
                    d = cmb.T0("paintChatComposeBackground");
                }
                canvas.drawRect(0.0f, f, width, height, d);
                return;
            }
            int F0 = F0(cmb.Ie);
            Paint paint = this.a6;
            paint.setColor(F0);
            if (!gda.f() || this.c2 == null) {
                canvas.drawRect(0.0f, intrinsicHeight, getWidth(), getHeight(), paint);
            } else {
                this.c6.set(0, intrinsicHeight, getWidth(), getHeight());
                this.c2.H(canvas, getTop(), this.c6, paint, false);
            }
        }
    }

    public final void u1(TL_iv.RichMessage richMessage) {
        yv1 yv1Var = this.F3;
        if (yv1Var != null) {
            hs6.d0(this.R).T1(yv1Var.a(), yv1Var.O5(yv1Var.F5), "", null, null, null, null, 0L, false, false, richMessage);
        }
        setRichDraftPreview(richMessage);
    }

    public final void u2() {
        sy1 sy1Var = this.F0;
        if (sy1Var != null) {
            sy1Var.setTranslationX(this.I + this.H);
        }
    }

    @Override // vlb
    public final void updateColors() {
        TextPaint textPaint;
        ylb ylbVar = this.L4;
        try {
            sy1 sy1Var = this.F0;
            if (sy1Var != null) {
                anb.l(sy1Var, 34, cmb.Le, ylbVar);
                anb.v(this.F0, cmb.Me, ylbVar);
                anb.y(this.F0, cmb.lg, ylbVar);
            }
            Paint paint = this.G2;
            if (paint != null) {
                paint.setColor(F0(cmb.Rf));
            }
            yz1 yz1Var = this.G0;
            if (yz1Var != null) {
                ((lka) yz1Var.c).setTextColor(F0(cmb.Ml));
                yz1Var.invalidate();
            }
            AnimatedArrowDrawable animatedArrowDrawable = this.v4;
            if (animatedArrowDrawable != null) {
                animatedArrowDrawable.a.setColor(F0(cmb.Ml));
                animatedArrowDrawable.invalidateSelf();
            }
            by1 by1Var = this.K0;
            if (by1Var != null && this.L0 != 0 && by1Var.getBackground() != null) {
                int F0 = F0((this.H0 != Integer.MAX_VALUE || X0()) ? cmb.Oe : cmb.Ml);
                if (F0 != this.L0) {
                    this.L0 = F0;
                    cmb.F1(by1Var.getBackground(), Color.argb(24, Color.red(F0), Color.green(F0), Color.blue(F0)), true);
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
        un3 un3Var = this.j1;
        if (un3Var != null) {
            un3Var.L();
        }
        x2();
        RecordCircle recordCircle = this.D2;
        if (recordCircle != null) {
            recordCircle.h();
        }
        wz1 wz1Var = this.b2;
        if (wz1Var != null) {
            wz1Var.f();
        }
        SlideTextView slideTextView = this.a2;
        if (slideTextView != null) {
            slideTextView.b();
        }
        zz1 zz1Var = this.Z0;
        if (zz1Var != null && (textPaint = zz1Var.G) != null) {
            textPaint.setColor(zz1Var.J.F0(cmb.F6));
        }
        tec tecVar = this.g1;
        if (tecVar != null) {
            tecVar.e.setColor(cmb.w0(null, cmb.Z6, false));
            tecVar.M = 0;
            rec recVar = tecVar.Q;
            if (recVar != null) {
                recVar.b();
            }
        }
        NumberTextView numberTextView = this.c0;
        if (numberTextView != null && this.F0 != null) {
            if (this.e0 - this.d0 < 0) {
                numberTextView.setTextColor(F0(cmb.o7));
            } else {
                numberTextView.setTextColor(F0(cmb.x6));
            }
        }
        F0(cmb.Sf);
        py1 py1Var = this.n0;
        if (py1Var != null) {
            py1Var.d.setColor(cmb.w0(null, cmb.yj, false));
            im0 im0Var = py1Var.r;
            if (im0Var != null) {
                im0Var.updateColors();
            }
            py1Var.invalidate();
        }
        gz1 gz1Var = this.x2;
        if (gz1Var != null) {
            gz1Var.d();
        }
        int F02 = this.b1 ? F0(cmb.Ml) : -1;
        zx1 zx1Var = this.c1;
        if (zx1Var != null && (!this.Z6 || F02 != this.X6)) {
            this.Z6 = true;
            this.X6 = F02;
            zx1Var.setColorFilter(new PorterDuffColorFilter(F02, PorterDuff.Mode.SRC_IN));
        }
        int F03 = F0(cmb.h6);
        if (this.a7 && F03 == this.Y6) {
            return;
        }
        this.a7 = true;
        this.Y6 = F03;
        rx1 rx1Var = this.R0;
        if (rx1Var != null) {
            rx1Var.setBackground(cmb.f0(F03, 1, -1));
        }
        ImageView imageView = this.S0;
        if (imageView != null) {
            float L = gm.L(19.0f);
            int L2 = gm.L(1.0f);
            int L3 = gm.L(3.0f);
            imageView.setBackground(cmb.W(L, F03, L2, L3, L2, L3));
        }
    }

    public boolean v() {
        return false;
    }

    public final boolean v0(Canvas canvas, iac iacVar) {
        float f;
        float f2;
        float f3;
        float f4;
        float d = this.j7.d(this.F0.canScrollVertically(-1));
        float d2 = this.k7.d(this.F0.canScrollVertically(1));
        if (d <= 0.0f && d2 <= 0.0f) {
            return ((Boolean) iacVar.run()).booleanValue();
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, this.F0.getX() + this.F0.getMeasuredWidth() + gm.L(5.0f), this.F0.getY() + this.F0.getMeasuredHeight() + gm.L(2.0f), nm7.d4, 31);
        boolean booleanValue = ((Boolean) iacVar.run()).booleanValue();
        canvas.save();
        LinearGradient linearGradient = this.h7;
        Paint paint = this.g7;
        Matrix matrix = this.i7;
        if (d > 0.0f) {
            RectF rectF = gm.P;
            f3 = 255.0f;
            f4 = 16.0f;
            f = 0.0f;
            f2 = 5.0f;
            rectF.set(this.F0.getX() - gm.L(5.0f), (this.F0.getY() + this.J2) - 1.0f, this.F0.getX() + this.F0.getMeasuredWidth() + gm.L(5.0f), this.F0.getY() + this.J2 + gm.L(13.0f));
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
            RectF rectF2 = gm.P;
            rectF2.set(this.F0.getX() - gm.L(f2), (this.F0.getY() + this.F0.getMeasuredHeight()) - gm.L(15.0f), this.F0.getX() + this.F0.getMeasuredWidth() + gm.L(f2), this.F0.getY() + this.F0.getMeasuredHeight() + gm.L(2.0f) + 1.0f);
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

    public final void v1(SpannableStringBuilder spannableStringBuilder, boolean z, int i, int i2) {
        if (this.F0 == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        gw3.m(spannableStringBuilder2, this.F0.getPaint().getFontMetricsInt(), false, null, 0);
        gn[] gnVarArr = (gn[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), gn.class);
        if (gnVarArr != null) {
            for (gn gnVar : gnVarArr) {
                gnVar.applyFontMetrics(this.F0.getPaint().getFontMetricsInt(), vm.f());
            }
        }
        f09.a(spannableStringBuilder2);
        Q();
        setFieldText(spannableStringBuilder2);
        x1(z, i, i2, 0L, true);
    }

    public final void v2(TLRPC.Chat chat, TLRPC.UserFull userFull) {
        jz1 jz1Var;
        this.B0 = false;
        boolean z = true;
        this.b = true;
        this.A0 = true;
        this.y0 = true;
        this.z0 = true;
        if (chat != null) {
            this.b1 = (sd2.v(chat) || (sd2.s(chat) && this.U2)) ? false : true;
            this.b = sd2.t(chat);
            boolean q = sd2.q(chat);
            this.A0 = q;
            boolean z2 = (this.b || q) ? false : true;
            this.B0 = z2;
            this.n = z2 ? 0.5f : 1.0f;
            q2();
            if (!this.B0 && (jz1Var = this.V0) != null) {
                jz1Var.J(-this.G3, !this.A0, !this.b);
            }
            this.y0 = sd2.s(chat);
            this.z0 = sd2.v(chat);
        } else if (userFull != null) {
            this.b1 = userFull.voice_messages_forbidden;
            this.L = userFull;
        }
        if (chat != null || userFull != null) {
            this.n1 = this.b1;
            this.k1 = chat != null ? !sd2.v(chat) : userFull.voice_messages_forbidden;
            this.o1 = chat != null && sd2.s(chat) && this.U2;
        }
        boolean z3 = this.k1 && this.A0 && !this.w7 && zfe.a(getContext());
        this.l1 = z3;
        this.b1 = this.n1 && !z3;
        i0();
        if (this.k1 && !this.m1) {
            this.m1 = true;
            DictationAsr.i(this.q1);
            if (!jo3.h()) {
                jo3.j();
            }
        }
        float f = this.b1 ? 0.5f : 1.0f;
        a aVar = this.a1;
        aVar.setAlpha(f);
        aVar.invalidate();
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.b1 ? F0(cmb.Ml) : -1, PorterDuff.Mode.SRC_IN);
        zx1 zx1Var = this.c1;
        zx1Var.setColorFilter(porterDuffColorFilter);
        zx1Var.invalidate();
        r2(false);
        boolean z4 = this.d1;
        if (!this.y0 && z4) {
            z4 = false;
        }
        if (this.l1 && this.o1) {
            z4 = oc7.d1().getBoolean("currentModeVideo", false);
        }
        if (this.z0 || z4 || this.l1) {
            z = z4;
        } else if (!this.U2) {
            z = false;
        }
        if (this.l1 && !this.o1) {
            z = false;
        }
        P1(z, false);
        wz1 wz1Var = this.b2;
        if (wz1Var != null) {
            wz1Var.d(g0());
        }
        zx1Var.invalidate();
    }

    public final void w() {
        if (this.V0.getParent() == null) {
            c0d c0dVar = this.l7;
            ViewGroup viewGroup = this.d2;
            jz1 jz1Var = this.V0;
            if (c0dVar == null) {
                viewGroup.addView(jz1Var);
            } else {
                viewGroup.addView(jz1Var, qoe.c(-1.0f, -1));
            }
        }
    }

    public final void w0(FrameLayout frameLayout, Canvas canvas, float f, float f2, float f3, float f4) {
        im0 im0Var;
        float f5;
        l49 l49Var = this.i1;
        float trimProgress = (l49Var == null || !this.K1) ? 0.0f : l49Var.getTrimProgress();
        if (trimProgress <= 0.0f || this.i1.getVisibility() != 0) {
            return;
        }
        l49 l49Var2 = this.i1;
        if (l49Var2.T0 == null && f4 > f3) {
            l49Var2.getLocationInWindow(this.s5);
            float trimHandleX = this.i1.getTrimHandleX() + r10[0];
            float N = gm.N(6.0f);
            float N2 = gm.N(11.0f);
            float trimWindowTop = ((this.i1.getTrimWindowTop() + r10[1]) - gm.N(4.0f)) - N;
            String trimBubbleText = this.i1.getTrimBubbleText();
            float L = gm.L(13.0f);
            TextPaint textPaint = this.m5;
            textPaint.setTextSize(L);
            textPaint.setTypeface(gm.n1("fonts/rmedium.ttf"));
            textPaint.setColor(-1);
            float measureText = textPaint.measureText(trimBubbleText);
            float N3 = gm.N(23.0f) + measureText;
            float N4 = gm.N(29.0f);
            float max = Math.max(gm.L(8.0f), Math.min((gm.q.x - gm.L(8.0f)) - N3, trimHandleX - (N3 / 2.0f)));
            RectF rectF = this.r5;
            rectF.set(max, trimWindowTop - N4, max + N3, trimWindowTop);
            float i = Utilities.i(trimHandleX, rectF.right - gm.L(16.0f), rectF.left + gm.L(16.0f));
            Path path = this.p5;
            path.rewind();
            float f6 = N4 / 2.0f;
            path.addRoundRect(rectF, f6, f6, Path.Direction.CW);
            Path path2 = this.q5;
            path2.rewind();
            float f7 = i - N2;
            path2.moveTo(f7, trimWindowTop - gm.N(2.0f));
            path2.lineTo(f7, trimWindowTop);
            float f8 = trimWindowTop + N;
            path2.cubicTo(i - gm.N(6.5f), trimWindowTop, i - gm.N(3.2f), f8, i, f8);
            float N5 = gm.N(3.2f) + i;
            float N6 = gm.N(6.5f) + i;
            float f9 = i + N2;
            path2.cubicTo(N5, f8, N6, trimWindowTop, f9, trimWindowTop);
            path2.lineTo(f9, trimWindowTop - gm.N(2.0f));
            path2.close();
            path.op(path2, Path.Op.UNION);
            canvas.save();
            canvas.translate(-f, -f2);
            canvas.clipRect(-100000.0f, f3, 100000.0f, f4);
            float R1 = gm.R1(0.8f, 1.0f, trimProgress);
            canvas.scale(R1, R1, i, f8);
            canvas.translate(0.0f, (1.0f - trimProgress) * gm.L(6.0f));
            km0 km0Var = this.L1;
            if (km0Var == null) {
                im0Var = null;
            } else {
                boolean z = frameLayout != this;
                im0 im0Var2 = z ? this.u5 : this.v5;
                if (im0Var2 == null) {
                    im0Var = km0Var.c(frameLayout, this.w5, false);
                    im0Var.r(0.0f);
                    im0Var.X = 0.0f;
                    if (z) {
                        this.u5 = im0Var;
                    } else {
                        this.v5 = im0Var;
                    }
                } else {
                    im0Var = im0Var2;
                }
            }
            if (im0Var != null) {
                canvas.save();
                canvas.clipPath(path);
                canvas.translate(f, f2);
                f5 = 255.0f;
                im0Var.setBounds((int) Math.floor(rectF.left - f), (int) Math.floor(rectF.top - f2), (int) Math.ceil(rectF.right - f), (int) Math.ceil(f8 - f2));
                im0Var.setAlpha((int) (trimProgress * 255.0f));
                im0Var.draw(canvas);
                canvas.restore();
            } else {
                f5 = 255.0f;
            }
            int p1 = cmb.p1((im0Var != null ? 0.5f : 0.6f) * trimProgress, -16777216);
            Paint paint = this.n5;
            paint.setColor(p1);
            canvas.drawPath(path, paint);
            Paint.Style style = Paint.Style.STROKE;
            Paint paint2 = this.o5;
            paint2.setStyle(style);
            paint2.setStrokeWidth(gm.N(0.66f));
            paint2.setColor(cmb.p1(0.16f * trimProgress, -1));
            canvas.drawPath(path, paint2);
            textPaint.setAlpha((int) (trimProgress * f5));
            canvas.drawText(trimBubbleText, rectF.centerX() - (measureText / 2.0f), rectF.centerY() - ((textPaint.ascent() + textPaint.descent()) / 2.0f), textPaint);
            canvas.restore();
        }
    }

    public boolean w1() {
        un3 un3Var = this.j1;
        byte b = 0;
        if (un3Var != null && un3Var.r == 4) {
            return false;
        }
        boolean z = this.q6;
        byte b2 = 8;
        yv1 yv1Var = this.F3;
        if (!z) {
            if (this.p6) {
                return true;
            }
            if (this.F0 != null && this.P2 == null && !this.t2 && !c() && (yv1Var == null || !yv1Var.x())) {
                ed b3 = fd.b(this.R, yv1Var != null ? yv1Var.a() : this.G3);
                if (b3 != null) {
                    Editable text = this.F0.getText();
                    String obj = text == null ? "" : text.toString();
                    if (!TextUtils.isEmpty(obj.trim()) && !obj.trim().startsWith("/")) {
                        j2();
                        this.p6 = true;
                        dd ddVar = this.m6;
                        if (ddVar != null) {
                            if (!ddVar.d) {
                                ddVar.d = true;
                                ddVar.a.invalidate();
                            }
                            this.m6.c(true);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
                        int i = this.R;
                        lf2 lf2Var = new lf2((Object) this, (Object) obj, (byte) 10);
                        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                        CharSequence[] charSequenceArr = {spannableStringBuilder};
                        tL_textWithEntities.entities = hs6.d0(i).Y(charSequenceArr, true, true);
                        CharSequence charSequence = charSequenceArr[0];
                        tL_textWithEntities.text = charSequence != null ? charSequence.toString() : "";
                        TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = new TLRPC.TL_messages_composeMessageWithAI();
                        tL_messages_composeMessageWithAI.text = tL_textWithEntities;
                        tL_messages_composeMessageWithAI.proofread = b3.a;
                        tL_messages_composeMessageWithAI.emojify = b3.b;
                        tL_messages_composeMessageWithAI.translate_to_lang = b3.c;
                        TL_aicompose.InputAiComposeTone inputAiComposeTone = b3.d;
                        if (!(inputAiComposeTone instanceof TL_aicompose.inputAiComposeToneSingleUse)) {
                            inputAiComposeTone = fd.d(inputAiComposeTone);
                        }
                        tL_messages_composeMessageWithAI.tone = inputAiComposeTone;
                        this.o6 = ConnectionsManager.getInstance(i).sendRequestTyped(tL_messages_composeMessageWithAI, new kc(b), new f(lf2Var, b2));
                        return true;
                    }
                }
            }
        }
        boolean z2 = this.t2;
        ylb ylbVar = this.L4;
        if (z2 && !z8c.h(this.R).p()) {
            jf9.r0(ylbVar, getContext(), new gx1(this, b2), new gx1(this, (byte) 9));
            return true;
        }
        if (!c()) {
            return x1(true, 0, 0, 0L, true);
        }
        ik.J(this.E3, yv1Var.a(), new vx1(this, (byte) 3), ylbVar);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:187:0x1232  */
    /* JADX WARN: Type inference failed for: r0v24, types: [q02] */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r26v10 */
    /* JADX WARN: Type inference failed for: r26v11 */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r26v6 */
    /* JADX WARN: Type inference failed for: r26v7 */
    /* JADX WARN: Type inference failed for: r26v9 */
    /* JADX WARN: Type inference failed for: r3v47, types: [q02] */
    /* JADX WARN: Type inference failed for: r40v0, types: [byte, int] */
    /* JADX WARN: Type inference failed for: r6v74 */
    /* JADX WARN: Type inference failed for: r6v87 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void w2(int i, boolean z) {
        boolean z2;
        char c;
        zz1 zz1Var;
        int i2;
        char c2;
        float f;
        int i3;
        boolean z3;
        ?? r7;
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
        zz1 zz1Var2;
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
        b02 b02Var = b02.a;
        b02 b02Var2 = b02.b;
        Float valueOf = Float.valueOf(0.0f);
        this.I1 = SystemClock.uptimeMillis() + 1500;
        G2(i);
        Runnable runnable = this.g0;
        if (runnable != null) {
            gm.r(runnable);
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
                this.U6 = i;
                return;
            }
            boolean z8 = this.U6 == 3;
            if (!z8) {
                this.P = false;
                l lVar = this.E2;
                if (lVar != null) {
                    lVar.E.d(1, false, false);
                }
                hs6 d0 = hs6.d0(this.R);
                long j3 = this.G3;
                yv1 yv1Var = this.F3;
                d0.g2(j3, (yv1Var == null || !yv1Var.x4) ? 0L : yv1Var.d(), this.P);
                this.Y1 = 0L;
            }
            a0();
            this.m3 = true;
            jz1 jz1Var = this.V0;
            if (jz1Var != null) {
                jz1Var.setEnabled(false);
            }
            try {
                if (this.g3 == null) {
                    PowerManager.WakeLock newWakeLock = ((PowerManager) org.telegram.messenger.a.b.getSystemService("power")).newWakeLock(536870918, "telegram:audio_record_lock");
                    this.g3 = newWakeLock;
                    newWakeLock.acquire();
                }
            } catch (Exception e) {
                fc4.f(e);
            }
            gm.d2(this.E3);
            uz1 uz1Var = this.P3;
            if (uz1Var != null) {
                uz1Var.z0(0);
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
            wz1 wz1Var = this.b2;
            if (wz1Var != null) {
                wz1Var.c();
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
            wz1 wz1Var2 = this.b2;
            if (wz1Var2 != null) {
                wz1Var2.d(g0());
            }
            this.Z0.setTranslationX(gm.L(20.0f));
            this.Z0.setAlpha(0.0f);
            byte b2 = this.U6;
            SlideTextView slideTextView2 = this.a2;
            if (b2 != 3) {
                slideTextView2.setTranslationX(gm.L(20.0f));
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
            this.D2.f(this.U6 == 3);
            this.a3 = false;
            V0();
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.R0, this.O4, 0.0f), ObjectAnimator.ofFloat(this.R0, this.Q4, 0.0f), ObjectAnimator.ofFloat(this.b2, (Property<wz1, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.b2, (Property<wz1, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.Z0, (Property<zz1, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.Z0, (Property<zz1, Float>) property2, 1.0f));
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
            eq0 eq0Var = this.m0;
            if (eq0Var != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(eq0Var, (Property<eq0, Float>) property4, f4), ObjectAnimator.ofFloat(this.m0, (Property<eq0, Float>) property3, f4), ObjectAnimator.ofFloat(this.m0, (Property<eq0, Float>) property2, f4));
            }
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.playTogether(ObjectAnimator.ofFloat(this.F0, (Property<sy1, Float>) property2, g0() ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.f1, (Property<px1, Float>) property2, 1.0f));
            if (!g0()) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.F0, this.S4, gm.L(20.0f)));
            }
            if (z8) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.i1, (Property<l49, Float>) property2, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.h1, (Property<s09, Float>) property2, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.h1, (Property<s09, Float>) property3, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.h1, (Property<s09, Float>) property4, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.g1, (Property<tec, Float>) property2, 0.0f));
            }
            if (this.z2 != null) {
                animatorSet4.playTogether(n(gm.L(30.0f)), ObjectAnimator.ofFloat(this.z2, (Property<cy1, Float>) property2, 0.0f));
            }
            qmb qmbVar = this.f2;
            if (qmbVar != null) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(qmbVar, this.R4, gm.L(30.0f)), ObjectAnimator.ofFloat(this.f2, this.P4, 0.0f));
                ViewPropertyAnimator viewPropertyAnimator = this.g2;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    this.g2 = null;
                }
                tx1 tx1Var = this.h2;
                this.l2 = 0.0f;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(tx1Var, (Property<tx1, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.h2, (Property<tx1, Float>) property3, 0.5f), ObjectAnimator.ofFloat(this.h2, (Property<tx1, Float>) property4, 0.5f));
            }
            q02 q02Var = this.m7;
            if (q02Var != null) {
                q02Var.e(0, false, true);
            }
            this.j3.playTogether(animatorSet3.setDuration(150L), animatorSet4.setDuration(150L), ObjectAnimator.ofFloat(this.D2, this.k4, 1.0f).setDuration(300L));
            if (!z8) {
                this.j3.playTogether(ObjectAnimator.ofFloat(this.D2, this.l4, 1.0f).setDuration(300L));
            }
            this.j3.addListener(new g(this, z8));
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
                    fc4.f(e2);
                }
            }
            gm.K3(this.E3);
            this.c4 = false;
            if (!this.m3) {
                this.U6 = i;
                return;
            }
            b02 b02Var3 = b02Var;
            this.S.b().I4(this.G3, getThreadMessageId());
            this.m3 = false;
            jz1 jz1Var2 = this.V0;
            if (jz1Var2 != null) {
                jz1Var2.setEnabled(true);
            }
            AnimatorSet animatorSet5 = this.j3;
            if (animatorSet5 != null) {
                z2 = animatorSet5.isRunning();
                zx1 zx1Var = this.c1;
                if (zx1Var != null) {
                    zx1Var.setScaleX(1.0f);
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
            sy1 sy1Var = this.F0;
            if (sy1Var != null) {
                sy1Var.setVisibility(0);
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
                    r(z);
                    SlideTextView slideTextView3 = this.a2;
                    if (slideTextView3 != null) {
                        slideTextView3.setEnabled(false);
                    }
                    if (this.d1) {
                        l49 l49Var = this.i1;
                        if (l49Var != null) {
                            l49Var.setVisibility(8);
                        }
                        px1 px1Var = this.f1;
                        if (px1Var != null) {
                            px1Var.setAlpha(1.0f);
                            this.f1.setVisibility(0);
                        }
                        s09 s09Var = this.h1;
                        if (s09Var != null) {
                            s09Var.setProgress(0.0f);
                            this.h1.i();
                        }
                        f3 = 1.0f;
                        c7 = 7;
                    } else {
                        tec tecVar = this.g1;
                        if (tecVar != null) {
                            tecVar.setVisibility(8);
                            V0();
                        }
                        px1 px1Var2 = this.f1;
                        if (px1Var2 != null) {
                            i8 = 0;
                            px1Var2.setVisibility(0);
                            f3 = 1.0f;
                            c7 = 7;
                            this.f1.setAlpha(1.0f);
                        } else {
                            f3 = 1.0f;
                            i8 = 0;
                            c7 = 7;
                        }
                        l49 l49Var2 = this.i1;
                        if (l49Var2 != null) {
                            l49Var2.setVisibility(i8);
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
                    s09 s09Var2 = this.h1;
                    if (s09Var2 != null) {
                        s09Var2.setAlpha(0.0f);
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
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(viewGroup.getMeasuredWidth() - (this.P2 == null ? b10.c(44.0f, this.K0.l(), 0) : 0), gm.L(44.0f));
                        layoutParams2.gravity = 80;
                        layoutParams2.leftMargin = gm.L(7.0f);
                        layoutParams2.rightMargin = gm.L(7.0f);
                        this.c2.addView(this.f1, layoutParams2);
                        this.g1.setVisibility(8);
                    }
                    V0();
                    AnimatorSet animatorSet7 = new AnimatorSet();
                    if (z) {
                        this.i1.setAllowDraw(false);
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new bx1(this, (byte) 6));
                        ofFloat.addListener(new h(this));
                        b02 b02Var4 = b02Var3;
                        ofFloat.setDuration(this.d1 ? 490L : this.K1 ? 560L : 580L);
                        if (this.K1 && !this.d1) {
                            ofFloat.setInterpolator(new LinearInterpolator());
                        }
                        AnimatorSet animatorSet8 = new AnimatorSet();
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.b2, (Property<wz1, Float>) property4, 0.0f);
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.b2, (Property<wz1, Float>) property3, 0.0f);
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.Z0, (Property<zz1, Float>) property2, 0.0f);
                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.Z0, (Property<zz1, Float>) property, -gm.L(20.0f));
                        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.a2, (Property<SlideTextView, Float>) property2, 0.0f);
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.h1, (Property<s09, Float>) property2, 1.0f);
                        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.h1, (Property<s09, Float>) property4, 1.0f);
                        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.h1, (Property<s09, Float>) property3, 1.0f);
                        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this.R0, this.O4, 0.0f);
                        ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(this.R0, this.Q4, 0.0f);
                        ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(this.F0, (Property<sy1, Float>) property2, 0.0f);
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
                        s09 s09Var3 = this.h1;
                        if (s09Var3 != null) {
                            s09Var3.setAlpha(0.0f);
                            this.h1.setScaleX(0.0f);
                            this.h1.setScaleY(0.0f);
                        }
                        if (this.c1 != null) {
                            i9 = 1;
                            animatorSet8.playTogether(ObjectAnimator.ofFloat(this.a1, (Property<a, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.a1, (Property<a, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.a1, (Property<a, Float>) property4, 1.0f));
                            zx1 zx1Var2 = this.c1;
                            if (this.d1) {
                                b02Var4 = b02Var2;
                            }
                            zx1Var2.j(b02Var4, true);
                        } else {
                            i9 = 1;
                        }
                        eq0 eq0Var2 = this.m0;
                        if (eq0Var2 != null) {
                            float[] fArr = new float[i9];
                            fArr[0] = 0.0f;
                            ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(eq0Var2, (Property<eq0, Float>) property2, fArr);
                            eq0 eq0Var3 = this.m0;
                            float[] fArr2 = new float[i9];
                            fArr2[0] = 0.0f;
                            ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(eq0Var3, (Property<eq0, Float>) property3, fArr2);
                            eq0 eq0Var4 = this.m0;
                            float[] fArr3 = new float[i9];
                            fArr3[0] = 0.0f;
                            ObjectAnimator ofFloat15 = ObjectAnimator.ofFloat(eq0Var4, (Property<eq0, Float>) property4, fArr3);
                            Animator[] animatorArr2 = new Animator[3];
                            animatorArr2[0] = ofFloat13;
                            animatorArr2[i9] = ofFloat14;
                            animatorArr2[2] = ofFloat15;
                            animatorSet8.playTogether(animatorArr2);
                        }
                        animatorSet8.addListener(new nx1(this, b));
                        boolean z9 = this.K1 && !this.d1;
                        animatorSet8.setDuration(z9 ? 120L : 150L);
                        animatorSet8.setStartDelay(z9 ? 0L : 150L);
                        if (this.d1) {
                            this.g1.setAlpha(0.0f);
                            c9 = 1;
                            c10 = 0;
                            animatorSet7.playTogether(ObjectAnimator.ofFloat(this.g1, (Property<tec, Float>) property2, 1.0f));
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
                        this.j3.addListener(new i8(this, viewGroup, layoutParams, (byte) 3));
                    } else {
                        d0();
                        this.k4.set(this.D2, Float.valueOf(1.0f));
                        this.D2.setTransformToSeekbar(1.0f);
                        if (!this.d1) {
                            float f5 = this.e5;
                            if (f5 != 0.0f && this.i1 != null) {
                                float interpolation = d53.j.getInterpolation(Math.max(0.0f, ((f5 - 0.38f) - 0.25f) / 0.37f));
                                l49 l49Var3 = this.i1;
                                if (this.K1) {
                                    interpolation = 1.0f;
                                }
                                l49Var3.setAlpha(interpolation);
                                this.i1.invalidate();
                            }
                        }
                        this.b2.setScaleY(0.0f);
                        this.b2.setScaleX(0.0f);
                        this.Z0.setAlpha(0.0f);
                        this.Z0.setTranslationX(-gm.L(20.0f));
                        this.a2.setAlpha(0.0f);
                        this.h1.setAlpha(1.0f);
                        this.h1.setScaleY(1.0f);
                        this.h1.setScaleX(1.0f);
                        this.O4.set(this.R0, valueOf);
                        this.Q4.set(this.R0, valueOf);
                        this.F0.setAlpha(0.0f);
                        zx1 zx1Var3 = this.c1;
                        if (zx1Var3 != null) {
                            if (this.d1) {
                                b02Var3 = b02Var2;
                            }
                            zx1Var3.j(b02Var3, z);
                            this.a1.setAlpha(1.0f);
                            this.a1.setScaleX(1.0f);
                            this.a1.setScaleY(1.0f);
                        }
                        eq0 eq0Var5 = this.m0;
                        if (eq0Var5 != null) {
                            eq0Var5.setAlpha(0.0f);
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
                        q2();
                        V0();
                    }
                } else {
                    b02 b02Var5 = b02Var3;
                    if (i == 2 || i == 5) {
                        zx1 zx1Var4 = this.c1;
                        if (zx1Var4 != null) {
                            zx1Var4.setVisibility(0);
                        }
                        this.a3 = true;
                        V0();
                        ValueAnimator b0 = b0();
                        AnimatorSet animatorSet10 = new AnimatorSet();
                        if (b0 == null) {
                            c3 = 0;
                            valueAnimator = b0;
                            i4 = 1;
                            animatorSet10.playTogether(ObjectAnimator.ofFloat(this.R0, this.O4, 1.0f), ObjectAnimator.ofFloat(this.R0, this.Q4, this.B0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.b2, (Property<wz1, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.b2, (Property<wz1, Float>) property3, 0.0f));
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
                            ofFloat16.setInterpolator(d53.g);
                            AnimatorSet animatorSet11 = this.j3;
                            Animator[] animatorArr4 = new Animator[i10];
                            animatorArr4[c3] = ofFloat16;
                            animatorSet11.playTogether(animatorArr4);
                            this.E2.e();
                        }
                        eq0 eq0Var6 = this.m0;
                        if (eq0Var6 != null) {
                            float[] fArr5 = new float[i10];
                            fArr5[c3] = 1.0f;
                            ObjectAnimator ofFloat17 = ObjectAnimator.ofFloat(eq0Var6, (Property<eq0, Float>) property4, fArr5);
                            eq0 eq0Var7 = this.m0;
                            float[] fArr6 = new float[i10];
                            fArr6[c3] = 1.0f;
                            ObjectAnimator ofFloat18 = ObjectAnimator.ofFloat(eq0Var7, (Property<eq0, Float>) property3, fArr6);
                            eq0 eq0Var8 = this.m0;
                            float[] fArr7 = new float[i10];
                            fArr7[c3] = 1.0f;
                            ObjectAnimator ofFloat19 = ObjectAnimator.ofFloat(eq0Var8, (Property<eq0, Float>) property2, fArr7);
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
                            zz1 zz1Var3 = this.Z0;
                            float[] fArr9 = new float[i10];
                            fArr9[c3] = 0.0f;
                            ObjectAnimator ofFloat21 = ObjectAnimator.ofFloat(zz1Var3, (Property<zz1, Float>) property2, fArr9);
                            zz1 zz1Var4 = this.Z0;
                            float[] fArr10 = new float[i10];
                            fArr10[c3] = -gm.L(20.0f);
                            ObjectAnimator ofFloat22 = ObjectAnimator.ofFloat(zz1Var4, (Property<zz1, Float>) property, fArr10);
                            SlideTextView slideTextView6 = this.a2;
                            float[] fArr11 = new float[i10];
                            fArr11[c3] = 0.0f;
                            ObjectAnimator ofFloat23 = ObjectAnimator.ofFloat(slideTextView6, (Property<SlideTextView, Float>) property2, fArr11);
                            SlideTextView slideTextView7 = this.a2;
                            float[] fArr12 = new float[1];
                            fArr12[c3] = -gm.L(20.0f);
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
                            tx1 tx1Var2 = this.h2;
                            if (tx1Var2 != null && tx1Var2.getVisibility() == 0) {
                                this.h2.setScaleX(0.5f);
                                this.h2.setScaleY(0.5f);
                            }
                            tx1 tx1Var3 = this.n2;
                            if (tx1Var3 != null && tx1Var3.getVisibility() == 0) {
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
                                tx1 tx1Var4 = this.h2;
                                this.l2 = 1.0f;
                                r262 = true;
                                animatorSet10.playTogether(ObjectAnimator.ofFloat(tx1Var4, (Property<tx1, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.h2, (Property<tx1, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.h2, (Property<tx1, Float>) property4, 1.0f));
                            } else {
                                r262 = true;
                                z5 = false;
                            }
                            q02 q02Var2 = this.m7;
                            int i11 = r262;
                            boolean z10 = z5;
                            if (q02Var2 != null) {
                                q02Var2.e(z10 ? 1 : 0, z10, i11);
                            }
                            tx1 tx1Var5 = this.n2;
                            if (tx1Var5 != null) {
                                float[] fArr13 = new float[i11];
                                fArr13[z10 ? 1 : 0] = 1.0f;
                                ObjectAnimator ofFloat25 = ObjectAnimator.ofFloat(tx1Var5, (Property<tx1, Float>) property3, fArr13);
                                tx1 tx1Var6 = this.n2;
                                float[] fArr14 = new float[i11];
                                fArr14[z10 ? 1 : 0] = 1.0f;
                                ObjectAnimator ofFloat26 = ObjectAnimator.ofFloat(tx1Var6, (Property<tx1, Float>) property4, fArr14);
                                char c11 = z10 ? 1 : 0;
                                Animator[] animatorArr8 = new Animator[2];
                                animatorArr8[c11] = ofFloat25;
                                animatorArr8[i11] = ofFloat26;
                                animatorSet10.playTogether(animatorArr8);
                                c6 = c11;
                            } else {
                                c6 = z10 ? 1 : 0;
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
                                zx1 zx1Var5 = this.c1;
                                if (this.d1) {
                                    b02Var5 = b02Var2;
                                }
                                zx1Var5.j(b02Var5, i11);
                            }
                            cy1 cy1Var = this.z2;
                            if (cy1Var != null) {
                                float[] fArr18 = new float[i11];
                                fArr18[0] = 1.0f;
                                ObjectAnimator ofFloat30 = ObjectAnimator.ofFloat(cy1Var, (Property<cy1, Float>) property2, fArr18);
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
                                tx1 tx1Var7 = this.h2;
                                this.l2 = 1.0f;
                                animatorSet13.playTogether(ObjectAnimator.ofFloat(tx1Var7, (Property<tx1, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.h2, (Property<tx1, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.h2, (Property<tx1, Float>) property4, 1.0f));
                            } else {
                                r26 = true;
                                z4 = false;
                            }
                            q02 q02Var3 = this.m7;
                            int i12 = r26;
                            boolean z11 = z4;
                            if (q02Var3 != null) {
                                q02Var3.e(z11 ? 1 : 0, z11, i12);
                            }
                            cy1 cy1Var2 = this.z2;
                            if (cy1Var2 != null) {
                                float[] fArr19 = new float[i12];
                                fArr19[z11 ? 1 : 0] = 1.0f;
                                ObjectAnimator ofFloat31 = ObjectAnimator.ofFloat(cy1Var2, (Property<cy1, Float>) property2, fArr19);
                                ValueAnimator n2 = n(0.0f);
                                Animator[] animatorArr13 = new Animator[2];
                                animatorArr13[z11 ? 1 : 0] = ofFloat31;
                                animatorArr13[i12] = n2;
                                animatorSet13.playTogether(animatorArr13);
                            }
                            animatorSet13.setDuration(150L);
                            j = 110;
                            animatorSet13.setStartDelay(110L);
                            animatorSet13.addListener(new nx1(this, (byte) 11));
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
                        if (valueAnimator == null || (zz1Var2 = this.Z0) == null) {
                            i5 = 1;
                            c4 = 0;
                        } else {
                            zz1Var2.animate().cancel();
                            this.Z0.setPivotX(0.0f);
                            this.Z0.setPivotY(r5.getHeight() / 2.0f);
                            AnimatorSet animatorSet15 = new AnimatorSet();
                            i5 = 1;
                            c4 = 0;
                            ObjectAnimator ofFloat32 = ObjectAnimator.ofFloat(this.Z0, (Property<zz1, Float>) property2, 0.0f);
                            zz1 zz1Var5 = this.Z0;
                            animatorSet15.playTogether(ofFloat32, ObjectAnimator.ofFloat(zz1Var5, (Property<zz1, Float>) property, zz1Var5.getTranslationX() - gm.L(6.0f)), ObjectAnimator.ofFloat(this.Z0, (Property<zz1, Float>) property3, 0.94f), ObjectAnimator.ofFloat(this.Z0, (Property<zz1, Float>) property4, 0.94f));
                            animatorSet15.setDuration(140L);
                            animatorSet15.setInterpolator(d53.g);
                            this.j3.playTogether(animatorSet15);
                        }
                        this.H = 0.0f;
                        u2();
                        sy1 sy1Var2 = this.F0;
                        float[] fArr20 = new float[i5];
                        fArr20[c4] = 1.0f;
                        ObjectAnimator ofFloat33 = ObjectAnimator.ofFloat(sy1Var2, (Property<sy1, Float>) property2, fArr20);
                        ofFloat33.setStartDelay(this.D1 ? 110L : this.s == 1.0f ? 300L : 700L);
                        ofFloat33.setDuration(200L);
                        if (valueAnimator != null) {
                            ofFloat33.setStartDelay((long) Math.max(300.0f, this.L5 - 120.0f));
                            ofFloat33.setDuration(320L);
                            ofFloat33.setInterpolator(d53.g);
                            i6 = 1;
                            c5 = 0;
                            this.j3.playTogether(valueAnimator);
                            AnimatorSet K2 = K2();
                            if (K2 != null) {
                                this.j3.playTogether(K2);
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
                            duration2.setInterpolator(d53.j);
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
                        wz1 wz1Var3 = this.b2;
                        if (wz1Var3 != null) {
                            if (this.D1) {
                                wz1Var3.setScaleX(0.0f);
                                this.b2.setScaleY(0.0f);
                            } else if (valueAnimator == null) {
                                wz1Var3.b();
                            }
                        }
                    } else {
                        zx1 zx1Var6 = this.c1;
                        if (zx1Var6 != null) {
                            zx1Var6.setVisibility(0);
                        }
                        AnimatorSet animatorSet18 = new AnimatorSet();
                        animatorSet18.playTogether(ObjectAnimator.ofFloat(this.R0, this.O4, 1.0f), ObjectAnimator.ofFloat(this.R0, this.Q4, this.B0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.b2, (Property<wz1, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.b2, (Property<wz1, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.a1, (Property<a, Float>) property2, 1.0f));
                        l lVar6 = this.E2;
                        if (lVar6 != null) {
                            animatorSet18.playTogether(ObjectAnimator.ofFloat(lVar6, (Property<l, Float>) property2, 0.0f));
                            this.E2.e();
                        }
                        eq0 eq0Var9 = this.m0;
                        if (eq0Var9 != null) {
                            f2 = 1.0f;
                            animatorSet18.playTogether(ObjectAnimator.ofFloat(eq0Var9, (Property<eq0, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.m0, (Property<eq0, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.m0, (Property<eq0, Float>) property2, 1.0f));
                        } else {
                            f2 = 1.0f;
                        }
                        zx1 zx1Var7 = this.c1;
                        if (zx1Var7 != null) {
                            zx1Var7.setScaleX(f2);
                            this.c1.setScaleY(f2);
                            animatorSet18.playTogether(ObjectAnimator.ofFloat(this.a1, (Property<a, Float>) property2, f2));
                            zx1 zx1Var8 = this.c1;
                            if (this.d1) {
                                b02Var5 = b02Var2;
                            }
                            zx1Var8.j(b02Var5, true);
                        }
                        if (this.f2 != null) {
                            ViewPropertyAnimator viewPropertyAnimator4 = this.g2;
                            if (viewPropertyAnimator4 != null) {
                                viewPropertyAnimator4.cancel();
                                this.g2 = null;
                            }
                            this.y = 0.0f;
                            l2();
                            i7 = 1;
                            r12 = 0;
                            animatorSet18.playTogether(ObjectAnimator.ofFloat(this.f2, this.P4, 1.0f));
                            tx1 tx1Var8 = this.h2;
                            this.l2 = 1.0f;
                            animatorSet18.playTogether(ObjectAnimator.ofFloat(tx1Var8, (Property<tx1, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.h2, (Property<tx1, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.h2, (Property<tx1, Float>) property4, 1.0f));
                        } else {
                            i7 = 1;
                            r12 = 0;
                        }
                        ?? r3 = this.m7;
                        if (r3 != 0) {
                            r3.e(r12, r12, i7);
                        }
                        cy1 cy1Var3 = this.z2;
                        if (cy1Var3 != null) {
                            float[] fArr24 = new float[i7];
                            fArr24[r12] = 1.0f;
                            ObjectAnimator ofFloat35 = ObjectAnimator.ofFloat(cy1Var3, (Property<cy1, Float>) property2, fArr24);
                            ValueAnimator n3 = n(0.0f);
                            Animator[] animatorArr17 = new Animator[2];
                            animatorArr17[r12] = ofFloat35;
                            animatorArr17[i7] = n3;
                            animatorSet18.playTogether(animatorArr17);
                        }
                        animatorSet18.setDuration(150L);
                        animatorSet18.setStartDelay(200L);
                        AnimatorSet animatorSet19 = new AnimatorSet();
                        zz1 zz1Var6 = this.Z0;
                        float[] fArr25 = new float[i7];
                        fArr25[r12] = 0.0f;
                        ObjectAnimator ofFloat36 = ObjectAnimator.ofFloat(zz1Var6, (Property<zz1, Float>) property2, fArr25);
                        zz1 zz1Var7 = this.Z0;
                        float[] fArr26 = new float[i7];
                        fArr26[r12] = gm.L(40.0f);
                        ObjectAnimator ofFloat37 = ObjectAnimator.ofFloat(zz1Var7, (Property<zz1, Float>) property, fArr26);
                        SlideTextView slideTextView8 = this.a2;
                        float[] fArr27 = new float[i7];
                        fArr27[r12] = 0.0f;
                        ObjectAnimator ofFloat38 = ObjectAnimator.ofFloat(slideTextView8, (Property<SlideTextView, Float>) property2, fArr27);
                        SlideTextView slideTextView9 = this.a2;
                        float[] fArr28 = new float[i7];
                        fArr28[r12] = gm.L(40.0f);
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
                        u2();
                        ObjectAnimator ofFloat41 = ObjectAnimator.ofFloat(this.F0, (Property<sy1, Float>) property2, 1.0f);
                        ofFloat41.setStartDelay(this.s == 1.0f ? 150L : 450L);
                        ofFloat41.setDuration(200L);
                        this.j3.playTogether(animatorSet18, animatorSet19, ofFloat41, ofFloat40);
                    }
                }
                this.j3.addListener(new j(this, i));
                this.j3.start();
                zz1Var = this.Z0;
                if (zz1Var != null) {
                    zz1Var.b();
                }
            }
            float f6 = 0.5f;
            zx1 zx1Var9 = this.c1;
            if (zx1Var9 != null) {
                zx1Var9.setVisibility(0);
            }
            AnimatorSet animatorSet20 = this.j3;
            ObjectAnimator ofFloat42 = ObjectAnimator.ofFloat(this.R0, this.O4, 1.0f);
            rx1 rx1Var = this.R0;
            ox1 ox1Var = this.Q4;
            if (!this.B0) {
                f6 = 1.0f;
            }
            ObjectAnimator ofFloat43 = ObjectAnimator.ofFloat(rx1Var, ox1Var, f6);
            ObjectAnimator ofFloat44 = ObjectAnimator.ofFloat(this.b2, (Property<wz1, Float>) property4, 0.0f);
            ObjectAnimator ofFloat45 = ObjectAnimator.ofFloat(this.b2, (Property<wz1, Float>) property3, 0.0f);
            ObjectAnimator ofFloat46 = ObjectAnimator.ofFloat(this.D2, this.k4, 0.0f);
            ObjectAnimator ofFloat47 = ObjectAnimator.ofFloat(this.D2, this.l4, 0.0f);
            ObjectAnimator ofFloat48 = ObjectAnimator.ofFloat(this.a1, (Property<a, Float>) property2, 1.0f);
            ObjectAnimator ofFloat49 = ObjectAnimator.ofFloat(this.Z0, (Property<zz1, Float>) property2, 0.0f);
            ObjectAnimator ofFloat50 = ObjectAnimator.ofFloat(this.a1, (Property<a, Float>) property2, 1.0f);
            ObjectAnimator ofFloat51 = ObjectAnimator.ofFloat(this.F0, (Property<sy1, Float>) property2, 1.0f);
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
            eq0 eq0Var10 = this.m0;
            if (eq0Var10 != null) {
                AnimatorSet animatorSet21 = this.j3;
                float[] fArr30 = new float[i2];
                f = 1.0f;
                fArr30[c2] = 1.0f;
                ObjectAnimator ofFloat54 = ObjectAnimator.ofFloat(eq0Var10, (Property<eq0, Float>) property4, fArr30);
                eq0 eq0Var11 = this.m0;
                float[] fArr31 = new float[i2];
                fArr31[c2] = 1.0f;
                ObjectAnimator ofFloat55 = ObjectAnimator.ofFloat(eq0Var11, (Property<eq0, Float>) property3, fArr31);
                eq0 eq0Var12 = this.m0;
                float[] fArr32 = new float[i2];
                fArr32[c2] = 1.0f;
                ObjectAnimator ofFloat56 = ObjectAnimator.ofFloat(eq0Var12, (Property<eq0, Float>) property2, fArr32);
                Animator[] animatorArr20 = new Animator[3];
                animatorArr20[c2] = ofFloat54;
                animatorArr20[i2] = ofFloat55;
                animatorArr20[2] = ofFloat56;
                animatorSet21.playTogether(animatorArr20);
            } else {
                f = 1.0f;
            }
            zx1 zx1Var10 = this.c1;
            if (zx1Var10 != null) {
                zx1Var10.setScaleX(f);
                this.c1.setScaleY(f);
                i3 = 1;
                this.j3.playTogether(ObjectAnimator.ofFloat(this.a1, (Property<a, Float>) property2, f));
                this.c1.j(this.d1 ? b02Var2 : b02Var3, true);
            } else {
                i3 = 1;
            }
            if (this.z2 != null) {
                AnimatorSet animatorSet22 = this.j3;
                ValueAnimator n4 = n(0.0f);
                cy1 cy1Var4 = this.z2;
                float[] fArr33 = new float[i3];
                fArr33[0] = 1.0f;
                ObjectAnimator ofFloat57 = ObjectAnimator.ofFloat(cy1Var4, (Property<cy1, Float>) property2, fArr33);
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
                r7 = 0;
                this.j3.playTogether(ObjectAnimator.ofFloat(this.f2, this.R4, 0.0f), ObjectAnimator.ofFloat(this.f2, this.P4, 1.0f));
                AnimatorSet animatorSet23 = this.j3;
                tx1 tx1Var9 = this.h2;
                this.l2 = 1.0f;
                animatorSet23.playTogether(ObjectAnimator.ofFloat(tx1Var9, (Property<tx1, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.h2, (Property<tx1, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.h2, (Property<tx1, Float>) property4, 1.0f));
            } else {
                z3 = true;
                r7 = 0;
            }
            ?? r0 = this.m7;
            if (r0 != 0) {
                r0.e(r7, r7, z3);
            }
            this.a3 = z3;
            V0();
            this.j3.setDuration(150L);
            this.j3.addListener(new j(this, i));
            this.j3.start();
            zz1Var = this.Z0;
            if (zz1Var != null) {
            }
        }
        this.P3.a();
        A2(true);
        this.U6 = i;
        p0();
        if (this.l1) {
            s2(this.T6);
        }
    }

    public final boolean x(boolean z) {
        return z || this.R3 != null || U0() || F2();
    }

    public final cz1 x0(k47 k47Var, boolean z) {
        cz1 cz1Var = new cz1(k47Var.K1, k47Var.k, true, true);
        if (z) {
            sy1 sy1Var = this.F0;
            CharSequence[] charSequenceArr = {sy1Var == null ? "" : sy1Var.getTextToUse()};
            ArrayList Y = hs6.d0(this.R).Y(charSequenceArr, true, true);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceArr[0].toString());
            k47.b(spannableStringBuilder, Y, true, true, false, true, 0);
            cz1Var.z = k47.A5(gw3.m(spannableStringBuilder, cmb.n2.getFontMetricsInt(), false, null, 0), Y, cmb.n2.getFontMetricsInt(), false);
        }
        return cz1Var;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v37 org.telegram.ui.Components.ChatActivityEnterView, still in use, count: 2, list:
          (r11v37 org.telegram.ui.Components.ChatActivityEnterView) from 0x00ee: INVOKE 
          (r11v37 org.telegram.ui.Components.ChatActivityEnterView)
          (wrap:tw1:0x00ea: CONSTRUCTOR 
          (r37v0 'this' org.telegram.ui.Components.ChatActivityEnterView A[IMMUTABLE_TYPE, THIS])
          (r38v0 boolean)
          (r39v0 int)
          (r40v0 int)
          (r41v0 long)
         A[MD:(org.telegram.ui.Components.ChatActivityEnterView, boolean, int, int, long):void (m), WRAPPED] (LINE:235) call: tw1.<init>(org.telegram.ui.Components.ChatActivityEnterView, boolean, int, int, long):void type: CONSTRUCTOR)
         VIRTUAL call: org.telegram.ui.Components.ChatActivityEnterView.X1(java.lang.Runnable):boolean A[MD:(java.lang.Runnable):boolean (m), WRAPPED] (LINE:239)
          (r11v37 org.telegram.ui.Components.ChatActivityEnterView) from 0x00f7: PHI (r11v1 org.telegram.ui.Components.ChatActivityEnterView) = (r11v0 org.telegram.ui.Components.ChatActivityEnterView), (r11v37 org.telegram.ui.Components.ChatActivityEnterView) binds: [B:350:0x00f6, B:60:0x00f2] A[DONT_GENERATE, DONT_INLINE]
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
    /* JADX WARN: Removed duplicated region for block: B:263:0x066d A[LOOP:1: B:202:0x0404->B:263:0x066d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0606 A[EDGE_INSN: B:264:0x0606->B:265:0x0606 BREAK  A[LOOP:1: B:202:0x0404->B:263:0x066d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x054d  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v72 */
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
    /* JADX WARN: Type inference failed for: r3v9, types: [k47, org.telegram.tgnet.TLRPC$WebPage] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean x1(final boolean r38, final int r39, final int r40, long r41, boolean r43) {
        /*
            Method dump skipped, instructions count: 1692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.x1(boolean, int, int, long, boolean):boolean");
    }

    public final void x2() {
        int F0 = F0(cmb.Zf);
        int F02 = F0(cmb.Ie);
        int F03 = F0(cmb.Uf);
        s09 s09Var = this.h1;
        if (s09Var != null) {
            s09Var.h(F0, "Cup Red");
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

    public final boolean y() {
        eq0 eq0Var = this.m0;
        return eq0Var != null && eq0Var.w;
    }

    public final void y0() {
        if (this.n6 != null || this.F0 == null) {
            return;
        }
        lo3 lo3Var = new lo3(this.F0);
        this.n6 = lo3Var;
        lo3Var.C = true;
        lo3Var.D = true;
        lo3Var.F = 0.0f;
        lo3Var.E = gm.L(5.0f);
        va2 C0 = C0();
        if (C0 != null) {
            if (this.u6 == null) {
                this.u6 = new zn3();
            }
            if (C0.h == null) {
                C0.h = new g11((Object) this, (Object) C0, (byte) 20);
            }
        }
        int max = Math.max(this.F0.getWidth(), gm.q.x);
        lo3 lo3Var2 = this.n6;
        int L = gm.L(160.0f);
        lo3Var2.getClass();
        lta ltaVar = lo3Var2.c;
        if (max <= 0 || L <= 0) {
            return;
        }
        int L2 = (gm.L(4.0f) + max) * L;
        int[] iArr = lo3Var2.G;
        if (iArr == null || iArr.length < L2) {
            try {
                lo3Var2.G = new int[L2];
            } catch (Throwable unused) {
            }
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(gm.L(24.0f), gm.L(12.0f), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawColor(-16777216);
            int i = lo3Var2.w;
            int i2 = lo3Var2.x;
            lo3Var2.w = 0;
            lo3Var2.x = createBitmap.getHeight();
            int f = lo3Var2.f(64, createBitmap, true);
            for (int i3 = 0; i3 < f; i3++) {
                float[] fArr = lo3Var2.i;
                int i4 = i3 * 3;
                ltaVar.g(fArr[i4], fArr[i4 + 1], 1.0f, -1.0f, 0.05f, 0.0f);
            }
            ltaVar.b(canvas, 1.0f);
            ltaVar.a();
            lo3Var2.k = 0;
            lo3Var2.w = i;
            lo3Var2.x = i2;
            createBitmap.recycle();
        } catch (Throwable unused2) {
        }
    }

    public final void y1(boolean z, boolean z2) {
        z1(z, z2, false);
    }

    public final void y2() {
        mi9 mi9Var = this.s2;
        if (mi9Var != null) {
            boolean z = this.t2;
            boolean z2 = this.u2 != null && this.P2 == null;
            this.t2 = z2;
            by1 by1Var = this.K0;
            ImageView imageView = this.S0;
            rx1 rx1Var = this.R0;
            if (z2) {
                mi9Var.setResourcesProvider(this.L4);
                this.s2.set(this.u2);
                this.s2.setVisibility(0);
                sy1 sy1Var = this.F0;
                if (sy1Var != null) {
                    sy1Var.setVisibility(8);
                }
                rx1Var.setVisibility(8);
                imageView.setVisibility(0);
                by1Var.setLocked(!z8c.h(this.R).p());
            } else {
                mi9Var.setVisibility(8);
                sy1 sy1Var2 = this.F0;
                if (sy1Var2 != null) {
                    sy1Var2.setVisibility(0);
                }
                rx1Var.setVisibility(0);
                imageView.setVisibility(8);
                by1Var.setLocked(false);
            }
            p2();
            if (z != this.t2) {
                M(true);
            }
        }
    }

    public final boolean z() {
        pz1 A = A();
        return (TextUtils.equals(A.a, this.S2.a) && hs6.M(this.S2.b, A.b)) ? false : true;
    }

    public final un3 z0() {
        un3 un3Var = this.j1;
        if (un3Var != null) {
            return un3Var;
        }
        un3 un3Var2 = new un3(getContext(), new d(this));
        this.j1 = un3Var2;
        return un3Var2;
    }

    public final void z1(boolean z, boolean z2, boolean z3) {
        if ((this.z3 != z || this.A3 != z2) && this.V0 != null) {
            if (this.X0 && !z3) {
                this.w4 = true;
                J0(false);
            } else if (z3) {
                k1();
            }
        }
        this.y3 = true;
        this.z3 = z;
        this.A3 = z2;
        jz1 jz1Var = this.V0;
        if (jz1Var != null) {
            jz1Var.H(true, z, z2, true);
        }
        H1(false, !this.Z2);
    }

    public final void z2(boolean z) {
        boolean z2;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean y = pg3.y(this.G3);
        ImageView imageView = this.y2;
        if (y) {
            TLRPC.Chat L0 = oc7.r1(this.S.a).L0(Long.valueOf(-this.G3));
            this.W2 = oc7.r1(this.R).W3.getBoolean("silent_" + this.G3, false);
            z2 = sd2.T(L0) && (L0.creator || ((tL_chatAdminRights = L0.admin_rights) != null && tL_chatAdminRights.post_messages)) && !L0.megagroup;
            this.X2 = z2;
            if (imageView != null) {
                v43 v43Var = this.f0;
                if (v43Var == null) {
                    v43Var = new v43(getContext(), R.drawable.input_notify_on, cmb.Ml);
                    this.f0 = v43Var;
                }
                v43Var.a(this.W2, false);
                imageView.setImageDrawable(this.f0);
            } else {
                z2 = false;
            }
            qmb qmbVar = this.f2;
            if (qmbVar != null) {
                s2(qmbVar.getVisibility() == 0 ? 1 : 0);
            }
        } else {
            z2 = false;
        }
        boolean z3 = (this.P3 == null || c() || !this.P3.b0()) ? false : true;
        boolean z4 = (!z3 || this.B2 || this.v3) ? false : true;
        if (z4) {
            e0();
        }
        cy1 cy1Var = this.z2;
        if (cy1Var != null) {
            if ((cy1Var.getTag() != null && z4) || (this.z2.getTag() == null && !z4)) {
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
            cy1 cy1Var2 = this.z2;
            if (cy1Var2 != null) {
                if (z4) {
                    cy1Var2.setVisibility(0);
                }
                this.z2.setPivotX(gm.L(24.0f));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.C2 = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.z2, (Property<cy1, Float>) View.ALPHA, z4 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.z2, (Property<cy1, Float>) View.SCALE_X, z4 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(this.z2, (Property<cy1, Float>) View.SCALE_Y, z4 ? 1.0f : 0.1f));
                this.C2.setDuration(180L);
                this.C2.addListener(new ey1(this, z4, (byte) 3));
                this.C2.start();
                return;
            }
            return;
        }
        cy1 cy1Var3 = this.z2;
        if (cy1Var3 == null) {
            if (imageView != null) {
                imageView.setVisibility(z2 ? 0 : 8);
                return;
            }
            return;
        }
        cy1Var3.setVisibility(z4 ? 0 : 8);
        this.z2.setAlpha(z4 ? 1.0f : 0.0f);
        this.z2.setScaleX(z4 ? 1.0f : 0.1f);
        this.z2.setScaleY(z4 ? 1.0f : 0.1f);
        if (imageView != null) {
            imageView.setVisibility((!z2 || this.z2.getVisibility() == 0) ? 8 : 0);
        }
        this.z2.setTranslationX(0.0f);
    }

    @Override // ddb
    public qu3 getEditField() {
        return this.F0;
    }

    @Override // ddb
    public yv1 getParentFragment() {
        return this.F3;
    }

    public void B0(Menu menu) {
    }

    public void V0() {
    }

    public void c1(float f) {
    }

    @Override // g94
    public final void V(float f, int i) {
    }

    public void e1(int i, int i2) {
    }
}
