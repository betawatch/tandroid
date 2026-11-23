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
import org.telegram.tgnet.tl.TL_aicompose;
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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class ChatActivityEnterView extends FrameLayout implements org.telegram.messenger.fs, bu0, gw0, xw0, te.b, org.telegram.ui.ActionBar.c6 {
    public static final /* synthetic */ int s7 = 0;
    public boolean A0;
    public float A1;
    public je A2;
    public boolean A3;
    public final bg A4;
    public nh0 A5;
    public boolean A6;
    public boolean B0;
    public int B1;
    public boolean B2;
    public int B3;
    public final h2.f B4;
    public nh0 B5;
    public float B6;
    public final HashMap C0;
    public final SparseArray C1;
    public AnimatorSet C2;
    public boolean C3;
    public final Paint C4;
    public ValueAnimator C5;
    public ValueAnimator C6;
    public boolean D0;
    public boolean D1;
    public RecordCircle D2;
    public final int[] D3;
    public Drawable D4;
    public float D5;
    public ValueAnimator D6;
    public float E;
    public boolean E0;
    public boolean E1;
    public qg E2;
    public final Activity E3;
    public Drawable E4;
    public float E5;
    public boolean E6;
    public float F;
    public hf F0;
    public boolean F1;
    public final re F2;
    public final org.telegram.ui.bn F3;
    public Drawable F4;
    public xu0 F5;
    public nh0 F6;
    public float G;
    public final ug G0;
    public long G1;
    public final Paint G2;
    public long G3;
    public Drawable G4;
    public Bitmap G5;
    public final float[] G6;
    public float H;
    public int H0;
    public Interpolator H1;
    public int H2;
    public boolean H3;
    public Drawable H4;
    public float H5;
    public final float[] H6;
    public float I;
    public dd I0;
    public long I1;
    public dd I2;
    public int I3;
    public final RectF I4;
    public float I5;
    public final int[] I6;
    public float J;
    public final jh.h J0;
    public boolean J1;
    public int J2;
    public org.telegram.messenger.fj J3;
    public final Rect J4;
    public float J5;
    public boolean J6;
    public boolean K;
    public final se K0;
    public boolean K1;
    public mk0 K2;
    public org.telegram.messenger.fj K3;
    public final Rect K4;
    public float K5;
    public dd K6;
    public TLRPC.UserFull L;
    public int L0;
    public dh.c L1;
    public Editable L2;
    public org.telegram.ui.rm L3;
    public Drawable L4;
    public float L5;
    public final kq[] L6;
    public hi.u3 M;
    public org.telegram.ui.dg0 M0;
    public fh.g M1;
    public boolean M2;
    public org.telegram.messenger.fj M3;
    public final org.telegram.ui.ActionBar.i6 M4;
    public float M5;
    public int M6;
    public hi.u3 N;
    public long N0;
    public fh.g N1;
    public boolean N2;
    public TLRPC.WebPage N3;
    public final boolean N4;
    public float N5;
    public int N6;
    public hi.u3 O;
    public df O0;
    public final Paint O1;
    public boolean O2;
    public boolean O3;
    public final ue O4;
    public float O5;
    public boolean O6;
    public boolean P;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout P0;
    public float P1;
    public org.telegram.messenger.fj P2;
    public mg P3;
    public final de P4;
    public boolean P5;
    public long P6;
    public boolean Q;
    public final ImageView Q0;
    public ValueAnimator Q1;
    public boolean Q2;
    public gg Q3;
    public final de Q4;
    public final Paint Q5;
    public int Q6;
    public int R;
    public final ge R0;
    public final int[] R1;
    public TL_account.TL_businessChatLink R2;
    public TLRPC.TL_document R3;
    public final de R4;
    public boolean R5;
    public int R6;
    public org.telegram.messenger.c S;
    public final ImageView S0;
    public final int[] S1;
    public ig S2;
    public String S3;
    public final de S4;
    public float S5;
    public boolean S6;
    public boolean T;
    public je T0;
    public yh.a T1;
    public TLRPC.ChatFull T2;
    public org.telegram.messenger.fj T3;
    public final de T4;
    public float T5;
    public boolean T6;
    public int U;
    public boolean U0;
    public boolean U1;
    public boolean U2;
    public org.telegram.messenger.d20 U3;
    public boolean U4;
    public float U5;
    public bi.u U6;
    public org.telegram.ui.ActionBar.i1 V;
    public eg V0;
    public float V1;
    public int V2;
    public boolean V3;
    public long V4;
    public float V5;
    public x60 V6;
    public td W;
    public AnimatorSet W0;
    public ValueAnimator W1;
    public boolean W2;
    public boolean W3;
    public float W4;
    public boolean W5;
    public int W6;
    public boolean X0;
    public final td X1;
    public boolean X2;
    public boolean X3;
    public float X4;
    public boolean X5;
    public int X6;
    public boolean Y0;
    public long Y1;
    public boolean Y2;
    public org.telegram.messenger.fj Y3;
    public float Y4;
    public boolean Y5;
    public a0.h Y6;
    public vg Z0;
    public boolean Z1;
    public boolean Z2;
    public TL_keyboard.KeyboardButtonProto Z3;
    public float Z4;
    public boolean Z5;
    public final Paint Z6;
    public int a;
    public xd a0;
    public final pe a1;
    public SlideTextView a2;
    public boolean a3;
    public boolean a4;
    public float a5;
    public boolean a6;
    public final LinearGradient a7;
    public boolean b;
    public boolean b0;
    public boolean b1;
    public sg b2;
    public boolean b3;
    public boolean b4;
    public float b5;
    public final Paint b6;
    public final Matrix b7;
    public org.telegram.ui.ActionBar.y0 c;
    public NumberTextView c0;
    public final qe c1;
    public final cu0 c2;
    public org.telegram.messenger.fj c3;
    public boolean c4;
    public float c5;
    public float c6;
    public final c6 c7;
    public LinearLayout d;
    public int d0;
    public boolean d1;
    public ViewGroup d2;
    public TLRPC.TL_replyKeyboardMarkup d3;
    public boolean d4;
    public float d5;
    public final Rect d6;
    public final c6 d7;
    public CharSequence e;
    public int e0;
    public bi.v2 e1;
    public int e2;
    public int e3;
    public int e4;
    public float e5;
    public boolean e6;
    public rh.e e7;
    public String f;
    public hr f0;
    public ee f1;
    public final org.telegram.ui.b61 f2;
    public boolean f3;
    public boolean f4;
    public float f5;
    public final td f6;
    public lh.h f7;
    public Runnable g0;
    public x61 g1;
    public ViewPropertyAnimator g2;
    public PowerManager.WakeLock g3;
    public boolean g4;
    public float g5;
    public org.telegram.ui.ActionBar.y0 g6;
    public final te.c g7;
    public float h;
    public boolean h0;
    public qh0 h1;
    public final je h2;
    public AnimatorSet h3;
    public final ue h4;
    public boolean h5;
    public ArrayList h6;
    public final te.a h7;
    public boolean i0;
    public zi0 i1;
    public final org.telegram.ui.ActionBar.v2 i2;
    public AnimatorSet i3;
    public final xe i4;
    public boolean i5;
    public boolean i6;
    public final te.a i7;
    public String j0;
    public ai.l0 j1;
    public final ImageView j2;
    public AnimatorSet j3;
    public final org.telegram.ui.Cells.h1 j4;
    public int j5;
    public View j6;
    public final te.a j7;
    public String k0;
    public boolean k1;
    public final ImageView k2;
    public AnimatorSet k3;
    public final lf k4;
    public long k5;
    public boolean k6;
    public float k7;
    public ki.j3 l0;
    public boolean l1;
    public float l2;
    public int l3;
    public final tf l4;
    public boolean l5;
    public boolean l6;
    public float l7;
    public ki.y m0;
    public boolean m1;
    public ImageView m2;
    public int m3;
    public final Paint m4;
    public ValueAnimator m5;
    public boolean m6;
    public float m7;
    public float n;
    public ff n0;
    public boolean n1;
    public je n2;
    public int n3;
    public boolean n4;
    public final TextPaint n5;
    public p0 n6;
    public final int[] n7;
    public ki.x o0;
    public boolean o1;
    public final ee o2;
    public int o3;
    public boolean o4;
    public final Paint o5;
    public ai.j1 o6;
    public final int[] o7;
    public boolean p0;
    public Drawable p1;
    public final ee p2;
    public boolean p3;
    public boolean p4;
    public final Paint p5;
    public int p6;
    public boolean p7;
    public qn0 q0;
    public final dd q1;
    public final ee q2;
    public int q3;
    public boolean q4;
    public final Path q5;
    public boolean q6;
    public int q7;
    public float r;
    public ye r0;
    public ji.n r1;
    public final ImageView r2;
    public final boolean r3;
    public AnimatorSet r4;
    public final Path r5;
    public boolean r6;
    public int r7;
    public float s;
    public dd s0;
    public boolean s1;
    public org.telegram.messenger.ut s2;
    public long s3;
    public float s4;
    public final RectF s5;
    public ue s6;
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
    public final int[] u5;
    public long u6;
    public dd v0;
    public float v1;
    public se v2;
    public boolean v3;
    public AnimatedArrowDrawable v4;
    public fh.g v5;
    public ai.q0 v6;
    public boolean w;
    public ValueAnimator w0;
    public float w1;
    public View w2;
    public int w3;
    public boolean w4;
    public fh.g w5;
    public final RectF w6;
    public Runnable x;
    public float x0;
    public boolean x1;
    public ag x2;
    public boolean x3;
    public final ue x4;
    public final nb.a x5;
    public boolean x6;
    public float y;
    public boolean y0;
    public float y1;
    public final ImageView y2;
    public boolean y3;
    public boolean y4;
    public boolean y5;
    public long y6;
    public boolean z0;
    public float z1;
    public te z2;
    public boolean z3;
    public boolean z4;
    public xd z5;
    public org.telegram.messenger.f6 z6;

    /* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        public final v9 h;
        public final v9 n;
        public final float r;
        public final float s;
        public final RectF w;
        public boolean x;
        public final rg y;

        public RecordCircle(Context context) {
            super(context);
            v9 v9Var = new v9(11, 360928);
            this.h = v9Var;
            v9 v9Var2 = new v9(12, 360928);
            this.n = v9Var2;
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
            rg rgVar = new rg(this, this);
            this.y = rgVar;
            r0.i0.j(this, rgVar);
            v9Var.a = org.telegram.messenger.g0.L(47.0f);
            v9Var.b = org.telegram.messenger.g0.L(55.0f);
            v9Var.b();
            v9Var2.a = org.telegram.messenger.g0.L(47.0f);
            v9Var2.b = org.telegram.messenger.g0.L(55.0f);
            v9Var2.b();
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
            return org.telegram.ui.Cells.c0.z(i7, i7, i7, 1.0f);
        }

        public static float i(float f10, float f11) {
            if (f10 <= 0.0f) {
                return 0.0f;
            }
            return (float) (Math.sin(f10 * 3.141592653589793d * 2.0d * f11) * Math.exp((-f10) * 8.5d));
        }

        public final void a() {
            ChatActivityEnterView.this.h5 = true;
        }

        public final void b() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (chatActivityEnterView.F4 != null) {
                return;
            }
            chatActivityEnterView.F4 = getResources().getDrawable(R.drawable.input_mic_pressed).mutate();
            Drawable drawable = chatActivityEnterView.F4;
            int i7 = org.telegram.ui.ActionBar.n6.Tf;
            org.telegram.ui.ActionBar.i6 i6Var = chatActivityEnterView.M4;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.u6.x(this, drawable, i7, i6Var, mode);
            chatActivityEnterView.G4 = getResources().getDrawable(R.drawable.input_video_pressed).mutate();
            org.telegram.ui.ActionBar.u6.x(this, chatActivityEnterView.G4, i7, chatActivityEnterView.M4, mode);
            chatActivityEnterView.H4 = getResources().getDrawable(R.drawable.send_plane_24).mutate();
            org.telegram.ui.ActionBar.u6.x(this, chatActivityEnterView.H4, i7, chatActivityEnterView.M4, mode);
            chatActivityEnterView.D4 = getResources().getDrawable(R.drawable.input_mic).mutate();
            Drawable drawable2 = chatActivityEnterView.D4;
            int i10 = org.telegram.ui.ActionBar.n6.Nl;
            org.telegram.ui.ActionBar.u6.x(this, drawable2, i10, chatActivityEnterView.M4, mode);
            chatActivityEnterView.E4 = getResources().getDrawable(R.drawable.input_video).mutate();
            org.telegram.ui.ActionBar.u6.x(this, chatActivityEnterView.E4, i10, chatActivityEnterView.M4, mode);
        }

        public final void c(Canvas canvas, Drawable drawable, Drawable drawable2, float f10, int i7) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            float f11 = drawable == chatActivityEnterView.H4 ? (this.d0 * 0.1f) + 1.0f : 1.0f;
            if (f11 != 1.0f) {
                canvas.save();
                canvas.scale(f11, f11, drawable.getBounds().exactCenterX(), drawable.getBounds().exactCenterY());
            }
            b();
            if (f10 == 0.0f || f10 == 1.0f || drawable2 == null) {
                boolean z10 = chatActivityEnterView.h5;
                pe peVar = chatActivityEnterView.a1;
                if (z10 && chatActivityEnterView.Z4 == 1.0f) {
                    chatActivityEnterView.c1.setAlpha(1.0f);
                    if (peVar != null) {
                        peVar.setAlpha(1.0f);
                        peVar.setScaleX(1.0f);
                        peVar.setScaleY(1.0f);
                    }
                    setVisibility(8);
                } else if (z10 && chatActivityEnterView.Z4 < 1.0f) {
                    drawable.setAlpha(org.telegram.messenger.ks.e4);
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
                chatActivityEnterView.i5 = false;
                chatActivityEnterView.b5 = -1.0f;
                chatActivityEnterView.a5 = -1.0f;
                chatActivityEnterView.Z4 = 1.0f;
                chatActivityEnterView.g5 = 1.0f;
                chatActivityEnterView.d5 = 0.0f;
                chatActivityEnterView.Y4 = 0.0f;
            }
            invalidate();
            chatActivityEnterView.f5 = 0.0f;
            chatActivityEnterView.X0();
            chatActivityEnterView.c5 = 0.0f;
            chatActivityEnterView.X4 = 0.0f;
            chatActivityEnterView.W4 = 0.0f;
            chatActivityEnterView.U4 = false;
            this.f = 0.0f;
            chatActivityEnterView.h5 = false;
            qg qgVar = chatActivityEnterView.E2;
            if (qgVar != null) {
                qgVar.invalidate();
            }
        }

        public final void g() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.i5 = false;
            invalidate();
            qg qgVar = chatActivityEnterView.E2;
            if (qgVar != null) {
                qgVar.invalidate();
            }
        }

        public float getControlsScale() {
            return ChatActivityEnterView.this.Y4;
        }

        public float getScale() {
            return ChatActivityEnterView.this.X4;
        }

        public float getTransformToSeekbarProgressStep3() {
            return this.e;
        }

        public final void h() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            Paint paint = chatActivityEnterView.C4;
            int i7 = org.telegram.ui.ActionBar.n6.Uf;
            paint.setColor(chatActivityEnterView.G0(i7));
            this.h.d.setColor(i0.a.o(chatActivityEnterView.G0(i7), 38));
            this.n.d.setColor(i0.a.o(chatActivityEnterView.G0(i7), 76));
            this.E = chatActivityEnterView.C4.getAlpha();
        }

        @Override // android.view.View
        public final void invalidate() {
            super.invalidate();
            qg qgVar = ChatActivityEnterView.this.E2;
            if (qgVar != null) {
                qgVar.invalidate();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:135:0x04c9  */
        /* JADX WARN: Removed duplicated region for block: B:141:0x04e5  */
        /* JADX WARN: Removed duplicated region for block: B:201:0x0ade  */
        /* JADX WARN: Removed duplicated region for block: B:221:0x0bf2  */
        /* JADX WARN: Removed duplicated region for block: B:240:0x0bd7  */
        /* JADX WARN: Removed duplicated region for block: B:282:0x0be2  */
        /* JADX WARN: Removed duplicated region for block: B:288:0x03dd  */
        /* JADX WARN: Removed duplicated region for block: B:290:0x03b1  */
        /* JADX WARN: Removed duplicated region for block: B:291:0x03a0  */
        /* JADX WARN: Removed duplicated region for block: B:292:0x0333  */
        /* JADX WARN: Removed duplicated region for block: B:295:0x02e8  */
        /* JADX WARN: Removed duplicated region for block: B:301:0x027b  */
        /* JADX WARN: Removed duplicated region for block: B:303:0x0257  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x022e  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0263  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x028e  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0323  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x034b  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x03ae  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x03b7  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x03d8  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x03e6  */
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
            boolean i02;
            float f18;
            int i7;
            float[] fArr;
            float f19;
            Paint paint;
            float f20;
            float f21;
            float f22;
            Drawable drawable;
            boolean e10;
            int i10;
            float f23;
            float f24;
            Drawable drawable2;
            Drawable drawable3;
            float f25;
            int i11;
            int i12;
            float f26;
            Drawable drawable4;
            Drawable drawable5;
            Paint paint2;
            Rect rect;
            float f27;
            Paint paint3;
            int i13;
            int i14;
            float f28;
            Drawable drawable6;
            float f29;
            float f30;
            zi0 zi0Var;
            int[] iArr;
            float f31;
            int i15;
            float f32;
            float f33;
            float f34;
            int i16;
            float cos;
            float f35;
            float f36;
            float f37;
            float f38;
            Paint paint4;
            Path path;
            RectF rectF;
            Canvas canvas2;
            float f39;
            float f40;
            Paint paint5;
            zi0 zi0Var2;
            Canvas canvas3 = canvas;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            Rect rect2 = chatActivityEnterView.J4;
            Paint paint6 = chatActivityEnterView.C4;
            if (this.O) {
                return;
            }
            if (this.P) {
                Paint paint7 = chatActivityEnterView.Q5;
                if (chatActivityEnterView.P5) {
                    if (chatActivityEnterView.G5 != null) {
                        float f41 = chatActivityEnterView.L5 / 1000.0f;
                        float i17 = Utilities.i((f41 - 0.04f) / 0.2f, 1.0f, 0.0f);
                        float T1 = org.telegram.messenger.g0.T1(chatActivityEnterView.J5, chatActivityEnterView.K5, i17);
                        if (i17 < 1.0f) {
                            canvas3.save();
                            canvas3.clipRect(T1, chatActivityEnterView.I5, chatActivityEnterView.H5 + chatActivityEnterView.G5.getWidth(), chatActivityEnterView.I5 + chatActivityEnterView.G5.getHeight());
                            paint7.setAlpha((int) ((1.0f - ChatActivityEnterView.K2(0.015f, 0.09f, f41)) * 255.0f));
                            canvas3.drawBitmap(chatActivityEnterView.G5, chatActivityEnterView.H5, chatActivityEnterView.I5, paint7);
                            canvas3.restore();
                        }
                    }
                    xu0 xu0Var = chatActivityEnterView.F5;
                    if (xu0Var != null && xu0Var.b(canvas3, 1.0f)) {
                        invalidate();
                    }
                }
                this.d = System.currentTimeMillis();
                return;
            }
            int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.M(26.0f);
            int L = (int) (org.telegram.messenger.g0.L(170.0f) + 0.0f);
            this.K = chatActivityEnterView.j5 + measuredWidth;
            float f42 = L;
            this.L = f42;
            float f43 = chatActivityEnterView.X4;
            float f44 = f43 <= 0.5f ? f43 / 0.5f : f43 <= 0.75f ? 1.0f - (((f43 - 0.5f) / 0.25f) * 0.1f) : (((f43 - 0.75f) / 0.25f) * 0.1f) + 0.9f;
            long currentTimeMillis = System.currentTimeMillis() - this.d;
            float f45 = this.b;
            float f46 = this.a;
            if (f45 != f46) {
                float f47 = this.c;
                f10 = 1.0f;
                float f48 = (currentTimeMillis * f47) + f46;
                this.a = f48;
                if (f47 > 0.0f) {
                    if (f48 > f45) {
                        this.a = f45;
                    }
                } else if (f48 < f45) {
                    this.a = f45;
                }
                invalidate();
            } else {
                f10 = 1.0f;
            }
            float interpolation = chatActivityEnterView.h5 ? kr.g.getInterpolation(f10 - chatActivityEnterView.Z4) * 0.7f : (chatActivityEnterView.Z4 * 0.3f) + 0.7f;
            float f49 = this.s * this.a;
            float f50 = this.r;
            float f51 = (f49 + f50) * f44 * interpolation;
            this.e = 0.0f;
            float f52 = chatActivityEnterView.f5;
            if (f52 != 0.0f) {
                f11 = 0.6f;
                if (chatActivityEnterView.i1 != null) {
                    float f53 = f52 > 0.38f ? f10 : f52 / 0.38f;
                    float x10 = f52 > 0.63f ? f10 : org.telegram.ui.Cells.c0.x(f52, 0.38f, 0.25f, 0.0f);
                    this.e = Math.max(0.0f, ((chatActivityEnterView.f5 - 0.38f) - 0.25f) / 0.37f);
                    kr krVar = kr.j;
                    f17 = krVar.getInterpolation(f53);
                    float interpolation2 = krVar.getInterpolation(x10);
                    this.e = krVar.getInterpolation(this.e);
                    float L2 = org.telegram.messenger.g0.L(8.0f);
                    f12 = f50;
                    float z10 = com.google.android.gms.internal.vision.e2.z(f10, interpolation2, ((org.telegram.messenger.g0.L(16.0f) * f17) + f51) - L2, L2);
                    f14 = interpolation2;
                    f13 = z10;
                    f15 = 0.0f;
                    f16 = 1.0f;
                    i02 = chatActivityEnterView.i0();
                    float f54 = f15;
                    float[] fArr2 = this.b0;
                    float f55 = f16;
                    if (i02) {
                        f18 = f17;
                        i7 = 2;
                    } else {
                        i7 = 2;
                        if (chatActivityEnterView.B6 <= 0.0f || chatActivityEnterView.c5 != 0.0f) {
                            f18 = f17;
                        } else {
                            float L3 = org.telegram.messenger.g0.L(19.0f);
                            if (chatActivityEnterView.F0(fArr2)) {
                                L3 = fArr2[2];
                            }
                            f18 = f17;
                            f13 = org.telegram.messenger.g0.T1(f13, L3, chatActivityEnterView.B6);
                        }
                    }
                    if (this.e <= 0.0f) {
                        fArr = fArr2;
                        paint6.setColor(i0.a.f(this.e, chatActivityEnterView.G0(org.telegram.ui.ActionBar.n6.Uf), chatActivityEnterView.G0(org.telegram.ui.ActionBar.n6.bg)));
                    } else {
                        fArr = fArr2;
                        paint6.setColor(chatActivityEnterView.G0(org.telegram.ui.ActionBar.n6.Uf));
                    }
                    b();
                    Drawable drawable7 = null;
                    if (chatActivityEnterView.i5) {
                        f19 = f13;
                        paint = paint6;
                        f20 = f14;
                        f21 = f51;
                        f22 = 12.0f;
                        drawable = chatActivityEnterView.d1 ? chatActivityEnterView.G4 : chatActivityEnterView.F4;
                        rect2.set(measuredWidth - org.telegram.messenger.g0.L(12.0f), L - org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + measuredWidth, org.telegram.messenger.g0.L(12.0f) + L);
                    } else {
                        float f56 = this.f;
                        f22 = 12.0f;
                        if (f56 != 1.0f) {
                            float f57 = (currentTimeMillis / 150.0f) + f56;
                            this.f = f57;
                            if (f57 > 1.0f) {
                                this.f = 1.0f;
                            }
                            drawable7 = chatActivityEnterView.d1 ? chatActivityEnterView.G4 : chatActivityEnterView.F4;
                        }
                        drawable = chatActivityEnterView.H4;
                        f20 = f14;
                        int i18 = i7;
                        f21 = f51;
                        paint = paint6;
                        f19 = f13;
                        rect2.set(org.telegram.ui.Cells.c0.C(i18, measuredWidth, drawable), org.telegram.ui.Cells.c0.A(i18, L, drawable), org.telegram.ui.Cells.c0.y(i18, measuredWidth, drawable), org.telegram.ui.Cells.c0.j(i18, L, drawable));
                        if (drawable7 != null) {
                            drawable7.setBounds(org.telegram.ui.Cells.c0.C(i18, measuredWidth, drawable7), org.telegram.ui.Cells.c0.A(i18, L, drawable7), org.telegram.ui.Cells.c0.y(i18, measuredWidth, drawable7), org.telegram.ui.Cells.c0.j(i18, L, drawable7));
                        }
                    }
                    Drawable drawable8 = drawable;
                    Drawable drawable9 = drawable7;
                    drawable8.setBounds(rect2);
                    if (this.x) {
                        float f58 = chatActivityEnterView.e5 - 0.01f;
                        chatActivityEnterView.e5 = f58;
                        if (f58 < 0.0f) {
                            this.x = true;
                            chatActivityEnterView.e5 = 0.0f;
                        }
                    } else {
                        float f59 = chatActivityEnterView.e5 + 0.01f;
                        chatActivityEnterView.e5 = f59;
                        if (f59 > 1.0f) {
                            this.x = false;
                            chatActivityEnterView.e5 = 1.0f;
                        }
                    }
                    e10 = org.telegram.messenger.pc.e(360928);
                    v9 v9Var = this.n;
                    v9 v9Var2 = this.h;
                    if (e10) {
                        i10 = 1;
                    } else {
                        v9Var2.a = org.telegram.messenger.g0.L(47.0f);
                        i10 = 1;
                        v9Var2.b = (org.telegram.messenger.g0.L(15.0f) * 0.6f) + org.telegram.messenger.g0.L(47.0f);
                        v9Var.a = org.telegram.messenger.g0.L(50.0f);
                        v9Var.b = (org.telegram.messenger.g0.L(f22) * 0.6f) + org.telegram.messenger.g0.L(50.0f);
                        v9Var.f(currentTimeMillis);
                        v9Var.e(v9Var.t, 1.01f);
                        v9Var2.f(currentTimeMillis);
                        v9Var2.e(v9Var2.t, 1.02f);
                    }
                    this.d = System.currentTimeMillis();
                    float f60 = chatActivityEnterView.Z4;
                    float f61 = f60 <= 0.7f ? 1.0f : f60 / 0.7f;
                    if (chatActivityEnterView.E1) {
                        float f62 = chatActivityEnterView.c5;
                        if (f62 > 0.0f) {
                            f23 = 1.0f;
                            f24 = 1.0f - kr.g.getInterpolation(Math.min(1.0f, f62));
                            float f63 = (chatActivityEnterView.i0() ? f23 - chatActivityEnterView.B6 : f23) * f24;
                            if (org.telegram.messenger.pc.e(360928) || f20 == f23 || ((f54 >= 0.4f && (!chatActivityEnterView.E1 || f63 <= 0.01f)) || f61 <= 0.0f || chatActivityEnterView.h5)) {
                                drawable2 = drawable8;
                                drawable3 = drawable9;
                                f25 = 0.01f;
                                i11 = 0;
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
                                boolean z11 = chatActivityEnterView.t1;
                                f25 = 0.01f;
                                i11 = 0;
                                float z12 = com.google.android.gms.internal.vision.e2.z(z11 ? 1.0f : 0.0f, f66, 0.18f, f66);
                                this.Q = z12;
                                if (Math.abs((z11 ? 1.0f : 0.0f) - z12) > 0.01f) {
                                    invalidate();
                                }
                                if (this.N || this.Q >= 0.99f) {
                                    drawable2 = drawable8;
                                    drawable3 = drawable9;
                                } else {
                                    float interpolation3 = (1.0f - this.Q) * kr.g.getInterpolation(this.I);
                                    canvas3.save();
                                    float f67 = 1.0f - f18;
                                    drawable2 = drawable8;
                                    drawable3 = drawable9;
                                    float B = com.google.android.gms.internal.vision.e2.B(v9Var.t, 1.4f, 0.878f, com.google.android.gms.internal.vision.e2.D(chatActivityEnterView.X4 * f63, f67, f61, interpolation3));
                                    canvas3.scale(B, B, chatActivityEnterView.j5 + measuredWidth, f42);
                                    v9Var.a(chatActivityEnterView.j5 + measuredWidth, f42, canvas3, v9Var.d);
                                    canvas3.restore();
                                    float f68 = ((v9Var2.t * 1.4f) + 0.926f) * f63 * chatActivityEnterView.X4 * f67 * f61 * interpolation3;
                                    canvas3.save();
                                    canvas3.scale(f68, f68, chatActivityEnterView.j5 + measuredWidth, f42);
                                    v9Var2.a(chatActivityEnterView.j5 + measuredWidth, f42, canvas3, v9Var2.d);
                                    canvas3.restore();
                                }
                            }
                            float max = (chatActivityEnterView.h5 || chatActivityEnterView.Z4 >= 1.0f) ? f19 : Math.max(f19, org.telegram.messenger.g0.L(19.0f));
                            if (this.N) {
                                i12 = measuredWidth;
                                f26 = f42;
                                drawable4 = drawable2;
                                drawable5 = drawable3;
                                paint2 = paint;
                            } else {
                                paint2 = paint;
                                paint2.setAlpha((int) (this.E * f55));
                                if (chatActivityEnterView.X4 == 1.0f) {
                                    float f69 = chatActivityEnterView.f5;
                                    int i19 = (f69 == 0.0f || !chatActivityEnterView.K1 || chatActivityEnterView.d1 || (zi0Var2 = chatActivityEnterView.i1) == null || zi0Var2.S) ? i11 : i10;
                                    RectF rectF2 = this.w;
                                    if (i19 != 0) {
                                        float f70 = chatActivityEnterView.j5 + measuredWidth;
                                        int[] iArr2 = chatActivityEnterView.S1;
                                        int[] iArr3 = chatActivityEnterView.R1;
                                        pe peVar = chatActivityEnterView.a1;
                                        float f71 = chatActivityEnterView.f5;
                                        f29 = 3.0f;
                                        View view = (View) chatActivityEnterView.i1.getParent();
                                        float f72 = 0.0f;
                                        float f73 = 0.0f;
                                        while (true) {
                                            i13 = i19;
                                            if (view == null || view == getParent()) {
                                                break;
                                            }
                                            f72 = view.getY() + f72;
                                            f73 = view.getX() + f73;
                                            view = view.getParent() instanceof View ? (View) view.getParent() : null;
                                            i19 = i13;
                                        }
                                        float y10 = (chatActivityEnterView.i1.getY() + f72) - getY();
                                        float measuredHeight = chatActivityEnterView.i1.getMeasuredHeight() + y10;
                                        float x11 = ((chatActivityEnterView.i1.getX() + f73) - getX()) + chatActivityEnterView.J;
                                        float x12 = (((chatActivityEnterView.i1.getX() + chatActivityEnterView.i1.getMeasuredWidth()) + f73) - getX()) - chatActivityEnterView.J;
                                        float min = Math.min(measuredHeight - y10, org.telegram.messenger.g0.L(32.0f));
                                        float f74 = (y10 + measuredHeight) / 2.0f;
                                        float N = org.telegram.messenger.g0.N(19.0f);
                                        i14 = measuredWidth;
                                        float[] fArr3 = this.a0;
                                        boolean F0 = chatActivityEnterView.F0(fArr3);
                                        int[] iArr4 = this.V;
                                        if (F0) {
                                            getLocationInWindow(iArr4);
                                            float f75 = fArr3[i11] - iArr4[i11];
                                            rect = rect2;
                                            f33 = fArr3[i10] - iArr4[i10];
                                            iArr = iArr4;
                                            f32 = fArr3[2];
                                            f31 = f75;
                                            i15 = i10;
                                        } else if (peVar == null || peVar.getWidth() <= 0) {
                                            iArr = iArr4;
                                            f31 = f70;
                                            i15 = i11;
                                            f32 = N;
                                            rect = rect2;
                                            f33 = f42;
                                        } else {
                                            getLocationInWindow(iArr4);
                                            iArr = iArr4;
                                            peVar.getLocationInWindow(this.W);
                                            f31 = ((peVar.getWidth() + (r12[i11] - iArr[i11])) - org.telegram.messenger.g0.N(3.0f)) - N;
                                            float height = ((peVar.getHeight() + (r12[i10] - iArr[i10])) - org.telegram.messenger.g0.N(3.0f)) - N;
                                            rect = rect2;
                                            f33 = height;
                                            f32 = N;
                                            i15 = i11;
                                        }
                                        f27 = max;
                                        float d = d(f71 / 0.62f);
                                        paint3 = paint2;
                                        float f76 = f71 - 0.5f;
                                        float max2 = 0.56f * Math.max(0.0f, f76);
                                        float i20 = i(max2, 5.2f);
                                        float i21 = i(max2 - 0.02f, 4.4f);
                                        float B2 = com.google.android.gms.internal.vision.e2.B(i20, 0.07f, 1.0f, org.telegram.messenger.g0.T1(f21, f32, d));
                                        float T12 = org.telegram.messenger.g0.T1(f70, f31, d);
                                        float T13 = org.telegram.messenger.g0.T1(f42, f33, d);
                                        float e11 = e(f71 / 0.58f);
                                        float f77 = f71 / 0.5f;
                                        float C = com.google.android.gms.internal.vision.e2.C(i21, 0.09f, 1.0f, org.telegram.messenger.g0.T1(Math.min(min, 1.1f * B2) * 0.8f, min, e(f77)));
                                        float L4 = org.telegram.messenger.g0.L(16.0f);
                                        int i22 = (f71 > 0.5f ? 1 : (f71 == 0.5f ? 0 : -1));
                                        if (i22 < 0) {
                                            f34 = i21;
                                            cos = org.telegram.messenger.g0.T1(T12 - (B2 * 0.35f), x12 - L4, e(f77));
                                            f28 = f42;
                                            i16 = i22;
                                        } else {
                                            f34 = i21;
                                            f28 = f42;
                                            i16 = i22;
                                            cos = x12 - (L4 * ((float) (Math.cos(((max2 * 3.141592653589793d) * 2.0d) * 2.6d) * Math.exp((-max2) * 13.0f))));
                                        }
                                        float T14 = org.telegram.messenger.g0.T1((T12 - (B2 * 0.35f)) - C, x11, d((f71 - 0.16f) / 0.6f)) - (org.telegram.messenger.g0.L(5.0f) * f34);
                                        float T15 = org.telegram.messenger.g0.T1(T13, f74, e11);
                                        float min2 = Math.min(T14, cos - C);
                                        float f78 = C / 2.0f;
                                        RectF rectF3 = this.U;
                                        rectF3.set(min2, T15 - f78, cos, T15 + f78);
                                        int f79 = i0.a.f(d((f71 - 0.6f) / 0.4f), chatActivityEnterView.G0(org.telegram.ui.ActionBar.n6.Uf), chatActivityEnterView.G0(org.telegram.ui.ActionBar.n6.Pe));
                                        Paint paint8 = this.T;
                                        paint8.setColor(f79);
                                        paint8.setAlpha((int) (this.E * 1.0f));
                                        Path path2 = this.S;
                                        path2.rewind();
                                        Path.Direction direction = Path.Direction.CW;
                                        path2.addCircle(T12, T13, B2, direction);
                                        float f80 = cos - f78;
                                        if (i16 < 0) {
                                            f35 = T12;
                                            double d2 = f77;
                                            f36 = T13;
                                            float max3 = Math.max(org.telegram.messenger.g0.N(0.6f), 0.85f * f78 * ((float) Math.pow(1.0d - Math.pow(d2, 1.4d), 1.2d)));
                                            float f81 = f35 - f80;
                                            if (f81 <= 0.0f) {
                                                path = path2;
                                                f37 = d;
                                                f38 = B2;
                                                paint4 = paint8;
                                            } else {
                                                double i23 = (Utilities.i(1.0f - (((f81 - f78) - B2) / (f78 + B2)), 1.0f, 0.15f) * 45.0f) + 25.0f;
                                                float radians = (float) Math.toRadians(i23);
                                                float radians2 = (float) Math.toRadians(i23);
                                                double d10 = radians;
                                                float cos2 = (((float) Math.cos(d10)) * f78) + f80;
                                                float sin = T15 - (((float) Math.sin(d10)) * f78);
                                                float sin2 = (((float) Math.sin(d10)) * f78) + T15;
                                                double d11 = radians2;
                                                float cos3 = f35 - (((float) Math.cos(d11)) * B2);
                                                f38 = B2;
                                                float sin3 = f36 - (f38 * ((float) Math.sin(d11)));
                                                paint4 = paint8;
                                                float sin4 = (((float) Math.sin(d11)) * f38) + f36;
                                                float f82 = (cos2 + cos3) / 2.0f;
                                                float f83 = (T15 + f36) / 2.0f;
                                                path2.moveTo(cos2, sin);
                                                float f84 = f83 - max3;
                                                f37 = d;
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
                                            f35 = T12;
                                            f36 = T13;
                                            f37 = d;
                                            f38 = B2;
                                            paint4 = paint8;
                                            path = path2;
                                        }
                                        int i24 = f71 >= 0.5f ? i10 : i11;
                                        if (i24 == 0) {
                                            path.addRoundRect(rectF3, f78, f78, direction);
                                            zi0 zi0Var3 = chatActivityEnterView.i1;
                                            zi0Var3.Q.set(rectF3);
                                            zi0Var3.R = -1.0f;
                                            zi0Var3.invalidate();
                                            rectF = rectF2;
                                        } else {
                                            getLocationInWindow(iArr3);
                                            chatActivityEnterView.i1.getLocationInWindow(iArr2);
                                            rectF = rectF2;
                                            rectF.set(rectF3);
                                            rectF.offset(iArr3[i11] - iArr2[i11], iArr3[i10] - iArr2[i10]);
                                            zi0 zi0Var4 = chatActivityEnterView.i1;
                                            float e12 = (e(f76 / 0.5f) * 0.65f) + 0.35f;
                                            zi0Var4.Q.set(rectF);
                                            zi0Var4.R = e12;
                                            zi0Var4.invalidate();
                                        }
                                        float d12 = 1.0f - d((f71 - 0.72f) / 0.28f);
                                        if (d12 < 1.0f) {
                                            int alpha = paint4.getAlpha();
                                            paint5 = paint4;
                                            paint5.setAlpha((int) (alpha * d12));
                                            canvas2 = canvas;
                                            f39 = f36;
                                            f40 = f35;
                                            canvas2.drawCircle(f40, f39, f38, paint5);
                                            paint5.setAlpha(alpha);
                                            path.rewind();
                                            if (i24 == 0) {
                                                path.addRoundRect(rectF3, f78, f78, direction);
                                            }
                                        } else {
                                            canvas2 = canvas;
                                            f39 = f36;
                                            f40 = f35;
                                            paint5 = paint4;
                                        }
                                        canvas2.drawPath(path, paint5);
                                        if (d12 > 0.0f) {
                                            canvas2.save();
                                            float centerX = f40 - drawable2.getBounds().centerX();
                                            float f86 = f39 - f28;
                                            if (i15 != 0) {
                                                float f87 = (fArr3[3] - iArr[i11]) - drawable2.getBounds().left;
                                                float f88 = (fArr3[4] - iArr[i10]) - drawable2.getBounds().top;
                                                float f89 = f37;
                                                centerX = org.telegram.messenger.g0.T1(centerX, f87, f89);
                                                f86 = org.telegram.messenger.g0.T1(f86, f88, f89);
                                            }
                                            canvas2.translate(centerX, f86);
                                            int i25 = (int) (d12 * 255.0f);
                                            canvas3 = canvas2;
                                            Drawable drawable10 = drawable2;
                                            drawable5 = drawable3;
                                            c(canvas3, drawable10, drawable5, this.f, i25);
                                            drawable6 = drawable10;
                                            canvas3.restore();
                                        } else {
                                            canvas3 = canvas2;
                                            drawable6 = drawable2;
                                            drawable5 = drawable3;
                                        }
                                        if (f71 >= 1.0f) {
                                            zi0 zi0Var5 = chatActivityEnterView.i1;
                                            zi0Var5.Q.set(rectF);
                                            zi0Var5.R = 1.0f;
                                            zi0Var5.invalidate();
                                        }
                                    } else {
                                        rect = rect2;
                                        f27 = max;
                                        paint3 = paint2;
                                        i13 = i19;
                                        i14 = measuredWidth;
                                        f28 = f42;
                                        drawable6 = drawable2;
                                        drawable5 = drawable3;
                                        f29 = 3.0f;
                                        if (f69 == 0.0f) {
                                            paint2 = paint3;
                                            f26 = f28;
                                            f30 = 1.0f;
                                            max = f27;
                                            canvas3.drawCircle(i14 + chatActivityEnterView.j5, f26, max, paint2);
                                        } else if (chatActivityEnterView.d1 || this.e <= 0.0f || (zi0Var = chatActivityEnterView.i1) == null || (chatActivityEnterView.K1 && zi0Var.S)) {
                                            f30 = 1.0f;
                                            paint2 = paint3;
                                            f26 = f28;
                                            canvas3.drawCircle(i14 + chatActivityEnterView.j5, f26, (1.0f - this.e) * f27, paint2);
                                            max = f27;
                                        } else {
                                            float f90 = f28 + f27;
                                            float f91 = f28 - f27;
                                            float f92 = i14 + chatActivityEnterView.j5;
                                            float f93 = f92 + f27;
                                            float f94 = f92 - f27;
                                            int i26 = i11;
                                            int i27 = i26;
                                            for (View view2 = (View) zi0Var.getParent(); view2 != getParent(); view2 = (View) view2.getParent()) {
                                                i26 = (int) (view2.getY() + i26);
                                                i27 = (int) (view2.getX() + i27);
                                            }
                                            float f95 = i26;
                                            float y11 = (zi0Var.getY() + f95) - getY();
                                            float y12 = ((zi0Var.getY() + zi0Var.getMeasuredHeight()) + f95) - getY();
                                            float f96 = i27;
                                            float x13 = (((zi0Var.getX() + zi0Var.getMeasuredWidth()) + f96) - getX()) - chatActivityEnterView.J;
                                            float x14 = ((zi0Var.getX() + f96) - getX()) + chatActivityEnterView.J;
                                            if (!chatActivityEnterView.d1) {
                                                zi0Var.getMeasuredHeight();
                                            }
                                            rectF2.set(org.telegram.messenger.g0.T1(f94, x14, this.e), org.telegram.messenger.g0.T1(f91, y11, this.e), org.telegram.messenger.g0.T1(f93, x13, this.e), org.telegram.messenger.g0.T1(f90, y12, this.e));
                                            if (chatActivityEnterView.K1) {
                                                getLocationInWindow(chatActivityEnterView.R1);
                                                chatActivityEnterView.i1.getLocationInWindow(chatActivityEnterView.S1);
                                                int i28 = chatActivityEnterView.R1[i11];
                                                int[] iArr5 = chatActivityEnterView.S1;
                                                rectF2.offset(i28 - iArr5[i11], r2[i10] - iArr5[i10]);
                                                zi0 zi0Var6 = chatActivityEnterView.i1;
                                                float f97 = this.e;
                                                zi0Var6.Q.set(rectF2);
                                                zi0Var6.R = f97;
                                                zi0Var6.invalidate();
                                            } else {
                                                chatActivityEnterView.i1.a(canvas3, rectF2, this.e);
                                            }
                                        }
                                        if (i13 != 0) {
                                            canvas3.save();
                                            float f98 = f30 - f54;
                                            canvas3.translate(chatActivityEnterView.j5, 0.0f);
                                            float L5 = (max - org.telegram.messenger.g0.L(19.0f)) / Math.max(f30, f12 - org.telegram.messenger.g0.L(19.0f));
                                            this.d0 = L5 < 0.0f ? 0.0f : L5 > f30 ? f30 : L5;
                                            int A = (int) org.telegram.messenger.f3.A(f30, f20, f98, 255.0f);
                                            if (chatActivityEnterView.f5 != 0.0f && drawable6 == chatActivityEnterView.H4 && chatActivityEnterView.K1) {
                                                float[] fArr4 = fArr;
                                                if (chatActivityEnterView.F0(fArr4)) {
                                                    getLocationInWindow(this.c0);
                                                    int intrinsicWidth = drawable6.getIntrinsicWidth();
                                                    int intrinsicHeight = drawable6.getIntrinsicHeight();
                                                    float f99 = fArr4[3];
                                                    int[] iArr6 = this.c0;
                                                    float f100 = (f99 - iArr6[i11]) - chatActivityEnterView.j5;
                                                    float f101 = fArr4[4] - iArr6[i10];
                                                    Rect rect3 = rect;
                                                    float f102 = rect3.left;
                                                    float f103 = rect3.top;
                                                    float f104 = f18;
                                                    int round = Math.round(org.telegram.messenger.g0.T1(f102, f100, f104));
                                                    int round2 = Math.round(org.telegram.messenger.g0.T1(f103, f101, f104));
                                                    drawable6.setBounds(round, round2, intrinsicWidth + round, intrinsicHeight + round2);
                                                    this.d0 = 1.0f - f104;
                                                    A = (int) (f98 * 255.0f);
                                                }
                                            }
                                            int i29 = A;
                                            float f105 = this.Q;
                                            if (f105 <= f25 || chatActivityEnterView.f5 != 0.0f) {
                                                drawable4 = drawable6;
                                                i12 = i14;
                                                c(canvas3, drawable4, drawable5, this.f, i29);
                                            } else {
                                                float f106 = i29;
                                                int i30 = (int) ((1.0f - f105) * f106);
                                                drawable4 = drawable6;
                                                c(canvas3, drawable4, drawable5, this.f, i30);
                                                float T16 = org.telegram.messenger.g0.T1(0.6f, 1.0f, this.Q) * org.telegram.messenger.g0.N(6.5f);
                                                Paint paint9 = this.R;
                                                paint9.setColor(-1);
                                                paint9.setAlpha((int) (f106 * this.Q));
                                                RectF rectF4 = org.telegram.messenger.g0.P;
                                                i12 = i14;
                                                float f107 = i12;
                                                rectF4.set(f107 - T16, f26 - T16, f107 + T16, T16 + f26);
                                                canvas3.drawRoundRect(rectF4, org.telegram.messenger.g0.N(f29), org.telegram.messenger.g0.N(f29), paint9);
                                            }
                                            canvas3.restore();
                                        } else {
                                            drawable4 = drawable6;
                                            i12 = i14;
                                        }
                                    }
                                    paint2 = paint3;
                                    max = f27;
                                    f26 = f28;
                                    f30 = 1.0f;
                                    if (i13 != 0) {
                                    }
                                } else {
                                    i12 = measuredWidth;
                                    f26 = f42;
                                    drawable4 = drawable2;
                                    drawable5 = drawable3;
                                }
                            }
                            if (chatActivityEnterView.X4 != 1.0f) {
                                canvas3.drawCircle(i12 + chatActivityEnterView.j5, f26, max, paint2);
                                float f108 = chatActivityEnterView.h5 ? 1.0f - chatActivityEnterView.Z4 : 1.0f;
                                canvas3.save();
                                canvas3.translate(chatActivityEnterView.j5, 0.0f);
                                float L6 = (max - org.telegram.messenger.g0.L(19.0f)) / Math.max(1.0f, f12 - org.telegram.messenger.g0.L(19.0f));
                                this.d0 = L6 < 0.0f ? 0.0f : L6 > 1.0f ? 1.0f : L6;
                                c(canvas3, drawable4, drawable5, this.f, (int) (f108 * 255.0f));
                                canvas.restore();
                            }
                            this.M = max;
                        }
                    }
                    f23 = 1.0f;
                    f24 = 1.0f;
                    float f632 = (chatActivityEnterView.i0() ? f23 - chatActivityEnterView.B6 : f23) * f24;
                    if (org.telegram.messenger.pc.e(360928)) {
                    }
                    drawable2 = drawable8;
                    drawable3 = drawable9;
                    f25 = 0.01f;
                    i11 = 0;
                    float max4 = (chatActivityEnterView.h5 || chatActivityEnterView.Z4 >= 1.0f) ? f19 : Math.max(f19, org.telegram.messenger.g0.L(19.0f));
                    if (this.N) {
                    }
                    if (chatActivityEnterView.X4 != 1.0f) {
                    }
                    this.M = max4;
                }
            } else {
                f11 = 0.6f;
            }
            f12 = f50;
            float f109 = chatActivityEnterView.c5;
            if (f109 != 0.0f && chatActivityEnterView.E1) {
                f13 = 0.0f;
                f14 = 0.0f;
                f16 = 0.0f;
                f17 = 0.0f;
                f15 = 1.0f;
            } else if (f109 != 0.0f) {
                float f110 = f109 > f11 ? 1.0f : f109 / f11;
                if (!chatActivityEnterView.h0) {
                    f109 = org.telegram.ui.Cells.c0.x(f109, f11, 0.4f, 0.0f);
                }
                kr krVar2 = kr.j;
                f17 = krVar2.getInterpolation(f110);
                float interpolation4 = krVar2.getInterpolation(f109);
                float L7 = ((org.telegram.messenger.g0.L(16.0f) * f17) + f51) * (1.0f - interpolation4);
                if (org.telegram.messenger.pc.e(360928)) {
                    float f111 = chatActivityEnterView.c5;
                    if (f111 > 0.6f) {
                        f16 = Math.max(0.0f, 1.0f - ((f111 - 0.6f) / 0.4f));
                        f15 = interpolation4;
                        f13 = L7;
                        f14 = 0.0f;
                    }
                }
                f15 = interpolation4;
                f13 = L7;
                f14 = 0.0f;
                f16 = 1.0f;
            } else {
                f13 = f51;
                f14 = 0.0f;
                f15 = 0.0f;
                f16 = 1.0f;
                f17 = 0.0f;
            }
            i02 = chatActivityEnterView.i0();
            float f542 = f15;
            float[] fArr22 = this.b0;
            float f552 = f16;
            if (i02) {
            }
            if (this.e <= 0.0f) {
            }
            b();
            Drawable drawable72 = null;
            if (chatActivityEnterView.i5) {
            }
            Drawable drawable82 = drawable;
            Drawable drawable92 = drawable72;
            drawable82.setBounds(rect2);
            if (this.x) {
            }
            e10 = org.telegram.messenger.pc.e(360928);
            v9 v9Var3 = this.n;
            v9 v9Var22 = this.h;
            if (e10) {
            }
            this.d = System.currentTimeMillis();
            float f602 = chatActivityEnterView.Z4;
            if (f602 <= 0.7f) {
            }
            if (chatActivityEnterView.E1) {
            }
            f23 = 1.0f;
            f24 = 1.0f;
            float f6322 = (chatActivityEnterView.i0() ? f23 - chatActivityEnterView.B6 : f23) * f24;
            if (org.telegram.messenger.pc.e(360928)) {
            }
            drawable2 = drawable82;
            drawable3 = drawable92;
            f25 = 0.01f;
            i11 = 0;
            float max42 = (chatActivityEnterView.h5 || chatActivityEnterView.Z4 >= 1.0f) ? f19 : Math.max(f19, org.telegram.messenger.g0.L(19.0f));
            if (this.N) {
            }
            if (chatActivityEnterView.X4 != 1.0f) {
            }
            this.M = max42;
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
            chatActivityEnterView.j5 = (int) ((1.0f - chatActivityEnterView.Z4) * (-measuredWidth));
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
            chatActivityEnterView.Y4 = f10;
            qg qgVar = chatActivityEnterView.E2;
            if (qgVar != null) {
                qgVar.invalidate();
            }
        }

        public void setScale(float f10) {
            ChatActivityEnterView.this.X4 = f10;
            invalidate();
        }

        public void setTransformToSeekbar(float f10) {
            ChatActivityEnterView.this.f5 = f10;
            invalidate();
        }
    }

    /* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
            int i7 = org.telegram.ui.ActionBar.n6.Nl;
            int i10 = ChatActivityEnterView.s7;
            paint.setColor(ChatActivityEnterView.this.G0(i7));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(org.telegram.messenger.g0.N(z10 ? 1.0f : 1.6f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            String N0 = org.telegram.messenger.gd.N0(2131745117, null);
            this.d = N0;
            String N02 = org.telegram.messenger.gd.N0(2131752577, "Cancel");
            this.e = N02;
            this.x = N0.toLowerCase().indexOf(N02.toLowerCase());
            b();
        }

        public final void a() {
            this.r = 1.0f;
        }

        public final void b() {
            int i7 = org.telegram.ui.ActionBar.n6.eg;
            int i10 = ChatActivityEnterView.s7;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            int G0 = chatActivityEnterView.G0(i7);
            TextPaint textPaint = this.a;
            textPaint.setColor(G0);
            int i11 = org.telegram.ui.ActionBar.n6.dg;
            int G02 = chatActivityEnterView.G0(i11);
            this.b.setColor(G02);
            textPaint.getAlpha();
            this.s = r4.getAlpha();
            org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.n6.j0(org.telegram.messenger.g0.L(60.0f), 0, i0.a.o(chatActivityEnterView.G0(i11), 26));
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
            qg qgVar;
            if (this.E == null || (staticLayout = this.F) == null) {
                return;
            }
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (chatActivityEnterView.D2 == null) {
                return;
            }
            int L = org.telegram.messenger.g0.L(16.0f) + staticLayout.getWidth();
            int G0 = (org.telegram.messenger.g0.B(chatActivityEnterView.G0(org.telegram.ui.ActionBar.n6.d6)) >= 0.5f || (qgVar = chatActivityEnterView.E2) == null) ? chatActivityEnterView.G0(org.telegram.ui.ActionBar.n6.eg) : qgVar.s.getColor();
            TextPaint textPaint = this.a;
            textPaint.setColor(G0);
            textPaint.setAlpha((int) ((1.0f - this.n) * Color.alpha(G0) * this.r));
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
                int translationX = (int) ((chatActivityEnterView.D2.getTranslationX() * 0.3f) + ((1.0f - this.r) * ((-getMeasuredWidth()) / 4)));
                canvas.save();
                vg vgVar = chatActivityEnterView.Z0;
                f13 = 2.0f;
                canvas.clipRect((vgVar == null ? 0.0f : vgVar.getLeftProperty()) + org.telegram.messenger.g0.L(f10), 0.0f, getMeasuredWidth(), getMeasuredHeight());
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
                if (chatActivityEnterView.U2 && chatActivityEnterView.d1) {
                    CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.x4);
                    chatActivityEnterView.P3.o2(5, 0, chatActivityEnterView.P ? Integer.MAX_VALUE : 0, chatActivityEnterView.P6, 0L, true);
                    se seVar = chatActivityEnterView.K0;
                    chatActivityEnterView.P6 = 0L;
                    seVar.setEffect(0L);
                } else {
                    chatActivityEnterView.P3.U0(0);
                    MediaController.B().B0(0, 0, false, chatActivityEnterView.P);
                }
                chatActivityEnterView.R3 = null;
                chatActivityEnterView.T3 = null;
                chatActivityEnterView.U3 = null;
                chatActivityEnterView.Y1 = 0L;
                chatActivityEnterView.v3 = false;
                org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(chatActivityEnterView.R);
                long j10 = chatActivityEnterView.G3;
                org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
                if (bnVar != null && bnVar.x4) {
                    j3 = bnVar.b();
                }
                d02.F1(j10, j3, null);
                chatActivityEnterView.u2(2, true);
                chatActivityEnterView.P(true);
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

    public ChatActivityEnterView(Activity activity, cu0 cu0Var, org.telegram.ui.bn bnVar, boolean z10, final org.telegram.ui.ActionBar.i6 i6Var) {
        super(activity);
        int i7;
        String str;
        mg mgVar;
        this.h = 1.0f;
        this.n = 1.0f;
        this.r = 1.0f;
        this.s = 1.0f;
        this.F = 1.0f;
        this.G = 1.0f;
        this.J = 0.0f;
        final int i10 = 1;
        this.K = true;
        int i11 = org.telegram.messenger.i10.t0;
        this.R = i11;
        this.S = org.telegram.messenger.c.a(i11);
        this.U = 1;
        this.d0 = -1;
        this.q7 = 1;
        this.y0 = true;
        this.z0 = true;
        this.A0 = true;
        this.C0 = new HashMap();
        new ie(0);
        this.D0 = false;
        this.E0 = false;
        int i12 = 18;
        this.q1 = new dd(this, i12);
        this.z1 = 1.0f;
        this.C1 = new SparseArray();
        this.O1 = new Paint(1);
        this.R1 = new int[2];
        this.S1 = new int[2];
        this.X1 = new td(this, 7);
        this.l2 = 1.0f;
        this.V2 = -1;
        this.Z2 = true;
        this.t3 = -1.0f;
        this.u3 = org.telegram.messenger.g0.L(80.0f);
        this.D3 = new int[2];
        this.O3 = true;
        this.e4 = -1;
        this.g4 = true;
        this.h4 = new ue(this, 0);
        this.i4 = new xe(this);
        this.j4 = new org.telegram.ui.Cells.h1(Integer.class, "translationY", i10);
        this.k4 = new lf(Float.class, "scale");
        this.l4 = new tf(Float.class, "controlsScale");
        this.m4 = new Paint(1);
        this.x4 = new ue(this, 2);
        this.A4 = new bg(this);
        this.B4 = new h2.f((int[]) null);
        this.C4 = new Paint(1);
        this.I4 = new RectF();
        this.J4 = new Rect();
        this.K4 = new Rect();
        this.O4 = new ue(this, 3);
        this.P4 = new de(this, 0);
        this.Q4 = new de(this, 1);
        this.R4 = new de(this, 2);
        this.S4 = new de(this, 3);
        this.T4 = new de(this, 4);
        this.n5 = new TextPaint(1);
        this.o5 = new Paint(1);
        this.p5 = new Paint(1);
        this.q5 = new Path();
        this.r5 = new Path();
        this.s5 = new RectF();
        this.t5 = new int[2];
        this.u5 = new int[2];
        this.x5 = new nb.a(i12);
        this.Q5 = new Paint(2);
        this.U5 = 1.0f;
        this.V5 = 1.0f;
        this.X5 = true;
        this.Y5 = true;
        this.b6 = new Paint();
        this.c6 = 1.0f;
        this.d6 = new Rect();
        this.f6 = new td(this, 12);
        this.i6 = true;
        this.p6 = -1;
        this.w6 = new RectF();
        this.G6 = new float[2];
        this.H6 = new float[2];
        this.I6 = new int[2];
        this.L6 = new kq[1];
        this.r7 = 1;
        this.W6 = -1;
        Paint paint = new Paint(1);
        this.Z6 = paint;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.a7 = linearGradient;
        this.b7 = new Matrix();
        kr krVar = kr.h;
        this.c7 = new c6(this, 0L, 280L, krVar);
        this.d7 = new c6(this, 0L, 280L, krVar);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setShader(linearGradient);
        kr krVar2 = pi.k.V;
        this.g7 = new te.c(0, this, krVar2, 250L);
        this.h7 = new te.a(1, this, krVar2, 250L, false);
        this.i7 = new te.a(2, this, krVar, 320L, false);
        this.j7 = new te.a(3, this, krVar, 320L, false);
        this.n7 = new int[2];
        this.o7 = new int[2];
        this.M4 = i6Var;
        this.N4 = z10;
        this.Y2 = z10 && !org.telegram.messenger.g0.E && (bnVar == null || !bnVar.isInBubbleMode());
        Paint paint2 = new Paint(1);
        this.G2 = paint2;
        paint2.setColor(G0(org.telegram.ui.ActionBar.n6.Sf));
        setFocusable(true);
        setFocusableInTouchMode(true);
        setWillNotDraw(false);
        setClipChildren(false);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.l2);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.o2);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.p2);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.m2);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.X5);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.n2);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.k2);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.t);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.s2);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.u2);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.e2);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.z0);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.L);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.n1);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.t2);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.T2);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.a3);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.i5);
        org.telegram.messenger.ks.f(this.R).c(this, org.telegram.messenger.ks.S3);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.l4);
        this.E3 = activity;
        this.F3 = bnVar;
        if (bnVar != null) {
            this.w3 = bnVar.getClassGuid();
        }
        this.c2 = cu0Var;
        this.d2 = cu0Var;
        cu0Var.setDelegate(this);
        this.r3 = org.telegram.messenger.mp.g1().getBoolean("send_by_enter", false);
        ee eeVar = new ee(this, activity, 0);
        this.p2 = eeVar;
        eeVar.setClipChildren(false);
        eeVar.setClipToPadding(false);
        eeVar.setPadding(0, org.telegram.messenger.g0.L(1.0f), 0, 0);
        addView(eeVar, c8.na.d(-1, -2.0f, 83, 0.0f, 1.0f, 0.0f, 0.0f));
        ee eeVar2 = new ee(this, activity, i10);
        this.o2 = eeVar2;
        eeVar2.setClipChildren(false);
        eeVar.addView(eeVar2, c8.na.d(-1, -2.0f, 80, 0.0f, 0.0f, 44.0f, 0.0f));
        ge geVar = new ge(this, activity);
        this.R0 = geVar;
        geVar.setContentDescription(org.telegram.messenger.gd.N0(2131754884, null));
        geVar.setFocusable(true);
        int L = org.telegram.messenger.g0.L(7.5f);
        geVar.setPadding(L, L, L, L);
        int i13 = org.telegram.ui.ActionBar.n6.Nl;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.u6.s(geVar, i13, i6Var, mode);
        int i14 = org.telegram.ui.ActionBar.n6.i6;
        int G0 = G0(i14);
        float L2 = org.telegram.messenger.g0.L(19.0f);
        int L3 = org.telegram.messenger.g0.L(1.0f);
        int L4 = org.telegram.messenger.g0.L(3.0f);
        geVar.setBackground(org.telegram.ui.ActionBar.n6.Y(L2, G0, L3, L4, L3, L4));
        geVar.setOnClickListener(new id(this, 21));
        eeVar2.addView(geVar, c8.na.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        G1(false, false);
        ImageView imageView = new ImageView(activity);
        this.S0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.menu_delete_old);
        org.telegram.ui.ActionBar.u6.s(imageView, i13, i6Var, mode);
        int G02 = G0(i14);
        float L5 = org.telegram.messenger.g0.L(19.0f);
        int L6 = org.telegram.messenger.g0.L(1.0f);
        int L7 = org.telegram.messenger.g0.L(3.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.n6.Y(L5, G02, L6, L7, L6, L7));
        imageView.setVisibility(8);
        imageView.setContentDescription(org.telegram.messenger.gd.N0(2131754035, null));
        final int i15 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fd
            public final /* synthetic */ ChatActivityEnterView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        int i16 = ChatActivityEnterView.s7;
                        ChatActivityEnterView chatActivityEnterView = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, chatActivityEnterView.getContext(), i6Var);
                        String N0 = org.telegram.messenger.gd.N0(2131754033, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                        t1Var.S = N0;
                        t1Var.U = org.telegram.messenger.gd.N0(2131754034, null);
                        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new qd(chatActivityEnterView));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.p();
                        break;
                    default:
                        int i17 = ChatActivityEnterView.s7;
                        org.telegram.messenger.mp.g1().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.b;
                        org.telegram.ui.bn bnVar2 = chatActivityEnterView2.F3;
                        long a10 = bnVar2 != null ? bnVar2.a() : chatActivityEnterView2.G3;
                        boolean z11 = chatActivityEnterView2.t2;
                        org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                        if (!z11) {
                            if (chatActivityEnterView2.F0 != null) {
                                m0 m0Var = new m0(chatActivityEnterView2.getContext(), i6Var2);
                                m0Var.x1(chatActivityEnterView2.F0.getText());
                                m0Var.S2 = new dd(chatActivityEnterView2, 23);
                                m0Var.f2 = new ud(chatActivityEnterView2, 2);
                                m0Var.v1(a10, chatActivityEnterView2.P2 != null, new vd(chatActivityEnterView2, a10, i6Var2, 1));
                                m0Var.show();
                                break;
                            }
                        } else if (chatActivityEnterView2.u2 != null) {
                            m0 m0Var2 = new m0(chatActivityEnterView2.getContext(), i6Var2);
                            m0Var2.w1(chatActivityEnterView2.u2);
                            m0Var2.g2 = new ud(chatActivityEnterView2, 1);
                            vd vdVar = new vd(chatActivityEnterView2, a10, i6Var2, 0);
                            m0Var2.h2 = a10;
                            m0Var2.k2 = vdVar;
                            m0Var2.show();
                            break;
                        }
                        break;
                }
            }
        });
        eeVar2.addView(imageView, c8.na.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            int i16 = bnVar != null ? bnVar.g4 : -1;
            org.telegram.ui.b61 b61Var = new org.telegram.ui.b61(11, activity, this);
            this.f2 = b61Var;
            b61Var.setOrientation(0);
            b61Var.setEnabled(false);
            b61Var.setClipChildren(false);
            eeVar2.addView(b61Var, c8.na.d(-2, 44.0f, 85, 0.0f, 0.0f, 44.0f, 0.0f));
            if (i16 != 9) {
                ImageView imageView2 = new ImageView(activity);
                this.y2 = imageView2;
                hr hrVar = new hr(activity, R.drawable.input_notify_on, i13);
                this.f0 = hrVar;
                imageView2.setImageDrawable(hrVar);
                this.f0.a(this.W2, false);
                if (this.W2) {
                    i7 = 2131754906;
                    str = "AccDescrChanSilentOn";
                } else {
                    i7 = 2131754907;
                    str = "AccDescrChanSilentOff";
                }
                imageView2.setContentDescription(org.telegram.messenger.gd.N0(i7, str));
                org.telegram.ui.ActionBar.u6.s(imageView2, i13, i6Var, PorterDuff.Mode.MULTIPLY);
                imageView2.setScaleType(scaleType);
                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(G0(i14), 1, -1);
                org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i14);
                imageView2.setBackground(h02);
                org.telegram.ui.ActionBar.u6.j(imageView2, h02, null, M, i6Var);
                imageView2.setVisibility((!this.X2 || ((mgVar = this.P3) != null && mgVar.w0())) ? 8 : 0);
                b61Var.addView(imageView2, c8.na.o(44, 44));
                imageView2.setOnClickListener(new he(this, bnVar, activity));
            }
            je jeVar = new je(this, activity, 0);
            this.h2 = jeVar;
            jeVar.setScaleType(scaleType);
            org.telegram.ui.ActionBar.u6.s(jeVar, i13, i6Var, PorterDuff.Mode.MULTIPLY);
            jeVar.setImageResource(R.drawable.msg_input_attach2);
            org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.n6.h0(G0(i14), 1, -1);
            org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i14);
            jeVar.setBackground(h03);
            org.telegram.ui.ActionBar.u6.j(jeVar, h03, null, M2, i6Var);
            eeVar2.addView(jeVar, c8.na.e(44, 44, 85));
            jeVar.setOnClickListener(new id(this, i10));
            jeVar.setContentDescription(org.telegram.messenger.gd.N0(2131754921, null));
            q2(1);
        }
        ImageView imageView3 = new ImageView(activity);
        this.j2 = imageView3;
        org.telegram.ui.ActionBar.v2 v2Var = new org.telegram.ui.ActionBar.v2(activity);
        this.i2 = v2Var;
        imageView3.setImageDrawable(v2Var);
        imageView3.setScaleType(scaleType);
        PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.u6.s(imageView3, i13, i6Var, mode2);
        org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.n6.h0(G0(i14), 1, org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.q6 M3 = org.telegram.ui.ActionBar.u6.M(i14);
        imageView3.setBackground(h04);
        org.telegram.ui.ActionBar.u6.j(imageView3, h04, null, M3, i6Var);
        eeVar.addView(imageView3, c8.na.d(44, 44.0f, 51, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView3.setContentDescription(org.telegram.messenger.gd.N0(2131755006, null));
        c8.sa.a(imageView3);
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fd
            public final /* synthetic */ ChatActivityEnterView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        int i162 = ChatActivityEnterView.s7;
                        ChatActivityEnterView chatActivityEnterView = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, chatActivityEnterView.getContext(), i6Var);
                        String N0 = org.telegram.messenger.gd.N0(2131754033, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                        t1Var.S = N0;
                        t1Var.U = org.telegram.messenger.gd.N0(2131754034, null);
                        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new qd(chatActivityEnterView));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.p();
                        break;
                    default:
                        int i17 = ChatActivityEnterView.s7;
                        org.telegram.messenger.mp.g1().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.b;
                        org.telegram.ui.bn bnVar2 = chatActivityEnterView2.F3;
                        long a10 = bnVar2 != null ? bnVar2.a() : chatActivityEnterView2.G3;
                        boolean z11 = chatActivityEnterView2.t2;
                        org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                        if (!z11) {
                            if (chatActivityEnterView2.F0 != null) {
                                m0 m0Var = new m0(chatActivityEnterView2.getContext(), i6Var2);
                                m0Var.x1(chatActivityEnterView2.F0.getText());
                                m0Var.S2 = new dd(chatActivityEnterView2, 23);
                                m0Var.f2 = new ud(chatActivityEnterView2, 2);
                                m0Var.v1(a10, chatActivityEnterView2.P2 != null, new vd(chatActivityEnterView2, a10, i6Var2, 1));
                                m0Var.show();
                                break;
                            }
                        } else if (chatActivityEnterView2.u2 != null) {
                            m0 m0Var2 = new m0(chatActivityEnterView2.getContext(), i6Var2);
                            m0Var2.w1(chatActivityEnterView2.u2);
                            m0Var2.g2 = new ud(chatActivityEnterView2, 1);
                            vd vdVar = new vd(chatActivityEnterView2, a10, i6Var2, 0);
                            m0Var2.h2 = a10;
                            m0Var2.k2 = vdVar;
                            m0Var2.show();
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
        org.telegram.ui.ActionBar.u6.s(imageView4, i13, i6Var, mode2);
        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.n6.h0(G0(i14), 1, org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.q6 M4 = org.telegram.ui.ActionBar.u6.M(i14);
        imageView4.setBackground(h05);
        org.telegram.ui.ActionBar.u6.j(imageView4, h05, null, M4, i6Var);
        eeVar.addView(imageView4, c8.na.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(org.telegram.messenger.gd.N0(2131754030, null));
        c8.sa.a(imageView4);
        imageView4.setOnClickListener(new id(this, 3));
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setScaleX(0.6f);
        imageView4.setScaleY(0.6f);
        if (this.R3 != null) {
            c0();
        }
        ImageView imageView5 = new ImageView(activity);
        this.r2 = imageView5;
        imageView5.setImageResource(R.drawable.send_outline);
        imageView5.setScaleType(scaleType);
        imageView5.setVisibility(8);
        org.telegram.ui.ActionBar.u6.s(imageView5, org.telegram.ui.ActionBar.n6.Yl, i6Var, mode);
        eeVar.addView(imageView5, c8.na.e(44, 44, 85));
        ee eeVar3 = new ee(this, activity, 2);
        this.q2 = eeVar3;
        eeVar3.setClipChildren(false);
        eeVar3.setClipToPadding(false);
        eeVar.addView(eeVar3, c8.na.e(100, 44, 85));
        pe peVar = new pe(this, activity, i6Var);
        this.a1 = peVar;
        peVar.setSoundEffectsEnabled(false);
        eeVar3.addView(peVar, c8.na.e(44, 44, 85));
        peVar.setFocusable(true);
        peVar.setImportantForAccessibility(1);
        Drawable mutate = getResources().getDrawable(R.drawable.input_mic).mutate();
        this.D4 = mutate;
        org.telegram.ui.ActionBar.u6.x(this, mutate, i13, i6Var, mode2);
        Drawable mutate2 = getResources().getDrawable(R.drawable.input_video).mutate();
        this.E4 = mutate2;
        org.telegram.ui.ActionBar.u6.x(this, mutate2, i13, i6Var, mode2);
        qe qeVar = new qe(this, activity);
        this.c1 = qeVar;
        qeVar.setImportantForAccessibility(2);
        int L8 = org.telegram.messenger.g0.L(10.0f);
        qeVar.setPadding(L8, L8, L8, L8);
        peVar.addView(qeVar, c8.na.c(44.0f, 44));
        ImageView imageView6 = new ImageView(activity);
        this.Q0 = imageView6;
        imageView6.setVisibility(4);
        imageView6.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        re reVar = new re();
        this.F2 = reVar;
        imageView6.setImageDrawable(reVar);
        imageView6.setContentDescription(org.telegram.messenger.gd.N0(2131752577, "Cancel"));
        imageView6.setSoundEffectsEnabled(false);
        imageView6.setScaleX(0.1f);
        imageView6.setScaleY(0.1f);
        imageView6.setAlpha(0.0f);
        org.telegram.ui.Cells.y h06 = org.telegram.ui.ActionBar.n6.h0(G0(i14), 1, -1);
        org.telegram.ui.ActionBar.q6 M5 = org.telegram.ui.ActionBar.u6.M(i14);
        imageView6.setBackground(h06);
        org.telegram.ui.ActionBar.u6.j(imageView6, h06, null, M5, i6Var);
        eeVar3.addView(imageView6, c8.na.e(44, 44, 85));
        imageView6.setOnClickListener(new id(this, 4));
        se seVar = new se(this, activity, c() ? R.drawable.input_schedule : R.drawable.send_plane_24, i6Var);
        this.K0 = seVar;
        seVar.setVisibility(4);
        seVar.setContentDescription(org.telegram.messenger.gd.N0(2131745444, null));
        int i17 = 0;
        seVar.setSoundEffectsEnabled(false);
        seVar.setScaleX(0.1f);
        seVar.setScaleY(0.1f);
        seVar.setAlpha(0.0f);
        eeVar3.addView(seVar, c8.na.e(100, 44, 85));
        seVar.setOnClickListener(new id(this, 5));
        seVar.setOnLongClickListener(new rd(this, i17));
        if (org.telegram.messenger.g0.C1()) {
            eeVar3.setOnLongClickListener(new rd(this, i17));
        }
        jh.h hVar = new jh.h(activity, i6Var);
        this.J0 = hVar;
        hVar.setVisibility(4);
        hVar.setOnClickListener(new id(this, 12));
        eeVar3.addView(hVar, c8.na.e(44, 44, 85));
        ug ugVar = new ug(activity);
        org.telegram.ui.ActionBar.n5 n5Var = (org.telegram.ui.ActionBar.n5) ugVar.c;
        this.G0 = ugVar;
        n5Var.setTextSize(16);
        ugVar.invalidate();
        ugVar.setVisibility(4);
        ugVar.setSoundEffectsEnabled(false);
        ugVar.setScaleX(0.1f);
        ugVar.setScaleY(0.1f);
        ugVar.setAlpha(0.0f);
        ugVar.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        n5Var.setGravity(21);
        ugVar.invalidate();
        n5Var.setTextColor(G0(i13));
        ugVar.invalidate();
        eeVar3.addView(ugVar, c8.na.e(74, 44, 85));
        ugVar.setOnClickListener(new id(this, 15));
        ugVar.setOnLongClickListener(new rd(this, i10));
        SharedPreferences f12 = org.telegram.messenger.mp.f1();
        this.n3 = f12.getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
        this.o3 = f12.getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
        O1(false, false);
        P(false);
        J();
        b0();
    }

    public static float H2(int i7) {
        int i10 = i7 * 668265261;
        int i11 = (i10 ^ (i10 >>> 15)) * (-2048144789);
        return ((i11 ^ (i11 >>> 13)) >>> 8) / 1.6777216E7f;
    }

    public static int I2(int i7) {
        return (Color.blue(i7) + ((Color.green(i7) * 6) + (Color.red(i7) * 3))) / 10;
    }

    public static float K2(float f10, float f11, float f12) {
        float i7 = Utilities.i((f12 - f10) / (f11 - f10), 1.0f, 0.0f);
        return com.google.android.gms.internal.vision.e2.C(i7, 2.0f, 3.0f, i7 * i7);
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
    public static boolean N(int i7, long j3, org.telegram.ui.ActionBar.g2 g2Var, CharSequence charSequence) {
        x5[] x5VarArr;
        int i10;
        int i11;
        TLRPC.ChatFull P0;
        TLRPC.TL_messages_stickerSet a02;
        ArrayList arrayList;
        int i12;
        ArrayList<TLRPC.Document> arrayList2;
        ArrayList<TLRPC.Document> arrayList3;
        Object obj;
        ArrayList<TLRPC.Document> arrayList4;
        boolean z10 = false;
        if (charSequence != null && g2Var != null && !org.telegram.messenger.i10.i(i7).q() && org.telegram.messenger.i10.i(i7).e() != j3 && (charSequence instanceof Spanned) && (x5VarArr = (x5[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), x5.class)) != null) {
            int i13 = 0;
            while (i13 < x5VarArr.length) {
                x5 x5Var = x5VarArr[i13];
                if (x5Var != null) {
                    TLRPC.Document document = x5Var.document;
                    if (document == null) {
                        i11 = i7;
                        document = o5.e(i11, x5Var.getDocumentId());
                    } else {
                        i11 = i7;
                    }
                    long documentId = x5VarArr[i13].getDocumentId();
                    if (document == null) {
                        ArrayList u02 = org.telegram.messenger.ri.d0(i11).u0(5);
                        int size = u02.size();
                        ?? r12 = z10;
                        ?? r62 = u02;
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
                        ArrayList arrayList6 = org.telegram.messenger.ri.d0(i11).t0[1];
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
                                    TLRPC.TL_messages_stickerSet o02 = org.telegram.messenger.ri.d0(i11).o0(tL_inputStickerSetID, true);
                                    if (o02 != null) {
                                        arrayList2 = o02.documents;
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
                    if (document != null && (P0 = org.telegram.messenger.mp.u1(i11).P0(-j3)) != null && P0.emojiset != null && (a02 = org.telegram.messenger.ri.d0(i11).a0(P0.emojiset)) != null) {
                        ArrayList<TLRPC.Document> arrayList8 = a02.documents;
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
                    if (document == null || !org.telegram.messenger.fj.m3(document)) {
                        kc.b0(g2Var).r(document, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131743617, "UnlockPremiumEmojiHint")), org.telegram.messenger.gd.N0(2131746839, "PremiumMore"), new kd(0, g2Var)).j();
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

    public static void f(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.bj bjVar, boolean z10, int i7, int i10, Object obj, Long l10, boolean z11) {
        if (chatActivityEnterView.H0 > 0 && !chatActivityEnterView.c()) {
            mg mgVar = chatActivityEnterView.P3;
            if (mgVar != null) {
                ug ugVar = chatActivityEnterView.G0;
                mgVar.s1(ugVar, ((org.telegram.ui.ActionBar.n5) ugVar.c).getText(), true);
                return;
            }
            return;
        }
        if (chatActivityEnterView.H2 != 0) {
            chatActivityEnterView.R1(0, true);
            chatActivityEnterView.V0.t(true);
            chatActivityEnterView.V0.A();
        }
        chatActivityEnterView.S1(false, true, false, true);
        mg mgVar2 = chatActivityEnterView.P3;
        TL_stories.StoryItem Y0 = mgVar2 != null ? mgVar2.Y0() : null;
        org.telegram.messenger.zy C = org.telegram.messenger.zy.C(chatActivityEnterView.R);
        long j3 = chatActivityEnterView.G3;
        org.telegram.messenger.fj fjVar = chatActivityEnterView.J3;
        org.telegram.messenger.fj threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.rm rmVar = chatActivityEnterView.L3;
        boolean z12 = obj instanceof TLRPC.TL_messages_stickerSet;
        org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
        C.v0(document, str, j3, fjVar, threadMessage, Y0, rmVar, bjVar, z10, i7, i10, z12, obj, bnVar != null ? bnVar.Y8() : null, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
        mg mgVar3 = chatActivityEnterView.P3;
        if (mgVar3 != null) {
            mgVar3.G(null, true, i7, 0, 0L);
        }
        if (z11) {
            chatActivityEnterView.setFieldText("");
        }
        org.telegram.messenger.ri.d0(chatActivityEnterView.R).d(0, obj, document, (int) (System.currentTimeMillis() / 1000), false);
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
        org.telegram.messenger.fj fjVar;
        org.telegram.messenger.fj fjVar2;
        boolean t02;
        org.telegram.messenger.fj fjVar3;
        mg mgVar;
        org.telegram.ui.bn bnVar;
        boolean z11 = chatActivityEnterView.J3 != null && (bnVar = chatActivityEnterView.F3) != null && bnVar.x4 && bnVar.b() == ((long) chatActivityEnterView.J3.e1());
        if (chatActivityEnterView.J3 == null || z11) {
            int i7 = chatActivityEnterView.R;
            long j3 = chatActivityEnterView.G3;
            if (j3 > 0) {
                z10 = org.telegram.messenger.n10.v(org.telegram.messenger.mp.u1(i7).c2(Long.valueOf(j3)));
            } else {
                org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(-j3));
                z10 = false;
            }
            if (!z10) {
                fjVar = org.telegram.messenger.n5.z(chatActivityEnterView.G3) ? chatActivityEnterView.c3 : null;
                fjVar2 = chatActivityEnterView.J3;
                if (fjVar2 != null || z11) {
                    fjVar2 = chatActivityEnterView.c3;
                }
                t02 = chatActivityEnterView.t0(keyboardButton, fjVar, fjVar2, null);
                if (chatActivityEnterView.J3 != null || z11) {
                    fjVar3 = chatActivityEnterView.c3;
                    if (fjVar3 != null && fjVar3.k.reply_markup.single_use) {
                        if (t02) {
                            chatActivityEnterView.Z1(0, 0, true, true);
                        } else {
                            chatActivityEnterView.k1();
                        }
                        org.telegram.messenger.mp.u1(chatActivityEnterView.R).h7.edit().putInt("answered_" + chatActivityEnterView.getTopicKeyString(), chatActivityEnterView.c3.e1()).commit();
                    }
                } else {
                    chatActivityEnterView.k1();
                    chatActivityEnterView.C1(chatActivityEnterView.M3, true, false);
                }
                mgVar = chatActivityEnterView.P3;
                if (mgVar == null) {
                    mgVar.G(null, true, 0, 0, 0L);
                    return;
                }
                return;
            }
        }
        fjVar = chatActivityEnterView.J3;
        fjVar2 = chatActivityEnterView.J3;
        if (fjVar2 != null) {
        }
        fjVar2 = chatActivityEnterView.c3;
        t02 = chatActivityEnterView.t0(keyboardButton, fjVar, fjVar2, null);
        if (chatActivityEnterView.J3 != null) {
        }
        fjVar3 = chatActivityEnterView.c3;
        if (fjVar3 != null) {
            if (t02) {
            }
            org.telegram.messenger.mp.u1(chatActivityEnterView.R).h7.edit().putInt("answered_" + chatActivityEnterView.getTopicKeyString(), chatActivityEnterView.c3.e1()).commit();
        }
        mgVar = chatActivityEnterView.P3;
        if (mgVar == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.telegram.messenger.fj getThreadMessage() {
        org.telegram.ui.bn bnVar = this.F3;
        if (bnVar != null) {
            return bnVar.m4;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getThreadMessageId() {
        org.telegram.messenger.fj fjVar;
        org.telegram.ui.bn bnVar = this.F3;
        if (bnVar == null || (fjVar = bnVar.m4) == null) {
            return 0;
        }
        return fjVar.e1();
    }

    private String getTopicKeyString() {
        org.telegram.ui.bn bnVar = this.F3;
        if (bnVar == null || !bnVar.x4) {
            return "" + this.G3;
        }
        return this.G3 + "_" + bnVar.b();
    }

    public static boolean h(ChatActivityEnterView chatActivityEnterView, View view, float[] fArr) {
        int[] iArr = chatActivityEnterView.I6;
        if (view == null || view.getWidth() <= 0 || !(view.getParent() instanceof View)) {
            return false;
        }
        ((View) view.getParent()).getLocationInWindow(iArr);
        fArr[0] = (view.getWidth() / 2.0f) + view.getX() + iArr[0];
        fArr[1] = (view.getHeight() / 2.0f) + view.getY() + iArr[1];
        return true;
    }

    public static CharSequence s(Paint.FontMetricsInt fontMetricsInt, CharSequence charSequence, ArrayList arrayList) {
        boolean z10;
        boolean z11;
        Collections.sort(arrayList, org.telegram.messenger.ri.g2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k00.a(charSequence, false));
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
                            u41 u41Var = new u41("" + ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id, 3, null);
                            int i10 = messageEntity.offset;
                            spannableStringBuilder.setSpan(u41Var, i10, messageEntity.length + i10, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            u41 u41Var2 = new u41("" + ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id, 3, null);
                            int i11 = messageEntity.offset;
                            spannableStringBuilder.setSpan(u41Var2, i11, messageEntity.length + i11, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityCode) {
                            ez0 ez0Var = new ez0();
                            ez0Var.a |= 4;
                            fz0 fz0Var = new fz0(ez0Var, 0);
                            int i12 = messageEntity.offset;
                            org.telegram.messenger.ri.f(fz0Var, i12, messageEntity.length + i12, spannableStringBuilder, true);
                        } else if (!(messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                            if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                ez0 ez0Var2 = new ez0();
                                ez0Var2.a |= 1;
                                fz0 fz0Var2 = new fz0(ez0Var2, 0);
                                int i13 = messageEntity.offset;
                                org.telegram.messenger.ri.f(fz0Var2, i13, messageEntity.length + i13, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                ez0 ez0Var3 = new ez0();
                                ez0Var3.a |= 2;
                                fz0 fz0Var3 = new fz0(ez0Var3, 0);
                                int i14 = messageEntity.offset;
                                org.telegram.messenger.ri.f(fz0Var3, i14, messageEntity.length + i14, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                ez0 ez0Var4 = new ez0();
                                ez0Var4.a |= 8;
                                fz0 fz0Var4 = new fz0(ez0Var4, 0);
                                int i15 = messageEntity.offset;
                                org.telegram.messenger.ri.f(fz0Var4, i15, messageEntity.length + i15, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                ez0 ez0Var5 = new ez0();
                                ez0Var5.a |= 16;
                                fz0 fz0Var5 = new fz0(ez0Var5, 0);
                                int i16 = messageEntity.offset;
                                org.telegram.messenger.ri.f(fz0Var5, i16, messageEntity.length + i16, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                t41 t41Var = new t41(messageEntity.url, null);
                                int i17 = messageEntity.offset;
                                spannableStringBuilder.setSpan(t41Var, i17, messageEntity.length + i17, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityFormattedDate) {
                                ez0 ez0Var6 = new ez0();
                                ez0Var6.a |= 128;
                                int i18 = messageEntity.offset;
                                ez0Var6.b = i18;
                                ez0Var6.c = i18 + messageEntity.length;
                                ez0Var6.d = messageEntity;
                                int i19 = messageEntity.offset;
                                k00 k00Var = new k00(spannableStringBuilder.subSequence(i19, messageEntity.length + i19).toString(), ez0Var6, (TLRPC.TL_messageEntityFormattedDate) messageEntity);
                                int i20 = messageEntity.offset;
                                spannableStringBuilder.setSpan(k00Var, i20, messageEntity.length + i20, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                ez0 ez0Var7 = new ez0();
                                ez0Var7.a |= 256;
                                fz0 fz0Var6 = new fz0(ez0Var7, 0);
                                int i21 = messageEntity.offset;
                                org.telegram.messenger.ri.f(fz0Var6, i21, messageEntity.length + i21, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                x5 x5Var = tL_messageEntityCustomEmoji.document != null ? new x5(tL_messageEntityCustomEmoji.document, fontMetricsInt) : new x5(tL_messageEntityCustomEmoji.document_id, fontMetricsInt);
                                int i22 = messageEntity.offset;
                                spannableStringBuilder.setSpan(x5Var, i22, messageEntity.length + i22, 33);
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
                        ih0.c(spannableStringBuilder, i26, i29, z13);
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
                ih0.c(spannableStringBuilder, i26, spannableStringBuilder.length(), z13);
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setHintGlass(hi.u3 u3Var) {
        org.telegram.ui.bn bnVar = this.F3;
        if (bnVar != null) {
            u3Var.l(bnVar.L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSlowModeButtonVisible(boolean z10) {
        int i7;
        int i10 = z10 ? 0 : 8;
        ug ugVar = this.G0;
        ugVar.setVisibility(i10);
        if (z10) {
            i7 = org.telegram.messenger.g0.L(ugVar.b ? 26.0f : 16.0f);
        } else {
            i7 = 0;
        }
        hf hfVar = this.F0;
        if (hfVar == null || hfVar.getPaddingRight() == i7) {
            return;
        }
        this.F0.setPadding(0, org.telegram.messenger.g0.L(9.0f), i7, org.telegram.messenger.g0.L(10.0f));
    }

    public final boolean A() {
        ki.y yVar = this.m0;
        return yVar != null && yVar.w;
    }

    public final ai.l0 A0() {
        if (this.j1 == null) {
            this.j1 = new ai.l0(getContext(), new rf(this));
        }
        return this.j1;
    }

    public final void A1(a0.h hVar, boolean z10) {
        this.Y6 = hVar;
        if (hVar.m() == 1 && ((TL_bots.BotInfo) hVar.n(0)).user_id == this.G3) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) hVar.n(0);
            TL_bots.BotMenuButton botMenuButton = botInfo.menu_button;
            if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                this.j0 = tL_botMenuButton.text;
                this.k0 = tL_botMenuButton.url;
                this.q7 = 3;
            } else if (botInfo.commands.isEmpty()) {
                this.q7 = 1;
            } else {
                this.q7 = 2;
            }
        } else {
            this.q7 = 1;
        }
        ki.x xVar = this.o0;
        if (xVar != null) {
            xVar.E(hVar);
        }
        k2(z10);
        M(z10);
    }

    public final void A2(boolean z10, boolean z11) {
        TLRPC.Chat chat;
        TLRPC.Peer peer;
        float f10;
        float f11;
        hf hfVar;
        qn0 qn0Var;
        qn0 qn0Var2;
        ee eeVar;
        if (this.P3 == null) {
            return;
        }
        b0();
        if (this.p7) {
            peer = this.P3.o();
            chat = null;
        } else {
            TLRPC.Chat O0 = org.telegram.messenger.mp.u1(this.R).O0(Long.valueOf(-this.G3));
            TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(this.R).P0(-this.G3);
            TLRPC.Peer peer2 = P0 != null ? P0.default_send_as : null;
            chat = O0;
            peer = peer2;
        }
        if (peer == null && this.P3.H() != null && !this.P3.H().peers.isEmpty()) {
            peer = this.P3.H().peers.get(0).peer;
        }
        org.telegram.ui.bn bnVar = this.F3;
        boolean z12 = (z10 || peer == null || (this.P3.H() != null && this.P3.H().peers.size() <= 1) || R0() || W0() || (((eeVar = this.f1) != null && eeVar.getVisibility() == 0) || ((!this.p7 && ((org.telegram.messenger.v3.V(chat) && !org.telegram.messenger.v3.k(chat)) || org.telegram.messenger.v3.p0(chat))) || (bnVar != null && bnVar.g4 == 9)))) ? false : true;
        if (z12) {
            h0();
        }
        if (peer != null) {
            if (peer.channel_id != 0) {
                TLRPC.Chat O02 = org.telegram.messenger.mp.u1(this.R).O0(Long.valueOf(peer.channel_id));
                if (O02 != null && (qn0Var2 = this.q0) != null) {
                    qn0Var2.setAvatar(O02);
                    this.q0.setContentDescription(org.telegram.messenger.gd.a0(null, null, 2131754775, O02.title));
                }
            } else {
                TLRPC.User c22 = org.telegram.messenger.mp.u1(this.R).c2(Long.valueOf(peer.user_id));
                if (c22 != null && (qn0Var = this.q0) != null) {
                    qn0Var.setAvatar(c22);
                    this.q0.setContentDescription(org.telegram.messenger.gd.a0(null, null, 2131754775, org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name)));
                }
            }
        }
        qn0 qn0Var3 = this.q0;
        boolean z13 = qn0Var3 != null && qn0Var3.getVisibility() == 0;
        int L = org.telegram.messenger.g0.L(2.0f);
        float f12 = z12 ? 0.0f : 1.0f;
        float f13 = z12 ? 1.0f : 0.0f;
        qn0 qn0Var4 = this.q0;
        if (qn0Var4 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qn0Var4.getLayoutParams();
            f11 = z12 ? ((-this.q0.getLayoutParams().width) - marginLayoutParams.leftMargin) - L : 0.0f;
            f10 = z12 ? 0.0f : ((-this.q0.getLayoutParams().width) - marginLayoutParams.leftMargin) - L;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        if (z13 == z12) {
            return;
        }
        qn0 qn0Var5 = this.q0;
        ValueAnimator valueAnimator = qn0Var5 == null ? null : (ValueAnimator) qn0Var5.getTag();
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.q0.setTag(null);
        }
        ge geVar = this.R0;
        if (!z12 && this.q0 != null && i0() && this.v3 && (hfVar = this.F0) != null && z11) {
            float translationX = this.F0.getTranslationX() + hfVar.getLeft();
            float translationX2 = geVar.getTranslationX() + geVar.getLeft();
            this.q0.setVisibility(8);
            this.q0.setTranslationX(0.0f);
            this.q0.setAlpha(0.0f);
            hf hfVar2 = this.F0;
            hfVar2.getViewTreeObserver().addOnPreDrawListener(new yf(this, hfVar2, translationX, translationX2));
            return;
        }
        if ((this.p7 || (bnVar != null && bnVar.b9() == 0 && bnVar.g6)) && z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            qn0 qn0Var6 = this.q0;
            if (qn0Var6 != null) {
                qn0Var6.setTranslationX(f11);
            }
            this.H = f11;
            s2();
            float f14 = f10;
            float f15 = f13;
            float f16 = f11;
            duration.addUpdateListener(new q5(this, f16, f14, f12, f15, 1));
            duration.addListener(new zf(this, z12, f12, f16, f15, f14));
            duration.start();
            qn0 qn0Var7 = this.q0;
            if (qn0Var7 != null) {
                qn0Var7.setTag(duration);
                return;
            }
            return;
        }
        float f17 = f13;
        boolean z14 = z12;
        float f18 = f10;
        if (z14) {
            h0();
        }
        qn0 qn0Var8 = this.q0;
        if (qn0Var8 != null) {
            qn0Var8.setVisibility(z14 ? 0 : 8);
            this.q0.setTranslationX(f18);
        }
        float f19 = z14 ? f18 : 0.0f;
        geVar.setTranslationX(f19);
        this.H = f19;
        s2();
        qn0 qn0Var9 = this.q0;
        if (qn0Var9 != null) {
            qn0Var9.setAlpha(f17);
            this.q0.setTag(null);
        }
    }

    public final boolean B() {
        ig C = C();
        return (TextUtils.equals(C.a, this.S2.a) && org.telegram.messenger.ri.M(this.S2.b, C.b)) ? false : true;
    }

    public final ji.n B0() {
        if (this.r1 == null) {
            this.r1 = new ji.n(getContext(), new qf(this));
        }
        return this.r1;
    }

    public final void B1(int i7, boolean z10, boolean z11) {
        this.e3 = i7;
        if (this.f3 == z10) {
            return;
        }
        this.f3 = z10;
        k2(z11);
    }

    public final void B2() {
        int b10;
        long starsPrice = getStarsPrice();
        if (starsPrice > 0) {
            starsPrice *= getMessagesCount();
        }
        if (this.k5 != starsPrice) {
            View sendButtonInternal = getSendButtonInternal();
            this.k5 = starsPrice;
            View sendButtonInternal2 = getSendButtonInternal();
            if (sendButtonInternal != sendButtonInternal2) {
                sendButtonInternal2.setVisibility(sendButtonInternal.getVisibility());
                sendButtonInternal2.setAlpha(sendButtonInternal.getAlpha());
                sendButtonInternal2.setScaleX(sendButtonInternal.getScaleX());
                sendButtonInternal2.setScaleY(sendButtonInternal.getScaleY());
                sendButtonInternal.setVisibility(8);
            }
            this.K0.i(1, starsPrice, true);
            q2(this.M6);
        }
        if (this.p7) {
            X();
            if (x()) {
                int[] iArr = org.telegram.messenger.mp.u1(this.R).a7;
                b10 = (iArr == null || iArr.length <= 2) ? 400 : iArr[2];
            } else {
                b10 = fi.t.b(this.R, (int) starsPrice, 1);
            }
            if (this.d0 != b10) {
                this.d0 = b10;
                if (b10 > 0) {
                    int i7 = b10 - this.e0;
                    if (i7 <= (this.p7 ? 5 : 100)) {
                        if (i7 < -9999) {
                            i7 = -9999;
                        }
                        X();
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
                        this.c0.setTextColor(G0(i7 < 0 ? org.telegram.ui.ActionBar.n6.p7 : org.telegram.ui.ActionBar.n6.y6));
                        return;
                    }
                }
                NumberTextView numberTextView2 = this.c0;
                if (numberTextView2 != null) {
                    numberTextView2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new be(this, 2));
                }
            }
        }
    }

    public final ig C() {
        hf hfVar = this.F0;
        CharSequence[] charSequenceArr = {org.telegram.messenger.g0.n1(hfVar == null ? "" : hfVar.getTextToUse())};
        ArrayList Y = org.telegram.messenger.ri.d0(this.R).Y(charSequenceArr, true, true);
        CharSequence charSequence = charSequenceArr[0];
        int size = Y.size();
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) Y.get(i7);
            if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                messageEntity.length = charSequence.length() - messageEntity.offset;
            }
        }
        ig igVar = new ig();
        igVar.a = charSequence.toString();
        igVar.b = Y;
        return igVar;
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
    public final void C1(org.telegram.messenger.fj fjVar, boolean z10, boolean z11) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        hf hfVar;
        org.telegram.messenger.fj fjVar2 = this.J3;
        if (fjVar2 != null && fjVar2 == this.c3 && fjVar2 != fjVar) {
            this.M3 = fjVar;
            return;
        }
        org.telegram.messenger.fj fjVar3 = this.c3;
        if (fjVar3 == null || fjVar3 != fjVar) {
            if (fjVar3 == null && fjVar == null) {
                return;
            }
            if (this.x2 == null) {
                ag agVar = new ag(this, this.E3, this.M4);
                this.x2 = agVar;
                agVar.setVisibility(8);
                this.Y0 = false;
                this.x2.setDelegate(new qd(this));
                this.d2.addView(this.x2);
            }
            this.c3 = fjVar;
            if (fjVar != null) {
                TLRPC.ReplyMarkup replyMarkup = fjVar.k.reply_markup;
                if (replyMarkup instanceof TLRPC.TL_replyKeyboardMarkup) {
                    tL_replyKeyboardMarkup = (TLRPC.TL_replyKeyboardMarkup) replyMarkup;
                    this.d3 = tL_replyKeyboardMarkup;
                    ag agVar2 = this.x2;
                    Point point = org.telegram.messenger.g0.q;
                    agVar2.setPanelHeight(point.x <= point.y ? this.o3 : this.n3);
                    if (this.d3 == null) {
                        SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(this.R).h7;
                        if (this.c3 != this.J3 && fjVar != null) {
                            if (this.d3.single_use) {
                            }
                            if (!this.d3.is_persistent) {
                            }
                        }
                        boolean z12 = true;
                        boolean z13 = z10 ? z12 : false;
                        this.x2.setButtons(this.d3);
                        if (z13 && (((hfVar = this.F0) == null || hfVar.length() == 0) && !T0())) {
                            Z1(1, 1, true, true);
                        }
                    } else if (T0() && this.V2 == 1) {
                        if (z11) {
                            this.f4 = true;
                            k1();
                        } else {
                            Z1(0, 1, true, true);
                        }
                    }
                    k2(true);
                }
            }
            tL_replyKeyboardMarkup = null;
            this.d3 = tL_replyKeyboardMarkup;
            ag agVar22 = this.x2;
            Point point2 = org.telegram.messenger.g0.q;
            agVar22.setPanelHeight(point2.x <= point2.y ? this.o3 : this.n3);
            if (this.d3 == null) {
            }
            k2(true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
    
        if (((java.lang.Integer) org.telegram.messenger.zy.C(r9.R).f.g(0, r9.G3)).intValue() > 0) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C2() {
        int i7;
        int currentTime = ConnectionsManager.getInstance(this.R).getCurrentTime();
        org.telegram.messenger.g0.r(this.I0);
        this.I0 = null;
        TLRPC.ChatFull chatFull = this.T2;
        if (chatFull != null && chatFull.slowmode_seconds != 0 && chatFull.slowmode_next_send_date <= currentTime) {
            boolean z10 = ((Integer) org.telegram.messenger.zy.C(this.R).h.g(0, this.G3)).intValue() > 0;
            if (!z10) {
            }
            if (!org.telegram.messenger.v3.N(org.telegram.messenger.mp.u1(this.S.a).O0(Long.valueOf(this.T2.id))) && !org.telegram.messenger.v3.i0(this.T2)) {
                i7 = this.T2.slowmode_seconds;
                this.H0 = z10 ? ConnectionsManager.DEFAULT_DATACENTER_ID : 2147483646;
                if (this.H0 != 0 || i7 <= 0) {
                    this.H0 = 0;
                } else {
                    String h02 = org.telegram.messenger.g0.h0(Math.max(1, i7), false);
                    ug ugVar = this.G0;
                    ((org.telegram.ui.ActionBar.n5) ugVar.c).l(h02, false);
                    ugVar.invalidate();
                    mg mgVar = this.P3;
                    if (mgVar != null) {
                        mgVar.s1(ugVar, ((org.telegram.ui.ActionBar.n5) ugVar.c).getText(), false);
                    }
                    dd ddVar = new dd(this, 21);
                    this.I0 = ddVar;
                    org.telegram.messenger.g0.h3(ddVar, 100L);
                }
                if (c()) {
                    P(true);
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
            if (this.T2 != null) {
                org.telegram.messenger.mp.u1(this.S.a).b3(0, this.T2.id, true);
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

    public final float D(boolean z10) {
        te.c cVar = this.g7;
        float f10 = z10 ? cVar.h ? cVar.g : cVar.f : cVar.f;
        te.a aVar = this.h7;
        return ((this.w2 != null ? r1.getMeasuredHeight() : 0) * (z10 ? aVar.f ? 1.0f : 0.0f : aVar.e)) + f10;
    }

    public final jh.f D0() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof jh.f) {
                return (jh.f) parent;
            }
        }
        return null;
    }

    public final void D1(org.telegram.messenger.fj fjVar, String str, boolean z10, boolean z11) {
        hf hfVar;
        org.telegram.messenger.xy b10;
        String sb2;
        if (str == null || getVisibility() != 0 || (hfVar = this.F0) == null) {
            return;
        }
        r16 = null;
        TLRPC.User user = null;
        if (!z10) {
            if (this.H0 > 0 && !c()) {
                mg mgVar = this.P3;
                if (mgVar != null) {
                    ug ugVar = this.G0;
                    mgVar.s1(ugVar, ((org.telegram.ui.ActionBar.n5) ugVar.c).getText(), true);
                    return;
                }
                return;
            }
            TLRPC.User c22 = (fjVar == null || !org.telegram.messenger.n5.z(this.G3)) ? null : org.telegram.messenger.mp.u1(this.S.a).c2(Long.valueOf(fjVar.k.from_id.user_id));
            if ((this.e3 != 1 || z11) && c22 != null && c22.bot && !str.contains("@")) {
                Locale locale = Locale.US;
                b10 = org.telegram.messenger.xy.b(a8.p0.E(str, "@", org.telegram.messenger.n10.o(c22)), this.G3, this.J3, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
            } else {
                b10 = org.telegram.messenger.xy.b(str, this.G3, this.J3, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
            }
            org.telegram.ui.bn bnVar = this.F3;
            b10.K = bnVar != null ? bnVar.Y8() : null;
            b10.O = this.P6;
            this.P6 = 0L;
            this.K0.setEffect(0L);
            v(b10);
            org.telegram.messenger.zy.C(this.R).r0(b10);
            return;
        }
        String obj = hfVar.getText().toString();
        if (fjVar != null && org.telegram.messenger.n5.z(this.G3)) {
            user = org.telegram.messenger.mp.u1(this.S.a).c2(Long.valueOf(fjVar.k.from_id.user_id));
        }
        TLRPC.User user2 = user;
        if ((this.e3 != 1 || z11) && user2 != null && user2.bot && !str.contains("@")) {
            StringBuilder sb3 = new StringBuilder();
            Locale locale2 = Locale.US;
            sb3.append(str + "@" + org.telegram.messenger.n10.o(user2));
            sb3.append(" ");
            sb3.append(obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
            sb2 = sb3.toString();
        } else {
            StringBuilder n10 = p5.c.n(str, " ");
            n10.append(obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
            sb2 = n10.toString();
        }
        this.H3 = true;
        this.F0.setText(sb2);
        hf hfVar2 = this.F0;
        hfVar2.setSelection(hfVar2.getText().length());
        this.H3 = false;
        mg mgVar2 = this.P3;
        if (mgVar2 != null) {
            mgVar2.i1(this.F0.getText(), true, false);
        }
        if (this.p3 || this.V2 != -1) {
            return;
        }
        j1();
    }

    public final long D2(String str, Runnable runnable) {
        long j3;
        RecordCircle recordCircle;
        if (this.v3 || this.R3 == null) {
            j3 = 0;
        } else {
            t1();
            j3 = Math.max(0L, 420L);
        }
        if (this.v3 || ((recordCircle = this.D2) != null && ChatActivityEnterView.this.i5)) {
            this.Y1 = 0L;
            this.D1 = true;
            try {
                F();
            } finally {
                this.D1 = false;
            }
        }
        org.telegram.messenger.g0.h3(new org.telegram.ui.Cells.fa(this, str, runnable, 3), j3);
        return j3;
    }

    public final void E() {
        bi.v2 v2Var = this.e1;
        if (v2Var != null) {
            v2Var.setVisibility(8);
        }
        RecordCircle recordCircle = this.D2;
        if (recordCircle != null) {
            recordCircle.setVisibility(8);
        }
        this.j3 = null;
        X0();
        if (this.f2 != null) {
            this.y = 0.0f;
            j2();
        }
        SlideTextView slideTextView = this.a2;
        if (slideTextView != null) {
            slideTextView.setCancelToProgress(0.0f);
        }
        this.P3.b();
        z2(true);
    }

    public final long E0() {
        if (this.G1 <= 0) {
            return 250L;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j3 = this.G1;
        if (uptimeMillis < j3) {
            return Math.max(16L, j3 - SystemClock.uptimeMillis());
        }
        return 250L;
    }

    public final void E1(int i7, long j3) {
        this.G3 = j3;
        org.telegram.messenger.g0.g3(new dd(this, 23));
        if (this.R != i7) {
            this.B4.e();
            org.telegram.messenger.ks f10 = org.telegram.messenger.ks.f(this.R);
            int i10 = org.telegram.messenger.ks.l2;
            f10.n(this, i10);
            org.telegram.messenger.ks f11 = org.telegram.messenger.ks.f(this.R);
            int i11 = org.telegram.messenger.ks.o2;
            f11.n(this, i11);
            org.telegram.messenger.ks f12 = org.telegram.messenger.ks.f(this.R);
            int i12 = org.telegram.messenger.ks.p2;
            f12.n(this, i12);
            org.telegram.messenger.ks f13 = org.telegram.messenger.ks.f(this.R);
            int i13 = org.telegram.messenger.ks.m2;
            f13.n(this, i13);
            org.telegram.messenger.ks f14 = org.telegram.messenger.ks.f(this.R);
            int i14 = org.telegram.messenger.ks.X5;
            f14.n(this, i14);
            org.telegram.messenger.ks f15 = org.telegram.messenger.ks.f(this.R);
            int i15 = org.telegram.messenger.ks.n2;
            f15.n(this, i15);
            org.telegram.messenger.ks f16 = org.telegram.messenger.ks.f(this.R);
            int i16 = org.telegram.messenger.ks.k2;
            f16.n(this, i16);
            org.telegram.messenger.ks f17 = org.telegram.messenger.ks.f(this.R);
            int i17 = org.telegram.messenger.ks.t;
            f17.n(this, i17);
            org.telegram.messenger.ks f18 = org.telegram.messenger.ks.f(this.R);
            int i18 = org.telegram.messenger.ks.s2;
            f18.n(this, i18);
            org.telegram.messenger.ks f19 = org.telegram.messenger.ks.f(this.R);
            int i19 = org.telegram.messenger.ks.u2;
            f19.n(this, i19);
            org.telegram.messenger.ks f20 = org.telegram.messenger.ks.f(this.R);
            int i20 = org.telegram.messenger.ks.e2;
            f20.n(this, i20);
            org.telegram.messenger.ks f21 = org.telegram.messenger.ks.f(this.R);
            int i21 = org.telegram.messenger.ks.z0;
            f21.n(this, i21);
            org.telegram.messenger.ks f22 = org.telegram.messenger.ks.f(this.R);
            int i22 = org.telegram.messenger.ks.L;
            f22.n(this, i22);
            org.telegram.messenger.ks f23 = org.telegram.messenger.ks.f(this.R);
            int i23 = org.telegram.messenger.ks.n1;
            f23.n(this, i23);
            org.telegram.messenger.ks f24 = org.telegram.messenger.ks.f(this.R);
            int i24 = org.telegram.messenger.ks.t2;
            f24.n(this, i24);
            org.telegram.messenger.ks f25 = org.telegram.messenger.ks.f(this.R);
            int i25 = org.telegram.messenger.ks.T2;
            f25.n(this, i25);
            org.telegram.messenger.ks f26 = org.telegram.messenger.ks.f(this.R);
            int i26 = org.telegram.messenger.ks.a3;
            f26.n(this, i26);
            org.telegram.messenger.ks f27 = org.telegram.messenger.ks.f(this.R);
            int i27 = org.telegram.messenger.ks.i5;
            f27.n(this, i27);
            org.telegram.messenger.ks f28 = org.telegram.messenger.ks.f(this.R);
            int i28 = org.telegram.messenger.ks.S3;
            f28.n(this, i28);
            this.R = i7;
            this.S = org.telegram.messenger.c.a(i7);
            org.telegram.messenger.ks.f(this.R).c(this, i10);
            org.telegram.messenger.ks.f(this.R).c(this, i11);
            org.telegram.messenger.ks.f(this.R).c(this, i12);
            org.telegram.messenger.ks.f(this.R).c(this, i13);
            org.telegram.messenger.ks.f(this.R).c(this, i14);
            org.telegram.messenger.ks.f(this.R).c(this, i15);
            org.telegram.messenger.ks.f(this.R).c(this, i16);
            org.telegram.messenger.ks.f(this.R).c(this, i17);
            org.telegram.messenger.ks.f(this.R).c(this, i18);
            org.telegram.messenger.ks.f(this.R).c(this, i19);
            org.telegram.messenger.ks.f(this.R).c(this, i20);
            org.telegram.messenger.ks.f(this.R).c(this, i21);
            org.telegram.messenger.ks.f(this.R).c(this, i22);
            org.telegram.messenger.ks.f(this.R).c(this, i23);
            org.telegram.messenger.ks.f(this.R).c(this, i24);
            org.telegram.messenger.ks.f(this.R).c(this, i25);
            org.telegram.messenger.ks.f(this.R).c(this, i26);
            org.telegram.messenger.ks.f(this.R).c(this, i27);
            org.telegram.messenger.ks.f(this.R).c(this, i28);
        }
        this.A0 = true;
        if (org.telegram.messenger.n5.z(this.G3)) {
            this.A0 = org.telegram.messenger.v3.q(org.telegram.messenger.mp.u1(this.S.a).O0(Long.valueOf(-this.G3)));
        }
        x2(false);
        r2(false);
        O();
        J();
        p2(false);
        if (this.F0 != null) {
            org.telegram.ui.bn bnVar = this.F3;
            z2(bnVar != null && bnVar.getFragmentBeginToShow());
        }
    }

    public final boolean E2() {
        hf hfVar;
        if (this.s1 && ((hfVar = this.F0) == null || hfVar.length() == 0)) {
            this.s1 = false;
        }
        return this.s1;
    }

    public final void F() {
        if (this.U2 && this.d1) {
            CameraController.getInstance().cancelOnInitRunnable(this.x4);
            this.P3.o2(5, 0, this.P ? Integer.MAX_VALUE : 0, this.P6, 0L, true);
            this.P6 = 0L;
            this.K0.setEffect(0L);
        } else {
            this.P3.U0(0);
            MediaController.B().B0(0, 0, false, false);
        }
        this.v3 = false;
        u2(2, true);
    }

    public final boolean F0(float[] fArr) {
        se seVar = this.K0;
        if (seVar != null && seVar.o0) {
            int[] iArr = new int[2];
            seVar.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - Math.round(seVar.getTranslationX());
            iArr[1] = iArr[1] - Math.round(seVar.getTranslationY());
            View rootView = seVar.getRootView();
            if (rootView == null || rootView.getWidth() <= 0 || ((iArr[0] + seVar.j0) - seVar.l0 <= rootView.getWidth() && iArr[0] + seVar.j0 + seVar.l0 >= 0.0f)) {
                fArr[0] = iArr[0] + seVar.j0;
                fArr[1] = iArr[1] + seVar.k0;
                fArr[2] = seVar.l0;
                fArr[3] = r5 + seVar.m0;
                fArr[4] = r0 + seVar.n0;
                return true;
            }
        }
        return false;
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
    public final void F1(org.telegram.messenger.fj fjVar, org.telegram.messenger.aj ajVar, boolean z10) {
        float f10;
        float f11;
        int i7;
        ee eeVar;
        CharSequence charSequence;
        CharSequence charSequence2;
        int i10;
        hf hfVar;
        hf hfVar2;
        ee eeVar2;
        boolean z11;
        te teVar;
        if (this.R3 == null && this.U3 == null && this.P2 != fjVar) {
            b0();
            boolean z12 = this.P2 != null;
            this.P2 = fjVar;
            this.Q2 = z10;
            ee eeVar3 = this.q2;
            org.telegram.ui.b61 b61Var = this.f2;
            ImageView imageView = this.Q0;
            je jeVar = this.h2;
            pe peVar = this.a1;
            if (fjVar != null) {
                this.O6 = ajVar != null ? ajVar.j : fjVar.k.invert_media;
                Y(false);
                this.v2.setOnClickListener(new id(this, 20));
                if (this.P2.p5()) {
                    long j3 = this.k5;
                    if (j3 > 0) {
                        this.v2.i(1, j3, true);
                        this.v2.setLayoutParams(c8.na.e(44, 44, 85));
                        this.v2.requestLayout();
                        eeVar = eeVar3;
                        this.v2.setOnLongClickListener(new m(this, fjVar, ajVar, 1));
                        this.v2.setVisibility(0);
                        this.v2.setScaleX(0.1f);
                        this.v2.setScaleY(0.1f);
                        this.v2.setAlpha(0.0f);
                        this.v2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(kr.f).start();
                        if (z10) {
                            this.d0 = org.telegram.messenger.mp.u1(this.S.a).w1();
                            charSequence = this.P2.v;
                        } else {
                            this.d0 = org.telegram.messenger.mp.u1(this.S.a).J0();
                            charSequence = this.P2.z;
                        }
                        if (charSequence == null) {
                            hf hfVar3 = this.F0;
                            TextPaint paint = hfVar3 != null ? hfVar3.getPaint() : null;
                            if (paint == null) {
                                paint = new TextPaint();
                                paint.setTextSize(org.telegram.messenger.g0.L(18.0f));
                            }
                            charSequence2 = s(paint.getFontMetricsInt(), charSequence, this.P2.k.entities);
                        } else {
                            charSequence2 = "";
                        }
                        if (this.L2 == null && !z12) {
                            hf hfVar4 = this.F0;
                            this.L2 = (hfVar4 != null || hfVar4.length() <= 0) ? null : this.F0.getText();
                            this.M2 = this.O3;
                        }
                        org.telegram.messenger.fj fjVar2 = this.P2;
                        TLRPC.MessageMedia messageMedia = fjVar2.k.media;
                        this.O3 = ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) || !messageMedia.manual) && ((i10 = fjVar2.D) == 0 || i10 == 19);
                        if (this.p3) {
                            xd xdVar = new xd(0, this, charSequence2);
                            this.a0 = xdVar;
                            org.telegram.messenger.g0.h3(xdVar, 200L);
                        } else {
                            xd xdVar2 = this.a0;
                            if (xdVar2 != null) {
                                org.telegram.messenger.g0.r(xdVar2);
                                this.a0 = null;
                            }
                            setFieldText(charSequence2);
                        }
                        hfVar = this.F0;
                        if (hfVar != null) {
                            hfVar.requestFocus();
                        }
                        j1();
                        hfVar2 = this.F0;
                        if (hfVar2 != null) {
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) hfVar2.getLayoutParams();
                            layoutParams.rightMargin = org.telegram.messenger.g0.L(4.0f);
                            this.F0.setLayoutParams(layoutParams);
                        }
                        eeVar2 = this.f1;
                        if (eeVar2 == null) {
                            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) eeVar2.getLayoutParams();
                            z11 = false;
                            layoutParams2.rightMargin = 0;
                            this.f1.setLayoutParams(layoutParams2);
                        } else {
                            z11 = false;
                        }
                        getSendButtonInternal().setVisibility(8);
                        setSlowModeButtonVisible(z11);
                        imageView.setVisibility(8);
                        peVar.setVisibility(8);
                        b61Var.setVisibility(8);
                        if (jeVar != null) {
                            this.l2 = 0.0f;
                            jeVar.setAlpha(0.0f);
                            jeVar.setScaleX(0.5f);
                            jeVar.setScaleY(0.5f);
                        }
                        eeVar.setVisibility(8);
                        teVar = this.z2;
                        if (teVar != null) {
                            teVar.setVisibility(8);
                        }
                    }
                }
                eeVar = eeVar3;
                this.v2.i(1, 0L, true);
                this.v2.setLayoutParams(c8.na.e(44, 44, 85));
                this.v2.requestLayout();
                this.v2.setOnLongClickListener(new m(this, fjVar, ajVar, 1));
                this.v2.setVisibility(0);
                this.v2.setScaleX(0.1f);
                this.v2.setScaleY(0.1f);
                this.v2.setAlpha(0.0f);
                this.v2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(kr.f).start();
                if (z10) {
                }
                if (charSequence == null) {
                }
                if (this.L2 == null) {
                    hf hfVar42 = this.F0;
                    this.L2 = (hfVar42 != null || hfVar42.length() <= 0) ? null : this.F0.getText();
                    this.M2 = this.O3;
                }
                org.telegram.messenger.fj fjVar22 = this.P2;
                TLRPC.MessageMedia messageMedia2 = fjVar22.k.media;
                this.O3 = ((messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) || !messageMedia2.manual) && ((i10 = fjVar22.D) == 0 || i10 == 19);
                if (this.p3) {
                }
                hfVar = this.F0;
                if (hfVar != null) {
                }
                j1();
                hfVar2 = this.F0;
                if (hfVar2 != null) {
                }
                eeVar2 = this.f1;
                if (eeVar2 == null) {
                }
                getSendButtonInternal().setVisibility(8);
                setSlowModeButtonVisible(z11);
                imageView.setVisibility(8);
                peVar.setVisibility(8);
                b61Var.setVisibility(8);
                if (jeVar != null) {
                }
                eeVar.setVisibility(8);
                teVar = this.z2;
                if (teVar != null) {
                }
            } else {
                xd xdVar3 = this.a0;
                if (xdVar3 != null) {
                    org.telegram.messenger.g0.r(xdVar3);
                    this.a0 = null;
                }
                se seVar = this.v2;
                if (seVar != null) {
                    seVar.setVisibility(8);
                }
                this.d0 = -1;
                this.P3.r();
                eeVar3.setVisibility(0);
                imageView.setScaleX(0.1f);
                imageView.setScaleY(0.1f);
                imageView.setAlpha(0.0f);
                imageView.setVisibility(8);
                int i11 = this.H0;
                ug ugVar = this.G0;
                if (i11 <= 0 || c()) {
                    getSendButtonInternal().setScaleX(0.1f);
                    getSendButtonInternal().setScaleY(0.1f);
                    getSendButtonInternal().setAlpha(0.0f);
                    getSendButtonInternal().setVisibility(8);
                    ugVar.setScaleX(0.1f);
                    ugVar.setScaleY(0.1f);
                    ugVar.setAlpha(0.0f);
                    setSlowModeButtonVisible(false);
                    f10 = 1.0f;
                    b61Var.setScaleX(1.0f);
                    this.F = 1.0f;
                    j2();
                    b61Var.setVisibility(0);
                    if (jeVar != null) {
                        this.l2 = 1.0f;
                        jeVar.setAlpha(1.0f);
                        jeVar.setScaleX(1.0f);
                        jeVar.setScaleY(1.0f);
                    }
                    peVar.setScaleX(1.0f);
                    peVar.setScaleY(1.0f);
                    peVar.setAlpha(1.0f);
                    peVar.setVisibility(0);
                } else {
                    if (this.H0 == Integer.MAX_VALUE) {
                        getSendButtonInternal().setScaleX(1.0f);
                        getSendButtonInternal().setScaleY(1.0f);
                        getSendButtonInternal().setAlpha(1.0f);
                        getSendButtonInternal().setVisibility(0);
                        ugVar.setScaleX(0.1f);
                        ugVar.setScaleY(0.1f);
                        f11 = 0.0f;
                        ugVar.setAlpha(0.0f);
                        setSlowModeButtonVisible(false);
                        i7 = 8;
                    } else {
                        f11 = 0.0f;
                        getSendButtonInternal().setScaleX(0.1f);
                        getSendButtonInternal().setScaleY(0.1f);
                        getSendButtonInternal().setAlpha(0.0f);
                        i7 = 8;
                        getSendButtonInternal().setVisibility(8);
                        ugVar.setScaleX(1.0f);
                        ugVar.setScaleY(1.0f);
                        ugVar.setAlpha(1.0f);
                        setSlowModeButtonVisible(true);
                    }
                    b61Var.setScaleX(0.01f);
                    this.F = f11;
                    j2();
                    b61Var.setVisibility(i7);
                    if (jeVar != null) {
                        this.l2 = f11;
                        jeVar.setAlpha(f11);
                        jeVar.setScaleX(0.5f);
                        jeVar.setScaleY(0.5f);
                    }
                    peVar.setScaleX(0.1f);
                    peVar.setScaleY(0.1f);
                    peVar.setAlpha(f11);
                    peVar.setVisibility(i7);
                    f10 = 1.0f;
                }
                g0();
                te teVar2 = this.z2;
                if (teVar2 != null && teVar2.getTag() != null) {
                    this.z2.setScaleX(f10);
                    this.z2.setScaleY(f10);
                    this.z2.setAlpha(f10);
                    this.z2.setVisibility(0);
                }
                org.telegram.ui.bn bnVar = this.F3;
                if (bnVar != null) {
                    bnVar.H5 = null;
                    bnVar.Y5 = null;
                    org.telegram.messenger.jj jjVar = bnVar.x5;
                    if (jjVar != null) {
                        jjVar.e(this.R, null, "", null, null, null);
                    }
                    this.N3 = null;
                    this.O3 = true;
                    bnVar.B8();
                }
                b0();
                hf hfVar5 = this.F0;
                if (hfVar5 != null) {
                    hfVar5.setText(this.L2);
                    hf hfVar6 = this.F0;
                    hfVar6.setSelection(hfVar6.length());
                }
                this.L2 = null;
                this.O3 = this.M2;
                if (getVisibility() == 0) {
                    this.P3.t2();
                }
                q2(1);
            }
            p2(true);
            z2(true);
            n2();
            w2();
        }
    }

    public final void F2(int i7) {
        int i10;
        if (this.l1) {
            return;
        }
        if (this.r1 != null || org.telegram.messenger.mp.g1().getBoolean("asr_live_text", true)) {
            ji.n nVar = this.r1;
            if (nVar != null && nVar.J && ((i10 = nVar.c) == 2 || i10 == 4)) {
                if (i7 != 1 && i7 != 2 && i7 != 4 && i7 != 5) {
                    org.telegram.messenger.g0.g3(new td(this, 10));
                    return;
                }
                nVar.h("field: record state " + i7, true);
                return;
            }
            if (nVar == null || nVar.c != 3) {
                if (i7 == 0) {
                    org.telegram.messenger.g0.g3(new td(this, 10));
                    return;
                } else {
                    if (nVar != null) {
                        nVar.h("record state " + i7, true);
                        return;
                    }
                    return;
                }
            }
            if (i7 == 1 || i7 == 2 || i7 == 4 || i7 == 5 || i7 == 0) {
                nVar.h("review: record state " + i7, true);
            }
        }
    }

    public final int G0(int i7) {
        org.telegram.ui.ActionBar.i6 i6Var = this.M4;
        return i6Var != null ? i6Var.i(i7) : org.telegram.ui.ActionBar.n6.x0(null, i7, false);
    }

    public final void G1(boolean z10, boolean z11) {
        xg xgVar;
        hf hfVar;
        ee eeVar;
        ge geVar = this.R0;
        if (geVar == null) {
            return;
        }
        if (this.m3 == 1 || ((eeVar = this.f1) != null && eeVar.getVisibility() == 0)) {
            this.h = 0.0f;
            this.n = 0.0f;
            o2();
            z11 = false;
        }
        xg xgVar2 = xg.f;
        xg xgVar3 = xg.e;
        if (!z10 || this.V2 != 0) {
            eg egVar = this.V0;
            int i7 = egVar == null ? org.telegram.messenger.mp.f1().getInt("selected_page", 0) : egVar.getCurrentPage();
            xgVar = (i7 == 0 || !((this.z3 || this.A3) && ((hfVar = this.F0) == null || TextUtils.isEmpty(hfVar.getText())))) ? xgVar3 : i7 == 1 ? xg.c : xgVar2;
        } else if (!this.A0) {
            return;
        } else {
            xgVar = xg.d;
        }
        if (!this.A0 && xgVar == xgVar3) {
            xgVar3 = xgVar2;
        } else if (this.b || xgVar == xgVar3) {
            xgVar3 = xgVar;
        }
        geVar.j(xgVar3, z11);
        if (xgVar3 == xgVar2 && this.V0 == null) {
            org.telegram.messenger.ri.d0(this.R).Y0(0, true, true, false);
            ArrayList arrayList = org.telegram.messenger.mp.u1(this.R).e4;
            int min = Math.min(10, arrayList.size());
            for (int i10 = 0; i10 < min; i10++) {
                org.telegram.messenger.j6.k((CharSequence) arrayList.get(i10));
            }
        }
    }

    public final void G2() {
        if ((this.r1 == null && !c8.c1.a()) || this.O2 || this.l1) {
            return;
        }
        B0().q();
    }

    public final void H() {
        je jeVar;
        org.telegram.ui.bn bnVar;
        if (this.M != null || (jeVar = this.A2) == null || jeVar.getRight() == 0 || (bnVar = this.F3) == null || !org.telegram.messenger.v1.d(bnVar.s8)) {
            return;
        }
        if (org.telegram.messenger.mp.u1(this.R).h7.getBoolean(Calendar.getInstance().get(1) + "bdayhint_" + bnVar.a(), true)) {
            org.telegram.messenger.mp.u1(this.R).h7.edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + bnVar.a(), false).apply();
            hi.u3 u3Var = new hi.u3(getContext(), 3);
            this.M = u3Var;
            u3Var.s(13.0f);
            setHintGlass(this.M);
            this.M.r(true);
            z1();
            this.M.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
            this.M.p(1.0f, -((getWidth() - org.telegram.messenger.g0.L(12.0f)) - ((this.A2.getMeasuredWidth() / 2.0f) + (this.A2.getX() + (this.f2.getX() + this.o2.getX())))));
            addView(this.M, c8.na.d(-1, 200.0f, 48, 0.0f, -192.0f, 0.0f, 0.0f));
            hi.u3 u3Var2 = this.M;
            u3Var2.r0 = new dd(this, 26);
            u3Var2.d = 8000L;
            u3Var2.x();
        }
    }

    public final boolean H0() {
        return this.q7 == 3;
    }

    public final void H1() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.E3.getSystemService("accessibility");
        if (this.F0 == null || accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        try {
            this.F0.requestFocus();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void I() {
        hf hfVar = this.F0;
        boolean z10 = ((hfVar != null && !TextUtils.isEmpty(hfVar.getText())) || this.p3 || this.a4 || T0()) ? false : true;
        if (z10) {
            W();
        }
        ki.y yVar = this.m0;
        if (yVar != null) {
            boolean z11 = yVar.f;
            if (z11 != z10) {
                yVar.f = z10;
                yVar.requestLayout();
                yVar.invalidate();
            }
            if (z11 != this.m0.f) {
                ge geVar = this.R0;
                Float valueOf = Float.valueOf(geVar.getX());
                HashMap hashMap = this.C0;
                hashMap.put(geVar, valueOf);
                hf hfVar2 = this.F0;
                if (hfVar2 != null) {
                    hashMap.put(hfVar2, Float.valueOf(hfVar2.getX()));
                }
            }
        }
    }

    public final boolean I0() {
        hf hfVar = this.F0;
        return hfVar != null && hfVar.length() > 0;
    }

    public final void I1(CharSequence charSequence, boolean z10) {
        hf hfVar = this.F0;
        if (hfVar == null) {
            return;
        }
        this.H3 = true;
        hfVar.setText(charSequence);
        this.F0.g(true);
        hf hfVar2 = this.F0;
        hfVar2.setSelection(hfVar2.getText().length());
        this.H3 = false;
        mg mgVar = this.P3;
        if (mgVar != null) {
            mgVar.i1(this.F0.getText(), true, z10);
        }
    }

    public final void J() {
        org.telegram.ui.bn bnVar = this.F3;
        if (bnVar == null) {
            return;
        }
        t2(bnVar.e, bnVar.s8);
    }

    public final void J0() {
        hi.u3 u3Var = this.O;
        if (u3Var != null) {
            u3Var.f(true);
        }
        hi.u3 u3Var2 = this.M;
        if (u3Var2 != null) {
            u3Var2.f(true);
        }
    }

    public final void J1(boolean z10, boolean z11) {
        this.x3 = z10;
        P(z11);
    }

    public final AnimatorSet J2() {
        pe peVar = this.a1;
        if (peVar == null) {
            return null;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(peVar, (Property<pe, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(peVar, (Property<pe, Float>) View.SCALE_X, 0.6f, 1.0f), ObjectAnimator.ofFloat(peVar, (Property<pe, Float>) View.SCALE_Y, 0.6f, 1.0f));
        animatorSet.setStartDelay(60L);
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(kr.g);
        return animatorSet;
    }

    @Override // te.b
    public final void K(int i7, float f10, float f11, te.c cVar) {
        ee eeVar;
        float f12 = 0.0f;
        if (i7 == 0) {
            yh.a aVar = this.T1;
            if (aVar != null) {
                aVar.setVisibleHeight(f10);
            }
            if (this.E2 != null) {
                if (this.K1 && this.R5 && (eeVar = this.f1) != null && eeVar.getVisibility() == 0) {
                    f12 = -Math.max(0.0f, f10 - org.telegram.messenger.g0.L(44.0f));
                }
                this.S5 = f12;
                this.E2.setTranslationY(f12 + this.T5 + this.m7);
            }
            R();
            S();
        } else if (i7 == 1) {
            R();
            S();
        } else {
            if (i7 == 2) {
                jh.h hVar = this.J0;
                hVar.setAlpha(f10);
                hVar.setScaleX(org.telegram.messenger.g0.T1(0.5f, 1.0f, f10));
                hVar.setScaleY(org.telegram.messenger.g0.T1(0.5f, 1.0f, f10));
                hVar.setVisibility(f10 <= 0.0f ? 4 : 0);
            } else if (i7 == 3) {
                float T1 = org.telegram.messenger.g0.T1(1.0f, 0.79f, f10);
                ee eeVar2 = this.q2;
                eeVar2.setScaleX(T1);
                eeVar2.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.79f, f10));
                float T12 = org.telegram.messenger.g0.T1(0.79f, 1.0f, f10);
                ImageView imageView = this.r2;
                imageView.setScaleX(T12);
                imageView.setScaleY(org.telegram.messenger.g0.T1(0.79f, 1.0f, f10));
                imageView.setVisibility(f10 <= 0.0f ? 8 : 0);
                imageView.setAlpha(f10);
                se seVar = this.K0;
                if (seVar != null) {
                    seVar.setSameWidthFactor(f10);
                }
            }
        }
        invalidate();
    }

    public final void K0() {
        M0(true, false, true);
    }

    public void K1(float f10, float f11, float f12, boolean z10) {
        int L;
        float f13 = 1.0f - f12;
        float f14 = f10 * f13;
        float f15 = f11 * f13;
        this.r = (f12 * 0.5f) + 0.5f;
        this.s = f12;
        o2();
        float f16 = -f14;
        this.R0.setTranslationX(f16);
        if (this.F0 == null) {
            L = 0;
        } else {
            int L2 = org.telegram.messenger.g0.L(40.0f);
            qn0 qn0Var = this.q0;
            L = L2 + ((qn0Var == null || qn0Var.getVisibility() != 0) ? 0 : org.telegram.messenger.g0.L(18.0f));
        }
        this.I = f16 - (L * f13);
        qh0 qh0Var = this.h1;
        if (qh0Var != null) {
            qh0Var.setTranslationX(f16);
        }
        RecordCircle recordCircle = this.D2;
        if (recordCircle != null) {
            recordCircle.setTranslationX(f15);
        }
        qg qgVar = this.E2;
        if (qgVar != null) {
            qgVar.setTranslationX(f15);
        }
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            linearLayout.setTranslationX(f16);
        }
        ee eeVar = this.q2;
        eeVar.setTranslationX(f15);
        this.z1 = f12;
        eeVar.setAlpha((1.0f - this.y1) * f12);
        ImageView imageView = this.m2;
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
        j2();
        s2();
        float f17 = f14 * f13;
        if (this.J != f17) {
            this.J = f17;
            zi0 zi0Var = this.i1;
            if (zi0Var != null) {
                zi0Var.setTranslationX(f17);
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

    @Override // org.telegram.ui.Components.bu0
    public final void L(int i7, boolean z10) {
        org.telegram.messenger.fj fjVar;
        hf hfVar;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        boolean z11;
        int i10;
        int i11;
        rh.e eVar;
        if (this.H2 != 0) {
            this.B3 = i7;
            this.C3 = z10;
            this.p3 = i7 > 0;
            I();
            return;
        }
        if (i7 > org.telegram.messenger.g0.L(50.0f) && this.p3 && !org.telegram.messenger.g0.E) {
            if (z10) {
                this.o3 = i7;
                org.telegram.messenger.mp.f1().edit().putInt("kbd_height_land3", this.o3).commit();
            } else {
                this.n3 = i7;
                org.telegram.messenger.mp.f1().edit().putInt("kbd_height", this.n3).commit();
            }
        }
        if (this.p3 && this.X0 && this.V0 == null) {
            this.X0 = false;
        }
        boolean T0 = T0();
        cu0 cu0Var = this.c2;
        org.telegram.ui.bn bnVar = this.F3;
        if (T0) {
            int i12 = z10 ? this.o3 : this.n3;
            if (bnVar != null && bnVar.getParentLayout() != null) {
                i12 -= ((ActionBarLayout) bnVar.getParentLayout()).w(false);
            }
            if (this.V2 == 1) {
                ag agVar = this.x2;
                if (!agVar.f) {
                    i12 = Math.min(agVar.getKeyboardHeight(), i12);
                }
            }
            int i13 = this.V2;
            View view = i13 == 0 ? this.V0 : i13 == 1 ? this.x2 : null;
            ag agVar2 = this.x2;
            if (agVar2 != null) {
                agVar2.setPanelHeight(i12);
                rh.e eVar2 = this.e7;
                if (eVar2 != null && i12 > 0 && this.V2 == 1) {
                    ((rh.h) eVar2).h(i12);
                }
            }
            if (view != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                if (!this.q4 && !this.p4 && (((i10 = layoutParams.width) != (i11 = org.telegram.messenger.g0.q.x) || layoutParams.height != i12) && ((eVar = this.e7) == null || i10 != -1 || layoutParams.height != -1))) {
                    if (eVar == null) {
                        layoutParams.width = i11;
                        layoutParams.height = i12;
                        view.setLayoutParams(layoutParams);
                    }
                    if (cu0Var != null) {
                        int i14 = this.q3;
                        this.q3 = layoutParams.height;
                        cu0Var.requestLayout();
                        i1();
                        if (this.Y2 && !this.p3 && i14 != this.q3 && p1()) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.W0 = animatorSet;
                            if (this.e7 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(this.q3 - i14, 0.0f));
                            } else {
                                animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, this.q3 - i14, 0.0f));
                            }
                            this.W0.setInterpolator(org.telegram.ui.ActionBar.i1.w);
                            this.W0.setDuration(250L);
                            this.W0.addListener(new be(this, 12));
                            org.telegram.messenger.g0.h3(this.O4, 50L);
                            this.B4.d();
                            requestLayout();
                        }
                    }
                }
            }
        }
        if (this.B3 == i7 && this.C3 == z10) {
            i1();
            return;
        }
        this.B3 = i7;
        this.C3 = z10;
        boolean z12 = this.p3;
        this.p3 = i7 > 0;
        I();
        if (this.p3 && T0() && this.r4 == null) {
            Z1(0, this.V2, true, true);
        } else if (!this.p3 && !T0() && (fjVar = this.c3) != null && this.J3 != fjVar && !H0() && !A() && !org.telegram.ui.ActionBar.g2.hasSheets(bnVar) && (((hfVar = this.F0) == null || TextUtils.isEmpty(hfVar.getText())) && (tL_replyKeyboardMarkup = this.d3) != null && !tL_replyKeyboardMarkup.rows.isEmpty())) {
            org.telegram.ui.ActionBar.i1 i1Var = cu0Var.I;
            if (i1Var.f) {
                i1Var.j();
            } else {
                i1Var.v = true;
            }
            Z1(1, 1, false, true);
        }
        if (this.q3 != 0 && !(z11 = this.p3) && z11 != z12 && !T0()) {
            this.q3 = 0;
            cu0Var.requestLayout();
        }
        if (this.p3 && this.a4) {
            this.a4 = false;
            if (this.f4) {
                this.f4 = false;
                this.x2.setButtons(this.d3);
            }
            org.telegram.messenger.g0.r(this.h4);
        }
        i1();
    }

    public final void L0(boolean z10) {
        M0(z10, false, true);
    }

    public final void L1(boolean z10) {
        if (this.p7 == z10) {
            return;
        }
        this.p7 = z10;
        this.h2.setVisibility(z10 ? 8 : 0);
        if (z10) {
            org.telegram.messenger.g0.E2(this.y2);
        }
        if (z10) {
            this.c1.setVisibility(8);
        } else {
            r1();
        }
        if (!z10) {
            this.d0 = -1;
            NumberTextView numberTextView = this.c0;
            if (numberTextView != null) {
                numberTextView.setVisibility(8);
            }
        }
        q2(this.M6);
        P(false);
    }

    public final void M(boolean z10) {
        org.telegram.messenger.fj fjVar;
        boolean z11 = this.G3 < 0 && this.N4 && this.P2 == null && (bg.x.g(this.R).e(getEditText() != null ? getEditText().toString() : null, this.Y6) > 0 || ((fjVar = this.J3) != null && org.telegram.messenger.fj.c3(fjVar.k)));
        te.a aVar = this.j7;
        boolean z12 = aVar.f != z11;
        aVar.a(z11, z10);
        se seVar = this.K0;
        if (seVar != null) {
            seVar.y = z11;
            seVar.invalidate();
        }
        if (z12) {
            P(z10);
        }
    }

    public final boolean M0(boolean z10, boolean z11, boolean z12) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        if (T0()) {
            if (this.V2 == 1 && (tL_replyKeyboardMarkup = this.d3) != null && z10 && this.c3 != null) {
                if (!tL_replyKeyboardMarkup.is_persistent) {
                    org.telegram.messenger.mp.u1(this.R).h7.edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.c3.e1()).apply();
                }
            }
            if ((z10 && this.H2 != 0) || z11) {
                R1(0, true);
                eg egVar = this.V0;
                if (egVar != null) {
                    egVar.t(true);
                }
                hf hfVar = this.F0;
                if (hfVar != null) {
                    hfVar.requestFocus();
                }
                S1(false, true, false, true);
                if (this.o4) {
                    P(true);
                    return true;
                }
            } else {
                if (this.H2 == 0) {
                    if (this.p4) {
                        S1(false, true, false, true);
                        return true;
                    }
                    Z1(0, 0, true, z12 && !z10);
                    return true;
                }
                R1(0, false);
                this.V0.t(false);
                hf hfVar2 = this.F0;
                if (hfVar2 != null) {
                    hfVar2.requestFocus();
                }
            }
            return true;
        }
        return false;
    }

    public final void M1(boolean z10) {
        ValueAnimator valueAnimator = this.Q1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Q1 = null;
        }
        if (z10) {
            float f10 = this.P1;
            if (f10 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                this.Q1 = ofFloat;
                ofFloat.addUpdateListener(new pd(this, 10));
                this.Q1.setDuration(200L);
                this.Q1.setInterpolator(kr.g);
                this.Q1.start();
                return;
            }
        }
        this.P1 = 0.0f;
        jh.f D0 = D0();
        if (D0 != null) {
            D0.setInputBubbleExtraAlpha(1.0f);
        }
        ee eeVar = this.f1;
        if (eeVar != null) {
            eeVar.invalidate();
        }
    }

    public final void N0(boolean z10) {
        hf hfVar;
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2 = this.k3;
        if (animatorSet2 == null || !animatorSet2.isRunning()) {
            if (this.K1) {
                M1(true);
            }
            this.S3 = null;
            this.R3 = null;
            this.T3 = null;
            this.U3 = null;
            x61 x61Var = this.g1;
            if (x61Var != null) {
                x61Var.a(true);
            }
            qe qeVar = this.c1;
            if (qeVar != null) {
                qeVar.setVisibility(0);
            }
            int i7 = 3;
            de deVar = this.T4;
            de deVar2 = this.P4;
            de deVar3 = this.R4;
            Property property = View.SCALE_Y;
            Property property2 = View.SCALE_X;
            ge geVar = this.R0;
            Property property3 = View.ALPHA;
            je jeVar = this.h2;
            if (z10) {
                if (jeVar != null) {
                    this.l2 = 0.0f;
                    jeVar.setAlpha(0.0f);
                    jeVar.setScaleX(0.0f);
                    jeVar.setScaleY(0.0f);
                }
                this.n = 0.0f;
                this.h = 0.0f;
                o2();
                this.k3 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(geVar, deVar3, this.B0 ? 0.5f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(geVar, deVar2, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.h1, (Property<qh0, Float>) property3, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.h1, (Property<qh0, Float>) property2, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.h1, (Property<qh0, Float>) property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f1, (Property<ee, Float>) property3, 0.0f));
                if (jeVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator = this.g2;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        this.g2 = null;
                    }
                    this.l2 = 1.0f;
                    arrayList.add(ObjectAnimator.ofFloat(jeVar, (Property<je, Float>) property3, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(jeVar, (Property<je, Float>) property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(jeVar, (Property<je, Float>) property, 1.0f));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.F0, (Property<hf, Float>) property3, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.F0, deVar, 0.0f));
                qg qgVar = this.E2;
                if (qgVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(qgVar, (Property<qg, Float>) property3, 0.0f));
                    this.E2.f();
                }
                this.k3.playTogether(arrayList);
                ki.y yVar = this.m0;
                if (yVar != null) {
                    yVar.setAlpha(0.0f);
                    this.m0.setScaleY(0.0f);
                    this.m0.setScaleX(0.0f);
                    this.k3.playTogether(ObjectAnimator.ofFloat(this.m0, (Property<ki.y, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.m0, (Property<ki.y, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.m0, (Property<ki.y, Float>) property, 1.0f));
                }
                this.k3.setDuration(150L);
                this.k3.addListener(new be(this, i7));
            } else {
                boolean z11 = this.y5;
                qh0 qh0Var = this.h1;
                if (qh0Var != null && !z11) {
                    qh0Var.d();
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                boolean z12 = this.d1;
                Property property4 = View.TRANSLATION_X;
                if (z12) {
                    arrayList2.add(ObjectAnimator.ofFloat(this.g1, (Property<x61, Float>) property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.g1, (Property<x61, Float>) property4, -org.telegram.messenger.g0.L(20.0f)));
                    arrayList2.add(ObjectAnimator.ofFloat(this.F0, deVar, 0.0f));
                    qg qgVar2 = this.E2;
                    if (qgVar2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(qgVar2, (Property<qg, Float>) property3, 0.0f));
                        this.E2.f();
                    }
                    animatorSet3.playTogether(arrayList2);
                    if (this.s == 1.0f) {
                        animatorSet3.playTogether(ObjectAnimator.ofFloat(this.F0, (Property<hf, Float>) property3, 1.0f));
                    } else {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.F0, (Property<hf, Float>) property3, 1.0f);
                        ofFloat.setStartDelay(750L);
                        ofFloat.setDuration(200L);
                        animatorSet3.playTogether(ofFloat);
                    }
                } else {
                    hf hfVar2 = this.F0;
                    if (hfVar2 == null || this.s != 1.0f || z11) {
                        this.H = 0.0f;
                        s2();
                        if (z11 && (hfVar = this.F0) != null) {
                            hfVar.setAlpha(0.0f);
                        }
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.F0, (Property<hf, Float>) property3, 1.0f);
                        ofFloat2.setStartDelay(z11 ? 600L : 750L);
                        ofFloat2.setDuration(z11 ? 360L : 200L);
                        if (z11) {
                            ofFloat2.setInterpolator(kr.g);
                        }
                        animatorSet3.playTogether(ofFloat2);
                    } else {
                        hfVar2.setAlpha(1.0f);
                        this.H = 0.0f;
                        s2();
                    }
                    if (!z11) {
                        arrayList2.add(ObjectAnimator.ofFloat(this.i1, (Property<zi0, Float>) property3, 0.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.i1, (Property<zi0, Float>) property4, -org.telegram.messenger.g0.L(20.0f)));
                    }
                    qg qgVar3 = this.E2;
                    if (qgVar3 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(qgVar3, (Property<qg, Float>) property3, 0.0f));
                        this.E2.f();
                    }
                    animatorSet3.playTogether(arrayList2);
                }
                animatorSet3.setDuration(200L);
                if (jeVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.g2;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.g2 = null;
                    }
                    this.l2 = 0.0f;
                    jeVar.setAlpha(0.0f);
                    jeVar.setScaleX(0.0f);
                    jeVar.setScaleY(0.0f);
                    animatorSet = new AnimatorSet();
                    this.l2 = 1.0f;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(jeVar, (Property<je, Float>) property3, 1.0f), ObjectAnimator.ofFloat(jeVar, (Property<je, Float>) property2, 1.0f), ObjectAnimator.ofFloat(jeVar, (Property<je, Float>) property, 1.0f));
                    animatorSet.setDuration(150L);
                } else {
                    animatorSet = null;
                }
                this.n = 0.0f;
                this.h = z11 ? 0.6f : 0.0f;
                o2();
                AnimatorSet animatorSet4 = new AnimatorSet();
                float f10 = z11 ? 0.6f : 0.0f;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.h1, (Property<qh0, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.h1, (Property<qh0, Float>) property2, f10), ObjectAnimator.ofFloat(this.h1, (Property<qh0, Float>) property, f10), ObjectAnimator.ofFloat(geVar, deVar3, this.B0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(geVar, deVar2, 1.0f));
                ki.y yVar2 = this.m0;
                if (yVar2 != null) {
                    yVar2.setAlpha(0.0f);
                    this.m0.setScaleY(0.0f);
                    this.m0.setScaleX(0.0f);
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(this.m0, (Property<ki.y, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.m0, (Property<ki.y, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.m0, (Property<ki.y, Float>) property, 1.0f));
                }
                animatorSet4.setDuration(z11 ? 220L : 150L);
                if (z11) {
                    animatorSet4.setInterpolator(kr.g);
                }
                animatorSet4.setStartDelay(z11 ? 1040L : 600L);
                AnimatorSet animatorSet5 = new AnimatorSet();
                this.k3 = animatorSet5;
                if (animatorSet != null) {
                    animatorSet5.playTogether(animatorSet3, animatorSet, animatorSet4);
                } else {
                    animatorSet5.playTogether(animatorSet3, animatorSet4);
                }
                this.k3.addListener(new sf(this));
            }
            AnimatorSet animatorSet6 = this.k3;
            if (animatorSet6 != null) {
                animatorSet6.start();
            }
            qg qgVar4 = this.E2;
            if (qgVar4 != null) {
                qgVar4.invalidate();
            }
        }
    }

    public final void N1(CharSequence charSequence, boolean z10) {
        this.e = charSequence;
        this.f = null;
        p2(z10);
    }

    public final void O() {
        boolean z10;
        boolean z11;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        if (this.U2) {
            return;
        }
        if (this.f2 == null) {
            this.U2 = false;
            O1(false, false);
            return;
        }
        boolean z12 = true;
        this.U2 = true;
        this.y0 = true;
        this.z0 = true;
        if (org.telegram.messenger.n5.z(this.G3)) {
            TLRPC.Chat O0 = org.telegram.messenger.mp.u1(this.S.a).O0(Long.valueOf(-this.G3));
            z10 = org.telegram.messenger.v3.T(O0) && !O0.megagroup;
            if (z10 && !O0.creator && ((tL_chatAdminRights = O0.admin_rights) == null || !tL_chatAdminRights.post_messages)) {
                this.U2 = false;
            }
            this.y0 = org.telegram.messenger.v3.s(O0);
            this.z0 = org.telegram.messenger.v3.v(O0);
        } else {
            z10 = false;
        }
        if (!org.telegram.messenger.bz.y0) {
            this.U2 = false;
        }
        if (this.U2) {
            if (org.telegram.messenger.bz.P0) {
                CameraController.getInstance().initCamera(null);
            }
            z11 = org.telegram.messenger.mp.g1().getBoolean(z10 ? "currentModeVideoChannel" : "currentModeVideo", z10);
        } else {
            z11 = false;
        }
        if (!this.y0 && z11) {
            z11 = false;
        }
        if (this.z0 || z11) {
            z12 = z11;
        } else if (!this.U2) {
            z12 = false;
        }
        O1(z12, false);
    }

    public final void O0() {
        s1();
        this.S3 = null;
        this.R3 = null;
        this.T3 = null;
        this.U3 = null;
        x61 x61Var = this.g1;
        if (x61Var != null) {
            x61Var.a(true);
        }
        zi0 zi0Var = this.i1;
        if (zi0Var != null) {
            zi0Var.setAlpha(1.0f);
            this.i1.setTranslationX(0.0f);
        }
        x61 x61Var2 = this.g1;
        if (x61Var2 != null) {
            x61Var2.setAlpha(1.0f);
            this.g1.setTranslationX(0.0f);
        }
        hf hfVar = this.F0;
        if (hfVar != null) {
            hfVar.setAlpha(1.0f);
            this.H = 0.0f;
            s2();
            this.F0.requestFocus();
        }
        ee eeVar = this.f1;
        if (eeVar != null) {
            eeVar.setVisibility(8);
        }
        X0();
    }

    public final void O1(boolean z10, boolean z11) {
        String N0;
        qe qeVar = this.c1;
        if (qeVar == null) {
            return;
        }
        this.d1 = z10;
        if (z11) {
            SharedPreferences g12 = org.telegram.messenger.mp.g1();
            boolean z12 = false;
            if (org.telegram.messenger.n5.z(this.G3)) {
                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(this.S.a).O0(Long.valueOf(-this.G3));
                if (org.telegram.messenger.v3.T(O0) && !O0.megagroup) {
                    z12 = true;
                }
            }
            g12.edit().putBoolean(z12 ? "currentModeVideoChannel" : "currentModeVideo", z10).apply();
        }
        qeVar.j(this.d1 ? xg.b : xg.a, z11);
        qeVar.setContentDescription(org.telegram.messenger.gd.N0(this.d1 ? 2131754735 : 2131754733, null));
        if (i0()) {
            N0 = org.telegram.messenger.gd.N0(2131754874, null);
        } else {
            N0 = org.telegram.messenger.gd.N0(this.d1 ? 2131754735 : 2131754733, null);
        }
        this.a1.setContentDescription(N0);
        j0();
        sg sgVar = this.b2;
        if (sgVar != null) {
            sgVar.f(i0());
        }
        qeVar.sendAccessibilityEvent(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:299:0x081b, code lost:
    
        if (r28.l1 == false) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x081e, code lost:
    
        r9 = 0.5f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x082d, code lost:
    
        if (r28.l1 == false) goto L287;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0f0e  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x085e  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0886  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0d59  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x0d82  */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r3v135 */
    /* JADX WARN: Type inference failed for: r3v136, types: [android.animation.AnimatorSet, android.view.ViewPropertyAnimator] */
    /* JADX WARN: Type inference failed for: r3v171 */
    /* JADX WARN: Type inference failed for: r5v112 */
    /* JADX WARN: Type inference failed for: r5v113, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v114 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P(boolean z10) {
        se seVar;
        String str;
        ImageView imageView;
        pe peVar;
        int i7;
        boolean z11;
        AnimatorSet animatorSet;
        ?? r13;
        ImageView imageView2;
        boolean z12;
        je jeVar;
        je jeVar2;
        AnimatorSet animatorSet2;
        int i10;
        float f10;
        je jeVar3;
        AnimatorSet animatorSet3;
        ImageView imageView3;
        int i11;
        boolean z13;
        ?? r32;
        int i12;
        ?? r52;
        int i13;
        if (this.P2 != null || this.v3) {
            return;
        }
        boolean z14 = this.Z2 ? false : z10;
        B2();
        hf hfVar = this.F0;
        CharSequence n1 = hfVar == null ? "" : org.telegram.messenger.g0.n1(hfVar.getTextToUse());
        int i14 = this.H0;
        se seVar2 = this.K0;
        de deVar = this.Q4;
        pe peVar2 = this.a1;
        Property property = View.SCALE_X;
        Property property2 = View.SCALE_Y;
        Property property3 = View.ALPHA;
        org.telegram.ui.b61 b61Var = this.f2;
        qe qeVar = this.c1;
        ug ugVar = this.G0;
        je jeVar4 = this.h2;
        ImageView imageView4 = this.Q0;
        boolean z15 = z14;
        if (i14 <= 0 || i14 == Integer.MAX_VALUE || Y0()) {
            int length = n1.length();
            te.a aVar = this.i7;
            if (length > 0 || this.x3 || this.t2 || this.R3 != null || this.U3 != null || ((this.H0 == Integer.MAX_VALUE && !Y0()) || ((this.p7 && getStarsPrice() > 0) || aVar.f))) {
                hf hfVar2 = this.F0;
                String caption = hfVar2 == null ? null : hfVar2.getCaption();
                boolean z16 = caption != null && (getSendButtonInternal().getVisibility() == 0 || ((jeVar2 = this.T0) != null && jeVar2.getVisibility() == 0));
                boolean z17 = caption == null && (imageView4.getVisibility() == 0 || ((jeVar = this.T0) != null && jeVar.getVisibility() == 0));
                int G0 = (this.H0 != Integer.MAX_VALUE || Y0()) ? G0(org.telegram.ui.ActionBar.n6.Pe) : G0(org.telegram.ui.ActionBar.n6.Nl);
                boolean Q0 = Q0();
                seVar = seVar2;
                if (G0 != this.L0) {
                    this.L0 = G0;
                    Drawable background = seVar.getBackground();
                    int i15 = G0;
                    int red = Color.red(i15);
                    peVar = peVar2;
                    int green = Color.green(i15);
                    str = caption;
                    int blue = Color.blue(i15);
                    imageView = imageView4;
                    org.telegram.ui.ActionBar.n6.H1(background, Color.argb(24, red, green, blue), true);
                } else {
                    str = caption;
                    imageView = imageView4;
                    peVar = peVar2;
                }
                if (peVar.getVisibility() != 0 && ugVar.getVisibility() != 0 && !z16 && !z17 && !aVar.f) {
                    lh.h hVar = this.f7;
                    if (hVar != null) {
                        hVar.e(0, Q0 && !E2(), true);
                        if (jeVar4 != null) {
                            ViewPropertyAnimator viewPropertyAnimator = this.g2;
                            if (viewPropertyAnimator != null) {
                                viewPropertyAnimator.cancel();
                                this.g2 = null;
                            }
                            ViewPropertyAnimator animate = jeVar4.animate();
                            float f11 = z(Q0) ? 0.0f : 1.0f;
                            this.l2 = f11;
                            ViewPropertyAnimator duration = animate.alpha(f11).scaleX(z(Q0) ? 0.5f : 1.0f).scaleY(z(Q0) ? 0.5f : 1.0f).setInterpolator(kr.h).setDuration(320L);
                            this.g2 = duration;
                            duration.start();
                        }
                    }
                } else {
                    if (!z15) {
                        ImageView imageView5 = imageView;
                        String str2 = str;
                        qeVar.setScaleX(0.1f);
                        qeVar.setScaleY(0.1f);
                        qeVar.setAlpha(0.0f);
                        peVar.setVisibility(8);
                        if (ugVar.getVisibility() == 0) {
                            ugVar.setScaleX(0.1f);
                            ugVar.setScaleY(0.1f);
                            ugVar.setAlpha(0.0f);
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
                        je jeVar5 = this.T0;
                        if (jeVar5 == null || jeVar5.getVisibility() != 0) {
                            i7 = 8;
                        } else {
                            this.T0.setScaleX(0.1f);
                            this.T0.setScaleY(0.1f);
                            this.T0.setAlpha(0.0f);
                            i7 = 8;
                            this.T0.setVisibility(8);
                        }
                        if (b61Var != null) {
                            b61Var.setVisibility(i7);
                            if (this.P3 != null && getVisibility() == 0) {
                                this.P3.g0();
                            }
                            q2(0);
                            lh.h hVar2 = this.f7;
                            if (hVar2 != null) {
                                hVar2.e(0, Q0 && !E2(), true);
                                if (jeVar4 != null) {
                                    float f12 = z(Q0) ? 0.0f : 1.0f;
                                    this.l2 = f12;
                                    jeVar4.setAlpha(f12);
                                    jeVar4.setScaleX(z(Q0) ? 0.5f : 1.0f);
                                    jeVar4.setScaleY(z(Q0) ? 0.5f : 1.0f);
                                }
                            } else if (jeVar4 != null) {
                                this.l2 = 0.0f;
                                jeVar4.setAlpha(0.0f);
                                jeVar4.setScaleX(0.5f);
                                jeVar4.setScaleY(0.5f);
                            }
                        }
                        z11 = true;
                        this.B2 = true;
                        if (this.z2 != null) {
                            mg mgVar = this.P3;
                            if (mgVar != null && mgVar.w0()) {
                                this.z2.setVisibility(8);
                                this.z2.setTag(null);
                            }
                            this.z2.setAlpha(0.0f);
                            this.z2.setScaleX(0.0f);
                            this.z2.setScaleY(1.0f);
                            this.z2.setTranslationX(0.0f);
                        }
                        z12 = z11;
                        if (!this.a6 || (imageView3 = this.m2) == null) {
                            return;
                        }
                        if (z15) {
                            imageView3.animate().translationX(z12 ? -i5.c.d(64.0f, seVar.l(), 0) : org.telegram.messenger.g0.L(42.0f)).setDuration(320L).setInterpolator(kr.h).start();
                            return;
                        } else {
                            imageView3.setTranslationX(z12 ? -i5.c.d(64.0f, seVar.l(), 0) : org.telegram.messenger.g0.L(42.0f));
                            return;
                        }
                    }
                    int i16 = this.l3;
                    if (i16 == 1 && str == null) {
                        return;
                    }
                    if (i16 == 3 && str != null) {
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
                    if (b61Var != null) {
                        this.i3 = new AnimatorSet();
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(ObjectAnimator.ofFloat(b61Var, deVar, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(b61Var, (Property<org.telegram.ui.b61, Float>) property, 0.5f));
                        ViewPropertyAnimator viewPropertyAnimator2 = this.g2;
                        if (viewPropertyAnimator2 != null) {
                            viewPropertyAnimator2.cancel();
                            this.g2 = null;
                        }
                        lh.h hVar3 = this.f7;
                        if (hVar3 != null) {
                            hVar3.e(0, Q0 && !E2(), true);
                            if (jeVar4 != null) {
                                float f13 = z(Q0) ? 0.0f : 1.0f;
                                this.l2 = f13;
                                arrayList.add(ObjectAnimator.ofFloat(jeVar4, (Property<je, Float>) property3, f13));
                                arrayList.add(ObjectAnimator.ofFloat(jeVar4, (Property<je, Float>) property, z(Q0) ? 0.5f : 1.0f));
                                arrayList.add(ObjectAnimator.ofFloat(jeVar4, (Property<je, Float>) property2, z(Q0) ? 0.5f : 1.0f));
                            }
                        } else if (jeVar4 != null) {
                            this.l2 = 0.0f;
                            arrayList.add(ObjectAnimator.ofFloat(jeVar4, (Property<je, Float>) property3, 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(jeVar4, (Property<je, Float>) property, 0.5f));
                            arrayList.add(ObjectAnimator.ofFloat(jeVar4, (Property<je, Float>) property2, 0.5f));
                        }
                        mg mgVar2 = this.P3;
                        boolean z18 = mgVar2 != null && mgVar2.w0();
                        this.B2 = true;
                        te teVar = this.z2;
                        if (teVar != null) {
                            teVar.setScaleY(1.0f);
                            if (z18) {
                                this.z2.setTag(null);
                                arrayList.add(ObjectAnimator.ofFloat(this.z2, (Property<te, Float>) property3, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(this.z2, (Property<te, Float>) property, 0.0f));
                                arrayList.add(p(0.0f));
                            } else {
                                this.z2.setAlpha(0.0f);
                                this.z2.setScaleX(0.0f);
                                this.z2.setTranslationX(0.0f);
                            }
                        }
                        this.i3.playTogether(arrayList);
                        this.i3.setDuration(100L);
                        this.i3.addListener(new ve(this, z18, 2));
                        this.i3.start();
                        q2(0);
                        if (this.P3 != null && getVisibility() == 0) {
                            this.P3.g0();
                        }
                    }
                    this.h3 = new AnimatorSet();
                    ArrayList arrayList2 = new ArrayList();
                    if (peVar.getVisibility() == 0) {
                        r13 = 0;
                        arrayList2.add(ObjectAnimator.ofFloat(qeVar, (Property<qe, Float>) property, 0.1f));
                        arrayList2.add(ObjectAnimator.ofFloat(qeVar, (Property<qe, Float>) property2, 0.1f));
                        arrayList2.add(ObjectAnimator.ofFloat(qeVar, (Property<qe, Float>) property3, 0.0f));
                    } else {
                        r13 = 0;
                    }
                    je jeVar6 = this.T0;
                    if (jeVar6 != null && jeVar6.getVisibility() == 0) {
                        je jeVar7 = this.T0;
                        float[] fArr = new float[1];
                        fArr[r13] = 0.1f;
                        arrayList2.add(ObjectAnimator.ofFloat(jeVar7, (Property<je, Float>) property, fArr));
                        je jeVar8 = this.T0;
                        float[] fArr2 = new float[1];
                        fArr2[r13] = 0.1f;
                        arrayList2.add(ObjectAnimator.ofFloat(jeVar8, (Property<je, Float>) property2, fArr2));
                        je jeVar9 = this.T0;
                        float[] fArr3 = new float[1];
                        fArr3[r13] = 0.0f;
                        arrayList2.add(ObjectAnimator.ofFloat(jeVar9, (Property<je, Float>) property3, fArr3));
                    }
                    if (ugVar.getVisibility() == 0) {
                        float[] fArr4 = new float[1];
                        fArr4[r13] = 0.1f;
                        arrayList2.add(ObjectAnimator.ofFloat(ugVar, (Property<ug, Float>) property, fArr4));
                        float[] fArr5 = new float[1];
                        fArr5[r13] = 0.1f;
                        arrayList2.add(ObjectAnimator.ofFloat(ugVar, (Property<ug, Float>) property2, fArr5));
                        float[] fArr6 = new float[1];
                        fArr6[r13] = 0.0f;
                        arrayList2.add(ObjectAnimator.ofFloat(ugVar, (Property<ug, Float>) property3, fArr6));
                    }
                    if (z16) {
                        arrayList2.add(q(r13));
                    } else if (z17) {
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
                            this.l3 = 3;
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
                            this.l3 = 1;
                            arrayList2.add(q(true));
                            getSendButtonInternal().setVisibility(r13);
                        }
                        this.h3.playTogether(arrayList2);
                        this.h3.setDuration(220L);
                        this.h3.setInterpolator(kr.h);
                        this.h3.addListener(new ah.l(22, this, str));
                        this.h3.start();
                    }
                    imageView2 = imageView;
                    if (str == null) {
                    }
                    this.h3.playTogether(arrayList2);
                    this.h3.setDuration(220L);
                    this.h3.setInterpolator(kr.h);
                    this.h3.addListener(new ah.l(22, this, str));
                    this.h3.start();
                }
                z11 = true;
                z12 = z11;
                if (this.a6) {
                    return;
                } else {
                    return;
                }
            }
            if (this.V0 == null || !this.X0 || (!(this.n4 || (this.o4 && this.H2 == 2)) || org.telegram.messenger.g0.E || this.p7)) {
                if (getSendButtonInternal().getVisibility() == 0 || imageView4.getVisibility() == 0 || (((jeVar3 = this.T0) != null && jeVar3.getVisibility() == 0) || ugVar.getVisibility() == 0)) {
                    if (!z15) {
                        ugVar.setScaleX(0.1f);
                        ugVar.setScaleY(0.1f);
                        ugVar.setAlpha(0.0f);
                        setSlowModeButtonVisible(false);
                        getSendButtonInternal().setScaleX(0.1f);
                        getSendButtonInternal().setScaleY(0.1f);
                        getSendButtonInternal().setAlpha(0.0f);
                        getSendButtonInternal().setVisibility(8);
                        imageView4.setScaleX(0.1f);
                        imageView4.setScaleY(0.1f);
                        imageView4.setAlpha(0.0f);
                        imageView4.setVisibility(8);
                        je jeVar10 = this.T0;
                        if (jeVar10 != null) {
                            jeVar10.setScaleX(0.1f);
                            this.T0.setScaleY(0.1f);
                            this.T0.setAlpha(0.0f);
                            this.T0.setVisibility(8);
                        }
                        qeVar.setScaleX(1.0f);
                        qeVar.setScaleY(1.0f);
                        qeVar.setAlpha(1.0f);
                        peVar2.setVisibility(0);
                        if (b61Var != null) {
                            if (getVisibility() == 0) {
                                this.P3.t2();
                            }
                            this.F = 1.0f;
                            j2();
                            b61Var.setScaleX(1.0f);
                            b61Var.setVisibility(0);
                            q2(1);
                        }
                        if (jeVar4 != null) {
                            ViewPropertyAnimator viewPropertyAnimator3 = this.g2;
                            if (viewPropertyAnimator3 != null) {
                                viewPropertyAnimator3.cancel();
                                this.g2 = null;
                            }
                            this.l2 = 1.0f;
                            jeVar4.setAlpha(1.0f);
                            jeVar4.setScaleX(1.0f);
                            jeVar4.setScaleY(1.0f);
                        }
                        this.B2 = false;
                        mg mgVar3 = this.P3;
                        if (mgVar3 != null && mgVar3.w0()) {
                            g0();
                        }
                        if (this.z2 != null) {
                            mg mgVar4 = this.P3;
                            if (mgVar4 != null && mgVar4.w0()) {
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
                        if (b61Var != null) {
                            if (b61Var.getVisibility() != 0) {
                                b61Var.setVisibility(0);
                                this.F = 0.0f;
                                j2();
                                b61Var.setScaleX(0.0f);
                            }
                            this.i3 = new AnimatorSet();
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(ObjectAnimator.ofFloat(b61Var, deVar, 1.0f));
                            arrayList3.add(ObjectAnimator.ofFloat(b61Var, (Property<org.telegram.ui.b61, Float>) property, 1.0f));
                            lh.h hVar4 = this.f7;
                            if (hVar4 != null) {
                                hVar4.e(0, false, true);
                            }
                            if (jeVar4 != null) {
                                ViewPropertyAnimator viewPropertyAnimator4 = this.g2;
                                if (viewPropertyAnimator4 != null) {
                                    viewPropertyAnimator4.cancel();
                                    this.g2 = null;
                                }
                                this.l2 = 1.0f;
                                arrayList3.add(ObjectAnimator.ofFloat(jeVar4, (Property<je, Float>) property3, 1.0f));
                                arrayList3.add(ObjectAnimator.ofFloat(jeVar4, (Property<je, Float>) property, 1.0f));
                                arrayList3.add(ObjectAnimator.ofFloat(jeVar4, (Property<je, Float>) property2, 1.0f));
                            }
                            mg mgVar5 = this.P3;
                            boolean z19 = mgVar5 != null && mgVar5.w0();
                            this.B2 = false;
                            if (z19) {
                                g0();
                            }
                            te teVar2 = this.z2;
                            if (teVar2 != null) {
                                if (z19) {
                                    teVar2.setVisibility(0);
                                    this.z2.setTag(1);
                                    this.z2.setPivotX(org.telegram.messenger.g0.L(44.0f));
                                    arrayList3.add(ObjectAnimator.ofFloat(this.z2, (Property<te, Float>) property3, 1.0f));
                                    arrayList3.add(ObjectAnimator.ofFloat(this.z2, (Property<te, Float>) property, 1.0f));
                                    arrayList3.add(p(0.0f));
                                    ImageView imageView7 = this.y2;
                                    if (imageView7 != null && imageView7.getVisibility() == 0) {
                                        imageView7.setVisibility(8);
                                    }
                                } else {
                                    teVar2.setAlpha(1.0f);
                                    this.z2.setScaleX(1.0f);
                                    this.z2.setScaleY(1.0f);
                                    this.z2.setTranslationX(0.0f);
                                }
                            }
                            this.i3.playTogether(arrayList3);
                            this.i3.setDuration(100L);
                            this.i3.addListener(new be(this, 8));
                            this.i3.start();
                            q2(1);
                            if (getVisibility() == 0) {
                                this.P3.t2();
                            }
                        }
                        peVar2.setVisibility(0);
                        this.h3 = new AnimatorSet();
                        this.l3 = 2;
                        ArrayList arrayList4 = new ArrayList();
                        org.telegram.ui.bn bnVar = this.F3;
                        TLRPC.Chat g10 = bnVar == null ? null : bnVar.g();
                        TLRPC.UserFull R8 = bnVar == null ? this.L : bnVar.R8();
                        if (g10 != null) {
                            if (!org.telegram.messenger.v3.v(g10)) {
                                if (!org.telegram.messenger.v3.s(g10)) {
                                }
                            }
                            f10 = 1.0f;
                        } else if (R8 != null) {
                            if (R8.voice_messages_forbidden) {
                            }
                            f10 = 1.0f;
                        } else {
                            i10 = 1;
                            f10 = 1.0f;
                            float[] fArr13 = new float[i10];
                            fArr13[0] = 1.0f;
                            arrayList4.add(ObjectAnimator.ofFloat(qeVar, (Property<qe, Float>) property, fArr13));
                            float[] fArr14 = new float[i10];
                            fArr14[0] = 1.0f;
                            arrayList4.add(ObjectAnimator.ofFloat(qeVar, (Property<qe, Float>) property2, fArr14));
                            float[] fArr15 = new float[i10];
                            fArr15[0] = f10;
                            arrayList4.add(ObjectAnimator.ofFloat(qeVar, (Property<qe, Float>) property3, fArr15));
                            if (imageView4.getVisibility() != 0) {
                                float[] fArr16 = new float[i10];
                                fArr16[0] = 0.1f;
                                arrayList4.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property, fArr16));
                                float[] fArr17 = new float[i10];
                                fArr17[0] = 0.1f;
                                arrayList4.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property2, fArr17));
                                float[] fArr18 = new float[i10];
                                fArr18[0] = 0.0f;
                                arrayList4.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property3, fArr18));
                            } else {
                                je jeVar11 = this.T0;
                                if (jeVar11 != null && jeVar11.getVisibility() == 0) {
                                    je jeVar12 = this.T0;
                                    float[] fArr19 = new float[i10];
                                    fArr19[0] = 0.1f;
                                    arrayList4.add(ObjectAnimator.ofFloat(jeVar12, (Property<je, Float>) property, fArr19));
                                    je jeVar13 = this.T0;
                                    float[] fArr20 = new float[i10];
                                    fArr20[0] = 0.1f;
                                    arrayList4.add(ObjectAnimator.ofFloat(jeVar13, (Property<je, Float>) property2, fArr20));
                                    je jeVar14 = this.T0;
                                    float[] fArr21 = new float[i10];
                                    fArr21[0] = 0.0f;
                                    arrayList4.add(ObjectAnimator.ofFloat(jeVar14, (Property<je, Float>) property3, fArr21));
                                } else if (ugVar.getVisibility() == 0) {
                                    float[] fArr22 = new float[i10];
                                    fArr22[0] = 0.1f;
                                    arrayList4.add(ObjectAnimator.ofFloat(ugVar, (Property<ug, Float>) property, fArr22));
                                    float[] fArr23 = new float[i10];
                                    fArr23[0] = 0.1f;
                                    arrayList4.add(ObjectAnimator.ofFloat(ugVar, (Property<ug, Float>) property2, fArr23));
                                    float[] fArr24 = new float[i10];
                                    fArr24[0] = 0.0f;
                                    arrayList4.add(ObjectAnimator.ofFloat(ugVar, (Property<ug, Float>) property3, fArr24));
                                } else {
                                    View sendButtonInternal = getSendButtonInternal();
                                    float[] fArr25 = new float[i10];
                                    fArr25[0] = 0.1f;
                                    arrayList4.add(ObjectAnimator.ofFloat(sendButtonInternal, (Property<View, Float>) property, fArr25));
                                    View sendButtonInternal2 = getSendButtonInternal();
                                    float[] fArr26 = new float[i10];
                                    fArr26[0] = 0.1f;
                                    arrayList4.add(ObjectAnimator.ofFloat(sendButtonInternal2, (Property<View, Float>) property2, fArr26));
                                    View sendButtonInternal3 = getSendButtonInternal();
                                    float[] fArr27 = new float[i10];
                                    fArr27[0] = 0.0f;
                                    arrayList4.add(ObjectAnimator.ofFloat(sendButtonInternal3, (Property<View, Float>) property3, fArr27));
                                }
                            }
                            this.h3.playTogether(arrayList4);
                            this.h3.setDuration(150L);
                            this.h3.addListener(new be(this, 9));
                            this.h3.start();
                        }
                        i10 = 1;
                        float[] fArr132 = new float[i10];
                        fArr132[0] = 1.0f;
                        arrayList4.add(ObjectAnimator.ofFloat(qeVar, (Property<qe, Float>) property, fArr132));
                        float[] fArr142 = new float[i10];
                        fArr142[0] = 1.0f;
                        arrayList4.add(ObjectAnimator.ofFloat(qeVar, (Property<qe, Float>) property2, fArr142));
                        float[] fArr152 = new float[i10];
                        fArr152[0] = f10;
                        arrayList4.add(ObjectAnimator.ofFloat(qeVar, (Property<qe, Float>) property3, fArr152));
                        if (imageView4.getVisibility() != 0) {
                        }
                        this.h3.playTogether(arrayList4);
                        this.h3.setDuration(150L);
                        this.h3.addListener(new be(this, 9));
                        this.h3.start();
                    }
                }
            } else if (!z15) {
                ugVar.setScaleX(0.1f);
                ugVar.setScaleY(0.1f);
                ugVar.setAlpha(0.0f);
                setSlowModeButtonVisible(false);
                getSendButtonInternal().setScaleX(0.1f);
                getSendButtonInternal().setScaleY(0.1f);
                getSendButtonInternal().setAlpha(0.0f);
                getSendButtonInternal().setVisibility(8);
                imageView4.setScaleX(0.1f);
                imageView4.setScaleY(0.1f);
                imageView4.setAlpha(0.0f);
                imageView4.setVisibility(8);
                qeVar.setScaleX(0.1f);
                qeVar.setScaleY(0.1f);
                qeVar.setAlpha(0.0f);
                peVar2.setVisibility(8);
                a0();
                this.T0.setScaleX(1.0f);
                this.T0.setScaleY(1.0f);
                this.T0.setAlpha(1.0f);
                this.T0.setVisibility(0);
                if (b61Var != null) {
                    if (getVisibility() == 0) {
                        this.P3.t2();
                    }
                    b61Var.setVisibility(0);
                    q2(1);
                }
                this.B2 = false;
                mg mgVar6 = this.P3;
                boolean z20 = mgVar6 != null && mgVar6.w0();
                if (z20) {
                    g0();
                }
                te teVar3 = this.z2;
                if (teVar3 != null) {
                    if (z20) {
                        teVar3.setVisibility(0);
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
                if (b61Var != null && this.m3 == 0) {
                    b61Var.setVisibility(0);
                    this.i3 = new AnimatorSet();
                    ArrayList arrayList5 = new ArrayList();
                    arrayList5.add(ObjectAnimator.ofFloat(b61Var, deVar, 1.0f));
                    arrayList5.add(ObjectAnimator.ofFloat(b61Var, (Property<org.telegram.ui.b61, Float>) property, 1.0f));
                    lh.h hVar5 = this.f7;
                    if (hVar5 != null) {
                        hVar5.e(0, false, true);
                    }
                    if (jeVar4 != null) {
                        ViewPropertyAnimator viewPropertyAnimator5 = this.g2;
                        if (viewPropertyAnimator5 != null) {
                            viewPropertyAnimator5.cancel();
                            this.g2 = null;
                        }
                        this.l2 = 1.0f;
                        arrayList5.add(ObjectAnimator.ofFloat(jeVar4, (Property<je, Float>) property3, 1.0f));
                        arrayList5.add(ObjectAnimator.ofFloat(jeVar4, (Property<je, Float>) property, 1.0f));
                        arrayList5.add(ObjectAnimator.ofFloat(jeVar4, (Property<je, Float>) property2, 1.0f));
                    }
                    mg mgVar7 = this.P3;
                    boolean z21 = mgVar7 != null && mgVar7.w0();
                    this.B2 = false;
                    if (z21) {
                        g0();
                    }
                    te teVar4 = this.z2;
                    if (teVar4 != null) {
                        teVar4.setScaleY(1.0f);
                        if (z21) {
                            this.z2.setVisibility(0);
                            this.z2.setTag(1);
                            this.z2.setPivotX(org.telegram.messenger.g0.L(44.0f));
                            arrayList5.add(ObjectAnimator.ofFloat(this.z2, (Property<te, Float>) property3, 1.0f));
                            arrayList5.add(ObjectAnimator.ofFloat(this.z2, (Property<te, Float>) property, 1.0f));
                            arrayList5.add(p(0.0f));
                        } else {
                            this.z2.setAlpha(1.0f);
                            this.z2.setScaleX(1.0f);
                            this.z2.setTranslationX(0.0f);
                        }
                    }
                    this.i3.playTogether(arrayList5);
                    this.i3.setDuration(100L);
                    this.i3.addListener(new be(this, 6));
                    this.i3.start();
                    q2(1);
                    if (getVisibility() == 0) {
                        this.P3.t2();
                    }
                }
                a0();
                this.T0.setVisibility(0);
                this.h3 = new AnimatorSet();
                this.l3 = 4;
                ArrayList arrayList6 = new ArrayList();
                arrayList6.add(ObjectAnimator.ofFloat(this.T0, (Property<je, Float>) property, 1.0f));
                arrayList6.add(ObjectAnimator.ofFloat(this.T0, (Property<je, Float>) property2, 1.0f));
                arrayList6.add(ObjectAnimator.ofFloat(this.T0, (Property<je, Float>) property3, 1.0f));
                if (imageView4.getVisibility() == 0) {
                    arrayList6.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property2, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property3, 0.0f));
                } else if (peVar2.getVisibility() == 0) {
                    arrayList6.add(ObjectAnimator.ofFloat(qeVar, (Property<qe, Float>) property, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(qeVar, (Property<qe, Float>) property2, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(qeVar, (Property<qe, Float>) property3, 0.0f));
                } else if (ugVar.getVisibility() == 0) {
                    arrayList6.add(ObjectAnimator.ofFloat(ugVar, (Property<ug, Float>) property, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(ugVar, (Property<ug, Float>) property2, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(ugVar, (Property<ug, Float>) property3, 0.0f));
                } else {
                    arrayList6.add(ObjectAnimator.ofFloat(getSendButtonInternal(), (Property<View, Float>) property, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(getSendButtonInternal(), (Property<View, Float>) property2, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(getSendButtonInternal(), (Property<View, Float>) property3, 0.0f));
                }
                this.h3.playTogether(arrayList6);
                this.h3.setDuration(250L);
                this.h3.addListener(new be(this, 7));
                this.h3.start();
            }
        } else if (ugVar.getVisibility() != 0) {
            if (!z15) {
                ugVar.setScaleX(1.0f);
                ugVar.setScaleY(1.0f);
                ugVar.setAlpha(1.0f);
                setSlowModeButtonVisible(true);
                qeVar.setScaleX(0.1f);
                qeVar.setScaleY(0.1f);
                qeVar.setAlpha(0.0f);
                peVar2.setVisibility(8);
                getSendButtonInternal().setScaleX(0.1f);
                getSendButtonInternal().setScaleY(0.1f);
                getSendButtonInternal().setAlpha(0.0f);
                getSendButtonInternal().setVisibility(8);
                imageView4.setScaleX(0.1f);
                imageView4.setScaleY(0.1f);
                imageView4.setAlpha(0.0f);
                imageView4.setVisibility(8);
                je jeVar15 = this.T0;
                if (jeVar15 == null || jeVar15.getVisibility() != 0) {
                    i11 = 8;
                } else {
                    this.T0.setScaleX(0.1f);
                    this.T0.setScaleY(0.1f);
                    this.T0.setAlpha(0.0f);
                    i11 = 8;
                    this.T0.setVisibility(8);
                }
                if (b61Var != null) {
                    b61Var.setVisibility(i11);
                    if (this.P3 != null && getVisibility() == 0) {
                        this.P3.g0();
                    }
                    z13 = false;
                    q2(0);
                    lh.h hVar6 = this.f7;
                    if (hVar6 != null) {
                        hVar6.e(0, false, false);
                    }
                    if (jeVar4 != null) {
                        this.l2 = 0.0f;
                        jeVar4.setAlpha(0.0f);
                        jeVar4.setScaleX(0.5f);
                        jeVar4.setScaleY(0.5f);
                    }
                } else {
                    z13 = false;
                }
                this.B2 = z13;
                mg mgVar8 = this.P3;
                boolean z22 = mgVar8 != null && mgVar8.w0();
                if (z22) {
                    g0();
                }
                te teVar5 = this.z2;
                if (teVar5 != null) {
                    if (z22) {
                        teVar5.setVisibility(0);
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
                    r32 = 0;
                    this.h3 = null;
                } else {
                    r32 = 0;
                }
                AnimatorSet animatorSet11 = this.i3;
                if (animatorSet11 != null) {
                    animatorSet11.cancel();
                    this.i3 = r32;
                }
                ViewPropertyAnimator viewPropertyAnimator6 = this.g2;
                if (viewPropertyAnimator6 != null) {
                    viewPropertyAnimator6.cancel();
                    this.g2 = r32;
                }
                if (b61Var != null) {
                    this.i3 = new AnimatorSet();
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(ObjectAnimator.ofFloat(b61Var, deVar, 0.0f));
                    arrayList7.add(ObjectAnimator.ofFloat(b61Var, (Property<org.telegram.ui.b61, Float>) property, 0.5f));
                    this.B2 = false;
                    mg mgVar9 = this.P3;
                    boolean z23 = mgVar9 != null && mgVar9.w0();
                    if (z23) {
                        g0();
                    }
                    lh.h hVar7 = this.f7;
                    if (hVar7 != null) {
                        hVar7.e(0, false, true);
                    }
                    if (jeVar4 != null) {
                        this.l2 = 0.0f;
                        arrayList7.add(ObjectAnimator.ofFloat(jeVar4, (Property<je, Float>) property3, 0.0f));
                        arrayList7.add(ObjectAnimator.ofFloat(jeVar4, (Property<je, Float>) property, 0.5f));
                        arrayList7.add(ObjectAnimator.ofFloat(jeVar4, (Property<je, Float>) property2, 0.5f));
                    }
                    te teVar6 = this.z2;
                    if (teVar6 != null) {
                        teVar6.setScaleY(1.0f);
                        if (z23) {
                            this.z2.setVisibility(0);
                            this.z2.setTag(1);
                            this.z2.setPivotX(org.telegram.messenger.g0.L(44.0f));
                            arrayList7.add(p(0.0f));
                            arrayList7.add(ObjectAnimator.ofFloat(this.z2, (Property<te, Float>) property3, 1.0f));
                            arrayList7.add(ObjectAnimator.ofFloat(this.z2, (Property<te, Float>) property, 1.0f));
                        } else {
                            this.z2.setTranslationX(0.0f);
                            this.z2.setAlpha(1.0f);
                            this.z2.setScaleX(1.0f);
                        }
                    }
                    this.i3.playTogether(arrayList7);
                    this.i3.setDuration(100L);
                    this.i3.addListener(new be(this, 4));
                    this.i3.start();
                    q2(0);
                    if (this.P3 != null && getVisibility() == 0) {
                        this.P3.g0();
                    }
                    i12 = 5;
                } else {
                    i12 = 5;
                }
                this.l3 = i12;
                this.h3 = new AnimatorSet();
                ArrayList arrayList8 = new ArrayList();
                if (peVar2.getVisibility() == 0) {
                    i13 = 1;
                    r52 = 0;
                    arrayList8.add(ObjectAnimator.ofFloat(qeVar, (Property<qe, Float>) property, 0.1f));
                    arrayList8.add(ObjectAnimator.ofFloat(qeVar, (Property<qe, Float>) property2, 0.1f));
                    arrayList8.add(ObjectAnimator.ofFloat(qeVar, (Property<qe, Float>) property3, 0.0f));
                } else {
                    r52 = 0;
                    i13 = 1;
                }
                je jeVar16 = this.T0;
                if (jeVar16 != null && jeVar16.getVisibility() == 0) {
                    je jeVar17 = this.T0;
                    float[] fArr28 = new float[i13];
                    fArr28[r52] = 0.1f;
                    arrayList8.add(ObjectAnimator.ofFloat(jeVar17, (Property<je, Float>) property, fArr28));
                    je jeVar18 = this.T0;
                    float[] fArr29 = new float[i13];
                    fArr29[r52] = 0.1f;
                    arrayList8.add(ObjectAnimator.ofFloat(jeVar18, (Property<je, Float>) property2, fArr29));
                    je jeVar19 = this.T0;
                    float[] fArr30 = new float[i13];
                    fArr30[r52] = 0.0f;
                    arrayList8.add(ObjectAnimator.ofFloat(jeVar19, (Property<je, Float>) property3, fArr30));
                }
                if (getSendButtonInternal().getVisibility() == 0) {
                    arrayList8.add(q(r52));
                }
                if (imageView4.getVisibility() == 0) {
                    float[] fArr31 = new float[1];
                    fArr31[r52] = 0.1f;
                    arrayList8.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property, fArr31));
                    float[] fArr32 = new float[1];
                    fArr32[r52] = 0.1f;
                    arrayList8.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property2, fArr32));
                    float[] fArr33 = new float[1];
                    fArr33[r52] = 0.0f;
                    arrayList8.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property3, fArr33));
                }
                float[] fArr34 = new float[1];
                fArr34[r52] = 1.0f;
                arrayList8.add(ObjectAnimator.ofFloat(ugVar, (Property<ug, Float>) property, fArr34));
                float[] fArr35 = new float[1];
                fArr35[r52] = 1.0f;
                arrayList8.add(ObjectAnimator.ofFloat(ugVar, (Property<ug, Float>) property2, fArr35));
                float[] fArr36 = new float[1];
                fArr36[r52] = 1.0f;
                arrayList8.add(ObjectAnimator.ofFloat(ugVar, (Property<ug, Float>) property3, fArr36));
                setSlowModeButtonVisible(true);
                this.h3.playTogether(arrayList8);
                this.h3.setDuration(220L);
                this.h3.setInterpolator(kr.h);
                this.h3.addListener(new be(this, 5));
                this.h3.start();
            }
        }
        seVar = seVar2;
        z12 = false;
        if (this.a6) {
        }
    }

    public void P0(boolean z10) {
        if (this.w2 == null || !this.V3) {
            return;
        }
        td tdVar = this.W;
        if (tdVar != null) {
            org.telegram.messenger.g0.r(tdVar);
        }
        this.V3 = false;
        this.W3 = false;
        if (this.X3) {
            this.h7.a(false, z10);
        }
    }

    public final void P1(org.telegram.messenger.fj fjVar, org.telegram.ui.rm rmVar) {
        Q1(fjVar, rmVar, null);
    }

    public final void Q() {
        if (this.V0 == null) {
            return;
        }
        Point point = org.telegram.messenger.g0.q;
        int i7 = point.x > point.y ? this.o3 : this.n3;
        int L = ((((this.e2 - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.n) - org.telegram.messenger.g0.L(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getHeight();
        int i10 = 2;
        if (this.H2 == 2) {
            L = Math.min(L, org.telegram.messenger.g0.L(175.0f) + i7);
        }
        int i11 = this.V0.getLayoutParams().height;
        if (i11 == L) {
            return;
        }
        AnimatorSet animatorSet = this.r4;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.r4 = null;
        }
        this.t4 = L;
        int i12 = 0;
        org.telegram.ui.Cells.h1 h1Var = this.j4;
        if (i11 > L) {
            dd ddVar = new dd(this, 17);
            this.V0.setLayerType(2, null);
            if (this.w) {
                this.x = ddVar;
            } else {
                AnimatorSet animatorSet2 = new AnimatorSet();
                if (this.e7 != null) {
                    animatorSet2.playTogether(ValueAnimator.ofInt(-(this.t4 - i7)), ValueAnimator.ofInt(-(this.t4 - i7)));
                } else {
                    animatorSet2.playTogether(ObjectAnimator.ofInt(this, h1Var, -(this.t4 - i7)), ObjectAnimator.ofInt(this.V0, h1Var, -(this.t4 - i7)));
                    ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new pd(this, i10));
                }
                animatorSet2.setDuration(300L);
                animatorSet2.setInterpolator(kr.f);
                animatorSet2.addListener(new ah.l(21, this, ddVar));
                this.r4 = animatorSet2;
                animatorSet2.start();
            }
        } else {
            if (this.e7 == null) {
                this.V0.getLayoutParams().height = this.t4;
            }
            this.c2.requestLayout();
            hf hfVar = this.F0;
            if (hfVar != null) {
                int selectionStart = hfVar.getSelectionStart();
                int selectionEnd = this.F0.getSelectionEnd();
                hf hfVar2 = this.F0;
                hfVar2.setText(hfVar2.getText());
                this.F0.setSelection(selectionStart, selectionEnd);
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            if (this.e7 != null) {
                animatorSet3.playTogether(ValueAnimator.ofInt(-(this.t4 - i7)), ValueAnimator.ofInt(-(this.t4 - i7)));
            } else {
                animatorSet3.playTogether(ObjectAnimator.ofInt(this, h1Var, -(this.t4 - i7)), ObjectAnimator.ofInt(this.V0, h1Var, -(this.t4 - i7)));
                ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new pd(this, 3));
            }
            animatorSet3.setDuration(300L);
            animatorSet3.setInterpolator(kr.f);
            animatorSet3.addListener(new be(this, i12));
            this.r4 = animatorSet3;
            this.V0.setLayerType(2, null);
            animatorSet3.start();
        }
        rh.e eVar = this.e7;
        if (eVar != null) {
            ((rh.h) eVar).h(L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        if ((r4.getLineRight(0) + r3) >= ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight())) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Q0() {
        hf hfVar = this.F0;
        if (hfVar != null) {
            if (TextUtils.isEmpty(hfVar.getCaption())) {
                hf hfVar2 = this.F0;
                int L = org.telegram.messenger.g0.L(44.0f);
                Layout layout = hfVar2.getLayout();
                if (layout != null) {
                    if (layout.getLineCount() > 0) {
                        if (layout.getLineCount() <= 1) {
                        }
                    }
                }
            }
        }
        return org.telegram.messenger.gd.a0;
    }

    public final void Q1(org.telegram.messenger.fj fjVar, org.telegram.ui.rm rmVar, org.telegram.messenger.fj fjVar2) {
        org.telegram.messenger.fj fjVar3;
        org.telegram.ui.bn bnVar = this.F3;
        boolean z10 = (bnVar == null || !bnVar.T9() || this.K3 == fjVar2) ? false : true;
        if (fjVar != null) {
            if (this.M3 == null && (fjVar3 = this.c3) != this.J3) {
                this.M3 = fjVar3;
            }
            this.J3 = fjVar;
            this.L3 = rmVar;
            this.K3 = fjVar2;
            if (bnVar == null || !bnVar.x4 || bnVar.m4 != fjVar) {
                C1(fjVar, true, true);
            }
        } else if (this.J3 == this.c3) {
            this.J3 = null;
            this.K3 = null;
            this.L3 = null;
            C1(this.M3, true, false);
            this.M3 = null;
        } else {
            this.J3 = null;
            this.L3 = null;
            this.K3 = null;
        }
        M(true);
        mg mgVar = this.P3;
        TL_stories.StoryItem Y0 = mgVar != null ? mgVar.Y0() : null;
        MediaController B = MediaController.B();
        org.telegram.messenger.fj threadMessage = getThreadMessage();
        B.r1 = fjVar;
        B.s1 = threadMessage;
        B.t1 = Y0;
        p2(z10);
    }

    public final void R() {
        this.l7 = D(true);
        q0();
        float D = D(false);
        if (this.k7 != D) {
            this.k7 = D;
            c1(D);
        }
    }

    public final boolean R0() {
        return this.P2 != null;
    }

    public final void R1(int i7, boolean z10) {
        boolean z11 = i7 != 0;
        if (z11 != (this.H2 != 0)) {
            ValueAnimator valueAnimator = this.w0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.w0.cancel();
            }
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x0, z11 ? 1.0f : 0.0f);
                this.w0 = ofFloat;
                int i10 = 4;
                ofFloat.addUpdateListener(new pd(this, i10));
                this.w0.addListener(new ve(this, z11, i10));
                this.w0.setDuration(220L);
                this.w0.setInterpolator(kr.f);
                this.w0.start();
            } else {
                this.x0 = z11 ? 1.0f : 0.0f;
                eg egVar = this.V0;
                if (egVar != null) {
                    egVar.Z();
                }
            }
        }
        this.H2 = i7;
    }

    public final void S() {
        float f10 = this.h7.e;
        if (this.w2 != null) {
            float measuredHeight = getMeasuredHeight() - this.g7.f;
            this.w2.setTranslationY(measuredHeight - (r4.getMeasuredHeight() * f10));
            this.w2.setVisibility(f10 > 0.0f ? 0 : 8);
        }
        boolean z10 = f10 > 0.0f;
        if (this.J6 == z10) {
            return;
        }
        ee eeVar = this.p2;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) eeVar.getLayoutParams();
        int i7 = z10 ? this.w2.getLayoutParams().height : 0;
        layoutParams.topMargin = i7;
        layoutParams.topMargin = org.telegram.messenger.g0.L(9.0f) + i7;
        eeVar.setLayoutParams(layoutParams);
        this.J6 = z10;
        setMinimumHeight(org.telegram.messenger.g0.L(44.0f) + (z10 ? this.w2.getLayoutParams().height : 0));
        if (this.p4) {
            if (this.H2 == 0) {
                S1(false, true, false, true);
            } else {
                Q();
            }
        }
    }

    public final boolean S0() {
        return this.d1;
    }

    public final void S1(boolean z10, boolean z11, boolean z12, boolean z13) {
        final int i7 = 1;
        org.telegram.ui.ActionBar.i1 i1Var = this.V;
        if ((i1Var != null && i1Var.f) || this.b4 || this.V0 == null) {
            return;
        }
        if (z12 || this.p4 != z10) {
            this.p4 = z10;
            mg mgVar = this.P3;
            if (mgVar != null) {
                mgVar.q1();
            }
            Point point = org.telegram.messenger.g0.q;
            final int i10 = point.x > point.y ? this.o3 : this.n3;
            AnimatorSet animatorSet = this.r4;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.r4 = null;
            }
            boolean z14 = this.p4;
            h2.f fVar = this.B4;
            org.telegram.ui.Cells.h1 h1Var = this.j4;
            final int i11 = 0;
            cu0 cu0Var = this.c2;
            if (z14) {
                if (z13) {
                    org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.j1, 1);
                }
                int height = cu0Var.getHeight();
                this.e2 = height;
                int L = ((((height - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.n) - org.telegram.messenger.g0.L(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getHeight();
                this.t4 = L;
                if (this.H2 == 2) {
                    this.t4 = Math.min(L, org.telegram.messenger.g0.L(175.0f) + i10);
                }
                if (this.e7 == null) {
                    this.V0.getLayoutParams().height = this.t4;
                }
                cu0Var.requestLayout();
                if (this.Y5) {
                    cu0Var.setForeground(new sc(this));
                }
                hf hfVar = this.F0;
                if (hfVar != null) {
                    int selectionStart = hfVar.getSelectionStart();
                    int selectionEnd = this.F0.getSelectionEnd();
                    hf hfVar2 = this.F0;
                    hfVar2.setText(hfVar2.getText());
                    this.F0.setSelection(selectionStart, selectionEnd);
                }
                if (z11) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    if (this.e7 != null) {
                        animatorSet2.playTogether(ValueAnimator.ofInt(-(this.t4 - i10)), ValueAnimator.ofInt(-(this.t4 - i10)), ObjectAnimator.ofFloat(this.v4, "animationProgress", 1.0f));
                    } else {
                        animatorSet2.playTogether(ObjectAnimator.ofInt(this, h1Var, -(this.t4 - i10)), ObjectAnimator.ofInt(this.V0, h1Var, -(this.t4 - i10)), ObjectAnimator.ofFloat(this.v4, "animationProgress", 1.0f));
                    }
                    animatorSet2.setDuration(300L);
                    animatorSet2.setInterpolator(kr.f);
                    if (this.e7 == null) {
                        ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.nd
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
                                        int i14 = ChatActivityEnterView.s7;
                                        chatActivityEnterView.s4 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.t4 - i13)));
                                        chatActivityEnterView.c2.invalidate();
                                        break;
                                    default:
                                        int i15 = ChatActivityEnterView.s7;
                                        chatActivityEnterView.s4 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.t4 - i13));
                                        chatActivityEnterView.c2.invalidate();
                                        break;
                                }
                            }
                        });
                    }
                    animatorSet2.addListener(new be(this, i7));
                    this.r4 = animatorSet2;
                    this.V0.setLayerType(2, null);
                    fVar.d();
                    this.s4 = 0.0f;
                    cu0Var.invalidate();
                    animatorSet2.start();
                } else {
                    this.s4 = 1.0f;
                    if (this.e7 == null) {
                        setTranslationY(-(this.t4 - i10));
                        this.V0.setTranslationY(-(this.t4 - i10));
                    }
                    AnimatedArrowDrawable animatedArrowDrawable = this.v4;
                    if (animatedArrowDrawable != null) {
                        animatedArrowDrawable.setAnimationProgress(1.0f);
                    }
                }
                rh.e eVar = this.e7;
                if (eVar != null) {
                    ((rh.h) eVar).h(this.t4);
                }
            } else {
                if (z13) {
                    org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.k1, 1);
                }
                if (z11) {
                    this.q4 = true;
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    if (this.e7 != null) {
                        animatorSet3.playTogether(ValueAnimator.ofInt(0), ValueAnimator.ofInt(0), ObjectAnimator.ofFloat(this.v4, "animationProgress", 0.0f));
                    } else {
                        animatorSet3.playTogether(ObjectAnimator.ofInt(this, h1Var, 0), ObjectAnimator.ofInt(this.V0, h1Var, 0), ObjectAnimator.ofFloat(this.v4, "animationProgress", 0.0f));
                    }
                    animatorSet3.setDuration(300L);
                    animatorSet3.setInterpolator(kr.f);
                    if (this.e7 == null) {
                        ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.nd
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
                                        int i14 = ChatActivityEnterView.s7;
                                        chatActivityEnterView.s4 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.t4 - i13)));
                                        chatActivityEnterView.c2.invalidate();
                                        break;
                                    default:
                                        int i15 = ChatActivityEnterView.s7;
                                        chatActivityEnterView.s4 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.t4 - i13));
                                        chatActivityEnterView.c2.invalidate();
                                        break;
                                }
                            }
                        });
                    }
                    animatorSet3.addListener(new ce(this, i10, i11));
                    this.s4 = 1.0f;
                    cu0Var.invalidate();
                    this.r4 = animatorSet3;
                    this.V0.setLayerType(2, null);
                    fVar.d();
                    animatorSet3.start();
                } else {
                    this.s4 = 0.0f;
                    if (this.e7 == null) {
                        setTranslationY(0.0f);
                        this.V0.setTranslationY(0.0f);
                        this.V0.getLayoutParams().height = i10;
                    }
                    cu0Var.requestLayout();
                    cu0Var.setForeground(null);
                    cu0Var.setWillNotDraw(false);
                    AnimatedArrowDrawable animatedArrowDrawable2 = this.v4;
                    if (animatedArrowDrawable2 != null) {
                        animatedArrowDrawable2.setAnimationProgress(0.0f);
                    }
                }
                rh.e eVar2 = this.e7;
                if (eVar2 != null) {
                    ((rh.h) eVar2).h(i10);
                }
            }
            je jeVar = this.T0;
            if (jeVar != null) {
                if (this.p4) {
                    jeVar.setContentDescription(org.telegram.messenger.gd.N0(2131754893, "AccDescrCollapsePanel"));
                } else {
                    jeVar.setContentDescription(org.telegram.messenger.gd.N0(2131754883, "AccDescrExpandPanel"));
                }
            }
        }
    }

    public final void T() {
        org.telegram.ui.bn bnVar = this.F3;
        if (bnVar != null) {
            org.telegram.messenger.ri.d0(this.R).V1(bnVar.a(), bnVar.Q7(bnVar.F5), "", null, null, null, null, 0L, false, true, null);
        }
        setRichDraftPreview(null);
    }

    public final boolean T0() {
        return this.X0 || this.Y0;
    }

    public final void T1(boolean z10, boolean z11) {
        if (this.l5 == z10 && z11) {
            return;
        }
        ImageView imageView = this.m2;
        if (imageView == null) {
            if (!z10 && !this.p7) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = new ImageView(getContext());
                this.m2 = imageView2;
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                ImageView imageView3 = this.m2;
                int i7 = org.telegram.ui.ActionBar.n6.Nl;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                org.telegram.ui.ActionBar.i6 i6Var = this.M4;
                org.telegram.ui.ActionBar.u6.s(imageView3, i7, i6Var, mode);
                this.m2.setImageResource(R.drawable.input_suggest_paid_24);
                ImageView imageView4 = this.m2;
                int i10 = org.telegram.ui.ActionBar.n6.i6;
                org.telegram.ui.ActionBar.u6.Q(imageView4, org.telegram.ui.ActionBar.n6.h0(G0(i10), 1, -1), null, org.telegram.ui.ActionBar.u6.M(i10), i6Var);
                if (this.p7) {
                    this.m2.setTranslationX(org.telegram.messenger.g0.L(42.0f));
                    this.p2.addView(this.m2, c8.na.d(44, 44.0f, 85, 0.0f, 0.0f, 50.0f, 0.0f));
                } else {
                    this.f2.addView(this.m2, 0, c8.na.o(44, 44));
                }
                this.m2.setOnClickListener(new id(this, r3));
                this.m2.setContentDescription(org.telegram.messenger.gd.N0(2131754921, null));
            }
        }
        boolean z12 = this.l5 != z10;
        this.l5 = z10;
        float f10 = z10 ? 1.0f : 0.6f;
        float f11 = z10 ? 1.0f : 0.0f;
        this.m2.setEnabled(z10);
        this.m2.setClickable(z10);
        ValueAnimator valueAnimator = this.m5;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.m5 = null;
        }
        if (z11) {
            if (this.p7) {
                this.m2.setVisibility(0);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.m2.getAlpha(), f11);
            this.m5 = ofFloat;
            ofFloat.addUpdateListener(new pd(this, 11));
            this.m5.addListener(new ve(this, z10, r3));
            this.m5.setDuration(220L);
            this.m5.setInterpolator(kr.h);
            this.m5.start();
        } else {
            this.m2.setScaleX(f10);
            this.m2.setScaleY(f10);
            this.m2.setAlpha(f11);
            if (this.p7) {
                this.m2.setVisibility(z10 ? 0 : 8);
            }
        }
        q2(this.M6);
        if (z12) {
            P(true);
        }
    }

    public final void U() {
        org.telegram.messenger.g0.v1(this.F0);
    }

    public final boolean U0(View view) {
        return view == this.x2 || view == this.V0;
    }

    public final void U1(boolean z10, boolean z11) {
        yh.a aVar;
        boolean z12 = false;
        if (!this.K1 || (aVar = this.T1) == null) {
            this.U1 = false;
            return;
        }
        if (this.U1 == z10 && z11) {
            return;
        }
        this.U1 = z10;
        zi0 zi0Var = this.i1;
        if (zi0Var != null) {
            aVar.c(Math.round(Math.max(1.0f, (zi0Var.w - zi0Var.s) * zi0Var.r)));
        }
        if (z10) {
            org.telegram.messenger.g0.r(this.X1);
        } else if (this.T1.c.hasFocus()) {
            org.telegram.messenger.g0.v1(this.T1.c);
            this.T1.c.clearFocus();
        }
        this.T1.setCollapsing(!z10);
        this.T1.animate().cancel();
        this.T1.setAlpha(1.0f);
        this.T1.setVisibility(0);
        ValueAnimator valueAnimator = this.W1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.W1 = null;
        }
        float f10 = z10 ? 1.0f : 0.0f;
        if (z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V1, f10);
            this.W1 = ofFloat;
            ofFloat.addUpdateListener(new pd(this, 7));
            this.W1.setDuration(360L);
            this.W1.setInterpolator(kr.h);
            this.W1.start();
        } else {
            w(f10);
        }
        se seVar = this.K0;
        if (seVar != null) {
            if (this.K1 && this.U1) {
                z12 = true;
            }
            seVar.setIconDimmed(z12);
        }
        qg qgVar = this.E2;
        if (qgVar != null) {
            qgVar.invalidate();
        }
    }

    public final void V() {
        if (this.n2 != null) {
            return;
        }
        je jeVar = new je(this, getContext(), 2);
        this.n2 = jeVar;
        mk0 mk0Var = new mk0(getContext());
        this.K2 = mk0Var;
        jeVar.setImageDrawable(mk0Var);
        mk0 mk0Var2 = this.K2;
        int i7 = org.telegram.ui.ActionBar.n6.Nl;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.i6 i6Var = this.M4;
        org.telegram.ui.ActionBar.u6.x(this, mk0Var2, i7, i6Var, mode);
        this.K2.a(R.drawable.input_bot2, false);
        this.n2.setScaleType(ImageView.ScaleType.CENTER);
        je jeVar2 = this.n2;
        int i10 = org.telegram.ui.ActionBar.n6.i6;
        org.telegram.ui.ActionBar.u6.Q(jeVar2, org.telegram.ui.ActionBar.n6.h0(G0(i10), 1, -1), null, org.telegram.ui.ActionBar.u6.M(i10), i6Var);
        this.n2.setVisibility(8);
        org.telegram.messenger.g0.X3(this.n2, false, 0.1f, true, false);
        this.f2.addView(this.n2, 0, c8.na.o(44, 44));
        this.n2.setOnClickListener(new id(this, 19));
    }

    public final boolean V0() {
        return this.v3 && ChatActivityEnterView.this.i5;
    }

    public final void V1(boolean z10) {
        org.telegram.ui.bn bnVar;
        ai.l0 l0Var;
        int i7 = 0;
        int i10 = 1;
        boolean z11 = (z10 || this.t2) && (bnVar = this.F3) != null && !bnVar.y() && ((l0Var = this.j1) == null || !l0Var.l());
        if (this.k6 == z11) {
            return;
        }
        if (z11) {
            org.telegram.messenger.mp.u1(this.R).T1().b();
        }
        this.k6 = z11;
        ImageView imageView = this.j2;
        imageView.setVisibility(0);
        imageView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).setInterpolator(kr.h).setDuration(420L).withEndAction(new od(this, z11, i7)).start();
        if (!z11) {
            hi.u3 u3Var = this.N;
            if (u3Var != null) {
                u3Var.f(true);
                this.N = null;
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.v2 v2Var = this.i2;
        Objects.requireNonNull(v2Var);
        imageView.postDelayed(new s0(v2Var, i10), 220L);
        hi.u3 u3Var2 = this.N;
        if (u3Var2 != null) {
            u3Var2.f(true);
            this.N = null;
        }
        if (org.telegram.messenger.mp.g1().getInt("aihintshown", 0) < 3) {
            hi.u3 u3Var3 = new hi.u3(getContext(), 3);
            this.N = u3Var3;
            u3Var3.r(true);
            this.N.v(org.telegram.messenger.gd.N0(2131754992, null));
            setHintGlass(this.N);
            this.N.p(0.0f, (imageView.getWidth() / 2.0f) + org.telegram.messenger.g0.L(4.0f));
            addView(this.N, c8.na.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
            hi.u3 u3Var4 = this.N;
            u3Var4.r0 = new org.telegram.ui.ah(27, this, u3Var3);
            u3Var4.d = 4000L;
            u3Var4.x();
            org.telegram.messenger.mp.g1().edit().putInt("aihintshown", org.telegram.messenger.mp.g1().getInt("aihintshown", 0) + 1).apply();
        }
    }

    public final void W() {
        if (this.m0 != null) {
            return;
        }
        ki.y yVar = new ki.y(getContext());
        this.m0 = yVar;
        yVar.setOnClickListener(new id(this, 11));
        this.o2.addView(this.m0, c8.na.d(-2, 32.0f, 83, 8.0f, 6.0f, 8.0f, 6.0f));
        org.telegram.messenger.g0.X3(this.m0, false, 1.0f, true, false);
        ki.y yVar2 = this.m0;
        if (!yVar2.f) {
            yVar2.f = true;
            yVar2.h = 1.0f;
            yVar2.requestLayout();
            yVar2.invalidate();
        }
    }

    public final boolean W0() {
        if (this.v3) {
            return true;
        }
        AnimatorSet animatorSet = this.j3;
        return (animatorSet == null || !animatorSet.isRunning() || this.a3) ? false : true;
    }

    public final void W1() {
        org.telegram.ui.bn bnVar = this.F3;
        if (bnVar == null || !org.telegram.messenger.v3.V(bnVar.e)) {
            return;
        }
        kc.b0(bnVar).f(org.telegram.messenger.mp.u1(this.R).X4, new dd(this, 8)).j();
    }

    public final void X() {
        if (this.c0 != null) {
            return;
        }
        NumberTextView numberTextView = new NumberTextView(getContext());
        this.c0 = numberTextView;
        numberTextView.setVisibility(8);
        this.c0.setTextSize(15);
        this.c0.setTextColor(G0(org.telegram.ui.ActionBar.n6.y6));
        this.c0.setTypeface(org.telegram.messenger.g0.o());
        this.c0.setCenterAlign(true);
        addView(this.c0, Math.min(2, getChildCount()), c8.na.d(44, 20.0f, 85, 3.0f, 0.0f, 0.0f, 44.0f));
    }

    public boolean X1(Runnable runnable) {
        return false;
    }

    public final void Y(boolean z10) {
        if (this.v2 != null) {
            return;
        }
        se seVar = new se(this, getContext(), this.M4);
        this.v2 = seVar;
        seVar.setContentDescription(org.telegram.messenger.gd.N0(2131751262, null));
        if (z10) {
            c8.sa.a(this.v2);
        }
        this.p2.addView(this.v2, c8.na.e(44, 44, 85));
    }

    public final boolean Y0() {
        return c() || this.j7.f;
    }

    public final void Y1() {
        Z1(1, 0, true, true);
    }

    public final void Z() {
        eg egVar = this.V0;
        if (egVar != null && egVar.d1 != org.telegram.messenger.i10.t0) {
            this.d2.removeView(egVar);
            this.V0 = null;
        }
        if (this.V0 != null) {
            return;
        }
        eg egVar2 = new eg(this, this.F3, this.y3, getContext(), this.T2, this.c2, this.Y5, this.M4, this.U0, this.e7 != null);
        this.V0 = egVar2;
        egVar2.w0 = true;
        if (!this.Y5) {
            egVar2.updateColors();
        }
        this.V0.I(true, this.z3, this.A3, true);
        this.V0.setVisibility(8);
        this.V0.setShowing(false);
        if (this.e7 != null) {
            eg egVar3 = this.V0;
            egVar3.x0 = false;
            egVar3.setShouldDrawBackground(false);
            this.V0.W0 = true;
        }
        this.V0.setDelegate(new hg(this));
        this.V0.setDragListener(new bg.w0(this));
        eg egVar4 = this.V0;
        if (egVar4 != null) {
            egVar4.L(-this.G3, !this.A0, !this.b);
        }
        y();
        J();
    }

    public final boolean Z0() {
        return this.p4;
    }

    public final void Z1(int i7, int i10, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        int i11;
        ViewGroup viewGroup;
        int i12;
        float f10;
        if (i7 == 2) {
            return;
        }
        h2.f fVar = this.B4;
        ue ueVar = this.O4;
        Property property = View.TRANSLATION_Y;
        int i13 = 1;
        boolean z14 = false;
        if (i7 == 1) {
            if (i10 == 0) {
                if (this.E3 == null && this.V0 == null) {
                    return;
                } else {
                    Z();
                }
            }
            if (i10 == 0) {
                y();
                if (this.X0) {
                    this.V0.getVisibility();
                }
                this.V0.setVisibility(0);
                this.X0 = true;
                ag agVar = this.x2;
                if (agVar == null || agVar.getVisibility() == 8) {
                    i11 = 0;
                } else {
                    this.x2.setVisibility(8);
                    this.Y0 = false;
                    i11 = this.x2.getMeasuredHeight();
                }
                this.V0.setShowing(true);
                viewGroup = this.V0;
                this.e4 = 0;
            } else if (i10 == 1) {
                if (this.Y0) {
                    this.x2.getVisibility();
                }
                this.Y0 = true;
                eg egVar = this.V0;
                if (egVar == null || egVar.getVisibility() == 8) {
                    i12 = 0;
                } else {
                    this.d2.removeView(this.V0);
                    this.V0.setVisibility(8);
                    this.V0.setShowing(false);
                    this.X0 = false;
                    i12 = this.V0.getMeasuredHeight();
                }
                this.x2.setVisibility(0);
                ViewGroup viewGroup2 = this.x2;
                this.e4 = 1;
                org.telegram.messenger.mp.u1(this.R).h7.edit().remove("closed_botkeyboard_" + getTopicKeyString()).apply();
                i11 = i12;
                viewGroup = viewGroup2;
            } else {
                i11 = 0;
                viewGroup = null;
            }
            this.V2 = i10;
            if (this.n3 <= 0) {
                f10 = 200.0f;
                this.n3 = org.telegram.messenger.mp.f1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
            } else {
                f10 = 200.0f;
            }
            if (this.o3 <= 0) {
                this.o3 = org.telegram.messenger.mp.f1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(f10));
            }
            Point point = org.telegram.messenger.g0.q;
            int i14 = point.x > point.y ? this.o3 : this.n3;
            org.telegram.ui.bn bnVar = this.F3;
            if (bnVar != null && bnVar.getParentLayout() != null) {
                i14 -= ((ActionBarLayout) bnVar.getParentLayout()).w(false);
            }
            if (i10 == 1) {
                i14 = Math.min(this.x2.getKeyboardHeight(), i14);
            }
            ag agVar2 = this.x2;
            if (agVar2 != null) {
                agVar2.setPanelHeight(i14);
            }
            if (viewGroup != null && this.e7 == null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
                layoutParams.height = i14;
                viewGroup.setLayoutParams(layoutParams);
            }
            if (!org.telegram.messenger.g0.E) {
                org.telegram.messenger.g0.v1(this.F0);
            }
            cu0 cu0Var = this.c2;
            if (cu0Var != null) {
                this.q3 = i14;
                cu0Var.requestLayout();
                G1(true, true);
                k2(true);
                i1();
                if (this.Y2 && !this.p3 && i14 != i11 && z10) {
                    dd ddVar = new dd(this, 22);
                    if (this.w) {
                        this.x = ddVar;
                    } else {
                        AnimatorSet animatorSet = new AnimatorSet();
                        this.W0 = animatorSet;
                        if (this.e7 != null) {
                            animatorSet.playTogether(ValueAnimator.ofFloat(i14 - i11, 0.0f));
                        } else {
                            float f11 = i14 - i11;
                            viewGroup.setTranslationY(f11);
                            this.W0.playTogether(ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) property, f11, 0.0f));
                        }
                        this.W0.setInterpolator(org.telegram.ui.ActionBar.i1.w);
                        this.W0.setDuration(250L);
                        this.W0.addListener(new ah.l(24, this, ddVar));
                        org.telegram.messenger.g0.h3(ueVar, 50L);
                        fVar.d();
                    }
                    requestLayout();
                }
            }
            rh.e eVar = this.e7;
            if (eVar != null) {
                ((rh.h) eVar).h(i14);
            }
        } else {
            if (this.R0 != null) {
                G1(false, true);
            }
            this.V2 = -1;
            eg egVar2 = this.V0;
            if (egVar2 != null) {
                if (i7 == 2 && !org.telegram.messenger.g0.D && !org.telegram.messenger.g0.E) {
                    this.w4 = false;
                    mg mgVar = this.P3;
                    if (mgVar != null) {
                        mgVar.u(0.0f);
                    }
                    this.d2.removeView(this.V0);
                    this.V0 = null;
                } else if (!this.Y2 || this.p3 || this.p4) {
                    mg mgVar2 = this.P3;
                    if (mgVar2 != null) {
                        mgVar2.u(0.0f);
                    }
                    z14 = false;
                    this.q3 = 0;
                    this.d2.removeView(this.V0);
                    this.V0.setVisibility(8);
                    this.V0.setShowing(false);
                } else {
                    this.X0 = true;
                    this.e4 = 0;
                    egVar2.setShowing(false);
                    org.telegram.ui.ii iiVar = new org.telegram.ui.ii(this, i7, 9);
                    if (this.w) {
                        z12 = false;
                        this.x = iiVar;
                    } else {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.W0 = animatorSet2;
                        if (this.e7 != null) {
                            z12 = false;
                            animatorSet2.playTogether(ValueAnimator.ofFloat(this.V0.getMeasuredHeight()), ValueAnimator.ofFloat(0.0f, 1.0f));
                        } else {
                            z12 = false;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.V0, (Property<eg, Float>) property, r5.getMeasuredHeight()));
                        }
                        this.W0.setInterpolator(org.telegram.ui.ActionBar.i1.w);
                        this.W0.setDuration(250L);
                        fVar.d();
                        this.W0.addListener(new ah.l(25, this, iiVar));
                    }
                    org.telegram.messenger.g0.h3(ueVar, 50L);
                    requestLayout();
                    z14 = z12;
                }
                this.X0 = z14;
            }
            ag agVar3 = this.x2;
            if (agVar3 != null && agVar3.getVisibility() == 0) {
                if (i7 != 2 || org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                    if (this.Y2 && !this.p3) {
                        if (this.Y0) {
                            this.e4 = 1;
                        }
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        this.W0 = animatorSet3;
                        if (this.e7 != null) {
                            animatorSet3.playTogether(ValueAnimator.ofFloat(this.x2.getMeasuredHeight()));
                        } else {
                            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.x2, (Property<ag, Float>) property, r5.getMeasuredHeight()));
                        }
                        this.W0.setInterpolator(org.telegram.ui.ActionBar.i1.w);
                        this.W0.setDuration(250L);
                        this.W0.addListener(new ce(this, i7, i13));
                        fVar.d();
                        org.telegram.messenger.g0.h3(ueVar, 50L);
                        requestLayout();
                    } else if (!this.a4) {
                        this.x2.setVisibility(8);
                    }
                }
                this.Y0 = false;
            }
            if (i10 == 1 && this.c3 != null) {
                org.telegram.messenger.mp.u1(this.R).h7.edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.c3.e1()).apply();
            }
            k2(true);
            rh.e eVar2 = this.e7;
            if (eVar2 != null) {
                ((rh.h) eVar2).i(z11);
            }
        }
        if (this.n4 || this.o4) {
            P(true);
        }
        if (!this.p4 || i7 == 1) {
            z13 = false;
        } else {
            z13 = false;
            S1(false, false, false, true);
        }
        p2(z13);
        I();
    }

    @Override // org.telegram.ui.Components.xw0
    public final boolean a() {
        ai.l0 l0Var = this.j1;
        return l0Var != null && l0Var.n();
    }

    public final void a0() {
        if (this.T0 != null) {
            return;
        }
        je jeVar = new je(this, getContext(), 3);
        this.T0 = jeVar;
        jeVar.setScaleType(ImageView.ScaleType.CENTER);
        je jeVar2 = this.T0;
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(G0(org.telegram.ui.ActionBar.n6.Nl), false);
        this.v4 = animatedArrowDrawable;
        jeVar2.setImageDrawable(animatedArrowDrawable);
        this.T0.setVisibility(8);
        this.T0.setScaleX(0.1f);
        this.T0.setScaleY(0.1f);
        this.T0.setAlpha(0.0f);
        je jeVar3 = this.T0;
        int i7 = org.telegram.ui.ActionBar.n6.i6;
        org.telegram.ui.ActionBar.u6.Q(jeVar3, org.telegram.ui.ActionBar.n6.h0(G0(i7), 1, -1), null, org.telegram.ui.ActionBar.u6.M(i7), this.M4);
        this.q2.addView(this.T0, c8.na.e(44, 44, 85));
        this.T0.setOnClickListener(new id(this, 8));
        this.T0.setContentDescription(org.telegram.messenger.gd.N0(2131754883, "AccDescrExpandPanel"));
    }

    public final boolean a1() {
        View view = this.w2;
        return view != null && view.getVisibility() == 0;
    }

    public final void a2() {
        mg mgVar = this.P3;
        if ((mgVar == null || !mgVar.j()) && org.telegram.messenger.n5.z(this.G3)) {
            TLRPC.Chat O0 = org.telegram.messenger.mp.u1(this.S.a).O0(Long.valueOf(-this.G3));
            kc b02 = kc.b0(this.F3);
            StringBuilder sb2 = new StringBuilder();
            if (org.telegram.messenger.v3.p(O0)) {
                sb2.append(org.telegram.messenger.gd.N0(2131745411, null));
            }
            if (org.telegram.messenger.v3.u(O0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.gd.N0(2131745408, null));
            }
            if (org.telegram.messenger.v3.t(O0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.gd.N0(2131745409, null));
            }
            if (org.telegram.messenger.v3.o(O0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.gd.N0(2131745412, null));
            }
            if (org.telegram.messenger.v3.l(O0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.gd.N0(2131745413, null));
            }
            if (org.telegram.messenger.v3.v(O0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.gd.N0(2131745407, null));
            }
            if (org.telegram.messenger.v3.s(O0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.gd.N0(2131745410, null));
            }
            if (org.telegram.messenger.v3.m(O0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.gd.N0(2131745414, null));
            }
            b02.G(R.raw.passcode_lock_close, 3, org.telegram.messenger.gd.a0("SendPlainTextRestrictionHint", null, 2131745396, sb2.toString())).j();
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Vf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Tf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Sf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Pe));
    }

    @Override // org.telegram.ui.Components.gw0
    public final boolean b() {
        org.telegram.ui.bn bnVar = this.F3;
        return bnVar != null && bnVar.S6();
    }

    public final void b0() {
        if (this.F0 != null) {
            return;
        }
        Context context = getContext();
        org.telegram.ui.ActionBar.i6 i6Var = this.M4;
        hf hfVar = new hf(this, context, i6Var);
        this.F0 = hfVar;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 28) {
            hfVar.setFallbackLineSpacing(false);
        }
        if (i7 >= 35) {
            this.F0.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        this.F0.setDelegate(new qd(this));
        org.telegram.ui.bn bnVar = this.F3;
        if (bnVar == null || bnVar.getParentLayout() == null || !((ActionBarLayout) bnVar.getParentLayout()).b) {
            this.F0.setWindowView(this.E3.getWindow().getDecorView());
        } else {
            this.F0.setWindowView(bnVar.getParentLayout().getWindow().getDecorView());
        }
        TLRPC.EncryptedChat encryptedChat = bnVar != null ? bnVar.h : null;
        this.F0.setAllowTextEntitiesIntersection(g2());
        String string = Settings.Secure.getString(getContext().getContentResolver(), "default_input_method");
        int i10 = ((string == null || !string.startsWith("com.samsung")) && encryptedChat != null) ? 285212672 : TLObject.FLAG_28;
        this.F0.setIncludeFontPadding(false);
        this.F0.setImeOptions(i10);
        hf hfVar2 = this.F0;
        int inputType = hfVar2.getInputType() | 147456;
        this.a = inputType;
        hfVar2.setInputType(inputType);
        p2(false);
        this.F0.setSingleLine(false);
        this.F0.setMaxLines(6);
        this.F0.setTextSize(1, 18.0f);
        this.F0.setGravity(80);
        this.F0.setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(10.0f));
        this.F0.setBackgroundDrawable(null);
        org.telegram.ui.ActionBar.u6.U(this.F0, org.telegram.ui.ActionBar.n6.Le, i6Var);
        org.telegram.ui.ActionBar.u6.G(this.F0, org.telegram.ui.ActionBar.n6.Yc, i6Var);
        org.telegram.ui.ActionBar.u6.C(this.F0, org.telegram.ui.ActionBar.n6.lg, i6Var);
        hf hfVar3 = this.F0;
        int i11 = org.telegram.ui.ActionBar.n6.Me;
        org.telegram.ui.ActionBar.u6.A(hfVar3, i11, i6Var);
        org.telegram.ui.ActionBar.u6.D(this.F0, i11, i6Var);
        org.telegram.ui.ActionBar.u6.v(this.F0, org.telegram.ui.ActionBar.n6.Ne, i6Var);
        org.telegram.ui.ActionBar.u6.y(this.F0, org.telegram.ui.ActionBar.n6.mg, i6Var);
        hf hfVar4 = this.F0;
        boolean z10 = this.N4;
        FrameLayout.LayoutParams d = c8.na.d(-1, -2.0f, 80, 52.0f, 0.0f, z10 ? 50.0f : 2.0f, 1.5f);
        ee eeVar = this.o2;
        eeVar.addView(hfVar4, 1, d);
        org.telegram.messenger.ut utVar = new org.telegram.messenger.ut(this.R, getContext(), i6Var);
        this.s2 = utVar;
        utVar.setAllowActions(false);
        this.s2.setMaxHeight(org.telegram.messenger.g0.L(150.0f));
        this.s2.setMinHeight(org.telegram.messenger.g0.L(88.0f));
        this.s2.setVisibility(8);
        this.s2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(10.0f));
        this.s2.setOnClickListener(new id(this, 14));
        eeVar.addView(this.s2, 2, c8.na.d(-1, -2.0f, 80, 44.0f, 0.0f, (z10 ? 50 : 2) - 8, 1.5f));
        this.F0.setOnKeyListener(new jf(this));
        this.F0.setOnEditorActionListener(new m.r2(this, 3));
        this.F0.addTextChangedListener(new kf(this));
        this.F0.addTextChangedListener(new org.telegram.ui.Cells.k3());
        this.F0.setEnabled(this.i6);
        ArrayList arrayList = this.h6;
        if (arrayList != null) {
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                this.F0.addTextChangedListener((TextWatcher) obj);
            }
            this.h6.clear();
        }
        p2(false);
        z2(bnVar != null && bnVar.getFragmentBeginToShow());
        if (bnVar != null) {
            bnVar.N6(false, false);
        }
        q2(this.M6);
    }

    public final float b1(FrameLayout frameLayout) {
        float measuredHeight = getMeasuredHeight() - this.g7.f;
        float f10 = 0.0f;
        View view = frameLayout;
        while (view != null && view != this) {
            f10 += view.getTranslationY() + view.getTop();
            view = view.getParent() instanceof View ? (View) view.getParent() : null;
        }
        return view == null ? frameLayout.getHeight() - org.telegram.messenger.g0.L(44.0f) : measuredHeight - f10;
    }

    public final void b2(boolean z10) {
        boolean z11;
        org.telegram.ui.bn bnVar;
        ai.l0 l0Var = this.j1;
        int i7 = 1;
        boolean z12 = l0Var != null && l0Var.l();
        if (z12 || (!(this.t2 || z10) || (bnVar = this.F3) == null || bnVar.y() || this.P2 != null)) {
            z11 = false;
        } else {
            org.telegram.messenger.mp.u1(this.R);
            boolean z13 = org.telegram.messenger.s2.a;
            z11 = true;
        }
        if (this.l6 == z11) {
            return;
        }
        this.l6 = z11;
        ImageView imageView = this.k2;
        imageView.setVisibility(0);
        imageView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : z12 ? 0.85f : 0.6f).scaleY(z11 ? 1.0f : z12 ? 0.85f : 0.6f).setInterpolator(kr.h).setDuration((z12 || this.m6) ? 150L : 420L).withEndAction(new od(this, z11, i7)).start();
    }

    @Override // org.telegram.ui.Components.gw0
    public final boolean c() {
        org.telegram.ui.bn bnVar = this.F3;
        return bnVar != null && bnVar.c();
    }

    public final void c0() {
        if (this.f1 != null) {
            return;
        }
        ee eeVar = new ee(this, getContext(), 3);
        this.f1 = eeVar;
        eeVar.setVisibility(this.R3 == null ? 8 : 0);
        this.f1.setFocusable(true);
        this.f1.setFocusableInTouchMode(true);
        this.f1.setClickable(true);
        this.o2.addView(this.f1, c8.na.e(-1, 44, 80));
        qh0 qh0Var = new qh0(getContext());
        this.h1 = qh0Var;
        qh0Var.setScaleType(ImageView.ScaleType.CENTER);
        this.h1.f(R.raw.chat_audio_record_delete_2, 28, 28, null);
        this.h1.getAnimatedDrawable().p0 = true;
        this.B5 = this.h1.getAnimatedDrawable();
        v2();
        this.h1.setContentDescription(org.telegram.messenger.gd.N0(2131751586, "Delete"));
        qh0 qh0Var2 = this.h1;
        int i7 = org.telegram.ui.ActionBar.n6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(G0(i7), 1, -1);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        org.telegram.ui.ActionBar.i6 i6Var = this.M4;
        org.telegram.ui.ActionBar.u6.Q(qh0Var2, h02, null, M, i6Var);
        this.f1.addView(this.h1, c8.na.c(44.0f, 44));
        this.h1.setOnClickListener(new id(this, 10));
        x61 x61Var = new x61(getContext());
        this.g1 = x61Var;
        x61Var.setVisibility(4);
        x61 x61Var2 = this.g1;
        x61Var2.T = !this.Y5;
        x61Var2.setRoundFrames(true);
        this.g1.setDelegate(new we(this));
        this.f1.addView(this.g1, c8.na.d(-1, -1.0f, 19, 56.0f, 0.0f, 8.0f, 0.0f));
        Context context = getContext();
        v61 v61Var = new v61(context);
        TextPaint textPaint = new TextPaint(1);
        v61Var.d = textPaint;
        v61Var.e = -1L;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        v61Var.b = context.getDrawable(R.drawable.tooltip_arrow);
        v61Var.a = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(5.0f), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.hg, false));
        v61Var.b();
        v61Var.setTime(0);
        this.g1.setTimeHintView(v61Var);
        this.c2.addView(v61Var, c8.na.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 52.0f));
        zi0 zi0Var = new zi0(getContext(), i6Var);
        this.i1 = zi0Var;
        this.f1.addView(zi0Var, c8.na.d(-1, 32.0f, 19, 44.0f, 0.0f, 4.0f, 0.0f));
        q2(this.M6);
    }

    public final boolean c2() {
        ImageView imageView;
        if (this.O != null || (imageView = this.m2) == null || imageView.getVisibility() != 0 || org.telegram.messenger.mp.g1().getInt("channelsuggesthint2", 0) >= 2) {
            return false;
        }
        hi.u3 u3Var = new hi.u3(getContext(), 3);
        this.O = u3Var;
        u3Var.s(13.0f);
        setHintGlass(this.O);
        this.O.r(true);
        this.O.v(org.telegram.messenger.gd.a0(null, null, 2131744177, qg.c.i(this.R, this.G3)));
        this.O.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        this.O.p(1.0f, -((getWidth() - org.telegram.messenger.g0.L(12.0f)) - ((this.m2.getMeasuredWidth() / 2.0f) + (this.m2.getX() + (this.f2.getX() + this.o2.getX())))));
        addView(this.O, c8.na.d(-1, 200.0f, 48, 0.0f, -192.0f, 0.0f, 0.0f));
        hi.u3 u3Var2 = this.O;
        u3Var2.r0 = new dd(this, 24);
        u3Var2.d = 8000L;
        u3Var2.x();
        org.telegram.messenger.mp.g1().edit().putInt("channelsuggesthint2", org.telegram.messenger.mp.g1().getInt("channelsuggesthint2", 0) + 1).apply();
        return true;
    }

    @Override // org.telegram.ui.Components.gw0
    public final void d(TLRPC.Document document, String str, Object obj, org.telegram.messenger.bj bjVar, boolean z10, boolean z11, int i7, int i10) {
        if (this.p7) {
            return;
        }
        org.telegram.ui.rm rmVar = this.L3;
        org.telegram.ui.bn bnVar = this.F3;
        if (rmVar != null && bnVar != null && rmVar.f) {
            bnVar.yc();
            return;
        }
        if (!c() || i7 != 0) {
            b5.X(this.R, 1, this.G3, new zd(this, document, str, bjVar, z11, i7, i10, obj, z10));
            return;
        }
        b5.J(this.E3, bnVar.a(), new yd(this, document, str, obj, bjVar, z10), this.M4);
    }

    public final ValueAnimator d0() {
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
        if (this.b2 == null || this.D2 == null || this.D1 || !org.telegram.messenger.pc.e(360928) || !this.D2.isShown()) {
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
        float measuredHeight = ((this.b2.getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(3.0f)) + (r5[1] - r6[1]);
        RecordCircle recordCircle2 = this.D2;
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
            this.D2.draw(canvas);
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
            int G0 = G0(org.telegram.ui.ActionBar.n6.Uf) | (-16777216);
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
                iArr3[i22] = i0.a.f(f22, G0, i17);
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
                        iArr5[i25] = I2(i27);
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
            if (this.F5 == null) {
                this.F5 = new xu0(2400);
            }
            this.F5.a();
            this.F5.e(false);
            xu0 xu0Var = this.F5;
            xu0Var.t = iArr3;
            xu0Var.s = true;
            xu0Var.u = org.telegram.ui.ActionBar.n6.I.q() ? 0.12f : 0.0f;
            xu0 xu0Var2 = this.F5;
            xu0Var2.S = 0.0f;
            xu0Var2.R = 0.0f;
            float f23 = i19;
            float min = Math.min(1.0f, 1400.0f / f23);
            float f24 = org.telegram.messenger.g0.p;
            this.J5 = f20;
            this.K5 = i18 + f20;
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
                        if (H2(i41 + 3) <= (((i40 * 0.7f) / 255.0f) + f25) * f26) {
                            float H2 = H2(i41 + 11);
                            float H22 = H2(i41 + 12);
                            float H23 = H2(i41 + 14);
                            float f27 = i37 + f20;
                            float f28 = H2 - 0.5f;
                            i14 = i37;
                            float f29 = max2;
                            float f30 = (f28 * f29) + f27;
                            f14 = f18;
                            float f31 = i33 + f21;
                            i15 = i33;
                            float f32 = H22 - 0.5f;
                            float f33 = (f32 * f29) + f31;
                            f15 = f19;
                            float f34 = this.J5;
                            f16 = f21;
                            f17 = f20;
                            float i42 = Utilities.i((f30 - f34) / (this.K5 - f34), 1.0f, 0.0f);
                            float f35 = (0.03f * H23) + (i42 * 0.2f) + 0.04f;
                            float x10 = com.google.android.gms.internal.vision.e2.x(f32, 3.0f, f24, width);
                            float x11 = com.google.android.gms.internal.vision.e2.x(f28, 2.0f, f24, measuredHeight);
                            float B = com.google.android.gms.internal.vision.e2.B(i42, 0.16f, 0.92f, (H2(i41 + 15) * 0.16f) + 0.5f);
                            float g10 = org.telegram.ui.Cells.c0.g(H2, 0.25f, f25, width - f30, f30);
                            float min2 = Math.min(f33, measuredHeight) - (((H23 * 22.0f) + 8.0f) * f24);
                            xu0 xu0Var3 = this.F5;
                            int I2 = I2(i38);
                            int i43 = 0;
                            while (true) {
                                if (i43 >= 7) {
                                    i16 = 7;
                                    break;
                                }
                                if (I2 <= iArr[i43]) {
                                    i16 = i43;
                                    break;
                                }
                                i43++;
                            }
                            xu0Var3.j(f30, f33, g10, min2, x10, x11, B, f35, i16);
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
            float f36 = f21;
            float f37 = f18;
            float f38 = f19;
            float f39 = f20;
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
                        if (H2(i50 + 5) <= (((i49 * 0.7f) / 255.0f) + 0.3f) * min3) {
                            float H24 = H2(i50 + 6);
                            float H25 = H2(i50 + 7);
                            float H26 = H2(i50 + 8);
                            i7 = i18;
                            float f40 = H24 - 0.5f;
                            int i51 = i32;
                            float f41 = max2;
                            i10 = max2;
                            float f42 = (f40 * f41) + f39 + i46;
                            float f43 = H25 - 0.5f;
                            f11 = min3;
                            float f44 = (f41 * f43) + f36 + i44;
                            float f45 = f42 - f37;
                            float f46 = f44 - f38;
                            i11 = i44;
                            i12 = i46;
                            float sqrt = (float) Math.sqrt((f46 * f46) + (f45 * f45));
                            if (sqrt < org.telegram.messenger.g0.L(1.0f)) {
                                double d = H26 * 3.141592653589793d * 2.0d;
                                f13 = (float) Math.cos(d);
                                f12 = (float) Math.sin(d);
                            } else {
                                f12 = f46 / sqrt;
                                f13 = f45 / sqrt;
                            }
                            float H27 = ((H2(i50 + 9) * 13.0f) + 7.0f) * f24;
                            float f47 = H26 * 0.05f;
                            float x12 = com.google.android.gms.internal.vision.e2.x(f43, 3.0f, f24, width);
                            float x13 = com.google.android.gms.internal.vision.e2.x(f40, 2.0f, f24, measuredHeight);
                            float H28 = (H2(i50 + 10) * 0.2f) + 0.56f;
                            float g11 = org.telegram.ui.Cells.c0.g(H24, 0.25f, 0.3f, width - f42, f42);
                            float min4 = Math.min(f44, measuredHeight) - (((H25 * 22.0f) + 8.0f) * f24);
                            xu0 xu0Var4 = this.F5;
                            int I22 = I2(i48);
                            int i52 = 0;
                            while (true) {
                                if (i52 >= 7) {
                                    i13 = 7;
                                    break;
                                }
                                if (I22 <= iArr[i52]) {
                                    i13 = i52;
                                    break;
                                }
                                i52++;
                            }
                            xu0Var4.j(f42, f44, g11, min4, x12, x13, H28, f47, i13);
                            xu0 xu0Var5 = this.F5;
                            int i53 = xu0Var5.C;
                            int i54 = ((i53 + r3) - 1) % xu0Var5.b;
                            xu0Var5.w[i54] = f13 * H27;
                            xu0Var5.x[i54] = f12 * H27;
                            i32 = i51 + 1;
                            fArr2[i51] = (H28 * 0.95f) + f47;
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
            float f48 = i32;
            this.M5 = fArr2[Math.min(i56, (int) (0.72f * f48))] * 1000.0f;
            float f49 = fArr2[Math.min(i56, (int) (f48 * 0.95f))] * 1000.0f;
            this.N5 = f49;
            float f50 = this.M5;
            this.O5 = (Math.max(60.0f, f49 - f50) * 0.7f) + f50;
            this.G5 = createBitmap;
            this.H5 = f39;
            this.I5 = f36;
            this.L5 = 0.0f;
            this.P5 = true;
            RecordCircle recordCircle3 = this.D2;
            recordCircle3.P = true;
            recordCircle3.invalidate();
            sg sgVar = this.b2;
            sgVar.getClass();
            long uptimeMillis = SystemClock.uptimeMillis();
            if (sgVar.c || sgVar.e) {
                f10 = 1.0f;
            } else if (sgVar.f) {
                f10 = sgVar.a;
            } else {
                long j3 = sgVar.H;
                if (j3 < 0) {
                    j3 = uptimeMillis;
                }
                f10 = sg.b(uptimeMillis - j3);
            }
            sgVar.s = org.telegram.messenger.g0.T1(0.85f, 1.0f, f10) * org.telegram.messenger.g0.L(5.0f);
            sgVar.n = true;
            if (sgVar.G) {
                uptimeMillis -= 240;
            }
            sgVar.r = uptimeMillis;
            sgVar.y = 0.0f;
            sgVar.x = 0.0f;
            sgVar.w = 0.0f;
            sgVar.c = false;
            sgVar.d.stop();
            sgVar.i().T(true, 0.0f);
            sgVar.invalidate();
            this.n = 0.0f;
            this.h = 0.55f;
            o2();
            float f51 = this.N5 + 260.0f + 16.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, f51);
            ofFloat.setDuration((long) f51);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.addUpdateListener(new wd(this, this.b2, org.telegram.messenger.g0.L(3.0f) + org.telegram.messenger.g0.L(12.0f), this.D2));
            ofFloat.addListener(new ve(this));
            return ofFloat;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void d1() {
        o(false);
        ji.n nVar = this.r1;
        if (nVar != null) {
            nVar.h("destroy", true);
            ji.q qVar = nVar.h;
            if (qVar != null) {
                org.telegram.messenger.g0.E2(qVar);
                nVar.h = null;
            }
            ji.e eVar = nVar.K;
            if (eVar != null) {
                org.telegram.messenger.g0.E2(eVar);
                nVar.K = null;
            }
            this.r1 = null;
        }
        if (this.m1) {
            this.m1 = false;
            DictationAsr.U(this.q1);
        }
        ai.l0 l0Var = this.j1;
        if (l0Var != null) {
            DictationAsr.U(l0Var.m0);
            l0Var.j();
            ai.b2 b2Var = l0Var.F;
            if (b2Var != null) {
                b2Var.a();
            }
            jh.f fVar = l0Var.a0;
            if (fVar != null) {
                fVar.f = null;
            }
            org.telegram.messenger.g0.E2(l0Var.s);
            org.telegram.messenger.g0.E2(l0Var.w);
            this.j1 = null;
        }
        zi0 zi0Var = this.i1;
        if (zi0Var != null) {
            zi0Var.T = true;
            h61 h61Var = zi0Var.n;
            if (h61Var != null) {
                h61Var.u0(false);
                zi0Var.n.m0();
                zi0Var.n = null;
            }
        }
        if (this.i1 != null && this.R3 != null) {
            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(this.R);
            long j3 = this.G3;
            org.telegram.ui.bn bnVar = this.F3;
            long b10 = (bnVar == null || !bnVar.x4) ? 0L : bnVar.b();
            zi0 zi0Var2 = this.i1;
            float audioLeft = zi0Var2 == null ? 0.0f : zi0Var2.getAudioLeft();
            zi0 zi0Var3 = this.i1;
            d02.g2(j3, b10, audioLeft, zi0Var3 == null ? 1.0f : zi0Var3.getAudioRight());
        }
        this.O2 = true;
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.l2);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.o2);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.p2);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.m2);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.X5);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.n2);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.k2);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.t);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.s2);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.u2);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.e2);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.z0);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.L);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.n1);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.t2);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.T2);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.a3);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.i5);
        org.telegram.messenger.ks.f(this.R).n(this, org.telegram.messenger.ks.S3);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.l4);
        eg egVar = this.V0;
        if (egVar != null) {
            egVar.B();
        }
        dd ddVar = this.I0;
        if (ddVar != null) {
            org.telegram.messenger.g0.r(ddVar);
            this.I0 = null;
        }
        PowerManager.WakeLock wakeLock = this.g3;
        if (wakeLock != null) {
            try {
                wakeLock.release();
                this.g3 = null;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        if (this.m3 != 0 && !this.d1) {
            org.telegram.messenger.g0.g3(new ng(this.E3, 19));
        }
        cu0 cu0Var = this.c2;
        if (cu0Var != null) {
            cu0Var.setDelegate(null);
        }
        ye yeVar = this.r0;
        if (yeVar != null) {
            yeVar.e = false;
            yeVar.dismiss();
        }
    }

    public final void d2() {
        e2(true, false);
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        se seVar;
        TLRPC.ChatFull chatFull;
        TLRPC.Chat O0;
        double d;
        byte[] bArr;
        je jeVar;
        if (i7 == org.telegram.messenger.ks.X5) {
            if (i10 != this.R || objArr.length <= 0) {
                return;
            }
            long longValue = ((Long) objArr[0]).longValue();
            org.telegram.ui.bn bnVar = this.F3;
            if (longValue == (bnVar != null ? bnVar.a() : this.G3)) {
                h2();
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ks.l4) {
            eg egVar = this.V0;
            if (egVar != null) {
                egVar.Q.g1();
            }
            ag agVar = this.x2;
            if (agVar != null) {
                ArrayList arrayList = agVar.n;
                while (r4 < arrayList.size()) {
                    ((ki.j0) arrayList.get(r4)).invalidate();
                    r4++;
                }
            }
            hf hfVar = this.F0;
            if (hfVar != null) {
                hfVar.postInvalidate();
                this.F0.q();
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ks.k2) {
            if (((Integer) objArr[0]).intValue() != this.w3) {
                return;
            }
            if (this.m3 != 0 && !this.c4 && !c()) {
                this.c4 = true;
                org.telegram.messenger.mp.u1(this.S.a).N4(this.d1 ? 7 : 1, 0, this.G3, getThreadMessageId(), null);
            }
            RecordCircle recordCircle = this.D2;
            if (recordCircle != null) {
                recordCircle.setAmplitude(((Double) objArr[1]).doubleValue());
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ks.t) {
            hf hfVar2 = this.F0;
            if (hfVar2 == null || !hfVar2.isFocused()) {
                return;
            }
            org.telegram.messenger.g0.v1(this.F0);
            return;
        }
        int i11 = org.telegram.messenger.ks.m2;
        int i12 = org.telegram.messenger.ks.n2;
        int i13 = 5;
        if (i7 == i11 || i7 == i12) {
            if (((Integer) objArr[0]).intValue() == this.w3 && this.v3) {
                this.v3 = false;
                if (i7 != i12) {
                    u2(2, true);
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
                    u2(i13, true);
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ks.l2) {
            if (((Integer) objArr[0]).intValue() != this.w3) {
                return;
            }
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            this.d1 = !booleanValue;
            qe qeVar = this.c1;
            if (qeVar != null) {
                qeVar.j(booleanValue ? xg.a : xg.b, true);
            }
            if (this.v3) {
                RecordCircle recordCircle2 = this.D2;
                if (recordCircle2 != null) {
                    recordCircle2.J = true;
                }
            } else {
                this.v3 = true;
                u2(0, true);
            }
            vg vgVar = this.Z0;
            if (vgVar != null) {
                vgVar.a(this.Y1);
            }
            sg sgVar = this.b2;
            if (sgVar != null) {
                sgVar.e = false;
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ks.o2) {
            this.v3 = false;
            this.R3 = null;
            this.U3 = null;
            return;
        }
        if (i7 == org.telegram.messenger.ks.p2) {
            this.R3 = null;
            this.U3 = null;
            vg vgVar2 = this.Z0;
            if (vgVar2 != null) {
                vgVar2.a(this.Y1);
            }
            P(true);
            this.v3 = true;
            u2(0, true);
            return;
        }
        if (i7 != org.telegram.messenger.ks.s2) {
            if (i7 == org.telegram.messenger.ks.u2) {
                Activity activity = this.E3;
                if (activity != null) {
                    activity.setVolumeControlStream(((Boolean) objArr[0]).booleanValue() ? 0 : TLObject.FLAG_31);
                    return;
                }
                return;
            }
            if (i7 == org.telegram.messenger.ks.e2) {
                if (this.T3 == null || !MediaController.B().I(this.T3)) {
                    return;
                }
                org.telegram.messenger.fj fjVar = MediaController.B().v0;
                org.telegram.messenger.fj fjVar2 = this.T3;
                fjVar2.b0 = fjVar.b0;
                fjVar2.i0 = fjVar.i0;
                return;
            }
            if (i7 == org.telegram.messenger.ks.z0) {
                ge geVar = this.R0;
                if (geVar != null) {
                    geVar.invalidate();
                    return;
                }
                return;
            }
            if (i7 == org.telegram.messenger.ks.L) {
                if (((Boolean) objArr[6]).booleanValue()) {
                    return;
                }
                long longValue2 = ((Long) objArr[3]).longValue();
                Integer num2 = (Integer) objArr[1];
                if (longValue2 != this.G3 || (chatFull = this.T2) == null || chatFull.slowmode_seconds == 0 || org.telegram.messenger.fj.f3(num2.intValue()) || (O0 = org.telegram.messenger.mp.u1(this.S.a).O0(Long.valueOf(this.T2.id))) == null || org.telegram.messenger.v3.N(O0) || org.telegram.messenger.v3.h0(O0)) {
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
            if (i7 == org.telegram.messenger.ks.n1) {
                if (this.T2 != null) {
                    C2();
                    return;
                }
                return;
            }
            if (i7 == org.telegram.messenger.ks.t2) {
                this.R3 = null;
                this.U3 = null;
                u2(4, true);
                return;
            }
            if (i7 != org.telegram.messenger.ks.T2) {
                if (i7 == org.telegram.messenger.ks.a3) {
                    r2(true);
                    return;
                }
                if (i7 != org.telegram.messenger.ks.i5) {
                    if (i7 == org.telegram.messenger.ks.S3) {
                        m0();
                        return;
                    }
                    return;
                } else {
                    if (this.t2 && (seVar = this.K0) != null) {
                        seVar.setLocked(!org.telegram.messenger.i10.i(this.R).q());
                    }
                    m0();
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
                    this.q7 = 3;
                } else if (this.f3) {
                    this.q7 = 2;
                } else {
                    this.q7 = 1;
                }
                k2(false);
                return;
            }
            return;
        }
        if (((Integer) objArr[0]).intValue() != this.w3) {
            return;
        }
        this.Y1 = 0L;
        Object obj = objArr[1];
        if (obj instanceof org.telegram.messenger.d20) {
            org.telegram.messenger.d20 d20Var = (org.telegram.messenger.d20) obj;
            this.U3 = d20Var;
            String str = (String) objArr[2];
            this.S3 = str;
            ArrayList<Bitmap> arrayList2 = (ArrayList) objArr[3];
            this.Y1 = d20Var.r;
            x61 x61Var = this.g1;
            if (x61Var != null) {
                x61Var.setVideoPath(str);
                this.g1.setKeyframes(arrayList2);
                this.g1.setVisibility(0);
                this.g1.setMinProgressDiff(1000.0f / this.U3.r);
                X0();
            }
            u2(3, true);
            P(false);
            return;
        }
        this.R3 = (TLRPC.TL_document) obj;
        this.S3 = (String) objArr[2];
        boolean z10 = objArr.length >= 4 && ((Boolean) objArr[3]).booleanValue();
        float floatValue = objArr.length >= 5 ? ((Float) objArr[4]).floatValue() : 0.0f;
        float floatValue2 = objArr.length >= 6 ? ((Float) objArr[5]).floatValue() : 1.0f;
        if (this.R3 == null) {
            mg mgVar = this.P3;
            if (mgVar != null) {
                mgVar.G(null, true, 0, 0, 0L);
                return;
            }
            return;
        }
        c0();
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
        long e10 = org.telegram.messenger.i10.i(this.R).e();
        tL_peerUser.user_id = e10;
        peer.user_id = e10;
        tL_message.date = (int) (System.currentTimeMillis() / 1000);
        tL_message.message = "";
        tL_message.attachPath = this.S3;
        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
        tL_message.media = tL_messageMediaDocument;
        tL_messageMediaDocument.flags |= 3;
        tL_messageMediaDocument.document = this.R3;
        tL_message.flags |= 768;
        this.T3 = new org.telegram.messenger.fj(org.telegram.messenger.i10.t0, tL_message, false, true);
        this.f1.setAlpha(1.0f);
        this.f1.setVisibility(0);
        this.h1.setVisibility(0);
        this.h1.setAlpha(0.0f);
        this.h1.setScaleY(0.0f);
        this.h1.setScaleX(0.0f);
        int i14 = 0;
        while (true) {
            if (i14 >= this.R3.attributes.size()) {
                d = 0.0d;
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = this.R3.attributes.get(i14);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                d = documentAttribute.duration;
                break;
            }
            i14++;
        }
        int i15 = 0;
        while (true) {
            if (i15 >= this.R3.attributes.size()) {
                bArr = null;
                break;
            }
            TLRPC.DocumentAttribute documentAttribute2 = this.R3.attributes.get(i15);
            if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                byte[] bArr2 = documentAttribute2.waveform;
                if (bArr2 == null || bArr2.length == 0) {
                    documentAttribute2.waveform = MediaController.getWaveform(this.S3);
                }
                bArr = documentAttribute2.waveform;
            } else {
                i15++;
            }
        }
        if (z10 && (jeVar = this.h2) != null) {
            this.l2 = 0.0f;
            jeVar.setAlpha(0.0f);
            jeVar.setScaleX(0.0f);
            jeVar.setScaleY(0.0f);
        }
        this.Y1 = (long) (1000.0d * d);
        zi0 zi0Var = this.i1;
        String str2 = this.S3;
        if (!zi0Var.T) {
            zi0Var.r = (float) d;
            zi0Var.s = floatValue;
            zi0Var.w = floatValue2;
            zi0Var.x = false;
            zi0Var.h.t(org.telegram.messenger.g0.g0((int) Math.round(Math.max(1.0d, d)), false, false), false, true);
            zi0Var.f.a(false, false);
            if (zi0Var.n == null) {
                h61 h61Var = new h61();
                zi0Var.n = h61Var;
                h61Var.K = new nd0(zi0Var, 1);
            }
            zi0Var.n.j0(Uri.fromFile(new File(str2)), "other");
            zi0Var.i(false);
            zi0Var.L = 0;
            zi0Var.M = bArr;
            Bitmap bitmap = zi0Var.T0;
            if (bitmap != null) {
                bitmap.recycle();
                zi0Var.T0 = null;
            }
            zi0Var.W0 = null;
            zi0Var.X0 = false;
            zi0Var.Q0 = -1;
            zi0Var.J0.a();
            zi0Var.I0.a();
            zi0Var.invalidate();
        }
        P(false);
        if (z10) {
            e0();
            f0();
            c0();
            this.m3 = 1;
            this.D2.f(false);
            this.l4.set(this.D2, Float.valueOf(1.0f));
            qg qgVar = this.E2;
            if (qgVar != null) {
                qgVar.setVisibility(0);
                this.E2.setAlpha(1.0f);
            }
        }
        u2(3, !z10);
        if (!z10 || !org.telegram.messenger.mp.g1().getBoolean("design_voice_live_field", true) || this.O2 || this.R3 == null) {
            return;
        }
        B0().q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        zi0 zi0Var;
        eg egVar = this.V0;
        if (egVar != null && egVar.getVisibility() == 0 && this.V0.getStickersExpandOffset() != 0.0f) {
            canvas.save();
            canvas.clipRect(0, org.telegram.messenger.g0.L(2.0f), getMeasuredWidth(), getMeasuredHeight());
            canvas.translate(0.0f, -this.V0.getStickersExpandOffset());
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        super.dispatchDraw(canvas);
        if (!this.K1 || (zi0Var = this.i1) == null || zi0Var.getTrimProgress() <= 0.0f) {
            return;
        }
        int[] iArr = this.u5;
        getLocationInWindow(iArr);
        float f10 = iArr[0];
        float f11 = iArr[1];
        x0(this, canvas, f10, f11, f11, 100000.0f);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        View view2 = this.w2;
        ee eeVar = this.p2;
        boolean z10 = view == view2 || view == eeVar;
        if (z10) {
            float measuredHeight = getMeasuredHeight() - this.g7.f;
            canvas.save();
            if (view == eeVar) {
                canvas.clipRect(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
            }
            if (view == this.w2) {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
            }
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (z10) {
            canvas.restore();
        }
        return drawChild;
    }

    @Override // org.telegram.ui.Components.xw0
    public final void e(TextWatcher textWatcher) {
        hf hfVar = this.F0;
        if (hfVar != null) {
            hfVar.addTextChangedListener(textWatcher);
            return;
        }
        if (this.h6 == null) {
            this.h6 = new ArrayList();
        }
        this.h6.add(textWatcher);
    }

    public final void e0() {
        qg qgVar = this.E2;
        cu0 cu0Var = this.c2;
        if (qgVar == null) {
            qg qgVar2 = new qg(this, getContext());
            this.E2 = qgVar2;
            qgVar2.setVisibility(8);
            cu0Var.addView(this.E2, c8.na.e(-1, -2, 80));
        }
        if (this.D2 != null) {
            return;
        }
        RecordCircle recordCircle = new RecordCircle(getContext());
        this.D2 = recordCircle;
        recordCircle.setVisibility(8);
        cu0Var.addView(this.D2, c8.na.e(-1, -2, 80));
    }

    public final void e2(boolean z10, boolean z11) {
        if (this.w2 == null || this.V3 || getVisibility() != 0) {
            ee eeVar = this.f1;
            if ((eeVar == null || eeVar.getVisibility() != 0) && !this.x3 && this.L3 == null && this.J3 == null) {
                j1();
                return;
            }
            return;
        }
        ee eeVar2 = this.f1;
        boolean z12 = (eeVar2 == null || eeVar2.getVisibility() != 0) && !this.x3 && this.L3 == null && (this.d3 == null || this.P2 != null);
        if (!z11 && z10 && z12 && !this.p3 && !T0()) {
            j1();
            td tdVar = this.W;
            if (tdVar != null) {
                org.telegram.messenger.g0.r(tdVar);
            }
            td tdVar2 = new td(this, 9);
            this.W = tdVar2;
            org.telegram.messenger.g0.h3(tdVar2, 200L);
            return;
        }
        this.W3 = true;
        this.V3 = true;
        if (this.X3) {
            this.h7.a(true, z10);
            if (z12) {
                hf hfVar = this.F0;
                if (hfVar != null) {
                    hfVar.requestFocus();
                }
                j1();
            }
        }
    }

    public final void f0() {
        if (this.e1 != null || getContext() == null) {
            return;
        }
        bi.v2 v2Var = new bi.v2(getContext(), 15);
        this.e1 = v2Var;
        v2Var.setClipChildren(false);
        this.e1.setVisibility(8);
        this.o2.addView(this.e1, c8.na.c(44.0f, -1));
        this.e1.setOnTouchListener(new gi.a(12));
        bi.v2 v2Var2 = this.e1;
        SlideTextView slideTextView = new SlideTextView(getContext());
        this.a2 = slideTextView;
        v2Var2.addView(slideTextView, c8.na.d(-1, -1.0f, 0, 45.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(0);
        this.d.setPadding(org.telegram.messenger.g0.L(13.0f), 0, 0, 0);
        this.d.setFocusable(false);
        LinearLayout linearLayout2 = this.d;
        sg sgVar = new sg(this, getContext());
        this.b2 = sgVar;
        linearLayout2.addView(sgVar, c8.na.t(28, 28, 16, 0, 0, 0, 0));
        this.b2.f(i0());
        this.b2.setOnClickListener(new id(this, 9));
        LinearLayout linearLayout3 = this.d;
        vg vgVar = new vg(this, getContext());
        this.Z0 = vgVar;
        linearLayout3.addView(vgVar, c8.na.t(-1, -1, 16, 6, 0, 0, 0));
        this.e1.addView(this.d, c8.na.e(-1, -1, 16));
    }

    public final void f1() {
        this.Z2 = true;
        ji.n nVar = this.r1;
        if (nVar != null) {
            nVar.h("chat paused", true);
        }
        if (i0() && this.v3) {
            l0();
        }
        ye yeVar = this.r0;
        if (yeVar != null) {
            yeVar.e = false;
            yeVar.dismiss();
        }
        if (this.p3) {
            this.b3 = true;
        }
        dd ddVar = new dd(this, 19);
        this.K6 = ddVar;
        org.telegram.messenger.g0.h3(ddVar, 500L);
    }

    public final void f2() {
        AnimatorSet animatorSet = new AnimatorSet();
        try {
            performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "lockAnimatedTranslation", this.a5);
        ofFloat.setStartDelay(100L);
        ofFloat.setDuration(350L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "snapAnimationProgress", 1.0f);
        ofFloat2.setInterpolator(kr.h);
        ofFloat2.setDuration(250L);
        int i7 = org.telegram.messenger.bz.a;
        SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
        edit.putInt("lockRecordAudioVideoHint", 3);
        edit.apply();
        animatorSet.playTogether(ofFloat2, ofFloat, ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f).setDuration(200L), ObjectAnimator.ofFloat(this.a2, "cancelToProgress", 1.0f));
        animatorSet.start();
        G2();
    }

    public final void g0() {
        if (this.z2 != null || this.F3 == null) {
            return;
        }
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.input_calendar1).mutate();
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.input_calendar2).mutate();
        int i7 = org.telegram.ui.ActionBar.n6.Nl;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.i6 i6Var = this.M4;
        org.telegram.ui.ActionBar.u6.x(this, mutate, i7, i6Var, mode);
        org.telegram.ui.ActionBar.u6.x(this, mutate2, org.telegram.ui.ActionBar.n6.ag, i6Var, mode);
        lq lqVar = new lq(mutate, mutate2);
        te teVar = new te(this, getContext());
        this.z2 = teVar;
        teVar.setImageDrawable(lqVar);
        this.z2.setVisibility(8);
        this.z2.setContentDescription(org.telegram.messenger.gd.N0(2131745652, null));
        this.z2.setScaleType(ImageView.ScaleType.CENTER);
        te teVar2 = this.z2;
        int i10 = org.telegram.ui.ActionBar.n6.i6;
        org.telegram.ui.ActionBar.u6.Q(teVar2, org.telegram.ui.ActionBar.n6.h0(G0(i10), 1, -1), null, org.telegram.ui.ActionBar.u6.M(i10), i6Var);
        this.o2.addView(this.z2, 2, c8.na.e(44, 44, 85));
        this.z2.setOnClickListener(new id(this, 6));
        this.z2.setTranslationX(0.0f);
    }

    public final void g1() {
        hf hfVar;
        this.Z2 = false;
        if (org.telegram.messenger.mp.g1().getBoolean("design_voice_live_field", true)) {
            long[] jArr = {150, 500, 1200};
            for (int i7 = 0; i7 < 3; i7++) {
                org.telegram.messenger.g0.h3(new dd(this, 25), jArr[i7]);
            }
        }
        dd ddVar = this.K6;
        if (ddVar != null) {
            org.telegram.messenger.g0.r(ddVar);
            this.K6 = null;
        }
        if (H0() && A()) {
            return;
        }
        getVisibility();
        if (!this.b3 || org.telegram.ui.ActionBar.g2.hasSheets(this.F3)) {
            return;
        }
        this.b3 = false;
        mg mgVar = this.P3;
        if (mgVar != null) {
            mgVar.o1();
        }
        if (this.H2 == 0 && (hfVar = this.F0) != null) {
            hfVar.requestFocus();
        }
        org.telegram.messenger.g0.I3(this.F0);
        if (org.telegram.messenger.g0.D || this.p3 || org.telegram.messenger.g0.E) {
            return;
        }
        this.a4 = true;
        ue ueVar = this.h4;
        org.telegram.messenger.g0.r(ueVar);
        org.telegram.messenger.g0.h3(ueVar, 100L);
    }

    public final boolean g2() {
        org.telegram.ui.bn bnVar = this.F3;
        TLRPC.EncryptedChat encryptedChat = bnVar != null ? bnVar.h : null;
        return encryptedChat == null || org.telegram.messenger.g0.X0(encryptedChat.layer) >= 101;
    }

    public org.telegram.ui.ActionBar.i1 getAdjustPanLayoutHelper() {
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

    public ki.j3 getBotWebViewButton() {
        if (this.l0 == null) {
            Context context = getContext();
            ki.j3 j3Var = new ki.j3(context);
            j3Var.a = new Path();
            j3Var.c = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Fi, false);
            j3Var.d = true;
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setSingleLine();
            textView.setAlpha(0.0f);
            textView.setGravity(17);
            textView.setTypeface(org.telegram.messenger.g0.o());
            j3Var.addView(textView, c8.na.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context, null);
            radialProgressView.setSize(org.telegram.messenger.g0.L(18.0f));
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.0f);
            radialProgressView.setScaleY(0.0f);
            j3Var.addView(radialProgressView, c8.na.d(28, 28.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            View view = new View(context);
            j3Var.h = view;
            int i7 = org.telegram.ui.ActionBar.n6.Hi;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i7, false), 2, -1);
            org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
            view.setBackground(h02);
            org.telegram.ui.ActionBar.u6.j(view, h02, null, M, null);
            j3Var.addView(view, c8.na.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            j3Var.setWillNotDraw(false);
            this.l0 = j3Var;
            j3Var.setVisibility(8);
            W();
            this.l0.setBotMenuButton(this.m0);
            this.o2.addView(this.l0, c8.na.e(-1, -1, 80));
        }
        return this.l0;
    }

    public int getCursorPosition() {
        hf hfVar = this.F0;
        if (hfVar == null) {
            return 0;
        }
        return hfVar.getSelectionStart();
    }

    public CharSequence getDraftMessage() {
        if (this.P2 != null) {
            if (TextUtils.isEmpty(this.L2)) {
                return null;
            }
            return this.L2;
        }
        if (this.F0 == null || !I0()) {
            return null;
        }
        return this.F0.getText();
    }

    @Override // org.telegram.ui.Components.xw0
    public float getEditFieldBottomOffset() {
        if (this.F0 == null) {
            return 0.0f;
        }
        return ((FrameLayout.LayoutParams) r0.getLayoutParams()).bottomMargin - org.telegram.messenger.g0.L(1.5f);
    }

    @Override // org.telegram.ui.Components.xw0
    public Editable getEditText() {
        hf hfVar = this.F0;
        if (hfVar == null) {
            return null;
        }
        return hfVar.getText();
    }

    public org.telegram.messenger.fj getEditingMessageObject() {
        return this.P2;
    }

    public long getEffectId() {
        return this.P6;
    }

    public View getEmojiButton() {
        return this.R0;
    }

    public int getEmojiPadding() {
        return this.q3;
    }

    public qy getEmojiView() {
        return this.V0;
    }

    public float getExitTransition() {
        return this.c5;
    }

    @Override // org.telegram.ui.Components.xw0
    public CharSequence getFieldText() {
        if (this.F0 == null || !I0()) {
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
        return this.b5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x007c, code lost:
    
        if (r6.U3 == null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int getMessagesCount() {
        org.telegram.messenger.jj jjVar;
        org.telegram.messenger.hj hjVar;
        org.telegram.ui.bn bnVar = this.F3;
        int size = (bnVar == null || (jjVar = bnVar.x5) == null || (hjVar = jjVar.b) == null) ? 0 : hjVar.g.size();
        hf hfVar = this.F0;
        if (hfVar == null || TextUtils.isEmpty(hfVar.getText())) {
            if (this.T3 == null) {
            }
            size++;
        } else {
            String obj = this.F0.getText().toString();
            org.telegram.messenger.q5 q5Var = org.telegram.messenger.zy.J;
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
            int w12 = org.telegram.messenger.mp.u1(this.S.a).w1();
            if (trim.length() != 0) {
                size += (int) Math.ceil(trim.length() / w12);
            }
            size++;
        }
        return Math.max(1, size);
    }

    public RecordCircle getRecordCircle() {
        return this.D2;
    }

    public long getRecordTimerStartTime() {
        vg vgVar = this.Z0;
        if (vgVar == null || !vgVar.a) {
            return 0L;
        }
        return vgVar.d;
    }

    public org.telegram.messenger.fj getReplyingMessageObject() {
        return this.J3;
    }

    public int getRestingFieldHeight() {
        hf hfVar = this.F0;
        if (hfVar == null) {
            return org.telegram.messenger.g0.L(44.0f);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) hfVar.getLayoutParams();
        return Math.max(org.telegram.messenger.g0.L(44.0f), this.F0.getLineHeight() + this.F0.getPaddingBottom() + this.F0.getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin);
    }

    public int getSelectionLength() {
        hf hfVar = this.F0;
        if (hfVar == null) {
            return 0;
        }
        try {
            return hfVar.getSelectionEnd() - this.F0.getSelectionStart();
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

    public org.telegram.messenger.kj getSendMessageSuggestionParams() {
        org.telegram.ui.bn bnVar = this.F3;
        if (bnVar != null) {
            return bnVar.y5;
        }
        return null;
    }

    public long getSendMonoForumPeerId() {
        org.telegram.ui.bn bnVar = this.F3;
        if (bnVar != null) {
            return bnVar.j9();
        }
        return 0L;
    }

    public qn0 getSenderSelectView() {
        return this.q0;
    }

    public cu0 getSizeNotifierLayout() {
        return this.c2;
    }

    public float getSlideToCancelProgress() {
        return this.Z4;
    }

    public CharSequence getSlowModeTimer() {
        if (this.H0 > 0) {
            return ((org.telegram.ui.ActionBar.n5) this.G0.c).getText();
        }
        return null;
    }

    public long getStarsPrice() {
        org.telegram.ui.bn bnVar = this.F3;
        return bnVar != null ? bnVar.getMessagesController().P1(bnVar.a()) : org.telegram.messenger.mp.u1(this.R).P1(this.G3);
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
        tL_textWithEntities.entities = org.telegram.messenger.ri.d0(org.telegram.messenger.i10.t0).Y(charSequenceArr, true, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        return tL_textWithEntities;
    }

    public float getTopViewEnterProgress() {
        return this.h7.e;
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

    public v31 getTrendingStickersAlert() {
        return this.Q3;
    }

    public int getVisibleEmojiPadding() {
        if (this.X0) {
            return this.q3;
        }
        return 0;
    }

    public float getVisualHeight() {
        float f10 = this.J2;
        View view = this.w2;
        if (view != null && view.getVisibility() == 0) {
            f10 += (1.0f - getTopViewEnterProgress()) * this.w2.getLayoutParams().height;
        }
        return getMeasuredHeight() - f10;
    }

    public final void h0() {
        if (this.q0 != null || getContext() == null) {
            return;
        }
        qn0 qn0Var = new qn0(getContext());
        ImageReceiver imageReceiver = new ImageReceiver(qn0Var);
        qn0Var.a = imageReceiver;
        qn0Var.b = new a9((org.telegram.ui.ActionBar.i6) null);
        qn0Var.d = new Paint(1);
        Paint paint = new Paint(1);
        qn0Var.e = paint;
        imageReceiver.K0(org.telegram.messenger.g0.L(28.0f));
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        qn0Var.updateColors();
        qn0Var.setContentDescription(org.telegram.messenger.gd.a0("AccDescrSendAsPeer", null, 2131754774, ""));
        this.q0 = qn0Var;
        qn0Var.setOnClickListener(new id(this, 2));
        this.q0.setVisibility(8);
        this.o2.addView(this.q0, c8.na.d(36, 36.0f, 83, 4.66f, 4.0f, 4.66f, 4.0f));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:(1:246)(1:167)|168|(8:170|(1:244)(1:174)|(1:243)(1:180)|181|(4:183|(1:185)(1:191)|186|(1:190))|(1:193)(1:242)|194|(1:196))(1:245)|197|(3:199|(1:201)(1:203)|202)|204|(3:(1:207)(1:223)|(2:211|(1:221))|222)|224|(4:226|(1:240)(1:230)|231|(5:233|234|235|236|237))|241|234|235|236|237) */
    /* JADX WARN: Can't wrap try/catch for region: R(30:15|(1:17)|18|(1:154)(1:24)|25|(3:27|(1:31)|32)(2:108|(3:110|(1:114)|115)(1:(9:117|(1:119)(1:144)|120|(3:124|(1:126)|127)|128|(3:130|(1:136)|137)|138|(1:142)|143)(1:(20:150|(1:152)|153|34|(1:38)|39|(1:107)|42|(1:104)(1:46)|(1:103)(1:50)|(1:102)|(4:(1:58)(1:65)|59|60|(1:64))|(1:101)(1:71)|(1:73)|74|(3:(1:77)(1:93)|(2:81|(1:91))|92)|94|95|96|97))))|33|34|(2:36|38)|39|(0)|105|107|42|(1:44)|104|(1:48)|103|(2:52|54)|102|(0)|(1:67)|101|(0)|74|(0)|94|95|96|97) */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0347  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h1(View view) {
        TLRPC.User user;
        int measuredHeight;
        hf hfVar;
        org.telegram.messenger.jj jjVar;
        org.telegram.messenger.hj hjVar;
        ArrayList arrayList;
        e50 e50Var;
        boolean z10;
        org.telegram.messenger.jj jjVar2;
        boolean z11;
        boolean z12;
        String str;
        int i7;
        hf hfVar2;
        int i10 = 0;
        if (!c()) {
            int i11 = 5;
            org.telegram.ui.bn bnVar = this.F3;
            if ((bnVar == null || bnVar.g4 != 5) && !this.j7.f) {
                boolean z13 = this.a6;
                int i12 = 16;
                se seVar = this.K0;
                org.telegram.ui.ActionBar.i6 i6Var = this.M4;
                int i13 = 1;
                if (z13 || !(((hfVar = this.F0) != null && !TextUtils.isEmpty(hfVar.getText())) || bnVar == null || (jjVar = bnVar.x5) == null || (hjVar = jjVar.b) == null || (arrayList = hjVar.e) == null || arrayList.isEmpty())) {
                    boolean z14 = bnVar != null && org.telegram.messenger.n10.C(bnVar.j());
                    if (this.P0 == null) {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(this.E3, i6Var);
                        this.P0 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
                        this.P0.setOnTouchListener(new cf(this));
                        this.P0.setDispatchKeyEventListener(new qd(this));
                        this.P0.setShownFromBottom(false);
                        boolean z15 = bnVar != null && bnVar.S6();
                        boolean z16 = !z14 && (this.H0 <= 0 || c());
                        if (z15) {
                            boolean z17 = !z16;
                            org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, getContext(), this.M4, true, z17);
                            this.g6 = y0Var;
                            if (z14) {
                                y0Var.j(org.telegram.messenger.gd.N0(2131745318, null), R.drawable.msg_calendar2, null);
                            } else {
                                y0Var.j(org.telegram.messenger.gd.N0(2131745663, null), R.drawable.msg_calendar2, null);
                            }
                            this.g6.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                            this.g6.setOnClickListener(new id(this, i12));
                            this.P0.a(this.g6, c8.na.o(-1, 44));
                            int i14 = org.telegram.messenger.bz.a;
                            SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
                            edit.putInt("scheduledHintShows", 3);
                            edit.apply();
                            if (!z14 && this.G3 > 0) {
                                org.telegram.ui.ActionBar.y0 y0Var2 = new org.telegram.ui.ActionBar.y0(0, getContext(), this.M4, true, z17);
                                this.c = y0Var2;
                                y0Var2.j(org.telegram.messenger.gd.N0(2131745390, null), R.drawable.msg_online, null);
                                this.c.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                                this.c.setOnClickListener(new id(this, 17));
                                this.P0.a(this.c, c8.na.o(-1, 44));
                            }
                        }
                        if (z16) {
                            org.telegram.ui.ActionBar.y0 y0Var3 = new org.telegram.ui.ActionBar.y0(0, getContext(), this.M4, !z15, true);
                            user = null;
                            y0Var3.j(org.telegram.messenger.gd.N0(2131745387, null), R.drawable.input_notify_off, null);
                            y0Var3.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                            y0Var3.setOnClickListener(new id(this, 18));
                            this.P0.a(y0Var3, c8.na.o(-1, 44));
                        } else {
                            user = null;
                        }
                        df dfVar = new df(this, this.P0);
                        this.O0 = dfVar;
                        dfVar.b = false;
                        dfVar.setAnimationStyle(R.style.PopupContextAnimation2);
                        this.O0.setOutsideTouchable(true);
                        this.O0.setClippingEnabled(true);
                        this.O0.setInputMethodMode(2);
                        this.O0.setSoftInputMode(0);
                        this.O0.getContentView().setFocusableInTouchMode(true);
                        int i15 = org.telegram.messenger.bz.a;
                        SharedPreferences.Editor edit2 = org.telegram.messenger.mp.g1().edit();
                        edit2.putInt("scheduledOrNoSoundHintShows", 3);
                        edit2.apply();
                        mg mgVar = this.P3;
                        if (mgVar != null) {
                            mgVar.r2();
                        }
                    } else {
                        user = null;
                    }
                    org.telegram.ui.ActionBar.y0 y0Var4 = this.g6;
                    if (y0Var4 != null) {
                        y0Var4.setVisibility(this.P ? 8 : 0);
                    }
                    if (this.c != null) {
                        TLRPC.User j3 = bnVar == null ? user : bnVar.j();
                        if (j3 != null && !j3.bot) {
                            TLRPC.UserStatus userStatus = j3.status;
                            if (!(userStatus instanceof TLRPC.TL_userStatusEmpty) && !(userStatus instanceof TLRPC.TL_userStatusOnline) && !(userStatus instanceof TLRPC.TL_userStatusRecently) && !(userStatus instanceof TLRPC.TL_userStatusLastMonth) && !(userStatus instanceof TLRPC.TL_userStatusLastWeek)) {
                                this.c.setVisibility(0);
                            }
                        }
                        this.c.setVisibility(8);
                    }
                    this.P0.setupRadialSelectors(G0(org.telegram.ui.ActionBar.n6.I5));
                    this.P0.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
                    this.O0.setFocusable(true);
                    int[] iArr = this.D3;
                    view.getLocationInWindow(iArr);
                    if (this.p3) {
                        int measuredHeight2 = getMeasuredHeight();
                        View view2 = this.w2;
                        if (measuredHeight2 > org.telegram.messenger.g0.L((view2 == null || view2.getVisibility() != 0) ? 58.0f : 102.0f)) {
                            measuredHeight = view.getMeasuredHeight() + iArr[1];
                            this.O0.showAtLocation(view, 51, org.telegram.messenger.g0.L(8.0f) + ((view.getMeasuredWidth() + iArr[0]) - this.P0.getMeasuredWidth()), measuredHeight);
                            this.O0.b();
                            seVar.invalidate();
                            view.performHapticFeedback(3, 2);
                            return true;
                        }
                    }
                    measuredHeight = (iArr[1] - this.P0.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f);
                    this.O0.showAtLocation(view, 51, org.telegram.messenger.g0.L(8.0f) + ((view.getMeasuredWidth() + iArr[0]) - this.P0.getMeasuredWidth()), measuredHeight);
                    this.O0.b();
                    seVar.invalidate();
                    view.performHapticFeedback(3, 2);
                    return true;
                }
                org.telegram.ui.dg0 dg0Var = this.M0;
                if (dg0Var != null) {
                    dg0Var.h(false);
                }
                org.telegram.messenger.g0.r(this.f6);
                ef efVar = new ef(this, getContext(), i6Var, i10);
                this.M0 = efVar;
                efVar.setOnDismissListener(new gd(this, i13));
                boolean z18 = (this.T3 == null && ((hfVar2 = this.F0) == null || TextUtils.isEmpty(hfVar2.getText()))) ? false : true;
                ArrayList arrayList2 = new ArrayList();
                if (this.u2 != null) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.id = 0;
                    tL_message.out = true;
                    tL_message.peer_id = org.telegram.messenger.mp.u1(this.R).B1(this.G3);
                    tL_message.from_id = org.telegram.messenger.mp.u1(this.R).B1(org.telegram.messenger.i10.i(this.R).e());
                    tL_message.rich_message = this.u2;
                    org.telegram.messenger.fj fjVar = new org.telegram.messenger.fj(this.R, tL_message, false, true);
                    org.telegram.messenger.fj fjVar2 = this.J3;
                    if (fjVar2 != null && !fjVar2.p) {
                        fjVar.C = fjVar2;
                    }
                    fjVar.W2 = Boolean.TRUE;
                    fjVar.n0(null);
                    fjVar.w1 = true;
                    fjVar.B0 = true;
                    arrayList2.add(fjVar);
                } else if (this.R3 != null) {
                    TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                    tL_message2.id = 0;
                    tL_message2.out = true;
                    tL_message2.peer_id = org.telegram.messenger.mp.u1(this.R).B1(this.G3);
                    tL_message2.from_id = org.telegram.messenger.mp.u1(this.R).B1(org.telegram.messenger.i10.i(this.R).e());
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                    tL_message2.media = tL_messageMediaDocument;
                    tL_messageMediaDocument.voice = true;
                    tL_messageMediaDocument.document = this.R3;
                    tL_message2.send_state = 1;
                    tL_message2.attachPath = this.S3;
                    org.telegram.messenger.fj fjVar3 = new org.telegram.messenger.fj(this.R, tL_message2, false, true);
                    org.telegram.messenger.fj fjVar4 = this.J3;
                    if (fjVar4 != null && !fjVar4.p) {
                        fjVar3.C = fjVar4;
                    }
                    fjVar3.W2 = Boolean.TRUE;
                    fjVar3.n0(null);
                    fjVar3.w1 = true;
                    fjVar3.B0 = true;
                    arrayList2.add(fjVar3);
                } else if (z18) {
                    TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
                    tL_message3.id = 0;
                    tL_message3.out = true;
                    tL_message3.peer_id = org.telegram.messenger.mp.u1(this.R).B1(this.G3);
                    tL_message3.from_id = org.telegram.messenger.mp.u1(this.R).B1(org.telegram.messenger.i10.i(this.R).e());
                    hf hfVar3 = this.F0;
                    CharSequence[] charSequenceArr = {new SpannableStringBuilder(hfVar3 == null ? "" : hfVar3.getTextToUse())};
                    org.telegram.messenger.fj.d(charSequenceArr[0], true);
                    tL_message3.entities.addAll(org.telegram.messenger.ri.d0(this.R).Y(charSequenceArr, true, true));
                    tL_message3.message = charSequenceArr[0].toString();
                    org.telegram.messenger.fj fjVar5 = this.J3;
                    if (fjVar5 != null && !fjVar5.p) {
                        TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                        org.telegram.messenger.fj fjVar6 = this.K3;
                        if (fjVar6 != null) {
                            tL_messageReplyHeader.flags |= 2;
                            tL_messageReplyHeader.reply_to_top_id = fjVar6.e1();
                        }
                        tL_messageReplyHeader.flags |= 16;
                        tL_messageReplyHeader.reply_to_msg_id = this.J3.e1();
                        tL_message3.reply_to = tL_messageReplyHeader;
                    }
                    if (this.N3 != null) {
                        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                        tL_messageMediaWebPage.webpage = this.N3;
                        if (bnVar != null && (jjVar2 = bnVar.x5) != null && jjVar2.o) {
                            boolean z19 = jjVar2.q;
                            tL_messageMediaWebPage.force_small_media = z19;
                            tL_messageMediaWebPage.force_large_media = !z19;
                            tL_message3.invert_media = jjVar2.r;
                        }
                        tL_message3.media = tL_messageMediaWebPage;
                    }
                    org.telegram.messenger.fj fjVar7 = new org.telegram.messenger.fj(this.R, tL_message3, false, false);
                    org.telegram.messenger.fj fjVar8 = this.J3;
                    if (fjVar8 != null && !fjVar8.p) {
                        fjVar7.C = fjVar8;
                    }
                    fjVar7.B0 = true;
                    fjVar7.W2 = Boolean.TRUE;
                    fjVar7.D = 0;
                    fjVar7.n0(null);
                    fjVar7.w1 = true;
                    arrayList2.add(fjVar7);
                } else if (bnVar != null && (e50Var = bnVar.q3) != null && e50Var.getTextureView() != null) {
                    org.telegram.ui.dg0 dg0Var2 = this.M0;
                    TextureView textureView = bnVar.q3.getTextureView();
                    dg0Var2.getClass();
                    if (textureView != null) {
                        dg0Var2.l0 = new RectF();
                        int[] iArr2 = new int[2];
                        textureView.getLocationOnScreen(iArr2);
                        dg0Var2.l0.set(iArr2[0], iArr2[1], textureView.getWidth() + r12, textureView.getHeight() + iArr2[1]);
                    }
                    z10 = true;
                    this.M0.r(arrayList2);
                    if (z18 && this.R3 == null) {
                        org.telegram.ui.dg0 dg0Var3 = this.M0;
                        hf hfVar4 = this.F0;
                        d dVar = new d(this, i11);
                        ud udVar = new ud(this, i10);
                        dg0Var3.S = hfVar4;
                        dg0Var3.U = dVar;
                        dg0Var3.V = udVar;
                    }
                    int i16 = 4;
                    this.M0.s(seVar, true, new fi.v1(i16, this, z18));
                    if ((!z18 || z10) && this.G3 >= 0) {
                        this.M0.c(bnVar);
                        this.M0.p(this.P6);
                    }
                    x60 G = x60.G(this, i6Var, seVar);
                    z11 = bnVar == null && org.telegram.messenger.n10.C(bnVar.j());
                    z12 = bnVar == null && bnVar.S6();
                    if (!z11 || (this.H0 > 0 && !c())) {
                        i13 = 0;
                    }
                    if (z12) {
                        G.c(R.drawable.msg_calendar2, org.telegram.messenger.gd.N0(z11 ? 2131745318 : 2131745663, null), new td(this, 3), false);
                        if (!z11 && this.G3 > 0) {
                            G.c(R.drawable.msg_online, org.telegram.messenger.gd.N0(2131745390, null), new td(this, i16), false);
                            this.c = G.z();
                        }
                    }
                    if (bnVar == null && this.P3 != null && org.telegram.messenger.v3.p0(bnVar.e)) {
                        str = null;
                        i7 = 2;
                        G.c(R.drawable.input_suggest_paid_24, org.telegram.messenger.gd.N0(2131746875, null), new td(this, i7), false);
                    } else {
                        str = null;
                        i7 = 2;
                    }
                    if (i13 != 0) {
                        G.c(R.drawable.input_notify_off, org.telegram.messenger.gd.N0(2131745387, str), new od(this, z18, i7), false);
                    }
                    G.Z();
                    if (this.c != null) {
                        TLRPC.User j10 = bnVar == null ? null : bnVar.j();
                        if (j10 != null && !j10.bot) {
                            TLRPC.UserStatus userStatus2 = j10.status;
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
                z10 = false;
                this.M0.r(arrayList2);
                if (z18) {
                    org.telegram.ui.dg0 dg0Var32 = this.M0;
                    hf hfVar42 = this.F0;
                    d dVar2 = new d(this, i11);
                    ud udVar2 = new ud(this, i10);
                    dg0Var32.S = hfVar42;
                    dg0Var32.U = dVar2;
                    dg0Var32.V = udVar2;
                }
                int i162 = 4;
                this.M0.s(seVar, true, new fi.v1(i162, this, z18));
                if (!z18) {
                }
                this.M0.c(bnVar);
                this.M0.p(this.P6);
                x60 G2 = x60.G(this, i6Var, seVar);
                if (bnVar == null) {
                }
                if (bnVar == null) {
                }
                if (!z11) {
                }
                i13 = 0;
                if (z12) {
                }
                if (bnVar == null) {
                }
                str = null;
                i7 = 2;
                if (i13 != 0) {
                }
                G2.Z();
                if (this.c != null) {
                }
                this.M0.q(G2);
                this.M0.show();
                view.performHapticFeedback(3, 2);
                return false;
            }
        }
        return false;
    }

    public final void h2() {
        se seVar = this.K0;
        if (seVar != null) {
            int i7 = this.R;
            org.telegram.ui.bn bnVar = this.F3;
            boolean z10 = r0.b(i7, bnVar != null ? bnVar.a() : this.G3) != null;
            if (this.n6 == null) {
                if (!z10) {
                    return;
                }
                p0 p0Var = new p0(seVar);
                this.n6 = p0Var;
                seVar.h0 = p0Var;
                seVar.i0 = this;
            }
            p0 p0Var2 = this.n6;
            if (p0Var2.b != z10) {
                p0Var2.b = z10;
                p0Var2.a.invalidate();
            }
            if (z10) {
                z0();
            }
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final boolean i0() {
        if (this.l1) {
            return (this.U2 && this.d1) ? false : true;
        }
        return false;
    }

    public final void i1() {
        int height = this.c2.getHeight();
        if (!this.p3) {
            height -= this.q3;
        }
        mg mgVar = this.P3;
        if (mgVar != null) {
            mgVar.i2(height);
        }
        if (this.w2 != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.L(72.0f);
            te.a aVar = this.h7;
            if (height < currentActionBarHeight) {
                if (this.X3) {
                    this.X3 = false;
                    if (this.W3) {
                        aVar.a(false, false);
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.X3) {
                return;
            }
            this.X3 = true;
            if (this.W3) {
                aVar.a(true, false);
            }
        }
    }

    public final void i2() {
        float f10;
        je jeVar = this.h2;
        if (jeVar == null) {
            return;
        }
        float f11 = this.E + this.y;
        se seVar = this.K0;
        if (seVar != null) {
            f10 = seVar.getAlpha() * (-i5.c.d(56.0f, seVar.l(), 0));
        } else {
            f10 = 0.0f;
        }
        jeVar.setTranslationX(f11 + f10);
    }

    public final void j0() {
        bi.v2 v2Var = this.e1;
        if (v2Var == null || !(v2Var.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.e1.getLayoutParams();
        int i7 = i0() ? 80 : 0;
        if (layoutParams.gravity != i7) {
            layoutParams.gravity = i7;
            this.e1.setLayoutParams(layoutParams);
        }
    }

    public void j1() {
        if ((H0() && A()) || org.telegram.ui.ActionBar.g2.hasSheets(this.F3)) {
            return;
        }
        mg mgVar = this.P3;
        if (mgVar != null) {
            mgVar.o1();
        }
        hf hfVar = this.F0;
        if (hfVar == null || org.telegram.messenger.g0.I3(hfVar)) {
            return;
        }
        this.F0.clearFocus();
        this.F0.requestFocus();
    }

    public final void j2() {
        i2();
        org.telegram.ui.b61 b61Var = this.f2;
        if (b61Var != null) {
            b61Var.setTranslationX(this.E + this.y);
            b61Var.setAlpha(this.F * this.G);
            b61Var.setVisibility(b61Var.getAlpha() > 0.0f ? 0 : 8);
            je jeVar = this.h2;
            if (jeVar != null && this.a6) {
                jeVar.setAlpha(this.l2 * this.G);
            }
        }
        te teVar = this.z2;
        if (teVar != null) {
            teVar.setTranslationX(teVar.a);
        }
    }

    public final void k0() {
        RecordCircle recordCircle;
        if (this.v3 || ((recordCircle = this.D2) != null && ChatActivityEnterView.this.i5)) {
            this.v3 = false;
            this.Y1 = 0L;
            this.D1 = true;
            try {
                u2(2, true);
                this.D1 = false;
                org.telegram.messenger.g0.h3(new td(this, 8), 120L);
            } catch (Throwable th2) {
                this.D1 = false;
                throw th2;
            }
        }
    }

    public final void k1() {
        if (H0() && A()) {
            return;
        }
        org.telegram.ui.bn bnVar = this.F3;
        if (org.telegram.ui.ActionBar.g2.hasSheets(bnVar)) {
            return;
        }
        Z1((org.telegram.messenger.g0.D || org.telegram.messenger.g0.E || (bnVar != null && bnVar.isInBubbleMode()) || this.Z2) ? 0 : 2, 0, true, true);
        mg mgVar = this.P3;
        if (mgVar != null) {
            mgVar.o1();
        }
        hf hfVar = this.F0;
        if (hfVar != null) {
            hfVar.requestFocus();
        }
        org.telegram.messenger.g0.I3(this.F0);
        if (this.Z2) {
            this.b3 = true;
            return;
        }
        if (org.telegram.messenger.g0.D || this.p3 || org.telegram.messenger.g0.E) {
            return;
        }
        if (bnVar == null || !bnVar.isInBubbleMode()) {
            this.a4 = true;
            eg egVar = this.V0;
            if (egVar != null) {
                egVar.onTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0));
            }
            ue ueVar = this.h4;
            org.telegram.messenger.g0.r(ueVar);
            org.telegram.messenger.g0.h3(ueVar, 100L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b5, code lost:
    
        if (android.text.TextUtils.isEmpty(r15 == null ? "" : org.telegram.messenger.g0.n1(r15.getTextToUse())) != false) goto L124;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k2(boolean z10) {
        je jeVar;
        if (this.N4) {
            org.telegram.ui.bn bnVar = this.F3;
            if (bnVar != null && !bnVar.f6) {
                z10 = false;
            }
            boolean H0 = H0();
            int i7 = 1;
            boolean z11 = this.q7 != 1 && this.G3 > 0;
            je jeVar2 = this.n2;
            boolean z12 = jeVar2 != null && jeVar2.getVisibility() == 0;
            if (!H0 && !this.f3 && this.d3 == null) {
                je jeVar3 = this.n2;
                if (jeVar3 != null) {
                    jeVar3.setVisibility(8);
                }
            } else if (this.d3 != null) {
                if (T0() && this.V2 == 1 && this.d3.is_persistent) {
                    je jeVar4 = this.n2;
                    if (jeVar4 != null && jeVar4.getVisibility() != 8) {
                        this.n2.setVisibility(8);
                    }
                } else {
                    V();
                    if (this.n2.getVisibility() != 0) {
                        this.n2.setVisibility(0);
                    }
                    this.K2.a(R.drawable.input_bot2, true);
                    this.n2.setContentDescription(org.telegram.messenger.gd.N0(2131754918, "AccDescrBotKeyboard"));
                }
            } else if (z11) {
                je jeVar5 = this.n2;
                if (jeVar5 != null) {
                    jeVar5.setVisibility(8);
                }
            } else {
                V();
                this.K2.a(R.drawable.input_bot1, true);
                this.n2.setContentDescription(org.telegram.messenger.gd.N0(2131754919, "AccDescrBotCommands"));
                this.n2.setVisibility(0);
            }
            if (z11) {
                W();
            }
            je jeVar6 = this.n2;
            boolean z13 = (jeVar6 != null && jeVar6.getVisibility() == 0) != z12;
            ki.y yVar = this.m0;
            int i10 = 2;
            if (yVar != null) {
                boolean z14 = yVar.x;
                yVar.setWebView(this.q7 == 3);
                ki.y yVar2 = this.m0;
                String N0 = this.q7 == 2 ? org.telegram.messenger.gd.N0(2131752879, null) : this.j0;
                if (N0 == null) {
                    yVar2.getClass();
                    N0 = org.telegram.messenger.gd.N0(2131752879, null);
                }
                String str = yVar2.n;
                boolean z15 = str == null || !str.equals(N0);
                yVar2.n = N0;
                yVar2.r = null;
                yVar2.requestLayout();
                org.telegram.messenger.g0.X3(this.m0, z11, 0.5f, true, z10);
                z13 = z13 || z15 || z14 != this.m0.x;
            }
            if (z13 && z10) {
                ge geVar = this.R0;
                Float valueOf = Float.valueOf(geVar.getX());
                HashMap hashMap = this.C0;
                hashMap.put(geVar, valueOf);
                hf hfVar = this.F0;
                if (hfVar != null) {
                    hashMap.put(hfVar, Float.valueOf(hfVar.getX()));
                }
                je jeVar7 = this.n2;
                boolean z16 = jeVar7 != null && jeVar7.getVisibility() == 0;
                if (z16 != z12 && (jeVar = this.n2) != null) {
                    jeVar.setVisibility(0);
                    if (z16) {
                        this.n2.setAlpha(0.0f);
                        this.n2.setScaleX(0.1f);
                        this.n2.setScaleY(0.1f);
                    } else if (!z16) {
                        this.n2.setAlpha(1.0f);
                        this.n2.setScaleX(1.0f);
                        this.n2.setScaleY(1.0f);
                    }
                    org.telegram.messenger.g0.W3(this.n2, z16, 0.1f, true, 1.0f, true, new pd(this, i7));
                }
            }
            je jeVar8 = this.n2;
            if (jeVar8 != null && jeVar8.getVisibility() == 0) {
                hf hfVar2 = this.F0;
            }
            i10 = this.M6;
            q2(i10);
        }
    }

    public final void l0() {
        n0(false, false);
        ai.l0 l0Var = this.j1;
        if (l0Var != null && l0Var.o0 && l0Var.r == 1) {
            l0Var.s();
        }
        hf hfVar = this.F0;
        ge geVar = this.R0;
        if (hfVar != null && hfVar.length() > 0) {
            this.P4.set(geVar, Float.valueOf(1.0f));
            this.R4.set(geVar, Float.valueOf(this.B0 ? 0.5f : 1.0f));
        }
        k0();
        if (geVar != null) {
            geVar.invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l1() {
        org.telegram.ui.bn bnVar;
        Editable editable;
        oi.b2 b2Var;
        CharSequence[] charSequenceArr;
        ArrayList Y;
        if (this.F0 == null || (bnVar = this.F3) == null) {
            return;
        }
        org.telegram.messenger.mp.u1(this.R);
        boolean z10 = org.telegram.messenger.s2.a;
        TL_iv.RichMessage richMessage = this.u2;
        int i7 = 1;
        if (richMessage != null) {
            b2Var = new oi.b2(richMessage);
        } else {
            Editable text = this.F0.getText();
            int i10 = 0;
            if (!TextUtils.isEmpty(text) && TextUtils.indexOf((CharSequence) text, '`') >= 0) {
                try {
                    charSequenceArr = new CharSequence[]{new SpannableStringBuilder(text)};
                    Y = org.telegram.messenger.ri.d0(this.R).Y(charSequenceArr, true, true);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                if (Y != null && !Y.isEmpty()) {
                    editable = new SpannableStringBuilder(charSequenceArr[0]);
                    org.telegram.messenger.fj.b(editable, Y, false, false, false, false, 0);
                    oi.b2 b2Var2 = new oi.b2(editable);
                    if (editable == text) {
                        int selectionStart = this.F0.getSelectionStart();
                        int selectionEnd = this.F0.getSelectionEnd();
                        if (selectionStart < 0) {
                            selectionStart = this.F0.length();
                        }
                        if (selectionEnd < 0) {
                            selectionEnd = selectionStart;
                        }
                        b2Var2.c = selectionStart;
                        b2Var2.d = selectionEnd;
                    }
                    b2Var2.M = new td(this, i10);
                    b2Var = b2Var2;
                }
            }
            editable = text;
            oi.b2 b2Var22 = new oi.b2(editable);
            if (editable == text) {
            }
            b2Var22.M = new td(this, i10);
            b2Var = b2Var22;
        }
        b2Var.setResourceProvider(this.M4);
        b2Var.K = bnVar;
        b2Var.s = bnVar.U;
        b2Var.w = bnVar.a0;
        b2Var.L = new td(this, i7);
        bnVar.presentFragment(b2Var);
    }

    public final void l2() {
        int d;
        v4.c0 c0Var;
        int L0;
        View m10;
        ff ffVar = this.n0;
        if (ffVar == null) {
            return;
        }
        int childCount = ffVar.c.getChildCount();
        int i7 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.n0.c.getChildAt(i10);
            if (i10 < 4) {
                i7 += childAt.getMeasuredHeight();
            }
        }
        cu0 cu0Var = this.c2;
        if (i7 > 0) {
            d = i5.c.d(childCount > 4 ? 12.0f : 0.0f, (cu0Var.getMeasuredHeight() - i7) - org.telegram.messenger.g0.L(8.0f), 0);
        } else {
            d = this.o0.c.size() > 4 ? i5.c.d(162.8f, cu0Var.getMeasuredHeight(), 0) : i5.c.d((Math.max(1, Math.min(4, this.o0.c.size())) * 36) + 8, cu0Var.getMeasuredHeight(), 0);
        }
        if (this.n0.c.getPaddingTop() != d) {
            this.n0.c.setTopGlowOffset(d);
            if (this.W6 == -1 && this.n0.getVisibility() == 0 && this.n0.c.getLayoutManager() != null && (L0 = (c0Var = (v4.c0) this.n0.c.getLayoutManager()).L0()) >= 0 && (m10 = c0Var.m(L0)) != null) {
                this.W6 = L0;
                this.X6 = m10.getTop() - this.n0.c.getPaddingTop();
            }
            this.n0.c.setPadding(0, d, 0, org.telegram.messenger.g0.L(8.0f));
        }
    }

    public final void m(TLRPC.Document document) {
        org.telegram.messenger.ri.d0(this.R).c(document, (int) (System.currentTimeMillis() / 1000), true);
        eg egVar = this.V0;
        if (egVar == null || document == null) {
            return;
        }
        boolean isEmpty = egVar.j1.isEmpty();
        egVar.X();
        if (isEmpty) {
            egVar.Y(false);
        }
    }

    public final void m0() {
        if (!this.k1 || this.O2 || this.v3) {
            return;
        }
        ai.l0 l0Var = this.j1;
        if (l0Var == null || !l0Var.l()) {
            if ((this.A0 && !this.p7 && a8.i1.a(getContext())) != this.l1) {
                this.q1.run();
            }
        }
    }

    public final void m1(CharSequence charSequence, CharSequence charSequence2, String str) {
        org.telegram.ui.bn bnVar;
        if (this.F0 == null || (bnVar = this.F3) == null) {
            return;
        }
        org.telegram.messenger.mp.u1(this.R);
        boolean z10 = org.telegram.messenger.s2.a;
        oi.b2 b2Var = new oi.b2(str);
        b2Var.h = charSequence;
        b2Var.n = charSequence2;
        b2Var.setResourceProvider(this.M4);
        b2Var.K = bnVar;
        b2Var.s = bnVar.U;
        b2Var.w = bnVar.a0;
        b2Var.M = new dd(this, 3);
        b2Var.L = new dd(this, 4);
        bnVar.presentFragment(b2Var);
    }

    public final void m2(boolean z10) {
        if (this.q7 != 1 && this.G3 > 0) {
            W();
        }
        ki.y yVar = this.m0;
        if (yVar != null) {
            yVar.setWebView(H0());
        }
        k2(z10);
    }

    public final void n(TLRPC.Document document) {
        Z();
        eg egVar = this.V0;
        int i7 = egVar.d1;
        org.telegram.messenger.ri.d0(i7).d(0, null, document, (int) (System.currentTimeMillis() / 1000), false);
        boolean isEmpty = egVar.k1.isEmpty();
        egVar.k1 = org.telegram.messenger.ri.d0(i7).k0(0, true);
        iy iyVar = egVar.z0;
        if (iyVar != null) {
            iyVar.f();
        }
        if (isEmpty) {
            egVar.Y(false);
        }
    }

    public final void n0(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.C6;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.C6 = null;
        }
        this.A6 = z10;
        RecordCircle recordCircle = this.D2;
        if (recordCircle != null && this.v3 && z10) {
            recordCircle.setAmplitude(0.0d);
        }
        if (z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.B6, z10 ? 1.0f : 0.0f);
            this.C6 = ofFloat;
            ofFloat.addUpdateListener(new pd(this, 8));
            this.C6.setDuration(220L);
            this.C6.setInterpolator(kr.g);
            this.C6.start();
            return;
        }
        this.B6 = z10 ? 1.0f : 0.0f;
        qg qgVar = this.E2;
        if (qgVar != null) {
            qgVar.invalidate();
        }
        RecordCircle recordCircle2 = this.D2;
        if (recordCircle2 != null) {
            recordCircle2.invalidate();
        }
    }

    public final void n1() {
        dd ddVar = new dd(this, 1);
        if (org.telegram.messenger.c6.j(this.R, this.G3) || org.telegram.messenger.mp.u1(this.R).Z6.contains(Long.valueOf(this.G3))) {
            ddVar.run();
            return;
        }
        b5.n(this.F3, org.telegram.messenger.mp.u1(this.R).c2(Long.valueOf(this.G3)), new org.telegram.ui.ah(25, this, ddVar), new dd(this, 2));
    }

    public final void n2() {
        hf hfVar = this.F0;
        boolean z10 = false;
        V1((hfVar == null || hfVar.getLineCount() <= 2 || this.F0.getText() == null || TextUtils.isEmpty(this.F0.getText().toString().trim())) ? false : true);
        hf hfVar2 = this.F0;
        if (hfVar2 != null && hfVar2.getLineCount() > 2 && this.F0.getText() != null && !TextUtils.isEmpty(this.F0.getText().toString().trim())) {
            z10 = true;
        }
        b2(z10);
    }

    public final void o(boolean z10) {
        org.telegram.ui.bn bnVar;
        if (this.p6 >= 0) {
            ConnectionsManager.getInstance(this.R).cancelRequest(this.p6, true);
            this.p6 = -1;
        }
        ue ueVar = this.s6;
        if (ueVar != null) {
            org.telegram.messenger.g0.r(ueVar);
            this.s6 = null;
        }
        this.q6 = false;
        p0 p0Var = this.n6;
        if (p0Var != null) {
            p0Var.c(false);
        }
        p0 p0Var2 = this.n6;
        if (p0Var2 != null && p0Var2.d) {
            p0Var2.d = false;
            p0Var2.a.invalidate();
        }
        if (this.x6) {
            this.x6 = false;
            this.F1 = false;
            hf hfVar = this.F0;
            if (hfVar != null) {
                hfVar.invalidate();
            }
        }
        if (!z10 || (bnVar = this.F3) == null) {
            return;
        }
        kc.b0(bnVar).Q(R.raw.error, 36, "Couldn't rewrite the message. It wasn't sent.").j();
    }

    public final boolean o0() {
        ai.l0 l0Var;
        hf hfVar;
        if (this.E6) {
            return true;
        }
        if (!this.l1 || (l0Var = this.j1) == null || !l0Var.m() || this.v3) {
            return false;
        }
        return (!this.j1.n() || this.j1.r == 2) && (hfVar = this.F0) != null && hfVar.length() > 0;
    }

    public final boolean o1() {
        return this.W0 != null;
    }

    public final void o2() {
        float f10 = (1.0f - this.A1) * this.y1;
        float T1 = f10 > 0.0f ? org.telegram.messenger.g0.T1(1.0f, 0.6f, f10) : 1.0f;
        float f11 = this.r * this.h * T1;
        ge geVar = this.R0;
        geVar.setScaleX(f11);
        geVar.setScaleY(this.r * this.h * T1);
        geVar.setAlpha((1.0f - f10) * this.s * this.n);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ye yeVar = this.r0;
        if (yeVar != null) {
            yeVar.e = false;
            yeVar.dismiss();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        v0(canvas, true);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View X;
        if (this.v3) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0 && (X = org.telegram.messenger.g0.X(this, motionEvent.getX(), motionEvent.getY())) != this.M && X != this.N) {
            J0();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        ff ffVar;
        super.onLayout(z10, i7, i10, i11, i12);
        if (this.W6 == -1 || (ffVar = this.n0) == null) {
            return;
        }
        v4.c0 c0Var = (v4.c0) ffVar.c.getLayoutManager();
        if (c0Var != null) {
            c0Var.h1(this.W6, this.X6);
        }
        this.W6 = -1;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        ee eeVar = this.p2;
        int measuredHeight = eeVar.getMeasuredHeight();
        ki.y yVar = this.m0;
        ImageView imageView = this.S0;
        ge geVar = this.R0;
        int i11 = 0;
        if (yVar == null || yVar.getTag() == null) {
            qn0 qn0Var = this.q0;
            if (qn0Var == null || qn0Var.getVisibility() != 0) {
                ((ViewGroup.MarginLayoutParams) geVar.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(3.0f);
                if (imageView != null) {
                    ((ViewGroup.MarginLayoutParams) imageView.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(3.0f);
                }
                hf hfVar = this.F0;
                if (hfVar != null) {
                    ((ViewGroup.MarginLayoutParams) hfVar.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(50.0f);
                }
                org.telegram.messenger.ut utVar = this.s2;
                if (utVar != null) {
                    ((ViewGroup.MarginLayoutParams) utVar.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(50.0f);
                }
            } else {
                int i12 = this.q0.getLayoutParams().width;
                this.q0.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.q0.getLayoutParams().height, TLObject.FLAG_30));
                ((ViewGroup.MarginLayoutParams) geVar.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(7.0f) + i12;
                if (imageView != null) {
                    ((ViewGroup.MarginLayoutParams) imageView.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(7.0f) + i12;
                }
                hf hfVar2 = this.F0;
                if (hfVar2 != null) {
                    ((ViewGroup.MarginLayoutParams) hfVar2.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(54.0f) + i12;
                }
                org.telegram.messenger.ut utVar2 = this.s2;
                if (utVar2 != null) {
                    ((ViewGroup.MarginLayoutParams) utVar2.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(54.0f) + i12;
                }
            }
        } else {
            this.m0.measure(i7, i10);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) geVar.getLayoutParams();
            int L = org.telegram.messenger.g0.L(10.0f);
            ki.y yVar2 = this.m0;
            marginLayoutParams.leftMargin = L + (yVar2 == null ? 0 : yVar2.getMeasuredWidth());
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int L2 = org.telegram.messenger.g0.L(10.0f);
                ki.y yVar3 = this.m0;
                marginLayoutParams2.leftMargin = L2 + (yVar3 == null ? 0 : yVar3.getMeasuredWidth());
            }
            hf hfVar3 = this.F0;
            if (hfVar3 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) hfVar3.getLayoutParams();
                int L3 = org.telegram.messenger.g0.L(57.0f);
                ki.y yVar4 = this.m0;
                marginLayoutParams3.leftMargin = L3 + (yVar4 == null ? 0 : yVar4.getMeasuredWidth());
            }
            org.telegram.messenger.ut utVar3 = this.s2;
            if (utVar3 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) utVar3.getLayoutParams();
                int L4 = org.telegram.messenger.g0.L(57.0f);
                ki.y yVar5 = this.m0;
                marginLayoutParams4.leftMargin = L4 + (yVar5 == null ? 0 : yVar5.getMeasuredWidth());
            }
        }
        l2();
        super.onMeasure(i7, i10);
        ki.j3 j3Var = this.l0;
        if (j3Var != null) {
            ki.y yVar6 = this.m0;
            if (yVar6 != null) {
                j3Var.setMeasuredButtonWidth(yVar6.getMeasuredWidth());
            }
            this.l0.getLayoutParams().height = getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f);
            measureChild(this.l0, i7, i10);
        }
        R();
        S();
        if (measuredHeight <= 0 || eeVar.getMeasuredHeight() == measuredHeight) {
            return;
        }
        while (i11 < 2) {
            ImageView imageView2 = i11 == 0 ? this.j2 : this.k2;
            imageView2.setTranslationY((imageView2.getTranslationY() + eeVar.getMeasuredHeight()) - measuredHeight);
            imageView2.animate().translationY(0.0f).setInterpolator(kr.h).setDuration(420L).start();
            i11++;
        }
        hi.u3 u3Var = this.N;
        if (u3Var != null) {
            u3Var.setTranslationY((u3Var.getTranslationY() + eeVar.getMeasuredHeight()) - measuredHeight);
            org.telegram.messenger.m10.o(this.N.animate().translationY(0.0f), kr.h, 420L);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        if (i7 != i11 && this.p4) {
            R1(0, false);
            this.V0.t(false);
            S1(false, false, false, true);
        }
        x61 x61Var = this.g1;
        if (x61Var != null) {
            ArrayList arrayList = x61Var.w;
            if (x61Var.O.isEmpty()) {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    Bitmap bitmap = (Bitmap) arrayList.get(i13);
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                }
            }
            arrayList.clear();
            u61 u61Var = x61Var.x;
            if (u61Var != null) {
                u61Var.cancel(true);
                x61Var.x = null;
            }
            x61Var.invalidate();
        }
    }

    public final ValueAnimator p(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.z2.a, f10);
        ofFloat.addUpdateListener(new pd(this, 5));
        return ofFloat;
    }

    public final boolean p0() {
        ai.l0 l0Var;
        return this.l1 && (l0Var = this.j1) != null && l0Var.m();
    }

    public boolean p1() {
        return true;
    }

    public final void p2(boolean z10) {
        boolean z11;
        String str;
        TLRPC.TL_forumTopic tL_forumTopic;
        String str2;
        org.telegram.messenger.fj fjVar;
        TLRPC.ReplyMarkup replyMarkup;
        TLRPC.ReplyMarkup replyMarkup2;
        hf hfVar = this.F0;
        if (hfVar == null) {
            return;
        }
        CharSequence charSequence = this.e;
        boolean z12 = false;
        if (charSequence != null) {
            hfVar.r(charSequence, z10);
            hf hfVar2 = this.F0;
            String str3 = this.f;
            et etVar = hfVar2.v0;
            if (etVar != null) {
                if (!org.telegram.messenger.gd.a0 && z10) {
                    z12 = true;
                }
                etVar.t(str3, z12, true);
                return;
            }
            return;
        }
        if (!this.A0 && !R0()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i5.c.k(2131747027, "PlainTextRestrictedHint", new StringBuilder(" d ")));
            spannableStringBuilder.setSpan(new kq(R.drawable.msg_mini_lock3, 0), 1, 2, 0);
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
        B2();
        org.telegram.ui.bn bnVar = this.F3;
        boolean z13 = bnVar != null && bnVar.g4 == 8 && bnVar.i4;
        long P1 = bnVar != null ? bnVar.getMessagesController().P1(bnVar.a()) : 0L;
        if (P1 > 0) {
            P1 *= getMessagesCount();
        }
        int i10 = bnVar != null ? bnVar.g4 : -1;
        if (i10 == 9) {
            this.F0.setHintText(org.telegram.messenger.gd.N0(2131742624, null));
            return;
        }
        if (i10 == 5) {
            if ("hello".equalsIgnoreCase(bnVar.f4)) {
                this.F0.setHintText(org.telegram.messenger.gd.N0(2131752755, null));
                return;
            } else if ("away".equalsIgnoreCase(bnVar.f4)) {
                this.F0.setHintText(org.telegram.messenger.gd.N0(2131752824, null));
                return;
            } else {
                this.F0.setHintText(org.telegram.messenger.gd.N0(2131752660, null));
                return;
            }
        }
        kq[] kqVarArr = this.L6;
        if (z13) {
            this.F0.setHintText(P1 > 0 ? di.pb.T0(org.telegram.messenger.gd.a0(null, null, 2131744158, org.telegram.messenger.gd.E((int) P1, ','), kqVarArr)) : org.telegram.messenger.gd.a0(null, null, 2131744159, new Object[0]));
            kq kqVar = kqVarArr[0];
            if (kqVar != null) {
                kqVar.H = 0.9f;
                return;
            }
            return;
        }
        if (this.R2 != null) {
            this.F0.setHintText(org.telegram.messenger.gd.N0(2131752694, null));
            return;
        }
        org.telegram.messenger.fj fjVar2 = this.J3;
        if (fjVar2 != null && (replyMarkup2 = fjVar2.k.reply_markup) != null && !TextUtils.isEmpty(replyMarkup2.placeholder)) {
            this.F0.r(this.J3.k.reply_markup.placeholder, z10);
            return;
        }
        if (this.P2 != null) {
            this.F0.setHintText(this.Q2 ? org.telegram.messenger.gd.N0(2131752549, null) : org.telegram.messenger.gd.N0(2131743681, null));
            return;
        }
        if (P1 > 0) {
            this.F0.setHintText(di.pb.Z0(false, org.telegram.messenger.gd.a0(null, null, 2131743679, org.telegram.messenger.gd.E((int) P1, ',')), kqVarArr));
            kq kqVar2 = kqVarArr[0];
            if (kqVar2 != null) {
                kqVar2.H = 0.9f;
                return;
            }
            return;
        }
        if (this.Y0 && (fjVar = this.c3) != null && (replyMarkup = fjVar.k.reply_markup) != null && !TextUtils.isEmpty(replyMarkup.placeholder)) {
            this.F0.r(this.c3.k.reply_markup.placeholder, z10);
            return;
        }
        if (bnVar != null && bnVar.T9()) {
            org.telegram.messenger.fj fjVar3 = this.K3;
            if (fjVar3 != null && (tL_forumTopic = fjVar3.j1) != null && (str2 = tL_forumTopic.title) != null) {
                this.F0.r(org.telegram.messenger.gd.a0(null, null, 2131743678, str2), z10);
                return;
            }
            TLRPC.TL_forumTopic f10 = org.telegram.messenger.mp.u1(this.R).t7.f(bnVar.e.id, 1L);
            if (f10 == null || (str = f10.title) == null) {
                this.F0.r(org.telegram.messenger.gd.N0(2131743681, null), z10);
                return;
            } else {
                this.F0.r(org.telegram.messenger.gd.a0(null, null, 2131743678, str), z10);
                return;
            }
        }
        if (org.telegram.messenger.n5.z(this.G3)) {
            TLRPC.Chat O0 = org.telegram.messenger.mp.u1(this.S.a).O0(Long.valueOf(-this.G3));
            TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(this.S.a).P0(-this.G3);
            z11 = org.telegram.messenger.v3.V(O0);
            z12 = !z11 && org.telegram.messenger.v3.M(O0, P0, false) == (-this.G3);
        } else {
            z11 = false;
        }
        if (z12) {
            this.F0.setHintText(org.telegram.messenger.gd.N0(2131745442, "SendAnonymously"));
            return;
        }
        TLRPC.User c22 = org.telegram.messenger.mp.u1(this.S.a).c2(Long.valueOf(this.G3));
        if (c22 != null && c22.bot_forum_view && !c22.bot_forum_can_manage_topics && bnVar != null && !bnVar.x4) {
            this.F0.setHintText(org.telegram.messenger.gd.N0(2131745437, null));
            return;
        }
        if (bnVar != null && bnVar.fa() && !bnVar.x4) {
            if (bnVar.m4 == null || !bnVar.v4) {
                this.F0.setHintText(org.telegram.messenger.gd.N0(2131746067, "Reply"));
                return;
            } else {
                this.F0.setHintText(org.telegram.messenger.gd.N0(2131751993, null));
                return;
            }
        }
        if (!z11) {
            this.F0.setHintText(org.telegram.messenger.gd.N0(2131743681, null));
        } else if (this.W2) {
            this.F0.r(org.telegram.messenger.gd.N0(2131752279, "ChannelSilentBroadcast"), z10);
        } else {
            this.F0.r(org.telegram.messenger.gd.N0(2131752435, "ChannelBroadcast"), z10);
        }
    }

    public final ValueAnimator q(boolean z10) {
        final float alpha = getSendButtonInternal().getAlpha();
        final float f10 = z10 ? 1.0f : 0.0f;
        final float scaleX = getSendButtonInternal().getScaleX();
        final float f11 = z10 ? 1.0f : 0.1f;
        final float scaleY = getSendButtonInternal().getScaleY();
        final float f12 = z10 ? 1.0f : 0.1f;
        if (z10 && alpha < 0.25f && (getSendButtonInternal() instanceof tg) && SystemClock.uptimeMillis() > this.I1) {
            tg tgVar = (tg) getSendButtonInternal();
            tgVar.p0.e(true, 0.0f);
            tgVar.invalidate();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.sd
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i7 = ChatActivityEnterView.s7;
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

    public final void q0() {
        float f10;
        jh.f D0;
        if (this.E2 == null) {
            return;
        }
        if (i0() && this.v3) {
            RectF rectF = this.I4;
            if (!rectF.isEmpty() && this.E2.getHeight() > 0 && (D0 = D0()) != null) {
                this.E2.getLocationInWindow(this.n7);
                D0.getLocationInWindow(this.o7);
                f10 = Math.min(0.0f, (((D0.getInputBubbleTop() + r3[1]) - org.telegram.messenger.g0.L(8.0f)) - org.telegram.messenger.g0.L(18.0f)) - (rectF.centerY() + (((r4[1] - this.E2.getTranslationY()) + this.S5) + this.T5)));
                if (Math.abs(f10 - this.m7) < 0.5f || (f10 == 0.0f && this.m7 != 0.0f)) {
                    this.m7 = f10;
                    this.E2.setTranslationY(this.S5 + this.T5 + f10);
                }
                return;
            }
        }
        f10 = 0.0f;
        if (Math.abs(f10 - this.m7) < 0.5f) {
        }
        this.m7 = f10;
        this.E2.setTranslationY(this.S5 + this.T5 + f10);
    }

    public final void q1(int i7, int i10, CharSequence charSequence, boolean z10) {
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

    public final void q2(int i7) {
        ImageView imageView;
        te teVar;
        te teVar2;
        je jeVar;
        int L;
        pe peVar;
        this.M6 = i7;
        if (this.F0 != null) {
            org.telegram.messenger.fj fjVar = this.P2;
            if (fjVar == null || fjVar.p5()) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.F0.getLayoutParams();
                int i10 = layoutParams.rightMargin;
                boolean z10 = this.a6;
                se seVar = this.K0;
                if (z10 && this.p7) {
                    layoutParams.rightMargin = Math.max(0, seVar.l() - org.telegram.messenger.g0.L(44.0f)) + org.telegram.messenger.g0.L(this.l5 ? 50.0f : 2.0f);
                } else if ((i7 == 1 || i7 == 2) && !p0()) {
                    je jeVar2 = this.n2;
                    if (jeVar2 == null || jeVar2.getVisibility() != 0 || (teVar2 = this.z2) == null || teVar2.getVisibility() != 0 || (jeVar = this.h2) == null || jeVar.getVisibility() != 0) {
                        je jeVar3 = this.n2;
                        if ((jeVar3 == null || jeVar3.getVisibility() != 0) && (((imageView = this.y2) == null || imageView.getVisibility() != 0) && ((teVar = this.z2) == null || teVar.getTag() == null))) {
                            layoutParams.rightMargin = org.telegram.messenger.g0.L(50.0f);
                        } else {
                            layoutParams.rightMargin = org.telegram.messenger.g0.L(98.0f);
                        }
                    } else {
                        layoutParams.rightMargin = org.telegram.messenger.g0.L(146.0f);
                    }
                    if (this.l5) {
                        layoutParams.rightMargin = org.telegram.messenger.g0.L(48.0f) + layoutParams.rightMargin;
                    }
                } else {
                    te teVar3 = this.z2;
                    if (teVar3 == null || teVar3.getTag() == null) {
                        layoutParams.rightMargin = org.telegram.messenger.g0.L(2.0f);
                    } else {
                        layoutParams.rightMargin = org.telegram.messenger.g0.L(50.0f);
                    }
                }
                if (p0() || (i0() && this.v3)) {
                    hf hfVar = this.F0;
                    View view = hfVar == null ? null : (View) hfVar.getParent();
                    if (view == null || view.getWidth() == 0 || (peVar = this.a1) == null || peVar.getWidth() == 0) {
                        L = org.telegram.messenger.g0.L(28.0f);
                    } else {
                        view.getLocationInWindow(new int[2]);
                        peVar.getLocationInWindow(new int[2]);
                        L = Math.max(org.telegram.messenger.g0.L(2.0f), Math.round((view.getWidth() + r6[0]) - ((((peVar.getWidth() / 2.0f) + (r3[0] - peVar.getTranslationX())) - org.telegram.messenger.g0.N(41.0f)) - org.telegram.messenger.g0.L(8.0f))));
                    }
                    layoutParams.rightMargin = L;
                }
                layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, seVar.l() - org.telegram.messenger.g0.L(44.0f)));
                se seVar2 = this.v2;
                if (seVar2 != null && seVar2.getVisibility() == 0) {
                    layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, this.v2.l() - org.telegram.messenger.g0.L(44.0f)));
                }
                if (i10 != layoutParams.rightMargin) {
                    this.F0.setLayoutParams(layoutParams);
                }
                ee eeVar = this.f1;
                if (eeVar != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) eeVar.getLayoutParams();
                    layoutParams2.rightMargin = this.P2 == null ? i5.c.d(44.0f, seVar.l(), 0) : 0;
                    this.f1.setLayoutParams(layoutParams2);
                }
            }
        }
    }

    public final void r() {
        float min;
        qh0 qh0Var = this.h1;
        if (qh0Var == null || qh0Var.getAnimatedDrawable() != this.A5) {
            return;
        }
        float f10 = this.E5;
        if (f10 < 0.72f) {
            float f11 = this.D5;
            min = ((f10 / 0.72f) * 22.0f * f11) + (8.0f * f11);
        } else {
            min = (Math.min(1.0f, (f10 - 0.72f) / 0.22999996f) * 14.0f) + 30.0f;
        }
        this.h1.setProgress(min / 52.0f);
        if (this.h1 == null) {
            return;
        }
        float f12 = this.E5;
        float i7 = f12 < 0.72f ? this.D5 : 1.0f - Utilities.i((f12 - 0.72f) / 0.22999996f, 1.0f, 0.0f);
        float f13 = (3.0f - (i7 * 2.0f)) * i7 * i7 * 12.0f;
        float L = org.telegram.messenger.g0.L(12.0f);
        this.h1.setPivotX(r5.getWidth() / 2.0f);
        this.h1.setPivotY((r5.getHeight() / 2.0f) + L);
        this.h1.setRotation(f13);
        if (this.i1 != null) {
            double radians = Math.toRadians(f13);
            float L2 = L + org.telegram.messenger.g0.L(3.0f);
            zi0 zi0Var = this.i1;
            float sin = ((float) Math.sin(radians)) * L2;
            float cos = (1.0f - ((float) Math.cos(radians))) * L2;
            xu0 xu0Var = zi0Var.J0;
            xu0Var.R = sin;
            xu0Var.S = cos;
            zi0Var.invalidate();
        }
    }

    public final boolean r0() {
        if (!s0() || this.l1) {
            return false;
        }
        return (c8.c1.a() && org.telegram.messenger.mp.g1().getBoolean("design_voice_live_field", true)) ? false : true;
    }

    public final void r1() {
        S1(false, true, false, true);
        Z1(0, 0, false, true);
        if (getEditField() != null && !TextUtils.isEmpty(getEditField().getText())) {
            getEditField().setText("");
        }
        this.v3 = false;
        qe qeVar = this.c1;
        if (qeVar != null) {
            qeVar.setVisibility(0);
        }
        this.a3 = true;
        X0();
        E();
        O0();
        qg qgVar = this.E2;
        if (qgVar != null) {
            qgVar.setVisibility(8);
        }
        RecordCircle recordCircle = this.D2;
        if (recordCircle != null) {
            recordCircle.g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009d, code lost:
    
        if (org.telegram.messenger.mp.u1(r16.R).h7.getBoolean("show_gift_for_" + r7.a(), true) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d1, code lost:
    
        if (org.telegram.messenger.mp.u1(r16.R).h7.getBoolean(java.util.Calendar.getInstance().get(1) + "show_gift_for_" + r7.a(), true) == false) goto L37;
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
    public final void r2(boolean z10) {
        boolean z11;
        hi.u3 u3Var;
        TLRPC.UserFull userFull = getParentFragment() == null ? null : getParentFragment().s8;
        TLRPC.UserFull d2 = org.telegram.messenger.mp.u1(this.R).d2(org.telegram.messenger.i10.i(this.R).e());
        TLRPC.User j3 = getParentFragment() == null ? null : getParentFragment().j();
        boolean z12 = org.telegram.messenger.mp.u1(this.R).k7;
        int i7 = 0;
        org.telegram.ui.bn bnVar = this.F3;
        int i10 = 1;
        if (!z12 && getParentFragment() != null && j3 != null) {
            boolean z13 = org.telegram.messenger.s2.a;
            if ((!org.telegram.messenger.n10.C(j3) || (d2 != null && d2.display_gifts_button)) && !org.telegram.messenger.n10.u(j3) && !org.telegram.messenger.mp.L2(j3) && userFull != null) {
                if (!j3.premium && org.telegram.messenger.mp.u1(this.R).y7 && org.telegram.messenger.mp.u1(this.R).z7) {
                }
                if (org.telegram.messenger.v1.e(userFull.birthday)) {
                }
                if (!userFull.display_gifts_button) {
                    if (d2 != null) {
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
                if (bnVar != null && bnVar.g4 == 0) {
                    z11 = true;
                    if (!z11 && (u3Var = this.M) != null) {
                        u3Var.f(true);
                    }
                    if (z11 && this.A2 == null) {
                        return;
                    }
                    if (this.A2 == null && bnVar != null) {
                        je jeVar = new je(this, getContext(), i10);
                        this.A2 = jeVar;
                        jeVar.setImageResource(R.drawable.msg_input_gift);
                        je jeVar2 = this.A2;
                        int i11 = org.telegram.ui.ActionBar.n6.Nl;
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        org.telegram.ui.ActionBar.i6 i6Var = this.M4;
                        org.telegram.ui.ActionBar.u6.s(jeVar2, i11, i6Var, mode);
                        this.A2.setVisibility(8);
                        this.A2.setContentDescription(org.telegram.messenger.gd.N0(2131749507, null));
                        this.A2.setScaleType(ImageView.ScaleType.CENTER);
                        je jeVar3 = this.A2;
                        int i12 = org.telegram.ui.ActionBar.n6.i6;
                        org.telegram.ui.ActionBar.u6.Q(jeVar3, org.telegram.ui.ActionBar.n6.h0(G0(i12), 1, -1), null, org.telegram.ui.ActionBar.u6.M(i12), i6Var);
                        this.f2.addView(this.A2, 0, c8.na.e(44, 44, 21));
                        this.A2.setOnClickListener(new id(this, 13));
                    }
                    org.telegram.messenger.g0.W3(this.A2, z11, 1.0f, true, 1.0f, z10, new pd(this, i7));
                    if (z11) {
                        return;
                    }
                    H();
                    return;
                }
            }
        }
        z11 = false;
        if (!z11) {
            u3Var.f(true);
        }
        if (z11) {
        }
        if (this.A2 == null) {
            je jeVar4 = new je(this, getContext(), i10);
            this.A2 = jeVar4;
            jeVar4.setImageResource(R.drawable.msg_input_gift);
            je jeVar22 = this.A2;
            int i112 = org.telegram.ui.ActionBar.n6.Nl;
            PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.i6 i6Var2 = this.M4;
            org.telegram.ui.ActionBar.u6.s(jeVar22, i112, i6Var2, mode2);
            this.A2.setVisibility(8);
            this.A2.setContentDescription(org.telegram.messenger.gd.N0(2131749507, null));
            this.A2.setScaleType(ImageView.ScaleType.CENTER);
            je jeVar32 = this.A2;
            int i122 = org.telegram.ui.ActionBar.n6.i6;
            org.telegram.ui.ActionBar.u6.Q(jeVar32, org.telegram.ui.ActionBar.n6.h0(G0(i122), 1, -1), null, org.telegram.ui.ActionBar.u6.M(i122), i6Var2);
            this.f2.addView(this.A2, 0, c8.na.e(44, 44, 21));
            this.A2.setOnClickListener(new id(this, 13));
        }
        org.telegram.messenger.g0.W3(this.A2, z11, 1.0f, true, 1.0f, z10, new pd(this, i7));
        if (z11) {
        }
    }

    public final boolean s0() {
        if (!DictationAsr.G() || this.F3 == null || this.F0 == null) {
            return false;
        }
        return !(this.U2 && this.d1) && this.z0;
    }

    public final void s1() {
        if (this.K1 || this.T1 != null) {
            org.telegram.messenger.g0.r(this.X1);
            ValueAnimator valueAnimator = this.W1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.W1 = null;
            }
            yh.a aVar = this.T1;
            if (aVar != null) {
                if (aVar.c.hasFocus()) {
                    org.telegram.messenger.g0.v1(this.T1.c);
                    this.T1.c.clearFocus();
                }
                this.T1.setCollapsing(true);
            }
            this.U1 = false;
            this.R5 = false;
            M1(false);
            w(0.0f);
            zi0 zi0Var = this.i1;
            if (zi0Var != null) {
                zi0Var.setVisibility(8);
            }
            qh0 qh0Var = this.h1;
            if (qh0Var != null) {
                qh0Var.setVisibility(0);
            }
            qg qgVar = this.E2;
            if (qgVar != null) {
                this.S5 = 0.0f;
                qgVar.setTranslationY(this.T5 + this.m7);
            }
            se seVar = this.K0;
            if (seVar != null) {
                seVar.setIconDimmed(false);
            }
        }
    }

    public final void s2() {
        hf hfVar = this.F0;
        if (hfVar != null) {
            hfVar.setTranslationX(this.I + this.H);
        }
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.i1 i1Var) {
        this.V = i1Var;
    }

    public void setAnimatedTop(int i7) {
        this.J2 = i7;
    }

    public void setBotInfo(a0.h hVar) {
        A1(hVar, true);
    }

    public void setBotWebViewButtonOffsetX(float f10) {
        this.R0.setTranslationX(f10);
        if (this.F0 != null) {
            this.H = f10;
            s2();
        }
        this.h2.setTranslationX(this.E + this.y + f10);
        this.c1.setTranslationX(f10);
        je jeVar = this.n2;
        if (jeVar != null) {
            jeVar.setTranslationX(f10);
        }
    }

    public void setButtons(org.telegram.messenger.fj fjVar) {
        C1(fjVar, true, true);
    }

    public void setCaption(String str) {
        hf hfVar = this.F0;
        if (hfVar != null) {
            hfVar.setCaption(str);
            P(true);
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.T2 = chatFull;
        eg egVar = this.V0;
        if (egVar != null) {
            egVar.setChatInfo(chatFull);
        }
        ug ugVar = this.G0;
        if (ugVar != null) {
            ugVar.b = chatFull != null && chatFull.boosts_unrestrict > 0;
            ugVar.invalidate();
        }
        if (org.telegram.messenger.v3.i0(chatFull)) {
            return;
        }
        setSlowModeTimer(chatFull.slowmode_next_send_date);
    }

    public void setComposeShadowAlpha(float f10) {
        this.c6 = f10;
        invalidate();
    }

    public void setCustomWindowView(View view) {
        this.j6 = view;
        this.F0.setWindowView(view);
    }

    public void setDelegate(mg mgVar) {
        this.P3 = mgVar;
    }

    public void setEditingBusinessLink(TL_account.TL_businessChatLink tL_businessChatLink) {
        String str;
        this.R2 = tL_businessChatLink;
        p2(false);
        if (this.R2 != null) {
            Y(true);
            this.v2.setOnClickListener(new id(this, 7));
            this.v2.setContentDescription(org.telegram.messenger.gd.N0(2131751342, null));
            this.v2.setVisibility(0);
            this.v2.setScaleX(0.1f);
            this.v2.setScaleY(0.1f);
            this.v2.setAlpha(0.0f);
            this.v2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(kr.f).start();
            this.d0 = org.telegram.messenger.mp.u1(this.S.a).w1();
            hf hfVar = this.F0;
            TextPaint paint = hfVar != null ? hfVar.getPaint() : null;
            if (paint == null) {
                paint = new TextPaint();
                paint.setTextSize(org.telegram.messenger.g0.L(18.0f));
            }
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            ArrayList<TLRPC.MessageEntity> arrayList = this.R2.entities;
            if (arrayList == null || (str = tL_businessChatLink.message) == null) {
                String str2 = tL_businessChatLink.message;
                if (str2 != null) {
                    setFieldText(str2);
                }
            } else {
                setFieldText(s(fontMetricsInt, str, arrayList));
            }
            this.S2 = C();
            y1(false, false, false);
            getSendButtonInternal().setVisibility(8);
            setSlowModeButtonVisible(false);
            this.Q0.setVisibility(8);
            this.a1.setVisibility(8);
            org.telegram.ui.b61 b61Var = this.f2;
            if (b61Var != null) {
                b61Var.setVisibility(8);
            }
            je jeVar = this.h2;
            if (jeVar != null) {
                this.l2 = 0.0f;
                jeVar.setAlpha(0.0f);
                jeVar.setScaleX(0.5f);
                jeVar.setScaleY(0.5f);
            }
            this.q2.setVisibility(8);
            te teVar = this.z2;
            if (teVar != null) {
                teVar.setVisibility(8);
            }
        }
    }

    public void setEffectId(long j3) {
        this.P6 = j3;
        se seVar = this.K0;
        if (seVar != null) {
            seVar.setEffect(j3);
        }
    }

    public void setExitTransition(float f10) {
        this.c5 = f10;
        RecordCircle recordCircle = this.D2;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setFieldFocused(boolean z10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.E3.getSystemService("accessibility");
        if (this.F0 == null || accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        if (z10 && org.telegram.ui.ActionBar.g2.hasSheets(this.F3)) {
            z10 = false;
        }
        if (z10) {
            if (this.H2 != 0 || this.F0.isFocused()) {
                return;
            }
            dd ddVar = new dd(this, 16);
            this.I2 = ddVar;
            org.telegram.messenger.g0.h3(ddVar, 600L);
            return;
        }
        hf hfVar = this.F0;
        if (hfVar == null || !hfVar.isFocused()) {
            return;
        }
        if (!this.p3 || this.Z2) {
            this.F0.clearFocus();
        }
    }

    @Override // org.telegram.ui.Components.xw0
    public void setFieldText(CharSequence charSequence) {
        I1(charSequence, false);
    }

    public void setInAppInsetsController(rh.e eVar) {
        this.e7 = eVar;
    }

    public void setLockAnimatedTranslation(float f10) {
        this.b5 = f10;
        RecordCircle recordCircle = this.D2;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setOnSendButtonLongClick(View.OnLongClickListener onLongClickListener) {
        if (onLongClickListener == null) {
            onLongClickListener = new rd(this, 0);
        }
        this.K0.setOnLongClickListener(onLongClickListener);
    }

    public void setOverrideHint(CharSequence charSequence) {
        N1(charSequence, false);
    }

    public void setOverrideKeyboardAnimation(boolean z10) {
        this.w = z10;
    }

    public void setRichDraftPreview(TL_iv.RichMessage richMessage) {
        if (this.s2 == null) {
            return;
        }
        org.telegram.messenger.mp.u1(this.R);
        boolean z10 = org.telegram.messenger.s2.a;
        this.u2 = richMessage;
        w2();
    }

    public void setRoundVideoUiFrameClockActive(boolean z10) {
        if (this.Z1 == z10) {
            return;
        }
        this.Z1 = z10;
        vg vgVar = this.Z0;
        if (vgVar != null) {
            vgVar.setExternalFrameClock(z10);
        }
        sg sgVar = this.b2;
        if (sgVar != null) {
            sgVar.f = z10;
            System.currentTimeMillis();
            sgVar.h = -1L;
            sgVar.invalidate();
        }
        SlideTextView slideTextView = this.a2;
        if (slideTextView != null) {
            slideTextView.H = z10;
            System.currentTimeMillis();
            slideTextView.invalidate();
        }
    }

    public void setSelection(int i7) {
        hf hfVar = this.F0;
        if (hfVar == null) {
            return;
        }
        hfVar.setSelection(i7, hfVar.length());
    }

    public void setSideButtonsForAttach(lh.h hVar) {
        org.telegram.ui.b61 b61Var;
        lh.h hVar2 = this.f7;
        if (hVar2 == hVar) {
            return;
        }
        if (hVar2 != null) {
            hVar2.e(0, false, true);
        }
        this.f7 = hVar;
        je jeVar = this.h2;
        if (jeVar == null || (b61Var = this.f2) == null || b61Var.getVisibility() == 0) {
            return;
        }
        boolean z10 = hVar != null && Q0();
        boolean z11 = (hVar == null || z10) ? false : true;
        if (hVar != null) {
            hVar.e(0, z10 && !E2(), true);
        }
        ViewPropertyAnimator viewPropertyAnimator = this.g2;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator animate = jeVar.animate();
        float f10 = z11 ? 1.0f : 0.0f;
        this.l2 = f10;
        ViewPropertyAnimator duration = animate.alpha(f10).scaleX(z11 ? 1.0f : 0.5f).scaleY(z11 ? 1.0f : 0.5f).setInterpolator(kr.h).setDuration(320L);
        this.g2 = duration;
        duration.start();
    }

    public void setSlideToCancelProgress(float f10) {
        this.Z4 = f10;
        float measuredWidth = getMeasuredWidth() * 0.35f;
        if (measuredWidth > org.telegram.messenger.g0.L(140.0f)) {
            measuredWidth = org.telegram.messenger.g0.L(140.0f);
        }
        this.j5 = (int) ((1.0f - this.Z4) * (-measuredWidth));
        RecordCircle recordCircle = this.D2;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setSlowModeTimer(int i7) {
        this.H0 = i7;
        C2();
    }

    public void setSnapAnimationProgress(float f10) {
        this.d5 = f10;
        invalidate();
    }

    public void setTextTransitionIsRunning(boolean z10) {
        this.i0 = z10;
        this.q2.invalidate();
    }

    public void setViewParentForEmoji(ViewGroup viewGroup) {
        this.d2 = viewGroup;
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        boolean z10 = i7 == 0;
        this.i6 = z10;
        hf hfVar = this.F0;
        if (hfVar != null) {
            hfVar.setEnabled(z10);
        }
    }

    public void setVoiceDraft(org.telegram.messenger.mi miVar) {
        org.telegram.messenger.bw bwVar;
        TL_stories.StoryItem storyItem;
        File file;
        String str;
        if (miVar == null) {
            return;
        }
        boolean z10 = miVar.g;
        this.P = z10;
        qg qgVar = this.E2;
        if (qgVar != null) {
            qgVar.E.d(1, z10, true);
        }
        mg mgVar = this.P3;
        if (mgVar != null) {
            storyItem = mgVar.Y0();
            bwVar = null;
        } else {
            bwVar = null;
            storyItem = null;
        }
        MediaController B = MediaController.B();
        int i7 = this.R;
        long j3 = this.G3;
        org.telegram.messenger.fj fjVar = this.J3;
        org.telegram.messenger.fj threadMessage = getThreadMessage();
        int i10 = this.w3;
        org.telegram.ui.bn bnVar = this.F3;
        if (bnVar != null) {
            bwVar = bnVar.Y8();
        }
        long sendMonoForumPeerId = getSendMonoForumPeerId();
        org.telegram.messenger.kj sendMessageSuggestionParams = getSendMessageSuggestionParams();
        org.telegram.messenger.q5 q5Var = B.N1;
        if (B.I1) {
            e0.g gVar = B.G1;
            if (gVar != null && gVar.e() && B.g1 != null && (file = B.k1) != null && (str = miVar.a) != null && str.equals(file.getAbsolutePath())) {
                B.h1 = i10;
                B.r1 = fjVar;
                B.s1 = threadMessage;
                B.t1 = storyItem;
                B.u1 = bwVar;
                B.p1 = sendMonoForumPeerId;
                B.q1 = sendMessageSuggestionParams;
                org.telegram.messenger.ks.f(B.i1).k(org.telegram.messenger.ks.o2, new Object[0]);
                org.telegram.messenger.ks.f(B.i1).k(org.telegram.messenger.ks.s2, Integer.valueOf(B.h1), B.g1, B.k1.getAbsolutePath(), Boolean.TRUE, Float.valueOf(miVar.h), Float.valueOf(miVar.i));
                return;
            }
            if (!B.X()) {
                return;
            }
        }
        B.y0 = false;
        B.Y(true);
        q5Var.a(B.M1);
        q5Var.c(new org.telegram.messenger.ud(B, i10, miVar, i7, j3, sendMonoForumPeerId, sendMessageSuggestionParams, threadMessage, fjVar, storyItem));
    }

    public final void t(boolean z10) {
        nh0 nh0Var;
        int i7 = 1;
        boolean z11 = (this.d1 || this.i1 == null) ? false : true;
        this.R5 = z11;
        boolean z12 = this.K1;
        td tdVar = this.X1;
        if (z12 == z11 && (!z11 || this.T1 != null)) {
            if (z11) {
                U1(false, false);
                M1(z10);
                org.telegram.messenger.g0.r(tdVar);
                org.telegram.messenger.g0.h3(tdVar, 700L);
                return;
            }
            return;
        }
        this.K1 = z11;
        this.i1.setNewStyle(z11);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.i1.getLayoutParams();
        layoutParams.height = org.telegram.messenger.g0.L(32.0f);
        layoutParams.gravity = z11 ? 83 : 19;
        layoutParams.bottomMargin = z11 ? org.telegram.messenger.g0.L(6.0f) : 0;
        layoutParams.leftMargin = org.telegram.messenger.g0.L(z11 ? 45.0f : 44.0f);
        layoutParams.rightMargin = org.telegram.messenger.g0.L(z11 ? 5.0f : 4.0f);
        this.i1.setLayoutParams(layoutParams);
        qh0 qh0Var = this.h1;
        if (qh0Var != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) qh0Var.getLayoutParams();
            layoutParams2.gravity = z11 ? 83 : 51;
            this.h1.setLayoutParams(layoutParams2);
            if (z11) {
                if (this.A5 == null) {
                    nh0 nh0Var2 = new nh0(R.raw.chat_audio_record_delete_outline, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), false, null);
                    this.A5 = nh0Var2;
                    nh0Var2.J(true);
                }
                nh0Var = this.A5;
            } else {
                nh0Var = this.B5;
            }
            if (nh0Var != null && this.h1.getAnimatedDrawable() != nh0Var) {
                this.h1.setAnimation(nh0Var);
                nh0Var.p0 = nh0Var != this.A5;
                v2();
                this.h1.setProgress(0.0f);
            }
        }
        this.f1.setClipChildren(!z11);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f1.getLayoutParams();
        layoutParams3.height = z11 ? -2 : org.telegram.messenger.g0.L(44.0f);
        this.f1.setLayoutParams(layoutParams3);
        this.f1.setMinimumHeight(z11 ? org.telegram.messenger.g0.L(44.0f) : 0);
        if (!z11) {
            M1(false);
            this.i1.setNewStyleDelegate(null);
            yh.a aVar = this.T1;
            if (aVar != null) {
                this.f1.removeView(aVar);
                this.T1 = null;
                return;
            }
            return;
        }
        this.i1.setNewStyleDelegate(new ke(this, i7));
        if (this.T1 == null) {
            yh.a aVar2 = new yh.a(getContext(), this.M4, new le(this, i7));
            this.T1 = aVar2;
            this.f1.addView(aVar2, c8.na.d(-1, -2.0f, 80, 48.0f, 0.0f, 0.0f, 0.0f));
        }
        U1(false, false);
        M1(z10);
        org.telegram.messenger.g0.r(tdVar);
        org.telegram.messenger.g0.h3(tdVar, 700L);
    }

    public final boolean t0(TL_keyboard.KeyboardButtonProto keyboardButtonProto, org.telegram.messenger.fj fjVar, org.telegram.messenger.fj fjVar2, org.telegram.ui.gi giVar) {
        org.telegram.ui.bn bnVar;
        int i7;
        int i10 = 0;
        if (keyboardButtonProto != null && fjVar2 != null && ((bnVar = this.F3) == null || bnVar.g4 != 5)) {
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = (TL_keyboard.TL_inlineButtonTypeUserProfile) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class);
            TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) cg.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class);
            TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class);
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (tL_inlineButtonTypeCopy != null) {
                org.telegram.messenger.g0.g(tL_inlineButtonTypeCopy.copy_text);
                kc.b0(bnVar).i(org.telegram.messenger.gd.a0(null, null, 2131750872, tL_inlineButtonTypeCopy.copy_text)).k(true);
                return true;
            }
            if (keyboardButtonProto instanceof TL_keyboard.TL_keyboardButton) {
                TL_keyboard.TL_keyboardButton tL_keyboardButton = (TL_keyboard.TL_keyboardButton) keyboardButtonProto;
                if (tL_keyboardButton.type instanceof TL_keyboard.TL_buttonTypeDefault) {
                    org.telegram.messenger.xy b10 = org.telegram.messenger.xy.b(tL_keyboardButton.text, this.G3, fjVar, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                    b10.K = bnVar != null ? bnVar.Y8() : null;
                    b10.O = this.P6;
                    this.P6 = 0L;
                    this.K0.setEffect(0L);
                    org.telegram.messenger.zy.C(this.R).r0(b10);
                    return true;
                }
            }
            Activity activity = this.E3;
            if (tL_inlineButtonTypeUrl != null) {
                if (vf.c.z(tL_inlineButtonTypeUrl.url)) {
                    vf.c.r(activity, Uri.parse(tL_inlineButtonTypeUrl.url), true, true, giVar);
                    return true;
                }
                b5.o0(this.F3, tL_inlineButtonTypeUrl.url, false, true, true, false, giVar, null, this.M4);
                return true;
            }
            if (cg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPhone.class)) {
                bnVar.Yb(2, fjVar2);
                return true;
            }
            if (!cg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class)) {
                if (cg.c.b(keyboardButtonProto)) {
                    TLRPC.Message message = fjVar2.k;
                    long j3 = message.via_bot_id;
                    if (j3 == 0) {
                        j3 = message.from_id.user_id;
                    }
                    long j10 = j3;
                    cg cgVar = new cg(this, fjVar2, j10, keyboardButtonProto, fjVar, org.telegram.messenger.mp.u1(this.R).c2(Long.valueOf(j3)));
                    if (org.telegram.messenger.c6.j(this.R, j10) || org.telegram.messenger.mp.u1(this.R).Z6.contains(Long.valueOf(j10))) {
                        cgVar.run();
                        return true;
                    }
                    b5.n(bnVar, org.telegram.messenger.mp.u1(this.R).c2(Long.valueOf(this.G3)), new bi.s2(this, cgVar, j10, 21), null);
                    return true;
                }
                if (cg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    String N0 = org.telegram.messenger.gd.N0(2131745227, "ShareYouLocationTitle");
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                    t1Var.S = N0;
                    t1Var.U = org.telegram.messenger.gd.N0(2131745229, "ShareYouLocationInfo");
                    alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, "OK"), new a3.h(this, fjVar2, keyboardButtonProto, 22));
                    alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, "Cancel"), null);
                    bnVar.showDialog(t1Var);
                    return true;
                }
                if (cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
                    org.telegram.messenger.zy.C(this.R).n0(true, fjVar2, keyboardButtonProto, null, null, bnVar);
                    return true;
                }
                if (tL_inlineButtonTypeSwitchInline != null) {
                    if (!bnVar.eb(tL_inlineButtonTypeSwitchInline)) {
                        if (!tL_inlineButtonTypeSwitchInline.same_peer) {
                            Bundle l10 = org.telegram.ui.Cells.c0.l(1, "onlySelect", "dialogsType", true);
                            if ((tL_inlineButtonTypeSwitchInline.flags & 2) != 0) {
                                l10.putBoolean("allowGroups", false);
                                l10.putBoolean("allowMegagroups", false);
                                l10.putBoolean("allowLegacyGroups", false);
                                l10.putBoolean("allowUsers", false);
                                l10.putBoolean("allowChannels", false);
                                l10.putBoolean("allowBots", false);
                                ArrayList<TLRPC.InlineQueryPeerType> arrayList = tL_inlineButtonTypeSwitchInline.peer_types;
                                int size = arrayList.size();
                                while (i10 < size) {
                                    TLRPC.InlineQueryPeerType inlineQueryPeerType = arrayList.get(i10);
                                    i10++;
                                    TLRPC.InlineQueryPeerType inlineQueryPeerType2 = inlineQueryPeerType;
                                    if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypePM) {
                                        l10.putBoolean("allowUsers", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBotPM) {
                                        l10.putBoolean("allowBots", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBroadcast) {
                                        l10.putBoolean("allowChannels", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeChat) {
                                        l10.putBoolean("allowLegacyGroups", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeMegagroup) {
                                        l10.putBoolean("allowMegagroups", true);
                                    }
                                }
                            }
                            org.telegram.ui.bx bxVar = new org.telegram.ui.bx(l10);
                            bxVar.E2 = new a3.h(this, fjVar2, tL_inlineButtonTypeSwitchInline, 23);
                            bnVar.presentFragment(bxVar);
                            return true;
                        }
                        TLRPC.Message message2 = fjVar2.k;
                        long j11 = message2.from_id.user_id;
                        long j12 = message2.via_bot_id;
                        if (j12 != 0) {
                            j11 = j12;
                        }
                        TLRPC.User c22 = org.telegram.messenger.mp.u1(this.S.a).c2(Long.valueOf(j11));
                        if (c22 != null) {
                            setFieldText("@" + org.telegram.messenger.n10.o(c22) + " " + tL_inlineButtonTypeSwitchInline.query);
                            return true;
                        }
                    }
                } else if (tL_inlineButtonTypeUserProfile != null) {
                    if (org.telegram.messenger.mp.u1(this.R).c2(Long.valueOf(tL_inlineButtonTypeUserProfile.user_id)) != null) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", tL_inlineButtonTypeUserProfile.user_id);
                        bnVar.presentFragment(new ProfileActivity(bundle, null));
                        return true;
                    }
                } else if (tL_buttonTypeRequestPeer != null) {
                    TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
                    if (requestPeerType == null || fjVar2.k == null) {
                        org.telegram.messenger.a8.d("button.peer_type is null");
                        return true;
                    }
                    if (!(requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot)) {
                        if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i7 = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                            TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                            Boolean bool = tL_requestPeerTypeUser.bot;
                            Boolean bool2 = tL_requestPeerTypeUser.premium;
                            ed edVar = new ed(this, fjVar2, tL_buttonTypeRequestPeer);
                            org.telegram.ui.tg0 tg0Var = org.telegram.ui.tg0.q2;
                            org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                            if (Q == null || org.telegram.ui.tg0.q2 != null) {
                                return false;
                            }
                            org.telegram.ui.tg0 tg0Var2 = new org.telegram.ui.tg0(Q, i7, bool, bool2, edVar);
                            tg0Var2.show();
                            org.telegram.ui.tg0.q2 = tg0Var2;
                            return false;
                        }
                        Bundle l11 = org.telegram.ui.Cells.c0.l(15, "onlySelect", "dialogsType", true);
                        TLRPC.Message message3 = fjVar2.k;
                        if (message3 != null) {
                            TLRPC.Peer peer = message3.from_id;
                            if (peer instanceof TLRPC.TL_peerUser) {
                                l11.putLong("requestPeerBotId", peer.user_id);
                            }
                        }
                        try {
                            SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                            tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                            l11.putByteArray("requestPeerType", serializedData.toByteArray());
                            serializedData.cleanup();
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        org.telegram.ui.bx bxVar2 = new org.telegram.ui.bx(l11);
                        bxVar2.E2 = new ed(this, fjVar2, tL_buttonTypeRequestPeer);
                        bnVar.presentFragment(bxVar2);
                        return false;
                    }
                    TLRPC.User j13 = getParentFragment() != null ? getParentFragment().j() : org.telegram.messenger.mp.u1(this.R).c2(Long.valueOf(this.G3));
                    if (j13 != null) {
                        yq.e(getContext(), this.R, j13, (TLRPC.TL_requestPeerTypeCreateBot) tL_buttonTypeRequestPeer.peer_type, false, new bi.o2(this, fjVar2, tL_buttonTypeRequestPeer, j13, 6), this.M4, null);
                        return false;
                    }
                }
                return true;
            }
            TL_keyboard.TL_buttonTypeRequestPoll tL_buttonTypeRequestPoll = (TL_keyboard.TL_buttonTypeRequestPoll) cg.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class);
            Boolean valueOf = (tL_buttonTypeRequestPoll.flags & 1) != 0 ? Boolean.valueOf(tL_buttonTypeRequestPoll.quiz) : null;
            bnVar.Aa();
            fi.n2 n2Var = bnVar.Y1;
            if (n2Var != null) {
                n2Var.Q2 = false;
                n2Var.v3.setVisibility(8);
                n2Var.I1(false, valueOf);
                return false;
            }
        }
        return false;
    }

    public final void t1() {
        zi0 zi0Var = this.i1;
        if (zi0Var != null) {
            zi0Var.setPlaying(false);
        }
        if (this.U3 != null) {
            CameraController.getInstance().cancelOnInitRunnable(this.x4);
            this.P3.o2(2, 0, this.P ? Integer.MAX_VALUE : 0, this.P6, 0L, true);
            this.P6 = 0L;
            this.K0.setEffect(0L);
        } else {
            org.telegram.messenger.fj fjVar = MediaController.B().v0;
            if (fjVar != null && fjVar == this.T3) {
                MediaController.B().q(true, true, false, false);
            }
        }
        if (this.S3 != null) {
            if (org.telegram.messenger.s2.a) {
                p5.c.s(this.S3, new StringBuilder("delete file "));
            }
            new File(this.S3).delete();
        }
        MediaController.B().n(true);
        org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(this.R);
        long j3 = this.G3;
        org.telegram.ui.bn bnVar = this.F3;
        d02.F1(j3, (bnVar == null || !bnVar.x4) ? 0L : bnVar.b(), null);
        MediaController.B().B0(0, 0, false, false);
        this.Y1 = 0L;
        N0(false);
        P(true);
    }

    public final void t2(TLRPC.Chat chat, TLRPC.UserFull userFull) {
        eg egVar;
        this.B0 = false;
        boolean z10 = true;
        this.b = true;
        this.A0 = true;
        this.y0 = true;
        this.z0 = true;
        if (chat != null) {
            this.b1 = (org.telegram.messenger.v3.v(chat) || (org.telegram.messenger.v3.s(chat) && this.U2)) ? false : true;
            this.b = org.telegram.messenger.v3.t(chat);
            boolean q10 = org.telegram.messenger.v3.q(chat);
            this.A0 = q10;
            boolean z11 = (this.b || q10) ? false : true;
            this.B0 = z11;
            this.n = z11 ? 0.5f : 1.0f;
            o2();
            if (!this.B0 && (egVar = this.V0) != null) {
                egVar.L(-this.G3, !this.A0, !this.b);
            }
            this.y0 = org.telegram.messenger.v3.s(chat);
            this.z0 = org.telegram.messenger.v3.v(chat);
        } else if (userFull != null) {
            this.b1 = userFull.voice_messages_forbidden;
            this.L = userFull;
        }
        if (chat != null || userFull != null) {
            this.n1 = this.b1;
            this.k1 = chat != null ? !org.telegram.messenger.v3.v(chat) : userFull.voice_messages_forbidden;
            this.o1 = chat != null && org.telegram.messenger.v3.s(chat) && this.U2;
        }
        boolean z12 = this.k1 && this.A0 && !this.p7 && a8.i1.a(getContext());
        this.l1 = z12;
        this.b1 = this.n1 && !z12;
        j0();
        if (this.k1 && !this.m1) {
            this.m1 = true;
            DictationAsr.l(this.q1);
            if (!ai.h1.h()) {
                ai.h1.j();
            }
        }
        float f10 = this.b1 ? 0.5f : 1.0f;
        pe peVar = this.a1;
        peVar.setAlpha(f10);
        peVar.invalidate();
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.b1 ? G0(org.telegram.ui.ActionBar.n6.Nl) : -1, PorterDuff.Mode.SRC_IN);
        qe qeVar = this.c1;
        qeVar.setColorFilter(porterDuffColorFilter);
        qeVar.invalidate();
        p2(false);
        boolean z13 = this.d1;
        if (!this.y0 && z13) {
            z13 = false;
        }
        if (this.l1 && this.o1) {
            z13 = org.telegram.messenger.mp.g1().getBoolean("currentModeVideo", false);
        }
        if (this.z0 || z13 || this.l1) {
            z10 = z13;
        } else if (!this.U2) {
            z10 = false;
        }
        if (this.l1 && !this.o1) {
            z10 = false;
        }
        O1(z10, false);
        sg sgVar = this.b2;
        if (sgVar != null) {
            sgVar.f(i0());
        }
        qeVar.invalidate();
    }

    public final void u(float f10) {
        float i7 = Utilities.i((f10 - 0.1f) / 0.9f, 1.0f, 0.0f);
        this.n = K2(0.12f, 0.6f, f10) * (this.B0 ? 0.5f : 1.0f);
        float i10 = Utilities.i(i7, 1.0f, 0.0f) - 1.0f;
        this.h = org.telegram.messenger.g0.T1(0.55f, 1.0f, com.google.android.gms.internal.vision.e2.x(i10, 1.1f, i10, (2.1f * i10 * i10 * i10) + 1.0f));
        o2();
        this.R0.setRotation((1.0f - kr.h.getInterpolation(i7)) * (-20.0f));
    }

    public final void u0() {
        org.telegram.messenger.jj jjVar;
        org.telegram.messenger.kj b10;
        TLRPC.Chat chat;
        int i7;
        org.telegram.messenger.kj b11;
        org.telegram.messenger.fj fjVar = this.P2;
        if (fjVar == null) {
            return;
        }
        boolean p52 = fjVar.p5();
        org.telegram.ui.bn bnVar = this.F3;
        if (p52 && !org.telegram.messenger.v3.z(this.R, 24, org.telegram.messenger.fj.B0(this.P2.k))) {
            if (bnVar == null || (b11 = bnVar.y5) == null) {
                b11 = org.telegram.messenger.kj.b(this.P2.k.suggested_post);
            }
            if (!di.y8.S(this.R, b11.a)) {
                if (bnVar != null) {
                    bnVar.Ac(b11);
                    return;
                }
                return;
            }
        }
        if (this.d0 - this.e0 < 0) {
            NumberTextView numberTextView = this.c0;
            if (numberTextView != null) {
                org.telegram.messenger.g0.E3(3.5f, numberTextView, null);
                try {
                    this.c0.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
            }
            if (org.telegram.messenger.mp.u1(this.R).K3() || org.telegram.messenger.mp.u1(this.R).X4 <= this.e0) {
                return;
            }
            W1();
            return;
        }
        if (this.H2 != 0) {
            R1(0, true);
            this.V0.t(false);
            if (this.p4) {
                S1(false, true, false, true);
                this.b4 = true;
                org.telegram.messenger.g0.h3(new td(this, 15), 200L);
            }
        }
        hf hfVar = this.F0;
        CharSequence textToUse = hfVar == null ? "" : hfVar.getTextToUse();
        org.telegram.messenger.fj fjVar2 = this.P2;
        if (fjVar2 == null || fjVar2.D != 19) {
            textToUse = org.telegram.messenger.g0.n1(textToUse);
        }
        CharSequence[] charSequenceArr = {textToUse};
        if (TextUtils.isEmpty(charSequenceArr[0])) {
            TLRPC.MessageMedia messageMedia = this.P2.k.media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) || (messageMedia instanceof TLRPC.TL_messageMediaEmpty) || messageMedia == null) {
                org.telegram.messenger.g0.E3(-3.0f, this.F0, null);
                org.telegram.messenger.q2.E.a();
                return;
            }
        }
        ArrayList Y = org.telegram.messenger.ri.d0(this.R).Y(charSequenceArr, g2(), true);
        if (!TextUtils.equals(charSequenceArr[0], this.P2.v) || ((Y != null && !Y.isEmpty()) || !this.P2.k.entities.isEmpty() || (this.P2.k.media instanceof TLRPC.TL_messageMediaWebPage))) {
            org.telegram.messenger.fj fjVar3 = this.P2;
            fjVar3.y1 = charSequenceArr[0];
            fjVar3.z1 = Y;
            fjVar3.A1 = this.O3;
            if (bnVar != null && (chat = bnVar.e) != null && (((i7 = fjVar3.D) == 0 || i7 == 19) && !org.telegram.messenger.v3.m(chat))) {
                org.telegram.messenger.fj fjVar4 = this.P2;
                fjVar4.A1 = false;
                TLRPC.Message message = fjVar4.k;
                message.flags &= -513;
                message.media = null;
            } else if (bnVar == null || (jjVar = bnVar.x5) == null) {
                org.telegram.messenger.fj fjVar5 = this.P2;
                fjVar5.A1 = false;
                int i10 = fjVar5.D;
                if (i10 == 0 || i10 == 19) {
                    TLRPC.Message message2 = fjVar5.k;
                    message2.flags |= 512;
                    message2.media = new TLRPC.TL_messageMediaEmpty();
                }
            } else {
                if (bnVar.Y5 instanceof TLRPC.TL_webPagePending) {
                    org.telegram.messenger.fj fjVar6 = this.P2;
                    fjVar6.A1 = false;
                    int i11 = fjVar6.D;
                    if (i11 == 0 || i11 == 19) {
                        fjVar6.k.media = new TLRPC.TL_messageMediaEmpty();
                        this.P2.k.flags |= 512;
                    }
                } else if (jjVar.v != null) {
                    org.telegram.messenger.fj fjVar7 = this.P2;
                    fjVar7.A1 = false;
                    TLRPC.Message message3 = fjVar7.k;
                    message3.flags |= 512;
                    message3.media = new TLRPC.TL_messageMediaWebPage();
                    this.P2.k.media.webpage = bnVar.x5.v;
                } else {
                    org.telegram.messenger.fj fjVar8 = this.P2;
                    fjVar8.A1 = false;
                    int i12 = fjVar8.D;
                    if (i12 == 0 || i12 == 19) {
                        TLRPC.Message message4 = fjVar8.k;
                        message4.flags |= 512;
                        message4.media = new TLRPC.TL_messageMediaEmpty();
                    }
                }
                TLRPC.Message message5 = this.P2.k;
                org.telegram.messenger.jj jjVar2 = bnVar.x5;
                message5.invert_media = jjVar2.r;
                if (jjVar2.o) {
                    TLRPC.MessageMedia messageMedia2 = message5.media;
                    if (messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) {
                        boolean z10 = jjVar2.q;
                        messageMedia2.force_small_media = z10;
                        messageMedia2.force_large_media = true ^ z10;
                    }
                }
            }
            if (this.P2.p5()) {
                org.telegram.messenger.xy a10 = org.telegram.messenger.xy.a(org.telegram.messenger.fj.B0(this.P2.k), this.P2.y1.toString());
                if (bnVar == null || (b10 = bnVar.y5) == null) {
                    b10 = org.telegram.messenger.kj.b(this.P2.k.suggested_post);
                }
                a10.T = b10;
                a10.R = org.telegram.messenger.n5.o(this.P2.k.saved_peer_id);
                a10.G = this.P2.t2();
                org.telegram.messenger.fj fjVar9 = this.P2;
                a10.r = fjVar9;
                a10.D = fjVar9;
                if (fjVar9.F0() instanceof TLRPC.TL_document) {
                    a10.g = (TLRPC.TL_document) this.P2.F0();
                    a10.b = a10.a;
                    a10.a = null;
                } else {
                    TLRPC.MessageMedia messageMedia3 = this.P2.k.media;
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
                org.telegram.messenger.zy.C(this.R).r0(a10);
            } else {
                org.telegram.messenger.zy C = org.telegram.messenger.zy.C(this.R);
                org.telegram.messenger.fj fjVar10 = this.P2;
                C.t(fjVar10, null, null, null, null, null, null, null, false, fjVar10.t2(), null);
            }
        }
        F1(null, null, false);
    }

    public final void u1(TL_iv.RichMessage richMessage) {
        org.telegram.ui.bn bnVar = this.F3;
        if (bnVar != null) {
            org.telegram.messenger.ri.d0(this.R).V1(bnVar.a(), bnVar.Q7(bnVar.F5), "", null, null, null, null, 0L, false, false, richMessage);
        }
        setRichDraftPreview(richMessage);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:187:0x124a  */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r9v54 */
    /* JADX WARN: Type inference failed for: r9v58 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void u2(int i7, boolean z10) {
        boolean z11;
        char c10;
        vg vgVar;
        int i10;
        char c11;
        float f10;
        int i11;
        boolean z12;
        ?? r13;
        int i12;
        char c12;
        ValueAnimator valueAnimator;
        boolean z13;
        boolean z14;
        int i13;
        char c13;
        int i14;
        char c14;
        vg vgVar2;
        ?? r12;
        boolean z15;
        float f11;
        int i15;
        ?? r132;
        float f12;
        int i16;
        char c15;
        char c16;
        int i17;
        ViewGroup viewGroup;
        ViewGroup.LayoutParams layoutParams;
        int i18;
        char c17;
        char c18;
        float f13;
        hi.m mVar;
        xg xgVar = xg.a;
        xg xgVar2 = xg.b;
        Float valueOf = Float.valueOf(0.0f);
        this.I1 = SystemClock.uptimeMillis() + 1500;
        F2(i7);
        Runnable runnable = this.g0;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.g0 = null;
        }
        RecordCircle recordCircle = this.D2;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
        boolean z16 = this.v3;
        Property property = View.TRANSLATION_X;
        Property property2 = View.SCALE_X;
        Property property3 = View.SCALE_Y;
        Property property4 = View.ALPHA;
        if (z16) {
            if (this.m3 == 1) {
                this.N6 = i7;
                return;
            }
            boolean z17 = this.N6 == 3;
            if (!z17) {
                this.P = false;
                qg qgVar = this.E2;
                if (qgVar != null) {
                    mVar = qgVar.E;
                    mVar.d(1, false, false);
                }
                org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(this.R);
                long j3 = this.G3;
                org.telegram.ui.bn bnVar = this.F3;
                d02.j2(j3, (bnVar == null || !bnVar.x4) ? 0L : bnVar.b(), this.P);
                this.Y1 = 0L;
            }
            c0();
            this.m3 = 1;
            eg egVar = this.V0;
            if (egVar != null) {
                egVar.setEnabled(false);
            }
            try {
                if (this.g3 == null) {
                    PowerManager.WakeLock newWakeLock = ((PowerManager) org.telegram.messenger.t0.b.getSystemService("power")).newWakeLock(536870918, "telegram:audio_record_lock");
                    this.g3 = newWakeLock;
                    newWakeLock.acquire();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.f(e10);
            }
            org.telegram.messenger.g0.f2(this.E3);
            mg mgVar = this.P3;
            if (mgVar != null) {
                mgVar.U0(0);
            }
            AnimatorSet animatorSet = this.j3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.k3;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            f0();
            bi.v2 v2Var = this.e1;
            if (v2Var != null) {
                v2Var.setVisibility(0);
            }
            e0();
            RecordCircle recordCircle2 = this.D2;
            if (recordCircle2 != null) {
                recordCircle2.N = false;
                recordCircle2.setVisibility(0);
                this.D2.setAmplitude(0.0d);
            }
            qg qgVar2 = this.E2;
            if (qgVar2 != null) {
                qgVar2.setVisibility(0);
            }
            sg sgVar = this.b2;
            if (sgVar != null) {
                sgVar.e();
                this.b2.d();
                this.b2.setScaleX(0.0f);
                this.b2.setScaleY(0.0f);
                this.b2.e = true;
            }
            this.j3 = new AnimatorSet();
            this.Z0.setVisibility(i0() ? 4 : 0);
            SlideTextView slideTextView = this.a2;
            if (slideTextView != null) {
                slideTextView.setVisibility(i0() ? 4 : 0);
            }
            sg sgVar2 = this.b2;
            if (sgVar2 != null) {
                sgVar2.f(i0());
            }
            this.Z0.setTranslationX(org.telegram.messenger.g0.L(20.0f));
            this.Z0.setAlpha(0.0f);
            if (this.N6 != 3) {
                this.a2.setTranslationX(org.telegram.messenger.g0.L(20.0f));
                this.a2.setAlpha(0.0f);
                this.a2.setCancelToProgress(0.0f);
                this.a2.a();
                this.a2.setEnabled(true);
            } else {
                this.a2.setTranslationX(0.0f);
                this.a2.setAlpha(0.0f);
                this.a2.setCancelToProgress(1.0f);
                this.a2.setEnabled(true);
            }
            this.D2.f(this.N6 == 3);
            this.a3 = false;
            X0();
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.R0, this.P4, 0.0f), ObjectAnimator.ofFloat(this.R0, this.R4, 0.0f), ObjectAnimator.ofFloat(this.b2, (Property<sg, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.b2, (Property<sg, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.Z0, (Property<vg, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.Z0, (Property<vg, Float>) property4, 1.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.a2, (Property<SlideTextView, Float>) property, 0.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.a2, (Property<SlideTextView, Float>) property4, 1.0f));
            qg qgVar3 = this.E2;
            if (qgVar3 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(qgVar3, (Property<qg, Float>) property4, 1.0f));
            }
            if (this.c1 != null) {
                f13 = 0.0f;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.a1, (Property<pe, Float>) property4, 0.0f));
            } else {
                f13 = 0.0f;
            }
            ki.y yVar = this.m0;
            if (yVar != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(yVar, (Property<ki.y, Float>) property3, f13), ObjectAnimator.ofFloat(this.m0, (Property<ki.y, Float>) property2, f13), ObjectAnimator.ofFloat(this.m0, (Property<ki.y, Float>) property4, f13));
            }
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.playTogether(ObjectAnimator.ofFloat(this.F0, (Property<hf, Float>) property4, i0() ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.f1, (Property<ee, Float>) property4, 1.0f));
            if (!i0()) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.F0, this.T4, org.telegram.messenger.g0.L(20.0f)));
            }
            if (z17) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.i1, (Property<zi0, Float>) property4, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.h1, (Property<qh0, Float>) property4, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.h1, (Property<qh0, Float>) property2, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.h1, (Property<qh0, Float>) property3, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.g1, (Property<x61, Float>) property4, 0.0f));
            }
            if (this.z2 != null) {
                animatorSet4.playTogether(p(org.telegram.messenger.g0.L(30.0f)), ObjectAnimator.ofFloat(this.z2, (Property<te, Float>) property4, 0.0f));
            }
            org.telegram.ui.b61 b61Var = this.f2;
            if (b61Var != null) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(b61Var, this.S4, org.telegram.messenger.g0.L(30.0f)), ObjectAnimator.ofFloat(this.f2, this.Q4, 0.0f));
                ViewPropertyAnimator viewPropertyAnimator = this.g2;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    this.g2 = null;
                }
                je jeVar = this.h2;
                this.l2 = 0.0f;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(jeVar, (Property<je, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.h2, (Property<je, Float>) property2, 0.5f), ObjectAnimator.ofFloat(this.h2, (Property<je, Float>) property3, 0.5f));
            }
            lh.h hVar = this.f7;
            if (hVar != null) {
                hVar.e(0, false, true);
            }
            this.j3.playTogether(animatorSet3.setDuration(150L), animatorSet4.setDuration(150L), ObjectAnimator.ofFloat(this.D2, this.k4, 1.0f).setDuration(300L));
            if (!z17) {
                this.j3.playTogether(ObjectAnimator.ofFloat(this.D2, this.l4, 1.0f).setDuration(300L));
            }
            this.j3.addListener(new uf(this, z17));
            this.j3.setInterpolator(new DecelerateInterpolator());
            this.j3.start();
            this.Z0.a(this.Y1);
        } else {
            if (this.a3 && i7 == 3) {
                return;
            }
            PowerManager.WakeLock wakeLock = this.g3;
            if (wakeLock != null) {
                try {
                    wakeLock.release();
                    this.g3 = null;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.f(e11);
                }
            }
            org.telegram.messenger.g0.O3(this.E3);
            this.c4 = false;
            if (this.m3 == 0) {
                this.N6 = i7;
                return;
            }
            this.S.b().M4(this.G3, getThreadMessageId());
            this.m3 = 0;
            eg egVar2 = this.V0;
            if (egVar2 != null) {
                egVar2.setEnabled(true);
            }
            AnimatorSet animatorSet5 = this.j3;
            if (animatorSet5 != null) {
                z11 = animatorSet5.isRunning();
                qe qeVar = this.c1;
                if (qeVar != null) {
                    qeVar.setScaleX(1.0f);
                    this.c1.setScaleY(1.0f);
                }
                this.j3.removeAllListeners();
                this.j3.cancel();
            } else {
                z11 = false;
            }
            AnimatorSet animatorSet6 = this.k3;
            if (animatorSet6 != null) {
                animatorSet6.cancel();
            }
            hf hfVar = this.F0;
            if (hfVar != null) {
                hfVar.setVisibility(0);
            }
            this.j3 = new AnimatorSet();
            if (z11) {
                c10 = '\t';
            } else if (i7 == 4) {
                c10 = '\t';
            } else {
                if (i7 == 3) {
                    c0();
                    e0();
                    t(z10);
                    SlideTextView slideTextView2 = this.a2;
                    if (slideTextView2 != null) {
                        slideTextView2.setEnabled(false);
                    }
                    if (S0()) {
                        zi0 zi0Var = this.i1;
                        if (zi0Var != null) {
                            zi0Var.setVisibility(8);
                        }
                        ee eeVar = this.f1;
                        if (eeVar != null) {
                            eeVar.setAlpha(1.0f);
                            this.f1.setVisibility(0);
                        }
                        qh0 qh0Var = this.h1;
                        if (qh0Var != null) {
                            qh0Var.setProgress(0.0f);
                            this.h1.i();
                        }
                        f12 = 1.0f;
                        c15 = 7;
                    } else {
                        x61 x61Var = this.g1;
                        if (x61Var != null) {
                            x61Var.setVisibility(8);
                            X0();
                        }
                        ee eeVar2 = this.f1;
                        if (eeVar2 != null) {
                            i16 = 0;
                            eeVar2.setVisibility(0);
                            f12 = 1.0f;
                            c15 = 7;
                            this.f1.setAlpha(1.0f);
                        } else {
                            f12 = 1.0f;
                            i16 = 0;
                            c15 = 7;
                        }
                        zi0 zi0Var2 = this.i1;
                        if (zi0Var2 != null) {
                            zi0Var2.setVisibility(i16);
                            this.i1.setAlpha(0.0f);
                        }
                    }
                    this.i5 = true;
                    this.d5 = f12;
                    this.b5 = this.a5;
                    this.Z4 = f12;
                    SlideTextView slideTextView3 = this.a2;
                    if (slideTextView3 != null) {
                        slideTextView3.setCancelToProgress(f12);
                    }
                    qg qgVar4 = this.E2;
                    if (qgVar4 != null) {
                        qgVar4.invalidate();
                    }
                    qh0 qh0Var2 = this.h1;
                    if (qh0Var2 != null) {
                        qh0Var2.setAlpha(0.0f);
                        this.h1.setScaleX(0.0f);
                        this.h1.setScaleY(0.0f);
                        this.h1.setProgress(0.0f);
                        this.h1.i();
                    }
                    if (S0() || this.Z5) {
                        c16 = '\t';
                        i17 = 10;
                        this.g1.setVisibility(0);
                        viewGroup = null;
                        layoutParams = null;
                    } else {
                        viewGroup = (ViewGroup) this.f1.getParent();
                        layoutParams = this.f1.getLayoutParams();
                        viewGroup.removeView(this.f1);
                        c16 = '\t';
                        i17 = 10;
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(viewGroup.getMeasuredWidth() - (this.P2 == null ? i5.c.d(44.0f, this.K0.l(), 0) : 0), org.telegram.messenger.g0.L(44.0f));
                        layoutParams2.gravity = 80;
                        layoutParams2.leftMargin = org.telegram.messenger.g0.L(7.0f);
                        layoutParams2.rightMargin = org.telegram.messenger.g0.L(7.0f);
                        this.c2.addView(this.f1, layoutParams2);
                        this.g1.setVisibility(8);
                    }
                    X0();
                    AnimatorSet animatorSet7 = new AnimatorSet();
                    if (z10) {
                        this.i1.setAllowDraw(false);
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new pd(this, 6));
                        ofFloat.addListener(new vf(this));
                        ofFloat.setDuration(S0() ? 490L : this.K1 ? 560L : 580L);
                        if (this.K1 && !S0()) {
                            ofFloat.setInterpolator(new LinearInterpolator());
                        }
                        AnimatorSet animatorSet8 = new AnimatorSet();
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.b2, (Property<sg, Float>) property3, 0.0f);
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.b2, (Property<sg, Float>) property2, 0.0f);
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.Z0, (Property<vg, Float>) property4, 0.0f);
                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.Z0, (Property<vg, Float>) property, -org.telegram.messenger.g0.L(20.0f));
                        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.a2, (Property<SlideTextView, Float>) property4, 0.0f);
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.h1, (Property<qh0, Float>) property4, 1.0f);
                        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.h1, (Property<qh0, Float>) property3, 1.0f);
                        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.h1, (Property<qh0, Float>) property2, 1.0f);
                        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this.R0, this.P4, 0.0f);
                        ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(this.R0, this.R4, 0.0f);
                        ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(this.F0, (Property<hf, Float>) property4, 0.0f);
                        Animator[] animatorArr = new Animator[11];
                        animatorArr[0] = ofFloat2;
                        animatorArr[1] = ofFloat3;
                        animatorArr[2] = ofFloat4;
                        animatorArr[3] = ofFloat5;
                        animatorArr[4] = ofFloat6;
                        animatorArr[5] = ofFloat7;
                        animatorArr[6] = ofFloat8;
                        animatorArr[c15] = ofFloat9;
                        animatorArr[8] = ofFloat10;
                        animatorArr[c16] = ofFloat11;
                        animatorArr[i17] = ofFloat12;
                        animatorSet8.playTogether(animatorArr);
                        qh0 qh0Var3 = this.h1;
                        if (qh0Var3 != null) {
                            qh0Var3.setAlpha(0.0f);
                            this.h1.setScaleX(0.0f);
                            this.h1.setScaleY(0.0f);
                        }
                        if (this.c1 != null) {
                            i18 = 1;
                            animatorSet8.playTogether(ObjectAnimator.ofFloat(this.a1, (Property<pe, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.a1, (Property<pe, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.a1, (Property<pe, Float>) property3, 1.0f));
                            this.c1.j(S0() ? xgVar2 : xgVar, true);
                        } else {
                            i18 = 1;
                        }
                        ki.y yVar2 = this.m0;
                        if (yVar2 != null) {
                            float[] fArr = new float[i18];
                            fArr[0] = 0.0f;
                            ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(yVar2, (Property<ki.y, Float>) property4, fArr);
                            ki.y yVar3 = this.m0;
                            float[] fArr2 = new float[i18];
                            fArr2[0] = 0.0f;
                            ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(yVar3, (Property<ki.y, Float>) property2, fArr2);
                            ki.y yVar4 = this.m0;
                            float[] fArr3 = new float[i18];
                            fArr3[0] = 0.0f;
                            ObjectAnimator ofFloat15 = ObjectAnimator.ofFloat(yVar4, (Property<ki.y, Float>) property3, fArr3);
                            Animator[] animatorArr2 = new Animator[3];
                            animatorArr2[0] = ofFloat13;
                            animatorArr2[i18] = ofFloat14;
                            animatorArr2[2] = ofFloat15;
                            animatorSet8.playTogether(animatorArr2);
                        }
                        animatorSet8.addListener(new be(this, i17));
                        boolean z18 = this.K1 && !S0();
                        animatorSet8.setDuration(z18 ? 120L : 150L);
                        animatorSet8.setStartDelay(z18 ? 0L : 150L);
                        if (S0()) {
                            this.g1.setAlpha(0.0f);
                            c17 = 1;
                            c18 = 0;
                            animatorSet7.playTogether(ObjectAnimator.ofFloat(this.g1, (Property<x61, Float>) property4, 1.0f));
                            animatorSet7.setDuration(150L);
                            animatorSet7.setStartDelay(430L);
                        } else {
                            c17 = 1;
                            c18 = 0;
                        }
                        AnimatorSet animatorSet9 = this.j3;
                        Animator[] animatorArr3 = new Animator[3];
                        animatorArr3[c18] = animatorSet8;
                        animatorArr3[c17] = ofFloat;
                        animatorArr3[2] = animatorSet7;
                        animatorSet9.playTogether(animatorArr3);
                        this.j3.addListener(new fi.a3(this, viewGroup, layoutParams, 3));
                    } else {
                        f0();
                        this.k4.set(this.D2, Float.valueOf(1.0f));
                        this.D2.setTransformToSeekbar(1.0f);
                        if (!S0()) {
                            float f14 = this.f5;
                            if (f14 != 0.0f && this.i1 != null) {
                                float interpolation = kr.j.getInterpolation(Math.max(0.0f, ((f14 - 0.38f) - 0.25f) / 0.37f));
                                zi0 zi0Var3 = this.i1;
                                if (this.K1) {
                                    interpolation = 1.0f;
                                }
                                zi0Var3.setAlpha(interpolation);
                                this.i1.invalidate();
                            }
                        }
                        this.b2.setScaleY(0.0f);
                        this.b2.setScaleX(0.0f);
                        this.Z0.setAlpha(0.0f);
                        this.Z0.setTranslationX(-org.telegram.messenger.g0.L(20.0f));
                        this.a2.setAlpha(0.0f);
                        this.h1.setAlpha(1.0f);
                        this.h1.setScaleY(1.0f);
                        this.h1.setScaleX(1.0f);
                        this.P4.set(this.R0, valueOf);
                        this.R4.set(this.R0, valueOf);
                        this.F0.setAlpha(0.0f);
                        qe qeVar2 = this.c1;
                        if (qeVar2 != null) {
                            qeVar2.j(S0() ? xgVar2 : xgVar, z10);
                            this.a1.setAlpha(1.0f);
                            this.a1.setScaleX(1.0f);
                            this.a1.setScaleY(1.0f);
                        }
                        ki.y yVar5 = this.m0;
                        if (yVar5 != null) {
                            yVar5.setAlpha(0.0f);
                            this.m0.setScaleX(0.0f);
                            this.m0.setScaleY(0.0f);
                        }
                        if (S0()) {
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
                        o2();
                        X0();
                    }
                } else if (i7 == 2 || i7 == 5) {
                    qe qeVar3 = this.c1;
                    if (qeVar3 != null) {
                        qeVar3.setVisibility(0);
                    }
                    this.a3 = true;
                    X0();
                    ValueAnimator d03 = d0();
                    AnimatorSet animatorSet10 = new AnimatorSet();
                    if (d03 == null) {
                        c12 = 0;
                        i12 = 1;
                        animatorSet10.playTogether(ObjectAnimator.ofFloat(this.R0, this.P4, 1.0f), ObjectAnimator.ofFloat(this.R0, this.R4, this.B0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.b2, (Property<sg, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.b2, (Property<sg, Float>) property2, 0.0f));
                    } else {
                        i12 = 1;
                        c12 = 0;
                    }
                    qg qgVar5 = this.E2;
                    int i19 = i12;
                    if (qgVar5 != null) {
                        float[] fArr4 = new float[i19];
                        fArr4[c12] = 0.0f;
                        ObjectAnimator ofFloat16 = ObjectAnimator.ofFloat(qgVar5, (Property<qg, Float>) property4, fArr4);
                        ofFloat16.setDuration(160L);
                        ofFloat16.setInterpolator(kr.g);
                        AnimatorSet animatorSet11 = this.j3;
                        Animator[] animatorArr4 = new Animator[i19];
                        animatorArr4[c12] = ofFloat16;
                        animatorSet11.playTogether(animatorArr4);
                        this.E2.f();
                    }
                    ki.y yVar6 = this.m0;
                    if (yVar6 != null) {
                        float[] fArr5 = new float[i19];
                        fArr5[c12] = 1.0f;
                        ObjectAnimator ofFloat17 = ObjectAnimator.ofFloat(yVar6, (Property<ki.y, Float>) property3, fArr5);
                        ki.y yVar7 = this.m0;
                        float[] fArr6 = new float[i19];
                        fArr6[c12] = 1.0f;
                        ObjectAnimator ofFloat18 = ObjectAnimator.ofFloat(yVar7, (Property<ki.y, Float>) property2, fArr6);
                        ki.y yVar8 = this.m0;
                        float[] fArr7 = new float[i19];
                        fArr7[c12] = 1.0f;
                        ObjectAnimator ofFloat19 = ObjectAnimator.ofFloat(yVar8, (Property<ki.y, Float>) property4, fArr7);
                        Animator[] animatorArr5 = new Animator[3];
                        animatorArr5[c12] = ofFloat17;
                        animatorArr5[i19] = ofFloat18;
                        animatorArr5[2] = ofFloat19;
                        animatorSet10.playTogether(animatorArr5);
                    }
                    AnimatorSet animatorSet12 = new AnimatorSet();
                    if (d03 != null) {
                        SlideTextView slideTextView4 = this.a2;
                        float[] fArr8 = new float[i19];
                        fArr8[c12] = 0.0f;
                        ObjectAnimator ofFloat20 = ObjectAnimator.ofFloat(slideTextView4, (Property<SlideTextView, Float>) property4, fArr8);
                        Animator[] animatorArr6 = new Animator[i19];
                        animatorArr6[c12] = ofFloat20;
                        animatorSet12.playTogether(animatorArr6);
                        valueAnimator = d03;
                    } else {
                        vg vgVar3 = this.Z0;
                        float[] fArr9 = new float[i19];
                        fArr9[c12] = 0.0f;
                        ObjectAnimator ofFloat21 = ObjectAnimator.ofFloat(vgVar3, (Property<vg, Float>) property4, fArr9);
                        vg vgVar4 = this.Z0;
                        float[] fArr10 = new float[i19];
                        fArr10[c12] = -org.telegram.messenger.g0.L(20.0f);
                        ObjectAnimator ofFloat22 = ObjectAnimator.ofFloat(vgVar4, (Property<vg, Float>) property, fArr10);
                        SlideTextView slideTextView5 = this.a2;
                        float[] fArr11 = new float[i19];
                        fArr11[c12] = 0.0f;
                        ObjectAnimator ofFloat23 = ObjectAnimator.ofFloat(slideTextView5, (Property<SlideTextView, Float>) property4, fArr11);
                        SlideTextView slideTextView6 = this.a2;
                        valueAnimator = d03;
                        float[] fArr12 = new float[1];
                        fArr12[c12] = -org.telegram.messenger.g0.L(20.0f);
                        ObjectAnimator ofFloat24 = ObjectAnimator.ofFloat(slideTextView6, (Property<SlideTextView, Float>) property, fArr12);
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
                        je jeVar2 = this.h2;
                        if (jeVar2 != null && jeVar2.getVisibility() == 0) {
                            this.h2.setScaleX(0.5f);
                            this.h2.setScaleY(0.5f);
                        }
                        je jeVar3 = this.n2;
                        if (jeVar3 != null && jeVar3.getVisibility() == 0) {
                            this.n2.setScaleX(0.0f);
                            this.n2.setScaleY(0.0f);
                        }
                        animatorSet10.playTogether(ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f), ObjectAnimator.ofFloat(this.a1, (Property<pe, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.a1, (Property<pe, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.a1, (Property<pe, Float>) property4, 1.0f));
                        if (this.f2 != null) {
                            ViewPropertyAnimator viewPropertyAnimator2 = this.g2;
                            if (viewPropertyAnimator2 != null) {
                                viewPropertyAnimator2.cancel();
                                this.g2 = null;
                            }
                            r12 = 0;
                            animatorSet10.playTogether(ObjectAnimator.ofFloat(this.f2, this.Q4, 1.0f), ObjectAnimator.ofFloat(this.f2, this.S4, 0.0f));
                            je jeVar4 = this.h2;
                            this.l2 = 1.0f;
                            z15 = true;
                            animatorSet10.playTogether(ObjectAnimator.ofFloat(jeVar4, (Property<je, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.h2, (Property<je, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.h2, (Property<je, Float>) property3, 1.0f));
                        } else {
                            r12 = 0;
                            z15 = true;
                        }
                        lh.h hVar2 = this.f7;
                        int i20 = z15;
                        if (hVar2 != 0) {
                            hVar2.e(r12, r12, i20);
                        }
                        je jeVar5 = this.n2;
                        if (jeVar5 != null) {
                            float[] fArr13 = new float[i20];
                            fArr13[r12] = 1.0f;
                            ObjectAnimator ofFloat25 = ObjectAnimator.ofFloat(jeVar5, (Property<je, Float>) property2, fArr13);
                            je jeVar6 = this.n2;
                            float[] fArr14 = new float[i20];
                            fArr14[r12] = 1.0f;
                            ObjectAnimator ofFloat26 = ObjectAnimator.ofFloat(jeVar6, (Property<je, Float>) property3, fArr14);
                            Animator[] animatorArr8 = new Animator[2];
                            animatorArr8[r12] = ofFloat25;
                            animatorArr8[i20] = ofFloat26;
                            animatorSet10.playTogether(animatorArr8);
                        }
                        if (this.c1 != null) {
                            pe peVar = this.a1;
                            float[] fArr15 = new float[i20];
                            fArr15[r12] = 1.0f;
                            ObjectAnimator ofFloat27 = ObjectAnimator.ofFloat(peVar, (Property<pe, Float>) property4, fArr15);
                            Animator[] animatorArr9 = new Animator[i20];
                            animatorArr9[r12] = ofFloat27;
                            animatorSet10.playTogether(animatorArr9);
                            pe peVar2 = this.a1;
                            float[] fArr16 = new float[i20];
                            fArr16[r12] = 1.0f;
                            ObjectAnimator ofFloat28 = ObjectAnimator.ofFloat(peVar2, (Property<pe, Float>) property2, fArr16);
                            Animator[] animatorArr10 = new Animator[i20];
                            animatorArr10[r12] = ofFloat28;
                            animatorSet10.playTogether(animatorArr10);
                            pe peVar3 = this.a1;
                            float[] fArr17 = new float[i20];
                            fArr17[r12] = 1.0f;
                            ObjectAnimator ofFloat29 = ObjectAnimator.ofFloat(peVar3, (Property<pe, Float>) property3, fArr17);
                            Animator[] animatorArr11 = new Animator[i20];
                            animatorArr11[r12] = ofFloat29;
                            animatorSet10.playTogether(animatorArr11);
                            this.c1.j(S0() ? xgVar2 : xgVar, i20);
                        }
                        te teVar = this.z2;
                        if (teVar != null) {
                            float[] fArr18 = new float[i20];
                            fArr18[0] = 1.0f;
                            ObjectAnimator ofFloat30 = ObjectAnimator.ofFloat(teVar, (Property<te, Float>) property4, fArr18);
                            ValueAnimator p10 = p(0.0f);
                            Animator[] animatorArr12 = new Animator[2];
                            animatorArr12[0] = ofFloat30;
                            animatorArr12[i20] = p10;
                            animatorSet10.playTogether(animatorArr12);
                        }
                    } else {
                        AnimatorSet animatorSet13 = new AnimatorSet();
                        if (i7 != 5) {
                            animatorSet13.playTogether(ObjectAnimator.ofFloat(this.a1, (Property<pe, Float>) property4, 1.0f));
                        }
                        if (this.f2 != null) {
                            ViewPropertyAnimator viewPropertyAnimator3 = this.g2;
                            if (viewPropertyAnimator3 != null) {
                                viewPropertyAnimator3.cancel();
                                this.g2 = null;
                            }
                            z13 = false;
                            z14 = true;
                            animatorSet13.playTogether(ObjectAnimator.ofFloat(this.f2, this.S4, 0.0f), ObjectAnimator.ofFloat(this.f2, this.Q4, 1.0f));
                            je jeVar7 = this.h2;
                            this.l2 = 1.0f;
                            animatorSet13.playTogether(ObjectAnimator.ofFloat(jeVar7, (Property<je, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.h2, (Property<je, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.h2, (Property<je, Float>) property3, 1.0f));
                        } else {
                            z13 = false;
                            z14 = true;
                        }
                        lh.h hVar3 = this.f7;
                        boolean z19 = z13;
                        int i21 = z14;
                        if (hVar3 != null) {
                            hVar3.e(z19 ? 1 : 0, z19, i21);
                        }
                        te teVar2 = this.z2;
                        if (teVar2 != null) {
                            float[] fArr19 = new float[i21];
                            fArr19[z19 ? 1 : 0] = 1.0f;
                            ObjectAnimator ofFloat31 = ObjectAnimator.ofFloat(teVar2, (Property<te, Float>) property4, fArr19);
                            ValueAnimator p11 = p(0.0f);
                            Animator[] animatorArr13 = new Animator[2];
                            animatorArr13[z19 ? 1 : 0] = ofFloat31;
                            animatorArr13[i21] = p11;
                            animatorSet13.playTogether(animatorArr13);
                        }
                        animatorSet13.setDuration(150L);
                        animatorSet13.setStartDelay(110L);
                        animatorSet13.addListener(new be(this, 11));
                        AnimatorSet animatorSet14 = this.j3;
                        Animator[] animatorArr14 = new Animator[i21];
                        animatorArr14[0] = animatorSet13;
                        animatorSet14.playTogether(animatorArr14);
                    }
                    animatorSet10.setDuration(150L);
                    animatorSet10.setStartDelay(this.D1 ? 0L : 700L);
                    animatorSet12.setDuration(this.D1 ? 110L : valueAnimator != null ? 140L : 200L);
                    animatorSet12.setStartDelay((this.D1 || valueAnimator != null) ? 0L : 200L);
                    if (valueAnimator == null || (vgVar2 = this.Z0) == null) {
                        i13 = 1;
                        c13 = 0;
                    } else {
                        vgVar2.animate().cancel();
                        this.Z0.setPivotX(0.0f);
                        this.Z0.setPivotY(r3.getHeight() / 2.0f);
                        AnimatorSet animatorSet15 = new AnimatorSet();
                        i13 = 1;
                        c13 = 0;
                        ObjectAnimator ofFloat32 = ObjectAnimator.ofFloat(this.Z0, (Property<vg, Float>) property4, 0.0f);
                        vg vgVar5 = this.Z0;
                        animatorSet15.playTogether(ofFloat32, ObjectAnimator.ofFloat(vgVar5, (Property<vg, Float>) property, vgVar5.getTranslationX() - org.telegram.messenger.g0.L(6.0f)), ObjectAnimator.ofFloat(this.Z0, (Property<vg, Float>) property2, 0.94f), ObjectAnimator.ofFloat(this.Z0, (Property<vg, Float>) property3, 0.94f));
                        animatorSet15.setDuration(140L);
                        animatorSet15.setInterpolator(kr.g);
                        this.j3.playTogether(animatorSet15);
                    }
                    this.H = 0.0f;
                    s2();
                    hf hfVar2 = this.F0;
                    float[] fArr20 = new float[i13];
                    fArr20[c13] = 1.0f;
                    ObjectAnimator ofFloat33 = ObjectAnimator.ofFloat(hfVar2, (Property<hf, Float>) property4, fArr20);
                    ofFloat33.setStartDelay(this.D1 ? 110L : this.s == 1.0f ? 300L : 700L);
                    ofFloat33.setDuration(200L);
                    if (valueAnimator != null) {
                        ofFloat33.setStartDelay((long) Math.max(300.0f, this.M5 - 120.0f));
                        ofFloat33.setDuration(320L);
                        ofFloat33.setInterpolator(kr.g);
                        i14 = 1;
                        c14 = 0;
                        this.j3.playTogether(valueAnimator);
                        AnimatorSet J2 = J2();
                        if (J2 != null) {
                            this.j3.playTogether(J2);
                        }
                    } else {
                        i14 = 1;
                        c14 = 0;
                    }
                    AnimatorSet animatorSet16 = this.j3;
                    float[] fArr21 = new float[i14];
                    fArr21[c14] = this.a5;
                    ObjectAnimator duration = ObjectAnimator.ofFloat(this, "lockAnimatedTranslation", fArr21).setDuration(200L);
                    Animator[] animatorArr15 = new Animator[4];
                    animatorArr15[c14] = animatorSet10;
                    animatorArr15[i14] = animatorSet12;
                    animatorArr15[2] = ofFloat33;
                    animatorArr15[3] = duration;
                    animatorSet16.playTogether(animatorArr15);
                    if (i7 == 5) {
                        this.D2.a();
                        float[] fArr22 = new float[i14];
                        fArr22[c14] = 1.0f;
                        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this, "slideToCancelProgress", fArr22).setDuration(200L);
                        duration2.setInterpolator(kr.j);
                        AnimatorSet animatorSet17 = this.j3;
                        Animator[] animatorArr16 = new Animator[i14];
                        animatorArr16[c14] = duration2;
                        animatorSet17.playTogether(animatorArr16);
                    } else {
                        float[] fArr23 = new float[i14];
                        fArr23[c14] = 1.0f;
                        ObjectAnimator ofFloat34 = ObjectAnimator.ofFloat(this, "exitTransition", fArr23);
                        ofFloat34.setDuration(this.D1 ? 280L : 360L);
                        ofFloat34.setStartDelay(this.D1 ? 0L : 490L);
                        this.j3.playTogether(ofFloat34);
                    }
                    sg sgVar3 = this.b2;
                    if (sgVar3 != null) {
                        if (this.D1) {
                            sgVar3.setScaleX(0.0f);
                            this.b2.setScaleY(0.0f);
                        } else if (valueAnimator == null) {
                            sgVar3.c();
                        }
                    }
                } else {
                    qe qeVar4 = this.c1;
                    if (qeVar4 != null) {
                        qeVar4.setVisibility(0);
                    }
                    AnimatorSet animatorSet18 = new AnimatorSet();
                    animatorSet18.playTogether(ObjectAnimator.ofFloat(this.R0, this.P4, 1.0f), ObjectAnimator.ofFloat(this.R0, this.R4, this.B0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.b2, (Property<sg, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.b2, (Property<sg, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.a1, (Property<pe, Float>) property4, 1.0f));
                    qg qgVar6 = this.E2;
                    if (qgVar6 != null) {
                        animatorSet18.playTogether(ObjectAnimator.ofFloat(qgVar6, (Property<qg, Float>) property4, 0.0f));
                        this.E2.f();
                    }
                    ki.y yVar9 = this.m0;
                    if (yVar9 != null) {
                        f11 = 1.0f;
                        animatorSet18.playTogether(ObjectAnimator.ofFloat(yVar9, (Property<ki.y, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.m0, (Property<ki.y, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.m0, (Property<ki.y, Float>) property4, 1.0f));
                    } else {
                        f11 = 1.0f;
                    }
                    qe qeVar5 = this.c1;
                    if (qeVar5 != null) {
                        qeVar5.setScaleX(f11);
                        this.c1.setScaleY(f11);
                        animatorSet18.playTogether(ObjectAnimator.ofFloat(this.a1, (Property<pe, Float>) property4, f11));
                        this.c1.j(S0() ? xgVar2 : xgVar, true);
                    }
                    if (this.f2 != null) {
                        ViewPropertyAnimator viewPropertyAnimator4 = this.g2;
                        if (viewPropertyAnimator4 != null) {
                            viewPropertyAnimator4.cancel();
                            this.g2 = null;
                        }
                        this.y = 0.0f;
                        j2();
                        i15 = 1;
                        r132 = 0;
                        animatorSet18.playTogether(ObjectAnimator.ofFloat(this.f2, this.Q4, 1.0f));
                        je jeVar8 = this.h2;
                        this.l2 = 1.0f;
                        animatorSet18.playTogether(ObjectAnimator.ofFloat(jeVar8, (Property<je, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.h2, (Property<je, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.h2, (Property<je, Float>) property3, 1.0f));
                    } else {
                        i15 = 1;
                        r132 = 0;
                    }
                    lh.h hVar4 = this.f7;
                    if (hVar4 != 0) {
                        hVar4.e(r132, r132, i15);
                    }
                    te teVar3 = this.z2;
                    if (teVar3 != null) {
                        float[] fArr24 = new float[i15];
                        fArr24[r132] = 1.0f;
                        ObjectAnimator ofFloat35 = ObjectAnimator.ofFloat(teVar3, (Property<te, Float>) property4, fArr24);
                        ValueAnimator p12 = p(0.0f);
                        Animator[] animatorArr17 = new Animator[2];
                        animatorArr17[r132] = ofFloat35;
                        animatorArr17[i15] = p12;
                        animatorSet18.playTogether(animatorArr17);
                    }
                    animatorSet18.setDuration(150L);
                    animatorSet18.setStartDelay(200L);
                    AnimatorSet animatorSet19 = new AnimatorSet();
                    vg vgVar6 = this.Z0;
                    float[] fArr25 = new float[i15];
                    fArr25[r132] = 0.0f;
                    ObjectAnimator ofFloat36 = ObjectAnimator.ofFloat(vgVar6, (Property<vg, Float>) property4, fArr25);
                    vg vgVar7 = this.Z0;
                    float[] fArr26 = new float[i15];
                    fArr26[r132] = org.telegram.messenger.g0.L(40.0f);
                    ObjectAnimator ofFloat37 = ObjectAnimator.ofFloat(vgVar7, (Property<vg, Float>) property, fArr26);
                    SlideTextView slideTextView7 = this.a2;
                    float[] fArr27 = new float[i15];
                    fArr27[r132] = 0.0f;
                    ObjectAnimator ofFloat38 = ObjectAnimator.ofFloat(slideTextView7, (Property<SlideTextView, Float>) property4, fArr27);
                    SlideTextView slideTextView8 = this.a2;
                    float[] fArr28 = new float[i15];
                    fArr28[r132] = org.telegram.messenger.g0.L(40.0f);
                    ObjectAnimator ofFloat39 = ObjectAnimator.ofFloat(slideTextView8, (Property<SlideTextView, Float>) property, fArr28);
                    Animator[] animatorArr18 = new Animator[4];
                    animatorArr18[r132] = ofFloat36;
                    animatorArr18[i15] = ofFloat37;
                    animatorArr18[2] = ofFloat38;
                    animatorArr18[3] = ofFloat39;
                    animatorSet19.playTogether(animatorArr18);
                    animatorSet19.setDuration(150L);
                    float[] fArr29 = new float[i15];
                    fArr29[r132] = 1.0f;
                    ObjectAnimator ofFloat40 = ObjectAnimator.ofFloat(this, "exitTransition", fArr29);
                    ofFloat40.setDuration(this.h0 ? 220L : 360L);
                    this.H = 0.0f;
                    s2();
                    ObjectAnimator ofFloat41 = ObjectAnimator.ofFloat(this.F0, (Property<hf, Float>) property4, 1.0f);
                    ofFloat41.setStartDelay(this.s == 1.0f ? 150L : 450L);
                    ofFloat41.setDuration(200L);
                    this.j3.playTogether(animatorSet18, animatorSet19, ofFloat41, ofFloat40);
                }
                this.j3.addListener(new wf(this, i7));
                this.j3.start();
                vgVar = this.Z0;
                if (vgVar != null) {
                    vgVar.b();
                }
            }
            float f15 = 0.5f;
            qe qeVar6 = this.c1;
            if (qeVar6 != null) {
                qeVar6.setVisibility(0);
            }
            AnimatorSet animatorSet20 = this.j3;
            ObjectAnimator ofFloat42 = ObjectAnimator.ofFloat(this.R0, this.P4, 1.0f);
            ge geVar = this.R0;
            de deVar = this.R4;
            if (!this.B0) {
                f15 = 1.0f;
            }
            ObjectAnimator ofFloat43 = ObjectAnimator.ofFloat(geVar, deVar, f15);
            ObjectAnimator ofFloat44 = ObjectAnimator.ofFloat(this.b2, (Property<sg, Float>) property3, 0.0f);
            ObjectAnimator ofFloat45 = ObjectAnimator.ofFloat(this.b2, (Property<sg, Float>) property2, 0.0f);
            ObjectAnimator ofFloat46 = ObjectAnimator.ofFloat(this.D2, this.k4, 0.0f);
            ObjectAnimator ofFloat47 = ObjectAnimator.ofFloat(this.D2, this.l4, 0.0f);
            ObjectAnimator ofFloat48 = ObjectAnimator.ofFloat(this.a1, (Property<pe, Float>) property4, 1.0f);
            ObjectAnimator ofFloat49 = ObjectAnimator.ofFloat(this.Z0, (Property<vg, Float>) property4, 0.0f);
            ObjectAnimator ofFloat50 = ObjectAnimator.ofFloat(this.a1, (Property<pe, Float>) property4, 1.0f);
            ObjectAnimator ofFloat51 = ObjectAnimator.ofFloat(this.F0, (Property<hf, Float>) property4, 1.0f);
            ObjectAnimator ofFloat52 = ObjectAnimator.ofFloat(this.F0, this.T4, 0.0f);
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
            animatorArr19[c10] = ofFloat51;
            animatorArr19[10] = ofFloat52;
            animatorArr19[11] = ofFloat53;
            animatorSet20.playTogether(animatorArr19);
            qg qgVar7 = this.E2;
            if (qgVar7 != null) {
                i10 = 1;
                c11 = 0;
                this.j3.playTogether(ObjectAnimator.ofFloat(qgVar7, (Property<qg, Float>) property4, 0.0f));
                this.E2.f();
            } else {
                i10 = 1;
                c11 = 0;
            }
            ki.y yVar10 = this.m0;
            if (yVar10 != null) {
                AnimatorSet animatorSet21 = this.j3;
                float[] fArr30 = new float[i10];
                f10 = 1.0f;
                fArr30[c11] = 1.0f;
                ObjectAnimator ofFloat54 = ObjectAnimator.ofFloat(yVar10, (Property<ki.y, Float>) property3, fArr30);
                ki.y yVar11 = this.m0;
                float[] fArr31 = new float[i10];
                fArr31[c11] = 1.0f;
                ObjectAnimator ofFloat55 = ObjectAnimator.ofFloat(yVar11, (Property<ki.y, Float>) property2, fArr31);
                ki.y yVar12 = this.m0;
                float[] fArr32 = new float[i10];
                fArr32[c11] = 1.0f;
                ObjectAnimator ofFloat56 = ObjectAnimator.ofFloat(yVar12, (Property<ki.y, Float>) property4, fArr32);
                Animator[] animatorArr20 = new Animator[3];
                animatorArr20[c11] = ofFloat54;
                animatorArr20[i10] = ofFloat55;
                animatorArr20[2] = ofFloat56;
                animatorSet21.playTogether(animatorArr20);
            } else {
                f10 = 1.0f;
            }
            qe qeVar7 = this.c1;
            if (qeVar7 != null) {
                qeVar7.setScaleX(f10);
                this.c1.setScaleY(f10);
                i11 = 1;
                this.j3.playTogether(ObjectAnimator.ofFloat(this.a1, (Property<pe, Float>) property4, f10));
                this.c1.j(S0() ? xgVar2 : xgVar, true);
            } else {
                i11 = 1;
            }
            if (this.z2 != null) {
                AnimatorSet animatorSet22 = this.j3;
                ValueAnimator p13 = p(0.0f);
                te teVar4 = this.z2;
                float[] fArr33 = new float[i11];
                fArr33[0] = 1.0f;
                ObjectAnimator ofFloat57 = ObjectAnimator.ofFloat(teVar4, (Property<te, Float>) property4, fArr33);
                Animator[] animatorArr21 = new Animator[2];
                animatorArr21[0] = p13;
                animatorArr21[i11] = ofFloat57;
                animatorSet22.playTogether(animatorArr21);
            }
            if (this.f2 != null) {
                ViewPropertyAnimator viewPropertyAnimator5 = this.g2;
                if (viewPropertyAnimator5 != null) {
                    viewPropertyAnimator5.cancel();
                    this.g2 = null;
                }
                z12 = true;
                r13 = 0;
                this.j3.playTogether(ObjectAnimator.ofFloat(this.f2, this.S4, 0.0f), ObjectAnimator.ofFloat(this.f2, this.Q4, 1.0f));
                AnimatorSet animatorSet23 = this.j3;
                je jeVar9 = this.h2;
                this.l2 = 1.0f;
                animatorSet23.playTogether(ObjectAnimator.ofFloat(jeVar9, (Property<je, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.h2, (Property<je, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.h2, (Property<je, Float>) property3, 1.0f));
            } else {
                z12 = true;
                r13 = 0;
            }
            lh.h hVar5 = this.f7;
            if (hVar5 != 0) {
                hVar5.e(r13, r13, z12);
            }
            this.a3 = z12;
            X0();
            this.j3.setDuration(150L);
            this.j3.addListener(new wf(this, i7));
            this.j3.start();
            vgVar = this.Z0;
            if (vgVar != null) {
            }
        }
        this.P3.b();
        y2();
        this.N6 = i7;
        q0();
        if (this.l1) {
            q2(this.M6);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        TextPaint textPaint;
        org.telegram.ui.ActionBar.i6 i6Var = this.M4;
        try {
            hf hfVar = this.F0;
            if (hfVar != null) {
                org.telegram.ui.ActionBar.u6.l(hfVar, 34, org.telegram.ui.ActionBar.n6.Me, i6Var);
                org.telegram.ui.ActionBar.u6.v(this.F0, org.telegram.ui.ActionBar.n6.Ne, i6Var);
                org.telegram.ui.ActionBar.u6.y(this.F0, org.telegram.ui.ActionBar.n6.mg, i6Var);
            }
            Paint paint = this.G2;
            if (paint != null) {
                paint.setColor(G0(org.telegram.ui.ActionBar.n6.Sf));
            }
            ug ugVar = this.G0;
            if (ugVar != null) {
                ((org.telegram.ui.ActionBar.n5) ugVar.c).setTextColor(G0(org.telegram.ui.ActionBar.n6.Nl));
                ugVar.invalidate();
            }
            AnimatedArrowDrawable animatedArrowDrawable = this.v4;
            if (animatedArrowDrawable != null) {
                animatedArrowDrawable.a.setColor(G0(org.telegram.ui.ActionBar.n6.Nl));
                animatedArrowDrawable.invalidateSelf();
            }
            se seVar = this.K0;
            if (seVar != null && this.L0 != 0 && seVar.getBackground() != null) {
                int G0 = G0((this.H0 != Integer.MAX_VALUE || Y0()) ? org.telegram.ui.ActionBar.n6.Pe : org.telegram.ui.ActionBar.n6.Nl);
                if (G0 != this.L0) {
                    this.L0 = G0;
                    org.telegram.ui.ActionBar.n6.H1(seVar.getBackground(), Color.argb(24, Color.red(G0), Color.green(G0), Color.blue(G0)), true);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        ai.l0 l0Var = this.j1;
        if (l0Var != null) {
            l0Var.J();
        }
        v2();
        RecordCircle recordCircle = this.D2;
        if (recordCircle != null) {
            recordCircle.h();
        }
        sg sgVar = this.b2;
        if (sgVar != null) {
            sgVar.h();
        }
        SlideTextView slideTextView = this.a2;
        if (slideTextView != null) {
            slideTextView.b();
        }
        vg vgVar = this.Z0;
        if (vgVar != null && (textPaint = vgVar.G) != null) {
            textPaint.setColor(vgVar.J.G0(org.telegram.ui.ActionBar.n6.G6));
        }
        x61 x61Var = this.g1;
        if (x61Var != null) {
            x61Var.e.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.a7, false));
            x61Var.M = 0;
            v61 v61Var = x61Var.Q;
            if (v61Var != null) {
                v61Var.b();
            }
        }
        NumberTextView numberTextView = this.c0;
        if (numberTextView != null && this.F0 != null) {
            if (this.e0 - this.d0 < 0) {
                numberTextView.setTextColor(G0(org.telegram.ui.ActionBar.n6.p7));
            } else {
                numberTextView.setTextColor(G0(org.telegram.ui.ActionBar.n6.y6));
            }
        }
        Color.alpha(G0(org.telegram.ui.ActionBar.n6.Tf));
        ff ffVar = this.n0;
        if (ffVar != null) {
            ffVar.d.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.zj, false));
            fh.g gVar = ffVar.r;
            if (gVar != null) {
                gVar.updateColors();
            }
            ffVar.invalidate();
        }
        ag agVar = this.x2;
        if (agVar != null) {
            agVar.d();
        }
        int G02 = this.b1 ? G0(org.telegram.ui.ActionBar.n6.Nl) : -1;
        qe qeVar = this.c1;
        if (qeVar != null && (!this.S6 || G02 != this.Q6)) {
            this.S6 = true;
            this.Q6 = G02;
            qeVar.setColorFilter(new PorterDuffColorFilter(G02, PorterDuff.Mode.SRC_IN));
        }
        int G03 = G0(org.telegram.ui.ActionBar.n6.i6);
        if (this.T6 && G03 == this.R6) {
            return;
        }
        this.T6 = true;
        this.R6 = G03;
        ge geVar = this.R0;
        if (geVar != null) {
            geVar.setBackground(org.telegram.ui.ActionBar.n6.h0(G03, 1, -1));
        }
        ImageView imageView = this.S0;
        if (imageView != null) {
            float L = org.telegram.messenger.g0.L(19.0f);
            int L2 = org.telegram.messenger.g0.L(1.0f);
            int L3 = org.telegram.messenger.g0.L(3.0f);
            imageView.setBackground(org.telegram.ui.ActionBar.n6.Y(L, G03, L2, L3, L2, L3));
        }
    }

    public final void v(org.telegram.messenger.xy xyVar) {
        mg mgVar = this.P3;
        if (mgVar != null) {
            xyVar.H = mgVar.Y0();
            xyVar.J = this.P3.a0();
        }
    }

    public final void v0(Canvas canvas, boolean z10) {
        if (this.Y5) {
            int z11 = (int) com.google.android.gms.internal.vision.e2.z(1.0f, this.c6, org.telegram.ui.ActionBar.n6.i3.getIntrinsicHeight(), this.J2);
            View view = this.w2;
            if (view != null && view.getVisibility() == 0) {
                z11 = (int) (((1.0f - getTopViewEnterProgress()) * this.w2.getLayoutParams().height) + z11);
            }
            int intrinsicHeight = org.telegram.ui.ActionBar.n6.i3.getIntrinsicHeight() + z11;
            if (z10) {
                org.telegram.ui.ActionBar.n6.i3.setAlpha((int) (this.c6 * 255.0f));
                org.telegram.ui.ActionBar.n6.i3.setBounds(0, z11, getMeasuredWidth(), intrinsicHeight);
                org.telegram.ui.ActionBar.n6.i3.draw(canvas);
            }
            if (!this.X5) {
                float f10 = intrinsicHeight;
                float width = getWidth();
                float height = getHeight();
                org.telegram.ui.ActionBar.i6 i6Var = this.M4;
                Paint e10 = i6Var != null ? i6Var.e("paintChatComposeBackground") : null;
                if (e10 == null) {
                    e10 = org.telegram.ui.ActionBar.n6.V0("paintChatComposeBackground");
                }
                canvas.drawRect(0.0f, f10, width, height, e10);
                return;
            }
            int G0 = G0(org.telegram.ui.ActionBar.n6.Je);
            Paint paint = this.b6;
            paint.setColor(G0);
            if (!org.telegram.messenger.bz.f() || this.c2 == null) {
                canvas.drawRect(0.0f, intrinsicHeight, getWidth(), getHeight(), paint);
            } else {
                this.d6.set(0, intrinsicHeight, getWidth(), getHeight());
                this.c2.H(canvas, getTop(), this.d6, paint, false);
            }
        }
    }

    public final void v1(SpannableStringBuilder spannableStringBuilder, boolean z10, int i7, int i10) {
        if (this.F0 == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        org.telegram.messenger.j6.m(spannableStringBuilder2, this.F0.getPaint().getFontMetricsInt(), false, null, 0);
        x5[] x5VarArr = (x5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), x5.class);
        if (x5VarArr != null) {
            for (x5 x5Var : x5VarArr) {
                x5Var.applyFontMetrics(this.F0.getPaint().getFontMetricsInt(), o5.f());
            }
        }
        ih0.a(spannableStringBuilder2);
        T();
        setFieldText(spannableStringBuilder2);
        x1(z10, i7, i10, 0L, true);
    }

    public final void v2() {
        int G0 = G0(org.telegram.ui.ActionBar.n6.ag);
        int G02 = G0(org.telegram.ui.ActionBar.n6.Je);
        int G03 = G0(org.telegram.ui.ActionBar.n6.Vf);
        qh0 qh0Var = this.h1;
        if (qh0Var != null) {
            qh0Var.h(G0, "Cup Red");
            this.h1.h(G0, "Box Red");
            this.h1.h(G03, "Cup Grey");
            this.h1.h(G03, "Box Grey");
            this.h1.h(G03, "Box_Grey 2");
            this.h1.h(G03, "Line 1");
            this.h1.h(G03, "Line 2");
            this.h1.h(G03, "Line 3");
            this.h1.h(G02, "Line 1 Dup");
            this.h1.h(G02, "Line 2 Dup");
            this.h1.h(G02, "Line 3 Dup");
        }
    }

    public final void w(float f10) {
        this.V1 = f10;
        zi0 zi0Var = this.i1;
        if (zi0Var != null) {
            zi0Var.setNewContentAlpha(1.0f);
            this.i1.setAlpha(Math.max(0.0f, 1.0f - (1.8f * f10)));
            float T1 = org.telegram.messenger.g0.T1(1.0f, 0.94f, f10);
            this.i1.setPivotX(org.telegram.messenger.g0.L(17.0f));
            this.i1.setPivotY(r4.getHeight() / 2.0f);
            this.i1.setScaleX(T1);
            this.i1.setScaleY(T1);
            this.i1.setTranslationX((-org.telegram.messenger.g0.L(20.0f)) * f10);
            this.i1.setVisibility(f10 >= 1.0f ? 4 : 0);
        }
        yh.a aVar = this.T1;
        if (aVar != null) {
            aVar.setModeProgress(f10);
            this.T1.setVisibility(f10 <= 0.0f ? 8 : 0);
        }
    }

    public final boolean w0(Canvas canvas, org.telegram.messenger.o10 o10Var) {
        float f10;
        float f11;
        float f12;
        float f13;
        float d = this.c7.d(this.F0.canScrollVertically(-1));
        float d2 = this.d7.d(this.F0.canScrollVertically(1));
        if (d <= 0.0f && d2 <= 0.0f) {
            return ((Boolean) o10Var.run()).booleanValue();
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, this.F0.getX() + this.F0.getMeasuredWidth() + org.telegram.messenger.g0.L(5.0f), this.F0.getY() + this.F0.getMeasuredHeight() + org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.ks.e4, 31);
        boolean booleanValue = ((Boolean) o10Var.run()).booleanValue();
        canvas.save();
        LinearGradient linearGradient = this.a7;
        Paint paint = this.Z6;
        Matrix matrix = this.b7;
        if (d > 0.0f) {
            RectF rectF = org.telegram.messenger.g0.P;
            f12 = 255.0f;
            f13 = 16.0f;
            f10 = 0.0f;
            f11 = 5.0f;
            rectF.set(this.F0.getX() - org.telegram.messenger.g0.L(5.0f), (this.F0.getY() + this.J2) - 1.0f, this.F0.getX() + this.F0.getMeasuredWidth() + org.telegram.messenger.g0.L(5.0f), this.F0.getY() + this.J2 + org.telegram.messenger.g0.L(13.0f));
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

    public boolean w1() {
        ai.l0 l0Var = this.j1;
        int i7 = 4;
        if (l0Var != null && l0Var.r == 4) {
            return false;
        }
        boolean z10 = this.r6;
        org.telegram.ui.bn bnVar = this.F3;
        int i10 = 1;
        if (!z10) {
            if (this.q6) {
                return true;
            }
            if (this.F0 != null && this.P2 == null && !this.t2 && !c() && (bnVar == null || !bnVar.y())) {
                q0 b10 = r0.b(this.R, bnVar != null ? bnVar.a() : this.G3);
                if (b10 != null) {
                    Editable text = this.F0.getText();
                    String obj = text == null ? "" : text.toString();
                    if (!TextUtils.isEmpty(obj.trim()) && !obj.trim().startsWith("/")) {
                        h2();
                        this.q6 = true;
                        p0 p0Var = this.n6;
                        if (p0Var != null) {
                            if (!p0Var.d) {
                                p0Var.d = true;
                                p0Var.a.invalidate();
                            }
                            this.n6.c(true);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
                        int i11 = this.R;
                        bi.r6 r6Var = new bi.r6(16, this, obj);
                        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                        CharSequence[] charSequenceArr = {spannableStringBuilder};
                        tL_textWithEntities.entities = org.telegram.messenger.ri.d0(i11).Y(charSequenceArr, true, true);
                        CharSequence charSequence = charSequenceArr[0];
                        tL_textWithEntities.text = charSequence != null ? charSequence.toString() : "";
                        TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = new TLRPC.TL_messages_composeMessageWithAI();
                        tL_messages_composeMessageWithAI.text = tL_textWithEntities;
                        tL_messages_composeMessageWithAI.proofread = b10.a;
                        tL_messages_composeMessageWithAI.emojify = b10.b;
                        tL_messages_composeMessageWithAI.translate_to_lang = b10.c;
                        TL_aicompose.InputAiComposeTone inputAiComposeTone = b10.d;
                        if (!(inputAiComposeTone instanceof TL_aicompose.inputAiComposeToneSingleUse)) {
                            inputAiComposeTone = r0.d(inputAiComposeTone);
                        }
                        tL_messages_composeMessageWithAI.tone = inputAiComposeTone;
                        this.p6 = ConnectionsManager.getInstance(i11).sendRequestTyped(tL_messages_composeMessageWithAI, new d3.b(i10), new d(r6Var, i7));
                        return true;
                    }
                }
            }
        }
        boolean z11 = this.t2;
        org.telegram.ui.ActionBar.i6 i6Var = this.M4;
        if (z11 && !org.telegram.messenger.i10.i(this.R).q()) {
            oi.b2.u0(getContext(), new td(this, 5), new td(this, 6), i6Var);
            return true;
        }
        if (!c()) {
            return x1(true, 0, 0, 0L, true);
        }
        b5.J(this.E3, bnVar.a(), new ke(this, 3), i6Var);
        return true;
    }

    public final void w2() {
        org.telegram.messenger.ut utVar = this.s2;
        if (utVar == null) {
            return;
        }
        boolean z10 = this.t2;
        boolean z11 = this.u2 != null && this.P2 == null;
        this.t2 = z11;
        se seVar = this.K0;
        ImageView imageView = this.S0;
        ge geVar = this.R0;
        if (z11) {
            utVar.setResourcesProvider(this.M4);
            this.s2.set(this.u2);
            this.s2.setVisibility(0);
            hf hfVar = this.F0;
            if (hfVar != null) {
                hfVar.setVisibility(8);
            }
            geVar.setVisibility(8);
            imageView.setVisibility(0);
            seVar.setLocked(!org.telegram.messenger.i10.i(this.R).q());
        } else {
            utVar.setVisibility(8);
            hf hfVar2 = this.F0;
            if (hfVar2 != null) {
                hfVar2.setVisibility(0);
            }
            geVar.setVisibility(0);
            imageView.setVisibility(8);
            seVar.setLocked(false);
        }
        n2();
        if (z10 != this.t2) {
            P(true);
        }
    }

    public boolean x() {
        return false;
    }

    public final void x0(FrameLayout frameLayout, Canvas canvas, float f10, float f11, float f12, float f13) {
        fh.g gVar;
        float f14;
        zi0 zi0Var = this.i1;
        float trimProgress = (zi0Var == null || !this.K1) ? 0.0f : zi0Var.getTrimProgress();
        if (trimProgress <= 0.0f || this.i1.getVisibility() != 0) {
            return;
        }
        zi0 zi0Var2 = this.i1;
        if (zi0Var2.T0 == null && f13 > f12) {
            zi0Var2.getLocationInWindow(this.t5);
            float trimHandleX = this.i1.getTrimHandleX() + r10[0];
            float N = org.telegram.messenger.g0.N(6.0f);
            float N2 = org.telegram.messenger.g0.N(11.0f);
            float trimWindowTop = ((this.i1.getTrimWindowTop() + r10[1]) - org.telegram.messenger.g0.N(4.0f)) - N;
            String trimBubbleText = this.i1.getTrimBubbleText();
            float L = org.telegram.messenger.g0.L(13.0f);
            TextPaint textPaint = this.n5;
            textPaint.setTextSize(L);
            textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
            textPaint.setColor(-1);
            float measureText = textPaint.measureText(trimBubbleText);
            float N3 = org.telegram.messenger.g0.N(23.0f) + measureText;
            float N4 = org.telegram.messenger.g0.N(29.0f);
            float max = Math.max(org.telegram.messenger.g0.L(8.0f), Math.min((org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(8.0f)) - N3, trimHandleX - (N3 / 2.0f)));
            RectF rectF = this.s5;
            rectF.set(max, trimWindowTop - N4, max + N3, trimWindowTop);
            float i7 = Utilities.i(trimHandleX, rectF.right - org.telegram.messenger.g0.L(16.0f), rectF.left + org.telegram.messenger.g0.L(16.0f));
            Path path = this.q5;
            path.rewind();
            float f15 = N4 / 2.0f;
            path.addRoundRect(rectF, f15, f15, Path.Direction.CW);
            Path path2 = this.r5;
            path2.rewind();
            float f16 = i7 - N2;
            path2.moveTo(f16, trimWindowTop - org.telegram.messenger.g0.N(2.0f));
            path2.lineTo(f16, trimWindowTop);
            float f17 = trimWindowTop + N;
            path2.cubicTo(i7 - org.telegram.messenger.g0.N(6.5f), trimWindowTop, i7 - org.telegram.messenger.g0.N(3.2f), f17, i7, f17);
            float N5 = org.telegram.messenger.g0.N(3.2f) + i7;
            float N6 = org.telegram.messenger.g0.N(6.5f) + i7;
            float f18 = i7 + N2;
            path2.cubicTo(N5, f17, N6, trimWindowTop, f18, trimWindowTop);
            path2.lineTo(f18, trimWindowTop - org.telegram.messenger.g0.N(2.0f));
            path2.close();
            path.op(path2, Path.Op.UNION);
            canvas.save();
            canvas.translate(-f10, -f11);
            canvas.clipRect(-100000.0f, f12, 100000.0f, f13);
            float T1 = org.telegram.messenger.g0.T1(0.8f, 1.0f, trimProgress);
            canvas.scale(T1, T1, i7, f17);
            canvas.translate(0.0f, (1.0f - trimProgress) * org.telegram.messenger.g0.L(6.0f));
            dh.c cVar = this.L1;
            if (cVar == null) {
                gVar = null;
            } else {
                boolean z10 = frameLayout != this;
                fh.g gVar2 = z10 ? this.v5 : this.w5;
                if (gVar2 == null) {
                    gVar = cVar.c(frameLayout, this.x5, false);
                    gVar.r(0.0f);
                    gVar.W = 0.0f;
                    if (z10) {
                        this.v5 = gVar;
                    } else {
                        this.w5 = gVar;
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
            int r12 = org.telegram.ui.ActionBar.n6.r1((gVar != null ? 0.5f : 0.6f) * trimProgress, -16777216);
            Paint paint = this.o5;
            paint.setColor(r12);
            canvas.drawPath(path, paint);
            Paint.Style style = Paint.Style.STROKE;
            Paint paint2 = this.p5;
            paint2.setStyle(style);
            paint2.setStrokeWidth(org.telegram.messenger.g0.N(0.66f));
            paint2.setColor(org.telegram.ui.ActionBar.n6.r1(0.16f * trimProgress, -1));
            canvas.drawPath(path, paint2);
            textPaint.setAlpha((int) (trimProgress * f14));
            canvas.drawText(trimBubbleText, rectF.centerX() - (measureText / 2.0f), rectF.centerY() - ((textPaint.ascent() + textPaint.descent()) / 2.0f), textPaint);
            canvas.restore();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f8, code lost:
    
        if (r11.X1(new bi.r4(r37, r38, r39, r40, r41)) != false) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:243:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x067a A[LOOP:1: B:207:0x0422->B:265:0x067a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x062a A[EDGE_INSN: B:266:0x062a->B:267:0x062a BREAK  A[LOOP:1: B:207:0x0422->B:265:0x067a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0571  */
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
    /* JADX WARN: Type inference failed for: r3v9, types: [org.telegram.messenger.fj, org.telegram.tgnet.TLRPC$WebPage] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean x1(final boolean z10, final int i7, final int i10, long j3, boolean z11) {
        ChatActivityEnterView chatActivityEnterView;
        ChatActivityEnterView chatActivityEnterView2;
        boolean z12;
        int i11;
        int i12;
        int i13;
        int i14;
        org.telegram.messenger.bj bjVar;
        org.telegram.messenger.bj bjVar2;
        org.telegram.messenger.fj threadMessage;
        int i15;
        CharSequence charSequence;
        CharSequence charSequence2;
        String str;
        org.telegram.ui.bn bnVar;
        ?? r32;
        TLRPC.WebPage webPage;
        boolean z13;
        org.telegram.messenger.jj jjVar;
        org.telegram.messenger.jj jjVar2;
        ChatActivityEnterView chatActivityEnterView3;
        TLRPC.Chat chat;
        org.telegram.messenger.jj jjVar3;
        org.telegram.messenger.fj fjVar;
        mg mgVar;
        TLRPC.Chat chat2;
        TL_iv.RichMessage richMessage;
        ChatActivityEnterView chatActivityEnterView4;
        eg egVar;
        ?? r02 = z11 && !this.j7.f;
        if (r02 == true) {
            boolean Y = b5.Y(this.R, this.G3, getMessagesCount(), new org.telegram.messenger.w10() { // from class: org.telegram.ui.Components.ae
                @Override // org.telegram.messenger.w10
                public final void a(Object obj) {
                    int i16 = ChatActivityEnterView.s7;
                    ChatActivityEnterView chatActivityEnterView5 = ChatActivityEnterView.this;
                    chatActivityEnterView5.getClass();
                    chatActivityEnterView5.x1(z10, i7, i10, ((Long) obj).longValue(), false);
                }
            }, j3);
            if (Y && this.i5) {
                if (this.d1) {
                    if (!this.P3.d1()) {
                        SlideTextView slideTextView = this.a2;
                        if (slideTextView != null) {
                            slideTextView.setEnabled(false);
                        }
                        this.P3.j1();
                        return Y;
                    }
                } else if (!MediaController.B().K()) {
                    if (this.i5) {
                        this.z4 = true;
                    }
                    MediaController.B().D0(this.P);
                    this.P3.U0(0);
                    SlideTextView slideTextView2 = this.a2;
                    if (slideTextView2 != null) {
                        slideTextView2.setEnabled(false);
                    }
                }
            }
            return Y;
        }
        if (this.H0 != Integer.MAX_VALUE || c()) {
            org.telegram.ui.bn bnVar2 = this.F3;
            if (bnVar2 != null) {
                TLRPC.Chat chat3 = bnVar2.e;
                if (bnVar2.j() != null || ((org.telegram.messenger.v3.T(chat3) && chat3.megagroup) || !org.telegram.messenger.v3.T(chat3))) {
                    org.telegram.messenger.mp.u1(this.R).g7.edit().putBoolean("silent_" + this.G3, !z10).commit();
                }
            }
            if (this.p4) {
                S1(false, true, false, true);
                if (this.H2 != 0 && (egVar = this.V0) != null) {
                    egVar.t(false);
                    this.V0.A();
                }
            }
            if (r02 == true) {
                chatActivityEnterView = this;
            } else {
                chatActivityEnterView = this;
            }
            chatActivityEnterView.e6 = true;
            org.telegram.messenger.d20 d20Var = chatActivityEnterView.U3;
            se seVar = chatActivityEnterView.K0;
            if (d20Var != null) {
                chatActivityEnterView.P3.o2(4, i7, chatActivityEnterView.P ? Integer.MAX_VALUE : 0, chatActivityEnterView.P6, j3, z10);
                chatActivityEnterView.P6 = 0L;
                seVar.setEffect(0L);
                chatActivityEnterView.N0(true);
                chatActivityEnterView.P(true);
                org.telegram.messenger.g0.h3(new dd(chatActivityEnterView, 11), 100L);
                chatActivityEnterView.Y1 = 0L;
            } else {
                TLRPC.TL_document tL_document = chatActivityEnterView.R3;
                if (tL_document != null && chatActivityEnterView.K1 && chatActivityEnterView.U1) {
                    yh.a aVar = chatActivityEnterView.T1;
                    if (aVar != null) {
                        aVar.getText().getClass();
                    }
                    if (seVar != null) {
                        org.telegram.messenger.g0.E3(3.0f, seVar, null);
                    }
                    chatActivityEnterView2 = chatActivityEnterView;
                } else {
                    if (tL_document != null) {
                        org.telegram.messenger.fj fjVar2 = MediaController.B().v0;
                        if (fjVar2 != null && fjVar2 == chatActivityEnterView.T3) {
                            MediaController.B().q(true, true, false, false);
                        }
                        MediaController.B().n(false);
                        org.telegram.messenger.ri.d0(chatActivityEnterView.R).F1(chatActivityEnterView.G3, (bnVar2 == null || !bnVar2.x4) ? 0L : bnVar2.b(), null);
                        zi0 zi0Var = chatActivityEnterView.i1;
                        if (zi0Var != null && (zi0Var.s > 0.0f || zi0Var.w < 1.0f)) {
                            zi0Var.setPlaying(false);
                            String s5 = a8.p0.s(new StringBuilder(), chatActivityEnterView.S3, ".ogg");
                            if (MediaController.cropOpusFile(chatActivityEnterView.S3, s5, chatActivityEnterView.i1.getAudioLeftMs(), chatActivityEnterView.i1.getAudioRightMs())) {
                                try {
                                    new File(chatActivityEnterView.S3).delete();
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                }
                                try {
                                    new File(s5).renameTo(new File(chatActivityEnterView.S3));
                                } catch (Exception e11) {
                                    org.telegram.messenger.a8.g(e11, true);
                                }
                                int i16 = 0;
                                while (true) {
                                    if (i16 >= chatActivityEnterView.R3.attributes.size()) {
                                        break;
                                    }
                                    TLRPC.DocumentAttribute documentAttribute = chatActivityEnterView.R3.attributes.get(i16);
                                    if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                        documentAttribute.waveform = MediaController.getWaveform(chatActivityEnterView.S3);
                                        documentAttribute.duration = chatActivityEnterView.i1.getNewDuration();
                                        break;
                                    }
                                    i16++;
                                }
                            }
                        }
                        org.telegram.messenger.xy f10 = org.telegram.messenger.xy.f(chatActivityEnterView.R3, null, chatActivityEnterView.S3, chatActivityEnterView.G3, chatActivityEnterView.J3, chatActivityEnterView.getThreadMessage(), null, null, null, null, z10, i7, 0, chatActivityEnterView.P ? Integer.MAX_VALUE : 0, null, null, false);
                        f10.K = bnVar2 != null ? bnVar2.Y8() : null;
                        f10.O = this.P6;
                        f10.Q = j3;
                        f10.R = getSendMonoForumPeerId();
                        f10.T = getSendMessageSuggestionParams();
                        this.P6 = 0L;
                        seVar.setEffect(0L);
                        if (!this.P3.v1()) {
                            org.telegram.messenger.bj bjVar3 = new org.telegram.messenger.bj();
                            bjVar3.h = System.currentTimeMillis() - this.N0 < 200;
                            f10.E = bjVar3;
                        }
                        v(f10);
                        org.telegram.messenger.zy.C(this.R).r0(f10);
                        mg mgVar2 = this.P3;
                        if (mgVar2 != null) {
                            chatActivityEnterView4 = this;
                            mgVar2.G(null, z10, i7, i10, j3);
                        } else {
                            chatActivityEnterView4 = this;
                        }
                        chatActivityEnterView4.N0(true);
                        chatActivityEnterView4.P(true);
                        org.telegram.messenger.g0.h3(new dd(chatActivityEnterView4, 12), 100L);
                        chatActivityEnterView4.Y1 = 0L;
                        return false;
                    }
                    ChatActivityEnterView chatActivityEnterView5 = chatActivityEnterView;
                    long j10 = 200;
                    String str2 = "";
                    if (!chatActivityEnterView5.t2 || (richMessage = chatActivityEnterView5.u2) == null) {
                        org.telegram.ui.bn bnVar3 = bnVar2;
                        int i17 = 1;
                        chatActivityEnterView2 = chatActivityEnterView5;
                        se seVar2 = seVar;
                        hf hfVar = chatActivityEnterView2.F0;
                        CharSequence textToUse = hfVar == null ? "" : hfVar.getTextToUse();
                        if (bnVar3 != null && (chat2 = bnVar3.e) != null && chat2.slowmode_enabled && !org.telegram.messenger.v3.N(chat2)) {
                            int length = textToUse.length();
                            int w12 = org.telegram.messenger.mp.u1(chatActivityEnterView2.S.a).w1();
                            org.telegram.ui.ActionBar.i6 i6Var = chatActivityEnterView2.M4;
                            if (length > w12) {
                                b5.r0(bnVar3, org.telegram.messenger.gd.N0(2131745114, "Slowmode"), org.telegram.messenger.gd.N0(2131745105, "SlowmodeSendErrorTooLong"), i6Var);
                            } else if (chatActivityEnterView2.x3 && textToUse.length() > 0) {
                                b5.r0(bnVar3, org.telegram.messenger.gd.N0(2131745114, "Slowmode"), org.telegram.messenger.gd.N0(2131745106, "SlowmodeSendError"), i6Var);
                            }
                        }
                        if (!N(chatActivityEnterView2.R, chatActivityEnterView2.G3, bnVar3, textToUse)) {
                            org.telegram.ui.rm rmVar = chatActivityEnterView2.L3;
                            if (rmVar == null || bnVar3 == null || !rmVar.f) {
                                int[] iArr = new int[1];
                                org.telegram.messenger.j6.j(textToUse, iArr);
                                ?? r28 = 0;
                                ?? r16 = iArr[0] > 0;
                                CharSequence n1 = r16 == false ? org.telegram.messenger.g0.n1(textToUse) : textToUse;
                                boolean g22 = chatActivityEnterView2.g2();
                                int w13 = org.telegram.messenger.mp.u1(chatActivityEnterView2.S.a).w1();
                                if (n1.length() != 0) {
                                    if (chatActivityEnterView2.P3 != null && bnVar3 != null) {
                                        if ((i7 != 0) == bnVar3.c()) {
                                            chatActivityEnterView2.P3.y0();
                                        }
                                    }
                                    int i18 = 0;
                                    while (true) {
                                        int i19 = i18 + w13;
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
                                        ArrayList Y2 = org.telegram.messenger.ri.d0(chatActivityEnterView2.R).Y(charSequenceArr, g22, i17);
                                        if (!chatActivityEnterView2.P3.v1()) {
                                            bjVar2 = new org.telegram.messenger.bj();
                                            bjVar2.h = System.currentTimeMillis() - chatActivityEnterView2.N0 < j10 ? i17 : r28;
                                            bjVar2.c = org.telegram.messenger.g0.L(22.0f);
                                            hf hfVar2 = chatActivityEnterView2.F0;
                                            if (hfVar2 != null) {
                                                hfVar2.getLocationInWindow(chatActivityEnterView2.D3);
                                                bjVar2.a = org.telegram.messenger.g0.L(11.0f) + r13[r28];
                                                bjVar2.b = org.telegram.messenger.g0.L(19.0f) + r13[i17];
                                            } else {
                                                bjVar2.a = org.telegram.messenger.g0.L(55.0f);
                                                bjVar2.b = org.telegram.messenger.g0.q.y - org.telegram.messenger.g0.L(19.0f);
                                            }
                                        } else if (chatActivityEnterView2.M0 != null) {
                                            bjVar2 = new org.telegram.messenger.bj();
                                            bjVar2.h = System.currentTimeMillis() - chatActivityEnterView2.N0 < j10 ? i17 : r28;
                                        } else {
                                            bjVar = null;
                                            boolean h = org.telegram.messenger.zy.h(n1);
                                            threadMessage = chatActivityEnterView2.getThreadMessage();
                                            if (threadMessage == null && (fjVar = chatActivityEnterView2.K3) != null) {
                                                threadMessage = fjVar;
                                            }
                                            String charSequence3 = charSequenceArr[r28].toString();
                                            i15 = min;
                                            boolean z14 = g22;
                                            long j11 = chatActivityEnterView2.G3;
                                            se seVar3 = seVar2;
                                            org.telegram.messenger.fj fjVar3 = chatActivityEnterView2.J3;
                                            TLRPC.WebPage webPage2 = chatActivityEnterView2.N3;
                                            charSequence = n1;
                                            boolean z15 = chatActivityEnterView2.O3;
                                            charSequence2 = textToUse;
                                            str = str2;
                                            bnVar = bnVar3;
                                            org.telegram.messenger.xy b10 = org.telegram.messenger.xy.b(charSequence3, j11, fjVar3, threadMessage, webPage2, z15, Y2, null, null, z10, i7, i10, bjVar, h);
                                            b10.K = bnVar == null ? bnVar.Y8() : null;
                                            b10.O = this.P6;
                                            b10.Q = j3;
                                            b10.R = getSendMonoForumPeerId();
                                            b10.T = getSendMessageSuggestionParams();
                                            this.P6 = 0L;
                                            seVar3.setEffect(0L);
                                            v(b10);
                                            b10.L = bnVar == null && (jjVar3 = bnVar.x5) != null && jjVar3.r;
                                            if (bnVar != null || (chat = bnVar.e) == null || org.telegram.messenger.v3.m(chat)) {
                                                r32 = 0;
                                                r32 = 0;
                                                r32 = 0;
                                                z12 = false;
                                                webPage = this.N3;
                                                if (webPage instanceof TLRPC.TL_webPagePending) {
                                                    z13 = true;
                                                    if (webPage != null) {
                                                        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                                                        b10.n = tL_messageMediaWebPage;
                                                        tL_messageMediaWebPage.webpage = this.N3;
                                                        tL_messageMediaWebPage.force_large_media = (bnVar == null || (jjVar2 = bnVar.x5) == null || jjVar2.q) ? false : true;
                                                        tL_messageMediaWebPage.force_small_media = (bnVar == null || (jjVar = bnVar.x5) == null || !jjVar.q) ? false : true;
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
                                            if (bnVar != null) {
                                                bnVar.H5 = r32;
                                                bnVar.Y5 = r32;
                                                org.telegram.messenger.jj jjVar4 = bnVar.x5;
                                                if (jjVar4 != null) {
                                                    jjVar4.e(this.R, null, "", null, null, null);
                                                }
                                                this.N3 = r32;
                                                this.O3 = z13;
                                                bnVar.B8();
                                            }
                                            org.telegram.messenger.zy.C(this.R).r0(b10);
                                            int i22 = i15 + 1;
                                            if (i15 != charSequence.length()) {
                                                break;
                                            }
                                            seVar2 = seVar3;
                                            i17 = z13;
                                            r28 = z12;
                                            bnVar3 = bnVar;
                                            n1 = charSequence;
                                            g22 = z14;
                                            str2 = str;
                                            j10 = 200;
                                            i18 = i22;
                                            chatActivityEnterView2 = this;
                                            textToUse = charSequence2;
                                        }
                                        bjVar = bjVar2;
                                        boolean h7 = org.telegram.messenger.zy.h(n1);
                                        threadMessage = chatActivityEnterView2.getThreadMessage();
                                        if (threadMessage == null) {
                                            threadMessage = fjVar;
                                        }
                                        String charSequence32 = charSequenceArr[r28].toString();
                                        i15 = min;
                                        boolean z142 = g22;
                                        long j112 = chatActivityEnterView2.G3;
                                        se seVar32 = seVar2;
                                        org.telegram.messenger.fj fjVar32 = chatActivityEnterView2.J3;
                                        TLRPC.WebPage webPage22 = chatActivityEnterView2.N3;
                                        charSequence = n1;
                                        boolean z152 = chatActivityEnterView2.O3;
                                        charSequence2 = textToUse;
                                        str = str2;
                                        bnVar = bnVar3;
                                        org.telegram.messenger.xy b102 = org.telegram.messenger.xy.b(charSequence32, j112, fjVar32, threadMessage, webPage22, z152, Y2, null, null, z10, i7, i10, bjVar, h7);
                                        b102.K = bnVar == null ? bnVar.Y8() : null;
                                        b102.O = this.P6;
                                        b102.Q = j3;
                                        b102.R = getSendMonoForumPeerId();
                                        b102.T = getSendMessageSuggestionParams();
                                        this.P6 = 0L;
                                        seVar32.setEffect(0L);
                                        v(b102);
                                        b102.L = bnVar == null && (jjVar3 = bnVar.x5) != null && jjVar3.r;
                                        if (bnVar != null) {
                                        }
                                        r32 = 0;
                                        r32 = 0;
                                        r32 = 0;
                                        z12 = false;
                                        webPage = this.N3;
                                        if (webPage instanceof TLRPC.TL_webPagePending) {
                                        }
                                        if (bnVar != null) {
                                        }
                                        org.telegram.messenger.zy.C(this.R).r0(b102);
                                        int i222 = i15 + 1;
                                        if (i15 != charSequence.length()) {
                                        }
                                    }
                                    if (this.P3.v1() || (!(i7 == 0 || c()) || c())) {
                                        chatActivityEnterView3 = this;
                                        hf hfVar3 = chatActivityEnterView3.F0;
                                        if (hfVar3 != null) {
                                            hfVar3.setText(str);
                                        }
                                        mg mgVar3 = chatActivityEnterView3.P3;
                                        if (mgVar3 != null) {
                                            mgVar3.G(charSequence2, z10, i7, i10, j3);
                                        }
                                    } else {
                                        this.h0 = z12;
                                        bi.t4 t4Var = new bi.t4(this, charSequence2, z10, i7, i10, j3);
                                        chatActivityEnterView3 = this;
                                        chatActivityEnterView3.g0 = t4Var;
                                        org.telegram.messenger.g0.h3(t4Var, 200L);
                                    }
                                    chatActivityEnterView3.s3 = 0L;
                                    chatActivityEnterView3.B2();
                                    return z12;
                                }
                                z12 = false;
                            } else {
                                bnVar3.yc();
                                z12 = false;
                            }
                            chatActivityEnterView3 = chatActivityEnterView2;
                            if (chatActivityEnterView3.x3 && (mgVar = chatActivityEnterView3.P3) != null) {
                                mgVar.G(null, z10, i7, i10, j3);
                            }
                            chatActivityEnterView3.B2();
                            return z12;
                        }
                    } else {
                        org.telegram.messenger.zy.R(chatActivityEnterView5.S, richMessage.blocks, richMessage.photos, richMessage.documents, null, chatActivityEnterView5.G3, chatActivityEnterView5.J3, chatActivityEnterView5.getThreadMessage(), chatActivityEnterView5.L3, z10, i7, i10, bnVar2 != null ? bnVar2.Y8() : null, chatActivityEnterView5.P6, chatActivityEnterView5.getSendMonoForumPeerId(), j3);
                        chatActivityEnterView2 = this;
                        chatActivityEnterView2.P6 = 0L;
                        seVar.setEffect(0L);
                        chatActivityEnterView2.F0.setText("");
                        chatActivityEnterView2.T();
                        mg mgVar4 = chatActivityEnterView2.P3;
                        if (mgVar4 != null) {
                            mgVar4.G(null, z10, i7, i10, j3);
                        }
                        chatActivityEnterView2.P(true);
                    }
                }
            }
            return false;
        }
        mg mgVar5 = this.P3;
        if (mgVar5 != null) {
            mgVar5.K0();
            return false;
        }
        chatActivityEnterView2 = this;
        return false;
    }

    public final void x2(boolean z10) {
        boolean z11;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z12 = org.telegram.messenger.n5.z(this.G3);
        ImageView imageView = this.y2;
        if (z12) {
            TLRPC.Chat O0 = org.telegram.messenger.mp.u1(this.S.a).O0(Long.valueOf(-this.G3));
            this.W2 = org.telegram.messenger.mp.u1(this.R).g7.getBoolean("silent_" + this.G3, false);
            z11 = org.telegram.messenger.v3.T(O0) && (O0.creator || ((tL_chatAdminRights = O0.admin_rights) != null && tL_chatAdminRights.post_messages)) && !O0.megagroup;
            this.X2 = z11;
            if (imageView != null) {
                if (this.f0 == null) {
                    this.f0 = new hr(getContext(), R.drawable.input_notify_on, org.telegram.ui.ActionBar.n6.Nl);
                }
                this.f0.a(this.W2, false);
                imageView.setImageDrawable(this.f0);
            } else {
                z11 = false;
            }
            org.telegram.ui.b61 b61Var = this.f2;
            if (b61Var != null) {
                q2(b61Var.getVisibility() == 0 ? 1 : 0);
            }
        } else {
            z11 = false;
        }
        boolean z13 = (this.P3 == null || c() || !this.P3.w0()) ? false : true;
        boolean z14 = (!z13 || this.B2 || this.v3) ? false : true;
        if (z14) {
            g0();
        }
        te teVar = this.z2;
        if (teVar != null) {
            if ((teVar.getTag() != null && z14) || (this.z2.getTag() == null && !z14)) {
                if (imageView != null) {
                    int i7 = (z13 || !z11 || this.z2.getVisibility() == 0) ? 8 : 0;
                    if (i7 != imageView.getVisibility()) {
                        imageView.setVisibility(i7);
                        return;
                    }
                    return;
                }
                return;
            }
            this.z2.setTag(z14 ? 1 : null);
        } else if (imageView != null) {
            int i10 = (z13 || !z11) ? 8 : 0;
            if (i10 != imageView.getVisibility()) {
                imageView.setVisibility(i10);
            }
        }
        AnimatorSet animatorSet = this.C2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.C2 = null;
        }
        if (z10 && !z11) {
            te teVar2 = this.z2;
            if (teVar2 != null) {
                if (z14) {
                    teVar2.setVisibility(0);
                }
                this.z2.setPivotX(org.telegram.messenger.g0.L(24.0f));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.C2 = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.z2, (Property<te, Float>) View.ALPHA, z14 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.z2, (Property<te, Float>) View.SCALE_X, z14 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(this.z2, (Property<te, Float>) View.SCALE_Y, z14 ? 1.0f : 0.1f));
                this.C2.setDuration(180L);
                this.C2.addListener(new ve(this, z14, 3));
                this.C2.start();
                return;
            }
            return;
        }
        te teVar3 = this.z2;
        if (teVar3 == null) {
            if (imageView != null) {
                imageView.setVisibility(z11 ? 0 : 8);
                return;
            }
            return;
        }
        teVar3.setVisibility(z14 ? 0 : 8);
        this.z2.setAlpha(z14 ? 1.0f : 0.0f);
        this.z2.setScaleX(z14 ? 1.0f : 0.1f);
        this.z2.setScaleY(z14 ? 1.0f : 0.1f);
        if (imageView != null) {
            imageView.setVisibility((!z11 || this.z2.getVisibility() == 0) ? 8 : 0);
        }
        this.z2.setTranslationX(0.0f);
    }

    public final void y() {
        if (this.V0.getParent() == null) {
            if (this.e7 == null) {
                this.d2.addView(this.V0);
            } else {
                this.d2.addView(this.V0, c8.na.c(-1.0f, -1));
            }
        }
    }

    public final xf y0(org.telegram.messenger.fj fjVar, boolean z10) {
        xf xfVar = new xf(fjVar.K1, fjVar.k, true, true);
        if (z10) {
            hf hfVar = this.F0;
            CharSequence[] charSequenceArr = {hfVar == null ? "" : hfVar.getTextToUse()};
            ArrayList Y = org.telegram.messenger.ri.d0(this.R).Y(charSequenceArr, true, true);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceArr[0].toString());
            org.telegram.messenger.fj.b(spannableStringBuilder, Y, true, true, false, true, 0);
            xfVar.z = org.telegram.messenger.fj.B5(org.telegram.messenger.j6.m(spannableStringBuilder, org.telegram.ui.ActionBar.n6.o2.getFontMetricsInt(), false, null, 0), Y, org.telegram.ui.ActionBar.n6.o2.getFontMetricsInt(), false);
        }
        return xfVar;
    }

    public final void y1(boolean z10, boolean z11, boolean z12) {
        if ((this.z3 != z10 || this.A3 != z11) && this.V0 != null) {
            if (this.X0 && !z12) {
                this.w4 = true;
                L0(false);
            } else if (z12) {
                k1();
            }
        }
        this.y3 = true;
        this.z3 = z10;
        this.A3 = z11;
        eg egVar = this.V0;
        if (egVar != null) {
            egVar.I(true, z10, z11, true);
        }
        G1(false, !this.Z2);
    }

    public final void y2() {
        z2(true);
    }

    public final boolean z(boolean z10) {
        return z10 || this.R3 != null || W0() || E2();
    }

    public final void z0() {
        if (this.o6 != null || this.F0 == null) {
            return;
        }
        ai.j1 j1Var = new ai.j1(this.F0);
        this.o6 = j1Var;
        j1Var.C = true;
        j1Var.D = true;
        j1Var.F = 0.0f;
        j1Var.E = org.telegram.messenger.g0.L(5.0f);
        jh.f D0 = D0();
        if (D0 != null) {
            if (this.v6 == null) {
                this.v6 = new ai.q0();
            }
            if (D0.h == null) {
                D0.h = new g2(6, this, D0);
            }
        }
        int max = Math.max(this.F0.getWidth(), org.telegram.messenger.g0.q.x);
        ai.j1 j1Var2 = this.o6;
        int L = org.telegram.messenger.g0.L(160.0f);
        xu0 xu0Var = j1Var2.c;
        if (max <= 0 || L <= 0) {
            return;
        }
        int L2 = (org.telegram.messenger.g0.L(4.0f) + max) * L;
        int[] iArr = j1Var2.G;
        if (iArr == null || iArr.length < L2) {
            try {
                j1Var2.G = new int[L2];
            } catch (Throwable unused) {
            }
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(12.0f), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawColor(-16777216);
            int i7 = j1Var2.w;
            int i10 = j1Var2.x;
            j1Var2.w = 0;
            j1Var2.x = createBitmap.getHeight();
            int f10 = j1Var2.f(64, createBitmap, true);
            for (int i11 = 0; i11 < f10; i11++) {
                xu0 xu0Var2 = j1Var2.c;
                float[] fArr = j1Var2.i;
                int i12 = i11 * 3;
                xu0Var2.g(fArr[i12], fArr[i12 + 1], 1.0f, -1.0f, 0.05f, 0.0f);
            }
            xu0Var.b(canvas, 1.0f);
            xu0Var.a();
            j1Var2.k = 0;
            j1Var2.w = i7;
            j1Var2.x = i10;
            createBitmap.recycle();
        } catch (Throwable unused2) {
        }
    }

    public final void z1() {
        hi.u3 u3Var = this.M;
        if (u3Var == null) {
            return;
        }
        u3Var.v(org.telegram.messenger.j6.o(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131743515, org.telegram.messenger.n10.k(this.F3.j(), true))), this.M.getTextPaint().getFontMetricsInt(), 20, new td(this, 14)));
        hi.u3 u3Var2 = this.M;
        u3Var2.h = hi.u3.a(u3Var2.getText(), this.M.getTextPaint());
    }

    public void z2(boolean z10) {
        A2(false, z10);
    }

    @Override // org.telegram.ui.Components.xw0
    public mt getEditField() {
        return this.F0;
    }

    @Override // org.telegram.ui.Components.xw0
    public org.telegram.ui.bn getParentFragment() {
        return this.F3;
    }

    public void C0(Menu menu) {
    }

    public void c1(float f10) {
    }

    public void X0() {
    }

    @Override // te.b
    public final /* synthetic */ void G(float f10, int i7) {
    }

    public void e1(int i7, int i10) {
    }
}
