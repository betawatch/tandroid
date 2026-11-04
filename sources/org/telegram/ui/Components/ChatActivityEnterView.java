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
import android.view.Menu;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.TreeSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
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
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class ChatActivityEnterView extends FrameLayout implements org.telegram.messenger.cs, pt0, uv0, mw0, qe.b, org.telegram.ui.ActionBar.z5 {
    public static final /* synthetic */ int t5 = 0;
    public boolean A0;
    public final sd A1;
    public boolean A2;
    public boolean A3;
    public boolean A4;
    public boolean B0;
    public final sd B1;
    public int B2;
    public boolean B3;
    public boolean B4;
    public final HashMap C0;
    public final ImageView C1;
    public final boolean C2;
    public AnimatorSet C3;
    public final Paint C4;
    public boolean D0;
    public org.telegram.messenger.st D1;
    public long D2;
    public float D3;
    public float D4;
    public float E;
    public boolean E0;
    public boolean E1;
    public float E2;
    public int E3;
    public final Rect E4;
    public float F;
    public ve F0;
    public TL_iv.RichMessage F1;
    public float F2;
    public boolean F3;
    public boolean F4;
    public float G;
    public final cg G0;
    public ee G1;
    public boolean G2;
    public AnimatedArrowDrawable G3;
    public final yc G4;
    public float H;
    public int H0;
    public View H1;
    public int H2;
    public boolean H3;
    public org.telegram.ui.ActionBar.y0 H4;
    public float I;
    public yc I0;
    public gf I1;
    public boolean I2;
    public final he I3;
    public ArrayList I4;
    public float J;
    public final kh.h J0;
    public final ImageView J1;
    public boolean J2;
    public boolean J3;
    public boolean J4;
    public boolean K;
    public final ee K0;
    public ge K1;
    public boolean K2;
    public boolean K3;
    public View K4;
    public TLRPC.UserFull L;
    public int L0;
    public ie L1;
    public boolean L2;
    public final pf L3;
    public boolean L4;
    public gi.l3 M;
    public se M0;
    public boolean M1;
    public int M2;
    public final g2.g M3;
    public boolean M4;
    public gi.l3 N;
    public long N0;
    public AnimatorSet N1;
    public boolean N2;
    public final Paint N3;
    public boolean N4;
    public gi.l3 O;
    public re O0;
    public RecordCircle O1;
    public final int[] O2;
    public Drawable O3;
    public yc O4;
    public boolean P;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout P0;
    public yf P1;
    public final Activity P2;
    public Drawable P3;
    public final wp[] P4;
    public boolean Q;
    public final ImageView Q0;
    public final de Q1;
    public final org.telegram.ui.wm Q2;
    public Drawable Q3;
    public int Q4;
    public int R;
    public final ud R0;
    public final Paint R1;
    public long R2;
    public Drawable R3;
    public int R4;
    public org.telegram.messenger.c S;
    public final ImageView S0;
    public int S1;
    public boolean S2;
    public Drawable S3;
    public boolean S4;
    public boolean T;
    public ie T0;
    public yc T1;
    public int T2;
    public final RectF T3;
    public long T4;
    public int U;
    public boolean U0;
    public int U1;
    public org.telegram.messenger.zi U2;
    public final Rect U3;
    public int U4;
    public org.telegram.ui.ActionBar.h1 V;
    public kf V0;
    public bk0 V1;
    public org.telegram.messenger.zi V2;
    public final Rect V3;
    public int V4;
    public yc W;
    public AnimatorSet W0;
    public Editable W1;
    public org.telegram.ui.mm W2;
    public Drawable W3;
    public boolean W4;
    public boolean X0;
    public boolean X1;
    public org.telegram.messenger.zi X2;
    public final org.telegram.ui.ActionBar.e6 X3;
    public boolean X4;
    public boolean Y0;
    public boolean Y1;
    public TLRPC.WebPage Y2;
    public final boolean Y3;
    public ai.z Y4;
    public dg Z0;
    public boolean Z1;
    public boolean Z2;
    public final he Z3;
    public f60 Z4;
    public int a;
    public org.telegram.ui.lo a0;
    public final be a1;
    public org.telegram.messenger.zi a2;
    public uf a3;
    public final rd a4;
    public int a5;
    public boolean b;
    public boolean b0;
    public boolean b1;
    public boolean b2;
    public mf b3;
    public final rd b4;
    public int b5;
    public org.telegram.ui.ActionBar.y0 c;
    public NumberTextView c0;
    public final ce c1;
    public TL_account.TL_businessChatLink c2;
    public TLRPC.TL_document c3;
    public final rd c4;
    public a0.h c5;
    public LinearLayout d;
    public int d0;
    public boolean d1;
    public qf d2;
    public String d3;
    public final rd d4;
    public final Paint d5;
    public CharSequence e;
    public int e0;
    public ai.d2 e1;
    public TLRPC.ChatFull e2;
    public org.telegram.messenger.zi e3;
    public final rd e4;
    public final LinearGradient e5;
    public String f;
    public uq f0;
    public sd f1;
    public boolean f2;
    public org.telegram.messenger.b20 f3;
    public boolean f4;
    public final Matrix f5;
    public Runnable g0;
    public a61 g1;
    public int g2;
    public boolean g3;
    public long g4;
    public final u5 g5;
    public float h;
    public boolean h0;
    public fh0 h1;
    public boolean h2;
    public boolean h3;
    public float h4;
    public final u5 h5;
    public boolean i0;
    public mi0 i1;
    public boolean i2;
    public boolean i3;
    public float i4;
    public sh.e i5;
    public String j0;
    public long j1;
    public boolean j2;
    public org.telegram.messenger.zi j3;
    public float j4;
    public mh.h j5;
    public String k0;
    public boolean k1;
    public boolean k2;
    public TL_keyboard.KeyboardButtonProto k3;
    public float k4;
    public final qe.c k5;
    public ii.r3 l0;
    public SlideTextView l1;
    public boolean l2;
    public boolean l3;
    public float l4;
    public final qe.a l5;
    public ii.a0 m0;
    public ag m1;
    public boolean m2;
    public boolean m3;
    public float m4;
    public final qe.a m5;
    public float n;
    public te n0;
    public final qt0 n1;
    public org.telegram.messenger.zi n2;
    public boolean n3;
    public float n4;
    public final qe.a n5;
    public ii.z o0;
    public ViewGroup o1;
    public TLRPC.TL_replyKeyboardMarkup o2;
    public boolean o3;
    public float o4;
    public float o5;
    public boolean p0;
    public int p1;
    public int p2;
    public int p3;
    public float p4;
    public float p5;
    public fn0 q0;
    public final ci.q q1;
    public boolean q2;
    public boolean q3;
    public float q4;
    public boolean q5;
    public float r;
    public le r0;
    public ViewPropertyAnimator r1;
    public PowerManager.WakeLock r2;
    public boolean r3;
    public float r4;
    public int r5;
    public float s;
    public pd s0;
    public final lg.k s1;
    public AnimatorSet s2;
    public final he s3;
    public boolean s4;
    public int s5;
    public int t0;
    public final org.telegram.ui.ActionBar.s2 t1;
    public AnimatorSet t2;
    public final oe t3;
    public boolean t4;
    public int u0;
    public final ImageView u1;
    public AnimatorSet u2;
    public final org.telegram.ui.Cells.g1 u3;
    public int u4;
    public yc v0;
    public final ImageView v1;
    public AnimatorSet v2;
    public final ze v3;
    public long v4;
    public boolean w;
    public ValueAnimator w0;
    public float w1;
    public int w2;
    public final cf w3;
    public boolean w4;
    public Runnable x;
    public float x0;
    public ImageView x1;
    public int x2;
    public final Paint x3;
    public ValueAnimator x4;
    public float y;
    public boolean y0;
    public ie y1;
    public int y2;
    public boolean y3;
    public boolean y4;
    public boolean z0;
    public final sd z1;
    public int z2;
    public boolean z3;
    public boolean z4;

    /* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
        public float a;
        public float b;
        public float c;
        public long d;
        public float e;
        public float f;
        public final q9 h;
        public final q9 n;
        public final float r;
        public final float s;
        public final RectF w;
        public boolean x;
        public final zf y;

        public RecordCircle(Context context) {
            super(context);
            q9 q9Var = new q9(11, 360928);
            this.h = q9Var;
            q9 q9Var2 = new q9(12, 360928);
            this.n = q9Var2;
            this.r = org.telegram.messenger.g0.N(41.0f);
            this.s = org.telegram.messenger.g0.L(30.0f);
            this.w = new RectF();
            this.I = 0.0f;
            this.J = true;
            zf zfVar = new zf(this, this);
            this.y = zfVar;
            r0.i0.j(this, zfVar);
            q9Var.a = org.telegram.messenger.g0.L(47.0f);
            q9Var.b = org.telegram.messenger.g0.L(55.0f);
            q9Var.b();
            q9Var2.a = org.telegram.messenger.g0.L(47.0f);
            q9Var2.b = org.telegram.messenger.g0.L(55.0f);
            q9Var2.b();
            float scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            this.F = scaledTouchSlop * scaledTouchSlop;
            e();
        }

        public final void a() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (chatActivityEnterView.Q3 != null) {
                return;
            }
            chatActivityEnterView.Q3 = getResources().getDrawable(R.drawable.input_mic_pressed).mutate();
            Drawable drawable = chatActivityEnterView.Q3;
            int i3 = org.telegram.ui.ActionBar.k6.Qf;
            org.telegram.ui.ActionBar.e6 e6Var = chatActivityEnterView.X3;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.r6.y(this, drawable, i3, e6Var, mode);
            chatActivityEnterView.R3 = getResources().getDrawable(R.drawable.input_video_pressed).mutate();
            org.telegram.ui.ActionBar.r6.y(this, chatActivityEnterView.R3, i3, chatActivityEnterView.X3, mode);
            chatActivityEnterView.S3 = getResources().getDrawable(R.drawable.attach_send).mutate();
            org.telegram.ui.ActionBar.r6.y(this, chatActivityEnterView.S3, i3, chatActivityEnterView.X3, mode);
            chatActivityEnterView.O3 = getResources().getDrawable(R.drawable.input_mic).mutate();
            Drawable drawable2 = chatActivityEnterView.O3;
            int i10 = org.telegram.ui.ActionBar.k6.Kl;
            org.telegram.ui.ActionBar.r6.y(this, drawable2, i10, chatActivityEnterView.X3, mode);
            chatActivityEnterView.P3 = getResources().getDrawable(R.drawable.input_video).mutate();
            org.telegram.ui.ActionBar.r6.y(this, chatActivityEnterView.P3, i10, chatActivityEnterView.X3, mode);
        }

        public final void b(Canvas canvas, Drawable drawable, Drawable drawable2, float f10, int i3) {
            a();
            if (f10 != 0.0f && f10 != 1.0f && drawable2 != null) {
                canvas.save();
                canvas.scale(f10, f10, drawable.getBounds().centerX(), drawable.getBounds().centerY());
                float f11 = i3;
                drawable.setAlpha((int) (f11 * f10));
                drawable.draw(canvas);
                canvas.restore();
                canvas.save();
                float f12 = 1.0f - f10;
                canvas.scale(f12, f12, drawable.getBounds().centerX(), drawable.getBounds().centerY());
                drawable2.setAlpha((int) (f11 * f12));
                drawable2.draw(canvas);
                canvas.restore();
                return;
            }
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            boolean z10 = chatActivityEnterView.s4;
            if (z10 && chatActivityEnterView.k4 == 1.0f) {
                chatActivityEnterView.c1.setAlpha(1.0f);
                setVisibility(8);
            } else if (z10 && chatActivityEnterView.k4 < 1.0f) {
                drawable.setAlpha(org.telegram.messenger.hs.e4);
                drawable.draw(canvas);
            } else {
                if (z10) {
                    return;
                }
                drawable.setAlpha(i3);
                drawable.draw(canvas);
            }
        }

        public final void c(boolean z10) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (!z10) {
                chatActivityEnterView.t4 = false;
                chatActivityEnterView.m4 = -1.0f;
                chatActivityEnterView.l4 = -1.0f;
                chatActivityEnterView.k4 = 1.0f;
                chatActivityEnterView.r4 = 1.0f;
                chatActivityEnterView.o4 = 0.0f;
                chatActivityEnterView.j4 = 0.0f;
            }
            invalidate();
            chatActivityEnterView.q4 = 0.0f;
            chatActivityEnterView.v0();
            chatActivityEnterView.n4 = 0.0f;
            chatActivityEnterView.i4 = 0.0f;
            chatActivityEnterView.h4 = 0.0f;
            chatActivityEnterView.f4 = false;
            this.f = 0.0f;
            chatActivityEnterView.s4 = false;
            yf yfVar = chatActivityEnterView.P1;
            if (yfVar != null) {
                yfVar.invalidate();
            }
        }

        public final void d() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.t4 = false;
            invalidate();
            yf yfVar = chatActivityEnterView.P1;
            if (yfVar != null) {
                yfVar.invalidate();
            }
        }

        @Override // android.view.View
        public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
            return super.dispatchHoverEvent(motionEvent) || this.y.f(motionEvent);
        }

        public final void e() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            Paint paint = chatActivityEnterView.N3;
            int i3 = org.telegram.ui.ActionBar.k6.Rf;
            paint.setColor(chatActivityEnterView.f0(i3));
            this.h.d.setColor(i0.a.o(chatActivityEnterView.f0(i3), 38));
            this.n.d.setColor(i0.a.o(chatActivityEnterView.f0(i3), 76));
            this.E = chatActivityEnterView.N3.getAlpha();
        }

        public float getControlsScale() {
            return ChatActivityEnterView.this.j4;
        }

        public float getScale() {
            return ChatActivityEnterView.this.i4;
        }

        public float getTransformToSeekbarProgressStep3() {
            return this.e;
        }

        @Override // android.view.View
        public final void invalidate() {
            super.invalidate();
            yf yfVar = ChatActivityEnterView.this.P1;
            if (yfVar != null) {
                yfVar.invalidate();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:118:0x04c1  */
        /* JADX WARN: Removed duplicated region for block: B:129:0x04b5  */
        /* JADX WARN: Removed duplicated region for block: B:131:0x02e7  */
        /* JADX WARN: Removed duplicated region for block: B:132:0x0276  */
        /* JADX WARN: Removed duplicated region for block: B:137:0x022b  */
        /* JADX WARN: Removed duplicated region for block: B:143:0x01b6  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0187  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x019c  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x01cc  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0266  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0290  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x02e4  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x02ef  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0307  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x031d  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x0379  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0397  */
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
            float interpolation;
            float max;
            float f15;
            float f16;
            float f17;
            float f18;
            Paint paint;
            float f19;
            float f20;
            Drawable drawable;
            Drawable drawable2;
            boolean e10;
            int i3;
            Drawable drawable3;
            Paint paint2;
            float f21;
            Drawable drawable4;
            mi0 mi0Var;
            float f22;
            float f23;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            Rect rect = chatActivityEnterView.U3;
            Paint paint3 = chatActivityEnterView.N3;
            if (this.O) {
                return;
            }
            int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.M(26.0f);
            int L = (int) (org.telegram.messenger.g0.L(170.0f) + 0.0f);
            this.K = chatActivityEnterView.u4 + measuredWidth;
            float f24 = L;
            this.L = f24;
            float f25 = chatActivityEnterView.i4;
            float f26 = f25 <= 0.5f ? f25 / 0.5f : f25 <= 0.75f ? 1.0f - (((f25 - 0.5f) / 0.25f) * 0.1f) : (((f25 - 0.75f) / 0.25f) * 0.1f) + 0.9f;
            long currentTimeMillis = System.currentTimeMillis() - this.d;
            float f27 = this.b;
            float f28 = this.a;
            if (f27 != f28) {
                f10 = 0.25f;
                float f29 = this.c;
                f11 = 1.0f;
                float f30 = (currentTimeMillis * f29) + f28;
                this.a = f30;
                if (f29 > 0.0f) {
                    if (f30 > f27) {
                        this.a = f27;
                    }
                } else if (f30 < f27) {
                    this.a = f27;
                }
                invalidate();
            } else {
                f10 = 0.25f;
                f11 = 1.0f;
            }
            float interpolation2 = ((this.s * this.a) + this.r) * f26 * (chatActivityEnterView.s4 ? xq.g.getInterpolation(f11 - chatActivityEnterView.k4) * 0.7f : (chatActivityEnterView.k4 * 0.3f) + 0.7f);
            this.e = 0.0f;
            float f31 = chatActivityEnterView.q4;
            if (f31 == 0.0f || chatActivityEnterView.i1 == null) {
                float f32 = chatActivityEnterView.n4;
                if (f32 == 0.0f) {
                    f12 = 0.0f;
                    f13 = 0.0f;
                    f14 = 0.0f;
                    max = 1.0f;
                    if (chatActivityEnterView.s4) {
                    }
                    if (this.e > 0.0f) {
                    }
                    a();
                    Drawable drawable5 = null;
                    if (chatActivityEnterView.t4) {
                    }
                    drawable.setBounds(rect);
                    if (this.x) {
                    }
                    e10 = org.telegram.messenger.lc.e(360928);
                    q9 q9Var = this.n;
                    q9 q9Var2 = this.h;
                    if (e10) {
                    }
                    this.d = System.currentTimeMillis();
                    float f33 = chatActivityEnterView.k4;
                    if (f33 > f16) {
                    }
                    if (org.telegram.messenger.lc.e(360928)) {
                        if (this.J) {
                        }
                        if (!this.N) {
                        }
                    }
                    float max2 = (chatActivityEnterView.s4 || chatActivityEnterView.k4 >= 1.0f) ? f17 : Math.max(f17, org.telegram.messenger.g0.L(19.0f));
                    if (this.N) {
                    }
                    f21 = 1.0f;
                    if (chatActivityEnterView.i4 != f21) {
                    }
                    this.M = max2;
                }
                float f34 = f32 > 0.6f ? 1.0f : f32 / 0.6f;
                if (!chatActivityEnterView.h0) {
                    f32 = Math.max(0.0f, (f32 - 0.6f) / 0.4f);
                }
                xq xqVar = xq.j;
                interpolation = xqVar.getInterpolation(f34);
                float interpolation3 = xqVar.getInterpolation(f32);
                interpolation2 = (1.0f - interpolation3) * ((org.telegram.messenger.g0.L(16.0f) * interpolation) + interpolation2);
                if (org.telegram.messenger.lc.e(360928)) {
                    float f35 = chatActivityEnterView.n4;
                    if (f35 > 0.6f) {
                        f14 = interpolation;
                        max = Math.max(0.0f, 1.0f - ((f35 - 0.6f) / 0.4f));
                        f13 = interpolation3;
                        f12 = 0.0f;
                        if (chatActivityEnterView.s4) {
                            float f36 = chatActivityEnterView.k4;
                            if (f36 > 0.7f) {
                                max *= 1.0f - ((f36 - 0.7f) / 0.3f);
                            }
                        }
                        if (this.e > 0.0f) {
                            f16 = 0.7f;
                            f15 = 0.0f;
                            paint3.setColor(i0.a.f(this.e, chatActivityEnterView.f0(org.telegram.ui.ActionBar.k6.Rf), chatActivityEnterView.f0(org.telegram.ui.ActionBar.k6.Yf)));
                        } else {
                            f15 = 0.0f;
                            f16 = 0.7f;
                            paint3.setColor(chatActivityEnterView.f0(org.telegram.ui.ActionBar.k6.Rf));
                        }
                        a();
                        Drawable drawable52 = null;
                        if (chatActivityEnterView.t4) {
                            float f37 = this.f;
                            if (f37 != 1.0f) {
                                f20 = 12.0f;
                                float f38 = (currentTimeMillis / 150.0f) + f37;
                                this.f = f38;
                                if (f38 > 1.0f) {
                                    this.f = 1.0f;
                                }
                                drawable52 = chatActivityEnterView.d1 ? chatActivityEnterView.R3 : chatActivityEnterView.Q3;
                            } else {
                                f20 = 12.0f;
                            }
                            Drawable drawable6 = drawable52;
                            drawable = chatActivityEnterView.S3;
                            f19 = f13;
                            f18 = f12;
                            paint = paint3;
                            f17 = interpolation2;
                            rect.set(org.telegram.ui.Cells.f1.C(2, measuredWidth, drawable), org.telegram.ui.Cells.f1.B(2, L, drawable), org.telegram.ui.Cells.f1.z(2, measuredWidth, drawable), org.telegram.ui.Cells.f1.i(2, L, drawable));
                            if (drawable6 != null) {
                                drawable6.setBounds(org.telegram.ui.Cells.f1.C(2, measuredWidth, drawable6), org.telegram.ui.Cells.f1.B(2, L, drawable6), org.telegram.ui.Cells.f1.z(2, measuredWidth, drawable6), org.telegram.ui.Cells.f1.i(2, L, drawable6));
                            }
                            drawable2 = drawable6;
                        } else {
                            f17 = interpolation2;
                            f18 = f12;
                            paint = paint3;
                            f19 = f13;
                            f20 = 12.0f;
                            drawable = chatActivityEnterView.d1 ? chatActivityEnterView.R3 : chatActivityEnterView.Q3;
                            rect.set(measuredWidth - org.telegram.messenger.g0.L(12.0f), L - org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + measuredWidth, org.telegram.messenger.g0.L(12.0f) + L);
                            drawable2 = null;
                        }
                        drawable.setBounds(rect);
                        if (this.x) {
                            float f39 = chatActivityEnterView.p4 + 0.01f;
                            chatActivityEnterView.p4 = f39;
                            if (f39 > 1.0f) {
                                this.x = false;
                                chatActivityEnterView.p4 = 1.0f;
                            }
                        } else {
                            float f40 = chatActivityEnterView.p4 - 0.01f;
                            chatActivityEnterView.p4 = f40;
                            if (f40 < f15) {
                                this.x = true;
                                chatActivityEnterView.p4 = f15;
                            }
                        }
                        e10 = org.telegram.messenger.lc.e(360928);
                        q9 q9Var3 = this.n;
                        q9 q9Var22 = this.h;
                        if (e10) {
                            q9Var22.a = org.telegram.messenger.g0.L(47.0f);
                            q9Var22.b = (org.telegram.messenger.g0.L(15.0f) * 0.6f) + org.telegram.messenger.g0.L(47.0f);
                            q9Var3.a = org.telegram.messenger.g0.L(50.0f);
                            q9Var3.b = (org.telegram.messenger.g0.L(f20) * 0.6f) + org.telegram.messenger.g0.L(50.0f);
                            q9Var3.f(currentTimeMillis);
                            q9Var3.e(q9Var3.t, 1.01f);
                            q9Var22.f(currentTimeMillis);
                            q9Var22.e(q9Var22.t, 1.02f);
                        }
                        this.d = System.currentTimeMillis();
                        float f332 = chatActivityEnterView.k4;
                        float f41 = f332 > f16 ? 1.0f : f332 / f16;
                        if (org.telegram.messenger.lc.e(360928) && f18 != 1.0f && f19 < 0.4f && f41 > 0.0f && !chatActivityEnterView.s4) {
                            if (this.J) {
                                float f42 = this.I;
                                if (f42 != 1.0f) {
                                    float f43 = f42 + 0.04f;
                                    this.I = f43;
                                    if (f43 > 1.0f) {
                                        this.I = 1.0f;
                                    }
                                }
                            }
                            if (!this.N) {
                                float interpolation4 = xq.g.getInterpolation(this.I);
                                canvas.save();
                                float f44 = 1.0f - f14;
                                float A = com.google.android.recaptcha.internal.a.A(q9Var3.t, 1.4f, 0.878f, com.google.android.recaptcha.internal.a.C(chatActivityEnterView.i4, f44, f41, interpolation4));
                                canvas.scale(A, A, chatActivityEnterView.u4 + measuredWidth, f24);
                                q9Var3.a(chatActivityEnterView.u4 + measuredWidth, f24, canvas, q9Var3.d);
                                canvas.restore();
                                float C = ((q9Var22.t * 1.4f) + 0.926f) * com.google.android.recaptcha.internal.a.C(chatActivityEnterView.i4, f44, f41, interpolation4);
                                canvas.save();
                                canvas.scale(C, C, chatActivityEnterView.u4 + measuredWidth, f24);
                                q9Var22.a(chatActivityEnterView.u4 + measuredWidth, f24, canvas, q9Var22.d);
                                canvas.restore();
                            }
                        }
                        float max22 = (chatActivityEnterView.s4 || chatActivityEnterView.k4 >= 1.0f) ? f17 : Math.max(f17, org.telegram.messenger.g0.L(19.0f));
                        if (this.N) {
                            i3 = measuredWidth;
                            drawable3 = drawable;
                            paint2 = paint;
                        } else {
                            paint2 = paint;
                            paint2.setAlpha((int) (this.E * max));
                            if (chatActivityEnterView.i4 == 1.0f) {
                                if (chatActivityEnterView.q4 == 0.0f) {
                                    drawable4 = drawable2;
                                    i3 = measuredWidth;
                                    f21 = 1.0f;
                                    canvas.drawCircle(i3 + chatActivityEnterView.u4, f24, max22, paint2);
                                } else if (chatActivityEnterView.d1 || this.e <= 0.0f || (mi0Var = chatActivityEnterView.i1) == null) {
                                    drawable4 = drawable2;
                                    i3 = measuredWidth;
                                    f21 = 1.0f;
                                    canvas.drawCircle(i3 + chatActivityEnterView.u4, f24, (1.0f - this.e) * max22, paint2);
                                } else {
                                    float f45 = f24 + max22;
                                    float f46 = f24 - max22;
                                    float f47 = chatActivityEnterView.u4 + measuredWidth;
                                    float f48 = f47 + max22;
                                    float f49 = f47 - max22;
                                    drawable4 = drawable2;
                                    int i10 = 0;
                                    int i11 = 0;
                                    for (View view = (View) mi0Var.getParent(); view != getParent(); view = (View) view.getParent()) {
                                        i11 = (int) (view.getY() + i11);
                                        i10 = (int) (view.getX() + i10);
                                    }
                                    float f50 = i11;
                                    float y9 = (mi0Var.getY() + f50) - getY();
                                    float y10 = ((mi0Var.getY() + mi0Var.getMeasuredHeight()) + f50) - getY();
                                    float f51 = i10;
                                    float x10 = (((mi0Var.getX() + mi0Var.getMeasuredWidth()) + f51) - getX()) - chatActivityEnterView.J;
                                    float x11 = ((mi0Var.getX() + f51) - getX()) + chatActivityEnterView.J;
                                    i3 = measuredWidth;
                                    if (!chatActivityEnterView.d1) {
                                        mi0Var.getMeasuredHeight();
                                    }
                                    float T1 = org.telegram.messenger.g0.T1(f46, y9, this.e);
                                    float T12 = org.telegram.messenger.g0.T1(f45, y10, this.e);
                                    float T13 = org.telegram.messenger.g0.T1(f49, x11, this.e);
                                    float T14 = org.telegram.messenger.g0.T1(f48, x10, this.e);
                                    RectF rectF = this.w;
                                    rectF.set(T13, T1, T14, T12);
                                    chatActivityEnterView.i1.a(canvas, rectF);
                                    f21 = 1.0f;
                                }
                                canvas.save();
                                canvas.translate(chatActivityEnterView.u4, 0.0f);
                                drawable3 = drawable;
                                drawable2 = drawable4;
                                b(canvas, drawable3, drawable2, this.f, (int) org.telegram.messenger.k5.A(f21, f18, f21 - f19, 255.0f));
                                canvas.restore();
                                if (chatActivityEnterView.i4 != f21) {
                                    canvas.drawCircle(i3 + chatActivityEnterView.u4, f24, max22, paint2);
                                    float f52 = chatActivityEnterView.s4 ? f21 - chatActivityEnterView.k4 : f21;
                                    canvas.save();
                                    canvas.translate(chatActivityEnterView.u4, 0.0f);
                                    b(canvas, drawable3, drawable2, this.f, (int) (f52 * 255.0f));
                                    canvas.restore();
                                }
                                this.M = max22;
                            }
                            i3 = measuredWidth;
                            drawable3 = drawable;
                        }
                        f21 = 1.0f;
                        if (chatActivityEnterView.i4 != f21) {
                        }
                        this.M = max22;
                    }
                }
                f13 = interpolation3;
                f12 = 0.0f;
            } else {
                if (f31 > 0.38f) {
                    f22 = 0.38f;
                    f23 = f11;
                } else {
                    f22 = 0.38f;
                    f23 = f31 / 0.38f;
                }
                float max3 = f31 > 0.63f ? f11 : Math.max(0.0f, (f31 - f22) / f10);
                this.e = Math.max(0.0f, ((chatActivityEnterView.q4 - f22) - f10) / 0.37f);
                xq xqVar2 = xq.j;
                interpolation = xqVar2.getInterpolation(f23);
                f12 = xqVar2.getInterpolation(max3);
                this.e = xqVar2.getInterpolation(this.e);
                float L2 = (org.telegram.messenger.g0.L(16.0f) * interpolation) + interpolation2;
                float L3 = org.telegram.messenger.g0.L(8.0f);
                interpolation2 = com.google.android.recaptcha.internal.a.y(f11, f12, L2 - L3, L3);
                f13 = 0.0f;
            }
            f14 = interpolation;
            max = 1.0f;
            if (chatActivityEnterView.s4) {
            }
            if (this.e > 0.0f) {
            }
            a();
            Drawable drawable522 = null;
            if (chatActivityEnterView.t4) {
            }
            drawable.setBounds(rect);
            if (this.x) {
            }
            e10 = org.telegram.messenger.lc.e(360928);
            q9 q9Var32 = this.n;
            q9 q9Var222 = this.h;
            if (e10) {
            }
            this.d = System.currentTimeMillis();
            float f3322 = chatActivityEnterView.k4;
            if (f3322 > f16) {
            }
            if (org.telegram.messenger.lc.e(360928)) {
            }
            float max222 = (chatActivityEnterView.s4 || chatActivityEnterView.k4 >= 1.0f) ? f17 : Math.max(f17, org.telegram.messenger.g0.L(19.0f));
            if (this.N) {
            }
            f21 = 1.0f;
            if (chatActivityEnterView.i4 != f21) {
            }
            this.M = max222;
        }

        @Override // android.view.View
        public final void onMeasure(int i3, int i10) {
            View.MeasureSpec.getSize(i3);
            super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(194.0f), TLObject.FLAG_30));
            float measuredWidth = getMeasuredWidth() * 0.35f;
            if (measuredWidth > org.telegram.messenger.g0.L(140.0f)) {
                measuredWidth = org.telegram.messenger.g0.L(140.0f);
            }
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.u4 = (int) ((1.0f - chatActivityEnterView.k4) * (-measuredWidth));
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
            chatActivityEnterView.j4 = f10;
            yf yfVar = chatActivityEnterView.P1;
            if (yfVar != null) {
                yfVar.invalidate();
            }
        }

        public void setScale(float f10) {
            ChatActivityEnterView.this.i4 = f10;
            invalidate();
        }

        public void setTransformToSeekbar(float f10) {
            ChatActivityEnterView.this.q4 = f10;
            invalidate();
        }
    }

    /* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
    public class SlideTextView extends View {
        public long E;
        public final int F;
        public final Path G;
        public StaticLayout H;
        public StaticLayout I;
        public boolean J;
        public boolean K;
        public final Rect L;
        public org.telegram.ui.Cells.y M;
        public int N;
        public final boolean O;
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
        public float x;
        public boolean y;

        public SlideTextView(Context context) {
            super(context);
            Paint paint = new Paint(1);
            this.c = paint;
            this.x = 0.0f;
            this.G = new Path();
            this.L = new Rect();
            boolean z10 = org.telegram.messenger.g0.q.x <= org.telegram.messenger.g0.L(320.0f);
            this.O = z10;
            TextPaint textPaint = new TextPaint(1);
            this.a = textPaint;
            textPaint.setTextSize(org.telegram.messenger.g0.L(z10 ? 13.0f : 15.0f));
            TextPaint textPaint2 = new TextPaint(1);
            this.b = textPaint2;
            textPaint2.setTextSize(org.telegram.messenger.g0.L(15.0f));
            textPaint2.setTypeface(org.telegram.messenger.g0.o());
            int i3 = org.telegram.ui.ActionBar.k6.Kl;
            int i10 = ChatActivityEnterView.t5;
            paint.setColor(ChatActivityEnterView.this.f0(i3));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(org.telegram.messenger.g0.N(z10 ? 1.0f : 1.6f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            String M0 = org.telegram.messenger.bd.M0(2131745323, null);
            this.d = M0;
            String upperCase = org.telegram.messenger.bd.M0(2131752589, "Cancel").toUpperCase();
            this.e = upperCase;
            this.F = M0.indexOf(upperCase);
            a();
        }

        public final void a() {
            int i3 = org.telegram.ui.ActionBar.k6.bg;
            int i10 = ChatActivityEnterView.t5;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            int f02 = chatActivityEnterView.f0(i3);
            this.a.setColor(f02);
            int i11 = org.telegram.ui.ActionBar.k6.ag;
            int f03 = chatActivityEnterView.f0(i11);
            this.b.setColor(f03);
            this.s = r2.getAlpha();
            this.w = r4.getAlpha();
            org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.k6.j0(org.telegram.messenger.g0.L(60.0f), 0, i0.a.o(chatActivityEnterView.f0(i11), 26));
            this.M = j02;
            j02.setCallback(this);
        }

        @Override // android.view.View
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            this.M.setState(getDrawableState());
        }

        public float getSlideToCancelWidth() {
            return this.f;
        }

        @Override // android.view.View
        public final void jumpDrawablesToCurrentState() {
            super.jumpDrawablesToCurrentState();
            org.telegram.ui.Cells.y yVar = this.M;
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
            if (this.H == null || (staticLayout = this.I) == null) {
                return;
            }
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (chatActivityEnterView.O1 == null) {
                return;
            }
            int L = org.telegram.messenger.g0.L(16.0f) + staticLayout.getWidth();
            int f02 = chatActivityEnterView.f0(org.telegram.ui.ActionBar.k6.bg);
            TextPaint textPaint = this.a;
            textPaint.setColor(f02);
            textPaint.setAlpha((int) ((1.0f - this.n) * this.s * this.r));
            this.b.setAlpha((int) (this.w * this.n));
            int color = textPaint.getColor();
            Paint paint = this.c;
            paint.setColor(color);
            boolean z10 = this.O;
            if (z10) {
                this.x = org.telegram.messenger.g0.L(16.0f);
            } else {
                long currentTimeMillis = System.currentTimeMillis() - this.E;
                this.E = System.currentTimeMillis();
                if (this.n == 0.0f && this.r > 0.8f) {
                    if (this.y) {
                        float L2 = ((org.telegram.messenger.g0.L(3.0f) / 250.0f) * currentTimeMillis) + this.x;
                        this.x = L2;
                        if (L2 > org.telegram.messenger.g0.L(6.0f)) {
                            this.x = org.telegram.messenger.g0.L(6.0f);
                            this.y = false;
                        }
                    } else {
                        float L3 = this.x - ((org.telegram.messenger.g0.L(3.0f) / 250.0f) * currentTimeMillis);
                        this.x = L3;
                        if (L3 < (-org.telegram.messenger.g0.L(6.0f))) {
                            this.x = -org.telegram.messenger.g0.L(6.0f);
                            this.y = true;
                        }
                    }
                }
            }
            int i3 = this.F;
            boolean z11 = i3 >= 0;
            int L4 = org.telegram.messenger.g0.L(5.0f) + ((int) ((getMeasuredWidth() - this.f) / 2.0f));
            int measuredWidth = (int) ((getMeasuredWidth() - this.h) / 2.0f);
            float primaryHorizontal = z11 ? this.H.getPrimaryHorizontal(i3) : 0.0f;
            if (z11) {
                f10 = 16.0f;
                f11 = (L4 + primaryHorizontal) - measuredWidth;
            } else {
                f10 = 16.0f;
                f11 = 0.0f;
            }
            float f14 = L4;
            float f15 = this.x;
            float f16 = this.n;
            float L5 = (((((1.0f - f16) * f15) * this.r) + f14) - (f11 * f16)) + org.telegram.messenger.g0.L(f10);
            float L6 = z11 ? 0.0f : this.n * org.telegram.messenger.g0.L(12.0f);
            if (this.n != 1.0f) {
                f12 = 12.0f;
                int translationX = (int) ((chatActivityEnterView.O1.getTranslationX() * 0.3f) + ((1.0f - this.r) * ((-getMeasuredWidth()) / 4)));
                canvas.save();
                dg dgVar = chatActivityEnterView.Z0;
                f13 = 2.0f;
                canvas.clipRect((dgVar == null ? 0.0f : dgVar.getLeftProperty()) + org.telegram.messenger.g0.L(4.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.save();
                int i10 = (int) L5;
                canvas.translate((i10 - org.telegram.messenger.g0.L(z10 ? 7.0f : 10.0f)) + translationX, L6);
                canvas.drawPath(this.G, paint);
                canvas.restore();
                canvas.save();
                canvas.translate(i10 + translationX, ((getMeasuredHeight() - this.H.getHeight()) / 2.0f) + L6);
                this.H.draw(canvas);
                canvas.restore();
                canvas.restore();
            } else {
                f12 = 12.0f;
                f13 = 2.0f;
            }
            float measuredHeight = (getMeasuredHeight() - this.I.getHeight()) / f13;
            if (!z11) {
                measuredHeight -= org.telegram.messenger.g0.L(f12) - L6;
            }
            float f17 = z11 ? L5 + primaryHorizontal : measuredWidth;
            Rect rect = this.L;
            rect.set((int) f17, (int) measuredHeight, (int) (this.I.getWidth() + f17), (int) (this.I.getHeight() + measuredHeight));
            rect.inset(-org.telegram.messenger.g0.L(f10), -org.telegram.messenger.g0.L(f10));
            if (this.n > 0.0f) {
                this.M.setBounds((getMeasuredWidth() / 2) - L, (getMeasuredHeight() / 2) - L, (getMeasuredWidth() / 2) + L, (getMeasuredHeight() / 2) + L);
                this.M.draw(canvas);
                canvas.save();
                canvas.translate(f17, measuredHeight);
                this.I.draw(canvas);
                canvas.restore();
            } else {
                setPressed(false);
            }
            if (this.n == 1.0f || this.K) {
                return;
            }
            invalidate();
        }

        @Override // android.view.View
        public final void onMeasure(int i3, int i10) {
            super.onMeasure(i3, i10);
            int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
            if (this.N != measuredHeight) {
                this.N = measuredHeight;
                String str = this.d;
                TextPaint textPaint = this.a;
                this.f = textPaint.measureText(str);
                String str2 = this.e;
                TextPaint textPaint2 = this.b;
                this.h = textPaint2.measureText(str2);
                this.E = System.currentTimeMillis();
                int measuredHeight2 = getMeasuredHeight() >> 1;
                Path path = this.G;
                path.reset();
                if (this.O) {
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
                this.H = new StaticLayout(this.d, textPaint, i11, alignment, 1.0f, 0.0f, false);
                this.I = new StaticLayout(this.e, textPaint2, (int) this.h, alignment, 1.0f, 0.0f, false);
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
            int y9 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            Rect rect = this.L;
            if (action == 0) {
                boolean contains = rect.contains(x10, y9);
                this.J = contains;
                if (contains) {
                    this.M.setHotspot(x10, y9);
                    setPressed(true);
                }
                return this.J;
            }
            boolean z10 = this.J;
            if (!z10) {
                return z10;
            }
            if (motionEvent.getAction() == 2 && !rect.contains(x10, y9)) {
                setPressed(false);
                return false;
            }
            if (motionEvent.getAction() == 1 && rect.contains(x10, y9)) {
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                long j10 = 0;
                if (chatActivityEnterView.f2 && chatActivityEnterView.d1) {
                    CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.I3);
                    chatActivityEnterView.a3.d2(5, 0, chatActivityEnterView.P ? Integer.MAX_VALUE : 0, chatActivityEnterView.T4, 0L, true);
                    ee eeVar = chatActivityEnterView.K0;
                    chatActivityEnterView.T4 = 0L;
                    eeVar.setEffect(0L);
                } else {
                    chatActivityEnterView.a3.M0(0);
                    MediaController.B().B0(0, 0, false, chatActivityEnterView.P);
                }
                chatActivityEnterView.c3 = null;
                chatActivityEnterView.e3 = null;
                chatActivityEnterView.f3 = null;
                chatActivityEnterView.j1 = 0L;
                chatActivityEnterView.G2 = false;
                org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(chatActivityEnterView.R);
                long j11 = chatActivityEnterView.R2;
                org.telegram.ui.wm wmVar = chatActivityEnterView.Q2;
                if (wmVar != null && wmVar.w4) {
                    j10 = wmVar.b();
                }
                b02.B1(j11, j10, null);
                chatActivityEnterView.M1(2, true);
                chatActivityEnterView.E(true);
            }
            return true;
        }

        public void setCancelToProgress(float f10) {
            this.n = f10;
        }

        @Override // android.view.View
        public final boolean verifyDrawable(Drawable drawable) {
            return this.M == drawable || super.verifyDrawable(drawable);
        }
    }

    public ChatActivityEnterView(Activity activity, qt0 qt0Var, org.telegram.ui.wm wmVar, boolean z10, final org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity);
        int i3;
        String str;
        uf ufVar;
        this.h = 1.0f;
        this.n = 1.0f;
        this.r = 1.0f;
        this.s = 1.0f;
        this.F = 1.0f;
        this.G = 1.0f;
        this.J = 0.0f;
        int i10 = 1;
        this.K = true;
        int i11 = org.telegram.messenger.h10.t0;
        this.R = i11;
        this.S = org.telegram.messenger.c.a(i11);
        this.U = 1;
        this.d0 = -1;
        this.r5 = 1;
        this.y0 = true;
        this.z0 = true;
        this.A0 = true;
        this.C0 = new HashMap();
        new wd(0);
        this.D0 = false;
        this.E0 = false;
        this.w1 = 1.0f;
        this.g2 = -1;
        this.k2 = true;
        this.E2 = -1.0f;
        this.F2 = org.telegram.messenger.g0.L(80.0f);
        this.O2 = new int[2];
        this.Z2 = true;
        this.p3 = -1;
        this.r3 = true;
        this.s3 = new he(this, 0);
        this.t3 = new oe(this);
        this.u3 = new org.telegram.ui.Cells.g1(Integer.class, "translationY", 1);
        this.v3 = new ze(Float.class, "scale");
        this.w3 = new cf(Float.class, "controlsScale");
        this.x3 = new Paint(1);
        this.I3 = new he(this, i10);
        this.L3 = new pf(this);
        this.M3 = new g2.g((int[]) null);
        this.N3 = new Paint(1);
        this.T3 = new RectF();
        this.U3 = new Rect();
        this.V3 = new Rect();
        this.Z3 = new he(this, 2);
        this.a4 = new rd(this, 0);
        this.b4 = new rd(this, 1);
        this.c4 = new rd(this, 2);
        this.d4 = new rd(this, 3);
        this.e4 = new rd(this, 4);
        this.y4 = true;
        this.z4 = true;
        this.C4 = new Paint();
        this.D4 = 1.0f;
        this.E4 = new Rect();
        this.G4 = new yc(this, 8);
        this.J4 = true;
        this.P4 = new wp[1];
        this.s5 = 1;
        this.a5 = -1;
        Paint paint = new Paint(1);
        this.d5 = paint;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.e5 = linearGradient;
        this.f5 = new Matrix();
        xq xqVar = xq.h;
        final int i12 = 0;
        this.g5 = new u5(this, 0L, 280L, xqVar);
        this.h5 = new u5(this, 0L, 280L, xqVar);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setShader(linearGradient);
        xq xqVar2 = ni.l.V;
        this.k5 = new qe.c(0, this, xqVar2, 250L);
        this.l5 = new qe.a(1, this, xqVar2, 250L, false);
        this.m5 = new qe.a(2, this, xqVar, 320L, false);
        this.n5 = new qe.a(3, this, xqVar, 320L, false);
        this.X3 = e6Var;
        this.Y3 = z10;
        this.j2 = z10 && !org.telegram.messenger.g0.E && (wmVar == null || !wmVar.isInBubbleMode());
        Paint paint2 = new Paint(1);
        this.R1 = paint2;
        paint2.setColor(f0(org.telegram.ui.ActionBar.k6.Pf));
        setFocusable(true);
        setFocusableInTouchMode(true);
        setWillNotDraw(false);
        setClipChildren(false);
        org.telegram.messenger.hs.f(this.R).c(this, org.telegram.messenger.hs.l2);
        org.telegram.messenger.hs.f(this.R).c(this, org.telegram.messenger.hs.o2);
        org.telegram.messenger.hs.f(this.R).c(this, org.telegram.messenger.hs.p2);
        org.telegram.messenger.hs.f(this.R).c(this, org.telegram.messenger.hs.m2);
        org.telegram.messenger.hs.f(this.R).c(this, org.telegram.messenger.hs.n2);
        org.telegram.messenger.hs.f(this.R).c(this, org.telegram.messenger.hs.k2);
        org.telegram.messenger.hs.f(this.R).c(this, org.telegram.messenger.hs.t);
        org.telegram.messenger.hs.f(this.R).c(this, org.telegram.messenger.hs.s2);
        org.telegram.messenger.hs.f(this.R).c(this, org.telegram.messenger.hs.u2);
        org.telegram.messenger.hs.f(this.R).c(this, org.telegram.messenger.hs.e2);
        org.telegram.messenger.hs.f(this.R).c(this, org.telegram.messenger.hs.z0);
        org.telegram.messenger.hs.f(this.R).c(this, org.telegram.messenger.hs.L);
        org.telegram.messenger.hs.f(this.R).c(this, org.telegram.messenger.hs.n1);
        org.telegram.messenger.hs.f(this.R).c(this, org.telegram.messenger.hs.t2);
        org.telegram.messenger.hs.f(this.R).c(this, org.telegram.messenger.hs.R2);
        org.telegram.messenger.hs.f(this.R).c(this, org.telegram.messenger.hs.Y2);
        org.telegram.messenger.hs.f(this.R).c(this, org.telegram.messenger.hs.f5);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.i4);
        this.P2 = activity;
        this.Q2 = wmVar;
        if (wmVar != null) {
            this.H2 = wmVar.getClassGuid();
        }
        this.n1 = qt0Var;
        this.o1 = qt0Var;
        qt0Var.setDelegate(this);
        this.C2 = org.telegram.messenger.hp.e1().getBoolean("send_by_enter", false);
        sd sdVar = new sd(this, activity, i12);
        this.A1 = sdVar;
        sdVar.setClipChildren(false);
        sdVar.setClipToPadding(false);
        sdVar.setPadding(0, org.telegram.messenger.g0.L(1.0f), 0, 0);
        addView(sdVar, b8.mf.d(-1, -2.0f, 83, 0.0f, 1.0f, 0.0f, 0.0f));
        sd sdVar2 = new sd(this, activity, i10);
        this.z1 = sdVar2;
        sdVar2.setClipChildren(false);
        sdVar.addView(sdVar2, b8.mf.d(-1, -2.0f, 80, 0.0f, 0.0f, 44.0f, 0.0f));
        ud udVar = new ud(this, activity);
        this.R0 = udVar;
        udVar.setContentDescription(org.telegram.messenger.bd.M0(2131754884, null));
        udVar.setFocusable(true);
        int L = org.telegram.messenger.g0.L(7.5f);
        udVar.setPadding(L, L, L, L);
        int i13 = org.telegram.ui.ActionBar.k6.Kl;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.r6.t(udVar, i13, e6Var, mode);
        int i14 = org.telegram.ui.ActionBar.k6.i6;
        int f02 = f0(i14);
        float L2 = org.telegram.messenger.g0.L(19.0f);
        int L3 = org.telegram.messenger.g0.L(1.0f);
        int L4 = org.telegram.messenger.g0.L(3.0f);
        udVar.setBackground(org.telegram.ui.ActionBar.k6.Y(L2, f02, L3, L4, L3, L4));
        udVar.setOnClickListener(new ad(this, 14));
        sdVar2.addView(udVar, b8.mf.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        c1(false, false);
        ImageView imageView = new ImageView(activity);
        this.S0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.menu_delete_old);
        org.telegram.ui.ActionBar.r6.t(imageView, i13, e6Var, mode);
        int f03 = f0(i14);
        float L5 = org.telegram.messenger.g0.L(19.0f);
        int L6 = org.telegram.messenger.g0.L(1.0f);
        int L7 = org.telegram.messenger.g0.L(3.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.k6.Y(L5, f03, L6, L7, L6, L7));
        imageView.setVisibility(8);
        imageView.setContentDescription(org.telegram.messenger.bd.M0(2131754038, null));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ld
            public final /* synthetic */ ChatActivityEnterView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        int i15 = ChatActivityEnterView.t5;
                        ChatActivityEnterView chatActivityEnterView = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, chatActivityEnterView.getContext(), e6Var);
                        String M0 = org.telegram.messenger.bd.M0(2131754036, null);
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                        s1Var.S = M0;
                        s1Var.U = org.telegram.messenger.bd.M0(2131754037, null);
                        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new hd(chatActivityEnterView));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.p();
                        break;
                    default:
                        int i16 = ChatActivityEnterView.t5;
                        org.telegram.messenger.hp.e1().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.b;
                        org.telegram.ui.wm wmVar2 = chatActivityEnterView2.Q2;
                        long a10 = wmVar2 != null ? wmVar2.a() : chatActivityEnterView2.R2;
                        boolean z11 = chatActivityEnterView2.E1;
                        org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                        if (!z11) {
                            if (chatActivityEnterView2.F0 != null) {
                                e0 e0Var = new e0(chatActivityEnterView2.getContext(), e6Var2);
                                e0Var.r1(chatActivityEnterView2.F0.getText());
                                e0Var.c2 = new jd(chatActivityEnterView2, 1);
                                boolean z12 = chatActivityEnterView2.a2 != null;
                                kd kdVar = new kd(chatActivityEnterView2, a10, e6Var2, 1);
                                e0Var.e2 = a10;
                                e0Var.f2 = z12;
                                e0Var.g2 = kdVar;
                                e0Var.show();
                                break;
                            }
                        } else if (chatActivityEnterView2.F1 != null) {
                            e0 e0Var2 = new e0(chatActivityEnterView2.getContext(), e6Var2);
                            e0Var2.s1(chatActivityEnterView2.F1);
                            e0Var2.d2 = new jd(chatActivityEnterView2, 0);
                            kd kdVar2 = new kd(chatActivityEnterView2, a10, e6Var2, 0);
                            e0Var2.e2 = a10;
                            e0Var2.h2 = kdVar2;
                            e0Var2.show();
                            break;
                        }
                        break;
                }
            }
        });
        sdVar2.addView(imageView, b8.mf.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            int i15 = wmVar != null ? wmVar.g4 : -1;
            ci.q qVar = new ci.q(activity, 5);
            this.q1 = qVar;
            qVar.setOrientation(0);
            qVar.setEnabled(false);
            qVar.setClipChildren(false);
            sdVar2.addView(qVar, b8.mf.d(-2, 44.0f, 85, 0.0f, 0.0f, 44.0f, 0.0f));
            if (i15 != 9) {
                ImageView imageView2 = new ImageView(activity);
                this.J1 = imageView2;
                uq uqVar = new uq(activity, R.drawable.input_notify_on, i13);
                this.f0 = uqVar;
                imageView2.setImageDrawable(uqVar);
                this.f0.a(this.h2, false);
                if (this.h2) {
                    i3 = 2131754906;
                    str = "AccDescrChanSilentOn";
                } else {
                    i3 = 2131754907;
                    str = "AccDescrChanSilentOff";
                }
                imageView2.setContentDescription(org.telegram.messenger.bd.M0(i3, str));
                org.telegram.ui.ActionBar.r6.t(imageView2, i13, e6Var, PorterDuff.Mode.MULTIPLY);
                imageView2.setScaleType(scaleType);
                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(f0(i14), 1, -1);
                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i14);
                imageView2.setBackground(h02);
                org.telegram.ui.ActionBar.r6.k(imageView2, h02, null, N, e6Var);
                imageView2.setVisibility((!this.i2 || ((ufVar = this.a3) != null && ufVar.u0())) ? 8 : 0);
                qVar.addView(imageView2, b8.mf.o(44, 44));
                imageView2.setOnClickListener(new vd(i12, this, wmVar, activity));
            }
            lg.k kVar = new lg.k(activity, 1);
            this.s1 = kVar;
            kVar.setScaleType(scaleType);
            org.telegram.ui.ActionBar.r6.t(kVar, i13, e6Var, PorterDuff.Mode.MULTIPLY);
            kVar.setImageResource(R.drawable.msg_input_attach2);
            org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.k6.h0(f0(i14), 1, -1);
            org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i14);
            kVar.setBackground(h03);
            org.telegram.ui.ActionBar.r6.k(kVar, h03, null, N2, e6Var);
            sdVar2.addView(kVar, b8.mf.e(44, 44, 85));
            kVar.setOnClickListener(new ad(this, 18));
            kVar.setContentDescription(org.telegram.messenger.bd.M0(2131754921, null));
            I1(1);
        }
        ImageView imageView3 = new ImageView(activity);
        this.u1 = imageView3;
        org.telegram.ui.ActionBar.s2 s2Var = new org.telegram.ui.ActionBar.s2(activity);
        this.t1 = s2Var;
        imageView3.setImageDrawable(s2Var);
        imageView3.setScaleType(scaleType);
        PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.t(imageView3, i13, e6Var, mode2);
        org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.k6.h0(f0(i14), 1, org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i14);
        imageView3.setBackground(h04);
        org.telegram.ui.ActionBar.r6.k(imageView3, h04, null, N3, e6Var);
        sdVar.addView(imageView3, b8.mf.d(44, 44.0f, 51, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView3.setContentDescription(org.telegram.messenger.bd.M0(2131755006, null));
        b8.pf.a(imageView3);
        final int i16 = 1;
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ld
            public final /* synthetic */ ChatActivityEnterView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        int i152 = ChatActivityEnterView.t5;
                        ChatActivityEnterView chatActivityEnterView = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, chatActivityEnterView.getContext(), e6Var);
                        String M0 = org.telegram.messenger.bd.M0(2131754036, null);
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                        s1Var.S = M0;
                        s1Var.U = org.telegram.messenger.bd.M0(2131754037, null);
                        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new hd(chatActivityEnterView));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.p();
                        break;
                    default:
                        int i162 = ChatActivityEnterView.t5;
                        org.telegram.messenger.hp.e1().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.b;
                        org.telegram.ui.wm wmVar2 = chatActivityEnterView2.Q2;
                        long a10 = wmVar2 != null ? wmVar2.a() : chatActivityEnterView2.R2;
                        boolean z11 = chatActivityEnterView2.E1;
                        org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                        if (!z11) {
                            if (chatActivityEnterView2.F0 != null) {
                                e0 e0Var = new e0(chatActivityEnterView2.getContext(), e6Var2);
                                e0Var.r1(chatActivityEnterView2.F0.getText());
                                e0Var.c2 = new jd(chatActivityEnterView2, 1);
                                boolean z12 = chatActivityEnterView2.a2 != null;
                                kd kdVar = new kd(chatActivityEnterView2, a10, e6Var2, 1);
                                e0Var.e2 = a10;
                                e0Var.f2 = z12;
                                e0Var.g2 = kdVar;
                                e0Var.show();
                                break;
                            }
                        } else if (chatActivityEnterView2.F1 != null) {
                            e0 e0Var2 = new e0(chatActivityEnterView2.getContext(), e6Var2);
                            e0Var2.s1(chatActivityEnterView2.F1);
                            e0Var2.d2 = new jd(chatActivityEnterView2, 0);
                            kd kdVar2 = new kd(chatActivityEnterView2, a10, e6Var2, 0);
                            e0Var2.e2 = a10;
                            e0Var2.h2 = kdVar2;
                            e0Var2.show();
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
        this.v1 = imageView4;
        imageView4.setImageResource(R.drawable.iv_fullscreen);
        imageView4.setScaleType(scaleType);
        org.telegram.ui.ActionBar.r6.t(imageView4, i13, e6Var, mode2);
        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.k6.h0(f0(i14), 1, org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.n6 N4 = org.telegram.ui.ActionBar.r6.N(i14);
        imageView4.setBackground(h05);
        org.telegram.ui.ActionBar.r6.k(imageView4, h05, null, N4, e6Var);
        sdVar.addView(imageView4, b8.mf.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(org.telegram.messenger.bd.M0(2131754033, null));
        b8.pf.a(imageView4);
        imageView4.setOnClickListener(new ad(this, 20));
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setScaleX(0.6f);
        imageView4.setScaleY(0.6f);
        if (this.c3 != null) {
            T();
        }
        ImageView imageView5 = new ImageView(activity);
        this.C1 = imageView5;
        imageView5.setImageResource(R.drawable.send_outline);
        imageView5.setScaleType(scaleType);
        imageView5.setVisibility(8);
        org.telegram.ui.ActionBar.r6.t(imageView5, org.telegram.ui.ActionBar.k6.Vl, e6Var, mode);
        sdVar.addView(imageView5, b8.mf.e(44, 44, 85));
        sd sdVar3 = new sd(this, activity, 2);
        this.B1 = sdVar3;
        sdVar3.setClipChildren(false);
        sdVar3.setClipToPadding(false);
        sdVar.addView(sdVar3, b8.mf.e(100, 44, 85));
        be beVar = new be(this, activity, e6Var);
        this.a1 = beVar;
        beVar.setSoundEffectsEnabled(false);
        sdVar3.addView(beVar, b8.mf.e(44, 44, 85));
        beVar.setFocusable(true);
        beVar.setImportantForAccessibility(1);
        Drawable mutate = getResources().getDrawable(R.drawable.input_mic).mutate();
        this.O3 = mutate;
        org.telegram.ui.ActionBar.r6.y(this, mutate, i13, e6Var, mode2);
        Drawable mutate2 = getResources().getDrawable(R.drawable.input_video).mutate();
        this.P3 = mutate2;
        org.telegram.ui.ActionBar.r6.y(this, mutate2, i13, e6Var, mode2);
        ce ceVar = new ce(this, activity);
        this.c1 = ceVar;
        ceVar.setImportantForAccessibility(2);
        int L8 = org.telegram.messenger.g0.L(10.0f);
        ceVar.setPadding(L8, L8, L8, L8);
        beVar.addView(ceVar, b8.mf.c(44.0f, 44));
        ImageView imageView6 = new ImageView(activity);
        this.Q0 = imageView6;
        int i17 = 4;
        imageView6.setVisibility(4);
        imageView6.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        de deVar = new de();
        this.Q1 = deVar;
        imageView6.setImageDrawable(deVar);
        imageView6.setContentDescription(org.telegram.messenger.bd.M0(2131752589, "Cancel"));
        imageView6.setSoundEffectsEnabled(false);
        imageView6.setScaleX(0.1f);
        imageView6.setScaleY(0.1f);
        imageView6.setAlpha(0.0f);
        org.telegram.ui.Cells.y h06 = org.telegram.ui.ActionBar.k6.h0(f0(i14), 1, -1);
        org.telegram.ui.ActionBar.n6 N5 = org.telegram.ui.ActionBar.r6.N(i14);
        imageView6.setBackground(h06);
        org.telegram.ui.ActionBar.r6.k(imageView6, h06, null, N5, e6Var);
        sdVar3.addView(imageView6, b8.mf.e(44, 44, 85));
        imageView6.setOnClickListener(new ad(this, i12));
        ee eeVar = new ee(this, activity, c() ? R.drawable.input_schedule : R.drawable.send_plane_24, e6Var);
        this.K0 = eeVar;
        eeVar.setVisibility(4);
        eeVar.setContentDescription(org.telegram.messenger.bd.M0(2131745650, null));
        eeVar.setSoundEffectsEnabled(false);
        eeVar.setScaleX(0.1f);
        eeVar.setScaleY(0.1f);
        eeVar.setAlpha(0.0f);
        sdVar3.addView(eeVar, b8.mf.e(100, 44, 85));
        eeVar.setOnClickListener(new ad(this, 1));
        eeVar.setOnLongClickListener(new ed(this, i12));
        if (org.telegram.messenger.g0.C1()) {
            sdVar3.setOnLongClickListener(new ed(this, i12));
        }
        kh.h hVar = new kh.h(activity, e6Var);
        this.J0 = hVar;
        hVar.setVisibility(4);
        hVar.setOnClickListener(new ad(this, i17));
        sdVar3.addView(hVar, b8.mf.e(44, 44, 85));
        cg cgVar = new cg(activity);
        org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) cgVar.c;
        this.G0 = cgVar;
        k5Var.setTextSize(16);
        cgVar.invalidate();
        cgVar.setVisibility(4);
        cgVar.setSoundEffectsEnabled(false);
        cgVar.setScaleX(0.1f);
        cgVar.setScaleY(0.1f);
        cgVar.setAlpha(0.0f);
        cgVar.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        k5Var.setGravity(21);
        cgVar.invalidate();
        k5Var.setTextColor(f0(i13));
        cgVar.invalidate();
        sdVar3.addView(cgVar, b8.mf.e(74, 44, 85));
        cgVar.setOnClickListener(new ad(this, 8));
        cgVar.setOnLongClickListener(new ed(this, 1));
        SharedPreferences d12 = org.telegram.messenger.hp.d1();
        this.y2 = d12.getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
        this.z2 = d12.getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
        j1(false, false);
        E(false);
        A();
        S();
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
    public static boolean C(int i3, long j10, org.telegram.ui.ActionBar.d2 d2Var, CharSequence charSequence) {
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
        if (charSequence != null && d2Var != null && !org.telegram.messenger.h10.i(i3).q() && org.telegram.messenger.h10.i(i3).e() != j10 && (charSequence instanceof Spanned) && (p5VarArr = (p5[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), p5.class)) != null) {
            int i13 = 0;
            while (i13 < p5VarArr.length) {
                p5 p5Var = p5VarArr[i13];
                if (p5Var != null) {
                    TLRPC.Document document = p5Var.document;
                    if (document == null) {
                        i11 = i3;
                        document = g5.e(i11, p5Var.getDocumentId());
                    } else {
                        i11 = i3;
                    }
                    long documentId = p5VarArr[i13].getDocumentId();
                    if (document == null) {
                        ArrayList s02 = org.telegram.messenger.li.b0(i11).s0(5);
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
                        ArrayList arrayList6 = org.telegram.messenger.li.b0(i11).t0[1];
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
                                    TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.li.b0(i11).m0(tL_inputStickerSetID, true);
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
                    if (document != null && (N0 = org.telegram.messenger.hp.s1(i11).N0(-j10)) != null && N0.emojiset != null && (Y = org.telegram.messenger.li.b0(i11).Y(N0.emojiset)) != null) {
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
                    if (document == null || !org.telegram.messenger.zi.n3(document)) {
                        fc.a0(d2Var).r(document, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131743874, "UnlockPremiumEmojiHint")), org.telegram.messenger.bd.M0(2131747041, "PremiumMore"), new bd(0, d2Var)).j();
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

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(ChatActivityEnterView chatActivityEnterView, TL_keyboard.KeyboardButton keyboardButton) {
        boolean z10;
        org.telegram.messenger.zi ziVar;
        org.telegram.messenger.zi ziVar2;
        boolean Z;
        org.telegram.messenger.zi ziVar3;
        uf ufVar;
        org.telegram.ui.wm wmVar;
        boolean z11 = chatActivityEnterView.U2 != null && (wmVar = chatActivityEnterView.Q2) != null && wmVar.w4 && wmVar.b() == ((long) chatActivityEnterView.U2.f1());
        if (chatActivityEnterView.U2 == null || z11) {
            int i3 = chatActivityEnterView.R;
            long j10 = chatActivityEnterView.R2;
            if (j10 > 0) {
                z10 = org.telegram.messenger.l10.u(org.telegram.messenger.hp.s1(i3).a2(Long.valueOf(j10)));
            } else {
                org.telegram.messenger.hp.s1(i3).M0(Long.valueOf(-j10));
                z10 = false;
            }
            if (!z10) {
                ziVar = org.telegram.messenger.m5.z(chatActivityEnterView.R2) ? chatActivityEnterView.n2 : null;
                ziVar2 = chatActivityEnterView.U2;
                if (ziVar2 != null || z11) {
                    ziVar2 = chatActivityEnterView.n2;
                }
                Z = chatActivityEnterView.Z(keyboardButton, ziVar, ziVar2, null);
                if (chatActivityEnterView.U2 != null || z11) {
                    ziVar3 = chatActivityEnterView.n2;
                    if (ziVar3 != null && ziVar3.k.reply_markup.single_use) {
                        if (Z) {
                            chatActivityEnterView.s1(0, 0, true, true);
                        } else {
                            chatActivityEnterView.H0();
                        }
                        org.telegram.messenger.hp.s1(chatActivityEnterView.R).e7.edit().putInt("answered_" + chatActivityEnterView.getTopicKeyString(), chatActivityEnterView.n2.f1()).commit();
                    }
                } else {
                    chatActivityEnterView.H0();
                    chatActivityEnterView.Y0(chatActivityEnterView.X2, true, false);
                }
                ufVar = chatActivityEnterView.a3;
                if (ufVar == null) {
                    ufVar.G(null, true, 0, 0, 0L);
                    return;
                }
                return;
            }
        }
        ziVar = chatActivityEnterView.U2;
        ziVar2 = chatActivityEnterView.U2;
        if (ziVar2 != null) {
        }
        ziVar2 = chatActivityEnterView.n2;
        Z = chatActivityEnterView.Z(keyboardButton, ziVar, ziVar2, null);
        if (chatActivityEnterView.U2 != null) {
        }
        ziVar3 = chatActivityEnterView.n2;
        if (ziVar3 != null) {
            if (Z) {
            }
            org.telegram.messenger.hp.s1(chatActivityEnterView.R).e7.edit().putInt("answered_" + chatActivityEnterView.getTopicKeyString(), chatActivityEnterView.n2.f1()).commit();
        }
        ufVar = chatActivityEnterView.a3;
        if (ufVar == null) {
        }
    }

    public static void f(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.vi viVar, boolean z10, int i3, int i10, Object obj, Long l10, boolean z11) {
        if (chatActivityEnterView.H0 > 0 && !chatActivityEnterView.c()) {
            uf ufVar = chatActivityEnterView.a3;
            if (ufVar != null) {
                cg cgVar = chatActivityEnterView.G0;
                ufVar.h1(cgVar, ((org.telegram.ui.ActionBar.k5) cgVar.c).getText(), true);
                return;
            }
            return;
        }
        if (chatActivityEnterView.S1 != 0) {
            chatActivityEnterView.l1(0, true);
            chatActivityEnterView.V0.t(true);
            chatActivityEnterView.V0.A();
        }
        chatActivityEnterView.m1(false, true, false, true);
        uf ufVar2 = chatActivityEnterView.a3;
        TL_stories.StoryItem R0 = ufVar2 != null ? ufVar2.R0() : null;
        org.telegram.messenger.yy C = org.telegram.messenger.yy.C(chatActivityEnterView.R);
        long j10 = chatActivityEnterView.R2;
        org.telegram.messenger.zi ziVar = chatActivityEnterView.U2;
        org.telegram.messenger.zi threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.mm mmVar = chatActivityEnterView.W2;
        boolean z12 = obj instanceof TLRPC.TL_messages_stickerSet;
        org.telegram.ui.wm wmVar = chatActivityEnterView.Q2;
        C.v0(document, str, j10, ziVar, threadMessage, R0, mmVar, viVar, z10, i3, i10, z12, obj, wmVar != null ? wmVar.W8() : null, l10.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
        uf ufVar3 = chatActivityEnterView.a3;
        if (ufVar3 != null) {
            ufVar3.G(null, true, i3, 0, 0L);
        }
        if (z11) {
            chatActivityEnterView.setFieldText("");
        }
        org.telegram.messenger.li.b0(chatActivityEnterView.R).d(0, obj, document, (int) (System.currentTimeMillis() / 1000), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.telegram.messenger.zi getThreadMessage() {
        org.telegram.ui.wm wmVar = this.Q2;
        if (wmVar != null) {
            return wmVar.m4;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getThreadMessageId() {
        org.telegram.messenger.zi ziVar;
        org.telegram.ui.wm wmVar = this.Q2;
        if (wmVar == null || (ziVar = wmVar.m4) == null) {
            return 0;
        }
        return ziVar.f1();
    }

    private String getTopicKeyString() {
        org.telegram.ui.wm wmVar = this.Q2;
        if (wmVar == null || !wmVar.w4) {
            return "" + this.R2;
        }
        return this.R2 + "_" + wmVar.b();
    }

    public static CharSequence o(Paint.FontMetricsInt fontMetricsInt, CharSequence charSequence, ArrayList arrayList) {
        boolean z10;
        boolean z11;
        Collections.sort(arrayList, org.telegram.messenger.li.e2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(vz.a(charSequence, false));
        Object[] spans = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), Object.class);
        if (spans != null && spans.length > 0) {
            for (Object obj : spans) {
                spannableStringBuilder.removeSpan(obj);
            }
        }
        boolean z12 = true;
        if (arrayList != null) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                try {
                    TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i3);
                    if (messageEntity.offset + messageEntity.length <= spannableStringBuilder.length()) {
                        if (messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            y31 y31Var = new y31("" + ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id, 3, null);
                            int i10 = messageEntity.offset;
                            spannableStringBuilder.setSpan(y31Var, i10, messageEntity.length + i10, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            y31 y31Var2 = new y31("" + ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id, 3, null);
                            int i11 = messageEntity.offset;
                            spannableStringBuilder.setSpan(y31Var2, i11, messageEntity.length + i11, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityCode) {
                            ty0 ty0Var = new ty0();
                            ty0Var.a |= 4;
                            uy0 uy0Var = new uy0(ty0Var, 0);
                            int i12 = messageEntity.offset;
                            org.telegram.messenger.li.f(uy0Var, i12, messageEntity.length + i12, spannableStringBuilder, true);
                        } else if (!(messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                            if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                ty0 ty0Var2 = new ty0();
                                ty0Var2.a |= 1;
                                uy0 uy0Var2 = new uy0(ty0Var2, 0);
                                int i13 = messageEntity.offset;
                                org.telegram.messenger.li.f(uy0Var2, i13, messageEntity.length + i13, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                ty0 ty0Var3 = new ty0();
                                ty0Var3.a |= 2;
                                uy0 uy0Var3 = new uy0(ty0Var3, 0);
                                int i14 = messageEntity.offset;
                                org.telegram.messenger.li.f(uy0Var3, i14, messageEntity.length + i14, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                ty0 ty0Var4 = new ty0();
                                ty0Var4.a |= 8;
                                uy0 uy0Var4 = new uy0(ty0Var4, 0);
                                int i15 = messageEntity.offset;
                                org.telegram.messenger.li.f(uy0Var4, i15, messageEntity.length + i15, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                ty0 ty0Var5 = new ty0();
                                ty0Var5.a |= 16;
                                uy0 uy0Var5 = new uy0(ty0Var5, 0);
                                int i16 = messageEntity.offset;
                                org.telegram.messenger.li.f(uy0Var5, i16, messageEntity.length + i16, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                x31 x31Var = new x31(messageEntity.url, null);
                                int i17 = messageEntity.offset;
                                spannableStringBuilder.setSpan(x31Var, i17, messageEntity.length + i17, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityFormattedDate) {
                                ty0 ty0Var6 = new ty0();
                                ty0Var6.a |= 128;
                                int i18 = messageEntity.offset;
                                ty0Var6.b = i18;
                                ty0Var6.c = i18 + messageEntity.length;
                                ty0Var6.d = messageEntity;
                                int i19 = messageEntity.offset;
                                vz vzVar = new vz(spannableStringBuilder.subSequence(i19, messageEntity.length + i19).toString(), ty0Var6, (TLRPC.TL_messageEntityFormattedDate) messageEntity);
                                int i20 = messageEntity.offset;
                                spannableStringBuilder.setSpan(vzVar, i20, messageEntity.length + i20, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                ty0 ty0Var7 = new ty0();
                                ty0Var7.a |= 256;
                                uy0 uy0Var6 = new uy0(ty0Var7, 0);
                                int i21 = messageEntity.offset;
                                org.telegram.messenger.li.f(uy0Var6, i21, messageEntity.length + i21, spannableStringBuilder, true);
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
        CharSequence m10 = org.telegram.messenger.i6.m(new SpannableStringBuilder(spannableStringBuilder), fontMetricsInt, false, null, 0);
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
    public void setHintGlass(gi.l3 l3Var) {
        org.telegram.ui.wm wmVar = this.Q2;
        if (wmVar != null) {
            l3Var.l(wmVar.L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSlowModeButtonVisible(boolean z10) {
        int i3;
        int i10 = z10 ? 0 : 8;
        cg cgVar = this.G0;
        cgVar.setVisibility(i10);
        if (z10) {
            i3 = org.telegram.messenger.g0.L(cgVar.b ? 26.0f : 16.0f);
        } else {
            i3 = 0;
        }
        ve veVar = this.F0;
        if (veVar == null || veVar.getPaddingRight() == i3) {
            return;
        }
        this.F0.setPadding(0, org.telegram.messenger.g0.L(9.0f), i3, org.telegram.messenger.g0.L(10.0f));
    }

    public final void A() {
        org.telegram.ui.wm wmVar = this.Q2;
        if (wmVar == null) {
            return;
        }
        L1(wmVar.e, wmVar.r8);
    }

    public final void A0() {
        mi0 mi0Var = this.i1;
        if (mi0Var != null) {
            mi0Var.R = true;
            m51 m51Var = mi0Var.n;
            if (m51Var != null) {
                m51Var.u0(false);
                mi0Var.n.m0();
                mi0Var.n = null;
            }
        }
        if (this.i1 != null && this.c3 != null) {
            org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(this.R);
            long j10 = this.R2;
            org.telegram.ui.wm wmVar = this.Q2;
            long b10 = (wmVar == null || !wmVar.w4) ? 0L : wmVar.b();
            mi0 mi0Var2 = this.i1;
            float audioLeft = mi0Var2 == null ? 0.0f : mi0Var2.getAudioLeft();
            mi0 mi0Var3 = this.i1;
            b02.b2(j10, b10, audioLeft, mi0Var3 == null ? 1.0f : mi0Var3.getAudioRight());
        }
        this.Z1 = true;
        org.telegram.messenger.hs.f(this.R).n(this, org.telegram.messenger.hs.l2);
        org.telegram.messenger.hs.f(this.R).n(this, org.telegram.messenger.hs.o2);
        org.telegram.messenger.hs.f(this.R).n(this, org.telegram.messenger.hs.p2);
        org.telegram.messenger.hs.f(this.R).n(this, org.telegram.messenger.hs.m2);
        org.telegram.messenger.hs.f(this.R).n(this, org.telegram.messenger.hs.n2);
        org.telegram.messenger.hs.f(this.R).n(this, org.telegram.messenger.hs.k2);
        org.telegram.messenger.hs.f(this.R).n(this, org.telegram.messenger.hs.t);
        org.telegram.messenger.hs.f(this.R).n(this, org.telegram.messenger.hs.s2);
        org.telegram.messenger.hs.f(this.R).n(this, org.telegram.messenger.hs.u2);
        org.telegram.messenger.hs.f(this.R).n(this, org.telegram.messenger.hs.e2);
        org.telegram.messenger.hs.f(this.R).n(this, org.telegram.messenger.hs.z0);
        org.telegram.messenger.hs.f(this.R).n(this, org.telegram.messenger.hs.L);
        org.telegram.messenger.hs.f(this.R).n(this, org.telegram.messenger.hs.n1);
        org.telegram.messenger.hs.f(this.R).n(this, org.telegram.messenger.hs.t2);
        org.telegram.messenger.hs.f(this.R).n(this, org.telegram.messenger.hs.R2);
        org.telegram.messenger.hs.f(this.R).n(this, org.telegram.messenger.hs.Y2);
        org.telegram.messenger.hs.f(this.R).n(this, org.telegram.messenger.hs.f5);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.i4);
        kf kfVar = this.V0;
        if (kfVar != null) {
            kfVar.B();
        }
        yc ycVar = this.I0;
        if (ycVar != null) {
            org.telegram.messenger.g0.r(ycVar);
            this.I0 = null;
        }
        PowerManager.WakeLock wakeLock = this.r2;
        if (wakeLock != null) {
            try {
                wakeLock.release();
                this.r2 = null;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        if (this.x2 != 0 && !this.d1) {
            org.telegram.messenger.g0.h3(new vf(this.P2, 18));
        }
        qt0 qt0Var = this.n1;
        if (qt0Var != null) {
            qt0Var.setDelegate(null);
        }
        le leVar = this.r0;
        if (leVar != null) {
            leVar.e = false;
            leVar.dismiss();
        }
    }

    public final void A1() {
        float f10;
        lg.k kVar = this.s1;
        if (kVar == null) {
            return;
        }
        float f11 = this.E + this.y;
        ee eeVar = this.K0;
        if (eeVar != null) {
            f10 = eeVar.getAlpha() * (-k2.p1.d(56.0f, eeVar.l(), 0));
        } else {
            f10 = 0.0f;
        }
        kVar.setTranslationX(f11 + f10);
    }

    public final void B(boolean z10) {
        org.telegram.messenger.zi ziVar;
        boolean z11 = this.R2 < 0 && this.Y3 && this.a2 == null && (cg.v.g(this.R).e(getEditText() != null ? getEditText().toString() : null, this.c5) > 0 || ((ziVar = this.U2) != null && org.telegram.messenger.zi.d3(ziVar.k)));
        qe.a aVar = this.n5;
        boolean z12 = aVar.f != z11;
        aVar.a(z11, z10);
        ee eeVar = this.K0;
        if (eeVar != null) {
            eeVar.w = z11;
            eeVar.invalidate();
        }
        if (z12) {
            E(z10);
        }
    }

    public final void B1() {
        A1();
        ci.q qVar = this.q1;
        if (qVar != null) {
            qVar.setTranslationX(this.E + this.y);
            qVar.setAlpha(this.F * this.G);
            qVar.setVisibility(qVar.getAlpha() > 0.0f ? 0 : 8);
            lg.k kVar = this.s1;
            if (kVar != null && this.B4) {
                kVar.setAlpha(this.w1 * this.G);
            }
        }
        ge geVar = this.K1;
        if (geVar != null) {
            geVar.setTranslationX(geVar.a);
        }
    }

    public final void C0() {
        this.k2 = true;
        le leVar = this.r0;
        if (leVar != null) {
            leVar.e = false;
            leVar.dismiss();
        }
        if (this.A2) {
            this.m2 = true;
        }
        yc ycVar = new yc(this, 9);
        this.O4 = ycVar;
        org.telegram.messenger.g0.i3(ycVar, 500L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b5, code lost:
    
        if (android.text.TextUtils.isEmpty(r15 == null ? "" : org.telegram.messenger.g0.n1(r15.getTextToUse())) != false) goto L124;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C1(boolean z10) {
        ie ieVar;
        if (this.Y3) {
            org.telegram.ui.wm wmVar = this.Q2;
            if (wmVar != null && !wmVar.e6) {
                z10 = false;
            }
            boolean g02 = g0();
            int i3 = 1;
            boolean z11 = this.r5 != 1 && this.R2 > 0;
            ie ieVar2 = this.y1;
            boolean z12 = ieVar2 != null && ieVar2.getVisibility() == 0;
            if (!g02 && !this.q2 && this.o2 == null) {
                ie ieVar3 = this.y1;
                if (ieVar3 != null) {
                    ieVar3.setVisibility(8);
                }
            } else if (this.o2 != null) {
                if (r0() && this.g2 == 1 && this.o2.is_persistent) {
                    ie ieVar4 = this.y1;
                    if (ieVar4 != null && ieVar4.getVisibility() != 8) {
                        this.y1.setVisibility(8);
                    }
                } else {
                    M();
                    if (this.y1.getVisibility() != 0) {
                        this.y1.setVisibility(0);
                    }
                    this.V1.a(R.drawable.input_bot2, true);
                    this.y1.setContentDescription(org.telegram.messenger.bd.M0(2131754918, "AccDescrBotKeyboard"));
                }
            } else if (z11) {
                ie ieVar5 = this.y1;
                if (ieVar5 != null) {
                    ieVar5.setVisibility(8);
                }
            } else {
                M();
                this.V1.a(R.drawable.input_bot1, true);
                this.y1.setContentDescription(org.telegram.messenger.bd.M0(2131754919, "AccDescrBotCommands"));
                this.y1.setVisibility(0);
            }
            if (z11) {
                N();
            }
            ie ieVar6 = this.y1;
            boolean z13 = (ieVar6 != null && ieVar6.getVisibility() == 0) != z12;
            ii.a0 a0Var = this.m0;
            int i10 = 2;
            if (a0Var != null) {
                boolean z14 = a0Var.x;
                a0Var.setWebView(this.r5 == 3);
                ii.a0 a0Var2 = this.m0;
                String M0 = this.r5 == 2 ? org.telegram.messenger.bd.M0(2131752891, null) : this.j0;
                if (M0 == null) {
                    a0Var2.getClass();
                    M0 = org.telegram.messenger.bd.M0(2131752891, null);
                }
                String str = a0Var2.n;
                boolean z15 = str == null || !str.equals(M0);
                a0Var2.n = M0;
                a0Var2.r = null;
                a0Var2.requestLayout();
                org.telegram.messenger.g0.Z3(this.m0, z11, 0.5f, true, z10);
                z13 = z13 || z15 || z14 != this.m0.x;
            }
            if (z13 && z10) {
                ud udVar = this.R0;
                Float valueOf = Float.valueOf(udVar.getX());
                HashMap hashMap = this.C0;
                hashMap.put(udVar, valueOf);
                ve veVar = this.F0;
                if (veVar != null) {
                    hashMap.put(veVar, Float.valueOf(veVar.getX()));
                }
                ie ieVar7 = this.y1;
                boolean z16 = ieVar7 != null && ieVar7.getVisibility() == 0;
                if (z16 != z12 && (ieVar = this.y1) != null) {
                    ieVar.setVisibility(0);
                    if (z16) {
                        this.y1.setAlpha(0.0f);
                        this.y1.setScaleX(0.1f);
                        this.y1.setScaleY(0.1f);
                    } else if (!z16) {
                        this.y1.setAlpha(1.0f);
                        this.y1.setScaleX(1.0f);
                        this.y1.setScaleY(1.0f);
                    }
                    org.telegram.messenger.g0.Y3(this.y1, z16, 0.1f, true, 1.0f, true, new xc(this, i3));
                }
            }
            ie ieVar8 = this.y1;
            if (ieVar8 != null && ieVar8.getVisibility() == 0) {
                ve veVar2 = this.F0;
            }
            i10 = this.Q4;
            I1(i10);
        }
    }

    public final void D() {
        boolean z10;
        boolean z11;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        if (this.f2) {
            return;
        }
        if (this.q1 == null) {
            this.f2 = false;
            j1(false, false);
            return;
        }
        boolean z12 = true;
        this.f2 = true;
        this.y0 = true;
        this.z0 = true;
        if (org.telegram.messenger.m5.z(this.R2)) {
            TLRPC.Chat M0 = org.telegram.messenger.hp.s1(this.S.a).M0(Long.valueOf(-this.R2));
            z10 = org.telegram.messenger.t3.T(M0) && !M0.megagroup;
            if (z10 && !M0.creator && ((tL_chatAdminRights = M0.admin_rights) == null || !tL_chatAdminRights.post_messages)) {
                this.f2 = false;
            }
            this.y0 = org.telegram.messenger.t3.s(M0);
            this.z0 = org.telegram.messenger.t3.v(M0);
        } else {
            z10 = false;
        }
        if (!org.telegram.messenger.az.y0) {
            this.f2 = false;
        }
        if (this.f2) {
            if (org.telegram.messenger.az.P0) {
                CameraController.getInstance().initCamera(null);
            }
            z11 = org.telegram.messenger.hp.e1().getBoolean(z10 ? "currentModeVideoChannel" : "currentModeVideo", z10);
        } else {
            z11 = false;
        }
        if (!this.y0 && z11) {
            z11 = false;
        }
        if (this.z0 || z11) {
            z12 = z11;
        } else if (!this.f2) {
            z12 = false;
        }
        j1(z12, false);
    }

    public final void D0() {
        ve veVar;
        this.k2 = false;
        yc ycVar = this.O4;
        if (ycVar != null) {
            org.telegram.messenger.g0.r(ycVar);
            this.O4 = null;
        }
        if (g0() && s()) {
            return;
        }
        getVisibility();
        if (!this.m2 || org.telegram.ui.ActionBar.d2.hasSheets(this.Q2)) {
            return;
        }
        this.m2 = false;
        uf ufVar = this.a3;
        if (ufVar != null) {
            ufVar.e1();
        }
        if (this.S1 == 0 && (veVar = this.F0) != null) {
            veVar.requestFocus();
        }
        org.telegram.messenger.g0.K3(this.F0);
        if (org.telegram.messenger.g0.D || this.A2 || org.telegram.messenger.g0.E) {
            return;
        }
        this.l3 = true;
        he heVar = this.s3;
        org.telegram.messenger.g0.r(heVar);
        org.telegram.messenger.g0.i3(heVar, 100L);
    }

    public final void D1() {
        int d;
        u4.b0 b0Var;
        int L0;
        View m10;
        te teVar = this.n0;
        if (teVar == null) {
            return;
        }
        int childCount = teVar.c.getChildCount();
        int i3 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.n0.c.getChildAt(i10);
            if (i10 < 4) {
                i3 += childAt.getMeasuredHeight();
            }
        }
        qt0 qt0Var = this.n1;
        if (i3 > 0) {
            d = k2.p1.d(childCount > 4 ? 12.0f : 0.0f, (qt0Var.getMeasuredHeight() - i3) - org.telegram.messenger.g0.L(8.0f), 0);
        } else {
            d = this.o0.c.size() > 4 ? k2.p1.d(162.8f, qt0Var.getMeasuredHeight(), 0) : k2.p1.d((Math.max(1, Math.min(4, this.o0.c.size())) * 36) + 8, qt0Var.getMeasuredHeight(), 0);
        }
        if (this.n0.c.getPaddingTop() != d) {
            this.n0.c.setTopGlowOffset(d);
            if (this.a5 == -1 && this.n0.getVisibility() == 0 && this.n0.c.getLayoutManager() != null && (L0 = (b0Var = (u4.b0) this.n0.c.getLayoutManager()).L0()) >= 0 && (m10 = b0Var.m(L0)) != null) {
                this.a5 = L0;
                this.b5 = m10.getTop() - this.n0.c.getPaddingTop();
            }
            this.n0.c.setPadding(0, d, 0, org.telegram.messenger.g0.L(8.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:295:0x0814, code lost:
    
        if (org.telegram.messenger.t3.s(r4) == false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0817, code lost:
    
        r17 = 0.5f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0822, code lost:
    
        if (r3.voice_messages_forbidden != false) goto L283;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0eea  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0853  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x087b  */
    /* JADX WARN: Type inference failed for: r3v173 */
    /* JADX WARN: Type inference failed for: r3v174, types: [android.animation.AnimatorSet, android.view.ViewPropertyAnimator] */
    /* JADX WARN: Type inference failed for: r3v189 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r4v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(boolean z10) {
        String str;
        be beVar;
        ee eeVar;
        int i3;
        boolean z11;
        AnimatorSet animatorSet;
        ?? r42;
        int i10;
        boolean z12;
        ie ieVar;
        ie ieVar2;
        AnimatorSet animatorSet2;
        int i11;
        float f10;
        ie ieVar3;
        AnimatorSet animatorSet3;
        ImageView imageView;
        int i12;
        boolean z13;
        ?? r32;
        ?? r43;
        int i13;
        if (this.a2 != null || this.G2) {
            return;
        }
        boolean z14 = this.k2 ? false : z10;
        S1();
        ve veVar = this.F0;
        CharSequence n12 = veVar == null ? "" : org.telegram.messenger.g0.n1(veVar.getTextToUse());
        int i14 = this.H0;
        ee eeVar2 = this.K0;
        rd rdVar = this.b4;
        be beVar2 = this.a1;
        Property property = View.SCALE_X;
        Property property2 = View.SCALE_Y;
        Property property3 = View.ALPHA;
        ci.q qVar = this.q1;
        ce ceVar = this.c1;
        cg cgVar = this.G0;
        lg.k kVar = this.s1;
        ImageView imageView2 = this.Q0;
        boolean z15 = z14;
        if (i14 <= 0 || i14 == Integer.MAX_VALUE || w0()) {
            int length = n12.length();
            qe.a aVar = this.m5;
            if (length > 0 || this.I2 || this.E1 || this.c3 != null || this.f3 != null || ((this.H0 == Integer.MAX_VALUE && !w0()) || ((this.q5 && getStarsPrice() > 0) || aVar.f))) {
                ve veVar2 = this.F0;
                String caption = veVar2 == null ? null : veVar2.getCaption();
                boolean z16 = caption != null && (getSendButtonInternal().getVisibility() == 0 || ((ieVar2 = this.T0) != null && ieVar2.getVisibility() == 0));
                boolean z17 = caption == null && (imageView2.getVisibility() == 0 || ((ieVar = this.T0) != null && ieVar.getVisibility() == 0));
                int f02 = (this.H0 != Integer.MAX_VALUE || w0()) ? f0(org.telegram.ui.ActionBar.k6.Me) : f0(org.telegram.ui.ActionBar.k6.Kl);
                boolean o02 = o0();
                boolean z18 = (this.x2 == 0 && this.c3 == null && this.f3 == null) ? false : true;
                boolean z19 = (o02 || z18) ? false : true;
                boolean z20 = z18;
                if (f02 != this.L0) {
                    this.L0 = f02;
                    Drawable background = eeVar2.getBackground();
                    int i15 = f02;
                    int red = Color.red(i15);
                    eeVar = eeVar2;
                    int green = Color.green(i15);
                    beVar = beVar2;
                    int blue = Color.blue(i15);
                    str = caption;
                    org.telegram.ui.ActionBar.k6.H1(background, Color.argb(24, red, green, blue), true);
                } else {
                    str = caption;
                    beVar = beVar2;
                    eeVar = eeVar2;
                }
                if (beVar.getVisibility() != 0 && cgVar.getVisibility() != 0 && !z16 && !z17 && !aVar.f) {
                    mh.h hVar = this.j5;
                    if (hVar != null) {
                        hVar.e(0, o02 && !z20, true);
                        if (kVar != null) {
                            ViewPropertyAnimator viewPropertyAnimator = this.r1;
                            if (viewPropertyAnimator != null) {
                                viewPropertyAnimator.cancel();
                                this.r1 = null;
                            }
                            ViewPropertyAnimator animate = kVar.animate();
                            float f11 = z19 ? 1.0f : 0.0f;
                            this.w1 = f11;
                            ViewPropertyAnimator duration = animate.alpha(f11).scaleX(z19 ? 1.0f : 0.5f).scaleY(z19 ? 1.0f : 0.5f).setInterpolator(xq.h).setDuration(320L);
                            this.r1 = duration;
                            duration.start();
                        }
                    }
                } else {
                    if (!z15) {
                        String str2 = str;
                        ceVar.setScaleX(0.1f);
                        ceVar.setScaleY(0.1f);
                        ceVar.setAlpha(0.0f);
                        beVar.setVisibility(8);
                        if (cgVar.getVisibility() == 0) {
                            cgVar.setScaleX(0.1f);
                            cgVar.setScaleY(0.1f);
                            cgVar.setAlpha(0.0f);
                            setSlowModeButtonVisible(false);
                        }
                        if (str2 != null) {
                            getSendButtonInternal().setScaleX(0.1f);
                            getSendButtonInternal().setScaleY(0.1f);
                            getSendButtonInternal().setAlpha(0.0f);
                            getSendButtonInternal().setVisibility(8);
                            imageView2.setScaleX(1.0f);
                            imageView2.setScaleY(1.0f);
                            imageView2.setAlpha(1.0f);
                            imageView2.setVisibility(0);
                        } else {
                            imageView2.setScaleX(0.1f);
                            imageView2.setScaleY(0.1f);
                            imageView2.setAlpha(0.0f);
                            getSendButtonInternal().setVisibility(0);
                            getSendButtonInternal().setScaleX(1.0f);
                            getSendButtonInternal().setScaleY(1.0f);
                            getSendButtonInternal().setAlpha(1.0f);
                            imageView2.setVisibility(8);
                        }
                        ie ieVar4 = this.T0;
                        if (ieVar4 == null || ieVar4.getVisibility() != 0) {
                            i3 = 8;
                        } else {
                            this.T0.setScaleX(0.1f);
                            this.T0.setScaleY(0.1f);
                            this.T0.setAlpha(0.0f);
                            i3 = 8;
                            this.T0.setVisibility(8);
                        }
                        if (qVar != null) {
                            qVar.setVisibility(i3);
                            if (this.a3 != null && getVisibility() == 0) {
                                this.a3.q0();
                            }
                            I1(0);
                            mh.h hVar2 = this.j5;
                            if (hVar2 != null) {
                                hVar2.e(0, o02 && !z20, true);
                                if (kVar != null) {
                                    float f12 = z19 ? 1.0f : 0.0f;
                                    this.w1 = f12;
                                    kVar.setAlpha(f12);
                                    kVar.setScaleX(z19 ? 1.0f : 0.5f);
                                    kVar.setScaleY(z19 ? 1.0f : 0.5f);
                                }
                            } else if (kVar != null) {
                                this.w1 = 0.0f;
                                kVar.setAlpha(0.0f);
                                kVar.setScaleX(0.5f);
                                kVar.setScaleY(0.5f);
                            }
                        }
                        z11 = true;
                        this.M1 = true;
                        if (this.K1 != null) {
                            uf ufVar = this.a3;
                            if (ufVar != null && ufVar.u0()) {
                                this.K1.setVisibility(8);
                                this.K1.setTag(null);
                            }
                            this.K1.setAlpha(0.0f);
                            this.K1.setScaleX(0.0f);
                            this.K1.setScaleY(1.0f);
                            this.K1.setTranslationX(0.0f);
                        }
                        z12 = z11;
                        if (!this.B4 || (imageView = this.x1) == null) {
                            return;
                        }
                        if (z15) {
                            imageView.animate().translationX(z12 ? -k2.p1.d(64.0f, eeVar.l(), 0) : org.telegram.messenger.g0.L(42.0f)).setDuration(320L).setInterpolator(xq.h).start();
                            return;
                        } else {
                            imageView.setTranslationX(z12 ? -k2.p1.d(64.0f, eeVar.l(), 0) : org.telegram.messenger.g0.L(42.0f));
                            return;
                        }
                    }
                    int i16 = this.w2;
                    if (i16 == 1 && str == null) {
                        return;
                    }
                    if (i16 == 3 && str != null) {
                        return;
                    }
                    AnimatorSet animatorSet4 = this.s2;
                    if (animatorSet4 != null) {
                        animatorSet4.cancel();
                        animatorSet = null;
                        this.s2 = null;
                    } else {
                        animatorSet = null;
                    }
                    AnimatorSet animatorSet5 = this.t2;
                    if (animatorSet5 != null) {
                        animatorSet5.cancel();
                        this.t2 = animatorSet;
                    }
                    if (qVar != null) {
                        this.t2 = new AnimatorSet();
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(ObjectAnimator.ofFloat(qVar, rdVar, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(qVar, (Property<ci.q, Float>) property, 0.5f));
                        ViewPropertyAnimator viewPropertyAnimator2 = this.r1;
                        if (viewPropertyAnimator2 != null) {
                            viewPropertyAnimator2.cancel();
                            this.r1 = null;
                        }
                        mh.h hVar3 = this.j5;
                        if (hVar3 != null) {
                            hVar3.e(0, o02 && !z20, true);
                            if (kVar != null) {
                                float f13 = z19 ? 1.0f : 0.0f;
                                this.w1 = f13;
                                arrayList.add(ObjectAnimator.ofFloat(kVar, (Property<lg.k, Float>) property3, f13));
                                arrayList.add(ObjectAnimator.ofFloat(kVar, (Property<lg.k, Float>) property, z19 ? 1.0f : 0.5f));
                                arrayList.add(ObjectAnimator.ofFloat(kVar, (Property<lg.k, Float>) property2, z19 ? 1.0f : 0.5f));
                            }
                        } else if (kVar != null) {
                            this.w1 = 0.0f;
                            arrayList.add(ObjectAnimator.ofFloat(kVar, (Property<lg.k, Float>) property3, 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(kVar, (Property<lg.k, Float>) property, 0.5f));
                            arrayList.add(ObjectAnimator.ofFloat(kVar, (Property<lg.k, Float>) property2, 0.5f));
                        }
                        uf ufVar2 = this.a3;
                        boolean z21 = ufVar2 != null && ufVar2.u0();
                        this.M1 = true;
                        ge geVar = this.K1;
                        if (geVar != null) {
                            geVar.setScaleY(1.0f);
                            if (z21) {
                                this.K1.setTag(null);
                                arrayList.add(ObjectAnimator.ofFloat(this.K1, (Property<ge, Float>) property3, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(this.K1, (Property<ge, Float>) property, 0.0f));
                                arrayList.add(m(0.0f));
                            } else {
                                this.K1.setAlpha(0.0f);
                                this.K1.setScaleX(0.0f);
                                this.K1.setTranslationX(0.0f);
                            }
                        }
                        this.t2.playTogether(arrayList);
                        this.t2.setDuration(100L);
                        this.t2.addListener(new je(this, z21, 1));
                        this.t2.start();
                        I1(0);
                        if (this.a3 != null && getVisibility() == 0) {
                            this.a3.q0();
                        }
                    }
                    this.s2 = new AnimatorSet();
                    ArrayList arrayList2 = new ArrayList();
                    if (beVar.getVisibility() == 0) {
                        i10 = 1;
                        r42 = 0;
                        arrayList2.add(ObjectAnimator.ofFloat(ceVar, (Property<ce, Float>) property, 0.1f));
                        arrayList2.add(ObjectAnimator.ofFloat(ceVar, (Property<ce, Float>) property2, 0.1f));
                        arrayList2.add(ObjectAnimator.ofFloat(ceVar, (Property<ce, Float>) property3, 0.0f));
                    } else {
                        r42 = 0;
                        i10 = 1;
                    }
                    ie ieVar5 = this.T0;
                    if (ieVar5 != null && ieVar5.getVisibility() == 0) {
                        ie ieVar6 = this.T0;
                        float[] fArr = new float[i10];
                        fArr[r42] = 0.1f;
                        arrayList2.add(ObjectAnimator.ofFloat(ieVar6, (Property<ie, Float>) property, fArr));
                        ie ieVar7 = this.T0;
                        float[] fArr2 = new float[i10];
                        fArr2[r42] = 0.1f;
                        arrayList2.add(ObjectAnimator.ofFloat(ieVar7, (Property<ie, Float>) property2, fArr2));
                        ie ieVar8 = this.T0;
                        float[] fArr3 = new float[i10];
                        fArr3[r42] = 0.0f;
                        arrayList2.add(ObjectAnimator.ofFloat(ieVar8, (Property<ie, Float>) property3, fArr3));
                    }
                    if (cgVar.getVisibility() == 0) {
                        float[] fArr4 = new float[i10];
                        fArr4[r42] = 0.1f;
                        arrayList2.add(ObjectAnimator.ofFloat(cgVar, (Property<cg, Float>) property, fArr4));
                        float[] fArr5 = new float[i10];
                        fArr5[r42] = 0.1f;
                        arrayList2.add(ObjectAnimator.ofFloat(cgVar, (Property<cg, Float>) property2, fArr5));
                        float[] fArr6 = new float[i10];
                        fArr6[r42] = 0.0f;
                        arrayList2.add(ObjectAnimator.ofFloat(cgVar, (Property<cg, Float>) property3, fArr6));
                    }
                    if (z16) {
                        arrayList2.add(n(r42));
                    } else if (z17) {
                        float[] fArr7 = new float[i10];
                        fArr7[r42] = 0.1f;
                        arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, fArr7));
                        float[] fArr8 = new float[i10];
                        fArr8[r42] = 0.1f;
                        arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, fArr8));
                        float[] fArr9 = new float[i10];
                        fArr9[r42] = 0.0f;
                        arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, fArr9));
                    }
                    if (str != null) {
                        this.w2 = 3;
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
                        this.w2 = i10;
                        arrayList2.add(n(i10));
                        getSendButtonInternal().setVisibility(r42);
                    }
                    this.s2.playTogether(arrayList2);
                    this.s2.setDuration(220L);
                    this.s2.setInterpolator(xq.h);
                    this.s2.addListener(new bh.j(20, this, str));
                    this.s2.start();
                }
                z11 = true;
                z12 = z11;
                if (this.B4) {
                    return;
                } else {
                    return;
                }
            }
            if (this.V0 == null || !this.X0 || (!(this.y3 || (this.z3 && this.S1 == 2)) || org.telegram.messenger.g0.E || this.q5)) {
                if (getSendButtonInternal().getVisibility() == 0 || imageView2.getVisibility() == 0 || (((ieVar3 = this.T0) != null && ieVar3.getVisibility() == 0) || cgVar.getVisibility() == 0)) {
                    if (!z15) {
                        cgVar.setScaleX(0.1f);
                        cgVar.setScaleY(0.1f);
                        cgVar.setAlpha(0.0f);
                        setSlowModeButtonVisible(false);
                        getSendButtonInternal().setScaleX(0.1f);
                        getSendButtonInternal().setScaleY(0.1f);
                        getSendButtonInternal().setAlpha(0.0f);
                        getSendButtonInternal().setVisibility(8);
                        imageView2.setScaleX(0.1f);
                        imageView2.setScaleY(0.1f);
                        imageView2.setAlpha(0.0f);
                        imageView2.setVisibility(8);
                        ie ieVar9 = this.T0;
                        if (ieVar9 != null) {
                            ieVar9.setScaleX(0.1f);
                            this.T0.setScaleY(0.1f);
                            this.T0.setAlpha(0.0f);
                            this.T0.setVisibility(8);
                        }
                        ceVar.setScaleX(1.0f);
                        ceVar.setScaleY(1.0f);
                        ceVar.setAlpha(1.0f);
                        beVar2.setVisibility(0);
                        if (qVar != null) {
                            if (getVisibility() == 0) {
                                this.a3.n2();
                            }
                            this.F = 1.0f;
                            B1();
                            qVar.setScaleX(1.0f);
                            qVar.setVisibility(0);
                            I1(1);
                        }
                        if (kVar != null) {
                            ViewPropertyAnimator viewPropertyAnimator3 = this.r1;
                            if (viewPropertyAnimator3 != null) {
                                viewPropertyAnimator3.cancel();
                                this.r1 = null;
                            }
                            this.w1 = 1.0f;
                            kVar.setAlpha(1.0f);
                            kVar.setScaleX(1.0f);
                            kVar.setScaleY(1.0f);
                        }
                        this.M1 = false;
                        uf ufVar3 = this.a3;
                        if (ufVar3 != null && ufVar3.u0()) {
                            W();
                        }
                        if (this.K1 != null) {
                            uf ufVar4 = this.a3;
                            if (ufVar4 != null && ufVar4.u0()) {
                                this.K1.setVisibility(0);
                                this.K1.setTag(1);
                            }
                            this.K1.setAlpha(1.0f);
                            this.K1.setScaleX(1.0f);
                            this.K1.setScaleY(1.0f);
                            this.K1.setTranslationX(0.0f);
                        }
                    } else {
                        if (this.w2 == 2) {
                            return;
                        }
                        AnimatorSet animatorSet6 = this.s2;
                        if (animatorSet6 != null) {
                            animatorSet6.cancel();
                            animatorSet2 = null;
                            this.s2 = null;
                        } else {
                            animatorSet2 = null;
                        }
                        AnimatorSet animatorSet7 = this.t2;
                        if (animatorSet7 != null) {
                            animatorSet7.cancel();
                            this.t2 = animatorSet2;
                        }
                        if (qVar != null) {
                            if (qVar.getVisibility() != 0) {
                                qVar.setVisibility(0);
                                this.F = 0.0f;
                                B1();
                                qVar.setScaleX(0.0f);
                            }
                            this.t2 = new AnimatorSet();
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(ObjectAnimator.ofFloat(qVar, rdVar, 1.0f));
                            arrayList3.add(ObjectAnimator.ofFloat(qVar, (Property<ci.q, Float>) property, 1.0f));
                            mh.h hVar4 = this.j5;
                            if (hVar4 != null) {
                                hVar4.e(0, false, true);
                            }
                            if (kVar != null) {
                                ViewPropertyAnimator viewPropertyAnimator4 = this.r1;
                                if (viewPropertyAnimator4 != null) {
                                    viewPropertyAnimator4.cancel();
                                    this.r1 = null;
                                }
                                this.w1 = 1.0f;
                                arrayList3.add(ObjectAnimator.ofFloat(kVar, (Property<lg.k, Float>) property3, 1.0f));
                                arrayList3.add(ObjectAnimator.ofFloat(kVar, (Property<lg.k, Float>) property, 1.0f));
                                arrayList3.add(ObjectAnimator.ofFloat(kVar, (Property<lg.k, Float>) property2, 1.0f));
                            }
                            uf ufVar5 = this.a3;
                            boolean z22 = ufVar5 != null && ufVar5.u0();
                            this.M1 = false;
                            if (z22) {
                                W();
                            }
                            ge geVar2 = this.K1;
                            if (geVar2 != null) {
                                if (z22) {
                                    geVar2.setVisibility(0);
                                    this.K1.setTag(1);
                                    this.K1.setPivotX(org.telegram.messenger.g0.L(44.0f));
                                    arrayList3.add(ObjectAnimator.ofFloat(this.K1, (Property<ge, Float>) property3, 1.0f));
                                    arrayList3.add(ObjectAnimator.ofFloat(this.K1, (Property<ge, Float>) property, 1.0f));
                                    arrayList3.add(m(0.0f));
                                    ImageView imageView3 = this.J1;
                                    if (imageView3 != null && imageView3.getVisibility() == 0) {
                                        imageView3.setVisibility(8);
                                    }
                                } else {
                                    geVar2.setAlpha(1.0f);
                                    this.K1.setScaleX(1.0f);
                                    this.K1.setScaleY(1.0f);
                                    this.K1.setTranslationX(0.0f);
                                }
                            }
                            this.t2.playTogether(arrayList3);
                            this.t2.setDuration(100L);
                            this.t2.addListener(new fe(this, 6));
                            this.t2.start();
                            I1(1);
                            if (getVisibility() == 0) {
                                this.a3.n2();
                            }
                        }
                        beVar2.setVisibility(0);
                        this.s2 = new AnimatorSet();
                        this.w2 = 2;
                        ArrayList arrayList4 = new ArrayList();
                        org.telegram.ui.wm wmVar = this.Q2;
                        TLRPC.Chat g7 = wmVar == null ? null : wmVar.g();
                        TLRPC.UserFull P8 = wmVar == null ? this.L : wmVar.P8();
                        if (g7 != null) {
                            if (!org.telegram.messenger.t3.v(g7)) {
                            }
                            f10 = 1.0f;
                        } else if (P8 == null) {
                            i11 = 1;
                            f10 = 1.0f;
                            float[] fArr13 = new float[i11];
                            fArr13[0] = 1.0f;
                            arrayList4.add(ObjectAnimator.ofFloat(ceVar, (Property<ce, Float>) property, fArr13));
                            float[] fArr14 = new float[i11];
                            fArr14[0] = 1.0f;
                            arrayList4.add(ObjectAnimator.ofFloat(ceVar, (Property<ce, Float>) property2, fArr14));
                            float[] fArr15 = new float[i11];
                            fArr15[0] = f10;
                            arrayList4.add(ObjectAnimator.ofFloat(ceVar, (Property<ce, Float>) property3, fArr15));
                            if (imageView2.getVisibility() != 0) {
                                float[] fArr16 = new float[i11];
                                fArr16[0] = 0.1f;
                                arrayList4.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, fArr16));
                                float[] fArr17 = new float[i11];
                                fArr17[0] = 0.1f;
                                arrayList4.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, fArr17));
                                float[] fArr18 = new float[i11];
                                fArr18[0] = 0.0f;
                                arrayList4.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, fArr18));
                            } else {
                                ie ieVar10 = this.T0;
                                if (ieVar10 != null && ieVar10.getVisibility() == 0) {
                                    ie ieVar11 = this.T0;
                                    float[] fArr19 = new float[i11];
                                    fArr19[0] = 0.1f;
                                    arrayList4.add(ObjectAnimator.ofFloat(ieVar11, (Property<ie, Float>) property, fArr19));
                                    ie ieVar12 = this.T0;
                                    float[] fArr20 = new float[i11];
                                    fArr20[0] = 0.1f;
                                    arrayList4.add(ObjectAnimator.ofFloat(ieVar12, (Property<ie, Float>) property2, fArr20));
                                    ie ieVar13 = this.T0;
                                    float[] fArr21 = new float[i11];
                                    fArr21[0] = 0.0f;
                                    arrayList4.add(ObjectAnimator.ofFloat(ieVar13, (Property<ie, Float>) property3, fArr21));
                                } else if (cgVar.getVisibility() == 0) {
                                    float[] fArr22 = new float[i11];
                                    fArr22[0] = 0.1f;
                                    arrayList4.add(ObjectAnimator.ofFloat(cgVar, (Property<cg, Float>) property, fArr22));
                                    float[] fArr23 = new float[i11];
                                    fArr23[0] = 0.1f;
                                    arrayList4.add(ObjectAnimator.ofFloat(cgVar, (Property<cg, Float>) property2, fArr23));
                                    float[] fArr24 = new float[i11];
                                    fArr24[0] = 0.0f;
                                    arrayList4.add(ObjectAnimator.ofFloat(cgVar, (Property<cg, Float>) property3, fArr24));
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
                            this.s2.playTogether(arrayList4);
                            this.s2.setDuration(150L);
                            this.s2.addListener(new fe(this, 7));
                            this.s2.start();
                        }
                        i11 = 1;
                        float[] fArr132 = new float[i11];
                        fArr132[0] = 1.0f;
                        arrayList4.add(ObjectAnimator.ofFloat(ceVar, (Property<ce, Float>) property, fArr132));
                        float[] fArr142 = new float[i11];
                        fArr142[0] = 1.0f;
                        arrayList4.add(ObjectAnimator.ofFloat(ceVar, (Property<ce, Float>) property2, fArr142));
                        float[] fArr152 = new float[i11];
                        fArr152[0] = f10;
                        arrayList4.add(ObjectAnimator.ofFloat(ceVar, (Property<ce, Float>) property3, fArr152));
                        if (imageView2.getVisibility() != 0) {
                        }
                        this.s2.playTogether(arrayList4);
                        this.s2.setDuration(150L);
                        this.s2.addListener(new fe(this, 7));
                        this.s2.start();
                    }
                }
            } else if (!z15) {
                cgVar.setScaleX(0.1f);
                cgVar.setScaleY(0.1f);
                cgVar.setAlpha(0.0f);
                setSlowModeButtonVisible(false);
                getSendButtonInternal().setScaleX(0.1f);
                getSendButtonInternal().setScaleY(0.1f);
                getSendButtonInternal().setAlpha(0.0f);
                getSendButtonInternal().setVisibility(8);
                imageView2.setScaleX(0.1f);
                imageView2.setScaleY(0.1f);
                imageView2.setAlpha(0.0f);
                imageView2.setVisibility(8);
                ceVar.setScaleX(0.1f);
                ceVar.setScaleY(0.1f);
                ceVar.setAlpha(0.0f);
                beVar2.setVisibility(8);
                R();
                this.T0.setScaleX(1.0f);
                this.T0.setScaleY(1.0f);
                this.T0.setAlpha(1.0f);
                this.T0.setVisibility(0);
                if (qVar != null) {
                    if (getVisibility() == 0) {
                        this.a3.n2();
                    }
                    qVar.setVisibility(0);
                    I1(1);
                }
                this.M1 = false;
                uf ufVar6 = this.a3;
                boolean z23 = ufVar6 != null && ufVar6.u0();
                if (z23) {
                    W();
                }
                ge geVar3 = this.K1;
                if (geVar3 != null) {
                    if (z23) {
                        geVar3.setVisibility(0);
                        this.K1.setTag(1);
                    }
                    this.K1.setAlpha(1.0f);
                    this.K1.setScaleX(1.0f);
                    this.K1.setScaleY(1.0f);
                    this.K1.setTranslationX(0.0f);
                }
            } else {
                if (this.w2 == 4) {
                    return;
                }
                AnimatorSet animatorSet8 = this.s2;
                if (animatorSet8 != null) {
                    animatorSet8.cancel();
                    animatorSet3 = null;
                    this.s2 = null;
                } else {
                    animatorSet3 = null;
                }
                AnimatorSet animatorSet9 = this.t2;
                if (animatorSet9 != null) {
                    animatorSet9.cancel();
                    this.t2 = animatorSet3;
                }
                if (qVar != null && this.x2 == 0) {
                    qVar.setVisibility(0);
                    this.t2 = new AnimatorSet();
                    ArrayList arrayList5 = new ArrayList();
                    arrayList5.add(ObjectAnimator.ofFloat(qVar, rdVar, 1.0f));
                    arrayList5.add(ObjectAnimator.ofFloat(qVar, (Property<ci.q, Float>) property, 1.0f));
                    mh.h hVar5 = this.j5;
                    if (hVar5 != null) {
                        hVar5.e(0, false, true);
                    }
                    if (kVar != null) {
                        ViewPropertyAnimator viewPropertyAnimator5 = this.r1;
                        if (viewPropertyAnimator5 != null) {
                            viewPropertyAnimator5.cancel();
                            this.r1 = null;
                        }
                        this.w1 = 1.0f;
                        arrayList5.add(ObjectAnimator.ofFloat(kVar, (Property<lg.k, Float>) property3, 1.0f));
                        arrayList5.add(ObjectAnimator.ofFloat(kVar, (Property<lg.k, Float>) property, 1.0f));
                        arrayList5.add(ObjectAnimator.ofFloat(kVar, (Property<lg.k, Float>) property2, 1.0f));
                    }
                    uf ufVar7 = this.a3;
                    boolean z24 = ufVar7 != null && ufVar7.u0();
                    this.M1 = false;
                    if (z24) {
                        W();
                    }
                    ge geVar4 = this.K1;
                    if (geVar4 != null) {
                        geVar4.setScaleY(1.0f);
                        if (z24) {
                            this.K1.setVisibility(0);
                            this.K1.setTag(1);
                            this.K1.setPivotX(org.telegram.messenger.g0.L(44.0f));
                            arrayList5.add(ObjectAnimator.ofFloat(this.K1, (Property<ge, Float>) property3, 1.0f));
                            arrayList5.add(ObjectAnimator.ofFloat(this.K1, (Property<ge, Float>) property, 1.0f));
                            arrayList5.add(m(0.0f));
                        } else {
                            this.K1.setAlpha(1.0f);
                            this.K1.setScaleX(1.0f);
                            this.K1.setTranslationX(0.0f);
                        }
                    }
                    this.t2.playTogether(arrayList5);
                    this.t2.setDuration(100L);
                    this.t2.addListener(new fe(this, 4));
                    this.t2.start();
                    I1(1);
                    if (getVisibility() == 0) {
                        this.a3.n2();
                    }
                }
                R();
                this.T0.setVisibility(0);
                this.s2 = new AnimatorSet();
                this.w2 = 4;
                ArrayList arrayList6 = new ArrayList();
                arrayList6.add(ObjectAnimator.ofFloat(this.T0, (Property<ie, Float>) property, 1.0f));
                arrayList6.add(ObjectAnimator.ofFloat(this.T0, (Property<ie, Float>) property2, 1.0f));
                arrayList6.add(ObjectAnimator.ofFloat(this.T0, (Property<ie, Float>) property3, 1.0f));
                if (imageView2.getVisibility() == 0) {
                    arrayList6.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 0.0f));
                } else if (beVar2.getVisibility() == 0) {
                    arrayList6.add(ObjectAnimator.ofFloat(ceVar, (Property<ce, Float>) property, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(ceVar, (Property<ce, Float>) property2, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(ceVar, (Property<ce, Float>) property3, 0.0f));
                } else if (cgVar.getVisibility() == 0) {
                    arrayList6.add(ObjectAnimator.ofFloat(cgVar, (Property<cg, Float>) property, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(cgVar, (Property<cg, Float>) property2, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(cgVar, (Property<cg, Float>) property3, 0.0f));
                } else {
                    arrayList6.add(ObjectAnimator.ofFloat(getSendButtonInternal(), (Property<View, Float>) property, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(getSendButtonInternal(), (Property<View, Float>) property2, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(getSendButtonInternal(), (Property<View, Float>) property3, 0.0f));
                }
                this.s2.playTogether(arrayList6);
                this.s2.setDuration(250L);
                this.s2.addListener(new fe(this, 5));
                this.s2.start();
            }
        } else if (cgVar.getVisibility() != 0) {
            if (!z15) {
                cgVar.setScaleX(1.0f);
                cgVar.setScaleY(1.0f);
                cgVar.setAlpha(1.0f);
                setSlowModeButtonVisible(true);
                ceVar.setScaleX(0.1f);
                ceVar.setScaleY(0.1f);
                ceVar.setAlpha(0.0f);
                beVar2.setVisibility(8);
                getSendButtonInternal().setScaleX(0.1f);
                getSendButtonInternal().setScaleY(0.1f);
                getSendButtonInternal().setAlpha(0.0f);
                getSendButtonInternal().setVisibility(8);
                imageView2.setScaleX(0.1f);
                imageView2.setScaleY(0.1f);
                imageView2.setAlpha(0.0f);
                imageView2.setVisibility(8);
                ie ieVar14 = this.T0;
                if (ieVar14 == null || ieVar14.getVisibility() != 0) {
                    i12 = 8;
                } else {
                    this.T0.setScaleX(0.1f);
                    this.T0.setScaleY(0.1f);
                    this.T0.setAlpha(0.0f);
                    i12 = 8;
                    this.T0.setVisibility(8);
                }
                if (qVar != null) {
                    qVar.setVisibility(i12);
                    if (this.a3 != null && getVisibility() == 0) {
                        this.a3.q0();
                    }
                    z13 = false;
                    I1(0);
                    mh.h hVar6 = this.j5;
                    if (hVar6 != null) {
                        hVar6.e(0, false, false);
                    }
                    if (kVar != null) {
                        this.w1 = 0.0f;
                        kVar.setAlpha(0.0f);
                        kVar.setScaleX(0.5f);
                        kVar.setScaleY(0.5f);
                    }
                } else {
                    z13 = false;
                }
                this.M1 = z13;
                uf ufVar8 = this.a3;
                boolean z25 = ufVar8 != null && ufVar8.u0();
                if (z25) {
                    W();
                }
                ge geVar5 = this.K1;
                if (geVar5 != null) {
                    if (z25) {
                        geVar5.setVisibility(0);
                        this.K1.setTag(1);
                    }
                    this.K1.setTranslationX(0.0f);
                    this.K1.setAlpha(1.0f);
                    this.K1.setScaleX(1.0f);
                    this.K1.setScaleY(1.0f);
                }
            } else {
                if (this.w2 == 5) {
                    return;
                }
                AnimatorSet animatorSet10 = this.s2;
                if (animatorSet10 != null) {
                    animatorSet10.cancel();
                    r32 = 0;
                    this.s2 = null;
                } else {
                    r32 = 0;
                }
                AnimatorSet animatorSet11 = this.t2;
                if (animatorSet11 != null) {
                    animatorSet11.cancel();
                    this.t2 = r32;
                }
                ViewPropertyAnimator viewPropertyAnimator6 = this.r1;
                if (viewPropertyAnimator6 != null) {
                    viewPropertyAnimator6.cancel();
                    this.r1 = r32;
                }
                if (qVar != null) {
                    this.t2 = new AnimatorSet();
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(ObjectAnimator.ofFloat(qVar, rdVar, 0.0f));
                    arrayList7.add(ObjectAnimator.ofFloat(qVar, (Property<ci.q, Float>) property, 0.5f));
                    this.M1 = false;
                    uf ufVar9 = this.a3;
                    boolean z26 = ufVar9 != null && ufVar9.u0();
                    if (z26) {
                        W();
                    }
                    mh.h hVar7 = this.j5;
                    if (hVar7 != null) {
                        hVar7.e(0, false, true);
                    }
                    if (kVar != null) {
                        this.w1 = 0.0f;
                        arrayList7.add(ObjectAnimator.ofFloat(kVar, (Property<lg.k, Float>) property3, 0.0f));
                        arrayList7.add(ObjectAnimator.ofFloat(kVar, (Property<lg.k, Float>) property, 0.5f));
                        arrayList7.add(ObjectAnimator.ofFloat(kVar, (Property<lg.k, Float>) property2, 0.5f));
                    }
                    ge geVar6 = this.K1;
                    if (geVar6 != null) {
                        geVar6.setScaleY(1.0f);
                        if (z26) {
                            this.K1.setVisibility(0);
                            this.K1.setTag(1);
                            this.K1.setPivotX(org.telegram.messenger.g0.L(44.0f));
                            arrayList7.add(m(0.0f));
                            arrayList7.add(ObjectAnimator.ofFloat(this.K1, (Property<ge, Float>) property3, 1.0f));
                            arrayList7.add(ObjectAnimator.ofFloat(this.K1, (Property<ge, Float>) property, 1.0f));
                        } else {
                            this.K1.setTranslationX(0.0f);
                            this.K1.setAlpha(1.0f);
                            this.K1.setScaleX(1.0f);
                        }
                    }
                    this.t2.playTogether(arrayList7);
                    this.t2.setDuration(100L);
                    this.t2.addListener(new fe(this, 2));
                    this.t2.start();
                    I1(0);
                    if (this.a3 != null && getVisibility() == 0) {
                        this.a3.q0();
                    }
                }
                this.w2 = 5;
                this.s2 = new AnimatorSet();
                ArrayList arrayList8 = new ArrayList();
                if (beVar2.getVisibility() == 0) {
                    i13 = 1;
                    r43 = 0;
                    arrayList8.add(ObjectAnimator.ofFloat(ceVar, (Property<ce, Float>) property, 0.1f));
                    arrayList8.add(ObjectAnimator.ofFloat(ceVar, (Property<ce, Float>) property2, 0.1f));
                    arrayList8.add(ObjectAnimator.ofFloat(ceVar, (Property<ce, Float>) property3, 0.0f));
                } else {
                    r43 = 0;
                    i13 = 1;
                }
                ie ieVar15 = this.T0;
                if (ieVar15 != null && ieVar15.getVisibility() == 0) {
                    ie ieVar16 = this.T0;
                    float[] fArr28 = new float[i13];
                    fArr28[r43] = 0.1f;
                    arrayList8.add(ObjectAnimator.ofFloat(ieVar16, (Property<ie, Float>) property, fArr28));
                    ie ieVar17 = this.T0;
                    float[] fArr29 = new float[i13];
                    fArr29[r43] = 0.1f;
                    arrayList8.add(ObjectAnimator.ofFloat(ieVar17, (Property<ie, Float>) property2, fArr29));
                    ie ieVar18 = this.T0;
                    float[] fArr30 = new float[i13];
                    fArr30[r43] = 0.0f;
                    arrayList8.add(ObjectAnimator.ofFloat(ieVar18, (Property<ie, Float>) property3, fArr30));
                }
                if (getSendButtonInternal().getVisibility() == 0) {
                    arrayList8.add(n(r43));
                }
                if (imageView2.getVisibility() == 0) {
                    float[] fArr31 = new float[1];
                    fArr31[r43] = 0.1f;
                    arrayList8.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, fArr31));
                    float[] fArr32 = new float[1];
                    fArr32[r43] = 0.1f;
                    arrayList8.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, fArr32));
                    float[] fArr33 = new float[1];
                    fArr33[r43] = 0.0f;
                    arrayList8.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, fArr33));
                }
                float[] fArr34 = new float[1];
                fArr34[r43] = 1.0f;
                arrayList8.add(ObjectAnimator.ofFloat(cgVar, (Property<cg, Float>) property, fArr34));
                float[] fArr35 = new float[1];
                fArr35[r43] = 1.0f;
                arrayList8.add(ObjectAnimator.ofFloat(cgVar, (Property<cg, Float>) property2, fArr35));
                float[] fArr36 = new float[1];
                fArr36[r43] = 1.0f;
                arrayList8.add(ObjectAnimator.ofFloat(cgVar, (Property<cg, Float>) property3, fArr36));
                setSlowModeButtonVisible(true);
                this.s2.playTogether(arrayList8);
                this.s2.setDuration(220L);
                this.s2.setInterpolator(xq.h);
                this.s2.addListener(new fe(this, 3));
                this.s2.start();
            }
        }
        eeVar = eeVar2;
        z12 = false;
        if (this.B4) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:163|(1:243)(1:167)|168|(8:170|(1:198)(1:174)|(1:197)(1:180)|181|(4:183|(1:185)(1:191)|186|(1:190))|(1:193)|194|(1:196))|199|(3:201|(1:203)(1:205)|204)|206|(3:(1:209)|(2:213|(1:223))|224)|225|(4:227|(1:241)(1:231)|232|(5:234|235|236|237|238))|242|235|236|237|238) */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x034a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean E0(View view) {
        org.telegram.ui.wm wmVar;
        int measuredHeight;
        TLRPC.User j10;
        ve veVar;
        org.telegram.messenger.dj djVar;
        org.telegram.messenger.bj bjVar;
        ArrayList arrayList;
        ee eeVar;
        p40 p40Var;
        boolean z10;
        org.telegram.messenger.dj djVar2;
        int i3;
        boolean z11;
        boolean z12;
        boolean z13;
        ve veVar2;
        int i10 = 0;
        if (c() || (((wmVar = this.Q2) != null && wmVar.g4 == 5) || this.n5.f)) {
            return false;
        }
        boolean z14 = this.B4;
        int i11 = 3;
        ee eeVar2 = this.K0;
        org.telegram.ui.ActionBar.e6 e6Var = this.X3;
        int i12 = 2;
        boolean z15 = true;
        if (z14 || !(((veVar = this.F0) != null && !TextUtils.isEmpty(veVar.getText())) || wmVar == null || (djVar = wmVar.w5) == null || (bjVar = djVar.b) == null || (arrayList = bjVar.e) == null || arrayList.isEmpty())) {
            boolean z16 = wmVar != null && org.telegram.messenger.l10.B(wmVar.j());
            if (this.P0 == null) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(this.P2, e6Var);
                this.P0 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
                this.P0.setOnTouchListener(new qe(this));
                this.P0.setDispatchKeyEventListener(new hd(this));
                this.P0.setShownFromBottom(false);
                boolean z17 = wmVar != null && wmVar.R6();
                boolean z18 = !z16 && (this.H0 <= 0 || c());
                if (z17) {
                    boolean z19 = !z18;
                    org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, getContext(), this.X3, true, z19);
                    this.H4 = y0Var;
                    if (z16) {
                        y0Var.j(org.telegram.messenger.bd.M0(2131745524, null), R.drawable.msg_calendar2, null);
                    } else {
                        y0Var.j(org.telegram.messenger.bd.M0(2131745869, null), R.drawable.msg_calendar2, null);
                    }
                    this.H4.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                    this.H4.setOnClickListener(new ad(this, 11));
                    this.P0.a(this.H4, b8.mf.o(-1, 44));
                    int i13 = org.telegram.messenger.az.a;
                    SharedPreferences.Editor edit = org.telegram.messenger.hp.e1().edit();
                    edit.putInt("scheduledHintShows", 3);
                    edit.apply();
                    if (!z16 && this.R2 > 0) {
                        org.telegram.ui.ActionBar.y0 y0Var2 = new org.telegram.ui.ActionBar.y0(0, getContext(), this.X3, true, z19);
                        this.c = y0Var2;
                        y0Var2.j(org.telegram.messenger.bd.M0(2131745596, null), R.drawable.msg_online, null);
                        this.c.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                        this.c.setOnClickListener(new ad(this, 12));
                        this.P0.a(this.c, b8.mf.o(-1, 44));
                    }
                }
                if (z18) {
                    org.telegram.ui.ActionBar.y0 y0Var3 = new org.telegram.ui.ActionBar.y0(0, getContext(), this.X3, !z17, true);
                    y0Var3.j(org.telegram.messenger.bd.M0(2131745593, null), R.drawable.input_notify_off, null);
                    y0Var3.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                    y0Var3.setOnClickListener(new ad(this, 13));
                    this.P0.a(y0Var3, b8.mf.o(-1, 44));
                }
                re reVar = new re(this, this.P0);
                this.O0 = reVar;
                reVar.b = false;
                reVar.setAnimationStyle(R.style.PopupContextAnimation2);
                this.O0.setOutsideTouchable(true);
                this.O0.setClippingEnabled(true);
                this.O0.setInputMethodMode(2);
                this.O0.setSoftInputMode(0);
                this.O0.getContentView().setFocusableInTouchMode(true);
                int i14 = org.telegram.messenger.az.a;
                SharedPreferences.Editor edit2 = org.telegram.messenger.hp.e1().edit();
                edit2.putInt("scheduledOrNoSoundHintShows", 3);
                edit2.apply();
                uf ufVar = this.a3;
                if (ufVar != null) {
                    ufVar.g2();
                }
            }
            org.telegram.ui.ActionBar.y0 y0Var4 = this.H4;
            if (y0Var4 != null) {
                y0Var4.setVisibility(this.P ? 8 : 0);
            }
            if (this.c != null) {
                j10 = wmVar != null ? wmVar.j() : null;
                if (j10 != null && !j10.bot) {
                    TLRPC.UserStatus userStatus = j10.status;
                    if (!(userStatus instanceof TLRPC.TL_userStatusEmpty) && !(userStatus instanceof TLRPC.TL_userStatusOnline) && !(userStatus instanceof TLRPC.TL_userStatusRecently) && !(userStatus instanceof TLRPC.TL_userStatusLastMonth) && !(userStatus instanceof TLRPC.TL_userStatusLastWeek)) {
                        this.c.setVisibility(0);
                    }
                }
                this.c.setVisibility(8);
            }
            this.P0.setupRadialSelectors(f0(org.telegram.ui.ActionBar.k6.I5));
            this.P0.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
            this.O0.setFocusable(true);
            int[] iArr = this.O2;
            view.getLocationInWindow(iArr);
            if (this.A2) {
                int measuredHeight2 = getMeasuredHeight();
                View view2 = this.H1;
                if (measuredHeight2 > org.telegram.messenger.g0.L((view2 == null || view2.getVisibility() != 0) ? 58.0f : 102.0f)) {
                    measuredHeight = view.getMeasuredHeight() + iArr[1];
                    this.O0.showAtLocation(view, 51, org.telegram.messenger.g0.L(8.0f) + ((view.getMeasuredWidth() + iArr[0]) - this.P0.getMeasuredWidth()), measuredHeight);
                    this.O0.b();
                    eeVar2.invalidate();
                    view.performHapticFeedback(3, 2);
                    return true;
                }
            }
            measuredHeight = (iArr[1] - this.P0.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f);
            this.O0.showAtLocation(view, 51, org.telegram.messenger.g0.L(8.0f) + ((view.getMeasuredWidth() + iArr[0]) - this.P0.getMeasuredWidth()), measuredHeight);
            this.O0.b();
            eeVar2.invalidate();
            view.performHapticFeedback(3, 2);
            return true;
        }
        se seVar = this.M0;
        if (seVar != null) {
            seVar.g(false);
        }
        org.telegram.messenger.g0.r(this.G4);
        se seVar2 = new se(this, getContext(), e6Var, i10);
        this.M0 = seVar2;
        seVar2.setOnDismissListener(new p0(this, i11));
        boolean z20 = (this.e3 == null && ((veVar2 = this.F0) == null || TextUtils.isEmpty(veVar2.getText()))) ? false : true;
        ArrayList arrayList2 = new ArrayList();
        try {
            if (this.F1 != null) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.id = 0;
                tL_message.out = true;
                tL_message.peer_id = org.telegram.messenger.hp.s1(this.R).z1(this.R2);
                tL_message.from_id = org.telegram.messenger.hp.s1(this.R).z1(org.telegram.messenger.h10.i(this.R).e());
                tL_message.rich_message = this.F1;
                org.telegram.messenger.zi ziVar = new org.telegram.messenger.zi(this.R, tL_message, false, true);
                org.telegram.messenger.zi ziVar2 = this.U2;
                if (ziVar2 != null && !ziVar2.p) {
                    ziVar.C = ziVar2;
                }
                ziVar.U2 = Boolean.TRUE;
                ziVar.n0(null);
                ziVar.u1 = true;
                ziVar.z0 = true;
                arrayList2.add(ziVar);
                eeVar = eeVar2;
            } else if (this.c3 != null) {
                TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                tL_message2.id = 0;
                tL_message2.out = true;
                eeVar = eeVar2;
                tL_message2.peer_id = org.telegram.messenger.hp.s1(this.R).z1(this.R2);
                tL_message2.from_id = org.telegram.messenger.hp.s1(this.R).z1(org.telegram.messenger.h10.i(this.R).e());
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message2.media = tL_messageMediaDocument;
                tL_messageMediaDocument.voice = true;
                tL_messageMediaDocument.document = this.c3;
                tL_message2.send_state = 1;
                tL_message2.attachPath = this.d3;
                org.telegram.messenger.zi ziVar3 = new org.telegram.messenger.zi(this.R, tL_message2, false, true);
                org.telegram.messenger.zi ziVar4 = this.U2;
                if (ziVar4 != null && !ziVar4.p) {
                    ziVar3.C = ziVar4;
                }
                ziVar3.U2 = Boolean.TRUE;
                ziVar3.n0(null);
                ziVar3.u1 = true;
                ziVar3.z0 = true;
                arrayList2.add(ziVar3);
            } else {
                eeVar = eeVar2;
                if (z20) {
                    TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
                    tL_message3.id = 0;
                    tL_message3.out = true;
                    tL_message3.peer_id = org.telegram.messenger.hp.s1(this.R).z1(this.R2);
                    tL_message3.from_id = org.telegram.messenger.hp.s1(this.R).z1(org.telegram.messenger.h10.i(this.R).e());
                    ve veVar3 = this.F0;
                    CharSequence[] charSequenceArr = {new SpannableStringBuilder(veVar3 == null ? "" : veVar3.getTextToUse())};
                    org.telegram.messenger.zi.d(charSequenceArr[0], true);
                    tL_message3.entities.addAll(org.telegram.messenger.li.b0(this.R).W(charSequenceArr, true, true));
                    tL_message3.message = charSequenceArr[0].toString();
                    org.telegram.messenger.zi ziVar5 = this.U2;
                    if (ziVar5 != null && !ziVar5.p) {
                        TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                        org.telegram.messenger.zi ziVar6 = this.V2;
                        if (ziVar6 != null) {
                            tL_messageReplyHeader.flags |= 2;
                            tL_messageReplyHeader.reply_to_top_id = ziVar6.f1();
                        }
                        tL_messageReplyHeader.flags |= 16;
                        tL_messageReplyHeader.reply_to_msg_id = this.U2.f1();
                        tL_message3.reply_to = tL_messageReplyHeader;
                    }
                    if (this.Y2 != null) {
                        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                        tL_messageMediaWebPage.webpage = this.Y2;
                        if (wmVar != null && (djVar2 = wmVar.w5) != null && djVar2.o) {
                            boolean z21 = djVar2.q;
                            tL_messageMediaWebPage.force_small_media = z21;
                            tL_messageMediaWebPage.force_large_media = !z21;
                            tL_message3.invert_media = djVar2.r;
                        }
                        tL_message3.media = tL_messageMediaWebPage;
                    }
                    org.telegram.messenger.zi ziVar7 = new org.telegram.messenger.zi(this.R, tL_message3, false, false);
                    org.telegram.messenger.zi ziVar8 = this.U2;
                    if (ziVar8 != null && !ziVar8.p) {
                        ziVar7.C = ziVar8;
                    }
                    ziVar7.z0 = true;
                    ziVar7.U2 = Boolean.TRUE;
                    ziVar7.D = 0;
                    ziVar7.n0(null);
                    ziVar7.u1 = true;
                    arrayList2.add(ziVar7);
                } else if (wmVar != null && (p40Var = wmVar.q3) != null && p40Var.getTextureView() != null) {
                    se seVar3 = this.M0;
                    TextureView textureView = wmVar.q3.getTextureView();
                    seVar3.getClass();
                    if (textureView != null) {
                        seVar3.l0 = new RectF();
                        int[] iArr2 = new int[2];
                        textureView.getLocationOnScreen(iArr2);
                        seVar3.l0.set(iArr2[0], iArr2[1], textureView.getWidth() + r14, textureView.getHeight() + iArr2[1]);
                    }
                    z10 = true;
                    this.M0.p(arrayList2);
                    i3 = 4;
                    if (z20 && this.c3 == null) {
                        se seVar4 = this.M0;
                        ve veVar4 = this.F0;
                        e eVar = new e(this, i3);
                        jd jdVar = new jd(this, i12);
                        seVar4.S = veVar4;
                        seVar4.U = eVar;
                        seVar4.V = jdVar;
                    }
                    this.M0.q(eeVar, true, new ei.e2(i3, this, z20));
                    if ((!z20 || z10) && this.R2 >= 0) {
                        this.M0.c(wmVar);
                        this.M0.n(this.T4);
                    }
                    f60 F = f60.F(this, e6Var, eeVar);
                    z11 = wmVar == null && org.telegram.messenger.l10.B(wmVar.j());
                    z12 = wmVar == null && wmVar.R6();
                    if (!z11 || (this.H0 > 0 && !c())) {
                        z15 = false;
                    }
                    if (z12) {
                        F.c(R.drawable.msg_calendar2, org.telegram.messenger.bd.M0(z11 ? 2131745524 : 2131745869, null), new yc(this, 19), false);
                        if (!z11 && this.R2 > 0) {
                            F.c(R.drawable.msg_online, org.telegram.messenger.bd.M0(2131745596, null), new yc(this, 20), false);
                            this.c = F.y();
                        }
                    }
                    if (wmVar == null && this.a3 != null && org.telegram.messenger.t3.p0(wmVar.e)) {
                        z13 = false;
                        F.c(R.drawable.input_suggest_paid_24, org.telegram.messenger.bd.M0(2131747077, null), new yc(this, 18), false);
                    } else {
                        z13 = false;
                    }
                    if (z15) {
                        F.c(R.drawable.input_notify_off, org.telegram.messenger.bd.M0(2131745593, null), new gd(this, z20, i12), z13);
                    }
                    F.Y();
                    if (this.c != null) {
                        j10 = wmVar != null ? wmVar.j() : null;
                        if (j10 != null && !j10.bot) {
                            TLRPC.UserStatus userStatus2 = j10.status;
                            if (!(userStatus2 instanceof TLRPC.TL_userStatusEmpty) && !(userStatus2 instanceof TLRPC.TL_userStatusOnline) && !(userStatus2 instanceof TLRPC.TL_userStatusRecently) && !(userStatus2 instanceof TLRPC.TL_userStatusLastMonth) && !(userStatus2 instanceof TLRPC.TL_userStatusLastWeek)) {
                                this.c.setVisibility(0);
                            }
                        }
                        this.c.setVisibility(8);
                    }
                    this.M0.o(F);
                    this.M0.show();
                    view.performHapticFeedback(3, 2);
                    return false;
                }
            }
            view.performHapticFeedback(3, 2);
            return false;
        } catch (Exception unused) {
            return false;
        }
        z10 = false;
        this.M0.p(arrayList2);
        i3 = 4;
        if (z20) {
            se seVar42 = this.M0;
            ve veVar42 = this.F0;
            e eVar2 = new e(this, i3);
            jd jdVar2 = new jd(this, i12);
            seVar42.S = veVar42;
            seVar42.U = eVar2;
            seVar42.V = jdVar2;
        }
        this.M0.q(eeVar, true, new ei.e2(i3, this, z20));
        if (!z20) {
        }
        this.M0.c(wmVar);
        this.M0.n(this.T4);
        f60 F2 = f60.F(this, e6Var, eeVar);
        if (wmVar == null) {
        }
        if (wmVar == null) {
        }
        if (!z11) {
        }
        z15 = false;
        if (z12) {
        }
        if (wmVar == null) {
        }
        z13 = false;
        if (z15) {
        }
        F2.Y();
        if (this.c != null) {
        }
        this.M0.o(F2);
        this.M0.show();
    }

    public final void E1(boolean z10) {
        if (this.r5 != 1 && this.R2 > 0) {
            N();
        }
        ii.a0 a0Var = this.m0;
        if (a0Var != null) {
            a0Var.setWebView(g0());
        }
        C1(z10);
    }

    public final void F0() {
        int height = this.n1.getHeight();
        if (!this.A2) {
            height -= this.B2;
        }
        uf ufVar = this.a3;
        if (ufVar != null) {
            ufVar.T1(height);
        }
        if (this.H1 != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.L(72.0f);
            qe.a aVar = this.l5;
            if (height < currentActionBarHeight) {
                if (this.i3) {
                    this.i3 = false;
                    if (this.h3) {
                        aVar.a(false, false);
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.i3) {
                return;
            }
            this.i3 = true;
            if (this.h3) {
                aVar.a(true, false);
            }
        }
    }

    public final void F1() {
        ve veVar = this.F0;
        boolean z10 = false;
        o1((veVar == null || veVar.getLineCount() <= 2 || this.F0.getText() == null || TextUtils.isEmpty(this.F0.getText().toString().trim())) ? false : true);
        ve veVar2 = this.F0;
        if (veVar2 != null && veVar2.getLineCount() > 2 && this.F0.getText() != null && !TextUtils.isEmpty(this.F0.getText().toString().trim())) {
            z10 = true;
        }
        u1(z10);
    }

    public final void G() {
        if (this.V0 == null) {
            return;
        }
        Point point = org.telegram.messenger.g0.q;
        int i3 = point.x > point.y ? this.z2 : this.y2;
        int L = ((((this.p1 - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.n) - org.telegram.messenger.g0.L(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getHeight();
        int i10 = 2;
        if (this.S1 == 2) {
            L = Math.min(L, org.telegram.messenger.g0.L(175.0f) + i3);
        }
        int i11 = this.V0.getLayoutParams().height;
        if (i11 == L) {
            return;
        }
        AnimatorSet animatorSet = this.C3;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.C3 = null;
        }
        this.E3 = L;
        org.telegram.ui.Cells.g1 g1Var = this.u3;
        if (i11 > L) {
            yc ycVar = new yc(this, 7);
            this.V0.setLayerType(2, null);
            if (this.w) {
                this.x = ycVar;
            } else {
                AnimatorSet animatorSet2 = new AnimatorSet();
                if (this.i5 != null) {
                    animatorSet2.playTogether(ValueAnimator.ofInt(-(this.E3 - i3)), ValueAnimator.ofInt(-(this.E3 - i3)));
                } else {
                    animatorSet2.playTogether(ObjectAnimator.ofInt(this, g1Var, -(this.E3 - i3)), ObjectAnimator.ofInt(this.V0, g1Var, -(this.E3 - i3)));
                    ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new xc(this, i10));
                }
                animatorSet2.setDuration(300L);
                animatorSet2.setInterpolator(xq.f);
                animatorSet2.addListener(new bh.j(23, this, ycVar));
                this.C3 = animatorSet2;
                animatorSet2.start();
            }
        } else {
            if (this.i5 == null) {
                this.V0.getLayoutParams().height = this.E3;
            }
            this.n1.requestLayout();
            ve veVar = this.F0;
            if (veVar != null) {
                int selectionStart = veVar.getSelectionStart();
                int selectionEnd = this.F0.getSelectionEnd();
                ve veVar2 = this.F0;
                veVar2.setText(veVar2.getText());
                this.F0.setSelection(selectionStart, selectionEnd);
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            if (this.i5 != null) {
                animatorSet3.playTogether(ValueAnimator.ofInt(-(this.E3 - i3)), ValueAnimator.ofInt(-(this.E3 - i3)));
            } else {
                animatorSet3.playTogether(ObjectAnimator.ofInt(this, g1Var, -(this.E3 - i3)), ObjectAnimator.ofInt(this.V0, g1Var, -(this.E3 - i3)));
                ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new xc(this, 3));
            }
            animatorSet3.setDuration(300L);
            animatorSet3.setInterpolator(xq.f);
            animatorSet3.addListener(new fe(this, 11));
            this.C3 = animatorSet3;
            this.V0.setLayerType(2, null);
            animatorSet3.start();
        }
        sh.e eVar = this.i5;
        if (eVar != null) {
            ((sh.h) eVar).h(L);
        }
    }

    public void G0() {
        if ((g0() && s()) || org.telegram.ui.ActionBar.d2.hasSheets(this.Q2)) {
            return;
        }
        uf ufVar = this.a3;
        if (ufVar != null) {
            ufVar.e1();
        }
        ve veVar = this.F0;
        if (veVar == null || org.telegram.messenger.g0.K3(veVar)) {
            return;
        }
        this.F0.clearFocus();
        this.F0.requestFocus();
    }

    public final void G1() {
        float f10 = this.r * this.h;
        ud udVar = this.R0;
        udVar.setScaleX(f10);
        udVar.setScaleY(this.r * this.h);
        udVar.setAlpha(this.s * this.n);
    }

    public final void H() {
        this.p5 = v(true);
        float v = v(false);
        if (this.o5 != v) {
            this.o5 = v;
            z0(v);
        }
    }

    public final void H0() {
        if (g0() && s()) {
            return;
        }
        org.telegram.ui.wm wmVar = this.Q2;
        if (org.telegram.ui.ActionBar.d2.hasSheets(wmVar)) {
            return;
        }
        s1((org.telegram.messenger.g0.D || org.telegram.messenger.g0.E || (wmVar != null && wmVar.isInBubbleMode()) || this.k2) ? 0 : 2, 0, true, true);
        uf ufVar = this.a3;
        if (ufVar != null) {
            ufVar.e1();
        }
        ve veVar = this.F0;
        if (veVar != null) {
            veVar.requestFocus();
        }
        org.telegram.messenger.g0.K3(this.F0);
        if (this.k2) {
            this.m2 = true;
            return;
        }
        if (org.telegram.messenger.g0.D || this.A2 || org.telegram.messenger.g0.E) {
            return;
        }
        if (wmVar == null || !wmVar.isInBubbleMode()) {
            this.l3 = true;
            kf kfVar = this.V0;
            if (kfVar != null) {
                kfVar.onTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0));
            }
            he heVar = this.s3;
            org.telegram.messenger.g0.r(heVar);
            org.telegram.messenger.g0.i3(heVar, 100L);
        }
    }

    public final void H1(boolean z10) {
        boolean z11;
        String str;
        TLRPC.TL_forumTopic tL_forumTopic;
        String str2;
        org.telegram.messenger.zi ziVar;
        TLRPC.ReplyMarkup replyMarkup;
        TLRPC.ReplyMarkup replyMarkup2;
        ve veVar = this.F0;
        if (veVar == null) {
            return;
        }
        CharSequence charSequence = this.e;
        boolean z12 = false;
        if (charSequence != null) {
            veVar.r(charSequence, z10);
            ve veVar2 = this.F0;
            String str3 = this.f;
            rs rsVar = veVar2.v0;
            if (rsVar != null) {
                if (!org.telegram.messenger.bd.a0 && z10) {
                    z12 = true;
                }
                rsVar.t(str3, z12, true);
                return;
            }
            return;
        }
        if (!this.A0 && !p0()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k2.p1.k(2131747229, "PlainTextRestrictedHint", new StringBuilder(" d ")));
            spannableStringBuilder.setSpan(new wp(R.drawable.msg_mini_lock3, 0), 1, 2, 0);
            this.F0.r(spannableStringBuilder, z10);
            this.F0.setText((CharSequence) null);
            this.F0.setEnabled(false);
            this.F0.setInputType(1);
            return;
        }
        this.F0.setEnabled(true);
        int inputType = this.F0.getInputType();
        int i3 = this.a;
        if (inputType != i3) {
            this.F0.setInputType(i3);
        }
        S1();
        org.telegram.ui.wm wmVar = this.Q2;
        boolean z13 = wmVar != null && wmVar.g4 == 8 && wmVar.i4;
        long N1 = wmVar != null ? wmVar.getMessagesController().N1(wmVar.a()) : 0L;
        if (N1 > 0) {
            N1 *= getMessagesCount();
        }
        int i10 = wmVar != null ? wmVar.g4 : -1;
        if (i10 == 9) {
            this.F0.setHintText(org.telegram.messenger.bd.M0(2131742905, null));
            return;
        }
        if (i10 == 5) {
            if ("hello".equalsIgnoreCase(wmVar.f4)) {
                this.F0.setHintText(org.telegram.messenger.bd.M0(2131752767, null));
                return;
            } else if ("away".equalsIgnoreCase(wmVar.f4)) {
                this.F0.setHintText(org.telegram.messenger.bd.M0(2131752836, null));
                return;
            } else {
                this.F0.setHintText(org.telegram.messenger.bd.M0(2131752672, null));
                return;
            }
        }
        wp[] wpVarArr = this.P4;
        if (z13) {
            this.F0.setHintText(N1 > 0 ? ci.wb.T0(org.telegram.messenger.bd.a0(null, null, 2131744413, org.telegram.messenger.bd.E((int) N1, ','), wpVarArr)) : org.telegram.messenger.bd.a0(null, null, 2131744414, new Object[0]));
            wp wpVar = wpVarArr[0];
            if (wpVar != null) {
                wpVar.H = 0.9f;
                return;
            }
            return;
        }
        if (this.c2 != null) {
            this.F0.setHintText(org.telegram.messenger.bd.M0(2131752706, null));
            return;
        }
        org.telegram.messenger.zi ziVar2 = this.U2;
        if (ziVar2 != null && (replyMarkup2 = ziVar2.k.reply_markup) != null && !TextUtils.isEmpty(replyMarkup2.placeholder)) {
            this.F0.r(this.U2.k.reply_markup.placeholder, z10);
            return;
        }
        if (this.a2 != null) {
            this.F0.setHintText(this.b2 ? org.telegram.messenger.bd.M0(2131752561, null) : org.telegram.messenger.bd.M0(2131743938, null));
            return;
        }
        if (N1 > 0) {
            this.F0.setHintText(ci.wb.Y0(false, org.telegram.messenger.bd.a0(null, null, 2131743936, org.telegram.messenger.bd.E((int) N1, ',')), wpVarArr));
            wp wpVar2 = wpVarArr[0];
            if (wpVar2 != null) {
                wpVar2.H = 0.9f;
                return;
            }
            return;
        }
        if (this.Y0 && (ziVar = this.n2) != null && (replyMarkup = ziVar.k.reply_markup) != null && !TextUtils.isEmpty(replyMarkup.placeholder)) {
            this.F0.r(this.n2.k.reply_markup.placeholder, z10);
            return;
        }
        if (wmVar != null && wmVar.R9()) {
            org.telegram.messenger.zi ziVar3 = this.V2;
            if (ziVar3 != null && (tL_forumTopic = ziVar3.h1) != null && (str2 = tL_forumTopic.title) != null) {
                this.F0.r(org.telegram.messenger.bd.a0(null, null, 2131743935, str2), z10);
                return;
            }
            TLRPC.TL_forumTopic f10 = org.telegram.messenger.hp.s1(this.R).q7.f(wmVar.e.id, 1L);
            if (f10 == null || (str = f10.title) == null) {
                this.F0.r(org.telegram.messenger.bd.M0(2131743938, null), z10);
                return;
            } else {
                this.F0.r(org.telegram.messenger.bd.a0(null, null, 2131743935, str), z10);
                return;
            }
        }
        if (org.telegram.messenger.m5.z(this.R2)) {
            TLRPC.Chat M0 = org.telegram.messenger.hp.s1(this.S.a).M0(Long.valueOf(-this.R2));
            TLRPC.ChatFull N0 = org.telegram.messenger.hp.s1(this.S.a).N0(-this.R2);
            z11 = org.telegram.messenger.t3.V(M0);
            z12 = !z11 && org.telegram.messenger.t3.M(M0, N0, false) == (-this.R2);
        } else {
            z11 = false;
        }
        if (z12) {
            this.F0.setHintText(org.telegram.messenger.bd.M0(2131745648, "SendAnonymously"));
            return;
        }
        TLRPC.User a22 = org.telegram.messenger.hp.s1(this.S.a).a2(Long.valueOf(this.R2));
        if (a22 != null && a22.bot_forum_view && !a22.bot_forum_can_manage_topics && wmVar != null && !wmVar.w4) {
            this.F0.setHintText(org.telegram.messenger.bd.M0(2131745643, null));
            return;
        }
        if (wmVar != null && wmVar.da() && !wmVar.w4) {
            if (wmVar.m4 == null || !wmVar.v4) {
                this.F0.setHintText(org.telegram.messenger.bd.M0(2131746271, "Reply"));
                return;
            } else {
                this.F0.setHintText(org.telegram.messenger.bd.M0(2131752005, null));
                return;
            }
        }
        if (!z11) {
            this.F0.setHintText(org.telegram.messenger.bd.M0(2131743938, null));
        } else if (this.h2) {
            this.F0.r(org.telegram.messenger.bd.M0(2131752291, "ChannelSilentBroadcast"), z10);
        } else {
            this.F0.r(org.telegram.messenger.bd.M0(2131752447, "ChannelBroadcast"), z10);
        }
    }

    public final void I() {
        float f10 = this.l5.e;
        if (this.H1 != null) {
            float measuredHeight = getMeasuredHeight() - this.k5.f;
            this.H1.setTranslationY(measuredHeight - (r4.getMeasuredHeight() * f10));
            this.H1.setVisibility(f10 > 0.0f ? 0 : 8);
        }
        boolean z10 = f10 > 0.0f;
        if (this.N4 == z10) {
            return;
        }
        sd sdVar = this.A1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) sdVar.getLayoutParams();
        int i3 = z10 ? this.H1.getLayoutParams().height : 0;
        layoutParams.topMargin = i3;
        layoutParams.topMargin = org.telegram.messenger.g0.L(9.0f) + i3;
        sdVar.setLayoutParams(layoutParams);
        this.N4 = z10;
        setMinimumHeight(org.telegram.messenger.g0.L(44.0f) + (z10 ? this.H1.getLayoutParams().height : 0));
        if (this.A3) {
            if (this.S1 == 0) {
                m1(false, true, false, true);
            } else {
                G();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I0() {
        org.telegram.ui.wm wmVar;
        Editable editable;
        mi.c2 c2Var;
        CharSequence[] charSequenceArr;
        ArrayList W;
        if (this.F0 == null || (wmVar = this.Q2) == null) {
            return;
        }
        org.telegram.messenger.hp.s1(this.R);
        boolean z10 = org.telegram.messenger.r2.a;
        TL_iv.RichMessage richMessage = this.F1;
        if (richMessage != null) {
            c2Var = new mi.c2(richMessage);
        } else {
            Editable text = this.F0.getText();
            if (!TextUtils.isEmpty(text) && TextUtils.indexOf((CharSequence) text, '`') >= 0) {
                try {
                    charSequenceArr = new CharSequence[]{new SpannableStringBuilder(text)};
                    W = org.telegram.messenger.li.b0(this.R).W(charSequenceArr, true, true);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                if (W != null && !W.isEmpty()) {
                    editable = new SpannableStringBuilder(charSequenceArr[0]);
                    org.telegram.messenger.zi.b(editable, W, false, false, false, false, 0);
                    mi.c2 c2Var2 = new mi.c2(editable);
                    if (editable == text) {
                        int selectionStart = this.F0.getSelectionStart();
                        int selectionEnd = this.F0.getSelectionEnd();
                        if (selectionStart < 0) {
                            selectionStart = this.F0.length();
                        }
                        if (selectionEnd < 0) {
                            selectionEnd = selectionStart;
                        }
                        c2Var2.c = selectionStart;
                        c2Var2.d = selectionEnd;
                    }
                    c2Var2.M = new yc(this, 16);
                    c2Var = c2Var2;
                }
            }
            editable = text;
            mi.c2 c2Var22 = new mi.c2(editable);
            if (editable == text) {
            }
            c2Var22.M = new yc(this, 16);
            c2Var = c2Var22;
        }
        c2Var.setResourceProvider(this.X3);
        c2Var.K = wmVar;
        c2Var.s = wmVar.U;
        c2Var.w = wmVar.a0;
        c2Var.L = new yc(this, 17);
        wmVar.presentFragment(c2Var);
    }

    public final void I1(int i3) {
        ImageView imageView;
        ge geVar;
        ge geVar2;
        lg.k kVar;
        this.Q4 = i3;
        if (this.F0 != null) {
            org.telegram.messenger.zi ziVar = this.a2;
            if (ziVar == null || ziVar.q5()) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.F0.getLayoutParams();
                int i10 = layoutParams.rightMargin;
                boolean z10 = this.B4;
                ee eeVar = this.K0;
                if (z10 && this.q5) {
                    layoutParams.rightMargin = Math.max(0, eeVar.l() - org.telegram.messenger.g0.L(44.0f)) + org.telegram.messenger.g0.L(this.w4 ? 50.0f : 2.0f);
                } else if (i3 == 1 || i3 == 2) {
                    ie ieVar = this.y1;
                    if (ieVar == null || ieVar.getVisibility() != 0 || (geVar2 = this.K1) == null || geVar2.getVisibility() != 0 || (kVar = this.s1) == null || kVar.getVisibility() != 0) {
                        ie ieVar2 = this.y1;
                        if ((ieVar2 == null || ieVar2.getVisibility() != 0) && (((imageView = this.J1) == null || imageView.getVisibility() != 0) && ((geVar = this.K1) == null || geVar.getTag() == null))) {
                            layoutParams.rightMargin = org.telegram.messenger.g0.L(50.0f);
                        } else {
                            layoutParams.rightMargin = org.telegram.messenger.g0.L(98.0f);
                        }
                    } else {
                        layoutParams.rightMargin = org.telegram.messenger.g0.L(146.0f);
                    }
                } else {
                    ge geVar3 = this.K1;
                    if (geVar3 == null || geVar3.getTag() == null) {
                        layoutParams.rightMargin = org.telegram.messenger.g0.L(2.0f);
                    } else {
                        layoutParams.rightMargin = org.telegram.messenger.g0.L(50.0f);
                    }
                }
                layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, eeVar.l() - org.telegram.messenger.g0.L(44.0f)));
                ee eeVar2 = this.G1;
                if (eeVar2 != null && eeVar2.getVisibility() == 0) {
                    layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, this.G1.l() - org.telegram.messenger.g0.L(44.0f)));
                }
                if (i10 != layoutParams.rightMargin) {
                    this.F0.setLayoutParams(layoutParams);
                }
                sd sdVar = this.f1;
                if (sdVar != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) sdVar.getLayoutParams();
                    layoutParams2.rightMargin = this.a2 == null ? k2.p1.d(44.0f, eeVar.l(), 0) : 0;
                    this.f1.setLayoutParams(layoutParams2);
                }
            }
        }
    }

    public final void J() {
        org.telegram.ui.wm wmVar = this.Q2;
        if (wmVar != null) {
            org.telegram.messenger.li.b0(this.R).Q1(wmVar.a(), wmVar.P7(wmVar.E5), "", null, null, null, null, 0L, false, true, null);
        }
        setRichDraftPreview(null);
    }

    public final void J0(CharSequence charSequence, CharSequence charSequence2, String str) {
        org.telegram.ui.wm wmVar;
        if (this.F0 == null || (wmVar = this.Q2) == null) {
            return;
        }
        org.telegram.messenger.hp.s1(this.R);
        boolean z10 = org.telegram.messenger.r2.a;
        mi.c2 c2Var = new mi.c2(str);
        c2Var.h = charSequence;
        c2Var.n = charSequence2;
        c2Var.setResourceProvider(this.X3);
        c2Var.K = wmVar;
        c2Var.s = wmVar.U;
        c2Var.w = wmVar.a0;
        c2Var.M = new pd(this, 2);
        c2Var.L = new pd(this, 3);
        wmVar.presentFragment(c2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009d, code lost:
    
        if (org.telegram.messenger.hp.s1(r16.R).e7.getBoolean("show_gift_for_" + r7.a(), true) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d1, code lost:
    
        if (org.telegram.messenger.hp.s1(r16.R).e7.getBoolean(java.util.Calendar.getInstance().get(1) + "show_gift_for_" + r7.a(), true) == false) goto L37;
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
    public final void J1(boolean z10) {
        boolean z11;
        gi.l3 l3Var;
        TLRPC.UserFull userFull = getParentFragment() == null ? null : getParentFragment().r8;
        TLRPC.UserFull b22 = org.telegram.messenger.hp.s1(this.R).b2(org.telegram.messenger.h10.i(this.R).e());
        TLRPC.User j10 = getParentFragment() == null ? null : getParentFragment().j();
        boolean z12 = org.telegram.messenger.hp.s1(this.R).h7;
        int i3 = 0;
        org.telegram.ui.wm wmVar = this.Q2;
        if (!z12 && getParentFragment() != null && j10 != null) {
            boolean z13 = org.telegram.messenger.r2.a;
            if ((!org.telegram.messenger.l10.B(j10) || (b22 != null && b22.display_gifts_button)) && !org.telegram.messenger.l10.t(j10) && !org.telegram.messenger.hp.F2(j10) && userFull != null) {
                if (!j10.premium && org.telegram.messenger.hp.s1(this.R).v7 && org.telegram.messenger.hp.s1(this.R).w7) {
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
                if (wmVar != null && wmVar.g4 == 0) {
                    z11 = true;
                    if (!z11 && (l3Var = this.M) != null) {
                        l3Var.f(true);
                    }
                    if (z11 && this.L1 == null) {
                        return;
                    }
                    if (this.L1 == null && wmVar != null) {
                        ie ieVar = new ie(this, getContext(), i3);
                        this.L1 = ieVar;
                        ieVar.setImageResource(R.drawable.msg_input_gift);
                        ie ieVar2 = this.L1;
                        int i10 = org.telegram.ui.ActionBar.k6.Kl;
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        org.telegram.ui.ActionBar.e6 e6Var = this.X3;
                        org.telegram.ui.ActionBar.r6.t(ieVar2, i10, e6Var, mode);
                        this.L1.setVisibility(8);
                        this.L1.setContentDescription(org.telegram.messenger.bd.M0(2131749688, null));
                        this.L1.setScaleType(ImageView.ScaleType.CENTER);
                        ie ieVar3 = this.L1;
                        int i11 = org.telegram.ui.ActionBar.k6.i6;
                        org.telegram.ui.ActionBar.r6.R(ieVar3, org.telegram.ui.ActionBar.k6.h0(f0(i11), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i11), e6Var);
                        this.q1.addView(this.L1, 0, b8.mf.e(44, 44, 21));
                        this.L1.setOnClickListener(new ad(this, 9));
                    }
                    org.telegram.messenger.g0.Y3(this.L1, z11, 1.0f, true, 1.0f, z10, new xc(this, i3));
                    if (z11) {
                        return;
                    }
                    y();
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
        if (this.L1 == null) {
            ie ieVar4 = new ie(this, getContext(), i3);
            this.L1 = ieVar4;
            ieVar4.setImageResource(R.drawable.msg_input_gift);
            ie ieVar22 = this.L1;
            int i102 = org.telegram.ui.ActionBar.k6.Kl;
            PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.e6 e6Var2 = this.X3;
            org.telegram.ui.ActionBar.r6.t(ieVar22, i102, e6Var2, mode2);
            this.L1.setVisibility(8);
            this.L1.setContentDescription(org.telegram.messenger.bd.M0(2131749688, null));
            this.L1.setScaleType(ImageView.ScaleType.CENTER);
            ie ieVar32 = this.L1;
            int i112 = org.telegram.ui.ActionBar.k6.i6;
            org.telegram.ui.ActionBar.r6.R(ieVar32, org.telegram.ui.ActionBar.k6.h0(f0(i112), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i112), e6Var2);
            this.q1.addView(this.L1, 0, b8.mf.e(44, 44, 21));
            this.L1.setOnClickListener(new ad(this, 9));
        }
        org.telegram.messenger.g0.Y3(this.L1, z11, 1.0f, true, 1.0f, z10, new xc(this, i3));
        if (z11) {
        }
    }

    @Override // org.telegram.ui.Components.pt0
    public final void K(int i3, boolean z10) {
        org.telegram.messenger.zi ziVar;
        ve veVar;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        boolean z11;
        int i10;
        int i11;
        sh.e eVar;
        if (this.S1 != 0) {
            this.M2 = i3;
            this.N2 = z10;
            this.A2 = i3 > 0;
            z();
            return;
        }
        if (i3 > org.telegram.messenger.g0.L(50.0f) && this.A2 && !org.telegram.messenger.g0.E) {
            if (z10) {
                this.z2 = i3;
                org.telegram.messenger.hp.d1().edit().putInt("kbd_height_land3", this.z2).commit();
            } else {
                this.y2 = i3;
                org.telegram.messenger.hp.d1().edit().putInt("kbd_height", this.y2).commit();
            }
        }
        if (this.A2 && this.X0 && this.V0 == null) {
            this.X0 = false;
        }
        boolean r02 = r0();
        qt0 qt0Var = this.n1;
        org.telegram.ui.wm wmVar = this.Q2;
        if (r02) {
            int i12 = z10 ? this.z2 : this.y2;
            if (wmVar != null && wmVar.getParentLayout() != null) {
                i12 -= ((ActionBarLayout) wmVar.getParentLayout()).w(false);
            }
            if (this.g2 == 1) {
                gf gfVar = this.I1;
                if (!gfVar.f) {
                    i12 = Math.min(gfVar.getKeyboardHeight(), i12);
                }
            }
            int i13 = this.g2;
            ViewGroup viewGroup = i13 == 0 ? this.V0 : i13 == 1 ? this.I1 : null;
            gf gfVar2 = this.I1;
            if (gfVar2 != null) {
                gfVar2.setPanelHeight(i12);
                sh.e eVar2 = this.i5;
                if (eVar2 != null && i12 > 0 && this.g2 == 1) {
                    ((sh.h) eVar2).h(i12);
                }
            }
            if (viewGroup != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
                if (!this.B3 && !this.A3 && (((i10 = layoutParams.width) != (i11 = org.telegram.messenger.g0.q.x) || layoutParams.height != i12) && ((eVar = this.i5) == null || i10 != -1 || layoutParams.height != -1))) {
                    if (eVar == null) {
                        layoutParams.width = i11;
                        layoutParams.height = i12;
                        viewGroup.setLayoutParams(layoutParams);
                    }
                    if (qt0Var != null) {
                        int i14 = this.B2;
                        this.B2 = layoutParams.height;
                        qt0Var.requestLayout();
                        F0();
                        if (this.j2 && !this.A2 && i14 != this.B2 && M0()) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.W0 = animatorSet;
                            if (this.i5 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(this.B2 - i14, 0.0f));
                            } else {
                                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.TRANSLATION_Y, this.B2 - i14, 0.0f));
                            }
                            this.W0.setInterpolator(org.telegram.ui.ActionBar.h1.w);
                            this.W0.setDuration(250L);
                            this.W0.addListener(new fe(this, 10));
                            org.telegram.messenger.g0.i3(this.Z3, 50L);
                            this.M3.d();
                            requestLayout();
                        }
                    }
                }
            }
        }
        if (this.M2 == i3 && this.N2 == z10) {
            F0();
            return;
        }
        this.M2 = i3;
        this.N2 = z10;
        boolean z12 = this.A2;
        this.A2 = i3 > 0;
        z();
        if (this.A2 && r0() && this.C3 == null) {
            s1(0, this.g2, true, true);
        } else if (!this.A2 && !r0() && (ziVar = this.n2) != null && this.U2 != ziVar && !g0() && !s() && !org.telegram.ui.ActionBar.d2.hasSheets(wmVar) && (((veVar = this.F0) == null || TextUtils.isEmpty(veVar.getText())) && (tL_replyKeyboardMarkup = this.o2) != null && !tL_replyKeyboardMarkup.rows.isEmpty())) {
            org.telegram.ui.ActionBar.h1 h1Var = qt0Var.I;
            if (h1Var.f) {
                h1Var.j();
            } else {
                h1Var.v = true;
            }
            s1(1, 1, false, true);
        }
        if (this.B2 != 0 && !(z11 = this.A2) && z11 != z12 && !r0()) {
            this.B2 = 0;
            qt0Var.requestLayout();
        }
        if (this.A2 && this.l3) {
            this.l3 = false;
            if (this.q3) {
                this.q3 = false;
                this.I1.setButtons(this.o2);
            }
            org.telegram.messenger.g0.r(this.s3);
        }
        F0();
    }

    public final void K0() {
        yc ycVar = new yc(this, 29);
        if (org.telegram.messenger.b6.h(this.R, this.R2) || org.telegram.messenger.hp.s1(this.R).W6.contains(Long.valueOf(this.R2))) {
            ycVar.run();
            return;
        }
        t4.n(this.Q2, org.telegram.messenger.hp.s1(this.R).a2(Long.valueOf(this.R2)), new org.telegram.ui.lo(14, this, ycVar), new pd(this, 0));
    }

    public final void K1() {
        ve veVar = this.F0;
        if (veVar != null) {
            veVar.setTranslationX(this.I + this.H);
        }
    }

    public final void L() {
        org.telegram.messenger.g0.v1(this.F0);
    }

    public final boolean L0() {
        return this.W0 != null;
    }

    public final void L1(TLRPC.Chat chat, TLRPC.UserFull userFull) {
        kf kfVar;
        this.B0 = false;
        boolean z10 = true;
        this.b = true;
        this.A0 = true;
        this.y0 = true;
        this.z0 = true;
        if (chat != null) {
            this.b1 = (org.telegram.messenger.t3.v(chat) || (org.telegram.messenger.t3.s(chat) && this.f2)) ? false : true;
            this.b = org.telegram.messenger.t3.t(chat);
            boolean q10 = org.telegram.messenger.t3.q(chat);
            this.A0 = q10;
            boolean z11 = (this.b || q10) ? false : true;
            this.B0 = z11;
            this.n = z11 ? 0.5f : 1.0f;
            G1();
            if (!this.B0 && (kfVar = this.V0) != null) {
                kfVar.K(-this.R2, !this.A0, !this.b);
            }
            this.y0 = org.telegram.messenger.t3.s(chat);
            this.z0 = org.telegram.messenger.t3.v(chat);
        } else if (userFull != null) {
            this.b1 = userFull.voice_messages_forbidden;
            this.L = userFull;
        }
        float f10 = this.b1 ? 0.5f : 1.0f;
        be beVar = this.a1;
        beVar.setAlpha(f10);
        beVar.invalidate();
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.b1 ? f0(org.telegram.ui.ActionBar.k6.Kl) : -1, PorterDuff.Mode.SRC_IN);
        ce ceVar = this.c1;
        ceVar.setColorFilter(porterDuffColorFilter);
        ceVar.invalidate();
        H1(false);
        boolean z12 = this.d1;
        if (!this.y0 && z12) {
            z12 = false;
        }
        if (this.z0 || z12) {
            z10 = z12;
        } else if (!this.f2) {
            z10 = false;
        }
        j1(z10, false);
    }

    public final void M() {
        if (this.y1 != null) {
            return;
        }
        ie ieVar = new ie(this, getContext(), 1);
        this.y1 = ieVar;
        bk0 bk0Var = new bk0(getContext());
        this.V1 = bk0Var;
        ieVar.setImageDrawable(bk0Var);
        bk0 bk0Var2 = this.V1;
        int i3 = org.telegram.ui.ActionBar.k6.Kl;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.e6 e6Var = this.X3;
        org.telegram.ui.ActionBar.r6.y(this, bk0Var2, i3, e6Var, mode);
        this.V1.a(R.drawable.input_bot2, false);
        this.y1.setScaleType(ImageView.ScaleType.CENTER);
        ie ieVar2 = this.y1;
        int i10 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.ActionBar.r6.R(ieVar2, org.telegram.ui.ActionBar.k6.h0(f0(i10), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i10), e6Var);
        this.y1.setVisibility(8);
        org.telegram.messenger.g0.Z3(this.y1, false, 0.1f, true, false);
        this.q1.addView(this.y1, 0, b8.mf.o(44, 44));
        this.y1.setOnClickListener(new ad(this, 15));
    }

    public boolean M0() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r10v45, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v47 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v31 */
    public void M1(int i3, boolean z10) {
        boolean z11;
        int i10;
        char c2;
        float f10;
        int i11;
        ?? r10;
        boolean z12;
        int i12;
        boolean z13;
        long j10;
        ?? r102;
        int i13;
        float f11;
        ?? r103;
        int i14;
        float f12;
        boolean z14;
        ViewGroup viewGroup;
        ViewGroup.LayoutParams layoutParams;
        int i15;
        char c10;
        char c11;
        Property property;
        fg fgVar = fg.a;
        fg fgVar2 = fg.b;
        Float valueOf = Float.valueOf(0.0f);
        Runnable runnable = this.g0;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.g0 = null;
        }
        RecordCircle recordCircle = this.O1;
        if (recordCircle != null) {
            recordCircle.N = false;
        }
        boolean z15 = this.G2;
        Property property2 = View.TRANSLATION_X;
        Property property3 = View.SCALE_X;
        Property property4 = View.SCALE_Y;
        Property property5 = View.ALPHA;
        if (z15) {
            if (this.x2 == 1) {
                this.R4 = i3;
                return;
            }
            boolean z16 = this.R4 == 3;
            if (z16) {
                property = property3;
            } else {
                this.P = false;
                yf yfVar = this.P1;
                if (yfVar != null) {
                    yfVar.E.d(1, false, false);
                }
                org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(this.R);
                long j11 = this.R2;
                org.telegram.ui.wm wmVar = this.Q2;
                property = property3;
                b02.e2(j11, (wmVar == null || !wmVar.w4) ? 0L : wmVar.b(), this.P);
                this.j1 = 0L;
            }
            T();
            this.x2 = 1;
            kf kfVar = this.V0;
            if (kfVar != null) {
                kfVar.setEnabled(false);
            }
            try {
                if (this.r2 == null) {
                    PowerManager.WakeLock newWakeLock = ((PowerManager) org.telegram.messenger.t0.b.getSystemService("power")).newWakeLock(536870918, "telegram:audio_record_lock");
                    this.r2 = newWakeLock;
                    newWakeLock.acquire();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            org.telegram.messenger.g0.f2(this.P2);
            uf ufVar = this.a3;
            if (ufVar != null) {
                ufVar.M0(0);
            }
            AnimatorSet animatorSet = this.u2;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.v2;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            V();
            ai.d2 d2Var = this.e1;
            if (d2Var != null) {
                d2Var.setVisibility(0);
            }
            U();
            RecordCircle recordCircle2 = this.O1;
            if (recordCircle2 != null) {
                recordCircle2.N = false;
                recordCircle2.setVisibility(0);
                this.O1.setAmplitude(0.0d);
            }
            yf yfVar2 = this.P1;
            if (yfVar2 != null) {
                yfVar2.setVisibility(0);
            }
            ag agVar = this.m1;
            if (agVar != null) {
                agVar.a = 1.0f;
                agVar.b = System.currentTimeMillis();
                agVar.r = -1L;
                agVar.c = false;
                agVar.e = false;
                agVar.f.stop();
                agVar.invalidate();
                this.m1.setScaleX(0.0f);
                this.m1.setScaleY(0.0f);
                this.m1.h = true;
            }
            this.u2 = new AnimatorSet();
            this.Z0.setTranslationX(org.telegram.messenger.g0.L(20.0f));
            this.Z0.setAlpha(0.0f);
            if (this.R4 != 3) {
                this.l1.setTranslationX(org.telegram.messenger.g0.L(20.0f));
                this.l1.setAlpha(0.0f);
                this.l1.setCancelToProgress(0.0f);
                this.l1.r = 1.0f;
                this.l1.setEnabled(true);
            } else {
                this.l1.setTranslationX(0.0f);
                this.l1.setAlpha(0.0f);
                this.l1.setCancelToProgress(1.0f);
                this.l1.setEnabled(true);
            }
            this.O1.c(this.R4 == 3);
            this.l2 = false;
            v0();
            AnimatorSet animatorSet3 = new AnimatorSet();
            Property property6 = property;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.R0, this.a4, 0.0f), ObjectAnimator.ofFloat(this.R0, this.c4, 0.0f), ObjectAnimator.ofFloat(this.m1, (Property<ag, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.m1, (Property<ag, Float>) property6, 1.0f), ObjectAnimator.ofFloat(this.Z0, (Property<dg, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.Z0, (Property<dg, Float>) property5, 1.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.l1, (Property<SlideTextView, Float>) property2, 0.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.l1, (Property<SlideTextView, Float>) property5, 1.0f));
            yf yfVar3 = this.P1;
            if (yfVar3 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(yfVar3, (Property<yf, Float>) property5, 1.0f));
            }
            if (this.c1 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.a1, (Property<be, Float>) property5, 0.0f));
            }
            ii.a0 a0Var = this.m0;
            if (a0Var != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(a0Var, (Property<ii.a0, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.m0, (Property<ii.a0, Float>) property6, 0.0f), ObjectAnimator.ofFloat(this.m0, (Property<ii.a0, Float>) property5, 0.0f));
            }
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.playTogether(ObjectAnimator.ofFloat(this.F0, this.e4, org.telegram.messenger.g0.L(20.0f)), ObjectAnimator.ofFloat(this.F0, (Property<ve, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.f1, (Property<sd, Float>) property5, 1.0f));
            if (z16) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.i1, (Property<mi0, Float>) property5, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.h1, (Property<fh0, Float>) property5, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.h1, (Property<fh0, Float>) property6, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.h1, (Property<fh0, Float>) property4, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.g1, (Property<a61, Float>) property5, 0.0f));
            }
            if (this.K1 != null) {
                animatorSet4.playTogether(m(org.telegram.messenger.g0.L(30.0f)), ObjectAnimator.ofFloat(this.K1, (Property<ge, Float>) property5, 0.0f));
            }
            ci.q qVar = this.q1;
            if (qVar != null) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(qVar, this.d4, org.telegram.messenger.g0.L(30.0f)), ObjectAnimator.ofFloat(this.q1, this.b4, 0.0f));
                ViewPropertyAnimator viewPropertyAnimator = this.r1;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    this.r1 = null;
                }
                lg.k kVar = this.s1;
                this.w1 = 0.0f;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(kVar, (Property<lg.k, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.s1, (Property<lg.k, Float>) property6, 0.5f), ObjectAnimator.ofFloat(this.s1, (Property<lg.k, Float>) property4, 0.5f));
            }
            mh.h hVar = this.j5;
            if (hVar != null) {
                hVar.e(0, false, true);
            }
            this.u2.playTogether(animatorSet3.setDuration(150L), animatorSet4.setDuration(150L), ObjectAnimator.ofFloat(this.O1, this.v3, 1.0f).setDuration(300L));
            if (!z16) {
                this.u2.playTogether(ObjectAnimator.ofFloat(this.O1, this.w3, 1.0f).setDuration(300L));
            }
            this.u2.addListener(new af(this, z16));
            this.u2.setInterpolator(new DecelerateInterpolator());
            this.u2.start();
            this.Z0.a(this.j1);
        } else {
            if (this.l2 && i3 == 3) {
                return;
            }
            PowerManager.WakeLock wakeLock = this.r2;
            if (wakeLock != null) {
                try {
                    wakeLock.release();
                    this.r2 = null;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.f(e11);
                }
            }
            org.telegram.messenger.g0.Q3(this.P2);
            this.n3 = false;
            if (this.x2 == 0) {
                this.R4 = i3;
                return;
            }
            org.telegram.messenger.hp.s1(this.S.a).C4(2, 0, this.R2, getThreadMessageId(), null);
            this.x2 = 0;
            kf kfVar2 = this.V0;
            if (kfVar2 != null) {
                kfVar2.setEnabled(true);
            }
            AnimatorSet animatorSet5 = this.u2;
            if (animatorSet5 != null) {
                z11 = animatorSet5.isRunning();
                ce ceVar = this.c1;
                if (ceVar != null) {
                    ceVar.setScaleX(1.0f);
                    this.c1.setScaleY(1.0f);
                }
                this.u2.removeAllListeners();
                this.u2.cancel();
            } else {
                z11 = false;
            }
            AnimatorSet animatorSet6 = this.v2;
            if (animatorSet6 != null) {
                animatorSet6.cancel();
            }
            ve veVar = this.F0;
            if (veVar != null) {
                veVar.setVisibility(0);
            }
            this.u2 = new AnimatorSet();
            if (z11 || i3 == 4) {
                float f13 = 0.5f;
                ce ceVar2 = this.c1;
                if (ceVar2 != null) {
                    ceVar2.setVisibility(0);
                }
                AnimatorSet animatorSet7 = this.u2;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.R0, this.a4, 1.0f);
                ud udVar = this.R0;
                rd rdVar = this.c4;
                if (!this.B0) {
                    f13 = 1.0f;
                }
                animatorSet7.playTogether(ofFloat, ObjectAnimator.ofFloat(udVar, rdVar, f13), ObjectAnimator.ofFloat(this.m1, (Property<ag, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.m1, (Property<ag, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.O1, this.v3, 0.0f), ObjectAnimator.ofFloat(this.O1, this.w3, 0.0f), ObjectAnimator.ofFloat(this.a1, (Property<be, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.Z0, (Property<dg, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.a1, (Property<be, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.F0, (Property<ve, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.F0, this.e4, 0.0f), ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f));
                yf yfVar4 = this.P1;
                if (yfVar4 != null) {
                    i10 = 1;
                    c2 = 0;
                    this.u2.playTogether(ObjectAnimator.ofFloat(yfVar4, (Property<yf, Float>) property5, 0.0f));
                    this.P1.a();
                } else {
                    i10 = 1;
                    c2 = 0;
                }
                ii.a0 a0Var2 = this.m0;
                if (a0Var2 != null) {
                    AnimatorSet animatorSet8 = this.u2;
                    float[] fArr = new float[i10];
                    f10 = 1.0f;
                    fArr[c2] = 1.0f;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(a0Var2, (Property<ii.a0, Float>) property4, fArr);
                    ii.a0 a0Var3 = this.m0;
                    float[] fArr2 = new float[i10];
                    fArr2[c2] = 1.0f;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(a0Var3, (Property<ii.a0, Float>) property3, fArr2);
                    ii.a0 a0Var4 = this.m0;
                    float[] fArr3 = new float[i10];
                    fArr3[c2] = 1.0f;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(a0Var4, (Property<ii.a0, Float>) property5, fArr3);
                    Animator[] animatorArr = new Animator[3];
                    animatorArr[c2] = ofFloat2;
                    animatorArr[i10] = ofFloat3;
                    animatorArr[2] = ofFloat4;
                    animatorSet8.playTogether(animatorArr);
                } else {
                    f10 = 1.0f;
                }
                ce ceVar3 = this.c1;
                if (ceVar3 != null) {
                    ceVar3.setScaleX(f10);
                    this.c1.setScaleY(f10);
                    i11 = 1;
                    this.u2.playTogether(ObjectAnimator.ofFloat(this.a1, (Property<be, Float>) property5, f10));
                    this.c1.j(q0() ? fgVar2 : fgVar, true);
                } else {
                    i11 = 1;
                }
                if (this.K1 != null) {
                    AnimatorSet animatorSet9 = this.u2;
                    ValueAnimator m10 = m(0.0f);
                    ge geVar = this.K1;
                    float[] fArr4 = new float[i11];
                    fArr4[0] = 1.0f;
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(geVar, (Property<ge, Float>) property5, fArr4);
                    Animator[] animatorArr2 = new Animator[2];
                    animatorArr2[0] = m10;
                    animatorArr2[i11] = ofFloat5;
                    animatorSet9.playTogether(animatorArr2);
                }
                if (this.q1 != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.r1;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.r1 = null;
                    }
                    z12 = true;
                    r10 = 0;
                    this.u2.playTogether(ObjectAnimator.ofFloat(this.q1, this.d4, 0.0f), ObjectAnimator.ofFloat(this.q1, this.b4, 1.0f));
                    AnimatorSet animatorSet10 = this.u2;
                    lg.k kVar2 = this.s1;
                    this.w1 = 1.0f;
                    animatorSet10.playTogether(ObjectAnimator.ofFloat(kVar2, (Property<lg.k, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.s1, (Property<lg.k, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.s1, (Property<lg.k, Float>) property4, 1.0f));
                } else {
                    r10 = 0;
                    z12 = true;
                }
                mh.h hVar2 = this.j5;
                if (hVar2 != 0) {
                    hVar2.e(r10, r10, z12);
                }
                this.l2 = z12;
                v0();
                this.u2.setDuration(150L);
            } else {
                int i16 = 9;
                if (i3 == 3) {
                    T();
                    U();
                    SlideTextView slideTextView = this.l1;
                    if (slideTextView != null) {
                        slideTextView.setEnabled(false);
                    }
                    if (this.d1) {
                        mi0 mi0Var = this.i1;
                        if (mi0Var != null) {
                            mi0Var.setVisibility(8);
                        }
                        sd sdVar = this.f1;
                        if (sdVar != null) {
                            sdVar.setAlpha(1.0f);
                            this.f1.setVisibility(0);
                        }
                        fh0 fh0Var = this.h1;
                        if (fh0Var != null) {
                            fh0Var.setProgress(0.0f);
                            this.h1.i();
                        }
                        z14 = true;
                        f12 = 1.0f;
                    } else {
                        a61 a61Var = this.g1;
                        if (a61Var != null) {
                            a61Var.setVisibility(8);
                            v0();
                        }
                        sd sdVar2 = this.f1;
                        if (sdVar2 != null) {
                            sdVar2.setVisibility(0);
                            f12 = 1.0f;
                            this.f1.setAlpha(1.0f);
                        } else {
                            f12 = 1.0f;
                        }
                        mi0 mi0Var2 = this.i1;
                        if (mi0Var2 != null) {
                            mi0Var2.setVisibility(0);
                            this.i1.setAlpha(0.0f);
                        }
                        z14 = true;
                    }
                    this.t4 = z14;
                    this.o4 = f12;
                    this.m4 = this.l4;
                    this.k4 = f12;
                    SlideTextView slideTextView2 = this.l1;
                    if (slideTextView2 != null) {
                        slideTextView2.setCancelToProgress(f12);
                    }
                    yf yfVar5 = this.P1;
                    if (yfVar5 != null) {
                        yfVar5.invalidate();
                    }
                    fh0 fh0Var2 = this.h1;
                    if (fh0Var2 != null) {
                        fh0Var2.setAlpha(0.0f);
                        this.h1.setScaleX(0.0f);
                        this.h1.setScaleY(0.0f);
                        this.h1.setProgress(0.0f);
                        this.h1.i();
                    }
                    if (q0() || this.A4) {
                        this.g1.setVisibility(0);
                        viewGroup = null;
                        layoutParams = null;
                    } else {
                        viewGroup = (ViewGroup) this.f1.getParent();
                        layoutParams = this.f1.getLayoutParams();
                        viewGroup.removeView(this.f1);
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(viewGroup.getMeasuredWidth() - (this.a2 == null ? k2.p1.d(44.0f, this.K0.l(), 0) : 0), org.telegram.messenger.g0.L(44.0f));
                        layoutParams2.gravity = 80;
                        layoutParams2.leftMargin = org.telegram.messenger.g0.L(7.0f);
                        layoutParams2.rightMargin = org.telegram.messenger.g0.L(7.0f);
                        this.n1.addView(this.f1, layoutParams2);
                        this.g1.setVisibility(8);
                    }
                    v0();
                    AnimatorSet animatorSet11 = new AnimatorSet();
                    if (z10) {
                        this.i1.setAllowDraw(false);
                        ValueAnimator ofFloat6 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat6.addUpdateListener(new xc(this, 6));
                        ofFloat6.addListener(new bf(this));
                        ofFloat6.setDuration(q0() ? 490L : 580L);
                        AnimatorSet animatorSet12 = new AnimatorSet();
                        animatorSet12.playTogether(ObjectAnimator.ofFloat(this.m1, (Property<ag, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.m1, (Property<ag, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.Z0, (Property<dg, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.Z0, (Property<dg, Float>) property2, -org.telegram.messenger.g0.L(20.0f)), ObjectAnimator.ofFloat(this.l1, (Property<SlideTextView, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.h1, (Property<fh0, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.h1, (Property<fh0, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.h1, (Property<fh0, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.R0, this.a4, 0.0f), ObjectAnimator.ofFloat(this.R0, this.c4, 0.0f), ObjectAnimator.ofFloat(this.F0, (Property<ve, Float>) property5, 0.0f));
                        fh0 fh0Var3 = this.h1;
                        if (fh0Var3 != null) {
                            fh0Var3.setAlpha(0.0f);
                            this.h1.setScaleX(0.0f);
                            this.h1.setScaleY(0.0f);
                        }
                        if (this.c1 != null) {
                            i15 = 1;
                            animatorSet12.playTogether(ObjectAnimator.ofFloat(this.a1, (Property<be, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.a1, (Property<be, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.a1, (Property<be, Float>) property4, 1.0f));
                            this.c1.j(q0() ? fgVar2 : fgVar, true);
                        } else {
                            i15 = 1;
                        }
                        ii.a0 a0Var5 = this.m0;
                        if (a0Var5 != null) {
                            float[] fArr5 = new float[i15];
                            fArr5[0] = 0.0f;
                            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(a0Var5, (Property<ii.a0, Float>) property5, fArr5);
                            ii.a0 a0Var6 = this.m0;
                            float[] fArr6 = new float[i15];
                            fArr6[0] = 0.0f;
                            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(a0Var6, (Property<ii.a0, Float>) property3, fArr6);
                            ii.a0 a0Var7 = this.m0;
                            float[] fArr7 = new float[i15];
                            fArr7[0] = 0.0f;
                            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(a0Var7, (Property<ii.a0, Float>) property4, fArr7);
                            Animator[] animatorArr3 = new Animator[3];
                            animatorArr3[0] = ofFloat7;
                            animatorArr3[i15] = ofFloat8;
                            animatorArr3[2] = ofFloat9;
                            animatorSet12.playTogether(animatorArr3);
                        }
                        animatorSet12.addListener(new fe(this, 8));
                        animatorSet12.setDuration(150L);
                        animatorSet12.setStartDelay(150L);
                        if (q0()) {
                            this.g1.setAlpha(0.0f);
                            c10 = 1;
                            c11 = 0;
                            animatorSet11.playTogether(ObjectAnimator.ofFloat(this.g1, (Property<a61, Float>) property5, 1.0f));
                            animatorSet11.setDuration(150L);
                            animatorSet11.setStartDelay(430L);
                        } else {
                            c10 = 1;
                            c11 = 0;
                        }
                        AnimatorSet animatorSet13 = this.u2;
                        Animator[] animatorArr4 = new Animator[3];
                        animatorArr4[c11] = animatorSet12;
                        animatorArr4[c10] = ofFloat6;
                        animatorArr4[2] = animatorSet11;
                        animatorSet13.playTogether(animatorArr4);
                        this.u2.addListener(new ei.k3(this, viewGroup, layoutParams, 3));
                    } else {
                        V();
                        this.v3.set(this.O1, Float.valueOf(1.0f));
                        this.O1.setTransformToSeekbar(1.0f);
                        if (!q0()) {
                            float f14 = this.q4;
                            if (f14 != 0.0f && this.i1 != null) {
                                this.i1.setAlpha(xq.j.getInterpolation(Math.max(0.0f, ((f14 - 0.38f) - 0.25f) / 0.37f)));
                                this.i1.invalidate();
                            }
                        }
                        this.m1.setScaleY(0.0f);
                        this.m1.setScaleX(0.0f);
                        this.Z0.setAlpha(0.0f);
                        this.Z0.setTranslationX(-org.telegram.messenger.g0.L(20.0f));
                        this.l1.setAlpha(0.0f);
                        this.h1.setAlpha(1.0f);
                        this.h1.setScaleY(1.0f);
                        this.h1.setScaleX(1.0f);
                        this.a4.set(this.R0, valueOf);
                        this.c4.set(this.R0, valueOf);
                        this.F0.setAlpha(0.0f);
                        ce ceVar4 = this.c1;
                        if (ceVar4 != null) {
                            if (q0()) {
                                fgVar = fgVar2;
                            }
                            ceVar4.j(fgVar, z10);
                            this.a1.setAlpha(1.0f);
                            this.a1.setScaleX(1.0f);
                            this.a1.setScaleY(1.0f);
                        }
                        ii.a0 a0Var8 = this.m0;
                        if (a0Var8 != null) {
                            a0Var8.setAlpha(0.0f);
                            this.m0.setScaleX(0.0f);
                            this.m0.setScaleY(0.0f);
                        }
                        if (q0()) {
                            this.g1.setAlpha(1.0f);
                        }
                        if (viewGroup != null) {
                            this.n1.removeView(this.f1);
                            viewGroup.addView(this.f1, layoutParams);
                        }
                        this.f1.setAlpha(1.0f);
                        this.i1.setAlpha(1.0f);
                        this.h = 0.0f;
                        this.n = 0.0f;
                        G1();
                        v0();
                    }
                } else if (i3 == 2 || i3 == 5) {
                    ce ceVar5 = this.c1;
                    if (ceVar5 != null) {
                        ceVar5.setVisibility(0);
                    }
                    this.l2 = true;
                    v0();
                    AnimatorSet animatorSet14 = new AnimatorSet();
                    animatorSet14.playTogether(ObjectAnimator.ofFloat(this.R0, this.a4, 1.0f), ObjectAnimator.ofFloat(this.R0, this.c4, this.B0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.m1, (Property<ag, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.m1, (Property<ag, Float>) property3, 0.0f));
                    yf yfVar6 = this.P1;
                    if (yfVar6 != null) {
                        animatorSet14.playTogether(ObjectAnimator.ofFloat(yfVar6, (Property<yf, Float>) property5, 0.0f));
                        this.P1.a();
                    }
                    ii.a0 a0Var9 = this.m0;
                    if (a0Var9 != null) {
                        animatorSet14.playTogether(ObjectAnimator.ofFloat(a0Var9, (Property<ii.a0, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.m0, (Property<ii.a0, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.m0, (Property<ii.a0, Float>) property5, 1.0f));
                    }
                    AnimatorSet animatorSet15 = new AnimatorSet();
                    animatorSet15.playTogether(ObjectAnimator.ofFloat(this.Z0, (Property<dg, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.Z0, (Property<dg, Float>) property2, -org.telegram.messenger.g0.L(20.0f)), ObjectAnimator.ofFloat(this.l1, (Property<SlideTextView, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.l1, (Property<SlideTextView, Float>) property2, -org.telegram.messenger.g0.L(20.0f)));
                    if (i3 != 5) {
                        this.a1.setScaleX(0.0f);
                        this.a1.setScaleY(0.0f);
                        lg.k kVar3 = this.s1;
                        if (kVar3 != null && kVar3.getVisibility() == 0) {
                            this.s1.setScaleX(0.5f);
                            this.s1.setScaleY(0.5f);
                        }
                        ie ieVar = this.y1;
                        if (ieVar != null && ieVar.getVisibility() == 0) {
                            this.y1.setScaleX(0.0f);
                            this.y1.setScaleY(0.0f);
                        }
                        animatorSet14.playTogether(ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f), ObjectAnimator.ofFloat(this.a1, (Property<be, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.a1, (Property<be, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.a1, (Property<be, Float>) property5, 1.0f));
                        if (this.q1 != null) {
                            ViewPropertyAnimator viewPropertyAnimator3 = this.r1;
                            if (viewPropertyAnimator3 != null) {
                                viewPropertyAnimator3.cancel();
                                this.r1 = null;
                            }
                            i13 = 1;
                            r102 = 0;
                            animatorSet14.playTogether(ObjectAnimator.ofFloat(this.q1, this.b4, 1.0f), ObjectAnimator.ofFloat(this.q1, this.d4, 0.0f));
                            lg.k kVar4 = this.s1;
                            this.w1 = 1.0f;
                            animatorSet14.playTogether(ObjectAnimator.ofFloat(kVar4, (Property<lg.k, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.s1, (Property<lg.k, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.s1, (Property<lg.k, Float>) property4, 1.0f));
                        } else {
                            r102 = 0;
                            i13 = 1;
                        }
                        mh.h hVar3 = this.j5;
                        if (hVar3 != 0) {
                            hVar3.e(r102, r102, i13);
                        }
                        ie ieVar2 = this.y1;
                        if (ieVar2 != null) {
                            float[] fArr8 = new float[i13];
                            fArr8[r102] = 1.0f;
                            ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(ieVar2, (Property<ie, Float>) property3, fArr8);
                            ie ieVar3 = this.y1;
                            float[] fArr9 = new float[i13];
                            fArr9[r102] = 1.0f;
                            ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(ieVar3, (Property<ie, Float>) property4, fArr9);
                            Animator[] animatorArr5 = new Animator[2];
                            animatorArr5[r102] = ofFloat10;
                            animatorArr5[i13] = ofFloat11;
                            animatorSet14.playTogether(animatorArr5);
                        }
                        if (this.c1 != null) {
                            be beVar = this.a1;
                            float[] fArr10 = new float[i13];
                            fArr10[r102] = 1.0f;
                            ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(beVar, (Property<be, Float>) property5, fArr10);
                            Animator[] animatorArr6 = new Animator[i13];
                            animatorArr6[r102] = ofFloat12;
                            animatorSet14.playTogether(animatorArr6);
                            be beVar2 = this.a1;
                            float[] fArr11 = new float[i13];
                            fArr11[r102] = 1.0f;
                            ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(beVar2, (Property<be, Float>) property3, fArr11);
                            Animator[] animatorArr7 = new Animator[i13];
                            animatorArr7[r102] = ofFloat13;
                            animatorSet14.playTogether(animatorArr7);
                            be beVar3 = this.a1;
                            float[] fArr12 = new float[i13];
                            fArr12[r102] = 1.0f;
                            ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(beVar3, (Property<be, Float>) property4, fArr12);
                            Animator[] animatorArr8 = new Animator[i13];
                            animatorArr8[r102] = ofFloat14;
                            animatorSet14.playTogether(animatorArr8);
                            this.c1.j(q0() ? fgVar2 : fgVar, i13);
                        }
                        ge geVar2 = this.K1;
                        if (geVar2 != null) {
                            float[] fArr13 = new float[i13];
                            fArr13[0] = 1.0f;
                            ObjectAnimator ofFloat15 = ObjectAnimator.ofFloat(geVar2, (Property<ge, Float>) property5, fArr13);
                            ValueAnimator m11 = m(0.0f);
                            Animator[] animatorArr9 = new Animator[2];
                            animatorArr9[0] = ofFloat15;
                            animatorArr9[i13] = m11;
                            animatorSet14.playTogether(animatorArr9);
                        }
                        j10 = 150;
                    } else {
                        AnimatorSet animatorSet16 = new AnimatorSet();
                        animatorSet16.playTogether(ObjectAnimator.ofFloat(this.a1, (Property<be, Float>) property5, 1.0f));
                        if (this.q1 != null) {
                            ViewPropertyAnimator viewPropertyAnimator4 = this.r1;
                            if (viewPropertyAnimator4 != null) {
                                viewPropertyAnimator4.cancel();
                                this.r1 = null;
                            }
                            i12 = 1;
                            z13 = false;
                            animatorSet16.playTogether(ObjectAnimator.ofFloat(this.q1, this.d4, 0.0f), ObjectAnimator.ofFloat(this.q1, this.b4, 1.0f));
                            lg.k kVar5 = this.s1;
                            this.w1 = 1.0f;
                            animatorSet16.playTogether(ObjectAnimator.ofFloat(kVar5, (Property<lg.k, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.s1, (Property<lg.k, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.s1, (Property<lg.k, Float>) property4, 1.0f));
                        } else {
                            i12 = 1;
                            z13 = false;
                        }
                        mh.h hVar4 = this.j5;
                        boolean z17 = z13;
                        if (hVar4 != null) {
                            hVar4.e(z17 ? 1 : 0, z17, i12);
                        }
                        ge geVar3 = this.K1;
                        if (geVar3 != null) {
                            float[] fArr14 = new float[i12];
                            fArr14[z17 ? 1 : 0] = 1.0f;
                            ObjectAnimator ofFloat16 = ObjectAnimator.ofFloat(geVar3, (Property<ge, Float>) property5, fArr14);
                            ValueAnimator m12 = m(0.0f);
                            Animator[] animatorArr10 = new Animator[2];
                            animatorArr10[z17 ? 1 : 0] = ofFloat16;
                            animatorArr10[i12] = m12;
                            animatorSet16.playTogether(animatorArr10);
                        }
                        j10 = 150;
                        animatorSet16.setDuration(150L);
                        animatorSet16.setStartDelay(110L);
                        animatorSet16.addListener(new fe(this, i16));
                        AnimatorSet animatorSet17 = this.u2;
                        Animator[] animatorArr11 = new Animator[i12];
                        animatorArr11[0] = animatorSet16;
                        animatorSet17.playTogether(animatorArr11);
                    }
                    animatorSet14.setDuration(j10);
                    animatorSet14.setStartDelay(700L);
                    animatorSet15.setDuration(200L);
                    animatorSet15.setStartDelay(200L);
                    this.H = 0.0f;
                    K1();
                    ObjectAnimator ofFloat17 = ObjectAnimator.ofFloat(this.F0, (Property<ve, Float>) property5, 1.0f);
                    ofFloat17.setStartDelay(this.s == 1.0f ? 300L : 700L);
                    ofFloat17.setDuration(200L);
                    this.u2.playTogether(animatorSet14, animatorSet15, ofFloat17, ObjectAnimator.ofFloat(this, "lockAnimatedTranslation", this.l4).setDuration(200L));
                    if (i3 == 5) {
                        ChatActivityEnterView.this.s4 = true;
                        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f).setDuration(200L);
                        duration.setInterpolator(xq.j);
                        this.u2.playTogether(duration);
                    } else {
                        ObjectAnimator ofFloat18 = ObjectAnimator.ofFloat(this, "exitTransition", 1.0f);
                        ofFloat18.setDuration(360L);
                        ofFloat18.setStartDelay(490L);
                        this.u2.playTogether(ofFloat18);
                    }
                    ag agVar2 = this.m1;
                    if (agVar2 != null) {
                        agVar2.a();
                    }
                } else {
                    ce ceVar6 = this.c1;
                    if (ceVar6 != null) {
                        ceVar6.setVisibility(0);
                    }
                    AnimatorSet animatorSet18 = new AnimatorSet();
                    animatorSet18.playTogether(ObjectAnimator.ofFloat(this.R0, this.a4, 1.0f), ObjectAnimator.ofFloat(this.R0, this.c4, this.B0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.m1, (Property<ag, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.m1, (Property<ag, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.a1, (Property<be, Float>) property5, 1.0f));
                    yf yfVar7 = this.P1;
                    if (yfVar7 != null) {
                        animatorSet18.playTogether(ObjectAnimator.ofFloat(yfVar7, (Property<yf, Float>) property5, 0.0f));
                        this.P1.a();
                    }
                    ii.a0 a0Var10 = this.m0;
                    if (a0Var10 != null) {
                        f11 = 1.0f;
                        animatorSet18.playTogether(ObjectAnimator.ofFloat(a0Var10, (Property<ii.a0, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.m0, (Property<ii.a0, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.m0, (Property<ii.a0, Float>) property5, 1.0f));
                    } else {
                        f11 = 1.0f;
                    }
                    ce ceVar7 = this.c1;
                    if (ceVar7 != null) {
                        ceVar7.setScaleX(f11);
                        this.c1.setScaleY(f11);
                        animatorSet18.playTogether(ObjectAnimator.ofFloat(this.a1, (Property<be, Float>) property5, f11));
                        this.c1.j(q0() ? fgVar2 : fgVar, true);
                    }
                    if (this.q1 != null) {
                        ViewPropertyAnimator viewPropertyAnimator5 = this.r1;
                        if (viewPropertyAnimator5 != null) {
                            viewPropertyAnimator5.cancel();
                            this.r1 = null;
                        }
                        this.y = 0.0f;
                        B1();
                        i14 = 1;
                        r103 = 0;
                        animatorSet18.playTogether(ObjectAnimator.ofFloat(this.q1, this.b4, 1.0f));
                        lg.k kVar6 = this.s1;
                        this.w1 = 1.0f;
                        animatorSet18.playTogether(ObjectAnimator.ofFloat(kVar6, (Property<lg.k, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.s1, (Property<lg.k, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.s1, (Property<lg.k, Float>) property4, 1.0f));
                    } else {
                        r103 = 0;
                        i14 = 1;
                    }
                    mh.h hVar5 = this.j5;
                    if (hVar5 != 0) {
                        hVar5.e(r103, r103, i14);
                    }
                    ge geVar4 = this.K1;
                    if (geVar4 != null) {
                        float[] fArr15 = new float[i14];
                        fArr15[r103] = 1.0f;
                        ObjectAnimator ofFloat19 = ObjectAnimator.ofFloat(geVar4, (Property<ge, Float>) property5, fArr15);
                        ValueAnimator m13 = m(0.0f);
                        Animator[] animatorArr12 = new Animator[2];
                        animatorArr12[r103] = ofFloat19;
                        animatorArr12[i14] = m13;
                        animatorSet18.playTogether(animatorArr12);
                    }
                    animatorSet18.setDuration(150L);
                    animatorSet18.setStartDelay(200L);
                    AnimatorSet animatorSet19 = new AnimatorSet();
                    dg dgVar = this.Z0;
                    float[] fArr16 = new float[i14];
                    fArr16[r103] = 0.0f;
                    ObjectAnimator ofFloat20 = ObjectAnimator.ofFloat(dgVar, (Property<dg, Float>) property5, fArr16);
                    dg dgVar2 = this.Z0;
                    float[] fArr17 = new float[i14];
                    fArr17[r103] = org.telegram.messenger.g0.L(40.0f);
                    ObjectAnimator ofFloat21 = ObjectAnimator.ofFloat(dgVar2, (Property<dg, Float>) property2, fArr17);
                    SlideTextView slideTextView3 = this.l1;
                    float[] fArr18 = new float[i14];
                    fArr18[r103] = 0.0f;
                    ObjectAnimator ofFloat22 = ObjectAnimator.ofFloat(slideTextView3, (Property<SlideTextView, Float>) property5, fArr18);
                    SlideTextView slideTextView4 = this.l1;
                    float[] fArr19 = new float[i14];
                    fArr19[r103] = org.telegram.messenger.g0.L(40.0f);
                    ObjectAnimator ofFloat23 = ObjectAnimator.ofFloat(slideTextView4, (Property<SlideTextView, Float>) property2, fArr19);
                    Animator[] animatorArr13 = new Animator[4];
                    animatorArr13[r103] = ofFloat20;
                    animatorArr13[i14] = ofFloat21;
                    animatorArr13[2] = ofFloat22;
                    animatorArr13[3] = ofFloat23;
                    animatorSet19.playTogether(animatorArr13);
                    animatorSet19.setDuration(150L);
                    float[] fArr20 = new float[i14];
                    fArr20[r103] = 1.0f;
                    ObjectAnimator ofFloat24 = ObjectAnimator.ofFloat(this, "exitTransition", fArr20);
                    ofFloat24.setDuration(this.h0 ? 220L : 360L);
                    this.H = 0.0f;
                    K1();
                    ObjectAnimator ofFloat25 = ObjectAnimator.ofFloat(this.F0, (Property<ve, Float>) property5, 1.0f);
                    ofFloat25.setStartDelay(this.s == 1.0f ? 150L : 450L);
                    ofFloat25.setDuration(200L);
                    this.u2.playTogether(animatorSet18, animatorSet19, ofFloat25, ofFloat24);
                }
            }
            this.u2.addListener(new df(this, i3));
            this.u2.start();
            dg dgVar3 = this.Z0;
            if (dgVar3 != null) {
                dgVar3.b();
            }
        }
        this.a3.e();
        Q1(true);
        this.R4 = i3;
    }

    public final void N() {
        if (this.m0 != null) {
            return;
        }
        ii.a0 a0Var = new ii.a0(getContext());
        this.m0 = a0Var;
        a0Var.setOnClickListener(new ad(this, 7));
        this.z1.addView(this.m0, b8.mf.d(-2, 32.0f, 83, 8.0f, 6.0f, 8.0f, 6.0f));
        org.telegram.messenger.g0.Z3(this.m0, false, 1.0f, true, false);
        ii.a0 a0Var2 = this.m0;
        if (!a0Var2.f) {
            a0Var2.f = true;
            a0Var2.h = 1.0f;
            a0Var2.requestLayout();
            a0Var2.invalidate();
        }
    }

    public final void N0(int i3, int i10, CharSequence charSequence, boolean z10) {
        if (this.F0 == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.F0.getText());
            spannableStringBuilder.replace(i3, i10 + i3, charSequence);
            if (z10) {
                org.telegram.messenger.i6.m(spannableStringBuilder, this.F0.getPaint().getFontMetricsInt(), false, null, 0);
            }
            this.F0.setText(spannableStringBuilder);
            this.F0.setSelection(i3 + charSequence.length());
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void N1() {
        int f02 = f0(org.telegram.ui.ActionBar.k6.Xf);
        int f03 = f0(org.telegram.ui.ActionBar.k6.Ge);
        int f04 = f0(org.telegram.ui.ActionBar.k6.Sf);
        fh0 fh0Var = this.h1;
        if (fh0Var != null) {
            fh0Var.h(f02, "Cup Red");
            this.h1.h(f02, "Box Red");
            this.h1.h(f04, "Cup Grey");
            this.h1.h(f04, "Box Grey");
            this.h1.h(f04, "Box_Grey 2");
            this.h1.h(f04, "Line 1");
            this.h1.h(f04, "Line 2");
            this.h1.h(f04, "Line 3");
            this.h1.h(f03, "Line 1 Dup");
            this.h1.h(f03, "Line 2 Dup");
            this.h1.h(f03, "Line 3 Dup");
        }
    }

    public final void O() {
        if (this.c0 != null) {
            return;
        }
        NumberTextView numberTextView = new NumberTextView(getContext());
        this.c0 = numberTextView;
        numberTextView.setVisibility(8);
        this.c0.setTextSize(15);
        this.c0.setTextColor(f0(org.telegram.ui.ActionBar.k6.y6));
        this.c0.setTypeface(org.telegram.messenger.g0.o());
        this.c0.setCenterAlign(true);
        addView(this.c0, Math.min(2, getChildCount()), b8.mf.d(44, 20.0f, 85, 3.0f, 0.0f, 0.0f, 44.0f));
    }

    public final void O0() {
        m1(false, true, false, true);
        s1(0, 0, false, true);
        if (getEditField() != null && !TextUtils.isEmpty(getEditField().getText())) {
            getEditField().setText("");
        }
        this.G2 = false;
        ce ceVar = this.c1;
        if (ceVar != null) {
            ceVar.setVisibility(0);
        }
        this.l2 = true;
        v0();
        w();
        m0();
        yf yfVar = this.P1;
        if (yfVar != null) {
            yfVar.setVisibility(8);
        }
        RecordCircle recordCircle = this.O1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }

    public final void O1() {
        org.telegram.messenger.st stVar = this.D1;
        if (stVar == null) {
            return;
        }
        boolean z10 = this.E1;
        boolean z11 = this.F1 != null && this.a2 == null;
        this.E1 = z11;
        ee eeVar = this.K0;
        ImageView imageView = this.S0;
        ud udVar = this.R0;
        if (z11) {
            stVar.setResourcesProvider(this.X3);
            this.D1.set(this.F1);
            this.D1.setVisibility(0);
            ve veVar = this.F0;
            if (veVar != null) {
                veVar.setVisibility(8);
            }
            udVar.setVisibility(8);
            imageView.setVisibility(0);
            eeVar.setLocked(!org.telegram.messenger.h10.i(this.R).q());
        } else {
            stVar.setVisibility(8);
            ve veVar2 = this.F0;
            if (veVar2 != null) {
                veVar2.setVisibility(0);
            }
            udVar.setVisibility(0);
            imageView.setVisibility(8);
            eeVar.setLocked(false);
        }
        F1();
        if (z10 != this.E1) {
            E(true);
        }
    }

    public final void P(boolean z10) {
        if (this.G1 != null) {
            return;
        }
        ee eeVar = new ee(this, getContext(), this.X3);
        this.G1 = eeVar;
        eeVar.setContentDescription(org.telegram.messenger.bd.M0(2131751275, null));
        if (z10) {
            b8.pf.a(this.G1);
        }
        this.A1.addView(this.G1, b8.mf.e(44, 44, 85));
    }

    public final void P0(TL_iv.RichMessage richMessage) {
        org.telegram.ui.wm wmVar = this.Q2;
        if (wmVar != null) {
            org.telegram.messenger.li.b0(this.R).Q1(wmVar.a(), wmVar.P7(wmVar.E5), "", null, null, null, null, 0L, false, false, richMessage);
        }
        setRichDraftPreview(richMessage);
    }

    public final void P1(boolean z10) {
        boolean z11;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z12 = org.telegram.messenger.m5.z(this.R2);
        ImageView imageView = this.J1;
        if (z12) {
            TLRPC.Chat M0 = org.telegram.messenger.hp.s1(this.S.a).M0(Long.valueOf(-this.R2));
            this.h2 = org.telegram.messenger.hp.s1(this.R).d7.getBoolean("silent_" + this.R2, false);
            z11 = org.telegram.messenger.t3.T(M0) && (M0.creator || ((tL_chatAdminRights = M0.admin_rights) != null && tL_chatAdminRights.post_messages)) && !M0.megagroup;
            this.i2 = z11;
            if (imageView != null) {
                if (this.f0 == null) {
                    this.f0 = new uq(getContext(), R.drawable.input_notify_on, org.telegram.ui.ActionBar.k6.Kl);
                }
                this.f0.a(this.h2, false);
                imageView.setImageDrawable(this.f0);
            } else {
                z11 = false;
            }
            ci.q qVar = this.q1;
            if (qVar != null) {
                I1(qVar.getVisibility() == 0 ? 1 : 0);
            }
        } else {
            z11 = false;
        }
        boolean z13 = (this.a3 == null || c() || !this.a3.u0()) ? false : true;
        boolean z14 = (!z13 || this.M1 || this.G2) ? false : true;
        if (z14) {
            W();
        }
        ge geVar = this.K1;
        if (geVar != null) {
            if ((geVar.getTag() != null && z14) || (this.K1.getTag() == null && !z14)) {
                if (imageView != null) {
                    int i3 = (z13 || !z11 || this.K1.getVisibility() == 0) ? 8 : 0;
                    if (i3 != imageView.getVisibility()) {
                        imageView.setVisibility(i3);
                        return;
                    }
                    return;
                }
                return;
            }
            this.K1.setTag(z14 ? 1 : null);
        } else if (imageView != null) {
            int i10 = (z13 || !z11) ? 8 : 0;
            if (i10 != imageView.getVisibility()) {
                imageView.setVisibility(i10);
            }
        }
        AnimatorSet animatorSet = this.N1;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.N1 = null;
        }
        if (z10 && !z11) {
            ge geVar2 = this.K1;
            if (geVar2 != null) {
                if (z14) {
                    geVar2.setVisibility(0);
                }
                this.K1.setPivotX(org.telegram.messenger.g0.L(24.0f));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.N1 = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.K1, (Property<ge, Float>) View.ALPHA, z14 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.K1, (Property<ge, Float>) View.SCALE_X, z14 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(this.K1, (Property<ge, Float>) View.SCALE_Y, z14 ? 1.0f : 0.1f));
                this.N1.setDuration(180L);
                this.N1.addListener(new je(this, z14, 2));
                this.N1.start();
                return;
            }
            return;
        }
        ge geVar3 = this.K1;
        if (geVar3 == null) {
            if (imageView != null) {
                imageView.setVisibility(z11 ? 0 : 8);
                return;
            }
            return;
        }
        geVar3.setVisibility(z14 ? 0 : 8);
        this.K1.setAlpha(z14 ? 1.0f : 0.0f);
        this.K1.setScaleX(z14 ? 1.0f : 0.1f);
        this.K1.setScaleY(z14 ? 1.0f : 0.1f);
        if (imageView != null) {
            imageView.setVisibility((!z11 || this.K1.getVisibility() == 0) ? 8 : 0);
        }
        this.K1.setTranslationX(0.0f);
    }

    public final void Q() {
        kf kfVar = this.V0;
        if (kfVar != null && kfVar.d1 != org.telegram.messenger.h10.t0) {
            this.o1.removeView(kfVar);
            this.V0 = null;
        }
        if (this.V0 != null) {
            return;
        }
        kf kfVar2 = new kf(this, this.Q2, this.J2, getContext(), this.e2, this.n1, this.z4, this.X3, this.U0, this.i5 != null);
        this.V0 = kfVar2;
        kfVar2.w0 = true;
        if (!this.z4) {
            kfVar2.updateColors();
        }
        this.V0.I(true, this.K2, this.L2, true);
        this.V0.setVisibility(8);
        this.V0.setShowing(false);
        if (this.i5 != null) {
            kf kfVar3 = this.V0;
            kfVar3.x0 = false;
            kfVar3.setShouldDrawBackground(false);
            this.V0.W0 = true;
        }
        this.V0.setDelegate(new nf(this));
        this.V0.setDragListener(new cg.v0(this));
        kf kfVar4 = this.V0;
        if (kfVar4 != null) {
            kfVar4.K(-this.R2, !this.A0, !this.b);
        }
        r();
        A();
    }

    public final void Q0(SpannableStringBuilder spannableStringBuilder, boolean z10, int i3, int i10) {
        if (this.F0 == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        org.telegram.messenger.i6.m(spannableStringBuilder2, this.F0.getPaint().getFontMetricsInt(), false, null, 0);
        p5[] p5VarArr = (p5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), p5.class);
        if (p5VarArr != null) {
            for (p5 p5Var : p5VarArr) {
                p5Var.applyFontMetrics(this.F0.getPaint().getFontMetricsInt(), g5.f());
            }
        }
        xg0.a(spannableStringBuilder2);
        J();
        setFieldText(spannableStringBuilder2);
        S0(z10, i3, i10, 0L, true);
    }

    public void Q1(boolean z10) {
        R1(false, z10);
    }

    public final void R() {
        if (this.T0 != null) {
            return;
        }
        ie ieVar = new ie(this, getContext(), 2);
        this.T0 = ieVar;
        ieVar.setScaleType(ImageView.ScaleType.CENTER);
        ie ieVar2 = this.T0;
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(f0(org.telegram.ui.ActionBar.k6.Kl), false);
        this.G3 = animatedArrowDrawable;
        ieVar2.setImageDrawable(animatedArrowDrawable);
        this.T0.setVisibility(8);
        this.T0.setScaleX(0.1f);
        this.T0.setScaleY(0.1f);
        this.T0.setAlpha(0.0f);
        ie ieVar3 = this.T0;
        int i3 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.ActionBar.r6.R(ieVar3, org.telegram.ui.ActionBar.k6.h0(f0(i3), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i3), this.X3);
        this.B1.addView(this.T0, b8.mf.e(44, 44, 85));
        this.T0.setOnClickListener(new ad(this, 5));
        this.T0.setContentDescription(org.telegram.messenger.bd.M0(2131754883, "AccDescrExpandPanel"));
    }

    public boolean R0() {
        boolean z10 = this.E1;
        org.telegram.ui.ActionBar.e6 e6Var = this.X3;
        if (z10 && !org.telegram.messenger.h10.i(this.R).q()) {
            mi.c2.u0(getContext(), new yc(this, 21), new yc(this, 22), e6Var);
            return true;
        }
        if (!c()) {
            return S0(true, 0, 0, 0L, true);
        }
        t4.L(this.P2, this.Q2.a(), new xd(this, 2), e6Var);
        return true;
    }

    public final void R1(boolean z10, boolean z11) {
        TLRPC.Chat chat;
        TLRPC.Peer peer;
        float f10;
        float f11;
        fn0 fn0Var;
        fn0 fn0Var2;
        sd sdVar;
        if (this.a3 == null) {
            return;
        }
        S();
        if (this.q5) {
            peer = this.a3.t();
            chat = null;
        } else {
            TLRPC.Chat M0 = org.telegram.messenger.hp.s1(this.R).M0(Long.valueOf(-this.R2));
            TLRPC.ChatFull N0 = org.telegram.messenger.hp.s1(this.R).N0(-this.R2);
            TLRPC.Peer peer2 = N0 != null ? N0.default_send_as : null;
            chat = M0;
            peer = peer2;
        }
        if (peer == null && this.a3.M() != null && !this.a3.M().peers.isEmpty()) {
            peer = this.a3.M().peers.get(0).peer;
        }
        org.telegram.ui.wm wmVar = this.Q2;
        boolean z12 = (z10 || peer == null || (this.a3.M() != null && this.a3.M().peers.size() <= 1) || p0() || u0() || (((sdVar = this.f1) != null && sdVar.getVisibility() == 0) || ((!this.q5 && ((org.telegram.messenger.t3.V(chat) && !org.telegram.messenger.t3.k(chat)) || org.telegram.messenger.t3.p0(chat))) || (wmVar != null && wmVar.g4 == 9)))) ? false : true;
        if (z12) {
            X();
        }
        if (peer != null) {
            if (peer.channel_id != 0) {
                TLRPC.Chat M02 = org.telegram.messenger.hp.s1(this.R).M0(Long.valueOf(peer.channel_id));
                if (M02 != null && (fn0Var2 = this.q0) != null) {
                    fn0Var2.setAvatar(M02);
                    this.q0.setContentDescription(org.telegram.messenger.bd.a0(null, null, 2131754776, M02.title));
                }
            } else {
                TLRPC.User a22 = org.telegram.messenger.hp.s1(this.R).a2(Long.valueOf(peer.user_id));
                if (a22 != null && (fn0Var = this.q0) != null) {
                    fn0Var.setAvatar(a22);
                    this.q0.setContentDescription(org.telegram.messenger.bd.a0(null, null, 2131754776, org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name)));
                }
            }
        }
        fn0 fn0Var3 = this.q0;
        boolean z13 = fn0Var3 != null && fn0Var3.getVisibility() == 0;
        int L = org.telegram.messenger.g0.L(2.0f);
        float f12 = z12 ? 0.0f : 1.0f;
        float f13 = z12 ? 1.0f : 0.0f;
        fn0 fn0Var4 = this.q0;
        if (fn0Var4 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fn0Var4.getLayoutParams();
            f11 = z12 ? ((-this.q0.getLayoutParams().width) - marginLayoutParams.leftMargin) - L : 0.0f;
            f10 = z12 ? 0.0f : ((-this.q0.getLayoutParams().width) - marginLayoutParams.leftMargin) - L;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        if (z13 == z12) {
            return;
        }
        fn0 fn0Var5 = this.q0;
        ValueAnimator valueAnimator = fn0Var5 == null ? null : (ValueAnimator) fn0Var5.getTag();
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.q0.setTag(null);
        }
        if ((this.q5 || (wmVar != null && wmVar.Z8() == 0 && wmVar.f6)) && z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            fn0 fn0Var6 = this.q0;
            if (fn0Var6 != null) {
                fn0Var6.setTranslationX(f11);
            }
            this.H = f11;
            K1();
            float f14 = f10;
            float f15 = f13;
            float f16 = f11;
            duration.addUpdateListener(new i5(this, f16, f14, f12, f15, 1));
            duration.addListener(new ff(this, z12, f12, f16, f15, f14));
            duration.start();
            fn0 fn0Var7 = this.q0;
            if (fn0Var7 != null) {
                fn0Var7.setTag(duration);
                return;
            }
            return;
        }
        float f17 = f10;
        float f18 = f13;
        boolean z14 = z12;
        if (z14) {
            X();
        }
        fn0 fn0Var8 = this.q0;
        if (fn0Var8 != null) {
            fn0Var8.setVisibility(z14 ? 0 : 8);
            this.q0.setTranslationX(f17);
        }
        float f19 = z14 ? f17 : 0.0f;
        this.R0.setTranslationX(f19);
        this.H = f19;
        K1();
        fn0 fn0Var9 = this.q0;
        if (fn0Var9 != null) {
            fn0Var9.setAlpha(f18);
            this.q0.setTag(null);
        }
    }

    public final void S() {
        if (this.F0 != null) {
            return;
        }
        Context context = getContext();
        org.telegram.ui.ActionBar.e6 e6Var = this.X3;
        ve veVar = new ve(this, context, e6Var);
        this.F0 = veVar;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            veVar.setFallbackLineSpacing(false);
        }
        if (i3 >= 35) {
            this.F0.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        this.F0.setDelegate(new hd(this));
        org.telegram.ui.wm wmVar = this.Q2;
        if (wmVar == null || wmVar.getParentLayout() == null || !((ActionBarLayout) wmVar.getParentLayout()).b) {
            this.F0.setWindowView(this.P2.getWindow().getDecorView());
        } else {
            this.F0.setWindowView(wmVar.getParentLayout().getWindow().getDecorView());
        }
        TLRPC.EncryptedChat encryptedChat = wmVar != null ? wmVar.h : null;
        this.F0.setAllowTextEntitiesIntersection(z1());
        String string = Settings.Secure.getString(getContext().getContentResolver(), "default_input_method");
        int i10 = ((string == null || !string.startsWith("com.samsung")) && encryptedChat != null) ? 285212672 : TLObject.FLAG_28;
        this.F0.setIncludeFontPadding(false);
        this.F0.setImeOptions(i10);
        ve veVar2 = this.F0;
        int inputType = veVar2.getInputType() | 147456;
        this.a = inputType;
        veVar2.setInputType(inputType);
        H1(false);
        this.F0.setSingleLine(false);
        this.F0.setMaxLines(6);
        this.F0.setTextSize(1, 18.0f);
        this.F0.setGravity(80);
        this.F0.setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(10.0f));
        this.F0.setBackgroundDrawable(null);
        org.telegram.ui.ActionBar.r6.V(this.F0, org.telegram.ui.ActionBar.k6.Ie, e6Var);
        org.telegram.ui.ActionBar.r6.H(this.F0, org.telegram.ui.ActionBar.k6.Vc, e6Var);
        org.telegram.ui.ActionBar.r6.D(this.F0, org.telegram.ui.ActionBar.k6.ig, e6Var);
        ve veVar3 = this.F0;
        int i11 = org.telegram.ui.ActionBar.k6.Je;
        org.telegram.ui.ActionBar.r6.B(veVar3, i11, e6Var);
        org.telegram.ui.ActionBar.r6.E(this.F0, i11, e6Var);
        org.telegram.ui.ActionBar.r6.w(this.F0, org.telegram.ui.ActionBar.k6.Ke, e6Var);
        org.telegram.ui.ActionBar.r6.z(this.F0, org.telegram.ui.ActionBar.k6.jg, e6Var);
        ve veVar4 = this.F0;
        boolean z10 = this.Y3;
        FrameLayout.LayoutParams d = b8.mf.d(-1, -2.0f, 80, 52.0f, 0.0f, z10 ? 50.0f : 2.0f, 1.5f);
        sd sdVar = this.z1;
        sdVar.addView(veVar4, 1, d);
        org.telegram.messenger.st stVar = new org.telegram.messenger.st(this.R, getContext(), e6Var);
        this.D1 = stVar;
        stVar.setAllowActions(false);
        this.D1.setMaxHeight(org.telegram.messenger.g0.L(150.0f));
        this.D1.setMinHeight(org.telegram.messenger.g0.L(88.0f));
        this.D1.setVisibility(8);
        this.D1.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(10.0f));
        this.D1.setOnClickListener(new ad(this, 10));
        sdVar.addView(this.D1, 2, b8.mf.d(-1, -2.0f, 80, 44.0f, 0.0f, (z10 ? 50 : 2) - 8, 1.5f));
        this.F0.setOnKeyListener(new we(this));
        this.F0.setOnEditorActionListener(new m.r2(this, 3));
        this.F0.addTextChangedListener(new xe(this));
        this.F0.addTextChangedListener(new org.telegram.ui.Cells.j3());
        this.F0.setEnabled(this.J4);
        ArrayList arrayList = this.I4;
        if (arrayList != null) {
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                this.F0.addTextChangedListener((TextWatcher) obj);
            }
            this.I4.clear();
        }
        H1(false);
        Q1(wmVar != null && wmVar.getFragmentBeginToShow());
        if (wmVar != null) {
            wmVar.M6(false, false);
        }
        I1(this.Q4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x066f A[LOOP:1: B:196:0x0401->B:255:0x066f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x061f A[EDGE_INSN: B:256:0x061f->B:257:0x061f BREAK  A[LOOP:1: B:196:0x0401->B:255:0x066f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0566  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [org.telegram.messenger.zi, org.telegram.tgnet.TLRPC$WebPage] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean S0(final boolean z10, final int i3, final int i10, long j10, boolean z11) {
        ChatActivityEnterView chatActivityEnterView;
        ChatActivityEnterView chatActivityEnterView2;
        boolean z12;
        int i11;
        int i12;
        int i13;
        int i14;
        CharSequence charSequence;
        CharSequence charSequence2;
        int i15;
        CharSequence charSequence3;
        org.telegram.messenger.vi viVar;
        org.telegram.messenger.zi threadMessage;
        String str;
        int i16;
        CharSequence charSequence4;
        CharSequence charSequence5;
        org.telegram.ui.wm wmVar;
        ?? r32;
        TLRPC.WebPage webPage;
        boolean z13;
        org.telegram.messenger.dj djVar;
        org.telegram.messenger.dj djVar2;
        ChatActivityEnterView chatActivityEnterView3;
        TLRPC.Chat chat;
        org.telegram.messenger.dj djVar3;
        org.telegram.messenger.zi ziVar;
        uf ufVar;
        TLRPC.Chat chat2;
        TL_iv.RichMessage richMessage;
        ChatActivityEnterView chatActivityEnterView4;
        kf kfVar;
        int i17 = 1;
        ?? r02 = z11 && !this.n5.f;
        if (r02 == true) {
            boolean a02 = t4.a0(this.R, this.R2, getMessagesCount(), new org.telegram.messenger.u10() { // from class: org.telegram.ui.Components.od
                @Override // org.telegram.messenger.u10
                public final void a(Object obj) {
                    int i18 = ChatActivityEnterView.t5;
                    ChatActivityEnterView chatActivityEnterView5 = ChatActivityEnterView.this;
                    chatActivityEnterView5.getClass();
                    chatActivityEnterView5.S0(z10, i3, i10, ((Long) obj).longValue(), false);
                }
            }, j10);
            if (a02 && this.t4) {
                if (this.d1) {
                    if (!this.a3.V0()) {
                        SlideTextView slideTextView = this.l1;
                        if (slideTextView != null) {
                            slideTextView.setEnabled(false);
                        }
                        this.a3.Z0();
                        return a02;
                    }
                } else if (!MediaController.B().K()) {
                    if (this.t4) {
                        this.K3 = true;
                    }
                    MediaController.B().D0(this.P);
                    this.a3.M0(0);
                    SlideTextView slideTextView2 = this.l1;
                    if (slideTextView2 != null) {
                        slideTextView2.setEnabled(false);
                    }
                }
            }
            return a02;
        }
        if (this.H0 != Integer.MAX_VALUE || c()) {
            org.telegram.ui.wm wmVar2 = this.Q2;
            if (wmVar2 != null) {
                TLRPC.Chat chat3 = wmVar2.e;
                if (wmVar2.j() != null || ((org.telegram.messenger.t3.T(chat3) && chat3.megagroup) || !org.telegram.messenger.t3.T(chat3))) {
                    org.telegram.messenger.hp.s1(this.R).d7.edit().putBoolean("silent_" + this.R2, !z10).commit();
                }
            }
            if (this.A3) {
                m1(false, true, false, true);
                if (this.S1 != 0 && (kfVar = this.V0) != null) {
                    kfVar.t(false);
                    this.V0.A();
                }
            }
            if (r02 == true) {
                chatActivityEnterView = this;
                if (chatActivityEnterView.q1(new org.telegram.messenger.yk(this, z10, i3, i10, j10))) {
                    chatActivityEnterView2 = chatActivityEnterView;
                }
            } else {
                chatActivityEnterView = this;
            }
            chatActivityEnterView.F4 = true;
            org.telegram.messenger.b20 b20Var = chatActivityEnterView.f3;
            ee eeVar = chatActivityEnterView.K0;
            if (b20Var != null) {
                chatActivityEnterView.a3.d2(4, i3, chatActivityEnterView.P ? Integer.MAX_VALUE : 0, chatActivityEnterView.T4, j10, z10);
                chatActivityEnterView.T4 = 0L;
                eeVar.setEffect(0L);
                chatActivityEnterView.l0(true);
                chatActivityEnterView.E(true);
                org.telegram.messenger.g0.i3(new yc(chatActivityEnterView, i17), 100L);
                chatActivityEnterView.j1 = 0L;
                return false;
            }
            if (chatActivityEnterView.c3 != null) {
                org.telegram.messenger.zi ziVar2 = MediaController.B().v0;
                if (ziVar2 != null && ziVar2 == chatActivityEnterView.e3) {
                    MediaController.B().q(true, true, false, false);
                }
                MediaController.B().n(false);
                org.telegram.messenger.li.b0(chatActivityEnterView.R).B1(chatActivityEnterView.R2, (wmVar2 == null || !wmVar2.w4) ? 0L : wmVar2.b(), null);
                mi0 mi0Var = chatActivityEnterView.i1;
                if (mi0Var != null && (mi0Var.s > 0.0f || mi0Var.w < 1.0f)) {
                    mi0Var.setPlaying(false);
                    String s6 = a1.g.s(new StringBuilder(), chatActivityEnterView.d3, ".ogg");
                    if (MediaController.cropOpusFile(chatActivityEnterView.d3, s6, chatActivityEnterView.i1.getAudioLeftMs(), chatActivityEnterView.i1.getAudioRightMs())) {
                        try {
                            new File(chatActivityEnterView.d3).delete();
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        try {
                            new File(s6).renameTo(new File(chatActivityEnterView.d3));
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        int i18 = 0;
                        while (true) {
                            if (i18 >= chatActivityEnterView.c3.attributes.size()) {
                                break;
                            }
                            TLRPC.DocumentAttribute documentAttribute = chatActivityEnterView.c3.attributes.get(i18);
                            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                documentAttribute.waveform = MediaController.getWaveform(chatActivityEnterView.d3);
                                documentAttribute.duration = chatActivityEnterView.i1.getNewDuration();
                                break;
                            }
                            i18++;
                        }
                    }
                }
                org.telegram.messenger.wy f10 = org.telegram.messenger.wy.f(chatActivityEnterView.c3, null, chatActivityEnterView.d3, chatActivityEnterView.R2, chatActivityEnterView.U2, chatActivityEnterView.getThreadMessage(), null, null, null, null, z10, i3, 0, chatActivityEnterView.P ? Integer.MAX_VALUE : 0, null, null, false);
                f10.K = wmVar2 != null ? wmVar2.W8() : null;
                f10.O = this.T4;
                f10.Q = j10;
                f10.R = getSendMonoForumPeerId();
                f10.T = getSendMessageSuggestionParams();
                this.T4 = 0L;
                eeVar.setEffect(0L);
                if (!this.a3.k1()) {
                    org.telegram.messenger.vi viVar2 = new org.telegram.messenger.vi();
                    viVar2.h = System.currentTimeMillis() - this.N0 < 200;
                    f10.E = viVar2;
                }
                p(f10);
                org.telegram.messenger.yy.C(this.R).r0(f10);
                uf ufVar2 = this.a3;
                if (ufVar2 != null) {
                    chatActivityEnterView4 = this;
                    ufVar2.G(null, z10, i3, i10, j10);
                } else {
                    chatActivityEnterView4 = this;
                }
                chatActivityEnterView4.l0(true);
                chatActivityEnterView4.E(true);
                org.telegram.messenger.g0.i3(new yc(chatActivityEnterView4, 2), 100L);
                chatActivityEnterView4.j1 = 0L;
            } else {
                ChatActivityEnterView chatActivityEnterView5 = chatActivityEnterView;
                long j11 = 200;
                String str2 = "";
                if (!chatActivityEnterView5.E1 || (richMessage = chatActivityEnterView5.F1) == null) {
                    org.telegram.ui.wm wmVar3 = wmVar2;
                    int i19 = 1;
                    ee eeVar2 = eeVar;
                    chatActivityEnterView2 = chatActivityEnterView5;
                    ve veVar = chatActivityEnterView2.F0;
                    CharSequence textToUse = veVar == null ? "" : veVar.getTextToUse();
                    if (wmVar3 != null && (chat2 = wmVar3.e) != null && chat2.slowmode_enabled && !org.telegram.messenger.t3.N(chat2)) {
                        int length = textToUse.length();
                        int u12 = org.telegram.messenger.hp.s1(chatActivityEnterView2.S.a).u1();
                        org.telegram.ui.ActionBar.e6 e6Var = chatActivityEnterView2.X3;
                        if (length > u12) {
                            t4.t0(wmVar3, org.telegram.messenger.bd.M0(2131745320, "Slowmode"), org.telegram.messenger.bd.M0(2131745311, "SlowmodeSendErrorTooLong"), e6Var);
                        } else if (chatActivityEnterView2.I2 && textToUse.length() > 0) {
                            t4.t0(wmVar3, org.telegram.messenger.bd.M0(2131745320, "Slowmode"), org.telegram.messenger.bd.M0(2131745312, "SlowmodeSendError"), e6Var);
                        }
                    }
                    if (!C(chatActivityEnterView2.R, chatActivityEnterView2.R2, wmVar3, textToUse)) {
                        org.telegram.ui.mm mmVar = chatActivityEnterView2.W2;
                        if (mmVar == null || wmVar3 == null || !mmVar.f) {
                            int[] iArr = new int[1];
                            org.telegram.messenger.i6.j(textToUse, iArr);
                            ?? r28 = 0;
                            ?? r17 = iArr[0] > 0;
                            CharSequence n12 = r17 == false ? org.telegram.messenger.g0.n1(textToUse) : textToUse;
                            boolean z14 = chatActivityEnterView2.z1();
                            int u13 = org.telegram.messenger.hp.s1(chatActivityEnterView2.S.a).u1();
                            if (n12.length() != 0) {
                                if (chatActivityEnterView2.a3 != null && wmVar3 != null) {
                                    if ((i3 != 0) == wmVar3.c()) {
                                        chatActivityEnterView2.a3.w0();
                                    }
                                }
                                int i20 = 0;
                                while (true) {
                                    int i21 = i20 + u13;
                                    if (n12.length() > i21) {
                                        int i22 = i21 - 1;
                                        i12 = -1;
                                        i13 = -1;
                                        i14 = -1;
                                        for (int i23 = r28; i22 > i20 && i23 < 300; i23++) {
                                            char charAt = n12.charAt(i22);
                                            char charAt2 = i22 > 0 ? n12.charAt(i22 - 1) : ' ';
                                            if (charAt == '\n' && charAt2 == '\n') {
                                                i11 = i22;
                                                break;
                                            }
                                            if (charAt == '\n') {
                                                i14 = i22;
                                            } else if (i12 < 0 && Character.isWhitespace(charAt) && charAt2 == '.') {
                                                i12 = i22;
                                            } else if (i13 < 0 && Character.isWhitespace(charAt)) {
                                                i13 = i22;
                                            }
                                            i22--;
                                        }
                                        i11 = -1;
                                    } else {
                                        i11 = -1;
                                        i12 = -1;
                                        i13 = -1;
                                        i14 = -1;
                                    }
                                    int min = Math.min(i21, n12.length());
                                    if (i11 > 0) {
                                        min = i11;
                                    } else if (i14 > 0) {
                                        min = i14;
                                    } else if (i12 > 0) {
                                        min = i12;
                                    } else if (i13 > 0) {
                                        min = i13;
                                    }
                                    CharSequence subSequence = n12.subSequence(i20, min);
                                    if (r17 == false) {
                                        subSequence = org.telegram.messenger.g0.n1(subSequence);
                                    }
                                    CharSequence[] charSequenceArr = new CharSequence[i19];
                                    charSequenceArr[r28] = subSequence;
                                    ArrayList W = org.telegram.messenger.li.b0(chatActivityEnterView2.R).W(charSequenceArr, z14, i19);
                                    if (chatActivityEnterView2.a3.k1()) {
                                        boolean z15 = i19;
                                        charSequence = n12;
                                        if (chatActivityEnterView2.M0 != null) {
                                            viVar = new org.telegram.messenger.vi();
                                            charSequence2 = textToUse;
                                            i15 = min;
                                            viVar.h = System.currentTimeMillis() - chatActivityEnterView2.N0 < j11 ? z15 : r28;
                                        } else {
                                            charSequence2 = textToUse;
                                            i15 = min;
                                            charSequence3 = charSequence;
                                            viVar = null;
                                            boolean h = org.telegram.messenger.yy.h(charSequence3);
                                            threadMessage = chatActivityEnterView2.getThreadMessage();
                                            if (threadMessage == null && (ziVar = chatActivityEnterView2.V2) != null) {
                                                threadMessage = ziVar;
                                            }
                                            str = str2;
                                            ee eeVar3 = eeVar2;
                                            i16 = i15;
                                            charSequence4 = charSequence2;
                                            boolean z16 = z14;
                                            charSequence5 = charSequence3;
                                            wmVar = wmVar3;
                                            org.telegram.messenger.wy b10 = org.telegram.messenger.wy.b(charSequenceArr[r28].toString(), chatActivityEnterView2.R2, chatActivityEnterView2.U2, threadMessage, chatActivityEnterView2.Y2, chatActivityEnterView2.Z2, W, null, null, z10, i3, i10, viVar, h);
                                            b10.K = wmVar == null ? wmVar.W8() : null;
                                            b10.O = this.T4;
                                            b10.Q = j10;
                                            b10.R = getSendMonoForumPeerId();
                                            b10.T = getSendMessageSuggestionParams();
                                            this.T4 = 0L;
                                            eeVar3.setEffect(0L);
                                            p(b10);
                                            b10.L = wmVar == null && (djVar3 = wmVar.w5) != null && djVar3.r;
                                            if (wmVar != null || (chat = wmVar.e) == null || org.telegram.messenger.t3.m(chat)) {
                                                r32 = 0;
                                                r32 = 0;
                                                r32 = 0;
                                                z12 = false;
                                                webPage = this.Y2;
                                                if (webPage instanceof TLRPC.TL_webPagePending) {
                                                    z13 = true;
                                                    if (webPage != null) {
                                                        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                                                        b10.n = tL_messageMediaWebPage;
                                                        tL_messageMediaWebPage.webpage = this.Y2;
                                                        tL_messageMediaWebPage.force_large_media = (wmVar == null || (djVar2 = wmVar.w5) == null || djVar2.q) ? false : true;
                                                        tL_messageMediaWebPage.force_small_media = (wmVar == null || (djVar = wmVar.w5) == null || !djVar.q) ? false : true;
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
                                            if (wmVar != null) {
                                                wmVar.G5 = r32;
                                                wmVar.X5 = r32;
                                                org.telegram.messenger.dj djVar4 = wmVar.w5;
                                                if (djVar4 != null) {
                                                    djVar4.e(this.R, null, "", null, null, null);
                                                }
                                                this.Y2 = r32;
                                                this.Z2 = z13;
                                                wmVar.z8();
                                            }
                                            org.telegram.messenger.yy.C(this.R).r0(b10);
                                            i20 = i16 + 1;
                                            if (i16 != charSequence5.length()) {
                                                break;
                                            }
                                            eeVar2 = eeVar3;
                                            i19 = z13;
                                            r28 = z12;
                                            wmVar3 = wmVar;
                                            textToUse = charSequence4;
                                            z14 = z16;
                                            n12 = charSequence5;
                                            str2 = str;
                                            j11 = 200;
                                            chatActivityEnterView2 = this;
                                        }
                                    } else {
                                        org.telegram.messenger.vi viVar3 = new org.telegram.messenger.vi();
                                        ?? r27 = i19;
                                        charSequence = n12;
                                        viVar3.h = System.currentTimeMillis() - chatActivityEnterView2.N0 < j11 ? r27 == true ? 1 : 0 : r28;
                                        viVar3.c = org.telegram.messenger.g0.L(22.0f);
                                        ve veVar2 = chatActivityEnterView2.F0;
                                        if (veVar2 != null) {
                                            veVar2.getLocationInWindow(chatActivityEnterView2.O2);
                                            viVar3.a = org.telegram.messenger.g0.L(11.0f) + r12[r28];
                                            viVar3.b = org.telegram.messenger.g0.L(19.0f) + r12[r27 == true ? 1 : 0];
                                        } else {
                                            viVar3.a = org.telegram.messenger.g0.L(55.0f);
                                            viVar3.b = org.telegram.messenger.g0.q.y - org.telegram.messenger.g0.L(19.0f);
                                        }
                                        charSequence2 = textToUse;
                                        i15 = min;
                                        viVar = viVar3;
                                    }
                                    charSequence3 = charSequence;
                                    boolean h7 = org.telegram.messenger.yy.h(charSequence3);
                                    threadMessage = chatActivityEnterView2.getThreadMessage();
                                    if (threadMessage == null) {
                                        threadMessage = ziVar;
                                    }
                                    str = str2;
                                    ee eeVar32 = eeVar2;
                                    i16 = i15;
                                    charSequence4 = charSequence2;
                                    boolean z162 = z14;
                                    charSequence5 = charSequence3;
                                    wmVar = wmVar3;
                                    org.telegram.messenger.wy b102 = org.telegram.messenger.wy.b(charSequenceArr[r28].toString(), chatActivityEnterView2.R2, chatActivityEnterView2.U2, threadMessage, chatActivityEnterView2.Y2, chatActivityEnterView2.Z2, W, null, null, z10, i3, i10, viVar, h7);
                                    b102.K = wmVar == null ? wmVar.W8() : null;
                                    b102.O = this.T4;
                                    b102.Q = j10;
                                    b102.R = getSendMonoForumPeerId();
                                    b102.T = getSendMessageSuggestionParams();
                                    this.T4 = 0L;
                                    eeVar32.setEffect(0L);
                                    p(b102);
                                    b102.L = wmVar == null && (djVar3 = wmVar.w5) != null && djVar3.r;
                                    if (wmVar != null) {
                                    }
                                    r32 = 0;
                                    r32 = 0;
                                    r32 = 0;
                                    z12 = false;
                                    webPage = this.Y2;
                                    if (webPage instanceof TLRPC.TL_webPagePending) {
                                    }
                                    if (wmVar != null) {
                                    }
                                    org.telegram.messenger.yy.C(this.R).r0(b102);
                                    i20 = i16 + 1;
                                    if (i16 != charSequence5.length()) {
                                    }
                                }
                                if (this.a3.k1() || (!(i3 == 0 || c()) || c())) {
                                    chatActivityEnterView3 = this;
                                    ve veVar3 = chatActivityEnterView3.F0;
                                    if (veVar3 != null) {
                                        veVar3.setText(str);
                                    }
                                    uf ufVar3 = chatActivityEnterView3.a3;
                                    if (ufVar3 != null) {
                                        ufVar3.G(charSequence4, z10, i3, i10, j10);
                                    }
                                } else {
                                    this.h0 = z12;
                                    org.telegram.messenger.ip ipVar = new org.telegram.messenger.ip(this, charSequence4, z10, i3, i10, j10);
                                    chatActivityEnterView3 = this;
                                    chatActivityEnterView3.g0 = ipVar;
                                    org.telegram.messenger.g0.i3(ipVar, 200L);
                                }
                                chatActivityEnterView3.D2 = 0L;
                                chatActivityEnterView3.S1();
                                return z12;
                            }
                            z12 = false;
                        } else {
                            wmVar3.uc();
                            z12 = false;
                        }
                        chatActivityEnterView3 = chatActivityEnterView2;
                        if (chatActivityEnterView3.I2 && (ufVar = chatActivityEnterView3.a3) != null) {
                            ufVar.G(null, z10, i3, i10, j10);
                        }
                        chatActivityEnterView3.S1();
                        return z12;
                    }
                } else {
                    org.telegram.messenger.yy.R(chatActivityEnterView5.S, richMessage.blocks, richMessage.photos, richMessage.documents, null, chatActivityEnterView5.R2, chatActivityEnterView5.U2, chatActivityEnterView5.getThreadMessage(), chatActivityEnterView5.W2, z10, i3, i10, wmVar2 != null ? wmVar2.W8() : null, chatActivityEnterView5.T4, chatActivityEnterView5.getSendMonoForumPeerId(), j10);
                    chatActivityEnterView2 = this;
                    chatActivityEnterView2.T4 = 0L;
                    eeVar.setEffect(0L);
                    chatActivityEnterView2.F0.setText("");
                    chatActivityEnterView2.J();
                    uf ufVar4 = chatActivityEnterView2.a3;
                    if (ufVar4 != null) {
                        ufVar4.G(null, z10, i3, i10, j10);
                    }
                    chatActivityEnterView2.E(true);
                }
            }
        } else {
            uf ufVar5 = this.a3;
            if (ufVar5 != null) {
                ufVar5.I0();
                return false;
            }
            chatActivityEnterView2 = this;
        }
        return false;
    }

    public final void S1() {
        int b10;
        long starsPrice = getStarsPrice();
        if (starsPrice > 0) {
            starsPrice *= getMessagesCount();
        }
        if (this.v4 != starsPrice) {
            View sendButtonInternal = getSendButtonInternal();
            this.v4 = starsPrice;
            View sendButtonInternal2 = getSendButtonInternal();
            if (sendButtonInternal != sendButtonInternal2) {
                sendButtonInternal2.setVisibility(sendButtonInternal.getVisibility());
                sendButtonInternal2.setAlpha(sendButtonInternal.getAlpha());
                sendButtonInternal2.setScaleX(sendButtonInternal.getScaleX());
                sendButtonInternal2.setScaleY(sendButtonInternal.getScaleY());
                sendButtonInternal.setVisibility(8);
            }
            this.K0.i(1, starsPrice, true);
            I1(this.Q4);
        }
        if (this.q5) {
            O();
            if (q()) {
                int[] iArr = org.telegram.messenger.hp.s1(this.R).X6;
                b10 = (iArr == null || iArr.length <= 2) ? 400 : iArr[2];
            } else {
                b10 = ei.u.b(this.R, (int) starsPrice, 1);
            }
            if (this.d0 != b10) {
                this.d0 = b10;
                if (b10 > 0) {
                    int i3 = b10 - this.e0;
                    if (i3 <= (this.q5 ? 5 : 100)) {
                        if (i3 < -9999) {
                            i3 = -9999;
                        }
                        O();
                        NumberTextView numberTextView = this.c0;
                        numberTextView.a(i3, numberTextView.getVisibility() == 0);
                        if (this.c0.getVisibility() != 0) {
                            this.c0.setVisibility(0);
                            this.c0.setAlpha(0.0f);
                            this.c0.setScaleX(0.5f);
                            this.c0.setScaleY(0.5f);
                        }
                        this.c0.animate().setListener(null).cancel();
                        this.c0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                        this.c0.setTextColor(f0(i3 < 0 ? org.telegram.ui.ActionBar.k6.p7 : org.telegram.ui.ActionBar.k6.y6));
                        return;
                    }
                }
                NumberTextView numberTextView2 = this.c0;
                if (numberTextView2 != null) {
                    numberTextView2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new fe(this, 0));
                }
            }
        }
    }

    public final void T() {
        if (this.f1 != null) {
            return;
        }
        sd sdVar = new sd(this, getContext(), 3);
        this.f1 = sdVar;
        sdVar.setVisibility(this.c3 == null ? 8 : 0);
        this.f1.setFocusable(true);
        this.f1.setFocusableInTouchMode(true);
        this.f1.setClickable(true);
        this.z1.addView(this.f1, b8.mf.e(-1, 44, 80));
        fh0 fh0Var = new fh0(getContext());
        this.h1 = fh0Var;
        fh0Var.setScaleType(ImageView.ScaleType.CENTER);
        this.h1.f(R.raw.chat_audio_record_delete_2, 28, 28, null);
        this.h1.getAnimatedDrawable().p0 = true;
        N1();
        this.h1.setContentDescription(org.telegram.messenger.bd.M0(2131751599, "Delete"));
        fh0 fh0Var2 = this.h1;
        int i3 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(f0(i3), 1, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
        org.telegram.ui.ActionBar.e6 e6Var = this.X3;
        org.telegram.ui.ActionBar.r6.R(fh0Var2, h02, null, N, e6Var);
        this.f1.addView(this.h1, b8.mf.c(44.0f, 44));
        this.h1.setOnClickListener(new ad(this, 6));
        a61 a61Var = new a61(getContext());
        this.g1 = a61Var;
        a61Var.setVisibility(4);
        a61 a61Var2 = this.g1;
        a61Var2.T = !this.z4;
        a61Var2.setRoundFrames(true);
        this.g1.setDelegate(new ke(this));
        this.f1.addView(this.g1, b8.mf.d(-1, -1.0f, 19, 56.0f, 0.0f, 8.0f, 0.0f));
        Context context = getContext();
        y51 y51Var = new y51(context);
        TextPaint textPaint = new TextPaint(1);
        y51Var.d = textPaint;
        y51Var.e = -1L;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        y51Var.b = context.getDrawable(R.drawable.tooltip_arrow);
        y51Var.a = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(5.0f), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.eg, false));
        y51Var.b();
        y51Var.setTime(0);
        this.g1.setTimeHintView(y51Var);
        this.n1.addView(y51Var, b8.mf.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 52.0f));
        mi0 mi0Var = new mi0(getContext(), e6Var);
        this.i1 = mi0Var;
        this.f1.addView(mi0Var, b8.mf.d(-1, 32.0f, 19, 44.0f, 0.0f, 4.0f, 0.0f));
        I1(this.Q4);
    }

    public final void T0(boolean z10, boolean z11) {
        U0(z10, z11, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
    
        if (((java.lang.Integer) org.telegram.messenger.yy.C(r9.R).f.g(0, r9.R2)).intValue() > 0) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T1() {
        int i3;
        int currentTime = ConnectionsManager.getInstance(this.R).getCurrentTime();
        org.telegram.messenger.g0.r(this.I0);
        this.I0 = null;
        TLRPC.ChatFull chatFull = this.e2;
        if (chatFull != null && chatFull.slowmode_seconds != 0 && chatFull.slowmode_next_send_date <= currentTime) {
            boolean z10 = ((Integer) org.telegram.messenger.yy.C(this.R).h.g(0, this.R2)).intValue() > 0;
            if (!z10) {
            }
            if (!org.telegram.messenger.t3.N(org.telegram.messenger.hp.s1(this.S.a).M0(Long.valueOf(this.e2.id))) && !org.telegram.messenger.t3.i0(this.e2)) {
                i3 = this.e2.slowmode_seconds;
                this.H0 = z10 ? ConnectionsManager.DEFAULT_DATACENTER_ID : 2147483646;
                if (this.H0 != 0 || i3 <= 0) {
                    this.H0 = 0;
                } else {
                    String h02 = org.telegram.messenger.g0.h0(Math.max(1, i3), false);
                    cg cgVar = this.G0;
                    ((org.telegram.ui.ActionBar.k5) cgVar.c).l(h02, false);
                    cgVar.invalidate();
                    uf ufVar = this.a3;
                    if (ufVar != null) {
                        ufVar.h1(cgVar, ((org.telegram.ui.ActionBar.k5) cgVar.c).getText(), false);
                    }
                    yc ycVar = new yc(this, 10);
                    this.I0 = ycVar;
                    org.telegram.messenger.g0.i3(ycVar, 100L);
                }
                if (c()) {
                    E(true);
                    return;
                }
                return;
            }
            i3 = 0;
            if (this.H0 != 0) {
            }
            this.H0 = 0;
            if (c()) {
            }
        }
        int i10 = this.H0;
        if (i10 >= 2147483646) {
            if (this.e2 != null) {
                org.telegram.messenger.hp.s1(this.S.a).V2(0, this.e2.id, true);
            }
            i3 = 0;
            if (this.H0 != 0) {
            }
            this.H0 = 0;
            if (c()) {
            }
        } else {
            i3 = i10 - currentTime;
            if (this.H0 != 0) {
            }
            this.H0 = 0;
            if (c()) {
            }
        }
    }

    public final void U() {
        yf yfVar = this.P1;
        qt0 qt0Var = this.n1;
        if (yfVar == null) {
            yf yfVar2 = new yf(this, getContext());
            this.P1 = yfVar2;
            yfVar2.setVisibility(8);
            qt0Var.addView(this.P1, b8.mf.e(-1, -2, 80));
        }
        if (this.O1 != null) {
            return;
        }
        RecordCircle recordCircle = new RecordCircle(getContext());
        this.O1 = recordCircle;
        recordCircle.setVisibility(8);
        qt0Var.addView(this.O1, b8.mf.e(-1, -2, 80));
    }

    public final void U0(boolean z10, boolean z11, boolean z12) {
        if ((this.K2 != z10 || this.L2 != z11) && this.V0 != null) {
            if (this.X0 && !z12) {
                this.H3 = true;
                j0(false);
            } else if (z12) {
                H0();
            }
        }
        this.J2 = true;
        this.K2 = z10;
        this.L2 = z11;
        kf kfVar = this.V0;
        if (kfVar != null) {
            kfVar.I(true, z10, z11, true);
        }
        c1(false, !this.k2);
    }

    public final void V() {
        if (this.e1 != null || getContext() == null) {
            return;
        }
        ai.d2 d2Var = new ai.d2(getContext(), 15);
        this.e1 = d2Var;
        d2Var.setClipChildren(false);
        this.e1.setVisibility(8);
        this.z1.addView(this.e1, b8.mf.c(44.0f, -1));
        this.e1.setOnTouchListener(new fi.a(12));
        ai.d2 d2Var2 = this.e1;
        SlideTextView slideTextView = new SlideTextView(getContext());
        this.l1 = slideTextView;
        d2Var2.addView(slideTextView, b8.mf.d(-1, -1.0f, 0, 45.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(0);
        this.d.setPadding(org.telegram.messenger.g0.L(13.0f), 0, 0, 0);
        this.d.setFocusable(false);
        LinearLayout linearLayout2 = this.d;
        ag agVar = new ag(this, getContext());
        this.m1 = agVar;
        linearLayout2.addView(agVar, b8.mf.t(28, 28, 16, 0, 0, 0, 0));
        LinearLayout linearLayout3 = this.d;
        dg dgVar = new dg(this, getContext());
        this.Z0 = dgVar;
        linearLayout3.addView(dgVar, b8.mf.t(-1, -1, 16, 6, 0, 0, 0));
        this.e1.addView(this.d, b8.mf.e(-1, -1, 16));
    }

    public final void V0() {
        gi.l3 l3Var = this.M;
        if (l3Var == null) {
            return;
        }
        l3Var.u(org.telegram.messenger.i6.o(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131743772, org.telegram.messenger.l10.j(this.Q2.j(), true))), this.M.getTextPaint().getFontMetricsInt(), 20, new yc(this, 27)));
        gi.l3 l3Var2 = this.M;
        l3Var2.h = gi.l3.a(l3Var2.getText(), this.M.getTextPaint());
    }

    public final void W() {
        if (this.K1 != null || this.Q2 == null) {
            return;
        }
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.input_calendar1).mutate();
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.input_calendar2).mutate();
        int i3 = org.telegram.ui.ActionBar.k6.Kl;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.e6 e6Var = this.X3;
        org.telegram.ui.ActionBar.r6.y(this, mutate, i3, e6Var, mode);
        org.telegram.ui.ActionBar.r6.y(this, mutate2, org.telegram.ui.ActionBar.k6.Xf, e6Var, mode);
        xp xpVar = new xp(mutate, mutate2);
        ge geVar = new ge(this, getContext());
        this.K1 = geVar;
        geVar.setImageDrawable(xpVar);
        this.K1.setVisibility(8);
        this.K1.setContentDescription(org.telegram.messenger.bd.M0(2131745858, null));
        this.K1.setScaleType(ImageView.ScaleType.CENTER);
        ge geVar2 = this.K1;
        int i10 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.ActionBar.r6.R(geVar2, org.telegram.ui.ActionBar.k6.h0(f0(i10), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i10), e6Var);
        this.z1.addView(this.K1, 2, b8.mf.e(44, 44, 85));
        this.K1.setOnClickListener(new ad(this, 2));
        this.K1.setTranslationX(0.0f);
    }

    public final void W0(a0.h hVar, boolean z10) {
        this.c5 = hVar;
        if (hVar.m() == 1 && ((TL_bots.BotInfo) hVar.n(0)).user_id == this.R2) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) hVar.n(0);
            TL_bots.BotMenuButton botMenuButton = botInfo.menu_button;
            if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                this.j0 = tL_botMenuButton.text;
                this.k0 = tL_botMenuButton.url;
                this.r5 = 3;
            } else if (botInfo.commands.isEmpty()) {
                this.r5 = 1;
            } else {
                this.r5 = 2;
            }
        } else {
            this.r5 = 1;
        }
        ii.z zVar = this.o0;
        if (zVar != null) {
            zVar.E(hVar);
        }
        C1(z10);
        B(z10);
    }

    public final void X() {
        if (this.q0 != null || getContext() == null) {
            return;
        }
        fn0 fn0Var = new fn0(getContext());
        ImageReceiver imageReceiver = new ImageReceiver(fn0Var);
        fn0Var.a = imageReceiver;
        fn0Var.b = new u8((org.telegram.ui.ActionBar.e6) null);
        fn0Var.d = new Paint(1);
        Paint paint = new Paint(1);
        fn0Var.e = paint;
        imageReceiver.J0(org.telegram.messenger.g0.L(28.0f));
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        fn0Var.updateColors();
        fn0Var.setContentDescription(org.telegram.messenger.bd.a0("AccDescrSendAsPeer", null, 2131754775, ""));
        this.q0 = fn0Var;
        fn0Var.setOnClickListener(new ad(this, 16));
        this.q0.setVisibility(8);
        this.z1.addView(this.q0, b8.mf.d(36, 36.0f, 83, 4.66f, 4.0f, 4.66f, 4.0f));
    }

    public final void X0(int i3, boolean z10, boolean z11) {
        this.p2 = i3;
        if (this.q2 == z10) {
            return;
        }
        this.q2 = z10;
        C1(z11);
    }

    @Override // qe.b
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        if (i3 == 0) {
            H();
            I();
        } else if (i3 == 1) {
            H();
            I();
        } else {
            if (i3 == 2) {
                kh.h hVar = this.J0;
                hVar.setAlpha(f10);
                hVar.setScaleX(org.telegram.messenger.g0.T1(0.5f, 1.0f, f10));
                hVar.setScaleY(org.telegram.messenger.g0.T1(0.5f, 1.0f, f10));
                hVar.setVisibility(f10 <= 0.0f ? 4 : 0);
            } else if (i3 == 3) {
                float T1 = org.telegram.messenger.g0.T1(1.0f, 0.79f, f10);
                sd sdVar = this.B1;
                sdVar.setScaleX(T1);
                sdVar.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.79f, f10));
                float T12 = org.telegram.messenger.g0.T1(0.79f, 1.0f, f10);
                ImageView imageView = this.C1;
                imageView.setScaleX(T12);
                imageView.setScaleY(org.telegram.messenger.g0.T1(0.79f, 1.0f, f10));
                imageView.setVisibility(f10 <= 0.0f ? 8 : 0);
                imageView.setAlpha(f10);
                ee eeVar = this.K0;
                if (eeVar != null) {
                    eeVar.setSameWidthFactor(f10);
                }
            }
        }
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0099, code lost:
    
        if (r7.getInt("answered_" + getTopicKeyString(), 0) != r5.f1()) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bd, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00bb, code lost:
    
        if (r7.getInt("closed_botkeyboard_" + getTopicKeyString(), 0) == r5.f1()) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y0(org.telegram.messenger.zi ziVar, boolean z10, boolean z11) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        ve veVar;
        org.telegram.messenger.zi ziVar2 = this.U2;
        if (ziVar2 != null && ziVar2 == this.n2 && ziVar2 != ziVar) {
            this.X2 = ziVar;
            return;
        }
        org.telegram.messenger.zi ziVar3 = this.n2;
        if (ziVar3 == null || ziVar3 != ziVar) {
            if (ziVar3 == null && ziVar == null) {
                return;
            }
            if (this.I1 == null) {
                gf gfVar = new gf(this, this.P2, this.X3);
                this.I1 = gfVar;
                gfVar.setVisibility(8);
                this.Y0 = false;
                this.I1.setDelegate(new hd(this));
                this.o1.addView(this.I1);
            }
            this.n2 = ziVar;
            if (ziVar != null) {
                TLRPC.ReplyMarkup replyMarkup = ziVar.k.reply_markup;
                if (replyMarkup instanceof TLRPC.TL_replyKeyboardMarkup) {
                    tL_replyKeyboardMarkup = (TLRPC.TL_replyKeyboardMarkup) replyMarkup;
                    this.o2 = tL_replyKeyboardMarkup;
                    gf gfVar2 = this.I1;
                    Point point = org.telegram.messenger.g0.q;
                    gfVar2.setPanelHeight(point.x <= point.y ? this.z2 : this.y2);
                    if (this.o2 == null) {
                        SharedPreferences sharedPreferences = org.telegram.messenger.hp.s1(this.R).e7;
                        if (this.n2 != this.U2 && ziVar != null) {
                            if (this.o2.single_use) {
                            }
                            if (!this.o2.is_persistent) {
                            }
                        }
                        boolean z12 = true;
                        boolean z13 = z10 ? z12 : false;
                        this.I1.setButtons(this.o2);
                        if (z13 && (((veVar = this.F0) == null || veVar.length() == 0) && !r0())) {
                            s1(1, 1, true, true);
                        }
                    } else if (r0() && this.g2 == 1) {
                        if (z11) {
                            this.q3 = true;
                            H0();
                        } else {
                            s1(0, 1, true, true);
                        }
                    }
                    C1(true);
                }
            }
            tL_replyKeyboardMarkup = null;
            this.o2 = tL_replyKeyboardMarkup;
            gf gfVar22 = this.I1;
            Point point2 = org.telegram.messenger.g0.q;
            gfVar22.setPanelHeight(point2.x <= point2.y ? this.z2 : this.y2);
            if (this.o2 == null) {
            }
            C1(true);
        }
    }

    public final boolean Z(TL_keyboard.KeyboardButtonProto keyboardButtonProto, org.telegram.messenger.zi ziVar, org.telegram.messenger.zi ziVar2, org.telegram.ui.ci ciVar) {
        org.telegram.ui.wm wmVar;
        int i3;
        int i10 = 0;
        if (keyboardButtonProto != null && ziVar2 != null && ((wmVar = this.Q2) == null || wmVar.g4 != 5)) {
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) dg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = (TL_keyboard.TL_inlineButtonTypeUserProfile) dg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class);
            TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) dg.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class);
            TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) dg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class);
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) dg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (tL_inlineButtonTypeCopy != null) {
                org.telegram.messenger.g0.g(tL_inlineButtonTypeCopy.copy_text);
                fc.a0(wmVar).i(org.telegram.messenger.bd.a0(null, null, 2131750885, tL_inlineButtonTypeCopy.copy_text)).k(true);
                return true;
            }
            if (keyboardButtonProto instanceof TL_keyboard.TL_keyboardButton) {
                TL_keyboard.TL_keyboardButton tL_keyboardButton = (TL_keyboard.TL_keyboardButton) keyboardButtonProto;
                if (tL_keyboardButton.type instanceof TL_keyboard.TL_buttonTypeDefault) {
                    org.telegram.messenger.wy b10 = org.telegram.messenger.wy.b(tL_keyboardButton.text, this.R2, ziVar, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                    b10.K = wmVar != null ? wmVar.W8() : null;
                    b10.O = this.T4;
                    this.T4 = 0L;
                    this.K0.setEffect(0L);
                    org.telegram.messenger.yy.C(this.R).r0(b10);
                    return true;
                }
            }
            Activity activity = this.P2;
            if (tL_inlineButtonTypeUrl != null) {
                if (sf.c.z(tL_inlineButtonTypeUrl.url)) {
                    sf.c.r(activity, Uri.parse(tL_inlineButtonTypeUrl.url), true, true, ciVar);
                    return true;
                }
                t4.q0(this.Q2, tL_inlineButtonTypeUrl.url, false, true, true, false, ciVar, null, this.X3);
                return true;
            }
            if (dg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPhone.class)) {
                wmVar.Ub(2, ziVar2);
                return true;
            }
            if (!dg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class)) {
                if (dg.c.b(keyboardButtonProto)) {
                    TLRPC.Message message = ziVar2.k;
                    long j10 = message.via_bot_id;
                    if (j10 == 0) {
                        j10 = message.from_id.user_id;
                    }
                    long j11 = j10;
                    hf hfVar = new hf(this, ziVar2, j11, keyboardButtonProto, ziVar, org.telegram.messenger.hp.s1(this.R).a2(Long.valueOf(j10)));
                    if (org.telegram.messenger.b6.h(this.R, j11) || org.telegram.messenger.hp.s1(this.R).W6.contains(Long.valueOf(j11))) {
                        hfVar.run();
                        return true;
                    }
                    t4.n(wmVar, org.telegram.messenger.hp.s1(this.R).a2(Long.valueOf(this.R2)), new ai.r1(this, hfVar, j11, 21), null);
                    return true;
                }
                if (dg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    String M0 = org.telegram.messenger.bd.M0(2131745433, "ShareYouLocationTitle");
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                    s1Var.S = M0;
                    s1Var.U = org.telegram.messenger.bd.M0(2131745435, "ShareYouLocationInfo");
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, "OK"), new aa.a(this, ziVar2, keyboardButtonProto, 22));
                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, "Cancel"), null);
                    wmVar.showDialog(s1Var);
                    return true;
                }
                if (dg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || dg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || dg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || dg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
                    org.telegram.messenger.yy.C(this.R).n0(true, ziVar2, keyboardButtonProto, null, null, wmVar);
                    return true;
                }
                if (tL_inlineButtonTypeSwitchInline != null) {
                    if (!wmVar.bb(tL_inlineButtonTypeSwitchInline)) {
                        if (!tL_inlineButtonTypeSwitchInline.same_peer) {
                            Bundle l10 = org.telegram.ui.Cells.f1.l(1, "onlySelect", "dialogsType", true);
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
                            org.telegram.ui.uw uwVar = new org.telegram.ui.uw(l10);
                            uwVar.D2 = new aa.a(this, ziVar2, tL_inlineButtonTypeSwitchInline, 23);
                            wmVar.presentFragment(uwVar);
                            return true;
                        }
                        TLRPC.Message message2 = ziVar2.k;
                        long j12 = message2.from_id.user_id;
                        long j13 = message2.via_bot_id;
                        if (j13 != 0) {
                            j12 = j13;
                        }
                        TLRPC.User a22 = org.telegram.messenger.hp.s1(this.S.a).a2(Long.valueOf(j12));
                        if (a22 != null) {
                            setFieldText("@" + org.telegram.messenger.l10.n(a22) + " " + tL_inlineButtonTypeSwitchInline.query);
                            return true;
                        }
                    }
                } else if (tL_inlineButtonTypeUserProfile != null) {
                    if (org.telegram.messenger.hp.s1(this.R).a2(Long.valueOf(tL_inlineButtonTypeUserProfile.user_id)) != null) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", tL_inlineButtonTypeUserProfile.user_id);
                        wmVar.presentFragment(new ProfileActivity(bundle, null));
                        return true;
                    }
                } else if (tL_buttonTypeRequestPeer != null) {
                    TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
                    if (requestPeerType == null || ziVar2.k == null) {
                        org.telegram.messenger.a8.d("button.peer_type is null");
                        return true;
                    }
                    if (!(requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot)) {
                        if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i3 = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                            TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                            Boolean bool = tL_requestPeerTypeUser.bot;
                            Boolean bool2 = tL_requestPeerTypeUser.premium;
                            qd qdVar = new qd(this, ziVar2, tL_buttonTypeRequestPeer);
                            org.telegram.ui.kg0 kg0Var = org.telegram.ui.kg0.n2;
                            org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                            if (Q == null || org.telegram.ui.kg0.n2 != null) {
                                return false;
                            }
                            org.telegram.ui.kg0 kg0Var2 = new org.telegram.ui.kg0(Q, i3, bool, bool2, qdVar);
                            kg0Var2.show();
                            org.telegram.ui.kg0.n2 = kg0Var2;
                            return false;
                        }
                        Bundle l11 = org.telegram.ui.Cells.f1.l(15, "onlySelect", "dialogsType", true);
                        TLRPC.Message message3 = ziVar2.k;
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
                        org.telegram.ui.uw uwVar2 = new org.telegram.ui.uw(l11);
                        uwVar2.D2 = new qd(this, ziVar2, tL_buttonTypeRequestPeer);
                        wmVar.presentFragment(uwVar2);
                        return false;
                    }
                    TLRPC.User j14 = getParentFragment() != null ? getParentFragment().j() : org.telegram.messenger.hp.s1(this.R).a2(Long.valueOf(this.R2));
                    if (j14 != null) {
                        lq.e(getContext(), this.R, j14, (TLRPC.TL_requestPeerTypeCreateBot) tL_buttonTypeRequestPeer.peer_type, false, new ai.v1(this, ziVar2, tL_buttonTypeRequestPeer, j14, 6), this.X3, null);
                        return false;
                    }
                }
                return true;
            }
            TL_keyboard.TL_buttonTypeRequestPoll tL_buttonTypeRequestPoll = (TL_keyboard.TL_buttonTypeRequestPoll) dg.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class);
            Boolean valueOf = (tL_buttonTypeRequestPoll.flags & 1) != 0 ? Boolean.valueOf(tL_buttonTypeRequestPoll.quiz) : null;
            wmVar.xa();
            ei.x2 x2Var = wmVar.Y1;
            if (x2Var != null) {
                x2Var.N2 = false;
                x2Var.s3.setVisibility(8);
                x2Var.H1(false, valueOf);
                return false;
            }
        }
        return false;
    }

    public final void Z0(org.telegram.messenger.zi ziVar, String str, boolean z10, boolean z11) {
        ve veVar;
        org.telegram.messenger.wy b10;
        String sb2;
        if (str == null || getVisibility() != 0 || (veVar = this.F0) == null) {
            return;
        }
        r16 = null;
        TLRPC.User user = null;
        if (!z10) {
            if (this.H0 > 0 && !c()) {
                uf ufVar = this.a3;
                if (ufVar != null) {
                    cg cgVar = this.G0;
                    ufVar.h1(cgVar, ((org.telegram.ui.ActionBar.k5) cgVar.c).getText(), true);
                    return;
                }
                return;
            }
            TLRPC.User a22 = (ziVar == null || !org.telegram.messenger.m5.z(this.R2)) ? null : org.telegram.messenger.hp.s1(this.S.a).a2(Long.valueOf(ziVar.k.from_id.user_id));
            if ((this.p2 != 1 || z11) && a22 != null && a22.bot && !str.contains("@")) {
                Locale locale = Locale.US;
                b10 = org.telegram.messenger.wy.b(a1.g.C(str, "@", org.telegram.messenger.l10.n(a22)), this.R2, this.U2, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
            } else {
                b10 = org.telegram.messenger.wy.b(str, this.R2, this.U2, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
            }
            org.telegram.ui.wm wmVar = this.Q2;
            b10.K = wmVar != null ? wmVar.W8() : null;
            b10.O = this.T4;
            this.T4 = 0L;
            this.K0.setEffect(0L);
            p(b10);
            org.telegram.messenger.yy.C(this.R).r0(b10);
            return;
        }
        String obj = veVar.getText().toString();
        if (ziVar != null && org.telegram.messenger.m5.z(this.R2)) {
            user = org.telegram.messenger.hp.s1(this.S.a).a2(Long.valueOf(ziVar.k.from_id.user_id));
        }
        TLRPC.User user2 = user;
        if ((this.p2 != 1 || z11) && user2 != null && user2.bot && !str.contains("@")) {
            StringBuilder sb3 = new StringBuilder();
            Locale locale2 = Locale.US;
            sb3.append(str + "@" + org.telegram.messenger.l10.n(user2));
            sb3.append(" ");
            sb3.append(obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
            sb2 = sb3.toString();
        } else {
            StringBuilder h = t4.c.h(str, " ");
            h.append(obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
            sb2 = h.toString();
        }
        this.S2 = true;
        this.F0.setText(sb2);
        ve veVar2 = this.F0;
        veVar2.setSelection(veVar2.getText().length());
        this.S2 = false;
        uf ufVar2 = this.a3;
        if (ufVar2 != null) {
            ufVar2.Y0(this.F0.getText(), true, false);
        }
        if (this.A2 || this.g2 != -1) {
            return;
        }
        G0();
    }

    @Override // org.telegram.ui.Components.uv0
    public final void a(TLRPC.Document document, String str, Object obj, org.telegram.messenger.vi viVar, boolean z10, boolean z11, int i3, int i10) {
        if (this.q5) {
            return;
        }
        org.telegram.ui.mm mmVar = this.W2;
        org.telegram.ui.wm wmVar = this.Q2;
        if (mmVar != null && wmVar != null && mmVar.f) {
            wmVar.uc();
            return;
        }
        if (!c() || i3 != 0) {
            t4.Z(this.R, 1, this.R2, new nd(this, document, str, viVar, z11, i3, i10, obj, z10));
            return;
        }
        t4.L(this.P2, wmVar.a(), new md(this, document, str, obj, viVar, z10), this.X3);
    }

    public final void a0() {
        org.telegram.messenger.dj djVar;
        org.telegram.messenger.ej b10;
        TLRPC.Chat chat;
        int i3;
        org.telegram.messenger.ej b11;
        org.telegram.messenger.zi ziVar = this.a2;
        if (ziVar == null) {
            return;
        }
        boolean q52 = ziVar.q5();
        org.telegram.ui.wm wmVar = this.Q2;
        if (q52 && !org.telegram.messenger.t3.z(this.R, 24, org.telegram.messenger.zi.B0(this.a2.k))) {
            if (wmVar == null || (b11 = wmVar.x5) == null) {
                b11 = org.telegram.messenger.ej.b(this.a2.k.suggested_post);
            }
            if (!ci.e9.T(this.R, b11.a)) {
                if (wmVar != null) {
                    wmVar.wc(b11);
                    return;
                }
                return;
            }
        }
        if (this.d0 - this.e0 < 0) {
            NumberTextView numberTextView = this.c0;
            if (numberTextView != null) {
                org.telegram.messenger.g0.G3(3.5f, numberTextView, null);
                try {
                    this.c0.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
            }
            if (org.telegram.messenger.hp.s1(this.R).D3() || org.telegram.messenger.hp.s1(this.R).U4 <= this.e0) {
                return;
            }
            p1();
            return;
        }
        if (this.S1 != 0) {
            l1(0, true);
            this.V0.t(false);
            if (this.A3) {
                m1(false, true, false, true);
                this.m3 = true;
                org.telegram.messenger.g0.i3(new yc(this, 28), 200L);
            }
        }
        ve veVar = this.F0;
        CharSequence textToUse = veVar == null ? "" : veVar.getTextToUse();
        org.telegram.messenger.zi ziVar2 = this.a2;
        if (ziVar2 == null || ziVar2.D != 19) {
            textToUse = org.telegram.messenger.g0.n1(textToUse);
        }
        CharSequence[] charSequenceArr = {textToUse};
        if (TextUtils.isEmpty(charSequenceArr[0])) {
            TLRPC.MessageMedia messageMedia = this.a2.k.media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) || (messageMedia instanceof TLRPC.TL_messageMediaEmpty) || messageMedia == null) {
                org.telegram.messenger.g0.G3(-3.0f, this.F0, null);
                org.telegram.messenger.p2.E.a();
                return;
            }
        }
        ArrayList W = org.telegram.messenger.li.b0(this.R).W(charSequenceArr, z1(), true);
        if (!TextUtils.equals(charSequenceArr[0], this.a2.v) || ((W != null && !W.isEmpty()) || !this.a2.k.entities.isEmpty() || (this.a2.k.media instanceof TLRPC.TL_messageMediaWebPage))) {
            org.telegram.messenger.zi ziVar3 = this.a2;
            ziVar3.w1 = charSequenceArr[0];
            ziVar3.x1 = W;
            ziVar3.y1 = this.Z2;
            if (wmVar != null && (chat = wmVar.e) != null && (((i3 = ziVar3.D) == 0 || i3 == 19) && !org.telegram.messenger.t3.m(chat))) {
                org.telegram.messenger.zi ziVar4 = this.a2;
                ziVar4.y1 = false;
                TLRPC.Message message = ziVar4.k;
                message.flags &= -513;
                message.media = null;
            } else if (wmVar == null || (djVar = wmVar.w5) == null) {
                org.telegram.messenger.zi ziVar5 = this.a2;
                ziVar5.y1 = false;
                int i10 = ziVar5.D;
                if (i10 == 0 || i10 == 19) {
                    TLRPC.Message message2 = ziVar5.k;
                    message2.flags |= 512;
                    message2.media = new TLRPC.TL_messageMediaEmpty();
                }
            } else {
                if (wmVar.X5 instanceof TLRPC.TL_webPagePending) {
                    org.telegram.messenger.zi ziVar6 = this.a2;
                    ziVar6.y1 = false;
                    int i11 = ziVar6.D;
                    if (i11 == 0 || i11 == 19) {
                        ziVar6.k.media = new TLRPC.TL_messageMediaEmpty();
                        this.a2.k.flags |= 512;
                    }
                } else if (djVar.v != null) {
                    org.telegram.messenger.zi ziVar7 = this.a2;
                    ziVar7.y1 = false;
                    TLRPC.Message message3 = ziVar7.k;
                    message3.flags |= 512;
                    message3.media = new TLRPC.TL_messageMediaWebPage();
                    this.a2.k.media.webpage = wmVar.w5.v;
                } else {
                    org.telegram.messenger.zi ziVar8 = this.a2;
                    ziVar8.y1 = false;
                    int i12 = ziVar8.D;
                    if (i12 == 0 || i12 == 19) {
                        TLRPC.Message message4 = ziVar8.k;
                        message4.flags |= 512;
                        message4.media = new TLRPC.TL_messageMediaEmpty();
                    }
                }
                TLRPC.Message message5 = this.a2.k;
                org.telegram.messenger.dj djVar2 = wmVar.w5;
                message5.invert_media = djVar2.r;
                if (djVar2.o) {
                    TLRPC.MessageMedia messageMedia2 = message5.media;
                    if (messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) {
                        boolean z10 = djVar2.q;
                        messageMedia2.force_small_media = z10;
                        messageMedia2.force_large_media = true ^ z10;
                    }
                }
            }
            if (this.a2.q5()) {
                org.telegram.messenger.wy a10 = org.telegram.messenger.wy.a(org.telegram.messenger.zi.B0(this.a2.k), this.a2.w1.toString());
                if (wmVar == null || (b10 = wmVar.x5) == null) {
                    b10 = org.telegram.messenger.ej.b(this.a2.k.suggested_post);
                }
                a10.T = b10;
                a10.R = org.telegram.messenger.m5.o(this.a2.k.saved_peer_id);
                a10.G = this.a2.u2();
                org.telegram.messenger.zi ziVar9 = this.a2;
                a10.r = ziVar9;
                a10.D = ziVar9;
                if (ziVar9.F0() instanceof TLRPC.TL_document) {
                    a10.g = (TLRPC.TL_document) this.a2.F0();
                    a10.b = a10.a;
                    a10.a = null;
                } else {
                    TLRPC.MessageMedia messageMedia3 = this.a2.k.media;
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
                org.telegram.messenger.yy.C(this.R).r0(a10);
            } else {
                org.telegram.messenger.yy C = org.telegram.messenger.yy.C(this.R);
                org.telegram.messenger.zi ziVar10 = this.a2;
                C.t(ziVar10, null, null, null, null, null, null, null, false, ziVar10.u2(), null);
            }
        }
        b1(null, null, false);
    }

    public final void a1(int i3, long j10) {
        this.R2 = j10;
        if (this.R != i3) {
            this.M3.e();
            org.telegram.messenger.hs f10 = org.telegram.messenger.hs.f(this.R);
            int i10 = org.telegram.messenger.hs.l2;
            f10.n(this, i10);
            org.telegram.messenger.hs f11 = org.telegram.messenger.hs.f(this.R);
            int i11 = org.telegram.messenger.hs.o2;
            f11.n(this, i11);
            org.telegram.messenger.hs f12 = org.telegram.messenger.hs.f(this.R);
            int i12 = org.telegram.messenger.hs.p2;
            f12.n(this, i12);
            org.telegram.messenger.hs f13 = org.telegram.messenger.hs.f(this.R);
            int i13 = org.telegram.messenger.hs.m2;
            f13.n(this, i13);
            org.telegram.messenger.hs f14 = org.telegram.messenger.hs.f(this.R);
            int i14 = org.telegram.messenger.hs.n2;
            f14.n(this, i14);
            org.telegram.messenger.hs f15 = org.telegram.messenger.hs.f(this.R);
            int i15 = org.telegram.messenger.hs.k2;
            f15.n(this, i15);
            org.telegram.messenger.hs f16 = org.telegram.messenger.hs.f(this.R);
            int i16 = org.telegram.messenger.hs.t;
            f16.n(this, i16);
            org.telegram.messenger.hs f17 = org.telegram.messenger.hs.f(this.R);
            int i17 = org.telegram.messenger.hs.s2;
            f17.n(this, i17);
            org.telegram.messenger.hs f18 = org.telegram.messenger.hs.f(this.R);
            int i18 = org.telegram.messenger.hs.u2;
            f18.n(this, i18);
            org.telegram.messenger.hs f19 = org.telegram.messenger.hs.f(this.R);
            int i19 = org.telegram.messenger.hs.e2;
            f19.n(this, i19);
            org.telegram.messenger.hs f20 = org.telegram.messenger.hs.f(this.R);
            int i20 = org.telegram.messenger.hs.z0;
            f20.n(this, i20);
            org.telegram.messenger.hs f21 = org.telegram.messenger.hs.f(this.R);
            int i21 = org.telegram.messenger.hs.L;
            f21.n(this, i21);
            org.telegram.messenger.hs f22 = org.telegram.messenger.hs.f(this.R);
            int i22 = org.telegram.messenger.hs.n1;
            f22.n(this, i22);
            org.telegram.messenger.hs f23 = org.telegram.messenger.hs.f(this.R);
            int i23 = org.telegram.messenger.hs.t2;
            f23.n(this, i23);
            org.telegram.messenger.hs f24 = org.telegram.messenger.hs.f(this.R);
            int i24 = org.telegram.messenger.hs.R2;
            f24.n(this, i24);
            org.telegram.messenger.hs f25 = org.telegram.messenger.hs.f(this.R);
            int i25 = org.telegram.messenger.hs.Y2;
            f25.n(this, i25);
            org.telegram.messenger.hs f26 = org.telegram.messenger.hs.f(this.R);
            int i26 = org.telegram.messenger.hs.f5;
            f26.n(this, i26);
            this.R = i3;
            this.S = org.telegram.messenger.c.a(i3);
            org.telegram.messenger.hs.f(this.R).c(this, i10);
            org.telegram.messenger.hs.f(this.R).c(this, i11);
            org.telegram.messenger.hs.f(this.R).c(this, i12);
            org.telegram.messenger.hs.f(this.R).c(this, i13);
            org.telegram.messenger.hs.f(this.R).c(this, i14);
            org.telegram.messenger.hs.f(this.R).c(this, i15);
            org.telegram.messenger.hs.f(this.R).c(this, i16);
            org.telegram.messenger.hs.f(this.R).c(this, i17);
            org.telegram.messenger.hs.f(this.R).c(this, i18);
            org.telegram.messenger.hs.f(this.R).c(this, i19);
            org.telegram.messenger.hs.f(this.R).c(this, i20);
            org.telegram.messenger.hs.f(this.R).c(this, i21);
            org.telegram.messenger.hs.f(this.R).c(this, i22);
            org.telegram.messenger.hs.f(this.R).c(this, i23);
            org.telegram.messenger.hs.f(this.R).c(this, i24);
            org.telegram.messenger.hs.f(this.R).c(this, i25);
            org.telegram.messenger.hs.f(this.R).c(this, i26);
        }
        this.A0 = true;
        if (org.telegram.messenger.m5.z(this.R2)) {
            this.A0 = org.telegram.messenger.t3.q(org.telegram.messenger.hp.s1(this.S.a).M0(Long.valueOf(-this.R2)));
        }
        P1(false);
        J1(false);
        D();
        A();
        H1(false);
        if (this.F0 != null) {
            org.telegram.ui.wm wmVar = this.Q2;
            Q1(wmVar != null && wmVar.getFragmentBeginToShow());
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ge));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Sf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Qf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Pf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Me));
    }

    @Override // org.telegram.ui.Components.uv0
    public final boolean b() {
        org.telegram.ui.wm wmVar = this.Q2;
        return wmVar != null && wmVar.R6();
    }

    public final void b0(Canvas canvas, boolean z10) {
        if (this.z4) {
            int y9 = (int) com.google.android.recaptcha.internal.a.y(1.0f, this.D4, org.telegram.ui.ActionBar.k6.i3.getIntrinsicHeight(), this.U1);
            View view = this.H1;
            if (view != null && view.getVisibility() == 0) {
                y9 = (int) (((1.0f - getTopViewEnterProgress()) * this.H1.getLayoutParams().height) + y9);
            }
            int intrinsicHeight = org.telegram.ui.ActionBar.k6.i3.getIntrinsicHeight() + y9;
            if (z10) {
                org.telegram.ui.ActionBar.k6.i3.setAlpha((int) (this.D4 * 255.0f));
                org.telegram.ui.ActionBar.k6.i3.setBounds(0, y9, getMeasuredWidth(), intrinsicHeight);
                org.telegram.ui.ActionBar.k6.i3.draw(canvas);
            }
            if (!this.y4) {
                float f10 = intrinsicHeight;
                float width = getWidth();
                float height = getHeight();
                org.telegram.ui.ActionBar.e6 e6Var = this.X3;
                Paint d = e6Var != null ? e6Var.d("paintChatComposeBackground") : null;
                if (d == null) {
                    d = org.telegram.ui.ActionBar.k6.V0("paintChatComposeBackground");
                }
                canvas.drawRect(0.0f, f10, width, height, d);
                return;
            }
            int f02 = f0(org.telegram.ui.ActionBar.k6.Ge);
            Paint paint = this.C4;
            paint.setColor(f02);
            if (!org.telegram.messenger.az.f() || this.n1 == null) {
                canvas.drawRect(0.0f, intrinsicHeight, getWidth(), getHeight(), paint);
            } else {
                this.E4.set(0, intrinsicHeight, getWidth(), getHeight());
                this.n1.H(canvas, getTop(), this.E4, paint, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b1(org.telegram.messenger.zi ziVar, org.telegram.messenger.ui uiVar, boolean z10) {
        float f10;
        float f11;
        int i3;
        sd sdVar;
        CharSequence charSequence;
        CharSequence charSequence2;
        int i10;
        ve veVar;
        ve veVar2;
        sd sdVar2;
        boolean z11;
        ge geVar;
        if (this.c3 == null && this.f3 == null && this.a2 != ziVar) {
            S();
            boolean z12 = this.a2 != null;
            this.a2 = ziVar;
            this.b2 = z10;
            sd sdVar3 = this.B1;
            ci.q qVar = this.q1;
            ImageView imageView = this.Q0;
            lg.k kVar = this.s1;
            be beVar = this.a1;
            if (ziVar != null) {
                this.S4 = uiVar != null ? uiVar.j : ziVar.k.invert_media;
                P(false);
                this.G1.setOnClickListener(new ad(this, 17));
                if (this.a2.q5()) {
                    long j10 = this.v4;
                    if (j10 > 0) {
                        this.G1.i(1, j10, true);
                        this.G1.setLayoutParams(b8.mf.e(44, 44, 85));
                        this.G1.requestLayout();
                        sdVar = sdVar3;
                        this.G1.setOnLongClickListener(new j(this, ziVar, uiVar, 1));
                        this.G1.setVisibility(0);
                        this.G1.setScaleX(0.1f);
                        this.G1.setScaleY(0.1f);
                        this.G1.setAlpha(0.0f);
                        this.G1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(xq.f).start();
                        if (z10) {
                            this.d0 = org.telegram.messenger.hp.s1(this.S.a).u1();
                            charSequence = this.a2.v;
                        } else {
                            this.d0 = org.telegram.messenger.hp.s1(this.S.a).H0();
                            charSequence = this.a2.z;
                        }
                        if (charSequence == null) {
                            ve veVar3 = this.F0;
                            TextPaint paint = veVar3 != null ? veVar3.getPaint() : null;
                            if (paint == null) {
                                paint = new TextPaint();
                                paint.setTextSize(org.telegram.messenger.g0.L(18.0f));
                            }
                            charSequence2 = o(paint.getFontMetricsInt(), charSequence, this.a2.k.entities);
                        } else {
                            charSequence2 = "";
                        }
                        if (this.W1 == null && !z12) {
                            ve veVar4 = this.F0;
                            this.W1 = (veVar4 != null || veVar4.length() <= 0) ? null : this.F0.getText();
                            this.X1 = this.Z2;
                        }
                        org.telegram.messenger.zi ziVar2 = this.a2;
                        TLRPC.MessageMedia messageMedia = ziVar2.k.media;
                        this.Z2 = ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) || !messageMedia.manual) && ((i10 = ziVar2.D) == 0 || i10 == 19);
                        if (this.A2) {
                            org.telegram.ui.lo loVar = new org.telegram.ui.lo(13, this, charSequence2);
                            this.a0 = loVar;
                            org.telegram.messenger.g0.i3(loVar, 200L);
                        } else {
                            org.telegram.ui.lo loVar2 = this.a0;
                            if (loVar2 != null) {
                                org.telegram.messenger.g0.r(loVar2);
                                this.a0 = null;
                            }
                            setFieldText(charSequence2);
                        }
                        veVar = this.F0;
                        if (veVar != null) {
                            veVar.requestFocus();
                        }
                        G0();
                        veVar2 = this.F0;
                        if (veVar2 != null) {
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) veVar2.getLayoutParams();
                            layoutParams.rightMargin = org.telegram.messenger.g0.L(4.0f);
                            this.F0.setLayoutParams(layoutParams);
                        }
                        sdVar2 = this.f1;
                        if (sdVar2 == null) {
                            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) sdVar2.getLayoutParams();
                            z11 = false;
                            layoutParams2.rightMargin = 0;
                            this.f1.setLayoutParams(layoutParams2);
                        } else {
                            z11 = false;
                        }
                        getSendButtonInternal().setVisibility(8);
                        setSlowModeButtonVisible(z11);
                        imageView.setVisibility(8);
                        beVar.setVisibility(8);
                        qVar.setVisibility(8);
                        if (kVar != null) {
                            this.w1 = 0.0f;
                            kVar.setAlpha(0.0f);
                            kVar.setScaleX(0.5f);
                            kVar.setScaleY(0.5f);
                        }
                        sdVar.setVisibility(8);
                        geVar = this.K1;
                        if (geVar != null) {
                            geVar.setVisibility(8);
                        }
                    }
                }
                sdVar = sdVar3;
                this.G1.i(1, 0L, true);
                this.G1.setLayoutParams(b8.mf.e(44, 44, 85));
                this.G1.requestLayout();
                this.G1.setOnLongClickListener(new j(this, ziVar, uiVar, 1));
                this.G1.setVisibility(0);
                this.G1.setScaleX(0.1f);
                this.G1.setScaleY(0.1f);
                this.G1.setAlpha(0.0f);
                this.G1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(xq.f).start();
                if (z10) {
                }
                if (charSequence == null) {
                }
                if (this.W1 == null) {
                    ve veVar42 = this.F0;
                    this.W1 = (veVar42 != null || veVar42.length() <= 0) ? null : this.F0.getText();
                    this.X1 = this.Z2;
                }
                org.telegram.messenger.zi ziVar22 = this.a2;
                TLRPC.MessageMedia messageMedia2 = ziVar22.k.media;
                this.Z2 = ((messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) || !messageMedia2.manual) && ((i10 = ziVar22.D) == 0 || i10 == 19);
                if (this.A2) {
                }
                veVar = this.F0;
                if (veVar != null) {
                }
                G0();
                veVar2 = this.F0;
                if (veVar2 != null) {
                }
                sdVar2 = this.f1;
                if (sdVar2 == null) {
                }
                getSendButtonInternal().setVisibility(8);
                setSlowModeButtonVisible(z11);
                imageView.setVisibility(8);
                beVar.setVisibility(8);
                qVar.setVisibility(8);
                if (kVar != null) {
                }
                sdVar.setVisibility(8);
                geVar = this.K1;
                if (geVar != null) {
                }
            } else {
                org.telegram.ui.lo loVar3 = this.a0;
                if (loVar3 != null) {
                    org.telegram.messenger.g0.r(loVar3);
                    this.a0 = null;
                }
                ee eeVar = this.G1;
                if (eeVar != null) {
                    eeVar.setVisibility(8);
                }
                this.d0 = -1;
                this.a3.u();
                sdVar3.setVisibility(0);
                imageView.setScaleX(0.1f);
                imageView.setScaleY(0.1f);
                imageView.setAlpha(0.0f);
                imageView.setVisibility(8);
                int i11 = this.H0;
                cg cgVar = this.G0;
                if (i11 <= 0 || c()) {
                    getSendButtonInternal().setScaleX(0.1f);
                    getSendButtonInternal().setScaleY(0.1f);
                    getSendButtonInternal().setAlpha(0.0f);
                    getSendButtonInternal().setVisibility(8);
                    cgVar.setScaleX(0.1f);
                    cgVar.setScaleY(0.1f);
                    cgVar.setAlpha(0.0f);
                    setSlowModeButtonVisible(false);
                    f10 = 1.0f;
                    qVar.setScaleX(1.0f);
                    this.F = 1.0f;
                    B1();
                    qVar.setVisibility(0);
                    if (kVar != null) {
                        this.w1 = 1.0f;
                        kVar.setAlpha(1.0f);
                        kVar.setScaleX(1.0f);
                        kVar.setScaleY(1.0f);
                    }
                    beVar.setScaleX(1.0f);
                    beVar.setScaleY(1.0f);
                    beVar.setAlpha(1.0f);
                    beVar.setVisibility(0);
                } else {
                    if (this.H0 == Integer.MAX_VALUE) {
                        getSendButtonInternal().setScaleX(1.0f);
                        getSendButtonInternal().setScaleY(1.0f);
                        getSendButtonInternal().setAlpha(1.0f);
                        getSendButtonInternal().setVisibility(0);
                        cgVar.setScaleX(0.1f);
                        cgVar.setScaleY(0.1f);
                        f11 = 0.0f;
                        cgVar.setAlpha(0.0f);
                        setSlowModeButtonVisible(false);
                        i3 = 8;
                    } else {
                        f11 = 0.0f;
                        getSendButtonInternal().setScaleX(0.1f);
                        getSendButtonInternal().setScaleY(0.1f);
                        getSendButtonInternal().setAlpha(0.0f);
                        i3 = 8;
                        getSendButtonInternal().setVisibility(8);
                        cgVar.setScaleX(1.0f);
                        cgVar.setScaleY(1.0f);
                        cgVar.setAlpha(1.0f);
                        setSlowModeButtonVisible(true);
                    }
                    qVar.setScaleX(0.01f);
                    this.F = f11;
                    B1();
                    qVar.setVisibility(i3);
                    if (kVar != null) {
                        this.w1 = f11;
                        kVar.setAlpha(f11);
                        kVar.setScaleX(0.5f);
                        kVar.setScaleY(0.5f);
                    }
                    beVar.setScaleX(0.1f);
                    beVar.setScaleY(0.1f);
                    beVar.setAlpha(f11);
                    beVar.setVisibility(i3);
                    f10 = 1.0f;
                }
                W();
                ge geVar2 = this.K1;
                if (geVar2 != null && geVar2.getTag() != null) {
                    this.K1.setScaleX(f10);
                    this.K1.setScaleY(f10);
                    this.K1.setAlpha(f10);
                    this.K1.setVisibility(0);
                }
                org.telegram.ui.wm wmVar = this.Q2;
                if (wmVar != null) {
                    wmVar.G5 = null;
                    wmVar.X5 = null;
                    org.telegram.messenger.dj djVar = wmVar.w5;
                    if (djVar != null) {
                        djVar.e(this.R, null, "", null, null, null);
                    }
                    this.Y2 = null;
                    this.Z2 = true;
                    wmVar.z8();
                }
                S();
                ve veVar5 = this.F0;
                if (veVar5 != null) {
                    veVar5.setText(this.W1);
                    ve veVar6 = this.F0;
                    veVar6.setSelection(veVar6.length());
                }
                this.W1 = null;
                this.Z2 = this.X1;
                if (getVisibility() == 0) {
                    this.a3.n2();
                }
                I1(1);
            }
            H1(true);
            Q1(true);
            F1();
            O1();
        }
    }

    @Override // org.telegram.ui.Components.uv0
    public final boolean c() {
        org.telegram.ui.wm wmVar = this.Q2;
        return wmVar != null && wmVar.c();
    }

    public final boolean c0(Canvas canvas, org.telegram.messenger.m10 m10Var) {
        float f10;
        float f11;
        float f12;
        float f13;
        float d = this.g5.d(this.F0.canScrollVertically(-1));
        float d10 = this.h5.d(this.F0.canScrollVertically(1));
        if (d <= 0.0f && d10 <= 0.0f) {
            return ((Boolean) m10Var.run()).booleanValue();
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, this.F0.getX() + this.F0.getMeasuredWidth() + org.telegram.messenger.g0.L(5.0f), this.F0.getY() + this.F0.getMeasuredHeight() + org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.hs.e4, 31);
        boolean booleanValue = ((Boolean) m10Var.run()).booleanValue();
        canvas.save();
        LinearGradient linearGradient = this.e5;
        Paint paint = this.d5;
        Matrix matrix = this.f5;
        if (d > 0.0f) {
            RectF rectF = org.telegram.messenger.g0.P;
            f12 = 255.0f;
            f13 = 16.0f;
            f10 = 0.0f;
            f11 = 5.0f;
            rectF.set(this.F0.getX() - org.telegram.messenger.g0.L(5.0f), (this.F0.getY() + this.U1) - 1.0f, this.F0.getX() + this.F0.getMeasuredWidth() + org.telegram.messenger.g0.L(5.0f), this.F0.getY() + this.U1 + org.telegram.messenger.g0.L(13.0f));
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
        if (d10 > f10) {
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(this.F0.getX() - org.telegram.messenger.g0.L(f11), (this.F0.getY() + this.F0.getMeasuredHeight()) - org.telegram.messenger.g0.L(15.0f), this.F0.getX() + this.F0.getMeasuredWidth() + org.telegram.messenger.g0.L(f11), this.F0.getY() + this.F0.getMeasuredHeight() + org.telegram.messenger.g0.L(2.0f) + 1.0f);
            matrix.reset();
            matrix.postScale(1.0f, rectF2.height() / f13);
            matrix.postRotate(180.0f);
            matrix.postTranslate(rectF2.left, rectF2.bottom);
            linearGradient.setLocalMatrix(matrix);
            paint.setAlpha((int) (d10 * f12));
            canvas.drawRect(rectF2, paint);
        }
        canvas.restore();
        canvas.restore();
        return booleanValue;
    }

    public final void c1(boolean z10, boolean z11) {
        fg fgVar;
        ve veVar;
        sd sdVar;
        ud udVar = this.R0;
        if (udVar == null) {
            return;
        }
        if (this.x2 == 1 || ((sdVar = this.f1) != null && sdVar.getVisibility() == 0)) {
            this.h = 0.0f;
            this.n = 0.0f;
            G1();
            z11 = false;
        }
        fg fgVar2 = fg.f;
        fg fgVar3 = fg.e;
        if (!z10 || this.g2 != 0) {
            kf kfVar = this.V0;
            int i3 = kfVar == null ? org.telegram.messenger.hp.d1().getInt("selected_page", 0) : kfVar.getCurrentPage();
            fgVar = (i3 == 0 || !((this.K2 || this.L2) && ((veVar = this.F0) == null || TextUtils.isEmpty(veVar.getText())))) ? fgVar3 : i3 == 1 ? fg.c : fgVar2;
        } else if (!this.A0) {
            return;
        } else {
            fgVar = fg.d;
        }
        if (!this.A0 && fgVar == fgVar3) {
            fgVar3 = fgVar2;
        } else if (this.b || fgVar == fgVar3) {
            fgVar3 = fgVar;
        }
        udVar.j(fgVar3, z11);
        if (fgVar3 == fgVar2 && this.V0 == null) {
            org.telegram.messenger.li.b0(this.R).V0(0, true, true, false);
            ArrayList arrayList = org.telegram.messenger.hp.s1(this.R).c4;
            int min = Math.min(10, arrayList.size());
            for (int i10 = 0; i10 < min; i10++) {
                org.telegram.messenger.i6.k((CharSequence) arrayList.get(i10));
            }
        }
    }

    @Override // org.telegram.ui.Components.mw0
    public final void d(TextWatcher textWatcher) {
        ve veVar = this.F0;
        if (veVar != null) {
            veVar.addTextChangedListener(textWatcher);
            return;
        }
        if (this.I4 == null) {
            this.I4 = new ArrayList();
        }
        this.I4.add(textWatcher);
    }

    public final ef d0(org.telegram.messenger.zi ziVar, boolean z10) {
        ef efVar = new ef(ziVar.I1, ziVar.k, true, true);
        if (z10) {
            ve veVar = this.F0;
            CharSequence[] charSequenceArr = {veVar == null ? "" : veVar.getTextToUse()};
            ArrayList W = org.telegram.messenger.li.b0(this.R).W(charSequenceArr, true, true);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceArr[0].toString());
            org.telegram.messenger.zi.b(spannableStringBuilder, W, true, true, false, true, 0);
            efVar.z = org.telegram.messenger.zi.C5(org.telegram.messenger.i6.m(spannableStringBuilder, org.telegram.ui.ActionBar.k6.o2.getFontMetricsInt(), false, null, 0), W, org.telegram.ui.ActionBar.k6.o2.getFontMetricsInt(), false);
        }
        return efVar;
    }

    public final void d1() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.P2.getSystemService("accessibility");
        if (this.F0 == null || accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        try {
            this.F0.requestFocus();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        ee eeVar;
        TLRPC.ChatFull chatFull;
        TLRPC.Chat M0;
        double d;
        lg.k kVar;
        if (i3 == org.telegram.messenger.hs.i4) {
            kf kfVar = this.V0;
            if (kfVar != null) {
                kfVar.Q.g1();
            }
            gf gfVar = this.I1;
            if (gfVar != null) {
                ArrayList arrayList = gfVar.n;
                while (r4 < arrayList.size()) {
                    ((ii.k0) arrayList.get(r4)).invalidate();
                    r4++;
                }
            }
            ve veVar = this.F0;
            if (veVar != null) {
                veVar.postInvalidate();
                this.F0.q();
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.k2) {
            if (((Integer) objArr[0]).intValue() != this.H2) {
                return;
            }
            if (this.x2 != 0 && !this.n3 && !c()) {
                this.n3 = true;
                org.telegram.messenger.hp.s1(this.S.a).C4(this.d1 ? 7 : 1, 0, this.R2, getThreadMessageId(), null);
            }
            RecordCircle recordCircle = this.O1;
            if (recordCircle != null) {
                recordCircle.setAmplitude(((Double) objArr[1]).doubleValue());
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.t) {
            ve veVar2 = this.F0;
            if (veVar2 == null || !veVar2.isFocused()) {
                return;
            }
            org.telegram.messenger.g0.v1(this.F0);
            return;
        }
        int i11 = org.telegram.messenger.hs.m2;
        int i12 = org.telegram.messenger.hs.n2;
        int i13 = 5;
        if (i3 == i11 || i3 == i12) {
            if (((Integer) objArr[0]).intValue() == this.H2 && this.G2) {
                this.G2 = false;
                if (i3 != i12) {
                    M1(2, true);
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
                    M1(i13, true);
                    return;
                }
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.l2) {
            if (((Integer) objArr[0]).intValue() != this.H2) {
                return;
            }
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            this.d1 = !booleanValue;
            ce ceVar = this.c1;
            if (ceVar != null) {
                ceVar.j(booleanValue ? fg.a : fg.b, true);
            }
            if (this.G2) {
                RecordCircle recordCircle2 = this.O1;
                if (recordCircle2 != null) {
                    recordCircle2.J = true;
                }
            } else {
                this.G2 = true;
                M1(0, true);
            }
            dg dgVar = this.Z0;
            if (dgVar != null) {
                dgVar.a(this.j1);
            }
            ag agVar = this.m1;
            if (agVar != null) {
                agVar.h = false;
                return;
            }
            return;
        }
        byte[] bArr = null;
        if (i3 == org.telegram.messenger.hs.o2) {
            this.G2 = false;
            this.c3 = null;
            this.f3 = null;
            return;
        }
        if (i3 == org.telegram.messenger.hs.p2) {
            this.c3 = null;
            this.f3 = null;
            dg dgVar2 = this.Z0;
            if (dgVar2 != null) {
                dgVar2.a(this.j1);
            }
            E(true);
            this.G2 = true;
            M1(0, true);
            return;
        }
        if (i3 != org.telegram.messenger.hs.s2) {
            if (i3 == org.telegram.messenger.hs.u2) {
                Activity activity = this.P2;
                if (activity != null) {
                    activity.setVolumeControlStream(((Boolean) objArr[0]).booleanValue() ? 0 : TLObject.FLAG_31);
                    return;
                }
                return;
            }
            if (i3 == org.telegram.messenger.hs.e2) {
                if (this.e3 == null || !MediaController.B().I(this.e3)) {
                    return;
                }
                org.telegram.messenger.zi ziVar = MediaController.B().v0;
                org.telegram.messenger.zi ziVar2 = this.e3;
                ziVar2.b0 = ziVar.b0;
                ziVar2.g0 = ziVar.g0;
                return;
            }
            if (i3 == org.telegram.messenger.hs.z0) {
                ud udVar = this.R0;
                if (udVar != null) {
                    udVar.invalidate();
                    return;
                }
                return;
            }
            if (i3 == org.telegram.messenger.hs.L) {
                if (((Boolean) objArr[6]).booleanValue()) {
                    return;
                }
                long longValue = ((Long) objArr[3]).longValue();
                Integer num2 = (Integer) objArr[1];
                if (longValue != this.R2 || (chatFull = this.e2) == null || chatFull.slowmode_seconds == 0 || org.telegram.messenger.zi.g3(num2.intValue()) || (M0 = org.telegram.messenger.hp.s1(this.S.a).M0(Long.valueOf(this.e2.id))) == null || org.telegram.messenger.t3.N(M0) || org.telegram.messenger.t3.h0(M0)) {
                    return;
                }
                TLRPC.ChatFull chatFull2 = this.e2;
                int currentTime = ConnectionsManager.getInstance(this.R).getCurrentTime();
                TLRPC.ChatFull chatFull3 = this.e2;
                chatFull2.slowmode_next_send_date = currentTime + chatFull3.slowmode_seconds;
                chatFull3.flags |= 262144;
                setSlowModeTimer(chatFull3.slowmode_next_send_date);
                return;
            }
            if (i3 == org.telegram.messenger.hs.n1) {
                if (this.e2 != null) {
                    T1();
                    return;
                }
                return;
            }
            if (i3 == org.telegram.messenger.hs.t2) {
                this.c3 = null;
                this.f3 = null;
                M1(4, true);
                return;
            }
            if (i3 != org.telegram.messenger.hs.R2) {
                if (i3 == org.telegram.messenger.hs.Y2) {
                    J1(true);
                    return;
                } else {
                    if (i3 == org.telegram.messenger.hs.f5 && this.E1 && (eeVar = this.K0) != null) {
                        eeVar.setLocked(!org.telegram.messenger.h10.i(this.R).q());
                        return;
                    }
                    return;
                }
            }
            long longValue2 = ((Long) objArr[0]).longValue();
            TL_bots.BotMenuButton botMenuButton = (TL_bots.BotMenuButton) objArr[1];
            if (longValue2 == this.R2) {
                if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                    TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                    this.j0 = tL_botMenuButton.text;
                    this.k0 = tL_botMenuButton.url;
                    this.r5 = 3;
                } else if (this.q2) {
                    this.r5 = 2;
                } else {
                    this.r5 = 1;
                }
                C1(false);
                return;
            }
            return;
        }
        if (((Integer) objArr[0]).intValue() != this.H2) {
            return;
        }
        this.j1 = 0L;
        Object obj = objArr[1];
        if (obj instanceof org.telegram.messenger.b20) {
            org.telegram.messenger.b20 b20Var = (org.telegram.messenger.b20) obj;
            this.f3 = b20Var;
            String str = (String) objArr[2];
            this.d3 = str;
            ArrayList<Bitmap> arrayList2 = (ArrayList) objArr[3];
            this.j1 = b20Var.r;
            a61 a61Var = this.g1;
            if (a61Var != null) {
                a61Var.setVideoPath(str);
                this.g1.setKeyframes(arrayList2);
                this.g1.setVisibility(0);
                this.g1.setMinProgressDiff(1000.0f / this.f3.r);
                v0();
            }
            M1(3, true);
            E(false);
            return;
        }
        this.c3 = (TLRPC.TL_document) obj;
        this.d3 = (String) objArr[2];
        boolean z10 = objArr.length >= 4 && ((Boolean) objArr[3]).booleanValue();
        float floatValue = objArr.length >= 5 ? ((Float) objArr[4]).floatValue() : 0.0f;
        float floatValue2 = objArr.length >= 6 ? ((Float) objArr[5]).floatValue() : 1.0f;
        if (this.c3 == null) {
            uf ufVar = this.a3;
            if (ufVar != null) {
                ufVar.G(null, true, 0, 0, 0L);
                return;
            }
            return;
        }
        T();
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
        long e10 = org.telegram.messenger.h10.i(this.R).e();
        tL_peerUser.user_id = e10;
        peer.user_id = e10;
        tL_message.date = (int) (System.currentTimeMillis() / 1000);
        tL_message.message = "";
        tL_message.attachPath = this.d3;
        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
        tL_message.media = tL_messageMediaDocument;
        tL_messageMediaDocument.flags |= 3;
        tL_messageMediaDocument.document = this.c3;
        tL_message.flags |= 768;
        this.e3 = new org.telegram.messenger.zi(org.telegram.messenger.h10.t0, tL_message, false, true);
        this.f1.setAlpha(1.0f);
        this.f1.setVisibility(0);
        this.h1.setVisibility(0);
        this.h1.setAlpha(0.0f);
        this.h1.setScaleY(0.0f);
        this.h1.setScaleX(0.0f);
        int i14 = 0;
        while (true) {
            if (i14 >= this.c3.attributes.size()) {
                d = 0.0d;
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = this.c3.attributes.get(i14);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                d = documentAttribute.duration;
                break;
            }
            i14++;
        }
        int i15 = 0;
        while (true) {
            if (i15 >= this.c3.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute2 = this.c3.attributes.get(i15);
            if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                byte[] bArr2 = documentAttribute2.waveform;
                if (bArr2 == null || bArr2.length == 0) {
                    documentAttribute2.waveform = MediaController.getWaveform(this.d3);
                }
                bArr = documentAttribute2.waveform;
            } else {
                i15++;
            }
        }
        if (z10 && (kVar = this.s1) != null) {
            this.w1 = 0.0f;
            kVar.setAlpha(0.0f);
            kVar.setScaleX(0.0f);
            kVar.setScaleY(0.0f);
        }
        this.j1 = (long) (1000.0d * d);
        mi0 mi0Var = this.i1;
        String str2 = this.d3;
        if (!mi0Var.R) {
            mi0Var.r = (float) d;
            mi0Var.s = floatValue;
            mi0Var.w = floatValue2;
            mi0Var.x = false;
            mi0Var.h.t(org.telegram.messenger.g0.g0((int) Math.round(Math.max(1.0d, d)), false, false), false, true);
            mi0Var.f.a(false, false);
            if (mi0Var.n == null) {
                m51 m51Var = new m51();
                mi0Var.n = m51Var;
                m51Var.K = new nh(mi0Var, 4);
            }
            mi0Var.n.j0(Uri.fromFile(new File(str2)), "other");
            mi0Var.L = 0;
            mi0Var.M = bArr;
            mi0Var.invalidate();
        }
        E(false);
        if (z10) {
            U();
            V();
            T();
            this.x2 = 1;
            this.O1.c(false);
            this.w3.set(this.O1, Float.valueOf(1.0f));
            yf yfVar = this.P1;
            if (yfVar != null) {
                yfVar.setVisibility(0);
                this.P1.setAlpha(1.0f);
            }
        }
        M1(3, !z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        kf kfVar = this.V0;
        if (kfVar == null || kfVar.getVisibility() != 0 || this.V0.getStickersExpandOffset() == 0.0f) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.save();
        canvas.clipRect(0, org.telegram.messenger.g0.L(2.0f), getMeasuredWidth(), getMeasuredHeight());
        canvas.translate(0.0f, -this.V0.getStickersExpandOffset());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        View view2 = this.H1;
        sd sdVar = this.A1;
        boolean z10 = view == view2 || view == sdVar;
        if (z10) {
            float measuredHeight = getMeasuredHeight() - this.k5.f;
            canvas.save();
            if (view == sdVar) {
                canvas.clipRect(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
            }
            if (view == this.H1) {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
            }
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (z10) {
            canvas.restore();
        }
        return drawChild;
    }

    public final void e1(CharSequence charSequence, boolean z10) {
        ve veVar = this.F0;
        if (veVar == null) {
            return;
        }
        this.S2 = true;
        veVar.setText(charSequence);
        this.F0.g(true);
        ve veVar2 = this.F0;
        veVar2.setSelection(veVar2.getText().length());
        this.S2 = false;
        uf ufVar = this.a3;
        if (ufVar != null) {
            ufVar.Y0(this.F0.getText(), true, z10);
        }
    }

    public final int f0(int i3) {
        org.telegram.ui.ActionBar.e6 e6Var = this.X3;
        return e6Var != null ? e6Var.h(i3) : org.telegram.ui.ActionBar.k6.x0(null, i3, false);
    }

    public final void f1(boolean z10, boolean z11) {
        this.I2 = z10;
        E(z11);
    }

    public final boolean g0() {
        return this.r5 == 3;
    }

    public void g1(float f10, float f11, float f12, boolean z10) {
        int L;
        float f13 = 1.0f - f12;
        float f14 = f10 * f13;
        float f15 = f11 * f13;
        this.r = (f12 * 0.5f) + 0.5f;
        this.s = f12;
        G1();
        float f16 = -f14;
        this.R0.setTranslationX(f16);
        if (this.F0 == null) {
            L = 0;
        } else {
            int L2 = org.telegram.messenger.g0.L(40.0f);
            fn0 fn0Var = this.q0;
            L = L2 + ((fn0Var == null || fn0Var.getVisibility() != 0) ? 0 : org.telegram.messenger.g0.L(18.0f));
        }
        this.I = f16 - (L * f13);
        fh0 fh0Var = this.h1;
        if (fh0Var != null) {
            fh0Var.setTranslationX(f16);
        }
        RecordCircle recordCircle = this.O1;
        if (recordCircle != null) {
            recordCircle.setTranslationX(f15);
        }
        yf yfVar = this.P1;
        if (yfVar != null) {
            yfVar.setTranslationX(f15);
        }
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            linearLayout.setTranslationX(f16);
        }
        sd sdVar = this.B1;
        sdVar.setTranslationX(f15);
        sdVar.setAlpha(f12);
        ImageView imageView = this.x1;
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
        B1();
        K1();
        float f17 = f14 * f13;
        if (this.J != f17) {
            this.J = f17;
            mi0 mi0Var = this.i1;
            if (mi0Var != null) {
                mi0Var.setTranslationX(f17);
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

    public org.telegram.ui.ActionBar.h1 getAdjustPanLayoutHelper() {
        return this.V;
    }

    public int getAnimatedTop() {
        return this.U1;
    }

    public ImageView getAttachButton() {
        return this.s1;
    }

    public View getAudioVideoButtonContainer() {
        return this.a1;
    }

    public int getBackgroundTop() {
        int top = getTop();
        View view = this.H1;
        return (view == null || view.getVisibility() != 0) ? top : top + this.H1.getLayoutParams().height;
    }

    public ii.r3 getBotWebViewButton() {
        if (this.l0 == null) {
            Context context = getContext();
            ii.r3 r3Var = new ii.r3(context);
            r3Var.a = new Path();
            r3Var.c = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false);
            r3Var.d = true;
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setSingleLine();
            textView.setAlpha(0.0f);
            textView.setGravity(17);
            textView.setTypeface(org.telegram.messenger.g0.o());
            r3Var.addView(textView, b8.mf.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context, null);
            radialProgressView.setSize(org.telegram.messenger.g0.L(18.0f));
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.0f);
            radialProgressView.setScaleY(0.0f);
            r3Var.addView(radialProgressView, b8.mf.d(28, 28.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            View view = new View(context);
            r3Var.h = view;
            int i3 = org.telegram.ui.ActionBar.k6.Ei;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i3, false), 2, -1);
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
            view.setBackground(h02);
            org.telegram.ui.ActionBar.r6.k(view, h02, null, N, null);
            r3Var.addView(view, b8.mf.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            r3Var.setWillNotDraw(false);
            this.l0 = r3Var;
            r3Var.setVisibility(8);
            N();
            this.l0.setBotMenuButton(this.m0);
            this.z1.addView(this.l0, b8.mf.e(-1, -1, 80));
        }
        return this.l0;
    }

    public int getCursorPosition() {
        ve veVar = this.F0;
        if (veVar == null) {
            return 0;
        }
        return veVar.getSelectionStart();
    }

    public CharSequence getDraftMessage() {
        if (this.a2 != null) {
            if (TextUtils.isEmpty(this.W1)) {
                return null;
            }
            return this.W1;
        }
        if (this.F0 == null || !h0()) {
            return null;
        }
        return this.F0.getText();
    }

    @Override // org.telegram.ui.Components.mw0
    public Editable getEditText() {
        ve veVar = this.F0;
        if (veVar == null) {
            return null;
        }
        return veVar.getText();
    }

    public org.telegram.messenger.zi getEditingMessageObject() {
        return this.a2;
    }

    public long getEffectId() {
        return this.T4;
    }

    public View getEmojiButton() {
        return this.R0;
    }

    public int getEmojiPadding() {
        return this.B2;
    }

    public ey getEmojiView() {
        return this.V0;
    }

    public float getExitTransition() {
        return this.n4;
    }

    @Override // org.telegram.ui.Components.mw0
    public CharSequence getFieldText() {
        if (this.F0 == null || !h0()) {
            return null;
        }
        return this.F0.getText();
    }

    public int getHeightWithTopView() {
        int measuredHeight = getMeasuredHeight();
        View view = this.H1;
        return (view == null || view.getVisibility() != 0) ? measuredHeight : (int) (measuredHeight - ((1.0f - getTopViewEnterProgress()) * this.H1.getLayoutParams().height));
    }

    public float getLockAnimatedTranslation() {
        return this.m4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x007c, code lost:
    
        if (r6.f3 == null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int getMessagesCount() {
        org.telegram.messenger.dj djVar;
        org.telegram.messenger.bj bjVar;
        org.telegram.ui.wm wmVar = this.Q2;
        int size = (wmVar == null || (djVar = wmVar.w5) == null || (bjVar = djVar.b) == null) ? 0 : bjVar.g.size();
        ve veVar = this.F0;
        if (veVar == null || TextUtils.isEmpty(veVar.getText())) {
            if (this.e3 == null) {
            }
            size++;
        } else {
            String obj = this.F0.getText().toString();
            org.telegram.messenger.p5 p5Var = org.telegram.messenger.yy.J;
            String trim = obj.trim();
            if (trim.length() != 0) {
                while (obj.startsWith("\n")) {
                    obj = obj.substring(1);
                }
                while (obj.endsWith("\n")) {
                    obj = com.google.android.recaptcha.internal.a.j(obj, 1, 0);
                }
                trim = obj;
            }
            int u12 = org.telegram.messenger.hp.s1(this.S.a).u1();
            if (trim.length() != 0) {
                size += (int) Math.ceil(trim.length() / u12);
            }
            size++;
        }
        return Math.max(1, size);
    }

    public RecordCircle getRecordCircle() {
        return this.O1;
    }

    public long getRecordTimerStartTime() {
        dg dgVar = this.Z0;
        if (dgVar == null || !dgVar.a) {
            return 0L;
        }
        return dgVar.d;
    }

    public org.telegram.messenger.zi getReplyingMessageObject() {
        return this.U2;
    }

    public int getSelectionLength() {
        ve veVar = this.F0;
        if (veVar == null) {
            return 0;
        }
        try {
            return veVar.getSelectionEnd() - this.F0.getSelectionStart();
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

    public org.telegram.messenger.ej getSendMessageSuggestionParams() {
        org.telegram.ui.wm wmVar = this.Q2;
        if (wmVar != null) {
            return wmVar.x5;
        }
        return null;
    }

    public long getSendMonoForumPeerId() {
        org.telegram.ui.wm wmVar = this.Q2;
        if (wmVar != null) {
            return wmVar.h9();
        }
        return 0L;
    }

    public fn0 getSenderSelectView() {
        return this.q0;
    }

    public qt0 getSizeNotifierLayout() {
        return this.n1;
    }

    public float getSlideToCancelProgress() {
        return this.k4;
    }

    public CharSequence getSlowModeTimer() {
        if (this.H0 > 0) {
            return ((org.telegram.ui.ActionBar.k5) this.G0.c).getText();
        }
        return null;
    }

    public long getStarsPrice() {
        org.telegram.ui.wm wmVar = this.Q2;
        return wmVar != null ? wmVar.getMessagesController().N1(wmVar.a()) : org.telegram.messenger.hp.s1(this.R).N1(this.R2);
    }

    public Drawable getStickersArrowDrawable() {
        return this.G3;
    }

    public int getStickersExpandedHeight() {
        return this.E3;
    }

    public ImageView getSuggestButton() {
        return this.x1;
    }

    public TLRPC.TL_textWithEntities getTextWithEntities() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {new SpannableStringBuilder(getEditText())};
        tL_textWithEntities.entities = org.telegram.messenger.li.b0(org.telegram.messenger.h10.t0).W(charSequenceArr, true, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        return tL_textWithEntities;
    }

    public float getTopViewEnterProgress() {
        return this.l5.e;
    }

    public float getTopViewHeight() {
        View view = this.H1;
        if (view == null || view.getVisibility() != 0) {
            return 0.0f;
        }
        return this.H1.getLayoutParams().height;
    }

    public float getTopViewTranslation() {
        View view = this.H1;
        if (view == null || view.getVisibility() == 8) {
            return 0.0f;
        }
        return this.H1.getTranslationY();
    }

    public z21 getTrendingStickersAlert() {
        return this.b3;
    }

    public int getVisibleEmojiPadding() {
        if (this.X0) {
            return this.B2;
        }
        return 0;
    }

    public float getVisualHeight() {
        float f10 = this.U1;
        View view = this.H1;
        if (view != null && view.getVisibility() == 0) {
            f10 += (1.0f - getTopViewEnterProgress()) * this.H1.getLayoutParams().height;
        }
        return getMeasuredHeight() - f10;
    }

    public final boolean h0() {
        ve veVar = this.F0;
        return veVar != null && veVar.length() > 0;
    }

    public final void h1(boolean z10) {
        if (this.q5 == z10) {
            return;
        }
        this.q5 = z10;
        this.s1.setVisibility(z10 ? 8 : 0);
        if (z10) {
            org.telegram.messenger.g0.E2(this.J1);
        }
        if (z10) {
            this.c1.setVisibility(8);
        } else {
            O0();
        }
        if (!z10) {
            this.d0 = -1;
            NumberTextView numberTextView = this.c0;
            if (numberTextView != null) {
                numberTextView.setVisibility(8);
            }
        }
        I1(this.Q4);
        E(false);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i0() {
        gi.l3 l3Var = this.O;
        if (l3Var != null) {
            l3Var.f(true);
        }
        gi.l3 l3Var2 = this.M;
        if (l3Var2 != null) {
            l3Var2.f(true);
        }
    }

    public final void i1(CharSequence charSequence, boolean z10) {
        this.e = charSequence;
        this.f = null;
        H1(z10);
    }

    public final void j0(boolean z10) {
        k0(z10, false, true);
    }

    public final void j1(boolean z10, boolean z11) {
        ce ceVar = this.c1;
        if (ceVar == null) {
            return;
        }
        this.d1 = z10;
        if (z11) {
            SharedPreferences e12 = org.telegram.messenger.hp.e1();
            boolean z12 = false;
            if (org.telegram.messenger.m5.z(this.R2)) {
                TLRPC.Chat M0 = org.telegram.messenger.hp.s1(this.S.a).M0(Long.valueOf(-this.R2));
                if (org.telegram.messenger.t3.T(M0) && !M0.megagroup) {
                    z12 = true;
                }
            }
            e12.edit().putBoolean(z12 ? "currentModeVideoChannel" : "currentModeVideo", z10).apply();
        }
        ceVar.j(this.d1 ? fg.b : fg.a, z11);
        ceVar.setContentDescription(org.telegram.messenger.bd.M0(this.d1 ? 2131754736 : 2131754734, null));
        this.a1.setContentDescription(org.telegram.messenger.bd.M0(this.d1 ? 2131754736 : 2131754734, null));
        ceVar.sendAccessibilityEvent(8);
    }

    public final void k(TLRPC.Document document) {
        org.telegram.messenger.li.b0(this.R).c(document, (int) (System.currentTimeMillis() / 1000), true);
        kf kfVar = this.V0;
        if (kfVar == null || document == null) {
            return;
        }
        boolean isEmpty = kfVar.j1.isEmpty();
        kfVar.W();
        if (isEmpty) {
            kfVar.X(false);
        }
    }

    public final boolean k0(boolean z10, boolean z11, boolean z12) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        if (r0()) {
            if (this.g2 == 1 && (tL_replyKeyboardMarkup = this.o2) != null && z10 && this.n2 != null) {
                if (!tL_replyKeyboardMarkup.is_persistent) {
                    org.telegram.messenger.hp.s1(this.R).e7.edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.n2.f1()).apply();
                }
            }
            if ((z10 && this.S1 != 0) || z11) {
                l1(0, true);
                kf kfVar = this.V0;
                if (kfVar != null) {
                    kfVar.t(true);
                }
                ve veVar = this.F0;
                if (veVar != null) {
                    veVar.requestFocus();
                }
                m1(false, true, false, true);
                if (this.z3) {
                    E(true);
                    return true;
                }
            } else {
                if (this.S1 == 0) {
                    if (this.A3) {
                        m1(false, true, false, true);
                        return true;
                    }
                    s1(0, 0, true, z12 && !z10);
                    return true;
                }
                l1(0, false);
                this.V0.t(false);
                ve veVar2 = this.F0;
                if (veVar2 != null) {
                    veVar2.requestFocus();
                }
            }
            return true;
        }
        return false;
    }

    public final void k1(org.telegram.messenger.zi ziVar, org.telegram.ui.mm mmVar, org.telegram.messenger.zi ziVar2) {
        org.telegram.messenger.zi ziVar3;
        org.telegram.ui.wm wmVar = this.Q2;
        boolean z10 = (wmVar == null || !wmVar.R9() || this.V2 == ziVar2) ? false : true;
        if (ziVar != null) {
            if (this.X2 == null && (ziVar3 = this.n2) != this.U2) {
                this.X2 = ziVar3;
            }
            this.U2 = ziVar;
            this.W2 = mmVar;
            this.V2 = ziVar2;
            if (wmVar == null || !wmVar.w4 || wmVar.m4 != ziVar) {
                Y0(ziVar, true, true);
            }
        } else if (this.U2 == this.n2) {
            this.U2 = null;
            this.V2 = null;
            this.W2 = null;
            Y0(this.X2, true, false);
            this.X2 = null;
        } else {
            this.U2 = null;
            this.W2 = null;
            this.V2 = null;
        }
        B(true);
        uf ufVar = this.a3;
        TL_stories.StoryItem R0 = ufVar != null ? ufVar.R0() : null;
        MediaController B = MediaController.B();
        org.telegram.messenger.zi threadMessage = getThreadMessage();
        B.r1 = ziVar;
        B.s1 = threadMessage;
        B.t1 = R0;
        H1(z10);
    }

    public final void l(TLRPC.Document document) {
        Q();
        kf kfVar = this.V0;
        int i3 = kfVar.d1;
        org.telegram.messenger.li.b0(i3).d(0, null, document, (int) (System.currentTimeMillis() / 1000), false);
        boolean isEmpty = kfVar.k1.isEmpty();
        kfVar.k1 = org.telegram.messenger.li.b0(i3).i0(0, true);
        vx vxVar = kfVar.z0;
        if (vxVar != null) {
            vxVar.f();
        }
        if (isEmpty) {
            kfVar.X(false);
        }
    }

    public final void l0(boolean z10) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2 = this.v2;
        if (animatorSet2 == null || !animatorSet2.isRunning()) {
            this.d3 = null;
            this.c3 = null;
            this.e3 = null;
            this.f3 = null;
            a61 a61Var = this.g1;
            int i3 = 1;
            if (a61Var != null) {
                a61Var.a(true);
            }
            ce ceVar = this.c1;
            if (ceVar != null) {
                ceVar.setVisibility(0);
            }
            rd rdVar = this.e4;
            rd rdVar2 = this.a4;
            rd rdVar3 = this.c4;
            Property property = View.SCALE_Y;
            Property property2 = View.SCALE_X;
            ud udVar = this.R0;
            Property property3 = View.ALPHA;
            lg.k kVar = this.s1;
            if (z10) {
                if (kVar != null) {
                    this.w1 = 0.0f;
                    kVar.setAlpha(0.0f);
                    kVar.setScaleX(0.0f);
                    kVar.setScaleY(0.0f);
                }
                this.n = 0.0f;
                this.h = 0.0f;
                G1();
                this.v2 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(udVar, rdVar3, this.B0 ? 0.5f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(udVar, rdVar2, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.h1, (Property<fh0, Float>) property3, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.h1, (Property<fh0, Float>) property2, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.h1, (Property<fh0, Float>) property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f1, (Property<sd, Float>) property3, 0.0f));
                if (kVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator = this.r1;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        this.r1 = null;
                    }
                    this.w1 = 1.0f;
                    arrayList.add(ObjectAnimator.ofFloat(kVar, (Property<lg.k, Float>) property3, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(kVar, (Property<lg.k, Float>) property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(kVar, (Property<lg.k, Float>) property, 1.0f));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.F0, (Property<ve, Float>) property3, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.F0, rdVar, 0.0f));
                yf yfVar = this.P1;
                if (yfVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(yfVar, (Property<yf, Float>) property3, 0.0f));
                    this.P1.a();
                }
                this.v2.playTogether(arrayList);
                ii.a0 a0Var = this.m0;
                if (a0Var != null) {
                    a0Var.setAlpha(0.0f);
                    this.m0.setScaleY(0.0f);
                    this.m0.setScaleX(0.0f);
                    this.v2.playTogether(ObjectAnimator.ofFloat(this.m0, (Property<ii.a0, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.m0, (Property<ii.a0, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.m0, (Property<ii.a0, Float>) property, 1.0f));
                }
                this.v2.setDuration(150L);
                this.v2.addListener(new fe(this, i3));
            } else {
                fh0 fh0Var = this.h1;
                if (fh0Var != null) {
                    fh0Var.d();
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                boolean z11 = this.d1;
                Property property4 = View.TRANSLATION_X;
                if (z11) {
                    arrayList2.add(ObjectAnimator.ofFloat(this.g1, (Property<a61, Float>) property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.g1, (Property<a61, Float>) property4, -org.telegram.messenger.g0.L(20.0f)));
                    arrayList2.add(ObjectAnimator.ofFloat(this.F0, rdVar, 0.0f));
                    yf yfVar2 = this.P1;
                    if (yfVar2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(yfVar2, (Property<yf, Float>) property3, 0.0f));
                        this.P1.a();
                    }
                    animatorSet3.playTogether(arrayList2);
                    if (this.s == 1.0f) {
                        animatorSet3.playTogether(ObjectAnimator.ofFloat(this.F0, (Property<ve, Float>) property3, 1.0f));
                    } else {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.F0, (Property<ve, Float>) property3, 1.0f);
                        ofFloat.setStartDelay(750L);
                        ofFloat.setDuration(200L);
                        animatorSet3.playTogether(ofFloat);
                    }
                } else {
                    ve veVar = this.F0;
                    if (veVar == null || this.s != 1.0f) {
                        this.H = 0.0f;
                        K1();
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.F0, (Property<ve, Float>) property3, 1.0f);
                        ofFloat2.setStartDelay(750L);
                        ofFloat2.setDuration(200L);
                        animatorSet3.playTogether(ofFloat2);
                    } else {
                        veVar.setAlpha(1.0f);
                        this.H = 0.0f;
                        K1();
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(this.i1, (Property<mi0, Float>) property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.i1, (Property<mi0, Float>) property4, -org.telegram.messenger.g0.L(20.0f)));
                    yf yfVar3 = this.P1;
                    if (yfVar3 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(yfVar3, (Property<yf, Float>) property3, 0.0f));
                        this.P1.a();
                    }
                    animatorSet3.playTogether(arrayList2);
                }
                animatorSet3.setDuration(200L);
                if (kVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.r1;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.r1 = null;
                    }
                    this.w1 = 0.0f;
                    kVar.setAlpha(0.0f);
                    kVar.setScaleX(0.0f);
                    kVar.setScaleY(0.0f);
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    this.w1 = 1.0f;
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(kVar, (Property<lg.k, Float>) property3, 1.0f), ObjectAnimator.ofFloat(kVar, (Property<lg.k, Float>) property2, 1.0f), ObjectAnimator.ofFloat(kVar, (Property<lg.k, Float>) property, 1.0f));
                    animatorSet4.setDuration(150L);
                    animatorSet = animatorSet4;
                } else {
                    animatorSet = null;
                }
                this.h = 0.0f;
                this.n = 0.0f;
                G1();
                AnimatorSet animatorSet5 = new AnimatorSet();
                animatorSet5.playTogether(ObjectAnimator.ofFloat(this.h1, (Property<fh0, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.h1, (Property<fh0, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.h1, (Property<fh0, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.h1, (Property<fh0, Float>) property3, 0.0f), ObjectAnimator.ofFloat(udVar, rdVar3, this.B0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(udVar, rdVar2, 1.0f));
                ii.a0 a0Var2 = this.m0;
                if (a0Var2 != null) {
                    a0Var2.setAlpha(0.0f);
                    this.m0.setScaleY(0.0f);
                    this.m0.setScaleX(0.0f);
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this.m0, (Property<ii.a0, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.m0, (Property<ii.a0, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.m0, (Property<ii.a0, Float>) property, 1.0f));
                }
                animatorSet5.setDuration(150L);
                animatorSet5.setStartDelay(600L);
                AnimatorSet animatorSet6 = new AnimatorSet();
                this.v2 = animatorSet6;
                if (animatorSet != null) {
                    animatorSet6.playTogether(animatorSet3, animatorSet, animatorSet5);
                } else {
                    animatorSet6.playTogether(animatorSet3, animatorSet5);
                }
                this.v2.addListener(new ye(this));
            }
            AnimatorSet animatorSet7 = this.v2;
            if (animatorSet7 != null) {
                animatorSet7.start();
            }
            yf yfVar4 = this.P1;
            if (yfVar4 != null) {
                yfVar4.invalidate();
            }
        }
    }

    public final void l1(int i3, boolean z10) {
        boolean z11 = i3 != 0;
        if (z11 != (this.S1 != 0)) {
            ValueAnimator valueAnimator = this.w0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.w0.cancel();
            }
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x0, z11 ? 1.0f : 0.0f);
                this.w0 = ofFloat;
                ofFloat.addUpdateListener(new xc(this, 4));
                this.w0.addListener(new je(this, z11, 3));
                this.w0.setDuration(220L);
                this.w0.setInterpolator(xq.f);
                this.w0.start();
            } else {
                this.x0 = z11 ? 1.0f : 0.0f;
                kf kfVar = this.V0;
                if (kfVar != null) {
                    kfVar.Z();
                }
            }
        }
        this.S1 = i3;
    }

    public final ValueAnimator m(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.K1.a, f10);
        ofFloat.addUpdateListener(new xc(this, 5));
        return ofFloat;
    }

    public final void m0() {
        this.d3 = null;
        this.c3 = null;
        this.e3 = null;
        this.f3 = null;
        a61 a61Var = this.g1;
        if (a61Var != null) {
            a61Var.a(true);
        }
        mi0 mi0Var = this.i1;
        if (mi0Var != null) {
            mi0Var.setAlpha(1.0f);
            this.i1.setTranslationX(0.0f);
        }
        a61 a61Var2 = this.g1;
        if (a61Var2 != null) {
            a61Var2.setAlpha(1.0f);
            this.g1.setTranslationX(0.0f);
        }
        ve veVar = this.F0;
        if (veVar != null) {
            veVar.setAlpha(1.0f);
            this.H = 0.0f;
            K1();
            this.F0.requestFocus();
        }
        sd sdVar = this.f1;
        if (sdVar != null) {
            sdVar.setVisibility(8);
        }
        v0();
    }

    public final void m1(boolean z10, boolean z11, boolean z12, boolean z13) {
        final int i3 = 1;
        org.telegram.ui.ActionBar.h1 h1Var = this.V;
        if ((h1Var != null && h1Var.f) || this.m3 || this.V0 == null) {
            return;
        }
        if (z12 || this.A3 != z10) {
            this.A3 = z10;
            uf ufVar = this.a3;
            if (ufVar != null) {
                ufVar.g1();
            }
            Point point = org.telegram.messenger.g0.q;
            final int i10 = point.x > point.y ? this.z2 : this.y2;
            AnimatorSet animatorSet = this.C3;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.C3 = null;
            }
            boolean z14 = this.A3;
            g2.g gVar = this.M3;
            org.telegram.ui.Cells.g1 g1Var = this.u3;
            final int i11 = 0;
            qt0 qt0Var = this.n1;
            if (z14) {
                if (z13) {
                    org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.j1, 1);
                }
                int height = qt0Var.getHeight();
                this.p1 = height;
                int L = ((((height - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.n) - org.telegram.messenger.g0.L(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getHeight();
                this.E3 = L;
                if (this.S1 == 2) {
                    this.E3 = Math.min(L, org.telegram.messenger.g0.L(175.0f) + i10);
                }
                if (this.i5 == null) {
                    this.V0.getLayoutParams().height = this.E3;
                }
                qt0Var.requestLayout();
                if (this.z4) {
                    qt0Var.setForeground(new mc(this));
                }
                ve veVar = this.F0;
                if (veVar != null) {
                    int selectionStart = veVar.getSelectionStart();
                    int selectionEnd = this.F0.getSelectionEnd();
                    ve veVar2 = this.F0;
                    veVar2.setText(veVar2.getText());
                    this.F0.setSelection(selectionStart, selectionEnd);
                }
                if (z11) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    if (this.i5 != null) {
                        animatorSet2.playTogether(ValueAnimator.ofInt(-(this.E3 - i10)), ValueAnimator.ofInt(-(this.E3 - i10)), ObjectAnimator.ofFloat(this.G3, "animationProgress", 1.0f));
                    } else {
                        animatorSet2.playTogether(ObjectAnimator.ofInt(this, g1Var, -(this.E3 - i10)), ObjectAnimator.ofInt(this.V0, g1Var, -(this.E3 - i10)), ObjectAnimator.ofFloat(this.G3, "animationProgress", 1.0f));
                    }
                    animatorSet2.setDuration(300L);
                    animatorSet2.setInterpolator(xq.f);
                    if (this.i5 == null) {
                        ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.fd
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
                                        int i14 = ChatActivityEnterView.t5;
                                        chatActivityEnterView.D3 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.E3 - i13)));
                                        chatActivityEnterView.n1.invalidate();
                                        break;
                                    default:
                                        int i15 = ChatActivityEnterView.t5;
                                        chatActivityEnterView.D3 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.E3 - i13));
                                        chatActivityEnterView.n1.invalidate();
                                        break;
                                }
                            }
                        });
                    }
                    animatorSet2.addListener(new fe(this, 12));
                    this.C3 = animatorSet2;
                    this.V0.setLayerType(2, null);
                    gVar.d();
                    this.D3 = 0.0f;
                    qt0Var.invalidate();
                    animatorSet2.start();
                } else {
                    this.D3 = 1.0f;
                    if (this.i5 == null) {
                        setTranslationY(-(this.E3 - i10));
                        this.V0.setTranslationY(-(this.E3 - i10));
                    }
                    AnimatedArrowDrawable animatedArrowDrawable = this.G3;
                    if (animatedArrowDrawable != null) {
                        animatedArrowDrawable.setAnimationProgress(1.0f);
                    }
                }
                sh.e eVar = this.i5;
                if (eVar != null) {
                    ((sh.h) eVar).h(this.E3);
                }
            } else {
                if (z13) {
                    org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.k1, 1);
                }
                if (z11) {
                    this.B3 = true;
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    if (this.i5 != null) {
                        animatorSet3.playTogether(ValueAnimator.ofInt(0), ValueAnimator.ofInt(0), ObjectAnimator.ofFloat(this.G3, "animationProgress", 0.0f));
                    } else {
                        animatorSet3.playTogether(ObjectAnimator.ofInt(this, g1Var, 0), ObjectAnimator.ofInt(this.V0, g1Var, 0), ObjectAnimator.ofFloat(this.G3, "animationProgress", 0.0f));
                    }
                    animatorSet3.setDuration(300L);
                    animatorSet3.setInterpolator(xq.f);
                    if (this.i5 == null) {
                        ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.fd
                            public final /* synthetic */ ChatActivityEnterView b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                int i12 = i3;
                                int i13 = i10;
                                ChatActivityEnterView chatActivityEnterView = this.b;
                                switch (i12) {
                                    case 0:
                                        int i14 = ChatActivityEnterView.t5;
                                        chatActivityEnterView.D3 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.E3 - i13)));
                                        chatActivityEnterView.n1.invalidate();
                                        break;
                                    default:
                                        int i15 = ChatActivityEnterView.t5;
                                        chatActivityEnterView.D3 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.E3 - i13));
                                        chatActivityEnterView.n1.invalidate();
                                        break;
                                }
                            }
                        });
                    }
                    animatorSet3.addListener(new of(this, i10, i3));
                    this.D3 = 1.0f;
                    qt0Var.invalidate();
                    this.C3 = animatorSet3;
                    this.V0.setLayerType(2, null);
                    gVar.d();
                    animatorSet3.start();
                } else {
                    this.D3 = 0.0f;
                    if (this.i5 == null) {
                        setTranslationY(0.0f);
                        this.V0.setTranslationY(0.0f);
                        this.V0.getLayoutParams().height = i10;
                    }
                    qt0Var.requestLayout();
                    qt0Var.setForeground(null);
                    qt0Var.setWillNotDraw(false);
                    AnimatedArrowDrawable animatedArrowDrawable2 = this.G3;
                    if (animatedArrowDrawable2 != null) {
                        animatedArrowDrawable2.setAnimationProgress(0.0f);
                    }
                }
                sh.e eVar2 = this.i5;
                if (eVar2 != null) {
                    ((sh.h) eVar2).h(i10);
                }
            }
            ie ieVar = this.T0;
            if (ieVar != null) {
                if (this.A3) {
                    ieVar.setContentDescription(org.telegram.messenger.bd.M0(2131754893, "AccDescrCollapsePanel"));
                } else {
                    ieVar.setContentDescription(org.telegram.messenger.bd.M0(2131754883, "AccDescrExpandPanel"));
                }
            }
        }
    }

    public final ValueAnimator n(boolean z10) {
        final float alpha = getSendButtonInternal().getAlpha();
        final float f10 = z10 ? 1.0f : 0.0f;
        final float scaleX = getSendButtonInternal().getScaleX();
        final float f11 = z10 ? 1.0f : 0.1f;
        final float scaleY = getSendButtonInternal().getScaleY();
        final float f12 = z10 ? 1.0f : 0.1f;
        if (z10 && alpha < 0.25f && (getSendButtonInternal() instanceof bg)) {
            bg bgVar = (bg) getSendButtonInternal();
            bgVar.f0.e(true, 0.0f);
            bgVar.invalidate();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.id
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i3 = ChatActivityEnterView.t5;
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

    public void n0(boolean z10) {
        if (this.H1 == null || !this.g3) {
            return;
        }
        yc ycVar = this.W;
        if (ycVar != null) {
            org.telegram.messenger.g0.r(ycVar);
        }
        this.g3 = false;
        this.h3 = false;
        if (this.i3) {
            this.l5.a(false, z10);
        }
    }

    public final void n1(boolean z10, boolean z11) {
        if (this.w4 == z10 && z11) {
            return;
        }
        ImageView imageView = this.x1;
        if (imageView == null) {
            if (!z10 && !this.q5) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = new ImageView(getContext());
                this.x1 = imageView2;
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                ImageView imageView3 = this.x1;
                int i3 = org.telegram.ui.ActionBar.k6.Kl;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                org.telegram.ui.ActionBar.e6 e6Var = this.X3;
                org.telegram.ui.ActionBar.r6.t(imageView3, i3, e6Var, mode);
                this.x1.setImageResource(R.drawable.input_suggest_paid_24);
                ImageView imageView4 = this.x1;
                int i10 = org.telegram.ui.ActionBar.k6.i6;
                org.telegram.ui.ActionBar.r6.R(imageView4, org.telegram.ui.ActionBar.k6.h0(f0(i10), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i10), e6Var);
                if (this.q5) {
                    this.x1.setTranslationX(org.telegram.messenger.g0.L(42.0f));
                    this.A1.addView(this.x1, b8.mf.d(44, 44.0f, 85, 0.0f, 0.0f, 50.0f, 0.0f));
                } else {
                    this.q1.addView(this.x1, 0, b8.mf.o(44, 44));
                }
                this.x1.setOnClickListener(new ad(this, 19));
                this.x1.setContentDescription(org.telegram.messenger.bd.M0(2131754921, null));
            }
        }
        boolean z12 = this.w4 != z10;
        this.w4 = z10;
        float f10 = z10 ? 1.0f : 0.6f;
        float f11 = z10 ? 1.0f : 0.0f;
        this.x1.setEnabled(z10);
        this.x1.setClickable(z10);
        ValueAnimator valueAnimator = this.x4;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.x4 = null;
        }
        if (z11) {
            if (this.q5) {
                this.x1.setVisibility(0);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x1.getAlpha(), f11);
            this.x4 = ofFloat;
            ofFloat.addUpdateListener(new xc(this, 7));
            this.x4.addListener(new je(this, z10, r3));
            this.x4.setDuration(220L);
            this.x4.setInterpolator(xq.h);
            this.x4.start();
        } else {
            this.x1.setScaleX(f10);
            this.x1.setScaleY(f10);
            this.x1.setAlpha(f11);
            if (this.q5) {
                this.x1.setVisibility(z10 ? 0 : 8);
            }
        }
        I1(this.Q4);
        if (z12) {
            E(true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        if ((r4.getLineRight(0) + r3) >= ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight())) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o0() {
        ve veVar = this.F0;
        if (veVar != null) {
            if (TextUtils.isEmpty(veVar.getCaption())) {
                ve veVar2 = this.F0;
                int L = org.telegram.messenger.g0.L(44.0f);
                Layout layout = veVar2.getLayout();
                if (layout != null) {
                    if (layout.getLineCount() > 0) {
                        if (layout.getLineCount() <= 1) {
                        }
                    }
                }
            }
        }
        return org.telegram.messenger.bd.a0;
    }

    public final void o1(boolean z10) {
        org.telegram.ui.wm wmVar;
        int i3 = 0;
        boolean z11 = ((!z10 && !this.E1) || (wmVar = this.Q2) == null || wmVar.z()) ? false : true;
        if (this.L4 == z11) {
            return;
        }
        if (z11) {
            org.telegram.messenger.hp.s1(this.R).R1().b();
        }
        this.L4 = z11;
        ImageView imageView = this.u1;
        imageView.setVisibility(0);
        imageView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).setInterpolator(xq.h).setDuration(420L).withEndAction(new gd(this, z11, i3)).start();
        if (!z11) {
            gi.l3 l3Var = this.N;
            if (l3Var != null) {
                l3Var.f(true);
                this.N = null;
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.s2 s2Var = this.t1;
        Objects.requireNonNull(s2Var);
        imageView.postDelayed(new h0(s2Var, 1), 220L);
        gi.l3 l3Var2 = this.N;
        if (l3Var2 != null) {
            l3Var2.f(true);
            this.N = null;
        }
        if (org.telegram.messenger.hp.e1().getInt("aihintshown", 0) < 3) {
            gi.l3 l3Var3 = new gi.l3(getContext(), 3);
            this.N = l3Var3;
            l3Var3.r(true);
            this.N.u(org.telegram.messenger.bd.M0(2131754992, null));
            setHintGlass(this.N);
            this.N.p(0.0f, (imageView.getWidth() / 2.0f) + org.telegram.messenger.g0.L(4.0f));
            addView(this.N, b8.mf.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
            gi.l3 l3Var4 = this.N;
            l3Var4.r0 = new org.telegram.ui.lo(11, this, l3Var3);
            l3Var4.d = 4000L;
            l3Var4.w();
            org.telegram.messenger.hp.e1().edit().putInt("aihintshown", org.telegram.messenger.hp.e1().getInt("aihintshown", 0) + 1).apply();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        le leVar = this.r0;
        if (leVar != null) {
            leVar.e = false;
            leVar.dismiss();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        b0(canvas, true);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View X;
        if (this.G2) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0 && (X = org.telegram.messenger.g0.X(this, motionEvent.getX(), motionEvent.getY())) != this.M && X != this.N) {
            i0();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        te teVar;
        super.onLayout(z10, i3, i10, i11, i12);
        if (this.a5 == -1 || (teVar = this.n0) == null) {
            return;
        }
        u4.b0 b0Var = (u4.b0) teVar.c.getLayoutManager();
        if (b0Var != null) {
            b0Var.h1(this.a5, this.b5);
        }
        this.a5 = -1;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        sd sdVar = this.A1;
        int measuredHeight = sdVar.getMeasuredHeight();
        ii.a0 a0Var = this.m0;
        ImageView imageView = this.S0;
        ud udVar = this.R0;
        int i11 = 0;
        if (a0Var == null || a0Var.getTag() == null) {
            fn0 fn0Var = this.q0;
            if (fn0Var == null || fn0Var.getVisibility() != 0) {
                ((ViewGroup.MarginLayoutParams) udVar.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(3.0f);
                if (imageView != null) {
                    ((ViewGroup.MarginLayoutParams) imageView.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(3.0f);
                }
                ve veVar = this.F0;
                if (veVar != null) {
                    ((ViewGroup.MarginLayoutParams) veVar.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(50.0f);
                }
                org.telegram.messenger.st stVar = this.D1;
                if (stVar != null) {
                    ((ViewGroup.MarginLayoutParams) stVar.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(50.0f);
                }
            } else {
                int i12 = this.q0.getLayoutParams().width;
                this.q0.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.q0.getLayoutParams().height, TLObject.FLAG_30));
                ((ViewGroup.MarginLayoutParams) udVar.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(7.0f) + i12;
                if (imageView != null) {
                    ((ViewGroup.MarginLayoutParams) imageView.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(7.0f) + i12;
                }
                ve veVar2 = this.F0;
                if (veVar2 != null) {
                    ((ViewGroup.MarginLayoutParams) veVar2.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(54.0f) + i12;
                }
                org.telegram.messenger.st stVar2 = this.D1;
                if (stVar2 != null) {
                    ((ViewGroup.MarginLayoutParams) stVar2.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(54.0f) + i12;
                }
            }
        } else {
            this.m0.measure(i3, i10);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) udVar.getLayoutParams();
            int L = org.telegram.messenger.g0.L(10.0f);
            ii.a0 a0Var2 = this.m0;
            marginLayoutParams.leftMargin = L + (a0Var2 == null ? 0 : a0Var2.getMeasuredWidth());
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int L2 = org.telegram.messenger.g0.L(10.0f);
                ii.a0 a0Var3 = this.m0;
                marginLayoutParams2.leftMargin = L2 + (a0Var3 == null ? 0 : a0Var3.getMeasuredWidth());
            }
            ve veVar3 = this.F0;
            if (veVar3 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) veVar3.getLayoutParams();
                int L3 = org.telegram.messenger.g0.L(57.0f);
                ii.a0 a0Var4 = this.m0;
                marginLayoutParams3.leftMargin = L3 + (a0Var4 == null ? 0 : a0Var4.getMeasuredWidth());
            }
            org.telegram.messenger.st stVar3 = this.D1;
            if (stVar3 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) stVar3.getLayoutParams();
                int L4 = org.telegram.messenger.g0.L(57.0f);
                ii.a0 a0Var5 = this.m0;
                marginLayoutParams4.leftMargin = L4 + (a0Var5 == null ? 0 : a0Var5.getMeasuredWidth());
            }
        }
        D1();
        super.onMeasure(i3, i10);
        ii.r3 r3Var = this.l0;
        if (r3Var != null) {
            ii.a0 a0Var6 = this.m0;
            if (a0Var6 != null) {
                r3Var.setMeasuredButtonWidth(a0Var6.getMeasuredWidth());
            }
            this.l0.getLayoutParams().height = getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f);
            measureChild(this.l0, i3, i10);
        }
        H();
        I();
        if (measuredHeight <= 0 || sdVar.getMeasuredHeight() == measuredHeight) {
            return;
        }
        while (i11 < 2) {
            ImageView imageView2 = i11 == 0 ? this.u1 : this.v1;
            imageView2.setTranslationY((imageView2.getTranslationY() + sdVar.getMeasuredHeight()) - measuredHeight);
            imageView2.animate().translationY(0.0f).setInterpolator(xq.h).setDuration(420L).start();
            i11++;
        }
        gi.l3 l3Var = this.N;
        if (l3Var != null) {
            l3Var.setTranslationY((l3Var.getTranslationY() + sdVar.getMeasuredHeight()) - measuredHeight);
            org.telegram.messenger.camera.q.l(this.N.animate().translationY(0.0f), xq.h, 420L);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        if (i3 != i11 && this.A3) {
            l1(0, false);
            this.V0.t(false);
            m1(false, false, false, true);
        }
        a61 a61Var = this.g1;
        if (a61Var != null) {
            ArrayList arrayList = a61Var.w;
            if (a61Var.O.isEmpty()) {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    Bitmap bitmap = (Bitmap) arrayList.get(i13);
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                }
            }
            arrayList.clear();
            x51 x51Var = a61Var.x;
            if (x51Var != null) {
                x51Var.cancel(true);
                a61Var.x = null;
            }
            a61Var.invalidate();
        }
    }

    public final void p(org.telegram.messenger.wy wyVar) {
        uf ufVar = this.a3;
        if (ufVar != null) {
            wyVar.H = ufVar.R0();
            wyVar.J = this.a3.i0();
        }
    }

    public final boolean p0() {
        return this.a2 != null;
    }

    public final void p1() {
        org.telegram.ui.wm wmVar = this.Q2;
        if (wmVar == null || !org.telegram.messenger.t3.V(wmVar.e)) {
            return;
        }
        fc.a0(wmVar).f(org.telegram.messenger.hp.s1(this.R).U4, new yc(this, 3)).j();
    }

    public boolean q() {
        return false;
    }

    public final boolean q0() {
        return this.d1;
    }

    public boolean q1(Runnable runnable) {
        return false;
    }

    public final void r() {
        if (this.V0.getParent() == null) {
            if (this.i5 == null) {
                this.o1.addView(this.V0);
            } else {
                this.o1.addView(this.V0, b8.mf.c(-1.0f, -1));
            }
        }
    }

    public final boolean r0() {
        return this.X0 || this.Y0;
    }

    public final void r1() {
        s1(1, 0, true, true);
    }

    public final boolean s() {
        ii.a0 a0Var = this.m0;
        return a0Var != null && a0Var.w;
    }

    public final boolean s0(View view) {
        return view == this.I1 || view == this.V0;
    }

    public final void s1(int i3, int i10, boolean z10, boolean z11) {
        int i11;
        boolean z12;
        boolean z13;
        int i12;
        ViewGroup viewGroup;
        int i13;
        float f10;
        if (i3 == 2) {
            return;
        }
        g2.g gVar = this.M3;
        he heVar = this.Z3;
        Property property = View.TRANSLATION_Y;
        boolean z14 = false;
        if (i3 == 1) {
            if (i10 == 0) {
                if (this.P2 == null && this.V0 == null) {
                    return;
                } else {
                    Q();
                }
            }
            if (i10 == 0) {
                r();
                if (this.X0) {
                    this.V0.getVisibility();
                }
                this.V0.setVisibility(0);
                this.X0 = true;
                gf gfVar = this.I1;
                if (gfVar == null || gfVar.getVisibility() == 8) {
                    i12 = 0;
                } else {
                    this.I1.setVisibility(8);
                    this.Y0 = false;
                    i12 = this.I1.getMeasuredHeight();
                }
                this.V0.setShowing(true);
                viewGroup = this.V0;
                this.p3 = 0;
            } else if (i10 == 1) {
                if (this.Y0) {
                    this.I1.getVisibility();
                }
                this.Y0 = true;
                kf kfVar = this.V0;
                if (kfVar == null || kfVar.getVisibility() == 8) {
                    i13 = 0;
                } else {
                    this.o1.removeView(this.V0);
                    this.V0.setVisibility(8);
                    this.V0.setShowing(false);
                    this.X0 = false;
                    i13 = this.V0.getMeasuredHeight();
                }
                this.I1.setVisibility(0);
                ViewGroup viewGroup2 = this.I1;
                this.p3 = 1;
                org.telegram.messenger.hp.s1(this.R).e7.edit().remove("closed_botkeyboard_" + getTopicKeyString()).apply();
                i12 = i13;
                viewGroup = viewGroup2;
            } else {
                i12 = 0;
                viewGroup = null;
            }
            this.g2 = i10;
            if (this.y2 <= 0) {
                f10 = 200.0f;
                this.y2 = org.telegram.messenger.hp.d1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
            } else {
                f10 = 200.0f;
            }
            if (this.z2 <= 0) {
                this.z2 = org.telegram.messenger.hp.d1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(f10));
            }
            Point point = org.telegram.messenger.g0.q;
            int i14 = point.x > point.y ? this.z2 : this.y2;
            org.telegram.ui.wm wmVar = this.Q2;
            if (wmVar != null && wmVar.getParentLayout() != null) {
                i14 -= ((ActionBarLayout) wmVar.getParentLayout()).w(false);
            }
            if (i10 == 1) {
                i14 = Math.min(this.I1.getKeyboardHeight(), i14);
            }
            gf gfVar2 = this.I1;
            if (gfVar2 != null) {
                gfVar2.setPanelHeight(i14);
            }
            if (viewGroup != null && this.i5 == null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
                layoutParams.height = i14;
                viewGroup.setLayoutParams(layoutParams);
            }
            if (!org.telegram.messenger.g0.E) {
                org.telegram.messenger.g0.v1(this.F0);
            }
            qt0 qt0Var = this.n1;
            if (qt0Var != null) {
                this.B2 = i14;
                qt0Var.requestLayout();
                c1(true, true);
                C1(true);
                F0();
                if (this.j2 && !this.A2 && i14 != i12 && z10) {
                    yc ycVar = new yc(this, 11);
                    if (this.w) {
                        this.x = ycVar;
                    } else {
                        AnimatorSet animatorSet = new AnimatorSet();
                        this.W0 = animatorSet;
                        if (this.i5 != null) {
                            animatorSet.playTogether(ValueAnimator.ofFloat(i14 - i12, 0.0f));
                        } else {
                            float f11 = i14 - i12;
                            viewGroup.setTranslationY(f11);
                            this.W0.playTogether(ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) property, f11, 0.0f));
                        }
                        this.W0.setInterpolator(org.telegram.ui.ActionBar.h1.w);
                        this.W0.setDuration(250L);
                        this.W0.addListener(new bh.j(21, this, ycVar));
                        org.telegram.messenger.g0.i3(heVar, 50L);
                        gVar.d();
                    }
                    requestLayout();
                }
            }
            sh.e eVar = this.i5;
            if (eVar != null) {
                ((sh.h) eVar).h(i14);
            }
        } else {
            if (this.R0 != null) {
                c1(false, true);
            }
            this.g2 = -1;
            kf kfVar2 = this.V0;
            if (kfVar2 != null) {
                if (i3 == 2 && !org.telegram.messenger.g0.D && !org.telegram.messenger.g0.E) {
                    this.H3 = false;
                    uf ufVar = this.a3;
                    if (ufVar != null) {
                        ufVar.x(0.0f);
                    }
                    this.o1.removeView(this.V0);
                    this.V0 = null;
                } else if (!this.j2 || this.A2 || this.A3) {
                    uf ufVar2 = this.a3;
                    if (ufVar2 != null) {
                        ufVar2.x(0.0f);
                    }
                    z14 = false;
                    this.B2 = 0;
                    this.o1.removeView(this.V0);
                    this.V0.setVisibility(8);
                    this.V0.setShowing(false);
                } else {
                    this.X0 = true;
                    this.p3 = 0;
                    kfVar2.setShowing(false);
                    o2 o2Var = new o2(this, i3, 3);
                    if (this.w) {
                        z12 = false;
                        this.x = o2Var;
                    } else {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.W0 = animatorSet2;
                        if (this.i5 != null) {
                            z12 = false;
                            animatorSet2.playTogether(ValueAnimator.ofFloat(this.V0.getMeasuredHeight()), ValueAnimator.ofFloat(0.0f, 1.0f));
                        } else {
                            z12 = false;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.V0, (Property<kf, Float>) property, r5.getMeasuredHeight()));
                        }
                        this.W0.setInterpolator(org.telegram.ui.ActionBar.h1.w);
                        this.W0.setDuration(250L);
                        gVar.d();
                        this.W0.addListener(new bh.j(22, this, o2Var));
                    }
                    org.telegram.messenger.g0.i3(heVar, 50L);
                    requestLayout();
                    z14 = z12;
                }
                this.X0 = z14;
            }
            gf gfVar3 = this.I1;
            if (gfVar3 != null && gfVar3.getVisibility() == 0) {
                if (i3 != 2 || org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                    if (this.j2 && !this.A2) {
                        if (this.Y0) {
                            this.p3 = 1;
                        }
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        this.W0 = animatorSet3;
                        if (this.i5 != null) {
                            i11 = 0;
                            animatorSet3.playTogether(ValueAnimator.ofFloat(this.I1.getMeasuredHeight()));
                        } else {
                            i11 = 0;
                            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.I1, (Property<gf, Float>) property, r5.getMeasuredHeight()));
                        }
                        this.W0.setInterpolator(org.telegram.ui.ActionBar.h1.w);
                        this.W0.setDuration(250L);
                        this.W0.addListener(new of(this, i3, i11));
                        gVar.d();
                        org.telegram.messenger.g0.i3(heVar, 50L);
                        requestLayout();
                    } else if (!this.l3) {
                        this.I1.setVisibility(8);
                    }
                }
                this.Y0 = false;
            }
            if (i10 == 1 && this.n2 != null) {
                org.telegram.messenger.hp.s1(this.R).e7.edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.n2.f1()).apply();
            }
            C1(true);
            sh.e eVar2 = this.i5;
            if (eVar2 != null) {
                ((sh.h) eVar2).i(z11);
            }
        }
        if (this.y3 || this.z3) {
            E(true);
        }
        if (!this.A3 || i3 == 1) {
            z13 = false;
        } else {
            z13 = false;
            m1(false, false, false, true);
        }
        H1(z13);
        z();
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.h1 h1Var) {
        this.V = h1Var;
    }

    public void setAnimatedTop(int i3) {
        this.U1 = i3;
    }

    public void setBotInfo(a0.h hVar) {
        W0(hVar, true);
    }

    public void setBotWebViewButtonOffsetX(float f10) {
        this.R0.setTranslationX(f10);
        if (this.F0 != null) {
            this.H = f10;
            K1();
        }
        this.s1.setTranslationX(this.E + this.y + f10);
        this.c1.setTranslationX(f10);
        ie ieVar = this.y1;
        if (ieVar != null) {
            ieVar.setTranslationX(f10);
        }
    }

    public void setButtons(org.telegram.messenger.zi ziVar) {
        Y0(ziVar, true, true);
    }

    public void setCaption(String str) {
        ve veVar = this.F0;
        if (veVar != null) {
            veVar.setCaption(str);
            E(true);
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.e2 = chatFull;
        kf kfVar = this.V0;
        if (kfVar != null) {
            kfVar.setChatInfo(chatFull);
        }
        cg cgVar = this.G0;
        if (cgVar != null) {
            cgVar.b = chatFull != null && chatFull.boosts_unrestrict > 0;
            cgVar.invalidate();
        }
        if (org.telegram.messenger.t3.i0(chatFull)) {
            return;
        }
        setSlowModeTimer(chatFull.slowmode_next_send_date);
    }

    public void setComposeShadowAlpha(float f10) {
        this.D4 = f10;
        invalidate();
    }

    public void setCustomWindowView(View view) {
        this.K4 = view;
        this.F0.setWindowView(view);
    }

    public void setDelegate(uf ufVar) {
        this.a3 = ufVar;
    }

    public void setEditingBusinessLink(TL_account.TL_businessChatLink tL_businessChatLink) {
        String str;
        this.c2 = tL_businessChatLink;
        H1(false);
        if (this.c2 != null) {
            P(true);
            this.G1.setOnClickListener(new ad(this, 3));
            this.G1.setContentDescription(org.telegram.messenger.bd.M0(2131751355, null));
            this.G1.setVisibility(0);
            this.G1.setScaleX(0.1f);
            this.G1.setScaleY(0.1f);
            this.G1.setAlpha(0.0f);
            this.G1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(xq.f).start();
            this.d0 = org.telegram.messenger.hp.s1(this.S.a).u1();
            ve veVar = this.F0;
            TextPaint paint = veVar != null ? veVar.getPaint() : null;
            if (paint == null) {
                paint = new TextPaint();
                paint.setTextSize(org.telegram.messenger.g0.L(18.0f));
            }
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            ArrayList<TLRPC.MessageEntity> arrayList = this.c2.entities;
            if (arrayList == null || (str = tL_businessChatLink.message) == null) {
                String str2 = tL_businessChatLink.message;
                if (str2 != null) {
                    setFieldText(str2);
                }
            } else {
                setFieldText(o(fontMetricsInt, str, arrayList));
            }
            this.d2 = u();
            U0(false, false, false);
            getSendButtonInternal().setVisibility(8);
            setSlowModeButtonVisible(false);
            this.Q0.setVisibility(8);
            this.a1.setVisibility(8);
            ci.q qVar = this.q1;
            if (qVar != null) {
                qVar.setVisibility(8);
            }
            lg.k kVar = this.s1;
            if (kVar != null) {
                this.w1 = 0.0f;
                kVar.setAlpha(0.0f);
                kVar.setScaleX(0.5f);
                kVar.setScaleY(0.5f);
            }
            this.B1.setVisibility(8);
            ge geVar = this.K1;
            if (geVar != null) {
                geVar.setVisibility(8);
            }
        }
    }

    public void setEffectId(long j10) {
        this.T4 = j10;
        ee eeVar = this.K0;
        if (eeVar != null) {
            eeVar.setEffect(j10);
        }
    }

    public void setExitTransition(float f10) {
        this.n4 = f10;
        RecordCircle recordCircle = this.O1;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setFieldFocused(boolean z10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.P2.getSystemService("accessibility");
        if (this.F0 == null || accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        if (z10 && org.telegram.ui.ActionBar.d2.hasSheets(this.Q2)) {
            z10 = false;
        }
        if (z10) {
            if (this.S1 != 0 || this.F0.isFocused()) {
                return;
            }
            yc ycVar = new yc(this, 6);
            this.T1 = ycVar;
            org.telegram.messenger.g0.i3(ycVar, 600L);
            return;
        }
        ve veVar = this.F0;
        if (veVar == null || !veVar.isFocused()) {
            return;
        }
        if (!this.A2 || this.k2) {
            this.F0.clearFocus();
        }
    }

    @Override // org.telegram.ui.Components.mw0
    public void setFieldText(CharSequence charSequence) {
        e1(charSequence, false);
    }

    public void setInAppInsetsController(sh.e eVar) {
        this.i5 = eVar;
    }

    public void setLockAnimatedTranslation(float f10) {
        this.m4 = f10;
        RecordCircle recordCircle = this.O1;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setOnSendButtonLongClick(View.OnLongClickListener onLongClickListener) {
        if (onLongClickListener == null) {
            onLongClickListener = new ed(this, 0);
        }
        this.K0.setOnLongClickListener(onLongClickListener);
    }

    public void setOverrideHint(CharSequence charSequence) {
        i1(charSequence, false);
    }

    public void setOverrideKeyboardAnimation(boolean z10) {
        this.w = z10;
    }

    public void setRichDraftPreview(TL_iv.RichMessage richMessage) {
        if (this.D1 == null) {
            return;
        }
        org.telegram.messenger.hp.s1(this.R);
        boolean z10 = org.telegram.messenger.r2.a;
        this.F1 = richMessage;
        O1();
    }

    public void setRoundVideoUiFrameClockActive(boolean z10) {
        if (this.k1 == z10) {
            return;
        }
        this.k1 = z10;
        dg dgVar = this.Z0;
        if (dgVar != null) {
            dgVar.setExternalFrameClock(z10);
        }
        ag agVar = this.m1;
        if (agVar != null) {
            agVar.n = z10;
            agVar.b = System.currentTimeMillis();
            agVar.r = -1L;
            agVar.invalidate();
        }
        SlideTextView slideTextView = this.l1;
        if (slideTextView != null) {
            slideTextView.K = z10;
            slideTextView.E = System.currentTimeMillis();
            slideTextView.invalidate();
        }
    }

    public void setSelection(int i3) {
        ve veVar = this.F0;
        if (veVar == null) {
            return;
        }
        veVar.setSelection(i3, veVar.length());
    }

    public void setSideButtonsForAttach(mh.h hVar) {
        ci.q qVar;
        mh.h hVar2 = this.j5;
        if (hVar2 == hVar) {
            return;
        }
        if (hVar2 != null) {
            hVar2.e(0, false, true);
        }
        this.j5 = hVar;
        lg.k kVar = this.s1;
        if (kVar == null || (qVar = this.q1) == null || qVar.getVisibility() == 0) {
            return;
        }
        boolean z10 = hVar != null && o0();
        boolean z11 = (hVar == null || z10) ? false : true;
        if (hVar != null) {
            hVar.e(0, z10, true);
        }
        ViewPropertyAnimator viewPropertyAnimator = this.r1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator animate = kVar.animate();
        float f10 = z11 ? 1.0f : 0.0f;
        this.w1 = f10;
        ViewPropertyAnimator duration = animate.alpha(f10).scaleX(z11 ? 1.0f : 0.5f).scaleY(z11 ? 1.0f : 0.5f).setInterpolator(xq.h).setDuration(320L);
        this.r1 = duration;
        duration.start();
    }

    public void setSlideToCancelProgress(float f10) {
        this.k4 = f10;
        float measuredWidth = getMeasuredWidth() * 0.35f;
        if (measuredWidth > org.telegram.messenger.g0.L(140.0f)) {
            measuredWidth = org.telegram.messenger.g0.L(140.0f);
        }
        this.u4 = (int) ((1.0f - this.k4) * (-measuredWidth));
        RecordCircle recordCircle = this.O1;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setSlowModeTimer(int i3) {
        this.H0 = i3;
        T1();
    }

    public void setSnapAnimationProgress(float f10) {
        this.o4 = f10;
        invalidate();
    }

    public void setTextTransitionIsRunning(boolean z10) {
        this.i0 = z10;
        this.B1.invalidate();
    }

    public void setViewParentForEmoji(ViewGroup viewGroup) {
        this.o1 = viewGroup;
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        boolean z10 = i3 == 0;
        this.J4 = z10;
        ve veVar = this.F0;
        if (veVar != null) {
            veVar.setEnabled(z10);
        }
    }

    public void setVoiceDraft(org.telegram.messenger.gi giVar) {
        org.telegram.messenger.zv zvVar;
        TL_stories.StoryItem storyItem;
        File file;
        String str;
        if (giVar == null) {
            return;
        }
        boolean z10 = giVar.g;
        this.P = z10;
        yf yfVar = this.P1;
        if (yfVar != null) {
            yfVar.E.d(1, z10, true);
        }
        uf ufVar = this.a3;
        if (ufVar != null) {
            storyItem = ufVar.R0();
            zvVar = null;
        } else {
            zvVar = null;
            storyItem = null;
        }
        MediaController B = MediaController.B();
        int i3 = this.R;
        long j10 = this.R2;
        org.telegram.messenger.zi ziVar = this.U2;
        org.telegram.messenger.zi threadMessage = getThreadMessage();
        int i10 = this.H2;
        org.telegram.ui.wm wmVar = this.Q2;
        if (wmVar != null) {
            zvVar = wmVar.W8();
        }
        long sendMonoForumPeerId = getSendMonoForumPeerId();
        org.telegram.messenger.ej sendMessageSuggestionParams = getSendMessageSuggestionParams();
        org.telegram.messenger.p5 p5Var = B.N1;
        if (B.I1) {
            e0.g gVar = B.G1;
            if (gVar != null && gVar.e() && B.g1 != null && (file = B.k1) != null && (str = giVar.a) != null && str.equals(file.getAbsolutePath())) {
                B.h1 = i10;
                B.r1 = ziVar;
                B.s1 = threadMessage;
                B.t1 = storyItem;
                B.u1 = zvVar;
                B.p1 = sendMonoForumPeerId;
                B.q1 = sendMessageSuggestionParams;
                org.telegram.messenger.hs.f(B.i1).k(org.telegram.messenger.hs.o2, new Object[0]);
                org.telegram.messenger.hs.f(B.i1).k(org.telegram.messenger.hs.s2, Integer.valueOf(B.h1), B.g1, B.k1.getAbsolutePath(), Boolean.TRUE, Float.valueOf(giVar.h), Float.valueOf(giVar.i));
                return;
            }
            if (!B.X()) {
                return;
            }
        }
        B.y0 = false;
        B.Y(true);
        p5Var.a(B.M1);
        p5Var.c(new org.telegram.messenger.pd(B, i10, giVar, i3, j10, sendMonoForumPeerId, sendMessageSuggestionParams, threadMessage, ziVar, storyItem));
    }

    public final boolean t() {
        qf u10 = u();
        return (TextUtils.equals(u10.a, this.d2.a) && org.telegram.messenger.li.K(this.d2.b, u10.b)) ? false : true;
    }

    public final boolean t0() {
        return this.G2 && ChatActivityEnterView.this.t4;
    }

    public final void t1() {
        uf ufVar = this.a3;
        if ((ufVar == null || !ufVar.k()) && org.telegram.messenger.m5.z(this.R2)) {
            TLRPC.Chat M0 = org.telegram.messenger.hp.s1(this.S.a).M0(Long.valueOf(-this.R2));
            fc a02 = fc.a0(this.Q2);
            StringBuilder sb2 = new StringBuilder();
            if (org.telegram.messenger.t3.p(M0)) {
                sb2.append(org.telegram.messenger.bd.M0(2131745617, null));
            }
            if (org.telegram.messenger.t3.u(M0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.bd.M0(2131745614, null));
            }
            if (org.telegram.messenger.t3.t(M0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.bd.M0(2131745615, null));
            }
            if (org.telegram.messenger.t3.o(M0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.bd.M0(2131745618, null));
            }
            if (org.telegram.messenger.t3.l(M0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.bd.M0(2131745619, null));
            }
            if (org.telegram.messenger.t3.v(M0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.bd.M0(2131745613, null));
            }
            if (org.telegram.messenger.t3.s(M0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.bd.M0(2131745616, null));
            }
            if (org.telegram.messenger.t3.m(M0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.bd.M0(2131745620, null));
            }
            a02.G(R.raw.passcode_lock_close, 3, org.telegram.messenger.bd.a0("SendPlainTextRestrictionHint", null, 2131745602, sb2.toString())).j();
        }
    }

    public final qf u() {
        ve veVar = this.F0;
        CharSequence[] charSequenceArr = {org.telegram.messenger.g0.n1(veVar == null ? "" : veVar.getTextToUse())};
        ArrayList W = org.telegram.messenger.li.b0(this.R).W(charSequenceArr, true, true);
        CharSequence charSequence = charSequenceArr[0];
        int size = W.size();
        for (int i3 = 0; i3 < size; i3++) {
            TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) W.get(i3);
            if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                messageEntity.length = charSequence.length() - messageEntity.offset;
            }
        }
        qf qfVar = new qf();
        qfVar.a = charSequence.toString();
        qfVar.b = W;
        return qfVar;
    }

    public final boolean u0() {
        if (this.G2) {
            return true;
        }
        AnimatorSet animatorSet = this.u2;
        return (animatorSet == null || !animatorSet.isRunning() || this.l2) ? false : true;
    }

    public final void u1(boolean z10) {
        org.telegram.ui.wm wmVar;
        boolean z11;
        int i3 = 1;
        if ((this.E1 || z10) && (wmVar = this.Q2) != null && !wmVar.z() && this.a2 == null) {
            org.telegram.messenger.hp.s1(this.R);
            boolean z12 = org.telegram.messenger.r2.a;
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.M4 == z11) {
            return;
        }
        this.M4 = z11;
        ImageView imageView = this.v1;
        imageView.setVisibility(0);
        imageView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).setInterpolator(xq.h).setDuration(420L).withEndAction(new gd(this, z11, i3)).start();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        TextPaint textPaint;
        org.telegram.ui.ActionBar.e6 e6Var = this.X3;
        try {
            ve veVar = this.F0;
            if (veVar != null) {
                org.telegram.ui.ActionBar.r6.m(veVar, 34, org.telegram.ui.ActionBar.k6.Je, e6Var);
                org.telegram.ui.ActionBar.r6.w(this.F0, org.telegram.ui.ActionBar.k6.Ke, e6Var);
                org.telegram.ui.ActionBar.r6.z(this.F0, org.telegram.ui.ActionBar.k6.jg, e6Var);
            }
            Paint paint = this.R1;
            if (paint != null) {
                paint.setColor(f0(org.telegram.ui.ActionBar.k6.Pf));
            }
            cg cgVar = this.G0;
            if (cgVar != null) {
                ((org.telegram.ui.ActionBar.k5) cgVar.c).setTextColor(f0(org.telegram.ui.ActionBar.k6.Kl));
                cgVar.invalidate();
            }
            AnimatedArrowDrawable animatedArrowDrawable = this.G3;
            if (animatedArrowDrawable != null) {
                animatedArrowDrawable.a.setColor(f0(org.telegram.ui.ActionBar.k6.Kl));
                animatedArrowDrawable.invalidateSelf();
            }
            ee eeVar = this.K0;
            if (eeVar != null && this.L0 != 0 && eeVar.getBackground() != null) {
                int f02 = f0((this.H0 != Integer.MAX_VALUE || w0()) ? org.telegram.ui.ActionBar.k6.Me : org.telegram.ui.ActionBar.k6.Kl);
                if (f02 != this.L0) {
                    this.L0 = f02;
                    org.telegram.ui.ActionBar.k6.H1(eeVar.getBackground(), Color.argb(24, Color.red(f02), Color.green(f02), Color.blue(f02)), true);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        N1();
        RecordCircle recordCircle = this.O1;
        if (recordCircle != null) {
            recordCircle.e();
        }
        ag agVar = this.m1;
        if (agVar != null) {
            agVar.b();
        }
        SlideTextView slideTextView = this.l1;
        if (slideTextView != null) {
            slideTextView.a();
        }
        dg dgVar = this.Z0;
        if (dgVar != null && (textPaint = dgVar.G) != null) {
            textPaint.setColor(dgVar.J.f0(org.telegram.ui.ActionBar.k6.bg));
        }
        a61 a61Var = this.g1;
        if (a61Var != null) {
            a61Var.e.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.a7, false));
            a61Var.M = 0;
            y51 y51Var = a61Var.Q;
            if (y51Var != null) {
                y51Var.b();
            }
        }
        NumberTextView numberTextView = this.c0;
        if (numberTextView != null && this.F0 != null) {
            if (this.e0 - this.d0 < 0) {
                numberTextView.setTextColor(f0(org.telegram.ui.ActionBar.k6.p7));
            } else {
                numberTextView.setTextColor(f0(org.telegram.ui.ActionBar.k6.y6));
            }
        }
        Color.alpha(f0(org.telegram.ui.ActionBar.k6.Qf));
        te teVar = this.n0;
        if (teVar != null) {
            teVar.d.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.wj, false));
            gh.g gVar = teVar.r;
            if (gVar != null) {
                gVar.updateColors();
            }
            teVar.invalidate();
        }
        gf gfVar = this.I1;
        if (gfVar != null) {
            gfVar.e();
        }
        int f03 = this.b1 ? f0(org.telegram.ui.ActionBar.k6.Kl) : -1;
        ce ceVar = this.c1;
        if (ceVar != null && (!this.W4 || f03 != this.U4)) {
            this.W4 = true;
            this.U4 = f03;
            ceVar.setColorFilter(new PorterDuffColorFilter(f03, PorterDuff.Mode.SRC_IN));
        }
        int f04 = f0(org.telegram.ui.ActionBar.k6.i6);
        if (this.X4 && f04 == this.V4) {
            return;
        }
        this.X4 = true;
        this.V4 = f04;
        ud udVar = this.R0;
        if (udVar != null) {
            udVar.setBackground(org.telegram.ui.ActionBar.k6.h0(f04, 1, -1));
        }
        ImageView imageView = this.S0;
        if (imageView != null) {
            float L = org.telegram.messenger.g0.L(19.0f);
            int L2 = org.telegram.messenger.g0.L(1.0f);
            int L3 = org.telegram.messenger.g0.L(3.0f);
            imageView.setBackground(org.telegram.ui.ActionBar.k6.Y(L, f04, L2, L3, L2, L3));
        }
    }

    public final float v(boolean z10) {
        qe.c cVar = this.k5;
        float f10 = z10 ? cVar.h ? cVar.g : cVar.f : cVar.f;
        qe.a aVar = this.l5;
        return ((this.H1 != null ? r1.getMeasuredHeight() : 0) * (z10 ? aVar.f ? 1.0f : 0.0f : aVar.e)) + f10;
    }

    public final boolean v1() {
        ImageView imageView;
        if (this.O != null || (imageView = this.x1) == null || imageView.getVisibility() != 0 || org.telegram.messenger.hp.e1().getInt("channelsuggesthint2", 0) >= 2) {
            return false;
        }
        gi.l3 l3Var = new gi.l3(getContext(), 3);
        this.O = l3Var;
        l3Var.s(13.0f);
        setHintGlass(this.O);
        this.O.r(true);
        this.O.u(org.telegram.messenger.bd.a0(null, null, 2131744432, rg.c.h(this.R, this.R2)));
        this.O.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        this.O.p(1.0f, -((getWidth() - org.telegram.messenger.g0.L(12.0f)) - ((this.x1.getMeasuredWidth() / 2.0f) + (this.x1.getX() + (this.q1.getX() + this.z1.getX())))));
        addView(this.O, b8.mf.d(-1, 200.0f, 48, 0.0f, -192.0f, 0.0f, 0.0f));
        gi.l3 l3Var2 = this.O;
        l3Var2.r0 = new yc(this, 12);
        l3Var2.d = 8000L;
        l3Var2.w();
        org.telegram.messenger.hp.e1().edit().putInt("channelsuggesthint2", org.telegram.messenger.hp.e1().getInt("channelsuggesthint2", 0) + 1).apply();
        return true;
    }

    public final void w() {
        ai.d2 d2Var = this.e1;
        if (d2Var != null) {
            d2Var.setVisibility(8);
        }
        RecordCircle recordCircle = this.O1;
        if (recordCircle != null) {
            recordCircle.setVisibility(8);
        }
        this.u2 = null;
        v0();
        if (this.q1 != null) {
            this.y = 0.0f;
            B1();
        }
        SlideTextView slideTextView = this.l1;
        if (slideTextView != null) {
            slideTextView.setCancelToProgress(0.0f);
        }
        this.a3.e();
        Q1(true);
    }

    public final boolean w0() {
        return c() || this.n5.f;
    }

    public final void w1() {
        x1(true, false);
    }

    public final void x() {
        if (this.f2 && this.d1) {
            CameraController.getInstance().cancelOnInitRunnable(this.I3);
            this.a3.d2(5, 0, this.P ? Integer.MAX_VALUE : 0, this.T4, 0L, true);
            this.T4 = 0L;
            this.K0.setEffect(0L);
        } else {
            this.a3.M0(0);
            MediaController.B().B0(0, 0, false, false);
        }
        this.G2 = false;
        M1(2, true);
    }

    public final boolean x0() {
        return this.A3;
    }

    public final void x1(boolean z10, boolean z11) {
        if (this.H1 == null || this.g3 || getVisibility() != 0) {
            sd sdVar = this.f1;
            if ((sdVar == null || sdVar.getVisibility() != 0) && !this.I2 && this.W2 == null && this.U2 == null) {
                G0();
                return;
            }
            return;
        }
        sd sdVar2 = this.f1;
        boolean z12 = (sdVar2 == null || sdVar2.getVisibility() != 0) && !this.I2 && this.W2 == null && (this.o2 == null || this.a2 != null);
        if (!z11 && z10 && z12 && !this.A2 && !r0()) {
            G0();
            yc ycVar = this.W;
            if (ycVar != null) {
                org.telegram.messenger.g0.r(ycVar);
            }
            yc ycVar2 = new yc(this, 24);
            this.W = ycVar2;
            org.telegram.messenger.g0.i3(ycVar2, 200L);
            return;
        }
        this.h3 = true;
        this.g3 = true;
        if (this.i3) {
            this.l5.a(true, z10);
            if (z12) {
                ve veVar = this.F0;
                if (veVar != null) {
                    veVar.requestFocus();
                }
                G0();
            }
        }
    }

    public final void y() {
        ie ieVar;
        org.telegram.ui.wm wmVar;
        if (this.M != null || (ieVar = this.L1) == null || ieVar.getRight() == 0 || (wmVar = this.Q2) == null || !org.telegram.messenger.v1.d(wmVar.r8)) {
            return;
        }
        if (org.telegram.messenger.hp.s1(this.R).e7.getBoolean(Calendar.getInstance().get(1) + "bdayhint_" + wmVar.a(), true)) {
            org.telegram.messenger.hp.s1(this.R).e7.edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + wmVar.a(), false).apply();
            gi.l3 l3Var = new gi.l3(getContext(), 3);
            this.M = l3Var;
            l3Var.s(13.0f);
            setHintGlass(this.M);
            this.M.r(true);
            V0();
            this.M.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
            this.M.p(1.0f, -((getWidth() - org.telegram.messenger.g0.L(12.0f)) - ((this.L1.getMeasuredWidth() / 2.0f) + (this.L1.getX() + (this.q1.getX() + this.z1.getX())))));
            addView(this.M, b8.mf.d(-1, 200.0f, 48, 0.0f, -192.0f, 0.0f, 0.0f));
            gi.l3 l3Var2 = this.M;
            l3Var2.r0 = new yc(this, 13);
            l3Var2.d = 8000L;
            l3Var2.w();
        }
    }

    public final boolean y0() {
        View view = this.H1;
        return view != null && view.getVisibility() == 0;
    }

    public final void y1() {
        AnimatorSet animatorSet = new AnimatorSet();
        try {
            performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "lockAnimatedTranslation", this.l4);
        ofFloat.setStartDelay(100L);
        ofFloat.setDuration(350L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "snapAnimationProgress", 1.0f);
        ofFloat2.setInterpolator(xq.h);
        ofFloat2.setDuration(250L);
        int i3 = org.telegram.messenger.az.a;
        SharedPreferences.Editor edit = org.telegram.messenger.hp.e1().edit();
        edit.putInt("lockRecordAudioVideoHint", 3);
        edit.apply();
        animatorSet.playTogether(ofFloat2, ofFloat, ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f).setDuration(200L), ObjectAnimator.ofFloat(this.l1, "cancelToProgress", 1.0f));
        animatorSet.start();
    }

    public final void z() {
        ve veVar = this.F0;
        boolean z10 = ((veVar != null && !TextUtils.isEmpty(veVar.getText())) || this.A2 || this.l3 || r0()) ? false : true;
        if (z10) {
            N();
        }
        ii.a0 a0Var = this.m0;
        if (a0Var != null) {
            boolean z11 = a0Var.f;
            if (z11 != z10) {
                a0Var.f = z10;
                a0Var.requestLayout();
                a0Var.invalidate();
            }
            if (z11 != this.m0.f) {
                ud udVar = this.R0;
                Float valueOf = Float.valueOf(udVar.getX());
                HashMap hashMap = this.C0;
                hashMap.put(udVar, valueOf);
                ve veVar2 = this.F0;
                if (veVar2 != null) {
                    hashMap.put(veVar2, Float.valueOf(veVar2.getX()));
                }
            }
        }
    }

    public final boolean z1() {
        org.telegram.ui.wm wmVar = this.Q2;
        TLRPC.EncryptedChat encryptedChat = wmVar != null ? wmVar.h : null;
        return encryptedChat == null || org.telegram.messenger.g0.X0(encryptedChat.layer) >= 101;
    }

    @Override // org.telegram.ui.Components.mw0
    public xs getEditField() {
        return this.F0;
    }

    @Override // org.telegram.ui.Components.mw0
    public org.telegram.ui.wm getParentFragment() {
        return this.Q2;
    }

    public void e0(Menu menu) {
    }

    public void z0(float f10) {
    }

    public void v0() {
    }

    public void B0(int i3, int i10) {
    }

    @Override // qe.b
    public final /* synthetic */ void F(float f10, int i3) {
    }
}
