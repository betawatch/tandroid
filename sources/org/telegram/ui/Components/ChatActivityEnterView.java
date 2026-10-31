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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class ChatActivityEnterView extends FrameLayout implements org.telegram.messenger.us, tu0, zw0, qx0, fe.e, org.telegram.ui.ActionBar.k6 {
    public static final /* synthetic */ int s5 = 0;
    public boolean A0;
    public final pd A1;
    public int A2;
    public boolean A3;
    public boolean A4;
    public final HashMap B0;
    public final ImageView B1;
    public final boolean B2;
    public AnimatorSet B3;
    public final Paint B4;
    public boolean C0;
    public org.telegram.messenger.lu C1;
    public long C2;
    public float C3;
    public float C4;
    public float D;
    public boolean D0;
    public boolean D1;
    public float D2;
    public int D3;
    public final Rect D4;
    public float E;
    public se E0;
    public TL_iv.RichMessage E1;
    public float E2;
    public boolean E3;
    public boolean E4;
    public float F;
    public final ag F0;
    public be F1;
    public boolean F2;
    public AnimatedArrowDrawable F3;
    public final tc F4;
    public float G;
    public int G0;
    public View G1;
    public int G2;
    public boolean G3;
    public org.telegram.ui.ActionBar.b1 G4;
    public float H;
    public tc H0;
    public df H1;
    public boolean H2;
    public final ee H3;
    public ArrayList H4;
    public float I;
    public final org.telegram.ui.Wallet.b5 I0;
    public final ImageView I1;
    public boolean I2;
    public boolean I3;
    public boolean I4;
    public boolean J;
    public final be J0;
    public de J1;
    public boolean J2;
    public boolean J3;
    public View J4;
    public TLRPC.UserFull K;
    public int K0;
    public fe K1;
    public boolean K2;
    public final nf K3;
    public boolean K4;
    public vh.p2 L;
    public pe L0;
    public boolean L1;
    public int L2;
    public final e2.f L3;
    public boolean L4;
    public vh.p2 M;
    public long M0;
    public AnimatorSet M1;
    public boolean M2;
    public final Paint M3;
    public boolean M4;
    public vh.p2 N;
    public oe N0;
    public RecordCircle N1;
    public final int[] N2;
    public Drawable N3;
    public tc N4;
    public boolean O;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout O0;
    public wf O1;
    public final Activity O2;
    public Drawable O3;
    public final dq[] O4;
    public boolean P;
    public final ImageView P0;
    public final ae P1;
    public final org.telegram.ui.un P2;
    public Drawable P3;
    public int P4;
    public int Q;
    public final rd Q0;
    public final Paint Q1;
    public long Q2;
    public Drawable Q3;
    public int Q4;
    public org.telegram.messenger.c R;
    public final ImageView R0;
    public int R1;
    public boolean R2;
    public Drawable R3;
    public boolean R4;
    public boolean S;
    public fe S0;
    public tc S1;
    public int S2;
    public final RectF S3;
    public long S4;
    public int T;
    public boolean T0;
    public int T1;
    public org.telegram.messenger.jj T2;
    public final Rect T3;
    public int T4;
    public org.telegram.ui.ActionBar.m1 U;
    public gf U0;
    public bl0 U1;
    public org.telegram.messenger.jj U2;
    public final Rect U3;
    public int U4;
    public tc V;
    public AnimatorSet V0;
    public Editable V1;
    public org.telegram.ui.kn V2;
    public Drawable V3;
    public boolean V4;
    public cd W;
    public boolean W0;
    public boolean W1;
    public org.telegram.messenger.jj W2;
    public final org.telegram.ui.ActionBar.p6 W3;
    public boolean W4;
    public boolean X0;
    public boolean X1;
    public TLRPC.WebPage X2;
    public final boolean X3;
    public ih.b X4;
    public bg Y0;
    public boolean Y1;
    public boolean Y2;
    public final ee Y3;
    public z60 Y4;
    public final yd Z0;
    public org.telegram.messenger.jj Z1;
    public sf Z2;
    public final od Z3;
    public int Z4;
    public int a;
    public boolean a0;
    public boolean a1;
    public boolean a2;
    public kf a3;
    public final od a4;
    public int a5;
    public boolean b;
    public NumberTextView b0;
    public final zd b1;
    public TL_account.TL_businessChatLink b2;
    public TLRPC.TL_document b3;
    public final od b4;
    public a0.h b5;
    public org.telegram.ui.ActionBar.b1 c;
    public int c0;
    public boolean c1;
    public of c2;
    public String c3;
    public final od c4;
    public final Paint c5;
    public LinearLayout d;
    public int d0;
    public org.telegram.ui.Cells.a5 d1;
    public TLRPC.ChatFull d2;
    public org.telegram.messenger.jj d3;
    public final od d4;
    public final LinearGradient d5;
    public CharSequence e;
    public dr e0;
    public pd e1;
    public boolean e2;
    public org.telegram.messenger.x20 e3;
    public boolean e4;
    public final Matrix e5;
    public String f;
    public Runnable f0;
    public j71 f1;
    public int f2;
    public boolean f3;
    public long f4;
    public final t5 f5;
    public boolean g0;
    public ei0 g1;
    public boolean g2;
    public boolean g3;
    public float g4;
    public final t5 g5;
    public float h;
    public boolean h0;
    public nj0 h1;
    public boolean h2;
    public boolean h3;
    public float h4;
    public hh.f h5;
    public String i0;
    public long i1;
    public boolean i2;
    public org.telegram.messenger.jj i3;
    public float i4;
    public bh.k i5;
    public String j0;
    public boolean j1;
    public boolean j2;
    public TL_keyboard.KeyboardButtonProto j3;
    public float j4;
    public final fe.f j5;
    public xh.a3 k0;
    public SlideTextView k1;
    public boolean k2;
    public boolean k3;
    public float k4;
    public final fe.b k5;
    public xh.w l0;
    public yf l1;
    public boolean l2;
    public boolean l3;
    public float l4;
    public final fe.b l5;
    public qe m0;
    public final uu0 m1;
    public org.telegram.messenger.jj m2;
    public boolean m3;
    public float m4;
    public final fe.b m5;
    public float n;
    public xh.v n0;
    public ViewGroup n1;
    public TLRPC.TL_replyKeyboardMarkup n2;
    public boolean n3;
    public float n4;
    public float n5;
    public boolean o0;
    public int o1;
    public int o2;
    public int o3;
    public float o4;
    public float o5;
    public do0 p0;
    public final jg.z2 p1;
    public boolean p2;
    public boolean p3;
    public float p4;
    public boolean p5;
    public ie q0;
    public ViewPropertyAnimator q1;
    public PowerManager.WakeLock q2;
    public boolean q3;
    public float q4;
    public int q5;
    public float r;
    public ld r0;
    public final ag.r r1;
    public AnimatorSet r2;
    public final ee r3;
    public boolean r4;
    public int r5;
    public float s;
    public int s0;
    public final org.telegram.ui.ActionBar.y2 s1;
    public AnimatorSet s2;
    public final le s3;
    public boolean s4;
    public int t0;
    public final ImageView t1;
    public AnimatorSet t2;
    public final org.telegram.ui.Cells.g1 t3;
    public int t4;
    public tc u0;
    public final ImageView u1;
    public AnimatorSet u2;
    public final we u3;
    public long u4;
    public ValueAnimator v0;
    public float v1;
    public int v2;
    public final ze v3;
    public boolean v4;
    public boolean w;
    public float w0;
    public ImageView w1;
    public int w2;
    public final Paint w3;
    public ValueAnimator w4;
    public Runnable x;
    public boolean x0;
    public fe x1;
    public int x2;
    public boolean x3;
    public boolean x4;
    public float y;
    public boolean y0;
    public final pd y1;
    public int y2;
    public boolean y3;
    public boolean y4;
    public boolean z0;
    public final pd z1;
    public boolean z2;
    public boolean z3;
    public boolean z4;

    /* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
    public class RecordCircle extends View {
        public int D;
        public final float E;
        public float F;
        public float G;
        public float H;
        public boolean I;
        public float J;
        public float K;
        public float L;
        public boolean M;
        public boolean N;
        public float a;
        public float b;
        public float c;
        public long d;
        public float e;
        public float f;
        public final m9 h;
        public final m9 n;
        public final float r;
        public final float s;
        public final RectF w;
        public boolean x;
        public final xf y;

        public RecordCircle(Context context) {
            super(context);
            m9 m9Var = new m9(11, 360928);
            this.h = m9Var;
            m9 m9Var2 = new m9(12, 360928);
            this.n = m9Var2;
            this.r = org.telegram.messenger.i0.N(41.0f);
            this.s = org.telegram.messenger.i0.L(30.0f);
            this.w = new RectF();
            this.H = 0.0f;
            this.I = true;
            xf xfVar = new xf(this, this);
            this.y = xfVar;
            r0.h0.j(this, xfVar);
            m9Var.a = org.telegram.messenger.i0.L(47.0f);
            m9Var.b = org.telegram.messenger.i0.L(55.0f);
            m9Var.b();
            m9Var2.a = org.telegram.messenger.i0.L(47.0f);
            m9Var2.b = org.telegram.messenger.i0.L(55.0f);
            m9Var2.b();
            float scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            this.E = scaledTouchSlop * scaledTouchSlop;
            e();
        }

        public final void a() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (chatActivityEnterView.P3 != null) {
                return;
            }
            chatActivityEnterView.P3 = getResources().getDrawable(R.drawable.input_mic_pressed).mutate();
            Drawable drawable = chatActivityEnterView.P3;
            int i10 = org.telegram.ui.ActionBar.t6.Qf;
            org.telegram.ui.ActionBar.p6 p6Var = chatActivityEnterView.W3;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.a7.y(this, drawable, i10, p6Var, mode);
            chatActivityEnterView.Q3 = getResources().getDrawable(R.drawable.input_video_pressed).mutate();
            org.telegram.ui.ActionBar.a7.y(this, chatActivityEnterView.Q3, i10, chatActivityEnterView.W3, mode);
            chatActivityEnterView.R3 = getResources().getDrawable(R.drawable.attach_send).mutate();
            org.telegram.ui.ActionBar.a7.y(this, chatActivityEnterView.R3, i10, chatActivityEnterView.W3, mode);
            chatActivityEnterView.N3 = getResources().getDrawable(R.drawable.input_mic).mutate();
            Drawable drawable2 = chatActivityEnterView.N3;
            int i11 = org.telegram.ui.ActionBar.t6.Kl;
            org.telegram.ui.ActionBar.a7.y(this, drawable2, i11, chatActivityEnterView.W3, mode);
            chatActivityEnterView.O3 = getResources().getDrawable(R.drawable.input_video).mutate();
            org.telegram.ui.ActionBar.a7.y(this, chatActivityEnterView.O3, i11, chatActivityEnterView.W3, mode);
        }

        public final void b(Canvas canvas, Drawable drawable, Drawable drawable2, float f7, int i10) {
            a();
            if (f7 != 0.0f && f7 != 1.0f && drawable2 != null) {
                canvas.save();
                canvas.scale(f7, f7, drawable.getBounds().centerX(), drawable.getBounds().centerY());
                float f10 = i10;
                drawable.setAlpha((int) (f10 * f7));
                drawable.draw(canvas);
                canvas.restore();
                canvas.save();
                float f11 = 1.0f - f7;
                canvas.scale(f11, f11, drawable.getBounds().centerX(), drawable.getBounds().centerY());
                drawable2.setAlpha((int) (f10 * f11));
                drawable2.draw(canvas);
                canvas.restore();
                return;
            }
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            boolean z10 = chatActivityEnterView.r4;
            if (z10 && chatActivityEnterView.j4 == 1.0f) {
                chatActivityEnterView.b1.setAlpha(1.0f);
                setVisibility(8);
            } else if (z10 && chatActivityEnterView.j4 < 1.0f) {
                drawable.setAlpha(org.telegram.messenger.zs.e4);
                drawable.draw(canvas);
            } else {
                if (z10) {
                    return;
                }
                drawable.setAlpha(i10);
                drawable.draw(canvas);
            }
        }

        public final void c(boolean z10) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (!z10) {
                chatActivityEnterView.s4 = false;
                chatActivityEnterView.l4 = -1.0f;
                chatActivityEnterView.k4 = -1.0f;
                chatActivityEnterView.j4 = 1.0f;
                chatActivityEnterView.q4 = 1.0f;
                chatActivityEnterView.n4 = 0.0f;
                chatActivityEnterView.i4 = 0.0f;
            }
            invalidate();
            chatActivityEnterView.p4 = 0.0f;
            chatActivityEnterView.u0();
            chatActivityEnterView.m4 = 0.0f;
            chatActivityEnterView.h4 = 0.0f;
            chatActivityEnterView.g4 = 0.0f;
            chatActivityEnterView.e4 = false;
            this.f = 0.0f;
            chatActivityEnterView.r4 = false;
            wf wfVar = chatActivityEnterView.O1;
            if (wfVar != null) {
                wfVar.invalidate();
            }
        }

        public final void d() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.s4 = false;
            invalidate();
            wf wfVar = chatActivityEnterView.O1;
            if (wfVar != null) {
                wfVar.invalidate();
            }
        }

        @Override // android.view.View
        public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
            return super.dispatchHoverEvent(motionEvent) || this.y.f(motionEvent);
        }

        public final void e() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            Paint paint = chatActivityEnterView.M3;
            int i10 = org.telegram.ui.ActionBar.t6.Rf;
            paint.setColor(chatActivityEnterView.e0(i10));
            this.h.d.setColor(i0.b.o(chatActivityEnterView.e0(i10), 38));
            this.n.d.setColor(i0.b.o(chatActivityEnterView.e0(i10), 76));
            this.D = chatActivityEnterView.M3.getAlpha();
        }

        public float getControlsScale() {
            return ChatActivityEnterView.this.i4;
        }

        public float getScale() {
            return ChatActivityEnterView.this.h4;
        }

        public float getTransformToSeekbarProgressStep3() {
            return this.e;
        }

        @Override // android.view.View
        public final void invalidate() {
            super.invalidate();
            wf wfVar = ChatActivityEnterView.this.O1;
            if (wfVar != null) {
                wfVar.invalidate();
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
            float f7;
            float f10;
            float f11;
            float f12;
            float f13;
            float interpolation;
            float max;
            float f14;
            float f15;
            float f16;
            float f17;
            Paint paint;
            float f18;
            float f19;
            Drawable drawable;
            Drawable drawable2;
            boolean e;
            int i10;
            Drawable drawable3;
            Paint paint2;
            float f20;
            Drawable drawable4;
            nj0 nj0Var;
            float f21;
            float f22;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            Rect rect = chatActivityEnterView.T3;
            Paint paint3 = chatActivityEnterView.M3;
            if (this.N) {
                return;
            }
            int measuredWidth = getMeasuredWidth() - org.telegram.messenger.i0.M(26.0f);
            int L = (int) (org.telegram.messenger.i0.L(170.0f) + 0.0f);
            this.J = chatActivityEnterView.t4 + measuredWidth;
            float f23 = L;
            this.K = f23;
            float f24 = chatActivityEnterView.h4;
            float f25 = f24 <= 0.5f ? f24 / 0.5f : f24 <= 0.75f ? 1.0f - (((f24 - 0.5f) / 0.25f) * 0.1f) : (((f24 - 0.75f) / 0.25f) * 0.1f) + 0.9f;
            long currentTimeMillis = System.currentTimeMillis() - this.d;
            float f26 = this.b;
            float f27 = this.a;
            if (f26 != f27) {
                f7 = 0.25f;
                float f28 = this.c;
                f10 = 1.0f;
                float f29 = (currentTimeMillis * f28) + f27;
                this.a = f29;
                if (f28 > 0.0f) {
                    if (f29 > f26) {
                        this.a = f26;
                    }
                } else if (f29 < f26) {
                    this.a = f26;
                }
                invalidate();
            } else {
                f7 = 0.25f;
                f10 = 1.0f;
            }
            float interpolation2 = ((this.s * this.a) + this.r) * f25 * (chatActivityEnterView.r4 ? gr.g.getInterpolation(f10 - chatActivityEnterView.j4) * 0.7f : (chatActivityEnterView.j4 * 0.3f) + 0.7f);
            this.e = 0.0f;
            float f30 = chatActivityEnterView.p4;
            if (f30 == 0.0f || chatActivityEnterView.h1 == null) {
                float f31 = chatActivityEnterView.m4;
                if (f31 == 0.0f) {
                    f11 = 0.0f;
                    f12 = 0.0f;
                    f13 = 0.0f;
                    max = 1.0f;
                    if (chatActivityEnterView.r4) {
                    }
                    if (this.e > 0.0f) {
                    }
                    a();
                    Drawable drawable5 = null;
                    if (chatActivityEnterView.s4) {
                    }
                    drawable.setBounds(rect);
                    if (this.x) {
                    }
                    e = org.telegram.messenger.sc.e(360928);
                    m9 m9Var = this.n;
                    m9 m9Var2 = this.h;
                    if (e) {
                    }
                    this.d = System.currentTimeMillis();
                    float f32 = chatActivityEnterView.j4;
                    if (f32 > f15) {
                    }
                    if (org.telegram.messenger.sc.e(360928)) {
                        if (this.I) {
                        }
                        if (!this.M) {
                        }
                    }
                    float max2 = (chatActivityEnterView.r4 || chatActivityEnterView.j4 >= 1.0f) ? f16 : Math.max(f16, org.telegram.messenger.i0.L(19.0f));
                    if (this.M) {
                    }
                    f20 = 1.0f;
                    if (chatActivityEnterView.h4 != f20) {
                    }
                    this.L = max2;
                }
                float f33 = f31 > 0.6f ? 1.0f : f31 / 0.6f;
                if (!chatActivityEnterView.g0) {
                    f31 = Math.max(0.0f, (f31 - 0.6f) / 0.4f);
                }
                gr grVar = gr.j;
                interpolation = grVar.getInterpolation(f33);
                float interpolation3 = grVar.getInterpolation(f31);
                interpolation2 = (1.0f - interpolation3) * ((org.telegram.messenger.i0.L(16.0f) * interpolation) + interpolation2);
                if (org.telegram.messenger.sc.e(360928)) {
                    float f34 = chatActivityEnterView.m4;
                    if (f34 > 0.6f) {
                        f13 = interpolation;
                        max = Math.max(0.0f, 1.0f - ((f34 - 0.6f) / 0.4f));
                        f12 = interpolation3;
                        f11 = 0.0f;
                        if (chatActivityEnterView.r4) {
                            float f35 = chatActivityEnterView.j4;
                            if (f35 > 0.7f) {
                                max *= 1.0f - ((f35 - 0.7f) / 0.3f);
                            }
                        }
                        if (this.e > 0.0f) {
                            f15 = 0.7f;
                            f14 = 0.0f;
                            paint3.setColor(i0.b.f(this.e, chatActivityEnterView.e0(org.telegram.ui.ActionBar.t6.Rf), chatActivityEnterView.e0(org.telegram.ui.ActionBar.t6.Yf)));
                        } else {
                            f14 = 0.0f;
                            f15 = 0.7f;
                            paint3.setColor(chatActivityEnterView.e0(org.telegram.ui.ActionBar.t6.Rf));
                        }
                        a();
                        Drawable drawable52 = null;
                        if (chatActivityEnterView.s4) {
                            float f36 = this.f;
                            if (f36 != 1.0f) {
                                f19 = 12.0f;
                                float f37 = (currentTimeMillis / 150.0f) + f36;
                                this.f = f37;
                                if (f37 > 1.0f) {
                                    this.f = 1.0f;
                                }
                                drawable52 = chatActivityEnterView.c1 ? chatActivityEnterView.Q3 : chatActivityEnterView.P3;
                            } else {
                                f19 = 12.0f;
                            }
                            Drawable drawable6 = drawable52;
                            drawable = chatActivityEnterView.R3;
                            f18 = f12;
                            f17 = f11;
                            paint = paint3;
                            f16 = interpolation2;
                            rect.set(org.telegram.ui.Cells.f1.z(2, measuredWidth, drawable), org.telegram.ui.Cells.f1.y(2, L, drawable), org.telegram.ui.Cells.f1.w(2, measuredWidth, drawable), org.telegram.ui.Cells.f1.f(2, L, drawable));
                            if (drawable6 != null) {
                                drawable6.setBounds(org.telegram.ui.Cells.f1.z(2, measuredWidth, drawable6), org.telegram.ui.Cells.f1.y(2, L, drawable6), org.telegram.ui.Cells.f1.w(2, measuredWidth, drawable6), org.telegram.ui.Cells.f1.f(2, L, drawable6));
                            }
                            drawable2 = drawable6;
                        } else {
                            f16 = interpolation2;
                            f17 = f11;
                            paint = paint3;
                            f18 = f12;
                            f19 = 12.0f;
                            drawable = chatActivityEnterView.c1 ? chatActivityEnterView.Q3 : chatActivityEnterView.P3;
                            rect.set(measuredWidth - org.telegram.messenger.i0.L(12.0f), L - org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f) + measuredWidth, org.telegram.messenger.i0.L(12.0f) + L);
                            drawable2 = null;
                        }
                        drawable.setBounds(rect);
                        if (this.x) {
                            float f38 = chatActivityEnterView.o4 + 0.01f;
                            chatActivityEnterView.o4 = f38;
                            if (f38 > 1.0f) {
                                this.x = false;
                                chatActivityEnterView.o4 = 1.0f;
                            }
                        } else {
                            float f39 = chatActivityEnterView.o4 - 0.01f;
                            chatActivityEnterView.o4 = f39;
                            if (f39 < f14) {
                                this.x = true;
                                chatActivityEnterView.o4 = f14;
                            }
                        }
                        e = org.telegram.messenger.sc.e(360928);
                        m9 m9Var3 = this.n;
                        m9 m9Var22 = this.h;
                        if (e) {
                            m9Var22.a = org.telegram.messenger.i0.L(47.0f);
                            m9Var22.b = (org.telegram.messenger.i0.L(15.0f) * 0.6f) + org.telegram.messenger.i0.L(47.0f);
                            m9Var3.a = org.telegram.messenger.i0.L(50.0f);
                            m9Var3.b = (org.telegram.messenger.i0.L(f19) * 0.6f) + org.telegram.messenger.i0.L(50.0f);
                            m9Var3.f(currentTimeMillis);
                            m9Var3.e(m9Var3.t, 1.01f);
                            m9Var22.f(currentTimeMillis);
                            m9Var22.e(m9Var22.t, 1.02f);
                        }
                        this.d = System.currentTimeMillis();
                        float f322 = chatActivityEnterView.j4;
                        float f40 = f322 > f15 ? 1.0f : f322 / f15;
                        if (org.telegram.messenger.sc.e(360928) && f17 != 1.0f && f18 < 0.4f && f40 > 0.0f && !chatActivityEnterView.r4) {
                            if (this.I) {
                                float f41 = this.H;
                                if (f41 != 1.0f) {
                                    float f42 = f41 + 0.04f;
                                    this.H = f42;
                                    if (f42 > 1.0f) {
                                        this.H = 1.0f;
                                    }
                                }
                            }
                            if (!this.M) {
                                float interpolation4 = gr.g.getInterpolation(this.H);
                                canvas.save();
                                float f43 = 1.0f - f13;
                                float C = c3.i0.C(m9Var3.t, 1.4f, 0.878f, c3.i0.E(chatActivityEnterView.h4, f43, f40, interpolation4));
                                canvas.scale(C, C, chatActivityEnterView.t4 + measuredWidth, f23);
                                m9Var3.a(chatActivityEnterView.t4 + measuredWidth, f23, canvas, m9Var3.d);
                                canvas.restore();
                                float E = ((m9Var22.t * 1.4f) + 0.926f) * c3.i0.E(chatActivityEnterView.h4, f43, f40, interpolation4);
                                canvas.save();
                                canvas.scale(E, E, chatActivityEnterView.t4 + measuredWidth, f23);
                                m9Var22.a(chatActivityEnterView.t4 + measuredWidth, f23, canvas, m9Var22.d);
                                canvas.restore();
                            }
                        }
                        float max22 = (chatActivityEnterView.r4 || chatActivityEnterView.j4 >= 1.0f) ? f16 : Math.max(f16, org.telegram.messenger.i0.L(19.0f));
                        if (this.M) {
                            i10 = measuredWidth;
                            drawable3 = drawable;
                            paint2 = paint;
                        } else {
                            paint2 = paint;
                            paint2.setAlpha((int) (this.D * max));
                            if (chatActivityEnterView.h4 == 1.0f) {
                                if (chatActivityEnterView.p4 == 0.0f) {
                                    drawable4 = drawable2;
                                    i10 = measuredWidth;
                                    f20 = 1.0f;
                                    canvas.drawCircle(i10 + chatActivityEnterView.t4, f23, max22, paint2);
                                } else if (chatActivityEnterView.c1 || this.e <= 0.0f || (nj0Var = chatActivityEnterView.h1) == null) {
                                    drawable4 = drawable2;
                                    i10 = measuredWidth;
                                    f20 = 1.0f;
                                    canvas.drawCircle(i10 + chatActivityEnterView.t4, f23, (1.0f - this.e) * max22, paint2);
                                } else {
                                    float f44 = f23 + max22;
                                    float f45 = f23 - max22;
                                    float f46 = chatActivityEnterView.t4 + measuredWidth;
                                    float f47 = f46 + max22;
                                    float f48 = f46 - max22;
                                    drawable4 = drawable2;
                                    int i11 = 0;
                                    int i12 = 0;
                                    for (View view = (View) nj0Var.getParent(); view != getParent(); view = (View) view.getParent()) {
                                        i12 = (int) (view.getY() + i12);
                                        i11 = (int) (view.getX() + i11);
                                    }
                                    float f49 = i12;
                                    float y3 = (nj0Var.getY() + f49) - getY();
                                    float y10 = ((nj0Var.getY() + nj0Var.getMeasuredHeight()) + f49) - getY();
                                    float f50 = i11;
                                    float x10 = (((nj0Var.getX() + nj0Var.getMeasuredWidth()) + f50) - getX()) - chatActivityEnterView.I;
                                    float x11 = ((nj0Var.getX() + f50) - getX()) + chatActivityEnterView.I;
                                    i10 = measuredWidth;
                                    if (!chatActivityEnterView.c1) {
                                        nj0Var.getMeasuredHeight();
                                    }
                                    float T1 = org.telegram.messenger.i0.T1(f45, y3, this.e);
                                    float T12 = org.telegram.messenger.i0.T1(f44, y10, this.e);
                                    float T13 = org.telegram.messenger.i0.T1(f48, x11, this.e);
                                    float T14 = org.telegram.messenger.i0.T1(f47, x10, this.e);
                                    RectF rectF = this.w;
                                    rectF.set(T13, T1, T14, T12);
                                    chatActivityEnterView.h1.a(canvas, rectF);
                                    f20 = 1.0f;
                                }
                                canvas.save();
                                canvas.translate(chatActivityEnterView.t4, 0.0f);
                                drawable3 = drawable;
                                drawable2 = drawable4;
                                b(canvas, drawable3, drawable2, this.f, (int) org.telegram.messenger.m5.A(f20, f17, f20 - f18, 255.0f));
                                canvas.restore();
                                if (chatActivityEnterView.h4 != f20) {
                                    canvas.drawCircle(i10 + chatActivityEnterView.t4, f23, max22, paint2);
                                    float f51 = chatActivityEnterView.r4 ? f20 - chatActivityEnterView.j4 : f20;
                                    canvas.save();
                                    canvas.translate(chatActivityEnterView.t4, 0.0f);
                                    b(canvas, drawable3, drawable2, this.f, (int) (f51 * 255.0f));
                                    canvas.restore();
                                }
                                this.L = max22;
                            }
                            i10 = measuredWidth;
                            drawable3 = drawable;
                        }
                        f20 = 1.0f;
                        if (chatActivityEnterView.h4 != f20) {
                        }
                        this.L = max22;
                    }
                }
                f12 = interpolation3;
                f11 = 0.0f;
            } else {
                if (f30 > 0.38f) {
                    f21 = 0.38f;
                    f22 = f10;
                } else {
                    f21 = 0.38f;
                    f22 = f30 / 0.38f;
                }
                float max3 = f30 > 0.63f ? f10 : Math.max(0.0f, (f30 - f21) / f7);
                this.e = Math.max(0.0f, ((chatActivityEnterView.p4 - f21) - f7) / 0.37f);
                gr grVar2 = gr.j;
                interpolation = grVar2.getInterpolation(f22);
                f11 = grVar2.getInterpolation(max3);
                this.e = grVar2.getInterpolation(this.e);
                float L2 = (org.telegram.messenger.i0.L(16.0f) * interpolation) + interpolation2;
                float L3 = org.telegram.messenger.i0.L(8.0f);
                interpolation2 = c3.i0.z(f10, f11, L2 - L3, L3);
                f12 = 0.0f;
            }
            f13 = interpolation;
            max = 1.0f;
            if (chatActivityEnterView.r4) {
            }
            if (this.e > 0.0f) {
            }
            a();
            Drawable drawable522 = null;
            if (chatActivityEnterView.s4) {
            }
            drawable.setBounds(rect);
            if (this.x) {
            }
            e = org.telegram.messenger.sc.e(360928);
            m9 m9Var32 = this.n;
            m9 m9Var222 = this.h;
            if (e) {
            }
            this.d = System.currentTimeMillis();
            float f3222 = chatActivityEnterView.j4;
            if (f3222 > f15) {
            }
            if (org.telegram.messenger.sc.e(360928)) {
            }
            float max222 = (chatActivityEnterView.r4 || chatActivityEnterView.j4 >= 1.0f) ? f16 : Math.max(f16, org.telegram.messenger.i0.L(19.0f));
            if (this.M) {
            }
            f20 = 1.0f;
            if (chatActivityEnterView.h4 != f20) {
            }
            this.L = max222;
        }

        @Override // android.view.View
        public final void onMeasure(int i10, int i11) {
            View.MeasureSpec.getSize(i10);
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(194.0f), TLObject.FLAG_30));
            float measuredWidth = getMeasuredWidth() * 0.35f;
            if (measuredWidth > org.telegram.messenger.i0.L(140.0f)) {
                measuredWidth = org.telegram.messenger.i0.L(140.0f);
            }
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.t4 = (int) ((1.0f - chatActivityEnterView.j4) * (-measuredWidth));
        }

        public void setAmplitude(double d) {
            this.n.d(true, (float) (Math.min(1800.0d, d) / 1800.0d));
            this.h.d(false, (float) (Math.min(1800.0d, d) / 1800.0d));
            float min = (float) (Math.min(1800.0d, d) / 1800.0d);
            this.b = min;
            this.c = (min - this.a) / 375.0f;
            invalidate();
        }

        public void setControlsScale(float f7) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.i4 = f7;
            wf wfVar = chatActivityEnterView.O1;
            if (wfVar != null) {
                wfVar.invalidate();
            }
        }

        public void setScale(float f7) {
            ChatActivityEnterView.this.h4 = f7;
            invalidate();
        }

        public void setTransformToSeekbar(float f7) {
            ChatActivityEnterView.this.p4 = f7;
            invalidate();
        }
    }

    /* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
    public class SlideTextView extends View {
        public long D;
        public final int E;
        public final Path F;
        public StaticLayout G;
        public StaticLayout H;
        public boolean I;
        public boolean J;
        public final Rect K;
        public org.telegram.ui.Cells.y L;
        public int M;
        public final boolean N;
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
            this.F = new Path();
            this.K = new Rect();
            boolean z10 = org.telegram.messenger.i0.q.x <= org.telegram.messenger.i0.L(320.0f);
            this.N = z10;
            TextPaint textPaint = new TextPaint(1);
            this.a = textPaint;
            textPaint.setTextSize(org.telegram.messenger.i0.L(z10 ? 13.0f : 15.0f));
            TextPaint textPaint2 = new TextPaint(1);
            this.b = textPaint2;
            textPaint2.setTextSize(org.telegram.messenger.i0.L(15.0f));
            textPaint2.setTypeface(org.telegram.messenger.i0.o());
            int i10 = org.telegram.ui.ActionBar.t6.Kl;
            int i11 = ChatActivityEnterView.s5;
            paint.setColor(ChatActivityEnterView.this.e0(i10));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(org.telegram.messenger.i0.N(z10 ? 1.0f : 1.6f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            String L0 = org.telegram.messenger.cd.L0(2131745331, null);
            this.d = L0;
            String upperCase = org.telegram.messenger.cd.L0(2131752589, "Cancel").toUpperCase();
            this.e = upperCase;
            this.E = L0.indexOf(upperCase);
            a();
        }

        public final void a() {
            int i10 = org.telegram.ui.ActionBar.t6.bg;
            int i11 = ChatActivityEnterView.s5;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            int e02 = chatActivityEnterView.e0(i10);
            this.a.setColor(e02);
            int i12 = org.telegram.ui.ActionBar.t6.ag;
            int e03 = chatActivityEnterView.e0(i12);
            this.b.setColor(e03);
            this.s = r2.getAlpha();
            this.w = r4.getAlpha();
            org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.t6.j0(org.telegram.messenger.i0.L(60.0f), 0, i0.b.o(chatActivityEnterView.e0(i12), 26));
            this.L = j02;
            j02.setCallback(this);
        }

        @Override // android.view.View
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            this.L.setState(getDrawableState());
        }

        public float getSlideToCancelWidth() {
            return this.f;
        }

        @Override // android.view.View
        public final void jumpDrawablesToCurrentState() {
            super.jumpDrawablesToCurrentState();
            org.telegram.ui.Cells.y yVar = this.L;
            if (yVar != null) {
                yVar.jumpToCurrentState();
            }
        }

        @Override // android.view.View
        public final void onDraw(Canvas canvas) {
            StaticLayout staticLayout;
            float f7;
            float f10;
            float f11;
            float f12;
            if (this.G == null || (staticLayout = this.H) == null) {
                return;
            }
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (chatActivityEnterView.N1 == null) {
                return;
            }
            int L = org.telegram.messenger.i0.L(16.0f) + staticLayout.getWidth();
            int e02 = chatActivityEnterView.e0(org.telegram.ui.ActionBar.t6.bg);
            TextPaint textPaint = this.a;
            textPaint.setColor(e02);
            textPaint.setAlpha((int) ((1.0f - this.n) * this.s * this.r));
            this.b.setAlpha((int) (this.w * this.n));
            int color = textPaint.getColor();
            Paint paint = this.c;
            paint.setColor(color);
            boolean z10 = this.N;
            if (z10) {
                this.x = org.telegram.messenger.i0.L(16.0f);
            } else {
                long currentTimeMillis = System.currentTimeMillis() - this.D;
                this.D = System.currentTimeMillis();
                if (this.n == 0.0f && this.r > 0.8f) {
                    if (this.y) {
                        float L2 = ((org.telegram.messenger.i0.L(3.0f) / 250.0f) * currentTimeMillis) + this.x;
                        this.x = L2;
                        if (L2 > org.telegram.messenger.i0.L(6.0f)) {
                            this.x = org.telegram.messenger.i0.L(6.0f);
                            this.y = false;
                        }
                    } else {
                        float L3 = this.x - ((org.telegram.messenger.i0.L(3.0f) / 250.0f) * currentTimeMillis);
                        this.x = L3;
                        if (L3 < (-org.telegram.messenger.i0.L(6.0f))) {
                            this.x = -org.telegram.messenger.i0.L(6.0f);
                            this.y = true;
                        }
                    }
                }
            }
            int i10 = this.E;
            boolean z11 = i10 >= 0;
            int L4 = org.telegram.messenger.i0.L(5.0f) + ((int) ((getMeasuredWidth() - this.f) / 2.0f));
            int measuredWidth = (int) ((getMeasuredWidth() - this.h) / 2.0f);
            float primaryHorizontal = z11 ? this.G.getPrimaryHorizontal(i10) : 0.0f;
            if (z11) {
                f7 = 16.0f;
                f10 = (L4 + primaryHorizontal) - measuredWidth;
            } else {
                f7 = 16.0f;
                f10 = 0.0f;
            }
            float f13 = L4;
            float f14 = this.x;
            float f15 = this.n;
            float L5 = (((((1.0f - f15) * f14) * this.r) + f13) - (f10 * f15)) + org.telegram.messenger.i0.L(f7);
            float L6 = z11 ? 0.0f : this.n * org.telegram.messenger.i0.L(12.0f);
            if (this.n != 1.0f) {
                f11 = 12.0f;
                int translationX = (int) ((chatActivityEnterView.N1.getTranslationX() * 0.3f) + ((1.0f - this.r) * ((-getMeasuredWidth()) / 4)));
                canvas.save();
                bg bgVar = chatActivityEnterView.Y0;
                f12 = 2.0f;
                canvas.clipRect((bgVar == null ? 0.0f : bgVar.getLeftProperty()) + org.telegram.messenger.i0.L(4.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.save();
                int i11 = (int) L5;
                canvas.translate((i11 - org.telegram.messenger.i0.L(z10 ? 7.0f : 10.0f)) + translationX, L6);
                canvas.drawPath(this.F, paint);
                canvas.restore();
                canvas.save();
                canvas.translate(i11 + translationX, ((getMeasuredHeight() - this.G.getHeight()) / 2.0f) + L6);
                this.G.draw(canvas);
                canvas.restore();
                canvas.restore();
            } else {
                f11 = 12.0f;
                f12 = 2.0f;
            }
            float measuredHeight = (getMeasuredHeight() - this.H.getHeight()) / f12;
            if (!z11) {
                measuredHeight -= org.telegram.messenger.i0.L(f11) - L6;
            }
            float f16 = z11 ? L5 + primaryHorizontal : measuredWidth;
            Rect rect = this.K;
            rect.set((int) f16, (int) measuredHeight, (int) (this.H.getWidth() + f16), (int) (this.H.getHeight() + measuredHeight));
            rect.inset(-org.telegram.messenger.i0.L(f7), -org.telegram.messenger.i0.L(f7));
            if (this.n > 0.0f) {
                this.L.setBounds((getMeasuredWidth() / 2) - L, (getMeasuredHeight() / 2) - L, (getMeasuredWidth() / 2) + L, (getMeasuredHeight() / 2) + L);
                this.L.draw(canvas);
                canvas.save();
                canvas.translate(f16, measuredHeight);
                this.H.draw(canvas);
                canvas.restore();
            } else {
                setPressed(false);
            }
            if (this.n == 1.0f || this.J) {
                return;
            }
            invalidate();
        }

        @Override // android.view.View
        public final void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
            if (this.M != measuredHeight) {
                this.M = measuredHeight;
                String str = this.d;
                TextPaint textPaint = this.a;
                this.f = textPaint.measureText(str);
                String str2 = this.e;
                TextPaint textPaint2 = this.b;
                this.h = textPaint2.measureText(str2);
                this.D = System.currentTimeMillis();
                int measuredHeight2 = getMeasuredHeight() >> 1;
                Path path = this.F;
                path.reset();
                if (this.N) {
                    float f7 = measuredHeight2;
                    path.setLastPoint(org.telegram.messenger.i0.N(2.5f), f7 - org.telegram.messenger.i0.N(3.12f));
                    path.lineTo(0.0f, f7);
                    path.lineTo(org.telegram.messenger.i0.N(2.5f), org.telegram.messenger.i0.N(3.12f) + f7);
                } else {
                    float f10 = measuredHeight2;
                    path.setLastPoint(org.telegram.messenger.i0.N(4.0f), f10 - org.telegram.messenger.i0.N(5.0f));
                    path.lineTo(0.0f, f10);
                    path.lineTo(org.telegram.messenger.i0.N(4.0f), org.telegram.messenger.i0.N(5.0f) + f10);
                }
                int i12 = (int) this.f;
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.G = new StaticLayout(this.d, textPaint, i12, alignment, 1.0f, 0.0f, false);
                this.H = new StaticLayout(this.e, textPaint2, (int) this.h, alignment, 1.0f, 0.0f, false);
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
            int y3 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            Rect rect = this.K;
            if (action == 0) {
                boolean contains = rect.contains(x10, y3);
                this.I = contains;
                if (contains) {
                    this.L.setHotspot(x10, y3);
                    setPressed(true);
                }
                return this.I;
            }
            boolean z10 = this.I;
            if (!z10) {
                return z10;
            }
            if (motionEvent.getAction() == 2 && !rect.contains(x10, y3)) {
                setPressed(false);
                return false;
            }
            if (motionEvent.getAction() == 1 && rect.contains(x10, y3)) {
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                long j10 = 0;
                if (chatActivityEnterView.e2 && chatActivityEnterView.c1) {
                    CameraController.getInstance().cancelOnInitRunnable(chatActivityEnterView.H3);
                    chatActivityEnterView.Z2.V1(5, 0, chatActivityEnterView.O ? Integer.MAX_VALUE : 0, chatActivityEnterView.S4, 0L, true);
                    be beVar = chatActivityEnterView.J0;
                    chatActivityEnterView.S4 = 0L;
                    beVar.setEffect(0L);
                } else {
                    chatActivityEnterView.Z2.G0(0);
                    MediaController.B().B0(0, 0, false, chatActivityEnterView.O);
                }
                chatActivityEnterView.b3 = null;
                chatActivityEnterView.d3 = null;
                chatActivityEnterView.e3 = null;
                chatActivityEnterView.i1 = 0L;
                chatActivityEnterView.F2 = false;
                org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(chatActivityEnterView.Q);
                long j11 = chatActivityEnterView.Q2;
                org.telegram.ui.un unVar = chatActivityEnterView.P2;
                if (unVar != null && unVar.v4) {
                    j10 = unVar.b();
                }
                b02.B1(j11, j10, null);
                chatActivityEnterView.K1(2, true);
                chatActivityEnterView.F(true);
            }
            return true;
        }

        public void setCancelToProgress(float f7) {
            this.n = f7;
        }

        @Override // android.view.View
        public final boolean verifyDrawable(Drawable drawable) {
            return this.L == drawable || super.verifyDrawable(drawable);
        }
    }

    public ChatActivityEnterView(Activity activity, uu0 uu0Var, org.telegram.ui.un unVar, boolean z10, final org.telegram.ui.ActionBar.p6 p6Var) {
        super(activity);
        int i10;
        String str;
        sf sfVar;
        this.h = 1.0f;
        this.n = 1.0f;
        this.r = 1.0f;
        this.s = 1.0f;
        this.E = 1.0f;
        this.F = 1.0f;
        this.I = 0.0f;
        int i11 = 1;
        this.J = true;
        int i12 = org.telegram.messenger.d20.s0;
        this.Q = i12;
        this.R = org.telegram.messenger.c.a(i12);
        this.T = 1;
        this.c0 = -1;
        this.q5 = 1;
        this.x0 = true;
        this.y0 = true;
        this.z0 = true;
        this.B0 = new HashMap();
        new td(0);
        this.C0 = false;
        this.D0 = false;
        this.v1 = 1.0f;
        this.f2 = -1;
        this.j2 = true;
        this.D2 = -1.0f;
        this.E2 = org.telegram.messenger.i0.L(80.0f);
        this.N2 = new int[2];
        this.Y2 = true;
        this.o3 = -1;
        this.q3 = true;
        this.r3 = new ee(this, 0);
        this.s3 = new le(this);
        this.t3 = new org.telegram.ui.Cells.g1(Integer.class, "translationY", 1);
        this.u3 = new we(Float.class, "scale");
        this.v3 = new ze(Float.class, "controlsScale");
        this.w3 = new Paint(1);
        this.H3 = new ee(this, i11);
        this.K3 = new nf(this);
        this.L3 = new e2.f(null);
        this.M3 = new Paint(1);
        this.S3 = new RectF();
        this.T3 = new Rect();
        this.U3 = new Rect();
        this.Y3 = new ee(this, 2);
        this.Z3 = new od(this, 0);
        this.a4 = new od(this, 1);
        this.b4 = new od(this, 2);
        this.c4 = new od(this, 3);
        this.d4 = new od(this, 4);
        this.x4 = true;
        this.y4 = true;
        this.B4 = new Paint();
        this.C4 = 1.0f;
        this.D4 = new Rect();
        this.F4 = new tc(this, 8);
        this.I4 = true;
        this.O4 = new dq[1];
        this.r5 = 1;
        this.Z4 = -1;
        Paint paint = new Paint(1);
        this.c5 = paint;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.d5 = linearGradient;
        this.e5 = new Matrix();
        gr grVar = gr.h;
        final int i13 = 0;
        this.f5 = new t5(this, 0L, 280L, grVar);
        this.g5 = new t5(this, 0L, 280L, grVar);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setShader(linearGradient);
        gr grVar2 = ci.o.V;
        this.j5 = new fe.f(0, this, grVar2, 250L);
        this.k5 = new fe.b(1, this, grVar2, 250L, false);
        this.l5 = new fe.b(2, this, grVar, 320L, false);
        this.m5 = new fe.b(3, this, grVar, 320L, false);
        this.W3 = p6Var;
        this.X3 = z10;
        this.i2 = z10 && !org.telegram.messenger.i0.E && (unVar == null || !unVar.isInBubbleMode());
        Paint paint2 = new Paint(1);
        this.Q1 = paint2;
        paint2.setColor(e0(org.telegram.ui.ActionBar.t6.Pf));
        setFocusable(true);
        setFocusableInTouchMode(true);
        setWillNotDraw(false);
        setClipChildren(false);
        org.telegram.messenger.zs.f(this.Q).c(this, org.telegram.messenger.zs.l2);
        org.telegram.messenger.zs.f(this.Q).c(this, org.telegram.messenger.zs.o2);
        org.telegram.messenger.zs.f(this.Q).c(this, org.telegram.messenger.zs.p2);
        org.telegram.messenger.zs.f(this.Q).c(this, org.telegram.messenger.zs.m2);
        org.telegram.messenger.zs.f(this.Q).c(this, org.telegram.messenger.zs.n2);
        org.telegram.messenger.zs.f(this.Q).c(this, org.telegram.messenger.zs.k2);
        org.telegram.messenger.zs.f(this.Q).c(this, org.telegram.messenger.zs.t);
        org.telegram.messenger.zs.f(this.Q).c(this, org.telegram.messenger.zs.s2);
        org.telegram.messenger.zs.f(this.Q).c(this, org.telegram.messenger.zs.u2);
        org.telegram.messenger.zs.f(this.Q).c(this, org.telegram.messenger.zs.e2);
        org.telegram.messenger.zs.f(this.Q).c(this, org.telegram.messenger.zs.z0);
        org.telegram.messenger.zs.f(this.Q).c(this, org.telegram.messenger.zs.L);
        org.telegram.messenger.zs.f(this.Q).c(this, org.telegram.messenger.zs.n1);
        org.telegram.messenger.zs.f(this.Q).c(this, org.telegram.messenger.zs.t2);
        org.telegram.messenger.zs.f(this.Q).c(this, org.telegram.messenger.zs.R2);
        org.telegram.messenger.zs.f(this.Q).c(this, org.telegram.messenger.zs.Y2);
        org.telegram.messenger.zs.f(this.Q).c(this, org.telegram.messenger.zs.f5);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.i4);
        this.O2 = activity;
        this.P2 = unVar;
        if (unVar != null) {
            this.G2 = unVar.getClassGuid();
        }
        this.m1 = uu0Var;
        this.n1 = uu0Var;
        uu0Var.setDelegate(this);
        this.B2 = org.telegram.messenger.vp.d1().getBoolean("send_by_enter", false);
        pd pdVar = new pd(this, activity, i13);
        this.z1 = pdVar;
        pdVar.setClipChildren(false);
        pdVar.setClipToPadding(false);
        pdVar.setPadding(0, org.telegram.messenger.i0.L(1.0f), 0, 0);
        addView(pdVar, w7.b6.d(-1, -2.0f, 83, 0.0f, 1.0f, 0.0f, 0.0f));
        pd pdVar2 = new pd(this, activity, i11);
        this.y1 = pdVar2;
        pdVar2.setClipChildren(false);
        pdVar.addView(pdVar2, w7.b6.d(-1, -2.0f, 80, 0.0f, 0.0f, 44.0f, 0.0f));
        rd rdVar = new rd(this, activity);
        this.Q0 = rdVar;
        rdVar.setContentDescription(org.telegram.messenger.cd.L0(2131754884, null));
        rdVar.setFocusable(true);
        int L = org.telegram.messenger.i0.L(7.5f);
        rdVar.setPadding(L, L, L, L);
        int i14 = org.telegram.ui.ActionBar.t6.Kl;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.a7.t(rdVar, i14, p6Var, mode);
        int i15 = org.telegram.ui.ActionBar.t6.i6;
        int e02 = e0(i15);
        float L2 = org.telegram.messenger.i0.L(19.0f);
        int L3 = org.telegram.messenger.i0.L(1.0f);
        int L4 = org.telegram.messenger.i0.L(3.0f);
        rdVar.setBackground(org.telegram.ui.ActionBar.t6.Y(L2, e02, L3, L4, L3, L4));
        rdVar.setOnClickListener(new vc(this, 14));
        pdVar2.addView(rdVar, w7.b6.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        b1(false, false);
        ImageView imageView = new ImageView(activity);
        this.R0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.menu_delete_old);
        org.telegram.ui.ActionBar.a7.t(imageView, i14, p6Var, mode);
        int e03 = e0(i15);
        float L5 = org.telegram.messenger.i0.L(19.0f);
        int L6 = org.telegram.messenger.i0.L(1.0f);
        int L7 = org.telegram.messenger.i0.L(3.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.t6.Y(L5, e03, L6, L7, L6, L7));
        imageView.setVisibility(8);
        imageView.setContentDescription(org.telegram.messenger.cd.L0(2131754038, null));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hd
            public final /* synthetic */ ChatActivityEnterView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        int i16 = ChatActivityEnterView.s5;
                        ChatActivityEnterView chatActivityEnterView = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, chatActivityEnterView.getContext(), p6Var);
                        String L0 = org.telegram.messenger.cd.L0(2131754036, null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                        x1Var.R = L0;
                        x1Var.T = org.telegram.messenger.cd.L0(2131754037, null);
                        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new dd(chatActivityEnterView));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.p();
                        break;
                    default:
                        int i17 = ChatActivityEnterView.s5;
                        org.telegram.messenger.vp.d1().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.b;
                        org.telegram.ui.un unVar2 = chatActivityEnterView2.P2;
                        long a2 = unVar2 != null ? unVar2.a() : chatActivityEnterView2.Q2;
                        boolean z11 = chatActivityEnterView2.D1;
                        org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
                        if (!z11) {
                            if (chatActivityEnterView2.E0 != null) {
                                g0 g0Var = new g0(chatActivityEnterView2.getContext(), p6Var2);
                                g0Var.r1(chatActivityEnterView2.E0.getText());
                                g0Var.b2 = new fd(chatActivityEnterView2, 1);
                                boolean z12 = chatActivityEnterView2.Z1 != null;
                                gd gdVar = new gd(chatActivityEnterView2, a2, p6Var2, 1);
                                g0Var.d2 = a2;
                                g0Var.e2 = z12;
                                g0Var.f2 = gdVar;
                                g0Var.show();
                                break;
                            }
                        } else if (chatActivityEnterView2.E1 != null) {
                            g0 g0Var2 = new g0(chatActivityEnterView2.getContext(), p6Var2);
                            g0Var2.s1(chatActivityEnterView2.E1);
                            g0Var2.c2 = new fd(chatActivityEnterView2, 0);
                            gd gdVar2 = new gd(chatActivityEnterView2, a2, p6Var2, 0);
                            g0Var2.d2 = a2;
                            g0Var2.g2 = gdVar2;
                            g0Var2.show();
                            break;
                        }
                        break;
                }
            }
        });
        pdVar2.addView(imageView, w7.b6.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            int i16 = unVar != null ? unVar.f4 : -1;
            jg.z2 z2Var = new jg.z2(activity, 5);
            this.p1 = z2Var;
            z2Var.setOrientation(0);
            z2Var.setEnabled(false);
            z2Var.setClipChildren(false);
            pdVar2.addView(z2Var, w7.b6.d(-2, 44.0f, 85, 0.0f, 0.0f, 44.0f, 0.0f));
            if (i16 != 9) {
                ImageView imageView2 = new ImageView(activity);
                this.I1 = imageView2;
                dr drVar = new dr(activity, R.drawable.input_notify_on, i14);
                this.e0 = drVar;
                imageView2.setImageDrawable(drVar);
                this.e0.a(this.g2, false);
                if (this.g2) {
                    i10 = 2131754906;
                    str = "AccDescrChanSilentOn";
                } else {
                    i10 = 2131754907;
                    str = "AccDescrChanSilentOff";
                }
                imageView2.setContentDescription(org.telegram.messenger.cd.L0(i10, str));
                org.telegram.ui.ActionBar.a7.t(imageView2, i14, p6Var, PorterDuff.Mode.MULTIPLY);
                imageView2.setScaleType(scaleType);
                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(e0(i15), 1, -1);
                org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i15);
                imageView2.setBackground(h02);
                org.telegram.ui.ActionBar.a7.k(imageView2, h02, null, N, p6Var);
                imageView2.setVisibility((!this.h2 || ((sfVar = this.Z2) != null && sfVar.k0())) ? 8 : 0);
                z2Var.addView(imageView2, w7.b6.o(44, 44));
                imageView2.setOnClickListener(new sd(i13, this, unVar, activity));
            }
            ag.r rVar = new ag.r(activity, 1);
            this.r1 = rVar;
            rVar.setScaleType(scaleType);
            org.telegram.ui.ActionBar.a7.t(rVar, i14, p6Var, PorterDuff.Mode.MULTIPLY);
            rVar.setImageResource(R.drawable.msg_input_attach2);
            org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.t6.h0(e0(i15), 1, -1);
            org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i15);
            rVar.setBackground(h03);
            org.telegram.ui.ActionBar.a7.k(rVar, h03, null, N2, p6Var);
            pdVar2.addView(rVar, w7.b6.e(44, 44, 85));
            rVar.setOnClickListener(new vc(this, 18));
            rVar.setContentDescription(org.telegram.messenger.cd.L0(2131754921, null));
            G1(1);
        }
        ImageView imageView3 = new ImageView(activity);
        this.t1 = imageView3;
        org.telegram.ui.ActionBar.y2 y2Var = new org.telegram.ui.ActionBar.y2(activity);
        this.s1 = y2Var;
        imageView3.setImageDrawable(y2Var);
        imageView3.setScaleType(scaleType);
        PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.a7.t(imageView3, i14, p6Var, mode2);
        org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.t6.h0(e0(i15), 1, org.telegram.messenger.i0.L(16.0f));
        org.telegram.ui.ActionBar.w6 N3 = org.telegram.ui.ActionBar.a7.N(i15);
        imageView3.setBackground(h04);
        org.telegram.ui.ActionBar.a7.k(imageView3, h04, null, N3, p6Var);
        pdVar.addView(imageView3, w7.b6.d(44, 44.0f, 51, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView3.setContentDescription(org.telegram.messenger.cd.L0(2131755006, null));
        w7.e6.a(imageView3);
        final int i17 = 1;
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hd
            public final /* synthetic */ ChatActivityEnterView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        int i162 = ChatActivityEnterView.s5;
                        ChatActivityEnterView chatActivityEnterView = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, chatActivityEnterView.getContext(), p6Var);
                        String L0 = org.telegram.messenger.cd.L0(2131754036, null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                        x1Var.R = L0;
                        x1Var.T = org.telegram.messenger.cd.L0(2131754037, null);
                        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new dd(chatActivityEnterView));
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.p();
                        break;
                    default:
                        int i172 = ChatActivityEnterView.s5;
                        org.telegram.messenger.vp.d1().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.b;
                        org.telegram.ui.un unVar2 = chatActivityEnterView2.P2;
                        long a2 = unVar2 != null ? unVar2.a() : chatActivityEnterView2.Q2;
                        boolean z11 = chatActivityEnterView2.D1;
                        org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
                        if (!z11) {
                            if (chatActivityEnterView2.E0 != null) {
                                g0 g0Var = new g0(chatActivityEnterView2.getContext(), p6Var2);
                                g0Var.r1(chatActivityEnterView2.E0.getText());
                                g0Var.b2 = new fd(chatActivityEnterView2, 1);
                                boolean z12 = chatActivityEnterView2.Z1 != null;
                                gd gdVar = new gd(chatActivityEnterView2, a2, p6Var2, 1);
                                g0Var.d2 = a2;
                                g0Var.e2 = z12;
                                g0Var.f2 = gdVar;
                                g0Var.show();
                                break;
                            }
                        } else if (chatActivityEnterView2.E1 != null) {
                            g0 g0Var2 = new g0(chatActivityEnterView2.getContext(), p6Var2);
                            g0Var2.s1(chatActivityEnterView2.E1);
                            g0Var2.c2 = new fd(chatActivityEnterView2, 0);
                            gd gdVar2 = new gd(chatActivityEnterView2, a2, p6Var2, 0);
                            g0Var2.d2 = a2;
                            g0Var2.g2 = gdVar2;
                            g0Var2.show();
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
        this.u1 = imageView4;
        imageView4.setImageResource(R.drawable.iv_fullscreen);
        imageView4.setScaleType(scaleType);
        org.telegram.ui.ActionBar.a7.t(imageView4, i14, p6Var, mode2);
        org.telegram.ui.Cells.y h05 = org.telegram.ui.ActionBar.t6.h0(e0(i15), 1, org.telegram.messenger.i0.L(16.0f));
        org.telegram.ui.ActionBar.w6 N4 = org.telegram.ui.ActionBar.a7.N(i15);
        imageView4.setBackground(h05);
        org.telegram.ui.ActionBar.a7.k(imageView4, h05, null, N4, p6Var);
        pdVar.addView(imageView4, w7.b6.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(org.telegram.messenger.cd.L0(2131754033, null));
        w7.e6.a(imageView4);
        imageView4.setOnClickListener(new vc(this, 20));
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setScaleX(0.6f);
        imageView4.setScaleY(0.6f);
        if (this.b3 != null) {
            T();
        }
        ImageView imageView5 = new ImageView(activity);
        this.B1 = imageView5;
        imageView5.setImageResource(R.drawable.send_outline);
        imageView5.setScaleType(scaleType);
        imageView5.setVisibility(8);
        org.telegram.ui.ActionBar.a7.t(imageView5, org.telegram.ui.ActionBar.t6.Vl, p6Var, mode);
        pdVar.addView(imageView5, w7.b6.e(44, 44, 85));
        pd pdVar3 = new pd(this, activity, 2);
        this.A1 = pdVar3;
        pdVar3.setClipChildren(false);
        pdVar3.setClipToPadding(false);
        pdVar.addView(pdVar3, w7.b6.e(100, 44, 85));
        yd ydVar = new yd(this, activity, p6Var);
        this.Z0 = ydVar;
        ydVar.setSoundEffectsEnabled(false);
        pdVar3.addView(ydVar, w7.b6.e(44, 44, 85));
        ydVar.setFocusable(true);
        ydVar.setImportantForAccessibility(1);
        Drawable mutate = getResources().getDrawable(R.drawable.input_mic).mutate();
        this.N3 = mutate;
        org.telegram.ui.ActionBar.a7.y(this, mutate, i14, p6Var, mode2);
        Drawable mutate2 = getResources().getDrawable(R.drawable.input_video).mutate();
        this.O3 = mutate2;
        org.telegram.ui.ActionBar.a7.y(this, mutate2, i14, p6Var, mode2);
        zd zdVar = new zd(this, activity);
        this.b1 = zdVar;
        zdVar.setImportantForAccessibility(2);
        int L8 = org.telegram.messenger.i0.L(10.0f);
        zdVar.setPadding(L8, L8, L8, L8);
        ydVar.addView(zdVar, w7.b6.c(44.0f, 44));
        ImageView imageView6 = new ImageView(activity);
        this.P0 = imageView6;
        int i18 = 4;
        imageView6.setVisibility(4);
        imageView6.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ae aeVar = new ae();
        this.P1 = aeVar;
        imageView6.setImageDrawable(aeVar);
        imageView6.setContentDescription(org.telegram.messenger.cd.L0(2131752589, "Cancel"));
        imageView6.setSoundEffectsEnabled(false);
        imageView6.setScaleX(0.1f);
        imageView6.setScaleY(0.1f);
        imageView6.setAlpha(0.0f);
        org.telegram.ui.Cells.y h06 = org.telegram.ui.ActionBar.t6.h0(e0(i15), 1, -1);
        org.telegram.ui.ActionBar.w6 N5 = org.telegram.ui.ActionBar.a7.N(i15);
        imageView6.setBackground(h06);
        org.telegram.ui.ActionBar.a7.k(imageView6, h06, null, N5, p6Var);
        pdVar3.addView(imageView6, w7.b6.e(44, 44, 85));
        imageView6.setOnClickListener(new vc(this, i13));
        be beVar = new be(this, activity, c() ? R.drawable.input_schedule : R.drawable.send_plane_24, p6Var);
        this.J0 = beVar;
        beVar.setVisibility(4);
        beVar.setContentDescription(org.telegram.messenger.cd.L0(2131745657, null));
        beVar.setSoundEffectsEnabled(false);
        beVar.setScaleX(0.1f);
        beVar.setScaleY(0.1f);
        beVar.setAlpha(0.0f);
        pdVar3.addView(beVar, w7.b6.e(100, 44, 85));
        beVar.setOnClickListener(new vc(this, 1));
        beVar.setOnLongClickListener(new zc(this, i13));
        if (org.telegram.messenger.i0.C1()) {
            pdVar3.setOnLongClickListener(new zc(this, i13));
        }
        org.telegram.ui.Wallet.b5 b5Var = new org.telegram.ui.Wallet.b5(activity, p6Var);
        this.I0 = b5Var;
        b5Var.setVisibility(4);
        b5Var.setOnClickListener(new vc(this, i18));
        pdVar3.addView(b5Var, w7.b6.e(44, 44, 85));
        ag agVar = new ag(activity);
        org.telegram.ui.ActionBar.u5 u5Var = (org.telegram.ui.ActionBar.u5) agVar.c;
        this.F0 = agVar;
        u5Var.setTextSize(16);
        agVar.invalidate();
        agVar.setVisibility(4);
        agVar.setSoundEffectsEnabled(false);
        agVar.setScaleX(0.1f);
        agVar.setScaleY(0.1f);
        agVar.setAlpha(0.0f);
        agVar.setPadding(org.telegram.messenger.i0.L(14.0f), 0, org.telegram.messenger.i0.L(14.0f), 0);
        u5Var.setGravity(21);
        agVar.invalidate();
        u5Var.setTextColor(e0(i14));
        agVar.invalidate();
        pdVar3.addView(agVar, w7.b6.e(74, 44, 85));
        agVar.setOnClickListener(new vc(this, 8));
        agVar.setOnLongClickListener(new zc(this, 1));
        SharedPreferences c12 = org.telegram.messenger.vp.c1();
        this.x2 = c12.getInt("kbd_height", org.telegram.messenger.i0.L(200.0f));
        this.y2 = c12.getInt("kbd_height_land3", org.telegram.messenger.i0.L(200.0f));
        i1(false, false);
        F(false);
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
    public static boolean C(int i10, long j10, org.telegram.ui.ActionBar.k2 k2Var, CharSequence charSequence) {
        o5[] o5VarArr;
        int i11;
        int i12;
        TLRPC.ChatFull M0;
        TLRPC.TL_messages_stickerSet Y;
        ArrayList arrayList;
        int i13;
        ArrayList<TLRPC.Document> arrayList2;
        ArrayList<TLRPC.Document> arrayList3;
        Object obj;
        ArrayList<TLRPC.Document> arrayList4;
        boolean z10 = false;
        if (charSequence != null && k2Var != null && !org.telegram.messenger.d20.i(i10).q() && org.telegram.messenger.d20.i(i10).e() != j10 && (charSequence instanceof Spanned) && (o5VarArr = (o5[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), o5.class)) != null) {
            int i14 = 0;
            while (i14 < o5VarArr.length) {
                o5 o5Var = o5VarArr[i14];
                if (o5Var != null) {
                    TLRPC.Document document = o5Var.document;
                    if (document == null) {
                        i12 = i10;
                        document = f5.e(i12, o5Var.getDocumentId());
                    } else {
                        i12 = i10;
                    }
                    long documentId = o5VarArr[i14].getDocumentId();
                    if (document == null) {
                        ArrayList s02 = org.telegram.messenger.ui.b0(i12).s0(5);
                        int size = s02.size();
                        ?? r12 = z10;
                        ?? r62 = s02;
                        while (r12 < size) {
                            Object obj2 = r62.get(r12);
                            int i15 = r12 + 1;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
                            if (tL_messages_stickerSet != null && (arrayList4 = tL_messages_stickerSet.documents) != null && !arrayList4.isEmpty()) {
                                ArrayList<TLRPC.Document> arrayList5 = tL_messages_stickerSet.documents;
                                int size2 = arrayList5.size();
                                ?? r15 = z10;
                                r62 = r62;
                                while (r15 < size2) {
                                    TLRPC.Document document2 = arrayList5.get(r15);
                                    int i16 = r15 + 1;
                                    TLRPC.Document document3 = document2;
                                    i11 = i14;
                                    obj = r62;
                                    if (document3.id == documentId) {
                                        document = document3;
                                        break;
                                    }
                                    r62 = obj;
                                    i14 = i11;
                                    r15 = i16;
                                }
                            }
                            i11 = i14;
                            obj = r62;
                            if (document != null) {
                                break;
                            }
                            r62 = obj;
                            i14 = i11;
                            z10 = false;
                            r12 = i15;
                        }
                    }
                    i11 = i14;
                    if (document == null) {
                        ArrayList arrayList6 = org.telegram.messenger.ui.b0(i12).s0[1];
                        int size3 = arrayList6.size();
                        int i17 = 0;
                        while (i17 < size3) {
                            Object obj3 = arrayList6.get(i17);
                            i17++;
                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj3;
                            if (stickerSetCovered != null && (arrayList3 = stickerSetCovered.covers) != null && !arrayList3.isEmpty()) {
                                ArrayList<TLRPC.Document> arrayList7 = stickerSetCovered.covers;
                                int size4 = arrayList7.size();
                                int i18 = 0;
                                while (i18 < size4) {
                                    TLRPC.Document document4 = arrayList7.get(i18);
                                    i18++;
                                    TLRPC.Document document5 = document4;
                                    arrayList = arrayList6;
                                    i13 = size3;
                                    if (document5.id == documentId) {
                                        document = document5;
                                        break;
                                    }
                                    arrayList6 = arrayList;
                                    size3 = i13;
                                }
                            }
                            arrayList = arrayList6;
                            i13 = size3;
                            if (document != null) {
                                break;
                            }
                            if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                arrayList2 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                            } else {
                                if ((stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) && stickerSetCovered.set != null) {
                                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                                    tL_inputStickerSetID.id = stickerSetCovered.set.id;
                                    TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.ui.b0(i12).m0(tL_inputStickerSetID, true);
                                    if (m0 != null) {
                                        arrayList2 = m0.documents;
                                    }
                                }
                                arrayList2 = null;
                            }
                            if (arrayList2 != null && !arrayList2.isEmpty()) {
                                int size5 = arrayList2.size();
                                int i19 = 0;
                                while (true) {
                                    if (i19 >= size5) {
                                        break;
                                    }
                                    TLRPC.Document document6 = arrayList2.get(i19);
                                    i19++;
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
                            size3 = i13;
                        }
                    }
                    if (document != null && (M0 = org.telegram.messenger.vp.r1(i12).M0(-j10)) != null && M0.emojiset != null && (Y = org.telegram.messenger.ui.b0(i12).Y(M0.emojiset)) != null) {
                        ArrayList<TLRPC.Document> arrayList8 = Y.documents;
                        int size6 = arrayList8.size();
                        int i20 = 0;
                        while (i20 < size6) {
                            TLRPC.Document document8 = arrayList8.get(i20);
                            i20++;
                            if (document8.id == documentId) {
                                return false;
                            }
                        }
                    }
                    if (document == null || !org.telegram.messenger.jj.m3(document)) {
                        cc.a0(k2Var).r(document, org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131743889, "UnlockPremiumEmojiHint")), org.telegram.messenger.cd.L0(2131747048, "PremiumMore"), new wc(0, k2Var)).j();
                        return true;
                    }
                } else {
                    i11 = i14;
                }
                i14 = i11 + 1;
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
        org.telegram.messenger.jj jjVar;
        org.telegram.messenger.jj jjVar2;
        boolean Y;
        org.telegram.messenger.jj jjVar3;
        sf sfVar;
        org.telegram.ui.un unVar;
        boolean z11 = chatActivityEnterView.T2 != null && (unVar = chatActivityEnterView.P2) != null && unVar.v4 && unVar.b() == ((long) chatActivityEnterView.T2.f1());
        if (chatActivityEnterView.T2 == null || z11) {
            int i10 = chatActivityEnterView.Q;
            long j10 = chatActivityEnterView.Q2;
            if (j10 > 0) {
                z10 = org.telegram.messenger.h20.u(org.telegram.messenger.vp.r1(i10).Z1(Long.valueOf(j10)));
            } else {
                org.telegram.messenger.vp.r1(i10).L0(Long.valueOf(-j10));
                z10 = false;
            }
            if (!z10) {
                jjVar = org.telegram.messenger.o5.z(chatActivityEnterView.Q2) ? chatActivityEnterView.m2 : null;
                jjVar2 = chatActivityEnterView.T2;
                if (jjVar2 != null || z11) {
                    jjVar2 = chatActivityEnterView.m2;
                }
                Y = chatActivityEnterView.Y(keyboardButton, jjVar, jjVar2, null);
                if (chatActivityEnterView.T2 != null || z11) {
                    jjVar3 = chatActivityEnterView.m2;
                    if (jjVar3 != null && jjVar3.k.reply_markup.single_use) {
                        if (Y) {
                            chatActivityEnterView.r1(0, 0, true, true);
                        } else {
                            chatActivityEnterView.G0();
                        }
                        org.telegram.messenger.vp.r1(chatActivityEnterView.Q).f7.edit().putInt("answered_" + chatActivityEnterView.getTopicKeyString(), chatActivityEnterView.m2.f1()).commit();
                    }
                } else {
                    chatActivityEnterView.G0();
                    chatActivityEnterView.X0(chatActivityEnterView.W2, true, false);
                }
                sfVar = chatActivityEnterView.Z2;
                if (sfVar == null) {
                    sfVar.E(null, true, 0, 0, 0L);
                    return;
                }
                return;
            }
        }
        jjVar = chatActivityEnterView.T2;
        jjVar2 = chatActivityEnterView.T2;
        if (jjVar2 != null) {
        }
        jjVar2 = chatActivityEnterView.m2;
        Y = chatActivityEnterView.Y(keyboardButton, jjVar, jjVar2, null);
        if (chatActivityEnterView.T2 != null) {
        }
        jjVar3 = chatActivityEnterView.m2;
        if (jjVar3 != null) {
            if (Y) {
            }
            org.telegram.messenger.vp.r1(chatActivityEnterView.Q).f7.edit().putInt("answered_" + chatActivityEnterView.getTopicKeyString(), chatActivityEnterView.m2.f1()).commit();
        }
        sfVar = chatActivityEnterView.Z2;
        if (sfVar == null) {
        }
    }

    public static void f(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.fj fjVar, boolean z10, int i10, int i11, Object obj, Long l4, boolean z11) {
        if (chatActivityEnterView.G0 > 0 && !chatActivityEnterView.c()) {
            sf sfVar = chatActivityEnterView.Z2;
            if (sfVar != null) {
                ag agVar = chatActivityEnterView.F0;
                sfVar.e1(agVar, ((org.telegram.ui.ActionBar.u5) agVar.c).getText(), true);
                return;
            }
            return;
        }
        if (chatActivityEnterView.R1 != 0) {
            chatActivityEnterView.k1(0, true);
            chatActivityEnterView.U0.t(true);
            chatActivityEnterView.U0.B();
        }
        chatActivityEnterView.l1(false, true, false, true);
        sf sfVar2 = chatActivityEnterView.Z2;
        TL_stories.StoryItem P0 = sfVar2 != null ? sfVar2.P0() : null;
        org.telegram.messenger.qz C = org.telegram.messenger.qz.C(chatActivityEnterView.Q);
        long j10 = chatActivityEnterView.Q2;
        org.telegram.messenger.jj jjVar = chatActivityEnterView.T2;
        org.telegram.messenger.jj threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.kn knVar = chatActivityEnterView.V2;
        boolean z12 = obj instanceof TLRPC.TL_messages_stickerSet;
        org.telegram.ui.un unVar = chatActivityEnterView.P2;
        C.v0(document, str, j10, jjVar, threadMessage, P0, knVar, fjVar, z10, i10, i11, z12, obj, unVar != null ? unVar.P8() : null, l4.longValue(), chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
        sf sfVar3 = chatActivityEnterView.Z2;
        if (sfVar3 != null) {
            sfVar3.E(null, true, i10, 0, 0L);
        }
        if (z11) {
            chatActivityEnterView.setFieldText("");
        }
        org.telegram.messenger.ui.b0(chatActivityEnterView.Q).d(0, obj, document, (int) (System.currentTimeMillis() / 1000), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.telegram.messenger.jj getThreadMessage() {
        org.telegram.ui.un unVar = this.P2;
        if (unVar != null) {
            return unVar.l4;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getThreadMessageId() {
        org.telegram.messenger.jj jjVar;
        org.telegram.ui.un unVar = this.P2;
        if (unVar == null || (jjVar = unVar.l4) == null) {
            return 0;
        }
        return jjVar.f1();
    }

    private String getTopicKeyString() {
        org.telegram.ui.un unVar = this.P2;
        if (unVar == null || !unVar.v4) {
            return "" + this.Q2;
        }
        return this.Q2 + "_" + unVar.b();
    }

    public static CharSequence n(Paint.FontMetricsInt fontMetricsInt, CharSequence charSequence, ArrayList arrayList) {
        boolean z10;
        boolean z11;
        Collections.sort(arrayList, org.telegram.messenger.ui.d2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(n00.a(charSequence, false));
        Object[] spans = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), Object.class);
        if (spans != null && spans.length > 0) {
            for (Object obj : spans) {
                spannableStringBuilder.removeSpan(obj);
            }
        }
        boolean z12 = true;
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                try {
                    TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i10);
                    if (messageEntity.offset + messageEntity.length <= spannableStringBuilder.length()) {
                        if (messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            h51 h51Var = new h51("" + ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id, 3, null);
                            int i11 = messageEntity.offset;
                            spannableStringBuilder.setSpan(h51Var, i11, messageEntity.length + i11, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            h51 h51Var2 = new h51("" + ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id, 3, null);
                            int i12 = messageEntity.offset;
                            spannableStringBuilder.setSpan(h51Var2, i12, messageEntity.length + i12, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityCode) {
                            yz0 yz0Var = new yz0();
                            yz0Var.a |= 4;
                            zz0 zz0Var = new zz0(yz0Var, 0);
                            int i13 = messageEntity.offset;
                            org.telegram.messenger.ui.f(zz0Var, i13, messageEntity.length + i13, spannableStringBuilder, true);
                        } else if (!(messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                            if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                yz0 yz0Var2 = new yz0();
                                yz0Var2.a |= 1;
                                zz0 zz0Var2 = new zz0(yz0Var2, 0);
                                int i14 = messageEntity.offset;
                                org.telegram.messenger.ui.f(zz0Var2, i14, messageEntity.length + i14, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                yz0 yz0Var3 = new yz0();
                                yz0Var3.a |= 2;
                                zz0 zz0Var3 = new zz0(yz0Var3, 0);
                                int i15 = messageEntity.offset;
                                org.telegram.messenger.ui.f(zz0Var3, i15, messageEntity.length + i15, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                yz0 yz0Var4 = new yz0();
                                yz0Var4.a |= 8;
                                zz0 zz0Var4 = new zz0(yz0Var4, 0);
                                int i16 = messageEntity.offset;
                                org.telegram.messenger.ui.f(zz0Var4, i16, messageEntity.length + i16, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                yz0 yz0Var5 = new yz0();
                                yz0Var5.a |= 16;
                                zz0 zz0Var5 = new zz0(yz0Var5, 0);
                                int i17 = messageEntity.offset;
                                org.telegram.messenger.ui.f(zz0Var5, i17, messageEntity.length + i17, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                g51 g51Var = new g51(messageEntity.url, null);
                                int i18 = messageEntity.offset;
                                spannableStringBuilder.setSpan(g51Var, i18, messageEntity.length + i18, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityFormattedDate) {
                                yz0 yz0Var6 = new yz0();
                                yz0Var6.a |= 128;
                                int i19 = messageEntity.offset;
                                yz0Var6.b = i19;
                                yz0Var6.c = i19 + messageEntity.length;
                                yz0Var6.d = messageEntity;
                                int i20 = messageEntity.offset;
                                n00 n00Var = new n00(spannableStringBuilder.subSequence(i20, messageEntity.length + i20).toString(), yz0Var6, (TLRPC.TL_messageEntityFormattedDate) messageEntity);
                                int i21 = messageEntity.offset;
                                spannableStringBuilder.setSpan(n00Var, i21, messageEntity.length + i21, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                yz0 yz0Var7 = new yz0();
                                yz0Var7.a |= 256;
                                zz0 zz0Var6 = new zz0(yz0Var7, 0);
                                int i22 = messageEntity.offset;
                                org.telegram.messenger.ui.f(zz0Var6, i22, messageEntity.length + i22, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                o5 o5Var = tL_messageEntityCustomEmoji.document != null ? new o5(tL_messageEntityCustomEmoji.document, fontMetricsInt) : new o5(tL_messageEntityCustomEmoji.document_id, fontMetricsInt);
                                int i23 = messageEntity.offset;
                                spannableStringBuilder.setSpan(o5Var, i23, messageEntity.length + i23, 33);
                            }
                        }
                    }
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            }
        }
        if (arrayList != null) {
            TreeSet treeSet = new TreeSet();
            HashMap hashMap = new HashMap();
            for (int i24 = 0; i24 < arrayList.size(); i24++) {
                TLRPC.MessageEntity messageEntity2 = (TLRPC.MessageEntity) arrayList.get(i24);
                if (messageEntity2.offset + messageEntity2.length <= spannableStringBuilder.length()) {
                    int i25 = messageEntity2.offset;
                    int i26 = messageEntity2.length + i25;
                    if (messageEntity2 instanceof TLRPC.TL_messageEntityBlockquote) {
                        treeSet.add(Integer.valueOf(i25));
                        treeSet.add(Integer.valueOf(i26));
                        hashMap.put(Integer.valueOf(i25), Integer.valueOf((messageEntity2.collapsed ? 16 : 1) | (hashMap.containsKey(Integer.valueOf(i25)) ? ((Integer) hashMap.get(Integer.valueOf(i25))).intValue() : 0)));
                        hashMap.put(Integer.valueOf(i26), Integer.valueOf((hashMap.containsKey(Integer.valueOf(i26)) ? ((Integer) hashMap.get(Integer.valueOf(i26))).intValue() : 0) | 2));
                    }
                }
            }
            Iterator it = treeSet.iterator();
            int i27 = 0;
            int i28 = 0;
            boolean z13 = false;
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int intValue = num.intValue();
                int intValue2 = ((Integer) hashMap.get(num)).intValue();
                if (i27 != intValue) {
                    int i29 = intValue - 1;
                    z11 = z12;
                    int i30 = (i29 < 0 || i29 >= spannableStringBuilder.length() || spannableStringBuilder.charAt(i29) != '\n') ? intValue : intValue - 1;
                    if (i28 > 0) {
                        wh0.c(spannableStringBuilder, i27, i30, z13);
                    }
                    i27 = intValue + 1;
                    if (i27 >= spannableStringBuilder.length() || spannableStringBuilder.charAt(intValue) != '\n') {
                        i27 = intValue;
                    }
                } else {
                    z11 = z12;
                }
                if ((intValue2 & 2) != 0) {
                    i28--;
                }
                if ((intValue2 & 1) != 0 || (intValue2 & 16) != 0) {
                    i28++;
                    z13 = (intValue2 & 16) != 0 ? z11 : false;
                }
                z12 = z11;
            }
            z10 = z12;
            if (i27 < spannableStringBuilder.length() && i28 > 0) {
                wh0.c(spannableStringBuilder, i27, spannableStringBuilder.length(), z13);
            }
        } else {
            z10 = true;
        }
        CharSequence m10 = org.telegram.messenger.k6.m(new SpannableStringBuilder(spannableStringBuilder), fontMetricsInt, false, null, 0);
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
                        int i31 = messageEntity3.offset;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("```");
                        String str = messageEntity3.language;
                        if (str == null) {
                            str = "";
                        }
                        sb2.append(str);
                        sb2.append("\n");
                        spannableStringBuilder2.insert(i31, (CharSequence) sb2.toString());
                    }
                }
            } catch (Exception e7) {
                org.telegram.messenger.f8.g(e7, z10);
            }
        }
        return m10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSlowModeButtonVisible(boolean z10) {
        int i10;
        int i11 = z10 ? 0 : 8;
        ag agVar = this.F0;
        agVar.setVisibility(i11);
        if (z10) {
            i10 = org.telegram.messenger.i0.L(agVar.b ? 26.0f : 16.0f);
        } else {
            i10 = 0;
        }
        se seVar = this.E0;
        if (seVar == null || seVar.getPaddingRight() == i10) {
            return;
        }
        this.E0.setPadding(0, org.telegram.messenger.i0.L(9.0f), i10, org.telegram.messenger.i0.L(10.0f));
    }

    public final void A() {
        org.telegram.ui.un unVar = this.P2;
        if (unVar == null) {
            return;
        }
        J1(unVar.e, unVar.q8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b5, code lost:
    
        if (android.text.TextUtils.isEmpty(r15 == null ? "" : org.telegram.messenger.i0.n1(r15.getTextToUse())) != false) goto L124;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A1(boolean z10) {
        fe feVar;
        if (this.X3) {
            org.telegram.ui.un unVar = this.P2;
            if (unVar != null && !unVar.d6) {
                z10 = false;
            }
            boolean f02 = f0();
            int i10 = 1;
            boolean z11 = this.q5 != 1 && this.Q2 > 0;
            fe feVar2 = this.x1;
            boolean z12 = feVar2 != null && feVar2.getVisibility() == 0;
            if (!f02 && !this.p2 && this.n2 == null) {
                fe feVar3 = this.x1;
                if (feVar3 != null) {
                    feVar3.setVisibility(8);
                }
            } else if (this.n2 != null) {
                if (q0() && this.f2 == 1 && this.n2.is_persistent) {
                    fe feVar4 = this.x1;
                    if (feVar4 != null && feVar4.getVisibility() != 8) {
                        this.x1.setVisibility(8);
                    }
                } else {
                    M();
                    if (this.x1.getVisibility() != 0) {
                        this.x1.setVisibility(0);
                    }
                    this.U1.a(R.drawable.input_bot2, true);
                    this.x1.setContentDescription(org.telegram.messenger.cd.L0(2131754918, "AccDescrBotKeyboard"));
                }
            } else if (z11) {
                fe feVar5 = this.x1;
                if (feVar5 != null) {
                    feVar5.setVisibility(8);
                }
            } else {
                M();
                this.U1.a(R.drawable.input_bot1, true);
                this.x1.setContentDescription(org.telegram.messenger.cd.L0(2131754919, "AccDescrBotCommands"));
                this.x1.setVisibility(0);
            }
            if (z11) {
                N();
            }
            fe feVar6 = this.x1;
            boolean z13 = (feVar6 != null && feVar6.getVisibility() == 0) != z12;
            xh.w wVar = this.l0;
            int i11 = 2;
            if (wVar != null) {
                boolean z14 = wVar.x;
                wVar.setWebView(this.q5 == 3);
                xh.w wVar2 = this.l0;
                String L0 = this.q5 == 2 ? org.telegram.messenger.cd.L0(2131752891, null) : this.i0;
                if (L0 == null) {
                    wVar2.getClass();
                    L0 = org.telegram.messenger.cd.L0(2131752891, null);
                }
                String str = wVar2.n;
                boolean z15 = str == null || !str.equals(L0);
                wVar2.n = L0;
                wVar2.r = null;
                wVar2.requestLayout();
                org.telegram.messenger.i0.Y3(this.l0, z11, 0.5f, true, z10);
                z13 = z13 || z15 || z14 != this.l0.x;
            }
            if (z13 && z10) {
                rd rdVar = this.Q0;
                Float valueOf = Float.valueOf(rdVar.getX());
                HashMap hashMap = this.B0;
                hashMap.put(rdVar, valueOf);
                se seVar = this.E0;
                if (seVar != null) {
                    hashMap.put(seVar, Float.valueOf(seVar.getX()));
                }
                fe feVar7 = this.x1;
                boolean z16 = feVar7 != null && feVar7.getVisibility() == 0;
                if (z16 != z12 && (feVar = this.x1) != null) {
                    feVar.setVisibility(0);
                    if (z16) {
                        this.x1.setAlpha(0.0f);
                        this.x1.setScaleX(0.1f);
                        this.x1.setScaleY(0.1f);
                    } else if (!z16) {
                        this.x1.setAlpha(1.0f);
                        this.x1.setScaleX(1.0f);
                        this.x1.setScaleY(1.0f);
                    }
                    org.telegram.messenger.i0.X3(this.x1, z16, 0.1f, true, 1.0f, true, new sc(this, i10));
                }
            }
            fe feVar8 = this.x1;
            if (feVar8 != null && feVar8.getVisibility() == 0) {
                se seVar2 = this.E0;
            }
            i11 = this.P4;
            G1(i11);
        }
    }

    public final void B(boolean z10) {
        org.telegram.messenger.jj jjVar;
        boolean z11 = this.Q2 < 0 && this.X3 && this.Z1 == null && (rf.s.g(this.Q).e(getEditText() != null ? getEditText().toString() : null, this.b5) > 0 || ((jjVar = this.T2) != null && org.telegram.messenger.jj.c3(jjVar.k)));
        fe.b bVar = this.m5;
        boolean z12 = bVar.f != z11;
        bVar.a(z11, z10);
        be beVar = this.J0;
        if (beVar != null) {
            beVar.w = z11;
            beVar.invalidate();
        }
        if (z12) {
            F(z10);
        }
    }

    public final void B0() {
        this.j2 = true;
        ie ieVar = this.q0;
        if (ieVar != null) {
            ieVar.e = false;
            ieVar.dismiss();
        }
        if (this.z2) {
            this.l2 = true;
        }
        tc tcVar = new tc(this, 9);
        this.N4 = tcVar;
        org.telegram.messenger.i0.h3(tcVar, 500L);
    }

    public final void B1() {
        int d;
        s4.a0 a0Var;
        int L0;
        View m10;
        qe qeVar = this.m0;
        if (qeVar == null) {
            return;
        }
        int childCount = qeVar.c.getChildCount();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = this.m0.c.getChildAt(i11);
            if (i11 < 4) {
                i10 += childAt.getMeasuredHeight();
            }
        }
        uu0 uu0Var = this.m1;
        if (i10 > 0) {
            d = i0.a.d(childCount > 4 ? 12.0f : 0.0f, (uu0Var.getMeasuredHeight() - i10) - org.telegram.messenger.i0.L(8.0f), 0);
        } else {
            d = this.n0.c.size() > 4 ? i0.a.d(162.8f, uu0Var.getMeasuredHeight(), 0) : i0.a.d((Math.max(1, Math.min(4, this.n0.c.size())) * 36) + 8, uu0Var.getMeasuredHeight(), 0);
        }
        if (this.m0.c.getPaddingTop() != d) {
            this.m0.c.setTopGlowOffset(d);
            if (this.Z4 == -1 && this.m0.getVisibility() == 0 && this.m0.c.getLayoutManager() != null && (L0 = (a0Var = (s4.a0) this.m0.c.getLayoutManager()).L0()) >= 0 && (m10 = a0Var.m(L0)) != null) {
                this.Z4 = L0;
                this.a5 = m10.getTop() - this.m0.c.getPaddingTop();
            }
            this.m0.c.setPadding(0, d, 0, org.telegram.messenger.i0.L(8.0f));
        }
    }

    public final void C0() {
        se seVar;
        this.j2 = false;
        tc tcVar = this.N4;
        if (tcVar != null) {
            org.telegram.messenger.i0.r(tcVar);
            this.N4 = null;
        }
        if (f0() && r()) {
            return;
        }
        getVisibility();
        if (!this.l2 || org.telegram.ui.ActionBar.k2.hasSheets(this.P2)) {
            return;
        }
        this.l2 = false;
        sf sfVar = this.Z2;
        if (sfVar != null) {
            sfVar.b1();
        }
        if (this.R1 == 0 && (seVar = this.E0) != null) {
            seVar.requestFocus();
        }
        org.telegram.messenger.i0.J3(this.E0);
        if (org.telegram.messenger.i0.D || this.z2 || org.telegram.messenger.i0.E) {
            return;
        }
        this.k3 = true;
        ee eeVar = this.r3;
        org.telegram.messenger.i0.r(eeVar);
        org.telegram.messenger.i0.h3(eeVar, 100L);
    }

    public final void C1(boolean z10) {
        if (this.q5 != 1 && this.Q2 > 0) {
            N();
        }
        xh.w wVar = this.l0;
        if (wVar != null) {
            wVar.setWebView(f0());
        }
        A1(z10);
    }

    public final void D() {
        boolean z10;
        boolean z11;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        if (this.e2) {
            return;
        }
        if (this.p1 == null) {
            this.e2 = false;
            i1(false, false);
            return;
        }
        boolean z12 = true;
        this.e2 = true;
        this.x0 = true;
        this.y0 = true;
        if (org.telegram.messenger.o5.z(this.Q2)) {
            TLRPC.Chat L0 = org.telegram.messenger.vp.r1(this.R.a).L0(Long.valueOf(-this.Q2));
            z10 = org.telegram.messenger.w3.T(L0) && !L0.megagroup;
            if (z10 && !L0.creator && ((tL_chatAdminRights = L0.admin_rights) == null || !tL_chatAdminRights.post_messages)) {
                this.e2 = false;
            }
            this.x0 = org.telegram.messenger.w3.s(L0);
            this.y0 = org.telegram.messenger.w3.v(L0);
        } else {
            z10 = false;
        }
        if (!org.telegram.messenger.tz.y0) {
            this.e2 = false;
        }
        if (this.e2) {
            if (org.telegram.messenger.tz.P0) {
                CameraController.getInstance().initCamera(null);
            }
            z11 = org.telegram.messenger.vp.d1().getBoolean(z10 ? "currentModeVideoChannel" : "currentModeVideo", z10);
        } else {
            z11 = false;
        }
        if (!this.x0 && z11) {
            z11 = false;
        }
        if (this.y0 || z11) {
            z12 = z11;
        } else if (!this.e2) {
            z12 = false;
        }
        i1(z12, false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:163|(1:243)(1:167)|168|(8:170|(1:198)(1:174)|(1:197)(1:180)|181|(4:183|(1:185)(1:191)|186|(1:190))|(1:193)|194|(1:196))|199|(3:201|(1:203)(1:205)|204)|206|(3:(1:209)|(2:213|(1:223))|224)|225|(4:227|(1:241)(1:231)|232|(5:234|235|236|237|238))|242|235|236|237|238) */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x034a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean D0(View view) {
        org.telegram.ui.un unVar;
        int measuredHeight;
        TLRPC.User j10;
        se seVar;
        org.telegram.messenger.nj njVar;
        org.telegram.messenger.lj ljVar;
        ArrayList arrayList;
        be beVar;
        j50 j50Var;
        boolean z10;
        org.telegram.messenger.nj njVar2;
        boolean z11;
        boolean z12;
        boolean z13;
        se seVar2;
        int i10 = 0;
        if (c() || (((unVar = this.P2) != null && unVar.f4 == 5) || this.m5.f)) {
            return false;
        }
        boolean z14 = this.A4;
        int i11 = 3;
        be beVar2 = this.J0;
        org.telegram.ui.ActionBar.p6 p6Var = this.W3;
        int i12 = 2;
        boolean z15 = true;
        if (z14 || !(((seVar = this.E0) != null && !TextUtils.isEmpty(seVar.getText())) || unVar == null || (njVar = unVar.v5) == null || (ljVar = njVar.b) == null || (arrayList = ljVar.e) == null || arrayList.isEmpty())) {
            boolean z16 = unVar != null && org.telegram.messenger.h20.B(unVar.j());
            if (this.O0 == null) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(this.O2, p6Var);
                this.O0 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
                this.O0.setOnTouchListener(new ne(this));
                this.O0.setDispatchKeyEventListener(new dd(this));
                this.O0.setShownFromBottom(false);
                boolean z17 = unVar != null && unVar.L6();
                boolean z18 = !z16 && (this.G0 <= 0 || c());
                if (z17) {
                    boolean z19 = !z18;
                    org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(0, getContext(), this.W3, true, z19);
                    this.G4 = b1Var;
                    if (z16) {
                        b1Var.j(org.telegram.messenger.cd.L0(2131745531, null), R.drawable.msg_calendar2, null);
                    } else {
                        b1Var.j(org.telegram.messenger.cd.L0(2131745876, null), R.drawable.msg_calendar2, null);
                    }
                    this.G4.setMinimumWidth(org.telegram.messenger.i0.L(196.0f));
                    this.G4.setOnClickListener(new vc(this, 11));
                    this.O0.a(this.G4, w7.b6.o(-1, 44));
                    int i13 = org.telegram.messenger.tz.a;
                    SharedPreferences.Editor edit = org.telegram.messenger.vp.d1().edit();
                    edit.putInt("scheduledHintShows", 3);
                    edit.apply();
                    if (!z16 && this.Q2 > 0) {
                        org.telegram.ui.ActionBar.b1 b1Var2 = new org.telegram.ui.ActionBar.b1(0, getContext(), this.W3, true, z19);
                        this.c = b1Var2;
                        b1Var2.j(org.telegram.messenger.cd.L0(2131745603, null), R.drawable.msg_online, null);
                        this.c.setMinimumWidth(org.telegram.messenger.i0.L(196.0f));
                        this.c.setOnClickListener(new vc(this, 12));
                        this.O0.a(this.c, w7.b6.o(-1, 44));
                    }
                }
                if (z18) {
                    org.telegram.ui.ActionBar.b1 b1Var3 = new org.telegram.ui.ActionBar.b1(0, getContext(), this.W3, !z17, true);
                    b1Var3.j(org.telegram.messenger.cd.L0(2131745600, null), R.drawable.input_notify_off, null);
                    b1Var3.setMinimumWidth(org.telegram.messenger.i0.L(196.0f));
                    b1Var3.setOnClickListener(new vc(this, 13));
                    this.O0.a(b1Var3, w7.b6.o(-1, 44));
                }
                oe oeVar = new oe(this, this.O0);
                this.N0 = oeVar;
                oeVar.b = false;
                oeVar.setAnimationStyle(R.style.PopupContextAnimation2);
                this.N0.setOutsideTouchable(true);
                this.N0.setClippingEnabled(true);
                this.N0.setInputMethodMode(2);
                this.N0.setSoftInputMode(0);
                this.N0.getContentView().setFocusableInTouchMode(true);
                int i14 = org.telegram.messenger.tz.a;
                SharedPreferences.Editor edit2 = org.telegram.messenger.vp.d1().edit();
                edit2.putInt("scheduledOrNoSoundHintShows", 3);
                edit2.apply();
                sf sfVar = this.Z2;
                if (sfVar != null) {
                    sfVar.Y1();
                }
            }
            org.telegram.ui.ActionBar.b1 b1Var4 = this.G4;
            if (b1Var4 != null) {
                b1Var4.setVisibility(this.O ? 8 : 0);
            }
            if (this.c != null) {
                j10 = unVar != null ? unVar.j() : null;
                if (j10 != null && !j10.bot) {
                    TLRPC.UserStatus userStatus = j10.status;
                    if (!(userStatus instanceof TLRPC.TL_userStatusEmpty) && !(userStatus instanceof TLRPC.TL_userStatusOnline) && !(userStatus instanceof TLRPC.TL_userStatusRecently) && !(userStatus instanceof TLRPC.TL_userStatusLastMonth) && !(userStatus instanceof TLRPC.TL_userStatusLastWeek)) {
                        this.c.setVisibility(0);
                    }
                }
                this.c.setVisibility(8);
            }
            this.O0.setupRadialSelectors(e0(org.telegram.ui.ActionBar.t6.I5));
            this.O0.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31));
            this.N0.setFocusable(true);
            int[] iArr = this.N2;
            view.getLocationInWindow(iArr);
            if (this.z2) {
                int measuredHeight2 = getMeasuredHeight();
                View view2 = this.G1;
                if (measuredHeight2 > org.telegram.messenger.i0.L((view2 == null || view2.getVisibility() != 0) ? 58.0f : 102.0f)) {
                    measuredHeight = view.getMeasuredHeight() + iArr[1];
                    this.N0.showAtLocation(view, 51, org.telegram.messenger.i0.L(8.0f) + ((view.getMeasuredWidth() + iArr[0]) - this.O0.getMeasuredWidth()), measuredHeight);
                    this.N0.b();
                    beVar2.invalidate();
                    view.performHapticFeedback(3, 2);
                    return true;
                }
            }
            measuredHeight = (iArr[1] - this.O0.getMeasuredHeight()) - org.telegram.messenger.i0.L(2.0f);
            this.N0.showAtLocation(view, 51, org.telegram.messenger.i0.L(8.0f) + ((view.getMeasuredWidth() + iArr[0]) - this.O0.getMeasuredWidth()), measuredHeight);
            this.N0.b();
            beVar2.invalidate();
            view.performHapticFeedback(3, 2);
            return true;
        }
        pe peVar = this.L0;
        if (peVar != null) {
            peVar.g(false);
        }
        org.telegram.messenger.i0.r(this.F4);
        pe peVar2 = new pe(this, getContext(), p6Var, i10);
        this.L0 = peVar2;
        peVar2.setOnDismissListener(new r0(this, i11));
        boolean z20 = (this.d3 == null && ((seVar2 = this.E0) == null || TextUtils.isEmpty(seVar2.getText()))) ? false : true;
        ArrayList arrayList2 = new ArrayList();
        try {
            if (this.E1 != null) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.id = 0;
                tL_message.out = true;
                tL_message.peer_id = org.telegram.messenger.vp.r1(this.Q).y1(this.Q2);
                tL_message.from_id = org.telegram.messenger.vp.r1(this.Q).y1(org.telegram.messenger.d20.i(this.Q).e());
                tL_message.rich_message = this.E1;
                org.telegram.messenger.jj jjVar = new org.telegram.messenger.jj(this.Q, tL_message, false, true);
                org.telegram.messenger.jj jjVar2 = this.T2;
                if (jjVar2 != null && !jjVar2.p) {
                    jjVar.C = jjVar2;
                }
                jjVar.R2 = Boolean.TRUE;
                jjVar.n0(null);
                jjVar.u1 = true;
                jjVar.z0 = true;
                arrayList2.add(jjVar);
                beVar = beVar2;
            } else if (this.b3 != null) {
                TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                tL_message2.id = 0;
                tL_message2.out = true;
                beVar = beVar2;
                tL_message2.peer_id = org.telegram.messenger.vp.r1(this.Q).y1(this.Q2);
                tL_message2.from_id = org.telegram.messenger.vp.r1(this.Q).y1(org.telegram.messenger.d20.i(this.Q).e());
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message2.media = tL_messageMediaDocument;
                tL_messageMediaDocument.voice = true;
                tL_messageMediaDocument.document = this.b3;
                tL_message2.send_state = 1;
                tL_message2.attachPath = this.c3;
                org.telegram.messenger.jj jjVar3 = new org.telegram.messenger.jj(this.Q, tL_message2, false, true);
                org.telegram.messenger.jj jjVar4 = this.T2;
                if (jjVar4 != null && !jjVar4.p) {
                    jjVar3.C = jjVar4;
                }
                jjVar3.R2 = Boolean.TRUE;
                jjVar3.n0(null);
                jjVar3.u1 = true;
                jjVar3.z0 = true;
                arrayList2.add(jjVar3);
            } else {
                beVar = beVar2;
                if (z20) {
                    TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
                    tL_message3.id = 0;
                    tL_message3.out = true;
                    tL_message3.peer_id = org.telegram.messenger.vp.r1(this.Q).y1(this.Q2);
                    tL_message3.from_id = org.telegram.messenger.vp.r1(this.Q).y1(org.telegram.messenger.d20.i(this.Q).e());
                    se seVar3 = this.E0;
                    CharSequence[] charSequenceArr = {new SpannableStringBuilder(seVar3 == null ? "" : seVar3.getTextToUse())};
                    org.telegram.messenger.jj.d(charSequenceArr[0], true);
                    tL_message3.entities.addAll(org.telegram.messenger.ui.b0(this.Q).W(charSequenceArr, true, true));
                    tL_message3.message = charSequenceArr[0].toString();
                    org.telegram.messenger.jj jjVar5 = this.T2;
                    if (jjVar5 != null && !jjVar5.p) {
                        TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                        org.telegram.messenger.jj jjVar6 = this.U2;
                        if (jjVar6 != null) {
                            tL_messageReplyHeader.flags |= 2;
                            tL_messageReplyHeader.reply_to_top_id = jjVar6.f1();
                        }
                        tL_messageReplyHeader.flags |= 16;
                        tL_messageReplyHeader.reply_to_msg_id = this.T2.f1();
                        tL_message3.reply_to = tL_messageReplyHeader;
                    }
                    if (this.X2 != null) {
                        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                        tL_messageMediaWebPage.webpage = this.X2;
                        if (unVar != null && (njVar2 = unVar.v5) != null && njVar2.o) {
                            boolean z21 = njVar2.q;
                            tL_messageMediaWebPage.force_small_media = z21;
                            tL_messageMediaWebPage.force_large_media = !z21;
                            tL_message3.invert_media = njVar2.r;
                        }
                        tL_message3.media = tL_messageMediaWebPage;
                    }
                    org.telegram.messenger.jj jjVar7 = new org.telegram.messenger.jj(this.Q, tL_message3, false, false);
                    org.telegram.messenger.jj jjVar8 = this.T2;
                    if (jjVar8 != null && !jjVar8.p) {
                        jjVar7.C = jjVar8;
                    }
                    jjVar7.z0 = true;
                    jjVar7.R2 = Boolean.TRUE;
                    jjVar7.D = 0;
                    jjVar7.n0(null);
                    jjVar7.u1 = true;
                    arrayList2.add(jjVar7);
                } else if (unVar != null && (j50Var = unVar.p3) != null && j50Var.getTextureView() != null) {
                    pe peVar3 = this.L0;
                    TextureView textureView = unVar.p3.getTextureView();
                    peVar3.getClass();
                    if (textureView != null) {
                        peVar3.k0 = new RectF();
                        int[] iArr2 = new int[2];
                        textureView.getLocationOnScreen(iArr2);
                        peVar3.k0.set(iArr2[0], iArr2[1], textureView.getWidth() + r14, textureView.getHeight() + iArr2[1]);
                    }
                    z10 = true;
                    this.L0.p(arrayList2);
                    if (z20 && this.b3 == null) {
                        pe peVar4 = this.L0;
                        se seVar4 = this.E0;
                        d dVar = new d(this, 4);
                        fd fdVar = new fd(this, i12);
                        peVar4.R = seVar4;
                        peVar4.T = dVar;
                        peVar4.U = fdVar;
                    }
                    this.L0.q(beVar, true, new org.telegram.ui.ActionBar.c0(i12, this, z20));
                    if ((!z20 || z10) && this.Q2 >= 0) {
                        this.L0.c(unVar);
                        this.L0.n(this.S4);
                    }
                    z60 F = z60.F(this, p6Var, beVar);
                    z11 = unVar == null && org.telegram.messenger.h20.B(unVar.j());
                    z12 = unVar == null && unVar.L6();
                    if (!z11 || (this.G0 > 0 && !c())) {
                        z15 = false;
                    }
                    if (z12) {
                        F.c(R.drawable.msg_calendar2, org.telegram.messenger.cd.L0(z11 ? 2131745531 : 2131745876, null), new tc(this, 19), false);
                        if (!z11 && this.Q2 > 0) {
                            F.c(R.drawable.msg_online, org.telegram.messenger.cd.L0(2131745603, null), new tc(this, 20), false);
                            this.c = F.y();
                        }
                    }
                    if (unVar == null && this.Z2 != null && org.telegram.messenger.w3.p0(unVar.e)) {
                        z13 = false;
                        F.c(R.drawable.input_suggest_paid_24, org.telegram.messenger.cd.L0(2131747084, null), new tc(this, 18), false);
                    } else {
                        z13 = false;
                    }
                    if (z15) {
                        F.c(R.drawable.input_notify_off, org.telegram.messenger.cd.L0(2131745600, null), new bd(this, z20, i12), z13);
                    }
                    F.Y();
                    if (this.c != null) {
                        j10 = unVar != null ? unVar.j() : null;
                        if (j10 != null && !j10.bot) {
                            TLRPC.UserStatus userStatus2 = j10.status;
                            if (!(userStatus2 instanceof TLRPC.TL_userStatusEmpty) && !(userStatus2 instanceof TLRPC.TL_userStatusOnline) && !(userStatus2 instanceof TLRPC.TL_userStatusRecently) && !(userStatus2 instanceof TLRPC.TL_userStatusLastMonth) && !(userStatus2 instanceof TLRPC.TL_userStatusLastWeek)) {
                                this.c.setVisibility(0);
                            }
                        }
                        this.c.setVisibility(8);
                    }
                    this.L0.o(F);
                    this.L0.show();
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
        this.L0.p(arrayList2);
        if (z20) {
            pe peVar42 = this.L0;
            se seVar42 = this.E0;
            d dVar2 = new d(this, 4);
            fd fdVar2 = new fd(this, i12);
            peVar42.R = seVar42;
            peVar42.T = dVar2;
            peVar42.U = fdVar2;
        }
        this.L0.q(beVar, true, new org.telegram.ui.ActionBar.c0(i12, this, z20));
        if (!z20) {
        }
        this.L0.c(unVar);
        this.L0.n(this.S4);
        z60 F2 = z60.F(this, p6Var, beVar);
        if (unVar == null) {
        }
        if (unVar == null) {
        }
        if (!z11) {
        }
        z15 = false;
        if (z12) {
        }
        if (unVar == null) {
        }
        z13 = false;
        if (z15) {
        }
        F2.Y();
        if (this.c != null) {
        }
        this.L0.o(F2);
        this.L0.show();
    }

    public final void D1() {
        se seVar = this.E0;
        boolean z10 = false;
        n1((seVar == null || seVar.getLineCount() <= 2 || this.E0.getText() == null || TextUtils.isEmpty(this.E0.getText().toString().trim())) ? false : true);
        se seVar2 = this.E0;
        if (seVar2 != null && seVar2.getLineCount() > 2 && this.E0.getText() != null && !TextUtils.isEmpty(this.E0.getText().toString().trim())) {
            z10 = true;
        }
        t1(z10);
    }

    public final void E0() {
        int height = this.m1.getHeight();
        if (!this.z2) {
            height -= this.A2;
        }
        sf sfVar = this.Z2;
        if (sfVar != null) {
            sfVar.Q1(height);
        }
        if (this.G1 != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.L(72.0f);
            fe.b bVar = this.k5;
            if (height < currentActionBarHeight) {
                if (this.h3) {
                    this.h3 = false;
                    if (this.g3) {
                        bVar.a(false, false);
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.h3) {
                return;
            }
            this.h3 = true;
            if (this.g3) {
                bVar.a(true, false);
            }
        }
    }

    public final void E1() {
        float f7 = this.r * this.h;
        rd rdVar = this.Q0;
        rdVar.setScaleX(f7);
        rdVar.setScaleY(this.r * this.h);
        rdVar.setAlpha(this.s * this.n);
    }

    /* JADX WARN: Code restructure failed: missing block: B:295:0x0814, code lost:
    
        if (org.telegram.messenger.w3.s(r4) == false) goto L283;
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
    public final void F(boolean z10) {
        String str;
        yd ydVar;
        be beVar;
        int i10;
        boolean z11;
        AnimatorSet animatorSet;
        ?? r42;
        int i11;
        boolean z12;
        fe feVar;
        fe feVar2;
        AnimatorSet animatorSet2;
        int i12;
        float f7;
        fe feVar3;
        AnimatorSet animatorSet3;
        ImageView imageView;
        int i13;
        boolean z13;
        ?? r32;
        ?? r43;
        int i14;
        if (this.Z1 != null || this.F2) {
            return;
        }
        boolean z14 = this.j2 ? false : z10;
        Q1();
        se seVar = this.E0;
        CharSequence n12 = seVar == null ? "" : org.telegram.messenger.i0.n1(seVar.getTextToUse());
        int i15 = this.G0;
        be beVar2 = this.J0;
        od odVar = this.a4;
        yd ydVar2 = this.Z0;
        Property property = View.SCALE_X;
        Property property2 = View.SCALE_Y;
        Property property3 = View.ALPHA;
        jg.z2 z2Var = this.p1;
        zd zdVar = this.b1;
        ag agVar = this.F0;
        ag.r rVar = this.r1;
        ImageView imageView2 = this.P0;
        boolean z15 = z14;
        if (i15 <= 0 || i15 == Integer.MAX_VALUE || v0()) {
            int length = n12.length();
            fe.b bVar = this.l5;
            if (length > 0 || this.H2 || this.D1 || this.b3 != null || this.e3 != null || ((this.G0 == Integer.MAX_VALUE && !v0()) || ((this.p5 && getStarsPrice() > 0) || bVar.f))) {
                se seVar2 = this.E0;
                String caption = seVar2 == null ? null : seVar2.getCaption();
                boolean z16 = caption != null && (getSendButtonInternal().getVisibility() == 0 || ((feVar2 = this.S0) != null && feVar2.getVisibility() == 0));
                boolean z17 = caption == null && (imageView2.getVisibility() == 0 || ((feVar = this.S0) != null && feVar.getVisibility() == 0));
                int e02 = (this.G0 != Integer.MAX_VALUE || v0()) ? e0(org.telegram.ui.ActionBar.t6.Me) : e0(org.telegram.ui.ActionBar.t6.Kl);
                boolean n02 = n0();
                boolean z18 = (this.w2 == 0 && this.b3 == null && this.e3 == null) ? false : true;
                boolean z19 = (n02 || z18) ? false : true;
                boolean z20 = z18;
                if (e02 != this.K0) {
                    this.K0 = e02;
                    Drawable background = beVar2.getBackground();
                    int i16 = e02;
                    int red = Color.red(i16);
                    beVar = beVar2;
                    int green = Color.green(i16);
                    ydVar = ydVar2;
                    int blue = Color.blue(i16);
                    str = caption;
                    org.telegram.ui.ActionBar.t6.H1(background, Color.argb(24, red, green, blue), true);
                } else {
                    str = caption;
                    ydVar = ydVar2;
                    beVar = beVar2;
                }
                if (ydVar.getVisibility() != 0 && agVar.getVisibility() != 0 && !z16 && !z17 && !bVar.f) {
                    bh.k kVar = this.i5;
                    if (kVar != null) {
                        kVar.e(0, n02 && !z20, true);
                        if (rVar != null) {
                            ViewPropertyAnimator viewPropertyAnimator = this.q1;
                            if (viewPropertyAnimator != null) {
                                viewPropertyAnimator.cancel();
                                this.q1 = null;
                            }
                            ViewPropertyAnimator animate = rVar.animate();
                            float f10 = z19 ? 1.0f : 0.0f;
                            this.v1 = f10;
                            ViewPropertyAnimator duration = animate.alpha(f10).scaleX(z19 ? 1.0f : 0.5f).scaleY(z19 ? 1.0f : 0.5f).setInterpolator(gr.h).setDuration(320L);
                            this.q1 = duration;
                            duration.start();
                        }
                    }
                } else {
                    if (!z15) {
                        String str2 = str;
                        zdVar.setScaleX(0.1f);
                        zdVar.setScaleY(0.1f);
                        zdVar.setAlpha(0.0f);
                        ydVar.setVisibility(8);
                        if (agVar.getVisibility() == 0) {
                            agVar.setScaleX(0.1f);
                            agVar.setScaleY(0.1f);
                            agVar.setAlpha(0.0f);
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
                        fe feVar4 = this.S0;
                        if (feVar4 == null || feVar4.getVisibility() != 0) {
                            i10 = 8;
                        } else {
                            this.S0.setScaleX(0.1f);
                            this.S0.setScaleY(0.1f);
                            this.S0.setAlpha(0.0f);
                            i10 = 8;
                            this.S0.setVisibility(8);
                        }
                        if (z2Var != null) {
                            z2Var.setVisibility(i10);
                            if (this.Z2 != null && getVisibility() == 0) {
                                this.Z2.j0();
                            }
                            G1(0);
                            bh.k kVar2 = this.i5;
                            if (kVar2 != null) {
                                kVar2.e(0, n02 && !z20, true);
                                if (rVar != null) {
                                    float f11 = z19 ? 1.0f : 0.0f;
                                    this.v1 = f11;
                                    rVar.setAlpha(f11);
                                    rVar.setScaleX(z19 ? 1.0f : 0.5f);
                                    rVar.setScaleY(z19 ? 1.0f : 0.5f);
                                }
                            } else if (rVar != null) {
                                this.v1 = 0.0f;
                                rVar.setAlpha(0.0f);
                                rVar.setScaleX(0.5f);
                                rVar.setScaleY(0.5f);
                            }
                        }
                        z11 = true;
                        this.L1 = true;
                        if (this.J1 != null) {
                            sf sfVar = this.Z2;
                            if (sfVar != null && sfVar.k0()) {
                                this.J1.setVisibility(8);
                                this.J1.setTag(null);
                            }
                            this.J1.setAlpha(0.0f);
                            this.J1.setScaleX(0.0f);
                            this.J1.setScaleY(1.0f);
                            this.J1.setTranslationX(0.0f);
                        }
                        z12 = z11;
                        if (!this.A4 || (imageView = this.w1) == null) {
                            return;
                        }
                        if (z15) {
                            imageView.animate().translationX(z12 ? -i0.a.d(64.0f, beVar.l(), 0) : org.telegram.messenger.i0.L(42.0f)).setDuration(320L).setInterpolator(gr.h).start();
                            return;
                        } else {
                            imageView.setTranslationX(z12 ? -i0.a.d(64.0f, beVar.l(), 0) : org.telegram.messenger.i0.L(42.0f));
                            return;
                        }
                    }
                    int i17 = this.v2;
                    if (i17 == 1 && str == null) {
                        return;
                    }
                    if (i17 == 3 && str != null) {
                        return;
                    }
                    AnimatorSet animatorSet4 = this.r2;
                    if (animatorSet4 != null) {
                        animatorSet4.cancel();
                        animatorSet = null;
                        this.r2 = null;
                    } else {
                        animatorSet = null;
                    }
                    AnimatorSet animatorSet5 = this.s2;
                    if (animatorSet5 != null) {
                        animatorSet5.cancel();
                        this.s2 = animatorSet;
                    }
                    if (z2Var != null) {
                        this.s2 = new AnimatorSet();
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(ObjectAnimator.ofFloat(z2Var, odVar, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(z2Var, (Property<jg.z2, Float>) property, 0.5f));
                        ViewPropertyAnimator viewPropertyAnimator2 = this.q1;
                        if (viewPropertyAnimator2 != null) {
                            viewPropertyAnimator2.cancel();
                            this.q1 = null;
                        }
                        bh.k kVar3 = this.i5;
                        if (kVar3 != null) {
                            kVar3.e(0, n02 && !z20, true);
                            if (rVar != null) {
                                float f12 = z19 ? 1.0f : 0.0f;
                                this.v1 = f12;
                                arrayList.add(ObjectAnimator.ofFloat(rVar, (Property<ag.r, Float>) property3, f12));
                                arrayList.add(ObjectAnimator.ofFloat(rVar, (Property<ag.r, Float>) property, z19 ? 1.0f : 0.5f));
                                arrayList.add(ObjectAnimator.ofFloat(rVar, (Property<ag.r, Float>) property2, z19 ? 1.0f : 0.5f));
                            }
                        } else if (rVar != null) {
                            this.v1 = 0.0f;
                            arrayList.add(ObjectAnimator.ofFloat(rVar, (Property<ag.r, Float>) property3, 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(rVar, (Property<ag.r, Float>) property, 0.5f));
                            arrayList.add(ObjectAnimator.ofFloat(rVar, (Property<ag.r, Float>) property2, 0.5f));
                        }
                        sf sfVar2 = this.Z2;
                        boolean z21 = sfVar2 != null && sfVar2.k0();
                        this.L1 = true;
                        de deVar = this.J1;
                        if (deVar != null) {
                            deVar.setScaleY(1.0f);
                            if (z21) {
                                this.J1.setTag(null);
                                arrayList.add(ObjectAnimator.ofFloat(this.J1, (Property<de, Float>) property3, 0.0f));
                                arrayList.add(ObjectAnimator.ofFloat(this.J1, (Property<de, Float>) property, 0.0f));
                                arrayList.add(l(0.0f));
                            } else {
                                this.J1.setAlpha(0.0f);
                                this.J1.setScaleX(0.0f);
                                this.J1.setTranslationX(0.0f);
                            }
                        }
                        this.s2.playTogether(arrayList);
                        this.s2.setDuration(100L);
                        this.s2.addListener(new ge(this, z21, 1));
                        this.s2.start();
                        G1(0);
                        if (this.Z2 != null && getVisibility() == 0) {
                            this.Z2.j0();
                        }
                    }
                    this.r2 = new AnimatorSet();
                    ArrayList arrayList2 = new ArrayList();
                    if (ydVar.getVisibility() == 0) {
                        i11 = 1;
                        r42 = 0;
                        arrayList2.add(ObjectAnimator.ofFloat(zdVar, (Property<zd, Float>) property, 0.1f));
                        arrayList2.add(ObjectAnimator.ofFloat(zdVar, (Property<zd, Float>) property2, 0.1f));
                        arrayList2.add(ObjectAnimator.ofFloat(zdVar, (Property<zd, Float>) property3, 0.0f));
                    } else {
                        r42 = 0;
                        i11 = 1;
                    }
                    fe feVar5 = this.S0;
                    if (feVar5 != null && feVar5.getVisibility() == 0) {
                        fe feVar6 = this.S0;
                        float[] fArr = new float[i11];
                        fArr[r42] = 0.1f;
                        arrayList2.add(ObjectAnimator.ofFloat(feVar6, (Property<fe, Float>) property, fArr));
                        fe feVar7 = this.S0;
                        float[] fArr2 = new float[i11];
                        fArr2[r42] = 0.1f;
                        arrayList2.add(ObjectAnimator.ofFloat(feVar7, (Property<fe, Float>) property2, fArr2));
                        fe feVar8 = this.S0;
                        float[] fArr3 = new float[i11];
                        fArr3[r42] = 0.0f;
                        arrayList2.add(ObjectAnimator.ofFloat(feVar8, (Property<fe, Float>) property3, fArr3));
                    }
                    if (agVar.getVisibility() == 0) {
                        float[] fArr4 = new float[i11];
                        fArr4[r42] = 0.1f;
                        arrayList2.add(ObjectAnimator.ofFloat(agVar, (Property<ag, Float>) property, fArr4));
                        float[] fArr5 = new float[i11];
                        fArr5[r42] = 0.1f;
                        arrayList2.add(ObjectAnimator.ofFloat(agVar, (Property<ag, Float>) property2, fArr5));
                        float[] fArr6 = new float[i11];
                        fArr6[r42] = 0.0f;
                        arrayList2.add(ObjectAnimator.ofFloat(agVar, (Property<ag, Float>) property3, fArr6));
                    }
                    if (z16) {
                        arrayList2.add(m(r42));
                    } else if (z17) {
                        float[] fArr7 = new float[i11];
                        fArr7[r42] = 0.1f;
                        arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, fArr7));
                        float[] fArr8 = new float[i11];
                        fArr8[r42] = 0.1f;
                        arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, fArr8));
                        float[] fArr9 = new float[i11];
                        fArr9[r42] = 0.0f;
                        arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, fArr9));
                    }
                    if (str != null) {
                        this.v2 = 3;
                        float[] fArr10 = new float[i11];
                        fArr10[r42] = 1.0f;
                        arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, fArr10));
                        float[] fArr11 = new float[i11];
                        fArr11[r42] = 1.0f;
                        arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, fArr11));
                        float[] fArr12 = new float[i11];
                        fArr12[r42] = 1.0f;
                        arrayList2.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, fArr12));
                        imageView2.setVisibility(r42);
                    } else {
                        this.v2 = i11;
                        arrayList2.add(m(i11));
                        getSendButtonInternal().setVisibility(r42);
                    }
                    this.r2.playTogether(arrayList2);
                    this.r2.setDuration(220L);
                    this.r2.setInterpolator(gr.h);
                    this.r2.addListener(new bg.f(16, this, str));
                    this.r2.start();
                }
                z11 = true;
                z12 = z11;
                if (this.A4) {
                    return;
                } else {
                    return;
                }
            }
            if (this.U0 == null || !this.W0 || (!(this.x3 || (this.y3 && this.R1 == 2)) || org.telegram.messenger.i0.E || this.p5)) {
                if (getSendButtonInternal().getVisibility() == 0 || imageView2.getVisibility() == 0 || (((feVar3 = this.S0) != null && feVar3.getVisibility() == 0) || agVar.getVisibility() == 0)) {
                    if (!z15) {
                        agVar.setScaleX(0.1f);
                        agVar.setScaleY(0.1f);
                        agVar.setAlpha(0.0f);
                        setSlowModeButtonVisible(false);
                        getSendButtonInternal().setScaleX(0.1f);
                        getSendButtonInternal().setScaleY(0.1f);
                        getSendButtonInternal().setAlpha(0.0f);
                        getSendButtonInternal().setVisibility(8);
                        imageView2.setScaleX(0.1f);
                        imageView2.setScaleY(0.1f);
                        imageView2.setAlpha(0.0f);
                        imageView2.setVisibility(8);
                        fe feVar9 = this.S0;
                        if (feVar9 != null) {
                            feVar9.setScaleX(0.1f);
                            this.S0.setScaleY(0.1f);
                            this.S0.setAlpha(0.0f);
                            this.S0.setVisibility(8);
                        }
                        zdVar.setScaleX(1.0f);
                        zdVar.setScaleY(1.0f);
                        zdVar.setAlpha(1.0f);
                        ydVar2.setVisibility(0);
                        if (z2Var != null) {
                            if (getVisibility() == 0) {
                                this.Z2.d2();
                            }
                            this.E = 1.0f;
                            z1();
                            z2Var.setScaleX(1.0f);
                            z2Var.setVisibility(0);
                            G1(1);
                        }
                        if (rVar != null) {
                            ViewPropertyAnimator viewPropertyAnimator3 = this.q1;
                            if (viewPropertyAnimator3 != null) {
                                viewPropertyAnimator3.cancel();
                                this.q1 = null;
                            }
                            this.v1 = 1.0f;
                            rVar.setAlpha(1.0f);
                            rVar.setScaleX(1.0f);
                            rVar.setScaleY(1.0f);
                        }
                        this.L1 = false;
                        sf sfVar3 = this.Z2;
                        if (sfVar3 != null && sfVar3.k0()) {
                            W();
                        }
                        if (this.J1 != null) {
                            sf sfVar4 = this.Z2;
                            if (sfVar4 != null && sfVar4.k0()) {
                                this.J1.setVisibility(0);
                                this.J1.setTag(1);
                            }
                            this.J1.setAlpha(1.0f);
                            this.J1.setScaleX(1.0f);
                            this.J1.setScaleY(1.0f);
                            this.J1.setTranslationX(0.0f);
                        }
                    } else {
                        if (this.v2 == 2) {
                            return;
                        }
                        AnimatorSet animatorSet6 = this.r2;
                        if (animatorSet6 != null) {
                            animatorSet6.cancel();
                            animatorSet2 = null;
                            this.r2 = null;
                        } else {
                            animatorSet2 = null;
                        }
                        AnimatorSet animatorSet7 = this.s2;
                        if (animatorSet7 != null) {
                            animatorSet7.cancel();
                            this.s2 = animatorSet2;
                        }
                        if (z2Var != null) {
                            if (z2Var.getVisibility() != 0) {
                                z2Var.setVisibility(0);
                                this.E = 0.0f;
                                z1();
                                z2Var.setScaleX(0.0f);
                            }
                            this.s2 = new AnimatorSet();
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(ObjectAnimator.ofFloat(z2Var, odVar, 1.0f));
                            arrayList3.add(ObjectAnimator.ofFloat(z2Var, (Property<jg.z2, Float>) property, 1.0f));
                            bh.k kVar4 = this.i5;
                            if (kVar4 != null) {
                                kVar4.e(0, false, true);
                            }
                            if (rVar != null) {
                                ViewPropertyAnimator viewPropertyAnimator4 = this.q1;
                                if (viewPropertyAnimator4 != null) {
                                    viewPropertyAnimator4.cancel();
                                    this.q1 = null;
                                }
                                this.v1 = 1.0f;
                                arrayList3.add(ObjectAnimator.ofFloat(rVar, (Property<ag.r, Float>) property3, 1.0f));
                                arrayList3.add(ObjectAnimator.ofFloat(rVar, (Property<ag.r, Float>) property, 1.0f));
                                arrayList3.add(ObjectAnimator.ofFloat(rVar, (Property<ag.r, Float>) property2, 1.0f));
                            }
                            sf sfVar5 = this.Z2;
                            boolean z22 = sfVar5 != null && sfVar5.k0();
                            this.L1 = false;
                            if (z22) {
                                W();
                            }
                            de deVar2 = this.J1;
                            if (deVar2 != null) {
                                if (z22) {
                                    deVar2.setVisibility(0);
                                    this.J1.setTag(1);
                                    this.J1.setPivotX(org.telegram.messenger.i0.L(44.0f));
                                    arrayList3.add(ObjectAnimator.ofFloat(this.J1, (Property<de, Float>) property3, 1.0f));
                                    arrayList3.add(ObjectAnimator.ofFloat(this.J1, (Property<de, Float>) property, 1.0f));
                                    arrayList3.add(l(0.0f));
                                    ImageView imageView3 = this.I1;
                                    if (imageView3 != null && imageView3.getVisibility() == 0) {
                                        imageView3.setVisibility(8);
                                    }
                                } else {
                                    deVar2.setAlpha(1.0f);
                                    this.J1.setScaleX(1.0f);
                                    this.J1.setScaleY(1.0f);
                                    this.J1.setTranslationX(0.0f);
                                }
                            }
                            this.s2.playTogether(arrayList3);
                            this.s2.setDuration(100L);
                            this.s2.addListener(new ce(this, 6));
                            this.s2.start();
                            G1(1);
                            if (getVisibility() == 0) {
                                this.Z2.d2();
                            }
                        }
                        ydVar2.setVisibility(0);
                        this.r2 = new AnimatorSet();
                        this.v2 = 2;
                        ArrayList arrayList4 = new ArrayList();
                        org.telegram.ui.un unVar = this.P2;
                        TLRPC.Chat g10 = unVar == null ? null : unVar.g();
                        TLRPC.UserFull I8 = unVar == null ? this.K : unVar.I8();
                        if (g10 != null) {
                            if (!org.telegram.messenger.w3.v(g10)) {
                            }
                            f7 = 1.0f;
                        } else if (I8 == null) {
                            i12 = 1;
                            f7 = 1.0f;
                            float[] fArr13 = new float[i12];
                            fArr13[0] = 1.0f;
                            arrayList4.add(ObjectAnimator.ofFloat(zdVar, (Property<zd, Float>) property, fArr13));
                            float[] fArr14 = new float[i12];
                            fArr14[0] = 1.0f;
                            arrayList4.add(ObjectAnimator.ofFloat(zdVar, (Property<zd, Float>) property2, fArr14));
                            float[] fArr15 = new float[i12];
                            fArr15[0] = f7;
                            arrayList4.add(ObjectAnimator.ofFloat(zdVar, (Property<zd, Float>) property3, fArr15));
                            if (imageView2.getVisibility() != 0) {
                                float[] fArr16 = new float[i12];
                                fArr16[0] = 0.1f;
                                arrayList4.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, fArr16));
                                float[] fArr17 = new float[i12];
                                fArr17[0] = 0.1f;
                                arrayList4.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, fArr17));
                                float[] fArr18 = new float[i12];
                                fArr18[0] = 0.0f;
                                arrayList4.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, fArr18));
                            } else {
                                fe feVar10 = this.S0;
                                if (feVar10 != null && feVar10.getVisibility() == 0) {
                                    fe feVar11 = this.S0;
                                    float[] fArr19 = new float[i12];
                                    fArr19[0] = 0.1f;
                                    arrayList4.add(ObjectAnimator.ofFloat(feVar11, (Property<fe, Float>) property, fArr19));
                                    fe feVar12 = this.S0;
                                    float[] fArr20 = new float[i12];
                                    fArr20[0] = 0.1f;
                                    arrayList4.add(ObjectAnimator.ofFloat(feVar12, (Property<fe, Float>) property2, fArr20));
                                    fe feVar13 = this.S0;
                                    float[] fArr21 = new float[i12];
                                    fArr21[0] = 0.0f;
                                    arrayList4.add(ObjectAnimator.ofFloat(feVar13, (Property<fe, Float>) property3, fArr21));
                                } else if (agVar.getVisibility() == 0) {
                                    float[] fArr22 = new float[i12];
                                    fArr22[0] = 0.1f;
                                    arrayList4.add(ObjectAnimator.ofFloat(agVar, (Property<ag, Float>) property, fArr22));
                                    float[] fArr23 = new float[i12];
                                    fArr23[0] = 0.1f;
                                    arrayList4.add(ObjectAnimator.ofFloat(agVar, (Property<ag, Float>) property2, fArr23));
                                    float[] fArr24 = new float[i12];
                                    fArr24[0] = 0.0f;
                                    arrayList4.add(ObjectAnimator.ofFloat(agVar, (Property<ag, Float>) property3, fArr24));
                                } else {
                                    View sendButtonInternal = getSendButtonInternal();
                                    float[] fArr25 = new float[i12];
                                    fArr25[0] = 0.1f;
                                    arrayList4.add(ObjectAnimator.ofFloat(sendButtonInternal, (Property<View, Float>) property, fArr25));
                                    View sendButtonInternal2 = getSendButtonInternal();
                                    float[] fArr26 = new float[i12];
                                    fArr26[0] = 0.1f;
                                    arrayList4.add(ObjectAnimator.ofFloat(sendButtonInternal2, (Property<View, Float>) property2, fArr26));
                                    View sendButtonInternal3 = getSendButtonInternal();
                                    float[] fArr27 = new float[i12];
                                    fArr27[0] = 0.0f;
                                    arrayList4.add(ObjectAnimator.ofFloat(sendButtonInternal3, (Property<View, Float>) property3, fArr27));
                                }
                            }
                            this.r2.playTogether(arrayList4);
                            this.r2.setDuration(150L);
                            this.r2.addListener(new ce(this, 7));
                            this.r2.start();
                        }
                        i12 = 1;
                        float[] fArr132 = new float[i12];
                        fArr132[0] = 1.0f;
                        arrayList4.add(ObjectAnimator.ofFloat(zdVar, (Property<zd, Float>) property, fArr132));
                        float[] fArr142 = new float[i12];
                        fArr142[0] = 1.0f;
                        arrayList4.add(ObjectAnimator.ofFloat(zdVar, (Property<zd, Float>) property2, fArr142));
                        float[] fArr152 = new float[i12];
                        fArr152[0] = f7;
                        arrayList4.add(ObjectAnimator.ofFloat(zdVar, (Property<zd, Float>) property3, fArr152));
                        if (imageView2.getVisibility() != 0) {
                        }
                        this.r2.playTogether(arrayList4);
                        this.r2.setDuration(150L);
                        this.r2.addListener(new ce(this, 7));
                        this.r2.start();
                    }
                }
            } else if (!z15) {
                agVar.setScaleX(0.1f);
                agVar.setScaleY(0.1f);
                agVar.setAlpha(0.0f);
                setSlowModeButtonVisible(false);
                getSendButtonInternal().setScaleX(0.1f);
                getSendButtonInternal().setScaleY(0.1f);
                getSendButtonInternal().setAlpha(0.0f);
                getSendButtonInternal().setVisibility(8);
                imageView2.setScaleX(0.1f);
                imageView2.setScaleY(0.1f);
                imageView2.setAlpha(0.0f);
                imageView2.setVisibility(8);
                zdVar.setScaleX(0.1f);
                zdVar.setScaleY(0.1f);
                zdVar.setAlpha(0.0f);
                ydVar2.setVisibility(8);
                R();
                this.S0.setScaleX(1.0f);
                this.S0.setScaleY(1.0f);
                this.S0.setAlpha(1.0f);
                this.S0.setVisibility(0);
                if (z2Var != null) {
                    if (getVisibility() == 0) {
                        this.Z2.d2();
                    }
                    z2Var.setVisibility(0);
                    G1(1);
                }
                this.L1 = false;
                sf sfVar6 = this.Z2;
                boolean z23 = sfVar6 != null && sfVar6.k0();
                if (z23) {
                    W();
                }
                de deVar3 = this.J1;
                if (deVar3 != null) {
                    if (z23) {
                        deVar3.setVisibility(0);
                        this.J1.setTag(1);
                    }
                    this.J1.setAlpha(1.0f);
                    this.J1.setScaleX(1.0f);
                    this.J1.setScaleY(1.0f);
                    this.J1.setTranslationX(0.0f);
                }
            } else {
                if (this.v2 == 4) {
                    return;
                }
                AnimatorSet animatorSet8 = this.r2;
                if (animatorSet8 != null) {
                    animatorSet8.cancel();
                    animatorSet3 = null;
                    this.r2 = null;
                } else {
                    animatorSet3 = null;
                }
                AnimatorSet animatorSet9 = this.s2;
                if (animatorSet9 != null) {
                    animatorSet9.cancel();
                    this.s2 = animatorSet3;
                }
                if (z2Var != null && this.w2 == 0) {
                    z2Var.setVisibility(0);
                    this.s2 = new AnimatorSet();
                    ArrayList arrayList5 = new ArrayList();
                    arrayList5.add(ObjectAnimator.ofFloat(z2Var, odVar, 1.0f));
                    arrayList5.add(ObjectAnimator.ofFloat(z2Var, (Property<jg.z2, Float>) property, 1.0f));
                    bh.k kVar5 = this.i5;
                    if (kVar5 != null) {
                        kVar5.e(0, false, true);
                    }
                    if (rVar != null) {
                        ViewPropertyAnimator viewPropertyAnimator5 = this.q1;
                        if (viewPropertyAnimator5 != null) {
                            viewPropertyAnimator5.cancel();
                            this.q1 = null;
                        }
                        this.v1 = 1.0f;
                        arrayList5.add(ObjectAnimator.ofFloat(rVar, (Property<ag.r, Float>) property3, 1.0f));
                        arrayList5.add(ObjectAnimator.ofFloat(rVar, (Property<ag.r, Float>) property, 1.0f));
                        arrayList5.add(ObjectAnimator.ofFloat(rVar, (Property<ag.r, Float>) property2, 1.0f));
                    }
                    sf sfVar7 = this.Z2;
                    boolean z24 = sfVar7 != null && sfVar7.k0();
                    this.L1 = false;
                    if (z24) {
                        W();
                    }
                    de deVar4 = this.J1;
                    if (deVar4 != null) {
                        deVar4.setScaleY(1.0f);
                        if (z24) {
                            this.J1.setVisibility(0);
                            this.J1.setTag(1);
                            this.J1.setPivotX(org.telegram.messenger.i0.L(44.0f));
                            arrayList5.add(ObjectAnimator.ofFloat(this.J1, (Property<de, Float>) property3, 1.0f));
                            arrayList5.add(ObjectAnimator.ofFloat(this.J1, (Property<de, Float>) property, 1.0f));
                            arrayList5.add(l(0.0f));
                        } else {
                            this.J1.setAlpha(1.0f);
                            this.J1.setScaleX(1.0f);
                            this.J1.setTranslationX(0.0f);
                        }
                    }
                    this.s2.playTogether(arrayList5);
                    this.s2.setDuration(100L);
                    this.s2.addListener(new ce(this, 4));
                    this.s2.start();
                    G1(1);
                    if (getVisibility() == 0) {
                        this.Z2.d2();
                    }
                }
                R();
                this.S0.setVisibility(0);
                this.r2 = new AnimatorSet();
                this.v2 = 4;
                ArrayList arrayList6 = new ArrayList();
                arrayList6.add(ObjectAnimator.ofFloat(this.S0, (Property<fe, Float>) property, 1.0f));
                arrayList6.add(ObjectAnimator.ofFloat(this.S0, (Property<fe, Float>) property2, 1.0f));
                arrayList6.add(ObjectAnimator.ofFloat(this.S0, (Property<fe, Float>) property3, 1.0f));
                if (imageView2.getVisibility() == 0) {
                    arrayList6.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property3, 0.0f));
                } else if (ydVar2.getVisibility() == 0) {
                    arrayList6.add(ObjectAnimator.ofFloat(zdVar, (Property<zd, Float>) property, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(zdVar, (Property<zd, Float>) property2, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(zdVar, (Property<zd, Float>) property3, 0.0f));
                } else if (agVar.getVisibility() == 0) {
                    arrayList6.add(ObjectAnimator.ofFloat(agVar, (Property<ag, Float>) property, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(agVar, (Property<ag, Float>) property2, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(agVar, (Property<ag, Float>) property3, 0.0f));
                } else {
                    arrayList6.add(ObjectAnimator.ofFloat(getSendButtonInternal(), (Property<View, Float>) property, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(getSendButtonInternal(), (Property<View, Float>) property2, 0.1f));
                    arrayList6.add(ObjectAnimator.ofFloat(getSendButtonInternal(), (Property<View, Float>) property3, 0.0f));
                }
                this.r2.playTogether(arrayList6);
                this.r2.setDuration(250L);
                this.r2.addListener(new ce(this, 5));
                this.r2.start();
            }
        } else if (agVar.getVisibility() != 0) {
            if (!z15) {
                agVar.setScaleX(1.0f);
                agVar.setScaleY(1.0f);
                agVar.setAlpha(1.0f);
                setSlowModeButtonVisible(true);
                zdVar.setScaleX(0.1f);
                zdVar.setScaleY(0.1f);
                zdVar.setAlpha(0.0f);
                ydVar2.setVisibility(8);
                getSendButtonInternal().setScaleX(0.1f);
                getSendButtonInternal().setScaleY(0.1f);
                getSendButtonInternal().setAlpha(0.0f);
                getSendButtonInternal().setVisibility(8);
                imageView2.setScaleX(0.1f);
                imageView2.setScaleY(0.1f);
                imageView2.setAlpha(0.0f);
                imageView2.setVisibility(8);
                fe feVar14 = this.S0;
                if (feVar14 == null || feVar14.getVisibility() != 0) {
                    i13 = 8;
                } else {
                    this.S0.setScaleX(0.1f);
                    this.S0.setScaleY(0.1f);
                    this.S0.setAlpha(0.0f);
                    i13 = 8;
                    this.S0.setVisibility(8);
                }
                if (z2Var != null) {
                    z2Var.setVisibility(i13);
                    if (this.Z2 != null && getVisibility() == 0) {
                        this.Z2.j0();
                    }
                    z13 = false;
                    G1(0);
                    bh.k kVar6 = this.i5;
                    if (kVar6 != null) {
                        kVar6.e(0, false, false);
                    }
                    if (rVar != null) {
                        this.v1 = 0.0f;
                        rVar.setAlpha(0.0f);
                        rVar.setScaleX(0.5f);
                        rVar.setScaleY(0.5f);
                    }
                } else {
                    z13 = false;
                }
                this.L1 = z13;
                sf sfVar8 = this.Z2;
                boolean z25 = sfVar8 != null && sfVar8.k0();
                if (z25) {
                    W();
                }
                de deVar5 = this.J1;
                if (deVar5 != null) {
                    if (z25) {
                        deVar5.setVisibility(0);
                        this.J1.setTag(1);
                    }
                    this.J1.setTranslationX(0.0f);
                    this.J1.setAlpha(1.0f);
                    this.J1.setScaleX(1.0f);
                    this.J1.setScaleY(1.0f);
                }
            } else {
                if (this.v2 == 5) {
                    return;
                }
                AnimatorSet animatorSet10 = this.r2;
                if (animatorSet10 != null) {
                    animatorSet10.cancel();
                    r32 = 0;
                    this.r2 = null;
                } else {
                    r32 = 0;
                }
                AnimatorSet animatorSet11 = this.s2;
                if (animatorSet11 != null) {
                    animatorSet11.cancel();
                    this.s2 = r32;
                }
                ViewPropertyAnimator viewPropertyAnimator6 = this.q1;
                if (viewPropertyAnimator6 != null) {
                    viewPropertyAnimator6.cancel();
                    this.q1 = r32;
                }
                if (z2Var != null) {
                    this.s2 = new AnimatorSet();
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(ObjectAnimator.ofFloat(z2Var, odVar, 0.0f));
                    arrayList7.add(ObjectAnimator.ofFloat(z2Var, (Property<jg.z2, Float>) property, 0.5f));
                    this.L1 = false;
                    sf sfVar9 = this.Z2;
                    boolean z26 = sfVar9 != null && sfVar9.k0();
                    if (z26) {
                        W();
                    }
                    bh.k kVar7 = this.i5;
                    if (kVar7 != null) {
                        kVar7.e(0, false, true);
                    }
                    if (rVar != null) {
                        this.v1 = 0.0f;
                        arrayList7.add(ObjectAnimator.ofFloat(rVar, (Property<ag.r, Float>) property3, 0.0f));
                        arrayList7.add(ObjectAnimator.ofFloat(rVar, (Property<ag.r, Float>) property, 0.5f));
                        arrayList7.add(ObjectAnimator.ofFloat(rVar, (Property<ag.r, Float>) property2, 0.5f));
                    }
                    de deVar6 = this.J1;
                    if (deVar6 != null) {
                        deVar6.setScaleY(1.0f);
                        if (z26) {
                            this.J1.setVisibility(0);
                            this.J1.setTag(1);
                            this.J1.setPivotX(org.telegram.messenger.i0.L(44.0f));
                            arrayList7.add(l(0.0f));
                            arrayList7.add(ObjectAnimator.ofFloat(this.J1, (Property<de, Float>) property3, 1.0f));
                            arrayList7.add(ObjectAnimator.ofFloat(this.J1, (Property<de, Float>) property, 1.0f));
                        } else {
                            this.J1.setTranslationX(0.0f);
                            this.J1.setAlpha(1.0f);
                            this.J1.setScaleX(1.0f);
                        }
                    }
                    this.s2.playTogether(arrayList7);
                    this.s2.setDuration(100L);
                    this.s2.addListener(new ce(this, 2));
                    this.s2.start();
                    G1(0);
                    if (this.Z2 != null && getVisibility() == 0) {
                        this.Z2.j0();
                    }
                }
                this.v2 = 5;
                this.r2 = new AnimatorSet();
                ArrayList arrayList8 = new ArrayList();
                if (ydVar2.getVisibility() == 0) {
                    i14 = 1;
                    r43 = 0;
                    arrayList8.add(ObjectAnimator.ofFloat(zdVar, (Property<zd, Float>) property, 0.1f));
                    arrayList8.add(ObjectAnimator.ofFloat(zdVar, (Property<zd, Float>) property2, 0.1f));
                    arrayList8.add(ObjectAnimator.ofFloat(zdVar, (Property<zd, Float>) property3, 0.0f));
                } else {
                    r43 = 0;
                    i14 = 1;
                }
                fe feVar15 = this.S0;
                if (feVar15 != null && feVar15.getVisibility() == 0) {
                    fe feVar16 = this.S0;
                    float[] fArr28 = new float[i14];
                    fArr28[r43] = 0.1f;
                    arrayList8.add(ObjectAnimator.ofFloat(feVar16, (Property<fe, Float>) property, fArr28));
                    fe feVar17 = this.S0;
                    float[] fArr29 = new float[i14];
                    fArr29[r43] = 0.1f;
                    arrayList8.add(ObjectAnimator.ofFloat(feVar17, (Property<fe, Float>) property2, fArr29));
                    fe feVar18 = this.S0;
                    float[] fArr30 = new float[i14];
                    fArr30[r43] = 0.0f;
                    arrayList8.add(ObjectAnimator.ofFloat(feVar18, (Property<fe, Float>) property3, fArr30));
                }
                if (getSendButtonInternal().getVisibility() == 0) {
                    arrayList8.add(m(r43));
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
                arrayList8.add(ObjectAnimator.ofFloat(agVar, (Property<ag, Float>) property, fArr34));
                float[] fArr35 = new float[1];
                fArr35[r43] = 1.0f;
                arrayList8.add(ObjectAnimator.ofFloat(agVar, (Property<ag, Float>) property2, fArr35));
                float[] fArr36 = new float[1];
                fArr36[r43] = 1.0f;
                arrayList8.add(ObjectAnimator.ofFloat(agVar, (Property<ag, Float>) property3, fArr36));
                setSlowModeButtonVisible(true);
                this.r2.playTogether(arrayList8);
                this.r2.setDuration(220L);
                this.r2.setInterpolator(gr.h);
                this.r2.addListener(new ce(this, 3));
                this.r2.start();
            }
        }
        beVar = beVar2;
        z12 = false;
        if (this.A4) {
        }
    }

    public void F0() {
        if ((f0() && r()) || org.telegram.ui.ActionBar.k2.hasSheets(this.P2)) {
            return;
        }
        sf sfVar = this.Z2;
        if (sfVar != null) {
            sfVar.b1();
        }
        se seVar = this.E0;
        if (seVar == null || org.telegram.messenger.i0.J3(seVar)) {
            return;
        }
        this.E0.clearFocus();
        this.E0.requestFocus();
    }

    public final void F1(boolean z10) {
        boolean z11;
        String str;
        TLRPC.TL_forumTopic tL_forumTopic;
        String str2;
        org.telegram.messenger.jj jjVar;
        TLRPC.ReplyMarkup replyMarkup;
        TLRPC.ReplyMarkup replyMarkup2;
        se seVar = this.E0;
        if (seVar == null) {
            return;
        }
        CharSequence charSequence = this.e;
        boolean z12 = false;
        if (charSequence != null) {
            seVar.r(charSequence, z10);
            se seVar2 = this.E0;
            String str3 = this.f;
            et etVar = seVar2.u0;
            if (etVar != null) {
                if (!org.telegram.messenger.cd.X && z10) {
                    z12 = true;
                }
                etVar.t(str3, z12, true);
                return;
            }
            return;
        }
        if (!this.z0 && !o0()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a1.g.m("PlainTextRestrictedHint", 2131747236, new StringBuilder(" d ")));
            spannableStringBuilder.setSpan(new dq(R.drawable.msg_mini_lock3, 0), 1, 2, 0);
            this.E0.r(spannableStringBuilder, z10);
            this.E0.setText((CharSequence) null);
            this.E0.setEnabled(false);
            this.E0.setInputType(1);
            return;
        }
        this.E0.setEnabled(true);
        int inputType = this.E0.getInputType();
        int i10 = this.a;
        if (inputType != i10) {
            this.E0.setInputType(i10);
        }
        Q1();
        org.telegram.ui.un unVar = this.P2;
        boolean z13 = unVar != null && unVar.f4 == 8 && unVar.h4;
        long M1 = unVar != null ? unVar.getMessagesController().M1(unVar.a()) : 0L;
        if (M1 > 0) {
            M1 *= getMessagesCount();
        }
        int i11 = unVar != null ? unVar.f4 : -1;
        if (i11 == 9) {
            this.E0.setHintText(org.telegram.messenger.cd.L0(2131742921, null));
            return;
        }
        if (i11 == 5) {
            if ("hello".equalsIgnoreCase(unVar.e4)) {
                this.E0.setHintText(org.telegram.messenger.cd.L0(2131752767, null));
                return;
            } else if ("away".equalsIgnoreCase(unVar.e4)) {
                this.E0.setHintText(org.telegram.messenger.cd.L0(2131752836, null));
                return;
            } else {
                this.E0.setHintText(org.telegram.messenger.cd.L0(2131752672, null));
                return;
            }
        }
        dq[] dqVarArr = this.O4;
        if (z13) {
            this.E0.setHintText(M1 > 0 ? rh.h8.S0(org.telegram.messenger.cd.a0(null, null, 2131744429, org.telegram.messenger.cd.E((int) M1, ','), dqVarArr)) : org.telegram.messenger.cd.a0(null, null, 2131744430, new Object[0]));
            dq dqVar = dqVarArr[0];
            if (dqVar != null) {
                dqVar.G = 0.9f;
                return;
            }
            return;
        }
        if (this.b2 != null) {
            this.E0.setHintText(org.telegram.messenger.cd.L0(2131752706, null));
            return;
        }
        org.telegram.messenger.jj jjVar2 = this.T2;
        if (jjVar2 != null && (replyMarkup2 = jjVar2.k.reply_markup) != null && !TextUtils.isEmpty(replyMarkup2.placeholder)) {
            this.E0.r(this.T2.k.reply_markup.placeholder, z10);
            return;
        }
        if (this.Z1 != null) {
            this.E0.setHintText(this.a2 ? org.telegram.messenger.cd.L0(2131752561, null) : org.telegram.messenger.cd.L0(2131743953, null));
            return;
        }
        if (M1 > 0) {
            this.E0.setHintText(rh.h8.X0(false, org.telegram.messenger.cd.a0(null, null, 2131743951, org.telegram.messenger.cd.E((int) M1, ',')), dqVarArr));
            dq dqVar2 = dqVarArr[0];
            if (dqVar2 != null) {
                dqVar2.G = 0.9f;
                return;
            }
            return;
        }
        if (this.X0 && (jjVar = this.m2) != null && (replyMarkup = jjVar.k.reply_markup) != null && !TextUtils.isEmpty(replyMarkup.placeholder)) {
            this.E0.r(this.m2.k.reply_markup.placeholder, z10);
            return;
        }
        if (unVar != null && unVar.H9()) {
            org.telegram.messenger.jj jjVar3 = this.U2;
            if (jjVar3 != null && (tL_forumTopic = jjVar3.h1) != null && (str2 = tL_forumTopic.title) != null) {
                this.E0.r(org.telegram.messenger.cd.a0(null, null, 2131743950, str2), z10);
                return;
            }
            TLRPC.TL_forumTopic f7 = org.telegram.messenger.vp.r1(this.Q).r7.f(unVar.e.id, 1L);
            if (f7 == null || (str = f7.title) == null) {
                this.E0.r(org.telegram.messenger.cd.L0(2131743953, null), z10);
                return;
            } else {
                this.E0.r(org.telegram.messenger.cd.a0(null, null, 2131743950, str), z10);
                return;
            }
        }
        if (org.telegram.messenger.o5.z(this.Q2)) {
            TLRPC.Chat L0 = org.telegram.messenger.vp.r1(this.R.a).L0(Long.valueOf(-this.Q2));
            TLRPC.ChatFull M0 = org.telegram.messenger.vp.r1(this.R.a).M0(-this.Q2);
            z11 = org.telegram.messenger.w3.V(L0);
            z12 = !z11 && org.telegram.messenger.w3.M(L0, M0, false) == (-this.Q2);
        } else {
            z11 = false;
        }
        if (z12) {
            this.E0.setHintText(org.telegram.messenger.cd.L0(2131745655, "SendAnonymously"));
            return;
        }
        TLRPC.User Z1 = org.telegram.messenger.vp.r1(this.R.a).Z1(Long.valueOf(this.Q2));
        if (Z1 != null && Z1.bot_forum_view && !Z1.bot_forum_can_manage_topics && unVar != null && !unVar.v4) {
            this.E0.setHintText(org.telegram.messenger.cd.L0(2131745650, null));
            return;
        }
        if (unVar != null && unVar.T9() && !unVar.v4) {
            if (unVar.l4 == null || !unVar.u4) {
                this.E0.setHintText(org.telegram.messenger.cd.L0(2131746278, "Reply"));
                return;
            } else {
                this.E0.setHintText(org.telegram.messenger.cd.L0(2131752005, null));
                return;
            }
        }
        if (!z11) {
            this.E0.setHintText(org.telegram.messenger.cd.L0(2131743953, null));
        } else if (this.g2) {
            this.E0.r(org.telegram.messenger.cd.L0(2131752291, "ChannelSilentBroadcast"), z10);
        } else {
            this.E0.r(org.telegram.messenger.cd.L0(2131752447, "ChannelBroadcast"), z10);
        }
    }

    public final void G() {
        if (this.U0 == null) {
            return;
        }
        Point point = org.telegram.messenger.i0.q;
        int i10 = point.x > point.y ? this.y2 : this.x2;
        int L = ((((this.o1 - org.telegram.messenger.i0.m) - org.telegram.messenger.i0.n) - org.telegram.messenger.i0.L(6.0f)) - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - getHeight();
        int i11 = 2;
        if (this.R1 == 2) {
            L = Math.min(L, org.telegram.messenger.i0.L(175.0f) + i10);
        }
        int i12 = this.U0.getLayoutParams().height;
        if (i12 == L) {
            return;
        }
        AnimatorSet animatorSet = this.B3;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.B3 = null;
        }
        this.D3 = L;
        org.telegram.ui.Cells.g1 g1Var = this.t3;
        if (i12 > L) {
            tc tcVar = new tc(this, 7);
            this.U0.setLayerType(2, null);
            if (this.w) {
                this.x = tcVar;
            } else {
                AnimatorSet animatorSet2 = new AnimatorSet();
                if (this.h5 != null) {
                    animatorSet2.playTogether(ValueAnimator.ofInt(-(this.D3 - i10)), ValueAnimator.ofInt(-(this.D3 - i10)));
                } else {
                    animatorSet2.playTogether(ObjectAnimator.ofInt(this, g1Var, -(this.D3 - i10)), ObjectAnimator.ofInt(this.U0, g1Var, -(this.D3 - i10)));
                    ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new sc(this, i11));
                }
                animatorSet2.setDuration(300L);
                animatorSet2.setInterpolator(gr.f);
                animatorSet2.addListener(new bg.f(19, this, tcVar));
                this.B3 = animatorSet2;
                animatorSet2.start();
            }
        } else {
            if (this.h5 == null) {
                this.U0.getLayoutParams().height = this.D3;
            }
            this.m1.requestLayout();
            se seVar = this.E0;
            if (seVar != null) {
                int selectionStart = seVar.getSelectionStart();
                int selectionEnd = this.E0.getSelectionEnd();
                se seVar2 = this.E0;
                seVar2.setText(seVar2.getText());
                this.E0.setSelection(selectionStart, selectionEnd);
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            if (this.h5 != null) {
                animatorSet3.playTogether(ValueAnimator.ofInt(-(this.D3 - i10)), ValueAnimator.ofInt(-(this.D3 - i10)));
            } else {
                animatorSet3.playTogether(ObjectAnimator.ofInt(this, g1Var, -(this.D3 - i10)), ObjectAnimator.ofInt(this.U0, g1Var, -(this.D3 - i10)));
                ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new sc(this, 3));
            }
            animatorSet3.setDuration(300L);
            animatorSet3.setInterpolator(gr.f);
            animatorSet3.addListener(new ce(this, 11));
            this.B3 = animatorSet3;
            this.U0.setLayerType(2, null);
            animatorSet3.start();
        }
        hh.f fVar = this.h5;
        if (fVar != null) {
            ((hh.i) fVar).h(L);
        }
    }

    public final void G0() {
        if (f0() && r()) {
            return;
        }
        org.telegram.ui.un unVar = this.P2;
        if (org.telegram.ui.ActionBar.k2.hasSheets(unVar)) {
            return;
        }
        r1((org.telegram.messenger.i0.D || org.telegram.messenger.i0.E || (unVar != null && unVar.isInBubbleMode()) || this.j2) ? 0 : 2, 0, true, true);
        sf sfVar = this.Z2;
        if (sfVar != null) {
            sfVar.b1();
        }
        se seVar = this.E0;
        if (seVar != null) {
            seVar.requestFocus();
        }
        org.telegram.messenger.i0.J3(this.E0);
        if (this.j2) {
            this.l2 = true;
            return;
        }
        if (org.telegram.messenger.i0.D || this.z2 || org.telegram.messenger.i0.E) {
            return;
        }
        if (unVar == null || !unVar.isInBubbleMode()) {
            this.k3 = true;
            gf gfVar = this.U0;
            if (gfVar != null) {
                gfVar.onTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0));
            }
            ee eeVar = this.r3;
            org.telegram.messenger.i0.r(eeVar);
            org.telegram.messenger.i0.h3(eeVar, 100L);
        }
    }

    public final void G1(int i10) {
        ImageView imageView;
        de deVar;
        de deVar2;
        ag.r rVar;
        this.P4 = i10;
        if (this.E0 != null) {
            org.telegram.messenger.jj jjVar = this.Z1;
            if (jjVar == null || jjVar.p5()) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.E0.getLayoutParams();
                int i11 = layoutParams.rightMargin;
                boolean z10 = this.A4;
                be beVar = this.J0;
                if (z10 && this.p5) {
                    layoutParams.rightMargin = Math.max(0, beVar.l() - org.telegram.messenger.i0.L(44.0f)) + org.telegram.messenger.i0.L(this.v4 ? 50.0f : 2.0f);
                } else if (i10 == 1 || i10 == 2) {
                    fe feVar = this.x1;
                    if (feVar == null || feVar.getVisibility() != 0 || (deVar2 = this.J1) == null || deVar2.getVisibility() != 0 || (rVar = this.r1) == null || rVar.getVisibility() != 0) {
                        fe feVar2 = this.x1;
                        if ((feVar2 == null || feVar2.getVisibility() != 0) && (((imageView = this.I1) == null || imageView.getVisibility() != 0) && ((deVar = this.J1) == null || deVar.getTag() == null))) {
                            layoutParams.rightMargin = org.telegram.messenger.i0.L(50.0f);
                        } else {
                            layoutParams.rightMargin = org.telegram.messenger.i0.L(98.0f);
                        }
                    } else {
                        layoutParams.rightMargin = org.telegram.messenger.i0.L(146.0f);
                    }
                } else {
                    de deVar3 = this.J1;
                    if (deVar3 == null || deVar3.getTag() == null) {
                        layoutParams.rightMargin = org.telegram.messenger.i0.L(2.0f);
                    } else {
                        layoutParams.rightMargin = org.telegram.messenger.i0.L(50.0f);
                    }
                }
                layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, beVar.l() - org.telegram.messenger.i0.L(44.0f)));
                be beVar2 = this.F1;
                if (beVar2 != null && beVar2.getVisibility() == 0) {
                    layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, this.F1.l() - org.telegram.messenger.i0.L(44.0f)));
                }
                if (i11 != layoutParams.rightMargin) {
                    this.E0.setLayoutParams(layoutParams);
                }
                pd pdVar = this.e1;
                if (pdVar != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) pdVar.getLayoutParams();
                    layoutParams2.rightMargin = this.Z1 == null ? i0.a.d(44.0f, beVar.l(), 0) : 0;
                    this.e1.setLayoutParams(layoutParams2);
                }
            }
        }
    }

    public final void H() {
        this.o5 = u(true);
        float u10 = u(false);
        if (this.n5 != u10) {
            this.n5 = u10;
            y0(u10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H0() {
        org.telegram.ui.un unVar;
        Editable editable;
        bi.k2 k2Var;
        CharSequence[] charSequenceArr;
        ArrayList W;
        if (this.E0 == null || (unVar = this.P2) == null) {
            return;
        }
        org.telegram.messenger.vp.r1(this.Q);
        boolean z10 = org.telegram.messenger.v2.a;
        TL_iv.RichMessage richMessage = this.E1;
        if (richMessage != null) {
            k2Var = new bi.k2(richMessage);
        } else {
            Editable text = this.E0.getText();
            if (!TextUtils.isEmpty(text) && TextUtils.indexOf((CharSequence) text, '`') >= 0) {
                try {
                    charSequenceArr = new CharSequence[]{new SpannableStringBuilder(text)};
                    W = org.telegram.messenger.ui.b0(this.Q).W(charSequenceArr, true, true);
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
                if (W != null && !W.isEmpty()) {
                    editable = new SpannableStringBuilder(charSequenceArr[0]);
                    org.telegram.messenger.jj.b(editable, W, false, false, false, false, 0);
                    bi.k2 k2Var2 = new bi.k2(editable);
                    if (editable == text) {
                        int selectionStart = this.E0.getSelectionStart();
                        int selectionEnd = this.E0.getSelectionEnd();
                        if (selectionStart < 0) {
                            selectionStart = this.E0.length();
                        }
                        if (selectionEnd < 0) {
                            selectionEnd = selectionStart;
                        }
                        k2Var2.c = selectionStart;
                        k2Var2.d = selectionEnd;
                    }
                    k2Var2.L = new tc(this, 16);
                    k2Var = k2Var2;
                }
            }
            editable = text;
            bi.k2 k2Var22 = new bi.k2(editable);
            if (editable == text) {
            }
            k2Var22.L = new tc(this, 16);
            k2Var = k2Var22;
        }
        k2Var.setResourceProvider(this.W3);
        k2Var.J = unVar;
        k2Var.s = unVar.T;
        k2Var.w = unVar.Z;
        k2Var.K = new tc(this, 17);
        unVar.presentFragment(k2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009d, code lost:
    
        if (org.telegram.messenger.vp.r1(r16.Q).f7.getBoolean("show_gift_for_" + r7.a(), true) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d1, code lost:
    
        if (org.telegram.messenger.vp.r1(r16.Q).f7.getBoolean(java.util.Calendar.getInstance().get(1) + "show_gift_for_" + r7.a(), true) == false) goto L37;
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
    public final void H1(boolean z10) {
        boolean z11;
        vh.p2 p2Var;
        TLRPC.UserFull userFull = getParentFragment() == null ? null : getParentFragment().q8;
        TLRPC.UserFull a2 = org.telegram.messenger.vp.r1(this.Q).a2(org.telegram.messenger.d20.i(this.Q).e());
        TLRPC.User j10 = getParentFragment() == null ? null : getParentFragment().j();
        boolean z12 = org.telegram.messenger.vp.r1(this.Q).i7;
        int i10 = 0;
        org.telegram.ui.un unVar = this.P2;
        if (!z12 && getParentFragment() != null && j10 != null) {
            boolean z13 = org.telegram.messenger.v2.a;
            if ((!org.telegram.messenger.h20.B(j10) || (a2 != null && a2.display_gifts_button)) && !org.telegram.messenger.h20.t(j10) && !org.telegram.messenger.vp.E2(j10) && userFull != null) {
                if (!j10.premium && org.telegram.messenger.vp.r1(this.Q).w7 && org.telegram.messenger.vp.r1(this.Q).x7) {
                }
                if (org.telegram.messenger.y1.e(userFull.birthday)) {
                }
                if (!userFull.display_gifts_button) {
                    if (a2 != null) {
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
                if (unVar != null && unVar.f4 == 0) {
                    z11 = true;
                    if (!z11 && (p2Var = this.L) != null) {
                        p2Var.e(true);
                    }
                    if (z11 && this.K1 == null) {
                        return;
                    }
                    if (this.K1 == null && unVar != null) {
                        fe feVar = new fe(this, getContext(), i10);
                        this.K1 = feVar;
                        feVar.setImageResource(R.drawable.msg_input_gift);
                        fe feVar2 = this.K1;
                        int i11 = org.telegram.ui.ActionBar.t6.Kl;
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        org.telegram.ui.ActionBar.p6 p6Var = this.W3;
                        org.telegram.ui.ActionBar.a7.t(feVar2, i11, p6Var, mode);
                        this.K1.setVisibility(8);
                        this.K1.setContentDescription(org.telegram.messenger.cd.L0(2131749689, null));
                        this.K1.setScaleType(ImageView.ScaleType.CENTER);
                        fe feVar3 = this.K1;
                        int i12 = org.telegram.ui.ActionBar.t6.i6;
                        org.telegram.ui.ActionBar.a7.R(feVar3, org.telegram.ui.ActionBar.t6.h0(e0(i12), 1, -1), null, org.telegram.ui.ActionBar.a7.N(i12), p6Var);
                        this.p1.addView(this.K1, 0, w7.b6.e(44, 44, 21));
                        this.K1.setOnClickListener(new vc(this, 9));
                    }
                    org.telegram.messenger.i0.X3(this.K1, z11, 1.0f, true, 1.0f, z10, new sc(this, i10));
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
            p2Var.e(true);
        }
        if (z11) {
        }
        if (this.K1 == null) {
            fe feVar4 = new fe(this, getContext(), i10);
            this.K1 = feVar4;
            feVar4.setImageResource(R.drawable.msg_input_gift);
            fe feVar22 = this.K1;
            int i112 = org.telegram.ui.ActionBar.t6.Kl;
            PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.p6 p6Var2 = this.W3;
            org.telegram.ui.ActionBar.a7.t(feVar22, i112, p6Var2, mode2);
            this.K1.setVisibility(8);
            this.K1.setContentDescription(org.telegram.messenger.cd.L0(2131749689, null));
            this.K1.setScaleType(ImageView.ScaleType.CENTER);
            fe feVar32 = this.K1;
            int i122 = org.telegram.ui.ActionBar.t6.i6;
            org.telegram.ui.ActionBar.a7.R(feVar32, org.telegram.ui.ActionBar.t6.h0(e0(i122), 1, -1), null, org.telegram.ui.ActionBar.a7.N(i122), p6Var2);
            this.p1.addView(this.K1, 0, w7.b6.e(44, 44, 21));
            this.K1.setOnClickListener(new vc(this, 9));
        }
        org.telegram.messenger.i0.X3(this.K1, z11, 1.0f, true, 1.0f, z10, new sc(this, i10));
        if (z11) {
        }
    }

    public final void I() {
        float f7 = this.k5.e;
        if (this.G1 != null) {
            float measuredHeight = getMeasuredHeight() - this.j5.f;
            this.G1.setTranslationY(measuredHeight - (r4.getMeasuredHeight() * f7));
            this.G1.setVisibility(f7 > 0.0f ? 0 : 8);
        }
        boolean z10 = f7 > 0.0f;
        if (this.M4 == z10) {
            return;
        }
        pd pdVar = this.z1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) pdVar.getLayoutParams();
        int i10 = z10 ? this.G1.getLayoutParams().height : 0;
        layoutParams.topMargin = i10;
        layoutParams.topMargin = org.telegram.messenger.i0.L(9.0f) + i10;
        pdVar.setLayoutParams(layoutParams);
        this.M4 = z10;
        setMinimumHeight(org.telegram.messenger.i0.L(44.0f) + (z10 ? this.G1.getLayoutParams().height : 0));
        if (this.z3) {
            if (this.R1 == 0) {
                l1(false, true, false, true);
            } else {
                G();
            }
        }
    }

    public final void I0(CharSequence charSequence, CharSequence charSequence2, String str) {
        org.telegram.ui.un unVar;
        if (this.E0 == null || (unVar = this.P2) == null) {
            return;
        }
        org.telegram.messenger.vp.r1(this.Q);
        boolean z10 = org.telegram.messenger.v2.a;
        bi.k2 k2Var = new bi.k2(str);
        k2Var.h = charSequence;
        k2Var.n = charSequence2;
        k2Var.setResourceProvider(this.W3);
        k2Var.J = unVar;
        k2Var.s = unVar.T;
        k2Var.w = unVar.Z;
        k2Var.L = new ld(this, 2);
        k2Var.K = new ld(this, 3);
        unVar.presentFragment(k2Var);
    }

    public final void I1() {
        se seVar = this.E0;
        if (seVar != null) {
            seVar.setTranslationX(this.H + this.G);
        }
    }

    public final void J() {
        org.telegram.ui.un unVar = this.P2;
        if (unVar != null) {
            org.telegram.messenger.ui.b0(this.Q).Q1(unVar.a(), unVar.J7(unVar.D5), "", null, null, null, null, 0L, false, true, null);
        }
        setRichDraftPreview(null);
    }

    public final void J0() {
        tc tcVar = new tc(this, 29);
        if (org.telegram.messenger.js.h(this.Q, this.Q2) || org.telegram.messenger.vp.r1(this.Q).X6.contains(Long.valueOf(this.Q2))) {
            tcVar.run();
            return;
        }
        s4.n(this.P2, org.telegram.messenger.vp.r1(this.Q).Z1(Long.valueOf(this.Q2)), new cd(3, this, tcVar), new ld(this, 0));
    }

    public final void J1(TLRPC.Chat chat, TLRPC.UserFull userFull) {
        gf gfVar;
        this.A0 = false;
        boolean z10 = true;
        this.b = true;
        this.z0 = true;
        this.x0 = true;
        this.y0 = true;
        if (chat != null) {
            this.a1 = (org.telegram.messenger.w3.v(chat) || (org.telegram.messenger.w3.s(chat) && this.e2)) ? false : true;
            this.b = org.telegram.messenger.w3.t(chat);
            boolean q6 = org.telegram.messenger.w3.q(chat);
            this.z0 = q6;
            boolean z11 = (this.b || q6) ? false : true;
            this.A0 = z11;
            this.n = z11 ? 0.5f : 1.0f;
            E1();
            if (!this.A0 && (gfVar = this.U0) != null) {
                gfVar.L(-this.Q2, !this.z0, !this.b);
            }
            this.x0 = org.telegram.messenger.w3.s(chat);
            this.y0 = org.telegram.messenger.w3.v(chat);
        } else if (userFull != null) {
            this.a1 = userFull.voice_messages_forbidden;
            this.K = userFull;
        }
        float f7 = this.a1 ? 0.5f : 1.0f;
        yd ydVar = this.Z0;
        ydVar.setAlpha(f7);
        ydVar.invalidate();
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.a1 ? e0(org.telegram.ui.ActionBar.t6.Kl) : -1, PorterDuff.Mode.SRC_IN);
        zd zdVar = this.b1;
        zdVar.setColorFilter(porterDuffColorFilter);
        zdVar.invalidate();
        F1(false);
        boolean z12 = this.c1;
        if (!this.x0 && z12) {
            z12 = false;
        }
        if (this.y0 || z12) {
            z10 = z12;
        } else if (!this.e2) {
            z10 = false;
        }
        i1(z10, false);
    }

    @Override // org.telegram.ui.Components.tu0
    public final void K(int i10, boolean z10) {
        org.telegram.messenger.jj jjVar;
        se seVar;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        boolean z11;
        int i11;
        int i12;
        hh.f fVar;
        if (this.R1 != 0) {
            this.L2 = i10;
            this.M2 = z10;
            this.z2 = i10 > 0;
            z();
            return;
        }
        if (i10 > org.telegram.messenger.i0.L(50.0f) && this.z2 && !org.telegram.messenger.i0.E) {
            if (z10) {
                this.y2 = i10;
                org.telegram.messenger.vp.c1().edit().putInt("kbd_height_land3", this.y2).commit();
            } else {
                this.x2 = i10;
                org.telegram.messenger.vp.c1().edit().putInt("kbd_height", this.x2).commit();
            }
        }
        if (this.z2 && this.W0 && this.U0 == null) {
            this.W0 = false;
        }
        boolean q02 = q0();
        uu0 uu0Var = this.m1;
        org.telegram.ui.un unVar = this.P2;
        if (q02) {
            int i13 = z10 ? this.y2 : this.x2;
            if (unVar != null && unVar.getParentLayout() != null) {
                i13 -= ((ActionBarLayout) unVar.getParentLayout()).v(false);
            }
            if (this.f2 == 1) {
                df dfVar = this.H1;
                if (!dfVar.f) {
                    i13 = Math.min(dfVar.getKeyboardHeight(), i13);
                }
            }
            int i14 = this.f2;
            ViewGroup viewGroup = i14 == 0 ? this.U0 : i14 == 1 ? this.H1 : null;
            df dfVar2 = this.H1;
            if (dfVar2 != null) {
                dfVar2.setPanelHeight(i13);
                hh.f fVar2 = this.h5;
                if (fVar2 != null && i13 > 0 && this.f2 == 1) {
                    ((hh.i) fVar2).h(i13);
                }
            }
            if (viewGroup != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
                if (!this.A3 && !this.z3 && (((i11 = layoutParams.width) != (i12 = org.telegram.messenger.i0.q.x) || layoutParams.height != i13) && ((fVar = this.h5) == null || i11 != -1 || layoutParams.height != -1))) {
                    if (fVar == null) {
                        layoutParams.width = i12;
                        layoutParams.height = i13;
                        viewGroup.setLayoutParams(layoutParams);
                    }
                    if (uu0Var != null) {
                        int i15 = this.A2;
                        this.A2 = layoutParams.height;
                        uu0Var.requestLayout();
                        E0();
                        if (this.i2 && !this.z2 && i15 != this.A2 && L0()) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.V0 = animatorSet;
                            if (this.h5 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(this.A2 - i15, 0.0f));
                            } else {
                                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.TRANSLATION_Y, this.A2 - i15, 0.0f));
                            }
                            this.V0.setInterpolator(org.telegram.ui.ActionBar.m1.w);
                            this.V0.setDuration(250L);
                            this.V0.addListener(new ce(this, 10));
                            org.telegram.messenger.i0.h3(this.Y3, 50L);
                            this.L3.d();
                            requestLayout();
                        }
                    }
                }
            }
        }
        if (this.L2 == i10 && this.M2 == z10) {
            E0();
            return;
        }
        this.L2 = i10;
        this.M2 = z10;
        boolean z12 = this.z2;
        this.z2 = i10 > 0;
        z();
        if (this.z2 && q0() && this.B3 == null) {
            r1(0, this.f2, true, true);
        } else if (!this.z2 && !q0() && (jjVar = this.m2) != null && this.T2 != jjVar && !f0() && !r() && !org.telegram.ui.ActionBar.k2.hasSheets(unVar) && (((seVar = this.E0) == null || TextUtils.isEmpty(seVar.getText())) && (tL_replyKeyboardMarkup = this.n2) != null && !tL_replyKeyboardMarkup.rows.isEmpty())) {
            org.telegram.ui.ActionBar.m1 m1Var = uu0Var.H;
            if (m1Var.f) {
                m1Var.j();
            } else {
                m1Var.v = true;
            }
            r1(1, 1, false, true);
        }
        if (this.A2 != 0 && !(z11 = this.z2) && z11 != z12 && !q0()) {
            this.A2 = 0;
            uu0Var.requestLayout();
        }
        if (this.z2 && this.k3) {
            this.k3 = false;
            if (this.p3) {
                this.p3 = false;
                this.H1.setButtons(this.n2);
            }
            org.telegram.messenger.i0.r(this.r3);
        }
        E0();
    }

    public final boolean K0() {
        return this.V0 != null;
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
    public void K1(int i10, boolean z10) {
        boolean z11;
        int i11;
        char c10;
        float f7;
        int i12;
        ?? r10;
        boolean z12;
        int i13;
        boolean z13;
        long j10;
        ?? r102;
        int i14;
        float f10;
        ?? r103;
        int i15;
        float f11;
        boolean z14;
        ViewGroup viewGroup;
        ViewGroup.LayoutParams layoutParams;
        int i16;
        char c11;
        char c12;
        Property property;
        dg dgVar = dg.a;
        dg dgVar2 = dg.b;
        Float valueOf = Float.valueOf(0.0f);
        Runnable runnable = this.f0;
        if (runnable != null) {
            org.telegram.messenger.i0.r(runnable);
            this.f0 = null;
        }
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.M = false;
        }
        boolean z15 = this.F2;
        Property property2 = View.TRANSLATION_X;
        Property property3 = View.SCALE_X;
        Property property4 = View.SCALE_Y;
        Property property5 = View.ALPHA;
        if (z15) {
            if (this.w2 == 1) {
                this.Q4 = i10;
                return;
            }
            boolean z16 = this.Q4 == 3;
            if (z16) {
                property = property3;
            } else {
                this.O = false;
                wf wfVar = this.O1;
                if (wfVar != null) {
                    wfVar.D.d(1, false, false);
                }
                org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(this.Q);
                long j11 = this.Q2;
                org.telegram.ui.un unVar = this.P2;
                property = property3;
                b02.e2(j11, (unVar == null || !unVar.v4) ? 0L : unVar.b(), this.O);
                this.i1 = 0L;
            }
            T();
            this.w2 = 1;
            gf gfVar = this.U0;
            if (gfVar != null) {
                gfVar.setEnabled(false);
            }
            try {
                if (this.q2 == null) {
                    PowerManager.WakeLock newWakeLock = ((PowerManager) org.telegram.messenger.w0.b.getSystemService("power")).newWakeLock(536870918, "telegram:audio_record_lock");
                    this.q2 = newWakeLock;
                    newWakeLock.acquire();
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
            org.telegram.messenger.i0.f2(this.O2);
            sf sfVar = this.Z2;
            if (sfVar != null) {
                sfVar.G0(0);
            }
            AnimatorSet animatorSet = this.t2;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.u2;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            V();
            org.telegram.ui.Cells.a5 a5Var = this.d1;
            if (a5Var != null) {
                a5Var.setVisibility(0);
            }
            U();
            RecordCircle recordCircle2 = this.N1;
            if (recordCircle2 != null) {
                recordCircle2.M = false;
                recordCircle2.setVisibility(0);
                this.N1.setAmplitude(0.0d);
            }
            wf wfVar2 = this.O1;
            if (wfVar2 != null) {
                wfVar2.setVisibility(0);
            }
            yf yfVar = this.l1;
            if (yfVar != null) {
                yfVar.a = 1.0f;
                yfVar.b = System.currentTimeMillis();
                yfVar.r = -1L;
                yfVar.c = false;
                yfVar.e = false;
                yfVar.f.stop();
                yfVar.invalidate();
                this.l1.setScaleX(0.0f);
                this.l1.setScaleY(0.0f);
                this.l1.h = true;
            }
            this.t2 = new AnimatorSet();
            this.Y0.setTranslationX(org.telegram.messenger.i0.L(20.0f));
            this.Y0.setAlpha(0.0f);
            if (this.Q4 != 3) {
                this.k1.setTranslationX(org.telegram.messenger.i0.L(20.0f));
                this.k1.setAlpha(0.0f);
                this.k1.setCancelToProgress(0.0f);
                this.k1.r = 1.0f;
                this.k1.setEnabled(true);
            } else {
                this.k1.setTranslationX(0.0f);
                this.k1.setAlpha(0.0f);
                this.k1.setCancelToProgress(1.0f);
                this.k1.setEnabled(true);
            }
            this.N1.c(this.Q4 == 3);
            this.k2 = false;
            u0();
            AnimatorSet animatorSet3 = new AnimatorSet();
            Property property6 = property;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.Q0, this.Z3, 0.0f), ObjectAnimator.ofFloat(this.Q0, this.b4, 0.0f), ObjectAnimator.ofFloat(this.l1, (Property<yf, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.l1, (Property<yf, Float>) property6, 1.0f), ObjectAnimator.ofFloat(this.Y0, (Property<bg, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.Y0, (Property<bg, Float>) property5, 1.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.k1, (Property<SlideTextView, Float>) property2, 0.0f));
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.k1, (Property<SlideTextView, Float>) property5, 1.0f));
            wf wfVar3 = this.O1;
            if (wfVar3 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(wfVar3, (Property<wf, Float>) property5, 1.0f));
            }
            if (this.b1 != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(this.Z0, (Property<yd, Float>) property5, 0.0f));
            }
            xh.w wVar = this.l0;
            if (wVar != null) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(wVar, (Property<xh.w, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.l0, (Property<xh.w, Float>) property6, 0.0f), ObjectAnimator.ofFloat(this.l0, (Property<xh.w, Float>) property5, 0.0f));
            }
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.playTogether(ObjectAnimator.ofFloat(this.E0, this.d4, org.telegram.messenger.i0.L(20.0f)), ObjectAnimator.ofFloat(this.E0, (Property<se, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.e1, (Property<pd, Float>) property5, 1.0f));
            if (z16) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.h1, (Property<nj0, Float>) property5, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.g1, (Property<ei0, Float>) property5, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.g1, (Property<ei0, Float>) property6, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.g1, (Property<ei0, Float>) property4, 0.0f));
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f1, (Property<j71, Float>) property5, 0.0f));
            }
            if (this.J1 != null) {
                animatorSet4.playTogether(l(org.telegram.messenger.i0.L(30.0f)), ObjectAnimator.ofFloat(this.J1, (Property<de, Float>) property5, 0.0f));
            }
            jg.z2 z2Var = this.p1;
            if (z2Var != null) {
                animatorSet4.playTogether(ObjectAnimator.ofFloat(z2Var, this.c4, org.telegram.messenger.i0.L(30.0f)), ObjectAnimator.ofFloat(this.p1, this.a4, 0.0f));
                ViewPropertyAnimator viewPropertyAnimator = this.q1;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    this.q1 = null;
                }
                ag.r rVar = this.r1;
                this.v1 = 0.0f;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(rVar, (Property<ag.r, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.r1, (Property<ag.r, Float>) property6, 0.5f), ObjectAnimator.ofFloat(this.r1, (Property<ag.r, Float>) property4, 0.5f));
            }
            bh.k kVar = this.i5;
            if (kVar != null) {
                kVar.e(0, false, true);
            }
            this.t2.playTogether(animatorSet3.setDuration(150L), animatorSet4.setDuration(150L), ObjectAnimator.ofFloat(this.N1, this.u3, 1.0f).setDuration(300L));
            if (!z16) {
                this.t2.playTogether(ObjectAnimator.ofFloat(this.N1, this.v3, 1.0f).setDuration(300L));
            }
            this.t2.addListener(new xe(this, z16));
            this.t2.setInterpolator(new DecelerateInterpolator());
            this.t2.start();
            this.Y0.a(this.i1);
        } else {
            if (this.k2 && i10 == 3) {
                return;
            }
            PowerManager.WakeLock wakeLock = this.q2;
            if (wakeLock != null) {
                try {
                    wakeLock.release();
                    this.q2 = null;
                } catch (Exception e7) {
                    org.telegram.messenger.f8.f(e7);
                }
            }
            org.telegram.messenger.i0.P3(this.O2);
            this.m3 = false;
            if (this.w2 == 0) {
                this.Q4 = i10;
                return;
            }
            org.telegram.messenger.vp.r1(this.R.a).z4(2, 0, this.Q2, getThreadMessageId(), null);
            this.w2 = 0;
            gf gfVar2 = this.U0;
            if (gfVar2 != null) {
                gfVar2.setEnabled(true);
            }
            AnimatorSet animatorSet5 = this.t2;
            if (animatorSet5 != null) {
                z11 = animatorSet5.isRunning();
                zd zdVar = this.b1;
                if (zdVar != null) {
                    zdVar.setScaleX(1.0f);
                    this.b1.setScaleY(1.0f);
                }
                this.t2.removeAllListeners();
                this.t2.cancel();
            } else {
                z11 = false;
            }
            AnimatorSet animatorSet6 = this.u2;
            if (animatorSet6 != null) {
                animatorSet6.cancel();
            }
            se seVar = this.E0;
            if (seVar != null) {
                seVar.setVisibility(0);
            }
            this.t2 = new AnimatorSet();
            if (z11 || i10 == 4) {
                float f12 = 0.5f;
                zd zdVar2 = this.b1;
                if (zdVar2 != null) {
                    zdVar2.setVisibility(0);
                }
                AnimatorSet animatorSet7 = this.t2;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.Q0, this.Z3, 1.0f);
                rd rdVar = this.Q0;
                od odVar = this.b4;
                if (!this.A0) {
                    f12 = 1.0f;
                }
                animatorSet7.playTogether(ofFloat, ObjectAnimator.ofFloat(rdVar, odVar, f12), ObjectAnimator.ofFloat(this.l1, (Property<yf, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.l1, (Property<yf, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.N1, this.u3, 0.0f), ObjectAnimator.ofFloat(this.N1, this.v3, 0.0f), ObjectAnimator.ofFloat(this.Z0, (Property<yd, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.Y0, (Property<bg, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.Z0, (Property<yd, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.E0, (Property<se, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.E0, this.d4, 0.0f), ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f));
                wf wfVar4 = this.O1;
                if (wfVar4 != null) {
                    i11 = 1;
                    c10 = 0;
                    this.t2.playTogether(ObjectAnimator.ofFloat(wfVar4, (Property<wf, Float>) property5, 0.0f));
                    this.O1.a();
                } else {
                    i11 = 1;
                    c10 = 0;
                }
                xh.w wVar2 = this.l0;
                if (wVar2 != null) {
                    AnimatorSet animatorSet8 = this.t2;
                    float[] fArr = new float[i11];
                    f7 = 1.0f;
                    fArr[c10] = 1.0f;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(wVar2, (Property<xh.w, Float>) property4, fArr);
                    xh.w wVar3 = this.l0;
                    float[] fArr2 = new float[i11];
                    fArr2[c10] = 1.0f;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(wVar3, (Property<xh.w, Float>) property3, fArr2);
                    xh.w wVar4 = this.l0;
                    float[] fArr3 = new float[i11];
                    fArr3[c10] = 1.0f;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(wVar4, (Property<xh.w, Float>) property5, fArr3);
                    Animator[] animatorArr = new Animator[3];
                    animatorArr[c10] = ofFloat2;
                    animatorArr[i11] = ofFloat3;
                    animatorArr[2] = ofFloat4;
                    animatorSet8.playTogether(animatorArr);
                } else {
                    f7 = 1.0f;
                }
                zd zdVar3 = this.b1;
                if (zdVar3 != null) {
                    zdVar3.setScaleX(f7);
                    this.b1.setScaleY(f7);
                    i12 = 1;
                    this.t2.playTogether(ObjectAnimator.ofFloat(this.Z0, (Property<yd, Float>) property5, f7));
                    this.b1.j(p0() ? dgVar2 : dgVar, true);
                } else {
                    i12 = 1;
                }
                if (this.J1 != null) {
                    AnimatorSet animatorSet9 = this.t2;
                    ValueAnimator l4 = l(0.0f);
                    de deVar = this.J1;
                    float[] fArr4 = new float[i12];
                    fArr4[0] = 1.0f;
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(deVar, (Property<de, Float>) property5, fArr4);
                    Animator[] animatorArr2 = new Animator[2];
                    animatorArr2[0] = l4;
                    animatorArr2[i12] = ofFloat5;
                    animatorSet9.playTogether(animatorArr2);
                }
                if (this.p1 != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.q1;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.q1 = null;
                    }
                    z12 = true;
                    r10 = 0;
                    this.t2.playTogether(ObjectAnimator.ofFloat(this.p1, this.c4, 0.0f), ObjectAnimator.ofFloat(this.p1, this.a4, 1.0f));
                    AnimatorSet animatorSet10 = this.t2;
                    ag.r rVar2 = this.r1;
                    this.v1 = 1.0f;
                    animatorSet10.playTogether(ObjectAnimator.ofFloat(rVar2, (Property<ag.r, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.r1, (Property<ag.r, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.r1, (Property<ag.r, Float>) property4, 1.0f));
                } else {
                    r10 = 0;
                    z12 = true;
                }
                bh.k kVar2 = this.i5;
                if (kVar2 != 0) {
                    kVar2.e(r10, r10, z12);
                }
                this.k2 = z12;
                u0();
                this.t2.setDuration(150L);
            } else {
                int i17 = 9;
                if (i10 == 3) {
                    T();
                    U();
                    SlideTextView slideTextView = this.k1;
                    if (slideTextView != null) {
                        slideTextView.setEnabled(false);
                    }
                    if (this.c1) {
                        nj0 nj0Var = this.h1;
                        if (nj0Var != null) {
                            nj0Var.setVisibility(8);
                        }
                        pd pdVar = this.e1;
                        if (pdVar != null) {
                            pdVar.setAlpha(1.0f);
                            this.e1.setVisibility(0);
                        }
                        ei0 ei0Var = this.g1;
                        if (ei0Var != null) {
                            ei0Var.setProgress(0.0f);
                            this.g1.i();
                        }
                        z14 = true;
                        f11 = 1.0f;
                    } else {
                        j71 j71Var = this.f1;
                        if (j71Var != null) {
                            j71Var.setVisibility(8);
                            u0();
                        }
                        pd pdVar2 = this.e1;
                        if (pdVar2 != null) {
                            pdVar2.setVisibility(0);
                            f11 = 1.0f;
                            this.e1.setAlpha(1.0f);
                        } else {
                            f11 = 1.0f;
                        }
                        nj0 nj0Var2 = this.h1;
                        if (nj0Var2 != null) {
                            nj0Var2.setVisibility(0);
                            this.h1.setAlpha(0.0f);
                        }
                        z14 = true;
                    }
                    this.s4 = z14;
                    this.n4 = f11;
                    this.l4 = this.k4;
                    this.j4 = f11;
                    SlideTextView slideTextView2 = this.k1;
                    if (slideTextView2 != null) {
                        slideTextView2.setCancelToProgress(f11);
                    }
                    wf wfVar5 = this.O1;
                    if (wfVar5 != null) {
                        wfVar5.invalidate();
                    }
                    ei0 ei0Var2 = this.g1;
                    if (ei0Var2 != null) {
                        ei0Var2.setAlpha(0.0f);
                        this.g1.setScaleX(0.0f);
                        this.g1.setScaleY(0.0f);
                        this.g1.setProgress(0.0f);
                        this.g1.i();
                    }
                    if (p0() || this.z4) {
                        this.f1.setVisibility(0);
                        viewGroup = null;
                        layoutParams = null;
                    } else {
                        viewGroup = (ViewGroup) this.e1.getParent();
                        layoutParams = this.e1.getLayoutParams();
                        viewGroup.removeView(this.e1);
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(viewGroup.getMeasuredWidth() - (this.Z1 == null ? i0.a.d(44.0f, this.J0.l(), 0) : 0), org.telegram.messenger.i0.L(44.0f));
                        layoutParams2.gravity = 80;
                        layoutParams2.leftMargin = org.telegram.messenger.i0.L(7.0f);
                        layoutParams2.rightMargin = org.telegram.messenger.i0.L(7.0f);
                        this.m1.addView(this.e1, layoutParams2);
                        this.f1.setVisibility(8);
                    }
                    u0();
                    AnimatorSet animatorSet11 = new AnimatorSet();
                    if (z10) {
                        this.h1.setAllowDraw(false);
                        ValueAnimator ofFloat6 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat6.addUpdateListener(new sc(this, 6));
                        ofFloat6.addListener(new ye(this));
                        ofFloat6.setDuration(p0() ? 490L : 580L);
                        AnimatorSet animatorSet12 = new AnimatorSet();
                        animatorSet12.playTogether(ObjectAnimator.ofFloat(this.l1, (Property<yf, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.l1, (Property<yf, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.Y0, (Property<bg, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.Y0, (Property<bg, Float>) property2, -org.telegram.messenger.i0.L(20.0f)), ObjectAnimator.ofFloat(this.k1, (Property<SlideTextView, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.g1, (Property<ei0, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.g1, (Property<ei0, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.g1, (Property<ei0, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.Q0, this.Z3, 0.0f), ObjectAnimator.ofFloat(this.Q0, this.b4, 0.0f), ObjectAnimator.ofFloat(this.E0, (Property<se, Float>) property5, 0.0f));
                        ei0 ei0Var3 = this.g1;
                        if (ei0Var3 != null) {
                            ei0Var3.setAlpha(0.0f);
                            this.g1.setScaleX(0.0f);
                            this.g1.setScaleY(0.0f);
                        }
                        if (this.b1 != null) {
                            i16 = 1;
                            animatorSet12.playTogether(ObjectAnimator.ofFloat(this.Z0, (Property<yd, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.Z0, (Property<yd, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.Z0, (Property<yd, Float>) property4, 1.0f));
                            this.b1.j(p0() ? dgVar2 : dgVar, true);
                        } else {
                            i16 = 1;
                        }
                        xh.w wVar5 = this.l0;
                        if (wVar5 != null) {
                            float[] fArr5 = new float[i16];
                            fArr5[0] = 0.0f;
                            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(wVar5, (Property<xh.w, Float>) property5, fArr5);
                            xh.w wVar6 = this.l0;
                            float[] fArr6 = new float[i16];
                            fArr6[0] = 0.0f;
                            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(wVar6, (Property<xh.w, Float>) property3, fArr6);
                            xh.w wVar7 = this.l0;
                            float[] fArr7 = new float[i16];
                            fArr7[0] = 0.0f;
                            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(wVar7, (Property<xh.w, Float>) property4, fArr7);
                            Animator[] animatorArr3 = new Animator[3];
                            animatorArr3[0] = ofFloat7;
                            animatorArr3[i16] = ofFloat8;
                            animatorArr3[2] = ofFloat9;
                            animatorSet12.playTogether(animatorArr3);
                        }
                        animatorSet12.addListener(new ce(this, 8));
                        animatorSet12.setDuration(150L);
                        animatorSet12.setStartDelay(150L);
                        if (p0()) {
                            this.f1.setAlpha(0.0f);
                            c11 = 1;
                            c12 = 0;
                            animatorSet11.playTogether(ObjectAnimator.ofFloat(this.f1, (Property<j71, Float>) property5, 1.0f));
                            animatorSet11.setDuration(150L);
                            animatorSet11.setStartDelay(430L);
                        } else {
                            c11 = 1;
                            c12 = 0;
                        }
                        AnimatorSet animatorSet13 = this.t2;
                        Animator[] animatorArr4 = new Animator[3];
                        animatorArr4[c12] = animatorSet12;
                        animatorArr4[c11] = ofFloat6;
                        animatorArr4[2] = animatorSet11;
                        animatorSet13.playTogether(animatorArr4);
                        this.t2.addListener(new org.telegram.ui.ActionBar.g1(this, viewGroup, layoutParams, 2));
                    } else {
                        V();
                        this.u3.set(this.N1, Float.valueOf(1.0f));
                        this.N1.setTransformToSeekbar(1.0f);
                        if (!p0()) {
                            float f13 = this.p4;
                            if (f13 != 0.0f && this.h1 != null) {
                                this.h1.setAlpha(gr.j.getInterpolation(Math.max(0.0f, ((f13 - 0.38f) - 0.25f) / 0.37f)));
                                this.h1.invalidate();
                            }
                        }
                        this.l1.setScaleY(0.0f);
                        this.l1.setScaleX(0.0f);
                        this.Y0.setAlpha(0.0f);
                        this.Y0.setTranslationX(-org.telegram.messenger.i0.L(20.0f));
                        this.k1.setAlpha(0.0f);
                        this.g1.setAlpha(1.0f);
                        this.g1.setScaleY(1.0f);
                        this.g1.setScaleX(1.0f);
                        this.Z3.set(this.Q0, valueOf);
                        this.b4.set(this.Q0, valueOf);
                        this.E0.setAlpha(0.0f);
                        zd zdVar4 = this.b1;
                        if (zdVar4 != null) {
                            if (p0()) {
                                dgVar = dgVar2;
                            }
                            zdVar4.j(dgVar, z10);
                            this.Z0.setAlpha(1.0f);
                            this.Z0.setScaleX(1.0f);
                            this.Z0.setScaleY(1.0f);
                        }
                        xh.w wVar8 = this.l0;
                        if (wVar8 != null) {
                            wVar8.setAlpha(0.0f);
                            this.l0.setScaleX(0.0f);
                            this.l0.setScaleY(0.0f);
                        }
                        if (p0()) {
                            this.f1.setAlpha(1.0f);
                        }
                        if (viewGroup != null) {
                            this.m1.removeView(this.e1);
                            viewGroup.addView(this.e1, layoutParams);
                        }
                        this.e1.setAlpha(1.0f);
                        this.h1.setAlpha(1.0f);
                        this.h = 0.0f;
                        this.n = 0.0f;
                        E1();
                        u0();
                    }
                } else if (i10 == 2 || i10 == 5) {
                    zd zdVar5 = this.b1;
                    if (zdVar5 != null) {
                        zdVar5.setVisibility(0);
                    }
                    this.k2 = true;
                    u0();
                    AnimatorSet animatorSet14 = new AnimatorSet();
                    animatorSet14.playTogether(ObjectAnimator.ofFloat(this.Q0, this.Z3, 1.0f), ObjectAnimator.ofFloat(this.Q0, this.b4, this.A0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.l1, (Property<yf, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.l1, (Property<yf, Float>) property3, 0.0f));
                    wf wfVar6 = this.O1;
                    if (wfVar6 != null) {
                        animatorSet14.playTogether(ObjectAnimator.ofFloat(wfVar6, (Property<wf, Float>) property5, 0.0f));
                        this.O1.a();
                    }
                    xh.w wVar9 = this.l0;
                    if (wVar9 != null) {
                        animatorSet14.playTogether(ObjectAnimator.ofFloat(wVar9, (Property<xh.w, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.l0, (Property<xh.w, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.l0, (Property<xh.w, Float>) property5, 1.0f));
                    }
                    AnimatorSet animatorSet15 = new AnimatorSet();
                    animatorSet15.playTogether(ObjectAnimator.ofFloat(this.Y0, (Property<bg, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.Y0, (Property<bg, Float>) property2, -org.telegram.messenger.i0.L(20.0f)), ObjectAnimator.ofFloat(this.k1, (Property<SlideTextView, Float>) property5, 0.0f), ObjectAnimator.ofFloat(this.k1, (Property<SlideTextView, Float>) property2, -org.telegram.messenger.i0.L(20.0f)));
                    if (i10 != 5) {
                        this.Z0.setScaleX(0.0f);
                        this.Z0.setScaleY(0.0f);
                        ag.r rVar3 = this.r1;
                        if (rVar3 != null && rVar3.getVisibility() == 0) {
                            this.r1.setScaleX(0.5f);
                            this.r1.setScaleY(0.5f);
                        }
                        fe feVar = this.x1;
                        if (feVar != null && feVar.getVisibility() == 0) {
                            this.x1.setScaleX(0.0f);
                            this.x1.setScaleY(0.0f);
                        }
                        animatorSet14.playTogether(ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f), ObjectAnimator.ofFloat(this.Z0, (Property<yd, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.Z0, (Property<yd, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.Z0, (Property<yd, Float>) property5, 1.0f));
                        if (this.p1 != null) {
                            ViewPropertyAnimator viewPropertyAnimator3 = this.q1;
                            if (viewPropertyAnimator3 != null) {
                                viewPropertyAnimator3.cancel();
                                this.q1 = null;
                            }
                            i14 = 1;
                            r102 = 0;
                            animatorSet14.playTogether(ObjectAnimator.ofFloat(this.p1, this.a4, 1.0f), ObjectAnimator.ofFloat(this.p1, this.c4, 0.0f));
                            ag.r rVar4 = this.r1;
                            this.v1 = 1.0f;
                            animatorSet14.playTogether(ObjectAnimator.ofFloat(rVar4, (Property<ag.r, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.r1, (Property<ag.r, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.r1, (Property<ag.r, Float>) property4, 1.0f));
                        } else {
                            r102 = 0;
                            i14 = 1;
                        }
                        bh.k kVar3 = this.i5;
                        if (kVar3 != 0) {
                            kVar3.e(r102, r102, i14);
                        }
                        fe feVar2 = this.x1;
                        if (feVar2 != null) {
                            float[] fArr8 = new float[i14];
                            fArr8[r102] = 1.0f;
                            ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(feVar2, (Property<fe, Float>) property3, fArr8);
                            fe feVar3 = this.x1;
                            float[] fArr9 = new float[i14];
                            fArr9[r102] = 1.0f;
                            ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(feVar3, (Property<fe, Float>) property4, fArr9);
                            Animator[] animatorArr5 = new Animator[2];
                            animatorArr5[r102] = ofFloat10;
                            animatorArr5[i14] = ofFloat11;
                            animatorSet14.playTogether(animatorArr5);
                        }
                        if (this.b1 != null) {
                            yd ydVar = this.Z0;
                            float[] fArr10 = new float[i14];
                            fArr10[r102] = 1.0f;
                            ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(ydVar, (Property<yd, Float>) property5, fArr10);
                            Animator[] animatorArr6 = new Animator[i14];
                            animatorArr6[r102] = ofFloat12;
                            animatorSet14.playTogether(animatorArr6);
                            yd ydVar2 = this.Z0;
                            float[] fArr11 = new float[i14];
                            fArr11[r102] = 1.0f;
                            ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(ydVar2, (Property<yd, Float>) property3, fArr11);
                            Animator[] animatorArr7 = new Animator[i14];
                            animatorArr7[r102] = ofFloat13;
                            animatorSet14.playTogether(animatorArr7);
                            yd ydVar3 = this.Z0;
                            float[] fArr12 = new float[i14];
                            fArr12[r102] = 1.0f;
                            ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(ydVar3, (Property<yd, Float>) property4, fArr12);
                            Animator[] animatorArr8 = new Animator[i14];
                            animatorArr8[r102] = ofFloat14;
                            animatorSet14.playTogether(animatorArr8);
                            this.b1.j(p0() ? dgVar2 : dgVar, i14);
                        }
                        de deVar2 = this.J1;
                        if (deVar2 != null) {
                            float[] fArr13 = new float[i14];
                            fArr13[0] = 1.0f;
                            ObjectAnimator ofFloat15 = ObjectAnimator.ofFloat(deVar2, (Property<de, Float>) property5, fArr13);
                            ValueAnimator l10 = l(0.0f);
                            Animator[] animatorArr9 = new Animator[2];
                            animatorArr9[0] = ofFloat15;
                            animatorArr9[i14] = l10;
                            animatorSet14.playTogether(animatorArr9);
                        }
                        j10 = 150;
                    } else {
                        AnimatorSet animatorSet16 = new AnimatorSet();
                        animatorSet16.playTogether(ObjectAnimator.ofFloat(this.Z0, (Property<yd, Float>) property5, 1.0f));
                        if (this.p1 != null) {
                            ViewPropertyAnimator viewPropertyAnimator4 = this.q1;
                            if (viewPropertyAnimator4 != null) {
                                viewPropertyAnimator4.cancel();
                                this.q1 = null;
                            }
                            i13 = 1;
                            z13 = false;
                            animatorSet16.playTogether(ObjectAnimator.ofFloat(this.p1, this.c4, 0.0f), ObjectAnimator.ofFloat(this.p1, this.a4, 1.0f));
                            ag.r rVar5 = this.r1;
                            this.v1 = 1.0f;
                            animatorSet16.playTogether(ObjectAnimator.ofFloat(rVar5, (Property<ag.r, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.r1, (Property<ag.r, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.r1, (Property<ag.r, Float>) property4, 1.0f));
                        } else {
                            i13 = 1;
                            z13 = false;
                        }
                        bh.k kVar4 = this.i5;
                        boolean z17 = z13;
                        if (kVar4 != null) {
                            kVar4.e(z17 ? 1 : 0, z17, i13);
                        }
                        de deVar3 = this.J1;
                        if (deVar3 != null) {
                            float[] fArr14 = new float[i13];
                            fArr14[z17 ? 1 : 0] = 1.0f;
                            ObjectAnimator ofFloat16 = ObjectAnimator.ofFloat(deVar3, (Property<de, Float>) property5, fArr14);
                            ValueAnimator l11 = l(0.0f);
                            Animator[] animatorArr10 = new Animator[2];
                            animatorArr10[z17 ? 1 : 0] = ofFloat16;
                            animatorArr10[i13] = l11;
                            animatorSet16.playTogether(animatorArr10);
                        }
                        j10 = 150;
                        animatorSet16.setDuration(150L);
                        animatorSet16.setStartDelay(110L);
                        animatorSet16.addListener(new ce(this, i17));
                        AnimatorSet animatorSet17 = this.t2;
                        Animator[] animatorArr11 = new Animator[i13];
                        animatorArr11[0] = animatorSet16;
                        animatorSet17.playTogether(animatorArr11);
                    }
                    animatorSet14.setDuration(j10);
                    animatorSet14.setStartDelay(700L);
                    animatorSet15.setDuration(200L);
                    animatorSet15.setStartDelay(200L);
                    this.G = 0.0f;
                    I1();
                    ObjectAnimator ofFloat17 = ObjectAnimator.ofFloat(this.E0, (Property<se, Float>) property5, 1.0f);
                    ofFloat17.setStartDelay(this.s == 1.0f ? 300L : 700L);
                    ofFloat17.setDuration(200L);
                    this.t2.playTogether(animatorSet14, animatorSet15, ofFloat17, ObjectAnimator.ofFloat(this, "lockAnimatedTranslation", this.k4).setDuration(200L));
                    if (i10 == 5) {
                        ChatActivityEnterView.this.r4 = true;
                        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f).setDuration(200L);
                        duration.setInterpolator(gr.j);
                        this.t2.playTogether(duration);
                    } else {
                        ObjectAnimator ofFloat18 = ObjectAnimator.ofFloat(this, "exitTransition", 1.0f);
                        ofFloat18.setDuration(360L);
                        ofFloat18.setStartDelay(490L);
                        this.t2.playTogether(ofFloat18);
                    }
                    yf yfVar2 = this.l1;
                    if (yfVar2 != null) {
                        yfVar2.a();
                    }
                } else {
                    zd zdVar6 = this.b1;
                    if (zdVar6 != null) {
                        zdVar6.setVisibility(0);
                    }
                    AnimatorSet animatorSet18 = new AnimatorSet();
                    animatorSet18.playTogether(ObjectAnimator.ofFloat(this.Q0, this.Z3, 1.0f), ObjectAnimator.ofFloat(this.Q0, this.b4, this.A0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(this.l1, (Property<yf, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.l1, (Property<yf, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.Z0, (Property<yd, Float>) property5, 1.0f));
                    wf wfVar7 = this.O1;
                    if (wfVar7 != null) {
                        animatorSet18.playTogether(ObjectAnimator.ofFloat(wfVar7, (Property<wf, Float>) property5, 0.0f));
                        this.O1.a();
                    }
                    xh.w wVar10 = this.l0;
                    if (wVar10 != null) {
                        f10 = 1.0f;
                        animatorSet18.playTogether(ObjectAnimator.ofFloat(wVar10, (Property<xh.w, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.l0, (Property<xh.w, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.l0, (Property<xh.w, Float>) property5, 1.0f));
                    } else {
                        f10 = 1.0f;
                    }
                    zd zdVar7 = this.b1;
                    if (zdVar7 != null) {
                        zdVar7.setScaleX(f10);
                        this.b1.setScaleY(f10);
                        animatorSet18.playTogether(ObjectAnimator.ofFloat(this.Z0, (Property<yd, Float>) property5, f10));
                        this.b1.j(p0() ? dgVar2 : dgVar, true);
                    }
                    if (this.p1 != null) {
                        ViewPropertyAnimator viewPropertyAnimator5 = this.q1;
                        if (viewPropertyAnimator5 != null) {
                            viewPropertyAnimator5.cancel();
                            this.q1 = null;
                        }
                        this.y = 0.0f;
                        z1();
                        i15 = 1;
                        r103 = 0;
                        animatorSet18.playTogether(ObjectAnimator.ofFloat(this.p1, this.a4, 1.0f));
                        ag.r rVar6 = this.r1;
                        this.v1 = 1.0f;
                        animatorSet18.playTogether(ObjectAnimator.ofFloat(rVar6, (Property<ag.r, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.r1, (Property<ag.r, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.r1, (Property<ag.r, Float>) property4, 1.0f));
                    } else {
                        r103 = 0;
                        i15 = 1;
                    }
                    bh.k kVar5 = this.i5;
                    if (kVar5 != 0) {
                        kVar5.e(r103, r103, i15);
                    }
                    de deVar4 = this.J1;
                    if (deVar4 != null) {
                        float[] fArr15 = new float[i15];
                        fArr15[r103] = 1.0f;
                        ObjectAnimator ofFloat19 = ObjectAnimator.ofFloat(deVar4, (Property<de, Float>) property5, fArr15);
                        ValueAnimator l12 = l(0.0f);
                        Animator[] animatorArr12 = new Animator[2];
                        animatorArr12[r103] = ofFloat19;
                        animatorArr12[i15] = l12;
                        animatorSet18.playTogether(animatorArr12);
                    }
                    animatorSet18.setDuration(150L);
                    animatorSet18.setStartDelay(200L);
                    AnimatorSet animatorSet19 = new AnimatorSet();
                    bg bgVar = this.Y0;
                    float[] fArr16 = new float[i15];
                    fArr16[r103] = 0.0f;
                    ObjectAnimator ofFloat20 = ObjectAnimator.ofFloat(bgVar, (Property<bg, Float>) property5, fArr16);
                    bg bgVar2 = this.Y0;
                    float[] fArr17 = new float[i15];
                    fArr17[r103] = org.telegram.messenger.i0.L(40.0f);
                    ObjectAnimator ofFloat21 = ObjectAnimator.ofFloat(bgVar2, (Property<bg, Float>) property2, fArr17);
                    SlideTextView slideTextView3 = this.k1;
                    float[] fArr18 = new float[i15];
                    fArr18[r103] = 0.0f;
                    ObjectAnimator ofFloat22 = ObjectAnimator.ofFloat(slideTextView3, (Property<SlideTextView, Float>) property5, fArr18);
                    SlideTextView slideTextView4 = this.k1;
                    float[] fArr19 = new float[i15];
                    fArr19[r103] = org.telegram.messenger.i0.L(40.0f);
                    ObjectAnimator ofFloat23 = ObjectAnimator.ofFloat(slideTextView4, (Property<SlideTextView, Float>) property2, fArr19);
                    Animator[] animatorArr13 = new Animator[4];
                    animatorArr13[r103] = ofFloat20;
                    animatorArr13[i15] = ofFloat21;
                    animatorArr13[2] = ofFloat22;
                    animatorArr13[3] = ofFloat23;
                    animatorSet19.playTogether(animatorArr13);
                    animatorSet19.setDuration(150L);
                    float[] fArr20 = new float[i15];
                    fArr20[r103] = 1.0f;
                    ObjectAnimator ofFloat24 = ObjectAnimator.ofFloat(this, "exitTransition", fArr20);
                    ofFloat24.setDuration(this.g0 ? 220L : 360L);
                    this.G = 0.0f;
                    I1();
                    ObjectAnimator ofFloat25 = ObjectAnimator.ofFloat(this.E0, (Property<se, Float>) property5, 1.0f);
                    ofFloat25.setStartDelay(this.s == 1.0f ? 150L : 450L);
                    ofFloat25.setDuration(200L);
                    this.t2.playTogether(animatorSet18, animatorSet19, ofFloat25, ofFloat24);
                }
            }
            this.t2.addListener(new af(this, i10));
            this.t2.start();
            bg bgVar3 = this.Y0;
            if (bgVar3 != null) {
                bgVar3.b();
            }
        }
        this.Z2.e();
        O1(true);
        this.Q4 = i10;
    }

    public final void L() {
        org.telegram.messenger.i0.v1(this.E0);
    }

    public boolean L0() {
        return true;
    }

    public final void L1() {
        int e02 = e0(org.telegram.ui.ActionBar.t6.Xf);
        int e03 = e0(org.telegram.ui.ActionBar.t6.Ge);
        int e04 = e0(org.telegram.ui.ActionBar.t6.Sf);
        ei0 ei0Var = this.g1;
        if (ei0Var != null) {
            ei0Var.h(e02, "Cup Red");
            this.g1.h(e02, "Box Red");
            this.g1.h(e04, "Cup Grey");
            this.g1.h(e04, "Box Grey");
            this.g1.h(e04, "Box_Grey 2");
            this.g1.h(e04, "Line 1");
            this.g1.h(e04, "Line 2");
            this.g1.h(e04, "Line 3");
            this.g1.h(e03, "Line 1 Dup");
            this.g1.h(e03, "Line 2 Dup");
            this.g1.h(e03, "Line 3 Dup");
        }
    }

    public final void M() {
        if (this.x1 != null) {
            return;
        }
        fe feVar = new fe(this, getContext(), 1);
        this.x1 = feVar;
        bl0 bl0Var = new bl0(getContext());
        this.U1 = bl0Var;
        feVar.setImageDrawable(bl0Var);
        bl0 bl0Var2 = this.U1;
        int i10 = org.telegram.ui.ActionBar.t6.Kl;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.p6 p6Var = this.W3;
        org.telegram.ui.ActionBar.a7.y(this, bl0Var2, i10, p6Var, mode);
        this.U1.a(R.drawable.input_bot2, false);
        this.x1.setScaleType(ImageView.ScaleType.CENTER);
        fe feVar2 = this.x1;
        int i11 = org.telegram.ui.ActionBar.t6.i6;
        org.telegram.ui.ActionBar.a7.R(feVar2, org.telegram.ui.ActionBar.t6.h0(e0(i11), 1, -1), null, org.telegram.ui.ActionBar.a7.N(i11), p6Var);
        this.x1.setVisibility(8);
        org.telegram.messenger.i0.Y3(this.x1, false, 0.1f, true, false);
        this.p1.addView(this.x1, 0, w7.b6.o(44, 44));
        this.x1.setOnClickListener(new vc(this, 15));
    }

    public final void M0(int i10, int i11, CharSequence charSequence, boolean z10) {
        if (this.E0 == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.E0.getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z10) {
                org.telegram.messenger.k6.m(spannableStringBuilder, this.E0.getPaint().getFontMetricsInt(), false, null, 0);
            }
            this.E0.setText(spannableStringBuilder);
            this.E0.setSelection(i10 + charSequence.length());
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void M1() {
        org.telegram.messenger.lu luVar = this.C1;
        if (luVar == null) {
            return;
        }
        boolean z10 = this.D1;
        boolean z11 = this.E1 != null && this.Z1 == null;
        this.D1 = z11;
        be beVar = this.J0;
        ImageView imageView = this.R0;
        rd rdVar = this.Q0;
        if (z11) {
            luVar.setResourcesProvider(this.W3);
            this.C1.set(this.E1);
            this.C1.setVisibility(0);
            se seVar = this.E0;
            if (seVar != null) {
                seVar.setVisibility(8);
            }
            rdVar.setVisibility(8);
            imageView.setVisibility(0);
            beVar.setLocked(!org.telegram.messenger.d20.i(this.Q).q());
        } else {
            luVar.setVisibility(8);
            se seVar2 = this.E0;
            if (seVar2 != null) {
                seVar2.setVisibility(0);
            }
            rdVar.setVisibility(0);
            imageView.setVisibility(8);
            beVar.setLocked(false);
        }
        D1();
        if (z10 != this.D1) {
            F(true);
        }
    }

    public final void N() {
        if (this.l0 != null) {
            return;
        }
        xh.w wVar = new xh.w(getContext());
        this.l0 = wVar;
        wVar.setOnClickListener(new vc(this, 7));
        this.y1.addView(this.l0, w7.b6.d(-2, 32.0f, 83, 8.0f, 6.0f, 8.0f, 6.0f));
        org.telegram.messenger.i0.Y3(this.l0, false, 1.0f, true, false);
        xh.w wVar2 = this.l0;
        if (!wVar2.f) {
            wVar2.f = true;
            wVar2.h = 1.0f;
            wVar2.requestLayout();
            wVar2.invalidate();
        }
    }

    public final void N0() {
        l1(false, true, false, true);
        r1(0, 0, false, true);
        if (getEditField() != null && !TextUtils.isEmpty(getEditField().getText())) {
            getEditField().setText("");
        }
        this.F2 = false;
        zd zdVar = this.b1;
        if (zdVar != null) {
            zdVar.setVisibility(0);
        }
        this.k2 = true;
        u0();
        w();
        l0();
        wf wfVar = this.O1;
        if (wfVar != null) {
            wfVar.setVisibility(8);
        }
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }

    public final void N1(boolean z10) {
        boolean z11;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z12 = org.telegram.messenger.o5.z(this.Q2);
        ImageView imageView = this.I1;
        if (z12) {
            TLRPC.Chat L0 = org.telegram.messenger.vp.r1(this.R.a).L0(Long.valueOf(-this.Q2));
            this.g2 = org.telegram.messenger.vp.r1(this.Q).e7.getBoolean("silent_" + this.Q2, false);
            z11 = org.telegram.messenger.w3.T(L0) && (L0.creator || ((tL_chatAdminRights = L0.admin_rights) != null && tL_chatAdminRights.post_messages)) && !L0.megagroup;
            this.h2 = z11;
            if (imageView != null) {
                if (this.e0 == null) {
                    this.e0 = new dr(getContext(), R.drawable.input_notify_on, org.telegram.ui.ActionBar.t6.Kl);
                }
                this.e0.a(this.g2, false);
                imageView.setImageDrawable(this.e0);
            } else {
                z11 = false;
            }
            jg.z2 z2Var = this.p1;
            if (z2Var != null) {
                G1(z2Var.getVisibility() == 0 ? 1 : 0);
            }
        } else {
            z11 = false;
        }
        boolean z13 = (this.Z2 == null || c() || !this.Z2.k0()) ? false : true;
        boolean z14 = (!z13 || this.L1 || this.F2) ? false : true;
        if (z14) {
            W();
        }
        de deVar = this.J1;
        if (deVar != null) {
            if ((deVar.getTag() != null && z14) || (this.J1.getTag() == null && !z14)) {
                if (imageView != null) {
                    int i10 = (z13 || !z11 || this.J1.getVisibility() == 0) ? 8 : 0;
                    if (i10 != imageView.getVisibility()) {
                        imageView.setVisibility(i10);
                        return;
                    }
                    return;
                }
                return;
            }
            this.J1.setTag(z14 ? 1 : null);
        } else if (imageView != null) {
            int i11 = (z13 || !z11) ? 8 : 0;
            if (i11 != imageView.getVisibility()) {
                imageView.setVisibility(i11);
            }
        }
        AnimatorSet animatorSet = this.M1;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.M1 = null;
        }
        if (z10 && !z11) {
            de deVar2 = this.J1;
            if (deVar2 != null) {
                if (z14) {
                    deVar2.setVisibility(0);
                }
                this.J1.setPivotX(org.telegram.messenger.i0.L(24.0f));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.M1 = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.J1, (Property<de, Float>) View.ALPHA, z14 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.J1, (Property<de, Float>) View.SCALE_X, z14 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(this.J1, (Property<de, Float>) View.SCALE_Y, z14 ? 1.0f : 0.1f));
                this.M1.setDuration(180L);
                this.M1.addListener(new ge(this, z14, 2));
                this.M1.start();
                return;
            }
            return;
        }
        de deVar3 = this.J1;
        if (deVar3 == null) {
            if (imageView != null) {
                imageView.setVisibility(z11 ? 0 : 8);
                return;
            }
            return;
        }
        deVar3.setVisibility(z14 ? 0 : 8);
        this.J1.setAlpha(z14 ? 1.0f : 0.0f);
        this.J1.setScaleX(z14 ? 1.0f : 0.1f);
        this.J1.setScaleY(z14 ? 1.0f : 0.1f);
        if (imageView != null) {
            imageView.setVisibility((!z11 || this.J1.getVisibility() == 0) ? 8 : 0);
        }
        this.J1.setTranslationX(0.0f);
    }

    public final void O() {
        if (this.b0 != null) {
            return;
        }
        NumberTextView numberTextView = new NumberTextView(getContext());
        this.b0 = numberTextView;
        numberTextView.setVisibility(8);
        this.b0.setTextSize(15);
        this.b0.setTextColor(e0(org.telegram.ui.ActionBar.t6.y6));
        this.b0.setTypeface(org.telegram.messenger.i0.o());
        this.b0.setCenterAlign(true);
        addView(this.b0, Math.min(2, getChildCount()), w7.b6.d(44, 20.0f, 85, 3.0f, 0.0f, 0.0f, 44.0f));
    }

    public final void O0(TL_iv.RichMessage richMessage) {
        org.telegram.ui.un unVar = this.P2;
        if (unVar != null) {
            org.telegram.messenger.ui.b0(this.Q).Q1(unVar.a(), unVar.J7(unVar.D5), "", null, null, null, null, 0L, false, false, richMessage);
        }
        setRichDraftPreview(richMessage);
    }

    public void O1(boolean z10) {
        P1(false, z10);
    }

    public final void P(boolean z10) {
        if (this.F1 != null) {
            return;
        }
        be beVar = new be(this, getContext(), this.W3);
        this.F1 = beVar;
        beVar.setContentDescription(org.telegram.messenger.cd.L0(2131751275, null));
        if (z10) {
            w7.e6.a(this.F1);
        }
        this.z1.addView(this.F1, w7.b6.e(44, 44, 85));
    }

    public final void P0(SpannableStringBuilder spannableStringBuilder, boolean z10, int i10, int i11) {
        if (this.E0 == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        org.telegram.messenger.k6.m(spannableStringBuilder2, this.E0.getPaint().getFontMetricsInt(), false, null, 0);
        o5[] o5VarArr = (o5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), o5.class);
        if (o5VarArr != null) {
            for (o5 o5Var : o5VarArr) {
                o5Var.applyFontMetrics(this.E0.getPaint().getFontMetricsInt(), f5.f());
            }
        }
        wh0.a(spannableStringBuilder2);
        J();
        setFieldText(spannableStringBuilder2);
        R0(z10, i10, i11, 0L, true);
    }

    public final void P1(boolean z10, boolean z11) {
        TLRPC.Chat chat;
        TLRPC.Peer peer;
        float f7;
        float f10;
        do0 do0Var;
        do0 do0Var2;
        pd pdVar;
        if (this.Z2 == null) {
            return;
        }
        S();
        if (this.p5) {
            peer = this.Z2.u();
            chat = null;
        } else {
            TLRPC.Chat L0 = org.telegram.messenger.vp.r1(this.Q).L0(Long.valueOf(-this.Q2));
            TLRPC.ChatFull M0 = org.telegram.messenger.vp.r1(this.Q).M0(-this.Q2);
            TLRPC.Peer peer2 = M0 != null ? M0.default_send_as : null;
            chat = L0;
            peer = peer2;
        }
        if (peer == null && this.Z2.F() != null && !this.Z2.F().peers.isEmpty()) {
            peer = this.Z2.F().peers.get(0).peer;
        }
        org.telegram.ui.un unVar = this.P2;
        boolean z12 = (z10 || peer == null || (this.Z2.F() != null && this.Z2.F().peers.size() <= 1) || o0() || t0() || (((pdVar = this.e1) != null && pdVar.getVisibility() == 0) || ((!this.p5 && ((org.telegram.messenger.w3.V(chat) && !org.telegram.messenger.w3.k(chat)) || org.telegram.messenger.w3.p0(chat))) || (unVar != null && unVar.f4 == 9)))) ? false : true;
        if (z12) {
            X();
        }
        if (peer != null) {
            if (peer.channel_id != 0) {
                TLRPC.Chat L02 = org.telegram.messenger.vp.r1(this.Q).L0(Long.valueOf(peer.channel_id));
                if (L02 != null && (do0Var2 = this.p0) != null) {
                    do0Var2.setAvatar(L02);
                    this.p0.setContentDescription(org.telegram.messenger.cd.a0(null, null, 2131754776, L02.title));
                }
            } else {
                TLRPC.User Z1 = org.telegram.messenger.vp.r1(this.Q).Z1(Long.valueOf(peer.user_id));
                if (Z1 != null && (do0Var = this.p0) != null) {
                    do0Var.setAvatar(Z1);
                    this.p0.setContentDescription(org.telegram.messenger.cd.a0(null, null, 2131754776, org.telegram.messenger.i5.m(0, Z1.first_name, Z1.last_name)));
                }
            }
        }
        do0 do0Var3 = this.p0;
        boolean z13 = do0Var3 != null && do0Var3.getVisibility() == 0;
        int L = org.telegram.messenger.i0.L(2.0f);
        float f11 = z12 ? 0.0f : 1.0f;
        float f12 = z12 ? 1.0f : 0.0f;
        do0 do0Var4 = this.p0;
        if (do0Var4 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) do0Var4.getLayoutParams();
            f10 = z12 ? ((-this.p0.getLayoutParams().width) - marginLayoutParams.leftMargin) - L : 0.0f;
            f7 = z12 ? 0.0f : ((-this.p0.getLayoutParams().width) - marginLayoutParams.leftMargin) - L;
        } else {
            f7 = 0.0f;
            f10 = 0.0f;
        }
        if (z13 == z12) {
            return;
        }
        do0 do0Var5 = this.p0;
        ValueAnimator valueAnimator = do0Var5 == null ? null : (ValueAnimator) do0Var5.getTag();
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.p0.setTag(null);
        }
        if ((this.p5 || (unVar != null && unVar.S8() == 0 && unVar.e6)) && z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            do0 do0Var6 = this.p0;
            if (do0Var6 != null) {
                do0Var6.setTranslationX(f10);
            }
            this.G = f10;
            I1();
            float f13 = f7;
            float f14 = f12;
            float f15 = f10;
            duration.addUpdateListener(new h5(this, f15, f13, f11, f14, 1));
            duration.addListener(new cf(this, z12, f11, f15, f14, f13));
            duration.start();
            do0 do0Var7 = this.p0;
            if (do0Var7 != null) {
                do0Var7.setTag(duration);
                return;
            }
            return;
        }
        float f16 = f7;
        float f17 = f12;
        boolean z14 = z12;
        if (z14) {
            X();
        }
        do0 do0Var8 = this.p0;
        if (do0Var8 != null) {
            do0Var8.setVisibility(z14 ? 0 : 8);
            this.p0.setTranslationX(f16);
        }
        float f18 = z14 ? f16 : 0.0f;
        this.Q0.setTranslationX(f18);
        this.G = f18;
        I1();
        do0 do0Var9 = this.p0;
        if (do0Var9 != null) {
            do0Var9.setAlpha(f17);
            this.p0.setTag(null);
        }
    }

    public final void Q() {
        gf gfVar = this.U0;
        if (gfVar != null && gfVar.c1 != org.telegram.messenger.d20.s0) {
            this.n1.removeView(gfVar);
            this.U0 = null;
        }
        if (this.U0 != null) {
            return;
        }
        gf gfVar2 = new gf(this, this.P2, this.I2, getContext(), this.d2, this.m1, this.y4, this.W3, this.T0, this.h5 != null);
        this.U0 = gfVar2;
        gfVar2.v0 = true;
        if (!this.y4) {
            gfVar2.updateColors();
        }
        this.U0.J(true, this.J2, this.K2, true);
        this.U0.setVisibility(8);
        this.U0.setShowing(false);
        if (this.h5 != null) {
            gf gfVar3 = this.U0;
            gfVar3.w0 = false;
            gfVar3.setShouldDrawBackground(false);
            this.U0.V0 = true;
        }
        this.U0.setDelegate(new lf(this));
        this.U0.setDragListener(new c5.e(this));
        gf gfVar4 = this.U0;
        if (gfVar4 != null) {
            gfVar4.L(-this.Q2, !this.z0, !this.b);
        }
        q();
        A();
    }

    public boolean Q0() {
        boolean z10 = this.D1;
        org.telegram.ui.ActionBar.p6 p6Var = this.W3;
        if (z10 && !org.telegram.messenger.d20.i(this.Q).q()) {
            bi.k2.t0(getContext(), new tc(this, 21), new tc(this, 22), p6Var);
            return true;
        }
        if (!c()) {
            return R0(true, 0, 0, 0L, true);
        }
        s4.L(this.O2, this.P2.a(), new he(this), p6Var);
        return true;
    }

    public final void Q1() {
        int b10;
        long starsPrice = getStarsPrice();
        if (starsPrice > 0) {
            starsPrice *= getMessagesCount();
        }
        if (this.u4 != starsPrice) {
            View sendButtonInternal = getSendButtonInternal();
            this.u4 = starsPrice;
            View sendButtonInternal2 = getSendButtonInternal();
            if (sendButtonInternal != sendButtonInternal2) {
                sendButtonInternal2.setVisibility(sendButtonInternal.getVisibility());
                sendButtonInternal2.setAlpha(sendButtonInternal.getAlpha());
                sendButtonInternal2.setScaleX(sendButtonInternal.getScaleX());
                sendButtonInternal2.setScaleY(sendButtonInternal.getScaleY());
                sendButtonInternal.setVisibility(8);
            }
            this.J0.i(1, starsPrice, true);
            G1(this.P4);
        }
        if (this.p5) {
            O();
            if (p()) {
                int[] iArr = org.telegram.messenger.vp.r1(this.Q).Y6;
                b10 = (iArr == null || iArr.length <= 2) ? 400 : iArr[2];
            } else {
                b10 = th.o.b(this.Q, (int) starsPrice, 1);
            }
            if (this.c0 != b10) {
                this.c0 = b10;
                if (b10 > 0) {
                    int i10 = b10 - this.d0;
                    if (i10 <= (this.p5 ? 5 : 100)) {
                        if (i10 < -9999) {
                            i10 = -9999;
                        }
                        O();
                        NumberTextView numberTextView = this.b0;
                        numberTextView.a(i10, numberTextView.getVisibility() == 0);
                        if (this.b0.getVisibility() != 0) {
                            this.b0.setVisibility(0);
                            this.b0.setAlpha(0.0f);
                            this.b0.setScaleX(0.5f);
                            this.b0.setScaleY(0.5f);
                        }
                        this.b0.animate().setListener(null).cancel();
                        this.b0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                        this.b0.setTextColor(e0(i10 < 0 ? org.telegram.ui.ActionBar.t6.p7 : org.telegram.ui.ActionBar.t6.y6));
                        return;
                    }
                }
                NumberTextView numberTextView2 = this.b0;
                if (numberTextView2 != null) {
                    numberTextView2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new ce(this, 0));
                }
            }
        }
    }

    public final void R() {
        if (this.S0 != null) {
            return;
        }
        fe feVar = new fe(this, getContext(), 2);
        this.S0 = feVar;
        feVar.setScaleType(ImageView.ScaleType.CENTER);
        fe feVar2 = this.S0;
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(e0(org.telegram.ui.ActionBar.t6.Kl), false);
        this.F3 = animatedArrowDrawable;
        feVar2.setImageDrawable(animatedArrowDrawable);
        this.S0.setVisibility(8);
        this.S0.setScaleX(0.1f);
        this.S0.setScaleY(0.1f);
        this.S0.setAlpha(0.0f);
        fe feVar3 = this.S0;
        int i10 = org.telegram.ui.ActionBar.t6.i6;
        org.telegram.ui.ActionBar.a7.R(feVar3, org.telegram.ui.ActionBar.t6.h0(e0(i10), 1, -1), null, org.telegram.ui.ActionBar.a7.N(i10), this.W3);
        this.A1.addView(this.S0, w7.b6.e(44, 44, 85));
        this.S0.setOnClickListener(new vc(this, 5));
        this.S0.setContentDescription(org.telegram.messenger.cd.L0(2131754883, "AccDescrExpandPanel"));
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
    /* JADX WARN: Type inference failed for: r3v6, types: [org.telegram.messenger.jj, org.telegram.tgnet.TLRPC$WebPage] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean R0(final boolean z10, final int i10, final int i11, long j10, boolean z11) {
        ChatActivityEnterView chatActivityEnterView;
        ChatActivityEnterView chatActivityEnterView2;
        boolean z12;
        int i12;
        int i13;
        int i14;
        int i15;
        CharSequence charSequence;
        CharSequence charSequence2;
        int i16;
        CharSequence charSequence3;
        org.telegram.messenger.fj fjVar;
        org.telegram.messenger.jj threadMessage;
        String str;
        int i17;
        CharSequence charSequence4;
        CharSequence charSequence5;
        org.telegram.ui.un unVar;
        ?? r32;
        TLRPC.WebPage webPage;
        boolean z13;
        org.telegram.messenger.nj njVar;
        org.telegram.messenger.nj njVar2;
        ChatActivityEnterView chatActivityEnterView3;
        TLRPC.Chat chat;
        org.telegram.messenger.nj njVar3;
        org.telegram.messenger.jj jjVar;
        sf sfVar;
        TLRPC.Chat chat2;
        TL_iv.RichMessage richMessage;
        ChatActivityEnterView chatActivityEnterView4;
        gf gfVar;
        int i18 = 1;
        ?? r02 = z11 && !this.m5.f;
        if (r02 == true) {
            boolean a02 = s4.a0(this.Q, this.Q2, getMessagesCount(), new org.telegram.messenger.q20() { // from class: org.telegram.ui.Components.kd
                @Override // org.telegram.messenger.q20
                public final void a(Object obj) {
                    int i19 = ChatActivityEnterView.s5;
                    ChatActivityEnterView chatActivityEnterView5 = ChatActivityEnterView.this;
                    chatActivityEnterView5.getClass();
                    chatActivityEnterView5.R0(z10, i10, i11, ((Long) obj).longValue(), false);
                }
            }, j10);
            if (a02 && this.s4) {
                if (this.c1) {
                    if (!this.Z2.T0()) {
                        SlideTextView slideTextView = this.k1;
                        if (slideTextView != null) {
                            slideTextView.setEnabled(false);
                        }
                        this.Z2.X0();
                        return a02;
                    }
                } else if (!MediaController.B().K()) {
                    if (this.s4) {
                        this.J3 = true;
                    }
                    MediaController.B().D0(this.O);
                    this.Z2.G0(0);
                    SlideTextView slideTextView2 = this.k1;
                    if (slideTextView2 != null) {
                        slideTextView2.setEnabled(false);
                    }
                }
            }
            return a02;
        }
        if (this.G0 != Integer.MAX_VALUE || c()) {
            org.telegram.ui.un unVar2 = this.P2;
            if (unVar2 != null) {
                TLRPC.Chat chat3 = unVar2.e;
                if (unVar2.j() != null || ((org.telegram.messenger.w3.T(chat3) && chat3.megagroup) || !org.telegram.messenger.w3.T(chat3))) {
                    org.telegram.messenger.vp.r1(this.Q).e7.edit().putBoolean("silent_" + this.Q2, !z10).commit();
                }
            }
            if (this.z3) {
                l1(false, true, false, true);
                if (this.R1 != 0 && (gfVar = this.U0) != null) {
                    gfVar.t(false);
                    this.U0.B();
                }
            }
            if (r02 == true) {
                chatActivityEnterView = this;
                if (chatActivityEnterView.p1(new org.telegram.messenger.pj(this, z10, i10, i11, j10))) {
                    chatActivityEnterView2 = chatActivityEnterView;
                }
            } else {
                chatActivityEnterView = this;
            }
            chatActivityEnterView.E4 = true;
            org.telegram.messenger.x20 x20Var = chatActivityEnterView.e3;
            be beVar = chatActivityEnterView.J0;
            if (x20Var != null) {
                chatActivityEnterView.Z2.V1(4, i10, chatActivityEnterView.O ? Integer.MAX_VALUE : 0, chatActivityEnterView.S4, j10, z10);
                chatActivityEnterView.S4 = 0L;
                beVar.setEffect(0L);
                chatActivityEnterView.k0(true);
                chatActivityEnterView.F(true);
                org.telegram.messenger.i0.h3(new tc(chatActivityEnterView, i18), 100L);
                chatActivityEnterView.i1 = 0L;
                return false;
            }
            if (chatActivityEnterView.b3 != null) {
                org.telegram.messenger.jj jjVar2 = MediaController.B().u0;
                if (jjVar2 != null && jjVar2 == chatActivityEnterView.d3) {
                    MediaController.B().q(true, true, false, false);
                }
                MediaController.B().n(false);
                org.telegram.messenger.ui.b0(chatActivityEnterView.Q).B1(chatActivityEnterView.Q2, (unVar2 == null || !unVar2.v4) ? 0L : unVar2.b(), null);
                nj0 nj0Var = chatActivityEnterView.h1;
                if (nj0Var != null && (nj0Var.s > 0.0f || nj0Var.w < 1.0f)) {
                    nj0Var.setPlaying(false);
                    String r10 = a1.g.r(new StringBuilder(), chatActivityEnterView.c3, ".ogg");
                    if (MediaController.cropOpusFile(chatActivityEnterView.c3, r10, chatActivityEnterView.h1.getAudioLeftMs(), chatActivityEnterView.h1.getAudioRightMs())) {
                        try {
                            new File(chatActivityEnterView.c3).delete();
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                        }
                        try {
                            new File(r10).renameTo(new File(chatActivityEnterView.c3));
                        } catch (Exception e7) {
                            org.telegram.messenger.f8.g(e7, true);
                        }
                        int i19 = 0;
                        while (true) {
                            if (i19 >= chatActivityEnterView.b3.attributes.size()) {
                                break;
                            }
                            TLRPC.DocumentAttribute documentAttribute = chatActivityEnterView.b3.attributes.get(i19);
                            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                documentAttribute.waveform = MediaController.getWaveform(chatActivityEnterView.c3);
                                documentAttribute.duration = chatActivityEnterView.h1.getNewDuration();
                                break;
                            }
                            i19++;
                        }
                    }
                }
                org.telegram.messenger.oz f7 = org.telegram.messenger.oz.f(chatActivityEnterView.b3, null, chatActivityEnterView.c3, chatActivityEnterView.Q2, chatActivityEnterView.T2, chatActivityEnterView.getThreadMessage(), null, null, null, null, z10, i10, 0, chatActivityEnterView.O ? Integer.MAX_VALUE : 0, null, null, false);
                f7.K = unVar2 != null ? unVar2.P8() : null;
                f7.O = this.S4;
                f7.Q = j10;
                f7.R = getSendMonoForumPeerId();
                f7.T = getSendMessageSuggestionParams();
                this.S4 = 0L;
                beVar.setEffect(0L);
                if (!this.Z2.h1()) {
                    org.telegram.messenger.fj fjVar2 = new org.telegram.messenger.fj();
                    fjVar2.h = System.currentTimeMillis() - this.M0 < 200;
                    f7.E = fjVar2;
                }
                o(f7);
                org.telegram.messenger.qz.C(this.Q).r0(f7);
                sf sfVar2 = this.Z2;
                if (sfVar2 != null) {
                    chatActivityEnterView4 = this;
                    sfVar2.E(null, z10, i10, i11, j10);
                } else {
                    chatActivityEnterView4 = this;
                }
                chatActivityEnterView4.k0(true);
                chatActivityEnterView4.F(true);
                org.telegram.messenger.i0.h3(new tc(chatActivityEnterView4, 2), 100L);
                chatActivityEnterView4.i1 = 0L;
            } else {
                ChatActivityEnterView chatActivityEnterView5 = chatActivityEnterView;
                long j11 = 200;
                String str2 = "";
                if (!chatActivityEnterView5.D1 || (richMessage = chatActivityEnterView5.E1) == null) {
                    org.telegram.ui.un unVar3 = unVar2;
                    int i20 = 1;
                    be beVar2 = beVar;
                    chatActivityEnterView2 = chatActivityEnterView5;
                    se seVar = chatActivityEnterView2.E0;
                    CharSequence textToUse = seVar == null ? "" : seVar.getTextToUse();
                    if (unVar3 != null && (chat2 = unVar3.e) != null && chat2.slowmode_enabled && !org.telegram.messenger.w3.N(chat2)) {
                        int length = textToUse.length();
                        int t12 = org.telegram.messenger.vp.r1(chatActivityEnterView2.R.a).t1();
                        org.telegram.ui.ActionBar.p6 p6Var = chatActivityEnterView2.W3;
                        if (length > t12) {
                            s4.t0(unVar3, org.telegram.messenger.cd.L0(2131745328, "Slowmode"), org.telegram.messenger.cd.L0(2131745319, "SlowmodeSendErrorTooLong"), p6Var);
                        } else if (chatActivityEnterView2.H2 && textToUse.length() > 0) {
                            s4.t0(unVar3, org.telegram.messenger.cd.L0(2131745328, "Slowmode"), org.telegram.messenger.cd.L0(2131745320, "SlowmodeSendError"), p6Var);
                        }
                    }
                    if (!C(chatActivityEnterView2.Q, chatActivityEnterView2.Q2, unVar3, textToUse)) {
                        org.telegram.ui.kn knVar = chatActivityEnterView2.V2;
                        if (knVar == null || unVar3 == null || !knVar.f) {
                            int[] iArr = new int[1];
                            org.telegram.messenger.k6.j(textToUse, iArr);
                            ?? r28 = 0;
                            ?? r17 = iArr[0] > 0;
                            CharSequence n12 = r17 == false ? org.telegram.messenger.i0.n1(textToUse) : textToUse;
                            boolean x12 = chatActivityEnterView2.x1();
                            int t13 = org.telegram.messenger.vp.r1(chatActivityEnterView2.R.a).t1();
                            if (n12.length() != 0) {
                                if (chatActivityEnterView2.Z2 != null && unVar3 != null) {
                                    if ((i10 != 0) == unVar3.c()) {
                                        chatActivityEnterView2.Z2.n0();
                                    }
                                }
                                int i21 = 0;
                                while (true) {
                                    int i22 = i21 + t13;
                                    if (n12.length() > i22) {
                                        int i23 = i22 - 1;
                                        i13 = -1;
                                        i14 = -1;
                                        i15 = -1;
                                        for (int i24 = r28; i23 > i21 && i24 < 300; i24++) {
                                            char charAt = n12.charAt(i23);
                                            char charAt2 = i23 > 0 ? n12.charAt(i23 - 1) : ' ';
                                            if (charAt == '\n' && charAt2 == '\n') {
                                                i12 = i23;
                                                break;
                                            }
                                            if (charAt == '\n') {
                                                i15 = i23;
                                            } else if (i13 < 0 && Character.isWhitespace(charAt) && charAt2 == '.') {
                                                i13 = i23;
                                            } else if (i14 < 0 && Character.isWhitespace(charAt)) {
                                                i14 = i23;
                                            }
                                            i23--;
                                        }
                                        i12 = -1;
                                    } else {
                                        i12 = -1;
                                        i13 = -1;
                                        i14 = -1;
                                        i15 = -1;
                                    }
                                    int min = Math.min(i22, n12.length());
                                    if (i12 > 0) {
                                        min = i12;
                                    } else if (i15 > 0) {
                                        min = i15;
                                    } else if (i13 > 0) {
                                        min = i13;
                                    } else if (i14 > 0) {
                                        min = i14;
                                    }
                                    CharSequence subSequence = n12.subSequence(i21, min);
                                    if (r17 == false) {
                                        subSequence = org.telegram.messenger.i0.n1(subSequence);
                                    }
                                    CharSequence[] charSequenceArr = new CharSequence[i20];
                                    charSequenceArr[r28] = subSequence;
                                    ArrayList W = org.telegram.messenger.ui.b0(chatActivityEnterView2.Q).W(charSequenceArr, x12, i20);
                                    if (chatActivityEnterView2.Z2.h1()) {
                                        boolean z14 = i20;
                                        charSequence = n12;
                                        if (chatActivityEnterView2.L0 != null) {
                                            fjVar = new org.telegram.messenger.fj();
                                            charSequence2 = textToUse;
                                            i16 = min;
                                            fjVar.h = System.currentTimeMillis() - chatActivityEnterView2.M0 < j11 ? z14 : r28;
                                        } else {
                                            charSequence2 = textToUse;
                                            i16 = min;
                                            charSequence3 = charSequence;
                                            fjVar = null;
                                            boolean h = org.telegram.messenger.qz.h(charSequence3);
                                            threadMessage = chatActivityEnterView2.getThreadMessage();
                                            if (threadMessage == null && (jjVar = chatActivityEnterView2.U2) != null) {
                                                threadMessage = jjVar;
                                            }
                                            str = str2;
                                            be beVar3 = beVar2;
                                            i17 = i16;
                                            charSequence4 = charSequence2;
                                            boolean z15 = x12;
                                            charSequence5 = charSequence3;
                                            unVar = unVar3;
                                            org.telegram.messenger.oz b10 = org.telegram.messenger.oz.b(charSequenceArr[r28].toString(), chatActivityEnterView2.Q2, chatActivityEnterView2.T2, threadMessage, chatActivityEnterView2.X2, chatActivityEnterView2.Y2, W, null, null, z10, i10, i11, fjVar, h);
                                            b10.K = unVar == null ? unVar.P8() : null;
                                            b10.O = this.S4;
                                            b10.Q = j10;
                                            b10.R = getSendMonoForumPeerId();
                                            b10.T = getSendMessageSuggestionParams();
                                            this.S4 = 0L;
                                            beVar3.setEffect(0L);
                                            o(b10);
                                            b10.L = unVar == null && (njVar3 = unVar.v5) != null && njVar3.r;
                                            if (unVar != null || (chat = unVar.e) == null || org.telegram.messenger.w3.m(chat)) {
                                                r32 = 0;
                                                r32 = 0;
                                                r32 = 0;
                                                z12 = false;
                                                webPage = this.X2;
                                                if (webPage instanceof TLRPC.TL_webPagePending) {
                                                    z13 = true;
                                                    if (webPage != null) {
                                                        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                                                        b10.n = tL_messageMediaWebPage;
                                                        tL_messageMediaWebPage.webpage = this.X2;
                                                        tL_messageMediaWebPage.force_large_media = (unVar == null || (njVar2 = unVar.v5) == null || njVar2.q) ? false : true;
                                                        tL_messageMediaWebPage.force_small_media = (unVar == null || (njVar = unVar.v5) == null || !njVar.q) ? false : true;
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
                                            if (unVar != null) {
                                                unVar.F5 = r32;
                                                unVar.W5 = r32;
                                                org.telegram.messenger.nj njVar4 = unVar.v5;
                                                if (njVar4 != null) {
                                                    njVar4.e(this.Q, null, "", null, null, null);
                                                }
                                                this.X2 = r32;
                                                this.Y2 = z13;
                                                unVar.s8();
                                            }
                                            org.telegram.messenger.qz.C(this.Q).r0(b10);
                                            i21 = i17 + 1;
                                            if (i17 != charSequence5.length()) {
                                                break;
                                            }
                                            beVar2 = beVar3;
                                            i20 = z13;
                                            r28 = z12;
                                            unVar3 = unVar;
                                            textToUse = charSequence4;
                                            x12 = z15;
                                            n12 = charSequence5;
                                            str2 = str;
                                            j11 = 200;
                                            chatActivityEnterView2 = this;
                                        }
                                    } else {
                                        org.telegram.messenger.fj fjVar3 = new org.telegram.messenger.fj();
                                        ?? r27 = i20;
                                        charSequence = n12;
                                        fjVar3.h = System.currentTimeMillis() - chatActivityEnterView2.M0 < j11 ? r27 == true ? 1 : 0 : r28;
                                        fjVar3.c = org.telegram.messenger.i0.L(22.0f);
                                        se seVar2 = chatActivityEnterView2.E0;
                                        if (seVar2 != null) {
                                            seVar2.getLocationInWindow(chatActivityEnterView2.N2);
                                            fjVar3.a = org.telegram.messenger.i0.L(11.0f) + r12[r28];
                                            fjVar3.b = org.telegram.messenger.i0.L(19.0f) + r12[r27 == true ? 1 : 0];
                                        } else {
                                            fjVar3.a = org.telegram.messenger.i0.L(55.0f);
                                            fjVar3.b = org.telegram.messenger.i0.q.y - org.telegram.messenger.i0.L(19.0f);
                                        }
                                        charSequence2 = textToUse;
                                        i16 = min;
                                        fjVar = fjVar3;
                                    }
                                    charSequence3 = charSequence;
                                    boolean h10 = org.telegram.messenger.qz.h(charSequence3);
                                    threadMessage = chatActivityEnterView2.getThreadMessage();
                                    if (threadMessage == null) {
                                        threadMessage = jjVar;
                                    }
                                    str = str2;
                                    be beVar32 = beVar2;
                                    i17 = i16;
                                    charSequence4 = charSequence2;
                                    boolean z152 = x12;
                                    charSequence5 = charSequence3;
                                    unVar = unVar3;
                                    org.telegram.messenger.oz b102 = org.telegram.messenger.oz.b(charSequenceArr[r28].toString(), chatActivityEnterView2.Q2, chatActivityEnterView2.T2, threadMessage, chatActivityEnterView2.X2, chatActivityEnterView2.Y2, W, null, null, z10, i10, i11, fjVar, h10);
                                    b102.K = unVar == null ? unVar.P8() : null;
                                    b102.O = this.S4;
                                    b102.Q = j10;
                                    b102.R = getSendMonoForumPeerId();
                                    b102.T = getSendMessageSuggestionParams();
                                    this.S4 = 0L;
                                    beVar32.setEffect(0L);
                                    o(b102);
                                    b102.L = unVar == null && (njVar3 = unVar.v5) != null && njVar3.r;
                                    if (unVar != null) {
                                    }
                                    r32 = 0;
                                    r32 = 0;
                                    r32 = 0;
                                    z12 = false;
                                    webPage = this.X2;
                                    if (webPage instanceof TLRPC.TL_webPagePending) {
                                    }
                                    if (unVar != null) {
                                    }
                                    org.telegram.messenger.qz.C(this.Q).r0(b102);
                                    i21 = i17 + 1;
                                    if (i17 != charSequence5.length()) {
                                    }
                                }
                                if (this.Z2.h1() || (!(i10 == 0 || c()) || c())) {
                                    chatActivityEnterView3 = this;
                                    se seVar3 = chatActivityEnterView3.E0;
                                    if (seVar3 != null) {
                                        seVar3.setText(str);
                                    }
                                    sf sfVar3 = chatActivityEnterView3.Z2;
                                    if (sfVar3 != null) {
                                        sfVar3.E(charSequence4, z10, i10, i11, j10);
                                    }
                                } else {
                                    this.g0 = z12;
                                    org.telegram.messenger.wp wpVar = new org.telegram.messenger.wp(this, charSequence4, z10, i10, i11, j10);
                                    chatActivityEnterView3 = this;
                                    chatActivityEnterView3.f0 = wpVar;
                                    org.telegram.messenger.i0.h3(wpVar, 200L);
                                }
                                chatActivityEnterView3.C2 = 0L;
                                chatActivityEnterView3.Q1();
                                return z12;
                            }
                            z12 = false;
                        } else {
                            unVar3.kc();
                            z12 = false;
                        }
                        chatActivityEnterView3 = chatActivityEnterView2;
                        if (chatActivityEnterView3.H2 && (sfVar = chatActivityEnterView3.Z2) != null) {
                            sfVar.E(null, z10, i10, i11, j10);
                        }
                        chatActivityEnterView3.Q1();
                        return z12;
                    }
                } else {
                    org.telegram.messenger.qz.R(chatActivityEnterView5.R, richMessage.blocks, richMessage.photos, richMessage.documents, null, chatActivityEnterView5.Q2, chatActivityEnterView5.T2, chatActivityEnterView5.getThreadMessage(), chatActivityEnterView5.V2, z10, i10, i11, unVar2 != null ? unVar2.P8() : null, chatActivityEnterView5.S4, chatActivityEnterView5.getSendMonoForumPeerId(), j10);
                    chatActivityEnterView2 = this;
                    chatActivityEnterView2.S4 = 0L;
                    beVar.setEffect(0L);
                    chatActivityEnterView2.E0.setText("");
                    chatActivityEnterView2.J();
                    sf sfVar4 = chatActivityEnterView2.Z2;
                    if (sfVar4 != null) {
                        sfVar4.E(null, z10, i10, i11, j10);
                    }
                    chatActivityEnterView2.F(true);
                }
            }
        } else {
            sf sfVar5 = this.Z2;
            if (sfVar5 != null) {
                sfVar5.v0();
                return false;
            }
            chatActivityEnterView2 = this;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
    
        if (((java.lang.Integer) org.telegram.messenger.qz.C(r9.Q).f.g(0, r9.Q2)).intValue() > 0) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R1() {
        int i10;
        int currentTime = ConnectionsManager.getInstance(this.Q).getCurrentTime();
        org.telegram.messenger.i0.r(this.H0);
        this.H0 = null;
        TLRPC.ChatFull chatFull = this.d2;
        if (chatFull != null && chatFull.slowmode_seconds != 0 && chatFull.slowmode_next_send_date <= currentTime) {
            boolean z10 = ((Integer) org.telegram.messenger.qz.C(this.Q).h.g(0, this.Q2)).intValue() > 0;
            if (!z10) {
            }
            if (!org.telegram.messenger.w3.N(org.telegram.messenger.vp.r1(this.R.a).L0(Long.valueOf(this.d2.id))) && !org.telegram.messenger.w3.i0(this.d2)) {
                i10 = this.d2.slowmode_seconds;
                this.G0 = z10 ? ConnectionsManager.DEFAULT_DATACENTER_ID : 2147483646;
                if (this.G0 != 0 || i10 <= 0) {
                    this.G0 = 0;
                } else {
                    String h02 = org.telegram.messenger.i0.h0(Math.max(1, i10), false);
                    ag agVar = this.F0;
                    ((org.telegram.ui.ActionBar.u5) agVar.c).l(h02, false);
                    agVar.invalidate();
                    sf sfVar = this.Z2;
                    if (sfVar != null) {
                        sfVar.e1(agVar, ((org.telegram.ui.ActionBar.u5) agVar.c).getText(), false);
                    }
                    tc tcVar = new tc(this, 10);
                    this.H0 = tcVar;
                    org.telegram.messenger.i0.h3(tcVar, 100L);
                }
                if (c()) {
                    F(true);
                    return;
                }
                return;
            }
            i10 = 0;
            if (this.G0 != 0) {
            }
            this.G0 = 0;
            if (c()) {
            }
        }
        int i11 = this.G0;
        if (i11 >= 2147483646) {
            if (this.d2 != null) {
                org.telegram.messenger.vp.r1(this.R.a).T2(0, this.d2.id, true);
            }
            i10 = 0;
            if (this.G0 != 0) {
            }
            this.G0 = 0;
            if (c()) {
            }
        } else {
            i10 = i11 - currentTime;
            if (this.G0 != 0) {
            }
            this.G0 = 0;
            if (c()) {
            }
        }
    }

    public final void S() {
        if (this.E0 != null) {
            return;
        }
        Context context = getContext();
        org.telegram.ui.ActionBar.p6 p6Var = this.W3;
        se seVar = new se(this, context, p6Var);
        this.E0 = seVar;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            seVar.setFallbackLineSpacing(false);
        }
        if (i10 >= 35) {
            this.E0.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        this.E0.setDelegate(new dd(this));
        org.telegram.ui.un unVar = this.P2;
        if (unVar == null || unVar.getParentLayout() == null || !((ActionBarLayout) unVar.getParentLayout()).b) {
            this.E0.setWindowView(this.O2.getWindow().getDecorView());
        } else {
            this.E0.setWindowView(unVar.getParentLayout().getWindow().getDecorView());
        }
        TLRPC.EncryptedChat encryptedChat = unVar != null ? unVar.h : null;
        this.E0.setAllowTextEntitiesIntersection(x1());
        String string = Settings.Secure.getString(getContext().getContentResolver(), "default_input_method");
        int i11 = ((string == null || !string.startsWith("com.samsung")) && encryptedChat != null) ? 285212672 : TLObject.FLAG_28;
        this.E0.setIncludeFontPadding(false);
        this.E0.setImeOptions(i11);
        se seVar2 = this.E0;
        int inputType = seVar2.getInputType() | 147456;
        this.a = inputType;
        seVar2.setInputType(inputType);
        F1(false);
        this.E0.setSingleLine(false);
        this.E0.setMaxLines(6);
        this.E0.setTextSize(1, 18.0f);
        this.E0.setGravity(80);
        this.E0.setPadding(0, org.telegram.messenger.i0.L(9.0f), 0, org.telegram.messenger.i0.L(10.0f));
        this.E0.setBackgroundDrawable(null);
        org.telegram.ui.ActionBar.a7.V(this.E0, org.telegram.ui.ActionBar.t6.Ie, p6Var);
        org.telegram.ui.ActionBar.a7.H(this.E0, org.telegram.ui.ActionBar.t6.Vc, p6Var);
        org.telegram.ui.ActionBar.a7.D(this.E0, org.telegram.ui.ActionBar.t6.ig, p6Var);
        se seVar3 = this.E0;
        int i12 = org.telegram.ui.ActionBar.t6.Je;
        org.telegram.ui.ActionBar.a7.B(seVar3, i12, p6Var);
        org.telegram.ui.ActionBar.a7.E(this.E0, i12, p6Var);
        org.telegram.ui.ActionBar.a7.w(this.E0, org.telegram.ui.ActionBar.t6.Ke, p6Var);
        org.telegram.ui.ActionBar.a7.z(this.E0, org.telegram.ui.ActionBar.t6.jg, p6Var);
        se seVar4 = this.E0;
        boolean z10 = this.X3;
        FrameLayout.LayoutParams d = w7.b6.d(-1, -2.0f, 80, 52.0f, 0.0f, z10 ? 50.0f : 2.0f, 1.5f);
        pd pdVar = this.y1;
        pdVar.addView(seVar4, 1, d);
        org.telegram.messenger.lu luVar = new org.telegram.messenger.lu(this.Q, getContext(), p6Var);
        this.C1 = luVar;
        luVar.setAllowActions(false);
        this.C1.setMaxHeight(org.telegram.messenger.i0.L(150.0f));
        this.C1.setMinHeight(org.telegram.messenger.i0.L(88.0f));
        this.C1.setVisibility(8);
        this.C1.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(10.0f));
        this.C1.setOnClickListener(new vc(this, 10));
        pdVar.addView(this.C1, 2, w7.b6.d(-1, -2.0f, 80, 44.0f, 0.0f, (z10 ? 50 : 2) - 8, 1.5f));
        this.E0.setOnKeyListener(new te(this));
        this.E0.setOnEditorActionListener(new m.s2(this, 3));
        this.E0.addTextChangedListener(new ue(this));
        this.E0.addTextChangedListener(new org.telegram.ui.Cells.l3());
        this.E0.setEnabled(this.I4);
        ArrayList arrayList = this.H4;
        if (arrayList != null) {
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                this.E0.addTextChangedListener((TextWatcher) obj);
            }
            this.H4.clear();
        }
        F1(false);
        O1(unVar != null && unVar.getFragmentBeginToShow());
        if (unVar != null) {
            unVar.H6(false, false);
        }
        G1(this.P4);
    }

    public final void S0(boolean z10, boolean z11) {
        T0(z10, z11, false);
    }

    public final void T() {
        if (this.e1 != null) {
            return;
        }
        pd pdVar = new pd(this, getContext(), 3);
        this.e1 = pdVar;
        pdVar.setVisibility(this.b3 == null ? 8 : 0);
        this.e1.setFocusable(true);
        this.e1.setFocusableInTouchMode(true);
        this.e1.setClickable(true);
        this.y1.addView(this.e1, w7.b6.e(-1, 44, 80));
        ei0 ei0Var = new ei0(getContext());
        this.g1 = ei0Var;
        ei0Var.setScaleType(ImageView.ScaleType.CENTER);
        this.g1.f(R.raw.chat_audio_record_delete_2, 28, 28, null);
        this.g1.getAnimatedDrawable().o0 = true;
        L1();
        this.g1.setContentDescription(org.telegram.messenger.cd.L0(2131751599, "Delete"));
        ei0 ei0Var2 = this.g1;
        int i10 = org.telegram.ui.ActionBar.t6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(e0(i10), 1, -1);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
        org.telegram.ui.ActionBar.p6 p6Var = this.W3;
        org.telegram.ui.ActionBar.a7.R(ei0Var2, h02, null, N, p6Var);
        this.e1.addView(this.g1, w7.b6.c(44.0f, 44));
        this.g1.setOnClickListener(new vc(this, 6));
        j71 j71Var = new j71(getContext());
        this.f1 = j71Var;
        j71Var.setVisibility(4);
        j71 j71Var2 = this.f1;
        j71Var2.S = !this.y4;
        j71Var2.setRoundFrames(true);
        this.f1.setDelegate(new he(this));
        this.e1.addView(this.f1, w7.b6.d(-1, -1.0f, 19, 56.0f, 0.0f, 8.0f, 0.0f));
        Context context = getContext();
        h71 h71Var = new h71(context);
        TextPaint textPaint = new TextPaint(1);
        h71Var.d = textPaint;
        h71Var.e = -1L;
        textPaint.setTextSize(org.telegram.messenger.i0.L(14.0f));
        h71Var.b = context.getDrawable(R.drawable.tooltip_arrow);
        h71Var.a = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(5.0f), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.eg, false));
        h71Var.b();
        h71Var.setTime(0);
        this.f1.setTimeHintView(h71Var);
        this.m1.addView(h71Var, w7.b6.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 52.0f));
        nj0 nj0Var = new nj0(getContext(), p6Var);
        this.h1 = nj0Var;
        this.e1.addView(nj0Var, w7.b6.d(-1, 32.0f, 19, 44.0f, 0.0f, 4.0f, 0.0f));
        G1(this.P4);
    }

    public final void T0(boolean z10, boolean z11, boolean z12) {
        if ((this.J2 != z10 || this.K2 != z11) && this.U0 != null) {
            if (this.W0 && !z12) {
                this.G3 = true;
                i0(false);
            } else if (z12) {
                G0();
            }
        }
        this.I2 = true;
        this.J2 = z10;
        this.K2 = z11;
        gf gfVar = this.U0;
        if (gfVar != null) {
            gfVar.J(true, z10, z11, true);
        }
        b1(false, !this.j2);
    }

    public final void U() {
        wf wfVar = this.O1;
        uu0 uu0Var = this.m1;
        if (wfVar == null) {
            wf wfVar2 = new wf(this, getContext());
            this.O1 = wfVar2;
            wfVar2.setVisibility(8);
            uu0Var.addView(this.O1, w7.b6.e(-1, -2, 80));
        }
        if (this.N1 != null) {
            return;
        }
        RecordCircle recordCircle = new RecordCircle(getContext());
        this.N1 = recordCircle;
        recordCircle.setVisibility(8);
        uu0Var.addView(this.N1, w7.b6.e(-1, -2, 80));
    }

    public final void U0() {
        vh.p2 p2Var = this.L;
        if (p2Var == null) {
            return;
        }
        p2Var.s(org.telegram.messenger.k6.o(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131743788, org.telegram.messenger.h20.j(this.P2.j(), true))), this.L.getTextPaint().getFontMetricsInt(), 20, new tc(this, 27)));
        vh.p2 p2Var2 = this.L;
        p2Var2.h = vh.p2.a(p2Var2.getText(), this.L.getTextPaint());
    }

    public final void V() {
        if (this.d1 != null || getContext() == null) {
            return;
        }
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(getContext(), 17);
        this.d1 = a5Var;
        a5Var.setClipChildren(false);
        this.d1.setVisibility(8);
        this.y1.addView(this.d1, w7.b6.c(44.0f, -1));
        this.d1.setOnTouchListener(new org.telegram.ui.ActionBar.n2(11));
        org.telegram.ui.Cells.a5 a5Var2 = this.d1;
        SlideTextView slideTextView = new SlideTextView(getContext());
        this.k1 = slideTextView;
        a5Var2.addView(slideTextView, w7.b6.d(-1, -1.0f, 0, 45.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(0);
        this.d.setPadding(org.telegram.messenger.i0.L(13.0f), 0, 0, 0);
        this.d.setFocusable(false);
        LinearLayout linearLayout2 = this.d;
        yf yfVar = new yf(this, getContext());
        this.l1 = yfVar;
        linearLayout2.addView(yfVar, w7.b6.t(28, 28, 16, 0, 0, 0, 0));
        LinearLayout linearLayout3 = this.d;
        bg bgVar = new bg(this, getContext());
        this.Y0 = bgVar;
        linearLayout3.addView(bgVar, w7.b6.t(-1, -1, 16, 6, 0, 0, 0));
        this.d1.addView(this.d, w7.b6.e(-1, -1, 16));
    }

    public final void V0(a0.h hVar, boolean z10) {
        this.b5 = hVar;
        if (hVar.m() == 1 && ((TL_bots.BotInfo) hVar.n(0)).user_id == this.Q2) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) hVar.n(0);
            TL_bots.BotMenuButton botMenuButton = botInfo.menu_button;
            if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                this.i0 = tL_botMenuButton.text;
                this.j0 = tL_botMenuButton.url;
                this.q5 = 3;
            } else if (botInfo.commands.isEmpty()) {
                this.q5 = 1;
            } else {
                this.q5 = 2;
            }
        } else {
            this.q5 = 1;
        }
        xh.v vVar = this.n0;
        if (vVar != null) {
            vVar.E(hVar);
        }
        A1(z10);
        B(z10);
    }

    public final void W() {
        if (this.J1 != null || this.P2 == null) {
            return;
        }
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.input_calendar1).mutate();
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.input_calendar2).mutate();
        int i10 = org.telegram.ui.ActionBar.t6.Kl;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.p6 p6Var = this.W3;
        org.telegram.ui.ActionBar.a7.y(this, mutate, i10, p6Var, mode);
        org.telegram.ui.ActionBar.a7.y(this, mutate2, org.telegram.ui.ActionBar.t6.Xf, p6Var, mode);
        eq eqVar = new eq(mutate, mutate2);
        de deVar = new de(this, getContext());
        this.J1 = deVar;
        deVar.setImageDrawable(eqVar);
        this.J1.setVisibility(8);
        this.J1.setContentDescription(org.telegram.messenger.cd.L0(2131745865, null));
        this.J1.setScaleType(ImageView.ScaleType.CENTER);
        de deVar2 = this.J1;
        int i11 = org.telegram.ui.ActionBar.t6.i6;
        org.telegram.ui.ActionBar.a7.R(deVar2, org.telegram.ui.ActionBar.t6.h0(e0(i11), 1, -1), null, org.telegram.ui.ActionBar.a7.N(i11), p6Var);
        this.y1.addView(this.J1, 2, w7.b6.e(44, 44, 85));
        this.J1.setOnClickListener(new vc(this, 2));
        this.J1.setTranslationX(0.0f);
    }

    public final void W0(int i10, boolean z10, boolean z11) {
        this.o2 = i10;
        if (this.p2 == z10) {
            return;
        }
        this.p2 = z10;
        A1(z11);
    }

    public final void X() {
        if (this.p0 != null || getContext() == null) {
            return;
        }
        do0 do0Var = new do0(getContext());
        ImageReceiver imageReceiver = new ImageReceiver(do0Var);
        do0Var.a = imageReceiver;
        do0Var.b = new r8((org.telegram.ui.ActionBar.p6) null);
        do0Var.d = new Paint(1);
        Paint paint = new Paint(1);
        do0Var.e = paint;
        imageReceiver.J0(org.telegram.messenger.i0.L(28.0f));
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        do0Var.updateColors();
        do0Var.setContentDescription(org.telegram.messenger.cd.a0("AccDescrSendAsPeer", null, 2131754775, ""));
        this.p0 = do0Var;
        do0Var.setOnClickListener(new vc(this, 16));
        this.p0.setVisibility(8);
        this.y1.addView(this.p0, w7.b6.d(36, 36.0f, 83, 4.66f, 4.0f, 4.66f, 4.0f));
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
    public final void X0(org.telegram.messenger.jj jjVar, boolean z10, boolean z11) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        se seVar;
        org.telegram.messenger.jj jjVar2 = this.T2;
        if (jjVar2 != null && jjVar2 == this.m2 && jjVar2 != jjVar) {
            this.W2 = jjVar;
            return;
        }
        org.telegram.messenger.jj jjVar3 = this.m2;
        if (jjVar3 == null || jjVar3 != jjVar) {
            if (jjVar3 == null && jjVar == null) {
                return;
            }
            if (this.H1 == null) {
                df dfVar = new df(this, this.O2, this.W3);
                this.H1 = dfVar;
                dfVar.setVisibility(8);
                this.X0 = false;
                this.H1.setDelegate(new dd(this));
                this.n1.addView(this.H1);
            }
            this.m2 = jjVar;
            if (jjVar != null) {
                TLRPC.ReplyMarkup replyMarkup = jjVar.k.reply_markup;
                if (replyMarkup instanceof TLRPC.TL_replyKeyboardMarkup) {
                    tL_replyKeyboardMarkup = (TLRPC.TL_replyKeyboardMarkup) replyMarkup;
                    this.n2 = tL_replyKeyboardMarkup;
                    df dfVar2 = this.H1;
                    Point point = org.telegram.messenger.i0.q;
                    dfVar2.setPanelHeight(point.x <= point.y ? this.y2 : this.x2);
                    if (this.n2 == null) {
                        SharedPreferences sharedPreferences = org.telegram.messenger.vp.r1(this.Q).f7;
                        if (this.m2 != this.T2 && jjVar != null) {
                            if (this.n2.single_use) {
                            }
                            if (!this.n2.is_persistent) {
                            }
                        }
                        boolean z12 = true;
                        boolean z13 = z10 ? z12 : false;
                        this.H1.setButtons(this.n2);
                        if (z13 && (((seVar = this.E0) == null || seVar.length() == 0) && !q0())) {
                            r1(1, 1, true, true);
                        }
                    } else if (q0() && this.f2 == 1) {
                        if (z11) {
                            this.p3 = true;
                            G0();
                        } else {
                            r1(0, 1, true, true);
                        }
                    }
                    A1(true);
                }
            }
            tL_replyKeyboardMarkup = null;
            this.n2 = tL_replyKeyboardMarkup;
            df dfVar22 = this.H1;
            Point point2 = org.telegram.messenger.i0.q;
            dfVar22.setPanelHeight(point2.x <= point2.y ? this.y2 : this.x2);
            if (this.n2 == null) {
            }
            A1(true);
        }
    }

    public final boolean Y(TL_keyboard.KeyboardButtonProto keyboardButtonProto, org.telegram.messenger.jj jjVar, org.telegram.messenger.jj jjVar2, org.telegram.ui.aj ajVar) {
        org.telegram.ui.un unVar;
        int i10;
        int i11 = 0;
        if (keyboardButtonProto != null && jjVar2 != null && ((unVar = this.P2) == null || unVar.f4 != 5)) {
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) sf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = (TL_keyboard.TL_inlineButtonTypeUserProfile) sf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class);
            TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) sf.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class);
            TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) sf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class);
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) sf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (tL_inlineButtonTypeCopy != null) {
                org.telegram.messenger.i0.g(tL_inlineButtonTypeCopy.copy_text);
                cc.a0(unVar).i(org.telegram.messenger.cd.a0(null, null, 2131750885, tL_inlineButtonTypeCopy.copy_text)).k(true);
                return true;
            }
            if (keyboardButtonProto instanceof TL_keyboard.TL_keyboardButton) {
                TL_keyboard.TL_keyboardButton tL_keyboardButton = (TL_keyboard.TL_keyboardButton) keyboardButtonProto;
                if (tL_keyboardButton.type instanceof TL_keyboard.TL_buttonTypeDefault) {
                    org.telegram.messenger.oz b10 = org.telegram.messenger.oz.b(tL_keyboardButton.text, this.Q2, jjVar, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                    b10.K = unVar != null ? unVar.P8() : null;
                    b10.O = this.S4;
                    this.S4 = 0L;
                    this.J0.setEffect(0L);
                    org.telegram.messenger.qz.C(this.Q).r0(b10);
                    return true;
                }
            }
            Activity activity = this.O2;
            if (tL_inlineButtonTypeUrl != null) {
                if (gf.f.x(tL_inlineButtonTypeUrl.url)) {
                    gf.f.p(activity, Uri.parse(tL_inlineButtonTypeUrl.url), true, true, ajVar);
                    return true;
                }
                s4.q0(this.P2, tL_inlineButtonTypeUrl.url, false, true, true, false, ajVar, null, this.W3);
                return true;
            }
            if (sf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPhone.class)) {
                unVar.Kb(2, jjVar2);
                return true;
            }
            if (!sf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class)) {
                if (sf.c.b(keyboardButtonProto)) {
                    TLRPC.Message message = jjVar2.k;
                    long j10 = message.via_bot_id;
                    if (j10 == 0) {
                        j10 = message.from_id.user_id;
                    }
                    long j11 = j10;
                    ef efVar = new ef(this, jjVar2, j11, keyboardButtonProto, jjVar, org.telegram.messenger.vp.r1(this.Q).Z1(Long.valueOf(j10)));
                    if (org.telegram.messenger.js.h(this.Q, j11) || org.telegram.messenger.vp.r1(this.Q).X6.contains(Long.valueOf(j11))) {
                        efVar.run();
                        return true;
                    }
                    s4.n(unVar, org.telegram.messenger.vp.r1(this.Q).Z1(Long.valueOf(this.Q2)), new a3.i0(this, efVar, j11, 11), null);
                    return true;
                }
                if (sf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    String L0 = org.telegram.messenger.cd.L0(2131745441, "ShareYouLocationTitle");
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                    x1Var.R = L0;
                    x1Var.T = org.telegram.messenger.cd.L0(2131745443, "ShareYouLocationInfo");
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, "OK"), new androidx.car.app.utils.a(this, jjVar2, keyboardButtonProto, 14));
                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, "Cancel"), null);
                    unVar.showDialog(x1Var);
                    return true;
                }
                if (sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || sf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
                    org.telegram.messenger.qz.C(this.Q).n0(true, jjVar2, keyboardButtonProto, null, null, unVar);
                    return true;
                }
                if (tL_inlineButtonTypeSwitchInline != null) {
                    if (!unVar.Ra(tL_inlineButtonTypeSwitchInline)) {
                        if (!tL_inlineButtonTypeSwitchInline.same_peer) {
                            Bundle j12 = org.telegram.ui.Cells.f1.j(1, "onlySelect", "dialogsType", true);
                            if ((tL_inlineButtonTypeSwitchInline.flags & 2) != 0) {
                                j12.putBoolean("allowGroups", false);
                                j12.putBoolean("allowMegagroups", false);
                                j12.putBoolean("allowLegacyGroups", false);
                                j12.putBoolean("allowUsers", false);
                                j12.putBoolean("allowChannels", false);
                                j12.putBoolean("allowBots", false);
                                ArrayList<TLRPC.InlineQueryPeerType> arrayList = tL_inlineButtonTypeSwitchInline.peer_types;
                                int size = arrayList.size();
                                while (i11 < size) {
                                    TLRPC.InlineQueryPeerType inlineQueryPeerType = arrayList.get(i11);
                                    i11++;
                                    TLRPC.InlineQueryPeerType inlineQueryPeerType2 = inlineQueryPeerType;
                                    if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypePM) {
                                        j12.putBoolean("allowUsers", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBotPM) {
                                        j12.putBoolean("allowBots", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBroadcast) {
                                        j12.putBoolean("allowChannels", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeChat) {
                                        j12.putBoolean("allowLegacyGroups", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeMegagroup) {
                                        j12.putBoolean("allowMegagroups", true);
                                    }
                                }
                            }
                            org.telegram.ui.ay ayVar = new org.telegram.ui.ay(j12);
                            ayVar.C2 = new androidx.car.app.utils.a(this, jjVar2, tL_inlineButtonTypeSwitchInline, 15);
                            unVar.presentFragment(ayVar);
                            return true;
                        }
                        TLRPC.Message message2 = jjVar2.k;
                        long j13 = message2.from_id.user_id;
                        long j14 = message2.via_bot_id;
                        if (j14 != 0) {
                            j13 = j14;
                        }
                        TLRPC.User Z1 = org.telegram.messenger.vp.r1(this.R.a).Z1(Long.valueOf(j13));
                        if (Z1 != null) {
                            setFieldText("@" + org.telegram.messenger.h20.n(Z1) + " " + tL_inlineButtonTypeSwitchInline.query);
                            return true;
                        }
                    }
                } else if (tL_inlineButtonTypeUserProfile != null) {
                    if (org.telegram.messenger.vp.r1(this.Q).Z1(Long.valueOf(tL_inlineButtonTypeUserProfile.user_id)) != null) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", tL_inlineButtonTypeUserProfile.user_id);
                        unVar.presentFragment(new ProfileActivity(bundle, null));
                        return true;
                    }
                } else if (tL_buttonTypeRequestPeer != null) {
                    TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
                    if (requestPeerType == null || jjVar2.k == null) {
                        org.telegram.messenger.f8.d("button.peer_type is null");
                        return true;
                    }
                    if (!(requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot)) {
                        if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i10 = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                            TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                            Boolean bool = tL_requestPeerTypeUser.bot;
                            Boolean bool2 = tL_requestPeerTypeUser.premium;
                            md mdVar = new md(this, jjVar2, tL_buttonTypeRequestPeer);
                            org.telegram.ui.wh0 wh0Var = org.telegram.ui.wh0.m2;
                            org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                            if (Q == null || org.telegram.ui.wh0.m2 != null) {
                                return false;
                            }
                            org.telegram.ui.wh0 wh0Var2 = new org.telegram.ui.wh0(Q, i10, bool, bool2, mdVar);
                            wh0Var2.show();
                            org.telegram.ui.wh0.m2 = wh0Var2;
                            return false;
                        }
                        Bundle j15 = org.telegram.ui.Cells.f1.j(15, "onlySelect", "dialogsType", true);
                        TLRPC.Message message3 = jjVar2.k;
                        if (message3 != null) {
                            TLRPC.Peer peer = message3.from_id;
                            if (peer instanceof TLRPC.TL_peerUser) {
                                j15.putLong("requestPeerBotId", peer.user_id);
                            }
                        }
                        try {
                            SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                            tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                            j15.putByteArray("requestPeerType", serializedData.toByteArray());
                            serializedData.cleanup();
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                        }
                        org.telegram.ui.ay ayVar2 = new org.telegram.ui.ay(j15);
                        ayVar2.C2 = new md(this, jjVar2, tL_buttonTypeRequestPeer);
                        unVar.presentFragment(ayVar2);
                        return false;
                    }
                    TLRPC.User j16 = getParentFragment() != null ? getParentFragment().j() : org.telegram.messenger.vp.r1(this.Q).Z1(Long.valueOf(this.Q2));
                    if (j16 != null) {
                        vq.e(getContext(), this.Q, j16, (TLRPC.TL_requestPeerTypeCreateBot) tL_buttonTypeRequestPeer.peer_type, false, new ag.m2(this, jjVar2, tL_buttonTypeRequestPeer, j16, 5), this.W3, null);
                        return false;
                    }
                }
                return true;
            }
            TL_keyboard.TL_buttonTypeRequestPoll tL_buttonTypeRequestPoll = (TL_keyboard.TL_buttonTypeRequestPoll) sf.c.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class);
            Boolean valueOf = (tL_buttonTypeRequestPoll.flags & 1) != 0 ? Boolean.valueOf(tL_buttonTypeRequestPoll.quiz) : null;
            unVar.na();
            ag.v vVar = unVar.X1;
            if (vVar != null) {
                vVar.M2 = false;
                vVar.r3.setVisibility(8);
                vVar.G1(false, valueOf);
                return false;
            }
        }
        return false;
    }

    public final void Y0(org.telegram.messenger.jj jjVar, String str, boolean z10, boolean z11) {
        se seVar;
        org.telegram.messenger.oz b10;
        String sb2;
        if (str == null || getVisibility() != 0 || (seVar = this.E0) == null) {
            return;
        }
        r16 = null;
        TLRPC.User user = null;
        if (!z10) {
            if (this.G0 > 0 && !c()) {
                sf sfVar = this.Z2;
                if (sfVar != null) {
                    ag agVar = this.F0;
                    sfVar.e1(agVar, ((org.telegram.ui.ActionBar.u5) agVar.c).getText(), true);
                    return;
                }
                return;
            }
            TLRPC.User Z1 = (jjVar == null || !org.telegram.messenger.o5.z(this.Q2)) ? null : org.telegram.messenger.vp.r1(this.R.a).Z1(Long.valueOf(jjVar.k.from_id.user_id));
            if ((this.o2 != 1 || z11) && Z1 != null && Z1.bot && !str.contains("@")) {
                Locale locale = Locale.US;
                b10 = org.telegram.messenger.oz.b(a1.g.C(str, "@", org.telegram.messenger.h20.n(Z1)), this.Q2, this.T2, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
            } else {
                b10 = org.telegram.messenger.oz.b(str, this.Q2, this.T2, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
            }
            org.telegram.ui.un unVar = this.P2;
            b10.K = unVar != null ? unVar.P8() : null;
            b10.O = this.S4;
            this.S4 = 0L;
            this.J0.setEffect(0L);
            o(b10);
            org.telegram.messenger.qz.C(this.Q).r0(b10);
            return;
        }
        String obj = seVar.getText().toString();
        if (jjVar != null && org.telegram.messenger.o5.z(this.Q2)) {
            user = org.telegram.messenger.vp.r1(this.R.a).Z1(Long.valueOf(jjVar.k.from_id.user_id));
        }
        TLRPC.User user2 = user;
        if ((this.o2 != 1 || z11) && user2 != null && user2.bot && !str.contains("@")) {
            StringBuilder sb3 = new StringBuilder();
            Locale locale2 = Locale.US;
            sb3.append(str + "@" + org.telegram.messenger.h20.n(user2));
            sb3.append(" ");
            sb3.append(obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
            sb2 = sb3.toString();
        } else {
            StringBuilder i10 = sc.e.i(str, " ");
            i10.append(obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
            sb2 = i10.toString();
        }
        this.R2 = true;
        this.E0.setText(sb2);
        se seVar2 = this.E0;
        seVar2.setSelection(seVar2.getText().length());
        this.R2 = false;
        sf sfVar2 = this.Z2;
        if (sfVar2 != null) {
            sfVar2.V0(this.E0.getText(), true, false);
        }
        if (this.z2 || this.f2 != -1) {
            return;
        }
        F0();
    }

    public final void Z() {
        org.telegram.messenger.nj njVar;
        org.telegram.messenger.oj b10;
        TLRPC.Chat chat;
        int i10;
        org.telegram.messenger.oj b11;
        org.telegram.messenger.jj jjVar = this.Z1;
        if (jjVar == null) {
            return;
        }
        boolean p5 = jjVar.p5();
        org.telegram.ui.un unVar = this.P2;
        if (p5 && !org.telegram.messenger.w3.z(this.Q, 24, org.telegram.messenger.jj.B0(this.Z1.k))) {
            if (unVar == null || (b11 = unVar.w5) == null) {
                b11 = org.telegram.messenger.oj.b(this.Z1.k.suggested_post);
            }
            if (!rh.e6.T(this.Q, b11.a)) {
                if (unVar != null) {
                    unVar.mc(b11);
                    return;
                }
                return;
            }
        }
        if (this.c0 - this.d0 < 0) {
            NumberTextView numberTextView = this.b0;
            if (numberTextView != null) {
                org.telegram.messenger.i0.F3(3.5f, numberTextView, null);
                try {
                    this.b0.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
            }
            if (org.telegram.messenger.vp.r1(this.Q).A3() || org.telegram.messenger.vp.r1(this.Q).V4 <= this.d0) {
                return;
            }
            o1();
            return;
        }
        if (this.R1 != 0) {
            k1(0, true);
            this.U0.t(false);
            if (this.z3) {
                l1(false, true, false, true);
                this.l3 = true;
                org.telegram.messenger.i0.h3(new tc(this, 28), 200L);
            }
        }
        se seVar = this.E0;
        CharSequence textToUse = seVar == null ? "" : seVar.getTextToUse();
        org.telegram.messenger.jj jjVar2 = this.Z1;
        if (jjVar2 == null || jjVar2.D != 19) {
            textToUse = org.telegram.messenger.i0.n1(textToUse);
        }
        CharSequence[] charSequenceArr = {textToUse};
        if (TextUtils.isEmpty(charSequenceArr[0])) {
            TLRPC.MessageMedia messageMedia = this.Z1.k.media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) || (messageMedia instanceof TLRPC.TL_messageMediaEmpty) || messageMedia == null) {
                org.telegram.messenger.i0.F3(-3.0f, this.E0, null);
                org.telegram.messenger.t2.D.a();
                return;
            }
        }
        ArrayList W = org.telegram.messenger.ui.b0(this.Q).W(charSequenceArr, x1(), true);
        if (!TextUtils.equals(charSequenceArr[0], this.Z1.v) || ((W != null && !W.isEmpty()) || !this.Z1.k.entities.isEmpty() || (this.Z1.k.media instanceof TLRPC.TL_messageMediaWebPage))) {
            org.telegram.messenger.jj jjVar3 = this.Z1;
            jjVar3.w1 = charSequenceArr[0];
            jjVar3.x1 = W;
            jjVar3.y1 = this.Y2;
            if (unVar != null && (chat = unVar.e) != null && (((i10 = jjVar3.D) == 0 || i10 == 19) && !org.telegram.messenger.w3.m(chat))) {
                org.telegram.messenger.jj jjVar4 = this.Z1;
                jjVar4.y1 = false;
                TLRPC.Message message = jjVar4.k;
                message.flags &= -513;
                message.media = null;
            } else if (unVar == null || (njVar = unVar.v5) == null) {
                org.telegram.messenger.jj jjVar5 = this.Z1;
                jjVar5.y1 = false;
                int i11 = jjVar5.D;
                if (i11 == 0 || i11 == 19) {
                    TLRPC.Message message2 = jjVar5.k;
                    message2.flags |= 512;
                    message2.media = new TLRPC.TL_messageMediaEmpty();
                }
            } else {
                if (unVar.W5 instanceof TLRPC.TL_webPagePending) {
                    org.telegram.messenger.jj jjVar6 = this.Z1;
                    jjVar6.y1 = false;
                    int i12 = jjVar6.D;
                    if (i12 == 0 || i12 == 19) {
                        jjVar6.k.media = new TLRPC.TL_messageMediaEmpty();
                        this.Z1.k.flags |= 512;
                    }
                } else if (njVar.v != null) {
                    org.telegram.messenger.jj jjVar7 = this.Z1;
                    jjVar7.y1 = false;
                    TLRPC.Message message3 = jjVar7.k;
                    message3.flags |= 512;
                    message3.media = new TLRPC.TL_messageMediaWebPage();
                    this.Z1.k.media.webpage = unVar.v5.v;
                } else {
                    org.telegram.messenger.jj jjVar8 = this.Z1;
                    jjVar8.y1 = false;
                    int i13 = jjVar8.D;
                    if (i13 == 0 || i13 == 19) {
                        TLRPC.Message message4 = jjVar8.k;
                        message4.flags |= 512;
                        message4.media = new TLRPC.TL_messageMediaEmpty();
                    }
                }
                TLRPC.Message message5 = this.Z1.k;
                org.telegram.messenger.nj njVar2 = unVar.v5;
                message5.invert_media = njVar2.r;
                if (njVar2.o) {
                    TLRPC.MessageMedia messageMedia2 = message5.media;
                    if (messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) {
                        boolean z10 = njVar2.q;
                        messageMedia2.force_small_media = z10;
                        messageMedia2.force_large_media = true ^ z10;
                    }
                }
            }
            if (this.Z1.p5()) {
                org.telegram.messenger.oz a2 = org.telegram.messenger.oz.a(org.telegram.messenger.jj.B0(this.Z1.k), this.Z1.w1.toString());
                if (unVar == null || (b10 = unVar.w5) == null) {
                    b10 = org.telegram.messenger.oj.b(this.Z1.k.suggested_post);
                }
                a2.T = b10;
                a2.R = org.telegram.messenger.o5.o(this.Z1.k.saved_peer_id);
                a2.G = this.Z1.t2();
                org.telegram.messenger.jj jjVar9 = this.Z1;
                a2.r = jjVar9;
                a2.D = jjVar9;
                if (jjVar9.F0() instanceof TLRPC.TL_document) {
                    a2.g = (TLRPC.TL_document) this.Z1.F0();
                    a2.b = a2.a;
                    a2.a = null;
                } else {
                    TLRPC.MessageMedia messageMedia3 = this.Z1.k.media;
                    if (messageMedia3 != null && !(messageMedia3 instanceof TLRPC.TL_messageMediaEmpty)) {
                        TLRPC.Photo photo = messageMedia3.photo;
                        if (photo instanceof TLRPC.TL_photo) {
                            a2.d = (TLRPC.TL_photo) photo;
                        } else {
                            a2.c = messageMedia3;
                        }
                        a2.b = a2.a;
                        a2.a = null;
                    }
                }
                org.telegram.messenger.qz.C(this.Q).r0(a2);
            } else {
                org.telegram.messenger.qz C = org.telegram.messenger.qz.C(this.Q);
                org.telegram.messenger.jj jjVar10 = this.Z1;
                C.t(jjVar10, null, null, null, null, null, null, null, false, jjVar10.t2(), null);
            }
        }
        a1(null, null, false);
    }

    public final void Z0(int i10, long j10) {
        this.Q2 = j10;
        if (this.Q != i10) {
            this.L3.e();
            org.telegram.messenger.zs f7 = org.telegram.messenger.zs.f(this.Q);
            int i11 = org.telegram.messenger.zs.l2;
            f7.n(this, i11);
            org.telegram.messenger.zs f10 = org.telegram.messenger.zs.f(this.Q);
            int i12 = org.telegram.messenger.zs.o2;
            f10.n(this, i12);
            org.telegram.messenger.zs f11 = org.telegram.messenger.zs.f(this.Q);
            int i13 = org.telegram.messenger.zs.p2;
            f11.n(this, i13);
            org.telegram.messenger.zs f12 = org.telegram.messenger.zs.f(this.Q);
            int i14 = org.telegram.messenger.zs.m2;
            f12.n(this, i14);
            org.telegram.messenger.zs f13 = org.telegram.messenger.zs.f(this.Q);
            int i15 = org.telegram.messenger.zs.n2;
            f13.n(this, i15);
            org.telegram.messenger.zs f14 = org.telegram.messenger.zs.f(this.Q);
            int i16 = org.telegram.messenger.zs.k2;
            f14.n(this, i16);
            org.telegram.messenger.zs f15 = org.telegram.messenger.zs.f(this.Q);
            int i17 = org.telegram.messenger.zs.t;
            f15.n(this, i17);
            org.telegram.messenger.zs f16 = org.telegram.messenger.zs.f(this.Q);
            int i18 = org.telegram.messenger.zs.s2;
            f16.n(this, i18);
            org.telegram.messenger.zs f17 = org.telegram.messenger.zs.f(this.Q);
            int i19 = org.telegram.messenger.zs.u2;
            f17.n(this, i19);
            org.telegram.messenger.zs f18 = org.telegram.messenger.zs.f(this.Q);
            int i20 = org.telegram.messenger.zs.e2;
            f18.n(this, i20);
            org.telegram.messenger.zs f19 = org.telegram.messenger.zs.f(this.Q);
            int i21 = org.telegram.messenger.zs.z0;
            f19.n(this, i21);
            org.telegram.messenger.zs f20 = org.telegram.messenger.zs.f(this.Q);
            int i22 = org.telegram.messenger.zs.L;
            f20.n(this, i22);
            org.telegram.messenger.zs f21 = org.telegram.messenger.zs.f(this.Q);
            int i23 = org.telegram.messenger.zs.n1;
            f21.n(this, i23);
            org.telegram.messenger.zs f22 = org.telegram.messenger.zs.f(this.Q);
            int i24 = org.telegram.messenger.zs.t2;
            f22.n(this, i24);
            org.telegram.messenger.zs f23 = org.telegram.messenger.zs.f(this.Q);
            int i25 = org.telegram.messenger.zs.R2;
            f23.n(this, i25);
            org.telegram.messenger.zs f24 = org.telegram.messenger.zs.f(this.Q);
            int i26 = org.telegram.messenger.zs.Y2;
            f24.n(this, i26);
            org.telegram.messenger.zs f25 = org.telegram.messenger.zs.f(this.Q);
            int i27 = org.telegram.messenger.zs.f5;
            f25.n(this, i27);
            this.Q = i10;
            this.R = org.telegram.messenger.c.a(i10);
            org.telegram.messenger.zs.f(this.Q).c(this, i11);
            org.telegram.messenger.zs.f(this.Q).c(this, i12);
            org.telegram.messenger.zs.f(this.Q).c(this, i13);
            org.telegram.messenger.zs.f(this.Q).c(this, i14);
            org.telegram.messenger.zs.f(this.Q).c(this, i15);
            org.telegram.messenger.zs.f(this.Q).c(this, i16);
            org.telegram.messenger.zs.f(this.Q).c(this, i17);
            org.telegram.messenger.zs.f(this.Q).c(this, i18);
            org.telegram.messenger.zs.f(this.Q).c(this, i19);
            org.telegram.messenger.zs.f(this.Q).c(this, i20);
            org.telegram.messenger.zs.f(this.Q).c(this, i21);
            org.telegram.messenger.zs.f(this.Q).c(this, i22);
            org.telegram.messenger.zs.f(this.Q).c(this, i23);
            org.telegram.messenger.zs.f(this.Q).c(this, i24);
            org.telegram.messenger.zs.f(this.Q).c(this, i25);
            org.telegram.messenger.zs.f(this.Q).c(this, i26);
            org.telegram.messenger.zs.f(this.Q).c(this, i27);
        }
        this.z0 = true;
        if (org.telegram.messenger.o5.z(this.Q2)) {
            this.z0 = org.telegram.messenger.w3.q(org.telegram.messenger.vp.r1(this.R.a).L0(Long.valueOf(-this.Q2)));
        }
        N1(false);
        H1(false);
        D();
        A();
        F1(false);
        if (this.E0 != null) {
            org.telegram.ui.un unVar = this.P2;
            O1(unVar != null && unVar.getFragmentBeginToShow());
        }
    }

    @Override // org.telegram.ui.Components.zw0
    public final void a(TLRPC.Document document, String str, Object obj, org.telegram.messenger.fj fjVar, boolean z10, boolean z11, int i10, int i11) {
        if (this.p5) {
            return;
        }
        org.telegram.ui.kn knVar = this.V2;
        org.telegram.ui.un unVar = this.P2;
        if (knVar != null && unVar != null && knVar.f) {
            unVar.kc();
            return;
        }
        if (!c() || i10 != 0) {
            s4.Z(this.Q, 1, this.Q2, new jd(this, document, str, fjVar, z11, i10, i11, obj, z10));
            return;
        }
        s4.L(this.O2, unVar.a(), new id(this, document, str, obj, fjVar, z10), this.W3);
    }

    public final void a0(Canvas canvas, boolean z10) {
        if (this.y4) {
            int z11 = (int) c3.i0.z(1.0f, this.C4, org.telegram.ui.ActionBar.t6.i3.getIntrinsicHeight(), this.T1);
            View view = this.G1;
            if (view != null && view.getVisibility() == 0) {
                z11 = (int) (((1.0f - getTopViewEnterProgress()) * this.G1.getLayoutParams().height) + z11);
            }
            int intrinsicHeight = org.telegram.ui.ActionBar.t6.i3.getIntrinsicHeight() + z11;
            if (z10) {
                org.telegram.ui.ActionBar.t6.i3.setAlpha((int) (this.C4 * 255.0f));
                org.telegram.ui.ActionBar.t6.i3.setBounds(0, z11, getMeasuredWidth(), intrinsicHeight);
                org.telegram.ui.ActionBar.t6.i3.draw(canvas);
            }
            if (!this.x4) {
                float f7 = intrinsicHeight;
                float width = getWidth();
                float height = getHeight();
                org.telegram.ui.ActionBar.p6 p6Var = this.W3;
                Paint d = p6Var != null ? p6Var.d("paintChatComposeBackground") : null;
                if (d == null) {
                    d = org.telegram.ui.ActionBar.t6.V0("paintChatComposeBackground");
                }
                canvas.drawRect(0.0f, f7, width, height, d);
                return;
            }
            int e02 = e0(org.telegram.ui.ActionBar.t6.Ge);
            Paint paint = this.B4;
            paint.setColor(e02);
            if (!org.telegram.messenger.tz.f() || this.m1 == null) {
                canvas.drawRect(0.0f, intrinsicHeight, getWidth(), getHeight(), paint);
            } else {
                this.D4.set(0, intrinsicHeight, getWidth(), getHeight());
                this.m1.H(canvas, getTop(), this.D4, paint, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a1(org.telegram.messenger.jj jjVar, org.telegram.messenger.ej ejVar, boolean z10) {
        float f7;
        float f10;
        int i10;
        pd pdVar;
        CharSequence charSequence;
        CharSequence charSequence2;
        int i11;
        se seVar;
        se seVar2;
        pd pdVar2;
        boolean z11;
        de deVar;
        if (this.b3 == null && this.e3 == null && this.Z1 != jjVar) {
            S();
            boolean z12 = this.Z1 != null;
            this.Z1 = jjVar;
            this.a2 = z10;
            pd pdVar3 = this.A1;
            jg.z2 z2Var = this.p1;
            ImageView imageView = this.P0;
            ag.r rVar = this.r1;
            yd ydVar = this.Z0;
            if (jjVar != null) {
                this.R4 = ejVar != null ? ejVar.j : jjVar.k.invert_media;
                P(false);
                this.F1.setOnClickListener(new vc(this, 17));
                if (this.Z1.p5()) {
                    long j10 = this.u4;
                    if (j10 > 0) {
                        this.F1.i(1, j10, true);
                        this.F1.setLayoutParams(w7.b6.e(44, 44, 85));
                        this.F1.requestLayout();
                        pdVar = pdVar3;
                        this.F1.setOnLongClickListener(new j(this, jjVar, ejVar, 1));
                        this.F1.setVisibility(0);
                        this.F1.setScaleX(0.1f);
                        this.F1.setScaleY(0.1f);
                        this.F1.setAlpha(0.0f);
                        this.F1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(gr.f).start();
                        if (z10) {
                            this.c0 = org.telegram.messenger.vp.r1(this.R.a).t1();
                            charSequence = this.Z1.v;
                        } else {
                            this.c0 = org.telegram.messenger.vp.r1(this.R.a).u3;
                            charSequence = this.Z1.z;
                        }
                        if (charSequence == null) {
                            se seVar3 = this.E0;
                            TextPaint paint = seVar3 != null ? seVar3.getPaint() : null;
                            if (paint == null) {
                                paint = new TextPaint();
                                paint.setTextSize(org.telegram.messenger.i0.L(18.0f));
                            }
                            charSequence2 = n(paint.getFontMetricsInt(), charSequence, this.Z1.k.entities);
                        } else {
                            charSequence2 = "";
                        }
                        if (this.V1 == null && !z12) {
                            se seVar4 = this.E0;
                            this.V1 = (seVar4 != null || seVar4.length() <= 0) ? null : this.E0.getText();
                            this.W1 = this.Y2;
                        }
                        org.telegram.messenger.jj jjVar2 = this.Z1;
                        TLRPC.MessageMedia messageMedia = jjVar2.k.media;
                        this.Y2 = ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) || !messageMedia.manual) && ((i11 = jjVar2.D) == 0 || i11 == 19);
                        if (this.z2) {
                            cd cdVar = new cd(2, this, charSequence2);
                            this.W = cdVar;
                            org.telegram.messenger.i0.h3(cdVar, 200L);
                        } else {
                            cd cdVar2 = this.W;
                            if (cdVar2 != null) {
                                org.telegram.messenger.i0.r(cdVar2);
                                this.W = null;
                            }
                            setFieldText(charSequence2);
                        }
                        seVar = this.E0;
                        if (seVar != null) {
                            seVar.requestFocus();
                        }
                        F0();
                        seVar2 = this.E0;
                        if (seVar2 != null) {
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) seVar2.getLayoutParams();
                            layoutParams.rightMargin = org.telegram.messenger.i0.L(4.0f);
                            this.E0.setLayoutParams(layoutParams);
                        }
                        pdVar2 = this.e1;
                        if (pdVar2 == null) {
                            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) pdVar2.getLayoutParams();
                            z11 = false;
                            layoutParams2.rightMargin = 0;
                            this.e1.setLayoutParams(layoutParams2);
                        } else {
                            z11 = false;
                        }
                        getSendButtonInternal().setVisibility(8);
                        setSlowModeButtonVisible(z11);
                        imageView.setVisibility(8);
                        ydVar.setVisibility(8);
                        z2Var.setVisibility(8);
                        if (rVar != null) {
                            this.v1 = 0.0f;
                            rVar.setAlpha(0.0f);
                            rVar.setScaleX(0.5f);
                            rVar.setScaleY(0.5f);
                        }
                        pdVar.setVisibility(8);
                        deVar = this.J1;
                        if (deVar != null) {
                            deVar.setVisibility(8);
                        }
                    }
                }
                pdVar = pdVar3;
                this.F1.i(1, 0L, true);
                this.F1.setLayoutParams(w7.b6.e(44, 44, 85));
                this.F1.requestLayout();
                this.F1.setOnLongClickListener(new j(this, jjVar, ejVar, 1));
                this.F1.setVisibility(0);
                this.F1.setScaleX(0.1f);
                this.F1.setScaleY(0.1f);
                this.F1.setAlpha(0.0f);
                this.F1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(gr.f).start();
                if (z10) {
                }
                if (charSequence == null) {
                }
                if (this.V1 == null) {
                    se seVar42 = this.E0;
                    this.V1 = (seVar42 != null || seVar42.length() <= 0) ? null : this.E0.getText();
                    this.W1 = this.Y2;
                }
                org.telegram.messenger.jj jjVar22 = this.Z1;
                TLRPC.MessageMedia messageMedia2 = jjVar22.k.media;
                this.Y2 = ((messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) || !messageMedia2.manual) && ((i11 = jjVar22.D) == 0 || i11 == 19);
                if (this.z2) {
                }
                seVar = this.E0;
                if (seVar != null) {
                }
                F0();
                seVar2 = this.E0;
                if (seVar2 != null) {
                }
                pdVar2 = this.e1;
                if (pdVar2 == null) {
                }
                getSendButtonInternal().setVisibility(8);
                setSlowModeButtonVisible(z11);
                imageView.setVisibility(8);
                ydVar.setVisibility(8);
                z2Var.setVisibility(8);
                if (rVar != null) {
                }
                pdVar.setVisibility(8);
                deVar = this.J1;
                if (deVar != null) {
                }
            } else {
                cd cdVar3 = this.W;
                if (cdVar3 != null) {
                    org.telegram.messenger.i0.r(cdVar3);
                    this.W = null;
                }
                be beVar = this.F1;
                if (beVar != null) {
                    beVar.setVisibility(8);
                }
                this.c0 = -1;
                this.Z2.w();
                pdVar3.setVisibility(0);
                imageView.setScaleX(0.1f);
                imageView.setScaleY(0.1f);
                imageView.setAlpha(0.0f);
                imageView.setVisibility(8);
                int i12 = this.G0;
                ag agVar = this.F0;
                if (i12 <= 0 || c()) {
                    getSendButtonInternal().setScaleX(0.1f);
                    getSendButtonInternal().setScaleY(0.1f);
                    getSendButtonInternal().setAlpha(0.0f);
                    getSendButtonInternal().setVisibility(8);
                    agVar.setScaleX(0.1f);
                    agVar.setScaleY(0.1f);
                    agVar.setAlpha(0.0f);
                    setSlowModeButtonVisible(false);
                    f7 = 1.0f;
                    z2Var.setScaleX(1.0f);
                    this.E = 1.0f;
                    z1();
                    z2Var.setVisibility(0);
                    if (rVar != null) {
                        this.v1 = 1.0f;
                        rVar.setAlpha(1.0f);
                        rVar.setScaleX(1.0f);
                        rVar.setScaleY(1.0f);
                    }
                    ydVar.setScaleX(1.0f);
                    ydVar.setScaleY(1.0f);
                    ydVar.setAlpha(1.0f);
                    ydVar.setVisibility(0);
                } else {
                    if (this.G0 == Integer.MAX_VALUE) {
                        getSendButtonInternal().setScaleX(1.0f);
                        getSendButtonInternal().setScaleY(1.0f);
                        getSendButtonInternal().setAlpha(1.0f);
                        getSendButtonInternal().setVisibility(0);
                        agVar.setScaleX(0.1f);
                        agVar.setScaleY(0.1f);
                        f10 = 0.0f;
                        agVar.setAlpha(0.0f);
                        setSlowModeButtonVisible(false);
                        i10 = 8;
                    } else {
                        f10 = 0.0f;
                        getSendButtonInternal().setScaleX(0.1f);
                        getSendButtonInternal().setScaleY(0.1f);
                        getSendButtonInternal().setAlpha(0.0f);
                        i10 = 8;
                        getSendButtonInternal().setVisibility(8);
                        agVar.setScaleX(1.0f);
                        agVar.setScaleY(1.0f);
                        agVar.setAlpha(1.0f);
                        setSlowModeButtonVisible(true);
                    }
                    z2Var.setScaleX(0.01f);
                    this.E = f10;
                    z1();
                    z2Var.setVisibility(i10);
                    if (rVar != null) {
                        this.v1 = f10;
                        rVar.setAlpha(f10);
                        rVar.setScaleX(0.5f);
                        rVar.setScaleY(0.5f);
                    }
                    ydVar.setScaleX(0.1f);
                    ydVar.setScaleY(0.1f);
                    ydVar.setAlpha(f10);
                    ydVar.setVisibility(i10);
                    f7 = 1.0f;
                }
                W();
                de deVar2 = this.J1;
                if (deVar2 != null && deVar2.getTag() != null) {
                    this.J1.setScaleX(f7);
                    this.J1.setScaleY(f7);
                    this.J1.setAlpha(f7);
                    this.J1.setVisibility(0);
                }
                org.telegram.ui.un unVar = this.P2;
                if (unVar != null) {
                    unVar.F5 = null;
                    unVar.W5 = null;
                    org.telegram.messenger.nj njVar = unVar.v5;
                    if (njVar != null) {
                        njVar.e(this.Q, null, "", null, null, null);
                    }
                    this.X2 = null;
                    this.Y2 = true;
                    unVar.s8();
                }
                S();
                se seVar5 = this.E0;
                if (seVar5 != null) {
                    seVar5.setText(this.V1);
                    se seVar6 = this.E0;
                    seVar6.setSelection(seVar6.length());
                }
                this.V1 = null;
                this.Y2 = this.W1;
                if (getVisibility() == 0) {
                    this.Z2.d2();
                }
                G1(1);
            }
            F1(true);
            O1(true);
            D1();
            M1();
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ge));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Sf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Qf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Pf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Me));
    }

    @Override // org.telegram.ui.Components.zw0
    public final boolean b() {
        org.telegram.ui.un unVar = this.P2;
        return unVar != null && unVar.L6();
    }

    public final boolean b0(Canvas canvas, org.telegram.messenger.i20 i20Var) {
        float f7;
        float f10;
        float f11;
        float f12;
        float d = this.f5.d(this.E0.canScrollVertically(-1));
        float d10 = this.g5.d(this.E0.canScrollVertically(1));
        if (d <= 0.0f && d10 <= 0.0f) {
            return ((Boolean) i20Var.run()).booleanValue();
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, this.E0.getX() + this.E0.getMeasuredWidth() + org.telegram.messenger.i0.L(5.0f), this.E0.getY() + this.E0.getMeasuredHeight() + org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.zs.e4, 31);
        boolean booleanValue = ((Boolean) i20Var.run()).booleanValue();
        canvas.save();
        LinearGradient linearGradient = this.d5;
        Paint paint = this.c5;
        Matrix matrix = this.e5;
        if (d > 0.0f) {
            RectF rectF = org.telegram.messenger.i0.P;
            f11 = 255.0f;
            f12 = 16.0f;
            f7 = 0.0f;
            f10 = 5.0f;
            rectF.set(this.E0.getX() - org.telegram.messenger.i0.L(5.0f), (this.E0.getY() + this.T1) - 1.0f, this.E0.getX() + this.E0.getMeasuredWidth() + org.telegram.messenger.i0.L(5.0f), this.E0.getY() + this.T1 + org.telegram.messenger.i0.L(13.0f));
            matrix.reset();
            matrix.postScale(1.0f, rectF.height() / 16.0f);
            matrix.postTranslate(rectF.left, rectF.top);
            linearGradient.setLocalMatrix(matrix);
            paint.setAlpha((int) (d * 255.0f));
            canvas.drawRect(rectF, paint);
        } else {
            f7 = 0.0f;
            f10 = 5.0f;
            f11 = 255.0f;
            f12 = 16.0f;
        }
        if (d10 > f7) {
            RectF rectF2 = org.telegram.messenger.i0.P;
            rectF2.set(this.E0.getX() - org.telegram.messenger.i0.L(f10), (this.E0.getY() + this.E0.getMeasuredHeight()) - org.telegram.messenger.i0.L(15.0f), this.E0.getX() + this.E0.getMeasuredWidth() + org.telegram.messenger.i0.L(f10), this.E0.getY() + this.E0.getMeasuredHeight() + org.telegram.messenger.i0.L(2.0f) + 1.0f);
            matrix.reset();
            matrix.postScale(1.0f, rectF2.height() / f12);
            matrix.postRotate(180.0f);
            matrix.postTranslate(rectF2.left, rectF2.bottom);
            linearGradient.setLocalMatrix(matrix);
            paint.setAlpha((int) (d10 * f11));
            canvas.drawRect(rectF2, paint);
        }
        canvas.restore();
        canvas.restore();
        return booleanValue;
    }

    public final void b1(boolean z10, boolean z11) {
        dg dgVar;
        se seVar;
        pd pdVar;
        rd rdVar = this.Q0;
        if (rdVar == null) {
            return;
        }
        if (this.w2 == 1 || ((pdVar = this.e1) != null && pdVar.getVisibility() == 0)) {
            this.h = 0.0f;
            this.n = 0.0f;
            E1();
            z11 = false;
        }
        dg dgVar2 = dg.f;
        dg dgVar3 = dg.e;
        if (!z10 || this.f2 != 0) {
            gf gfVar = this.U0;
            int i10 = gfVar == null ? org.telegram.messenger.vp.c1().getInt("selected_page", 0) : gfVar.getCurrentPage();
            dgVar = (i10 == 0 || !((this.J2 || this.K2) && ((seVar = this.E0) == null || TextUtils.isEmpty(seVar.getText())))) ? dgVar3 : i10 == 1 ? dg.c : dgVar2;
        } else if (!this.z0) {
            return;
        } else {
            dgVar = dg.d;
        }
        if (!this.z0 && dgVar == dgVar3) {
            dgVar3 = dgVar2;
        } else if (this.b || dgVar == dgVar3) {
            dgVar3 = dgVar;
        }
        rdVar.j(dgVar3, z11);
        if (dgVar3 == dgVar2 && this.U0 == null) {
            org.telegram.messenger.ui.b0(this.Q).V0(0, true, true, false);
            ArrayList arrayList = org.telegram.messenger.vp.r1(this.Q).d4;
            int min = Math.min(10, arrayList.size());
            for (int i11 = 0; i11 < min; i11++) {
                org.telegram.messenger.k6.k((CharSequence) arrayList.get(i11));
            }
        }
    }

    @Override // org.telegram.ui.Components.zw0
    public final boolean c() {
        org.telegram.ui.un unVar = this.P2;
        return unVar != null && unVar.c();
    }

    public final bf c0(org.telegram.messenger.jj jjVar, boolean z10) {
        bf bfVar = new bf(jjVar.I1, jjVar.k, true, true);
        if (z10) {
            se seVar = this.E0;
            CharSequence[] charSequenceArr = {seVar == null ? "" : seVar.getTextToUse()};
            ArrayList W = org.telegram.messenger.ui.b0(this.Q).W(charSequenceArr, true, true);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceArr[0].toString());
            org.telegram.messenger.jj.b(spannableStringBuilder, W, true, true, false, true, 0);
            bfVar.z = org.telegram.messenger.jj.A5(org.telegram.messenger.k6.m(spannableStringBuilder, org.telegram.ui.ActionBar.t6.o2.getFontMetricsInt(), false, null, 0), W, org.telegram.ui.ActionBar.t6.o2.getFontMetricsInt(), false);
        }
        return bfVar;
    }

    public final void c1() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.O2.getSystemService("accessibility");
        if (this.E0 == null || accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        try {
            this.E0.requestFocus();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.Components.qx0
    public final void d(TextWatcher textWatcher) {
        se seVar = this.E0;
        if (seVar != null) {
            seVar.addTextChangedListener(textWatcher);
            return;
        }
        if (this.H4 == null) {
            this.H4 = new ArrayList();
        }
        this.H4.add(textWatcher);
    }

    public final void d1(CharSequence charSequence, boolean z10) {
        se seVar = this.E0;
        if (seVar == null) {
            return;
        }
        this.R2 = true;
        seVar.setText(charSequence);
        this.E0.g(true);
        se seVar2 = this.E0;
        seVar2.setSelection(seVar2.getText().length());
        this.R2 = false;
        sf sfVar = this.Z2;
        if (sfVar != null) {
            sfVar.V0(this.E0.getText(), true, z10);
        }
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        be beVar;
        TLRPC.ChatFull chatFull;
        TLRPC.Chat L0;
        double d;
        ag.r rVar;
        if (i10 == org.telegram.messenger.zs.i4) {
            gf gfVar = this.U0;
            if (gfVar != null) {
                gfVar.P.g1();
            }
            df dfVar = this.H1;
            if (dfVar != null) {
                ArrayList arrayList = dfVar.n;
                while (r4 < arrayList.size()) {
                    ((xh.h0) arrayList.get(r4)).invalidate();
                    r4++;
                }
            }
            se seVar = this.E0;
            if (seVar != null) {
                seVar.postInvalidate();
                this.E0.q();
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.k2) {
            if (((Integer) objArr[0]).intValue() != this.G2) {
                return;
            }
            if (this.w2 != 0 && !this.m3 && !c()) {
                this.m3 = true;
                org.telegram.messenger.vp.r1(this.R.a).z4(this.c1 ? 7 : 1, 0, this.Q2, getThreadMessageId(), null);
            }
            RecordCircle recordCircle = this.N1;
            if (recordCircle != null) {
                recordCircle.setAmplitude(((Double) objArr[1]).doubleValue());
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.t) {
            se seVar2 = this.E0;
            if (seVar2 == null || !seVar2.isFocused()) {
                return;
            }
            org.telegram.messenger.i0.v1(this.E0);
            return;
        }
        int i12 = org.telegram.messenger.zs.m2;
        int i13 = org.telegram.messenger.zs.n2;
        int i14 = 5;
        if (i10 == i12 || i10 == i13) {
            if (((Integer) objArr[0]).intValue() == this.G2 && this.F2) {
                this.F2 = false;
                if (i10 != i13) {
                    K1(2, true);
                    return;
                }
                Integer num = (Integer) objArr[1];
                if (num.intValue() == 4) {
                    i14 = 4;
                } else if (this.c1 && num.intValue() == 5) {
                    i14 = 1;
                } else if (num.intValue() != 0) {
                    i14 = num.intValue() == 6 ? 2 : 3;
                }
                if (i14 != 3) {
                    K1(i14, true);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.l2) {
            if (((Integer) objArr[0]).intValue() != this.G2) {
                return;
            }
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            this.c1 = !booleanValue;
            zd zdVar = this.b1;
            if (zdVar != null) {
                zdVar.j(booleanValue ? dg.a : dg.b, true);
            }
            if (this.F2) {
                RecordCircle recordCircle2 = this.N1;
                if (recordCircle2 != null) {
                    recordCircle2.I = true;
                }
            } else {
                this.F2 = true;
                K1(0, true);
            }
            bg bgVar = this.Y0;
            if (bgVar != null) {
                bgVar.a(this.i1);
            }
            yf yfVar = this.l1;
            if (yfVar != null) {
                yfVar.h = false;
                return;
            }
            return;
        }
        byte[] bArr = null;
        if (i10 == org.telegram.messenger.zs.o2) {
            this.F2 = false;
            this.b3 = null;
            this.e3 = null;
            return;
        }
        if (i10 == org.telegram.messenger.zs.p2) {
            this.b3 = null;
            this.e3 = null;
            bg bgVar2 = this.Y0;
            if (bgVar2 != null) {
                bgVar2.a(this.i1);
            }
            F(true);
            this.F2 = true;
            K1(0, true);
            return;
        }
        if (i10 != org.telegram.messenger.zs.s2) {
            if (i10 == org.telegram.messenger.zs.u2) {
                Activity activity = this.O2;
                if (activity != null) {
                    activity.setVolumeControlStream(((Boolean) objArr[0]).booleanValue() ? 0 : TLObject.FLAG_31);
                    return;
                }
                return;
            }
            if (i10 == org.telegram.messenger.zs.e2) {
                if (this.d3 == null || !MediaController.B().I(this.d3)) {
                    return;
                }
                org.telegram.messenger.jj jjVar = MediaController.B().u0;
                org.telegram.messenger.jj jjVar2 = this.d3;
                jjVar2.b0 = jjVar.b0;
                jjVar2.g0 = jjVar.g0;
                return;
            }
            if (i10 == org.telegram.messenger.zs.z0) {
                rd rdVar = this.Q0;
                if (rdVar != null) {
                    rdVar.invalidate();
                    return;
                }
                return;
            }
            if (i10 == org.telegram.messenger.zs.L) {
                if (((Boolean) objArr[6]).booleanValue()) {
                    return;
                }
                long longValue = ((Long) objArr[3]).longValue();
                Integer num2 = (Integer) objArr[1];
                if (longValue != this.Q2 || (chatFull = this.d2) == null || chatFull.slowmode_seconds == 0 || org.telegram.messenger.jj.f3(num2.intValue()) || (L0 = org.telegram.messenger.vp.r1(this.R.a).L0(Long.valueOf(this.d2.id))) == null || org.telegram.messenger.w3.N(L0) || org.telegram.messenger.w3.h0(L0)) {
                    return;
                }
                TLRPC.ChatFull chatFull2 = this.d2;
                int currentTime = ConnectionsManager.getInstance(this.Q).getCurrentTime();
                TLRPC.ChatFull chatFull3 = this.d2;
                chatFull2.slowmode_next_send_date = currentTime + chatFull3.slowmode_seconds;
                chatFull3.flags |= 262144;
                setSlowModeTimer(chatFull3.slowmode_next_send_date);
                return;
            }
            if (i10 == org.telegram.messenger.zs.n1) {
                if (this.d2 != null) {
                    R1();
                    return;
                }
                return;
            }
            if (i10 == org.telegram.messenger.zs.t2) {
                this.b3 = null;
                this.e3 = null;
                K1(4, true);
                return;
            }
            if (i10 != org.telegram.messenger.zs.R2) {
                if (i10 == org.telegram.messenger.zs.Y2) {
                    H1(true);
                    return;
                } else {
                    if (i10 == org.telegram.messenger.zs.f5 && this.D1 && (beVar = this.J0) != null) {
                        beVar.setLocked(!org.telegram.messenger.d20.i(this.Q).q());
                        return;
                    }
                    return;
                }
            }
            long longValue2 = ((Long) objArr[0]).longValue();
            TL_bots.BotMenuButton botMenuButton = (TL_bots.BotMenuButton) objArr[1];
            if (longValue2 == this.Q2) {
                if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                    TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                    this.i0 = tL_botMenuButton.text;
                    this.j0 = tL_botMenuButton.url;
                    this.q5 = 3;
                } else if (this.p2) {
                    this.q5 = 2;
                } else {
                    this.q5 = 1;
                }
                A1(false);
                return;
            }
            return;
        }
        if (((Integer) objArr[0]).intValue() != this.G2) {
            return;
        }
        this.i1 = 0L;
        Object obj = objArr[1];
        if (obj instanceof org.telegram.messenger.x20) {
            org.telegram.messenger.x20 x20Var = (org.telegram.messenger.x20) obj;
            this.e3 = x20Var;
            String str = (String) objArr[2];
            this.c3 = str;
            ArrayList<Bitmap> arrayList2 = (ArrayList) objArr[3];
            this.i1 = x20Var.r;
            j71 j71Var = this.f1;
            if (j71Var != null) {
                j71Var.setVideoPath(str);
                this.f1.setKeyframes(arrayList2);
                this.f1.setVisibility(0);
                this.f1.setMinProgressDiff(1000.0f / this.e3.r);
                u0();
            }
            K1(3, true);
            F(false);
            return;
        }
        this.b3 = (TLRPC.TL_document) obj;
        this.c3 = (String) objArr[2];
        boolean z10 = objArr.length >= 4 && ((Boolean) objArr[3]).booleanValue();
        float floatValue = objArr.length >= 5 ? ((Float) objArr[4]).floatValue() : 0.0f;
        float floatValue2 = objArr.length >= 6 ? ((Float) objArr[5]).floatValue() : 1.0f;
        if (this.b3 == null) {
            sf sfVar = this.Z2;
            if (sfVar != null) {
                sfVar.E(null, true, 0, 0, 0L);
                return;
            }
            return;
        }
        T();
        if (this.e1 == null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.out = true;
        tL_message.id = 0;
        tL_message.peer_id = new TLRPC.TL_peerUser();
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_message.from_id = tL_peerUser;
        TLRPC.Peer peer = tL_message.peer_id;
        long e = org.telegram.messenger.d20.i(this.Q).e();
        tL_peerUser.user_id = e;
        peer.user_id = e;
        tL_message.date = (int) (System.currentTimeMillis() / 1000);
        tL_message.message = "";
        tL_message.attachPath = this.c3;
        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
        tL_message.media = tL_messageMediaDocument;
        tL_messageMediaDocument.flags |= 3;
        tL_messageMediaDocument.document = this.b3;
        tL_message.flags |= 768;
        this.d3 = new org.telegram.messenger.jj(org.telegram.messenger.d20.s0, tL_message, false, true);
        this.e1.setAlpha(1.0f);
        this.e1.setVisibility(0);
        this.g1.setVisibility(0);
        this.g1.setAlpha(0.0f);
        this.g1.setScaleY(0.0f);
        this.g1.setScaleX(0.0f);
        int i15 = 0;
        while (true) {
            if (i15 >= this.b3.attributes.size()) {
                d = 0.0d;
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = this.b3.attributes.get(i15);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                d = documentAttribute.duration;
                break;
            }
            i15++;
        }
        int i16 = 0;
        while (true) {
            if (i16 >= this.b3.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute2 = this.b3.attributes.get(i16);
            if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                byte[] bArr2 = documentAttribute2.waveform;
                if (bArr2 == null || bArr2.length == 0) {
                    documentAttribute2.waveform = MediaController.getWaveform(this.c3);
                }
                bArr = documentAttribute2.waveform;
            } else {
                i16++;
            }
        }
        if (z10 && (rVar = this.r1) != null) {
            this.v1 = 0.0f;
            rVar.setAlpha(0.0f);
            rVar.setScaleX(0.0f);
            rVar.setScaleY(0.0f);
        }
        this.i1 = (long) (1000.0d * d);
        nj0 nj0Var = this.h1;
        String str2 = this.c3;
        if (!nj0Var.Q) {
            nj0Var.r = (float) d;
            nj0Var.s = floatValue;
            nj0Var.w = floatValue2;
            nj0Var.x = false;
            nj0Var.h.t(org.telegram.messenger.i0.g0((int) Math.round(Math.max(1.0d, d)), false, false), false, true);
            nj0Var.f.a(false, false);
            if (nj0Var.n == null) {
                u61 u61Var = new u61();
                nj0Var.n = u61Var;
                u61Var.J = new n2.u(nj0Var, 13);
            }
            nj0Var.n.j0(Uri.fromFile(new File(str2)), "other");
            nj0Var.K = 0;
            nj0Var.L = bArr;
            nj0Var.invalidate();
        }
        F(false);
        if (z10) {
            U();
            V();
            T();
            this.w2 = 1;
            this.N1.c(false);
            this.v3.set(this.N1, Float.valueOf(1.0f));
            wf wfVar = this.O1;
            if (wfVar != null) {
                wfVar.setVisibility(0);
                this.O1.setAlpha(1.0f);
            }
        }
        K1(3, !z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        gf gfVar = this.U0;
        if (gfVar == null || gfVar.getVisibility() != 0 || this.U0.getStickersExpandOffset() == 0.0f) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.save();
        canvas.clipRect(0, org.telegram.messenger.i0.L(2.0f), getMeasuredWidth(), getMeasuredHeight());
        canvas.translate(0.0f, -this.U0.getStickersExpandOffset());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        View view2 = this.G1;
        pd pdVar = this.z1;
        boolean z10 = view == view2 || view == pdVar;
        if (z10) {
            float measuredHeight = getMeasuredHeight() - this.j5.f;
            canvas.save();
            if (view == pdVar) {
                canvas.clipRect(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
            }
            if (view == this.G1) {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
            }
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (z10) {
            canvas.restore();
        }
        return drawChild;
    }

    public final int e0(int i10) {
        org.telegram.ui.ActionBar.p6 p6Var = this.W3;
        return p6Var != null ? p6Var.h(i10) : org.telegram.ui.ActionBar.t6.x0(null, i10, false);
    }

    public final void e1(boolean z10, boolean z11) {
        this.H2 = z10;
        F(z11);
    }

    public final boolean f0() {
        return this.q5 == 3;
    }

    public void f1(float f7, float f10, float f11, boolean z10) {
        int L;
        float f12 = 1.0f - f11;
        float f13 = f7 * f12;
        float f14 = f10 * f12;
        this.r = (f11 * 0.5f) + 0.5f;
        this.s = f11;
        E1();
        float f15 = -f13;
        this.Q0.setTranslationX(f15);
        if (this.E0 == null) {
            L = 0;
        } else {
            int L2 = org.telegram.messenger.i0.L(40.0f);
            do0 do0Var = this.p0;
            L = L2 + ((do0Var == null || do0Var.getVisibility() != 0) ? 0 : org.telegram.messenger.i0.L(18.0f));
        }
        this.H = f15 - (L * f12);
        ei0 ei0Var = this.g1;
        if (ei0Var != null) {
            ei0Var.setTranslationX(f15);
        }
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.setTranslationX(f14);
        }
        wf wfVar = this.O1;
        if (wfVar != null) {
            wfVar.setTranslationX(f14);
        }
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            linearLayout.setTranslationX(f15);
        }
        pd pdVar = this.A1;
        pdVar.setTranslationX(f14);
        pdVar.setAlpha(f11);
        ImageView imageView = this.w1;
        if (imageView != null) {
            imageView.setAlpha(imageView.getScaleX() > 0.7f ? f11 : 0.0f);
        }
        boolean z11 = true;
        if (z10 && f11 != 1.0f) {
            z11 = false;
        }
        this.J = z11;
        this.D = f14;
        this.F = f11;
        z1();
        I1();
        float f16 = f13 * f12;
        if (this.I != f16) {
            this.I = f16;
            nj0 nj0Var = this.h1;
            if (nj0Var != null) {
                nj0Var.setTranslationX(f16);
                this.h1.invalidate();
            }
        }
        if (this.E0 != null) {
            float T1 = org.telegram.messenger.i0.T1(0.88f, 1.0f, f11);
            this.E0.setPivotX(0.0f);
            this.E0.setPivotY(r9.getMeasuredHeight() / 2.0f);
            this.E0.setScaleX(T1);
            this.E0.setScaleY(T1);
            this.E0.setHintRightOffset(org.telegram.messenger.i0.W1(f11, org.telegram.messenger.i0.L(60.0f), 0));
        }
    }

    public final boolean g0() {
        se seVar = this.E0;
        return seVar != null && seVar.length() > 0;
    }

    public final void g1(boolean z10) {
        if (this.p5 == z10) {
            return;
        }
        this.p5 = z10;
        this.r1.setVisibility(z10 ? 8 : 0);
        if (z10) {
            org.telegram.messenger.i0.E2(this.I1);
        }
        if (z10) {
            this.b1.setVisibility(8);
        } else {
            N0();
        }
        if (!z10) {
            this.c0 = -1;
            NumberTextView numberTextView = this.b0;
            if (numberTextView != null) {
                numberTextView.setVisibility(8);
            }
        }
        G1(this.P4);
        F(false);
    }

    public org.telegram.ui.ActionBar.m1 getAdjustPanLayoutHelper() {
        return this.U;
    }

    public int getAnimatedTop() {
        return this.T1;
    }

    public ImageView getAttachButton() {
        return this.r1;
    }

    public View getAudioVideoButtonContainer() {
        return this.Z0;
    }

    public int getBackgroundTop() {
        int top = getTop();
        View view = this.G1;
        return (view == null || view.getVisibility() != 0) ? top : top + this.G1.getLayoutParams().height;
    }

    public xh.a3 getBotWebViewButton() {
        if (this.k0 == null) {
            Context context = getContext();
            xh.a3 a3Var = new xh.a3(context);
            a3Var.a = new Path();
            a3Var.c = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ci, false);
            a3Var.d = true;
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setSingleLine();
            textView.setAlpha(0.0f);
            textView.setGravity(17);
            textView.setTypeface(org.telegram.messenger.i0.o());
            a3Var.addView(textView, w7.b6.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context, null);
            radialProgressView.setSize(org.telegram.messenger.i0.L(18.0f));
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.0f);
            radialProgressView.setScaleY(0.0f);
            a3Var.addView(radialProgressView, w7.b6.d(28, 28.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            View view = new View(context);
            a3Var.h = view;
            int i10 = org.telegram.ui.ActionBar.t6.Ei;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i10, false), 2, -1);
            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
            view.setBackground(h02);
            org.telegram.ui.ActionBar.a7.k(view, h02, null, N, null);
            a3Var.addView(view, w7.b6.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            a3Var.setWillNotDraw(false);
            this.k0 = a3Var;
            a3Var.setVisibility(8);
            N();
            this.k0.setBotMenuButton(this.l0);
            this.y1.addView(this.k0, w7.b6.e(-1, -1, 80));
        }
        return this.k0;
    }

    public int getCursorPosition() {
        se seVar = this.E0;
        if (seVar == null) {
            return 0;
        }
        return seVar.getSelectionStart();
    }

    public CharSequence getDraftMessage() {
        if (this.Z1 != null) {
            if (TextUtils.isEmpty(this.V1)) {
                return null;
            }
            return this.V1;
        }
        if (this.E0 == null || !g0()) {
            return null;
        }
        return this.E0.getText();
    }

    @Override // org.telegram.ui.Components.qx0
    public Editable getEditText() {
        se seVar = this.E0;
        if (seVar == null) {
            return null;
        }
        return seVar.getText();
    }

    public org.telegram.messenger.jj getEditingMessageObject() {
        return this.Z1;
    }

    public long getEffectId() {
        return this.S4;
    }

    public View getEmojiButton() {
        return this.Q0;
    }

    public int getEmojiPadding() {
        return this.A2;
    }

    public vy getEmojiView() {
        return this.U0;
    }

    public float getExitTransition() {
        return this.m4;
    }

    @Override // org.telegram.ui.Components.qx0
    public CharSequence getFieldText() {
        if (this.E0 == null || !g0()) {
            return null;
        }
        return this.E0.getText();
    }

    public int getHeightWithTopView() {
        int measuredHeight = getMeasuredHeight();
        View view = this.G1;
        return (view == null || view.getVisibility() != 0) ? measuredHeight : (int) (measuredHeight - ((1.0f - getTopViewEnterProgress()) * this.G1.getLayoutParams().height));
    }

    public float getLockAnimatedTranslation() {
        return this.l4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x007c, code lost:
    
        if (r6.e3 == null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int getMessagesCount() {
        org.telegram.messenger.nj njVar;
        org.telegram.messenger.lj ljVar;
        org.telegram.ui.un unVar = this.P2;
        int size = (unVar == null || (njVar = unVar.v5) == null || (ljVar = njVar.b) == null) ? 0 : ljVar.g.size();
        se seVar = this.E0;
        if (seVar == null || TextUtils.isEmpty(seVar.getText())) {
            if (this.d3 == null) {
            }
            size++;
        } else {
            String obj = this.E0.getText().toString();
            org.telegram.messenger.r5 r5Var = org.telegram.messenger.qz.I;
            String trim = obj.trim();
            if (trim.length() != 0) {
                while (obj.startsWith("\n")) {
                    obj = obj.substring(1);
                }
                while (obj.endsWith("\n")) {
                    obj = c3.i0.m(1, 0, obj);
                }
                trim = obj;
            }
            int t12 = org.telegram.messenger.vp.r1(this.R.a).t1();
            if (trim.length() != 0) {
                size += (int) Math.ceil(trim.length() / t12);
            }
            size++;
        }
        return Math.max(1, size);
    }

    public RecordCircle getRecordCircle() {
        return this.N1;
    }

    public long getRecordTimerStartTime() {
        bg bgVar = this.Y0;
        if (bgVar == null || !bgVar.a) {
            return 0L;
        }
        return bgVar.d;
    }

    public org.telegram.messenger.jj getReplyingMessageObject() {
        return this.T2;
    }

    public int getSelectionLength() {
        se seVar = this.E0;
        if (seVar == null) {
            return 0;
        }
        try {
            return seVar.getSelectionEnd() - this.E0.getSelectionStart();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
            return 0;
        }
    }

    public View getSendButton() {
        return getSendButtonInternal().getVisibility() == 0 ? getSendButtonInternal() : this.Z0;
    }

    public View getSendButtonInternal() {
        return this.J0;
    }

    public org.telegram.messenger.oj getSendMessageSuggestionParams() {
        org.telegram.ui.un unVar = this.P2;
        if (unVar != null) {
            return unVar.w5;
        }
        return null;
    }

    public long getSendMonoForumPeerId() {
        org.telegram.ui.un unVar = this.P2;
        if (unVar != null) {
            return unVar.a9();
        }
        return 0L;
    }

    public do0 getSenderSelectView() {
        return this.p0;
    }

    public uu0 getSizeNotifierLayout() {
        return this.m1;
    }

    public float getSlideToCancelProgress() {
        return this.j4;
    }

    public CharSequence getSlowModeTimer() {
        if (this.G0 > 0) {
            return ((org.telegram.ui.ActionBar.u5) this.F0.c).getText();
        }
        return null;
    }

    public long getStarsPrice() {
        org.telegram.ui.un unVar = this.P2;
        return unVar != null ? unVar.getMessagesController().M1(unVar.a()) : org.telegram.messenger.vp.r1(this.Q).M1(this.Q2);
    }

    public Drawable getStickersArrowDrawable() {
        return this.F3;
    }

    public int getStickersExpandedHeight() {
        return this.D3;
    }

    public ImageView getSuggestButton() {
        return this.w1;
    }

    public TLRPC.TL_textWithEntities getTextWithEntities() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {new SpannableStringBuilder(getEditText())};
        tL_textWithEntities.entities = org.telegram.messenger.ui.b0(org.telegram.messenger.d20.s0).W(charSequenceArr, true, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        return tL_textWithEntities;
    }

    public float getTopViewEnterProgress() {
        return this.k5.e;
    }

    public float getTopViewHeight() {
        View view = this.G1;
        if (view == null || view.getVisibility() != 0) {
            return 0.0f;
        }
        return this.G1.getLayoutParams().height;
    }

    public float getTopViewTranslation() {
        View view = this.G1;
        if (view == null || view.getVisibility() == 8) {
            return 0.0f;
        }
        return this.G1.getTranslationY();
    }

    public h41 getTrendingStickersAlert() {
        return this.a3;
    }

    public int getVisibleEmojiPadding() {
        if (this.W0) {
            return this.A2;
        }
        return 0;
    }

    public float getVisualHeight() {
        float f7 = this.T1;
        View view = this.G1;
        if (view != null && view.getVisibility() == 0) {
            f7 += (1.0f - getTopViewEnterProgress()) * this.G1.getLayoutParams().height;
        }
        return getMeasuredHeight() - f7;
    }

    public final void h0() {
        vh.p2 p2Var = this.N;
        if (p2Var != null) {
            p2Var.e(true);
        }
        vh.p2 p2Var2 = this.L;
        if (p2Var2 != null) {
            p2Var2.e(true);
        }
    }

    public final void h1(CharSequence charSequence, boolean z10) {
        this.e = charSequence;
        this.f = null;
        F1(z10);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i0(boolean z10) {
        j0(z10, false, true);
    }

    public final void i1(boolean z10, boolean z11) {
        zd zdVar = this.b1;
        if (zdVar == null) {
            return;
        }
        this.c1 = z10;
        if (z11) {
            SharedPreferences d12 = org.telegram.messenger.vp.d1();
            boolean z12 = false;
            if (org.telegram.messenger.o5.z(this.Q2)) {
                TLRPC.Chat L0 = org.telegram.messenger.vp.r1(this.R.a).L0(Long.valueOf(-this.Q2));
                if (org.telegram.messenger.w3.T(L0) && !L0.megagroup) {
                    z12 = true;
                }
            }
            d12.edit().putBoolean(z12 ? "currentModeVideoChannel" : "currentModeVideo", z10).apply();
        }
        zdVar.j(this.c1 ? dg.b : dg.a, z11);
        zdVar.setContentDescription(org.telegram.messenger.cd.L0(this.c1 ? 2131754736 : 2131754734, null));
        this.Z0.setContentDescription(org.telegram.messenger.cd.L0(this.c1 ? 2131754736 : 2131754734, null));
        zdVar.sendAccessibilityEvent(8);
    }

    public final void j(TLRPC.Document document) {
        org.telegram.messenger.ui.b0(this.Q).c(document, (int) (System.currentTimeMillis() / 1000), true);
        gf gfVar = this.U0;
        if (gfVar == null || document == null) {
            return;
        }
        boolean isEmpty = gfVar.i1.isEmpty();
        gfVar.X();
        if (isEmpty) {
            gfVar.Y(false);
        }
    }

    public final boolean j0(boolean z10, boolean z11, boolean z12) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        if (q0()) {
            if (this.f2 == 1 && (tL_replyKeyboardMarkup = this.n2) != null && z10 && this.m2 != null) {
                if (!tL_replyKeyboardMarkup.is_persistent) {
                    org.telegram.messenger.vp.r1(this.Q).f7.edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.m2.f1()).apply();
                }
            }
            if ((z10 && this.R1 != 0) || z11) {
                k1(0, true);
                gf gfVar = this.U0;
                if (gfVar != null) {
                    gfVar.t(true);
                }
                se seVar = this.E0;
                if (seVar != null) {
                    seVar.requestFocus();
                }
                l1(false, true, false, true);
                if (this.y3) {
                    F(true);
                    return true;
                }
            } else {
                if (this.R1 == 0) {
                    if (this.z3) {
                        l1(false, true, false, true);
                        return true;
                    }
                    r1(0, 0, true, z12 && !z10);
                    return true;
                }
                k1(0, false);
                this.U0.t(false);
                se seVar2 = this.E0;
                if (seVar2 != null) {
                    seVar2.requestFocus();
                }
            }
            return true;
        }
        return false;
    }

    public final void j1(org.telegram.messenger.jj jjVar, org.telegram.ui.kn knVar, org.telegram.messenger.jj jjVar2) {
        org.telegram.messenger.jj jjVar3;
        org.telegram.ui.un unVar = this.P2;
        boolean z10 = (unVar == null || !unVar.H9() || this.U2 == jjVar2) ? false : true;
        if (jjVar != null) {
            if (this.W2 == null && (jjVar3 = this.m2) != this.T2) {
                this.W2 = jjVar3;
            }
            this.T2 = jjVar;
            this.V2 = knVar;
            this.U2 = jjVar2;
            if (unVar == null || !unVar.v4 || unVar.l4 != jjVar) {
                X0(jjVar, true, true);
            }
        } else if (this.T2 == this.m2) {
            this.T2 = null;
            this.U2 = null;
            this.V2 = null;
            X0(this.W2, true, false);
            this.W2 = null;
        } else {
            this.T2 = null;
            this.V2 = null;
            this.U2 = null;
        }
        B(true);
        sf sfVar = this.Z2;
        TL_stories.StoryItem P0 = sfVar != null ? sfVar.P0() : null;
        MediaController B = MediaController.B();
        org.telegram.messenger.jj threadMessage = getThreadMessage();
        B.p1 = jjVar;
        B.q1 = threadMessage;
        B.r1 = P0;
        F1(z10);
    }

    public final void k(TLRPC.Document document) {
        Q();
        gf gfVar = this.U0;
        int i10 = gfVar.c1;
        org.telegram.messenger.ui.b0(i10).d(0, null, document, (int) (System.currentTimeMillis() / 1000), false);
        boolean isEmpty = gfVar.j1.isEmpty();
        gfVar.j1 = org.telegram.messenger.ui.b0(i10).i0(0, true);
        ny nyVar = gfVar.y0;
        if (nyVar != null) {
            nyVar.f();
        }
        if (isEmpty) {
            gfVar.Y(false);
        }
    }

    public final void k0(boolean z10) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2 = this.u2;
        if (animatorSet2 == null || !animatorSet2.isRunning()) {
            this.c3 = null;
            this.b3 = null;
            this.d3 = null;
            this.e3 = null;
            j71 j71Var = this.f1;
            int i10 = 1;
            if (j71Var != null) {
                j71Var.a(true);
            }
            zd zdVar = this.b1;
            if (zdVar != null) {
                zdVar.setVisibility(0);
            }
            od odVar = this.d4;
            od odVar2 = this.Z3;
            od odVar3 = this.b4;
            Property property = View.SCALE_Y;
            Property property2 = View.SCALE_X;
            rd rdVar = this.Q0;
            Property property3 = View.ALPHA;
            ag.r rVar = this.r1;
            if (z10) {
                if (rVar != null) {
                    this.v1 = 0.0f;
                    rVar.setAlpha(0.0f);
                    rVar.setScaleX(0.0f);
                    rVar.setScaleY(0.0f);
                }
                this.n = 0.0f;
                this.h = 0.0f;
                E1();
                this.u2 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(rdVar, odVar3, this.A0 ? 0.5f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(rdVar, odVar2, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.g1, (Property<ei0, Float>) property3, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.g1, (Property<ei0, Float>) property2, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.g1, (Property<ei0, Float>) property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.e1, (Property<pd, Float>) property3, 0.0f));
                if (rVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator = this.q1;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        this.q1 = null;
                    }
                    this.v1 = 1.0f;
                    arrayList.add(ObjectAnimator.ofFloat(rVar, (Property<ag.r, Float>) property3, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(rVar, (Property<ag.r, Float>) property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(rVar, (Property<ag.r, Float>) property, 1.0f));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.E0, (Property<se, Float>) property3, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.E0, odVar, 0.0f));
                wf wfVar = this.O1;
                if (wfVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(wfVar, (Property<wf, Float>) property3, 0.0f));
                    this.O1.a();
                }
                this.u2.playTogether(arrayList);
                xh.w wVar = this.l0;
                if (wVar != null) {
                    wVar.setAlpha(0.0f);
                    this.l0.setScaleY(0.0f);
                    this.l0.setScaleX(0.0f);
                    this.u2.playTogether(ObjectAnimator.ofFloat(this.l0, (Property<xh.w, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.l0, (Property<xh.w, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.l0, (Property<xh.w, Float>) property, 1.0f));
                }
                this.u2.setDuration(150L);
                this.u2.addListener(new ce(this, i10));
            } else {
                ei0 ei0Var = this.g1;
                if (ei0Var != null) {
                    ei0Var.d();
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                boolean z11 = this.c1;
                Property property4 = View.TRANSLATION_X;
                if (z11) {
                    arrayList2.add(ObjectAnimator.ofFloat(this.f1, (Property<j71, Float>) property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.f1, (Property<j71, Float>) property4, -org.telegram.messenger.i0.L(20.0f)));
                    arrayList2.add(ObjectAnimator.ofFloat(this.E0, odVar, 0.0f));
                    wf wfVar2 = this.O1;
                    if (wfVar2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(wfVar2, (Property<wf, Float>) property3, 0.0f));
                        this.O1.a();
                    }
                    animatorSet3.playTogether(arrayList2);
                    if (this.s == 1.0f) {
                        animatorSet3.playTogether(ObjectAnimator.ofFloat(this.E0, (Property<se, Float>) property3, 1.0f));
                    } else {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.E0, (Property<se, Float>) property3, 1.0f);
                        ofFloat.setStartDelay(750L);
                        ofFloat.setDuration(200L);
                        animatorSet3.playTogether(ofFloat);
                    }
                } else {
                    se seVar = this.E0;
                    if (seVar == null || this.s != 1.0f) {
                        this.G = 0.0f;
                        I1();
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.E0, (Property<se, Float>) property3, 1.0f);
                        ofFloat2.setStartDelay(750L);
                        ofFloat2.setDuration(200L);
                        animatorSet3.playTogether(ofFloat2);
                    } else {
                        seVar.setAlpha(1.0f);
                        this.G = 0.0f;
                        I1();
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(this.h1, (Property<nj0, Float>) property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.h1, (Property<nj0, Float>) property4, -org.telegram.messenger.i0.L(20.0f)));
                    wf wfVar3 = this.O1;
                    if (wfVar3 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(wfVar3, (Property<wf, Float>) property3, 0.0f));
                        this.O1.a();
                    }
                    animatorSet3.playTogether(arrayList2);
                }
                animatorSet3.setDuration(200L);
                if (rVar != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.q1;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.q1 = null;
                    }
                    this.v1 = 0.0f;
                    rVar.setAlpha(0.0f);
                    rVar.setScaleX(0.0f);
                    rVar.setScaleY(0.0f);
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    this.v1 = 1.0f;
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(rVar, (Property<ag.r, Float>) property3, 1.0f), ObjectAnimator.ofFloat(rVar, (Property<ag.r, Float>) property2, 1.0f), ObjectAnimator.ofFloat(rVar, (Property<ag.r, Float>) property, 1.0f));
                    animatorSet4.setDuration(150L);
                    animatorSet = animatorSet4;
                } else {
                    animatorSet = null;
                }
                this.h = 0.0f;
                this.n = 0.0f;
                E1();
                AnimatorSet animatorSet5 = new AnimatorSet();
                animatorSet5.playTogether(ObjectAnimator.ofFloat(this.g1, (Property<ei0, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.g1, (Property<ei0, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.g1, (Property<ei0, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.g1, (Property<ei0, Float>) property3, 0.0f), ObjectAnimator.ofFloat(rdVar, odVar3, this.A0 ? 0.5f : 1.0f), ObjectAnimator.ofFloat(rdVar, odVar2, 1.0f));
                xh.w wVar2 = this.l0;
                if (wVar2 != null) {
                    wVar2.setAlpha(0.0f);
                    this.l0.setScaleY(0.0f);
                    this.l0.setScaleX(0.0f);
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this.l0, (Property<xh.w, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.l0, (Property<xh.w, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.l0, (Property<xh.w, Float>) property, 1.0f));
                }
                animatorSet5.setDuration(150L);
                animatorSet5.setStartDelay(600L);
                AnimatorSet animatorSet6 = new AnimatorSet();
                this.u2 = animatorSet6;
                if (animatorSet != null) {
                    animatorSet6.playTogether(animatorSet3, animatorSet, animatorSet5);
                } else {
                    animatorSet6.playTogether(animatorSet3, animatorSet5);
                }
                this.u2.addListener(new ve(this));
            }
            AnimatorSet animatorSet7 = this.u2;
            if (animatorSet7 != null) {
                animatorSet7.start();
            }
            wf wfVar4 = this.O1;
            if (wfVar4 != null) {
                wfVar4.invalidate();
            }
        }
    }

    public final void k1(int i10, boolean z10) {
        boolean z11 = i10 != 0;
        if (z11 != (this.R1 != 0)) {
            ValueAnimator valueAnimator = this.v0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.v0.cancel();
            }
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.w0, z11 ? 1.0f : 0.0f);
                this.v0 = ofFloat;
                ofFloat.addUpdateListener(new sc(this, 4));
                this.v0.addListener(new ge(this, z11, 3));
                this.v0.setDuration(220L);
                this.v0.setInterpolator(gr.f);
                this.v0.start();
            } else {
                this.w0 = z11 ? 1.0f : 0.0f;
                gf gfVar = this.U0;
                if (gfVar != null) {
                    gfVar.Z();
                }
            }
        }
        this.R1 = i10;
    }

    public final ValueAnimator l(float f7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J1.a, f7);
        ofFloat.addUpdateListener(new sc(this, 5));
        return ofFloat;
    }

    public final void l0() {
        this.c3 = null;
        this.b3 = null;
        this.d3 = null;
        this.e3 = null;
        j71 j71Var = this.f1;
        if (j71Var != null) {
            j71Var.a(true);
        }
        nj0 nj0Var = this.h1;
        if (nj0Var != null) {
            nj0Var.setAlpha(1.0f);
            this.h1.setTranslationX(0.0f);
        }
        j71 j71Var2 = this.f1;
        if (j71Var2 != null) {
            j71Var2.setAlpha(1.0f);
            this.f1.setTranslationX(0.0f);
        }
        se seVar = this.E0;
        if (seVar != null) {
            seVar.setAlpha(1.0f);
            this.G = 0.0f;
            I1();
            this.E0.requestFocus();
        }
        pd pdVar = this.e1;
        if (pdVar != null) {
            pdVar.setVisibility(8);
        }
        u0();
    }

    public final void l1(boolean z10, boolean z11, boolean z12, boolean z13) {
        final int i10 = 1;
        org.telegram.ui.ActionBar.m1 m1Var = this.U;
        if ((m1Var != null && m1Var.f) || this.l3 || this.U0 == null) {
            return;
        }
        if (z12 || this.z3 != z10) {
            this.z3 = z10;
            sf sfVar = this.Z2;
            if (sfVar != null) {
                sfVar.d1();
            }
            Point point = org.telegram.messenger.i0.q;
            final int i11 = point.x > point.y ? this.y2 : this.x2;
            AnimatorSet animatorSet = this.B3;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.B3 = null;
            }
            boolean z14 = this.z3;
            e2.f fVar = this.L3;
            org.telegram.ui.Cells.g1 g1Var = this.t3;
            final int i12 = 0;
            uu0 uu0Var = this.m1;
            if (z14) {
                if (z13) {
                    org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.j1, 1);
                }
                int height = uu0Var.getHeight();
                this.o1 = height;
                int L = ((((height - org.telegram.messenger.i0.m) - org.telegram.messenger.i0.n) - org.telegram.messenger.i0.L(6.0f)) - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - getHeight();
                this.D3 = L;
                if (this.R1 == 2) {
                    this.D3 = Math.min(L, org.telegram.messenger.i0.L(175.0f) + i11);
                }
                if (this.h5 == null) {
                    this.U0.getLayoutParams().height = this.D3;
                }
                uu0Var.requestLayout();
                if (this.y4) {
                    uu0Var.setForeground(new jh.g(this));
                }
                se seVar = this.E0;
                if (seVar != null) {
                    int selectionStart = seVar.getSelectionStart();
                    int selectionEnd = this.E0.getSelectionEnd();
                    se seVar2 = this.E0;
                    seVar2.setText(seVar2.getText());
                    this.E0.setSelection(selectionStart, selectionEnd);
                }
                if (z11) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    if (this.h5 != null) {
                        animatorSet2.playTogether(ValueAnimator.ofInt(-(this.D3 - i11)), ValueAnimator.ofInt(-(this.D3 - i11)), ObjectAnimator.ofFloat(this.F3, "animationProgress", 1.0f));
                    } else {
                        animatorSet2.playTogether(ObjectAnimator.ofInt(this, g1Var, -(this.D3 - i11)), ObjectAnimator.ofInt(this.U0, g1Var, -(this.D3 - i11)), ObjectAnimator.ofFloat(this.F3, "animationProgress", 1.0f));
                    }
                    animatorSet2.setDuration(300L);
                    animatorSet2.setInterpolator(gr.f);
                    if (this.h5 == null) {
                        ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.ad
                            public final /* synthetic */ ChatActivityEnterView b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                int i13 = i12;
                                int i14 = i11;
                                ChatActivityEnterView chatActivityEnterView = this.b;
                                switch (i13) {
                                    case 0:
                                        int i15 = ChatActivityEnterView.s5;
                                        chatActivityEnterView.C3 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.D3 - i14)));
                                        chatActivityEnterView.m1.invalidate();
                                        break;
                                    default:
                                        int i16 = ChatActivityEnterView.s5;
                                        chatActivityEnterView.C3 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.D3 - i14));
                                        chatActivityEnterView.m1.invalidate();
                                        break;
                                }
                            }
                        });
                    }
                    animatorSet2.addListener(new ce(this, 12));
                    this.B3 = animatorSet2;
                    this.U0.setLayerType(2, null);
                    fVar.d();
                    this.C3 = 0.0f;
                    uu0Var.invalidate();
                    animatorSet2.start();
                } else {
                    this.C3 = 1.0f;
                    if (this.h5 == null) {
                        setTranslationY(-(this.D3 - i11));
                        this.U0.setTranslationY(-(this.D3 - i11));
                    }
                    AnimatedArrowDrawable animatedArrowDrawable = this.F3;
                    if (animatedArrowDrawable != null) {
                        animatedArrowDrawable.setAnimationProgress(1.0f);
                    }
                }
                hh.f fVar2 = this.h5;
                if (fVar2 != null) {
                    ((hh.i) fVar2).h(this.D3);
                }
            } else {
                if (z13) {
                    org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.k1, 1);
                }
                if (z11) {
                    this.A3 = true;
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    if (this.h5 != null) {
                        animatorSet3.playTogether(ValueAnimator.ofInt(0), ValueAnimator.ofInt(0), ObjectAnimator.ofFloat(this.F3, "animationProgress", 0.0f));
                    } else {
                        animatorSet3.playTogether(ObjectAnimator.ofInt(this, g1Var, 0), ObjectAnimator.ofInt(this.U0, g1Var, 0), ObjectAnimator.ofFloat(this.F3, "animationProgress", 0.0f));
                    }
                    animatorSet3.setDuration(300L);
                    animatorSet3.setInterpolator(gr.f);
                    if (this.h5 == null) {
                        ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.ad
                            public final /* synthetic */ ChatActivityEnterView b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                int i13 = i10;
                                int i14 = i11;
                                ChatActivityEnterView chatActivityEnterView = this.b;
                                switch (i13) {
                                    case 0:
                                        int i15 = ChatActivityEnterView.s5;
                                        chatActivityEnterView.C3 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.D3 - i14)));
                                        chatActivityEnterView.m1.invalidate();
                                        break;
                                    default:
                                        int i16 = ChatActivityEnterView.s5;
                                        chatActivityEnterView.C3 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.D3 - i14));
                                        chatActivityEnterView.m1.invalidate();
                                        break;
                                }
                            }
                        });
                    }
                    animatorSet3.addListener(new mf(this, i11, i10));
                    this.C3 = 1.0f;
                    uu0Var.invalidate();
                    this.B3 = animatorSet3;
                    this.U0.setLayerType(2, null);
                    fVar.d();
                    animatorSet3.start();
                } else {
                    this.C3 = 0.0f;
                    if (this.h5 == null) {
                        setTranslationY(0.0f);
                        this.U0.setTranslationY(0.0f);
                        this.U0.getLayoutParams().height = i11;
                    }
                    uu0Var.requestLayout();
                    uu0Var.setForeground(null);
                    uu0Var.setWillNotDraw(false);
                    AnimatedArrowDrawable animatedArrowDrawable2 = this.F3;
                    if (animatedArrowDrawable2 != null) {
                        animatedArrowDrawable2.setAnimationProgress(0.0f);
                    }
                }
                hh.f fVar3 = this.h5;
                if (fVar3 != null) {
                    ((hh.i) fVar3).h(i11);
                }
            }
            fe feVar = this.S0;
            if (feVar != null) {
                if (this.z3) {
                    feVar.setContentDescription(org.telegram.messenger.cd.L0(2131754893, "AccDescrCollapsePanel"));
                } else {
                    feVar.setContentDescription(org.telegram.messenger.cd.L0(2131754883, "AccDescrExpandPanel"));
                }
            }
        }
    }

    public final ValueAnimator m(boolean z10) {
        final float alpha = getSendButtonInternal().getAlpha();
        final float f7 = z10 ? 1.0f : 0.0f;
        final float scaleX = getSendButtonInternal().getScaleX();
        final float f10 = z10 ? 1.0f : 0.1f;
        final float scaleY = getSendButtonInternal().getScaleY();
        final float f11 = z10 ? 1.0f : 0.1f;
        if (z10 && alpha < 0.25f && (getSendButtonInternal() instanceof zf)) {
            zf zfVar = (zf) getSendButtonInternal();
            zfVar.e0.e(true, 0.0f);
            zfVar.invalidate();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.ed
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i10 = ChatActivityEnterView.s5;
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                chatActivityEnterView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.getSendButtonInternal().setAlpha(org.telegram.messenger.i0.T1(alpha, f7, floatValue));
                chatActivityEnterView.getSendButtonInternal().setScaleX(org.telegram.messenger.i0.T1(scaleX, f10, floatValue));
                chatActivityEnterView.getSendButtonInternal().setScaleY(org.telegram.messenger.i0.T1(scaleY, f11, floatValue));
            }
        });
        return ofFloat;
    }

    public void m0(boolean z10) {
        if (this.G1 == null || !this.f3) {
            return;
        }
        tc tcVar = this.V;
        if (tcVar != null) {
            org.telegram.messenger.i0.r(tcVar);
        }
        this.f3 = false;
        this.g3 = false;
        if (this.h3) {
            this.k5.a(false, z10);
        }
    }

    public final void m1(boolean z10, boolean z11) {
        if (this.v4 == z10 && z11) {
            return;
        }
        ImageView imageView = this.w1;
        if (imageView == null) {
            if (!z10 && !this.p5) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = new ImageView(getContext());
                this.w1 = imageView2;
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                ImageView imageView3 = this.w1;
                int i10 = org.telegram.ui.ActionBar.t6.Kl;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                org.telegram.ui.ActionBar.p6 p6Var = this.W3;
                org.telegram.ui.ActionBar.a7.t(imageView3, i10, p6Var, mode);
                this.w1.setImageResource(R.drawable.input_suggest_paid_24);
                ImageView imageView4 = this.w1;
                int i11 = org.telegram.ui.ActionBar.t6.i6;
                org.telegram.ui.ActionBar.a7.R(imageView4, org.telegram.ui.ActionBar.t6.h0(e0(i11), 1, -1), null, org.telegram.ui.ActionBar.a7.N(i11), p6Var);
                if (this.p5) {
                    this.w1.setTranslationX(org.telegram.messenger.i0.L(42.0f));
                    this.z1.addView(this.w1, w7.b6.d(44, 44.0f, 85, 0.0f, 0.0f, 50.0f, 0.0f));
                } else {
                    this.p1.addView(this.w1, 0, w7.b6.o(44, 44));
                }
                this.w1.setOnClickListener(new vc(this, 19));
                this.w1.setContentDescription(org.telegram.messenger.cd.L0(2131754921, null));
            }
        }
        boolean z12 = this.v4 != z10;
        this.v4 = z10;
        float f7 = z10 ? 1.0f : 0.6f;
        float f10 = z10 ? 1.0f : 0.0f;
        this.w1.setEnabled(z10);
        this.w1.setClickable(z10);
        ValueAnimator valueAnimator = this.w4;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.w4 = null;
        }
        if (z11) {
            if (this.p5) {
                this.w1.setVisibility(0);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.w1.getAlpha(), f10);
            this.w4 = ofFloat;
            ofFloat.addUpdateListener(new sc(this, 7));
            this.w4.addListener(new ge(this, z10, r3));
            this.w4.setDuration(220L);
            this.w4.setInterpolator(gr.h);
            this.w4.start();
        } else {
            this.w1.setScaleX(f7);
            this.w1.setScaleY(f7);
            this.w1.setAlpha(f10);
            if (this.p5) {
                this.w1.setVisibility(z10 ? 0 : 8);
            }
        }
        G1(this.P4);
        if (z12) {
            F(true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        if ((r4.getLineRight(0) + r3) >= ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight())) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n0() {
        se seVar = this.E0;
        if (seVar != null) {
            if (TextUtils.isEmpty(seVar.getCaption())) {
                se seVar2 = this.E0;
                int L = org.telegram.messenger.i0.L(44.0f);
                Layout layout = seVar2.getLayout();
                if (layout != null) {
                    if (layout.getLineCount() > 0) {
                        if (layout.getLineCount() <= 1) {
                        }
                    }
                }
            }
        }
        return org.telegram.messenger.cd.X;
    }

    public final void n1(boolean z10) {
        org.telegram.ui.un unVar;
        int i10 = 0;
        boolean z11 = ((!z10 && !this.D1) || (unVar = this.P2) == null || unVar.z()) ? false : true;
        if (this.K4 == z11) {
            return;
        }
        if (z11) {
            org.telegram.messenger.vp.r1(this.Q).Q1().b();
        }
        this.K4 = z11;
        ImageView imageView = this.t1;
        imageView.setVisibility(0);
        imageView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).setInterpolator(gr.h).setDuration(420L).withEndAction(new bd(this, z11, i10)).start();
        if (!z11) {
            vh.p2 p2Var = this.M;
            if (p2Var != null) {
                p2Var.e(true);
                this.M = null;
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.y2 y2Var = this.s1;
        Objects.requireNonNull(y2Var);
        imageView.postDelayed(new j0(y2Var, 1), 220L);
        vh.p2 p2Var2 = this.M;
        if (p2Var2 != null) {
            p2Var2.e(true);
            this.M = null;
        }
        if (org.telegram.messenger.vp.d1().getInt("aihintshown", 0) < 3) {
            vh.p2 p2Var3 = new vh.p2(getContext(), 3);
            this.M = p2Var3;
            p2Var3.p(true);
            this.M.s(org.telegram.messenger.cd.L0(2131754992, null));
            this.M.m(0.0f, (imageView.getWidth() / 2.0f) + org.telegram.messenger.i0.L(4.0f));
            addView(this.M, w7.b6.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
            vh.p2 p2Var4 = this.M;
            p2Var4.l0 = new cd(i10, this, p2Var3);
            p2Var4.d = 4000L;
            p2Var4.u();
            org.telegram.messenger.vp.d1().edit().putInt("aihintshown", org.telegram.messenger.vp.d1().getInt("aihintshown", 0) + 1).apply();
        }
    }

    public final void o(org.telegram.messenger.oz ozVar) {
        sf sfVar = this.Z2;
        if (sfVar != null) {
            ozVar.H = sfVar.P0();
            ozVar.J = this.Z2.b0();
        }
    }

    public final boolean o0() {
        return this.Z1 != null;
    }

    public final void o1() {
        org.telegram.ui.un unVar = this.P2;
        if (unVar == null || !org.telegram.messenger.w3.V(unVar.e)) {
            return;
        }
        cc.a0(unVar).f(org.telegram.messenger.vp.r1(this.Q).V4, new tc(this, 3)).j();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ie ieVar = this.q0;
        if (ieVar != null) {
            ieVar.e = false;
            ieVar.dismiss();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        a0(canvas, true);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View X;
        if (this.F2) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0 && (X = org.telegram.messenger.i0.X(this, motionEvent.getX(), motionEvent.getY())) != this.L && X != this.M) {
            h0();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        qe qeVar;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.Z4 == -1 || (qeVar = this.m0) == null) {
            return;
        }
        s4.a0 a0Var = (s4.a0) qeVar.c.getLayoutManager();
        if (a0Var != null) {
            a0Var.h1(this.Z4, this.a5);
        }
        this.Z4 = -1;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        pd pdVar = this.z1;
        int measuredHeight = pdVar.getMeasuredHeight();
        xh.w wVar = this.l0;
        ImageView imageView = this.R0;
        rd rdVar = this.Q0;
        int i12 = 0;
        if (wVar == null || wVar.getTag() == null) {
            do0 do0Var = this.p0;
            if (do0Var == null || do0Var.getVisibility() != 0) {
                ((ViewGroup.MarginLayoutParams) rdVar.getLayoutParams()).leftMargin = org.telegram.messenger.i0.L(3.0f);
                if (imageView != null) {
                    ((ViewGroup.MarginLayoutParams) imageView.getLayoutParams()).leftMargin = org.telegram.messenger.i0.L(3.0f);
                }
                se seVar = this.E0;
                if (seVar != null) {
                    ((ViewGroup.MarginLayoutParams) seVar.getLayoutParams()).leftMargin = org.telegram.messenger.i0.L(50.0f);
                }
                org.telegram.messenger.lu luVar = this.C1;
                if (luVar != null) {
                    ((ViewGroup.MarginLayoutParams) luVar.getLayoutParams()).leftMargin = org.telegram.messenger.i0.L(50.0f);
                }
            } else {
                int i13 = this.p0.getLayoutParams().width;
                this.p0.measure(View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.p0.getLayoutParams().height, TLObject.FLAG_30));
                ((ViewGroup.MarginLayoutParams) rdVar.getLayoutParams()).leftMargin = org.telegram.messenger.i0.L(7.0f) + i13;
                if (imageView != null) {
                    ((ViewGroup.MarginLayoutParams) imageView.getLayoutParams()).leftMargin = org.telegram.messenger.i0.L(7.0f) + i13;
                }
                se seVar2 = this.E0;
                if (seVar2 != null) {
                    ((ViewGroup.MarginLayoutParams) seVar2.getLayoutParams()).leftMargin = org.telegram.messenger.i0.L(54.0f) + i13;
                }
                org.telegram.messenger.lu luVar2 = this.C1;
                if (luVar2 != null) {
                    ((ViewGroup.MarginLayoutParams) luVar2.getLayoutParams()).leftMargin = org.telegram.messenger.i0.L(54.0f) + i13;
                }
            }
        } else {
            this.l0.measure(i10, i11);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) rdVar.getLayoutParams();
            int L = org.telegram.messenger.i0.L(10.0f);
            xh.w wVar2 = this.l0;
            marginLayoutParams.leftMargin = L + (wVar2 == null ? 0 : wVar2.getMeasuredWidth());
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int L2 = org.telegram.messenger.i0.L(10.0f);
                xh.w wVar3 = this.l0;
                marginLayoutParams2.leftMargin = L2 + (wVar3 == null ? 0 : wVar3.getMeasuredWidth());
            }
            se seVar3 = this.E0;
            if (seVar3 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) seVar3.getLayoutParams();
                int L3 = org.telegram.messenger.i0.L(57.0f);
                xh.w wVar4 = this.l0;
                marginLayoutParams3.leftMargin = L3 + (wVar4 == null ? 0 : wVar4.getMeasuredWidth());
            }
            org.telegram.messenger.lu luVar3 = this.C1;
            if (luVar3 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) luVar3.getLayoutParams();
                int L4 = org.telegram.messenger.i0.L(57.0f);
                xh.w wVar5 = this.l0;
                marginLayoutParams4.leftMargin = L4 + (wVar5 == null ? 0 : wVar5.getMeasuredWidth());
            }
        }
        B1();
        super.onMeasure(i10, i11);
        xh.a3 a3Var = this.k0;
        if (a3Var != null) {
            xh.w wVar6 = this.l0;
            if (wVar6 != null) {
                a3Var.setMeasuredButtonWidth(wVar6.getMeasuredWidth());
            }
            this.k0.getLayoutParams().height = getMeasuredHeight() - org.telegram.messenger.i0.L(2.0f);
            measureChild(this.k0, i10, i11);
        }
        H();
        I();
        if (measuredHeight <= 0 || pdVar.getMeasuredHeight() == measuredHeight) {
            return;
        }
        while (i12 < 2) {
            ImageView imageView2 = i12 == 0 ? this.t1 : this.u1;
            imageView2.setTranslationY((imageView2.getTranslationY() + pdVar.getMeasuredHeight()) - measuredHeight);
            imageView2.animate().translationY(0.0f).setInterpolator(gr.h).setDuration(420L).start();
            i12++;
        }
        vh.p2 p2Var = this.M;
        if (p2Var != null) {
            p2Var.setTranslationY((p2Var.getTranslationY() + pdVar.getMeasuredHeight()) - measuredHeight);
            org.telegram.messenger.z20.m(this.M.animate().translationY(0.0f), gr.h, 420L);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12 && this.z3) {
            k1(0, false);
            this.U0.t(false);
            l1(false, false, false, true);
        }
        j71 j71Var = this.f1;
        if (j71Var != null) {
            ArrayList arrayList = j71Var.w;
            if (j71Var.N.isEmpty()) {
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    Bitmap bitmap = (Bitmap) arrayList.get(i14);
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                }
            }
            arrayList.clear();
            g71 g71Var = j71Var.x;
            if (g71Var != null) {
                g71Var.cancel(true);
                j71Var.x = null;
            }
            j71Var.invalidate();
        }
    }

    public boolean p() {
        return false;
    }

    public final boolean p0() {
        return this.c1;
    }

    public boolean p1(Runnable runnable) {
        return false;
    }

    public final void q() {
        if (this.U0.getParent() == null) {
            if (this.h5 == null) {
                this.n1.addView(this.U0);
            } else {
                this.n1.addView(this.U0, w7.b6.c(-1.0f, -1));
            }
        }
    }

    public final boolean q0() {
        return this.W0 || this.X0;
    }

    public final void q1() {
        r1(1, 0, true, true);
    }

    public final boolean r() {
        xh.w wVar = this.l0;
        return wVar != null && wVar.w;
    }

    public final boolean r0(View view) {
        return view == this.H1 || view == this.U0;
    }

    public final void r1(int i10, int i11, boolean z10, boolean z11) {
        int i12;
        boolean z12;
        boolean z13;
        int i13;
        ViewGroup viewGroup;
        int i14;
        float f7;
        if (i10 == 2) {
            return;
        }
        e2.f fVar = this.L3;
        ee eeVar = this.Y3;
        Property property = View.TRANSLATION_Y;
        boolean z14 = false;
        if (i10 == 1) {
            if (i11 == 0) {
                if (this.O2 == null && this.U0 == null) {
                    return;
                } else {
                    Q();
                }
            }
            if (i11 == 0) {
                q();
                if (this.W0) {
                    this.U0.getVisibility();
                }
                this.U0.setVisibility(0);
                this.W0 = true;
                df dfVar = this.H1;
                if (dfVar == null || dfVar.getVisibility() == 8) {
                    i13 = 0;
                } else {
                    this.H1.setVisibility(8);
                    this.X0 = false;
                    i13 = this.H1.getMeasuredHeight();
                }
                this.U0.setShowing(true);
                viewGroup = this.U0;
                this.o3 = 0;
            } else if (i11 == 1) {
                if (this.X0) {
                    this.H1.getVisibility();
                }
                this.X0 = true;
                gf gfVar = this.U0;
                if (gfVar == null || gfVar.getVisibility() == 8) {
                    i14 = 0;
                } else {
                    this.n1.removeView(this.U0);
                    this.U0.setVisibility(8);
                    this.U0.setShowing(false);
                    this.W0 = false;
                    i14 = this.U0.getMeasuredHeight();
                }
                this.H1.setVisibility(0);
                ViewGroup viewGroup2 = this.H1;
                this.o3 = 1;
                org.telegram.messenger.vp.r1(this.Q).f7.edit().remove("closed_botkeyboard_" + getTopicKeyString()).apply();
                i13 = i14;
                viewGroup = viewGroup2;
            } else {
                i13 = 0;
                viewGroup = null;
            }
            this.f2 = i11;
            if (this.x2 <= 0) {
                f7 = 200.0f;
                this.x2 = org.telegram.messenger.vp.c1().getInt("kbd_height", org.telegram.messenger.i0.L(200.0f));
            } else {
                f7 = 200.0f;
            }
            if (this.y2 <= 0) {
                this.y2 = org.telegram.messenger.vp.c1().getInt("kbd_height_land3", org.telegram.messenger.i0.L(f7));
            }
            Point point = org.telegram.messenger.i0.q;
            int i15 = point.x > point.y ? this.y2 : this.x2;
            org.telegram.ui.un unVar = this.P2;
            if (unVar != null && unVar.getParentLayout() != null) {
                i15 -= ((ActionBarLayout) unVar.getParentLayout()).v(false);
            }
            if (i11 == 1) {
                i15 = Math.min(this.H1.getKeyboardHeight(), i15);
            }
            df dfVar2 = this.H1;
            if (dfVar2 != null) {
                dfVar2.setPanelHeight(i15);
            }
            if (viewGroup != null && this.h5 == null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
                layoutParams.height = i15;
                viewGroup.setLayoutParams(layoutParams);
            }
            if (!org.telegram.messenger.i0.E) {
                org.telegram.messenger.i0.v1(this.E0);
            }
            uu0 uu0Var = this.m1;
            if (uu0Var != null) {
                this.A2 = i15;
                uu0Var.requestLayout();
                b1(true, true);
                A1(true);
                E0();
                if (this.i2 && !this.z2 && i15 != i13 && z10) {
                    tc tcVar = new tc(this, 11);
                    if (this.w) {
                        this.x = tcVar;
                    } else {
                        AnimatorSet animatorSet = new AnimatorSet();
                        this.V0 = animatorSet;
                        if (this.h5 != null) {
                            animatorSet.playTogether(ValueAnimator.ofFloat(i15 - i13, 0.0f));
                        } else {
                            float f10 = i15 - i13;
                            viewGroup.setTranslationY(f10);
                            this.V0.playTogether(ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) property, f10, 0.0f));
                        }
                        this.V0.setInterpolator(org.telegram.ui.ActionBar.m1.w);
                        this.V0.setDuration(250L);
                        this.V0.addListener(new bg.f(17, this, tcVar));
                        org.telegram.messenger.i0.h3(eeVar, 50L);
                        fVar.d();
                    }
                    requestLayout();
                }
            }
            hh.f fVar2 = this.h5;
            if (fVar2 != null) {
                ((hh.i) fVar2).h(i15);
            }
        } else {
            if (this.Q0 != null) {
                b1(false, true);
            }
            this.f2 = -1;
            gf gfVar2 = this.U0;
            if (gfVar2 != null) {
                if (i10 == 2 && !org.telegram.messenger.i0.D && !org.telegram.messenger.i0.E) {
                    this.G3 = false;
                    sf sfVar = this.Z2;
                    if (sfVar != null) {
                        sfVar.y(0.0f);
                    }
                    this.n1.removeView(this.U0);
                    this.U0 = null;
                } else if (!this.i2 || this.z2 || this.z3) {
                    sf sfVar2 = this.Z2;
                    if (sfVar2 != null) {
                        sfVar2.y(0.0f);
                    }
                    z14 = false;
                    this.A2 = 0;
                    this.n1.removeView(this.U0);
                    this.U0.setVisibility(8);
                    this.U0.setShowing(false);
                } else {
                    this.W0 = true;
                    this.o3 = 0;
                    gfVar2.setShowing(false);
                    ag.d3 d3Var = new ag.d3(this, i10, 28);
                    if (this.w) {
                        z12 = false;
                        this.x = d3Var;
                    } else {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.V0 = animatorSet2;
                        if (this.h5 != null) {
                            z12 = false;
                            animatorSet2.playTogether(ValueAnimator.ofFloat(this.U0.getMeasuredHeight()), ValueAnimator.ofFloat(0.0f, 1.0f));
                        } else {
                            z12 = false;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.U0, (Property<gf, Float>) property, r5.getMeasuredHeight()));
                        }
                        this.V0.setInterpolator(org.telegram.ui.ActionBar.m1.w);
                        this.V0.setDuration(250L);
                        fVar.d();
                        this.V0.addListener(new bg.f(18, this, d3Var));
                    }
                    org.telegram.messenger.i0.h3(eeVar, 50L);
                    requestLayout();
                    z14 = z12;
                }
                this.W0 = z14;
            }
            df dfVar3 = this.H1;
            if (dfVar3 != null && dfVar3.getVisibility() == 0) {
                if (i10 != 2 || org.telegram.messenger.i0.D || org.telegram.messenger.i0.E) {
                    if (this.i2 && !this.z2) {
                        if (this.X0) {
                            this.o3 = 1;
                        }
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        this.V0 = animatorSet3;
                        if (this.h5 != null) {
                            i12 = 0;
                            animatorSet3.playTogether(ValueAnimator.ofFloat(this.H1.getMeasuredHeight()));
                        } else {
                            i12 = 0;
                            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.H1, (Property<df, Float>) property, r5.getMeasuredHeight()));
                        }
                        this.V0.setInterpolator(org.telegram.ui.ActionBar.m1.w);
                        this.V0.setDuration(250L);
                        this.V0.addListener(new mf(this, i10, i12));
                        fVar.d();
                        org.telegram.messenger.i0.h3(eeVar, 50L);
                        requestLayout();
                    } else if (!this.k3) {
                        this.H1.setVisibility(8);
                    }
                }
                this.X0 = false;
            }
            if (i11 == 1 && this.m2 != null) {
                org.telegram.messenger.vp.r1(this.Q).f7.edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.m2.f1()).apply();
            }
            A1(true);
            hh.f fVar3 = this.h5;
            if (fVar3 != null) {
                ((hh.i) fVar3).i(z11);
            }
        }
        if (this.x3 || this.y3) {
            F(true);
        }
        if (!this.z3 || i10 == 1) {
            z13 = false;
        } else {
            z13 = false;
            l1(false, false, false, true);
        }
        F1(z13);
        z();
    }

    public final boolean s() {
        of t10 = t();
        return (TextUtils.equals(t10.a, this.c2.a) && org.telegram.messenger.ui.K(this.c2.b, t10.b)) ? false : true;
    }

    public final boolean s0() {
        return this.F2 && ChatActivityEnterView.this.s4;
    }

    public final void s1() {
        sf sfVar = this.Z2;
        if ((sfVar == null || !sfVar.m()) && org.telegram.messenger.o5.z(this.Q2)) {
            TLRPC.Chat L0 = org.telegram.messenger.vp.r1(this.R.a).L0(Long.valueOf(-this.Q2));
            cc a02 = cc.a0(this.P2);
            StringBuilder sb2 = new StringBuilder();
            if (org.telegram.messenger.w3.p(L0)) {
                sb2.append(org.telegram.messenger.cd.L0(2131745624, null));
            }
            if (org.telegram.messenger.w3.u(L0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.cd.L0(2131745621, null));
            }
            if (org.telegram.messenger.w3.t(L0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.cd.L0(2131745622, null));
            }
            if (org.telegram.messenger.w3.o(L0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.cd.L0(2131745625, null));
            }
            if (org.telegram.messenger.w3.l(L0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.cd.L0(2131745626, null));
            }
            if (org.telegram.messenger.w3.v(L0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.cd.L0(2131745620, null));
            }
            if (org.telegram.messenger.w3.s(L0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.cd.L0(2131745623, null));
            }
            if (org.telegram.messenger.w3.m(L0)) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.cd.L0(2131745627, null));
            }
            a02.G(R.raw.passcode_lock_close, 3, org.telegram.messenger.cd.a0("SendPlainTextRestrictionHint", null, 2131745609, sb2.toString())).j();
        }
    }

    public void setAdjustPanLayoutHelper(org.telegram.ui.ActionBar.m1 m1Var) {
        this.U = m1Var;
    }

    public void setAnimatedTop(int i10) {
        this.T1 = i10;
    }

    public void setBotInfo(a0.h hVar) {
        V0(hVar, true);
    }

    public void setBotWebViewButtonOffsetX(float f7) {
        this.Q0.setTranslationX(f7);
        if (this.E0 != null) {
            this.G = f7;
            I1();
        }
        this.r1.setTranslationX(this.D + this.y + f7);
        this.b1.setTranslationX(f7);
        fe feVar = this.x1;
        if (feVar != null) {
            feVar.setTranslationX(f7);
        }
    }

    public void setButtons(org.telegram.messenger.jj jjVar) {
        X0(jjVar, true, true);
    }

    public void setCaption(String str) {
        se seVar = this.E0;
        if (seVar != null) {
            seVar.setCaption(str);
            F(true);
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.d2 = chatFull;
        gf gfVar = this.U0;
        if (gfVar != null) {
            gfVar.setChatInfo(chatFull);
        }
        ag agVar = this.F0;
        if (agVar != null) {
            agVar.b = chatFull != null && chatFull.boosts_unrestrict > 0;
            agVar.invalidate();
        }
        if (org.telegram.messenger.w3.i0(chatFull)) {
            return;
        }
        setSlowModeTimer(chatFull.slowmode_next_send_date);
    }

    public void setComposeShadowAlpha(float f7) {
        this.C4 = f7;
        invalidate();
    }

    public void setCustomWindowView(View view) {
        this.J4 = view;
        this.E0.setWindowView(view);
    }

    public void setDelegate(sf sfVar) {
        this.Z2 = sfVar;
    }

    public void setEditingBusinessLink(TL_account.TL_businessChatLink tL_businessChatLink) {
        String str;
        this.b2 = tL_businessChatLink;
        F1(false);
        if (this.b2 != null) {
            P(true);
            this.F1.setOnClickListener(new vc(this, 3));
            this.F1.setContentDescription(org.telegram.messenger.cd.L0(2131751355, null));
            this.F1.setVisibility(0);
            this.F1.setScaleX(0.1f);
            this.F1.setScaleY(0.1f);
            this.F1.setAlpha(0.0f);
            this.F1.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(gr.f).start();
            this.c0 = org.telegram.messenger.vp.r1(this.R.a).t1();
            se seVar = this.E0;
            TextPaint paint = seVar != null ? seVar.getPaint() : null;
            if (paint == null) {
                paint = new TextPaint();
                paint.setTextSize(org.telegram.messenger.i0.L(18.0f));
            }
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            ArrayList<TLRPC.MessageEntity> arrayList = this.b2.entities;
            if (arrayList == null || (str = tL_businessChatLink.message) == null) {
                String str2 = tL_businessChatLink.message;
                if (str2 != null) {
                    setFieldText(str2);
                }
            } else {
                setFieldText(n(fontMetricsInt, str, arrayList));
            }
            this.c2 = t();
            T0(false, false, false);
            getSendButtonInternal().setVisibility(8);
            setSlowModeButtonVisible(false);
            this.P0.setVisibility(8);
            this.Z0.setVisibility(8);
            jg.z2 z2Var = this.p1;
            if (z2Var != null) {
                z2Var.setVisibility(8);
            }
            ag.r rVar = this.r1;
            if (rVar != null) {
                this.v1 = 0.0f;
                rVar.setAlpha(0.0f);
                rVar.setScaleX(0.5f);
                rVar.setScaleY(0.5f);
            }
            this.A1.setVisibility(8);
            de deVar = this.J1;
            if (deVar != null) {
                deVar.setVisibility(8);
            }
        }
    }

    public void setEffectId(long j10) {
        this.S4 = j10;
        be beVar = this.J0;
        if (beVar != null) {
            beVar.setEffect(j10);
        }
    }

    public void setExitTransition(float f7) {
        this.m4 = f7;
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setFieldFocused(boolean z10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.O2.getSystemService("accessibility");
        if (this.E0 == null || accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        if (z10 && org.telegram.ui.ActionBar.k2.hasSheets(this.P2)) {
            z10 = false;
        }
        if (z10) {
            if (this.R1 != 0 || this.E0.isFocused()) {
                return;
            }
            tc tcVar = new tc(this, 6);
            this.S1 = tcVar;
            org.telegram.messenger.i0.h3(tcVar, 600L);
            return;
        }
        se seVar = this.E0;
        if (seVar == null || !seVar.isFocused()) {
            return;
        }
        if (!this.z2 || this.j2) {
            this.E0.clearFocus();
        }
    }

    @Override // org.telegram.ui.Components.qx0
    public void setFieldText(CharSequence charSequence) {
        d1(charSequence, false);
    }

    public void setInAppInsetsController(hh.f fVar) {
        this.h5 = fVar;
    }

    public void setLockAnimatedTranslation(float f7) {
        this.l4 = f7;
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setOnSendButtonLongClick(View.OnLongClickListener onLongClickListener) {
        if (onLongClickListener == null) {
            onLongClickListener = new zc(this, 0);
        }
        this.J0.setOnLongClickListener(onLongClickListener);
    }

    public void setOverrideHint(CharSequence charSequence) {
        h1(charSequence, false);
    }

    public void setOverrideKeyboardAnimation(boolean z10) {
        this.w = z10;
    }

    public void setRichDraftPreview(TL_iv.RichMessage richMessage) {
        if (this.C1 == null) {
            return;
        }
        org.telegram.messenger.vp.r1(this.Q);
        boolean z10 = org.telegram.messenger.v2.a;
        this.E1 = richMessage;
        M1();
    }

    public void setRoundVideoUiFrameClockActive(boolean z10) {
        if (this.j1 == z10) {
            return;
        }
        this.j1 = z10;
        bg bgVar = this.Y0;
        if (bgVar != null) {
            bgVar.setExternalFrameClock(z10);
        }
        yf yfVar = this.l1;
        if (yfVar != null) {
            yfVar.n = z10;
            yfVar.b = System.currentTimeMillis();
            yfVar.r = -1L;
            yfVar.invalidate();
        }
        SlideTextView slideTextView = this.k1;
        if (slideTextView != null) {
            slideTextView.J = z10;
            slideTextView.D = System.currentTimeMillis();
            slideTextView.invalidate();
        }
    }

    public void setSelection(int i10) {
        se seVar = this.E0;
        if (seVar == null) {
            return;
        }
        seVar.setSelection(i10, seVar.length());
    }

    public void setSideButtonsForAttach(bh.k kVar) {
        jg.z2 z2Var;
        bh.k kVar2 = this.i5;
        if (kVar2 == kVar) {
            return;
        }
        if (kVar2 != null) {
            kVar2.e(0, false, true);
        }
        this.i5 = kVar;
        ag.r rVar = this.r1;
        if (rVar == null || (z2Var = this.p1) == null || z2Var.getVisibility() == 0) {
            return;
        }
        boolean z10 = kVar != null && n0();
        boolean z11 = (kVar == null || z10) ? false : true;
        if (kVar != null) {
            kVar.e(0, z10, true);
        }
        ViewPropertyAnimator viewPropertyAnimator = this.q1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator animate = rVar.animate();
        float f7 = z11 ? 1.0f : 0.0f;
        this.v1 = f7;
        ViewPropertyAnimator duration = animate.alpha(f7).scaleX(z11 ? 1.0f : 0.5f).scaleY(z11 ? 1.0f : 0.5f).setInterpolator(gr.h).setDuration(320L);
        this.q1 = duration;
        duration.start();
    }

    public void setSlideToCancelProgress(float f7) {
        this.j4 = f7;
        float measuredWidth = getMeasuredWidth() * 0.35f;
        if (measuredWidth > org.telegram.messenger.i0.L(140.0f)) {
            measuredWidth = org.telegram.messenger.i0.L(140.0f);
        }
        this.t4 = (int) ((1.0f - this.j4) * (-measuredWidth));
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setSlowModeTimer(int i10) {
        this.G0 = i10;
        R1();
    }

    public void setSnapAnimationProgress(float f7) {
        this.n4 = f7;
        invalidate();
    }

    public void setTextTransitionIsRunning(boolean z10) {
        this.h0 = z10;
        this.A1.invalidate();
    }

    public void setViewParentForEmoji(ViewGroup viewGroup) {
        this.n1 = viewGroup;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        this.I4 = z10;
        se seVar = this.E0;
        if (seVar != null) {
            seVar.setEnabled(z10);
        }
    }

    public void setVoiceDraft(org.telegram.messenger.pi piVar) {
        org.telegram.messenger.sw swVar;
        TL_stories.StoryItem storyItem;
        File file;
        String str;
        if (piVar == null) {
            return;
        }
        boolean z10 = piVar.g;
        this.O = z10;
        wf wfVar = this.O1;
        if (wfVar != null) {
            wfVar.D.d(1, z10, true);
        }
        sf sfVar = this.Z2;
        if (sfVar != null) {
            storyItem = sfVar.P0();
            swVar = null;
        } else {
            swVar = null;
            storyItem = null;
        }
        MediaController B = MediaController.B();
        int i10 = this.Q;
        long j10 = this.Q2;
        org.telegram.messenger.jj jjVar = this.T2;
        org.telegram.messenger.jj threadMessage = getThreadMessage();
        int i11 = this.G2;
        org.telegram.ui.un unVar = this.P2;
        if (unVar != null) {
            swVar = unVar.P8();
        }
        long sendMonoForumPeerId = getSendMonoForumPeerId();
        org.telegram.messenger.oj sendMessageSuggestionParams = getSendMessageSuggestionParams();
        org.telegram.messenger.r5 r5Var = B.L1;
        if (B.G1) {
            e0.h hVar = B.E1;
            if (hVar != null && hVar.e() && B.e1 != null && (file = B.i1) != null && (str = piVar.a) != null && str.equals(file.getAbsolutePath())) {
                B.f1 = i11;
                B.p1 = jjVar;
                B.q1 = threadMessage;
                B.r1 = storyItem;
                B.s1 = swVar;
                B.n1 = sendMonoForumPeerId;
                B.o1 = sendMessageSuggestionParams;
                org.telegram.messenger.zs.f(B.g1).k(org.telegram.messenger.zs.o2, new Object[0]);
                org.telegram.messenger.zs.f(B.g1).k(org.telegram.messenger.zs.s2, Integer.valueOf(B.f1), B.e1, B.i1.getAbsolutePath(), Boolean.TRUE, Float.valueOf(piVar.h), Float.valueOf(piVar.i));
                return;
            }
            if (!B.X()) {
                return;
            }
        }
        B.x0 = false;
        B.Y(true);
        r5Var.a(B.K1);
        r5Var.c(new org.telegram.messenger.rd(B, i11, piVar, i10, j10, sendMonoForumPeerId, sendMessageSuggestionParams, threadMessage, jjVar, storyItem));
    }

    public final of t() {
        se seVar = this.E0;
        CharSequence[] charSequenceArr = {org.telegram.messenger.i0.n1(seVar == null ? "" : seVar.getTextToUse())};
        ArrayList W = org.telegram.messenger.ui.b0(this.Q).W(charSequenceArr, true, true);
        CharSequence charSequence = charSequenceArr[0];
        int size = W.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) W.get(i10);
            if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                messageEntity.length = charSequence.length() - messageEntity.offset;
            }
        }
        of ofVar = new of();
        ofVar.a = charSequence.toString();
        ofVar.b = W;
        return ofVar;
    }

    public final boolean t0() {
        if (this.F2) {
            return true;
        }
        AnimatorSet animatorSet = this.t2;
        return (animatorSet == null || !animatorSet.isRunning() || this.k2) ? false : true;
    }

    public final void t1(boolean z10) {
        org.telegram.ui.un unVar;
        boolean z11;
        int i10 = 1;
        if ((this.D1 || z10) && (unVar = this.P2) != null && !unVar.z() && this.Z1 == null) {
            org.telegram.messenger.vp.r1(this.Q);
            boolean z12 = org.telegram.messenger.v2.a;
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.L4 == z11) {
            return;
        }
        this.L4 = z11;
        ImageView imageView = this.u1;
        imageView.setVisibility(0);
        imageView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f).setInterpolator(gr.h).setDuration(420L).withEndAction(new bd(this, z11, i10)).start();
    }

    public final float u(boolean z10) {
        fe.f fVar = this.j5;
        float f7 = z10 ? fVar.h ? fVar.g : fVar.f : fVar.f;
        fe.b bVar = this.k5;
        return ((this.G1 != null ? r1.getMeasuredHeight() : 0) * (z10 ? bVar.f ? 1.0f : 0.0f : bVar.e)) + f7;
    }

    public final void u1() {
        v1(true, false);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        TextPaint textPaint;
        org.telegram.ui.ActionBar.p6 p6Var = this.W3;
        try {
            se seVar = this.E0;
            if (seVar != null) {
                org.telegram.ui.ActionBar.a7.m(seVar, 34, org.telegram.ui.ActionBar.t6.Je, p6Var);
                org.telegram.ui.ActionBar.a7.w(this.E0, org.telegram.ui.ActionBar.t6.Ke, p6Var);
                org.telegram.ui.ActionBar.a7.z(this.E0, org.telegram.ui.ActionBar.t6.jg, p6Var);
            }
            Paint paint = this.Q1;
            if (paint != null) {
                paint.setColor(e0(org.telegram.ui.ActionBar.t6.Pf));
            }
            ag agVar = this.F0;
            if (agVar != null) {
                ((org.telegram.ui.ActionBar.u5) agVar.c).setTextColor(e0(org.telegram.ui.ActionBar.t6.Kl));
                agVar.invalidate();
            }
            AnimatedArrowDrawable animatedArrowDrawable = this.F3;
            if (animatedArrowDrawable != null) {
                animatedArrowDrawable.a.setColor(e0(org.telegram.ui.ActionBar.t6.Kl));
                animatedArrowDrawable.invalidateSelf();
            }
            be beVar = this.J0;
            if (beVar != null && this.K0 != 0 && beVar.getBackground() != null) {
                int e02 = e0((this.G0 != Integer.MAX_VALUE || v0()) ? org.telegram.ui.ActionBar.t6.Me : org.telegram.ui.ActionBar.t6.Kl);
                if (e02 != this.K0) {
                    this.K0 = e02;
                    org.telegram.ui.ActionBar.t6.H1(beVar.getBackground(), Color.argb(24, Color.red(e02), Color.green(e02), Color.blue(e02)), true);
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        L1();
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.e();
        }
        yf yfVar = this.l1;
        if (yfVar != null) {
            yfVar.b();
        }
        SlideTextView slideTextView = this.k1;
        if (slideTextView != null) {
            slideTextView.a();
        }
        bg bgVar = this.Y0;
        if (bgVar != null && (textPaint = bgVar.F) != null) {
            textPaint.setColor(bgVar.I.e0(org.telegram.ui.ActionBar.t6.bg));
        }
        j71 j71Var = this.f1;
        if (j71Var != null) {
            j71Var.e.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.a7, false));
            j71Var.L = 0;
            h71 h71Var = j71Var.P;
            if (h71Var != null) {
                h71Var.b();
            }
        }
        NumberTextView numberTextView = this.b0;
        if (numberTextView != null && this.E0 != null) {
            if (this.d0 - this.c0 < 0) {
                numberTextView.setTextColor(e0(org.telegram.ui.ActionBar.t6.p7));
            } else {
                numberTextView.setTextColor(e0(org.telegram.ui.ActionBar.t6.y6));
            }
        }
        Color.alpha(e0(org.telegram.ui.ActionBar.t6.Qf));
        qe qeVar = this.m0;
        if (qeVar != null) {
            qeVar.d.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.wj, false));
            vg.f fVar = qeVar.r;
            if (fVar != null) {
                fVar.updateColors();
            }
            qeVar.invalidate();
        }
        df dfVar = this.H1;
        if (dfVar != null) {
            dfVar.e();
        }
        int e03 = this.a1 ? e0(org.telegram.ui.ActionBar.t6.Kl) : -1;
        zd zdVar = this.b1;
        if (zdVar != null && (!this.V4 || e03 != this.T4)) {
            this.V4 = true;
            this.T4 = e03;
            zdVar.setColorFilter(new PorterDuffColorFilter(e03, PorterDuff.Mode.SRC_IN));
        }
        int e04 = e0(org.telegram.ui.ActionBar.t6.i6);
        if (this.W4 && e04 == this.U4) {
            return;
        }
        this.W4 = true;
        this.U4 = e04;
        rd rdVar = this.Q0;
        if (rdVar != null) {
            rdVar.setBackground(org.telegram.ui.ActionBar.t6.h0(e04, 1, -1));
        }
        ImageView imageView = this.R0;
        if (imageView != null) {
            float L = org.telegram.messenger.i0.L(19.0f);
            int L2 = org.telegram.messenger.i0.L(1.0f);
            int L3 = org.telegram.messenger.i0.L(3.0f);
            imageView.setBackground(org.telegram.ui.ActionBar.t6.Y(L, e04, L2, L3, L2, L3));
        }
    }

    @Override // fe.e
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        if (i10 == 0) {
            H();
            I();
        } else if (i10 == 1) {
            H();
            I();
        } else {
            if (i10 == 2) {
                org.telegram.ui.Wallet.b5 b5Var = this.I0;
                b5Var.setAlpha(f7);
                b5Var.setScaleX(org.telegram.messenger.i0.T1(0.5f, 1.0f, f7));
                b5Var.setScaleY(org.telegram.messenger.i0.T1(0.5f, 1.0f, f7));
                b5Var.setVisibility(f7 <= 0.0f ? 4 : 0);
            } else if (i10 == 3) {
                float T1 = org.telegram.messenger.i0.T1(1.0f, 0.79f, f7);
                pd pdVar = this.A1;
                pdVar.setScaleX(T1);
                pdVar.setScaleY(org.telegram.messenger.i0.T1(1.0f, 0.79f, f7));
                float T12 = org.telegram.messenger.i0.T1(0.79f, 1.0f, f7);
                ImageView imageView = this.B1;
                imageView.setScaleX(T12);
                imageView.setScaleY(org.telegram.messenger.i0.T1(0.79f, 1.0f, f7));
                imageView.setVisibility(f7 <= 0.0f ? 8 : 0);
                imageView.setAlpha(f7);
                be beVar = this.J0;
                if (beVar != null) {
                    beVar.setSameWidthFactor(f7);
                }
            }
        }
        invalidate();
    }

    public final boolean v0() {
        return c() || this.m5.f;
    }

    public final void v1(boolean z10, boolean z11) {
        if (this.G1 == null || this.f3 || getVisibility() != 0) {
            pd pdVar = this.e1;
            if ((pdVar == null || pdVar.getVisibility() != 0) && !this.H2 && this.V2 == null && this.T2 == null) {
                F0();
                return;
            }
            return;
        }
        pd pdVar2 = this.e1;
        boolean z12 = (pdVar2 == null || pdVar2.getVisibility() != 0) && !this.H2 && this.V2 == null && (this.n2 == null || this.Z1 != null);
        if (!z11 && z10 && z12 && !this.z2 && !q0()) {
            F0();
            tc tcVar = this.V;
            if (tcVar != null) {
                org.telegram.messenger.i0.r(tcVar);
            }
            tc tcVar2 = new tc(this, 24);
            this.V = tcVar2;
            org.telegram.messenger.i0.h3(tcVar2, 200L);
            return;
        }
        this.g3 = true;
        this.f3 = true;
        if (this.h3) {
            this.k5.a(true, z10);
            if (z12) {
                se seVar = this.E0;
                if (seVar != null) {
                    seVar.requestFocus();
                }
                F0();
            }
        }
    }

    public final void w() {
        org.telegram.ui.Cells.a5 a5Var = this.d1;
        if (a5Var != null) {
            a5Var.setVisibility(8);
        }
        RecordCircle recordCircle = this.N1;
        if (recordCircle != null) {
            recordCircle.setVisibility(8);
        }
        this.t2 = null;
        u0();
        if (this.p1 != null) {
            this.y = 0.0f;
            z1();
        }
        SlideTextView slideTextView = this.k1;
        if (slideTextView != null) {
            slideTextView.setCancelToProgress(0.0f);
        }
        this.Z2.e();
        O1(true);
    }

    public final boolean w0() {
        return this.z3;
    }

    public final void w1() {
        AnimatorSet animatorSet = new AnimatorSet();
        try {
            performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "lockAnimatedTranslation", this.k4);
        ofFloat.setStartDelay(100L);
        ofFloat.setDuration(350L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "snapAnimationProgress", 1.0f);
        ofFloat2.setInterpolator(gr.h);
        ofFloat2.setDuration(250L);
        int i10 = org.telegram.messenger.tz.a;
        SharedPreferences.Editor edit = org.telegram.messenger.vp.d1().edit();
        edit.putInt("lockRecordAudioVideoHint", 3);
        edit.apply();
        animatorSet.playTogether(ofFloat2, ofFloat, ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f).setDuration(200L), ObjectAnimator.ofFloat(this.k1, "cancelToProgress", 1.0f));
        animatorSet.start();
    }

    public final void x() {
        if (this.e2 && this.c1) {
            CameraController.getInstance().cancelOnInitRunnable(this.H3);
            this.Z2.V1(5, 0, this.O ? Integer.MAX_VALUE : 0, this.S4, 0L, true);
            this.S4 = 0L;
            this.J0.setEffect(0L);
        } else {
            this.Z2.G0(0);
            MediaController.B().B0(0, 0, false, false);
        }
        this.F2 = false;
        K1(2, true);
    }

    public final boolean x0() {
        View view = this.G1;
        return view != null && view.getVisibility() == 0;
    }

    public final boolean x1() {
        org.telegram.ui.un unVar = this.P2;
        TLRPC.EncryptedChat encryptedChat = unVar != null ? unVar.h : null;
        return encryptedChat == null || org.telegram.messenger.i0.X0(encryptedChat.layer) >= 101;
    }

    public final void y() {
        fe feVar;
        org.telegram.ui.un unVar;
        if (this.L != null || (feVar = this.K1) == null || feVar.getRight() == 0 || (unVar = this.P2) == null || !org.telegram.messenger.y1.d(unVar.q8)) {
            return;
        }
        if (org.telegram.messenger.vp.r1(this.Q).f7.getBoolean(Calendar.getInstance().get(1) + "bdayhint_" + unVar.a(), true)) {
            org.telegram.messenger.vp.r1(this.Q).f7.edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + unVar.a(), false).apply();
            vh.p2 p2Var = new vh.p2(getContext(), 3);
            this.L = p2Var;
            p2Var.q(13.0f);
            this.L.p(true);
            U0();
            this.L.setPadding(org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
            this.L.m(1.0f, -((getWidth() - org.telegram.messenger.i0.L(12.0f)) - ((this.K1.getMeasuredWidth() / 2.0f) + (this.K1.getX() + (this.p1.getX() + this.y1.getX())))));
            addView(this.L, w7.b6.d(-1, 200.0f, 48, 0.0f, -192.0f, 0.0f, 0.0f));
            vh.p2 p2Var2 = this.L;
            p2Var2.l0 = new tc(this, 13);
            p2Var2.d = 8000L;
            p2Var2.u();
        }
    }

    public final void y1() {
        float f7;
        ag.r rVar = this.r1;
        if (rVar == null) {
            return;
        }
        float f10 = this.D + this.y;
        be beVar = this.J0;
        if (beVar != null) {
            f7 = beVar.getAlpha() * (-i0.a.d(56.0f, beVar.l(), 0));
        } else {
            f7 = 0.0f;
        }
        rVar.setTranslationX(f10 + f7);
    }

    public final void z() {
        se seVar = this.E0;
        boolean z10 = ((seVar != null && !TextUtils.isEmpty(seVar.getText())) || this.z2 || this.k3 || q0()) ? false : true;
        if (z10) {
            N();
        }
        xh.w wVar = this.l0;
        if (wVar != null) {
            boolean z11 = wVar.f;
            if (z11 != z10) {
                wVar.f = z10;
                wVar.requestLayout();
                wVar.invalidate();
            }
            if (z11 != this.l0.f) {
                rd rdVar = this.Q0;
                Float valueOf = Float.valueOf(rdVar.getX());
                HashMap hashMap = this.B0;
                hashMap.put(rdVar, valueOf);
                se seVar2 = this.E0;
                if (seVar2 != null) {
                    hashMap.put(seVar2, Float.valueOf(seVar2.getX()));
                }
            }
        }
    }

    public final void z0() {
        nj0 nj0Var = this.h1;
        if (nj0Var != null) {
            nj0Var.Q = true;
            u61 u61Var = nj0Var.n;
            if (u61Var != null) {
                u61Var.u0(false);
                nj0Var.n.m0();
                nj0Var.n = null;
            }
        }
        if (this.h1 != null && this.b3 != null) {
            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(this.Q);
            long j10 = this.Q2;
            org.telegram.ui.un unVar = this.P2;
            long b10 = (unVar == null || !unVar.v4) ? 0L : unVar.b();
            nj0 nj0Var2 = this.h1;
            float audioLeft = nj0Var2 == null ? 0.0f : nj0Var2.getAudioLeft();
            nj0 nj0Var3 = this.h1;
            b02.b2(j10, b10, audioLeft, nj0Var3 == null ? 1.0f : nj0Var3.getAudioRight());
        }
        this.Y1 = true;
        org.telegram.messenger.zs.f(this.Q).n(this, org.telegram.messenger.zs.l2);
        org.telegram.messenger.zs.f(this.Q).n(this, org.telegram.messenger.zs.o2);
        org.telegram.messenger.zs.f(this.Q).n(this, org.telegram.messenger.zs.p2);
        org.telegram.messenger.zs.f(this.Q).n(this, org.telegram.messenger.zs.m2);
        org.telegram.messenger.zs.f(this.Q).n(this, org.telegram.messenger.zs.n2);
        org.telegram.messenger.zs.f(this.Q).n(this, org.telegram.messenger.zs.k2);
        org.telegram.messenger.zs.f(this.Q).n(this, org.telegram.messenger.zs.t);
        org.telegram.messenger.zs.f(this.Q).n(this, org.telegram.messenger.zs.s2);
        org.telegram.messenger.zs.f(this.Q).n(this, org.telegram.messenger.zs.u2);
        org.telegram.messenger.zs.f(this.Q).n(this, org.telegram.messenger.zs.e2);
        org.telegram.messenger.zs.f(this.Q).n(this, org.telegram.messenger.zs.z0);
        org.telegram.messenger.zs.f(this.Q).n(this, org.telegram.messenger.zs.L);
        org.telegram.messenger.zs.f(this.Q).n(this, org.telegram.messenger.zs.n1);
        org.telegram.messenger.zs.f(this.Q).n(this, org.telegram.messenger.zs.t2);
        org.telegram.messenger.zs.f(this.Q).n(this, org.telegram.messenger.zs.R2);
        org.telegram.messenger.zs.f(this.Q).n(this, org.telegram.messenger.zs.Y2);
        org.telegram.messenger.zs.f(this.Q).n(this, org.telegram.messenger.zs.f5);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.i4);
        gf gfVar = this.U0;
        if (gfVar != null) {
            gfVar.C();
        }
        tc tcVar = this.H0;
        if (tcVar != null) {
            org.telegram.messenger.i0.r(tcVar);
            this.H0 = null;
        }
        PowerManager.WakeLock wakeLock = this.q2;
        if (wakeLock != null) {
            try {
                wakeLock.release();
                this.q2 = null;
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
        if (this.w2 != 0 && !this.c1) {
            org.telegram.messenger.i0.g3(new tf(this.O2, 19));
        }
        uu0 uu0Var = this.m1;
        if (uu0Var != null) {
            uu0Var.setDelegate(null);
        }
        ie ieVar = this.q0;
        if (ieVar != null) {
            ieVar.e = false;
            ieVar.dismiss();
        }
    }

    public final void z1() {
        y1();
        jg.z2 z2Var = this.p1;
        if (z2Var != null) {
            z2Var.setTranslationX(this.D + this.y);
            z2Var.setAlpha(this.E * this.F);
            z2Var.setVisibility(z2Var.getAlpha() > 0.0f ? 0 : 8);
            ag.r rVar = this.r1;
            if (rVar != null && this.A4) {
                rVar.setAlpha(this.v1 * this.F);
            }
        }
        de deVar = this.J1;
        if (deVar != null) {
            deVar.setTranslationX(deVar.a);
        }
    }

    @Override // org.telegram.ui.Components.qx0
    public mt getEditField() {
        return this.E0;
    }

    @Override // org.telegram.ui.Components.qx0
    public org.telegram.ui.un getParentFragment() {
        return this.P2;
    }

    public void d0(Menu menu) {
    }

    public void y0(float f7) {
    }

    public void u0() {
    }

    public void A0(int i10, int i11) {
    }

    @Override // fe.e
    public final /* synthetic */ void E(float f7, int i10) {
    }
}
